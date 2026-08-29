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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.e20, org.telegram.ui.Components.d20, cf.a, vd.b {
    public static Drawable[] P8;
    public static final Paint Q8 = new Paint(2);
    public static final HashMap R8 = new HashMap();
    public static DecelerateInterpolator S8;
    public static Paint T8;
    public static final Property U8;
    public static volatile PhotoViewer V8;
    public static volatile PhotoViewer W8;
    public ContextThemeWrapper A;
    public org.telegram.ui.ActionBar.w0 A0;
    public wf.f A1;
    public qt0 A2;
    public ImageView A3;
    public org.telegram.ui.Components.la A4;
    public long A5;
    public float A6;
    public final gq0 A7;
    public org.telegram.ui.Components.d6[] A8;
    public cg.m1 B;
    public org.telegram.ui.ActionBar.g1 B0;
    public wf.f B1;
    public org.telegram.ui.Components.x61 B2;
    public boolean B3;
    public org.telegram.ui.Components.la B4;
    public kg.q0 B5;
    public float B6;
    public Path B7;
    public RectF B8;
    public ImageView C;
    public org.telegram.ui.Components.r7 C0;
    public MediaController.CropState C1;
    public af.g C2;
    public int C3;
    public org.telegram.ui.Components.la C4;
    public String C5;
    public float C6;
    public Paint C7;
    public RectF C8;
    public Drawable D;
    public ua1 D0;
    public MediaController.CropState D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public boolean D5;
    public float D6;
    public Paint D7;
    public Matrix D8;
    public org.telegram.ui.ActionBar.s5 E;
    public d81 E0;
    public org.telegram.ui.Components.ef0 E1;
    public Runnable E2;
    public boolean E3;
    public boolean E4;
    public long E5;
    public boolean E6;
    public LinearGradient E7;
    public float[] E8;
    public boolean F;
    public lr F0;
    public AnimatorSet F1;
    public boolean F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public LinearGradient F7;
    public RenderNode F8;
    public boolean G;
    public final HashMap G0;
    public nh.w3 G1;
    public float G2;
    public boolean G3;
    public boolean G4;
    public int G5;
    public boolean G6;
    public Matrix G7;
    public RenderNode G8;
    public AnimatorSet H;
    public final BackgroundDrawable H0;
    public ws0 H1;
    public float H2;
    public boolean H3;
    public boolean H4;
    public int H5;
    public boolean H6;
    public Matrix H7;
    public final g.x H8;
    public wt0 I;
    public final Paint I0;
    public boolean I1;
    public float I2;
    public boolean I3;
    public final Matrix I4;
    public boolean I5;
    public int I6;
    public final int[] I7;
    public final a0.h I8;
    public ut0 J;
    public CheckBox J0;
    public vs0 J1;
    public float J2;
    public float J3;
    public final Paint J4;
    public boolean J5;
    public int J6;
    public bu0 J7;
    public boolean J8;
    public boolean K;
    public CounterView K0;
    public boolean K1;
    public float K2;
    public long K3;
    public Bitmap K4;
    public boolean K5;
    public boolean K6;
    public org.telegram.ui.Components.of0 K7;
    public View K8;
    public boolean L;
    public bg.u1 L0;
    public org.telegram.ui.ActionBar.c2 L1;
    public float L2;
    public boolean L3;
    public int L4;
    public final boolean[] L5;
    public boolean L6;
    public RadialProgressView L7;
    public c2.p L8;
    public sr0 M;
    public FrameLayout M0;
    public nt0 M1;
    public boolean M2;
    public boolean M3;
    public int M4;
    public boolean M5;
    public boolean M6;
    public FrameLayout M7;
    public TextureView M8;
    public boolean N;
    public FrameLayout N0;
    public FrameLayout N1;
    public int N2;
    public boolean N3;
    public boolean N4;
    public boolean N5;
    public boolean N6;
    public ur0 N7;
    public boolean N8;
    public Paint O;
    public org.telegram.ui.Components.hp0 O0;
    public TextView O1;
    public org.telegram.ui.Components.x61 O2;
    public long O3;
    public boolean O4;
    public boolean O5;
    public boolean O6;
    public TextView O7;
    public boolean O8;
    public int P;
    public org.telegram.ui.Components.gf0 P0;
    public xs0 P1;
    public SurfaceTexture P2;
    public View P3;
    public MessageObject P4;
    public boolean P5;
    public int P6;
    public AnimatorSet P7;
    public int Q;
    public org.telegram.ui.Components.of0 Q0;
    public xr0 Q1;
    public boolean Q2;
    public nr0 Q3;
    public VideoAds Q4;
    public boolean Q5;
    public VelocityTracker Q6;
    public long Q7;
    public int R;
    public TextView R0;
    public yr0 R1;
    public boolean R2;
    public int R3;
    public ArrayList R4;
    public boolean R5;
    public Scroller R6;
    public long R7;
    public float S;
    public final vt0[] S0;
    public float S1;
    public boolean S2;
    public js0 S3;
    public Uri S4;
    public float S5;
    public final ArrayList S6;
    public long S7;
    public oc.i T;
    public fd T0;
    public n0 T1;
    public boolean T2;
    public int T3;
    public final ot0 T4;
    public float T5;
    public final SparseArray[] T6;
    public volatile int T7;
    public lg.a U;
    public ImageView U0;
    public FrameLayout U1;
    public boolean U2;
    public int U3;
    public TLRPC.BotInlineResult U4;
    public float U5;
    public final ArrayList U6;
    public volatile int U7;
    public zd.b V;
    public ImageView V0;
    public FrameLayout V1;
    public boolean V2;
    public boolean V3;
    public ImageLocation V4;
    public float V5;
    public final SparseArray[] V6;
    public int V7;
    public zd.b W;
    public ImageView W0;
    public org.telegram.ui.Components.ni W1;
    public float W2;
    public final org.telegram.ui.Cells.f1 W3;
    public ImageLocation W4;
    public float W5;
    public final ArrayList W6;
    public int W7;
    public org.telegram.ui.Components.ga X;
    public ImageView X0;
    public jf.r0 X1;
    public String X2;
    public final VideoFramesRewinder X3;
    public SecureDocument X4;
    public float X5;
    public final ArrayList X6;
    public volatile int X7;
    public org.telegram.ui.Components.ka Y;
    public ImageView Y0;
    public int Y1;
    public String Y2;
    public final gs0 Y3;
    public final String[] Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public WindowManager.LayoutParams Z;
    public org.telegram.ui.Components.gc0 Z0;
    public boolean Z1;
    public long Z2;
    public final org.telegram.ui.Cells.b2 Z3;
    public zt0 Z4;
    public float Z5;
    public final ArrayList Z6;
    public volatile int Z7;
    public final vd.a f35646a = new vd.a(0, this, org.telegram.ui.Components.jr.h, 380, false);
    public rt0 f35647a0;
    public org.telegram.ui.ActionBar.m0 f35648a1;
    public boolean a2;
    public float f35649a3;
    public CharSequence f35650a4;
    public String f35651a5;
    public float f35652a6;
    public final ArrayList f35653a7;
    public volatile int f35654a8;
    public final boolean f35655b;
    public et0 f35656b0;
    public org.telegram.ui.Components.a90 f35657b1;
    public boolean f35658b2;
    public boolean f35659b3;
    public boolean f35660b4;
    public long f35661b5;
    public float f35662b6;
    public final ArrayList f35663b7;
    public volatile int f35664b8;
    public int f35665c;
    public yt0 f35666c0;
    public vr0 f35667c1;
    public boolean f35668c2;
    public long c3;
    public boolean f35669c4;
    public String f35670c5;
    public float c6;
    public final ArrayList f35671c7;
    public volatile int f35672c8;
    public xt0 d;
    public ClippingImageView f35673d0;
    public ArrayList f35674d1;
    public boolean f35675d2;
    public boolean f35676d3;
    public final wr0 f35677d4;
    public boolean f35678d5;
    public float f35679d6;
    public ImageLocation f35680d7;
    public float f35681d8;
    public boolean f35682e;
    public bh.d f35683e0;
    public ArrayList f35684e1;
    public boolean f35685e2;
    public gu0 f35686e3;
    public final wr0 f35687e4;
    public TL_iv.PageBlock f35688e5;
    public float f35689e6;
    public cu0 f35690e7;
    public int f35691e8;
    public boolean f35692f;
    public View f35693f0;
    public org.telegram.ui.Components.j61 f35694f1;
    public org.telegram.ui.Components.c6 f35695f2;
    public String f35696f3;
    public final h70 f35697f4;
    public ImageReceiver.BitmapHolder f35698f5;
    public float f35699f6;
    public tt0 f35700f7;
    public volatile boolean f35701f8;
    public int f35702g0;
    public nh.t3 f35703g1;
    public boolean f35704g2;
    public ValueAnimator f35705g3;
    public final float[][] f35706g4;
    public boolean f35707g5;
    public float f35708g6;
    public final Rect f35709g7;
    public volatile boolean f35710g8;
    public int h;
    public TextView f35711h0;
    public org.telegram.ui.Components.t30 f35712h1;
    public boolean f35713h2;
    public boolean f35714h3;
    public tn f35715h4;
    public boolean f35716h5;
    public float f35717h6;
    public final AnimationNotificationsLocker f35718h7;
    public long f35719h8;
    public TextView f35720i0;
    public org.telegram.ui.Components.q11 f35721i1;
    public boolean f35722i2;
    public final int[] f35723i3;
    public org.telegram.ui.ActionBar.o2 f35724i4;
    public boolean f35725i5;
    public float f35726i6;
    public jf.s0 f35727i7;
    public long f35728i8;
    public TextView f35729j0;
    public UndoView f35730j1;
    public boolean f35731j2;
    public final int[] f35732j3;
    public int f35733j4;
    public boolean f35734j5;
    public long f35735j6;
    public org.telegram.ui.Components.mc f35736j7;
    public float f35737j8;
    public org.telegram.ui.ActionBar.w0 f35738k0;
    public fu0 f35739k1;
    public org.telegram.ui.Components.q40 f35740k2;
    public org.telegram.ui.ActionBar.h5 f35741k3;
    public long f35742k4;
    public String f35743k5;
    public int f35744k6;
    public int f35745k7;
    public float f35746k8;
    public org.telegram.ui.ActionBar.w0 f35747l0;
    public st0 l1;
    public boolean f35748l2;
    public ImageView f35749l3;
    public Runnable f35750l4;
    public bg.u3 f35751l5;
    public AnimatorSet f35752l6;
    public boolean f35753l7;
    public long f35754l8;
    public org.telegram.ui.ActionBar.g1 m0;
    public ImageReceiver f35755m1;
    public MessagesController.DialogPhotos f35756m2;
    public org.telegram.ui.Components.z61 f35757m3;
    public zt0 f35758m4;
    public org.telegram.ui.Components.ff0 f35759m5;
    public AnimatorSet f35760m6;
    public CharSequence f35761m7;
    public long f35762m8;
    public boolean f35763n;
    public org.telegram.ui.ActionBar.c1 f35764n0;
    public boolean f35765n1;
    public boolean f35766n2;
    public op0 f35767n3;
    public zt0 f35768n4;
    public ArrayList f35769n5;
    public org.telegram.ui.Components.f20 f35770n6;
    public boolean f35771n7;
    public long f35772n8;
    public org.telegram.ui.ActionBar.g1 f35773o0;
    public final gq0 f35774o1;
    public final Rect f35775o2;
    public is0 f35776o3;
    public boolean f35777o4;
    public lh.z2 f35778o5;
    public boolean f35779o6;
    public ValueAnimator f35780o7;
    public long f35781o8;
    public org.telegram.ui.ActionBar.g1 f35782p0;
    public float f35783p1;
    public boolean f35784p2;
    public AnimatorSet f35785p3;
    public boolean f35786p4;
    public jt0 f35787p5;
    public final DecelerateInterpolator f35788p6;
    public TLRPC.Document f35789p7;
    public long f35790p8;
    public org.telegram.ui.ActionBar.l1 f35791q0;
    public long f35792q1;
    public boolean f35793q2;
    public boolean f35794q3;
    public int f35795q4;
    public LinearLayout f35796q5;
    public float q6;
    public TLRPC.Document f35797q7;
    public long f35798q8;
    public boolean f35799r;
    public org.telegram.ui.ActionBar.g1 f35800r0;
    public final GradientDrawable[] f35801r1;
    public org.telegram.ui.ActionBar.c6 f35802r2;
    public int f35803r3;
    public final gq0 f35804r4;
    public jt0 f35805r5;
    public float r6;
    public boolean f35806r7;
    public float f35807r8;
    public boolean f35808s;
    public nr f35809s0;
    public final boolean[] f35810s1;
    public final qr0 f35811s2;
    public TextureView f35812s3;
    public int f35813s4;
    public jt0 f35814s5;
    public float f35815s6;
    public boolean f35816s7;
    public ft0 f35817s8;
    public LinearLayout f35818t0;
    public final float[] f35819t1;
    public final wr0 f35820t2;
    public ImageView f35821t3;
    public String f35822t4;
    public jt0 f35823t5;
    public float f35824t6;
    public Utilities.Callback2 f35825t7;
    public MessageObject f35826t8;
    public final ArrayList f35827u0;
    public int f35828u1;
    public os0 f35829u2;
    public final ImageView[] f35830u3;
    public org.telegram.ui.Components.bd0 f35831u4;
    public jt0 f35832u5;
    public float f35833u6;
    public final float[] f35834u7;
    public boolean f35835u8;
    public int v;
    public org.telegram.ui.ActionBar.l1 f35836v0;
    public org.telegram.ui.Components.n61 f35837v1;
    public View f35838v2;
    public boolean f35839v3;
    public org.telegram.ui.Components.bd0 f35840v4;
    public long f35841v5;
    public float f35842v6;
    public final float[] f35843v7;
    public boolean f35844v8;
    public AnimatorSet f35845w;
    public org.telegram.ui.ActionBar.a0 f35846w0;
    public org.telegram.ui.Components.eo0 f35847w1;
    public AnimatorSet f35848w2;
    public final int[] f35849w3;
    public org.telegram.ui.Components.bd0 f35850w4;
    public boolean f35851w5;
    public float f35852w6;
    public ObjectAnimator f35853w7;
    public boolean f35854w8;
    public final gq0 f35855x;
    public org.telegram.ui.ActionBar.w0 f35856x0;
    public AnimatorSet f35857x1;
    public TextureView f35858x2;
    public boolean f35859x3;
    public ImageReceiver x4;
    public boolean f35860x5;
    public float f35861x6;
    public int f35862x7;
    public boolean f35863x8;
    public Activity f35864y;
    public org.telegram.ui.ActionBar.w0 f35865y0;
    public org.telegram.ui.Components.pe0 f35866y1;
    public SurfaceView f35867y2;
    public Bitmap f35868y3;
    public ImageReceiver f35869y4;
    public int f35870y5;
    public float f35871y6;
    public float f35872y7;
    public String y8;
    public org.telegram.ui.ActionBar.w0 f35873z0;
    public final wf.f f35874z1;
    public boolean f35875z2;
    public Bitmap f35876z3;
    public ImageReceiver f35877z4;
    public long f35878z5;
    public float f35879z6;
    public float f35880z7;
    public final org.telegram.ui.Components.d6 f35881z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f35882g = 0;
        public final RectF f35883a;
        public final RectF f35884b;
        public final Paint f35885c;
        public lf0 d;
        public boolean f35886e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f35883a = new RectF();
            this.f35884b = new RectF();
            Paint paint = new Paint(1);
            this.f35885c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            jf.s0 s0Var = photoViewer.f35727i7;
            if (s0Var != null) {
                s0Var.a(!this.f35886e);
            }
            jf.r0 r0Var = photoViewer.X1;
            if (r0Var != null) {
                r0Var.a(!this.f35886e);
            }
            org.telegram.ui.Components.ni niVar = photoViewer.W1;
            if (niVar != null) {
                boolean z11 = this.f35886e;
                niVar.f31051u0.k(niVar.f31013h2);
                if (niVar.f31030n2 != z11) {
                    niVar.f31030n2 = z11;
                    org.telegram.ui.Components.fi fiVar = niVar.f31051u0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
                    if (fiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f26266e1) {
                        if (z11 && !niVar.f31033o2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f26280n && !chatAttachAlertPhotoLayout.K0) {
                            if (z10) {
                                org.telegram.ui.Components.yl ylVar = chatAttachAlertPhotoLayout.L;
                                if (ylVar != null) {
                                    chatAttachAlertPhotoLayout.f26277k0 = Boolean.valueOf(ylVar.isFrontface());
                                    chatAttachAlertPhotoLayout.d0(true);
                                    return;
                                }
                                return;
                            }
                            chatAttachAlertPhotoLayout.s0();
                        }
                    }
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            lf0 lf0Var;
            zt0 zt0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.O8) {
                if (photoViewer.f35733j4 != 0 && !AndroidUtilities.isTablet() && (zt0Var = photoViewer.Z4) != null && zt0Var.f45326m != null) {
                    ClippingImageView clippingImageView = photoViewer.f35673d0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f35884b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f26344b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f26345c;
                    rectF.bottom = scaleY - clippingImageView.f26343a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f9 = bounds.right;
                        float f10 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f35883a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 == 3) {
                                            rectF2.set(0.0f, rectF.bottom, f9, f10);
                                        }
                                    } else {
                                        rectF2.set(rectF.right, rectF.top, f9, rectF.bottom);
                                    }
                                } else {
                                    rectF2.set(0.0f, 0.0f, f9, rectF.top);
                                }
                            } else {
                                rectF2.set(0.0f, rectF.top, rectF.left, rectF.bottom);
                            }
                            canvas.drawRect(rectF2, this.f35885c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (lf0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(lf0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f35864y instanceof LaunchActivity) {
                if (photoViewer.f35682e && i10 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f35886e = z10;
                if (z10) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new it0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f35885c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f35888a;
        public final TextPaint f35889b;
        public final Paint f35890c;
        public int d;
        public int f35891e;
        public final RectF f35892f;
        public int h;
        public float f35893n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f35889b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f35890c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f35892f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f35889b;
            this.f35888a = new StaticLayout("" + Math.max(1, i10), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f35891e = this.f35888a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f35890c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.p6 p6Var = org.telegram.ui.Components.r6.f32221b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, p6Var, 0), ObjectAnimator.ofInt(textPaint, p6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.p6 p6Var2 = org.telegram.ui.Components.r6.f32221b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, p6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, p6Var2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i10 < i11) {
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
            this.h = i10;
        }

        @Override
        public final float getRotationX() {
            return this.f35893n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f35890c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f35892f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f35888a != null) {
                this.f35889b.setAlpha((int) ((1.0f - this.f35893n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f35893n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.f35891e) / 2));
                this.f35888a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f35893n * 255.0f));
                int centerX = (int) rectF.centerX();
                int b10 = (int) th.b(1.0f, this.f35893n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
                canvas.drawLine(AndroidUtilities.dp(5.0f) + centerX, b10 - AndroidUtilities.dp(5.0f), centerX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + b10, paint);
                canvas.drawLine(centerX - AndroidUtilities.dp(5.0f), b10 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + centerX, AndroidUtilities.dp(5.0f) + b10, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i10 = this.h;
            if (i10 > 0) {
                accessibilityNodeInfo.setContentDescription(LocaleController.formatPluralString("PhotosSelected", i10, new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(20.0f) + this.d, AndroidUtilities.dp(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f9) {
            this.f35893n = f9;
            invalidate();
        }

        @Override
        public void setScaleX(float f9) {
            super.setScaleX(f9);
            invalidate();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            U8 = new er0();
        } else {
            U8 = new org.telegram.ui.Cells.b1(Float.class, "progress", 3);
        }
        V8 = null;
        W8 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35655b = z10;
        this.h = -1;
        this.f35763n = true;
        this.f35855x = new gq0(this, 20);
        this.F = true;
        this.K = true;
        this.L = false;
        this.V = new zd.b(true);
        this.f35827u0 = new ArrayList();
        this.G0 = new HashMap(3);
        this.H0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.I0 = paint;
        this.S0 = new vt0[3];
        this.f35774o1 = new gq0(this, 21);
        this.f35801r1 = new GradientDrawable[2];
        this.f35810s1 = new boolean[2];
        this.f35819t1 = new float[2];
        this.f35874z1 = new Object();
        this.A1 = new Object();
        this.B1 = new Object();
        this.S1 = -8.0f;
        this.f35775o2 = new Rect();
        this.f35811s2 = new qr0(this);
        this.f35820t2 = new wr0(this, 0);
        this.f35714h3 = true;
        this.f35723i3 = new int[2];
        this.f35732j3 = new int[2];
        this.f35830u3 = new ImageView[3];
        this.f35849w3 = new int[2];
        this.G3 = true;
        this.R3 = -1;
        this.T3 = -10;
        this.W3 = new org.telegram.ui.Cells.f1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.X3 = videoFramesRewinder;
        this.Y3 = new gs0(this, videoFramesRewinder);
        this.Z3 = new org.telegram.ui.Cells.b2(this);
        this.f35677d4 = new wr0(this, 1);
        this.f35687e4 = new wr0(this, 2);
        this.f35697f4 = new h70(this, 1);
        this.f35706g4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f35804r4 = new gq0(this, 22);
        this.x4 = new ImageReceiver();
        this.f35869y4 = new lh.x2(this, 4);
        this.f35877z4 = new ImageReceiver();
        this.A4 = new org.telegram.ui.Components.la(1, new gq0(this, 23));
        this.B4 = new org.telegram.ui.Components.la(1, new gq0(this, 23));
        this.C4 = new org.telegram.ui.Components.la(1, new gq0(this, 23));
        this.H4 = false;
        this.I4 = new Matrix();
        Paint paint2 = new Paint();
        this.J4 = paint2;
        this.K4 = null;
        this.T4 = new Object();
        this.Y4 = new String[3];
        this.L5 = new boolean[]{false, true};
        this.W5 = 1.0f;
        this.X5 = 0.0f;
        this.f35744k6 = -1;
        this.f35788p6 = new DecelerateInterpolator(1.5f);
        this.f35815s6 = 1.0f;
        this.f35824t6 = 0.0f;
        this.E6 = true;
        this.M6 = true;
        this.S6 = new ArrayList();
        this.T6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.U6 = new ArrayList();
        this.V6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.W6 = new ArrayList();
        this.X6 = new ArrayList();
        this.Y6 = new ArrayList();
        this.Z6 = new ArrayList();
        this.f35653a7 = new ArrayList();
        this.f35663b7 = new ArrayList();
        this.f35671c7 = new ArrayList();
        this.f35680d7 = null;
        this.f35690e7 = null;
        this.f35709g7 = new Rect();
        this.f35718h7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f35834u7 = new float[]{1.0f};
        this.f35843v7 = new float[]{1.0f};
        this.A7 = new gq0(this, 24);
        this.I7 = new int[2];
        this.Q7 = -1L;
        this.R7 = -1L;
        this.S7 = -1L;
        this.U7 = -1;
        this.f35881z8 = new org.telegram.ui.Components.d6(new gq0(this, 23), 180L, org.telegram.ui.Components.jr.f29801g);
        this.H8 = new Object();
        this.I8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.f35869y4.setFileLoadingPriority(3);
    }

    public static void C(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.x61 x61Var;
        MessageObject messageObject;
        boolean z11;
        rt0 rt0Var = photoViewer.f35647a0;
        photoViewer.Z.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f35864y.getSystemService("window")).updateViewLayout(photoViewer.f35666c0, photoViewer.Z);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        tn tnVar = photoViewer.f35715h4;
        if (tnVar != null && tnVar.U != null && tnVar.getFragmentView() != null) {
            dk dkVar = photoViewer.f35715h4.U;
            if (dkVar.f26200u2) {
                dkVar.s1();
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.f35715h4.getParentActivity(), photoViewer.f35665c);
            photoViewer.f35715h4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (x61Var = photoViewer.B2) != null && x61Var.o() > 1500 && (messageObject = photoViewer.P4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.B2.o() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                th.w(sb2, MessagesController.getInstance(photoViewer.P).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject2.getId());
                str = sb2.toString();
            }
        }
        cs0 cs0Var = new cs0(photoViewer, photoViewer.f35864y, photoViewer.f35715h4, arrayList, str, num, rt0Var, z10);
        cs0Var.setFocusable(false);
        cs0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new lf0(20, photoViewer, cs0Var), 250L);
        cs0Var.show();
    }

    public static boolean C1() {
        if (V8 != null) {
            return true;
        }
        return false;
    }

    public static void D(PhotoViewer photoViewer) {
        File file;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.r0()) {
            return;
        }
        MessageObject messageObject2 = photoViewer.P4;
        File file2 = null;
        if (messageObject2 != null) {
            if (messageObject2.canEditMedia() && !photoViewer.P4.isDocument()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.P4.isOutOwner()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean isVideo = photoViewer.P4.isVideo();
            if (!TextUtils.isEmpty(photoViewer.P4.messageOwner.attachPath)) {
                File file3 = new File(photoViewer.P4.messageOwner.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                file2 = FileLoader.getInstance(photoViewer.P).getPathToMessage(photoViewer.P4.messageOwner);
            }
            messageObject = messageObject2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = isVideo;
        } else {
            file = null;
            messageObject = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.f35690e7 = new cu0(photoViewer, photoViewer.L4, new ArrayList(photoViewer.U6), photoViewer.d);
            ht0 ht0Var = new ht0();
            ht0Var.f39049c = false;
            photoViewer.k3(false, true, ht0Var);
            AndroidUtilities.runOnUIThread(new qq0(photoViewer, file, z10, messageObject, z11, z12), ht0Var.f39047a);
            return;
        }
        photoViewer.U2();
    }

    public static void F(org.telegram.ui.PhotoViewer r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.F(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap I0(android.graphics.Bitmap r16, org.telegram.messenger.MediaController.CropState r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.I0(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean J1(MessageObject messageObject) {
        if (V8 != null && !V8.f35859x3 && V8.f35682e && messageObject != null && V8.P4 != null && V8.P4.getId() == messageObject.getId() && V8.P4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean K1(MessageObject messageObject) {
        if (W8 != null && messageObject != null && W8.P4 != null && W8.P4.getId() == messageObject.getId() && W8.P4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean L1(String str) {
        if (V8 != null && V8.f35682e && !V8.f35777o4 && str != null && str.equals(V8.f35651a5)) {
            return true;
        }
        return false;
    }

    public static boolean M1(MessageObject messageObject) {
        boolean z10;
        if (V8 != null && !V8.f35859x3 && V8.f35682e && !V8.f35777o4 && messageObject != null) {
            MessageObject messageObject2 = V8.P4;
            if (messageObject2 == null && V8.d != null) {
                messageObject2 = V8.d.U();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z10 = true;
                if (z10 && W8 != null) {
                    if (W8.f35682e && !W8.f35777o4 && messageObject != null && W8.P4 != null && W8.P4.getId() == messageObject.getId() && W8.P4.getDialogId() == messageObject.getDialogId()) {
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

    public static boolean N1(TLRPC.BotInlineResult botInlineResult) {
        if (V8 != null && V8.f35682e && !V8.f35777o4 && botInlineResult != null && V8.U4 != null && botInlineResult.f22390id == V8.U4.f22390id) {
            return true;
        }
        return false;
    }

    public static boolean O1(TLRPC.FileLocation fileLocation) {
        if (V8 != null && V8.f35682e && !V8.f35777o4 && fileLocation != null) {
            if (V8.V4 == null || fileLocation.local_id != V8.V4.location.local_id || fileLocation.volume_id != V8.V4.location.volume_id || fileLocation.dc_id != V8.V4.dc_id) {
                if (V8.W4 != null && fileLocation.local_id == V8.W4.location.local_id && fileLocation.volume_id == V8.W4.location.volume_id && fileLocation.dc_id == V8.W4.dc_id) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean R2(MessageObject messageObject) {
        if (messageObject != null && messageObject.isVideo()) {
            if ((messageObject.mediaExists || messageObject.attachPathExists || messageObject.hasVideoQualities() || (messageObject.canStreamVideo() && SharedConfig.streamMedia)) && SharedConfig.isAutoplayVideo()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void S(PhotoViewer photoViewer) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.U6;
        if (!arrayList.isEmpty() && (i10 = photoViewer.M4) >= 0 && i10 < arrayList.size() && (messageObject = (MessageObject) arrayList.get(photoViewer.M4)) != null) {
            if (photoViewer.f35734j5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k31.B())) {
                photoViewer.A2(messageObject, j2(messageObject), false, true);
            } else {
                photoViewer.A2(messageObject, messageObject.caption, photoViewer.f35734j5, true);
            }
        }
    }

    public static void V(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.Q7 != -1 && (textureView = photoViewer.f35858x2) != null) {
            photoViewer.Q7 = -1L;
            photoViewer.f35838v2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.jr.f29803j).setDuration(85L).setListener(new org.telegram.ui.Components.ok0(10, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void W(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W(org.telegram.ui.PhotoViewer):void");
    }

    public static void X(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.z61 z61Var = photoViewer.f35757m3;
        if (z61Var.f35233f) {
            i10 = z61Var.d;
        } else {
            i10 = z61Var.f35230b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.z61.S / 2) + i10)) - (photoViewer.f35776o3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f35686e3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f35776o3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            is0 is0Var = photoViewer.f35776o3;
            is0Var.setPivotX(Utilities.clamp((is0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f35776o3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            is0 is0Var2 = photoViewer.f35776o3;
            is0Var2.setPivotX(Utilities.clamp((is0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f35776o3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            is0 is0Var3 = photoViewer.f35776o3;
            is0Var3.setPivotX(is0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f35776o3.setTranslationX(dp);
    }

    public static void Y(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.xi0 lottieAnimation;
        ot0 ot0Var = photoViewer.T4;
        ArrayList arrayList = ot0Var.f41223e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) ot0Var.f41223e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.t9) && (lottieAnimation = ((org.telegram.ui.Components.t9) view).getImageReceiver().getLottieAnimation()) != null) {
                        if (z10) {
                            lottieAnimation.start();
                        } else {
                            lottieAnimation.stop();
                        }
                    }
                }
            }
        }
    }

    public static String Y0(int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= 100) {
            i12 = 99;
        } else {
            i12 = i10;
        }
        char c3 = (char) ((i12 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c6 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i13 = 99;
        } else {
            i13 = i11;
        }
        char c10 = (char) ((i13 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        return new String(new char[]{c3, c6, ':', c10, (char) ((i11 % 10) + 48)});
    }

    public static void Z(PhotoViewer photoViewer, long j10) {
        org.telegram.ui.Components.xi0 lottieAnimation;
        ot0 ot0Var = photoViewer.T4;
        ArrayList arrayList = ot0Var.f41223e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) ot0Var.f41223e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.t9) && (lottieAnimation = ((org.telegram.ui.Components.t9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j11 = photoViewer.f35719h8;
                        long j12 = 0;
                        if (j11 > 0) {
                            j12 = j11 / 1000;
                        }
                        lottieAnimation.R(j10 - j12);
                    }
                }
            }
        }
    }

    public static String Z0(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (i10 >= 100) {
            i13 = 99;
        } else {
            i13 = i10;
        }
        char c3 = (char) ((i13 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c6 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i14 = 99;
        } else {
            i14 = i11;
        }
        char c10 = (char) ((i14 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        char c11 = (char) ((i11 % 10) + 48);
        if (i12 >= 100) {
            i15 = 99;
        } else {
            i15 = i12;
        }
        char c12 = (char) ((i15 / 10) + 48);
        if (i12 >= 100) {
            i12 = 99;
        }
        return new String(new char[]{c3, c6, ':', c10, c11, ':', c12, (char) ((i12 % 10) + 48)});
    }

    public static void a0(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a0(org.telegram.ui.PhotoViewer, int):void");
    }

    public static CharSequence j2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt(), false);
        if (MessageObject.containsUrls(replaceAnimatedEmoji)) {
            try {
                AndroidUtilities.addLinksSafe(replaceAnimatedEmoji, 5, false, true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 0, 0, true);
        MessageObject.addEntitiesToText(replaceAnimatedEmoji, messageObject.messageOwner.translatedText.entities, messageObject.isOutOwner(), true, true, true);
        if (messageObject.isVideo()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 3, (int) messageObject.getDuration(), false);
        } else if (messageObject.isMusic() || messageObject.isVoice()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 4, (int) messageObject.getDuration(), false);
        }
        return replaceAnimatedEmoji;
    }

    public static boolean k(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static String q1(ImageLocation imageLocation) {
        if (imageLocation != null && imageLocation.imageType == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer t1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = V8;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = V8;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        V8 = photoViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return photoViewer;
        }
        return photoViewer2;
    }

    public static String y1() {
        File directory = FileLoader.getDirectory(4);
        return new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg").getAbsolutePath();
    }

    public final void A0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A0(boolean):void");
    }

    public final long A1() {
        et0 et0Var = this.f35656b0;
        if (et0Var != null && et0Var.f30680x) {
            return et0Var.getVideoDuration();
        }
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    public final void A2(MessageObject messageObject, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        W2(this.N4, z11);
        if (!this.N4) {
            boolean z17 = true;
            if (this.Y1 != 1) {
                this.Q1.setVisibility(8);
                this.R1.setVisibility(8);
                if (this.f35685e2) {
                    if (this.M1.getParent() != this.L0) {
                        FrameLayout frameLayout = this.V1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.M1);
                        }
                        this.M1.setMeasureAllChildren(false);
                        this.L0.addView(this.M1, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.P1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f35647a0.getContext());
                        this.V1 = frameLayout2;
                        this.M1.setContainer(frameLayout2);
                        xs0 xs0Var = new xs0(this, this.f35647a0.getContext(), this.M1, this.V1, 0);
                        this.P1 = xs0Var;
                        this.M1.setScrollView(xs0Var);
                        this.V1.setClipChildren(false);
                        this.P1.addView(this.V1, new ViewGroup.LayoutParams(-1, -2));
                        this.f35647a0.addView(this.P1, i7.f6.e(-1, -1, 80));
                    }
                    if (this.M1.getParent() != this.V1) {
                        this.L0.removeView(this.M1);
                        this.M1.setMeasureAllChildren(true);
                        this.V1.addView(this.M1, -1, -2);
                        this.f35776o3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.N1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.A);
                            this.N1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.Z(620756991, 369098751, 8, 8));
                            i7.h6.b(this.N1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.A);
                            this.O1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.O1.setTextColor(-1);
                            this.O1.setTypeface(AndroidUtilities.bold());
                            this.N1.addView(this.O1, i7.f6.e(-2, -2, 17));
                            this.N1.setOnClickListener(new sq0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.N1);
                        this.O1.setText(messageObject.sponsoredButtonText);
                        this.V1.addView(this.N1, i7.f6.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.M1.setPadding(0, 0, 0, AndroidUtilities.dp(64.0f));
                        this.N1.bringToFront();
                    } else {
                        FrameLayout frameLayout4 = this.N1;
                        if (frameLayout4 != null) {
                            AndroidUtilities.removeFromParent(frameLayout4);
                            this.M1.setPadding(0, 0, 0, 0);
                        }
                    }
                }
                boolean isEmpty = TextUtils.isEmpty(cloneSpans);
                boolean isEmpty2 = TextUtils.isEmpty(this.M1.getCurrentView().getText());
                nt0 nt0Var = this.M1;
                if (z11) {
                    currentView = nt0Var.getNextView();
                } else {
                    currentView = nt0Var.getCurrentView();
                }
                if (this.f35765n1) {
                    if (currentView.getMaxLines() != 1) {
                        this.M1.getCurrentView().setMaxLines(1);
                        this.M1.getNextView().setMaxLines(1);
                        this.M1.getCurrentView().setSingleLine(true);
                        this.M1.getNextView().setSingleLine(true);
                        TextView currentView2 = this.M1.getCurrentView();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        currentView2.setEllipsize(truncateAt);
                        this.M1.getNextView().setEllipsize(truncateAt);
                    }
                } else {
                    int maxLines = currentView.getMaxLines();
                    if (maxLines == 1) {
                        this.M1.getCurrentView().setSingleLine(false);
                        this.M1.getNextView().setSingleLine(false);
                    }
                    if (this.f35685e2) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            i10 = 5;
                        } else {
                            i10 = 10;
                        }
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    if (maxLines != i10) {
                        this.M1.getCurrentView().setMaxLines(i10);
                        this.M1.getNextView().setMaxLines(i10);
                        this.M1.getCurrentView().setEllipsize(null);
                        this.M1.getNextView().setEllipsize(null);
                    }
                }
                currentView.setScrollX(0);
                boolean z18 = this.f35685e2;
                if (!z18 && z11 && isEmpty) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f35722i2 = z12;
                if (!z18) {
                    this.P1.f40013h0 = false;
                }
                if (z11) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (z18) {
                            viewGroup = this.L0;
                        } else {
                            viewGroup = this.P1;
                        }
                        TransitionManager.endTransitions(viewGroup);
                    }
                    if (this.f35685e2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.L0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new ys0(this, isEmpty2, isEmpty, 1)).addTransition(new ys0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.P1.f40013h0 = true;
                            duration.addTransition(new org.telegram.ui.Components.cm0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.M1);
                        }
                        TransitionManager.beginDelayedTransition(this.P1, duration);
                    }
                    z13 = true;
                } else {
                    this.M1.getCurrentView().setText((CharSequence) null);
                    xs0 xs0Var2 = this.P1;
                    if (xs0Var2 != null) {
                        xs0Var2.scrollTo(0, 0);
                    }
                    z13 = false;
                }
                int i11 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.g6.J(null, true);
                    if (messageObject == null || !this.f35734j5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k31.B())) {
                        if (messageObject != null && !messageObject.messageOwner.entities.isEmpty()) {
                            SpannableString spannableString = new SpannableString(cloneSpans);
                            messageObject.addEntitiesToText(spannableString, true, false);
                            if (messageObject.isVideo()) {
                                MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                            }
                            cloneSpans = Emoji.replaceEmoji(spannableString, currentView.getPaint().getFontMetricsInt(), false);
                        } else {
                            cloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false);
                        }
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (!TextUtils.isEmpty(messageObject.sponsoredTitle)) {
                            spannableStringBuilder.append((CharSequence) messageObject.sponsoredTitle);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new lh.j8(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.M1.setTag(cloneSpans);
                    try {
                        nt0 nt0Var2 = this.M1;
                        if (this.f35748l2 != z10) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        nt0Var2.a(cloneSpans, z11, z16);
                        xs0 xs0Var3 = this.P1;
                        if (xs0Var3 != null) {
                            xs0Var3.H(xs0Var3.getWidth(), xs0Var3.getHeight());
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.F && (!this.f35765n1 || this.L0.getVisibility() == 0 || this.f35700f7 != null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    nt0 nt0Var3 = this.M1;
                    if (z15) {
                        i11 = 0;
                    }
                    nt0Var3.setVisibility(i11);
                } else if (this.f35685e2) {
                    this.M1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z11, false);
                    this.M1.getCurrentView().setTextColor(-1291845633);
                    this.M1.setTag("empty");
                    this.M1.setVisibility(0);
                } else {
                    this.M1.a(null, z11, false);
                    this.M1.getCurrentView().setTextColor(-1);
                    nt0 nt0Var4 = this.M1;
                    if (z13 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    nt0Var4.b(4, z14);
                    this.M1.setTag(null);
                }
                if (this.M1.getCurrentView() instanceof mt0) {
                    ((mt0) this.M1.getCurrentView()).setLoading(z10);
                }
                this.f35748l2 = (isEmpty || !z10) ? false : false;
                return;
            }
        }
        f1().setText(cloneSpans);
        this.M1.setVisibility(8);
    }

    public final void A3() {
        long j10;
        int H;
        MessageObject messageObject;
        xt0 xt0Var = this.d;
        if (xt0Var != null) {
            int H2 = xt0Var.H();
            this.K0.a(H2);
            if (H2 == 0) {
                p3(false, true);
            }
            if (this.O0 != null) {
                xt0 xt0Var2 = this.d;
                long j11 = 0;
                if (xt0Var2 != null) {
                    j10 = xt0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (messageObject = this.P4) != null) {
                    j10 = messageObject.getDialogId();
                }
                org.telegram.ui.Components.hp0 hp0Var = this.O0;
                xt0 xt0Var3 = this.d;
                if (xt0Var3 == null || !xt0Var3.q() || this.d.w()) {
                    j11 = MessagesController.getInstance(this.P).getSendPaidMessagesStars(j10);
                }
                xt0 xt0Var4 = this.d;
                if (xt0Var4 == null) {
                    H = 1;
                } else {
                    H = xt0Var4.H();
                }
                hp0Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void B0(final int i10, final boolean z10) {
        int i11;
        boolean z11;
        kl0 kl0Var;
        final File file;
        final kl0 kl0Var2;
        boolean z12;
        final boolean z13;
        final boolean z14;
        boolean z15;
        boolean z16;
        File file2;
        File pathToAttach;
        File pathToAttach2;
        boolean z17;
        final boolean z18;
        File file3;
        kl0 kl0Var3;
        boolean z19;
        org.telegram.ui.Components.c6 c6Var;
        int i12 = this.L4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.Y4[i10] != null) {
            if (i10 == 0 && i12 == 0 && (c6Var = this.f35695f2) != null) {
                z11 = c6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.P4 != null) {
                if (i11 >= 0 && i11 < this.U6.size()) {
                    ?? r42 = (MessageObject) this.U6.get(i11);
                    z12 = R2(r42);
                    if (this.f35870y5 == 1 && !r42.canPreviewDocument()) {
                        this.S0[i10].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.messageOwner.attachPath)) {
                        file3 = new File(r42.messageOwner.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((MessageObject.getMedia(r42.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(r42.messageOwner).webpage != null && MessageObject.getMedia(r42.messageOwner).webpage.document == null) {
                        kl0Var3 = new kl0(5, this, p1(i11, null));
                    } else {
                        kl0Var3 = new kl0(6, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        kl0 kl0Var4 = kl0Var3;
                        z13 = z19;
                        kl0Var = r42;
                        file = null;
                        file4 = file3;
                        kl0Var2 = kl0Var4;
                        z14 = true;
                    } else {
                        kl0Var = r42;
                        file = null;
                        z14 = false;
                        file4 = file3;
                        kl0Var2 = kl0Var3;
                        z13 = false;
                    }
                } else {
                    this.S0[i10].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.U4 != null) {
                    if (i11 >= 0 && i11 < this.f35671c7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f35671c7.get(i11);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.Y4[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.Y4[i10]);
                            } else {
                                file2 = null;
                            }
                            z17 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                file2 = FileLoader.getInstance(this.P).getPathToAttach(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z14 = z17;
                        file = new File(FileLoader.getDirectory(4), this.Y4[i10]);
                        kl0Var2 = null;
                        z12 = false;
                        z13 = false;
                    } else {
                        this.S0[i10].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.V4 != null) {
                        if (i11 >= 0 && i11 < this.X6.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.X6.get(i11);
                            if (imageLocation != null) {
                                pathToAttach = FileLoader.getInstance(this.P).getPathToAttach(imageLocation.location, q1(imageLocation), false);
                                pathToAttach2 = FileLoader.getInstance(this.P).getPathToAttach(imageLocation.location, q1(imageLocation), true);
                            } else {
                                pathToAttach2 = null;
                                pathToAttach = null;
                            }
                        } else {
                            this.S0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.X4 != null) {
                        if (i11 >= 0 && i11 < this.f35653a7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.f35653a7.get(i11);
                            pathToAttach = FileLoader.getInstance(this.P).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.P).getPathToAttach(secureDocument, false);
                        } else {
                            this.S0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f35651a5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.Y4[i10]);
                        file = new File(FileLoader.getDirectory(4), this.Y4[i10]);
                        kl0Var2 = null;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        tt0 tt0Var = this.f35700f7;
                        if (tt0Var != null) {
                            File b10 = tt0Var.b(i11);
                            if (!this.f35700f7.a(i11) && !this.f35700f7.e(i11)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && SharedConfig.streamMedia && (this.f35700f7.d(i11) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            kl0Var2 = null;
                            z12 = Q2(i11);
                            file4 = b10;
                            kl0Var = null;
                            file = null;
                        } else {
                            kl0Var = null;
                            file = null;
                            kl0Var2 = null;
                            z12 = false;
                            z13 = false;
                            z14 = false;
                        }
                    }
                    kl0Var2 = null;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    kl0Var = kl0Var2;
                }
                file4 = file2;
                kl0Var = kl0Var2;
            }
            if ((i10 != 0 || !this.f35716h5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = kl0Var;
            final boolean z20 = z11;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    tn tnVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.P8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = kl0Var2;
                    File file8 = null;
                    if (file7 == null && fileResolver != null) {
                        file7 = fileResolver.getFile();
                    } else if (fileResolver != null) {
                        file8 = fileResolver.getFile();
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
                    final int i13 = i10;
                    final boolean z23 = z13;
                    if (!z22 && i13 != 0 && (messageObject = r72) != null && z23 && DownloadController.getInstance(photoViewer.P).canDownloadMedia(messageObject.messageOwner) != 0 && (((tnVar = photoViewer.f35715h4) == null || tnVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
                        FileLoader.getInstance(photoViewer.P).loadFile(document, messageObject, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.Y4;
                            vt0[] vt0VarArr = photoViewer2.S0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!FileLoader.getInstance(photoViewer2.P).isLoadingFile(strArr[i14])) {
                                        vt0VarArr[i14].d(2, false, true);
                                    } else {
                                        vt0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    vt0VarArr[i14].d(0, z29, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i14]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                vt0VarArr[i14].f(fileProgress.floatValue(), false);
                            } else {
                                if (i14 != 0 || !photoViewer2.L3) {
                                    if (z28 && (!z25 || (i14 == 0 && photoViewer2.T2))) {
                                        vt0VarArr[i14].d(3, z29, true);
                                    } else {
                                        vt0VarArr[i14].d(-1, z29, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f35738k0.t()) {
                                    if (!z27) {
                                        if (!FileLoader.getInstance(photoViewer2.P).isLoadingFile(strArr[i14])) {
                                            photoViewer2.f35738k0.r(8);
                                        } else {
                                            photoViewer2.f35738k0.K(8);
                                        }
                                    } else {
                                        photoViewer2.f35738k0.r(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f35786p4 || (photoViewer2.f35671c7.isEmpty() && (strArr[0] == null || vt0VarArr[0].h == 0))) {
                                    z30 = false;
                                }
                                photoViewer2.E6 = z30;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f35671c7.isEmpty() && i11 >= 0 && i11 < this.f35671c7.size()) {
            Object obj = this.f35671c7.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.Y1 != 11))) {
                    this.S0[i10].d(3, z10, true);
                    return;
                }
            }
        }
        this.S0[i10].d(-1, z10, true);
    }

    public final boolean B1() {
        if (d1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void B2(int i10) {
        C2(i10, true, false, false);
    }

    public final void B3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3():void");
    }

    public final void C0(int i10) {
        org.telegram.ui.Components.t61 t61Var;
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null && x61Var.d != null && i10 != x61Var.Z) {
            x61Var.Z = i10;
            ArrayList arrayList = x61Var.J;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                t61Var = (org.telegram.ui.Components.t61) x61Var.J.get(i10);
            } else {
                t61Var = null;
            }
            x61Var.S(false, t61Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.x61.K(null, this.P4);
        } else {
            org.telegram.ui.Components.x61 x61Var2 = this.B2;
            if (x61Var2 != null) {
                org.telegram.ui.Components.x61.K(x61Var2.v(i10), this.P4);
            }
        }
        z3();
        this.f35747l0.M(null, null);
        try {
            d1.f.b(0);
            if (ze.b.H().L()) {
                ze.b.H().V(m1());
            }
            org.telegram.ui.Components.x61 x61Var3 = this.B2;
            if (x61Var3 != null) {
                d1.f.x(x61Var3.z());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void C2(int r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(int, boolean, boolean, boolean):void");
    }

    public final void C3() {
        String Y0;
        String Y02;
        int[] iArr = this.f35723i3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f35732j3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            long max = Math.max(0L, x61Var.o());
            long max2 = Math.max(0L, this.B2.q());
            if (!this.f35854w8 && this.M7.getVisibility() == 0) {
                max2 = (this.N7.getRightProgress() - this.N7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.N7.getLeftProgress() * ((float) max2));
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
            et0 et0Var = this.f35656b0;
            if (et0Var != null && et0Var.f30680x) {
                long max3 = Math.max(0, et0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f35656b0.getVideoDuration());
                if (!this.f35854w8 && this.M7.getVisibility() == 0) {
                    max4 = (this.N7.getRightProgress() - this.N7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.N7.getLeftProgress() * ((float) max4));
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
        int i10 = iArr[0];
        if (i10 >= 60) {
            Y0 = Z0(i10 / 60, i10 % 60, iArr[1]);
        } else {
            Y0 = Y0(i10, iArr[1]);
        }
        int i11 = iArr2[0];
        if (i11 >= 60) {
            Y02 = Z0(i11 / 60, i11 % 60, iArr2[1]);
        } else {
            Y02 = Y0(i11, iArr2[1]);
        }
        this.f35741k3.l(Y0 + " / " + Y02, false);
        if (!Objects.equals(this.f35696f3, Y02)) {
            this.f35696f3 = Y02;
            this.f35686e3.requestLayout();
        }
    }

    public final void D0(boolean z10, boolean z11, float f9) {
        if (f9 != this.f35783p1) {
            this.f35783p1 = f9;
            if (this.P4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f35783p1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.P4.getDialogId() + "_" + this.P4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.P4.getDialogId() + "_" + this.P4.getId(), this.f35783p1).commit();
                }
            }
            org.telegram.ui.Components.x61 x61Var = this.B2;
            if (x61Var != null) {
                x61Var.R(this.f35783p1);
            }
            et0 et0Var = this.f35656b0;
            if (et0Var != null) {
                et0Var.setPlaybackSpeed(this.f35783p1);
            }
        }
        J2(true, z10);
        if (z11) {
            this.f35747l0.M(null, null);
        }
    }

    public final void D1() {
        boolean[] zArr = this.f35810s1;
        zArr[1] = false;
        zArr[0] = false;
        this.f35647a0.invalidate();
    }

    public final void D2() {
        if (this.f35733j4 == 0) {
            E2(this.f35869y4, this.L4, null);
            F2(this.L4, this.f35831u4);
            E2(this.f35877z4, this.L4 + 1, this.B1);
            F2(this.L4 + 1, this.f35850w4);
            E2(this.x4, this.L4 - 1, this.A1);
            F2(this.L4 - 1, this.f35840v4);
        }
    }

    public final void D3() {
        int extractRealEncoderBitrate;
        if (this.U7 > 0) {
            if (this.T7 >= this.U7) {
                this.T7 = this.U7 - 1;
            }
            if (this.Y1 == 1) {
                float max = Math.max(800.0f / this.X7, 800.0f / this.Y7);
                this.Z7 = Math.round((this.X7 * max) / 2.0f) * 2;
                this.f35654a8 = Math.round((this.Y7 * max) / 2.0f) * 2;
            } else {
                Size p02 = p0();
                this.Z7 = p02.getWidth();
                this.f35654a8 = p02.getHeight();
            }
            if (this.f35664b8 != 0) {
                if (this.Y1 == 1) {
                    this.f35664b8 = 1560000;
                    extractRealEncoderBitrate = this.f35664b8;
                } else if (this.Z7 == this.X7 && this.f35654a8 == this.Y7) {
                    this.f35664b8 = this.f35672c8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.Z7, this.f35654a8, this.f35664b8, false);
                } else {
                    this.f35664b8 = MediaController.makeVideoBitrate(this.Y7, this.X7, this.f35672c8, this.f35654a8, this.Z7);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.Z7, this.f35654a8, this.f35664b8, false);
                }
                this.f35762m8 = ((extractRealEncoderBitrate / 8) * this.f35681d8) / 1000.0f;
            }
        }
    }

    public final void E0(boolean z10) {
        int i10 = this.L4;
        if (i10 >= 0 && i10 < this.f35671c7.size() && H1()) {
            if (z10) {
                k0();
            }
            f1().p();
        }
    }

    public final void E1() {
        org.telegram.ui.Components.pe0 pe0Var = this.f35866y1;
        if (pe0Var != null) {
            pe0Var.b(null, 0, false, false, null, null, null);
            if (this.Y1 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.f35866y1.f31657b.f49953a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.f35866y1.setVisibility(0);
            this.f35866y1.setAlpha(1.0f);
            wf.n nVar = this.f35866y1.f31657b;
            nVar.q();
            CropAreaView cropAreaView2 = nVar.f49953a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f35784p2 = true;
        }
    }

    public final void E2(ImageReceiver imageReceiver, int i10, wf.f fVar) {
        MessageObject messageObject;
        TLRPC.PhotoSize photoSize;
        ?? r11;
        int i11;
        long j10;
        ImageLocation imageLocation;
        TLRPC.User user;
        ImageLocation imageLocation2;
        String str;
        ImageLocation imageLocation3;
        BitmapDrawable bitmapDrawable;
        ImageLocation imageLocation4;
        String str2;
        ImageLocation imageLocation5;
        ImageLocation imageLocation6;
        BitmapDrawable bitmapDrawable2;
        TLRPC.Photo photo;
        String upperCase;
        boolean z10;
        ImageLocation imageLocation7;
        BitmapDrawable bitmapDrawable3;
        ImageLocation imageLocation8;
        org.telegram.ui.Components.c6 c6Var;
        boolean z11;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.c6 c6Var2;
        boolean z12;
        ImageLocation imageLocation12;
        BitmapDrawable bitmapDrawable7;
        ImageLocation imageLocation13;
        long j11;
        TLRPC.Document document;
        WebFile webFile;
        TLObject tLObject;
        TLRPC.Document document2;
        ImageLocation imageLocation14;
        MediaController.CropState cropState;
        String str3;
        int i12;
        String str4;
        TLRPC.Document document3;
        TLObject tLObject2;
        TLRPC.PhotoSize photoSize2;
        long j12;
        TLRPC.PhotoSize photoSize3;
        ImageLocation imageLocation15;
        TLRPC.Document document4;
        TLRPC.Document document5;
        ?? r10;
        ImageLocation imageLocation16;
        long j13;
        Drawable drawable;
        Activity activity;
        Drawable drawable2;
        Drawable drawable3;
        Activity activity2;
        Drawable drawable4;
        BitmapDrawable bitmapDrawable8;
        MediaController.CropState cropState2;
        boolean z13;
        ImageReceiver imageReceiver2;
        ImageLocation imageLocation17;
        long j14;
        BitmapDrawable bitmapDrawable9;
        ImageLocation imageLocation18;
        ImageLocation imageLocation19;
        BitmapDrawable bitmapDrawable10;
        String str5;
        Integer num = 1;
        boolean z14 = false;
        imageReceiver.setOrientation(0, false);
        ArrayList arrayList = this.f35653a7;
        TLRPC.PhotoSize photoSize4 = null;
        BitmapDrawable bitmapDrawable11 = null;
        if (!arrayList.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                arrayList.get(i10);
                AndroidUtilities.getPhotoSize();
                ImageReceiver.BitmapHolder bitmapHolder = this.f35698f5;
                if (bitmapHolder == null || imageReceiver != this.f35869y4) {
                    bitmapHolder = null;
                }
                if (bitmapHolder == null) {
                    bitmapHolder = this.d.j(i10);
                }
                SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                long j15 = secureDocument.secureFile.size;
                ImageLocation forSecureDocument = ImageLocation.getForSecureDocument(secureDocument);
                if (bitmapHolder != null) {
                    bitmapDrawable11 = new BitmapDrawable(bitmapHolder.bitmap);
                }
                imageReceiver.setImage(forSecureDocument, "d", null, null, bitmapDrawable11, j15, null, null, 0);
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.f35671c7;
        long j16 = 0;
        if (!arrayList2.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f35698f5;
                if (bitmapHolder2 == null || imageReceiver != this.f35869y4) {
                    bitmapHolder2 = null;
                }
                if (bitmapHolder2 == null) {
                    bitmapHolder2 = this.d.j(i10);
                }
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    MediaController.CropState cropState3 = photoEntry.cropState;
                    boolean z15 = photoEntry.isVideo;
                    if (z15 && !photoEntry.isLivePhoto()) {
                        str5 = photoEntry.thumbPath;
                        if (str5 != null) {
                            if (this.f35725i5) {
                                Bitmap decodeFile = BitmapFactory.decodeFile(str5);
                                if (decodeFile != null) {
                                    bitmapHolder2 = new ImageReceiver.BitmapHolder(decodeFile);
                                    photoEntry.thumbPath = null;
                                }
                                document = null;
                                str5 = null;
                            }
                        } else {
                            str5 = "vthumb://" + photoEntry.imageId + ":" + photoEntry.path;
                        }
                        document = null;
                    } else {
                        str5 = photoEntry.filterPath;
                        if (str5 == null) {
                            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, false);
                            str5 = photoEntry.path;
                        }
                        Locale locale = Locale.US;
                        document = com.google.android.recaptcha.internal.a.k(photoSize5, "_", photoSize5);
                    }
                    cropState = cropState3;
                    z14 = z15;
                    str3 = str5;
                    document2 = null;
                    imageLocation14 = null;
                    i12 = 0;
                    j11 = 0;
                    webFile = null;
                    tLObject = null;
                } else {
                    String str6 = "d";
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.type.equals("gif") && (r10 = botInlineResult.document) != null) {
                                long j17 = r10.size;
                                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(r10);
                                if (documentVideoThumb != null) {
                                    imageLocation16 = ImageLocation.getForDocument(documentVideoThumb, (TLRPC.Document) r10);
                                } else {
                                    imageLocation16 = null;
                                }
                                j12 = j17;
                                document5 = r10;
                                webFile = null;
                                tLObject = null;
                                imageLocation15 = imageLocation16;
                                document = "d";
                                photoSize3 = null;
                            } else {
                                TLRPC.Photo photo2 = botInlineResult.photo;
                                if (photo2 != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.getPhotoSize());
                                    TLObject tLObject3 = botInlineResult.photo;
                                    long j18 = closestPhotoSizeWithSize.size;
                                    Locale locale2 = Locale.US;
                                    tLObject = tLObject3;
                                    document = com.google.android.recaptcha.internal.a.k(photoSize5, "_", photoSize5);
                                    j12 = j18;
                                    imageLocation15 = null;
                                    document5 = null;
                                    photoSize3 = closestPhotoSizeWithSize;
                                    webFile = null;
                                } else {
                                    if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                        if (botInlineResult.type.equals("gif")) {
                                            TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                            if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                                                imageLocation15 = ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb));
                                                j12 = 0;
                                                tLObject = null;
                                                document5 = null;
                                                webFile = WebFile.createWithWebDocument(botInlineResult.content);
                                                document = str6;
                                                photoSize3 = null;
                                            }
                                        } else {
                                            Locale locale3 = Locale.US;
                                            str6 = com.google.android.recaptcha.internal.a.k(photoSize5, "_", photoSize5);
                                        }
                                        imageLocation15 = null;
                                        j12 = 0;
                                        tLObject = null;
                                        document5 = null;
                                        webFile = WebFile.createWithWebDocument(botInlineResult.content);
                                        document = str6;
                                        photoSize3 = null;
                                    }
                                    j12 = 0;
                                    document = null;
                                    webFile = null;
                                    tLObject = null;
                                    photoSize3 = null;
                                    imageLocation15 = null;
                                    document5 = null;
                                }
                            }
                            document2 = document5;
                            cropState = null;
                            i12 = 1;
                            photoSize4 = photoSize3;
                            imageLocation14 = imageLocation15;
                            j11 = j12;
                            str3 = null;
                        } else {
                            TLRPC.Document document6 = botInlineResult.document;
                            if (document6 != null) {
                                photoSize3 = FileLoader.getClosestPhotoSizeWithSize(document6.thumbs, 90);
                                j12 = 0;
                                webFile = null;
                                imageLocation15 = null;
                                document4 = null;
                                tLObject = botInlineResult.document;
                            } else {
                                TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                                if (webDocument2 instanceof TLRPC.TL_webDocument) {
                                    j12 = 0;
                                    tLObject = null;
                                    photoSize3 = null;
                                    imageLocation15 = null;
                                    document4 = null;
                                    webFile = WebFile.createWithWebDocument(webDocument2);
                                }
                                j12 = 0;
                                document = null;
                                webFile = null;
                                tLObject = null;
                                photoSize3 = null;
                                imageLocation15 = null;
                                document5 = null;
                                document2 = document5;
                                cropState = null;
                                i12 = 1;
                                photoSize4 = photoSize3;
                                imageLocation14 = imageLocation15;
                                j11 = j12;
                                str3 = null;
                            }
                            document = document4;
                            document5 = document4;
                            document2 = document5;
                            cropState = null;
                            i12 = 1;
                            photoSize4 = photoSize3;
                            imageLocation14 = imageLocation15;
                            j11 = j12;
                            str3 = null;
                        }
                    } else if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        TLRPC.PhotoSize photoSize6 = searchImage.photoSize;
                        if (photoSize6 != null) {
                            photoSize2 = photoSize6;
                            tLObject2 = searchImage.photo;
                            j16 = photoSize6.size;
                            document3 = null;
                        } else {
                            String str7 = searchImage.filterPath;
                            if (str7 != null) {
                                str4 = str7;
                            } else {
                                TLRPC.Document document7 = searchImage.document;
                                if (document7 != null) {
                                    document3 = document7;
                                    j16 = document7.size;
                                    tLObject2 = null;
                                    photoSize2 = null;
                                } else {
                                    str4 = searchImage.imageUrl;
                                    j16 = searchImage.size;
                                }
                            }
                            tLObject2 = null;
                            photoSize2 = null;
                            document3 = null;
                            document2 = document3;
                            str3 = str4;
                            i12 = 1;
                            cropState = searchImage.cropState;
                            document = "d";
                            photoSize4 = photoSize2;
                            imageLocation14 = null;
                            tLObject = tLObject2;
                            j11 = j16;
                            webFile = null;
                        }
                        str4 = null;
                        document2 = document3;
                        str3 = str4;
                        i12 = 1;
                        cropState = searchImage.cropState;
                        document = "d";
                        photoSize4 = photoSize2;
                        imageLocation14 = null;
                        tLObject = tLObject2;
                        j11 = j16;
                        webFile = null;
                    } else {
                        j11 = 0;
                        document = null;
                        webFile = null;
                        tLObject = null;
                        document2 = null;
                        imageLocation14 = null;
                        photoSize4 = null;
                        cropState = null;
                        str3 = null;
                        i12 = 0;
                    }
                }
                if (document2 != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90);
                    if (imageLocation14 != null) {
                        ImageLocation forDocument = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation19 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                            imageLocation18 = forDocument;
                        } else {
                            imageLocation18 = forDocument;
                            imageLocation19 = null;
                        }
                        Locale locale4 = Locale.US;
                        String k9 = com.google.android.recaptcha.internal.a.k(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, k9, bitmapDrawable10, j11, null, obj, i12);
                    } else {
                        long j19 = j11;
                        int i13 = i12;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation17 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                        } else {
                            imageLocation17 = null;
                        }
                        Locale locale5 = Locale.US;
                        String k10 = com.google.android.recaptcha.internal.a.k(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            j14 = j19;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j14 = j19;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, k10, bitmapDrawable9, j14, null, obj, i13);
                    }
                } else {
                    WebFile webFile2 = webFile;
                    long j20 = j11;
                    ImageLocation imageLocation20 = imageLocation14;
                    int i14 = i12;
                    if (photoSize4 != null) {
                        ImageLocation forObject = ImageLocation.getForObject(photoSize4, tLObject);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable8 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable8 = null;
                        }
                        imageReceiver.setImage(forObject, document, bitmapDrawable8, j20, (String) null, obj, i14);
                    } else {
                        String str8 = document;
                        if (webFile2 != null) {
                            if (imageLocation20 != null) {
                                imageReceiver.setImage(ImageLocation.getForWebFile(webFile2), str8, imageLocation20, (String) null, (Drawable) null, obj, i14);
                            } else {
                                ImageLocation forWebFile = ImageLocation.getForWebFile(webFile2);
                                if (bitmapHolder2 != null) {
                                    drawable4 = new BitmapDrawable(bitmapHolder2.bitmap);
                                } else if (z14 && (activity2 = this.f35864y) != null) {
                                    drawable4 = activity2.getResources().getDrawable(R.drawable.nophotos);
                                } else {
                                    drawable3 = null;
                                    imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i14);
                                }
                                drawable3 = drawable4;
                                imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i14);
                            }
                        } else {
                            if (bitmapHolder2 != null) {
                                drawable2 = new BitmapDrawable(bitmapHolder2.bitmap);
                            } else if (z14 && (activity = this.f35864y) != null) {
                                drawable2 = activity.getResources().getDrawable(R.drawable.nophotos);
                            } else {
                                j13 = j20;
                                drawable = null;
                                imageReceiver.setImage(str3, str8, drawable, null, j13);
                            }
                            j13 = j20;
                            drawable = drawable2;
                            imageReceiver.setImage(str3, str8, drawable, null, j13);
                        }
                    }
                }
                if (fVar != null) {
                    if (cropState != null) {
                        MediaController.CropState cropState4 = cropState;
                        z13 = z14;
                        cropState2 = cropState4;
                        imageReceiver2 = imageReceiver;
                        fVar.e(true, cropState.cropPx, cropState.cropPy, cropState.cropRotate, cropState.transformRotation, cropState.cropScale, 1.0f, 1.0f, cropState.cropPw, cropState.cropPh, 0.0f, 0.0f, cropState4.mirrored);
                    } else {
                        cropState2 = cropState;
                        z13 = z14;
                        imageReceiver2 = imageReceiver;
                        fVar.f49911a = false;
                    }
                } else {
                    cropState2 = cropState;
                    z13 = z14;
                    imageReceiver2 = imageReceiver;
                }
                if (imageReceiver2 == this.x4) {
                    this.C1 = cropState2;
                    this.D4 = z13;
                    return;
                }
                boolean z16 = z13;
                MediaController.CropState cropState5 = cropState2;
                if (imageReceiver2 == this.f35877z4) {
                    this.D1 = cropState5;
                    this.G4 = z16;
                    return;
                }
                return;
            }
            imageReceiver.setImageBitmap((Bitmap) null);
            return;
        }
        tt0 tt0Var = this.f35700f7;
        if (tt0Var != null) {
            int[] iArr = new int[1];
            TLObject d = tt0Var.d(i10);
            TLRPC.PhotoSize f9 = this.f35700f7.f(d, iArr);
            if (f9 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f35698f5 == null || imageReceiver != this.f35869y4) ? null : null;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 1) == 0 && this.L4 != i10 && !FileLoader.getInstance(this.P).getPathToAttach(f9, true).exists()) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (bitmapHolder3 == null) {
                        imageLocation12 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 80), photo3);
                    } else {
                        imageLocation12 = null;
                    }
                    if (bitmapHolder3 != null) {
                        bitmapDrawable7 = new BitmapDrawable(bitmapHolder3.bitmap);
                    } else {
                        bitmapDrawable7 = null;
                    }
                    if (z12) {
                        imageLocation13 = ImageLocation.getForPhoto(f9, photo3);
                    } else {
                        imageLocation13 = null;
                    }
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f35700f7.g(), 1);
                    if (z12) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f35700f7.a(i10) && !this.f35700f7.e(i10)) {
                    if (imageReceiver == this.f35869y4 && (c6Var2 = this.f35695f2) != null) {
                        imageReceiver.setImageBitmap(c6Var2);
                        this.f35695f2.f(this.f35647a0);
                        return;
                    }
                    return;
                } else if (!(f9.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f35698f5 == null || imageReceiver != this.f35869y4) ? null : null;
                    if (bitmapHolder4 == null) {
                        imageLocation11 = ImageLocation.getForDocument(f9, (TLRPC.Document) d);
                    } else {
                        imageLocation11 = null;
                    }
                    if (bitmapHolder4 != null) {
                        bitmapDrawable6 = new BitmapDrawable(bitmapHolder4.bitmap);
                    } else {
                        bitmapDrawable6 = null;
                    }
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f35700f7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f35864y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f35864y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            }
        }
        ArrayList arrayList3 = this.U6;
        if (!arrayList3.isEmpty() && i10 >= 0 && i10 < arrayList3.size()) {
            imageReceiver.setShouldGenerateQualityThumb(true);
            messageObject = (MessageObject) arrayList3.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            if (!TextUtils.isEmpty(MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                imageReceiver.setImageBitmap(this.f35864y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f35698f5 == null || imageReceiver != this.f35869y4) ? null : null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    if (messageObject.isLivePhoto()) {
                        imageReceiver.setNeedsQualityThumb(true);
                        ImageLocation s12 = s1(i10, null);
                        if (bitmapHolder5 == null) {
                            imageLocation10 = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                        } else {
                            imageLocation10 = null;
                        }
                        if (bitmapHolder5 != null) {
                            bitmapDrawable5 = new BitmapDrawable(bitmapHolder5.bitmap);
                        } else {
                            bitmapDrawable5 = null;
                        }
                        imageReceiver.setImage(s12, null, imageLocation10, "b", bitmapDrawable5, 0L, null, messageObject, 1);
                    } else {
                        if (closestPhotoSizeWithSize3.f22417w < 100 && closestPhotoSizeWithSize3.h < 100) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        imageReceiver.setNeedsQualityThumb(z11);
                        if (bitmapHolder5 == null) {
                            imageLocation9 = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                        } else {
                            imageLocation9 = null;
                        }
                        if (bitmapHolder5 != null) {
                            bitmapDrawable4 = new BitmapDrawable(bitmapHolder5.bitmap);
                        } else {
                            bitmapDrawable4 = null;
                        }
                        imageReceiver.setImage(null, null, imageLocation9, "b", bitmapDrawable4, 0L, null, messageObject, 1);
                    }
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f35698f5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f35864y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.f35869y4 && (c6Var = this.f35695f2) != null) {
                c6Var.f(this.f35647a0);
                imageReceiver.setImageBitmap(this.f35695f2);
                return;
            } else if (this.f35870y5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f35698f5 == null || imageReceiver != this.f35869y4) ? null : null;
                    int i15 = (int) (2048.0f / AndroidUtilities.density);
                    if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 8) == 0 && this.L4 != i10 && !FileLoader.getInstance(this.P).getPathToAttach(document8).exists()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (bitmapHolder7 == null) {
                        imageLocation7 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100), document8);
                    } else {
                        imageLocation7 = null;
                    }
                    if (bitmapHolder7 != null) {
                        bitmapDrawable3 = new BitmapDrawable(bitmapHolder7.bitmap);
                    } else {
                        bitmapDrawable3 = null;
                    }
                    if (z10) {
                        imageLocation8 = ImageLocation.getForDocument(document8);
                    } else {
                        imageLocation8 = null;
                    }
                    Locale locale6 = Locale.US;
                    imageReceiver.setImage(imageLocation8, com.google.android.recaptcha.internal.a.k(i15, "_", i15), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z10) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f35864y;
                rt0 rt0Var = this.f35647a0;
                ?? drawable5 = new Drawable();
                drawable5.f32613a = 0L;
                drawable5.f32614b = 0.0f;
                drawable5.f32615c = 0.0f;
                drawable5.d = 0L;
                drawable5.f32616e = 0.0f;
                drawable5.f32617f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.sc0.F;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.sc0.G;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.sc0.H.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.sc0.I.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.sc0.J.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.sc0.K.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.sc0.E.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f32618n = rt0Var;
                drawable5.f32619r = messageObject;
                drawable5.f32620s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
                TLRPC.Document document9 = messageObject.getDocument();
                if (document9 != null) {
                    String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
                    drawable5.A = documentFileName;
                    if (TextUtils.isEmpty(documentFileName)) {
                        drawable5.A = "name";
                    }
                    int lastIndexOf = drawable5.A.lastIndexOf(46);
                    if (lastIndexOf == -1) {
                        upperCase = "";
                    } else {
                        upperCase = drawable5.A.substring(lastIndexOf + 1).toUpperCase();
                    }
                    drawable5.f32623y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f32623y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f32622x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.A, messageObject.getDocument().mime_type, true)).mutate();
                    drawable5.B = AndroidUtilities.formatFileSize(document9.size);
                    if (((int) Math.ceil(textPaint2.measureText(drawable5.A))) > AndroidUtilities.dp(320.0f)) {
                        drawable5.A = TextUtils.ellipsize(drawable5.A, textPaint2, AndroidUtilities.dp(320.0f), TextUtils.TruncateAt.END).toString();
                    }
                }
                drawable5.a();
                imageReceiver.setImageBitmap((Drawable) drawable5);
                return;
            }
        }
        long[] jArr = new long[1];
        ImageLocation s13 = s1(i10, jArr);
        TLObject p12 = p1(i10, jArr);
        imageReceiver.setNeedsQualityThumb(true);
        if (s13 != null) {
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f35698f5 == null || imageReceiver != this.f35869y4) ? null : null;
            if (jArr[0] == 0) {
                jArr[0] = -1;
            }
            if (messageObject != null) {
                photoSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                r11 = messageObject.photoThumbsObject;
            } else {
                photoSize = null;
                r11 = null;
            }
            if (photoSize != null && photoSize == p12) {
                photoSize = null;
            }
            if (photoSize == null && (photo = s13.photo) != null && photo.sizes != null) {
                int i16 = 0;
                while (true) {
                    if (i16 >= s13.photo.sizes.size()) {
                        break;
                    } else if (s13.photo.sizes.get(i16) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = s13.photo.sizes.get(i16);
                        r11 = s13.photo;
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            if ((messageObject == null || !messageObject.isWebpage()) && this.f35841v5 == 0 && !this.f35860x5) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (messageObject != null) {
                if (this.f35870y5 == 5) {
                    TLRPC.Document document10 = messageObject.getDocument();
                    j10 = 0;
                    TLRPC.VideoSize documentVideoThumb2 = MessageObject.getDocumentVideoThumb(document10);
                    if (documentVideoThumb2 != null) {
                        imageLocation = ImageLocation.getForDocument(documentVideoThumb2, document10);
                    }
                } else {
                    j10 = 0;
                }
                imageLocation = null;
            } else {
                j10 = 0;
                int i17 = (this.f35841v5 > 0L ? 1 : (this.f35841v5 == 0L ? 0 : -1));
                if (i17 != 0) {
                    if (i17 > 0) {
                        user = MessagesController.getInstance(this.P).getUser(Long.valueOf(this.f35841v5));
                    } else {
                        user = MessagesController.getInstance(this.P).getChat(Long.valueOf(-this.f35841v5));
                    }
                    if (r11 != null) {
                        user = r11;
                    }
                    if (bitmapHolder8 == null && (photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        bitmapHolder8 = new ImageReceiver.BitmapHolder(ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                    }
                    messageObject = user;
                    imageLocation = null;
                } else {
                    imageLocation = null;
                    messageObject = null;
                }
            }
            String str9 = "g";
            if (imageLocation != null) {
                if (this.f35870y5 == 5) {
                    str2 = "g";
                } else {
                    str2 = null;
                }
                if (bitmapHolder8 == null) {
                    ImageLocation forObject2 = ImageLocation.getForObject(photoSize, r11);
                    imageLocation5 = imageLocation;
                    imageLocation6 = forObject2;
                } else {
                    imageLocation5 = imageLocation;
                    imageLocation6 = null;
                }
                if (bitmapHolder8 != null) {
                    bitmapDrawable2 = new BitmapDrawable(bitmapHolder8.bitmap);
                } else {
                    bitmapDrawable2 = null;
                }
                imageReceiver.setImage(s13, str2, imageLocation5, null, imageLocation6, "b", bitmapDrawable2, jArr[0], null, messageObject, i11);
                imageReceiver.setAllowStartAnimation(true);
                return;
            }
            if (this.f35841v5 != j10) {
                if (s13.imageType != 2) {
                    str9 = null;
                }
                imageLocation2 = s13;
                str = str9;
            } else {
                imageLocation2 = s13;
                str = null;
            }
            boolean z17 = true;
            if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 1) == 0 && this.L4 != i10 && !FileLoader.getInstance(this.P).getPathToAttach(p12).exists()) {
                z17 = false;
            }
            if (bitmapHolder8 == null) {
                imageLocation3 = ImageLocation.getForObject(photoSize, r11);
            } else {
                imageLocation3 = null;
            }
            if (bitmapHolder8 != null) {
                bitmapDrawable = new BitmapDrawable(bitmapHolder8.bitmap);
            } else {
                bitmapDrawable = null;
            }
            if (z17) {
                imageLocation4 = imageLocation2;
            } else {
                imageLocation4 = null;
            }
            imageReceiver.setImage(imageLocation4, str, imageLocation3, "b", bitmapDrawable, jArr[0], null, messageObject, i11);
            if (z17) {
                num = null;
            }
            imageReceiver.setMark(num);
        } else if (jArr[0] == 0) {
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            imageReceiver.setImageBitmap(this.f35864y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean E3() {
        org.telegram.ui.Components.q40 q40Var = this.f35740k2;
        if (q40Var != null && q40Var.d && !q40Var.f31855e) {
            return true;
        }
        return false;
    }

    public final void F0() {
        ws0 ws0Var = this.H1;
        Activity activity = this.f35864y;
        gq0 gq0Var = new gq0(this, 1);
        if (ws0Var.H1) {
            ws0Var.w0(false);
        } else if (ws0Var.f2228c2) {
            ws0Var.l0(true);
        } else if (ws0Var.P0 && ws0Var.O0 != null) {
            ws0Var.r0(null, true);
        } else if (ws0Var.B0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, ws0Var.M1);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new a1.c(gq0Var, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            S2(alertDialog$Builder);
        } else {
            gq0Var.run();
        }
    }

    public final void F1() {
        bg.u3 u3Var = this.f35751l5;
        if (u3Var == null || !u3Var.R) {
            zd.b bVar = this.V;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((ng.e) it.next()).M = true;
                }
            }
            zd.b bVar2 = this.W;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            xr0 xr0Var = this.Q1;
            if (xr0Var != null) {
                xr0Var.m();
            }
            yr0 yr0Var = this.R1;
            if (yr0Var != null) {
                yr0Var.m();
            }
            jt0 jt0Var = this.f35787p5;
            if (jt0Var != null) {
                jt0Var.invalidate();
            }
            jt0 jt0Var2 = this.f35805r5;
            if (jt0Var2 != null) {
                jt0Var2.invalidate();
            }
            jt0 jt0Var3 = this.f35814s5;
            if (jt0Var3 != null) {
                jt0Var3.invalidate();
            }
            jt0 jt0Var4 = this.f35823t5;
            if (jt0Var4 != null) {
                jt0Var4.invalidate();
            }
            jt0 jt0Var5 = this.f35832u5;
            if (jt0Var5 != null) {
                jt0Var5.invalidate();
            }
            ur0 ur0Var = this.N7;
            if (ur0Var != null && ur0Var.f29098a0) {
                ur0Var.invalidate();
            }
            rt0 rt0Var = this.f35647a0;
            if (rt0Var != null) {
                rt0Var.invalidate();
            }
        }
    }

    public final void F2(int i10, org.telegram.ui.Components.bd0 bd0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (bd0Var != null) {
            bd0Var.a();
            bd0Var.setVisibility(8);
            ArrayList arrayList2 = this.f35671c7;
            if (!arrayList2.isEmpty() && i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    z10 = photoEntry.isVideo;
                    str = photoEntry.paintPath;
                    arrayList = photoEntry.mediaEntities;
                } else {
                    if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        str = searchImage.paintPath;
                        arrayList = searchImage.mediaEntities;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                bd0Var.setVisibility(0);
                if (this.Y1 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bd0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    bd0Var.f27054a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bd0Var.f27054a);
                    bd0Var.d = bitmapDrawable;
                    bd0Var.setBackground(bitmapDrawable);
                    return;
                }
                bd0Var.f27054a = null;
                bd0Var.d = null;
                bd0Var.setBackground(null);
            }
        }
    }

    public final void G0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(boolean, boolean):void");
    }

    public final boolean G1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.A.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public final void G2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G2(int, boolean, boolean, boolean):void");
    }

    public final void H0() {
        if (this.f35866y1 != null) {
            return;
        }
        org.telegram.ui.Components.pe0 pe0Var = new org.telegram.ui.Components.pe0(this.A, this.f35802r2);
        this.f35866y1 = pe0Var;
        pe0Var.setVisibility(8);
        this.f35866y1.a();
        this.f35647a0.addView(this.f35866y1, this.f35647a0.indexOfChild(this.M7) - 1, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f35866y1.setDelegate(new pr0(this));
    }

    public final boolean H1() {
        org.telegram.ui.Components.ed f12 = f1();
        if (f12 != null) {
            if (f12.H.c() || f12.f18076f.f26885e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H2(View view, boolean z10, float f9, boolean z11) {
        float f10;
        HashMap hashMap = this.G0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        hashMap.put(view, Boolean.valueOf(z10));
        view.animate().cancel();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10 * f9;
        int i10 = 0;
        if (z11 && bool != null) {
            if (z10) {
                view.setVisibility(0);
            }
            view.animate().alpha(f11).setDuration(100L).setUpdateListener(new fq0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new mp0(this, z10, view, 1)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        view.setAlpha(f11);
        s3();
    }

    public final boolean I1() {
        int i10;
        if (this.f35680d7 != null && (i10 = this.L4) >= 0) {
            ArrayList arrayList = this.f35663b7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.L4);
                ImageLocation imageLocation = (ImageLocation) this.W6.get(this.L4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f35680d7.location;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f35680d7.location;
                    if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void I2(View view, boolean z10, boolean z11) {
        H2(view, z10, 1.0f, z11);
    }

    public final void J0() {
        MediaController.CropState cropState;
        int width;
        int width2;
        if (this.J1 != null) {
            return;
        }
        if (this.Y1 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.f35874z1.f49917i;
        } else {
            cropState = this.T4.f41222c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.f35869y4.getBitmapWidth();
        int bitmapHeight = this.f35869y4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        bg.u3 u3Var = this.f35751l5;
        if (u3Var != null && u3Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f35751l5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f35751l5.F);
            float width3 = createBitmap.getWidth();
            if ((this.f35751l5.F / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f9 = width3 / width2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f9, ((-sourceBitmap.getHeight()) / 2.0f) * f9, (sourceBitmap.getWidth() / 2.0f) * f9, (sourceBitmap.getHeight() / 2.0f) * f9);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.f35869y4.getBitmapWidth(), this.f35869y4.getBitmapHeight(), config);
        if (this.f35869y4.getBitmap() != null) {
            Bitmap bitmap = this.f35869y4.getBitmap();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.f35869y4.getOrientation());
            float width4 = createBitmap2.getWidth();
            if ((this.f35869y4.getOrientation() / 90) % 2 != 0) {
                width = bitmap.getHeight();
            } else {
                width = bitmap.getWidth();
            }
            float f10 = width4 / width;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * f10, ((-bitmap.getHeight()) / 2.0f) * f10, (bitmap.getWidth() / 2.0f) * f10, (bitmap.getHeight() / 2.0f) * f10);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        vs0 vs0Var = new vs0(this, this.f35864y, this.P, createBitmap2, createBitmap, this.f35869y4.getOrientation(), cropState2);
        this.J1 = vs0Var;
        vs0Var.f2506s.setOnClickListener(new hq0(this, 5));
        this.J1.v.setOnClickListener(new hq0(this, 6));
        this.J1.setEraser(this.I1);
        int indexOfChild = this.f35647a0.indexOfChild(this.f35796q5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f35647a0.getChildCount();
        }
        this.f35647a0.addView(this.J1, indexOfChild, i7.f6.c(-1.0f, -1));
        this.K1 = false;
    }

    public final void J2(boolean z10, boolean z11) {
        if (this.f35764n0.getVisibility() != 0) {
            this.f35809s0.f40887f.q("", z10, true);
        } else if (Math.abs(this.f35783p1 - 1.0f) < 0.001f) {
            this.f35809s0.f40887f.q("", z10, true);
        } else {
            org.telegram.ui.Components.n6 n6Var = this.f35809s0.f40887f;
            n6Var.q(cf.f.a(this.f35783p1) + "x", z10, true);
        }
        this.f35764n0.d(this.f35783p1, z10);
        d81 d81Var = this.E0;
        float f9 = this.f35783p1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = d81Var.f37409a;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z11 && ((i10 == 0 && Math.abs(f9 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f9 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f9 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f9 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f9 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].c(-9718023, -9718023);
            } else {
                g1VarArr[i10].c(-328966, -328966);
            }
        }
    }

    public final void K0() {
        int bitmapWidth;
        int bitmapHeight;
        MediaController.CropState cropState;
        Bitmap bitmap;
        if (this.H1 == null) {
            TextureView textureView = this.f35858x2;
            if (textureView != null) {
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) textureView;
                bitmapWidth = l61Var.getVideoWidth();
                bitmapHeight = l61Var.getVideoHeight();
                while (true) {
                    if (bitmapWidth <= 1280 && bitmapHeight <= 1280) {
                        break;
                    }
                    bitmapWidth /= 2;
                    bitmapHeight /= 2;
                }
            } else {
                bitmapWidth = this.f35869y4.getBitmapWidth();
                bitmapHeight = this.f35869y4.getBitmapHeight();
            }
            Bitmap bitmap2 = this.f35831u4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i10 = this.Y1;
            ot0 ot0Var = this.T4;
            boolean z10 = true;
            if (i10 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.f35874z1.f49917i;
            } else {
                cropState = ot0Var.f41222c;
            }
            MediaController.CropState cropState2 = cropState;
            nh.w3 w3Var = new nh.w3(this.f35666c0, false, new mq0(this, 2));
            w3Var.f18781f = true;
            w3Var.f18782g = true;
            this.G1 = w3Var;
            if (this.f35795q4 == 3) {
                z10 = false;
            }
            w3Var.b(z10);
            Activity activity = this.f35864y;
            int i11 = this.P;
            if (this.f35765n1) {
                bitmap = null;
            } else {
                bitmap = this.f35869y4.getBitmap();
            }
            ws0 ws0Var = new ws0(this, activity, activity, i11, bitmap3, bitmap, this.f35869y4.getOrientation(), ot0Var.f41223e, cropState2, new gq0(this, 14), this.f35802r2);
            this.H1 = ws0Var;
            ng.d c3 = this.U.c(ws0Var.Y0, null, false);
            c3.n(pg.a.i(this.f35802r2));
            ws0Var.setBlurredBackgroundDrawableForTools(c3);
            this.f35647a0.addView(this.H1.getView(), i7.f6.c(-1.0f, -1));
            this.H1.setOnDoneButtonClickedListener(new gq0(this, 15));
            this.H1.getCancelView().setOnClickListener(new hq0(this, 8));
            this.H1.t0(AndroidUtilities.dp(126.0f));
            this.H1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final void K2(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        jf.s0 s0Var;
        Activity parentActivity;
        boolean z10;
        int i10;
        rt0 rt0Var;
        boolean z11;
        float f9;
        float f10;
        jf.s0 s0Var2 = this.f35727i7;
        if (s0Var2 != null) {
            s0Var2.destroy();
            this.f35727i7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            s0Var = new jf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.f35727i7 = s0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = o2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.g6.J(parentActivity, false);
        this.f35802r2 = c6Var;
        this.f35724i4 = o2Var;
        int i11 = UserConfig.selectedAccount;
        this.P = i11;
        this.f35869y4.setCurrentAccount(i11);
        this.x4.setCurrentAccount(this.P);
        this.f35877z4.setCurrentAccount(this.P);
        xr0 xr0Var = this.Q1;
        if (xr0Var != null) {
            xr0Var.setAccount(this.P);
        }
        bg.u3 u3Var = this.f35751l5;
        if (u3Var != null) {
            u3Var.setCurrentAccount(this.P);
        }
        if (this.f35864y != parentActivity && parentActivity != null) {
            this.f35808s = parentActivity instanceof BubbleActivity;
            this.f35864y = parentActivity;
            this.A = new ContextThemeWrapper(this.f35864y, R.style.Theme_TMessages);
            this.f35828u1 = ViewConfiguration.get(this.f35864y).getScaledTouchSlop();
            if (P8 == null) {
                P8 = new Drawable[]{f0.e.d(this.f35864y, R.drawable.circle_big), f0.e.d(this.f35864y, R.drawable.cancel_big), f0.e.d(this.f35864y, R.drawable.load_big)};
            }
            this.R6 = new Scroller(parentActivity);
            yt0 yt0Var = new yt0(this, parentActivity);
            this.f35666c0 = yt0Var;
            yt0Var.setBackground(this.H0);
            this.f35666c0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f35673d0 = clippingImageView;
            clippingImageView.J = this.f35706g4;
            clippingImageView.G = false;
            clippingImageView.I = false;
            this.f35666c0.addView(clippingImageView, i7.f6.c(40.0f, 40));
            rt0 rt0Var2 = new rt0(this, parentActivity, parentActivity);
            this.f35647a0 = rt0Var2;
            rt0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.X3;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f35647a0);
            }
            this.f35647a0.setClipChildren(true);
            this.f35647a0.setClipToPadding(true);
            this.f35666c0.setClipChildren(false);
            this.f35666c0.setClipToPadding(false);
            org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(this.f35647a0);
            this.X = gaVar;
            gaVar.f28848a = 1;
            this.T = new oc.i(this);
            this.W = new zd.b();
            this.V = new zd.b();
            lg.a aVar = new lg.a(this.T);
            this.U = aVar;
            aVar.f(new sg.i(this.f35647a0), this.f35647a0);
            this.U.e(this.W);
            this.Y = new org.telegram.ui.Components.ka(this.X, this.f35647a0);
            this.f35666c0.addView(this.f35647a0, i7.f6.e(-1, -1, 51));
            r0.j0.m(this.f35647a0, new oq0(this));
            this.f35647a0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.Z = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.Z.flags = -2147286784;
            org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(this.f35864y);
            this.f35831u4 = bd0Var;
            this.f35647a0.addView(bd0Var, i7.f6.c(-2.0f, -2));
            org.telegram.ui.Components.bd0 bd0Var2 = new org.telegram.ui.Components.bd0(this.f35864y);
            this.f35840v4 = bd0Var2;
            this.f35647a0.addView(bd0Var2, i7.f6.c(-2.0f, -2));
            org.telegram.ui.Components.bd0 bd0Var3 = new org.telegram.ui.Components.bd0(this.f35864y);
            this.f35850w4 = bd0Var3;
            this.f35647a0.addView(bd0Var3, i7.f6.c(-2.0f, -2));
            cg.m1 m1Var = new cg.m1(this, parentActivity, 5);
            this.B = m1Var;
            m1Var.setOverlayTitleAnimation(true);
            this.B.setTitleColor(-1);
            this.B.setSubtitleColor(-1);
            this.B.setBackgroundColor(2130706432);
            this.B.setOccupyStatusBar(!this.f35808s);
            this.B.B(1090519039, false);
            this.B.C(-1, false);
            this.B.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.B.getBackButton();
            this.C = backButton;
            this.D = backButton.getBackground();
            this.E = null;
            wt0 wt0Var = new wt0(parentActivity);
            this.I = wt0Var;
            this.B.addView(wt0Var, i7.f6.e(-1, -1, 119));
            this.f35647a0.addView(this.B, i7.f6.c(-2.0f, -1));
            ut0 ut0Var = new ut0(parentActivity);
            this.J = ut0Var;
            this.f35647a0.addView(ut0Var, i7.f6.e(-1, -2, 55));
            this.B.setActionBarMenuOnItemClick(new or0(this, c6Var));
            org.telegram.ui.ActionBar.a0 n10 = this.B.n();
            this.f35846w0 = n10;
            n10.setOnLayoutListener(new gq0(this, 18));
            org.telegram.ui.ActionBar.w0 a2 = this.f35846w0.a(26, R.drawable.menu_delete_old);
            this.A0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            i7.h6.a(this.A0);
            I2(this.A0, false, false);
            org.telegram.ui.ActionBar.w0 a10 = this.f35846w0.a(11, R.drawable.msg_mask);
            this.f35873z0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.w0 a11 = this.f35846w0.a(18, R.drawable.msg_header_draw);
            this.f35865y0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.w0 a12 = this.f35846w0.a(4, R.drawable.msg_header_share);
            this.f35856x0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.a0 a0Var = this.f35846w0;
            nr nrVar = new nr(this.A, R.drawable.video_settings, new lh.b());
            this.f35809s0 = nrVar;
            org.telegram.ui.ActionBar.w0 d = a0Var.d(1, nrVar);
            this.f35747l0 = d;
            this.f35809s0.setCallback(d.getIconView());
            this.f35747l0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35747l0.getPopupLayout().f22705c = true;
            this.f35747l0.getPopupLayout().setFitItems(true);
            this.f35747l0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.A, c6Var);
            this.f35764n0 = c1Var;
            c1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f35764n0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f35764n0.setDrawShadow(false);
            this.f35764n0.setBackgroundColor(-14540254);
            this.f35764n0.setTextColor(-1);
            this.f35764n0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f35764n0.setOnValueChange(new nq0(this, 1));
            this.f35747l0.getPopupLayout().a(this.f35764n0, i7.f6.n(-1, 44));
            org.telegram.ui.ActionBar.l1 a13 = this.f35747l0.a(-1);
            this.f35836v0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f35747l0.getPopupLayout();
            d81 d81Var = new d81(this.A, new oq0(this));
            this.E0 = d81Var;
            popupLayout.addView(d81Var);
            LinearLayout linearLayout = new LinearLayout(this.A);
            this.f35818t0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f35747l0.getPopupLayout().addView(this.f35818t0);
            org.telegram.ui.ActionBar.g1 e10 = this.f35747l0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f35773o0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, this.A, 1);
            this.C0 = r7Var;
            try {
                r7Var.setRouteSelector(p5.a.c(this.A).a());
                z10 = true;
            } catch (Exception e11) {
                FileLog.e(e11);
                z10 = false;
            }
            this.C0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.g1 e12 = this.f35747l0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.B0 = e12;
                e12.d(false);
                this.B0.setSelectorColor(268435455);
                this.B0.addView(this.C0, 0, i7.f6.c(-1.0f, -1));
            }
            this.f35747l0.B(-115203550);
            this.f35747l0.setOnMenuDismiss(new mq0(this, 8));
            org.telegram.ui.ActionBar.w0 a14 = this.f35846w0.a(0, R.drawable.media_more);
            this.f35738k0 = a14;
            a14.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f35738k0.setOnClickListener(new sq0(this, 3));
            this.f35738k0.setOnMenuDismiss(new mq0(this, 9));
            this.f35738k0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35738k0.getPopupLayout().f22705c = true;
            this.f35738k0.getPopupLayout().setFitItems(true);
            this.F0 = new lr(this.A, this.f35738k0.getPopupLayout().getSwipeBack(), new oq0(this));
            org.telegram.ui.ActionBar.g1 i12 = this.f35738k0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.F0.f40261a);
            i12.c(-328966, -328966);
            this.f35782p0 = i12;
            i12.setOnClickListener(new sq0(this, 4));
            org.telegram.ui.ActionBar.l1 a15 = this.f35738k0.a(-1);
            this.f35791q0 = a15;
            a15.setColor(-15198184);
            this.f35738k0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).c(-328966, -328966);
            org.telegram.ui.ActionBar.g1 e13 = this.f35738k0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e13.c(-328966, -328966);
            this.f35800r0 = e13;
            org.telegram.ui.ActionBar.g1 e14 = this.f35738k0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.m0 = e14;
            e14.c(-328966, -328966);
            this.f35738k0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).c(-328966, -328966);
            this.f35738k0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).c(-328966, -328966);
            this.f35738k0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).c(-328966, -328966);
            this.f35738k0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).c(-328966, -328966);
            this.f35738k0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).c(-328966, -328966);
            this.f35738k0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).c(-328966, -328966);
            this.f35738k0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).c(-328966, -328966);
            this.f35738k0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).c(-328966, -328966);
            this.f35738k0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).c(-328966, -328966);
            this.f35738k0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).c(-328966, -328966);
            this.f35738k0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).c(-328966, -328966);
            this.f35738k0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).c(-328966, -328966);
            this.f35738k0.B(-115203550);
            this.f35738k0.r(19);
            this.f35738k0.r(20);
            J2(false, true);
            this.f35738k0.setPopupItemsSelectorColor(268435455);
            this.f35738k0.setSubMenuDelegate(new pr0(this));
            bh.d dVar = new bh.d(this.A, 25);
            this.f35683e0 = dVar;
            dVar.setBackgroundColor(2130706432);
            this.f35647a0.addView(this.f35683e0, i7.f6.e(-1, 48, 83));
            View view = new View(this.A);
            this.f35693f0 = view;
            if (this.Y1 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view.setBackgroundColor(i10);
            this.f35666c0.addView(this.f35693f0, i7.f6.a(-1.0f, this.f35702g0 / AndroidUtilities.density, 87));
            this.f35801r1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f35801r1[0].setShape(0);
            this.f35801r1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f35801r1[1].setShape(0);
            org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this.A, AndroidUtilities.dp(10.0f));
            this.f35712h1 = t30Var;
            this.f35647a0.addView(t30Var, i7.f6.e(-1, 68, 83));
            this.f35712h1.setDelegate(new rr0(this));
            for (int i13 = 0; i13 < 3; i13++) {
                this.f35830u3[i13] = new ImageView(this.f35864y);
                this.f35830u3[i13].setImageResource(R.drawable.msg_maxvideo);
                this.f35830u3[i13].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.f35830u3[i13].setScaleType(ImageView.ScaleType.CENTER);
                this.f35830u3[i13].setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
                this.f35830u3[i13].setVisibility(4);
                this.f35830u3[i13].setAlpha(1.0f);
                this.f35647a0.addView(this.f35830u3[i13], i7.f6.c(48.0f, 48));
                this.f35830u3[i13].setOnClickListener(new sq0(this, 5));
            }
            this.M = new sr0(new lh.b());
            nt0 nt0Var = new nt0(this.f35647a0.getContext());
            this.M1 = nt0Var;
            nt0Var.setFactory(new ag0(this, 2));
            this.M1.setVisibility(4);
            y2(true);
            for (int i14 = 0; i14 < 3; i14++) {
                this.S0[i14] = new tr0(this, this.f35647a0);
                this.S0[i14].d(0, false, true);
            }
            fd fdVar = new fd(this, this.A, c6Var);
            this.T0 = fdVar;
            fdVar.setUseSelfAlpha(true);
            this.T0.setProgressColor(-1);
            this.T0.setSize(AndroidUtilities.dp(54.0f));
            this.T0.setBackgroundResource(R.drawable.circle_big);
            this.T0.setVisibility(4);
            this.T0.setAlpha(0.0f);
            this.f35647a0.addView(this.T0, i7.f6.e(64, 64, 17));
            L0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f35864y, c6Var);
            this.L7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.L7.setBackgroundResource(R.drawable.circle_big);
            this.L7.setVisibility(4);
            this.f35647a0.addView(this.L7, i7.f6.e(54, 54, 17));
            org.telegram.ui.Components.of0 of0Var = new org.telegram.ui.Components.of0(this.f35864y);
            this.K7 = of0Var;
            of0Var.setBackgroundColor(2130706432);
            this.K7.a();
            this.K7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.K7.f31343b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.K7.f31343b;
            int i15 = org.telegram.ui.ActionBar.g6.f23459zf;
            textView.setTextColor(z1(i15));
            this.f35647a0.addView(this.K7, i7.f6.e(-1, 48, 83));
            this.K7.f31342a.setOnClickListener(new hq0(this, 2));
            this.K7.f31343b.setOnClickListener(new hq0(this, 3));
            org.telegram.ui.Components.n61 n61Var = new org.telegram.ui.Components.n61(false);
            this.f35837v1 = n61Var;
            n61Var.c(new pr0(this));
            rt0 rt0Var3 = this.f35647a0;
            Objects.requireNonNull(rt0Var3);
            this.f35847w1 = new org.telegram.ui.Components.eo0(new vk0(rt0Var3, 14), false);
            bu0 bu0Var = new bu0(this.f35864y, this);
            this.J7 = bu0Var;
            bu0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.J7.setVisibility(4);
            this.J7.setBackgroundColor(2130706432);
            this.f35647a0.addView(this.J7, i7.f6.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            bg.u1 u1Var = new bg.u1(this, this.A);
            this.L0 = u1Var;
            this.f35647a0.addView(u1Var, i7.f6.e(-1, -2, 83));
            TextView textView2 = new TextView(this.f35647a0.getContext());
            this.f35711h0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f35711h0.setTypeface(AndroidUtilities.bold());
            this.f35711h0.setSingleLine(true);
            this.f35711h0.setMaxLines(1);
            TextView textView3 = this.f35711h0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f35711h0.setTextColor(-1);
            this.f35711h0.setGravity(3);
            this.L0.addView(this.f35711h0, i7.f6.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f35647a0.getContext());
            this.f35720i0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.f35720i0.setSingleLine(true);
            this.f35720i0.setMaxLines(1);
            this.f35720i0.setEllipsize(truncateAt);
            this.f35720i0.setTextColor(-1);
            this.f35720i0.setGravity(3);
            this.L0.addView(this.f35720i0, i7.f6.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView5 = new TextView(this.f35647a0.getContext());
            this.f35729j0 = textView5;
            int i16 = org.telegram.ui.ActionBar.g6.Oh;
            textView5.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{6.0f}, z1(i16)));
            TextView textView6 = this.f35729j0;
            int i17 = org.telegram.ui.ActionBar.g6.Sh;
            textView6.setTextColor(z1(i17));
            this.f35729j0.setEllipsize(truncateAt);
            this.f35729j0.setGravity(17);
            this.f35729j0.setLines(1);
            this.f35729j0.setSingleLine(true);
            this.f35729j0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f35729j0.setTextSize(1, 15.0f);
            this.f35729j0.setTypeface(AndroidUtilities.bold());
            this.f35729j0.setOnClickListener(new hq0(this, 4));
            this.f35729j0.setVisibility(8);
            this.L0.addView(this.f35729j0, i7.f6.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            ur0 ur0Var = new ur0(this.f35864y, this);
            this.N7 = ur0Var;
            ur0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.f35864y);
            this.M7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.M7.addView(this.N7, i7.f6.e(-1, 54, 83));
            c3(false, false);
            this.f35647a0.addView(this.M7, i7.f6.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.w0 w0Var = this.A0;
            if (w0Var != null) {
                ng.d a16 = this.U.a(w0Var);
                a16.n(pg.a.i(c6Var));
                a16.p(AndroidUtilities.dp(20.0f));
                a16.o(AndroidUtilities.dp(7.0f));
                w0Var.setBackground(rg.c.d(a16, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            vr0 vr0Var = new vr0(this.f35864y, LocaleController.getString(R.string.EditorSetCover));
            this.f35667c1 = vr0Var;
            ng.d a17 = this.U.a(vr0Var);
            a17.n(pg.a.i(c6Var));
            vr0Var.setBlurredBackgroundDrawable(a17);
            i7.h6.a(this.f35667c1);
            this.f35667c1.setOnClickListener(new hq0(this, 7));
            this.f35647a0.addView(this.f35667c1, i7.f6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.ff0 ff0Var = new org.telegram.ui.Components.ff0(this.f35864y, c6Var, this.X);
            this.f35759m5 = ff0Var;
            org.telegram.ui.Components.ht htVar = ff0Var.f28392c;
            ng.d a18 = this.U.a(htVar);
            a18.n(pg.a.i(c6Var));
            htVar.setBlurredBackgroundDrawable(a18);
            i7.h6.a(this.f35759m5.f28392c);
            this.f35759m5.setVisibility(8);
            this.f35759m5.setAlpha(0.0f);
            this.f35759m5.setOnClose(new gq0(this, 12));
            this.f35647a0.addView(this.f35759m5, i7.f6.e(-1, -1, 119));
            this.f35759m5.f28391b.setOnClickListener(new hq0(this, 9));
            this.f35759m5.setOnGalleryImage(new mq0(this, 3));
            org.telegram.ui.ActionBar.m0 m0Var = new org.telegram.ui.ActionBar.m0(this, this.f35864y, 2);
            this.f35648a1 = m0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            m0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.m0 m0Var2 = this.f35648a1;
            org.telegram.ui.Components.gc0 gc0Var = new org.telegram.ui.Components.gc0(this.f35864y);
            this.Z0 = gc0Var;
            m0Var2.setImageDrawable(gc0Var);
            this.f35648a1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.m0 m0Var3 = this.f35648a1;
            ng.d a19 = this.U.a(m0Var3);
            a19.n(pg.a.i(null));
            a19.o(AndroidUtilities.dp(4.0f));
            a19.p(AndroidUtilities.dp(16.0f));
            m0Var3.setBackground(a19);
            i7.h6.a(this.f35648a1);
            this.f35647a0.addView(this.f35648a1, i7.f6.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f35648a1.setOnClickListener(new hq0(this, 10));
            org.telegram.ui.Components.a90 a90Var = new org.telegram.ui.Components.a90(this.f35647a0.getContext());
            this.f35657b1 = a90Var;
            a90Var.setOnClickListener(new hq0(this, 11));
            this.f35647a0.addView(this.f35657b1, i7.f6.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f35647a0.getContext();
            yt0 yt0Var2 = this.f35666c0;
            rt0 rt0Var4 = this.f35647a0;
            xr0 xr0Var2 = new xr0(this, context, yt0Var2, rt0Var4, rt0Var4, c6Var, this.X, new gq0(this, 19));
            this.Q1 = xr0Var2;
            xr0Var2.setBlurredBackgroundDrawableForMentions(this.U);
            this.Q1.setOnTimerChange(new mq0(this, 4));
            this.Q1.setAccount(this.P);
            this.Q1.setOnHeightUpdate(new mq0(this, 5));
            this.Q1.setOnAddPhotoClick(new hq0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.A;
            yt0 yt0Var3 = this.f35666c0;
            rt0 rt0Var5 = this.f35647a0;
            yr0 yr0Var = new yr0(this, contextThemeWrapper, yt0Var3, rt0Var5, rt0Var5, c6Var, this.X, new gq0(this, 19));
            this.R1 = yr0Var;
            yr0Var.setBlurredBackgroundDrawableForMentions(this.U);
            this.R1.D(true, false);
            this.R1.setOnTimerChange(new mq0(this, 6));
            this.R1.setAccount(this.P);
            this.R1.setOnHeightUpdate(new mq0(this, 7));
            this.R1.setOnAddPhotoClick(new hq0(this, 13));
            lh.z2 z2Var = new lh.z2(this, this.A);
            this.f35778o5 = z2Var;
            z2Var.setVisibility(8);
            this.f35647a0.addView(this.f35778o5, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            bg.u3 u3Var2 = new bg.u3(this.A, c6Var);
            this.f35751l5 = u3Var2;
            u3Var2.setCurrentAccount(this.P);
            this.f35647a0.addView(this.f35751l5, rt0Var.indexOfChild(this.B) - 1, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            jt0 jt0Var = new jt0(this);
            this.f35787p5 = jt0Var;
            jt0Var.setRad(18);
            this.f35787p5.l();
            this.f35751l5.setStickerCutOutBtn(this.f35787p5);
            this.f35787p5.setOnClickListener(new hq0(this, 14));
            this.f35787p5.setCutOutState(false);
            this.f35647a0.addView(this.f35787p5, i7.f6.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f35864y);
            this.f35796q5 = linearLayout2;
            linearLayout2.setOrientation(0);
            jt0 jt0Var2 = new jt0(this);
            this.f35805r5 = jt0Var2;
            jt0Var2.f2271j0 = true;
            jt0Var2.setRad(18);
            this.f35805r5.setEraseState(false);
            this.f35805r5.setOnClickListener(new hq0(this, 15));
            this.f35796q5.addView(this.f35805r5, i7.f6.n(-2, 36));
            this.f35796q5.addView(new Space(this.f35864y), i7.f6.n(12, -1));
            jt0 jt0Var3 = new jt0(this);
            this.f35814s5 = jt0Var3;
            jt0Var3.f2271j0 = true;
            jt0Var3.setRad(18);
            this.f35814s5.setRestoreState(false);
            this.f35814s5.setOnClickListener(new hq0(this, 16));
            this.f35796q5.addView(this.f35814s5, i7.f6.n(-2, 36));
            this.f35647a0.addView(this.f35796q5, i7.f6.e(-2, 36, 17));
            jt0 jt0Var4 = new jt0(this);
            this.f35823t5 = jt0Var4;
            jt0Var4.setUndoState(false);
            this.f35823t5.setRad(18);
            jt0 jt0Var5 = this.f35823t5;
            jt0Var5.f2271j0 = true;
            jt0Var5.setOnClickListener(new hq0(this, 17));
            this.f35647a0.addView(this.f35823t5, i7.f6.e(-2, 36, 17));
            jt0 jt0Var6 = new jt0(this);
            this.f35832u5 = jt0Var6;
            jt0Var6.setOutlineState(false);
            this.f35832u5.setRad(18);
            jt0 jt0Var7 = this.f35832u5;
            jt0Var7.f2271j0 = true;
            jt0Var7.setOnClickListener(new hq0(this, 18));
            this.f35647a0.addView(this.f35832u5, i7.f6.e(-2, 36, 17));
            W2(false, false);
            a3(false, false);
            n0 n0Var = new n0(this, this.f35864y, 18);
            this.T1 = n0Var;
            n0Var.addView(this.Q1, i7.f6.e(-1, -1, 83));
            this.f35647a0.addView(this.T1, i7.f6.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.f35864y);
            this.U1 = frameLayout2;
            frameLayout2.addView(this.R1, i7.f6.e(-1, -1, 51));
            this.f35647a0.addView(this.U1, i7.f6.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.f35864y);
            this.M0 = frameLayout3;
            this.f35647a0.addView(frameLayout3, i7.f6.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.f35864y);
            this.N0 = frameLayout4;
            this.f35647a0.addView(frameLayout4, i7.f6.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView7 = new TextView(this.f35864y);
            this.O7 = textView7;
            textView7.setSingleLine(true);
            this.O7.setVisibility(8);
            this.O7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.O7.setGravity(1);
            this.O7.setTextSize(1, 14.0f);
            this.O7.setTextColor(-7566196);
            this.f35647a0.addView(this.O7, i7.f6.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0((NotificationCenter.NotificationCenterDelegate) this, (Context) this.f35864y, R.drawable.send_plane_24, c6Var, 2);
            this.O0 = hp0Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            hp0Var.E = dp;
            hp0Var.F = dp2;
            org.telegram.ui.Components.hp0 hp0Var2 = this.O0;
            hp0Var2.f31351d0 = true;
            ng.d a20 = this.U.a(hp0Var2);
            a20.n(pg.a.i(c6Var));
            hp0Var2.setBlurredBackgroundDrawable(a20);
            this.f35647a0.addView(this.O0, i7.f6.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.O0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            i7.h6.a(this.O0);
            this.O0.setOnClickListener(new hq0(this, 19));
            this.O0.setOnLongClickListener(new w(this, 5));
            org.telegram.ui.Components.gf0 gf0Var = new org.telegram.ui.Components.gf0(this.f35864y);
            this.P0 = gf0Var;
            LinearLayout linearLayout3 = gf0Var.f28878a;
            ng.d a21 = this.U.a(linearLayout3);
            a21.n(pg.a.i(c6Var));
            a21.p(AndroidUtilities.dp(18.0f));
            a21.o(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.P0.f28879b;
            ng.d a22 = this.U.a(linearLayout4);
            a22.n(pg.a.i(c6Var));
            a22.p(AndroidUtilities.dp(18.0f));
            a22.o(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a22);
            this.P0.setVisibility(8);
            this.P0.f28878a.setOnClickListener(new hq0(this, 20));
            this.P0.f28879b.setOnClickListener(new hq0(this, 21));
            this.f35647a0.addView(this.P0, i7.f6.e(-1, 56, 80));
            ua1 ua1Var = new ua1(this, this.f35864y, 16);
            this.D0 = ua1Var;
            ua1Var.setOrientation(0);
            this.D0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            ua1 ua1Var2 = this.D0;
            ng.d a23 = this.U.a(ua1Var2);
            a23.n(pg.a.i(c6Var));
            a23.o(AndroidUtilities.dp(2.0f));
            a23.p(AndroidUtilities.dp(22.0f));
            ua1Var2.setBackground(a23);
            this.L0.addView(this.D0, i7.f6.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.f35864y);
            this.V0 = imageView;
            imageView.setScaleType(scaleType);
            this.V0.setImageResource(R.drawable.media_crop);
            this.V0.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.V0, i7.f6.n(48, 48));
            this.V0.setOnClickListener(new hq0(this, 22));
            this.V0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f35864y);
            this.X0 = imageView2;
            imageView2.setScaleType(scaleType);
            this.X0.setImageResource(R.drawable.msg_photo_rotate);
            this.X0.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.X0, i7.f6.n(48, 48));
            this.X0.setOnClickListener(new hq0(this, 23));
            this.X0.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f35864y);
            this.W0 = imageView3;
            imageView3.setScaleType(scaleType);
            this.W0.setImageResource(R.drawable.media_flip);
            this.W0.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.W0, i7.f6.n(48, 48));
            this.W0.setOnClickListener(new hq0(this, 24));
            this.W0.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f35864y);
            this.U0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.U0.setImageResource(R.drawable.media_draw);
            this.U0.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.U0, i7.f6.n(48, 48));
            this.U0.setOnClickListener(new hq0(this, 25));
            this.U0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(this.f35864y);
            this.f35694f1 = j61Var;
            j61Var.setTag(1);
            this.f35694f1.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.T7 = v2();
            org.telegram.ui.Components.j61 j61Var2 = this.f35694f1;
            if (this.f35701f8 && this.U7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j61Var2.a(Math.min(this.Z7, this.f35654a8), z11, this.f35799r);
            this.f35694f1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.D0.addView(this.f35694f1, i7.f6.n(48, 48));
            this.f35694f1.setOnClickListener(new t70(14, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f35864y);
            this.Y0 = imageView5;
            imageView5.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.media_settings);
            this.Y0.setBackground(org.telegram.ui.ActionBar.g6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.Y0, i7.f6.n(48, 48));
            this.Y0.setOnClickListener(new hq0(this, 26));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.of0 of0Var2 = new org.telegram.ui.Components.of0(this.A);
            this.Q0 = of0Var2;
            of0Var2.setBackgroundColor(-872415232);
            this.Q0.a();
            this.Q0.setVisibility(8);
            this.f35647a0.addView(this.Q0, i7.f6.e(-1, 48, 83));
            this.Q0.f31342a.setOnClickListener(new hq0(this, 27));
            this.Q0.f31343b.setOnClickListener(new hq0(this, 28));
            TextView textView8 = new TextView(this.A);
            this.R0 = textView8;
            textView8.setClickable(false);
            this.R0.setVisibility(8);
            this.R0.setTextSize(1, 14.0f);
            this.R0.setTextColor(-1);
            this.R0.setGravity(17);
            this.R0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(-12763843, 0));
            this.R0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.R0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.R0.setTypeface(AndroidUtilities.bold());
            this.Q0.addView(this.R0, i7.f6.e(-2, -1, 49));
            this.R0.setOnClickListener(new hq0(this, 29));
            org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(this.f35647a0.getContext(), this);
            this.f35770n6 = f20Var;
            f20Var.b();
            this.f35779o6 = true;
            this.f35770n6.h = this;
            oq0 oq0Var = new oq0(this);
            this.f35869y4.setParentView(this.f35647a0);
            this.f35869y4.setCrossfadeAlpha((byte) 2);
            this.f35869y4.setInvalidateAll(true);
            this.f35869y4.setDelegate(oq0Var);
            this.x4.setParentView(this.f35647a0);
            this.x4.setCrossfadeAlpha((byte) 2);
            this.x4.setInvalidateAll(true);
            this.x4.setDelegate(oq0Var);
            this.f35877z4.setParentView(this.f35647a0);
            this.f35877z4.setCrossfadeAlpha((byte) 2);
            this.f35877z4.setInvalidateAll(true);
            this.f35877z4.setDelegate(oq0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f35647a0.getContext(), R.drawable.selectphoto_large);
            this.J0 = checkBox;
            checkBox.setDrawBackground(true);
            this.J0.setHasBorder(true);
            this.J0.setSize(34);
            this.J0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.J0.c(z1(i15), -1);
            this.J0.setVisibility(8);
            rt0 rt0Var6 = this.f35647a0;
            CheckBox checkBox2 = this.J0;
            if (rotation != 3 && rotation != 1) {
                f9 = 71.0f;
            } else {
                f9 = 61.0f;
            }
            rt0Var6.addView(checkBox2, i7.f6.d(34, 34.0f, 53, 0.0f, f9, 11.0f, 0.0f));
            if (!this.f35808s) {
                ((FrameLayout.LayoutParams) this.J0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.J0.setOnClickListener(new sq0(this, 0));
            CounterView counterView = new CounterView(this.f35864y);
            this.K0 = counterView;
            rt0 rt0Var7 = this.f35647a0;
            if (rotation != 3 && rotation != 1) {
                f10 = 68.0f;
            } else {
                f10 = 58.0f;
            }
            rt0Var7.addView(counterView, i7.f6.d(40, 40.0f, 53, 0.0f, f10, 64.0f, 0.0f));
            if (!this.f35808s) {
                ((FrameLayout.LayoutParams) this.K0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.K0.setOnClickListener(new sq0(this, 1));
            fu0 fu0Var = new fu0(this.f35864y);
            this.f35739k1 = fu0Var;
            fu0Var.setVisibility(8);
            this.f35739k1.setAlpha(0.0f);
            this.f35739k1.setLayoutManager(new k());
            fu0 fu0Var2 = this.f35739k1;
            st0 st0Var = new st0(this.f35864y, this);
            this.l1 = st0Var;
            fu0Var2.setAdapter(st0Var);
            this.f35647a0.addView(this.f35739k1, i7.f6.e(-1, 103, 51));
            this.f35739k1.setOnItemClickListener(new j(this, 21));
            UndoView undoView = new UndoView(this.A, null, false, c6Var);
            this.f35730j1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f35730j1.i();
            this.f35647a0.addView(this.f35730j1, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.A);
                this.P3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.P3.setFocusable(true);
                this.P3.setOnClickListener(new sq0(this, 2));
                this.f35647a0.addView(this.P3, i7.f6.e(64, 64, 17));
            }
            this.f35729j0.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{6.0f}, z1(i16)));
            this.f35729j0.setTextColor(z1(i17));
            sr0 sr0Var = this.M;
            sr0Var.f25951k0 = true;
            sr0Var.f25947i0 = false;
            org.telegram.ui.Cells.w9 o10 = sr0Var.o(this.f35666c0.getContext());
            if (o10 != null) {
                AndroidUtilities.removeFromParent(o10);
                this.f35647a0.addView(o10);
            }
            this.M.T(this.f35647a0);
            this.M.S();
            this.f35646a.a(false, false);
            return;
        }
        u3();
    }

    public final void L0() {
        gu0 gu0Var = new gu0(this.f35647a0.getContext(), this);
        this.f35686e3 = gu0Var;
        this.f35647a0.addView(gu0Var, i7.f6.e(-1, 48, 83));
        pr0 pr0Var = new pr0(this);
        hs0 hs0Var = new hs0(this, pr0Var);
        op0 op0Var = new op0(this, this.f35647a0.getContext(), 1);
        this.f35767n3 = op0Var;
        op0Var.setAccessibilityDelegate(hs0Var);
        this.f35767n3.setImportantForAccessibility(1);
        this.f35686e3.addView(this.f35767n3, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(this.f35767n3);
        this.f35757m3 = z61Var;
        z61Var.f35251z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.z61 z61Var2 = this.f35757m3;
        z61Var2.f35237k = 872415231;
        z61Var2.f35238l = 872415231;
        z61Var2.f35239m = -1;
        z61Var2.f35240n = -1;
        z61Var2.A = 1509949439;
        z61Var2.f35236j = pr0Var;
        is0 is0Var = new is0(this, this.f35647a0.getContext(), new oq0(this));
        this.f35776o3 = is0Var;
        is0Var.setAlpha(0.0f);
        this.f35647a0.addView(this.f35776o3, i7.f6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(this.f35647a0.getContext());
        this.f35741k3 = h5Var;
        h5Var.setTextColor(-1);
        this.f35741k3.setGravity(53);
        this.f35741k3.setTextSize(14);
        this.f35741k3.setImportantForAccessibility(2);
        this.f35686e3.addView(this.f35741k3, i7.f6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f35647a0.getContext());
        this.f35749l3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f35749l3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f35749l3.setScaleType(ImageView.ScaleType.CENTER);
        this.f35749l3.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        this.f35749l3.setVisibility(4);
        this.f35686e3.addView(this.f35749l3, i7.f6.e(48, 48, 53));
        this.f35749l3.setOnClickListener(new sq0(this, 6));
    }

    public final void L2(org.telegram.ui.Components.ni niVar) {
        this.W1 = niVar;
        jf.r0 r0Var = this.X1;
        if (r0Var != null) {
            r0Var.destroy();
            this.X1 = null;
        }
        if (niVar != null) {
            this.X1 = niVar.obtainWindowVisibilityController();
        }
    }

    public final void M0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.ma maVar;
        if (this.f35858x2 == null) {
            os0 os0Var = new os0(this.f35864y, this);
            this.f35829u2 = os0Var;
            os0Var.setWillNotDraw(false);
            this.f35829u2.setVisibility(4);
            this.f35647a0.addView(this.f35829u2, 0, i7.f6.e(-1, -1, 17));
            this.f35875z2 = false;
            if (this.f35671c7.isEmpty()) {
                if (this.f35655b && this.P2 == null) {
                    this.f35867y2 = new SurfaceView(this.f35864y);
                    this.f35875z2 = true;
                } else {
                    this.f35858x2 = new TextureView(this.f35864y);
                }
            } else {
                org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(this.f35864y, this.B2);
                this.X.e();
                org.telegram.ui.Components.ga gaVar = this.X;
                l61Var.f30241s = gaVar;
                org.telegram.ui.Components.qz qzVar = l61Var.f30235b;
                if (qzVar != null && (maVar = qzVar.E) != null) {
                    org.telegram.ui.Components.ga gaVar2 = maVar.f30626t;
                    if (gaVar2 != null && gaVar2.f28858m != null) {
                        gaVar2.f28858m = null;
                    }
                    maVar.f30626t = gaVar;
                    if (gaVar != null && gaVar.f28858m != maVar) {
                        gaVar.f28858m = maVar;
                        gaVar.d();
                    }
                }
                if (savedFilterState != null) {
                    l61Var.setDelegate(new zk0(savedFilterState, 2));
                }
                this.f35858x2 = l61Var;
            }
            SurfaceTexture surfaceTexture = this.P2;
            if (surfaceTexture != null) {
                this.f35858x2.setSurfaceTexture(surfaceTexture);
                this.D3 = true;
                this.E3 = true;
                this.P2 = null;
            }
            TextureView textureView = this.f35858x2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.f35858x2.setPivotY(0.0f);
                this.f35858x2.setOpaque(false);
                this.f35829u2.addView(this.f35858x2, i7.f6.e(-1, -1, 17));
            } else {
                this.f35829u2.addView(this.f35867y2, i7.f6.e(-1, -1, 17));
            }
            qt0 qt0Var = new qt0(this.f35864y, this);
            this.A2 = qt0Var;
            qt0Var.setPivotX(0.0f);
            this.A2.setPivotY(0.0f);
            this.A2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f35829u2.addView(this.A2, i7.f6.e(-1, -1, 17));
            View view = new View(this.f35864y);
            this.K8 = view;
            this.f35829u2.addView(view, i7.f6.c(-1.0f, -1));
            if (this.Y1 == 1) {
                View view2 = new View(this.f35864y);
                this.f35838v2 = view2;
                view2.setBackgroundColor(-1);
                this.f35838v2.setAlpha(0.0f);
                this.f35829u2.addView(this.f35838v2, i7.f6.e(-1, -1, 17));
            }
            af.g gVar = this.C2;
            if (gVar != null) {
                os0 os0Var2 = this.f35829u2;
                gVar.f403i.O(os0Var2);
                gVar.f404j = os0Var2;
                if (os0Var2 != null) {
                    gVar.e(os0Var2);
                }
                this.C2.f405k = this.K8;
            }
        }
    }

    public final void M2() {
        tn tnVar;
        TLRPC.Chat chat;
        xt0 xt0Var = this.d;
        if (xt0Var != null) {
            if (xt0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.L4)) {
                if (this.f35763n && (tnVar = this.f35715h4) != null && (chat = tnVar.f42787e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.c5.N(this.f35864y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).o();
                    return;
                }
                return;
            }
            int k9 = this.d.k(this.L4, n1());
            boolean x4 = this.d.x(this.L4);
            this.J0.b(x4, true);
            if (k9 >= 0) {
                if (x4) {
                    this.l1.o(k9);
                    this.f35739k1.x0(k9);
                } else {
                    this.l1.u(k9);
                    if (k9 == 0) {
                        this.l1.m(0);
                    }
                }
            }
            A3();
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f11 = 1.0f - f9;
            this.P0.setTranslationY(AndroidUtilities.dp(36.0f) * f11);
            this.P0.setAlpha(f9);
            org.telegram.ui.Components.gf0 gf0Var = this.P0;
            int i13 = 8;
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            gf0Var.setVisibility(i11);
            if (this.f35658b2) {
                bg.u1 u1Var = this.L0;
                int i14 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                u1Var.setVisibility(i12);
                this.L0.setAlpha(f11);
                this.L0.setTranslationY(AndroidUtilities.dp(36.0f) * f9);
                org.telegram.ui.Components.hp0 hp0Var = this.O0;
                if (i14 < 0) {
                    i13 = 0;
                }
                hp0Var.setVisibility(i13);
                this.O0.setAlpha(f11);
                this.O0.setTranslationY(AndroidUtilities.dp(36.0f) * f9);
            }
        }
    }

    public final boolean N0() {
        boolean z10 = false;
        if (this.f35752l6 != null || this.f35866y1 == null) {
            return false;
        }
        this.c6 = 1.0f;
        this.f35735j6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35752l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f));
        this.f35752l6.setDuration(250L);
        this.f35752l6.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        this.f35752l6.addListener(new es0(this, 0));
        this.f35752l6.start();
        wf.l lVar = this.f35866y1.f31657b.H;
        if (lVar != null) {
            z10 = lVar.f49950j;
        }
        return !z10;
    }

    public final void N2() {
        float bitmapWidth = this.f35869y4.getBitmapWidth();
        float bitmapHeight = this.f35869y4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float k12 = k1(this.f35795q4);
            float i12 = i1();
            float min = Math.min(i12 / bitmapHeight, k12 / bitmapWidth);
            float max = Math.max(k12 / ((int) (bitmapWidth * min)), i12 / ((int) (bitmapHeight * min)));
            this.W5 = max;
            w3(max);
        }
    }

    public final boolean O0(float f9, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.pe0 pe0Var;
        float f10;
        if (this.f35752l6 == null && (pe0Var = this.f35866y1) != null) {
            pe0Var.f31657b.i();
            this.X5 = 0.0f;
            this.f35662b6 = 0.0f + f9;
            if (z10) {
                this.c6 = 1.0f;
            }
            this.f35735j6 = System.currentTimeMillis();
            this.f35752l6 = new AnimatorSet();
            if (this.Y1 == 1) {
                this.f35652a6 = 1.0f;
                this.W5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.f35869y4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.f35869y4.getBitmapHeight();
                    if (Math.abs((((int) this.f35866y1.f31657b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.T4.f41222c;
                    if (cropState != null) {
                        bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                        bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                    }
                    float f11 = bitmapWidth;
                    float f12 = bitmapHeight;
                    float min = Math.min(k1(1) / f11, h1(1, false) / f12);
                    if (Math.abs((f9 / 90.0f) % 2.0f) == 1.0f) {
                        f10 = Math.min(k1(1) / f12, h1(1, false) / f11);
                    } else {
                        f10 = min;
                    }
                    this.f35652a6 = f10 / min;
                }
            }
            if (this.Y1 == 11) {
                this.W5 = r2(false) * this.W5;
                this.f35652a6 = r2(false) * this.f35652a6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new nh.v9(this, f9, this.f35866y1.f31658c.getRotation(), 3));
            this.f35752l6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f), ofFloat);
            this.f35752l6.setDuration(250L);
            this.f35752l6.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f35752l6.addListener(new fs0(this, f9, runnable));
            this.f35752l6.start();
            if (Math.abs(this.f35866y1.f31657b.getStateOrientation() + f9) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void O2(CharSequence charSequence) {
        wt0 wt0Var = this.I;
        this.f35650a4 = charSequence;
        wt0Var.c(charSequence);
        j3(true, false);
    }

    public final void P0() {
        if (this.f35864y != null && this.f35666c0 != null) {
            if (org.telegram.ui.Components.bg0.f27076l0.L) {
                org.telegram.ui.Components.bg0.j(false);
            }
            o2();
            n2(false);
            try {
                if (this.f35666c0.getParent() != null) {
                    ((WindowManager) this.f35864y.getSystemService("window")).removeViewImmediate(this.f35666c0);
                    V1();
                }
                this.f35666c0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f35698f5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f35698f5 = null;
            }
            this.f35673d0.setImageBitmap(null);
            if (this == W8) {
                W8 = null;
            } else {
                V8 = null;
            }
            V1();
        }
    }

    public final boolean P1() {
        if (this.Y1 != 11) {
            int i10 = this.L4;
            if (i10 >= 0) {
                ArrayList arrayList = this.f35671c7;
                if (i10 < arrayList.size()) {
                    xt0 xt0Var = this.d;
                    if (xt0Var != null && !xt0Var.N()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.L4);
                    if (obj instanceof MediaController.PhotoEntry) {
                        return ((MediaController.PhotoEntry) obj).isUnalivePhoto();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void P2(boolean z10, boolean z11) {
        if (this.f35714h3 != z10) {
            if (z10) {
                this.f35683e0.setTag(1);
            } else {
                this.f35683e0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f35705g3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35714h3 = z10;
            float f9 = 0.0f;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    this.f35686e3.setVisibility(0);
                }
                float alpha = this.f35686e3.getAlpha();
                if (z10) {
                    f9 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f9);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new fq0(this, 0));
                ofFloat.addListener(new ps0(this, z10, 0));
                this.f35705g3 = ofFloat;
                ofFloat.start();
            } else {
                gu0 gu0Var = this.f35686e3;
                if (!z10) {
                    i10 = 8;
                }
                gu0Var.setVisibility(i10);
                gu0 gu0Var2 = this.f35686e3;
                if (z10) {
                    f9 = 1.0f;
                }
                gu0Var2.setAlpha(f9);
            }
            if (this.f35704g2 && this.f35700f7 == null) {
                if (z10) {
                    this.f35738k0.K(9);
                } else {
                    this.f35738k0.r(9);
                }
            }
        }
    }

    public final void Q0() {
        if (this.f35869y4.getAnimation() == null && !this.f35671c7.isEmpty() && this.Y1 != 1) {
            String imageKey = this.f35869y4.getImageKey();
            String str = this.f35822t4;
            if (str == null || !str.equals(imageKey)) {
                this.f35813s4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.f35869y4.getBitmapSafe();
                int orientation = this.f35869y4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new vs(this, bitmapSafe, orientation, imageKey, 7));
                }
            }
        }
    }

    public final boolean Q1() {
        if (this.f35682e && this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean Q2(int i10) {
        tt0 tt0Var = this.f35700f7;
        if (tt0Var != null) {
            if ((tt0Var.a(i10) || this.f35700f7.e(i10)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f35700f7.b(i10);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f35700f7.d(i10) instanceof TLRPC.Document)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void R0() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.U7)), this.T7);
        edit.commit();
        D3();
        B3();
    }

    public final void R1() {
        WindowManager.LayoutParams layoutParams = this.Z;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.f35864y.getSystemService("window")).updateViewLayout(this.f35666c0, this.Z);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f35666c0.setFocusable(true);
        this.f35647a0.setFocusable(true);
    }

    public final void S0() {
        jf.s0 s0Var = this.f35727i7;
        if (s0Var != null) {
            s0Var.destroy();
            this.f35727i7 = null;
        }
        jf.r0 r0Var = this.X1;
        if (r0Var != null) {
            r0Var.destroy();
            this.X1 = null;
        }
        try {
            if (this.f35666c0.getParent() != null) {
                ((WindowManager) this.f35864y.getSystemService("window")).removeView(this.f35666c0);
                V1();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void S1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f9, boolean z10) {
        boolean z11;
        int i10;
        Bitmap.CompressFormat g12 = g1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z11 = true;
            } catch (Throwable th2) {
                FileLog.e(th2);
                return;
            }
        } else {
            z11 = false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f10 = width;
        if (f10 > f9 || height > f9) {
            float max = Math.max(width, height) / f9;
            height = (int) (height / max);
            width = (int) (f10 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        Paint paint = Q8;
        if (z10) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f9 == 512.0f) {
            i10 = 83;
        } else {
            i10 = 87;
        }
        createBitmap.compress(g12, i10, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (z11) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void S2(AlertDialog$Builder alertDialog$Builder) {
        if (this.f35864y != null) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.L1;
                if (c2Var != null) {
                    c2Var.dismiss();
                    this.L1 = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
                this.L1 = o10;
                o10.setCanceledOnTouchOutside(true);
                this.L1.setOnDismissListener(new s5(this, 11));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    public final void T0(android.graphics.Canvas r51, org.telegram.ui.Components.ka r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T0(android.graphics.Canvas, org.telegram.ui.Components.ka, int, int, boolean, boolean, boolean):void");
    }

    public final void T1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(boolean):void");
    }

    public final boolean T2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f35724i4;
        if ((o2Var instanceof tn) && ChatObject.isChannelAndNotMegaGroup(((tn) o2Var).f42787e)) {
            org.telegram.ui.Components.mc f9 = new org.telegram.ui.Components.tc(frameLayout, this.f35802r2).f(MessagesController.getInstance(this.P).captionLengthLimitPremium, new gq0(this, 26));
            f9.v = new gq0(this, 27);
            this.f35736j7 = f9.j();
            return true;
        }
        return false;
    }

    public final void U0(android.graphics.Canvas r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U0(android.graphics.Canvas, float, float):void");
    }

    public final void U1(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U1(android.graphics.Canvas):void");
    }

    public final void U2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35864y, 0, this.f35802r2);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.P4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.P4.currentAccount).isLoadingFile(this.Y4[0])) {
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PleaseDownload);
        }
        S2(alertDialog$Builder);
    }

    public final void V0(Canvas canvas) {
        boolean z10;
        float e10;
        int i10;
        if (this.O4) {
            if (!SharedConfig.photoViewerBlur) {
                e10 = 1.0f;
            } else {
                int i11 = this.f35733j4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e10 = this.f35881z8.e(z10);
            }
            if (e10 <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((int) (AndroidUtilities.statusBarHeight * 1.5f));
            int height = this.L0.getHeight() + AndroidUtilities.navigationBarHeight;
            if (this.Q1.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(20.0f) + (this.Q1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            if (this.B7 == null) {
                this.B7 = new Path();
                Paint paint = new Paint(1);
                this.C7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.D7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.E7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.F7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.G7 = new Matrix();
                this.H7 = new Matrix();
                this.C7.setShader(this.E7);
                this.D7.setShader(this.F7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f35647a0.getWidth(), this.f35647a0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e10 * (this.H0.getAlpha() - 127) * 2.007874f), 31);
            this.B7.rewind();
            float f9 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.B7.addRect(0.0f, 0.0f, this.f35647a0.getWidth(), f9, direction);
            this.B7.addRect(0.0f, (this.f35647a0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f35647a0.getWidth(), this.f35647a0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.B7);
            canvas.drawColor(-16777216);
            T0(canvas, this.Y, 0, 0, true, true, false);
            canvas.save();
            this.G7.reset();
            this.G7.postScale(1.0f, f9 / 16.0f);
            this.E7.setLocalMatrix(this.G7);
            this.C7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f35647a0.getWidth(), f9, this.C7);
            this.H7.reset();
            this.H7.postScale(1.0f, i12 / 16.0f);
            this.H7.postTranslate(0.0f, (this.f35647a0.getHeight() - i12) + AndroidUtilities.navigationBarHeight);
            this.F7.setLocalMatrix(this.H7);
            this.D7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f35647a0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f35647a0.getWidth(), this.f35647a0.getHeight() + AndroidUtilities.navigationBarHeight, this.D7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void V1() {
        Activity activity = this.f35864y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).W0.remove(this.f35774o1);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f35724i4;
        if (o2Var != null && o2Var.getFragmentView() != null) {
            this.f35726i6 = 1.0f;
            View fragmentView = this.f35724i4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.ni niVar = this.W1;
            if (niVar != null) {
                org.telegram.ui.ActionBar.d3 container = niVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void V2(final org.telegram.ui.Components.ed edVar, boolean z10, boolean z11, final float[] fArr) {
        float f9;
        float f10;
        int i10;
        xt0 xt0Var = this.d;
        if (xt0Var != null && xt0Var.l()) {
            f9 = 175.0f;
        } else {
            f9 = 58.0f;
        }
        float dp = AndroidUtilities.dp(f9);
        float f11 = 1.0f;
        if (edVar == this.R1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f12 = dp * f10;
        Integer num = null;
        if (!z11) {
            edVar.animate().setListener(null).cancel();
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            edVar.setVisibility(i10);
            if (z10) {
                f12 = 0.0f;
            }
            edVar.setTranslationY(f12);
            float alpha = this.L0.getAlpha();
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[0] = f11;
            edVar.setAlpha(alpha * f11);
        } else if (z10 && edVar.getTag() == null) {
            if (edVar.getVisibility() != 0) {
                edVar.setVisibility(0);
                edVar.setAlpha(this.L0.getAlpha());
                edVar.setTranslationY(f12);
            }
            edVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f36589b;

                {
                    this.f36589b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f36589b;
                            float alpha2 = photoViewer.L0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = edVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.Q1) {
                                FrameLayout frameLayout = photoViewer.M7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35648a1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35657b1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35667c1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f36589b;
                            float alpha3 = photoViewer2.L0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = edVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.Q1) {
                                FrameLayout frameLayout2 = photoViewer2.M7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.L0.getTranslationY() - (photoViewer2.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35648a1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35657b1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35667c1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).start();
        } else if (!z10 && edVar.getTag() != null) {
            edVar.animate().translationY(f12).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f36589b;

                {
                    this.f36589b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f36589b;
                            float alpha2 = photoViewer.L0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = edVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.Q1) {
                                FrameLayout frameLayout = photoViewer.M7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35648a1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35657b1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35667c1.setTranslationY(photoViewer.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f36589b;
                            float alpha3 = photoViewer2.L0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = edVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.Q1) {
                                FrameLayout frameLayout2 = photoViewer2.M7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.L0.getTranslationY() - (photoViewer2.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35648a1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35657b1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35667c1.setTranslationY(photoViewer2.Q1.getAlpha() * (-j7.l1.d(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).withEndAction(new wg(3, edVar)).start();
        }
        if (z10) {
            num = 1;
        }
        edVar.setTag(num);
    }

    public final void W0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void W1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.B2 != null && this.P4 != null) {
                    int intValue = Utilities.parseInt((CharSequence) url).intValue();
                    if (this.B2.q() == -9223372036854775807L) {
                        this.W2 = intValue / ((float) this.P4.getDuration());
                        return;
                    }
                    long j10 = intValue * 1000;
                    this.B2.L(j10);
                    this.f35757m3.h(((float) j10) / ((float) this.B2.q()), true);
                    this.f35767n3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f35864y instanceof LaunchActivity) {
                    fy fyVar = new fy(null);
                    fyVar.f38305j2 = url;
                    ((LaunchActivity) this.f35864y).q0(fyVar, false, true);
                    G0(false, false);
                    return;
                }
                return;
            } else if (this.f35715h4 != null && ((clickableSpan instanceof org.telegram.ui.Components.c51) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.c5.q0(this.f35715h4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void W2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        xt0 xt0Var = this.d;
        boolean z14 = false;
        if (xt0Var != null && xt0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        xr0 xr0Var = this.Q1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(xr0Var, z13, z11, this.f35834u7);
        yr0 yr0Var = this.R1;
        if (z10 && z12) {
            z14 = true;
        }
        V2(yr0Var, z14, z11, this.f35843v7);
    }

    public final void X0(TLRPC.Document document, TLRPC.Document document2, boolean z10, Utilities.Callback2 callback2) {
        float f9;
        this.f35797q7 = document;
        this.f35789p7 = document2;
        this.f35806r7 = z10;
        this.f35816s7 = false;
        this.f35825t7 = callback2;
        this.X5 = 0.0f;
        this.f35662b6 = 0.0f;
        if (this.f35751l5 != null) {
            jt0 jt0Var = this.f35832u5;
            if (jt0Var != null) {
                jt0Var.m(false, false);
            }
            this.f35751l5.b();
            ArrayList arrayList = this.f35769n5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f35797q7 != null) {
            ArrayList arrayList2 = this.f35769n5;
            if (arrayList2 == null) {
                this.f35769n5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f35797q7, Integer.valueOf(this.P));
            if (findStickerEmoticons != null) {
                this.f35769n5.addAll(findStickerEmoticons);
            }
        }
        jt0 jt0Var2 = this.f35787p5;
        if (jt0Var2 != null) {
            jt0Var2.setCutOutState(false);
        }
        a3(true, false);
        ImageView imageView = this.Y0;
        if (imageView != null) {
            if (this.f35806r7) {
                f9 = 0.4f;
            } else {
                f9 = 1.0f;
            }
            imageView.setAlpha(f9);
        }
    }

    public final void X1(zt0 zt0Var) {
        if (this.f35793q2) {
            n2(true);
        }
        MessageObject messageObject = this.P4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.P).cancelLoadFile(this.P4.getDocument());
        }
        this.f35682e = false;
        this.f35692f = false;
        this.f35668c2 = false;
        this.f35777o4 = true;
        this.P4 = null;
        this.U4 = null;
        this.V4 = null;
        this.W4 = null;
        this.X4 = null;
        this.f35688e5 = null;
        this.f35651a5 = null;
        this.f35756m2 = null;
        VideoAds videoAds = this.Q4;
        if (videoAds != null) {
            videoAds.stop();
            this.Q4 = null;
        }
        if (this.f35686e3 != null) {
            P2(false, false);
        }
        xs0 xs0Var = this.P1;
        if (xs0Var != null) {
            xs0Var.scrollTo(0, 0);
        }
        this.Y1 = 0;
        this.Z1 = false;
        this.a2 = false;
        this.f35658b2 = false;
        this.f35675d2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f35698f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f35698f5 = null;
        }
        this.W1 = null;
        jf.r0 r0Var = this.X1;
        if (r0Var != null) {
            r0Var.destroy();
            this.X1 = null;
        }
        org.telegram.ui.Components.c6 c6Var = this.f35695f2;
        if (c6Var != null) {
            c6Var.w(this.f35647a0);
            this.f35695f2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            vt0 vt0Var = this.S0[i10];
            if (vt0Var != null) {
                vt0Var.d(-1, false, true);
            }
        }
        p2(0);
        ur0 ur0Var = this.N7;
        if (ur0Var != null) {
            ur0Var.a();
        }
        this.f35730j1.e(0, false);
        this.f35869y4.setImageBitmap((Bitmap) null);
        this.B4.a();
        this.x4.setImageBitmap((Bitmap) null);
        this.A4.a();
        this.f35877z4.setImageBitmap((Bitmap) null);
        this.C4.a();
        this.f35647a0.post(new iq0(this, zt0Var, 0));
        xt0 xt0Var = this.d;
        if (xt0Var != null) {
            xt0Var.G();
        }
        org.telegram.ui.Components.t30 t30Var = this.f35712h1;
        t30Var.d.clear();
        t30Var.f32855e.clear();
        t30Var.f32854c.clear();
        xt0 xt0Var2 = this.d;
        if (xt0Var2 != null) {
            xt0Var2.D();
        }
        this.d = null;
        this.l1.l();
        this.f35700f7 = null;
        this.f35777o4 = false;
        this.f35737j8 = 0.0f;
        this.f35746k8 = 1.0f;
        if (zt0Var != null) {
            zt0Var.f45316a.setVisible(true, true);
        }
        tn tnVar = this.f35715h4;
        if (tnVar != null) {
            tnVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.K4;
        if (bitmap != null) {
            bitmap.recycle();
            this.K4 = null;
        }
    }

    public final void X2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X2(boolean, boolean):void");
    }

    public final void Y1(org.telegram.messenger.MessageObject r23, org.telegram.tgnet.TLRPC.FileLocation r24, org.telegram.messenger.ImageLocation r25, org.telegram.messenger.ImageLocation r26, java.util.ArrayList r27, java.util.ArrayList r28, java.util.List r29, int r30, org.telegram.ui.zt0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.zt0):void");
    }

    public final void Y2(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        float f17;
        float f18;
        int i11;
        TextureView textureView;
        if (z10 && this.D3 && this.E3 && !this.B3 && (textureView = this.f35858x2) != null) {
            this.K4 = textureView.getBitmap();
        }
        if (z10) {
            this.V7 = this.T7;
        }
        AnimatorSet animatorSet = this.P7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.P7 = new AnimatorSet();
        float f19 = 0.0f;
        if (z10) {
            if (this.O4) {
                this.f35693f0.setVisibility(0);
                View view = this.f35693f0;
                if (this.Y1 == 11) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                view.setAlpha(f18);
                View view2 = this.f35693f0;
                if (this.Y1 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.J7.setTag(1);
            AnimatorSet animatorSet2 = this.P7;
            bg.u1 u1Var = this.L0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.Q1.getEditTextHeight() + u1Var.getHeight();
            if (this.f35765n1) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var, property, 0.0f, editTextHeight + i10);
            bg.u1 u1Var2 = this.L0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u1Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.O0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f35693f0;
            if (this.O4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f17, 1.0f));
        } else {
            this.J7.setTag(null);
            AnimatorSet animatorSet3 = this.P7;
            bu0 bu0Var = this.J7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bu0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.K7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f35693f0;
            Property property4 = View.ALPHA;
            if (this.O4) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f9));
        }
        this.P7.addListener(new ps0(this, z10, 3));
        this.P7.setDuration(200L);
        this.P7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.P7.start();
        float f20 = 0.25f;
        if (this.f35648a1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f35648a1.animate();
            if (z10) {
                f14 = 0.25f;
            } else {
                f14 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f14);
            if (z10) {
                f15 = 0.25f;
            } else {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
            if (z10) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            scaleY.alpha(f16).setDuration(200L);
        }
        if (this.f35657b1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f35657b1.animate();
            if (z10) {
                f11 = 0.25f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f11);
            if (z10) {
                f12 = 0.25f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f12);
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            scaleY2.alpha(f13).setDuration(200L);
        }
        if (this.f35667c1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f35667c1.animate();
            if (z10) {
                f10 = 0.25f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator scaleX3 = animate3.scaleX(f10);
            if (!z10) {
                f20 = 1.0f;
            }
            ViewPropertyAnimator scaleY3 = scaleX3.scaleY(f20);
            if (!z10) {
                f19 = 1.0f;
            }
            scaleY3.alpha(f19).setDuration(200L);
        }
    }

    public final boolean Z1(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z1(android.view.MotionEvent):boolean");
    }

    public final void Z2() {
        long a2;
        if (this.f35864y != null) {
            tn tnVar = this.f35715h4;
            if (tnVar != null) {
                a2 = tnVar.a();
            } else {
                xt0 xt0Var = this.d;
                if (xt0Var != null) {
                    a2 = xt0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a2;
            org.telegram.ui.Components.c5.K(this.f35864y, j10, -1L, 0, false, new oq0(this), null, new org.telegram.ui.Components.a5(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false)), null);
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.L8 = pVar;
        this.N8 = false;
        if (this.f35666c0 != null) {
            ((WindowManager) this.f35864y.getSystemService("window")).addView(this.f35666c0, this.Z);
            this.f35666c0.invalidate();
        }
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            x61Var.V(null);
            this.B2.W(null);
            this.B2.D();
            TextureView textureView = this.f35858x2;
            if (textureView != null) {
                this.B2.W(textureView);
                return;
            }
            SurfaceView surfaceView = this.f35867y2;
            if (surfaceView != null) {
                this.B2.V(surfaceView);
            }
        }
    }

    @Override
    public final void a1() {
        D1();
    }

    public final void a2(ArrayList arrayList, int i10, long j10, long j11, long j12, xt0 xt0Var) {
        e2((MessageObject) arrayList.get(i10), null, null, null, arrayList, null, null, i10, xt0Var, null, j10, j11, j12, true, null, null);
    }

    public final void a3(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        Integer num2;
        boolean z13;
        boolean z14;
        float f9;
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        boolean z15 = true;
        Integer num3 = 1;
        int i13 = 8;
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (!z11) {
            this.f35751l5.animate().setListener(null).cancel();
            bg.u3 u3Var = this.f35751l5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u3Var.setVisibility(i11);
            this.f35751l5.setAlpha(this.L0.getAlpha());
            this.f35778o5.animate().setListener(null).cancel();
            lh.z2 z2Var = this.f35778o5;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            z2Var.setVisibility(i12);
            lh.z2 z2Var2 = this.f35778o5;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            z2Var2.setAlpha(f11);
        } else if (z10 && this.f35751l5.getTag() == null) {
            this.f35751l5.animate().setListener(null).cancel();
            this.f35778o5.animate().setListener(null).cancel();
            if (this.f35751l5.getVisibility() != 0) {
                this.f35751l5.setVisibility(0);
                this.f35751l5.animate().alpha(1.0f).start();
                this.f35778o5.setVisibility(0);
                this.f35778o5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f35751l5.getTag() != null) {
            this.f35751l5.animate().setListener(null).cancel();
            this.f35751l5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.z9(this.f35751l5)).start();
            this.f35778o5.animate().setListener(null).cancel();
            this.f35778o5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.z9(this.f35778o5)).start();
        }
        bg.u3 u3Var2 = this.f35751l5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        u3Var2.setTag(num);
        if (z10 && this.f35787p5.f2267f0 != 1 && !this.f35806r7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f35787p5.animate().setListener(null).cancel();
            jt0 jt0Var = this.f35787p5;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jt0Var.setVisibility(i10);
            jt0 jt0Var2 = this.f35787p5;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            jt0Var2.setAlpha(f10);
        } else if (z12 && this.f35787p5.getTag() == null) {
            this.f35787p5.animate().setListener(null).cancel();
            if (this.f35787p5.getVisibility() != 0) {
                this.f35787p5.setVisibility(0);
            }
            this.f35787p5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f35787p5.getTag() != null) {
            this.f35787p5.animate().setListener(null).cancel();
            this.f35787p5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.z9(this.f35787p5)).start();
        }
        jt0 jt0Var3 = this.f35787p5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        jt0Var3.setTag(num2);
        if (z10 && this.f35787p5.f2267f0 == 1 && !this.f35806r7) {
            z13 = true;
        } else {
            z13 = false;
        }
        X2(z13, z11);
        bg.u3 u3Var3 = this.f35751l5;
        if (z10 && this.f35787p5.f2267f0 == 1 && this.f35832u5.f39688l0 && !this.f35805r5.f39688l0 && !this.f35814s5.f39688l0) {
            z14 = true;
        } else {
            z14 = false;
        }
        u3Var3.setOutlineVisible(z14);
        z15 = (!z10 || this.f35787p5.f2267f0 != 1 || this.f35805r5.f39688l0 || this.f35814s5.f39688l0) ? false : false;
        if (!z11) {
            this.f35832u5.animate().setListener(null).cancel();
            jt0 jt0Var4 = this.f35832u5;
            if (z15) {
                i13 = 0;
            }
            jt0Var4.setVisibility(i13);
            jt0 jt0Var5 = this.f35832u5;
            if (z15) {
                f12 = 1.0f;
            }
            jt0Var5.setAlpha(f12);
            jt0 jt0Var6 = this.f35832u5;
            if (z15) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            jt0Var6.setScaleX(f9);
            jt0 jt0Var7 = this.f35832u5;
            if (!z15) {
                f13 = 0.8f;
            }
            jt0Var7.setScaleY(f13);
        } else if (z15 && this.f35832u5.getTag() == null) {
            this.f35832u5.animate().setListener(null).cancel();
            if (this.f35832u5.getVisibility() != 0) {
                this.f35832u5.setVisibility(0);
            }
            b.q(this.f35832u5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.jr.h, 400L);
        } else if (!z15 && this.f35832u5.getTag() != null) {
            this.f35832u5.animate().setListener(null).cancel();
            b.q(this.f35832u5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.z9(this.f35832u5)), org.telegram.ui.Components.jr.h, 400L);
        }
        jt0 jt0Var8 = this.f35832u5;
        if (!z15) {
            num3 = null;
        }
        jt0Var8.setTag(num3);
    }

    @Override
    public final Bitmap b() {
        TextureView textureView = this.M8;
        if (textureView != null && textureView.isAvailable()) {
            return this.M8.getBitmap();
        }
        return null;
    }

    public final int b1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.Y1 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final void b2(ArrayList arrayList, int i10, xt0 xt0Var) {
        e2(null, null, null, null, null, arrayList, null, i10, xt0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3(boolean z10) {
        Integer num;
        float f9;
        float f10;
        et0 et0Var;
        if (!z10 || this.f35776o3.getTag() == null) {
            if (!z10 && this.f35776o3.getTag() == null) {
                return;
            }
            if (z10 && !this.f35776o3.f27696s && ((et0Var = this.f35656b0) == null || !et0Var.f30680x || et0Var.v.isEmpty())) {
                this.f35794q3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f35785p3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            is0 is0Var = this.f35776o3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            is0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35785p3 = animatorSet2;
            is0 is0Var2 = this.f35776o3;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(is0Var2, property, f9);
            is0 is0Var3 = this.f35776o3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(is0Var3, property2, f10);
            is0 is0Var4 = this.f35776o3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f12 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(is0Var4, property3, f12);
            is0 is0Var5 = this.f35776o3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(is0Var5, property4, f11));
            this.f35785p3.setDuration(380L);
            this.f35785p3.setInterpolator(org.telegram.ui.Components.jr.h);
            this.f35785p3.addListener(new es0(this, 1));
            this.f35785p3.start();
        }
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final int c1(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.Y1 != 1)) {
                if (i10 == 3 && this.H1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f35808s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return this.H1.getAdditionalTop() + dp + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f35808s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i11;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f35808s) {
                    i11 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i11;
            }
        }
        return 0;
    }

    public final void c2(MessageObject messageObject, tn tnVar, long j10, long j11, long j12, pt0 pt0Var) {
        e2(messageObject, null, null, null, null, null, null, 0, pt0Var, tnVar, j10, j11, j12, true, null, null);
    }

    public final void c3(boolean z10, boolean z11) {
        int i10;
        Integer num = null;
        if (!z11) {
            this.M7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.M7;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            this.N7.setTranslationY(0.0f);
            this.M7.setAlpha(this.L0.getAlpha());
        } else if (z10 && this.M7.getTag() == null) {
            if (this.M7.getVisibility() != 0) {
                this.M7.setVisibility(0);
                this.M7.setAlpha(this.L0.getAlpha());
                this.N7.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.f35853w7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f35853w7.cancel();
            }
            ur0 ur0Var = this.N7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ur0Var, View.TRANSLATION_Y, ur0Var.getTranslationY(), 0.0f);
            this.f35853w7 = ofFloat;
            ofFloat.setDuration(220L);
            this.f35853w7.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f35853w7.start();
        } else if (!z10 && this.M7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.f35853w7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.f35853w7.cancel();
            }
            ur0 ur0Var2 = this.N7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ur0Var2, View.TRANSLATION_Y, ur0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.f35853w7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.z9(this.M7));
            this.f35853w7.setDuration(220L);
            this.f35853w7.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f35853w7.start();
        }
        FrameLayout frameLayout2 = this.M7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.M7.setTranslationY(this.L0.getTranslationY() - (this.Q1.getAlpha() * j7.l1.d(46.0f, this.Q1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.M7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final Bitmap d() {
        TextureView textureView = this.f35858x2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.f35875z2 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmaps.createBitmap(this.f35867y2.getWidth(), this.f35867y2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(this.f35867y2, createBitmap);
            return createBitmap;
        }
        return null;
    }

    public final int d1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(boolean):int");
    }

    public final void d2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, pt0 pt0Var) {
        e2(null, fileLocation, imageLocation, null, null, null, null, 0, pt0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void d3() {
        org.telegram.ui.Components.x61 x61Var;
        if (this.f35765n1 && (x61Var = this.B2) != null && !x61Var.z()) {
            if (!this.f35799r || this.Y1 == 1) {
                this.B2.X(0.0f);
            }
            this.D2 = false;
            q3();
        }
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void e(c2.p pVar) {
        if (org.telegram.ui.Components.bg0.f27076l0.L) {
            org.telegram.ui.Components.bg0.j(false);
        }
        this.L8 = pVar;
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            x61Var.V(null);
            this.B2.W(null);
            this.B2.D();
            this.B2.W(this.M8);
        }
        ((WindowManager) this.f35864y.getSystemService("window")).removeView(this.f35666c0);
        this.N8 = true;
        this.f35666c0.invalidate();
    }

    public final ClippingImageView[] e1(zt0 zt0Var) {
        int i10;
        if (!AndroidUtilities.isTablet() && zt0Var != null && zt0Var.f45326m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f35673d0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = zt0Var.f45326m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(zt0Var.f45327n);
        }
        return clippingImageViewArr;
    }

    public final boolean e2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.xt0 r25, org.telegram.ui.tn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.tt0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.xt0, org.telegram.ui.tn, long, long, long, boolean, org.telegram.ui.tt0, java.lang.Integer):boolean");
    }

    public final void e3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3(int):void");
    }

    @Override
    public final void f(Canvas canvas) {
        this.O8 = true;
        this.f35666c0.draw(canvas);
        this.O8 = false;
    }

    public final org.telegram.ui.Components.ed f1() {
        xt0 xt0Var = this.d;
        if (xt0Var != null && xt0Var.A()) {
            return this.R1;
        }
        return this.Q1;
    }

    public final void f2(ArrayList arrayList, int i10, int i11, boolean z10, xt0 xt0Var, tn tnVar) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var;
        this.f35675d2 = z10;
        org.telegram.ui.Components.hp0 hp0Var = this.O0;
        int i12 = 0;
        if (hp0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hp0Var.getLayoutParams();
            if (i11 != 4 && i11 != 5) {
                if (i11 != 13 && i11 != 14 && i11 != 1 && i11 != 3 && i11 != 10 && i11 != 11) {
                    this.O0.setResourceId(R.drawable.send_plane_24);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                } else {
                    this.O0.setResourceId(R.drawable.floating_check);
                    this.O0.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                }
            } else {
                this.O0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            }
            this.O0.setLayoutParams(layoutParams);
        }
        if (i11 != 11 && this.f35751l5 != null) {
            this.f35806r7 = false;
            ImageView imageView = this.Y0;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            jt0 jt0Var = this.f35832u5;
            if (jt0Var != null) {
                jt0Var.m(false, false);
            }
            this.f35751l5.b();
            ArrayList arrayList2 = this.f35769n5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f35682e;
        BackgroundDrawable backgroundDrawable = this.H0;
        if (z12 && this.Y1 != i11 && i11 == 1) {
            this.Y1 = i11;
            this.f35793q2 = false;
            this.I.c("");
            this.I.a("", false);
            this.d = xt0Var;
            this.E5 = 0L;
            this.A5 = 0L;
            this.l1.l();
            this.f35700f7 = null;
            if (this.Q6 == null) {
                this.Q6 = VelocityTracker.obtain();
            }
            this.f35682e = true;
            this.f35692f = true;
            p3(false, false);
            this.f35713h2 = false;
            H0();
            j3(false, false);
            this.f35649a3 = 0.0f;
            this.R2 = false;
            this.Q2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f35647a0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
            E1();
            z2();
        } else if (z12 && this.Y1 != i11 && i11 == 11) {
            this.Y1 = i11;
            this.f35793q2 = false;
            this.I.c("");
            this.I.a("", false);
            this.d = xt0Var;
            this.E5 = 0L;
            this.A5 = 0L;
            this.l1.l();
            this.f35700f7 = null;
            if (this.Q6 == null) {
                this.Q6 = VelocityTracker.obtain();
            }
            this.f35682e = true;
            this.f35692f = true;
            p3(false, false);
            this.f35649a3 = 0.0f;
            this.R2 = false;
            this.Q2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f35647a0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.Y1 = i11;
            if (i11 == 12) {
                this.Y1 = 0;
                this.Z1 = true;
            }
            int i13 = this.Y1;
            if (i13 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35658b2 = z11;
            if (i13 == 13 || z11) {
                this.Y1 = 0;
                this.a2 = true;
            }
            this.f35646a.a(z11, false);
            if (this.Y1 == 11) {
                this.f35693f0.setBackgroundColor(-16777216);
            }
            wt0 wt0Var = this.I;
            if (wt0Var != null && (o6Var = wt0Var.d) != null) {
                if (this.a2) {
                    i12 = 8;
                }
                o6Var.setVisibility(i12);
            }
            e2(null, null, null, null, null, null, arrayList, i10, xt0Var, tnVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void f3(int i10, boolean z10) {
        if (this.P4 != null) {
            n2(false);
            FileLoader.getInstance(this.P).cancelLoadFile(this.P4.getDocument());
        } else if (this.f35688e5 != null) {
            TLObject d = this.f35700f7.d(this.L4);
            if (d instanceof TLRPC.Document) {
                n2(false);
                FileLoader.getInstance(this.P).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.t30 t30Var = this.f35712h1;
        if (t30Var != null) {
            t30Var.setAnimateBackground(true);
        }
        this.U2 = false;
        C2(this.L4 + i10, z10, true, false);
        if (R2(this.P4) || Q2(this.L4)) {
            this.U2 = true;
            T1(true);
            B0(0, true);
        }
        z0();
        try {
            d1.f.b(0);
            if (ze.b.H().L()) {
                ze.b.H().V(m1());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f35800r0;
        if (g1Var != null && g1Var.isEnabled() && this.L3) {
            return true;
        }
        return false;
    }

    public final Bitmap.CompressFormat g1() {
        if (this.Y1 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void g2() {
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            x61Var.C();
            return;
        }
        et0 et0Var = this.f35656b0;
        if (et0Var != null) {
            et0Var.f();
        }
    }

    public final void g3() {
        float f9;
        boolean z10;
        int i10;
        ws0 ws0Var;
        int i11;
        ws0 ws0Var2;
        this.f35760m6 = null;
        this.L0.setVisibility(8);
        this.O0.setVisibility(8);
        this.f35729j0.setVisibility(8);
        this.f35648a1.setVisibility(8);
        this.f35657b1.setVisibility(8);
        this.f35667c1.setVisibility(8);
        org.telegram.ui.Components.pe0 pe0Var = this.f35866y1;
        if (pe0Var != null) {
            pe0Var.setVisibility(4);
        }
        this.f35739k1.setVisibility(8);
        this.f35739k1.setAlpha(0.0f);
        this.f35739k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.K0.setRotationX(0.0f);
        this.f35739k1.setEnabled(false);
        this.G = false;
        if (this.f35685e2) {
            this.M1.setVisibility(4);
        }
        int i12 = this.Y1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.f35671c7.size() > 1)) {
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            s3();
        }
        W2(false, true);
        a3(false, true);
        Bitmap bitmap = this.f35869y4.getBitmap();
        float f10 = this.W5;
        if (this.Y1 == 11) {
            this.f35689e6 = this.U5;
            this.f35679d6 = this.T5;
            this.f35699f6 = f10;
            this.f35708g6 = this.X5;
            this.f35662b6 = 0.0f;
        }
        ot0 ot0Var = this.T4;
        if (bitmap != null) {
            int bitmapWidth = this.f35869y4.getBitmapWidth();
            int bitmapHeight = this.f35869y4.getBitmapHeight();
            if (this.Y1 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.Z5 = dp;
                f9 = 0.0f;
                if (this.H1 != null) {
                    this.Z5 = (ws0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i13 = this.f35874z1.f49917i;
                if (i13 == 90 || i13 == 270) {
                    i11 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f11 = bitmapWidth;
                    float f12 = i11;
                    this.f35652a6 = r2(false) * (Math.min(k1(3) / f11, h1(3, false) / f12) / Math.min(k1(this.f35795q4) / f11, i1() / f12));
                    Rect rect = this.f35775o2;
                    this.Y5 = (rect.left / 2) - (rect.right / 2);
                    this.f35735j6 = System.currentTimeMillis();
                    this.N6 = true;
                }
                i11 = bitmapHeight;
                float f112 = bitmapWidth;
                float f122 = i11;
                this.f35652a6 = r2(false) * (Math.min(k1(3) / f112, h1(3, false) / f122) / Math.min(k1(this.f35795q4) / f112, i1() / f122));
                Rect rect2 = this.f35775o2;
                this.Y5 = (rect2.left / 2) - (rect2.right / 2);
                this.f35735j6 = System.currentTimeMillis();
                this.N6 = true;
            } else {
                f9 = 0.0f;
                int i14 = -AndroidUtilities.dp(44.0f);
                if (!this.f35808s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                float f13 = i14 + i10;
                this.Z5 = f13;
                if (this.H1 != null) {
                    float additionalTop = (ws0Var.getAdditionalTop() / 2.0f) + f13;
                    this.Z5 = additionalTop;
                    this.Z5 = additionalTop - (this.H1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = ot0Var.f41222c;
                if (cropState != null) {
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                    i11 = (int) (bitmapHeight * cropState.cropPh);
                    float f1122 = bitmapWidth;
                    float f1222 = i11;
                    this.f35652a6 = r2(false) * (Math.min(k1(3) / f1122, h1(3, false) / f1222) / Math.min(k1(this.f35795q4) / f1122, i1() / f1222));
                    Rect rect22 = this.f35775o2;
                    this.Y5 = (rect22.left / 2) - (rect22.right / 2);
                    this.f35735j6 = System.currentTimeMillis();
                    this.N6 = true;
                }
                i11 = bitmapHeight;
                float f11222 = bitmapWidth;
                float f12222 = i11;
                this.f35652a6 = r2(false) * (Math.min(k1(3) / f11222, h1(3, false) / f12222) / Math.min(k1(this.f35795q4) / f11222, i1() / f12222));
                Rect rect222 = this.f35775o2;
                this.Y5 = (rect222.left / 2) - (rect222.right / 2);
                this.f35735j6 = System.currentTimeMillis();
                this.N6 = true;
            }
        } else {
            f9 = 0.0f;
        }
        ws0 ws0Var3 = this.H1;
        if (ws0Var3 != null) {
            if (this.Y1 == 11 && (ot0Var == null || ot0Var.f41222c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            ws0Var3.setDrawShadow(z10);
        }
        this.f35666c0.setClipChildren(true);
        this.f35693f0.setVisibility(4);
        this.f35752l6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f9);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f9);
        ofFloat.addUpdateListener(new fq0(this, 6));
        ofFloat2.addUpdateListener(new fq0(this, 7));
        this.f35752l6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.H1.n0(true);
        this.f35752l6.setDuration(200L);
        this.f35752l6.addListener(new es0(this, 3));
        this.f35752l6.start();
    }

    public float getAnimationValue() {
        return this.f35717h6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f35864y);
        this.M8 = textureView;
        textureView.setOpaque(false);
        View view = this.K8;
        if (view != null) {
            view.bringToFront();
        }
        return this.M8;
    }

    public final int h1(int i10, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f35808s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f35775o2.bottom) + AndroidUtilities.displaySize.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.Y1 != 1 && !z11) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f35647a0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.Y1 == 1) || i10 == 1) {
            return measuredHeight - AndroidUtilities.dp(144.0f);
        }
        if (i10 == 2) {
            return measuredHeight - AndroidUtilities.dp(214.0f);
        }
        if (i10 == 3) {
            return measuredHeight - (this.H1.getAdditionalTop() + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.H1.getAdditionalBottom() + AndroidUtilities.dp(48.0f))));
        }
        return measuredHeight;
    }

    public final void h2() {
        af.g gVar = this.C2;
        if (gVar != null) {
            gVar.b(true);
        }
        if (org.telegram.ui.Components.bg0.p() != null) {
            org.telegram.ui.Components.bg0.p().b(true);
        }
    }

    public final void h3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3():void");
    }

    public final boolean i() {
        if (!this.O8 && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap) {
            return true;
        }
        return false;
    }

    public final int i1() {
        return h1(this.f35795q4, false);
    }

    public final void i2() {
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            x61Var.D();
            return;
        }
        et0 et0Var = this.f35656b0;
        if (et0Var != null) {
            et0Var.g();
        }
    }

    public final void i3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        o5.q e10;
        o5.q e11;
        float f9;
        int i10;
        o5.q e12;
        boolean z10;
        if (!Q1()) {
            return;
        }
        this.J8 = true;
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            if (!d1.f.u() && !this.f35799r) {
                z10 = false;
            } else {
                z10 = true;
            }
            x61Var.P(z10);
        }
        if (this.B2 != null && d1.f.u() && ((atomicInteger = d1.f.f5263b) == null || atomicInteger.get() <= 0)) {
            q5.h e13 = d1.f.e();
            if (e13 == null) {
                a2 = -1;
            } else {
                a2 = e13.a();
            }
            if (a2 >= 0 && Math.abs(this.B2.o() - a2) > 1000) {
                this.B2.L(a2);
            }
            q5.h e14 = d1.f.e();
            if (e14 == null) {
                m10 = false;
            } else if (d1.f.f5262a == 0) {
                m10 = !e14.l();
            } else {
                m10 = e14.m();
            }
            if (m10) {
                this.B2.D();
            } else {
                this.B2.C();
            }
            if (this.A != null) {
                float g10 = d1.f.g();
                q5.h e15 = d1.f.e();
                float f10 = 0.5f;
                if (e15 == null || (e11 = e15.e()) == null) {
                    f9 = 0.5f;
                } else {
                    f9 = (float) e11.f19318r;
                }
                if (Math.abs(g10 - f9) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.A.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = audioManager.getStreamMinVolume(3);
                    } else {
                        i10 = 0;
                    }
                    float f11 = streamMaxVolume - i10;
                    q5.h e16 = d1.f.e();
                    if (e16 != null && (e12 = e16.e()) != null) {
                        f10 = (float) e12.f19318r;
                    }
                    int i11 = i10 + ((int) (f10 * f11));
                    if (i11 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i11, 1);
                    }
                }
            }
            q5.h e17 = d1.f.e();
            float f12 = 1.0f;
            if (e17 != null && (e10 = e17.e()) != null) {
                f12 = (float) e10.d;
            }
            D0(true, false, f12);
        }
        nr nrVar = this.f35809s0;
        if (nrVar != null) {
            nrVar.a(d1.f.u());
        }
        this.J8 = false;
    }

    public final void j0(float f9, float f10, float f11, boolean z10) {
        if (this.W5 == f9 && this.T5 == f10 && this.U5 == f11) {
            return;
        }
        this.N6 = z10;
        this.f35652a6 = f9;
        this.Y5 = f10;
        this.Z5 = f11;
        this.f35735j6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35752l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f));
        this.f35752l6.setInterpolator(this.f35788p6);
        this.f35752l6.setDuration(250);
        this.f35752l6.addListener(new es0(this, 7));
        this.f35752l6.start();
    }

    public final int j1() {
        return k1(this.f35795q4);
    }

    public final void j3(boolean z10, boolean z11) {
        k3(z10, z11, ht0.f39046e);
    }

    public final CharSequence k0() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        if (Q1() && this.d != null && (i10 = this.L4) >= 0) {
            ArrayList arrayList = this.f35671c7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                CharSequence text = f1().getText();
                boolean z10 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f35753l7 && !TextUtils.equals(this.f35761m7, text) && this.d.R(this.L4) != 0 && this.d.H() > 0) {
                    this.f35753l7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.P);
                tn tnVar = this.f35715h4;
                if (tnVar == null || ((encryptedChat = tnVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z10 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10);
                CharSequence charSequence = charSequenceArr[0];
                this.f35761m7 = charSequence;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    photoEntry.caption = charSequence;
                    photoEntry.entities = entities;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    searchImage.caption = charSequence;
                    searchImage.entities = entities;
                }
                if (text.length() != 0 && !this.d.x(this.L4)) {
                    M2();
                }
                xt0 xt0Var = this.d;
                if (xt0Var != null) {
                    xt0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int k1(int i10) {
        int dp;
        int width = this.f35647a0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.Y1 != 1)) {
            if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 3) {
                dp = AndroidUtilities.dp(28.0f);
            } else {
                return width;
            }
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        return width - dp;
    }

    public final void k2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.MediaController.SavedFilterState r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.MediaController$SavedFilterState, boolean, long):void");
    }

    public final void k3(boolean r17, boolean r18, org.telegram.ui.ht0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3(boolean, boolean, org.telegram.ui.ht0):void");
    }

    public final void l0(android.graphics.Canvas r24, int r25, int r26, int r27, int r28, float r29, wf.f r30, org.telegram.messenger.MediaController.CropState r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l0(android.graphics.Canvas, int, int, int, int, float, wf.f, org.telegram.messenger.MediaController$CropState):void");
    }

    public final float l1(boolean z10) {
        int bitmapWidth;
        int bitmapHeight;
        int i10;
        ImageReceiver imageReceiver = this.f35869y4;
        if (z10) {
            bitmapWidth = imageReceiver.getBitmapHeight();
        } else {
            bitmapWidth = imageReceiver.getBitmapWidth();
        }
        if (z10) {
            bitmapHeight = this.f35869y4.getBitmapWidth();
        } else {
            bitmapHeight = this.f35869y4.getBitmapHeight();
        }
        if (!this.f35808s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.f35866y1.getMeasuredWidth(), (this.f35866y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i10) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void l2() {
        bg.u3 u3Var = this.f35751l5;
        if (u3Var != null && this.Y1 == 11) {
            if (this.f35806r7) {
                u3Var.b();
            } else {
                u3Var.m(this.f35869y4.getBitmap(), this.f35869y4.getOrientation(), k1(this.f35795q4), i1(), new mq0(this, 0));
            }
        }
    }

    public final void l3(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        bg.u1 u1Var = this.L0;
        Property property = View.ALPHA;
        float f17 = 1.0f;
        float f18 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u1Var, property, f9));
        bg.u1 u1Var2 = this.L0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(u1Var2, property2, f10));
        bg.u3 u3Var = this.f35751l5;
        if (u3Var != null) {
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u3Var, property, f16));
        }
        if (this.f35751l5 != null) {
            lh.z2 z2Var = this.f35778o5;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(z2Var, property, f15));
        }
        org.telegram.ui.Components.hp0 hp0Var = this.O0;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(hp0Var, property, f11));
        org.telegram.ui.Components.hp0 hp0Var2 = this.O0;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(hp0Var2, property2, f12));
        int i10 = this.Y1;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.J0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f13));
            CheckBox checkBox2 = this.J0;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f14));
            CounterView counterView = this.K0;
            if (!z10) {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f17));
            CounterView counterView2 = this.K0;
            if (!z10) {
                f18 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f18));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z10 && H1()) {
            E0(true);
            nh.g gVar = this.Q1.f18076f;
            if (gVar.f26885e) {
                gVar.k(true);
            }
            nh.g gVar2 = this.R1.f18076f;
            if (gVar2.f26885e) {
                gVar2.k(true);
            }
            this.Q1.f18076f.d();
            this.R1.f18076f.d();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m0():void");
    }

    public final ze.g m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m1():ze.g");
    }

    public final void m2(String str, long j10, boolean z10, float f9, float f10, int i10, long j11) {
        boolean z11;
        int parseInt;
        if (this.f35817s8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f35817s8);
            this.f35817s8 = null;
        }
        ur0 ur0Var = this.N7;
        ur0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        ur0Var.f29108y = mediaMetadataRetriever;
        boolean z12 = true;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ur0Var.f29106w = z11;
        ur0Var.d = f9;
        ur0Var.f29101e = f10;
        float f11 = ur0Var.f29105s;
        if (f11 < f9) {
            ur0Var.f29105s = f9;
        } else if (f11 > f10) {
            ur0Var.f29105s = f10;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                ur0Var.f29107x = open;
                ur0Var.f29108y.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = ur0Var.f29108y.extractMetadata(9);
            if (extractMetadata != null) {
                ur0Var.f29097a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = ur0Var.f29108y.extractMetadata(18);
            if (extractMetadata2 != null) {
                ur0Var.f29099b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = ur0Var.f29108y.extractMetadata(19);
            if (extractMetadata3 != null) {
                ur0Var.f29100c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = ur0Var.f29108y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = ur0Var.f29099b;
                ur0Var.f29099b = ur0Var.f29100c;
                ur0Var.f29100c = i12;
            }
            if (ur0Var.f29106w) {
                ur0Var.f29102f = (float) ((j11 / 1000.0d) / ur0Var.f29097a);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ur0Var.invalidate();
        this.f35826t8 = null;
        if (!z10 && this.Y1 != 1) {
            z12 = false;
        }
        this.f35799r = z12;
        this.U7 = -1;
        this.W7 = 0;
        this.f35691e8 = 25;
        this.f35790p8 = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ft0 ft0Var = new ft0(this, str, j10, i10);
        this.f35817s8 = ft0Var;
        dispatchQueue.postRunnable(ft0Var);
    }

    public final void m3(boolean z10, boolean z11) {
        float f9;
        gq0 gq0Var = this.f35855x;
        AndroidUtilities.cancelRunOnUIThread(gq0Var);
        int i10 = 0;
        if (z11) {
            n3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f35845w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f35845w = null;
                }
                if (this.N3) {
                    this.N3 = false;
                    n3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(gq0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f35845w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                n3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f35845w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f35845w = null;
        }
        fd fdVar = this.T0;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        fdVar.setAlpha(f9);
        fd fdVar2 = this.T0;
        if (!z10) {
            i10 = 4;
        }
        fdVar2.setVisibility(i10);
    }

    public final void n0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0(android.graphics.Bitmap):void");
    }

    public final org.telegram.messenger.VideoEditedInfo n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void n2(boolean z10) {
        int i10 = 0;
        this.f35875z2 = false;
        af.g gVar = this.C2;
        if (gVar != null) {
            gVar.c();
            this.C2 = null;
        }
        org.telegram.ui.Components.x61 x61Var = this.B2;
        HashMap hashMap = R8;
        wr0 wr0Var = this.f35820t2;
        if (x61Var != null) {
            u0();
            AndroidUtilities.cancelRunOnUIThread(this.f35811s2);
            AndroidUtilities.cancelRunOnUIThread(wr0Var);
            if (this.Y2 != null) {
                float o10 = ((float) this.B2.o()) / ((float) this.B2.q());
                String str = this.Y2;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new du0(o10));
                MessageObject messageObject = this.P4;
                if (messageObject != null) {
                    messageObject.cachedSavedTimestamp = Float.valueOf(o10);
                }
            }
            this.B2.I();
            this.B2 = null;
        } else {
            this.T2 = false;
        }
        if (this.f35656b0 != null) {
            AndroidUtilities.cancelRunOnUIThread(wr0Var);
            if (this.Y2 != null) {
                float o12 = ((float) o1()) / ((float) A1());
                String str2 = this.Y2;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new du0(o12));
                MessageObject messageObject2 = this.P4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(o12);
                }
            }
        }
        js0 js0Var = this.S3;
        if (js0Var != null) {
            js0Var.disable();
            this.S3 = null;
        }
        this.f35776o3.a();
        m3(false, false);
        this.f35766n2 = false;
        this.Q2 = false;
        if (this.f35800r0.isEnabled()) {
            this.f35800r0.setEnabled(false);
            this.f35800r0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f35676d3) {
            try {
                this.f35864y.getWindow().clearFlags(128);
                this.f35676d3 = false;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        os0 os0Var = this.f35829u2;
        if (os0Var != null) {
            try {
                this.f35647a0.removeView(os0Var);
            } catch (Throwable unused) {
            }
            this.f35829u2 = null;
        }
        s0();
        this.f35838v2 = null;
        TextureView textureView = this.f35858x2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.l61) {
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) textureView;
                org.telegram.ui.Components.qz qzVar = l61Var.f30235b;
                if (qzVar != null) {
                    qzVar.postRunnable(new org.telegram.ui.Components.nz(qzVar, 0));
                }
                l61Var.f30234a = null;
            }
            this.f35858x2 = null;
        }
        this.X.e();
        if (this.f35867y2 != null) {
            this.f35867y2 = null;
        }
        if (this.L3) {
            this.L3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f35677d4);
        }
        if (!z10 && !this.f35854w8 && !this.f35863x8) {
            P2(false, true);
        }
        vt0 vt0Var = this.S0[0];
        while (true) {
            float[] fArr = vt0Var.f43744n;
            if (i10 < fArr.length) {
                vt0Var.f43743m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                vt0Var.a();
                return;
            }
        }
    }

    public final void n3(boolean z10) {
        float f9;
        if (z10) {
            this.T0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35845w = animatorSet;
        fd fdVar = this.T0;
        Property property = View.ALPHA;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(fdVar, property, f9));
        this.f35845w.setDuration(200L);
        this.f35845w.addListener(new ps0(this, z10, 1));
        this.f35845w.start();
    }

    public final void o0(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        MediaController.CropState cropState;
        if (this.f35752l6 != null) {
            f13 = AndroidUtilities.lerp(0.0f, this.c6, this.f35717h6);
            f9 = AndroidUtilities.lerp(this.W5, this.f35652a6, this.f35717h6);
            f10 = AndroidUtilities.lerp(this.X5, this.f35662b6, this.f35717h6);
            f11 = AndroidUtilities.lerp(this.U5, this.Z5, this.f35717h6);
            f12 = AndroidUtilities.lerp(this.T5, this.Y5, this.f35717h6);
        } else {
            f9 = this.W5;
            f10 = this.X5;
            f11 = this.U5;
            f12 = this.T5;
            if (this.f35735j6 != 0) {
                f12 = this.Y5;
                f11 = this.Z5;
                f9 = this.f35652a6;
            }
            f13 = 0.0f;
        }
        int k12 = k1(this.f35795q4);
        int i12 = i1();
        canvas.translate(b1(this.f35795q4), c1(this.f35795q4));
        canvas.translate(f12, f11 + 0.0f);
        canvas.scale(f9, f9);
        canvas.rotate(f10);
        int bitmapWidth = this.f35869y4.getBitmapWidth();
        int bitmapHeight = this.f35869y4.getBitmapHeight();
        float f17 = k12;
        float f18 = bitmapWidth;
        float f19 = f17 / f18;
        float f20 = i12;
        float f21 = bitmapHeight;
        float f22 = f20 / f21;
        float min = Math.min(f19, f22);
        wf.f fVar = this.f35874z1;
        int i10 = fVar.f49917i;
        if (i10 != 90 && i10 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f23 = fVar.f49918j;
        float f24 = fVar.f49919k;
        float f25 = bitmapHeight;
        float f26 = bitmapWidth;
        float f27 = f9;
        float f28 = (int) ((((1.0f - f23) * 0.0f) + f23) * f25);
        float f29 = f17 / f28;
        float f30 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        if (f29 * f30 > f20) {
            f29 = f20 / f30;
        }
        int i11 = this.Y1;
        float f31 = f29;
        ot0 ot0Var = this.T4;
        if (i11 != 1 && ((this.f35795q4 != 1 || this.f35744k6 == 0) && ot0Var.f41222c != null)) {
            float f32 = f28 * f31;
            float f33 = f30 * f31;
            if (f19 * f21 > f20) {
                f19 = f22;
            }
            float z10 = com.google.android.recaptcha.internal.a.z((f18 * f19) / f27, f32, 0.0f, f32);
            float z11 = com.google.android.recaptcha.internal.a.z((f21 * f19) / f27, f33, 0.0f, f33);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.Y1 == 1 || fVar.f49911a) {
            TextureView textureView = this.f35858x2;
            if (textureView != null) {
                MediaController.CropState cropState2 = ot0Var.f41222c;
                if (cropState2 != null && cropState2.mirrored) {
                    f15 = -1.0f;
                } else {
                    f15 = 1.0f;
                }
                textureView.setScaleX(f15);
                qt0 qt0Var = this.A2;
                if (qt0Var != null) {
                    qt0Var.setScaleX(this.f35858x2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = ot0Var.f41222c;
            if (cropState3 != null) {
                f14 = cropState3.cropScale;
            } else {
                f14 = 1.0f;
            }
            float z12 = ((f31 / min) / com.google.android.recaptcha.internal.a.z(f14, 1.0f, 0.0f, 1.0f)) * f14;
            canvas.translate(fVar.d * 1.0f, fVar.f49914e * 1.0f);
            canvas.scale(z12, z12);
            canvas.translate(com.google.android.recaptcha.internal.a.C(fVar.f49912b, f25, min, 1.0f), com.google.android.recaptcha.internal.a.C(fVar.f49913c, f26, min, 1.0f));
            float f34 = fVar.f49916g + i10;
            if (f34 > 180.0f) {
                f34 -= 360.0f;
            }
            canvas.rotate(f34);
        }
        if (!this.f35671c7.isEmpty() && (cropState = ot0Var.f41222c) != null && cropState.mirrored) {
            f16 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f16 = 1.0f;
        }
        if (f13 > 0.0f) {
            canvas.scale(f16 - (2.0f * f13), f16);
            canvas.skew(0.0f, org.telegram.messenger.x3.y(f16, f13, 4.0f * f13, 0.25f));
        }
    }

    public final long o1() {
        et0 et0Var = this.f35656b0;
        if (et0Var != null && et0Var.f30680x) {
            return et0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.o();
    }

    public final void o2() {
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.customStickerCreated);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.mediaCountDidLoad);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.replaceMessagesObjects);
        NotificationCenter.getInstance(this.P).removeObserver(this, NotificationCenter.dialogDeleted);
        ConnectionsManager.getInstance(this.P).cancelRequestsForGuid(this.f35665c);
    }

    public final void o3(boolean z10) {
        float f9;
        float f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i10 = this.Y1;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.J0;
            Property property = View.ALPHA;
            float f11 = 1.0f;
            float f12 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f9));
            CheckBox checkBox2 = this.J0;
            Property property2 = View.TRANSLATION_Y;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f10));
            CounterView counterView = this.K0;
            if (!z10) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f11));
            CounterView counterView2 = this.K0;
            if (!z10) {
                f12 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f12));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.K6 && this.J0.getVisibility() != 0) {
            boolean[] zArr = this.f35810s1;
            if (!zArr[0] && !zArr[1]) {
                float x4 = motionEvent.getX();
                int min = Math.min(135, this.f35647a0.getMeasuredWidth() / 8);
                if (x4 < min) {
                    if (this.x4.hasImageSet()) {
                        zArr[0] = true;
                        this.f35647a0.invalidate();
                        return false;
                    }
                } else if (x4 > this.f35647a0.getMeasuredWidth() - min && this.f35877z4.hasImageSet()) {
                    zArr[1] = true;
                    this.f35647a0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        if (this.W5 != 1.0f && this.Y1 != 11) {
            this.R6.abortAnimation();
            this.R6.fling(Math.round(this.T5), Math.round(this.U5), Math.round(f9), Math.round(f10), (int) this.A6, (int) this.B6, (int) this.C6, (int) this.D6);
            this.f35647a0.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override
    public final boolean onSingleTapUp(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final Size p0() {
        float f9;
        int i10;
        int round;
        int i11;
        if (this.U7 == 1) {
            return new Size(this.X7, this.Y7);
        }
        int i12 = this.T7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    f9 = 1920.0f;
                } else {
                    f9 = 1280.0f;
                }
            } else {
                f9 = 854.0f;
            }
        } else {
            f9 = 480.0f;
        }
        if (this.X7 > this.Y7) {
            i10 = this.X7;
        } else {
            i10 = this.Y7;
        }
        float f10 = f9 / i10;
        if (this.T7 == this.U7 - 1 && f10 >= 1.0f) {
            i11 = this.X7;
            round = this.Y7;
        } else {
            int round2 = Math.round((this.X7 * f10) / 2.0f) * 2;
            round = Math.round((this.Y7 * f10) / 2.0f) * 2;
            i11 = round2;
        }
        int i13 = i11 % 4;
        if (i13 != 0 || round % 4 != 0) {
            i11 = (i11 - i13) - (round % 4);
        }
        return new Size(i11, round);
    }

    public final TLObject p1(int i10, long[] jArr) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f35653a7;
        if (!arrayList.isEmpty()) {
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
            }
            return (TLObject) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.W6;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.Y6;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.X6;
            if (arrayList4.get(i10) == null) {
                return null;
            }
            return ((ImageLocation) arrayList4.get(i10)).location;
        }
        ArrayList arrayList5 = this.U6;
        if (arrayList5.isEmpty() || i10 >= arrayList5.size()) {
            return null;
        }
        MessageObject messageObject = (MessageObject) arrayList5.get(i10);
        TLRPC.Message message = messageObject.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null) {
                if (jArr != null) {
                    long j10 = closestPhotoSizeWithSize.size;
                    jArr[0] = j10;
                    if (j10 == 0) {
                        jArr[0] = -1;
                    }
                }
                return closestPhotoSizeWithSize;
            } else if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if (jArr != null) {
                        long j11 = closestPhotoSizeWithSize2.size;
                        jArr[0] = j11;
                        if (j11 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize2;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), false, null, true);
                    if (closestPhotoSizeWithSize3 != null) {
                        if (jArr != null) {
                            long j12 = closestPhotoSizeWithSize3.size;
                            jArr[0] = j12;
                            if (j12 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return closestPhotoSizeWithSize3;
                    } else if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(true), false, null, true);
                if (closestPhotoSizeWithSize4 != null) {
                    if (jArr != null) {
                        long j13 = closestPhotoSizeWithSize4.size;
                        jArr[0] = j13;
                        if (j13 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize4;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).photo;
            } else {
                if (messageObject.getDocument() != null && MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.getDocument().thumbs, 90);
                    if (jArr != null) {
                        long j14 = closestPhotoSizeWithSize5.size;
                        jArr[0] = j14;
                        if (j14 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize5;
                }
            }
        }
        return null;
    }

    public final void p2(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f35826t8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f35826t8);
        }
        if (this.f35863x8 && !this.f35835u8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35863x8 = false;
        this.f35844v8 = false;
        this.L7.setVisibility(4);
        if (i10 == 1) {
            if (this.f35654a8 == this.Y7 && this.Z7 == this.X7) {
                this.f35835u8 = false;
                vt0 vt0Var = this.S0[0];
                if (vt0Var.h != 0 && vt0Var.f43741k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                vt0Var.f(0.0f, z12);
                this.S0[0].d(3, false, true);
                if (!z10) {
                    k2(this.R4, this.S4, false, false, this.T4.d, false, 0L);
                    this.B2.L(this.N7.getLeftProgress() * this.f35681d8);
                } else {
                    this.f35844v8 = true;
                }
            } else {
                n2(false);
                if (this.f35826t8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f22413id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.A5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f35826t8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f35826t8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f35826t8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.W7;
                    videoEditedInfo.originalWidth = this.X7;
                    this.f35826t8.videoEditedInfo.originalHeight = this.Y7;
                    VideoEditedInfo videoEditedInfo2 = this.f35826t8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f35691e8;
                    Uri uri = this.S4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f35826t8.videoEditedInfo;
                long j10 = this.f35719h8;
                videoEditedInfo3.startTime = j10;
                long j11 = this.f35728i8;
                videoEditedInfo3.endTime = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f35681d8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    videoEditedInfo3.endTime = j10 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f35664b8;
                this.f35826t8.videoEditedInfo.resultWidth = this.Z7;
                this.f35826t8.videoEditedInfo.resultHeight = this.f35654a8;
                VideoEditedInfo videoEditedInfo4 = this.f35826t8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f35681d8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f35826t8, true, true, true)) {
                    this.f35835u8 = true;
                }
                this.f35863x8 = true;
                vt0 vt0Var2 = this.S0[0];
                if (vt0Var2.h != 0 && vt0Var2.f43741k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                vt0Var2.f(0.0f, z11);
                this.S0[0].d(0, false, true);
            }
        } else {
            this.f35835u8 = false;
            this.S0[0].d(3, false, true);
            if (i10 == 2) {
                k2(this.R4, this.S4, false, false, this.T4.d, false, 0L);
                this.B2.L(this.N7.getLeftProgress() * this.f35681d8);
            }
        }
        this.f35647a0.invalidate();
    }

    public final void p3(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (z10 != this.G) {
            if (z10) {
                this.f35739k1.setVisibility(0);
            }
            this.G = z10;
            this.f35739k1.setEnabled(z10);
            float f13 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                fu0 fu0Var = this.f35739k1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(fu0Var, property, f11));
                fu0 fu0Var2 = this.f35739k1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(fu0Var2, property2, f12));
                CounterView counterView = this.K0;
                Property property3 = View.ROTATION_X;
                if (!z10) {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f13));
                AnimatorSet animatorSet = new AnimatorSet();
                this.f35857x1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z10) {
                    this.f35857x1.addListener(new es0(this, 4));
                }
                this.f35857x1.setDuration(200L);
                this.f35857x1.start();
                return;
            }
            fu0 fu0Var3 = this.f35739k1;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fu0Var3.setAlpha(f9);
            fu0 fu0Var4 = this.f35739k1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(10.0f);
            }
            fu0Var4.setTranslationY(f10);
            CounterView counterView2 = this.K0;
            if (!z10) {
                f13 = 0.0f;
            }
            counterView2.setRotationX(f13);
            if (!z10) {
                this.f35739k1.setVisibility(8);
            }
        }
    }

    public final boolean q0(MotionEvent motionEvent) {
        boolean z10;
        et0 et0Var;
        if (this.B2 != null || ((et0Var = this.f35656b0) != null && et0Var.f30680x)) {
            if (motionEvent.getX() >= (k1(this.f35795q4) / 3) * 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            long o12 = o1();
            long A1 = A1();
            if (o12 != -9223372036854775807L && A1 > 15000 && (!z10 || A1 - o12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final float q2() {
        return r2(true);
    }

    public final void q3() {
        boolean z10;
        org.telegram.ui.Components.x61 x61Var;
        org.telegram.ui.Components.x61 x61Var2;
        et0 et0Var;
        org.telegram.ui.Components.x61 x61Var3 = this.B2;
        if (x61Var3 == null && ((et0Var = this.f35656b0) == null || !et0Var.f30680x)) {
            return;
        }
        if (x61Var3 != null) {
            z10 = this.L3;
        } else {
            z10 = this.f35656b0.C;
        }
        u0();
        AndroidUtilities.cancelRunOnUIThread(this.f35820t2);
        if (z10) {
            g2();
        } else {
            if (this.f35765n1) {
                if (Math.abs(this.N7.getProgress() - this.N7.getRightProgress()) < 0.01f || ((x61Var2 = this.B2) != null && x61Var2.o() == this.B2.q())) {
                    u2(this.N7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f35757m3.c() - this.N7.getRightProgress()) < 0.01f || ((x61Var = this.B2) != null && x61Var.o() == this.B2.q())) {
                    u2(0.0f);
                }
                s2();
            }
            i2();
        }
        this.f35647a0.invalidate();
    }

    public final boolean r0() {
        tn tnVar = this.f35715h4;
        if (tnVar != null) {
            if (tnVar.f42801f == null) {
                TLRPC.Chat chat = tnVar.f42787e;
                if (chat != null && !ChatObject.isNotInChat(chat)) {
                    if (ChatObject.canSendPhoto(this.f35715h4.f42787e) || ChatObject.canSendVideo(this.f35715h4.f42787e)) {
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

    public final String r1(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f35653a7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(secureDocument.secureFile.dc_id);
                    sb2.append("_");
                    return a4.w.p(sb2, secureDocument.secureFile.f22527id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.W6;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.U6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.f35671c7;
                if (!arrayList4.isEmpty()) {
                    if (i10 < arrayList4.size()) {
                        Object obj = arrayList4.get(i10);
                        if (obj instanceof MediaController.SearchImage) {
                            return ((MediaController.SearchImage) obj).getAttachName();
                        }
                        if (obj instanceof TLRPC.BotInlineResult) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                            TLRPC.Document document = botInlineResult.document;
                            if (document != null) {
                                return FileLoader.getAttachFileName(document);
                            }
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                return FileLoader.getAttachFileName(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize()));
                            }
                            if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Utilities.MD5(botInlineResult.content.url));
                                sb3.append(".");
                                TLRPC.WebDocument webDocument = botInlineResult.content;
                                sb3.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                                return sb3.toString();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                tt0 tt0Var = this.f35700f7;
                if (tt0Var != null) {
                    return tt0Var.c(i10);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i10 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i10);
                    ImageLocation imageLocation2 = (ImageLocation) this.X6.get(i10);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(imageLocation2.location.volume_id);
                            sb4.append("_");
                            return a4.w.l(imageLocation2.location.local_id, ".mp4", sb4);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(imageLocation.location.volume_id);
                        sb5.append("_");
                        return a4.w.l(imageLocation.location.local_id, ".jpg", sb5);
                    }
                    return null;
                }
                return null;
            } else if (i10 >= arrayList3.size()) {
                return null;
            } else {
                return FileLoader.getMessageFileName(((MessageObject) arrayList3.get(i10)).messageOwner);
            }
        }
        return null;
    }

    public final float r2(boolean z10) {
        int i10;
        if (this.Y1 == 11) {
            int k12 = k1(this.f35795q4);
            if (k12 == 0) {
                k12 = AndroidUtilities.displaySize.x;
            }
            float C = b.C(20.0f, k12, 1) / k12;
            if (z10) {
                int bitmapWidth = this.f35869y4.getBitmapWidth();
                int bitmapHeight = this.f35869y4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i10 = this.L4) >= 0) {
                    ArrayList arrayList = this.f35671c7;
                    if (i10 < arrayList.size()) {
                        Object obj = arrayList.get(this.L4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if ((photoEntry.orientation / 90) % 2 != 0) {
                                bitmapWidth = photoEntry.height;
                                bitmapHeight = photoEntry.width;
                            } else {
                                bitmapWidth = photoEntry.width;
                                bitmapHeight = photoEntry.height;
                            }
                        }
                    }
                }
                if (bitmapWidth > 1 && bitmapHeight > 1 && bitmapWidth > bitmapHeight) {
                    return (bitmapWidth / bitmapHeight) * C;
                }
            }
            return C;
        }
        return 1.0f;
    }

    public final void r3() {
        View view = this.P3;
        if (view != null) {
            vt0 vt0Var = this.S0[0];
            int i10 = vt0Var.h;
            if (vt0Var.f43746p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
                if (i10 == 3) {
                    view.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                } else if (i10 == 2) {
                    view.setContentDescription(LocaleController.getString("AccActionDownload", R.string.AccActionDownload));
                } else if (i10 == 1) {
                    view.setContentDescription(LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload));
                } else {
                    view.setContentDescription(LocaleController.getString("AccActionPause", R.string.AccActionPause));
                }
                this.P3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void s0() {
        AnimatorSet animatorSet;
        View view = this.f35838v2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f35838v2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.f35848w2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f35848w2 = null;
        }
        org.telegram.ui.Components.pe0 pe0Var = this.f35866y1;
        if (pe0Var != null && (animatorSet = pe0Var.f31663s) != null) {
            animatorSet.cancel();
            pe0Var.f31663s = null;
            pe0Var.f31660f = false;
        }
    }

    public final ImageLocation s1(int i10, long[] jArr) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f35653a7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
                    }
                    return ImageLocation.getForSecureDocument((SecureDocument) arrayList.get(i10));
                }
            } else {
                ArrayList arrayList2 = this.W6;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.Y6;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (ImageLocation) this.X6.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.U6;
                    if (!arrayList4.isEmpty() && i10 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i10);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                if (closestPhotoSizeWithSize != null) {
                                    if (jArr != null) {
                                        long j10 = closestPhotoSizeWithSize.size;
                                        jArr[0] = j10;
                                        if (j10 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return ImageLocation.getForDocument(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), false, null, true);
                                    if (closestPhotoSizeWithSize2 != null) {
                                        if (jArr != null) {
                                            long j11 = closestPhotoSizeWithSize2.size;
                                            jArr[0] = j11;
                                            if (j11 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                                if (messageObject.isGif()) {
                                    return ImageLocation.getForDocument(messageObject.getDocument());
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(true), false, null, true);
                                if (closestPhotoSizeWithSize3 != null) {
                                    if (jArr != null) {
                                        long j12 = closestPhotoSizeWithSize3.size;
                                        jArr[0] = j12;
                                        if (j12 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                                return ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).webPhoto));
                            } else {
                                if (messageObject.getDocument() != null) {
                                    TLRPC.Document document2 = messageObject.getDocument();
                                    if (this.f35870y5 == 5) {
                                        return ImageLocation.getForDocument(document2);
                                    }
                                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90);
                                        if (jArr != null) {
                                            long j13 = closestPhotoSizeWithSize4.size;
                                            jArr[0] = j13;
                                            if (j13 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return ImageLocation.getForDocument(closestPhotoSizeWithSize4, document2);
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

    public final void s2() {
        if (!G1()) {
            MessageObject messageObject = this.P4;
            if (messageObject == null || !messageObject.isSponsored()) {
                wr0 wr0Var = this.f35820t2;
                AndroidUtilities.cancelRunOnUIThread(wr0Var);
                AndroidUtilities.runOnUIThread(wr0Var, 3000);
            }
        }
    }

    public final void s3() {
        if (this.f35846w0 != null && this.I != null) {
            float f9 = 0.0f;
            for (int i10 = 0; i10 < this.f35846w0.getChildCount(); i10++) {
                View childAt = this.f35846w0.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f9 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f9;
                }
            }
            CheckBox checkBox = this.J0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f9 = Math.max(f9, AndroidUtilities.dp(48.0f));
            }
            CounterView counterView = this.K0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f9 = Math.max(f9, AndroidUtilities.dp(100.0f));
            }
            wt0 wt0Var = this.I;
            ValueAnimator valueAnimator = wt0Var.f44379n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wt0Var.f44379n = null;
            }
            wt0Var.f44380r = f9;
            wt0Var.f44376c[0].setRightPadding((int) f9);
            wt0Var.d.setRightPadding(f9);
        }
    }

    public void setAnimationValue(float f9) {
        this.f35717h6 = f9;
        this.f35647a0.invalidate();
        F1();
    }

    public final void t0() {
        if (this.Y1 == 11) {
            jt0 jt0Var = this.f35787p5;
            if (jt0Var.f2267f0 == 2) {
                jt0Var.setCutOutState(true);
                X2(true, true);
                this.f35751l5.f();
                this.f35647a0.invalidate();
            }
        }
    }

    public final void t2(long j10) {
        et0 et0Var = this.f35656b0;
        if (et0Var != null && et0Var.f30680x) {
            et0Var.i(j10);
        } else {
            org.telegram.ui.Components.x61 x61Var = this.B2;
            if (x61Var != null) {
                x61Var.L(j10);
            }
        }
        C3();
    }

    public final void t3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f35753l7) {
            charSequence = this.f35761m7;
        } else if (obj instanceof MediaController.PhotoEntry) {
            charSequence = ((MediaController.PhotoEntry) obj).caption;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof MediaController.SearchImage)) {
            charSequence = ((MediaController.SearchImage) obj).caption;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            f1().setText("");
        } else {
            f1().setText(org.telegram.ui.Components.y5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.st editText = f1().f18076f.getEditText();
        tn tnVar = this.f35715h4;
        if (tnVar != null && ((encryptedChat = tnVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void u0() {
        Runnable runnable = this.E2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.E2 = null;
        }
    }

    public final int u1() {
        return this.f35775o2.left;
    }

    public final void u2(float f9) {
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            x61Var.L(f9 * ((float) x61Var.q()));
            return;
        }
        et0 et0Var = this.f35656b0;
        if (et0Var != null) {
            et0Var.i(f9 * et0Var.getVideoDuration());
        }
    }

    public final void u3() {
        int i10 = org.telegram.ui.ActionBar.g6.f23459zf;
        int z12 = z1(i10);
        org.telegram.ui.Components.hp0 hp0Var = this.O0;
        if (hp0Var != null) {
            hp0Var.k();
            this.O0.invalidate();
        }
        CheckBox checkBox = this.J0;
        if (checkBox != null) {
            checkBox.c(z1(i10), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(z12, mode);
        ImageView imageView = this.U0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.U0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.V0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.V0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.Y0;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.X0;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.X0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.W0;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.W0.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Components.of0 of0Var = this.Q0;
        if (of0Var != null) {
            of0Var.f31343b.setTextColor(z12);
        }
        org.telegram.ui.Components.of0 of0Var2 = this.K7;
        if (of0Var2 != null) {
            of0Var2.f31343b.setTextColor(z12);
        }
        ws0 ws0Var = this.H1;
        if (ws0Var != null) {
            ws0Var.e();
        }
        org.telegram.ui.Components.ef0 ef0Var = this.E1;
        if (ef0Var != null) {
            ImageView imageView6 = ef0Var.f28054x0;
            ImageView imageView7 = ef0Var.f28052w0;
            ImageView imageView8 = ef0Var.f28050v0;
            org.telegram.ui.ActionBar.c6 c6Var = ef0Var.E0;
            TextView textView = ef0Var.f28027c0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
            }
            ef0Var.h();
        }
        xr0 xr0Var = this.Q1;
        if (xr0Var != null) {
            xr0Var.H(this.f35802r2);
        }
        yr0 yr0Var = this.R1;
        if (yr0Var != null) {
            yr0Var.H(this.f35802r2);
        }
        ur0 ur0Var = this.N7;
        if (ur0Var != null) {
            ur0Var.invalidate();
        }
        fu0 fu0Var = this.f35739k1;
        if (fu0Var != null) {
            int childCount = fu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f35739k1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    ((org.telegram.ui.Cells.x5) childAt).f25922c.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
                }
            }
        }
        nr0 nr0Var = this.Q3;
        if (nr0Var != null) {
            nr0Var.z0(true);
        }
    }

    public final void v0() {
        float f9;
        org.telegram.ui.ActionBar.a0 a0Var = this.f35846w0;
        if (a0Var != null) {
            if (this.f35658b2) {
                f9 = -AndroidUtilities.dp(4.0f);
            } else {
                f9 = 0.0f;
            }
            a0Var.setTranslationX(f9);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.A0;
        if (w0Var != null) {
            I2(w0Var, this.f35658b2, false);
        }
        boolean z10 = this.a2;
        if (z10 && this.E == null) {
            ng.d c3 = this.U.c(this.C, null, false);
            c3.n(pg.a.i(this.f35802r2));
            c3.p(AndroidUtilities.dp(20.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = rg.c.f47423a;
            this.E = new org.telegram.ui.ActionBar.s5(dp, dp2, c3);
        }
        if (z10) {
            i7.h6.a(this.C);
            this.C.setBackground(this.E);
            return;
        }
        this.C.setStateListAnimator(null);
        this.C.setBackground(this.D);
    }

    public final TLRPC.Document v1() {
        int i10;
        if (this.T5 == 0.0f && this.U5 == 0.0f && (i10 = this.L4) >= 0) {
            ArrayList arrayList = this.f35671c7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f35797q7;
                }
            }
        }
        return null;
    }

    public final int v2() {
        if (this.f35790p8 > 1048576000) {
            return this.U7 - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i10 = this.U7;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = globalMainSettings.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        return Math.min(2, Math.round(DownloadController.getInstance(this.P).getMaxVideoBitrate() / (100.0f / i10)) - 1);
    }

    public final void v3(boolean z10) {
        rt0 rt0Var;
        int i10;
        if (this.Y1 != 1 && (rt0Var = this.f35647a0) != null) {
            if (!z10) {
                if (rt0Var.getPaddingLeft() <= 0 && this.f35647a0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f35647a0.setSystemUiVisibility(i10);
        }
    }

    public final boolean w0() {
        if (this.f35733j4 != 0) {
            F1();
            if (Math.abs(this.f35742k4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f35750l4;
                if (runnable != null) {
                    runnable.run();
                    this.f35750l4 = null;
                }
                this.f35733j4 = 0;
            }
        }
        if (this.f35733j4 == 0) {
            return false;
        }
        return true;
    }

    public final RenderNode w1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j10;
        if (this.F8 == null) {
            renderNode = null;
        } else {
            renderNode = this.G8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = lg.e.a(AndroidUtilities.dp(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a2, a2, Shader.TileMode.CLAMP));
                this.G8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.F8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.F8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.F8.getWidth(), ceil2 / this.F8.getHeight());
                beginRecording.drawRenderNode(this.F8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        g.x xVar = this.H8;
        xVar.f6955a = 0L;
        xVar.f6956b = false;
        for (float f9 : colorMatrix.getArray()) {
            xVar.c(f9);
        }
        xVar.a(0L);
        if (xVar.f6956b) {
            j10 = -1;
        } else {
            j10 = xVar.f6955a;
        }
        RenderNode renderNode2 = (RenderNode) this.I8.f(j10);
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

    public final void w2(final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12, boolean z13) {
        long j10;
        VideoEditedInfo videoEditedInfo;
        String str;
        float f9;
        char c3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        MediaController.CropState cropState;
        MediaController.CropState cropState2;
        TLRPC.Chat chat;
        boolean z14;
        int i12;
        tn tnVar;
        org.telegram.ui.Components.q40 q40Var;
        String str2;
        long j11;
        String string;
        TextureView textureView;
        if (!H1() && this.d != null && !this.f35793q2) {
            if (this.Y1 == 1) {
                if (!z13 && (q40Var = this.f35740k2) != null) {
                    TLObject tLObject = q40Var.f31852a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j12 = user.f22539id;
                        str2 = str3;
                        j11 = j12;
                    } else {
                        str2 = "";
                        j11 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35647a0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.R0 = dp;
                    Context context = this.f35647a0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f37063a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f37064b = imageReceiver2;
                    org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    view.f37066e = new Path();
                    int i13 = UserConfig.selectedAccount;
                    e9Var.m(i13, UserConfig.getInstance(i13).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), e9Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), e9Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f37067f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f35740k2.f31852a;
                    rt0 rt0Var = this.f35647a0;
                    org.telegram.ui.Components.pe0 pe0Var = this.f35866y1;
                    e9Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, e9Var);
                    view.f37065c = rt0Var;
                    view.d = pe0Var;
                    c2Var.R = view;
                    if (this.f35740k2.f31854c == 1) {
                        if (UserConfig.getInstance(this.P).clientUserId == j11) {
                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage));
                        } else {
                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2));
                        }
                        if (this.E4) {
                            string = LocaleController.getString("SetVideo", R.string.SetVideo);
                        } else {
                            string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                        }
                    } else {
                        if (this.E4) {
                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2));
                        } else {
                            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2));
                        }
                        string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                    }
                    String str4 = string;
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.xo0(26));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                            Drawable[] drawableArr = PhotoViewer.P8;
                            PhotoViewer.this.w2(z10, i10, i11, z11, z12, true);
                        }
                    });
                    c2Var.E = org.telegram.ui.ActionBar.g6.f23286pg;
                    c2Var.P0 = true;
                    c2Var.i(i0.a.k(-15461356, 204));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
                    c2Var.setOnDismissListener(new as0(this));
                    if (this.f35765n1 && (textureView = this.f35858x2) != null) {
                        try {
                            this.f35876z3 = textureView.getBitmap();
                            ImageView imageView = this.A3;
                            if (imageView != null) {
                                this.f35829u2.removeView(imageView);
                                this.A3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.f35858x2.getContext());
                            this.A3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.f35876z3));
                            this.f35829u2.addView(this.A3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.f35868y3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.f35868y3 = null;
                            }
                            FileLog.e(th2);
                            return;
                        }
                    }
                    return;
                }
                m0();
            }
            if (!z11 && (tnVar = this.f35715h4) != null) {
                TLRPC.Chat chat2 = tnVar.f42787e;
                if (tnVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.P).edit().putBoolean("silent_" + this.f35715h4.a(), !z10).commit();
                }
            }
            VideoEditedInfo n12 = n1();
            ArrayList arrayList = this.f35671c7;
            if (!arrayList.isEmpty() && (i12 = this.L4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = n12;
                }
            }
            tn tnVar2 = this.f35715h4;
            if (tnVar2 != null && (chat = tnVar2.f42787e) != null) {
                if (!this.f35765n1 && n12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.x3.s(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.tc(this.f35647a0, this.f35802r2), null);
                    return;
                } else if (!z14 && !ChatObject.canSendPhoto(this.f35715h4.f42787e)) {
                    org.telegram.messenger.x3.s(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.tc(this.f35647a0, this.f35802r2), null);
                    return;
                }
            }
            this.f35793q2 = true;
            if (n12 != null) {
                long j13 = ((float) n12.estimatedSize) * 0.9f;
                if ((j13 > 2097152000 && !UserConfig.getInstance(this.P).isPremium()) || j13 > 4194304000L) {
                    if (this.W1 != null) {
                        org.telegram.ui.Components.ni niVar = this.W1;
                        new cg.v0(6, UserConfig.selectedAccount, niVar.getContainer().getContext(), niVar.f30990b0, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.Y1 == 11) {
                    Object obj2 = arrayList.get(this.L4);
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int k12 = k1(this.f35795q4);
                        i1();
                        float dp2 = k12 - AndroidUtilities.dp(20.0f);
                        bg.u3 u3Var = this.f35751l5;
                        if (u3Var != null && u3Var.f2558e0 && u3Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f35751l5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f35869y4.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f35751l5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f35869y4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f35831u4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            canvas.translate((-this.f35869y4.getImageWidth()) / 2.0f, (-this.f35869y4.getImageHeight()) / 2.0f);
                            j10 = 0;
                            canvas.scale(this.f35869y4.getImageWidth() / this.f35831u4.getMeasuredWidth(), this.f35869y4.getImageHeight() / this.f35831u4.getMeasuredHeight());
                            this.f35831u4.f27057e = !B1();
                            this.f35831u4.draw(canvas);
                            this.f35831u4.f27057e = true;
                            canvas.restore();
                        } else {
                            j10 = 0;
                        }
                        if (B1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f17 = dp2 / 2.0f;
                            matrix.preTranslate(f17, f17);
                            if (this.f35752l6 != null) {
                                f14 = AndroidUtilities.lerp(0.0f, this.c6, this.f35717h6);
                                f10 = AndroidUtilities.lerp(this.W5, this.f35652a6, this.f35717h6);
                                f9 = 2.0f;
                                f11 = AndroidUtilities.lerp(this.X5, this.f35662b6, this.f35717h6);
                                c3 = 0;
                                f12 = AndroidUtilities.lerp(this.U5, this.Z5, this.f35717h6);
                                f13 = AndroidUtilities.lerp(this.T5, this.Y5, this.f35717h6);
                            } else {
                                f9 = 2.0f;
                                c3 = 0;
                                f10 = this.W5;
                                f11 = this.X5;
                                f12 = this.U5;
                                f13 = this.T5;
                                if (this.f35735j6 != j10) {
                                    f13 = this.Y5;
                                    f12 = this.Z5;
                                    f10 = this.f35652a6;
                                }
                                f14 = 0.0f;
                            }
                            int k13 = k1(this.f35795q4);
                            int i14 = i1();
                            matrix.preTranslate(f13, f12 + 0.0f);
                            matrix.preScale(f10, f10);
                            matrix.preRotate(f11);
                            int bitmapWidth = this.f35869y4.getBitmapWidth();
                            int bitmapHeight = this.f35869y4.getBitmapHeight();
                            float f18 = k13;
                            float f19 = i14;
                            float min = Math.min(f18 / bitmapWidth, f19 / bitmapHeight);
                            wf.f fVar = this.f35874z1;
                            int i15 = fVar.f49917i;
                            if (i15 != 90 && i15 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f20 = fVar.f49918j;
                            float f21 = fVar.f49919k;
                            float f22 = bitmapHeight;
                            float f23 = bitmapWidth;
                            float f24 = f18 / ((int) ((((1.0f - f20) * 0.0f) + f20) * f22));
                            float f25 = (int) ((((1.0f - f21) * 0.0f) + f21) * f23);
                            if (f24 * f25 > f19) {
                                f24 = f19 / f25;
                            }
                            int i16 = this.Y1;
                            ot0 ot0Var = this.T4;
                            if (i16 == 1 || fVar.f49911a) {
                                TextureView textureView2 = this.f35858x2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = ot0Var.f41222c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f16 = -1.0f;
                                    } else {
                                        f16 = 1.0f;
                                    }
                                    textureView2.setScaleX(f16);
                                    qt0 qt0Var = this.A2;
                                    if (qt0Var != null) {
                                        qt0Var.setScaleX(this.f35858x2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = ot0Var.f41222c;
                                if (cropState4 != null) {
                                    f15 = cropState4.cropScale;
                                } else {
                                    f15 = 1.0f;
                                }
                                float z15 = ((f24 / min) / com.google.android.recaptcha.internal.a.z(f15, 1.0f, 0.0f, 1.0f)) * f15;
                                matrix.preTranslate(fVar.d * 1.0f, fVar.f49914e * 1.0f);
                                matrix.preScale(z15, z15);
                                matrix.preTranslate(com.google.android.recaptcha.internal.a.C(fVar.f49912b, f22, min, 1.0f), com.google.android.recaptcha.internal.a.C(fVar.f49913c, f23, min, 1.0f));
                                float f26 = fVar.f49916g + i15;
                                if (f26 > 180.0f) {
                                    f26 -= 360.0f;
                                }
                                matrix.preRotate(f26);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = ot0Var.f41222c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f14 > 0.0f) {
                                matrix.preScale(1.0f - (f14 * f9), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.x3.y(1.0f, f14, 4.0f * f14, 0.25f));
                            }
                            matrix.preTranslate((-this.f35869y4.getImageWidth()) / f9, (-this.f35869y4.getImageHeight()) / f9);
                            matrix.preScale(this.f35869y4.getImageWidth(), this.f35869y4.getImageHeight());
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = photoEntry.mediaEntities;
                            int size = arrayList3.size();
                            String str5 = null;
                            int i17 = 0;
                            while (i17 < size) {
                                VideoEditedInfo.MediaEntity mediaEntity = arrayList3.get(i17);
                                i17++;
                                VideoEditedInfo.MediaEntity copy = mediaEntity.copy();
                                float f27 = copy.f19644x;
                                float f28 = copy.f19645y;
                                float f29 = copy.width + f27;
                                float f30 = copy.height + f28;
                                float f31 = dp2;
                                float[] fArr = new float[8];
                                fArr[c3] = f27;
                                fArr[1] = f28;
                                fArr[2] = f29;
                                fArr[3] = f28;
                                fArr[4] = f29;
                                fArr[5] = f30;
                                fArr[6] = f27;
                                fArr[7] = f30;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[c3] - fArr[2], 2.0d))) / f31;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[c3] - fArr[6], 2.0d))) / f31;
                                copy.height = sqrt;
                                copy.f19644x = (((fArr[c3] + fArr[4]) / f9) / f31) - (copy.width / f9);
                                copy.f19645y = (((fArr[1] + fArr[5]) / f9) / f31) - (sqrt / f9);
                                copy.scale = 1.0f;
                                copy.customTextView = true;
                                if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                    copy.rotation = (float) (copy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                                }
                                copy.rotation = (float) (copy.rotation - ((this.X5 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(copy);
                                TLRPC.Document document = copy.document;
                                if (document != null && str5 == null) {
                                    str5 = MessageObject.findAnimatedEmojiEmoticon(document, null);
                                }
                                dp2 = f31;
                                matrix = matrix2;
                            }
                            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                            videoEditedInfo2.isPhoto = true;
                            videoEditedInfo2.resultWidth = 512;
                            videoEditedInfo2.originalWidth = 512;
                            videoEditedInfo2.resultHeight = 512;
                            videoEditedInfo2.originalHeight = 512;
                            videoEditedInfo2.mediaEntities = arrayList2;
                            long clamp = Utilities.clamp(photoEntry.averageDuration, 2999L, 800L);
                            videoEditedInfo2.estimatedDuration = clamp;
                            videoEditedInfo2.originalDuration = clamp;
                            videoEditedInfo2.bitrate = 200000;
                            videoEditedInfo2.framerate = 30;
                            videoEditedInfo2.isSticker = true;
                            videoEditedInfo2.estimatedSize = 262144L;
                            videoEditedInfo = videoEditedInfo2;
                            str = str5;
                        } else {
                            videoEditedInfo = null;
                            str = null;
                        }
                        float f32 = 512;
                        String file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, Bitmap.CompressFormat.WEBP, f32, f32, 100, false, 101, 101), "webp", true).toString();
                        if (videoEditedInfo != null) {
                            videoEditedInfo.originalPath = file;
                        }
                        if (this.f35769n5 == null) {
                            this.f35769n5 = new ArrayList();
                        }
                        if (this.f35769n5.isEmpty()) {
                            String str6 = this.f35751l5.V;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f35769n5.add(this.f35751l5.V);
                            } else if (str != null) {
                                this.f35769n5.add(str);
                            } else {
                                this.f35769n5.add("👍");
                            }
                        }
                        this.f35793q2 = false;
                        ht q6 = ht.q();
                        bg.u3 u3Var2 = this.f35751l5;
                        ArrayList arrayList4 = this.f35769n5;
                        bs0 bs0Var = new bs0(this, file, videoEditedInfo, photoEntry, z10, i10, i11, z12);
                        dt dtVar = q6.U;
                        Activity findActivity = AndroidUtilities.findActivity(u3Var2.getContext());
                        if (findActivity != null) {
                            q6.w(findActivity);
                            q6.v(bs0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            q6.f39035o = arrayList4;
                            q6.t(null, importingSticker, null, null, null, 3, false, null, new lh.b(), 0);
                            AndroidUtilities.cancelRunOnUIThread(dtVar);
                            AndroidUtilities.runOnUIThread(dtVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.L4, n12, z10, i10, i11, z12);
            } else {
                this.d.L(n12);
            }
            if (this.K) {
                if (this.L) {
                    AndroidUtilities.runOnUIThread(new yq0(this, 0), 200L);
                } else {
                    G0(false, false);
                }
            }
        }
    }

    public final void w3(float f9) {
        int k12;
        int i12;
        boolean z10;
        View view;
        os0 os0Var = this.f35829u2;
        if (os0Var != null && os0Var.getVisibility() == 0 && this.D3) {
            if (this.f35875z2) {
                view = this.f35867y2;
            } else {
                view = this.f35858x2;
            }
            f9 *= Math.min(k1(this.f35795q4) / view.getMeasuredWidth(), i1() / view.getMeasuredHeight());
        }
        float imageWidth = this.f35869y4.getImageWidth();
        float imageHeight = this.f35869y4.getImageHeight();
        MediaController.CropState cropState = this.T4.f41222c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.Y1 == 11) {
            k12 = (int) (imageWidth * f9);
        } else {
            k12 = ((int) ((imageWidth * f9) - k1(this.f35795q4))) / 2;
        }
        if (this.Y1 == 11) {
            i12 = (int) (imageHeight * f9);
        } else {
            i12 = ((int) ((imageHeight * f9) - i1())) / 2;
        }
        float f10 = 0.0f;
        if (k12 > 0) {
            this.A6 = -k12;
            this.B6 = k12;
        } else {
            this.B6 = 0.0f;
            this.A6 = 0.0f;
        }
        if (i12 > 0) {
            this.C6 = -i12;
            this.D6 = i12;
        } else {
            this.D6 = 0.0f;
            this.C6 = 0.0f;
        }
        ws0 ws0Var = this.H1;
        if (ws0Var != null) {
            if (f9 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = ws0Var.f2251t1;
            boolean z11 = !z10;
            if (ws0Var.U1 != z11) {
                ws0Var.U1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f10 = 1.0f;
                }
                b.q(animate.alpha(f10), org.telegram.ui.Components.jr.h, 240L);
            }
        }
    }

    public final void x0(boolean z10) {
        View view;
        float x4;
        float y8;
        float f9;
        float f10;
        if (z10) {
            TextureView textureView = this.f35812s3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new vh(this, 4));
                this.f35812s3.invalidate();
            }
        } else if (this.C3 == 2) {
            ImageView imageView = this.f35821t3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f35821t3.setImageDrawable(null);
                Bitmap bitmap = this.f35868y3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f35868y3 = null;
                }
            }
            this.H3 = false;
            if (this.f35875z2) {
                view = this.f35867y2;
            } else {
                view = this.f35858x2;
            }
            os0 os0Var = this.f35829u2;
            if (os0Var != null) {
                int[] iArr = this.f35849w3;
                os0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f35647a0.getTranslationY());
                ImageView imageView2 = this.f35821t3;
                Rect rect = this.f35775o2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f35829u2.getX());
                }
                qt0 qt0Var = this.A2;
                if (qt0Var != null) {
                    qt0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fq0(this, 4));
                if (this.f35875z2) {
                    x4 = 0.0f;
                } else {
                    x4 = iArr[0] - this.f35829u2.getX();
                }
                if (this.f35875z2) {
                    y8 = 0.0f;
                } else {
                    y8 = iArr[1] - this.f35829u2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f35821t3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f35821t3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f35821t3;
                Property property3 = View.TRANSLATION_X;
                if (this.f35875z2) {
                    f9 = 0.0f;
                } else {
                    f9 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f9));
                ImageView imageView6 = this.f35821t3;
                Property property4 = View.TRANSLATION_Y;
                if (this.f35875z2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f10));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x4));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y8));
                arrayList.add(ObjectAnimator.ofInt(this.H0, org.telegram.ui.Components.r6.d, 255));
                qt0 qt0Var2 = this.A2;
                if (qt0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(qt0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property3, x4));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property4, y8));
                }
                org.telegram.ui.Components.bg0.o(this.f35829u2.getAspectRatio(), false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new bg.b3(20, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.f35867y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new dr0(this, view, 0));
                animatorSet.start();
                ht0 ht0Var = new ht0();
                ht0Var.f39049c = false;
                ht0Var.d = false;
                ht0Var.f39047a = 250;
                ht0Var.f39048b = decelerateInterpolator;
                k3(true, true, ht0Var);
                this.C3 = 0;
            }
        }
    }

    public final int x1() {
        return this.f35775o2.right;
    }

    public final void x2(org.telegram.ui.Components.q40 q40Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f35740k2 = q40Var;
        if (this.Y1 == 1) {
            if (E3()) {
                this.f35729j0.setVisibility(0);
                this.O0.setVisibility(8);
            } else {
                this.O0.setVisibility(0);
                this.f35729j0.setVisibility(8);
            }
            if (q40Var != null && (user = q40Var.f31853b) != null && q40Var.f31854c == 1 && this.f35740k2.d) {
                if (q40Var.f31855e) {
                    this.f35866y1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.f35866y1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.f35866y1.setSubtitle(null);
            }
        }
        if (q40Var != null) {
            if (q40Var.f31854c == 2) {
                if (q40Var.f31855e) {
                    str = "SuggestVideo";
                    i10 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i10 = R.string.SuggestPhoto;
                }
                O2(LocaleController.getString(str, i10));
            }
            if (q40Var.f31855e) {
                this.O7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.B.setBackground(null);
            this.B.setElevation(2.0f);
        }
    }

    public final void x3() {
        boolean z10;
        org.telegram.ui.Components.x61 x61Var = this.B2;
        if (x61Var != null) {
            if (!d1.f.u() && !this.f35799r) {
                z10 = false;
            } else {
                z10 = true;
            }
            x61Var.P(z10);
        }
        if (!this.f35701f8) {
            this.f35648a1.setEnabled(false);
            this.f35648a1.setClickable(false);
            this.f35648a1.animate().alpha(0.5f).setDuration(180L).start();
            this.N7.setMode(0);
            return;
        }
        this.f35648a1.setEnabled(true);
        this.f35648a1.setClickable(true);
        this.f35648a1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f35799r) {
            if (this.f35650a4 == null) {
                this.I.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.gc0 gc0Var = this.Z0;
            gc0Var.f28870e = true;
            gc0Var.invalidateSelf();
            if (this.f35694f1.getTag() != null) {
                this.f35694f1.setAlpha(0.5f);
                this.f35694f1.setEnabled(false);
            }
            if (this.Y1 == 1) {
                this.N7.setMaxProgressDiff(9600.0f / this.f35681d8);
                this.N7.setMode(1);
                B3();
                return;
            }
            this.N7.setMaxProgressDiff(1.0f);
            this.N7.setMode(0);
            return;
        }
        this.I.a(this.y8, true);
        org.telegram.ui.Components.gc0 gc0Var2 = this.Z0;
        gc0Var2.f28870e = false;
        gc0Var2.invalidateSelf();
        if (this.f35694f1.getTag() != null) {
            this.f35694f1.setAlpha(1.0f);
            this.f35694f1.setEnabled(true);
        }
        this.N7.setMaxProgressDiff(1.0f);
        this.N7.setMode(0);
    }

    public final void y0() {
        zt0 zt0Var = this.Z4;
        if (zt0Var != null) {
            zt0Var.f45316a.setVisible(true, true);
        }
        xt0 xt0Var = this.d;
        zt0 zt0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (xt0Var != null) {
            MessageObject messageObject = this.P4;
            ImageLocation imageLocation = this.V4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            zt0Var2 = xt0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.L4, false, false);
        }
        this.Z4 = zt0Var2;
        if (zt0Var2 != null && !zt0Var2.f45332s) {
            zt0Var2.f45316a.setVisible(false, true);
        }
    }

    public final void y2(boolean z10) {
        if (this.f35731j2 != z10) {
            this.f35731j2 = z10;
            this.M1.setLayerType(2, null);
            this.M1.getCurrentView().setLayerType(2, null);
            this.M1.getNextView().setLayerType(2, null);
        }
    }

    public final void y3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.y3(int, boolean):void");
    }

    public final void z0() {
        MessageObject messageObject;
        boolean z10;
        int i10;
        TextureView textureView;
        int i11;
        TextureView textureView2;
        float f9;
        MessageObject messageObject2;
        ArrayList arrayList = this.U6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f35830u3;
        if (!isEmpty && ((messageObject = this.P4) == null || !messageObject.isSponsored())) {
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = this.L4;
                if (i12 == 1) {
                    i13++;
                } else if (i12 == 2) {
                    i13--;
                }
                if (i13 >= 0 && i13 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                    if (!messageObject3.isVideo() && !messageObject3.isYouTubeVideo()) {
                        imageViewArr[i12].setVisibility(4);
                    } else {
                        if (messageObject3.isYouTubeVideo() && (messageObject2 = this.P4) != null && messageObject2.getId() == messageObject3.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i10 = messageObject3.messageOwner.media.webpage.embed_width;
                        } else if (i12 == 0 && (textureView = this.f35858x2) != null) {
                            i10 = textureView.getMeasuredWidth();
                        } else {
                            i10 = 0;
                        }
                        if (z10) {
                            i11 = messageObject3.messageOwner.media.webpage.embed_height;
                        } else if (i12 == 0 && (textureView2 = this.f35858x2) != null) {
                            i11 = textureView2.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        TLRPC.Document document = messageObject3.getDocument();
                        if (document != null) {
                            int size = document.attributes.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i10 = documentAttribute.f22399w;
                                    i11 = documentAttribute.h;
                                    break;
                                }
                                i14++;
                            }
                        }
                        Point point = AndroidUtilities.displaySize;
                        if (point.y > point.x && i10 > i11) {
                            if (imageViewArr[i12].getVisibility() != 0) {
                                imageViewArr[i12].setVisibility(0);
                            }
                            if (this.F) {
                                imageViewArr[i12].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f35647a0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f35647a0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f35752l6 != null) {
                            float f10 = this.T5;
                            f9 = ((this.Y5 - f10) * this.f35717h6) + f10;
                        } else {
                            f9 = this.T5;
                        }
                        float f11 = 0.0f;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                f11 = ((-AndroidUtilities.displaySize.x) - AndroidUtilities.dp(15.0f)) + (f9 - this.B6);
                            } else {
                                float f12 = this.A6;
                                if (f9 < f12) {
                                    f11 = f9 - f12;
                                }
                            }
                        }
                        imageViewArr[i12].setTranslationX((f11 + AndroidUtilities.displaySize.x) - AndroidUtilities.dp(48.0f));
                    }
                } else {
                    imageViewArr[i12].setVisibility(4);
                }
            }
            return;
        }
        for (int i15 = 0; i15 < 3; i15++) {
            imageViewArr[i15].setVisibility(4);
        }
    }

    public final int z1(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f35802r2;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void z2() {
        org.telegram.ui.Components.l61 l61Var;
        org.telegram.ui.Components.l61 l61Var2;
        if (!this.f35668c2 && this.Y1 == 1) {
            if (!this.f35765n1 || ((l61Var2 = (org.telegram.ui.Components.l61) this.f35858x2) != null && l61Var2.getVideoWidth() > 0 && l61Var2.getVideoHeight() > 0)) {
                this.f35668c2 = true;
                Bitmap bitmap = this.f35869y4.getBitmap();
                int orientation = this.f35869y4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f35673d0.getBitmap();
                    orientation = this.f35673d0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i10 = orientation;
                if (bitmap2 != null || this.f35858x2 != null) {
                    org.telegram.ui.Components.pe0 pe0Var = this.f35866y1;
                    if (this.f35765n1) {
                        l61Var = (org.telegram.ui.Components.l61) this.f35858x2;
                    } else {
                        l61Var = null;
                    }
                    pe0Var.b(bitmap2, i10, false, false, this.f35874z1, l61Var, this.T4.f41222c);
                }
            }
        }
    }

    public final void z3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z3():void");
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
