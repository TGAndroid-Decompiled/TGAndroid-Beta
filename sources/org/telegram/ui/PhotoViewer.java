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
public class PhotoViewer implements org.telegram.messenger.cs, org.telegram.ui.Components.u00, org.telegram.ui.Components.t00, wf.a, qe.b {
    public static Drawable[] V8;
    public static final Paint W8 = new Paint(2);
    public static final HashMap X8 = new HashMap();
    public static DecelerateInterpolator Y8;
    public static Paint Z8;
    public static final Property f41368a9;
    public static volatile PhotoViewer f41369b9;
    public static volatile PhotoViewer f41370c9;
    public org.telegram.ui.ActionBar.c1 A0;
    public org.telegram.ui.Components.d51 A1;
    public View A2;
    public boolean A3;
    public org.telegram.ui.Components.nb0 A4;
    public long A5;
    public float A6;
    public final float[] A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.x B0;
    public org.telegram.ui.Components.tm0 B1;
    public AnimatorSet B2;
    public final int[] B3;
    public org.telegram.ui.Components.nb0 B4;
    public boolean B5;
    public float B6;
    public ObjectAnimator B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.q0 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public boolean C3;
    public ImageReceiver C4;
    public boolean C5;
    public float C6;
    public int C7;
    public boolean C8;
    public org.telegram.ui.ActionBar.q0 D0;
    public org.telegram.ui.Components.ad0 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public int D5;
    public float D6;
    public za.p D7;
    public boolean D8;
    public Activity E;
    public org.telegram.ui.ActionBar.q0 E0;
    public final pg.f E1;
    public boolean E2;
    public Bitmap E3;
    public ImageReceiver E4;
    public long E5;
    public float E6;
    public float E7;
    public String E8;
    public ContextThemeWrapper F;
    public org.telegram.ui.ActionBar.q0 F0;
    public pg.f F1;
    public fq0 F2;
    public ImageView F3;
    public g2.d F4;
    public long F5;
    public float F6;
    public float F7;
    public final org.telegram.ui.Components.u5 F8;
    public org.telegram.ui.Components.p7 G;
    public org.telegram.ui.ActionBar.y0 G0;
    public pg.f G1;
    public org.telegram.ui.Components.m51 G2;
    public boolean G3;
    public g2.d G4;
    public dh.n0 G5;
    public float G6;
    public final xm0 G7;
    public org.telegram.ui.Components.u5[] G8;
    public ImageView H;
    public org.telegram.ui.Components.k7 H0;
    public org.telegram.messenger.re H1;
    public uf.d H2;
    public int H3;
    public g2.d H4;
    public String H5;
    public float H6;
    public Path H7;
    public RectF H8;
    public Drawable I;
    public s51 I0;
    public org.telegram.messenger.re I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean I5;
    public float I6;
    public Paint I7;
    public RectF I8;
    public jh.c J;
    public s51 J0;
    public org.telegram.ui.Components.nd0 J1;
    public Runnable J2;
    public boolean J3;
    public boolean J4;
    public long J5;
    public boolean J6;
    public Paint J7;
    public Matrix J8;
    public boolean K;
    public rq K0;
    public AnimatorSet K1;
    public boolean K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public LinearGradient K7;
    public float[] K8;
    public boolean L;
    public final HashMap L0;
    public gi.p3 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public LinearGradient L7;
    public RenderNode L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public lp0 M1;
    public float M2;
    public boolean M3;
    public boolean M4;
    public int M5;
    public boolean M6;
    public Matrix M7;
    public RenderNode M8;
    public jq0 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public boolean N3;
    public final Matrix N4;
    public boolean N5;
    public int N6;
    public Matrix N7;
    public final eh.a N8;
    public iq0 O;
    public CheckBox O0;
    public kp0 O1;
    public float O2;
    public float O3;
    public final Paint O4;
    public boolean O5;
    public int O6;
    public final int[] O7;
    public final a0.h O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public long P3;
    public Bitmap P4;
    public boolean P5;
    public boolean P6;
    public nq0 P7;
    public boolean P8;
    public boolean Q;
    public ci.t4 Q0;
    public org.telegram.ui.ActionBar.s1 Q1;
    public float Q2;
    public boolean Q3;
    public int Q4;
    public final boolean[] Q5;
    public boolean Q6;
    public org.telegram.ui.Cells.v0 Q7;
    public View Q8;
    public lo0 R;
    public FrameLayout R0;
    public cq0 R1;
    public boolean R2;
    public boolean R3;
    public int R4;
    public boolean R5;
    public boolean R6;
    public RadialProgressView R7;
    public b8.cg R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public int S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public FrameLayout S7;
    public TextureView S8;
    public Paint T;
    public mi.x1 T0;
    public TextView T1;
    public org.telegram.ui.Components.m51 T2;
    public long T3;
    public boolean T4;
    public boolean T5;
    public boolean T6;
    public no0 T7;
    public boolean T8;
    public int U;
    public org.telegram.ui.Components.pd0 U0;
    public mp0 U1;
    public SurfaceTexture U2;
    public View U3;
    public org.telegram.messenger.zi U4;
    public boolean U5;
    public int U6;
    public TextView U7;
    public boolean U8;
    public int V;
    public org.telegram.ui.Cells.v0 V0;
    public qo0 V1;
    public boolean V2;
    public go0 V3;
    public VideoAds V4;
    public boolean V5;
    public VelocityTracker V6;
    public AnimatorSet V7;
    public int W;
    public TextView W0;
    public ro0 W1;
    public boolean W2;
    public int W3;
    public ArrayList W4;
    public boolean W5;
    public Scroller W6;
    public long W7;
    public float X;
    public final mo0[] X0;
    public float X1;
    public boolean X2;
    public org.telegram.ui.Components.st X3;
    public Uri X4;
    public float X5;
    public final ArrayList X6;
    public long X7;
    public xn0 Y;
    public yc Y0;
    public l0 Y1;
    public boolean Y2;
    public int Y3;
    public final dq0 Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public long Y7;
    public eh.c Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public int Z3;
    public TLRPC.BotInlineResult Z4;
    public float Z5;
    public final ArrayList Z6;
    public volatile int Z7;
    public final qe.a f41371a = new qe.a(0, this, org.telegram.ui.Components.xq.h, 380, false);
    public ue.b f41372a0;
    public ImageView f41373a1;
    public FrameLayout f41374a2;
    public boolean f41375a3;
    public boolean f41376a4;
    public org.telegram.messenger.ac f41377a5;
    public float f41378a6;
    public final SparseArray[] f41379a7;
    public volatile int f41380a8;
    public final boolean f41381b;
    public ue.b f41382b0;
    public ImageView f41383b1;
    public org.telegram.ui.Components.bi f41384b2;
    public float f41385b3;
    public final org.telegram.ui.Cells.j1 f41386b4;
    public org.telegram.messenger.ac f41387b5;
    public float f41388b6;
    public final ArrayList f41389b7;
    public int f41390b8;
    public int f41391c;
    public org.telegram.ui.Components.x9 f41392c0;
    public ImageView f41393c1;
    public cg.u0 c2;
    public String f41394c3;
    public final VideoFramesRewinder f41395c4;
    public org.telegram.messenger.wv f41396c5;
    public float f41397c6;
    public final ArrayList f41398c7;
    public int f41399c8;
    public kq0 d;
    public org.telegram.ui.Components.ba f41400d0;
    public ImageView f41401d1;
    public int f41402d2;
    public String f41403d3;
    public final yo0 f41404d4;
    public final String[] f41405d5;
    public float f41406d6;
    public final ArrayList f41407d7;
    public volatile int f41408d8;
    public boolean f41409e;
    public WindowManager.LayoutParams f41410e0;
    public org.telegram.ui.Components.sz f41411e1;
    public boolean f41412e2;
    public long f41413e3;
    public final org.telegram.ui.Cells.f2 f41414e4;
    public mq0 f41415e5;
    public float f41416e6;
    public final ArrayList f41417e7;
    public volatile int f41418e8;
    public boolean f41419f;
    public gq0 f41420f0;
    public org.telegram.ui.ActionBar.e0 f41421f1;
    public boolean f41422f2;
    public float f41423f3;
    public CharSequence f41424f4;
    public String f41425f5;
    public float f41426f6;
    public final ArrayList f41427f7;
    public volatile int f41428f8;
    public tp0 f41429g0;
    public org.telegram.ui.Components.u70 f41430g1;
    public boolean f41431g2;
    public boolean f41432g3;
    public boolean f41433g4;
    public long f41434g5;
    public float f41435g6;
    public final ArrayList g7;
    public volatile int f41436g8;
    public int h;
    public lq0 f41437h0;
    public oo0 f41438h1;
    public boolean f41439h2;
    public long f41440h3;
    public boolean f41441h4;
    public String f41442h5;
    public float f41443h6;
    public final ArrayList h7;
    public volatile int f41444h8;
    public ClippingImageView f41445i0;
    public ArrayList f41446i1;
    public boolean f41447i2;
    public boolean i3;
    public final po0 f41448i4;
    public boolean f41449i5;
    public float f41450i6;
    public org.telegram.messenger.ac f41451i7;
    public volatile int f41452i8;
    public yg0 f41453j0;
    public ArrayList f41454j1;
    public boolean f41455j2;
    public sq0 f41456j3;
    public final po0 f41457j4;
    public TL_iv.PageBlock f41458j5;
    public float f41459j6;
    public oq0 f41460j7;
    public float f41461j8;
    public View f41462k0;
    public org.telegram.ui.Components.z41 k1;
    public org.telegram.ui.Components.t5 f41463k2;
    public String f41464k3;
    public final m50 f41465k4;
    public org.telegram.messenger.cc f41466k5;
    public float f41467k6;
    public hq0 f41468k7;
    public int f41469k8;
    public int f41470l0;
    public gi.l3 f41471l1;
    public boolean f41472l2;
    public ValueAnimator f41473l3;
    public final float[][] f41474l4;
    public boolean f41475l5;
    public float f41476l6;
    public final Rect f41477l7;
    public volatile boolean f41478l8;
    public TextView m0;
    public org.telegram.ui.Components.h20 m1;
    public boolean f41479m2;
    public boolean f41480m3;
    public wm f41481m4;
    public boolean f41482m5;
    public float f41483m6;
    public final g2.g f41484m7;
    public volatile boolean f41485m8;
    public boolean f41486n;
    public TextView f41487n0;
    public org.telegram.ui.Components.c01 f41488n1;
    public boolean f41489n2;
    public final int[] f41490n3;
    public org.telegram.ui.ActionBar.d2 n4;
    public boolean f41491n5;
    public float f41492n6;
    public cg.u0 f41493n7;
    public long f41494n8;
    public TextView f41495o0;
    public UndoView f41496o1;
    public boolean f41497o2;
    public final int[] f41498o3;
    public int f41499o4;
    public boolean f41500o5;
    public long f41501o6;
    public org.telegram.ui.Components.ac f41502o7;
    public long f41503o8;
    public org.telegram.ui.ActionBar.q0 f41504p0;
    public rq0 f41505p1;
    public org.telegram.ui.Components.d30 f41506p2;
    public org.telegram.ui.ActionBar.k5 f41507p3;
    public long f41508p4;
    public String f41509p5;
    public int f41510p6;
    public int f41511p7;
    public float f41512p8;
    public org.telegram.ui.ActionBar.q0 f41513q0;
    public n4 f41514q1;
    public boolean f41515q2;
    public ImageView f41516q3;
    public Runnable f41517q4;
    public ug.c2 f41518q5;
    public AnimatorSet f41519q6;
    public boolean f41520q7;
    public float f41521q8;
    public boolean f41522r;
    public org.telegram.ui.ActionBar.y0 f41523r0;
    public ImageReceiver f41524r1;
    public org.telegram.messenger.po f41525r2;
    public org.telegram.ui.Components.o51 f41526r3;
    public mq0 f41527r4;
    public org.telegram.ui.Components.od0 r5;
    public AnimatorSet f41528r6;
    public CharSequence f41529r7;
    public long f41530r8;
    public boolean f41531s;
    public org.telegram.ui.ActionBar.u0 f41532s0;
    public boolean f41533s1;
    public boolean f41534s2;
    public org.telegram.ui.Components.voip.r0 f41535s3;
    public mq0 f41536s4;
    public ArrayList f41537s5;
    public org.telegram.ui.Components.v00 s6;
    public boolean f41538s7;
    public long f41539s8;
    public org.telegram.ui.ActionBar.y0 f41540t0;
    public final xm0 f41541t1;
    public final Rect f41542t2;
    public ap0 f41543t3;
    public boolean f41544t4;
    public ei.e3 f41545t5;
    public boolean f41546t6;
    public ValueAnimator f41547t7;
    public long f41548t8;
    public org.telegram.ui.ActionBar.y0 f41549u0;
    public float f41550u1;
    public boolean f41551u2;
    public AnimatorSet f41552u3;
    public boolean f41553u4;
    public yp0 f41554u5;
    public final DecelerateInterpolator f41555u6;
    public TLRPC.Document f41556u7;
    public long f41557u8;
    public org.telegram.ui.ActionBar.c1 f41558v0;
    public long f41559v1;
    public boolean f41560v2;
    public boolean f41561v3;
    public int f41562v4;
    public LinearLayout f41563v5;
    public float f41564v6;
    public TLRPC.Document f41565v7;
    public long f41566v8;
    public int f41567w;
    public org.telegram.ui.ActionBar.y0 f41568w0;
    public final GradientDrawable[] f41569w1;
    public org.telegram.ui.ActionBar.e6 f41570w2;
    public int f41571w3;
    public final xm0 f41572w4;
    public yp0 f41573w5;
    public float f41574w6;
    public boolean f41575w7;
    public long f41576w8;
    public AnimatorSet f41577x;
    public tq f41578x0;
    public final boolean[] f41579x1;
    public final jo0 f41580x2;
    public TextureView f41581x3;
    public int f41582x4;
    public yp0 f41583x5;
    public float f41584x6;
    public boolean f41585x7;
    public float f41586x8;
    public final xm0 f41587y;
    public LinearLayout f41588y0;
    public final float[] f41589y1;
    public final po0 f41590y2;
    public ImageView f41591y3;
    public String f41592y4;
    public yp0 f41593y5;
    public float f41594y6;
    public org.telegram.messenger.n10 f41595y7;
    public up0 f41596y8;
    public final ArrayList f41597z0;
    public int f41598z1;
    public org.telegram.ui.Components.zd0 f41599z2;
    public final ImageView[] f41600z3;
    public org.telegram.ui.Components.nb0 f41601z4;
    public yp0 f41602z5;
    public float f41603z6;
    public final float[] f41604z7;
    public org.telegram.messenger.zi f41605z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f41606g = 0;
        public final RectF f41607a;
        public final RectF f41608b;
        public final Paint f41609c;
        public hk0 d;
        public boolean f41610e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f41607a = new RectF();
            this.f41608b = new RectF();
            Paint paint = new Paint(1);
            this.f41609c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            cg.u0 u0Var = photoViewer.f41493n7;
            if (u0Var != null) {
                u0Var.c(!this.f41610e);
            }
            cg.u0 u0Var2 = photoViewer.c2;
            if (u0Var2 != null) {
                u0Var2.c(!this.f41610e);
            }
            org.telegram.ui.Components.bi biVar = photoViewer.f41384b2;
            if (biVar != null) {
                boolean z11 = this.f41610e;
                biVar.f32275t2.m(biVar.f32231g4);
                if (biVar.f32261p4 != z11) {
                    biVar.f32261p4 = z11;
                    org.telegram.ui.Components.th thVar = biVar.f32275t2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
                    if (thVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f31282j1) {
                        if (z11 && !biVar.f32265q4) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f31286n && !chatAttachAlertPhotoLayout.P0) {
                            if (z10) {
                                org.telegram.ui.Components.pl plVar = chatAttachAlertPhotoLayout.Q;
                                if (plVar != null) {
                                    chatAttachAlertPhotoLayout.f31291p0 = Boolean.valueOf(plVar.isFrontface());
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
            hk0 hk0Var;
            mq0 mq0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.U8) {
                if (photoViewer.f41499o4 != 0 && !org.telegram.messenger.g0.Q1() && (mq0Var = photoViewer.f41415e5) != null && mq0Var.f47761m != null) {
                    ClippingImageView clippingImageView = photoViewer.f41445i0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f41608b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f31355b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f31356c;
                    rectF.bottom = scaleY - clippingImageView.f31354a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                        Rect bounds = getBounds();
                        float f10 = bounds.right;
                        float f11 = bounds.bottom;
                        for (int i3 = 0; i3 < 4; i3++) {
                            RectF rectF2 = this.f41607a;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 == 3) {
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
                            canvas.drawRect(rectF2, this.f41609c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (hk0Var = this.d) != null) {
                    org.telegram.messenger.g0.h3(hk0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i3) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                if (photoViewer.f41409e && i3 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f41610e = z10;
                if (z10) {
                    a();
                } else {
                    org.telegram.messenger.g0.i3(new xp0(this, 0), 70L);
                }
            }
            super.setAlpha(i3);
            this.f41609c.setAlpha(i3);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f41612a;
        public final TextPaint f41613b;
        public final Paint f41614c;
        public int d;
        public int f41615e;
        public final RectF f41616f;
        public int h;
        public float f41617n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f41613b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f41614c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f41616f = new RectF();
            a(0);
        }

        public final void a(int i3) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.g0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f41613b;
            this.f41612a = new StaticLayout("" + Math.max(1, i3), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f41615e = this.f41612a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f41614c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i3 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.i6 i6Var = org.telegram.ui.Components.k6.f35323b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, i6Var, 0), ObjectAnimator.ofInt(textPaint, i6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.i6 i6Var2 = org.telegram.ui.Components.k6.f35323b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, i6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, i6Var2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i3 < i10) {
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
            this.h = i3;
        }

        @Override
        public final float getRotationX() {
            return this.f41617n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f41614c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.g0.L(14.0f) + measuredHeight;
            RectF rectF = this.f41616f;
            rectF.set(org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
            if (this.f41612a != null) {
                this.f41613b.setAlpha((int) ((1.0f - this.f41617n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f41617n * org.telegram.messenger.g0.L(5.0f)) + org.telegram.messenger.g0.N(0.2f) + ((getMeasuredHeight() - this.f41615e) / 2));
                this.f41612a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f41617n * 255.0f));
                int centerX = (int) rectF.centerX();
                int D = (int) a1.g.D(1.0f, this.f41617n, org.telegram.messenger.g0.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(org.telegram.messenger.g0.L(5.0f) + centerX, D - org.telegram.messenger.g0.L(5.0f), centerX - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + D, paint);
                canvas.drawLine(centerX - org.telegram.messenger.g0.L(5.0f), D - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + centerX, org.telegram.messenger.g0.L(5.0f) + D, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i3 = this.h;
            if (i3 > 0) {
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.bd.G(i3, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i3, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(20.0f) + this.d, org.telegram.messenger.g0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f41617n = f10;
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
            f41368a9 = new wn0();
        } else {
            f41368a9 = new org.telegram.ui.Cells.g1(Float.class, "progress", 4);
        }
        f41369b9 = null;
        f41370c9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41381b = z10;
        this.h = -1;
        this.f41486n = true;
        this.f41587y = new xm0(this, 20);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.f41372a0 = new ue.b();
        this.f41597z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new mo0[3];
        this.f41541t1 = new xm0(this, 21);
        this.f41569w1 = new GradientDrawable[2];
        this.f41579x1 = new boolean[2];
        this.f41589y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.f41542t2 = new Rect();
        this.f41580x2 = new jo0(this);
        this.f41590y2 = new po0(this, 0);
        this.f41480m3 = true;
        this.f41490n3 = new int[2];
        this.f41498o3 = new int[2];
        this.f41600z3 = new ImageView[3];
        this.B3 = new int[2];
        this.L3 = true;
        this.W3 = -1;
        this.Y3 = -10;
        this.f41386b4 = new org.telegram.ui.Cells.j1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f41395c4 = videoFramesRewinder;
        this.f41404d4 = new yo0(this, videoFramesRewinder);
        this.f41414e4 = new org.telegram.ui.Cells.f2(this);
        this.f41448i4 = new po0(this, 1);
        this.f41457j4 = new po0(this, 2);
        this.f41465k4 = new m50(this, 1);
        this.f41474l4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f41572w4 = new xm0(this, 22);
        this.C4 = new ImageReceiver(null);
        this.D4 = new ei.c3(this, 5);
        this.E4 = new ImageReceiver(null);
        this.F4 = new g2.d(1, new xm0(this, 23));
        this.G4 = new g2.d(1, new xm0(this, 23));
        this.H4 = new g2.d(1, new xm0(this, 23));
        this.M4 = false;
        this.N4 = new Matrix();
        Paint paint2 = new Paint();
        this.O4 = paint2;
        this.P4 = null;
        this.Y4 = new Object();
        this.f41405d5 = new String[3];
        this.Q5 = new boolean[]{false, true};
        this.f41388b6 = 1.0f;
        this.f41397c6 = 0.0f;
        this.f41510p6 = -1;
        this.f41555u6 = new DecelerateInterpolator(1.5f);
        this.f41584x6 = 1.0f;
        this.f41594y6 = 0.0f;
        this.J6 = true;
        this.R6 = true;
        this.X6 = new ArrayList();
        this.Y6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Z6 = new ArrayList();
        this.f41379a7 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41389b7 = new ArrayList();
        this.f41398c7 = new ArrayList();
        this.f41407d7 = new ArrayList();
        this.f41417e7 = new ArrayList();
        this.f41427f7 = new ArrayList();
        this.g7 = new ArrayList();
        this.h7 = new ArrayList();
        this.f41451i7 = null;
        this.f41460j7 = null;
        this.f41477l7 = new Rect();
        this.f41484m7 = new g2.g(new int[]{org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t, org.telegram.messenger.hs.W, org.telegram.messenger.hs.V, org.telegram.messenger.hs.f23222e3});
        this.f41604z7 = new float[]{1.0f};
        this.A7 = new float[]{1.0f};
        this.G7 = new xm0(this, 24);
        this.O7 = new int[2];
        this.W7 = -1L;
        this.X7 = -1L;
        this.Y7 = -1L;
        this.f41380a8 = -1;
        this.F8 = new org.telegram.ui.Components.u5(new xm0(this, 23), 180L, org.telegram.ui.Components.xq.f40453g);
        this.N8 = new Object();
        this.O8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.D4.h0(3);
    }

    public static String A1() {
        File z10 = org.telegram.messenger.w7.z(4);
        return new File(z10, org.telegram.messenger.az.p() + "_temp.jpg").getAbsolutePath();
    }

    public static void C(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.m51 m51Var;
        org.telegram.messenger.zi ziVar;
        boolean z11;
        gq0 gq0Var = photoViewer.f41420f0;
        photoViewer.f41410e0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f41437h0, photoViewer.f41410e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        wm wmVar = photoViewer.f41481m4;
        if (wmVar != null && wmVar.f51237a0 != null && wmVar.getFragmentView() != null) {
            mj mjVar = photoViewer.f41481m4.f51237a0;
            if (mjVar.A2) {
                mjVar.r1();
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.l3(photoViewer.f41481m4.getParentActivity(), photoViewer.f41391c);
            photoViewer.f41481m4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (m51Var = photoViewer.G2) != null && m51Var.S() > 1500 && (ziVar = photoViewer.U4) != null && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            num = Integer.valueOf((int) (photoViewer.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(0);
            String K = org.telegram.messenger.t3.K(org.telegram.messenger.hp.s1(photoViewer.U).M0(Long.valueOf(-org.telegram.messenger.zi.B0(ziVar2.f26868k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.hp.s1(photoViewer.U).V2, "/", K, "/");
                sb2.append(ziVar2.f1());
                str = sb2.toString();
            }
        }
        vo0 vo0Var = new vo0(photoViewer, photoViewer.E, photoViewer.f41481m4, arrayList, str, num, gq0Var, z10);
        vo0Var.A0(false);
        vo0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.g0.i3(new hk0(2, photoViewer, vo0Var), 250L);
        vo0Var.show();
    }

    public static void D(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.zi ziVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.s0()) {
            return;
        }
        org.telegram.messenger.zi ziVar2 = photoViewer.U4;
        File file2 = null;
        if (ziVar2 != null) {
            if (ziVar2.t() && !photoViewer.U4.V2()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.U4.Q3()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean M4 = org.telegram.messenger.zi.M4(photoViewer.U4.f26868k);
            if (!TextUtils.isEmpty(photoViewer.U4.f26868k.attachPath)) {
                File file3 = new File(photoViewer.U4.f26868k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                file2 = org.telegram.messenger.w7.N(photoViewer.U4.f26868k, false, true);
            }
            ziVar = ziVar2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = M4;
        } else {
            file = null;
            ziVar = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.f41460j7 = new oq0(photoViewer, photoViewer.Q4, new ArrayList(photoViewer.Z6), photoViewer.d);
            wp0 wp0Var = new wp0();
            wp0Var.f51587c = false;
            photoViewer.n3(false, true, wp0Var);
            org.telegram.messenger.g0.i3(new jn0(photoViewer, file, z10, ziVar, z11, z12), wp0Var.f51585a);
            return;
        }
        photoViewer.X2();
    }

    public static boolean F1() {
        if (f41369b9 != null) {
            return true;
        }
        return false;
    }

    public static void G(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap J0(android.graphics.Bitmap r16, org.telegram.messenger.re r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.J0(android.graphics.Bitmap, org.telegram.messenger.re, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean N1(org.telegram.messenger.zi ziVar) {
        if (f41369b9 != null && !f41369b9.C3 && f41369b9.f41409e && ziVar != null && f41369b9.U4 != null && f41369b9.U4.f1() == ziVar.f1() && org.telegram.messenger.zi.B0(f41369b9.U4.f26868k) == org.telegram.messenger.zi.B0(ziVar.f26868k)) {
            return true;
        }
        return false;
    }

    public static boolean O1(org.telegram.messenger.zi ziVar) {
        if (f41370c9 != null && ziVar != null && f41370c9.U4 != null && f41370c9.U4.f1() == ziVar.f1() && org.telegram.messenger.zi.B0(f41370c9.U4.f26868k) == org.telegram.messenger.zi.B0(ziVar.f26868k)) {
            return true;
        }
        return false;
    }

    public static boolean P1(String str) {
        if (f41369b9 != null && f41369b9.f41409e && !f41369b9.f41544t4 && str != null && str.equals(f41369b9.f41425f5)) {
            return true;
        }
        return false;
    }

    public static boolean Q1(org.telegram.messenger.zi ziVar) {
        boolean z10;
        if (f41369b9 != null && !f41369b9.C3 && f41369b9.f41409e && !f41369b9.f41544t4 && ziVar != null) {
            org.telegram.messenger.zi ziVar2 = f41369b9.U4;
            if (ziVar2 == null && f41369b9.d != null) {
                ziVar2 = f41369b9.d.V();
            }
            if (ziVar2 != null && ziVar2.f1() == ziVar.f1() && org.telegram.messenger.zi.B0(ziVar2.f26868k) == org.telegram.messenger.zi.B0(ziVar.f26868k)) {
                z10 = true;
                if (z10 && f41370c9 != null) {
                    if (f41370c9.f41409e && !f41370c9.f41544t4 && ziVar != null && f41370c9.U4 != null && f41370c9.U4.f1() == ziVar.f1() && org.telegram.messenger.zi.B0(f41370c9.U4.f26868k) == org.telegram.messenger.zi.B0(ziVar.f26868k)) {
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

    public static boolean R1(TLRPC.BotInlineResult botInlineResult) {
        if (f41369b9 != null && f41369b9.f41409e && !f41369b9.f41544t4 && botInlineResult != null && f41369b9.Z4 != null && botInlineResult.f26999id == f41369b9.Z4.f26999id) {
            return true;
        }
        return false;
    }

    public static void S(PhotoViewer photoViewer) {
        int i3;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Z6;
        if (!arrayList.isEmpty() && (i3 = photoViewer.R4) >= 0 && i3 < arrayList.size() && (ziVar = (org.telegram.messenger.zi) arrayList.get(photoViewer.R4)) != null) {
            if (photoViewer.f41500o5 && (message = ziVar.f26868k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f21.M0())) {
                photoViewer.D2(ziVar, n2(ziVar), false, true);
            } else {
                photoViewer.D2(ziVar, ziVar.f26924z, photoViewer.f41500o5, true);
            }
        }
    }

    public static boolean S1(TLRPC.FileLocation fileLocation) {
        if (f41369b9 != null && f41369b9.f41409e && !f41369b9.f41544t4 && fileLocation != null) {
            if (f41369b9.f41377a5 == null || fileLocation.local_id != f41369b9.f41377a5.f21488f.local_id || fileLocation.volume_id != f41369b9.f41377a5.f21488f.volume_id || fileLocation.dc_id != f41369b9.f41377a5.f21484a) {
                if (f41369b9.f41387b5 != null && fileLocation.local_id == f41369b9.f41387b5.f21488f.local_id && fileLocation.volume_id == f41369b9.f41387b5.f21488f.volume_id && fileLocation.dc_id == f41369b9.f41387b5.f21484a) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean U2(org.telegram.messenger.zi ziVar) {
        if (ziVar != null && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            if (ziVar.f26917x0 || ziVar.f26913w0 || ziVar.E2(true) || (ziVar.B() && org.telegram.messenger.az.B0)) {
                int i3 = org.telegram.messenger.az.f21612a;
                if (org.telegram.messenger.lc.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void V(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.W7 != -1 && (textureView = photoViewer.C2) != null) {
            photoViewer.W7 = -1L;
            photoViewer.A2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.xq.f40455j).setDuration(85L).setListener(new org.telegram.ui.Components.ri0(10, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void W(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W(org.telegram.ui.PhotoViewer):void");
    }

    public static void X(PhotoViewer photoViewer) {
        int i3;
        org.telegram.ui.Components.o51 o51Var = photoViewer.f41526r3;
        if (o51Var.f36723f) {
            i3 = o51Var.d;
        } else {
            i3 = o51Var.f36720b;
        }
        int L = (org.telegram.messenger.g0.L(2.0f) + ((org.telegram.ui.Components.o51.S / 2) + i3)) - (photoViewer.f41543t3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = (photoViewer.f41456j3.getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - (photoViewer.f41543t3.getMeasuredWidth() / 2);
        if (L < L2) {
            ap0 ap0Var = photoViewer.f41543t3;
            ap0Var.setPivotX(Utilities.i((ap0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f41543t3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            ap0 ap0Var2 = photoViewer.f41543t3;
            ap0Var2.setPivotX(Utilities.i((ap0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f41543t3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            ap0 ap0Var3 = photoViewer.f41543t3;
            ap0Var3.setPivotX(ap0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f41543t3.setTranslationX(L);
    }

    public static int Y0(org.telegram.messenger.se seVar) {
        if (seVar.d()) {
            return org.telegram.messenger.g0.Z0(false);
        }
        return 512;
    }

    public static void Z(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.ch0 B;
        dq0 dq0Var = photoViewer.Y4;
        ArrayList arrayList = dq0Var.f44798e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) dq0Var.f44798e.get(i3);
                if (z10Var.f26703a == 0 && (z10Var.f26704b & 1) != 0) {
                    View view = z10Var.I;
                    if ((view instanceof org.telegram.ui.Components.k9) && (B = ((org.telegram.ui.Components.k9) view).getImageReceiver().B()) != null) {
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

    public static void a0(PhotoViewer photoViewer, long j10) {
        org.telegram.ui.Components.ch0 B;
        dq0 dq0Var = photoViewer.Y4;
        ArrayList arrayList = dq0Var.f44798e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) dq0Var.f44798e.get(i3);
                if (z10Var.f26703a == 0 && (z10Var.f26704b & 1) != 0) {
                    View view = z10Var.I;
                    if ((view instanceof org.telegram.ui.Components.k9) && (B = ((org.telegram.ui.Components.k9) view).getImageReceiver().B()) != null) {
                        long j11 = photoViewer.f41494n8;
                        long j12 = 0;
                        if (j11 > 0) {
                            j12 = j11 / 1000;
                        }
                        B.U(j10 - j12);
                    }
                }
            }
        }
    }

    public static void b0(org.telegram.ui.PhotoViewer r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.b0(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String b1(int i3, int i10) {
        int i11;
        int i12;
        if (i3 >= 100) {
            i11 = 99;
        } else {
            i11 = i3;
        }
        char c2 = (char) ((i11 / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        char c10 = (char) ((i3 % 10) + 48);
        if (i10 >= 100) {
            i12 = 99;
        } else {
            i12 = i10;
        }
        char c11 = (char) ((i12 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        return new String(new char[]{c2, c10, ':', c11, (char) ((i10 % 10) + 48)});
    }

    public static String c1(int i3, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i3 >= 100) {
            i12 = 99;
        } else {
            i12 = i3;
        }
        char c2 = (char) ((i12 / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        char c10 = (char) ((i3 % 10) + 48);
        if (i10 >= 100) {
            i13 = 99;
        } else {
            i13 = i10;
        }
        char c11 = (char) ((i13 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c12 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i14 = 99;
        } else {
            i14 = i11;
        }
        char c13 = (char) ((i14 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        return new String(new char[]{c2, c10, ':', c11, c12, ':', c13, (char) ((i11 % 10) + 48)});
    }

    public static boolean d(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence n2(org.telegram.messenger.zi ziVar) {
        if (ziVar.f26868k == null) {
            return "";
        }
        Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(new SpannableStringBuilder(ziVar.f26868k.translatedText.text), org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false, null, 0), ziVar.f26868k.translatedText.entities, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.zi.M(C5)) {
            try {
                org.telegram.messenger.g0.c(C5, 5, false, true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.zi.h(ziVar.Q3(), C5, true, 0, 0, true);
        org.telegram.messenger.zi.b(C5, ziVar.f26868k.translatedText.entities, ziVar.Q3(), true, true, true, 0);
        if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            org.telegram.messenger.zi.h(ziVar.Q3(), C5, true, 3, (int) ziVar.L0(), false);
        } else if (ziVar.J3() || org.telegram.messenger.zi.S4(ziVar.f26868k)) {
            org.telegram.messenger.zi.h(ziVar.Q3(), C5, true, 4, (int) ziVar.L0(), false);
        }
        return C5;
    }

    public static String s1(org.telegram.messenger.ac acVar) {
        if (acVar != null && acVar.f21497p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer v1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f41369b9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f41369b9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f41369b9 = photoViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return photoViewer;
        }
        return photoViewer2;
    }

    public final void A0() {
        org.telegram.messenger.zi ziVar;
        boolean z10;
        int i3;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        org.telegram.messenger.zi ziVar2;
        ArrayList arrayList = this.Z6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f41600z3;
        if (!isEmpty && ((ziVar = this.U4) == null || !ziVar.s4())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.Q4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i12);
                    if (!org.telegram.messenger.zi.M4(ziVar3.f26868k) && !ziVar3.f5()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (ziVar3.f5() && (ziVar2 = this.U4) != null && ziVar2.f1() == ziVar3.f1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i3 = ziVar3.f26868k.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.C2) != null) {
                            i3 = textureView.getMeasuredWidth();
                        } else {
                            i3 = 0;
                        }
                        if (z10) {
                            i10 = ziVar3.f26868k.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.C2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document F0 = ziVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i3 = documentAttribute.f27008w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = org.telegram.messenger.g0.f22608q;
                        if (point.y > point.x && i3 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f41420f0.getMeasuredHeight() + ((int) (i10 / (i3 / this.f41420f0.getMeasuredWidth())))) / 2) - org.telegram.messenger.g0.L(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f41519q6 != null) {
                            float f11 = this.Y5;
                            f10 = ((this.f41406d6 - f11) * this.f41483m6) + f11;
                        } else {
                            f10 = this.Y5;
                        }
                        float f12 = 0.0f;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                f12 = (f10 - this.G6) + ((-point.x) - org.telegram.messenger.g0.L(15.0f));
                            } else {
                                float f13 = this.F6;
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

    public final void A2(org.telegram.ui.Components.d30 d30Var) {
        String str;
        int i3;
        TLRPC.User user;
        this.f41506p2 = d30Var;
        if (this.f41402d2 == 1) {
            if (H3()) {
                this.f41495o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.f41495o0.setVisibility(8);
            }
            if (d30Var != null && (user = d30Var.f32924b) != null && d30Var.f32925c == 1 && this.f41506p2.d) {
                if (d30Var.f32926e) {
                    this.D1.setSubtitle(org.telegram.messenger.bd.a0(null, null, 2131745522, user.first_name));
                } else {
                    this.D1.setSubtitle(org.telegram.messenger.bd.a0(null, null, 2131745523, user.first_name));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (d30Var != null) {
            if (d30Var.f32925c == 2) {
                if (d30Var.f32926e) {
                    str = "SuggestVideo";
                    i3 = 2131744407;
                } else {
                    str = "SuggestPhoto";
                    i3 = 2131744418;
                }
                R2(org.telegram.messenger.bd.M0(i3, str));
            }
            if (d30Var.f32926e) {
                this.U7.setText(org.telegram.messenger.bd.M0(2131745545, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void A3() {
        boolean z10;
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            if (!d1.f.u() && !this.f41522r) {
                z10 = false;
            } else {
                z10 = true;
            }
            m51Var.t0(z10);
        }
        if (!this.f41478l8) {
            this.f41421f1.setEnabled(false);
            this.f41421f1.setClickable(false);
            this.f41421f1.animate().alpha(0.5f).setDuration(180L).start();
            this.T7.setMode(0);
            return;
        }
        this.f41421f1.setEnabled(true);
        this.f41421f1.setClickable(true);
        this.f41421f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f41522r) {
            if (this.f41424f4 == null) {
                this.N.a(org.telegram.messenger.bd.M0(2131745289, "SoundMuted"), true);
            }
            org.telegram.ui.Components.sz szVar = this.f41411e1;
            szVar.f38207e = true;
            szVar.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(0.5f);
                this.k1.setEnabled(false);
            }
            if (this.f41402d2 == 1) {
                this.T7.setMaxProgressDiff(9600.0f / this.f41461j8);
                this.T7.setMode(1);
                E3();
                return;
            }
            this.T7.setMaxProgressDiff(1.0f);
            this.T7.setMode(0);
            return;
        }
        this.N.a(this.E8, true);
        org.telegram.ui.Components.sz szVar2 = this.f41411e1;
        szVar2.f38207e = false;
        szVar2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(1.0f);
            this.k1.setEnabled(true);
        }
        this.T7.setMaxProgressDiff(1.0f);
        this.T7.setMode(0);
    }

    public final void B0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B0(boolean):void");
    }

    public final int B1(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f41570w2;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final void B2(boolean z10) {
        if (this.f41497o2 != z10) {
            this.f41497o2 = z10;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void B3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3(int, boolean):void");
    }

    public final void C0(final int i3, final boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        rb0 rb0Var;
        final File file;
        final rb0 rb0Var2;
        boolean z15;
        boolean z16;
        File file2;
        File K;
        File K2;
        boolean z17;
        final boolean z18;
        File file3;
        rb0 rb0Var3;
        boolean z19;
        org.telegram.ui.Components.t5 t5Var;
        int i11 = this.Q4;
        if (i3 == 1) {
            i10 = i11 + 1;
        } else if (i3 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.f41405d5[i3] != null) {
            if (i3 == 0 && i11 == 0 && (t5Var = this.f41463k2) != null) {
                z11 = t5Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.U4 != null) {
                if (i10 >= 0 && i10 < this.Z6.size()) {
                    ?? r42 = (org.telegram.messenger.zi) this.Z6.get(i10);
                    z12 = U2(r42);
                    if (this.D5 == 1 && !r42.x()) {
                        this.X0[i3].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f26868k.attachPath)) {
                        file3 = new File(r42.f26868k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.zi.o1(r42.f26868k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(r42.f26868k).webpage != null && org.telegram.messenger.zi.o1(r42.f26868k).webpage.document == null) {
                        rb0Var3 = new rb0(9, this, r1(i10, null));
                    } else {
                        rb0Var3 = new rb0(10, this, r42.f26868k);
                    }
                    if (org.telegram.messenger.zi.M4(r42.f26868k)) {
                        if ((org.telegram.messenger.az.B0 && r42.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(r42.f26868k))) || r42.E2(true)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        rb0 rb0Var4 = rb0Var3;
                        z13 = z19;
                        rb0Var = r42;
                        file = null;
                        file4 = file3;
                        rb0Var2 = rb0Var4;
                        z14 = true;
                    } else {
                        z14 = false;
                        rb0Var = r42;
                        file = null;
                        file4 = file3;
                        rb0Var2 = rb0Var3;
                        z13 = false;
                    }
                } else {
                    this.X0[i3].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Z4 != null) {
                    if (i10 >= 0 && i10 < this.h7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.h7.get(i10);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.zi.L4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.w7.z(3), this.f41405d5[i3]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.w7.z(0), this.f41405d5[i3]);
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
                                file2 = new File(org.telegram.messenger.w7.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.zb.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(org.telegram.messenger.w7.z(4), this.f41405d5[i3]);
                    } else {
                        this.X0[i3].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.f41377a5 != null) {
                        if (i10 >= 0 && i10 < this.f41398c7.size()) {
                            org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) this.f41398c7.get(i10);
                            if (acVar != null) {
                                org.telegram.messenger.w7.G(this.U);
                                K = org.telegram.messenger.w7.K(acVar.f21488f, s1(acVar), false, true);
                                org.telegram.messenger.w7.G(this.U);
                                K2 = org.telegram.messenger.w7.K(acVar.f21488f, s1(acVar), true, true);
                            } else {
                                K2 = null;
                                K = null;
                            }
                        } else {
                            this.X0[i3].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f41396c5 != null) {
                        if (i10 >= 0 && i10 < this.f41427f7.size()) {
                            org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) this.f41427f7.get(i10);
                            org.telegram.messenger.w7.G(this.U);
                            K = org.telegram.messenger.w7.K(wvVar, null, true, true);
                            org.telegram.messenger.w7.G(this.U);
                            K2 = org.telegram.messenger.w7.K(wvVar, null, false, true);
                        } else {
                            this.X0[i3].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f41425f5 != null) {
                        file2 = new File(org.telegram.messenger.w7.z(3), this.f41405d5[i3]);
                        file = new File(org.telegram.messenger.w7.z(4), this.f41405d5[i3]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        hq0 hq0Var = this.f41468k7;
                        if (hq0Var != null) {
                            File b10 = hq0Var.b(i10);
                            if (!this.f41468k7.a(i10) && !this.f41468k7.e(i10)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && org.telegram.messenger.az.B0 && (this.f41468k7.d(i10) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            rb0Var2 = null;
                            z12 = T2(i10);
                            file4 = b10;
                            rb0Var = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            rb0Var = null;
                            file = null;
                            rb0Var2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    rb0Var2 = null;
                    file4 = K;
                    file = K2;
                    rb0Var = rb0Var2;
                }
                rb0Var2 = null;
                file4 = file2;
                rb0Var = rb0Var2;
            }
            if ((i3 != 0 || !this.f41482m5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = rb0Var;
            final boolean z20 = z11;
            Utilities.f21387e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.zi ziVar;
                    wm wmVar;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.V8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    rb0 rb0Var5 = rb0Var2;
                    File file8 = null;
                    if (file7 == null && rb0Var5 != null) {
                        file7 = rb0Var5.d();
                    } else if (rb0Var5 != null) {
                        file8 = rb0Var5.d();
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
                    final int i12 = i3;
                    final boolean z23 = z13;
                    if (!z22 && i12 != 0 && (ziVar = r72) != null && z23 && org.telegram.messenger.z5.q(photoViewer.U).b(ziVar.f26868k) != 0 && (((wmVar = photoViewer.f41481m4) == null || wmVar.h == null) && !org.telegram.messenger.zi.S5(ziVar.f26868k) && (F0 = ziVar.F0()) != null)) {
                        org.telegram.messenger.w7.G(photoViewer.U).X(F0, ziVar, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f41405d5;
                            mo0[] mo0VarArr = photoViewer2.X0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!org.telegram.messenger.w7.G(photoViewer2.U).T(strArr[i13])) {
                                        mo0VarArr[i13].d(2, false, true);
                                    } else {
                                        mo0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    mo0VarArr[i13].d(0, z29, true);
                                }
                                Float w10 = org.telegram.messenger.zb.D().w(strArr[i13]);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                mo0VarArr[i13].f(false, w10.floatValue());
                            } else {
                                if (i13 != 0 || !photoViewer2.Q3) {
                                    if (z28 && (!z25 || (i13 == 0 && photoViewer2.Y2))) {
                                        mo0VarArr[i13].d(3, z29, true);
                                    } else {
                                        mo0VarArr[i13].d(-1, z29, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f41504p0.x()) {
                                    if (!z27) {
                                        if (!org.telegram.messenger.w7.G(photoViewer2.U).T(strArr[i13])) {
                                            photoViewer2.f41504p0.t(8);
                                        } else {
                                            photoViewer2.f41504p0.S(8);
                                        }
                                    } else {
                                        photoViewer2.f41504p0.t(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f41553u4 || (photoViewer2.h7.isEmpty() && (strArr[0] == null || mo0VarArr[0].h == 0))) {
                                    z30 = false;
                                }
                                photoViewer2.J6 = z30;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.h7.isEmpty() && i10 >= 0 && i10 < this.h7.size()) {
            Object obj = this.h7.get(i10);
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (yeVar.f25310b && (!yeVar.d() || (!yeVar.j() && this.f41402d2 != 11))) {
                    this.X0[i3].d(3, z10, true);
                    return;
                }
            }
        }
        this.X0[i3].d(-1, z10, true);
    }

    public final long C1() {
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null && tp0Var.f38729y) {
            return tp0Var.getVideoDuration();
        }
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.U();
    }

    public final void C2() {
        org.telegram.ui.Components.b51 b51Var;
        org.telegram.ui.Components.b51 b51Var2;
        if (!this.f41439h2 && this.f41402d2 == 1) {
            if (!this.f41533s1 || ((b51Var2 = (org.telegram.ui.Components.b51) this.C2) != null && b51Var2.getVideoWidth() > 0 && b51Var2.getVideoHeight() > 0)) {
                this.f41439h2 = true;
                Bitmap n4 = this.D4.n();
                int i3 = this.D4.V;
                if (n4 == null) {
                    n4 = this.f41445i0.getBitmap();
                    i3 = this.f41445i0.getOrientation();
                }
                Bitmap bitmap = n4;
                int i10 = i3;
                if (bitmap != null || this.C2 != null) {
                    org.telegram.ui.Components.ad0 ad0Var = this.D1;
                    if (this.f41533s1) {
                        b51Var = (org.telegram.ui.Components.b51) this.C2;
                    } else {
                        b51Var = null;
                    }
                    ad0Var.b(bitmap, i10, false, false, this.E1, b51Var, this.Y4.f44797c);
                }
            }
        }
    }

    public final void C3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C3():void");
    }

    public final void D0(int i3) {
        org.telegram.ui.Components.j51 j51Var;
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null && m51Var.d != null && i3 != m51Var.f36010e0) {
            m51Var.f36010e0 = i3;
            ArrayList arrayList = m51Var.O;
            if (arrayList != null && i3 >= 0 && i3 < arrayList.size()) {
                j51Var = (org.telegram.ui.Components.j51) m51Var.O.get(i3);
            } else {
                j51Var = null;
            }
            m51Var.w0(false, j51Var);
        }
        if (i3 == -1) {
            org.telegram.ui.Components.m51.o0(null, this.U4);
        } else {
            org.telegram.ui.Components.m51 m51Var2 = this.G2;
            if (m51Var2 != null) {
                org.telegram.ui.Components.m51.o0(m51Var2.Z(i3), this.U4);
            }
        }
        C3();
        this.f41513q0.U(null, null);
        try {
            d1.f.b(0);
            if (tf.b.t().u()) {
                tf.b.t().z(o1());
            }
            org.telegram.ui.Components.m51 m51Var3 = this.G2;
            if (m51Var3 != null) {
                d1.f.x(m51Var3.d0());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int D1() {
        int measuredHeight;
        int k1 = k1();
        gq0 gq0Var = this.f41420f0;
        if (gq0Var != null && (measuredHeight = gq0Var.getMeasuredHeight()) > 0) {
            return Math.min(k1, measuredHeight);
        }
        return k1;
    }

    public final void D2(org.telegram.messenger.zi ziVar, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i3;
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
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.p5.cloneSpans(charSequence, 3);
        Z2(this.S4, z11);
        if (!this.S4 && this.f41402d2 != 1) {
            this.V1.setVisibility(8);
            this.W1.setVisibility(8);
            if (this.f41455j2) {
                if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout = this.f41374a2;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.U1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f41420f0.getContext());
                    this.f41374a2 = frameLayout2;
                    this.R1.setContainer(frameLayout2);
                    mp0 mp0Var = new mp0(this, this.f41420f0.getContext(), this.R1, this.f41374a2, 0);
                    this.U1 = mp0Var;
                    this.R1.setScrollView(mp0Var);
                    this.f41374a2.setClipChildren(false);
                    this.U1.addView(this.f41374a2, new ViewGroup.LayoutParams(-1, -2));
                    this.f41420f0.addView(this.U1, b8.mf.e(-1, -1, 80));
                }
                if (this.R1.getParent() != this.f41374a2) {
                    this.Q0.removeView(this.R1);
                    this.R1.setMeasureAllChildren(true);
                    this.f41374a2.addView(this.R1, -1, -2);
                    this.f41543t3.bringToFront();
                }
                if (ziVar != null && ziVar.s4()) {
                    if (this.S1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.F);
                        this.S1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.b0(620756991, 369098751, 8, 8));
                        b8.pf.b(this.S1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.F);
                        this.T1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.T1.setTextColor(-1);
                        this.T1.setTypeface(org.telegram.messenger.g0.o());
                        this.S1.addView(this.T1, b8.mf.e(-2, -2, 17));
                        this.S1.setOnClickListener(new ln0(this, 7));
                    }
                    org.telegram.messenger.g0.E2(this.S1);
                    this.T1.setText(ziVar.W0);
                    this.f41374a2.addView(this.S1, b8.mf.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
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
            cq0 cq0Var = this.R1;
            if (z11) {
                currentView = cq0Var.getNextView();
            } else {
                currentView = cq0Var.getCurrentView();
            }
            if (this.f41533s1) {
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
                if (this.f41455j2) {
                    Point point = org.telegram.messenger.g0.f22608q;
                    if (point.x > point.y) {
                        i3 = 5;
                    } else {
                        i3 = 10;
                    }
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                if (maxLines != i3) {
                    this.R1.getCurrentView().setMaxLines(i3);
                    this.R1.getNextView().setMaxLines(i3);
                    this.R1.getCurrentView().setEllipsize(null);
                    this.R1.getNextView().setEllipsize(null);
                }
            }
            currentView.setScrollX(0);
            boolean z19 = this.f41455j2;
            if (!z19 && z11 && isEmpty) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f41489n2 = z12;
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
                if (this.f41455j2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new np0(this, isEmpty2, isEmpty, 1)).addTransition(new np0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.U1.m0 = true;
                        duration.addTransition(new org.telegram.ui.Components.rk0(this, 2));
                    }
                    if (isEmpty2 && !isEmpty) {
                        duration.addTarget((View) this.R1);
                    }
                    TransitionManager.beginDelayedTransition(this.U1, duration);
                }
                z13 = true;
            } else {
                this.R1.getCurrentView().setText((CharSequence) null);
                mp0 mp0Var2 = this.U1;
                if (mp0Var2 != null) {
                    mp0Var2.scrollTo(0, 0);
                }
                z13 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.k6.K(null, true);
                if (ziVar == null || !this.f41500o5 || (message = ziVar.f26868k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f21.M0())) {
                    if (ziVar != null && !ziVar.f26868k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        ziVar.c(spannableString, true, false);
                        if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                            org.telegram.messenger.zi.h(ziVar.Q3(), spannableString, false, 3, (int) ziVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.i6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (ziVar != null && ziVar.s4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(ziVar.Q0)) {
                        spannableStringBuilder.append((CharSequence) ziVar.Q0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new ei.q8(1), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.R1.setTag(cloneSpans);
                try {
                    cq0 cq0Var2 = this.R1;
                    if (this.f41515q2 != z10) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    cq0Var2.a(cloneSpans, z11, z18);
                    mp0 mp0Var3 = this.U1;
                    if (mp0Var3 != null) {
                        mp0Var3.H(mp0Var3.getWidth(), mp0Var3.getHeight());
                    }
                    z14 = true;
                } catch (Exception e10) {
                    z14 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.K && (!this.f41533s1 || this.Q0.getVisibility() == 0 || this.f41468k7 != null)) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                cq0 cq0Var3 = this.R1;
                if (z17) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                cq0Var3.setVisibility(i10);
            } else {
                z14 = true;
                if (this.f41455j2) {
                    this.R1.a(org.telegram.messenger.bd.M0(2131754454, "AddCaption"), z11, false);
                    this.R1.getCurrentView().setTextColor(-1291845633);
                    this.R1.setTag("empty");
                    this.R1.setVisibility(0);
                } else {
                    this.R1.a(null, z11, false);
                    this.R1.getCurrentView().setTextColor(-1);
                    cq0 cq0Var4 = this.R1;
                    if (z13 && !isEmpty2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    cq0Var4.b(4, z15);
                    this.R1.setTag(null);
                }
            }
            if (this.R1.getCurrentView() instanceof bq0) {
                ((bq0) this.R1.getCurrentView()).setLoading(z10);
            }
            if (!isEmpty && z10) {
                z16 = z14;
            } else {
                z16 = false;
            }
            this.f41515q2 = z16;
            return;
        }
        h1().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void D3() {
        long j10;
        int H;
        org.telegram.messenger.zi ziVar;
        kq0 kq0Var = this.d;
        if (kq0Var != null) {
            int H2 = kq0Var.H();
            this.P0.a(H2);
            if (H2 == 0) {
                s3(false, true);
            }
            if (this.T0 != null) {
                kq0 kq0Var2 = this.d;
                long j11 = 0;
                if (kq0Var2 != null) {
                    j10 = kq0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (ziVar = this.U4) != null) {
                    j10 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                }
                mi.x1 x1Var = this.T0;
                kq0 kq0Var3 = this.d;
                if (kq0Var3 == null || !kq0Var3.q() || this.d.w()) {
                    j11 = org.telegram.messenger.hp.s1(this.U).N1(j10);
                }
                kq0 kq0Var4 = this.d;
                if (kq0Var4 == null) {
                    H = 1;
                } else {
                    H = kq0Var4.H();
                }
                x1Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void E0(boolean z10, boolean z11, float f10) {
        if (f10 != this.f41550u1) {
            this.f41550u1 = f10;
            if (this.U4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f41550u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.zi.B0(this.U4.f26868k) + "_" + this.U4.f1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.zi.B0(this.U4.f26868k) + "_" + this.U4.f1(), this.f41550u1).commit();
                }
            }
            org.telegram.ui.Components.m51 m51Var = this.G2;
            if (m51Var != null) {
                m51Var.v0(this.f41550u1);
            }
            tp0 tp0Var = this.f41429g0;
            if (tp0Var != null) {
                tp0Var.setPlaybackSpeed(this.f41550u1);
            }
        }
        M2(true, z10);
        if (z11) {
            this.f41513q0.U(null, null);
        }
    }

    public final boolean E1() {
        if (f1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void E2(int i3) {
        F2(i3, true, false, false);
    }

    public final void E3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.E3():void");
    }

    public final void F0(boolean z10) {
        int i3 = this.Q4;
        if (i3 >= 0 && i3 < this.h7.size() && K1()) {
            if (z10) {
                l0();
            }
            h1().p();
        }
    }

    public final void F2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.F2(int, boolean, boolean, boolean):void");
    }

    public final void F3() {
        String b12;
        String b13;
        int[] iArr = this.f41490n3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f41498o3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            long max = Math.max(0L, m51Var.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.C8 && this.S7.getVisibility() == 0) {
                max2 = (this.T7.getRightProgress() - this.T7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.T7.getLeftProgress() * ((float) max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j10 = max / 1000;
            long j11 = max2 / 1000;
            iArr[0] = (int) (j10 / 60);
            iArr[1] = (int) (j10 % 60);
            iArr2[0] = (int) (j11 / 60);
            iArr2[1] = (int) (j11 % 60);
        } else {
            tp0 tp0Var = this.f41429g0;
            if (tp0Var != null && tp0Var.f38729y) {
                long max3 = Math.max(0, tp0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f41429g0.getVideoDuration());
                if (!this.C8 && this.S7.getVisibility() == 0) {
                    max4 = (this.T7.getRightProgress() - this.T7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.T7.getLeftProgress() * ((float) max4));
                    if (max3 > max4) {
                        max3 = max4;
                    }
                }
                long j12 = max3 / 1000;
                long j13 = max4 / 1000;
                iArr[0] = (int) (j12 / 60);
                iArr[1] = (int) (j12 % 60);
                iArr2[0] = (int) (j13 / 60);
                iArr2[1] = (int) (j13 % 60);
            }
        }
        int i3 = iArr[0];
        if (i3 >= 60) {
            b12 = c1(i3 / 60, i3 % 60, iArr[1]);
        } else {
            b12 = b1(i3, iArr[1]);
        }
        int i10 = iArr2[0];
        if (i10 >= 60) {
            b13 = c1(i10 / 60, i10 % 60, iArr2[1]);
        } else {
            b13 = b1(i10, iArr2[1]);
        }
        this.f41507p3.l(b12 + " / " + b13, false);
        if (!Objects.equals(this.f41464k3, b13)) {
            this.f41464k3 = b13;
            this.f41456j3.requestLayout();
        }
    }

    public final void G0() {
        lp0 lp0Var = this.M1;
        Activity activity = this.E;
        xm0 xm0Var = new xm0(this, 1);
        if (lp0Var.f55994v1) {
            lp0Var.w0(false);
        } else if (lp0Var.Q1) {
            lp0Var.k0(true);
        } else if (lp0Var.D0 && lp0Var.C0 != null) {
            lp0Var.r0(null, true);
        } else if (lp0Var.f55981p0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, lp0Var.A1);
            String M0 = org.telegram.messenger.bd.M0(2131747286, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = M0;
            s1Var.S = org.telegram.messenger.bd.M0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new org.telegram.ui.ActionBar.e3(xm0Var, 19));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            V2(alertDialog$Builder);
        } else {
            xm0Var.run();
        }
    }

    public final void G1() {
        boolean[] zArr = this.f41579x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f41420f0.invalidate();
    }

    public final void G2() {
        if (this.f41499o4 == 0) {
            H2(this.D4, this.Q4, null);
            I2(this.Q4, this.f41601z4);
            H2(this.E4, this.Q4 + 1, this.G1);
            I2(this.Q4 + 1, this.B4);
            H2(this.C4, this.Q4 - 1, this.F1);
            I2(this.Q4 - 1, this.A4);
        }
    }

    public final void G3() {
        int v;
        if (this.f41380a8 > 0) {
            if (this.Z7 >= this.f41380a8) {
                this.Z7 = this.f41380a8 - 1;
            }
            if (this.f41402d2 == 1) {
                float max = Math.max(800.0f / this.f41408d8, 800.0f / this.f41418e8);
                this.f41428f8 = Math.round((this.f41408d8 * max) / 2.0f) * 2;
                this.f41436g8 = Math.round((this.f41418e8 * max) / 2.0f) * 2;
            } else {
                Size q02 = q0();
                this.f41428f8 = q02.getWidth();
                this.f41436g8 = q02.getHeight();
            }
            if (this.f41444h8 != 0) {
                if (this.f41402d2 == 1) {
                    this.f41444h8 = 1560000;
                    v = this.f41444h8;
                } else if (this.f41428f8 == this.f41408d8 && this.f41436g8 == this.f41418e8) {
                    this.f41444h8 = this.f41452i8;
                    v = MediaController.v(this.f41428f8, this.f41436g8, this.f41444h8, false);
                } else {
                    this.f41444h8 = MediaController.Q(this.f41418e8, this.f41408d8, this.f41452i8, this.f41436g8, this.f41428f8);
                    v = MediaController.v(this.f41428f8, this.f41436g8, this.f41444h8, false);
                }
                this.f41539s8 = ((v / 8) * this.f41461j8) / 1000.0f;
            }
        }
    }

    public final void H0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H0(boolean, boolean):void");
    }

    public final void H1() {
        org.telegram.ui.Components.ad0 ad0Var = this.D1;
        if (ad0Var != null) {
            ad0Var.b(null, 0, false, false, null, null, null);
            if (this.f41402d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.f31808b.f53511a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            pg.m mVar = this.D1.f31808b;
            mVar.q();
            CropAreaView cropAreaView2 = mVar.f53511a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f41551u2 = true;
        }
    }

    public final void H2(org.telegram.messenger.ImageReceiver r23, int r24, pg.f r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H2(org.telegram.messenger.ImageReceiver, int, pg.f):void");
    }

    public final boolean H3() {
        org.telegram.ui.Components.d30 d30Var = this.f41506p2;
        if (d30Var != null && d30Var.d && !d30Var.f32926e) {
            return true;
        }
        return false;
    }

    public final void I0() {
        if (this.D1 != null) {
            return;
        }
        org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(this.F, this.f41570w2);
        this.D1 = ad0Var;
        ad0Var.setVisibility(8);
        this.D1.a();
        this.f41420f0.addView(this.D1, this.f41420f0.indexOfChild(this.S7) - 1, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new io0(this));
    }

    public final void I1() {
        ug.c2 c2Var = this.f41518q5;
        if (c2Var == null || !c2Var.W) {
            ue.b bVar = this.f41372a0;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    gh.e eVar = ((gh.g) it.next()).f12330g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            ue.b bVar2 = this.f41382b0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            qo0 qo0Var = this.V1;
            if (qo0Var != null) {
                qo0Var.m();
            }
            ro0 ro0Var = this.W1;
            if (ro0Var != null) {
                ro0Var.m();
            }
            yp0 yp0Var = this.f41554u5;
            if (yp0Var != null) {
                yp0Var.invalidate();
            }
            yp0 yp0Var2 = this.f41573w5;
            if (yp0Var2 != null) {
                yp0Var2.invalidate();
            }
            yp0 yp0Var3 = this.f41583x5;
            if (yp0Var3 != null) {
                yp0Var3.invalidate();
            }
            yp0 yp0Var4 = this.f41593y5;
            if (yp0Var4 != null) {
                yp0Var4.invalidate();
            }
            yp0 yp0Var5 = this.f41602z5;
            if (yp0Var5 != null) {
                yp0Var5.invalidate();
            }
            no0 no0Var = this.T7;
            if (no0Var != null && no0Var.f39906f0) {
                no0Var.invalidate();
            }
            gq0 gq0Var = this.f41420f0;
            if (gq0Var != null) {
                gq0Var.invalidate();
            }
        }
    }

    public final void I2(int i3, org.telegram.ui.Components.nb0 nb0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (nb0Var != null) {
            nb0Var.a();
            nb0Var.setVisibility(8);
            ArrayList arrayList2 = this.h7;
            if (!arrayList2.isEmpty() && i3 >= 0 && i3 < arrayList2.size()) {
                Object obj = arrayList2.get(i3);
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    z10 = yeVar.f25310b;
                    str = yeVar.f25316j;
                    arrayList = yeVar.f25322p;
                } else {
                    if (obj instanceof org.telegram.messenger.bf) {
                        org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                        str = bfVar.f25316j;
                        arrayList = bfVar.f25322p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                nb0Var.setVisibility(0);
                if (this.f41402d2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nb0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    nb0Var.f36428a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(nb0Var.f36428a);
                    nb0Var.d = bitmapDrawable;
                    nb0Var.setBackground(bitmapDrawable);
                    return;
                }
                nb0Var.f36428a = null;
                nb0Var.d = null;
                nb0Var.setBackground(null);
            }
        }
    }

    public final boolean J1() {
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

    public final void J2(int r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.J2(int, boolean, boolean, boolean):void");
    }

    public final void K0() {
        org.telegram.messenger.re reVar;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.f41402d2 == 1) {
            reVar = new org.telegram.messenger.re();
            reVar.f25117k = this.E1.f53477i;
        } else {
            reVar = this.Y4.f44797c;
        }
        org.telegram.messenger.re reVar2 = reVar;
        int q10 = this.D4.q();
        int o10 = this.D4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q10, o10, config);
        ug.c2 c2Var = this.f41518q5;
        if (c2Var != null && c2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f41518q5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f41518q5.K);
            float width3 = createBitmap.getWidth();
            if ((this.f41518q5.K / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f10 = width3 / width2;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f10, ((-sourceBitmap.getHeight()) / 2.0f) * f10, (sourceBitmap.getWidth() / 2.0f) * f10, (sourceBitmap.getHeight() / 2.0f) * f10);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.D4.q(), this.D4.o(), config);
        if (this.D4.n() != null) {
            Bitmap n4 = this.D4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.D4.V);
            float width4 = createBitmap2.getWidth();
            if ((this.D4.V / 90) % 2 != 0) {
                width = n4.getHeight();
            } else {
                width = n4.getWidth();
            }
            float f11 = width4 / width;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(((-n4.getWidth()) / 2.0f) * f11, ((-n4.getHeight()) / 2.0f) * f11, (n4.getWidth() / 2.0f) * f11, (n4.getHeight() / 2.0f) * f11);
            canvas2.drawBitmap(n4, (Rect) null, rectF2, new Paint(3));
        }
        kp0 kp0Var = new kp0(this, this.E, this.U, createBitmap2, createBitmap, this.D4.V, reVar2);
        this.O1 = kp0Var;
        kp0Var.f56174s.setOnClickListener(new ym0(this, 5));
        this.O1.f56175w.setOnClickListener(new ym0(this, 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f41420f0.indexOfChild(this.f41563v5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f41420f0.getChildCount();
        }
        this.f41420f0.addView(this.O1, indexOfChild, b8.mf.c(-1.0f, -1));
        this.P1 = false;
    }

    public final boolean K1() {
        org.telegram.ui.Components.sc h12 = h1();
        if (h12 != null) {
            if (h12.M.c() || h12.f13144f.f35191e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K2(float f10, View view, boolean z10, boolean z11) {
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
        int i3 = 0;
        if (z11 && bool != null) {
            if (z10) {
                view.setVisibility(0);
            }
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new wm0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new a60(this, z10, view, 6)).start();
            return;
        }
        if (!z10) {
            i3 = 8;
        }
        view.setVisibility(i3);
        view.setAlpha(f12);
        v3();
    }

    public final void L0() {
        int q10;
        int o10;
        org.telegram.messenger.re reVar;
        Bitmap n4;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) textureView;
                q10 = b51Var.getVideoWidth();
                o10 = b51Var.getVideoHeight();
                while (true) {
                    if (q10 <= 1280 && o10 <= 1280) {
                        break;
                    }
                    q10 /= 2;
                    o10 /= 2;
                }
            } else {
                q10 = this.D4.q();
                o10 = this.D4.o();
            }
            Bitmap bitmap = this.f41601z4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q10, o10, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i3 = this.f41402d2;
            dq0 dq0Var = this.Y4;
            boolean z10 = true;
            if (i3 == 1) {
                reVar = new org.telegram.messenger.re();
                reVar.f25117k = this.E1.f53477i;
            } else {
                reVar = dq0Var.f44797c;
            }
            org.telegram.messenger.re reVar2 = reVar;
            gi.p3 p3Var = new gi.p3(this.f41437h0, false, new en0(this, 2));
            p3Var.f13362f = true;
            p3Var.f13363g = true;
            this.L1 = p3Var;
            if (this.f41562v4 == 3) {
                z10 = false;
            }
            p3Var.b(z10);
            Activity activity = this.E;
            int i10 = this.U;
            if (this.f41533s1) {
                n4 = null;
            } else {
                n4 = this.D4.n();
            }
            lp0 lp0Var = new lp0(this, activity, activity, i10, bitmap2, n4, this.D4.V, dq0Var.f44798e, reVar2, new xm0(this, 14), this.f41570w2);
            this.M1 = lp0Var;
            gh.g c2 = this.Z.c(lp0Var.M0, null, false);
            c2.p(b8.cd.i(this.f41570w2));
            lp0Var.setBlurredBackgroundDrawableForTools(c2);
            this.f41420f0.addView(this.M1.getView(), b8.mf.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new xm0(this, 15));
            this.M1.getCancelView().setOnClickListener(new ym0(this, 8));
            this.M1.t0(org.telegram.messenger.g0.L(126.0f));
            this.M1.setOffsetTranslationX(-org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final boolean L1() {
        int i3;
        if (this.f41451i7 != null && (i3 = this.Q4) >= 0) {
            ArrayList arrayList = this.g7;
            if (i3 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.Q4);
                org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) this.f41389b7.get(this.Q4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f41451i7.f21488f;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (acVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = acVar.f21488f;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f41451i7.f21488f;
                    if (i12 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void L2(View view, boolean z10, boolean z11) {
        K2(1.0f, view, z10, z11);
    }

    public final void M0() {
        sq0 sq0Var = new sq0(this.f41420f0.getContext(), this);
        this.f41456j3 = sq0Var;
        this.f41420f0.addView(sq0Var, b8.mf.e(-1, 48, 83));
        io0 io0Var = new io0(this);
        zo0 zo0Var = new zo0(this, io0Var);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(7, this.f41420f0.getContext(), this);
        this.f41535s3 = r0Var;
        r0Var.setAccessibilityDelegate(zo0Var);
        this.f41535s3.setImportantForAccessibility(1);
        this.f41456j3.addView(this.f41535s3, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.o51 o51Var = new org.telegram.ui.Components.o51(this.f41535s3);
        this.f41526r3 = o51Var;
        o51Var.f36741z = org.telegram.messenger.g0.L(2.0f);
        org.telegram.ui.Components.o51 o51Var2 = this.f41526r3;
        o51Var2.f36727k = 872415231;
        o51Var2.f36728l = 872415231;
        o51Var2.f36729m = -1;
        o51Var2.f36730n = -1;
        o51Var2.A = 1509949439;
        o51Var2.f36726j = io0Var;
        ap0 ap0Var = new ap0(this, this.f41420f0.getContext(), new gn0(this));
        this.f41543t3 = ap0Var;
        ap0Var.setAlpha(0.0f);
        this.f41420f0.addView(this.f41543t3, b8.mf.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this.f41420f0.getContext());
        this.f41507p3 = k5Var;
        k5Var.setTextColor(-1);
        this.f41507p3.setGravity(53);
        this.f41507p3.setTextSize(14);
        this.f41507p3.setImportantForAccessibility(2);
        this.f41456j3.addView(this.f41507p3, b8.mf.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f41420f0.getContext());
        this.f41516q3 = imageView;
        imageView.setImageResource(2131232252);
        this.f41516q3.setContentDescription(org.telegram.messenger.bd.M0(2131754724, "AccExitFullscreen"));
        this.f41516q3.setScaleType(ImageView.ScaleType.CENTER);
        this.f41516q3.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        this.f41516q3.setVisibility(4);
        this.f41456j3.addView(this.f41516q3, b8.mf.e(48, 48, 53));
        this.f41516q3.setOnClickListener(new ln0(this, 6));
    }

    public final boolean M1(hq0 hq0Var) {
        if (hq0Var != null) {
            Object g7 = hq0Var.g();
            if (g7 instanceof org.telegram.messenger.zi) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) g7;
                if (ziVar.f26868k != null) {
                    if (org.telegram.messenger.hp.s1(this.U).A2(org.telegram.messenger.zi.B0(ziVar.f26868k)) || ziVar.f26868k.noforwards || ziVar.z2()) {
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

    public final void M2(boolean z10, boolean z11) {
        if (this.f41532s0.getVisibility() != 0) {
            this.f41578x0.f49869f.t("", z10, true);
        } else if (Math.abs(this.f41550u1 - 1.0f) < 0.001f) {
            this.f41578x0.f49869f.t("", z10, true);
        } else {
            org.telegram.ui.Components.g6 g6Var = this.f41578x0.f49869f;
            g6Var.t(org.telegram.ui.Components.cu0.a(this.f41550u1) + "x", z10, true);
        }
        this.f41532s0.e(z10, this.f41550u1);
        s51 s51Var = this.J0;
        float f10 = this.f41550u1;
        org.telegram.ui.ActionBar.y0[] y0VarArr = (org.telegram.ui.ActionBar.y0[]) s51Var.f49370b;
        for (int i3 = 0; i3 < y0VarArr.length; i3++) {
            if (z11 && ((i3 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i3 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i3 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i3 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i3 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                y0VarArr[i3].d(-9718023, -9718023);
            } else {
                y0VarArr[i3].d(-328966, -328966);
            }
        }
    }

    public final void N0(org.telegram.messenger.ze zeVar) {
        org.telegram.ui.Components.ca caVar;
        if (this.C2 == null) {
            org.telegram.ui.Components.zd0 zd0Var = new org.telegram.ui.Components.zd0(2, this.E, this);
            this.f41599z2 = zd0Var;
            zd0Var.setWillNotDraw(false);
            this.f41599z2.setVisibility(4);
            this.f41420f0.addView(this.f41599z2, 0, b8.mf.e(-1, -1, 17));
            this.E2 = false;
            if (this.h7.isEmpty()) {
                if (this.f41381b && this.U2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(this.E, this.G2);
                this.f41392c0.e();
                org.telegram.ui.Components.x9 x9Var = this.f41392c0;
                b51Var.f32094s = x9Var;
                org.telegram.ui.Components.py pyVar = b51Var.f32088b;
                if (pyVar != null && (caVar = pyVar.J) != null) {
                    org.telegram.ui.Components.x9 x9Var2 = caVar.f32638t;
                    if (x9Var2 != null && x9Var2.f40281m != null) {
                        x9Var2.f40281m = null;
                    }
                    caVar.f32638t = x9Var;
                    if (x9Var != null && x9Var.f40281m != caVar) {
                        x9Var.f40281m = caVar;
                        x9Var.d();
                    }
                }
                if (zeVar != null) {
                    b51Var.setDelegate(new zm0(zeVar, 0));
                }
                this.C2 = b51Var;
            }
            SurfaceTexture surfaceTexture = this.U2;
            if (surfaceTexture != null) {
                this.C2.setSurfaceTexture(surfaceTexture);
                this.I3 = true;
                this.J3 = true;
                this.U2 = null;
            }
            TextureView textureView = this.C2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.C2.setPivotY(0.0f);
                this.C2.setOpaque(false);
                this.f41599z2.addView(this.C2, b8.mf.e(-1, -1, 17));
            } else {
                this.f41599z2.addView(this.D2, b8.mf.e(-1, -1, 17));
            }
            fq0 fq0Var = new fq0(this.E, this);
            this.F2 = fq0Var;
            fq0Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f41599z2.addView(this.F2, b8.mf.e(-1, -1, 17));
            View view = new View(this.E);
            this.Q8 = view;
            this.f41599z2.addView(view, b8.mf.c(-1.0f, -1));
            if (this.f41402d2 == 1) {
                View view2 = new View(this.E);
                this.A2 = view2;
                view2.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.f41599z2.addView(this.A2, b8.mf.e(-1, -1, 17));
            }
            uf.d dVar = this.H2;
            if (dVar != null) {
                org.telegram.ui.Components.zd0 zd0Var2 = this.f41599z2;
                dVar.f55855i.L(zd0Var2);
                dVar.f55856j = zd0Var2;
                if (zd0Var2 != null) {
                    dVar.e(zd0Var2);
                }
                this.H2.f55857k = this.Q8;
            }
        }
    }

    public final void N2(Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        gq0 gq0Var;
        cg.u0 u0Var = this.f41493n7;
        if (u0Var != null) {
            u0Var.b();
            this.f41493n7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        this.f41493n7 = launchActivity != null ? new cg.u0(launchActivity, true) : null;
        Activity parentActivity = activity != null ? activity : d2Var.getParentActivity();
        org.telegram.ui.ActionBar.k6.K(parentActivity, false);
        this.f41570w2 = e6Var;
        this.n4 = d2Var;
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.U = i3;
        this.D4.d = i3;
        this.C4.d = i3;
        this.E4.d = i3;
        qo0 qo0Var = this.V1;
        if (qo0Var != null) {
            qo0Var.setAccount(i3);
            this.V1.f13144f.k(false);
        }
        ro0 ro0Var = this.W1;
        if (ro0Var != null) {
            ro0Var.setAccount(this.U);
            this.W1.f13144f.k(false);
        }
        ug.c2 c2Var = this.f41518q5;
        if (c2Var != null) {
            c2Var.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.f41531s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.f41598z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (V8 == null) {
                V8 = new Drawable[]{f0.d.d(this.E, 2131231006), f0.d.d(this.E, 2131230931), f0.d.d(this.E, 2131231635)};
            }
            this.W6 = new Scroller(parentActivity);
            lq0 lq0Var = new lq0(this, parentActivity);
            this.f41437h0 = lq0Var;
            lq0Var.setBackground(this.M0);
            this.f41437h0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f41445i0 = clippingImageView;
            clippingImageView.O = this.f41474l4;
            clippingImageView.L = false;
            clippingImageView.N = false;
            this.f41437h0.addView(clippingImageView, b8.mf.c(40.0f, 40));
            gq0 gq0Var2 = new gq0(this, parentActivity, parentActivity);
            this.f41420f0 = gq0Var2;
            gq0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f41395c4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f41420f0);
            }
            this.f41420f0.setClipChildren(true);
            this.f41420f0.setClipToPadding(true);
            this.f41437h0.setClipChildren(false);
            this.f41437h0.setClipToPadding(false);
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(this.f41420f0);
            this.f41392c0 = x9Var;
            x9Var.f40271a = 1;
            this.Y = new xn0(this);
            this.f41382b0 = new ue.b();
            this.f41372a0 = new ue.b();
            eh.c cVar = new eh.c(this.Y);
            this.Z = cVar;
            cVar.g(new kh.k(this.f41420f0), this.f41420f0);
            this.Z.f(this.f41382b0);
            this.f41400d0 = new org.telegram.ui.Components.ba(this.f41392c0, this.f41420f0);
            this.f41437h0.addView(this.f41420f0, b8.mf.e(-1, -1, 51));
            r0.i0.l(this.f41420f0, new gn0(this));
            this.f41420f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f41410e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.g0.m(layoutParams);
            this.f41410e0.flags = -2147286784;
            org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0(this.E);
            this.f41601z4 = nb0Var;
            this.f41420f0.addView(nb0Var, b8.mf.c(-2.0f, -2));
            org.telegram.ui.Components.nb0 nb0Var2 = new org.telegram.ui.Components.nb0(this.E);
            this.A4 = nb0Var2;
            this.f41420f0.addView(nb0Var2, b8.mf.c(-2.0f, -2));
            org.telegram.ui.Components.nb0 nb0Var3 = new org.telegram.ui.Components.nb0(this.E);
            this.B4 = nb0Var3;
            this.f41420f0.addView(nb0Var3, b8.mf.c(-2.0f, -2));
            org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(4, parentActivity, this);
            this.G = p7Var;
            p7Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.f41531s);
            this.G.C(1090519039, false);
            this.G.D(-1, false);
            this.G.setBackButtonImage(2131231240);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            jq0 jq0Var = new jq0(parentActivity);
            this.N = jq0Var;
            this.G.addView(jq0Var, b8.mf.e(-1, -1, 119));
            this.f41420f0.addView(this.G, b8.mf.c(-2.0f, -1));
            iq0 iq0Var = new iq0(parentActivity);
            this.O = iq0Var;
            this.f41420f0.addView(iq0Var, b8.mf.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new ho0(this, e6Var));
            org.telegram.ui.ActionBar.x q10 = this.G.q();
            this.B0 = q10;
            q10.setOnLayoutListener(new xm0(this, 18));
            org.telegram.ui.ActionBar.q0 a10 = this.B0.a(26, 2131231785);
            this.F0 = a10;
            a10.setContentDescription(org.telegram.messenger.bd.L0(2131751599));
            b8.pf.a(this.F0);
            L2(this.F0, false, false);
            org.telegram.ui.ActionBar.q0 a11 = this.B0.a(11, 2131232217);
            this.E0 = a11;
            a11.setContentDescription(org.telegram.messenger.bd.L0(2131748687));
            org.telegram.ui.ActionBar.q0 a12 = this.B0.a(18, 2131232180);
            this.D0 = a12;
            a12.setContentDescription(org.telegram.messenger.bd.L0(2131754810));
            org.telegram.ui.ActionBar.q0 a13 = this.B0.a(4, 2131232181);
            this.C0 = a13;
            a13.setContentDescription(org.telegram.messenger.bd.L0(2131750588));
            org.telegram.ui.ActionBar.x xVar = this.B0;
            tq tqVar = new tq(2131232795, this.F, new ei.b());
            this.f41578x0 = tqVar;
            org.telegram.ui.ActionBar.q0 d = xVar.d(1, tqVar);
            this.f41513q0 = d;
            this.f41578x0.setCallback(d.getIconView());
            this.f41513q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f41513q0.getPopupLayout().f27334c = true;
            this.f41513q0.getPopupLayout().setFitItems(true);
            this.f41513q0.setMenuXOffset(org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(this.F, e6Var);
            this.f41532s0 = u0Var2;
            u0Var2.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f41532s0.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            this.f41532s0.setDrawShadow(false);
            this.f41532s0.setBackgroundColor(-14540254);
            this.f41532s0.setTextColor(-1);
            this.f41532s0.setLabel(org.telegram.messenger.bd.L0(2131743597));
            this.f41532s0.setOnValueChange(new fn0(this, 1));
            this.f41513q0.getPopupLayout().a(this.f41532s0, b8.mf.o(-1, 44));
            org.telegram.ui.ActionBar.c1 a14 = this.f41513q0.a(-1);
            this.A0 = a14;
            a14.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f41513q0.getPopupLayout();
            s51 s51Var = new s51(this.F, new gn0(this));
            this.J0 = s51Var;
            popupLayout.addView(s51Var);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.f41588y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f41513q0.getPopupLayout().addView(this.f41588y0);
            org.telegram.ui.ActionBar.y0 e10 = this.f41513q0.e(22, 2131231913, org.telegram.messenger.bd.L0(2131743598));
            this.f41540t0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.k7 k7Var = new org.telegram.ui.Components.k7(this, this.F, 1);
            this.H0 = k7Var;
            try {
                k7Var.setRouteSelector(f6.a.c(this.F).a());
                z10 = true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.f(e11);
                z10 = false;
            }
            this.H0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.y0 e12 = this.f41513q0.e(24, 2131231912, org.telegram.messenger.bd.L0(2131743599));
                this.G0 = e12;
                e12.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, b8.mf.c(-1.0f, -1));
            }
            this.f41513q0.H(-115203550);
            this.f41513q0.setOnMenuDismiss(new en0(this, 8));
            org.telegram.ui.ActionBar.q0 a15 = this.B0.a(0, 2131231749);
            this.f41504p0 = a15;
            a15.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
            this.f41504p0.setOnClickListener(new ln0(this, 3));
            this.f41504p0.setOnMenuDismiss(new en0(this, 9));
            this.f41504p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f41504p0.getPopupLayout().f27334c = true;
            this.f41504p0.getPopupLayout().setFitItems(true);
            this.K0 = new rq(this.F, this.f41504p0.getPopupLayout().getSwipeBack(), new gn0(this));
            org.telegram.ui.ActionBar.y0 h = this.f41504p0.h(2131232167, null, org.telegram.messenger.bd.L0(2131745939), this.K0.f49261a);
            h.d(-328966, -328966);
            this.f41549u0 = h;
            h.setOnClickListener(new ln0(this, 4));
            org.telegram.ui.ActionBar.c1 a16 = this.f41504p0.a(-1);
            this.f41558v0 = a16;
            a16.setColor(-15198184);
            this.f41504p0.e(10, 2131232265, org.telegram.messenger.bd.L0(2131747804)).d(-328966, -328966);
            org.telegram.ui.ActionBar.y0 e13 = this.f41504p0.e(6, 2131231914, org.telegram.messenger.bd.L0(2131747230));
            e13.d(-328966, -328966);
            this.f41568w0 = e13;
            org.telegram.ui.ActionBar.y0 e14 = this.f41504p0.e(3, 2131232219, org.telegram.messenger.bd.L0(2131745357));
            this.f41523r0 = e14;
            e14.d(-328966, -328966);
            this.f41504p0.e(12, 2131232170, org.telegram.messenger.bd.L0(2131745940)).d(-328966, -328966);
            this.f41504p0.e(5, 2131232224, org.telegram.messenger.bd.L0(2131745352)).d(-328966, -328966);
            this.f41504p0.e(25, 2131232382, org.telegram.messenger.bd.L0(2131751705)).d(-328966, -328966);
            this.f41504p0.e(21, 2131231876, org.telegram.messenger.bd.L0(2131746271)).d(-328966, -328966);
            this.f41504p0.e(23, 2131232333, org.telegram.messenger.bd.L0(2131746222)).d(-328966, -328966);
            this.f41504p0.e(9, 2131232365, org.telegram.messenger.bd.L0(2131745469)).d(-328966, -328966);
            this.f41504p0.e(13, 2131232382, org.telegram.messenger.bd.L0(2131745338)).d(-328966, -328966);
            this.f41504p0.e(14, 2131232266, org.telegram.messenger.bd.L0(2131745552)).d(-328966, -328966);
            this.f41504p0.e(19, 2131232408, org.telegram.messenger.bd.L0(2131743966)).d(-328966, -328966);
            this.f41504p0.e(20, 2131232408, org.telegram.messenger.bd.L0(2131749312)).d(-328966, -328966);
            this.f41504p0.e(7, 2131232108, org.telegram.messenger.bd.L0(2131751599)).d(-328966, -328966);
            this.f41504p0.e(8, 2131232087, org.telegram.messenger.bd.L0(2131744849)).d(-328966, -328966);
            this.f41504p0.H(-115203550);
            this.f41504p0.t(19);
            this.f41504p0.t(20);
            M2(false, true);
            this.f41504p0.setPopupItemsSelectorColor(268435455);
            this.f41504p0.setSubMenuDelegate(new io0(this));
            yg0 yg0Var = new yg0(this.F, 1);
            this.f41453j0 = yg0Var;
            yg0Var.setBackgroundColor(2130706432);
            this.f41420f0.addView(this.f41453j0, b8.mf.e(-1, 48, 83));
            View view = new View(this.F);
            this.f41462k0 = view;
            view.setBackgroundColor(this.f41402d2 == 11 ? -16777216 : 2130706432);
            this.f41437h0.addView(this.f41462k0, b8.mf.a(-1.0f, this.f41470l0 / org.telegram.messenger.g0.f22607p, 87));
            this.f41569w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f41569w1[0].setShape(0);
            this.f41569w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f41569w1[1].setShape(0);
            org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(this.F, org.telegram.messenger.g0.L(10.0f));
            this.m1 = h20Var;
            this.f41420f0.addView(h20Var, b8.mf.e(-1, 68, 83));
            this.m1.setDelegate(new ko0(this));
            for (int i10 = 0; i10 < 3; i10++) {
                this.f41600z3[i10] = new ImageView(this.E);
                this.f41600z3[i10].setImageResource(2131232218);
                this.f41600z3[i10].setContentDescription(org.telegram.messenger.bd.M0(2131754718, "AccSwitchToFullscreen"));
                this.f41600z3[i10].setScaleType(ImageView.ScaleType.CENTER);
                this.f41600z3[i10].setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
                this.f41600z3[i10].setVisibility(4);
                this.f41600z3[i10].setAlpha(1.0f);
                this.f41420f0.addView(this.f41600z3[i10], b8.mf.c(48.0f, 48));
                this.f41600z3[i10].setOnClickListener(new ln0(this, 5));
            }
            this.R = new lo0(new ei.b());
            cq0 cq0Var = new cq0(this.f41420f0.getContext());
            this.R1 = cq0Var;
            cq0Var.setFactory(new td0(this, 2));
            this.R1.setVisibility(4);
            B2(true);
            for (int i11 = 0; i11 < 3; i11++) {
                this.X0[i11] = new mo0(this, this.f41420f0);
                this.X0[i11].d(0, false, true);
            }
            yc ycVar = new yc(this, this.F, e6Var);
            this.Y0 = ycVar;
            ycVar.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(org.telegram.messenger.g0.L(54.0f));
            this.Y0.setBackgroundResource(2131231006);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f41420f0.addView(this.Y0, b8.mf.e(64, 64, 17));
            M0();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, e6Var);
            this.R7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.R7.setBackgroundResource(2131231006);
            this.R7.setVisibility(4);
            this.f41420f0.addView(this.R7, b8.mf.e(54, 54, 17));
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this.E, 3);
            this.Q7 = v0Var;
            v0Var.setBackgroundColor(2130706432);
            this.Q7.b();
            this.Q7.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            ((TextView) this.Q7.f30707b).setText(org.telegram.messenger.bd.M0(2131751355, "Done").toUpperCase());
            int i12 = org.telegram.ui.ActionBar.k6.f28071ng;
            org.telegram.ui.ActionBar.r6.V((TextView) this.Q7.f30707b, i12, e6Var);
            this.f41420f0.addView(this.Q7, b8.mf.e(-1, 48, 83));
            ((TextView) this.Q7.d).setOnClickListener(new ym0(this, 2));
            ((TextView) this.Q7.f30707b).setOnClickListener(new ym0(this, 3));
            org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(false);
            this.A1 = d51Var;
            d51Var.c(new io0(this));
            gq0 gq0Var3 = this.f41420f0;
            Objects.requireNonNull(gq0Var3);
            this.B1 = new org.telegram.ui.Components.tm0(new sg0(gq0Var3, 16), false);
            nq0 nq0Var = new nq0(this.E, this);
            this.P7 = nq0Var;
            nq0Var.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            this.P7.setVisibility(4);
            this.P7.setBackgroundColor(2130706432);
            this.f41420f0.addView(this.P7, b8.mf.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            ci.t4 t4Var = new ci.t4(this, this.F);
            this.Q0 = t4Var;
            this.f41420f0.addView(t4Var, b8.mf.e(-1, -2, 83));
            TextView textView = new TextView(this.f41420f0.getContext());
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
            this.Q0.addView(this.m0, b8.mf.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f41420f0.getContext());
            this.f41487n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.f41487n0.setSingleLine(true);
            this.f41487n0.setMaxLines(1);
            this.f41487n0.setEllipsize(truncateAt);
            this.f41487n0.setTextColor(-1);
            this.f41487n0.setGravity(3);
            this.Q0.addView(this.f41487n0, b8.mf.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f41420f0.getContext());
            this.f41495o0 = textView4;
            int i13 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.y5.e(B1(i13), 6.0f), org.telegram.ui.ActionBar.r6.N(i13), org.telegram.ui.ActionBar.r6.f(i13), e6Var);
            TextView textView5 = this.f41495o0;
            int i14 = org.telegram.ui.ActionBar.k6.Gi;
            org.telegram.ui.ActionBar.r6.V(textView5, i14, e6Var);
            this.f41495o0.setEllipsize(truncateAt);
            this.f41495o0.setGravity(17);
            this.f41495o0.setLines(1);
            this.f41495o0.setSingleLine(true);
            this.f41495o0.setText(org.telegram.messenger.bd.M0(2131745551, "SetAsMyPhoto"));
            this.f41495o0.setTextSize(1, 15.0f);
            this.f41495o0.setTypeface(org.telegram.messenger.g0.o());
            this.f41495o0.setOnClickListener(new ym0(this, 4));
            this.f41495o0.setVisibility(8);
            this.Q0.addView(this.f41495o0, b8.mf.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            no0 no0Var = new no0(this.E, this);
            this.T7 = no0Var;
            no0Var.setDelegate(new com.google.android.gms.common.api.internal.s(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.S7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.S7.addView(this.T7, b8.mf.e(-1, 54, 83));
            f3(false, false);
            this.f41420f0.addView(this.S7, b8.mf.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                gh.g a17 = this.Z.a(q0Var);
                a17.p(b8.cd.i(e6Var));
                a17.r(org.telegram.messenger.g0.L(20.0f));
                a17.q(org.telegram.messenger.g0.L(7.0f));
                q0Var.setBackground(jh.d.d(a17, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f)));
            }
            oo0 oo0Var = new oo0(this.E, org.telegram.messenger.bd.L0(2131751209));
            this.f41438h1 = oo0Var;
            gh.g a18 = this.Z.a(oo0Var);
            a18.p(b8.cd.i(e6Var));
            oo0Var.setBlurredBackgroundDrawable(a18);
            b8.pf.a(this.f41438h1);
            this.f41438h1.setOnClickListener(new ym0(this, 7));
            this.f41420f0.addView(this.f41438h1, b8.mf.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(this.E, e6Var, this.f41392c0);
            this.r5 = od0Var;
            org.telegram.ui.Components.ps psVar = od0Var.f36808c;
            gh.g a19 = this.Z.a(psVar);
            a19.p(b8.cd.i(e6Var));
            psVar.setBlurredBackgroundDrawable(a19);
            b8.pf.a(this.r5.f36808c);
            this.r5.setVisibility(8);
            this.r5.setAlpha(0.0f);
            this.r5.setOnClose(new xm0(this, 12));
            this.f41420f0.addView(this.r5, b8.mf.e(-1, -1, 119));
            this.r5.f36807b.setOnClickListener(new ym0(this, 9));
            this.r5.setOnGalleryImage(new en0(this, 3));
            org.telegram.ui.ActionBar.e0 e0Var = new org.telegram.ui.ActionBar.e0(3, this.E, this);
            this.f41421f1 = e0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            e0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.e0 e0Var2 = this.f41421f1;
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(this.E);
            this.f41411e1 = szVar;
            e0Var2.setImageDrawable(szVar);
            this.f41421f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.e0 e0Var3 = this.f41421f1;
            gh.g a20 = this.Z.a(e0Var3);
            a20.p(b8.cd.i(null));
            a20.q(org.telegram.messenger.g0.L(4.0f));
            a20.r(org.telegram.messenger.g0.L(16.0f));
            e0Var3.setBackground(a20);
            b8.pf.a(this.f41421f1);
            this.f41420f0.addView(this.f41421f1, b8.mf.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f41421f1.setOnClickListener(new ym0(this, 10));
            org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(this.f41420f0.getContext());
            this.f41430g1 = u70Var;
            u70Var.setOnClickListener(new ym0(this, 11));
            this.f41420f0.addView(this.f41430g1, b8.mf.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f41420f0.getContext();
            lq0 lq0Var2 = this.f41437h0;
            gq0 gq0Var4 = this.f41420f0;
            qo0 qo0Var2 = new qo0(this, context, lq0Var2, gq0Var4, gq0Var4, e6Var, this.f41392c0, new xm0(this, 19));
            this.V1 = qo0Var2;
            qo0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new en0(this, 4));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new en0(this, 5));
            this.V1.setOnAddPhotoClick(new ym0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.F;
            lq0 lq0Var3 = this.f41437h0;
            gq0 gq0Var5 = this.f41420f0;
            ro0 ro0Var2 = new ro0(this, contextThemeWrapper, lq0Var3, gq0Var5, gq0Var5, e6Var, this.f41392c0, new xm0(this, 19));
            this.W1 = ro0Var2;
            ro0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new en0(this, 6));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new en0(this, 7));
            this.W1.setOnAddPhotoClick(new ym0(this, 13));
            ei.e3 e3Var = new ei.e3(this, this.F);
            this.f41545t5 = e3Var;
            e3Var.setVisibility(8);
            this.f41420f0.addView(this.f41545t5, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            ug.c2 c2Var2 = new ug.c2(this.F, e6Var);
            this.f41518q5 = c2Var2;
            c2Var2.setCurrentAccount(this.U);
            this.f41420f0.addView(this.f41518q5, gq0Var.indexOfChild(this.G) - 1, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            yp0 yp0Var = new yp0(this);
            this.f41554u5 = yp0Var;
            yp0Var.setRad(18);
            this.f41554u5.l();
            this.f41518q5.setStickerCutOutBtn(this.f41554u5);
            this.f41554u5.setOnClickListener(new ym0(this, 14));
            this.f41554u5.setCutOutState(false);
            this.f41420f0.addView(this.f41554u5, b8.mf.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.f41563v5 = linearLayout2;
            linearLayout2.setOrientation(0);
            yp0 yp0Var2 = new yp0(this);
            this.f41573w5 = yp0Var2;
            yp0Var2.f56258r0 = true;
            yp0Var2.setRad(18);
            this.f41573w5.setEraseState(false);
            this.f41573w5.setOnClickListener(new ym0(this, 15));
            this.f41563v5.addView(this.f41573w5, b8.mf.o(-2, 36));
            this.f41563v5.addView(new Space(this.E), b8.mf.o(12, -1));
            yp0 yp0Var3 = new yp0(this);
            this.f41583x5 = yp0Var3;
            yp0Var3.f56258r0 = true;
            yp0Var3.setRad(18);
            this.f41583x5.setRestoreState(false);
            this.f41583x5.setOnClickListener(new ym0(this, 16));
            this.f41563v5.addView(this.f41583x5, b8.mf.o(-2, 36));
            this.f41420f0.addView(this.f41563v5, b8.mf.e(-2, 36, 17));
            yp0 yp0Var4 = new yp0(this);
            this.f41593y5 = yp0Var4;
            yp0Var4.setUndoState(false);
            this.f41593y5.setRad(18);
            yp0 yp0Var5 = this.f41593y5;
            yp0Var5.f56258r0 = true;
            yp0Var5.setOnClickListener(new ym0(this, 17));
            this.f41420f0.addView(this.f41593y5, b8.mf.e(-2, 36, 17));
            yp0 yp0Var6 = new yp0(this);
            this.f41602z5 = yp0Var6;
            yp0Var6.setOutlineState(false);
            this.f41602z5.setRad(18);
            yp0 yp0Var7 = this.f41602z5;
            yp0Var7.f56258r0 = true;
            yp0Var7.setOnClickListener(new ym0(this, 18));
            this.f41420f0.addView(this.f41602z5, b8.mf.e(-2, 36, 17));
            Z2(false, false);
            d3(false, false);
            l0 l0Var = new l0(19, this.E, this);
            this.Y1 = l0Var;
            l0Var.addView(this.V1, b8.mf.e(-1, -1, 83));
            this.f41420f0.addView(this.Y1, b8.mf.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, b8.mf.e(-1, -1, 51));
            this.f41420f0.addView(this.Z1, b8.mf.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f41420f0.addView(frameLayout3, b8.mf.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f41420f0.addView(frameLayout4, b8.mf.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.U7 = textView6;
            textView6.setSingleLine(true);
            this.U7.setVisibility(8);
            this.U7.setText(org.telegram.messenger.bd.M0(2131752133, "ChooseCover"));
            this.U7.setGravity(1);
            this.U7.setTextSize(1, 14.0f);
            this.U7.setTextColor(-7566196);
            this.f41420f0.addView(this.U7, b8.mf.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            mi.x1 x1Var = new mi.x1(this, this.E, e6Var);
            this.T0 = x1Var;
            int L = org.telegram.messenger.g0.L(52.0f);
            int L2 = org.telegram.messenger.g0.L(38.0f);
            x1Var.J = L;
            x1Var.K = L2;
            mi.x1 x1Var2 = this.T0;
            x1Var2.f32192i0 = true;
            gh.g a21 = this.Z.a(x1Var2);
            a21.p(b8.cd.i(e6Var));
            x1Var2.setBlurredBackgroundDrawable(a21);
            this.f41420f0.addView(this.T0, b8.mf.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(org.telegram.messenger.bd.M0(2131745650, "Send"));
            b8.pf.a(this.T0);
            this.T0.setOnClickListener(new ym0(this, 19));
            this.T0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.pd0 pd0Var = new org.telegram.ui.Components.pd0(this.E);
            this.U0 = pd0Var;
            LinearLayout linearLayout3 = pd0Var.f37139b;
            gh.g a22 = this.Z.a(linearLayout3);
            a22.p(b8.cd.i(e6Var));
            a22.r(org.telegram.messenger.g0.L(18.0f));
            a22.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout3.setBackground(a22);
            LinearLayout linearLayout4 = this.U0.f37140c;
            gh.g a23 = this.Z.a(linearLayout4);
            a23.p(b8.cd.i(e6Var));
            a23.r(org.telegram.messenger.g0.L(18.0f));
            a23.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout4.setBackground(a23);
            this.U0.setVisibility(8);
            this.U0.f37139b.setOnClickListener(new ym0(this, 20));
            this.U0.f37140c.setOnClickListener(new ym0(this, 21));
            this.f41420f0.addView(this.U0, b8.mf.e(-1, 56, 80));
            s51 s51Var2 = new s51(20, this.E, this);
            this.I0 = s51Var2;
            s51Var2.setOrientation(0);
            this.I0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            s51 s51Var3 = this.I0;
            gh.g a24 = this.Z.a(s51Var3);
            a24.p(b8.cd.i(e6Var));
            a24.q(org.telegram.messenger.g0.L(2.0f));
            a24.r(org.telegram.messenger.g0.L(22.0f));
            s51Var3.setBackground(a24);
            this.Q0.addView(this.I0, b8.mf.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.f41373a1 = imageView;
            imageView.setScaleType(scaleType);
            this.f41373a1.setImageResource(2131231729);
            this.f41373a1.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f41373a1, b8.mf.o(48, 48));
            this.f41373a1.setOnClickListener(new ym0(this, 22));
            this.f41373a1.setContentDescription(org.telegram.messenger.bd.M0(2131751699, "CropImage"));
            ImageView imageView2 = new ImageView(this.E);
            this.f41393c1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f41393c1.setImageResource(2131232282);
            this.f41393c1.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f41393c1, b8.mf.o(48, 48));
            this.f41393c1.setOnClickListener(new ym0(this, 23));
            this.f41393c1.setContentDescription(org.telegram.messenger.bd.M0(2131754783, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.E);
            this.f41383b1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f41383b1.setImageResource(2131231742);
            this.f41383b1.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f41383b1, b8.mf.o(48, 48));
            this.f41383b1.setOnClickListener(new ym0(this, 24));
            this.f41383b1.setContentDescription(org.telegram.messenger.bd.M0(2131754840, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.E);
            this.Z0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Z0.setImageResource(2131231739);
            this.Z0.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.Z0, b8.mf.o(48, 48));
            this.Z0.setOnClickListener(new ym0(this, 25));
            this.Z0.setContentDescription(org.telegram.messenger.bd.M0(2131754810, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(this.E);
            this.k1 = z41Var;
            z41Var.setTag(1);
            this.k1.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.Z7 = y2();
            this.k1.a(Math.min(this.f41428f8, this.f41436g8), this.f41478l8 && this.f41380a8 > 1, this.f41522r);
            this.k1.setContentDescription(org.telegram.messenger.bd.M0(2131754735, "AccDescrVideoQuality"));
            this.I0.addView(this.k1, b8.mf.o(48, 48));
            this.k1.setOnClickListener(new hb0(8, this, parentActivity));
            ImageView imageView5 = new ImageView(this.E);
            this.f41401d1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f41401d1.setImageResource(2131231756);
            this.f41401d1.setBackground(org.telegram.ui.ActionBar.k6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f41401d1, b8.mf.o(48, 48));
            this.f41401d1.setOnClickListener(new ym0(this, 26));
            this.f41401d1.setContentDescription(org.telegram.messenger.bd.M0(2131754811, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(this.F, 3);
            this.V0 = v0Var2;
            v0Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f41420f0.addView(this.V0, b8.mf.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new ym0(this, 27));
            ((TextView) this.V0.f30707b).setOnClickListener(new ym0(this, 28));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(-12763843, 0));
            this.W0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
            this.W0.setText(org.telegram.messenger.bd.L0(2131751697).toUpperCase());
            this.W0.setTypeface(org.telegram.messenger.g0.o());
            this.V0.addView(this.W0, b8.mf.e(-2, -1, 49));
            this.W0.setOnClickListener(new ym0(this, 29));
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(this.f41420f0.getContext(), this);
            this.s6 = v00Var;
            v00Var.b();
            this.f41546t6 = true;
            this.s6.h = this;
            gn0 gn0Var = new gn0(this);
            this.D4.H0(this.f41420f0);
            ImageReceiver imageReceiver = this.D4;
            imageReceiver.f21254l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.d0(gn0Var);
            this.C4.H0(this.f41420f0);
            ImageReceiver imageReceiver2 = this.C4;
            imageReceiver2.f21254l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.d0(gn0Var);
            this.E4.H0(this.f41420f0);
            ImageReceiver imageReceiver3 = this.E4;
            imageReceiver3.f21254l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.d0(gn0Var);
            int rotation = ((WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f41420f0.getContext(), 2131232690);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(org.telegram.messenger.g0.L(1.0f));
            this.O0.c(B1(i12), -1);
            this.O0.setVisibility(8);
            this.f41420f0.addView(this.O0, b8.mf.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
            if (!this.f41531s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f22602m;
            }
            this.O0.setOnClickListener(new ln0(this, 0));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            this.f41420f0.addView(counterView, b8.mf.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
            if (!this.f41531s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f22602m;
            }
            this.P0.setOnClickListener(new ln0(this, 1));
            rq0 rq0Var = new rq0(this.E);
            this.f41505p1 = rq0Var;
            rq0Var.setVisibility(8);
            this.f41505p1.setAlpha(0.0f);
            this.f41505p1.setLayoutManager(new kg.y());
            rq0 rq0Var2 = this.f41505p1;
            n4 n4Var = new n4(15, this, this.E);
            this.f41514q1 = n4Var;
            rq0Var2.setAdapter(n4Var);
            this.f41420f0.addView(this.f41505p1, b8.mf.e(-1, 103, 51));
            this.f41505p1.setOnItemClickListener(new h(this, 22));
            UndoView undoView = new UndoView(this.F, null, false, e6Var);
            this.f41496o1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(112.0f));
            this.f41496o1.h(-115203550, -1);
            this.f41420f0.addView(this.f41496o1, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.g0.C1()) {
                View view2 = new View(this.F);
                this.U3 = view2;
                view2.setContentDescription(org.telegram.messenger.bd.M0(2131754929, "AccActionPlay"));
                this.U3.setFocusable(true);
                this.U3.setOnClickListener(new ln0(this, 2));
                this.f41420f0.addView(this.U3, b8.mf.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.r6.R(this.f41495o0, org.telegram.ui.ActionBar.y5.e(B1(i13), 6.0f), org.telegram.ui.ActionBar.r6.N(i13), org.telegram.ui.ActionBar.r6.f(i13), e6Var);
            org.telegram.ui.ActionBar.r6.V(this.f41495o0, i14, e6Var);
            lo0 lo0Var = this.R;
            lo0Var.f30676j0 = true;
            lo0Var.f30672h0 = false;
            org.telegram.ui.Cells.t9 n4 = lo0Var.n(this.f41437h0.getContext());
            if (n4 != null) {
                org.telegram.messenger.g0.E2(n4);
                this.f41420f0.addView(n4);
            }
            this.R.S(this.f41420f0);
            this.R.R();
            this.f41371a.a(false, false);
            return;
        }
        x3();
    }

    public final boolean O0() {
        boolean z10 = false;
        if (this.f41519q6 != null || this.D1 == null) {
            return false;
        }
        this.f41443h6 = 1.0f;
        this.f41501o6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41519q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f));
        this.f41519q6.setDuration(250L);
        this.f41519q6.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        this.f41519q6.addListener(new xo0(this, 0));
        this.f41519q6.start();
        pg.k kVar = this.D1.f31808b.M;
        if (kVar != null) {
            z10 = kVar.f53508j;
        }
        return !z10;
    }

    public final void O2(org.telegram.ui.Components.bi biVar) {
        this.f41384b2 = biVar;
        cg.u0 u0Var = this.c2;
        if (u0Var != null) {
            u0Var.b();
            this.c2 = null;
        }
        if (biVar != null) {
            if (biVar.f28603h1 == null) {
                Window window = biVar.getWindow();
                ?? obj = new Object();
                obj.f4759c = new a1.c(new WeakReference(window), 10);
                biVar.f28603h1 = obj;
            }
            cg.v0 v0Var = biVar.f28603h1;
            v0Var.getClass();
            this.c2 = new cg.u0(v0Var, 0);
        }
    }

    public final boolean P0(float f10, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.ad0 ad0Var;
        float f11;
        if (this.f41519q6 == null && (ad0Var = this.D1) != null) {
            ad0Var.f31808b.i();
            this.f41397c6 = 0.0f;
            this.f41435g6 = 0.0f + f10;
            if (z10) {
                this.f41443h6 = 1.0f;
            }
            this.f41501o6 = System.currentTimeMillis();
            this.f41519q6 = new AnimatorSet();
            if (this.f41402d2 == 1) {
                this.f41426f6 = 1.0f;
                this.f41388b6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.D4;
                if (imageReceiver != null) {
                    int q10 = imageReceiver.q();
                    int o10 = this.D4.o();
                    if (Math.abs((((int) this.D1.f31808b.getStateOrientation()) / 90) % 2) == 1) {
                        o10 = q10;
                        q10 = o10;
                    }
                    org.telegram.messenger.re reVar = this.Y4.f44797c;
                    if (reVar != null) {
                        q10 = (int) (q10 * reVar.f25113e);
                        o10 = (int) (o10 * reVar.f25114f);
                    }
                    float f12 = q10;
                    float f13 = o10;
                    float min = Math.min(m1(1) / f12, j1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(m1(1) / f13, j1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f41426f6 = f11 / min;
                }
            }
            if (this.f41402d2 == 11) {
                this.f41388b6 = u2(false) * this.f41388b6;
                this.f41426f6 = u2(false) * this.f41426f6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new gi.l9(this, f10, this.D1.f31809c.getRotation(), 3));
            this.f41519q6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f), ofFloat);
            this.f41519q6.setDuration(250L);
            this.f41519q6.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.f41519q6.addListener(new ci.p6(this, f10, runnable, 5));
            this.f41519q6.start();
            if (Math.abs(this.D1.f31808b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void P2() {
        wm wmVar;
        TLRPC.Chat chat;
        kq0 kq0Var = this.d;
        if (kq0Var != null) {
            if (kq0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.Q4)) {
                if (this.f41486n && (wmVar = this.f41481m4) != null && (chat = wmVar.f51292e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.t4.M(this.E, org.telegram.messenger.bd.M0(2131745320, "Slowmode"), org.telegram.messenger.bd.M0(2131745313, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.Q4, p1());
            boolean x10 = this.d.x(this.Q4);
            this.O0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f41514q1.i(k10);
                    this.f41505p1.y0(k10);
                } else {
                    this.f41514q1.s(k10);
                    if (k10 == 0) {
                        this.f41514q1.g(0);
                    }
                }
            }
            D3();
        }
    }

    public final void Q0() {
        if (this.E != null && this.f41437h0 != null) {
            if (org.telegram.ui.Components.ie0.f34683q0.Q) {
                org.telegram.ui.Components.ie0.b(false);
            }
            za.p pVar = this.D7;
            if (pVar != null) {
                pVar.a();
                this.D7 = null;
            }
            ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.f41391c);
            r2(false);
            try {
                if (this.f41437h0.getParent() != null) {
                    ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.f41437h0);
                    Z1();
                }
                this.f41437h0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.cc ccVar = this.f41466k5;
            if (ccVar != null) {
                ccVar.a();
                this.f41466k5 = null;
            }
            this.f41445i0.setImageBitmap(null);
            if (this == f41370c9) {
                f41370c9 = null;
            } else {
                f41369b9 = null;
            }
            Z1();
        }
    }

    public final void Q2() {
        float q10 = this.D4.q();
        float o10 = this.D4.o();
        if (q10 != 0.0f && o10 != 0.0f) {
            float m1 = m1(this.f41562v4);
            float k1 = k1();
            float min = Math.min(k1 / o10, m1 / q10);
            float max = Math.max(m1 / ((int) (q10 * min)), k1 / ((int) (o10 * min)));
            this.f41388b6 = max;
            z3(max);
        }
    }

    public final void R0() {
        if (this.D4.m() == null && !this.h7.isEmpty() && this.f41402d2 != 1) {
            String str = this.D4.R;
            String str2 = this.f41592y4;
            if (str2 == null || !str2.equals(str)) {
                this.f41582x4 = 0;
                org.telegram.messenger.cc p10 = this.D4.p();
                int i3 = this.D4.V;
                if (str != null && p10 != null && p10.f22007c != null) {
                    Utilities.f21387e.c(new org.telegram.ui.Components.zo0(this, p10, i3, str, 14));
                }
            }
        }
    }

    public final void R2(CharSequence charSequence) {
        jq0 jq0Var = this.N;
        this.f41424f4 = charSequence;
        jq0Var.c(charSequence);
        m3(true, false);
    }

    public final void S0() {
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.f41380a8)), this.Z7);
        edit.commit();
        G3();
        E3();
    }

    public final void S2(boolean z10, boolean z11) {
        if (this.f41480m3 != z10) {
            if (z10) {
                this.f41453j0.setTag(1);
            } else {
                this.f41453j0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f41473l3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f41480m3 = z10;
            float f10 = 0.0f;
            int i3 = 0;
            if (z11) {
                if (z10) {
                    this.f41456j3.setVisibility(0);
                }
                float alpha = this.f41456j3.getAlpha();
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new wm0(this, 0));
                ofFloat.addListener(new ep0(this, z10, 0));
                this.f41473l3 = ofFloat;
                ofFloat.start();
            } else {
                sq0 sq0Var = this.f41456j3;
                if (!z10) {
                    i3 = 8;
                }
                sq0Var.setVisibility(i3);
                sq0 sq0Var2 = this.f41456j3;
                if (z10) {
                    f10 = 1.0f;
                }
                sq0Var2.setAlpha(f10);
            }
            if (this.f41472l2 && this.f41468k7 == null) {
                if (z10) {
                    this.f41504p0.S(9);
                } else {
                    this.f41504p0.t(9);
                }
            }
        }
    }

    public final void T0() {
        cg.u0 u0Var = this.f41493n7;
        if (u0Var != null) {
            u0Var.b();
            this.f41493n7 = null;
        }
        cg.u0 u0Var2 = this.c2;
        if (u0Var2 != null) {
            u0Var2.b();
            this.c2 = null;
        }
        try {
            if (this.f41437h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.f41437h0);
                Z1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean T1() {
        if (this.f41402d2 != 11) {
            int i3 = this.Q4;
            if (i3 >= 0) {
                ArrayList arrayList = this.h7;
                if (i3 < arrayList.size()) {
                    kq0 kq0Var = this.d;
                    if (kq0Var != null && !kq0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.Q4);
                    if (obj instanceof org.telegram.messenger.ye) {
                        return ((org.telegram.messenger.ye) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean T2(int i3) {
        hq0 hq0Var = this.f41468k7;
        if (hq0Var != null) {
            if (hq0Var.a(i3) || this.f41468k7.e(i3)) {
                int i10 = org.telegram.messenger.az.f21612a;
                if (org.telegram.messenger.lc.e(1024)) {
                    File b10 = this.f41468k7.b(i3);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.az.B0 && (this.f41468k7.d(i3) instanceof TLRPC.Document)) {
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

    public final void U0(android.graphics.Canvas r51, org.telegram.ui.Components.ba r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U0(android.graphics.Canvas, org.telegram.ui.Components.ba, int, int, boolean, boolean, boolean):void");
    }

    public final boolean U1() {
        if (this.f41409e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r24, float r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V0(android.graphics.Canvas, float, float):void");
    }

    public final void V1() {
        WindowManager.LayoutParams layoutParams = this.f41410e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.f41437h0, this.f41410e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f41437h0.setFocusable(true);
        this.f41420f0.setFocusable(true);
    }

    public final void V2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                org.telegram.ui.ActionBar.s1 s1Var = this.Q1;
                if (s1Var != null) {
                    s1Var.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
                this.Q1 = p10;
                p10.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new s5(this, 10));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void W0(Canvas canvas) {
        boolean z10;
        float d;
        int i3;
        if (this.T4) {
            if (!org.telegram.messenger.az.f21619c0) {
                d = 1.0f;
            } else {
                int i10 = this.f41499o4;
                if (i10 != 0 && i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d = this.F8.d(z10);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.g0.f22602m * 1.5f));
            int height = this.Q0.getHeight() + org.telegram.messenger.g0.f22603n;
            if (this.V1.getVisibility() == 0) {
                i3 = org.telegram.messenger.g0.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i3 = 0;
            }
            int i11 = height + i3;
            if (this.H7 == null) {
                this.H7 = new Path();
                Paint paint = new Paint(1);
                this.I7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.J7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.K7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.L7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.M7 = new Matrix();
                this.N7 = new Matrix();
                this.I7.setShader(this.K7);
                this.J7.setShader(this.L7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f41420f0.getWidth(), this.f41420f0.getHeight() + org.telegram.messenger.g0.f22603n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.H7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.H7.addRect(0.0f, 0.0f, this.f41420f0.getWidth(), f10, direction);
            this.H7.addRect(0.0f, (this.f41420f0.getHeight() + org.telegram.messenger.g0.f22603n) - i11, this.f41420f0.getWidth(), this.f41420f0.getHeight() + org.telegram.messenger.g0.f22603n, direction);
            canvas.clipPath(this.H7);
            canvas.drawColor(-16777216);
            U0(canvas, this.f41400d0, 0, 0, true, true, false);
            canvas.save();
            this.M7.reset();
            this.M7.postScale(1.0f, f10 / 16.0f);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f41420f0.getWidth(), f10, this.I7);
            this.N7.reset();
            this.N7.postScale(1.0f, i11 / 16.0f);
            this.N7.postTranslate(0.0f, (this.f41420f0.getHeight() - i11) + org.telegram.messenger.g0.f22603n);
            this.L7.setLocalMatrix(this.N7);
            this.J7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f41420f0.getHeight() + org.telegram.messenger.g0.f22603n) - i11, this.f41420f0.getWidth(), this.f41420f0.getHeight() + org.telegram.messenger.g0.f22603n, this.J7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void W1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z10) {
        boolean z11;
        int i3;
        Bitmap.CompressFormat i12 = i1();
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
        Paint paint = W8;
        if (z10) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f10 == 512.0f) {
            i3 = 83;
        } else {
            i3 = 87;
        }
        createBitmap.compress(i12, i3, fileOutputStream);
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

    public final boolean W2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.d2 d2Var = this.n4;
        if ((d2Var instanceof wm) && org.telegram.messenger.t3.V(((wm) d2Var).f51292e)) {
            org.telegram.ui.Components.ac f10 = new org.telegram.ui.Components.fc(frameLayout, this.f41570w2).f(org.telegram.messenger.hp.s1(this.U).U4, new xm0(this, 26));
            f10.v = new xm0(this, 27);
            this.f41502o7 = f10.j();
            return true;
        }
        return false;
    }

    public final void X0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void X1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X1(boolean):void");
    }

    public final void X2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.E, this.f41570w2);
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
        org.telegram.messenger.zi ziVar = this.U4;
        if (ziVar != null && org.telegram.messenger.zi.M4(ziVar.f26868k) && org.telegram.messenger.w7.G(this.U4.I1).T(this.f41405d5[0])) {
            s1Var.U = org.telegram.messenger.bd.M0(2131747212, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131747226, null);
        }
        V2(alertDialog$Builder);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        int i11;
        if (i3 == 0) {
            float f12 = 1.0f - f10;
            this.U0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f12);
            this.U0.setAlpha(f10);
            org.telegram.ui.Components.pd0 pd0Var = this.U0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pd0Var.setVisibility(i10);
            if (this.f41431g2) {
                ci.t4 t4Var = this.Q0;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                t4Var.setVisibility(i11);
                this.Q0.setAlpha(f12);
                this.Q0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
                mi.x1 x1Var = this.T0;
                if (i13 < 0) {
                    i12 = 0;
                }
                x1Var.setVisibility(i12);
                this.T0.setAlpha(f12);
                this.T0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
            }
        }
    }

    public final void Y1(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(android.graphics.Canvas):void");
    }

    public final void Y2(final org.telegram.ui.Components.sc scVar, boolean z10, boolean z11, final float[] fArr) {
        float f10;
        float f11;
        int i3;
        kq0 kq0Var = this.d;
        if (kq0Var != null && kq0Var.l()) {
            f10 = 175.0f;
        } else {
            f10 = 58.0f;
        }
        float L = org.telegram.messenger.g0.L(f10);
        float f12 = 1.0f;
        if (scVar == this.W1) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f13 = L * f11;
        Integer num = null;
        if (!z11) {
            scVar.animate().setListener(null).cancel();
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            scVar.setVisibility(i3);
            if (z10) {
                f13 = 0.0f;
            }
            scVar.setTranslationY(f13);
            float alpha = this.Q0.getAlpha();
            if (!z10) {
                f12 = 0.0f;
            }
            fArr[0] = f12;
            scVar.setAlpha(alpha * f12);
        } else if (z10 && scVar.getTag() == null) {
            if (scVar.getVisibility() != 0) {
                scVar.setVisibility(0);
                scVar.setAlpha(this.Q0.getAlpha());
                scVar.setTranslationY(f13);
            }
            scVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f49576b;

                {
                    this.f49576b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f49576b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = scVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.S7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f41421f1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f41430g1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f41438h1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.I1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f49576b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = scVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.S7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f41421f1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f41430g1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f41438h1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.I1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        } else if (!z10 && scVar.getTag() != null) {
            scVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f49576b;

                {
                    this.f49576b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f49576b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = scVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.S7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f41421f1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f41430g1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f41438h1.setTranslationY(photoViewer.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.I1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f49576b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = scVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.S7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f41421f1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f41430g1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f41438h1.setTranslationY(photoViewer2.V1.getAlpha() * (-k2.p1.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.I1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new pg(3, scVar)).start();
        }
        if (z10) {
            num = 1;
        }
        scVar.setTag(num);
    }

    public final void Z0(TLRPC.Document document, TLRPC.Document document2, boolean z10, org.telegram.messenger.n10 n10Var) {
        float f10;
        this.f41565v7 = document;
        this.f41556u7 = document2;
        this.f41575w7 = z10;
        this.f41585x7 = false;
        this.f41595y7 = n10Var;
        this.f41397c6 = 0.0f;
        this.f41435g6 = 0.0f;
        if (this.f41518q5 != null) {
            yp0 yp0Var = this.f41602z5;
            if (yp0Var != null) {
                yp0Var.m(false, false);
            }
            this.f41518q5.b();
            ArrayList arrayList = this.f41537s5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f41565v7 != null) {
            ArrayList arrayList2 = this.f41537s5;
            if (arrayList2 == null) {
                this.f41537s5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.f41565v7;
            int i3 = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(i3).m0(documentAttribute.stickerset, true);
                        if (m0 != null && m0.packs != null) {
                            for (int i11 = 0; i11 < m0.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = m0.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f27007id)) && org.telegram.messenger.i6.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && org.telegram.messenger.i6.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.f41537s5.addAll(arrayList3);
            }
        }
        yp0 yp0Var2 = this.f41554u5;
        if (yp0Var2 != null) {
            yp0Var2.setCutOutState(false);
        }
        d3(true, false);
        ImageView imageView = this.f41401d1;
        if (imageView != null) {
            if (this.f41575w7) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void Z1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f41288c1.remove(this.f41541t1);
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.n4;
        if (d2Var != null && d2Var.getFragmentView() != null) {
            this.f41492n6 = 1.0f;
            View fragmentView = this.n4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.bi biVar = this.f41384b2;
            if (biVar != null) {
                org.telegram.ui.ActionBar.j2 j2Var = biVar.f28589c;
                j2Var.setScaleX(1.0f);
                j2Var.setScaleY(1.0f);
            }
        }
    }

    public final void Z2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        kq0 kq0Var = this.d;
        boolean z14 = false;
        if (kq0Var != null && kq0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        qo0 qo0Var = this.V1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        Y2(qo0Var, z13, z11, this.f41604z7);
        ro0 ro0Var = this.W1;
        if (z10 && z12) {
            z14 = true;
        }
        Y2(ro0Var, z14, z11, this.A7);
    }

    public final boolean a() {
        if (!this.U8 && Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f21613a0 && org.telegram.messenger.az.o() >= 2 && !org.telegram.messenger.g0.m0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a1() {
        G1();
    }

    public final void a2(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.G2 != null && this.U4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.G2.U() == -9223372036854775807L) {
                        this.f41385b3 = intValue / ((float) this.U4.L0());
                        return;
                    }
                    long j10 = intValue * 1000;
                    this.G2.p0(j10);
                    this.f41526r3.h(true, ((float) j10) / ((float) this.G2.U()));
                    this.f41535s3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.E instanceof LaunchActivity) {
                    uw uwVar = new uw(null);
                    uwVar.f50273o2 = url;
                    ((LaunchActivity) this.E).u0(uwVar, false, true);
                    H0(false, false);
                    return;
                }
                return;
            } else if (this.f41481m4 != null && ((clickableSpan instanceof org.telegram.ui.Components.x31) || org.telegram.messenger.g0.J3(url))) {
                org.telegram.ui.Components.t4.p0(this.f41481m4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void a3(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a3(boolean, boolean):void");
    }

    public final void b2(mq0 mq0Var) {
        if (this.f41560v2) {
            r2(true);
        }
        org.telegram.messenger.zi ziVar = this.U4;
        if (ziVar != null && !ziVar.P) {
            org.telegram.messenger.w7.G(this.U).f(this.U4.F0());
        }
        this.f41409e = false;
        this.f41419f = false;
        this.f41439h2 = false;
        this.f41544t4 = true;
        this.U4 = null;
        this.Z4 = null;
        this.f41377a5 = null;
        this.f41387b5 = null;
        this.f41396c5 = null;
        this.f41458j5 = null;
        this.f41425f5 = null;
        this.f41525r2 = null;
        VideoAds videoAds = this.V4;
        if (videoAds != null) {
            videoAds.stop();
            this.V4 = null;
        }
        if (this.f41456j3 != null) {
            S2(false, false);
        }
        mp0 mp0Var = this.U1;
        if (mp0Var != null) {
            mp0Var.scrollTo(0, 0);
        }
        this.f41402d2 = 0;
        this.f41412e2 = false;
        this.f41422f2 = false;
        this.f41431g2 = false;
        this.f41447i2 = false;
        org.telegram.messenger.cc ccVar = this.f41466k5;
        if (ccVar != null) {
            ccVar.a();
            this.f41466k5 = null;
        }
        this.f41384b2 = null;
        cg.u0 u0Var = this.c2;
        if (u0Var != null) {
            u0Var.b();
            this.c2 = null;
        }
        org.telegram.ui.Components.t5 t5Var = this.f41463k2;
        if (t5Var != null) {
            t5Var.w(this.f41420f0);
            this.f41463k2 = null;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            mo0 mo0Var = this.X0[i3];
            if (mo0Var != null) {
                mo0Var.d(-1, false, true);
            }
        }
        s2(0);
        no0 no0Var = this.T7;
        if (no0Var != null) {
            no0Var.a();
        }
        this.f41496o1.d(0, false);
        this.D4.w0(null);
        this.G4.o();
        this.C4.w0(null);
        this.F4.o();
        this.E4.w0(null);
        this.H4.o();
        this.f41420f0.post(new an0(this, mq0Var, 0));
        kq0 kq0Var = this.d;
        if (kq0Var != null) {
            kq0Var.G();
        }
        org.telegram.ui.Components.h20 h20Var = this.m1;
        h20Var.d.clear();
        h20Var.f34275e.clear();
        h20Var.f34272c.clear();
        kq0 kq0Var2 = this.d;
        if (kq0Var2 != null) {
            kq0Var2.D();
        }
        this.d = null;
        this.f41514q1.f();
        this.f41468k7 = null;
        this.f41544t4 = false;
        this.f41512p8 = 0.0f;
        this.f41521q8 = 1.0f;
        if (mq0Var != null) {
            mq0Var.f47751a.O0(true, true);
        }
        wm wmVar = this.f41481m4;
        if (wmVar != null) {
            wmVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.P4;
        if (bitmap != null) {
            bitmap.recycle();
            this.P4 = null;
        }
    }

    public final void b3(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i3;
        float f18;
        float f19;
        int i10;
        TextureView textureView;
        if (z10 && this.I3 && this.J3 && !this.G3 && (textureView = this.C2) != null) {
            this.P4 = textureView.getBitmap();
        }
        if (z10) {
            this.f41390b8 = this.Z7;
        }
        AnimatorSet animatorSet = this.V7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V7 = new AnimatorSet();
        float f20 = 0.0f;
        if (z10) {
            if (this.T4) {
                this.f41462k0.setVisibility(0);
                View view = this.f41462k0;
                if (this.f41402d2 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f41462k0;
                if (this.f41402d2 == 11) {
                    i10 = 1711276032;
                } else {
                    i10 = 2130706432;
                }
                view2.setBackgroundColor(i10);
            }
            this.P7.setTag(1);
            AnimatorSet animatorSet2 = this.V7;
            ci.t4 t4Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.V1.getEditTextHeight() + t4Var.getHeight();
            if (this.f41533s1) {
                i3 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i3 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t4Var, property, 0.0f, editTextHeight + i3);
            ci.t4 t4Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t4Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, org.telegram.messenger.g0.L(158.0f));
            View view3 = this.f41462k0;
            if (this.T4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.P7.setTag(null);
            AnimatorSet animatorSet3 = this.V7;
            nq0 nq0Var = this.P7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nq0Var, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Q7, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            View view4 = this.f41462k0;
            Property property4 = View.ALPHA;
            if (this.T4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.V7.addListener(new ep0(this, z10, 3));
        this.V7.setDuration(200L);
        this.V7.setInterpolator(org.telegram.messenger.g0.G);
        this.V7.start();
        float f21 = 0.25f;
        if (this.f41421f1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f41421f1.animate();
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
        if (this.f41430g1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f41430g1.animate();
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
        if (this.f41438h1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f41438h1.animate();
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

    @Override
    public final void c(b8.cg cgVar) {
        if (org.telegram.ui.Components.ie0.f34683q0.Q) {
            org.telegram.ui.Components.ie0.b(false);
        }
        this.R8 = cgVar;
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            m51Var.z0(null);
            this.G2.A0(null);
            this.G2.h0();
            this.G2.A0(this.S8);
        }
        ((WindowManager) this.E.getSystemService("window")).removeView(this.f41437h0);
        this.T8 = true;
        this.f41437h0.invalidate();
    }

    public final void c2(org.telegram.messenger.zi r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.ac r24, org.telegram.messenger.ac r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.mq0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c2(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ac, org.telegram.messenger.ac, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.mq0):void");
    }

    public final void c3() {
        long a10;
        if (this.E != null) {
            wm wmVar = this.f41481m4;
            if (wmVar != null) {
                a10 = wmVar.a();
            } else {
                kq0 kq0Var = this.d;
                if (kq0Var != null) {
                    a10 = kq0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a10;
            org.telegram.ui.Components.t4.J(this.E, j10, -1L, 0, false, new gn0(this), null, new org.telegram.ui.Components.q4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false)), null);
        }
    }

    public final int d1(int i3) {
        if (i3 != 1 && (i3 != 0 || this.f41402d2 != 1)) {
            if (i3 != 0 && i3 != 5 && i3 != 4 && i3 != 3) {
                return org.telegram.messenger.g0.L(14.0f);
            }
            return 0;
        }
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final boolean d2(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d2(android.view.MotionEvent):boolean");
    }

    public final void d3(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        Integer num2;
        boolean z13;
        boolean z14;
        float f10;
        int i3;
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
            this.f41518q5.animate().setListener(null).cancel();
            ug.c2 c2Var = this.f41518q5;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c2Var.setVisibility(i10);
            this.f41518q5.setAlpha(this.Q0.getAlpha());
            this.f41545t5.animate().setListener(null).cancel();
            ei.e3 e3Var = this.f41545t5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e3Var.setVisibility(i11);
            ei.e3 e3Var2 = this.f41545t5;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            e3Var2.setAlpha(f12);
        } else if (z10 && this.f41518q5.getTag() == null) {
            this.f41518q5.animate().setListener(null).cancel();
            this.f41545t5.animate().setListener(null).cancel();
            if (this.f41518q5.getVisibility() != 0) {
                this.f41518q5.setVisibility(0);
                this.f41518q5.animate().alpha(1.0f).start();
                this.f41545t5.setVisibility(0);
                this.f41545t5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f41518q5.getTag() != null) {
            this.f41518q5.animate().setListener(null).cancel();
            this.f41518q5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.s9(this.f41518q5)).start();
            this.f41545t5.animate().setListener(null).cancel();
            this.f41545t5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.s9(this.f41545t5)).start();
        }
        ug.c2 c2Var2 = this.f41518q5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        c2Var2.setTag(num);
        if (z10 && this.f41554u5.f56254n0 != 1 && !this.f41575w7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f41554u5.animate().setListener(null).cancel();
            yp0 yp0Var = this.f41554u5;
            if (z12) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            yp0Var.setVisibility(i3);
            yp0 yp0Var2 = this.f41554u5;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            yp0Var2.setAlpha(f11);
        } else if (z12 && this.f41554u5.getTag() == null) {
            this.f41554u5.animate().setListener(null).cancel();
            if (this.f41554u5.getVisibility() != 0) {
                this.f41554u5.setVisibility(0);
            }
            this.f41554u5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f41554u5.getTag() != null) {
            this.f41554u5.animate().setListener(null).cancel();
            this.f41554u5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.s9(this.f41554u5)).start();
        }
        yp0 yp0Var3 = this.f41554u5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        yp0Var3.setTag(num2);
        if (z10 && this.f41554u5.f56254n0 == 1 && !this.f41575w7) {
            z13 = true;
        } else {
            z13 = false;
        }
        a3(z13, z11);
        ug.c2 c2Var3 = this.f41518q5;
        if (z10 && this.f41554u5.f56254n0 == 1 && this.f41602z5.f52378t0 && !this.f41573w5.f52378t0 && !this.f41583x5.f52378t0) {
            z14 = true;
        } else {
            z14 = false;
        }
        c2Var3.setOutlineVisible(z14);
        if (!z10 || this.f41554u5.f56254n0 != 1 || this.f41573w5.f52378t0 || this.f41583x5.f52378t0) {
            z15 = false;
        }
        if (!z11) {
            this.f41602z5.animate().setListener(null).cancel();
            yp0 yp0Var4 = this.f41602z5;
            if (z15) {
                i12 = 0;
            }
            yp0Var4.setVisibility(i12);
            yp0 yp0Var5 = this.f41602z5;
            if (z15) {
                f13 = 1.0f;
            }
            yp0Var5.setAlpha(f13);
            yp0 yp0Var6 = this.f41602z5;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            yp0Var6.setScaleX(f10);
            yp0 yp0Var7 = this.f41602z5;
            if (!z15) {
                f14 = 0.8f;
            }
            yp0Var7.setScaleY(f14);
        } else if (z15 && this.f41602z5.getTag() == null) {
            this.f41602z5.animate().setListener(null).cancel();
            if (this.f41602z5.getVisibility() != 0) {
                this.f41602z5.setVisibility(0);
            }
            org.telegram.messenger.camera.q.l(this.f41602z5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.xq.h, 400L);
        } else if (!z15 && this.f41602z5.getTag() != null) {
            this.f41602z5.animate().setListener(null).cancel();
            org.telegram.messenger.camera.q.l(this.f41602z5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.s9(this.f41602z5)), org.telegram.ui.Components.xq.h, 400L);
        }
        yp0 yp0Var8 = this.f41602z5;
        if (!z15) {
            num3 = null;
        }
        yp0Var8.setTag(num3);
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final int e1(int i3) {
        int i10 = 0;
        if (i3 >= 0) {
            if (i3 != 1 && (i3 != 0 || this.f41402d2 != 1)) {
                if (i3 == 3 && this.M1 != null) {
                    int L = org.telegram.messenger.g0.L(8.0f);
                    if (!this.f41531s) {
                        i10 = org.telegram.messenger.g0.f22602m;
                    }
                    return this.M1.getAdditionalTop() + L + i10;
                } else if (i3 != 0 && i3 != 4 && i3 != 5) {
                    int L2 = org.telegram.messenger.g0.L(14.0f);
                    if (!this.f41531s) {
                        i10 = org.telegram.messenger.g0.f22602m;
                    }
                    return L2 + i10;
                }
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                if (!this.f41531s) {
                    i10 = org.telegram.messenger.g0.f22602m;
                }
                return L3 + i10;
            }
        }
        return 0;
    }

    public final void e2(ArrayList arrayList, int i3, long j10, long j11, long j12, kq0 kq0Var) {
        h2((org.telegram.messenger.zi) arrayList.get(i3), null, null, null, arrayList, null, null, i3, kq0Var, null, j10, j11, j12, true, null, null);
    }

    public final void e3(boolean z10) {
        Integer num;
        float f10;
        float f11;
        tp0 tp0Var;
        if (!z10 || this.f41543t3.getTag() == null) {
            if (!z10 && this.f41543t3.getTag() == null) {
                return;
            }
            if (z10 && !this.f41543t3.f37928s && ((tp0Var = this.f41429g0) == null || !tp0Var.f38729y || tp0Var.f38727w.isEmpty())) {
                this.f41561v3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f41552u3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ap0 ap0Var = this.f41543t3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            ap0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41552u3 = animatorSet2;
            ap0 ap0Var2 = this.f41543t3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ap0Var2, property, f10);
            ap0 ap0Var3 = this.f41543t3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ap0Var3, property2, f11);
            ap0 ap0Var4 = this.f41543t3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ap0Var4, property3, f13);
            ap0 ap0Var5 = this.f41543t3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(ap0Var5, property4, f12));
            this.f41552u3.setDuration(380L);
            this.f41552u3.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f41552u3.addListener(new xo0(this, 1));
            this.f41552u3.start();
        }
    }

    public final int f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f1(boolean):int");
    }

    public final void f2(ArrayList arrayList, int i3, kq0 kq0Var) {
        h2(null, null, null, null, null, arrayList, null, i3, kq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void f3(boolean z10, boolean z11) {
        int i3;
        Integer num = null;
        if (!z11) {
            this.S7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.S7;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            this.T7.setTranslationY(0.0f);
            this.S7.setAlpha(this.Q0.getAlpha());
        } else if (z10 && this.S7.getTag() == null) {
            if (this.S7.getVisibility() != 0) {
                this.S7.setVisibility(0);
                this.S7.setAlpha(this.Q0.getAlpha());
                this.T7.setTranslationY(org.telegram.messenger.g0.L(58.0f));
            }
            ObjectAnimator objectAnimator = this.B7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.B7.cancel();
            }
            no0 no0Var = this.T7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(no0Var, View.TRANSLATION_Y, no0Var.getTranslationY(), 0.0f);
            this.B7 = ofFloat;
            ofFloat.setDuration(220L);
            this.B7.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.B7.start();
        } else if (!z10 && this.S7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.B7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.B7.cancel();
            }
            no0 no0Var2 = this.T7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(no0Var2, View.TRANSLATION_Y, no0Var2.getTranslationY(), org.telegram.messenger.g0.L(58.0f));
            this.B7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.s9(this.S7));
            this.B7.setDuration(220L);
            this.B7.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.B7.start();
        }
        FrameLayout frameLayout2 = this.S7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.S7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * k2.p1.d(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.S7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final Bitmap g() {
        TextureView textureView = this.S8;
        if (textureView != null && textureView.isAvailable()) {
            return this.S8.getBitmap();
        }
        return null;
    }

    public final ClippingImageView[] g1(mq0 mq0Var) {
        int i3;
        if (!org.telegram.messenger.g0.Q1() && mq0Var != null && mq0Var.f47761m != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i3 + 1];
        clippingImageViewArr[0] = this.f41445i0;
        if (i3 != 0) {
            ClippingImageView clippingImageView = mq0Var.f47761m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(mq0Var.f47762n);
        }
        return clippingImageViewArr;
    }

    public final void g2(TLRPC.FileLocation fileLocation, org.telegram.messenger.ac acVar, eq0 eq0Var) {
        h2(null, fileLocation, acVar, null, null, null, null, 0, eq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void g3() {
        org.telegram.ui.Components.m51 m51Var;
        if (this.f41533s1 && (m51Var = this.G2) != null && !m51Var.d0()) {
            if (!this.K4 || !T1() || this.f41402d2 == 1) {
                if (!this.f41522r || this.f41402d2 == 1) {
                    this.G2.B0(0.0f);
                }
                this.I2 = false;
                t3();
            }
        }
    }

    public float getAnimationValue() {
        return this.f41483m6;
    }

    public final org.telegram.ui.Components.sc h1() {
        kq0 kq0Var = this.d;
        if (kq0Var != null && kq0Var.A()) {
            return this.W1;
        }
        return this.V1;
    }

    public final boolean h2(org.telegram.messenger.zi r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ac r19, org.telegram.messenger.ac r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.kq0 r25, org.telegram.ui.wm r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.hq0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h2(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ac, org.telegram.messenger.ac, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.kq0, org.telegram.ui.wm, long, long, long, boolean, org.telegram.ui.hq0, java.lang.Integer):boolean");
    }

    public final void h3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3(int):void");
    }

    @Override
    public final void i(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final Bitmap.CompressFormat i1() {
        if (this.f41402d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final boolean i2(org.telegram.messenger.zi ziVar, wm wmVar, long j10, long j11, long j12, eq0 eq0Var) {
        return h2(ziVar, null, null, null, null, null, null, 0, eq0Var, wmVar, j10, j11, j12, true, null, null);
    }

    public final void i3(int i3, boolean z10) {
        if (this.U4 != null) {
            r2(false);
            org.telegram.messenger.w7.G(this.U).f(this.U4.F0());
        } else if (this.f41458j5 != null) {
            TLObject d = this.f41468k7.d(this.Q4);
            if (d instanceof TLRPC.Document) {
                r2(false);
                org.telegram.messenger.w7.G(this.U).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.h20 h20Var = this.m1;
        if (h20Var != null) {
            h20Var.setAnimateBackground(true);
        }
        this.Z2 = false;
        F2(this.Q4 + i3, z10, true, false);
        if (U2(this.U4) || T2(this.Q4)) {
            this.Z2 = true;
            X1(true);
            C0(0, true);
        }
        A0();
        try {
            d1.f.b(0);
            if (tf.b.t().u()) {
                tf.b.t().z(o1());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int j1(int i3, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f41531s)) {
            measuredHeight = (org.telegram.messenger.g0.f22603n - this.f41542t2.bottom) + org.telegram.messenger.g0.f22608q.y;
            if ((i3 == 0 || i3 == 4 || i3 == 5) && this.f41402d2 != 1 && !z11) {
                measuredHeight += org.telegram.messenger.g0.f22602m;
            }
        } else {
            measuredHeight = this.f41420f0.getMeasuredHeight();
        }
        if ((i3 == 0 && this.f41402d2 == 1) || i3 == 1) {
            return measuredHeight - org.telegram.messenger.g0.L(144.0f);
        }
        if (i3 == 2) {
            return measuredHeight - org.telegram.messenger.g0.L(214.0f);
        }
        if (i3 == 3) {
            return measuredHeight - (this.M1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.M1.getAdditionalBottom() + org.telegram.messenger.g0.L(48.0f))));
        }
        return measuredHeight;
    }

    public final void j2(ArrayList arrayList, int i3, int i10, boolean z10, kq0 kq0Var, wm wmVar) {
        boolean z11;
        org.telegram.ui.Components.h6 h6Var;
        this.f41447i2 = z10;
        mi.x1 x1Var = this.T0;
        int i11 = 0;
        if (x1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var.getLayoutParams();
            if (i10 != 4 && i10 != 5) {
                if (i10 != 13 && i10 != 14 && i10 != 1 && i10 != 3 && i10 != 10 && i10 != 11) {
                    this.T0.setResourceId(2131232692);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                } else {
                    this.T0.setResourceId(2131231195);
                    this.T0.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                }
            } else {
                this.T0.setResourceId(2131232692);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i10 != 11 && this.f41518q5 != null) {
            this.f41575w7 = false;
            ImageView imageView = this.f41401d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            yp0 yp0Var = this.f41602z5;
            if (yp0Var != null) {
                yp0Var.m(false, false);
            }
            this.f41518q5.b();
            ArrayList arrayList2 = this.f41537s5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f41409e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z12 && this.f41402d2 != i10 && i10 == 1) {
            this.f41402d2 = i10;
            this.f41560v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = kq0Var;
            this.J5 = 0L;
            this.F5 = 0L;
            this.f41514q1.f();
            this.f41468k7 = null;
            if (this.V6 == null) {
                this.V6 = VelocityTracker.obtain();
            }
            this.f41409e = true;
            this.f41419f = true;
            s3(false, false);
            this.f41479m2 = false;
            I0();
            m3(false, false);
            this.f41423f3 = 0.0f;
            this.W2 = false;
            this.V2 = false;
            V1();
            backgroundDrawable.setAlpha(255);
            this.f41420f0.setAlpha(1.0f);
            c2(null, null, null, null, null, null, arrayList, i3, null);
            H1();
            C2();
        } else if (z12 && this.f41402d2 != i10 && i10 == 11) {
            this.f41402d2 = i10;
            this.f41560v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = kq0Var;
            this.J5 = 0L;
            this.F5 = 0L;
            this.f41514q1.f();
            this.f41468k7 = null;
            if (this.V6 == null) {
                this.V6 = VelocityTracker.obtain();
            }
            this.f41409e = true;
            this.f41419f = true;
            s3(false, false);
            this.f41423f3 = 0.0f;
            this.W2 = false;
            this.V2 = false;
            V1();
            backgroundDrawable.setAlpha(255);
            this.f41420f0.setAlpha(1.0f);
            c2(null, null, null, null, null, null, arrayList, i3, null);
        } else {
            this.f41402d2 = i10;
            if (i10 == 12) {
                this.f41402d2 = 0;
                this.f41412e2 = true;
            }
            int i12 = this.f41402d2;
            if (i12 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41431g2 = z11;
            if (i12 == 13 || z11) {
                this.f41402d2 = 0;
                this.f41422f2 = true;
            }
            this.f41371a.a(z11, false);
            if (this.f41402d2 == 11) {
                this.f41462k0.setBackgroundColor(-16777216);
            }
            jq0 jq0Var = this.N;
            if (jq0Var != null && (h6Var = jq0Var.d) != null) {
                if (this.f41422f2) {
                    i11 = 8;
                }
                h6Var.setVisibility(i11);
            }
            h2(null, null, null, null, null, null, arrayList, i3, kq0Var, wmVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void j3() {
        float f10;
        boolean z10;
        int i3;
        lp0 lp0Var;
        int i10;
        lp0 lp0Var2;
        this.f41528r6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.f41495o0.setVisibility(8);
        this.f41421f1.setVisibility(8);
        this.f41430g1.setVisibility(8);
        this.f41438h1.setVisibility(8);
        org.telegram.ui.Components.ad0 ad0Var = this.D1;
        if (ad0Var != null) {
            ad0Var.setVisibility(4);
        }
        this.f41505p1.setVisibility(8);
        this.f41505p1.setAlpha(0.0f);
        this.f41505p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.f41505p1.setEnabled(false);
        this.L = false;
        if (this.f41455j2) {
            this.R1.setVisibility(4);
        }
        int i11 = this.f41402d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.h7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            v3();
        }
        Z2(false, true);
        d3(false, true);
        Bitmap n4 = this.D4.n();
        float f11 = this.f41388b6;
        if (this.f41402d2 == 11) {
            this.f41459j6 = this.Z5;
            this.f41450i6 = this.Y5;
            this.f41467k6 = f11;
            this.f41476l6 = this.f41397c6;
            this.f41435g6 = 0.0f;
        }
        dq0 dq0Var = this.Y4;
        if (n4 != null) {
            int q10 = this.D4.q();
            int o10 = this.D4.o();
            if (this.f41402d2 == 1) {
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f41416e6 = L;
                f10 = 0.0f;
                if (this.M1 != null) {
                    this.f41416e6 = (lp0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i12 = this.E1.f53477i;
                if (i12 == 90 || i12 == 270) {
                    i10 = q10;
                    q10 = o10;
                    float f12 = q10;
                    float f13 = i10;
                    this.f41426f6 = u2(false) * (Math.min(m1(3) / f12, j1(3, false) / f13) / Math.min(m1(this.f41562v4) / f12, k1() / f13));
                    Rect rect = this.f41542t2;
                    this.f41406d6 = (rect.left / 2) - (rect.right / 2);
                    this.f41501o6 = System.currentTimeMillis();
                    this.S6 = true;
                }
                i10 = o10;
                float f122 = q10;
                float f132 = i10;
                this.f41426f6 = u2(false) * (Math.min(m1(3) / f122, j1(3, false) / f132) / Math.min(m1(this.f41562v4) / f122, k1() / f132));
                Rect rect2 = this.f41542t2;
                this.f41406d6 = (rect2.left / 2) - (rect2.right / 2);
                this.f41501o6 = System.currentTimeMillis();
                this.S6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -org.telegram.messenger.g0.L(44.0f);
                if (!this.f41531s) {
                    i3 = org.telegram.messenger.g0.f22602m / 2;
                } else {
                    i3 = 0;
                }
                float f14 = i13 + i3;
                this.f41416e6 = f14;
                if (this.M1 != null) {
                    float additionalTop = (lp0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f41416e6 = additionalTop;
                    this.f41416e6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.re reVar = dq0Var.f44797c;
                if (reVar != null) {
                    int i14 = reVar.f25117k;
                    if (i14 == 90 || i14 == 270) {
                        o10 = q10;
                        q10 = o10;
                    }
                    q10 = (int) (q10 * reVar.f25113e);
                    i10 = (int) (o10 * reVar.f25114f);
                    float f1222 = q10;
                    float f1322 = i10;
                    this.f41426f6 = u2(false) * (Math.min(m1(3) / f1222, j1(3, false) / f1322) / Math.min(m1(this.f41562v4) / f1222, k1() / f1322));
                    Rect rect22 = this.f41542t2;
                    this.f41406d6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f41501o6 = System.currentTimeMillis();
                    this.S6 = true;
                }
                i10 = o10;
                float f12222 = q10;
                float f13222 = i10;
                this.f41426f6 = u2(false) * (Math.min(m1(3) / f12222, j1(3, false) / f13222) / Math.min(m1(this.f41562v4) / f12222, k1() / f13222));
                Rect rect222 = this.f41542t2;
                this.f41406d6 = (rect222.left / 2) - (rect222.right / 2);
                this.f41501o6 = System.currentTimeMillis();
                this.S6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        lp0 lp0Var3 = this.M1;
        if (lp0Var3 != null) {
            if (this.f41402d2 == 11 && (dq0Var == null || dq0Var.f44797c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            lp0Var3.setDrawShadow(z10);
        }
        this.f41437h0.setClipChildren(true);
        this.f41462k0.setVisibility(4);
        this.f41519q6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.g0.L(12.0f), f10);
        ofFloat.addUpdateListener(new wm0(this, 6));
        ofFloat2.addUpdateListener(new wm0(this, 7));
        this.f41519q6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.m0(true);
        this.f41519q6.setDuration(200L);
        this.f41519q6.addListener(new xo0(this, 3));
        this.f41519q6.start();
    }

    public final void k0(float f10, float f11, float f12, boolean z10) {
        if (this.f41388b6 == f10 && this.Y5 == f11 && this.Z5 == f12) {
            return;
        }
        this.S6 = z10;
        this.f41426f6 = f10;
        this.f41406d6 = f11;
        this.f41416e6 = f12;
        this.f41501o6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41519q6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.k6.f35327g, 0.0f, 1.0f));
        this.f41519q6.setInterpolator(this.f41555u6);
        this.f41519q6.setDuration(250);
        this.f41519q6.addListener(new xo0(this, 7));
        this.f41519q6.start();
    }

    public final int k1() {
        return j1(this.f41562v4, false);
    }

    public final void k2() {
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            m51Var.g0();
            return;
        }
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null) {
            tp0Var.f();
        }
    }

    public final void k3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3():void");
    }

    @Override
    public final Bitmap l() {
        TextureView textureView = this.C2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.E2 && Build.VERSION.SDK_INT >= 24) {
            int width = this.D2.getWidth();
            int height = this.D2.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap c2 = org.telegram.messenger.sr.c(width, height);
            org.telegram.messenger.g0.z0(this.D2, c2);
            return c2;
        }
        return null;
    }

    public final CharSequence l0() {
        int i3;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (U1() && this.d != null && (i3 = this.Q4) >= 0) {
            ArrayList arrayList = this.h7;
            if (i3 < arrayList.size()) {
                Object obj = arrayList.get(this.Q4);
                CharSequence text = h1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f41520q7 && !TextUtils.equals(this.f41529r7, text) && this.d.S(this.Q4) != 0 && this.d.H() > 0) {
                    this.f41520q7 = false;
                }
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.U);
                wm wmVar = this.f41481m4;
                if (wmVar != null && ((encryptedChat = wmVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList W = b02.W(charSequenceArr, z10, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f41529r7 = charSequence;
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    yeVar.f25309a = charSequence;
                    yeVar.f25320n = W;
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    bfVar.I = charSequence;
                    bfVar.f25320n = W;
                }
                if (text.length() != 0 && !this.d.x(this.Q4)) {
                    P2();
                }
                kq0 kq0Var = this.d;
                if (kq0Var != null) {
                    kq0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int l1() {
        return m1(this.f41562v4);
    }

    public final void l2() {
        uf.d dVar = this.H2;
        if (dVar != null) {
            dVar.b(true);
        }
        if (org.telegram.ui.Components.ie0.k() != null) {
            org.telegram.ui.Components.ie0.k().b(true);
        }
    }

    public final void l3() {
        AtomicInteger atomicInteger;
        long a10;
        boolean m10;
        e6.q e10;
        e6.q e11;
        float f10;
        int i3;
        e6.q e12;
        boolean z10;
        if (!U1()) {
            return;
        }
        this.P8 = true;
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            if (!d1.f.u() && !this.f41522r) {
                z10 = false;
            } else {
                z10 = true;
            }
            m51Var.t0(z10);
        }
        if (this.G2 != null && d1.f.u() && ((atomicInteger = d1.f.f8000b) == null || atomicInteger.get() <= 0)) {
            g6.h e13 = d1.f.e();
            if (e13 == null) {
                a10 = -1;
            } else {
                a10 = e13.a();
            }
            if (a10 >= 0 && Math.abs(this.G2.S() - a10) > 1000) {
                this.G2.p0(a10);
            }
            g6.h e14 = d1.f.e();
            if (e14 == null) {
                m10 = false;
            } else if (d1.f.f7999a == 0) {
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
                float g7 = d1.f.g();
                g6.h e15 = d1.f.e();
                float f11 = 0.5f;
                if (e15 == null || (e11 = e15.e()) == null) {
                    f10 = 0.5f;
                } else {
                    f10 = (float) e11.f9758r;
                }
                if (Math.abs(g7 - f10) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.F.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i3 = audioManager.getStreamMinVolume(3);
                    } else {
                        i3 = 0;
                    }
                    float f12 = streamMaxVolume - i3;
                    g6.h e16 = d1.f.e();
                    if (e16 != null && (e12 = e16.e()) != null) {
                        f11 = (float) e12.f9758r;
                    }
                    int i10 = i3 + ((int) (f11 * f12));
                    if (i10 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i10, 1);
                    }
                }
            }
            g6.h e17 = d1.f.e();
            float f13 = 1.0f;
            if (e17 != null && (e10 = e17.e()) != null) {
                f13 = (float) e10.d;
            }
            E0(true, false, f13);
        }
        tq tqVar = this.f41578x0;
        if (tqVar != null) {
            tqVar.a(d1.f.u());
        }
        this.P8 = false;
    }

    @Override
    public final void m(Canvas canvas) {
        this.U8 = true;
        this.f41437h0.draw(canvas);
        this.U8 = false;
    }

    public final void m0(Canvas canvas, int i3, int i10, int i11, int i12, float f10, pg.f fVar, org.telegram.messenger.re reVar) {
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        int i14;
        float f15;
        float f16;
        float f17 = i3;
        int i15 = i11;
        float f18 = i15;
        float f19 = f17 / f18;
        float f20 = i10;
        int i16 = i12;
        float f21 = i16;
        float f22 = f20 / f21;
        float min = Math.min(f19, f22);
        int i17 = fVar.f53477i;
        if (i17 != 90 && i17 != 270) {
            i16 = i15;
            i15 = i16;
        }
        int i18 = this.f41402d2;
        if (i18 != 1 && (this.f41562v4 == 3 || this.f41510p6 == 3)) {
            f12 = 1.0f;
            f11 = f18;
        } else if (this.f41519q6 != null && (i13 = this.f41510p6) != -1) {
            int i19 = this.f41562v4;
            f11 = f18;
            if (i19 != 1 && i13 != 1 && ((i19 != 2 && i19 != 3) || i13 != -1)) {
                if (i13 == 0) {
                    f12 = this.f41483m6;
                } else {
                    f12 = 1.0f - this.f41483m6;
                }
            }
            f12 = 1.0f;
        } else {
            f11 = f18;
            int i20 = this.f41562v4;
            if (i20 == 2 || i20 == 3) {
                f12 = 0.0f;
            }
            f12 = 1.0f;
        }
        float f23 = fVar.f53478j;
        float f24 = fVar.f53479k;
        float f25 = i16;
        float f26 = 1.0f - f12;
        int A = (int) com.google.android.recaptcha.internal.a.A(1.0f - f23, f26, f23, f25);
        float f27 = i15;
        int i21 = (int) ((((1.0f - f24) * f26) + f24) * f27);
        float f28 = A;
        float f29 = f17 / f28;
        float f30 = i21;
        if (f29 * f30 > f20) {
            f29 = f20 / f30;
        }
        if (i18 != 1 && ((this.f41562v4 != 1 || this.f41510p6 == 0) && reVar != null)) {
            float f31 = f28 * f29;
            float f32 = f30 * f29;
            if (f19 * f21 <= f20) {
                f22 = f19;
            }
            float y9 = com.google.android.recaptcha.internal.a.y((f11 * f22) / f10, f31, f26, f31);
            float y10 = com.google.android.recaptcha.internal.a.y((f21 * f22) / f10, f32, f26, f32);
            canvas.clipRect((-y9) / 2.0f, (-y10) / 2.0f, y9 / 2.0f, y10 / 2.0f);
        }
        int i22 = this.f41402d2;
        if (i22 == 1 || fVar.f53471a) {
            int i23 = this.f41562v4;
            if (i23 != 1 && i22 != 1) {
                if (reVar != null) {
                    f15 = reVar.f25112c;
                    f16 = 1.0f;
                } else {
                    f15 = 1.0f;
                    f16 = 1.0f;
                }
                f13 = ((f29 / min) / com.google.android.recaptcha.internal.a.y(f15, f16, f26, f16)) * f15;
            } else {
                float y11 = fVar.f53475f / com.google.android.recaptcha.internal.a.y(fVar.f53480l, 1.0f, f26, 1.0f);
                float f33 = f17 / f25;
                if (f33 * f27 > f20) {
                    f33 = f20 / f27;
                }
                float f34 = (f33 / min) * y11;
                if (i22 == 1) {
                    if (i23 != 3 && (i14 = this.f41510p6) != 3) {
                        if (i14 == 0) {
                            f14 = fVar.f53481m;
                        }
                    } else {
                        f14 = ((fVar.f53481m - 1.0f) * f26) + 1.0f;
                    }
                    f34 /= f14;
                }
                f13 = f34;
            }
            float f35 = f13;
            canvas.translate(fVar.d * f12, fVar.f53474e * f12);
            canvas.scale(f35, f35);
            canvas.translate(com.google.android.recaptcha.internal.a.C(fVar.f53472b, f25, min, f12), com.google.android.recaptcha.internal.a.C(fVar.f53473c, f27, min, f12));
            float f36 = fVar.f53476g + i17;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            if (this.f41402d2 == 1 && (this.f41562v4 == 3 || this.f41510p6 == 3)) {
                canvas.rotate(f36);
            } else {
                canvas.rotate(f36 * f12);
            }
        }
        int[] iArr = this.O7;
        iArr[0] = A;
        iArr[1] = i21;
    }

    public final int m1(int i3) {
        int L;
        int width = this.f41420f0.getWidth();
        if (i3 != 1 && (i3 != 0 || this.f41402d2 != 1)) {
            if (i3 != 0 && i3 != 4 && i3 != 5 && i3 != 3) {
                L = org.telegram.messenger.g0.L(28.0f);
            } else {
                return width;
            }
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        return width - L;
    }

    public final void m2() {
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            m51Var.h0();
            return;
        }
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null) {
            tp0Var.g();
        }
    }

    public final void m3(boolean z10, boolean z11) {
        n3(z10, z11, wp0.f51584e);
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0():void");
    }

    public final float n1(boolean z10) {
        int q10;
        int o10;
        int i3;
        ImageReceiver imageReceiver = this.D4;
        if (z10) {
            q10 = imageReceiver.o();
        } else {
            q10 = imageReceiver.q();
        }
        if (z10) {
            o10 = this.D4.q();
        } else {
            o10 = this.D4.o();
        }
        if (!this.f41531s) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - i3) - (org.telegram.messenger.g0.L(16.0f) * 2);
        return Math.max(min / q10, min / o10);
    }

    public final void n3(boolean r17, boolean r18, org.telegram.ui.wp0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n3(boolean, boolean, org.telegram.ui.wp0):void");
    }

    @Override
    public final boolean o() {
        org.telegram.ui.ActionBar.y0 y0Var = this.f41568w0;
        if (y0Var != null && y0Var.isEnabled() && this.Q3) {
            return true;
        }
        return false;
    }

    public final void o0(android.graphics.Bitmap r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o0(android.graphics.Bitmap):void");
    }

    public final mi.z3 o1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o1():mi.z3");
    }

    public final void o2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.ze r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.ze, boolean, long):void");
    }

    public final void o3(boolean z10) {
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
        ci.t4 t4Var = this.Q0;
        Property property = View.ALPHA;
        float f18 = 1.0f;
        float f19 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(t4Var, property, f10));
        ci.t4 t4Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(t4Var2, property2, f11));
        ug.c2 c2Var = this.f41518q5;
        if (c2Var != null) {
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(c2Var, property, f17));
        }
        if (this.f41518q5 != null) {
            ei.e3 e3Var = this.f41545t5;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(e3Var, property, f16));
        }
        mi.x1 x1Var = this.T0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(x1Var, property, f12));
        mi.x1 x1Var2 = this.T0;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(x1Var2, property2, f13));
        int i3 = this.f41402d2;
        if (i3 == 0 || i3 == 4) {
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
        if (!z10 && K1()) {
            F0(true);
            gi.g gVar = this.V1.f13144f;
            if (gVar.f35191e) {
                gVar.k(true);
            }
            gi.g gVar2 = this.W1.f13144f;
            if (gVar2.f35191e) {
                gVar2.k(true);
            }
            this.V1.f13144f.d();
            this.W1.f13144f.d();
        }
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.P6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.f41579x1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f41420f0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.C4.K()) {
                        zArr[0] = true;
                        this.f41420f0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f41420f0.getMeasuredWidth() - min && this.E4.K()) {
                    zArr[1] = true;
                    this.f41420f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f41388b6 != 1.0f && this.f41402d2 != 11) {
            this.W6.abortAnimation();
            this.W6.fling(Math.round(this.Y5), Math.round(this.Z5), Math.round(f10), Math.round(f11), (int) this.F6, (int) this.G6, (int) this.H6, (int) this.I6);
            this.f41420f0.postInvalidate();
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

    public final void p0(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        org.telegram.messenger.re reVar;
        if (this.f41519q6 != null) {
            f14 = org.telegram.messenger.g0.T1(0.0f, this.f41443h6, this.f41483m6);
            f10 = org.telegram.messenger.g0.T1(this.f41388b6, this.f41426f6, this.f41483m6);
            f11 = org.telegram.messenger.g0.T1(this.f41397c6, this.f41435g6, this.f41483m6);
            f12 = org.telegram.messenger.g0.T1(this.Z5, this.f41416e6, this.f41483m6);
            f13 = org.telegram.messenger.g0.T1(this.Y5, this.f41406d6, this.f41483m6);
        } else {
            f10 = this.f41388b6;
            f11 = this.f41397c6;
            f12 = this.Z5;
            f13 = this.Y5;
            if (this.f41501o6 != 0) {
                f13 = this.f41406d6;
                f12 = this.f41416e6;
                f10 = this.f41426f6;
            }
            f14 = 0.0f;
        }
        int m1 = m1(this.f41562v4);
        int k1 = k1();
        canvas.translate(d1(this.f41562v4), e1(this.f41562v4));
        canvas.translate(f13, f12 + 0.0f);
        canvas.scale(f10, f10);
        canvas.rotate(f11);
        int q10 = this.D4.q();
        int o10 = this.D4.o();
        float f19 = m1;
        float f20 = q10;
        float f21 = f19 / f20;
        float f22 = k1;
        float f23 = o10;
        float f24 = f22 / f23;
        float min = Math.min(f21, f24);
        pg.f fVar = this.E1;
        int i3 = fVar.f53477i;
        if (i3 != 90 && i3 != 270) {
            o10 = q10;
            q10 = o10;
        }
        float f25 = fVar.f53478j;
        float f26 = fVar.f53479k;
        float f27 = o10;
        float f28 = q10;
        float f29 = f10;
        float f30 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        float f31 = f19 / f30;
        float f32 = (int) ((((1.0f - f26) * 0.0f) + f26) * f28);
        if (f31 * f32 > f22) {
            f31 = f22 / f32;
        }
        int i10 = this.f41402d2;
        float f33 = f31;
        dq0 dq0Var = this.Y4;
        if (i10 != 1 && ((this.f41562v4 != 1 || this.f41510p6 == 0) && dq0Var.f44797c != null)) {
            float f34 = f30 * f33;
            float f35 = f32 * f33;
            if (f21 * f23 > f22) {
                f21 = f24;
            }
            float y9 = com.google.android.recaptcha.internal.a.y((f20 * f21) / f29, f34, 0.0f, f34);
            float y10 = com.google.android.recaptcha.internal.a.y((f23 * f21) / f29, f35, 0.0f, f35);
            canvas.clipRect((-y9) / 2.0f, (-y10) / 2.0f, y9 / 2.0f, y10 / 2.0f);
        }
        if (this.f41402d2 == 1 || fVar.f53471a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.messenger.re reVar2 = dq0Var.f44797c;
                if (reVar2 != null && reVar2.f25118l) {
                    f17 = -1.0f;
                } else {
                    f17 = 1.0f;
                }
                textureView.setScaleX(f17);
                fq0 fq0Var = this.F2;
                if (fq0Var != null) {
                    fq0Var.setScaleX(this.C2.getScaleX());
                }
            }
            org.telegram.messenger.re reVar3 = dq0Var.f44797c;
            if (reVar3 != null) {
                f15 = reVar3.f25112c;
                f16 = 1.0f;
            } else {
                f15 = 1.0f;
                f16 = 1.0f;
            }
            float y11 = ((f33 / min) / com.google.android.recaptcha.internal.a.y(f15, f16, 0.0f, f16)) * f15;
            canvas.translate(fVar.d * f16, fVar.f53474e * f16);
            canvas.scale(y11, y11);
            canvas.translate(com.google.android.recaptcha.internal.a.C(fVar.f53472b, f27, min, f16), com.google.android.recaptcha.internal.a.C(fVar.f53473c, f28, min, f16));
            float f36 = fVar.f53476g + i3;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            canvas.rotate(f36);
        }
        if (!this.h7.isEmpty() && (reVar = dq0Var.f44797c) != null && reVar.f25118l) {
            f18 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f18 = 1.0f;
        }
        if (f14 > 0.0f) {
            canvas.scale(f18 - (2.0f * f14), f18);
            canvas.skew(0.0f, org.telegram.messenger.k5.A(f18, f14, 4.0f * f14, 0.25f));
        }
    }

    public final org.telegram.messenger.b20 p1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.p1():org.telegram.messenger.b20");
    }

    public final void p2() {
        ug.c2 c2Var = this.f41518q5;
        if (c2Var != null && this.f41402d2 == 11) {
            if (this.f41575w7) {
                c2Var.b();
            } else {
                c2Var.m(this.D4.n(), this.D4.V, m1(this.f41562v4), k1(), new en0(this, 0));
            }
        }
    }

    public final void p3(boolean z10, boolean z11) {
        float f10;
        xm0 xm0Var = this.f41587y;
        org.telegram.messenger.g0.r(xm0Var);
        int i3 = 0;
        if (z11) {
            q3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f41577x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f41577x = null;
                }
                if (this.S3) {
                    this.S3 = false;
                    q3(true);
                    return;
                }
                org.telegram.messenger.g0.i3(xm0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f41577x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                q3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f41577x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f41577x = null;
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
            i3 = 4;
        }
        ycVar2.setVisibility(i3);
    }

    @Override
    public final View q() {
        TextureView textureView = new TextureView(this.E);
        this.S8 = textureView;
        textureView.setOpaque(false);
        View view = this.Q8;
        if (view != null) {
            view.bringToFront();
        }
        return this.S8;
    }

    public final Size q0() {
        float f10;
        int i3;
        int round;
        int i10;
        if (this.f41380a8 == 1) {
            return new Size(this.f41408d8, this.f41418e8);
        }
        int i11 = this.Z7;
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
        if (this.f41408d8 > this.f41418e8) {
            i3 = this.f41408d8;
        } else {
            i3 = this.f41418e8;
        }
        float f11 = f10 / i3;
        if (this.Z7 == this.f41380a8 - 1 && f11 >= 1.0f) {
            i10 = this.f41408d8;
            round = this.f41418e8;
        } else {
            int round2 = Math.round((this.f41408d8 * f11) / 2.0f) * 2;
            round = Math.round((this.f41418e8 * f11) / 2.0f) * 2;
            i10 = round2;
        }
        int i12 = i10 % 4;
        if (i12 != 0 || round % 4 != 0) {
            i10 = (i10 - i12) - (round % 4);
        }
        return new Size(i10, round);
    }

    public final long q1() {
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null && tp0Var.f38729y) {
            return tp0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.S();
    }

    public final void q2(String str, long j10, boolean z10, float f10, float f11, int i3, long j11) {
        boolean z11;
        int parseInt;
        if (this.f41596y8 != null) {
            Utilities.f21387e.a(this.f41596y8);
            this.f41596y8 = null;
        }
        no0 no0Var = this.T7;
        no0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        no0Var.E = mediaMetadataRetriever;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        no0Var.f39911x = z11;
        no0Var.d = f10;
        no0Var.f39903e = f11;
        float f12 = no0Var.f39909s;
        if (f12 < f10) {
            no0Var.f39909s = f10;
        } else if (f12 > f11) {
            no0Var.f39909s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                no0Var.f39912y = open;
                no0Var.E.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = no0Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                no0Var.f39896a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = no0Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                no0Var.f39898b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = no0Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                no0Var.f39900c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = no0Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = no0Var.f39898b;
                no0Var.f39898b = no0Var.f39900c;
                no0Var.f39900c = i11;
            }
            if (no0Var.f39911x) {
                no0Var.f39905f = (float) ((j11 / 1000.0d) / no0Var.f39896a);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        no0Var.invalidate();
        this.f41605z8 = null;
        if (!z10 && this.f41402d2 != 1) {
            z12 = false;
        }
        this.f41522r = z12;
        this.f41380a8 = -1;
        this.f41399c8 = 0;
        this.f41469k8 = 25;
        this.f41566v8 = new File(str).length();
        org.telegram.messenger.p5 p5Var = Utilities.f21387e;
        up0 up0Var = new up0(this, str, j10, i3);
        this.f41596y8 = up0Var;
        p5Var.c(up0Var);
    }

    public final void q3(boolean z10) {
        float f10;
        if (z10) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41577x = animatorSet;
        yc ycVar = this.Y0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, property, f10));
        this.f41577x.setDuration(200L);
        this.f41577x.addListener(new ep0(this, z10, 1));
        this.f41577x.start();
    }

    @Override
    public final void r(b8.cg cgVar) {
        this.R8 = cgVar;
        this.T8 = false;
        if (this.f41437h0 != null) {
            ((WindowManager) this.E.getSystemService("window")).addView(this.f41437h0, this.f41410e0);
            this.f41437h0.invalidate();
        }
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            m51Var.z0(null);
            this.G2.A0(null);
            this.G2.h0();
            TextureView textureView = this.C2;
            if (textureView != null) {
                this.G2.A0(textureView);
                return;
            }
            SurfaceView surfaceView = this.D2;
            if (surfaceView != null) {
                this.G2.z0(surfaceView);
            }
        }
    }

    public final boolean r0(MotionEvent motionEvent) {
        boolean z10;
        tp0 tp0Var;
        if (this.G2 != null || ((tp0Var = this.f41429g0) != null && tp0Var.f38729y)) {
            if (motionEvent.getX() >= (m1(this.f41562v4) / 3) * 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            long q12 = q1();
            long C1 = C1();
            if (q12 != -9223372036854775807L && C1 > 15000 && (!z10 || C1 - q12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final TLObject r1(int i3, long[] jArr) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.f41427f7;
        if (!arrayList.isEmpty()) {
            if (i3 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.wv) arrayList.get(i3)).f26263b.size;
            }
            return (TLObject) arrayList.get(i3);
        }
        ArrayList arrayList2 = this.f41389b7;
        if (!arrayList2.isEmpty()) {
            if (i3 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f41407d7;
                if (arrayList3.get(i3) != null) {
                    jArr[0] = ((Long) arrayList3.get(i3)).longValue();
                }
            }
            ArrayList arrayList4 = this.f41398c7;
            if (arrayList4.get(i3) == null) {
                return null;
            }
            return ((org.telegram.messenger.ac) arrayList4.get(i3)).f21488f;
        }
        ArrayList arrayList5 = this.Z6;
        if (arrayList5.isEmpty() || i3 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList5.get(i3);
        TLRPC.Message message = ziVar.f26868k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 != null) {
                if (jArr != null) {
                    long j10 = w10.size;
                    jArr[0] = j10;
                    if (j10 == 0) {
                        jArr[0] = -1;
                    }
                }
                return w10;
            } else if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = ziVar.Y0;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j11 = w11.size;
                        jArr[0] = j11;
                        if (j11 == 0) {
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
                            long j12 = w12.size;
                            jArr[0] = j12;
                            if (j12 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return w12;
                    } else if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.zi.o1(ziVar.f26868k).photo != null) || ((org.telegram.messenger.zi.o1(ziVar.f26868k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(ziVar.f26868k).webpage != null)) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(true), false, null, true);
                if (w13 != null) {
                    if (jArr != null) {
                        long j13 = w13.size;
                        jArr[0] = j13;
                        if (j13 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w13;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (org.telegram.messenger.zi.o1(ziVar.f26868k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.zi.o1(ziVar.f26868k)).photo;
            } else {
                if (ziVar.F0() != null && org.telegram.messenger.zi.X2(ziVar.F0())) {
                    TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(ziVar.F0().thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j14 = w14.size;
                        jArr[0] = j14;
                        if (j14 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w14;
                }
            }
        }
        return null;
    }

    public final void r2(boolean z10) {
        int i3 = 0;
        this.E2 = false;
        uf.d dVar = this.H2;
        if (dVar != null) {
            dVar.c();
            this.H2 = null;
        }
        org.telegram.ui.Components.m51 m51Var = this.G2;
        HashMap hashMap = X8;
        po0 po0Var = this.f41590y2;
        if (m51Var != null) {
            v0();
            org.telegram.messenger.g0.r(this.f41580x2);
            org.telegram.messenger.g0.r(po0Var);
            if (this.f41403d3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.f41403d3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new pq0(S));
                org.telegram.messenger.zi ziVar = this.U4;
                if (ziVar != null) {
                    ziVar.f26867j3 = Float.valueOf(S);
                }
            }
            this.G2.m0();
            this.G2 = null;
        } else {
            this.Y2 = false;
        }
        if (this.f41429g0 != null) {
            org.telegram.messenger.g0.r(po0Var);
            if (this.f41403d3 != null) {
                float q12 = ((float) q1()) / ((float) C1());
                String str2 = this.f41403d3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new pq0(q12));
                org.telegram.messenger.zi ziVar2 = this.U4;
                if (ziVar2 != null) {
                    ziVar2.f26867j3 = Float.valueOf(q12);
                }
            }
        }
        org.telegram.ui.Components.st stVar = this.X3;
        if (stVar != null) {
            stVar.disable();
            this.X3 = null;
        }
        this.f41543t3.a();
        p3(false, false);
        this.f41534s2 = false;
        this.V2 = false;
        if (this.f41568w0.isEnabled()) {
            this.f41568w0.setEnabled(false);
            this.f41568w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.i3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.i3 = false;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.zd0 zd0Var = this.f41599z2;
        if (zd0Var != null) {
            try {
                this.f41420f0.removeView(zd0Var);
            } catch (Throwable unused) {
            }
            this.f41599z2 = null;
        }
        t0();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.b51) {
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) textureView;
                org.telegram.ui.Components.py pyVar = b51Var.f32088b;
                if (pyVar != null) {
                    pyVar.postRunnable(new org.telegram.ui.Components.my(pyVar, 0));
                }
                b51Var.f32087a = null;
            }
            this.C2 = null;
        }
        this.f41392c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.Q3) {
            this.Q3 = false;
            org.telegram.messenger.g0.r(this.f41448i4);
        }
        if (!z10 && !this.C8 && !this.D8) {
            S2(false, true);
        }
        mo0 mo0Var = this.X0[0];
        while (true) {
            float[] fArr = mo0Var.f47730n;
            if (i3 < fArr.length) {
                mo0Var.f47729m[i3] = 1.0f;
                fArr[i3] = 1.0f;
                i3++;
            } else {
                mo0Var.a();
                return;
            }
        }
    }

    public final void r3(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = org.telegram.messenger.g0.N(24.0f);
        int i3 = this.f41402d2;
        if (i3 == 0 || i3 == 4) {
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

    public final boolean s0() {
        wm wmVar = this.f41481m4;
        if (wmVar != null) {
            if (wmVar.f51306f == null) {
                TLRPC.Chat chat = wmVar.f51292e;
                if (chat != null && !org.telegram.messenger.t3.r0(chat)) {
                    if (org.telegram.messenger.t3.p(this.f41481m4.f51292e) || org.telegram.messenger.t3.u(this.f41481m4.f51292e)) {
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

    public final void s2(int i3) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f41605z8 != null) {
            MediaController.B().i(this.f41605z8);
        }
        if (this.D8 && !this.A8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D8 = false;
        this.B8 = false;
        this.R7.setVisibility(4);
        if (i3 == 1) {
            if (this.f41436g8 == this.f41418e8 && this.f41428f8 == this.f41408d8) {
                this.A8 = false;
                mo0 mo0Var = this.X0[0];
                if (mo0Var.h != 0 && mo0Var.f47727k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                mo0Var.f(z12, 0.0f);
                this.X0[0].d(3, false, true);
                if (!z10) {
                    o2(this.W4, this.X4, false, false, this.Y4.d, false, 0L);
                    this.G2.p0(this.T7.getLeftProgress() * this.f41461j8);
                } else {
                    this.B8 = true;
                }
            } else {
                r2(false);
                if (this.f41605z8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f27022id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.F5;
                    org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, false);
                    this.f41605z8 = ziVar;
                    ziVar.f26868k.attachPath = new File(org.telegram.messenger.w7.z(4), "video_preview.mp4").getAbsolutePath();
                    this.f41605z8.f26886p0 = new org.telegram.messenger.b20();
                    org.telegram.messenger.b20 b20Var = this.f41605z8.f26886p0;
                    b20Var.f21715g = this.f41399c8;
                    b20Var.h = this.f41408d8;
                    this.f41605z8.f26886p0.f21716i = this.f41418e8;
                    org.telegram.messenger.b20 b20Var2 = this.f41605z8.f26886p0;
                    b20Var2.f21721n = this.f41469k8;
                    Uri uri = this.X4;
                    if (uri == null) {
                        b20Var2.f21722o = uri.getPath();
                    } else {
                        b20Var2.f21722o = uri.getPath();
                    }
                }
                org.telegram.messenger.b20 b20Var3 = this.f41605z8.f26886p0;
                long j10 = this.f41494n8;
                b20Var3.f21708a = j10;
                long j11 = this.f41503o8;
                b20Var3.f21710b = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f41461j8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    b20Var3.f21710b = j10 + 5000000;
                }
                b20Var3.f21720m = this.f41444h8;
                this.f41605z8.f26886p0.f21718k = this.f41428f8;
                this.f41605z8.f26886p0.f21719l = this.f41436g8;
                org.telegram.messenger.b20 b20Var4 = this.f41605z8.f26886p0;
                b20Var4.Y = true;
                b20Var4.v = this.f41461j8 * 1000.0f;
                if (!MediaController.B().h0(this.f41605z8, true, true, true)) {
                    this.A8 = true;
                }
                this.D8 = true;
                mo0 mo0Var2 = this.X0[0];
                if (mo0Var2.h != 0 && mo0Var2.f47727k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                mo0Var2.f(z11, 0.0f);
                this.X0[0].d(0, false, true);
            }
        } else {
            this.A8 = false;
            this.X0[0].d(3, false, true);
            if (i3 == 2) {
                o2(this.W4, this.X4, false, false, this.Y4.d, false, 0L);
                this.G2.p0(this.T7.getLeftProgress() * this.f41461j8);
            }
        }
        this.f41420f0.invalidate();
    }

    public final void s3(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10 != this.L) {
            if (z10) {
                this.f41505p1.setVisibility(0);
            }
            this.L = z10;
            this.f41505p1.setEnabled(z10);
            float f14 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                rq0 rq0Var = this.f41505p1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(rq0Var, property, f12));
                rq0 rq0Var2 = this.f41505p1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = -org.telegram.messenger.g0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(rq0Var2, property2, f13));
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
                    this.C1.addListener(new xo0(this, 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            rq0 rq0Var3 = this.f41505p1;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            rq0Var3.setAlpha(f10);
            rq0 rq0Var4 = this.f41505p1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(10.0f);
            }
            rq0Var4.setTranslationY(f11);
            CounterView counterView2 = this.P0;
            if (!z10) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z10) {
                this.f41505p1.setVisibility(8);
            }
        }
    }

    public void setAnimationValue(float f10) {
        this.f41483m6 = f10;
        this.f41420f0.invalidate();
        I1();
    }

    public final void t0() {
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
        org.telegram.ui.Components.ad0 ad0Var = this.D1;
        if (ad0Var != null && (animatorSet = ad0Var.f31814s) != null) {
            animatorSet.cancel();
            ad0Var.f31814s = null;
            ad0Var.f31811f = false;
        }
    }

    public final String t1(int i3) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (i3 >= 0) {
            ArrayList arrayList = this.f41427f7;
            if (!arrayList.isEmpty()) {
                if (i3 < arrayList.size()) {
                    org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) arrayList.get(i3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(wvVar.f26263b.dc_id);
                    sb2.append("_");
                    return a1.g.r(sb2, wvVar.f26263b.f27138id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.f41389b7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Z6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.h7;
                    if (!arrayList4.isEmpty()) {
                        if (i3 < arrayList4.size()) {
                            Object obj = arrayList4.get(i3);
                            if (obj instanceof org.telegram.messenger.bf) {
                                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                                TLRPC.PhotoSize photoSize = bfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.w7.r(null, photoSize);
                                }
                                TLRPC.Document document = bfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.w7.r(null, document);
                                }
                                return Utilities.a(bfVar.C) + "." + org.telegram.messenger.zb.B(bfVar.C, "jpg");
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
                                    sb3.append(org.telegram.messenger.zb.B(webDocument2.url, org.telegram.messenger.w7.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        hq0 hq0Var = this.f41468k7;
                        if (hq0Var != null) {
                            return hq0Var.c(i3);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i3 < arrayList2.size()) {
                        org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList2.get(i3);
                        org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) this.f41398c7.get(i3);
                        if (acVar != null) {
                            if (acVar2 != null && acVar2 != acVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(acVar2.f21488f.volume_id);
                                sb4.append("_");
                                return a1.g.o(acVar2.f21488f.local_id, ".mp4", sb4);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(acVar.f21488f.volume_id);
                            sb5.append("_");
                            return a1.g.o(acVar.f21488f.local_id, ".jpg", sb5);
                        }
                    }
                } else if (i3 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.zi) arrayList3.get(i3)).f26868k;
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
                        } else if (org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.w7.r(null, org.telegram.messenger.zi.o1(message).document);
                        } else {
                            if (org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.zi.o1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w11 = org.telegram.messenger.w7.w(arrayList6, org.telegram.messenger.g0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.w7.r(null, w11);
                                }
                                return "";
                            } else if (org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.zi.o1(message).webpage.document != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.zi.o1(message).webpage.document);
                                }
                                if (org.telegram.messenger.zi.o1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.zi.o1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w10 = org.telegram.messenger.w7.w(arrayList7, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.w7.r(null, w10);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.zi.o1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.zb.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type));
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

    public final float t2() {
        return u2(true);
    }

    public final void t3() {
        boolean z10;
        org.telegram.ui.Components.m51 m51Var;
        org.telegram.ui.Components.m51 m51Var2;
        tp0 tp0Var;
        org.telegram.ui.Components.m51 m51Var3 = this.G2;
        if (m51Var3 == null && ((tp0Var = this.f41429g0) == null || !tp0Var.f38729y)) {
            return;
        }
        if (m51Var3 != null) {
            z10 = this.Q3;
        } else {
            z10 = this.f41429g0.H;
        }
        v0();
        org.telegram.messenger.g0.r(this.f41590y2);
        if (z10) {
            k2();
        } else {
            if (this.f41533s1) {
                if (Math.abs(this.T7.getProgress() - this.T7.getRightProgress()) < 0.01f || ((m51Var2 = this.G2) != null && m51Var2.S() == this.G2.U())) {
                    x2(this.T7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f41526r3.c() - this.T7.getRightProgress()) < 0.01f || ((m51Var = this.G2) != null && m51Var.S() == this.G2.U())) {
                    x2(0.0f);
                }
                v2();
            }
            m2();
        }
        this.f41420f0.invalidate();
    }

    public final void u0() {
        if (this.f41402d2 == 11) {
            yp0 yp0Var = this.f41554u5;
            if (yp0Var.f56254n0 == 2) {
                yp0Var.setCutOutState(true);
                a3(true, true);
                this.f41518q5.f();
                this.f41420f0.invalidate();
            }
        }
    }

    public final org.telegram.messenger.ac u1(int i3, long[] jArr) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f41427f7;
            if (!arrayList.isEmpty()) {
                if (i3 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.wv) arrayList.get(i3)).f26263b.size;
                    }
                    org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) arrayList.get(i3);
                    if (wvVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = wvVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.f41389b7;
                if (!arrayList2.isEmpty()) {
                    if (i3 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f41407d7;
                            if (arrayList3.get(i3) != null) {
                                jArr[0] = ((Long) arrayList3.get(i3)).longValue();
                            }
                        }
                        return (org.telegram.messenger.ac) this.f41398c7.get(i3);
                    }
                } else {
                    ArrayList arrayList4 = this.Z6;
                    if (!arrayList4.isEmpty() && i3 < arrayList4.size()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(i3);
                        TLRPC.Message message = ziVar.f26868k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    if (jArr != null) {
                                        long j10 = w10.size;
                                        jArr[0] = j10;
                                        if (j10 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.ac.f(w10, ziVar.f26872l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = ziVar.Y0;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.ac.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, true);
                                    if (w11 != null) {
                                        if (jArr != null) {
                                            long j11 = w11.size;
                                            jArr[0] = j11;
                                            if (j11 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.ac.f(w11, ziVar.Y0.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.zi.o1(ziVar.f26868k).photo != null) || ((org.telegram.messenger.zi.o1(ziVar.f26868k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(ziVar.f26868k).webpage != null)) {
                                if (org.telegram.messenger.zi.u3(ziVar.f26868k)) {
                                    return org.telegram.messenger.ac.b(ziVar.F0());
                                }
                                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(true), false, null, true);
                                if (w12 != null) {
                                    if (jArr != null) {
                                        long j12 = w12.size;
                                        jArr[0] = j12;
                                        if (j12 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.ac.f(w12, ziVar.f26872l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.zi.o1(ziVar.f26868k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.zi.o1(ziVar.f26868k)).webPhoto));
                            } else {
                                if (ziVar.F0() != null) {
                                    TLRPC.Document F0 = ziVar.F0();
                                    if (this.D5 == 5) {
                                        return org.telegram.messenger.ac.b(F0);
                                    }
                                    if (org.telegram.messenger.zi.X2(ziVar.F0())) {
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j13 = w13.size;
                                            jArr[0] = j13;
                                            if (j13 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.ac.c(w13, F0);
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

    public final float u2(boolean z10) {
        int i3;
        if (this.f41402d2 == 11) {
            int m1 = m1(this.f41562v4);
            if (m1 == 0) {
                m1 = org.telegram.messenger.g0.f22608q.x;
            }
            float D = org.telegram.messenger.camera.q.D(20.0f, m1, 1) / m1;
            if (z10) {
                int q10 = this.D4.q();
                int o10 = this.D4.o();
                if ((q10 <= 1 || o10 <= 1) && (i3 = this.Q4) >= 0) {
                    ArrayList arrayList = this.h7;
                    if (i3 < arrayList.size()) {
                        Object obj = arrayList.get(this.Q4);
                        if (obj instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                            q10 = yeVar.F;
                            o10 = yeVar.G;
                            if ((yeVar.J / 90) % 2 != 0) {
                                o10 = q10;
                                q10 = o10;
                            }
                        }
                    }
                }
                if (q10 > 1 && o10 > 1 && q10 > o10) {
                    return (q10 / o10) * D;
                }
            }
            return D;
        }
        return 1.0f;
    }

    public final void u3() {
        View view = this.U3;
        if (view != null) {
            mo0 mo0Var = this.X0[0];
            int i3 = mo0Var.h;
            if (mo0Var.f47732p && (i3 == 3 || i3 == 4 || i3 == 2 || i3 == 1)) {
                if (i3 == 3) {
                    view.setContentDescription(org.telegram.messenger.bd.M0(2131754929, "AccActionPlay"));
                } else if (i3 == 2) {
                    view.setContentDescription(org.telegram.messenger.bd.M0(2131754938, "AccActionDownload"));
                } else if (i3 == 1) {
                    view.setContentDescription(org.telegram.messenger.bd.M0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.bd.M0(2131754930, "AccActionPause"));
                }
                this.U3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void v0() {
        Runnable runnable = this.J2;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.J2 = null;
        }
    }

    public final void v2() {
        if (!J1()) {
            org.telegram.messenger.zi ziVar = this.U4;
            if (ziVar == null || !ziVar.s4()) {
                po0 po0Var = this.f41590y2;
                org.telegram.messenger.g0.r(po0Var);
                org.telegram.messenger.g0.i3(po0Var, 3000);
            }
        }
    }

    public final void v3() {
        if (this.B0 != null && this.N != null) {
            float f10 = 0.0f;
            for (int i3 = 0; i3 < this.B0.getChildCount(); i3++) {
                View childAt = this.B0.getChildAt(i3);
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
            jq0 jq0Var = this.N;
            ValueAnimator valueAnimator = jq0Var.f46676n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                jq0Var.f46676n = null;
            }
            jq0Var.f46677r = f10;
            jq0Var.f46673c[0].setRightPadding((int) f10);
            jq0Var.d.setRightPadding(f10);
        }
    }

    public final void w0() {
        float f10;
        org.telegram.ui.ActionBar.x xVar = this.B0;
        if (xVar != null) {
            if (this.f41431g2) {
                f10 = -org.telegram.messenger.g0.L(4.0f);
            } else {
                f10 = 0.0f;
            }
            xVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.F0;
        if (q0Var != null) {
            L2(q0Var, this.f41431g2, false);
        }
        boolean z10 = this.f41422f2;
        if (z10 && this.J == null) {
            gh.g c2 = this.Z.c(this.H, null, false);
            c2.p(b8.cd.i(this.f41570w2));
            c2.r(org.telegram.messenger.g0.L(20.0f));
            c2.q(org.telegram.messenger.g0.L(7.0f));
            int L = org.telegram.messenger.g0.L(54.0f);
            int L2 = org.telegram.messenger.g0.L(54.0f);
            Matrix matrix = jh.d.f16256a;
            this.J = new jh.c(L, L2, c2);
        }
        if (z10) {
            b8.pf.a(this.H);
            this.H.setBackground(this.J);
            return;
        }
        this.H.setStateListAnimator(null);
        this.H.setBackground(this.I);
    }

    public final int w1() {
        return this.f41542t2.left;
    }

    public final void w2(long j10) {
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null && tp0Var.f38729y) {
            tp0Var.i(j10);
        } else {
            org.telegram.ui.Components.m51 m51Var = this.G2;
            if (m51Var != null) {
                m51Var.p0(j10);
            }
        }
        F3();
    }

    public final void w3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f41520q7) {
            charSequence = this.f41529r7;
        } else if (obj instanceof org.telegram.messenger.ye) {
            charSequence = ((org.telegram.messenger.ye) obj).f25309a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.bf)) {
            charSequence = ((org.telegram.messenger.bf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            h1().setText("");
        } else {
            h1().setText(org.telegram.ui.Components.p5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.xs editText = h1().f13144f.getEditText();
        wm wmVar = this.f41481m4;
        if (wmVar != null && ((encryptedChat = wmVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final boolean x0() {
        if (this.f41499o4 != 0) {
            I1();
            if (Math.abs(this.f41508p4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f41517q4;
                if (runnable != null) {
                    runnable.run();
                    this.f41517q4 = null;
                }
                this.f41499o4 = 0;
            }
        }
        if (this.f41499o4 == 0) {
            return false;
        }
        return true;
    }

    public final TLRPC.Document x1() {
        int i3;
        if (this.Y5 == 0.0f && this.Z5 == 0.0f && (i3 = this.Q4) >= 0) {
            ArrayList arrayList = this.h7;
            if (i3 < arrayList.size()) {
                Object obj = arrayList.get(this.Q4);
                if (obj instanceof org.telegram.messenger.se) {
                    org.telegram.messenger.se seVar = (org.telegram.messenger.se) obj;
                    if (!seVar.v && !seVar.f25328w && !seVar.f25327u) {
                        return this.f41565v7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void x2(float f10) {
        org.telegram.ui.Components.m51 m51Var = this.G2;
        if (m51Var != null) {
            m51Var.p0(f10 * ((float) m51Var.U()));
            return;
        }
        tp0 tp0Var = this.f41429g0;
        if (tp0Var != null) {
            tp0Var.i(f10 * tp0Var.getVideoDuration());
        }
    }

    public final void x3() {
        int i3 = org.telegram.ui.ActionBar.k6.f28071ng;
        int B1 = B1(i3);
        mi.x1 x1Var = this.T0;
        if (x1Var != null) {
            x1Var.k();
            this.T0.invalidate();
        }
        CheckBox checkBox = this.O0;
        if (checkBox != null) {
            checkBox.c(B1(i3), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(B1, mode);
        ImageView imageView = this.Z0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.f41373a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.f41373a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f41401d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f41401d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f41393c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f41393c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f41383b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f41383b1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.v0 v0Var = this.V0;
        if (v0Var != null) {
            ((TextView) v0Var.f30707b).setTextColor(B1);
        }
        org.telegram.ui.Cells.v0 v0Var2 = this.Q7;
        if (v0Var2 != null) {
            ((TextView) v0Var2.f30707b).setTextColor(B1);
        }
        lp0 lp0Var = this.M1;
        if (lp0Var != null) {
            lp0Var.updateColors();
        }
        org.telegram.ui.Components.nd0 nd0Var = this.J1;
        if (nd0Var != null) {
            ImageView imageView6 = nd0Var.C0;
            ImageView imageView7 = nd0Var.B0;
            ImageView imageView8 = nd0Var.A0;
            org.telegram.ui.ActionBar.e6 e6Var = nd0Var.J0;
            TextView textView = nd0Var.f36469h0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), mode));
            }
            nd0Var.e();
        }
        qo0 qo0Var = this.V1;
        if (qo0Var != null) {
            qo0Var.H(this.f41570w2);
        }
        ro0 ro0Var = this.W1;
        if (ro0Var != null) {
            ro0Var.H(this.f41570w2);
        }
        no0 no0Var = this.T7;
        if (no0Var != null) {
            no0Var.invalidate();
        }
        rq0 rq0Var = this.f41505p1;
        if (rq0Var != null) {
            int childCount = rq0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41505p1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w5) {
                    ((org.telegram.ui.Cells.w5) childAt).f30805c.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
                }
            }
        }
        go0 go0Var = this.V3;
        if (go0Var != null) {
            go0Var.X0(true);
        }
    }

    public final void y0(boolean z10) {
        View view;
        float x10;
        float y9;
        float f10;
        float f11;
        if (z10) {
            TextureView textureView = this.f41581x3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new f7(this, 4));
                this.f41581x3.invalidate();
            }
        } else if (this.H3 == 2) {
            ImageView imageView = this.f41591y3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f41591y3.setImageDrawable(null);
                Bitmap bitmap = this.D3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.D3 = null;
                }
            }
            this.M3 = false;
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            org.telegram.ui.Components.zd0 zd0Var = this.f41599z2;
            if (zd0Var != null) {
                int[] iArr = this.B3;
                zd0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f41420f0.getTranslationY());
                ImageView imageView2 = this.f41591y3;
                Rect rect = this.f41542t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f41599z2.getX());
                }
                fq0 fq0Var = this.F2;
                if (fq0Var != null) {
                    fq0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wm0(this, 4));
                if (this.E2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f41599z2.getX();
                }
                if (this.E2) {
                    y9 = 0.0f;
                } else {
                    y9 = iArr[1] - this.f41599z2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f41591y3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f41591y3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f41591y3;
                Property property3 = View.TRANSLATION_X;
                if (this.E2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f41591y3;
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
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y9));
                arrayList.add(ObjectAnimator.ofInt(this.M0, org.telegram.ui.Components.k6.d, 255));
                fq0 fq0Var2 = this.F2;
                if (fq0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(fq0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property4, y9));
                }
                org.telegram.ui.Components.ie0.j(false, this.f41599z2.getAspectRatio());
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ci.uc(23, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new vn0(this, view, 0));
                animatorSet.start();
                wp0 wp0Var = new wp0();
                wp0Var.f51587c = false;
                wp0Var.d = false;
                wp0Var.f51585a = 250;
                wp0Var.f51586b = decelerateInterpolator;
                n3(true, true, wp0Var);
                this.H3 = 0;
            }
        }
    }

    public final RenderNode y1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j10;
        if (this.L8 == null) {
            renderNode = null;
        } else {
            renderNode = this.M8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a10 = eh.g.a(org.telegram.messenger.g0.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a10, a10, Shader.TileMode.CLAMP));
                this.M8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.L8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.L8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.L8.getWidth(), ceil2 / this.L8.getHeight());
                beginRecording.drawRenderNode(this.L8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        eh.a aVar = this.N8;
        aVar.f9979b = 0L;
        aVar.f9978a = false;
        for (float f10 : colorMatrix.getArray()) {
            aVar.c(f10);
        }
        aVar.a(0L);
        if (aVar.f9978a) {
            j10 = -1;
        } else {
            j10 = aVar.f9979b;
        }
        RenderNode renderNode2 = (RenderNode) this.O8.f(j10);
        if (renderNode2 == null) {
            RenderNode renderNode3 = new RenderNode("pv_mat_" + j10 + "_false");
            renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            renderNode2 = renderNode3;
        }
        if ((!renderNode2.hasDisplayList()) | renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight())) {
            renderNode2.beginRecording().drawRenderNode(renderNode);
            renderNode2.endRecording();
        }
        return renderNode2;
    }

    public final int y2() {
        int i3;
        if (this.f41566v8 > 1048576000) {
            return this.f41380a8 - 1;
        }
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        int i10 = this.f41380a8;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = e12.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(this.U);
        int e10 = org.telegram.messenger.t0.e();
        if (e10 == 1) {
            i3 = q10.p().h;
        } else if (e10 == 2) {
            i3 = q10.o().h;
        } else {
            i3 = q10.n().h;
        }
        return Math.min(2, Math.round(i3 / (100.0f / i10)) - 1);
    }

    public final void y3(boolean z10) {
        gq0 gq0Var;
        int i3;
        if (this.f41402d2 != 1 && (gq0Var = this.f41420f0) != null) {
            if (!z10) {
                if (gq0Var.getPaddingLeft() <= 0 && this.f41420f0.getPaddingRight() <= 0) {
                    i3 = 1796;
                } else {
                    i3 = 5894;
                }
            } else {
                i3 = 1792;
            }
            this.f41420f0.setSystemUiVisibility(i3);
        }
    }

    public final void z0() {
        mq0 mq0Var = this.f41415e5;
        if (mq0Var != null) {
            mq0Var.f47751a.O0(true, true);
        }
        kq0 kq0Var = this.d;
        mq0 mq0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (kq0Var != null) {
            org.telegram.messenger.zi ziVar = this.U4;
            org.telegram.messenger.ac acVar = this.f41377a5;
            if (acVar != null) {
                tL_fileLocationToBeDeprecated = acVar.f21488f;
            }
            mq0Var2 = kq0Var.E(ziVar, tL_fileLocationToBeDeprecated, this.Q4, false, false);
        }
        this.f41415e5 = mq0Var2;
        if (mq0Var2 != null && !mq0Var2.f47767s) {
            mq0Var2.f47751a.O0(false, true);
        }
    }

    public final int z1() {
        return this.f41542t2.right;
    }

    public final void z2(final boolean z10, final int i3, final int i10, final boolean z11, final boolean z12, boolean z13) {
        boolean z14;
        org.telegram.messenger.b20 b20Var;
        String str;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        org.telegram.messenger.re reVar;
        org.telegram.messenger.re reVar2;
        TLRPC.Chat chat;
        boolean z15;
        int i11;
        wm wmVar;
        org.telegram.ui.Components.d30 d30Var;
        String str2;
        long j10;
        String M0;
        TextureView textureView;
        if (!K1() && this.d != null && !this.f41560v2) {
            if (this.f41402d2 == 1) {
                if (!z13 && (d30Var = this.f41506p2) != null) {
                    TLObject tLObject = d30Var.f32923a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j11 = user.f27150id;
                        str2 = str3;
                        j10 = j11;
                    } else {
                        str2 = "";
                        j10 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41420f0.getContext());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.Y0 = L;
                    Context context = this.f41420f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f52528a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f52529b = imageReceiver2;
                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                    view.f52531e = new Path();
                    u8Var.r(org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f());
                    imageReceiver.i0(org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f(), u8Var, null);
                    imageReceiver2.i0(org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f(), u8Var, null);
                    Drawable drawable = context.getDrawable(2131232056);
                    view.f52532f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f41506p2.f32923a;
                    gq0 gq0Var = this.f41420f0;
                    org.telegram.ui.Components.ad0 ad0Var = this.D1;
                    u8Var.l(tLObject2);
                    imageReceiver.i0(tLObject2, u8Var, null);
                    view.f52530c = gq0Var;
                    view.d = ad0Var;
                    s1Var.W = view;
                    if (this.f41506p2.f32925c == 1) {
                        if (org.telegram.messenger.h10.i(this.U).f22848n == j10) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131745509, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131745510, str2, str2));
                        }
                        if (this.J4) {
                            M0 = org.telegram.messenger.bd.M0(2131745507, "SetVideo");
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131745529, "SetPhoto");
                        }
                    } else {
                        if (this.J4) {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744406, str2));
                        } else {
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744417, str2));
                        }
                        M0 = org.telegram.messenger.bd.M0(2131744415, "SuggestPhotoShort");
                    }
                    String str4 = M0;
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), new u70(4));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.p1() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                            Drawable[] drawableArr = PhotoViewer.V8;
                            PhotoViewer.this.z2(z10, i3, i10, z11, z12, true);
                        }
                    });
                    s1Var.J = org.telegram.ui.ActionBar.k6.f27889dh;
                    s1Var.W0 = true;
                    s1Var.j(i0.a.o(-15461356, 204));
                    s1Var.show();
                    s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false));
                    s1Var.setOnDismissListener(new to0(this));
                    if (this.f41533s1 && (textureView = this.C2) != null) {
                        try {
                            this.E3 = textureView.getBitmap();
                            ImageView imageView = this.F3;
                            if (imageView != null) {
                                this.f41599z2.removeView(imageView);
                                this.F3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.C2.getContext());
                            this.F3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.E3));
                            this.f41599z2.addView(this.F3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.D3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.D3 = null;
                            }
                            org.telegram.messenger.a8.g(th2, true);
                            return;
                        }
                    }
                    return;
                }
                n0();
            }
            if (!z11 && (wmVar = this.f41481m4) != null) {
                TLRPC.Chat chat2 = wmVar.f51292e;
                if (wmVar.j() != null || ((org.telegram.messenger.t3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.t3.T(chat2))) {
                    org.telegram.messenger.hp.s1(this.U).f22989d7.edit().putBoolean("silent_" + this.f41481m4.a(), !z10).commit();
                }
            }
            org.telegram.messenger.b20 p12 = p1();
            ArrayList arrayList = this.h7;
            if (!arrayList.isEmpty() && (i11 = this.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(this.Q4);
                if (obj instanceof org.telegram.messenger.se) {
                    ((org.telegram.messenger.se) obj).f25325s = p12;
                }
            }
            wm wmVar2 = this.f41481m4;
            if (wmVar2 != null && (chat = wmVar2.f51292e) != null && this.f41402d2 != 11) {
                if (!this.f41533s1 && p12 == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15 && !org.telegram.messenger.t3.u(chat)) {
                    org.telegram.messenger.k5.p(null, 2131749546, new org.telegram.ui.Components.fc(this.f41420f0, this.f41570w2), null);
                    return;
                } else if (!z15 && !org.telegram.messenger.t3.p(this.f41481m4.f51292e)) {
                    org.telegram.messenger.k5.p(null, 2131749550, new org.telegram.ui.Components.fc(this.f41420f0, this.f41570w2), null);
                    return;
                }
            }
            this.f41560v2 = true;
            if (p12 != null) {
                long j12 = ((float) p12.f21724q) * 0.9f;
                if ((j12 > 2097152000 && !org.telegram.messenger.h10.i(this.U).q()) || j12 > 4194304000L) {
                    if (this.f41384b2 != null) {
                        org.telegram.ui.Components.bi biVar = this.f41384b2;
                        new vg.i0(6, org.telegram.messenger.h10.f22829t0, biVar.f28589c.getContext(), biVar.X1, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.f41402d2 == 11) {
                    Object obj2 = arrayList.get(this.Q4);
                    if (obj2 instanceof org.telegram.messenger.ye) {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int m1 = m1(this.f41562v4);
                        k1();
                        float L2 = m1 - org.telegram.messenger.g0.L(20.0f);
                        ug.c2 c2Var = this.f41518q5;
                        if (c2Var != null && c2Var.f55909j0 && c2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.f41518q5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.D4.h(canvas, null);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.f41518q5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.D4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f41601z4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            ImageReceiver imageReceiver3 = this.D4;
                            canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                            canvas.scale(this.D4.N0 / this.f41601z4.getMeasuredWidth(), this.D4.O0 / this.f41601z4.getMeasuredHeight());
                            this.f41601z4.f36431e = !E1();
                            this.f41601z4.draw(canvas);
                            this.f41601z4.f36431e = true;
                            canvas.restore();
                        }
                        if (E1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = L2 / 2.0f;
                            matrix.preTranslate(f18, f18);
                            if (this.f41519q6 != null) {
                                f15 = org.telegram.messenger.g0.T1(0.0f, this.f41443h6, this.f41483m6);
                                f10 = 2.0f;
                                f11 = org.telegram.messenger.g0.T1(this.f41388b6, this.f41426f6, this.f41483m6);
                                f12 = org.telegram.messenger.g0.T1(this.f41397c6, this.f41435g6, this.f41483m6);
                                f13 = org.telegram.messenger.g0.T1(this.Z5, this.f41416e6, this.f41483m6);
                                f14 = org.telegram.messenger.g0.T1(this.Y5, this.f41406d6, this.f41483m6);
                            } else {
                                f10 = 2.0f;
                                f11 = this.f41388b6;
                                f12 = this.f41397c6;
                                f13 = this.Z5;
                                f14 = this.Y5;
                                if (this.f41501o6 != 0) {
                                    f14 = this.f41406d6;
                                    f13 = this.f41416e6;
                                    f11 = this.f41426f6;
                                }
                                f15 = 0.0f;
                            }
                            int m12 = m1(this.f41562v4);
                            int k1 = k1();
                            matrix.preTranslate(f14, f13 + 0.0f);
                            matrix.preScale(f11, f11);
                            matrix.preRotate(f12);
                            int q10 = this.D4.q();
                            int o10 = this.D4.o();
                            float f19 = m12;
                            float f20 = k1;
                            float min = Math.min(f19 / q10, f20 / o10);
                            pg.f fVar = this.E1;
                            int i12 = fVar.f53477i;
                            if (i12 != 90 && i12 != 270) {
                                o10 = q10;
                                q10 = o10;
                            }
                            float f21 = fVar.f53478j;
                            float f22 = fVar.f53479k;
                            float f23 = o10;
                            float f24 = q10;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i13 = this.f41402d2;
                            dq0 dq0Var = this.Y4;
                            if (i13 == 1 || fVar.f53471a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.re reVar3 = dq0Var.f44797c;
                                    if (reVar3 != null && reVar3.f25118l) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    fq0 fq0Var = this.F2;
                                    if (fq0Var != null) {
                                        fq0Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.re reVar4 = dq0Var.f44797c;
                                if (reVar4 != null) {
                                    f16 = reVar4.f25112c;
                                } else {
                                    f16 = 1.0f;
                                }
                                float y9 = ((f25 / min) / com.google.android.recaptcha.internal.a.y(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(fVar.d * 1.0f, fVar.f53474e * 1.0f);
                                matrix.preScale(y9, y9);
                                matrix.preTranslate(com.google.android.recaptcha.internal.a.C(fVar.f53472b, f23, min, 1.0f), com.google.android.recaptcha.internal.a.C(fVar.f53473c, f24, min, 1.0f));
                                float f27 = fVar.f53476g + i12;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (reVar2 = dq0Var.f44797c) != null && reVar2.f25118l) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f15 > 0.0f) {
                                matrix.preScale(1.0f - (f15 * f10), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.k5.A(1.0f, f15, 4.0f * f15, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.D4;
                            matrix.preTranslate((-imageReceiver4.N0) / f10, (-imageReceiver4.O0) / f10);
                            ImageReceiver imageReceiver5 = this.D4;
                            matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = yeVar.f25322p;
                            int size = arrayList3.size();
                            int i14 = 0;
                            String str5 = null;
                            while (i14 < size) {
                                Object obj3 = arrayList3.get(i14);
                                i14++;
                                org.telegram.messenger.z10 a10 = ((org.telegram.messenger.z10) obj3).a();
                                float f28 = a10.f26705c;
                                float f29 = a10.d;
                                float f30 = a10.f26707f + f28;
                                float f31 = a10.f26708g + f29;
                                ArrayList arrayList4 = arrayList3;
                                float[] fArr = {f28, f29, f30, f29, f30, f31, f28, f31};
                                matrix.mapPoints(fArr);
                                float f32 = L2;
                                a10.f26707f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / f32;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f32;
                                a10.f26708g = sqrt;
                                a10.f26705c = (((fArr[0] + fArr[4]) / f10) / f32) - (a10.f26707f / f10);
                                a10.d = (((fArr[1] + fArr[5]) / f10) / f32) - (sqrt / f10);
                                a10.v = 1.0f;
                                a10.A = true;
                                if (yeVar.f25328w && (reVar = yeVar.A) != null) {
                                    a10.f26706e = (float) (a10.f26706e - ((reVar.f25117k / 180.0f) * 3.141592653589793d));
                                }
                                a10.f26706e = (float) (a10.f26706e - ((this.f41397c6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a10);
                                TLRPC.Document document = a10.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.zi.V(document, null, null);
                                }
                                arrayList3 = arrayList4;
                                L2 = f32;
                            }
                            org.telegram.messenger.b20 b20Var2 = new org.telegram.messenger.b20();
                            b20Var2.I = true;
                            b20Var2.f21718k = 512;
                            b20Var2.h = 512;
                            b20Var2.f21719l = 512;
                            b20Var2.f21716i = 512;
                            b20Var2.G = arrayList2;
                            long k10 = Utilities.k(yeVar.f25326t, 2999L, 800L);
                            b20Var2.f21725r = k10;
                            b20Var2.v = k10;
                            b20Var2.f21720m = 200000;
                            b20Var2.f21721n = 30;
                            z14 = true;
                            b20Var2.N = true;
                            b20Var2.f21724q = 262144L;
                            b20Var = b20Var2;
                            str = str5;
                        } else {
                            z14 = true;
                            b20Var = null;
                            str = null;
                        }
                        float f33 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.zb.a0(createBitmap, Bitmap.CompressFormat.WEBP, f33, f33, 100);
                        org.telegram.messenger.w7.G(org.telegram.messenger.h10.f22829t0);
                        String file = org.telegram.messenger.w7.K(a02, "webp", z14, z14).toString();
                        if (b20Var != null) {
                            b20Var.f21722o = file;
                        }
                        if (this.f41537s5 == null) {
                            this.f41537s5 = new ArrayList();
                        }
                        if (this.f41537s5.isEmpty()) {
                            String str6 = this.f41518q5.f55901d0;
                            if (str6 != null && org.telegram.messenger.i6.g(str6) != null) {
                                this.f41537s5.add(this.f41518q5.f55901d0);
                            } else if (str != null) {
                                this.f41537s5.add(str);
                            } else {
                                this.f41537s5.add("👍");
                            }
                        }
                        this.f41560v2 = false;
                        is p10 = is.p();
                        ug.c2 c2Var2 = this.f41518q5;
                        ArrayList arrayList5 = this.f41537s5;
                        uo0 uo0Var = new uo0(this, file, b20Var, yeVar, z10, i3, i10, z12);
                        es esVar = p10.U;
                        Activity W = org.telegram.messenger.g0.W(c2Var2.getContext());
                        if (W != null) {
                            p10.v(W);
                            p10.u(uo0Var);
                            ?? obj4 = new Object();
                            obj4.f25249a = file;
                            obj4.f25254g = b20Var;
                            p10.f46399o = arrayList5;
                            p10.s(null, obj4, null, null, null, 3, false, null, new ei.b(), 0);
                            org.telegram.messenger.g0.r(esVar);
                            org.telegram.messenger.g0.i3(esVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.Q4, p12, z10, i3, i10, z12);
            } else {
                this.d.M(p12);
            }
            if (this.P) {
                if (this.Q) {
                    org.telegram.messenger.g0.i3(new qn0(this, 0), 200L);
                } else {
                    H0(false, false);
                }
            }
        }
    }

    public final void z3(float f10) {
        int m1;
        int k1;
        boolean z10;
        View view;
        org.telegram.ui.Components.zd0 zd0Var = this.f41599z2;
        if (zd0Var != null && zd0Var.getVisibility() == 0 && this.I3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f10 *= Math.min(m1(this.f41562v4) / view.getMeasuredWidth(), D1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.D4;
        float f11 = imageReceiver.N0;
        float f12 = imageReceiver.O0;
        org.telegram.messenger.re reVar = this.Y4.f44797c;
        if (reVar != null) {
            f11 *= reVar.f25113e;
            f12 *= reVar.f25114f;
        }
        if (this.f41402d2 == 11) {
            m1 = (int) (f11 * f10);
        } else {
            m1 = ((int) ((f11 * f10) - m1(this.f41562v4))) / 2;
        }
        if (this.f41402d2 == 11) {
            k1 = (int) (f12 * f10);
        } else {
            k1 = ((int) ((f12 * f10) - k1())) / 2;
        }
        float f13 = 0.0f;
        if (m1 > 0) {
            this.F6 = -m1;
            this.G6 = m1;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        if (k1 > 0) {
            this.H6 = -k1;
            this.I6 = k1;
        } else {
            this.I6 = 0.0f;
            this.H6 = 0.0f;
        }
        lp0 lp0Var = this.M1;
        if (lp0Var != null) {
            if (f10 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = lp0Var.f55971h1;
            boolean z11 = !z10;
            if (lp0Var.I1 != z11) {
                lp0Var.I1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.camera.q.l(animate.alpha(f13), org.telegram.ui.Components.xq.h, 240L);
            }
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
