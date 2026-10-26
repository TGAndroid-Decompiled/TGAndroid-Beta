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
import org.telegram.messenger.DispatchQueue2;
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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t20, org.telegram.ui.Components.s20, uf.a, oe.d {
    public static Drawable[] U8;
    public static final Paint V8 = new Paint(2);
    public static final HashMap W8 = new HashMap();
    public static DecelerateInterpolator X8;
    public static Paint Y8;
    public static final Property Z8;
    public static volatile PhotoViewer f35606a9;
    public static volatile PhotoViewer f35607b9;
    public org.telegram.ui.ActionBar.z A0;
    public org.telegram.ui.Components.qp0 A1;
    public AnimatorSet A2;
    public final int[] A3;
    public org.telegram.ui.Components.yd0 A4;
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
    public org.telegram.ui.Components.of0 C1;
    public SurfaceView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public NotificationCenter.ObserversGroup C7;
    public boolean C8;
    public org.telegram.ui.ActionBar.w0 D0;
    public final ng.g D1;
    public boolean D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public String D8;
    public ContextThemeWrapper E;
    public org.telegram.ui.ActionBar.w0 E0;
    public ng.g E1;
    public hu0 E2;
    public ImageView E3;
    public org.telegram.ui.Components.qa E4;
    public long E5;
    public float E6;
    public float E7;
    public final org.telegram.ui.Components.h6 E8;
    public org.telegram.ui.Components.b8 F;
    public org.telegram.ui.ActionBar.g1 F0;
    public ng.g F1;
    public org.telegram.ui.Components.s81 F2;
    public boolean F3;
    public org.telegram.ui.Components.qa F4;
    public bh.x0 F5;
    public float F6;
    public final xq0 F7;
    public org.telegram.ui.Components.h6[] F8;
    public ImageView G;
    public org.telegram.ui.Components.w7 G0;
    public MediaController.CropState G1;
    public sf.d G2;
    public int G3;
    public org.telegram.ui.Components.qa G4;
    public String G5;
    public float G6;
    public Path G7;
    public RectF G8;
    public Drawable H;
    public xa1 H0;
    public MediaController.CropState H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public Paint H7;
    public RectF H8;
    public ih.c I;
    public f81 I0;
    public org.telegram.ui.Components.eg0 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public Paint I7;
    public Matrix I8;
    public boolean J;
    public or J0;
    public AnimatorSet J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public LinearGradient J7;
    public float[] J8;
    public boolean K;
    public final HashMap K0;
    public fi.z3 K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public LinearGradient K7;
    public RenderNode K8;
    public AnimatorSet L;
    public final BackgroundDrawable L0;
    public nt0 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public RenderNode L8;
    public nu0 M;
    public final Paint M0;
    public boolean M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Matrix M7;
    public final ch.a M8;
    public lu0 N;
    public CheckBox N0;
    public mt0 N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public final int[] N7;
    public final a0.h N8;
    public boolean O;
    public CounterView O0;
    public boolean O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public su0 O7;
    public boolean O8;
    public boolean P;
    public bi.j5 P0;
    public org.telegram.ui.ActionBar.e2 P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public org.telegram.ui.Components.og0 P7;
    public View P8;
    public js0 Q;
    public FrameLayout Q0;
    public eu0 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public RadialProgressView Q7;
    public a8.fg Q8;
    public boolean R;
    public FrameLayout R0;
    public FrameLayout R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public FrameLayout R7;
    public TextureView R8;
    public Paint S;
    public li.w1 S0;
    public TextView S1;
    public org.telegram.ui.Components.s81 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public ls0 S7;
    public boolean S8;
    public int T;
    public org.telegram.ui.Components.gg0 T0;
    public ot0 T1;
    public SurfaceTexture T2;
    public View T3;
    public MessageObject T4;
    public boolean T5;
    public int T6;
    public TextView T7;
    public boolean T8;
    public int U;
    public org.telegram.ui.Components.og0 U0;
    public os0 U1;
    public boolean U2;
    public es0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public AnimatorSet U7;
    public int V;
    public TextView V0;
    public ps0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public float W;
    public final mu0[] W0;
    public float W1;
    public boolean W2;
    public at0 W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public m4.w1 X;
    public ld X0;
    public k0 X1;
    public boolean X2;
    public int X3;
    public final fu0 X4;
    public float X5;
    public final SparseArray[] X6;
    public long X7;
    public ch.b Y;
    public ImageView Y0;
    public FrameLayout Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public se.b Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public ImageLocation Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public volatile int Z7;
    public final oe.b f35608a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 380, false);
    public se.b f35609a0;
    public ImageView f35610a1;
    public org.telegram.ui.Components.ti a2;
    public float f35611a3;
    public final org.telegram.ui.Cells.f1 f35612a4;
    public ImageLocation f35613a5;
    public float f35614a6;
    public final ArrayList f35615a7;
    public int f35616a8;
    public final boolean f35617b;
    public org.telegram.ui.Components.la f35618b0;
    public ImageView f35619b1;
    public ag.a1 f35620b2;
    public String f35621b3;
    public final VideoFramesRewinder f35622b4;
    public SecureDocument f35623b5;
    public float f35624b6;
    public final ArrayList f35625b7;
    public int f35626b8;
    public int f35627c;
    public org.telegram.ui.Components.pa f35628c0;
    public ImageView f35629c1;
    public int f35630c2;
    public String f35631c3;
    public final xs0 f35632c4;
    public final String[] f35633c5;
    public float f35634c6;
    public final ArrayList f35635c7;
    public volatile int f35636c8;
    public ou0 d;
    public WindowManager.LayoutParams f35637d0;
    public org.telegram.ui.Components.cd0 f35638d1;
    public boolean f35639d2;
    public long f35640d3;
    public final org.telegram.ui.Cells.b2 f35641d4;
    public qu0 f35642d5;
    public float f35643d6;
    public final ArrayList f35644d7;
    public volatile int f35645d8;
    public boolean e;
    public iu0 f35646e0;
    public org.telegram.ui.ActionBar.k0 f35647e1;
    public boolean f35648e2;
    public float f35649e3;
    public CharSequence f35650e4;
    public String f35651e5;
    public float f35652e6;
    public final ArrayList f35653e7;
    public volatile int f35654e8;
    public boolean f35655f;
    public vt0 f35656f0;
    public org.telegram.ui.Components.ba0 f35657f1;
    public boolean f35658f2;
    public boolean f35659f3;
    public boolean f35660f4;
    public long f35661f5;
    public float f35662f6;
    public final ArrayList f7;
    public volatile int f35663f8;
    public pu0 f35664g0;
    public ms0 f35665g1;
    public boolean f35666g2;
    public long f35667g3;
    public boolean f35668g4;
    public String f35669g5;
    public float f35670g6;
    public final ArrayList g7;
    public volatile int f35671g8;
    public int h;
    public ClippingImageView f35672h0;
    public ArrayList f35673h1;
    public boolean f35674h2;
    public boolean f35675h3;
    public final ns0 f35676h4;
    public boolean f35677h5;
    public float f35678h6;
    public ImageLocation f35679h7;
    public volatile int f35680h8;
    public di.i4 f35681i0;
    public ArrayList f35682i1;
    public boolean f35683i2;
    public xu0 f35684i3;
    public final ns0 f35685i4;
    public TL_iv.PageBlock f35686i5;
    public float f35687i6;
    public tu0 f35688i7;
    public float f35689i8;
    public View f35690j0;
    public org.telegram.ui.Components.f81 f35691j1;
    public org.telegram.ui.Components.g6 f35692j2;
    public String f35693j3;
    public final l70 f35694j4;
    public ImageReceiver.BitmapHolder f35695j5;
    public float f35696j6;
    public ku0 f35697j7;
    public int f35698j8;
    public int f35699k0;
    public fi.v3 f35700k1;
    public boolean f35701k2;
    public ValueAnimator f35702k3;
    public final float[][] f35703k4;
    public boolean f35704k5;
    public float f35705k6;
    public final Rect f35706k7;
    public volatile boolean f35707k8;
    public TextView f35708l0;
    public org.telegram.ui.Components.g40 l1;
    public boolean f35709l2;
    public boolean f35710l3;
    public un l4;
    public boolean f35711l5;
    public float f35712l6;
    public final AnimationNotificationsLocker f35713l7;
    public volatile boolean f35714l8;
    public TextView m0;
    public org.telegram.ui.Components.i31 f35715m1;
    public boolean f35716m2;
    public final int[] f35717m3;
    public org.telegram.ui.ActionBar.r2 f35718m4;
    public boolean f35719m5;
    public float f35720m6;
    public ag.b1 f35721m7;
    public long f35722m8;
    public boolean f35723n;
    public TextView f35724n0;
    public UndoView f35725n1;
    public boolean f35726n2;
    public final int[] f35727n3;
    public int f35728n4;
    public boolean f35729n5;
    public long f35730n6;
    public org.telegram.ui.Components.qc f35731n7;
    public long f35732n8;
    public org.telegram.ui.ActionBar.w0 f35733o0;
    public wu0 f35734o1;
    public org.telegram.ui.Components.e50 f35735o2;
    public org.telegram.ui.ActionBar.b6 f35736o3;
    public long f35737o4;
    public String f35738o5;
    public int f35739o6;
    public int f35740o7;
    public float f35741o8;
    public org.telegram.ui.ActionBar.w0 f35742p0;
    public ju0 f35743p1;
    public boolean f35744p2;
    public ImageView f35745p3;
    public Runnable f35746p4;
    public sg.p2 f35747p5;
    public AnimatorSet f35748p6;
    public boolean f35749p7;
    public float f35750p8;
    public org.telegram.ui.ActionBar.g1 f35751q0;
    public ImageReceiver f35752q1;
    public MessagesController.DialogPhotos f35753q2;
    public org.telegram.ui.Components.u81 f35754q3;
    public qu0 f35755q4;
    public org.telegram.ui.Components.fg0 q5;
    public AnimatorSet f35756q6;
    public CharSequence f35757q7;
    public long f35758q8;
    public boolean f35759r;
    public org.telegram.ui.ActionBar.c1 f35760r0;
    public boolean f35761r1;
    public boolean f35762r2;
    public z10 f35763r3;
    public qu0 f35764r4;
    public ArrayList f35765r5;
    public org.telegram.ui.Components.u20 r6;
    public boolean f35766r7;
    public long f35767r8;
    public boolean f35768s;
    public org.telegram.ui.ActionBar.g1 f35769s0;
    public final xq0 f35770s1;
    public final Rect f35771s2;
    public zs0 f35772s3;
    public boolean f35773s4;
    public di.h3 f35774s5;
    public boolean f35775s6;
    public ValueAnimator f35776s7;
    public long f35777s8;
    public org.telegram.ui.ActionBar.g1 f35778t0;
    public float f35779t1;
    public boolean f35780t2;
    public AnimatorSet f35781t3;
    public boolean f35782t4;
    public au0 f35783t5;
    public final DecelerateInterpolator f35784t6;
    public TLRPC.Document f35785t7;
    public long f35786t8;
    public org.telegram.ui.ActionBar.l1 f35787u0;
    public long f35788u1;
    public boolean f35789u2;
    public boolean f35790u3;
    public int f35791u4;
    public LinearLayout f35792u5;
    public float f35793u6;
    public TLRPC.Document f35794u7;
    public long f35795u8;
    public int v;
    public org.telegram.ui.ActionBar.g1 f35796v0;
    public final GradientDrawable[] f35797v1;
    public org.telegram.ui.ActionBar.u6 f35798v2;
    public int f35799v3;
    public final xq0 f35800v4;
    public au0 f35801v5;
    public float f35802v6;
    public boolean f35803v7;
    public long f35804v8;
    public AnimatorSet f35805w;
    public qr f35806w0;
    public final boolean[] f35807w1;
    public final hs0 f35808w2;
    public TextureView f35809w3;
    public int f35810w4;
    public au0 f35811w5;
    public float f35812w6;
    public boolean f35813w7;
    public float f35814w8;
    public final xq0 f35815x;
    public LinearLayout f35816x0;
    public final float[] f35817x1;
    public final ns0 f35818x2;
    public ImageView f35819x3;
    public String f35820x4;
    public au0 f35821x5;
    public float f35822x6;
    public Utilities.Callback2 f35823x7;
    public wt0 f35824x8;
    public Activity f35825y;
    public final ArrayList f35826y0;
    public int f35827y1;
    public ft0 f35828y2;
    public final ImageView[] y3;
    public org.telegram.ui.Components.yd0 f35829y4;
    public au0 f35830y5;
    public float f35831y6;
    public final float[] f35832y7;
    public MessageObject f35833y8;
    public org.telegram.ui.ActionBar.l1 f35834z0;
    public org.telegram.ui.Components.j81 f35835z1;
    public View f35836z2;
    public boolean f35837z3;
    public org.telegram.ui.Components.yd0 f35838z4;
    public long f35839z5;
    public float f35840z6;
    public final float[] f35841z7;
    public boolean f35842z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f35843g = 0;
        public final RectF f35844a;
        public final RectF f35845b;
        public final Paint f35846c;
        public yl0 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f35844a = new RectF();
            this.f35845b = new RectF();
            Paint paint = new Paint(1);
            this.f35846c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            ag.b1 b1Var = photoViewer.f35721m7;
            if (b1Var != null) {
                b1Var.a(!this.e);
            }
            ag.a1 a1Var = photoViewer.f35620b2;
            if (a1Var != null) {
                a1Var.a(!this.e);
            }
            org.telegram.ui.Components.ti tiVar = photoViewer.a2;
            if (tiVar != null) {
                boolean z11 = this.e;
                tiVar.B0.l(tiVar.f33049o2);
                if (tiVar.f33080x2 != z11) {
                    tiVar.f33080x2 = z11;
                    org.telegram.ui.Components.li liVar = tiVar.B0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33033j0;
                    if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f26037i1) {
                        if (z11 && !tiVar.f33084y2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f26044n && !chatAttachAlertPhotoLayout.O0) {
                            if (z10) {
                                org.telegram.ui.Components.pm pmVar = chatAttachAlertPhotoLayout.P;
                                if (pmVar != null) {
                                    chatAttachAlertPhotoLayout.f26047o0 = Boolean.valueOf(pmVar.isFrontface());
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
            yl0 yl0Var;
            qu0 qu0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.T8) {
                if (photoViewer.f35728n4 != 0 && !AndroidUtilities.isTablet() && (qu0Var = photoViewer.f35642d5) != null && qu0Var.f42928m != null) {
                    ClippingImageView clippingImageView = photoViewer.f35672h0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f35845b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f26108b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f26109c;
                    rectF.bottom = scaleY - clippingImageView.f26107a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f7 = bounds.right;
                        float f10 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f35844a;
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
                            canvas.drawRect(rectF2, this.f35846c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (yl0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(yl0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f35825y instanceof LaunchActivity) {
                if (photoViewer.e && i10 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.e = z10;
                if (z10) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new zt0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f35846c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f35848a;
        public final TextPaint f35849b;
        public final Paint f35850c;
        public int d;
        public int e;
        public final RectF f35851f;
        public int h;
        public float f35852n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f35849b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f35850c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f35851f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f35849b;
            this.f35848a = new StaticLayout("" + Math.max(1, i10), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.e = this.f35848a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f35850c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.t6 t6Var = org.telegram.ui.Components.v6.f33580b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, t6Var, 0), ObjectAnimator.ofInt(textPaint, t6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.t6 t6Var2 = org.telegram.ui.Components.v6.f33580b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, t6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, t6Var2, 0, 255));
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
            return this.f35852n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f35850c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f35851f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f35848a != null) {
                this.f35849b.setAlpha((int) ((1.0f - this.f35852n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f35852n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.f35848a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f35852n * 255.0f));
                int centerX = (int) rectF.centerX();
                int d = (int) ic.a.d(1.0f, this.f35852n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
                canvas.drawLine(AndroidUtilities.dp(5.0f) + centerX, d - AndroidUtilities.dp(5.0f), centerX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + d, paint);
                canvas.drawLine(centerX - AndroidUtilities.dp(5.0f), d - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + centerX, AndroidUtilities.dp(5.0f) + d, paint);
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
            this.f35852n = f7;
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
            Z8 = new vr0();
        } else {
            Z8 = new org.telegram.ui.Cells.b1(Float.class, "progress", 4);
        }
        f35606a9 = null;
        f35607b9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35617b = z10;
        this.h = -1;
        this.f35723n = true;
        this.f35815x = new xq0(this, 20);
        this.J = true;
        this.O = true;
        this.P = false;
        this.Z = new se.b();
        this.f35826y0 = new ArrayList();
        this.K0 = new HashMap(3);
        this.L0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.M0 = paint;
        this.W0 = new mu0[3];
        this.f35770s1 = new xq0(this, 21);
        this.f35797v1 = new GradientDrawable[2];
        this.f35807w1 = new boolean[2];
        this.f35817x1 = new float[2];
        this.D1 = new Object();
        this.E1 = new Object();
        this.F1 = new Object();
        this.W1 = -8.0f;
        this.f35771s2 = new Rect();
        this.f35808w2 = new hs0(this);
        this.f35818x2 = new ns0(this, 0);
        this.f35710l3 = true;
        this.f35717m3 = new int[2];
        this.f35727n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f35612a4 = new org.telegram.ui.Cells.f1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f35622b4 = videoFramesRewinder;
        this.f35632c4 = new xs0(this, videoFramesRewinder);
        this.f35641d4 = new org.telegram.ui.Cells.b2(this);
        this.f35676h4 = new ns0(this, 1);
        this.f35685i4 = new ns0(this, 2);
        this.f35694j4 = new l70(this, 1);
        this.f35703k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f35800v4 = new xq0(this, 22);
        this.B4 = new ImageReceiver();
        this.C4 = new di.f3(this, 5);
        this.D4 = new ImageReceiver();
        this.E4 = new org.telegram.ui.Components.qa(1, new xq0(this, 23));
        this.F4 = new org.telegram.ui.Components.qa(1, new xq0(this, 23));
        this.G4 = new org.telegram.ui.Components.qa(1, new xq0(this, 23));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f35633c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f35614a6 = 1.0f;
        this.f35624b6 = 0.0f;
        this.f35739o6 = -1;
        this.f35784t6 = new DecelerateInterpolator(1.5f);
        this.f35812w6 = 1.0f;
        this.f35822x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f35615a7 = new ArrayList();
        this.f35625b7 = new ArrayList();
        this.f35635c7 = new ArrayList();
        this.f35644d7 = new ArrayList();
        this.f35653e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.g7 = new ArrayList();
        this.f35679h7 = null;
        this.f35688i7 = null;
        this.f35706k7 = new Rect();
        this.f35713l7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f35832y7 = new float[]{1.0f};
        this.f35841z7 = new float[]{1.0f};
        this.F7 = new xq0(this, 24);
        this.N7 = new int[2];
        this.V7 = -1L;
        this.W7 = -1L;
        this.X7 = -1L;
        this.Z7 = -1;
        this.E8 = new org.telegram.ui.Components.h6(new xq0(this, 23), 180L, org.telegram.ui.Components.ds.f27587g);
        this.M8 = new Object();
        this.N8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.setFileLoadingPriority(3);
    }

    public static void D(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.s81 s81Var;
        MessageObject messageObject;
        boolean z11;
        iu0 iu0Var = photoViewer.f35646e0;
        photoViewer.f35637d0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f35825y.getSystemService("window")).updateViewLayout(photoViewer.f35664g0, photoViewer.f35637d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        un unVar = photoViewer.l4;
        if (unVar != null && unVar.Y != null && unVar.getFragmentView() != null) {
            hk hkVar = photoViewer.l4.Y;
            if (hkVar.f25992z2) {
                hkVar.p1();
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.l4.getParentActivity(), photoViewer.f35627c);
            photoViewer.l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (s81Var = photoViewer.F2) != null && s81Var.n() > 1500 && (messageObject = photoViewer.T4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.F2.n() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.T).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                c3.h0.r(sb2, MessagesController.getInstance(photoViewer.T).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject2.getId());
                str = sb2.toString();
            }
        }
        ts0 ts0Var = new ts0(photoViewer, photoViewer.f35825y, photoViewer.l4, arrayList, str, num, iu0Var, z10);
        ts0Var.setFocusable(false);
        ts0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new yl0(8, photoViewer, ts0Var), 250L);
        ts0Var.show();
    }

    public static boolean E1() {
        if (f35606a9 != null) {
            return true;
        }
        return false;
    }

    public static void F(PhotoViewer photoViewer) {
        File file;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.s0()) {
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
            photoViewer.f35688i7 = new tu0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            yt0 yt0Var = new yt0();
            yt0Var.f46110c = false;
            photoViewer.m3(false, true, yt0Var);
            AndroidUtilities.runOnUIThread(new hr0(photoViewer, file, z10, messageObject, z11, z12), yt0Var.f46108a);
            return;
        }
        photoViewer.W2();
    }

    public static void H(org.telegram.ui.PhotoViewer r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap J0(android.graphics.Bitmap r16, org.telegram.messenger.MediaController.CropState r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.J0(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean M1(MessageObject messageObject) {
        if (f35606a9 != null && !f35606a9.B3 && f35606a9.e && messageObject != null && f35606a9.T4 != null && f35606a9.T4.getId() == messageObject.getId() && f35606a9.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean N1(MessageObject messageObject) {
        if (f35607b9 != null && messageObject != null && f35607b9.T4 != null && f35607b9.T4.getId() == messageObject.getId() && f35607b9.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean O1(String str) {
        if (f35606a9 != null && f35606a9.e && !f35606a9.f35773s4 && str != null && str.equals(f35606a9.f35651e5)) {
            return true;
        }
        return false;
    }

    public static boolean P1(MessageObject messageObject) {
        boolean z10;
        if (f35606a9 != null && !f35606a9.B3 && f35606a9.e && !f35606a9.f35773s4 && messageObject != null) {
            MessageObject messageObject2 = f35606a9.T4;
            if (messageObject2 == null && f35606a9.d != null) {
                messageObject2 = f35606a9.d.V();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z10 = true;
                if (z10 && f35607b9 != null) {
                    if (f35607b9.e && !f35607b9.f35773s4 && messageObject != null && f35607b9.T4 != null && f35607b9.T4.getId() == messageObject.getId() && f35607b9.T4.getDialogId() == messageObject.getDialogId()) {
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

    public static boolean Q1(TLRPC.BotInlineResult botInlineResult) {
        if (f35606a9 != null && f35606a9.e && !f35606a9.f35773s4 && botInlineResult != null && f35606a9.Y4 != null && botInlineResult.f22025id == f35606a9.Y4.f22025id) {
            return true;
        }
        return false;
    }

    public static boolean R1(TLRPC.FileLocation fileLocation) {
        if (f35606a9 != null && f35606a9.e && !f35606a9.f35773s4 && fileLocation != null) {
            if (f35606a9.Z4 == null || fileLocation.local_id != f35606a9.Z4.location.local_id || fileLocation.volume_id != f35606a9.Z4.location.volume_id || fileLocation.dc_id != f35606a9.Z4.dc_id) {
                if (f35606a9.f35613a5 != null && fileLocation.local_id == f35606a9.f35613a5.location.local_id && fileLocation.volume_id == f35606a9.f35613a5.location.volume_id && fileLocation.dc_id == f35606a9.f35613a5.dc_id) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void T(PhotoViewer photoViewer) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size() && (messageObject = (MessageObject) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f35729n5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f51.L())) {
                photoViewer.C2(messageObject, m2(messageObject), false, true);
            } else {
                photoViewer.C2(messageObject, messageObject.caption, photoViewer.f35729n5, true);
            }
        }
    }

    public static boolean T2(MessageObject messageObject) {
        if (messageObject != null && messageObject.isVideo()) {
            if ((messageObject.mediaExists || messageObject.attachPathExists || messageObject.hasVideoQualities() || (messageObject.canStreamVideo() && SharedConfig.streamMedia)) && SharedConfig.isAutoplayVideo()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void W(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.V7 != -1 && (textureView = photoViewer.B2) != null) {
            photoViewer.V7 = -1L;
            photoViewer.f35836z2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.ds.f27589j).setDuration(85L).setListener(new org.telegram.ui.Components.ll0(10, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void X(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X(org.telegram.ui.PhotoViewer):void");
    }

    public static void Y(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.u81 u81Var = photoViewer.f35754q3;
        if (u81Var.f33296f) {
            i10 = u81Var.d;
        } else {
            i10 = u81Var.f33294b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.u81.S / 2) + i10)) - (photoViewer.f35772s3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f35684i3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f35772s3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            zs0 zs0Var = photoViewer.f35772s3;
            zs0Var.setPivotX(Utilities.clamp((zs0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f35772s3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            zs0 zs0Var2 = photoViewer.f35772s3;
            zs0Var2.setPivotX(Utilities.clamp((zs0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f35772s3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            zs0 zs0Var3 = photoViewer.f35772s3;
            zs0Var3.setPivotX(zs0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f35772s3.setTranslationX(dp);
    }

    public static void Z(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.xj0 lottieAnimation;
        fu0 fu0Var = photoViewer.X4;
        ArrayList arrayList = fu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) fu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.y9) && (lottieAnimation = ((org.telegram.ui.Components.y9) view).getImageReceiver().getLottieAnimation()) != null) {
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

    public static String Z0(int i10, int i11) {
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

    public static void a0(PhotoViewer photoViewer, long j10) {
        org.telegram.ui.Components.xj0 lottieAnimation;
        fu0 fu0Var = photoViewer.X4;
        ArrayList arrayList = fu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) fu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.y9) && (lottieAnimation = ((org.telegram.ui.Components.y9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j11 = photoViewer.f35722m8;
                        long j12 = 0;
                        if (j11 > 0) {
                            j12 = j11 / 1000;
                        }
                        lottieAnimation.U(j10 - j12);
                    }
                }
            }
        }
    }

    public static void b0(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.b0(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String b1(int i10, int i11, int i12) {
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

    public static boolean k(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence m2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt(), false);
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

    public static String r1(ImageLocation imageLocation) {
        if (imageLocation != null && imageLocation.imageType == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer u1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f35606a9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f35606a9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f35606a9 = photoViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return photoViewer;
        }
        return photoViewer2;
    }

    public static String z1() {
        File directory = FileLoader.getDirectory(4);
        return new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg").getAbsolutePath();
    }

    public final void A0() {
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
                                    i10 = documentAttribute.f22034w;
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
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f35646e0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f35646e0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f35748p6 != null) {
                            float f10 = this.X5;
                            f7 = ((this.f35634c6 - f10) * this.f35712l6) + f10;
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

    public final int A1(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f35798v2;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void A2(boolean z10) {
        if (this.f35726n2 != z10) {
            this.f35726n2 = z10;
            this.Q1.setLayerType(2, null);
            this.Q1.getCurrentView().setLayerType(2, null);
            this.Q1.getNextView().setLayerType(2, null);
        }
    }

    public final void A3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A3(int, boolean):void");
    }

    public final void B0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B0(boolean):void");
    }

    public final long B1() {
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null && vt0Var.f30582x) {
            return vt0Var.getVideoDuration();
        }
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.p();
    }

    public final void B2() {
        org.telegram.ui.Components.h81 h81Var;
        org.telegram.ui.Components.h81 h81Var2;
        if (!this.f35666g2 && this.f35630c2 == 1) {
            if (!this.f35761r1 || ((h81Var2 = (org.telegram.ui.Components.h81) this.B2) != null && h81Var2.getVideoWidth() > 0 && h81Var2.getVideoHeight() > 0)) {
                this.f35666g2 = true;
                Bitmap bitmap = this.C4.getBitmap();
                int orientation = this.C4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f35672h0.getBitmap();
                    orientation = this.f35672h0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i10 = orientation;
                if (bitmap2 != null || this.B2 != null) {
                    org.telegram.ui.Components.of0 of0Var = this.C1;
                    if (this.f35761r1) {
                        h81Var = (org.telegram.ui.Components.h81) this.B2;
                    } else {
                        h81Var = null;
                    }
                    of0Var.b(bitmap2, i10, false, false, this.D1, h81Var, this.X4.f39475c);
                }
            }
        }
    }

    public final void B3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3():void");
    }

    public final void C0(final int i10, final boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        af0 af0Var;
        final File file;
        final af0 af0Var2;
        boolean z15;
        boolean z16;
        File file2;
        File pathToAttach;
        File pathToAttach2;
        boolean z17;
        final boolean z18;
        File file3;
        af0 af0Var3;
        boolean z19;
        org.telegram.ui.Components.g6 g6Var;
        int i12 = this.P4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.f35633c5[i10] != null) {
            if (i10 == 0 && i12 == 0 && (g6Var = this.f35692j2) != null) {
                z11 = g6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i11 >= 0 && i11 < this.Y6.size()) {
                    ?? r42 = (MessageObject) this.Y6.get(i11);
                    z12 = T2(r42);
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
                        af0Var3 = new af0(7, this, q1(i11, null));
                    } else {
                        af0Var3 = new af0(8, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        af0 af0Var4 = af0Var3;
                        z13 = z19;
                        af0Var = r42;
                        file = null;
                        file4 = file3;
                        af0Var2 = af0Var4;
                        z14 = true;
                    } else {
                        z14 = false;
                        af0Var = r42;
                        file = null;
                        file4 = file3;
                        af0Var2 = af0Var3;
                        z13 = false;
                    }
                } else {
                    this.W0[i10].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i11 >= 0 && i11 < this.g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.g7.get(i11);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.f35633c5[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.f35633c5[i10]);
                            } else {
                                z17 = false;
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
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(FileLoader.getDirectory(4), this.f35633c5[i10]);
                    } else {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i11 >= 0 && i11 < this.f35625b7.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.f35625b7.get(i11);
                            if (imageLocation != null) {
                                pathToAttach = FileLoader.getInstance(this.T).getPathToAttach(imageLocation.location, r1(imageLocation), false);
                                pathToAttach2 = FileLoader.getInstance(this.T).getPathToAttach(imageLocation.location, r1(imageLocation), true);
                            } else {
                                pathToAttach2 = null;
                                pathToAttach = null;
                            }
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f35623b5 != null) {
                        if (i11 >= 0 && i11 < this.f35653e7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.f35653e7.get(i11);
                            pathToAttach = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, false);
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f35651e5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.f35633c5[i10]);
                        file = new File(FileLoader.getDirectory(4), this.f35633c5[i10]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        ku0 ku0Var = this.f35697j7;
                        if (ku0Var != null) {
                            File b10 = ku0Var.b(i11);
                            if (!this.f35697j7.a(i11) && !this.f35697j7.e(i11)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && SharedConfig.streamMedia && (this.f35697j7.d(i11) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            af0Var2 = null;
                            z12 = S2(i11);
                            file4 = b10;
                            af0Var = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            af0Var = null;
                            file = null;
                            af0Var2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    af0Var2 = null;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    af0Var = af0Var2;
                }
                af0Var2 = null;
                file4 = file2;
                af0Var = af0Var2;
            }
            if ((i10 != 0 || !this.f35711l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = af0Var;
            final boolean z20 = z11;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    un unVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = af0Var2;
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
                    if (!z22 && i13 != 0 && (messageObject = r72) != null && z23 && DownloadController.getInstance(photoViewer.T).canDownloadMedia(messageObject.messageOwner) != 0 && (((unVar = photoViewer.l4) == null || unVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
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
                            String[] strArr = photoViewer2.f35633c5;
                            mu0[] mu0VarArr = photoViewer2.W0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                        mu0VarArr[i14].d(2, false, true);
                                    } else {
                                        mu0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    mu0VarArr[i14].d(0, z29, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i14]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                mu0VarArr[i14].f(fileProgress.floatValue(), false);
                            } else {
                                if (i14 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i14 == 0 && photoViewer2.X2))) {
                                        mu0VarArr[i14].d(3, z29, true);
                                    } else {
                                        mu0VarArr[i14].d(-1, z29, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f35733o0.x()) {
                                    if (!z27) {
                                        if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                            photoViewer2.f35733o0.t(8);
                                        } else {
                                            photoViewer2.f35733o0.S(8);
                                        }
                                    } else {
                                        photoViewer2.f35733o0.t(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f35782t4 || (photoViewer2.g7.isEmpty() && (strArr[0] == null || mu0VarArr[0].h == 0))) {
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
        if (!this.g7.isEmpty() && i11 >= 0 && i11 < this.g7.size()) {
            Object obj = this.g7.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.f35630c2 != 11))) {
                    this.W0[i10].d(3, z10, true);
                    return;
                }
            }
        }
        this.W0[i10].d(-1, z10, true);
    }

    public final int C1() {
        int measuredHeight;
        int j12 = j1();
        iu0 iu0Var = this.f35646e0;
        if (iu0Var != null && (measuredHeight = iu0Var.getMeasuredHeight()) > 0) {
            return Math.min(j12, measuredHeight);
        }
        return j12;
    }

    public final void C2(MessageObject messageObject, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.c6.cloneSpans(charSequence, 3);
        Y2(this.R4, z11);
        if (!this.R4) {
            boolean z17 = true;
            if (this.f35630c2 != 1) {
                this.U1.setVisibility(8);
                this.V1.setVisibility(8);
                if (this.f35683i2) {
                    if (this.Q1.getParent() != this.P0) {
                        FrameLayout frameLayout = this.Z1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.Q1);
                        }
                        this.Q1.setMeasureAllChildren(false);
                        this.P0.addView(this.Q1, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.T1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f35646e0.getContext());
                        this.Z1 = frameLayout2;
                        this.Q1.setContainer(frameLayout2);
                        ot0 ot0Var = new ot0(this, this.f35646e0.getContext(), this.Q1, this.Z1, 0);
                        this.T1 = ot0Var;
                        this.Q1.setScrollView(ot0Var);
                        this.Z1.setClipChildren(false);
                        this.T1.addView(this.Z1, new ViewGroup.LayoutParams(-1, -2));
                        this.f35646e0.addView(this.T1, org.telegram.ui.Components.gb1.i(-1, -1, 80));
                    }
                    if (this.Q1.getParent() != this.Z1) {
                        this.P0.removeView(this.Q1);
                        this.Q1.setMeasureAllChildren(true);
                        this.Z1.addView(this.Q1, -1, -2);
                        this.f35772s3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.R1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.E);
                            this.R1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.y6.a0(620756991, 369098751, 8, 8));
                            org.telegram.ui.Components.gb1.c(this.R1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.E);
                            this.S1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.S1.setTextColor(-1);
                            this.S1.setTypeface(AndroidUtilities.bold());
                            this.R1.addView(this.S1, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                            this.R1.setOnClickListener(new jr0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.R1);
                        this.S1.setText(messageObject.sponsoredButtonText);
                        this.Z1.addView(this.R1, org.telegram.ui.Components.gb1.h(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
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
                eu0 eu0Var = this.Q1;
                if (z11) {
                    currentView = eu0Var.getNextView();
                } else {
                    currentView = eu0Var.getCurrentView();
                }
                if (this.f35761r1) {
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
                    if (this.f35683i2) {
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
                boolean z18 = this.f35683i2;
                if (!z18 && z11 && isEmpty) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f35716m2 = z12;
                if (!z18) {
                    this.T1.f38171l0 = false;
                }
                if (z11) {
                    if (z18) {
                        viewGroup = this.P0;
                    } else {
                        viewGroup = this.T1;
                    }
                    TransitionManager.endTransitions(viewGroup);
                    if (this.f35683i2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.P0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new pt0(this, isEmpty2, isEmpty, 1)).addTransition(new pt0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.T1.f38171l0 = true;
                            duration.addTransition(new org.telegram.ui.Components.ln0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.Q1);
                        }
                        TransitionManager.beginDelayedTransition(this.T1, duration);
                    }
                    z13 = true;
                } else {
                    this.Q1.getCurrentView().setText((CharSequence) null);
                    ot0 ot0Var2 = this.T1;
                    if (ot0Var2 != null) {
                        ot0Var2.scrollTo(0, 0);
                    }
                    z13 = false;
                }
                int i11 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.y6.J(null, true);
                    if (messageObject == null || !this.f35729n5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f51.L())) {
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new di.z8(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.Q1.setTag(cloneSpans);
                    try {
                        eu0 eu0Var2 = this.Q1;
                        if (this.f35744p2 != z10) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        eu0Var2.a(cloneSpans, z11, z16);
                        ot0 ot0Var3 = this.T1;
                        if (ot0Var3 != null) {
                            ot0Var3.H(ot0Var3.getWidth(), ot0Var3.getHeight());
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.J && (!this.f35761r1 || this.P0.getVisibility() == 0 || this.f35697j7 != null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    eu0 eu0Var3 = this.Q1;
                    if (z15) {
                        i11 = 0;
                    }
                    eu0Var3.setVisibility(i11);
                } else if (this.f35683i2) {
                    this.Q1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z11, false);
                    this.Q1.getCurrentView().setTextColor(-1291845633);
                    this.Q1.setTag("empty");
                    this.Q1.setVisibility(0);
                } else {
                    this.Q1.a(null, z11, false);
                    this.Q1.getCurrentView().setTextColor(-1);
                    eu0 eu0Var4 = this.Q1;
                    if (z13 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    eu0Var4.b(4, z14);
                    this.Q1.setTag(null);
                }
                if (this.Q1.getCurrentView() instanceof du0) {
                    ((du0) this.Q1.getCurrentView()).setLoading(z10);
                }
                if (isEmpty || !z10) {
                    z17 = false;
                }
                this.f35744p2 = z17;
                return;
            }
        }
        g1().setText(cloneSpans);
        this.Q1.setVisibility(8);
    }

    public final void C3() {
        long j10;
        int H;
        MessageObject messageObject;
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            int H2 = ou0Var.H();
            this.O0.a(H2);
            if (H2 == 0) {
                r3(false, true);
            }
            if (this.S0 != null) {
                ou0 ou0Var2 = this.d;
                long j11 = 0;
                if (ou0Var2 != null) {
                    j10 = ou0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (messageObject = this.T4) != null) {
                    j10 = messageObject.getDialogId();
                }
                li.w1 w1Var = this.S0;
                ou0 ou0Var3 = this.d;
                if (ou0Var3 == null || !ou0Var3.q() || this.d.w()) {
                    j11 = MessagesController.getInstance(this.T).getSendPaidMessagesStars(j10);
                }
                ou0 ou0Var4 = this.d;
                if (ou0Var4 == null) {
                    H = 1;
                } else {
                    H = ou0Var4.H();
                }
                w1Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void D0(int i10) {
        org.telegram.ui.Components.o81 o81Var;
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null && s81Var.d != null && i10 != s81Var.f32463d0) {
            s81Var.f32463d0 = i10;
            ArrayList arrayList = s81Var.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                o81Var = (org.telegram.ui.Components.o81) s81Var.N.get(i10);
            } else {
                o81Var = null;
            }
            s81Var.R(false, o81Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.s81.J(null, this.T4);
        } else {
            org.telegram.ui.Components.s81 s81Var2 = this.F2;
            if (s81Var2 != null) {
                org.telegram.ui.Components.s81.J(s81Var2.u(i10), this.T4);
            }
        }
        B3();
        this.f35742p0.U(null, null);
        try {
            c5.d.b(0);
            if (rf.b.L().M()) {
                rf.b.L().O(n1());
            }
            org.telegram.ui.Components.s81 s81Var3 = this.F2;
            if (s81Var3 != null) {
                c5.d.x(s81Var3.y());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean D1() {
        if (e1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void D2(int i10) {
        E2(i10, true, false, false);
    }

    public final void D3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.D3():void");
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f11 = 1.0f - f7;
            this.T0.setTranslationY(AndroidUtilities.dp(36.0f) * f11);
            this.T0.setAlpha(f7);
            org.telegram.ui.Components.gg0 gg0Var = this.T0;
            int i13 = 8;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            gg0Var.setVisibility(i11);
            if (this.f35658f2) {
                bi.j5 j5Var = this.P0;
                int i14 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                j5Var.setVisibility(i12);
                this.P0.setAlpha(f11);
                this.P0.setTranslationY(AndroidUtilities.dp(36.0f) * f7);
                li.w1 w1Var = this.S0;
                if (i14 < 0) {
                    i13 = 0;
                }
                w1Var.setVisibility(i13);
                this.S0.setAlpha(f11);
                this.S0.setTranslationY(AndroidUtilities.dp(36.0f) * f7);
            }
        }
    }

    public final void E0(boolean z10, boolean z11, float f7) {
        if (f7 != this.f35779t1) {
            this.f35779t1 = f7;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f35779t1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.T4.getDialogId() + "_" + this.T4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.T4.getDialogId() + "_" + this.T4.getId(), this.f35779t1).commit();
                }
            }
            org.telegram.ui.Components.s81 s81Var = this.F2;
            if (s81Var != null) {
                s81Var.Q(this.f35779t1);
            }
            vt0 vt0Var = this.f35656f0;
            if (vt0Var != null) {
                vt0Var.setPlaybackSpeed(this.f35779t1);
            }
        }
        L2(true, z10);
        if (z11) {
            this.f35742p0.U(null, null);
        }
    }

    public final void E2(int r43, boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.E2(int, boolean, boolean, boolean):void");
    }

    public final void E3() {
        String Z0;
        String Z02;
        int[] iArr = this.f35717m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f35727n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            long max = Math.max(0L, s81Var.n());
            long max2 = Math.max(0L, this.F2.p());
            if (!this.B8 && this.R7.getVisibility() == 0) {
                max2 = (this.S7.getRightProgress() - this.S7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.S7.getLeftProgress() * ((float) max2));
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
            vt0 vt0Var = this.f35656f0;
            if (vt0Var != null && vt0Var.f30582x) {
                long max3 = Math.max(0, vt0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f35656f0.getVideoDuration());
                if (!this.B8 && this.R7.getVisibility() == 0) {
                    max4 = (this.S7.getRightProgress() - this.S7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.S7.getLeftProgress() * ((float) max4));
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
            Z0 = b1(i10 / 60, i10 % 60, iArr[1]);
        } else {
            Z0 = Z0(i10, iArr[1]);
        }
        int i11 = iArr2[0];
        if (i11 >= 60) {
            Z02 = b1(i11 / 60, i11 % 60, iArr2[1]);
        } else {
            Z02 = Z0(i11, iArr2[1]);
        }
        this.f35736o3.l(Z0 + " / " + Z02, false);
        if (!Objects.equals(this.f35693j3, Z02)) {
            this.f35693j3 = Z02;
            this.f35684i3.requestLayout();
        }
    }

    public final void F0(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0 && i10 < this.g7.size() && J1()) {
            if (z10) {
                l0();
            }
            g1().p();
        }
    }

    public final void F1() {
        boolean[] zArr = this.f35807w1;
        zArr[1] = false;
        zArr[0] = false;
        this.f35646e0.invalidate();
    }

    public final void F2() {
        if (this.f35728n4 == 0) {
            G2(this.C4, this.P4, null);
            H2(this.P4, this.f35829y4);
            G2(this.D4, this.P4 + 1, this.F1);
            H2(this.P4 + 1, this.A4);
            G2(this.B4, this.P4 - 1, this.E1);
            H2(this.P4 - 1, this.f35838z4);
        }
    }

    public final void F3() {
        int extractRealEncoderBitrate;
        if (this.Z7 > 0) {
            if (this.Y7 >= this.Z7) {
                this.Y7 = this.Z7 - 1;
            }
            if (this.f35630c2 == 1) {
                float max = Math.max(800.0f / this.f35636c8, 800.0f / this.f35645d8);
                this.f35654e8 = Math.round((this.f35636c8 * max) / 2.0f) * 2;
                this.f35663f8 = Math.round((this.f35645d8 * max) / 2.0f) * 2;
            } else {
                Size q02 = q0();
                this.f35654e8 = q02.getWidth();
                this.f35663f8 = q02.getHeight();
            }
            if (this.f35671g8 != 0) {
                if (this.f35630c2 == 1) {
                    this.f35671g8 = 1560000;
                    extractRealEncoderBitrate = this.f35671g8;
                } else if (this.f35654e8 == this.f35636c8 && this.f35663f8 == this.f35645d8) {
                    this.f35671g8 = this.f35680h8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f35654e8, this.f35663f8, this.f35671g8, false);
                } else {
                    this.f35671g8 = MediaController.makeVideoBitrate(this.f35645d8, this.f35636c8, this.f35680h8, this.f35663f8, this.f35654e8);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f35654e8, this.f35663f8, this.f35671g8, false);
                }
                this.f35767r8 = ((extractRealEncoderBitrate / 8) * this.f35689i8) / 1000.0f;
            }
        }
    }

    public final void G0() {
        nt0 nt0Var = this.L1;
        Activity activity = this.f35825y;
        xq0 xq0Var = new xq0(this, 1);
        if (nt0Var.A1) {
            nt0Var.v0(false);
        } else if (nt0Var.V1) {
            nt0Var.k0(true);
        } else if (nt0Var.I0 && nt0Var.H0 != null) {
            nt0Var.q0(null, true);
        } else if (nt0Var.f48358u0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, nt0Var.F1);
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.Components.voip.j1(xq0Var, 12));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            U2(alertDialog$Builder);
        } else {
            xq0Var.run();
        }
    }

    public final void G1() {
        org.telegram.ui.Components.of0 of0Var = this.C1;
        if (of0Var != null) {
            of0Var.b(null, 0, false, false, null, null, null);
            if (this.f35630c2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.C1.f31285b.f18843a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.C1.setVisibility(0);
            this.C1.setAlpha(1.0f);
            ng.p pVar = this.C1.f31285b;
            pVar.q();
            CropAreaView cropAreaView2 = pVar.f18843a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f35780t2 = true;
        }
    }

    public final void G2(ImageReceiver imageReceiver, int i10, ng.g gVar) {
        MessageObject messageObject;
        int i11;
        TLRPC.PhotoSize photoSize;
        ?? r11;
        int i12;
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
        org.telegram.ui.Components.g6 g6Var;
        boolean z11;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.g6 g6Var2;
        boolean z12;
        ImageLocation imageLocation12;
        BitmapDrawable bitmapDrawable7;
        ImageLocation imageLocation13;
        long j11;
        int i13;
        TLRPC.Document document;
        WebFile webFile;
        TLObject tLObject;
        TLRPC.Document document2;
        ImageLocation imageLocation14;
        MediaController.CropState cropState;
        String str3;
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
        ArrayList arrayList = this.f35653e7;
        TLRPC.PhotoSize photoSize4 = null;
        BitmapDrawable bitmapDrawable11 = null;
        if (!arrayList.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                arrayList.get(i10);
                AndroidUtilities.getPhotoSize();
                ImageReceiver.BitmapHolder bitmapHolder = this.f35695j5;
                if (bitmapHolder == null || imageReceiver != this.C4) {
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
        ArrayList arrayList2 = this.g7;
        long j16 = 0;
        if (!arrayList2.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f35695j5;
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
                            if (this.f35719m5) {
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
                        document = a1.g.k(photoSize5, photoSize5, "_");
                    }
                    cropState = cropState3;
                    str3 = str5;
                    document2 = null;
                    imageLocation14 = null;
                    i13 = 0;
                    z14 = z15;
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
                                    document = a1.g.k(photoSize5, photoSize5, "_");
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
                                            str6 = a1.g.k(photoSize5, photoSize5, "_");
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
                            i13 = 1;
                            imageLocation14 = imageLocation15;
                            cropState = null;
                            photoSize4 = photoSize3;
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
                                i13 = 1;
                                imageLocation14 = imageLocation15;
                                cropState = null;
                                photoSize4 = photoSize3;
                                j11 = j12;
                                str3 = null;
                            }
                            document = document4;
                            document5 = document4;
                            document2 = document5;
                            i13 = 1;
                            imageLocation14 = imageLocation15;
                            cropState = null;
                            photoSize4 = photoSize3;
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
                            i13 = 1;
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
                        i13 = 1;
                        cropState = searchImage.cropState;
                        document = "d";
                        photoSize4 = photoSize2;
                        imageLocation14 = null;
                        tLObject = tLObject2;
                        j11 = j16;
                        webFile = null;
                    } else {
                        j11 = 0;
                        i13 = 0;
                        document = null;
                        webFile = null;
                        tLObject = null;
                        document2 = null;
                        imageLocation14 = null;
                        photoSize4 = null;
                        cropState = null;
                        str3 = null;
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
                        String k10 = a1.g.k(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, k10, bitmapDrawable10, j11, null, obj, i13);
                    } else {
                        long j19 = j11;
                        int i14 = i13;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation17 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                        } else {
                            imageLocation17 = null;
                        }
                        Locale locale5 = Locale.US;
                        String k11 = a1.g.k(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            j14 = j19;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j14 = j19;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, k11, bitmapDrawable9, j14, null, obj, i14);
                    }
                } else {
                    WebFile webFile2 = webFile;
                    long j20 = j11;
                    ImageLocation imageLocation20 = imageLocation14;
                    int i15 = i13;
                    if (photoSize4 != null) {
                        ImageLocation forObject = ImageLocation.getForObject(photoSize4, tLObject);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable8 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable8 = null;
                        }
                        imageReceiver.setImage(forObject, document, bitmapDrawable8, j20, (String) null, obj, i15);
                    } else {
                        String str8 = document;
                        if (webFile2 != null) {
                            if (imageLocation20 != null) {
                                imageReceiver.setImage(ImageLocation.getForWebFile(webFile2), str8, imageLocation20, (String) null, (Drawable) null, obj, i15);
                            } else {
                                ImageLocation forWebFile = ImageLocation.getForWebFile(webFile2);
                                if (bitmapHolder2 != null) {
                                    drawable4 = new BitmapDrawable(bitmapHolder2.bitmap);
                                } else if (z14 && (activity2 = this.f35825y) != null) {
                                    drawable4 = activity2.getResources().getDrawable(R.drawable.nophotos);
                                } else {
                                    drawable3 = null;
                                    imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i15);
                                }
                                drawable3 = drawable4;
                                imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i15);
                            }
                        } else {
                            if (bitmapHolder2 != null) {
                                drawable2 = new BitmapDrawable(bitmapHolder2.bitmap);
                            } else if (z14 && (activity = this.f35825y) != null) {
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
                        gVar.f18803a = false;
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
        ku0 ku0Var = this.f35697j7;
        if (ku0Var != null) {
            int[] iArr = new int[1];
            TLObject d = ku0Var.d(i10);
            TLRPC.PhotoSize f7 = this.f35697j7.f(d, iArr);
            if (f7 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f35695j5 == null || imageReceiver != this.C4) ? null : null;
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
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f35697j7.g(), 1);
                    if (z12) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f35697j7.a(i10) && !this.f35697j7.e(i10)) {
                    if (imageReceiver == this.C4 && (g6Var2 = this.f35692j2) != null) {
                        imageReceiver.setImageBitmap(g6Var2);
                        this.f35692j2.f(this.f35646e0);
                        return;
                    }
                    return;
                } else if (!(f7.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f35695j5 == null || imageReceiver != this.C4) ? null : null;
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
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f35697j7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f35825y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f35825y.getResources().getDrawable(R.drawable.transparent));
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
                imageReceiver.setImageBitmap(this.f35825y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f35695j5 == null || imageReceiver != this.C4) ? null : null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    if (messageObject.isLivePhoto()) {
                        imageReceiver.setNeedsQualityThumb(true);
                        ImageLocation t12 = t1(i10, null);
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
                        imageReceiver.setImage(t12, null, imageLocation10, "b", bitmapDrawable5, 0L, null, messageObject, 1);
                    } else {
                        if (closestPhotoSizeWithSize3.f22052w < 100 && closestPhotoSizeWithSize3.h < 100) {
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
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f35695j5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f35825y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.C4 && (g6Var = this.f35692j2) != null) {
                g6Var.f(this.f35646e0);
                imageReceiver.setImageBitmap(this.f35692j2);
                return;
            } else if (this.C5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f35695j5 == null || imageReceiver != this.C4) ? null : null;
                    int i16 = (int) (2048.0f / AndroidUtilities.density);
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
                    imageReceiver.setImage(imageLocation8, a1.g.k(i16, i16, "_"), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z10) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f35825y;
                iu0 iu0Var = this.f35646e0;
                ?? drawable5 = new Drawable();
                drawable5.f31266a = 0L;
                drawable5.f31267b = 0.0f;
                drawable5.f31268c = 0.0f;
                drawable5.d = 0L;
                drawable5.e = 0.0f;
                drawable5.f31269f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.od0.J;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.od0.K;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.od0.L.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.od0.M.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.od0.N.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.od0.O.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.od0.I.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f31270n = iu0Var;
                drawable5.f31271r = messageObject;
                drawable5.f31272s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
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
                    drawable5.f31275y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f31275y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f31274x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.E, messageObject.getDocument().mime_type, true)).mutate();
                    drawable5.F = AndroidUtilities.formatFileSize(document9.size);
                    if (((int) Math.ceil(textPaint2.measureText(drawable5.E))) > AndroidUtilities.dp(320.0f)) {
                        drawable5.E = TextUtils.ellipsize(drawable5.E, textPaint2, AndroidUtilities.dp(320.0f), TextUtils.TruncateAt.END).toString();
                    }
                }
                drawable5.a();
                imageReceiver.setImageBitmap((Drawable) drawable5);
                return;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 1;
        }
        long[] jArr = new long[i11];
        ImageLocation t13 = t1(i10, jArr);
        TLObject q12 = q1(i10, jArr);
        imageReceiver.setNeedsQualityThumb(i11);
        if (t13 != null) {
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f35695j5 == null || imageReceiver != this.C4) ? null : null;
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
            if (photoSize != null && photoSize == q12) {
                photoSize = null;
            }
            if (photoSize == null && (photo = t13.photo) != null && photo.sizes != null) {
                int i17 = 0;
                while (true) {
                    if (i17 >= t13.photo.sizes.size()) {
                        break;
                    } else if (t13.photo.sizes.get(i17) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = t13.photo.sizes.get(i17);
                        r11 = t13.photo;
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if ((messageObject == null || !messageObject.isWebpage()) && this.f35839z5 == 0 && !this.B5) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (messageObject != null) {
                if (this.C5 == 5) {
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
                int i18 = (this.f35839z5 > 0L ? 1 : (this.f35839z5 == 0L ? 0 : -1));
                if (i18 != 0) {
                    if (i18 > 0) {
                        user = MessagesController.getInstance(this.T).getUser(Long.valueOf(this.f35839z5));
                    } else {
                        user = MessagesController.getInstance(this.T).getChat(Long.valueOf(-this.f35839z5));
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
                imageReceiver.setImage(t13, str2, imageLocation5, null, imageLocation6, "b", bitmapDrawable2, jArr[0], null, messageObject, i12);
                imageReceiver.setAllowStartAnimation(true);
                return;
            }
            if (this.f35839z5 != j10) {
                if (t13.imageType != 2) {
                    str9 = null;
                }
                imageLocation2 = t13;
                str = str9;
            } else {
                imageLocation2 = t13;
                str = null;
            }
            boolean z17 = true;
            if ((DownloadController.getInstance(this.T).getAutodownloadMask() & 1) == 0 && this.P4 != i10 && !FileLoader.getInstance(this.T).getPathToAttach(q12).exists()) {
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
            imageReceiver.setImage(imageLocation4, str, imageLocation3, "b", bitmapDrawable, jArr[0], null, messageObject, i12);
            if (z17) {
                num = null;
            }
            imageReceiver.setMark(num);
        } else if (jArr[0] == 0) {
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            imageReceiver.setImageBitmap(this.f35825y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean G3() {
        org.telegram.ui.Components.e50 e50Var = this.f35735o2;
        if (e50Var != null && e50Var.d && !e50Var.e) {
            return true;
        }
        return false;
    }

    public final void H0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H0(boolean, boolean):void");
    }

    public final void H1() {
        sg.p2 p2Var = this.f35747p5;
        if (p2Var == null || !p2Var.V) {
            se.b bVar = this.Z;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((eh.e) it.next()).f9974g0 = true;
                }
            }
            se.b bVar2 = this.f35609a0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            os0 os0Var = this.U1;
            if (os0Var != null) {
                os0Var.m();
            }
            ps0 ps0Var = this.V1;
            if (ps0Var != null) {
                ps0Var.m();
            }
            au0 au0Var = this.f35783t5;
            if (au0Var != null) {
                au0Var.invalidate();
            }
            au0 au0Var2 = this.f35801v5;
            if (au0Var2 != null) {
                au0Var2.invalidate();
            }
            au0 au0Var3 = this.f35811w5;
            if (au0Var3 != null) {
                au0Var3.invalidate();
            }
            au0 au0Var4 = this.f35821x5;
            if (au0Var4 != null) {
                au0Var4.invalidate();
            }
            au0 au0Var5 = this.f35830y5;
            if (au0Var5 != null) {
                au0Var5.invalidate();
            }
            ls0 ls0Var = this.S7;
            if (ls0Var != null && ls0Var.f27449e0) {
                ls0Var.invalidate();
            }
            iu0 iu0Var = this.f35646e0;
            if (iu0Var != null) {
                iu0Var.invalidate();
            }
        }
    }

    public final void H2(int i10, org.telegram.ui.Components.yd0 yd0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (yd0Var != null) {
            yd0Var.a();
            yd0Var.setVisibility(8);
            ArrayList arrayList2 = this.g7;
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
                yd0Var.setVisibility(0);
                if (this.f35630c2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yd0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    yd0Var.f35031a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(yd0Var.f35031a);
                    yd0Var.d = bitmapDrawable;
                    yd0Var.setBackground(bitmapDrawable);
                    return;
                }
                yd0Var.f35031a = null;
                yd0Var.d = null;
                yd0Var.setBackground(null);
            }
        }
    }

    public final void I0() {
        if (this.C1 != null) {
            return;
        }
        org.telegram.ui.Components.of0 of0Var = new org.telegram.ui.Components.of0(this.E, this.f35798v2);
        this.C1 = of0Var;
        of0Var.setVisibility(8);
        this.C1.a();
        this.f35646e0.addView(this.C1, this.f35646e0.indexOfChild(this.R7) - 1, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.C1.setDelegate(new gs0(this));
    }

    public final boolean I1() {
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

    public final void I2(int r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.I2(int, boolean, boolean, boolean):void");
    }

    public final boolean J1() {
        org.telegram.ui.Components.jd g12 = g1();
        if (g12 != null) {
            if (g12.L.c() || g12.f11199f.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J2(View view, boolean z10, float f7, boolean z11) {
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
            view.animate().alpha(f11).setDuration(100L).setUpdateListener(new wq0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new d80(this, z10, view, 6)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        view.setAlpha(f11);
        u3();
    }

    public final void K0() {
        MediaController.CropState cropState;
        int width;
        int width2;
        if (this.N1 != null) {
            return;
        }
        if (this.f35630c2 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.D1.f18808i;
        } else {
            cropState = this.X4.f39475c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        sg.p2 p2Var = this.f35747p5;
        if (p2Var != null && p2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f35747p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f35747p5.J);
            float width3 = createBitmap.getWidth();
            if ((this.f35747p5.J / 90) % 2 != 0) {
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
        mt0 mt0Var = new mt0(this, this.f35825y, this.T, createBitmap2, createBitmap, this.C4.getOrientation(), cropState2);
        this.N1 = mt0Var;
        mt0Var.f48559s.setOnClickListener(new yq0(this, 5));
        this.N1.v.setOnClickListener(new yq0(this, 6));
        this.N1.setEraser(this.M1);
        int indexOfChild = this.f35646e0.indexOfChild(this.f35792u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f35646e0.getChildCount();
        }
        this.f35646e0.addView(this.N1, indexOfChild, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.O1 = false;
    }

    public final boolean K1() {
        int i10;
        if (this.f35679h7 != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                ImageLocation imageLocation = (ImageLocation) this.f35615a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f35679h7.location;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f35679h7.location;
                    if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K2(View view, boolean z10, boolean z11) {
        J2(view, z10, 1.0f, z11);
    }

    public final void L0() {
        int bitmapWidth;
        int bitmapHeight;
        MediaController.CropState cropState;
        Bitmap bitmap;
        if (this.L1 == null) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.ui.Components.h81 h81Var = (org.telegram.ui.Components.h81) textureView;
                bitmapWidth = h81Var.getVideoWidth();
                bitmapHeight = h81Var.getVideoHeight();
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
            Bitmap bitmap2 = this.f35829y4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i10 = this.f35630c2;
            fu0 fu0Var = this.X4;
            boolean z10 = true;
            if (i10 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.D1.f18808i;
            } else {
                cropState = fu0Var.f39475c;
            }
            MediaController.CropState cropState2 = cropState;
            fi.z3 z3Var = new fi.z3(this.f35664g0, false, new dr0(this, 2));
            z3Var.f12060f = true;
            z3Var.f12061g = true;
            this.K1 = z3Var;
            if (this.f35791u4 == 3) {
                z10 = false;
            }
            z3Var.b(z10);
            Activity activity = this.f35825y;
            int i11 = this.T;
            if (this.f35761r1) {
                bitmap = null;
            } else {
                bitmap = this.C4.getBitmap();
            }
            nt0 nt0Var = new nt0(this, activity, activity, i11, bitmap3, bitmap, this.C4.getOrientation(), fu0Var.e, cropState2, new xq0(this, 14), this.f35798v2);
            this.L1 = nt0Var;
            eh.d c10 = this.Y.c(nt0Var.R0, null, false);
            c10.v(gh.c.i(this.f35798v2));
            nt0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f35646e0.addView(this.L1.getView(), org.telegram.ui.Components.gb1.g(-1.0f, -1));
            this.L1.setOnDoneButtonClickedListener(new xq0(this, 15));
            this.L1.getCancelView().setOnClickListener(new yq0(this, 8));
            this.L1.s0(AndroidUtilities.dp(126.0f));
            this.L1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final boolean L1(ku0 ku0Var) {
        if (ku0Var != null) {
            Object g7 = ku0Var.g();
            if (g7 instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) g7;
                if (messageObject.messageOwner != null) {
                    if (MessagesController.getInstance(this.T).isPeerNoForwards(messageObject.getDialogId()) || messageObject.messageOwner.noforwards || messageObject.hasRevealedExtendedMedia()) {
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

    public final void L2(boolean z10, boolean z11) {
        if (this.f35760r0.getVisibility() != 0) {
            this.f35806w0.f42901f.t("", z10, true);
        } else if (Math.abs(this.f35779t1 - 1.0f) < 0.001f) {
            this.f35806w0.f42901f.t("", z10, true);
        } else {
            org.telegram.ui.Components.r6 r6Var = this.f35806w0.f42901f;
            r6Var.t(org.telegram.ui.Components.dd.a(this.f35779t1) + "x", z10, true);
        }
        this.f35760r0.e(this.f35779t1, z10);
        f81 f81Var = this.I0;
        float f7 = this.f35779t1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = f81Var.f39303a;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z11 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].d(-9718023, -9718023);
            } else {
                g1VarArr[i10].d(-328966, -328966);
            }
        }
    }

    public final void M0() {
        xu0 xu0Var = new xu0(this.f35646e0.getContext(), this);
        this.f35684i3 = xu0Var;
        this.f35646e0.addView(xu0Var, org.telegram.ui.Components.gb1.i(-1, 48, 83));
        gs0 gs0Var = new gs0(this);
        ys0 ys0Var = new ys0(this, gs0Var);
        z10 z10Var = new z10(this, this.f35646e0.getContext(), 5);
        this.f35763r3 = z10Var;
        z10Var.setAccessibilityDelegate(ys0Var);
        this.f35763r3.setImportantForAccessibility(1);
        this.f35684i3.addView(this.f35763r3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.u81 u81Var = new org.telegram.ui.Components.u81(this.f35763r3);
        this.f35754q3 = u81Var;
        u81Var.f33314z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.u81 u81Var2 = this.f35754q3;
        u81Var2.f33300k = 872415231;
        u81Var2.f33301l = 872415231;
        u81Var2.f33302m = -1;
        u81Var2.f33303n = -1;
        u81Var2.A = 1509949439;
        u81Var2.f33299j = gs0Var;
        zs0 zs0Var = new zs0(this, this.f35646e0.getContext(), new fr0(this));
        this.f35772s3 = zs0Var;
        zs0Var.setAlpha(0.0f);
        this.f35646e0.addView(this.f35772s3, org.telegram.ui.Components.gb1.h(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(this.f35646e0.getContext());
        this.f35736o3 = b6Var;
        b6Var.setTextColor(-1);
        this.f35736o3.setGravity(53);
        this.f35736o3.setTextSize(14);
        this.f35736o3.setImportantForAccessibility(2);
        this.f35684i3.addView(this.f35736o3, org.telegram.ui.Components.gb1.h(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f35646e0.getContext());
        this.f35745p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f35745p3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f35745p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f35745p3.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        this.f35745p3.setVisibility(4);
        this.f35684i3.addView(this.f35745p3, org.telegram.ui.Components.gb1.i(48, 48, 53));
        this.f35745p3.setOnClickListener(new jr0(this, 6));
    }

    public final void M2(Activity activity, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        ag.b1 b1Var;
        Activity parentActivity;
        boolean z10;
        int i10;
        boolean z11;
        float f7;
        float f10;
        ag.b1 b1Var2 = this.f35721m7;
        if (b1Var2 != null) {
            b1Var2.destroy();
            this.f35721m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            b1Var = new ag.b1(launchActivity, true);
        } else {
            b1Var = null;
        }
        this.f35721m7 = b1Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = r2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.y6.J(parentActivity, false);
        this.f35798v2 = u6Var;
        this.f35718m4 = r2Var;
        int i11 = UserConfig.selectedAccount;
        this.T = i11;
        this.C4.setCurrentAccount(i11);
        this.B4.setCurrentAccount(this.T);
        this.D4.setCurrentAccount(this.T);
        os0 os0Var = this.U1;
        if (os0Var != null) {
            os0Var.setAccount(this.T);
            this.U1.f11199f.k(false);
        }
        ps0 ps0Var = this.V1;
        if (ps0Var != null) {
            ps0Var.setAccount(this.T);
            this.V1.f11199f.k(false);
        }
        sg.p2 p2Var = this.f35747p5;
        if (p2Var != null) {
            p2Var.setCurrentAccount(this.T);
        }
        if (this.f35825y != parentActivity && parentActivity != null) {
            this.f35768s = parentActivity instanceof BubbleActivity;
            this.f35825y = parentActivity;
            this.E = new ContextThemeWrapper(this.f35825y, R.style.Theme_TMessages);
            this.f35827y1 = ViewConfiguration.get(this.f35825y).getScaledTouchSlop();
            if (U8 == null) {
                U8 = new Drawable[]{f0.c.c(this.f35825y, R.drawable.circle_big), f0.c.c(this.f35825y, R.drawable.cancel_big), f0.c.c(this.f35825y, R.drawable.load_big)};
            }
            this.V6 = new Scroller(parentActivity);
            pu0 pu0Var = new pu0(this, parentActivity);
            this.f35664g0 = pu0Var;
            pu0Var.setBackground(this.L0);
            this.f35664g0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f35672h0 = clippingImageView;
            clippingImageView.N = this.f35703k4;
            clippingImageView.K = false;
            clippingImageView.M = false;
            this.f35664g0.addView(clippingImageView, org.telegram.ui.Components.gb1.g(40.0f, 40));
            iu0 iu0Var = new iu0(this, parentActivity, parentActivity);
            this.f35646e0 = iu0Var;
            iu0Var.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f35622b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f35646e0);
            }
            this.f35646e0.setClipChildren(true);
            this.f35646e0.setClipToPadding(true);
            this.f35664g0.setClipChildren(false);
            this.f35664g0.setClipToPadding(false);
            org.telegram.ui.Components.la laVar = new org.telegram.ui.Components.la(this.f35646e0);
            this.f35618b0 = laVar;
            laVar.f30137a = 1;
            this.X = new m4.w1(this);
            this.f35609a0 = new se.b();
            this.Z = new se.b();
            ch.b bVar = new ch.b(this.X);
            this.Y = bVar;
            bVar.g(new jh.k(this.f35646e0), this.f35646e0);
            this.Y.f(this.f35609a0);
            this.f35628c0 = new org.telegram.ui.Components.pa(this.f35618b0, this.f35646e0);
            this.f35664g0.addView(this.f35646e0, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            r0.i0.m(this.f35646e0, new fr0(this));
            this.f35646e0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f35637d0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.f35637d0.flags = -2147286784;
            org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(this.f35825y);
            this.f35829y4 = yd0Var;
            this.f35646e0.addView(yd0Var, org.telegram.ui.Components.gb1.g(-2.0f, -2));
            org.telegram.ui.Components.yd0 yd0Var2 = new org.telegram.ui.Components.yd0(this.f35825y);
            this.f35838z4 = yd0Var2;
            this.f35646e0.addView(yd0Var2, org.telegram.ui.Components.gb1.g(-2.0f, -2));
            org.telegram.ui.Components.yd0 yd0Var3 = new org.telegram.ui.Components.yd0(this.f35825y);
            this.A4 = yd0Var3;
            this.f35646e0.addView(yd0Var3, org.telegram.ui.Components.gb1.g(-2.0f, -2));
            org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, parentActivity, 4);
            this.F = b8Var;
            b8Var.setOverlayTitleAnimation(true);
            this.F.setTitleColor(-1);
            this.F.setSubtitleColor(-1);
            this.F.setBackgroundColor(2130706432);
            this.F.setOccupyStatusBar(!this.f35768s);
            this.F.x(1090519039, false);
            this.F.y(-1, false);
            this.F.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.F.getBackButton();
            this.G = backButton;
            this.H = backButton.getBackground();
            this.I = null;
            nu0 nu0Var = new nu0(parentActivity);
            this.M = nu0Var;
            this.F.addView(nu0Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
            this.f35646e0.addView(this.F, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            lu0 lu0Var = new lu0(parentActivity);
            this.N = lu0Var;
            this.f35646e0.addView(lu0Var, org.telegram.ui.Components.gb1.i(-1, -2, 55));
            this.F.setActionBarMenuOnItemClick(new fs0(this, u6Var));
            org.telegram.ui.ActionBar.z l4 = this.F.l();
            this.A0 = l4;
            l4.setOnLayoutListener(new xq0(this, 18));
            org.telegram.ui.ActionBar.w0 a2 = this.A0.a(26, R.drawable.menu_delete_old);
            this.E0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            org.telegram.ui.Components.gb1.b(this.E0);
            K2(this.E0, false, false);
            org.telegram.ui.ActionBar.w0 a10 = this.A0.a(11, R.drawable.msg_mask);
            this.D0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.w0 a11 = this.A0.a(18, R.drawable.msg_header_draw);
            this.C0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.w0 a12 = this.A0.a(4, R.drawable.msg_header_share);
            this.B0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.z zVar = this.A0;
            qr qrVar = new qr(this.E, R.drawable.video_settings, new di.b());
            this.f35806w0 = qrVar;
            org.telegram.ui.ActionBar.w0 d = zVar.d(1, qrVar);
            this.f35742p0 = d;
            this.f35806w0.setCallback(d.getIconView());
            this.f35742p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35742p0.getPopupLayout().f22360c = true;
            this.f35742p0.getPopupLayout().setFitItems(true);
            this.f35742p0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.E, u6Var);
            this.f35760r0 = c1Var;
            c1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f35760r0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f35760r0.setDrawShadow(false);
            this.f35760r0.setBackgroundColor(-14540254);
            this.f35760r0.setTextColor(-1);
            this.f35760r0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f35760r0.setOnValueChange(new er0(this, 1));
            this.f35742p0.getPopupLayout().a(this.f35760r0, org.telegram.ui.Components.gb1.r(-1, 44));
            org.telegram.ui.ActionBar.l1 a13 = this.f35742p0.a(-1);
            this.f35834z0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f35742p0.getPopupLayout();
            f81 f81Var = new f81(this.E, new fr0(this));
            this.I0 = f81Var;
            popupLayout.addView(f81Var);
            LinearLayout linearLayout = new LinearLayout(this.E);
            this.f35816x0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f35742p0.getPopupLayout().addView(this.f35816x0);
            org.telegram.ui.ActionBar.g1 e = this.f35742p0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f35769s0 = e;
            e.setSelectorColor(268435455);
            org.telegram.ui.Components.w7 w7Var = new org.telegram.ui.Components.w7(this, this.E, 1);
            this.G0 = w7Var;
            try {
                w7Var.setRouteSelector(e6.a.c(this.E).a());
                z10 = true;
            } catch (Exception e10) {
                FileLog.e(e10);
                z10 = false;
            }
            this.G0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.g1 e11 = this.f35742p0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.F0 = e11;
                e11.f(false);
                this.F0.setSelectorColor(268435455);
                this.F0.addView(this.G0, 0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            }
            this.f35742p0.H(-115203550);
            this.f35742p0.setOnMenuDismiss(new dr0(this, 8));
            org.telegram.ui.ActionBar.w0 a14 = this.A0.a(0, R.drawable.media_more);
            this.f35733o0 = a14;
            a14.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f35733o0.setOnClickListener(new jr0(this, 3));
            this.f35733o0.setOnMenuDismiss(new dr0(this, 9));
            this.f35733o0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35733o0.getPopupLayout().f22360c = true;
            this.f35733o0.getPopupLayout().setFitItems(true);
            this.J0 = new or(this.E, this.f35733o0.getPopupLayout().getSwipeBack(), new fr0(this));
            org.telegram.ui.ActionBar.g1 i12 = this.f35733o0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.J0.f42272a);
            i12.d(-328966, -328966);
            this.f35778t0 = i12;
            i12.setOnClickListener(new jr0(this, 4));
            org.telegram.ui.ActionBar.l1 a15 = this.f35733o0.a(-1);
            this.f35787u0 = a15;
            a15.setColor(-15198184);
            this.f35733o0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).d(-328966, -328966);
            org.telegram.ui.ActionBar.g1 e12 = this.f35733o0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e12.d(-328966, -328966);
            this.f35796v0 = e12;
            org.telegram.ui.ActionBar.g1 e13 = this.f35733o0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.f35751q0 = e13;
            e13.d(-328966, -328966);
            this.f35733o0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).d(-328966, -328966);
            this.f35733o0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).d(-328966, -328966);
            this.f35733o0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).d(-328966, -328966);
            this.f35733o0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).d(-328966, -328966);
            this.f35733o0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).d(-328966, -328966);
            this.f35733o0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).d(-328966, -328966);
            this.f35733o0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).d(-328966, -328966);
            this.f35733o0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).d(-328966, -328966);
            this.f35733o0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).d(-328966, -328966);
            this.f35733o0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).d(-328966, -328966);
            this.f35733o0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).d(-328966, -328966);
            this.f35733o0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).d(-328966, -328966);
            this.f35733o0.H(-115203550);
            this.f35733o0.t(19);
            this.f35733o0.t(20);
            L2(false, true);
            this.f35733o0.setPopupItemsSelectorColor(268435455);
            this.f35733o0.setSubMenuDelegate(new gs0(this));
            di.i4 i4Var = new di.i4(this.E, 24);
            this.f35681i0 = i4Var;
            i4Var.setBackgroundColor(2130706432);
            this.f35646e0.addView(this.f35681i0, org.telegram.ui.Components.gb1.i(-1, 48, 83));
            View view = new View(this.E);
            this.f35690j0 = view;
            if (this.f35630c2 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view.setBackgroundColor(i10);
            this.f35664g0.addView(this.f35690j0, org.telegram.ui.Components.gb1.e(-1.0f, this.f35699k0 / AndroidUtilities.density, 87));
            this.f35797v1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f35797v1[0].setShape(0);
            this.f35797v1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f35797v1[1].setShape(0);
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(this.E, AndroidUtilities.dp(10.0f));
            this.l1 = g40Var;
            this.f35646e0.addView(g40Var, org.telegram.ui.Components.gb1.i(-1, 68, 83));
            this.l1.setDelegate(new is0(this));
            for (int i13 = 0; i13 < 3; i13++) {
                this.y3[i13] = new ImageView(this.f35825y);
                this.y3[i13].setImageResource(R.drawable.msg_maxvideo);
                this.y3[i13].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.y3[i13].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i13].setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
                this.y3[i13].setVisibility(4);
                this.y3[i13].setAlpha(1.0f);
                this.f35646e0.addView(this.y3[i13], org.telegram.ui.Components.gb1.g(48.0f, 48));
                this.y3[i13].setOnClickListener(new jr0(this, 5));
            }
            this.Q = new js0(new di.b());
            eu0 eu0Var = new eu0(this.f35646e0.getContext());
            this.Q1 = eu0Var;
            eu0Var.setFactory(new bg0(this, 2));
            this.Q1.setVisibility(4);
            A2(true);
            for (int i14 = 0; i14 < 3; i14++) {
                this.W0[i14] = new ks0(this, this.f35646e0);
                this.W0[i14].d(0, false, true);
            }
            ld ldVar = new ld(this, this.E, u6Var);
            this.X0 = ldVar;
            ldVar.setUseSelfAlpha(true);
            this.X0.setProgressColor(-1);
            this.X0.setSize(AndroidUtilities.dp(54.0f));
            this.X0.setBackgroundResource(R.drawable.circle_big);
            this.X0.setVisibility(4);
            this.X0.setAlpha(0.0f);
            this.f35646e0.addView(this.X0, org.telegram.ui.Components.gb1.i(64, 64, 17));
            M0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f35825y, u6Var);
            this.Q7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.Q7.setBackgroundResource(R.drawable.circle_big);
            this.Q7.setVisibility(4);
            this.f35646e0.addView(this.Q7, org.telegram.ui.Components.gb1.i(54, 54, 17));
            org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(this.f35825y);
            this.P7 = og0Var;
            og0Var.setBackgroundColor(2130706432);
            this.P7.a();
            this.P7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.P7.f31295b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.P7.f31295b;
            int i15 = org.telegram.ui.ActionBar.y6.zf;
            org.telegram.ui.ActionBar.f7.V(textView, i15, u6Var);
            this.f35646e0.addView(this.P7, org.telegram.ui.Components.gb1.i(-1, 48, 83));
            this.P7.f31294a.setOnClickListener(new yq0(this, 2));
            this.P7.f31295b.setOnClickListener(new yq0(this, 3));
            org.telegram.ui.Components.j81 j81Var = new org.telegram.ui.Components.j81(false);
            this.f35835z1 = j81Var;
            j81Var.c(new gs0(this));
            iu0 iu0Var2 = this.f35646e0;
            Objects.requireNonNull(iu0Var2);
            this.A1 = new org.telegram.ui.Components.qp0(new lj0(iu0Var2, 16), false);
            su0 su0Var = new su0(this.f35825y, this);
            this.O7 = su0Var;
            su0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.O7.setVisibility(4);
            this.O7.setBackgroundColor(2130706432);
            this.f35646e0.addView(this.O7, org.telegram.ui.Components.gb1.h(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            bi.j5 j5Var = new bi.j5(this, this.E);
            this.P0 = j5Var;
            this.f35646e0.addView(j5Var, org.telegram.ui.Components.gb1.i(-1, -2, 83));
            TextView textView2 = new TextView(this.f35646e0.getContext());
            this.f35708l0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f35708l0.setTypeface(AndroidUtilities.bold());
            this.f35708l0.setSingleLine(true);
            this.f35708l0.setMaxLines(1);
            TextView textView3 = this.f35708l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f35708l0.setTextColor(-1);
            this.f35708l0.setGravity(3);
            this.P0.addView(this.f35708l0, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f35646e0.getContext());
            this.m0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            this.m0.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.P0.addView(this.m0, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView5 = new TextView(this.f35646e0.getContext());
            this.f35724n0 = textView5;
            int i16 = org.telegram.ui.ActionBar.y6.Oh;
            org.telegram.ui.ActionBar.f7.R(textView5, org.telegram.ui.ActionBar.o6.e(new float[]{6.0f}, A1(i16)), org.telegram.ui.ActionBar.f7.N(i16), org.telegram.ui.ActionBar.f7.f(i16), u6Var);
            TextView textView6 = this.f35724n0;
            int i17 = org.telegram.ui.ActionBar.y6.Sh;
            org.telegram.ui.ActionBar.f7.V(textView6, i17, u6Var);
            this.f35724n0.setEllipsize(truncateAt);
            this.f35724n0.setGravity(17);
            this.f35724n0.setLines(1);
            this.f35724n0.setSingleLine(true);
            this.f35724n0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f35724n0.setTextSize(1, 15.0f);
            this.f35724n0.setTypeface(AndroidUtilities.bold());
            this.f35724n0.setOnClickListener(new yq0(this, 4));
            this.f35724n0.setVisibility(8);
            this.P0.addView(this.f35724n0, org.telegram.ui.Components.gb1.h(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            ls0 ls0Var = new ls0(this.f35825y, this);
            this.S7 = ls0Var;
            ls0Var.setDelegate(new com.google.android.gms.common.api.internal.u(this));
            FrameLayout frameLayout = new FrameLayout(this.f35825y);
            this.R7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.R7.addView(this.S7, org.telegram.ui.Components.gb1.i(-1, 54, 83));
            e3(false, false);
            this.f35646e0.addView(this.R7, org.telegram.ui.Components.gb1.h(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.w0 w0Var = this.E0;
            if (w0Var != null) {
                eh.d a16 = this.Y.a(w0Var);
                a16.v(gh.c.i(u6Var));
                a16.x(AndroidUtilities.dp(20.0f));
                a16.w(AndroidUtilities.dp(7.0f));
                w0Var.setBackground(ih.d.d(a16, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            ms0 ms0Var = new ms0(this.f35825y, LocaleController.getString(R.string.EditorSetCover));
            this.f35665g1 = ms0Var;
            eh.d a17 = this.Y.a(ms0Var);
            a17.v(gh.c.i(u6Var));
            ms0Var.setBlurredBackgroundDrawable(a17);
            org.telegram.ui.Components.gb1.b(this.f35665g1);
            this.f35665g1.setOnClickListener(new yq0(this, 7));
            this.f35646e0.addView(this.f35665g1, org.telegram.ui.Components.gb1.h(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(this.f35825y, u6Var, this.f35618b0);
            this.q5 = fg0Var;
            org.telegram.ui.Components.zt ztVar = fg0Var.f28185c;
            eh.d a18 = this.Y.a(ztVar);
            a18.v(gh.c.i(u6Var));
            ztVar.setBlurredBackgroundDrawable(a18);
            org.telegram.ui.Components.gb1.b(this.q5.f28185c);
            this.q5.setVisibility(8);
            this.q5.setAlpha(0.0f);
            this.q5.setOnClose(new xq0(this, 12));
            this.f35646e0.addView(this.q5, org.telegram.ui.Components.gb1.i(-1, -1, 119));
            this.q5.f28184b.setOnClickListener(new yq0(this, 9));
            this.q5.setOnGalleryImage(new dr0(this, 3));
            org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, this.f35825y, 2);
            this.f35647e1 = k0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            k0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.k0 k0Var2 = this.f35647e1;
            org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(this.f35825y);
            this.f35638d1 = cd0Var;
            k0Var2.setImageDrawable(cd0Var);
            this.f35647e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.k0 k0Var3 = this.f35647e1;
            eh.d a19 = this.Y.a(k0Var3);
            a19.v(gh.c.i(null));
            a19.w(AndroidUtilities.dp(4.0f));
            a19.x(AndroidUtilities.dp(16.0f));
            k0Var3.setBackground(a19);
            org.telegram.ui.Components.gb1.b(this.f35647e1);
            this.f35646e0.addView(this.f35647e1, org.telegram.ui.Components.gb1.h(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f35647e1.setOnClickListener(new yq0(this, 10));
            org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(this.f35646e0.getContext());
            this.f35657f1 = ba0Var;
            ba0Var.setOnClickListener(new yq0(this, 11));
            this.f35646e0.addView(this.f35657f1, org.telegram.ui.Components.gb1.h(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f35646e0.getContext();
            pu0 pu0Var2 = this.f35664g0;
            iu0 iu0Var3 = this.f35646e0;
            os0 os0Var2 = new os0(this, context, pu0Var2, iu0Var3, iu0Var3, u6Var, this.f35618b0, new xq0(this, 19));
            this.U1 = os0Var2;
            os0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.U1.setOnTimerChange(new dr0(this, 4));
            this.U1.setAccount(this.T);
            this.U1.setOnHeightUpdate(new dr0(this, 5));
            this.U1.setOnAddPhotoClick(new yq0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.E;
            pu0 pu0Var3 = this.f35664g0;
            iu0 iu0Var4 = this.f35646e0;
            ps0 ps0Var2 = new ps0(this, contextThemeWrapper, pu0Var3, iu0Var4, iu0Var4, u6Var, this.f35618b0, new xq0(this, 19));
            this.V1 = ps0Var2;
            ps0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.V1.D(true, false);
            this.V1.setOnTimerChange(new dr0(this, 6));
            this.V1.setAccount(this.T);
            this.V1.setOnHeightUpdate(new dr0(this, 7));
            this.V1.setOnAddPhotoClick(new yq0(this, 13));
            di.h3 h3Var = new di.h3(this, this.E);
            this.f35774s5 = h3Var;
            h3Var.setVisibility(8);
            this.f35646e0.addView(this.f35774s5, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            sg.p2 p2Var2 = new sg.p2(this.E, u6Var);
            this.f35747p5 = p2Var2;
            p2Var2.setCurrentAccount(this.T);
            iu0 iu0Var5 = this.f35646e0;
            iu0Var5.addView(this.f35747p5, iu0Var5.indexOfChild(this.F) - 1, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            au0 au0Var = new au0(this);
            this.f35783t5 = au0Var;
            au0Var.setRad(18);
            this.f35783t5.l();
            this.f35747p5.setStickerCutOutBtn(this.f35783t5);
            this.f35783t5.setOnClickListener(new yq0(this, 14));
            this.f35783t5.setCutOutState(false);
            this.f35646e0.addView(this.f35783t5, org.telegram.ui.Components.gb1.i(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f35825y);
            this.f35792u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            au0 au0Var2 = new au0(this);
            this.f35801v5 = au0Var2;
            au0Var2.f48199q0 = true;
            au0Var2.setRad(18);
            this.f35801v5.setEraseState(false);
            this.f35801v5.setOnClickListener(new yq0(this, 15));
            this.f35792u5.addView(this.f35801v5, org.telegram.ui.Components.gb1.r(-2, 36));
            this.f35792u5.addView(new Space(this.f35825y), org.telegram.ui.Components.gb1.r(12, -1));
            au0 au0Var3 = new au0(this);
            this.f35811w5 = au0Var3;
            au0Var3.f48199q0 = true;
            au0Var3.setRad(18);
            this.f35811w5.setRestoreState(false);
            this.f35811w5.setOnClickListener(new yq0(this, 16));
            this.f35792u5.addView(this.f35811w5, org.telegram.ui.Components.gb1.r(-2, 36));
            this.f35646e0.addView(this.f35792u5, org.telegram.ui.Components.gb1.i(-2, 36, 17));
            au0 au0Var4 = new au0(this);
            this.f35821x5 = au0Var4;
            au0Var4.setUndoState(false);
            this.f35821x5.setRad(18);
            au0 au0Var5 = this.f35821x5;
            au0Var5.f48199q0 = true;
            au0Var5.setOnClickListener(new yq0(this, 17));
            this.f35646e0.addView(this.f35821x5, org.telegram.ui.Components.gb1.i(-2, 36, 17));
            au0 au0Var6 = new au0(this);
            this.f35830y5 = au0Var6;
            au0Var6.setOutlineState(false);
            this.f35830y5.setRad(18);
            au0 au0Var7 = this.f35830y5;
            au0Var7.f48199q0 = true;
            au0Var7.setOnClickListener(new yq0(this, 18));
            this.f35646e0.addView(this.f35830y5, org.telegram.ui.Components.gb1.i(-2, 36, 17));
            Y2(false, false);
            c3(false, false);
            k0 k0Var4 = new k0(this, this.f35825y, 19);
            this.X1 = k0Var4;
            k0Var4.addView(this.U1, org.telegram.ui.Components.gb1.i(-1, -1, 83));
            this.f35646e0.addView(this.X1, org.telegram.ui.Components.gb1.h(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.f35825y);
            this.Y1 = frameLayout2;
            frameLayout2.addView(this.V1, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            this.f35646e0.addView(this.Y1, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.f35825y);
            this.Q0 = frameLayout3;
            this.f35646e0.addView(frameLayout3, org.telegram.ui.Components.gb1.h(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.f35825y);
            this.R0 = frameLayout4;
            this.f35646e0.addView(frameLayout4, org.telegram.ui.Components.gb1.h(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView7 = new TextView(this.f35825y);
            this.T7 = textView7;
            textView7.setSingleLine(true);
            this.T7.setVisibility(8);
            this.T7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.T7.setGravity(1);
            this.T7.setTextSize(1, 14.0f);
            this.T7.setTextColor(-7566196);
            this.f35646e0.addView(this.T7, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            li.w1 w1Var = new li.w1(this, this.f35825y, R.drawable.send_plane_24, u6Var, 4);
            this.S0 = w1Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            w1Var.I = dp;
            w1Var.J = dp2;
            li.w1 w1Var2 = this.S0;
            w1Var2.f33657h0 = true;
            eh.d a20 = this.Y.a(w1Var2);
            a20.v(gh.c.i(u6Var));
            w1Var2.setBlurredBackgroundDrawable(a20);
            this.f35646e0.addView(this.S0, org.telegram.ui.Components.gb1.h(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.S0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            org.telegram.ui.Components.gb1.b(this.S0);
            this.S0.setOnClickListener(new yq0(this, 19));
            this.S0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.gg0 gg0Var = new org.telegram.ui.Components.gg0(this.f35825y);
            this.T0 = gg0Var;
            LinearLayout linearLayout3 = gg0Var.f28567a;
            eh.d a21 = this.Y.a(linearLayout3);
            a21.v(gh.c.i(u6Var));
            a21.x(AndroidUtilities.dp(18.0f));
            a21.w(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.T0.f28568b;
            eh.d a22 = this.Y.a(linearLayout4);
            a22.v(gh.c.i(u6Var));
            a22.x(AndroidUtilities.dp(18.0f));
            a22.w(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a22);
            this.T0.setVisibility(8);
            this.T0.f28567a.setOnClickListener(new yq0(this, 20));
            this.T0.f28568b.setOnClickListener(new yq0(this, 21));
            this.f35646e0.addView(this.T0, org.telegram.ui.Components.gb1.i(-1, 56, 80));
            xa1 xa1Var = new xa1(this, this.f35825y, 17);
            this.H0 = xa1Var;
            xa1Var.setOrientation(0);
            this.H0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            xa1 xa1Var2 = this.H0;
            eh.d a23 = this.Y.a(xa1Var2);
            a23.v(gh.c.i(u6Var));
            a23.w(AndroidUtilities.dp(2.0f));
            a23.x(AndroidUtilities.dp(22.0f));
            xa1Var2.setBackground(a23);
            this.P0.addView(this.H0, org.telegram.ui.Components.gb1.h(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.f35825y);
            this.Z0 = imageView;
            imageView.setScaleType(scaleType);
            this.Z0.setImageResource(R.drawable.media_crop);
            this.Z0.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Z0, org.telegram.ui.Components.gb1.r(48, 48));
            this.Z0.setOnClickListener(new yq0(this, 22));
            this.Z0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f35825y);
            this.f35619b1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f35619b1.setImageResource(R.drawable.msg_photo_rotate);
            this.f35619b1.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f35619b1, org.telegram.ui.Components.gb1.r(48, 48));
            this.f35619b1.setOnClickListener(new yq0(this, 23));
            this.f35619b1.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f35825y);
            this.f35610a1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f35610a1.setImageResource(R.drawable.media_flip);
            this.f35610a1.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f35610a1, org.telegram.ui.Components.gb1.r(48, 48));
            this.f35610a1.setOnClickListener(new yq0(this, 24));
            this.f35610a1.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f35825y);
            this.Y0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.media_draw);
            this.Y0.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Y0, org.telegram.ui.Components.gb1.r(48, 48));
            this.Y0.setOnClickListener(new yq0(this, 25));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.f81 f81Var2 = new org.telegram.ui.Components.f81(this.f35825y);
            this.f35691j1 = f81Var2;
            f81Var2.setTag(1);
            this.f35691j1.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.Y7 = x2();
            org.telegram.ui.Components.f81 f81Var3 = this.f35691j1;
            if (this.f35707k8 && this.Z7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            f81Var3.a(Math.min(this.f35654e8, this.f35663f8), z11, this.f35759r);
            this.f35691j1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.H0.addView(this.f35691j1, org.telegram.ui.Components.gb1.r(48, 48));
            this.f35691j1.setOnClickListener(new xd0(7, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f35825y);
            this.f35629c1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f35629c1.setImageResource(R.drawable.media_settings);
            this.f35629c1.setBackground(org.telegram.ui.ActionBar.y6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f35629c1, org.telegram.ui.Components.gb1.r(48, 48));
            this.f35629c1.setOnClickListener(new yq0(this, 26));
            this.f35629c1.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.og0 og0Var2 = new org.telegram.ui.Components.og0(this.E);
            this.U0 = og0Var2;
            og0Var2.setBackgroundColor(-872415232);
            this.U0.a();
            this.U0.setVisibility(8);
            this.f35646e0.addView(this.U0, org.telegram.ui.Components.gb1.i(-1, 48, 83));
            this.U0.f31294a.setOnClickListener(new yq0(this, 27));
            this.U0.f31295b.setOnClickListener(new yq0(this, 28));
            TextView textView8 = new TextView(this.E);
            this.V0 = textView8;
            textView8.setClickable(false);
            this.V0.setVisibility(8);
            this.V0.setTextSize(1, 14.0f);
            this.V0.setTextColor(-1);
            this.V0.setGravity(17);
            this.V0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.f0(-12763843, 0));
            this.V0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.V0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.V0.setTypeface(AndroidUtilities.bold());
            this.U0.addView(this.V0, org.telegram.ui.Components.gb1.i(-2, -1, 49));
            this.V0.setOnClickListener(new yq0(this, 29));
            org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(this.f35646e0.getContext(), this);
            this.r6 = u20Var;
            u20Var.b();
            this.f35775s6 = true;
            this.r6.h = this;
            fr0 fr0Var = new fr0(this);
            this.C4.setParentView(this.f35646e0);
            this.C4.setCrossfadeAlpha((byte) 2);
            this.C4.setInvalidateAll(true);
            this.C4.setDelegate(fr0Var);
            this.B4.setParentView(this.f35646e0);
            this.B4.setCrossfadeAlpha((byte) 2);
            this.B4.setInvalidateAll(true);
            this.B4.setDelegate(fr0Var);
            this.D4.setParentView(this.f35646e0);
            this.D4.setCrossfadeAlpha((byte) 2);
            this.D4.setInvalidateAll(true);
            this.D4.setDelegate(fr0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f35646e0.getContext(), R.drawable.selectphoto_large);
            this.N0 = checkBox;
            checkBox.setDrawBackground(true);
            this.N0.setHasBorder(true);
            this.N0.setSize(34);
            this.N0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.N0.c(A1(i15), -1);
            this.N0.setVisibility(8);
            iu0 iu0Var6 = this.f35646e0;
            CheckBox checkBox2 = this.N0;
            if (rotation != 3 && rotation != 1) {
                f7 = 71.0f;
            } else {
                f7 = 61.0f;
            }
            iu0Var6.addView(checkBox2, org.telegram.ui.Components.gb1.h(34, 34.0f, 53, 0.0f, f7, 11.0f, 0.0f));
            if (!this.f35768s) {
                ((FrameLayout.LayoutParams) this.N0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.N0.setOnClickListener(new jr0(this, 0));
            CounterView counterView = new CounterView(this.f35825y);
            this.O0 = counterView;
            iu0 iu0Var7 = this.f35646e0;
            if (rotation != 3 && rotation != 1) {
                f10 = 68.0f;
            } else {
                f10 = 58.0f;
            }
            iu0Var7.addView(counterView, org.telegram.ui.Components.gb1.h(40, 40.0f, 53, 0.0f, f10, 64.0f, 0.0f));
            if (!this.f35768s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.O0.setOnClickListener(new jr0(this, 1));
            wu0 wu0Var = new wu0(this.f35825y);
            this.f35734o1 = wu0Var;
            wu0Var.setVisibility(8);
            this.f35734o1.setAlpha(0.0f);
            this.f35734o1.setLayoutManager(new ig.a0());
            wu0 wu0Var2 = this.f35734o1;
            ju0 ju0Var = new ju0(this.f35825y, this);
            this.f35743p1 = ju0Var;
            wu0Var2.setAdapter(ju0Var);
            this.f35646e0.addView(this.f35734o1, org.telegram.ui.Components.gb1.i(-1, 103, 51));
            this.f35734o1.setOnItemClickListener(new h(this, 23));
            UndoView undoView = new UndoView(this.E, null, false, u6Var);
            this.f35725n1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f35725n1.h(-115203550, -1);
            this.f35646e0.addView(this.f35725n1, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.E);
                this.T3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new jr0(this, 2));
                this.f35646e0.addView(this.T3, org.telegram.ui.Components.gb1.i(64, 64, 17));
            }
            org.telegram.ui.ActionBar.f7.R(this.f35724n0, org.telegram.ui.ActionBar.o6.e(new float[]{6.0f}, A1(i16)), org.telegram.ui.ActionBar.f7.N(i16), org.telegram.ui.ActionBar.f7.f(i16), u6Var);
            org.telegram.ui.ActionBar.f7.V(this.f35724n0, i17, u6Var);
            js0 js0Var = this.Q;
            js0Var.f24103j0 = true;
            js0Var.f24099h0 = false;
            org.telegram.ui.Cells.ea n10 = js0Var.n(this.f35664g0.getContext());
            if (n10 != null) {
                AndroidUtilities.removeFromParent(n10);
                this.f35646e0.addView(n10);
            }
            this.Q.S(this.f35646e0);
            this.Q.R();
            this.f35608a.a(false, false);
            return;
        }
        w3();
    }

    public final void N0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.ra raVar;
        if (this.B2 == null) {
            ft0 ft0Var = new ft0(this.f35825y, this);
            this.f35828y2 = ft0Var;
            ft0Var.setWillNotDraw(false);
            this.f35828y2.setVisibility(4);
            this.f35646e0.addView(this.f35828y2, 0, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            this.D2 = false;
            if (this.g7.isEmpty()) {
                if (this.f35617b && this.T2 == null) {
                    this.C2 = new SurfaceView(this.f35825y);
                    this.D2 = true;
                } else {
                    this.B2 = new TextureView(this.f35825y);
                }
            } else {
                org.telegram.ui.Components.h81 h81Var = new org.telegram.ui.Components.h81(this.f35825y, this.F2);
                this.f35618b0.e();
                org.telegram.ui.Components.la laVar = this.f35618b0;
                h81Var.f28867s = laVar;
                org.telegram.ui.Components.e00 e00Var = h81Var.f28862b;
                if (e00Var != null && (raVar = e00Var.I) != null) {
                    org.telegram.ui.Components.la laVar2 = raVar.f32202t;
                    if (laVar2 != null && laVar2.f30146m != null) {
                        laVar2.f30146m = null;
                    }
                    raVar.f32202t = laVar;
                    if (laVar != null && laVar.f30146m != raVar) {
                        laVar.f30146m = raVar;
                        laVar.d();
                    }
                }
                if (savedFilterState != null) {
                    h81Var.setDelegate(new hl0(savedFilterState, 3));
                }
                this.B2 = h81Var;
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
                this.f35828y2.addView(this.B2, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            } else {
                this.f35828y2.addView(this.C2, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            }
            hu0 hu0Var = new hu0(this.f35825y, this);
            this.E2 = hu0Var;
            hu0Var.setPivotX(0.0f);
            this.E2.setPivotY(0.0f);
            this.E2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f35828y2.addView(this.E2, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            View view = new View(this.f35825y);
            this.P8 = view;
            this.f35828y2.addView(view, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            if (this.f35630c2 == 1) {
                View view2 = new View(this.f35825y);
                this.f35836z2 = view2;
                view2.setBackgroundColor(-1);
                this.f35836z2.setAlpha(0.0f);
                this.f35828y2.addView(this.f35836z2, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            }
            sf.d dVar = this.G2;
            if (dVar != null) {
                ft0 ft0Var2 = this.f35828y2;
                dVar.f48133i.D(ft0Var2);
                dVar.f48134j = ft0Var2;
                if (ft0Var2 != null) {
                    dVar.e(ft0Var2);
                }
                this.G2.f48135k = this.P8;
            }
        }
    }

    public final void N2(org.telegram.ui.Components.ti tiVar) {
        this.a2 = tiVar;
        ag.a1 a1Var = this.f35620b2;
        if (a1Var != null) {
            a1Var.destroy();
            this.f35620b2 = null;
        }
        if (tiVar != null) {
            this.f35620b2 = tiVar.obtainWindowVisibilityController();
        }
    }

    public final boolean O0() {
        boolean z10 = false;
        if (this.f35748p6 != null || this.C1 == null) {
            return false;
        }
        this.f35670g6 = 1.0f;
        this.f35730n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35748p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.v6.f33583g, 0.0f, 1.0f));
        this.f35748p6.setDuration(250L);
        this.f35748p6.setInterpolator(org.telegram.ui.Components.ds.f27586f);
        this.f35748p6.addListener(new vs0(this, 0));
        this.f35748p6.start();
        ng.n nVar = this.C1.f31285b.L;
        if (nVar != null) {
            z10 = nVar.f18840j;
        }
        return !z10;
    }

    public final void O2() {
        un unVar;
        TLRPC.Chat chat;
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            if (ou0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f35723n && (unVar = this.l4) != null && (chat = unVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.g5.M(this.f35825y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, o1());
            boolean x9 = this.d.x(this.P4);
            this.N0.b(x9, true);
            if (k10 >= 0) {
                if (x9) {
                    this.f35743p1.o(k10);
                    this.f35734o1.y0(k10);
                } else {
                    this.f35743p1.u(k10);
                    if (k10 == 0) {
                        this.f35743p1.m(0);
                    }
                }
            }
            C3();
        }
    }

    public final boolean P0(float f7, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.of0 of0Var;
        float f10;
        if (this.f35748p6 == null && (of0Var = this.C1) != null) {
            of0Var.f31285b.i();
            this.f35624b6 = 0.0f;
            this.f35662f6 = 0.0f + f7;
            if (z10) {
                this.f35670g6 = 1.0f;
            }
            this.f35730n6 = System.currentTimeMillis();
            this.f35748p6 = new AnimatorSet();
            if (this.f35630c2 == 1) {
                this.f35652e6 = 1.0f;
                this.f35614a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.C4.getBitmapHeight();
                    if (Math.abs((((int) this.C1.f31285b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.X4.f39475c;
                    if (cropState != null) {
                        bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                        bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                    }
                    float f11 = bitmapWidth;
                    float f12 = bitmapHeight;
                    float min = Math.min(l1(1) / f11, i1(1, false) / f12);
                    if (Math.abs((f7 / 90.0f) % 2.0f) == 1.0f) {
                        f10 = Math.min(l1(1) / f12, i1(1, false) / f11);
                    } else {
                        f10 = min;
                    }
                    this.f35652e6 = f10 / min;
                }
            }
            if (this.f35630c2 == 11) {
                this.f35614a6 = t2(false) * this.f35614a6;
                this.f35652e6 = t2(false) * this.f35652e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new fi.fa(this, f7, this.C1.f31286c.getRotation(), 4));
            this.f35748p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.v6.f33583g, 0.0f, 1.0f), ofFloat);
            this.f35748p6.setDuration(250L);
            this.f35748p6.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            this.f35748p6.addListener(new ws0(this, f7, runnable));
            this.f35748p6.start();
            if (Math.abs(this.C1.f31285b.getStateOrientation() + f7) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void P2() {
        float bitmapWidth = this.C4.getBitmapWidth();
        float bitmapHeight = this.C4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float l1 = l1(this.f35791u4);
            float j12 = j1();
            float min = Math.min(j12 / bitmapHeight, l1 / bitmapWidth);
            float max = Math.max(l1 / ((int) (bitmapWidth * min)), j12 / ((int) (bitmapHeight * min)));
            this.f35614a6 = max;
            y3(max);
        }
    }

    public final void Q0() {
        if (this.f35825y != null && this.f35664g0 != null) {
            if (org.telegram.ui.Components.ch0.f27159p0.P) {
                org.telegram.ui.Components.ch0.j(false);
            }
            NotificationCenter.ObserversGroup observersGroup = this.C7;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.C7 = null;
            }
            ConnectionsManager.getInstance(this.T).cancelRequestsForGuid(this.f35627c);
            q2(false);
            try {
                if (this.f35664g0.getParent() != null) {
                    ((WindowManager) this.f35825y.getSystemService("window")).removeViewImmediate(this.f35664g0);
                    Y1();
                }
                this.f35664g0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f35695j5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f35695j5 = null;
            }
            this.f35672h0.setImageBitmap(null);
            if (this == f35607b9) {
                f35607b9 = null;
            } else {
                f35606a9 = null;
            }
            Y1();
        }
    }

    public final void Q2(CharSequence charSequence) {
        nu0 nu0Var = this.M;
        this.f35650e4 = charSequence;
        nu0Var.c(charSequence);
        l3(true, false);
    }

    public final void R0() {
        if (this.C4.getAnimation() == null && !this.g7.isEmpty() && this.f35630c2 != 1) {
            String imageKey = this.C4.getImageKey();
            String str = this.f35820x4;
            if (str == null || !str.equals(imageKey)) {
                this.f35810w4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.C4.getBitmapSafe();
                int orientation = this.C4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.zr0(this, bitmapSafe, orientation, imageKey, 13));
                }
            }
        }
    }

    public final void R2(boolean z10, boolean z11) {
        if (this.f35710l3 != z10) {
            if (z10) {
                this.f35681i0.setTag(1);
            } else {
                this.f35681i0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f35702k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35710l3 = z10;
            float f7 = 0.0f;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    this.f35684i3.setVisibility(0);
                }
                float alpha = this.f35684i3.getAlpha();
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new wq0(this, 0));
                ofFloat.addListener(new gt0(this, z10, 0));
                this.f35702k3 = ofFloat;
                ofFloat.start();
            } else {
                xu0 xu0Var = this.f35684i3;
                if (!z10) {
                    i10 = 8;
                }
                xu0Var.setVisibility(i10);
                xu0 xu0Var2 = this.f35684i3;
                if (z10) {
                    f7 = 1.0f;
                }
                xu0Var2.setAlpha(f7);
            }
            if (this.f35701k2 && this.f35697j7 == null) {
                if (z10) {
                    this.f35733o0.S(9);
                } else {
                    this.f35733o0.t(9);
                }
            }
        }
    }

    public final void S0() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Z7)), this.Y7);
        edit.commit();
        F3();
        D3();
    }

    public final boolean S1() {
        if (this.f35630c2 != 11) {
            int i10 = this.P4;
            if (i10 >= 0) {
                ArrayList arrayList = this.g7;
                if (i10 < arrayList.size()) {
                    ou0 ou0Var = this.d;
                    if (ou0Var != null && !ou0Var.O()) {
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

    public final boolean S2(int i10) {
        ku0 ku0Var = this.f35697j7;
        if (ku0Var != null) {
            if ((ku0Var.a(i10) || this.f35697j7.e(i10)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f35697j7.b(i10);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f35697j7.d(i10) instanceof TLRPC.Document)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void T0() {
        ag.b1 b1Var = this.f35721m7;
        if (b1Var != null) {
            b1Var.destroy();
            this.f35721m7 = null;
        }
        ag.a1 a1Var = this.f35620b2;
        if (a1Var != null) {
            a1Var.destroy();
            this.f35620b2 = null;
        }
        try {
            if (this.f35664g0.getParent() != null) {
                ((WindowManager) this.f35825y.getSystemService("window")).removeView(this.f35664g0);
                Y1();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean T1() {
        if (this.e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void U0(android.graphics.Canvas r51, org.telegram.ui.Components.pa r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U0(android.graphics.Canvas, org.telegram.ui.Components.pa, int, int, boolean, boolean, boolean):void");
    }

    public final void U1() {
        WindowManager.LayoutParams layoutParams = this.f35637d0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.f35825y.getSystemService("window")).updateViewLayout(this.f35664g0, this.f35637d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f35664g0.setFocusable(true);
        this.f35646e0.setFocusable(true);
    }

    public final void U2(AlertDialog$Builder alertDialog$Builder) {
        if (this.f35825y != null) {
            try {
                org.telegram.ui.ActionBar.e2 e2Var = this.P1;
                if (e2Var != null) {
                    e2Var.dismiss();
                    this.P1 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
                this.P1 = p10;
                p10.setCanceledOnTouchOutside(true);
                this.P1.setOnDismissListener(new u5(this, 10));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void V0(android.graphics.Canvas r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V0(android.graphics.Canvas, float, float):void");
    }

    public final void V1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f7, boolean z10) {
        boolean z11;
        int i10;
        Bitmap.CompressFormat h12 = h1();
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
        Paint paint = V8;
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
        createBitmap.compress(h12, i10, fileOutputStream);
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

    public final boolean V2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f35718m4;
        if ((r2Var instanceof un) && ChatObject.isChannelAndNotMegaGroup(((un) r2Var).e)) {
            org.telegram.ui.Components.qc f7 = new org.telegram.ui.Components.wc(frameLayout, this.f35798v2).f(MessagesController.getInstance(this.T).captionLengthLimitPremium, new xq0(this, 26));
            f7.f31901w = new xq0(this, 27);
            this.f35731n7 = f7.j();
            return true;
        }
        return false;
    }

    public final void W0(Canvas canvas) {
        boolean z10;
        float e;
        int i10;
        if (this.S4) {
            if (!SharedConfig.photoViewerBlur) {
                e = 1.0f;
            } else {
                int i11 = this.f35728n4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e = this.E8.e(z10);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f35646e0.getWidth(), this.f35646e0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e * (this.L0.getAlpha() - 127) * 2.007874f), 31);
            this.G7.rewind();
            float f7 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.G7.addRect(0.0f, 0.0f, this.f35646e0.getWidth(), f7, direction);
            this.G7.addRect(0.0f, (this.f35646e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f35646e0.getWidth(), this.f35646e0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.G7);
            canvas.drawColor(-16777216);
            U0(canvas, this.f35628c0, 0, 0, true, true, false);
            canvas.save();
            this.L7.reset();
            this.L7.postScale(1.0f, f7 / 16.0f);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f35646e0.getWidth(), f7, this.H7);
            this.M7.reset();
            this.M7.postScale(1.0f, i12 / 16.0f);
            this.M7.postTranslate(0.0f, (this.f35646e0.getHeight() - i12) + AndroidUtilities.navigationBarHeight);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f35646e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f35646e0.getWidth(), this.f35646e0.getHeight() + AndroidUtilities.navigationBarHeight, this.I7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void W1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W1(boolean):void");
    }

    public final void W2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35825y, 0, this.f35798v2);
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.T4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.T4.currentAccount).isLoadingFile(this.f35633c5[0])) {
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PleaseDownload);
        }
        U2(alertDialog$Builder);
    }

    public final void X0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void X1(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X1(android.graphics.Canvas):void");
    }

    public final void X2(final org.telegram.ui.Components.jd jdVar, boolean z10, boolean z11, final float[] fArr) {
        float f7;
        float f10;
        int i10;
        ou0 ou0Var = this.d;
        if (ou0Var != null && ou0Var.l()) {
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
                public final PhotoViewer f43278b;

                {
                    this.f43278b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f43278b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = jdVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35647e1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f35657f1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f35665g1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f43278b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = jdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35647e1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f35657f1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f35665g1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.H1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
        } else if (!z10 && jdVar.getTag() != null) {
            jdVar.animate().translationY(f12).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f43278b;

                {
                    this.f43278b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f43278b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = jdVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35647e1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f35657f1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f35665g1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f43278b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = jdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35647e1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f35657f1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f35665g1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.H1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new dh(4, jdVar)).start();
        }
        if (z10) {
            num = 1;
        }
        jdVar.setTag(num);
    }

    public final void Y0(TLRPC.Document document, TLRPC.Document document2, boolean z10, Utilities.Callback2 callback2) {
        float f7;
        this.f35794u7 = document;
        this.f35785t7 = document2;
        this.f35803v7 = z10;
        this.f35813w7 = false;
        this.f35823x7 = callback2;
        this.f35624b6 = 0.0f;
        this.f35662f6 = 0.0f;
        if (this.f35747p5 != null) {
            au0 au0Var = this.f35830y5;
            if (au0Var != null) {
                au0Var.m(false, false);
            }
            this.f35747p5.b();
            ArrayList arrayList = this.f35765r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f35794u7 != null) {
            ArrayList arrayList2 = this.f35765r5;
            if (arrayList2 == null) {
                this.f35765r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f35794u7, Integer.valueOf(this.T));
            if (findStickerEmoticons != null) {
                this.f35765r5.addAll(findStickerEmoticons);
            }
        }
        au0 au0Var2 = this.f35783t5;
        if (au0Var2 != null) {
            au0Var2.setCutOutState(false);
        }
        c3(true, false);
        ImageView imageView = this.f35629c1;
        if (imageView != null) {
            if (this.f35803v7) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
        }
    }

    public final void Y1() {
        Activity activity = this.f35825y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f35526b1.remove(this.f35770s1);
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f35718m4;
        if (r2Var != null && r2Var.getFragmentView() != null) {
            this.f35720m6 = 1.0f;
            View fragmentView = this.f35718m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.ti tiVar = this.a2;
            if (tiVar != null) {
                org.telegram.ui.ActionBar.h3 container = tiVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void Y2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ou0 ou0Var = this.d;
        boolean z14 = false;
        if (ou0Var != null && ou0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        os0 os0Var = this.U1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        X2(os0Var, z13, z11, this.f35832y7);
        ps0 ps0Var = this.V1;
        if (z10 && z12) {
            z14 = true;
        }
        X2(ps0Var, z14, z11, this.f35841z7);
    }

    public final void Z1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.F2 != null && this.T4 != null) {
                    int intValue = Utilities.parseInt((CharSequence) url).intValue();
                    if (this.F2.p() == -9223372036854775807L) {
                        this.f35611a3 = intValue / ((float) this.T4.getDuration());
                        return;
                    }
                    long j10 = intValue * 1000;
                    this.F2.K(j10);
                    this.f35754q3.h(((float) j10) / ((float) this.F2.p()), true);
                    this.f35763r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f35825y instanceof LaunchActivity) {
                    cy cyVar = new cy(null);
                    cyVar.f38632n2 = url;
                    ((LaunchActivity) this.f35825y).v0(cyVar, false, true);
                    H0(false, false);
                    return;
                }
                return;
            } else if (this.l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.z61) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.g5.p0(this.l4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void Z2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z2(boolean, boolean):void");
    }

    @Override
    public final void a(a8.fg fgVar) {
        if (org.telegram.ui.Components.ch0.f27159p0.P) {
            org.telegram.ui.Components.ch0.j(false);
        }
        this.Q8 = fgVar;
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            s81Var.U(null);
            this.F2.V(null);
            this.F2.C();
            this.F2.V(this.R8);
        }
        ((WindowManager) this.f35825y.getSystemService("window")).removeView(this.f35664g0);
        this.S8 = true;
        this.f35664g0.invalidate();
    }

    @Override
    public final void a1() {
        F1();
    }

    public final void a2(qu0 qu0Var) {
        if (this.f35789u2) {
            q2(true);
        }
        MessageObject messageObject = this.T4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        }
        this.e = false;
        this.f35655f = false;
        this.f35666g2 = false;
        this.f35773s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f35613a5 = null;
        this.f35623b5 = null;
        this.f35686i5 = null;
        this.f35651e5 = null;
        this.f35753q2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f35684i3 != null) {
            R2(false, false);
        }
        ot0 ot0Var = this.T1;
        if (ot0Var != null) {
            ot0Var.scrollTo(0, 0);
        }
        this.f35630c2 = 0;
        this.f35639d2 = false;
        this.f35648e2 = false;
        this.f35658f2 = false;
        this.f35674h2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f35695j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f35695j5 = null;
        }
        this.a2 = null;
        ag.a1 a1Var = this.f35620b2;
        if (a1Var != null) {
            a1Var.destroy();
            this.f35620b2 = null;
        }
        org.telegram.ui.Components.g6 g6Var = this.f35692j2;
        if (g6Var != null) {
            g6Var.w(this.f35646e0);
            this.f35692j2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            mu0 mu0Var = this.W0[i10];
            if (mu0Var != null) {
                mu0Var.d(-1, false, true);
            }
        }
        r2(0);
        ls0 ls0Var = this.S7;
        if (ls0Var != null) {
            ls0Var.a();
        }
        this.f35725n1.d(0, false);
        this.C4.setImageBitmap((Bitmap) null);
        this.F4.a();
        this.B4.setImageBitmap((Bitmap) null);
        this.E4.a();
        this.D4.setImageBitmap((Bitmap) null);
        this.G4.a();
        this.f35646e0.post(new zq0(this, qu0Var, 0));
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            ou0Var.G();
        }
        org.telegram.ui.Components.g40 g40Var = this.l1;
        g40Var.d.clear();
        g40Var.e.clear();
        g40Var.f28408c.clear();
        ou0 ou0Var2 = this.d;
        if (ou0Var2 != null) {
            ou0Var2.D();
        }
        this.d = null;
        this.f35743p1.l();
        this.f35697j7 = null;
        this.f35773s4 = false;
        this.f35741o8 = 0.0f;
        this.f35750p8 = 1.0f;
        if (qu0Var != null) {
            qu0Var.f42919a.setVisible(true, true);
        }
        un unVar = this.l4;
        if (unVar != null) {
            unVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
    }

    public final void a3(boolean z10) {
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
            this.f35616a8 = this.Y7;
        }
        AnimatorSet animatorSet = this.U7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.U7 = new AnimatorSet();
        float f19 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f35690j0.setVisibility(0);
                View view = this.f35690j0;
                if (this.f35630c2 == 11) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                view.setAlpha(f18);
                View view2 = this.f35690j0;
                if (this.f35630c2 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.O7.setTag(1);
            AnimatorSet animatorSet2 = this.U7;
            bi.j5 j5Var = this.P0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.U1.getEditTextHeight() + j5Var.getHeight();
            if (this.f35761r1) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j5Var, property, 0.0f, editTextHeight + i10);
            bi.j5 j5Var2 = this.P0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j5Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.S0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f35690j0;
            if (this.S4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f17, 1.0f));
        } else {
            this.O7.setTag(null);
            AnimatorSet animatorSet3 = this.U7;
            su0 su0Var = this.O7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(su0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.P7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f35690j0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f7));
        }
        this.U7.addListener(new gt0(this, z10, 3));
        this.U7.setDuration(200L);
        this.U7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.U7.start();
        float f20 = 0.25f;
        if (this.f35647e1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f35647e1.animate();
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
        if (this.f35657f1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f35657f1.animate();
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
        if (this.f35665g1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f35665g1.animate();
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

    @Override
    public final void b(a8.fg fgVar) {
        this.Q8 = fgVar;
        this.S8 = false;
        if (this.f35664g0 != null) {
            ((WindowManager) this.f35825y.getSystemService("window")).addView(this.f35664g0, this.f35637d0);
            this.f35664g0.invalidate();
        }
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            s81Var.U(null);
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

    public final void b2(org.telegram.messenger.MessageObject r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.ImageLocation r24, org.telegram.messenger.ImageLocation r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.qu0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.b2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.qu0):void");
    }

    public final void b3() {
        long a2;
        if (this.f35825y != null) {
            un unVar = this.l4;
            if (unVar != null) {
                a2 = unVar.a();
            } else {
                ou0 ou0Var = this.d;
                if (ou0Var != null) {
                    a2 = ou0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a2;
            org.telegram.ui.Components.g5.J(this.f35825y, j10, -1L, 0, false, new fr0(this), null, new org.telegram.ui.Components.d5(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false)), null);
        }
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.R8;
        if (textureView != null && textureView.isAvailable()) {
            return this.R8.getBitmap();
        }
        return null;
    }

    public final int c1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.f35630c2 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final boolean c2(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c2(android.view.MotionEvent):boolean");
    }

    public final void c3(boolean z10, boolean z11) {
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
            this.f35747p5.animate().setListener(null).cancel();
            sg.p2 p2Var = this.f35747p5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p2Var.setVisibility(i11);
            this.f35747p5.setAlpha(this.P0.getAlpha());
            this.f35774s5.animate().setListener(null).cancel();
            di.h3 h3Var = this.f35774s5;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            h3Var.setVisibility(i12);
            di.h3 h3Var2 = this.f35774s5;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            h3Var2.setAlpha(f11);
        } else if (z10 && this.f35747p5.getTag() == null) {
            this.f35747p5.animate().setListener(null).cancel();
            this.f35774s5.animate().setListener(null).cancel();
            if (this.f35747p5.getVisibility() != 0) {
                this.f35747p5.setVisibility(0);
                this.f35747p5.animate().alpha(1.0f).start();
                this.f35774s5.setVisibility(0);
                this.f35774s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f35747p5.getTag() != null) {
            this.f35747p5.animate().setListener(null).cancel();
            this.f35747p5.animate().alpha(0.0f).setListener(new jo(this.f35747p5)).start();
            this.f35774s5.animate().setListener(null).cancel();
            this.f35774s5.animate().alpha(0.0f).setListener(new jo(this.f35774s5)).start();
        }
        sg.p2 p2Var2 = this.f35747p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        p2Var2.setTag(num);
        if (z10 && this.f35783t5.m0 != 1 && !this.f35803v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f35783t5.animate().setListener(null).cancel();
            au0 au0Var = this.f35783t5;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            au0Var.setVisibility(i10);
            au0 au0Var2 = this.f35783t5;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            au0Var2.setAlpha(f10);
        } else if (z12 && this.f35783t5.getTag() == null) {
            this.f35783t5.animate().setListener(null).cancel();
            if (this.f35783t5.getVisibility() != 0) {
                this.f35783t5.setVisibility(0);
            }
            this.f35783t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f35783t5.getTag() != null) {
            this.f35783t5.animate().setListener(null).cancel();
            this.f35783t5.animate().alpha(0.0f).setListener(new jo(this.f35783t5)).start();
        }
        au0 au0Var3 = this.f35783t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        au0Var3.setTag(num2);
        if (z10 && this.f35783t5.m0 == 1 && !this.f35803v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        Z2(z13, z11);
        sg.p2 p2Var3 = this.f35747p5;
        if (z10 && this.f35783t5.m0 == 1 && this.f35830y5.f37903s0 && !this.f35801v5.f37903s0 && !this.f35811w5.f37903s0) {
            z14 = true;
        } else {
            z14 = false;
        }
        p2Var3.setOutlineVisible(z14);
        if (!z10 || this.f35783t5.m0 != 1 || this.f35801v5.f37903s0 || this.f35811w5.f37903s0) {
            z15 = false;
        }
        if (!z11) {
            this.f35830y5.animate().setListener(null).cancel();
            au0 au0Var4 = this.f35830y5;
            if (z15) {
                i13 = 0;
            }
            au0Var4.setVisibility(i13);
            au0 au0Var5 = this.f35830y5;
            if (z15) {
                f12 = 1.0f;
            }
            au0Var5.setAlpha(f12);
            au0 au0Var6 = this.f35830y5;
            if (z15) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            au0Var6.setScaleX(f7);
            au0 au0Var7 = this.f35830y5;
            if (!z15) {
                f13 = 0.8f;
            }
            au0Var7.setScaleY(f13);
        } else if (z15 && this.f35830y5.getTag() == null) {
            this.f35830y5.animate().setListener(null).cancel();
            if (this.f35830y5.getVisibility() != 0) {
                this.f35830y5.setVisibility(0);
            }
            org.telegram.messenger.vh.q(this.f35830y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.ds.h, 400L);
        } else if (!z15 && this.f35830y5.getTag() != null) {
            this.f35830y5.animate().setListener(null).cancel();
            org.telegram.messenger.vh.q(this.f35830y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jo(this.f35830y5)), org.telegram.ui.Components.ds.h, 400L);
        }
        au0 au0Var8 = this.f35830y5;
        if (!z15) {
            num3 = null;
        }
        au0Var8.setTag(num3);
    }

    @Override
    public final void d(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final int d1(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.f35630c2 != 1)) {
                if (i10 == 3 && this.L1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f35768s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return this.L1.getAdditionalTop() + dp + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f35768s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i11;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f35768s) {
                    i11 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i11;
            }
        }
        return 0;
    }

    public final void d2(ArrayList arrayList, int i10, long j10, long j11, long j12, ou0 ou0Var) {
        g2((MessageObject) arrayList.get(i10), null, null, null, arrayList, null, null, i10, ou0Var, null, j10, j11, j12, true, null, null);
    }

    public final void d3(boolean z10) {
        Integer num;
        float f7;
        float f10;
        vt0 vt0Var;
        if (!z10 || this.f35772s3.getTag() == null) {
            if (!z10 && this.f35772s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f35772s3.f35258s && ((vt0Var = this.f35656f0) == null || !vt0Var.f30582x || vt0Var.v.isEmpty())) {
                this.f35790u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f35781t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            zs0 zs0Var = this.f35772s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            zs0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35781t3 = animatorSet2;
            zs0 zs0Var2 = this.f35772s3;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zs0Var2, property, f7);
            zs0 zs0Var3 = this.f35772s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zs0Var3, property2, f10);
            zs0 zs0Var4 = this.f35772s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f12 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zs0Var4, property3, f12);
            zs0 zs0Var5 = this.f35772s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(zs0Var5, property4, f11));
            this.f35781t3.setDuration(380L);
            this.f35781t3.setInterpolator(org.telegram.ui.Components.ds.h);
            this.f35781t3.addListener(new vs0(this, 1));
            this.f35781t3.start();
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

    public final int e1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e1(boolean):int");
    }

    public final void e2(ArrayList arrayList, int i10, ou0 ou0Var) {
        g2(null, null, null, null, null, arrayList, null, i10, ou0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void e3(boolean z10, boolean z11) {
        int i10;
        Integer num = null;
        if (!z11) {
            this.R7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.R7;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            this.S7.setTranslationY(0.0f);
            this.R7.setAlpha(this.P0.getAlpha());
        } else if (z10 && this.R7.getTag() == null) {
            if (this.R7.getVisibility() != 0) {
                this.R7.setVisibility(0);
                this.R7.setAlpha(this.P0.getAlpha());
                this.S7.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.A7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.A7.cancel();
            }
            ls0 ls0Var = this.S7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ls0Var, View.TRANSLATION_Y, ls0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            this.A7.start();
        } else if (!z10 && this.R7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            ls0 ls0Var2 = this.S7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ls0Var2, View.TRANSLATION_Y, ls0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new jo(this.R7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            this.A7.start();
        }
        FrameLayout frameLayout2 = this.R7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.R7.setTranslationY(this.P0.getTranslationY() - (this.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, this.U1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.R7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final void f(Canvas canvas) {
        this.T8 = true;
        this.f35664g0.draw(canvas);
        this.T8 = false;
    }

    public final ClippingImageView[] f1(qu0 qu0Var) {
        int i10;
        if (!AndroidUtilities.isTablet() && qu0Var != null && qu0Var.f42928m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f35672h0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = qu0Var.f42928m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(qu0Var.f42929n);
        }
        return clippingImageViewArr;
    }

    public final void f2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, gu0 gu0Var) {
        g2(null, fileLocation, imageLocation, null, null, null, null, 0, gu0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void f3() {
        org.telegram.ui.Components.s81 s81Var;
        if (this.f35761r1 && (s81Var = this.F2) != null && !s81Var.y()) {
            if (!this.f35759r || this.f35630c2 == 1) {
                this.F2.W(0.0f);
            }
            this.H2 = false;
            s3();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f35796v0;
        if (g1Var != null && g1Var.isEnabled() && this.P3) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.Components.jd g1() {
        ou0 ou0Var = this.d;
        if (ou0Var != null && ou0Var.A()) {
            return this.V1;
        }
        return this.U1;
    }

    public final boolean g2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.ou0 r25, org.telegram.ui.un r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.ku0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.ou0, org.telegram.ui.un, long, long, long, boolean, org.telegram.ui.ku0, java.lang.Integer):boolean");
    }

    public final void g3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g3(int):void");
    }

    public float getAnimationValue() {
        return this.f35712l6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f35825y);
        this.R8 = textureView;
        textureView.setOpaque(false);
        View view = this.P8;
        if (view != null) {
            view.bringToFront();
        }
        return this.R8;
    }

    public final Bitmap.CompressFormat h1() {
        if (this.f35630c2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final boolean h2(MessageObject messageObject, un unVar, long j10, long j11, long j12, gu0 gu0Var) {
        return g2(messageObject, null, null, null, null, null, null, 0, gu0Var, unVar, j10, j11, j12, true, null, null);
    }

    public final void h3(int i10, boolean z10) {
        if (this.T4 != null) {
            q2(false);
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        } else if (this.f35686i5 != null) {
            TLObject d = this.f35697j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                q2(false);
                FileLoader.getInstance(this.T).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.g40 g40Var = this.l1;
        if (g40Var != null) {
            g40Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        E2(this.P4 + i10, z10, true, false);
        if (T2(this.T4) || S2(this.P4)) {
            this.Y2 = true;
            W1(true);
            C0(0, true);
        }
        A0();
        try {
            c5.d.b(0);
            if (rf.b.L().M()) {
                rf.b.L().O(n1());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean i() {
        if (!this.T8 && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap) {
            return true;
        }
        return false;
    }

    public final int i1(int i10, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f35768s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f35771s2.bottom) + AndroidUtilities.displaySize.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.f35630c2 != 1 && !z11) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f35646e0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.f35630c2 == 1) || i10 == 1) {
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

    public final void i2(ArrayList arrayList, int i10, int i11, boolean z10, ou0 ou0Var, un unVar) {
        boolean z11;
        org.telegram.ui.Components.s6 s6Var;
        this.f35674h2 = z10;
        li.w1 w1Var = this.S0;
        int i12 = 0;
        if (w1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
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
        if (i11 != 11 && this.f35747p5 != null) {
            this.f35803v7 = false;
            ImageView imageView = this.f35629c1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            au0 au0Var = this.f35830y5;
            if (au0Var != null) {
                au0Var.m(false, false);
            }
            this.f35747p5.b();
            ArrayList arrayList2 = this.f35765r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.e;
        BackgroundDrawable backgroundDrawable = this.L0;
        if (z12 && this.f35630c2 != i11 && i11 == 1) {
            this.f35630c2 = i11;
            this.f35789u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = ou0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f35743p1.l();
            this.f35697j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f35655f = true;
            r3(false, false);
            this.f35709l2 = false;
            I0();
            l3(false, false);
            this.f35649e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            U1();
            backgroundDrawable.setAlpha(255);
            this.f35646e0.setAlpha(1.0f);
            b2(null, null, null, null, null, null, arrayList, i10, null);
            G1();
            B2();
        } else if (z12 && this.f35630c2 != i11 && i11 == 11) {
            this.f35630c2 = i11;
            this.f35789u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = ou0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f35743p1.l();
            this.f35697j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f35655f = true;
            r3(false, false);
            this.f35649e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            U1();
            backgroundDrawable.setAlpha(255);
            this.f35646e0.setAlpha(1.0f);
            b2(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.f35630c2 = i11;
            if (i11 == 12) {
                this.f35630c2 = 0;
                this.f35639d2 = true;
            }
            int i13 = this.f35630c2;
            if (i13 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35658f2 = z11;
            if (i13 == 13 || z11) {
                this.f35630c2 = 0;
                this.f35648e2 = true;
            }
            this.f35608a.a(z11, false);
            if (this.f35630c2 == 11) {
                this.f35690j0.setBackgroundColor(-16777216);
            }
            nu0 nu0Var = this.M;
            if (nu0Var != null && (s6Var = nu0Var.d) != null) {
                if (this.f35648e2) {
                    i12 = 8;
                }
                s6Var.setVisibility(i12);
            }
            g2(null, null, null, null, null, null, arrayList, i10, ou0Var, unVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void i3() {
        float f7;
        boolean z10;
        int i10;
        nt0 nt0Var;
        int i11;
        nt0 nt0Var2;
        this.f35756q6 = null;
        this.P0.setVisibility(8);
        this.S0.setVisibility(8);
        this.f35724n0.setVisibility(8);
        this.f35647e1.setVisibility(8);
        this.f35657f1.setVisibility(8);
        this.f35665g1.setVisibility(8);
        org.telegram.ui.Components.of0 of0Var = this.C1;
        if (of0Var != null) {
            of0Var.setVisibility(4);
        }
        this.f35734o1.setVisibility(8);
        this.f35734o1.setAlpha(0.0f);
        this.f35734o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.O0.setRotationX(0.0f);
        this.f35734o1.setEnabled(false);
        this.K = false;
        if (this.f35683i2) {
            this.Q1.setVisibility(4);
        }
        int i12 = this.f35630c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.g7.size() > 1)) {
            this.N0.setVisibility(8);
            this.O0.setVisibility(8);
            u3();
        }
        Y2(false, true);
        c3(false, true);
        Bitmap bitmap = this.C4.getBitmap();
        float f10 = this.f35614a6;
        if (this.f35630c2 == 11) {
            this.f35687i6 = this.Y5;
            this.f35678h6 = this.X5;
            this.f35696j6 = f10;
            this.f35705k6 = this.f35624b6;
            this.f35662f6 = 0.0f;
        }
        fu0 fu0Var = this.X4;
        if (bitmap != null) {
            int bitmapWidth = this.C4.getBitmapWidth();
            int bitmapHeight = this.C4.getBitmapHeight();
            if (this.f35630c2 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.f35643d6 = dp;
                f7 = 0.0f;
                if (this.L1 != null) {
                    this.f35643d6 = (nt0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i13 = this.D1.f18808i;
                if (i13 == 90 || i13 == 270) {
                    i11 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f11 = bitmapWidth;
                    float f12 = i11;
                    this.f35652e6 = t2(false) * (Math.min(l1(3) / f11, i1(3, false) / f12) / Math.min(l1(this.f35791u4) / f11, j1() / f12));
                    Rect rect = this.f35771s2;
                    this.f35634c6 = (rect.left / 2) - (rect.right / 2);
                    this.f35730n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f112 = bitmapWidth;
                float f122 = i11;
                this.f35652e6 = t2(false) * (Math.min(l1(3) / f112, i1(3, false) / f122) / Math.min(l1(this.f35791u4) / f112, j1() / f122));
                Rect rect2 = this.f35771s2;
                this.f35634c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f35730n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f7 = 0.0f;
                int i14 = -AndroidUtilities.dp(44.0f);
                if (!this.f35768s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                float f13 = i14 + i10;
                this.f35643d6 = f13;
                if (this.L1 != null) {
                    float additionalTop = (nt0Var.getAdditionalTop() / 2.0f) + f13;
                    this.f35643d6 = additionalTop;
                    this.f35643d6 = additionalTop - (this.L1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = fu0Var.f39475c;
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
                    this.f35652e6 = t2(false) * (Math.min(l1(3) / f1122, i1(3, false) / f1222) / Math.min(l1(this.f35791u4) / f1122, j1() / f1222));
                    Rect rect22 = this.f35771s2;
                    this.f35634c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f35730n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f11222 = bitmapWidth;
                float f12222 = i11;
                this.f35652e6 = t2(false) * (Math.min(l1(3) / f11222, i1(3, false) / f12222) / Math.min(l1(this.f35791u4) / f11222, j1() / f12222));
                Rect rect222 = this.f35771s2;
                this.f35634c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f35730n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f7 = 0.0f;
        }
        nt0 nt0Var3 = this.L1;
        if (nt0Var3 != null) {
            if (this.f35630c2 == 11 && (fu0Var == null || fu0Var.f39475c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            nt0Var3.setDrawShadow(z10);
        }
        this.f35664g0.setClipChildren(true);
        this.f35690j0.setVisibility(4);
        this.f35748p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f7);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f7);
        ofFloat.addUpdateListener(new wq0(this, 6));
        ofFloat2.addUpdateListener(new wq0(this, 7));
        this.f35748p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.v6.f33583g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.L1.m0(true);
        this.f35748p6.setDuration(200L);
        this.f35748p6.addListener(new vs0(this, 3));
        this.f35748p6.start();
    }

    public final int j1() {
        return i1(this.f35791u4, false);
    }

    public final void j2() {
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            s81Var.B();
            return;
        }
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null) {
            vt0Var.f();
        }
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j3():void");
    }

    public final void k0(float f7, float f10, float f11, boolean z10) {
        if (this.f35614a6 == f7 && this.X5 == f10 && this.Y5 == f11) {
            return;
        }
        this.R6 = z10;
        this.f35652e6 = f7;
        this.f35634c6 = f10;
        this.f35643d6 = f11;
        this.f35730n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35748p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.v6.f33583g, 0.0f, 1.0f));
        this.f35748p6.setInterpolator(this.f35784t6);
        this.f35748p6.setDuration(250);
        this.f35748p6.addListener(new vs0(this, 7));
        this.f35748p6.start();
    }

    public final int k1() {
        return l1(this.f35791u4);
    }

    public final void k2() {
        sf.d dVar = this.G2;
        if (dVar != null) {
            dVar.b(true);
        }
        if (org.telegram.ui.Components.ch0.p() != null) {
            org.telegram.ui.Components.ch0.p().b(true);
        }
    }

    public final void k3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        d6.q e;
        d6.q e10;
        float f7;
        int i10;
        d6.q e11;
        boolean z10;
        if (!T1()) {
            return;
        }
        this.O8 = true;
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            if (!c5.d.u() && !this.f35759r) {
                z10 = false;
            } else {
                z10 = true;
            }
            s81Var.O(z10);
        }
        if (this.F2 != null && c5.d.u() && ((atomicInteger = c5.d.f6140b) == null || atomicInteger.get() <= 0)) {
            f6.h e12 = c5.d.e();
            if (e12 == null) {
                a2 = -1;
            } else {
                a2 = e12.a();
            }
            if (a2 >= 0 && Math.abs(this.F2.n() - a2) > 1000) {
                this.F2.K(a2);
            }
            f6.h e13 = c5.d.e();
            if (e13 == null) {
                m10 = false;
            } else if (c5.d.f6139a == 0) {
                m10 = !e13.l();
            } else {
                m10 = e13.m();
            }
            if (m10) {
                this.F2.C();
            } else {
                this.F2.B();
            }
            if (this.E != null) {
                float g7 = c5.d.g();
                f6.h e14 = c5.d.e();
                float f10 = 0.5f;
                if (e14 == null || (e10 = e14.e()) == null) {
                    f7 = 0.5f;
                } else {
                    f7 = (float) e10.f8123r;
                }
                if (Math.abs(g7 - f7) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.E.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = audioManager.getStreamMinVolume(3);
                    } else {
                        i10 = 0;
                    }
                    float f11 = streamMaxVolume - i10;
                    f6.h e15 = c5.d.e();
                    if (e15 != null && (e11 = e15.e()) != null) {
                        f10 = (float) e11.f8123r;
                    }
                    int i11 = i10 + ((int) (f10 * f11));
                    if (i11 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i11, 1);
                    }
                }
            }
            f6.h e16 = c5.d.e();
            float f12 = 1.0f;
            if (e16 != null && (e = e16.e()) != null) {
                f12 = (float) e.d;
            }
            E0(true, false, f12);
        }
        qr qrVar = this.f35806w0;
        if (qrVar != null) {
            qrVar.a(c5.d.u());
        }
        this.O8 = false;
    }

    public final CharSequence l0() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        if (T1() && this.d != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = g1().getText();
                boolean z10 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f35749p7 && !TextUtils.equals(this.f35757q7, text) && this.d.S(this.P4) != 0 && this.d.H() > 0) {
                    this.f35749p7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.T);
                un unVar = this.l4;
                if (unVar == null || ((encryptedChat = unVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z10 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10);
                CharSequence charSequence = charSequenceArr[0];
                this.f35757q7 = charSequence;
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
                    O2();
                }
                ou0 ou0Var = this.d;
                if (ou0Var != null) {
                    ou0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int l1(int i10) {
        int dp;
        int width = this.f35646e0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.f35630c2 != 1)) {
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

    public final void l2() {
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            s81Var.C();
            return;
        }
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null) {
            vt0Var.g();
        }
    }

    public final void l3(boolean z10, boolean z11) {
        m3(z10, z11, yt0.e);
    }

    public final void m0(Canvas canvas, int i10, int i11, int i12, int i13, float f7, ng.g gVar, MediaController.CropState cropState) {
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        int i15;
        float f14;
        float f15;
        float f16 = i10;
        int i16 = i12;
        float f17 = i16;
        float f18 = f16 / f17;
        float f19 = i11;
        int i17 = i13;
        float f20 = i17;
        float f21 = f19 / f20;
        float min = Math.min(f18, f21);
        int i18 = gVar.f18808i;
        if (i18 != 90 && i18 != 270) {
            i17 = i16;
            i16 = i17;
        }
        int i19 = this.f35630c2;
        if (i19 != 1 && (this.f35791u4 == 3 || this.f35739o6 == 3)) {
            f11 = 1.0f;
            f10 = f17;
        } else if (this.f35748p6 != null && (i14 = this.f35739o6) != -1) {
            int i20 = this.f35791u4;
            f10 = f17;
            if (i20 != 1 && i14 != 1 && ((i20 != 2 && i20 != 3) || i14 != -1)) {
                if (i14 == 0) {
                    f11 = this.f35712l6;
                } else {
                    f11 = 1.0f - this.f35712l6;
                }
            }
            f11 = 1.0f;
        } else {
            f10 = f17;
            int i21 = this.f35791u4;
            if (i21 == 2 || i21 == 3) {
                f11 = 0.0f;
            }
            f11 = 1.0f;
        }
        float f22 = gVar.f18809j;
        float f23 = gVar.f18810k;
        float f24 = i17;
        float f25 = 1.0f - f11;
        int C = (int) c3.h0.C(1.0f - f22, f25, f22, f24);
        float f26 = i16;
        int i22 = (int) ((((1.0f - f23) * f25) + f23) * f26);
        float f27 = C;
        float f28 = f16 / f27;
        float f29 = i22;
        if (f28 * f29 > f19) {
            f28 = f19 / f29;
        }
        if (i19 != 1 && ((this.f35791u4 != 1 || this.f35739o6 == 0) && cropState != null)) {
            float f30 = f27 * f28;
            float f31 = f29 * f28;
            if (f18 * f20 <= f19) {
                f21 = f18;
            }
            float z10 = c3.h0.z((f10 * f21) / f7, f30, f25, f30);
            float z11 = c3.h0.z((f20 * f21) / f7, f31, f25, f31);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        int i23 = this.f35630c2;
        if (i23 == 1 || gVar.f18803a) {
            int i24 = this.f35791u4;
            if (i24 != 1 && i23 != 1) {
                if (cropState != null) {
                    f14 = cropState.cropScale;
                    f15 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f15 = 1.0f;
                }
                f12 = ((f28 / min) / c3.h0.z(f14, f15, f25, f15)) * f14;
            } else {
                float z12 = gVar.f18806f / c3.h0.z(gVar.f18811l, 1.0f, f25, 1.0f);
                float f32 = f16 / f24;
                if (f32 * f26 > f19) {
                    f32 = f19 / f26;
                }
                float f33 = (f32 / min) * z12;
                if (i23 == 1) {
                    if (i24 != 3 && (i15 = this.f35739o6) != 3) {
                        if (i15 == 0) {
                            f13 = gVar.f18812m;
                        }
                    } else {
                        f13 = ((gVar.f18812m - 1.0f) * f25) + 1.0f;
                    }
                    f33 /= f13;
                }
                f12 = f33;
            }
            float f34 = f12;
            canvas.translate(gVar.d * f11, gVar.e * f11);
            canvas.scale(f34, f34);
            canvas.translate(c3.h0.E(gVar.f18804b, f24, min, f11), c3.h0.E(gVar.f18805c, f26, min, f11));
            float f35 = gVar.f18807g + i18;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            if (this.f35630c2 == 1 && (this.f35791u4 == 3 || this.f35739o6 == 3)) {
                canvas.rotate(f35);
            } else {
                canvas.rotate(f35 * f11);
            }
        }
        int[] iArr = this.N7;
        iArr[0] = C;
        iArr[1] = i22;
    }

    public final float m1(boolean z10) {
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
        if (!this.f35768s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.C1.getMeasuredWidth(), (this.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i10) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void m3(boolean r17, boolean r18, org.telegram.ui.yt0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m3(boolean, boolean, org.telegram.ui.yt0):void");
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0():void");
    }

    public final rf.g n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():rf.g");
    }

    public final void n2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.MediaController.SavedFilterState r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.MediaController$SavedFilterState, boolean, long):void");
    }

    public final void n3(boolean z10) {
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
        bi.j5 j5Var = this.P0;
        Property property = View.ALPHA;
        float f17 = 1.0f;
        float f18 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var, property, f7));
        bi.j5 j5Var2 = this.P0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var2, property2, f10));
        sg.p2 p2Var = this.f35747p5;
        if (p2Var != null) {
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(p2Var, property, f16));
        }
        if (this.f35747p5 != null) {
            di.h3 h3Var = this.f35774s5;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h3Var, property, f15));
        }
        li.w1 w1Var = this.S0;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var, property, f11));
        li.w1 w1Var2 = this.S0;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var2, property2, f12));
        int i10 = this.f35630c2;
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
        if (!z10 && J1()) {
            F0(true);
            fi.g gVar = this.U1.f11199f;
            if (gVar.e) {
                gVar.k(true);
            }
            fi.g gVar2 = this.V1.f11199f;
            if (gVar2.e) {
                gVar2.k(true);
            }
            this.U1.f11199f.d();
            this.V1.f11199f.d();
        }
    }

    public final void o0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o0(android.graphics.Bitmap):void");
    }

    public final org.telegram.messenger.VideoEditedInfo o1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void o2() {
        sg.p2 p2Var = this.f35747p5;
        if (p2Var != null && this.f35630c2 == 11) {
            if (this.f35803v7) {
                p2Var.b();
            } else {
                p2Var.m(this.C4.getBitmap(), this.C4.getOrientation(), l1(this.f35791u4), j1(), new dr0(this, 0));
            }
        }
    }

    public final void o3(boolean z10, boolean z11) {
        float f7;
        xq0 xq0Var = this.f35815x;
        AndroidUtilities.cancelRunOnUIThread(xq0Var);
        int i10 = 0;
        if (z11) {
            p3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f35805w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f35805w = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    p3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(xq0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f35805w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                p3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f35805w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f35805w = null;
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

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.N0.getVisibility() != 0) {
            boolean[] zArr = this.f35807w1;
            if (!zArr[0] && !zArr[1]) {
                float x9 = motionEvent.getX();
                int min = Math.min(135, this.f35646e0.getMeasuredWidth() / 8);
                if (x9 < min) {
                    if (this.B4.hasImageSet()) {
                        zArr[0] = true;
                        this.f35646e0.invalidate();
                        return false;
                    }
                } else if (x9 > this.f35646e0.getMeasuredWidth() - min && this.D4.hasImageSet()) {
                    zArr[1] = true;
                    this.f35646e0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f35614a6 != 1.0f && this.f35630c2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f7), Math.round(f10), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f35646e0.postInvalidate();
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

    public final void p0(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        MediaController.CropState cropState;
        if (this.f35748p6 != null) {
            f13 = AndroidUtilities.lerp(0.0f, this.f35670g6, this.f35712l6);
            f7 = AndroidUtilities.lerp(this.f35614a6, this.f35652e6, this.f35712l6);
            f10 = AndroidUtilities.lerp(this.f35624b6, this.f35662f6, this.f35712l6);
            f11 = AndroidUtilities.lerp(this.Y5, this.f35643d6, this.f35712l6);
            f12 = AndroidUtilities.lerp(this.X5, this.f35634c6, this.f35712l6);
        } else {
            f7 = this.f35614a6;
            f10 = this.f35624b6;
            f11 = this.Y5;
            f12 = this.X5;
            if (this.f35730n6 != 0) {
                f12 = this.f35634c6;
                f11 = this.f35643d6;
                f7 = this.f35652e6;
            }
            f13 = 0.0f;
        }
        int l1 = l1(this.f35791u4);
        int j12 = j1();
        canvas.translate(c1(this.f35791u4), d1(this.f35791u4));
        canvas.translate(f12, f11 + 0.0f);
        canvas.scale(f7, f7);
        canvas.rotate(f10);
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        float f18 = l1;
        float f19 = bitmapWidth;
        float f20 = f18 / f19;
        float f21 = j12;
        float f22 = bitmapHeight;
        float f23 = f21 / f22;
        float min = Math.min(f20, f23);
        ng.g gVar = this.D1;
        int i10 = gVar.f18808i;
        if (i10 != 90 && i10 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f24 = gVar.f18809j;
        float f25 = gVar.f18810k;
        float f26 = bitmapHeight;
        float f27 = bitmapWidth;
        float f28 = f7;
        float f29 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        float f30 = f18 / f29;
        float f31 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        if (f30 * f31 > f21) {
            f30 = f21 / f31;
        }
        int i11 = this.f35630c2;
        float f32 = f30;
        fu0 fu0Var = this.X4;
        if (i11 != 1 && ((this.f35791u4 != 1 || this.f35739o6 == 0) && fu0Var.f39475c != null)) {
            float f33 = f29 * f32;
            float f34 = f31 * f32;
            if (f20 * f22 > f21) {
                f20 = f23;
            }
            float z10 = c3.h0.z((f19 * f20) / f28, f33, 0.0f, f33);
            float z11 = c3.h0.z((f22 * f20) / f28, f34, 0.0f, f34);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.f35630c2 == 1 || gVar.f18803a) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                MediaController.CropState cropState2 = fu0Var.f39475c;
                if (cropState2 != null && cropState2.mirrored) {
                    f16 = -1.0f;
                } else {
                    f16 = 1.0f;
                }
                textureView.setScaleX(f16);
                hu0 hu0Var = this.E2;
                if (hu0Var != null) {
                    hu0Var.setScaleX(this.B2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = fu0Var.f39475c;
            if (cropState3 != null) {
                f14 = cropState3.cropScale;
                f15 = 1.0f;
            } else {
                f14 = 1.0f;
                f15 = 1.0f;
            }
            float z12 = ((f32 / min) / c3.h0.z(f14, f15, 0.0f, f15)) * f14;
            canvas.translate(gVar.d * f15, gVar.e * f15);
            canvas.scale(z12, z12);
            canvas.translate(c3.h0.E(gVar.f18804b, f26, min, f15), c3.h0.E(gVar.f18805c, f27, min, f15));
            float f35 = gVar.f18807g + i10;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            canvas.rotate(f35);
        }
        if (!this.g7.isEmpty() && (cropState = fu0Var.f39475c) != null && cropState.mirrored) {
            f17 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f17 = 1.0f;
        }
        if (f13 > 0.0f) {
            canvas.scale(f17 - (2.0f * f13), f17);
            canvas.skew(0.0f, org.telegram.messenger.t.A(f17, f13, 4.0f * f13, 0.25f));
        }
    }

    public final long p1() {
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null && vt0Var.f30582x) {
            return vt0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.n();
    }

    public final void p2(String str, long j10, boolean z10, float f7, float f10, int i10, long j11) {
        boolean z11;
        int parseInt;
        if (this.f35824x8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f35824x8);
            this.f35824x8 = null;
        }
        ls0 ls0Var = this.S7;
        ls0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        ls0Var.f27456y = mediaMetadataRetriever;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ls0Var.f27454w = z11;
        ls0Var.d = f7;
        ls0Var.e = f10;
        float f11 = ls0Var.f27453s;
        if (f11 < f7) {
            ls0Var.f27453s = f7;
        } else if (f11 > f10) {
            ls0Var.f27453s = f10;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                ls0Var.f27455x = open;
                ls0Var.f27456y.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = ls0Var.f27456y.extractMetadata(9);
            if (extractMetadata != null) {
                ls0Var.f27442a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = ls0Var.f27456y.extractMetadata(18);
            if (extractMetadata2 != null) {
                ls0Var.f27444b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = ls0Var.f27456y.extractMetadata(19);
            if (extractMetadata3 != null) {
                ls0Var.f27446c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = ls0Var.f27456y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = ls0Var.f27444b;
                ls0Var.f27444b = ls0Var.f27446c;
                ls0Var.f27446c = i12;
            }
            if (ls0Var.f27454w) {
                ls0Var.f27450f = (float) ((j11 / 1000.0d) / ls0Var.f27442a);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ls0Var.invalidate();
        this.f35833y8 = null;
        if (!z10 && this.f35630c2 != 1) {
            z12 = false;
        }
        this.f35759r = z12;
        this.Z7 = -1;
        this.f35626b8 = 0;
        this.f35698j8 = 25;
        this.f35795u8 = new File(str).length();
        DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
        wt0 wt0Var = new wt0(this, str, j10, i10);
        this.f35824x8 = wt0Var;
        dispatchQueue2.postRunnable(wt0Var);
    }

    public final void p3(boolean z10) {
        float f7;
        if (z10) {
            this.X0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35805w = animatorSet;
        ld ldVar = this.X0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ldVar, property, f7));
        this.f35805w.setDuration(200L);
        this.f35805w.addListener(new gt0(this, z10, 1));
        this.f35805w.start();
    }

    public final Size q0() {
        float f7;
        int i10;
        int round;
        int i11;
        if (this.Z7 == 1) {
            return new Size(this.f35636c8, this.f35645d8);
        }
        int i12 = this.Y7;
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
        if (this.f35636c8 > this.f35645d8) {
            i10 = this.f35636c8;
        } else {
            i10 = this.f35645d8;
        }
        float f10 = f7 / i10;
        if (this.Y7 == this.Z7 - 1 && f10 >= 1.0f) {
            i11 = this.f35636c8;
            round = this.f35645d8;
        } else {
            int round2 = Math.round((this.f35636c8 * f10) / 2.0f) * 2;
            round = Math.round((this.f35645d8 * f10) / 2.0f) * 2;
            i11 = round2;
        }
        int i13 = i11 % 4;
        if (i13 != 0 || round % 4 != 0) {
            i11 = (i11 - i13) - (round % 4);
        }
        return new Size(i11, round);
    }

    public final TLObject q1(int i10, long[] jArr) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f35653e7;
        if (!arrayList.isEmpty()) {
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
            }
            return (TLObject) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.f35615a7;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f35635c7;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.f35625b7;
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

    public final void q2(boolean z10) {
        int i10 = 0;
        this.D2 = false;
        sf.d dVar = this.G2;
        if (dVar != null) {
            dVar.c();
            this.G2 = null;
        }
        org.telegram.ui.Components.s81 s81Var = this.F2;
        HashMap hashMap = W8;
        ns0 ns0Var = this.f35818x2;
        if (s81Var != null) {
            v0();
            AndroidUtilities.cancelRunOnUIThread(this.f35808w2);
            AndroidUtilities.cancelRunOnUIThread(ns0Var);
            if (this.f35631c3 != null) {
                float n10 = ((float) this.F2.n()) / ((float) this.F2.p());
                String str = this.f35631c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new uu0(n10));
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
        if (this.f35656f0 != null) {
            AndroidUtilities.cancelRunOnUIThread(ns0Var);
            if (this.f35631c3 != null) {
                float p12 = ((float) p1()) / ((float) B1());
                String str2 = this.f35631c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new uu0(p12));
                MessageObject messageObject2 = this.T4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(p12);
                }
            }
        }
        at0 at0Var = this.W3;
        if (at0Var != null) {
            at0Var.disable();
            this.W3 = null;
        }
        this.f35772s3.a();
        o3(false, false);
        this.f35762r2 = false;
        this.U2 = false;
        if (this.f35796v0.isEnabled()) {
            this.f35796v0.setEnabled(false);
            this.f35796v0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f35675h3) {
            try {
                this.f35825y.getWindow().clearFlags(128);
                this.f35675h3 = false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ft0 ft0Var = this.f35828y2;
        if (ft0Var != null) {
            try {
                this.f35646e0.removeView(ft0Var);
            } catch (Throwable unused) {
            }
            this.f35828y2 = null;
        }
        t0();
        this.f35836z2 = null;
        TextureView textureView = this.B2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.h81) {
                org.telegram.ui.Components.h81 h81Var = (org.telegram.ui.Components.h81) textureView;
                org.telegram.ui.Components.e00 e00Var = h81Var.f28862b;
                if (e00Var != null) {
                    e00Var.postRunnable(new org.telegram.ui.Components.b00(e00Var, 0));
                }
                h81Var.f28861a = null;
            }
            this.B2 = null;
        }
        this.f35618b0.e();
        if (this.C2 != null) {
            this.C2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f35676h4);
        }
        if (!z10 && !this.B8 && !this.C8) {
            R2(false, true);
        }
        mu0 mu0Var = this.W0[0];
        while (true) {
            float[] fArr = mu0Var.f41666n;
            if (i10 < fArr.length) {
                mu0Var.f41665m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                mu0Var.a();
                return;
            }
        }
    }

    public final void q3(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i10 = this.f35630c2;
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

    public final boolean r0(MotionEvent motionEvent) {
        boolean z10;
        vt0 vt0Var;
        if (this.F2 != null || ((vt0Var = this.f35656f0) != null && vt0Var.f30582x)) {
            if (motionEvent.getX() >= (l1(this.f35791u4) / 3) * 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            long p12 = p1();
            long B1 = B1();
            if (p12 != -9223372036854775807L && B1 > 15000 && (!z10 || B1 - p12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final void r2(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f35833y8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f35833y8);
        }
        if (this.C8 && !this.f35842z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C8 = false;
        this.A8 = false;
        this.Q7.setVisibility(4);
        if (i10 == 1) {
            if (this.f35663f8 == this.f35645d8 && this.f35654e8 == this.f35636c8) {
                this.f35842z8 = false;
                mu0 mu0Var = this.W0[0];
                if (mu0Var.h != 0 && mu0Var.f41663k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                mu0Var.f(0.0f, z12);
                this.W0[0].d(3, false, true);
                if (!z10) {
                    n2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.F2.K(this.S7.getLeftProgress() * this.f35689i8);
                } else {
                    this.A8 = true;
                }
            } else {
                q2(false);
                if (this.f35833y8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f22048id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f35833y8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f35833y8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f35833y8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.f35626b8;
                    videoEditedInfo.originalWidth = this.f35636c8;
                    this.f35833y8.videoEditedInfo.originalHeight = this.f35645d8;
                    VideoEditedInfo videoEditedInfo2 = this.f35833y8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f35698j8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f35833y8.videoEditedInfo;
                long j10 = this.f35722m8;
                videoEditedInfo3.startTime = j10;
                long j11 = this.f35732n8;
                videoEditedInfo3.endTime = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f35689i8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    videoEditedInfo3.endTime = j10 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f35671g8;
                this.f35833y8.videoEditedInfo.resultWidth = this.f35654e8;
                this.f35833y8.videoEditedInfo.resultHeight = this.f35663f8;
                VideoEditedInfo videoEditedInfo4 = this.f35833y8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f35689i8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f35833y8, true, true, true)) {
                    this.f35842z8 = true;
                }
                this.C8 = true;
                mu0 mu0Var2 = this.W0[0];
                if (mu0Var2.h != 0 && mu0Var2.f41663k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                mu0Var2.f(0.0f, z11);
                this.W0[0].d(0, false, true);
            }
        } else {
            this.f35842z8 = false;
            this.W0[0].d(3, false, true);
            if (i10 == 2) {
                n2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.F2.K(this.S7.getLeftProgress() * this.f35689i8);
            }
        }
        this.f35646e0.invalidate();
    }

    public final void r3(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (z10 != this.K) {
            if (z10) {
                this.f35734o1.setVisibility(0);
            }
            this.K = z10;
            this.f35734o1.setEnabled(z10);
            float f13 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                wu0 wu0Var = this.f35734o1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wu0Var, property, f11));
                wu0 wu0Var2 = this.f35734o1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(wu0Var2, property2, f12));
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
                    this.B1.addListener(new vs0(this, 4));
                }
                this.B1.setDuration(200L);
                this.B1.start();
                return;
            }
            wu0 wu0Var3 = this.f35734o1;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            wu0Var3.setAlpha(f7);
            wu0 wu0Var4 = this.f35734o1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(10.0f);
            }
            wu0Var4.setTranslationY(f10);
            CounterView counterView2 = this.O0;
            if (!z10) {
                f13 = 0.0f;
            }
            counterView2.setRotationX(f13);
            if (!z10) {
                this.f35734o1.setVisibility(8);
            }
        }
    }

    public final boolean s0() {
        un unVar = this.l4;
        if (unVar != null) {
            if (unVar.f44245f == null) {
                TLRPC.Chat chat = unVar.e;
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

    public final String s1(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f35653e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(secureDocument.secureFile.dc_id);
                    sb2.append("_");
                    return a1.g.r(sb2, secureDocument.secureFile.f22164id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.f35615a7;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.Y6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.g7;
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
                ku0 ku0Var = this.f35697j7;
                if (ku0Var != null) {
                    return ku0Var.c(i10);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i10 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i10);
                    ImageLocation imageLocation2 = (ImageLocation) this.f35625b7.get(i10);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(imageLocation2.location.volume_id);
                            sb4.append("_");
                            return a1.g.n(imageLocation2.location.local_id, ".mp4", sb4);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(imageLocation.location.volume_id);
                        sb5.append("_");
                        return a1.g.n(imageLocation.location.local_id, ".jpg", sb5);
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

    public final float s2() {
        return t2(true);
    }

    public final void s3() {
        boolean z10;
        org.telegram.ui.Components.s81 s81Var;
        org.telegram.ui.Components.s81 s81Var2;
        vt0 vt0Var;
        org.telegram.ui.Components.s81 s81Var3 = this.F2;
        if (s81Var3 == null && ((vt0Var = this.f35656f0) == null || !vt0Var.f30582x)) {
            return;
        }
        if (s81Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f35656f0.G;
        }
        v0();
        AndroidUtilities.cancelRunOnUIThread(this.f35818x2);
        if (z10) {
            j2();
        } else {
            if (this.f35761r1) {
                if (Math.abs(this.S7.getProgress() - this.S7.getRightProgress()) < 0.01f || ((s81Var2 = this.F2) != null && s81Var2.n() == this.F2.p())) {
                    w2(this.S7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f35754q3.c() - this.S7.getRightProgress()) < 0.01f || ((s81Var = this.F2) != null && s81Var.n() == this.F2.p())) {
                    w2(0.0f);
                }
                u2();
            }
            l2();
        }
        this.f35646e0.invalidate();
    }

    public void setAnimationValue(float f7) {
        this.f35712l6 = f7;
        this.f35646e0.invalidate();
        H1();
    }

    public final void t0() {
        AnimatorSet animatorSet;
        View view = this.f35836z2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f35836z2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.A2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A2 = null;
        }
        org.telegram.ui.Components.of0 of0Var = this.C1;
        if (of0Var != null && (animatorSet = of0Var.f31290s) != null) {
            animatorSet.cancel();
            of0Var.f31290s = null;
            of0Var.f31287f = false;
        }
    }

    public final ImageLocation t1(int i10, long[] jArr) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f35653e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
                    }
                    return ImageLocation.getForSecureDocument((SecureDocument) arrayList.get(i10));
                }
            } else {
                ArrayList arrayList2 = this.f35615a7;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f35635c7;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (ImageLocation) this.f35625b7.get(i10);
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
                                    if (this.C5 == 5) {
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

    public final float t2(boolean z10) {
        int i10;
        if (this.f35630c2 == 11) {
            int l1 = l1(this.f35791u4);
            if (l1 == 0) {
                l1 = AndroidUtilities.displaySize.x;
            }
            float w10 = d3.w(20.0f, l1, 1) / l1;
            if (z10) {
                int bitmapWidth = this.C4.getBitmapWidth();
                int bitmapHeight = this.C4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i10 = this.P4) >= 0) {
                    ArrayList arrayList = this.g7;
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
                    return (bitmapWidth / bitmapHeight) * w10;
                }
            }
            return w10;
        }
        return 1.0f;
    }

    public final void t3() {
        View view = this.T3;
        if (view != null) {
            mu0 mu0Var = this.W0[0];
            int i10 = mu0Var.h;
            if (mu0Var.f41668p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
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

    public final void u0() {
        if (this.f35630c2 == 11) {
            au0 au0Var = this.f35783t5;
            if (au0Var.m0 == 2) {
                au0Var.setCutOutState(true);
                Z2(true, true);
                this.f35747p5.f();
                this.f35646e0.invalidate();
            }
        }
    }

    public final void u2() {
        if (!I1()) {
            MessageObject messageObject = this.T4;
            if (messageObject == null || !messageObject.isSponsored()) {
                ns0 ns0Var = this.f35818x2;
                AndroidUtilities.cancelRunOnUIThread(ns0Var);
                AndroidUtilities.runOnUIThread(ns0Var, 3000);
            }
        }
    }

    public final void u3() {
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
            nu0 nu0Var = this.M;
            ValueAnimator valueAnimator = nu0Var.f42004n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nu0Var.f42004n = null;
            }
            nu0Var.f42005r = f7;
            nu0Var.f42002c[0].setRightPadding((int) f7);
            nu0Var.d.setRightPadding(f7);
        }
    }

    public final void v0() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.I2 = null;
        }
    }

    public final int v1() {
        return this.f35771s2.left;
    }

    public final void v2(long j10) {
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null && vt0Var.f30582x) {
            vt0Var.i(j10);
        } else {
            org.telegram.ui.Components.s81 s81Var = this.F2;
            if (s81Var != null) {
                s81Var.K(j10);
            }
        }
        E3();
    }

    public final void v3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f35749p7) {
            charSequence = this.f35757q7;
        } else if (obj instanceof MediaController.PhotoEntry) {
            charSequence = ((MediaController.PhotoEntry) obj).caption;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof MediaController.SearchImage)) {
            charSequence = ((MediaController.SearchImage) obj).caption;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            g1().setText("");
        } else {
            g1().setText(org.telegram.ui.Components.c6.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.ju editText = g1().f11199f.getEditText();
        un unVar = this.l4;
        if (unVar != null && ((encryptedChat = unVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void w0() {
        float f7;
        org.telegram.ui.ActionBar.z zVar = this.A0;
        if (zVar != null) {
            if (this.f35658f2) {
                f7 = -AndroidUtilities.dp(4.0f);
            } else {
                f7 = 0.0f;
            }
            zVar.setTranslationX(f7);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.E0;
        if (w0Var != null) {
            K2(w0Var, this.f35658f2, false);
        }
        boolean z10 = this.f35648e2;
        if (z10 && this.I == null) {
            eh.d c10 = this.Y.c(this.G, null, false);
            c10.v(gh.c.i(this.f35798v2));
            c10.x(AndroidUtilities.dp(20.0f));
            c10.w(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = ih.d.f14315a;
            this.I = new ih.c(dp, dp2, c10);
        }
        if (z10) {
            org.telegram.ui.Components.gb1.b(this.G);
            this.G.setBackground(this.I);
            return;
        }
        this.G.setStateListAnimator(null);
        this.G.setBackground(this.H);
    }

    public final TLRPC.Document w1() {
        int i10;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f35794u7;
                }
            }
        }
        return null;
    }

    public final void w2(float f7) {
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            s81Var.K(f7 * ((float) s81Var.p()));
            return;
        }
        vt0 vt0Var = this.f35656f0;
        if (vt0Var != null) {
            vt0Var.i(f7 * vt0Var.getVideoDuration());
        }
    }

    public final void w3() {
        int i10 = org.telegram.ui.ActionBar.y6.zf;
        int A1 = A1(i10);
        li.w1 w1Var = this.S0;
        if (w1Var != null) {
            w1Var.k();
            this.S0.invalidate();
        }
        CheckBox checkBox = this.N0;
        if (checkBox != null) {
            checkBox.c(A1(i10), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(A1, mode);
        ImageView imageView = this.Y0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.Z0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f35629c1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f35629c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f35619b1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f35619b1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f35610a1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f35610a1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Components.og0 og0Var = this.U0;
        if (og0Var != null) {
            og0Var.f31295b.setTextColor(A1);
        }
        org.telegram.ui.Components.og0 og0Var2 = this.P7;
        if (og0Var2 != null) {
            og0Var2.f31295b.setTextColor(A1);
        }
        nt0 nt0Var = this.L1;
        if (nt0Var != null) {
            nt0Var.updateColors();
        }
        org.telegram.ui.Components.eg0 eg0Var = this.I1;
        if (eg0Var != null) {
            ImageView imageView6 = eg0Var.B0;
            ImageView imageView7 = eg0Var.A0;
            ImageView imageView8 = eg0Var.f27862z0;
            org.telegram.ui.ActionBar.u6 u6Var = eg0Var.I0;
            TextView textView = eg0Var.f27838g0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), mode));
            }
            eg0Var.h();
        }
        os0 os0Var = this.U1;
        if (os0Var != null) {
            os0Var.H(this.f35798v2);
        }
        ps0 ps0Var = this.V1;
        if (ps0Var != null) {
            ps0Var.H(this.f35798v2);
        }
        ls0 ls0Var = this.S7;
        if (ls0Var != null) {
            ls0Var.invalidate();
        }
        wu0 wu0Var = this.f35734o1;
        if (wu0Var != null) {
            int childCount = wu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f35734o1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) childAt).f24011c.b(org.telegram.ui.ActionBar.y6.W9, org.telegram.ui.ActionBar.y6.X9, org.telegram.ui.ActionBar.y6.V9);
                }
            }
        }
        es0 es0Var = this.U3;
        if (es0Var != null) {
            es0Var.B0(true);
        }
    }

    public final boolean x0() {
        if (this.f35728n4 != 0) {
            H1();
            if (Math.abs(this.f35737o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f35746p4;
                if (runnable != null) {
                    runnable.run();
                    this.f35746p4 = null;
                }
                this.f35728n4 = 0;
            }
        }
        if (this.f35728n4 == 0) {
            return false;
        }
        return true;
    }

    public final RenderNode x1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j10;
        if (this.K8 == null) {
            renderNode = null;
        } else {
            renderNode = this.L8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = ch.f.a(AndroidUtilities.dp(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a2, a2, Shader.TileMode.CLAMP));
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
        ch.a aVar = this.M8;
        aVar.f6297b = 0L;
        aVar.f6296a = false;
        for (float f7 : colorMatrix.getArray()) {
            aVar.c(f7);
        }
        aVar.a(0L);
        if (aVar.f6296a) {
            j10 = -1;
        } else {
            j10 = aVar.f6297b;
        }
        RenderNode renderNode2 = (RenderNode) this.N8.f(j10);
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

    public final int x2() {
        if (this.f35795u8 > 1048576000) {
            return this.Z7 - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i10 = this.Z7;
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

    public final void x3(boolean z10) {
        iu0 iu0Var;
        int i10;
        if (this.f35630c2 != 1 && (iu0Var = this.f35646e0) != null) {
            if (!z10) {
                if (iu0Var.getPaddingLeft() <= 0 && this.f35646e0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f35646e0.setSystemUiVisibility(i10);
        }
    }

    public final void y0(boolean z10) {
        View view;
        float x9;
        float y3;
        float f7;
        float f10;
        if (z10) {
            TextureView textureView = this.f35809w3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new i7(this, 6));
                this.f35809w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f35819x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f35819x3.setImageDrawable(null);
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
            ft0 ft0Var = this.f35828y2;
            if (ft0Var != null) {
                int[] iArr = this.A3;
                ft0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f35646e0.getTranslationY());
                ImageView imageView2 = this.f35819x3;
                Rect rect = this.f35771s2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f35828y2.getX());
                }
                hu0 hu0Var = this.E2;
                if (hu0Var != null) {
                    hu0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wq0(this, 4));
                if (this.D2) {
                    x9 = 0.0f;
                } else {
                    x9 = iArr[0] - this.f35828y2.getX();
                }
                if (this.D2) {
                    y3 = 0.0f;
                } else {
                    y3 = iArr[1] - this.f35828y2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f35819x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f35819x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f35819x3;
                Property property3 = View.TRANSLATION_X;
                if (this.D2) {
                    f7 = 0.0f;
                } else {
                    f7 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f7));
                ImageView imageView6 = this.f35819x3;
                Property property4 = View.TRANSLATION_Y;
                if (this.D2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f10));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x9));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y3));
                arrayList.add(ObjectAnimator.ofInt(this.L0, org.telegram.ui.Components.v6.d, 255));
                hu0 hu0Var2 = this.E2;
                if (hu0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(hu0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property3, x9));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property4, y3));
                }
                org.telegram.ui.Components.ch0.o(this.f35828y2.getAspectRatio(), false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new bh.b0(23, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new ur0(this, view, 0));
                animatorSet.start();
                yt0 yt0Var = new yt0();
                yt0Var.f46110c = false;
                yt0Var.d = false;
                yt0Var.f46108a = 250;
                yt0Var.f46109b = decelerateInterpolator;
                m3(true, true, yt0Var);
                this.G3 = 0;
            }
        }
    }

    public final int y1() {
        return this.f35771s2.right;
    }

    public final void y2(final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12, boolean z13) {
        long j10;
        int i12;
        VideoEditedInfo videoEditedInfo;
        String str;
        float f7;
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
        int i13;
        un unVar;
        org.telegram.ui.Components.e50 e50Var;
        String str2;
        long j11;
        String string;
        TextureView textureView;
        if (!J1() && this.d != null && !this.f35789u2) {
            if (this.f35630c2 == 1) {
                if (!z13 && (e50Var = this.f35735o2) != null) {
                    TLObject tLObject = e50Var.f27743a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j12 = user.f22176id;
                        str2 = str3;
                        j11 = j12;
                    } else {
                        str2 = "";
                        j11 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35646e0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.X0 = dp;
                    Context context = this.f35646e0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f39326a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f39327b = imageReceiver2;
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    view.e = new Path();
                    int i14 = UserConfig.selectedAccount;
                    j9Var.m(i14, UserConfig.getInstance(i14).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), j9Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), j9Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f39329f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f35735o2.f27743a;
                    iu0 iu0Var = this.f35646e0;
                    org.telegram.ui.Components.of0 of0Var = this.C1;
                    j9Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, j9Var);
                    view.f39328c = iu0Var;
                    view.d = of0Var;
                    e2Var.V = view;
                    if (this.f35735o2.f27745c == 1) {
                        if (UserConfig.getInstance(this.T).clientUserId == j11) {
                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage));
                        } else {
                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2));
                        }
                        if (this.I4) {
                            string = LocaleController.getString("SetVideo", R.string.SetVideo);
                        } else {
                            string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                        }
                    } else {
                        if (this.I4) {
                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2));
                        } else {
                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2));
                        }
                        string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                    }
                    String str4 = string;
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.voip.c1(15));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i15) {
                            Drawable[] drawableArr = PhotoViewer.U8;
                            PhotoViewer.this.y2(z10, i10, i11, z11, z12, true);
                        }
                    });
                    e2Var.I = org.telegram.ui.ActionBar.y6.f23588pg;
                    e2Var.V0 = true;
                    e2Var.j(i0.a.o(-15461356, 204));
                    e2Var.show();
                    e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23550ng, false));
                    e2Var.setOnDismissListener(new rs0(this));
                    if (this.f35761r1 && (textureView = this.B2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f35828y2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.B2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f35828y2.addView(this.E3);
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
                n0();
            }
            if (!z11 && (unVar = this.l4) != null) {
                TLRPC.Chat chat2 = unVar.e;
                if (unVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.T).edit().putBoolean("silent_" + this.l4.a(), !z10).commit();
                }
            }
            VideoEditedInfo o12 = o1();
            ArrayList arrayList = this.g7;
            if (!arrayList.isEmpty() && (i13 = this.P4) >= 0 && i13 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = o12;
                }
            }
            un unVar2 = this.l4;
            if (unVar2 != null && (chat = unVar2.e) != null) {
                if (!this.f35761r1 && o12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.vh.n(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.wc(this.f35646e0, this.f35798v2), null);
                    return;
                } else if (!z14 && !ChatObject.canSendPhoto(this.l4.e)) {
                    org.telegram.messenger.vh.n(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.wc(this.f35646e0, this.f35798v2), null);
                    return;
                }
            }
            this.f35789u2 = true;
            if (o12 != null) {
                long j13 = ((float) o12.estimatedSize) * 0.9f;
                if ((j13 > 2097152000 && !UserConfig.getInstance(this.T).isPremium()) || j13 > 4194304000L) {
                    if (this.a2 != null) {
                        org.telegram.ui.Components.ti tiVar = this.a2;
                        new tg.j0(6, UserConfig.selectedAccount, tiVar.getContainer().getContext(), tiVar.f33021f0, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.f35630c2 == 11) {
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
                        int l1 = l1(this.f35791u4);
                        j1();
                        float dp2 = l1 - AndroidUtilities.dp(20.0f);
                        sg.p2 p2Var = this.f35747p5;
                        if (p2Var != null && p2Var.f48448i0 && p2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            p0(canvas);
                            this.f35747p5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            p0(canvas);
                            this.C4.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            p0(canvas);
                            this.f35747p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            p0(canvas);
                            this.C4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f35829y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            p0(canvas);
                            canvas.translate((-this.C4.getImageWidth()) / 2.0f, (-this.C4.getImageHeight()) / 2.0f);
                            j10 = 0;
                            canvas.scale(this.C4.getImageWidth() / this.f35829y4.getMeasuredWidth(), this.C4.getImageHeight() / this.f35829y4.getMeasuredHeight());
                            this.f35829y4.e = !D1();
                            this.f35829y4.draw(canvas);
                            this.f35829y4.e = true;
                            canvas.restore();
                        } else {
                            j10 = 0;
                        }
                        if (D1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f17 = dp2 / 2.0f;
                            matrix.preTranslate(f17, f17);
                            if (this.f35748p6 != null) {
                                f14 = AndroidUtilities.lerp(0.0f, this.f35670g6, this.f35712l6);
                                f10 = AndroidUtilities.lerp(this.f35614a6, this.f35652e6, this.f35712l6);
                                f7 = 2.0f;
                                f11 = AndroidUtilities.lerp(this.f35624b6, this.f35662f6, this.f35712l6);
                                i12 = 0;
                                f12 = AndroidUtilities.lerp(this.Y5, this.f35643d6, this.f35712l6);
                                f13 = AndroidUtilities.lerp(this.X5, this.f35634c6, this.f35712l6);
                            } else {
                                i12 = 0;
                                f7 = 2.0f;
                                f10 = this.f35614a6;
                                f11 = this.f35624b6;
                                f12 = this.Y5;
                                f13 = this.X5;
                                if (this.f35730n6 != j10) {
                                    f13 = this.f35634c6;
                                    f12 = this.f35643d6;
                                    f10 = this.f35652e6;
                                }
                                f14 = 0.0f;
                            }
                            int l12 = l1(this.f35791u4);
                            int j14 = j1();
                            matrix.preTranslate(f13, f12 + 0.0f);
                            matrix.preScale(f10, f10);
                            matrix.preRotate(f11);
                            int bitmapWidth = this.C4.getBitmapWidth();
                            int bitmapHeight = this.C4.getBitmapHeight();
                            float f18 = l12;
                            float f19 = j14;
                            float min = Math.min(f18 / bitmapWidth, f19 / bitmapHeight);
                            ng.g gVar = this.D1;
                            int i15 = gVar.f18808i;
                            if (i15 != 90 && i15 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f20 = gVar.f18809j;
                            float f21 = gVar.f18810k;
                            float f22 = bitmapHeight;
                            float f23 = bitmapWidth;
                            float f24 = f18 / ((int) ((((1.0f - f20) * 0.0f) + f20) * f22));
                            float f25 = (int) ((((1.0f - f21) * 0.0f) + f21) * f23);
                            if (f24 * f25 > f19) {
                                f24 = f19 / f25;
                            }
                            int i16 = this.f35630c2;
                            fu0 fu0Var = this.X4;
                            if (i16 == 1 || gVar.f18803a) {
                                TextureView textureView2 = this.B2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = fu0Var.f39475c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f16 = -1.0f;
                                    } else {
                                        f16 = 1.0f;
                                    }
                                    textureView2.setScaleX(f16);
                                    hu0 hu0Var = this.E2;
                                    if (hu0Var != null) {
                                        hu0Var.setScaleX(this.B2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = fu0Var.f39475c;
                                if (cropState4 != null) {
                                    f15 = cropState4.cropScale;
                                } else {
                                    f15 = 1.0f;
                                }
                                float z15 = ((f24 / min) / c3.h0.z(f15, 1.0f, 0.0f, 1.0f)) * f15;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.e * 1.0f);
                                matrix.preScale(z15, z15);
                                matrix.preTranslate(c3.h0.E(gVar.f18804b, f22, min, 1.0f), c3.h0.E(gVar.f18805c, f23, min, 1.0f));
                                float f26 = gVar.f18807g + i15;
                                if (f26 > 180.0f) {
                                    f26 -= 360.0f;
                                }
                                matrix.preRotate(f26);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = fu0Var.f39475c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f14 > 0.0f) {
                                matrix.preScale(1.0f - (f14 * f7), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.t.A(1.0f, f14, 4.0f * f14, 0.25f));
                            }
                            matrix.preTranslate((-this.C4.getImageWidth()) / f7, (-this.C4.getImageHeight()) / f7);
                            matrix.preScale(this.C4.getImageWidth(), this.C4.getImageHeight());
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = photoEntry.mediaEntities;
                            int size = arrayList3.size();
                            int i17 = i12;
                            String str5 = null;
                            while (i17 < size) {
                                VideoEditedInfo.MediaEntity mediaEntity = arrayList3.get(i17);
                                i17++;
                                VideoEditedInfo.MediaEntity copy = mediaEntity.copy();
                                float f27 = copy.f19572x;
                                float f28 = copy.f19573y;
                                float f29 = copy.width + f27;
                                float f30 = copy.height + f28;
                                float f31 = dp2;
                                float[] fArr = new float[8];
                                fArr[i12] = f27;
                                fArr[1] = f28;
                                fArr[2] = f29;
                                fArr[3] = f28;
                                fArr[4] = f29;
                                fArr[5] = f30;
                                fArr[6] = f27;
                                fArr[7] = f30;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[i12] - fArr[2], 2.0d))) / f31;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[i12] - fArr[6], 2.0d))) / f31;
                                copy.height = sqrt;
                                copy.f19572x = (((fArr[i12] + fArr[4]) / f7) / f31) - (copy.width / f7);
                                copy.f19573y = (((fArr[1] + fArr[5]) / f7) / f31) - (sqrt / f7);
                                copy.scale = 1.0f;
                                copy.customTextView = true;
                                if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                    copy.rotation = (float) (copy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                                }
                                copy.rotation = (float) (copy.rotation - ((this.f35624b6 / 180.0f) * 3.141592653589793d));
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
                            i12 = 0;
                            videoEditedInfo = null;
                            str = null;
                        }
                        float f32 = 512;
                        String file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, Bitmap.CompressFormat.WEBP, f32, f32, 100, false, 101, 101), "webp", true).toString();
                        if (videoEditedInfo != null) {
                            videoEditedInfo.originalPath = file;
                        }
                        if (this.f35765r5 == null) {
                            this.f35765r5 = new ArrayList();
                        }
                        if (this.f35765r5.isEmpty()) {
                            String str6 = this.f35747p5.f48441c0;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f35765r5.add(this.f35747p5.f48441c0);
                            } else if (str != null) {
                                this.f35765r5.add(str);
                            } else {
                                this.f35765r5.add("👍");
                            }
                        }
                        this.f35789u2 = i12;
                        ft o10 = ft.o();
                        sg.p2 p2Var2 = this.f35747p5;
                        ArrayList arrayList4 = this.f35765r5;
                        ss0 ss0Var = new ss0(this, file, videoEditedInfo, photoEntry, z10, i10, i11, z12);
                        bt btVar = o10.U;
                        Activity findActivity = AndroidUtilities.findActivity(p2Var2.getContext());
                        if (findActivity != null) {
                            o10.u(findActivity);
                            o10.t(ss0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            o10.f39462o = arrayList4;
                            o10.r(null, importingSticker, null, null, null, 3, false, null, new di.b(), 0);
                            AndroidUtilities.cancelRunOnUIThread(btVar);
                            AndroidUtilities.runOnUIThread(btVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.P4, o12, z10, i10, i11, z12);
            } else {
                this.d.M(o12);
            }
            if (this.O) {
                if (this.P) {
                    AndroidUtilities.runOnUIThread(new pr0(this, 0), 200L);
                } else {
                    H0(false, false);
                }
            }
        }
    }

    public final void y3(float f7) {
        int l1;
        int j12;
        boolean z10;
        View view;
        ft0 ft0Var = this.f35828y2;
        if (ft0Var != null && ft0Var.getVisibility() == 0 && this.H3) {
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            f7 *= Math.min(l1(this.f35791u4) / view.getMeasuredWidth(), C1() / view.getMeasuredHeight());
        }
        float imageWidth = this.C4.getImageWidth();
        float imageHeight = this.C4.getImageHeight();
        MediaController.CropState cropState = this.X4.f39475c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.f35630c2 == 11) {
            l1 = (int) (imageWidth * f7);
        } else {
            l1 = ((int) ((imageWidth * f7) - l1(this.f35791u4))) / 2;
        }
        if (this.f35630c2 == 11) {
            j12 = (int) (imageHeight * f7);
        } else {
            j12 = ((int) ((imageHeight * f7) - j1())) / 2;
        }
        float f10 = 0.0f;
        if (l1 > 0) {
            this.E6 = -l1;
            this.F6 = l1;
        } else {
            this.F6 = 0.0f;
            this.E6 = 0.0f;
        }
        if (j12 > 0) {
            this.G6 = -j12;
            this.H6 = j12;
        } else {
            this.H6 = 0.0f;
            this.G6 = 0.0f;
        }
        nt0 nt0Var = this.L1;
        if (nt0Var != null) {
            if (f7 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = nt0Var.f48345m1;
            boolean z11 = !z10;
            if (nt0Var.N1 != z11) {
                nt0Var.N1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f10 = 1.0f;
                }
                org.telegram.messenger.vh.q(animate.alpha(f10), org.telegram.ui.Components.ds.h, 240L);
            }
        }
    }

    public final void z0() {
        qu0 qu0Var = this.f35642d5;
        if (qu0Var != null) {
            qu0Var.f42919a.setVisible(true, true);
        }
        ou0 ou0Var = this.d;
        qu0 qu0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (ou0Var != null) {
            MessageObject messageObject = this.T4;
            ImageLocation imageLocation = this.Z4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            qu0Var2 = ou0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f35642d5 = qu0Var2;
        if (qu0Var2 != null && !qu0Var2.f42934s) {
            qu0Var2.f42919a.setVisible(false, true);
        }
    }

    public final void z2(org.telegram.ui.Components.e50 e50Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f35735o2 = e50Var;
        if (this.f35630c2 == 1) {
            if (G3()) {
                this.f35724n0.setVisibility(0);
                this.S0.setVisibility(8);
            } else {
                this.S0.setVisibility(0);
                this.f35724n0.setVisibility(8);
            }
            if (e50Var != null && (user = e50Var.f27744b) != null && e50Var.f27745c == 1 && this.f35735o2.d) {
                if (e50Var.e) {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.C1.setSubtitle(null);
            }
        }
        if (e50Var != null) {
            if (e50Var.f27745c == 2) {
                if (e50Var.e) {
                    str = "SuggestVideo";
                    i10 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i10 = R.string.SuggestPhoto;
                }
                Q2(LocaleController.getString(str, i10));
            }
            if (e50Var.e) {
                this.T7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.F.setBackground(null);
            this.F.setElevation(2.0f);
        }
    }

    public final void z3() {
        boolean z10;
        org.telegram.ui.Components.s81 s81Var = this.F2;
        if (s81Var != null) {
            if (!c5.d.u() && !this.f35759r) {
                z10 = false;
            } else {
                z10 = true;
            }
            s81Var.O(z10);
        }
        if (!this.f35707k8) {
            this.f35647e1.setEnabled(false);
            this.f35647e1.setClickable(false);
            this.f35647e1.animate().alpha(0.5f).setDuration(180L).start();
            this.S7.setMode(0);
            return;
        }
        this.f35647e1.setEnabled(true);
        this.f35647e1.setClickable(true);
        this.f35647e1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f35759r) {
            if (this.f35650e4 == null) {
                this.M.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.cd0 cd0Var = this.f35638d1;
            cd0Var.e = true;
            cd0Var.invalidateSelf();
            if (this.f35691j1.getTag() != null) {
                this.f35691j1.setAlpha(0.5f);
                this.f35691j1.setEnabled(false);
            }
            if (this.f35630c2 == 1) {
                this.S7.setMaxProgressDiff(9600.0f / this.f35689i8);
                this.S7.setMode(1);
                D3();
                return;
            }
            this.S7.setMaxProgressDiff(1.0f);
            this.S7.setMode(0);
            return;
        }
        this.M.a(this.D8, true);
        org.telegram.ui.Components.cd0 cd0Var2 = this.f35638d1;
        cd0Var2.e = false;
        cd0Var2.invalidateSelf();
        if (this.f35691j1.getTag() != null) {
            this.f35691j1.setAlpha(1.0f);
            this.f35691j1.setEnabled(true);
        }
        this.S7.setMaxProgressDiff(1.0f);
        this.S7.setMode(0);
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
