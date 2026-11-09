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
public class PhotoViewer implements org.telegram.messenger.ls, org.telegram.ui.Components.z00, org.telegram.ui.Components.y00, te.b {
    public static Drawable[] Y8;
    public static final Paint Z8 = new Paint(2);
    public static final HashMap f41346a9 = new HashMap();
    public static DecelerateInterpolator f41347b9;
    public static Paint f41348c9;
    public static final Property f41349d9;
    public static volatile PhotoViewer f41350e9;
    public static volatile PhotoViewer f41351f9;
    public org.telegram.ui.ActionBar.y A0;
    public org.telegram.ui.Components.rm0 A1;
    public AnimatorSet A2;
    public boolean A3;
    public ImageReceiver A4;
    public boolean A5;
    public float A6;
    public int A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.r0 B0;
    public AnimatorSet B1;
    public TextureView B2;
    public Bitmap B3;
    public ImageReceiver B4;
    public int B5;
    public float B6;
    public ab.b0 B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.r0 C0;
    public org.telegram.ui.Components.gd0 C1;
    public SurfaceView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public long C5;
    public float C6;
    public float C7;
    public String C8;
    public Activity D;
    public org.telegram.ui.ActionBar.r0 D0;
    public final og.g D1;
    public boolean D2;
    public ImageView D3;
    public h2.c D4;
    public long D5;
    public float D6;
    public float D7;
    public final org.telegram.ui.Components.w5 D8;
    public ContextThemeWrapper E;
    public org.telegram.ui.ActionBar.r0 E0;
    public og.g E1;
    public qq0 E2;
    public boolean E3;
    public h2.c E4;
    public ch.o0 E5;
    public float E6;
    public final en0 E7;
    public org.telegram.ui.Components.w5[] E8;
    public org.telegram.ui.Components.r7 F;
    public org.telegram.ui.ActionBar.z0 F0;
    public og.g F1;
    public org.telegram.ui.Components.u51 F2;
    public int F3;
    public h2.c F4;
    public String F5;
    public float F6;
    public Path F7;
    public RectF F8;
    public ImageView G;
    public org.telegram.ui.Components.m7 G0;
    public org.telegram.messenger.ye G1;
    public boolean G2;
    public boolean G3;
    public boolean G4;
    public boolean G5;
    public float G6;
    public Paint G7;
    public RectF G8;
    public Drawable H;
    public d61 H0;
    public org.telegram.messenger.ye H1;
    public Runnable H2;
    public boolean H3;
    public boolean H4;
    public long H5;
    public boolean H6;
    public Paint H7;
    public Matrix H8;
    public ih.c I;
    public d61 I0;
    public org.telegram.ui.Components.td0 I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public LinearGradient I7;
    public float[] I8;
    public boolean J;
    public uq J0;
    public AnimatorSet J1;
    public float J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public LinearGradient J7;
    public RenderNode J8;
    public boolean K;
    public final HashMap K0;
    public fi.q3 K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public Matrix K7;
    public RenderNode K8;
    public AnimatorSet L;
    public final BackgroundDrawable L0;
    public wp0 L1;
    public float L2;
    public boolean L3;
    public final Matrix L4;
    public boolean L5;
    public int L6;
    public Matrix L7;
    public final dh.a L8;
    public vq0 M;
    public final Paint M0;
    public boolean M1;
    public float M2;
    public float M3;
    public final Paint M4;
    public boolean M5;
    public int M6;
    public final int[] M7;
    public final a0.h M8;
    public tq0 N;
    public CheckBox N0;
    public vp0 N1;
    public float N2;
    public long N3;
    public Bitmap N4;
    public boolean N5;
    public boolean N6;
    public zq0 N7;
    public boolean N8;
    public boolean O;
    public CounterView O0;
    public boolean O1;
    public float O2;
    public boolean O3;
    public int O4;
    public final boolean[] O5;
    public boolean O6;
    public org.telegram.ui.Cells.v0 O7;
    public ti.o O8;
    public boolean P;
    public bi.m5 P0;
    public org.telegram.ui.ActionBar.u1 P1;
    public boolean P2;
    public boolean P3;
    public int P4;
    public boolean P5;
    public boolean P6;
    public RadialProgressView P7;
    public ti.p P8;
    public wo0 Q;
    public FrameLayout Q0;
    public nq0 Q1;
    public int Q2;
    public boolean Q3;
    public boolean Q4;
    public boolean Q5;
    public boolean Q6;
    public FrameLayout Q7;
    public float Q8;
    public boolean R;
    public FrameLayout R0;
    public FrameLayout R1;
    public org.telegram.ui.Components.u51 R2;
    public long R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public yo0 R7;
    public boolean R8;
    public Paint S;
    public li.w1 S0;
    public TextView S1;
    public SurfaceTexture S2;
    public View S3;
    public org.telegram.messenger.ij S4;
    public boolean S5;
    public int S6;
    public TextView S7;
    public final RectF S8;
    public int T;
    public org.telegram.ui.Components.wd0 T0;
    public xp0 T1;
    public boolean T2;
    public ro0 T3;
    public VideoAds T4;
    public boolean T5;
    public VelocityTracker T6;
    public AnimatorSet T7;
    public boolean T8;
    public int U;
    public org.telegram.ui.Cells.v0 U0;
    public bp0 U1;
    public boolean U2;
    public int U3;
    public ArrayList U4;
    public boolean U5;
    public Scroller U6;
    public long U7;
    public boolean U8;
    public int V;
    public TextView V0;
    public cp0 V1;
    public boolean V2;
    public org.telegram.ui.Components.pt V3;
    public Uri V4;
    public float V5;
    public final ArrayList V6;
    public long V7;
    public final en0 V8;
    public float W;
    public final xo0[] W0;
    public float W1;
    public boolean W2;
    public int W3;
    public final oq0 W4;
    public float W5;
    public final SparseArray[] W6;
    public long W7;
    public final to0 W8;
    public go0 X;
    public zc X0;
    public k0 X1;
    public boolean X2;
    public int X3;
    public TLRPC.BotInlineResult X4;
    public float X5;
    public final ArrayList X6;
    public volatile int X7;
    public View X8;
    public dh.c Y;
    public ImageView Y0;
    public FrameLayout Y1;
    public boolean Y2;
    public boolean Y3;
    public org.telegram.messenger.hc Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public volatile int Y7;
    public xe.b Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public float Z2;
    public final org.telegram.ui.Cells.j1 Z3;
    public org.telegram.messenger.hc Z4;
    public float Z5;
    public final ArrayList Z6;
    public int Z7;
    public final te.a f41352a = new te.a(0, this, org.telegram.ui.Components.xq.h, 380, false);
    public xe.b f41353a0;
    public ImageView f41354a1;
    public org.telegram.ui.Components.di f41355a2;
    public String f41356a3;
    public final VideoFramesRewinder f41357a4;
    public org.telegram.messenger.ew f41358a5;
    public float f41359a6;
    public final ArrayList f41360a7;
    public int f41361a8;
    public final boolean f41362b;
    public org.telegram.ui.Components.y9 f41363b0;
    public ImageView f41364b1;
    public bg.v0 f41365b2;
    public String f41366b3;
    public final jp0 f41367b4;
    public final String[] f41368b5;
    public float f41369b6;
    public final ArrayList f41370b7;
    public volatile int f41371b8;
    public int f41372c;
    public org.telegram.ui.Components.ca f41373c0;
    public ImageView f41374c1;
    public int f41375c2;
    public long f41376c3;
    public final org.telegram.ui.Cells.f2 f41377c4;
    public yq0 f41378c5;
    public float f41379c6;
    public final ArrayList f41380c7;
    public volatile int f41381c8;
    public wq0 d;
    public WindowManager.LayoutParams f41382d0;
    public org.telegram.ui.Components.xz f41383d1;
    public boolean d2;
    public float f41384d3;
    public CharSequence f41385d4;
    public String f41386d5;
    public float f41387d6;
    public final ArrayList f41388d7;
    public volatile int f41389d8;
    public boolean f41390e;
    public rq0 f41391e0;
    public org.telegram.ui.ActionBar.f0 f41392e1;
    public boolean f41393e2;
    public boolean f41394e3;
    public boolean f41395e4;
    public long f41396e5;
    public float f41397e6;
    public final ArrayList f41398e7;
    public volatile int f41399e8;
    public boolean f41400f;
    public eq0 f41401f0;
    public org.telegram.ui.Components.z70 f41402f1;
    public boolean f41403f2;
    public long f41404f3;
    public boolean f41405f4;
    public String f41406f5;
    public float f41407f6;
    public final ArrayList f41408f7;
    public volatile int f41409f8;
    public xq0 f41410g0;
    public zo0 f41411g1;
    public boolean f41412g2;
    public boolean f41413g3;
    public final ap0 f41414g4;
    public boolean f41415g5;
    public float f41416g6;
    public org.telegram.messenger.hc f41417g7;
    public volatile int f41418g8;
    public int h;
    public ClippingImageView f41419h0;
    public ArrayList f41420h1;
    public boolean f41421h2;
    public er0 f41422h3;
    public final ap0 f41423h4;
    public TL_iv.PageBlock f41424h5;
    public float f41425h6;
    public ar0 h7;
    public float f41426h8;
    public di.b4 f41427i0;
    public ArrayList f41428i1;
    public boolean f41429i2;
    public String f41430i3;
    public final u50 f41431i4;
    public org.telegram.messenger.jc f41432i5;
    public float f41433i6;
    public sq0 i7;
    public int f41434i8;
    public View f41435j0;
    public org.telegram.ui.Components.g51 f41436j1;
    public org.telegram.ui.Components.v5 f41437j2;
    public ValueAnimator j3;
    public final float[][] f41438j4;
    public boolean f41439j5;
    public float f41440j6;
    public final Rect f41441j7;
    public volatile boolean f41442j8;
    public int f41443k0;
    public fi.m3 f41444k1;
    public boolean f41445k2;
    public boolean f41446k3;
    public cn f41447k4;
    public boolean f41448k5;
    public float f41449k6;
    public final h2.f f41450k7;
    public volatile boolean f41451k8;
    public TextView f41452l0;
    public org.telegram.ui.Components.m20 l1;
    public boolean f41453l2;
    public final int[] f41454l3;
    public org.telegram.ui.ActionBar.f2 f41455l4;
    public boolean f41456l5;
    public float f41457l6;
    public bg.v0 f41458l7;
    public long f41459l8;
    public TextView m0;
    public org.telegram.ui.Components.e01 f41460m1;
    public boolean f41461m2;
    public final int[] f41462m3;
    public int f41463m4;
    public boolean f41464m5;
    public long f41465m6;
    public org.telegram.ui.Components.cc f41466m7;
    public long f41467m8;
    public boolean f41468n;
    public TextView f41469n0;
    public UndoView n1;
    public boolean f41470n2;
    public org.telegram.ui.ActionBar.l5 f41471n3;
    public long f41472n4;
    public String f41473n5;
    public int f41474n6;
    public int f41475n7;
    public float f41476n8;
    public org.telegram.ui.ActionBar.r0 f41477o0;
    public dr0 f41478o1;
    public org.telegram.ui.Components.i30 f41479o2;
    public ImageView f41480o3;
    public Runnable o4;
    public tg.c2 f41481o5;
    public AnimatorSet f41482o6;
    public boolean f41483o7;
    public float f41484o8;
    public org.telegram.ui.ActionBar.r0 f41485p0;
    public l4 f41486p1;
    public boolean f41487p2;
    public org.telegram.ui.Components.w51 f41488p3;
    public yq0 f41489p4;
    public org.telegram.ui.Components.vd0 f41490p5;
    public AnimatorSet f41491p6;
    public CharSequence f41492p7;
    public long f41493p8;
    public org.telegram.ui.ActionBar.z0 f41494q0;
    public ImageReceiver f41495q1;
    public org.telegram.messenger.yo f41496q2;
    public n00 f41497q3;
    public yq0 f41498q4;
    public ArrayList f41499q5;
    public org.telegram.ui.Components.a10 f41500q6;
    public boolean f41501q7;
    public long f41502q8;
    public boolean f41503r;
    public org.telegram.ui.ActionBar.v0 f41504r0;
    public boolean f41505r1;
    public boolean f41506r2;
    public lp0 f41507r3;
    public boolean f41508r4;
    public di.b3 f41509r5;
    public boolean f41510r6;
    public ValueAnimator f41511r7;
    public long f41512r8;
    public boolean f41513s;
    public org.telegram.ui.ActionBar.z0 f41514s0;
    public final en0 f41515s1;
    public final Rect f41516s2;
    public AnimatorSet f41517s3;
    public boolean f41518s4;
    public jq0 s5;
    public final DecelerateInterpolator f41519s6;
    public TLRPC.Document f41520s7;
    public long f41521s8;
    public org.telegram.ui.ActionBar.z0 f41522t0;
    public float f41523t1;
    public boolean f41524t2;
    public boolean f41525t3;
    public int f41526t4;
    public LinearLayout f41527t5;
    public float t6;
    public TLRPC.Document f41528t7;
    public long f41529t8;
    public org.telegram.ui.ActionBar.d1 f41530u0;
    public long f41531u1;
    public boolean f41532u2;
    public int f41533u3;
    public final en0 f41534u4;
    public jq0 f41535u5;
    public float f41536u6;
    public boolean f41537u7;
    public long f41538u8;
    public org.telegram.ui.ActionBar.z0 f41539v0;
    public final GradientDrawable[] f41540v1;
    public org.telegram.ui.ActionBar.g6 f41541v2;
    public ti.p f41542v3;
    public int f41543v4;
    public jq0 f41544v5;
    public float f41545v6;
    public boolean f41546v7;
    public float f41547v8;
    public int f41548w;
    public wq f41549w0;
    public final boolean[] f41550w1;
    public final uo0 f41551w2;
    public ImageView f41552w3;
    public String f41553w4;
    public jq0 f41554w5;
    public float f41555w6;
    public org.telegram.messenger.v10 f41556w7;
    public fq0 f41557w8;
    public AnimatorSet f41558x;
    public LinearLayout f41559x0;
    public final float[] f41560x1;
    public final ap0 f41561x2;
    public final ImageView[] f41562x3;
    public org.telegram.ui.Components.tb0 f41563x4;
    public jq0 f41564x5;
    public float f41565x6;
    public final float[] f41566x7;
    public org.telegram.messenger.ij f41567x8;
    public final en0 f41568y;
    public final ArrayList f41569y0;
    public int f41570y1;
    public org.telegram.ui.Components.ge0 f41571y2;
    public boolean f41572y3;
    public org.telegram.ui.Components.tb0 f41573y4;
    public long f41574y5;
    public float f41575y6;
    public final float[] f41576y7;
    public boolean f41577y8;
    public org.telegram.ui.ActionBar.d1 f41578z0;
    public org.telegram.ui.Components.k51 f41579z1;
    public View f41580z2;
    public final int[] f41581z3;
    public org.telegram.ui.Components.tb0 f41582z4;
    public boolean f41583z5;
    public float f41584z6;
    public ObjectAnimator f41585z7;
    public boolean f41586z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f41587g = 0;
        public final RectF f41588a;
        public final RectF f41589b;
        public final Paint f41590c;
        public sn0 d;
        public boolean f41591e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f41588a = new RectF();
            this.f41589b = new RectF();
            Paint paint = new Paint(1);
            this.f41590c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z9;
            PhotoViewer photoViewer = PhotoViewer.this;
            bg.v0 v0Var = photoViewer.f41458l7;
            if (v0Var != null) {
                v0Var.c(!this.f41591e);
            }
            bg.v0 v0Var2 = photoViewer.f41365b2;
            if (v0Var2 != null) {
                v0Var2.c(!this.f41591e);
            }
            org.telegram.ui.Components.di diVar = photoViewer.f41355a2;
            if (diVar != null) {
                boolean z10 = this.f41591e;
                diVar.f33047s2.m(diVar.f33003f4);
                if (diVar.o4 != z10) {
                    diVar.o4 = z10;
                    org.telegram.ui.Components.vh vhVar = diVar.f33047s2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32987a2;
                    if (vhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f31215i1) {
                        if (z10 && !diVar.f33037p4) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f31222n && !chatAttachAlertPhotoLayout.O0) {
                            if (z9) {
                                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.P;
                                if (qlVar != null) {
                                    chatAttachAlertPhotoLayout.f31224o0 = Boolean.valueOf(qlVar.isFrontface());
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
            sn0 sn0Var;
            yq0 yq0Var;
            Drawable[] drawableArr = PhotoViewer.Y8;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f41463m4 != 0 && !org.telegram.messenger.g0.Q1() && (yq0Var = photoViewer.f41378c5) != null && yq0Var.f52169m != null) {
                ClippingImageView clippingImageView = photoViewer.f41419h0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.f41589b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.f31289b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.f31290c;
                rectF.bottom = scaleY - clippingImageView.f31288a;
                if (!rectF.isEmpty()) {
                    rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    Rect bounds = getBounds();
                    float f10 = bounds.right;
                    float f11 = bounds.bottom;
                    for (int i7 = 0; i7 < 4; i7++) {
                        RectF rectF2 = this.f41588a;
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
                        canvas.drawRect(rectF2, this.f41590c);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() != 0 && (sn0Var = this.d) != null) {
                org.telegram.messenger.g0.h3(sn0Var);
                this.d = null;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.D instanceof LaunchActivity) {
                if (photoViewer.f41390e && i7 == 255) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                this.f41591e = z9;
                if (z9) {
                    a();
                } else {
                    org.telegram.messenger.g0.i3(new iq0(this, 0), 70L);
                }
            }
            super.setAlpha(i7);
            this.f41590c.setAlpha(i7);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f41593a;
        public final TextPaint f41594b;
        public final Paint f41595c;
        public int d;
        public int f41596e;
        public final RectF f41597f;
        public int h;
        public float f41598n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f41594b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f41595c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f41597f = new RectF();
            a(0);
        }

        public final void a(int i7) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.g0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f41594b;
            this.f41593a = new StaticLayout("" + Math.max(1, i7), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f41596e = this.f41593a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f41595c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i7 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.k6 k6Var = org.telegram.ui.Components.m6.f35965b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, k6Var, 0), ObjectAnimator.ofInt(textPaint, k6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.k6 k6Var2 = org.telegram.ui.Components.m6.f35965b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, k6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, k6Var2, 0, 255));
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
            return this.f41598n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f41595c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.g0.L(14.0f) + measuredHeight;
            RectF rectF = this.f41597f;
            rectF.set(org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
            if (this.f41593a != null) {
                this.f41594b.setAlpha((int) ((1.0f - this.f41598n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f41598n * org.telegram.messenger.g0.L(5.0f)) + org.telegram.messenger.g0.N(0.2f) + ((getMeasuredHeight() - this.f41596e) / 2));
                this.f41593a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f41598n * 255.0f));
                int centerX = (int) rectF.centerX();
                int v = (int) com.google.android.recaptcha.internal.a.v(1.0f, this.f41598n, org.telegram.messenger.g0.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(org.telegram.messenger.g0.L(5.0f) + centerX, v - org.telegram.messenger.g0.L(5.0f), centerX - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + v, paint);
                canvas.drawLine(centerX - org.telegram.messenger.g0.L(5.0f), v - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + centerX, org.telegram.messenger.g0.L(5.0f) + v, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i7 = this.h;
            if (i7 > 0) {
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.id.G(i7, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(20.0f) + this.d, org.telegram.messenger.g0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f41598n = f10;
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
            f41349d9 = new fo0();
        } else {
            f41349d9 = new org.telegram.ui.Cells.g1(Float.class, "progress", 4);
        }
        f41350e9 = null;
        f41351f9 = null;
    }

    public PhotoViewer() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 30) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41362b = z9;
        this.h = -1;
        this.f41468n = true;
        this.f41568y = new en0(this, 22);
        this.J = true;
        this.O = true;
        this.P = false;
        this.Z = new xe.b();
        this.f41569y0 = new ArrayList();
        this.K0 = new HashMap(3);
        this.L0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.M0 = paint;
        this.W0 = new xo0[3];
        this.f41515s1 = new en0(this, 23);
        this.f41540v1 = new GradientDrawable[2];
        this.f41550w1 = new boolean[2];
        this.f41560x1 = new float[2];
        this.D1 = new Object();
        this.E1 = new Object();
        this.F1 = new Object();
        this.W1 = -8.0f;
        this.f41516s2 = new Rect();
        this.f41551w2 = new uo0(this);
        this.f41561x2 = new ap0(this, 0);
        this.f41446k3 = true;
        this.f41454l3 = new int[2];
        this.f41462m3 = new int[2];
        this.f41562x3 = new ImageView[3];
        this.f41581z3 = new int[2];
        this.J3 = true;
        this.U3 = -1;
        this.W3 = -10;
        this.Z3 = new org.telegram.ui.Cells.j1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f41357a4 = videoFramesRewinder;
        this.f41367b4 = new jp0(this, videoFramesRewinder);
        this.f41377c4 = new org.telegram.ui.Cells.f2(this);
        this.f41414g4 = new ap0(this, 1);
        this.f41423h4 = new ap0(this, 2);
        this.f41431i4 = new u50(this, 1);
        this.f41438j4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f41534u4 = new en0(this, 24);
        this.A4 = new ImageReceiver(null);
        this.B4 = new di.z2(this, 5);
        this.C4 = new ImageReceiver(null);
        this.D4 = new h2.c(1, new en0(this, 25));
        this.E4 = new h2.c(1, new en0(this, 25));
        this.F4 = new h2.c(1, new en0(this, 25));
        this.K4 = false;
        this.L4 = new Matrix();
        Paint paint2 = new Paint();
        this.M4 = paint2;
        this.N4 = null;
        this.W4 = new Object();
        this.f41368b5 = new String[3];
        this.O5 = new boolean[]{false, true};
        this.Z5 = 1.0f;
        this.f41359a6 = 0.0f;
        this.f41474n6 = -1;
        this.f41519s6 = new DecelerateInterpolator(1.5f);
        this.f41545v6 = 1.0f;
        this.f41555w6 = 0.0f;
        this.H6 = true;
        this.P6 = true;
        this.V6 = new ArrayList();
        this.W6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X6 = new ArrayList();
        this.Y6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Z6 = new ArrayList();
        this.f41360a7 = new ArrayList();
        this.f41370b7 = new ArrayList();
        this.f41380c7 = new ArrayList();
        this.f41388d7 = new ArrayList();
        this.f41398e7 = new ArrayList();
        this.f41408f7 = new ArrayList();
        this.f41417g7 = null;
        this.h7 = null;
        this.f41441j7 = new Rect();
        this.f41450k7 = new h2.f(new int[]{org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.V, org.telegram.messenger.qs.f24993e3});
        this.f41566x7 = new float[]{1.0f};
        this.f41576y7 = new float[]{1.0f};
        this.E7 = new en0(this, 26);
        this.M7 = new int[2];
        this.U7 = -1L;
        this.V7 = -1L;
        this.W7 = -1L;
        this.Y7 = -1;
        this.D8 = new org.telegram.ui.Components.w5(new en0(this, 25), 180L, org.telegram.ui.Components.xq.f40459g);
        this.L8 = new Object();
        this.M8 = new a0.h();
        this.S8 = new RectF();
        this.V8 = new en0(this, 27);
        this.W8 = new to0(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.B4.h0(3);
    }

    public static boolean A1() {
        if (f41350e9 != null) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap C0(android.graphics.Bitmap r16, org.telegram.messenger.ye r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C0(android.graphics.Bitmap, org.telegram.messenger.ye, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean I1(org.telegram.messenger.ij ijVar) {
        if (f41350e9 != null && !f41350e9.A3 && f41350e9.f41390e && ijVar != null && f41350e9.S4 != null && f41350e9.S4.e1() == ijVar.e1() && org.telegram.messenger.ij.B0(f41350e9.S4.f23262k) == org.telegram.messenger.ij.B0(ijVar.f23262k)) {
            return true;
        }
        return false;
    }

    public static boolean J1(org.telegram.messenger.ij ijVar) {
        if (f41351f9 != null && ijVar != null && f41351f9.S4 != null && f41351f9.S4.e1() == ijVar.e1() && org.telegram.messenger.ij.B0(f41351f9.S4.f23262k) == org.telegram.messenger.ij.B0(ijVar.f23262k)) {
            return true;
        }
        return false;
    }

    public static void K(PhotoViewer photoViewer) {
        int i7;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.X6;
        if (!arrayList.isEmpty() && (i7 = photoViewer.P4) >= 0 && i7 < arrayList.size() && (ijVar = (org.telegram.messenger.ij) arrayList.get(photoViewer.P4)) != null) {
            if (photoViewer.f41464m5 && (message = ijVar.f23262k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.l21.M0())) {
                photoViewer.x2(ijVar, h2(ijVar), false, true);
            } else {
                photoViewer.x2(ijVar, ijVar.f23318z, photoViewer.f41464m5, true);
            }
        }
    }

    public static boolean K1(String str) {
        if (f41350e9 != null && f41350e9.f41390e && !f41350e9.f41508r4 && str != null && str.equals(f41350e9.f41386d5)) {
            return true;
        }
        return false;
    }

    public static boolean L1(org.telegram.messenger.ij ijVar) {
        boolean z9;
        if (f41350e9 != null && !f41350e9.A3 && f41350e9.f41390e && !f41350e9.f41508r4 && ijVar != null) {
            org.telegram.messenger.ij ijVar2 = f41350e9.S4;
            if (ijVar2 == null && f41350e9.d != null) {
                ijVar2 = f41350e9.d.V();
            }
            if (ijVar2 != null && ijVar2.e1() == ijVar.e1() && org.telegram.messenger.ij.B0(ijVar2.f23262k) == org.telegram.messenger.ij.B0(ijVar.f23262k)) {
                z9 = true;
                if (z9 && f41351f9 != null) {
                    if (f41351f9.f41390e && !f41351f9.f41508r4 && ijVar != null && f41351f9.S4 != null && f41351f9.S4.e1() == ijVar.e1() && org.telegram.messenger.ij.B0(f41351f9.S4.f23262k) == org.telegram.messenger.ij.B0(ijVar.f23262k)) {
                        return true;
                    }
                    return false;
                }
                return z9;
            }
        }
        z9 = false;
        if (z9) {
        }
        return z9;
    }

    public static boolean M1(TLRPC.BotInlineResult botInlineResult) {
        if (f41350e9 != null && f41350e9.f41390e && !f41350e9.f41508r4 && botInlineResult != null && f41350e9.X4 != null && botInlineResult.f26954id == f41350e9.X4.f26954id) {
            return true;
        }
        return false;
    }

    public static void N(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.U7 != -1 && (textureView = photoViewer.B2) != null) {
            photoViewer.U7 = -1L;
            photoViewer.f41580z2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.xq.f40461j).setDuration(85L).setListener(new org.telegram.ui.Components.w50(11, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static boolean N1(TLRPC.FileLocation fileLocation) {
        if (f41350e9 != null && f41350e9.f41390e && !f41350e9.f41508r4 && fileLocation != null) {
            if (f41350e9.Y4 == null || fileLocation.local_id != f41350e9.Y4.f22869f.local_id || fileLocation.volume_id != f41350e9.Y4.f22869f.volume_id || fileLocation.dc_id != f41350e9.Y4.f22865a) {
                if (f41350e9.Z4 != null && fileLocation.local_id == f41350e9.Z4.f22869f.local_id && fileLocation.volume_id == f41350e9.Z4.f22869f.volume_id && fileLocation.dc_id == f41350e9.Z4.f22865a) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void O(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.O(org.telegram.ui.PhotoViewer):void");
    }

    public static boolean O2(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.f23262k)) {
            if (ijVar.f23311x0 || ijVar.f23307w0 || ijVar.D2(true) || (ijVar.B() && org.telegram.messenger.iz.B0)) {
                int i7 = org.telegram.messenger.iz.f23385a;
                if (org.telegram.messenger.sc.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void P(PhotoViewer photoViewer) {
        int i7;
        org.telegram.ui.Components.w51 w51Var = photoViewer.f41488p3;
        if (w51Var.f39924f) {
            i7 = w51Var.d;
        } else {
            i7 = w51Var.f39921b;
        }
        int L = (org.telegram.messenger.g0.L(2.0f) + ((org.telegram.ui.Components.w51.S / 2) + i7)) - (photoViewer.f41507r3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = (photoViewer.f41422h3.getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - (photoViewer.f41507r3.getMeasuredWidth() / 2);
        if (L < L2) {
            lp0 lp0Var = photoViewer.f41507r3;
            lp0Var.setPivotX(Utilities.i((lp0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f41507r3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            lp0 lp0Var2 = photoViewer.f41507r3;
            lp0Var2.setPivotX(Utilities.i((lp0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f41507r3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            lp0 lp0Var3 = photoViewer.f41507r3;
            lp0Var3.setPivotX(lp0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f41507r3.setTranslationX(L);
    }

    public static void Q(PhotoViewer photoViewer, boolean z9) {
        org.telegram.ui.Components.ah0 B;
        oq0 oq0Var = photoViewer.W4;
        ArrayList arrayList = oq0Var.f48507e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.h20 h20Var = (org.telegram.messenger.h20) oq0Var.f48507e.get(i7);
                if (h20Var.f22813a == 0 && (h20Var.f22814b & 1) != 0) {
                    View view = h20Var.I;
                    if ((view instanceof org.telegram.ui.Components.l9) && (B = ((org.telegram.ui.Components.l9) view).getImageReceiver().B()) != null) {
                        if (z9) {
                            B.start();
                        } else {
                            B.stop();
                        }
                    }
                }
            }
        }
    }

    public static void R(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.ah0 B;
        oq0 oq0Var = photoViewer.W4;
        ArrayList arrayList = oq0Var.f48507e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.h20 h20Var = (org.telegram.messenger.h20) oq0Var.f48507e.get(i7);
                if (h20Var.f22813a == 0 && (h20Var.f22814b & 1) != 0) {
                    View view = h20Var.I;
                    if ((view instanceof org.telegram.ui.Components.l9) && (B = ((org.telegram.ui.Components.l9) view).getImageReceiver().B()) != null) {
                        long j10 = photoViewer.f41459l8;
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

    public static int R0(org.telegram.messenger.ze zeVar) {
        if (zeVar.d()) {
            return org.telegram.messenger.g0.Z0(false);
        }
        return 512;
    }

    public static void S(org.telegram.ui.PhotoViewer r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.S(org.telegram.ui.PhotoViewer, int):void");
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
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f23386a0 && org.telegram.messenger.iz.o() >= 2 && !org.telegram.messenger.g0.m0) {
            return true;
        }
        return false;
    }

    public static boolean c(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence h2(org.telegram.messenger.ij ijVar) {
        if (ijVar.f23262k == null) {
            return "";
        }
        Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(new SpannableStringBuilder(ijVar.f23262k.translatedText.text), org.telegram.ui.ActionBar.l6.f28062o2.getFontMetricsInt(), false, null, 0), ijVar.f23262k.translatedText.entities, org.telegram.ui.ActionBar.l6.f28062o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.ij.M(B5)) {
            try {
                org.telegram.messenger.g0.c(B5, 5, false, true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.ij.h(ijVar.P3(), B5, true, 0, 0, true);
        org.telegram.messenger.ij.b(B5, ijVar.f23262k.translatedText.entities, ijVar.P3(), true, true, true, 0);
        if (org.telegram.messenger.ij.L4(ijVar.f23262k)) {
            org.telegram.messenger.ij.h(ijVar.P3(), B5, true, 3, (int) ijVar.L0(), false);
        } else if (ijVar.I3() || org.telegram.messenger.ij.R4(ijVar.f23262k)) {
            org.telegram.messenger.ij.h(ijVar.P3(), B5, true, 4, (int) ijVar.L0(), false);
        }
        return B5;
    }

    public static String m1(org.telegram.messenger.hc hcVar) {
        if (hcVar != null && hcVar.f22878p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer p1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f41350e9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f41350e9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f41350e9 = photoViewer;
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
        boolean z9;
        Integer num;
        org.telegram.ui.Components.u51 u51Var;
        org.telegram.messenger.ij ijVar;
        boolean z10;
        rq0 rq0Var = photoViewer.f41391e0;
        photoViewer.f41382d0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.f41410g0, photoViewer.f41382d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        cn cnVar = photoViewer.f41447k4;
        if (cnVar != null && cnVar.Z != null && cnVar.getFragmentView() != null) {
            sj sjVar = photoViewer.f41447k4.Z;
            if (sjVar.f31168z2) {
                sjVar.s1();
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.l3(photoViewer.f41447k4.getParentActivity(), photoViewer.f41372c);
            photoViewer.f41447k4.getFragmentView().requestLayout();
            z9 = z10;
        } else {
            z9 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (u51Var = photoViewer.F2) != null && u51Var.S() > 1500 && (ijVar = photoViewer.S4) != null && org.telegram.messenger.ij.L4(ijVar.f23262k)) {
            num = Integer.valueOf((int) (photoViewer.F2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(0);
            String K = org.telegram.messenger.t3.K(org.telegram.messenger.qp.s1(photoViewer.T).M0(Long.valueOf(-org.telegram.messenger.ij.B0(ijVar2.f23262k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.qp.s1(photoViewer.T).U2, "/", K, "/");
                sb2.append(ijVar2.e1());
                str = sb2.toString();
            }
        }
        gp0 gp0Var = new gp0(photoViewer, photoViewer.D, photoViewer.f41447k4, arrayList, str, num, rq0Var, z9);
        gp0Var.A0(false);
        gp0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.g0.i3(new bd0(28, photoViewer, gp0Var), 250L);
        gp0Var.show();
    }

    public static void v(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!photoViewer.k0()) {
            return;
        }
        org.telegram.messenger.ij ijVar2 = photoViewer.S4;
        File file2 = null;
        if (ijVar2 != null) {
            if (ijVar2.t() && !photoViewer.S4.U2()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && photoViewer.S4.P3()) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean L4 = org.telegram.messenger.ij.L4(photoViewer.S4.f23262k);
            if (!TextUtils.isEmpty(photoViewer.S4.f23262k.attachPath)) {
                File file3 = new File(photoViewer.S4.f23262k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.w7.G(photoViewer.T);
                file2 = org.telegram.messenger.w7.M(photoViewer.S4.f23262k, false, true);
            }
            ijVar = ijVar2;
            file = file2;
            z10 = z12;
            z11 = z13;
            z9 = L4;
        } else {
            file = null;
            ijVar = null;
            z9 = false;
            z10 = false;
            z11 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.h7 = new ar0(photoViewer, photoViewer.O4, new ArrayList(photoViewer.X6), photoViewer.d);
            hq0 hq0Var = new hq0();
            hq0Var.f46375c = false;
            photoViewer.h3(false, true, hq0Var);
            org.telegram.messenger.g0.i3(new qn0(photoViewer, file, z9, ijVar, z10, z11), hq0Var.f46373a);
            return;
        }
        photoViewer.R2();
    }

    public static String v1() {
        File z9 = org.telegram.messenger.w7.z(4);
        return new File(z9, org.telegram.messenger.iz.p() + "_temp.jpg").getAbsolutePath();
    }

    public static void x(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x(org.telegram.ui.PhotoViewer):void");
    }

    public final void A0() {
        if (this.D2) {
            this.O8.a(new di.e(20));
            org.telegram.messenger.g0.h3(new en0(this, 12));
            return;
        }
        this.O8.a(new ln0(this, 1));
    }

    public final void A2() {
        if (this.f41463m4 == 0) {
            B2(this.B4, this.O4, null);
            C2(this.O4, this.f41563x4);
            B2(this.C4, this.O4 + 1, this.F1);
            C2(this.O4 + 1, this.f41582z4);
            B2(this.A4, this.O4 - 1, this.E1);
            C2(this.O4 - 1, this.f41573y4);
        }
    }

    public final void A3() {
        String U0;
        String U02;
        int[] iArr = this.f41454l3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f41462m3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            long max = Math.max(0L, u51Var.S());
            long max2 = Math.max(0L, this.F2.U());
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
            eq0 eq0Var = this.f41401f0;
            if (eq0Var != null && eq0Var.f32248y) {
                long max3 = Math.max(0, eq0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f41401f0.getVideoDuration());
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
        this.f41471n3.l(U0 + " / " + U02, false);
        if (!Objects.equals(this.f41430i3, U02)) {
            this.f41430i3 = U02;
            this.f41422h3.requestLayout();
        }
    }

    public final void B0() {
        if (this.C1 != null) {
            return;
        }
        org.telegram.ui.Components.gd0 gd0Var = new org.telegram.ui.Components.gd0(this.E, this.f41541v2);
        this.C1 = gd0Var;
        gd0Var.setVisibility(8);
        this.C1.a();
        this.f41391e0.addView(this.C1, this.f41391e0.indexOfChild(this.Q7) - 1, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.C1.setDelegate(new to0(this));
    }

    public final void B1() {
        boolean[] zArr = this.f41550w1;
        zArr[1] = false;
        zArr[0] = false;
        this.f41391e0.invalidate();
    }

    public final void B2(org.telegram.messenger.ImageReceiver r23, int r24, og.g r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B2(org.telegram.messenger.ImageReceiver, int, og.g):void");
    }

    public final void B3() {
        int v;
        if (this.Y7 > 0) {
            if (this.X7 >= this.Y7) {
                this.X7 = this.Y7 - 1;
            }
            if (this.f41375c2 == 1) {
                float max = Math.max(800.0f / this.f41371b8, 800.0f / this.f41381c8);
                this.f41389d8 = Math.round((this.f41371b8 * max) / 2.0f) * 2;
                this.f41399e8 = Math.round((this.f41381c8 * max) / 2.0f) * 2;
            } else {
                Size i02 = i0();
                this.f41389d8 = i02.getWidth();
                this.f41399e8 = i02.getHeight();
            }
            if (this.f41409f8 != 0) {
                if (this.f41375c2 == 1) {
                    this.f41409f8 = 1560000;
                    v = this.f41409f8;
                } else if (this.f41389d8 == this.f41371b8 && this.f41399e8 == this.f41381c8) {
                    this.f41409f8 = this.f41418g8;
                    v = MediaController.v(this.f41389d8, this.f41399e8, this.f41409f8, false);
                } else {
                    this.f41409f8 = MediaController.Q(this.f41381c8, this.f41371b8, this.f41418g8, this.f41399e8, this.f41389d8);
                    v = MediaController.v(this.f41389d8, this.f41399e8, this.f41409f8, false);
                }
                this.f41502q8 = ((v / 8) * this.f41426h8) / 1000.0f;
            }
        }
    }

    public final void C1() {
        org.telegram.ui.Components.gd0 gd0Var = this.C1;
        if (gd0Var != null) {
            gd0Var.b(null, 0, false, false, null, null, null);
            if (this.f41375c2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.C1.f33932b.f21007a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.C1.setVisibility(0);
            this.C1.setAlpha(1.0f);
            og.o oVar = this.C1.f33932b;
            oVar.q();
            CropAreaView cropAreaView2 = oVar.f21007a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f41524t2 = true;
        }
    }

    public final void C2(int i7, org.telegram.ui.Components.tb0 tb0Var) {
        ArrayList arrayList;
        String str;
        boolean z9;
        boolean z10;
        if (tb0Var != null) {
            tb0Var.a();
            tb0Var.setVisibility(8);
            ArrayList arrayList2 = this.f41408f7;
            if (!arrayList2.isEmpty() && i7 >= 0 && i7 < arrayList2.size()) {
                Object obj = arrayList2.get(i7);
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    z9 = gfVar.f26845b;
                    str = gfVar.f26851j;
                    arrayList = gfVar.f26857p;
                } else {
                    if (obj instanceof org.telegram.messenger.kf) {
                        org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                        str = kfVar.f26851j;
                        arrayList = kfVar.f26857p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z9 = false;
                }
                tb0Var.setVisibility(0);
                if (this.f41375c2 != 11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tb0Var.b(arrayList, z9, false, z10);
                if (str != null) {
                    tb0Var.f38342a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(tb0Var.f38342a);
                    tb0Var.d = bitmapDrawable;
                    tb0Var.setBackground(bitmapDrawable);
                    return;
                }
                tb0Var.f38342a = null;
                tb0Var.d = null;
                tb0Var.setBackground(null);
            }
        }
    }

    public final boolean C3() {
        org.telegram.ui.Components.i30 i30Var = this.f41479o2;
        if (i30Var != null && i30Var.d && !i30Var.f34546e) {
            return true;
        }
        return false;
    }

    public final void D0() {
        org.telegram.messenger.ye yeVar;
        int width;
        int width2;
        if (this.N1 != null) {
            return;
        }
        if (this.f41375c2 == 1) {
            yeVar = new org.telegram.messenger.ye();
            yeVar.f26642k = this.D1.f20970i;
        } else {
            yeVar = this.W4.f48506c;
        }
        org.telegram.messenger.ye yeVar2 = yeVar;
        int q10 = this.B4.q();
        int o4 = this.B4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q10, o4, config);
        tg.c2 c2Var = this.f41481o5;
        if (c2Var != null && c2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f41481o5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f41481o5.J);
            float width3 = createBitmap.getWidth();
            if ((this.f41481o5.J / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f10 = width3 / width2;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f10, ((-sourceBitmap.getHeight()) / 2.0f) * f10, (sourceBitmap.getWidth() / 2.0f) * f10, (sourceBitmap.getHeight() / 2.0f) * f10);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.B4.q(), this.B4.o(), config);
        if (this.B4.n() != null) {
            Bitmap n10 = this.B4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.B4.U);
            float width4 = createBitmap2.getWidth();
            if ((this.B4.U / 90) % 2 != 0) {
                width = n10.getHeight();
            } else {
                width = n10.getWidth();
            }
            float f11 = width4 / width;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(((-n10.getWidth()) / 2.0f) * f11, ((-n10.getHeight()) / 2.0f) * f11, (n10.getWidth() / 2.0f) * f11, (n10.getHeight() / 2.0f) * f11);
            canvas2.drawBitmap(n10, (Rect) null, rectF2, new Paint(3));
        }
        vp0 vp0Var = new vp0(this, this.D, this.T, createBitmap2, createBitmap, this.B4.U, yeVar2);
        this.N1 = vp0Var;
        vp0Var.f55891s.setOnClickListener(new fn0(this, 5));
        this.N1.f55892w.setOnClickListener(new fn0(this, 6));
        this.N1.setEraser(this.M1);
        int indexOfChild = this.f41391e0.indexOfChild(this.f41527t5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f41391e0.getChildCount();
        }
        this.f41391e0.addView(this.N1, indexOfChild, c8.ha.c(-1.0f, -1));
        this.O1 = false;
    }

    public final void D1() {
        tg.c2 c2Var = this.f41481o5;
        if (c2Var == null || !c2Var.V) {
            xe.b bVar = this.Z;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11535f0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            xe.b bVar2 = this.f41353a0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            bp0 bp0Var = this.U1;
            if (bp0Var != null) {
                bp0Var.m();
            }
            cp0 cp0Var = this.V1;
            if (cp0Var != null) {
                cp0Var.m();
            }
            jq0 jq0Var = this.s5;
            if (jq0Var != null) {
                jq0Var.invalidate();
            }
            jq0 jq0Var2 = this.f41535u5;
            if (jq0Var2 != null) {
                jq0Var2.invalidate();
            }
            jq0 jq0Var3 = this.f41544v5;
            if (jq0Var3 != null) {
                jq0Var3.invalidate();
            }
            jq0 jq0Var4 = this.f41554w5;
            if (jq0Var4 != null) {
                jq0Var4.invalidate();
            }
            jq0 jq0Var5 = this.f41564x5;
            if (jq0Var5 != null) {
                jq0Var5.invalidate();
            }
            yo0 yo0Var = this.R7;
            if (yo0Var != null && yo0Var.f33318e0) {
                yo0Var.invalidate();
            }
            rq0 rq0Var = this.f41391e0;
            if (rq0Var != null) {
                rq0Var.invalidate();
            }
        }
    }

    public final void D2(int r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.D2(int, boolean, boolean, boolean):void");
    }

    public final void E0() {
        int q10;
        int o4;
        org.telegram.messenger.ye yeVar;
        Bitmap n10;
        if (this.L1 == null) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) textureView;
                q10 = i51Var.getVideoWidth();
                o4 = i51Var.getVideoHeight();
                while (true) {
                    if (q10 <= 1280 && o4 <= 1280) {
                        break;
                    }
                    q10 /= 2;
                    o4 /= 2;
                }
            } else {
                q10 = this.B4.q();
                o4 = this.B4.o();
            }
            Bitmap bitmap = this.f41563x4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q10, o4, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i7 = this.f41375c2;
            oq0 oq0Var = this.W4;
            boolean z9 = true;
            if (i7 == 1) {
                yeVar = new org.telegram.messenger.ye();
                yeVar.f26642k = this.D1.f20970i;
            } else {
                yeVar = oq0Var.f48506c;
            }
            org.telegram.messenger.ye yeVar2 = yeVar;
            fi.q3 q3Var = new fi.q3(this.f41410g0, false, new ln0(this, 3));
            q3Var.f12653f = true;
            q3Var.f12654g = true;
            this.K1 = q3Var;
            if (this.f41526t4 == 3) {
                z9 = false;
            }
            q3Var.b(z9);
            Activity activity = this.D;
            int i10 = this.T;
            if (this.f41505r1) {
                n10 = null;
            } else {
                n10 = this.B4.n();
            }
            wp0 wp0Var = new wp0(this, activity, activity, i10, bitmap2, n10, this.B4.U, oq0Var.f48507e, yeVar2, new en0(this, 15), this.f41541v2);
            this.L1 = wp0Var;
            fh.g c10 = this.Y.c(wp0Var.L0, null, false);
            c10.p(c8.g0.i(this.f41541v2));
            wp0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f41391e0.addView(this.L1.getView(), c8.ha.c(-1.0f, -1));
            this.L1.setOnDoneButtonClickedListener(new en0(this, 16));
            this.L1.getCancelView().setOnClickListener(new fn0(this, 8));
            this.L1.t0(org.telegram.messenger.g0.L(126.0f));
            this.L1.setOffsetTranslationX(-org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final boolean E1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.E.getSystemService("accessibility");
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

    public final void E2(float f10, View view, boolean z9, boolean z10) {
        float f11;
        HashMap hashMap = this.K0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        hashMap.put(view, Boolean.valueOf(z9));
        view.animate().cancel();
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 * f10;
        int i7 = 0;
        if (z10 && bool != null) {
            if (z9) {
                view.setVisibility(0);
            }
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new dn0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new i60(this, z9, view, 6)).start();
            return;
        }
        if (!z9) {
            i7 = 8;
        }
        view.setVisibility(i7);
        view.setAlpha(f12);
        p3();
    }

    public final void F0() {
        er0 er0Var = new er0(this.f41391e0.getContext(), this);
        this.f41422h3 = er0Var;
        this.f41391e0.addView(er0Var, c8.ha.e(-1, 48, 83));
        to0 to0Var = new to0(this);
        kp0 kp0Var = new kp0(this, to0Var);
        n00 n00Var = new n00(5, this.f41391e0.getContext(), this);
        this.f41497q3 = n00Var;
        n00Var.setAccessibilityDelegate(kp0Var);
        this.f41497q3.setImportantForAccessibility(1);
        this.f41422h3.addView(this.f41497q3, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(this.f41497q3);
        this.f41488p3 = w51Var;
        w51Var.f39942z = org.telegram.messenger.g0.L(2.0f);
        org.telegram.ui.Components.w51 w51Var2 = this.f41488p3;
        w51Var2.f39928k = 872415231;
        w51Var2.f39929l = 872415231;
        w51Var2.f39930m = -1;
        w51Var2.f39931n = -1;
        w51Var2.A = 1509949439;
        w51Var2.f39927j = to0Var;
        lp0 lp0Var = new lp0(this, this.f41391e0.getContext(), new nn0(this));
        this.f41507r3 = lp0Var;
        lp0Var.setAlpha(0.0f);
        this.f41391e0.addView(this.f41507r3, c8.ha.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this.f41391e0.getContext());
        this.f41471n3 = l5Var;
        l5Var.setTextColor(-1);
        this.f41471n3.setGravity(53);
        this.f41471n3.setTextSize(14);
        this.f41471n3.setImportantForAccessibility(2);
        this.f41422h3.addView(this.f41471n3, c8.ha.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f41391e0.getContext());
        this.f41480o3 = imageView;
        imageView.setImageResource(2131232252);
        this.f41480o3.setContentDescription(org.telegram.messenger.id.M0(2131754724, "AccExitFullscreen"));
        this.f41480o3.setScaleType(ImageView.ScaleType.CENTER);
        this.f41480o3.setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, -1));
        this.f41480o3.setVisibility(4);
        this.f41422h3.addView(this.f41480o3, c8.ha.e(48, 48, 53));
        this.f41480o3.setOnClickListener(new tn0(this, 6));
    }

    public final boolean F1() {
        org.telegram.ui.Components.uc a12 = a1();
        if (a12 != null) {
            if (a12.L.c() || a12.f12366f.f35844e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void F2(View view, boolean z9, boolean z10) {
        E2(1.0f, view, z9, z10);
    }

    public final void G0(org.telegram.messenger.hf hfVar) {
        org.telegram.ui.Components.da daVar;
        if (this.B2 == null) {
            org.telegram.ui.Components.ge0 ge0Var = new org.telegram.ui.Components.ge0(2, this.D, this);
            this.f41571y2 = ge0Var;
            ge0Var.setWillNotDraw(false);
            this.f41571y2.setVisibility(4);
            this.f41391e0.addView(this.f41571y2, 0, c8.ha.e(-1, -1, 17));
            this.D2 = false;
            if (this.f41408f7.isEmpty()) {
                if (this.f41362b && this.S2 == null) {
                    this.C2 = new SurfaceView(this.D);
                    this.D2 = true;
                } else {
                    this.B2 = new TextureView(this.D);
                }
            } else {
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this.D, this.F2);
                this.f41363b0.e();
                org.telegram.ui.Components.y9 y9Var = this.f41363b0;
                i51Var.f34583s = y9Var;
                org.telegram.ui.Components.sy syVar = i51Var.f34577b;
                if (syVar != null && (daVar = syVar.I) != null) {
                    org.telegram.ui.Components.y9 y9Var2 = daVar.f32913t;
                    if (y9Var2 != null && y9Var2.f40681m != null) {
                        y9Var2.f40681m = null;
                    }
                    daVar.f32913t = y9Var;
                    if (y9Var != null && y9Var.f40681m != daVar) {
                        y9Var.f40681m = daVar;
                        y9Var.d();
                    }
                }
                if (hfVar != null) {
                    i51Var.setDelegate(new gn0(hfVar, 0));
                }
                this.B2 = i51Var;
            }
            SurfaceTexture surfaceTexture = this.S2;
            if (surfaceTexture != null) {
                this.B2.setSurfaceTexture(surfaceTexture);
                this.G3 = true;
                this.H3 = true;
                this.S2 = null;
            }
            TextureView textureView = this.B2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.B2.setPivotY(0.0f);
                this.B2.setOpaque(false);
                this.f41571y2.addView(this.B2, c8.ha.e(-1, -1, 17));
            } else {
                this.f41571y2.addView(this.C2, c8.ha.e(-1, -1, 17));
            }
            qq0 qq0Var = new qq0(this.D, this);
            this.E2 = qq0Var;
            qq0Var.setPivotX(0.0f);
            this.E2.setPivotY(0.0f);
            this.E2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f41571y2.addView(this.E2, c8.ha.e(-1, -1, 17));
            View view = new View(this.D);
            this.X8 = view;
            this.f41571y2.addView(view, c8.ha.c(-1.0f, -1));
            if (this.f41375c2 == 1) {
                View view2 = new View(this.D);
                this.f41580z2 = view2;
                view2.setBackgroundColor(-1);
                this.f41580z2.setAlpha(0.0f);
                this.f41571y2.addView(this.f41580z2, c8.ha.e(-1, -1, 17));
            }
        }
    }

    public final boolean G1() {
        int i7;
        if (this.f41417g7 != null && (i7 = this.O4) >= 0) {
            ArrayList arrayList = this.f41398e7;
            if (i7 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.O4);
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.Z6.get(this.O4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f41417g7.f22869f;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (hcVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar.f22869f;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f41417g7.f22869f;
                    if (i12 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void G2(boolean z9, boolean z10) {
        if (this.f41504r0.getVisibility() != 0) {
            this.f41549w0.f51444f.t("", z9, true);
        } else if (Math.abs(this.f41523t1 - 1.0f) < 0.001f) {
            this.f41549w0.f51444f.t("", z9, true);
        } else {
            org.telegram.ui.Components.i6 i6Var = this.f41549w0.f51444f;
            i6Var.t(org.telegram.ui.Components.fu0.a(this.f41523t1) + "x", z9, true);
        }
        this.f41504r0.e(z9, this.f41523t1);
        d61 d61Var = this.I0;
        float f10 = this.f41523t1;
        org.telegram.ui.ActionBar.z0[] z0VarArr = (org.telegram.ui.ActionBar.z0[]) d61Var.f44867b;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (z10 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                z0VarArr[i7].d(-9718023, -9718023);
            } else {
                z0VarArr[i7].d(-328966, -328966);
            }
        }
    }

    public final boolean H0() {
        boolean z9 = false;
        if (this.f41482o6 != null || this.C1 == null) {
            return false;
        }
        this.f41407f6 = 1.0f;
        this.f41465m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41482o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f35969g, 0.0f, 1.0f));
        this.f41482o6.setDuration(250L);
        this.f41482o6.setInterpolator(org.telegram.ui.Components.xq.f40458f);
        this.f41482o6.addListener(new ip0(this, 0));
        this.f41482o6.start();
        og.m mVar = this.C1.f33932b.L;
        if (mVar != null) {
            z9 = mVar.f21004j;
        }
        return !z9;
    }

    public final boolean H1(sq0 sq0Var) {
        if (sq0Var != null) {
            Object g10 = sq0Var.g();
            if (g10 instanceof org.telegram.messenger.ij) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) g10;
                if (ijVar.f23262k != null) {
                    if (org.telegram.messenger.qp.s1(this.T).A2(org.telegram.messenger.ij.B0(ijVar.f23262k)) || ijVar.f23262k.noforwards || ijVar.y2()) {
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

    public final void H2(Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        bg.v0 v0Var;
        Activity parentActivity;
        boolean z9;
        int i7;
        boolean z10;
        float f10;
        float f11;
        bg.v0 v0Var2 = this.f41458l7;
        if (v0Var2 != null) {
            v0Var2.b();
            this.f41458l7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.f41458l7 = v0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = f2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.l6.K(parentActivity, false);
        this.f41541v2 = g6Var;
        this.f41455l4 = f2Var;
        int i10 = org.telegram.messenger.p10.f24470s0;
        this.T = i10;
        this.B4.d = i10;
        this.A4.d = i10;
        this.C4.d = i10;
        bp0 bp0Var = this.U1;
        if (bp0Var != null) {
            bp0Var.setAccount(i10);
            this.U1.f12366f.k(false);
        }
        cp0 cp0Var = this.V1;
        if (cp0Var != null) {
            cp0Var.setAccount(this.T);
            this.V1.f12366f.k(false);
        }
        tg.c2 c2Var = this.f41481o5;
        if (c2Var != null) {
            c2Var.setCurrentAccount(this.T);
        }
        if (this.D != parentActivity && parentActivity != null) {
            this.f41513s = parentActivity instanceof BubbleActivity;
            this.D = parentActivity;
            this.E = new ContextThemeWrapper(this.D, 2131755318);
            this.f41570y1 = ViewConfiguration.get(this.D).getScaledTouchSlop();
            if (Y8 == null) {
                Y8 = new Drawable[]{f0.d.d(this.D, 2131231006), f0.d.d(this.D, 2131230931), f0.d.d(this.D, 2131231635)};
            }
            this.U6 = new Scroller(parentActivity);
            xq0 xq0Var = new xq0(this, parentActivity);
            this.f41410g0 = xq0Var;
            xq0Var.setBackground(this.L0);
            this.f41410g0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f41419h0 = clippingImageView;
            clippingImageView.N = this.f41438j4;
            clippingImageView.K = false;
            clippingImageView.M = false;
            this.f41410g0.addView(clippingImageView, c8.ha.c(40.0f, 40));
            rq0 rq0Var = new rq0(this, parentActivity, parentActivity);
            this.f41391e0 = rq0Var;
            rq0Var.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f41357a4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f41391e0);
            }
            this.f41391e0.setClipChildren(true);
            this.f41391e0.setClipToPadding(true);
            this.f41410g0.setClipChildren(false);
            this.f41410g0.setClipToPadding(false);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this.f41391e0);
            this.f41363b0 = y9Var;
            y9Var.f40671a = 1;
            this.X = new go0(this);
            this.f41353a0 = new xe.b();
            this.Z = new xe.b();
            dh.c cVar = new dh.c(this.X);
            this.Y = cVar;
            cVar.g(new jh.k(this.f41391e0), this.f41391e0);
            this.Y.f(this.f41353a0);
            this.f41373c0 = new org.telegram.ui.Components.ca(this.f41363b0, this.f41391e0);
            this.f41410g0.addView(this.f41391e0, c8.ha.e(-1, -1, 51));
            r0.i0.l(this.f41391e0, new nn0(this));
            this.f41391e0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f41382d0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.g0.m(layoutParams);
            this.f41382d0.flags = -2147286784;
            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(this.D);
            this.f41563x4 = tb0Var;
            this.f41391e0.addView(tb0Var, c8.ha.c(-2.0f, -2));
            org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(this.D);
            this.f41573y4 = tb0Var2;
            this.f41391e0.addView(tb0Var2, c8.ha.c(-2.0f, -2));
            org.telegram.ui.Components.tb0 tb0Var3 = new org.telegram.ui.Components.tb0(this.D);
            this.f41582z4 = tb0Var3;
            this.f41391e0.addView(tb0Var3, c8.ha.c(-2.0f, -2));
            org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(4, parentActivity, this);
            this.F = r7Var;
            r7Var.setOverlayTitleAnimation(true);
            this.F.setTitleColor(-1);
            this.F.setSubtitleColor(-1);
            this.F.setBackgroundColor(2130706432);
            this.F.setOccupyStatusBar(!this.f41513s);
            this.F.D(1090519039, false);
            this.F.E(-1, false);
            this.F.setBackButtonImage(2131231240);
            ImageView backButton = this.F.getBackButton();
            this.G = backButton;
            this.H = backButton.getBackground();
            this.I = null;
            vq0 vq0Var = new vq0(parentActivity);
            this.M = vq0Var;
            this.F.addView(vq0Var, c8.ha.e(-1, -1, 119));
            this.f41391e0.addView(this.F, c8.ha.c(-2.0f, -1));
            tq0 tq0Var = new tq0(parentActivity);
            this.N = tq0Var;
            this.f41391e0.addView(tq0Var, c8.ha.e(-1, -2, 55));
            this.F.setActionBarMenuOnItemClick(new so0(this, g6Var));
            org.telegram.ui.ActionBar.y r10 = this.F.r();
            this.A0 = r10;
            r10.setOnLayoutListener(new en0(this, 20));
            org.telegram.ui.ActionBar.r0 a10 = this.A0.a(26, 2131231785);
            this.E0 = a10;
            a10.setContentDescription(org.telegram.messenger.id.L0(2131751598));
            c8.ka.a(this.E0);
            F2(this.E0, false, false);
            org.telegram.ui.ActionBar.r0 a11 = this.A0.a(11, 2131232217);
            this.D0 = a11;
            a11.setContentDescription(org.telegram.messenger.id.L0(2131748679));
            org.telegram.ui.ActionBar.r0 a12 = this.A0.a(18, 2131232180);
            this.C0 = a12;
            a12.setContentDescription(org.telegram.messenger.id.L0(2131754810));
            org.telegram.ui.ActionBar.r0 a13 = this.A0.a(4, 2131232181);
            this.B0 = a13;
            a13.setContentDescription(org.telegram.messenger.id.L0(2131750587));
            org.telegram.ui.ActionBar.y yVar = this.A0;
            wq wqVar = new wq(2131232797, this.E, new di.b());
            this.f41549w0 = wqVar;
            org.telegram.ui.ActionBar.r0 d = yVar.d(1, wqVar);
            this.f41485p0 = d;
            this.f41549w0.setCallback(d.getIconView());
            this.f41485p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f41485p0.getPopupLayout().f27287c = true;
            this.f41485p0.getPopupLayout().setFitItems(true);
            this.f41485p0.setMenuXOffset(org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(this.E, g6Var);
            this.f41504r0 = v0Var3;
            v0Var3.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f41504r0.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            this.f41504r0.setDrawShadow(false);
            this.f41504r0.setBackgroundColor(-14540254);
            this.f41504r0.setTextColor(-1);
            this.f41504r0.setLabel(org.telegram.messenger.id.L0(2131743587));
            this.f41504r0.setOnValueChange(new mn0(this, 1));
            this.f41485p0.getPopupLayout().a(this.f41504r0, c8.ha.o(-1, 44));
            org.telegram.ui.ActionBar.d1 a14 = this.f41485p0.a(-1);
            this.f41578z0 = a14;
            a14.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f41485p0.getPopupLayout();
            d61 d61Var = new d61(this.E, new nn0(this));
            this.I0 = d61Var;
            popupLayout.addView(d61Var);
            LinearLayout linearLayout = new LinearLayout(this.E);
            this.f41559x0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f41485p0.getPopupLayout().addView(this.f41559x0);
            org.telegram.ui.ActionBar.z0 e10 = this.f41485p0.e(22, 2131231913, org.telegram.messenger.id.L0(2131743588));
            this.f41514s0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.m7 m7Var = new org.telegram.ui.Components.m7(this, this.E, 1);
            this.G0 = m7Var;
            try {
                m7Var.setRouteSelector(g6.a.c(this.E).a());
                z9 = true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.f(e11);
                z9 = false;
            }
            this.G0.setVisibility(4);
            if (z9) {
                org.telegram.ui.ActionBar.z0 e12 = this.f41485p0.e(24, 2131231912, org.telegram.messenger.id.L0(2131743589));
                this.F0 = e12;
                e12.f(false);
                this.F0.setSelectorColor(268435455);
                this.F0.addView(this.G0, 0, c8.ha.c(-1.0f, -1));
            }
            this.f41485p0.H(-115203550);
            this.f41485p0.setOnMenuDismiss(new ln0(this, 9));
            org.telegram.ui.ActionBar.r0 a15 = this.A0.a(0, 2131231749);
            this.f41477o0 = a15;
            a15.setContentDescription(org.telegram.messenger.id.L0(2131754839));
            this.f41477o0.setOnClickListener(new tn0(this, 3));
            this.f41477o0.setOnMenuDismiss(new ln0(this, 10));
            this.f41477o0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f41477o0.getPopupLayout().f27287c = true;
            this.f41477o0.getPopupLayout().setFitItems(true);
            this.J0 = new uq(this.E, this.f41477o0.getPopupLayout().getSwipeBack(), new nn0(this));
            org.telegram.ui.ActionBar.z0 h = this.f41477o0.h(2131232167, null, org.telegram.messenger.id.L0(2131745929), this.J0.f50449a);
            h.d(-328966, -328966);
            this.f41522t0 = h;
            h.setOnClickListener(new tn0(this, 4));
            org.telegram.ui.ActionBar.d1 a16 = this.f41477o0.a(-1);
            this.f41530u0 = a16;
            a16.setColor(-15198184);
            this.f41477o0.e(10, 2131232265, org.telegram.messenger.id.L0(2131747796)).d(-328966, -328966);
            org.telegram.ui.ActionBar.z0 e13 = this.f41477o0.e(6, 2131231914, org.telegram.messenger.id.L0(2131747222));
            e13.d(-328966, -328966);
            this.f41539v0 = e13;
            org.telegram.ui.ActionBar.z0 e14 = this.f41477o0.e(3, 2131232219, org.telegram.messenger.id.L0(2131745347));
            this.f41494q0 = e14;
            e14.d(-328966, -328966);
            this.f41477o0.e(12, 2131232170, org.telegram.messenger.id.L0(2131745930)).d(-328966, -328966);
            this.f41477o0.e(5, 2131232224, org.telegram.messenger.id.L0(2131745342)).d(-328966, -328966);
            this.f41477o0.e(25, 2131232382, org.telegram.messenger.id.L0(2131751704)).d(-328966, -328966);
            this.f41477o0.e(21, 2131231876, org.telegram.messenger.id.L0(2131746263)).d(-328966, -328966);
            this.f41477o0.e(23, 2131232333, org.telegram.messenger.id.L0(2131746212)).d(-328966, -328966);
            this.f41477o0.e(9, 2131232365, org.telegram.messenger.id.L0(2131745459)).d(-328966, -328966);
            this.f41477o0.e(13, 2131232382, org.telegram.messenger.id.L0(2131745328)).d(-328966, -328966);
            this.f41477o0.e(14, 2131232266, org.telegram.messenger.id.L0(2131745542)).d(-328966, -328966);
            this.f41477o0.e(19, 2131232408, org.telegram.messenger.id.L0(2131743956)).d(-328966, -328966);
            this.f41477o0.e(20, 2131232408, org.telegram.messenger.id.L0(2131749304)).d(-328966, -328966);
            this.f41477o0.e(7, 2131232108, org.telegram.messenger.id.L0(2131751598)).d(-328966, -328966);
            this.f41477o0.e(8, 2131232087, org.telegram.messenger.id.L0(2131744839)).d(-328966, -328966);
            this.f41477o0.H(-115203550);
            this.f41477o0.t(19);
            this.f41477o0.t(20);
            G2(false, true);
            this.f41477o0.setPopupItemsSelectorColor(268435455);
            this.f41477o0.setSubMenuDelegate(new to0(this));
            di.b4 b4Var = new di.b4(this.E, 29);
            this.f41427i0 = b4Var;
            b4Var.setBackgroundColor(2130706432);
            this.f41391e0.addView(this.f41427i0, c8.ha.e(-1, 48, 83));
            View view = new View(this.E);
            this.f41435j0 = view;
            if (this.f41375c2 == 11) {
                i7 = -16777216;
            } else {
                i7 = 2130706432;
            }
            view.setBackgroundColor(i7);
            this.f41410g0.addView(this.f41435j0, c8.ha.a(-1.0f, this.f41443k0 / org.telegram.messenger.g0.f22562p, 87));
            this.f41540v1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f41540v1[0].setShape(0);
            this.f41540v1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f41540v1[1].setShape(0);
            org.telegram.ui.Components.m20 m20Var = new org.telegram.ui.Components.m20(this.E, org.telegram.messenger.g0.L(10.0f));
            this.l1 = m20Var;
            this.f41391e0.addView(m20Var, c8.ha.e(-1, 68, 83));
            this.l1.setDelegate(new vo0(this));
            for (int i11 = 0; i11 < 3; i11++) {
                this.f41562x3[i11] = new ImageView(this.D);
                this.f41562x3[i11].setImageResource(2131232218);
                this.f41562x3[i11].setContentDescription(org.telegram.messenger.id.M0(2131754718, "AccSwitchToFullscreen"));
                this.f41562x3[i11].setScaleType(ImageView.ScaleType.CENTER);
                this.f41562x3[i11].setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, -1));
                this.f41562x3[i11].setVisibility(4);
                this.f41562x3[i11].setAlpha(1.0f);
                this.f41391e0.addView(this.f41562x3[i11], c8.ha.c(48.0f, 48));
                this.f41562x3[i11].setOnClickListener(new tn0(this, 5));
            }
            this.Q = new wo0(new di.b());
            nq0 nq0Var = new nq0(this.f41391e0.getContext());
            this.Q1 = nq0Var;
            nq0Var.setFactory(new ae0(this, 2));
            this.Q1.setVisibility(4);
            v2(true);
            for (int i12 = 0; i12 < 3; i12++) {
                this.W0[i12] = new xo0(this, this.f41391e0);
                this.W0[i12].d(0, false, true);
            }
            zc zcVar = new zc(this, this.E, g6Var);
            this.X0 = zcVar;
            zcVar.setUseSelfAlpha(true);
            this.X0.setProgressColor(-1);
            this.X0.setSize(org.telegram.messenger.g0.L(54.0f));
            this.X0.setBackgroundResource(2131231006);
            this.X0.setVisibility(4);
            this.X0.setAlpha(0.0f);
            this.f41391e0.addView(this.X0, c8.ha.e(64, 64, 17));
            F0();
            RadialProgressView radialProgressView = new RadialProgressView(this.D, g6Var);
            this.P7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.P7.setBackgroundResource(2131231006);
            this.P7.setVisibility(4);
            this.f41391e0.addView(this.P7, c8.ha.e(54, 54, 17));
            org.telegram.ui.Cells.v0 v0Var4 = new org.telegram.ui.Cells.v0(this.D, 3);
            this.O7 = v0Var4;
            v0Var4.setBackgroundColor(2130706432);
            this.O7.b();
            this.O7.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            ((TextView) this.O7.f30617b).setText(org.telegram.messenger.id.M0(2131751354, "Done").toUpperCase());
            int i13 = org.telegram.ui.ActionBar.l6.f28056ng;
            org.telegram.ui.ActionBar.s6.U((TextView) this.O7.f30617b, i13, g6Var);
            this.f41391e0.addView(this.O7, c8.ha.e(-1, 48, 83));
            ((TextView) this.O7.d).setOnClickListener(new fn0(this, 2));
            ((TextView) this.O7.f30617b).setOnClickListener(new fn0(this, 3));
            org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(false);
            this.f41579z1 = k51Var;
            k51Var.c(new to0(this));
            rq0 rq0Var2 = this.f41391e0;
            Objects.requireNonNull(rq0Var2);
            this.A1 = new org.telegram.ui.Components.rm0(new gf0(rq0Var2, 17), false);
            zq0 zq0Var = new zq0(this.D, this);
            this.N7 = zq0Var;
            zq0Var.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            this.N7.setVisibility(4);
            this.N7.setBackgroundColor(2130706432);
            this.f41391e0.addView(this.N7, c8.ha.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            bi.m5 m5Var = new bi.m5(this, this.E);
            this.P0 = m5Var;
            this.f41391e0.addView(m5Var, c8.ha.e(-1, -2, 83));
            TextView textView = new TextView(this.f41391e0.getContext());
            this.f41452l0 = textView;
            textView.setTextSize(1, 15.0f);
            this.f41452l0.setTypeface(org.telegram.messenger.g0.o());
            this.f41452l0.setSingleLine(true);
            this.f41452l0.setMaxLines(1);
            TextView textView2 = this.f41452l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.f41452l0.setTextColor(-1);
            this.f41452l0.setGravity(3);
            this.P0.addView(this.f41452l0, c8.ha.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f41391e0.getContext());
            this.m0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            this.m0.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.P0.addView(this.m0, c8.ha.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f41391e0.getContext());
            this.f41469n0 = textView4;
            int i14 = org.telegram.ui.ActionBar.l6.Ci;
            org.telegram.ui.ActionBar.s6.Q(textView4, org.telegram.ui.ActionBar.a6.e(w1(i14), 6.0f), org.telegram.ui.ActionBar.s6.M(i14), org.telegram.ui.ActionBar.s6.e(i14), g6Var);
            TextView textView5 = this.f41469n0;
            int i15 = org.telegram.ui.ActionBar.l6.Gi;
            org.telegram.ui.ActionBar.s6.U(textView5, i15, g6Var);
            this.f41469n0.setEllipsize(truncateAt);
            this.f41469n0.setGravity(17);
            this.f41469n0.setLines(1);
            this.f41469n0.setSingleLine(true);
            this.f41469n0.setText(org.telegram.messenger.id.M0(2131745541, "SetAsMyPhoto"));
            this.f41469n0.setTextSize(1, 15.0f);
            this.f41469n0.setTypeface(org.telegram.messenger.g0.o());
            this.f41469n0.setOnClickListener(new fn0(this, 4));
            this.f41469n0.setVisibility(8);
            this.P0.addView(this.f41469n0, c8.ha.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            yo0 yo0Var = new yo0(this.D, this);
            this.R7 = yo0Var;
            yo0Var.setDelegate(new com.google.android.gms.common.api.internal.s(this));
            FrameLayout frameLayout = new FrameLayout(this.D);
            this.Q7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.Q7.addView(this.R7, c8.ha.e(-1, 54, 83));
            Z2(false, false);
            this.f41391e0.addView(this.Q7, c8.ha.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.r0 r0Var = this.E0;
            if (r0Var != null) {
                fh.g a17 = this.Y.a(r0Var);
                a17.p(c8.g0.i(g6Var));
                a17.r(org.telegram.messenger.g0.L(20.0f));
                a17.q(org.telegram.messenger.g0.L(7.0f));
                r0Var.setBackground(ih.d.d(a17, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f)));
            }
            zo0 zo0Var = new zo0(this.D, org.telegram.messenger.id.L0(2131751208));
            this.f41411g1 = zo0Var;
            fh.g a18 = this.Y.a(zo0Var);
            a18.p(c8.g0.i(g6Var));
            zo0Var.setBlurredBackgroundDrawable(a18);
            c8.ka.a(this.f41411g1);
            this.f41411g1.setOnClickListener(new fn0(this, 7));
            this.f41391e0.addView(this.f41411g1, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(this.D, g6Var, this.f41363b0);
            this.f41490p5 = vd0Var;
            org.telegram.ui.Components.ps psVar = vd0Var.f39041c;
            fh.g a19 = this.Y.a(psVar);
            a19.p(c8.g0.i(g6Var));
            psVar.setBlurredBackgroundDrawable(a19);
            c8.ka.a(this.f41490p5.f39041c);
            this.f41490p5.setVisibility(8);
            this.f41490p5.setAlpha(0.0f);
            this.f41490p5.setOnClose(new en0(this, 13));
            this.f41391e0.addView(this.f41490p5, c8.ha.e(-1, -1, 119));
            this.f41490p5.f39040b.setOnClickListener(new fn0(this, 9));
            this.f41490p5.setOnGalleryImage(new ln0(this, 4));
            org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(3, this.D, this);
            this.f41392e1 = f0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            f0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f0 f0Var2 = this.f41392e1;
            org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(this.D);
            this.f41383d1 = xzVar;
            f0Var2.setImageDrawable(xzVar);
            this.f41392e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.f0 f0Var3 = this.f41392e1;
            fh.g a20 = this.Y.a(f0Var3);
            a20.p(c8.g0.i(null));
            a20.q(org.telegram.messenger.g0.L(4.0f));
            a20.r(org.telegram.messenger.g0.L(16.0f));
            f0Var3.setBackground(a20);
            c8.ka.a(this.f41392e1);
            this.f41391e0.addView(this.f41392e1, c8.ha.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f41392e1.setOnClickListener(new fn0(this, 10));
            org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(this.f41391e0.getContext());
            this.f41402f1 = z70Var;
            z70Var.setOnClickListener(new fn0(this, 11));
            this.f41391e0.addView(this.f41402f1, c8.ha.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f41391e0.getContext();
            xq0 xq0Var2 = this.f41410g0;
            rq0 rq0Var3 = this.f41391e0;
            bp0 bp0Var2 = new bp0(this, context, xq0Var2, rq0Var3, rq0Var3, g6Var, this.f41363b0, new en0(this, 21));
            this.U1 = bp0Var2;
            bp0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.U1.setOnTimerChange(new ln0(this, 5));
            this.U1.setAccount(this.T);
            this.U1.setOnHeightUpdate(new ln0(this, 6));
            this.U1.setOnAddPhotoClick(new fn0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.E;
            xq0 xq0Var3 = this.f41410g0;
            rq0 rq0Var4 = this.f41391e0;
            cp0 cp0Var2 = new cp0(this, contextThemeWrapper, xq0Var3, rq0Var4, rq0Var4, g6Var, this.f41363b0, new en0(this, 21));
            this.V1 = cp0Var2;
            cp0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.V1.D(true, false);
            this.V1.setOnTimerChange(new ln0(this, 7));
            this.V1.setAccount(this.T);
            this.V1.setOnHeightUpdate(new ln0(this, 8));
            this.V1.setOnAddPhotoClick(new fn0(this, 13));
            di.b3 b3Var = new di.b3(this, this.E);
            this.f41509r5 = b3Var;
            b3Var.setVisibility(8);
            this.f41391e0.addView(this.f41509r5, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            tg.c2 c2Var2 = new tg.c2(this.E, g6Var);
            this.f41481o5 = c2Var2;
            c2Var2.setCurrentAccount(this.T);
            rq0 rq0Var5 = this.f41391e0;
            rq0Var5.addView(this.f41481o5, rq0Var5.indexOfChild(this.F) - 1, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            jq0 jq0Var = new jq0(this);
            this.s5 = jq0Var;
            jq0Var.setRad(18);
            this.s5.l();
            this.f41481o5.setStickerCutOutBtn(this.s5);
            this.s5.setOnClickListener(new fn0(this, 14));
            this.s5.setCutOutState(false);
            this.f41391e0.addView(this.s5, c8.ha.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.D);
            this.f41527t5 = linearLayout2;
            linearLayout2.setOrientation(0);
            jq0 jq0Var2 = new jq0(this);
            this.f41535u5 = jq0Var2;
            jq0Var2.f55961q0 = true;
            jq0Var2.setRad(18);
            this.f41535u5.setEraseState(false);
            this.f41535u5.setOnClickListener(new fn0(this, 15));
            this.f41527t5.addView(this.f41535u5, c8.ha.o(-2, 36));
            this.f41527t5.addView(new Space(this.D), c8.ha.o(12, -1));
            jq0 jq0Var3 = new jq0(this);
            this.f41544v5 = jq0Var3;
            jq0Var3.f55961q0 = true;
            jq0Var3.setRad(18);
            this.f41544v5.setRestoreState(false);
            this.f41544v5.setOnClickListener(new fn0(this, 16));
            this.f41527t5.addView(this.f41544v5, c8.ha.o(-2, 36));
            this.f41391e0.addView(this.f41527t5, c8.ha.e(-2, 36, 17));
            jq0 jq0Var4 = new jq0(this);
            this.f41554w5 = jq0Var4;
            jq0Var4.setUndoState(false);
            this.f41554w5.setRad(18);
            jq0 jq0Var5 = this.f41554w5;
            jq0Var5.f55961q0 = true;
            jq0Var5.setOnClickListener(new fn0(this, 17));
            this.f41391e0.addView(this.f41554w5, c8.ha.e(-2, 36, 17));
            jq0 jq0Var6 = new jq0(this);
            this.f41564x5 = jq0Var6;
            jq0Var6.setOutlineState(false);
            this.f41564x5.setRad(18);
            jq0 jq0Var7 = this.f41564x5;
            jq0Var7.f55961q0 = true;
            jq0Var7.setOnClickListener(new fn0(this, 18));
            this.f41391e0.addView(this.f41564x5, c8.ha.e(-2, 36, 17));
            T2(false, false);
            X2(false, false);
            k0 k0Var = new k0(19, this.D, this);
            this.X1 = k0Var;
            k0Var.addView(this.U1, c8.ha.e(-1, -1, 83));
            this.f41391e0.addView(this.X1, c8.ha.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.D);
            this.Y1 = frameLayout2;
            frameLayout2.addView(this.V1, c8.ha.e(-1, -1, 51));
            this.f41391e0.addView(this.Y1, c8.ha.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.D);
            this.Q0 = frameLayout3;
            this.f41391e0.addView(frameLayout3, c8.ha.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.D);
            this.R0 = frameLayout4;
            this.f41391e0.addView(frameLayout4, c8.ha.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.D);
            this.S7 = textView6;
            textView6.setSingleLine(true);
            this.S7.setVisibility(8);
            this.S7.setText(org.telegram.messenger.id.M0(2131752133, "ChooseCover"));
            this.S7.setGravity(1);
            this.S7.setTextSize(1, 14.0f);
            this.S7.setTextColor(-7566196);
            this.f41391e0.addView(this.S7, c8.ha.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            li.w1 w1Var = new li.w1(this, this.D, g6Var);
            this.S0 = w1Var;
            int L = org.telegram.messenger.g0.L(52.0f);
            int L2 = org.telegram.messenger.g0.L(38.0f);
            w1Var.I = L;
            w1Var.J = L2;
            li.w1 w1Var2 = this.S0;
            w1Var2.f32966h0 = true;
            fh.g a21 = this.Y.a(w1Var2);
            a21.p(c8.g0.i(g6Var));
            w1Var2.setBlurredBackgroundDrawable(a21);
            this.f41391e0.addView(this.S0, c8.ha.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.S0.setContentDescription(org.telegram.messenger.id.M0(2131745640, "Send"));
            c8.ka.a(this.S0);
            this.S0.setOnClickListener(new fn0(this, 19));
            this.S0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.wd0 wd0Var = new org.telegram.ui.Components.wd0(this.D);
            this.T0 = wd0Var;
            LinearLayout linearLayout3 = wd0Var.f40036b;
            fh.g a22 = this.Y.a(linearLayout3);
            a22.p(c8.g0.i(g6Var));
            a22.r(org.telegram.messenger.g0.L(18.0f));
            a22.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout3.setBackground(a22);
            LinearLayout linearLayout4 = this.T0.f40037c;
            fh.g a23 = this.Y.a(linearLayout4);
            a23.p(c8.g0.i(g6Var));
            a23.r(org.telegram.messenger.g0.L(18.0f));
            a23.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout4.setBackground(a23);
            this.T0.setVisibility(8);
            this.T0.f40036b.setOnClickListener(new fn0(this, 20));
            this.T0.f40037c.setOnClickListener(new fn0(this, 21));
            this.f41391e0.addView(this.T0, c8.ha.e(-1, 56, 80));
            d61 d61Var2 = new d61(19, this.D, this);
            this.H0 = d61Var2;
            d61Var2.setOrientation(0);
            this.H0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            d61 d61Var3 = this.H0;
            fh.g a24 = this.Y.a(d61Var3);
            a24.p(c8.g0.i(g6Var));
            a24.q(org.telegram.messenger.g0.L(2.0f));
            a24.r(org.telegram.messenger.g0.L(22.0f));
            d61Var3.setBackground(a24);
            this.P0.addView(this.H0, c8.ha.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.D);
            this.Z0 = imageView;
            imageView.setScaleType(scaleType);
            this.Z0.setImageResource(2131231729);
            this.Z0.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.H0.addView(this.Z0, c8.ha.o(48, 48));
            this.Z0.setOnClickListener(new fn0(this, 22));
            this.Z0.setContentDescription(org.telegram.messenger.id.M0(2131751698, "CropImage"));
            ImageView imageView2 = new ImageView(this.D);
            this.f41364b1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f41364b1.setImageResource(2131232282);
            this.f41364b1.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.H0.addView(this.f41364b1, c8.ha.o(48, 48));
            this.f41364b1.setOnClickListener(new fn0(this, 23));
            this.f41364b1.setContentDescription(org.telegram.messenger.id.M0(2131754783, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.D);
            this.f41354a1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f41354a1.setImageResource(2131231742);
            this.f41354a1.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.H0.addView(this.f41354a1, c8.ha.o(48, 48));
            this.f41354a1.setOnClickListener(new fn0(this, 24));
            this.f41354a1.setContentDescription(org.telegram.messenger.id.M0(2131754840, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.D);
            this.Y0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Y0.setImageResource(2131231739);
            this.Y0.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.H0.addView(this.Y0, c8.ha.o(48, 48));
            this.Y0.setOnClickListener(new fn0(this, 25));
            this.Y0.setContentDescription(org.telegram.messenger.id.M0(2131754810, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(this.D);
            this.f41436j1 = g51Var;
            g51Var.setTag(1);
            this.f41436j1.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.X7 = s2();
            org.telegram.ui.Components.g51 g51Var2 = this.f41436j1;
            if (this.f41442j8 && this.Y7 > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g51Var2.a(Math.min(this.f41389d8, this.f41399e8), z10, this.f41503r);
            this.f41436j1.setContentDescription(org.telegram.messenger.id.M0(2131754735, "AccDescrVideoQuality"));
            this.H0.addView(this.f41436j1, c8.ha.o(48, 48));
            this.f41436j1.setOnClickListener(new hk0(2, this, parentActivity));
            ImageView imageView5 = new ImageView(this.D);
            this.f41374c1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f41374c1.setImageResource(2131231756);
            this.f41374c1.setBackground(org.telegram.ui.ActionBar.l6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.H0.addView(this.f41374c1, c8.ha.o(48, 48));
            this.f41374c1.setOnClickListener(new fn0(this, 26));
            this.f41374c1.setContentDescription(org.telegram.messenger.id.M0(2131754811, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.v0 v0Var5 = new org.telegram.ui.Cells.v0(this.E, 3);
            this.U0 = v0Var5;
            v0Var5.setBackgroundColor(-872415232);
            this.U0.b();
            this.U0.setVisibility(8);
            this.f41391e0.addView(this.U0, c8.ha.e(-1, 48, 83));
            ((TextView) this.U0.d).setOnClickListener(new fn0(this, 27));
            ((TextView) this.U0.f30617b).setOnClickListener(new fn0(this, 28));
            TextView textView7 = new TextView(this.E);
            this.V0 = textView7;
            textView7.setClickable(false);
            this.V0.setVisibility(8);
            this.V0.setTextSize(1, 14.0f);
            this.V0.setTextColor(-1);
            this.V0.setGravity(17);
            this.V0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.g0(-12763843, 0));
            this.V0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
            this.V0.setText(org.telegram.messenger.id.L0(2131751696).toUpperCase());
            this.V0.setTypeface(org.telegram.messenger.g0.o());
            this.U0.addView(this.V0, c8.ha.e(-2, -1, 49));
            this.V0.setOnClickListener(new fn0(this, 29));
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(this.f41391e0.getContext(), this);
            this.f41500q6 = a10Var;
            a10Var.b();
            this.f41510r6 = true;
            this.f41500q6.h = this;
            nn0 nn0Var = new nn0(this);
            this.B4.H0(this.f41391e0);
            ImageReceiver imageReceiver = this.B4;
            imageReceiver.f21203k1 = (byte) 2;
            imageReceiver.J0 = true;
            imageReceiver.d0(nn0Var);
            this.A4.H0(this.f41391e0);
            ImageReceiver imageReceiver2 = this.A4;
            imageReceiver2.f21203k1 = (byte) 2;
            imageReceiver2.J0 = true;
            imageReceiver2.d0(nn0Var);
            this.C4.H0(this.f41391e0);
            ImageReceiver imageReceiver3 = this.C4;
            imageReceiver3.f21203k1 = (byte) 2;
            imageReceiver3.J0 = true;
            imageReceiver3.d0(nn0Var);
            int rotation = ((WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f41391e0.getContext(), 2131232692);
            this.N0 = checkBox;
            checkBox.setDrawBackground(true);
            this.N0.setHasBorder(true);
            this.N0.setSize(34);
            this.N0.setCheckOffset(org.telegram.messenger.g0.L(1.0f));
            this.N0.c(w1(i13), -1);
            this.N0.setVisibility(8);
            rq0 rq0Var6 = this.f41391e0;
            CheckBox checkBox2 = this.N0;
            if (rotation != 3 && rotation != 1) {
                f10 = 71.0f;
            } else {
                f10 = 61.0f;
            }
            rq0Var6.addView(checkBox2, c8.ha.d(34, 34.0f, 53, 0.0f, f10, 11.0f, 0.0f));
            if (!this.f41513s) {
                ((FrameLayout.LayoutParams) this.N0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f22557m;
            }
            this.N0.setOnClickListener(new tn0(this, 0));
            CounterView counterView = new CounterView(this.D);
            this.O0 = counterView;
            rq0 rq0Var7 = this.f41391e0;
            if (rotation != 3 && rotation != 1) {
                f11 = 68.0f;
            } else {
                f11 = 58.0f;
            }
            rq0Var7.addView(counterView, c8.ha.d(40, 40.0f, 53, 0.0f, f11, 64.0f, 0.0f));
            if (!this.f41513s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f22557m;
            }
            this.O0.setOnClickListener(new tn0(this, 1));
            dr0 dr0Var = new dr0(this.D);
            this.f41478o1 = dr0Var;
            dr0Var.setVisibility(8);
            this.f41478o1.setAlpha(0.0f);
            this.f41478o1.setLayoutManager(new jg.b0());
            dr0 dr0Var2 = this.f41478o1;
            l4 l4Var = new l4(15, this, this.D);
            this.f41486p1 = l4Var;
            dr0Var2.setAdapter(l4Var);
            this.f41391e0.addView(this.f41478o1, c8.ha.e(-1, 103, 51));
            this.f41478o1.setOnItemClickListener(new h(this, 22));
            UndoView undoView = new UndoView(this.E, null, false, g6Var);
            this.n1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(112.0f));
            this.n1.h(-115203550, -1);
            this.f41391e0.addView(this.n1, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.g0.C1()) {
                View view2 = new View(this.E);
                this.S3 = view2;
                view2.setContentDescription(org.telegram.messenger.id.M0(2131754929, "AccActionPlay"));
                this.S3.setFocusable(true);
                this.S3.setOnClickListener(new tn0(this, 2));
                this.f41391e0.addView(this.S3, c8.ha.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.s6.Q(this.f41469n0, org.telegram.ui.ActionBar.a6.e(w1(i14), 6.0f), org.telegram.ui.ActionBar.s6.M(i14), org.telegram.ui.ActionBar.s6.e(i14), g6Var);
            org.telegram.ui.ActionBar.s6.U(this.f41469n0, i15, g6Var);
            wo0 wo0Var = this.Q;
            wo0Var.f30669j0 = true;
            wo0Var.f30665h0 = false;
            org.telegram.ui.Cells.u9 n10 = wo0Var.n(this.f41410g0.getContext());
            if (n10 != null) {
                org.telegram.messenger.g0.E2(n10);
                this.f41391e0.addView(n10);
            }
            this.Q.S(this.f41391e0);
            this.Q.R();
            this.f41352a.a(false, false);
            return;
        }
        r3();
    }

    public final boolean I0(float f10, boolean z9, Runnable runnable) {
        org.telegram.ui.Components.gd0 gd0Var;
        float f11;
        if (this.f41482o6 == null && (gd0Var = this.C1) != null) {
            gd0Var.f33932b.i();
            this.f41359a6 = 0.0f;
            this.f41397e6 = 0.0f + f10;
            if (z9) {
                this.f41407f6 = 1.0f;
            }
            this.f41465m6 = System.currentTimeMillis();
            this.f41482o6 = new AnimatorSet();
            if (this.f41375c2 == 1) {
                this.f41387d6 = 1.0f;
                this.Z5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.B4;
                if (imageReceiver != null) {
                    int q10 = imageReceiver.q();
                    int o4 = this.B4.o();
                    if (Math.abs((((int) this.C1.f33932b.getStateOrientation()) / 90) % 2) == 1) {
                        o4 = q10;
                        q10 = o4;
                    }
                    org.telegram.messenger.ye yeVar = this.W4.f48506c;
                    if (yeVar != null) {
                        q10 = (int) (q10 * yeVar.f26638e);
                        o4 = (int) (o4 * yeVar.f26639f);
                    }
                    float f12 = q10;
                    float f13 = o4;
                    float min = Math.min(g1(1) / f12, c1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(g1(1) / f13, c1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f41387d6 = f11 / min;
                }
            }
            if (this.f41375c2 == 11) {
                this.Z5 = o2(false) * this.Z5;
                this.f41387d6 = o2(false) * this.f41387d6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new fi.k9(this, f10, this.C1.f33933c.getRotation(), 3));
            this.f41482o6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f35969g, 0.0f, 1.0f), ofFloat);
            this.f41482o6.setDuration(250L);
            this.f41482o6.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.f41482o6.addListener(new bi.o7(this, f10, runnable, 5));
            this.f41482o6.start();
            if (Math.abs(this.C1.f33932b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void I2(org.telegram.ui.Components.di diVar) {
        this.f41355a2 = diVar;
        bg.v0 v0Var = this.f41365b2;
        if (v0Var != null) {
            v0Var.b();
            this.f41365b2 = null;
        }
        if (diVar != null) {
            if (diVar.f28639g1 == null) {
                Window window = diVar.getWindow();
                ?? obj = new Object();
                obj.f3394c = new a1.c(new WeakReference(window), 9);
                diVar.f28639g1 = obj;
            }
            bg.w0 w0Var = diVar.f28639g1;
            w0Var.getClass();
            this.f41365b2 = new bg.v0(w0Var, 0);
        }
    }

    public final void J0() {
        if (this.D != null && this.f41410g0 != null) {
            ti.o oVar = this.O8;
            if (oVar != null) {
                this.O8 = null;
                oVar.b();
            }
            ab.b0 b0Var = this.B7;
            if (b0Var != null) {
                b0Var.b();
                this.B7 = null;
            }
            ConnectionsManager.getInstance(this.T).cancelRequestsForGuid(this.f41372c);
            l2(false);
            try {
                if (this.f41410g0.getParent() != null) {
                    ((WindowManager) this.D.getSystemService("window")).removeViewImmediate(this.f41410g0);
                    U1();
                }
                this.f41410g0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.jc jcVar = this.f41432i5;
            if (jcVar != null) {
                jcVar.a();
                this.f41432i5 = null;
            }
            this.f41419h0.setImageBitmap(null);
            if (this == f41351f9) {
                f41351f9 = null;
            } else {
                f41350e9 = null;
            }
            U1();
        }
    }

    public final void J2() {
        cn cnVar;
        TLRPC.Chat chat;
        wq0 wq0Var = this.d;
        if (wq0Var != null) {
            if (wq0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.O4)) {
                if (this.f41468n && (cnVar = this.f41447k4) != null && (chat = cnVar.f44432e) != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.v4.K(this.D, org.telegram.messenger.id.M0(2131745310, "Slowmode"), org.telegram.messenger.id.M0(2131745303, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.O4, j1());
            boolean x10 = this.d.x(this.O4);
            this.N0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f41486p1.i(k10);
                    this.f41478o1.y0(k10);
                } else {
                    this.f41486p1.s(k10);
                    if (k10 == 0) {
                        this.f41486p1.g(0);
                    }
                }
            }
            y3();
        }
    }

    public final void K0() {
        if (this.B4.m() == null && !this.f41408f7.isEmpty() && this.f41375c2 != 1) {
            String str = this.B4.Q;
            String str2 = this.f41553w4;
            if (str2 == null || !str2.equals(str)) {
                this.f41543v4 = 0;
                org.telegram.messenger.jc p10 = this.B4.p();
                int i7 = this.B4.U;
                if (str != null && p10 != null && p10.f23535c != null) {
                    Utilities.f21336e.c(new org.telegram.ui.Components.qp0(this, p10, i7, str, 13));
                }
            }
        }
    }

    public final void K2() {
        float q10 = this.B4.q();
        float o4 = this.B4.o();
        if (q10 != 0.0f && o4 != 0.0f) {
            float g12 = g1(this.f41526t4);
            float e12 = e1();
            float min = Math.min(e12 / o4, g12 / q10);
            float max = Math.max(g12 / ((int) (q10 * min)), e12 / ((int) (o4 * min)));
            this.Z5 = max;
            t3(max);
        }
    }

    public final void L0() {
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Y7)), this.X7);
        edit.commit();
        B3();
        z3();
    }

    public final void L2(CharSequence charSequence) {
        vq0 vq0Var = this.M;
        this.f41385d4 = charSequence;
        vq0Var.c(charSequence);
        g3(true, false);
    }

    public final void M0() {
        bg.v0 v0Var = this.f41458l7;
        if (v0Var != null) {
            v0Var.b();
            this.f41458l7 = null;
        }
        bg.v0 v0Var2 = this.f41365b2;
        if (v0Var2 != null) {
            v0Var2.b();
            this.f41365b2 = null;
        }
        try {
            if (this.f41410g0.getParent() != null) {
                ((WindowManager) this.D.getSystemService("window")).removeView(this.f41410g0);
                U1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void M2(boolean z9, boolean z10) {
        if (this.f41446k3 != z9) {
            if (z9) {
                this.f41427i0.setTag(1);
            } else {
                this.f41427i0.setTag(null);
            }
            ValueAnimator valueAnimator = this.j3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f41446k3 = z9;
            float f10 = 0.0f;
            int i7 = 0;
            if (z10) {
                if (z9) {
                    this.f41422h3.setVisibility(0);
                }
                float alpha = this.f41422h3.getAlpha();
                if (z9) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new dn0(this, 0));
                ofFloat.addListener(new pp0(this, z9, 0));
                this.j3 = ofFloat;
                ofFloat.start();
            } else {
                er0 er0Var = this.f41422h3;
                if (!z9) {
                    i7 = 8;
                }
                er0Var.setVisibility(i7);
                er0 er0Var2 = this.f41422h3;
                if (z9) {
                    f10 = 1.0f;
                }
                er0Var2.setAlpha(f10);
            }
            if (this.f41445k2 && this.i7 == null) {
                if (z9) {
                    this.f41477o0.S(9);
                } else {
                    this.f41477o0.t(9);
                }
            }
        }
    }

    public final void N0(android.graphics.Canvas r51, org.telegram.ui.Components.ca r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N0(android.graphics.Canvas, org.telegram.ui.Components.ca, int, int, boolean, boolean, boolean):void");
    }

    public final boolean N2(int i7) {
        sq0 sq0Var = this.i7;
        if (sq0Var != null) {
            if (sq0Var.a(i7) || this.i7.e(i7)) {
                int i10 = org.telegram.messenger.iz.f23385a;
                if (org.telegram.messenger.sc.e(1024)) {
                    File b10 = this.i7.b(i7);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.iz.B0 && (this.i7.d(i7) instanceof TLRPC.Document)) {
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

    public final void O0(android.graphics.Canvas r24, float r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.O0(android.graphics.Canvas, float, float):void");
    }

    public final boolean O1() {
        if (this.f41375c2 != 11) {
            int i7 = this.O4;
            if (i7 >= 0) {
                ArrayList arrayList = this.f41408f7;
                if (i7 < arrayList.size()) {
                    wq0 wq0Var = this.d;
                    if (wq0Var != null && !wq0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.O4);
                    if (obj instanceof org.telegram.messenger.gf) {
                        return ((org.telegram.messenger.gf) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void P0(Canvas canvas) {
        boolean z9;
        float d;
        int i7;
        if (this.R4) {
            if (!org.telegram.messenger.iz.f23392c0) {
                d = 1.0f;
            } else {
                int i10 = this.f41463m4;
                if (i10 != 0 && i10 != 2 && i10 != 3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                d = this.D8.d(z9);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.g0.f22557m * 1.5f));
            int height = this.P0.getHeight() + org.telegram.messenger.g0.f22558n;
            if (this.U1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(20.0f) + (this.U1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f41391e0.getWidth(), this.f41391e0.getHeight() + org.telegram.messenger.g0.f22558n, (int) (d * (this.L0.getAlpha() - 127) * 2.007874f), 31);
            this.F7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.F7.addRect(0.0f, 0.0f, this.f41391e0.getWidth(), f10, direction);
            this.F7.addRect(0.0f, (this.f41391e0.getHeight() + org.telegram.messenger.g0.f22558n) - i11, this.f41391e0.getWidth(), this.f41391e0.getHeight() + org.telegram.messenger.g0.f22558n, direction);
            canvas.clipPath(this.F7);
            canvas.drawColor(-16777216);
            N0(canvas, this.f41373c0, 0, 0, true, true, false);
            canvas.save();
            this.K7.reset();
            this.K7.postScale(1.0f, f10 / 16.0f);
            this.I7.setLocalMatrix(this.K7);
            this.G7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f41391e0.getWidth(), f10, this.G7);
            this.L7.reset();
            this.L7.postScale(1.0f, i11 / 16.0f);
            this.L7.postTranslate(0.0f, (this.f41391e0.getHeight() - i11) + org.telegram.messenger.g0.f22558n);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f41391e0.getHeight() + org.telegram.messenger.g0.f22558n) - i11, this.f41391e0.getWidth(), this.f41391e0.getHeight() + org.telegram.messenger.g0.f22558n, this.H7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean P1() {
        if (this.f41390e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void P2(AlertDialog$Builder alertDialog$Builder) {
        if (this.D != null) {
            try {
                org.telegram.ui.ActionBar.u1 u1Var = this.P1;
                if (u1Var != null) {
                    u1Var.dismiss();
                    this.P1 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
                this.P1 = p10;
                p10.setCanceledOnTouchOutside(true);
                this.P1.setOnDismissListener(new q5(this, 10));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void Q0(android.graphics.Canvas r10, float r11, float r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Q0(android.graphics.Canvas, float, float, float, float):void");
    }

    public final void Q1() {
        WindowManager.LayoutParams layoutParams = this.f41382d0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.D.getSystemService("window")).updateViewLayout(this.f41410g0, this.f41382d0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f41410g0.setFocusable(true);
        this.f41391e0.setFocusable(true);
    }

    public final boolean Q2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f41455l4;
        if ((f2Var instanceof cn) && org.telegram.messenger.t3.V(((cn) f2Var).f44432e)) {
            org.telegram.ui.Components.cc f10 = new org.telegram.ui.Components.hc(frameLayout, this.f41541v2).f(org.telegram.messenger.qp.s1(this.T).U4, new en0(this, 29));
            f10.v = new yn0(this, 0);
            this.f41466m7 = f10.j();
            return true;
        }
        return false;
    }

    public final void R1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z9) {
        boolean z10;
        int i7;
        Bitmap.CompressFormat b12 = b1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z10 = true;
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
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
        Paint paint = Z8;
        if (z9) {
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
        createBitmap.compress(b12, i7, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void R2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.D, this.f41541v2);
        String M0 = org.telegram.messenger.id.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), null);
        org.telegram.messenger.ij ijVar = this.S4;
        if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.f23262k) && org.telegram.messenger.w7.G(this.S4.I1).S(this.f41368b5[0])) {
            u1Var.T = org.telegram.messenger.id.M0(2131747204, null);
        } else {
            u1Var.T = org.telegram.messenger.id.M0(2131747218, null);
        }
        P2(alertDialog$Builder);
    }

    public final void S0(TLRPC.Document document, TLRPC.Document document2, boolean z9, org.telegram.messenger.v10 v10Var) {
        float f10;
        this.f41528t7 = document;
        this.f41520s7 = document2;
        this.f41537u7 = z9;
        this.f41546v7 = false;
        this.f41556w7 = v10Var;
        this.f41359a6 = 0.0f;
        this.f41397e6 = 0.0f;
        if (this.f41481o5 != null) {
            jq0 jq0Var = this.f41564x5;
            if (jq0Var != null) {
                jq0Var.m(false, false);
            }
            this.f41481o5.b();
            ArrayList arrayList = this.f41499q5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f41528t7 != null) {
            ArrayList arrayList2 = this.f41499q5;
            if (arrayList2 == null) {
                this.f41499q5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.f41528t7;
            int i7 = this.T;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i7).m0(documentAttribute.stickerset, true);
                        if (m0 != null && m0.packs != null) {
                            for (int i11 = 0; i11 < m0.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = m0.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f26962id)) && org.telegram.messenger.i6.g(tL_stickerPack.emoticon) != null) {
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
                this.f41499q5.addAll(arrayList3);
            }
        }
        jq0 jq0Var2 = this.s5;
        if (jq0Var2 != null) {
            jq0Var2.setCutOutState(false);
        }
        X2(true, false);
        ImageView imageView = this.f41374c1;
        if (imageView != null) {
            if (this.f41537u7) {
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

    public final void S2(final org.telegram.ui.Components.uc ucVar, boolean z9, boolean z10, final float[] fArr) {
        float f10;
        float f11;
        int i7;
        wq0 wq0Var = this.d;
        if (wq0Var != null && wq0Var.l()) {
            f10 = 175.0f;
        } else {
            f10 = 58.0f;
        }
        float L = org.telegram.messenger.g0.L(f10);
        float f12 = 1.0f;
        if (ucVar == this.V1) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f13 = L * f11;
        Integer num = null;
        if (!z10) {
            ucVar.animate().setListener(null).cancel();
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            ucVar.setVisibility(i7);
            if (z9) {
                f13 = 0.0f;
            }
            ucVar.setTranslationY(f13);
            float alpha = this.P0.getAlpha();
            if (!z9) {
                f12 = 0.0f;
            }
            fArr[0] = f12;
            ucVar.setAlpha(alpha * f12);
        } else if (z9 && ucVar.getTag() == null) {
            if (ucVar.getVisibility() != 0) {
                ucVar.setVisibility(0);
                ucVar.setAlpha(this.P0.getAlpha());
                ucVar.setTranslationY(f13);
            }
            ucVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f44083b;

                {
                    this.f44083b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f44083b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ucVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.Q7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f41392e1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f41402f1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f41411g1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f44083b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ucVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.Q7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f41392e1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f41402f1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f41411g1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        } else if (!z9 && ucVar.getTag() != null) {
            ucVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f44083b;

                {
                    this.f44083b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f44083b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ucVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.Q7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f41392e1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f41402f1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f41411g1.setTranslationY(photoViewer.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f44083b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ucVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.Q7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f41392e1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f41402f1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f41411g1.setTranslationY(photoViewer2.U1.getAlpha() * (-jg.g.e(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new wg(3, ucVar)).start();
        }
        if (z9) {
            num = 1;
        }
        ucVar.setTag(num);
    }

    public final void T0() {
        ti.o oVar = this.O8;
        if (oVar != null && oVar.d()) {
            return;
        }
        this.O8 = l2.i.d().k(this.W8);
    }

    public final void T1(android.graphics.Canvas r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(android.graphics.Canvas):void");
    }

    public final void T2(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        wq0 wq0Var = this.d;
        boolean z13 = false;
        if (wq0Var != null && wq0Var.A()) {
            z11 = true;
        } else {
            z11 = false;
        }
        bp0 bp0Var = this.U1;
        if (z9 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        S2(bp0Var, z12, z10, this.f41566x7);
        cp0 cp0Var = this.V1;
        if (z9 && z11) {
            z13 = true;
        }
        S2(cp0Var, z13, z10, this.f41576y7);
    }

    public final void U1() {
        Activity activity = this.D;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).Z0.remove(this.f41515s1);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f41455l4;
        if (f2Var != null && f2Var.getFragmentView() != null) {
            this.f41457l6 = 1.0f;
            View fragmentView = this.f41455l4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.di diVar = this.f41355a2;
            if (diVar != null) {
                org.telegram.ui.ActionBar.l2 l2Var = diVar.f28627c;
                l2Var.setScaleX(1.0f);
                l2Var.setScaleY(1.0f);
            }
        }
    }

    public final void U2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U2(boolean, boolean):void");
    }

    public final void V1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.F2 != null && this.S4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.F2.U() == -9223372036854775807L) {
                        this.Z2 = intValue / ((float) this.S4.L0());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.F2.p0(j3);
                    this.f41488p3.h(true, ((float) j3) / ((float) this.F2.U()));
                    this.f41497q3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.D instanceof LaunchActivity) {
                    yw ywVar = new yw(null);
                    ywVar.f52281o2 = url;
                    ((LaunchActivity) this.D).u0(ywVar, false, true);
                    z0(false, false);
                    return;
                }
                return;
            } else if (this.f41447k4 != null && ((clickableSpan instanceof org.telegram.ui.Components.e41) || org.telegram.messenger.g0.J3(url))) {
                org.telegram.ui.Components.v4.n0(this.f41447k4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void V2(boolean z9) {
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
        if (z9 && this.G3 && this.H3 && !this.E3 && (textureView = this.B2) != null) {
            this.N4 = textureView.getBitmap();
        }
        if (z9) {
            this.Z7 = this.X7;
        }
        AnimatorSet animatorSet = this.T7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.T7 = new AnimatorSet();
        float f20 = 0.0f;
        if (z9) {
            if (this.R4) {
                this.f41435j0.setVisibility(0);
                View view = this.f41435j0;
                if (this.f41375c2 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f41435j0;
                if (this.f41375c2 == 11) {
                    i10 = 1711276032;
                } else {
                    i10 = 2130706432;
                }
                view2.setBackgroundColor(i10);
            }
            this.N7.setTag(1);
            AnimatorSet animatorSet2 = this.T7;
            bi.m5 m5Var = this.P0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.U1.getEditTextHeight() + m5Var.getHeight();
            if (this.f41505r1) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m5Var, property, 0.0f, editTextHeight + i7);
            bi.m5 m5Var2 = this.P0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m5Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.S0, property, 0.0f, org.telegram.messenger.g0.L(158.0f));
            View view3 = this.f41435j0;
            if (this.R4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.N7.setTag(null);
            AnimatorSet animatorSet3 = this.T7;
            zq0 zq0Var = this.N7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zq0Var, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.O7, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            View view4 = this.f41435j0;
            Property property4 = View.ALPHA;
            if (this.R4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.T7.addListener(new pp0(this, z9, 3));
        this.T7.setDuration(200L);
        this.T7.setInterpolator(org.telegram.messenger.g0.G);
        this.T7.start();
        float f21 = 0.25f;
        if (this.f41392e1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f41392e1.animate();
            if (z9) {
                f15 = 0.25f;
            } else {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f15);
            if (z9) {
                f16 = 0.25f;
            } else {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z9) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            scaleY.alpha(f17).setDuration(200L);
        }
        if (this.f41402f1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f41402f1.animate();
            if (z9) {
                f12 = 0.25f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f12);
            if (z9) {
                f13 = 0.25f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f13);
            if (z9) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            scaleY2.alpha(f14).setDuration(200L);
        }
        if (this.f41411g1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f41411g1.animate();
            if (z9) {
                f11 = 0.25f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX3 = animate3.scaleX(f11);
            if (!z9) {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleY3 = scaleX3.scaleY(f21);
            if (!z9) {
                f20 = 1.0f;
            }
            scaleY3.alpha(f20).setDuration(200L);
        }
    }

    public final int W0(int i7) {
        if (i7 != 1 && (i7 != 0 || this.f41375c2 != 1)) {
            if (i7 != 0 && i7 != 5 && i7 != 4 && i7 != 3) {
                return org.telegram.messenger.g0.L(14.0f);
            }
            return 0;
        }
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void W1(yq0 yq0Var) {
        if (this.f41532u2) {
            l2(true);
        }
        org.telegram.messenger.ij ijVar = this.S4;
        if (ijVar != null && !ijVar.P) {
            org.telegram.messenger.w7.G(this.T).f(this.S4.F0());
        }
        this.f41390e = false;
        this.f41400f = false;
        this.f41412g2 = false;
        this.f41508r4 = true;
        this.S4 = null;
        this.X4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f41358a5 = null;
        this.f41424h5 = null;
        this.f41386d5 = null;
        this.f41496q2 = null;
        VideoAds videoAds = this.T4;
        if (videoAds != null) {
            videoAds.stop();
            this.T4 = null;
        }
        if (this.f41422h3 != null) {
            M2(false, false);
        }
        xp0 xp0Var = this.T1;
        if (xp0Var != null) {
            xp0Var.scrollTo(0, 0);
        }
        this.f41375c2 = 0;
        this.d2 = false;
        this.f41393e2 = false;
        this.f41403f2 = false;
        this.f41421h2 = false;
        org.telegram.messenger.jc jcVar = this.f41432i5;
        if (jcVar != null) {
            jcVar.a();
            this.f41432i5 = null;
        }
        this.f41355a2 = null;
        bg.v0 v0Var = this.f41365b2;
        if (v0Var != null) {
            v0Var.b();
            this.f41365b2 = null;
        }
        org.telegram.ui.Components.v5 v5Var = this.f41437j2;
        if (v5Var != null) {
            v5Var.w(this.f41391e0);
            this.f41437j2 = null;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            xo0 xo0Var = this.W0[i7];
            if (xo0Var != null) {
                xo0Var.d(-1, false, true);
            }
        }
        m2(0);
        yo0 yo0Var = this.R7;
        if (yo0Var != null) {
            yo0Var.a();
        }
        this.n1.d(0, false);
        this.B4.w0(null);
        this.E4.o();
        this.A4.w0(null);
        this.D4.o();
        this.C4.w0(null);
        this.F4.o();
        this.f41391e0.post(new hn0(this, yq0Var, 0));
        wq0 wq0Var = this.d;
        if (wq0Var != null) {
            wq0Var.G();
        }
        org.telegram.ui.Components.m20 m20Var = this.l1;
        m20Var.d.clear();
        m20Var.f35916e.clear();
        m20Var.f35914c.clear();
        wq0 wq0Var2 = this.d;
        if (wq0Var2 != null) {
            wq0Var2.D();
        }
        this.d = null;
        this.f41486p1.f();
        this.i7 = null;
        this.f41508r4 = false;
        this.f41476n8 = 0.0f;
        this.f41484o8 = 1.0f;
        if (yq0Var != null) {
            yq0Var.f52159a.O0(true, true);
        }
        cn cnVar = this.f41447k4;
        if (cnVar != null) {
            cnVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.N4;
        if (bitmap != null) {
            bitmap.recycle();
            this.N4 = null;
        }
    }

    public final void W2() {
        long a10;
        if (this.D != null) {
            cn cnVar = this.f41447k4;
            if (cnVar != null) {
                a10 = cnVar.a();
            } else {
                wq0 wq0Var = this.d;
                if (wq0Var != null) {
                    a10 = wq0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a10;
            org.telegram.ui.Components.v4.H(this.D, j3, -1L, 0, false, new nn0(this), null, new org.telegram.ui.Components.s4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false)), null);
        }
    }

    public final int X0(int i7) {
        int i10 = 0;
        if (i7 >= 0) {
            if (i7 != 1 && (i7 != 0 || this.f41375c2 != 1)) {
                if (i7 == 3 && this.L1 != null) {
                    int L = org.telegram.messenger.g0.L(8.0f);
                    if (!this.f41513s) {
                        i10 = org.telegram.messenger.g0.f22557m;
                    }
                    return this.L1.getAdditionalTop() + L + i10;
                } else if (i7 != 0 && i7 != 4 && i7 != 5) {
                    int L2 = org.telegram.messenger.g0.L(14.0f);
                    if (!this.f41513s) {
                        i10 = org.telegram.messenger.g0.f22557m;
                    }
                    return L2 + i10;
                }
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                if (!this.f41513s) {
                    i10 = org.telegram.messenger.g0.f22557m;
                }
                return L3 + i10;
            }
        }
        return 0;
    }

    public final void X1(org.telegram.messenger.ij r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.hc r24, org.telegram.messenger.hc r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.yq0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X1(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.hc, org.telegram.messenger.hc, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.yq0):void");
    }

    public final void X2(boolean z9, boolean z10) {
        Integer num;
        boolean z11;
        Integer num2;
        boolean z12;
        boolean z13;
        float f10;
        int i7;
        float f11;
        int i10;
        int i11;
        float f12;
        boolean z14 = true;
        Integer num3 = 1;
        int i12 = 8;
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (!z10) {
            this.f41481o5.animate().setListener(null).cancel();
            tg.c2 c2Var = this.f41481o5;
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c2Var.setVisibility(i10);
            this.f41481o5.setAlpha(this.P0.getAlpha());
            this.f41509r5.animate().setListener(null).cancel();
            di.b3 b3Var = this.f41509r5;
            if (z9) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b3Var.setVisibility(i11);
            di.b3 b3Var2 = this.f41509r5;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            b3Var2.setAlpha(f12);
        } else if (z9 && this.f41481o5.getTag() == null) {
            this.f41481o5.animate().setListener(null).cancel();
            this.f41509r5.animate().setListener(null).cancel();
            if (this.f41481o5.getVisibility() != 0) {
                this.f41481o5.setVisibility(0);
                this.f41481o5.animate().alpha(1.0f).start();
                this.f41509r5.setVisibility(0);
                this.f41509r5.animate().alpha(1.0f).start();
            }
        } else if (!z9 && this.f41481o5.getTag() != null) {
            this.f41481o5.animate().setListener(null).cancel();
            this.f41481o5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.t9(this.f41481o5)).start();
            this.f41509r5.animate().setListener(null).cancel();
            this.f41509r5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.t9(this.f41509r5)).start();
        }
        tg.c2 c2Var2 = this.f41481o5;
        if (z9) {
            num = num3;
        } else {
            num = null;
        }
        c2Var2.setTag(num);
        if (z9 && this.s5.m0 != 1 && !this.f41537u7) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            this.s5.animate().setListener(null).cancel();
            jq0 jq0Var = this.s5;
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            jq0Var.setVisibility(i7);
            jq0 jq0Var2 = this.s5;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jq0Var2.setAlpha(f11);
        } else if (z11 && this.s5.getTag() == null) {
            this.s5.animate().setListener(null).cancel();
            if (this.s5.getVisibility() != 0) {
                this.s5.setVisibility(0);
            }
            this.s5.animate().alpha(1.0f).start();
        } else if (!z11 && this.s5.getTag() != null) {
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.t9(this.s5)).start();
        }
        jq0 jq0Var3 = this.s5;
        if (z11) {
            num2 = num3;
        } else {
            num2 = null;
        }
        jq0Var3.setTag(num2);
        if (z9 && this.s5.m0 == 1 && !this.f41537u7) {
            z12 = true;
        } else {
            z12 = false;
        }
        U2(z12, z10);
        tg.c2 c2Var3 = this.f41481o5;
        if (z9 && this.s5.m0 == 1 && this.f41564x5.f47063s0 && !this.f41535u5.f47063s0 && !this.f41544v5.f47063s0) {
            z13 = true;
        } else {
            z13 = false;
        }
        c2Var3.setOutlineVisible(z13);
        if (!z9 || this.s5.m0 != 1 || this.f41535u5.f47063s0 || this.f41544v5.f47063s0) {
            z14 = false;
        }
        if (!z10) {
            this.f41564x5.animate().setListener(null).cancel();
            jq0 jq0Var4 = this.f41564x5;
            if (z14) {
                i12 = 0;
            }
            jq0Var4.setVisibility(i12);
            jq0 jq0Var5 = this.f41564x5;
            if (z14) {
                f13 = 1.0f;
            }
            jq0Var5.setAlpha(f13);
            jq0 jq0Var6 = this.f41564x5;
            if (z14) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            jq0Var6.setScaleX(f10);
            jq0 jq0Var7 = this.f41564x5;
            if (!z14) {
                f14 = 0.8f;
            }
            jq0Var7.setScaleY(f14);
        } else if (z14 && this.f41564x5.getTag() == null) {
            this.f41564x5.animate().setListener(null).cancel();
            if (this.f41564x5.getVisibility() != 0) {
                this.f41564x5.setVisibility(0);
            }
            org.telegram.messenger.camera.q.l(this.f41564x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.xq.h, 400L);
        } else if (!z14 && this.f41564x5.getTag() != null) {
            this.f41564x5.animate().setListener(null).cancel();
            org.telegram.messenger.camera.q.l(this.f41564x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new org.telegram.ui.Components.t9(this.f41564x5)), org.telegram.ui.Components.xq.h, 400L);
        }
        jq0 jq0Var8 = this.f41564x5;
        if (!z14) {
            num3 = null;
        }
        jq0Var8.setTag(num3);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        if (i7 == 0) {
            float f12 = 1.0f - f10;
            this.T0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f12);
            this.T0.setAlpha(f10);
            org.telegram.ui.Components.wd0 wd0Var = this.T0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wd0Var.setVisibility(i10);
            if (this.f41403f2) {
                bi.m5 m5Var = this.P0;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                m5Var.setVisibility(i11);
                this.P0.setAlpha(f12);
                this.P0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
                li.w1 w1Var = this.S0;
                if (i13 < 0) {
                    i12 = 0;
                }
                w1Var.setVisibility(i12);
                this.S0.setAlpha(f12);
                this.S0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
            }
        }
    }

    public final int Y0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y0(boolean):int");
    }

    public final boolean Y1(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(android.view.MotionEvent):boolean");
    }

    public final void Y2(boolean z9) {
        Integer num;
        float f10;
        float f11;
        eq0 eq0Var;
        if (!z9 || this.f41507r3.getTag() == null) {
            if (!z9 && this.f41507r3.getTag() == null) {
                return;
            }
            if (z9 && !this.f41507r3.f31737s && ((eq0Var = this.f41401f0) == null || !eq0Var.f32248y || eq0Var.f32246w.isEmpty())) {
                this.f41525t3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f41517s3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            lp0 lp0Var = this.f41507r3;
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            lp0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41517s3 = animatorSet2;
            lp0 lp0Var2 = this.f41507r3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lp0Var2, property, f10);
            lp0 lp0Var3 = this.f41507r3;
            Property property2 = View.SCALE_X;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lp0Var3, property2, f11);
            lp0 lp0Var4 = this.f41507r3;
            Property property3 = View.SCALE_Y;
            if (!z9) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(lp0Var4, property3, f13);
            lp0 lp0Var5 = this.f41507r3;
            Property property4 = View.TRANSLATION_Y;
            if (!z9) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(lp0Var5, property4, f12));
            this.f41517s3.setDuration(380L);
            this.f41517s3.setInterpolator(org.telegram.ui.Components.xq.h);
            this.f41517s3.addListener(new ip0(this, 1));
            this.f41517s3.start();
        }
    }

    public final ClippingImageView[] Z0(yq0 yq0Var) {
        int i7;
        if (!org.telegram.messenger.g0.Q1() && yq0Var != null && yq0Var.f52169m != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i7 + 1];
        clippingImageViewArr[0] = this.f41419h0;
        if (i7 != 0) {
            ClippingImageView clippingImageView = yq0Var.f52169m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(yq0Var.f52170n);
        }
        return clippingImageViewArr;
    }

    public final void Z1(ArrayList arrayList, int i7, long j3, long j10, long j11, wq0 wq0Var) {
        c2((org.telegram.messenger.ij) arrayList.get(i7), null, null, null, arrayList, null, null, i7, wq0Var, null, j3, j10, j11, true, null, null);
    }

    public final void Z2(boolean z9, boolean z10) {
        int i7;
        Integer num = null;
        if (!z10) {
            this.Q7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.Q7;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            this.R7.setTranslationY(0.0f);
            this.Q7.setAlpha(this.P0.getAlpha());
        } else if (z9 && this.Q7.getTag() == null) {
            if (this.Q7.getVisibility() != 0) {
                this.Q7.setVisibility(0);
                this.Q7.setAlpha(this.P0.getAlpha());
                this.R7.setTranslationY(org.telegram.messenger.g0.L(58.0f));
            }
            ObjectAnimator objectAnimator = this.f41585z7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f41585z7.cancel();
            }
            yo0 yo0Var = this.R7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yo0Var, View.TRANSLATION_Y, yo0Var.getTranslationY(), 0.0f);
            this.f41585z7 = ofFloat;
            ofFloat.setDuration(220L);
            this.f41585z7.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.f41585z7.start();
        } else if (!z9 && this.Q7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.f41585z7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.f41585z7.cancel();
            }
            yo0 yo0Var2 = this.R7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yo0Var2, View.TRANSLATION_Y, yo0Var2.getTranslationY(), org.telegram.messenger.g0.L(58.0f));
            this.f41585z7 = ofFloat2;
            ofFloat2.addListener(new org.telegram.ui.Components.t9(this.Q7));
            this.f41585z7.setDuration(220L);
            this.f41585z7.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.f41585z7.start();
        }
        FrameLayout frameLayout2 = this.Q7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.Q7.setTranslationY(this.P0.getTranslationY() - (this.U1.getAlpha() * jg.g.e(46.0f, this.U1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.Q7;
        if (z9) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    public final org.telegram.ui.Components.uc a1() {
        wq0 wq0Var = this.d;
        if (wq0Var != null && wq0Var.A()) {
            return this.V1;
        }
        return this.U1;
    }

    public final void a2(ArrayList arrayList, int i7, wq0 wq0Var) {
        c2(null, null, null, null, null, arrayList, null, i7, wq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void a3() {
        org.telegram.ui.Components.u51 u51Var;
        if (this.f41505r1 && (u51Var = this.F2) != null && !u51Var.d0()) {
            if (!this.I4 || !O1() || this.f41375c2 == 1) {
                if (!this.f41503r || this.f41375c2 == 1) {
                    this.F2.B0(0.0f);
                }
                this.G2 = false;
                n3();
            }
        }
    }

    public final Bitmap.CompressFormat b1() {
        if (this.f41375c2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void b2(TLRPC.FileLocation fileLocation, org.telegram.messenger.hc hcVar, pq0 pq0Var) {
        c2(null, fileLocation, hcVar, null, null, null, null, 0, pq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.b3(int):void");
    }

    public final void c0(float f10, float f11, float f12, boolean z9) {
        if (this.Z5 == f10 && this.W5 == f11 && this.X5 == f12) {
            return;
        }
        this.Q6 = z9;
        this.f41387d6 = f10;
        this.f41369b6 = f11;
        this.f41379c6 = f12;
        this.f41465m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41482o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f35969g, 0.0f, 1.0f));
        this.f41482o6.setInterpolator(this.f41519s6);
        this.f41482o6.setDuration(250);
        this.f41482o6.addListener(new ip0(this, 7));
        this.f41482o6.start();
    }

    public final int c1(int i7, boolean z9) {
        int measuredHeight;
        boolean z10;
        if (!z9 && !(z10 = this.f41513s)) {
            measuredHeight = (org.telegram.messenger.g0.f22558n - this.f41516s2.bottom) + org.telegram.messenger.g0.f22563q.y;
            if ((i7 == 0 || i7 == 4 || i7 == 5) && this.f41375c2 != 1 && !z10) {
                measuredHeight += org.telegram.messenger.g0.f22557m;
            }
        } else {
            measuredHeight = this.f41391e0.getMeasuredHeight();
        }
        if ((i7 == 0 && this.f41375c2 == 1) || i7 == 1) {
            return measuredHeight - org.telegram.messenger.g0.L(144.0f);
        }
        if (i7 == 2) {
            return measuredHeight - org.telegram.messenger.g0.L(214.0f);
        }
        if (i7 == 3) {
            return measuredHeight - (this.L1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.L1.getAdditionalBottom() + org.telegram.messenger.g0.L(48.0f))));
        }
        return measuredHeight;
    }

    public final boolean c2(org.telegram.messenger.ij r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.hc r19, org.telegram.messenger.hc r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.wq0 r25, org.telegram.ui.cn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.sq0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c2(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.hc, org.telegram.messenger.hc, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.wq0, org.telegram.ui.cn, long, long, long, boolean, org.telegram.ui.sq0, java.lang.Integer):boolean");
    }

    public final void c3(int i7, boolean z9) {
        if (this.S4 != null) {
            l2(false);
            org.telegram.messenger.w7.G(this.T).f(this.S4.F0());
        } else if (this.f41424h5 != null) {
            TLObject d = this.i7.d(this.O4);
            if (d instanceof TLRPC.Document) {
                l2(false);
                org.telegram.messenger.w7.G(this.T).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.m20 m20Var = this.l1;
        if (m20Var != null) {
            m20Var.setAnimateBackground(true);
        }
        this.X2 = false;
        z2(this.O4 + i7, z9, true, false);
        if (O2(this.S4) || N2(this.O4)) {
            this.X2 = true;
            S1(true);
            u0(0, true);
        }
        s0();
        try {
            d1.f.b(0);
            if (wf.b.Z().d0()) {
                wf.b.Z().h0(i1());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence d0() {
        int i7;
        boolean z9;
        TLRPC.EncryptedChat encryptedChat;
        if (P1() && this.d != null && (i7 = this.O4) >= 0) {
            ArrayList arrayList = this.f41408f7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                CharSequence text = a1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f41483o7 && !TextUtils.equals(this.f41492p7, text) && this.d.S(this.O4) != 0 && this.d.H() > 0) {
                    this.f41483o7 = false;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.T);
                cn cnVar = this.f41447k4;
                if (cnVar != null && ((encryptedChat = cnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ArrayList W = b02.W(charSequenceArr, z9, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f41492p7 = charSequence;
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    gfVar.f26844a = charSequence;
                    gfVar.f26855n = W;
                } else if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    kfVar.I = charSequence;
                    kfVar.f26855n = W;
                }
                if (text.length() != 0 && !this.d.x(this.O4)) {
                    J2();
                }
                wq0 wq0Var = this.d;
                if (wq0Var != null) {
                    wq0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d1() {
        B1();
    }

    public final boolean d2(org.telegram.messenger.ij ijVar, cn cnVar, long j3, long j10, long j11, pq0 pq0Var) {
        return c2(ijVar, null, null, null, null, null, null, 0, pq0Var, cnVar, j3, j10, j11, true, null, null);
    }

    public final void d3() {
        float f10;
        boolean z9;
        int i7;
        wp0 wp0Var;
        int i10;
        wp0 wp0Var2;
        this.f41491p6 = null;
        this.P0.setVisibility(8);
        this.S0.setVisibility(8);
        this.f41469n0.setVisibility(8);
        this.f41392e1.setVisibility(8);
        this.f41402f1.setVisibility(8);
        this.f41411g1.setVisibility(8);
        org.telegram.ui.Components.gd0 gd0Var = this.C1;
        if (gd0Var != null) {
            gd0Var.setVisibility(4);
        }
        this.f41478o1.setVisibility(8);
        this.f41478o1.setAlpha(0.0f);
        this.f41478o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        this.O0.setRotationX(0.0f);
        this.f41478o1.setEnabled(false);
        this.K = false;
        if (this.f41429i2) {
            this.Q1.setVisibility(4);
        }
        int i11 = this.f41375c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.f41408f7.size() > 1)) {
            this.N0.setVisibility(8);
            this.O0.setVisibility(8);
            p3();
        }
        T2(false, true);
        X2(false, true);
        Bitmap n10 = this.B4.n();
        float f11 = this.Z5;
        if (this.f41375c2 == 11) {
            this.f41425h6 = this.X5;
            this.f41416g6 = this.W5;
            this.f41433i6 = f11;
            this.f41440j6 = this.f41359a6;
            this.f41397e6 = 0.0f;
        }
        oq0 oq0Var = this.W4;
        if (n10 != null) {
            int q10 = this.B4.q();
            int o4 = this.B4.o();
            if (this.f41375c2 == 1) {
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f41379c6 = L;
                f10 = 0.0f;
                if (this.L1 != null) {
                    this.f41379c6 = (wp0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i12 = this.D1.f20970i;
                if (i12 == 90 || i12 == 270) {
                    i10 = q10;
                    q10 = o4;
                    float f12 = q10;
                    float f13 = i10;
                    this.f41387d6 = o2(false) * (Math.min(g1(3) / f12, c1(3, false) / f13) / Math.min(g1(this.f41526t4) / f12, e1() / f13));
                    Rect rect = this.f41516s2;
                    this.f41369b6 = (rect.left / 2) - (rect.right / 2);
                    this.f41465m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i10 = o4;
                float f122 = q10;
                float f132 = i10;
                this.f41387d6 = o2(false) * (Math.min(g1(3) / f122, c1(3, false) / f132) / Math.min(g1(this.f41526t4) / f122, e1() / f132));
                Rect rect2 = this.f41516s2;
                this.f41369b6 = (rect2.left / 2) - (rect2.right / 2);
                this.f41465m6 = System.currentTimeMillis();
                this.Q6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -org.telegram.messenger.g0.L(44.0f);
                if (!this.f41513s) {
                    i7 = org.telegram.messenger.g0.f22557m / 2;
                } else {
                    i7 = 0;
                }
                float f14 = i13 + i7;
                this.f41379c6 = f14;
                if (this.L1 != null) {
                    float additionalTop = (wp0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f41379c6 = additionalTop;
                    this.f41379c6 = additionalTop - (this.L1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.ye yeVar = oq0Var.f48506c;
                if (yeVar != null) {
                    int i14 = yeVar.f26642k;
                    if (i14 == 90 || i14 == 270) {
                        o4 = q10;
                        q10 = o4;
                    }
                    q10 = (int) (q10 * yeVar.f26638e);
                    i10 = (int) (o4 * yeVar.f26639f);
                    float f1222 = q10;
                    float f1322 = i10;
                    this.f41387d6 = o2(false) * (Math.min(g1(3) / f1222, c1(3, false) / f1322) / Math.min(g1(this.f41526t4) / f1222, e1() / f1322));
                    Rect rect22 = this.f41516s2;
                    this.f41369b6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f41465m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i10 = o4;
                float f12222 = q10;
                float f13222 = i10;
                this.f41387d6 = o2(false) * (Math.min(g1(3) / f12222, c1(3, false) / f13222) / Math.min(g1(this.f41526t4) / f12222, e1() / f13222));
                Rect rect222 = this.f41516s2;
                this.f41369b6 = (rect222.left / 2) - (rect222.right / 2);
                this.f41465m6 = System.currentTimeMillis();
                this.Q6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        wp0 wp0Var3 = this.L1;
        if (wp0Var3 != null) {
            if (this.f41375c2 == 11 && (oq0Var == null || oq0Var.f48506c == null)) {
                z9 = true;
            } else {
                z9 = false;
            }
            wp0Var3.setDrawShadow(z9);
        }
        this.f41410g0.setClipChildren(true);
        this.f41435j0.setVisibility(4);
        this.f41482o6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.g0.L(12.0f), f10);
        ofFloat.addUpdateListener(new dn0(this, 6));
        ofFloat2.addUpdateListener(new dn0(this, 7));
        this.f41482o6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.m6.f35969g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.L1.m0(true);
        this.f41482o6.setDuration(200L);
        this.f41482o6.addListener(new ip0(this, 3));
        this.f41482o6.start();
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(Canvas canvas, int i7, int i10, int i11, int i12, float f10, og.g gVar, org.telegram.messenger.ye yeVar) {
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
        int i17 = gVar.f20970i;
        if (i17 != 90 && i17 != 270) {
            i16 = i15;
            i15 = i16;
        }
        int i18 = this.f41375c2;
        if (i18 != 1 && (this.f41526t4 == 3 || this.f41474n6 == 3)) {
            f12 = 1.0f;
            f11 = f18;
        } else if (this.f41482o6 != null && (i13 = this.f41474n6) != -1) {
            int i19 = this.f41526t4;
            f11 = f18;
            if (i19 != 1 && i13 != 1 && ((i19 != 2 && i19 != 3) || i13 != -1)) {
                if (i13 == 0) {
                    f12 = this.f41449k6;
                } else {
                    f12 = 1.0f - this.f41449k6;
                }
            }
            f12 = 1.0f;
        } else {
            f11 = f18;
            int i20 = this.f41526t4;
            if (i20 == 2 || i20 == 3) {
                f12 = 0.0f;
            }
            f12 = 1.0f;
        }
        float f23 = gVar.f20971j;
        float f24 = gVar.f20972k;
        float f25 = i16;
        float f26 = 1.0f - f12;
        int B = (int) com.google.android.recaptcha.internal.a.B(1.0f - f23, f26, f23, f25);
        float f27 = i15;
        int i21 = (int) ((((1.0f - f24) * f26) + f24) * f27);
        float f28 = B;
        float f29 = f17 / f28;
        float f30 = i21;
        if (f29 * f30 > f20) {
            f29 = f20 / f30;
        }
        if (i18 != 1 && ((this.f41526t4 != 1 || this.f41474n6 == 0) && yeVar != null)) {
            float f31 = f28 * f29;
            float f32 = f30 * f29;
            if (f19 * f21 <= f20) {
                f22 = f19;
            }
            float z9 = com.google.android.recaptcha.internal.a.z((f11 * f22) / f10, f31, f26, f31);
            float z10 = com.google.android.recaptcha.internal.a.z((f21 * f22) / f10, f32, f26, f32);
            canvas.clipRect((-z9) / 2.0f, (-z10) / 2.0f, z9 / 2.0f, z10 / 2.0f);
        }
        int i22 = this.f41375c2;
        if (i22 == 1 || gVar.f20964a) {
            int i23 = this.f41526t4;
            if (i23 != 1 && i22 != 1) {
                if (yeVar != null) {
                    f15 = yeVar.f26637c;
                    f16 = 1.0f;
                } else {
                    f15 = 1.0f;
                    f16 = 1.0f;
                }
                f13 = ((f29 / min) / com.google.android.recaptcha.internal.a.z(f15, f16, f26, f16)) * f15;
            } else {
                float z11 = gVar.f20968f / com.google.android.recaptcha.internal.a.z(gVar.f20973l, 1.0f, f26, 1.0f);
                float f33 = f17 / f25;
                if (f33 * f27 > f20) {
                    f33 = f20 / f27;
                }
                float f34 = (f33 / min) * z11;
                if (i22 == 1) {
                    if (i23 != 3 && (i14 = this.f41474n6) != 3) {
                        if (i14 == 0) {
                            f14 = gVar.f20974m;
                        }
                    } else {
                        f14 = ((gVar.f20974m - 1.0f) * f26) + 1.0f;
                    }
                    f34 /= f14;
                }
                f13 = f34;
            }
            float f35 = f13;
            canvas.translate(gVar.d * f12, gVar.f20967e * f12);
            canvas.scale(f35, f35);
            canvas.translate(com.google.android.recaptcha.internal.a.D(gVar.f20965b, f25, min, f12), com.google.android.recaptcha.internal.a.D(gVar.f20966c, f27, min, f12));
            float f36 = gVar.f20969g + i17;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            if (this.f41375c2 == 1 && (this.f41526t4 == 3 || this.f41474n6 == 3)) {
                canvas.rotate(f36);
            } else {
                canvas.rotate(f36 * f12);
            }
        }
        int[] iArr = this.M7;
        iArr[0] = B;
        iArr[1] = i21;
    }

    public final int e1() {
        return c1(this.f41526t4, false);
    }

    public final void e2(ArrayList arrayList, int i7, int i10, boolean z9, wq0 wq0Var, cn cnVar) {
        boolean z10;
        org.telegram.ui.Components.j6 j6Var;
        this.f41421h2 = z9;
        li.w1 w1Var = this.S0;
        int i11 = 0;
        if (w1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
            if (i10 != 4 && i10 != 5) {
                if (i10 != 13 && i10 != 14 && i10 != 1 && i10 != 3 && i10 != 10 && i10 != 11) {
                    this.S0.setResourceId(2131232694);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                } else {
                    this.S0.setResourceId(2131231195);
                    this.S0.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                }
            } else {
                this.S0.setResourceId(2131232694);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
            }
            this.S0.setLayoutParams(layoutParams);
        }
        if (i10 != 11 && this.f41481o5 != null) {
            this.f41537u7 = false;
            ImageView imageView = this.f41374c1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            jq0 jq0Var = this.f41564x5;
            if (jq0Var != null) {
                jq0Var.m(false, false);
            }
            this.f41481o5.b();
            ArrayList arrayList2 = this.f41499q5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z11 = this.f41390e;
        BackgroundDrawable backgroundDrawable = this.L0;
        if (z11 && this.f41375c2 != i10 && i10 == 1) {
            this.f41375c2 = i10;
            this.f41532u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = wq0Var;
            this.H5 = 0L;
            this.D5 = 0L;
            this.f41486p1.f();
            this.i7 = null;
            if (this.T6 == null) {
                this.T6 = VelocityTracker.obtain();
            }
            this.f41390e = true;
            this.f41400f = true;
            m3(false, false);
            this.f41453l2 = false;
            B0();
            g3(false, false);
            this.f41384d3 = 0.0f;
            this.U2 = false;
            this.T2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f41391e0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
            C1();
            w2();
        } else if (z11 && this.f41375c2 != i10 && i10 == 11) {
            this.f41375c2 = i10;
            this.f41532u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = wq0Var;
            this.H5 = 0L;
            this.D5 = 0L;
            this.f41486p1.f();
            this.i7 = null;
            if (this.T6 == null) {
                this.T6 = VelocityTracker.obtain();
            }
            this.f41390e = true;
            this.f41400f = true;
            m3(false, false);
            this.f41384d3 = 0.0f;
            this.U2 = false;
            this.T2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f41391e0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
        } else {
            this.f41375c2 = i10;
            if (i10 == 12) {
                this.f41375c2 = 0;
                this.d2 = true;
            }
            int i12 = this.f41375c2;
            if (i12 == 14) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41403f2 = z10;
            if (i12 == 13 || z10) {
                this.f41375c2 = 0;
                this.f41393e2 = true;
            }
            this.f41352a.a(z10, false);
            if (this.f41375c2 == 11) {
                this.f41435j0.setBackgroundColor(-16777216);
            }
            vq0 vq0Var = this.M;
            if (vq0Var != null && (j6Var = vq0Var.d) != null) {
                if (this.f41393e2) {
                    i11 = 8;
                }
                j6Var.setVisibility(i11);
            }
            c2(null, null, null, null, null, null, arrayList, i7, wq0Var, cnVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void e3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e3():void");
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f0():void");
    }

    public final int f1() {
        return g1(this.f41526t4);
    }

    public final void f2() {
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            u51Var.g0();
            return;
        }
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null) {
            eq0Var.f();
        }
    }

    public final void f3() {
        AtomicInteger atomicInteger;
        long a10;
        boolean m10;
        f6.q e10;
        f6.q e11;
        float f10;
        int i7;
        f6.q e12;
        boolean z9;
        if (!P1()) {
            return;
        }
        this.N8 = true;
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            if (!d1.f.u() && !this.f41503r) {
                z9 = false;
            } else {
                z9 = true;
            }
            u51Var.t0(z9);
        }
        if (this.F2 != null && d1.f.u() && ((atomicInteger = d1.f.f7943b) == null || atomicInteger.get() <= 0)) {
            h6.h e13 = d1.f.e();
            if (e13 == null) {
                a10 = -1;
            } else {
                a10 = e13.a();
            }
            if (a10 >= 0 && Math.abs(this.F2.S() - a10) > 1000) {
                this.F2.p0(a10);
            }
            h6.h e14 = d1.f.e();
            if (e14 == null) {
                m10 = false;
            } else if (d1.f.f7942a == 0) {
                m10 = !e14.l();
            } else {
                m10 = e14.m();
            }
            if (m10) {
                this.F2.h0();
            } else {
                this.F2.g0();
            }
            if (this.E != null) {
                float g10 = d1.f.g();
                h6.h e15 = d1.f.e();
                float f11 = 0.5f;
                if (e15 == null || (e11 = e15.e()) == null) {
                    f10 = 0.5f;
                } else {
                    f10 = (float) e11.f11315r;
                }
                if (Math.abs(g10 - f10) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.E.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = audioManager.getStreamMinVolume(3);
                    } else {
                        i7 = 0;
                    }
                    float f12 = streamMaxVolume - i7;
                    h6.h e16 = d1.f.e();
                    if (e16 != null && (e12 = e16.e()) != null) {
                        f11 = (float) e12.f11315r;
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
        wq wqVar = this.f41549w0;
        if (wqVar != null) {
            wqVar.a(d1.f.u());
        }
        this.N8 = false;
    }

    public final void g0(android.graphics.Bitmap r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g0(android.graphics.Bitmap):void");
    }

    public final int g1(int i7) {
        int L;
        int width = this.f41391e0.getWidth();
        if (i7 != 1 && (i7 != 0 || this.f41375c2 != 1)) {
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
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            u51Var.h0();
            return;
        }
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null) {
            eq0Var.g();
        }
    }

    public final void g3(boolean z9, boolean z10) {
        h3(z9, z10, hq0.f46372e);
    }

    public float getAnimationValue() {
        return this.f41449k6;
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
        org.telegram.messenger.ye yeVar;
        if (this.f41482o6 != null) {
            f14 = org.telegram.messenger.g0.T1(0.0f, this.f41407f6, this.f41449k6);
            f10 = org.telegram.messenger.g0.T1(this.Z5, this.f41387d6, this.f41449k6);
            f11 = org.telegram.messenger.g0.T1(this.f41359a6, this.f41397e6, this.f41449k6);
            f12 = org.telegram.messenger.g0.T1(this.X5, this.f41379c6, this.f41449k6);
            f13 = org.telegram.messenger.g0.T1(this.W5, this.f41369b6, this.f41449k6);
        } else {
            f10 = this.Z5;
            f11 = this.f41359a6;
            f12 = this.X5;
            f13 = this.W5;
            if (this.f41465m6 != 0) {
                f13 = this.f41369b6;
                f12 = this.f41379c6;
                f10 = this.f41387d6;
            }
            f14 = 0.0f;
        }
        int g12 = g1(this.f41526t4);
        int e12 = e1();
        canvas.translate(W0(this.f41526t4), X0(this.f41526t4));
        canvas.translate(f13, f12 + 0.0f);
        canvas.scale(f10, f10);
        canvas.rotate(f11);
        int q10 = this.B4.q();
        int o4 = this.B4.o();
        float f19 = g12;
        float f20 = q10;
        float f21 = f19 / f20;
        float f22 = e12;
        float f23 = o4;
        float f24 = f22 / f23;
        float min = Math.min(f21, f24);
        og.g gVar = this.D1;
        int i7 = gVar.f20970i;
        if (i7 != 90 && i7 != 270) {
            o4 = q10;
            q10 = o4;
        }
        float f25 = gVar.f20971j;
        float f26 = gVar.f20972k;
        float f27 = o4;
        float f28 = q10;
        float f29 = f10;
        float f30 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        float f31 = f19 / f30;
        float f32 = (int) ((((1.0f - f26) * 0.0f) + f26) * f28);
        if (f31 * f32 > f22) {
            f31 = f22 / f32;
        }
        int i10 = this.f41375c2;
        float f33 = f31;
        oq0 oq0Var = this.W4;
        if (i10 != 1 && ((this.f41526t4 != 1 || this.f41474n6 == 0) && oq0Var.f48506c != null)) {
            float f34 = f30 * f33;
            float f35 = f32 * f33;
            if (f21 * f23 > f22) {
                f21 = f24;
            }
            float z9 = com.google.android.recaptcha.internal.a.z((f20 * f21) / f29, f34, 0.0f, f34);
            float z10 = com.google.android.recaptcha.internal.a.z((f23 * f21) / f29, f35, 0.0f, f35);
            canvas.clipRect((-z9) / 2.0f, (-z10) / 2.0f, z9 / 2.0f, z10 / 2.0f);
        }
        if (this.f41375c2 == 1 || gVar.f20964a) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.messenger.ye yeVar2 = oq0Var.f48506c;
                if (yeVar2 != null && yeVar2.f26643l) {
                    f17 = -1.0f;
                } else {
                    f17 = 1.0f;
                }
                textureView.setScaleX(f17);
                qq0 qq0Var = this.E2;
                if (qq0Var != null) {
                    qq0Var.setScaleX(this.B2.getScaleX());
                }
            }
            org.telegram.messenger.ye yeVar3 = oq0Var.f48506c;
            if (yeVar3 != null) {
                f15 = yeVar3.f26637c;
                f16 = 1.0f;
            } else {
                f15 = 1.0f;
                f16 = 1.0f;
            }
            float z11 = ((f33 / min) / com.google.android.recaptcha.internal.a.z(f15, f16, 0.0f, f16)) * f15;
            canvas.translate(gVar.d * f16, gVar.f20967e * f16);
            canvas.scale(z11, z11);
            canvas.translate(com.google.android.recaptcha.internal.a.D(gVar.f20965b, f27, min, f16), com.google.android.recaptcha.internal.a.D(gVar.f20966c, f28, min, f16));
            float f36 = gVar.f20969g + i7;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            canvas.rotate(f36);
        }
        if (!this.f41408f7.isEmpty() && (yeVar = oq0Var.f48506c) != null && yeVar.f26643l) {
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

    public final float h1(boolean z9) {
        int q10;
        int o4;
        int i7;
        ImageReceiver imageReceiver = this.B4;
        if (z9) {
            q10 = imageReceiver.o();
        } else {
            q10 = imageReceiver.q();
        }
        if (z9) {
            o4 = this.B4.q();
        } else {
            o4 = this.B4.o();
        }
        if (!this.f41513s) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        float min = Math.min(this.C1.getMeasuredWidth(), (this.C1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - i7) - (org.telegram.messenger.g0.L(16.0f) * 2);
        return Math.max(min / q10, min / o4);
    }

    public final void h3(boolean r17, boolean r18, org.telegram.ui.hq0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3(boolean, boolean, org.telegram.ui.hq0):void");
    }

    public final Size i0() {
        float f10;
        int i7;
        int round;
        int i10;
        if (this.Y7 == 1) {
            return new Size(this.f41371b8, this.f41381c8);
        }
        int i11 = this.X7;
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
        if (this.f41371b8 > this.f41381c8) {
            i7 = this.f41371b8;
        } else {
            i7 = this.f41381c8;
        }
        float f11 = f10 / i7;
        if (this.X7 == this.Y7 - 1 && f11 >= 1.0f) {
            i10 = this.f41371b8;
            round = this.f41381c8;
        } else {
            int round2 = Math.round((this.f41371b8 * f11) / 2.0f) * 2;
            round = Math.round((this.f41381c8 * f11) / 2.0f) * 2;
            i10 = round2;
        }
        int i12 = i10 % 4;
        if (i12 != 0 || round % 4 != 0) {
            i10 = (i10 - i12) - (round % 4);
        }
        return new Size(i10, round);
    }

    public final g7.c i1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i1():g7.c");
    }

    public final void i2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.hf r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.hf, boolean, long):void");
    }

    public final void i3(boolean z9) {
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
        bi.m5 m5Var = this.P0;
        Property property = View.ALPHA;
        float f18 = 1.0f;
        float f19 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(m5Var, property, f10));
        bi.m5 m5Var2 = this.P0;
        Property property2 = View.TRANSLATION_Y;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(m5Var2, property2, f11));
        tg.c2 c2Var = this.f41481o5;
        if (c2Var != null) {
            if (z9) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(c2Var, property, f17));
        }
        if (this.f41481o5 != null) {
            di.b3 b3Var = this.f41509r5;
            if (z9) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b3Var, property, f16));
        }
        li.w1 w1Var = this.S0;
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var, property, f12));
        li.w1 w1Var2 = this.S0;
        if (z9) {
            f13 = 0.0f;
        } else {
            f13 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var2, property2, f13));
        int i7 = this.f41375c2;
        if (i7 == 0 || i7 == 4) {
            CheckBox checkBox = this.N0;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f14));
            CheckBox checkBox2 = this.N0;
            if (z9) {
                f15 = 0.0f;
            } else {
                f15 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f15));
            CounterView counterView = this.O0;
            if (!z9) {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f18));
            CounterView counterView2 = this.O0;
            if (!z9) {
                f19 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f19));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z9 && F1()) {
            x0(true);
            fi.g gVar = this.U1.f12366f;
            if (gVar.f35844e) {
                gVar.k(true);
            }
            fi.g gVar2 = this.V1.f12366f;
            if (gVar2.f35844e) {
                gVar2.k(true);
            }
            this.U1.f12366f.d();
            this.V1.f12366f.d();
        }
    }

    public final boolean j0(MotionEvent motionEvent) {
        boolean z9;
        eq0 eq0Var;
        if (this.F2 != null || ((eq0Var = this.f41401f0) != null && eq0Var.f32248y)) {
            if (motionEvent.getX() >= (g1(this.f41526t4) / 3) * 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            long k12 = k1();
            long x12 = x1();
            if (k12 != -9223372036854775807L && x12 > 15000 && (!z9 || x12 - k12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final org.telegram.messenger.j20 j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j1():org.telegram.messenger.j20");
    }

    public final void j2() {
        tg.c2 c2Var = this.f41481o5;
        if (c2Var != null && this.f41375c2 == 11) {
            if (this.f41537u7) {
                c2Var.b();
            } else {
                c2Var.m(this.B4.n(), this.B4.U, g1(this.f41526t4), e1(), new ln0(this, 0));
            }
        }
    }

    public final void j3(boolean z9, boolean z10) {
        float f10;
        en0 en0Var = this.f41568y;
        org.telegram.messenger.g0.r(en0Var);
        int i7 = 0;
        if (z10) {
            k3(z9);
            if (z9) {
                AnimatorSet animatorSet = this.f41558x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f41558x = null;
                }
                if (this.Q3) {
                    this.Q3 = false;
                    k3(true);
                    return;
                }
                org.telegram.messenger.g0.i3(en0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f41558x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                k3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f41558x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f41558x = null;
        }
        zc zcVar = this.X0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        zcVar.setAlpha(f10);
        zc zcVar2 = this.X0;
        if (!z9) {
            i7 = 4;
        }
        zcVar2.setVisibility(i7);
    }

    public final boolean k0() {
        cn cnVar = this.f41447k4;
        if (cnVar != null) {
            if (cnVar.f44446f == null) {
                TLRPC.Chat chat = cnVar.f44432e;
                if (chat != null && !org.telegram.messenger.t3.r0(chat)) {
                    if (org.telegram.messenger.t3.p(this.f41447k4.f44432e) || org.telegram.messenger.t3.u(this.f41447k4.f44432e)) {
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
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null && eq0Var.f32248y) {
            return eq0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var == null) {
            return 0L;
        }
        return u51Var.S();
    }

    public final void k2(String str, long j3, boolean z9, float f10, float f11, int i7, long j10) {
        boolean z10;
        int parseInt;
        if (this.f41557w8 != null) {
            Utilities.f21336e.a(this.f41557w8);
            this.f41557w8 = null;
        }
        yo0 yo0Var = this.R7;
        yo0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        yo0Var.D = mediaMetadataRetriever;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z11 = true;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yo0Var.f33324x = z10;
        yo0Var.d = f10;
        yo0Var.f33317e = f11;
        float f12 = yo0Var.f33322s;
        if (f12 < f10) {
            yo0Var.f33322s = f10;
        } else if (f12 > f11) {
            yo0Var.f33322s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                yo0Var.f33325y = open;
                yo0Var.D.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = yo0Var.D.extractMetadata(9);
            if (extractMetadata != null) {
                yo0Var.f33310a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = yo0Var.D.extractMetadata(18);
            if (extractMetadata2 != null) {
                yo0Var.f33312b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = yo0Var.D.extractMetadata(19);
            if (extractMetadata3 != null) {
                yo0Var.f33314c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = yo0Var.D.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = yo0Var.f33312b;
                yo0Var.f33312b = yo0Var.f33314c;
                yo0Var.f33314c = i11;
            }
            if (yo0Var.f33324x) {
                yo0Var.f33319f = (float) ((j10 / 1000.0d) / yo0Var.f33310a);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yo0Var.invalidate();
        this.f41567x8 = null;
        if (!z9 && this.f41375c2 != 1) {
            z11 = false;
        }
        this.f41503r = z11;
        this.Y7 = -1;
        this.f41361a8 = 0;
        this.f41434i8 = 25;
        this.f41529t8 = new File(str).length();
        org.telegram.messenger.p5 p5Var = Utilities.f21336e;
        fq0 fq0Var = new fq0(this, str, j3, i7);
        this.f41557w8 = fq0Var;
        p5Var.c(fq0Var);
    }

    public final void k3(boolean z9) {
        float f10;
        if (z9) {
            this.X0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41558x = animatorSet;
        zc zcVar = this.X0;
        Property property = View.ALPHA;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(zcVar, property, f10));
        this.f41558x.setDuration(200L);
        this.f41558x.addListener(new pp0(this, z9, 1));
        this.f41558x.start();
    }

    public final void l0() {
        AnimatorSet animatorSet;
        View view = this.f41580z2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f41580z2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.A2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A2 = null;
        }
        org.telegram.ui.Components.gd0 gd0Var = this.C1;
        if (gd0Var != null && (animatorSet = gd0Var.f33938s) != null) {
            animatorSet.cancel();
            gd0Var.f33938s = null;
            gd0Var.f33935f = false;
        }
    }

    public final TLObject l1(int i7, long[] jArr) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.f41388d7;
        if (!arrayList.isEmpty()) {
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.ew) arrayList.get(i7)).f22285b.size;
            }
            return (TLObject) arrayList.get(i7);
        }
        ArrayList arrayList2 = this.Z6;
        if (!arrayList2.isEmpty()) {
            if (i7 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f41370b7;
                if (arrayList3.get(i7) != null) {
                    jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                }
            }
            ArrayList arrayList4 = this.f41360a7;
            if (arrayList4.get(i7) == null) {
                return null;
            }
            return ((org.telegram.messenger.hc) arrayList4.get(i7)).f22869f;
        }
        ArrayList arrayList5 = this.X6;
        if (arrayList5.isEmpty() || i7 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList5.get(i7);
        TLRPC.Message message = ijVar.f23262k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = ijVar.Y0;
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
            } else if (((org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.ij.n1(ijVar.f23262k).photo != null) || ((org.telegram.messenger.ij.n1(ijVar.f23262k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.n1(ijVar.f23262k).webpage != null)) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(true), false, null, true);
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
            } else if (org.telegram.messenger.ij.n1(ijVar.f23262k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.ij.n1(ijVar.f23262k)).photo;
            } else {
                if (ijVar.F0() != null && org.telegram.messenger.ij.W2(ijVar.F0())) {
                    TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(ijVar.F0().thumbs, 90, false, null, false);
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

    public final void l2(boolean z9) {
        int i7 = 0;
        this.D2 = false;
        ti.o oVar = this.O8;
        if (oVar != null && oVar.f56137c == 0) {
            this.O8 = null;
            oVar.f();
        }
        org.telegram.ui.Components.u51 u51Var = this.F2;
        HashMap hashMap = f41346a9;
        ap0 ap0Var = this.f41561x2;
        if (u51Var != null) {
            n0();
            org.telegram.messenger.g0.r(this.f41551w2);
            org.telegram.messenger.g0.r(ap0Var);
            if (this.f41366b3 != null) {
                float S = ((float) this.F2.S()) / ((float) this.F2.U());
                String str = this.f41366b3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new br0(S));
                org.telegram.messenger.ij ijVar = this.S4;
                if (ijVar != null) {
                    ijVar.j3 = Float.valueOf(S);
                }
            }
            this.F2.m0();
            this.F2 = null;
        } else {
            this.W2 = false;
        }
        if (this.f41401f0 != null) {
            org.telegram.messenger.g0.r(ap0Var);
            if (this.f41366b3 != null) {
                float k12 = ((float) k1()) / ((float) x1());
                String str2 = this.f41366b3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new br0(k12));
                org.telegram.messenger.ij ijVar2 = this.S4;
                if (ijVar2 != null) {
                    ijVar2.j3 = Float.valueOf(k12);
                }
            }
        }
        org.telegram.ui.Components.pt ptVar = this.V3;
        if (ptVar != null) {
            ptVar.disable();
            this.V3 = null;
        }
        this.f41507r3.a();
        j3(false, false);
        this.f41506r2 = false;
        this.T2 = false;
        if (this.f41539v0.isEnabled()) {
            this.f41539v0.setEnabled(false);
            this.f41539v0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f41413g3) {
            try {
                this.D.getWindow().clearFlags(128);
                this.f41413g3 = false;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.ge0 ge0Var = this.f41571y2;
        if (ge0Var != null) {
            try {
                this.f41391e0.removeView(ge0Var);
            } catch (Throwable unused) {
            }
            this.f41571y2 = null;
        }
        l0();
        this.f41580z2 = null;
        TextureView textureView = this.B2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.i51) {
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) textureView;
                org.telegram.ui.Components.sy syVar = i51Var.f34577b;
                if (syVar != null) {
                    syVar.postRunnable(new org.telegram.ui.Components.py(syVar, 0));
                }
                i51Var.f34576a = null;
            }
            this.B2 = null;
        }
        this.f41363b0.e();
        if (this.C2 != null) {
            this.C2 = null;
        }
        if (this.O3) {
            this.O3 = false;
            org.telegram.messenger.g0.r(this.f41414g4);
        }
        if (!z9 && !this.A8 && !this.B8) {
            M2(false, true);
        }
        xo0 xo0Var = this.W0[0];
        while (true) {
            float[] fArr = xo0Var.f51735n;
            if (i7 < fArr.length) {
                xo0Var.f51734m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                xo0Var.a();
                return;
            }
        }
    }

    public final void l3(boolean z9) {
        float f10;
        float f11;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = org.telegram.messenger.g0.N(24.0f);
        int i7 = this.f41375c2;
        if (i7 == 0 || i7 == 4) {
            CheckBox checkBox = this.N0;
            Property property = View.ALPHA;
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f10));
            CheckBox checkBox2 = this.N0;
            Property property2 = View.TRANSLATION_Y;
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f11));
            CounterView counterView = this.O0;
            if (!z9) {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f12));
            CounterView counterView2 = this.O0;
            if (!z9) {
                f13 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f13));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void m0() {
        if (this.f41375c2 == 11) {
            jq0 jq0Var = this.s5;
            if (jq0Var.m0 == 2) {
                jq0Var.setCutOutState(true);
                U2(true, true);
                this.f41481o5.f();
                this.f41391e0.invalidate();
            }
        }
    }

    public final void m2(int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f41567x8 != null) {
            MediaController.B().i(this.f41567x8);
        }
        if (this.B8 && !this.f41577y8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.B8 = false;
        this.f41586z8 = false;
        this.P7.setVisibility(4);
        if (i7 == 1) {
            if (this.f41399e8 == this.f41381c8 && this.f41389d8 == this.f41371b8) {
                this.f41577y8 = false;
                xo0 xo0Var = this.W0[0];
                if (xo0Var.h != 0 && xo0Var.f51732k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                xo0Var.f(z11, 0.0f);
                this.W0[0].d(3, false, true);
                if (!z9) {
                    i2(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                    this.F2.p0(this.R7.getLeftProgress() * this.f41426h8);
                } else {
                    this.f41586z8 = true;
                }
            } else {
                l2(false);
                if (this.f41567x8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f26977id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.D5;
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24470s0, tL_message, false, false);
                    this.f41567x8 = ijVar;
                    ijVar.f23262k.attachPath = new File(org.telegram.messenger.w7.z(4), "video_preview.mp4").getAbsolutePath();
                    this.f41567x8.f23280p0 = new org.telegram.messenger.j20();
                    org.telegram.messenger.j20 j20Var = this.f41567x8.f23280p0;
                    j20Var.f23478g = this.f41361a8;
                    j20Var.h = this.f41371b8;
                    this.f41567x8.f23280p0.f23479i = this.f41381c8;
                    org.telegram.messenger.j20 j20Var2 = this.f41567x8.f23280p0;
                    j20Var2.f23484n = this.f41434i8;
                    Uri uri = this.V4;
                    if (uri == null) {
                        j20Var2.f23485o = uri.getPath();
                    } else {
                        j20Var2.f23485o = uri.getPath();
                    }
                }
                org.telegram.messenger.j20 j20Var3 = this.f41567x8.f23280p0;
                long j3 = this.f41459l8;
                j20Var3.f23471a = j3;
                long j10 = this.f41467m8;
                j20Var3.f23473b = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f41426h8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    j20Var3.f23473b = j3 + 5000000;
                }
                j20Var3.f23483m = this.f41409f8;
                this.f41567x8.f23280p0.f23481k = this.f41389d8;
                this.f41567x8.f23280p0.f23482l = this.f41399e8;
                org.telegram.messenger.j20 j20Var4 = this.f41567x8.f23280p0;
                j20Var4.Y = true;
                j20Var4.v = this.f41426h8 * 1000.0f;
                if (!MediaController.B().h0(this.f41567x8, true, true, true)) {
                    this.f41577y8 = true;
                }
                this.B8 = true;
                xo0 xo0Var2 = this.W0[0];
                if (xo0Var2.h != 0 && xo0Var2.f51732k != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                xo0Var2.f(z10, 0.0f);
                this.W0[0].d(0, false, true);
            }
        } else {
            this.f41577y8 = false;
            this.W0[0].d(3, false, true);
            if (i7 == 2) {
                i2(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                this.F2.p0(this.R7.getLeftProgress() * this.f41426h8);
            }
        }
        this.f41391e0.invalidate();
    }

    public final void m3(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z9 != this.K) {
            if (z9) {
                this.f41478o1.setVisibility(0);
            }
            this.K = z9;
            this.f41478o1.setEnabled(z9);
            float f14 = 1.0f;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                dr0 dr0Var = this.f41478o1;
                Property property = View.ALPHA;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dr0Var, property, f12));
                dr0 dr0Var2 = this.f41478o1;
                Property property2 = View.TRANSLATION_Y;
                if (z9) {
                    f13 = 0.0f;
                } else {
                    f13 = -org.telegram.messenger.g0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(dr0Var2, property2, f13));
                CounterView counterView = this.O0;
                Property property3 = View.ROTATION_X;
                if (!z9) {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f14));
                AnimatorSet animatorSet = new AnimatorSet();
                this.B1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z9) {
                    this.B1.addListener(new ip0(this, 4));
                }
                this.B1.setDuration(200L);
                this.B1.start();
                return;
            }
            dr0 dr0Var3 = this.f41478o1;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            dr0Var3.setAlpha(f10);
            dr0 dr0Var4 = this.f41478o1;
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(10.0f);
            }
            dr0Var4.setTranslationY(f11);
            CounterView counterView2 = this.O0;
            if (!z9) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z9) {
                this.f41478o1.setVisibility(8);
            }
        }
    }

    public final void n0() {
        Runnable runnable = this.H2;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.H2 = null;
        }
    }

    public final String n1(int i7) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (i7 >= 0) {
            ArrayList arrayList = this.f41388d7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) arrayList.get(i7);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ewVar.f22285b.dc_id);
                    sb2.append("_");
                    return a8.p0.r(sb2, ewVar.f22285b.f27093id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.Z6;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.X6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f41408f7;
                    if (!arrayList4.isEmpty()) {
                        if (i7 < arrayList4.size()) {
                            Object obj = arrayList4.get(i7);
                            if (obj instanceof org.telegram.messenger.kf) {
                                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                                TLRPC.PhotoSize photoSize = kfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.w7.r(null, photoSize);
                                }
                                TLRPC.Document document = kfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.w7.r(null, document);
                                }
                                return Utilities.a(kfVar.C) + "." + org.telegram.messenger.gc.B(kfVar.C, "jpg");
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
                                    sb3.append(org.telegram.messenger.gc.B(webDocument2.url, org.telegram.messenger.w7.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        sq0 sq0Var = this.i7;
                        if (sq0Var != null) {
                            return sq0Var.c(i7);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList2.get(i7);
                        org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) this.f41360a7.get(i7);
                        if (hcVar != null) {
                            if (hcVar2 != null && hcVar2 != hcVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(hcVar2.f22869f.volume_id);
                                sb4.append("_");
                                return a8.p0.n(hcVar2.f22869f.local_id, ".mp4", sb4);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(hcVar.f22869f.volume_id);
                            sb5.append("_");
                            return a8.p0.n(hcVar.f22869f.local_id, ".jpg", sb5);
                        }
                    }
                } else if (i7 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.ij) arrayList3.get(i7)).f23262k;
                    Pattern pattern = org.telegram.messenger.w7.I;
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
                        } else if (org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.w7.r(null, org.telegram.messenger.ij.n1(message).document);
                        } else {
                            if (org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.ij.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w11 = org.telegram.messenger.w7.w(arrayList6, org.telegram.messenger.g0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.w7.r(null, w11);
                                }
                                return "";
                            } else if (org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.ij.n1(message).webpage.document != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.ij.n1(message).webpage.document);
                                }
                                if (org.telegram.messenger.ij.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.ij.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w10 = org.telegram.messenger.w7.w(arrayList7, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.w7.r(null, w10);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.ij.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.gc.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type));
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

    public final float n2() {
        return o2(true);
    }

    public final void n3() {
        boolean z9;
        org.telegram.ui.Components.u51 u51Var;
        org.telegram.ui.Components.u51 u51Var2;
        eq0 eq0Var;
        org.telegram.ui.Components.u51 u51Var3 = this.F2;
        if (u51Var3 == null && ((eq0Var = this.f41401f0) == null || !eq0Var.f32248y)) {
            return;
        }
        if (u51Var3 != null) {
            z9 = this.O3;
        } else {
            z9 = this.f41401f0.G;
        }
        n0();
        org.telegram.messenger.g0.r(this.f41561x2);
        if (z9) {
            f2();
        } else {
            if (this.f41505r1) {
                if (Math.abs(this.R7.getProgress() - this.R7.getRightProgress()) < 0.01f || ((u51Var2 = this.F2) != null && u51Var2.S() == this.F2.U())) {
                    r2(this.R7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f41488p3.c() - this.R7.getRightProgress()) < 0.01f || ((u51Var = this.F2) != null && u51Var.S() == this.F2.U())) {
                    r2(0.0f);
                }
                p2();
            }
            g2();
        }
        this.f41391e0.invalidate();
    }

    public final void o0() {
        float f10;
        org.telegram.ui.ActionBar.y yVar = this.A0;
        if (yVar != null) {
            if (this.f41403f2) {
                f10 = -org.telegram.messenger.g0.L(4.0f);
            } else {
                f10 = 0.0f;
            }
            yVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.E0;
        if (r0Var != null) {
            F2(r0Var, this.f41403f2, false);
        }
        boolean z9 = this.f41393e2;
        if (z9 && this.I == null) {
            fh.g c10 = this.Y.c(this.G, null, false);
            c10.p(c8.g0.i(this.f41541v2));
            c10.r(org.telegram.messenger.g0.L(20.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            int L = org.telegram.messenger.g0.L(54.0f);
            int L2 = org.telegram.messenger.g0.L(54.0f);
            Matrix matrix = ih.d.f15484a;
            this.I = new ih.c(L, L2, c10);
        }
        if (z9) {
            c8.ka.a(this.G);
            this.G.setBackground(this.I);
            return;
        }
        this.G.setStateListAnimator(null);
        this.G.setBackground(this.H);
    }

    public final org.telegram.messenger.hc o1(int i7, long[] jArr) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f41388d7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.ew) arrayList.get(i7)).f22285b.size;
                    }
                    org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) arrayList.get(i7);
                    if (ewVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = ewVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.Z6;
                if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f41370b7;
                            if (arrayList3.get(i7) != null) {
                                jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                            }
                        }
                        return (org.telegram.messenger.hc) this.f41360a7.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.X6;
                    if (!arrayList4.isEmpty() && i7 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i7);
                        TLRPC.Message message = ijVar.f23262k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    if (jArr != null) {
                                        long j3 = w10.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.hc.f(w10, ijVar.f23267l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = ijVar.Y0;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.hc.b(document);
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
                                        return org.telegram.messenger.hc.f(w11, ijVar.Y0.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.ij.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.ij.n1(ijVar.f23262k).photo != null) || ((org.telegram.messenger.ij.n1(ijVar.f23262k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.n1(ijVar.f23262k).webpage != null)) {
                                if (org.telegram.messenger.ij.t3(ijVar.f23262k)) {
                                    return org.telegram.messenger.hc.b(ijVar.F0());
                                }
                                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(true), false, null, true);
                                if (w12 != null) {
                                    if (jArr != null) {
                                        long j11 = w12.size;
                                        jArr[0] = j11;
                                        if (j11 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.hc.f(w12, ijVar.f23267l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.ij.n1(ijVar.f23262k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.ij.n1(ijVar.f23262k)).webPhoto));
                            } else {
                                if (ijVar.F0() != null) {
                                    TLRPC.Document F0 = ijVar.F0();
                                    if (this.B5 == 5) {
                                        return org.telegram.messenger.hc.b(F0);
                                    }
                                    if (org.telegram.messenger.ij.W2(ijVar.F0())) {
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j12 = w13.size;
                                            jArr[0] = j12;
                                            if (j12 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.hc.c(w13, F0);
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

    public final float o2(boolean z9) {
        int i7;
        if (this.f41375c2 == 11) {
            int g12 = g1(this.f41526t4);
            if (g12 == 0) {
                g12 = org.telegram.messenger.g0.f22563q.x;
            }
            float D = org.telegram.messenger.camera.q.D(20.0f, g12, 1) / g12;
            if (z9) {
                int q10 = this.B4.q();
                int o4 = this.B4.o();
                if ((q10 <= 1 || o4 <= 1) && (i7 = this.O4) >= 0) {
                    ArrayList arrayList = this.f41408f7;
                    if (i7 < arrayList.size()) {
                        Object obj = arrayList.get(this.O4);
                        if (obj instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                            q10 = gfVar.F;
                            o4 = gfVar.G;
                            if ((gfVar.J / 90) % 2 != 0) {
                                o4 = q10;
                                q10 = o4;
                            }
                        }
                    }
                }
                if (q10 > 1 && o4 > 1 && q10 > o4) {
                    return (q10 / o4) * D;
                }
            }
            return D;
        }
        return 1.0f;
    }

    public final void o3() {
        View view = this.S3;
        if (view != null) {
            xo0 xo0Var = this.W0[0];
            int i7 = xo0Var.h;
            if (xo0Var.f51737p && (i7 == 3 || i7 == 4 || i7 == 2 || i7 == 1)) {
                if (i7 == 3) {
                    view.setContentDescription(org.telegram.messenger.id.M0(2131754929, "AccActionPlay"));
                } else if (i7 == 2) {
                    view.setContentDescription(org.telegram.messenger.id.M0(2131754938, "AccActionDownload"));
                } else if (i7 == 1) {
                    view.setContentDescription(org.telegram.messenger.id.M0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.id.M0(2131754930, "AccActionPause"));
                }
                this.S3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.N6 && this.N0.getVisibility() != 0) {
            boolean[] zArr = this.f41550w1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f41391e0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.A4.K()) {
                        zArr[0] = true;
                        this.f41391e0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f41391e0.getMeasuredWidth() - min && this.C4.K()) {
                    zArr[1] = true;
                    this.f41391e0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.Z5 != 1.0f && this.f41375c2 != 11) {
            this.U6.abortAnimation();
            this.U6.fling(Math.round(this.W5), Math.round(this.X5), Math.round(f10), Math.round(f11), (int) this.D6, (int) this.E6, (int) this.F6, (int) this.G6);
            this.f41391e0.postInvalidate();
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
        if (this.f41463m4 != 0) {
            D1();
            if (Math.abs(this.f41472n4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.o4;
                if (runnable != null) {
                    runnable.run();
                    this.o4 = null;
                }
                this.f41463m4 = 0;
            }
        }
        if (this.f41463m4 == 0) {
            return false;
        }
        return true;
    }

    public final void p2() {
        if (!E1()) {
            org.telegram.messenger.ij ijVar = this.S4;
            if (ijVar == null || !ijVar.r4()) {
                ap0 ap0Var = this.f41561x2;
                org.telegram.messenger.g0.r(ap0Var);
                org.telegram.messenger.g0.i3(ap0Var, 3000);
            }
        }
    }

    public final void p3() {
        if (this.A0 != null && this.M != null) {
            float f10 = 0.0f;
            for (int i7 = 0; i7 < this.A0.getChildCount(); i7++) {
                View childAt = this.A0.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    f10 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f10;
                }
            }
            CheckBox checkBox = this.N0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f10 = Math.max(f10, org.telegram.messenger.g0.L(48.0f));
            }
            CounterView counterView = this.O0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f10 = Math.max(f10, org.telegram.messenger.g0.L(100.0f));
            }
            vq0 vq0Var = this.M;
            ValueAnimator valueAnimator = vq0Var.f50753n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vq0Var.f50753n = null;
            }
            vq0Var.f50754r = f10;
            vq0Var.f50750c[0].setRightPadding((int) f10);
            vq0Var.d.setRightPadding(f10);
        }
    }

    public final void q0(boolean z9) {
        View view;
        float x10;
        float y10;
        float f10;
        float f11;
        if (z9) {
            ti.p pVar = this.f41542v3;
            if (pVar != null) {
                pVar.getViewTreeObserver().addOnPreDrawListener(new e7(this, 4));
                this.f41542v3.invalidate();
            }
        } else if (this.F3 == 2) {
            ImageView imageView = this.f41552w3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f41552w3.setImageDrawable(null);
                Bitmap bitmap = this.B3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.B3 = null;
                }
            }
            this.K3 = false;
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            org.telegram.ui.Components.ge0 ge0Var = this.f41571y2;
            if (ge0Var != null) {
                int[] iArr = this.f41581z3;
                ge0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f41391e0.getTranslationY());
                ImageView imageView2 = this.f41552w3;
                Rect rect = this.f41516s2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f41571y2.getX());
                }
                qq0 qq0Var = this.E2;
                if (qq0Var != null) {
                    qq0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dn0(this, 4));
                if (this.D2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f41571y2.getX();
                }
                if (this.D2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f41571y2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f41552w3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f41552w3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f41552w3;
                Property property3 = View.TRANSLATION_X;
                if (this.D2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f41552w3;
                Property property4 = View.TRANSLATION_Y;
                if (this.D2) {
                    f11 = 0.0f;
                } else {
                    f11 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f11));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x10));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y10));
                arrayList.add(ObjectAnimator.ofInt(this.L0, org.telegram.ui.Components.m6.d, 255));
                qq0 qq0Var2 = this.E2;
                if (qq0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(qq0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property4, y10));
                }
                s1(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new bi.de(23, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new eo0(this, view, 0));
                animatorSet.start();
                hq0 hq0Var = new hq0();
                hq0Var.f46375c = false;
                hq0Var.d = false;
                hq0Var.f46373a = 250;
                hq0Var.f46374b = decelerateInterpolator;
                h3(true, true, hq0Var);
                this.F3 = 0;
            }
        }
    }

    public final int q1() {
        return this.f41516s2.left;
    }

    public final void q2(long j3) {
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null && eq0Var.f32248y) {
            eq0Var.i(j3);
        } else {
            org.telegram.ui.Components.u51 u51Var = this.F2;
            if (u51Var != null) {
                u51Var.p0(j3);
            }
        }
        A3();
    }

    public final void q3(Object obj) {
        CharSequence charSequence;
        boolean z9;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f41483o7) {
            charSequence = this.f41492p7;
        } else if (obj instanceof org.telegram.messenger.gf) {
            charSequence = ((org.telegram.messenger.gf) obj).f26844a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.kf)) {
            charSequence = ((org.telegram.messenger.kf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1().setText("");
        } else {
            a1().setText(org.telegram.ui.Components.r5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.zs editText = a1().f12366f.getEditText();
        cn cnVar = this.f41447k4;
        if (cnVar != null && ((encryptedChat = cnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
            z9 = true;
        } else {
            z9 = false;
        }
        editText.setAllowTextEntitiesIntersection(z9);
    }

    public final void r0() {
        yq0 yq0Var = this.f41378c5;
        if (yq0Var != null) {
            yq0Var.f52159a.O0(true, true);
        }
        wq0 wq0Var = this.d;
        yq0 yq0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (wq0Var != null) {
            org.telegram.messenger.ij ijVar = this.S4;
            org.telegram.messenger.hc hcVar = this.Y4;
            if (hcVar != null) {
                tL_fileLocationToBeDeprecated = hcVar.f22869f;
            }
            yq0Var2 = wq0Var.E(ijVar, tL_fileLocationToBeDeprecated, this.O4, false, false);
        }
        this.f41378c5 = yq0Var2;
        if (yq0Var2 != null && !yq0Var2.f52175s) {
            yq0Var2.f52159a.O0(false, true);
        }
    }

    public final TLRPC.Document r1() {
        int i7;
        if (this.W5 == 0.0f && this.X5 == 0.0f && (i7 = this.O4) >= 0) {
            ArrayList arrayList = this.f41408f7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof org.telegram.messenger.ze) {
                    org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) obj;
                    if (!zeVar.v && !zeVar.f26863w && !zeVar.f26862u) {
                        return this.f41528t7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void r2(float f10) {
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            u51Var.p0(f10 * ((float) u51Var.U()));
            return;
        }
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null) {
            eq0Var.i(f10 * eq0Var.getVideoDuration());
        }
    }

    public final void r3() {
        int i7 = org.telegram.ui.ActionBar.l6.f28056ng;
        int w12 = w1(i7);
        li.w1 w1Var = this.S0;
        if (w1Var != null) {
            w1Var.k();
            this.S0.invalidate();
        }
        CheckBox checkBox = this.N0;
        if (checkBox != null) {
            checkBox.c(w1(i7), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w12, mode);
        ImageView imageView = this.Y0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.Z0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f41374c1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f41374c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f41364b1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f41364b1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f41354a1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f41354a1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.v0 v0Var = this.U0;
        if (v0Var != null) {
            ((TextView) v0Var.f30617b).setTextColor(w12);
        }
        org.telegram.ui.Cells.v0 v0Var2 = this.O7;
        if (v0Var2 != null) {
            ((TextView) v0Var2.f30617b).setTextColor(w12);
        }
        wp0 wp0Var = this.L1;
        if (wp0Var != null) {
            wp0Var.updateColors();
        }
        org.telegram.ui.Components.td0 td0Var = this.I1;
        if (td0Var != null) {
            ImageView imageView6 = td0Var.B0;
            ImageView imageView7 = td0Var.A0;
            ImageView imageView8 = td0Var.f38389z0;
            org.telegram.ui.ActionBar.g6 g6Var = td0Var.I0;
            TextView textView = td0Var.f38365g0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), mode));
            }
            td0Var.e();
        }
        bp0 bp0Var = this.U1;
        if (bp0Var != null) {
            bp0Var.H(this.f41541v2);
        }
        cp0 cp0Var = this.V1;
        if (cp0Var != null) {
            cp0Var.H(this.f41541v2);
        }
        yo0 yo0Var = this.R7;
        if (yo0Var != null) {
            yo0Var.invalidate();
        }
        dr0 dr0Var = this.f41478o1;
        if (dr0Var != null) {
            int childCount = dr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41478o1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w5) {
                    ((org.telegram.ui.Cells.w5) childAt).f30734c.b(org.telegram.ui.ActionBar.l6.W9, org.telegram.ui.ActionBar.l6.X9, org.telegram.ui.ActionBar.l6.V9);
                }
            }
        }
        ro0 ro0Var = this.T3;
        if (ro0Var != null) {
            ro0Var.X0(true);
        }
    }

    public final void s0() {
        org.telegram.messenger.ij ijVar;
        boolean z9;
        int i7;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        org.telegram.messenger.ij ijVar2;
        ArrayList arrayList = this.X6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f41562x3;
        if (!isEmpty && ((ijVar = this.S4) == null || !ijVar.r4())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.O4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i12);
                    if (!org.telegram.messenger.ij.L4(ijVar3.f23262k) && !ijVar3.e5()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (ijVar3.e5() && (ijVar2 = this.S4) != null && ijVar2.e1() == ijVar3.e1()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i7 = ijVar3.f23262k.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.B2) != null) {
                            i7 = textureView.getMeasuredWidth();
                        } else {
                            i7 = 0;
                        }
                        if (z9) {
                            i10 = ijVar3.f23262k.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.B2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document F0 = ijVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i7 = documentAttribute.f26963w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = org.telegram.messenger.g0.f22563q;
                        if (point.y > point.x && i7 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.J) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f41391e0.getMeasuredHeight() + ((int) (i10 / (i7 / this.f41391e0.getMeasuredWidth())))) / 2) - org.telegram.messenger.g0.L(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f41482o6 != null) {
                            float f11 = this.W5;
                            f10 = ((this.f41369b6 - f11) * this.f41449k6) + f11;
                        } else {
                            f10 = this.W5;
                        }
                        float f12 = 0.0f;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                f12 = (f10 - this.E6) + ((-point.x) - org.telegram.messenger.g0.L(15.0f));
                            } else {
                                float f13 = this.D6;
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

    public final org.telegram.ui.Components.li0 s1(boolean z9) {
        ti.o oVar;
        ti.i iVar;
        RectF rectF = new RectF();
        if (!z9 && (oVar = this.O8) != null && (iVar = oVar.f56138e) != null) {
            iVar.g(rectF);
        } else {
            to0 to0Var = this.W8;
            ti.i.j(rectF, to0Var.I(), to0Var.U());
        }
        ?? obj = new Object();
        obj.f35751a = rectF.left;
        obj.f35752b = rectF.top;
        obj.f35753c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final int s2() {
        int i7;
        if (this.f41529t8 > 1048576000) {
            return this.Y7 - 1;
        }
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        int i10 = this.Y7;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = e12.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(this.T);
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

    public final void s3(boolean z9) {
        rq0 rq0Var;
        int i7;
        if (this.f41375c2 != 1 && (rq0Var = this.f41391e0) != null) {
            if (!z9) {
                if (rq0Var.getPaddingLeft() <= 0 && this.f41391e0.getPaddingRight() <= 0) {
                    i7 = 1796;
                } else {
                    i7 = 5894;
                }
            } else {
                i7 = 1792;
            }
            this.f41391e0.setSystemUiVisibility(i7);
        }
    }

    public void setAnimationValue(float f10) {
        this.f41449k6 = f10;
        this.f41391e0.invalidate();
        D1();
    }

    public final void t0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t0(boolean):void");
    }

    public final RenderNode t1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j3;
        if (this.J8 == null) {
            renderNode = null;
        } else {
            renderNode = this.K8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a10 = dh.g.a(org.telegram.messenger.g0.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a10, a10, Shader.TileMode.CLAMP));
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
        dh.a aVar = this.L8;
        aVar.f8699b = 0L;
        aVar.f8698a = false;
        for (float f10 : colorMatrix.getArray()) {
            aVar.c(f10);
        }
        aVar.a(0L);
        if (aVar.f8698a) {
            j3 = -1;
        } else {
            j3 = aVar.f8699b;
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

    public final void t2(final boolean z9, final int i7, final int i10, final boolean z10, final boolean z11, boolean z12) {
        int i11;
        float f10;
        boolean z13;
        org.telegram.messenger.j20 j20Var;
        String str;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        org.telegram.messenger.ye yeVar;
        org.telegram.messenger.ye yeVar2;
        TLRPC.Chat chat;
        boolean z14;
        int i12;
        cn cnVar;
        org.telegram.ui.Components.i30 i30Var;
        String str2;
        long j3;
        String M0;
        TextureView textureView;
        if (!F1() && this.d != null && !this.f41532u2) {
            if (this.f41375c2 == 1) {
                if (!z12 && (i30Var = this.f41479o2) != null) {
                    TLObject tLObject = i30Var.f34543a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j10 = user.f27105id;
                        str2 = str3;
                        j3 = j10;
                    } else {
                        str2 = "";
                        j3 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41391e0.getContext());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.V0 = L;
                    Context context = this.f41391e0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f47470a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f47471b = imageReceiver2;
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                    view.f47473e = new Path();
                    w8Var.r(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f());
                    imageReceiver.i0(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f(), w8Var, null);
                    imageReceiver2.i0(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f(), w8Var, null);
                    Drawable drawable = context.getDrawable(2131232056);
                    view.f47474f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f41479o2.f34543a;
                    rq0 rq0Var = this.f41391e0;
                    org.telegram.ui.Components.gd0 gd0Var = this.C1;
                    w8Var.l(tLObject2);
                    imageReceiver.i0(tLObject2, w8Var, null);
                    view.f47472c = rq0Var;
                    view.d = gd0Var;
                    u1Var.V = view;
                    if (this.f41479o2.f34545c == 1) {
                        if (org.telegram.messenger.p10.i(this.T).f24489n == j3) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745499, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131745500, str2, str2));
                        }
                        if (this.H4) {
                            M0 = org.telegram.messenger.id.M0(2131745497, "SetVideo");
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131745519, "SetPhoto");
                        }
                    } else {
                        if (this.H4) {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744396, str2));
                        } else {
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744407, str2));
                        }
                        M0 = org.telegram.messenger.id.M0(2131744405, "SuggestPhotoShort");
                    }
                    String str4 = M0;
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), new org.telegram.ui.Components.jl0(29));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.r1() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.Y8;
                            PhotoViewer.this.t2(z9, i7, i10, z10, z11, true);
                        }
                    });
                    u1Var.I = org.telegram.ui.ActionBar.l6.f27875dh;
                    u1Var.T0 = true;
                    u1Var.j(i0.a.o(-15461356, 204));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27838bh, false));
                    u1Var.setOnDismissListener(new ep0(this));
                    if (this.f41505r1 && (textureView = this.B2) != null) {
                        try {
                            this.C3 = textureView.getBitmap();
                            ImageView imageView = this.D3;
                            if (imageView != null) {
                                this.f41571y2.removeView(imageView);
                                this.D3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.B2.getContext());
                            this.D3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.C3));
                            this.f41571y2.addView(this.D3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.B3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.B3 = null;
                            }
                            org.telegram.messenger.a8.g(th2, true);
                            return;
                        }
                    }
                    return;
                }
                f0();
            }
            if (!z10 && (cnVar = this.f41447k4) != null) {
                TLRPC.Chat chat2 = cnVar.f44432e;
                if (cnVar.j() != null || ((org.telegram.messenger.t3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.t3.T(chat2))) {
                    org.telegram.messenger.qp.s1(this.T).f24764d7.edit().putBoolean("silent_" + this.f41447k4.a(), !z9).commit();
                }
            }
            org.telegram.messenger.j20 j12 = j1();
            ArrayList arrayList = this.f41408f7;
            if (!arrayList.isEmpty() && (i12 = this.O4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).f26860s = j12;
                }
            }
            cn cnVar2 = this.f41447k4;
            if (cnVar2 != null && (chat = cnVar2.f44432e) != null && this.f41375c2 != 11) {
                if (!this.f41505r1 && j12 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14 && !org.telegram.messenger.t3.u(chat)) {
                    org.telegram.messenger.k5.p(null, 2131749538, new org.telegram.ui.Components.hc(this.f41391e0, this.f41541v2), null);
                    return;
                } else if (!z14 && !org.telegram.messenger.t3.p(this.f41447k4.f44432e)) {
                    org.telegram.messenger.k5.p(null, 2131749542, new org.telegram.ui.Components.hc(this.f41391e0, this.f41541v2), null);
                    return;
                }
            }
            this.f41532u2 = true;
            if (j12 != null) {
                long j11 = ((float) j12.f23487q) * 0.9f;
                if ((j11 > 2097152000 && !org.telegram.messenger.p10.i(this.T).q()) || j11 > 4194304000L) {
                    if (this.f41355a2 != null) {
                        org.telegram.ui.Components.di diVar = this.f41355a2;
                        new ug.i0(6, org.telegram.messenger.p10.f24470s0, diVar.f28627c.getContext(), diVar.W1, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z10) {
                if (this.f41375c2 == 11) {
                    Object obj2 = arrayList.get(this.O4);
                    if (obj2 instanceof org.telegram.messenger.gf) {
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int g12 = g1(this.f41526t4);
                        e1();
                        float L2 = g12 - org.telegram.messenger.g0.L(20.0f);
                        tg.c2 c2Var = this.f41481o5;
                        if (c2Var != null && c2Var.f55614i0 && c2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f41481o5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.B4.h(canvas, null);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f41481o5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.B4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f41563x4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            ImageReceiver imageReceiver3 = this.B4;
                            canvas.translate((-imageReceiver3.M0) / 2.0f, (-imageReceiver3.N0) / 2.0f);
                            f10 = 2.0f;
                            canvas.scale(this.B4.M0 / this.f41563x4.getMeasuredWidth(), this.B4.N0 / this.f41563x4.getMeasuredHeight());
                            this.f41563x4.f38345e = !z1();
                            this.f41563x4.draw(canvas);
                            this.f41563x4.f38345e = true;
                            canvas.restore();
                        } else {
                            f10 = 2.0f;
                        }
                        if (z1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = L2 / f10;
                            matrix.preTranslate(f18, f18);
                            if (this.f41482o6 != null) {
                                f15 = org.telegram.messenger.g0.T1(0.0f, this.f41407f6, this.f41449k6);
                                c10 = 3;
                                f11 = org.telegram.messenger.g0.T1(this.Z5, this.f41387d6, this.f41449k6);
                                f12 = org.telegram.messenger.g0.T1(this.f41359a6, this.f41397e6, this.f41449k6);
                                f13 = org.telegram.messenger.g0.T1(this.X5, this.f41379c6, this.f41449k6);
                                f14 = org.telegram.messenger.g0.T1(this.W5, this.f41369b6, this.f41449k6);
                            } else {
                                c10 = 3;
                                f11 = this.Z5;
                                f12 = this.f41359a6;
                                f13 = this.X5;
                                f14 = this.W5;
                                if (this.f41465m6 != 0) {
                                    f14 = this.f41369b6;
                                    f13 = this.f41379c6;
                                    f11 = this.f41387d6;
                                }
                                f15 = 0.0f;
                            }
                            int g13 = g1(this.f41526t4);
                            int e12 = e1();
                            matrix.preTranslate(f14, f13 + 0.0f);
                            matrix.preScale(f11, f11);
                            matrix.preRotate(f12);
                            int q10 = this.B4.q();
                            int o4 = this.B4.o();
                            float f19 = g13;
                            float f20 = e12;
                            float min = Math.min(f19 / q10, f20 / o4);
                            og.g gVar = this.D1;
                            int i13 = gVar.f20970i;
                            if (i13 != 90 && i13 != 270) {
                                o4 = q10;
                                q10 = o4;
                            }
                            float f21 = gVar.f20971j;
                            float f22 = gVar.f20972k;
                            float f23 = o4;
                            float f24 = q10;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i14 = this.f41375c2;
                            oq0 oq0Var = this.W4;
                            if (i14 == 1 || gVar.f20964a) {
                                TextureView textureView2 = this.B2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.ye yeVar3 = oq0Var.f48506c;
                                    if (yeVar3 != null && yeVar3.f26643l) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    qq0 qq0Var = this.E2;
                                    if (qq0Var != null) {
                                        qq0Var.setScaleX(this.B2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.ye yeVar4 = oq0Var.f48506c;
                                if (yeVar4 != null) {
                                    f16 = yeVar4.f26637c;
                                } else {
                                    f16 = 1.0f;
                                }
                                float z15 = ((f25 / min) / com.google.android.recaptcha.internal.a.z(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.f20967e * 1.0f);
                                matrix.preScale(z15, z15);
                                matrix.preTranslate(com.google.android.recaptcha.internal.a.D(gVar.f20965b, f23, min, 1.0f), com.google.android.recaptcha.internal.a.D(gVar.f20966c, f24, min, 1.0f));
                                float f27 = gVar.f20969g + i13;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (yeVar2 = oq0Var.f48506c) != null && yeVar2.f26643l) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f15 > 0.0f) {
                                matrix.preScale(1.0f - (f15 * f10), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.k5.A(1.0f, f15, 4.0f * f15, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.B4;
                            matrix.preTranslate((-imageReceiver4.M0) / f10, (-imageReceiver4.N0) / f10);
                            ImageReceiver imageReceiver5 = this.B4;
                            matrix.preScale(imageReceiver5.M0, imageReceiver5.N0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = gfVar.f26857p;
                            int size = arrayList3.size();
                            int i15 = 0;
                            String str5 = null;
                            while (i15 < size) {
                                Object obj3 = arrayList3.get(i15);
                                i15++;
                                org.telegram.messenger.h20 a10 = ((org.telegram.messenger.h20) obj3).a();
                                float f28 = a10.f22815c;
                                float f29 = a10.d;
                                float f30 = a10.f22817f + f28;
                                float f31 = a10.f22818g + f29;
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
                                ArrayList arrayList4 = arrayList3;
                                int i16 = size;
                                a10.f22817f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[c10], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / L2;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / L2;
                                a10.f22818g = sqrt;
                                a10.f22815c = (((fArr[0] + fArr[4]) / f10) / L2) - (a10.f22817f / f10);
                                a10.d = (((fArr[1] + fArr[5]) / f10) / L2) - (sqrt / f10);
                                a10.v = 1.0f;
                                a10.A = true;
                                if (gfVar.f26863w && (yeVar = gfVar.A) != null) {
                                    a10.f22816e = (float) (a10.f22816e - ((yeVar.f26642k / 180.0f) * 3.141592653589793d));
                                }
                                a10.f22816e = (float) (a10.f22816e - ((this.f41359a6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a10);
                                TLRPC.Document document = a10.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.ij.V(document, null, null);
                                }
                                matrix = matrix2;
                                arrayList3 = arrayList4;
                                size = i16;
                            }
                            org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                            j20Var2.I = true;
                            j20Var2.f23481k = 512;
                            j20Var2.h = 512;
                            j20Var2.f23482l = 512;
                            j20Var2.f23479i = 512;
                            j20Var2.G = arrayList2;
                            long k10 = Utilities.k(gfVar.f26861t, 2999L, 800L);
                            j20Var2.f23488r = k10;
                            j20Var2.v = k10;
                            j20Var2.f23483m = 200000;
                            j20Var2.f23484n = 30;
                            z13 = true;
                            j20Var2.N = true;
                            j20Var2.f23487q = 262144L;
                            j20Var = j20Var2;
                            str = str5;
                        } else {
                            z13 = true;
                            j20Var = null;
                            str = null;
                        }
                        float f32 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.gc.a0(createBitmap, Bitmap.CompressFormat.WEBP, f32, f32, 100);
                        org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24470s0);
                        String file = org.telegram.messenger.w7.J(a02, "webp", z13, z13).toString();
                        if (j20Var != null) {
                            j20Var.f23485o = file;
                        }
                        if (this.f41499q5 == null) {
                            this.f41499q5 = new ArrayList();
                        }
                        if (this.f41499q5.isEmpty()) {
                            String str6 = this.f41481o5.f55606c0;
                            if (str6 != null && org.telegram.messenger.i6.g(str6) != null) {
                                this.f41499q5.add(this.f41481o5.f55606c0);
                            } else if (str != null) {
                                this.f41499q5.add(str);
                            } else {
                                this.f41499q5.add("👍");
                            }
                        }
                        this.f41532u2 = false;
                        ms p10 = ms.p();
                        tg.c2 c2Var2 = this.f41481o5;
                        ArrayList arrayList5 = this.f41499q5;
                        fp0 fp0Var = new fp0(this, file, j20Var, gfVar, z9, i7, i10, z11);
                        is isVar = p10.U;
                        Activity W = org.telegram.messenger.g0.W(c2Var2.getContext());
                        if (W != null) {
                            p10.v(W);
                            p10.u(fp0Var);
                            ?? obj4 = new Object();
                            obj4.f26942a = file;
                            obj4.f26947g = j20Var;
                            p10.f47973o = arrayList5;
                            p10.s(null, obj4, null, null, null, 3, false, null, new di.b(), 0);
                            org.telegram.messenger.g0.r(isVar);
                            org.telegram.messenger.g0.i3(isVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                i11 = 3;
                this.d.o(this.O4, j12, z9, i7, i10, z11);
            } else {
                i11 = 3;
                this.d.M(j12);
            }
            if (this.O) {
                if (this.P) {
                    org.telegram.messenger.g0.i3(new yn0(this, i11), 200L);
                } else {
                    z0(false, false);
                }
            }
        }
    }

    public final void t3(float f10) {
        int g12;
        int e12;
        boolean z9;
        View view;
        org.telegram.ui.Components.ge0 ge0Var = this.f41571y2;
        if (ge0Var != null && ge0Var.getVisibility() == 0 && this.G3) {
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            f10 *= Math.min(g1(this.f41526t4) / view.getMeasuredWidth(), y1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.B4;
        float f11 = imageReceiver.M0;
        float f12 = imageReceiver.N0;
        org.telegram.messenger.ye yeVar = this.W4.f48506c;
        if (yeVar != null) {
            f11 *= yeVar.f26638e;
            f12 *= yeVar.f26639f;
        }
        if (this.f41375c2 == 11) {
            g12 = (int) (f11 * f10);
        } else {
            g12 = ((int) ((f11 * f10) - g1(this.f41526t4))) / 2;
        }
        if (this.f41375c2 == 11) {
            e12 = (int) (f12 * f10);
        } else {
            e12 = ((int) ((f12 * f10) - e1())) / 2;
        }
        float f13 = 0.0f;
        if (g12 > 0) {
            this.D6 = -g12;
            this.E6 = g12;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        if (e12 > 0) {
            this.F6 = -e12;
            this.G6 = e12;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        wp0 wp0Var = this.L1;
        if (wp0Var != null) {
            if (f10 <= 1.1f) {
                z9 = true;
            } else {
                z9 = false;
            }
            LinearLayout linearLayout = wp0Var.f55684g1;
            boolean z10 = !z9;
            if (wp0Var.H1 != z10) {
                wp0Var.H1 = z10;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z9) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.camera.q.l(animate.alpha(f13), org.telegram.ui.Components.xq.h, 240L);
            }
        }
    }

    public final void u0(final int i7, final boolean z9) {
        int i10;
        boolean z10;
        boolean z11;
        final boolean z12;
        final boolean z13;
        nk0 nk0Var;
        final File file;
        final nk0 nk0Var2;
        boolean z14;
        boolean z15;
        File file2;
        File J;
        File J2;
        boolean z16;
        final boolean z17;
        File file3;
        nk0 nk0Var3;
        boolean z18;
        org.telegram.ui.Components.v5 v5Var;
        int i11 = this.O4;
        if (i7 == 1) {
            i10 = i11 + 1;
        } else if (i7 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.f41368b5[i7] != null) {
            if (i7 == 0 && i11 == 0 && (v5Var = this.f41437j2) != null) {
                z10 = v5Var.s();
            } else {
                z10 = false;
            }
            File file4 = null;
            if (this.S4 != null) {
                if (i10 >= 0 && i10 < this.X6.size()) {
                    ?? r42 = (org.telegram.messenger.ij) this.X6.get(i10);
                    z11 = O2(r42);
                    if (this.B5 == 1 && !r42.x()) {
                        this.W0[i7].d(-1, z9, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f23262k.attachPath)) {
                        file3 = new File(r42.f23262k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.ij.n1(r42.f23262k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.ij.n1(r42.f23262k).webpage != null && org.telegram.messenger.ij.n1(r42.f23262k).webpage.document == null) {
                        nk0Var3 = new nk0(1, this, l1(i10, null));
                    } else {
                        nk0Var3 = new nk0(2, this, r42.f23262k);
                    }
                    if (org.telegram.messenger.ij.L4(r42.f23262k)) {
                        if ((org.telegram.messenger.iz.B0 && r42.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(r42.f23262k))) || r42.D2(true)) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        nk0 nk0Var4 = nk0Var3;
                        z12 = z18;
                        nk0Var = r42;
                        file = null;
                        file4 = file3;
                        nk0Var2 = nk0Var4;
                        z13 = true;
                    } else {
                        z13 = false;
                        nk0Var = r42;
                        file = null;
                        file4 = file3;
                        nk0Var2 = nk0Var3;
                        z12 = false;
                    }
                } else {
                    this.W0[i7].d(-1, z9, true);
                    return;
                }
            } else {
                if (this.X4 != null) {
                    if (i10 >= 0 && i10 < this.f41408f7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f41408f7.get(i10);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.ij.K4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.w7.z(3), this.f41368b5[i7]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.w7.z(0), this.f41368b5[i7]);
                            } else {
                                z16 = false;
                                file2 = null;
                            }
                            z16 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                org.telegram.messenger.w7.G(this.T);
                                file2 = org.telegram.messenger.w7.I(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(org.telegram.messenger.w7.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.gc.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z16 = true;
                        }
                        z11 = false;
                        z12 = false;
                        z13 = z16;
                        file = new File(org.telegram.messenger.w7.z(4), this.f41368b5[i7]);
                    } else {
                        this.W0[i7].d(-1, z9, true);
                        return;
                    }
                } else {
                    if (this.Y4 != null) {
                        if (i10 >= 0 && i10 < this.f41360a7.size()) {
                            org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.f41360a7.get(i10);
                            if (hcVar != null) {
                                org.telegram.messenger.w7.G(this.T);
                                J = org.telegram.messenger.w7.J(hcVar.f22869f, m1(hcVar), false, true);
                                org.telegram.messenger.w7.G(this.T);
                                J2 = org.telegram.messenger.w7.J(hcVar.f22869f, m1(hcVar), true, true);
                            } else {
                                J2 = null;
                                J = null;
                            }
                        } else {
                            this.W0[i7].d(-1, z9, true);
                            return;
                        }
                    } else if (this.f41358a5 != null) {
                        if (i10 >= 0 && i10 < this.f41388d7.size()) {
                            org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) this.f41388d7.get(i10);
                            org.telegram.messenger.w7.G(this.T);
                            J = org.telegram.messenger.w7.J(ewVar, null, true, true);
                            org.telegram.messenger.w7.G(this.T);
                            J2 = org.telegram.messenger.w7.J(ewVar, null, false, true);
                        } else {
                            this.W0[i7].d(-1, z9, true);
                            return;
                        }
                    } else if (this.f41386d5 != null) {
                        file2 = new File(org.telegram.messenger.w7.z(3), this.f41368b5[i7]);
                        file = new File(org.telegram.messenger.w7.z(4), this.f41368b5[i7]);
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    } else {
                        sq0 sq0Var = this.i7;
                        if (sq0Var != null) {
                            File b10 = sq0Var.b(i10);
                            if (!this.i7.a(i10) && !this.i7.e(i10)) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (z14 && org.telegram.messenger.iz.B0 && (this.i7.d(i10) instanceof TLRPC.Document)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z13 = z14;
                            z12 = z15;
                            nk0Var2 = null;
                            z11 = N2(i10);
                            file4 = b10;
                            nk0Var = null;
                            file = null;
                        } else {
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            nk0Var = null;
                            file = null;
                            nk0Var2 = null;
                        }
                    }
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    nk0Var2 = null;
                    file4 = J;
                    file = J2;
                    nk0Var = nk0Var2;
                }
                nk0Var2 = null;
                file4 = file2;
                nk0Var = nk0Var2;
            }
            if ((i7 != 0 || !this.f41448k5) && z11) {
                z17 = true;
            } else {
                z17 = false;
            }
            final File file5 = file4;
            final ?? r72 = nk0Var;
            final boolean z19 = z10;
            Utilities.f21336e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.ij ijVar;
                    cn cnVar;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.Y8;
                    boolean z20 = z19;
                    final File file6 = file5;
                    if (!z20 && file6 != null) {
                        z20 = file6.exists();
                    }
                    File file7 = file;
                    nk0 nk0Var5 = nk0Var2;
                    File file8 = null;
                    if (file7 == null && nk0Var5 != null) {
                        file7 = nk0Var5.b();
                    } else if (nk0Var5 != null) {
                        file8 = nk0Var5.b();
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
                    final int i12 = i7;
                    final boolean z22 = z12;
                    if (!z21 && i12 != 0 && (ijVar = r72) != null && z22 && org.telegram.messenger.z5.q(photoViewer.T).b(ijVar.f23262k) != 0 && (((cnVar = photoViewer.f41447k4) == null || cnVar.h == null) && !org.telegram.messenger.ij.R5(ijVar.f23262k) && (F0 = ijVar.F0()) != null)) {
                        org.telegram.messenger.w7.G(photoViewer.T).W(F0, ijVar, 0, 10);
                    }
                    final boolean z23 = z13;
                    final boolean z24 = z17;
                    final boolean z25 = z9;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z26;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f41368b5;
                            xo0[] xo0VarArr = photoViewer2.W0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z27 = z23;
                            boolean z28 = z25;
                            boolean z29 = true;
                            if ((file10 == null && file9 == null) || (!(z26 = z21) && !z22)) {
                                if (z27) {
                                    if (!org.telegram.messenger.w7.G(photoViewer2.T).S(strArr[i13])) {
                                        xo0VarArr[i13].d(2, false, true);
                                    } else {
                                        xo0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    xo0VarArr[i13].d(0, z28, true);
                                }
                                Float w10 = org.telegram.messenger.gc.D().w(strArr[i13]);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                xo0VarArr[i13].f(false, w10.floatValue());
                            } else {
                                if (i13 != 0 || !photoViewer2.O3) {
                                    if (z27 && (!z24 || (i13 == 0 && photoViewer2.W2))) {
                                        xo0VarArr[i13].d(3, z28, true);
                                    } else {
                                        xo0VarArr[i13].d(-1, z28, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f41477o0.x()) {
                                    if (!z26) {
                                        if (!org.telegram.messenger.w7.G(photoViewer2.T).S(strArr[i13])) {
                                            photoViewer2.f41477o0.t(8);
                                        } else {
                                            photoViewer2.f41477o0.S(8);
                                        }
                                    } else {
                                        photoViewer2.f41477o0.t(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f41518s4 || (photoViewer2.f41408f7.isEmpty() && (strArr[0] == null || xo0VarArr[0].h == 0))) {
                                    z29 = false;
                                }
                                photoViewer2.H6 = z29;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f41408f7.isEmpty() && i10 >= 0 && i10 < this.f41408f7.size()) {
            Object obj = this.f41408f7.get(i10);
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (gfVar.f26845b && (!gfVar.d() || (!gfVar.j() && this.f41375c2 != 11))) {
                    this.W0[i7].d(3, z9, true);
                    return;
                }
            }
        }
        this.W0[i7].d(-1, z9, true);
    }

    public final int u1() {
        return this.f41516s2.right;
    }

    public final void u2(org.telegram.ui.Components.i30 i30Var) {
        String str;
        int i7;
        TLRPC.User user;
        this.f41479o2 = i30Var;
        if (this.f41375c2 == 1) {
            if (C3()) {
                this.f41469n0.setVisibility(0);
                this.S0.setVisibility(8);
            } else {
                this.S0.setVisibility(0);
                this.f41469n0.setVisibility(8);
            }
            if (i30Var != null && (user = i30Var.f34544b) != null && i30Var.f34545c == 1 && this.f41479o2.d) {
                if (i30Var.f34546e) {
                    this.C1.setSubtitle(org.telegram.messenger.id.a0(null, null, 2131745512, user.first_name));
                } else {
                    this.C1.setSubtitle(org.telegram.messenger.id.a0(null, null, 2131745513, user.first_name));
                }
            } else {
                this.C1.setSubtitle(null);
            }
        }
        if (i30Var != null) {
            if (i30Var.f34545c == 2) {
                if (i30Var.f34546e) {
                    str = "SuggestVideo";
                    i7 = 2131744397;
                } else {
                    str = "SuggestPhoto";
                    i7 = 2131744408;
                }
                L2(org.telegram.messenger.id.M0(i7, str));
            }
            if (i30Var.f34546e) {
                this.S7.setText(org.telegram.messenger.id.M0(2131745535, "SetCover"));
            }
            this.F.setBackground(null);
            this.F.setElevation(2.0f);
        }
    }

    public final void u3() {
        boolean z9;
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null) {
            if (!d1.f.u() && !this.f41503r) {
                z9 = false;
            } else {
                z9 = true;
            }
            u51Var.t0(z9);
        }
        if (!this.f41442j8) {
            this.f41392e1.setEnabled(false);
            this.f41392e1.setClickable(false);
            this.f41392e1.animate().alpha(0.5f).setDuration(180L).start();
            this.R7.setMode(0);
            return;
        }
        this.f41392e1.setEnabled(true);
        this.f41392e1.setClickable(true);
        this.f41392e1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f41503r) {
            if (this.f41385d4 == null) {
                this.M.a(org.telegram.messenger.id.M0(2131745279, "SoundMuted"), true);
            }
            org.telegram.ui.Components.xz xzVar = this.f41383d1;
            xzVar.f40530e = true;
            xzVar.invalidateSelf();
            if (this.f41436j1.getTag() != null) {
                this.f41436j1.setAlpha(0.5f);
                this.f41436j1.setEnabled(false);
            }
            if (this.f41375c2 == 1) {
                this.R7.setMaxProgressDiff(9600.0f / this.f41426h8);
                this.R7.setMode(1);
                z3();
                return;
            }
            this.R7.setMaxProgressDiff(1.0f);
            this.R7.setMode(0);
            return;
        }
        this.M.a(this.C8, true);
        org.telegram.ui.Components.xz xzVar2 = this.f41383d1;
        xzVar2.f40530e = false;
        xzVar2.invalidateSelf();
        if (this.f41436j1.getTag() != null) {
            this.f41436j1.setAlpha(1.0f);
            this.f41436j1.setEnabled(true);
        }
        this.R7.setMaxProgressDiff(1.0f);
        this.R7.setMode(0);
    }

    public final void v0(int i7) {
        org.telegram.ui.Components.q51 q51Var;
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var != null && u51Var.d != null && i7 != u51Var.f38609d0) {
            u51Var.f38609d0 = i7;
            ArrayList arrayList = u51Var.N;
            if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                q51Var = (org.telegram.ui.Components.q51) u51Var.N.get(i7);
            } else {
                q51Var = null;
            }
            u51Var.w0(false, q51Var);
        }
        if (i7 == -1) {
            org.telegram.ui.Components.u51.o0(null, this.S4);
        } else {
            org.telegram.ui.Components.u51 u51Var2 = this.F2;
            if (u51Var2 != null) {
                org.telegram.ui.Components.u51.o0(u51Var2.Z(i7), this.S4);
            }
        }
        x3();
        this.f41485p0.U(null, null);
        try {
            d1.f.b(0);
            if (wf.b.Z().d0()) {
                wf.b.Z().h0(i1());
            }
            org.telegram.ui.Components.u51 u51Var3 = this.F2;
            if (u51Var3 != null) {
                d1.f.x(u51Var3.d0());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v2(boolean z9) {
        if (this.f41470n2 != z9) {
            this.f41470n2 = z9;
            this.Q1.setLayerType(2, null);
            this.Q1.getCurrentView().setLayerType(2, null);
            this.Q1.getNextView().setLayerType(2, null);
        }
    }

    public final void v3(float f10, float f11, float f12, float f13) {
        float f14 = f10 - (f12 / 2.0f);
        float f15 = f11 - (f13 / 2.0f);
        boolean z9 = this.T8;
        RectF rectF = this.S8;
        if (!z9 || Math.abs(rectF.left - f14) >= 1.0f || Math.abs(rectF.top - f15) >= 1.0f || Math.abs(rectF.width() - f12) >= 1.0f || Math.abs(rectF.height() - f13) >= 1.0f) {
            rectF.set(f14, f15, f12 + f14, f13 + f15);
            this.T8 = true;
            if (this.O8 != null && !this.U8) {
                this.U8 = true;
                org.telegram.messenger.g0.i3(this.V8, 150L);
            }
        }
    }

    public final void w0(boolean z9, boolean z10, float f10) {
        if (f10 != this.f41523t1) {
            this.f41523t1 = f10;
            if (this.S4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f41523t1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.ij.B0(this.S4.f23262k) + "_" + this.S4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.ij.B0(this.S4.f23262k) + "_" + this.S4.e1(), this.f41523t1).commit();
                }
            }
            org.telegram.ui.Components.u51 u51Var = this.F2;
            if (u51Var != null) {
                u51Var.v0(this.f41523t1);
            }
            eq0 eq0Var = this.f41401f0;
            if (eq0Var != null) {
                eq0Var.setPlaybackSpeed(this.f41523t1);
            }
        }
        G2(true, z9);
        if (z10) {
            this.f41485p0.U(null, null);
        }
    }

    public final int w1(int i7) {
        org.telegram.ui.ActionBar.g6 g6Var = this.f41541v2;
        if (g6Var != null) {
            return g6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.l6.x0(null, i7, false);
    }

    public final void w2() {
        org.telegram.ui.Components.i51 i51Var;
        org.telegram.ui.Components.i51 i51Var2;
        if (!this.f41412g2 && this.f41375c2 == 1) {
            if (!this.f41505r1 || ((i51Var2 = (org.telegram.ui.Components.i51) this.B2) != null && i51Var2.getVideoWidth() > 0 && i51Var2.getVideoHeight() > 0)) {
                this.f41412g2 = true;
                Bitmap n10 = this.B4.n();
                int i7 = this.B4.U;
                if (n10 == null) {
                    n10 = this.f41419h0.getBitmap();
                    i7 = this.f41419h0.getOrientation();
                }
                Bitmap bitmap = n10;
                int i10 = i7;
                if (bitmap != null || this.B2 != null) {
                    org.telegram.ui.Components.gd0 gd0Var = this.C1;
                    if (this.f41505r1) {
                        i51Var = (org.telegram.ui.Components.i51) this.B2;
                    } else {
                        i51Var = null;
                    }
                    gd0Var.b(bitmap, i10, false, false, this.D1, i51Var, this.W4.f48506c);
                }
            }
        }
    }

    public final void w3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.w3(int, boolean):void");
    }

    public final void x0(boolean z9) {
        int i7 = this.O4;
        if (i7 >= 0 && i7 < this.f41408f7.size() && F1()) {
            if (z9) {
                d0();
            }
            a1().p();
        }
    }

    public final long x1() {
        eq0 eq0Var = this.f41401f0;
        if (eq0Var != null && eq0Var.f32248y) {
            return eq0Var.getVideoDuration();
        }
        org.telegram.ui.Components.u51 u51Var = this.F2;
        if (u51Var == null) {
            return 0L;
        }
        return u51Var.U();
    }

    public final void x2(org.telegram.messenger.ij ijVar, CharSequence charSequence, boolean z9, boolean z10) {
        TextView currentView;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.r5.cloneSpans(charSequence, 3);
        T2(this.Q4, z10);
        if (!this.Q4 && this.f41375c2 != 1) {
            this.U1.setVisibility(8);
            this.V1.setVisibility(8);
            if (this.f41429i2) {
                if (this.Q1.getParent() != this.P0) {
                    FrameLayout frameLayout = this.Z1;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.Q1);
                    }
                    this.Q1.setMeasureAllChildren(false);
                    this.P0.addView(this.Q1, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.T1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f41391e0.getContext());
                    this.Z1 = frameLayout2;
                    this.Q1.setContainer(frameLayout2);
                    xp0 xp0Var = new xp0(this, this.f41391e0.getContext(), this.Q1, this.Z1, 0);
                    this.T1 = xp0Var;
                    this.Q1.setScrollView(xp0Var);
                    this.Z1.setClipChildren(false);
                    this.T1.addView(this.Z1, new ViewGroup.LayoutParams(-1, -2));
                    this.f41391e0.addView(this.T1, c8.ha.e(-1, -1, 80));
                }
                if (this.Q1.getParent() != this.Z1) {
                    this.P0.removeView(this.Q1);
                    this.Q1.setMeasureAllChildren(true);
                    this.Z1.addView(this.Q1, -1, -2);
                    this.f41507r3.bringToFront();
                }
                if (ijVar != null && ijVar.r4()) {
                    if (this.R1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.E);
                        this.R1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.l6.b0(620756991, 369098751, 8, 8));
                        c8.ka.b(this.R1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.E);
                        this.S1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.S1.setTextColor(-1);
                        this.S1.setTypeface(org.telegram.messenger.g0.o());
                        this.R1.addView(this.S1, c8.ha.e(-2, -2, 17));
                        this.R1.setOnClickListener(new tn0(this, 7));
                    }
                    org.telegram.messenger.g0.E2(this.R1);
                    this.S1.setText(ijVar.W0);
                    this.Z1.addView(this.R1, c8.ha.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                    this.Q1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(64.0f));
                    this.R1.bringToFront();
                } else {
                    FrameLayout frameLayout4 = this.R1;
                    if (frameLayout4 != null) {
                        org.telegram.messenger.g0.E2(frameLayout4);
                        this.Q1.setPadding(0, 0, 0, 0);
                    }
                }
            }
            boolean isEmpty = TextUtils.isEmpty(cloneSpans);
            boolean isEmpty2 = TextUtils.isEmpty(this.Q1.getCurrentView().getText());
            nq0 nq0Var = this.Q1;
            if (z10) {
                currentView = nq0Var.getNextView();
            } else {
                currentView = nq0Var.getCurrentView();
            }
            if (this.f41505r1) {
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
                if (this.f41429i2) {
                    Point point = org.telegram.messenger.g0.f22563q;
                    if (point.x > point.y) {
                        i7 = 5;
                    } else {
                        i7 = 10;
                    }
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                if (maxLines != i7) {
                    this.Q1.getCurrentView().setMaxLines(i7);
                    this.Q1.getNextView().setMaxLines(i7);
                    this.Q1.getCurrentView().setEllipsize(null);
                    this.Q1.getNextView().setEllipsize(null);
                }
            }
            currentView.setScrollX(0);
            boolean z18 = this.f41429i2;
            if (!z18 && z10 && isEmpty) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41461m2 = z11;
            if (!z18) {
                this.T1.f47350l0 = false;
            }
            if (z10) {
                if (z18) {
                    viewGroup = this.P0;
                } else {
                    viewGroup = this.T1;
                }
                TransitionManager.endTransitions(viewGroup);
                if (this.f41429i2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.P0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new yp0(this, isEmpty2, isEmpty, 1)).addTransition(new yp0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.T1.f47350l0 = true;
                        duration.addTransition(new org.telegram.ui.Components.ok0(this, 2));
                    }
                    if (isEmpty2 && !isEmpty) {
                        duration.addTarget((View) this.Q1);
                    }
                    TransitionManager.beginDelayedTransition(this.T1, duration);
                }
                z12 = true;
            } else {
                this.Q1.getCurrentView().setText((CharSequence) null);
                xp0 xp0Var2 = this.T1;
                if (xp0Var2 != null) {
                    xp0Var2.scrollTo(0, 0);
                }
                z12 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.l6.K(null, true);
                if (ijVar == null || !this.f41464m5 || (message = ijVar.f23262k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.l21.M0())) {
                    if (ijVar != null && !ijVar.f23262k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        ijVar.c(spannableString, true, false);
                        if (org.telegram.messenger.ij.L4(ijVar.f23262k)) {
                            org.telegram.messenger.ij.h(ijVar.P3(), spannableString, false, 3, (int) ijVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.i6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (ijVar != null && ijVar.r4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(ijVar.Q0)) {
                        spannableStringBuilder.append((CharSequence) ijVar.Q0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new di.r8(1), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.Q1.setTag(cloneSpans);
                try {
                    nq0 nq0Var2 = this.Q1;
                    if (this.f41487p2 != z9) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    nq0Var2.a(cloneSpans, z10, z17);
                    xp0 xp0Var3 = this.T1;
                    if (xp0Var3 != null) {
                        xp0Var3.H(xp0Var3.getWidth(), xp0Var3.getHeight());
                    }
                    z13 = true;
                } catch (Exception e10) {
                    z13 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.J && (!this.f41505r1 || this.P0.getVisibility() == 0 || this.i7 != null)) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                nq0 nq0Var3 = this.Q1;
                if (z16) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                nq0Var3.setVisibility(i10);
            } else {
                z13 = true;
                if (this.f41429i2) {
                    this.Q1.a(org.telegram.messenger.id.M0(2131754454, "AddCaption"), z10, false);
                    this.Q1.getCurrentView().setTextColor(-1291845633);
                    this.Q1.setTag("empty");
                    this.Q1.setVisibility(0);
                } else {
                    this.Q1.a(null, z10, false);
                    this.Q1.getCurrentView().setTextColor(-1);
                    nq0 nq0Var4 = this.Q1;
                    if (z12 && !isEmpty2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    nq0Var4.b(4, z14);
                    this.Q1.setTag(null);
                }
            }
            if (this.Q1.getCurrentView() instanceof mq0) {
                ((mq0) this.Q1.getCurrentView()).setLoading(z9);
            }
            if (!isEmpty && z9) {
                z15 = z13;
            } else {
                z15 = false;
            }
            this.f41487p2 = z15;
            return;
        }
        a1().setText(cloneSpans);
        this.Q1.setVisibility(8);
    }

    public final void x3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x3():void");
    }

    public final void y0() {
        wp0 wp0Var = this.L1;
        Activity activity = this.D;
        en0 en0Var = new en0(this, 1);
        if (wp0Var.f55707u1) {
            wp0Var.w0(false);
        } else if (wp0Var.P1) {
            wp0Var.k0(true);
        } else if (wp0Var.C0 && wp0Var.B0 != null) {
            wp0Var.r0(null, true);
        } else if (wp0Var.f55694o0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, wp0Var.f55717z1);
            String M0 = org.telegram.messenger.id.M0(2131747278, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.id.M0(2131751405, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new org.telegram.ui.ActionBar.m3(en0Var, 21));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            P2(alertDialog$Builder);
        } else {
            en0Var.run();
        }
    }

    public final int y1() {
        int measuredHeight;
        int e12 = e1();
        rq0 rq0Var = this.f41391e0;
        if (rq0Var != null && (measuredHeight = rq0Var.getMeasuredHeight()) > 0) {
            return Math.min(e12, measuredHeight);
        }
        return e12;
    }

    public final void y2(int i7) {
        z2(i7, true, false, false);
    }

    public final void y3() {
        long j3;
        int H;
        org.telegram.messenger.ij ijVar;
        wq0 wq0Var = this.d;
        if (wq0Var != null) {
            int H2 = wq0Var.H();
            this.O0.a(H2);
            if (H2 == 0) {
                m3(false, true);
            }
            if (this.S0 != null) {
                wq0 wq0Var2 = this.d;
                long j10 = 0;
                if (wq0Var2 != null) {
                    j3 = wq0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (ijVar = this.S4) != null) {
                    j3 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                }
                li.w1 w1Var = this.S0;
                wq0 wq0Var3 = this.d;
                if (wq0Var3 == null || !wq0Var3.q() || this.d.w()) {
                    j10 = org.telegram.messenger.qp.s1(this.T).N1(j3);
                }
                wq0 wq0Var4 = this.d;
                if (wq0Var4 == null) {
                    H = 1;
                } else {
                    H = wq0Var4.H();
                }
                w1Var.i(Math.max(1, H), j10, true);
            }
        }
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

    public final void z2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z2(int, boolean, boolean, boolean):void");
    }

    public final void z3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z3():void");
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
