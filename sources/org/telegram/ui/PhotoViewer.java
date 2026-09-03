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
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.k20, org.telegram.ui.Components.j20, df.a, xd.b {
    public static Drawable[] Q8;
    public static final Paint R8 = new Paint(2);
    public static final HashMap S8 = new HashMap();
    public static DecelerateInterpolator T8;
    public static Paint U8;
    public static final Property V8;
    public static volatile PhotoViewer W8;
    public static volatile PhotoViewer X8;
    public org.telegram.ui.ActionBar.w0 A0;
    public final yf.f A1;
    public boolean A2;
    public Bitmap A3;
    public ImageReceiver A4;
    public long A5;
    public float A6;
    public float A7;
    public final org.telegram.ui.Components.z5 A8;
    public ContextThemeWrapper B;
    public org.telegram.ui.ActionBar.w0 B0;
    public yf.f B1;
    public hu0 B2;
    public ImageView B3;
    public org.telegram.ui.Components.ga B4;
    public long B5;
    public float B6;
    public final tq0 B7;
    public org.telegram.ui.Components.z5[] B8;
    public eg.l1 C;
    public org.telegram.ui.ActionBar.g1 C0;
    public yf.f C1;
    public org.telegram.ui.Components.i71 C2;
    public boolean C3;
    public org.telegram.ui.Components.ga C4;
    public mg.q0 C5;
    public float C6;
    public Path C7;
    public RectF C8;
    public ImageView D;
    public org.telegram.ui.Components.n7 D0;
    public MediaController.CropState D1;
    public bf.f D2;
    public int D3;
    public org.telegram.ui.Components.ga D4;
    public String D5;
    public float D6;
    public Paint D7;
    public RectF D8;
    public Drawable E;
    public pb1 E0;
    public MediaController.CropState E1;
    public boolean E2;
    public boolean E3;
    public boolean E4;
    public boolean E5;
    public float E6;
    public Paint E7;
    public Matrix E8;
    public org.telegram.ui.ActionBar.v5 F;
    public y81 F0;
    public org.telegram.ui.Components.of0 F1;
    public Runnable F2;
    public boolean F3;
    public boolean F4;
    public long F5;
    public boolean F6;
    public LinearGradient F7;
    public float[] F8;
    public boolean G;
    public tr G0;
    public AnimatorSet G1;
    public boolean G2;
    public boolean G3;
    public boolean G4;
    public int G5;
    public boolean G6;
    public LinearGradient G7;
    public RenderNode G8;
    public boolean H;
    public final HashMap H0;
    public ph.i3 H1;
    public float H2;
    public boolean H3;
    public boolean H4;
    public int H5;
    public boolean H6;
    public Matrix H7;
    public RenderNode H8;
    public AnimatorSet I;
    public final BackgroundDrawable I0;
    public mt0 I1;
    public float I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public Matrix I7;
    public final g.x I8;
    public nu0 J;
    public final Paint J0;
    public boolean J1;
    public float J2;
    public boolean J3;
    public final Matrix J4;
    public boolean J5;
    public int J6;
    public final int[] J7;
    public final a0.h J8;
    public lu0 K;
    public CheckBox K0;
    public lt0 K1;
    public float K2;
    public float K3;
    public final Paint K4;
    public boolean K5;
    public int K6;
    public su0 K7;
    public boolean K8;
    public boolean L;
    public CounterView L0;
    public boolean L1;
    public float L2;
    public long L3;
    public Bitmap L4;
    public boolean L5;
    public boolean L6;
    public org.telegram.ui.Components.yf0 L7;
    public View L8;
    public boolean M;
    public dg.s1 M0;
    public org.telegram.ui.ActionBar.d2 M1;
    public float M2;
    public boolean M3;
    public int M4;
    public final boolean[] M5;
    public boolean M6;
    public RadialProgressView M7;
    public c2.p M8;
    public hs0 N;
    public FrameLayout N0;
    public du0 N1;
    public boolean N2;
    public boolean N3;
    public int N4;
    public boolean N5;
    public boolean N6;
    public FrameLayout N7;
    public TextureView N8;
    public boolean O;
    public FrameLayout O0;
    public FrameLayout O1;
    public int O2;
    public boolean O3;
    public boolean O4;
    public boolean O5;
    public boolean O6;
    public js0 O7;
    public boolean O8;
    public Paint P;
    public org.telegram.ui.Components.pp0 P0;
    public TextView P1;
    public org.telegram.ui.Components.i71 P2;
    public long P3;
    public boolean P4;
    public boolean P5;
    public boolean P6;
    public TextView P7;
    public boolean P8;
    public int Q;
    public org.telegram.ui.Components.qf0 Q0;
    public nt0 Q1;
    public SurfaceTexture Q2;
    public View Q3;
    public MessageObject Q4;
    public boolean Q5;
    public int Q6;
    public AnimatorSet Q7;
    public int R;
    public org.telegram.ui.Components.yf0 R0;
    public ms0 R1;
    public boolean R2;
    public cs0 R3;
    public VideoAds R4;
    public boolean R5;
    public VelocityTracker R6;
    public long R7;
    public int S;
    public TextView S0;
    public ns0 S1;
    public boolean S2;
    public int S3;
    public ArrayList S4;
    public boolean S5;
    public Scroller S6;
    public long S7;
    public float T;
    public final mu0[] T0;
    public float T1;
    public boolean T2;
    public zs0 T3;
    public Uri T4;
    public float T5;
    public final ArrayList T6;
    public long T7;
    public n7.qa U;
    public nd U0;
    public n0 U1;
    public boolean U2;
    public int U3;
    public final eu0 U4;
    public float U5;
    public final SparseArray[] U6;
    public volatile int U7;
    public ng.a V;
    public ImageView V0;
    public FrameLayout V1;
    public boolean V2;
    public int V3;
    public TLRPC.BotInlineResult V4;
    public float V5;
    public final ArrayList V6;
    public volatile int V7;
    public be.b W;
    public ImageView W0;
    public FrameLayout W1;
    public boolean W2;
    public boolean W3;
    public ImageLocation W4;
    public float W5;
    public final SparseArray[] W6;
    public int W7;
    public be.b X;
    public ImageView X0;
    public org.telegram.ui.Components.li X1;
    public float X2;
    public final org.telegram.ui.Cells.f1 X3;
    public ImageLocation X4;
    public float X5;
    public final ArrayList X6;
    public int X7;
    public org.telegram.ui.Components.ba Y;
    public ImageView Y0;
    public kf.s0 Y1;
    public String Y2;
    public final VideoFramesRewinder Y3;
    public SecureDocument Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public org.telegram.ui.Components.fa Z;
    public ImageView Z0;
    public int Z1;
    public String Z2;
    public final ws0 Z3;
    public final String[] Z4;
    public float Z5;
    public final ArrayList Z6;
    public volatile int Z7;
    public final xd.a f31669a = new xd.a(0, this, org.telegram.ui.Components.mr.h, 380, false);
    public WindowManager.LayoutParams f31670a0;
    public org.telegram.ui.Components.nc0 f31671a1;
    public boolean a2;
    public long f31672a3;
    public final org.telegram.ui.Cells.b2 f31673a4;
    public qu0 f31674a5;
    public float f31675a6;
    public final ArrayList f31676a7;
    public volatile int f31677a8;
    public final boolean f31678b;
    public iu0 f31679b0;
    public org.telegram.ui.ActionBar.l0 f31680b1;
    public boolean f31681b2;
    public float f31682b3;
    public CharSequence f31683b4;
    public String f31684b5;
    public float f31685b6;
    public final ArrayList f31686b7;
    public volatile int f31687b8;
    public int f31688c;
    public ut0 f31689c0;
    public org.telegram.ui.Components.h90 f31690c1;
    public boolean f31691c2;
    public boolean c3;
    public boolean f31692c4;
    public long f31693c5;
    public float f31694c6;
    public final ArrayList f31695c7;
    public volatile int f31696c8;
    public ou0 d;
    public pu0 f31697d0;
    public ks0 f31698d1;
    public boolean f31699d2;
    public long f31700d3;
    public boolean f31701d4;
    public String f31702d5;
    public float f31703d6;
    public final ArrayList f31704d7;
    public volatile int f31705d8;
    public boolean e;
    public ClippingImageView f31706e0;
    public ArrayList f31707e1;
    public boolean f31708e2;
    public boolean f31709e3;
    public final ls0 f31710e4;
    public boolean f31711e5;
    public float e6;
    public ImageLocation f31712e7;
    public float f31713e8;
    public boolean f31714f;
    public dh.d f31715f0;
    public ArrayList f31716f1;
    public boolean f31717f2;
    public xu0 f31718f3;
    public final ls0 f31719f4;
    public TL_iv.PageBlock f31720f5;
    public float f31721f6;
    public tu0 f31722f7;
    public int f31723f8;
    public View f31724g0;
    public org.telegram.ui.Components.u61 f31725g1;
    public org.telegram.ui.Components.y5 f31726g2;
    public String f31727g3;
    public final t70 f31728g4;
    public ImageReceiver.BitmapHolder f31729g5;
    public float f31730g6;
    public ku0 f31731g7;
    public volatile boolean f31732g8;
    public int h;
    public int f31733h0;
    public ph.f3 f31734h1;
    public boolean f31735h2;
    public ValueAnimator f31736h3;
    public final float[][] f31737h4;
    public boolean f31738h5;
    public float f31739h6;
    public final Rect f31740h7;
    public volatile boolean f31741h8;
    public TextView f31742i0;
    public org.telegram.ui.Components.y30 f31743i1;
    public boolean f31744i2;
    public boolean f31745i3;
    public zn f31746i4;
    public boolean f31747i5;
    public float f31748i6;
    public final AnimationNotificationsLocker f31749i7;
    public long f31750i8;
    public TextView f31751j0;
    public org.telegram.ui.Components.a21 f31752j1;
    public boolean f31753j2;
    public final int[] f31754j3;
    public org.telegram.ui.ActionBar.p2 f31755j4;
    public boolean f31756j5;
    public float f31757j6;
    public kf.t0 f31758j7;
    public long f31759j8;
    public TextView f31760k0;
    public UndoView f31761k1;
    public boolean f31762k2;
    public final int[] f31763k3;
    public int f31764k4;
    public boolean f31765k5;
    public long f31766k6;
    public org.telegram.ui.Components.ic f31767k7;
    public float f31768k8;
    public org.telegram.ui.ActionBar.w0 f31769l0;
    public wu0 l1;
    public org.telegram.ui.Components.v40 f31770l2;
    public org.telegram.ui.ActionBar.k5 f31771l3;
    public long f31772l4;
    public String f31773l5;
    public int f31774l6;
    public int f31775l7;
    public float f31776l8;
    public org.telegram.ui.ActionBar.w0 m0;
    public ju0 f31777m1;
    public boolean f31778m2;
    public ImageView f31779m3;
    public Runnable f31780m4;
    public dg.q3 f31781m5;
    public AnimatorSet f31782m6;
    public boolean f31783m7;
    public long f31784m8;
    public boolean f31785n;
    public org.telegram.ui.ActionBar.g1 f31786n0;
    public ImageReceiver f31787n1;
    public MessagesController.DialogPhotos f31788n2;
    public org.telegram.ui.Components.k71 f31789n3;
    public qu0 f31790n4;
    public org.telegram.ui.Components.pf0 f31791n5;
    public AnimatorSet f31792n6;
    public CharSequence f31793n7;
    public long f31794n8;
    public org.telegram.ui.ActionBar.c1 f31795o0;
    public boolean f31796o1;
    public boolean f31797o2;
    public eg.h0 f31798o3;
    public qu0 f31799o4;
    public ArrayList f31800o5;
    public org.telegram.ui.Components.l20 f31801o6;
    public boolean f31802o7;
    public long f31803o8;
    public org.telegram.ui.ActionBar.g1 f31804p0;
    public final tq0 f31805p1;
    public final Rect f31806p2;
    public ys0 f31807p3;
    public boolean f31808p4;
    public nh.a3 f31809p5;
    public boolean f31810p6;
    public ValueAnimator f31811p7;
    public long f31812p8;
    public org.telegram.ui.ActionBar.g1 f31813q0;
    public float f31814q1;
    public boolean f31815q2;
    public AnimatorSet f31816q3;
    public boolean f31817q4;
    public zt0 f31818q5;
    public final DecelerateInterpolator f31819q6;
    public TLRPC.Document f31820q7;
    public long f31821q8;
    public boolean f31822r;
    public org.telegram.ui.ActionBar.m1 f31823r0;
    public long f31824r1;
    public boolean f31825r2;
    public boolean f31826r3;
    public int f31827r4;
    public LinearLayout f31828r5;
    public float f31829r6;
    public TLRPC.Document f31830r7;
    public long f31831r8;
    public boolean f31832s;
    public org.telegram.ui.ActionBar.g1 f31833s0;
    public final GradientDrawable[] f31834s1;
    public org.telegram.ui.ActionBar.f6 f31835s2;
    public int f31836s3;
    public final tq0 f31837s4;
    public zt0 f31838s5;
    public float s6;
    public boolean f31839s7;
    public float f31840s8;
    public vr f31841t0;
    public final boolean[] f31842t1;
    public final fs0 f31843t2;
    public TextureView f31844t3;
    public int f31845t4;
    public zt0 f31846t5;
    public float t6;
    public boolean f31847t7;
    public vt0 f31848t8;
    public LinearLayout f31849u0;
    public final float[] f31850u1;
    public final ls0 f31851u2;
    public ImageView f31852u3;
    public String f31853u4;
    public zt0 f31854u5;
    public float f31855u6;
    public Utilities.Callback2 f31856u7;
    public MessageObject f31857u8;
    public int v;
    public final ArrayList f31858v0;
    public int f31859v1;
    public et0 f31860v2;
    public final ImageView[] f31861v3;
    public org.telegram.ui.Components.id0 f31862v4;
    public zt0 f31863v5;
    public float f31864v6;
    public final float[] f31865v7;
    public boolean f31866v8;
    public AnimatorSet f31867w;
    public org.telegram.ui.ActionBar.m1 f31868w0;
    public org.telegram.ui.Components.y61 f31869w1;
    public View f31870w2;
    public boolean f31871w3;
    public org.telegram.ui.Components.id0 f31872w4;
    public long f31873w5;
    public float f31874w6;
    public final float[] f31875w7;
    public boolean f31876w8;
    public final tq0 f31877x;
    public org.telegram.ui.ActionBar.z f31878x0;
    public org.telegram.ui.Components.no0 f31879x1;
    public AnimatorSet f31880x2;
    public final int[] f31881x3;
    public org.telegram.ui.Components.id0 f31882x4;
    public boolean f31883x5;
    public float f31884x6;
    public ObjectAnimator f31885x7;
    public boolean f31886x8;
    public Activity f31887y;
    public org.telegram.ui.ActionBar.w0 f31888y0;
    public AnimatorSet f31889y1;
    public TextureView f31890y2;
    public boolean f31891y3;
    public ImageReceiver f31892y4;
    public boolean f31893y5;
    public float f31894y6;
    public int f31895y7;
    public boolean f31896y8;
    public org.telegram.ui.ActionBar.w0 f31897z0;
    public org.telegram.ui.Components.ze0 f31898z1;
    public SurfaceView f31899z2;
    public Bitmap f31900z3;
    public ImageReceiver z4;
    public int f31901z5;
    public float f31902z6;
    public float f31903z7;
    public String f31904z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f31905g = 0;
        public final RectF f31906a;
        public final RectF f31907b;
        public final Paint f31908c;
        public gr0 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f31906a = new RectF();
            this.f31907b = new RectF();
            Paint paint = new Paint(1);
            this.f31908c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z4;
            PhotoViewer photoViewer = PhotoViewer.this;
            kf.t0 t0Var = photoViewer.f31758j7;
            if (t0Var != null) {
                t0Var.a(!this.e);
            }
            kf.s0 s0Var = photoViewer.Y1;
            if (s0Var != null) {
                s0Var.a(!this.e);
            }
            org.telegram.ui.Components.li liVar = photoViewer.X1;
            if (liVar != null) {
                boolean z10 = this.e;
                liVar.f26744v0.k(liVar.f26706i2);
                if (liVar.f26723o2 != z10) {
                    liVar.f26723o2 = z10;
                    org.telegram.ui.Components.di diVar = liVar.f26744v0;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
                    if (diVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f22883f1) {
                        if (z10 && !liVar.f26726p2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f22896n && !chatAttachAlertPhotoLayout.L0) {
                            if (z4) {
                                org.telegram.ui.Components.zl zlVar = chatAttachAlertPhotoLayout.M;
                                if (zlVar != null) {
                                    chatAttachAlertPhotoLayout.f22894l0 = Boolean.valueOf(zlVar.isFrontface());
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
            gr0 gr0Var;
            qu0 qu0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.P8) {
                if (photoViewer.f31764k4 != 0 && !AndroidUtilities.isTablet() && (qu0Var = photoViewer.f31674a5) != null && qu0Var.f37496m != null) {
                    ClippingImageView clippingImageView = photoViewer.f31706e0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f31907b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f22957b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f22958c;
                    rectF.bottom = scaleY - clippingImageView.f22956a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                        Rect bounds = getBounds();
                        float f10 = bounds.right;
                        float f11 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f31906a;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 == 3) {
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
                            canvas.drawRect(rectF2, this.f31908c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (gr0Var = this.d) != null) {
                    AndroidUtilities.runOnUIThread(gr0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z4;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f31887y instanceof LaunchActivity) {
                if (photoViewer.e && i10 == 255) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.e = z4;
                if (z4) {
                    a();
                } else {
                    AndroidUtilities.runOnUIThread(new yt0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f31908c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f31910a;
        public final TextPaint f31911b;
        public final Paint f31912c;
        public int d;
        public int e;
        public final RectF f31913f;
        public int h;
        public float f31914n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f31911b = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f31912c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f31913f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int dp = AndroidUtilities.dp(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f31911b;
            this.f31910a = new StaticLayout("" + Math.max(1, i10), textPaint, dp, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.e = this.f31910a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f31912c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.l6 l6Var = org.telegram.ui.Components.n6.f27196b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, l6Var, 0), ObjectAnimator.ofInt(textPaint, l6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.l6 l6Var2 = org.telegram.ui.Components.n6.f27196b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, l6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, l6Var2, 0, 255));
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
            return this.f31914n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f31912c;
            paint.setAlpha(255);
            float dp = AndroidUtilities.dp(14.0f) + measuredHeight;
            RectF rectF = this.f31913f;
            rectF.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            if (this.f31910a != null) {
                this.f31911b.setAlpha((int) ((1.0f - this.f31914n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f31914n * AndroidUtilities.dp(5.0f)) + AndroidUtilities.dpf2(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.f31910a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f31914n * 255.0f));
                int centerX = (int) rectF.centerX();
                int c3 = (int) ai.c(1.0f, this.f31914n, AndroidUtilities.dp(5.0f), (int) rectF.centerY());
                canvas.drawLine(AndroidUtilities.dp(5.0f) + centerX, c3 - AndroidUtilities.dp(5.0f), centerX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + c3, paint);
                canvas.drawLine(centerX - AndroidUtilities.dp(5.0f), c3 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + centerX, AndroidUtilities.dp(5.0f) + c3, paint);
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
        public void setRotationX(float f10) {
            this.f31914n = f10;
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
            V8 = new tr0();
        } else {
            V8 = new org.telegram.ui.Cells.b1(Float.class, "progress", 3);
        }
        W8 = null;
        X8 = null;
    }

    public PhotoViewer() {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 30) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f31678b = z4;
        this.h = -1;
        this.f31785n = true;
        this.f31877x = new tq0(this, 20);
        this.G = true;
        this.L = true;
        this.M = false;
        this.W = new be.b(true);
        this.f31858v0 = new ArrayList();
        this.H0 = new HashMap(3);
        this.I0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.J0 = paint;
        this.T0 = new mu0[3];
        this.f31805p1 = new tq0(this, 21);
        this.f31834s1 = new GradientDrawable[2];
        this.f31842t1 = new boolean[2];
        this.f31850u1 = new float[2];
        this.A1 = new Object();
        this.B1 = new Object();
        this.C1 = new Object();
        this.T1 = -8.0f;
        this.f31806p2 = new Rect();
        this.f31843t2 = new fs0(this);
        this.f31851u2 = new ls0(this, 0);
        this.f31745i3 = true;
        this.f31754j3 = new int[2];
        this.f31763k3 = new int[2];
        this.f31861v3 = new ImageView[3];
        this.f31881x3 = new int[2];
        this.H3 = true;
        this.S3 = -1;
        this.U3 = -10;
        this.X3 = new org.telegram.ui.Cells.f1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.Y3 = videoFramesRewinder;
        this.Z3 = new ws0(this, videoFramesRewinder);
        this.f31673a4 = new org.telegram.ui.Cells.b2(this);
        this.f31710e4 = new ls0(this, 1);
        this.f31719f4 = new ls0(this, 2);
        this.f31728g4 = new t70(this, 1);
        this.f31737h4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f31837s4 = new tq0(this, 22);
        this.f31892y4 = new ImageReceiver();
        this.z4 = new nh.y2(this, 4);
        this.A4 = new ImageReceiver();
        this.B4 = new org.telegram.ui.Components.ga(1, new tq0(this, 23));
        this.C4 = new org.telegram.ui.Components.ga(1, new tq0(this, 23));
        this.D4 = new org.telegram.ui.Components.ga(1, new tq0(this, 23));
        this.I4 = false;
        this.J4 = new Matrix();
        Paint paint2 = new Paint();
        this.K4 = paint2;
        this.L4 = null;
        this.U4 = new Object();
        this.Z4 = new String[3];
        this.M5 = new boolean[]{false, true};
        this.X5 = 1.0f;
        this.Y5 = 0.0f;
        this.f31774l6 = -1;
        this.f31819q6 = new DecelerateInterpolator(1.5f);
        this.t6 = 1.0f;
        this.f31855u6 = 0.0f;
        this.F6 = true;
        this.N6 = true;
        this.T6 = new ArrayList();
        this.U6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.V6 = new ArrayList();
        this.W6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X6 = new ArrayList();
        this.Y6 = new ArrayList();
        this.Z6 = new ArrayList();
        this.f31676a7 = new ArrayList();
        this.f31686b7 = new ArrayList();
        this.f31695c7 = new ArrayList();
        this.f31704d7 = new ArrayList();
        this.f31712e7 = null;
        this.f31722f7 = null;
        this.f31740h7 = new Rect();
        this.f31749i7 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.f31865v7 = new float[]{1.0f};
        this.f31875w7 = new float[]{1.0f};
        this.B7 = new tq0(this, 24);
        this.J7 = new int[2];
        this.R7 = -1L;
        this.S7 = -1L;
        this.T7 = -1L;
        this.V7 = -1;
        this.A8 = new org.telegram.ui.Components.z5(new tq0(this, 23), 180L, org.telegram.ui.Components.mr.f27123g);
        this.I8 = new Object();
        this.J8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.z4.setFileLoadingPriority(3);
    }

    public static void C(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z4;
        Integer num;
        org.telegram.ui.Components.i71 i71Var;
        MessageObject messageObject;
        boolean z10;
        iu0 iu0Var = photoViewer.f31679b0;
        photoViewer.f31670a0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.f31887y.getSystemService("window")).updateViewLayout(photoViewer.f31697d0, photoViewer.f31670a0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        zn znVar = photoViewer.f31746i4;
        if (znVar != null && znVar.V != null && znVar.getFragmentView() != null) {
            lk lkVar = photoViewer.f31746i4.V;
            if (lkVar.f22822v2) {
                lkVar.s1();
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(photoViewer.f31746i4.getParentActivity(), photoViewer.f31688c);
            photoViewer.f31746i4.getFragmentView().requestLayout();
            z4 = z10;
        } else {
            z4 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (i71Var = photoViewer.C2) != null && i71Var.n() > 1500 && (messageObject = photoViewer.Q4) != null && messageObject.isVideo()) {
            num = Integer.valueOf((int) (photoViewer.C2.n() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.Q).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb = new StringBuilder("https://");
                ai.w(sb, MessagesController.getInstance(photoViewer.Q).linkPrefix, "/", publicUsername, "/");
                sb.append(messageObject2.getId());
                str = sb.toString();
            }
        }
        rs0 rs0Var = new rs0(photoViewer, photoViewer.f31887y, photoViewer.f31746i4, arrayList, str, num, iu0Var, z4);
        rs0Var.setFocusable(false);
        rs0Var.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new ie0(28, photoViewer, rs0Var), 250L);
        rs0Var.show();
    }

    public static boolean C1() {
        if (W8 != null) {
            return true;
        }
        return false;
    }

    public static void D(PhotoViewer photoViewer) {
        File file;
        MessageObject messageObject;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!photoViewer.r0()) {
            return;
        }
        MessageObject messageObject2 = photoViewer.Q4;
        File file2 = null;
        if (messageObject2 != null) {
            if (messageObject2.canEditMedia() && !photoViewer.Q4.isDocument()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && photoViewer.Q4.isOutOwner()) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean isVideo = photoViewer.Q4.isVideo();
            if (!TextUtils.isEmpty(photoViewer.Q4.messageOwner.attachPath)) {
                File file3 = new File(photoViewer.Q4.messageOwner.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                file2 = FileLoader.getInstance(photoViewer.Q).getPathToMessage(photoViewer.Q4.messageOwner);
            }
            messageObject = messageObject2;
            file = file2;
            z10 = z12;
            z11 = z13;
            z4 = isVideo;
        } else {
            file = null;
            messageObject = null;
            z4 = false;
            z10 = false;
            z11 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.f31722f7 = new tu0(photoViewer, photoViewer.M4, new ArrayList(photoViewer.V6), photoViewer.d);
            xt0 xt0Var = new xt0();
            xt0Var.f40069c = false;
            photoViewer.k3(false, true, xt0Var);
            AndroidUtilities.runOnUIThread(new er0(photoViewer, file, z4, messageObject, z10, z11), xt0Var.f40067a);
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
        if (W8 != null && !W8.f31891y3 && W8.e && messageObject != null && W8.Q4 != null && W8.Q4.getId() == messageObject.getId() && W8.Q4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean K1(MessageObject messageObject) {
        if (X8 != null && messageObject != null && X8.Q4 != null && X8.Q4.getId() == messageObject.getId() && X8.Q4.getDialogId() == messageObject.getDialogId()) {
            return true;
        }
        return false;
    }

    public static boolean L1(String str) {
        if (W8 != null && W8.e && !W8.f31808p4 && str != null && str.equals(W8.f31684b5)) {
            return true;
        }
        return false;
    }

    public static boolean M1(MessageObject messageObject) {
        boolean z4;
        if (W8 != null && !W8.f31891y3 && W8.e && !W8.f31808p4 && messageObject != null) {
            MessageObject messageObject2 = W8.Q4;
            if (messageObject2 == null && W8.d != null) {
                messageObject2 = W8.d.U();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z4 = true;
                if (z4 && X8 != null) {
                    if (X8.e && !X8.f31808p4 && messageObject != null && X8.Q4 != null && X8.Q4.getId() == messageObject.getId() && X8.Q4.getDialogId() == messageObject.getDialogId()) {
                        return true;
                    }
                    return false;
                }
                return z4;
            }
        }
        z4 = false;
        if (z4) {
        }
        return z4;
    }

    public static boolean N1(TLRPC.BotInlineResult botInlineResult) {
        if (W8 != null && W8.e && !W8.f31808p4 && botInlineResult != null && W8.V4 != null && botInlineResult.f19157id == W8.V4.f19157id) {
            return true;
        }
        return false;
    }

    public static boolean O1(TLRPC.FileLocation fileLocation) {
        if (W8 != null && W8.e && !W8.f31808p4 && fileLocation != null) {
            if (W8.W4 == null || fileLocation.local_id != W8.W4.location.local_id || fileLocation.volume_id != W8.W4.location.volume_id || fileLocation.dc_id != W8.W4.dc_id) {
                if (W8.X4 != null && fileLocation.local_id == W8.X4.location.local_id && fileLocation.volume_id == W8.X4.location.volume_id && fileLocation.dc_id == W8.X4.dc_id) {
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
        ArrayList arrayList = photoViewer.V6;
        if (!arrayList.isEmpty() && (i10 = photoViewer.N4) >= 0 && i10 < arrayList.size() && (messageObject = (MessageObject) arrayList.get(photoViewer.N4)) != null) {
            if (photoViewer.f31765k5 && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.v31.B())) {
                photoViewer.A2(messageObject, j2(messageObject), false, true);
            } else {
                photoViewer.A2(messageObject, messageObject.caption, photoViewer.f31765k5, true);
            }
        }
    }

    public static void V(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.R7 != -1 && (textureView = photoViewer.f31890y2) != null) {
            photoViewer.R7 = -1L;
            photoViewer.f31870w2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.mr.f27125j).setDuration(85L).setListener(new org.telegram.ui.Components.ex0(6, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void W(org.telegram.ui.PhotoViewer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W(org.telegram.ui.PhotoViewer):void");
    }

    public static void X(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.k71 k71Var = photoViewer.f31789n3;
        if (k71Var.f26184f) {
            i10 = k71Var.d;
        } else {
            i10 = k71Var.f26182b;
        }
        int dp = (AndroidUtilities.dp(2.0f) + ((org.telegram.ui.Components.k71.S / 2) + i10)) - (photoViewer.f31807p3.getMeasuredWidth() / 2);
        int dp2 = AndroidUtilities.dp(10.0f);
        int measuredWidth = (photoViewer.f31718f3.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (photoViewer.f31807p3.getMeasuredWidth() / 2);
        if (dp < dp2) {
            ys0 ys0Var = photoViewer.f31807p3;
            ys0Var.setPivotX(Utilities.clamp((ys0Var.getMeasuredWidth() / 2.0f) - (dp2 - dp), photoViewer.f31807p3.getMeasuredWidth(), 0.0f));
            dp = dp2;
        } else if (dp >= measuredWidth) {
            ys0 ys0Var2 = photoViewer.f31807p3;
            ys0Var2.setPivotX(Utilities.clamp((ys0Var2.getMeasuredWidth() / 2.0f) + (dp - measuredWidth), photoViewer.f31807p3.getMeasuredWidth(), 0.0f));
            dp = measuredWidth;
        } else {
            ys0 ys0Var3 = photoViewer.f31807p3;
            ys0Var3.setPivotX(ys0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f31807p3.setTranslationX(dp);
    }

    public static void Y(PhotoViewer photoViewer, boolean z4) {
        org.telegram.ui.Components.gj0 lottieAnimation;
        eu0 eu0Var = photoViewer.U4;
        ArrayList arrayList = eu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) eu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.p9) && (lottieAnimation = ((org.telegram.ui.Components.p9) view).getImageReceiver().getLottieAnimation()) != null) {
                        if (z4) {
                            lottieAnimation.start();
                        } else {
                            lottieAnimation.stop();
                        }
                    }
                }
            }
        }
    }

    public static void Z(PhotoViewer photoViewer, long j10) {
        org.telegram.ui.Components.gj0 lottieAnimation;
        eu0 eu0Var = photoViewer.U4;
        ArrayList arrayList = eu0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) eu0Var.e.get(i10);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof org.telegram.ui.Components.p9) && (lottieAnimation = ((org.telegram.ui.Components.p9) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j11 = photoViewer.f31750i8;
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

    public static String Z0(int i10, int i11) {
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
        char c10 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i13 = 99;
        } else {
            i13 = i11;
        }
        char c11 = (char) ((i13 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        return new String(new char[]{c3, c10, ':', c11, (char) ((i11 % 10) + 48)});
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
        char c3 = (char) ((i13 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c10 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i14 = 99;
        } else {
            i14 = i11;
        }
        char c11 = (char) ((i14 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        char c12 = (char) ((i11 % 10) + 48);
        if (i12 >= 100) {
            i15 = 99;
        } else {
            i15 = i12;
        }
        char c13 = (char) ((i15 / 10) + 48);
        if (i12 >= 100) {
            i12 = 99;
        }
        return new String(new char[]{c3, c10, ':', c11, c12, ':', c13, (char) ((i12 % 10) + 48)});
    }

    public static CharSequence j2(MessageObject messageObject) {
        if (messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), false);
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
        PhotoViewer photoViewer2 = W8;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = W8;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        W8 = photoViewer;
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
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null && ut0Var.f30245x) {
            return ut0Var.getVideoDuration();
        }
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    public final void A2(MessageObject messageObject, CharSequence charSequence, boolean z4, boolean z10) {
        TextView currentView;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.u5.cloneSpans(charSequence, 3);
        W2(this.O4, z10);
        if (!this.O4) {
            boolean z16 = true;
            if (this.Z1 != 1) {
                this.R1.setVisibility(8);
                this.S1.setVisibility(8);
                if (this.f31717f2) {
                    if (this.N1.getParent() != this.M0) {
                        FrameLayout frameLayout = this.W1;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.N1);
                        }
                        this.N1.setMeasureAllChildren(false);
                        this.M0.addView(this.N1, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.Q1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f31679b0.getContext());
                        this.W1 = frameLayout2;
                        this.N1.setContainer(frameLayout2);
                        nt0 nt0Var = new nt0(this, this.f31679b0.getContext(), this.N1, this.W1, 0);
                        this.Q1 = nt0Var;
                        this.N1.setScrollView(nt0Var);
                        this.W1.setClipChildren(false);
                        this.Q1.addView(this.W1, new ViewGroup.LayoutParams(-1, -2));
                        this.f31679b0.addView(this.Q1, k7.b6.e(-1, -1, 80));
                    }
                    if (this.N1.getParent() != this.W1) {
                        this.M0.removeView(this.N1);
                        this.N1.setMeasureAllChildren(true);
                        this.W1.addView(this.N1, -1, -2);
                        this.f31807p3.bringToFront();
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        if (this.O1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.B);
                            this.O1 = frameLayout3;
                            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.Z(620756991, 369098751, 8, 8));
                            k7.d6.b(this.O1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.B);
                            this.P1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.P1.setTextColor(-1);
                            this.P1.setTypeface(AndroidUtilities.bold());
                            this.O1.addView(this.P1, k7.b6.e(-2, -2, 17));
                            this.O1.setOnClickListener(new hr0(this, 7));
                        }
                        AndroidUtilities.removeFromParent(this.O1);
                        this.P1.setText(messageObject.sponsoredButtonText);
                        this.W1.addView(this.O1, k7.b6.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.N1.setPadding(0, 0, 0, AndroidUtilities.dp(64.0f));
                        this.O1.bringToFront();
                    } else {
                        FrameLayout frameLayout4 = this.O1;
                        if (frameLayout4 != null) {
                            AndroidUtilities.removeFromParent(frameLayout4);
                            this.N1.setPadding(0, 0, 0, 0);
                        }
                    }
                }
                boolean isEmpty = TextUtils.isEmpty(cloneSpans);
                boolean isEmpty2 = TextUtils.isEmpty(this.N1.getCurrentView().getText());
                du0 du0Var = this.N1;
                if (z10) {
                    currentView = du0Var.getNextView();
                } else {
                    currentView = du0Var.getCurrentView();
                }
                if (this.f31796o1) {
                    if (currentView.getMaxLines() != 1) {
                        this.N1.getCurrentView().setMaxLines(1);
                        this.N1.getNextView().setMaxLines(1);
                        this.N1.getCurrentView().setSingleLine(true);
                        this.N1.getNextView().setSingleLine(true);
                        TextView currentView2 = this.N1.getCurrentView();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        currentView2.setEllipsize(truncateAt);
                        this.N1.getNextView().setEllipsize(truncateAt);
                    }
                } else {
                    int maxLines = currentView.getMaxLines();
                    if (maxLines == 1) {
                        this.N1.getCurrentView().setSingleLine(false);
                        this.N1.getNextView().setSingleLine(false);
                    }
                    if (this.f31717f2) {
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
                        this.N1.getCurrentView().setMaxLines(i10);
                        this.N1.getNextView().setMaxLines(i10);
                        this.N1.getCurrentView().setEllipsize(null);
                        this.N1.getNextView().setEllipsize(null);
                    }
                }
                currentView.setScrollX(0);
                boolean z17 = this.f31717f2;
                if (!z17 && z10 && isEmpty) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f31753j2 = z11;
                if (!z17) {
                    this.Q1.f32656i0 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (z17) {
                            viewGroup = this.M0;
                        } else {
                            viewGroup = this.Q1;
                        }
                        TransitionManager.endTransitions(viewGroup);
                    }
                    if (this.f31717f2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.M0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new ot0(this, isEmpty2, isEmpty, 1)).addTransition(new ot0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.Q1.f32656i0 = true;
                            duration.addTransition(new org.telegram.ui.Components.lm0(this, 2));
                        }
                        if (isEmpty2 && !isEmpty) {
                            duration.addTarget((View) this.N1);
                        }
                        TransitionManager.beginDelayedTransition(this.Q1, duration);
                    }
                    z12 = true;
                } else {
                    this.N1.getCurrentView().setText((CharSequence) null);
                    nt0 nt0Var2 = this.Q1;
                    if (nt0Var2 != null) {
                        nt0Var2.scrollTo(0, 0);
                    }
                    z12 = false;
                }
                int i11 = 4;
                if (!isEmpty) {
                    org.telegram.ui.ActionBar.j6.J(null, true);
                    if (messageObject == null || !this.f31765k5 || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.v31.B())) {
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new nh.j8(1), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.N1.setTag(cloneSpans);
                    try {
                        du0 du0Var2 = this.N1;
                        if (this.f31778m2 != z4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        du0Var2.a(cloneSpans, z10, z15);
                        nt0 nt0Var3 = this.Q1;
                        if (nt0Var3 != null) {
                            nt0Var3.H(nt0Var3.getWidth(), nt0Var3.getHeight());
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.G && (!this.f31796o1 || this.M0.getVisibility() == 0 || this.f31731g7 != null)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    du0 du0Var3 = this.N1;
                    if (z14) {
                        i11 = 0;
                    }
                    du0Var3.setVisibility(i11);
                } else if (this.f31717f2) {
                    this.N1.a(LocaleController.getString("AddCaption", R.string.AddCaption), z10, false);
                    this.N1.getCurrentView().setTextColor(-1291845633);
                    this.N1.setTag("empty");
                    this.N1.setVisibility(0);
                } else {
                    this.N1.a(null, z10, false);
                    this.N1.getCurrentView().setTextColor(-1);
                    du0 du0Var4 = this.N1;
                    if (z12 && !isEmpty2) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    du0Var4.b(4, z13);
                    this.N1.setTag(null);
                }
                if (this.N1.getCurrentView() instanceof cu0) {
                    ((cu0) this.N1.getCurrentView()).setLoading(z4);
                }
                this.f31778m2 = (isEmpty || !z4) ? false : false;
                return;
            }
        }
        f1().setText(cloneSpans);
        this.N1.setVisibility(8);
    }

    public final void A3() {
        long j10;
        int H;
        MessageObject messageObject;
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            int H2 = ou0Var.H();
            this.L0.a(H2);
            if (H2 == 0) {
                p3(false, true);
            }
            if (this.P0 != null) {
                ou0 ou0Var2 = this.d;
                long j11 = 0;
                if (ou0Var2 != null) {
                    j10 = ou0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (messageObject = this.Q4) != null) {
                    j10 = messageObject.getDialogId();
                }
                org.telegram.ui.Components.pp0 pp0Var = this.P0;
                ou0 ou0Var3 = this.d;
                if (ou0Var3 == null || !ou0Var3.q() || this.d.w()) {
                    j11 = MessagesController.getInstance(this.Q).getSendPaidMessagesStars(j10);
                }
                ou0 ou0Var4 = this.d;
                if (ou0Var4 == null) {
                    H = 1;
                } else {
                    H = ou0Var4.H();
                }
                pp0Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void B0(final int i10, final boolean z4) {
        int i11;
        boolean z10;
        vl0 vl0Var;
        final File file;
        final vl0 vl0Var2;
        boolean z11;
        final boolean z12;
        final boolean z13;
        boolean z14;
        boolean z15;
        File file2;
        File pathToAttach;
        File pathToAttach2;
        boolean z16;
        final boolean z17;
        File file3;
        vl0 vl0Var3;
        boolean z18;
        org.telegram.ui.Components.y5 y5Var;
        int i12 = this.M4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.Z4[i10] != null) {
            if (i10 == 0 && i12 == 0 && (y5Var = this.f31726g2) != null) {
                z10 = y5Var.s();
            } else {
                z10 = false;
            }
            File file4 = null;
            if (this.Q4 != null) {
                if (i11 >= 0 && i11 < this.V6.size()) {
                    ?? r42 = (MessageObject) this.V6.get(i11);
                    z11 = R2(r42);
                    if (this.f31901z5 == 1 && !r42.canPreviewDocument()) {
                        this.T0[i10].d(-1, z4, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.messageOwner.attachPath)) {
                        file3 = new File(r42.messageOwner.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((MessageObject.getMedia(r42.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(r42.messageOwner).webpage != null && MessageObject.getMedia(r42.messageOwner).webpage.document == null) {
                        vl0Var3 = new vl0(4, this, p1(i11, null));
                    } else {
                        vl0Var3 = new vl0(5, this, r42.messageOwner);
                    }
                    if (r42.isVideo()) {
                        if ((SharedConfig.streamMedia && r42.canStreamVideo() && !DialogObject.isEncryptedDialog(r42.getDialogId())) || r42.hasVideoQualities()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        vl0 vl0Var4 = vl0Var3;
                        z12 = z18;
                        vl0Var = r42;
                        file = null;
                        file4 = file3;
                        vl0Var2 = vl0Var4;
                        z13 = true;
                    } else {
                        vl0Var = r42;
                        file = null;
                        z13 = false;
                        file4 = file3;
                        vl0Var2 = vl0Var3;
                        z12 = false;
                    }
                } else {
                    this.T0[i10].d(-1, z4, true);
                    return;
                }
            } else {
                if (this.V4 != null) {
                    if (i11 >= 0 && i11 < this.f31704d7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f31704d7.get(i11);
                        if (!botInlineResult.type.equals("video") && !MessageObject.isVideoDocument(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(FileLoader.getDirectory(3), this.Z4[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(FileLoader.getDirectory(0), this.Z4[i10]);
                            } else {
                                file2 = null;
                            }
                            z16 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                file2 = FileLoader.getInstance(this.Q).getPathToAttach(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z16 = true;
                        }
                        z13 = z16;
                        file = new File(FileLoader.getDirectory(4), this.Z4[i10]);
                        vl0Var2 = null;
                        z11 = false;
                        z12 = false;
                    } else {
                        this.T0[i10].d(-1, z4, true);
                        return;
                    }
                } else {
                    if (this.W4 != null) {
                        if (i11 >= 0 && i11 < this.Y6.size()) {
                            ImageLocation imageLocation = (ImageLocation) this.Y6.get(i11);
                            if (imageLocation != null) {
                                pathToAttach = FileLoader.getInstance(this.Q).getPathToAttach(imageLocation.location, q1(imageLocation), false);
                                pathToAttach2 = FileLoader.getInstance(this.Q).getPathToAttach(imageLocation.location, q1(imageLocation), true);
                            } else {
                                pathToAttach2 = null;
                                pathToAttach = null;
                            }
                        } else {
                            this.T0[i10].d(-1, z4, true);
                            return;
                        }
                    } else if (this.Y4 != null) {
                        if (i11 >= 0 && i11 < this.f31686b7.size()) {
                            SecureDocument secureDocument = (SecureDocument) this.f31686b7.get(i11);
                            pathToAttach = FileLoader.getInstance(this.Q).getPathToAttach(secureDocument, true);
                            pathToAttach2 = FileLoader.getInstance(this.Q).getPathToAttach(secureDocument, false);
                        } else {
                            this.T0[i10].d(-1, z4, true);
                            return;
                        }
                    } else if (this.f31684b5 != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.Z4[i10]);
                        file = new File(FileLoader.getDirectory(4), this.Z4[i10]);
                        vl0Var2 = null;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    } else {
                        ku0 ku0Var = this.f31731g7;
                        if (ku0Var != null) {
                            File b10 = ku0Var.b(i11);
                            if (!this.f31731g7.a(i11) && !this.f31731g7.e(i11)) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (z14 && SharedConfig.streamMedia && (this.f31731g7.d(i11) instanceof TLRPC.Document)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z13 = z14;
                            z12 = z15;
                            vl0Var2 = null;
                            z11 = Q2(i11);
                            file4 = b10;
                            vl0Var = null;
                            file = null;
                        } else {
                            vl0Var = null;
                            file = null;
                            vl0Var2 = null;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                        }
                    }
                    vl0Var2 = null;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    file4 = pathToAttach;
                    file = pathToAttach2;
                    vl0Var = vl0Var2;
                }
                file4 = file2;
                vl0Var = vl0Var2;
            }
            if ((i10 != 0 || !this.f31747i5) && z11) {
                z17 = true;
            } else {
                z17 = false;
            }
            final File file5 = file4;
            final ?? r72 = vl0Var;
            final boolean z19 = z10;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject;
                    zn znVar;
                    TLRPC.Document document;
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    boolean z20 = z19;
                    final File file6 = file5;
                    if (!z20 && file6 != null) {
                        z20 = file6.exists();
                    }
                    File file7 = file;
                    FileLoader.FileResolver fileResolver = vl0Var2;
                    File file8 = null;
                    if (file7 == null && fileResolver != null) {
                        file7 = fileResolver.getFile();
                    } else if (fileResolver != null) {
                        file8 = fileResolver.getFile();
                    }
                    final File file9 = file7;
                    if (!z20 && file9 != null) {
                        z20 = file9.exists();
                    }
                    if (!z20 && file8 != null) {
                        z20 = file8.exists();
                    }
                    final boolean z21 = z20;
                    final PhotoViewer photoViewer = PhotoViewer.this;
                    final int i13 = i10;
                    final boolean z22 = z12;
                    if (!z21 && i13 != 0 && (messageObject = r72) != null && z22 && DownloadController.getInstance(photoViewer.Q).canDownloadMedia(messageObject.messageOwner) != 0 && (((znVar = photoViewer.f31746i4) == null || znVar.h == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
                        FileLoader.getInstance(photoViewer.Q).loadFile(document, messageObject, 0, 10);
                    }
                    final boolean z23 = z13;
                    final boolean z24 = z17;
                    final boolean z25 = z4;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z26;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.Z4;
                            mu0[] mu0VarArr = photoViewer2.T0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z27 = z23;
                            boolean z28 = z25;
                            boolean z29 = true;
                            if ((file10 == null && file9 == null) || (!(z26 = z21) && !z22)) {
                                if (z27) {
                                    if (!FileLoader.getInstance(photoViewer2.Q).isLoadingFile(strArr[i14])) {
                                        mu0VarArr[i14].d(2, false, true);
                                    } else {
                                        mu0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    mu0VarArr[i14].d(0, z28, true);
                                }
                                Float fileProgress = ImageLoader.getInstance().getFileProgress(strArr[i14]);
                                if (fileProgress == null) {
                                    fileProgress = Float.valueOf(0.0f);
                                }
                                mu0VarArr[i14].f(fileProgress.floatValue(), false);
                            } else {
                                if (i14 != 0 || !photoViewer2.M3) {
                                    if (z27 && (!z24 || (i14 == 0 && photoViewer2.U2))) {
                                        mu0VarArr[i14].d(3, z28, true);
                                    } else {
                                        mu0VarArr[i14].d(-1, z28, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f31769l0.t()) {
                                    if (!z26) {
                                        if (!FileLoader.getInstance(photoViewer2.Q).isLoadingFile(strArr[i14])) {
                                            photoViewer2.f31769l0.r(8);
                                        } else {
                                            photoViewer2.f31769l0.K(8);
                                        }
                                    } else {
                                        photoViewer2.f31769l0.r(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f31817q4 || (photoViewer2.f31704d7.isEmpty() && (strArr[0] == null || mu0VarArr[0].h == 0))) {
                                    z29 = false;
                                }
                                photoViewer2.F6 = z29;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f31704d7.isEmpty() && i11 >= 0 && i11 < this.f31704d7.size()) {
            Object obj = this.f31704d7.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.Z1 != 11))) {
                    this.T0[i10].d(3, z4, true);
                    return;
                }
            }
        }
        this.T0[i10].d(-1, z4, true);
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
        org.telegram.ui.Components.e71 e71Var;
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null && i71Var.d != null && i10 != i71Var.f25621a0) {
            i71Var.f25621a0 = i10;
            ArrayList arrayList = i71Var.K;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                e71Var = (org.telegram.ui.Components.e71) i71Var.K.get(i10);
            } else {
                e71Var = null;
            }
            i71Var.R(false, e71Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.i71.J(null, this.Q4);
        } else {
            org.telegram.ui.Components.i71 i71Var2 = this.C2;
            if (i71Var2 != null) {
                org.telegram.ui.Components.i71.J(i71Var2.u(i10), this.Q4);
            }
        }
        z3();
        this.m0.M(null, null);
        try {
            d1.f.b(0);
            if (af.c.O().U()) {
                af.c.O().d0(m1());
            }
            org.telegram.ui.Components.i71 i71Var3 = this.C2;
            if (i71Var3 != null) {
                d1.f.x(i71Var3.y());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void C2(int r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(int, boolean, boolean, boolean):void");
    }

    public final void C3() {
        String Z0;
        String Z02;
        int[] iArr = this.f31754j3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f31763k3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            long max = Math.max(0L, i71Var.n());
            long max2 = Math.max(0L, this.C2.p());
            if (!this.f31886x8 && this.N7.getVisibility() == 0) {
                max2 = (this.O7.getRightProgress() - this.O7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.O7.getLeftProgress() * ((float) max2));
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
            ut0 ut0Var = this.f31689c0;
            if (ut0Var != null && ut0Var.f30245x) {
                long max3 = Math.max(0, ut0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f31689c0.getVideoDuration());
                if (!this.f31886x8 && this.N7.getVisibility() == 0) {
                    max4 = (this.O7.getRightProgress() - this.O7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.O7.getLeftProgress() * ((float) max4));
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
        this.f31771l3.l(Z0 + " / " + Z02, false);
        if (!Objects.equals(this.f31727g3, Z02)) {
            this.f31727g3 = Z02;
            this.f31718f3.requestLayout();
        }
    }

    public final void D0(boolean z4, boolean z10, float f10) {
        if (f10 != this.f31814q1) {
            this.f31814q1 = f10;
            if (this.Q4 != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f31814q1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + this.Q4.getDialogId() + "_" + this.Q4.getId()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + this.Q4.getDialogId() + "_" + this.Q4.getId(), this.f31814q1).commit();
                }
            }
            org.telegram.ui.Components.i71 i71Var = this.C2;
            if (i71Var != null) {
                i71Var.Q(this.f31814q1);
            }
            ut0 ut0Var = this.f31689c0;
            if (ut0Var != null) {
                ut0Var.setPlaybackSpeed(this.f31814q1);
            }
        }
        J2(true, z4);
        if (z10) {
            this.m0.M(null, null);
        }
    }

    public final void D1() {
        boolean[] zArr = this.f31842t1;
        zArr[1] = false;
        zArr[0] = false;
        this.f31679b0.invalidate();
    }

    public final void D2() {
        if (this.f31764k4 == 0) {
            E2(this.z4, this.M4, null);
            F2(this.M4, this.f31862v4);
            E2(this.A4, this.M4 + 1, this.C1);
            F2(this.M4 + 1, this.f31882x4);
            E2(this.f31892y4, this.M4 - 1, this.B1);
            F2(this.M4 - 1, this.f31872w4);
        }
    }

    public final void D3() {
        int extractRealEncoderBitrate;
        if (this.V7 > 0) {
            if (this.U7 >= this.V7) {
                this.U7 = this.V7 - 1;
            }
            if (this.Z1 == 1) {
                float max = Math.max(800.0f / this.Y7, 800.0f / this.Z7);
                this.f31677a8 = Math.round((this.Y7 * max) / 2.0f) * 2;
                this.f31687b8 = Math.round((this.Z7 * max) / 2.0f) * 2;
            } else {
                Size p02 = p0();
                this.f31677a8 = p02.getWidth();
                this.f31687b8 = p02.getHeight();
            }
            if (this.f31696c8 != 0) {
                if (this.Z1 == 1) {
                    this.f31696c8 = 1560000;
                    extractRealEncoderBitrate = this.f31696c8;
                } else if (this.f31677a8 == this.Y7 && this.f31687b8 == this.Z7) {
                    this.f31696c8 = this.f31705d8;
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f31677a8, this.f31687b8, this.f31696c8, false);
                } else {
                    this.f31696c8 = MediaController.makeVideoBitrate(this.Z7, this.Y7, this.f31705d8, this.f31687b8, this.f31677a8);
                    extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.f31677a8, this.f31687b8, this.f31696c8, false);
                }
                this.f31794n8 = ((extractRealEncoderBitrate / 8) * this.f31713e8) / 1000.0f;
            }
        }
    }

    public final void E0(boolean z4) {
        int i10 = this.M4;
        if (i10 >= 0 && i10 < this.f31704d7.size() && H1()) {
            if (z4) {
                k0();
            }
            f1().p();
        }
    }

    public final void E1() {
        org.telegram.ui.Components.ze0 ze0Var = this.f31898z1;
        if (ze0Var != null) {
            ze0Var.b(null, 0, false, false, null, null, null);
            if (this.Z1 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.f31898z1.f31372b.f47310a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.f31898z1.setVisibility(0);
            this.f31898z1.setAlpha(1.0f);
            yf.n nVar = this.f31898z1.f31372b;
            nVar.q();
            CropAreaView cropAreaView2 = nVar.f47310a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f31815q2 = true;
        }
    }

    public final void E2(ImageReceiver imageReceiver, int i10, yf.f fVar) {
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
        boolean z4;
        ImageLocation imageLocation7;
        BitmapDrawable bitmapDrawable3;
        ImageLocation imageLocation8;
        org.telegram.ui.Components.y5 y5Var;
        boolean z10;
        ImageLocation imageLocation9;
        BitmapDrawable bitmapDrawable4;
        ImageLocation imageLocation10;
        BitmapDrawable bitmapDrawable5;
        ImageLocation imageLocation11;
        BitmapDrawable bitmapDrawable6;
        org.telegram.ui.Components.y5 y5Var2;
        boolean z11;
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
        boolean z12;
        ImageReceiver imageReceiver2;
        ImageLocation imageLocation17;
        long j14;
        BitmapDrawable bitmapDrawable9;
        ImageLocation imageLocation18;
        ImageLocation imageLocation19;
        BitmapDrawable bitmapDrawable10;
        String str5;
        Integer num = 1;
        boolean z13 = false;
        imageReceiver.setOrientation(0, false);
        ArrayList arrayList = this.f31686b7;
        TLRPC.PhotoSize photoSize4 = null;
        BitmapDrawable bitmapDrawable11 = null;
        if (!arrayList.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList.size()) {
                arrayList.get(i10);
                AndroidUtilities.getPhotoSize();
                ImageReceiver.BitmapHolder bitmapHolder = this.f31729g5;
                if (bitmapHolder == null || imageReceiver != this.z4) {
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
        ArrayList arrayList2 = this.f31704d7;
        long j16 = 0;
        if (!arrayList2.isEmpty()) {
            if (i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                int photoSize5 = (int) (AndroidUtilities.getPhotoSize() / AndroidUtilities.density);
                ImageReceiver.BitmapHolder bitmapHolder2 = this.f31729g5;
                if (bitmapHolder2 == null || imageReceiver != this.z4) {
                    bitmapHolder2 = null;
                }
                if (bitmapHolder2 == null) {
                    bitmapHolder2 = this.d.j(i10);
                }
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    MediaController.CropState cropState3 = photoEntry.cropState;
                    boolean z14 = photoEntry.isVideo;
                    if (z14 && !photoEntry.isLivePhoto()) {
                        str5 = photoEntry.thumbPath;
                        if (str5 != null) {
                            if (this.f31756j5) {
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
                        document = e2.c.h(photoSize5, "_", photoSize5);
                    }
                    cropState = cropState3;
                    z13 = z14;
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
                                    document = e2.c.h(photoSize5, "_", photoSize5);
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
                                            str6 = e2.c.h(photoSize5, "_", photoSize5);
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
                        String h = e2.c.h(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            bitmapDrawable10 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            bitmapDrawable10 = null;
                        }
                        imageReceiver.setImage(imageLocation18, "d", imageLocation14, null, imageLocation19, h, bitmapDrawable10, j11, null, obj, i12);
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
                        String h9 = e2.c.h(photoSize5, "_", photoSize5);
                        if (bitmapHolder2 != null) {
                            j14 = j19;
                            bitmapDrawable9 = new BitmapDrawable(bitmapHolder2.bitmap);
                        } else {
                            j14 = j19;
                            bitmapDrawable9 = null;
                        }
                        imageReceiver.setImage(forDocument2, "d", imageLocation17, h9, bitmapDrawable9, j14, null, obj, i13);
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
                                } else if (z13 && (activity2 = this.f31887y) != null) {
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
                            } else if (z13 && (activity = this.f31887y) != null) {
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
                        z12 = z13;
                        cropState2 = cropState4;
                        imageReceiver2 = imageReceiver;
                        fVar.e(true, cropState.cropPx, cropState.cropPy, cropState.cropRotate, cropState.transformRotation, cropState.cropScale, 1.0f, 1.0f, cropState.cropPw, cropState.cropPh, 0.0f, 0.0f, cropState4.mirrored);
                    } else {
                        cropState2 = cropState;
                        z12 = z13;
                        imageReceiver2 = imageReceiver;
                        fVar.f47273a = false;
                    }
                } else {
                    cropState2 = cropState;
                    z12 = z13;
                    imageReceiver2 = imageReceiver;
                }
                if (imageReceiver2 == this.f31892y4) {
                    this.D1 = cropState2;
                    this.E4 = z12;
                    return;
                }
                boolean z15 = z12;
                MediaController.CropState cropState5 = cropState2;
                if (imageReceiver2 == this.A4) {
                    this.E1 = cropState5;
                    this.H4 = z15;
                    return;
                }
                return;
            }
            imageReceiver.setImageBitmap((Bitmap) null);
            return;
        }
        ku0 ku0Var = this.f31731g7;
        if (ku0Var != null) {
            int[] iArr = new int[1];
            TLObject d = ku0Var.d(i10);
            TLRPC.PhotoSize f10 = this.f31731g7.f(d, iArr);
            if (f10 != null) {
                if (d instanceof TLRPC.Photo) {
                    TLRPC.Photo photo3 = (TLRPC.Photo) d;
                    ImageReceiver.BitmapHolder bitmapHolder3 = (this.f31729g5 == null || imageReceiver != this.z4) ? null : null;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    if ((DownloadController.getInstance(this.Q).getAutodownloadMask() & 1) == 0 && this.M4 != i10 && !FileLoader.getInstance(this.Q).getPathToAttach(f10, true).exists()) {
                        z11 = false;
                    } else {
                        z11 = true;
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
                    if (z11) {
                        imageLocation13 = ImageLocation.getForPhoto(f10, photo3);
                    } else {
                        imageLocation13 = null;
                    }
                    imageReceiver.setImage(imageLocation13, null, imageLocation12, "b", bitmapDrawable7, iArr[0], null, this.f31731g7.g(), 1);
                    if (z11) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                } else if (!this.f31731g7.a(i10) && !this.f31731g7.e(i10)) {
                    if (imageReceiver == this.z4 && (y5Var2 = this.f31726g2) != null) {
                        imageReceiver.setImageBitmap(y5Var2);
                        this.f31726g2.f(this.f31679b0);
                        return;
                    }
                    return;
                } else if (!(f10.location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    ImageReceiver.BitmapHolder bitmapHolder4 = (this.f31729g5 == null || imageReceiver != this.z4) ? null : null;
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
                    imageReceiver.setImage(null, null, imageLocation11, "b", bitmapDrawable6, 0L, null, this.f31731g7.g(), 1);
                    return;
                } else {
                    imageReceiver.setImageBitmap(this.f31887y.getResources().getDrawable(R.drawable.photoview_placeholder));
                    return;
                }
            } else if (iArr[0] == 0) {
                imageReceiver.setImageBitmap((Bitmap) null);
                return;
            } else {
                imageReceiver.setImageBitmap(this.f31887y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            }
        }
        ArrayList arrayList3 = this.V6;
        if (!arrayList3.isEmpty() && i10 >= 0 && i10 < arrayList3.size()) {
            imageReceiver.setShouldGenerateQualityThumb(true);
            messageObject = (MessageObject) arrayList3.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            if (!TextUtils.isEmpty(MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                imageReceiver.setImageBitmap(this.f31887y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (messageObject.isVideo()) {
                ArrayList<TLRPC.PhotoSize> arrayList4 = messageObject.photoThumbs;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    ImageReceiver.BitmapHolder bitmapHolder5 = (this.f31729g5 == null || imageReceiver != this.z4) ? null : null;
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
                        if (closestPhotoSizeWithSize3.f19184w < 100 && closestPhotoSizeWithSize3.h < 100) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        imageReceiver.setNeedsQualityThumb(z10);
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
                    ImageReceiver.BitmapHolder bitmapHolder6 = this.f31729g5;
                    if (bitmapHolder6 != null) {
                        imageReceiver.setOrientation(bitmapHolder6.orientation, false);
                        return;
                    }
                    return;
                }
                imageReceiver.setImageBitmap(this.f31887y.getResources().getDrawable(R.drawable.photoview_placeholder));
                return;
            } else if (imageReceiver == this.z4 && (y5Var = this.f31726g2) != null) {
                y5Var.f(this.f31679b0);
                imageReceiver.setImageBitmap(this.f31726g2);
                return;
            } else if (this.f31901z5 == 1) {
                if (messageObject.canPreviewDocument()) {
                    TLRPC.Document document8 = messageObject.getDocument();
                    imageReceiver.setNeedsQualityThumb(true);
                    ImageReceiver.BitmapHolder bitmapHolder7 = (this.f31729g5 == null || imageReceiver != this.z4) ? null : null;
                    int i15 = (int) (2048.0f / AndroidUtilities.density);
                    if ((DownloadController.getInstance(this.Q).getAutodownloadMask() & 8) == 0 && this.M4 != i10 && !FileLoader.getInstance(this.Q).getPathToAttach(document8).exists()) {
                        z4 = false;
                    } else {
                        z4 = true;
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
                    if (z4) {
                        imageLocation8 = ImageLocation.getForDocument(document8);
                    } else {
                        imageLocation8 = null;
                    }
                    Locale locale6 = Locale.US;
                    imageReceiver.setImage(imageLocation8, e2.c.h(i15, "_", i15), imageLocation7, "b", bitmapDrawable3, document8.size, null, messageObject, 0);
                    if (z4) {
                        num = null;
                    }
                    imageReceiver.setMark(num);
                    return;
                }
                Activity activity3 = this.f31887y;
                iu0 iu0Var = this.f31679b0;
                ?? drawable5 = new Drawable();
                drawable5.f31352a = 0L;
                drawable5.f31353b = 0.0f;
                drawable5.f31354c = 0.0f;
                drawable5.d = 0L;
                drawable5.e = 0.0f;
                drawable5.f31355f = 1.0f;
                TextPaint textPaint = org.telegram.ui.Components.zc0.G;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                TextPaint textPaint2 = org.telegram.ui.Components.zc0.H;
                textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
                org.telegram.ui.Components.zc0.I.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.zc0.J.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.zc0.K.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.zc0.L.setTextSize(AndroidUtilities.dp(15.0f));
                org.telegram.ui.Components.zc0.F.setStrokeWidth(AndroidUtilities.dp(2.0f));
                drawable5.f31356n = iu0Var;
                drawable5.f31357r = messageObject;
                drawable5.f31358s = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
                TLRPC.Document document9 = messageObject.getDocument();
                if (document9 != null) {
                    String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
                    drawable5.B = documentFileName;
                    if (TextUtils.isEmpty(documentFileName)) {
                        drawable5.B = "name";
                    }
                    int lastIndexOf = drawable5.B.lastIndexOf(46);
                    if (lastIndexOf == -1) {
                        upperCase = "";
                    } else {
                        upperCase = drawable5.B.substring(lastIndexOf + 1).toUpperCase();
                    }
                    drawable5.f31361y = upperCase;
                    if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                        drawable5.f31361y = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
                    }
                    drawable5.f31360x = activity3.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(drawable5.B, messageObject.getDocument().mime_type, true)).mutate();
                    drawable5.C = AndroidUtilities.formatFileSize(document9.size);
                    if (((int) Math.ceil(textPaint2.measureText(drawable5.B))) > AndroidUtilities.dp(320.0f)) {
                        drawable5.B = TextUtils.ellipsize(drawable5.B, textPaint2, AndroidUtilities.dp(320.0f), TextUtils.TruncateAt.END).toString();
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
            ImageReceiver.BitmapHolder bitmapHolder8 = (this.f31729g5 == null || imageReceiver != this.z4) ? null : null;
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
            if ((messageObject == null || !messageObject.isWebpage()) && this.f31873w5 == 0 && !this.f31893y5) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (messageObject != null) {
                if (this.f31901z5 == 5) {
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
                int i17 = (this.f31873w5 > 0L ? 1 : (this.f31873w5 == 0L ? 0 : -1));
                if (i17 != 0) {
                    if (i17 > 0) {
                        user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.f31873w5));
                    } else {
                        user = MessagesController.getInstance(this.Q).getChat(Long.valueOf(-this.f31873w5));
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
                if (this.f31901z5 == 5) {
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
            if (this.f31873w5 != j10) {
                if (s13.imageType != 2) {
                    str9 = null;
                }
                imageLocation2 = s13;
                str = str9;
            } else {
                imageLocation2 = s13;
                str = null;
            }
            boolean z16 = true;
            if ((DownloadController.getInstance(this.Q).getAutodownloadMask() & 1) == 0 && this.M4 != i10 && !FileLoader.getInstance(this.Q).getPathToAttach(p12).exists()) {
                z16 = false;
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
            if (z16) {
                imageLocation4 = imageLocation2;
            } else {
                imageLocation4 = null;
            }
            imageReceiver.setImage(imageLocation4, str, imageLocation3, "b", bitmapDrawable, jArr[0], null, messageObject, i11);
            if (z16) {
                num = null;
            }
            imageReceiver.setMark(num);
        } else if (jArr[0] == 0) {
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            imageReceiver.setImageBitmap(this.f31887y.getResources().getDrawable(R.drawable.photoview_placeholder));
        }
    }

    public final boolean E3() {
        org.telegram.ui.Components.v40 v40Var = this.f31770l2;
        if (v40Var != null && v40Var.d && !v40Var.e) {
            return true;
        }
        return false;
    }

    public final void F0() {
        mt0 mt0Var = this.I1;
        Activity activity = this.f31887y;
        tq0 tq0Var = new tq0(this, 1);
        if (mt0Var.I1) {
            mt0Var.w0(false);
        } else if (mt0Var.f4470d2) {
            mt0Var.l0(true);
        } else if (mt0Var.Q0 && mt0Var.P0 != null) {
            mt0Var.r0(null, true);
        } else if (mt0Var.C0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, mt0Var.N1);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new a1.c(tq0Var, 13));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            S2(alertDialog$Builder);
        } else {
            tq0Var.run();
        }
    }

    public final void F1() {
        dg.q3 q3Var = this.f31781m5;
        if (q3Var == null || !q3Var.S) {
            be.b bVar = this.W;
            if (bVar != null && Build.VERSION.SDK_INT >= 29) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    ((pg.c) it.next()).M = true;
                }
            }
            be.b bVar2 = this.X;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            ms0 ms0Var = this.R1;
            if (ms0Var != null) {
                ms0Var.m();
            }
            ns0 ns0Var = this.S1;
            if (ns0Var != null) {
                ns0Var.m();
            }
            zt0 zt0Var = this.f31818q5;
            if (zt0Var != null) {
                zt0Var.invalidate();
            }
            zt0 zt0Var2 = this.f31838s5;
            if (zt0Var2 != null) {
                zt0Var2.invalidate();
            }
            zt0 zt0Var3 = this.f31846t5;
            if (zt0Var3 != null) {
                zt0Var3.invalidate();
            }
            zt0 zt0Var4 = this.f31854u5;
            if (zt0Var4 != null) {
                zt0Var4.invalidate();
            }
            zt0 zt0Var5 = this.f31863v5;
            if (zt0Var5 != null) {
                zt0Var5.invalidate();
            }
            js0 js0Var = this.O7;
            if (js0Var != null && js0Var.f28934b0) {
                js0Var.invalidate();
            }
            iu0 iu0Var = this.f31679b0;
            if (iu0Var != null) {
                iu0Var.invalidate();
            }
        }
    }

    public final void F2(int i10, org.telegram.ui.Components.id0 id0Var) {
        ArrayList arrayList;
        String str;
        boolean z4;
        boolean z10;
        if (id0Var != null) {
            id0Var.a();
            id0Var.setVisibility(8);
            ArrayList arrayList2 = this.f31704d7;
            if (!arrayList2.isEmpty() && i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    z4 = photoEntry.isVideo;
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
                    z4 = false;
                }
                id0Var.setVisibility(0);
                if (this.Z1 != 11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                id0Var.b(arrayList, z4, false, z10);
                if (str != null) {
                    id0Var.f25688a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(id0Var.f25688a);
                    id0Var.d = bitmapDrawable;
                    id0Var.setBackground(bitmapDrawable);
                    return;
                }
                id0Var.f25688a = null;
                id0Var.d = null;
                id0Var.setBackground(null);
            }
        }
    }

    public final void G0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(boolean, boolean):void");
    }

    public final boolean G1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.B.getSystemService("accessibility");
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
        if (this.f31898z1 != null) {
            return;
        }
        org.telegram.ui.Components.ze0 ze0Var = new org.telegram.ui.Components.ze0(this.B, this.f31835s2);
        this.f31898z1 = ze0Var;
        ze0Var.setVisibility(8);
        this.f31898z1.a();
        this.f31679b0.addView(this.f31898z1, this.f31679b0.indexOfChild(this.N7) - 1, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f31898z1.setDelegate(new es0(this));
    }

    public final boolean H1() {
        org.telegram.ui.Components.bd f12 = f1();
        if (f12 != null) {
            if (f12.I.c() || f12.f41842f.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H2(View view, boolean z4, float f10, boolean z10) {
        float f11;
        HashMap hashMap = this.H0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        hashMap.put(view, Boolean.valueOf(z4));
        view.animate().cancel();
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 * f10;
        int i10 = 0;
        if (z10 && bool != null) {
            if (z4) {
                view.setVisibility(0);
            }
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new sq0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new lh.r5(this, z4, view, 29)).start();
            return;
        }
        if (!z4) {
            i10 = 8;
        }
        view.setVisibility(i10);
        view.setAlpha(f12);
        s3();
    }

    public final boolean I1() {
        int i10;
        if (this.f31712e7 != null && (i10 = this.M4) >= 0) {
            ArrayList arrayList = this.f31695c7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.M4);
                ImageLocation imageLocation = (ImageLocation) this.X6.get(this.M4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f31712e7.location;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (imageLocation != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f31712e7.location;
                    if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void I2(View view, boolean z4, boolean z10) {
        H2(view, z4, 1.0f, z10);
    }

    public final void J0() {
        MediaController.CropState cropState;
        int width;
        int width2;
        if (this.K1 != null) {
            return;
        }
        if (this.Z1 == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.A1.f47278i;
        } else {
            cropState = this.U4.f33855c;
        }
        MediaController.CropState cropState2 = cropState;
        int bitmapWidth = this.z4.getBitmapWidth();
        int bitmapHeight = this.z4.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        dg.q3 q3Var = this.f31781m5;
        if (q3Var != null && q3Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f31781m5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f31781m5.G);
            float width3 = createBitmap.getWidth();
            if ((this.f31781m5.G / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f10 = width3 / width2;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f10, ((-sourceBitmap.getHeight()) / 2.0f) * f10, (sourceBitmap.getWidth() / 2.0f) * f10, (sourceBitmap.getHeight() / 2.0f) * f10);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.z4.getBitmapWidth(), this.z4.getBitmapHeight(), config);
        if (this.z4.getBitmap() != null) {
            Bitmap bitmap = this.z4.getBitmap();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.z4.getOrientation());
            float width4 = createBitmap2.getWidth();
            if ((this.z4.getOrientation() / 90) % 2 != 0) {
                width = bitmap.getHeight();
            } else {
                width = bitmap.getWidth();
            }
            float f11 = width4 / width;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * f11, ((-bitmap.getHeight()) / 2.0f) * f11, (bitmap.getWidth() / 2.0f) * f11, (bitmap.getHeight() / 2.0f) * f11);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        lt0 lt0Var = new lt0(this, this.f31887y, this.Q, createBitmap2, createBitmap, this.z4.getOrientation(), cropState2);
        this.K1 = lt0Var;
        lt0Var.f4739s.setOnClickListener(new uq0(this, 5));
        this.K1.v.setOnClickListener(new uq0(this, 6));
        this.K1.setEraser(this.J1);
        int indexOfChild = this.f31679b0.indexOfChild(this.f31828r5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f31679b0.getChildCount();
        }
        this.f31679b0.addView(this.K1, indexOfChild, k7.b6.c(-1.0f, -1));
        this.L1 = false;
    }

    public final void J2(boolean z4, boolean z10) {
        if (this.f31795o0.getVisibility() != 0) {
            this.f31841t0.f39173f.q("", z4, true);
        } else if (Math.abs(this.f31814q1 - 1.0f) < 0.001f) {
            this.f31841t0.f39173f.q("", z4, true);
        } else {
            org.telegram.ui.Components.j6 j6Var = this.f31841t0.f39173f;
            j6Var.q(df.f.a(this.f31814q1) + "x", z4, true);
        }
        this.f31795o0.d(this.f31814q1, z4);
        y81 y81Var = this.F0;
        float f10 = this.f31814q1;
        org.telegram.ui.ActionBar.g1[] g1VarArr = y81Var.f40185a;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z10 && ((i10 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
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
        if (this.I1 == null) {
            TextureView textureView = this.f31890y2;
            if (textureView != null) {
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) textureView;
                bitmapWidth = w61Var.getVideoWidth();
                bitmapHeight = w61Var.getVideoHeight();
                while (true) {
                    if (bitmapWidth <= 1280 && bitmapHeight <= 1280) {
                        break;
                    }
                    bitmapWidth /= 2;
                    bitmapHeight /= 2;
                }
            } else {
                bitmapWidth = this.z4.getBitmapWidth();
                bitmapHeight = this.z4.getBitmapHeight();
            }
            Bitmap bitmap2 = this.f31862v4.getBitmap();
            if (bitmap2 == null) {
                bitmap2 = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap3 = bitmap2;
            int i10 = this.Z1;
            eu0 eu0Var = this.U4;
            boolean z4 = true;
            if (i10 == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.A1.f47278i;
            } else {
                cropState = eu0Var.f33855c;
            }
            MediaController.CropState cropState2 = cropState;
            ph.i3 i3Var = new ph.i3(this.f31697d0, false, new zq0(this, 2));
            i3Var.f41774f = true;
            i3Var.f41775g = true;
            this.H1 = i3Var;
            if (this.f31827r4 == 3) {
                z4 = false;
            }
            i3Var.b(z4);
            Activity activity = this.f31887y;
            int i11 = this.Q;
            if (this.f31796o1) {
                bitmap = null;
            } else {
                bitmap = this.z4.getBitmap();
            }
            mt0 mt0Var = new mt0(this, activity, activity, i11, bitmap3, bitmap, this.z4.getOrientation(), eu0Var.e, cropState2, new tq0(this, 14), this.f31835s2);
            this.I1 = mt0Var;
            pg.b c3 = this.V.c(mt0Var.Z0, null, false);
            c3.n(rg.b.i(this.f31835s2));
            mt0Var.setBlurredBackgroundDrawableForTools(c3);
            this.f31679b0.addView(this.I1.getView(), k7.b6.c(-1.0f, -1));
            this.I1.setOnDoneButtonClickedListener(new tq0(this, 15));
            this.I1.getCancelView().setOnClickListener(new uq0(this, 8));
            this.I1.t0(AndroidUtilities.dp(126.0f));
            this.I1.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public final void K2(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        kf.t0 t0Var;
        Activity parentActivity;
        boolean z4;
        int i10;
        iu0 iu0Var;
        boolean z10;
        float f10;
        float f11;
        kf.t0 t0Var2 = this.f31758j7;
        if (t0Var2 != null) {
            t0Var2.destroy();
            this.f31758j7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            t0Var = new kf.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.f31758j7 = t0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = p2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.j6.J(parentActivity, false);
        this.f31835s2 = f6Var;
        this.f31755j4 = p2Var;
        int i11 = UserConfig.selectedAccount;
        this.Q = i11;
        this.z4.setCurrentAccount(i11);
        this.f31892y4.setCurrentAccount(this.Q);
        this.A4.setCurrentAccount(this.Q);
        ms0 ms0Var = this.R1;
        if (ms0Var != null) {
            ms0Var.setAccount(this.Q);
        }
        dg.q3 q3Var = this.f31781m5;
        if (q3Var != null) {
            q3Var.setCurrentAccount(this.Q);
        }
        if (this.f31887y != parentActivity && parentActivity != null) {
            this.f31832s = parentActivity instanceof BubbleActivity;
            this.f31887y = parentActivity;
            this.B = new ContextThemeWrapper(this.f31887y, R.style.Theme_TMessages);
            this.f31859v1 = ViewConfiguration.get(this.f31887y).getScaledTouchSlop();
            if (Q8 == null) {
                Q8 = new Drawable[]{f0.f.d(this.f31887y, R.drawable.circle_big), f0.f.d(this.f31887y, R.drawable.cancel_big), f0.f.d(this.f31887y, R.drawable.load_big)};
            }
            this.S6 = new Scroller(parentActivity);
            pu0 pu0Var = new pu0(this, parentActivity);
            this.f31697d0 = pu0Var;
            pu0Var.setBackground(this.I0);
            this.f31697d0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f31706e0 = clippingImageView;
            clippingImageView.K = this.f31737h4;
            clippingImageView.H = false;
            clippingImageView.J = false;
            this.f31697d0.addView(clippingImageView, k7.b6.c(40.0f, 40));
            iu0 iu0Var2 = new iu0(this, parentActivity, parentActivity);
            this.f31679b0 = iu0Var2;
            iu0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.Y3;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f31679b0);
            }
            this.f31679b0.setClipChildren(true);
            this.f31679b0.setClipToPadding(true);
            this.f31697d0.setClipChildren(false);
            this.f31697d0.setClipToPadding(false);
            org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(this.f31679b0);
            this.Y = baVar;
            baVar.f23593a = 1;
            this.U = new n7.qa(this);
            this.X = new be.b();
            this.W = new be.b();
            ng.a aVar = new ng.a(this.U);
            this.V = aVar;
            aVar.f(new ug.i(this.f31679b0), this.f31679b0);
            this.V.e(this.X);
            this.Z = new org.telegram.ui.Components.fa(this.Y, this.f31679b0);
            this.f31697d0.addView(this.f31679b0, k7.b6.e(-1, -1, 51));
            r0.j0.m(this.f31679b0, new br0(this));
            this.f31679b0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31670a0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            this.f31670a0.flags = -2147286784;
            org.telegram.ui.Components.id0 id0Var = new org.telegram.ui.Components.id0(this.f31887y);
            this.f31862v4 = id0Var;
            this.f31679b0.addView(id0Var, k7.b6.c(-2.0f, -2));
            org.telegram.ui.Components.id0 id0Var2 = new org.telegram.ui.Components.id0(this.f31887y);
            this.f31872w4 = id0Var2;
            this.f31679b0.addView(id0Var2, k7.b6.c(-2.0f, -2));
            org.telegram.ui.Components.id0 id0Var3 = new org.telegram.ui.Components.id0(this.f31887y);
            this.f31882x4 = id0Var3;
            this.f31679b0.addView(id0Var3, k7.b6.c(-2.0f, -2));
            eg.l1 l1Var = new eg.l1(this, parentActivity, 5);
            this.C = l1Var;
            l1Var.setOverlayTitleAnimation(true);
            this.C.setTitleColor(-1);
            this.C.setSubtitleColor(-1);
            this.C.setBackgroundColor(2130706432);
            this.C.setOccupyStatusBar(!this.f31832s);
            this.C.B(1090519039, false);
            this.C.C(-1, false);
            this.C.setBackButtonImage(R.drawable.ic_ab_back);
            ImageView backButton = this.C.getBackButton();
            this.D = backButton;
            this.E = backButton.getBackground();
            this.F = null;
            nu0 nu0Var = new nu0(parentActivity);
            this.J = nu0Var;
            this.C.addView(nu0Var, k7.b6.e(-1, -1, 119));
            this.f31679b0.addView(this.C, k7.b6.c(-2.0f, -1));
            lu0 lu0Var = new lu0(parentActivity);
            this.K = lu0Var;
            this.f31679b0.addView(lu0Var, k7.b6.e(-1, -2, 55));
            this.C.setActionBarMenuOnItemClick(new ds0(this, f6Var));
            org.telegram.ui.ActionBar.z n10 = this.C.n();
            this.f31878x0 = n10;
            n10.setOnLayoutListener(new tq0(this, 18));
            org.telegram.ui.ActionBar.w0 a2 = this.f31878x0.a(26, R.drawable.menu_delete_old);
            this.B0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.Delete));
            k7.d6.a(this.B0);
            I2(this.B0, false, false);
            org.telegram.ui.ActionBar.w0 a10 = this.f31878x0.a(11, R.drawable.msg_mask);
            this.A0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Masks));
            org.telegram.ui.ActionBar.w0 a11 = this.f31878x0.a(18, R.drawable.msg_header_draw);
            this.f31897z0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
            org.telegram.ui.ActionBar.w0 a12 = this.f31878x0.a(4, R.drawable.msg_header_share);
            this.f31888y0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Forward));
            org.telegram.ui.ActionBar.z zVar = this.f31878x0;
            vr vrVar = new vr(this.B, R.drawable.video_settings, new nh.b());
            this.f31841t0 = vrVar;
            org.telegram.ui.ActionBar.w0 d = zVar.d(1, vrVar);
            this.m0 = d;
            this.f31841t0.setCallback(d.getIconView());
            this.m0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.m0.getPopupLayout().f19470c = true;
            this.m0.getPopupLayout().setFitItems(true);
            this.m0.setMenuXOffset(AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(this.B, f6Var);
            this.f31795o0 = c1Var;
            c1Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f31795o0.setMinimumWidth(AndroidUtilities.dp(196.0f));
            this.f31795o0.setDrawShadow(false);
            this.f31795o0.setBackgroundColor(-14540254);
            this.f31795o0.setTextColor(-1);
            this.f31795o0.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
            this.f31795o0.setOnValueChange(new ar0(this, 1));
            this.m0.getPopupLayout().a(this.f31795o0, k7.b6.n(-1, 44));
            org.telegram.ui.ActionBar.m1 a13 = this.m0.a(-1);
            this.f31868w0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.m0.getPopupLayout();
            y81 y81Var = new y81(this.B, new br0(this));
            this.F0 = y81Var;
            popupLayout.addView(y81Var);
            LinearLayout linearLayout = new LinearLayout(this.B);
            this.f31849u0 = linearLayout;
            linearLayout.setOrientation(1);
            this.m0.getPopupLayout().addView(this.f31849u0);
            org.telegram.ui.ActionBar.g1 e = this.m0.e(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
            this.f31804p0 = e;
            e.setSelectorColor(268435455);
            org.telegram.ui.Components.n7 n7Var = new org.telegram.ui.Components.n7(this, this.B, 1);
            this.D0 = n7Var;
            try {
                n7Var.setRouteSelector(r5.a.c(this.B).a());
                z4 = true;
            } catch (Exception e6) {
                FileLog.e(e6);
                z4 = false;
            }
            this.D0.setVisibility(4);
            if (z4) {
                org.telegram.ui.ActionBar.g1 e10 = this.m0.e(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
                this.C0 = e10;
                e10.d(false);
                this.C0.setSelectorColor(268435455);
                this.C0.addView(this.D0, 0, k7.b6.c(-1.0f, -1));
            }
            this.m0.B(-115203550);
            this.m0.setOnMenuDismiss(new zq0(this, 8));
            org.telegram.ui.ActionBar.w0 a14 = this.f31878x0.a(0, R.drawable.media_more);
            this.f31769l0 = a14;
            a14.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f31769l0.setOnClickListener(new hr0(this, 3));
            this.f31769l0.setOnMenuDismiss(new zq0(this, 9));
            this.f31769l0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f31769l0.getPopupLayout().f19470c = true;
            this.f31769l0.getPopupLayout().setFitItems(true);
            this.G0 = new tr(this.B, this.f31769l0.getPopupLayout().getSwipeBack(), new br0(this));
            org.telegram.ui.ActionBar.g1 i12 = this.f31769l0.i(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.G0.f38579a);
            i12.c(-328966, -328966);
            this.f31813q0 = i12;
            i12.setOnClickListener(new hr0(this, 4));
            org.telegram.ui.ActionBar.m1 a15 = this.f31769l0.a(-1);
            this.f31823r0 = a15;
            a15.setColor(-15198184);
            this.f31769l0.e(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).c(-328966, -328966);
            org.telegram.ui.ActionBar.g1 e11 = this.f31769l0.e(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize));
            e11.c(-328966, -328966);
            this.f31833s0 = e11;
            org.telegram.ui.ActionBar.g1 e12 = this.f31769l0.e(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
            this.f31786n0 = e12;
            e12.c(-328966, -328966);
            this.f31769l0.e(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).c(-328966, -328966);
            this.f31769l0.e(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).c(-328966, -328966);
            this.f31769l0.e(25, R.drawable.msg_sticker, LocaleController.getString(R.string.CreateSticker)).c(-328966, -328966);
            this.f31769l0.e(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).c(-328966, -328966);
            this.f31769l0.e(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).c(-328966, -328966);
            this.f31769l0.e(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).c(-328966, -328966);
            this.f31769l0.e(13, R.drawable.msg_sticker, LocaleController.getString(R.string.ShowStickers)).c(-328966, -328966);
            this.f31769l0.e(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).c(-328966, -328966);
            this.f31769l0.e(19, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage)).c(-328966, -328966);
            this.f31769l0.e(20, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation)).c(-328966, -328966);
            this.f31769l0.e(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).c(-328966, -328966);
            this.f31769l0.e(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).c(-328966, -328966);
            this.f31769l0.B(-115203550);
            this.f31769l0.r(19);
            this.f31769l0.r(20);
            J2(false, true);
            this.f31769l0.setPopupItemsSelectorColor(268435455);
            this.f31769l0.setSubMenuDelegate(new es0(this));
            dh.d dVar = new dh.d(this.B, 24);
            this.f31715f0 = dVar;
            dVar.setBackgroundColor(2130706432);
            this.f31679b0.addView(this.f31715f0, k7.b6.e(-1, 48, 83));
            View view = new View(this.B);
            this.f31724g0 = view;
            if (this.Z1 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view.setBackgroundColor(i10);
            this.f31697d0.addView(this.f31724g0, k7.b6.a(-1.0f, this.f31733h0 / AndroidUtilities.density, 87));
            this.f31834s1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f31834s1[0].setShape(0);
            this.f31834s1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f31834s1[1].setShape(0);
            org.telegram.ui.Components.y30 y30Var = new org.telegram.ui.Components.y30(this.B, AndroidUtilities.dp(10.0f));
            this.f31743i1 = y30Var;
            this.f31679b0.addView(y30Var, k7.b6.e(-1, 68, 83));
            this.f31743i1.setDelegate(new gs0(this));
            for (int i13 = 0; i13 < 3; i13++) {
                this.f31861v3[i13] = new ImageView(this.f31887y);
                this.f31861v3[i13].setImageResource(R.drawable.msg_maxvideo);
                this.f31861v3[i13].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
                this.f31861v3[i13].setScaleType(ImageView.ScaleType.CENTER);
                this.f31861v3[i13].setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
                this.f31861v3[i13].setVisibility(4);
                this.f31861v3[i13].setAlpha(1.0f);
                this.f31679b0.addView(this.f31861v3[i13], k7.b6.c(48.0f, 48));
                this.f31861v3[i13].setOnClickListener(new hr0(this, 5));
            }
            this.N = new hs0(new nh.b());
            du0 du0Var = new du0(this.f31679b0.getContext());
            this.N1 = du0Var;
            du0Var.setFactory(new kg0(this, 2));
            this.N1.setVisibility(4);
            y2(true);
            for (int i14 = 0; i14 < 3; i14++) {
                this.T0[i14] = new is0(this, this.f31679b0);
                this.T0[i14].d(0, false, true);
            }
            nd ndVar = new nd(this, this.B, f6Var);
            this.U0 = ndVar;
            ndVar.setUseSelfAlpha(true);
            this.U0.setProgressColor(-1);
            this.U0.setSize(AndroidUtilities.dp(54.0f));
            this.U0.setBackgroundResource(R.drawable.circle_big);
            this.U0.setVisibility(4);
            this.U0.setAlpha(0.0f);
            this.f31679b0.addView(this.U0, k7.b6.e(64, 64, 17));
            L0();
            RadialProgressView radialProgressView = new RadialProgressView(this.f31887y, f6Var);
            this.M7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.M7.setBackgroundResource(R.drawable.circle_big);
            this.M7.setVisibility(4);
            this.f31679b0.addView(this.M7, k7.b6.e(54, 54, 17));
            org.telegram.ui.Components.yf0 yf0Var = new org.telegram.ui.Components.yf0(this.f31887y);
            this.L7 = yf0Var;
            yf0Var.setBackgroundColor(2130706432);
            this.L7.a();
            this.L7.setTranslationY(AndroidUtilities.dp(120.0f));
            this.L7.f31011b.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            TextView textView = this.L7.f31011b;
            int i15 = org.telegram.ui.ActionBar.j6.f20279zf;
            textView.setTextColor(z1(i15));
            this.f31679b0.addView(this.L7, k7.b6.e(-1, 48, 83));
            this.L7.f31010a.setOnClickListener(new uq0(this, 2));
            this.L7.f31011b.setOnClickListener(new uq0(this, 3));
            org.telegram.ui.Components.y61 y61Var = new org.telegram.ui.Components.y61(false);
            this.f31869w1 = y61Var;
            y61Var.c(new es0(this));
            iu0 iu0Var3 = this.f31679b0;
            Objects.requireNonNull(iu0Var3);
            this.f31879x1 = new org.telegram.ui.Components.no0(new gl0(iu0Var3, 13), false);
            su0 su0Var = new su0(this.f31887y, this);
            this.K7 = su0Var;
            su0Var.setTranslationY(AndroidUtilities.dp(120.0f));
            this.K7.setVisibility(4);
            this.K7.setBackgroundColor(2130706432);
            this.f31679b0.addView(this.K7, k7.b6.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            dg.s1 s1Var = new dg.s1(this, this.B);
            this.M0 = s1Var;
            this.f31679b0.addView(s1Var, k7.b6.e(-1, -2, 83));
            TextView textView2 = new TextView(this.f31679b0.getContext());
            this.f31742i0 = textView2;
            textView2.setTextSize(1, 15.0f);
            this.f31742i0.setTypeface(AndroidUtilities.bold());
            this.f31742i0.setSingleLine(true);
            this.f31742i0.setMaxLines(1);
            TextView textView3 = this.f31742i0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            this.f31742i0.setTextColor(-1);
            this.f31742i0.setGravity(3);
            this.M0.addView(this.f31742i0, k7.b6.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f31679b0.getContext());
            this.f31751j0 = textView4;
            textView4.setTextSize(1, 14.0f);
            this.f31751j0.setSingleLine(true);
            this.f31751j0.setMaxLines(1);
            this.f31751j0.setEllipsize(truncateAt);
            this.f31751j0.setTextColor(-1);
            this.f31751j0.setGravity(3);
            this.M0.addView(this.f31751j0, k7.b6.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView5 = new TextView(this.f31679b0.getContext());
            this.f31760k0 = textView5;
            int i16 = org.telegram.ui.ActionBar.j6.Oh;
            textView5.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{6.0f}, z1(i16)));
            TextView textView6 = this.f31760k0;
            int i17 = org.telegram.ui.ActionBar.j6.Sh;
            textView6.setTextColor(z1(i17));
            this.f31760k0.setEllipsize(truncateAt);
            this.f31760k0.setGravity(17);
            this.f31760k0.setLines(1);
            this.f31760k0.setSingleLine(true);
            this.f31760k0.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
            this.f31760k0.setTextSize(1, 15.0f);
            this.f31760k0.setTypeface(AndroidUtilities.bold());
            this.f31760k0.setOnClickListener(new uq0(this, 4));
            this.f31760k0.setVisibility(8);
            this.M0.addView(this.f31760k0, k7.b6.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            js0 js0Var = new js0(this.f31887y, this);
            this.O7 = js0Var;
            js0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.f31887y);
            this.N7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.N7.addView(this.O7, k7.b6.e(-1, 54, 83));
            c3(false, false);
            this.f31679b0.addView(this.N7, k7.b6.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.w0 w0Var = this.B0;
            if (w0Var != null) {
                pg.b a16 = this.V.a(w0Var);
                a16.n(rg.b.i(f6Var));
                a16.p(AndroidUtilities.dp(20.0f));
                a16.o(AndroidUtilities.dp(7.0f));
                w0Var.setBackground(tg.c.d(a16, AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
            }
            ks0 ks0Var = new ks0(this.f31887y, LocaleController.getString(R.string.EditorSetCover));
            this.f31698d1 = ks0Var;
            pg.b a17 = this.V.a(ks0Var);
            a17.n(rg.b.i(f6Var));
            ks0Var.setBlurredBackgroundDrawable(a17);
            k7.d6.a(this.f31698d1);
            this.f31698d1.setOnClickListener(new uq0(this, 7));
            this.f31679b0.addView(this.f31698d1, k7.b6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.pf0 pf0Var = new org.telegram.ui.Components.pf0(this.f31887y, f6Var, this.Y);
            this.f31791n5 = pf0Var;
            org.telegram.ui.Components.kt ktVar = pf0Var.f27846c;
            pg.b a18 = this.V.a(ktVar);
            a18.n(rg.b.i(f6Var));
            ktVar.setBlurredBackgroundDrawable(a18);
            k7.d6.a(this.f31791n5.f27846c);
            this.f31791n5.setVisibility(8);
            this.f31791n5.setAlpha(0.0f);
            this.f31791n5.setOnClose(new tq0(this, 12));
            this.f31679b0.addView(this.f31791n5, k7.b6.e(-1, -1, 119));
            this.f31791n5.f27845b.setOnClickListener(new uq0(this, 9));
            this.f31791n5.setOnGalleryImage(new zq0(this, 3));
            org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, this.f31887y, 2);
            this.f31680b1 = l0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            l0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.l0 l0Var2 = this.f31680b1;
            org.telegram.ui.Components.nc0 nc0Var = new org.telegram.ui.Components.nc0(this.f31887y);
            this.f31671a1 = nc0Var;
            l0Var2.setImageDrawable(nc0Var);
            this.f31680b1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.l0 l0Var3 = this.f31680b1;
            pg.b a19 = this.V.a(l0Var3);
            a19.n(rg.b.i(null));
            a19.o(AndroidUtilities.dp(4.0f));
            a19.p(AndroidUtilities.dp(16.0f));
            l0Var3.setBackground(a19);
            k7.d6.a(this.f31680b1);
            this.f31679b0.addView(this.f31680b1, k7.b6.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f31680b1.setOnClickListener(new uq0(this, 10));
            org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(this.f31679b0.getContext());
            this.f31690c1 = h90Var;
            h90Var.setOnClickListener(new uq0(this, 11));
            this.f31679b0.addView(this.f31690c1, k7.b6.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f31679b0.getContext();
            pu0 pu0Var2 = this.f31697d0;
            iu0 iu0Var4 = this.f31679b0;
            ms0 ms0Var2 = new ms0(this, context, pu0Var2, iu0Var4, iu0Var4, f6Var, this.Y, new tq0(this, 19));
            this.R1 = ms0Var2;
            ms0Var2.setBlurredBackgroundDrawableForMentions(this.V);
            this.R1.setOnTimerChange(new zq0(this, 4));
            this.R1.setAccount(this.Q);
            this.R1.setOnHeightUpdate(new zq0(this, 5));
            this.R1.setOnAddPhotoClick(new uq0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.B;
            pu0 pu0Var3 = this.f31697d0;
            iu0 iu0Var5 = this.f31679b0;
            ns0 ns0Var = new ns0(this, contextThemeWrapper, pu0Var3, iu0Var5, iu0Var5, f6Var, this.Y, new tq0(this, 19));
            this.S1 = ns0Var;
            ns0Var.setBlurredBackgroundDrawableForMentions(this.V);
            this.S1.D(true, false);
            this.S1.setOnTimerChange(new zq0(this, 6));
            this.S1.setAccount(this.Q);
            this.S1.setOnHeightUpdate(new zq0(this, 7));
            this.S1.setOnAddPhotoClick(new uq0(this, 13));
            nh.a3 a3Var = new nh.a3(this, this.B);
            this.f31809p5 = a3Var;
            a3Var.setVisibility(8);
            this.f31679b0.addView(this.f31809p5, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            dg.q3 q3Var2 = new dg.q3(this.B, f6Var);
            this.f31781m5 = q3Var2;
            q3Var2.setCurrentAccount(this.Q);
            this.f31679b0.addView(this.f31781m5, iu0Var.indexOfChild(this.C) - 1, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            zt0 zt0Var = new zt0(this);
            this.f31818q5 = zt0Var;
            zt0Var.setRad(18);
            this.f31818q5.l();
            this.f31781m5.setStickerCutOutBtn(this.f31818q5);
            this.f31818q5.setOnClickListener(new uq0(this, 14));
            this.f31818q5.setCutOutState(false);
            this.f31679b0.addView(this.f31818q5, k7.b6.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.f31887y);
            this.f31828r5 = linearLayout2;
            linearLayout2.setOrientation(0);
            zt0 zt0Var2 = new zt0(this);
            this.f31838s5 = zt0Var2;
            zt0Var2.f4439k0 = true;
            zt0Var2.setRad(18);
            this.f31838s5.setEraseState(false);
            this.f31838s5.setOnClickListener(new uq0(this, 15));
            this.f31828r5.addView(this.f31838s5, k7.b6.n(-2, 36));
            this.f31828r5.addView(new Space(this.f31887y), k7.b6.n(12, -1));
            zt0 zt0Var3 = new zt0(this);
            this.f31846t5 = zt0Var3;
            zt0Var3.f4439k0 = true;
            zt0Var3.setRad(18);
            this.f31846t5.setRestoreState(false);
            this.f31846t5.setOnClickListener(new uq0(this, 16));
            this.f31828r5.addView(this.f31846t5, k7.b6.n(-2, 36));
            this.f31679b0.addView(this.f31828r5, k7.b6.e(-2, 36, 17));
            zt0 zt0Var4 = new zt0(this);
            this.f31854u5 = zt0Var4;
            zt0Var4.setUndoState(false);
            this.f31854u5.setRad(18);
            zt0 zt0Var5 = this.f31854u5;
            zt0Var5.f4439k0 = true;
            zt0Var5.setOnClickListener(new uq0(this, 17));
            this.f31679b0.addView(this.f31854u5, k7.b6.e(-2, 36, 17));
            zt0 zt0Var6 = new zt0(this);
            this.f31863v5 = zt0Var6;
            zt0Var6.setOutlineState(false);
            this.f31863v5.setRad(18);
            zt0 zt0Var7 = this.f31863v5;
            zt0Var7.f4439k0 = true;
            zt0Var7.setOnClickListener(new uq0(this, 18));
            this.f31679b0.addView(this.f31863v5, k7.b6.e(-2, 36, 17));
            W2(false, false);
            a3(false, false);
            n0 n0Var = new n0(this, this.f31887y, 18);
            this.U1 = n0Var;
            n0Var.addView(this.R1, k7.b6.e(-1, -1, 83));
            this.f31679b0.addView(this.U1, k7.b6.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.f31887y);
            this.V1 = frameLayout2;
            frameLayout2.addView(this.S1, k7.b6.e(-1, -1, 51));
            this.f31679b0.addView(this.V1, k7.b6.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.f31887y);
            this.N0 = frameLayout3;
            this.f31679b0.addView(frameLayout3, k7.b6.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.f31887y);
            this.O0 = frameLayout4;
            this.f31679b0.addView(frameLayout4, k7.b6.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView7 = new TextView(this.f31887y);
            this.P7 = textView7;
            textView7.setSingleLine(true);
            this.P7.setVisibility(8);
            this.P7.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
            this.P7.setGravity(1);
            this.P7.setTextSize(1, 14.0f);
            this.P7.setTextColor(-7566196);
            this.f31679b0.addView(this.P7, k7.b6.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.Components.pp0 pp0Var = new org.telegram.ui.Components.pp0((NotificationCenter.NotificationCenterDelegate) this, (Context) this.f31887y, R.drawable.send_plane_24, f6Var, 2);
            this.P0 = pp0Var;
            int dp = AndroidUtilities.dp(52.0f);
            int dp2 = AndroidUtilities.dp(38.0f);
            pp0Var.F = dp;
            pp0Var.G = dp2;
            org.telegram.ui.Components.pp0 pp0Var2 = this.P0;
            pp0Var2.f26662e0 = true;
            pg.b a20 = this.V.a(pp0Var2);
            a20.n(rg.b.i(f6Var));
            pp0Var2.setBlurredBackgroundDrawable(a20);
            this.f31679b0.addView(this.P0, k7.b6.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.P0.setContentDescription(LocaleController.getString("Send", R.string.Send));
            k7.d6.a(this.P0);
            this.P0.setOnClickListener(new uq0(this, 19));
            this.P0.setOnLongClickListener(new w(this, 5));
            org.telegram.ui.Components.qf0 qf0Var = new org.telegram.ui.Components.qf0(this.f31887y);
            this.Q0 = qf0Var;
            LinearLayout linearLayout3 = qf0Var.f28155a;
            pg.b a21 = this.V.a(linearLayout3);
            a21.n(rg.b.i(f6Var));
            a21.p(AndroidUtilities.dp(18.0f));
            a21.o(AndroidUtilities.dp(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.Q0.f28156b;
            pg.b a22 = this.V.a(linearLayout4);
            a22.n(rg.b.i(f6Var));
            a22.p(AndroidUtilities.dp(18.0f));
            a22.o(AndroidUtilities.dp(7.0f));
            linearLayout4.setBackground(a22);
            this.Q0.setVisibility(8);
            this.Q0.f28155a.setOnClickListener(new uq0(this, 20));
            this.Q0.f28156b.setOnClickListener(new uq0(this, 21));
            this.f31679b0.addView(this.Q0, k7.b6.e(-1, 56, 80));
            pb1 pb1Var = new pb1(this, this.f31887y, 15);
            this.E0 = pb1Var;
            pb1Var.setOrientation(0);
            this.E0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            pb1 pb1Var2 = this.E0;
            pg.b a23 = this.V.a(pb1Var2);
            a23.n(rg.b.i(f6Var));
            a23.o(AndroidUtilities.dp(2.0f));
            a23.p(AndroidUtilities.dp(22.0f));
            pb1Var2.setBackground(a23);
            this.M0.addView(this.E0, k7.b6.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.f31887y);
            this.W0 = imageView;
            imageView.setScaleType(scaleType);
            this.W0.setImageResource(R.drawable.media_crop);
            this.W0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.E0.addView(this.W0, k7.b6.n(48, 48));
            this.W0.setOnClickListener(new uq0(this, 22));
            this.W0.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
            ImageView imageView2 = new ImageView(this.f31887y);
            this.Y0 = imageView2;
            imageView2.setScaleType(scaleType);
            this.Y0.setImageResource(R.drawable.msg_photo_rotate);
            this.Y0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.E0.addView(this.Y0, k7.b6.n(48, 48));
            this.Y0.setOnClickListener(new uq0(this, 23));
            this.Y0.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
            ImageView imageView3 = new ImageView(this.f31887y);
            this.X0 = imageView3;
            imageView3.setScaleType(scaleType);
            this.X0.setImageResource(R.drawable.media_flip);
            this.X0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.E0.addView(this.X0, k7.b6.n(48, 48));
            this.X0.setOnClickListener(new uq0(this, 24));
            this.X0.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            ImageView imageView4 = new ImageView(this.f31887y);
            this.V0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.V0.setImageResource(R.drawable.media_draw);
            this.V0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.E0.addView(this.V0, k7.b6.n(48, 48));
            this.V0.setOnClickListener(new uq0(this, 25));
            this.V0.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
            org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(this.f31887y);
            this.f31725g1 = u61Var;
            u61Var.setTag(1);
            this.f31725g1.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.U7 = v2();
            org.telegram.ui.Components.u61 u61Var2 = this.f31725g1;
            if (this.f31732g8 && this.V7 > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            u61Var2.a(Math.min(this.f31677a8, this.f31687b8), z10, this.f31822r);
            this.f31725g1.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
            this.E0.addView(this.f31725g1, k7.b6.n(48, 48));
            this.f31725g1.setOnClickListener(new ib0(11, this, parentActivity));
            ImageView imageView5 = new ImageView(this.f31887y);
            this.Z0 = imageView5;
            imageView5.setScaleType(scaleType);
            this.Z0.setImageResource(R.drawable.media_settings);
            this.Z0.setBackground(org.telegram.ui.ActionBar.j6.V(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
            this.E0.addView(this.Z0, k7.b6.n(48, 48));
            this.Z0.setOnClickListener(new uq0(this, 26));
            this.Z0.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
            org.telegram.ui.Components.yf0 yf0Var2 = new org.telegram.ui.Components.yf0(this.B);
            this.R0 = yf0Var2;
            yf0Var2.setBackgroundColor(-872415232);
            this.R0.a();
            this.R0.setVisibility(8);
            this.f31679b0.addView(this.R0, k7.b6.e(-1, 48, 83));
            this.R0.f31010a.setOnClickListener(new uq0(this, 27));
            this.R0.f31011b.setOnClickListener(new uq0(this, 28));
            TextView textView8 = new TextView(this.B);
            this.S0 = textView8;
            textView8.setClickable(false);
            this.S0.setVisibility(8);
            this.S0.setTextSize(1, 14.0f);
            this.S0.setTextColor(-1);
            this.S0.setGravity(17);
            this.S0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(-12763843, 0));
            this.S0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S0.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
            this.S0.setTypeface(AndroidUtilities.bold());
            this.R0.addView(this.S0, k7.b6.e(-2, -1, 49));
            this.S0.setOnClickListener(new uq0(this, 29));
            org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(this.f31679b0.getContext(), this);
            this.f31801o6 = l20Var;
            l20Var.b();
            this.f31810p6 = true;
            this.f31801o6.h = this;
            br0 br0Var = new br0(this);
            this.z4.setParentView(this.f31679b0);
            this.z4.setCrossfadeAlpha((byte) 2);
            this.z4.setInvalidateAll(true);
            this.z4.setDelegate(br0Var);
            this.f31892y4.setParentView(this.f31679b0);
            this.f31892y4.setCrossfadeAlpha((byte) 2);
            this.f31892y4.setInvalidateAll(true);
            this.f31892y4.setDelegate(br0Var);
            this.A4.setParentView(this.f31679b0);
            this.A4.setCrossfadeAlpha((byte) 2);
            this.A4.setInvalidateAll(true);
            this.A4.setDelegate(br0Var);
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f31679b0.getContext(), R.drawable.selectphoto_large);
            this.K0 = checkBox;
            checkBox.setDrawBackground(true);
            this.K0.setHasBorder(true);
            this.K0.setSize(34);
            this.K0.setCheckOffset(AndroidUtilities.dp(1.0f));
            this.K0.c(z1(i15), -1);
            this.K0.setVisibility(8);
            iu0 iu0Var6 = this.f31679b0;
            CheckBox checkBox2 = this.K0;
            if (rotation != 3 && rotation != 1) {
                f10 = 71.0f;
            } else {
                f10 = 61.0f;
            }
            iu0Var6.addView(checkBox2, k7.b6.d(34, 34.0f, 53, 0.0f, f10, 11.0f, 0.0f));
            if (!this.f31832s) {
                ((FrameLayout.LayoutParams) this.K0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.K0.setOnClickListener(new hr0(this, 0));
            CounterView counterView = new CounterView(this.f31887y);
            this.L0 = counterView;
            iu0 iu0Var7 = this.f31679b0;
            if (rotation != 3 && rotation != 1) {
                f11 = 68.0f;
            } else {
                f11 = 58.0f;
            }
            iu0Var7.addView(counterView, k7.b6.d(40, 40.0f, 53, 0.0f, f11, 64.0f, 0.0f));
            if (!this.f31832s) {
                ((FrameLayout.LayoutParams) this.L0.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
            }
            this.L0.setOnClickListener(new hr0(this, 1));
            wu0 wu0Var = new wu0(this.f31887y);
            this.l1 = wu0Var;
            wu0Var.setVisibility(8);
            this.l1.setAlpha(0.0f);
            this.l1.setLayoutManager(new k());
            wu0 wu0Var2 = this.l1;
            ju0 ju0Var = new ju0(this.f31887y, this);
            this.f31777m1 = ju0Var;
            wu0Var2.setAdapter(ju0Var);
            this.f31679b0.addView(this.l1, k7.b6.e(-1, 103, 51));
            this.l1.setOnItemClickListener(new j(this, 22));
            UndoView undoView = new UndoView(this.B, null, false, f6Var);
            this.f31761k1 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
            this.f31761k1.i();
            this.f31679b0.addView(this.f31761k1, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                View view2 = new View(this.B);
                this.Q3 = view2;
                view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                this.Q3.setFocusable(true);
                this.Q3.setOnClickListener(new hr0(this, 2));
                this.f31679b0.addView(this.Q3, k7.b6.e(64, 64, 17));
            }
            this.f31760k0.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{6.0f}, z1(i16)));
            this.f31760k0.setTextColor(z1(i17));
            hs0 hs0Var = this.N;
            hs0Var.f22619k0 = true;
            hs0Var.f22615i0 = false;
            org.telegram.ui.Cells.x9 o10 = hs0Var.o(this.f31697d0.getContext());
            if (o10 != null) {
                AndroidUtilities.removeFromParent(o10);
                this.f31679b0.addView(o10);
            }
            this.N.T(this.f31679b0);
            this.N.S();
            this.f31669a.a(false, false);
            return;
        }
        u3();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f12 = 1.0f - f10;
            this.Q0.setTranslationY(AndroidUtilities.dp(36.0f) * f12);
            this.Q0.setAlpha(f10);
            org.telegram.ui.Components.qf0 qf0Var = this.Q0;
            int i13 = 8;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qf0Var.setVisibility(i11);
            if (this.f31691c2) {
                dg.s1 s1Var = this.M0;
                int i14 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                s1Var.setVisibility(i12);
                this.M0.setAlpha(f12);
                this.M0.setTranslationY(AndroidUtilities.dp(36.0f) * f10);
                org.telegram.ui.Components.pp0 pp0Var = this.P0;
                if (i14 < 0) {
                    i13 = 0;
                }
                pp0Var.setVisibility(i13);
                this.P0.setAlpha(f12);
                this.P0.setTranslationY(AndroidUtilities.dp(36.0f) * f10);
            }
        }
    }

    public final void L0() {
        xu0 xu0Var = new xu0(this.f31679b0.getContext(), this);
        this.f31718f3 = xu0Var;
        this.f31679b0.addView(xu0Var, k7.b6.e(-1, 48, 83));
        es0 es0Var = new es0(this);
        xs0 xs0Var = new xs0(this, es0Var);
        eg.h0 h0Var = new eg.h0(this, this.f31679b0.getContext(), 29);
        this.f31798o3 = h0Var;
        h0Var.setAccessibilityDelegate(xs0Var);
        this.f31798o3.setImportantForAccessibility(1);
        this.f31718f3.addView(this.f31798o3, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(this.f31798o3);
        this.f31789n3 = k71Var;
        k71Var.f26202z = AndroidUtilities.dp(2.0f);
        org.telegram.ui.Components.k71 k71Var2 = this.f31789n3;
        k71Var2.f26188k = 872415231;
        k71Var2.f26189l = 872415231;
        k71Var2.f26190m = -1;
        k71Var2.f26191n = -1;
        k71Var2.A = 1509949439;
        k71Var2.f26187j = es0Var;
        ys0 ys0Var = new ys0(this, this.f31679b0.getContext(), new br0(this));
        this.f31807p3 = ys0Var;
        ys0Var.setAlpha(0.0f);
        this.f31679b0.addView(this.f31807p3, k7.b6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(this.f31679b0.getContext());
        this.f31771l3 = k5Var;
        k5Var.setTextColor(-1);
        this.f31771l3.setGravity(53);
        this.f31771l3.setTextSize(14);
        this.f31771l3.setImportantForAccessibility(2);
        this.f31718f3.addView(this.f31771l3, k7.b6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f31679b0.getContext());
        this.f31779m3 = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.f31779m3.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.f31779m3.setScaleType(ImageView.ScaleType.CENTER);
        this.f31779m3.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        this.f31779m3.setVisibility(4);
        this.f31718f3.addView(this.f31779m3, k7.b6.e(48, 48, 53));
        this.f31779m3.setOnClickListener(new hr0(this, 6));
    }

    public final void L2(org.telegram.ui.Components.li liVar) {
        this.X1 = liVar;
        kf.s0 s0Var = this.Y1;
        if (s0Var != null) {
            s0Var.destroy();
            this.Y1 = null;
        }
        if (liVar != null) {
            this.Y1 = liVar.obtainWindowVisibilityController();
        }
    }

    public final void M0(MediaController.SavedFilterState savedFilterState) {
        org.telegram.ui.Components.ha haVar;
        if (this.f31890y2 == null) {
            et0 et0Var = new et0(this.f31887y, this);
            this.f31860v2 = et0Var;
            et0Var.setWillNotDraw(false);
            this.f31860v2.setVisibility(4);
            this.f31679b0.addView(this.f31860v2, 0, k7.b6.e(-1, -1, 17));
            this.A2 = false;
            if (this.f31704d7.isEmpty()) {
                if (this.f31678b && this.Q2 == null) {
                    this.f31899z2 = new SurfaceView(this.f31887y);
                    this.A2 = true;
                } else {
                    this.f31890y2 = new TextureView(this.f31887y);
                }
            } else {
                org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(this.f31887y, this.C2);
                this.Y.e();
                org.telegram.ui.Components.ba baVar = this.Y;
                w61Var.f30161s = baVar;
                org.telegram.ui.Components.vz vzVar = w61Var.f30156b;
                if (vzVar != null && (haVar = vzVar.F) != null) {
                    org.telegram.ui.Components.ba baVar2 = haVar.f25368t;
                    if (baVar2 != null && baVar2.f23602m != null) {
                        baVar2.f23602m = null;
                    }
                    haVar.f25368t = baVar;
                    if (baVar != null && baVar.f23602m != haVar) {
                        baVar.f23602m = haVar;
                        baVar.d();
                    }
                }
                if (savedFilterState != null) {
                    w61Var.setDelegate(new kl0(savedFilterState, 2));
                }
                this.f31890y2 = w61Var;
            }
            SurfaceTexture surfaceTexture = this.Q2;
            if (surfaceTexture != null) {
                this.f31890y2.setSurfaceTexture(surfaceTexture);
                this.E3 = true;
                this.F3 = true;
                this.Q2 = null;
            }
            TextureView textureView = this.f31890y2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.f31890y2.setPivotY(0.0f);
                this.f31890y2.setOpaque(false);
                this.f31860v2.addView(this.f31890y2, k7.b6.e(-1, -1, 17));
            } else {
                this.f31860v2.addView(this.f31899z2, k7.b6.e(-1, -1, 17));
            }
            hu0 hu0Var = new hu0(this.f31887y, this);
            this.B2 = hu0Var;
            hu0Var.setPivotX(0.0f);
            this.B2.setPivotY(0.0f);
            this.B2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f31860v2.addView(this.B2, k7.b6.e(-1, -1, 17));
            View view = new View(this.f31887y);
            this.L8 = view;
            this.f31860v2.addView(view, k7.b6.c(-1.0f, -1));
            if (this.Z1 == 1) {
                View view2 = new View(this.f31887y);
                this.f31870w2 = view2;
                view2.setBackgroundColor(-1);
                this.f31870w2.setAlpha(0.0f);
                this.f31860v2.addView(this.f31870w2, k7.b6.e(-1, -1, 17));
            }
            bf.f fVar = this.D2;
            if (fVar != null) {
                et0 et0Var2 = this.f31860v2;
                fVar.f1822i.o(et0Var2);
                fVar.f1823j = et0Var2;
                if (et0Var2 != null) {
                    fVar.e(et0Var2);
                }
                this.D2.f1824k = this.L8;
            }
        }
    }

    public final void M2() {
        zn znVar;
        TLRPC.Chat chat;
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            if (ou0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.M4)) {
                if (this.f31785n && (znVar = this.f31746i4) != null && (chat = znVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.z4.N(this.f31887y, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).o();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.M4, n1());
            boolean x10 = this.d.x(this.M4);
            this.K0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f31777m1.o(k10);
                    this.l1.x0(k10);
                } else {
                    this.f31777m1.u(k10);
                    if (k10 == 0) {
                        this.f31777m1.m(0);
                    }
                }
            }
            A3();
        }
    }

    public final boolean N0() {
        boolean z4 = false;
        if (this.f31782m6 != null || this.f31898z1 == null) {
            return false;
        }
        this.f31703d6 = 1.0f;
        this.f31766k6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31782m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f));
        this.f31782m6.setDuration(250L);
        this.f31782m6.setInterpolator(org.telegram.ui.Components.mr.f27122f);
        this.f31782m6.addListener(new us0(this, 0));
        this.f31782m6.start();
        yf.l lVar = this.f31898z1.f31372b.I;
        if (lVar != null) {
            z4 = lVar.f47307j;
        }
        return !z4;
    }

    public final void N2() {
        float bitmapWidth = this.z4.getBitmapWidth();
        float bitmapHeight = this.z4.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float k12 = k1(this.f31827r4);
            float i12 = i1();
            float min = Math.min(i12 / bitmapHeight, k12 / bitmapWidth);
            float max = Math.max(k12 / ((int) (bitmapWidth * min)), i12 / ((int) (bitmapHeight * min)));
            this.X5 = max;
            w3(max);
        }
    }

    public final boolean O0(float f10, boolean z4, Runnable runnable) {
        org.telegram.ui.Components.ze0 ze0Var;
        float f11;
        if (this.f31782m6 == null && (ze0Var = this.f31898z1) != null) {
            ze0Var.f31372b.i();
            this.Y5 = 0.0f;
            this.f31694c6 = 0.0f + f10;
            if (z4) {
                this.f31703d6 = 1.0f;
            }
            this.f31766k6 = System.currentTimeMillis();
            this.f31782m6 = new AnimatorSet();
            if (this.Z1 == 1) {
                this.f31685b6 = 1.0f;
                this.X5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.z4;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.z4.getBitmapHeight();
                    if (Math.abs((((int) this.f31898z1.f31372b.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.U4.f33855c;
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
                    this.f31685b6 = f11 / min;
                }
            }
            if (this.Z1 == 11) {
                this.X5 = r2(false) * this.X5;
                this.f31685b6 = r2(false) * this.f31685b6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.Components.mv(this, f10, this.f31898z1.f31373c.getRotation(), 2));
            this.f31782m6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f), ofFloat);
            this.f31782m6.setDuration(250L);
            this.f31782m6.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.f31782m6.addListener(new vs0(this, f10, runnable));
            this.f31782m6.start();
            if (Math.abs(this.f31898z1.f31372b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void O2(CharSequence charSequence) {
        nu0 nu0Var = this.J;
        this.f31683b4 = charSequence;
        nu0Var.c(charSequence);
        j3(true, false);
    }

    public final void P0() {
        if (this.f31887y != null && this.f31697d0 != null) {
            if (org.telegram.ui.Components.mg0.m0.M) {
                org.telegram.ui.Components.mg0.j(false);
            }
            o2();
            n2(false);
            try {
                if (this.f31697d0.getParent() != null) {
                    ((WindowManager) this.f31887y.getSystemService("window")).removeViewImmediate(this.f31697d0);
                    V1();
                }
                this.f31697d0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            ImageReceiver.BitmapHolder bitmapHolder = this.f31729g5;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.f31729g5 = null;
            }
            this.f31706e0.setImageBitmap(null);
            if (this == X8) {
                X8 = null;
            } else {
                W8 = null;
            }
            V1();
        }
    }

    public final boolean P1() {
        if (this.Z1 != 11) {
            int i10 = this.M4;
            if (i10 >= 0) {
                ArrayList arrayList = this.f31704d7;
                if (i10 < arrayList.size()) {
                    ou0 ou0Var = this.d;
                    if (ou0Var != null && !ou0Var.N()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.M4);
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

    public final void P2(boolean z4, boolean z10) {
        if (this.f31745i3 != z4) {
            if (z4) {
                this.f31715f0.setTag(1);
            } else {
                this.f31715f0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f31736h3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f31745i3 = z4;
            float f10 = 0.0f;
            int i10 = 0;
            if (z10) {
                if (z4) {
                    this.f31718f3.setVisibility(0);
                }
                float alpha = this.f31718f3.getAlpha();
                if (z4) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new sq0(this, 0));
                ofFloat.addListener(new ft0(this, z4, 0));
                this.f31736h3 = ofFloat;
                ofFloat.start();
            } else {
                xu0 xu0Var = this.f31718f3;
                if (!z4) {
                    i10 = 8;
                }
                xu0Var.setVisibility(i10);
                xu0 xu0Var2 = this.f31718f3;
                if (z4) {
                    f10 = 1.0f;
                }
                xu0Var2.setAlpha(f10);
            }
            if (this.f31735h2 && this.f31731g7 == null) {
                if (z4) {
                    this.f31769l0.K(9);
                } else {
                    this.f31769l0.r(9);
                }
            }
        }
    }

    public final void Q0() {
        if (this.z4.getAnimation() == null && !this.f31704d7.isEmpty() && this.Z1 != 1) {
            String imageKey = this.z4.getImageKey();
            String str = this.f31853u4;
            if (str == null || !str.equals(imageKey)) {
                this.f31845t4 = 0;
                ImageReceiver.BitmapHolder bitmapSafe = this.z4.getBitmapSafe();
                int orientation = this.z4.getOrientation();
                if (imageKey != null && bitmapSafe != null && bitmapSafe.bitmap != null) {
                    Utilities.globalQueue.postRunnable(new et(this, bitmapSafe, orientation, imageKey, 7));
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
        ku0 ku0Var = this.f31731g7;
        if (ku0Var != null) {
            if ((ku0Var.a(i10) || this.f31731g7.e(i10)) && SharedConfig.isAutoplayVideo()) {
                File b10 = this.f31731g7.b(i10);
                if (b10 != null && b10.exists()) {
                    return true;
                }
                if (SharedConfig.streamMedia && (this.f31731g7.d(i10) instanceof TLRPC.Document)) {
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
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.V7)), this.U7);
        edit.commit();
        D3();
        B3();
    }

    public final void R1() {
        WindowManager.LayoutParams layoutParams = this.f31670a0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.f31887y.getSystemService("window")).updateViewLayout(this.f31697d0, this.f31670a0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f31697d0.setFocusable(true);
        this.f31679b0.setFocusable(true);
    }

    public final void S0() {
        kf.t0 t0Var = this.f31758j7;
        if (t0Var != null) {
            t0Var.destroy();
            this.f31758j7 = null;
        }
        kf.s0 s0Var = this.Y1;
        if (s0Var != null) {
            s0Var.destroy();
            this.Y1 = null;
        }
        try {
            if (this.f31697d0.getParent() != null) {
                ((WindowManager) this.f31887y.getSystemService("window")).removeView(this.f31697d0);
                V1();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z4) {
        boolean z10;
        int i10;
        Bitmap.CompressFormat g12 = g1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z10 = true;
            } catch (Throwable th2) {
                FileLog.e(th2);
                return;
            }
        } else {
            z10 = false;
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
        Paint paint = R8;
        if (z4) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f10 == 512.0f) {
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
        if (z10) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void S2(AlertDialog$Builder alertDialog$Builder) {
        if (this.f31887y != null) {
            try {
                org.telegram.ui.ActionBar.d2 d2Var = this.M1;
                if (d2Var != null) {
                    d2Var.dismiss();
                    this.M1 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
                this.M1 = o10;
                o10.setCanceledOnTouchOutside(true);
                this.M1.setOnDismissListener(new x5(this, 11));
            } catch (Exception e6) {
                FileLog.e(e6);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f31755j4;
        if ((p2Var instanceof zn) && ChatObject.isChannelAndNotMegaGroup(((zn) p2Var).e)) {
            org.telegram.ui.Components.ic f10 = new org.telegram.ui.Components.qc(frameLayout, this.f31835s2).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new tq0(this, 26));
            f10.v = new tq0(this, 27);
            this.f31767k7 = f10.j();
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f31887y, 0, this.f31835s2);
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.Q4;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.Q4.currentAccount).isLoadingFile(this.Z4[0])) {
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PleaseStreamDownload);
        } else {
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PleaseDownload);
        }
        S2(alertDialog$Builder);
    }

    public final void V0(Canvas canvas) {
        boolean z4;
        float e;
        int i10;
        if (this.P4) {
            if (!SharedConfig.photoViewerBlur) {
                e = 1.0f;
            } else {
                int i11 = this.f31764k4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                e = this.A8.e(z4);
            }
            if (e <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (AndroidUtilities.statusBarHeight * 1.5f));
            int height = this.M0.getHeight() + AndroidUtilities.navigationBarHeight;
            if (this.R1.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(20.0f) + (this.R1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            if (this.C7 == null) {
                this.C7 = new Path();
                Paint paint = new Paint(1);
                this.D7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.E7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.F7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.G7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.H7 = new Matrix();
                this.I7 = new Matrix();
                this.D7.setShader(this.F7);
                this.E7.setShader(this.G7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f31679b0.getWidth(), this.f31679b0.getHeight() + AndroidUtilities.navigationBarHeight, (int) (e * (this.I0.getAlpha() - 127) * 2.007874f), 31);
            this.C7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.C7.addRect(0.0f, 0.0f, this.f31679b0.getWidth(), f10, direction);
            this.C7.addRect(0.0f, (this.f31679b0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f31679b0.getWidth(), this.f31679b0.getHeight() + AndroidUtilities.navigationBarHeight, direction);
            canvas.clipPath(this.C7);
            canvas.drawColor(-16777216);
            T0(canvas, this.Z, 0, 0, true, true, false);
            canvas.save();
            this.H7.reset();
            this.H7.postScale(1.0f, f10 / 16.0f);
            this.F7.setLocalMatrix(this.H7);
            this.D7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f31679b0.getWidth(), f10, this.D7);
            this.I7.reset();
            this.I7.postScale(1.0f, i12 / 16.0f);
            this.I7.postTranslate(0.0f, (this.f31679b0.getHeight() - i12) + AndroidUtilities.navigationBarHeight);
            this.G7.setLocalMatrix(this.I7);
            this.E7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f31679b0.getHeight() + AndroidUtilities.navigationBarHeight) - i12, this.f31679b0.getWidth(), this.f31679b0.getHeight() + AndroidUtilities.navigationBarHeight, this.E7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void V1() {
        Activity activity = this.f31887y;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).X0.remove(this.f31805p1);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f31755j4;
        if (p2Var != null && p2Var.getFragmentView() != null) {
            this.f31757j6 = 1.0f;
            View fragmentView = this.f31755j4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.li liVar = this.X1;
            if (liVar != null) {
                org.telegram.ui.ActionBar.e3 container = liVar.getContainer();
                container.setScaleX(1.0f);
                container.setScaleY(1.0f);
            }
        }
    }

    public final void V2(final org.telegram.ui.Components.bd bdVar, boolean z4, boolean z10, final float[] fArr) {
        float f10;
        float f11;
        int i10;
        ou0 ou0Var = this.d;
        if (ou0Var != null && ou0Var.l()) {
            f10 = 175.0f;
        } else {
            f10 = 58.0f;
        }
        float dp = AndroidUtilities.dp(f10);
        float f12 = 1.0f;
        if (bdVar == this.S1) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f13 = dp * f11;
        Integer num = null;
        if (!z10) {
            bdVar.animate().setListener(null).cancel();
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            bdVar.setVisibility(i10);
            if (z4) {
                f13 = 0.0f;
            }
            bdVar.setTranslationY(f13);
            float alpha = this.M0.getAlpha();
            if (!z4) {
                f12 = 0.0f;
            }
            fArr[0] = f12;
            bdVar.setAlpha(alpha * f12);
        } else if (z4 && bdVar.getTag() == null) {
            if (bdVar.getVisibility() != 0) {
                bdVar.setVisibility(0);
                bdVar.setAlpha(this.M0.getAlpha());
                bdVar.setTranslationY(f13);
            }
            bdVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f37217b;

                {
                    this.f37217b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f37217b;
                            float alpha2 = photoViewer.M0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = bdVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.R1) {
                                FrameLayout frameLayout = photoViewer.N7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.M0.getTranslationY() - (photoViewer.R1.getAlpha() * kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f31680b1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                photoViewer.f31690c1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                photoViewer.f31698d1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f37217b;
                            float alpha3 = photoViewer2.M0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = bdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.R1) {
                                FrameLayout frameLayout2 = photoViewer2.N7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.M0.getTranslationY() - (photoViewer2.R1.getAlpha() * kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f31680b1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                photoViewer2.f31690c1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                photoViewer2.f31698d1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.mr.h).start();
        } else if (!z4 && bdVar.getTag() != null) {
            bdVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f37217b;

                {
                    this.f37217b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f37217b;
                            float alpha2 = photoViewer.M0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = bdVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.R1) {
                                FrameLayout frameLayout = photoViewer.N7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.M0.getTranslationY() - (photoViewer.R1.getAlpha() * kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f31680b1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                photoViewer.f31690c1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                                photoViewer.f31698d1.setTranslationY(photoViewer.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                            }
                            photoViewer.F1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f37217b;
                            float alpha3 = photoViewer2.M0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = bdVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.R1) {
                                FrameLayout frameLayout2 = photoViewer2.N7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.M0.getTranslationY() - (photoViewer2.R1.getAlpha() * kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f31680b1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                photoViewer2.f31690c1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                                photoViewer2.f31698d1.setTranslationY(photoViewer2.R1.getAlpha() * (-kf.k0.c(46.0f, photoViewer2.R1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.F1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.mr.h).withEndAction(new dh(3, bdVar)).start();
        }
        if (z4) {
            num = 1;
        }
        bdVar.setTag(num);
    }

    public final void W0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void W1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.C2 != null && this.Q4 != null) {
                    int intValue = Utilities.parseInt((CharSequence) url).intValue();
                    if (this.C2.p() == -9223372036854775807L) {
                        this.X2 = intValue / ((float) this.Q4.getDuration());
                        return;
                    }
                    long j10 = intValue * 1000;
                    this.C2.K(j10);
                    this.f31789n3.h(((float) j10) / ((float) this.C2.p()), true);
                    this.f31798o3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.f31887y instanceof LaunchActivity) {
                    qy qyVar = new qy(null);
                    qyVar.f37575k2 = url;
                    ((LaunchActivity) this.f31887y).q0(qyVar, false, true);
                    G0(false, false);
                    return;
                }
                return;
            } else if (this.f31746i4 != null && ((clickableSpan instanceof org.telegram.ui.Components.o51) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                org.telegram.ui.Components.z4.q0(this.f31746i4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void W2(boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        ou0 ou0Var = this.d;
        boolean z13 = false;
        if (ou0Var != null && ou0Var.A()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ms0 ms0Var = this.R1;
        if (z4 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        V2(ms0Var, z12, z10, this.f31865v7);
        ns0 ns0Var = this.S1;
        if (z4 && z11) {
            z13 = true;
        }
        V2(ns0Var, z13, z10, this.f31875w7);
    }

    @Override
    public final void X0() {
        D1();
    }

    public final void X1(qu0 qu0Var) {
        if (this.f31825r2) {
            n2(true);
        }
        MessageObject messageObject = this.Q4;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.Q).cancelLoadFile(this.Q4.getDocument());
        }
        this.e = false;
        this.f31714f = false;
        this.f31699d2 = false;
        this.f31808p4 = true;
        this.Q4 = null;
        this.V4 = null;
        this.W4 = null;
        this.X4 = null;
        this.Y4 = null;
        this.f31720f5 = null;
        this.f31684b5 = null;
        this.f31788n2 = null;
        VideoAds videoAds = this.R4;
        if (videoAds != null) {
            videoAds.stop();
            this.R4 = null;
        }
        if (this.f31718f3 != null) {
            P2(false, false);
        }
        nt0 nt0Var = this.Q1;
        if (nt0Var != null) {
            nt0Var.scrollTo(0, 0);
        }
        this.Z1 = 0;
        this.a2 = false;
        this.f31681b2 = false;
        this.f31691c2 = false;
        this.f31708e2 = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.f31729g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.f31729g5 = null;
        }
        this.X1 = null;
        kf.s0 s0Var = this.Y1;
        if (s0Var != null) {
            s0Var.destroy();
            this.Y1 = null;
        }
        org.telegram.ui.Components.y5 y5Var = this.f31726g2;
        if (y5Var != null) {
            y5Var.w(this.f31679b0);
            this.f31726g2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            mu0 mu0Var = this.T0[i10];
            if (mu0Var != null) {
                mu0Var.d(-1, false, true);
            }
        }
        p2(0);
        js0 js0Var = this.O7;
        if (js0Var != null) {
            js0Var.a();
        }
        this.f31761k1.e(0, false);
        this.z4.setImageBitmap((Bitmap) null);
        this.C4.a();
        this.f31892y4.setImageBitmap((Bitmap) null);
        this.B4.a();
        this.A4.setImageBitmap((Bitmap) null);
        this.D4.a();
        this.f31679b0.post(new vq0(this, qu0Var, 0));
        ou0 ou0Var = this.d;
        if (ou0Var != null) {
            ou0Var.G();
        }
        org.telegram.ui.Components.y30 y30Var = this.f31743i1;
        y30Var.d.clear();
        y30Var.e.clear();
        y30Var.f30822c.clear();
        ou0 ou0Var2 = this.d;
        if (ou0Var2 != null) {
            ou0Var2.D();
        }
        this.d = null;
        this.f31777m1.l();
        this.f31731g7 = null;
        this.f31808p4 = false;
        this.f31768k8 = 0.0f;
        this.f31776l8 = 1.0f;
        if (qu0Var != null) {
            qu0Var.f37487a.setVisible(true, true);
        }
        zn znVar = this.f31746i4;
        if (znVar != null) {
            znVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.L4;
        if (bitmap != null) {
            bitmap.recycle();
            this.L4 = null;
        }
    }

    public final void X2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X2(boolean, boolean):void");
    }

    public final void Y0(TLRPC.Document document, TLRPC.Document document2, boolean z4, Utilities.Callback2 callback2) {
        float f10;
        this.f31830r7 = document;
        this.f31820q7 = document2;
        this.f31839s7 = z4;
        this.f31847t7 = false;
        this.f31856u7 = callback2;
        this.Y5 = 0.0f;
        this.f31694c6 = 0.0f;
        if (this.f31781m5 != null) {
            zt0 zt0Var = this.f31863v5;
            if (zt0Var != null) {
                zt0Var.m(false, false);
            }
            this.f31781m5.b();
            ArrayList arrayList = this.f31800o5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f31830r7 != null) {
            ArrayList arrayList2 = this.f31800o5;
            if (arrayList2 == null) {
                this.f31800o5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(this.f31830r7, Integer.valueOf(this.Q));
            if (findStickerEmoticons != null) {
                this.f31800o5.addAll(findStickerEmoticons);
            }
        }
        zt0 zt0Var2 = this.f31818q5;
        if (zt0Var2 != null) {
            zt0Var2.setCutOutState(false);
        }
        a3(true, false);
        ImageView imageView = this.Z0;
        if (imageView != null) {
            if (this.f31839s7) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void Y1(org.telegram.messenger.MessageObject r23, org.telegram.tgnet.TLRPC.FileLocation r24, org.telegram.messenger.ImageLocation r25, org.telegram.messenger.ImageLocation r26, java.util.ArrayList r27, java.util.ArrayList r28, java.util.List r29, int r30, org.telegram.ui.qu0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.qu0):void");
    }

    public final void Y2(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        float f18;
        float f19;
        int i11;
        TextureView textureView;
        if (z4 && this.E3 && this.F3 && !this.C3 && (textureView = this.f31890y2) != null) {
            this.L4 = textureView.getBitmap();
        }
        if (z4) {
            this.W7 = this.U7;
        }
        AnimatorSet animatorSet = this.Q7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Q7 = new AnimatorSet();
        float f20 = 0.0f;
        if (z4) {
            if (this.P4) {
                this.f31724g0.setVisibility(0);
                View view = this.f31724g0;
                if (this.Z1 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f31724g0;
                if (this.Z1 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.K7.setTag(1);
            AnimatorSet animatorSet2 = this.Q7;
            dg.s1 s1Var = this.M0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.R1.getEditTextHeight() + s1Var.getHeight();
            if (this.f31796o1) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var, property, 0.0f, editTextHeight + i10);
            dg.s1 s1Var2 = this.M0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(s1Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.P0, property, 0.0f, AndroidUtilities.dp(158.0f));
            View view3 = this.f31724g0;
            if (this.P4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.K7.setTag(null);
            AnimatorSet animatorSet3 = this.Q7;
            su0 su0Var = this.K7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(su0Var, property3, 0.0f, AndroidUtilities.dp(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.L7, property3, 0.0f, AndroidUtilities.dp(166.0f));
            View view4 = this.f31724g0;
            Property property4 = View.ALPHA;
            if (this.P4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.Q7.addListener(new ft0(this, z4, 3));
        this.Q7.setDuration(200L);
        this.Q7.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.Q7.start();
        float f21 = 0.25f;
        if (this.f31680b1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f31680b1.animate();
            if (z4) {
                f15 = 0.25f;
            } else {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f15);
            if (z4) {
                f16 = 0.25f;
            } else {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            scaleY.alpha(f17).setDuration(200L);
        }
        if (this.f31690c1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f31690c1.animate();
            if (z4) {
                f12 = 0.25f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f12);
            if (z4) {
                f13 = 0.25f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f13);
            if (z4) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            scaleY2.alpha(f14).setDuration(200L);
        }
        if (this.f31698d1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f31698d1.animate();
            if (z4) {
                f11 = 0.25f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX3 = animate3.scaleX(f11);
            if (!z4) {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleY3 = scaleX3.scaleY(f21);
            if (!z4) {
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
        if (this.f31887y != null) {
            zn znVar = this.f31746i4;
            if (znVar != null) {
                a2 = znVar.a();
            } else {
                ou0 ou0Var = this.d;
                if (ou0Var != null) {
                    a2 = ou0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a2;
            org.telegram.ui.Components.z4.K(this.f31887y, j10, -1L, 0, false, new br0(this), null, new org.telegram.ui.Components.x4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false)), null);
        }
    }

    @Override
    public final void a(c2.p pVar) {
        this.M8 = pVar;
        this.O8 = false;
        if (this.f31697d0 != null) {
            ((WindowManager) this.f31887y.getSystemService("window")).addView(this.f31697d0, this.f31670a0);
            this.f31697d0.invalidate();
        }
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            i71Var.U(null);
            this.C2.V(null);
            this.C2.C();
            TextureView textureView = this.f31890y2;
            if (textureView != null) {
                this.C2.V(textureView);
                return;
            }
            SurfaceView surfaceView = this.f31899z2;
            if (surfaceView != null) {
                this.C2.U(surfaceView);
            }
        }
    }

    public final void a2(ArrayList arrayList, int i10, long j10, long j11, long j12, ou0 ou0Var) {
        e2((MessageObject) arrayList.get(i10), null, null, null, arrayList, null, null, i10, ou0Var, null, j10, j11, j12, true, null, null);
    }

    public final void a3(boolean z4, boolean z10) {
        Integer num;
        boolean z11;
        Integer num2;
        boolean z12;
        boolean z13;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        boolean z14 = true;
        Integer num3 = 1;
        int i13 = 8;
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (!z10) {
            this.f31781m5.animate().setListener(null).cancel();
            dg.q3 q3Var = this.f31781m5;
            if (z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            q3Var.setVisibility(i11);
            this.f31781m5.setAlpha(this.M0.getAlpha());
            this.f31809p5.animate().setListener(null).cancel();
            nh.a3 a3Var = this.f31809p5;
            if (z4) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            a3Var.setVisibility(i12);
            nh.a3 a3Var2 = this.f31809p5;
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            a3Var2.setAlpha(f12);
        } else if (z4 && this.f31781m5.getTag() == null) {
            this.f31781m5.animate().setListener(null).cancel();
            this.f31809p5.animate().setListener(null).cancel();
            if (this.f31781m5.getVisibility() != 0) {
                this.f31781m5.setVisibility(0);
                this.f31781m5.animate().alpha(1.0f).start();
                this.f31809p5.setVisibility(0);
                this.f31809p5.animate().alpha(1.0f).start();
            }
        } else if (!z4 && this.f31781m5.getTag() != null) {
            this.f31781m5.animate().setListener(null).cancel();
            this.f31781m5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.m00(this.f31781m5)).start();
            this.f31809p5.animate().setListener(null).cancel();
            this.f31809p5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.m00(this.f31809p5)).start();
        }
        dg.q3 q3Var2 = this.f31781m5;
        if (z4) {
            num = num3;
        } else {
            num = null;
        }
        q3Var2.setTag(num);
        if (z4 && this.f31818q5.f4435g0 != 1 && !this.f31839s7) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            this.f31818q5.animate().setListener(null).cancel();
            zt0 zt0Var = this.f31818q5;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            zt0Var.setVisibility(i10);
            zt0 zt0Var2 = this.f31818q5;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            zt0Var2.setAlpha(f11);
        } else if (z11 && this.f31818q5.getTag() == null) {
            this.f31818q5.animate().setListener(null).cancel();
            if (this.f31818q5.getVisibility() != 0) {
                this.f31818q5.setVisibility(0);
            }
            this.f31818q5.animate().alpha(1.0f).start();
        } else if (!z11 && this.f31818q5.getTag() != null) {
            this.f31818q5.animate().setListener(null).cancel();
            this.f31818q5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.m00(this.f31818q5)).start();
        }
        zt0 zt0Var3 = this.f31818q5;
        if (z11) {
            num2 = num3;
        } else {
            num2 = null;
        }
        zt0Var3.setTag(num2);
        if (z4 && this.f31818q5.f4435g0 == 1 && !this.f31839s7) {
            z12 = true;
        } else {
            z12 = false;
        }
        X2(z12, z10);
        dg.q3 q3Var3 = this.f31781m5;
        if (z4 && this.f31818q5.f4435g0 == 1 && this.f31863v5.m0 && !this.f31838s5.m0 && !this.f31846t5.m0) {
            z13 = true;
        } else {
            z13 = false;
        }
        q3Var3.setOutlineVisible(z13);
        z14 = (!z4 || this.f31818q5.f4435g0 != 1 || this.f31838s5.m0 || this.f31846t5.m0) ? false : false;
        if (!z10) {
            this.f31863v5.animate().setListener(null).cancel();
            zt0 zt0Var4 = this.f31863v5;
            if (z14) {
                i13 = 0;
            }
            zt0Var4.setVisibility(i13);
            zt0 zt0Var5 = this.f31863v5;
            if (z14) {
                f13 = 1.0f;
            }
            zt0Var5.setAlpha(f13);
            zt0 zt0Var6 = this.f31863v5;
            if (z14) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            zt0Var6.setScaleX(f10);
            zt0 zt0Var7 = this.f31863v5;
            if (!z14) {
                f14 = 0.8f;
            }
            zt0Var7.setScaleY(f14);
        } else if (z14 && this.f31863v5.getTag() == null) {
            this.f31863v5.animate().setListener(null).cancel();
            if (this.f31863v5.getVisibility() != 0) {
                this.f31863v5.setVisibility(0);
            }
            b.p(this.f31863v5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.mr.h, 400L);
        } else if (!z14 && this.f31863v5.getTag() != null) {
            this.f31863v5.animate().setListener(null).cancel();
            b.p(this.f31863v5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.m00(this.f31863v5)), org.telegram.ui.Components.mr.h, 400L);
        }
        zt0 zt0Var8 = this.f31863v5;
        if (!z14) {
            num3 = null;
        }
        zt0Var8.setTag(num3);
    }

    @Override
    public final Bitmap b() {
        TextureView textureView = this.N8;
        if (textureView != null && textureView.isAvailable()) {
            return this.N8.getBitmap();
        }
        return null;
    }

    public final int b1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.Z1 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return AndroidUtilities.dp(14.0f);
            }
            return 0;
        }
        return AndroidUtilities.dp(16.0f);
    }

    public final void b2(ArrayList arrayList, int i10, ou0 ou0Var) {
        e2(null, null, null, null, null, arrayList, null, i10, ou0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3(boolean z4) {
        Integer num;
        float f10;
        float f11;
        ut0 ut0Var;
        if (!z4 || this.f31807p3.getTag() == null) {
            if (!z4 && this.f31807p3.getTag() == null) {
                return;
            }
            if (z4 && !this.f31807p3.f27794s && ((ut0Var = this.f31689c0) == null || !ut0Var.f30245x || ut0Var.v.isEmpty())) {
                this.f31826r3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f31816q3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ys0 ys0Var = this.f31807p3;
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            ys0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31816q3 = animatorSet2;
            ys0 ys0Var2 = this.f31807p3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ys0Var2, property, f10);
            ys0 ys0Var3 = this.f31807p3;
            Property property2 = View.SCALE_X;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ys0Var3, property2, f11);
            ys0 ys0Var4 = this.f31807p3;
            Property property3 = View.SCALE_Y;
            if (!z4) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ys0Var4, property3, f13);
            ys0 ys0Var5 = this.f31807p3;
            Property property4 = View.TRANSLATION_Y;
            if (!z4) {
                f12 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(ys0Var5, property4, f12));
            this.f31816q3.setDuration(380L);
            this.f31816q3.setInterpolator(org.telegram.ui.Components.mr.h);
            this.f31816q3.addListener(new us0(this, 1));
            this.f31816q3.start();
        }
    }

    @Override
    public final void c(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final int c1(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.Z1 != 1)) {
                if (i10 == 3 && this.I1 != null) {
                    int dp = AndroidUtilities.dp(8.0f);
                    if (!this.f31832s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return this.I1.getAdditionalTop() + dp + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int dp2 = AndroidUtilities.dp(14.0f);
                    if (!this.f31832s) {
                        i11 = AndroidUtilities.statusBarHeight;
                    }
                    return dp2 + i11;
                }
            } else {
                int dp3 = AndroidUtilities.dp(16.0f);
                if (!this.f31832s) {
                    i11 = AndroidUtilities.statusBarHeight;
                }
                return dp3 + i11;
            }
        }
        return 0;
    }

    public final void c2(MessageObject messageObject, zn znVar, long j10, long j11, long j12, fu0 fu0Var) {
        e2(messageObject, null, null, null, null, null, null, 0, fu0Var, znVar, j10, j11, j12, true, null, null);
    }

    public final void c3(boolean z4, boolean z10) {
        int i10;
        Integer num = null;
        if (!z10) {
            this.N7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.N7;
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            this.O7.setTranslationY(0.0f);
            this.N7.setAlpha(this.M0.getAlpha());
        } else if (z4 && this.N7.getTag() == null) {
            if (this.N7.getVisibility() != 0) {
                this.N7.setVisibility(0);
                this.N7.setAlpha(this.M0.getAlpha());
                this.O7.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.f31885x7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f31885x7.cancel();
            }
            js0 js0Var = this.O7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(js0Var, View.TRANSLATION_Y, js0Var.getTranslationY(), 0.0f);
            this.f31885x7 = ofFloat;
            ofFloat.setDuration(220L);
            this.f31885x7.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.f31885x7.start();
        } else if (!z4 && this.N7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.f31885x7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.f31885x7.cancel();
            }
            js0 js0Var2 = this.O7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(js0Var2, View.TRANSLATION_Y, js0Var2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.f31885x7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.m00(this.N7));
            this.f31885x7.setDuration(220L);
            this.f31885x7.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.f31885x7.start();
        }
        FrameLayout frameLayout2 = this.N7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.N7.setTranslationY(this.M0.getTranslationY() - (this.R1.getAlpha() * kf.k0.c(46.0f, this.R1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.N7;
        if (z4) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final Bitmap d() {
        TextureView textureView = this.f31890y2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.A2 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmaps.createBitmap(this.f31899z2.getWidth(), this.f31899z2.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(this.f31899z2, createBitmap);
            return createBitmap;
        }
        return null;
    }

    public final int d1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(boolean):int");
    }

    public final void d2(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, fu0 fu0Var) {
        e2(null, fileLocation, imageLocation, null, null, null, null, 0, fu0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void d3() {
        org.telegram.ui.Components.i71 i71Var;
        if (this.f31796o1 && (i71Var = this.C2) != null && !i71Var.y()) {
            if (!this.f31822r || this.Z1 == 1) {
                this.C2.W(0.0f);
            }
            this.E2 = false;
            q3();
        }
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void e(c2.p pVar) {
        if (org.telegram.ui.Components.mg0.m0.M) {
            org.telegram.ui.Components.mg0.j(false);
        }
        this.M8 = pVar;
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            i71Var.U(null);
            this.C2.V(null);
            this.C2.C();
            this.C2.V(this.N8);
        }
        ((WindowManager) this.f31887y.getSystemService("window")).removeView(this.f31697d0);
        this.O8 = true;
        this.f31697d0.invalidate();
    }

    public final ClippingImageView[] e1(qu0 qu0Var) {
        int i10;
        if (!AndroidUtilities.isTablet() && qu0Var != null && qu0Var.f37496m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f31706e0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = qu0Var.f37496m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(qu0Var.f37497n);
        }
        return clippingImageViewArr;
    }

    public final boolean e2(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ImageLocation r19, org.telegram.messenger.ImageLocation r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.ou0 r25, org.telegram.ui.zn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.ku0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e2(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.ou0, org.telegram.ui.zn, long, long, long, boolean, org.telegram.ui.ku0, java.lang.Integer):boolean");
    }

    public final void e3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3(int):void");
    }

    @Override
    public final void f(Canvas canvas) {
        this.P8 = true;
        this.f31697d0.draw(canvas);
        this.P8 = false;
    }

    public final org.telegram.ui.Components.bd f1() {
        ou0 ou0Var = this.d;
        if (ou0Var != null && ou0Var.A()) {
            return this.S1;
        }
        return this.R1;
    }

    public final void f2(ArrayList arrayList, int i10, int i11, boolean z4, ou0 ou0Var, zn znVar) {
        boolean z10;
        org.telegram.ui.Components.k6 k6Var;
        this.f31708e2 = z4;
        org.telegram.ui.Components.pp0 pp0Var = this.P0;
        int i12 = 0;
        if (pp0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pp0Var.getLayoutParams();
            if (i11 != 4 && i11 != 5) {
                if (i11 != 13 && i11 != 14 && i11 != 1 && i11 != 3 && i11 != 10 && i11 != 11) {
                    this.P0.setResourceId(R.drawable.send_plane_24);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                } else {
                    this.P0.setResourceId(R.drawable.floating_check);
                    this.P0.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                    layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
                }
            } else {
                this.P0.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            }
            this.P0.setLayoutParams(layoutParams);
        }
        if (i11 != 11 && this.f31781m5 != null) {
            this.f31839s7 = false;
            ImageView imageView = this.Z0;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            zt0 zt0Var = this.f31863v5;
            if (zt0Var != null) {
                zt0Var.m(false, false);
            }
            this.f31781m5.b();
            ArrayList arrayList2 = this.f31800o5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z11 = this.e;
        BackgroundDrawable backgroundDrawable = this.I0;
        if (z11 && this.Z1 != i11 && i11 == 1) {
            this.Z1 = i11;
            this.f31825r2 = false;
            this.J.c("");
            this.J.a("", false);
            this.d = ou0Var;
            this.F5 = 0L;
            this.B5 = 0L;
            this.f31777m1.l();
            this.f31731g7 = null;
            if (this.R6 == null) {
                this.R6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f31714f = true;
            p3(false, false);
            this.f31744i2 = false;
            H0();
            j3(false, false);
            this.f31682b3 = 0.0f;
            this.S2 = false;
            this.R2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f31679b0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
            E1();
            z2();
        } else if (z11 && this.Z1 != i11 && i11 == 11) {
            this.Z1 = i11;
            this.f31825r2 = false;
            this.J.c("");
            this.J.a("", false);
            this.d = ou0Var;
            this.F5 = 0L;
            this.B5 = 0L;
            this.f31777m1.l();
            this.f31731g7 = null;
            if (this.R6 == null) {
                this.R6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f31714f = true;
            p3(false, false);
            this.f31682b3 = 0.0f;
            this.S2 = false;
            this.R2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f31679b0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.Z1 = i11;
            if (i11 == 12) {
                this.Z1 = 0;
                this.a2 = true;
            }
            int i13 = this.Z1;
            if (i13 == 14) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31691c2 = z10;
            if (i13 == 13 || z10) {
                this.Z1 = 0;
                this.f31681b2 = true;
            }
            this.f31669a.a(z10, false);
            if (this.Z1 == 11) {
                this.f31724g0.setBackgroundColor(-16777216);
            }
            nu0 nu0Var = this.J;
            if (nu0Var != null && (k6Var = nu0Var.d) != null) {
                if (this.f31681b2) {
                    i12 = 8;
                }
                k6Var.setVisibility(i12);
            }
            e2(null, null, null, null, null, null, arrayList, i10, ou0Var, znVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void f3(int i10, boolean z4) {
        if (this.Q4 != null) {
            n2(false);
            FileLoader.getInstance(this.Q).cancelLoadFile(this.Q4.getDocument());
        } else if (this.f31720f5 != null) {
            TLObject d = this.f31731g7.d(this.M4);
            if (d instanceof TLRPC.Document) {
                n2(false);
                FileLoader.getInstance(this.Q).cancelLoadFile((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.y30 y30Var = this.f31743i1;
        if (y30Var != null) {
            y30Var.setAnimateBackground(true);
        }
        this.V2 = false;
        C2(this.M4 + i10, z4, true, false);
        if (R2(this.Q4) || Q2(this.M4)) {
            this.V2 = true;
            T1(true);
            B0(0, true);
        }
        z0();
        try {
            d1.f.b(0);
            if (af.c.O().U()) {
                af.c.O().d0(m1());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f31833s0;
        if (g1Var != null && g1Var.isEnabled() && this.M3) {
            return true;
        }
        return false;
    }

    public final Bitmap.CompressFormat g1() {
        if (this.Z1 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void g2() {
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            i71Var.B();
            return;
        }
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null) {
            ut0Var.f();
        }
    }

    public final void g3() {
        float f10;
        boolean z4;
        int i10;
        mt0 mt0Var;
        int i11;
        mt0 mt0Var2;
        this.f31792n6 = null;
        this.M0.setVisibility(8);
        this.P0.setVisibility(8);
        this.f31760k0.setVisibility(8);
        this.f31680b1.setVisibility(8);
        this.f31690c1.setVisibility(8);
        this.f31698d1.setVisibility(8);
        org.telegram.ui.Components.ze0 ze0Var = this.f31898z1;
        if (ze0Var != null) {
            ze0Var.setVisibility(4);
        }
        this.l1.setVisibility(8);
        this.l1.setAlpha(0.0f);
        this.l1.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.L0.setRotationX(0.0f);
        this.l1.setEnabled(false);
        this.H = false;
        if (this.f31717f2) {
            this.N1.setVisibility(4);
        }
        int i12 = this.Z1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.f31704d7.size() > 1)) {
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            s3();
        }
        W2(false, true);
        a3(false, true);
        Bitmap bitmap = this.z4.getBitmap();
        float f11 = this.X5;
        if (this.Z1 == 11) {
            this.f31721f6 = this.V5;
            this.e6 = this.U5;
            this.f31730g6 = f11;
            this.f31739h6 = this.Y5;
            this.f31694c6 = 0.0f;
        }
        eu0 eu0Var = this.U4;
        if (bitmap != null) {
            int bitmapWidth = this.z4.getBitmapWidth();
            int bitmapHeight = this.z4.getBitmapHeight();
            if (this.Z1 == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.f31675a6 = dp;
                f10 = 0.0f;
                if (this.I1 != null) {
                    this.f31675a6 = (mt0Var2.getAdditionalTop() / 2.0f) + dp;
                }
                int i13 = this.A1.f47278i;
                if (i13 == 90 || i13 == 270) {
                    i11 = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                    float f12 = bitmapWidth;
                    float f13 = i11;
                    this.f31685b6 = r2(false) * (Math.min(k1(3) / f12, h1(3, false) / f13) / Math.min(k1(this.f31827r4) / f12, i1() / f13));
                    Rect rect = this.f31806p2;
                    this.Z5 = (rect.left / 2) - (rect.right / 2);
                    this.f31766k6 = System.currentTimeMillis();
                    this.O6 = true;
                }
                i11 = bitmapHeight;
                float f122 = bitmapWidth;
                float f132 = i11;
                this.f31685b6 = r2(false) * (Math.min(k1(3) / f122, h1(3, false) / f132) / Math.min(k1(this.f31827r4) / f122, i1() / f132));
                Rect rect2 = this.f31806p2;
                this.Z5 = (rect2.left / 2) - (rect2.right / 2);
                this.f31766k6 = System.currentTimeMillis();
                this.O6 = true;
            } else {
                f10 = 0.0f;
                int i14 = -AndroidUtilities.dp(44.0f);
                if (!this.f31832s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                float f14 = i14 + i10;
                this.f31675a6 = f14;
                if (this.I1 != null) {
                    float additionalTop = (mt0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f31675a6 = additionalTop;
                    this.f31675a6 = additionalTop - (this.I1.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = eu0Var.f33855c;
                if (cropState != null) {
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                    i11 = (int) (bitmapHeight * cropState.cropPh);
                    float f1222 = bitmapWidth;
                    float f1322 = i11;
                    this.f31685b6 = r2(false) * (Math.min(k1(3) / f1222, h1(3, false) / f1322) / Math.min(k1(this.f31827r4) / f1222, i1() / f1322));
                    Rect rect22 = this.f31806p2;
                    this.Z5 = (rect22.left / 2) - (rect22.right / 2);
                    this.f31766k6 = System.currentTimeMillis();
                    this.O6 = true;
                }
                i11 = bitmapHeight;
                float f12222 = bitmapWidth;
                float f13222 = i11;
                this.f31685b6 = r2(false) * (Math.min(k1(3) / f12222, h1(3, false) / f13222) / Math.min(k1(this.f31827r4) / f12222, i1() / f13222));
                Rect rect222 = this.f31806p2;
                this.Z5 = (rect222.left / 2) - (rect222.right / 2);
                this.f31766k6 = System.currentTimeMillis();
                this.O6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        mt0 mt0Var3 = this.I1;
        if (mt0Var3 != null) {
            if (this.Z1 == 11 && (eu0Var == null || eu0Var.f33855c == null)) {
                z4 = true;
            } else {
                z4 = false;
            }
            mt0Var3.setDrawShadow(z4);
        }
        this.f31697d0.setClipChildren(true);
        this.f31724g0.setVisibility(4);
        this.f31782m6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), f10);
        ofFloat.addUpdateListener(new sq0(this, 6));
        ofFloat2.addUpdateListener(new sq0(this, 7));
        this.f31782m6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.I1.n0(true);
        this.f31782m6.setDuration(200L);
        this.f31782m6.addListener(new us0(this, 3));
        this.f31782m6.start();
    }

    public float getAnimationValue() {
        return this.f31748i6;
    }

    @Override
    public final View h() {
        TextureView textureView = new TextureView(this.f31887y);
        this.N8 = textureView;
        textureView.setOpaque(false);
        View view = this.L8;
        if (view != null) {
            view.bringToFront();
        }
        return this.N8;
    }

    public final int h1(int i10, boolean z4) {
        int measuredHeight;
        boolean z10;
        if (!z4 && !(z10 = this.f31832s)) {
            measuredHeight = (AndroidUtilities.navigationBarHeight - this.f31806p2.bottom) + AndroidUtilities.displaySize.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.Z1 != 1 && !z10) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        } else {
            measuredHeight = this.f31679b0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.Z1 == 1) || i10 == 1) {
            return measuredHeight - AndroidUtilities.dp(144.0f);
        }
        if (i10 == 2) {
            return measuredHeight - AndroidUtilities.dp(214.0f);
        }
        if (i10 == 3) {
            return measuredHeight - (this.I1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.I1.getAdditionalBottom() + AndroidUtilities.dp(48.0f))));
        }
        return measuredHeight;
    }

    public final void h2() {
        bf.f fVar = this.D2;
        if (fVar != null) {
            fVar.b(true);
        }
        if (org.telegram.ui.Components.mg0.p() != null) {
            org.telegram.ui.Components.mg0.p().b(true);
        }
    }

    public final void h3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3():void");
    }

    public final boolean i() {
        if (!this.P8 && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap) {
            return true;
        }
        return false;
    }

    public final int i1() {
        return h1(this.f31827r4, false);
    }

    public final void i2() {
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            i71Var.C();
            return;
        }
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null) {
            ut0Var.g();
        }
    }

    public final void i3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m9;
        q5.q e;
        q5.q e6;
        float f10;
        int i10;
        q5.q e10;
        boolean z4;
        if (!Q1()) {
            return;
        }
        this.K8 = true;
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            if (!d1.f.u() && !this.f31822r) {
                z4 = false;
            } else {
                z4 = true;
            }
            i71Var.O(z4);
        }
        if (this.C2 != null && d1.f.u() && ((atomicInteger = d1.f.f4080b) == null || atomicInteger.get() <= 0)) {
            s5.h e11 = d1.f.e();
            if (e11 == null) {
                a2 = -1;
            } else {
                a2 = e11.a();
            }
            if (a2 >= 0 && Math.abs(this.C2.n() - a2) > 1000) {
                this.C2.K(a2);
            }
            s5.h e12 = d1.f.e();
            if (e12 == null) {
                m9 = false;
            } else if (d1.f.f4079a == 0) {
                m9 = !e12.l();
            } else {
                m9 = e12.m();
            }
            if (m9) {
                this.C2.C();
            } else {
                this.C2.B();
            }
            if (this.B != null) {
                float g10 = d1.f.g();
                s5.h e13 = d1.f.e();
                float f11 = 0.5f;
                if (e13 == null || (e6 = e13.e()) == null) {
                    f10 = 0.5f;
                } else {
                    f10 = (float) e6.f42881r;
                }
                if (Math.abs(g10 - f10) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.B.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = audioManager.getStreamMinVolume(3);
                    } else {
                        i10 = 0;
                    }
                    float f12 = streamMaxVolume - i10;
                    s5.h e14 = d1.f.e();
                    if (e14 != null && (e10 = e14.e()) != null) {
                        f11 = (float) e10.f42881r;
                    }
                    int i11 = i10 + ((int) (f11 * f12));
                    if (i11 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i11, 1);
                    }
                }
            }
            s5.h e15 = d1.f.e();
            float f13 = 1.0f;
            if (e15 != null && (e = e15.e()) != null) {
                f13 = (float) e.d;
            }
            D0(true, false, f13);
        }
        vr vrVar = this.f31841t0;
        if (vrVar != null) {
            vrVar.a(d1.f.u());
        }
        this.K8 = false;
    }

    public final void j0(float f10, float f11, float f12, boolean z4) {
        if (this.X5 == f10 && this.U5 == f11 && this.V5 == f12) {
            return;
        }
        this.O6 = z4;
        this.f31685b6 = f10;
        this.Z5 = f11;
        this.f31675a6 = f12;
        this.f31766k6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31782m6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.n6.f27199g, 0.0f, 1.0f));
        this.f31782m6.setInterpolator(this.f31819q6);
        this.f31782m6.setDuration(250);
        this.f31782m6.addListener(new us0(this, 7));
        this.f31782m6.start();
    }

    public final int j1() {
        return k1(this.f31827r4);
    }

    public final void j3(boolean z4, boolean z10) {
        k3(z4, z10, xt0.e);
    }

    public final CharSequence k0() {
        int i10;
        TLRPC.EncryptedChat encryptedChat;
        if (Q1() && this.d != null && (i10 = this.M4) >= 0) {
            ArrayList arrayList = this.f31704d7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.M4);
                CharSequence text = f1().getText();
                boolean z4 = true;
                CharSequence[] charSequenceArr = {text};
                if (this.f31783m7 && !TextUtils.equals(this.f31793n7, text) && this.d.R(this.M4) != 0 && this.d.H() > 0) {
                    this.f31783m7 = false;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                zn znVar = this.f31746i4;
                if (znVar == null || ((encryptedChat = znVar.h) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101)) {
                    z4 = false;
                }
                ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z4);
                CharSequence charSequence = charSequenceArr[0];
                this.f31793n7 = charSequence;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    photoEntry.caption = charSequence;
                    photoEntry.entities = entities;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    searchImage.caption = charSequence;
                    searchImage.entities = entities;
                }
                if (text.length() != 0 && !this.d.x(this.M4)) {
                    M2();
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

    public final int k1(int i10) {
        int dp;
        int width = this.f31679b0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.Z1 != 1)) {
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

    public final void k3(boolean r17, boolean r18, org.telegram.ui.xt0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3(boolean, boolean, org.telegram.ui.xt0):void");
    }

    public final void l0(android.graphics.Canvas r24, int r25, int r26, int r27, int r28, float r29, yf.f r30, org.telegram.messenger.MediaController.CropState r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l0(android.graphics.Canvas, int, int, int, int, float, yf.f, org.telegram.messenger.MediaController$CropState):void");
    }

    public final float l1(boolean z4) {
        int bitmapWidth;
        int bitmapHeight;
        int i10;
        ImageReceiver imageReceiver = this.z4;
        if (z4) {
            bitmapWidth = imageReceiver.getBitmapHeight();
        } else {
            bitmapWidth = imageReceiver.getBitmapWidth();
        }
        if (z4) {
            bitmapHeight = this.z4.getBitmapWidth();
        } else {
            bitmapHeight = this.z4.getBitmapHeight();
        }
        if (!this.f31832s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.f31898z1.getMeasuredWidth(), (this.f31898z1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - i10) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapWidth, min / bitmapHeight);
    }

    public final void l2() {
        dg.q3 q3Var = this.f31781m5;
        if (q3Var != null && this.Z1 == 11) {
            if (this.f31839s7) {
                q3Var.b();
            } else {
                q3Var.m(this.z4.getBitmap(), this.z4.getOrientation(), k1(this.f31827r4), i1(), new zq0(this, 0));
            }
        }
    }

    public final void l3(boolean z4) {
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
        dg.s1 s1Var = this.M0;
        Property property = View.ALPHA;
        float f18 = 1.0f;
        float f19 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(s1Var, property, f10));
        dg.s1 s1Var2 = this.M0;
        Property property2 = View.TRANSLATION_Y;
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(s1Var2, property2, f11));
        dg.q3 q3Var = this.f31781m5;
        if (q3Var != null) {
            if (z4) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(q3Var, property, f17));
        }
        if (this.f31781m5 != null) {
            nh.a3 a3Var = this.f31809p5;
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(a3Var, property, f16));
        }
        org.telegram.ui.Components.pp0 pp0Var = this.P0;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(pp0Var, property, f12));
        org.telegram.ui.Components.pp0 pp0Var2 = this.P0;
        if (z4) {
            f13 = 0.0f;
        } else {
            f13 = dpf2;
        }
        arrayList.add(ObjectAnimator.ofFloat(pp0Var2, property2, f13));
        int i10 = this.Z1;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.K0;
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f14));
            CheckBox checkBox2 = this.K0;
            if (z4) {
                f15 = 0.0f;
            } else {
                f15 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f15));
            CounterView counterView = this.L0;
            if (!z4) {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f18));
            CounterView counterView2 = this.L0;
            if (!z4) {
                f19 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f19));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z4 && H1()) {
            E0(true);
            ph.f fVar = this.R1.f41842f;
            if (fVar.e) {
                fVar.k(true);
            }
            ph.f fVar2 = this.S1.f41842f;
            if (fVar2.e) {
                fVar2.k(true);
            }
            this.R1.f41842f.d();
            this.S1.f41842f.d();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m0():void");
    }

    public final af.j m1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.m1():af.j");
    }

    public final void m2(String str, long j10, boolean z4, float f10, float f11, int i10, long j11) {
        boolean z10;
        int parseInt;
        if (this.f31848t8 != null) {
            Utilities.globalQueue.cancelRunnable(this.f31848t8);
            this.f31848t8 = null;
        }
        js0 js0Var = this.O7;
        js0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        js0Var.f28942y = mediaMetadataRetriever;
        boolean z11 = true;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        js0Var.f28940w = z10;
        js0Var.d = f10;
        js0Var.e = f11;
        float f12 = js0Var.f28939s;
        if (f12 < f10) {
            js0Var.f28939s = f10;
        } else if (f12 > f11) {
            js0Var.f28939s = f11;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                js0Var.f28941x = open;
                js0Var.f28942y.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = js0Var.f28942y.extractMetadata(9);
            if (extractMetadata != null) {
                js0Var.f28931a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = js0Var.f28942y.extractMetadata(18);
            if (extractMetadata2 != null) {
                js0Var.f28933b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = js0Var.f28942y.extractMetadata(19);
            if (extractMetadata3 != null) {
                js0Var.f28935c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = js0Var.f28942y.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = js0Var.f28933b;
                js0Var.f28933b = js0Var.f28935c;
                js0Var.f28935c = i12;
            }
            if (js0Var.f28940w) {
                js0Var.f28936f = (float) ((j11 / 1000.0d) / js0Var.f28931a);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        js0Var.invalidate();
        this.f31857u8 = null;
        if (!z4 && this.Z1 != 1) {
            z11 = false;
        }
        this.f31822r = z11;
        this.V7 = -1;
        this.X7 = 0;
        this.f31723f8 = 25;
        this.f31821q8 = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        vt0 vt0Var = new vt0(this, str, j10, i10);
        this.f31848t8 = vt0Var;
        dispatchQueue.postRunnable(vt0Var);
    }

    public final void m3(boolean z4, boolean z10) {
        float f10;
        tq0 tq0Var = this.f31877x;
        AndroidUtilities.cancelRunOnUIThread(tq0Var);
        int i10 = 0;
        if (z10) {
            n3(z4);
            if (z4) {
                AnimatorSet animatorSet = this.f31867w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31867w = null;
                }
                if (this.O3) {
                    this.O3 = false;
                    n3(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(tq0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f31867w;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                n3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f31867w;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f31867w = null;
        }
        nd ndVar = this.U0;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ndVar.setAlpha(f10);
        nd ndVar2 = this.U0;
        if (!z4) {
            i10 = 4;
        }
        ndVar2.setVisibility(i10);
    }

    public final void n0(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0(android.graphics.Bitmap):void");
    }

    public final org.telegram.messenger.VideoEditedInfo n1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n1():org.telegram.messenger.VideoEditedInfo");
    }

    public final void n2(boolean z4) {
        int i10 = 0;
        this.A2 = false;
        bf.f fVar = this.D2;
        if (fVar != null) {
            fVar.c();
            this.D2 = null;
        }
        org.telegram.ui.Components.i71 i71Var = this.C2;
        HashMap hashMap = S8;
        ls0 ls0Var = this.f31851u2;
        if (i71Var != null) {
            u0();
            AndroidUtilities.cancelRunOnUIThread(this.f31843t2);
            AndroidUtilities.cancelRunOnUIThread(ls0Var);
            if (this.Z2 != null) {
                float n10 = ((float) this.C2.n()) / ((float) this.C2.p());
                String str = this.Z2;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new uu0(n10));
                MessageObject messageObject = this.Q4;
                if (messageObject != null) {
                    messageObject.cachedSavedTimestamp = Float.valueOf(n10);
                }
            }
            this.C2.H();
            this.C2 = null;
        } else {
            this.U2 = false;
        }
        if (this.f31689c0 != null) {
            AndroidUtilities.cancelRunOnUIThread(ls0Var);
            if (this.Z2 != null) {
                float o12 = ((float) o1()) / ((float) A1());
                String str2 = this.Z2;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new uu0(o12));
                MessageObject messageObject2 = this.Q4;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(o12);
                }
            }
        }
        zs0 zs0Var = this.T3;
        if (zs0Var != null) {
            zs0Var.disable();
            this.T3 = null;
        }
        this.f31807p3.a();
        m3(false, false);
        this.f31797o2 = false;
        this.R2 = false;
        if (this.f31833s0.isEnabled()) {
            this.f31833s0.setEnabled(false);
            this.f31833s0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f31709e3) {
            try {
                this.f31887y.getWindow().clearFlags(128);
                this.f31709e3 = false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        et0 et0Var = this.f31860v2;
        if (et0Var != null) {
            try {
                this.f31679b0.removeView(et0Var);
            } catch (Throwable unused) {
            }
            this.f31860v2 = null;
        }
        s0();
        this.f31870w2 = null;
        TextureView textureView = this.f31890y2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.w61) {
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) textureView;
                org.telegram.ui.Components.vz vzVar = w61Var.f30156b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.sz(vzVar, 0));
                }
                w61Var.f30155a = null;
            }
            this.f31890y2 = null;
        }
        this.Y.e();
        if (this.f31899z2 != null) {
            this.f31899z2 = null;
        }
        if (this.M3) {
            this.M3 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31710e4);
        }
        if (!z4 && !this.f31886x8 && !this.f31896y8) {
            P2(false, true);
        }
        mu0 mu0Var = this.T0[0];
        while (true) {
            float[] fArr = mu0Var.f36214n;
            if (i10 < fArr.length) {
                mu0Var.f36213m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                mu0Var.a();
                return;
            }
        }
    }

    public final void n3(boolean z4) {
        float f10;
        if (z4) {
            this.U0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31867w = animatorSet;
        nd ndVar = this.U0;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ndVar, property, f10));
        this.f31867w.setDuration(200L);
        this.f31867w.addListener(new ft0(this, z4, 1));
        this.f31867w.start();
    }

    public final void o0(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        MediaController.CropState cropState;
        if (this.f31782m6 != null) {
            f14 = AndroidUtilities.lerp(0.0f, this.f31703d6, this.f31748i6);
            f10 = AndroidUtilities.lerp(this.X5, this.f31685b6, this.f31748i6);
            f11 = AndroidUtilities.lerp(this.Y5, this.f31694c6, this.f31748i6);
            f12 = AndroidUtilities.lerp(this.V5, this.f31675a6, this.f31748i6);
            f13 = AndroidUtilities.lerp(this.U5, this.Z5, this.f31748i6);
        } else {
            f10 = this.X5;
            f11 = this.Y5;
            f12 = this.V5;
            f13 = this.U5;
            if (this.f31766k6 != 0) {
                f13 = this.Z5;
                f12 = this.f31675a6;
                f10 = this.f31685b6;
            }
            f14 = 0.0f;
        }
        int k12 = k1(this.f31827r4);
        int i12 = i1();
        canvas.translate(b1(this.f31827r4), c1(this.f31827r4));
        canvas.translate(f13, f12 + 0.0f);
        canvas.scale(f10, f10);
        canvas.rotate(f11);
        int bitmapWidth = this.z4.getBitmapWidth();
        int bitmapHeight = this.z4.getBitmapHeight();
        float f18 = k12;
        float f19 = bitmapWidth;
        float f20 = f18 / f19;
        float f21 = i12;
        float f22 = bitmapHeight;
        float f23 = f21 / f22;
        float min = Math.min(f20, f23);
        yf.f fVar = this.A1;
        int i10 = fVar.f47278i;
        if (i10 != 90 && i10 != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float f24 = fVar.f47279j;
        float f25 = fVar.f47280k;
        float f26 = bitmapHeight;
        float f27 = bitmapWidth;
        float f28 = f10;
        float f29 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        float f30 = f18 / f29;
        float f31 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        if (f30 * f31 > f21) {
            f30 = f21 / f31;
        }
        int i11 = this.Z1;
        float f32 = f30;
        eu0 eu0Var = this.U4;
        if (i11 != 1 && ((this.f31827r4 != 1 || this.f31774l6 == 0) && eu0Var.f33855c != null)) {
            float f33 = f29 * f32;
            float f34 = f31 * f32;
            if (f20 * f22 > f21) {
                f20 = f23;
            }
            float w10 = e2.c.w((f19 * f20) / f28, f33, 0.0f, f33);
            float w11 = e2.c.w((f22 * f20) / f28, f34, 0.0f, f34);
            canvas.clipRect((-w10) / 2.0f, (-w11) / 2.0f, w10 / 2.0f, w11 / 2.0f);
        }
        if (this.Z1 == 1 || fVar.f47273a) {
            TextureView textureView = this.f31890y2;
            if (textureView != null) {
                MediaController.CropState cropState2 = eu0Var.f33855c;
                if (cropState2 != null && cropState2.mirrored) {
                    f16 = -1.0f;
                } else {
                    f16 = 1.0f;
                }
                textureView.setScaleX(f16);
                hu0 hu0Var = this.B2;
                if (hu0Var != null) {
                    hu0Var.setScaleX(this.f31890y2.getScaleX());
                }
            }
            MediaController.CropState cropState3 = eu0Var.f33855c;
            if (cropState3 != null) {
                f15 = cropState3.cropScale;
            } else {
                f15 = 1.0f;
            }
            float w12 = ((f32 / min) / e2.c.w(f15, 1.0f, 0.0f, 1.0f)) * f15;
            canvas.translate(fVar.d * 1.0f, fVar.e * 1.0f);
            canvas.scale(w12, w12);
            canvas.translate(e2.c.z(fVar.f47274b, f26, min, 1.0f), e2.c.z(fVar.f47275c, f27, min, 1.0f));
            float f35 = fVar.f47277g + i10;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            canvas.rotate(f35);
        }
        if (!this.f31704d7.isEmpty() && (cropState = eu0Var.f33855c) != null && cropState.mirrored) {
            f17 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f17 = 1.0f;
        }
        if (f14 > 0.0f) {
            canvas.scale(f17 - (2.0f * f14), f17);
            canvas.skew(0.0f, org.telegram.messenger.y3.y(f17, f14, 4.0f * f14, 0.25f));
        }
    }

    public final long o1() {
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null && ut0Var.f30245x) {
            return ut0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.n();
    }

    public final void o2() {
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.customStickerCreated);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.mediaCountDidLoad);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.replaceMessagesObjects);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.dialogDeleted);
        ConnectionsManager.getInstance(this.Q).cancelRequestsForGuid(this.f31688c);
    }

    public final void o3(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        int i10 = this.Z1;
        if (i10 == 0 || i10 == 4) {
            CheckBox checkBox = this.K0;
            Property property = View.ALPHA;
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f10));
            CheckBox checkBox2 = this.K0;
            Property property2 = View.TRANSLATION_Y;
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = -dpf2;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f11));
            CounterView counterView = this.L0;
            if (!z4) {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f12));
            CounterView counterView2 = this.L0;
            if (!z4) {
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
        if (!this.L6 && this.K0.getVisibility() != 0) {
            boolean[] zArr = this.f31842t1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f31679b0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.f31892y4.hasImageSet()) {
                        zArr[0] = true;
                        this.f31679b0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f31679b0.getMeasuredWidth() - min && this.A4.hasImageSet()) {
                    zArr[1] = true;
                    this.f31679b0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.X5 != 1.0f && this.Z1 != 11) {
            this.S6.abortAnimation();
            this.S6.fling(Math.round(this.U5), Math.round(this.V5), Math.round(f10), Math.round(f11), (int) this.B6, (int) this.C6, (int) this.D6, (int) this.E6);
            this.f31679b0.postInvalidate();
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

    public final Size p0() {
        float f10;
        int i10;
        int round;
        int i11;
        if (this.V7 == 1) {
            return new Size(this.Y7, this.Z7);
        }
        int i12 = this.U7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
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
        if (this.Y7 > this.Z7) {
            i10 = this.Y7;
        } else {
            i10 = this.Z7;
        }
        float f11 = f10 / i10;
        if (this.U7 == this.V7 - 1 && f11 >= 1.0f) {
            i11 = this.Y7;
            round = this.Z7;
        } else {
            int round2 = Math.round((this.Y7 * f11) / 2.0f) * 2;
            round = Math.round((this.Z7 * f11) / 2.0f) * 2;
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
        ArrayList arrayList = this.f31686b7;
        if (!arrayList.isEmpty()) {
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
            }
            return (TLObject) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.X6;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.Z6;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.Y6;
            if (arrayList4.get(i10) == null) {
                return null;
            }
            return ((ImageLocation) arrayList4.get(i10)).location;
        }
        ArrayList arrayList5 = this.V6;
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
        boolean z4;
        boolean z10;
        boolean z11;
        if (this.f31857u8 != null) {
            MediaController.getInstance().cancelVideoConvert(this.f31857u8);
        }
        if (this.f31896y8 && !this.f31866v8) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f31896y8 = false;
        this.f31876w8 = false;
        this.M7.setVisibility(4);
        if (i10 == 1) {
            if (this.f31687b8 == this.Z7 && this.f31677a8 == this.Y7) {
                this.f31866v8 = false;
                mu0 mu0Var = this.T0[0];
                if (mu0Var.h != 0 && mu0Var.f36211k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                mu0Var.f(0.0f, z11);
                this.T0[0].d(3, false, true);
                if (!z4) {
                    k2(this.S4, this.T4, false, false, this.U4.d, false, 0L);
                    this.C2.K(this.O7.getLeftProgress() * this.f31713e8);
                } else {
                    this.f31876w8 = true;
                }
            } else {
                n2(false);
                if (this.f31857u8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f19180id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.B5;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.f31857u8 = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.f31857u8.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.f31857u8.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.X7;
                    videoEditedInfo.originalWidth = this.Y7;
                    this.f31857u8.videoEditedInfo.originalHeight = this.Z7;
                    VideoEditedInfo videoEditedInfo2 = this.f31857u8.videoEditedInfo;
                    videoEditedInfo2.framerate = this.f31723f8;
                    Uri uri = this.T4;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
                }
                VideoEditedInfo videoEditedInfo3 = this.f31857u8.videoEditedInfo;
                long j10 = this.f31750i8;
                videoEditedInfo3.startTime = j10;
                long j11 = this.f31759j8;
                videoEditedInfo3.endTime = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f31713e8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    videoEditedInfo3.endTime = j10 + 5000000;
                }
                videoEditedInfo3.bitrate = this.f31696c8;
                this.f31857u8.videoEditedInfo.resultWidth = this.f31677a8;
                this.f31857u8.videoEditedInfo.resultHeight = this.f31687b8;
                VideoEditedInfo videoEditedInfo4 = this.f31857u8.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.f31713e8 * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.f31857u8, true, true, true)) {
                    this.f31866v8 = true;
                }
                this.f31896y8 = true;
                mu0 mu0Var2 = this.T0[0];
                if (mu0Var2.h != 0 && mu0Var2.f36211k != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mu0Var2.f(0.0f, z10);
                this.T0[0].d(0, false, true);
            }
        } else {
            this.f31866v8 = false;
            this.T0[0].d(3, false, true);
            if (i10 == 2) {
                k2(this.S4, this.T4, false, false, this.U4.d, false, 0L);
                this.C2.K(this.O7.getLeftProgress() * this.f31713e8);
            }
        }
        this.f31679b0.invalidate();
    }

    public final void p3(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z4 != this.H) {
            if (z4) {
                this.l1.setVisibility(0);
            }
            this.H = z4;
            this.l1.setEnabled(z4);
            float f14 = 1.0f;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                wu0 wu0Var = this.l1;
                Property property = View.ALPHA;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wu0Var, property, f12));
                wu0 wu0Var2 = this.l1;
                Property property2 = View.TRANSLATION_Y;
                if (z4) {
                    f13 = 0.0f;
                } else {
                    f13 = -AndroidUtilities.dp(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(wu0Var2, property2, f13));
                CounterView counterView = this.L0;
                Property property3 = View.ROTATION_X;
                if (!z4) {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f14));
                AnimatorSet animatorSet = new AnimatorSet();
                this.f31889y1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z4) {
                    this.f31889y1.addListener(new us0(this, 4));
                }
                this.f31889y1.setDuration(200L);
                this.f31889y1.start();
                return;
            }
            wu0 wu0Var3 = this.l1;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            wu0Var3.setAlpha(f10);
            wu0 wu0Var4 = this.l1;
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(10.0f);
            }
            wu0Var4.setTranslationY(f11);
            CounterView counterView2 = this.L0;
            if (!z4) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z4) {
                this.l1.setVisibility(8);
            }
        }
    }

    public final boolean q0(MotionEvent motionEvent) {
        boolean z4;
        ut0 ut0Var;
        if (this.C2 != null || ((ut0Var = this.f31689c0) != null && ut0Var.f30245x)) {
            if (motionEvent.getX() >= (k1(this.f31827r4) / 3) * 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            long o12 = o1();
            long A1 = A1();
            if (o12 != -9223372036854775807L && A1 > 15000 && (!z4 || A1 - o12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final float q2() {
        return r2(true);
    }

    public final void q3() {
        boolean z4;
        org.telegram.ui.Components.i71 i71Var;
        org.telegram.ui.Components.i71 i71Var2;
        ut0 ut0Var;
        org.telegram.ui.Components.i71 i71Var3 = this.C2;
        if (i71Var3 == null && ((ut0Var = this.f31689c0) == null || !ut0Var.f30245x)) {
            return;
        }
        if (i71Var3 != null) {
            z4 = this.M3;
        } else {
            z4 = this.f31689c0.D;
        }
        u0();
        AndroidUtilities.cancelRunOnUIThread(this.f31851u2);
        if (z4) {
            g2();
        } else {
            if (this.f31796o1) {
                if (Math.abs(this.O7.getProgress() - this.O7.getRightProgress()) < 0.01f || ((i71Var2 = this.C2) != null && i71Var2.n() == this.C2.p())) {
                    u2(this.O7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f31789n3.c() - this.O7.getRightProgress()) < 0.01f || ((i71Var = this.C2) != null && i71Var.n() == this.C2.p())) {
                    u2(0.0f);
                }
                s2();
            }
            i2();
        }
        this.f31679b0.invalidate();
    }

    public final boolean r0() {
        zn znVar = this.f31746i4;
        if (znVar != null) {
            if (znVar.f40575f == null) {
                TLRPC.Chat chat = znVar.e;
                if (chat != null && !ChatObject.isNotInChat(chat)) {
                    if (ChatObject.canSendPhoto(this.f31746i4.e) || ChatObject.canSendVideo(this.f31746i4.e)) {
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
            ArrayList arrayList = this.f31686b7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    SecureDocument secureDocument = (SecureDocument) arrayList.get(i10);
                    StringBuilder sb = new StringBuilder();
                    sb.append(secureDocument.secureFile.dc_id);
                    sb.append("_");
                    return android.support.v4.media.a.q(sb, secureDocument.secureFile.f19294id, ".jpg");
                }
                return null;
            }
            ArrayList arrayList2 = this.X6;
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.V6;
            if (isEmpty && arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.f31704d7;
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
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(Utilities.MD5(botInlineResult.content.url));
                                sb2.append(".");
                                TLRPC.WebDocument webDocument = botInlineResult.content;
                                sb2.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                                return sb2.toString();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                ku0 ku0Var = this.f31731g7;
                if (ku0Var != null) {
                    return ku0Var.c(i10);
                }
                return null;
            } else if (!arrayList2.isEmpty()) {
                if (i10 < arrayList2.size()) {
                    ImageLocation imageLocation = (ImageLocation) arrayList2.get(i10);
                    ImageLocation imageLocation2 = (ImageLocation) this.Y6.get(i10);
                    if (imageLocation != null) {
                        if (imageLocation2 != null && imageLocation2 != imageLocation) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(imageLocation2.location.volume_id);
                            sb3.append("_");
                            return android.support.v4.media.a.m(imageLocation2.location.local_id, ".mp4", sb3);
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(imageLocation.location.volume_id);
                        sb4.append("_");
                        return android.support.v4.media.a.m(imageLocation.location.local_id, ".jpg", sb4);
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

    public final float r2(boolean z4) {
        int i10;
        if (this.Z1 == 11) {
            int k12 = k1(this.f31827r4);
            if (k12 == 0) {
                k12 = AndroidUtilities.displaySize.x;
            }
            float C = b.C(20.0f, k12, 1) / k12;
            if (z4) {
                int bitmapWidth = this.z4.getBitmapWidth();
                int bitmapHeight = this.z4.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i10 = this.M4) >= 0) {
                    ArrayList arrayList = this.f31704d7;
                    if (i10 < arrayList.size()) {
                        Object obj = arrayList.get(this.M4);
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
        View view = this.Q3;
        if (view != null) {
            mu0 mu0Var = this.T0[0];
            int i10 = mu0Var.h;
            if (mu0Var.f36216p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
                if (i10 == 3) {
                    view.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                } else if (i10 == 2) {
                    view.setContentDescription(LocaleController.getString("AccActionDownload", R.string.AccActionDownload));
                } else if (i10 == 1) {
                    view.setContentDescription(LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload));
                } else {
                    view.setContentDescription(LocaleController.getString("AccActionPause", R.string.AccActionPause));
                }
                this.Q3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void s0() {
        AnimatorSet animatorSet;
        View view = this.f31870w2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f31870w2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.f31880x2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f31880x2 = null;
        }
        org.telegram.ui.Components.ze0 ze0Var = this.f31898z1;
        if (ze0Var != null && (animatorSet = ze0Var.f31377s) != null) {
            animatorSet.cancel();
            ze0Var.f31377s = null;
            ze0Var.f31374f = false;
        }
    }

    public final ImageLocation s1(int i10, long[] jArr) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f31686b7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((SecureDocument) arrayList.get(i10)).secureFile.size;
                    }
                    return ImageLocation.getForSecureDocument((SecureDocument) arrayList.get(i10));
                }
            } else {
                ArrayList arrayList2 = this.X6;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.Z6;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (ImageLocation) this.Y6.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.V6;
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
                                    if (this.f31901z5 == 5) {
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
            MessageObject messageObject = this.Q4;
            if (messageObject == null || !messageObject.isSponsored()) {
                ls0 ls0Var = this.f31851u2;
                AndroidUtilities.cancelRunOnUIThread(ls0Var);
                AndroidUtilities.runOnUIThread(ls0Var, 3000);
            }
        }
    }

    public final void s3() {
        if (this.f31878x0 != null && this.J != null) {
            float f10 = 0.0f;
            for (int i10 = 0; i10 < this.f31878x0.getChildCount(); i10++) {
                View childAt = this.f31878x0.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f10 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f10;
                }
            }
            CheckBox checkBox = this.K0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f10 = Math.max(f10, AndroidUtilities.dp(48.0f));
            }
            CounterView counterView = this.L0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f10 = Math.max(f10, AndroidUtilities.dp(100.0f));
            }
            nu0 nu0Var = this.J;
            ValueAnimator valueAnimator = nu0Var.f36587n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nu0Var.f36587n = null;
            }
            nu0Var.f36588r = f10;
            nu0Var.f36585c[0].setRightPadding((int) f10);
            nu0Var.d.setRightPadding(f10);
        }
    }

    public void setAnimationValue(float f10) {
        this.f31748i6 = f10;
        this.f31679b0.invalidate();
        F1();
    }

    public final void t0() {
        if (this.Z1 == 11) {
            zt0 zt0Var = this.f31818q5;
            if (zt0Var.f4435g0 == 2) {
                zt0Var.setCutOutState(true);
                X2(true, true);
                this.f31781m5.f();
                this.f31679b0.invalidate();
            }
        }
    }

    public final void t2(long j10) {
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null && ut0Var.f30245x) {
            ut0Var.i(j10);
        } else {
            org.telegram.ui.Components.i71 i71Var = this.C2;
            if (i71Var != null) {
                i71Var.K(j10);
            }
        }
        C3();
    }

    public final void t3(Object obj) {
        CharSequence charSequence;
        boolean z4;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f31783m7) {
            charSequence = this.f31793n7;
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
            f1().setText(org.telegram.ui.Components.u5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.ut editText = f1().f41842f.getEditText();
        zn znVar = this.f31746i4;
        if (znVar != null && ((encryptedChat = znVar.h) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101)) {
            z4 = true;
        } else {
            z4 = false;
        }
        editText.setAllowTextEntitiesIntersection(z4);
    }

    public final void u0() {
        Runnable runnable = this.F2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.F2 = null;
        }
    }

    public final int u1() {
        return this.f31806p2.left;
    }

    public final void u2(float f10) {
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            i71Var.K(f10 * ((float) i71Var.p()));
            return;
        }
        ut0 ut0Var = this.f31689c0;
        if (ut0Var != null) {
            ut0Var.i(f10 * ut0Var.getVideoDuration());
        }
    }

    public final void u3() {
        int i10 = org.telegram.ui.ActionBar.j6.f20279zf;
        int z12 = z1(i10);
        org.telegram.ui.Components.pp0 pp0Var = this.P0;
        if (pp0Var != null) {
            pp0Var.k();
            this.P0.invalidate();
        }
        CheckBox checkBox = this.K0;
        if (checkBox != null) {
            checkBox.c(z1(i10), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(z12, mode);
        ImageView imageView = this.V0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.V0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.W0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.W0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.Z0;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.Y0;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.X0;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.X0.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Components.yf0 yf0Var = this.R0;
        if (yf0Var != null) {
            yf0Var.f31011b.setTextColor(z12);
        }
        org.telegram.ui.Components.yf0 yf0Var2 = this.L7;
        if (yf0Var2 != null) {
            yf0Var2.f31011b.setTextColor(z12);
        }
        mt0 mt0Var = this.I1;
        if (mt0Var != null) {
            mt0Var.e();
        }
        org.telegram.ui.Components.of0 of0Var = this.F1;
        if (of0Var != null) {
            ImageView imageView6 = of0Var.f27556y0;
            ImageView imageView7 = of0Var.f27554x0;
            ImageView imageView8 = of0Var.f27552w0;
            org.telegram.ui.ActionBar.f6 f6Var = of0Var.F0;
            TextView textView = of0Var.f27529d0;
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
            of0Var.h();
        }
        ms0 ms0Var = this.R1;
        if (ms0Var != null) {
            ms0Var.H(this.f31835s2);
        }
        ns0 ns0Var = this.S1;
        if (ns0Var != null) {
            ns0Var.H(this.f31835s2);
        }
        js0 js0Var = this.O7;
        if (js0Var != null) {
            js0Var.invalidate();
        }
        wu0 wu0Var = this.l1;
        if (wu0Var != null) {
            int childCount = wu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.l1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.y5) {
                    ((org.telegram.ui.Cells.y5) childAt).f22593c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
                }
            }
        }
        cs0 cs0Var = this.R3;
        if (cs0Var != null) {
            cs0Var.z0(true);
        }
    }

    public final void v0() {
        float f10;
        org.telegram.ui.ActionBar.z zVar = this.f31878x0;
        if (zVar != null) {
            if (this.f31691c2) {
                f10 = -AndroidUtilities.dp(4.0f);
            } else {
                f10 = 0.0f;
            }
            zVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.B0;
        if (w0Var != null) {
            I2(w0Var, this.f31691c2, false);
        }
        boolean z4 = this.f31681b2;
        if (z4 && this.F == null) {
            pg.b c3 = this.V.c(this.D, null, false);
            c3.n(rg.b.i(this.f31835s2));
            c3.p(AndroidUtilities.dp(20.0f));
            c3.o(AndroidUtilities.dp(7.0f));
            int dp = AndroidUtilities.dp(54.0f);
            int dp2 = AndroidUtilities.dp(54.0f);
            Matrix matrix = tg.c.f44991a;
            this.F = new org.telegram.ui.ActionBar.v5(dp, dp2, c3);
        }
        if (z4) {
            k7.d6.a(this.D);
            this.D.setBackground(this.F);
            return;
        }
        this.D.setStateListAnimator(null);
        this.D.setBackground(this.E);
    }

    public final TLRPC.Document v1() {
        int i10;
        if (this.U5 == 0.0f && this.V5 == 0.0f && (i10 = this.M4) >= 0) {
            ArrayList arrayList = this.f31704d7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.M4);
                if (!(obj instanceof MediaController.MediaEditState)) {
                    return null;
                }
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                    return this.f31830r7;
                }
            }
        }
        return null;
    }

    public final int v2() {
        if (this.f31821q8 > 1048576000) {
            return this.V7 - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i10 = this.V7;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = globalMainSettings.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        return Math.min(2, Math.round(DownloadController.getInstance(this.Q).getMaxVideoBitrate() / (100.0f / i10)) - 1);
    }

    public final void v3(boolean z4) {
        iu0 iu0Var;
        int i10;
        if (this.Z1 != 1 && (iu0Var = this.f31679b0) != null) {
            if (!z4) {
                if (iu0Var.getPaddingLeft() <= 0 && this.f31679b0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f31679b0.setSystemUiVisibility(i10);
        }
    }

    public final boolean w0() {
        if (this.f31764k4 != 0) {
            F1();
            if (Math.abs(this.f31772l4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f31780m4;
                if (runnable != null) {
                    runnable.run();
                    this.f31780m4 = null;
                }
                this.f31764k4 = 0;
            }
        }
        if (this.f31764k4 == 0) {
            return false;
        }
        return true;
    }

    public final RenderNode w1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j10;
        if (this.G8 == null) {
            renderNode = null;
        } else {
            renderNode = this.H8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = ng.e.a(AndroidUtilities.dp(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a2, a2, Shader.TileMode.CLAMP));
                this.H8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.G8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.G8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.G8.getWidth(), ceil2 / this.G8.getHeight());
                beginRecording.drawRenderNode(this.G8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        g.x xVar = this.I8;
        xVar.f6326a = 0L;
        xVar.f6327b = false;
        for (float f10 : colorMatrix.getArray()) {
            xVar.c(f10);
        }
        xVar.a(0L);
        if (xVar.f6327b) {
            j10 = -1;
        } else {
            j10 = xVar.f6326a;
        }
        RenderNode renderNode2 = (RenderNode) this.J8.f(j10);
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

    public final void w2(final boolean z4, final int i10, final int i11, final boolean z10, final boolean z11, boolean z12) {
        long j10;
        VideoEditedInfo videoEditedInfo;
        String str;
        float f10;
        char c3;
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
        boolean z13;
        int i12;
        zn znVar;
        org.telegram.ui.Components.v40 v40Var;
        String str2;
        long j11;
        String string;
        TextureView textureView;
        if (!H1() && this.d != null && !this.f31825r2) {
            if (this.Z1 == 1) {
                if (!z12 && (v40Var = this.f31770l2) != null) {
                    TLObject tLObject = v40Var.f29378a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j12 = user.f19306id;
                        str2 = str3;
                        j11 = j12;
                    } else {
                        str2 = "";
                        j11 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f31679b0.getContext());
                    int dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.S0 = dp;
                    Context context = this.f31679b0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f39949a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f39950b = imageReceiver2;
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                    view.e = new Path();
                    int i13 = UserConfig.selectedAccount;
                    z8Var.m(i13, UserConfig.getInstance(i13).getCurrentUser());
                    imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), z8Var);
                    imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), z8Var);
                    Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
                    view.f39952f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f31770l2.f29378a;
                    iu0 iu0Var = this.f31679b0;
                    org.telegram.ui.Components.ze0 ze0Var = this.f31898z1;
                    z8Var.p(tLObject2);
                    imageReceiver.setForUserOrChat(tLObject2, z8Var);
                    view.f39951c = iu0Var;
                    view.d = ze0Var;
                    d2Var.S = view;
                    if (this.f31770l2.f29380c == 1) {
                        if (UserConfig.getInstance(this.Q).clientUserId == j11) {
                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage));
                        } else {
                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2));
                        }
                        if (this.F4) {
                            string = LocaleController.getString("SetVideo", R.string.SetVideo);
                        } else {
                            string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                        }
                    } else {
                        if (this.F4) {
                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2));
                        } else {
                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2));
                        }
                        string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                    }
                    String str4 = string;
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new cl0(1));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.c2() {
                        @Override
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i14) {
                            Drawable[] drawableArr = PhotoViewer.Q8;
                            PhotoViewer.this.w2(z4, i10, i11, z10, z11, true);
                        }
                    });
                    d2Var.F = org.telegram.ui.ActionBar.j6.f20106pg;
                    d2Var.Q0 = true;
                    d2Var.i(i0.a.k(-15461356, 204));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
                    d2Var.setOnDismissListener(new ps0(this));
                    if (this.f31796o1 && (textureView = this.f31890y2) != null) {
                        try {
                            this.A3 = textureView.getBitmap();
                            ImageView imageView = this.B3;
                            if (imageView != null) {
                                this.f31860v2.removeView(imageView);
                                this.B3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.f31890y2.getContext());
                            this.B3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.A3));
                            this.f31860v2.addView(this.B3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.f31900z3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.f31900z3 = null;
                            }
                            FileLog.e(th2);
                            return;
                        }
                    }
                    return;
                }
                m0();
            }
            if (!z10 && (znVar = this.f31746i4) != null) {
                TLRPC.Chat chat2 = znVar.e;
                if (znVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                    MessagesController.getNotificationsSettings(this.Q).edit().putBoolean("silent_" + this.f31746i4.a(), !z4).commit();
                }
            }
            VideoEditedInfo n12 = n1();
            ArrayList arrayList = this.f31704d7;
            if (!arrayList.isEmpty() && (i12 = this.M4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.M4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = n12;
                }
            }
            zn znVar2 = this.f31746i4;
            if (znVar2 != null && (chat = znVar2.e) != null) {
                if (!this.f31796o1 && n12 == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13 && !ChatObject.canSendVideo(chat)) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new org.telegram.ui.Components.qc(this.f31679b0, this.f31835s2), null);
                    return;
                } else if (!z13 && !ChatObject.canSendPhoto(this.f31746i4.e)) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new org.telegram.ui.Components.qc(this.f31679b0, this.f31835s2), null);
                    return;
                }
            }
            this.f31825r2 = true;
            if (n12 != null) {
                long j13 = ((float) n12.estimatedSize) * 0.9f;
                if ((j13 > 2097152000 && !UserConfig.getInstance(this.Q).isPremium()) || j13 > 4194304000L) {
                    if (this.X1 != null) {
                        org.telegram.ui.Components.li liVar = this.X1;
                        new eg.v0(6, UserConfig.selectedAccount, liVar.getContainer().getContext(), liVar.f26685c0, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z10) {
                if (this.Z1 == 11) {
                    Object obj2 = arrayList.get(this.M4);
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
                        int k12 = k1(this.f31827r4);
                        i1();
                        float dp2 = k12 - AndroidUtilities.dp(20.0f);
                        dg.q3 q3Var = this.f31781m5;
                        if (q3Var != null && q3Var.f4753f0 && q3Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f31781m5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.z4.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.f31781m5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            this.z4.draw(canvas);
                            canvas.restore();
                        }
                        if (this.f31862v4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / dp2, createBitmap.getHeight() / dp2);
                            o0(canvas);
                            canvas.translate((-this.z4.getImageWidth()) / 2.0f, (-this.z4.getImageHeight()) / 2.0f);
                            j10 = 0;
                            canvas.scale(this.z4.getImageWidth() / this.f31862v4.getMeasuredWidth(), this.z4.getImageHeight() / this.f31862v4.getMeasuredHeight());
                            this.f31862v4.e = !B1();
                            this.f31862v4.draw(canvas);
                            this.f31862v4.e = true;
                            canvas.restore();
                        } else {
                            j10 = 0;
                        }
                        if (B1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = dp2 / 2.0f;
                            matrix.preTranslate(f18, f18);
                            if (this.f31782m6 != null) {
                                f15 = AndroidUtilities.lerp(0.0f, this.f31703d6, this.f31748i6);
                                f11 = AndroidUtilities.lerp(this.X5, this.f31685b6, this.f31748i6);
                                f10 = 2.0f;
                                f12 = AndroidUtilities.lerp(this.Y5, this.f31694c6, this.f31748i6);
                                c3 = 0;
                                f13 = AndroidUtilities.lerp(this.V5, this.f31675a6, this.f31748i6);
                                f14 = AndroidUtilities.lerp(this.U5, this.Z5, this.f31748i6);
                            } else {
                                f10 = 2.0f;
                                c3 = 0;
                                f11 = this.X5;
                                f12 = this.Y5;
                                f13 = this.V5;
                                f14 = this.U5;
                                if (this.f31766k6 != j10) {
                                    f14 = this.Z5;
                                    f13 = this.f31675a6;
                                    f11 = this.f31685b6;
                                }
                                f15 = 0.0f;
                            }
                            int k13 = k1(this.f31827r4);
                            int i14 = i1();
                            matrix.preTranslate(f14, f13 + 0.0f);
                            matrix.preScale(f11, f11);
                            matrix.preRotate(f12);
                            int bitmapWidth = this.z4.getBitmapWidth();
                            int bitmapHeight = this.z4.getBitmapHeight();
                            float f19 = k13;
                            float f20 = i14;
                            float min = Math.min(f19 / bitmapWidth, f20 / bitmapHeight);
                            yf.f fVar = this.A1;
                            int i15 = fVar.f47278i;
                            if (i15 != 90 && i15 != 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            float f21 = fVar.f47279j;
                            float f22 = fVar.f47280k;
                            float f23 = bitmapHeight;
                            float f24 = bitmapWidth;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i16 = this.Z1;
                            eu0 eu0Var = this.U4;
                            if (i16 == 1 || fVar.f47273a) {
                                TextureView textureView2 = this.f31890y2;
                                if (textureView2 != null) {
                                    MediaController.CropState cropState3 = eu0Var.f33855c;
                                    if (cropState3 != null && cropState3.mirrored) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    hu0 hu0Var = this.B2;
                                    if (hu0Var != null) {
                                        hu0Var.setScaleX(this.f31890y2.getScaleX());
                                    }
                                }
                                MediaController.CropState cropState4 = eu0Var.f33855c;
                                if (cropState4 != null) {
                                    f16 = cropState4.cropScale;
                                } else {
                                    f16 = 1.0f;
                                }
                                float w10 = ((f25 / min) / e2.c.w(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(fVar.d * 1.0f, fVar.e * 1.0f);
                                matrix.preScale(w10, w10);
                                matrix.preTranslate(e2.c.z(fVar.f47274b, f23, min, 1.0f), e2.c.z(fVar.f47275c, f24, min, 1.0f));
                                float f27 = fVar.f47277g + i15;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (cropState2 = eu0Var.f33855c) != null && cropState2.mirrored) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f15 > 0.0f) {
                                matrix.preScale(1.0f - (f15 * f10), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.y3.y(1.0f, f15, 4.0f * f15, 0.25f));
                            }
                            matrix.preTranslate((-this.z4.getImageWidth()) / f10, (-this.z4.getImageHeight()) / f10);
                            matrix.preScale(this.z4.getImageWidth(), this.z4.getImageHeight());
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = photoEntry.mediaEntities;
                            int size = arrayList3.size();
                            String str5 = null;
                            int i17 = 0;
                            while (i17 < size) {
                                VideoEditedInfo.MediaEntity mediaEntity = arrayList3.get(i17);
                                i17++;
                                VideoEditedInfo.MediaEntity copy = mediaEntity.copy();
                                float f28 = copy.f16673x;
                                float f29 = copy.f16674y;
                                float f30 = copy.width + f28;
                                float f31 = copy.height + f29;
                                float f32 = dp2;
                                float[] fArr = new float[8];
                                fArr[c3] = f28;
                                fArr[1] = f29;
                                fArr[2] = f30;
                                fArr[3] = f29;
                                fArr[4] = f30;
                                fArr[5] = f31;
                                fArr[6] = f28;
                                fArr[7] = f31;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                copy.width = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[c3] - fArr[2], 2.0d))) / f32;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[c3] - fArr[6], 2.0d))) / f32;
                                copy.height = sqrt;
                                copy.f16673x = (((fArr[c3] + fArr[4]) / f10) / f32) - (copy.width / f10);
                                copy.f16674y = (((fArr[1] + fArr[5]) / f10) / f32) - (sqrt / f10);
                                copy.scale = 1.0f;
                                copy.customTextView = true;
                                if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                    copy.rotation = (float) (copy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                                }
                                copy.rotation = (float) (copy.rotation - ((this.Y5 / 180.0f) * 3.141592653589793d));
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
                        if (this.f31800o5 == null) {
                            this.f31800o5 = new ArrayList();
                        }
                        if (this.f31800o5.isEmpty()) {
                            String str6 = this.f31781m5.W;
                            if (str6 != null && Emoji.getEmojiDrawable(str6) != null) {
                                this.f31800o5.add(this.f31781m5.W);
                            } else if (str != null) {
                                this.f31800o5.add(str);
                            } else {
                                this.f31800o5.add("👍");
                            }
                        }
                        this.f31825r2 = false;
                        rt q10 = rt.q();
                        dg.q3 q3Var2 = this.f31781m5;
                        ArrayList arrayList4 = this.f31800o5;
                        qs0 qs0Var = new qs0(this, file, videoEditedInfo, photoEntry, z4, i10, i11, z11);
                        nt ntVar = q10.U;
                        Activity findActivity = AndroidUtilities.findActivity(q3Var2.getContext());
                        if (findActivity != null) {
                            q10.w(findActivity);
                            q10.v(qs0Var);
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.path = file;
                            importingSticker.videoEditedInfo = videoEditedInfo;
                            q10.f38043o = arrayList4;
                            q10.t(null, importingSticker, null, null, null, 3, false, null, new nh.b(), 0);
                            AndroidUtilities.cancelRunOnUIThread(ntVar);
                            AndroidUtilities.runOnUIThread(ntVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.M4, n12, z4, i10, i11, z11);
            } else {
                this.d.L(n12);
            }
            if (this.L) {
                if (this.M) {
                    AndroidUtilities.runOnUIThread(new nr0(this, 0), 200L);
                } else {
                    G0(false, false);
                }
            }
        }
    }

    public final void w3(float f10) {
        int k12;
        int i12;
        boolean z4;
        View view;
        et0 et0Var = this.f31860v2;
        if (et0Var != null && et0Var.getVisibility() == 0 && this.E3) {
            if (this.A2) {
                view = this.f31899z2;
            } else {
                view = this.f31890y2;
            }
            f10 *= Math.min(k1(this.f31827r4) / view.getMeasuredWidth(), i1() / view.getMeasuredHeight());
        }
        float imageWidth = this.z4.getImageWidth();
        float imageHeight = this.z4.getImageHeight();
        MediaController.CropState cropState = this.U4.f33855c;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        if (this.Z1 == 11) {
            k12 = (int) (imageWidth * f10);
        } else {
            k12 = ((int) ((imageWidth * f10) - k1(this.f31827r4))) / 2;
        }
        if (this.Z1 == 11) {
            i12 = (int) (imageHeight * f10);
        } else {
            i12 = ((int) ((imageHeight * f10) - i1())) / 2;
        }
        float f11 = 0.0f;
        if (k12 > 0) {
            this.B6 = -k12;
            this.C6 = k12;
        } else {
            this.C6 = 0.0f;
            this.B6 = 0.0f;
        }
        if (i12 > 0) {
            this.D6 = -i12;
            this.E6 = i12;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        mt0 mt0Var = this.I1;
        if (mt0Var != null) {
            if (f10 <= 1.1f) {
                z4 = true;
            } else {
                z4 = false;
            }
            LinearLayout linearLayout = mt0Var.f4493u1;
            boolean z10 = !z4;
            if (mt0Var.V1 != z10) {
                mt0Var.V1 = z10;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z4) {
                    f11 = 1.0f;
                }
                b.p(animate.alpha(f11), org.telegram.ui.Components.mr.h, 240L);
            }
        }
    }

    public final void x0(boolean z4) {
        View view;
        float x10;
        float y10;
        float f10;
        float f11;
        if (z4) {
            TextureView textureView = this.f31844t3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new ci(this, 4));
                this.f31844t3.invalidate();
            }
        } else if (this.D3 == 2) {
            ImageView imageView = this.f31852u3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f31852u3.setImageDrawable(null);
                Bitmap bitmap = this.f31900z3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.f31900z3 = null;
                }
            }
            this.I3 = false;
            if (this.A2) {
                view = this.f31899z2;
            } else {
                view = this.f31890y2;
            }
            et0 et0Var = this.f31860v2;
            if (et0Var != null) {
                int[] iArr = this.f31881x3;
                et0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f31679b0.getTranslationY());
                ImageView imageView2 = this.f31852u3;
                Rect rect = this.f31806p2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f31860v2.getX());
                }
                hu0 hu0Var = this.B2;
                if (hu0Var != null) {
                    hu0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new sq0(this, 4));
                if (this.A2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f31860v2.getX();
                }
                if (this.A2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f31860v2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f31852u3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f31852u3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f31852u3;
                Property property3 = View.TRANSLATION_X;
                if (this.A2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f31852u3;
                Property property4 = View.TRANSLATION_Y;
                if (this.A2) {
                    f11 = 0.0f;
                } else {
                    f11 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f11));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x10));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y10));
                arrayList.add(ObjectAnimator.ofInt(this.I0, org.telegram.ui.Components.n6.d, 255));
                hu0 hu0Var2 = this.B2;
                if (hu0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(hu0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.B2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.B2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.B2, property4, y10));
                }
                org.telegram.ui.Components.mg0.o(this.f31860v2.getAspectRatio(), false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ag.a(21, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.f31899z2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new sr0(this, view, 0));
                animatorSet.start();
                xt0 xt0Var = new xt0();
                xt0Var.f40069c = false;
                xt0Var.d = false;
                xt0Var.f40067a = 250;
                xt0Var.f40068b = decelerateInterpolator;
                k3(true, true, xt0Var);
                this.D3 = 0;
            }
        }
    }

    public final int x1() {
        return this.f31806p2.right;
    }

    public final void x2(org.telegram.ui.Components.v40 v40Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f31770l2 = v40Var;
        if (this.Z1 == 1) {
            if (E3()) {
                this.f31760k0.setVisibility(0);
                this.P0.setVisibility(8);
            } else {
                this.P0.setVisibility(0);
                this.f31760k0.setVisibility(8);
            }
            if (v40Var != null && (user = v40Var.f29379b) != null && v40Var.f29380c == 1 && this.f31770l2.d) {
                if (v40Var.e) {
                    this.f31898z1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.f31898z1.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
                }
            } else {
                this.f31898z1.setSubtitle(null);
            }
        }
        if (v40Var != null) {
            if (v40Var.f29380c == 2) {
                if (v40Var.e) {
                    str = "SuggestVideo";
                    i10 = R.string.SuggestVideo;
                } else {
                    str = "SuggestPhoto";
                    i10 = R.string.SuggestPhoto;
                }
                O2(LocaleController.getString(str, i10));
            }
            if (v40Var.e) {
                this.P7.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.C.setBackground(null);
            this.C.setElevation(2.0f);
        }
    }

    public final void x3() {
        boolean z4;
        org.telegram.ui.Components.i71 i71Var = this.C2;
        if (i71Var != null) {
            if (!d1.f.u() && !this.f31822r) {
                z4 = false;
            } else {
                z4 = true;
            }
            i71Var.O(z4);
        }
        if (!this.f31732g8) {
            this.f31680b1.setEnabled(false);
            this.f31680b1.setClickable(false);
            this.f31680b1.animate().alpha(0.5f).setDuration(180L).start();
            this.O7.setMode(0);
            return;
        }
        this.f31680b1.setEnabled(true);
        this.f31680b1.setClickable(true);
        this.f31680b1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f31822r) {
            if (this.f31683b4 == null) {
                this.J.a(LocaleController.getString("SoundMuted", R.string.SoundMuted), true);
            }
            org.telegram.ui.Components.nc0 nc0Var = this.f31671a1;
            nc0Var.e = true;
            nc0Var.invalidateSelf();
            if (this.f31725g1.getTag() != null) {
                this.f31725g1.setAlpha(0.5f);
                this.f31725g1.setEnabled(false);
            }
            if (this.Z1 == 1) {
                this.O7.setMaxProgressDiff(9600.0f / this.f31713e8);
                this.O7.setMode(1);
                B3();
                return;
            }
            this.O7.setMaxProgressDiff(1.0f);
            this.O7.setMode(0);
            return;
        }
        this.J.a(this.f31904z8, true);
        org.telegram.ui.Components.nc0 nc0Var2 = this.f31671a1;
        nc0Var2.e = false;
        nc0Var2.invalidateSelf();
        if (this.f31725g1.getTag() != null) {
            this.f31725g1.setAlpha(1.0f);
            this.f31725g1.setEnabled(true);
        }
        this.O7.setMaxProgressDiff(1.0f);
        this.O7.setMode(0);
    }

    public final void y0() {
        qu0 qu0Var = this.f31674a5;
        if (qu0Var != null) {
            qu0Var.f37487a.setVisible(true, true);
        }
        ou0 ou0Var = this.d;
        qu0 qu0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (ou0Var != null) {
            MessageObject messageObject = this.Q4;
            ImageLocation imageLocation = this.W4;
            if (imageLocation != null) {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            qu0Var2 = ou0Var.E(messageObject, tL_fileLocationToBeDeprecated, this.M4, false, false);
        }
        this.f31674a5 = qu0Var2;
        if (qu0Var2 != null && !qu0Var2.f37502s) {
            qu0Var2.f37487a.setVisible(false, true);
        }
    }

    public final void y2(boolean z4) {
        if (this.f31762k2 != z4) {
            this.f31762k2 = z4;
            this.N1.setLayerType(2, null);
            this.N1.getCurrentView().setLayerType(2, null);
            this.N1.getNextView().setLayerType(2, null);
        }
    }

    public final void y3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.y3(int, boolean):void");
    }

    public final void z0() {
        MessageObject messageObject;
        boolean z4;
        int i10;
        TextureView textureView;
        int i11;
        TextureView textureView2;
        float f10;
        MessageObject messageObject2;
        ArrayList arrayList = this.V6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f31861v3;
        if (!isEmpty && ((messageObject = this.Q4) == null || !messageObject.isSponsored())) {
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = this.M4;
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
                        if (messageObject3.isYouTubeVideo() && (messageObject2 = this.Q4) != null && messageObject2.getId() == messageObject3.getId()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i10 = messageObject3.messageOwner.media.webpage.embed_width;
                        } else if (i12 == 0 && (textureView = this.f31890y2) != null) {
                            i10 = textureView.getMeasuredWidth();
                        } else {
                            i10 = 0;
                        }
                        if (z4) {
                            i11 = messageObject3.messageOwner.media.webpage.embed_height;
                        } else if (i12 == 0 && (textureView2 = this.f31890y2) != null) {
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
                                    i10 = documentAttribute.f19166w;
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
                            if (this.G) {
                                imageViewArr[i12].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f31679b0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f31679b0.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f31782m6 != null) {
                            float f11 = this.U5;
                            f10 = ((this.Z5 - f11) * this.f31748i6) + f11;
                        } else {
                            f10 = this.U5;
                        }
                        float f12 = 0.0f;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                f12 = ((-AndroidUtilities.displaySize.x) - AndroidUtilities.dp(15.0f)) + (f10 - this.C6);
                            } else {
                                float f13 = this.B6;
                                if (f10 < f13) {
                                    f12 = f10 - f13;
                                }
                            }
                        }
                        imageViewArr[i12].setTranslationX((f12 + AndroidUtilities.displaySize.x) - AndroidUtilities.dp(48.0f));
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f31835s2;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void z2() {
        org.telegram.ui.Components.w61 w61Var;
        org.telegram.ui.Components.w61 w61Var2;
        if (!this.f31699d2 && this.Z1 == 1) {
            if (!this.f31796o1 || ((w61Var2 = (org.telegram.ui.Components.w61) this.f31890y2) != null && w61Var2.getVideoWidth() > 0 && w61Var2.getVideoHeight() > 0)) {
                this.f31699d2 = true;
                Bitmap bitmap = this.z4.getBitmap();
                int orientation = this.z4.getOrientation();
                if (bitmap == null) {
                    bitmap = this.f31706e0.getBitmap();
                    orientation = this.f31706e0.getOrientation();
                }
                Bitmap bitmap2 = bitmap;
                int i10 = orientation;
                if (bitmap2 != null || this.f31890y2 != null) {
                    org.telegram.ui.Components.ze0 ze0Var = this.f31898z1;
                    if (this.f31796o1) {
                        w61Var = (org.telegram.ui.Components.w61) this.f31890y2;
                    } else {
                        w61Var = null;
                    }
                    ze0Var.b(bitmap2, i10, false, false, this.A1, w61Var, this.U4.f33855c);
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
    public final void z(float f10, int i10) {
    }
}
