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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i20, org.telegram.ui.Components.h20, rf.a, le.d {
    public static Drawable[] T8;
    public static final Paint U8 = new Paint(2);
    public static final HashMap V8 = new HashMap();
    public static DecelerateInterpolator W8;
    public static Paint X8;
    public static final Property Y8;
    public static volatile PhotoViewer Z8;
    public static volatile PhotoViewer f30911a9;
    public org.telegram.ui.ActionBar.a0 A0;
    public org.telegram.ui.Components.lo0 A1;
    public AnimatorSet A2;
    public final int[] A3;
    public org.telegram.ui.Components.fd0 A4;
    public boolean A5;
    public float A6;
    public ObjectAnimator A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.w0 B0;
    public AnimatorSet B1;
    public TextureView B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public int B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.w0 C0;
    public org.telegram.ui.Components.ue0 C1;
    public SurfaceView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public float C7;
    public String C8;
    public org.telegram.ui.ActionBar.w0 D0;
    public final lg.g D1;
    public boolean D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public final org.telegram.ui.Components.c6 D8;
    public ContextThemeWrapper E;
    public org.telegram.ui.ActionBar.w0 E0;
    public lg.g E1;
    public wu0 E2;
    public ImageView E3;
    public org.telegram.ui.Components.ma E4;
    public long E5;
    public float E6;
    public final kr0 E7;
    public org.telegram.ui.Components.c6[] E8;
    public org.telegram.ui.Components.w7 F;
    public org.telegram.ui.ActionBar.g1 F0;
    public lg.g F1;
    public org.telegram.ui.Components.h71 F2;
    public boolean F3;
    public org.telegram.ui.Components.ma F4;
    public zg.p0 F5;
    public float F6;
    public Path F7;
    public RectF F8;
    public ImageView G;
    public org.telegram.ui.Components.r7 G0;
    public MediaController.CropState G1;
    public pf.e G2;
    public int G3;
    public org.telegram.ui.Components.ma G4;
    public String G5;
    public float G6;
    public Paint G7;
    public RectF G8;
    public Drawable H;
    public dc1 H0;
    public MediaController.CropState H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public Paint H7;
    public Matrix H8;
    public gh.c I;
    public i91 I0;
    public org.telegram.ui.Components.jf0 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public LinearGradient I7;
    public float[] I8;
    public boolean J;
    public yr J0;
    public AnimatorSet J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public LinearGradient J7;
    public RenderNode J8;
    public boolean K;
    public final HashMap K0;
    public ci.j4 K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public Matrix K7;
    public RenderNode K8;
    public AnimatorSet L;
    public final BackgroundDrawable L0;
    public cu0 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public final ah.a L8;
    public cv0 M;
    public final Paint M0;
    public boolean M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public final int[] M7;
    public final a0.i M8;
    public av0 N;
    public CheckBox N0;
    public bu0 N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public hv0 N7;
    public boolean N8;
    public boolean O;
    public CounterView O0;
    public boolean O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public org.telegram.ui.Components.sf0 O7;
    public View O8;
    public boolean P;
    public t5 P0;
    public org.telegram.ui.ActionBar.c2 P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public RadialProgressView P7;
    public com.google.android.gms.internal.cast.p P8;
    public ys0 Q;
    public FrameLayout Q0;
    public tu0 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public FrameLayout Q7;
    public TextureView Q8;
    public boolean R;
    public FrameLayout R0;
    public FrameLayout R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public at0 R7;
    public boolean R8;
    public Paint S;
    public ii.y1 S0;
    public TextView S1;
    public org.telegram.ui.Components.h71 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public TextView S7;
    public boolean S8;
    public int T;
    public org.telegram.ui.Components.lf0 T0;
    public du0 T1;
    public SurfaceTexture T2;
    public View T3;
    public MessageObject T4;
    public boolean T5;
    public int T6;
    public AnimatorSet T7;
    public int U;
    public org.telegram.ui.Components.sf0 U0;
    public dt0 U1;
    public boolean U2;
    public ts0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public long U7;
    public int V;
    public TextView V0;
    public et0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public float W;
    public final bv0[] W0;
    public float W1;
    public boolean W2;
    public pt0 W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public o0.a X;
    public ld X0;
    public j0 X1;
    public boolean X2;
    public int X3;
    public final uu0 X4;
    public float X5;
    public final SparseArray[] X6;
    public volatile int X7;
    public ah.c Y;
    public ImageView Y0;
    public FrameLayout Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public pe.b Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public ImageLocation Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public int Z7;
    public final le.b f30912a = new le.b(0, this, org.telegram.ui.Components.qr.h, 380, false);
    public pe.b f30913a0;
    public ImageView f30914a1;
    public org.telegram.ui.Components.vi a2;
    public float f30915a3;
    public final org.telegram.ui.Cells.g1 f30916a4;
    public ImageLocation f30917a5;
    public float f30918a6;
    public final ArrayList f30919a7;
    public int f30920a8;
    public final boolean f30921b;
    public org.telegram.ui.Components.ha f30922b0;
    public ImageView f30923b1;
    public yf.k0 f30924b2;
    public String f30925b3;
    public final VideoFramesRewinder f30926b4;
    public SecureDocument f30927b5;
    public float f30928b6;
    public final ArrayList f30929b7;
    public volatile int f30930b8;
    public int f30931c;
    public org.telegram.ui.Components.la f30932c0;
    public ImageView f30933c1;
    public int f30934c2;
    public String f30935c3;
    public final mt0 f30936c4;
    public final String[] f30937c5;
    public float f30938c6;
    public final ArrayList f30939c7;
    public volatile int f30940c8;
    public dv0 d;
    public WindowManager.LayoutParams f30941d0;
    public org.telegram.ui.Components.kc0 f30942d1;
    public boolean f30943d2;
    public long f30944d3;
    public final org.telegram.ui.Cells.c2 f30945d4;
    public fv0 f30946d5;
    public float f30947d6;
    public final ArrayList f30948d7;
    public volatile int f30949d8;
    public boolean e;
    public xu0 f30950e0;
    public org.telegram.ui.ActionBar.l0 f30951e1;
    public boolean f30952e2;
    public float f30953e3;
    public CharSequence f30954e4;
    public String f30955e5;
    public float f30956e6;
    public final ArrayList e7;
    public volatile int f30957e8;
    public boolean f30958f;
    public ku0 f30959f0;
    public org.telegram.ui.Components.e90 f30960f1;
    public boolean f30961f2;
    public boolean f30962f3;
    public boolean f30963f4;
    public long f30964f5;
    public float f30965f6;
    public final ArrayList f7;
    public volatile int f30966f8;
    public ev0 f30967g0;
    public bt0 f30968g1;
    public boolean f30969g2;
    public long f30970g3;
    public boolean f30971g4;
    public String f30972g5;
    public float f30973g6;
    public final ArrayList f30974g7;
    public volatile int f30975g8;
    public int h;
    public ClippingImageView f30976h0;
    public ArrayList f30977h1;
    public boolean f30978h2;
    public boolean f30979h3;
    public final ct0 f30980h4;
    public boolean f30981h5;
    public float f30982h6;
    public ImageLocation f30983h7;
    public float f30984h8;
    public ai.x5 f30985i0;
    public ArrayList f30986i1;
    public boolean f30987i2;
    public mv0 f30988i3;
    public final ct0 f30989i4;
    public TL_iv.PageBlock f30990i5;
    public float f30991i6;
    public iv0 f30992i7;
    public int f30993i8;
    public View f30994j0;
    public org.telegram.ui.Components.t61 f30995j1;
    public org.telegram.ui.Components.b6 f30996j2;
    public String j3;
    public final b80 f30997j4;
    public ImageReceiver.BitmapHolder f30998j5;
    public float f30999j6;
    public zu0 f31000j7;
    public volatile boolean f31001j8;
    public int f31002k0;
    public ci.f4 f31003k1;
    public boolean f31004k2;
    public ValueAnimator f31005k3;
    public final float[][] f31006k4;
    public boolean f31007k5;
    public float f31008k6;
    public final Rect f31009k7;
    public volatile boolean f31010k8;
    public TextView f31011l0;
    public org.telegram.ui.Components.v30 l1;
    public boolean f31012l2;
    public boolean f31013l3;
    public bo l4;
    public boolean f31014l5;
    public float f31015l6;
    public final AnimationNotificationsLocker f31016l7;
    public long f31017l8;
    public TextView m0;
    public org.telegram.ui.Components.z11 f31018m1;
    public boolean f31019m2;
    public final int[] f31020m3;
    public org.telegram.ui.ActionBar.o2 f31021m4;
    public boolean f31022m5;
    public float f31023m6;
    public mb0 f31024m7;
    public long f31025m8;
    public boolean f31026n;
    public TextView f31027n0;
    public UndoView f31028n1;
    public boolean f31029n2;
    public final int[] f31030n3;
    public int f31031n4;
    public boolean f31032n5;
    public long f31033n6;
    public org.telegram.ui.Components.oc f31034n7;
    public float f31035n8;
    public org.telegram.ui.ActionBar.w0 f31036o0;
    public lv0 f31037o1;
    public org.telegram.ui.Components.s40 f31038o2;
    public org.telegram.ui.ActionBar.k5 f31039o3;
    public long f31040o4;
    public String f31041o5;
    public int f31042o6;
    public int f31043o7;
    public float f31044o8;
    public org.telegram.ui.ActionBar.w0 f31045p0;
    public yu0 f31046p1;
    public boolean f31047p2;
    public ImageView f31048p3;
    public Runnable f31049p4;
    public qg.p2 p5;
    public AnimatorSet f31050p6;
    public boolean f31051p7;
    public long f31052p8;
    public org.telegram.ui.ActionBar.g1 f31053q0;
    public ImageReceiver f31054q1;
    public MessagesController.DialogPhotos f31055q2;
    public org.telegram.ui.Components.j71 f31056q3;
    public fv0 f31057q4;
    public org.telegram.ui.Components.kf0 f31058q5;
    public AnimatorSet q6;
    public CharSequence f31059q7;
    public long f31060q8;
    public boolean f31061r;
    public org.telegram.ui.ActionBar.c1 f31062r0;
    public boolean f31063r1;
    public boolean f31064r2;
    public u50 f31065r3;
    public fv0 f31066r4;
    public ArrayList f31067r5;
    public org.telegram.ui.Components.j20 f31068r6;
    public boolean f31069r7;
    public long f31070r8;
    public boolean f31071s;
    public org.telegram.ui.ActionBar.g1 f31072s0;
    public final kr0 f31073s1;
    public final Rect f31074s2;
    public ot0 f31075s3;
    public boolean f31076s4;
    public ai.n4 f31077s5;
    public boolean f31078s6;
    public ValueAnimator f31079s7;
    public long f31080s8;
    public org.telegram.ui.ActionBar.g1 f31081t0;
    public float f31082t1;
    public boolean f31083t2;
    public AnimatorSet f31084t3;
    public boolean f31085t4;
    public pu0 f31086t5;
    public final DecelerateInterpolator f31087t6;
    public TLRPC.Document f31088t7;
    public long f31089t8;
    public org.telegram.ui.ActionBar.l1 f31090u0;
    public long f31091u1;
    public boolean f31092u2;
    public boolean f31093u3;
    public int f31094u4;
    public LinearLayout f31095u5;
    public float f31096u6;
    public TLRPC.Document f31097u7;
    public long f31098u8;
    public int v;
    public org.telegram.ui.ActionBar.g1 f31099v0;
    public final GradientDrawable[] f31100v1;
    public org.telegram.ui.ActionBar.f6 f31101v2;
    public int f31102v3;
    public final kr0 f31103v4;
    public pu0 f31104v5;
    public float f31105v6;
    public boolean f31106v7;
    public float f31107v8;
    public AnimatorSet f31108w;
    public as f31109w0;
    public final boolean[] f31110w1;
    public final ws0 f31111w2;
    public TextureView f31112w3;
    public int f31113w4;
    public pu0 f31114w5;
    public float f31115w6;
    public boolean f31116w7;
    public lu0 f31117w8;
    public final kr0 f31118x;
    public LinearLayout f31119x0;
    public final float[] f31120x1;
    public final ct0 f31121x2;
    public ImageView f31122x3;
    public String f31123x4;
    public pu0 f31124x5;
    public float f31125x6;
    public Utilities.Callback2 f31126x7;
    public MessageObject f31127x8;
    public Activity f31128y;
    public final ArrayList f31129y0;
    public int f31130y1;
    public ut0 f31131y2;
    public final ImageView[] y3;
    public org.telegram.ui.Components.fd0 f31132y4;
    public pu0 f31133y5;
    public float f31134y6;
    public final float[] f31135y7;
    public boolean f31136y8;
    public org.telegram.ui.ActionBar.l1 f31137z0;
    public org.telegram.ui.Components.x61 f31138z1;
    public View f31139z2;
    public boolean f31140z3;
    public org.telegram.ui.Components.fd0 f31141z4;
    public long f31142z5;
    public float f31143z6;
    public final float[] f31144z7;
    public boolean f31145z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f31146g = 0;
        public final RectF f31147a;
        public final RectF f31148b;
        public final Paint f31149c;
        public pl0 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f31147a = new RectF();
            this.f31148b = new RectF();
            Paint paint = new Paint(1);
            this.f31149c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            mb0 mb0Var = photoViewer.f31024m7;
            if (mb0Var != null) {
                mb0Var.a(!this.e);
            }
            yf.k0 k0Var = photoViewer.f30924b2;
            if (k0Var != null) {
                k0Var.a(!this.e);
            }
            org.telegram.ui.Components.vi viVar = photoViewer.a2;
            if (viVar != null) {
                boolean z11 = this.e;
                viVar.f28803y0.k(viVar.f28761l2);
                if (viVar.f28780r2 != z11) {
                    viVar.f28780r2 = z11;
                    org.telegram.ui.Components.ni niVar = viVar.f28803y0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f28754j0;
                    if (niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f21930i1) {
                        if (z11 && !viVar.f28784s2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f21937n && !chatAttachAlertPhotoLayout.O0) {
                            if (z10) {
                                org.telegram.ui.Components.dm dmVar = chatAttachAlertPhotoLayout.P;
                                if (dmVar != null) {
                                    chatAttachAlertPhotoLayout.f21940o0 = Boolean.valueOf(dmVar.isFrontface());
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
            pl0 pl0Var;
            fv0 fv0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.S8) {
                if (photoViewer.f31031n4 != 0 && !AndroidUtilities.isTablet() && (fv0Var = photoViewer.f30946d5) != null && fv0Var.f33772m != null) {
                    ClippingImageView clippingImageView = photoViewer.f30976h0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f31148b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f22001b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f22002c;
                    rectF.bottom = scaleY - clippingImageView.f22000a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f7 = bounds.right;
                        float f10 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f31147a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 == 3) {
                                            rectF2.set(0.0f, rectF.bottom, f7, f10);
                                        }
                                    } else {
                                        rectF2.set(rectF.right, rectF.top, f7, rectF.bottom);
                                    }
                                } else {
                                    rectF2.set(0.0f, 0.0f, f7, rectF.top);
                                }
                            } else {
                                rectF2.set(0.0f, rectF.top, rectF.left, rectF.bottom);
                            }
                            canvas.drawRect(rectF2, this.f31149c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (pl0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(pl0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f31128y instanceof LaunchActivity) {
                if (photoViewer.e && i10 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.e = z10;
                if (z10) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new ou0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f31149c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f31151a;
        public final TextPaint f31152b;
        public final Paint f31153c;
        public int d;
        public int e;
        public final RectF f31154f;
        public int h;
        public float f31155n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f31152b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f31153c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f31154f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f31152b;
            this.f31151a = new StaticLayout("" + Math.max(1, i10), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.e = this.f31151a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f31153c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.f27222b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, o6Var, 0), ObjectAnimator.ofInt(textPaint, o6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.o6 o6Var2 = org.telegram.ui.Components.q6.f27222b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, o6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, o6Var2, 0, 255));
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
            return this.f31155n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f31153c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f31154f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f31151a != null) {
                this.f31152b.setAlpha((int) ((1.0f - this.f31155n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f31155n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.f31151a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f31155n * 255.0f));
                int centerX = (int) rectF.centerX();
                int b10 = (int) com.google.android.gms.internal.vision.e2.b(1.0f, this.f31155n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
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
        public void setRotationX(float f7) {
            this.f31155n = f7;
            invalidate();
        }

        @Override
        public void setScaleX(float f7) {
            super.setScaleX(f7);
            invalidate();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            Y8 = new ks0();
        } else {
            Y8 = new org.telegram.ui.Cells.c1(Float.class, "progress", 3);
        }
        Z8 = null;
        f30911a9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30921b = z10;
        this.h = -1;
        this.f31026n = true;
        this.f31118x = new kr0(this, 20);
        this.J = true;
        this.O = true;
        this.P = false;
        this.Z = new pe.b(true);
        this.f31129y0 = new ArrayList();
        this.K0 = new HashMap(3);
        this.L0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.M0 = paint;
        this.W0 = new bv0[3];
        this.f31073s1 = new kr0(this, 21);
        this.f31100v1 = new GradientDrawable[2];
        this.f31110w1 = new boolean[2];
        this.f31120x1 = new float[2];
        this.D1 = new Object();
        this.E1 = new Object();
        this.F1 = new Object();
        this.W1 = -8.0f;
        this.f31074s2 = new Rect();
        this.f31111w2 = new ws0(this);
        this.f31121x2 = new ct0(this, 0);
        this.f31013l3 = true;
        this.f31020m3 = new int[2];
        this.f31030n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f30916a4 = new org.telegram.ui.Cells.g1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f30926b4 = videoFramesRewinder;
        this.f30936c4 = new mt0(this, videoFramesRewinder);
        this.f30945d4 = new org.telegram.ui.Cells.c2(this);
        this.f30980h4 = new ct0(this, 1);
        this.f30989i4 = new ct0(this, 2);
        this.f30997j4 = new b80(this, 1);
        this.f31006k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f31103v4 = new kr0(this, 22);
        this.B4 = new ImageReceiver();
        this.C4 = new ai.l4(this, 5);
        this.D4 = new ImageReceiver();
        this.E4 = new org.telegram.ui.Components.ma(1, new kr0(this, 23));
        this.F4 = new org.telegram.ui.Components.ma(1, new kr0(this, 23));
        this.G4 = new org.telegram.ui.Components.ma(1, new kr0(this, 23));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f30937c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f30918a6 = 1.0f;
        this.f30928b6 = 0.0f;
        this.f31042o6 = -1;
        this.f31087t6 = new DecelerateInterpolator(1.5f);
        this.f31115w6 = 1.0f;
        this.f31125x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f30919a7 = new ArrayList();
        this.f30929b7 = new ArrayList();
        this.f30939c7 = new ArrayList();
        this.f30948d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.f30974g7 = new ArrayList();
        this.f30983h7 = null;
        this.f30992i7 = null;
        this.f31009k7 = new Rect();
        this.f31016l7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f31135y7 = new float[]{1.0f};
        this.f31144z7 = new float[]{1.0f};
        this.E7 = new kr0(this, 24);
        this.M7 = new int[2];
        this.U7 = -1L;
        this.V7 = -1L;
        this.W7 = -1L;
        this.Y7 = -1;
        this.D8 = new org.telegram.ui.Components.c6(new kr0(this, 23), 180L, org.telegram.ui.Components.qr.f27381g);
        this.L8 = new Object();
        this.M8 = new a0.i();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.setFileLoadingPriority(3);
    }

    public static void B(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.h71 h71Var;
        MessageObject messageObject;
        boolean z11;
        xu0 xu0Var = photoViewer.f30950e0;
        photoViewer.f30941d0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f31128y.getSystemService("window")).updateViewLayout(photoViewer.f30967g0, photoViewer.f30941d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        bo boVar = photoViewer.l4;
        if (boVar != null && boVar.Y != null && boVar.getFragmentView() != null) {
            nk nkVar = photoViewer.l4.Y;
            if (nkVar.f21881y2) {
                nkVar.r1();
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.l4.getParentActivity(), photoViewer.f30931c);
            photoViewer.l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (h71Var = photoViewer.F2) != null && h71Var.n() > 1500 && (messageObject = photoViewer.T4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.F2.n() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.T).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                a4.a.z(sb2, MessagesController.getInstance(photoViewer.T).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject2.getId());
                str = sb2.toString();
            }
        }
        it0 it0Var = new it0(photoViewer, photoViewer.f31128y, photoViewer.l4, arrayList, str, num, xu0Var, z10);
        it0Var.setFocusable(false);
        it0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new pl0(11, photoViewer, it0Var), 250L);
        it0Var.show();
    }

    public static boolean C1() {
        if (Z8 != null) {
            return true;
        }
        return false;
    }

    public static void E(PhotoViewer photoViewer) {
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
        MessageObject messageObject2 = photoViewer.T4;
        File file2 = null;
        if (messageObject2 != null) {
            if (messageObject2.canEditMedia() && !photoViewer.T4.isDocument()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.T4.isOutOwner()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean isVideo = photoViewer.T4.isVideo();
            if (!TextUtils.isEmpty(photoViewer.T4.messageOwner.attachPath)) {
                File file3 = new File(photoViewer.T4.messageOwner.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                file2 = FileLoader.getInstance(photoViewer.T).getPathToMessage(photoViewer.T4.messageOwner);
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
            photoViewer.f30992i7 = new iv0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            nu0 nu0Var = new nu0();
            nu0Var.f36161c = false;
            photoViewer.k3(false, true, nu0Var);
            AndroidUtilities.runOnUIThread(new ur0(photoViewer, file, z10, messageObject, z11, z12), nu0Var.f36159a);
            return;
        }
        photoViewer.U2();
    }

    public static void G(org.telegram.ui.PhotoViewer r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap I0(android.graphics.Bitmap r16, org.telegram.messenger.MediaController.CropState r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.I0(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean J1(MessageObject messageObject) {
        if (Z8 != null && !Z8.B3 && Z8.e && messageObject != null && Z8.T4 != null && Z8.T4.getId() == messageObject.getId() && Z8.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean K1(MessageObject messageObject) {
        if (f30911a9 != null && messageObject != null && f30911a9.T4 != null && f30911a9.T4.getId() == messageObject.getId() && f30911a9.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean L1(String str) {
        if (Z8 != null && Z8.e && !Z8.f31076s4 && str != null && str.equals(Z8.f30955e5)) {
            return true;
        }
        return false;
    }

    public static boolean M1(MessageObject messageObject) {
        boolean z10;
        if (Z8 != null && !Z8.B3 && Z8.e && !Z8.f31076s4 && messageObject != null) {
            MessageObject messageObject2 = Z8.T4;
            if (messageObject2 == null && Z8.d != null) {
                messageObject2 = Z8.d.U();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z10 = true;
                if (z10 && f30911a9 != null) {
                    if (f30911a9.e && !f30911a9.f31076s4 && messageObject != null && f30911a9.T4 != null && f30911a9.T4.getId() == messageObject.getId() && f30911a9.T4.getDialogId() == messageObject.getDialogId()) {
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
        if (Z8 != null && Z8.e && !Z8.f31076s4 && botInlineResult != null && Z8.Y4 != null && botInlineResult.f18119id == Z8.Y4.f18119id) {
            return true;
        }
        return false;
    }

    public static boolean O1(TLRPC.FileLocation fileLocation) {
        if (Z8 != null && Z8.e && !Z8.f31076s4 && fileLocation != null) {
            if (Z8.Z4 == null || fileLocation.local_id != Z8.Z4.location.local_id || fileLocation.volume_id != Z8.Z4.location.volume_id || fileLocation.dc_id != Z8.Z4.dc_id) {
                if (Z8.f30917a5 != null && fileLocation.local_id == Z8.f30917a5.location.local_id && fileLocation.volume_id == Z8.f30917a5.location.volume_id && fileLocation.dc_id == Z8.f30917a5.dc_id) {
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
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size() && (messageObject = (MessageObject) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f31032n5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.w31.A())) {
                photoViewer.A2(messageObject, j2(messageObject), false, true);
            } else {
                photoViewer.A2(messageObject, messageObject.caption, photoViewer.f31032n5, true);
            }
        }
    }

    public static void V(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.U7 != -1 && (textureView = photoViewer.B2) != null) {
            photoViewer.U7 = -1L;
            photoViewer.f31139z2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.qr.f27383j).setDuration(85L).setListener(new org.telegram.ui.Components.qk0(9, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void W(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W(org.telegram.ui.PhotoViewer):void");
    }

    public static void X(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.j71 j71Var = photoViewer.f31056q3;
        if (j71Var.f25154f) {
            i10 = j71Var.d;
        } else {
            i10 = j71Var.f25152b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.j71.S / 2) + i10)) - (photoViewer.f31075s3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f30988i3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f31075s3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            ot0 ot0Var = photoViewer.f31075s3;
            ot0Var.setPivotX(Utilities.clamp((ot0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f31075s3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            ot0 ot0Var2 = photoViewer.f31075s3;
            ot0Var2.setPivotX(Utilities.clamp((ot0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f31075s3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            ot0 ot0Var3 = photoViewer.f31075s3;
            ot0Var3.setPivotX(ot0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f31075s3.setTranslationX(dp);
    }

    public static void Y(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.yi0 lottieAnimation;
        uu0 uu0Var = photoViewer.X4;
        ArrayList arrayList = uu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) uu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.u9) && (lottieAnimation = ((org.telegram.ui.Components.u9) view).getImageReceiver().getLottieAnimation()) != null) {
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
        char c10 = (char) ((i12 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c11 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i13 = 99;
        } else {
            i13 = i11;
        }
        char c12 = (char) ((i13 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        return new String(new char[]{c10, c11, ':', c12, (char) ((i11 % 10) + 48)});
    }

    public static void Z(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.yi0 lottieAnimation;
        uu0 uu0Var = photoViewer.X4;
        ArrayList arrayList = uu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) uu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.u9) && (lottieAnimation = ((org.telegram.ui.Components.u9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j10 = photoViewer.f31017l8;
                        long j11 = 0;
                        if (j10 > 0) {
                            j11 = j10 / 1000;
                        }
                        lottieAnimation.T(j3 - j11);
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
        char c10 = (char) ((i13 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c11 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i14 = 99;
        } else {
            i14 = i11;
        }
        char c12 = (char) ((i14 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        char c13 = (char) ((i11 % 10) + 48);
        if (i12 >= 100) {
            i15 = 99;
        } else {
            i15 = i12;
        }
        char c14 = (char) ((i15 / 10) + 48);
        if (i12 >= 100) {
            i12 = 99;
        }
        return new String(new char[]{c10, c11, ':', c12, c13, ':', c14, (char) ((i12 % 10) + 48)});
    }

    public static void a0(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a0(org.telegram.ui.PhotoViewer, int):void");
    }

    public static CharSequence j2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.j6.f19060o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.j6.f19060o2.getFontMetricsInt(), false);
        if (MessageObject.containsUrls(replaceAnimatedEmoji)) {
            try {
                AndroidUtilities.addLinksSafe(replaceAnimatedEmoji, 5, false, true);
            } catch (Exception e) {
                FileLog.e(e);
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
        PhotoViewer photoViewer2 = Z8;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = Z8;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        Z8 = photoViewer;
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
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null && ku0Var.f27286x) {
            return ku0Var.getVideoDuration();
        }
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.p();
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
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.x5.cloneSpans(charSequence, 3);
        W2(this.R4, z11);
        if (!this.R4) {
            boolean z17 = true;
            if (this.f30934c2 != 1) {
                this.U1.setVisibility(8);
                this.V1.setVisibility(8);
                if (this.f30987i2) {
                    if (this.Q1.getParent() != this.P0) {
                        FrameLayout frameLayout = this.Z1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.Q1);
                        }
                        this.Q1.setMeasureAllChildren(false);
                        this.P0.addView(this.Q1, w7.x5.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.T1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f30950e0.getContext());
                        this.Z1 = frameLayout2;
                        this.Q1.setContainer(frameLayout2);
                        du0 du0Var = new du0(this, this.f30950e0.getContext(), this.Q1, this.Z1, 0);
                        this.T1 = du0Var;
                        this.Q1.setScrollView(du0Var);
                        this.Z1.setClipChildren(false);
                        this.T1.addView(this.Z1, new ViewGroup.LayoutParams(-1, -2));
                        this.f30950e0.addView(this.T1, w7.x5.e(-1, -1, 80));
                    }
                    if (this.Q1.getParent() != this.Z1) {
                        this.P0.removeView(this.Q1);
                        this.Q1.setMeasureAllChildren(true);
                        this.Z1.addView(this.Q1, -1, -2);
                        this.f31075s3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.R1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.E);
                            this.R1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.Z(620756991, 369098751, 8, 8));
                            w7.z5.b(this.R1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.E);
                            this.S1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.S1.setTextColor(-1);
                            this.S1.setTypeface(AndroidUtilities.bold());
                            this.R1.addView(this.S1, w7.x5.e(-2, -2, 17));
                            this.R1.setOnClickListener(new wr0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.R1);
                        this.S1.setText(messageObject.sponsoredButtonText);
                        this.Z1.addView(this.R1, w7.x5.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.Q1.setPadding(0, 0, 0, AndroidUtilities.dp(64.0f));
                        this.R1.bringToFront();
                    } else {
                        FrameLayout frameLayout4 = this.R1;
                        if (frameLayout4 != null) {
                            AndroidUtilities.removeFromParent(frameLayout4);
                            this.Q1.setPadding(0, 0, 0, 0);
                        }
                    }
                }
                boolean isEmpty = TextUtils.isEmpty(cloneSpans);
                boolean isEmpty2 = TextUtils.isEmpty(this.Q1.getCurrentView().getText());
                tu0 tu0Var = this.Q1;
                if (z11) {
                    currentView = tu0Var.getNextView();
                } else {
                    currentView = tu0Var.getCurrentView();
                }
                if (this.f31063r1) {
                    if (currentView.getMaxLines() != 1) {
                        this.Q1.getCurrentView().setMaxLines(1);
                        this.Q1.getNextView().setMaxLines(1);
                        this.Q1.getCurrentView().setSingleLine(true);
                        this.Q1.getNextView().setSingleLine(true);
                        TextView currentView2 = this.Q1.getCurrentView();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        currentView2.setEllipsize(truncateAt);
                        this.Q1.getNextView().setEllipsize(truncateAt);
                    }
                } else {
                    int maxLines = currentView.getMaxLines();
                    if (maxLines == 1) {
                        this.Q1.getCurrentView().setSingleLine(false);
                        this.Q1.getNextView().setSingleLine(false);
                    }
                    if (this.f30987i2) {
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
                        this.Q1.getCurrentView().setMaxLines(i10);
                        this.Q1.getNextView().setMaxLines(i10);
                        this.Q1.getCurrentView().setEllipsize(null);
                        this.Q1.getNextView().setEllipsize(null);
                    }
                }
                currentView.setScrollX(0);
                boolean z18 = this.f30987i2;
                if (!z18 && z11 && isEmpty) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f31019m2 = z12;
                if (!z18) {
                    this.T1.f37032l0 = false;
                }
                if (z11) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (z18) {
                            viewGroup = this.P0;
                        } else {
                            viewGroup = this.T1;
                        }
                        TransitionManager.endTransitions(viewGroup);
                    }
                    if (this.f30987i2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.P0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new eu0(this, isEmpty2, isEmpty, 1)).addTransition(new eu0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.T1.f37032l0 = true;
                            duration.addTransition(new org.telegram.ui.Components.fm0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.Q1);
                        }
                        TransitionManager.beginDelayedTransition(this.T1, duration);
                    }
                    z13 = true;
                } else {
                    this.Q1.getCurrentView().setText((CharSequence) null);
                    du0 du0Var2 = this.T1;
                    if (du0Var2 != null) {
                        du0Var2.scrollTo(0, 0);
                    }
                    z13 = false;
                }
                int i11 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.j6.J(null, true);
                    if (messageObject == null || !this.f31032n5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.w31.A())) {
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new ai.jb(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.Q1.setTag(cloneSpans);
                    try {
                        tu0 tu0Var2 = this.Q1;
                        if (this.f31047p2 != z10) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        tu0Var2.a(cloneSpans, z11, z16);
                        du0 du0Var3 = this.T1;
                        if (du0Var3 != null) {
                            du0Var3.H(du0Var3.getWidth(), du0Var3.getHeight());
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.J && (!this.f31063r1 || this.P0.getVisibility() == 0 || this.f31000j7 != null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    tu0 tu0Var3 = this.Q1;
                    if (z15) {
                        i11 = 0;
                    }
                    tu0Var3.setVisibility(i11);
                } else if (this.f30987i2) {
                    this.Q1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z11, false);
                    this.Q1.getCurrentView().setTextColor(-1291845633);
                    this.Q1.setTag("empty");
                    this.Q1.setVisibility(0);
                } else {
                    this.Q1.a(null, z11, false);
                    this.Q1.getCurrentView().setTextColor(-1);
                    tu0 tu0Var4 = this.Q1;
                    if (z13 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    tu0Var4.b(4, z14);
                    this.Q1.setTag(null);
                }
                if (this.Q1.getCurrentView() instanceof su0) {
                    ((su0) this.Q1.getCurrentView()).setLoading(z10);
                }
                this.f31047p2 = (isEmpty || !z10) ? false : false;
                return;
            }
        }
        f1().setText(cloneSpans);
        this.Q1.setVisibility(8);
    }

    public final void A3() {
        long j3;
        int H;
        MessageObject messageObject;
        dv0 dv0Var = this.d;
        if (dv0Var != null) {
            int H2 = dv0Var.H();
            this.O0.a(H2);
            if (H2 == 0) {
                p3(false, true);
            }
            if (this.S0 != null) {
                dv0 dv0Var2 = this.d;
                long j10 = 0;
                if (dv0Var2 != null) {
                    j3 = dv0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (messageObject = this.T4) != null) {
                    j3 = messageObject.getDialogId();
                }
                ii.y1 y1Var = this.S0;
                dv0 dv0Var3 = this.d;
                if (dv0Var3 == null || !dv0Var3.q() || this.d.w()) {
                    j10 = MessagesController.getInstance(this.T).getSendPaidMessagesStars(j3);
                }
                dv0 dv0Var4 = this.d;
                if (dv0Var4 == null) {
                    H = 1;
                } else {
                    H = dv0Var4.H();
                }
                y1Var.i(Math.max(1, H), j10, true);
            }
        }
    }

    public final void B0(final int i10, final boolean z10) {
        int i11;
        boolean z11;
        f20 f20Var;
        final File file;
        final f20 f20Var2;
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
        f20 f20Var3;
        boolean z19;
        org.telegram.ui.Components.b6 b6Var;
        int i12 = this.P4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.f30937c5[i10] != null) {
            if (i10 == 0 && i12 == 0 && (b6Var = this.f30996j2) != null) {
                z11 = b6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i11 >= 0 && i11 < this.Y6.size()) {
                    ?? r42 = (MessageObject) this.Y6.get(i11);
                    z12 = R2(r42);
                    if (this.C5 == 1 && !r42.canPreviewDocument()) {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.messageOwner.attachPath)) {
                        file3 = new File(r42.messageOwner.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((MessageObject.getMedia(r42.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(r42.messageOwner).webpage != null && MessageObject.getMedia(r42.messageOwner).webpage.document == null) {
                        f20Var3 = new f20(25, this, p1(i11, null));
                    } else {
                        f20Var3 = new f20(26, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        f20 f20Var4 = f20Var3;
                        z13 = z19;
                        f20Var = r42;
                        file = null;
                        file4 = file3;
                        f20Var2 = f20Var4;
                        z14 = true;
                    } else {
                        f20Var = r42;
                        file = null;
                        z14 = false;
                        file4 = file3;
                        f20Var2 = f20Var3;
                        z13 = false;
                    }
                } else {
                    this.W0[i10].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i11 >= 0 && i11 < this.f30974g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f30974g7.get(i11);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.f30937c5[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.f30937c5[i10]);
                            } else {
                                file2 = null;
                            }
                            z17 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                file2 = FileLoader.getInstance(this.T).getPathToAttach(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z14 = z17;
                        file = new File(FileLoader.getDirectory(4), this.f30937c5[i10]);
                        f20Var2 = null;
                        z12 = false;
                        z13 = false;
                    } else {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i11 >= 0 && i11 < this.f30929b7.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.f30929b7.get(i11);
                            if (imageLocation != null) {
                                pathToAttach = FileLoader.getInstance(this.T).getPathToAttach(imageLocation.location, q1(imageLocation), false);
                                pathToAttach2 = FileLoader.getInstance(this.T).getPathToAttach(imageLocation.location, q1(imageLocation), true);
                            } else {
                                pathToAttach2 = null;
                                pathToAttach = null;
                            }
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f30927b5 != null) {
                        if (i11 >= 0 && i11 < this.e7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.e7.get(i11);
                            pathToAttach = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, false);
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f30955e5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.f30937c5[i10]);
                        file = new File(FileLoader.getDirectory(4), this.f30937c5[i10]);
                        f20Var2 = null;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        zu0 zu0Var = this.f31000j7;
                        if (zu0Var != null) {
                            File b10 = zu0Var.b(i11);
                            if (!this.f31000j7.a(i11) && !this.f31000j7.e(i11)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && SharedConfig.streamMedia && (this.f31000j7.d(i11) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            f20Var2 = null;
                            z12 = Q2(i11);
                            file4 = b10;
                            f20Var = null;
                            file = null;
                        } else {
                            f20Var = null;
                            file = null;
                            f20Var2 = null;
                            z12 = false;
                            z13 = false;
                            z14 = false;
                        }
                    }
                    f20Var2 = null;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    f20Var = f20Var2;
                }
                file4 = file2;
                f20Var = f20Var2;
            }
            if ((i10 != 0 || !this.f31014l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = f20Var;
            final boolean z20 = z11;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    bo boVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.T8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = f20Var2;
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
                    if (!z22 && i13 != 0 && (messageObject = r72) != null && z23 && DownloadController.getInstance(photoViewer.T).canDownloadMedia(messageObject.messageOwner) != 0 && (((boVar = photoViewer.l4) == null || boVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
                        FileLoader.getInstance(photoViewer.T).loadFile(document, messageObject, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f30937c5;
                            bv0[] bv0VarArr = photoViewer2.W0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                        bv0VarArr[i14].d(2, false, true);
                                    } else {
                                        bv0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    bv0VarArr[i14].d(0, z29, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i14]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                bv0VarArr[i14].f(fileProgress.floatValue(), false);
                            } else {
                                if (i14 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i14 == 0 && photoViewer2.X2))) {
                                        bv0VarArr[i14].d(3, z29, true);
                                    } else {
                                        bv0VarArr[i14].d(-1, z29, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f31036o0.t()) {
                                    if (!z27) {
                                        if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                            photoViewer2.f31036o0.r(8);
                                        } else {
                                            photoViewer2.f31036o0.K(8);
                                        }
                                    } else {
                                        photoViewer2.f31036o0.r(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f31085t4 || (photoViewer2.f30974g7.isEmpty() && (strArr[0] == null || bv0VarArr[0].h == 0))) {
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
        if (!this.f30974g7.isEmpty() && i11 >= 0 && i11 < this.f30974g7.size()) {
            Object obj = this.f30974g7.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.f30934c2 != 11))) {
                    this.W0[i10].d(3, z10, true);
                    return;
                }
            }
        }
        this.W0[i10].d(-1, z10, true);
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
        org.telegram.ui.Components.d71 d71Var;
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null && h71Var.d != null && i10 != h71Var.f24530d0) {
            h71Var.f24530d0 = i10;
            ArrayList arrayList = h71Var.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                d71Var = (org.telegram.ui.Components.d71) h71Var.N.get(i10);
            } else {
                d71Var = null;
            }
            h71Var.R(false, d71Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.h71.J(null, this.T4);
        } else {
            org.telegram.ui.Components.h71 h71Var2 = this.F2;
            if (h71Var2 != null) {
                org.telegram.ui.Components.h71.J(h71Var2.u(i10), this.T4);
            }
        }
        z3();
        this.f31045p0.M(null, null);
        try {
            b5.d.b(0);
            if (of.b.M().O()) {
                of.b.M().T(m1());
            }
            org.telegram.ui.Components.h71 h71Var3 = this.F2;
            if (h71Var3 != null) {
                b5.d.x(h71Var3.y());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void C2(int r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(int, boolean, boolean, boolean):void");
    }

    public final void C3() {
        String Y0;
        String Y02;
        int[] iArr = this.f31020m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f31030n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            long max = Math.max(0L, h71Var.n());
            long max2 = Math.max(0L, this.F2.p());
            if (!this.A8 && this.Q7.getVisibility() == 0) {
                max2 = (this.R7.getRightProgress() - this.R7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.R7.getLeftProgress() * ((float) max2));
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
            ku0 ku0Var = this.f30959f0;
            if (ku0Var != null && ku0Var.f27286x) {
                long max3 = Math.max(0, ku0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f30959f0.getVideoDuration());
                if (!this.A8 && this.Q7.getVisibility() == 0) {
                    max4 = (this.R7.getRightProgress() - this.R7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.R7.getLeftProgress() * ((float) max4));
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
        this.f31039o3.l(Y0 + " / " + Y02, false);
        if (!Objects.equals(this.j3, Y02)) {
            this.j3 = Y02;
            this.f30988i3.requestLayout();
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f11 = 1.0f - f7;
            this.T0.setTranslationY(AndroidUtilities.dp(36.0f) * f11);
            this.T0.setAlpha(f7);
            org.telegram.ui.Components.lf0 lf0Var = this.T0;
            int i13 = 8;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lf0Var.setVisibility(i11);
            if (this.f30961f2) {
                t5 t5Var = this.P0;
                int i14 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                t5Var.setVisibility(i12);
                this.P0.setAlpha(f11);
                this.P0.setTranslationY(AndroidUtilities.dp(36.0f) * f7);
                ii.y1 y1Var = this.S0;
                if (i14 < 0) {
                    i13 = 0;
                }
                y1Var.setVisibility(i13);
                this.S0.setAlpha(f11);
                this.S0.setTranslationY(AndroidUtilities.dp(36.0f) * f7);
            }
        }
    }

    public final void D0(boolean z10, boolean z11, float f7) {
        if (f7 != this.f31082t1) {
            this.f31082t1 = f7;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f31082t1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.T4.getDialogId() + "_" + this.T4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.T4.getDialogId() + "_" + this.T4.getId(), this.f31082t1).commit();
                }
            }
            org.telegram.ui.Components.h71 h71Var = this.F2;
            if (h71Var != null) {
                h71Var.Q(this.f31082t1);
            }
            ku0 ku0Var = this.f30959f0;
            if (ku0Var != null) {
                ku0Var.setPlaybackSpeed(this.f31082t1);
            }
        }
        J2(true, z10);
        if (z11) {
            this.f31045p0.M(null, null);
        }
    }

    public final void D1() {
        boolean[] zArr = this.f31110w1;
        zArr[1] = false;
        zArr[0] = false;
        this.f30950e0.invalidate();
    }

    public final void D2() {
        if (this.f31031n4 == 0) {
            E2(this.C4, this.P4, null);
            F2(this.P4, this.f31132y4);
            E2(this.D4, this.P4 + 1, this.F1);
            F2(this.P4 + 1, this.A4);
            E2(this.B4, this.P4 - 1, this.E1);
            F2(this.P4 - 1, this.f31141z4);
        }
    }

    public final void D3() {
        int extractRealEncoderBitrate;
        if (this.Y7 > 0) {
            if (this.X7 >= this.Y7) {
                this.X7 = this.Y7 - 1;
            }
            if (this.f30934c2 == 1) {
                float max = Math.max(800.0f / this.f30930b8, 800.0f / this.f30940c8);
                this.f30949d8 = Math.round((this.f30930b8 * max) / 2.0f) * 2;
                this.f30957e8 = Math.round((this.f30940c8 * max) / 2.0f) * 2;
            } else {
                Size p02 = p0();
                this.f30949d8 = p02.getWidth();
                this.f30957e8 = p02.getHeight();
            }
            if (this.f30966f8 != 0) {
                if (this.f30934c2 == 1) {
                    this.f30966f8 = 1560000;
                    extractRealEncoderBitrate = this.f30966f8;
                } else if (this.f30949d8 == this.f30930b8 && this.f30957e8 == this.f30940c8) {
                    this.f30966f8 = this.f30975g8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f30949d8, this.f30957e8, this.f30966f8, false);
                } else {
                    this.f30966f8 = MediaController.makeVideoBitrate(this.f30940c8, this.f30930b8, this.f30975g8, this.f30957e8, this.f30949d8);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f30949d8, this.f30957e8, this.f30966f8, false);
                }
                this.f31060q8 = ((extractRealEncoderBitrate / 8) * this.f30984h8) / 1000.0f;
            }
        }
    }

    public final void E0(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0 && i10 < this.f30974g7.size() && H1()) {
            if (z10) {
                k0();
            }
            f1().p();
        }
    }

    public final void E1() {
        org.telegram.ui.Components.ue0 ue0Var = this.C1;
        if (ue0Var != null) {
            ue0Var.b(null, 0, false, false, null, null, null);
            if (this.f30934c2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.C1.f28369b.f14110a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.C1.setVisibility(0);
            this.C1.setAlpha(1.0f);
            lg.p pVar = this.C1.f28369b;
            pVar.q();
            CropAreaView cropAreaView2 = pVar.f14110a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f31083t2 = true;
        }
    }

    public final void E2(ImageReceiver imageReceiver, int i10, lg.g gVar) {
        MessageObject messageObject;
        TLRPC.PhotoSize photoSize;
        ?? r11;
        int i11;
        long j3;
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
        org.telegram.ui.Components.b6 b6Var;
        boolean z11;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.b6 b6Var2;
        boolean z12;
        ImageLocation imageLocation12;
        BitmapDrawable bitmapDrawable7;
        ImageLocation imageLocation13;
        long j10;
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
        long j11;
        TLRPC.PhotoSize photoSize3;
        ImageLocation imageLocation15;
        TLRPC.Document document4;
        TLRPC.Document document5;
        ?? r10;
        ImageLocation imageLocation16;
        long j12;
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
        long j13;
        BitmapDrawable bitmapDrawable9;
        ImageLocation imageLocation18;
        ImageLocation imageLocation19;
        BitmapDrawable bitmapDrawable10;
        String str5;
        Integer num = 1;
        boolean z14 = false;
        imageReceiver.setOrientation(0, false);
        ArrayList arrayList = this.e7;
        TLRPC.PhotoSize photoSize4 = null;
        BitmapDrawable bitmapDrawable11 = null;
        if (!arrayList.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                arrayList.get(i10);
                AndroidUtilities.getPhotoSize();
                ImageReceiver.BitmapHolder bitmapHolder = this.f30998j5;
                if (bitmapHolder == null || imageReceiver != this.C4) {
                    bitmapHolder = null;
                }
                if (bitmapHolder == null) {
                    bitmapHolder = this.d.j(i10);
                }
                SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                long j14 = secureDocument.secureFile.size;
                ImageLocation forSecureDocument = ImageLocation.getForSecureDocument(secureDocument);
                if (bitmapHolder != null) {
                    bitmapDrawable11 = new BitmapDrawable(bitmapHolder.bitmap);
                }
                imageReceiver.setImage(forSecureDocument, "d", null, null, bitmapDrawable11, j14, null, null, 0);
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.f30974g7;
        long j15 = 0;
        if (!arrayList2.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f30998j5;
                if (bitmapHolder2 == null || imageReceiver != this.C4) {
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
                            if (this.f31022m5) {
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
                        document = a4.a.k(photoSize5, photoSize5, "_");
                    }
                    cropState = cropState3;
                    z14 = z15;
                    str3 = str5;
                    document2 = null;
                    imageLocation14 = null;
                    i12 = 0;
                    j10 = 0;
                    webFile = null;
                    tLObject = null;
                } else {
                    String str6 = "d";
                    if (obj instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.type.equals("gif") && (r10 = botInlineResult.document) != null) {
                                long j16 = r10.size;
                                TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(r10);
                                if (documentVideoThumb != null) {
                                    imageLocation16 = ImageLocation.getForDocument(documentVideoThumb, (TLRPC.Document) r10);
                                } else {
                                    imageLocation16 = null;
                                }
                                j11 = j16;
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
                                    long j17 = closestPhotoSizeWithSize.size;
                                    Locale locale2 = Locale.US;
                                    tLObject = tLObject3;
                                    document = a4.a.k(photoSize5, photoSize5, "_");
                                    j11 = j17;
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
                                                j11 = 0;
                                                tLObject = null;
                                                document5 = null;
                                                webFile = WebFile.createWithWebDocument(botInlineResult.content);
                                                document = str6;
                                                photoSize3 = null;
                                            }
                                        } else {
                                            Locale locale3 = Locale.US;
                                            str6 = a4.a.k(photoSize5, photoSize5, "_");
                                        }
                                        imageLocation15 = null;
                                        j11 = 0;
                                        tLObject = null;
                                        document5 = null;
                                        webFile = WebFile.createWithWebDocument(botInlineResult.content);
                                        document = str6;
                                        photoSize3 = null;
                                    }
                                    j11 = 0;
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
                            j10 = j11;
                            str3 = null;
                        } else {
                            TLRPC.Document document6 = botInlineResult.document;
                            if (document6 != null) {
                                photoSize3 = FileLoader.getClosestPhotoSizeWithSize(document6.thumbs, 90);
                                j11 = 0;
                                webFile = null;
                                imageLocation15 = null;
                                document4 = null;
                                tLObject = botInlineResult.document;
                            } else {
                                TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                                if (webDocument2 instanceof TLRPC.TL_webDocument) {
                                    j11 = 0;
                                    tLObject = null;
                                    photoSize3 = null;
                                    imageLocation15 = null;
                                    document4 = null;
                                    webFile = WebFile.createWithWebDocument(webDocument2);
                                }
                                j11 = 0;
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
                                j10 = j11;
                                str3 = null;
                            }
                            document = document4;
                            document5 = document4;
                            document2 = document5;
                            cropState = null;
                            i12 = 1;
                            photoSize4 = photoSize3;
                            imageLocation14 = imageLocation15;
                            j10 = j11;
                            str3 = null;
                        }
                    } else if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        TLRPC.PhotoSize photoSize6 = searchImage.photoSize;
                        if (photoSize6 != null) {
                            photoSize2 = photoSize6;
                            tLObject2 = searchImage.photo;
                            j15 = photoSize6.size;
                            document3 = null;
                        } else {
                            String str7 = searchImage.filterPath;
                            if (str7 != null) {
                                str4 = str7;
                            } else {
                                TLRPC.Document document7 = searchImage.document;
                                if (document7 != null) {
                                    document3 = document7;
                                    j15 = document7.size;
                                    tLObject2 = null;
                                    photoSize2 = null;
                                } else {
                                    str4 = searchImage.imageUrl;
                                    j15 = searchImage.size;
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
                            j10 = j15;
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
                        j10 = j15;
                        webFile = null;
                    } else {
                        j10 = 0;
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
                        String k10 = a4.a.k(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, k10, bitmapDrawable10, j10, null, obj, i12);
                    } else {
                        long j18 = j10;
                        int i13 = i12;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation17 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                        } else {
                            imageLocation17 = null;
                        }
                        Locale locale5 = Locale.US;
                        String k11 = a4.a.k(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            j13 = j18;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j13 = j18;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, k11, bitmapDrawable9, j13, null, obj, i13);
                    }
                } else {
                    WebFile webFile2 = webFile;
                    long j19 = j10;
                    ImageLocation imageLocation20 = imageLocation14;
                    int i14 = i12;
                    if (photoSize4 != null) {
                        ImageLocation forObject = ImageLocation.getForObject(photoSize4, tLObject);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable8 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable8 = null;
                        }
                        imageReceiver.setImage(forObject, document, bitmapDrawable8, j19, (String) null, obj, i14);
                    } else {
                        String str8 = document;
                        if (webFile2 != null) {
                            if (imageLocation20 != null) {
                                imageReceiver.setImage(ImageLocation.getForWebFile(webFile2), str8, imageLocation20, (String) null, (Drawable) null, obj, i14);
                            } else {
                                ImageLocation forWebFile = ImageLocation.getForWebFile(webFile2);
                                if (bitmapHolder2 != null) {
                                    drawable4 = new BitmapDrawable(bitmapHolder2.bitmap);
                                } else if (z14 && (activity2 = this.f31128y) != null) {
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
                            } else if (z14 && (activity = this.f31128y) != null) {
                                drawable2 = activity.getResources().getDrawable(R.drawable.nophotos);
                            } else {
                                j12 = j19;
                                drawable = null;
                                imageReceiver.setImage(str3, str8, drawable, null, j12);
                            }
                            j12 = j19;
                            drawable = drawable2;
                            imageReceiver.setImage(str3, str8, drawable, null, j12);
                        }
                    }
                }
                if (gVar != null) {
                    if (cropState != null) {
                        MediaController.CropState cropState4 = cropState;
                        z13 = z14;
                        cropState2 = cropState4;
                        imageReceiver2 = imageReceiver;
                        gVar.e(true, cropState.cropPx, cropState.cropPy, cropState.cropRotate, cropState.transformRotation, cropState.cropScale, 1.0f, 1.0f, cropState.cropPw, cropState.cropPh, 0.0f, 0.0f, cropState4.mirrored);
                    } else {
                        cropState2 = cropState;
                        z13 = z14;
                        imageReceiver2 = imageReceiver;
                        gVar.f14070a = false;
                    }
                } else {
                    cropState2 = cropState;
                    z13 = z14;
                    imageReceiver2 = imageReceiver;
                }
                if (imageReceiver2 == this.B4) {
                    this.G1 = cropState2;
                    this.H4 = z13;
                    return;
                }
                boolean z16 = z13;
                MediaController.CropState cropState5 = cropState2;
                if (imageReceiver2 == this.D4) {
                    this.H1 = cropState5;
                    this.K4 = z16;
                    return;
                }
                return;
            }
            imageReceiver.setImageBitmap((Bitmap) null);
            return;
        }
        zu0 zu0Var = this.f31000j7;
        if (zu0Var != null) {
            int[] iArr = new int[1];
            TLObject d = zu0Var.d(i10);
            TLRPC.PhotoSize f7 = this.f31000j7.f(d, iArr);
            if (f7 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f30998j5 == null || imageReceiver != this.C4) ? null : null;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    if ((DownloadController.getInstance(this.T).getAutodownloadMask() & 1) == 0 && this.P4 != i10 && !FileLoader.getInstance(this.T).getPathToAttach(f7, true).exists()) {
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
                        imageLocation13 = ImageLocation.getForPhoto(f7, photo3);
                    } else {
                        imageLocation13 = null;
                    }
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f31000j7.g(), 1);
                    if (z12) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f31000j7.a(i10) && !this.f31000j7.e(i10)) {
                    if (imageReceiver == this.C4 && (b6Var2 = this.f30996j2) != null) {
                        imageReceiver.setImageBitmap(b6Var2);
                        this.f30996j2.f(this.f30950e0);
                        return;
                    }
                    return;
                } else if (!(f7.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f30998j5 == null || imageReceiver != this.C4) ? null : null;
                    if (bitmapHolder4 == null) {
                        imageLocation11 = ImageLocation.getForDocument(f7, (TLRPC.Document) d);
                    } else {
                        imageLocation11 = null;
                    }
                    if (bitmapHolder4 != null) {
                        bitmapDrawable6 = new BitmapDrawable(bitmapHolder4.bitmap);
                    } else {
                        bitmapDrawable6 = null;
                    }
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f31000j7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f31128y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f31128y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            }
        }
        ArrayList arrayList3 = this.Y6;
        if (!arrayList3.isEmpty() && i10 >= 0 && i10 < arrayList3.size()) {
            imageReceiver.setShouldGenerateQualityThumb(true);
            messageObject = (MessageObject) arrayList3.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            if (!TextUtils.isEmpty(MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                imageReceiver.setImageBitmap(this.f31128y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f30998j5 == null || imageReceiver != this.C4) ? null : null;
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
                        if (closestPhotoSizeWithSize3.f18146w < 100 && closestPhotoSizeWithSize3.h < 100) {
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
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f30998j5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f31128y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.C4 && (b6Var = this.f30996j2) != null) {
                b6Var.f(this.f30950e0);
                imageReceiver.setImageBitmap(this.f30996j2);
                return;
            } else if (this.C5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f30998j5 == null || imageReceiver != this.C4) ? null : null;
                    int i15 = (int) (2048.0f / AndroidUtilities.density);
                    if ((DownloadController.getInstance(this.T).getAutodownloadMask() & 8) == 0 && this.P4 != i10 && !FileLoader.getInstance(this.T).getPathToAttach(document8).exists()) {
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
                    imageReceiver.setImage(imageLocation8, a4.a.k(i15, i15, "_"), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z10) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f31128y;
                xu0 xu0Var = this.f30950e0;
                ?? drawable5 = new Drawable();
                drawable5.f29635a = 0L;
                drawable5.f29636b = 0.0f;
                drawable5.f29637c = 0.0f;
                drawable5.d = 0L;
                drawable5.e = 0.0f;
                drawable5.f29638f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.wc0.J;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.wc0.K;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.wc0.L.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.wc0.M.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.wc0.N.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.wc0.O.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.wc0.I.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f29639n = xu0Var;
                drawable5.f29640r = messageObject;
                drawable5.f29641s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
                TLRPC.Document document9 = messageObject.getDocument();
                if (document9 != null) {
                    String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
                    drawable5.E = documentFileName;
                    if (TextUtils.isEmpty(documentFileName)) {
                        drawable5.E = "name";
                    }
                    int lastIndexOf = drawable5.E.lastIndexOf(46);
                    if (lastIndexOf == -1) {
                        upperCase = "";
                    } else {
                        upperCase = drawable5.E.substring(lastIndexOf + 1).toUpperCase();
                    }
                    drawable5.f29644y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f29644y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f29643x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.E, messageObject.getDocument().mime_type, true)).mutate();
                    drawable5.F = AndroidUtilities.formatFileSize(document9.size);
                    if (((int) Math.ceil(textPaint2.measureText(drawable5.E))) > AndroidUtilities.dp(320.0f)) {
                        drawable5.E = TextUtils.ellipsize(drawable5.E, textPaint2, AndroidUtilities.dp(320.0f), TextUtils.TruncateAt.END).toString();
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
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f30998j5 == null || imageReceiver != this.C4) ? null : null;
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
            if ((messageObject == null || !messageObject.isWebpage()) && this.f31142z5 == 0 && !this.B5) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (messageObject != null) {
                if (this.C5 == 5) {
                    TLRPC.Document document10 = messageObject.getDocument();
                    j3 = 0;
                    TLRPC.VideoSize documentVideoThumb2 = MessageObject.getDocumentVideoThumb(document10);
                    if (documentVideoThumb2 != null) {
                        imageLocation = ImageLocation.getForDocument(documentVideoThumb2, document10);
                    }
                } else {
                    j3 = 0;
                }
                imageLocation = null;
            } else {
                j3 = 0;
                int i17 = (this.f31142z5 > 0L ? 1 : (this.f31142z5 == 0L ? 0 : -1));
                if (i17 != 0) {
                    if (i17 > 0) {
                        user = MessagesController.getInstance(this.T).getUser(Long.valueOf(this.f31142z5));
                    } else {
                        user = MessagesController.getInstance(this.T).getChat(Long.valueOf(-this.f31142z5));
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
                if (this.C5 == 5) {
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
            if (this.f31142z5 != j3) {
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
            if ((DownloadController.getInstance(this.T).getAutodownloadMask() & 1) == 0 && this.P4 != i10 && !FileLoader.getInstance(this.T).getPathToAttach(p12).exists()) {
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
            imageReceiver.setImageBitmap(this.f31128y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean E3() {
        org.telegram.ui.Components.s40 s40Var = this.f31038o2;
        if (s40Var != null && s40Var.d && !s40Var.e) {
            return true;
        }
        return false;
    }

    public final void F0() {
        cu0 cu0Var = this.L1;
        Activity activity = this.f31128y;
        kr0 kr0Var = new kr0(this, 1);
        if (cu0Var.L1) {
            cu0Var.w0(false);
        } else if (cu0Var.f41549g2) {
            cu0Var.l0(true);
        } else if (cu0Var.T0 && cu0Var.S0 != null) {
            cu0Var.r0(null, true);
        } else if (cu0Var.F0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, cu0Var.Q1);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new k2.v(kr0Var, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            S2(alertDialog$Builder);
        } else {
            kr0Var.run();
        }
    }

    public final void F1() {
        qg.p2 p2Var = this.p5;
        if (p2Var == null || !p2Var.V) {
            pe.b bVar = this.Z;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((ch.e) it.next()).O = true;
                }
            }
            pe.b bVar2 = this.f30913a0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            dt0 dt0Var = this.U1;
            if (dt0Var != null) {
                dt0Var.m();
            }
            et0 et0Var = this.V1;
            if (et0Var != null) {
                et0Var.m();
            }
            pu0 pu0Var = this.f31086t5;
            if (pu0Var != null) {
                pu0Var.invalidate();
            }
            pu0 pu0Var2 = this.f31104v5;
            if (pu0Var2 != null) {
                pu0Var2.invalidate();
            }
            pu0 pu0Var3 = this.f31114w5;
            if (pu0Var3 != null) {
                pu0Var3.invalidate();
            }
            pu0 pu0Var4 = this.f31124x5;
            if (pu0Var4 != null) {
                pu0Var4.invalidate();
            }
            pu0 pu0Var5 = this.f31133y5;
            if (pu0Var5 != null) {
                pu0Var5.invalidate();
            }
            at0 at0Var = this.R7;
            if (at0Var != null && at0Var.f27794e0) {
                at0Var.invalidate();
            }
            xu0 xu0Var = this.f30950e0;
            if (xu0Var != null) {
                xu0Var.invalidate();
            }
        }
    }

    public final void F2(int i10, org.telegram.ui.Components.fd0 fd0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (fd0Var != null) {
            fd0Var.a();
            fd0Var.setVisibility(8);
            ArrayList arrayList2 = this.f30974g7;
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
                fd0Var.setVisibility(0);
                if (this.f30934c2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fd0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    fd0Var.f23892a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(fd0Var.f23892a);
                    fd0Var.d = bitmapDrawable;
                    fd0Var.setBackground(bitmapDrawable);
                    return;
                }
                fd0Var.f23892a = null;
                fd0Var.d = null;
                fd0Var.setBackground(null);
            }
        }
    }

    public final void G0(boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(boolean, boolean):void");
    }

    public final boolean G1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.E.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public final void G2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G2(int, boolean, boolean, boolean):void");
    }

    public final void H0() {
        if (this.C1 != null) {
            return;
        }
        org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(this.E, this.f31101v2);
        this.C1 = ue0Var;
        ue0Var.setVisibility(8);
        this.C1.a();
        this.f30950e0.addView(this.C1, this.f30950e0.indexOfChild(this.Q7) - 1, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.C1.setDelegate(new vs0(this));
    }

    public final boolean H1() {
        org.telegram.ui.Components.jd f12 = f1();
        if (f12 != null) {
            if (f12.L.c() || f12.f4995f.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H2(View view, boolean z10, float f7, boolean z11) {
        float f10;
        HashMap hashMap = this.K0;
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
        float f11 = f10 * f7;
        int i10 = 0;
        if (z11 && bool != null) {
            if (z10) {
                view.setVisibility(0);
            }
            view.animate().alpha(f11).setDuration(100L).setUpdateListener(new jr0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new dm0(this, z10, view, 3)).start();
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
        if (this.f30983h7 != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                ImageLocation imageLocation = (ImageLocation) this.f30919a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f30983h7.location;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f30983h7.location;
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
        if (this.N1 != null) {
            return;
        }
        if (this.f30934c2 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.D1.f14075i;
        } else {
            cropState = this.X4.f38225c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        qg.p2 p2Var = this.p5;
        if (p2Var != null && p2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.p5.J);
            float width3 = createBitmap.getWidth();
            if ((this.p5.J / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f7 = width3 / width2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f7, ((-sourceBitmap.getHeight()) / 2.0f) * f7, (sourceBitmap.getWidth() / 2.0f) * f7, (sourceBitmap.getHeight() / 2.0f) * f7);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.C4.getBitmapWidth(), this.C4.getBitmapHeight(), config);
        if (this.C4.getBitmap() != null) {
            Bitmap bitmap = this.C4.getBitmap();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.C4.getOrientation());
            float width4 = createBitmap2.getWidth();
            if ((this.C4.getOrientation() / 90) % 2 != 0) {
                width = bitmap.getHeight();
            } else {
                width = bitmap.getWidth();
            }
            float f10 = width4 / width;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * f10, ((-bitmap.getHeight()) / 2.0f) * f10, (bitmap.getWidth() / 2.0f) * f10, (bitmap.getHeight() / 2.0f) * f10);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        bu0 bu0Var = new bu0(this, this.f31128y, this.T, createBitmap2, createBitmap, this.C4.getOrientation(), cropState2);
        this.N1 = bu0Var;
        bu0Var.f41752s.setOnClickListener(new lr0(this, 5));
        this.N1.v.setOnClickListener(new lr0(this, 6));
        this.N1.setEraser(this.M1);
        int indexOfChild = this.f30950e0.indexOfChild(this.f31095u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f30950e0.getChildCount();
        }
        this.f30950e0.addView(this.N1, indexOfChild, w7.x5.c(-1.0f, -1));
        this.O1 = false;
    }

    public final void J2(boolean z10, boolean z11) {
        if (this.f31062r0.getVisibility() != 0) {
            this.f31109w0.f31963f.q("", z10, true);
        } else if (Math.abs(this.f31082t1 - 1.0f) < 0.001f) {
            this.f31109w0.f31963f.q("", z10, true);
        } else {
            org.telegram.ui.Components.m6 m6Var = this.f31109w0.f31963f;
            m6Var.q(org.telegram.ui.Components.cd.a(this.f31082t1) + "x", z10, true);
        }
        this.f31062r0.d(this.f31082t1, z10);
        i91 i91Var = this.I0;
        float f7 = this.f31082t1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = i91Var.f34517a;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z11 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
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
        if (this.L1 == null) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) textureView;
                bitmapWidth = v61Var.getVideoWidth();
                bitmapHeight = v61Var.getVideoHeight();
                while (true) {
                    if (bitmapWidth <= 1280 && bitmapHeight <= 1280) {
                        break;
                    }
                    bitmapWidth /= 2;
                    bitmapHeight /= 2;
                }
            } else {
                bitmapWidth = this.C4.getBitmapWidth();
                bitmapHeight = this.C4.getBitmapHeight();
            }
            Bitmap bitmap2 = this.f31132y4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i10 = this.f30934c2;
            uu0 uu0Var = this.X4;
            boolean z10 = true;
            if (i10 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.D1.f14075i;
            } else {
                cropState = uu0Var.f38225c;
            }
            MediaController.CropState cropState2 = cropState;
            ci.j4 j4Var = new ci.j4(this.f30967g0, false, new qr0(this, 2));
            j4Var.f4843f = true;
            j4Var.f4844g = true;
            this.K1 = j4Var;
            if (this.f31094u4 == 3) {
                z10 = false;
            }
            j4Var.b(z10);
            Activity activity = this.f31128y;
            int i11 = this.T;
            if (this.f31063r1) {
                bitmap = null;
            } else {
                bitmap = this.C4.getBitmap();
            }
            cu0 cu0Var = new cu0(this, activity, activity, i11, bitmap3, bitmap, this.C4.getOrientation(), uu0Var.e, cropState2, new kr0(this, 14), this.f31101v2);
            this.L1 = cu0Var;
            ch.d c10 = this.Y.c(cu0Var.f41540c1, null, false);
            c10.o(eh.b.i(this.f31101v2));
            cu0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f30950e0.addView(this.L1.getView(), w7.x5.c(-1.0f, -1));
            this.L1.setOnDoneButtonClickedListener(new kr0(this, 15));
            this.L1.getCancelView().setOnClickListener(new lr0(this, 8));
            this.L1.t0(AndroidUtilities.dp(126.0f));
            this.L1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final void K2(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        mb0 mb0Var;
        Activity parentActivity;
        boolean z10;
        int i10;
        boolean z11;
        float f7;
        float f10;
        mb0 mb0Var2 = this.f31024m7;
        if (mb0Var2 != null) {
            mb0Var2.destroy();
            this.f31024m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            mb0Var = new mb0(launchActivity, true);
        } else {
            mb0Var = null;
        }
        this.f31024m7 = mb0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = o2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.j6.J(parentActivity, false);
        this.f31101v2 = f6Var;
        this.f31021m4 = o2Var;
        int i11 = UserConfig.selectedAccount;
        this.T = i11;
        this.C4.setCurrentAccount(i11);
        this.B4.setCurrentAccount(this.T);
        this.D4.setCurrentAccount(this.T);
        dt0 dt0Var = this.U1;
        if (dt0Var != null) {
            dt0Var.setAccount(this.T);
        }
        qg.p2 p2Var = this.p5;
        if (p2Var != null) {
            p2Var.setCurrentAccount(this.T);
        }
        if (this.f31128y != parentActivity && parentActivity != null) {
            this.f31071s = parentActivity instanceof BubbleActivity;
            this.f31128y = parentActivity;
            this.E = new ContextThemeWrapper(this.f31128y, R.style.Theme_TMessages);
            this.f31130y1 = ViewConfiguration.get(this.f31128y).getScaledTouchSlop();
            if (T8 == null) {
                T8 = new Drawable[]{f0.e.d(this.f31128y, R.drawable.circle_big), f0.e.d(this.f31128y, R.drawable.cancel_big), f0.e.d(this.f31128y, R.drawable.load_big)};
            }
            this.V6 = new Scroller(parentActivity);
            ev0 ev0Var = new ev0(this, parentActivity);
            this.f30967g0 = ev0Var;
            ev0Var.setBackground(this.L0);
            this.f30967g0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f30976h0 = clippingImageView;
            clippingImageView.N = this.f31006k4;
            clippingImageView.K = false;
            clippingImageView.M = false;
            this.f30967g0.addView(clippingImageView, w7.x5.c(40.0f, 40));
            xu0 xu0Var = new xu0(this, parentActivity, parentActivity);
            this.f30950e0 = xu0Var;
            xu0Var.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f30926b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f30950e0);
            }
            this.f30950e0.setClipChildren(true);
            this.f30950e0.setClipToPadding(true);
            this.f30967g0.setClipChildren(false);
            this.f30967g0.setClipToPadding(false);
            org.telegram.ui.Components.ha haVar = new org.telegram.ui.Components.ha(this.f30950e0);
            this.f30922b0 = haVar;
            haVar.f24606a = 1;
            this.X = new o0.a(this);
            this.f30913a0 = new pe.b();
            this.Z = new pe.b();
            ah.c cVar = new ah.c(this.X);
            this.Y = cVar;
            cVar.f(new hh.k(this.f30950e0), this.f30950e0);
            this.Y.e(this.f30913a0);
            this.f30932c0 = new org.telegram.ui.Components.la(this.f30922b0, this.f30950e0);
            this.f30967g0.addView(this.f30950e0, w7.x5.e(-1, -1, 51));
            r0.i0.m(this.f30950e0, new sr0(this));
            this.f30950e0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f30941d0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.f30941d0.flags = -2147286784;
            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(this.f31128y);
            this.f31132y4 = fd0Var;
            this.f30950e0.addView(fd0Var, w7.x5.c(-2.0f, -2));
            org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(this.f31128y);
            this.f31141z4 = fd0Var2;
            this.f30950e0.addView(fd0Var2, w7.x5.c(-2.0f, -2));
            org.telegram.ui.Components.fd0 fd0Var3 = new org.telegram.ui.Components.fd0(this.f31128y);
            this.A4 = fd0Var3;
            this.f30950e0.addView(fd0Var3, w7.x5.c(-2.0f, -2));
            org.telegram.ui.Components.w7 w7Var = new org.telegram.ui.Components.w7(this, parentActivity, 4);
            this.F = w7Var;
            w7Var.setOverlayTitleAnimation(true);
            this.F.setTitleColor(-1);
            this.F.setSubtitleColor(-1);
            this.F.setBackgroundColor(2130706432);
            this.F.setOccupyStatusBar(!this.f31071s);
            this.F.A(1090519039, false);
            this.F.B(-1, false);
            this.F.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.F.getBackButton();
            this.G = backButton;
            this.H = backButton.getBackground();
            this.I = null;
            cv0 cv0Var = new cv0(parentActivity);
            this.M = cv0Var;
            this.F.addView(cv0Var, w7.x5.e(-1, -1, 119));
            this.f30950e0.addView(this.F, w7.x5.c(-2.0f, -1));
            av0 av0Var = new av0(parentActivity);
            this.N = av0Var;
            this.f30950e0.addView(av0Var, w7.x5.e(-1, -2, 55));
            this.F.setActionBarMenuOnItemClick(new us0(this, f6Var));
            org.telegram.ui.ActionBar.a0 n10 = this.F.n();
            this.A0 = n10;
            n10.setOnLayoutListener(new kr0(this, 18));
            org.telegram.ui.ActionBar.w0 a2 = this.A0.a(26, R.drawable.menu_delete_old);
            this.E0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            w7.z5.a(this.E0);
            I2(this.E0, false, false);
            org.telegram.ui.ActionBar.w0 a10 = this.A0.a(11, R.drawable.msg_mask);
            this.D0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.w0 a11 = this.A0.a(18, R.drawable.msg_header_draw);
            this.C0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.w0 a12 = this.A0.a(4, R.drawable.msg_header_share);
            this.B0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.a0 a0Var = this.A0;
            as asVar = new as(this.E, R.drawable.video_settings, new ai.d());
            this.f31109w0 = asVar;
            org.telegram.ui.ActionBar.w0 d = a0Var.d(1, asVar);
            this.f31045p0 = d;
            this.f31109w0.setCallback(d.getIconView());
            this.f31045p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f31045p0.getPopupLayout().f18438c = true;
            this.f31045p0.getPopupLayout().setFitItems(true);
            this.f31045p0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.E, f6Var);
            this.f31062r0 = c1Var;
            c1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f31062r0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f31062r0.setDrawShadow(false);
            this.f31062r0.setBackgroundColor(-14540254);
            this.f31062r0.setTextColor(-1);
            this.f31062r0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f31062r0.setOnValueChange(new rr0(this, 1));
            this.f31045p0.getPopupLayout().a(this.f31062r0, w7.x5.n(-1, 44));
            org.telegram.ui.ActionBar.l1 a13 = this.f31045p0.a(-1);
            this.f31137z0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f31045p0.getPopupLayout();
            i91 i91Var = new i91(this.E, new sr0(this));
            this.I0 = i91Var;
            popupLayout.addView(i91Var);
            LinearLayout linearLayout = new LinearLayout(this.E);
            this.f31119x0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f31045p0.getPopupLayout().addView(this.f31119x0);
            org.telegram.ui.ActionBar.g1 e = this.f31045p0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f31072s0 = e;
            e.setSelectorColor(268435455);
            org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, this.E, 1);
            this.G0 = r7Var;
            try {
                r7Var.setRouteSelector(d6.a.c(this.E).a());
                z10 = true;
            } catch (Exception e7) {
                FileLog.e(e7);
                z10 = false;
            }
            this.G0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.g1 e10 = this.f31045p0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.F0 = e10;
                e10.d(false);
                this.F0.setSelectorColor(268435455);
                this.F0.addView(this.G0, 0, w7.x5.c(-1.0f, -1));
            }
            this.f31045p0.B(-115203550);
            this.f31045p0.setOnMenuDismiss(new qr0(this, 8));
            org.telegram.ui.ActionBar.w0 a14 = this.A0.a(0, R.drawable.media_more);
            this.f31036o0 = a14;
            a14.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f31036o0.setOnClickListener(new wr0(this, 3));
            this.f31036o0.setOnMenuDismiss(new qr0(this, 9));
            this.f31036o0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f31036o0.getPopupLayout().f18438c = true;
            this.f31036o0.getPopupLayout().setFitItems(true);
            this.J0 = new yr(this.E, this.f31036o0.getPopupLayout().getSwipeBack(), new sr0(this));
            org.telegram.ui.ActionBar.g1 i12 = this.f31036o0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.J0.f40005a);
            i12.c(-328966, -328966);
            this.f31081t0 = i12;
            i12.setOnClickListener(new wr0(this, 4));
            org.telegram.ui.ActionBar.l1 a15 = this.f31036o0.a(-1);
            this.f31090u0 = a15;
            a15.setColor(-15198184);
            this.f31036o0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).c(-328966, -328966);
            org.telegram.ui.ActionBar.g1 e11 = this.f31036o0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e11.c(-328966, -328966);
            this.f31099v0 = e11;
            org.telegram.ui.ActionBar.g1 e12 = this.f31036o0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.f31053q0 = e12;
            e12.c(-328966, -328966);
            this.f31036o0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).c(-328966, -328966);
            this.f31036o0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).c(-328966, -328966);
            this.f31036o0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).c(-328966, -328966);
            this.f31036o0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).c(-328966, -328966);
            this.f31036o0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).c(-328966, -328966);
            this.f31036o0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).c(-328966, -328966);
            this.f31036o0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).c(-328966, -328966);
            this.f31036o0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).c(-328966, -328966);
            this.f31036o0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).c(-328966, -328966);
            this.f31036o0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).c(-328966, -328966);
            this.f31036o0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).c(-328966, -328966);
            this.f31036o0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).c(-328966, -328966);
            this.f31036o0.B(-115203550);
            this.f31036o0.r(19);
            this.f31036o0.r(20);
            J2(false, true);
            this.f31036o0.setPopupItemsSelectorColor(268435455);
            this.f31036o0.setSubMenuDelegate(new vs0(this));
            ai.x5 x5Var = new ai.x5(this.E, 25);
            this.f30985i0 = x5Var;
            x5Var.setBackgroundColor(2130706432);
            this.f30950e0.addView(this.f30985i0, w7.x5.e(-1, 48, 83));
            View view = new View(this.E);
            this.f30994j0 = view;
            if (this.f30934c2 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view.setBackgroundColor(i10);
            this.f30967g0.addView(this.f30994j0, w7.x5.a(-1.0f, this.f31002k0 / AndroidUtilities.density, 87));
            this.f31100v1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f31100v1[0].setShape(0);
            this.f31100v1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f31100v1[1].setShape(0);
            org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30(this.E, AndroidUtilities.dp(10.0f));
            this.l1 = v30Var;
            this.f30950e0.addView(v30Var, w7.x5.e(-1, 68, 83));
            this.l1.setDelegate(new xs0(this));
            for (int i13 = 0; i13 < 3; i13++) {
                this.y3[i13] = new ImageView(this.f31128y);
                this.y3[i13].setImageResource(R.drawable.msg_maxvideo);
                this.y3[i13].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.y3[i13].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i13].setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
                this.y3[i13].setVisibility(4);
                this.y3[i13].setAlpha(1.0f);
                this.f30950e0.addView(this.y3[i13], w7.x5.c(48.0f, 48));
                this.y3[i13].setOnClickListener(new wr0(this, 5));
            }
            this.Q = new ys0(new ai.d());
            tu0 tu0Var = new tu0(this.f30950e0.getContext());
            this.Q1 = tu0Var;
            tu0Var.setFactory(new tg0(this, 2));
            this.Q1.setVisibility(4);
            y2(true);
            for (int i14 = 0; i14 < 3; i14++) {
                this.W0[i14] = new zs0(this, this.f30950e0);
                this.W0[i14].d(0, false, true);
            }
            ld ldVar = new ld(this, this.E, f6Var);
            this.X0 = ldVar;
            ldVar.setUseSelfAlpha(true);
            this.X0.setProgressColor(-1);
            this.X0.setSize(AndroidUtilities.dp(54.0f));
            this.X0.setBackgroundResource(R.drawable.circle_big);
            this.X0.setVisibility(4);
            this.X0.setAlpha(0.0f);
            this.f30950e0.addView(this.X0, w7.x5.e(64, 64, 17));
            L0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f31128y, f6Var);
            this.P7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.P7.setBackgroundResource(R.drawable.circle_big);
            this.P7.setVisibility(4);
            this.f30950e0.addView(this.P7, w7.x5.e(54, 54, 17));
            org.telegram.ui.Components.sf0 sf0Var = new org.telegram.ui.Components.sf0(this.f31128y);
            this.O7 = sf0Var;
            sf0Var.setBackgroundColor(2130706432);
            this.O7.a();
            this.O7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.O7.f27852b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.O7.f27852b;
            int i15 = org.telegram.ui.ActionBar.j6.f19272zf;
            textView.setTextColor(z1(i15));
            this.f30950e0.addView(this.O7, w7.x5.e(-1, 48, 83));
            this.O7.f27851a.setOnClickListener(new lr0(this, 2));
            this.O7.f27852b.setOnClickListener(new lr0(this, 3));
            org.telegram.ui.Components.x61 x61Var = new org.telegram.ui.Components.x61(false);
            this.f31138z1 = x61Var;
            x61Var.c(new vs0(this));
            xu0 xu0Var2 = this.f30950e0;
            Objects.requireNonNull(xu0Var2);
            this.A1 = new org.telegram.ui.Components.lo0(new sl0(xu0Var2, 13), false);
            hv0 hv0Var = new hv0(this.f31128y, this);
            this.N7 = hv0Var;
            hv0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.N7.setVisibility(4);
            this.N7.setBackgroundColor(2130706432);
            this.f30950e0.addView(this.N7, w7.x5.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            t5 t5Var = new t5(this, this.E);
            this.P0 = t5Var;
            this.f30950e0.addView(t5Var, w7.x5.e(-1, -2, 83));
            TextView textView2 = new TextView(this.f30950e0.getContext());
            this.f31011l0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f31011l0.setTypeface(AndroidUtilities.bold());
            this.f31011l0.setSingleLine(true);
            this.f31011l0.setMaxLines(1);
            TextView textView3 = this.f31011l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f31011l0.setTextColor(-1);
            this.f31011l0.setGravity(3);
            this.P0.addView(this.f31011l0, w7.x5.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f30950e0.getContext());
            this.m0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            this.m0.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.P0.addView(this.m0, w7.x5.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView5 = new TextView(this.f30950e0.getContext());
            this.f31027n0 = textView5;
            int i16 = org.telegram.ui.ActionBar.j6.Oh;
            textView5.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{6.0f}, z1(i16)));
            TextView textView6 = this.f31027n0;
            int i17 = org.telegram.ui.ActionBar.j6.Sh;
            textView6.setTextColor(z1(i17));
            this.f31027n0.setEllipsize(truncateAt);
            this.f31027n0.setGravity(17);
            this.f31027n0.setLines(1);
            this.f31027n0.setSingleLine(true);
            this.f31027n0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f31027n0.setTextSize(1, 15.0f);
            this.f31027n0.setTypeface(AndroidUtilities.bold());
            this.f31027n0.setOnClickListener(new lr0(this, 4));
            this.f31027n0.setVisibility(8);
            this.P0.addView(this.f31027n0, w7.x5.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            at0 at0Var = new at0(this.f31128y, this);
            this.R7 = at0Var;
            at0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.f31128y);
            this.Q7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.Q7.addView(this.R7, w7.x5.e(-1, 54, 83));
            c3(false, false);
            this.f30950e0.addView(this.Q7, w7.x5.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.w0 w0Var = this.E0;
            if (w0Var != null) {
                ch.d a16 = this.Y.a(w0Var);
                a16.o(eh.b.i(f6Var));
                a16.q(AndroidUtilities.dp(20.0f));
                a16.p(AndroidUtilities.dp(7.0f));
                w0Var.setBackground(gh.d.d(a16, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            bt0 bt0Var = new bt0(this.f31128y, LocaleController.getString(R.string.EditorSetCover));
            this.f30968g1 = bt0Var;
            ch.d a17 = this.Y.a(bt0Var);
            a17.o(eh.b.i(f6Var));
            bt0Var.setBlurredBackgroundDrawable(a17);
            w7.z5.a(this.f30968g1);
            this.f30968g1.setOnClickListener(new lr0(this, 7));
            this.f30950e0.addView(this.f30968g1, w7.x5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.kf0 kf0Var = new org.telegram.ui.Components.kf0(this.f31128y, f6Var, this.f30922b0);
            this.f31058q5 = kf0Var;
            org.telegram.ui.Components.pt ptVar = kf0Var.f25623c;
            ch.d a18 = this.Y.a(ptVar);
            a18.o(eh.b.i(f6Var));
            ptVar.setBlurredBackgroundDrawable(a18);
            w7.z5.a(this.f31058q5.f25623c);
            this.f31058q5.setVisibility(8);
            this.f31058q5.setAlpha(0.0f);
            this.f31058q5.setOnClose(new kr0(this, 12));
            this.f30950e0.addView(this.f31058q5, w7.x5.e(-1, -1, 119));
            this.f31058q5.f25622b.setOnClickListener(new lr0(this, 9));
            this.f31058q5.setOnGalleryImage(new qr0(this, 3));
            org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, this.f31128y, 2);
            this.f30951e1 = l0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            l0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.l0 l0Var2 = this.f30951e1;
            org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(this.f31128y);
            this.f30942d1 = kc0Var;
            l0Var2.setImageDrawable(kc0Var);
            this.f30951e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.l0 l0Var3 = this.f30951e1;
            ch.d a19 = this.Y.a(l0Var3);
            a19.o(eh.b.i(null));
            a19.p(AndroidUtilities.dp(4.0f));
            a19.q(AndroidUtilities.dp(16.0f));
            l0Var3.setBackground(a19);
            w7.z5.a(this.f30951e1);
            this.f30950e0.addView(this.f30951e1, w7.x5.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f30951e1.setOnClickListener(new lr0(this, 10));
            org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(this.f30950e0.getContext());
            this.f30960f1 = e90Var;
            e90Var.setOnClickListener(new lr0(this, 11));
            this.f30950e0.addView(this.f30960f1, w7.x5.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f30950e0.getContext();
            ev0 ev0Var2 = this.f30967g0;
            xu0 xu0Var3 = this.f30950e0;
            dt0 dt0Var2 = new dt0(this, context, ev0Var2, xu0Var3, xu0Var3, f6Var, this.f30922b0, new kr0(this, 19));
            this.U1 = dt0Var2;
            dt0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.U1.setOnTimerChange(new qr0(this, 4));
            this.U1.setAccount(this.T);
            this.U1.setOnHeightUpdate(new qr0(this, 5));
            this.U1.setOnAddPhotoClick(new lr0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.E;
            ev0 ev0Var3 = this.f30967g0;
            xu0 xu0Var4 = this.f30950e0;
            et0 et0Var = new et0(this, contextThemeWrapper, ev0Var3, xu0Var4, xu0Var4, f6Var, this.f30922b0, new kr0(this, 19));
            this.V1 = et0Var;
            et0Var.setBlurredBackgroundDrawableForMentions(this.Y);
            this.V1.D(true, false);
            this.V1.setOnTimerChange(new qr0(this, 6));
            this.V1.setAccount(this.T);
            this.V1.setOnHeightUpdate(new qr0(this, 7));
            this.V1.setOnAddPhotoClick(new lr0(this, 13));
            ai.n4 n4Var = new ai.n4(this, this.E);
            this.f31077s5 = n4Var;
            n4Var.setVisibility(8);
            this.f30950e0.addView(this.f31077s5, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            qg.p2 p2Var2 = new qg.p2(this.E, f6Var);
            this.p5 = p2Var2;
            p2Var2.setCurrentAccount(this.T);
            xu0 xu0Var5 = this.f30950e0;
            xu0Var5.addView(this.p5, xu0Var5.indexOfChild(this.F) - 1, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            pu0 pu0Var = new pu0(this);
            this.f31086t5 = pu0Var;
            pu0Var.setRad(18);
            this.f31086t5.l();
            this.p5.setStickerCutOutBtn(this.f31086t5);
            this.f31086t5.setOnClickListener(new lr0(this, 14));
            this.f31086t5.setCutOutState(false);
            this.f30950e0.addView(this.f31086t5, w7.x5.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f31128y);
            this.f31095u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            pu0 pu0Var2 = new pu0(this);
            this.f31104v5 = pu0Var2;
            pu0Var2.f41385n0 = true;
            pu0Var2.setRad(18);
            this.f31104v5.setEraseState(false);
            this.f31104v5.setOnClickListener(new lr0(this, 15));
            this.f31095u5.addView(this.f31104v5, w7.x5.n(-2, 36));
            this.f31095u5.addView(new Space(this.f31128y), w7.x5.n(12, -1));
            pu0 pu0Var3 = new pu0(this);
            this.f31114w5 = pu0Var3;
            pu0Var3.f41385n0 = true;
            pu0Var3.setRad(18);
            this.f31114w5.setRestoreState(false);
            this.f31114w5.setOnClickListener(new lr0(this, 16));
            this.f31095u5.addView(this.f31114w5, w7.x5.n(-2, 36));
            this.f30950e0.addView(this.f31095u5, w7.x5.e(-2, 36, 17));
            pu0 pu0Var4 = new pu0(this);
            this.f31124x5 = pu0Var4;
            pu0Var4.setUndoState(false);
            this.f31124x5.setRad(18);
            pu0 pu0Var5 = this.f31124x5;
            pu0Var5.f41385n0 = true;
            pu0Var5.setOnClickListener(new lr0(this, 17));
            this.f30950e0.addView(this.f31124x5, w7.x5.e(-2, 36, 17));
            pu0 pu0Var6 = new pu0(this);
            this.f31133y5 = pu0Var6;
            pu0Var6.setOutlineState(false);
            this.f31133y5.setRad(18);
            pu0 pu0Var7 = this.f31133y5;
            pu0Var7.f41385n0 = true;
            pu0Var7.setOnClickListener(new lr0(this, 18));
            this.f30950e0.addView(this.f31133y5, w7.x5.e(-2, 36, 17));
            W2(false, false);
            a3(false, false);
            j0 j0Var = new j0(this, this.f31128y, 17);
            this.X1 = j0Var;
            j0Var.addView(this.U1, w7.x5.e(-1, -1, 83));
            this.f30950e0.addView(this.X1, w7.x5.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.f31128y);
            this.Y1 = frameLayout2;
            frameLayout2.addView(this.V1, w7.x5.e(-1, -1, 51));
            this.f30950e0.addView(this.Y1, w7.x5.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.f31128y);
            this.Q0 = frameLayout3;
            this.f30950e0.addView(frameLayout3, w7.x5.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.f31128y);
            this.R0 = frameLayout4;
            this.f30950e0.addView(frameLayout4, w7.x5.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView7 = new TextView(this.f31128y);
            this.S7 = textView7;
            textView7.setSingleLine(true);
            this.S7.setVisibility(8);
            this.S7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.S7.setGravity(1);
            this.S7.setTextSize(1, 14.0f);
            this.S7.setTextColor(-7566196);
            this.f30950e0.addView(this.S7, w7.x5.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            ii.y1 y1Var = new ii.y1((NotificationCenter.NotificationCenterDelegate) this, (Context) this.f31128y, R.drawable.send_plane_24, f6Var, 4);
            this.S0 = y1Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            y1Var.I = dp;
            y1Var.J = dp2;
            ii.y1 y1Var2 = this.S0;
            y1Var2.f28086h0 = true;
            ch.d a20 = this.Y.a(y1Var2);
            a20.o(eh.b.i(f6Var));
            y1Var2.setBlurredBackgroundDrawable(a20);
            this.f30950e0.addView(this.S0, w7.x5.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.S0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            w7.z5.a(this.S0);
            this.S0.setOnClickListener(new lr0(this, 19));
            this.S0.setOnLongClickListener(new u(this, 5));
            org.telegram.ui.Components.lf0 lf0Var = new org.telegram.ui.Components.lf0(this.f31128y);
            this.T0 = lf0Var;
            LinearLayout linearLayout3 = lf0Var.f25897a;
            ch.d a21 = this.Y.a(linearLayout3);
            a21.o(eh.b.i(f6Var));
            a21.q(AndroidUtilities.dp(18.0f));
            a21.p(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.T0.f25898b;
            ch.d a22 = this.Y.a(linearLayout4);
            a22.o(eh.b.i(f6Var));
            a22.q(AndroidUtilities.dp(18.0f));
            a22.p(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a22);
            this.T0.setVisibility(8);
            this.T0.f25897a.setOnClickListener(new lr0(this, 20));
            this.T0.f25898b.setOnClickListener(new lr0(this, 21));
            this.f30950e0.addView(this.T0, w7.x5.e(-1, 56, 80));
            dc1 dc1Var = new dc1(this, this.f31128y, 14);
            this.H0 = dc1Var;
            dc1Var.setOrientation(0);
            this.H0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            dc1 dc1Var2 = this.H0;
            ch.d a23 = this.Y.a(dc1Var2);
            a23.o(eh.b.i(f6Var));
            a23.p(AndroidUtilities.dp(2.0f));
            a23.q(AndroidUtilities.dp(22.0f));
            dc1Var2.setBackground(a23);
            this.P0.addView(this.H0, w7.x5.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.f31128y);
            this.Z0 = imageView;
            imageView.setScaleType(scaleType);
            this.Z0.setImageResource(R.drawable.media_crop);
            this.Z0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Z0, w7.x5.n(48, 48));
            this.Z0.setOnClickListener(new lr0(this, 22));
            this.Z0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f31128y);
            this.f30923b1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f30923b1.setImageResource(R.drawable.msg_photo_rotate);
            this.f30923b1.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f30923b1, w7.x5.n(48, 48));
            this.f30923b1.setOnClickListener(new lr0(this, 23));
            this.f30923b1.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f31128y);
            this.f30914a1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f30914a1.setImageResource(R.drawable.media_flip);
            this.f30914a1.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f30914a1, w7.x5.n(48, 48));
            this.f30914a1.setOnClickListener(new lr0(this, 24));
            this.f30914a1.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f31128y);
            this.Y0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.media_draw);
            this.Y0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Y0, w7.x5.n(48, 48));
            this.Y0.setOnClickListener(new lr0(this, 25));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(this.f31128y);
            this.f30995j1 = t61Var;
            t61Var.setTag(1);
            this.f30995j1.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.X7 = v2();
            org.telegram.ui.Components.t61 t61Var2 = this.f30995j1;
            if (this.f31001j8 && this.Y7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            t61Var2.a(Math.min(this.f30949d8, this.f30957e8), z11, this.f31061r);
            this.f30995j1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.H0.addView(this.f30995j1, w7.x5.n(48, 48));
            this.f30995j1.setOnClickListener(new uv(26, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f31128y);
            this.f30933c1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f30933c1.setImageResource(R.drawable.media_settings);
            this.f30933c1.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f30933c1, w7.x5.n(48, 48));
            this.f30933c1.setOnClickListener(new lr0(this, 26));
            this.f30933c1.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.sf0 sf0Var2 = new org.telegram.ui.Components.sf0(this.E);
            this.U0 = sf0Var2;
            sf0Var2.setBackgroundColor(-872415232);
            this.U0.a();
            this.U0.setVisibility(8);
            this.f30950e0.addView(this.U0, w7.x5.e(-1, 48, 83));
            this.U0.f27851a.setOnClickListener(new lr0(this, 27));
            this.U0.f27852b.setOnClickListener(new lr0(this, 28));
            TextView textView8 = new TextView(this.E);
            this.V0 = textView8;
            textView8.setClickable(false);
            this.V0.setVisibility(8);
            this.V0.setTextSize(1, 14.0f);
            this.V0.setTextColor(-1);
            this.V0.setGravity(17);
            this.V0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(-12763843, 0));
            this.V0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.V0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.V0.setTypeface(AndroidUtilities.bold());
            this.U0.addView(this.V0, w7.x5.e(-2, -1, 49));
            this.V0.setOnClickListener(new lr0(this, 29));
            org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(this.f30950e0.getContext(), this);
            this.f31068r6 = j20Var;
            j20Var.b();
            this.f31078s6 = true;
            this.f31068r6.h = this;
            sr0 sr0Var = new sr0(this);
            this.C4.setParentView(this.f30950e0);
            this.C4.setCrossfadeAlpha((byte) 2);
            this.C4.setInvalidateAll(true);
            this.C4.setDelegate(sr0Var);
            this.B4.setParentView(this.f30950e0);
            this.B4.setCrossfadeAlpha((byte) 2);
            this.B4.setInvalidateAll(true);
            this.B4.setDelegate(sr0Var);
            this.D4.setParentView(this.f30950e0);
            this.D4.setCrossfadeAlpha((byte) 2);
            this.D4.setInvalidateAll(true);
            this.D4.setDelegate(sr0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f30950e0.getContext(), R.drawable.selectphoto_large);
            this.N0 = checkBox;
            checkBox.setDrawBackground(true);
            this.N0.setHasBorder(true);
            this.N0.setSize(34);
            this.N0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.N0.c(z1(i15), -1);
            this.N0.setVisibility(8);
            xu0 xu0Var6 = this.f30950e0;
            CheckBox checkBox2 = this.N0;
            if (rotation != 3 && rotation != 1) {
                f7 = 71.0f;
            } else {
                f7 = 61.0f;
            }
            xu0Var6.addView(checkBox2, w7.x5.d(34, 34.0f, 53, 0.0f, f7, 11.0f, 0.0f));
            if (!this.f31071s) {
                ((FrameLayout.LayoutParams) this.N0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.N0.setOnClickListener(new wr0(this, 0));
            CounterView counterView = new CounterView(this.f31128y);
            this.O0 = counterView;
            xu0 xu0Var7 = this.f30950e0;
            if (rotation != 3 && rotation != 1) {
                f10 = 68.0f;
            } else {
                f10 = 58.0f;
            }
            xu0Var7.addView(counterView, w7.x5.d(40, 40.0f, 53, 0.0f, f10, 64.0f, 0.0f));
            if (!this.f31071s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.O0.setOnClickListener(new wr0(this, 1));
            lv0 lv0Var = new lv0(this.f31128y);
            this.f31037o1 = lv0Var;
            lv0Var.setVisibility(8);
            this.f31037o1.setAlpha(0.0f);
            this.f31037o1.setLayoutManager(new gg.b0());
            lv0 lv0Var2 = this.f31037o1;
            yu0 yu0Var = new yu0(this.f31128y, this);
            this.f31046p1 = yu0Var;
            lv0Var2.setAdapter(yu0Var);
            this.f30950e0.addView(this.f31037o1, w7.x5.e(-1, 103, 51));
            this.f31037o1.setOnItemClickListener(new i(this, 22));
            UndoView undoView = new UndoView(this.E, null, false, f6Var);
            this.f31028n1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f31028n1.i();
            this.f30950e0.addView(this.f31028n1, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.E);
                this.T3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new wr0(this, 2));
                this.f30950e0.addView(this.T3, w7.x5.e(64, 64, 17));
            }
            this.f31027n0.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{6.0f}, z1(i16)));
            this.f31027n0.setTextColor(z1(i17));
            ys0 ys0Var = this.Q;
            ys0Var.f19967k0 = true;
            ys0Var.f19963i0 = false;
            org.telegram.ui.Cells.ca o9 = ys0Var.o(this.f30967g0.getContext());
            if (o9 != null) {
                AndroidUtilities.removeFromParent(o9);
                this.f30950e0.addView(o9);
            }
            this.Q.T(this.f30950e0);
            this.Q.S();
            this.f30912a.a(false, false);
            return;
        }
        u3();
    }

    public final void L0() {
        mv0 mv0Var = new mv0(this.f30950e0.getContext(), this);
        this.f30988i3 = mv0Var;
        this.f30950e0.addView(mv0Var, w7.x5.e(-1, 48, 83));
        vs0 vs0Var = new vs0(this);
        nt0 nt0Var = new nt0(this, vs0Var);
        u50 u50Var = new u50(this, this.f30950e0.getContext(), 4);
        this.f31065r3 = u50Var;
        u50Var.setAccessibilityDelegate(nt0Var);
        this.f31065r3.setImportantForAccessibility(1);
        this.f30988i3.addView(this.f31065r3, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(this.f31065r3);
        this.f31056q3 = j71Var;
        j71Var.f25172z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.j71 j71Var2 = this.f31056q3;
        j71Var2.f25158k = 872415231;
        j71Var2.f25159l = 872415231;
        j71Var2.f25160m = -1;
        j71Var2.f25161n = -1;
        j71Var2.A = 1509949439;
        j71Var2.f25157j = vs0Var;
        ot0 ot0Var = new ot0(this, this.f30950e0.getContext(), new sr0(this));
        this.f31075s3 = ot0Var;
        ot0Var.setAlpha(0.0f);
        this.f30950e0.addView(this.f31075s3, w7.x5.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this.f30950e0.getContext());
        this.f31039o3 = k5Var;
        k5Var.setTextColor(-1);
        this.f31039o3.setGravity(53);
        this.f31039o3.setTextSize(14);
        this.f31039o3.setImportantForAccessibility(2);
        this.f30988i3.addView(this.f31039o3, w7.x5.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f30950e0.getContext());
        this.f31048p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f31048p3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f31048p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f31048p3.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        this.f31048p3.setVisibility(4);
        this.f30988i3.addView(this.f31048p3, w7.x5.e(48, 48, 53));
        this.f31048p3.setOnClickListener(new wr0(this, 6));
    }

    public final void L2(org.telegram.ui.Components.vi viVar) {
        this.a2 = viVar;
        yf.k0 k0Var = this.f30924b2;
        if (k0Var != null) {
            k0Var.destroy();
            this.f30924b2 = null;
        }
        if (viVar != null) {
            this.f30924b2 = viVar.obtainWindowVisibilityController();
        }
    }

    public final void M0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.na naVar;
        if (this.B2 == null) {
            ut0 ut0Var = new ut0(this.f31128y, this);
            this.f31131y2 = ut0Var;
            ut0Var.setWillNotDraw(false);
            this.f31131y2.setVisibility(4);
            this.f30950e0.addView(this.f31131y2, 0, w7.x5.e(-1, -1, 17));
            this.D2 = false;
            if (this.f30974g7.isEmpty()) {
                if (this.f30921b && this.T2 == null) {
                    this.C2 = new SurfaceView(this.f31128y);
                    this.D2 = true;
                } else {
                    this.B2 = new TextureView(this.f31128y);
                }
            } else {
                org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(this.f31128y, this.F2);
                this.f30922b0.e();
                org.telegram.ui.Components.ha haVar = this.f30922b0;
                v61Var.f28642s = haVar;
                org.telegram.ui.Components.vz vzVar = v61Var.f28637b;
                if (vzVar != null && (naVar = vzVar.I) != null) {
                    org.telegram.ui.Components.ha haVar2 = naVar.f26422t;
                    if (haVar2 != null && haVar2.f24615m != null) {
                        haVar2.f24615m = null;
                    }
                    naVar.f26422t = haVar;
                    if (haVar != null && haVar.f24615m != naVar) {
                        haVar.f24615m = naVar;
                        haVar.d();
                    }
                }
                if (savedFilterState != null) {
                    v61Var.setDelegate(new nl0(savedFilterState, 3));
                }
                this.B2 = v61Var;
            }
            SurfaceTexture surfaceTexture = this.T2;
            if (surfaceTexture != null) {
                this.B2.setSurfaceTexture(surfaceTexture);
                this.H3 = true;
                this.I3 = true;
                this.T2 = null;
            }
            TextureView textureView = this.B2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.B2.setPivotY(0.0f);
                this.B2.setOpaque(false);
                this.f31131y2.addView(this.B2, w7.x5.e(-1, -1, 17));
            } else {
                this.f31131y2.addView(this.C2, w7.x5.e(-1, -1, 17));
            }
            wu0 wu0Var = new wu0(this.f31128y, this);
            this.E2 = wu0Var;
            wu0Var.setPivotX(0.0f);
            this.E2.setPivotY(0.0f);
            this.E2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f31131y2.addView(this.E2, w7.x5.e(-1, -1, 17));
            View view = new View(this.f31128y);
            this.O8 = view;
            this.f31131y2.addView(view, w7.x5.c(-1.0f, -1));
            if (this.f30934c2 == 1) {
                View view2 = new View(this.f31128y);
                this.f31139z2 = view2;
                view2.setBackgroundColor(-1);
                this.f31139z2.setAlpha(0.0f);
                this.f31131y2.addView(this.f31139z2, w7.x5.e(-1, -1, 17));
            }
            pf.e eVar = this.G2;
            if (eVar != null) {
                ut0 ut0Var2 = this.f31131y2;
                eVar.f40820i.P(ut0Var2);
                eVar.f40821j = ut0Var2;
                if (ut0Var2 != null) {
                    eVar.e(ut0Var2);
                }
                this.G2.f40822k = this.O8;
            }
        }
    }

    public final void M2() {
        bo boVar;
        TLRPC.Chat chat;
        dv0 dv0Var = this.d;
        if (dv0Var != null) {
            if (dv0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f31026n && (boVar = this.l4) != null && (chat = boVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.c5.N(this.f31128y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).o();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, n1());
            boolean x10 = this.d.x(this.P4);
            this.N0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f31046p1.o(k10);
                    this.f31037o1.y0(k10);
                } else {
                    this.f31046p1.u(k10);
                    if (k10 == 0) {
                        this.f31046p1.m(0);
                    }
                }
            }
            A3();
        }
    }

    public final boolean N0() {
        boolean z10 = false;
        if (this.f31050p6 != null || this.C1 == null) {
            return false;
        }
        this.f30973g6 = 1.0f;
        this.f31033n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31050p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f27225g, 0.0f, 1.0f));
        this.f31050p6.setDuration(250L);
        this.f31050p6.setInterpolator(org.telegram.ui.Components.qr.f27380f);
        this.f31050p6.addListener(new kt0(this, 0));
        this.f31050p6.start();
        lg.n nVar = this.C1.f28369b.L;
        if (nVar != null) {
            z10 = nVar.f14107j;
        }
        return !z10;
    }

    public final void N2() {
        float bitmapWidth = this.C4.getBitmapWidth();
        float bitmapHeight = this.C4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float k12 = k1(this.f31094u4);
            float i12 = i1();
            float min = Math.min(i12 / bitmapHeight, k12 / bitmapWidth);
            float max = Math.max(k12 / ((int) (bitmapWidth * min)), i12 / ((int) (bitmapHeight * min)));
            this.f30918a6 = max;
            w3(max);
        }
    }

    public final boolean O0(float f7, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.ue0 ue0Var;
        float f10;
        if (this.f31050p6 == null && (ue0Var = this.C1) != null) {
            ue0Var.f28369b.i();
            this.f30928b6 = 0.0f;
            this.f30965f6 = 0.0f + f7;
            if (z10) {
                this.f30973g6 = 1.0f;
            }
            this.f31033n6 = System.currentTimeMillis();
            this.f31050p6 = new AnimatorSet();
            if (this.f30934c2 == 1) {
                this.f30956e6 = 1.0f;
                this.f30918a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.C4.getBitmapHeight();
                    if (Math.abs((((int) this.C1.f28369b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.X4.f38225c;
                    if (cropState != null) {
                        bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                        bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                    }
                    float f11 = bitmapWidth;
                    float f12 = bitmapHeight;
                    float min = Math.min(k1(1) / f11, h1(1, false) / f12);
                    if (Math.abs((f7 / 90.0f) % 2.0f) == 1.0f) {
                        f10 = Math.min(k1(1) / f12, h1(1, false) / f11);
                    } else {
                        f10 = min;
                    }
                    this.f30956e6 = f10 / min;
                }
            }
            if (this.f30934c2 == 11) {
                this.f30918a6 = r2(false) * this.f30918a6;
                this.f30956e6 = r2(false) * this.f30956e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ci.bb(this, f7, this.C1.f28370c.getRotation(), 4));
            this.f31050p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f27225g, 0.0f, 1.0f), ofFloat);
            this.f31050p6.setDuration(250L);
            this.f31050p6.setInterpolator(org.telegram.ui.Components.qr.f27380f);
            this.f31050p6.addListener(new lt0(this, f7, runnable));
            this.f31050p6.start();
            if (Math.abs(this.C1.f28369b.getStateOrientation() + f7) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void O2(CharSequence charSequence) {
        cv0 cv0Var = this.M;
        this.f30954e4 = charSequence;
        cv0Var.c(charSequence);
        j3(true, false);
    }

    public final void P0() {
        if (this.f31128y != null && this.f30967g0 != null) {
            if (org.telegram.ui.Components.fg0.f23911p0.P) {
                org.telegram.ui.Components.fg0.j(false);
            }
            o2();
            n2(false);
            try {
                if (this.f30967g0.getParent() != null) {
                    ((WindowManager) this.f31128y.getSystemService("window")).removeViewImmediate(this.f30967g0);
                    V1();
                }
                this.f30967g0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f30998j5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f30998j5 = null;
            }
            this.f30976h0.setImageBitmap(null);
            if (this == f30911a9) {
                f30911a9 = null;
            } else {
                Z8 = null;
            }
            V1();
        }
    }

    public final boolean P1() {
        if (this.f30934c2 != 11) {
            int i10 = this.P4;
            if (i10 >= 0) {
                ArrayList arrayList = this.f30974g7;
                if (i10 < arrayList.size()) {
                    dv0 dv0Var = this.d;
                    if (dv0Var != null && !dv0Var.N()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.P4);
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
        if (this.f31013l3 != z10) {
            if (z10) {
                this.f30985i0.setTag(1);
            } else {
                this.f30985i0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f31005k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31013l3 = z10;
            float f7 = 0.0f;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    this.f30988i3.setVisibility(0);
                }
                float alpha = this.f30988i3.getAlpha();
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new jr0(this, 0));
                ofFloat.addListener(new vt0(this, z10, 0));
                this.f31005k3 = ofFloat;
                ofFloat.start();
            } else {
                mv0 mv0Var = this.f30988i3;
                if (!z10) {
                    i10 = 8;
                }
                mv0Var.setVisibility(i10);
                mv0 mv0Var2 = this.f30988i3;
                if (z10) {
                    f7 = 1.0f;
                }
                mv0Var2.setAlpha(f7);
            }
            if (this.f31004k2 && this.f31000j7 == null) {
                if (z10) {
                    this.f31036o0.K(9);
                } else {
                    this.f31036o0.r(9);
                }
            }
        }
    }

    public final void Q0() {
        if (this.C4.getAnimation() == null && !this.f30974g7.isEmpty() && this.f30934c2 != 1) {
            String imageKey = this.C4.getImageKey();
            String str = this.f31123x4;
            if (str == null || !str.equals(imageKey)) {
                this.f31113w4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.C4.getBitmapSafe();
                int orientation = this.C4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.t11(this, bitmapSafe, orientation, imageKey, 8));
                }
            }
        }
    }

    public final boolean Q1() {
        if (this.e && this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean Q2(int i10) {
        zu0 zu0Var = this.f31000j7;
        if (zu0Var != null) {
            if ((zu0Var.a(i10) || this.f31000j7.e(i10)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f31000j7.b(i10);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f31000j7.d(i10) instanceof TLRPC.Document)) {
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
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Y7)), this.X7);
        edit.commit();
        D3();
        B3();
    }

    public final void R1() {
        WindowManager.LayoutParams layoutParams = this.f30941d0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.f31128y.getSystemService("window")).updateViewLayout(this.f30967g0, this.f30941d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f30967g0.setFocusable(true);
        this.f30950e0.setFocusable(true);
    }

    public final void S0() {
        mb0 mb0Var = this.f31024m7;
        if (mb0Var != null) {
            mb0Var.destroy();
            this.f31024m7 = null;
        }
        yf.k0 k0Var = this.f30924b2;
        if (k0Var != null) {
            k0Var.destroy();
            this.f30924b2 = null;
        }
        try {
            if (this.f30967g0.getParent() != null) {
                ((WindowManager) this.f31128y.getSystemService("window")).removeView(this.f30967g0);
                V1();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f7, boolean z10) {
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
        if (f10 > f7 || height > f7) {
            float max = Math.max(width, height) / f7;
            height = (int) (height / max);
            width = (int) (f10 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        Paint paint = U8;
        if (z10) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f7 == 512.0f) {
            i10 = 83;
        } else {
            i10 = 87;
        }
        createBitmap.compress(g12, i10, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z11) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void S2(AlertDialog$Builder alertDialog$Builder) {
        if (this.f31128y != null) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.P1;
                if (c2Var != null) {
                    c2Var.dismiss();
                    this.P1 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                org.telegram.ui.ActionBar.c2 o9 = alertDialog$Builder.o();
                this.P1 = o9;
                o9.setCanceledOnTouchOutside(true);
                this.P1.setOnDismissListener(new r5(this, 11));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void T0(android.graphics.Canvas r51, org.telegram.ui.Components.la r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T0(android.graphics.Canvas, org.telegram.ui.Components.la, int, int, boolean, boolean, boolean):void");
    }

    public final void T1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(boolean):void");
    }

    public final boolean T2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f31021m4;
        if ((o2Var instanceof bo) && ChatObject.isChannelAndNotMegaGroup(((bo) o2Var).e)) {
            org.telegram.ui.Components.oc f7 = new org.telegram.ui.Components.vc(frameLayout, this.f31101v2).f(MessagesController.getInstance(this.T).captionLengthLimitPremium, new kr0(this, 26));
            f7.v = new kr0(this, 27);
            this.f31034n7 = f7.j();
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f31128y, 0, this.f31101v2);
        alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.T4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.T4.currentAccount).isLoadingFile(this.f30937c5[0])) {
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.PleaseDownload);
        }
        S2(alertDialog$Builder);
    }

    public final void V0(Canvas canvas) {
        boolean z10;
        float e;
        int i10;
        if (this.S4) {
            if (!SharedConfig.photoViewerBlur) {
                e = 1.0f;
            } else {
                int i11 = this.f31031n4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e = this.D8.e(z10);
            }
            if (e <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (AndroidUtilities.statusBarHeight * 1.5f));
            int height = this.P0.getHeight() + AndroidUtilities.navigationBarHeight;
            if (this.U1.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(20.0f) + (this.U1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            if (this.F7 == null) {
                this.F7 = new Path();
                Paint paint = new Paint(1);
                this.G7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.H7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.I7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.J7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.K7 = new Matrix();
                this.L7 = new Matrix();
                this.G7.setShader(this.I7);
                this.H7.setShader(this.J7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f30950e0.getWidth(), this.f30950e0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e * (this.L0.getAlpha() - 127) * 2.007874f), 31);
            this.F7.rewind();
            float f7 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.F7.addRect(0.0f, 0.0f, this.f30950e0.getWidth(), f7, direction);
            this.F7.addRect(0.0f, (this.f30950e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f30950e0.getWidth(), this.f30950e0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.F7);
            canvas.drawColor(-16777216);
            T0(canvas, this.f30932c0, 0, 0, true, true, false);
            canvas.save();
            this.K7.reset();
            this.K7.postScale(1.0f, f7 / 16.0f);
            this.I7.setLocalMatrix(this.K7);
            this.G7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f30950e0.getWidth(), f7, this.G7);
            this.L7.reset();
            this.L7.postScale(1.0f, i12 / 16.0f);
            this.L7.postTranslate(0.0f, (this.f30950e0.getHeight() - i12) + AndroidUtilities.navigationBarHeight);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f30950e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f30950e0.getWidth(), this.f30950e0.getHeight() + AndroidUtilities.navigationBarHeight, this.H7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void V1() {
        Activity activity = this.f31128y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f30829a1.remove(this.f31073s1);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f31021m4;
        if (o2Var != null && o2Var.getFragmentView() != null) {
            this.f31023m6 = 1.0f;
            View fragmentView = this.f31021m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.vi viVar = this.a2;
            if (viVar != null) {
                org.telegram.ui.ActionBar.e3 container = viVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void V2(final org.telegram.ui.Components.jd jdVar, boolean z10, boolean z11, final float[] fArr) {
        float f7;
        float f10;
        int i10;
        dv0 dv0Var = this.d;
        if (dv0Var != null && dv0Var.l()) {
            f7 = 175.0f;
        } else {
            f7 = 58.0f;
        }
        float dp = AndroidUtilities.dp(f7);
        float f11 = 1.0f;
        if (jdVar == this.V1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f12 = dp * f10;
        Integer num = null;
        if (!z11) {
            jdVar.animate().setListener(null).cancel();
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jdVar.setVisibility(i10);
            if (z10) {
                f12 = 0.0f;
            }
            jdVar.setTranslationY(f12);
            float alpha = this.P0.getAlpha();
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[0] = f11;
            jdVar.setAlpha(alpha * f11);
        } else if (z10 && jdVar.getTag() == null) {
            if (jdVar.getVisibility() != 0) {
                jdVar.setVisibility(0);
                jdVar.setAlpha(this.P0.getAlpha());
                jdVar.setTranslationY(f12);
            }
            jdVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f33751b;

                {
                    this.f33751b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f33751b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = jdVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.Q7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f30951e1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f30960f1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f30968g1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f33751b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = jdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.Q7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f30951e1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f30960f1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f30968g1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        } else if (!z10 && jdVar.getTag() != null) {
            jdVar.animate().translationY(f12).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f33751b;

                {
                    this.f33751b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f33751b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = jdVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.Q7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f30951e1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f30960f1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f30968g1.setTranslationY(photoViewer.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f33751b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = jdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.Q7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f30951e1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f30960f1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f30968g1.setTranslationY(photoViewer2.U1.getAlpha() * (-hg.k0.f(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).withEndAction(new kh(3, jdVar)).start();
        }
        if (z10) {
            num = 1;
        }
        jdVar.setTag(num);
    }

    public final void W0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void W1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.F2 != null && this.T4 != null) {
                    int intValue = Utilities.parseInt((CharSequence) url).intValue();
                    if (this.F2.p() == -9223372036854775807L) {
                        this.f30915a3 = intValue / ((float) this.T4.getDuration());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.F2.K(j3);
                    this.f31056q3.h(((float) j3) / ((float) this.F2.p()), true);
                    this.f31065r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f31128y instanceof LaunchActivity) {
                    wy wyVar = new wy(null);
                    wyVar.f39260n2 = url;
                    ((LaunchActivity) this.f31128y).q0(wyVar, false, true);
                    G0(false, false);
                    return;
                }
                return;
            } else if (this.l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.p51) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.c5.q0(this.l4, url, true, true);
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
        dv0 dv0Var = this.d;
        boolean z14 = false;
        if (dv0Var != null && dv0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        dt0 dt0Var = this.U1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(dt0Var, z13, z11, this.f31135y7);
        et0 et0Var = this.V1;
        if (z10 && z12) {
            z14 = true;
        }
        V2(et0Var, z14, z11, this.f31144z7);
    }

    public final void X0(TLRPC.Document document, TLRPC.Document document2, boolean z10, Utilities.Callback2 callback2) {
        float f7;
        this.f31097u7 = document;
        this.f31088t7 = document2;
        this.f31106v7 = z10;
        this.f31116w7 = false;
        this.f31126x7 = callback2;
        this.f30928b6 = 0.0f;
        this.f30965f6 = 0.0f;
        if (this.p5 != null) {
            pu0 pu0Var = this.f31133y5;
            if (pu0Var != null) {
                pu0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList = this.f31067r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f31097u7 != null) {
            ArrayList arrayList2 = this.f31067r5;
            if (arrayList2 == null) {
                this.f31067r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f31097u7, Integer.valueOf(this.T));
            if (findStickerEmoticons != null) {
                this.f31067r5.addAll(findStickerEmoticons);
            }
        }
        pu0 pu0Var2 = this.f31086t5;
        if (pu0Var2 != null) {
            pu0Var2.setCutOutState(false);
        }
        a3(true, false);
        ImageView imageView = this.f30933c1;
        if (imageView != null) {
            if (this.f31106v7) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
        }
    }

    public final void X1(fv0 fv0Var) {
        if (this.f31092u2) {
            n2(true);
        }
        MessageObject messageObject = this.T4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        }
        this.e = false;
        this.f30958f = false;
        this.f30969g2 = false;
        this.f31076s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f30917a5 = null;
        this.f30927b5 = null;
        this.f30990i5 = null;
        this.f30955e5 = null;
        this.f31055q2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f30988i3 != null) {
            P2(false, false);
        }
        du0 du0Var = this.T1;
        if (du0Var != null) {
            du0Var.scrollTo(0, 0);
        }
        this.f30934c2 = 0;
        this.f30943d2 = false;
        this.f30952e2 = false;
        this.f30961f2 = false;
        this.f30978h2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f30998j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f30998j5 = null;
        }
        this.a2 = null;
        yf.k0 k0Var = this.f30924b2;
        if (k0Var != null) {
            k0Var.destroy();
            this.f30924b2 = null;
        }
        org.telegram.ui.Components.b6 b6Var = this.f30996j2;
        if (b6Var != null) {
            b6Var.w(this.f30950e0);
            this.f30996j2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            bv0 bv0Var = this.W0[i10];
            if (bv0Var != null) {
                bv0Var.d(-1, false, true);
            }
        }
        p2(0);
        at0 at0Var = this.R7;
        if (at0Var != null) {
            at0Var.a();
        }
        this.f31028n1.e(0, false);
        this.C4.setImageBitmap((Bitmap) null);
        this.F4.a();
        this.B4.setImageBitmap((Bitmap) null);
        this.E4.a();
        this.D4.setImageBitmap((Bitmap) null);
        this.G4.a();
        this.f30950e0.post(new mr0(this, fv0Var, 0));
        dv0 dv0Var = this.d;
        if (dv0Var != null) {
            dv0Var.G();
        }
        org.telegram.ui.Components.v30 v30Var = this.l1;
        v30Var.d.clear();
        v30Var.e.clear();
        v30Var.f28583c.clear();
        dv0 dv0Var2 = this.d;
        if (dv0Var2 != null) {
            dv0Var2.D();
        }
        this.d = null;
        this.f31046p1.l();
        this.f31000j7 = null;
        this.f31076s4 = false;
        this.f31035n8 = 0.0f;
        this.f31044o8 = 1.0f;
        if (fv0Var != null) {
            fv0Var.f33763a.setVisible(true, true);
        }
        bo boVar = this.l4;
        if (boVar != null) {
            boVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
    }

    public final void X2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X2(boolean, boolean):void");
    }

    public final void Y1(org.telegram.messenger.MessageObject r23, org.telegram.tgnet.TLRPC.FileLocation r24, org.telegram.messenger.ImageLocation r25, org.telegram.messenger.ImageLocation r26, java.util.ArrayList r27, java.util.ArrayList r28, java.util.List r29, int r30, org.telegram.ui.fv0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.fv0):void");
    }

    public final void Y2(boolean z10) {
        float f7;
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
        if (z10 && this.H3 && this.I3 && !this.F3 && (textureView = this.B2) != null) {
            this.O4 = textureView.getBitmap();
        }
        if (z10) {
            this.Z7 = this.X7;
        }
        AnimatorSet animatorSet = this.T7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.T7 = new AnimatorSet();
        float f19 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f30994j0.setVisibility(0);
                View view = this.f30994j0;
                if (this.f30934c2 == 11) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                view.setAlpha(f18);
                View view2 = this.f30994j0;
                if (this.f30934c2 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.N7.setTag(1);
            AnimatorSet animatorSet2 = this.T7;
            t5 t5Var = this.P0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.U1.getEditTextHeight() + t5Var.getHeight();
            if (this.f31063r1) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t5Var, property, 0.0f, editTextHeight + i10);
            t5 t5Var2 = this.P0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t5Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.S0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f30994j0;
            if (this.S4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f17, 1.0f));
        } else {
            this.N7.setTag(null);
            AnimatorSet animatorSet3 = this.T7;
            hv0 hv0Var = this.N7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hv0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.O7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f30994j0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f7));
        }
        this.T7.addListener(new vt0(this, z10, 3));
        this.T7.setDuration(200L);
        this.T7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.T7.start();
        float f20 = 0.25f;
        if (this.f30951e1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f30951e1.animate();
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
        if (this.f30960f1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f30960f1.animate();
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
        if (this.f30968g1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f30968g1.animate();
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
        if (this.f31128y != null) {
            bo boVar = this.l4;
            if (boVar != null) {
                a2 = boVar.a();
            } else {
                dv0 dv0Var = this.d;
                if (dv0Var != null) {
                    a2 = dv0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a2;
            org.telegram.ui.Components.c5.K(this.f31128y, j3, -1L, 0, false, new sr0(this), null, new org.telegram.ui.Components.a5(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false)), null);
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        if (org.telegram.ui.Components.fg0.f23911p0.P) {
            org.telegram.ui.Components.fg0.j(false);
        }
        this.P8 = pVar;
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            h71Var.U(null);
            this.F2.V(null);
            this.F2.C();
            this.F2.V(this.Q8);
        }
        ((WindowManager) this.f31128y.getSystemService("window")).removeView(this.f30967g0);
        this.R8 = true;
        this.f30967g0.invalidate();
    }

    public final int a1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.f30934c2 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final void a2(ArrayList arrayList, int i10, long j3, long j10, long j11, dv0 dv0Var) {
        e2((MessageObject) arrayList.get(i10), null, null, null, arrayList, null, null, i10, dv0Var, null, j3, j10, j11, true, null, null);
    }

    public final void a3(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        Integer num2;
        boolean z13;
        boolean z14;
        float f7;
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
            this.p5.animate().setListener(null).cancel();
            qg.p2 p2Var = this.p5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p2Var.setVisibility(i11);
            this.p5.setAlpha(this.P0.getAlpha());
            this.f31077s5.animate().setListener(null).cancel();
            ai.n4 n4Var = this.f31077s5;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            n4Var.setVisibility(i12);
            ai.n4 n4Var2 = this.f31077s5;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            n4Var2.setAlpha(f11);
        } else if (z10 && this.p5.getTag() == null) {
            this.p5.animate().setListener(null).cancel();
            this.f31077s5.animate().setListener(null).cancel();
            if (this.p5.getVisibility() != 0) {
                this.p5.setVisibility(0);
                this.p5.animate().alpha(1.0f).start();
                this.f31077s5.setVisibility(0);
                this.f31077s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.p5.getTag() != null) {
            this.p5.animate().setListener(null).cancel();
            this.p5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.aa(this.p5)).start();
            this.f31077s5.animate().setListener(null).cancel();
            this.f31077s5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.aa(this.f31077s5)).start();
        }
        qg.p2 p2Var2 = this.p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        p2Var2.setTag(num);
        if (z10 && this.f31086t5.f41382j0 != 1 && !this.f31106v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f31086t5.animate().setListener(null).cancel();
            pu0 pu0Var = this.f31086t5;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pu0Var.setVisibility(i10);
            pu0 pu0Var2 = this.f31086t5;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            pu0Var2.setAlpha(f10);
        } else if (z12 && this.f31086t5.getTag() == null) {
            this.f31086t5.animate().setListener(null).cancel();
            if (this.f31086t5.getVisibility() != 0) {
                this.f31086t5.setVisibility(0);
            }
            this.f31086t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f31086t5.getTag() != null) {
            this.f31086t5.animate().setListener(null).cancel();
            this.f31086t5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.aa(this.f31086t5)).start();
        }
        pu0 pu0Var3 = this.f31086t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        pu0Var3.setTag(num2);
        if (z10 && this.f31086t5.f41382j0 == 1 && !this.f31106v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        X2(z13, z11);
        qg.p2 p2Var3 = this.p5;
        if (z10 && this.f31086t5.f41382j0 == 1 && this.f31133y5.f36730p0 && !this.f31104v5.f36730p0 && !this.f31114w5.f36730p0) {
            z14 = true;
        } else {
            z14 = false;
        }
        p2Var3.setOutlineVisible(z14);
        z15 = (!z10 || this.f31086t5.f41382j0 != 1 || this.f31104v5.f36730p0 || this.f31114w5.f36730p0) ? false : false;
        if (!z11) {
            this.f31133y5.animate().setListener(null).cancel();
            pu0 pu0Var4 = this.f31133y5;
            if (z15) {
                i13 = 0;
            }
            pu0Var4.setVisibility(i13);
            pu0 pu0Var5 = this.f31133y5;
            if (z15) {
                f12 = 1.0f;
            }
            pu0Var5.setAlpha(f12);
            pu0 pu0Var6 = this.f31133y5;
            if (z15) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            pu0Var6.setScaleX(f7);
            pu0 pu0Var7 = this.f31133y5;
            if (!z15) {
                f13 = 0.8f;
            }
            pu0Var7.setScaleY(f13);
        } else if (z15 && this.f31133y5.getTag() == null) {
            this.f31133y5.animate().setListener(null).cancel();
            if (this.f31133y5.getVisibility() != 0) {
                this.f31133y5.setVisibility(0);
            }
            org.telegram.messenger.wl.q(this.f31133y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.qr.h, 400L);
        } else if (!z15 && this.f31133y5.getTag() != null) {
            this.f31133y5.animate().setListener(null).cancel();
            org.telegram.messenger.wl.q(this.f31133y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.aa(this.f31133y5)), org.telegram.ui.Components.qr.h, 400L);
        }
        pu0 pu0Var8 = this.f31133y5;
        if (!z15) {
            num3 = null;
        }
        pu0Var8.setTag(num3);
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.P8 = pVar;
        this.R8 = false;
        if (this.f30967g0 != null) {
            ((WindowManager) this.f31128y.getSystemService("window")).addView(this.f30967g0, this.f30941d0);
            this.f30967g0.invalidate();
        }
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            h71Var.U(null);
            this.F2.V(null);
            this.F2.C();
            TextureView textureView = this.B2;
            if (textureView != null) {
                this.F2.V(textureView);
                return;
            }
            SurfaceView surfaceView = this.C2;
            if (surfaceView != null) {
                this.F2.U(surfaceView);
            }
        }
    }

    @Override
    public final void b1() {
        D1();
    }

    public final void b2(ArrayList arrayList, int i10, dv0 dv0Var) {
        e2(null, null, null, null, null, arrayList, null, i10, dv0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3(boolean z10) {
        Integer num;
        float f7;
        float f10;
        ku0 ku0Var;
        if (!z10 || this.f31075s3.getTag() == null) {
            if (!z10 && this.f31075s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f31075s3.f26667s && ((ku0Var = this.f30959f0) == null || !ku0Var.f27286x || ku0Var.v.isEmpty())) {
                this.f31093u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f31084t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ot0 ot0Var = this.f31075s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            ot0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31084t3 = animatorSet2;
            ot0 ot0Var2 = this.f31075s3;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ot0Var2, property, f7);
            ot0 ot0Var3 = this.f31075s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ot0Var3, property2, f10);
            ot0 ot0Var4 = this.f31075s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f12 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ot0Var4, property3, f12);
            ot0 ot0Var5 = this.f31075s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(ot0Var5, property4, f11));
            this.f31084t3.setDuration(380L);
            this.f31084t3.setInterpolator(org.telegram.ui.Components.qr.h);
            this.f31084t3.addListener(new kt0(this, 1));
            this.f31084t3.start();
        }
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.Q8;
        if (textureView != null && textureView.isAvailable()) {
            return this.Q8.getBitmap();
        }
        return null;
    }

    public final int c1(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.f30934c2 != 1)) {
                if (i10 == 3 && this.L1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f31071s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return this.L1.getAdditionalTop() + dp + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f31071s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i11;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f31071s) {
                    i11 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i11;
            }
        }
        return 0;
    }

    public final void c2(MessageObject messageObject, bo boVar, long j3, long j10, long j11, vu0 vu0Var) {
        e2(messageObject, null, null, null, null, null, null, 0, vu0Var, boVar, j3, j10, j11, true, null, null);
    }

    public final void c3(boolean z10, boolean z11) {
        int i10;
        Integer num = null;
        if (!z11) {
            this.Q7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.Q7;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            this.R7.setTranslationY(0.0f);
            this.Q7.setAlpha(this.P0.getAlpha());
        } else if (z10 && this.Q7.getTag() == null) {
            if (this.Q7.getVisibility() != 0) {
                this.Q7.setVisibility(0);
                this.Q7.setAlpha(this.P0.getAlpha());
                this.R7.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.A7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.A7.cancel();
            }
            at0 at0Var = this.R7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(at0Var, View.TRANSLATION_Y, at0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.qr.f27380f);
            this.A7.start();
        } else if (!z10 && this.Q7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            at0 at0Var2 = this.R7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(at0Var2, View.TRANSLATION_Y, at0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.aa(this.Q7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.qr.f27380f);
            this.A7.start();
        }
        FrameLayout frameLayout2 = this.Q7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.Q7.setTranslationY(this.P0.getTranslationY() - (this.U1.getAlpha() * hg.k0.f(46.0f, this.U1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.Q7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final void d(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final int d1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(boolean):int");
    }

    public final void d2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, vu0 vu0Var) {
        e2(null, fileLocation, imageLocation, null, null, null, null, 0, vu0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void d3() {
        org.telegram.ui.Components.h71 h71Var;
        if (this.f31063r1 && (h71Var = this.F2) != null && !h71Var.y()) {
            if (!this.f31061r || this.f30934c2 == 1) {
                this.F2.W(0.0f);
            }
            this.H2 = false;
            q3();
        }
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final Bitmap e() {
        TextureView textureView = this.B2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.D2 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmaps.createBitmap(this.C2.getWidth(), this.C2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(this.C2, createBitmap);
            return createBitmap;
        }
        return null;
    }

    public final ClippingImageView[] e1(fv0 fv0Var) {
        int i10;
        if (!AndroidUtilities.isTablet() && fv0Var != null && fv0Var.f33772m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f30976h0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = fv0Var.f33772m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(fv0Var.f33773n);
        }
        return clippingImageViewArr;
    }

    public final boolean e2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.dv0 r25, org.telegram.ui.bo r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.zu0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.dv0, org.telegram.ui.bo, long, long, long, boolean, org.telegram.ui.zu0, java.lang.Integer):boolean");
    }

    public final void e3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3(int):void");
    }

    @Override
    public final void f(Canvas canvas) {
        this.S8 = true;
        this.f30967g0.draw(canvas);
        this.S8 = false;
    }

    public final org.telegram.ui.Components.jd f1() {
        dv0 dv0Var = this.d;
        if (dv0Var != null && dv0Var.A()) {
            return this.V1;
        }
        return this.U1;
    }

    public final void f2(ArrayList arrayList, int i10, int i11, boolean z10, dv0 dv0Var, bo boVar) {
        boolean z11;
        org.telegram.ui.Components.n6 n6Var;
        this.f30978h2 = z10;
        ii.y1 y1Var = this.S0;
        int i12 = 0;
        if (y1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getLayoutParams();
            if (i11 != 4 && i11 != 5) {
                if (i11 != 13 && i11 != 14 && i11 != 1 && i11 != 3 && i11 != 10 && i11 != 11) {
                    this.S0.setResourceId(R.drawable.send_plane_24);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                } else {
                    this.S0.setResourceId(R.drawable.floating_check);
                    this.S0.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                }
            } else {
                this.S0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            }
            this.S0.setLayoutParams(layoutParams);
        }
        if (i11 != 11 && this.p5 != null) {
            this.f31106v7 = false;
            ImageView imageView = this.f30933c1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            pu0 pu0Var = this.f31133y5;
            if (pu0Var != null) {
                pu0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList2 = this.f31067r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.e;
        BackgroundDrawable backgroundDrawable = this.L0;
        if (z12 && this.f30934c2 != i11 && i11 == 1) {
            this.f30934c2 = i11;
            this.f31092u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = dv0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f31046p1.l();
            this.f31000j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f30958f = true;
            p3(false, false);
            this.f31012l2 = false;
            H0();
            j3(false, false);
            this.f30953e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f30950e0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
            E1();
            z2();
        } else if (z12 && this.f30934c2 != i11 && i11 == 11) {
            this.f30934c2 = i11;
            this.f31092u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = dv0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f31046p1.l();
            this.f31000j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f30958f = true;
            p3(false, false);
            this.f30953e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f30950e0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.f30934c2 = i11;
            if (i11 == 12) {
                this.f30934c2 = 0;
                this.f30943d2 = true;
            }
            int i13 = this.f30934c2;
            if (i13 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f30961f2 = z11;
            if (i13 == 13 || z11) {
                this.f30934c2 = 0;
                this.f30952e2 = true;
            }
            this.f30912a.a(z11, false);
            if (this.f30934c2 == 11) {
                this.f30994j0.setBackgroundColor(-16777216);
            }
            cv0 cv0Var = this.M;
            if (cv0Var != null && (n6Var = cv0Var.d) != null) {
                if (this.f30952e2) {
                    i12 = 8;
                }
                n6Var.setVisibility(i12);
            }
            e2(null, null, null, null, null, null, arrayList, i10, dv0Var, boVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void f3(int i10, boolean z10) {
        if (this.T4 != null) {
            n2(false);
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        } else if (this.f30990i5 != null) {
            TLObject d = this.f31000j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                n2(false);
                FileLoader.getInstance(this.T).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.v30 v30Var = this.l1;
        if (v30Var != null) {
            v30Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        C2(this.P4 + i10, z10, true, false);
        if (R2(this.T4) || Q2(this.P4)) {
            this.Y2 = true;
            T1(true);
            B0(0, true);
        }
        z0();
        try {
            b5.d.b(0);
            if (of.b.M().O()) {
                of.b.M().T(m1());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f31099v0;
        if (g1Var != null && g1Var.isEnabled() && this.P3) {
            return true;
        }
        return false;
    }

    public final Bitmap.CompressFormat g1() {
        if (this.f30934c2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void g2() {
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            h71Var.B();
            return;
        }
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null) {
            ku0Var.f();
        }
    }

    public final void g3() {
        float f7;
        boolean z10;
        int i10;
        cu0 cu0Var;
        int i11;
        cu0 cu0Var2;
        this.q6 = null;
        this.P0.setVisibility(8);
        this.S0.setVisibility(8);
        this.f31027n0.setVisibility(8);
        this.f30951e1.setVisibility(8);
        this.f30960f1.setVisibility(8);
        this.f30968g1.setVisibility(8);
        org.telegram.ui.Components.ue0 ue0Var = this.C1;
        if (ue0Var != null) {
            ue0Var.setVisibility(4);
        }
        this.f31037o1.setVisibility(8);
        this.f31037o1.setAlpha(0.0f);
        this.f31037o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.O0.setRotationX(0.0f);
        this.f31037o1.setEnabled(false);
        this.K = false;
        if (this.f30987i2) {
            this.Q1.setVisibility(4);
        }
        int i12 = this.f30934c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.f30974g7.size() > 1)) {
            this.N0.setVisibility(8);
            this.O0.setVisibility(8);
            s3();
        }
        W2(false, true);
        a3(false, true);
        Bitmap bitmap = this.C4.getBitmap();
        float f10 = this.f30918a6;
        if (this.f30934c2 == 11) {
            this.f30991i6 = this.Y5;
            this.f30982h6 = this.X5;
            this.f30999j6 = f10;
            this.f31008k6 = this.f30928b6;
            this.f30965f6 = 0.0f;
        }
        uu0 uu0Var = this.X4;
        if (bitmap != null) {
            int bitmapWidth = this.C4.getBitmapWidth();
            int bitmapHeight = this.C4.getBitmapHeight();
            if (this.f30934c2 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.f30947d6 = dp;
                f7 = 0.0f;
                if (this.L1 != null) {
                    this.f30947d6 = (cu0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i13 = this.D1.f14075i;
                if (i13 == 90 || i13 == 270) {
                    i11 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f11 = bitmapWidth;
                    float f12 = i11;
                    this.f30956e6 = r2(false) * (Math.min(k1(3) / f11, h1(3, false) / f12) / Math.min(k1(this.f31094u4) / f11, i1() / f12));
                    Rect rect = this.f31074s2;
                    this.f30938c6 = (rect.left / 2) - (rect.right / 2);
                    this.f31033n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f112 = bitmapWidth;
                float f122 = i11;
                this.f30956e6 = r2(false) * (Math.min(k1(3) / f112, h1(3, false) / f122) / Math.min(k1(this.f31094u4) / f112, i1() / f122));
                Rect rect2 = this.f31074s2;
                this.f30938c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f31033n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f7 = 0.0f;
                int i14 = -AndroidUtilities.dp(44.0f);
                if (!this.f31071s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                float f13 = i14 + i10;
                this.f30947d6 = f13;
                if (this.L1 != null) {
                    float additionalTop = (cu0Var.getAdditionalTop() / 2.0f) + f13;
                    this.f30947d6 = additionalTop;
                    this.f30947d6 = additionalTop - (this.L1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = uu0Var.f38225c;
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
                    this.f30956e6 = r2(false) * (Math.min(k1(3) / f1122, h1(3, false) / f1222) / Math.min(k1(this.f31094u4) / f1122, i1() / f1222));
                    Rect rect22 = this.f31074s2;
                    this.f30938c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f31033n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f11222 = bitmapWidth;
                float f12222 = i11;
                this.f30956e6 = r2(false) * (Math.min(k1(3) / f11222, h1(3, false) / f12222) / Math.min(k1(this.f31094u4) / f11222, i1() / f12222));
                Rect rect222 = this.f31074s2;
                this.f30938c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f31033n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f7 = 0.0f;
        }
        cu0 cu0Var3 = this.L1;
        if (cu0Var3 != null) {
            if (this.f30934c2 == 11 && (uu0Var == null || uu0Var.f38225c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            cu0Var3.setDrawShadow(z10);
        }
        this.f30967g0.setClipChildren(true);
        this.f30994j0.setVisibility(4);
        this.f31050p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f7);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f7);
        ofFloat.addUpdateListener(new jr0(this, 6));
        ofFloat2.addUpdateListener(new jr0(this, 7));
        this.f31050p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f27225g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.L1.n0(true);
        this.f31050p6.setDuration(200L);
        this.f31050p6.addListener(new kt0(this, 3));
        this.f31050p6.start();
    }

    public float getAnimationValue() {
        return this.f31015l6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f31128y);
        this.Q8 = textureView;
        textureView.setOpaque(false);
        View view = this.O8;
        if (view != null) {
            view.bringToFront();
        }
        return this.Q8;
    }

    public final int h1(int i10, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f31071s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f31074s2.bottom) + AndroidUtilities.displaySize.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.f30934c2 != 1 && !z11) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f30950e0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.f30934c2 == 1) || i10 == 1) {
            return measuredHeight - AndroidUtilities.dp(144.0f);
        }
        if (i10 == 2) {
            return measuredHeight - AndroidUtilities.dp(214.0f);
        }
        if (i10 == 3) {
            return measuredHeight - (this.L1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.L1.getAdditionalBottom() + AndroidUtilities.dp(48.0f))));
        }
        return measuredHeight;
    }

    public final void h2() {
        pf.e eVar = this.G2;
        if (eVar != null) {
            eVar.b(true);
        }
        if (org.telegram.ui.Components.fg0.p() != null) {
            org.telegram.ui.Components.fg0.p().b(true);
        }
    }

    public final void h3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3():void");
    }

    public final boolean i() {
        if (!this.S8 && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap) {
            return true;
        }
        return false;
    }

    public final int i1() {
        return h1(this.f31094u4, false);
    }

    public final void i2() {
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            h71Var.C();
            return;
        }
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null) {
            ku0Var.g();
        }
    }

    public final void i3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        c6.q e;
        c6.q e7;
        float f7;
        int i10;
        c6.q e10;
        boolean z10;
        if (!Q1()) {
            return;
        }
        this.N8 = true;
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            if (!b5.d.u() && !this.f31061r) {
                z10 = false;
            } else {
                z10 = true;
            }
            h71Var.O(z10);
        }
        if (this.F2 != null && b5.d.u() && ((atomicInteger = b5.d.f3416b) == null || atomicInteger.get() <= 0)) {
            e6.h e11 = b5.d.e();
            if (e11 == null) {
                a2 = -1;
            } else {
                a2 = e11.a();
            }
            if (a2 >= 0 && Math.abs(this.F2.n() - a2) > 1000) {
                this.F2.K(a2);
            }
            e6.h e12 = b5.d.e();
            if (e12 == null) {
                m10 = false;
            } else if (b5.d.f3415a == 0) {
                m10 = !e12.l();
            } else {
                m10 = e12.m();
            }
            if (m10) {
                this.F2.C();
            } else {
                this.F2.B();
            }
            if (this.E != null) {
                float g10 = b5.d.g();
                e6.h e13 = b5.d.e();
                float f10 = 0.5f;
                if (e13 == null || (e7 = e13.e()) == null) {
                    f7 = 0.5f;
                } else {
                    f7 = (float) e7.f4039r;
                }
                if (Math.abs(g10 - f7) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.E.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = audioManager.getStreamMinVolume(3);
                    } else {
                        i10 = 0;
                    }
                    float f11 = streamMaxVolume - i10;
                    e6.h e14 = b5.d.e();
                    if (e14 != null && (e10 = e14.e()) != null) {
                        f10 = (float) e10.f4039r;
                    }
                    int i11 = i10 + ((int) (f10 * f11));
                    if (i11 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i11, 1);
                    }
                }
            }
            e6.h e15 = b5.d.e();
            float f12 = 1.0f;
            if (e15 != null && (e = e15.e()) != null) {
                f12 = (float) e.d;
            }
            D0(true, false, f12);
        }
        as asVar = this.f31109w0;
        if (asVar != null) {
            asVar.a(b5.d.u());
        }
        this.N8 = false;
    }

    public final void j0(float f7, float f10, float f11, boolean z10) {
        if (this.f30918a6 == f7 && this.X5 == f10 && this.Y5 == f11) {
            return;
        }
        this.R6 = z10;
        this.f30956e6 = f7;
        this.f30938c6 = f10;
        this.f30947d6 = f11;
        this.f31033n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31050p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f27225g, 0.0f, 1.0f));
        this.f31050p6.setInterpolator(this.f31087t6);
        this.f31050p6.setDuration(250);
        this.f31050p6.addListener(new kt0(this, 7));
        this.f31050p6.start();
    }

    public final int j1() {
        return k1(this.f31094u4);
    }

    public final void j3(boolean z10, boolean z11) {
        k3(z10, z11, nu0.e);
    }

    public final CharSequence k0() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        if (Q1() && this.d != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f30974g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = f1().getText();
                boolean z10 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f31051p7 && !TextUtils.equals(this.f31059q7, text) && this.d.R(this.P4) != 0 && this.d.H() > 0) {
                    this.f31051p7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.T);
                bo boVar = this.l4;
                if (boVar == null || ((encryptedChat = boVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z10 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10);
                CharSequence charSequence = charSequenceArr[0];
                this.f31059q7 = charSequence;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    photoEntry.caption = charSequence;
                    photoEntry.entities = entities;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    searchImage.caption = charSequence;
                    searchImage.entities = entities;
                }
                if (text.length() != 0 && !this.d.x(this.P4)) {
                    M2();
                }
                dv0 dv0Var = this.d;
                if (dv0Var != null) {
                    dv0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int k1(int i10) {
        int dp;
        int width = this.f30950e0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.f30934c2 != 1)) {
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

    public final void k3(boolean r17, boolean r18, org.telegram.ui.nu0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3(boolean, boolean, org.telegram.ui.nu0):void");
    }

    public final void l0(android.graphics.Canvas r24, int r25, int r26, int r27, int r28, float r29, lg.g r30, org.telegram.messenger.MediaController.CropState r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l0(android.graphics.Canvas, int, int, int, int, float, lg.g, org.telegram.messenger.MediaController$CropState):void");
    }

    public final float l1(boolean z10) {
        int bitmapWidth;
        int bitmapHeight;
        int i10;
        ImageReceiver imageReceiver = this.C4;
        if (z10) {
            bitmapWidth = imageReceiver.getBitmapHeight();
        } else {
            bitmapWidth = imageReceiver.getBitmapWidth();
        }
        if (z10) {
            bitmapHeight = this.C4.getBitmapWidth();
        } else {
            bitmapHeight = this.C4.getBitmapHeight();
        }
        if (!this.f31071s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.C1.getMeasuredWidth(), (this.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i10) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void l2() {
        qg.p2 p2Var = this.p5;
        if (p2Var != null && this.f30934c2 == 11) {
            if (this.f31106v7) {
                p2Var.b();
            } else {
                p2Var.m(this.C4.getBitmap(), this.C4.getOrientation(), k1(this.f31094u4), i1(), new qr0(this, 0));
            }
        }
    }

    public final void l3(boolean z10) {
        float f7;
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
        t5 t5Var = this.P0;
        Property property = View.ALPHA;
        float f17 = 1.0f;
        float f18 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(t5Var, property, f7));
        t5 t5Var2 = this.P0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(t5Var2, property2, f10));
        qg.p2 p2Var = this.p5;
        if (p2Var != null) {
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(p2Var, property, f16));
        }
        if (this.p5 != null) {
            ai.n4 n4Var = this.f31077s5;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(n4Var, property, f15));
        }
        ii.y1 y1Var = this.S0;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(y1Var, property, f11));
        ii.y1 y1Var2 = this.S0;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(y1Var2, property2, f12));
        int i10 = this.f30934c2;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.N0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f13));
            CheckBox checkBox2 = this.N0;
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f14));
            CounterView counterView = this.O0;
            if (!z10) {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f17));
            CounterView counterView2 = this.O0;
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
            ci.g gVar = this.U1.f4995f;
            if (gVar.e) {
                gVar.k(true);
            }
            ci.g gVar2 = this.V1.f4995f;
            if (gVar2.e) {
                gVar2.k(true);
            }
            this.U1.f4995f.d();
            this.V1.f4995f.d();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m0():void");
    }

    public final of.g m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m1():of.g");
    }

    public final void m2(String str, long j3, boolean z10, float f7, float f10, int i10, long j10) {
        boolean z11;
        int parseInt;
        if (this.f31117w8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f31117w8);
            this.f31117w8 = null;
        }
        at0 at0Var = this.R7;
        at0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        at0Var.f27801y = mediaMetadataRetriever;
        boolean z12 = true;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        at0Var.f27799w = z11;
        at0Var.d = f7;
        at0Var.e = f10;
        float f11 = at0Var.f27798s;
        if (f11 < f7) {
            at0Var.f27798s = f7;
        } else if (f11 > f10) {
            at0Var.f27798s = f10;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                at0Var.f27800x = open;
                at0Var.f27801y.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = at0Var.f27801y.extractMetadata(9);
            if (extractMetadata != null) {
                at0Var.f27787a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = at0Var.f27801y.extractMetadata(18);
            if (extractMetadata2 != null) {
                at0Var.f27789b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = at0Var.f27801y.extractMetadata(19);
            if (extractMetadata3 != null) {
                at0Var.f27791c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = at0Var.f27801y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = at0Var.f27789b;
                at0Var.f27789b = at0Var.f27791c;
                at0Var.f27791c = i12;
            }
            if (at0Var.f27799w) {
                at0Var.f27795f = (float) ((j10 / 1000.0d) / at0Var.f27787a);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        at0Var.invalidate();
        this.f31127x8 = null;
        if (!z10 && this.f30934c2 != 1) {
            z12 = false;
        }
        this.f31061r = z12;
        this.Y7 = -1;
        this.f30920a8 = 0;
        this.f30993i8 = 25;
        this.f31089t8 = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        lu0 lu0Var = new lu0(this, str, j3, i10);
        this.f31117w8 = lu0Var;
        dispatchQueue.postRunnable(lu0Var);
    }

    public final void m3(boolean z10, boolean z11) {
        float f7;
        kr0 kr0Var = this.f31118x;
        AndroidUtilities.cancelRunOnUIThread(kr0Var);
        int i10 = 0;
        if (z11) {
            n3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f31108w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31108w = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    n3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(kr0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f31108w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                n3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f31108w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f31108w = null;
        }
        ld ldVar = this.X0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ldVar.setAlpha(f7);
        ld ldVar2 = this.X0;
        if (!z10) {
            i10 = 4;
        }
        ldVar2.setVisibility(i10);
    }

    public final void n0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0(android.graphics.Bitmap):void");
    }

    public final org.telegram.messenger.VideoEditedInfo n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void n2(boolean z10) {
        int i10 = 0;
        this.D2 = false;
        pf.e eVar = this.G2;
        if (eVar != null) {
            eVar.c();
            this.G2 = null;
        }
        org.telegram.ui.Components.h71 h71Var = this.F2;
        HashMap hashMap = V8;
        ct0 ct0Var = this.f31121x2;
        if (h71Var != null) {
            u0();
            AndroidUtilities.cancelRunOnUIThread(this.f31111w2);
            AndroidUtilities.cancelRunOnUIThread(ct0Var);
            if (this.f30935c3 != null) {
                float n10 = ((float) this.F2.n()) / ((float) this.F2.p());
                String str = this.f30935c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new jv0(n10));
                MessageObject messageObject = this.T4;
                if (messageObject != null) {
                    messageObject.cachedSavedTimestamp = Float.valueOf(n10);
                }
            }
            this.F2.H();
            this.F2 = null;
        } else {
            this.X2 = false;
        }
        if (this.f30959f0 != null) {
            AndroidUtilities.cancelRunOnUIThread(ct0Var);
            if (this.f30935c3 != null) {
                float o12 = ((float) o1()) / ((float) A1());
                String str2 = this.f30935c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new jv0(o12));
                MessageObject messageObject2 = this.T4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(o12);
                }
            }
        }
        pt0 pt0Var = this.W3;
        if (pt0Var != null) {
            pt0Var.disable();
            this.W3 = null;
        }
        this.f31075s3.a();
        m3(false, false);
        this.f31064r2 = false;
        this.U2 = false;
        if (this.f31099v0.isEnabled()) {
            this.f31099v0.setEnabled(false);
            this.f31099v0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f30979h3) {
            try {
                this.f31128y.getWindow().clearFlags(128);
                this.f30979h3 = false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ut0 ut0Var = this.f31131y2;
        if (ut0Var != null) {
            try {
                this.f30950e0.removeView(ut0Var);
            } catch (Throwable unused) {
            }
            this.f31131y2 = null;
        }
        s0();
        this.f31139z2 = null;
        TextureView textureView = this.B2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.v61) {
                org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) textureView;
                org.telegram.ui.Components.vz vzVar = v61Var.f28637b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.sz(vzVar, 0));
                }
                v61Var.f28636a = null;
            }
            this.B2 = null;
        }
        this.f30922b0.e();
        if (this.C2 != null) {
            this.C2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30980h4);
        }
        if (!z10 && !this.A8 && !this.B8) {
            P2(false, true);
        }
        bv0 bv0Var = this.W0[0];
        while (true) {
            float[] fArr = bv0Var.f32584n;
            if (i10 < fArr.length) {
                bv0Var.f32583m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                bv0Var.a();
                return;
            }
        }
    }

    public final void n3(boolean z10) {
        float f7;
        if (z10) {
            this.X0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31108w = animatorSet;
        ld ldVar = this.X0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ldVar, property, f7));
        this.f31108w.setDuration(200L);
        this.f31108w.addListener(new vt0(this, z10, 1));
        this.f31108w.start();
    }

    public final void o0(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        MediaController.CropState cropState;
        if (this.f31050p6 != null) {
            f13 = AndroidUtilities.lerp(0.0f, this.f30973g6, this.f31015l6);
            f7 = AndroidUtilities.lerp(this.f30918a6, this.f30956e6, this.f31015l6);
            f10 = AndroidUtilities.lerp(this.f30928b6, this.f30965f6, this.f31015l6);
            f11 = AndroidUtilities.lerp(this.Y5, this.f30947d6, this.f31015l6);
            f12 = AndroidUtilities.lerp(this.X5, this.f30938c6, this.f31015l6);
        } else {
            f7 = this.f30918a6;
            f10 = this.f30928b6;
            f11 = this.Y5;
            f12 = this.X5;
            if (this.f31033n6 != 0) {
                f12 = this.f30938c6;
                f11 = this.f30947d6;
                f7 = this.f30956e6;
            }
            f13 = 0.0f;
        }
        int k12 = k1(this.f31094u4);
        int i12 = i1();
        canvas.translate(a1(this.f31094u4), c1(this.f31094u4));
        canvas.translate(f12, f11 + 0.0f);
        canvas.scale(f7, f7);
        canvas.rotate(f10);
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        float f17 = k12;
        float f18 = bitmapWidth;
        float f19 = f17 / f18;
        float f20 = i12;
        float f21 = bitmapHeight;
        float f22 = f20 / f21;
        float min = Math.min(f19, f22);
        lg.g gVar = this.D1;
        int i10 = gVar.f14075i;
        if (i10 != 90 && i10 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f23 = gVar.f14076j;
        float f24 = gVar.f14077k;
        float f25 = bitmapHeight;
        float f26 = bitmapWidth;
        float f27 = f7;
        float f28 = (int) ((((1.0f - f23) * 0.0f) + f23) * f25);
        float f29 = f17 / f28;
        float f30 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        if (f29 * f30 > f20) {
            f29 = f20 / f30;
        }
        int i11 = this.f30934c2;
        float f31 = f29;
        uu0 uu0Var = this.X4;
        if (i11 != 1 && ((this.f31094u4 != 1 || this.f31042o6 == 0) && uu0Var.f38225c != null)) {
            float f32 = f28 * f31;
            float f33 = f30 * f31;
            if (f19 * f21 > f20) {
                f19 = f22;
            }
            float z10 = com.google.android.gms.internal.vision.e2.z((f18 * f19) / f27, f32, 0.0f, f32);
            float z11 = com.google.android.gms.internal.vision.e2.z((f21 * f19) / f27, f33, 0.0f, f33);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.f30934c2 == 1 || gVar.f14070a) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                MediaController.CropState cropState2 = uu0Var.f38225c;
                if (cropState2 != null && cropState2.mirrored) {
                    f15 = -1.0f;
                } else {
                    f15 = 1.0f;
                }
                textureView.setScaleX(f15);
                wu0 wu0Var = this.E2;
                if (wu0Var != null) {
                    wu0Var.setScaleX(this.B2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = uu0Var.f38225c;
            if (cropState3 != null) {
                f14 = cropState3.cropScale;
            } else {
                f14 = 1.0f;
            }
            float z12 = ((f31 / min) / com.google.android.gms.internal.vision.e2.z(f14, 1.0f, 0.0f, 1.0f)) * f14;
            canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
            canvas.scale(z12, z12);
            canvas.translate(com.google.android.gms.internal.vision.e2.C(gVar.f14071b, f25, min, 1.0f), com.google.android.gms.internal.vision.e2.C(gVar.f14072c, f26, min, 1.0f));
            float f34 = gVar.f14074g + i10;
            if (f34 > 180.0f) {
                f34 -= 360.0f;
            }
            canvas.rotate(f34);
        }
        if (!this.f30974g7.isEmpty() && (cropState = uu0Var.f38225c) != null && cropState.mirrored) {
            f16 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f16 = 1.0f;
        }
        if (f13 > 0.0f) {
            canvas.scale(f16 - (2.0f * f13), f16);
            canvas.skew(0.0f, org.telegram.messenger.w1.A(f16, f13, 4.0f * f13, 0.25f));
        }
    }

    public final long o1() {
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null && ku0Var.f27286x) {
            return ku0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.n();
    }

    public final void o2() {
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.customStickerCreated);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.mediaCountDidLoad);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.replaceMessagesObjects);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.dialogDeleted);
        ConnectionsManager.getInstance(this.T).cancelRequestsForGuid(this.f30931c);
    }

    public final void o3(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i10 = this.f30934c2;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.N0;
            Property property = View.ALPHA;
            float f11 = 1.0f;
            float f12 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f7));
            CheckBox checkBox2 = this.N0;
            Property property2 = View.TRANSLATION_Y;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f10));
            CounterView counterView = this.O0;
            if (!z10) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f11));
            CounterView counterView2 = this.O0;
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
        if (!this.O6 && this.N0.getVisibility() != 0) {
            boolean[] zArr = this.f31110w1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f30950e0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.hasImageSet()) {
                        zArr[0] = true;
                        this.f30950e0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f30950e0.getMeasuredWidth() - min && this.D4.hasImageSet()) {
                    zArr[1] = true;
                    this.f30950e0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f30918a6 != 1.0f && this.f30934c2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f7), Math.round(f10), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f30950e0.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final boolean onSingleTapUp(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final Size p0() {
        float f7;
        int i10;
        int round;
        int i11;
        if (this.Y7 == 1) {
            return new Size(this.f30930b8, this.f30940c8);
        }
        int i12 = this.X7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    f7 = 1920.0f;
                } else {
                    f7 = 1280.0f;
                }
            } else {
                f7 = 854.0f;
            }
        } else {
            f7 = 480.0f;
        }
        if (this.f30930b8 > this.f30940c8) {
            i10 = this.f30930b8;
        } else {
            i10 = this.f30940c8;
        }
        float f10 = f7 / i10;
        if (this.X7 == this.Y7 - 1 && f10 >= 1.0f) {
            i11 = this.f30930b8;
            round = this.f30940c8;
        } else {
            int round2 = Math.round((this.f30930b8 * f10) / 2.0f) * 2;
            round = Math.round((this.f30940c8 * f10) / 2.0f) * 2;
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
        ArrayList arrayList = this.e7;
        if (!arrayList.isEmpty()) {
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
            }
            return (TLObject) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.f30919a7;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f30939c7;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.f30929b7;
            if (arrayList4.get(i10) == null) {
                return null;
            }
            return ((ImageLocation) arrayList4.get(i10)).location;
        }
        ArrayList arrayList5 = this.Y6;
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
                    long j3 = closestPhotoSizeWithSize.size;
                    jArr[0] = j3;
                    if (j3 == 0) {
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
                        long j10 = closestPhotoSizeWithSize2.size;
                        jArr[0] = j10;
                        if (j10 == 0) {
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
                            long j11 = closestPhotoSizeWithSize3.size;
                            jArr[0] = j11;
                            if (j11 == 0) {
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
                        long j12 = closestPhotoSizeWithSize4.size;
                        jArr[0] = j12;
                        if (j12 == 0) {
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
                        long j13 = closestPhotoSizeWithSize5.size;
                        jArr[0] = j13;
                        if (j13 == 0) {
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
        if (this.f31127x8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f31127x8);
        }
        if (this.B8 && !this.f31136y8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B8 = false;
        this.f31145z8 = false;
        this.P7.setVisibility(4);
        if (i10 == 1) {
            if (this.f30957e8 == this.f30940c8 && this.f30949d8 == this.f30930b8) {
                this.f31136y8 = false;
                bv0 bv0Var = this.W0[0];
                if (bv0Var.h != 0 && bv0Var.f32581k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bv0Var.f(0.0f, z12);
                this.W0[0].d(3, false, true);
                if (!z10) {
                    k2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.F2.K(this.R7.getLeftProgress() * this.f30984h8);
                } else {
                    this.f31145z8 = true;
                }
            } else {
                n2(false);
                if (this.f31127x8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f18142id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f31127x8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f31127x8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f31127x8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.f30920a8;
                    videoEditedInfo.originalWidth = this.f30930b8;
                    this.f31127x8.videoEditedInfo.originalHeight = this.f30940c8;
                    VideoEditedInfo videoEditedInfo2 = this.f31127x8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f30993i8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f31127x8.videoEditedInfo;
                long j3 = this.f31017l8;
                videoEditedInfo3.startTime = j3;
                long j10 = this.f31025m8;
                videoEditedInfo3.endTime = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f30984h8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    videoEditedInfo3.endTime = j3 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f30966f8;
                this.f31127x8.videoEditedInfo.resultWidth = this.f30949d8;
                this.f31127x8.videoEditedInfo.resultHeight = this.f30957e8;
                VideoEditedInfo videoEditedInfo4 = this.f31127x8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f30984h8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f31127x8, true, true, true)) {
                    this.f31136y8 = true;
                }
                this.B8 = true;
                bv0 bv0Var2 = this.W0[0];
                if (bv0Var2.h != 0 && bv0Var2.f32581k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                bv0Var2.f(0.0f, z11);
                this.W0[0].d(0, false, true);
            }
        } else {
            this.f31136y8 = false;
            this.W0[0].d(3, false, true);
            if (i10 == 2) {
                k2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.F2.K(this.R7.getLeftProgress() * this.f30984h8);
            }
        }
        this.f30950e0.invalidate();
    }

    public final void p3(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (z10 != this.K) {
            if (z10) {
                this.f31037o1.setVisibility(0);
            }
            this.K = z10;
            this.f31037o1.setEnabled(z10);
            float f13 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                lv0 lv0Var = this.f31037o1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(lv0Var, property, f11));
                lv0 lv0Var2 = this.f31037o1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(lv0Var2, property2, f12));
                CounterView counterView = this.O0;
                Property property3 = View.ROTATION_X;
                if (!z10) {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f13));
                AnimatorSet animatorSet = new AnimatorSet();
                this.B1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z10) {
                    this.B1.addListener(new kt0(this, 4));
                }
                this.B1.setDuration(200L);
                this.B1.start();
                return;
            }
            lv0 lv0Var3 = this.f31037o1;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            lv0Var3.setAlpha(f7);
            lv0 lv0Var4 = this.f31037o1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(10.0f);
            }
            lv0Var4.setTranslationY(f10);
            CounterView counterView2 = this.O0;
            if (!z10) {
                f13 = 0.0f;
            }
            counterView2.setRotationX(f13);
            if (!z10) {
                this.f31037o1.setVisibility(8);
            }
        }
    }

    public final boolean q0(MotionEvent motionEvent) {
        boolean z10;
        ku0 ku0Var;
        if (this.F2 != null || ((ku0Var = this.f30959f0) != null && ku0Var.f27286x)) {
            if (motionEvent.getX() >= (k1(this.f31094u4) / 3) * 2) {
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
        org.telegram.ui.Components.h71 h71Var;
        org.telegram.ui.Components.h71 h71Var2;
        ku0 ku0Var;
        org.telegram.ui.Components.h71 h71Var3 = this.F2;
        if (h71Var3 == null && ((ku0Var = this.f30959f0) == null || !ku0Var.f27286x)) {
            return;
        }
        if (h71Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f30959f0.G;
        }
        u0();
        AndroidUtilities.cancelRunOnUIThread(this.f31121x2);
        if (z10) {
            g2();
        } else {
            if (this.f31063r1) {
                if (Math.abs(this.R7.getProgress() - this.R7.getRightProgress()) < 0.01f || ((h71Var2 = this.F2) != null && h71Var2.n() == this.F2.p())) {
                    u2(this.R7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f31056q3.c() - this.R7.getRightProgress()) < 0.01f || ((h71Var = this.F2) != null && h71Var.n() == this.F2.p())) {
                    u2(0.0f);
                }
                s2();
            }
            i2();
        }
        this.f30950e0.invalidate();
    }

    public final boolean r0() {
        bo boVar = this.l4;
        if (boVar != null) {
            if (boVar.f32277f == null) {
                TLRPC.Chat chat = boVar.e;
                if (chat != null && !ChatObject.isNotInChat(chat)) {
                    if (ChatObject.canSendPhoto(this.l4.e) || ChatObject.canSendVideo(this.l4.e)) {
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
            ArrayList arrayList = this.e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(secureDocument.secureFile.dc_id);
                    sb2.append("_");
                    return a4.a.r(sb2, secureDocument.secureFile.f18256id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.f30919a7;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.Y6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.f30974g7;
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
                zu0 zu0Var = this.f31000j7;
                if (zu0Var != null) {
                    return zu0Var.c(i10);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i10 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i10);
                    ImageLocation imageLocation2 = (ImageLocation) this.f30929b7.get(i10);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(imageLocation2.location.volume_id);
                            sb4.append("_");
                            return a4.a.n(imageLocation2.location.local_id, ".mp4", sb4);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(imageLocation.location.volume_id);
                        sb5.append("_");
                        return a4.a.n(imageLocation.location.local_id, ".jpg", sb5);
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
        if (this.f30934c2 == 11) {
            int k12 = k1(this.f31094u4);
            if (k12 == 0) {
                k12 = AndroidUtilities.displaySize.x;
            }
            float D = org.telegram.messenger.wl.D(20.0f, k12, 1) / k12;
            if (z10) {
                int bitmapWidth = this.C4.getBitmapWidth();
                int bitmapHeight = this.C4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i10 = this.P4) >= 0) {
                    ArrayList arrayList = this.f30974g7;
                    if (i10 < arrayList.size()) {
                        Object obj = arrayList.get(this.P4);
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
                    return (bitmapWidth / bitmapHeight) * D;
                }
            }
            return D;
        }
        return 1.0f;
    }

    public final void r3() {
        View view = this.T3;
        if (view != null) {
            bv0 bv0Var = this.W0[0];
            int i10 = bv0Var.h;
            if (bv0Var.f32586p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
                if (i10 == 3) {
                    view.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                } else if (i10 == 2) {
                    view.setContentDescription(LocaleController.getString("AccActionDownload", R.string.AccActionDownload));
                } else if (i10 == 1) {
                    view.setContentDescription(LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload));
                } else {
                    view.setContentDescription(LocaleController.getString("AccActionPause", R.string.AccActionPause));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void s0() {
        AnimatorSet animatorSet;
        View view = this.f31139z2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f31139z2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.A2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A2 = null;
        }
        org.telegram.ui.Components.ue0 ue0Var = this.C1;
        if (ue0Var != null && (animatorSet = ue0Var.f28374s) != null) {
            animatorSet.cancel();
            ue0Var.f28374s = null;
            ue0Var.f28371f = false;
        }
    }

    public final ImageLocation s1(int i10, long[] jArr) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
                    }
                    return ImageLocation.getForSecureDocument((SecureDocument) arrayList.get(i10));
                }
            } else {
                ArrayList arrayList2 = this.f30919a7;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f30939c7;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (ImageLocation) this.f30929b7.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.Y6;
                    if (!arrayList4.isEmpty() && i10 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i10);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                if (closestPhotoSizeWithSize != null) {
                                    if (jArr != null) {
                                        long j3 = closestPhotoSizeWithSize.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
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
                                            long j10 = closestPhotoSizeWithSize2.size;
                                            jArr[0] = j10;
                                            if (j10 == 0) {
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
                                        long j11 = closestPhotoSizeWithSize3.size;
                                        jArr[0] = j11;
                                        if (j11 == 0) {
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
                                    if (this.C5 == 5) {
                                        return ImageLocation.getForDocument(document2);
                                    }
                                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90);
                                        if (jArr != null) {
                                            long j12 = closestPhotoSizeWithSize4.size;
                                            jArr[0] = j12;
                                            if (j12 == 0) {
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
            MessageObject messageObject = this.T4;
            if (messageObject == null || !messageObject.isSponsored()) {
                ct0 ct0Var = this.f31121x2;
                AndroidUtilities.cancelRunOnUIThread(ct0Var);
                AndroidUtilities.runOnUIThread(ct0Var, 3000);
            }
        }
    }

    public final void s3() {
        if (this.A0 != null && this.M != null) {
            float f7 = 0.0f;
            for (int i10 = 0; i10 < this.A0.getChildCount(); i10++) {
                View childAt = this.A0.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f7 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f7;
                }
            }
            CheckBox checkBox = this.N0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f7 = Math.max(f7, AndroidUtilities.dp(48.0f));
            }
            CounterView counterView = this.O0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f7 = Math.max(f7, AndroidUtilities.dp(100.0f));
            }
            cv0 cv0Var = this.M;
            ValueAnimator valueAnimator = cv0Var.f32925n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                cv0Var.f32925n = null;
            }
            cv0Var.f32926r = f7;
            cv0Var.f32923c[0].setRightPadding((int) f7);
            cv0Var.d.setRightPadding(f7);
        }
    }

    public void setAnimationValue(float f7) {
        this.f31015l6 = f7;
        this.f30950e0.invalidate();
        F1();
    }

    public final void t0() {
        if (this.f30934c2 == 11) {
            pu0 pu0Var = this.f31086t5;
            if (pu0Var.f41382j0 == 2) {
                pu0Var.setCutOutState(true);
                X2(true, true);
                this.p5.f();
                this.f30950e0.invalidate();
            }
        }
    }

    public final void t2(long j3) {
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null && ku0Var.f27286x) {
            ku0Var.i(j3);
        } else {
            org.telegram.ui.Components.h71 h71Var = this.F2;
            if (h71Var != null) {
                h71Var.K(j3);
            }
        }
        C3();
    }

    public final void t3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f31051p7) {
            charSequence = this.f31059q7;
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
            f1().setText(org.telegram.ui.Components.x5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.bu editText = f1().f4995f.getEditText();
        bo boVar = this.l4;
        if (boVar != null && ((encryptedChat = boVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void u0() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.I2 = null;
        }
    }

    public final int u1() {
        return this.f31074s2.left;
    }

    public final void u2(float f7) {
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            h71Var.K(f7 * ((float) h71Var.p()));
            return;
        }
        ku0 ku0Var = this.f30959f0;
        if (ku0Var != null) {
            ku0Var.i(f7 * ku0Var.getVideoDuration());
        }
    }

    public final void u3() {
        int i10 = org.telegram.ui.ActionBar.j6.f19272zf;
        int z12 = z1(i10);
        ii.y1 y1Var = this.S0;
        if (y1Var != null) {
            y1Var.k();
            this.S0.invalidate();
        }
        CheckBox checkBox = this.N0;
        if (checkBox != null) {
            checkBox.c(z1(i10), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(z12, mode);
        ImageView imageView = this.Y0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.Z0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f30933c1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f30933c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f30923b1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f30923b1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f30914a1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f30914a1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Components.sf0 sf0Var = this.U0;
        if (sf0Var != null) {
            sf0Var.f27852b.setTextColor(z12);
        }
        org.telegram.ui.Components.sf0 sf0Var2 = this.O7;
        if (sf0Var2 != null) {
            sf0Var2.f27852b.setTextColor(z12);
        }
        cu0 cu0Var = this.L1;
        if (cu0Var != null) {
            cu0Var.e();
        }
        org.telegram.ui.Components.jf0 jf0Var = this.I1;
        if (jf0Var != null) {
            ImageView imageView6 = jf0Var.B0;
            ImageView imageView7 = jf0Var.A0;
            ImageView imageView8 = jf0Var.f25266z0;
            org.telegram.ui.ActionBar.f6 f6Var = jf0Var.I0;
            TextView textView = jf0Var.f25242g0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), mode));
            }
            jf0Var.h();
        }
        dt0 dt0Var = this.U1;
        if (dt0Var != null) {
            dt0Var.H(this.f31101v2);
        }
        et0 et0Var = this.V1;
        if (et0Var != null) {
            et0Var.H(this.f31101v2);
        }
        at0 at0Var = this.R7;
        if (at0Var != null) {
            at0Var.invalidate();
        }
        lv0 lv0Var = this.f31037o1;
        if (lv0Var != null) {
            int childCount = lv0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f31037o1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.y5) {
                    ((org.telegram.ui.Cells.y5) childAt).f21667c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
                }
            }
        }
        ts0 ts0Var = this.U3;
        if (ts0Var != null) {
            ts0Var.z0(true);
        }
    }

    public final void v0() {
        float f7;
        org.telegram.ui.ActionBar.a0 a0Var = this.A0;
        if (a0Var != null) {
            if (this.f30961f2) {
                f7 = -AndroidUtilities.dp(4.0f);
            } else {
                f7 = 0.0f;
            }
            a0Var.setTranslationX(f7);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.E0;
        if (w0Var != null) {
            I2(w0Var, this.f30961f2, false);
        }
        boolean z10 = this.f30952e2;
        if (z10 && this.I == null) {
            ch.d c10 = this.Y.c(this.G, null, false);
            c10.o(eh.b.i(this.f31101v2));
            c10.q(AndroidUtilities.dp(20.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = gh.d.f10010a;
            this.I = new gh.c(dp, dp2, c10);
        }
        if (z10) {
            w7.z5.a(this.G);
            this.G.setBackground(this.I);
            return;
        }
        this.G.setStateListAnimator(null);
        this.G.setBackground(this.H);
    }

    public final TLRPC.Document v1() {
        int i10;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f30974g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f31097u7;
                }
            }
        }
        return null;
    }

    public final int v2() {
        if (this.f31089t8 > 1048576000) {
            return this.Y7 - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i10 = this.Y7;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = globalMainSettings.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        return Math.min(2, Math.round(DownloadController.getInstance(this.T).getMaxVideoBitrate() / (100.0f / i10)) - 1);
    }

    public final void v3(boolean z10) {
        xu0 xu0Var;
        int i10;
        if (this.f30934c2 != 1 && (xu0Var = this.f30950e0) != null) {
            if (!z10) {
                if (xu0Var.getPaddingLeft() <= 0 && this.f30950e0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f30950e0.setSystemUiVisibility(i10);
        }
    }

    public final boolean w0() {
        if (this.f31031n4 != 0) {
            F1();
            if (Math.abs(this.f31040o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f31049p4;
                if (runnable != null) {
                    runnable.run();
                    this.f31049p4 = null;
                }
                this.f31031n4 = 0;
            }
        }
        if (this.f31031n4 == 0) {
            return false;
        }
        return true;
    }

    public final RenderNode w1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j3;
        if (this.J8 == null) {
            renderNode = null;
        } else {
            renderNode = this.K8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = ah.i.a(AndroidUtilities.dp(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a2, a2, Shader.TileMode.CLAMP));
                this.K8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.J8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.J8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.J8.getWidth(), ceil2 / this.J8.getHeight());
                beginRecording.drawRenderNode(this.J8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        ah.a aVar = this.L8;
        aVar.f418b = 0L;
        aVar.f417a = false;
        for (float f7 : colorMatrix.getArray()) {
            aVar.c(f7);
        }
        aVar.a(0L);
        if (aVar.f417a) {
            j3 = -1;
        } else {
            j3 = aVar.f418b;
        }
        RenderNode renderNode2 = (RenderNode) this.M8.f(j3);
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

    public final void w2(final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12, boolean z13) {
        long j3;
        VideoEditedInfo videoEditedInfo;
        String str;
        float f7;
        char c10;
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
        bo boVar;
        org.telegram.ui.Components.s40 s40Var;
        String str2;
        long j10;
        String string;
        TextureView textureView;
        if (!H1() && this.d != null && !this.f31092u2) {
            if (this.f30934c2 == 1) {
                if (!z13 && (s40Var = this.f31038o2) != null) {
                    TLObject tLObject = s40Var.f27760a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j11 = user.f18268id;
                        str2 = str3;
                        j10 = j11;
                    } else {
                        str2 = "";
                        j10 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f30950e0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    c2Var.V0 = dp;
                    Context context = this.f30950e0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f34834a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f34835b = imageReceiver2;
                    org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
                    view.e = new Path();
                    int i13 = UserConfig.selectedAccount;
                    f9Var.m(i13, UserConfig.getInstance(i13).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), f9Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), f9Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f34837f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f31038o2.f27760a;
                    xu0 xu0Var = this.f30950e0;
                    org.telegram.ui.Components.ue0 ue0Var = this.C1;
                    f9Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, f9Var);
                    view.f34836c = xu0Var;
                    view.d = ue0Var;
                    c2Var.V = view;
                    if (this.f31038o2.f27762c == 1) {
                        if (UserConfig.getInstance(this.T).clientUserId == j10) {
                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage));
                        } else {
                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2));
                        }
                        if (this.I4) {
                            string = LocaleController.getString("SetVideo", R.string.SetVideo);
                        } else {
                            string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                        }
                    } else {
                        if (this.I4) {
                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2));
                        } else {
                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2));
                        }
                        string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                    }
                    String str4 = string;
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new bs0(0));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                            Drawable[] drawableArr = PhotoViewer.T8;
                            PhotoViewer.this.w2(z10, i10, i11, z11, z12, true);
                        }
                    });
                    c2Var.I = org.telegram.ui.ActionBar.j6.f19091pg;
                    c2Var.T0 = true;
                    c2Var.i(i0.a.k(-15461356, 204));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19054ng, false));
                    c2Var.setOnDismissListener(new gt0(this));
                    if (this.f31063r1 && (textureView = this.B2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f31131y2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.B2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f31131y2.addView(this.E3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.C3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.C3 = null;
                            }
                            FileLog.e(th2);
                            return;
                        }
                    }
                    return;
                }
                m0();
            }
            if (!z11 && (boVar = this.l4) != null) {
                TLRPC.Chat chat2 = boVar.e;
                if (boVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.T).edit().putBoolean("silent_" + this.l4.a(), !z10).commit();
                }
            }
            VideoEditedInfo n12 = n1();
            ArrayList arrayList = this.f30974g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = n12;
                }
            }
            bo boVar2 = this.l4;
            if (boVar2 != null && (chat = boVar2.e) != null) {
                if (!this.f31063r1 && n12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.w1.p(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.vc(this.f30950e0, this.f31101v2), null);
                    return;
                } else if (!z14 && !ChatObject.canSendPhoto(this.l4.e)) {
                    org.telegram.messenger.w1.p(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.vc(this.f30950e0, this.f31101v2), null);
                    return;
                }
            }
            this.f31092u2 = true;
            if (n12 != null) {
                long j12 = ((float) n12.estimatedSize) * 0.9f;
                if ((j12 > 2097152000 && !UserConfig.getInstance(this.T).isPremium()) || j12 > 4194304000L) {
                    if (this.a2 != null) {
                        org.telegram.ui.Components.vi viVar = this.a2;
                        new rg.j0(6, UserConfig.selectedAccount, viVar.getContainer().getContext(), viVar.f28742f0, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.f30934c2 == 11) {
                    Object obj2 = arrayList.get(this.P4);
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
                        int k12 = k1(this.f31094u4);
                        i1();
                        float dp2 = k12 - AndroidUtilities.dp(20.0f);
                        qg.p2 p2Var = this.p5;
                        if (p2Var != null && p2Var.f41588i0 && p2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.p5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.C4.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.C4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f31132y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            canvas.translate((-this.C4.getImageWidth()) / 2.0f, (-this.C4.getImageHeight()) / 2.0f);
                            j3 = 0;
                            canvas.scale(this.C4.getImageWidth() / this.f31132y4.getMeasuredWidth(), this.C4.getImageHeight() / this.f31132y4.getMeasuredHeight());
                            this.f31132y4.e = !B1();
                            this.f31132y4.draw(canvas);
                            this.f31132y4.e = true;
                            canvas.restore();
                        } else {
                            j3 = 0;
                        }
                        if (B1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f17 = dp2 / 2.0f;
                            matrix.preTranslate(f17, f17);
                            if (this.f31050p6 != null) {
                                f14 = AndroidUtilities.lerp(0.0f, this.f30973g6, this.f31015l6);
                                f10 = AndroidUtilities.lerp(this.f30918a6, this.f30956e6, this.f31015l6);
                                f7 = 2.0f;
                                f11 = AndroidUtilities.lerp(this.f30928b6, this.f30965f6, this.f31015l6);
                                c10 = 0;
                                f12 = AndroidUtilities.lerp(this.Y5, this.f30947d6, this.f31015l6);
                                f13 = AndroidUtilities.lerp(this.X5, this.f30938c6, this.f31015l6);
                            } else {
                                f7 = 2.0f;
                                c10 = 0;
                                f10 = this.f30918a6;
                                f11 = this.f30928b6;
                                f12 = this.Y5;
                                f13 = this.X5;
                                if (this.f31033n6 != j3) {
                                    f13 = this.f30938c6;
                                    f12 = this.f30947d6;
                                    f10 = this.f30956e6;
                                }
                                f14 = 0.0f;
                            }
                            int k13 = k1(this.f31094u4);
                            int i14 = i1();
                            matrix.preTranslate(f13, f12 + 0.0f);
                            matrix.preScale(f10, f10);
                            matrix.preRotate(f11);
                            int bitmapWidth = this.C4.getBitmapWidth();
                            int bitmapHeight = this.C4.getBitmapHeight();
                            float f18 = k13;
                            float f19 = i14;
                            float min = Math.min(f18 / bitmapWidth, f19 / bitmapHeight);
                            lg.g gVar = this.D1;
                            int i15 = gVar.f14075i;
                            if (i15 != 90 && i15 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f20 = gVar.f14076j;
                            float f21 = gVar.f14077k;
                            float f22 = bitmapHeight;
                            float f23 = bitmapWidth;
                            float f24 = f18 / ((int) ((((1.0f - f20) * 0.0f) + f20) * f22));
                            float f25 = (int) ((((1.0f - f21) * 0.0f) + f21) * f23);
                            if (f24 * f25 > f19) {
                                f24 = f19 / f25;
                            }
                            int i16 = this.f30934c2;
                            uu0 uu0Var = this.X4;
                            if (i16 == 1 || gVar.f14070a) {
                                TextureView textureView2 = this.B2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = uu0Var.f38225c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f16 = -1.0f;
                                    } else {
                                        f16 = 1.0f;
                                    }
                                    textureView2.setScaleX(f16);
                                    wu0 wu0Var = this.E2;
                                    if (wu0Var != null) {
                                        wu0Var.setScaleX(this.B2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = uu0Var.f38225c;
                                if (cropState4 != null) {
                                    f15 = cropState4.cropScale;
                                } else {
                                    f15 = 1.0f;
                                }
                                float z15 = ((f24 / min) / com.google.android.gms.internal.vision.e2.z(f15, 1.0f, 0.0f, 1.0f)) * f15;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.e * 1.0f);
                                matrix.preScale(z15, z15);
                                matrix.preTranslate(com.google.android.gms.internal.vision.e2.C(gVar.f14071b, f22, min, 1.0f), com.google.android.gms.internal.vision.e2.C(gVar.f14072c, f23, min, 1.0f));
                                float f26 = gVar.f14074g + i15;
                                if (f26 > 180.0f) {
                                    f26 -= 360.0f;
                                }
                                matrix.preRotate(f26);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = uu0Var.f38225c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f14 > 0.0f) {
                                matrix.preScale(1.0f - (f14 * f7), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.w1.A(1.0f, f14, 4.0f * f14, 0.25f));
                            }
                            matrix.preTranslate((-this.C4.getImageWidth()) / f7, (-this.C4.getImageHeight()) / f7);
                            matrix.preScale(this.C4.getImageWidth(), this.C4.getImageHeight());
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = photoEntry.mediaEntities;
                            int size = arrayList3.size();
                            String str5 = null;
                            int i17 = 0;
                            while (i17 < size) {
                                VideoEditedInfo.MediaEntity mediaEntity = arrayList3.get(i17);
                                i17++;
                                VideoEditedInfo.MediaEntity copy = mediaEntity.copy();
                                float f27 = copy.f15636x;
                                float f28 = copy.f15637y;
                                float f29 = copy.width + f27;
                                float f30 = copy.height + f28;
                                float f31 = dp2;
                                float[] fArr = new float[8];
                                fArr[c10] = f27;
                                fArr[1] = f28;
                                fArr[2] = f29;
                                fArr[3] = f28;
                                fArr[4] = f29;
                                fArr[5] = f30;
                                fArr[6] = f27;
                                fArr[7] = f30;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[c10] - fArr[2], 2.0d))) / f31;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[c10] - fArr[6], 2.0d))) / f31;
                                copy.height = sqrt;
                                copy.f15636x = (((fArr[c10] + fArr[4]) / f7) / f31) - (copy.width / f7);
                                copy.f15637y = (((fArr[1] + fArr[5]) / f7) / f31) - (sqrt / f7);
                                copy.scale = 1.0f;
                                copy.customTextView = true;
                                if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                    copy.rotation = (float) (copy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                                }
                                copy.rotation = (float) (copy.rotation - ((this.f30928b6 / 180.0f) * 3.141592653589793d));
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
                        if (this.f31067r5 == null) {
                            this.f31067r5 = new ArrayList();
                        }
                        if (this.f31067r5.isEmpty()) {
                            String str6 = this.p5.f41581c0;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f31067r5.add(this.p5.f41581c0);
                            } else if (str != null) {
                                this.f31067r5.add(str);
                            } else {
                                this.f31067r5.add("👍");
                            }
                        }
                        this.f31092u2 = false;
                        ut q6 = ut.q();
                        qg.p2 p2Var2 = this.p5;
                        ArrayList arrayList4 = this.f31067r5;
                        ht0 ht0Var = new ht0(this, file, videoEditedInfo, photoEntry, z10, i10, i11, z12);
                        qt qtVar = q6.U;
                        Activity findActivity = AndroidUtilities.findActivity(p2Var2.getContext());
                        if (findActivity != null) {
                            q6.w(findActivity);
                            q6.v(ht0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            q6.f38211o = arrayList4;
                            q6.t(null, importingSticker, null, null, null, 3, false, null, new ai.d(), 0);
                            AndroidUtilities.cancelRunOnUIThread(qtVar);
                            AndroidUtilities.runOnUIThread(qtVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.P4, n12, z10, i10, i11, z12);
            } else {
                this.d.L(n12);
            }
            if (this.O) {
                if (this.P) {
                    AndroidUtilities.runOnUIThread(new ds0(this, 0), 200L);
                } else {
                    G0(false, false);
                }
            }
        }
    }

    public final void w3(float f7) {
        int k12;
        int i12;
        boolean z10;
        View view;
        ut0 ut0Var = this.f31131y2;
        if (ut0Var != null && ut0Var.getVisibility() == 0 && this.H3) {
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            f7 *= Math.min(k1(this.f31094u4) / view.getMeasuredWidth(), i1() / view.getMeasuredHeight());
        }
        float imageWidth = this.C4.getImageWidth();
        float imageHeight = this.C4.getImageHeight();
        MediaController.CropState cropState = this.X4.f38225c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.f30934c2 == 11) {
            k12 = (int) (imageWidth * f7);
        } else {
            k12 = ((int) ((imageWidth * f7) - k1(this.f31094u4))) / 2;
        }
        if (this.f30934c2 == 11) {
            i12 = (int) (imageHeight * f7);
        } else {
            i12 = ((int) ((imageHeight * f7) - i1())) / 2;
        }
        float f10 = 0.0f;
        if (k12 > 0) {
            this.E6 = -k12;
            this.F6 = k12;
        } else {
            this.F6 = 0.0f;
            this.E6 = 0.0f;
        }
        if (i12 > 0) {
            this.G6 = -i12;
            this.H6 = i12;
        } else {
            this.H6 = 0.0f;
            this.G6 = 0.0f;
        }
        cu0 cu0Var = this.L1;
        if (cu0Var != null) {
            if (f7 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = cu0Var.f41572x1;
            boolean z11 = !z10;
            if (cu0Var.Y1 != z11) {
                cu0Var.Y1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f10 = 1.0f;
                }
                org.telegram.messenger.wl.q(animate.alpha(f10), org.telegram.ui.Components.qr.h, 240L);
            }
        }
    }

    public final void x0(boolean z10) {
        View view;
        float x10;
        float y3;
        float f7;
        float f10;
        if (z10) {
            TextureView textureView = this.f31112w3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new g7(this, 5));
                this.f31112w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f31122x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f31122x3.setImageDrawable(null);
                Bitmap bitmap = this.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C3 = null;
                }
            }
            this.L3 = false;
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            ut0 ut0Var = this.f31131y2;
            if (ut0Var != null) {
                int[] iArr = this.A3;
                ut0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f30950e0.getTranslationY());
                ImageView imageView2 = this.f31122x3;
                Rect rect = this.f31074s2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f31131y2.getX());
                }
                wu0 wu0Var = this.E2;
                if (wu0Var != null) {
                    wu0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jr0(this, 4));
                if (this.D2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f31131y2.getX();
                }
                if (this.D2) {
                    y3 = 0.0f;
                } else {
                    y3 = iArr[1] - this.f31131y2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f31122x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f31122x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f31122x3;
                Property property3 = View.TRANSLATION_X;
                if (this.D2) {
                    f7 = 0.0f;
                } else {
                    f7 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f7));
                ImageView imageView6 = this.f31122x3;
                Property property4 = View.TRANSLATION_Y;
                if (this.D2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f10));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x10));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y3));
                arrayList.add(ObjectAnimator.ofInt(this.L0, org.telegram.ui.Components.q6.d, 255));
                wu0 wu0Var2 = this.E2;
                if (wu0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(wu0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property4, y3));
                }
                org.telegram.ui.Components.fg0.o(this.f31131y2.getAspectRatio(), false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ai.x(22, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new js0(this, view, 0));
                animatorSet.start();
                nu0 nu0Var = new nu0();
                nu0Var.f36161c = false;
                nu0Var.d = false;
                nu0Var.f36159a = 250;
                nu0Var.f36160b = decelerateInterpolator;
                k3(true, true, nu0Var);
                this.G3 = 0;
            }
        }
    }

    public final int x1() {
        return this.f31074s2.right;
    }

    public final void x2(org.telegram.ui.Components.s40 s40Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f31038o2 = s40Var;
        if (this.f30934c2 == 1) {
            if (E3()) {
                this.f31027n0.setVisibility(0);
                this.S0.setVisibility(8);
            } else {
                this.S0.setVisibility(0);
                this.f31027n0.setVisibility(8);
            }
            if (s40Var != null && (user = s40Var.f27761b) != null && s40Var.f27762c == 1 && this.f31038o2.d) {
                if (s40Var.e) {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.C1.setSubtitle(null);
            }
        }
        if (s40Var != null) {
            if (s40Var.f27762c == 2) {
                if (s40Var.e) {
                    str = "SuggestVideo";
                    i10 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i10 = R.string.SuggestPhoto;
                }
                O2(LocaleController.getString(str, i10));
            }
            if (s40Var.e) {
                this.S7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.F.setBackground(null);
            this.F.setElevation(2.0f);
        }
    }

    public final void x3() {
        boolean z10;
        org.telegram.ui.Components.h71 h71Var = this.F2;
        if (h71Var != null) {
            if (!b5.d.u() && !this.f31061r) {
                z10 = false;
            } else {
                z10 = true;
            }
            h71Var.O(z10);
        }
        if (!this.f31001j8) {
            this.f30951e1.setEnabled(false);
            this.f30951e1.setClickable(false);
            this.f30951e1.animate().alpha(0.5f).setDuration(180L).start();
            this.R7.setMode(0);
            return;
        }
        this.f30951e1.setEnabled(true);
        this.f30951e1.setClickable(true);
        this.f30951e1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f31061r) {
            if (this.f30954e4 == null) {
                this.M.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.kc0 kc0Var = this.f30942d1;
            kc0Var.e = true;
            kc0Var.invalidateSelf();
            if (this.f30995j1.getTag() != null) {
                this.f30995j1.setAlpha(0.5f);
                this.f30995j1.setEnabled(false);
            }
            if (this.f30934c2 == 1) {
                this.R7.setMaxProgressDiff(9600.0f / this.f30984h8);
                this.R7.setMode(1);
                B3();
                return;
            }
            this.R7.setMaxProgressDiff(1.0f);
            this.R7.setMode(0);
            return;
        }
        this.M.a(this.C8, true);
        org.telegram.ui.Components.kc0 kc0Var2 = this.f30942d1;
        kc0Var2.e = false;
        kc0Var2.invalidateSelf();
        if (this.f30995j1.getTag() != null) {
            this.f30995j1.setAlpha(1.0f);
            this.f30995j1.setEnabled(true);
        }
        this.R7.setMaxProgressDiff(1.0f);
        this.R7.setMode(0);
    }

    public final void y0() {
        fv0 fv0Var = this.f30946d5;
        if (fv0Var != null) {
            fv0Var.f33763a.setVisible(true, true);
        }
        dv0 dv0Var = this.d;
        fv0 fv0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (dv0Var != null) {
            MessageObject messageObject = this.T4;
            ImageLocation imageLocation = this.Z4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            fv0Var2 = dv0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f30946d5 = fv0Var2;
        if (fv0Var2 != null && !fv0Var2.f33778s) {
            fv0Var2.f33763a.setVisible(false, true);
        }
    }

    public final void y2(boolean z10) {
        if (this.f31029n2 != z10) {
            this.f31029n2 = z10;
            this.Q1.setLayerType(2, null);
            this.Q1.getCurrentView().setLayerType(2, null);
            this.Q1.getNextView().setLayerType(2, null);
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
        float f7;
        MessageObject messageObject2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (!isEmpty && ((messageObject = this.T4) == null || !messageObject.isSponsored())) {
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = this.P4;
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
                        if (messageObject3.isYouTubeVideo() && (messageObject2 = this.T4) != null && messageObject2.getId() == messageObject3.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i10 = messageObject3.messageOwner.media.webpage.embed_width;
                        } else if (i12 == 0 && (textureView = this.B2) != null) {
                            i10 = textureView.getMeasuredWidth();
                        } else {
                            i10 = 0;
                        }
                        if (z10) {
                            i11 = messageObject3.messageOwner.media.webpage.embed_height;
                        } else if (i12 == 0 && (textureView2 = this.B2) != null) {
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
                                    i10 = documentAttribute.f18128w;
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
                            if (this.J) {
                                imageViewArr[i12].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f30950e0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f30950e0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f31050p6 != null) {
                            float f10 = this.X5;
                            f7 = ((this.f30938c6 - f10) * this.f31015l6) + f10;
                        } else {
                            f7 = this.X5;
                        }
                        float f11 = 0.0f;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                f11 = ((-AndroidUtilities.displaySize.x) - AndroidUtilities.dp(15.0f)) + (f7 - this.F6);
                            } else {
                                float f12 = this.E6;
                                if (f7 < f12) {
                                    f11 = f7 - f12;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f31101v2;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void z2() {
        org.telegram.ui.Components.v61 v61Var;
        org.telegram.ui.Components.v61 v61Var2;
        if (!this.f30969g2 && this.f30934c2 == 1) {
            if (!this.f31063r1 || ((v61Var2 = (org.telegram.ui.Components.v61) this.B2) != null && v61Var2.getVideoWidth() > 0 && v61Var2.getVideoHeight() > 0)) {
                this.f30969g2 = true;
                Bitmap bitmap = this.C4.getBitmap();
                int orientation = this.C4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f30976h0.getBitmap();
                    orientation = this.f30976h0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i10 = orientation;
                if (bitmap2 != null || this.B2 != null) {
                    org.telegram.ui.Components.ue0 ue0Var = this.C1;
                    if (this.f31063r1) {
                        v61Var = (org.telegram.ui.Components.v61) this.B2;
                    } else {
                        v61Var = null;
                    }
                    ue0Var.b(bitmap2, i10, false, false, this.D1, v61Var, this.X4.f38225c);
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
    public final void C(float f7, int i10) {
    }
}
