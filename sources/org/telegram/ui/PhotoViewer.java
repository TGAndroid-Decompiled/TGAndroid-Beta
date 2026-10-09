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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.z20, org.telegram.ui.Components.y20, sf.a, me.d {
    public static Drawable[] U8;
    public static final Paint V8 = new Paint(2);
    public static final HashMap W8 = new HashMap();
    public static DecelerateInterpolator X8;
    public static Paint Y8;
    public static final Property Z8;
    public static volatile PhotoViewer f33863a9;
    public static volatile PhotoViewer f33864b9;
    public org.telegram.ui.ActionBar.z A0;
    public org.telegram.ui.Components.pp0 A1;
    public AnimatorSet A2;
    public final int[] A3;
    public org.telegram.ui.Components.he0 A4;
    public boolean A5;
    public float A6;
    public ObjectAnimator A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.v0 B0;
    public AnimatorSet B1;
    public TextureView B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public int B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.Components.vf0 C1;
    public SurfaceView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public NotificationCenter.ObserversGroup C7;
    public boolean C8;
    public org.telegram.ui.ActionBar.v0 D0;
    public final lg.g D1;
    public boolean D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public String D8;
    public ContextThemeWrapper E;
    public org.telegram.ui.ActionBar.v0 E0;
    public lg.g E1;
    public vu0 E2;
    public ImageView E3;
    public org.telegram.ui.Components.ra E4;
    public long E5;
    public float E6;
    public float E7;
    public final org.telegram.ui.Components.g6 E8;
    public org.telegram.ui.Components.a8 F;
    public org.telegram.ui.ActionBar.f1 F0;
    public lg.g F1;
    public org.telegram.ui.Components.k81 F2;
    public boolean F3;
    public org.telegram.ui.Components.ra F4;
    public zg.n0 F5;
    public float F6;
    public final ir0 F7;
    public org.telegram.ui.Components.g6[] F8;
    public ImageView G;
    public org.telegram.ui.Components.v7 G0;
    public MediaController.CropState G1;
    public qf.e G2;
    public int G3;
    public org.telegram.ui.Components.ra G4;
    public String G5;
    public float G6;
    public Path G7;
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
    public RectF H8;
    public gh.c I;
    public k91 I0;
    public org.telegram.ui.Components.kg0 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public Paint I7;
    public Matrix I8;
    public boolean J;
    public vr J0;
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
    public ci.h4 K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public LinearGradient K7;
    public RenderNode K8;
    public AnimatorSet L;
    public final BackgroundDrawable L0;
    public bu0 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public RenderNode L8;
    public bv0 M;
    public final Paint M0;
    public boolean M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Matrix M7;
    public final ah.a M8;
    public zu0 N;
    public CheckBox N0;
    public au0 N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public final int[] N7;
    public final a0.i N8;
    public boolean O;
    public CounterView O0;
    public boolean O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public gv0 O7;
    public boolean O8;
    public boolean P;
    public t5 P0;
    public org.telegram.ui.ActionBar.b2 P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public org.telegram.ui.Components.ug0 P7;
    public View P8;
    public ws0 Q;
    public FrameLayout Q0;
    public su0 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public RadialProgressView Q7;
    public com.google.android.gms.internal.cast.p Q8;
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
    public ii.z1 S0;
    public TextView S1;
    public org.telegram.ui.Components.k81 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public ys0 S7;
    public boolean S8;
    public int T;
    public org.telegram.ui.Components.mg0 T0;
    public cu0 T1;
    public SurfaceTexture T2;
    public View T3;
    public MessageObject T4;
    public boolean T5;
    public int T6;
    public TextView T7;
    public boolean T8;
    public int U;
    public org.telegram.ui.Components.ug0 U0;
    public bt0 U1;
    public boolean U2;
    public rs0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public AnimatorSet U7;
    public int V;
    public TextView V0;
    public ct0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public float W;
    public final av0[] W0;
    public float W1;
    public boolean W2;
    public nt0 W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public org.telegram.ui.ActionBar.b5 X;
    public kd X0;
    public k0 X1;
    public boolean X2;
    public int X3;
    public final tu0 X4;
    public float X5;
    public final SparseArray[] X6;
    public long X7;
    public ah.c Y;
    public ImageView Y0;
    public FrameLayout Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public qe.b Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public ImageLocation Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public volatile int Z7;
    public final me.b f33865a = new me.b(0, this, org.telegram.ui.Components.hs.h, 380, false);
    public qe.b f33866a0;
    public ImageView f33867a1;
    public org.telegram.ui.Components.yi a2;
    public float f33868a3;
    public final org.telegram.ui.Cells.h1 f33869a4;
    public ImageLocation f33870a5;
    public float f33871a6;
    public final ArrayList f33872a7;
    public int f33873a8;
    public final boolean f33874b;
    public org.telegram.ui.Components.ma f33875b0;
    public ImageView f33876b1;
    public yf.j0 f33877b2;
    public String f33878b3;
    public final VideoFramesRewinder f33879b4;
    public SecureDocument f33880b5;
    public float f33881b6;
    public final ArrayList f33882b7;
    public int f33883b8;
    public int f33884c;
    public org.telegram.ui.Components.qa f33885c0;
    public ImageView f33886c1;
    public int f33887c2;
    public String f33888c3;
    public final kt0 f33889c4;
    public final String[] f33890c5;
    public float f33891c6;
    public final ArrayList f33892c7;
    public volatile int f33893c8;
    public cv0 d;
    public WindowManager.LayoutParams f33894d0;
    public org.telegram.ui.Components.kd0 f33895d1;
    public boolean f33896d2;
    public long f33897d3;
    public final org.telegram.ui.Cells.d2 f33898d4;
    public ev0 f33899d5;
    public float f33900d6;
    public final ArrayList f33901d7;
    public volatile int f33902d8;
    public boolean f33903e;
    public wu0 f33904e0;
    public org.telegram.ui.ActionBar.k0 f33905e1;
    public boolean f33906e2;
    public float f33907e3;
    public CharSequence f33908e4;
    public String f33909e5;
    public float f33910e6;
    public final ArrayList e7;
    public volatile int f33911e8;
    public boolean f33912f;
    public ju0 f33913f0;
    public org.telegram.ui.Components.ga0 f33914f1;
    public boolean f33915f2;
    public boolean f33916f3;
    public boolean f33917f4;
    public long f33918f5;
    public float f33919f6;
    public final ArrayList f7;
    public volatile int f33920f8;
    public dv0 f33921g0;
    public zs0 f33922g1;
    public boolean f33923g2;
    public long f33924g3;
    public boolean f33925g4;
    public String f33926g5;
    public float f33927g6;
    public final ArrayList f33928g7;
    public volatile int f33929g8;
    public int h;
    public ClippingImageView f33930h0;
    public ArrayList f33931h1;
    public boolean f33932h2;
    public boolean f33933h3;
    public final at0 f33934h4;
    public boolean f33935h5;
    public float f33936h6;
    public ImageLocation f33937h7;
    public volatile int f33938h8;
    public ai.x5 f33939i0;
    public ArrayList f33940i1;
    public boolean f33941i2;
    public lv0 f33942i3;
    public final at0 f33943i4;
    public TL_iv.PageBlock f33944i5;
    public float f33945i6;
    public hv0 f33946i7;
    public float f33947i8;
    public View f33948j0;
    public org.telegram.ui.Components.x71 f33949j1;
    public org.telegram.ui.Components.f6 f33950j2;
    public String j3;
    public final y70 f33951j4;
    public ImageReceiver.BitmapHolder f33952j5;
    public float f33953j6;
    public yu0 f33954j7;
    public int f33955j8;
    public int f33956k0;
    public ci.d4 f33957k1;
    public boolean f33958k2;
    public ValueAnimator f33959k3;
    public final float[][] f33960k4;
    public boolean f33961k5;
    public float f33962k6;
    public final Rect f33963k7;
    public volatile boolean f33964k8;
    public TextView f33965l0;
    public org.telegram.ui.Components.m40 l1;
    public boolean f33966l2;
    public boolean f33967l3;
    public zn l4;
    public boolean f33968l5;
    public float f33969l6;
    public final AnimationNotificationsLocker f33970l7;
    public volatile boolean f33971l8;
    public TextView m0;
    public org.telegram.ui.Components.d31 f33972m1;
    public boolean f33973m2;
    public final int[] f33974m3;
    public org.telegram.ui.ActionBar.n2 f33975m4;
    public boolean f33976m5;
    public float f33977m6;
    public ib0 f33978m7;
    public long f33979m8;
    public boolean f33980n;
    public TextView f33981n0;
    public UndoView f33982n1;
    public boolean f33983n2;
    public final int[] f33984n3;
    public int f33985n4;
    public boolean f33986n5;
    public long f33987n6;
    public org.telegram.ui.Components.tc f33988n7;
    public long f33989n8;
    public org.telegram.ui.ActionBar.v0 f33990o0;
    public kv0 f33991o1;
    public org.telegram.ui.Components.k50 f33992o2;
    public org.telegram.ui.ActionBar.j5 f33993o3;
    public long f33994o4;
    public String f33995o5;
    public int f33996o6;
    public int f33997o7;
    public float f33998o8;
    public org.telegram.ui.ActionBar.v0 f33999p0;
    public xu0 f34000p1;
    public boolean f34001p2;
    public ImageView f34002p3;
    public Runnable f34003p4;
    public qg.o2 p5;
    public AnimatorSet f34004p6;
    public boolean f34005p7;
    public float f34006p8;
    public org.telegram.ui.ActionBar.f1 f34007q0;
    public ImageReceiver f34008q1;
    public MessagesController.DialogPhotos f34009q2;
    public org.telegram.ui.Components.m81 f34010q3;
    public ev0 f34011q4;
    public org.telegram.ui.Components.lg0 f34012q5;
    public AnimatorSet q6;
    public CharSequence f34013q7;
    public long f34014q8;
    public boolean f34015r;
    public org.telegram.ui.ActionBar.b1 f34016r0;
    public boolean f34017r1;
    public boolean f34018r2;
    public q50 f34019r3;
    public ev0 f34020r4;
    public ArrayList f34021r5;
    public org.telegram.ui.Components.a30 f34022r6;
    public boolean f34023r7;
    public long f34024r8;
    public boolean f34025s;
    public org.telegram.ui.ActionBar.f1 f34026s0;
    public final ir0 f34027s1;
    public final Rect f34028s2;
    public mt0 f34029s3;
    public boolean f34030s4;
    public ai.o4 f34031s5;
    public boolean f34032s6;
    public ValueAnimator f34033s7;
    public long f34034s8;
    public org.telegram.ui.ActionBar.f1 f34035t0;
    public float f34036t1;
    public boolean f34037t2;
    public AnimatorSet f34038t3;
    public boolean f34039t4;
    public ou0 f34040t5;
    public final DecelerateInterpolator f34041t6;
    public TLRPC.Document f34042t7;
    public long f34043t8;
    public org.telegram.ui.ActionBar.k1 f34044u0;
    public long f34045u1;
    public boolean f34046u2;
    public boolean f34047u3;
    public int f34048u4;
    public LinearLayout f34049u5;
    public float f34050u6;
    public TLRPC.Document f34051u7;
    public long f34052u8;
    public int v;
    public org.telegram.ui.ActionBar.f1 f34053v0;
    public final GradientDrawable[] f34054v1;
    public org.telegram.ui.ActionBar.e6 f34055v2;
    public int f34056v3;
    public final ir0 f34057v4;
    public ou0 f34058v5;
    public float f34059v6;
    public boolean f34060v7;
    public long f34061v8;
    public AnimatorSet f34062w;
    public xr f34063w0;
    public final boolean[] f34064w1;
    public final us0 f34065w2;
    public TextureView f34066w3;
    public int f34067w4;
    public ou0 f34068w5;
    public float f34069w6;
    public boolean f34070w7;
    public float f34071w8;
    public final ir0 f34072x;
    public LinearLayout f34073x0;
    public final float[] f34074x1;
    public final at0 f34075x2;
    public ImageView f34076x3;
    public String f34077x4;
    public ou0 f34078x5;
    public float f34079x6;
    public Utilities.Callback2 f34080x7;
    public ku0 f34081x8;
    public Activity f34082y;
    public final ArrayList f34083y0;
    public int f34084y1;
    public tt0 f34085y2;
    public final ImageView[] y3;
    public org.telegram.ui.Components.he0 f34086y4;
    public ou0 f34087y5;
    public float f34088y6;
    public final float[] f34089y7;
    public MessageObject f34090y8;
    public org.telegram.ui.ActionBar.k1 f34091z0;
    public org.telegram.ui.Components.b81 f34092z1;
    public View f34093z2;
    public boolean f34094z3;
    public org.telegram.ui.Components.he0 f34095z4;
    public long f34096z5;
    public float f34097z6;
    public final float[] f34098z7;
    public boolean f34099z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f34100g = 0;
        public final RectF f34101a;
        public final RectF f34102b;
        public final Paint f34103c;
        public rt0 d;
        public boolean f34104e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f34101a = new RectF();
            this.f34102b = new RectF();
            Paint paint = new Paint(1);
            this.f34103c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            ib0 ib0Var = photoViewer.f33978m7;
            if (ib0Var != null) {
                ib0Var.a(!this.f34104e);
            }
            yf.j0 j0Var = photoViewer.f33877b2;
            if (j0Var != null) {
                j0Var.a(!this.f34104e);
            }
            org.telegram.ui.Components.yi yiVar = photoViewer.a2;
            if (yiVar != null) {
                boolean z11 = this.f34104e;
                yiVar.B0.l(yiVar.f33256o2);
                if (yiVar.f33276u2 != z11) {
                    yiVar.f33276u2 = z11;
                    org.telegram.ui.Components.qi qiVar = yiVar.B0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33240j0;
                    if (qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f24043i1) {
                        if (z11 && !yiVar.f33279v2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f24050n && !chatAttachAlertPhotoLayout.O0) {
                            if (z10) {
                                org.telegram.ui.Components.um umVar = chatAttachAlertPhotoLayout.P;
                                if (umVar != null) {
                                    chatAttachAlertPhotoLayout.f24053o0 = Boolean.valueOf(umVar.isFrontface());
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
            rt0 rt0Var;
            ev0 ev0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.T8) {
                if (photoViewer.f33985n4 != 0 && !AndroidUtilities.isTablet() && (ev0Var = photoViewer.f33899d5) != null && ev0Var.f37366m != null) {
                    ClippingImageView clippingImageView = photoViewer.f33930h0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f34102b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f24117b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f24118c;
                    rectF.bottom = scaleY - clippingImageView.f24116a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f7 = bounds.right;
                        float f10 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f34101a;
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
                            canvas.drawRect(rectF2, this.f34103c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (rt0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(rt0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f34082y instanceof LaunchActivity) {
                if (photoViewer.f33903e && i10 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f34104e = z10;
                if (z10) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new nu0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f34103c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f34106a;
        public final TextPaint f34107b;
        public final Paint f34108c;
        public int d;
        public int f34109e;
        public final RectF f34110f;
        public int h;
        public float f34111n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f34107b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f34108c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f34110f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f34107b;
            this.f34106a = new StaticLayout("" + Math.max(1, i10), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f34109e = this.f34106a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f34108c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.s6 s6Var = org.telegram.ui.Components.u6.f31379b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, s6Var, 0), ObjectAnimator.ofInt(textPaint, s6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.s6 s6Var2 = org.telegram.ui.Components.u6.f31379b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, s6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, s6Var2, 0, 255));
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
            return this.f34111n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f34108c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f34110f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f34106a != null) {
                this.f34107b.setAlpha((int) ((1.0f - this.f34111n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f34111n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.f34109e) / 2));
                this.f34106a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f34111n * 255.0f));
                int centerX = (int) rectF.centerX();
                int b10 = (int) com.google.android.gms.internal.vision.e2.b(1.0f, this.f34111n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
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
            this.f34111n = f7;
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
            Z8 = new hs0();
        } else {
            Z8 = new org.telegram.ui.Cells.d1(Float.class, "progress", 3);
        }
        f33863a9 = null;
        f33864b9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33874b = z10;
        this.h = -1;
        this.f33980n = true;
        this.f34072x = new ir0(this, 20);
        this.J = true;
        this.O = true;
        this.P = false;
        this.Z = new qe.b();
        this.f34083y0 = new ArrayList();
        this.K0 = new HashMap(3);
        this.L0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.M0 = paint;
        this.W0 = new av0[3];
        this.f34027s1 = new ir0(this, 21);
        this.f34054v1 = new GradientDrawable[2];
        this.f34064w1 = new boolean[2];
        this.f34074x1 = new float[2];
        this.D1 = new Object();
        this.E1 = new Object();
        this.F1 = new Object();
        this.W1 = -8.0f;
        this.f34028s2 = new Rect();
        this.f34065w2 = new us0(this);
        this.f34075x2 = new at0(this, 0);
        this.f33967l3 = true;
        this.f33974m3 = new int[2];
        this.f33984n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f33869a4 = new org.telegram.ui.Cells.h1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f33879b4 = videoFramesRewinder;
        this.f33889c4 = new kt0(this, videoFramesRewinder);
        this.f33898d4 = new org.telegram.ui.Cells.d2(this);
        this.f33934h4 = new at0(this, 1);
        this.f33943i4 = new at0(this, 2);
        this.f33951j4 = new y70(this, 1);
        this.f33960k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f34057v4 = new ir0(this, 22);
        this.B4 = new ImageReceiver();
        this.C4 = new ai.m4(this, 5);
        this.D4 = new ImageReceiver();
        this.E4 = new org.telegram.ui.Components.ra(1, new ir0(this, 23));
        this.F4 = new org.telegram.ui.Components.ra(1, new ir0(this, 23));
        this.G4 = new org.telegram.ui.Components.ra(1, new ir0(this, 23));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f33890c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f33871a6 = 1.0f;
        this.f33881b6 = 0.0f;
        this.f33996o6 = -1;
        this.f34041t6 = new DecelerateInterpolator(1.5f);
        this.f34069w6 = 1.0f;
        this.f34079x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f33872a7 = new ArrayList();
        this.f33882b7 = new ArrayList();
        this.f33892c7 = new ArrayList();
        this.f33901d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.f33928g7 = new ArrayList();
        this.f33937h7 = null;
        this.f33946i7 = null;
        this.f33963k7 = new Rect();
        this.f33970l7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f34089y7 = new float[]{1.0f};
        this.f34098z7 = new float[]{1.0f};
        this.F7 = new ir0(this, 24);
        this.N7 = new int[2];
        this.V7 = -1L;
        this.W7 = -1L;
        this.X7 = -1L;
        this.Z7 = -1;
        this.E8 = new org.telegram.ui.Components.g6(new ir0(this, 23), 180L, org.telegram.ui.Components.hs.f27119g);
        this.M8 = new Object();
        this.N8 = new a0.i();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.setFileLoadingPriority(3);
    }

    public static void D(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.k81 k81Var;
        MessageObject messageObject;
        boolean z11;
        wu0 wu0Var = photoViewer.f33904e0;
        photoViewer.f33894d0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f34082y.getSystemService("window")).updateViewLayout(photoViewer.f33921g0, photoViewer.f33894d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        zn znVar = photoViewer.l4;
        if (znVar != null && znVar.Y != null && znVar.getFragmentView() != null) {
            ok okVar = photoViewer.l4.Y;
            if (okVar.f23996z2) {
                okVar.q1();
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.l4.getParentActivity(), photoViewer.f33884c);
            photoViewer.l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (k81Var = photoViewer.F2) != null && k81Var.n() > 1500 && (messageObject = photoViewer.T4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.F2.n() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.T).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                a1.g.A(sb2, MessagesController.getInstance(photoViewer.T).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject2.getId());
                str = sb2.toString();
            }
        }
        gt0 gt0Var = new gt0(photoViewer, photoViewer.f34082y, photoViewer.l4, arrayList, str, num, wu0Var, z10);
        gt0Var.setFocusable(false);
        gt0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new tf0(25, photoViewer, gt0Var), 250L);
        gt0Var.show();
    }

    public static boolean D1() {
        if (f33863a9 != null) {
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
            photoViewer.f33946i7 = new hv0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            mu0 mu0Var = new mu0();
            mu0Var.f39989c = false;
            photoViewer.k3(false, true, mu0Var);
            AndroidUtilities.runOnUIThread(new tr0(photoViewer, file, z10, messageObject, z11, z12), mu0Var.f39987a);
            return;
        }
        photoViewer.U2();
    }

    public static void G(org.telegram.ui.PhotoViewer r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap I0(android.graphics.Bitmap r16, org.telegram.messenger.MediaController.CropState r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.I0(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean K1(MessageObject messageObject) {
        if (f33863a9 != null && !f33863a9.B3 && f33863a9.f33903e && messageObject != null && f33863a9.T4 != null && f33863a9.T4.getId() == messageObject.getId() && f33863a9.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean L1(MessageObject messageObject) {
        if (f33864b9 != null && messageObject != null && f33864b9.T4 != null && f33864b9.T4.getId() == messageObject.getId() && f33864b9.T4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean M1(String str) {
        if (f33863a9 != null && f33863a9.f33903e && !f33863a9.f34030s4 && str != null && str.equals(f33863a9.f33909e5)) {
            return true;
        }
        return false;
    }

    public static boolean N1(MessageObject messageObject) {
        boolean z10;
        if (f33863a9 != null && !f33863a9.B3 && f33863a9.f33903e && !f33863a9.f34030s4 && messageObject != null) {
            MessageObject messageObject2 = f33863a9.T4;
            if (messageObject2 == null && f33863a9.d != null) {
                messageObject2 = f33863a9.d.U();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z10 = true;
                if (z10 && f33864b9 != null) {
                    if (f33864b9.f33903e && !f33864b9.f34030s4 && messageObject != null && f33864b9.T4 != null && f33864b9.T4.getId() == messageObject.getId() && f33864b9.T4.getDialogId() == messageObject.getDialogId()) {
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

    public static boolean O1(TLRPC.BotInlineResult botInlineResult) {
        if (f33863a9 != null && f33863a9.f33903e && !f33863a9.f34030s4 && botInlineResult != null && f33863a9.Y4 != null && botInlineResult.f20036id == f33863a9.Y4.f20036id) {
            return true;
        }
        return false;
    }

    public static boolean P1(TLRPC.FileLocation fileLocation) {
        if (f33863a9 != null && f33863a9.f33903e && !f33863a9.f34030s4 && fileLocation != null) {
            if (f33863a9.Z4 == null || fileLocation.local_id != f33863a9.Z4.location.local_id || fileLocation.volume_id != f33863a9.Z4.location.volume_id || fileLocation.dc_id != f33863a9.Z4.dc_id) {
                if (f33863a9.f33870a5 != null && fileLocation.local_id == f33863a9.f33870a5.location.local_id && fileLocation.volume_id == f33863a9.f33870a5.location.volume_id && fileLocation.dc_id == f33863a9.f33870a5.dc_id) {
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
            if (photoViewer.f33986n5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b51.D())) {
                photoViewer.A2(messageObject, k2(messageObject), false, true);
            } else {
                photoViewer.A2(messageObject, messageObject.caption, photoViewer.f33986n5, true);
            }
        }
    }

    public static void V(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.V7 != -1 && (textureView = photoViewer.B2) != null) {
            photoViewer.V7 = -1L;
            photoViewer.f34093z2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.hs.f27121j).setDuration(85L).setListener(new org.telegram.ui.Components.ul0(9, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void W(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W(org.telegram.ui.PhotoViewer):void");
    }

    public static void X(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.m81 m81Var = photoViewer.f34010q3;
        if (m81Var.f28757f) {
            i10 = m81Var.d;
        } else {
            i10 = m81Var.f28754b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.m81.S / 2) + i10)) - (photoViewer.f34029s3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f33942i3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f34029s3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            mt0 mt0Var = photoViewer.f34029s3;
            mt0Var.setPivotX(Utilities.clamp((mt0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f34029s3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            mt0 mt0Var2 = photoViewer.f34029s3;
            mt0Var2.setPivotX(Utilities.clamp((mt0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f34029s3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            mt0 mt0Var3 = photoViewer.f34029s3;
            mt0Var3.setPivotX(mt0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f34029s3.setTranslationX(dp);
    }

    public static void Y(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.ck0 lottieAnimation;
        tu0 tu0Var = photoViewer.X4;
        ArrayList arrayList = tu0Var.f42127e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) tu0Var.f42127e.get(i10);
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

    public static void Z(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.ck0 lottieAnimation;
        tu0 tu0Var = photoViewer.X4;
        ArrayList arrayList = tu0Var.f42127e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) tu0Var.f42127e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.y9) && (lottieAnimation = ((org.telegram.ui.Components.y9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j10 = photoViewer.f33979m8;
                        long j11 = 0;
                        if (j10 > 0) {
                            j11 = j10 / 1000;
                        }
                        lottieAnimation.U(j3 - j11);
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

    public static void a0(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a0(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String a1(int i10, int i11, int i12) {
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

    public static CharSequence k2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.i6.f20996o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.i6.f20996o2.getFontMetricsInt(), false);
        if (MessageObject.containsUrls(replaceAnimatedEmoji)) {
            try {
                AndroidUtilities.addLinksSafe(replaceAnimatedEmoji, 5, false, true);
            } catch (Exception e7) {
                FileLog.e(e7);
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

    public static String q1(ImageLocation imageLocation) {
        if (imageLocation != null && imageLocation.imageType == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer t1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f33863a9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f33863a9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f33863a9 = photoViewer;
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
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null && ju0Var.f30791x) {
            return ju0Var.getVideoDuration();
        }
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.p();
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
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.b6.cloneSpans(charSequence, 3);
        W2(this.R4, z11);
        if (!this.R4) {
            boolean z17 = true;
            if (this.f33887c2 != 1) {
                this.U1.setVisibility(8);
                this.V1.setVisibility(8);
                if (this.f33941i2) {
                    if (this.Q1.getParent() != this.P0) {
                        FrameLayout frameLayout = this.Z1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.Q1);
                        }
                        this.Q1.setMeasureAllChildren(false);
                        this.P0.addView(this.Q1, w7.x5.a(-2.0f, 0.0f, 0.0f, 76.0f, 48.0f, -1, 83));
                    }
                } else {
                    if (this.T1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f33904e0.getContext());
                        this.Z1 = frameLayout2;
                        this.Q1.setContainer(frameLayout2);
                        cu0 cu0Var = new cu0(this, this.f33904e0.getContext(), this.Q1, this.Z1, 0);
                        this.T1 = cu0Var;
                        this.Q1.setScrollView(cu0Var);
                        this.Z1.setClipChildren(false);
                        this.T1.addView(this.Z1, new ViewGroup.LayoutParams(-1, -2));
                        this.f33904e0.addView(this.T1, w7.x5.e(-1, -1, 80));
                    }
                    if (this.Q1.getParent() != this.Z1) {
                        this.P0.removeView(this.Q1);
                        this.Q1.setMeasureAllChildren(true);
                        this.Z1.addView(this.Q1, -1, -2);
                        this.f34029s3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.R1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.E);
                            this.R1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.a0(620756991, 369098751, 8, 8));
                            w7.z5.b(this.R1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.E);
                            this.S1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.S1.setTextColor(-1);
                            this.S1.setTypeface(AndroidUtilities.bold());
                            this.R1.addView(this.S1, w7.x5.e(-2, -2, 17));
                            this.R1.setOnClickListener(new vr0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.R1);
                        this.S1.setText(messageObject.sponsoredButtonText);
                        this.Z1.addView(this.R1, w7.x5.a(44.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 87));
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
                su0 su0Var = this.Q1;
                if (z11) {
                    currentView = su0Var.getNextView();
                } else {
                    currentView = su0Var.getCurrentView();
                }
                if (this.f34017r1) {
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
                    if (this.f33941i2) {
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
                boolean z18 = this.f33941i2;
                if (!z18 && z11 && isEmpty) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f33973m2 = z12;
                if (!z18) {
                    this.T1.f40895l0 = false;
                }
                if (z11) {
                    if (z18) {
                        viewGroup = this.P0;
                    } else {
                        viewGroup = this.T1;
                    }
                    TransitionManager.endTransitions(viewGroup);
                    if (this.f33941i2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.P0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new du0(this, isEmpty2, isEmpty, 1)).addTransition(new du0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.T1.f40895l0 = true;
                            duration.addTransition(new org.telegram.ui.Components.kn0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.Q1);
                        }
                        TransitionManager.beginDelayedTransition(this.T1, duration);
                    }
                    z13 = true;
                } else {
                    this.Q1.getCurrentView().setText((CharSequence) null);
                    cu0 cu0Var2 = this.T1;
                    if (cu0Var2 != null) {
                        cu0Var2.scrollTo(0, 0);
                    }
                    z13 = false;
                }
                int i11 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.i6.J(null, true);
                    if (messageObject == null || !this.f33986n5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b51.D())) {
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new ai.kb(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.Q1.setTag(cloneSpans);
                    try {
                        su0 su0Var2 = this.Q1;
                        if (this.f34001p2 != z10) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        su0Var2.a(cloneSpans, z11, z16);
                        cu0 cu0Var3 = this.T1;
                        if (cu0Var3 != null) {
                            cu0Var3.H(cu0Var3.getWidth(), cu0Var3.getHeight());
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.J && (!this.f34017r1 || this.P0.getVisibility() == 0 || this.f33954j7 != null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    su0 su0Var3 = this.Q1;
                    if (z15) {
                        i11 = 0;
                    }
                    su0Var3.setVisibility(i11);
                } else if (this.f33941i2) {
                    this.Q1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z11, false);
                    this.Q1.getCurrentView().setTextColor(-1291845633);
                    this.Q1.setTag("empty");
                    this.Q1.setVisibility(0);
                } else {
                    this.Q1.a(null, z11, false);
                    this.Q1.getCurrentView().setTextColor(-1);
                    su0 su0Var4 = this.Q1;
                    if (z13 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    su0Var4.b(4, z14);
                    this.Q1.setTag(null);
                }
                if (this.Q1.getCurrentView() instanceof ru0) {
                    ((ru0) this.Q1.getCurrentView()).setLoading(z10);
                }
                if (isEmpty || !z10) {
                    z17 = false;
                }
                this.f34001p2 = z17;
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
        cv0 cv0Var = this.d;
        if (cv0Var != null) {
            int H2 = cv0Var.H();
            this.O0.a(H2);
            if (H2 == 0) {
                p3(false, true);
            }
            if (this.S0 != null) {
                cv0 cv0Var2 = this.d;
                long j10 = 0;
                if (cv0Var2 != null) {
                    j3 = cv0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (messageObject = this.T4) != null) {
                    j3 = messageObject.getDialogId();
                }
                ii.z1 z1Var = this.S0;
                cv0 cv0Var3 = this.d;
                if (cv0Var3 == null || !cv0Var3.q() || this.d.w()) {
                    j10 = MessagesController.getInstance(this.T).getSendPaidMessagesStars(j3);
                }
                cv0 cv0Var4 = this.d;
                if (cv0Var4 == null) {
                    H = 1;
                } else {
                    H = cv0Var4.H();
                }
                z1Var.i(Math.max(1, H), j10, true);
            }
        }
    }

    public final void B0(final int i10, final boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        rw rwVar;
        final File file;
        final rw rwVar2;
        boolean z15;
        boolean z16;
        File file2;
        File pathToAttach;
        File pathToAttach2;
        boolean z17;
        final boolean z18;
        File file3;
        rw rwVar3;
        boolean z19;
        org.telegram.ui.Components.f6 f6Var;
        int i12 = this.P4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.f33890c5[i10] != null) {
            if (i10 == 0 && i12 == 0 && (f6Var = this.f33950j2) != null) {
                z11 = f6Var.s();
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
                        rwVar3 = new rw(27, this, p1(i11, null));
                    } else {
                        rwVar3 = new rw(28, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        rw rwVar4 = rwVar3;
                        z13 = z19;
                        rwVar = r42;
                        file = null;
                        file4 = file3;
                        rwVar2 = rwVar4;
                        z14 = true;
                    } else {
                        z14 = false;
                        rwVar = r42;
                        file = null;
                        file4 = file3;
                        rwVar2 = rwVar3;
                        z13 = false;
                    }
                } else {
                    this.W0[i10].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i11 >= 0 && i11 < this.f33928g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f33928g7.get(i11);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.f33890c5[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.f33890c5[i10]);
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
                        file = new File(FileLoader.getDirectory(4), this.f33890c5[i10]);
                    } else {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i11 >= 0 && i11 < this.f33882b7.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.f33882b7.get(i11);
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
                    } else if (this.f33880b5 != null) {
                        if (i11 >= 0 && i11 < this.e7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.e7.get(i11);
                            pathToAttach = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.T).getPathToAttach(secureDocument, false);
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f33909e5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.f33890c5[i10]);
                        file = new File(FileLoader.getDirectory(4), this.f33890c5[i10]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        yu0 yu0Var = this.f33954j7;
                        if (yu0Var != null) {
                            File b10 = yu0Var.b(i11);
                            if (!this.f33954j7.a(i11) && !this.f33954j7.e(i11)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && SharedConfig.streamMedia && (this.f33954j7.d(i11) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            rwVar2 = null;
                            z12 = Q2(i11);
                            file4 = b10;
                            rwVar = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            rwVar = null;
                            file = null;
                            rwVar2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    rwVar2 = null;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    rwVar = rwVar2;
                }
                rwVar2 = null;
                file4 = file2;
                rwVar = rwVar2;
            }
            if ((i10 != 0 || !this.f33968l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = rwVar;
            final boolean z20 = z11;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    zn znVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = rwVar2;
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
                    if (!z22 && i13 != 0 && (messageObject = r72) != null && z23 && DownloadController.getInstance(photoViewer.T).canDownloadMedia(messageObject.messageOwner) != 0 && (((znVar = photoViewer.l4) == null || znVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
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
                            String[] strArr = photoViewer2.f33890c5;
                            av0[] av0VarArr = photoViewer2.W0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                        av0VarArr[i14].d(2, false, true);
                                    } else {
                                        av0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    av0VarArr[i14].d(0, z29, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i14]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                av0VarArr[i14].f(fileProgress.floatValue(), false);
                            } else {
                                if (i14 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i14 == 0 && photoViewer2.X2))) {
                                        av0VarArr[i14].d(3, z29, true);
                                    } else {
                                        av0VarArr[i14].d(-1, z29, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f33990o0.t()) {
                                    if (!z27) {
                                        if (!FileLoader.getInstance(photoViewer2.T).isLoadingFile(strArr[i14])) {
                                            photoViewer2.f33990o0.r(8);
                                        } else {
                                            photoViewer2.f33990o0.K(8);
                                        }
                                    } else {
                                        photoViewer2.f33990o0.r(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f34039t4 || (photoViewer2.f33928g7.isEmpty() && (strArr[0] == null || av0VarArr[0].h == 0))) {
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
        if (!this.f33928g7.isEmpty() && i11 >= 0 && i11 < this.f33928g7.size()) {
            Object obj = this.f33928g7.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.f33887c2 != 11))) {
                    this.W0[i10].d(3, z10, true);
                    return;
                }
            }
        }
        this.W0[i10].d(-1, z10, true);
    }

    public final int B1() {
        int measuredHeight;
        int i12 = i1();
        wu0 wu0Var = this.f33904e0;
        if (wu0Var != null && (measuredHeight = wu0Var.getMeasuredHeight()) > 0) {
            return Math.min(i12, measuredHeight);
        }
        return i12;
    }

    public final void B2(int i10) {
        C2(i10, true, false, false);
    }

    public final void B3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3():void");
    }

    public final void C0(int i10) {
        org.telegram.ui.Components.g81 g81Var;
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null && k81Var.d != null && i10 != k81Var.f27884d0) {
            k81Var.f27884d0 = i10;
            ArrayList arrayList = k81Var.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                g81Var = (org.telegram.ui.Components.g81) k81Var.N.get(i10);
            } else {
                g81Var = null;
            }
            k81Var.R(false, g81Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.k81.J(null, this.T4);
        } else {
            org.telegram.ui.Components.k81 k81Var2 = this.F2;
            if (k81Var2 != null) {
                org.telegram.ui.Components.k81.J(k81Var2.u(i10), this.T4);
            }
        }
        z3();
        this.f33999p0.M(null, null);
        try {
            b5.d.b(0);
            if (pf.b.I().L()) {
                pf.b.I().S(m1());
            }
            org.telegram.ui.Components.k81 k81Var3 = this.F2;
            if (k81Var3 != null) {
                b5.d.x(k81Var3.y());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final boolean C1() {
        if (d1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void C2(int r43, boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(int, boolean, boolean, boolean):void");
    }

    public final void C3() {
        String Z0;
        String Z02;
        int[] iArr = this.f33974m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f33984n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            long max = Math.max(0L, k81Var.n());
            long max2 = Math.max(0L, this.F2.p());
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
            ju0 ju0Var = this.f33913f0;
            if (ju0Var != null && ju0Var.f30791x) {
                long max3 = Math.max(0, ju0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f33913f0.getVideoDuration());
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
        int i10 = iArr[0];
        if (i10 >= 60) {
            Z0 = a1(i10 / 60, i10 % 60, iArr[1]);
        } else {
            Z0 = Z0(i10, iArr[1]);
        }
        int i11 = iArr2[0];
        if (i11 >= 60) {
            Z02 = a1(i11 / 60, i11 % 60, iArr2[1]);
        } else {
            Z02 = Z0(i11, iArr2[1]);
        }
        this.f33993o3.l(Z0 + " / " + Z02, false);
        if (!Objects.equals(this.j3, Z02)) {
            this.j3 = Z02;
            this.f33942i3.requestLayout();
        }
    }

    public final void D0(boolean z10, boolean z11, float f7) {
        if (f7 != this.f34036t1) {
            this.f34036t1 = f7;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f34036t1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.T4.getDialogId() + "_" + this.T4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.T4.getDialogId() + "_" + this.T4.getId(), this.f34036t1).commit();
                }
            }
            org.telegram.ui.Components.k81 k81Var = this.F2;
            if (k81Var != null) {
                k81Var.Q(this.f34036t1);
            }
            ju0 ju0Var = this.f33913f0;
            if (ju0Var != null) {
                ju0Var.setPlaybackSpeed(this.f34036t1);
            }
        }
        J2(true, z10);
        if (z11) {
            this.f33999p0.M(null, null);
        }
    }

    public final void D2() {
        if (this.f33985n4 == 0) {
            E2(this.C4, this.P4, null);
            F2(this.P4, this.f34086y4);
            E2(this.D4, this.P4 + 1, this.F1);
            F2(this.P4 + 1, this.A4);
            E2(this.B4, this.P4 - 1, this.E1);
            F2(this.P4 - 1, this.f34095z4);
        }
    }

    public final void D3() {
        int extractRealEncoderBitrate;
        if (this.Z7 > 0) {
            if (this.Y7 >= this.Z7) {
                this.Y7 = this.Z7 - 1;
            }
            if (this.f33887c2 == 1) {
                float max = Math.max(800.0f / this.f33893c8, 800.0f / this.f33902d8);
                this.f33911e8 = Math.round((this.f33893c8 * max) / 2.0f) * 2;
                this.f33920f8 = Math.round((this.f33902d8 * max) / 2.0f) * 2;
            } else {
                Size p02 = p0();
                this.f33911e8 = p02.getWidth();
                this.f33920f8 = p02.getHeight();
            }
            if (this.f33929g8 != 0) {
                if (this.f33887c2 == 1) {
                    this.f33929g8 = 1560000;
                    extractRealEncoderBitrate = this.f33929g8;
                } else if (this.f33911e8 == this.f33893c8 && this.f33920f8 == this.f33902d8) {
                    this.f33929g8 = this.f33938h8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f33911e8, this.f33920f8, this.f33929g8, false);
                } else {
                    this.f33929g8 = MediaController.makeVideoBitrate(this.f33902d8, this.f33893c8, this.f33938h8, this.f33920f8, this.f33911e8);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f33911e8, this.f33920f8, this.f33929g8, false);
                }
                this.f34024r8 = ((extractRealEncoderBitrate / 8) * this.f33947i8) / 1000.0f;
            }
        }
    }

    public final void E0(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0 && i10 < this.f33928g7.size() && I1()) {
            if (z10) {
                k0();
            }
            f1().p();
        }
    }

    public final void E1() {
        boolean[] zArr = this.f34064w1;
        zArr[1] = false;
        zArr[0] = false;
        this.f33904e0.invalidate();
    }

    public final void E2(ImageReceiver imageReceiver, int i10, lg.g gVar) {
        MessageObject messageObject;
        int i11;
        TLRPC.PhotoSize photoSize;
        ?? r11;
        int i12;
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
        org.telegram.ui.Components.f6 f6Var;
        boolean z11;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.f6 f6Var2;
        boolean z12;
        ImageLocation imageLocation12;
        BitmapDrawable bitmapDrawable7;
        ImageLocation imageLocation13;
        long j10;
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
                ImageReceiver.BitmapHolder bitmapHolder = this.f33952j5;
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
        ArrayList arrayList2 = this.f33928g7;
        long j15 = 0;
        if (!arrayList2.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f33952j5;
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
                            if (this.f33976m5) {
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
                        document = a1.g.l(photoSize5, photoSize5, "_");
                    }
                    cropState = cropState3;
                    str3 = str5;
                    document2 = null;
                    imageLocation14 = null;
                    i13 = 0;
                    z14 = z15;
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
                                    document = a1.g.l(photoSize5, photoSize5, "_");
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
                                            str6 = a1.g.l(photoSize5, photoSize5, "_");
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
                            i13 = 1;
                            imageLocation14 = imageLocation15;
                            cropState = null;
                            photoSize4 = photoSize3;
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
                                i13 = 1;
                                imageLocation14 = imageLocation15;
                                cropState = null;
                                photoSize4 = photoSize3;
                                j10 = j11;
                                str3 = null;
                            }
                            document = document4;
                            document5 = document4;
                            document2 = document5;
                            i13 = 1;
                            imageLocation14 = imageLocation15;
                            cropState = null;
                            photoSize4 = photoSize3;
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
                            i13 = 1;
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
                        i13 = 1;
                        cropState = searchImage.cropState;
                        document = "d";
                        photoSize4 = photoSize2;
                        imageLocation14 = null;
                        tLObject = tLObject2;
                        j10 = j15;
                        webFile = null;
                    } else {
                        j10 = 0;
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
                        String l4 = a1.g.l(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, l4, bitmapDrawable10, j10, null, obj, i13);
                    } else {
                        long j18 = j10;
                        int i14 = i13;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation17 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                        } else {
                            imageLocation17 = null;
                        }
                        Locale locale5 = Locale.US;
                        String l10 = a1.g.l(photoSize5, photoSize5, "_");
                        if (bitmapHolder2 != null) {
                            j13 = j18;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j13 = j18;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, l10, bitmapDrawable9, j13, null, obj, i14);
                    }
                } else {
                    WebFile webFile2 = webFile;
                    long j19 = j10;
                    ImageLocation imageLocation20 = imageLocation14;
                    int i15 = i13;
                    if (photoSize4 != null) {
                        ImageLocation forObject = ImageLocation.getForObject(photoSize4, tLObject);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable8 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable8 = null;
                        }
                        imageReceiver.setImage(forObject, document, bitmapDrawable8, j19, (String) null, obj, i15);
                    } else {
                        String str8 = document;
                        if (webFile2 != null) {
                            if (imageLocation20 != null) {
                                imageReceiver.setImage(ImageLocation.getForWebFile(webFile2), str8, imageLocation20, (String) null, (Drawable) null, obj, i15);
                            } else {
                                ImageLocation forWebFile = ImageLocation.getForWebFile(webFile2);
                                if (bitmapHolder2 != null) {
                                    drawable4 = new BitmapDrawable(bitmapHolder2.bitmap);
                                } else if (z14 && (activity2 = this.f34082y) != null) {
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
                            } else if (z14 && (activity = this.f34082y) != null) {
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
                        gVar.f15527a = false;
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
        yu0 yu0Var = this.f33954j7;
        if (yu0Var != null) {
            int[] iArr = new int[1];
            TLObject d = yu0Var.d(i10);
            TLRPC.PhotoSize f7 = this.f33954j7.f(d, iArr);
            if (f7 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f33952j5 == null || imageReceiver != this.C4) ? null : null;
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
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f33954j7.g(), 1);
                    if (z12) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f33954j7.a(i10) && !this.f33954j7.e(i10)) {
                    if (imageReceiver == this.C4 && (f6Var2 = this.f33950j2) != null) {
                        imageReceiver.setImageBitmap(f6Var2);
                        this.f33950j2.f(this.f33904e0);
                        return;
                    }
                    return;
                } else if (!(f7.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f33952j5 == null || imageReceiver != this.C4) ? null : null;
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
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f33954j7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f34082y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f34082y.getResources().getDrawable(R.drawable.transparent));
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
                imageReceiver.setImageBitmap(this.f34082y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f33952j5 == null || imageReceiver != this.C4) ? null : null;
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
                        if (closestPhotoSizeWithSize3.f20063w < 100 && closestPhotoSizeWithSize3.h < 100) {
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
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f33952j5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f34082y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.C4 && (f6Var = this.f33950j2) != null) {
                f6Var.f(this.f33904e0);
                imageReceiver.setImageBitmap(this.f33950j2);
                return;
            } else if (this.C5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f33952j5 == null || imageReceiver != this.C4) ? null : null;
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
                    imageReceiver.setImage(imageLocation8, a1.g.l(i16, i16, "_"), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z10) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f34082y;
                wu0 wu0Var = this.f33904e0;
                ?? drawable5 = new Drawable();
                drawable5.f32803a = 0L;
                drawable5.f32804b = 0.0f;
                drawable5.f32805c = 0.0f;
                drawable5.d = 0L;
                drawable5.f32806e = 0.0f;
                drawable5.f32807f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.xd0.J;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.xd0.K;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.xd0.L.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.xd0.M.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.xd0.N.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.xd0.O.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.xd0.I.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f32808n = wu0Var;
                drawable5.f32809r = messageObject;
                drawable5.f32810s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
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
                    drawable5.f32813y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f32813y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f32812x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.E, messageObject.getDocument().mime_type, true)).mutate();
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
        ImageLocation s13 = s1(i10, jArr);
        TLObject p12 = p1(i10, jArr);
        imageReceiver.setNeedsQualityThumb(i11);
        if (s13 != null) {
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f33952j5 == null || imageReceiver != this.C4) ? null : null;
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
                int i17 = 0;
                while (true) {
                    if (i17 >= s13.photo.sizes.size()) {
                        break;
                    } else if (s13.photo.sizes.get(i17) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = s13.photo.sizes.get(i17);
                        r11 = s13.photo;
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if ((messageObject == null || !messageObject.isWebpage()) && this.f34096z5 == 0 && !this.B5) {
                i12 = 0;
            } else {
                i12 = 1;
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
                int i18 = (this.f34096z5 > 0L ? 1 : (this.f34096z5 == 0L ? 0 : -1));
                if (i18 != 0) {
                    if (i18 > 0) {
                        user = MessagesController.getInstance(this.T).getUser(Long.valueOf(this.f34096z5));
                    } else {
                        user = MessagesController.getInstance(this.T).getChat(Long.valueOf(-this.f34096z5));
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
                imageReceiver.setImage(s13, str2, imageLocation5, null, imageLocation6, "b", bitmapDrawable2, jArr[0], null, messageObject, i12);
                imageReceiver.setAllowStartAnimation(true);
                return;
            }
            if (this.f34096z5 != j3) {
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
            imageReceiver.setImage(imageLocation4, str, imageLocation3, "b", bitmapDrawable, jArr[0], null, messageObject, i12);
            if (z17) {
                num = null;
            }
            imageReceiver.setMark(num);
        } else if (jArr[0] == 0) {
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            imageReceiver.setImageBitmap(this.f34082y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean E3() {
        org.telegram.ui.Components.k50 k50Var = this.f33992o2;
        if (k50Var != null && k50Var.d && !k50Var.f27850e) {
            return true;
        }
        return false;
    }

    public final void F0() {
        bu0 bu0Var = this.L1;
        Activity activity = this.f34082y;
        ir0 ir0Var = new ir0(this, 1);
        if (bu0Var.L1) {
            bu0Var.x0(false);
        } else if (bu0Var.f46372g2) {
            bu0Var.m0(true);
        } else if (bu0Var.T0 && bu0Var.S0 != null) {
            bu0Var.s0(null, true);
        } else if (bu0Var.F0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bu0Var.Q1);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new m4.w(ir0Var, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            S2(alertDialog$Builder);
        } else {
            ir0Var.run();
        }
    }

    public final void F1() {
        org.telegram.ui.Components.vf0 vf0Var = this.C1;
        if (vf0Var != null) {
            vf0Var.b(null, 0, false, false, null, null, null);
            if (this.f33887c2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.C1.f31768b.f15572a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.C1.setVisibility(0);
            this.C1.setAlpha(1.0f);
            lg.p pVar = this.C1.f31768b;
            pVar.q();
            CropAreaView cropAreaView2 = pVar.f15572a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f34037t2 = true;
        }
    }

    public final void F2(int i10, org.telegram.ui.Components.he0 he0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (he0Var != null) {
            he0Var.a();
            he0Var.setVisibility(8);
            ArrayList arrayList2 = this.f33928g7;
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
                he0Var.setVisibility(0);
                if (this.f33887c2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                he0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    he0Var.f27053a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(he0Var.f27053a);
                    he0Var.d = bitmapDrawable;
                    he0Var.setBackground(bitmapDrawable);
                    return;
                }
                he0Var.f27053a = null;
                he0Var.d = null;
                he0Var.setBackground(null);
            }
        }
    }

    public final void G0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(boolean, boolean):void");
    }

    public final void G1() {
        qg.o2 o2Var = this.p5;
        if (o2Var == null || !o2Var.V) {
            qe.b bVar = this.Z;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((ch.e) it.next()).O = true;
                }
            }
            qe.b bVar2 = this.f33866a0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            bt0 bt0Var = this.U1;
            if (bt0Var != null) {
                bt0Var.m();
            }
            ct0 ct0Var = this.V1;
            if (ct0Var != null) {
                ct0Var.m();
            }
            ou0 ou0Var = this.f34040t5;
            if (ou0Var != null) {
                ou0Var.invalidate();
            }
            ou0 ou0Var2 = this.f34058v5;
            if (ou0Var2 != null) {
                ou0Var2.invalidate();
            }
            ou0 ou0Var3 = this.f34068w5;
            if (ou0Var3 != null) {
                ou0Var3.invalidate();
            }
            ou0 ou0Var4 = this.f34078x5;
            if (ou0Var4 != null) {
                ou0Var4.invalidate();
            }
            ou0 ou0Var5 = this.f34087y5;
            if (ou0Var5 != null) {
                ou0Var5.invalidate();
            }
            ys0 ys0Var = this.S7;
            if (ys0Var != null && ys0Var.f32576e0) {
                ys0Var.invalidate();
            }
            wu0 wu0Var = this.f33904e0;
            if (wu0Var != null) {
                wu0Var.invalidate();
            }
        }
    }

    public final void G2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G2(int, boolean, boolean, boolean):void");
    }

    public final void H0() {
        if (this.C1 != null) {
            return;
        }
        org.telegram.ui.Components.vf0 vf0Var = new org.telegram.ui.Components.vf0(this.E, this.f34055v2);
        this.C1 = vf0Var;
        vf0Var.setVisibility(8);
        this.C1.a();
        this.f33904e0.addView(this.C1, this.f33904e0.indexOfChild(this.R7) - 1, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.C1.setDelegate(new ts0(this));
    }

    public final boolean H1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.E.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
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
            view.animate().alpha(f11).setDuration(100L).setUpdateListener(new hr0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new ha0(this, z10, view, 4)).start();
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
        org.telegram.ui.Components.od f12 = f1();
        if (f12 != null) {
            if (f12.L.c() || f12.f5555f.f33652e) {
                return true;
            }
            return false;
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
        if (this.f33887c2 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.D1.f15533i;
        } else {
            cropState = this.X4.f42126c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        qg.o2 o2Var = this.p5;
        if (o2Var != null && o2Var.getSourceBitmap() != null) {
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
        au0 au0Var = new au0(this, this.f34082y, this.T, createBitmap2, createBitmap, this.C4.getOrientation(), cropState2);
        this.N1 = au0Var;
        au0Var.f46594s.setOnClickListener(new jr0(this, 5));
        this.N1.v.setOnClickListener(new jr0(this, 6));
        this.N1.setEraser(this.M1);
        int indexOfChild = this.f33904e0.indexOfChild(this.f34049u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f33904e0.getChildCount();
        }
        this.f33904e0.addView(this.N1, indexOfChild, w7.x5.d(-1.0f, -1));
        this.O1 = false;
    }

    public final boolean J1() {
        int i10;
        if (this.f33937h7 != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                ImageLocation imageLocation = (ImageLocation) this.f33872a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f33937h7.location;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f33937h7.location;
                    if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void J2(boolean z10, boolean z11) {
        if (this.f34016r0.getVisibility() != 0) {
            this.f34063w0.f44130f.t("", z10, true);
        } else if (Math.abs(this.f34036t1 - 1.0f) < 0.001f) {
            this.f34063w0.f44130f.t("", z10, true);
        } else {
            org.telegram.ui.Components.q6 q6Var = this.f34063w0.f44130f;
            q6Var.t(org.telegram.ui.Components.hd.a(this.f34036t1) + "x", z10, true);
        }
        this.f34016r0.d(this.f34036t1, z10);
        k91 k91Var = this.I0;
        float f7 = this.f34036t1;
        org.telegram.ui.ActionBar.f1[] f1VarArr = k91Var.f39192a;
        for (int i10 = 0; i10 < f1VarArr.length; i10++) {
            if (z11 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                f1VarArr[i10].c(-9718023, -9718023);
            } else {
                f1VarArr[i10].c(-328966, -328966);
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
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) textureView;
                bitmapWidth = z71Var.getVideoWidth();
                bitmapHeight = z71Var.getVideoHeight();
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
            Bitmap bitmap2 = this.f34086y4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i10 = this.f33887c2;
            tu0 tu0Var = this.X4;
            boolean z10 = true;
            if (i10 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.D1.f15533i;
            } else {
                cropState = tu0Var.f42126c;
            }
            MediaController.CropState cropState2 = cropState;
            ci.h4 h4Var = new ci.h4(this.f33921g0, false, new or0(this, 2));
            h4Var.f5162f = true;
            h4Var.f5163g = true;
            this.K1 = h4Var;
            if (this.f34048u4 == 3) {
                z10 = false;
            }
            h4Var.b(z10);
            Activity activity = this.f34082y;
            int i11 = this.T;
            if (this.f34017r1) {
                bitmap = null;
            } else {
                bitmap = this.C4.getBitmap();
            }
            bu0 bu0Var = new bu0(this, activity, activity, i11, bitmap3, bitmap, this.C4.getOrientation(), tu0Var.f42127e, cropState2, new ir0(this, 14), this.f34055v2);
            this.L1 = bu0Var;
            ch.d c10 = this.Y.c(bu0Var.f46363c1, null, false);
            c10.o(eh.b.i(this.f34055v2));
            bu0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f33904e0.addView(this.L1.getView(), w7.x5.d(-1.0f, -1));
            this.L1.setOnDoneButtonClickedListener(new ir0(this, 15));
            this.L1.getCancelView().setOnClickListener(new jr0(this, 8));
            this.L1.u0(AndroidUtilities.dp(126.0f));
            this.L1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final void K2(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        ib0 ib0Var;
        Activity parentActivity;
        boolean z10;
        int i10;
        wu0 wu0Var;
        boolean z11;
        float f7;
        float f10;
        ib0 ib0Var2 = this.f33978m7;
        if (ib0Var2 != null) {
            ib0Var2.destroy();
            this.f33978m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            ib0Var = new ib0(launchActivity, true);
        } else {
            ib0Var = null;
        }
        this.f33978m7 = ib0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = n2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.i6.J(parentActivity, false);
        this.f34055v2 = e6Var;
        this.f33975m4 = n2Var;
        int i11 = UserConfig.selectedAccount;
        this.T = i11;
        this.C4.setCurrentAccount(i11);
        this.B4.setCurrentAccount(this.T);
        this.D4.setCurrentAccount(this.T);
        bt0 bt0Var = this.U1;
        if (bt0Var != null) {
            bt0Var.setAccount(this.T);
            this.U1.f5555f.k(false);
        }
        ct0 ct0Var = this.V1;
        if (ct0Var != null) {
            ct0Var.setAccount(this.T);
            this.V1.f5555f.k(false);
        }
        qg.o2 o2Var = this.p5;
        if (o2Var != null) {
            o2Var.setCurrentAccount(this.T);
        }
        if (this.f34082y != parentActivity && parentActivity != null) {
            this.f34025s = parentActivity instanceof BubbleActivity;
            this.f34082y = parentActivity;
            this.E = new ContextThemeWrapper(this.f34082y, R.style.Theme_TMessages);
            this.f34084y1 = ViewConfiguration.get(this.f34082y).getScaledTouchSlop();
            if (U8 == null) {
                U8 = new Drawable[]{f0.c.c(this.f34082y, R.drawable.circle_big), f0.c.c(this.f34082y, R.drawable.cancel_big), f0.c.c(this.f34082y, R.drawable.load_big)};
            }
            this.V6 = new Scroller(parentActivity);
            dv0 dv0Var = new dv0(this, parentActivity);
            this.f33921g0 = dv0Var;
            dv0Var.setBackground(this.L0);
            this.f33921g0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f33930h0 = clippingImageView;
            clippingImageView.N = this.f33960k4;
            clippingImageView.K = false;
            clippingImageView.M = false;
            this.f33921g0.addView(clippingImageView, w7.x5.d(40.0f, 40));
            wu0 wu0Var2 = new wu0(this, parentActivity, parentActivity);
            this.f33904e0 = wu0Var2;
            wu0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f33879b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f33904e0);
            }
            this.f33904e0.setClipChildren(true);
            this.f33904e0.setClipToPadding(true);
            this.f33921g0.setClipChildren(false);
            this.f33921g0.setClipToPadding(false);
            org.telegram.ui.Components.ma maVar = new org.telegram.ui.Components.ma(this.f33904e0);
            this.f33875b0 = maVar;
            maVar.f28787a = 1;
            this.X = new org.telegram.ui.ActionBar.b5(this);
            this.f33866a0 = new qe.b();
            this.Z = new qe.b();
            ah.c cVar = new ah.c(this.X);
            this.Y = cVar;
            cVar.f(new hh.j(this.f33904e0), this.f33904e0);
            this.Y.e(this.f33866a0);
            this.f33885c0 = new org.telegram.ui.Components.qa(this.f33875b0, this.f33904e0);
            this.f33921g0.addView(this.f33904e0, w7.x5.e(-1, -1, 51));
            r0.i0.l(this.f33904e0, new qr0(this));
            this.f33904e0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33894d0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.f33894d0.flags = -2147286784;
            org.telegram.ui.Components.he0 he0Var = new org.telegram.ui.Components.he0(this.f34082y);
            this.f34086y4 = he0Var;
            this.f33904e0.addView(he0Var, w7.x5.d(-2.0f, -2));
            org.telegram.ui.Components.he0 he0Var2 = new org.telegram.ui.Components.he0(this.f34082y);
            this.f34095z4 = he0Var2;
            this.f33904e0.addView(he0Var2, w7.x5.d(-2.0f, -2));
            org.telegram.ui.Components.he0 he0Var3 = new org.telegram.ui.Components.he0(this.f34082y);
            this.A4 = he0Var3;
            this.f33904e0.addView(he0Var3, w7.x5.d(-2.0f, -2));
            org.telegram.ui.Components.a8 a8Var = new org.telegram.ui.Components.a8(this, parentActivity, 4);
            this.F = a8Var;
            a8Var.setOverlayTitleAnimation(true);
            this.F.setTitleColor(-1);
            this.F.setSubtitleColor(-1);
            this.F.setBackgroundColor(2130706432);
            this.F.setOccupyStatusBar(!this.f34025s);
            this.F.C(1090519039, false);
            this.F.D(-1, false);
            this.F.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.F.getBackButton();
            this.G = backButton;
            this.H = backButton.getBackground();
            this.I = null;
            bv0 bv0Var = new bv0(parentActivity);
            this.M = bv0Var;
            this.F.addView(bv0Var, w7.x5.e(-1, -1, 119));
            this.f33904e0.addView(this.F, w7.x5.d(-2.0f, -1));
            zu0 zu0Var = new zu0(parentActivity);
            this.N = zu0Var;
            this.f33904e0.addView(zu0Var, w7.x5.e(-1, -2, 55));
            this.F.setActionBarMenuOnItemClick(new ss0(this, e6Var));
            org.telegram.ui.ActionBar.z o9 = this.F.o();
            this.A0 = o9;
            o9.setOnLayoutListener(new ir0(this, 18));
            org.telegram.ui.ActionBar.v0 a2 = this.A0.a(26, R.drawable.menu_delete_old);
            this.E0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            w7.z5.a(this.E0);
            I2(this.E0, false, false);
            org.telegram.ui.ActionBar.v0 a10 = this.A0.a(11, R.drawable.msg_mask);
            this.D0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.v0 a11 = this.A0.a(18, R.drawable.msg_header_draw);
            this.C0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.v0 a12 = this.A0.a(4, R.drawable.msg_header_share);
            this.B0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.z zVar = this.A0;
            xr xrVar = new xr(this.E, R.drawable.video_settings, new ai.d());
            this.f34063w0 = xrVar;
            org.telegram.ui.ActionBar.v0 d = zVar.d(1, xrVar);
            this.f33999p0 = d;
            this.f34063w0.setCallback(d.getIconView());
            this.f33999p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f33999p0.getPopupLayout().f20365c = true;
            this.f33999p0.getPopupLayout().setFitItems(true);
            this.f33999p0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(this.E, e6Var);
            this.f34016r0 = b1Var;
            b1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f34016r0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f34016r0.setDrawShadow(false);
            this.f34016r0.setBackgroundColor(-14540254);
            this.f34016r0.setTextColor(-1);
            this.f34016r0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f34016r0.setOnValueChange(new pr0(this, 1));
            this.f33999p0.getPopupLayout().a(this.f34016r0, w7.x5.n(-1, 44));
            org.telegram.ui.ActionBar.k1 a13 = this.f33999p0.a(-1);
            this.f34091z0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f33999p0.getPopupLayout();
            k91 k91Var = new k91(this.E, new qr0(this));
            this.I0 = k91Var;
            popupLayout.addView(k91Var);
            LinearLayout linearLayout = new LinearLayout(this.E);
            this.f34073x0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f33999p0.getPopupLayout().addView(this.f34073x0);
            org.telegram.ui.ActionBar.f1 e7 = this.f33999p0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f34026s0 = e7;
            e7.setSelectorColor(268435455);
            org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(this, this.E, 1);
            this.G0 = v7Var;
            try {
                v7Var.setRouteSelector(d6.a.c(this.E).a());
                z10 = true;
            } catch (Exception e10) {
                FileLog.e(e10);
                z10 = false;
            }
            this.G0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.f1 e11 = this.f33999p0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.F0 = e11;
                e11.d(false);
                this.F0.setSelectorColor(268435455);
                this.F0.addView(this.G0, 0, w7.x5.d(-1.0f, -1));
            }
            this.f33999p0.B(-115203550);
            this.f33999p0.setOnMenuDismiss(new or0(this, 8));
            org.telegram.ui.ActionBar.v0 a14 = this.A0.a(0, R.drawable.media_more);
            this.f33990o0 = a14;
            a14.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f33990o0.setOnClickListener(new vr0(this, 3));
            this.f33990o0.setOnMenuDismiss(new or0(this, 9));
            this.f33990o0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f33990o0.getPopupLayout().f20365c = true;
            this.f33990o0.getPopupLayout().setFitItems(true);
            this.J0 = new vr(this.E, this.f33990o0.getPopupLayout().getSwipeBack(), new qr0(this));
            org.telegram.ui.ActionBar.f1 i12 = this.f33990o0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.J0.f42970a);
            i12.c(-328966, -328966);
            this.f34035t0 = i12;
            i12.setOnClickListener(new vr0(this, 4));
            org.telegram.ui.ActionBar.k1 a15 = this.f33990o0.a(-1);
            this.f34044u0 = a15;
            a15.setColor(-15198184);
            this.f33990o0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).c(-328966, -328966);
            org.telegram.ui.ActionBar.f1 e12 = this.f33990o0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e12.c(-328966, -328966);
            this.f34053v0 = e12;
            org.telegram.ui.ActionBar.f1 e13 = this.f33990o0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.f34007q0 = e13;
            e13.c(-328966, -328966);
            this.f33990o0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).c(-328966, -328966);
            this.f33990o0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).c(-328966, -328966);
            this.f33990o0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).c(-328966, -328966);
            this.f33990o0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).c(-328966, -328966);
            this.f33990o0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).c(-328966, -328966);
            this.f33990o0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).c(-328966, -328966);
            this.f33990o0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).c(-328966, -328966);
            this.f33990o0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).c(-328966, -328966);
            this.f33990o0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).c(-328966, -328966);
            this.f33990o0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).c(-328966, -328966);
            this.f33990o0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).c(-328966, -328966);
            this.f33990o0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).c(-328966, -328966);
            this.f33990o0.B(-115203550);
            this.f33990o0.r(19);
            this.f33990o0.r(20);
            J2(false, true);
            this.f33990o0.setPopupItemsSelectorColor(268435455);
            this.f33990o0.setSubMenuDelegate(new ts0(this));
            ai.x5 x5Var = new ai.x5(this.E, 24);
            this.f33939i0 = x5Var;
            x5Var.setBackgroundColor(2130706432);
            this.f33904e0.addView(this.f33939i0, w7.x5.e(-1, 48, 83));
            View view = new View(this.E);
            this.f33948j0 = view;
            if (this.f33887c2 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view.setBackgroundColor(i10);
            this.f33921g0.addView(this.f33948j0, w7.x5.b(-1.0f, this.f33956k0 / AndroidUtilities.density, 87));
            this.f34054v1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f34054v1[0].setShape(0);
            this.f34054v1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f34054v1[1].setShape(0);
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(this.E, AndroidUtilities.dp(10.0f));
            this.l1 = m40Var;
            this.f33904e0.addView(m40Var, w7.x5.e(-1, 68, 83));
            this.l1.setDelegate(new vs0(this));
            for (int i13 = 0; i13 < 3; i13++) {
                this.y3[i13] = new ImageView(this.f34082y);
                this.y3[i13].setImageResource(R.drawable.msg_maxvideo);
                this.y3[i13].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.y3[i13].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i13].setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, -1));
                this.y3[i13].setVisibility(4);
                this.y3[i13].setAlpha(1.0f);
                this.f33904e0.addView(this.y3[i13], w7.x5.d(48.0f, 48));
                this.y3[i13].setOnClickListener(new vr0(this, 5));
            }
            this.Q = new ws0(new ai.d());
            su0 su0Var = new su0(this.f33904e0.getContext());
            this.Q1 = su0Var;
            su0Var.setFactory(new rg0(this, 2));
            this.Q1.setVisibility(4);
            y2(true);
            for (int i14 = 0; i14 < 3; i14++) {
                this.W0[i14] = new xs0(this, this.f33904e0);
                this.W0[i14].d(0, false, true);
            }
            kd kdVar = new kd(this, this.E, e6Var);
            this.X0 = kdVar;
            kdVar.setUseSelfAlpha(true);
            this.X0.setProgressColor(-1);
            this.X0.setSize(AndroidUtilities.dp(54.0f));
            this.X0.setBackgroundResource(R.drawable.circle_big);
            this.X0.setVisibility(4);
            this.X0.setAlpha(0.0f);
            this.f33904e0.addView(this.X0, w7.x5.e(64, 64, 17));
            L0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f34082y, e6Var);
            this.Q7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.Q7.setBackgroundResource(R.drawable.circle_big);
            this.Q7.setVisibility(4);
            this.f33904e0.addView(this.Q7, w7.x5.e(54, 54, 17));
            org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(this.f34082y);
            this.P7 = ug0Var;
            ug0Var.setBackgroundColor(2130706432);
            this.P7.a();
            this.P7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.P7.f31497b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.P7.f31497b;
            int i15 = org.telegram.ui.ActionBar.i6.f21208zf;
            textView.setTextColor(z1(i15));
            this.f33904e0.addView(this.P7, w7.x5.e(-1, 48, 83));
            this.P7.f31496a.setOnClickListener(new jr0(this, 2));
            this.P7.f31497b.setOnClickListener(new jr0(this, 3));
            org.telegram.ui.Components.b81 b81Var = new org.telegram.ui.Components.b81(false);
            this.f34092z1 = b81Var;
            b81Var.c(new ts0(this));
            wu0 wu0Var3 = this.f33904e0;
            Objects.requireNonNull(wu0Var3);
            this.A1 = new org.telegram.ui.Components.pp0(new tk0(wu0Var3, 14), false);
            gv0 gv0Var = new gv0(this.f34082y, this);
            this.O7 = gv0Var;
            gv0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.O7.setVisibility(4);
            this.O7.setBackgroundColor(2130706432);
            this.f33904e0.addView(this.O7, w7.x5.a(70.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 83));
            new Paint().setColor(2130706432);
            t5 t5Var = new t5(this, this.E);
            this.P0 = t5Var;
            this.f33904e0.addView(t5Var, w7.x5.e(-1, -2, 83));
            TextView textView2 = new TextView(this.f33904e0.getContext());
            this.f33965l0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f33965l0.setTypeface(AndroidUtilities.bold());
            this.f33965l0.setSingleLine(true);
            this.f33965l0.setMaxLines(1);
            TextView textView3 = this.f33965l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f33965l0.setTextColor(-1);
            this.f33965l0.setGravity(3);
            this.P0.addView(this.f33965l0, w7.x5.a(-2.0f, 20.0f, 23.0f, 84.0f, 0.0f, -1, 51));
            TextView textView4 = new TextView(this.f33904e0.getContext());
            this.m0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            this.m0.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.P0.addView(this.m0, w7.x5.a(-2.0f, 20.0f, 46.0f, 84.0f, 0.0f, -1, 51));
            TextView textView5 = new TextView(this.f33904e0.getContext());
            this.f33981n0 = textView5;
            int i16 = org.telegram.ui.ActionBar.i6.Oh;
            textView5.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{6.0f}, z1(i16)));
            TextView textView6 = this.f33981n0;
            int i17 = org.telegram.ui.ActionBar.i6.Sh;
            textView6.setTextColor(z1(i17));
            this.f33981n0.setEllipsize(truncateAt);
            this.f33981n0.setGravity(17);
            this.f33981n0.setLines(1);
            this.f33981n0.setSingleLine(true);
            this.f33981n0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f33981n0.setTextSize(1, 15.0f);
            this.f33981n0.setTypeface(AndroidUtilities.bold());
            this.f33981n0.setOnClickListener(new jr0(this, 4));
            this.f33981n0.setVisibility(8);
            this.P0.addView(this.f33981n0, w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 64.0f, -1, 51));
            ys0 ys0Var = new ys0(this.f34082y, this);
            this.S7 = ys0Var;
            ys0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.f34082y);
            this.R7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.R7.addView(this.S7, w7.x5.e(-1, 54, 83));
            c3(false, false);
            this.f33904e0.addView(this.R7, w7.x5.a(54.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 83));
            org.telegram.ui.ActionBar.v0 v0Var = this.E0;
            if (v0Var != null) {
                ch.d a16 = this.Y.a(v0Var);
                a16.o(eh.b.i(e6Var));
                a16.q(AndroidUtilities.dp(20.0f));
                a16.p(AndroidUtilities.dp(7.0f));
                v0Var.setBackground(gh.d.d(a16, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            zs0 zs0Var = new zs0(this.f34082y, LocaleController.getString(R.string.EditorSetCover));
            this.f33922g1 = zs0Var;
            ch.d a17 = this.Y.a(zs0Var);
            a17.o(eh.b.i(e6Var));
            zs0Var.setBlurredBackgroundDrawable(a17);
            w7.z5.a(this.f33922g1);
            this.f33922g1.setOnClickListener(new jr0(this, 7));
            this.f33904e0.addView(this.f33922g1, w7.x5.a(32.0f, 60.0f, 0.0f, 60.0f, 0.0f, -1, 87));
            org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(this.f34082y, e6Var, this.f33875b0);
            this.f34012q5 = lg0Var;
            org.telegram.ui.Components.fu fuVar = lg0Var.f28454c;
            ch.d a18 = this.Y.a(fuVar);
            a18.o(eh.b.i(e6Var));
            fuVar.setBlurredBackgroundDrawable(a18);
            w7.z5.a(this.f34012q5.f28454c);
            this.f34012q5.setVisibility(8);
            this.f34012q5.setAlpha(0.0f);
            this.f34012q5.setOnClose(new ir0(this, 12));
            this.f33904e0.addView(this.f34012q5, w7.x5.e(-1, -1, 119));
            this.f34012q5.f28453b.setOnClickListener(new jr0(this, 9));
            this.f34012q5.setOnGalleryImage(new or0(this, 3));
            org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, this.f34082y, 2);
            this.f33905e1 = k0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            k0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.k0 k0Var2 = this.f33905e1;
            org.telegram.ui.Components.kd0 kd0Var = new org.telegram.ui.Components.kd0(this.f34082y);
            this.f33895d1 = kd0Var;
            k0Var2.setImageDrawable(kd0Var);
            this.f33905e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.k0 k0Var3 = this.f33905e1;
            ch.d a19 = this.Y.a(k0Var3);
            a19.o(eh.b.i(null));
            a19.p(AndroidUtilities.dp(4.0f));
            a19.q(AndroidUtilities.dp(16.0f));
            k0Var3.setBackground(a19);
            w7.z5.a(this.f33905e1);
            this.f33904e0.addView(this.f33905e1, w7.x5.a(40.0f, 8.0f, 0.0f, 0.0f, -4.0f, 40, 83));
            this.f33905e1.setOnClickListener(new jr0(this, 10));
            org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(this.f33904e0.getContext());
            this.f33914f1 = ga0Var;
            ga0Var.setOnClickListener(new jr0(this, 11));
            this.f33904e0.addView(this.f33914f1, w7.x5.a(45.0f, 8.0f, 0.0f, 0.0f, -4.0f, 45, 83));
            Context context = this.f33904e0.getContext();
            dv0 dv0Var2 = this.f33921g0;
            wu0 wu0Var4 = this.f33904e0;
            bt0 bt0Var2 = new bt0(this, context, dv0Var2, wu0Var4, wu0Var4, e6Var, this.f33875b0, new ir0(this, 19));
            this.U1 = bt0Var2;
            bt0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.U1.setOnTimerChange(new or0(this, 4));
            this.U1.setAccount(this.T);
            this.U1.setOnHeightUpdate(new or0(this, 5));
            this.U1.setOnAddPhotoClick(new jr0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.E;
            dv0 dv0Var3 = this.f33921g0;
            wu0 wu0Var5 = this.f33904e0;
            ct0 ct0Var2 = new ct0(this, contextThemeWrapper, dv0Var3, wu0Var5, wu0Var5, e6Var, this.f33875b0, new ir0(this, 19));
            this.V1 = ct0Var2;
            ct0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.V1.D(true, false);
            this.V1.setOnTimerChange(new or0(this, 6));
            this.V1.setAccount(this.T);
            this.V1.setOnHeightUpdate(new or0(this, 7));
            this.V1.setOnAddPhotoClick(new jr0(this, 13));
            ai.o4 o4Var = new ai.o4(this, this.E);
            this.f34031s5 = o4Var;
            o4Var.setVisibility(8);
            this.f33904e0.addView(this.f34031s5, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
            qg.o2 o2Var2 = new qg.o2(this.E, e6Var);
            this.p5 = o2Var2;
            o2Var2.setCurrentAccount(this.T);
            this.f33904e0.addView(this.p5, wu0Var.indexOfChild(this.F) - 1, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
            ou0 ou0Var = new ou0(this);
            this.f34040t5 = ou0Var;
            ou0Var.setRad(18);
            this.f34040t5.l();
            this.p5.setStickerCutOutBtn(this.f34040t5);
            this.f34040t5.setOnClickListener(new jr0(this, 14));
            this.f34040t5.setCutOutState(false);
            this.f33904e0.addView(this.f34040t5, w7.x5.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f34082y);
            this.f34049u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            ou0 ou0Var2 = new ou0(this);
            this.f34058v5 = ou0Var2;
            ou0Var2.f46225n0 = true;
            ou0Var2.setRad(18);
            this.f34058v5.setEraseState(false);
            this.f34058v5.setOnClickListener(new jr0(this, 15));
            this.f34049u5.addView(this.f34058v5, w7.x5.n(-2, 36));
            this.f34049u5.addView(new Space(this.f34082y), w7.x5.n(12, -1));
            ou0 ou0Var3 = new ou0(this);
            this.f34068w5 = ou0Var3;
            ou0Var3.f46225n0 = true;
            ou0Var3.setRad(18);
            this.f34068w5.setRestoreState(false);
            this.f34068w5.setOnClickListener(new jr0(this, 16));
            this.f34049u5.addView(this.f34068w5, w7.x5.n(-2, 36));
            this.f33904e0.addView(this.f34049u5, w7.x5.e(-2, 36, 17));
            ou0 ou0Var4 = new ou0(this);
            this.f34078x5 = ou0Var4;
            ou0Var4.setUndoState(false);
            this.f34078x5.setRad(18);
            ou0 ou0Var5 = this.f34078x5;
            ou0Var5.f46225n0 = true;
            ou0Var5.setOnClickListener(new jr0(this, 17));
            this.f33904e0.addView(this.f34078x5, w7.x5.e(-2, 36, 17));
            ou0 ou0Var6 = new ou0(this);
            this.f34087y5 = ou0Var6;
            ou0Var6.setOutlineState(false);
            this.f34087y5.setRad(18);
            ou0 ou0Var7 = this.f34087y5;
            ou0Var7.f46225n0 = true;
            ou0Var7.setOnClickListener(new jr0(this, 18));
            this.f33904e0.addView(this.f34087y5, w7.x5.e(-2, 36, 17));
            W2(false, false);
            a3(false, false);
            k0 k0Var4 = new k0(this, this.f34082y, 18);
            this.X1 = k0Var4;
            k0Var4.addView(this.U1, w7.x5.e(-1, -1, 83));
            this.f33904e0.addView(this.X1, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 83));
            FrameLayout frameLayout2 = new FrameLayout(this.f34082y);
            this.Y1 = frameLayout2;
            frameLayout2.addView(this.V1, w7.x5.e(-1, -1, 51));
            this.f33904e0.addView(this.Y1, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 51));
            FrameLayout frameLayout3 = new FrameLayout(this.f34082y);
            this.Q0 = frameLayout3;
            this.f33904e0.addView(frameLayout3, w7.x5.a(120.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
            FrameLayout frameLayout4 = new FrameLayout(this.f34082y);
            this.R0 = frameLayout4;
            this.f33904e0.addView(frameLayout4, w7.x5.a(120.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
            TextView textView7 = new TextView(this.f34082y);
            this.T7 = textView7;
            textView7.setSingleLine(true);
            this.T7.setVisibility(8);
            this.T7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.T7.setGravity(1);
            this.T7.setTextSize(1, 14.0f);
            this.T7.setTextColor(-7566196);
            this.f33904e0.addView(this.T7, w7.x5.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 83));
            ii.z1 z1Var = new ii.z1(this, this.f34082y, R.drawable.send_plane_24, e6Var, 4);
            this.S0 = z1Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            z1Var.I = dp;
            z1Var.J = dp2;
            ii.z1 z1Var2 = this.S0;
            z1Var2.f32840h0 = true;
            ch.d a20 = this.Y.a(z1Var2);
            a20.o(eh.b.i(e6Var));
            z1Var2.setBlurredBackgroundDrawable(a20);
            this.f33904e0.addView(this.S0, w7.x5.a(120.0f, 0.0f, 0.0f, 8.0f, 2.0f, 120, 85));
            this.S0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            w7.z5.a(this.S0);
            this.S0.setOnClickListener(new jr0(this, 19));
            this.S0.setOnLongClickListener(new v(this, 5));
            org.telegram.ui.Components.mg0 mg0Var = new org.telegram.ui.Components.mg0(this.f34082y);
            this.T0 = mg0Var;
            LinearLayout linearLayout3 = mg0Var.f28832a;
            ch.d a21 = this.Y.a(linearLayout3);
            a21.o(eh.b.i(e6Var));
            a21.q(AndroidUtilities.dp(18.0f));
            a21.p(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.T0.f28833b;
            ch.d a22 = this.Y.a(linearLayout4);
            a22.o(eh.b.i(e6Var));
            a22.q(AndroidUtilities.dp(18.0f));
            a22.p(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a22);
            this.T0.setVisibility(8);
            this.T0.f28832a.setOnClickListener(new jr0(this, 20));
            this.T0.f28833b.setOnClickListener(new jr0(this, 21));
            this.f33904e0.addView(this.T0, w7.x5.e(-1, 56, 80));
            dc1 dc1Var = new dc1(this, this.f34082y, 14);
            this.H0 = dc1Var;
            dc1Var.setOrientation(0);
            this.H0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            dc1 dc1Var2 = this.H0;
            ch.d a23 = this.Y.a(dc1Var2);
            a23.o(eh.b.i(e6Var));
            a23.p(AndroidUtilities.dp(2.0f));
            a23.q(AndroidUtilities.dp(22.0f));
            dc1Var2.setBackground(a23);
            this.P0.addView(this.H0, w7.x5.a(48.0f, 0.0f, 3.0f, 63.0f, 0.0f, -2, 81));
            ImageView imageView = new ImageView(this.f34082y);
            this.Z0 = imageView;
            imageView.setScaleType(scaleType);
            this.Z0.setImageResource(R.drawable.media_crop);
            this.Z0.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Z0, w7.x5.n(48, 48));
            this.Z0.setOnClickListener(new jr0(this, 22));
            this.Z0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f34082y);
            this.f33876b1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f33876b1.setImageResource(R.drawable.msg_photo_rotate);
            this.f33876b1.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f33876b1, w7.x5.n(48, 48));
            this.f33876b1.setOnClickListener(new jr0(this, 23));
            this.f33876b1.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f34082y);
            this.f33867a1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f33867a1.setImageResource(R.drawable.media_flip);
            this.f33867a1.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f33867a1, w7.x5.n(48, 48));
            this.f33867a1.setOnClickListener(new jr0(this, 24));
            this.f33867a1.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f34082y);
            this.Y0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.media_draw);
            this.Y0.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.Y0, w7.x5.n(48, 48));
            this.Y0.setOnClickListener(new jr0(this, 25));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.x71 x71Var = new org.telegram.ui.Components.x71(this.f34082y);
            this.f33949j1 = x71Var;
            x71Var.setTag(1);
            this.f33949j1.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.Y7 = v2();
            org.telegram.ui.Components.x71 x71Var2 = this.f33949j1;
            if (this.f33964k8 && this.Z7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            x71Var2.a(Math.min(this.f33911e8, this.f33920f8), z11, this.f34015r);
            this.f33949j1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.H0.addView(this.f33949j1, w7.x5.n(48, 48));
            this.f33949j1.setOnClickListener(new rv(26, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f34082y);
            this.f33886c1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f33886c1.setImageResource(R.drawable.media_settings);
            this.f33886c1.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.H0.addView(this.f33886c1, w7.x5.n(48, 48));
            this.f33886c1.setOnClickListener(new jr0(this, 26));
            this.f33886c1.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.ug0 ug0Var2 = new org.telegram.ui.Components.ug0(this.E);
            this.U0 = ug0Var2;
            ug0Var2.setBackgroundColor(-872415232);
            this.U0.a();
            this.U0.setVisibility(8);
            this.f33904e0.addView(this.U0, w7.x5.e(-1, 48, 83));
            this.U0.f31496a.setOnClickListener(new jr0(this, 27));
            this.U0.f31497b.setOnClickListener(new jr0(this, 28));
            TextView textView8 = new TextView(this.E);
            this.V0 = textView8;
            textView8.setClickable(false);
            this.V0.setVisibility(8);
            this.V0.setTextSize(1, 14.0f);
            this.V0.setTextColor(-1);
            this.V0.setGravity(17);
            this.V0.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(-12763843, 0));
            this.V0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.V0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.V0.setTypeface(AndroidUtilities.bold());
            this.U0.addView(this.V0, w7.x5.e(-2, -1, 49));
            this.V0.setOnClickListener(new jr0(this, 29));
            org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30(this.f33904e0.getContext(), this);
            this.f34022r6 = a30Var;
            a30Var.b();
            this.f34032s6 = true;
            this.f34022r6.h = this;
            qr0 qr0Var = new qr0(this);
            this.C4.setParentView(this.f33904e0);
            this.C4.setCrossfadeAlpha((byte) 2);
            this.C4.setInvalidateAll(true);
            this.C4.setDelegate(qr0Var);
            this.B4.setParentView(this.f33904e0);
            this.B4.setCrossfadeAlpha((byte) 2);
            this.B4.setInvalidateAll(true);
            this.B4.setDelegate(qr0Var);
            this.D4.setParentView(this.f33904e0);
            this.D4.setCrossfadeAlpha((byte) 2);
            this.D4.setInvalidateAll(true);
            this.D4.setDelegate(qr0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f33904e0.getContext(), R.drawable.selectphoto_large);
            this.N0 = checkBox;
            checkBox.setDrawBackground(true);
            this.N0.setHasBorder(true);
            this.N0.setSize(34);
            this.N0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.N0.c(z1(i15), -1);
            this.N0.setVisibility(8);
            wu0 wu0Var6 = this.f33904e0;
            CheckBox checkBox2 = this.N0;
            if (rotation != 3 && rotation != 1) {
                f7 = 71.0f;
            } else {
                f7 = 61.0f;
            }
            wu0Var6.addView(checkBox2, w7.x5.a(34.0f, 0.0f, f7, 11.0f, 0.0f, 34, 53));
            if (!this.f34025s) {
                ((FrameLayout.LayoutParams) this.N0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.N0.setOnClickListener(new vr0(this, 0));
            CounterView counterView = new CounterView(this.f34082y);
            this.O0 = counterView;
            wu0 wu0Var7 = this.f33904e0;
            if (rotation != 3 && rotation != 1) {
                f10 = 68.0f;
            } else {
                f10 = 58.0f;
            }
            wu0Var7.addView(counterView, w7.x5.a(40.0f, 0.0f, f10, 64.0f, 0.0f, 40, 53));
            if (!this.f34025s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.O0.setOnClickListener(new vr0(this, 1));
            kv0 kv0Var = new kv0(this.f34082y);
            this.f33991o1 = kv0Var;
            kv0Var.setVisibility(8);
            this.f33991o1.setAlpha(0.0f);
            this.f33991o1.setLayoutManager(new gg.a0());
            kv0 kv0Var2 = this.f33991o1;
            xu0 xu0Var = new xu0(this.f34082y, this);
            this.f34000p1 = xu0Var;
            kv0Var2.setAdapter(xu0Var);
            this.f33904e0.addView(this.f33991o1, w7.x5.e(-1, 103, 51));
            this.f33991o1.setOnItemClickListener(new i(this, 22));
            UndoView undoView = new UndoView(this.E, null, false, e6Var);
            this.f33982n1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f33982n1.i();
            this.f33904e0.addView(this.f33982n1, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.E);
                this.T3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new vr0(this, 2));
                this.f33904e0.addView(this.T3, w7.x5.e(64, 64, 17));
            }
            this.f33981n0.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{6.0f}, z1(i16)));
            this.f33981n0.setTextColor(z1(i17));
            ws0 ws0Var = this.Q;
            ws0Var.f21869j0 = true;
            ws0Var.f21865h0 = false;
            org.telegram.ui.Cells.aa n10 = ws0Var.n(this.f33921g0.getContext());
            if (n10 != null) {
                AndroidUtilities.removeFromParent(n10);
                this.f33904e0.addView(n10);
            }
            this.Q.S(this.f33904e0);
            this.Q.R();
            this.f33865a.a(false, false);
            return;
        }
        u3();
    }

    public final void L0() {
        lv0 lv0Var = new lv0(this.f33904e0.getContext(), this);
        this.f33942i3 = lv0Var;
        this.f33904e0.addView(lv0Var, w7.x5.e(-1, 48, 83));
        ts0 ts0Var = new ts0(this);
        lt0 lt0Var = new lt0(this, ts0Var);
        q50 q50Var = new q50(this, this.f33904e0.getContext(), 4);
        this.f34019r3 = q50Var;
        q50Var.setAccessibilityDelegate(lt0Var);
        this.f34019r3.setImportantForAccessibility(1);
        this.f33942i3.addView(this.f34019r3, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.m81 m81Var = new org.telegram.ui.Components.m81(this.f34019r3);
        this.f34010q3 = m81Var;
        m81Var.f28775z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.m81 m81Var2 = this.f34010q3;
        m81Var2.f28761k = 872415231;
        m81Var2.f28762l = 872415231;
        m81Var2.f28763m = -1;
        m81Var2.f28764n = -1;
        m81Var2.A = 1509949439;
        m81Var2.f28760j = ts0Var;
        mt0 mt0Var = new mt0(this, this.f33904e0.getContext(), new qr0(this));
        this.f34029s3 = mt0Var;
        mt0Var.setAlpha(0.0f);
        this.f33904e0.addView(this.f34029s3, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 58.0f, -2, 83));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(this.f33904e0.getContext());
        this.f33993o3 = j5Var;
        j5Var.setTextColor(-1);
        this.f33993o3.setGravity(53);
        this.f33993o3.setTextSize(14);
        this.f33993o3.setImportantForAccessibility(2);
        this.f33942i3.addView(this.f33993o3, w7.x5.a(-2.0f, 0.0f, 15.0f, 12.0f, 0.0f, -2, 53));
        ImageView imageView = new ImageView(this.f33904e0.getContext());
        this.f34002p3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f34002p3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f34002p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f34002p3.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, -1));
        this.f34002p3.setVisibility(4);
        this.f33942i3.addView(this.f34002p3, w7.x5.e(48, 48, 53));
        this.f34002p3.setOnClickListener(new vr0(this, 6));
    }

    public final void L2(org.telegram.ui.Components.yi yiVar) {
        this.a2 = yiVar;
        yf.j0 j0Var = this.f33877b2;
        if (j0Var != null) {
            j0Var.destroy();
            this.f33877b2 = null;
        }
        if (yiVar != null) {
            this.f33877b2 = yiVar.obtainWindowVisibilityController();
        }
    }

    public final void M0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.sa saVar;
        if (this.B2 == null) {
            tt0 tt0Var = new tt0(this.f34082y, this);
            this.f34085y2 = tt0Var;
            tt0Var.setWillNotDraw(false);
            this.f34085y2.setVisibility(4);
            this.f33904e0.addView(this.f34085y2, 0, w7.x5.e(-1, -1, 17));
            this.D2 = false;
            if (this.f33928g7.isEmpty()) {
                if (this.f33874b && this.T2 == null) {
                    this.C2 = new SurfaceView(this.f34082y);
                    this.D2 = true;
                } else {
                    this.B2 = new TextureView(this.f34082y);
                }
            } else {
                org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(this.f34082y, this.F2);
                this.f33875b0.e();
                org.telegram.ui.Components.ma maVar = this.f33875b0;
                z71Var.f33497s = maVar;
                org.telegram.ui.Components.l00 l00Var = z71Var.f33491b;
                if (l00Var != null && (saVar = l00Var.I) != null) {
                    org.telegram.ui.Components.ma maVar2 = saVar.f30757t;
                    if (maVar2 != null && maVar2.f28797m != null) {
                        maVar2.f28797m = null;
                    }
                    saVar.f30757t = maVar;
                    if (maVar != null && maVar.f28797m != saVar) {
                        maVar.f28797m = saVar;
                        maVar.d();
                    }
                }
                if (savedFilterState != null) {
                    z71Var.setDelegate(new hq0(savedFilterState, 1));
                }
                this.B2 = z71Var;
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
                this.f34085y2.addView(this.B2, w7.x5.e(-1, -1, 17));
            } else {
                this.f34085y2.addView(this.C2, w7.x5.e(-1, -1, 17));
            }
            vu0 vu0Var = new vu0(this.f34082y, this);
            this.E2 = vu0Var;
            vu0Var.setPivotX(0.0f);
            this.E2.setPivotY(0.0f);
            this.E2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f34085y2.addView(this.E2, w7.x5.e(-1, -1, 17));
            View view = new View(this.f34082y);
            this.P8 = view;
            this.f34085y2.addView(view, w7.x5.d(-1.0f, -1));
            if (this.f33887c2 == 1) {
                View view2 = new View(this.f34082y);
                this.f34093z2 = view2;
                view2.setBackgroundColor(-1);
                this.f34093z2.setAlpha(0.0f);
                this.f34085y2.addView(this.f34093z2, w7.x5.e(-1, -1, 17));
            }
            qf.e eVar = this.G2;
            if (eVar != null) {
                tt0 tt0Var2 = this.f34085y2;
                eVar.f46168i.P(tt0Var2);
                eVar.f46169j = tt0Var2;
                if (tt0Var2 != null) {
                    eVar.e(tt0Var2);
                }
                this.G2.f46170k = this.P8;
            }
        }
    }

    public final void M2() {
        zn znVar;
        TLRPC.Chat chat;
        cv0 cv0Var = this.d;
        if (cv0Var != null) {
            if (cv0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f33980n && (znVar = this.l4) != null && (chat = znVar.f44753e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.g5.M(this.f34082y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).o();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, n1());
            boolean x10 = this.d.x(this.P4);
            this.N0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f34000p1.o(k10);
                    this.f33991o1.x0(k10);
                } else {
                    this.f34000p1.u(k10);
                    if (k10 == 0) {
                        this.f34000p1.m(0);
                    }
                }
            }
            A3();
        }
    }

    public final boolean N0() {
        boolean z10 = false;
        if (this.f34004p6 != null || this.C1 == null) {
            return false;
        }
        this.f33927g6 = 1.0f;
        this.f33987n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34004p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.u6.f31383g, 0.0f, 1.0f));
        this.f34004p6.setDuration(250L);
        this.f34004p6.setInterpolator(org.telegram.ui.Components.hs.f27118f);
        this.f34004p6.addListener(new it0(this, 0));
        this.f34004p6.start();
        lg.n nVar = this.C1.f31768b.L;
        if (nVar != null) {
            z10 = nVar.f15569j;
        }
        return !z10;
    }

    public final void N2() {
        float bitmapWidth = this.C4.getBitmapWidth();
        float bitmapHeight = this.C4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float k12 = k1(this.f34048u4);
            float i12 = i1();
            float min = Math.min(i12 / bitmapHeight, k12 / bitmapWidth);
            float max = Math.max(k12 / ((int) (bitmapWidth * min)), i12 / ((int) (bitmapHeight * min)));
            this.f33871a6 = max;
            w3(max);
        }
    }

    public final boolean O0(float f7, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.vf0 vf0Var;
        float f10;
        if (this.f34004p6 == null && (vf0Var = this.C1) != null) {
            vf0Var.f31768b.i();
            this.f33881b6 = 0.0f;
            this.f33919f6 = 0.0f + f7;
            if (z10) {
                this.f33927g6 = 1.0f;
            }
            this.f33987n6 = System.currentTimeMillis();
            this.f34004p6 = new AnimatorSet();
            if (this.f33887c2 == 1) {
                this.f33910e6 = 1.0f;
                this.f33871a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.C4.getBitmapHeight();
                    if (Math.abs((((int) this.C1.f31768b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.X4.f42126c;
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
                    this.f33910e6 = f10 / min;
                }
            }
            if (this.f33887c2 == 11) {
                this.f33871a6 = r2(false) * this.f33871a6;
                this.f33910e6 = r2(false) * this.f33910e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ci.ya(this, f7, this.C1.f31769c.getRotation(), 4));
            this.f34004p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.u6.f31383g, 0.0f, 1.0f), ofFloat);
            this.f34004p6.setDuration(250L);
            this.f34004p6.setInterpolator(org.telegram.ui.Components.hs.f27118f);
            this.f34004p6.addListener(new jt0(this, f7, runnable));
            this.f34004p6.start();
            if (Math.abs(this.C1.f31768b.getStateOrientation() + f7) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void O2(CharSequence charSequence) {
        bv0 bv0Var = this.M;
        this.f33908e4 = charSequence;
        bv0Var.c(charSequence);
        j3(true, false);
    }

    public final void P0() {
        if (this.f34082y != null && this.f33921g0 != null) {
            if (org.telegram.ui.Components.gh0.f26700p0.P) {
                org.telegram.ui.Components.gh0.j(false);
            }
            NotificationCenter.ObserversGroup observersGroup = this.C7;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.C7 = null;
            }
            ConnectionsManager.getInstance(this.T).cancelRequestsForGuid(this.f33884c);
            o2(false);
            try {
                if (this.f33921g0.getParent() != null) {
                    ((WindowManager) this.f34082y.getSystemService("window")).removeViewImmediate(this.f33921g0);
                    W1();
                }
                this.f33921g0 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f33952j5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f33952j5 = null;
            }
            this.f33930h0.setImageBitmap(null);
            if (this == f33864b9) {
                f33864b9 = null;
            } else {
                f33863a9 = null;
            }
            W1();
        }
    }

    public final void P2(boolean z10, boolean z11) {
        if (this.f33967l3 != z10) {
            if (z10) {
                this.f33939i0.setTag(1);
            } else {
                this.f33939i0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f33959k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33967l3 = z10;
            float f7 = 0.0f;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    this.f33942i3.setVisibility(0);
                }
                float alpha = this.f33942i3.getAlpha();
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new hr0(this, 0));
                ofFloat.addListener(new ut0(this, z10, 0));
                this.f33959k3 = ofFloat;
                ofFloat.start();
            } else {
                lv0 lv0Var = this.f33942i3;
                if (!z10) {
                    i10 = 8;
                }
                lv0Var.setVisibility(i10);
                lv0 lv0Var2 = this.f33942i3;
                if (z10) {
                    f7 = 1.0f;
                }
                lv0Var2.setAlpha(f7);
            }
            if (this.f33958k2 && this.f33954j7 == null) {
                if (z10) {
                    this.f33990o0.K(9);
                } else {
                    this.f33990o0.r(9);
                }
            }
        }
    }

    public final void Q0() {
        if (this.C4.getAnimation() == null && !this.f33928g7.isEmpty() && this.f33887c2 != 1) {
            String imageKey = this.C4.getImageKey();
            String str = this.f34077x4;
            if (str == null || !str.equals(imageKey)) {
                this.f34067w4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.C4.getBitmapSafe();
                int orientation = this.C4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.x21(this, bitmapSafe, orientation, imageKey, 8));
                }
            }
        }
    }

    public final boolean Q1() {
        if (this.f33887c2 != 11) {
            int i10 = this.P4;
            if (i10 >= 0) {
                ArrayList arrayList = this.f33928g7;
                if (i10 < arrayList.size()) {
                    cv0 cv0Var = this.d;
                    if (cv0Var != null && !cv0Var.N()) {
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

    public final boolean Q2(int i10) {
        yu0 yu0Var = this.f33954j7;
        if (yu0Var != null) {
            if ((yu0Var.a(i10) || this.f33954j7.e(i10)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f33954j7.b(i10);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f33954j7.d(i10) instanceof TLRPC.Document)) {
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
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Z7)), this.Y7);
        edit.commit();
        D3();
        B3();
    }

    public final boolean R1() {
        if (this.f33903e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void S0() {
        ib0 ib0Var = this.f33978m7;
        if (ib0Var != null) {
            ib0Var.destroy();
            this.f33978m7 = null;
        }
        yf.j0 j0Var = this.f33877b2;
        if (j0Var != null) {
            j0Var.destroy();
            this.f33877b2 = null;
        }
        try {
            if (this.f33921g0.getParent() != null) {
                ((WindowManager) this.f34082y.getSystemService("window")).removeView(this.f33921g0);
                W1();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void S1() {
        WindowManager.LayoutParams layoutParams = this.f33894d0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.f34082y.getSystemService("window")).updateViewLayout(this.f33921g0, this.f33894d0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f33921g0.setFocusable(true);
        this.f33904e0.setFocusable(true);
    }

    public final void S2(AlertDialog$Builder alertDialog$Builder) {
        if (this.f34082y != null) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.P1;
                if (b2Var != null) {
                    b2Var.dismiss();
                    this.P1 = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
                this.P1 = o9;
                o9.setCanceledOnTouchOutside(true);
                this.P1.setOnDismissListener(new r5(this, 10));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void T0(android.graphics.Canvas r51, org.telegram.ui.Components.qa r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T0(android.graphics.Canvas, org.telegram.ui.Components.qa, int, int, boolean, boolean, boolean):void");
    }

    public final void T1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f7, boolean z10) {
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
        createBitmap.compress(g12, i10, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (z11) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final boolean T2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33975m4;
        if ((n2Var instanceof zn) && ChatObject.isChannelAndNotMegaGroup(((zn) n2Var).f44753e)) {
            org.telegram.ui.Components.tc f7 = new org.telegram.ui.Components.ad(frameLayout, this.f34055v2).f(MessagesController.getInstance(this.T).captionLengthLimitPremium, new ir0(this, 26));
            f7.v = new ir0(this, 27);
            this.f33988n7 = f7.j();
            return true;
        }
        return false;
    }

    public final void U0(android.graphics.Canvas r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U0(android.graphics.Canvas, float, float):void");
    }

    public final void U1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U1(boolean):void");
    }

    public final void U2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34082y, 0, this.f34055v2);
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.T4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.T4.currentAccount).isLoadingFile(this.f33890c5[0])) {
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PleaseDownload);
        }
        S2(alertDialog$Builder);
    }

    public final void V0(Canvas canvas) {
        boolean z10;
        float e7;
        int i10;
        if (this.S4) {
            if (!SharedConfig.photoViewerBlur) {
                e7 = 1.0f;
            } else {
                int i11 = this.f33985n4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e7 = this.E8.e(z10);
            }
            if (e7 <= 0.0f) {
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f33904e0.getWidth(), this.f33904e0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e7 * (this.L0.getAlpha() - 127) * 2.007874f), 31);
            this.G7.rewind();
            float f7 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.G7.addRect(0.0f, 0.0f, this.f33904e0.getWidth(), f7, direction);
            this.G7.addRect(0.0f, (this.f33904e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f33904e0.getWidth(), this.f33904e0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.G7);
            canvas.drawColor(-16777216);
            T0(canvas, this.f33885c0, 0, 0, true, true, false);
            canvas.save();
            this.L7.reset();
            this.L7.postScale(1.0f, f7 / 16.0f);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f33904e0.getWidth(), f7, this.H7);
            this.M7.reset();
            this.M7.postScale(1.0f, i12 / 16.0f);
            this.M7.postTranslate(0.0f, (this.f33904e0.getHeight() - i12) + AndroidUtilities.navigationBarHeight);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f33904e0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f33904e0.getWidth(), this.f33904e0.getHeight() + AndroidUtilities.navigationBarHeight, this.I7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void V1(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V1(android.graphics.Canvas):void");
    }

    public final void V2(final org.telegram.ui.Components.od odVar, boolean z10, boolean z11, final float[] fArr) {
        float f7;
        float f10;
        int i10;
        cv0 cv0Var = this.d;
        if (cv0Var != null && cv0Var.l()) {
            f7 = 175.0f;
        } else {
            f7 = 58.0f;
        }
        float dp = AndroidUtilities.dp(f7);
        float f11 = 1.0f;
        if (odVar == this.V1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f12 = dp * f10;
        Integer num = null;
        if (!z11) {
            odVar.animate().setListener(null).cancel();
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            odVar.setVisibility(i10);
            if (z10) {
                f12 = 0.0f;
            }
            odVar.setTranslationY(f12);
            float alpha = this.P0.getAlpha();
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[0] = f11;
            odVar.setAlpha(alpha * f11);
        } else if (z10 && odVar.getTag() == null) {
            if (odVar.getVisibility() != 0) {
                odVar.setVisibility(0);
                odVar.setAlpha(this.P0.getAlpha());
                odVar.setTranslationY(f12);
            }
            odVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f37073b;

                {
                    this.f37073b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f37073b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = odVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f33905e1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33914f1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33922g1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.G1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f37073b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = odVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f33905e1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33914f1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33922g1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.G1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.hs.h).start();
        } else if (!z10 && odVar.getTag() != null) {
            odVar.animate().translationY(f12).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f37073b;

                {
                    this.f37073b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f37073b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = odVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f33905e1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33914f1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33922g1.setTranslationY(photoViewer.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.G1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f37073b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = odVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f33905e1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33914f1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33922g1.setTranslationY(photoViewer2.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.G1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.hs.h).withEndAction(new nh(3, odVar)).start();
        }
        if (z10) {
            num = 1;
        }
        odVar.setTag(num);
    }

    @Override
    public final void W0() {
        E1();
    }

    public final void W1() {
        Activity activity = this.f34082y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f33778a1.remove(this.f34027s1);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f33975m4;
        if (n2Var != null && n2Var.getFragmentView() != null) {
            this.f33977m6 = 1.0f;
            View fragmentView = this.f33975m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.yi yiVar = this.a2;
            if (yiVar != null) {
                org.telegram.ui.ActionBar.d3 container = yiVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void W2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        cv0 cv0Var = this.d;
        boolean z14 = false;
        if (cv0Var != null && cv0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        bt0 bt0Var = this.U1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(bt0Var, z13, z11, this.f34089y7);
        ct0 ct0Var = this.V1;
        if (z10 && z12) {
            z14 = true;
        }
        V2(ct0Var, z14, z11, this.f34098z7);
    }

    public final void X0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void X1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.F2 != null && this.T4 != null) {
                    int intValue = Utilities.parseInt((CharSequence) url).intValue();
                    if (this.F2.p() == -9223372036854775807L) {
                        this.f33868a3 = intValue / ((float) this.T4.getDuration());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.F2.K(j3);
                    this.f34010q3.h(((float) j3) / ((float) this.F2.p()), true);
                    this.f34019r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f34082y instanceof LaunchActivity) {
                    ty tyVar = new ty(null);
                    tyVar.f42219n2 = url;
                    ((LaunchActivity) this.f34082y).q0(tyVar, false, true);
                    G0(false, false);
                    return;
                }
                return;
            } else if (this.l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.v61) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.g5.p0(this.l4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void X2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X2(boolean, boolean):void");
    }

    public final void Y0(TLRPC.Document document, TLRPC.Document document2, boolean z10, Utilities.Callback2 callback2) {
        float f7;
        this.f34051u7 = document;
        this.f34042t7 = document2;
        this.f34060v7 = z10;
        this.f34070w7 = false;
        this.f34080x7 = callback2;
        this.f33881b6 = 0.0f;
        this.f33919f6 = 0.0f;
        if (this.p5 != null) {
            ou0 ou0Var = this.f34087y5;
            if (ou0Var != null) {
                ou0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList = this.f34021r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f34051u7 != null) {
            ArrayList arrayList2 = this.f34021r5;
            if (arrayList2 == null) {
                this.f34021r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f34051u7, Integer.valueOf(this.T));
            if (findStickerEmoticons != null) {
                this.f34021r5.addAll(findStickerEmoticons);
            }
        }
        ou0 ou0Var2 = this.f34040t5;
        if (ou0Var2 != null) {
            ou0Var2.setCutOutState(false);
        }
        a3(true, false);
        ImageView imageView = this.f33886c1;
        if (imageView != null) {
            if (this.f34060v7) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
        }
    }

    public final void Y1(ev0 ev0Var) {
        if (this.f34046u2) {
            o2(true);
        }
        MessageObject messageObject = this.T4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        }
        this.f33903e = false;
        this.f33912f = false;
        this.f33923g2 = false;
        this.f34030s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f33870a5 = null;
        this.f33880b5 = null;
        this.f33944i5 = null;
        this.f33909e5 = null;
        this.f34009q2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f33942i3 != null) {
            P2(false, false);
        }
        cu0 cu0Var = this.T1;
        if (cu0Var != null) {
            cu0Var.scrollTo(0, 0);
        }
        this.f33887c2 = 0;
        this.f33896d2 = false;
        this.f33906e2 = false;
        this.f33915f2 = false;
        this.f33932h2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f33952j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f33952j5 = null;
        }
        this.a2 = null;
        yf.j0 j0Var = this.f33877b2;
        if (j0Var != null) {
            j0Var.destroy();
            this.f33877b2 = null;
        }
        org.telegram.ui.Components.f6 f6Var = this.f33950j2;
        if (f6Var != null) {
            f6Var.w(this.f33904e0);
            this.f33950j2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            av0 av0Var = this.W0[i10];
            if (av0Var != null) {
                av0Var.d(-1, false, true);
            }
        }
        p2(0);
        ys0 ys0Var = this.S7;
        if (ys0Var != null) {
            ys0Var.a();
        }
        this.f33982n1.e(0, false);
        this.C4.setImageBitmap((Bitmap) null);
        this.F4.a();
        this.B4.setImageBitmap((Bitmap) null);
        this.E4.a();
        this.D4.setImageBitmap((Bitmap) null);
        this.G4.a();
        this.f33904e0.post(new kr0(this, ev0Var, 0));
        cv0 cv0Var = this.d;
        if (cv0Var != null) {
            cv0Var.G();
        }
        org.telegram.ui.Components.m40 m40Var = this.l1;
        m40Var.d.clear();
        m40Var.f28671e.clear();
        m40Var.f28669c.clear();
        cv0 cv0Var2 = this.d;
        if (cv0Var2 != null) {
            cv0Var2.D();
        }
        this.d = null;
        this.f34000p1.l();
        this.f33954j7 = null;
        this.f34030s4 = false;
        this.f33998o8 = 0.0f;
        this.f34006p8 = 1.0f;
        if (ev0Var != null) {
            ev0Var.f37356a.setVisible(true, true);
        }
        zn znVar = this.l4;
        if (znVar != null) {
            znVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
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
            this.f33873a8 = this.Y7;
        }
        AnimatorSet animatorSet = this.U7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.U7 = new AnimatorSet();
        float f19 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f33948j0.setVisibility(0);
                View view = this.f33948j0;
                if (this.f33887c2 == 11) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                view.setAlpha(f18);
                View view2 = this.f33948j0;
                if (this.f33887c2 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.O7.setTag(1);
            AnimatorSet animatorSet2 = this.U7;
            t5 t5Var = this.P0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.U1.getEditTextHeight() + t5Var.getHeight();
            if (this.f34017r1) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t5Var, property, 0.0f, editTextHeight + i10);
            t5 t5Var2 = this.P0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t5Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.S0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f33948j0;
            if (this.S4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f17, 1.0f));
        } else {
            this.O7.setTag(null);
            AnimatorSet animatorSet3 = this.U7;
            gv0 gv0Var = this.O7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gv0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.P7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f33948j0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f7));
        }
        this.U7.addListener(new ut0(this, z10, 3));
        this.U7.setDuration(200L);
        this.U7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.U7.start();
        float f20 = 0.25f;
        if (this.f33905e1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f33905e1.animate();
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
        if (this.f33914f1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f33914f1.animate();
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
        if (this.f33922g1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f33922g1.animate();
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

    public final void Z1(org.telegram.messenger.MessageObject r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.ImageLocation r24, org.telegram.messenger.ImageLocation r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.ev0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z1(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.ev0):void");
    }

    public final void Z2() {
        long a2;
        if (this.f34082y != null) {
            zn znVar = this.l4;
            if (znVar != null) {
                a2 = znVar.a();
            } else {
                cv0 cv0Var = this.d;
                if (cv0Var != null) {
                    a2 = cv0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a2;
            org.telegram.ui.Components.g5.J(this.f34082y, j3, -1L, 0, false, new qr0(this), null, new org.telegram.ui.Components.e5(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false)), null);
        }
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        if (org.telegram.ui.Components.gh0.f26700p0.P) {
            org.telegram.ui.Components.gh0.j(false);
        }
        this.Q8 = pVar;
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            k81Var.U(null);
            this.F2.V(null);
            this.F2.C();
            this.F2.V(this.R8);
        }
        ((WindowManager) this.f34082y.getSystemService("window")).removeView(this.f33921g0);
        this.S8 = true;
        this.f33921g0.invalidate();
    }

    public final boolean a2(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a2(android.view.MotionEvent):boolean");
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
            qg.o2 o2Var = this.p5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o2Var.setVisibility(i11);
            this.p5.setAlpha(this.P0.getAlpha());
            this.f34031s5.animate().setListener(null).cancel();
            ai.o4 o4Var = this.f34031s5;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            o4Var.setVisibility(i12);
            ai.o4 o4Var2 = this.f34031s5;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            o4Var2.setAlpha(f11);
        } else if (z10 && this.p5.getTag() == null) {
            this.p5.animate().setListener(null).cancel();
            this.f34031s5.animate().setListener(null).cancel();
            if (this.p5.getVisibility() != 0) {
                this.p5.setVisibility(0);
                this.p5.animate().alpha(1.0f).start();
                this.f34031s5.setVisibility(0);
                this.f34031s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.p5.getTag() != null) {
            this.p5.animate().setListener(null).cancel();
            this.p5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.fa(this.p5)).start();
            this.f34031s5.animate().setListener(null).cancel();
            this.f34031s5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.fa(this.f34031s5)).start();
        }
        qg.o2 o2Var2 = this.p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        o2Var2.setTag(num);
        if (z10 && this.f34040t5.f46222j0 != 1 && !this.f34060v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f34040t5.animate().setListener(null).cancel();
            ou0 ou0Var = this.f34040t5;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ou0Var.setVisibility(i10);
            ou0 ou0Var2 = this.f34040t5;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ou0Var2.setAlpha(f10);
        } else if (z12 && this.f34040t5.getTag() == null) {
            this.f34040t5.animate().setListener(null).cancel();
            if (this.f34040t5.getVisibility() != 0) {
                this.f34040t5.setVisibility(0);
            }
            this.f34040t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f34040t5.getTag() != null) {
            this.f34040t5.animate().setListener(null).cancel();
            this.f34040t5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.fa(this.f34040t5)).start();
        }
        ou0 ou0Var3 = this.f34040t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        ou0Var3.setTag(num2);
        if (z10 && this.f34040t5.f46222j0 == 1 && !this.f34060v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        X2(z13, z11);
        qg.o2 o2Var3 = this.p5;
        if (z10 && this.f34040t5.f46222j0 == 1 && this.f34087y5.f40601p0 && !this.f34058v5.f40601p0 && !this.f34068w5.f40601p0) {
            z14 = true;
        } else {
            z14 = false;
        }
        o2Var3.setOutlineVisible(z14);
        if (!z10 || this.f34040t5.f46222j0 != 1 || this.f34058v5.f40601p0 || this.f34068w5.f40601p0) {
            z15 = false;
        }
        if (!z11) {
            this.f34087y5.animate().setListener(null).cancel();
            ou0 ou0Var4 = this.f34087y5;
            if (z15) {
                i13 = 0;
            }
            ou0Var4.setVisibility(i13);
            ou0 ou0Var5 = this.f34087y5;
            if (z15) {
                f12 = 1.0f;
            }
            ou0Var5.setAlpha(f12);
            ou0 ou0Var6 = this.f34087y5;
            if (z15) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            ou0Var6.setScaleX(f7);
            ou0 ou0Var7 = this.f34087y5;
            if (!z15) {
                f13 = 0.8f;
            }
            ou0Var7.setScaleY(f13);
        } else if (z15 && this.f34087y5.getTag() == null) {
            this.f34087y5.animate().setListener(null).cancel();
            if (this.f34087y5.getVisibility() != 0) {
                this.f34087y5.setVisibility(0);
            }
            org.telegram.messenger.bi.t(this.f34087y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.hs.h, 400L);
        } else if (!z15 && this.f34087y5.getTag() != null) {
            this.f34087y5.animate().setListener(null).cancel();
            org.telegram.messenger.bi.t(this.f34087y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.fa(this.f34087y5)), org.telegram.ui.Components.hs.h, 400L);
        }
        ou0 ou0Var8 = this.f34087y5;
        if (!z15) {
            num3 = null;
        }
        ou0Var8.setTag(num3);
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Q8 = pVar;
        this.S8 = false;
        if (this.f33921g0 != null) {
            ((WindowManager) this.f34082y.getSystemService("window")).addView(this.f33921g0, this.f33894d0);
            this.f33921g0.invalidate();
        }
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            k81Var.U(null);
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

    public final int b1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.f33887c2 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final void b2(ArrayList arrayList, int i10, long j3, long j10, long j11, cv0 cv0Var) {
        f2((MessageObject) arrayList.get(i10), null, null, null, arrayList, null, null, i10, cv0Var, null, j3, j10, j11, true, null, null);
    }

    public final void b3(boolean z10) {
        Integer num;
        float f7;
        float f10;
        ju0 ju0Var;
        if (!z10 || this.f34029s3.getTag() == null) {
            if (!z10 && this.f34029s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f34029s3.f30731s && ((ju0Var = this.f33913f0) == null || !ju0Var.f30791x || ju0Var.v.isEmpty())) {
                this.f34047u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f34038t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mt0 mt0Var = this.f34029s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            mt0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34038t3 = animatorSet2;
            mt0 mt0Var2 = this.f34029s3;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mt0Var2, property, f7);
            mt0 mt0Var3 = this.f34029s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mt0Var3, property2, f10);
            mt0 mt0Var4 = this.f34029s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f12 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mt0Var4, property3, f12);
            mt0 mt0Var5 = this.f34029s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(mt0Var5, property4, f11));
            this.f34038t3.setDuration(380L);
            this.f34038t3.setInterpolator(org.telegram.ui.Components.hs.h);
            this.f34038t3.addListener(new it0(this, 1));
            this.f34038t3.start();
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
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.f33887c2 != 1)) {
                if (i10 == 3 && this.L1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f34025s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return this.L1.getAdditionalTop() + dp + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f34025s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i11;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f34025s) {
                    i11 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i11;
            }
        }
        return 0;
    }

    public final void c2(ArrayList arrayList, int i10, cv0 cv0Var) {
        f2(null, null, null, null, null, arrayList, null, i10, cv0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void c3(boolean z10, boolean z11) {
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
            ys0 ys0Var = this.S7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ys0Var, View.TRANSLATION_Y, ys0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.hs.f27118f);
            this.A7.start();
        } else if (!z10 && this.R7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            ys0 ys0Var2 = this.S7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ys0Var2, View.TRANSLATION_Y, ys0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.fa(this.R7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.hs.f27118f);
            this.A7.start();
        }
        FrameLayout frameLayout2 = this.R7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.R7.setTranslationY(this.P0.getTranslationY() - (this.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, this.U1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.R7;
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

    public final void d2(MessageObject messageObject, zn znVar, long j3, long j10, long j11, uu0 uu0Var) {
        f2(messageObject, null, null, null, null, null, null, 0, uu0Var, znVar, j3, j10, j11, true, null, null);
    }

    public final void d3() {
        org.telegram.ui.Components.k81 k81Var;
        if (this.f34017r1 && (k81Var = this.F2) != null && !k81Var.y()) {
            if (!this.f34015r || this.f33887c2 == 1) {
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

    public final ClippingImageView[] e1(ev0 ev0Var) {
        int i10;
        if (!AndroidUtilities.isTablet() && ev0Var != null && ev0Var.f37366m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f33930h0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = ev0Var.f37366m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(ev0Var.f37367n);
        }
        return clippingImageViewArr;
    }

    public final void e2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, uu0 uu0Var) {
        f2(null, fileLocation, imageLocation, null, null, null, null, 0, uu0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void e3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3(int):void");
    }

    @Override
    public final void f(Canvas canvas) {
        this.T8 = true;
        this.f33921g0.draw(canvas);
        this.T8 = false;
    }

    public final org.telegram.ui.Components.od f1() {
        cv0 cv0Var = this.d;
        if (cv0Var != null && cv0Var.A()) {
            return this.V1;
        }
        return this.U1;
    }

    public final boolean f2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.cv0 r25, org.telegram.ui.zn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.yu0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.cv0, org.telegram.ui.zn, long, long, long, boolean, org.telegram.ui.yu0, java.lang.Integer):boolean");
    }

    public final void f3(int i10, boolean z10) {
        if (this.T4 != null) {
            o2(false);
            FileLoader.getInstance(this.T).cancelLoadFile(this.T4.getDocument());
        } else if (this.f33944i5 != null) {
            TLObject d = this.f33954j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                o2(false);
                FileLoader.getInstance(this.T).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.m40 m40Var = this.l1;
        if (m40Var != null) {
            m40Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        C2(this.P4 + i10, z10, true, false);
        if (R2(this.T4) || Q2(this.P4)) {
            this.Y2 = true;
            U1(true);
            B0(0, true);
        }
        z0();
        try {
            b5.d.b(0);
            if (pf.b.I().L()) {
                pf.b.I().S(m1());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.f1 f1Var = this.f34053v0;
        if (f1Var != null && f1Var.isEnabled() && this.P3) {
            return true;
        }
        return false;
    }

    public final Bitmap.CompressFormat g1() {
        if (this.f33887c2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void g2(ArrayList arrayList, int i10, int i11, boolean z10, cv0 cv0Var, zn znVar) {
        boolean z11;
        org.telegram.ui.Components.r6 r6Var;
        this.f33932h2 = z10;
        ii.z1 z1Var = this.S0;
        int i12 = 0;
        if (z1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getLayoutParams();
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
            this.f34060v7 = false;
            ImageView imageView = this.f33886c1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            ou0 ou0Var = this.f34087y5;
            if (ou0Var != null) {
                ou0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList2 = this.f34021r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f33903e;
        BackgroundDrawable backgroundDrawable = this.L0;
        if (z12 && this.f33887c2 != i11 && i11 == 1) {
            this.f33887c2 = i11;
            this.f34046u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = cv0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f34000p1.l();
            this.f33954j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f33903e = true;
            this.f33912f = true;
            p3(false, false);
            this.f33966l2 = false;
            H0();
            j3(false, false);
            this.f33907e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            S1();
            backgroundDrawable.setAlpha(255);
            this.f33904e0.setAlpha(1.0f);
            Z1(null, null, null, null, null, null, arrayList, i10, null);
            F1();
            z2();
        } else if (z12 && this.f33887c2 != i11 && i11 == 11) {
            this.f33887c2 = i11;
            this.f34046u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = cv0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f34000p1.l();
            this.f33954j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f33903e = true;
            this.f33912f = true;
            p3(false, false);
            this.f33907e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            S1();
            backgroundDrawable.setAlpha(255);
            this.f33904e0.setAlpha(1.0f);
            Z1(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.f33887c2 = i11;
            if (i11 == 12) {
                this.f33887c2 = 0;
                this.f33896d2 = true;
            }
            int i13 = this.f33887c2;
            if (i13 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f33915f2 = z11;
            if (i13 == 13 || z11) {
                this.f33887c2 = 0;
                this.f33906e2 = true;
            }
            this.f33865a.a(z11, false);
            if (this.f33887c2 == 11) {
                this.f33948j0.setBackgroundColor(-16777216);
            }
            bv0 bv0Var = this.M;
            if (bv0Var != null && (r6Var = bv0Var.d) != null) {
                if (this.f33906e2) {
                    i12 = 8;
                }
                r6Var.setVisibility(i12);
            }
            f2(null, null, null, null, null, null, arrayList, i10, cv0Var, znVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void g3() {
        float f7;
        boolean z10;
        int i10;
        bu0 bu0Var;
        int i11;
        bu0 bu0Var2;
        this.q6 = null;
        this.P0.setVisibility(8);
        this.S0.setVisibility(8);
        this.f33981n0.setVisibility(8);
        this.f33905e1.setVisibility(8);
        this.f33914f1.setVisibility(8);
        this.f33922g1.setVisibility(8);
        org.telegram.ui.Components.vf0 vf0Var = this.C1;
        if (vf0Var != null) {
            vf0Var.setVisibility(4);
        }
        this.f33991o1.setVisibility(8);
        this.f33991o1.setAlpha(0.0f);
        this.f33991o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.O0.setRotationX(0.0f);
        this.f33991o1.setEnabled(false);
        this.K = false;
        if (this.f33941i2) {
            this.Q1.setVisibility(4);
        }
        int i12 = this.f33887c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.f33928g7.size() > 1)) {
            this.N0.setVisibility(8);
            this.O0.setVisibility(8);
            s3();
        }
        W2(false, true);
        a3(false, true);
        Bitmap bitmap = this.C4.getBitmap();
        float f10 = this.f33871a6;
        if (this.f33887c2 == 11) {
            this.f33945i6 = this.Y5;
            this.f33936h6 = this.X5;
            this.f33953j6 = f10;
            this.f33962k6 = this.f33881b6;
            this.f33919f6 = 0.0f;
        }
        tu0 tu0Var = this.X4;
        if (bitmap != null) {
            int bitmapWidth = this.C4.getBitmapWidth();
            int bitmapHeight = this.C4.getBitmapHeight();
            if (this.f33887c2 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.f33900d6 = dp;
                f7 = 0.0f;
                if (this.L1 != null) {
                    this.f33900d6 = (bu0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i13 = this.D1.f15533i;
                if (i13 == 90 || i13 == 270) {
                    i11 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f11 = bitmapWidth;
                    float f12 = i11;
                    this.f33910e6 = r2(false) * (Math.min(k1(3) / f11, h1(3, false) / f12) / Math.min(k1(this.f34048u4) / f11, i1() / f12));
                    Rect rect = this.f34028s2;
                    this.f33891c6 = (rect.left / 2) - (rect.right / 2);
                    this.f33987n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f112 = bitmapWidth;
                float f122 = i11;
                this.f33910e6 = r2(false) * (Math.min(k1(3) / f112, h1(3, false) / f122) / Math.min(k1(this.f34048u4) / f112, i1() / f122));
                Rect rect2 = this.f34028s2;
                this.f33891c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f33987n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f7 = 0.0f;
                int i14 = -AndroidUtilities.dp(44.0f);
                if (!this.f34025s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                float f13 = i14 + i10;
                this.f33900d6 = f13;
                if (this.L1 != null) {
                    float additionalTop = (bu0Var.getAdditionalTop() / 2.0f) + f13;
                    this.f33900d6 = additionalTop;
                    this.f33900d6 = additionalTop - (this.L1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = tu0Var.f42126c;
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
                    this.f33910e6 = r2(false) * (Math.min(k1(3) / f1122, h1(3, false) / f1222) / Math.min(k1(this.f34048u4) / f1122, i1() / f1222));
                    Rect rect22 = this.f34028s2;
                    this.f33891c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f33987n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = bitmapHeight;
                float f11222 = bitmapWidth;
                float f12222 = i11;
                this.f33910e6 = r2(false) * (Math.min(k1(3) / f11222, h1(3, false) / f12222) / Math.min(k1(this.f34048u4) / f11222, i1() / f12222));
                Rect rect222 = this.f34028s2;
                this.f33891c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f33987n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f7 = 0.0f;
        }
        bu0 bu0Var3 = this.L1;
        if (bu0Var3 != null) {
            if (this.f33887c2 == 11 && (tu0Var == null || tu0Var.f42126c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            bu0Var3.setDrawShadow(z10);
        }
        this.f33921g0.setClipChildren(true);
        this.f33948j0.setVisibility(4);
        this.f34004p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f7);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f7);
        ofFloat.addUpdateListener(new hr0(this, 6));
        ofFloat2.addUpdateListener(new hr0(this, 7));
        this.f34004p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.u6.f31383g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.L1.o0(true);
        this.f34004p6.setDuration(200L);
        this.f34004p6.addListener(new it0(this, 3));
        this.f34004p6.start();
    }

    public float getAnimationValue() {
        return this.f33969l6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f34082y);
        this.R8 = textureView;
        textureView.setOpaque(false);
        View view = this.P8;
        if (view != null) {
            view.bringToFront();
        }
        return this.R8;
    }

    public final int h1(int i10, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f34025s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f34028s2.bottom) + AndroidUtilities.displaySize.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.f33887c2 != 1 && !z11) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f33904e0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.f33887c2 == 1) || i10 == 1) {
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
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            k81Var.B();
            return;
        }
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null) {
            ju0Var.f();
        }
    }

    public final void h3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3():void");
    }

    public final boolean i() {
        if (!this.T8 && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap) {
            return true;
        }
        return false;
    }

    public final int i1() {
        return h1(this.f34048u4, false);
    }

    public final void i2() {
        qf.e eVar = this.G2;
        if (eVar != null) {
            eVar.b(true);
        }
        if (org.telegram.ui.Components.gh0.p() != null) {
            org.telegram.ui.Components.gh0.p().b(true);
        }
    }

    public final void i3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        c6.q e7;
        c6.q e10;
        float f7;
        int i10;
        c6.q e11;
        boolean z10;
        if (!R1()) {
            return;
        }
        this.O8 = true;
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            if (!b5.d.u() && !this.f34015r) {
                z10 = false;
            } else {
                z10 = true;
            }
            k81Var.O(z10);
        }
        if (this.F2 != null && b5.d.u() && ((atomicInteger = b5.d.f3760b) == null || atomicInteger.get() <= 0)) {
            e6.h e12 = b5.d.e();
            if (e12 == null) {
                a2 = -1;
            } else {
                a2 = e12.a();
            }
            if (a2 >= 0 && Math.abs(this.F2.n() - a2) > 1000) {
                this.F2.K(a2);
            }
            e6.h e13 = b5.d.e();
            if (e13 == null) {
                m10 = false;
            } else if (b5.d.f3759a == 0) {
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
                float g10 = b5.d.g();
                e6.h e14 = b5.d.e();
                float f10 = 0.5f;
                if (e14 == null || (e10 = e14.e()) == null) {
                    f7 = 0.5f;
                } else {
                    f7 = (float) e10.f4413r;
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
                    e6.h e15 = b5.d.e();
                    if (e15 != null && (e11 = e15.e()) != null) {
                        f10 = (float) e11.f4413r;
                    }
                    int i11 = i10 + ((int) (f10 * f11));
                    if (i11 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i11, 1);
                    }
                }
            }
            e6.h e16 = b5.d.e();
            float f12 = 1.0f;
            if (e16 != null && (e7 = e16.e()) != null) {
                f12 = (float) e7.d;
            }
            D0(true, false, f12);
        }
        xr xrVar = this.f34063w0;
        if (xrVar != null) {
            xrVar.a(b5.d.u());
        }
        this.O8 = false;
    }

    public final void j0(float f7, float f10, float f11, boolean z10) {
        if (this.f33871a6 == f7 && this.X5 == f10 && this.Y5 == f11) {
            return;
        }
        this.R6 = z10;
        this.f33910e6 = f7;
        this.f33891c6 = f10;
        this.f33900d6 = f11;
        this.f33987n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34004p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.u6.f31383g, 0.0f, 1.0f));
        this.f34004p6.setInterpolator(this.f34041t6);
        this.f34004p6.setDuration(250);
        this.f34004p6.addListener(new it0(this, 7));
        this.f34004p6.start();
    }

    public final int j1() {
        return k1(this.f34048u4);
    }

    public final void j2() {
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            k81Var.C();
            return;
        }
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null) {
            ju0Var.g();
        }
    }

    public final void j3(boolean z10, boolean z11) {
        k3(z10, z11, mu0.f39986e);
    }

    public final CharSequence k0() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        if (R1() && this.d != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f33928g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = f1().getText();
                boolean z10 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f34005p7 && !TextUtils.equals(this.f34013q7, text) && this.d.R(this.P4) != 0 && this.d.H() > 0) {
                    this.f34005p7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.T);
                zn znVar = this.l4;
                if (znVar == null || ((encryptedChat = znVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z10 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10);
                CharSequence charSequence = charSequenceArr[0];
                this.f34013q7 = charSequence;
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
                cv0 cv0Var = this.d;
                if (cv0Var != null) {
                    cv0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int k1(int i10) {
        int dp;
        int width = this.f33904e0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.f33887c2 != 1)) {
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

    public final void k3(boolean r17, boolean r18, org.telegram.ui.mu0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3(boolean, boolean, org.telegram.ui.mu0):void");
    }

    public final void l0(Canvas canvas, int i10, int i11, int i12, int i13, float f7, lg.g gVar, MediaController.CropState cropState) {
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
        int i18 = gVar.f15533i;
        if (i18 != 90 && i18 != 270) {
            i17 = i16;
            i16 = i17;
        }
        int i19 = this.f33887c2;
        if (i19 != 1 && (this.f34048u4 == 3 || this.f33996o6 == 3)) {
            f11 = 1.0f;
            f10 = f17;
        } else if (this.f34004p6 != null && (i14 = this.f33996o6) != -1) {
            int i20 = this.f34048u4;
            f10 = f17;
            if (i20 != 1 && i14 != 1 && ((i20 != 2 && i20 != 3) || i14 != -1)) {
                if (i14 == 0) {
                    f11 = this.f33969l6;
                } else {
                    f11 = 1.0f - this.f33969l6;
                }
            }
            f11 = 1.0f;
        } else {
            f10 = f17;
            int i21 = this.f34048u4;
            if (i21 == 2 || i21 == 3) {
                f11 = 0.0f;
            }
            f11 = 1.0f;
        }
        float f22 = gVar.f15534j;
        float f23 = gVar.f15535k;
        float f24 = i17;
        float f25 = 1.0f - f11;
        int A = (int) com.google.android.gms.internal.vision.e2.A(1.0f - f22, f25, f22, f24);
        float f26 = i16;
        int i22 = (int) ((((1.0f - f23) * f25) + f23) * f26);
        float f27 = A;
        float f28 = f16 / f27;
        float f29 = i22;
        if (f28 * f29 > f19) {
            f28 = f19 / f29;
        }
        if (i19 != 1 && ((this.f34048u4 != 1 || this.f33996o6 == 0) && cropState != null)) {
            float f30 = f27 * f28;
            float f31 = f29 * f28;
            if (f18 * f20 <= f19) {
                f21 = f18;
            }
            float y3 = com.google.android.gms.internal.vision.e2.y((f10 * f21) / f7, f30, f25, f30);
            float y10 = com.google.android.gms.internal.vision.e2.y((f20 * f21) / f7, f31, f25, f31);
            canvas.clipRect((-y3) / 2.0f, (-y10) / 2.0f, y3 / 2.0f, y10 / 2.0f);
        }
        int i23 = this.f33887c2;
        if (i23 == 1 || gVar.f15527a) {
            int i24 = this.f34048u4;
            if (i24 != 1 && i23 != 1) {
                if (cropState != null) {
                    f14 = cropState.cropScale;
                    f15 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f15 = 1.0f;
                }
                f12 = ((f28 / min) / com.google.android.gms.internal.vision.e2.y(f14, f15, f25, f15)) * f14;
            } else {
                float y11 = gVar.f15531f / com.google.android.gms.internal.vision.e2.y(gVar.f15536l, 1.0f, f25, 1.0f);
                float f32 = f16 / f24;
                if (f32 * f26 > f19) {
                    f32 = f19 / f26;
                }
                float f33 = (f32 / min) * y11;
                if (i23 == 1) {
                    if (i24 != 3 && (i15 = this.f33996o6) != 3) {
                        if (i15 == 0) {
                            f13 = gVar.f15537m;
                        }
                    } else {
                        f13 = ((gVar.f15537m - 1.0f) * f25) + 1.0f;
                    }
                    f33 /= f13;
                }
                f12 = f33;
            }
            float f34 = f12;
            canvas.translate(gVar.d * f11, gVar.f15530e * f11);
            canvas.scale(f34, f34);
            canvas.translate(com.google.android.gms.internal.vision.e2.C(gVar.f15528b, f24, min, f11), com.google.android.gms.internal.vision.e2.C(gVar.f15529c, f26, min, f11));
            float f35 = gVar.f15532g + i18;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            if (this.f33887c2 == 1 && (this.f34048u4 == 3 || this.f33996o6 == 3)) {
                canvas.rotate(f35);
            } else {
                canvas.rotate(f35 * f11);
            }
        }
        int[] iArr = this.N7;
        iArr[0] = A;
        iArr[1] = i22;
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
        if (!this.f34025s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.C1.getMeasuredWidth(), (this.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i10) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void l2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.MediaController.SavedFilterState r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.MediaController$SavedFilterState, boolean, long):void");
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
        qg.o2 o2Var = this.p5;
        if (o2Var != null) {
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(o2Var, property, f16));
        }
        if (this.p5 != null) {
            ai.o4 o4Var = this.f34031s5;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(o4Var, property, f15));
        }
        ii.z1 z1Var = this.S0;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(z1Var, property, f11));
        ii.z1 z1Var2 = this.S0;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(z1Var2, property2, f12));
        int i10 = this.f33887c2;
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
        if (!z10 && I1()) {
            E0(true);
            ci.g gVar = this.U1.f5555f;
            if (gVar.f33652e) {
                gVar.k(true);
            }
            ci.g gVar2 = this.V1.f5555f;
            if (gVar2.f33652e) {
                gVar2.k(true);
            }
            this.U1.f5555f.d();
            this.V1.f5555f.d();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m0():void");
    }

    public final pf.g m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m1():pf.g");
    }

    public final void m2() {
        qg.o2 o2Var = this.p5;
        if (o2Var != null && this.f33887c2 == 11) {
            if (this.f34060v7) {
                o2Var.b();
            } else {
                o2Var.m(this.C4.getBitmap(), this.C4.getOrientation(), k1(this.f34048u4), i1(), new or0(this, 0));
            }
        }
    }

    public final void m3(boolean z10, boolean z11) {
        float f7;
        ir0 ir0Var = this.f34072x;
        AndroidUtilities.cancelRunOnUIThread(ir0Var);
        int i10 = 0;
        if (z11) {
            n3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f34062w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f34062w = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    n3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(ir0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f34062w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                n3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f34062w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f34062w = null;
        }
        kd kdVar = this.X0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        kdVar.setAlpha(f7);
        kd kdVar2 = this.X0;
        if (!z10) {
            i10 = 4;
        }
        kdVar2.setVisibility(i10);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f11 = 1.0f - f7;
            this.T0.setTranslationY(AndroidUtilities.dp(36.0f) * f11);
            this.T0.setAlpha(f7);
            org.telegram.ui.Components.mg0 mg0Var = this.T0;
            int i13 = 8;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            mg0Var.setVisibility(i11);
            if (this.f33915f2) {
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
                ii.z1 z1Var = this.S0;
                if (i14 < 0) {
                    i13 = 0;
                }
                z1Var.setVisibility(i13);
                this.S0.setAlpha(f11);
                this.S0.setTranslationY(AndroidUtilities.dp(36.0f) * f7);
            }
        }
    }

    public final void n0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0(android.graphics.Bitmap):void");
    }

    public final org.telegram.messenger.VideoEditedInfo n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void n2(String str, long j3, boolean z10, float f7, float f10, int i10, long j10) {
        boolean z11;
        int parseInt;
        if (this.f34081x8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f34081x8);
            this.f34081x8 = null;
        }
        ys0 ys0Var = this.S7;
        ys0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        ys0Var.f32583y = mediaMetadataRetriever;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ys0Var.f32581w = z11;
        ys0Var.d = f7;
        ys0Var.f32575e = f10;
        float f11 = ys0Var.f32580s;
        if (f11 < f7) {
            ys0Var.f32580s = f7;
        } else if (f11 > f10) {
            ys0Var.f32580s = f10;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                ys0Var.f32582x = open;
                ys0Var.f32583y.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = ys0Var.f32583y.extractMetadata(9);
            if (extractMetadata != null) {
                ys0Var.f32568a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = ys0Var.f32583y.extractMetadata(18);
            if (extractMetadata2 != null) {
                ys0Var.f32570b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = ys0Var.f32583y.extractMetadata(19);
            if (extractMetadata3 != null) {
                ys0Var.f32572c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = ys0Var.f32583y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = ys0Var.f32570b;
                ys0Var.f32570b = ys0Var.f32572c;
                ys0Var.f32572c = i12;
            }
            if (ys0Var.f32581w) {
                ys0Var.f32577f = (float) ((j10 / 1000.0d) / ys0Var.f32568a);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ys0Var.invalidate();
        this.f34090y8 = null;
        if (!z10 && this.f33887c2 != 1) {
            z12 = false;
        }
        this.f34015r = z12;
        this.Z7 = -1;
        this.f33883b8 = 0;
        this.f33955j8 = 25;
        this.f34052u8 = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ku0 ku0Var = new ku0(this, str, j3, i10);
        this.f34081x8 = ku0Var;
        dispatchQueue.postRunnable(ku0Var);
    }

    public final void n3(boolean z10) {
        float f7;
        if (z10) {
            this.X0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34062w = animatorSet;
        kd kdVar = this.X0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(kdVar, property, f7));
        this.f34062w.setDuration(200L);
        this.f34062w.addListener(new ut0(this, z10, 1));
        this.f34062w.start();
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
        float f17;
        MediaController.CropState cropState;
        if (this.f34004p6 != null) {
            f13 = AndroidUtilities.lerp(0.0f, this.f33927g6, this.f33969l6);
            f7 = AndroidUtilities.lerp(this.f33871a6, this.f33910e6, this.f33969l6);
            f10 = AndroidUtilities.lerp(this.f33881b6, this.f33919f6, this.f33969l6);
            f11 = AndroidUtilities.lerp(this.Y5, this.f33900d6, this.f33969l6);
            f12 = AndroidUtilities.lerp(this.X5, this.f33891c6, this.f33969l6);
        } else {
            f7 = this.f33871a6;
            f10 = this.f33881b6;
            f11 = this.Y5;
            f12 = this.X5;
            if (this.f33987n6 != 0) {
                f12 = this.f33891c6;
                f11 = this.f33900d6;
                f7 = this.f33910e6;
            }
            f13 = 0.0f;
        }
        int k12 = k1(this.f34048u4);
        int i12 = i1();
        canvas.translate(b1(this.f34048u4), c1(this.f34048u4));
        canvas.translate(f12, f11 + 0.0f);
        canvas.scale(f7, f7);
        canvas.rotate(f10);
        int bitmapWidth = this.C4.getBitmapWidth();
        int bitmapHeight = this.C4.getBitmapHeight();
        float f18 = k12;
        float f19 = bitmapWidth;
        float f20 = f18 / f19;
        float f21 = i12;
        float f22 = bitmapHeight;
        float f23 = f21 / f22;
        float min = Math.min(f20, f23);
        lg.g gVar = this.D1;
        int i10 = gVar.f15533i;
        if (i10 != 90 && i10 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f24 = gVar.f15534j;
        float f25 = gVar.f15535k;
        float f26 = bitmapHeight;
        float f27 = bitmapWidth;
        float f28 = f7;
        float f29 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        float f30 = f18 / f29;
        float f31 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        if (f30 * f31 > f21) {
            f30 = f21 / f31;
        }
        int i11 = this.f33887c2;
        float f32 = f30;
        tu0 tu0Var = this.X4;
        if (i11 != 1 && ((this.f34048u4 != 1 || this.f33996o6 == 0) && tu0Var.f42126c != null)) {
            float f33 = f29 * f32;
            float f34 = f31 * f32;
            if (f20 * f22 > f21) {
                f20 = f23;
            }
            float y3 = com.google.android.gms.internal.vision.e2.y((f19 * f20) / f28, f33, 0.0f, f33);
            float y10 = com.google.android.gms.internal.vision.e2.y((f22 * f20) / f28, f34, 0.0f, f34);
            canvas.clipRect((-y3) / 2.0f, (-y10) / 2.0f, y3 / 2.0f, y10 / 2.0f);
        }
        if (this.f33887c2 == 1 || gVar.f15527a) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                MediaController.CropState cropState2 = tu0Var.f42126c;
                if (cropState2 != null && cropState2.mirrored) {
                    f16 = -1.0f;
                } else {
                    f16 = 1.0f;
                }
                textureView.setScaleX(f16);
                vu0 vu0Var = this.E2;
                if (vu0Var != null) {
                    vu0Var.setScaleX(this.B2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = tu0Var.f42126c;
            if (cropState3 != null) {
                f14 = cropState3.cropScale;
                f15 = 1.0f;
            } else {
                f14 = 1.0f;
                f15 = 1.0f;
            }
            float y11 = ((f32 / min) / com.google.android.gms.internal.vision.e2.y(f14, f15, 0.0f, f15)) * f14;
            canvas.translate(gVar.d * f15, gVar.f15530e * f15);
            canvas.scale(y11, y11);
            canvas.translate(com.google.android.gms.internal.vision.e2.C(gVar.f15528b, f26, min, f15), com.google.android.gms.internal.vision.e2.C(gVar.f15529c, f27, min, f15));
            float f35 = gVar.f15532g + i10;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            canvas.rotate(f35);
        }
        if (!this.f33928g7.isEmpty() && (cropState = tu0Var.f42126c) != null && cropState.mirrored) {
            f17 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f17 = 1.0f;
        }
        if (f13 > 0.0f) {
            canvas.scale(f17 - (2.0f * f13), f17);
            canvas.skew(0.0f, org.telegram.messenger.q.z(f17, f13, 4.0f * f13, 0.25f));
        }
    }

    public final long o1() {
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null && ju0Var.f30791x) {
            return ju0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.n();
    }

    public final void o2(boolean z10) {
        int i10 = 0;
        this.D2 = false;
        qf.e eVar = this.G2;
        if (eVar != null) {
            eVar.c();
            this.G2 = null;
        }
        org.telegram.ui.Components.k81 k81Var = this.F2;
        HashMap hashMap = W8;
        at0 at0Var = this.f34075x2;
        if (k81Var != null) {
            u0();
            AndroidUtilities.cancelRunOnUIThread(this.f34065w2);
            AndroidUtilities.cancelRunOnUIThread(at0Var);
            if (this.f33888c3 != null) {
                float n10 = ((float) this.F2.n()) / ((float) this.F2.p());
                String str = this.f33888c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new iv0(n10));
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
        if (this.f33913f0 != null) {
            AndroidUtilities.cancelRunOnUIThread(at0Var);
            if (this.f33888c3 != null) {
                float o12 = ((float) o1()) / ((float) A1());
                String str2 = this.f33888c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new iv0(o12));
                MessageObject messageObject2 = this.T4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(o12);
                }
            }
        }
        nt0 nt0Var = this.W3;
        if (nt0Var != null) {
            nt0Var.disable();
            this.W3 = null;
        }
        this.f34029s3.a();
        m3(false, false);
        this.f34018r2 = false;
        this.U2 = false;
        if (this.f34053v0.isEnabled()) {
            this.f34053v0.setEnabled(false);
            this.f34053v0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f33933h3) {
            try {
                this.f34082y.getWindow().clearFlags(128);
                this.f33933h3 = false;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        tt0 tt0Var = this.f34085y2;
        if (tt0Var != null) {
            try {
                this.f33904e0.removeView(tt0Var);
            } catch (Throwable unused) {
            }
            this.f34085y2 = null;
        }
        s0();
        this.f34093z2 = null;
        TextureView textureView = this.B2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.z71) {
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) textureView;
                org.telegram.ui.Components.l00 l00Var = z71Var.f33491b;
                if (l00Var != null) {
                    l00Var.postRunnable(new org.telegram.ui.Components.i00(l00Var, 0));
                }
                z71Var.f33490a = null;
            }
            this.B2 = null;
        }
        this.f33875b0.e();
        if (this.C2 != null) {
            this.C2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f33934h4);
        }
        if (!z10 && !this.B8 && !this.C8) {
            P2(false, true);
        }
        av0 av0Var = this.W0[0];
        while (true) {
            float[] fArr = av0Var.f36025n;
            if (i10 < fArr.length) {
                av0Var.f36024m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                av0Var.a();
                return;
            }
        }
    }

    public final void o3(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i10 = this.f33887c2;
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
            boolean[] zArr = this.f34064w1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f33904e0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.hasImageSet()) {
                        zArr[0] = true;
                        this.f33904e0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f33904e0.getMeasuredWidth() - min && this.D4.hasImageSet()) {
                    zArr[1] = true;
                    this.f33904e0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f33871a6 != 1.0f && this.f33887c2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f7), Math.round(f10), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f33904e0.postInvalidate();
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
        if (this.Z7 == 1) {
            return new Size(this.f33893c8, this.f33902d8);
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
        if (this.f33893c8 > this.f33902d8) {
            i10 = this.f33893c8;
        } else {
            i10 = this.f33902d8;
        }
        float f10 = f7 / i10;
        if (this.Y7 == this.Z7 - 1 && f10 >= 1.0f) {
            i11 = this.f33893c8;
            round = this.f33902d8;
        } else {
            int round2 = Math.round((this.f33893c8 * f10) / 2.0f) * 2;
            round = Math.round((this.f33902d8 * f10) / 2.0f) * 2;
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
        ArrayList arrayList2 = this.f33872a7;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f33892c7;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.f33882b7;
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
        if (this.f34090y8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f34090y8);
        }
        if (this.C8 && !this.f34099z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C8 = false;
        this.A8 = false;
        this.Q7.setVisibility(4);
        if (i10 == 1) {
            if (this.f33920f8 == this.f33902d8 && this.f33911e8 == this.f33893c8) {
                this.f34099z8 = false;
                av0 av0Var = this.W0[0];
                if (av0Var.h != 0 && av0Var.f36022k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                av0Var.f(0.0f, z12);
                this.W0[0].d(3, false, true);
                if (!z10) {
                    l2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.F2.K(this.S7.getLeftProgress() * this.f33947i8);
                } else {
                    this.A8 = true;
                }
            } else {
                o2(false);
                if (this.f34090y8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f20059id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f34090y8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f34090y8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f34090y8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.f33883b8;
                    videoEditedInfo.originalWidth = this.f33893c8;
                    this.f34090y8.videoEditedInfo.originalHeight = this.f33902d8;
                    VideoEditedInfo videoEditedInfo2 = this.f34090y8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f33955j8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f34090y8.videoEditedInfo;
                long j3 = this.f33979m8;
                videoEditedInfo3.startTime = j3;
                long j10 = this.f33989n8;
                videoEditedInfo3.endTime = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f33947i8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    videoEditedInfo3.endTime = j3 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f33929g8;
                this.f34090y8.videoEditedInfo.resultWidth = this.f33911e8;
                this.f34090y8.videoEditedInfo.resultHeight = this.f33920f8;
                VideoEditedInfo videoEditedInfo4 = this.f34090y8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f33947i8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f34090y8, true, true, true)) {
                    this.f34099z8 = true;
                }
                this.C8 = true;
                av0 av0Var2 = this.W0[0];
                if (av0Var2.h != 0 && av0Var2.f36022k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                av0Var2.f(0.0f, z11);
                this.W0[0].d(0, false, true);
            }
        } else {
            this.f34099z8 = false;
            this.W0[0].d(3, false, true);
            if (i10 == 2) {
                l2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.F2.K(this.S7.getLeftProgress() * this.f33947i8);
            }
        }
        this.f33904e0.invalidate();
    }

    public final void p3(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (z10 != this.K) {
            if (z10) {
                this.f33991o1.setVisibility(0);
            }
            this.K = z10;
            this.f33991o1.setEnabled(z10);
            float f13 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                kv0 kv0Var = this.f33991o1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(kv0Var, property, f11));
                kv0 kv0Var2 = this.f33991o1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(kv0Var2, property2, f12));
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
                    this.B1.addListener(new it0(this, 4));
                }
                this.B1.setDuration(200L);
                this.B1.start();
                return;
            }
            kv0 kv0Var3 = this.f33991o1;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            kv0Var3.setAlpha(f7);
            kv0 kv0Var4 = this.f33991o1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(10.0f);
            }
            kv0Var4.setTranslationY(f10);
            CounterView counterView2 = this.O0;
            if (!z10) {
                f13 = 0.0f;
            }
            counterView2.setRotationX(f13);
            if (!z10) {
                this.f33991o1.setVisibility(8);
            }
        }
    }

    public final boolean q0(MotionEvent motionEvent) {
        boolean z10;
        ju0 ju0Var;
        if (this.F2 != null || ((ju0Var = this.f33913f0) != null && ju0Var.f30791x)) {
            if (motionEvent.getX() >= (k1(this.f34048u4) / 3) * 2) {
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
        org.telegram.ui.Components.k81 k81Var;
        org.telegram.ui.Components.k81 k81Var2;
        ju0 ju0Var;
        org.telegram.ui.Components.k81 k81Var3 = this.F2;
        if (k81Var3 == null && ((ju0Var = this.f33913f0) == null || !ju0Var.f30791x)) {
            return;
        }
        if (k81Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f33913f0.G;
        }
        u0();
        AndroidUtilities.cancelRunOnUIThread(this.f34075x2);
        if (z10) {
            h2();
        } else {
            if (this.f34017r1) {
                if (Math.abs(this.S7.getProgress() - this.S7.getRightProgress()) < 0.01f || ((k81Var2 = this.F2) != null && k81Var2.n() == this.F2.p())) {
                    u2(this.S7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f34010q3.c() - this.S7.getRightProgress()) < 0.01f || ((k81Var = this.F2) != null && k81Var.n() == this.F2.p())) {
                    u2(0.0f);
                }
                s2();
            }
            j2();
        }
        this.f33904e0.invalidate();
    }

    public final boolean r0() {
        zn znVar = this.l4;
        if (znVar != null) {
            if (znVar.f44765f == null) {
                TLRPC.Chat chat = znVar.f44753e;
                if (chat != null && !ChatObject.isNotInChat(chat)) {
                    if (ChatObject.canSendPhoto(this.l4.f44753e) || ChatObject.canSendVideo(this.l4.f44753e)) {
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
                    return a1.g.s(sb2, secureDocument.secureFile.f20173id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.f33872a7;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.Y6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.f33928g7;
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
                yu0 yu0Var = this.f33954j7;
                if (yu0Var != null) {
                    return yu0Var.c(i10);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i10 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i10);
                    ImageLocation imageLocation2 = (ImageLocation) this.f33882b7.get(i10);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(imageLocation2.location.volume_id);
                            sb4.append("_");
                            return a1.g.o(imageLocation2.location.local_id, ".mp4", sb4);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(imageLocation.location.volume_id);
                        sb5.append("_");
                        return a1.g.o(imageLocation.location.local_id, ".jpg", sb5);
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
        if (this.f33887c2 == 11) {
            int k12 = k1(this.f34048u4);
            if (k12 == 0) {
                k12 = AndroidUtilities.displaySize.x;
            }
            float D = org.telegram.messenger.bi.D(20.0f, k12, 1) / k12;
            if (z10) {
                int bitmapWidth = this.C4.getBitmapWidth();
                int bitmapHeight = this.C4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i10 = this.P4) >= 0) {
                    ArrayList arrayList = this.f33928g7;
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
            av0 av0Var = this.W0[0];
            int i10 = av0Var.h;
            if (av0Var.f36027p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
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
        View view = this.f34093z2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f34093z2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.A2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A2 = null;
        }
        org.telegram.ui.Components.vf0 vf0Var = this.C1;
        if (vf0Var != null && (animatorSet = vf0Var.f31774s) != null) {
            animatorSet.cancel();
            vf0Var.f31774s = null;
            vf0Var.f31771f = false;
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
                ArrayList arrayList2 = this.f33872a7;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f33892c7;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (ImageLocation) this.f33882b7.get(i10);
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
        if (!H1()) {
            MessageObject messageObject = this.T4;
            if (messageObject == null || !messageObject.isSponsored()) {
                at0 at0Var = this.f34075x2;
                AndroidUtilities.cancelRunOnUIThread(at0Var);
                AndroidUtilities.runOnUIThread(at0Var, 3000);
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
            bv0 bv0Var = this.M;
            ValueAnimator valueAnimator = bv0Var.f36444n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                bv0Var.f36444n = null;
            }
            bv0Var.f36445r = f7;
            bv0Var.f36441c[0].setRightPadding((int) f7);
            bv0Var.d.setRightPadding(f7);
        }
    }

    public void setAnimationValue(float f7) {
        this.f33969l6 = f7;
        this.f33904e0.invalidate();
        G1();
    }

    public final void t0() {
        if (this.f33887c2 == 11) {
            ou0 ou0Var = this.f34040t5;
            if (ou0Var.f46222j0 == 2) {
                ou0Var.setCutOutState(true);
                X2(true, true);
                this.p5.f();
                this.f33904e0.invalidate();
            }
        }
    }

    public final void t2(long j3) {
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null && ju0Var.f30791x) {
            ju0Var.i(j3);
        } else {
            org.telegram.ui.Components.k81 k81Var = this.F2;
            if (k81Var != null) {
                k81Var.K(j3);
            }
        }
        C3();
    }

    public final void t3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f34005p7) {
            charSequence = this.f34013q7;
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
            f1().setText(org.telegram.ui.Components.b6.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.ru editText = f1().f5555f.getEditText();
        zn znVar = this.l4;
        if (znVar != null && ((encryptedChat = znVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
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
        return this.f34028s2.left;
    }

    public final void u2(float f7) {
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            k81Var.K(f7 * ((float) k81Var.p()));
            return;
        }
        ju0 ju0Var = this.f33913f0;
        if (ju0Var != null) {
            ju0Var.i(f7 * ju0Var.getVideoDuration());
        }
    }

    public final void u3() {
        int i10 = org.telegram.ui.ActionBar.i6.f21208zf;
        int z12 = z1(i10);
        ii.z1 z1Var = this.S0;
        if (z1Var != null) {
            z1Var.k();
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
        ImageView imageView3 = this.f33886c1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f33886c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f33876b1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f33876b1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f33867a1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f33867a1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Components.ug0 ug0Var = this.U0;
        if (ug0Var != null) {
            ug0Var.f31497b.setTextColor(z12);
        }
        org.telegram.ui.Components.ug0 ug0Var2 = this.P7;
        if (ug0Var2 != null) {
            ug0Var2.f31497b.setTextColor(z12);
        }
        bu0 bu0Var = this.L1;
        if (bu0Var != null) {
            bu0Var.e();
        }
        org.telegram.ui.Components.kg0 kg0Var = this.I1;
        if (kg0Var != null) {
            ImageView imageView6 = kg0Var.B0;
            ImageView imageView7 = kg0Var.A0;
            ImageView imageView8 = kg0Var.f28006z0;
            org.telegram.ui.ActionBar.e6 e6Var = kg0Var.I0;
            TextView textView = kg0Var.f27982g0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), mode));
            }
            kg0Var.h();
        }
        bt0 bt0Var = this.U1;
        if (bt0Var != null) {
            bt0Var.H(this.f34055v2);
        }
        ct0 ct0Var = this.V1;
        if (ct0Var != null) {
            ct0Var.H(this.f34055v2);
        }
        ys0 ys0Var = this.S7;
        if (ys0Var != null) {
            ys0Var.invalidate();
        }
        kv0 kv0Var = this.f33991o1;
        if (kv0Var != null) {
            int childCount = kv0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f33991o1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) childAt).f23803c.b(org.telegram.ui.ActionBar.i6.W9, org.telegram.ui.ActionBar.i6.X9, org.telegram.ui.ActionBar.i6.V9);
                }
            }
        }
        rs0 rs0Var = this.U3;
        if (rs0Var != null) {
            rs0Var.A0(true);
        }
    }

    public final void v0() {
        float f7;
        org.telegram.ui.ActionBar.z zVar = this.A0;
        if (zVar != null) {
            if (this.f33915f2) {
                f7 = -AndroidUtilities.dp(4.0f);
            } else {
                f7 = 0.0f;
            }
            zVar.setTranslationX(f7);
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.E0;
        if (v0Var != null) {
            I2(v0Var, this.f33915f2, false);
        }
        boolean z10 = this.f33906e2;
        if (z10 && this.I == null) {
            ch.d c10 = this.Y.c(this.G, null, false);
            c10.o(eh.b.i(this.f34055v2));
            c10.q(AndroidUtilities.dp(20.0f));
            c10.p(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = gh.d.f10887a;
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
            ArrayList arrayList = this.f33928g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f34051u7;
                }
            }
        }
        return null;
    }

    public final int v2() {
        if (this.f34052u8 > 1048576000) {
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

    public final void v3(boolean z10) {
        wu0 wu0Var;
        int i10;
        if (this.f33887c2 != 1 && (wu0Var = this.f33904e0) != null) {
            if (!z10) {
                if (wu0Var.getPaddingLeft() <= 0 && this.f33904e0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f33904e0.setSystemUiVisibility(i10);
        }
    }

    public final boolean w0() {
        if (this.f33985n4 != 0) {
            G1();
            if (Math.abs(this.f33994o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f34003p4;
                if (runnable != null) {
                    runnable.run();
                    this.f34003p4 = null;
                }
                this.f33985n4 = 0;
            }
        }
        if (this.f33985n4 == 0) {
            return false;
        }
        return true;
    }

    public final RenderNode w1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j3;
        if (this.K8 == null) {
            renderNode = null;
        } else {
            renderNode = this.L8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = ah.h.a(AndroidUtilities.dp(40.0f), 6.0f);
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
        ah.a aVar = this.M8;
        aVar.f537b = 0L;
        aVar.f536a = false;
        for (float f7 : colorMatrix.getArray()) {
            aVar.c(f7);
        }
        aVar.a(0L);
        if (aVar.f536a) {
            j3 = -1;
        } else {
            j3 = aVar.f537b;
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

    public final void w2(final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12, boolean z13) {
        char c10;
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
        int i12;
        zn znVar;
        org.telegram.ui.Components.k50 k50Var;
        String str2;
        String string;
        TextureView textureView;
        if (!I1() && this.d != null && !this.f34046u2) {
            long j3 = 0;
            if (this.f33887c2 == 1) {
                if (!z13 && (k50Var = this.f33992o2) != null) {
                    TLObject tLObject = k50Var.f27847a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j10 = user.f20185id;
                        str2 = str3;
                        j3 = j10;
                    } else {
                        str2 = "";
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f33904e0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.V0 = dp;
                    Context context = this.f33904e0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f39205a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f39206b = imageReceiver2;
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                    view.f39208e = new Path();
                    int i13 = UserConfig.selectedAccount;
                    j9Var.m(i13, UserConfig.getInstance(i13).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), j9Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), j9Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f39209f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f33992o2.f27847a;
                    wu0 wu0Var = this.f33904e0;
                    org.telegram.ui.Components.vf0 vf0Var = this.C1;
                    j9Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, j9Var);
                    view.f39207c = wu0Var;
                    view.d = vf0Var;
                    b2Var.V = view;
                    if (this.f33992o2.f27849c == 1) {
                        if (UserConfig.getInstance(this.T).clientUserId == j3) {
                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage));
                        } else {
                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2));
                        }
                        if (this.I4) {
                            string = LocaleController.getString("SetVideo", R.string.SetVideo);
                        } else {
                            string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                        }
                    } else {
                        if (this.I4) {
                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2));
                        } else {
                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2));
                        }
                        string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                    }
                    String str4 = string;
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new a80(6));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i14) {
                            Drawable[] drawableArr = PhotoViewer.U8;
                            PhotoViewer.this.w2(z10, i10, i11, z11, z12, true);
                        }
                    });
                    b2Var.I = org.telegram.ui.ActionBar.i6.f21027pg;
                    b2Var.T0 = true;
                    b2Var.i(i0.a.k(-15461356, 204));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false));
                    b2Var.setOnDismissListener(new et0(this));
                    if (this.f34017r1 && (textureView = this.B2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f34085y2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.B2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f34085y2.addView(this.E3);
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
            if (!z11 && (znVar = this.l4) != null) {
                TLRPC.Chat chat2 = znVar.f44753e;
                if (znVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.T).edit().putBoolean("silent_" + this.l4.a(), !z10).commit();
                }
            }
            VideoEditedInfo n12 = n1();
            ArrayList arrayList = this.f33928g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = n12;
                }
            }
            zn znVar2 = this.l4;
            if (znVar2 != null && (chat = znVar2.f44753e) != null) {
                if (!this.f34017r1 && n12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.bi.q(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.ad(this.f33904e0, this.f34055v2), null);
                    return;
                } else if (!z14 && !ChatObject.canSendPhoto(this.l4.f44753e)) {
                    org.telegram.messenger.bi.q(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.ad(this.f33904e0, this.f34055v2), null);
                    return;
                }
            }
            this.f34046u2 = true;
            if (n12 != null) {
                long j11 = ((float) n12.estimatedSize) * 0.9f;
                if ((j11 > 2097152000 && !UserConfig.getInstance(this.T).isPremium()) || j11 > 4194304000L) {
                    if (this.a2 != null) {
                        org.telegram.ui.Components.yi yiVar = this.a2;
                        new rg.j0(6, UserConfig.selectedAccount, yiVar.getContainer().getContext(), yiVar.f33228f0, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.f33887c2 == 11) {
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
                        int k12 = k1(this.f34048u4);
                        i1();
                        float dp2 = k12 - AndroidUtilities.dp(20.0f);
                        qg.o2 o2Var = this.p5;
                        if (o2Var != null && o2Var.f46486i0 && o2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            c10 = 2;
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
                            c10 = 2;
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.C4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f34086y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            canvas.translate((-this.C4.getImageWidth()) / 2.0f, (-this.C4.getImageHeight()) / 2.0f);
                            canvas.scale(this.C4.getImageWidth() / this.f34086y4.getMeasuredWidth(), this.C4.getImageHeight() / this.f34086y4.getMeasuredHeight());
                            this.f34086y4.f27056e = !C1();
                            this.f34086y4.draw(canvas);
                            this.f34086y4.f27056e = true;
                            canvas.restore();
                        }
                        if (C1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f17 = dp2 / 2.0f;
                            matrix.preTranslate(f17, f17);
                            if (this.f34004p6 != null) {
                                f14 = AndroidUtilities.lerp(0.0f, this.f33927g6, this.f33969l6);
                                f12 = AndroidUtilities.lerp(this.f33871a6, this.f33910e6, this.f33969l6);
                                f10 = AndroidUtilities.lerp(this.f33881b6, this.f33919f6, this.f33969l6);
                                f7 = 2.0f;
                                f11 = AndroidUtilities.lerp(this.Y5, this.f33900d6, this.f33969l6);
                                f13 = AndroidUtilities.lerp(this.X5, this.f33891c6, this.f33969l6);
                            } else {
                                f7 = 2.0f;
                                float f18 = this.f33871a6;
                                f10 = this.f33881b6;
                                f11 = this.Y5;
                                float f19 = this.X5;
                                if (this.f33987n6 != 0) {
                                    f13 = this.f33891c6;
                                    f11 = this.f33900d6;
                                    f12 = this.f33910e6;
                                } else {
                                    f12 = f18;
                                    f13 = f19;
                                }
                                f14 = 0.0f;
                            }
                            int k13 = k1(this.f34048u4);
                            int i14 = i1();
                            matrix.preTranslate(f13, f11 + 0.0f);
                            matrix.preScale(f12, f12);
                            matrix.preRotate(f10);
                            int bitmapWidth = this.C4.getBitmapWidth();
                            int bitmapHeight = this.C4.getBitmapHeight();
                            float f20 = k13;
                            float f21 = i14;
                            float min = Math.min(f20 / bitmapWidth, f21 / bitmapHeight);
                            lg.g gVar = this.D1;
                            int i15 = gVar.f15533i;
                            if (i15 != 90 && i15 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f22 = gVar.f15534j;
                            float f23 = gVar.f15535k;
                            float f24 = bitmapHeight;
                            float f25 = bitmapWidth;
                            float f26 = f20 / ((int) ((((1.0f - f22) * 0.0f) + f22) * f24));
                            float f27 = (int) ((((1.0f - f23) * 0.0f) + f23) * f25);
                            if (f26 * f27 > f21) {
                                f26 = f21 / f27;
                            }
                            int i16 = this.f33887c2;
                            tu0 tu0Var = this.X4;
                            if (i16 == 1 || gVar.f15527a) {
                                TextureView textureView2 = this.B2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = tu0Var.f42126c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f16 = -1.0f;
                                    } else {
                                        f16 = 1.0f;
                                    }
                                    textureView2.setScaleX(f16);
                                    vu0 vu0Var = this.E2;
                                    if (vu0Var != null) {
                                        vu0Var.setScaleX(this.B2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = tu0Var.f42126c;
                                if (cropState4 != null) {
                                    f15 = cropState4.cropScale;
                                } else {
                                    f15 = 1.0f;
                                }
                                float y3 = ((f26 / min) / com.google.android.gms.internal.vision.e2.y(f15, 1.0f, 0.0f, 1.0f)) * f15;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.f15530e * 1.0f);
                                matrix.preScale(y3, y3);
                                matrix.preTranslate(com.google.android.gms.internal.vision.e2.C(gVar.f15528b, f24, min, 1.0f), com.google.android.gms.internal.vision.e2.C(gVar.f15529c, f25, min, 1.0f));
                                float f28 = gVar.f15532g + i15;
                                if (f28 > 180.0f) {
                                    f28 -= 360.0f;
                                }
                                matrix.preRotate(f28);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = tu0Var.f42126c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f14 > 0.0f) {
                                matrix.preScale(1.0f - (f14 * f7), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.q.z(1.0f, f14, 4.0f * f14, 0.25f));
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
                                float f29 = copy.f17275x;
                                float f30 = copy.f17276y;
                                float f31 = copy.width + f29;
                                float f32 = copy.height + f30;
                                float f33 = dp2;
                                float[] fArr = new float[8];
                                fArr[0] = f29;
                                fArr[1] = f30;
                                fArr[c10] = f31;
                                fArr[3] = f30;
                                fArr[4] = f31;
                                fArr[5] = f32;
                                fArr[6] = f29;
                                fArr[7] = f32;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[c10], 2.0d))) / f33;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f33;
                                copy.height = sqrt;
                                copy.f17275x = (((fArr[0] + fArr[4]) / f7) / f33) - (copy.width / f7);
                                copy.f17276y = (((fArr[1] + fArr[5]) / f7) / f33) - (sqrt / f7);
                                copy.scale = 1.0f;
                                copy.customTextView = true;
                                if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                    copy.rotation = (float) (copy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                                }
                                copy.rotation = (float) (copy.rotation - ((this.f33881b6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(copy);
                                TLRPC.Document document = copy.document;
                                if (document != null && str5 == null) {
                                    str5 = MessageObject.findAnimatedEmojiEmoticon(document, null);
                                }
                                dp2 = f33;
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
                        float f34 = 512;
                        String file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, Bitmap.CompressFormat.WEBP, f34, f34, 100, false, 101, 101), "webp", true).toString();
                        if (videoEditedInfo != null) {
                            videoEditedInfo.originalPath = file;
                        }
                        if (this.f34021r5 == null) {
                            this.f34021r5 = new ArrayList();
                        }
                        if (this.f34021r5.isEmpty()) {
                            String str6 = this.p5.f46478c0;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f34021r5.add(this.p5.f46478c0);
                            } else if (str != null) {
                                this.f34021r5.add(str);
                            } else {
                                this.f34021r5.add("👍");
                            }
                        }
                        this.f34046u2 = false;
                        rt q6 = rt.q();
                        qg.o2 o2Var2 = this.p5;
                        ArrayList arrayList4 = this.f34021r5;
                        ft0 ft0Var = new ft0(this, file, videoEditedInfo, photoEntry, z10, i10, i11, z12);
                        nt ntVar = q6.U;
                        Activity findActivity = AndroidUtilities.findActivity(o2Var2.getContext());
                        if (findActivity != null) {
                            q6.w(findActivity);
                            q6.v(ft0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            q6.f41501o = arrayList4;
                            q6.t(null, importingSticker, null, null, null, 3, false, null, new ai.d(), 0);
                            AndroidUtilities.cancelRunOnUIThread(ntVar);
                            AndroidUtilities.runOnUIThread(ntVar, 16L);
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
                    AndroidUtilities.runOnUIThread(new bs0(this, 0), 200L);
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
        tt0 tt0Var = this.f34085y2;
        if (tt0Var != null && tt0Var.getVisibility() == 0 && this.H3) {
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            f7 *= Math.min(k1(this.f34048u4) / view.getMeasuredWidth(), B1() / view.getMeasuredHeight());
        }
        float imageWidth = this.C4.getImageWidth();
        float imageHeight = this.C4.getImageHeight();
        MediaController.CropState cropState = this.X4.f42126c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.f33887c2 == 11) {
            k12 = (int) (imageWidth * f7);
        } else {
            k12 = ((int) ((imageWidth * f7) - k1(this.f34048u4))) / 2;
        }
        if (this.f33887c2 == 11) {
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
        bu0 bu0Var = this.L1;
        if (bu0Var != null) {
            if (f7 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = bu0Var.f46395x1;
            boolean z11 = !z10;
            if (bu0Var.Y1 != z11) {
                bu0Var.Y1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f10 = 1.0f;
                }
                org.telegram.messenger.bi.t(animate.alpha(f10), org.telegram.ui.Components.hs.h, 240L);
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
            TextureView textureView = this.f34066w3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new ei(this, 4));
                this.f34066w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f34076x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f34076x3.setImageDrawable(null);
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
            tt0 tt0Var = this.f34085y2;
            if (tt0Var != null) {
                int[] iArr = this.A3;
                tt0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f33904e0.getTranslationY());
                ImageView imageView2 = this.f34076x3;
                Rect rect = this.f34028s2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f34085y2.getX());
                }
                vu0 vu0Var = this.E2;
                if (vu0Var != null) {
                    vu0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hr0(this, 4));
                if (this.D2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f34085y2.getX();
                }
                if (this.D2) {
                    y3 = 0.0f;
                } else {
                    y3 = iArr[1] - this.f34085y2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f34076x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f34076x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f34076x3;
                Property property3 = View.TRANSLATION_X;
                if (this.D2) {
                    f7 = 0.0f;
                } else {
                    f7 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f7));
                ImageView imageView6 = this.f34076x3;
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
                arrayList.add(ObjectAnimator.ofInt(this.L0, org.telegram.ui.Components.u6.d, 255));
                vu0 vu0Var2 = this.E2;
                if (vu0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(vu0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property4, y3));
                }
                org.telegram.ui.Components.gh0.o(this.f34085y2.getAspectRatio(), false);
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
                animatorSet.addListener(new gs0(this, view, 0));
                animatorSet.start();
                mu0 mu0Var = new mu0();
                mu0Var.f39989c = false;
                mu0Var.d = false;
                mu0Var.f39987a = 250;
                mu0Var.f39988b = decelerateInterpolator;
                k3(true, true, mu0Var);
                this.G3 = 0;
            }
        }
    }

    public final int x1() {
        return this.f34028s2.right;
    }

    public final void x2(org.telegram.ui.Components.k50 k50Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f33992o2 = k50Var;
        if (this.f33887c2 == 1) {
            if (E3()) {
                this.f33981n0.setVisibility(0);
                this.S0.setVisibility(8);
            } else {
                this.S0.setVisibility(0);
                this.f33981n0.setVisibility(8);
            }
            if (k50Var != null && (user = k50Var.f27848b) != null && k50Var.f27849c == 1 && this.f33992o2.d) {
                if (k50Var.f27850e) {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.C1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.C1.setSubtitle(null);
            }
        }
        if (k50Var != null) {
            if (k50Var.f27849c == 2) {
                if (k50Var.f27850e) {
                    str = "SuggestVideo";
                    i10 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i10 = R.string.SuggestPhoto;
                }
                O2(LocaleController.getString(str, i10));
            }
            if (k50Var.f27850e) {
                this.T7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.F.setBackground(null);
            this.F.setElevation(2.0f);
        }
    }

    public final void x3() {
        boolean z10;
        org.telegram.ui.Components.k81 k81Var = this.F2;
        if (k81Var != null) {
            if (!b5.d.u() && !this.f34015r) {
                z10 = false;
            } else {
                z10 = true;
            }
            k81Var.O(z10);
        }
        if (!this.f33964k8) {
            this.f33905e1.setEnabled(false);
            this.f33905e1.setClickable(false);
            this.f33905e1.animate().alpha(0.5f).setDuration(180L).start();
            this.S7.setMode(0);
            return;
        }
        this.f33905e1.setEnabled(true);
        this.f33905e1.setClickable(true);
        this.f33905e1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f34015r) {
            if (this.f33908e4 == null) {
                this.M.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.kd0 kd0Var = this.f33895d1;
            kd0Var.f27958e = true;
            kd0Var.invalidateSelf();
            if (this.f33949j1.getTag() != null) {
                this.f33949j1.setAlpha(0.5f);
                this.f33949j1.setEnabled(false);
            }
            if (this.f33887c2 == 1) {
                this.S7.setMaxProgressDiff(9600.0f / this.f33947i8);
                this.S7.setMode(1);
                B3();
                return;
            }
            this.S7.setMaxProgressDiff(1.0f);
            this.S7.setMode(0);
            return;
        }
        this.M.a(this.D8, true);
        org.telegram.ui.Components.kd0 kd0Var2 = this.f33895d1;
        kd0Var2.f27958e = false;
        kd0Var2.invalidateSelf();
        if (this.f33949j1.getTag() != null) {
            this.f33949j1.setAlpha(1.0f);
            this.f33949j1.setEnabled(true);
        }
        this.S7.setMaxProgressDiff(1.0f);
        this.S7.setMode(0);
    }

    public final void y0() {
        ev0 ev0Var = this.f33899d5;
        if (ev0Var != null) {
            ev0Var.f37356a.setVisible(true, true);
        }
        cv0 cv0Var = this.d;
        ev0 ev0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (cv0Var != null) {
            MessageObject messageObject = this.T4;
            ImageLocation imageLocation = this.Z4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            ev0Var2 = cv0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f33899d5 = ev0Var2;
        if (ev0Var2 != null && !ev0Var2.f37372s) {
            ev0Var2.f37356a.setVisible(false, true);
        }
    }

    public final void y2(boolean z10) {
        if (this.f33983n2 != z10) {
            this.f33983n2 = z10;
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
                                    i10 = documentAttribute.f20045w;
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
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f33904e0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f33904e0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f34004p6 != null) {
                            float f10 = this.X5;
                            f7 = ((this.f33891c6 - f10) * this.f33969l6) + f10;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f34055v2;
        if (e6Var != null) {
            return e6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final void z2() {
        org.telegram.ui.Components.z71 z71Var;
        org.telegram.ui.Components.z71 z71Var2;
        if (!this.f33923g2 && this.f33887c2 == 1) {
            if (!this.f34017r1 || ((z71Var2 = (org.telegram.ui.Components.z71) this.B2) != null && z71Var2.getVideoWidth() > 0 && z71Var2.getVideoHeight() > 0)) {
                this.f33923g2 = true;
                Bitmap bitmap = this.C4.getBitmap();
                int orientation = this.C4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f33930h0.getBitmap();
                    orientation = this.f33930h0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i10 = orientation;
                if (bitmap2 != null || this.B2 != null) {
                    org.telegram.ui.Components.vf0 vf0Var = this.C1;
                    if (this.f34017r1) {
                        z71Var = (org.telegram.ui.Components.z71) this.B2;
                    } else {
                        z71Var = null;
                    }
                    vf0Var.b(bitmap2, i10, false, false, this.D1, z71Var, this.X4.f42126c);
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
    public final void A(float f7, int i10) {
    }
}
