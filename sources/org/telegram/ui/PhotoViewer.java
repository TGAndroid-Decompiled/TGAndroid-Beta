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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t10, org.telegram.ui.Components.s10, ze.a, td.b {
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
    public tf.f A1;
    public st0 A2;
    public ImageView A3;
    public org.telegram.ui.Components.ga A4;
    public long A5;
    public float A6;
    public final gq0 A7;
    public org.telegram.ui.Components.y5[] A8;
    public org.telegram.ui.Components.r7 B;
    public org.telegram.ui.ActionBar.g1 B0;
    public tf.f B1;
    public org.telegram.ui.Components.k61 B2;
    public boolean B3;
    public org.telegram.ui.Components.ga B4;
    public hg.r0 B5;
    public float B6;
    public Path B7;
    public RectF B8;
    public ImageView C;
    public org.telegram.ui.Components.m7 C0;
    public MediaController.CropState C1;
    public xe.d C2;
    public int C3;
    public org.telegram.ui.Components.ga C4;
    public String C5;
    public float C6;
    public Paint C7;
    public RectF C8;
    public Drawable D;
    public ta1 D0;
    public MediaController.CropState D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public boolean D5;
    public float D6;
    public Paint D7;
    public Matrix D8;
    public og.c E;
    public c81 E0;
    public org.telegram.ui.Components.qe0 E1;
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
    public kh.b4 G1;
    public float G2;
    public boolean G3;
    public boolean G4;
    public int G5;
    public boolean G6;
    public Matrix G7;
    public RenderNode G8;
    public AnimatorSet H;
    public final BackgroundDrawable H0;
    public xs0 H1;
    public float H2;
    public boolean H3;
    public boolean H4;
    public int H5;
    public boolean H6;
    public Matrix H7;
    public final g.x H8;
    public yt0 I;
    public final Paint I0;
    public boolean I1;
    public float I2;
    public boolean I3;
    public final Matrix I4;
    public boolean I5;
    public int I6;
    public final int[] I7;
    public final a0.h I8;
    public wt0 J;
    public CheckBox J0;
    public ws0 J1;
    public float J2;
    public float J3;
    public final Paint J4;
    public boolean J5;
    public int J6;
    public du0 J7;
    public boolean J8;
    public boolean K;
    public CounterView K0;
    public boolean K1;
    public float K2;
    public long K3;
    public Bitmap K4;
    public boolean K5;
    public boolean K6;
    public org.telegram.ui.Components.bf0 K7;
    public View K8;
    public boolean L;
    public bh.g L0;
    public org.telegram.ui.ActionBar.c2 L1;
    public float L2;
    public boolean L3;
    public int L4;
    public final boolean[] L5;
    public boolean L6;
    public RadialProgressView L7;
    public af.f L8;
    public tr0 M;
    public FrameLayout M0;
    public pt0 M1;
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
    public vr0 N7;
    public boolean N8;
    public Paint O;
    public org.telegram.ui.Components.wo0 O0;
    public TextView O1;
    public org.telegram.ui.Components.k61 O2;
    public long O3;
    public boolean O4;
    public boolean O5;
    public boolean O6;
    public TextView O7;
    public boolean O8;
    public int P;
    public org.telegram.ui.Components.se0 P0;
    public zs0 P1;
    public SurfaceTexture P2;
    public View P3;
    public MessageObject P4;
    public boolean P5;
    public int P6;
    public AnimatorSet P7;
    public int Q;
    public org.telegram.ui.Components.bf0 Q0;
    public yr0 Q1;
    public boolean Q2;
    public or0 Q3;
    public VideoAds Q4;
    public boolean Q5;
    public VelocityTracker Q6;
    public long Q7;
    public int R;
    public TextView R0;
    public zr0 R1;
    public boolean R2;
    public int R3;
    public ArrayList R4;
    public boolean R5;
    public Scroller R6;
    public long R7;
    public float S;
    public final xt0[] S0;
    public float S1;
    public boolean S2;
    public ks0 S3;
    public Uri S4;
    public float S5;
    public final ArrayList S6;
    public long S7;
    public org.telegram.ui.Cells.e3 T;
    public gd T0;
    public m0 T1;
    public boolean T2;
    public int T3;
    public final qt0 T4;
    public float T5;
    public final SparseArray[] T6;
    public volatile int T7;
    public ig.a U;
    public ImageView U0;
    public FrameLayout U1;
    public boolean U2;
    public int U3;
    public TLRPC.BotInlineResult U4;
    public float U5;
    public final ArrayList U6;
    public volatile int U7;
    public xd.b V;
    public ImageView V0;
    public FrameLayout V1;
    public boolean V2;
    public boolean V3;
    public ImageLocation V4;
    public float V5;
    public final SparseArray[] V6;
    public int V7;
    public xd.b W;
    public ImageView W0;
    public org.telegram.ui.Components.ki W1;
    public float W2;
    public final org.telegram.ui.Cells.g1 W3;
    public ImageLocation W4;
    public float W5;
    public final ArrayList W6;
    public int W7;
    public org.telegram.ui.Components.ba X;
    public ImageView X0;
    public ff.s0 X1;
    public String X2;
    public final VideoFramesRewinder X3;
    public SecureDocument X4;
    public float X5;
    public final ArrayList X6;
    public volatile int X7;
    public org.telegram.ui.Components.fa Y;
    public ImageView Y0;
    public int Y1;
    public String Y2;
    public final hs0 Y3;
    public final String[] Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public WindowManager.LayoutParams Z;
    public org.telegram.ui.Components.rb0 Z0;
    public boolean Z1;
    public long Z2;
    public final org.telegram.ui.Cells.c2 Z3;
    public bu0 Z4;
    public float Z5;
    public final ArrayList Z6;
    public volatile int Z7;
    public final td.a f35579a = new td.a(0, this, org.telegram.ui.Components.gr.h, 380, false);
    public tt0 f35580a0;
    public org.telegram.ui.ActionBar.l0 f35581a1;
    public boolean a2;
    public float a3;
    public CharSequence f35582a4;
    public String f35583a5;
    public float f35584a6;
    public final ArrayList f35585a7;
    public volatile int f35586a8;
    public final boolean f35587b;
    public gt0 f35588b0;
    public org.telegram.ui.Components.n80 f35589b1;
    public boolean f35590b2;
    public boolean f35591b3;
    public boolean f35592b4;
    public long f35593b5;
    public float f35594b6;
    public final ArrayList f35595b7;
    public volatile int f35596b8;
    public int f35597c;
    public au0 f35598c0;
    public wr0 f35599c1;
    public boolean f35600c2;
    public long f35601c3;
    public boolean f35602c4;
    public String f35603c5;
    public float f35604c6;
    public final ArrayList f35605c7;
    public volatile int f35606c8;
    public zt0 d;
    public ClippingImageView f35607d0;
    public ArrayList f35608d1;
    public boolean f35609d2;
    public boolean f35610d3;
    public final xr0 f35611d4;
    public boolean f35612d5;
    public float f35613d6;
    public ImageLocation f35614d7;
    public float f35615d8;
    public boolean f35616e;
    public dh.g f35617e0;
    public ArrayList f35618e1;
    public boolean f35619e2;
    public iu0 f35620e3;
    public final xr0 f35621e4;
    public TL_iv.PageBlock f35622e5;
    public float f35623e6;
    public eu0 f35624e7;
    public int f35625e8;
    public boolean f35626f;
    public View f35627f0;
    public org.telegram.ui.Components.w51 f35628f1;
    public org.telegram.ui.Components.x5 f35629f2;
    public String f35630f3;
    public final e70 f35631f4;
    public ImageReceiver.BitmapHolder f35632f5;
    public float f35633f6;
    public vt0 f35634f7;
    public volatile boolean f35635f8;
    public int f35636g0;
    public kh.x3 f35637g1;
    public boolean f35638g2;
    public ValueAnimator f35639g3;
    public final float[][] f35640g4;
    public boolean f35641g5;
    public float f35642g6;
    public final Rect f35643g7;
    public volatile boolean f35644g8;
    public int h;
    public TextView f35645h0;
    public org.telegram.ui.Components.f30 f35646h1;
    public boolean f35647h2;
    public boolean f35648h3;
    public qn f35649h4;
    public boolean f35650h5;
    public float f35651h6;
    public final AnimationNotificationsLocker f35652h7;
    public long f35653h8;
    public TextView f35654i0;
    public org.telegram.ui.Components.e11 f35655i1;
    public boolean f35656i2;
    public final int[] f35657i3;
    public org.telegram.ui.ActionBar.o2 f35658i4;
    public boolean f35659i5;
    public float f35660i6;
    public ff.t0 f35661i7;
    public long f35662i8;
    public TextView f35663j0;
    public UndoView f35664j1;
    public boolean f35665j2;
    public final int[] f35666j3;
    public int f35667j4;
    public boolean f35668j5;
    public long f35669j6;
    public org.telegram.ui.Components.gc f35670j7;
    public float f35671j8;
    public org.telegram.ui.ActionBar.w0 f35672k0;
    public hu0 f35673k1;
    public org.telegram.ui.Components.c40 f35674k2;
    public org.telegram.ui.ActionBar.h5 f35675k3;
    public long f35676k4;
    public String f35677k5;
    public int f35678k6;
    public int f35679k7;
    public float f35680k8;
    public org.telegram.ui.ActionBar.w0 f35681l0;
    public ut0 l1;
    public boolean f35682l2;
    public ImageView f35683l3;
    public Runnable f35684l4;
    public yf.m2 f35685l5;
    public AnimatorSet f35686l6;
    public boolean f35687l7;
    public long f35688l8;
    public org.telegram.ui.ActionBar.g1 m0;
    public ImageReceiver f35689m1;
    public MessagesController.DialogPhotos f35690m2;
    public org.telegram.ui.Components.m61 f35691m3;
    public bu0 f35692m4;
    public org.telegram.ui.Components.re0 f35693m5;
    public AnimatorSet f35694m6;
    public CharSequence f35695m7;
    public long f35696m8;
    public boolean f35697n;
    public org.telegram.ui.ActionBar.c1 f35698n0;
    public boolean f35699n1;
    public boolean f35700n2;
    public yi0 f35701n3;
    public bu0 f35702n4;
    public ArrayList f35703n5;
    public org.telegram.ui.Components.u10 f35704n6;
    public boolean f35705n7;
    public long f35706n8;
    public org.telegram.ui.ActionBar.g1 f35707o0;
    public final gq0 f35708o1;
    public final Rect f35709o2;
    public js0 f35710o3;
    public boolean f35711o4;
    public ih.b3 f35712o5;
    public boolean o6;
    public ValueAnimator f35713o7;
    public long f35714o8;
    public org.telegram.ui.ActionBar.g1 f35715p0;
    public float f35716p1;
    public boolean f35717p2;
    public AnimatorSet f35718p3;
    public boolean f35719p4;
    public lt0 f35720p5;
    public final DecelerateInterpolator p6;
    public TLRPC.Document f35721p7;
    public long f35722p8;
    public org.telegram.ui.ActionBar.l1 f35723q0;
    public long f35724q1;
    public boolean f35725q2;
    public boolean f35726q3;
    public int f35727q4;
    public LinearLayout f35728q5;
    public float f35729q6;
    public TLRPC.Document f35730q7;
    public long f35731q8;
    public boolean f35732r;
    public org.telegram.ui.ActionBar.g1 f35733r0;
    public final GradientDrawable[] f35734r1;
    public org.telegram.ui.ActionBar.b6 f35735r2;
    public int f35736r3;
    public final gq0 f35737r4;
    public lt0 f35738r5;
    public float f35739r6;
    public boolean f35740r7;
    public float f35741r8;
    public boolean f35742s;
    public nr f35743s0;
    public final boolean[] f35744s1;
    public final rr0 f35745s2;
    public TextureView f35746s3;
    public int f35747s4;
    public lt0 f35748s5;
    public float f35749s6;
    public boolean f35750s7;
    public ht0 f35751s8;
    public LinearLayout f35752t0;
    public final float[] f35753t1;
    public final xr0 f35754t2;
    public ImageView f35755t3;
    public String f35756t4;
    public lt0 f35757t5;
    public float f35758t6;
    public Utilities.Callback2 f35759t7;
    public MessageObject f35760t8;
    public final ArrayList f35761u0;
    public int f35762u1;
    public ps0 f35763u2;
    public final ImageView[] f35764u3;
    public org.telegram.ui.Components.mc0 f35765u4;
    public lt0 f35766u5;
    public float f35767u6;
    public final float[] f35768u7;
    public boolean f35769u8;
    public int v;
    public org.telegram.ui.ActionBar.l1 f35770v0;
    public org.telegram.ui.Components.a61 f35771v1;
    public View f35772v2;
    public boolean f35773v3;
    public org.telegram.ui.Components.mc0 v4;
    public long f35774v5;
    public float f35775v6;
    public final float[] f35776v7;
    public boolean f35777v8;
    public AnimatorSet f35778w;
    public org.telegram.ui.ActionBar.z f35779w0;
    public org.telegram.ui.Components.tn0 f35780w1;
    public AnimatorSet f35781w2;
    public final int[] f35782w3;
    public org.telegram.ui.Components.mc0 f35783w4;
    public boolean f35784w5;
    public float f35785w6;
    public ObjectAnimator f35786w7;
    public boolean w8;
    public final gq0 f35787x;
    public org.telegram.ui.ActionBar.w0 f35788x0;
    public AnimatorSet f35789x1;
    public TextureView f35790x2;
    public boolean f35791x3;
    public ImageReceiver f35792x4;
    public boolean f35793x5;
    public float f35794x6;
    public int f35795x7;
    public boolean f35796x8;
    public Activity f35797y;
    public org.telegram.ui.ActionBar.w0 f35798y0;
    public org.telegram.ui.Components.be0 f35799y1;
    public SurfaceView f35800y2;
    public Bitmap f35801y3;
    public ImageReceiver f35802y4;
    public int f35803y5;
    public float f35804y6;
    public float f35805y7;
    public String f35806y8;
    public org.telegram.ui.ActionBar.w0 f35807z0;
    public final tf.f f35808z1;
    public boolean f35809z2;
    public Bitmap f35810z3;
    public ImageReceiver f35811z4;
    public long f35812z5;
    public float f35813z6;
    public float f35814z7;
    public final org.telegram.ui.Components.y5 f35815z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f35816g = 0;
        public final RectF f35817a;
        public final RectF f35818b;
        public final Paint f35819c;
        public ys0 d;
        public boolean f35820e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f35817a = new RectF();
            this.f35818b = new RectF();
            Paint paint = new Paint(1);
            this.f35819c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            ff.t0 t0Var = photoViewer.f35661i7;
            if (t0Var != null) {
                t0Var.a(!this.f35820e);
            }
            ff.s0 s0Var = photoViewer.X1;
            if (s0Var != null) {
                s0Var.a(!this.f35820e);
            }
            org.telegram.ui.Components.ki kiVar = photoViewer.W1;
            if (kiVar != null) {
                boolean z11 = this.f35820e;
                kiVar.f30160u0.k(kiVar.f30122h2);
                if (kiVar.f30139n2 != z11) {
                    kiVar.f30139n2 = z11;
                    org.telegram.ui.Components.ci ciVar = kiVar.f30160u0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
                    if (ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f26255e1) {
                        if (z11 && !kiVar.f30142o2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f26269n && !chatAttachAlertPhotoLayout.K0) {
                            if (z10) {
                                org.telegram.ui.Components.ul ulVar = chatAttachAlertPhotoLayout.L;
                                if (ulVar != null) {
                                    chatAttachAlertPhotoLayout.f26266k0 = Boolean.valueOf(ulVar.isFrontface());
                                    chatAttachAlertPhotoLayout.c0(true);
                                    return;
                                }
                                return;
                            }
                            chatAttachAlertPhotoLayout.r0();
                        }
                    }
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            ys0 ys0Var;
            bu0 bu0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.O8) {
                if (photoViewer.f35667j4 != 0 && !AndroidUtilities.isTablet() && (bu0Var = photoViewer.Z4) != null && bu0Var.f36988m != null) {
                    ClippingImageView clippingImageView = photoViewer.f35607d0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f35818b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f26333b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f26334c;
                    rectF.bottom = scaleY - clippingImageView.f26332a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f10 = bounds.right;
                        float f11 = bounds.bottom;
                        for (int i9 = 0; i9 < 4; i9++) {
                            RectF rectF2 = this.f35817a;
                            if (i9 != 0) {
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        if (i9 == 3) {
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
                            canvas.drawRect(rectF2, this.f35819c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (ys0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(ys0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i9) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f35797y instanceof LaunchActivity) {
                if (photoViewer.f35616e && i9 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f35820e = z10;
                if (z10) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new kt0(this, 0), 70L);
                }
            }
            super.setAlpha(i9);
            this.f35819c.setAlpha(i9);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f35822a;
        public final TextPaint f35823b;
        public final Paint f35824c;
        public int d;
        public int f35825e;
        public final RectF f35826f;
        public int h;
        public float f35827n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f35823b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f35824c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f35826f = new RectF();
            a(0);
        }

        public final void a(int i9) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f35823b;
            this.f35822a = new StaticLayout("" + Math.max(1, i9), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f35825e = this.f35822a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f35824c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i9 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.k6 k6Var = org.telegram.ui.Components.m6.f30701b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, k6Var, 0), ObjectAnimator.ofInt(textPaint, k6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.k6 k6Var2 = org.telegram.ui.Components.m6.f30701b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, k6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, k6Var2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i9 < i10) {
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
            this.h = i9;
        }

        @Override
        public final float getRotationX() {
            return this.f35827n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f35824c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f35826f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f35822a != null) {
                this.f35823b.setAlpha((int) ((1.0f - this.f35827n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f35827n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.f35825e) / 2));
                this.f35822a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f35827n * 255.0f));
                int centerX = (int) rectF.centerX();
                int C = (int) j3.r0.C(1.0f, this.f35827n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
                canvas.drawLine(AndroidUtilities.dp(5.0f) + centerX, C - AndroidUtilities.dp(5.0f), centerX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + C, paint);
                canvas.drawLine(centerX - AndroidUtilities.dp(5.0f), C - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + centerX, AndroidUtilities.dp(5.0f) + C, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i9 = this.h;
            if (i9 > 0) {
                accessibilityNodeInfo.setContentDescription(LocaleController.formatPluralString("PhotosSelected", i9, new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i9, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(20.0f) + this.d, AndroidUtilities.dp(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f35827n = f10;
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
            U8 = new er0();
        } else {
            U8 = new org.telegram.ui.Cells.c1(Float.class, "progress", 3);
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
        this.f35587b = z10;
        this.h = -1;
        this.f35697n = true;
        this.f35787x = new gq0(this, 20);
        this.F = true;
        this.K = true;
        this.L = false;
        this.V = new xd.b(true);
        this.f35761u0 = new ArrayList();
        this.G0 = new HashMap(3);
        this.H0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.I0 = paint;
        this.S0 = new xt0[3];
        this.f35708o1 = new gq0(this, 21);
        this.f35734r1 = new GradientDrawable[2];
        this.f35744s1 = new boolean[2];
        this.f35753t1 = new float[2];
        this.f35808z1 = new Object();
        this.A1 = new Object();
        this.B1 = new Object();
        this.S1 = -8.0f;
        this.f35709o2 = new Rect();
        this.f35745s2 = new rr0(this);
        this.f35754t2 = new xr0(this, 0);
        this.f35648h3 = true;
        this.f35657i3 = new int[2];
        this.f35666j3 = new int[2];
        this.f35764u3 = new ImageView[3];
        this.f35782w3 = new int[2];
        this.G3 = true;
        this.R3 = -1;
        this.T3 = -10;
        this.W3 = new org.telegram.ui.Cells.g1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.X3 = videoFramesRewinder;
        this.Y3 = new hs0(this, videoFramesRewinder);
        this.Z3 = new org.telegram.ui.Cells.c2(this);
        this.f35611d4 = new xr0(this, 1);
        this.f35621e4 = new xr0(this, 2);
        this.f35631f4 = new e70(this, 1);
        this.f35640g4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f35737r4 = new gq0(this, 22);
        this.f35792x4 = new ImageReceiver();
        this.f35802y4 = new ih.z2(this, 4);
        this.f35811z4 = new ImageReceiver();
        this.A4 = new org.telegram.ui.Components.ga(1, new gq0(this, 23));
        this.B4 = new org.telegram.ui.Components.ga(1, new gq0(this, 23));
        this.C4 = new org.telegram.ui.Components.ga(1, new gq0(this, 23));
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
        this.f35678k6 = -1;
        this.p6 = new DecelerateInterpolator(1.5f);
        this.f35749s6 = 1.0f;
        this.f35758t6 = 0.0f;
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
        this.f35585a7 = new ArrayList();
        this.f35595b7 = new ArrayList();
        this.f35605c7 = new ArrayList();
        this.f35614d7 = null;
        this.f35624e7 = null;
        this.f35643g7 = new Rect();
        this.f35652h7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f35768u7 = new float[]{1.0f};
        this.f35776v7 = new float[]{1.0f};
        this.A7 = new gq0(this, 24);
        this.I7 = new int[2];
        this.Q7 = -1L;
        this.R7 = -1L;
        this.S7 = -1L;
        this.U7 = -1;
        this.f35815z8 = new org.telegram.ui.Components.y5(new gq0(this, 23), 180L, org.telegram.ui.Components.gr.f28845g);
        this.H8 = new Object();
        this.I8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.f35802y4.setFileLoadingPriority(3);
    }

    public static void C(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.k61 k61Var;
        MessageObject messageObject;
        boolean z11;
        tt0 tt0Var = photoViewer.f35580a0;
        photoViewer.Z.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f35797y.getSystemService("window")).updateViewLayout(photoViewer.f35598c0, photoViewer.Z);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        qn qnVar = photoViewer.f35649h4;
        if (qnVar != null && qnVar.U != null && qnVar.getFragmentView() != null) {
            ak akVar = photoViewer.f35649h4.U;
            if (akVar.f26189u2) {
                akVar.s1();
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.f35649h4.getParentActivity(), photoViewer.f35597c);
            photoViewer.f35649h4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (k61Var = photoViewer.B2) != null && k61Var.o() > 1500 && (messageObject = photoViewer.P4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.B2.o() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                j3.r0.A(sb2, MessagesController.getInstance(photoViewer.P).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject2.getId());
                str = sb2.toString();
            }
        }
        ds0 ds0Var = new ds0(photoViewer, photoViewer.f35797y, photoViewer.f35649h4, arrayList, str, num, tt0Var, z10);
        ds0Var.setFocusable(false);
        ds0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new cf0(23, photoViewer, ds0Var), 250L);
        ds0Var.show();
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
        if (!photoViewer.q0()) {
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
            photoViewer.f35624e7 = new eu0(photoViewer, photoViewer.L4, new ArrayList(photoViewer.U6), photoViewer.d);
            jt0 jt0Var = new jt0();
            jt0Var.f39629c = false;
            photoViewer.k3(false, true, jt0Var);
            AndroidUtilities.runOnUIThread(new qq0(photoViewer, file, z10, messageObject, z11, z12), jt0Var.f39627a);
            return;
        }
        photoViewer.U2();
    }

    public static void F(org.telegram.ui.PhotoViewer r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.F(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap H0(android.graphics.Bitmap r16, org.telegram.messenger.MediaController.CropState r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H0(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean J1(MessageObject messageObject) {
        if (V8 != null && !V8.f35791x3 && V8.f35616e && messageObject != null && V8.P4 != null && V8.P4.getId() == messageObject.getId() && V8.P4.getDialogId() == messageObject.getDialogId()) {
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
        if (V8 != null && V8.f35616e && !V8.f35711o4 && str != null && str.equals(V8.f35583a5)) {
            return true;
        }
        return false;
    }

    public static boolean M1(MessageObject messageObject) {
        boolean z10;
        if (V8 != null && !V8.f35791x3 && V8.f35616e && !V8.f35711o4 && messageObject != null) {
            MessageObject messageObject2 = V8.P4;
            if (messageObject2 == null && V8.d != null) {
                messageObject2 = V8.d.U();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z10 = true;
                if (z10 && W8 != null) {
                    if (W8.f35616e && !W8.f35711o4 && messageObject != null && W8.P4 != null && W8.P4.getId() == messageObject.getId() && W8.P4.getDialogId() == messageObject.getDialogId()) {
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
        if (V8 != null && V8.f35616e && !V8.f35711o4 && botInlineResult != null && V8.U4 != null && botInlineResult.f22378id == V8.U4.f22378id) {
            return true;
        }
        return false;
    }

    public static boolean O1(TLRPC.FileLocation fileLocation) {
        if (V8 != null && V8.f35616e && !V8.f35711o4 && fileLocation != null) {
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

    public static void R(PhotoViewer photoViewer) {
        int i9;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.U6;
        if (!arrayList.isEmpty() && (i9 = photoViewer.M4) >= 0 && i9 < arrayList.size() && (messageObject = (MessageObject) arrayList.get(photoViewer.M4)) != null) {
            if (photoViewer.f35668j5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.z21.A())) {
                photoViewer.A2(messageObject, j2(messageObject), false, true);
            } else {
                photoViewer.A2(messageObject, messageObject.caption, photoViewer.f35668j5, true);
            }
        }
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

    public static void U(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.Q7 != -1 && (textureView = photoViewer.f35790x2) != null) {
            photoViewer.Q7 = -1L;
            photoViewer.f35772v2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.gr.f28847j).setDuration(85L).setListener(new org.telegram.ui.Components.su0(7, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void V(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V(org.telegram.ui.PhotoViewer):void");
    }

    public static void W(PhotoViewer photoViewer) {
        int i9;
        org.telegram.ui.Components.m61 m61Var = photoViewer.f35691m3;
        if (m61Var.f30711f) {
            i9 = m61Var.d;
        } else {
            i9 = m61Var.f30708b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.m61.S / 2) + i9)) - (photoViewer.f35710o3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f35620e3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f35710o3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            js0 js0Var = photoViewer.f35710o3;
            js0Var.setPivotX(Utilities.clamp((js0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f35710o3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            js0 js0Var2 = photoViewer.f35710o3;
            js0Var2.setPivotX(Utilities.clamp((js0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f35710o3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            js0 js0Var3 = photoViewer.f35710o3;
            js0Var3.setPivotX(js0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f35710o3.setTranslationX(dp);
    }

    public static void X(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.mi0 lottieAnimation;
        qt0 qt0Var = photoViewer.T4;
        ArrayList arrayList = qt0Var.f42198e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) qt0Var.f42198e.get(i9);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.o9) && (lottieAnimation = ((org.telegram.ui.Components.o9) view).getImageReceiver().getLottieAnimation()) != null) {
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

    public static void Y(PhotoViewer photoViewer, long j10) {
        org.telegram.ui.Components.mi0 lottieAnimation;
        qt0 qt0Var = photoViewer.T4;
        ArrayList arrayList = qt0Var.f42198e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) qt0Var.f42198e.get(i9);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.o9) && (lottieAnimation = ((org.telegram.ui.Components.o9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j11 = photoViewer.f35653h8;
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

    public static String Y0(int i9, int i10) {
        int i11;
        int i12;
        if (i9 >= 100) {
            i11 = 99;
        } else {
            i11 = i9;
        }
        char c10 = (char) ((i11 / 10) + 48);
        if (i9 >= 100) {
            i9 = 99;
        }
        char c11 = (char) ((i9 % 10) + 48);
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

    public static void Z(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String Z0(int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i9 >= 100) {
            i12 = 99;
        } else {
            i12 = i9;
        }
        char c10 = (char) ((i12 / 10) + 48);
        if (i9 >= 100) {
            i9 = 99;
        }
        char c11 = (char) ((i9 % 10) + 48);
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

    public static CharSequence j2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt(), false);
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
                } catch (Throwable th) {
                    throw th;
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

    public final void A0(final int i9, final boolean z10) {
        int i10;
        boolean z11;
        nl0 nl0Var;
        final File file;
        final nl0 nl0Var2;
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
        nl0 nl0Var3;
        boolean z19;
        org.telegram.ui.Components.x5 x5Var;
        int i11 = this.L4;
        if (i9 == 1) {
            i10 = i11 + 1;
        } else if (i9 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.Y4[i9] != null) {
            if (i9 == 0 && i11 == 0 && (x5Var = this.f35629f2) != null) {
                z11 = x5Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.P4 != null) {
                if (i10 >= 0 && i10 < this.U6.size()) {
                    ?? r42 = (MessageObject) this.U6.get(i10);
                    z12 = R2(r42);
                    if (this.f35803y5 == 1 && !r42.canPreviewDocument()) {
                        this.S0[i9].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.messageOwner.attachPath)) {
                        file3 = new File(r42.messageOwner.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((MessageObject.getMedia(r42.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(r42.messageOwner).webpage != null && MessageObject.getMedia(r42.messageOwner).webpage.document == null) {
                        nl0Var3 = new nl0(5, this, p1(i10, null));
                    } else {
                        nl0Var3 = new nl0(6, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        nl0 nl0Var4 = nl0Var3;
                        z13 = z19;
                        nl0Var = r42;
                        file = null;
                        file4 = file3;
                        nl0Var2 = nl0Var4;
                        z14 = true;
                    } else {
                        nl0Var = r42;
                        file = null;
                        z14 = false;
                        file4 = file3;
                        nl0Var2 = nl0Var3;
                        z13 = false;
                    }
                } else {
                    this.S0[i9].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.U4 != null) {
                    if (i10 >= 0 && i10 < this.f35605c7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f35605c7.get(i10);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.Y4[i9]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.Y4[i9]);
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
                        file = new File(FileLoader.getDirectory(4), this.Y4[i9]);
                        nl0Var2 = null;
                        z12 = false;
                        z13 = false;
                    } else {
                        this.S0[i9].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.V4 != null) {
                        if (i10 >= 0 && i10 < this.X6.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.X6.get(i10);
                            if (imageLocation != null) {
                                pathToAttach = FileLoader.getInstance(this.P).getPathToAttach(imageLocation.location, q1(imageLocation), false);
                                pathToAttach2 = FileLoader.getInstance(this.P).getPathToAttach(imageLocation.location, q1(imageLocation), true);
                            } else {
                                pathToAttach2 = null;
                                pathToAttach = null;
                            }
                        } else {
                            this.S0[i9].d(-1, z10, true);
                            return;
                        }
                    } else if (this.X4 != null) {
                        if (i10 >= 0 && i10 < this.f35585a7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.f35585a7.get(i10);
                            pathToAttach = FileLoader.getInstance(this.P).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.P).getPathToAttach(secureDocument, false);
                        } else {
                            this.S0[i9].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f35583a5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.Y4[i9]);
                        file = new File(FileLoader.getDirectory(4), this.Y4[i9]);
                        nl0Var2 = null;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        vt0 vt0Var = this.f35634f7;
                        if (vt0Var != null) {
                            File b10 = vt0Var.b(i10);
                            if (!this.f35634f7.a(i10) && !this.f35634f7.e(i10)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && SharedConfig.streamMedia && (this.f35634f7.d(i10) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            nl0Var2 = null;
                            z12 = Q2(i10);
                            file4 = b10;
                            nl0Var = null;
                            file = null;
                        } else {
                            nl0Var = null;
                            file = null;
                            nl0Var2 = null;
                            z12 = false;
                            z13 = false;
                            z14 = false;
                        }
                    }
                    nl0Var2 = null;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    nl0Var = nl0Var2;
                }
                file4 = file2;
                nl0Var = nl0Var2;
            }
            if ((i9 != 0 || !this.f35650h5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = nl0Var;
            final boolean z20 = z11;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    qn qnVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.P8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = nl0Var2;
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
                    final int i12 = i9;
                    final boolean z23 = z13;
                    if (!z22 && i12 != 0 && (messageObject = r72) != null && z23 && DownloadController.getInstance(photoViewer.P).canDownloadMedia(messageObject.messageOwner) != 0 && (((qnVar = photoViewer.f35649h4) == null || qnVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
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
                            xt0[] xt0VarArr = photoViewer2.S0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!FileLoader.getInstance(photoViewer2.P).isLoadingFile(strArr[i13])) {
                                        xt0VarArr[i13].d(2, false, true);
                                    } else {
                                        xt0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    xt0VarArr[i13].d(0, z29, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i13]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                xt0VarArr[i13].f(fileProgress.floatValue(), false);
                            } else {
                                if (i13 != 0 || !photoViewer2.L3) {
                                    if (z28 && (!z25 || (i13 == 0 && photoViewer2.T2))) {
                                        xt0VarArr[i13].d(3, z29, true);
                                    } else {
                                        xt0VarArr[i13].d(-1, z29, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f35672k0.t()) {
                                    if (!z27) {
                                        if (!FileLoader.getInstance(photoViewer2.P).isLoadingFile(strArr[i13])) {
                                            photoViewer2.f35672k0.r(8);
                                        } else {
                                            photoViewer2.f35672k0.K(8);
                                        }
                                    } else {
                                        photoViewer2.f35672k0.r(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f35719p4 || (photoViewer2.f35605c7.isEmpty() && (strArr[0] == null || xt0VarArr[0].h == 0))) {
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
        if (!this.f35605c7.isEmpty() && i10 >= 0 && i10 < this.f35605c7.size()) {
            Object obj = this.f35605c7.get(i10);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.Y1 != 11))) {
                    this.S0[i9].d(3, z10, true);
                    return;
                }
            }
        }
        this.S0[i9].d(-1, z10, true);
    }

    public final long A1() {
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null && gt0Var.f35295x) {
            return gt0Var.getVideoDuration();
        }
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.q();
    }

    public final void A2(MessageObject messageObject, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i9;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.t5.cloneSpans(charSequence, 3);
        W2(this.N4, z11);
        if (!this.N4) {
            boolean z17 = true;
            if (this.Y1 != 1) {
                this.Q1.setVisibility(8);
                this.R1.setVisibility(8);
                if (this.f35619e2) {
                    if (this.M1.getParent() != this.L0) {
                        FrameLayout frameLayout = this.V1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.M1);
                        }
                        this.M1.setMeasureAllChildren(false);
                        this.L0.addView(this.M1, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.P1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f35580a0.getContext());
                        this.V1 = frameLayout2;
                        this.M1.setContainer(frameLayout2);
                        zs0 zs0Var = new zs0(this, this.f35580a0.getContext(), this.M1, this.V1, 0);
                        this.P1 = zs0Var;
                        this.M1.setScrollView(zs0Var);
                        this.V1.setClipChildren(false);
                        this.P1.addView(this.V1, new ViewGroup.LayoutParams(-1, -2));
                        this.f35580a0.addView(this.P1, g7.e6.e(-1, -1, 80));
                    }
                    if (this.M1.getParent() != this.V1) {
                        this.L0.removeView(this.M1);
                        this.M1.setMeasureAllChildren(true);
                        this.V1.addView(this.M1, -1, -2);
                        this.f35710o3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.N1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.A);
                            this.N1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.Z(620756991, 369098751, 8, 8));
                            g7.g6.b(this.N1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.A);
                            this.O1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.O1.setTextColor(-1);
                            this.O1.setTypeface(AndroidUtilities.bold());
                            this.N1.addView(this.O1, g7.e6.e(-2, -2, 17));
                            this.N1.setOnClickListener(new sq0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.N1);
                        this.O1.setText(messageObject.sponsoredButtonText);
                        this.V1.addView(this.N1, g7.e6.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
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
                pt0 pt0Var = this.M1;
                if (z11) {
                    currentView = pt0Var.getNextView();
                } else {
                    currentView = pt0Var.getCurrentView();
                }
                if (this.f35699n1) {
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
                    if (this.f35619e2) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            i9 = 5;
                        } else {
                            i9 = 10;
                        }
                    } else {
                        i9 = Integer.MAX_VALUE;
                    }
                    if (maxLines != i9) {
                        this.M1.getCurrentView().setMaxLines(i9);
                        this.M1.getNextView().setMaxLines(i9);
                        this.M1.getCurrentView().setEllipsize(null);
                        this.M1.getNextView().setEllipsize(null);
                    }
                }
                currentView.setScrollX(0);
                boolean z18 = this.f35619e2;
                if (!z18 && z11 && isEmpty) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f35656i2 = z12;
                if (!z18) {
                    this.P1.f40525h0 = false;
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
                    if (this.f35619e2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.L0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new at0(this, isEmpty2, isEmpty, 1)).addTransition(new at0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.P1.f40525h0 = true;
                            duration.addTransition(new org.telegram.ui.Components.pl0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.M1);
                        }
                        TransitionManager.beginDelayedTransition(this.P1, duration);
                    }
                    z13 = true;
                } else {
                    this.M1.getCurrentView().setText((CharSequence) null);
                    zs0 zs0Var2 = this.P1;
                    if (zs0Var2 != null) {
                        zs0Var2.scrollTo(0, 0);
                    }
                    z13 = false;
                }
                int i10 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.f6.J(null, true);
                    if (messageObject == null || !this.f35668j5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.z21.A())) {
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new ih.n8(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.M1.setTag(cloneSpans);
                    try {
                        pt0 pt0Var2 = this.M1;
                        if (this.f35682l2 != z10) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        pt0Var2.a(cloneSpans, z11, z16);
                        zs0 zs0Var3 = this.P1;
                        if (zs0Var3 != null) {
                            zs0Var3.H(zs0Var3.getWidth(), zs0Var3.getHeight());
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.F && (!this.f35699n1 || this.L0.getVisibility() == 0 || this.f35634f7 != null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    pt0 pt0Var3 = this.M1;
                    if (z15) {
                        i10 = 0;
                    }
                    pt0Var3.setVisibility(i10);
                } else if (this.f35619e2) {
                    this.M1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z11, false);
                    this.M1.getCurrentView().setTextColor(-1291845633);
                    this.M1.setTag("empty");
                    this.M1.setVisibility(0);
                } else {
                    this.M1.a(null, z11, false);
                    this.M1.getCurrentView().setTextColor(-1);
                    pt0 pt0Var4 = this.M1;
                    if (z13 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    pt0Var4.b(4, z14);
                    this.M1.setTag(null);
                }
                if (this.M1.getCurrentView() instanceof ot0) {
                    ((ot0) this.M1.getCurrentView()).setLoading(z10);
                }
                this.f35682l2 = (isEmpty || !z10) ? false : false;
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
        zt0 zt0Var = this.d;
        if (zt0Var != null) {
            int H2 = zt0Var.H();
            this.K0.a(H2);
            if (H2 == 0) {
                p3(false, true);
            }
            if (this.O0 != null) {
                zt0 zt0Var2 = this.d;
                long j11 = 0;
                if (zt0Var2 != null) {
                    j10 = zt0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (messageObject = this.P4) != null) {
                    j10 = messageObject.getDialogId();
                }
                org.telegram.ui.Components.wo0 wo0Var = this.O0;
                zt0 zt0Var3 = this.d;
                if (zt0Var3 == null || !zt0Var3.q() || this.d.w()) {
                    j11 = MessagesController.getInstance(this.P).getSendPaidMessagesStars(j10);
                }
                zt0 zt0Var4 = this.d;
                if (zt0Var4 == null) {
                    H = 1;
                } else {
                    H = zt0Var4.H();
                }
                wo0Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void B0(int i9) {
        org.telegram.ui.Components.g61 g61Var;
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null && k61Var.d != null && i9 != k61Var.Z) {
            k61Var.Z = i9;
            ArrayList arrayList = k61Var.J;
            if (arrayList != null && i9 >= 0 && i9 < arrayList.size()) {
                g61Var = (org.telegram.ui.Components.g61) k61Var.J.get(i9);
            } else {
                g61Var = null;
            }
            k61Var.S(false, g61Var);
        }
        if (i9 == -1) {
            org.telegram.ui.Components.k61.K(null, this.P4);
        } else {
            org.telegram.ui.Components.k61 k61Var2 = this.B2;
            if (k61Var2 != null) {
                org.telegram.ui.Components.k61.K(k61Var2.v(i9), this.P4);
            }
        }
        z3();
        this.f35681l0.M(null, null);
        try {
            d1.f.b(0);
            if (we.b.C().F()) {
                we.b.C().M(m1());
            }
            org.telegram.ui.Components.k61 k61Var3 = this.B2;
            if (k61Var3 != null) {
                d1.f.w(k61Var3.z());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean B1() {
        if (d1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void B2(int i9) {
        C2(i9, true, false, false);
    }

    public final void B3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3():void");
    }

    public final void C0(boolean z10, boolean z11, float f10) {
        if (f10 != this.f35716p1) {
            this.f35716p1 = f10;
            if (this.P4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f35716p1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.P4.getDialogId() + "_" + this.P4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.P4.getDialogId() + "_" + this.P4.getId(), this.f35716p1).commit();
                }
            }
            org.telegram.ui.Components.k61 k61Var = this.B2;
            if (k61Var != null) {
                k61Var.R(this.f35716p1);
            }
            gt0 gt0Var = this.f35588b0;
            if (gt0Var != null) {
                gt0Var.setPlaybackSpeed(this.f35716p1);
            }
        }
        J2(true, z10);
        if (z11) {
            this.f35681l0.M(null, null);
        }
    }

    public final void C2(int r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(int, boolean, boolean, boolean):void");
    }

    public final void C3() {
        String Y0;
        String Y02;
        int[] iArr = this.f35657i3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f35666j3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            long max = Math.max(0L, k61Var.o());
            long max2 = Math.max(0L, this.B2.q());
            if (!this.w8 && this.M7.getVisibility() == 0) {
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
            gt0 gt0Var = this.f35588b0;
            if (gt0Var != null && gt0Var.f35295x) {
                long max3 = Math.max(0, gt0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f35588b0.getVideoDuration());
                if (!this.w8 && this.M7.getVisibility() == 0) {
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
        int i9 = iArr[0];
        if (i9 >= 60) {
            Y0 = Z0(i9 / 60, i9 % 60, iArr[1]);
        } else {
            Y0 = Y0(i9, iArr[1]);
        }
        int i10 = iArr2[0];
        if (i10 >= 60) {
            Y02 = Z0(i10 / 60, i10 % 60, iArr2[1]);
        } else {
            Y02 = Y0(i10, iArr2[1]);
        }
        this.f35675k3.l(Y0 + " / " + Y02, false);
        if (!Objects.equals(this.f35630f3, Y02)) {
            this.f35630f3 = Y02;
            this.f35620e3.requestLayout();
        }
    }

    public final void D0(boolean z10) {
        int i9 = this.L4;
        if (i9 >= 0 && i9 < this.f35605c7.size() && H1()) {
            if (z10) {
                j0();
            }
            f1().p();
        }
    }

    public final void D1() {
        boolean[] zArr = this.f35744s1;
        zArr[1] = false;
        zArr[0] = false;
        this.f35580a0.invalidate();
    }

    public final void D2() {
        if (this.f35667j4 == 0) {
            E2(this.f35802y4, this.L4, null);
            F2(this.L4, this.f35765u4);
            E2(this.f35811z4, this.L4 + 1, this.B1);
            F2(this.L4 + 1, this.f35783w4);
            E2(this.f35792x4, this.L4 - 1, this.A1);
            F2(this.L4 - 1, this.v4);
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
                this.f35586a8 = Math.round((this.Y7 * max) / 2.0f) * 2;
            } else {
                Size o02 = o0();
                this.Z7 = o02.getWidth();
                this.f35586a8 = o02.getHeight();
            }
            if (this.f35596b8 != 0) {
                if (this.Y1 == 1) {
                    this.f35596b8 = 1560000;
                    extractRealEncoderBitrate = this.f35596b8;
                } else if (this.Z7 == this.X7 && this.f35586a8 == this.Y7) {
                    this.f35596b8 = this.f35606c8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.Z7, this.f35586a8, this.f35596b8, false);
                } else {
                    this.f35596b8 = MediaController.makeVideoBitrate(this.Y7, this.X7, this.f35606c8, this.f35586a8, this.Z7);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.Z7, this.f35586a8, this.f35596b8, false);
                }
                this.f35696m8 = ((extractRealEncoderBitrate / 8) * this.f35615d8) / 1000.0f;
            }
        }
    }

    public final void E0() {
        xs0 xs0Var = this.H1;
        Activity activity = this.f35797y;
        gq0 gq0Var = new gq0(this, 1);
        if (xs0Var.H1) {
            xs0Var.w0(false);
        } else if (xs0Var.f49931c2) {
            xs0Var.l0(true);
        } else if (xs0Var.P0 && xs0Var.O0 != null) {
            xs0Var.r0(null, true);
        } else if (xs0Var.B0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, xs0Var.M1);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t0.c(gq0Var, 9));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            S2(alertDialog$Builder);
        } else {
            gq0Var.run();
        }
    }

    public final void E1() {
        org.telegram.ui.Components.be0 be0Var = this.f35799y1;
        if (be0Var != null) {
            be0Var.b(null, 0, false, false, null, null, null);
            if (this.Y1 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.f35799y1.f27183b.f47904a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.f35799y1.setVisibility(0);
            this.f35799y1.setAlpha(1.0f);
            tf.n nVar = this.f35799y1.f27183b;
            nVar.q();
            CropAreaView cropAreaView2 = nVar.f47904a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f35717p2 = true;
        }
    }

    public final void E2(ImageReceiver imageReceiver, int i9, tf.f fVar) {
        MessageObject messageObject;
        TLRPC.PhotoSize photoSize;
        ?? r11;
        int i10;
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
        org.telegram.ui.Components.x5 x5Var;
        boolean z11;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.x5 x5Var2;
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
        int i11;
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
        ArrayList arrayList = this.f35585a7;
        TLRPC.PhotoSize photoSize4 = null;
        BitmapDrawable bitmapDrawable11 = null;
        if (!arrayList.isEmpty()) {
            if (i9 >= 0 && i9 < arrayList.size()) {
                arrayList.get(i9);
                AndroidUtilities.getPhotoSize();
                ImageReceiver.BitmapHolder bitmapHolder = this.f35632f5;
                if (bitmapHolder == null || imageReceiver != this.f35802y4) {
                    bitmapHolder = null;
                }
                if (bitmapHolder == null) {
                    bitmapHolder = this.d.j(i9);
                }
                SecureDocument secureDocument = (SecureDocument) arrayList.get(i9);
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
        ArrayList arrayList2 = this.f35605c7;
        long j16 = 0;
        if (!arrayList2.isEmpty()) {
            if (i9 >= 0 && i9 < arrayList2.size()) {
                Object obj = arrayList2.get(i9);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f35632f5;
                if (bitmapHolder2 == null || imageReceiver != this.f35802y4) {
                    bitmapHolder2 = null;
                }
                if (bitmapHolder2 == null) {
                    bitmapHolder2 = this.d.j(i9);
                }
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    MediaController.CropState cropState3 = photoEntry.cropState;
                    boolean z15 = photoEntry.isVideo;
                    if (z15 && !photoEntry.isLivePhoto()) {
                        str5 = photoEntry.thumbPath;
                        if (str5 != null) {
                            if (this.f35659i5) {
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
                        document = e2.c.l(photoSize5, "_", photoSize5);
                    }
                    cropState = cropState3;
                    z14 = z15;
                    str3 = str5;
                    document2 = null;
                    imageLocation14 = null;
                    i11 = 0;
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
                                    document = e2.c.l(photoSize5, "_", photoSize5);
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
                                            str6 = e2.c.l(photoSize5, "_", photoSize5);
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
                            i11 = 1;
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
                                i11 = 1;
                                photoSize4 = photoSize3;
                                imageLocation14 = imageLocation15;
                                j11 = j12;
                                str3 = null;
                            }
                            document = document4;
                            document5 = document4;
                            document2 = document5;
                            cropState = null;
                            i11 = 1;
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
                            i11 = 1;
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
                        i11 = 1;
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
                        i11 = 0;
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
                        String l10 = e2.c.l(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, l10, bitmapDrawable10, j11, null, obj, i11);
                    } else {
                        long j19 = j11;
                        int i12 = i11;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(document2);
                        if (bitmapHolder2 == null) {
                            imageLocation17 = ImageLocation.getForDocument(closestPhotoSizeWithSize2, document2);
                        } else {
                            imageLocation17 = null;
                        }
                        Locale locale5 = Locale.US;
                        String l11 = e2.c.l(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            j14 = j19;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j14 = j19;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, l11, bitmapDrawable9, j14, null, obj, i12);
                    }
                } else {
                    WebFile webFile2 = webFile;
                    long j20 = j11;
                    ImageLocation imageLocation20 = imageLocation14;
                    int i13 = i11;
                    if (photoSize4 != null) {
                        ImageLocation forObject = ImageLocation.getForObject(photoSize4, tLObject);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable8 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable8 = null;
                        }
                        imageReceiver.setImage(forObject, document, bitmapDrawable8, j20, (String) null, obj, i13);
                    } else {
                        String str8 = document;
                        if (webFile2 != null) {
                            if (imageLocation20 != null) {
                                imageReceiver.setImage(ImageLocation.getForWebFile(webFile2), str8, imageLocation20, (String) null, (Drawable) null, obj, i13);
                            } else {
                                ImageLocation forWebFile = ImageLocation.getForWebFile(webFile2);
                                if (bitmapHolder2 != null) {
                                    drawable4 = new BitmapDrawable(bitmapHolder2.bitmap);
                                } else if (z14 && (activity2 = this.f35797y) != null) {
                                    drawable4 = activity2.getResources().getDrawable(R.drawable.nophotos);
                                } else {
                                    drawable3 = null;
                                    imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i13);
                                }
                                drawable3 = drawable4;
                                imageReceiver.setImage(forWebFile, str8, drawable3, null, obj, i13);
                            }
                        } else {
                            if (bitmapHolder2 != null) {
                                drawable2 = new BitmapDrawable(bitmapHolder2.bitmap);
                            } else if (z14 && (activity = this.f35797y) != null) {
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
                        fVar.f47862a = false;
                    }
                } else {
                    cropState2 = cropState;
                    z13 = z14;
                    imageReceiver2 = imageReceiver;
                }
                if (imageReceiver2 == this.f35792x4) {
                    this.C1 = cropState2;
                    this.D4 = z13;
                    return;
                }
                boolean z16 = z13;
                MediaController.CropState cropState5 = cropState2;
                if (imageReceiver2 == this.f35811z4) {
                    this.D1 = cropState5;
                    this.G4 = z16;
                    return;
                }
                return;
            }
            imageReceiver.setImageBitmap((Bitmap) null);
            return;
        }
        vt0 vt0Var = this.f35634f7;
        if (vt0Var != null) {
            int[] iArr = new int[1];
            TLObject d = vt0Var.d(i9);
            TLRPC.PhotoSize f10 = this.f35634f7.f(d, iArr);
            if (f10 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f35632f5 == null || imageReceiver != this.f35802y4) ? null : null;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 1) == 0 && this.L4 != i9 && !FileLoader.getInstance(this.P).getPathToAttach(f10, true).exists()) {
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
                        imageLocation13 = ImageLocation.getForPhoto(f10, photo3);
                    } else {
                        imageLocation13 = null;
                    }
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f35634f7.g(), 1);
                    if (z12) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f35634f7.a(i9) && !this.f35634f7.e(i9)) {
                    if (imageReceiver == this.f35802y4 && (x5Var2 = this.f35629f2) != null) {
                        imageReceiver.setImageBitmap(x5Var2);
                        this.f35629f2.f(this.f35580a0);
                        return;
                    }
                    return;
                } else if (!(f10.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f35632f5 == null || imageReceiver != this.f35802y4) ? null : null;
                    if (bitmapHolder4 == null) {
                        imageLocation11 = ImageLocation.getForDocument(f10, (TLRPC.Document) d);
                    } else {
                        imageLocation11 = null;
                    }
                    if (bitmapHolder4 != null) {
                        bitmapDrawable6 = new BitmapDrawable(bitmapHolder4.bitmap);
                    } else {
                        bitmapDrawable6 = null;
                    }
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f35634f7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f35797y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f35797y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            }
        }
        ArrayList arrayList3 = this.U6;
        if (!arrayList3.isEmpty() && i9 >= 0 && i9 < arrayList3.size()) {
            imageReceiver.setShouldGenerateQualityThumb(true);
            messageObject = (MessageObject) arrayList3.get(i9);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            if (!TextUtils.isEmpty(MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                imageReceiver.setImageBitmap(this.f35797y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f35632f5 == null || imageReceiver != this.f35802y4) ? null : null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    if (messageObject.isLivePhoto()) {
                        imageReceiver.setNeedsQualityThumb(true);
                        ImageLocation s12 = s1(i9, null);
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
                        if (closestPhotoSizeWithSize3.f22405w < 100 && closestPhotoSizeWithSize3.h < 100) {
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
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f35632f5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f35797y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.f35802y4 && (x5Var = this.f35629f2) != null) {
                x5Var.f(this.f35580a0);
                imageReceiver.setImageBitmap(this.f35629f2);
                return;
            } else if (this.f35803y5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f35632f5 == null || imageReceiver != this.f35802y4) ? null : null;
                    int i14 = (int) (2048.0f / AndroidUtilities.density);
                    if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 8) == 0 && this.L4 != i9 && !FileLoader.getInstance(this.P).getPathToAttach(document8).exists()) {
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
                    imageReceiver.setImage(imageLocation8, e2.c.l(i14, "_", i14), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z10) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f35797y;
                tt0 tt0Var = this.f35580a0;
                ?? drawable5 = new Drawable();
                drawable5.f27707a = 0L;
                drawable5.f27708b = 0.0f;
                drawable5.f27709c = 0.0f;
                drawable5.d = 0L;
                drawable5.f27710e = 0.0f;
                drawable5.f27711f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.dc0.F;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.dc0.G;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.dc0.H.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.dc0.I.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.dc0.J.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.dc0.K.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.dc0.E.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f27712n = tt0Var;
                drawable5.f27713r = messageObject;
                drawable5.f27714s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
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
                    drawable5.f27717y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f27717y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f27716x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.A, messageObject.getDocument().mime_type, true)).mutate();
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
        ImageLocation s13 = s1(i9, jArr);
        TLObject p12 = p1(i9, jArr);
        imageReceiver.setNeedsQualityThumb(true);
        if (s13 != null) {
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f35632f5 == null || imageReceiver != this.f35802y4) ? null : null;
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
                int i15 = 0;
                while (true) {
                    if (i15 >= s13.photo.sizes.size()) {
                        break;
                    } else if (s13.photo.sizes.get(i15) instanceof TLRPC.TL_photoStrippedSize) {
                        photoSize = s13.photo.sizes.get(i15);
                        r11 = s13.photo;
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            if ((messageObject == null || !messageObject.isWebpage()) && this.f35774v5 == 0 && !this.f35793x5) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (messageObject != null) {
                if (this.f35803y5 == 5) {
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
                int i16 = (this.f35774v5 > 0L ? 1 : (this.f35774v5 == 0L ? 0 : -1));
                if (i16 != 0) {
                    if (i16 > 0) {
                        user = MessagesController.getInstance(this.P).getUser(Long.valueOf(this.f35774v5));
                    } else {
                        user = MessagesController.getInstance(this.P).getChat(Long.valueOf(-this.f35774v5));
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
                if (this.f35803y5 == 5) {
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
                imageReceiver.setImage(s13, str2, imageLocation5, null, imageLocation6, "b", bitmapDrawable2, jArr[0], null, messageObject, i10);
                imageReceiver.setAllowStartAnimation(true);
                return;
            }
            if (this.f35774v5 != j10) {
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
            if ((DownloadController.getInstance(this.P).getAutodownloadMask() & 1) == 0 && this.L4 != i9 && !FileLoader.getInstance(this.P).getPathToAttach(p12).exists()) {
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
            imageReceiver.setImage(imageLocation4, str, imageLocation3, "b", bitmapDrawable, jArr[0], null, messageObject, i10);
            if (z17) {
                num = null;
            }
            imageReceiver.setMark(num);
        } else if (jArr[0] == 0) {
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            imageReceiver.setImageBitmap(this.f35797y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean E3() {
        org.telegram.ui.Components.c40 c40Var = this.f35674k2;
        if (c40Var != null && c40Var.d && !c40Var.f27363e) {
            return true;
        }
        return false;
    }

    public final void F0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.F0(boolean, boolean):void");
    }

    public final void F1() {
        yf.m2 m2Var = this.f35685l5;
        if (m2Var == null || !m2Var.R) {
            xd.b bVar = this.V;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((kg.e) it.next()).M = true;
                }
            }
            xd.b bVar2 = this.W;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            yr0 yr0Var = this.Q1;
            if (yr0Var != null) {
                yr0Var.m();
            }
            zr0 zr0Var = this.R1;
            if (zr0Var != null) {
                zr0Var.m();
            }
            lt0 lt0Var = this.f35720p5;
            if (lt0Var != null) {
                lt0Var.invalidate();
            }
            lt0 lt0Var2 = this.f35738r5;
            if (lt0Var2 != null) {
                lt0Var2.invalidate();
            }
            lt0 lt0Var3 = this.f35748s5;
            if (lt0Var3 != null) {
                lt0Var3.invalidate();
            }
            lt0 lt0Var4 = this.f35757t5;
            if (lt0Var4 != null) {
                lt0Var4.invalidate();
            }
            lt0 lt0Var5 = this.f35766u5;
            if (lt0Var5 != null) {
                lt0Var5.invalidate();
            }
            vr0 vr0Var = this.N7;
            if (vr0Var != null && vr0Var.f33283a0) {
                vr0Var.invalidate();
            }
            tt0 tt0Var = this.f35580a0;
            if (tt0Var != null) {
                tt0Var.invalidate();
            }
        }
    }

    public final void F2(int i9, org.telegram.ui.Components.mc0 mc0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (mc0Var != null) {
            mc0Var.a();
            mc0Var.setVisibility(8);
            ArrayList arrayList2 = this.f35605c7;
            if (!arrayList2.isEmpty() && i9 >= 0 && i9 < arrayList2.size()) {
                Object obj = arrayList2.get(i9);
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
                mc0Var.setVisibility(0);
                if (this.Y1 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mc0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    mc0Var.f30791a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(mc0Var.f30791a);
                    mc0Var.d = bitmapDrawable;
                    mc0Var.setBackground(bitmapDrawable);
                    return;
                }
                mc0Var.f30791a = null;
                mc0Var.d = null;
                mc0Var.setBackground(null);
            }
        }
    }

    public final void G0() {
        if (this.f35799y1 != null) {
            return;
        }
        org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0(this.A, this.f35735r2);
        this.f35799y1 = be0Var;
        be0Var.setVisibility(8);
        this.f35799y1.a();
        this.f35580a0.addView(this.f35799y1, this.f35580a0.indexOfChild(this.M7) - 1, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f35799y1.setDelegate(new qr0(this));
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

    public final boolean H1() {
        org.telegram.ui.Components.ad f12 = f1();
        if (f12 != null) {
            if (f12.H.c() || f12.f15632f.f33124e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H2(View view, boolean z10, float f10, boolean z11) {
        float f11;
        HashMap hashMap = this.G0;
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
        int i9 = 0;
        if (z11 && bool != null) {
            if (z10) {
                view.setVisibility(0);
            }
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new fq0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new np0(this, z10, view, 1)).start();
            return;
        }
        if (!z10) {
            i9 = 8;
        }
        view.setVisibility(i9);
        view.setAlpha(f12);
        s3();
    }

    public final void I0() {
        MediaController.CropState cropState;
        int width;
        int width2;
        if (this.J1 != null) {
            return;
        }
        if (this.Y1 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.f35808z1.f47868i;
        } else {
            cropState = this.T4.f42197c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.f35802y4.getBitmapWidth();
        int bitmapHeight = this.f35802y4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        yf.m2 m2Var = this.f35685l5;
        if (m2Var != null && m2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f35685l5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f35685l5.F);
            float width3 = createBitmap.getWidth();
            if ((this.f35685l5.F / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f10 = width3 / width2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f10, ((-sourceBitmap.getHeight()) / 2.0f) * f10, (sourceBitmap.getWidth() / 2.0f) * f10, (sourceBitmap.getHeight() / 2.0f) * f10);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.f35802y4.getBitmapWidth(), this.f35802y4.getBitmapHeight(), config);
        if (this.f35802y4.getBitmap() != null) {
            Bitmap bitmap = this.f35802y4.getBitmap();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.f35802y4.getOrientation());
            float width4 = createBitmap2.getWidth();
            if ((this.f35802y4.getOrientation() / 90) % 2 != 0) {
                width = bitmap.getHeight();
            } else {
                width = bitmap.getWidth();
            }
            float f11 = width4 / width;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * f11, ((-bitmap.getHeight()) / 2.0f) * f11, (bitmap.getWidth() / 2.0f) * f11, (bitmap.getHeight() / 2.0f) * f11);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        ws0 ws0Var = new ws0(this, this.f35797y, this.P, createBitmap2, createBitmap, this.f35802y4.getOrientation(), cropState2);
        this.J1 = ws0Var;
        ws0Var.f50135s.setOnClickListener(new hq0(this, 5));
        this.J1.v.setOnClickListener(new hq0(this, 6));
        this.J1.setEraser(this.I1);
        int indexOfChild = this.f35580a0.indexOfChild(this.f35728q5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f35580a0.getChildCount();
        }
        this.f35580a0.addView(this.J1, indexOfChild, g7.e6.c(-1.0f, -1));
        this.K1 = false;
    }

    public final boolean I1() {
        int i9;
        if (this.f35614d7 != null && (i9 = this.L4) >= 0) {
            ArrayList arrayList = this.f35595b7;
            if (i9 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.L4);
                ImageLocation imageLocation = (ImageLocation) this.W6.get(this.L4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f35614d7.location;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f35614d7.location;
                    if (i12 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
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

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        int i11;
        if (i9 == 0) {
            float f12 = 1.0f - f10;
            this.P0.setTranslationY(AndroidUtilities.dp(36.0f) * f12);
            this.P0.setAlpha(f10);
            org.telegram.ui.Components.se0 se0Var = this.P0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            se0Var.setVisibility(i10);
            if (this.f35590b2) {
                bh.g gVar = this.L0;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                gVar.setVisibility(i11);
                this.L0.setAlpha(f12);
                this.L0.setTranslationY(AndroidUtilities.dp(36.0f) * f10);
                org.telegram.ui.Components.wo0 wo0Var = this.O0;
                if (i13 < 0) {
                    i12 = 0;
                }
                wo0Var.setVisibility(i12);
                this.O0.setAlpha(f12);
                this.O0.setTranslationY(AndroidUtilities.dp(36.0f) * f10);
            }
        }
    }

    public final void J2(boolean z10, boolean z11) {
        if (this.f35698n0.getVisibility() != 0) {
            this.f35743s0.f40795f.q("", z10, true);
        } else if (Math.abs(this.f35716p1 - 1.0f) < 0.001f) {
            this.f35743s0.f40795f.q("", z10, true);
        } else {
            org.telegram.ui.Components.i6 i6Var = this.f35743s0.f40795f;
            i6Var.q(org.telegram.ui.Components.vc.a(this.f35716p1) + "x", z10, true);
        }
        this.f35698n0.d(this.f35716p1, z10);
        c81 c81Var = this.E0;
        float f10 = this.f35716p1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = c81Var.f37096a;
        for (int i9 = 0; i9 < g1VarArr.length; i9++) {
            if (z11 && ((i9 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i9 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i9 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i9 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i9 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                g1VarArr[i9].c(-9718023, -9718023);
            } else {
                g1VarArr[i9].c(-328966, -328966);
            }
        }
    }

    public final void K0() {
        int bitmapWidth;
        int bitmapHeight;
        MediaController.CropState cropState;
        Bitmap bitmap;
        if (this.H1 == null) {
            TextureView textureView = this.f35790x2;
            if (textureView != null) {
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                bitmapWidth = y51Var.getVideoWidth();
                bitmapHeight = y51Var.getVideoHeight();
                while (true) {
                    if (bitmapWidth <= 1280 && bitmapHeight <= 1280) {
                        break;
                    }
                    bitmapWidth /= 2;
                    bitmapHeight /= 2;
                }
            } else {
                bitmapWidth = this.f35802y4.getBitmapWidth();
                bitmapHeight = this.f35802y4.getBitmapHeight();
            }
            Bitmap bitmap2 = this.f35765u4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i9 = this.Y1;
            qt0 qt0Var = this.T4;
            boolean z10 = true;
            if (i9 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.f35808z1.f47868i;
            } else {
                cropState = qt0Var.f42197c;
            }
            MediaController.CropState cropState2 = cropState;
            kh.b4 b4Var = new kh.b4(this.f35598c0, false, new mq0(this, 2));
            b4Var.f14994f = true;
            b4Var.f14995g = true;
            this.G1 = b4Var;
            if (this.f35727q4 == 3) {
                z10 = false;
            }
            b4Var.b(z10);
            Activity activity = this.f35797y;
            int i10 = this.P;
            if (this.f35699n1) {
                bitmap = null;
            } else {
                bitmap = this.f35802y4.getBitmap();
            }
            xs0 xs0Var = new xs0(this, activity, activity, i10, bitmap3, bitmap, this.f35802y4.getOrientation(), qt0Var.f42198e, cropState2, new gq0(this, 14), this.f35735r2);
            this.H1 = xs0Var;
            kg.d c10 = this.U.c(xs0Var.Y0, null, false);
            c10.n(mg.c.i(this.f35735r2));
            xs0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f35580a0.addView(this.H1.getView(), g7.e6.c(-1.0f, -1));
            this.H1.setOnDoneButtonClickedListener(new gq0(this, 15));
            this.H1.getCancelView().setOnClickListener(new hq0(this, 8));
            this.H1.t0(AndroidUtilities.dp(126.0f));
            this.H1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final void K2(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        ff.t0 t0Var;
        Activity parentActivity;
        boolean z10;
        int i9;
        tt0 tt0Var;
        boolean z11;
        float f10;
        float f11;
        ff.t0 t0Var2 = this.f35661i7;
        if (t0Var2 != null) {
            t0Var2.destroy();
            this.f35661i7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            t0Var = new ff.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.f35661i7 = t0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = o2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.f6.J(parentActivity, false);
        this.f35735r2 = b6Var;
        this.f35658i4 = o2Var;
        int i10 = UserConfig.selectedAccount;
        this.P = i10;
        this.f35802y4.setCurrentAccount(i10);
        this.f35792x4.setCurrentAccount(this.P);
        this.f35811z4.setCurrentAccount(this.P);
        yr0 yr0Var = this.Q1;
        if (yr0Var != null) {
            yr0Var.setAccount(this.P);
        }
        yf.m2 m2Var = this.f35685l5;
        if (m2Var != null) {
            m2Var.setCurrentAccount(this.P);
        }
        if (this.f35797y != parentActivity && parentActivity != null) {
            this.f35742s = parentActivity instanceof BubbleActivity;
            this.f35797y = parentActivity;
            this.A = new ContextThemeWrapper(this.f35797y, R.style.Theme_TMessages);
            this.f35762u1 = ViewConfiguration.get(this.f35797y).getScaledTouchSlop();
            if (P8 == null) {
                P8 = new Drawable[]{f0.e.d(this.f35797y, R.drawable.circle_big), f0.e.d(this.f35797y, R.drawable.cancel_big), f0.e.d(this.f35797y, R.drawable.load_big)};
            }
            this.R6 = new Scroller(parentActivity);
            au0 au0Var = new au0(this, parentActivity);
            this.f35598c0 = au0Var;
            au0Var.setBackground(this.H0);
            this.f35598c0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f35607d0 = clippingImageView;
            clippingImageView.J = this.f35640g4;
            clippingImageView.G = false;
            clippingImageView.I = false;
            this.f35598c0.addView(clippingImageView, g7.e6.c(40.0f, 40));
            tt0 tt0Var2 = new tt0(this, parentActivity, parentActivity);
            this.f35580a0 = tt0Var2;
            tt0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.X3;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f35580a0);
            }
            this.f35580a0.setClipChildren(true);
            this.f35580a0.setClipToPadding(true);
            this.f35598c0.setClipChildren(false);
            this.f35598c0.setClipToPadding(false);
            org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(this.f35580a0);
            this.X = baVar;
            baVar.f27120a = 1;
            this.T = new org.telegram.ui.Cells.e3(this);
            this.W = new xd.b();
            this.V = new xd.b();
            ig.a aVar = new ig.a(this.T);
            this.U = aVar;
            aVar.f(new pg.i(this.f35580a0), this.f35580a0);
            this.U.e(this.W);
            this.Y = new org.telegram.ui.Components.fa(this.X, this.f35580a0);
            this.f35598c0.addView(this.f35580a0, g7.e6.e(-1, -1, 51));
            r0.j0.m(this.f35580a0, new oq0(this));
            this.f35580a0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.Z = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.Z.flags = -2147286784;
            org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(this.f35797y);
            this.f35765u4 = mc0Var;
            this.f35580a0.addView(mc0Var, g7.e6.c(-2.0f, -2));
            org.telegram.ui.Components.mc0 mc0Var2 = new org.telegram.ui.Components.mc0(this.f35797y);
            this.v4 = mc0Var2;
            this.f35580a0.addView(mc0Var2, g7.e6.c(-2.0f, -2));
            org.telegram.ui.Components.mc0 mc0Var3 = new org.telegram.ui.Components.mc0(this.f35797y);
            this.f35783w4 = mc0Var3;
            this.f35580a0.addView(mc0Var3, g7.e6.c(-2.0f, -2));
            org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, parentActivity, 4);
            this.B = r7Var;
            r7Var.setOverlayTitleAnimation(true);
            this.B.setTitleColor(-1);
            this.B.setSubtitleColor(-1);
            this.B.setBackgroundColor(2130706432);
            this.B.setOccupyStatusBar(!this.f35742s);
            this.B.A(1090519039, false);
            this.B.C(-1, false);
            this.B.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.B.getBackButton();
            this.C = backButton;
            this.D = backButton.getBackground();
            this.E = null;
            yt0 yt0Var = new yt0(parentActivity);
            this.I = yt0Var;
            this.B.addView(yt0Var, g7.e6.e(-1, -1, 119));
            this.f35580a0.addView(this.B, g7.e6.c(-2.0f, -1));
            wt0 wt0Var = new wt0(parentActivity);
            this.J = wt0Var;
            this.f35580a0.addView(wt0Var, g7.e6.e(-1, -2, 55));
            this.B.setActionBarMenuOnItemClick(new pr0(this, b6Var));
            org.telegram.ui.ActionBar.z n10 = this.B.n();
            this.f35779w0 = n10;
            n10.setOnLayoutListener(new gq0(this, 18));
            org.telegram.ui.ActionBar.w0 a2 = this.f35779w0.a(26, R.drawable.menu_delete_old);
            this.A0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            g7.g6.a(this.A0);
            I2(this.A0, false, false);
            org.telegram.ui.ActionBar.w0 a3 = this.f35779w0.a(11, R.drawable.msg_mask);
            this.f35807z0 = a3;
            a3.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.w0 a10 = this.f35779w0.a(18, R.drawable.msg_header_draw);
            this.f35798y0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.w0 a11 = this.f35779w0.a(4, R.drawable.msg_header_share);
            this.f35788x0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.z zVar = this.f35779w0;
            nr nrVar = new nr(this.A, R.drawable.video_settings, new ih.b());
            this.f35743s0 = nrVar;
            org.telegram.ui.ActionBar.w0 d = zVar.d(1, nrVar);
            this.f35681l0 = d;
            this.f35743s0.setCallback(d.getIconView());
            this.f35681l0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35681l0.getPopupLayout().f22693c = true;
            this.f35681l0.getPopupLayout().setFitItems(true);
            this.f35681l0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.A, b6Var);
            this.f35698n0 = c1Var;
            c1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f35698n0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f35698n0.setDrawShadow(false);
            this.f35698n0.setBackgroundColor(-14540254);
            this.f35698n0.setTextColor(-1);
            this.f35698n0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f35698n0.setOnValueChange(new nq0(this, 1));
            this.f35681l0.getPopupLayout().a(this.f35698n0, g7.e6.n(-1, 44));
            org.telegram.ui.ActionBar.l1 a12 = this.f35681l0.a(-1);
            this.f35770v0 = a12;
            a12.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f35681l0.getPopupLayout();
            c81 c81Var = new c81(this.A, new oq0(this));
            this.E0 = c81Var;
            popupLayout.addView(c81Var);
            LinearLayout linearLayout = new LinearLayout(this.A);
            this.f35752t0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f35681l0.getPopupLayout().addView(this.f35752t0);
            org.telegram.ui.ActionBar.g1 e10 = this.f35681l0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f35707o0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.m7 m7Var = new org.telegram.ui.Components.m7(this, this.A, 1);
            this.C0 = m7Var;
            try {
                m7Var.setRouteSelector(n5.a.c(this.A).a());
                z10 = true;
            } catch (Exception e11) {
                FileLog.e(e11);
                z10 = false;
            }
            this.C0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.g1 e12 = this.f35681l0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.B0 = e12;
                e12.d(false);
                this.B0.setSelectorColor(268435455);
                this.B0.addView(this.C0, 0, g7.e6.c(-1.0f, -1));
            }
            this.f35681l0.B(-115203550);
            this.f35681l0.setOnMenuDismiss(new mq0(this, 8));
            org.telegram.ui.ActionBar.w0 a13 = this.f35779w0.a(0, R.drawable.media_more);
            this.f35672k0 = a13;
            a13.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f35672k0.setOnClickListener(new sq0(this, 3));
            this.f35672k0.setOnMenuDismiss(new mq0(this, 9));
            this.f35672k0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f35672k0.getPopupLayout().f22693c = true;
            this.f35672k0.getPopupLayout().setFitItems(true);
            this.F0 = new lr(this.A, this.f35672k0.getPopupLayout().getSwipeBack(), new oq0(this));
            org.telegram.ui.ActionBar.g1 i11 = this.f35672k0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.F0.f40218a);
            i11.c(-328966, -328966);
            this.f35715p0 = i11;
            i11.setOnClickListener(new sq0(this, 4));
            org.telegram.ui.ActionBar.l1 a14 = this.f35672k0.a(-1);
            this.f35723q0 = a14;
            a14.setColor(-15198184);
            this.f35672k0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).c(-328966, -328966);
            org.telegram.ui.ActionBar.g1 e13 = this.f35672k0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e13.c(-328966, -328966);
            this.f35733r0 = e13;
            org.telegram.ui.ActionBar.g1 e14 = this.f35672k0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.m0 = e14;
            e14.c(-328966, -328966);
            this.f35672k0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).c(-328966, -328966);
            this.f35672k0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).c(-328966, -328966);
            this.f35672k0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).c(-328966, -328966);
            this.f35672k0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).c(-328966, -328966);
            this.f35672k0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).c(-328966, -328966);
            this.f35672k0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).c(-328966, -328966);
            this.f35672k0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).c(-328966, -328966);
            this.f35672k0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).c(-328966, -328966);
            this.f35672k0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).c(-328966, -328966);
            this.f35672k0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).c(-328966, -328966);
            this.f35672k0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).c(-328966, -328966);
            this.f35672k0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).c(-328966, -328966);
            this.f35672k0.B(-115203550);
            this.f35672k0.r(19);
            this.f35672k0.r(20);
            J2(false, true);
            this.f35672k0.setPopupItemsSelectorColor(268435455);
            this.f35672k0.setSubMenuDelegate(new qr0(this));
            dh.g gVar = new dh.g(this.A, 23);
            this.f35617e0 = gVar;
            gVar.setBackgroundColor(2130706432);
            this.f35580a0.addView(this.f35617e0, g7.e6.e(-1, 48, 83));
            View view = new View(this.A);
            this.f35627f0 = view;
            if (this.Y1 == 11) {
                i9 = -16777216;
            } else {
                i9 = 2130706432;
            }
            view.setBackgroundColor(i9);
            this.f35598c0.addView(this.f35627f0, g7.e6.a(-1.0f, this.f35636g0 / AndroidUtilities.density, 87));
            this.f35734r1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f35734r1[0].setShape(0);
            this.f35734r1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f35734r1[1].setShape(0);
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(this.A, AndroidUtilities.dp(10.0f));
            this.f35646h1 = f30Var;
            this.f35580a0.addView(f30Var, g7.e6.e(-1, 68, 83));
            this.f35646h1.setDelegate(new sr0(this));
            for (int i12 = 0; i12 < 3; i12++) {
                this.f35764u3[i12] = new ImageView(this.f35797y);
                this.f35764u3[i12].setImageResource(R.drawable.msg_maxvideo);
                this.f35764u3[i12].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.f35764u3[i12].setScaleType(ImageView.ScaleType.CENTER);
                this.f35764u3[i12].setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
                this.f35764u3[i12].setVisibility(4);
                this.f35764u3[i12].setAlpha(1.0f);
                this.f35580a0.addView(this.f35764u3[i12], g7.e6.c(48.0f, 48));
                this.f35764u3[i12].setOnClickListener(new sq0(this, 5));
            }
            this.M = new tr0(new ih.b());
            pt0 pt0Var = new pt0(this.f35580a0.getContext());
            this.M1 = pt0Var;
            pt0Var.setFactory(new ag0(this, 2));
            this.M1.setVisibility(4);
            y2(true);
            for (int i13 = 0; i13 < 3; i13++) {
                this.S0[i13] = new ur0(this, this.f35580a0);
                this.S0[i13].d(0, false, true);
            }
            gd gdVar = new gd(this, this.A, b6Var);
            this.T0 = gdVar;
            gdVar.setUseSelfAlpha(true);
            this.T0.setProgressColor(-1);
            this.T0.setSize(AndroidUtilities.dp(54.0f));
            this.T0.setBackgroundResource(R.drawable.circle_big);
            this.T0.setVisibility(4);
            this.T0.setAlpha(0.0f);
            this.f35580a0.addView(this.T0, g7.e6.e(64, 64, 17));
            L0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f35797y, b6Var);
            this.L7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.L7.setBackgroundResource(R.drawable.circle_big);
            this.L7.setVisibility(4);
            this.f35580a0.addView(this.L7, g7.e6.e(54, 54, 17));
            org.telegram.ui.Components.bf0 bf0Var = new org.telegram.ui.Components.bf0(this.f35797y);
            this.K7 = bf0Var;
            bf0Var.setBackgroundColor(2130706432);
            this.K7.a();
            this.K7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.K7.f27195b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.K7.f27195b;
            int i14 = org.telegram.ui.ActionBar.f6.f23395zf;
            textView.setTextColor(z1(i14));
            this.f35580a0.addView(this.K7, g7.e6.e(-1, 48, 83));
            this.K7.f27194a.setOnClickListener(new hq0(this, 2));
            this.K7.f27195b.setOnClickListener(new hq0(this, 3));
            org.telegram.ui.Components.a61 a61Var = new org.telegram.ui.Components.a61(false);
            this.f35771v1 = a61Var;
            a61Var.c(new qr0(this));
            tt0 tt0Var3 = this.f35580a0;
            Objects.requireNonNull(tt0Var3);
            this.f35780w1 = new org.telegram.ui.Components.tn0(new zk0(tt0Var3, 14), false);
            du0 du0Var = new du0(this.f35797y, this);
            this.J7 = du0Var;
            du0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.J7.setVisibility(4);
            this.J7.setBackgroundColor(2130706432);
            this.f35580a0.addView(this.J7, g7.e6.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            bh.g gVar2 = new bh.g(this, this.A);
            this.L0 = gVar2;
            this.f35580a0.addView(gVar2, g7.e6.e(-1, -2, 83));
            TextView textView2 = new TextView(this.f35580a0.getContext());
            this.f35645h0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f35645h0.setTypeface(AndroidUtilities.bold());
            this.f35645h0.setSingleLine(true);
            this.f35645h0.setMaxLines(1);
            TextView textView3 = this.f35645h0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f35645h0.setTextColor(-1);
            this.f35645h0.setGravity(3);
            this.L0.addView(this.f35645h0, g7.e6.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f35580a0.getContext());
            this.f35654i0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.f35654i0.setSingleLine(true);
            this.f35654i0.setMaxLines(1);
            this.f35654i0.setEllipsize(truncateAt);
            this.f35654i0.setTextColor(-1);
            this.f35654i0.setGravity(3);
            this.L0.addView(this.f35654i0, g7.e6.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView5 = new TextView(this.f35580a0.getContext());
            this.f35663j0 = textView5;
            int i15 = org.telegram.ui.ActionBar.f6.Oh;
            textView5.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{6.0f}, z1(i15)));
            TextView textView6 = this.f35663j0;
            int i16 = org.telegram.ui.ActionBar.f6.Sh;
            textView6.setTextColor(z1(i16));
            this.f35663j0.setEllipsize(truncateAt);
            this.f35663j0.setGravity(17);
            this.f35663j0.setLines(1);
            this.f35663j0.setSingleLine(true);
            this.f35663j0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f35663j0.setTextSize(1, 15.0f);
            this.f35663j0.setTypeface(AndroidUtilities.bold());
            this.f35663j0.setOnClickListener(new hq0(this, 4));
            this.f35663j0.setVisibility(8);
            this.L0.addView(this.f35663j0, g7.e6.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            vr0 vr0Var = new vr0(this.f35797y, this);
            this.N7 = vr0Var;
            vr0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.f35797y);
            this.M7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.M7.addView(this.N7, g7.e6.e(-1, 54, 83));
            c3(false, false);
            this.f35580a0.addView(this.M7, g7.e6.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.w0 w0Var = this.A0;
            if (w0Var != null) {
                kg.d a15 = this.U.a(w0Var);
                a15.n(mg.c.i(b6Var));
                a15.p(AndroidUtilities.dp(20.0f));
                a15.o(AndroidUtilities.dp(7.0f));
                w0Var.setBackground(og.d.d(a15, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            wr0 wr0Var = new wr0(this.f35797y, LocaleController.getString(R.string.EditorSetCover));
            this.f35599c1 = wr0Var;
            kg.d a16 = this.U.a(wr0Var);
            a16.n(mg.c.i(b6Var));
            wr0Var.setBlurredBackgroundDrawable(a16);
            g7.g6.a(this.f35599c1);
            this.f35599c1.setOnClickListener(new hq0(this, 7));
            this.f35580a0.addView(this.f35599c1, g7.e6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.re0 re0Var = new org.telegram.ui.Components.re0(this.f35797y, b6Var, this.X);
            this.f35693m5 = re0Var;
            org.telegram.ui.Components.bt btVar = re0Var.f32148c;
            kg.d a17 = this.U.a(btVar);
            a17.n(mg.c.i(b6Var));
            btVar.setBlurredBackgroundDrawable(a17);
            g7.g6.a(this.f35693m5.f32148c);
            this.f35693m5.setVisibility(8);
            this.f35693m5.setAlpha(0.0f);
            this.f35693m5.setOnClose(new gq0(this, 12));
            this.f35580a0.addView(this.f35693m5, g7.e6.e(-1, -1, 119));
            this.f35693m5.f32147b.setOnClickListener(new hq0(this, 9));
            this.f35693m5.setOnGalleryImage(new mq0(this, 3));
            org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, this.f35797y, 2);
            this.f35581a1 = l0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            l0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.l0 l0Var2 = this.f35581a1;
            org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(this.f35797y);
            this.Z0 = rb0Var;
            l0Var2.setImageDrawable(rb0Var);
            this.f35581a1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.l0 l0Var3 = this.f35581a1;
            kg.d a18 = this.U.a(l0Var3);
            a18.n(mg.c.i(null));
            a18.o(AndroidUtilities.dp(4.0f));
            a18.p(AndroidUtilities.dp(16.0f));
            l0Var3.setBackground(a18);
            g7.g6.a(this.f35581a1);
            this.f35580a0.addView(this.f35581a1, g7.e6.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f35581a1.setOnClickListener(new hq0(this, 10));
            org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80(this.f35580a0.getContext());
            this.f35589b1 = n80Var;
            n80Var.setOnClickListener(new hq0(this, 11));
            this.f35580a0.addView(this.f35589b1, g7.e6.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f35580a0.getContext();
            au0 au0Var2 = this.f35598c0;
            tt0 tt0Var4 = this.f35580a0;
            yr0 yr0Var2 = new yr0(this, context, au0Var2, tt0Var4, tt0Var4, b6Var, this.X, new gq0(this, 19));
            this.Q1 = yr0Var2;
            yr0Var2.setBlurredBackgroundDrawableForMentions(this.U);
            this.Q1.setOnTimerChange(new mq0(this, 4));
            this.Q1.setAccount(this.P);
            this.Q1.setOnHeightUpdate(new mq0(this, 5));
            this.Q1.setOnAddPhotoClick(new hq0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.A;
            au0 au0Var3 = this.f35598c0;
            tt0 tt0Var5 = this.f35580a0;
            zr0 zr0Var = new zr0(this, contextThemeWrapper, au0Var3, tt0Var5, tt0Var5, b6Var, this.X, new gq0(this, 19));
            this.R1 = zr0Var;
            zr0Var.setBlurredBackgroundDrawableForMentions(this.U);
            this.R1.D(true, false);
            this.R1.setOnTimerChange(new mq0(this, 6));
            this.R1.setAccount(this.P);
            this.R1.setOnHeightUpdate(new mq0(this, 7));
            this.R1.setOnAddPhotoClick(new hq0(this, 13));
            ih.b3 b3Var = new ih.b3(this, this.A);
            this.f35712o5 = b3Var;
            b3Var.setVisibility(8);
            this.f35580a0.addView(this.f35712o5, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            yf.m2 m2Var2 = new yf.m2(this.A, b6Var);
            this.f35685l5 = m2Var2;
            m2Var2.setCurrentAccount(this.P);
            this.f35580a0.addView(this.f35685l5, tt0Var.indexOfChild(this.B) - 1, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            lt0 lt0Var = new lt0(this);
            this.f35720p5 = lt0Var;
            lt0Var.setRad(18);
            this.f35720p5.l();
            this.f35685l5.setStickerCutOutBtn(this.f35720p5);
            this.f35720p5.setOnClickListener(new hq0(this, 14));
            this.f35720p5.setCutOutState(false);
            this.f35580a0.addView(this.f35720p5, g7.e6.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f35797y);
            this.f35728q5 = linearLayout2;
            linearLayout2.setOrientation(0);
            lt0 lt0Var2 = new lt0(this);
            this.f35738r5 = lt0Var2;
            lt0Var2.f49781j0 = true;
            lt0Var2.setRad(18);
            this.f35738r5.setEraseState(false);
            this.f35738r5.setOnClickListener(new hq0(this, 15));
            this.f35728q5.addView(this.f35738r5, g7.e6.n(-2, 36));
            this.f35728q5.addView(new Space(this.f35797y), g7.e6.n(12, -1));
            lt0 lt0Var3 = new lt0(this);
            this.f35748s5 = lt0Var3;
            lt0Var3.f49781j0 = true;
            lt0Var3.setRad(18);
            this.f35748s5.setRestoreState(false);
            this.f35748s5.setOnClickListener(new hq0(this, 16));
            this.f35728q5.addView(this.f35748s5, g7.e6.n(-2, 36));
            this.f35580a0.addView(this.f35728q5, g7.e6.e(-2, 36, 17));
            lt0 lt0Var4 = new lt0(this);
            this.f35757t5 = lt0Var4;
            lt0Var4.setUndoState(false);
            this.f35757t5.setRad(18);
            lt0 lt0Var5 = this.f35757t5;
            lt0Var5.f49781j0 = true;
            lt0Var5.setOnClickListener(new hq0(this, 17));
            this.f35580a0.addView(this.f35757t5, g7.e6.e(-2, 36, 17));
            lt0 lt0Var6 = new lt0(this);
            this.f35766u5 = lt0Var6;
            lt0Var6.setOutlineState(false);
            this.f35766u5.setRad(18);
            lt0 lt0Var7 = this.f35766u5;
            lt0Var7.f49781j0 = true;
            lt0Var7.setOnClickListener(new hq0(this, 18));
            this.f35580a0.addView(this.f35766u5, g7.e6.e(-2, 36, 17));
            W2(false, false);
            a3(false, false);
            m0 m0Var = new m0(this, this.f35797y, 18);
            this.T1 = m0Var;
            m0Var.addView(this.Q1, g7.e6.e(-1, -1, 83));
            this.f35580a0.addView(this.T1, g7.e6.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.f35797y);
            this.U1 = frameLayout2;
            frameLayout2.addView(this.R1, g7.e6.e(-1, -1, 51));
            this.f35580a0.addView(this.U1, g7.e6.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.f35797y);
            this.M0 = frameLayout3;
            this.f35580a0.addView(frameLayout3, g7.e6.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.f35797y);
            this.N0 = frameLayout4;
            this.f35580a0.addView(frameLayout4, g7.e6.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView7 = new TextView(this.f35797y);
            this.O7 = textView7;
            textView7.setSingleLine(true);
            this.O7.setVisibility(8);
            this.O7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.O7.setGravity(1);
            this.O7.setTextSize(1, 14.0f);
            this.O7.setTextColor(-7566196);
            this.f35580a0.addView(this.O7, g7.e6.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.wo0 wo0Var = new org.telegram.ui.Components.wo0((NotificationCenter.NotificationCenterDelegate) this, (Context) this.f35797y, R.drawable.send_plane_24, b6Var, 2);
            this.O0 = wo0Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            wo0Var.E = dp;
            wo0Var.F = dp2;
            org.telegram.ui.Components.wo0 wo0Var2 = this.O0;
            wo0Var2.f30437d0 = true;
            kg.d a19 = this.U.a(wo0Var2);
            a19.n(mg.c.i(b6Var));
            wo0Var2.setBlurredBackgroundDrawable(a19);
            this.f35580a0.addView(this.O0, g7.e6.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.O0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            g7.g6.a(this.O0);
            this.O0.setOnClickListener(new hq0(this, 19));
            this.O0.setOnLongClickListener(new u(this, 5));
            org.telegram.ui.Components.se0 se0Var = new org.telegram.ui.Components.se0(this.f35797y);
            this.P0 = se0Var;
            LinearLayout linearLayout3 = se0Var.f32450a;
            kg.d a20 = this.U.a(linearLayout3);
            a20.n(mg.c.i(b6Var));
            a20.p(AndroidUtilities.dp(18.0f));
            a20.o(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a20);
            LinearLayout linearLayout4 = this.P0.f32451b;
            kg.d a21 = this.U.a(linearLayout4);
            a21.n(mg.c.i(b6Var));
            a21.p(AndroidUtilities.dp(18.0f));
            a21.o(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a21);
            this.P0.setVisibility(8);
            this.P0.f32450a.setOnClickListener(new hq0(this, 20));
            this.P0.f32451b.setOnClickListener(new hq0(this, 21));
            this.f35580a0.addView(this.P0, g7.e6.e(-1, 56, 80));
            ta1 ta1Var = new ta1(this, this.f35797y, 15);
            this.D0 = ta1Var;
            ta1Var.setOrientation(0);
            this.D0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            ta1 ta1Var2 = this.D0;
            kg.d a22 = this.U.a(ta1Var2);
            a22.n(mg.c.i(b6Var));
            a22.o(AndroidUtilities.dp(2.0f));
            a22.p(AndroidUtilities.dp(22.0f));
            ta1Var2.setBackground(a22);
            this.L0.addView(this.D0, g7.e6.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.f35797y);
            this.V0 = imageView;
            imageView.setScaleType(scaleType);
            this.V0.setImageResource(R.drawable.media_crop);
            this.V0.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.V0, g7.e6.n(48, 48));
            this.V0.setOnClickListener(new hq0(this, 22));
            this.V0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f35797y);
            this.X0 = imageView2;
            imageView2.setScaleType(scaleType);
            this.X0.setImageResource(R.drawable.msg_photo_rotate);
            this.X0.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.X0, g7.e6.n(48, 48));
            this.X0.setOnClickListener(new hq0(this, 23));
            this.X0.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f35797y);
            this.W0 = imageView3;
            imageView3.setScaleType(scaleType);
            this.W0.setImageResource(R.drawable.media_flip);
            this.W0.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.W0, g7.e6.n(48, 48));
            this.W0.setOnClickListener(new hq0(this, 24));
            this.W0.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f35797y);
            this.U0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.U0.setImageResource(R.drawable.media_draw);
            this.U0.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.U0, g7.e6.n(48, 48));
            this.U0.setOnClickListener(new hq0(this, 25));
            this.U0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(this.f35797y);
            this.f35628f1 = w51Var;
            w51Var.setTag(1);
            this.f35628f1.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.T7 = v2();
            org.telegram.ui.Components.w51 w51Var2 = this.f35628f1;
            if (this.f35635f8 && this.U7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            w51Var2.a(Math.min(this.Z7, this.f35586a8), z11, this.f35732r);
            this.f35628f1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.D0.addView(this.f35628f1, g7.e6.n(48, 48));
            this.f35628f1.setOnClickListener(new v80(13, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f35797y);
            this.Y0 = imageView5;
            imageView5.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.media_settings);
            this.Y0.setBackground(org.telegram.ui.ActionBar.f6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.D0.addView(this.Y0, g7.e6.n(48, 48));
            this.Y0.setOnClickListener(new hq0(this, 26));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.bf0 bf0Var2 = new org.telegram.ui.Components.bf0(this.A);
            this.Q0 = bf0Var2;
            bf0Var2.setBackgroundColor(-872415232);
            this.Q0.a();
            this.Q0.setVisibility(8);
            this.f35580a0.addView(this.Q0, g7.e6.e(-1, 48, 83));
            this.Q0.f27194a.setOnClickListener(new hq0(this, 27));
            this.Q0.f27195b.setOnClickListener(new hq0(this, 28));
            TextView textView8 = new TextView(this.A);
            this.R0 = textView8;
            textView8.setClickable(false);
            this.R0.setVisibility(8);
            this.R0.setTextSize(1, 14.0f);
            this.R0.setTextColor(-1);
            this.R0.setGravity(17);
            this.R0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(-12763843, 0));
            this.R0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.R0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.R0.setTypeface(AndroidUtilities.bold());
            this.Q0.addView(this.R0, g7.e6.e(-2, -1, 49));
            this.R0.setOnClickListener(new hq0(this, 29));
            org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(this.f35580a0.getContext(), this);
            this.f35704n6 = u10Var;
            u10Var.b();
            this.o6 = true;
            this.f35704n6.h = this;
            oq0 oq0Var = new oq0(this);
            this.f35802y4.setParentView(this.f35580a0);
            this.f35802y4.setCrossfadeAlpha((byte) 2);
            this.f35802y4.setInvalidateAll(true);
            this.f35802y4.setDelegate(oq0Var);
            this.f35792x4.setParentView(this.f35580a0);
            this.f35792x4.setCrossfadeAlpha((byte) 2);
            this.f35792x4.setInvalidateAll(true);
            this.f35792x4.setDelegate(oq0Var);
            this.f35811z4.setParentView(this.f35580a0);
            this.f35811z4.setCrossfadeAlpha((byte) 2);
            this.f35811z4.setInvalidateAll(true);
            this.f35811z4.setDelegate(oq0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f35580a0.getContext(), R.drawable.selectphoto_large);
            this.J0 = checkBox;
            checkBox.setDrawBackground(true);
            this.J0.setHasBorder(true);
            this.J0.setSize(34);
            this.J0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.J0.c(z1(i14), -1);
            this.J0.setVisibility(8);
            tt0 tt0Var6 = this.f35580a0;
            CheckBox checkBox2 = this.J0;
            if (rotation != 3 && rotation != 1) {
                f10 = 71.0f;
            } else {
                f10 = 61.0f;
            }
            tt0Var6.addView(checkBox2, g7.e6.d(34, 34.0f, 53, 0.0f, f10, 11.0f, 0.0f));
            if (!this.f35742s) {
                ((FrameLayout.LayoutParams) this.J0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.J0.setOnClickListener(new sq0(this, 0));
            CounterView counterView = new CounterView(this.f35797y);
            this.K0 = counterView;
            tt0 tt0Var7 = this.f35580a0;
            if (rotation != 3 && rotation != 1) {
                f11 = 68.0f;
            } else {
                f11 = 58.0f;
            }
            tt0Var7.addView(counterView, g7.e6.d(40, 40.0f, 53, 0.0f, f11, 64.0f, 0.0f));
            if (!this.f35742s) {
                ((FrameLayout.LayoutParams) this.K0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.K0.setOnClickListener(new sq0(this, 1));
            hu0 hu0Var = new hu0(this.f35797y);
            this.f35673k1 = hu0Var;
            hu0Var.setVisibility(8);
            this.f35673k1.setAlpha(0.0f);
            this.f35673k1.setLayoutManager(new of.y());
            hu0 hu0Var2 = this.f35673k1;
            ut0 ut0Var = new ut0(this.f35797y, this);
            this.l1 = ut0Var;
            hu0Var2.setAdapter(ut0Var);
            this.f35580a0.addView(this.f35673k1, g7.e6.e(-1, 103, 51));
            this.f35673k1.setOnItemClickListener(new i(this, 21));
            UndoView undoView = new UndoView(this.A, null, false, b6Var);
            this.f35664j1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f35664j1.i();
            this.f35580a0.addView(this.f35664j1, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.A);
                this.P3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.P3.setFocusable(true);
                this.P3.setOnClickListener(new sq0(this, 2));
                this.f35580a0.addView(this.P3, g7.e6.e(64, 64, 17));
            }
            this.f35663j0.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{6.0f}, z1(i15)));
            this.f35663j0.setTextColor(z1(i16));
            tr0 tr0Var = this.M;
            tr0Var.f24090k0 = true;
            tr0Var.f24086i0 = false;
            org.telegram.ui.Cells.z9 o6 = tr0Var.o(this.f35598c0.getContext());
            if (o6 != null) {
                AndroidUtilities.removeFromParent(o6);
                this.f35580a0.addView(o6);
            }
            this.M.T(this.f35580a0);
            this.M.S();
            this.f35579a.a(false, false);
            return;
        }
        u3();
    }

    public final void L0() {
        iu0 iu0Var = new iu0(this.f35580a0.getContext(), this);
        this.f35620e3 = iu0Var;
        this.f35580a0.addView(iu0Var, g7.e6.e(-1, 48, 83));
        qr0 qr0Var = new qr0(this);
        is0 is0Var = new is0(this, qr0Var);
        yi0 yi0Var = new yi0(this, this.f35580a0.getContext(), 3);
        this.f35701n3 = yi0Var;
        yi0Var.setAccessibilityDelegate(is0Var);
        this.f35701n3.setImportantForAccessibility(1);
        this.f35620e3.addView(this.f35701n3, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(this.f35701n3);
        this.f35691m3 = m61Var;
        m61Var.f30729z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.m61 m61Var2 = this.f35691m3;
        m61Var2.f30715k = 872415231;
        m61Var2.f30716l = 872415231;
        m61Var2.f30717m = -1;
        m61Var2.f30718n = -1;
        m61Var2.A = 1509949439;
        m61Var2.f30714j = qr0Var;
        js0 js0Var = new js0(this, this.f35580a0.getContext(), new oq0(this));
        this.f35710o3 = js0Var;
        js0Var.setAlpha(0.0f);
        this.f35580a0.addView(this.f35710o3, g7.e6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(this.f35580a0.getContext());
        this.f35675k3 = h5Var;
        h5Var.setTextColor(-1);
        this.f35675k3.setGravity(53);
        this.f35675k3.setTextSize(14);
        this.f35675k3.setImportantForAccessibility(2);
        this.f35620e3.addView(this.f35675k3, g7.e6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f35580a0.getContext());
        this.f35683l3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f35683l3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f35683l3.setScaleType(ImageView.ScaleType.CENTER);
        this.f35683l3.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        this.f35683l3.setVisibility(4);
        this.f35620e3.addView(this.f35683l3, g7.e6.e(48, 48, 53));
        this.f35683l3.setOnClickListener(new sq0(this, 6));
    }

    public final void L2(org.telegram.ui.Components.ki kiVar) {
        this.W1 = kiVar;
        ff.s0 s0Var = this.X1;
        if (s0Var != null) {
            s0Var.destroy();
            this.X1 = null;
        }
        if (kiVar != null) {
            this.X1 = kiVar.obtainWindowVisibilityController();
        }
    }

    public final void M0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.ha haVar;
        if (this.f35790x2 == null) {
            ps0 ps0Var = new ps0(this.f35797y, this);
            this.f35763u2 = ps0Var;
            ps0Var.setWillNotDraw(false);
            this.f35763u2.setVisibility(4);
            this.f35580a0.addView(this.f35763u2, 0, g7.e6.e(-1, -1, 17));
            this.f35809z2 = false;
            if (this.f35605c7.isEmpty()) {
                if (this.f35587b && this.P2 == null) {
                    this.f35800y2 = new SurfaceView(this.f35797y);
                    this.f35809z2 = true;
                } else {
                    this.f35790x2 = new TextureView(this.f35797y);
                }
            } else {
                org.telegram.ui.Components.y51 y51Var = new org.telegram.ui.Components.y51(this.f35797y, this.B2);
                this.X.e();
                org.telegram.ui.Components.ba baVar = this.X;
                y51Var.f34868s = baVar;
                org.telegram.ui.Components.hz hzVar = y51Var.f34862b;
                if (hzVar != null && (haVar = hzVar.E) != null) {
                    org.telegram.ui.Components.ba baVar2 = haVar.f29021t;
                    if (baVar2 != null && baVar2.f27130m != null) {
                        baVar2.f27130m = null;
                    }
                    haVar.f29021t = baVar;
                    if (baVar != null && baVar.f27130m != haVar) {
                        baVar.f27130m = haVar;
                        baVar.d();
                    }
                }
                if (savedFilterState != null) {
                    y51Var.setDelegate(new dl0(savedFilterState, 2));
                }
                this.f35790x2 = y51Var;
            }
            SurfaceTexture surfaceTexture = this.P2;
            if (surfaceTexture != null) {
                this.f35790x2.setSurfaceTexture(surfaceTexture);
                this.D3 = true;
                this.E3 = true;
                this.P2 = null;
            }
            TextureView textureView = this.f35790x2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.f35790x2.setPivotY(0.0f);
                this.f35790x2.setOpaque(false);
                this.f35763u2.addView(this.f35790x2, g7.e6.e(-1, -1, 17));
            } else {
                this.f35763u2.addView(this.f35800y2, g7.e6.e(-1, -1, 17));
            }
            st0 st0Var = new st0(this.f35797y, this);
            this.A2 = st0Var;
            st0Var.setPivotX(0.0f);
            this.A2.setPivotY(0.0f);
            this.A2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f35763u2.addView(this.A2, g7.e6.e(-1, -1, 17));
            View view = new View(this.f35797y);
            this.K8 = view;
            this.f35763u2.addView(view, g7.e6.c(-1.0f, -1));
            if (this.Y1 == 1) {
                View view2 = new View(this.f35797y);
                this.f35772v2 = view2;
                view2.setBackgroundColor(-1);
                this.f35772v2.setAlpha(0.0f);
                this.f35763u2.addView(this.f35772v2, g7.e6.e(-1, -1, 17));
            }
            xe.d dVar = this.C2;
            if (dVar != null) {
                ps0 ps0Var2 = this.f35763u2;
                dVar.f49150i.O(ps0Var2);
                dVar.f49151j = ps0Var2;
                if (ps0Var2 != null) {
                    dVar.e(ps0Var2);
                }
                this.C2.f49152k = this.K8;
            }
        }
    }

    public final void M2() {
        qn qnVar;
        TLRPC.Chat chat;
        zt0 zt0Var = this.d;
        if (zt0Var != null) {
            if (zt0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.L4)) {
                if (this.f35697n && (qnVar = this.f35649h4) != null && (chat = qnVar.f41890e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.y4.N(this.f35797y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).o();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.L4, n1());
            boolean x10 = this.d.x(this.L4);
            this.J0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.l1.o(k10);
                    this.f35673k1.x0(k10);
                } else {
                    this.l1.u(k10);
                    if (k10 == 0) {
                        this.l1.m(0);
                    }
                }
            }
            A3();
        }
    }

    public final boolean N0() {
        boolean z10 = false;
        if (this.f35686l6 != null || this.f35799y1 == null) {
            return false;
        }
        this.f35604c6 = 1.0f;
        this.f35669j6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35686l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f));
        this.f35686l6.setDuration(250L);
        this.f35686l6.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        this.f35686l6.addListener(new fs0(this, 0));
        this.f35686l6.start();
        tf.l lVar = this.f35799y1.f27183b.H;
        if (lVar != null) {
            z10 = lVar.f47901j;
        }
        return !z10;
    }

    public final void N2() {
        float bitmapWidth = this.f35802y4.getBitmapWidth();
        float bitmapHeight = this.f35802y4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float k12 = k1(this.f35727q4);
            float i12 = i1();
            float min = Math.min(i12 / bitmapHeight, k12 / bitmapWidth);
            float max = Math.max(k12 / ((int) (bitmapWidth * min)), i12 / ((int) (bitmapHeight * min)));
            this.W5 = max;
            w3(max);
        }
    }

    public final boolean O0(float f10, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.be0 be0Var;
        float f11;
        if (this.f35686l6 == null && (be0Var = this.f35799y1) != null) {
            be0Var.f27183b.i();
            this.X5 = 0.0f;
            this.f35594b6 = 0.0f + f10;
            if (z10) {
                this.f35604c6 = 1.0f;
            }
            this.f35669j6 = System.currentTimeMillis();
            this.f35686l6 = new AnimatorSet();
            if (this.Y1 == 1) {
                this.f35584a6 = 1.0f;
                this.W5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.f35802y4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.f35802y4.getBitmapHeight();
                    if (Math.abs((((int) this.f35799y1.f27183b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.T4.f42197c;
                    if (cropState != null) {
                        bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                        bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                    }
                    float f12 = bitmapWidth;
                    float f13 = bitmapHeight;
                    float min = Math.min(k1(1) / f12, h1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(k1(1) / f13, h1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f35584a6 = f11 / min;
                }
            }
            if (this.Y1 == 11) {
                this.W5 = r2(false) * this.W5;
                this.f35584a6 = r2(false) * this.f35584a6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new kh.ka(this, f10, this.f35799y1.f27184c.getRotation(), 3));
            this.f35686l6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f), ofFloat);
            this.f35686l6.setDuration(250L);
            this.f35686l6.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f35686l6.addListener(new gs0(this, f10, runnable));
            this.f35686l6.start();
            if (Math.abs(this.f35799y1.f27183b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void O2(CharSequence charSequence) {
        yt0 yt0Var = this.I;
        this.f35582a4 = charSequence;
        yt0Var.c(charSequence);
        j3(true, false);
    }

    public final void P0() {
        if (this.f35797y != null && this.f35598c0 != null) {
            if (org.telegram.ui.Components.pf0.f31622l0.L) {
                org.telegram.ui.Components.pf0.j(false);
            }
            o2();
            n2(false);
            try {
                if (this.f35598c0.getParent() != null) {
                    ((WindowManager) this.f35797y.getSystemService("window")).removeViewImmediate(this.f35598c0);
                    V1();
                }
                this.f35598c0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f35632f5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f35632f5 = null;
            }
            this.f35607d0.setImageBitmap(null);
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
            int i9 = this.L4;
            if (i9 >= 0) {
                ArrayList arrayList = this.f35605c7;
                if (i9 < arrayList.size()) {
                    zt0 zt0Var = this.d;
                    if (zt0Var != null && !zt0Var.N()) {
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
        if (this.f35648h3 != z10) {
            if (z10) {
                this.f35617e0.setTag(1);
            } else {
                this.f35617e0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f35639g3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35648h3 = z10;
            float f10 = 0.0f;
            int i9 = 0;
            if (z11) {
                if (z10) {
                    this.f35620e3.setVisibility(0);
                }
                float alpha = this.f35620e3.getAlpha();
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new fq0(this, 0));
                ofFloat.addListener(new qs0(this, z10, 0));
                this.f35639g3 = ofFloat;
                ofFloat.start();
            } else {
                iu0 iu0Var = this.f35620e3;
                if (!z10) {
                    i9 = 8;
                }
                iu0Var.setVisibility(i9);
                iu0 iu0Var2 = this.f35620e3;
                if (z10) {
                    f10 = 1.0f;
                }
                iu0Var2.setAlpha(f10);
            }
            if (this.f35638g2 && this.f35634f7 == null) {
                if (z10) {
                    this.f35672k0.K(9);
                } else {
                    this.f35672k0.r(9);
                }
            }
        }
    }

    public final void Q0() {
        if (this.f35802y4.getAnimation() == null && !this.f35605c7.isEmpty() && this.Y1 != 1) {
            String imageKey = this.f35802y4.getImageKey();
            String str = this.f35756t4;
            if (str == null || !str.equals(imageKey)) {
                this.f35747s4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.f35802y4.getBitmapSafe();
                int orientation = this.f35802y4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.y01(this, bitmapSafe, orientation, imageKey, 8));
                }
            }
        }
    }

    public final boolean Q1() {
        if (this.f35616e && this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean Q2(int i9) {
        vt0 vt0Var = this.f35634f7;
        if (vt0Var != null) {
            if ((vt0Var.a(i9) || this.f35634f7.e(i9)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f35634f7.b(i9);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f35634f7.d(i9) instanceof TLRPC.Document)) {
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
            ((WindowManager) this.f35797y.getSystemService("window")).updateViewLayout(this.f35598c0, this.Z);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f35598c0.setFocusable(true);
        this.f35580a0.setFocusable(true);
    }

    public final void S0() {
        ff.t0 t0Var = this.f35661i7;
        if (t0Var != null) {
            t0Var.destroy();
            this.f35661i7 = null;
        }
        ff.s0 s0Var = this.X1;
        if (s0Var != null) {
            s0Var.destroy();
            this.X1 = null;
        }
        try {
            if (this.f35598c0.getParent() != null) {
                ((WindowManager) this.f35797y.getSystemService("window")).removeView(this.f35598c0);
                V1();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void S1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z10) {
        boolean z11;
        int i9;
        Bitmap.CompressFormat g12 = g1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z11 = true;
            } catch (Throwable th) {
                FileLog.e(th);
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
        Paint paint = Q8;
        if (z10) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f10 == 512.0f) {
            i9 = 83;
        } else {
            i9 = 87;
        }
        createBitmap.compress(g12, i9, fileOutputStream);
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
        if (this.f35797y != null) {
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
                org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
                this.L1 = o6;
                o6.setCanceledOnTouchOutside(true);
                this.L1.setOnDismissListener(new r5(this, 11));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    public final void T0(android.graphics.Canvas r51, org.telegram.ui.Components.fa r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T0(android.graphics.Canvas, org.telegram.ui.Components.fa, int, int, boolean, boolean, boolean):void");
    }

    public final void T1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(boolean):void");
    }

    public final boolean T2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f35658i4;
        if ((o2Var instanceof qn) && ChatObject.isChannelAndNotMegaGroup(((qn) o2Var).f41890e)) {
            org.telegram.ui.Components.gc f10 = new org.telegram.ui.Components.oc(frameLayout, this.f35735r2).f(MessagesController.getInstance(this.P).captionLengthLimitPremium, new gq0(this, 26));
            f10.v = new gq0(this, 27);
            this.f35670j7 = f10.j();
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35797y, 0, this.f35735r2);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.P4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.P4.currentAccount).isLoadingFile(this.Y4[0])) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PleaseDownload);
        }
        S2(alertDialog$Builder);
    }

    public final void V0(Canvas canvas) {
        boolean z10;
        float e10;
        int i9;
        if (this.O4) {
            if (!SharedConfig.photoViewerBlur) {
                e10 = 1.0f;
            } else {
                int i10 = this.f35667j4;
                if (i10 != 0 && i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e10 = this.f35815z8.e(z10);
            }
            if (e10 <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (AndroidUtilities.statusBarHeight * 1.5f));
            int height = this.L0.getHeight() + AndroidUtilities.navigationBarHeight;
            if (this.Q1.getVisibility() == 0) {
                i9 = AndroidUtilities.dp(20.0f) + (this.Q1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i9 = 0;
            }
            int i11 = height + i9;
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f35580a0.getWidth(), this.f35580a0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e10 * (this.H0.getAlpha() - 127) * 2.007874f), 31);
            this.B7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.B7.addRect(0.0f, 0.0f, this.f35580a0.getWidth(), f10, direction);
            this.B7.addRect(0.0f, (this.f35580a0.getHeight() + AndroidUtilities.navigationBarHeight) - i11, this.f35580a0.getWidth(), this.f35580a0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.B7);
            canvas.drawColor(-16777216);
            T0(canvas, this.Y, 0, 0, true, true, false);
            canvas.save();
            this.G7.reset();
            this.G7.postScale(1.0f, f10 / 16.0f);
            this.E7.setLocalMatrix(this.G7);
            this.C7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f35580a0.getWidth(), f10, this.C7);
            this.H7.reset();
            this.H7.postScale(1.0f, i11 / 16.0f);
            this.H7.postTranslate(0.0f, (this.f35580a0.getHeight() - i11) + AndroidUtilities.navigationBarHeight);
            this.F7.setLocalMatrix(this.H7);
            this.D7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f35580a0.getHeight() + AndroidUtilities.navigationBarHeight) - i11, this.f35580a0.getWidth(), this.f35580a0.getHeight() + AndroidUtilities.navigationBarHeight, this.D7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void V1() {
        Activity activity = this.f35797y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).W0.remove(this.f35708o1);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f35658i4;
        if (o2Var != null && o2Var.getFragmentView() != null) {
            this.f35660i6 = 1.0f;
            View fragmentView = this.f35658i4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.ki kiVar = this.W1;
            if (kiVar != null) {
                org.telegram.ui.ActionBar.d3 container = kiVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void V2(final org.telegram.ui.Components.ad adVar, boolean z10, boolean z11, final float[] fArr) {
        float f10;
        float f11;
        int i9;
        zt0 zt0Var = this.d;
        if (zt0Var != null && zt0Var.l()) {
            f10 = 175.0f;
        } else {
            f10 = 58.0f;
        }
        float dp = AndroidUtilities.dp(f10);
        float f12 = 1.0f;
        if (adVar == this.R1) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f13 = dp * f11;
        Integer num = null;
        if (!z11) {
            adVar.animate().setListener(null).cancel();
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            adVar.setVisibility(i9);
            if (z10) {
                f13 = 0.0f;
            }
            adVar.setTranslationY(f13);
            float alpha = this.L0.getAlpha();
            if (!z10) {
                f12 = 0.0f;
            }
            fArr[0] = f12;
            adVar.setAlpha(alpha * f12);
        } else if (z10 && adVar.getTag() == null) {
            if (adVar.getVisibility() != 0) {
                adVar.setVisibility(0);
                adVar.setAlpha(this.L0.getAlpha());
                adVar.setTranslationY(f13);
            }
            adVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f36540b;

                {
                    this.f36540b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f36540b;
                            float alpha2 = photoViewer.L0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = adVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.Q1) {
                                FrameLayout frameLayout = photoViewer.M7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35581a1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35589b1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35599c1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f36540b;
                            float alpha3 = photoViewer2.L0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = adVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.Q1) {
                                FrameLayout frameLayout2 = photoViewer2.M7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.L0.getTranslationY() - (photoViewer2.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35581a1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35589b1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35599c1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        } else if (!z10 && adVar.getTag() != null) {
            adVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f36540b;

                {
                    this.f36540b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f36540b;
                            float alpha2 = photoViewer.L0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = adVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.Q1) {
                                FrameLayout frameLayout = photoViewer.M7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f35581a1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35589b1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                                photoViewer.f35599c1.setTranslationY(photoViewer.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f36540b;
                            float alpha3 = photoViewer2.L0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = adVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.Q1) {
                                FrameLayout frameLayout2 = photoViewer2.M7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.L0.getTranslationY() - (photoViewer2.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f35581a1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35589b1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                                photoViewer2.f35599c1.setTranslationY(photoViewer2.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, photoViewer2.Q1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new xg(3, adVar)).start();
        }
        if (z10) {
            num = 1;
        }
        adVar.setTag(num);
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
                    this.f35691m3.h(((float) j10) / ((float) this.B2.q()), true);
                    this.f35701n3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f35797y instanceof LaunchActivity) {
                    dy dyVar = new dy(null);
                    dyVar.f37678j2 = url;
                    ((LaunchActivity) this.f35797y).q0(dyVar, false, true);
                    F0(false, false);
                    return;
                }
                return;
            } else if (this.f35649h4 != null && ((clickableSpan instanceof org.telegram.ui.Components.r41) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.y4.q0(this.f35649h4, url, true, true);
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
        zt0 zt0Var = this.d;
        boolean z14 = false;
        if (zt0Var != null && zt0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        yr0 yr0Var = this.Q1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(yr0Var, z13, z11, this.f35768u7);
        zr0 zr0Var = this.R1;
        if (z10 && z12) {
            z14 = true;
        }
        V2(zr0Var, z14, z11, this.f35776v7);
    }

    public final void X0(TLRPC.Document document, TLRPC.Document document2, boolean z10, Utilities.Callback2 callback2) {
        float f10;
        this.f35730q7 = document;
        this.f35721p7 = document2;
        this.f35740r7 = z10;
        this.f35750s7 = false;
        this.f35759t7 = callback2;
        this.X5 = 0.0f;
        this.f35594b6 = 0.0f;
        if (this.f35685l5 != null) {
            lt0 lt0Var = this.f35766u5;
            if (lt0Var != null) {
                lt0Var.m(false, false);
            }
            this.f35685l5.b();
            ArrayList arrayList = this.f35703n5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f35730q7 != null) {
            ArrayList arrayList2 = this.f35703n5;
            if (arrayList2 == null) {
                this.f35703n5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f35730q7, Integer.valueOf(this.P));
            if (findStickerEmoticons != null) {
                this.f35703n5.addAll(findStickerEmoticons);
            }
        }
        lt0 lt0Var2 = this.f35720p5;
        if (lt0Var2 != null) {
            lt0Var2.setCutOutState(false);
        }
        a3(true, false);
        ImageView imageView = this.Y0;
        if (imageView != null) {
            if (this.f35740r7) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void X1(bu0 bu0Var) {
        if (this.f35725q2) {
            n2(true);
        }
        MessageObject messageObject = this.P4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.P).cancelLoadFile(this.P4.getDocument());
        }
        this.f35616e = false;
        this.f35626f = false;
        this.f35600c2 = false;
        this.f35711o4 = true;
        this.P4 = null;
        this.U4 = null;
        this.V4 = null;
        this.W4 = null;
        this.X4 = null;
        this.f35622e5 = null;
        this.f35583a5 = null;
        this.f35690m2 = null;
        VideoAds videoAds = this.Q4;
        if (videoAds != null) {
            videoAds.stop();
            this.Q4 = null;
        }
        if (this.f35620e3 != null) {
            P2(false, false);
        }
        zs0 zs0Var = this.P1;
        if (zs0Var != null) {
            zs0Var.scrollTo(0, 0);
        }
        this.Y1 = 0;
        this.Z1 = false;
        this.a2 = false;
        this.f35590b2 = false;
        this.f35609d2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f35632f5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f35632f5 = null;
        }
        this.W1 = null;
        ff.s0 s0Var = this.X1;
        if (s0Var != null) {
            s0Var.destroy();
            this.X1 = null;
        }
        org.telegram.ui.Components.x5 x5Var = this.f35629f2;
        if (x5Var != null) {
            x5Var.w(this.f35580a0);
            this.f35629f2 = null;
        }
        for (int i9 = 0; i9 < 3; i9++) {
            xt0 xt0Var = this.S0[i9];
            if (xt0Var != null) {
                xt0Var.d(-1, false, true);
            }
        }
        p2(0);
        vr0 vr0Var = this.N7;
        if (vr0Var != null) {
            vr0Var.a();
        }
        this.f35664j1.e(0, false);
        this.f35802y4.setImageBitmap((Bitmap) null);
        this.B4.a();
        this.f35792x4.setImageBitmap((Bitmap) null);
        this.A4.a();
        this.f35811z4.setImageBitmap((Bitmap) null);
        this.C4.a();
        this.f35580a0.post(new iq0(this, bu0Var, 0));
        zt0 zt0Var = this.d;
        if (zt0Var != null) {
            zt0Var.G();
        }
        org.telegram.ui.Components.f30 f30Var = this.f35646h1;
        f30Var.d.clear();
        f30Var.f28248e.clear();
        f30Var.f28247c.clear();
        zt0 zt0Var2 = this.d;
        if (zt0Var2 != null) {
            zt0Var2.D();
        }
        this.d = null;
        this.l1.l();
        this.f35634f7 = null;
        this.f35711o4 = false;
        this.f35671j8 = 0.0f;
        this.f35680k8 = 1.0f;
        if (bu0Var != null) {
            bu0Var.f36978a.setVisible(true, true);
        }
        qn qnVar = this.f35649h4;
        if (qnVar != null) {
            qnVar.getFragmentView().invalidate();
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

    public final void Y1(org.telegram.messenger.MessageObject r23, org.telegram.tgnet.TLRPC.FileLocation r24, org.telegram.messenger.ImageLocation r25, org.telegram.messenger.ImageLocation r26, java.util.ArrayList r27, java.util.ArrayList r28, java.util.List r29, int r30, org.telegram.ui.bu0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.bu0):void");
    }

    public final void Y2(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i9;
        float f18;
        float f19;
        int i10;
        TextureView textureView;
        if (z10 && this.D3 && this.E3 && !this.B3 && (textureView = this.f35790x2) != null) {
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
        float f20 = 0.0f;
        if (z10) {
            if (this.O4) {
                this.f35627f0.setVisibility(0);
                View view = this.f35627f0;
                if (this.Y1 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f35627f0;
                if (this.Y1 == 11) {
                    i10 = 1711276032;
                } else {
                    i10 = 2130706432;
                }
                view2.setBackgroundColor(i10);
            }
            this.J7.setTag(1);
            AnimatorSet animatorSet2 = this.P7;
            bh.g gVar = this.L0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.Q1.getEditTextHeight() + gVar.getHeight();
            if (this.f35699n1) {
                i9 = AndroidUtilities.dp(58.0f);
            } else {
                i9 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gVar, property, 0.0f, editTextHeight + i9);
            bh.g gVar2 = this.L0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gVar2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.O0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f35627f0;
            if (this.O4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.J7.setTag(null);
            AnimatorSet animatorSet3 = this.P7;
            du0 du0Var = this.J7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(du0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.K7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f35627f0;
            Property property4 = View.ALPHA;
            if (this.O4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.P7.addListener(new qs0(this, z10, 3));
        this.P7.setDuration(200L);
        this.P7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.P7.start();
        float f21 = 0.25f;
        if (this.f35581a1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f35581a1.animate();
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
        if (this.f35589b1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f35589b1.animate();
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
        if (this.f35599c1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f35599c1.animate();
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

    public final boolean Z1(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z1(android.view.MotionEvent):boolean");
    }

    public final void Z2() {
        long a2;
        if (this.f35797y != null) {
            qn qnVar = this.f35649h4;
            if (qnVar != null) {
                a2 = qnVar.a();
            } else {
                zt0 zt0Var = this.d;
                if (zt0Var != null) {
                    a2 = zt0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a2;
            org.telegram.ui.Components.y4.K(this.f35797y, j10, -1L, 0, false, new oq0(this), null, new org.telegram.ui.Components.w4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false)), null);
        }
    }

    @Override
    public final Bitmap a() {
        TextureView textureView = this.M8;
        if (textureView != null && textureView.isAvailable()) {
            return this.M8.getBitmap();
        }
        return null;
    }

    public final int a1(int i9) {
        if (i9 != 1 && (i9 != 0 || this.Y1 != 1)) {
            if (i9 != 0 && i9 != 5 && i9 != 4 && i9 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final void a2(ArrayList arrayList, int i9, long j10, long j11, long j12, zt0 zt0Var) {
        e2((MessageObject) arrayList.get(i9), null, null, null, arrayList, null, null, i9, zt0Var, null, j10, j11, j12, true, null, null);
    }

    public final void a3(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        Integer num2;
        boolean z13;
        boolean z14;
        float f10;
        int i9;
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
            this.f35685l5.animate().setListener(null).cancel();
            yf.m2 m2Var = this.f35685l5;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m2Var.setVisibility(i10);
            this.f35685l5.setAlpha(this.L0.getAlpha());
            this.f35712o5.animate().setListener(null).cancel();
            ih.b3 b3Var = this.f35712o5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b3Var.setVisibility(i11);
            ih.b3 b3Var2 = this.f35712o5;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            b3Var2.setAlpha(f12);
        } else if (z10 && this.f35685l5.getTag() == null) {
            this.f35685l5.animate().setListener(null).cancel();
            this.f35712o5.animate().setListener(null).cancel();
            if (this.f35685l5.getVisibility() != 0) {
                this.f35685l5.setVisibility(0);
                this.f35685l5.animate().alpha(1.0f).start();
                this.f35712o5.setVisibility(0);
                this.f35712o5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f35685l5.getTag() != null) {
            this.f35685l5.animate().setListener(null).cancel();
            this.f35685l5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u9(this.f35685l5)).start();
            this.f35712o5.animate().setListener(null).cancel();
            this.f35712o5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u9(this.f35712o5)).start();
        }
        yf.m2 m2Var2 = this.f35685l5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        m2Var2.setTag(num);
        if (z10 && this.f35720p5.f49777f0 != 1 && !this.f35740r7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f35720p5.animate().setListener(null).cancel();
            lt0 lt0Var = this.f35720p5;
            if (z12) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            lt0Var.setVisibility(i9);
            lt0 lt0Var2 = this.f35720p5;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            lt0Var2.setAlpha(f11);
        } else if (z12 && this.f35720p5.getTag() == null) {
            this.f35720p5.animate().setListener(null).cancel();
            if (this.f35720p5.getVisibility() != 0) {
                this.f35720p5.setVisibility(0);
            }
            this.f35720p5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f35720p5.getTag() != null) {
            this.f35720p5.animate().setListener(null).cancel();
            this.f35720p5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u9(this.f35720p5)).start();
        }
        lt0 lt0Var3 = this.f35720p5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        lt0Var3.setTag(num2);
        if (z10 && this.f35720p5.f49777f0 == 1 && !this.f35740r7) {
            z13 = true;
        } else {
            z13 = false;
        }
        X2(z13, z11);
        yf.m2 m2Var3 = this.f35685l5;
        if (z10 && this.f35720p5.f49777f0 == 1 && this.f35766u5.f40229l0 && !this.f35738r5.f40229l0 && !this.f35748s5.f40229l0) {
            z14 = true;
        } else {
            z14 = false;
        }
        m2Var3.setOutlineVisible(z14);
        z15 = (!z10 || this.f35720p5.f49777f0 != 1 || this.f35738r5.f40229l0 || this.f35748s5.f40229l0) ? false : false;
        if (!z11) {
            this.f35766u5.animate().setListener(null).cancel();
            lt0 lt0Var4 = this.f35766u5;
            if (z15) {
                i12 = 0;
            }
            lt0Var4.setVisibility(i12);
            lt0 lt0Var5 = this.f35766u5;
            if (z15) {
                f13 = 1.0f;
            }
            lt0Var5.setAlpha(f13);
            lt0 lt0Var6 = this.f35766u5;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            lt0Var6.setScaleX(f10);
            lt0 lt0Var7 = this.f35766u5;
            if (!z15) {
                f14 = 0.8f;
            }
            lt0Var7.setScaleY(f14);
        } else if (z15 && this.f35766u5.getTag() == null) {
            this.f35766u5.animate().setListener(null).cancel();
            if (this.f35766u5.getVisibility() != 0) {
                this.f35766u5.setVisibility(0);
            }
            org.telegram.messenger.ll.r(this.f35766u5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.gr.h, 400L);
        } else if (!z15 && this.f35766u5.getTag() != null) {
            this.f35766u5.animate().setListener(null).cancel();
            org.telegram.messenger.ll.r(this.f35766u5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.u9(this.f35766u5)), org.telegram.ui.Components.gr.h, 400L);
        }
        lt0 lt0Var8 = this.f35766u5;
        if (!z15) {
            num3 = null;
        }
        lt0Var8.setTag(num3);
    }

    @Override
    public final void b(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    @Override
    public final void b1() {
        D1();
    }

    public final void b2(ArrayList arrayList, int i9, zt0 zt0Var) {
        e2(null, null, null, null, null, arrayList, null, i9, zt0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3(boolean z10) {
        Integer num;
        float f10;
        float f11;
        gt0 gt0Var;
        if (!z10 || this.f35710o3.getTag() == null) {
            if (!z10 && this.f35710o3.getTag() == null) {
                return;
            }
            if (z10 && !this.f35710o3.f32097s && ((gt0Var = this.f35588b0) == null || !gt0Var.f35295x || gt0Var.v.isEmpty())) {
                this.f35726q3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f35718p3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            js0 js0Var = this.f35710o3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            js0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35718p3 = animatorSet2;
            js0 js0Var2 = this.f35710o3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(js0Var2, property, f10);
            js0 js0Var3 = this.f35710o3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(js0Var3, property2, f11);
            js0 js0Var4 = this.f35710o3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(js0Var4, property3, f13);
            js0 js0Var5 = this.f35710o3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f12 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(js0Var5, property4, f12));
            this.f35718p3.setDuration(380L);
            this.f35718p3.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f35718p3.addListener(new fs0(this, 1));
            this.f35718p3.start();
        }
    }

    @Override
    public final Bitmap c() {
        TextureView textureView = this.f35790x2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.f35809z2 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmaps.createBitmap(this.f35800y2.getWidth(), this.f35800y2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(this.f35800y2, createBitmap);
            return createBitmap;
        }
        return null;
    }

    public final int c1(int i9) {
        int i10 = 0;
        if (i9 >= 0) {
            if (i9 != 1 && (i9 != 0 || this.Y1 != 1)) {
                if (i9 == 3 && this.H1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f35742s) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    return this.H1.getAdditionalTop() + dp + i10;
                } else if (i9 != 0 && i9 != 4 && i9 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f35742s) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i10;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f35742s) {
                    i10 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i10;
            }
        }
        return 0;
    }

    public final void c2(MessageObject messageObject, qn qnVar, long j10, long j11, long j12, rt0 rt0Var) {
        e2(messageObject, null, null, null, null, null, null, 0, rt0Var, qnVar, j10, j11, j12, true, null, null);
    }

    public final void c3(boolean z10, boolean z11) {
        int i9;
        Integer num = null;
        if (!z11) {
            this.M7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.M7;
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            frameLayout.setVisibility(i9);
            this.N7.setTranslationY(0.0f);
            this.M7.setAlpha(this.L0.getAlpha());
        } else if (z10 && this.M7.getTag() == null) {
            if (this.M7.getVisibility() != 0) {
                this.M7.setVisibility(0);
                this.M7.setAlpha(this.L0.getAlpha());
                this.N7.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.f35786w7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f35786w7.cancel();
            }
            vr0 vr0Var = this.N7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vr0Var, View.TRANSLATION_Y, vr0Var.getTranslationY(), 0.0f);
            this.f35786w7 = ofFloat;
            ofFloat.setDuration(220L);
            this.f35786w7.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f35786w7.start();
        } else if (!z10 && this.M7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.f35786w7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.f35786w7.cancel();
            }
            vr0 vr0Var2 = this.N7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vr0Var2, View.TRANSLATION_Y, vr0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.f35786w7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.u9(this.M7));
            this.f35786w7.setDuration(220L);
            this.f35786w7.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f35786w7.start();
        }
        FrameLayout frameLayout2 = this.M7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.M7.setTranslationY(this.L0.getTranslationY() - (this.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, this.Q1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.M7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final void d(Canvas canvas) {
        this.O8 = true;
        this.f35598c0.draw(canvas);
        this.O8 = false;
    }

    public final int d1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(boolean):int");
    }

    public final void d2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, rt0 rt0Var) {
        e2(null, fileLocation, imageLocation, null, null, null, null, 0, rt0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void d3() {
        org.telegram.ui.Components.k61 k61Var;
        if (this.f35699n1 && (k61Var = this.B2) != null && !k61Var.z()) {
            if (!this.f35732r || this.Y1 == 1) {
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
    public final void e(af.f fVar) {
        this.L8 = fVar;
        this.N8 = false;
        if (this.f35598c0 != null) {
            ((WindowManager) this.f35797y.getSystemService("window")).addView(this.f35598c0, this.Z);
            this.f35598c0.invalidate();
        }
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            k61Var.V(null);
            this.B2.W(null);
            this.B2.D();
            TextureView textureView = this.f35790x2;
            if (textureView != null) {
                this.B2.W(textureView);
                return;
            }
            SurfaceView surfaceView = this.f35800y2;
            if (surfaceView != null) {
                this.B2.V(surfaceView);
            }
        }
    }

    public final ClippingImageView[] e1(bu0 bu0Var) {
        int i9;
        if (!AndroidUtilities.isTablet() && bu0Var != null && bu0Var.f36988m != null) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i9 + 1];
        clippingImageViewArr[0] = this.f35607d0;
        if (i9 != 0) {
            ClippingImageView clippingImageView = bu0Var.f36988m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(bu0Var.f36989n);
        }
        return clippingImageViewArr;
    }

    public final boolean e2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.zt0 r25, org.telegram.ui.qn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.vt0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.zt0, org.telegram.ui.qn, long, long, long, boolean, org.telegram.ui.vt0, java.lang.Integer):boolean");
    }

    public final void e3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3(int):void");
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f35733r0;
        if (g1Var != null && g1Var.isEnabled() && this.L3) {
            return true;
        }
        return false;
    }

    public final org.telegram.ui.Components.ad f1() {
        zt0 zt0Var = this.d;
        if (zt0Var != null && zt0Var.A()) {
            return this.R1;
        }
        return this.Q1;
    }

    public final void f2(ArrayList arrayList, int i9, int i10, boolean z10, zt0 zt0Var, qn qnVar) {
        boolean z11;
        org.telegram.ui.Components.j6 j6Var;
        this.f35609d2 = z10;
        org.telegram.ui.Components.wo0 wo0Var = this.O0;
        int i11 = 0;
        if (wo0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wo0Var.getLayoutParams();
            if (i10 != 4 && i10 != 5) {
                if (i10 != 13 && i10 != 14 && i10 != 1 && i10 != 3 && i10 != 10 && i10 != 11) {
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
        if (i10 != 11 && this.f35685l5 != null) {
            this.f35740r7 = false;
            ImageView imageView = this.Y0;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            lt0 lt0Var = this.f35766u5;
            if (lt0Var != null) {
                lt0Var.m(false, false);
            }
            this.f35685l5.b();
            ArrayList arrayList2 = this.f35703n5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f35616e;
        BackgroundDrawable backgroundDrawable = this.H0;
        if (z12 && this.Y1 != i10 && i10 == 1) {
            this.Y1 = i10;
            this.f35725q2 = false;
            this.I.c("");
            this.I.a("", false);
            this.d = zt0Var;
            this.E5 = 0L;
            this.A5 = 0L;
            this.l1.l();
            this.f35634f7 = null;
            if (this.Q6 == null) {
                this.Q6 = VelocityTracker.obtain();
            }
            this.f35616e = true;
            this.f35626f = true;
            p3(false, false);
            this.f35647h2 = false;
            G0();
            j3(false, false);
            this.a3 = 0.0f;
            this.R2 = false;
            this.Q2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f35580a0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i9, null);
            E1();
            z2();
        } else if (z12 && this.Y1 != i10 && i10 == 11) {
            this.Y1 = i10;
            this.f35725q2 = false;
            this.I.c("");
            this.I.a("", false);
            this.d = zt0Var;
            this.E5 = 0L;
            this.A5 = 0L;
            this.l1.l();
            this.f35634f7 = null;
            if (this.Q6 == null) {
                this.Q6 = VelocityTracker.obtain();
            }
            this.f35616e = true;
            this.f35626f = true;
            p3(false, false);
            this.a3 = 0.0f;
            this.R2 = false;
            this.Q2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f35580a0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i9, null);
        } else {
            this.Y1 = i10;
            if (i10 == 12) {
                this.Y1 = 0;
                this.Z1 = true;
            }
            int i12 = this.Y1;
            if (i12 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35590b2 = z11;
            if (i12 == 13 || z11) {
                this.Y1 = 0;
                this.a2 = true;
            }
            this.f35579a.a(z11, false);
            if (this.Y1 == 11) {
                this.f35627f0.setBackgroundColor(-16777216);
            }
            yt0 yt0Var = this.I;
            if (yt0Var != null && (j6Var = yt0Var.d) != null) {
                if (this.a2) {
                    i11 = 8;
                }
                j6Var.setVisibility(i11);
            }
            e2(null, null, null, null, null, null, arrayList, i9, zt0Var, qnVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void f3(int i9, boolean z10) {
        if (this.P4 != null) {
            n2(false);
            FileLoader.getInstance(this.P).cancelLoadFile(this.P4.getDocument());
        } else if (this.f35622e5 != null) {
            TLObject d = this.f35634f7.d(this.L4);
            if (d instanceof TLRPC.Document) {
                n2(false);
                FileLoader.getInstance(this.P).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.f30 f30Var = this.f35646h1;
        if (f30Var != null) {
            f30Var.setAnimateBackground(true);
        }
        this.U2 = false;
        C2(this.L4 + i9, z10, true, false);
        if (R2(this.P4) || Q2(this.L4)) {
            this.U2 = true;
            T1(true);
            A0(0, true);
        }
        y0();
        try {
            d1.f.b(0);
            if (we.b.C().F()) {
                we.b.C().M(m1());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void g(af.f fVar) {
        if (org.telegram.ui.Components.pf0.f31622l0.L) {
            org.telegram.ui.Components.pf0.j(false);
        }
        this.L8 = fVar;
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            k61Var.V(null);
            this.B2.W(null);
            this.B2.D();
            this.B2.W(this.M8);
        }
        ((WindowManager) this.f35797y.getSystemService("window")).removeView(this.f35598c0);
        this.N8 = true;
        this.f35598c0.invalidate();
    }

    public final Bitmap.CompressFormat g1() {
        if (this.Y1 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void g2() {
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            k61Var.C();
            return;
        }
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null) {
            gt0Var.f();
        }
    }

    public final void g3() {
        float f10;
        boolean z10;
        int i9;
        xs0 xs0Var;
        int i10;
        xs0 xs0Var2;
        this.f35694m6 = null;
        this.L0.setVisibility(8);
        this.O0.setVisibility(8);
        this.f35663j0.setVisibility(8);
        this.f35581a1.setVisibility(8);
        this.f35589b1.setVisibility(8);
        this.f35599c1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = this.f35799y1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        this.f35673k1.setVisibility(8);
        this.f35673k1.setAlpha(0.0f);
        this.f35673k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.K0.setRotationX(0.0f);
        this.f35673k1.setEnabled(false);
        this.G = false;
        if (this.f35619e2) {
            this.M1.setVisibility(4);
        }
        int i11 = this.Y1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.f35605c7.size() > 1)) {
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            s3();
        }
        W2(false, true);
        a3(false, true);
        Bitmap bitmap = this.f35802y4.getBitmap();
        float f11 = this.W5;
        if (this.Y1 == 11) {
            this.f35623e6 = this.U5;
            this.f35613d6 = this.T5;
            this.f35633f6 = f11;
            this.f35642g6 = this.X5;
            this.f35594b6 = 0.0f;
        }
        qt0 qt0Var = this.T4;
        if (bitmap != null) {
            int bitmapWidth = this.f35802y4.getBitmapWidth();
            int bitmapHeight = this.f35802y4.getBitmapHeight();
            if (this.Y1 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.Z5 = dp;
                f10 = 0.0f;
                if (this.H1 != null) {
                    this.Z5 = (xs0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i12 = this.f35808z1.f47868i;
                if (i12 == 90 || i12 == 270) {
                    i10 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f12 = bitmapWidth;
                    float f13 = i10;
                    this.f35584a6 = r2(false) * (Math.min(k1(3) / f12, h1(3, false) / f13) / Math.min(k1(this.f35727q4) / f12, i1() / f13));
                    Rect rect = this.f35709o2;
                    this.Y5 = (rect.left / 2) - (rect.right / 2);
                    this.f35669j6 = System.currentTimeMillis();
                    this.N6 = true;
                }
                i10 = bitmapHeight;
                float f122 = bitmapWidth;
                float f132 = i10;
                this.f35584a6 = r2(false) * (Math.min(k1(3) / f122, h1(3, false) / f132) / Math.min(k1(this.f35727q4) / f122, i1() / f132));
                Rect rect2 = this.f35709o2;
                this.Y5 = (rect2.left / 2) - (rect2.right / 2);
                this.f35669j6 = System.currentTimeMillis();
                this.N6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -AndroidUtilities.dp(44.0f);
                if (!this.f35742s) {
                    i9 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i9 = 0;
                }
                float f14 = i13 + i9;
                this.Z5 = f14;
                if (this.H1 != null) {
                    float additionalTop = (xs0Var.getAdditionalTop() / 2.0f) + f14;
                    this.Z5 = additionalTop;
                    this.Z5 = additionalTop - (this.H1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = qt0Var.f42197c;
                if (cropState != null) {
                    int i14 = cropState.transformRotation;
                    if (i14 == 90 || i14 == 270) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                    i10 = (int) (bitmapHeight * cropState.cropPh);
                    float f1222 = bitmapWidth;
                    float f1322 = i10;
                    this.f35584a6 = r2(false) * (Math.min(k1(3) / f1222, h1(3, false) / f1322) / Math.min(k1(this.f35727q4) / f1222, i1() / f1322));
                    Rect rect22 = this.f35709o2;
                    this.Y5 = (rect22.left / 2) - (rect22.right / 2);
                    this.f35669j6 = System.currentTimeMillis();
                    this.N6 = true;
                }
                i10 = bitmapHeight;
                float f12222 = bitmapWidth;
                float f13222 = i10;
                this.f35584a6 = r2(false) * (Math.min(k1(3) / f12222, h1(3, false) / f13222) / Math.min(k1(this.f35727q4) / f12222, i1() / f13222));
                Rect rect222 = this.f35709o2;
                this.Y5 = (rect222.left / 2) - (rect222.right / 2);
                this.f35669j6 = System.currentTimeMillis();
                this.N6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        xs0 xs0Var3 = this.H1;
        if (xs0Var3 != null) {
            if (this.Y1 == 11 && (qt0Var == null || qt0Var.f42197c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            xs0Var3.setDrawShadow(z10);
        }
        this.f35598c0.setClipChildren(true);
        this.f35627f0.setVisibility(4);
        this.f35686l6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f10);
        ofFloat.addUpdateListener(new fq0(this, 6));
        ofFloat2.addUpdateListener(new fq0(this, 7));
        this.f35686l6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.H1.n0(true);
        this.f35686l6.setDuration(200L);
        this.f35686l6.addListener(new fs0(this, 3));
        this.f35686l6.start();
    }

    public float getAnimationValue() {
        return this.f35651h6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f35797y);
        this.M8 = textureView;
        textureView.setOpaque(false);
        View view = this.K8;
        if (view != null) {
            view.bringToFront();
        }
        return this.M8;
    }

    public final int h1(int i9, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f35742s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f35709o2.bottom) + AndroidUtilities.displaySize.y;
            if ((i9 == 0 || i9 == 4 || i9 == 5) && this.Y1 != 1 && !z11) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f35580a0.getMeasuredHeight();
        }
        if ((i9 == 0 && this.Y1 == 1) || i9 == 1) {
            return measuredHeight - AndroidUtilities.dp(144.0f);
        }
        if (i9 == 2) {
            return measuredHeight - AndroidUtilities.dp(214.0f);
        }
        if (i9 == 3) {
            return measuredHeight - (this.H1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.H1.getAdditionalBottom() + AndroidUtilities.dp(48.0f))));
        }
        return measuredHeight;
    }

    public final void h2() {
        xe.d dVar = this.C2;
        if (dVar != null) {
            dVar.b(true);
        }
        if (org.telegram.ui.Components.pf0.p() != null) {
            org.telegram.ui.Components.pf0.p().b(true);
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

    public final void i0(float f10, float f11, float f12, boolean z10) {
        if (this.W5 == f10 && this.T5 == f11 && this.U5 == f12) {
            return;
        }
        this.N6 = z10;
        this.f35584a6 = f10;
        this.Y5 = f11;
        this.Z5 = f12;
        this.f35669j6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35686l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f));
        this.f35686l6.setInterpolator(this.p6);
        this.f35686l6.setDuration(250);
        this.f35686l6.addListener(new fs0(this, 7));
        this.f35686l6.start();
    }

    public final int i1() {
        return h1(this.f35727q4, false);
    }

    public final void i2() {
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            k61Var.D();
            return;
        }
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null) {
            gt0Var.g();
        }
    }

    public final void i3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        m5.q e10;
        m5.q e11;
        float f10;
        int i9;
        m5.q e12;
        boolean z10;
        if (!Q1()) {
            return;
        }
        this.J8 = true;
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            if (!d1.f.t() && !this.f35732r) {
                z10 = false;
            } else {
                z10 = true;
            }
            k61Var.P(z10);
        }
        if (this.B2 != null && d1.f.t() && ((atomicInteger = d1.f.f4254b) == null || atomicInteger.get() <= 0)) {
            o5.h e13 = d1.f.e();
            if (e13 == null) {
                a2 = -1;
            } else {
                a2 = e13.a();
            }
            if (a2 >= 0 && Math.abs(this.B2.o() - a2) > 1000) {
                this.B2.L(a2);
            }
            o5.h e14 = d1.f.e();
            if (e14 == null) {
                m10 = false;
            } else if (d1.f.f4253a == 0) {
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
                o5.h e15 = d1.f.e();
                float f11 = 0.5f;
                if (e15 == null || (e11 = e15.e()) == null) {
                    f10 = 0.5f;
                } else {
                    f10 = (float) e11.f17459r;
                }
                if (Math.abs(g10 - f10) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.A.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i9 = audioManager.getStreamMinVolume(3);
                    } else {
                        i9 = 0;
                    }
                    float f12 = streamMaxVolume - i9;
                    o5.h e16 = d1.f.e();
                    if (e16 != null && (e12 = e16.e()) != null) {
                        f11 = (float) e12.f17459r;
                    }
                    int i10 = i9 + ((int) (f11 * f12));
                    if (i10 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i10, 1);
                    }
                }
            }
            o5.h e17 = d1.f.e();
            float f13 = 1.0f;
            if (e17 != null && (e10 = e17.e()) != null) {
                f13 = (float) e10.d;
            }
            C0(true, false, f13);
        }
        nr nrVar = this.f35743s0;
        if (nrVar != null) {
            nrVar.a(d1.f.t());
        }
        this.J8 = false;
    }

    public final CharSequence j0() {
        int i9;
        TLRPC.EncryptedChat encryptedChat;
        if (Q1() && this.d != null && (i9 = this.L4) >= 0) {
            ArrayList arrayList = this.f35605c7;
            if (i9 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                CharSequence text = f1().getText();
                boolean z10 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f35687l7 && !TextUtils.equals(this.f35695m7, text) && this.d.R(this.L4) != 0 && this.d.H() > 0) {
                    this.f35687l7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.P);
                qn qnVar = this.f35649h4;
                if (qnVar == null || ((encryptedChat = qnVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z10 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10);
                CharSequence charSequence = charSequenceArr[0];
                this.f35695m7 = charSequence;
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
                zt0 zt0Var = this.d;
                if (zt0Var != null) {
                    zt0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int j1() {
        return k1(this.f35727q4);
    }

    public final void j3(boolean z10, boolean z11) {
        k3(z10, z11, jt0.f39626e);
    }

    public final void k0(android.graphics.Canvas r24, int r25, int r26, int r27, int r28, float r29, tf.f r30, org.telegram.messenger.MediaController.CropState r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k0(android.graphics.Canvas, int, int, int, int, float, tf.f, org.telegram.messenger.MediaController$CropState):void");
    }

    public final int k1(int i9) {
        int dp;
        int width = this.f35580a0.getWidth();
        if (i9 != 1 && (i9 != 0 || this.Y1 != 1)) {
            if (i9 != 0 && i9 != 4 && i9 != 5 && i9 != 3) {
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

    public final void k3(boolean r17, boolean r18, org.telegram.ui.jt0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3(boolean, boolean, org.telegram.ui.jt0):void");
    }

    public final void l0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l0():void");
    }

    public final float l1(boolean z10) {
        int bitmapWidth;
        int bitmapHeight;
        int i9;
        ImageReceiver imageReceiver = this.f35802y4;
        if (z10) {
            bitmapWidth = imageReceiver.getBitmapHeight();
        } else {
            bitmapWidth = imageReceiver.getBitmapWidth();
        }
        if (z10) {
            bitmapHeight = this.f35802y4.getBitmapWidth();
        } else {
            bitmapHeight = this.f35802y4.getBitmapHeight();
        }
        if (!this.f35742s) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float min = Math.min(this.f35799y1.getMeasuredWidth(), (this.f35799y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i9) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void l2() {
        yf.m2 m2Var = this.f35685l5;
        if (m2Var != null && this.Y1 == 11) {
            if (this.f35740r7) {
                m2Var.b();
            } else {
                m2Var.m(this.f35802y4.getBitmap(), this.f35802y4.getOrientation(), k1(this.f35727q4), i1(), new mq0(this, 0));
            }
        }
    }

    public final void l3(boolean z10) {
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
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        bh.g gVar = this.L0;
        Property property = View.ALPHA;
        float f18 = 1.0f;
        float f19 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(gVar, property, f10));
        bh.g gVar2 = this.L0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(gVar2, property2, f11));
        yf.m2 m2Var = this.f35685l5;
        if (m2Var != null) {
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m2Var, property, f17));
        }
        if (this.f35685l5 != null) {
            ih.b3 b3Var = this.f35712o5;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b3Var, property, f16));
        }
        org.telegram.ui.Components.wo0 wo0Var = this.O0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(wo0Var, property, f12));
        org.telegram.ui.Components.wo0 wo0Var2 = this.O0;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(wo0Var2, property2, f13));
        int i9 = this.Y1;
        if (i9 == 0 || i9 == 4) {
            CheckBox checkBox = this.J0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f14));
            CheckBox checkBox2 = this.J0;
            if (z10) {
                f15 = 0.0f;
            } else {
                f15 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f15));
            CounterView counterView = this.K0;
            if (!z10) {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f18));
            CounterView counterView2 = this.K0;
            if (!z10) {
                f19 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f19));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z10 && H1()) {
            D0(true);
            kh.g gVar3 = this.Q1.f15632f;
            if (gVar3.f33124e) {
                gVar3.k(true);
            }
            kh.g gVar4 = this.R1.f15632f;
            if (gVar4.f33124e) {
                gVar4.k(true);
            }
            this.Q1.f15632f.d();
            this.R1.f15632f.d();
        }
    }

    public final void m0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m0(android.graphics.Bitmap):void");
    }

    public final we.g m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m1():we.g");
    }

    public final void m2(String str, long j10, boolean z10, float f10, float f11, int i9, long j11) {
        boolean z11;
        int parseInt;
        if (this.f35751s8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f35751s8);
            this.f35751s8 = null;
        }
        vr0 vr0Var = this.N7;
        vr0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        vr0Var.f33293y = mediaMetadataRetriever;
        boolean z12 = true;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vr0Var.f33291w = z11;
        vr0Var.d = f10;
        vr0Var.f33286e = f11;
        float f12 = vr0Var.f33290s;
        if (f12 < f10) {
            vr0Var.f33290s = f10;
        } else if (f12 > f11) {
            vr0Var.f33290s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                vr0Var.f33292x = open;
                vr0Var.f33293y.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = vr0Var.f33293y.extractMetadata(9);
            if (extractMetadata != null) {
                vr0Var.f33282a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = vr0Var.f33293y.extractMetadata(18);
            if (extractMetadata2 != null) {
                vr0Var.f33284b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = vr0Var.f33293y.extractMetadata(19);
            if (extractMetadata3 != null) {
                vr0Var.f33285c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = vr0Var.f33293y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = vr0Var.f33284b;
                vr0Var.f33284b = vr0Var.f33285c;
                vr0Var.f33285c = i11;
            }
            if (vr0Var.f33291w) {
                vr0Var.f33287f = (float) ((j11 / 1000.0d) / vr0Var.f33282a);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        vr0Var.invalidate();
        this.f35760t8 = null;
        if (!z10 && this.Y1 != 1) {
            z12 = false;
        }
        this.f35732r = z12;
        this.U7 = -1;
        this.W7 = 0;
        this.f35625e8 = 25;
        this.f35722p8 = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ht0 ht0Var = new ht0(this, str, j10, i9);
        this.f35751s8 = ht0Var;
        dispatchQueue.postRunnable(ht0Var);
    }

    public final void m3(boolean z10, boolean z11) {
        float f10;
        gq0 gq0Var = this.f35787x;
        AndroidUtilities.cancelRunOnUIThread(gq0Var);
        int i9 = 0;
        if (z11) {
            n3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f35778w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f35778w = null;
                }
                if (this.N3) {
                    this.N3 = false;
                    n3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(gq0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f35778w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                n3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f35778w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f35778w = null;
        }
        gd gdVar = this.T0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        gdVar.setAlpha(f10);
        gd gdVar2 = this.T0;
        if (!z10) {
            i9 = 4;
        }
        gdVar2.setVisibility(i9);
    }

    public final void n0(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        MediaController.CropState cropState;
        if (this.f35686l6 != null) {
            f14 = AndroidUtilities.lerp(0.0f, this.f35604c6, this.f35651h6);
            f10 = AndroidUtilities.lerp(this.W5, this.f35584a6, this.f35651h6);
            f11 = AndroidUtilities.lerp(this.X5, this.f35594b6, this.f35651h6);
            f12 = AndroidUtilities.lerp(this.U5, this.Z5, this.f35651h6);
            f13 = AndroidUtilities.lerp(this.T5, this.Y5, this.f35651h6);
        } else {
            f10 = this.W5;
            f11 = this.X5;
            f12 = this.U5;
            f13 = this.T5;
            if (this.f35669j6 != 0) {
                f13 = this.Y5;
                f12 = this.Z5;
                f10 = this.f35584a6;
            }
            f14 = 0.0f;
        }
        int k12 = k1(this.f35727q4);
        int i12 = i1();
        canvas.translate(a1(this.f35727q4), c1(this.f35727q4));
        canvas.translate(f13, f12 + 0.0f);
        canvas.scale(f10, f10);
        canvas.rotate(f11);
        int bitmapWidth = this.f35802y4.getBitmapWidth();
        int bitmapHeight = this.f35802y4.getBitmapHeight();
        float f18 = k12;
        float f19 = bitmapWidth;
        float f20 = f18 / f19;
        float f21 = i12;
        float f22 = bitmapHeight;
        float f23 = f21 / f22;
        float min = Math.min(f20, f23);
        tf.f fVar = this.f35808z1;
        int i9 = fVar.f47868i;
        if (i9 != 90 && i9 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f24 = fVar.f47869j;
        float f25 = fVar.f47870k;
        float f26 = bitmapHeight;
        float f27 = bitmapWidth;
        float f28 = f10;
        float f29 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        float f30 = f18 / f29;
        float f31 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        if (f30 * f31 > f21) {
            f30 = f21 / f31;
        }
        int i10 = this.Y1;
        float f32 = f30;
        qt0 qt0Var = this.T4;
        if (i10 != 1 && ((this.f35727q4 != 1 || this.f35678k6 == 0) && qt0Var.f42197c != null)) {
            float f33 = f29 * f32;
            float f34 = f31 * f32;
            if (f20 * f22 > f21) {
                f20 = f23;
            }
            float z10 = e2.c.z((f19 * f20) / f28, f33, 0.0f, f33);
            float z11 = e2.c.z((f22 * f20) / f28, f34, 0.0f, f34);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.Y1 == 1 || fVar.f47862a) {
            TextureView textureView = this.f35790x2;
            if (textureView != null) {
                MediaController.CropState cropState2 = qt0Var.f42197c;
                if (cropState2 != null && cropState2.mirrored) {
                    f16 = -1.0f;
                } else {
                    f16 = 1.0f;
                }
                textureView.setScaleX(f16);
                st0 st0Var = this.A2;
                if (st0Var != null) {
                    st0Var.setScaleX(this.f35790x2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = qt0Var.f42197c;
            if (cropState3 != null) {
                f15 = cropState3.cropScale;
            } else {
                f15 = 1.0f;
            }
            float z12 = ((f32 / min) / e2.c.z(f15, 1.0f, 0.0f, 1.0f)) * f15;
            canvas.translate(fVar.d * 1.0f, fVar.f47865e * 1.0f);
            canvas.scale(z12, z12);
            canvas.translate(e2.c.C(fVar.f47863b, f26, min, 1.0f), e2.c.C(fVar.f47864c, f27, min, 1.0f));
            float f35 = fVar.f47867g + i9;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            canvas.rotate(f35);
        }
        if (!this.f35605c7.isEmpty() && (cropState = qt0Var.f42197c) != null && cropState.mirrored) {
            f17 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f17 = 1.0f;
        }
        if (f14 > 0.0f) {
            canvas.scale(f17 - (2.0f * f14), f17);
            canvas.skew(0.0f, org.telegram.messenger.l0.y(f17, f14, 4.0f * f14, 0.25f));
        }
    }

    public final org.telegram.messenger.VideoEditedInfo n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void n2(boolean z10) {
        int i9 = 0;
        this.f35809z2 = false;
        xe.d dVar = this.C2;
        if (dVar != null) {
            dVar.c();
            this.C2 = null;
        }
        org.telegram.ui.Components.k61 k61Var = this.B2;
        HashMap hashMap = R8;
        xr0 xr0Var = this.f35754t2;
        if (k61Var != null) {
            t0();
            AndroidUtilities.cancelRunOnUIThread(this.f35745s2);
            AndroidUtilities.cancelRunOnUIThread(xr0Var);
            if (this.Y2 != null) {
                float o6 = ((float) this.B2.o()) / ((float) this.B2.q());
                String str = this.Y2;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new fu0(o6));
                MessageObject messageObject = this.P4;
                if (messageObject != null) {
                    messageObject.cachedSavedTimestamp = Float.valueOf(o6);
                }
            }
            this.B2.I();
            this.B2 = null;
        } else {
            this.T2 = false;
        }
        if (this.f35588b0 != null) {
            AndroidUtilities.cancelRunOnUIThread(xr0Var);
            if (this.Y2 != null) {
                float o12 = ((float) o1()) / ((float) A1());
                String str2 = this.Y2;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new fu0(o12));
                MessageObject messageObject2 = this.P4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(o12);
                }
            }
        }
        ks0 ks0Var = this.S3;
        if (ks0Var != null) {
            ks0Var.disable();
            this.S3 = null;
        }
        this.f35710o3.a();
        m3(false, false);
        this.f35700n2 = false;
        this.Q2 = false;
        if (this.f35733r0.isEnabled()) {
            this.f35733r0.setEnabled(false);
            this.f35733r0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f35610d3) {
            try {
                this.f35797y.getWindow().clearFlags(128);
                this.f35610d3 = false;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ps0 ps0Var = this.f35763u2;
        if (ps0Var != null) {
            try {
                this.f35580a0.removeView(ps0Var);
            } catch (Throwable unused) {
            }
            this.f35763u2 = null;
        }
        r0();
        this.f35772v2 = null;
        TextureView textureView = this.f35790x2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.y51) {
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                org.telegram.ui.Components.hz hzVar = y51Var.f34862b;
                if (hzVar != null) {
                    hzVar.postRunnable(new org.telegram.ui.Components.ez(hzVar, 0));
                }
                y51Var.f34861a = null;
            }
            this.f35790x2 = null;
        }
        this.X.e();
        if (this.f35800y2 != null) {
            this.f35800y2 = null;
        }
        if (this.L3) {
            this.L3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f35611d4);
        }
        if (!z10 && !this.w8 && !this.f35796x8) {
            P2(false, true);
        }
        xt0 xt0Var = this.S0[0];
        while (true) {
            float[] fArr = xt0Var.f44598n;
            if (i9 < fArr.length) {
                xt0Var.f44597m[i9] = 1.0f;
                fArr[i9] = 1.0f;
                i9++;
            } else {
                xt0Var.a();
                return;
            }
        }
    }

    public final void n3(boolean z10) {
        float f10;
        if (z10) {
            this.T0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35778w = animatorSet;
        gd gdVar = this.T0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(gdVar, property, f10));
        this.f35778w.setDuration(200L);
        this.f35778w.addListener(new qs0(this, z10, 1));
        this.f35778w.start();
    }

    public final Size o0() {
        float f10;
        int i9;
        int round;
        int i10;
        if (this.U7 == 1) {
            return new Size(this.X7, this.Y7);
        }
        int i11 = this.T7;
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
        if (this.X7 > this.Y7) {
            i9 = this.X7;
        } else {
            i9 = this.Y7;
        }
        float f11 = f10 / i9;
        if (this.T7 == this.U7 - 1 && f11 >= 1.0f) {
            i10 = this.X7;
            round = this.Y7;
        } else {
            int round2 = Math.round((this.X7 * f11) / 2.0f) * 2;
            round = Math.round((this.Y7 * f11) / 2.0f) * 2;
            i10 = round2;
        }
        int i12 = i10 % 4;
        if (i12 != 0 || round % 4 != 0) {
            i10 = (i10 - i12) - (round % 4);
        }
        return new Size(i10, round);
    }

    public final long o1() {
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null && gt0Var.f35295x) {
            return gt0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.o();
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
        ConnectionsManager.getInstance(this.P).cancelRequestsForGuid(this.f35597c);
    }

    public final void o3(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i9 = this.Y1;
        if (i9 == 0 || i9 == 4) {
            CheckBox checkBox = this.J0;
            Property property = View.ALPHA;
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f10));
            CheckBox checkBox2 = this.J0;
            Property property2 = View.TRANSLATION_Y;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f11));
            CounterView counterView = this.K0;
            if (!z10) {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f12));
            CounterView counterView2 = this.K0;
            if (!z10) {
                f13 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f13));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.K6 && this.J0.getVisibility() != 0) {
            boolean[] zArr = this.f35744s1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f35580a0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.f35792x4.hasImageSet()) {
                        zArr[0] = true;
                        this.f35580a0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f35580a0.getMeasuredWidth() - min && this.f35811z4.hasImageSet()) {
                    zArr[1] = true;
                    this.f35580a0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.W5 != 1.0f && this.Y1 != 11) {
            this.R6.abortAnimation();
            this.R6.fling(Math.round(this.T5), Math.round(this.U5), Math.round(f10), Math.round(f11), (int) this.A6, (int) this.B6, (int) this.C6, (int) this.D6);
            this.f35580a0.postInvalidate();
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

    public final boolean p0(MotionEvent motionEvent) {
        boolean z10;
        gt0 gt0Var;
        if (this.B2 != null || ((gt0Var = this.f35588b0) != null && gt0Var.f35295x)) {
            if (motionEvent.getX() >= (k1(this.f35727q4) / 3) * 2) {
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

    public final TLObject p1(int i9, long[] jArr) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.f35585a7;
        if (!arrayList.isEmpty()) {
            if (i9 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) arrayList.get(i9)).secureFile.size;
            }
            return (TLObject) arrayList.get(i9);
        }
        ArrayList arrayList2 = this.W6;
        if (!arrayList2.isEmpty()) {
            if (i9 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.Y6;
                if (arrayList3.get(i9) != null) {
                    jArr[0] = ((Long) arrayList3.get(i9)).longValue();
                }
            }
            ArrayList arrayList4 = this.X6;
            if (arrayList4.get(i9) == null) {
                return null;
            }
            return ((ImageLocation) arrayList4.get(i9)).location;
        }
        ArrayList arrayList5 = this.U6;
        if (arrayList5.isEmpty() || i9 >= arrayList5.size()) {
            return null;
        }
        MessageObject messageObject = (MessageObject) arrayList5.get(i9);
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

    public final void p2(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f35760t8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f35760t8);
        }
        if (this.f35796x8 && !this.f35769u8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35796x8 = false;
        this.f35777v8 = false;
        this.L7.setVisibility(4);
        if (i9 == 1) {
            if (this.f35586a8 == this.Y7 && this.Z7 == this.X7) {
                this.f35769u8 = false;
                xt0 xt0Var = this.S0[0];
                if (xt0Var.h != 0 && xt0Var.f44595k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                xt0Var.f(0.0f, z12);
                this.S0[0].d(3, false, true);
                if (!z10) {
                    k2(this.R4, this.S4, false, false, this.T4.d, false, 0L);
                    this.B2.L(this.N7.getLeftProgress() * this.f35615d8);
                } else {
                    this.f35777v8 = true;
                }
            } else {
                n2(false);
                if (this.f35760t8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f22401id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.A5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f35760t8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f35760t8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f35760t8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.W7;
                    videoEditedInfo.originalWidth = this.X7;
                    this.f35760t8.videoEditedInfo.originalHeight = this.Y7;
                    VideoEditedInfo videoEditedInfo2 = this.f35760t8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f35625e8;
                    Uri uri = this.S4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f35760t8.videoEditedInfo;
                long j10 = this.f35653h8;
                videoEditedInfo3.startTime = j10;
                long j11 = this.f35662i8;
                videoEditedInfo3.endTime = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f35615d8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    videoEditedInfo3.endTime = j10 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f35596b8;
                this.f35760t8.videoEditedInfo.resultWidth = this.Z7;
                this.f35760t8.videoEditedInfo.resultHeight = this.f35586a8;
                VideoEditedInfo videoEditedInfo4 = this.f35760t8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f35615d8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f35760t8, true, true, true)) {
                    this.f35769u8 = true;
                }
                this.f35796x8 = true;
                xt0 xt0Var2 = this.S0[0];
                if (xt0Var2.h != 0 && xt0Var2.f44595k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                xt0Var2.f(0.0f, z11);
                this.S0[0].d(0, false, true);
            }
        } else {
            this.f35769u8 = false;
            this.S0[0].d(3, false, true);
            if (i9 == 2) {
                k2(this.R4, this.S4, false, false, this.T4.d, false, 0L);
                this.B2.L(this.N7.getLeftProgress() * this.f35615d8);
            }
        }
        this.f35580a0.invalidate();
    }

    public final void p3(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10 != this.G) {
            if (z10) {
                this.f35673k1.setVisibility(0);
            }
            this.G = z10;
            this.f35673k1.setEnabled(z10);
            float f14 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                hu0 hu0Var = this.f35673k1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(hu0Var, property, f12));
                hu0 hu0Var2 = this.f35673k1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(hu0Var2, property2, f13));
                CounterView counterView = this.K0;
                Property property3 = View.ROTATION_X;
                if (!z10) {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f14));
                AnimatorSet animatorSet = new AnimatorSet();
                this.f35789x1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z10) {
                    this.f35789x1.addListener(new fs0(this, 4));
                }
                this.f35789x1.setDuration(200L);
                this.f35789x1.start();
                return;
            }
            hu0 hu0Var3 = this.f35673k1;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            hu0Var3.setAlpha(f10);
            hu0 hu0Var4 = this.f35673k1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(10.0f);
            }
            hu0Var4.setTranslationY(f11);
            CounterView counterView2 = this.K0;
            if (!z10) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z10) {
                this.f35673k1.setVisibility(8);
            }
        }
    }

    public final boolean q0() {
        qn qnVar = this.f35649h4;
        if (qnVar != null) {
            if (qnVar.f41903f == null) {
                TLRPC.Chat chat = qnVar.f41890e;
                if (chat != null && !ChatObject.isNotInChat(chat)) {
                    if (ChatObject.canSendPhoto(this.f35649h4.f41890e) || ChatObject.canSendVideo(this.f35649h4.f41890e)) {
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

    public final float q2() {
        return r2(true);
    }

    public final void q3() {
        boolean z10;
        org.telegram.ui.Components.k61 k61Var;
        org.telegram.ui.Components.k61 k61Var2;
        gt0 gt0Var;
        org.telegram.ui.Components.k61 k61Var3 = this.B2;
        if (k61Var3 == null && ((gt0Var = this.f35588b0) == null || !gt0Var.f35295x)) {
            return;
        }
        if (k61Var3 != null) {
            z10 = this.L3;
        } else {
            z10 = this.f35588b0.C;
        }
        t0();
        AndroidUtilities.cancelRunOnUIThread(this.f35754t2);
        if (z10) {
            g2();
        } else {
            if (this.f35699n1) {
                if (Math.abs(this.N7.getProgress() - this.N7.getRightProgress()) < 0.01f || ((k61Var2 = this.B2) != null && k61Var2.o() == this.B2.q())) {
                    u2(this.N7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f35691m3.c() - this.N7.getRightProgress()) < 0.01f || ((k61Var = this.B2) != null && k61Var.o() == this.B2.q())) {
                    u2(0.0f);
                }
                s2();
            }
            i2();
        }
        this.f35580a0.invalidate();
    }

    public final void r0() {
        AnimatorSet animatorSet;
        View view = this.f35772v2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f35772v2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.f35781w2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f35781w2 = null;
        }
        org.telegram.ui.Components.be0 be0Var = this.f35799y1;
        if (be0Var != null && (animatorSet = be0Var.f27189s) != null) {
            animatorSet.cancel();
            be0Var.f27189s = null;
            be0Var.f27186f = false;
        }
    }

    public final String r1(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f35585a7;
            if (!arrayList.isEmpty()) {
                if (i9 < arrayList.size()) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i9);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(secureDocument.secureFile.dc_id);
                    sb2.append("_");
                    return aa.d.q(sb2, secureDocument.secureFile.f22515id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.W6;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.U6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.f35605c7;
                if (!arrayList4.isEmpty()) {
                    if (i9 < arrayList4.size()) {
                        Object obj = arrayList4.get(i9);
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
                vt0 vt0Var = this.f35634f7;
                if (vt0Var != null) {
                    return vt0Var.c(i9);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i9 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i9);
                    ImageLocation imageLocation2 = (ImageLocation) this.X6.get(i9);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(imageLocation2.location.volume_id);
                            sb4.append("_");
                            return aa.d.l(imageLocation2.location.local_id, ".mp4", sb4);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(imageLocation.location.volume_id);
                        sb5.append("_");
                        return aa.d.l(imageLocation.location.local_id, ".jpg", sb5);
                    }
                    return null;
                }
                return null;
            } else if (i9 >= arrayList3.size()) {
                return null;
            } else {
                return FileLoader.getMessageFileName(((MessageObject) arrayList3.get(i9)).messageOwner);
            }
        }
        return null;
    }

    public final float r2(boolean z10) {
        int i9;
        if (this.Y1 == 11) {
            int k12 = k1(this.f35727q4);
            if (k12 == 0) {
                k12 = AndroidUtilities.displaySize.x;
            }
            float D = org.telegram.messenger.ll.D(20.0f, k12, 1) / k12;
            if (z10) {
                int bitmapWidth = this.f35802y4.getBitmapWidth();
                int bitmapHeight = this.f35802y4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i9 = this.L4) >= 0) {
                    ArrayList arrayList = this.f35605c7;
                    if (i9 < arrayList.size()) {
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
                    return (bitmapWidth / bitmapHeight) * D;
                }
            }
            return D;
        }
        return 1.0f;
    }

    public final void r3() {
        View view = this.P3;
        if (view != null) {
            xt0 xt0Var = this.S0[0];
            int i9 = xt0Var.h;
            if (xt0Var.f44600p && (i9 == 3 || i9 == 4 || i9 == 2 || i9 == 1)) {
                if (i9 == 3) {
                    view.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                } else if (i9 == 2) {
                    view.setContentDescription(LocaleController.getString("AccActionDownload", R.string.AccActionDownload));
                } else if (i9 == 1) {
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
        if (this.Y1 == 11) {
            lt0 lt0Var = this.f35720p5;
            if (lt0Var.f49777f0 == 2) {
                lt0Var.setCutOutState(true);
                X2(true, true);
                this.f35685l5.f();
                this.f35580a0.invalidate();
            }
        }
    }

    public final ImageLocation s1(int i9, long[] jArr) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f35585a7;
            if (!arrayList.isEmpty()) {
                if (i9 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((SecureDocument) arrayList.get(i9)).secureFile.size;
                    }
                    return ImageLocation.getForSecureDocument((SecureDocument) arrayList.get(i9));
                }
            } else {
                ArrayList arrayList2 = this.W6;
                if (!arrayList2.isEmpty()) {
                    if (i9 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.Y6;
                            if (arrayList3.get(i9) != null) {
                                jArr[0] = ((Long) arrayList3.get(i9)).longValue();
                            }
                        }
                        return (ImageLocation) this.X6.get(i9);
                    }
                } else {
                    ArrayList arrayList4 = this.U6;
                    if (!arrayList4.isEmpty() && i9 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i9);
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
                                    if (this.f35803y5 == 5) {
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
                xr0 xr0Var = this.f35754t2;
                AndroidUtilities.cancelRunOnUIThread(xr0Var);
                AndroidUtilities.runOnUIThread(xr0Var, 3000);
            }
        }
    }

    public final void s3() {
        if (this.f35779w0 != null && this.I != null) {
            float f10 = 0.0f;
            for (int i9 = 0; i9 < this.f35779w0.getChildCount(); i9++) {
                View childAt = this.f35779w0.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    f10 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f10;
                }
            }
            CheckBox checkBox = this.J0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f10 = Math.max(f10, AndroidUtilities.dp(48.0f));
            }
            CounterView counterView = this.K0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f10 = Math.max(f10, AndroidUtilities.dp(100.0f));
            }
            yt0 yt0Var = this.I;
            ValueAnimator valueAnimator = yt0Var.f44949n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                yt0Var.f44949n = null;
            }
            yt0Var.f44950r = f10;
            yt0Var.f44946c[0].setRightPadding((int) f10);
            yt0Var.d.setRightPadding(f10);
        }
    }

    public void setAnimationValue(float f10) {
        this.f35651h6 = f10;
        this.f35580a0.invalidate();
        F1();
    }

    public final void t0() {
        Runnable runnable = this.E2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.E2 = null;
        }
    }

    public final void t2(long j10) {
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null && gt0Var.f35295x) {
            gt0Var.i(j10);
        } else {
            org.telegram.ui.Components.k61 k61Var = this.B2;
            if (k61Var != null) {
                k61Var.L(j10);
            }
        }
        C3();
    }

    public final void t3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f35687l7) {
            charSequence = this.f35695m7;
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
            f1().setText(org.telegram.ui.Components.t5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.mt editText = f1().f15632f.getEditText();
        qn qnVar = this.f35649h4;
        if (qnVar != null && ((encryptedChat = qnVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void u0() {
        float f10;
        org.telegram.ui.ActionBar.z zVar = this.f35779w0;
        if (zVar != null) {
            if (this.f35590b2) {
                f10 = -AndroidUtilities.dp(4.0f);
            } else {
                f10 = 0.0f;
            }
            zVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.A0;
        if (w0Var != null) {
            I2(w0Var, this.f35590b2, false);
        }
        boolean z10 = this.a2;
        if (z10 && this.E == null) {
            kg.d c10 = this.U.c(this.C, null, false);
            c10.n(mg.c.i(this.f35735r2));
            c10.p(AndroidUtilities.dp(20.0f));
            c10.o(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = og.d.f19570a;
            this.E = new og.c(dp, dp2, c10);
        }
        if (z10) {
            g7.g6.a(this.C);
            this.C.setBackground(this.E);
            return;
        }
        this.C.setStateListAnimator(null);
        this.C.setBackground(this.D);
    }

    public final int u1() {
        return this.f35709o2.left;
    }

    public final void u2(float f10) {
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            k61Var.L(f10 * ((float) k61Var.q()));
            return;
        }
        gt0 gt0Var = this.f35588b0;
        if (gt0Var != null) {
            gt0Var.i(f10 * gt0Var.getVideoDuration());
        }
    }

    public final void u3() {
        int i9 = org.telegram.ui.ActionBar.f6.f23395zf;
        int z12 = z1(i9);
        org.telegram.ui.Components.wo0 wo0Var = this.O0;
        if (wo0Var != null) {
            wo0Var.k();
            this.O0.invalidate();
        }
        CheckBox checkBox = this.J0;
        if (checkBox != null) {
            checkBox.c(z1(i9), -1);
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
        org.telegram.ui.Components.bf0 bf0Var = this.Q0;
        if (bf0Var != null) {
            bf0Var.f27195b.setTextColor(z12);
        }
        org.telegram.ui.Components.bf0 bf0Var2 = this.K7;
        if (bf0Var2 != null) {
            bf0Var2.f27195b.setTextColor(z12);
        }
        xs0 xs0Var = this.H1;
        if (xs0Var != null) {
            xs0Var.d();
        }
        org.telegram.ui.Components.qe0 qe0Var = this.E1;
        if (qe0Var != null) {
            ImageView imageView6 = qe0Var.f31922x0;
            ImageView imageView7 = qe0Var.f31920w0;
            ImageView imageView8 = qe0Var.f31918v0;
            org.telegram.ui.ActionBar.b6 b6Var = qe0Var.E0;
            TextView textView = qe0Var.f31895c0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), mode));
            }
            qe0Var.h();
        }
        yr0 yr0Var = this.Q1;
        if (yr0Var != null) {
            yr0Var.H(this.f35735r2);
        }
        zr0 zr0Var = this.R1;
        if (zr0Var != null) {
            zr0Var.H(this.f35735r2);
        }
        vr0 vr0Var = this.N7;
        if (vr0Var != null) {
            vr0Var.invalidate();
        }
        hu0 hu0Var = this.f35673k1;
        if (hu0Var != null) {
            int childCount = hu0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f35673k1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.z5) {
                    ((org.telegram.ui.Cells.z5) childAt).f26029c.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
                }
            }
        }
        or0 or0Var = this.Q3;
        if (or0Var != null) {
            or0Var.y0(true);
        }
    }

    public final boolean v0() {
        if (this.f35667j4 != 0) {
            F1();
            if (Math.abs(this.f35676k4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f35684l4;
                if (runnable != null) {
                    runnable.run();
                    this.f35684l4 = null;
                }
                this.f35667j4 = 0;
            }
        }
        if (this.f35667j4 == 0) {
            return false;
        }
        return true;
    }

    public final TLRPC.Document v1() {
        int i9;
        if (this.T5 == 0.0f && this.U5 == 0.0f && (i9 = this.L4) >= 0) {
            ArrayList arrayList = this.f35605c7;
            if (i9 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f35730q7;
                }
            }
        }
        return null;
    }

    public final int v2() {
        if (this.f35722p8 > 1048576000) {
            return this.U7 - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i9 = this.U7;
        while (i9 < 5) {
            Locale locale = Locale.US;
            int i10 = globalMainSettings.getInt("compress_video_" + i9, -1);
            if (i10 >= 0) {
                return Math.min(i10, 2);
            }
            i9++;
        }
        return Math.min(2, Math.round(DownloadController.getInstance(this.P).getMaxVideoBitrate() / (100.0f / i9)) - 1);
    }

    public final void v3(boolean z10) {
        tt0 tt0Var;
        int i9;
        if (this.Y1 != 1 && (tt0Var = this.f35580a0) != null) {
            if (!z10) {
                if (tt0Var.getPaddingLeft() <= 0 && this.f35580a0.getPaddingRight() <= 0) {
                    i9 = 1796;
                } else {
                    i9 = 5894;
                }
            } else {
                i9 = 1792;
            }
            this.f35580a0.setSystemUiVisibility(i9);
        }
    }

    public final void w0(boolean z10) {
        View view;
        float x10;
        float y10;
        float f10;
        float f11;
        if (z10) {
            TextureView textureView = this.f35746s3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new sh(this, 4));
                this.f35746s3.invalidate();
            }
        } else if (this.C3 == 2) {
            ImageView imageView = this.f35755t3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f35755t3.setImageDrawable(null);
                Bitmap bitmap = this.f35801y3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f35801y3 = null;
                }
            }
            this.H3 = false;
            if (this.f35809z2) {
                view = this.f35800y2;
            } else {
                view = this.f35790x2;
            }
            ps0 ps0Var = this.f35763u2;
            if (ps0Var != null) {
                int[] iArr = this.f35782w3;
                ps0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f35580a0.getTranslationY());
                ImageView imageView2 = this.f35755t3;
                Rect rect = this.f35709o2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f35763u2.getX());
                }
                st0 st0Var = this.A2;
                if (st0Var != null) {
                    st0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fq0(this, 4));
                if (this.f35809z2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f35763u2.getX();
                }
                if (this.f35809z2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f35763u2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f35755t3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f35755t3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f35755t3;
                Property property3 = View.TRANSLATION_X;
                if (this.f35809z2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f35755t3;
                Property property4 = View.TRANSLATION_Y;
                if (this.f35809z2) {
                    f11 = 0.0f;
                } else {
                    f11 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f11));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x10));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y10));
                arrayList.add(ObjectAnimator.ofInt(this.H0, org.telegram.ui.Components.m6.d, 255));
                st0 st0Var2 = this.A2;
                if (st0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(st0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.A2, property4, y10));
                }
                org.telegram.ui.Components.pf0.o(this.f35763u2.getAspectRatio(), false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new f2.g(18, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.f35800y2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new dr0(this, view, 0));
                animatorSet.start();
                jt0 jt0Var = new jt0();
                jt0Var.f39629c = false;
                jt0Var.d = false;
                jt0Var.f39627a = 250;
                jt0Var.f39628b = decelerateInterpolator;
                k3(true, true, jt0Var);
                this.C3 = 0;
            }
        }
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
                float a2 = ig.e.a(AndroidUtilities.dp(40.0f), 6.0f);
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
        xVar.f7045a = 0L;
        xVar.f7046b = false;
        for (float f10 : colorMatrix.getArray()) {
            xVar.c(f10);
        }
        xVar.a(0L);
        if (xVar.f7046b) {
            j10 = -1;
        } else {
            j10 = xVar.f7045a;
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

    public final void w2(final boolean z10, final int i9, final int i10, final boolean z11, final boolean z12, boolean z13) {
        long j10;
        VideoEditedInfo videoEditedInfo;
        String str;
        float f10;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        MediaController.CropState cropState;
        MediaController.CropState cropState2;
        TLRPC.Chat chat;
        boolean z14;
        int i11;
        qn qnVar;
        org.telegram.ui.Components.c40 c40Var;
        String str2;
        long j11;
        String string;
        TextureView textureView;
        if (!H1() && this.d != null && !this.f35725q2) {
            if (this.Y1 == 1) {
                if (!z13 && (c40Var = this.f35674k2) != null) {
                    TLObject tLObject = c40Var.f27360a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j12 = user.f22527id;
                        str2 = str3;
                        j11 = j12;
                    } else {
                        str2 = "";
                        j11 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f35580a0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.R0 = dp;
                    Context context = this.f35580a0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f36802a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f36803b = imageReceiver2;
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    view.f36805e = new Path();
                    int i12 = UserConfig.selectedAccount;
                    z8Var.m(i12, UserConfig.getInstance(i12).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), z8Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), z8Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f36806f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f35674k2.f27360a;
                    tt0 tt0Var = this.f35580a0;
                    org.telegram.ui.Components.be0 be0Var = this.f35799y1;
                    z8Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, z8Var);
                    view.f36804c = tt0Var;
                    view.d = be0Var;
                    c2Var.R = view;
                    if (this.f35674k2.f27362c == 1) {
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
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new fk0(2));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.b2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.P8;
                            PhotoViewer.this.w2(z10, i9, i10, z11, z12, true);
                        }
                    });
                    c2Var.E = org.telegram.ui.ActionBar.f6.f23220pg;
                    c2Var.P0 = true;
                    c2Var.i(i0.a.k(-15461356, 204));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
                    c2Var.setOnDismissListener(new bs0(this));
                    if (this.f35699n1 && (textureView = this.f35790x2) != null) {
                        try {
                            this.f35810z3 = textureView.getBitmap();
                            ImageView imageView = this.A3;
                            if (imageView != null) {
                                this.f35763u2.removeView(imageView);
                                this.A3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.f35790x2.getContext());
                            this.A3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.f35810z3));
                            this.f35763u2.addView(this.A3);
                            return;
                        } catch (Throwable th) {
                            Bitmap bitmap = this.f35801y3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.f35801y3 = null;
                            }
                            FileLog.e(th);
                            return;
                        }
                    }
                    return;
                }
                l0();
            }
            if (!z11 && (qnVar = this.f35649h4) != null) {
                TLRPC.Chat chat2 = qnVar.f41890e;
                if (qnVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.P).edit().putBoolean("silent_" + this.f35649h4.a(), !z10).commit();
                }
            }
            VideoEditedInfo n12 = n1();
            ArrayList arrayList = this.f35605c7;
            if (!arrayList.isEmpty() && (i11 = this.L4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(this.L4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = n12;
                }
            }
            qn qnVar2 = this.f35649h4;
            if (qnVar2 != null && (chat = qnVar2.f41890e) != null) {
                if (!this.f35699n1 && n12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.ll.p(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.oc(this.f35580a0, this.f35735r2), null);
                    return;
                } else if (!z14 && !ChatObject.canSendPhoto(this.f35649h4.f41890e)) {
                    org.telegram.messenger.ll.p(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.oc(this.f35580a0, this.f35735r2), null);
                    return;
                }
            }
            this.f35725q2 = true;
            if (n12 != null) {
                long j13 = ((float) n12.estimatedSize) * 0.9f;
                if ((j13 > 2097152000 && !UserConfig.getInstance(this.P).isPremium()) || j13 > 4194304000L) {
                    if (this.W1 != null) {
                        org.telegram.ui.Components.ki kiVar = this.W1;
                        new zf.j0(6, UserConfig.selectedAccount, kiVar.getContainer().getContext(), kiVar.f30099b0, null).show();
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
                        int k12 = k1(this.f35727q4);
                        i1();
                        float dp2 = k12 - AndroidUtilities.dp(20.0f);
                        yf.m2 m2Var = this.f35685l5;
                        if (m2Var != null && m2Var.f49990e0 && m2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            n0(canvas);
                            this.f35685l5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            n0(canvas);
                            this.f35802y4.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            n0(canvas);
                            this.f35685l5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            n0(canvas);
                            this.f35802y4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f35765u4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            n0(canvas);
                            canvas.translate((-this.f35802y4.getImageWidth()) / 2.0f, (-this.f35802y4.getImageHeight()) / 2.0f);
                            j10 = 0;
                            canvas.scale(this.f35802y4.getImageWidth() / this.f35765u4.getMeasuredWidth(), this.f35802y4.getImageHeight() / this.f35765u4.getMeasuredHeight());
                            this.f35765u4.f30794e = !B1();
                            this.f35765u4.draw(canvas);
                            this.f35765u4.f30794e = true;
                            canvas.restore();
                        } else {
                            j10 = 0;
                        }
                        if (B1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = dp2 / 2.0f;
                            matrix.preTranslate(f18, f18);
                            if (this.f35686l6 != null) {
                                f15 = AndroidUtilities.lerp(0.0f, this.f35604c6, this.f35651h6);
                                f11 = AndroidUtilities.lerp(this.W5, this.f35584a6, this.f35651h6);
                                f10 = 2.0f;
                                f12 = AndroidUtilities.lerp(this.X5, this.f35594b6, this.f35651h6);
                                c10 = 0;
                                f13 = AndroidUtilities.lerp(this.U5, this.Z5, this.f35651h6);
                                f14 = AndroidUtilities.lerp(this.T5, this.Y5, this.f35651h6);
                            } else {
                                f10 = 2.0f;
                                c10 = 0;
                                f11 = this.W5;
                                f12 = this.X5;
                                f13 = this.U5;
                                f14 = this.T5;
                                if (this.f35669j6 != j10) {
                                    f14 = this.Y5;
                                    f13 = this.Z5;
                                    f11 = this.f35584a6;
                                }
                                f15 = 0.0f;
                            }
                            int k13 = k1(this.f35727q4);
                            int i13 = i1();
                            matrix.preTranslate(f14, f13 + 0.0f);
                            matrix.preScale(f11, f11);
                            matrix.preRotate(f12);
                            int bitmapWidth = this.f35802y4.getBitmapWidth();
                            int bitmapHeight = this.f35802y4.getBitmapHeight();
                            float f19 = k13;
                            float f20 = i13;
                            float min = Math.min(f19 / bitmapWidth, f20 / bitmapHeight);
                            tf.f fVar = this.f35808z1;
                            int i14 = fVar.f47868i;
                            if (i14 != 90 && i14 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f21 = fVar.f47869j;
                            float f22 = fVar.f47870k;
                            float f23 = bitmapHeight;
                            float f24 = bitmapWidth;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i15 = this.Y1;
                            qt0 qt0Var = this.T4;
                            if (i15 == 1 || fVar.f47862a) {
                                TextureView textureView2 = this.f35790x2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = qt0Var.f42197c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    st0 st0Var = this.A2;
                                    if (st0Var != null) {
                                        st0Var.setScaleX(this.f35790x2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = qt0Var.f42197c;
                                if (cropState4 != null) {
                                    f16 = cropState4.cropScale;
                                } else {
                                    f16 = 1.0f;
                                }
                                float z15 = ((f25 / min) / e2.c.z(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(fVar.d * 1.0f, fVar.f47865e * 1.0f);
                                matrix.preScale(z15, z15);
                                matrix.preTranslate(e2.c.C(fVar.f47863b, f23, min, 1.0f), e2.c.C(fVar.f47864c, f24, min, 1.0f));
                                float f27 = fVar.f47867g + i14;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = qt0Var.f42197c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f15 > 0.0f) {
                                matrix.preScale(1.0f - (f15 * f10), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.l0.y(1.0f, f15, 4.0f * f15, 0.25f));
                            }
                            matrix.preTranslate((-this.f35802y4.getImageWidth()) / f10, (-this.f35802y4.getImageHeight()) / f10);
                            matrix.preScale(this.f35802y4.getImageWidth(), this.f35802y4.getImageHeight());
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = photoEntry.mediaEntities;
                            int size = arrayList3.size();
                            String str5 = null;
                            int i16 = 0;
                            while (i16 < size) {
                                VideoEditedInfo.MediaEntity mediaEntity = arrayList3.get(i16);
                                i16++;
                                VideoEditedInfo.MediaEntity copy = mediaEntity.copy();
                                float f28 = copy.f19673x;
                                float f29 = copy.f19674y;
                                float f30 = copy.width + f28;
                                float f31 = copy.height + f29;
                                float f32 = dp2;
                                float[] fArr = new float[8];
                                fArr[c10] = f28;
                                fArr[1] = f29;
                                fArr[2] = f30;
                                fArr[3] = f29;
                                fArr[4] = f30;
                                fArr[5] = f31;
                                fArr[6] = f28;
                                fArr[7] = f31;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[c10] - fArr[2], 2.0d))) / f32;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[c10] - fArr[6], 2.0d))) / f32;
                                copy.height = sqrt;
                                copy.f19673x = (((fArr[c10] + fArr[4]) / f10) / f32) - (copy.width / f10);
                                copy.f19674y = (((fArr[1] + fArr[5]) / f10) / f32) - (sqrt / f10);
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
                                dp2 = f32;
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
                        float f33 = 512;
                        String file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, Bitmap.CompressFormat.WEBP, f33, f33, 100, false, 101, 101), "webp", true).toString();
                        if (videoEditedInfo != null) {
                            videoEditedInfo.originalPath = file;
                        }
                        if (this.f35703n5 == null) {
                            this.f35703n5 = new ArrayList();
                        }
                        if (this.f35703n5.isEmpty()) {
                            String str6 = this.f35685l5.V;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f35703n5.add(this.f35685l5.V);
                            } else if (str != null) {
                                this.f35703n5.add(str);
                            } else {
                                this.f35703n5.add("👍");
                            }
                        }
                        this.f35725q2 = false;
                        ht q10 = ht.q();
                        yf.m2 m2Var2 = this.f35685l5;
                        ArrayList arrayList4 = this.f35703n5;
                        cs0 cs0Var = new cs0(this, file, videoEditedInfo, photoEntry, z10, i9, i10, z12);
                        dt dtVar = q10.U;
                        Activity findActivity = AndroidUtilities.findActivity(m2Var2.getContext());
                        if (findActivity != null) {
                            q10.w(findActivity);
                            q10.v(cs0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            q10.f38926o = arrayList4;
                            q10.t(null, importingSticker, null, null, null, 3, false, null, new ih.b(), 0);
                            AndroidUtilities.cancelRunOnUIThread(dtVar);
                            AndroidUtilities.runOnUIThread(dtVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.L4, n12, z10, i9, i10, z12);
            } else {
                this.d.L(n12);
            }
            if (this.K) {
                if (this.L) {
                    AndroidUtilities.runOnUIThread(new yq0(this, 0), 200L);
                } else {
                    F0(false, false);
                }
            }
        }
    }

    public final void w3(float f10) {
        int k12;
        int i12;
        boolean z10;
        View view;
        ps0 ps0Var = this.f35763u2;
        if (ps0Var != null && ps0Var.getVisibility() == 0 && this.D3) {
            if (this.f35809z2) {
                view = this.f35800y2;
            } else {
                view = this.f35790x2;
            }
            f10 *= Math.min(k1(this.f35727q4) / view.getMeasuredWidth(), i1() / view.getMeasuredHeight());
        }
        float imageWidth = this.f35802y4.getImageWidth();
        float imageHeight = this.f35802y4.getImageHeight();
        MediaController.CropState cropState = this.T4.f42197c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.Y1 == 11) {
            k12 = (int) (imageWidth * f10);
        } else {
            k12 = ((int) ((imageWidth * f10) - k1(this.f35727q4))) / 2;
        }
        if (this.Y1 == 11) {
            i12 = (int) (imageHeight * f10);
        } else {
            i12 = ((int) ((imageHeight * f10) - i1())) / 2;
        }
        float f11 = 0.0f;
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
        xs0 xs0Var = this.H1;
        if (xs0Var != null) {
            if (f10 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = xs0Var.f49954t1;
            boolean z11 = !z10;
            if (xs0Var.U1 != z11) {
                xs0Var.U1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f11 = 1.0f;
                }
                org.telegram.messenger.ll.r(animate.alpha(f11), org.telegram.ui.Components.gr.h, 240L);
            }
        }
    }

    public final void x0() {
        bu0 bu0Var = this.Z4;
        if (bu0Var != null) {
            bu0Var.f36978a.setVisible(true, true);
        }
        zt0 zt0Var = this.d;
        bu0 bu0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (zt0Var != null) {
            MessageObject messageObject = this.P4;
            ImageLocation imageLocation = this.V4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            bu0Var2 = zt0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.L4, false, false);
        }
        this.Z4 = bu0Var2;
        if (bu0Var2 != null && !bu0Var2.f36994s) {
            bu0Var2.f36978a.setVisible(false, true);
        }
    }

    public final int x1() {
        return this.f35709o2.right;
    }

    public final void x2(org.telegram.ui.Components.c40 c40Var) {
        String str;
        int i9;
        TLRPC.User user;
        this.f35674k2 = c40Var;
        if (this.Y1 == 1) {
            if (E3()) {
                this.f35663j0.setVisibility(0);
                this.O0.setVisibility(8);
            } else {
                this.O0.setVisibility(0);
                this.f35663j0.setVisibility(8);
            }
            if (c40Var != null && (user = c40Var.f27361b) != null && c40Var.f27362c == 1 && this.f35674k2.d) {
                if (c40Var.f27363e) {
                    this.f35799y1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.f35799y1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.f35799y1.setSubtitle(null);
            }
        }
        if (c40Var != null) {
            if (c40Var.f27362c == 2) {
                if (c40Var.f27363e) {
                    str = "SuggestVideo";
                    i9 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i9 = R.string.SuggestPhoto;
                }
                O2(LocaleController.getString(str, i9));
            }
            if (c40Var.f27363e) {
                this.O7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.B.setBackground(null);
            this.B.setElevation(2.0f);
        }
    }

    public final void x3() {
        boolean z10;
        org.telegram.ui.Components.k61 k61Var = this.B2;
        if (k61Var != null) {
            if (!d1.f.t() && !this.f35732r) {
                z10 = false;
            } else {
                z10 = true;
            }
            k61Var.P(z10);
        }
        if (!this.f35635f8) {
            this.f35581a1.setEnabled(false);
            this.f35581a1.setClickable(false);
            this.f35581a1.animate().alpha(0.5f).setDuration(180L).start();
            this.N7.setMode(0);
            return;
        }
        this.f35581a1.setEnabled(true);
        this.f35581a1.setClickable(true);
        this.f35581a1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f35732r) {
            if (this.f35582a4 == null) {
                this.I.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.rb0 rb0Var = this.Z0;
            rb0Var.f32129e = true;
            rb0Var.invalidateSelf();
            if (this.f35628f1.getTag() != null) {
                this.f35628f1.setAlpha(0.5f);
                this.f35628f1.setEnabled(false);
            }
            if (this.Y1 == 1) {
                this.N7.setMaxProgressDiff(9600.0f / this.f35615d8);
                this.N7.setMode(1);
                B3();
                return;
            }
            this.N7.setMaxProgressDiff(1.0f);
            this.N7.setMode(0);
            return;
        }
        this.I.a(this.f35806y8, true);
        org.telegram.ui.Components.rb0 rb0Var2 = this.Z0;
        rb0Var2.f32129e = false;
        rb0Var2.invalidateSelf();
        if (this.f35628f1.getTag() != null) {
            this.f35628f1.setAlpha(1.0f);
            this.f35628f1.setEnabled(true);
        }
        this.N7.setMaxProgressDiff(1.0f);
        this.N7.setMode(0);
    }

    public final void y0() {
        MessageObject messageObject;
        boolean z10;
        int i9;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        MessageObject messageObject2;
        ArrayList arrayList = this.U6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f35764u3;
        if (!isEmpty && ((messageObject = this.P4) == null || !messageObject.isSponsored())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.L4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i12);
                    if (!messageObject3.isVideo() && !messageObject3.isYouTubeVideo()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (messageObject3.isYouTubeVideo() && (messageObject2 = this.P4) != null && messageObject2.getId() == messageObject3.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i9 = messageObject3.messageOwner.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.f35790x2) != null) {
                            i9 = textureView.getMeasuredWidth();
                        } else {
                            i9 = 0;
                        }
                        if (z10) {
                            i10 = messageObject3.messageOwner.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.f35790x2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document document = messageObject3.getDocument();
                        if (document != null) {
                            int size = document.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i9 = documentAttribute.f22387w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = AndroidUtilities.displaySize;
                        if (point.y > point.x && i9 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.F) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f35580a0.getMeasuredHeight() + ((int) (i10 / (i9 / this.f35580a0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f35686l6 != null) {
                            float f11 = this.T5;
                            f10 = ((this.Y5 - f11) * this.f35651h6) + f11;
                        } else {
                            f10 = this.T5;
                        }
                        float f12 = 0.0f;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                f12 = ((-AndroidUtilities.displaySize.x) - AndroidUtilities.dp(15.0f)) + (f10 - this.B6);
                            } else {
                                float f13 = this.A6;
                                if (f10 < f13) {
                                    f12 = f10 - f13;
                                }
                            }
                        }
                        imageViewArr[i11].setTranslationX((f12 + AndroidUtilities.displaySize.x) - AndroidUtilities.dp(48.0f));
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

    public final void y2(boolean z10) {
        if (this.f35665j2 != z10) {
            this.f35665j2 = z10;
            this.M1.setLayerType(2, null);
            this.M1.getCurrentView().setLayerType(2, null);
            this.M1.getNextView().setLayerType(2, null);
        }
    }

    public final void y3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.y3(int, boolean):void");
    }

    public final void z0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z0(boolean):void");
    }

    public final int z1(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f35735r2;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public final void z2() {
        org.telegram.ui.Components.y51 y51Var;
        org.telegram.ui.Components.y51 y51Var2;
        if (!this.f35600c2 && this.Y1 == 1) {
            if (!this.f35699n1 || ((y51Var2 = (org.telegram.ui.Components.y51) this.f35790x2) != null && y51Var2.getVideoWidth() > 0 && y51Var2.getVideoHeight() > 0)) {
                this.f35600c2 = true;
                Bitmap bitmap = this.f35802y4.getBitmap();
                int orientation = this.f35802y4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f35607d0.getBitmap();
                    orientation = this.f35607d0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i9 = orientation;
                if (bitmap2 != null || this.f35790x2 != null) {
                    org.telegram.ui.Components.be0 be0Var = this.f35799y1;
                    if (this.f35699n1) {
                        y51Var = (org.telegram.ui.Components.y51) this.f35790x2;
                    } else {
                        y51Var = null;
                    }
                    be0Var.b(bitmap2, i9, false, false, this.f35808z1, y51Var, this.T4.f42197c);
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
    public final void B(float f10, int i9) {
    }
}
