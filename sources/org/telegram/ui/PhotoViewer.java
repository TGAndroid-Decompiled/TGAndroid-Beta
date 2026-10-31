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
public class PhotoViewer implements org.telegram.messenger.us, org.telegram.ui.Components.o10, org.telegram.ui.Components.n10, lf.a, fe.e {
    public static Drawable[] U8;
    public static final Paint V8 = new Paint(2);
    public static final HashMap W8 = new HashMap();
    public static DecelerateInterpolator X8;
    public static Paint Y8;
    public static final Property Z8;
    public static volatile PhotoViewer f33430a9;
    public static volatile PhotoViewer f33431b9;
    public org.telegram.ui.ActionBar.y A0;
    public org.telegram.ui.Components.rn0 A1;
    public AnimatorSet A2;
    public final int[] A3;
    public org.telegram.ui.Components.lc0 A4;
    public boolean A5;
    public float A6;
    public ObjectAnimator A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.t0 B0;
    public AnimatorSet B1;
    public TextureView B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public int B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.t0 C0;
    public org.telegram.ui.Components.be0 C1;
    public SurfaceView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public xa.n C7;
    public boolean C8;
    public Activity D;
    public org.telegram.ui.ActionBar.t0 D0;
    public final eg.g D1;
    public boolean D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public String D8;
    public ContextThemeWrapper E;
    public org.telegram.ui.ActionBar.t0 E0;
    public eg.g E1;
    public zr0 E2;
    public ImageView E3;
    public e2.c E4;
    public long E5;
    public float E6;
    public float E7;
    public final org.telegram.ui.Components.t5 E8;
    public kg.g1 F;
    public org.telegram.ui.ActionBar.b1 F0;
    public eg.g F1;
    public org.telegram.ui.Components.u61 F2;
    public boolean F3;
    public e2.c F4;
    public sg.o0 F5;
    public float F6;
    public final qo0 F7;
    public org.telegram.ui.Components.t5[] F8;
    public ImageView G;
    public org.telegram.ui.Components.i7 G0;
    public org.telegram.messenger.ye G1;
    public jf.f G2;
    public int G3;
    public e2.c G4;
    public String G5;
    public float G6;
    public Path G7;
    public RectF G8;
    public Drawable H;
    public u71 H0;
    public org.telegram.messenger.ye H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public Paint H7;
    public RectF H8;
    public yg.c I;
    public u71 I0;
    public org.telegram.ui.Components.oe0 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public Paint I7;
    public Matrix I8;
    public boolean J;
    public tr J0;
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
    public vh.r2 K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public LinearGradient K7;
    public RenderNode K8;
    public AnimatorSet L;
    public final BackgroundDrawable L0;
    public er0 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public RenderNode L8;
    public ds0 M;
    public final Paint M0;
    public boolean M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Matrix M7;
    public final g.y M8;
    public cs0 N;
    public CheckBox N0;
    public dr0 N1;
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
    public hs0 O7;
    public boolean O8;
    public boolean P;
    public jg.b1 P0;
    public org.telegram.ui.ActionBar.x1 P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public org.telegram.ui.Cells.u0 P7;
    public View P8;
    public eq0 Q;
    public FrameLayout Q0;
    public wr0 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public RadialProgressView Q7;
    public com.google.android.gms.internal.cast.o Q8;
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
    public bi.f2 S0;
    public TextView S1;
    public org.telegram.ui.Components.u61 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public gq0 S7;
    public boolean S8;
    public int T;
    public org.telegram.ui.Components.qe0 T0;
    public fr0 T1;
    public SurfaceTexture T2;
    public View T3;
    public org.telegram.messenger.jj T4;
    public boolean T5;
    public int T6;
    public TextView T7;
    public boolean T8;
    public int U;
    public org.telegram.ui.Cells.u0 U0;
    public jq0 U1;
    public boolean U2;
    public zp0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public AnimatorSet U7;
    public int V;
    public TextView V0;
    public kq0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public float W;
    public final fq0[] W0;
    public float W1;
    public boolean W2;
    public org.telegram.ui.Components.fu W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public qp0 X;
    public id X0;
    public l0 X1;
    public boolean X2;
    public int X3;
    public final xr0 X4;
    public float X5;
    public final SparseArray[] X6;
    public long X7;
    public tg.b Y;
    public ImageView Y0;
    public FrameLayout Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public je.b Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public org.telegram.messenger.ic Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public volatile int Z7;
    public final fe.b f33432a = new fe.b(0, this, org.telegram.ui.Components.gr.h, 380, false);
    public je.b f33433a0;
    public ImageView f33434a1;
    public org.telegram.ui.Components.bi a2;
    public float f33435a3;
    public final org.telegram.ui.Cells.j1 f33436a4;
    public org.telegram.messenger.ic f33437a5;
    public float f33438a6;
    public final ArrayList f33439a7;
    public int f33440a8;
    public final boolean f33441b;
    public org.telegram.ui.Components.s9 f33442b0;
    public ImageView f33443b1;
    public aa0 f33444b2;
    public String f33445b3;
    public final VideoFramesRewinder f33446b4;
    public org.telegram.messenger.pw f33447b5;
    public float f33448b6;
    public final ArrayList f33449b7;
    public int f33450b8;
    public int f33451c;
    public org.telegram.ui.Components.w9 f33452c0;
    public ImageView f33453c1;
    public int f33454c2;
    public String f33455c3;
    public final rq0 f33456c4;
    public final String[] f33457c5;
    public float f33458c6;
    public final ArrayList f33459c7;
    public volatile int f33460c8;
    public es0 d;
    public WindowManager.LayoutParams f33461d0;
    public org.telegram.ui.Components.k00 f33462d1;
    public boolean f33463d2;
    public long f33464d3;
    public final org.telegram.ui.Cells.f2 f33465d4;
    public gs0 f33466d5;
    public float f33467d6;
    public final ArrayList f33468d7;
    public volatile int f33469d8;
    public boolean e;
    public as0 f33470e0;
    public org.telegram.ui.ActionBar.g0 f33471e1;
    public boolean f33472e2;
    public float f33473e3;
    public CharSequence f33474e4;
    public String f33475e5;
    public float f33476e6;
    public final ArrayList e7;
    public volatile int f33477e8;
    public boolean f33478f;
    public mr0 f33479f0;
    public org.telegram.ui.Components.r80 f33480f1;
    public boolean f33481f2;
    public boolean f33482f3;
    public boolean f33483f4;
    public long f33484f5;
    public float f33485f6;
    public final ArrayList f7;
    public volatile int f33486f8;
    public fs0 f33487g0;
    public hq0 f33488g1;
    public boolean f33489g2;
    public long f33490g3;
    public boolean f33491g4;
    public String f33492g5;
    public float f33493g6;
    public final ArrayList f33494g7;
    public volatile int f33495g8;
    public int h;
    public ClippingImageView f33496h0;
    public ArrayList f33497h1;
    public boolean f33498h2;
    public boolean f33499h3;
    public final iq0 f33500h4;
    public boolean f33501h5;
    public float f33502h6;
    public org.telegram.messenger.ic f33503h7;
    public volatile int f33504h8;
    public dg0 f33505i0;
    public ArrayList f33506i1;
    public boolean f33507i2;
    public ms0 f33508i3;
    public final iq0 f33509i4;
    public TL_iv.PageBlock f33510i5;
    public float f33511i6;
    public is0 f33512i7;
    public float f33513i8;
    public View f33514j0;
    public org.telegram.ui.Components.i61 f33515j1;
    public org.telegram.ui.Components.s5 f33516j2;
    public String f33517j3;
    public final q60 f33518j4;
    public org.telegram.messenger.kc f33519j5;
    public float f33520j6;
    public bs0 f33521j7;
    public int f33522j8;
    public int f33523k0;
    public vh.p2 f33524k1;
    public boolean f33525k2;
    public ValueAnimator f33526k3;
    public final float[][] f33527k4;
    public boolean f33528k5;
    public float f33529k6;
    public final Rect f33530k7;
    public volatile boolean f33531k8;
    public TextView f33532l0;
    public org.telegram.ui.Components.d30 l1;
    public boolean f33533l2;
    public boolean f33534l3;
    public un l4;
    public boolean f33535l5;
    public float f33536l6;
    public final e2.f f33537l7;
    public volatile boolean f33538l8;
    public TextView m0;
    public org.telegram.ui.Components.i11 f33539m1;
    public boolean f33540m2;
    public final int[] f33541m3;
    public org.telegram.ui.ActionBar.k2 f33542m4;
    public boolean f33543m5;
    public float f33544m6;
    public aa0 f33545m7;
    public long f33546m8;
    public boolean f33547n;
    public TextView f33548n0;
    public UndoView f33549n1;
    public boolean f33550n2;
    public final int[] f33551n3;
    public int f33552n4;
    public boolean f33553n5;
    public long f33554n6;
    public org.telegram.ui.Components.wb f33555n7;
    public long f33556n8;
    public org.telegram.ui.ActionBar.t0 f33557o0;
    public ls0 f33558o1;
    public org.telegram.ui.Components.z30 f33559o2;
    public org.telegram.ui.ActionBar.u5 f33560o3;
    public long f33561o4;
    public String f33562o5;
    public int f33563o6;
    public int f33564o7;
    public float f33565o8;
    public org.telegram.ui.ActionBar.t0 f33566p0;
    public fg.j f33567p1;
    public boolean f33568p2;
    public ImageView f33569p3;
    public Runnable f33570p4;
    public jg.v2 p5;
    public AnimatorSet f33571p6;
    public boolean f33572p7;
    public float f33573p8;
    public org.telegram.ui.ActionBar.b1 f33574q0;
    public ImageReceiver f33575q1;
    public org.telegram.messenger.dp f33576q2;
    public org.telegram.ui.Components.w61 f33577q3;
    public gs0 f33578q4;
    public org.telegram.ui.Components.pe0 f33579q5;
    public AnimatorSet q6;
    public CharSequence f33580q7;
    public long f33581q8;
    public boolean f33582r;
    public org.telegram.ui.ActionBar.x0 f33583r0;
    public boolean f33584r1;
    public boolean f33585r2;
    public do0 f33586r3;
    public gs0 f33587r4;
    public ArrayList f33588r5;
    public org.telegram.ui.Components.p10 f33589r6;
    public boolean f33590r7;
    public long f33591r8;
    public boolean f33592s;
    public org.telegram.ui.ActionBar.b1 f33593s0;
    public final qo0 f33594s1;
    public final Rect f33595s2;
    public tq0 f33596s3;
    public boolean f33597s4;
    public ih.c f33598s5;
    public boolean f33599s6;
    public ValueAnimator f33600s7;
    public long f33601s8;
    public org.telegram.ui.ActionBar.b1 f33602t0;
    public float f33603t1;
    public boolean f33604t2;
    public AnimatorSet f33605t3;
    public boolean f33606t4;
    public sr0 f33607t5;
    public final DecelerateInterpolator f33608t6;
    public TLRPC.Document f33609t7;
    public long f33610t8;
    public org.telegram.ui.ActionBar.h1 f33611u0;
    public long f33612u1;
    public boolean f33613u2;
    public boolean f33614u3;
    public int f33615u4;
    public LinearLayout f33616u5;
    public float f33617u6;
    public TLRPC.Document f33618u7;
    public long f33619u8;
    public org.telegram.ui.ActionBar.b1 f33620v0;
    public final GradientDrawable[] f33621v1;
    public org.telegram.ui.ActionBar.p6 f33622v2;
    public int f33623v3;
    public final qo0 f33624v4;
    public sr0 f33625v5;
    public float f33626v6;
    public boolean f33627v7;
    public long f33628v8;
    public int f33629w;
    public vr f33630w0;
    public final boolean[] f33631w1;
    public final cq0 f33632w2;
    public TextureView f33633w3;
    public int f33634w4;
    public sr0 f33635w5;
    public float f33636w6;
    public boolean f33637w7;
    public float f33638w8;
    public AnimatorSet f33639x;
    public LinearLayout f33640x0;
    public final float[] f33641x1;
    public final iq0 f33642x2;
    public ImageView f33643x3;
    public String f33644x4;
    public sr0 f33645x5;
    public float f33646x6;
    public org.telegram.messenger.j20 f33647x7;
    public nr0 f33648x8;
    public final qo0 f33649y;
    public final ArrayList f33650y0;
    public int f33651y1;
    public org.telegram.ui.Components.af0 f33652y2;
    public final ImageView[] y3;
    public org.telegram.ui.Components.lc0 f33653y4;
    public sr0 f33654y5;
    public float f33655y6;
    public final float[] f33656y7;
    public org.telegram.messenger.jj f33657y8;
    public org.telegram.ui.ActionBar.h1 f33658z0;
    public org.telegram.ui.Components.m61 f33659z1;
    public View f33660z2;
    public boolean f33661z3;
    public org.telegram.ui.Components.lc0 f33662z4;
    public long f33663z5;
    public float f33664z6;
    public final float[] f33665z7;
    public boolean f33666z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f33667g = 0;
        public final RectF f33668a;
        public final RectF f33669b;
        public final Paint f33670c;
        public uf0 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f33668a = new RectF();
            this.f33669b = new RectF();
            Paint paint = new Paint(1);
            this.f33670c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            aa0 aa0Var = photoViewer.f33545m7;
            if (aa0Var != null) {
                aa0Var.c(!this.e);
            }
            aa0 aa0Var2 = photoViewer.f33444b2;
            if (aa0Var2 != null) {
                aa0Var2.c(!this.e);
            }
            org.telegram.ui.Components.bi biVar = photoViewer.a2;
            if (biVar != null) {
                boolean z11 = this.e;
                biVar.f24721s2.l(biVar.f24675f4);
                if (biVar.f24707o4 != z11) {
                    biVar.f24707o4 = z11;
                    org.telegram.ui.Components.uh uhVar = biVar.f24721s2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                    if (uhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f23867i1) {
                        if (z11 && !biVar.f24711p4) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f23874n && !chatAttachAlertPhotoLayout.O0) {
                            if (z10) {
                                org.telegram.ui.Components.yl ylVar = chatAttachAlertPhotoLayout.P;
                                if (ylVar != null) {
                                    chatAttachAlertPhotoLayout.f23877o0 = Boolean.valueOf(ylVar.isFrontface());
                                    chatAttachAlertPhotoLayout.e0(true);
                                    return;
                                }
                                return;
                            }
                            chatAttachAlertPhotoLayout.t0();
                        }
                    }
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            uf0 uf0Var;
            gs0 gs0Var;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (!photoViewer.T8) {
                if (photoViewer.f33552n4 != 0 && !org.telegram.messenger.i0.Q1() && (gs0Var = photoViewer.f33466d5) != null && gs0Var.f37636m != null) {
                    ClippingImageView clippingImageView = photoViewer.f33496h0;
                    float translationX = clippingImageView.getTranslationX();
                    RectF rectF = this.f33669b;
                    rectF.left = translationX;
                    rectF.top = clippingImageView.getTranslationY();
                    rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                    float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                    rectF.left += clippingImageView.f23939b;
                    rectF.top += clippingImageView.d;
                    rectF.right -= clippingImageView.f23940c;
                    rectF.bottom = scaleY - clippingImageView.f23938a;
                    if (!rectF.isEmpty()) {
                        rectF.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                        Rect bounds = getBounds();
                        float f7 = bounds.right;
                        float f10 = bounds.bottom;
                        for (int i10 = 0; i10 < 4; i10++) {
                            RectF rectF2 = this.f33668a;
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
                            canvas.drawRect(rectF2, this.f33670c);
                        }
                    }
                } else {
                    super.draw(canvas);
                }
                if (getAlpha() != 0 && (uf0Var = this.d) != null) {
                    org.telegram.messenger.i0.g3(uf0Var);
                    this.d = null;
                }
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.D instanceof LaunchActivity) {
                if (photoViewer.e && i10 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.e = z10;
                if (z10) {
                    a();
                } else {
                    org.telegram.messenger.i0.h3(new rr0(this, 0), 70L);
                }
            }
            super.setAlpha(i10);
            this.f33670c.setAlpha(i10);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f33672a;
        public final TextPaint f33673b;
        public final Paint f33674c;
        public int d;
        public int e;
        public final RectF f33675f;
        public int h;
        public float f33676n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f33673b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f33674c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f33675f = new RectF();
            a(0);
        }

        public final void a(int i10) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.i0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f33673b;
            this.f33672a = new StaticLayout("" + Math.max(1, i10), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.e = this.f33672a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f33674c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i10 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.g6 g6Var = org.telegram.ui.Components.i6.f26888b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, g6Var, 0), ObjectAnimator.ofInt(textPaint, g6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i11 = this.h;
                if (i11 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.g6 g6Var2 = org.telegram.ui.Components.i6.f26888b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, g6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, g6Var2, 0, 255));
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
            return this.f33676n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f33674c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.i0.L(14.0f) + measuredHeight;
            RectF rectF = this.f33675f;
            rectF.set(org.telegram.messenger.i0.L(1.0f), measuredHeight - org.telegram.messenger.i0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), paint);
            if (this.f33672a != null) {
                this.f33673b.setAlpha((int) ((1.0f - this.f33676n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f33676n * org.telegram.messenger.i0.L(5.0f)) + org.telegram.messenger.i0.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.f33672a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f33676n * 255.0f));
                int centerX = (int) rectF.centerX();
                int z10 = (int) sc.e.z(1.0f, this.f33676n, org.telegram.messenger.i0.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(org.telegram.messenger.i0.L(5.0f) + centerX, z10 - org.telegram.messenger.i0.L(5.0f), centerX - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f) + z10, paint);
                canvas.drawLine(centerX - org.telegram.messenger.i0.L(5.0f), z10 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f) + centerX, org.telegram.messenger.i0.L(5.0f) + z10, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i10 = this.h;
            if (i10 > 0) {
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.cd.G(i10, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(20.0f) + this.d, org.telegram.messenger.i0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f7) {
            this.f33676n = f7;
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
            Z8 = new pp0();
        } else {
            Z8 = new org.telegram.ui.Cells.g1(Float.class, "progress", 4);
        }
        f33430a9 = null;
        f33431b9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33441b = z10;
        this.h = -1;
        this.f33547n = true;
        this.f33649y = new qo0(this, 20);
        this.J = true;
        this.O = true;
        this.P = false;
        this.Z = new je.b();
        this.f33650y0 = new ArrayList();
        this.K0 = new HashMap(3);
        this.L0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.M0 = paint;
        this.W0 = new fq0[3];
        this.f33594s1 = new qo0(this, 21);
        this.f33621v1 = new GradientDrawable[2];
        this.f33631w1 = new boolean[2];
        this.f33641x1 = new float[2];
        this.D1 = new Object();
        this.E1 = new Object();
        this.F1 = new Object();
        this.W1 = -8.0f;
        this.f33595s2 = new Rect();
        this.f33632w2 = new cq0(this);
        this.f33642x2 = new iq0(this, 0);
        this.f33534l3 = true;
        this.f33541m3 = new int[2];
        this.f33551n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f33436a4 = new org.telegram.ui.Cells.j1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f33446b4 = videoFramesRewinder;
        this.f33456c4 = new rq0(this, videoFramesRewinder);
        this.f33465d4 = new org.telegram.ui.Cells.f2(this);
        this.f33500h4 = new iq0(this, 1);
        this.f33509i4 = new iq0(this, 2);
        this.f33518j4 = new q60(this, 1);
        this.f33527k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f33624v4 = new qo0(this, 22);
        this.B4 = new ImageReceiver(null);
        this.C4 = new ag.c2(this, 4);
        this.D4 = new ImageReceiver(null);
        this.E4 = new e2.c(1, new qo0(this, 23));
        this.F4 = new e2.c(1, new qo0(this, 23));
        this.G4 = new e2.c(1, new qo0(this, 23));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f33457c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f33438a6 = 1.0f;
        this.f33448b6 = 0.0f;
        this.f33563o6 = -1;
        this.f33608t6 = new DecelerateInterpolator(1.5f);
        this.f33636w6 = 1.0f;
        this.f33646x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f33439a7 = new ArrayList();
        this.f33449b7 = new ArrayList();
        this.f33459c7 = new ArrayList();
        this.f33468d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.f33494g7 = new ArrayList();
        this.f33503h7 = null;
        this.f33512i7 = null;
        this.f33530k7 = new Rect();
        this.f33537l7 = new e2.f(new int[]{org.telegram.messenger.zs.f19683s, org.telegram.messenger.zs.f19690t, org.telegram.messenger.zs.W, org.telegram.messenger.zs.V, org.telegram.messenger.zs.f19605e3});
        this.f33656y7 = new float[]{1.0f};
        this.f33665z7 = new float[]{1.0f};
        this.F7 = new qo0(this, 24);
        this.N7 = new int[2];
        this.V7 = -1L;
        this.W7 = -1L;
        this.X7 = -1L;
        this.Z7 = -1;
        this.E8 = new org.telegram.ui.Components.t5(new qo0(this, 23), 180L, org.telegram.ui.Components.gr.f26496g);
        this.M8 = new Object();
        this.N8 = new a0.h();
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.h0(3);
    }

    public static String A1() {
        File z10 = org.telegram.messenger.b8.z(4);
        return new File(z10, org.telegram.messenger.tz.p() + "_temp.jpg").getAbsolutePath();
    }

    public static void D(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.u61 u61Var;
        org.telegram.messenger.jj jjVar;
        boolean z11;
        as0 as0Var = photoViewer.f33470e0;
        photoViewer.f33461d0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.D.getSystemService("window")).updateViewLayout(photoViewer.f33487g0, photoViewer.f33461d0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        un unVar = photoViewer.l4;
        if (unVar != null && unVar.Z != null && unVar.getFragmentView() != null) {
            mk mkVar = photoViewer.l4.Z;
            if (mkVar.f23822z2) {
                mkVar.q1();
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.i0.k3(photoViewer.l4.getParentActivity(), photoViewer.f33451c);
            photoViewer.l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (u61Var = photoViewer.F2) != null && u61Var.S() > 1500 && (jjVar = photoViewer.T4) != null && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            num = Integer.valueOf((int) (photoViewer.F2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(0);
            String K = org.telegram.messenger.w3.K(org.telegram.messenger.vp.r1(photoViewer.T).L0(Long.valueOf(-org.telegram.messenger.jj.B0(jjVar2.f16337k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                c3.i0.r(sb2, org.telegram.messenger.vp.r1(photoViewer.T).U2, "/", K, "/");
                sb2.append(jjVar2.f1());
                str = sb2.toString();
            }
        }
        oq0 oq0Var = new oq0(photoViewer, photoViewer.D, photoViewer.l4, arrayList, str, num, as0Var, z10);
        oq0Var.A0(false);
        oq0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.i0.h3(new uf0(20, photoViewer, oq0Var), 250L);
        oq0Var.show();
    }

    public static void F(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.jj jjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.s0()) {
            return;
        }
        org.telegram.messenger.jj jjVar2 = photoViewer.T4;
        File file2 = null;
        if (jjVar2 != null) {
            if (jjVar2.t() && !photoViewer.T4.U2()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.T4.P3()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean L4 = org.telegram.messenger.jj.L4(photoViewer.T4.f16337k);
            if (!TextUtils.isEmpty(photoViewer.T4.f16337k.attachPath)) {
                File file3 = new File(photoViewer.T4.f16337k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.b8.G(photoViewer.T);
                file2 = org.telegram.messenger.b8.N(photoViewer.T4.f16337k, false, true);
            }
            jjVar = jjVar2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = L4;
        } else {
            file = null;
            jjVar = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.f33512i7 = new is0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            qr0 qr0Var = new qr0();
            qr0Var.f41041c = false;
            photoViewer.n3(false, true, qr0Var);
            org.telegram.messenger.i0.h3(new ap0(photoViewer, file, z10, jjVar, z11, z12), qr0Var.f41039a);
            return;
        }
        photoViewer.X2();
    }

    public static boolean F1() {
        if (f33430a9 != null) {
            return true;
        }
        return false;
    }

    public static void H(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H(org.telegram.ui.PhotoViewer):void");
    }

    public static android.graphics.Bitmap J0(android.graphics.Bitmap r16, org.telegram.messenger.ye r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.J0(android.graphics.Bitmap, org.telegram.messenger.ye, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean N1(org.telegram.messenger.jj jjVar) {
        if (f33430a9 != null && !f33430a9.B3 && f33430a9.e && jjVar != null && f33430a9.T4 != null && f33430a9.T4.f1() == jjVar.f1() && org.telegram.messenger.jj.B0(f33430a9.T4.f16337k) == org.telegram.messenger.jj.B0(jjVar.f16337k)) {
            return true;
        }
        return false;
    }

    public static boolean O1(org.telegram.messenger.jj jjVar) {
        if (f33431b9 != null && jjVar != null && f33431b9.T4 != null && f33431b9.T4.f1() == jjVar.f1() && org.telegram.messenger.jj.B0(f33431b9.T4.f16337k) == org.telegram.messenger.jj.B0(jjVar.f16337k)) {
            return true;
        }
        return false;
    }

    public static boolean P1(String str) {
        if (f33430a9 != null && f33430a9.e && !f33430a9.f33597s4 && str != null && str.equals(f33430a9.f33475e5)) {
            return true;
        }
        return false;
    }

    public static boolean Q1(org.telegram.messenger.jj jjVar) {
        boolean z10;
        if (f33430a9 != null && !f33430a9.B3 && f33430a9.e && !f33430a9.f33597s4 && jjVar != null) {
            org.telegram.messenger.jj jjVar2 = f33430a9.T4;
            if (jjVar2 == null && f33430a9.d != null) {
                jjVar2 = f33430a9.d.V();
            }
            if (jjVar2 != null && jjVar2.f1() == jjVar.f1() && org.telegram.messenger.jj.B0(jjVar2.f16337k) == org.telegram.messenger.jj.B0(jjVar.f16337k)) {
                z10 = true;
                if (z10 && f33431b9 != null) {
                    if (f33431b9.e && !f33431b9.f33597s4 && jjVar != null && f33431b9.T4 != null && f33431b9.T4.f1() == jjVar.f1() && org.telegram.messenger.jj.B0(f33431b9.T4.f16337k) == org.telegram.messenger.jj.B0(jjVar.f16337k)) {
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
        if (f33430a9 != null && f33430a9.e && !f33430a9.f33597s4 && botInlineResult != null && f33430a9.Y4 != null && botInlineResult.f19791id == f33430a9.Y4.f19791id) {
            return true;
        }
        return false;
    }

    public static boolean S1(TLRPC.FileLocation fileLocation) {
        if (f33430a9 != null && f33430a9.e && !f33430a9.f33597s4 && fileLocation != null) {
            if (f33430a9.Z4 == null || fileLocation.local_id != f33430a9.Z4.f16100f.local_id || fileLocation.volume_id != f33430a9.Z4.f16100f.volume_id || fileLocation.dc_id != f33430a9.Z4.f16097a) {
                if (f33430a9.f33437a5 != null && fileLocation.local_id == f33430a9.f33437a5.f16100f.local_id && fileLocation.volume_id == f33430a9.f33437a5.f16100f.volume_id && fileLocation.dc_id == f33430a9.f33437a5.f16097a) {
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
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size() && (jjVar = (org.telegram.messenger.jj) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f33553n5 && (message = jjVar.f16337k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.m31.M0())) {
                photoViewer.D2(jjVar, n2(jjVar), false, true);
            } else {
                photoViewer.D2(jjVar, jjVar.f16394z, photoViewer.f33553n5, true);
            }
        }
    }

    public static boolean U2(org.telegram.messenger.jj jjVar) {
        if (jjVar != null && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            if (jjVar.f16387x0 || jjVar.f16383w0 || jjVar.D2(true) || (jjVar.B() && org.telegram.messenger.tz.B0)) {
                int i10 = org.telegram.messenger.tz.f18131a;
                if (org.telegram.messenger.sc.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void W(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.V7 != -1 && (textureView = photoViewer.B2) != null) {
            photoViewer.V7 = -1L;
            photoViewer.f33660z2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.gr.f26498j).setDuration(85L).setListener(new org.telegram.ui.Components.iw0(6, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void X(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X(org.telegram.ui.PhotoViewer):void");
    }

    public static void Y(PhotoViewer photoViewer) {
        int i10;
        org.telegram.ui.Components.w61 w61Var = photoViewer.f33577q3;
        if (w61Var.f32025f) {
            i10 = w61Var.d;
        } else {
            i10 = w61Var.f32023b;
        }
        int L = (org.telegram.messenger.i0.L(2.0f) + ((org.telegram.ui.Components.w61.S / 2) + i10)) - (photoViewer.f33596s3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int measuredWidth = (photoViewer.f33508i3.getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f)) - (photoViewer.f33596s3.getMeasuredWidth() / 2);
        if (L < L2) {
            tq0 tq0Var = photoViewer.f33596s3;
            tq0Var.setPivotX(Utilities.i((tq0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f33596s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            tq0 tq0Var2 = photoViewer.f33596s3;
            tq0Var2.setPivotX(Utilities.i((tq0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f33596s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            tq0 tq0Var3 = photoViewer.f33596s3;
            tq0Var3.setPivotX(tq0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f33596s3.setTranslationX(L);
    }

    public static int Y0(org.telegram.messenger.ze zeVar) {
        if (zeVar.d()) {
            return org.telegram.messenger.i0.Z0(false);
        }
        return 512;
    }

    public static void Z(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.bi0 B;
        xr0 xr0Var = photoViewer.X4;
        ArrayList arrayList = xr0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.v20 v20Var = (org.telegram.messenger.v20) xr0Var.e.get(i10);
                if (v20Var.f18455a == 0 && (v20Var.f18456b & 1) != 0) {
                    View view = v20Var.I;
                    if ((view instanceof org.telegram.ui.Components.g9) && (B = ((org.telegram.ui.Components.g9) view).getImageReceiver().B()) != null) {
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
        org.telegram.ui.Components.bi0 B;
        xr0 xr0Var = photoViewer.X4;
        ArrayList arrayList = xr0Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.v20 v20Var = (org.telegram.messenger.v20) xr0Var.e.get(i10);
                if (v20Var.f18455a == 0 && (v20Var.f18456b & 1) != 0) {
                    View view = v20Var.I;
                    if ((view instanceof org.telegram.ui.Components.g9) && (B = ((org.telegram.ui.Components.g9) view).getImageReceiver().B()) != null) {
                        long j11 = photoViewer.f33546m8;
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

    public static String a1(int i10, int i11) {
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

    public static boolean d(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence n2(org.telegram.messenger.jj jjVar) {
        if (jjVar.f16337k == null) {
            return "";
        }
        Spannable A5 = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(new SpannableStringBuilder(jjVar.f16337k.translatedText.text), org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0), jjVar.f16337k.translatedText.entities, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.jj.M(A5)) {
            try {
                org.telegram.messenger.i0.c(A5, 5, false, true);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        org.telegram.messenger.jj.h(jjVar.P3(), A5, true, 0, 0, true);
        org.telegram.messenger.jj.b(A5, jjVar.f16337k.translatedText.entities, jjVar.P3(), true, true, true, 0);
        if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            org.telegram.messenger.jj.h(jjVar.P3(), A5, true, 3, (int) jjVar.L0(), false);
        } else if (jjVar.I3() || org.telegram.messenger.jj.R4(jjVar.f16337k)) {
            org.telegram.messenger.jj.h(jjVar.P3(), A5, true, 4, (int) jjVar.L0(), false);
        }
        return A5;
    }

    public static String s1(org.telegram.messenger.ic icVar) {
        if (icVar != null && icVar.f16109p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer v1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f33430a9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f33430a9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f33430a9 = photoViewer;
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
        org.telegram.messenger.jj jjVar;
        boolean z10;
        int i10;
        TextureView textureView;
        int i11;
        TextureView textureView2;
        float f7;
        org.telegram.messenger.jj jjVar2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (!isEmpty && ((jjVar = this.T4) == null || !jjVar.r4())) {
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = this.P4;
                if (i12 == 1) {
                    i13++;
                } else if (i12 == 2) {
                    i13--;
                }
                if (i13 >= 0 && i13 < arrayList.size()) {
                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(i13);
                    if (!org.telegram.messenger.jj.L4(jjVar3.f16337k) && !jjVar3.e5()) {
                        imageViewArr[i12].setVisibility(4);
                    } else {
                        if (jjVar3.e5() && (jjVar2 = this.T4) != null && jjVar2.f1() == jjVar3.f1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i10 = jjVar3.f16337k.media.webpage.embed_width;
                        } else if (i12 == 0 && (textureView = this.B2) != null) {
                            i10 = textureView.getMeasuredWidth();
                        } else {
                            i10 = 0;
                        }
                        if (z10) {
                            i11 = jjVar3.f16337k.media.webpage.embed_height;
                        } else if (i12 == 0 && (textureView2 = this.B2) != null) {
                            i11 = textureView2.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        TLRPC.Document F0 = jjVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i14);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i10 = documentAttribute.f19800w;
                                    i11 = documentAttribute.h;
                                    break;
                                }
                                i14++;
                            }
                        }
                        Point point = org.telegram.messenger.i0.f16026q;
                        if (point.y > point.x && i10 > i11) {
                            if (imageViewArr[i12].getVisibility() != 0) {
                                imageViewArr[i12].setVisibility(0);
                            }
                            if (this.J) {
                                imageViewArr[i12].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i12].getLayoutParams()).topMargin = ((this.f33470e0.getMeasuredHeight() + ((int) (i11 / (i10 / this.f33470e0.getMeasuredWidth())))) / 2) - org.telegram.messenger.i0.L(48.0f);
                        } else if (imageViewArr[i12].getVisibility() != 4) {
                            imageViewArr[i12].setVisibility(4);
                        }
                        if (this.f33571p6 != null) {
                            float f10 = this.X5;
                            f7 = ((this.f33458c6 - f10) * this.f33536l6) + f10;
                        } else {
                            f7 = this.X5;
                        }
                        float f11 = 0.0f;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                f11 = (f7 - this.F6) + ((-point.x) - org.telegram.messenger.i0.L(15.0f));
                            } else {
                                float f12 = this.E6;
                                if (f7 < f12) {
                                    f11 = f7 - f12;
                                }
                            }
                        }
                        imageViewArr[i12].setTranslationX((f11 + point.x) - org.telegram.messenger.i0.L(48.0f));
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

    public final void A2(org.telegram.ui.Components.z30 z30Var) {
        String str;
        int i10;
        TLRPC.User user;
        this.f33559o2 = z30Var;
        if (this.f33454c2 == 1) {
            if (H3()) {
                this.f33548n0.setVisibility(0);
                this.S0.setVisibility(8);
            } else {
                this.S0.setVisibility(0);
                this.f33548n0.setVisibility(8);
            }
            if (z30Var != null && (user = z30Var.f32888b) != null && z30Var.f32889c == 1 && this.f33559o2.d) {
                if (z30Var.e) {
                    this.C1.setSubtitle(org.telegram.messenger.cd.a0(null, null, 2131745529, user.first_name));
                } else {
                    this.C1.setSubtitle(org.telegram.messenger.cd.a0(null, null, 2131745530, user.first_name));
                }
            } else {
                this.C1.setSubtitle(null);
            }
        }
        if (z30Var != null) {
            if (z30Var.f32889c == 2) {
                if (z30Var.e) {
                    str = "SuggestVideo";
                    i10 = 2131744423;
                } else {
                    str = "SuggestPhoto";
                    i10 = 2131744434;
                }
                R2(org.telegram.messenger.cd.L0(i10, str));
            }
            if (z30Var.e) {
                this.T7.setText(org.telegram.messenger.cd.L0(2131745552, "SetCover"));
            }
            this.F.setBackground(null);
            this.F.setElevation(2.0f);
        }
    }

    public final void A3() {
        boolean z10;
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            if (!b5.d.u() && !this.f33582r) {
                z10 = false;
            } else {
                z10 = true;
            }
            u61Var.t0(z10);
        }
        if (!this.f33531k8) {
            this.f33471e1.setEnabled(false);
            this.f33471e1.setClickable(false);
            this.f33471e1.animate().alpha(0.5f).setDuration(180L).start();
            this.S7.setMode(0);
            return;
        }
        this.f33471e1.setEnabled(true);
        this.f33471e1.setClickable(true);
        this.f33471e1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f33582r) {
            if (this.f33474e4 == null) {
                this.M.a(org.telegram.messenger.cd.L0(2131745297, "SoundMuted"), true);
            }
            org.telegram.ui.Components.k00 k00Var = this.f33462d1;
            k00Var.e = true;
            k00Var.invalidateSelf();
            if (this.f33515j1.getTag() != null) {
                this.f33515j1.setAlpha(0.5f);
                this.f33515j1.setEnabled(false);
            }
            if (this.f33454c2 == 1) {
                this.S7.setMaxProgressDiff(9600.0f / this.f33513i8);
                this.S7.setMode(1);
                E3();
                return;
            }
            this.S7.setMaxProgressDiff(1.0f);
            this.S7.setMode(0);
            return;
        }
        this.M.a(this.D8, true);
        org.telegram.ui.Components.k00 k00Var2 = this.f33462d1;
        k00Var2.e = false;
        k00Var2.invalidateSelf();
        if (this.f33515j1.getTag() != null) {
            this.f33515j1.setAlpha(1.0f);
            this.f33515j1.setEnabled(true);
        }
        this.S7.setMaxProgressDiff(1.0f);
        this.S7.setMode(0);
    }

    public final void B0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B0(boolean):void");
    }

    public final int B1(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f33622v2;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void B2(boolean z10) {
        if (this.f33550n2 != z10) {
            this.f33550n2 = z10;
            this.Q1.setLayerType(2, null);
            this.Q1.getCurrentView().setLayerType(2, null);
            this.Q1.getNextView().setLayerType(2, null);
        }
    }

    public final void B3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B3(int, boolean):void");
    }

    public final void C0(final int i10, final boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        ep0 ep0Var;
        final File file;
        final ep0 ep0Var2;
        boolean z15;
        boolean z16;
        File file2;
        File K;
        File K2;
        boolean z17;
        final boolean z18;
        File file3;
        ep0 ep0Var3;
        boolean z19;
        org.telegram.ui.Components.s5 s5Var;
        int i12 = this.P4;
        if (i10 == 1) {
            i11 = i12 + 1;
        } else if (i10 == 2) {
            i11 = i12 - 1;
        } else {
            i11 = i12;
        }
        if (this.f33457c5[i10] != null) {
            if (i10 == 0 && i12 == 0 && (s5Var = this.f33516j2) != null) {
                z11 = s5Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i11 >= 0 && i11 < this.Y6.size()) {
                    ?? r42 = (org.telegram.messenger.jj) this.Y6.get(i11);
                    z12 = U2(r42);
                    if (this.C5 == 1 && !r42.x()) {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f16337k.attachPath)) {
                        file3 = new File(r42.f16337k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.jj.o1(r42.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(r42.f16337k).webpage != null && org.telegram.messenger.jj.o1(r42.f16337k).webpage.document == null) {
                        ep0Var3 = new ep0(0, this, r1(i11, null));
                    } else {
                        ep0Var3 = new ep0(1, this, r42.f16337k);
                    }
                    if (org.telegram.messenger.jj.L4(r42.f16337k)) {
                        if ((org.telegram.messenger.tz.B0 && r42.B() && !org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(r42.f16337k))) || r42.D2(true)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        ep0 ep0Var4 = ep0Var3;
                        z13 = z19;
                        ep0Var = r42;
                        file = null;
                        file4 = file3;
                        ep0Var2 = ep0Var4;
                        z14 = true;
                    } else {
                        z14 = false;
                        ep0Var = r42;
                        file = null;
                        file4 = file3;
                        ep0Var2 = ep0Var3;
                        z13 = false;
                    }
                } else {
                    this.W0[i10].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i11 >= 0 && i11 < this.f33494g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f33494g7.get(i11);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.jj.K4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.b8.z(3), this.f33457c5[i10]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.b8.z(0), this.f33457c5[i10]);
                            } else {
                                z17 = false;
                                file2 = null;
                            }
                            z17 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                org.telegram.messenger.b8.G(this.T);
                                file2 = org.telegram.messenger.b8.I(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(org.telegram.messenger.b8.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.hc.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(org.telegram.messenger.b8.z(4), this.f33457c5[i10]);
                    } else {
                        this.W0[i10].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i11 >= 0 && i11 < this.f33449b7.size()) {
                            org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.f33449b7.get(i11);
                            if (icVar != null) {
                                org.telegram.messenger.b8.G(this.T);
                                K = org.telegram.messenger.b8.K(icVar.f16100f, s1(icVar), false, true);
                                org.telegram.messenger.b8.G(this.T);
                                K2 = org.telegram.messenger.b8.K(icVar.f16100f, s1(icVar), true, true);
                            } else {
                                K2 = null;
                                K = null;
                            }
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f33447b5 != null) {
                        if (i11 >= 0 && i11 < this.e7.size()) {
                            org.telegram.messenger.pw pwVar = (org.telegram.messenger.pw) this.e7.get(i11);
                            org.telegram.messenger.b8.G(this.T);
                            K = org.telegram.messenger.b8.K(pwVar, null, true, true);
                            org.telegram.messenger.b8.G(this.T);
                            K2 = org.telegram.messenger.b8.K(pwVar, null, false, true);
                        } else {
                            this.W0[i10].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f33475e5 != null) {
                        file2 = new File(org.telegram.messenger.b8.z(3), this.f33457c5[i10]);
                        file = new File(org.telegram.messenger.b8.z(4), this.f33457c5[i10]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        bs0 bs0Var = this.f33521j7;
                        if (bs0Var != null) {
                            File b10 = bs0Var.b(i11);
                            if (!this.f33521j7.a(i11) && !this.f33521j7.e(i11)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && org.telegram.messenger.tz.B0 && (this.f33521j7.d(i11) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            ep0Var2 = null;
                            z12 = T2(i11);
                            file4 = b10;
                            ep0Var = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            ep0Var = null;
                            file = null;
                            ep0Var2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    ep0Var2 = null;
                    file4 = K;
                    file = K2;
                    ep0Var = ep0Var2;
                }
                ep0Var2 = null;
                file4 = file2;
                ep0Var = ep0Var2;
            }
            if ((i10 != 0 || !this.f33535l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = ep0Var;
            final boolean z20 = z11;
            Utilities.e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.jj jjVar;
                    un unVar;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    ep0 ep0Var5 = ep0Var2;
                    File file8 = null;
                    if (file7 == null && ep0Var5 != null) {
                        file7 = ep0Var5.d();
                    } else if (ep0Var5 != null) {
                        file8 = ep0Var5.d();
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
                    if (!z22 && i13 != 0 && (jjVar = r72) != null && z23 && org.telegram.messenger.b6.q(photoViewer.T).b(jjVar.f16337k) != 0 && (((unVar = photoViewer.l4) == null || unVar.h == null) && !org.telegram.messenger.jj.Q5(jjVar.f16337k) && (F0 = jjVar.F0()) != null)) {
                        org.telegram.messenger.b8.G(photoViewer.T).X(F0, jjVar, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f33457c5;
                            fq0[] fq0VarArr = photoViewer2.W0;
                            int i14 = i13;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!org.telegram.messenger.b8.G(photoViewer2.T).T(strArr[i14])) {
                                        fq0VarArr[i14].d(2, false, true);
                                    } else {
                                        fq0VarArr[i14].d(1, false, true);
                                    }
                                } else {
                                    fq0VarArr[i14].d(0, z29, true);
                                }
                                Float w9 = org.telegram.messenger.hc.D().w(strArr[i14]);
                                if (w9 == null) {
                                    w9 = Float.valueOf(0.0f);
                                }
                                fq0VarArr[i14].f(false, w9.floatValue());
                            } else {
                                if (i14 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i14 == 0 && photoViewer2.X2))) {
                                        fq0VarArr[i14].d(3, z29, true);
                                    } else {
                                        fq0VarArr[i14].d(-1, z29, true);
                                    }
                                }
                                if (i14 == 0 && !photoViewer2.f33557o0.x()) {
                                    if (!z27) {
                                        if (!org.telegram.messenger.b8.G(photoViewer2.T).T(strArr[i14])) {
                                            photoViewer2.f33557o0.t(8);
                                        } else {
                                            photoViewer2.f33557o0.S(8);
                                        }
                                    } else {
                                        photoViewer2.f33557o0.t(8);
                                    }
                                }
                            }
                            if (i14 == 0) {
                                if (photoViewer2.f33606t4 || (photoViewer2.f33494g7.isEmpty() && (strArr[0] == null || fq0VarArr[0].h == 0))) {
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
        if (!this.f33494g7.isEmpty() && i11 >= 0 && i11 < this.f33494g7.size()) {
            Object obj = this.f33494g7.get(i11);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.f19507b && (!efVar.d() || (!efVar.i() && this.f33454c2 != 11))) {
                    this.W0[i10].d(3, z10, true);
                    return;
                }
            }
        }
        this.W0[i10].d(-1, z10, true);
    }

    public final long C1() {
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null && mr0Var.f31243y) {
            return mr0Var.getVideoDuration();
        }
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.U();
    }

    public final void C2() {
        org.telegram.ui.Components.k61 k61Var;
        org.telegram.ui.Components.k61 k61Var2;
        if (!this.f33489g2 && this.f33454c2 == 1) {
            if (!this.f33584r1 || ((k61Var2 = (org.telegram.ui.Components.k61) this.B2) != null && k61Var2.getVideoWidth() > 0 && k61Var2.getVideoHeight() > 0)) {
                this.f33489g2 = true;
                Bitmap n10 = this.C4.n();
                int i10 = this.C4.U;
                if (n10 == null) {
                    n10 = this.f33496h0.getBitmap();
                    i10 = this.f33496h0.getOrientation();
                }
                Bitmap bitmap = n10;
                int i11 = i10;
                if (bitmap != null || this.B2 != null) {
                    org.telegram.ui.Components.be0 be0Var = this.C1;
                    if (this.f33584r1) {
                        k61Var = (org.telegram.ui.Components.k61) this.B2;
                    } else {
                        k61Var = null;
                    }
                    be0Var.b(bitmap, i11, false, false, this.D1, k61Var, this.X4.f43638c);
                }
            }
        }
    }

    public final void C3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C3():void");
    }

    public final void D0(int i10) {
        org.telegram.ui.Components.r61 r61Var;
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null && u61Var.d != null && i10 != u61Var.f30839d0) {
            u61Var.f30839d0 = i10;
            ArrayList arrayList = u61Var.N;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                r61Var = (org.telegram.ui.Components.r61) u61Var.N.get(i10);
            } else {
                r61Var = null;
            }
            u61Var.w0(false, r61Var);
        }
        if (i10 == -1) {
            org.telegram.ui.Components.u61.o0(null, this.T4);
        } else {
            org.telegram.ui.Components.u61 u61Var2 = this.F2;
            if (u61Var2 != null) {
                org.telegram.ui.Components.u61.o0(u61Var2.Z(i10), this.T4);
            }
        }
        C3();
        this.f33566p0.U(null, null);
        try {
            b5.d.b(0);
            if (hf.b.e0().h0()) {
                hf.b.e0().l0(o1());
            }
            org.telegram.ui.Components.u61 u61Var3 = this.F2;
            if (u61Var3 != null) {
                b5.d.x(u61Var3.d0());
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final int D1() {
        int measuredHeight;
        int k12 = k1();
        as0 as0Var = this.f33470e0;
        if (as0Var != null && (measuredHeight = as0Var.getMeasuredHeight()) > 0) {
            return Math.min(k12, measuredHeight);
        }
        return k12;
    }

    public final void D2(org.telegram.messenger.jj jjVar, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i11;
        boolean z18;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.o5.cloneSpans(charSequence, 3);
        Z2(this.R4, z11);
        if (!this.R4 && this.f33454c2 != 1) {
            this.U1.setVisibility(8);
            this.V1.setVisibility(8);
            if (this.f33507i2) {
                if (this.Q1.getParent() != this.P0) {
                    FrameLayout frameLayout = this.Z1;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.Q1);
                    }
                    this.Q1.setMeasureAllChildren(false);
                    this.P0.addView(this.Q1, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.T1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f33470e0.getContext());
                    this.Z1 = frameLayout2;
                    this.Q1.setContainer(frameLayout2);
                    fr0 fr0Var = new fr0(this, this.f33470e0.getContext(), this.Q1, this.Z1, 0);
                    this.T1 = fr0Var;
                    this.Q1.setScrollView(fr0Var);
                    this.Z1.setClipChildren(false);
                    this.T1.addView(this.Z1, new ViewGroup.LayoutParams(-1, -2));
                    this.f33470e0.addView(this.T1, w7.b6.e(-1, -1, 80));
                }
                if (this.Q1.getParent() != this.Z1) {
                    this.P0.removeView(this.Q1);
                    this.Q1.setMeasureAllChildren(true);
                    this.Z1.addView(this.Q1, -1, -2);
                    this.f33596s3.bringToFront();
                }
                if (jjVar != null && jjVar.r4()) {
                    if (this.R1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.E);
                        this.R1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.t6.b0(620756991, 369098751, 8, 8));
                        w7.e6.b(this.R1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.E);
                        this.S1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.S1.setTextColor(-1);
                        this.S1.setTypeface(org.telegram.messenger.i0.o());
                        this.R1.addView(this.S1, w7.b6.e(-2, -2, 17));
                        this.R1.setOnClickListener(new cp0(this, 7));
                    }
                    org.telegram.messenger.i0.E2(this.R1);
                    this.S1.setText(jjVar.W0);
                    this.Z1.addView(this.R1, w7.b6.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                    this.Q1.setPadding(0, 0, 0, org.telegram.messenger.i0.L(64.0f));
                    this.R1.bringToFront();
                } else {
                    FrameLayout frameLayout4 = this.R1;
                    if (frameLayout4 != null) {
                        org.telegram.messenger.i0.E2(frameLayout4);
                        this.Q1.setPadding(0, 0, 0, 0);
                    }
                }
            }
            boolean isEmpty = TextUtils.isEmpty(cloneSpans);
            boolean isEmpty2 = TextUtils.isEmpty(this.Q1.getCurrentView().getText());
            wr0 wr0Var = this.Q1;
            if (z11) {
                currentView = wr0Var.getNextView();
            } else {
                currentView = wr0Var.getCurrentView();
            }
            if (this.f33584r1) {
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
                if (this.f33507i2) {
                    Point point = org.telegram.messenger.i0.f16026q;
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
            boolean z19 = this.f33507i2;
            if (!z19 && z11 && isEmpty) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f33540m2 = z12;
            if (!z19) {
                this.T1.f41929l0 = false;
            }
            if (z11) {
                if (z19) {
                    viewGroup = this.P0;
                } else {
                    viewGroup = this.T1;
                }
                TransitionManager.endTransitions(viewGroup);
                if (this.f33507i2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.P0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new gr0(this, isEmpty2, isEmpty, 1)).addTransition(new gr0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.T1.f41929l0 = true;
                        duration.addTransition(new org.telegram.ui.Components.rl0(this, 2));
                    }
                    if (isEmpty2 && !isEmpty) {
                        duration.addTarget((View) this.Q1);
                    }
                    TransitionManager.beginDelayedTransition(this.T1, duration);
                }
                z13 = true;
            } else {
                this.Q1.getCurrentView().setText((CharSequence) null);
                fr0 fr0Var2 = this.T1;
                if (fr0Var2 != null) {
                    fr0Var2.scrollTo(0, 0);
                }
                z13 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.t6.K(null, true);
                if (jjVar == null || !this.f33553n5 || (message = jjVar.f16337k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.m31.M0())) {
                    if (jjVar != null && !jjVar.f16337k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        jjVar.c(spannableString, true, false);
                        if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                            org.telegram.messenger.jj.h(jjVar.P3(), spannableString, false, 3, (int) jjVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.k6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.k6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (jjVar != null && jjVar.r4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(jjVar.Q0)) {
                        spannableStringBuilder.append((CharSequence) jjVar.Q0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new or0(0), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.Q1.setTag(cloneSpans);
                try {
                    wr0 wr0Var2 = this.Q1;
                    if (this.f33568p2 != z10) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    wr0Var2.a(cloneSpans, z11, z18);
                    fr0 fr0Var3 = this.T1;
                    if (fr0Var3 != null) {
                        fr0Var3.H(fr0Var3.getWidth(), fr0Var3.getHeight());
                    }
                    z14 = true;
                } catch (Exception e) {
                    z14 = true;
                    org.telegram.messenger.f8.g(e, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.J && (!this.f33584r1 || this.P0.getVisibility() == 0 || this.f33521j7 != null)) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                wr0 wr0Var3 = this.Q1;
                if (z17) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                wr0Var3.setVisibility(i11);
            } else {
                z14 = true;
                if (this.f33507i2) {
                    this.Q1.a(org.telegram.messenger.cd.L0(2131754454, "AddCaption"), z11, false);
                    this.Q1.getCurrentView().setTextColor(-1291845633);
                    this.Q1.setTag("empty");
                    this.Q1.setVisibility(0);
                } else {
                    this.Q1.a(null, z11, false);
                    this.Q1.getCurrentView().setTextColor(-1);
                    wr0 wr0Var4 = this.Q1;
                    if (z13 && !isEmpty2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    wr0Var4.b(4, z15);
                    this.Q1.setTag(null);
                }
            }
            if (this.Q1.getCurrentView() instanceof vr0) {
                ((vr0) this.Q1.getCurrentView()).setLoading(z10);
            }
            if (!isEmpty && z10) {
                z16 = z14;
            } else {
                z16 = false;
            }
            this.f33568p2 = z16;
            return;
        }
        h1().setText(cloneSpans);
        this.Q1.setVisibility(8);
    }

    public final void D3() {
        long j10;
        int H;
        org.telegram.messenger.jj jjVar;
        es0 es0Var = this.d;
        if (es0Var != null) {
            int H2 = es0Var.H();
            this.O0.a(H2);
            if (H2 == 0) {
                s3(false, true);
            }
            if (this.S0 != null) {
                es0 es0Var2 = this.d;
                long j11 = 0;
                if (es0Var2 != null) {
                    j10 = es0Var2.a();
                } else {
                    j10 = 0;
                }
                if (j10 == 0 && (jjVar = this.T4) != null) {
                    j10 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                }
                bi.f2 f2Var = this.S0;
                es0 es0Var3 = this.d;
                if (es0Var3 == null || !es0Var3.q() || this.d.w()) {
                    j11 = org.telegram.messenger.vp.r1(this.T).M1(j10);
                }
                es0 es0Var4 = this.d;
                if (es0Var4 == null) {
                    H = 1;
                } else {
                    H = es0Var4.H();
                }
                f2Var.i(Math.max(1, H), j11, true);
            }
        }
    }

    public final void E0(boolean z10, boolean z11, float f7) {
        if (f7 != this.f33603t1) {
            this.f33603t1 = f7;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f33603t1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.jj.B0(this.T4.f16337k) + "_" + this.T4.f1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.jj.B0(this.T4.f16337k) + "_" + this.T4.f1(), this.f33603t1).commit();
                }
            }
            org.telegram.ui.Components.u61 u61Var = this.F2;
            if (u61Var != null) {
                u61Var.v0(this.f33603t1);
            }
            mr0 mr0Var = this.f33479f0;
            if (mr0Var != null) {
                mr0Var.setPlaybackSpeed(this.f33603t1);
            }
        }
        M2(true, z10);
        if (z11) {
            this.f33566p0.U(null, null);
        }
    }

    public final boolean E1() {
        if (f1(true) != 0) {
            return true;
        }
        return false;
    }

    public final void E2(int i10) {
        F2(i10, true, false, false);
    }

    public final void E3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.E3():void");
    }

    public final void F0(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0 && i10 < this.f33494g7.size() && K1()) {
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
        String a12;
        String a13;
        int[] iArr = this.f33541m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f33551n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            long max = Math.max(0L, u61Var.S());
            long max2 = Math.max(0L, this.F2.U());
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
            mr0 mr0Var = this.f33479f0;
            if (mr0Var != null && mr0Var.f31243y) {
                long max3 = Math.max(0, mr0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f33479f0.getVideoDuration());
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
            a12 = b1(i10 / 60, i10 % 60, iArr[1]);
        } else {
            a12 = a1(i10, iArr[1]);
        }
        int i11 = iArr2[0];
        if (i11 >= 60) {
            a13 = b1(i11 / 60, i11 % 60, iArr2[1]);
        } else {
            a13 = a1(i11, iArr2[1]);
        }
        this.f33560o3.l(a12 + " / " + a13, false);
        if (!Objects.equals(this.f33517j3, a13)) {
            this.f33517j3 = a13;
            this.f33508i3.requestLayout();
        }
    }

    public final void G0() {
        er0 er0Var = this.L1;
        Activity activity = this.D;
        qo0 qo0Var = new qo0(this, 1);
        if (er0Var.f10193u1) {
            er0Var.v0(false);
        } else if (er0Var.P1) {
            er0Var.k0(true);
        } else if (er0Var.C0 && er0Var.B0 != null) {
            er0Var.q0(null, true);
        } else if (er0Var.f10180o0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, er0Var.f10203z1);
            String L0 = org.telegram.messenger.cd.L0(2131747294, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.T = L0;
            x1Var.R = org.telegram.messenger.cd.L0(2131751406, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new ig.c0(qo0Var, 10));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            V2(alertDialog$Builder);
        } else {
            qo0Var.run();
        }
    }

    public final void G1() {
        boolean[] zArr = this.f33631w1;
        zArr[1] = false;
        zArr[0] = false;
        this.f33470e0.invalidate();
    }

    public final void G2() {
        if (this.f33552n4 == 0) {
            H2(this.C4, this.P4, null);
            I2(this.P4, this.f33653y4);
            H2(this.D4, this.P4 + 1, this.F1);
            I2(this.P4 + 1, this.A4);
            H2(this.B4, this.P4 - 1, this.E1);
            I2(this.P4 - 1, this.f33662z4);
        }
    }

    public final void G3() {
        int v;
        if (this.Z7 > 0) {
            if (this.Y7 >= this.Z7) {
                this.Y7 = this.Z7 - 1;
            }
            if (this.f33454c2 == 1) {
                float max = Math.max(800.0f / this.f33460c8, 800.0f / this.f33469d8);
                this.f33477e8 = Math.round((this.f33460c8 * max) / 2.0f) * 2;
                this.f33486f8 = Math.round((this.f33469d8 * max) / 2.0f) * 2;
            } else {
                Size q02 = q0();
                this.f33477e8 = q02.getWidth();
                this.f33486f8 = q02.getHeight();
            }
            if (this.f33495g8 != 0) {
                if (this.f33454c2 == 1) {
                    this.f33495g8 = 1560000;
                    v = this.f33495g8;
                } else if (this.f33477e8 == this.f33460c8 && this.f33486f8 == this.f33469d8) {
                    this.f33495g8 = this.f33504h8;
                    v = MediaController.v(this.f33477e8, this.f33486f8, this.f33495g8, false);
                } else {
                    this.f33495g8 = MediaController.Q(this.f33469d8, this.f33460c8, this.f33504h8, this.f33486f8, this.f33477e8);
                    v = MediaController.v(this.f33477e8, this.f33486f8, this.f33495g8, false);
                }
                this.f33591r8 = ((v / 8) * this.f33513i8) / 1000.0f;
            }
        }
    }

    public final void H0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H0(boolean, boolean):void");
    }

    public final void H1() {
        org.telegram.ui.Components.be0 be0Var = this.C1;
        if (be0Var != null) {
            be0Var.b(null, 0, false, false, null, null, null);
            if (this.f33454c2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.C1.f24615b.f6583a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.C1.setVisibility(0);
            this.C1.setAlpha(1.0f);
            eg.q qVar = this.C1.f24615b;
            qVar.q();
            CropAreaView cropAreaView2 = qVar.f6583a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f33604t2 = true;
        }
    }

    public final void H2(org.telegram.messenger.ImageReceiver r23, int r24, eg.g r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.H2(org.telegram.messenger.ImageReceiver, int, eg.g):void");
    }

    public final boolean H3() {
        org.telegram.ui.Components.z30 z30Var = this.f33559o2;
        if (z30Var != null && z30Var.d && !z30Var.e) {
            return true;
        }
        return false;
    }

    public final void I0() {
        if (this.C1 != null) {
            return;
        }
        org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0(this.E, this.f33622v2);
        this.C1 = be0Var;
        be0Var.setVisibility(8);
        this.C1.a();
        this.f33470e0.addView(this.C1, this.f33470e0.indexOfChild(this.R7) - 1, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.C1.setDelegate(new bq0(this));
    }

    public final void I1() {
        jg.v2 v2Var = this.p5;
        if (v2Var == null || !v2Var.V) {
            je.b bVar = this.Z;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    vg.d dVar = ((vg.f) it.next()).f50842b0;
                    if (dVar != null) {
                        dVar.h = true;
                    }
                }
            }
            je.b bVar2 = this.f33433a0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            jq0 jq0Var = this.U1;
            if (jq0Var != null) {
                jq0Var.m();
            }
            kq0 kq0Var = this.V1;
            if (kq0Var != null) {
                kq0Var.m();
            }
            sr0 sr0Var = this.f33607t5;
            if (sr0Var != null) {
                sr0Var.invalidate();
            }
            sr0 sr0Var2 = this.f33625v5;
            if (sr0Var2 != null) {
                sr0Var2.invalidate();
            }
            sr0 sr0Var3 = this.f33635w5;
            if (sr0Var3 != null) {
                sr0Var3.invalidate();
            }
            sr0 sr0Var4 = this.f33645x5;
            if (sr0Var4 != null) {
                sr0Var4.invalidate();
            }
            sr0 sr0Var5 = this.f33654y5;
            if (sr0Var5 != null) {
                sr0Var5.invalidate();
            }
            gq0 gq0Var = this.S7;
            if (gq0Var != null && gq0Var.f25999e0) {
                gq0Var.invalidate();
            }
            as0 as0Var = this.f33470e0;
            if (as0Var != null) {
                as0Var.invalidate();
            }
        }
    }

    public final void I2(int i10, org.telegram.ui.Components.lc0 lc0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (lc0Var != null) {
            lc0Var.a();
            lc0Var.setVisibility(8);
            ArrayList arrayList2 = this.f33494g7;
            if (!arrayList2.isEmpty() && i10 >= 0 && i10 < arrayList2.size()) {
                Object obj = arrayList2.get(i10);
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    z10 = efVar.f19507b;
                    str = efVar.f19512j;
                    arrayList = efVar.f19518p;
                } else {
                    if (obj instanceof org.telegram.messenger.hf) {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        str = hfVar.f19512j;
                        arrayList = hfVar.f19518p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                lc0Var.setVisibility(0);
                if (this.f33454c2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lc0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    lc0Var.f28088a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(lc0Var.f28088a);
                    lc0Var.d = bitmapDrawable;
                    lc0Var.setBackground(bitmapDrawable);
                    return;
                }
                lc0Var.f28088a = null;
                lc0Var.d = null;
                lc0Var.setBackground(null);
            }
        }
    }

    public final boolean J1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.E.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return false;
        }
    }

    public final void J2(int r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.J2(int, boolean, boolean, boolean):void");
    }

    public final void K0() {
        org.telegram.messenger.ye yeVar;
        int width;
        int width2;
        if (this.N1 != null) {
            return;
        }
        if (this.f33454c2 == 1) {
            yeVar = new org.telegram.messenger.ye();
            yeVar.f19370k = this.D1.f6546i;
        } else {
            yeVar = this.X4.f43638c;
        }
        org.telegram.messenger.ye yeVar2 = yeVar;
        int q6 = this.C4.q();
        int o10 = this.C4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q6, o10, config);
        jg.v2 v2Var = this.p5;
        if (v2Var != null && v2Var.getSourceBitmap() != null) {
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
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f7, ((-sourceBitmap.getHeight()) / 2.0f) * f7, (sourceBitmap.getWidth() / 2.0f) * f7, (sourceBitmap.getHeight() / 2.0f) * f7);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.C4.q(), this.C4.o(), config);
        if (this.C4.n() != null) {
            Bitmap n10 = this.C4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.C4.U);
            float width4 = createBitmap2.getWidth();
            if ((this.C4.U / 90) % 2 != 0) {
                width = n10.getHeight();
            } else {
                width = n10.getWidth();
            }
            float f10 = width4 / width;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(((-n10.getWidth()) / 2.0f) * f10, ((-n10.getHeight()) / 2.0f) * f10, (n10.getWidth() / 2.0f) * f10, (n10.getHeight() / 2.0f) * f10);
            canvas2.drawBitmap(n10, (Rect) null, rectF2, new Paint(3));
        }
        dr0 dr0Var = new dr0(this, this.D, this.T, createBitmap2, createBitmap, this.C4.U, yeVar2);
        this.N1 = dr0Var;
        dr0Var.f9883s.setOnClickListener(new ro0(this, 5));
        this.N1.f9884w.setOnClickListener(new ro0(this, 6));
        this.N1.setEraser(this.M1);
        int indexOfChild = this.f33470e0.indexOfChild(this.f33616u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f33470e0.getChildCount();
        }
        this.f33470e0.addView(this.N1, indexOfChild, w7.b6.c(-1.0f, -1));
        this.O1 = false;
    }

    public final boolean K1() {
        org.telegram.ui.Components.nc h12 = h1();
        if (h12 != null) {
            if (h12.L.c() || h12.f51340f.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K2(float f7, View view, boolean z10, boolean z11) {
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
            view.animate().alpha(f11).setDuration(100L).setUpdateListener(new po0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new bk0(this, z10, view, 3)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        view.setAlpha(f11);
        v3();
    }

    public final void L0() {
        int q6;
        int o10;
        org.telegram.messenger.ye yeVar;
        Bitmap n10;
        if (this.L1 == null) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) textureView;
                q6 = k61Var.getVideoWidth();
                o10 = k61Var.getVideoHeight();
                while (true) {
                    if (q6 <= 1280 && o10 <= 1280) {
                        break;
                    }
                    q6 /= 2;
                    o10 /= 2;
                }
            } else {
                q6 = this.C4.q();
                o10 = this.C4.o();
            }
            Bitmap bitmap = this.f33653y4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q6, o10, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i10 = this.f33454c2;
            xr0 xr0Var = this.X4;
            boolean z10 = true;
            if (i10 == 1) {
                yeVar = new org.telegram.messenger.ye();
                yeVar.f19370k = this.D1.f6546i;
            } else {
                yeVar = xr0Var.f43638c;
            }
            org.telegram.messenger.ye yeVar2 = yeVar;
            vh.r2 r2Var = new vh.r2(this.f33487g0, false, new wo0(this, 2));
            r2Var.f51842f = true;
            r2Var.f51843g = true;
            this.K1 = r2Var;
            if (this.f33615u4 == 3) {
                z10 = false;
            }
            r2Var.b(z10);
            Activity activity = this.D;
            int i11 = this.T;
            if (this.f33584r1) {
                n10 = null;
            } else {
                n10 = this.C4.n();
            }
            er0 er0Var = new er0(this, activity, activity, i11, bitmap2, n10, this.C4.U, xr0Var.e, yeVar2, new qo0(this, 14), this.f33622v2);
            this.L1 = er0Var;
            vg.f c10 = this.Y.c(er0Var.L0, null, false);
            c10.o(w7.b9.i(this.f33622v2));
            er0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f33470e0.addView(this.L1.getView(), w7.b6.c(-1.0f, -1));
            this.L1.setOnDoneButtonClickedListener(new qo0(this, 15));
            this.L1.getCancelView().setOnClickListener(new ro0(this, 8));
            this.L1.s0(org.telegram.messenger.i0.L(126.0f));
            this.L1.setOffsetTranslationX(-org.telegram.messenger.i0.L(12.0f));
        }
    }

    public final boolean L1() {
        int i10;
        if (this.f33503h7 != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i10 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.f33439a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i11).location;
                        if (fileLocation != null) {
                            int i12 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.f33503h7.f16100f;
                            if (i12 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (icVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar.f16100f;
                    int i13 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.f33503h7.f16100f;
                    if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
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
        ms0 ms0Var = new ms0(this.f33470e0.getContext(), this);
        this.f33508i3 = ms0Var;
        this.f33470e0.addView(ms0Var, w7.b6.e(-1, 48, 83));
        bq0 bq0Var = new bq0(this);
        sq0 sq0Var = new sq0(this, bq0Var);
        do0 do0Var = new do0(this, this.f33470e0.getContext(), 1);
        this.f33586r3 = do0Var;
        do0Var.setAccessibilityDelegate(sq0Var);
        this.f33586r3.setImportantForAccessibility(1);
        this.f33508i3.addView(this.f33586r3, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(this.f33586r3);
        this.f33577q3 = w61Var;
        w61Var.f32043z = org.telegram.messenger.i0.L(2.0f);
        org.telegram.ui.Components.w61 w61Var2 = this.f33577q3;
        w61Var2.f32029k = 872415231;
        w61Var2.f32030l = 872415231;
        w61Var2.f32031m = -1;
        w61Var2.f32032n = -1;
        w61Var2.A = 1509949439;
        w61Var2.f32028j = bq0Var;
        tq0 tq0Var = new tq0(this, this.f33470e0.getContext(), new yo0(this));
        this.f33596s3 = tq0Var;
        tq0Var.setAlpha(0.0f);
        this.f33470e0.addView(this.f33596s3, w7.b6.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(this.f33470e0.getContext());
        this.f33560o3 = u5Var;
        u5Var.setTextColor(-1);
        this.f33560o3.setGravity(53);
        this.f33560o3.setTextSize(14);
        this.f33560o3.setImportantForAccessibility(2);
        this.f33508i3.addView(this.f33560o3, w7.b6.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f33470e0.getContext());
        this.f33569p3 = imageView;
        imageView.setImageResource(2131232251);
        this.f33569p3.setContentDescription(org.telegram.messenger.cd.L0(2131754724, "AccExitFullscreen"));
        this.f33569p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f33569p3.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        this.f33569p3.setVisibility(4);
        this.f33508i3.addView(this.f33569p3, w7.b6.e(48, 48, 53));
        this.f33569p3.setOnClickListener(new cp0(this, 6));
    }

    public final boolean M1(bs0 bs0Var) {
        if (bs0Var != null) {
            Object g10 = bs0Var.g();
            if (g10 instanceof org.telegram.messenger.jj) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) g10;
                if (jjVar.f16337k != null) {
                    if (org.telegram.messenger.vp.r1(this.T).z2(org.telegram.messenger.jj.B0(jjVar.f16337k)) || jjVar.f16337k.noforwards || jjVar.y2()) {
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
        if (this.f33583r0.getVisibility() != 0) {
            this.f33630w0.f42795f.t("", z10, true);
        } else if (Math.abs(this.f33603t1 - 1.0f) < 0.001f) {
            this.f33630w0.f42795f.t("", z10, true);
        } else {
            org.telegram.ui.Components.e6 e6Var = this.f33630w0.f42795f;
            e6Var.t(jh.g.a(this.f33603t1) + "x", z10, true);
        }
        this.f33583r0.e(z10, this.f33603t1);
        u71 u71Var = this.I0;
        float f7 = this.f33603t1;
        org.telegram.ui.ActionBar.b1[] b1VarArr = (org.telegram.ui.ActionBar.b1[]) u71Var.f42064b;
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            if (z11 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                b1VarArr[i10].d(-9718023, -9718023);
            } else {
                b1VarArr[i10].d(-328966, -328966);
            }
        }
    }

    public final void N0(org.telegram.messenger.ff ffVar) {
        org.telegram.ui.Components.x9 x9Var;
        if (this.B2 == null) {
            org.telegram.ui.Components.af0 af0Var = new org.telegram.ui.Components.af0(this, this.D, 2);
            this.f33652y2 = af0Var;
            af0Var.setWillNotDraw(false);
            this.f33652y2.setVisibility(4);
            this.f33470e0.addView(this.f33652y2, 0, w7.b6.e(-1, -1, 17));
            this.D2 = false;
            if (this.f33494g7.isEmpty()) {
                if (this.f33441b && this.T2 == null) {
                    this.C2 = new SurfaceView(this.D);
                    this.D2 = true;
                } else {
                    this.B2 = new TextureView(this.D);
                }
            } else {
                org.telegram.ui.Components.k61 k61Var = new org.telegram.ui.Components.k61(this.D, this.F2);
                this.f33442b0.e();
                org.telegram.ui.Components.s9 s9Var = this.f33442b0;
                k61Var.f27652s = s9Var;
                org.telegram.ui.Components.gz gzVar = k61Var.f27647b;
                if (gzVar != null && (x9Var = gzVar.I) != null) {
                    org.telegram.ui.Components.s9 s9Var2 = x9Var.f32445t;
                    if (s9Var2 != null && s9Var2.f30202m != null) {
                        s9Var2.f30202m = null;
                    }
                    x9Var.f32445t = s9Var;
                    if (s9Var != null && s9Var.f30202m != x9Var) {
                        s9Var.f30202m = x9Var;
                        s9Var.d();
                    }
                }
                if (ffVar != null) {
                    k61Var.setDelegate(new tj0(ffVar, 2));
                }
                this.B2 = k61Var;
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
                this.f33652y2.addView(this.B2, w7.b6.e(-1, -1, 17));
            } else {
                this.f33652y2.addView(this.C2, w7.b6.e(-1, -1, 17));
            }
            zr0 zr0Var = new zr0(this.D, this);
            this.E2 = zr0Var;
            zr0Var.setPivotX(0.0f);
            this.E2.setPivotY(0.0f);
            this.E2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f33652y2.addView(this.E2, w7.b6.e(-1, -1, 17));
            View view = new View(this.D);
            this.P8 = view;
            this.f33652y2.addView(view, w7.b6.c(-1.0f, -1));
            if (this.f33454c2 == 1) {
                View view2 = new View(this.D);
                this.f33660z2 = view2;
                view2.setBackgroundColor(-1);
                this.f33660z2.setAlpha(0.0f);
                this.f33652y2.addView(this.f33660z2, w7.b6.e(-1, -1, 17));
            }
            jf.f fVar = this.G2;
            if (fVar != null) {
                org.telegram.ui.Components.af0 af0Var2 = this.f33652y2;
                fVar.f9867i.v(af0Var2);
                fVar.f9868j = af0Var2;
                if (af0Var2 != null) {
                    fVar.e(af0Var2);
                }
                this.G2.f9869k = this.P8;
            }
        }
    }

    public final void N2(Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z10;
        as0 as0Var;
        aa0 aa0Var = this.f33545m7;
        if (aa0Var != null) {
            aa0Var.b();
            this.f33545m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        this.f33545m7 = launchActivity != null ? new aa0(launchActivity, true) : null;
        Activity parentActivity = activity != null ? activity : k2Var.getParentActivity();
        org.telegram.ui.ActionBar.t6.K(parentActivity, false);
        this.f33622v2 = p6Var;
        this.f33542m4 = k2Var;
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.T = i10;
        this.C4.d = i10;
        this.B4.d = i10;
        this.D4.d = i10;
        jq0 jq0Var = this.U1;
        if (jq0Var != null) {
            jq0Var.setAccount(i10);
            this.U1.f51340f.k(false);
        }
        kq0 kq0Var = this.V1;
        if (kq0Var != null) {
            kq0Var.setAccount(this.T);
            this.V1.f51340f.k(false);
        }
        jg.v2 v2Var = this.p5;
        if (v2Var != null) {
            v2Var.setCurrentAccount(this.T);
        }
        if (this.D != parentActivity && parentActivity != null) {
            this.f33592s = parentActivity instanceof BubbleActivity;
            this.D = parentActivity;
            this.E = new ContextThemeWrapper(this.D, 2131755318);
            this.f33651y1 = ViewConfiguration.get(this.D).getScaledTouchSlop();
            if (U8 == null) {
                U8 = new Drawable[]{f0.c.c(this.D, 2131231006), f0.c.c(this.D, 2131230931), f0.c.c(this.D, 2131231636)};
            }
            this.V6 = new Scroller(parentActivity);
            fs0 fs0Var = new fs0(this, parentActivity);
            this.f33487g0 = fs0Var;
            fs0Var.setBackground(this.L0);
            this.f33487g0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f33496h0 = clippingImageView;
            clippingImageView.N = this.f33527k4;
            clippingImageView.K = false;
            clippingImageView.M = false;
            this.f33487g0.addView(clippingImageView, w7.b6.c(40.0f, 40));
            as0 as0Var2 = new as0(this, parentActivity, parentActivity);
            this.f33470e0 = as0Var2;
            as0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f33446b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f33470e0);
            }
            this.f33470e0.setClipChildren(true);
            this.f33470e0.setClipToPadding(true);
            this.f33487g0.setClipChildren(false);
            this.f33487g0.setClipToPadding(false);
            org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(this.f33470e0);
            this.f33442b0 = s9Var;
            s9Var.f30193a = 1;
            this.X = new qp0(this);
            this.f33433a0 = new je.b();
            this.Z = new je.b();
            tg.b bVar = new tg.b(this.X);
            this.Y = bVar;
            bVar.g(new zg.h(this.f33470e0), this.f33470e0);
            this.Y.f(this.f33433a0);
            this.f33452c0 = new org.telegram.ui.Components.w9(this.f33442b0, this.f33470e0);
            this.f33487g0.addView(this.f33470e0, w7.b6.e(-1, -1, 51));
            r0.h0.l(this.f33470e0, new yo0(this));
            this.f33470e0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33461d0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.i0.m(layoutParams);
            this.f33461d0.flags = -2147286784;
            org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(this.D);
            this.f33653y4 = lc0Var;
            this.f33470e0.addView(lc0Var, w7.b6.c(-2.0f, -2));
            org.telegram.ui.Components.lc0 lc0Var2 = new org.telegram.ui.Components.lc0(this.D);
            this.f33662z4 = lc0Var2;
            this.f33470e0.addView(lc0Var2, w7.b6.c(-2.0f, -2));
            org.telegram.ui.Components.lc0 lc0Var3 = new org.telegram.ui.Components.lc0(this.D);
            this.A4 = lc0Var3;
            this.f33470e0.addView(lc0Var3, w7.b6.c(-2.0f, -2));
            kg.g1 g1Var = new kg.g1(this, parentActivity, 5);
            this.F = g1Var;
            g1Var.setOverlayTitleAnimation(true);
            this.F.setTitleColor(-1);
            this.F.setSubtitleColor(-1);
            this.F.setBackgroundColor(2130706432);
            this.F.setOccupyStatusBar(!this.f33592s);
            this.F.C(1090519039, false);
            this.F.D(-1, false);
            this.F.setBackButtonImage(2131231241);
            ImageView backButton = this.F.getBackButton();
            this.G = backButton;
            this.H = backButton.getBackground();
            this.I = null;
            ds0 ds0Var = new ds0(parentActivity);
            this.M = ds0Var;
            this.F.addView(ds0Var, w7.b6.e(-1, -1, 119));
            this.f33470e0.addView(this.F, w7.b6.c(-2.0f, -1));
            cs0 cs0Var = new cs0(parentActivity);
            this.N = cs0Var;
            this.f33470e0.addView(cs0Var, w7.b6.e(-1, -2, 55));
            this.F.setActionBarMenuOnItemClick(new aq0(this, p6Var));
            org.telegram.ui.ActionBar.y p5 = this.F.p();
            this.A0 = p5;
            p5.setOnLayoutListener(new qo0(this, 18));
            org.telegram.ui.ActionBar.t0 a2 = this.A0.a(26, 2131231784);
            this.E0 = a2;
            a2.setContentDescription(org.telegram.messenger.cd.K0(2131751599));
            w7.e6.a(this.E0);
            L2(this.E0, false, false);
            org.telegram.ui.ActionBar.t0 a10 = this.A0.a(11, 2131232216);
            this.D0 = a10;
            a10.setContentDescription(org.telegram.messenger.cd.K0(2131748694));
            org.telegram.ui.ActionBar.t0 a11 = this.A0.a(18, 2131232179);
            this.C0 = a11;
            a11.setContentDescription(org.telegram.messenger.cd.K0(2131754810));
            org.telegram.ui.ActionBar.t0 a12 = this.A0.a(4, 2131232180);
            this.B0 = a12;
            a12.setContentDescription(org.telegram.messenger.cd.K0(2131750588));
            org.telegram.ui.ActionBar.y yVar = this.A0;
            vr vrVar = new vr(2131232795, this.E, new th.b());
            this.f33630w0 = vrVar;
            org.telegram.ui.ActionBar.t0 d = yVar.d(1, vrVar);
            this.f33566p0 = d;
            this.f33630w0.setCallback(d.getIconView());
            this.f33566p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f33566p0.getPopupLayout().f20126c = true;
            this.f33566p0.getPopupLayout().setFitItems(true);
            this.f33566p0.setMenuXOffset(org.telegram.messenger.i0.L(3.0f));
            org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(this.E, p6Var);
            this.f33583r0 = x0Var;
            x0Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f33583r0.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
            this.f33583r0.setDrawShadow(false);
            this.f33583r0.setBackgroundColor(-14540254);
            this.f33583r0.setTextColor(-1);
            this.f33583r0.setLabel(org.telegram.messenger.cd.K0(2131743613));
            this.f33583r0.setOnValueChange(new xo0(this, 1));
            this.f33566p0.getPopupLayout().a(this.f33583r0, w7.b6.o(-1, 44));
            org.telegram.ui.ActionBar.h1 a13 = this.f33566p0.a(-1);
            this.f33658z0 = a13;
            a13.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f33566p0.getPopupLayout();
            u71 u71Var = new u71(this.E, new yo0(this));
            this.I0 = u71Var;
            popupLayout.addView(u71Var);
            LinearLayout linearLayout = new LinearLayout(this.E);
            this.f33640x0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f33566p0.getPopupLayout().addView(this.f33640x0);
            org.telegram.ui.ActionBar.b1 e = this.f33566p0.e(22, 2131231912, org.telegram.messenger.cd.K0(2131743614));
            this.f33593s0 = e;
            e.setSelectorColor(268435455);
            org.telegram.ui.Components.i7 i7Var = new org.telegram.ui.Components.i7(this, this.E, 1);
            this.G0 = i7Var;
            try {
                i7Var.setRouteSelector(d6.a.c(this.E).a());
                z10 = true;
            } catch (Exception e7) {
                org.telegram.messenger.f8.f(e7);
                z10 = false;
            }
            this.G0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.b1 e10 = this.f33566p0.e(24, 2131231911, org.telegram.messenger.cd.K0(2131743615));
                this.F0 = e10;
                e10.f(false);
                this.F0.setSelectorColor(268435455);
                this.F0.addView(this.G0, 0, w7.b6.c(-1.0f, -1));
            }
            this.f33566p0.H(-115203550);
            this.f33566p0.setOnMenuDismiss(new wo0(this, 8));
            org.telegram.ui.ActionBar.t0 a14 = this.A0.a(0, 2131231748);
            this.f33557o0 = a14;
            a14.setContentDescription(org.telegram.messenger.cd.K0(2131754839));
            this.f33557o0.setOnClickListener(new cp0(this, 3));
            this.f33557o0.setOnMenuDismiss(new wo0(this, 9));
            this.f33557o0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f33557o0.getPopupLayout().f20126c = true;
            this.f33557o0.getPopupLayout().setFitItems(true);
            this.J0 = new tr(this.E, this.f33557o0.getPopupLayout().getSwipeBack(), new yo0(this));
            org.telegram.ui.ActionBar.b1 h = this.f33557o0.h(2131232166, null, org.telegram.messenger.cd.K0(2131745946), this.J0.f41915a);
            h.d(-328966, -328966);
            this.f33602t0 = h;
            h.setOnClickListener(new cp0(this, 4));
            org.telegram.ui.ActionBar.h1 a15 = this.f33557o0.a(-1);
            this.f33611u0 = a15;
            a15.setColor(-15198184);
            this.f33557o0.e(10, 2131232264, org.telegram.messenger.cd.K0(2131747812)).d(-328966, -328966);
            org.telegram.ui.ActionBar.b1 e11 = this.f33557o0.e(6, 2131231913, org.telegram.messenger.cd.K0(2131747238));
            e11.d(-328966, -328966);
            this.f33620v0 = e11;
            org.telegram.ui.ActionBar.b1 e12 = this.f33557o0.e(3, 2131232218, org.telegram.messenger.cd.K0(2131745365));
            this.f33574q0 = e12;
            e12.d(-328966, -328966);
            this.f33557o0.e(12, 2131232169, org.telegram.messenger.cd.K0(2131745947)).d(-328966, -328966);
            this.f33557o0.e(5, 2131232223, org.telegram.messenger.cd.K0(2131745360)).d(-328966, -328966);
            this.f33557o0.e(25, 2131232381, org.telegram.messenger.cd.K0(2131751705)).d(-328966, -328966);
            this.f33557o0.e(21, 2131231875, org.telegram.messenger.cd.K0(2131746278)).d(-328966, -328966);
            this.f33557o0.e(23, 2131232332, org.telegram.messenger.cd.K0(2131746229)).d(-328966, -328966);
            this.f33557o0.e(9, 2131232364, org.telegram.messenger.cd.K0(2131745477)).d(-328966, -328966);
            this.f33557o0.e(13, 2131232381, org.telegram.messenger.cd.K0(2131745346)).d(-328966, -328966);
            this.f33557o0.e(14, 2131232265, org.telegram.messenger.cd.K0(2131745559)).d(-328966, -328966);
            this.f33557o0.e(19, 2131232407, org.telegram.messenger.cd.K0(2131743981)).d(-328966, -328966);
            this.f33557o0.e(20, 2131232407, org.telegram.messenger.cd.K0(2131749313)).d(-328966, -328966);
            this.f33557o0.e(7, 2131232107, org.telegram.messenger.cd.K0(2131751599)).d(-328966, -328966);
            this.f33557o0.e(8, 2131232086, org.telegram.messenger.cd.K0(2131744857)).d(-328966, -328966);
            this.f33557o0.H(-115203550);
            this.f33557o0.t(19);
            this.f33557o0.t(20);
            M2(false, true);
            this.f33557o0.setPopupItemsSelectorColor(268435455);
            this.f33557o0.setSubMenuDelegate(new bq0(this));
            dg0 dg0Var = new dg0(this.E, 2);
            this.f33505i0 = dg0Var;
            dg0Var.setBackgroundColor(2130706432);
            this.f33470e0.addView(this.f33505i0, w7.b6.e(-1, 48, 83));
            View view = new View(this.E);
            this.f33514j0 = view;
            view.setBackgroundColor(this.f33454c2 == 11 ? -16777216 : 2130706432);
            this.f33487g0.addView(this.f33514j0, w7.b6.a(-1.0f, this.f33523k0 / org.telegram.messenger.i0.f16025p, 87));
            this.f33621v1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f33621v1[0].setShape(0);
            this.f33621v1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f33621v1[1].setShape(0);
            org.telegram.ui.Components.d30 d30Var = new org.telegram.ui.Components.d30(this.E, org.telegram.messenger.i0.L(10.0f));
            this.l1 = d30Var;
            this.f33470e0.addView(d30Var, w7.b6.e(-1, 68, 83));
            this.l1.setDelegate(new dq0(this));
            for (int i11 = 0; i11 < 3; i11++) {
                this.y3[i11] = new ImageView(this.D);
                this.y3[i11].setImageResource(2131232217);
                this.y3[i11].setContentDescription(org.telegram.messenger.cd.L0(2131754718, "AccSwitchToFullscreen"));
                this.y3[i11].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i11].setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
                this.y3[i11].setVisibility(4);
                this.y3[i11].setAlpha(1.0f);
                this.f33470e0.addView(this.y3[i11], w7.b6.c(48.0f, 48));
                this.y3[i11].setOnClickListener(new cp0(this, 5));
            }
            this.Q = new eq0(new th.b());
            wr0 wr0Var = new wr0(this.f33470e0.getContext());
            this.Q1 = wr0Var;
            wr0Var.setFactory(new df0(this, 2));
            this.Q1.setVisibility(4);
            B2(true);
            for (int i12 = 0; i12 < 3; i12++) {
                this.W0[i12] = new fq0(this, this.f33470e0);
                this.W0[i12].d(0, false, true);
            }
            id idVar = new id(this, this.E, p6Var);
            this.X0 = idVar;
            idVar.setUseSelfAlpha(true);
            this.X0.setProgressColor(-1);
            this.X0.setSize(org.telegram.messenger.i0.L(54.0f));
            this.X0.setBackgroundResource(2131231006);
            this.X0.setVisibility(4);
            this.X0.setAlpha(0.0f);
            this.f33470e0.addView(this.X0, w7.b6.e(64, 64, 17));
            M0();
            RadialProgressView radialProgressView = new RadialProgressView(this.D, p6Var);
            this.Q7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.Q7.setBackgroundResource(2131231006);
            this.Q7.setVisibility(4);
            this.f33470e0.addView(this.Q7, w7.b6.e(54, 54, 17));
            org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(this.D, 3);
            this.P7 = u0Var;
            u0Var.setBackgroundColor(2130706432);
            this.P7.b();
            this.P7.setTranslationY(org.telegram.messenger.i0.L(120.0f));
            ((TextView) this.P7.f23118b).setText(org.telegram.messenger.cd.L0(2131751355, "Done").toUpperCase());
            int i13 = org.telegram.ui.ActionBar.t6.f21125ng;
            org.telegram.ui.ActionBar.a7.V((TextView) this.P7.f23118b, i13, p6Var);
            this.f33470e0.addView(this.P7, w7.b6.e(-1, 48, 83));
            ((TextView) this.P7.d).setOnClickListener(new ro0(this, 2));
            ((TextView) this.P7.f23118b).setOnClickListener(new ro0(this, 3));
            org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(false);
            this.f33659z1 = m61Var;
            m61Var.c(new bq0(this));
            as0 as0Var3 = this.f33470e0;
            Objects.requireNonNull(as0Var3);
            this.A1 = new org.telegram.ui.Components.rn0(new mg0(as0Var3, 17), false);
            hs0 hs0Var = new hs0(this.D, this);
            this.O7 = hs0Var;
            hs0Var.setTranslationY(org.telegram.messenger.i0.L(120.0f));
            this.O7.setVisibility(4);
            this.O7.setBackgroundColor(2130706432);
            this.f33470e0.addView(this.O7, w7.b6.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            jg.b1 b1Var = new jg.b1(this, this.E);
            this.P0 = b1Var;
            this.f33470e0.addView(b1Var, w7.b6.e(-1, -2, 83));
            TextView textView = new TextView(this.f33470e0.getContext());
            this.f33532l0 = textView;
            textView.setTextSize(1, 15.0f);
            this.f33532l0.setTypeface(org.telegram.messenger.i0.o());
            this.f33532l0.setSingleLine(true);
            this.f33532l0.setMaxLines(1);
            TextView textView2 = this.f33532l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.f33532l0.setTextColor(-1);
            this.f33532l0.setGravity(3);
            this.P0.addView(this.f33532l0, w7.b6.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f33470e0.getContext());
            this.m0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            this.m0.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.P0.addView(this.m0, w7.b6.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f33470e0.getContext());
            this.f33548n0 = textView4;
            int i14 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.ActionBar.a7.R(textView4, org.telegram.ui.ActionBar.j6.e(B1(i14), 6.0f), org.telegram.ui.ActionBar.a7.N(i14), org.telegram.ui.ActionBar.a7.f(i14), p6Var);
            TextView textView5 = this.f33548n0;
            int i15 = org.telegram.ui.ActionBar.t6.Gi;
            org.telegram.ui.ActionBar.a7.V(textView5, i15, p6Var);
            this.f33548n0.setEllipsize(truncateAt);
            this.f33548n0.setGravity(17);
            this.f33548n0.setLines(1);
            this.f33548n0.setSingleLine(true);
            this.f33548n0.setText(org.telegram.messenger.cd.L0(2131745558, "SetAsMyPhoto"));
            this.f33548n0.setTextSize(1, 15.0f);
            this.f33548n0.setTypeface(org.telegram.messenger.i0.o());
            this.f33548n0.setOnClickListener(new ro0(this, 4));
            this.f33548n0.setVisibility(8);
            this.P0.addView(this.f33548n0, w7.b6.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            gq0 gq0Var = new gq0(this.D, this);
            this.S7 = gq0Var;
            gq0Var.setDelegate(new com.google.android.gms.common.api.internal.v(this));
            FrameLayout frameLayout = new FrameLayout(this.D);
            this.R7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.R7.addView(this.S7, w7.b6.e(-1, 54, 83));
            f3(false, false);
            this.f33470e0.addView(this.R7, w7.b6.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.t0 t0Var = this.E0;
            if (t0Var != null) {
                vg.f a16 = this.Y.a(t0Var);
                a16.o(w7.b9.i(p6Var));
                a16.q(org.telegram.messenger.i0.L(20.0f));
                a16.p(org.telegram.messenger.i0.L(7.0f));
                t0Var.setBackground(yg.d.d(a16, org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(54.0f)));
            }
            hq0 hq0Var = new hq0(this.D, org.telegram.messenger.cd.K0(2131751209));
            this.f33488g1 = hq0Var;
            vg.f a17 = this.Y.a(hq0Var);
            a17.o(w7.b9.i(p6Var));
            hq0Var.setBlurredBackgroundDrawable(a17);
            w7.e6.a(this.f33488g1);
            this.f33488g1.setOnClickListener(new ro0(this, 7));
            this.f33470e0.addView(this.f33488g1, w7.b6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.pe0 pe0Var = new org.telegram.ui.Components.pe0(this.D, p6Var, this.f33442b0);
            this.f33579q5 = pe0Var;
            org.telegram.ui.Components.bt btVar = pe0Var.f29347c;
            vg.f a18 = this.Y.a(btVar);
            a18.o(w7.b9.i(p6Var));
            btVar.setBlurredBackgroundDrawable(a18);
            w7.e6.a(this.f33579q5.f29347c);
            this.f33579q5.setVisibility(8);
            this.f33579q5.setAlpha(0.0f);
            this.f33579q5.setOnClose(new qo0(this, 12));
            this.f33470e0.addView(this.f33579q5, w7.b6.e(-1, -1, 119));
            this.f33579q5.f29346b.setOnClickListener(new ro0(this, 9));
            this.f33579q5.setOnGalleryImage(new wo0(this, 3));
            org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(this, this.D, 3);
            this.f33471e1 = g0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            g0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.g0 g0Var2 = this.f33471e1;
            org.telegram.ui.Components.k00 k00Var = new org.telegram.ui.Components.k00(this.D);
            this.f33462d1 = k00Var;
            g0Var2.setImageDrawable(k00Var);
            this.f33471e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.g0 g0Var3 = this.f33471e1;
            vg.f a19 = this.Y.a(g0Var3);
            a19.o(w7.b9.i(null));
            a19.p(org.telegram.messenger.i0.L(4.0f));
            a19.q(org.telegram.messenger.i0.L(16.0f));
            g0Var3.setBackground(a19);
            w7.e6.a(this.f33471e1);
            this.f33470e0.addView(this.f33471e1, w7.b6.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f33471e1.setOnClickListener(new ro0(this, 10));
            org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(this.f33470e0.getContext());
            this.f33480f1 = r80Var;
            r80Var.setOnClickListener(new ro0(this, 11));
            this.f33470e0.addView(this.f33480f1, w7.b6.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f33470e0.getContext();
            fs0 fs0Var2 = this.f33487g0;
            as0 as0Var4 = this.f33470e0;
            jq0 jq0Var2 = new jq0(this, context, fs0Var2, as0Var4, as0Var4, p6Var, this.f33442b0, new qo0(this, 19));
            this.U1 = jq0Var2;
            jq0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.U1.setOnTimerChange(new wo0(this, 4));
            this.U1.setAccount(this.T);
            this.U1.setOnHeightUpdate(new wo0(this, 5));
            this.U1.setOnAddPhotoClick(new ro0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.E;
            fs0 fs0Var3 = this.f33487g0;
            as0 as0Var5 = this.f33470e0;
            kq0 kq0Var2 = new kq0(this, contextThemeWrapper, fs0Var3, as0Var5, as0Var5, p6Var, this.f33442b0, new qo0(this, 19));
            this.V1 = kq0Var2;
            kq0Var2.setBlurredBackgroundDrawableForMentions(this.Y);
            this.V1.D(true, false);
            this.V1.setOnTimerChange(new wo0(this, 6));
            this.V1.setAccount(this.T);
            this.V1.setOnHeightUpdate(new wo0(this, 7));
            this.V1.setOnAddPhotoClick(new ro0(this, 13));
            ih.c cVar = new ih.c(this, this.E);
            this.f33598s5 = cVar;
            cVar.setVisibility(8);
            this.f33470e0.addView(this.f33598s5, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            jg.v2 v2Var2 = new jg.v2(this.E, p6Var);
            this.p5 = v2Var2;
            v2Var2.setCurrentAccount(this.T);
            this.f33470e0.addView(this.p5, as0Var.indexOfChild(this.F) - 1, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            sr0 sr0Var = new sr0(this);
            this.f33607t5 = sr0Var;
            sr0Var.setRad(18);
            this.f33607t5.l();
            this.p5.setStickerCutOutBtn(this.f33607t5);
            this.f33607t5.setOnClickListener(new ro0(this, 14));
            this.f33607t5.setCutOutState(false);
            this.f33470e0.addView(this.f33607t5, w7.b6.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.D);
            this.f33616u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            sr0 sr0Var2 = new sr0(this);
            this.f33625v5 = sr0Var2;
            sr0Var2.f10070q0 = true;
            sr0Var2.setRad(18);
            this.f33625v5.setEraseState(false);
            this.f33625v5.setOnClickListener(new ro0(this, 15));
            this.f33616u5.addView(this.f33625v5, w7.b6.o(-2, 36));
            this.f33616u5.addView(new Space(this.D), w7.b6.o(12, -1));
            sr0 sr0Var3 = new sr0(this);
            this.f33635w5 = sr0Var3;
            sr0Var3.f10070q0 = true;
            sr0Var3.setRad(18);
            this.f33635w5.setRestoreState(false);
            this.f33635w5.setOnClickListener(new ro0(this, 16));
            this.f33616u5.addView(this.f33635w5, w7.b6.o(-2, 36));
            this.f33470e0.addView(this.f33616u5, w7.b6.e(-2, 36, 17));
            sr0 sr0Var4 = new sr0(this);
            this.f33645x5 = sr0Var4;
            sr0Var4.setUndoState(false);
            this.f33645x5.setRad(18);
            sr0 sr0Var5 = this.f33645x5;
            sr0Var5.f10070q0 = true;
            sr0Var5.setOnClickListener(new ro0(this, 17));
            this.f33470e0.addView(this.f33645x5, w7.b6.e(-2, 36, 17));
            sr0 sr0Var6 = new sr0(this);
            this.f33654y5 = sr0Var6;
            sr0Var6.setOutlineState(false);
            this.f33654y5.setRad(18);
            sr0 sr0Var7 = this.f33654y5;
            sr0Var7.f10070q0 = true;
            sr0Var7.setOnClickListener(new ro0(this, 18));
            this.f33470e0.addView(this.f33654y5, w7.b6.e(-2, 36, 17));
            Z2(false, false);
            d3(false, false);
            l0 l0Var = new l0(this, this.D, 20);
            this.X1 = l0Var;
            l0Var.addView(this.U1, w7.b6.e(-1, -1, 83));
            this.f33470e0.addView(this.X1, w7.b6.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.D);
            this.Y1 = frameLayout2;
            frameLayout2.addView(this.V1, w7.b6.e(-1, -1, 51));
            this.f33470e0.addView(this.Y1, w7.b6.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.D);
            this.Q0 = frameLayout3;
            this.f33470e0.addView(frameLayout3, w7.b6.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.D);
            this.R0 = frameLayout4;
            this.f33470e0.addView(frameLayout4, w7.b6.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.D);
            this.T7 = textView6;
            textView6.setSingleLine(true);
            this.T7.setVisibility(8);
            this.T7.setText(org.telegram.messenger.cd.L0(2131752133, "ChooseCover"));
            this.T7.setGravity(1);
            this.T7.setTextSize(1, 14.0f);
            this.T7.setTextColor(-7566196);
            this.f33470e0.addView(this.T7, w7.b6.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            bi.f2 f2Var = new bi.f2(this, this.D, p6Var);
            this.S0 = f2Var;
            int L = org.telegram.messenger.i0.L(52.0f);
            int L2 = org.telegram.messenger.i0.L(38.0f);
            f2Var.I = L;
            f2Var.J = L2;
            bi.f2 f2Var2 = this.S0;
            f2Var2.f33040h0 = true;
            vg.f a20 = this.Y.a(f2Var2);
            a20.o(w7.b9.i(p6Var));
            f2Var2.setBlurredBackgroundDrawable(a20);
            this.f33470e0.addView(this.S0, w7.b6.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.S0.setContentDescription(org.telegram.messenger.cd.L0(2131745657, "Send"));
            w7.e6.a(this.S0);
            this.S0.setOnClickListener(new ro0(this, 19));
            this.S0.setOnLongClickListener(new s(this, 5));
            org.telegram.ui.Components.qe0 qe0Var = new org.telegram.ui.Components.qe0(this.D);
            this.T0 = qe0Var;
            LinearLayout linearLayout3 = qe0Var.f29641b;
            vg.f a21 = this.Y.a(linearLayout3);
            a21.o(w7.b9.i(p6Var));
            a21.q(org.telegram.messenger.i0.L(18.0f));
            a21.p(org.telegram.messenger.i0.L(7.0f));
            linearLayout3.setBackground(a21);
            LinearLayout linearLayout4 = this.T0.f29642c;
            vg.f a22 = this.Y.a(linearLayout4);
            a22.o(w7.b9.i(p6Var));
            a22.q(org.telegram.messenger.i0.L(18.0f));
            a22.p(org.telegram.messenger.i0.L(7.0f));
            linearLayout4.setBackground(a22);
            this.T0.setVisibility(8);
            this.T0.f29641b.setOnClickListener(new ro0(this, 20));
            this.T0.f29642c.setOnClickListener(new ro0(this, 21));
            this.f33470e0.addView(this.T0, w7.b6.e(-1, 56, 80));
            u71 u71Var2 = new u71(this, this.D, 15);
            this.H0 = u71Var2;
            u71Var2.setOrientation(0);
            this.H0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
            u71 u71Var3 = this.H0;
            vg.f a23 = this.Y.a(u71Var3);
            a23.o(w7.b9.i(p6Var));
            a23.p(org.telegram.messenger.i0.L(2.0f));
            a23.q(org.telegram.messenger.i0.L(22.0f));
            u71Var3.setBackground(a23);
            this.P0.addView(this.H0, w7.b6.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.D);
            this.Z0 = imageView;
            imageView.setScaleType(scaleType);
            this.Z0.setImageResource(2131231728);
            this.Z0.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.H0.addView(this.Z0, w7.b6.o(48, 48));
            this.Z0.setOnClickListener(new ro0(this, 22));
            this.Z0.setContentDescription(org.telegram.messenger.cd.L0(2131751699, "CropImage"));
            ImageView imageView2 = new ImageView(this.D);
            this.f33443b1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f33443b1.setImageResource(2131232281);
            this.f33443b1.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.H0.addView(this.f33443b1, w7.b6.o(48, 48));
            this.f33443b1.setOnClickListener(new ro0(this, 23));
            this.f33443b1.setContentDescription(org.telegram.messenger.cd.L0(2131754783, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.D);
            this.f33434a1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f33434a1.setImageResource(2131231741);
            this.f33434a1.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.H0.addView(this.f33434a1, w7.b6.o(48, 48));
            this.f33434a1.setOnClickListener(new ro0(this, 24));
            this.f33434a1.setContentDescription(org.telegram.messenger.cd.L0(2131754840, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.D);
            this.Y0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Y0.setImageResource(2131231738);
            this.Y0.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.H0.addView(this.Y0, w7.b6.o(48, 48));
            this.Y0.setOnClickListener(new ro0(this, 25));
            this.Y0.setContentDescription(org.telegram.messenger.cd.L0(2131754810, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(this.D);
            this.f33515j1 = i61Var;
            i61Var.setTag(1);
            this.f33515j1.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.Y7 = y2();
            this.f33515j1.a(Math.min(this.f33477e8, this.f33486f8), this.f33531k8 && this.Z7 > 1, this.f33582r);
            this.f33515j1.setContentDescription(org.telegram.messenger.cd.L0(2131754735, "AccDescrVideoQuality"));
            this.H0.addView(this.f33515j1, w7.b6.o(48, 48));
            this.f33515j1.setOnClickListener(new wu(26, this, parentActivity));
            ImageView imageView5 = new ImageView(this.D);
            this.f33453c1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f33453c1.setImageResource(2131231755);
            this.f33453c1.setBackground(org.telegram.ui.ActionBar.t6.X(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f)));
            this.H0.addView(this.f33453c1, w7.b6.o(48, 48));
            this.f33453c1.setOnClickListener(new ro0(this, 26));
            this.f33453c1.setContentDescription(org.telegram.messenger.cd.L0(2131754811, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.u0 u0Var2 = new org.telegram.ui.Cells.u0(this.E, 3);
            this.U0 = u0Var2;
            u0Var2.setBackgroundColor(-872415232);
            this.U0.b();
            this.U0.setVisibility(8);
            this.f33470e0.addView(this.U0, w7.b6.e(-1, 48, 83));
            ((TextView) this.U0.d).setOnClickListener(new ro0(this, 27));
            ((TextView) this.U0.f23118b).setOnClickListener(new ro0(this, 28));
            TextView textView7 = new TextView(this.E);
            this.V0 = textView7;
            textView7.setClickable(false);
            this.V0.setVisibility(8);
            this.V0.setTextSize(1, 14.0f);
            this.V0.setTextColor(-1);
            this.V0.setGravity(17);
            this.V0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.g0(-12763843, 0));
            this.V0.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
            this.V0.setText(org.telegram.messenger.cd.K0(2131751697).toUpperCase());
            this.V0.setTypeface(org.telegram.messenger.i0.o());
            this.U0.addView(this.V0, w7.b6.e(-2, -1, 49));
            this.V0.setOnClickListener(new ro0(this, 29));
            org.telegram.ui.Components.p10 p10Var = new org.telegram.ui.Components.p10(this.f33470e0.getContext(), this);
            this.f33589r6 = p10Var;
            p10Var.b();
            this.f33599s6 = true;
            this.f33589r6.h = this;
            yo0 yo0Var = new yo0(this);
            this.C4.H0(this.f33470e0);
            ImageReceiver imageReceiver = this.C4;
            imageReceiver.f14390k1 = (byte) 2;
            imageReceiver.J0 = true;
            imageReceiver.d0(yo0Var);
            this.B4.H0(this.f33470e0);
            ImageReceiver imageReceiver2 = this.B4;
            imageReceiver2.f14390k1 = (byte) 2;
            imageReceiver2.J0 = true;
            imageReceiver2.d0(yo0Var);
            this.D4.H0(this.f33470e0);
            ImageReceiver imageReceiver3 = this.D4;
            imageReceiver3.f14390k1 = (byte) 2;
            imageReceiver3.J0 = true;
            imageReceiver3.d0(yo0Var);
            int rotation = ((WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f33470e0.getContext(), 2131232689);
            this.N0 = checkBox;
            checkBox.setDrawBackground(true);
            this.N0.setHasBorder(true);
            this.N0.setSize(34);
            this.N0.setCheckOffset(org.telegram.messenger.i0.L(1.0f));
            this.N0.c(B1(i13), -1);
            this.N0.setVisibility(8);
            this.f33470e0.addView(this.N0, w7.b6.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
            if (!this.f33592s) {
                ((FrameLayout.LayoutParams) this.N0.getLayoutParams()).topMargin += org.telegram.messenger.i0.f16020m;
            }
            this.N0.setOnClickListener(new cp0(this, 0));
            CounterView counterView = new CounterView(this.D);
            this.O0 = counterView;
            this.f33470e0.addView(counterView, w7.b6.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
            if (!this.f33592s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.i0.f16020m;
            }
            this.O0.setOnClickListener(new cp0(this, 1));
            ls0 ls0Var = new ls0(this.D);
            this.f33558o1 = ls0Var;
            ls0Var.setVisibility(8);
            this.f33558o1.setAlpha(0.0f);
            this.f33558o1.setLayoutManager(new dh.f());
            ls0 ls0Var2 = this.f33558o1;
            fg.j jVar = new fg.j(16, this, this.D);
            this.f33567p1 = jVar;
            ls0Var2.setAdapter(jVar);
            this.f33470e0.addView(this.f33558o1, w7.b6.e(-1, 103, 51));
            this.f33558o1.setOnItemClickListener(new g(this, 22));
            UndoView undoView = new UndoView(this.E, null, false, p6Var);
            this.f33549n1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(112.0f));
            this.f33549n1.h(-115203550, -1);
            this.f33470e0.addView(this.f33549n1, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.i0.C1()) {
                View view2 = new View(this.E);
                this.T3 = view2;
                view2.setContentDescription(org.telegram.messenger.cd.L0(2131754929, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new cp0(this, 2));
                this.f33470e0.addView(this.T3, w7.b6.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.a7.R(this.f33548n0, org.telegram.ui.ActionBar.j6.e(B1(i14), 6.0f), org.telegram.ui.ActionBar.a7.N(i14), org.telegram.ui.ActionBar.a7.f(i14), p6Var);
            org.telegram.ui.ActionBar.a7.V(this.f33548n0, i15, p6Var);
            eq0 eq0Var = this.Q;
            eq0Var.f23428j0 = true;
            eq0Var.f23424h0 = false;
            org.telegram.ui.Cells.v9 n10 = eq0Var.n(this.f33487g0.getContext());
            if (n10 != null) {
                org.telegram.messenger.i0.E2(n10);
                this.f33470e0.addView(n10);
            }
            this.Q.S(this.f33470e0);
            this.Q.R();
            this.f33432a.a(false, false);
            return;
        }
        x3();
    }

    public final boolean O0() {
        boolean z10 = false;
        if (this.f33571p6 != null || this.C1 == null) {
            return false;
        }
        this.f33493g6 = 1.0f;
        this.f33554n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33571p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f));
        this.f33571p6.setDuration(250L);
        this.f33571p6.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        this.f33571p6.addListener(new qq0(this, 0));
        this.f33571p6.start();
        eg.o oVar = this.C1.f24615b.L;
        if (oVar != null) {
            z10 = oVar.f6580j;
        }
        return !z10;
    }

    public final void O2(org.telegram.ui.Components.bi biVar) {
        this.a2 = biVar;
        aa0 aa0Var = this.f33444b2;
        if (aa0Var != null) {
            aa0Var.b();
            this.f33444b2 = null;
        }
        if (biVar != null) {
            if (biVar.f21600g1 == null) {
                Window window = biVar.getWindow();
                ?? obj = new Object();
                obj.f3777c = new mg.l(new WeakReference(window), 28);
                biVar.f21600g1 = obj;
            }
            c5.e eVar = biVar.f21600g1;
            eVar.getClass();
            this.f33444b2 = new aa0(eVar, 2);
        }
    }

    public final boolean P0(float f7, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.be0 be0Var;
        float f10;
        if (this.f33571p6 == null && (be0Var = this.C1) != null) {
            be0Var.f24615b.i();
            this.f33448b6 = 0.0f;
            this.f33485f6 = 0.0f + f7;
            if (z10) {
                this.f33493g6 = 1.0f;
            }
            this.f33554n6 = System.currentTimeMillis();
            this.f33571p6 = new AnimatorSet();
            if (this.f33454c2 == 1) {
                this.f33476e6 = 1.0f;
                this.f33438a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int q6 = imageReceiver.q();
                    int o10 = this.C4.o();
                    if (Math.abs((((int) this.C1.f24615b.getStateOrientation()) / 90) % 2) == 1) {
                        o10 = q6;
                        q6 = o10;
                    }
                    org.telegram.messenger.ye yeVar = this.X4.f43638c;
                    if (yeVar != null) {
                        q6 = (int) (q6 * yeVar.e);
                        o10 = (int) (o10 * yeVar.f19367f);
                    }
                    float f11 = q6;
                    float f12 = o10;
                    float min = Math.min(m1(1) / f11, j1(1, false) / f12);
                    if (Math.abs((f7 / 90.0f) % 2.0f) == 1.0f) {
                        f10 = Math.min(m1(1) / f12, j1(1, false) / f11);
                    } else {
                        f10 = min;
                    }
                    this.f33476e6 = f10 / min;
                }
            }
            if (this.f33454c2 == 11) {
                this.f33438a6 = u2(false) * this.f33438a6;
                this.f33476e6 = u2(false) * this.f33476e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new fe.c(this, f7, this.C1.f24616c.getRotation(), 4));
            this.f33571p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f), ofFloat);
            this.f33571p6.setDuration(250L);
            this.f33571p6.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.f33571p6.addListener(new l40(this, f7, runnable, 1));
            this.f33571p6.start();
            if (Math.abs(this.C1.f24615b.getStateOrientation() + f7) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void P2() {
        un unVar;
        TLRPC.Chat chat;
        es0 es0Var = this.d;
        if (es0Var != null) {
            if (es0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f33547n && (unVar = this.l4) != null && (chat = unVar.e) != null && !org.telegram.messenger.w3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.s4.M(this.D, org.telegram.messenger.cd.L0(2131745328, "Slowmode"), org.telegram.messenger.cd.L0(2131745321, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, p1());
            boolean x10 = this.d.x(this.P4);
            this.N0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f33567p1.i(k10);
                    this.f33558o1.y0(k10);
                } else {
                    this.f33567p1.s(k10);
                    if (k10 == 0) {
                        this.f33567p1.g(0);
                    }
                }
            }
            D3();
        }
    }

    public final void Q0() {
        if (this.D != null && this.f33487g0 != null) {
            if (org.telegram.ui.Components.jf0.f27345p0.P) {
                org.telegram.ui.Components.jf0.b(false);
            }
            xa.n nVar = this.C7;
            if (nVar != null) {
                nVar.a();
                this.C7 = null;
            }
            ConnectionsManager.getInstance(this.T).cancelRequestsForGuid(this.f33451c);
            r2(false);
            try {
                if (this.f33487g0.getParent() != null) {
                    ((WindowManager) this.D.getSystemService("window")).removeViewImmediate(this.f33487g0);
                    Z1();
                }
                this.f33487g0 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.kc kcVar = this.f33519j5;
            if (kcVar != null) {
                kcVar.a();
                this.f33519j5 = null;
            }
            this.f33496h0.setImageBitmap(null);
            if (this == f33431b9) {
                f33431b9 = null;
            } else {
                f33430a9 = null;
            }
            Z1();
        }
    }

    public final void Q2() {
        float q6 = this.C4.q();
        float o10 = this.C4.o();
        if (q6 != 0.0f && o10 != 0.0f) {
            float m12 = m1(this.f33615u4);
            float k12 = k1();
            float min = Math.min(k12 / o10, m12 / q6);
            float max = Math.max(m12 / ((int) (q6 * min)), k12 / ((int) (o10 * min)));
            this.f33438a6 = max;
            z3(max);
        }
    }

    public final void R0() {
        if (this.C4.m() == null && !this.f33494g7.isEmpty() && this.f33454c2 != 1) {
            String str = this.C4.Q;
            String str2 = this.f33644x4;
            if (str2 == null || !str2.equals(str)) {
                this.f33634w4 = 0;
                org.telegram.messenger.kc p5 = this.C4.p();
                int i10 = this.C4.U;
                if (str != null && p5 != null && p5.f16564c != null) {
                    Utilities.e.c(new org.telegram.ui.Components.c11(this, p5, i10, str, 8));
                }
            }
        }
    }

    public final void R2(CharSequence charSequence) {
        ds0 ds0Var = this.M;
        this.f33474e4 = charSequence;
        ds0Var.c(charSequence);
        m3(true, false);
    }

    public final void S0() {
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Z7)), this.Y7);
        edit.commit();
        G3();
        E3();
    }

    public final void S2(boolean z10, boolean z11) {
        if (this.f33534l3 != z10) {
            if (z10) {
                this.f33505i0.setTag(1);
            } else {
                this.f33505i0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f33526k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33534l3 = z10;
            float f7 = 0.0f;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    this.f33508i3.setVisibility(0);
                }
                float alpha = this.f33508i3.getAlpha();
                if (z10) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new po0(this, 0));
                ofFloat.addListener(new xq0(this, z10, 0));
                this.f33526k3 = ofFloat;
                ofFloat.start();
            } else {
                ms0 ms0Var = this.f33508i3;
                if (!z10) {
                    i10 = 8;
                }
                ms0Var.setVisibility(i10);
                ms0 ms0Var2 = this.f33508i3;
                if (z10) {
                    f7 = 1.0f;
                }
                ms0Var2.setAlpha(f7);
            }
            if (this.f33525k2 && this.f33521j7 == null) {
                if (z10) {
                    this.f33557o0.S(9);
                } else {
                    this.f33557o0.t(9);
                }
            }
        }
    }

    public final void T0() {
        aa0 aa0Var = this.f33545m7;
        if (aa0Var != null) {
            aa0Var.b();
            this.f33545m7 = null;
        }
        aa0 aa0Var2 = this.f33444b2;
        if (aa0Var2 != null) {
            aa0Var2.b();
            this.f33444b2 = null;
        }
        try {
            if (this.f33487g0.getParent() != null) {
                ((WindowManager) this.D.getSystemService("window")).removeView(this.f33487g0);
                Z1();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean T1() {
        if (this.f33454c2 != 11) {
            int i10 = this.P4;
            if (i10 >= 0) {
                ArrayList arrayList = this.f33494g7;
                if (i10 < arrayList.size()) {
                    es0 es0Var = this.d;
                    if (es0Var != null && !es0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.P4);
                    if (obj instanceof org.telegram.messenger.ef) {
                        return ((org.telegram.messenger.ef) obj).i();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean T2(int i10) {
        bs0 bs0Var = this.f33521j7;
        if (bs0Var != null) {
            if (bs0Var.a(i10) || this.f33521j7.e(i10)) {
                int i11 = org.telegram.messenger.tz.f18131a;
                if (org.telegram.messenger.sc.e(1024)) {
                    File b10 = this.f33521j7.b(i10);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.tz.B0 && (this.f33521j7.d(i10) instanceof TLRPC.Document)) {
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

    public final void U0(android.graphics.Canvas r51, org.telegram.ui.Components.w9 r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U0(android.graphics.Canvas, org.telegram.ui.Components.w9, int, int, boolean, boolean, boolean):void");
    }

    public final boolean U1() {
        if (this.e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r24, float r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V0(android.graphics.Canvas, float, float):void");
    }

    public final void V1() {
        WindowManager.LayoutParams layoutParams = this.f33461d0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.D.getSystemService("window")).updateViewLayout(this.f33487g0, this.f33461d0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f33487g0.setFocusable(true);
        this.f33470e0.setFocusable(true);
    }

    public final void V2(AlertDialog$Builder alertDialog$Builder) {
        if (this.D != null) {
            try {
                org.telegram.ui.ActionBar.x1 x1Var = this.P1;
                if (x1Var != null) {
                    x1Var.dismiss();
                    this.P1 = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            try {
                org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
                this.P1 = p5;
                p5.setCanceledOnTouchOutside(true);
                this.P1.setOnDismissListener(new q5(this, 10));
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }

    public final void W0(Canvas canvas) {
        boolean z10;
        float d;
        int i10;
        if (this.S4) {
            if (!org.telegram.messenger.tz.f18138c0) {
                d = 1.0f;
            } else {
                int i11 = this.f33552n4;
                if (i11 != 0 && i11 != 2 && i11 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d = this.E8.d(z10);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.i0.f16020m * 1.5f));
            int height = this.P0.getHeight() + org.telegram.messenger.i0.f16021n;
            if (this.U1.getVisibility() == 0) {
                i10 = org.telegram.messenger.i0.L(20.0f) + (this.U1.getEditTextHeightClosedKeyboard() / 2);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f33470e0.getWidth(), this.f33470e0.getHeight() + org.telegram.messenger.i0.f16021n, (int) (d * (this.L0.getAlpha() - 127) * 2.007874f), 31);
            this.G7.rewind();
            float f7 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.G7.addRect(0.0f, 0.0f, this.f33470e0.getWidth(), f7, direction);
            this.G7.addRect(0.0f, (this.f33470e0.getHeight() + org.telegram.messenger.i0.f16021n) - i12, this.f33470e0.getWidth(), this.f33470e0.getHeight() + org.telegram.messenger.i0.f16021n, direction);
            canvas.clipPath(this.G7);
            canvas.drawColor(-16777216);
            U0(canvas, this.f33452c0, 0, 0, true, true, false);
            canvas.save();
            this.L7.reset();
            this.L7.postScale(1.0f, f7 / 16.0f);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f33470e0.getWidth(), f7, this.H7);
            this.M7.reset();
            this.M7.postScale(1.0f, i12 / 16.0f);
            this.M7.postTranslate(0.0f, (this.f33470e0.getHeight() - i12) + org.telegram.messenger.i0.f16021n);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f33470e0.getHeight() + org.telegram.messenger.i0.f16021n) - i12, this.f33470e0.getWidth(), this.f33470e0.getHeight() + org.telegram.messenger.i0.f16021n, this.I7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void W1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f7, boolean z10) {
        boolean z11;
        int i10;
        Bitmap.CompressFormat i12 = i1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z11 = true;
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
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
        createBitmap.compress(i12, i10, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (z11) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final boolean W2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f33542m4;
        if ((k2Var instanceof un) && org.telegram.messenger.w3.V(((un) k2Var).e)) {
            org.telegram.ui.Components.wb f7 = new org.telegram.ui.Components.cc(frameLayout, this.f33622v2).f(org.telegram.messenger.vp.r1(this.T).V4, new qo0(this, 26));
            f7.v = new qo0(this, 27);
            this.f33555n7 = f7.j();
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.D, this.f33622v2);
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), null);
        org.telegram.messenger.jj jjVar = this.T4;
        if (jjVar != null && org.telegram.messenger.jj.L4(jjVar.f16337k) && org.telegram.messenger.b8.G(this.T4.I1).T(this.f33457c5[0])) {
            x1Var.T = org.telegram.messenger.cd.L0(2131747219, null);
        } else {
            x1Var.T = org.telegram.messenger.cd.L0(2131747233, null);
        }
        V2(alertDialog$Builder);
    }

    public final void Y1(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(android.graphics.Canvas):void");
    }

    public final void Y2(final org.telegram.ui.Components.nc ncVar, boolean z10, boolean z11, final float[] fArr) {
        float f7;
        float f10;
        int i10;
        es0 es0Var = this.d;
        if (es0Var != null && es0Var.l()) {
            f7 = 175.0f;
        } else {
            f7 = 58.0f;
        }
        float L = org.telegram.messenger.i0.L(f7);
        float f11 = 1.0f;
        if (ncVar == this.V1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f12 = L * f10;
        Integer num = null;
        if (!z11) {
            ncVar.animate().setListener(null).cancel();
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ncVar.setVisibility(i10);
            if (z10) {
                f12 = 0.0f;
            }
            ncVar.setTranslationY(f12);
            float alpha = this.P0.getAlpha();
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[0] = f11;
            ncVar.setAlpha(alpha * f11);
        } else if (z10 && ncVar.getTag() == null) {
            if (ncVar.getVisibility() != 0) {
                ncVar.setVisibility(0);
                ncVar.setAlpha(this.P0.getAlpha());
                ncVar.setTranslationY(f12);
            }
            ncVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f39363b;

                {
                    this.f39363b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f39363b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = ncVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f33471e1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33480f1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33488g1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.I1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f39363b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ncVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f33471e1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33480f1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33488g1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.I1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        } else if (!z10 && ncVar.getTag() != null) {
            ncVar.animate().translationY(f12).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f39363b;

                {
                    this.f39363b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f39363b;
                            float alpha2 = photoViewer.P0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f13 = alpha2 * animatedFraction;
                            View view = ncVar;
                            view.setAlpha(f13);
                            if (view == photoViewer.U1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f33471e1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33480f1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                                photoViewer.f33488g1.setTranslationY(photoViewer.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer.I1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f39363b;
                            float alpha3 = photoViewer2.P0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ncVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.U1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.P0.getTranslationY() - (photoViewer2.U1.getAlpha() * i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f33471e1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33480f1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                                photoViewer2.f33488g1.setTranslationY(photoViewer2.U1.getAlpha() * (-i0.a.d(46.0f, photoViewer2.U1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.I1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new hh(3, ncVar)).start();
        }
        if (z10) {
            num = 1;
        }
        ncVar.setTag(num);
    }

    public final void Z0(TLRPC.Document document, TLRPC.Document document2, boolean z10, org.telegram.messenger.j20 j20Var) {
        float f7;
        this.f33618u7 = document;
        this.f33609t7 = document2;
        this.f33627v7 = z10;
        this.f33637w7 = false;
        this.f33647x7 = j20Var;
        this.f33448b6 = 0.0f;
        this.f33485f6 = 0.0f;
        if (this.p5 != null) {
            sr0 sr0Var = this.f33654y5;
            if (sr0Var != null) {
                sr0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList = this.f33588r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f33618u7 != null) {
            ArrayList arrayList2 = this.f33588r5;
            if (arrayList2 == null) {
                this.f33588r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.f33618u7;
            int i10 = this.T;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i10).m0(documentAttribute.stickerset, true);
                        if (m0 != null && m0.packs != null) {
                            for (int i12 = 0; i12 < m0.packs.size(); i12++) {
                                TLRPC.TL_stickerPack tL_stickerPack = m0.packs.get(i12);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f19799id)) && org.telegram.messenger.k6.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && org.telegram.messenger.k6.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.f33588r5.addAll(arrayList3);
            }
        }
        sr0 sr0Var2 = this.f33607t5;
        if (sr0Var2 != null) {
            sr0Var2.setCutOutState(false);
        }
        d3(true, false);
        ImageView imageView = this.f33453c1;
        if (imageView != null) {
            if (this.f33627v7) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
        }
    }

    public final void Z1() {
        Activity activity = this.D;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f33350b1.remove(this.f33594s1);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f33542m4;
        if (k2Var != null && k2Var.getFragmentView() != null) {
            this.f33544m6 = 1.0f;
            View fragmentView = this.f33542m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.bi biVar = this.a2;
            if (biVar != null) {
                org.telegram.ui.ActionBar.p2 p2Var = biVar.f21589c;
                p2Var.setScaleX(1.0f);
                p2Var.setScaleY(1.0f);
            }
        }
    }

    public final void Z2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        es0 es0Var = this.d;
        boolean z14 = false;
        if (es0Var != null && es0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        jq0 jq0Var = this.U1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        Y2(jq0Var, z13, z11, this.f33656y7);
        kq0 kq0Var = this.V1;
        if (z10 && z12) {
            z14 = true;
        }
        Y2(kq0Var, z14, z11, this.f33665z7);
    }

    public final boolean a() {
        if (!this.T8 && Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f18132a0 && org.telegram.messenger.tz.o() >= 2 && !org.telegram.messenger.i0.m0) {
            return true;
        }
        return false;
    }

    public final void a2(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.F2 != null && this.T4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.F2.U() == -9223372036854775807L) {
                        this.f33435a3 = intValue / ((float) this.T4.L0());
                        return;
                    }
                    long j10 = intValue * 1000;
                    this.F2.p0(j10);
                    this.f33577q3.h(true, ((float) j10) / ((float) this.F2.U()));
                    this.f33586r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.D instanceof LaunchActivity) {
                    ay ayVar = new ay(null);
                    ayVar.f35840n2 = url;
                    ((LaunchActivity) this.D).u0(ayVar, false, true);
                    H0(false, false);
                    return;
                }
                return;
            } else if (this.l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.g51) || org.telegram.messenger.i0.I3(url))) {
                org.telegram.ui.Components.s4.p0(this.l4, url, true, true);
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

    public final void b2(gs0 gs0Var) {
        if (this.f33613u2) {
            r2(true);
        }
        org.telegram.messenger.jj jjVar = this.T4;
        if (jjVar != null && !jjVar.P) {
            org.telegram.messenger.b8.G(this.T).f(this.T4.F0());
        }
        this.e = false;
        this.f33478f = false;
        this.f33489g2 = false;
        this.f33597s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f33437a5 = null;
        this.f33447b5 = null;
        this.f33510i5 = null;
        this.f33475e5 = null;
        this.f33576q2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f33508i3 != null) {
            S2(false, false);
        }
        fr0 fr0Var = this.T1;
        if (fr0Var != null) {
            fr0Var.scrollTo(0, 0);
        }
        this.f33454c2 = 0;
        this.f33463d2 = false;
        this.f33472e2 = false;
        this.f33481f2 = false;
        this.f33498h2 = false;
        org.telegram.messenger.kc kcVar = this.f33519j5;
        if (kcVar != null) {
            kcVar.a();
            this.f33519j5 = null;
        }
        this.a2 = null;
        aa0 aa0Var = this.f33444b2;
        if (aa0Var != null) {
            aa0Var.b();
            this.f33444b2 = null;
        }
        org.telegram.ui.Components.s5 s5Var = this.f33516j2;
        if (s5Var != null) {
            s5Var.w(this.f33470e0);
            this.f33516j2 = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            fq0 fq0Var = this.W0[i10];
            if (fq0Var != null) {
                fq0Var.d(-1, false, true);
            }
        }
        s2(0);
        gq0 gq0Var = this.S7;
        if (gq0Var != null) {
            gq0Var.a();
        }
        this.f33549n1.d(0, false);
        this.C4.w0(null);
        this.F4.c();
        this.B4.w0(null);
        this.E4.c();
        this.D4.w0(null);
        this.G4.c();
        this.f33470e0.post(new so0(this, gs0Var, 0));
        es0 es0Var = this.d;
        if (es0Var != null) {
            es0Var.G();
        }
        org.telegram.ui.Components.d30 d30Var = this.l1;
        d30Var.d.clear();
        d30Var.e.clear();
        d30Var.f25270c.clear();
        es0 es0Var2 = this.d;
        if (es0Var2 != null) {
            es0Var2.D();
        }
        this.d = null;
        this.f33567p1.f();
        this.f33521j7 = null;
        this.f33597s4 = false;
        this.f33565o8 = 0.0f;
        this.f33573p8 = 1.0f;
        if (gs0Var != null) {
            gs0Var.f37627a.O0(true, true);
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

    public final void b3(boolean z10) {
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
            this.f33440a8 = this.Y7;
        }
        AnimatorSet animatorSet = this.U7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.U7 = new AnimatorSet();
        float f19 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f33514j0.setVisibility(0);
                View view = this.f33514j0;
                if (this.f33454c2 == 11) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                view.setAlpha(f18);
                View view2 = this.f33514j0;
                if (this.f33454c2 == 11) {
                    i11 = 1711276032;
                } else {
                    i11 = 2130706432;
                }
                view2.setBackgroundColor(i11);
            }
            this.O7.setTag(1);
            AnimatorSet animatorSet2 = this.U7;
            jg.b1 b1Var = this.P0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.U1.getEditTextHeight() + b1Var.getHeight();
            if (this.f33584r1) {
                i10 = org.telegram.messenger.i0.L(58.0f);
            } else {
                i10 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, property, 0.0f, editTextHeight + i10);
            jg.b1 b1Var2 = this.P0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b1Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.S0, property, 0.0f, org.telegram.messenger.i0.L(158.0f));
            View view3 = this.f33514j0;
            if (this.S4) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f17, 1.0f));
        } else {
            this.O7.setTag(null);
            AnimatorSet animatorSet3 = this.U7;
            hs0 hs0Var = this.O7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hs0Var, property3, 0.0f, org.telegram.messenger.i0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.P7, property3, 0.0f, org.telegram.messenger.i0.L(166.0f));
            View view4 = this.f33514j0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f7));
        }
        this.U7.addListener(new xq0(this, z10, 3));
        this.U7.setDuration(200L);
        this.U7.setInterpolator(org.telegram.messenger.i0.G);
        this.U7.start();
        float f20 = 0.25f;
        if (this.f33471e1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f33471e1.animate();
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
        if (this.f33480f1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f33480f1.animate();
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
        if (this.f33488g1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f33488g1.animate();
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
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        if (org.telegram.ui.Components.jf0.f27345p0.P) {
            org.telegram.ui.Components.jf0.b(false);
        }
        this.Q8 = oVar;
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            u61Var.z0(null);
            this.F2.A0(null);
            this.F2.h0();
            this.F2.A0(this.R8);
        }
        ((WindowManager) this.D.getSystemService("window")).removeView(this.f33487g0);
        this.S8 = true;
        this.f33487g0.invalidate();
    }

    public final int c1(int i10) {
        if (i10 != 1 && (i10 != 0 || this.f33454c2 != 1)) {
            if (i10 != 0 && i10 != 5 && i10 != 4 && i10 != 3) {
                return org.telegram.messenger.i0.L(14.0f);
            }
            return 0;
        }
        return org.telegram.messenger.i0.L(16.0f);
    }

    public final void c2(org.telegram.messenger.jj r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.ic r24, org.telegram.messenger.ic r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.gs0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c2(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ic, org.telegram.messenger.ic, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.gs0):void");
    }

    public final void c3() {
        long a2;
        if (this.D != null) {
            un unVar = this.l4;
            if (unVar != null) {
                a2 = unVar.a();
            } else {
                es0 es0Var = this.d;
                if (es0Var != null) {
                    a2 = es0Var.a();
                } else {
                    return;
                }
            }
            long j10 = a2;
            org.telegram.ui.Components.s4.J(this.D, j10, -1L, 0, false, new yo0(this), null, new org.telegram.ui.Components.p4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false)), null);
        }
    }

    public final int d1(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            if (i10 != 1 && (i10 != 0 || this.f33454c2 != 1)) {
                if (i10 == 3 && this.L1 != null) {
                    int L = org.telegram.messenger.i0.L(8.0f);
                    if (!this.f33592s) {
                        i11 = org.telegram.messenger.i0.f16020m;
                    }
                    return this.L1.getAdditionalTop() + L + i11;
                } else if (i10 != 0 && i10 != 4 && i10 != 5) {
                    int L2 = org.telegram.messenger.i0.L(14.0f);
                    if (!this.f33592s) {
                        i11 = org.telegram.messenger.i0.f16020m;
                    }
                    return L2 + i11;
                }
            } else {
                int L3 = org.telegram.messenger.i0.L(16.0f);
                if (!this.f33592s) {
                    i11 = org.telegram.messenger.i0.f16020m;
                }
                return L3 + i11;
            }
        }
        return 0;
    }

    public final boolean d2(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d2(android.view.MotionEvent):boolean");
    }

    public final void d3(boolean z10, boolean z11) {
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
            jg.v2 v2Var = this.p5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v2Var.setVisibility(i11);
            this.p5.setAlpha(this.P0.getAlpha());
            this.f33598s5.animate().setListener(null).cancel();
            ih.c cVar = this.f33598s5;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            cVar.setVisibility(i12);
            ih.c cVar2 = this.f33598s5;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            cVar2.setAlpha(f11);
        } else if (z10 && this.p5.getTag() == null) {
            this.p5.animate().setListener(null).cancel();
            this.f33598s5.animate().setListener(null).cancel();
            if (this.p5.getVisibility() != 0) {
                this.p5.setVisibility(0);
                this.p5.animate().alpha(1.0f).start();
                this.f33598s5.setVisibility(0);
                this.f33598s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.p5.getTag() != null) {
            this.p5.animate().setListener(null).cancel();
            this.p5.animate().alpha(0.0f).setListener(new eg.m(this.p5)).start();
            this.f33598s5.animate().setListener(null).cancel();
            this.f33598s5.animate().alpha(0.0f).setListener(new eg.m(this.f33598s5)).start();
        }
        jg.v2 v2Var2 = this.p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        v2Var2.setTag(num);
        if (z10 && this.f33607t5.m0 != 1 && !this.f33627v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f33607t5.animate().setListener(null).cancel();
            sr0 sr0Var = this.f33607t5;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            sr0Var.setVisibility(i10);
            sr0 sr0Var2 = this.f33607t5;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            sr0Var2.setAlpha(f10);
        } else if (z12 && this.f33607t5.getTag() == null) {
            this.f33607t5.animate().setListener(null).cancel();
            if (this.f33607t5.getVisibility() != 0) {
                this.f33607t5.setVisibility(0);
            }
            this.f33607t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f33607t5.getTag() != null) {
            this.f33607t5.animate().setListener(null).cancel();
            this.f33607t5.animate().alpha(0.0f).setListener(new eg.m(this.f33607t5)).start();
        }
        sr0 sr0Var3 = this.f33607t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        sr0Var3.setTag(num2);
        if (z10 && this.f33607t5.m0 == 1 && !this.f33627v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        a3(z13, z11);
        jg.v2 v2Var3 = this.p5;
        if (z10 && this.f33607t5.m0 == 1 && this.f33654y5.f41638s0 && !this.f33625v5.f41638s0 && !this.f33635w5.f41638s0) {
            z14 = true;
        } else {
            z14 = false;
        }
        v2Var3.setOutlineVisible(z14);
        if (!z10 || this.f33607t5.m0 != 1 || this.f33625v5.f41638s0 || this.f33635w5.f41638s0) {
            z15 = false;
        }
        if (!z11) {
            this.f33654y5.animate().setListener(null).cancel();
            sr0 sr0Var4 = this.f33654y5;
            if (z15) {
                i13 = 0;
            }
            sr0Var4.setVisibility(i13);
            sr0 sr0Var5 = this.f33654y5;
            if (z15) {
                f12 = 1.0f;
            }
            sr0Var5.setAlpha(f12);
            sr0 sr0Var6 = this.f33654y5;
            if (z15) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            sr0Var6.setScaleX(f7);
            sr0 sr0Var7 = this.f33654y5;
            if (!z15) {
                f13 = 0.8f;
            }
            sr0Var7.setScaleY(f13);
        } else if (z15 && this.f33654y5.getTag() == null) {
            this.f33654y5.animate().setListener(null).cancel();
            if (this.f33654y5.getVisibility() != 0) {
                this.f33654y5.setVisibility(0);
            }
            org.telegram.messenger.z20.m(this.f33654y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.gr.h, 400L);
        } else if (!z15 && this.f33654y5.getTag() != null) {
            this.f33654y5.animate().setListener(null).cancel();
            org.telegram.messenger.z20.m(this.f33654y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new eg.m(this.f33654y5)), org.telegram.ui.Components.gr.h, 400L);
        }
        sr0 sr0Var8 = this.f33654y5;
        if (!z15) {
            num3 = null;
        }
        sr0Var8.setTag(num3);
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void e1() {
        G1();
    }

    public final void e2(ArrayList arrayList, int i10, long j10, long j11, long j12, es0 es0Var) {
        h2((org.telegram.messenger.jj) arrayList.get(i10), null, null, null, arrayList, null, null, i10, es0Var, null, j10, j11, j12, true, null, null);
    }

    public final void e3(boolean z10) {
        Integer num;
        float f7;
        float f10;
        mr0 mr0Var;
        if (!z10 || this.f33596s3.getTag() == null) {
            if (!z10 && this.f33596s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f33596s3.f24576s && ((mr0Var = this.f33479f0) == null || !mr0Var.f31243y || mr0Var.f31241w.isEmpty())) {
                this.f33614u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f33605t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            tq0 tq0Var = this.f33596s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            tq0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33605t3 = animatorSet2;
            tq0 tq0Var2 = this.f33596s3;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tq0Var2, property, f7);
            tq0 tq0Var3 = this.f33596s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tq0Var3, property2, f10);
            tq0 tq0Var4 = this.f33596s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f12 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tq0Var4, property3, f12);
            tq0 tq0Var5 = this.f33596s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f11 = org.telegram.messenger.i0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(tq0Var5, property4, f11));
            this.f33605t3.setDuration(380L);
            this.f33605t3.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f33605t3.addListener(new qq0(this, 1));
            this.f33605t3.start();
        }
    }

    public final int f1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f1(boolean):int");
    }

    public final void f2(ArrayList arrayList, int i10, es0 es0Var) {
        h2(null, null, null, null, null, arrayList, null, i10, es0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void f3(boolean z10, boolean z11) {
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
                this.S7.setTranslationY(org.telegram.messenger.i0.L(58.0f));
            }
            ObjectAnimator objectAnimator = this.A7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.A7.cancel();
            }
            gq0 gq0Var = this.S7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gq0Var, View.TRANSLATION_Y, gq0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.A7.start();
        } else if (!z10 && this.R7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            gq0 gq0Var2 = this.S7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gq0Var2, View.TRANSLATION_Y, gq0Var2.getTranslationY(), org.telegram.messenger.i0.L(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new eg.m(this.R7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.A7.start();
        }
        FrameLayout frameLayout2 = this.R7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.R7.setTranslationY(this.P0.getTranslationY() - (this.U1.getAlpha() * i0.a.d(46.0f, this.U1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.R7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.Q8 = oVar;
        this.S8 = false;
        if (this.f33487g0 != null) {
            ((WindowManager) this.D.getSystemService("window")).addView(this.f33487g0, this.f33461d0);
            this.f33487g0.invalidate();
        }
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            u61Var.z0(null);
            this.F2.A0(null);
            this.F2.h0();
            TextureView textureView = this.B2;
            if (textureView != null) {
                this.F2.A0(textureView);
                return;
            }
            SurfaceView surfaceView = this.C2;
            if (surfaceView != null) {
                this.F2.z0(surfaceView);
            }
        }
    }

    public final ClippingImageView[] g1(gs0 gs0Var) {
        int i10;
        if (!org.telegram.messenger.i0.Q1() && gs0Var != null && gs0Var.f37636m != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i10 + 1];
        clippingImageViewArr[0] = this.f33496h0;
        if (i10 != 0) {
            ClippingImageView clippingImageView = gs0Var.f37636m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(gs0Var.f37637n);
        }
        return clippingImageViewArr;
    }

    public final void g2(TLRPC.FileLocation fileLocation, org.telegram.messenger.ic icVar, yr0 yr0Var) {
        h2(null, fileLocation, icVar, null, null, null, null, 0, yr0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void g3() {
        org.telegram.ui.Components.u61 u61Var;
        if (this.f33584r1 && (u61Var = this.F2) != null && !u61Var.d0()) {
            if (!this.f33582r || this.f33454c2 == 1) {
                this.F2.B0(0.0f);
            }
            this.H2 = false;
            t3();
        }
    }

    public float getAnimationValue() {
        return this.f33536l6;
    }

    public final org.telegram.ui.Components.nc h1() {
        es0 es0Var = this.d;
        if (es0Var != null && es0Var.A()) {
            return this.V1;
        }
        return this.U1;
    }

    public final boolean h2(org.telegram.messenger.jj r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.ic r19, org.telegram.messenger.ic r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.es0 r25, org.telegram.ui.un r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.bs0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h2(org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ic, org.telegram.messenger.ic, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.es0, org.telegram.ui.un, long, long, long, boolean, org.telegram.ui.bs0, java.lang.Integer):boolean");
    }

    public final void h3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h3(int):void");
    }

    @Override
    public final Bitmap i() {
        TextureView textureView = this.R8;
        if (textureView != null && textureView.isAvailable()) {
            return this.R8.getBitmap();
        }
        return null;
    }

    public final Bitmap.CompressFormat i1() {
        if (this.f33454c2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final boolean i2(org.telegram.messenger.jj jjVar, un unVar, long j10, long j11, long j12, yr0 yr0Var) {
        return h2(jjVar, null, null, null, null, null, null, 0, yr0Var, unVar, j10, j11, j12, true, null, null);
    }

    public final void i3(int i10, boolean z10) {
        if (this.T4 != null) {
            r2(false);
            org.telegram.messenger.b8.G(this.T).f(this.T4.F0());
        } else if (this.f33510i5 != null) {
            TLObject d = this.f33521j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                r2(false);
                org.telegram.messenger.b8.G(this.T).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.d30 d30Var = this.l1;
        if (d30Var != null) {
            d30Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        F2(this.P4 + i10, z10, true, false);
        if (U2(this.T4) || T2(this.P4)) {
            this.Y2 = true;
            X1(true);
            C0(0, true);
        }
        A0();
        try {
            b5.d.b(0);
            if (hf.b.e0().h0()) {
                hf.b.e0().l0(o1());
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final int j1(int i10, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f33592s)) {
            measuredHeight = (org.telegram.messenger.i0.f16021n - this.f33595s2.bottom) + org.telegram.messenger.i0.f16026q.y;
            if ((i10 == 0 || i10 == 4 || i10 == 5) && this.f33454c2 != 1 && !z11) {
                measuredHeight += org.telegram.messenger.i0.f16020m;
            }
        } else {
            measuredHeight = this.f33470e0.getMeasuredHeight();
        }
        if ((i10 == 0 && this.f33454c2 == 1) || i10 == 1) {
            return measuredHeight - org.telegram.messenger.i0.L(144.0f);
        }
        if (i10 == 2) {
            return measuredHeight - org.telegram.messenger.i0.L(214.0f);
        }
        if (i10 == 3) {
            return measuredHeight - (this.L1.getAdditionalTop() + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.L1.getAdditionalBottom() + org.telegram.messenger.i0.L(48.0f))));
        }
        return measuredHeight;
    }

    public final void j2(ArrayList arrayList, int i10, int i11, boolean z10, es0 es0Var, un unVar) {
        boolean z11;
        org.telegram.ui.Components.f6 f6Var;
        this.f33498h2 = z10;
        bi.f2 f2Var = this.S0;
        int i12 = 0;
        if (f2Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f2Var.getLayoutParams();
            if (i11 != 4 && i11 != 5) {
                if (i11 != 13 && i11 != 14 && i11 != 1 && i11 != 3 && i11 != 10 && i11 != 11) {
                    this.S0.setResourceId(2131232691);
                    layoutParams.bottomMargin = org.telegram.messenger.i0.L(1.0f);
                } else {
                    this.S0.setResourceId(2131231195);
                    this.S0.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = org.telegram.messenger.i0.L(1.0f);
                }
            } else {
                this.S0.setResourceId(2131232691);
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(1.0f);
            }
            this.S0.setLayoutParams(layoutParams);
        }
        if (i11 != 11 && this.p5 != null) {
            this.f33627v7 = false;
            ImageView imageView = this.f33453c1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            sr0 sr0Var = this.f33654y5;
            if (sr0Var != null) {
                sr0Var.m(false, false);
            }
            this.p5.b();
            ArrayList arrayList2 = this.f33588r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.e;
        BackgroundDrawable backgroundDrawable = this.L0;
        if (z12 && this.f33454c2 != i11 && i11 == 1) {
            this.f33454c2 = i11;
            this.f33613u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = es0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f33567p1.f();
            this.f33521j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f33478f = true;
            s3(false, false);
            this.f33533l2 = false;
            I0();
            m3(false, false);
            this.f33473e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            V1();
            backgroundDrawable.setAlpha(255);
            this.f33470e0.setAlpha(1.0f);
            c2(null, null, null, null, null, null, arrayList, i10, null);
            H1();
            C2();
        } else if (z12 && this.f33454c2 != i11 && i11 == 11) {
            this.f33454c2 = i11;
            this.f33613u2 = false;
            this.M.c("");
            this.M.a("", false);
            this.d = es0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f33567p1.f();
            this.f33521j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f33478f = true;
            s3(false, false);
            this.f33473e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            V1();
            backgroundDrawable.setAlpha(255);
            this.f33470e0.setAlpha(1.0f);
            c2(null, null, null, null, null, null, arrayList, i10, null);
        } else {
            this.f33454c2 = i11;
            if (i11 == 12) {
                this.f33454c2 = 0;
                this.f33463d2 = true;
            }
            int i13 = this.f33454c2;
            if (i13 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f33481f2 = z11;
            if (i13 == 13 || z11) {
                this.f33454c2 = 0;
                this.f33472e2 = true;
            }
            this.f33432a.a(z11, false);
            if (this.f33454c2 == 11) {
                this.f33514j0.setBackgroundColor(-16777216);
            }
            ds0 ds0Var = this.M;
            if (ds0Var != null && (f6Var = ds0Var.d) != null) {
                if (this.f33472e2) {
                    i12 = 8;
                }
                f6Var.setVisibility(i12);
            }
            h2(null, null, null, null, null, null, arrayList, i10, es0Var, unVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void j3() {
        float f7;
        boolean z10;
        int i10;
        er0 er0Var;
        int i11;
        er0 er0Var2;
        this.q6 = null;
        this.P0.setVisibility(8);
        this.S0.setVisibility(8);
        this.f33548n0.setVisibility(8);
        this.f33471e1.setVisibility(8);
        this.f33480f1.setVisibility(8);
        this.f33488g1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = this.C1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        this.f33558o1.setVisibility(8);
        this.f33558o1.setAlpha(0.0f);
        this.f33558o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        this.O0.setRotationX(0.0f);
        this.f33558o1.setEnabled(false);
        this.K = false;
        if (this.f33507i2) {
            this.Q1.setVisibility(4);
        }
        int i12 = this.f33454c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && this.f33494g7.size() > 1)) {
            this.N0.setVisibility(8);
            this.O0.setVisibility(8);
            v3();
        }
        Z2(false, true);
        d3(false, true);
        Bitmap n10 = this.C4.n();
        float f10 = this.f33438a6;
        if (this.f33454c2 == 11) {
            this.f33511i6 = this.Y5;
            this.f33502h6 = this.X5;
            this.f33520j6 = f10;
            this.f33529k6 = this.f33448b6;
            this.f33485f6 = 0.0f;
        }
        xr0 xr0Var = this.X4;
        if (n10 != null) {
            int q6 = this.C4.q();
            int o10 = this.C4.o();
            if (this.f33454c2 == 1) {
                float L = org.telegram.messenger.i0.L(12.0f);
                this.f33467d6 = L;
                f7 = 0.0f;
                if (this.L1 != null) {
                    this.f33467d6 = (er0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i13 = this.D1.f6546i;
                if (i13 == 90 || i13 == 270) {
                    i11 = q6;
                    q6 = o10;
                    float f11 = q6;
                    float f12 = i11;
                    this.f33476e6 = u2(false) * (Math.min(m1(3) / f11, j1(3, false) / f12) / Math.min(m1(this.f33615u4) / f11, k1() / f12));
                    Rect rect = this.f33595s2;
                    this.f33458c6 = (rect.left / 2) - (rect.right / 2);
                    this.f33554n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = o10;
                float f112 = q6;
                float f122 = i11;
                this.f33476e6 = u2(false) * (Math.min(m1(3) / f112, j1(3, false) / f122) / Math.min(m1(this.f33615u4) / f112, k1() / f122));
                Rect rect2 = this.f33595s2;
                this.f33458c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f33554n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f7 = 0.0f;
                int i14 = -org.telegram.messenger.i0.L(44.0f);
                if (!this.f33592s) {
                    i10 = org.telegram.messenger.i0.f16020m / 2;
                } else {
                    i10 = 0;
                }
                float f13 = i14 + i10;
                this.f33467d6 = f13;
                if (this.L1 != null) {
                    float additionalTop = (er0Var.getAdditionalTop() / 2.0f) + f13;
                    this.f33467d6 = additionalTop;
                    this.f33467d6 = additionalTop - (this.L1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.ye yeVar = xr0Var.f43638c;
                if (yeVar != null) {
                    int i15 = yeVar.f19370k;
                    if (i15 == 90 || i15 == 270) {
                        o10 = q6;
                        q6 = o10;
                    }
                    q6 = (int) (q6 * yeVar.e);
                    i11 = (int) (o10 * yeVar.f19367f);
                    float f1122 = q6;
                    float f1222 = i11;
                    this.f33476e6 = u2(false) * (Math.min(m1(3) / f1122, j1(3, false) / f1222) / Math.min(m1(this.f33615u4) / f1122, k1() / f1222));
                    Rect rect22 = this.f33595s2;
                    this.f33458c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f33554n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i11 = o10;
                float f11222 = q6;
                float f12222 = i11;
                this.f33476e6 = u2(false) * (Math.min(m1(3) / f11222, j1(3, false) / f12222) / Math.min(m1(this.f33615u4) / f11222, k1() / f12222));
                Rect rect222 = this.f33595s2;
                this.f33458c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f33554n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f7 = 0.0f;
        }
        er0 er0Var3 = this.L1;
        if (er0Var3 != null) {
            if (this.f33454c2 == 11 && (xr0Var == null || xr0Var.f43638c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            er0Var3.setDrawShadow(z10);
        }
        this.f33487g0.setClipChildren(true);
        this.f33514j0.setVisibility(4);
        this.f33571p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.i0.L(126.0f), f7);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.i0.L(12.0f), f7);
        ofFloat.addUpdateListener(new po0(this, 6));
        ofFloat2.addUpdateListener(new po0(this, 7));
        this.f33571p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.L1.m0(true);
        this.f33571p6.setDuration(200L);
        this.f33571p6.addListener(new qq0(this, 3));
        this.f33571p6.start();
    }

    public final void k0(float f7, float f10, float f11, boolean z10) {
        if (this.f33438a6 == f7 && this.X5 == f10 && this.Y5 == f11) {
            return;
        }
        this.R6 = z10;
        this.f33476e6 = f7;
        this.f33458c6 = f10;
        this.f33467d6 = f11;
        this.f33554n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33571p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.i6.f26891g, 0.0f, 1.0f));
        this.f33571p6.setInterpolator(this.f33608t6);
        this.f33571p6.setDuration(250);
        this.f33571p6.addListener(new qq0(this, 7));
        this.f33571p6.start();
    }

    public final int k1() {
        return j1(this.f33615u4, false);
    }

    public final void k2() {
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            u61Var.g0();
            return;
        }
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null) {
            mr0Var.f();
        }
    }

    public final void k3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k3():void");
    }

    @Override
    public final void l(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    public final CharSequence l0() {
        int i10;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (U1() && this.d != null && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f33494g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = h1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f33572p7 && !TextUtils.equals(this.f33580q7, text) && this.d.S(this.P4) != 0 && this.d.H() > 0) {
                    this.f33572p7 = false;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.T);
                un unVar = this.l4;
                if (unVar != null && ((encryptedChat = unVar.h) == null || org.telegram.messenger.i0.X0(encryptedChat.layer) >= 101)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList W = b02.W(charSequenceArr, z10, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f33580q7 = charSequence;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    efVar.f19506a = charSequence;
                    efVar.f19516n = W;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    hfVar.I = charSequence;
                    hfVar.f19516n = W;
                }
                if (text.length() != 0 && !this.d.x(this.P4)) {
                    P2();
                }
                es0 es0Var = this.d;
                if (es0Var != null) {
                    es0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int l1() {
        return m1(this.f33615u4);
    }

    public final void l2() {
        jf.f fVar = this.G2;
        if (fVar != null) {
            fVar.b(true);
        }
        if (org.telegram.ui.Components.jf0.k() != null) {
            org.telegram.ui.Components.jf0.k().b(true);
        }
    }

    public final void l3() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        c6.q e;
        c6.q e7;
        float f7;
        int i10;
        c6.q e10;
        boolean z10;
        if (!U1()) {
            return;
        }
        this.O8 = true;
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            if (!b5.d.u() && !this.f33582r) {
                z10 = false;
            } else {
                z10 = true;
            }
            u61Var.t0(z10);
        }
        if (this.F2 != null && b5.d.u() && ((atomicInteger = b5.d.f2489b) == null || atomicInteger.get() <= 0)) {
            e6.h e11 = b5.d.e();
            if (e11 == null) {
                a2 = -1;
            } else {
                a2 = e11.a();
            }
            if (a2 >= 0 && Math.abs(this.F2.S() - a2) > 1000) {
                this.F2.p0(a2);
            }
            e6.h e12 = b5.d.e();
            if (e12 == null) {
                m10 = false;
            } else if (b5.d.f2488a == 0) {
                m10 = !e12.l();
            } else {
                m10 = e12.m();
            }
            if (m10) {
                this.F2.h0();
            } else {
                this.F2.g0();
            }
            if (this.E != null) {
                float g10 = b5.d.g();
                e6.h e13 = b5.d.e();
                float f10 = 0.5f;
                if (e13 == null || (e7 = e13.e()) == null) {
                    f7 = 0.5f;
                } else {
                    f7 = (float) e7.f3926r;
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
                        f10 = (float) e10.f3926r;
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
            E0(true, false, f12);
        }
        vr vrVar = this.f33630w0;
        if (vrVar != null) {
            vrVar.a(b5.d.u());
        }
        this.O8 = false;
    }

    @Override
    public final Bitmap m() {
        TextureView textureView = this.B2;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (this.D2 && Build.VERSION.SDK_INT >= 24) {
            int width = this.C2.getWidth();
            int height = this.C2.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap b10 = org.telegram.messenger.js.b(width, height);
            org.telegram.messenger.i0.z0(this.C2, b10);
            return b10;
        }
        return null;
    }

    public final void m0(Canvas canvas, int i10, int i11, int i12, int i13, float f7, eg.g gVar, org.telegram.messenger.ye yeVar) {
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
        int i18 = gVar.f6546i;
        if (i18 != 90 && i18 != 270) {
            i17 = i16;
            i16 = i17;
        }
        int i19 = this.f33454c2;
        if (i19 != 1 && (this.f33615u4 == 3 || this.f33563o6 == 3)) {
            f11 = 1.0f;
            f10 = f17;
        } else if (this.f33571p6 != null && (i14 = this.f33563o6) != -1) {
            int i20 = this.f33615u4;
            f10 = f17;
            if (i20 != 1 && i14 != 1 && ((i20 != 2 && i20 != 3) || i14 != -1)) {
                if (i14 == 0) {
                    f11 = this.f33536l6;
                } else {
                    f11 = 1.0f - this.f33536l6;
                }
            }
            f11 = 1.0f;
        } else {
            f10 = f17;
            int i21 = this.f33615u4;
            if (i21 == 2 || i21 == 3) {
                f11 = 0.0f;
            }
            f11 = 1.0f;
        }
        float f22 = gVar.f6547j;
        float f23 = gVar.f6548k;
        float f24 = i17;
        float f25 = 1.0f - f11;
        int C = (int) c3.i0.C(1.0f - f22, f25, f22, f24);
        float f26 = i16;
        int i22 = (int) ((((1.0f - f23) * f25) + f23) * f26);
        float f27 = C;
        float f28 = f16 / f27;
        float f29 = i22;
        if (f28 * f29 > f19) {
            f28 = f19 / f29;
        }
        if (i19 != 1 && ((this.f33615u4 != 1 || this.f33563o6 == 0) && yeVar != null)) {
            float f30 = f27 * f28;
            float f31 = f29 * f28;
            if (f18 * f20 <= f19) {
                f21 = f18;
            }
            float z10 = c3.i0.z((f10 * f21) / f7, f30, f25, f30);
            float z11 = c3.i0.z((f20 * f21) / f7, f31, f25, f31);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        int i23 = this.f33454c2;
        if (i23 == 1 || gVar.f6541a) {
            int i24 = this.f33615u4;
            if (i24 != 1 && i23 != 1) {
                if (yeVar != null) {
                    f14 = yeVar.f19366c;
                    f15 = 1.0f;
                } else {
                    f14 = 1.0f;
                    f15 = 1.0f;
                }
                f12 = ((f28 / min) / c3.i0.z(f14, f15, f25, f15)) * f14;
            } else {
                float z12 = gVar.f6544f / c3.i0.z(gVar.f6549l, 1.0f, f25, 1.0f);
                float f32 = f16 / f24;
                if (f32 * f26 > f19) {
                    f32 = f19 / f26;
                }
                float f33 = (f32 / min) * z12;
                if (i23 == 1) {
                    if (i24 != 3 && (i15 = this.f33563o6) != 3) {
                        if (i15 == 0) {
                            f13 = gVar.f6550m;
                        }
                    } else {
                        f13 = ((gVar.f6550m - 1.0f) * f25) + 1.0f;
                    }
                    f33 /= f13;
                }
                f12 = f33;
            }
            float f34 = f12;
            canvas.translate(gVar.d * f11, gVar.e * f11);
            canvas.scale(f34, f34);
            canvas.translate(c3.i0.E(gVar.f6542b, f24, min, f11), c3.i0.E(gVar.f6543c, f26, min, f11));
            float f35 = gVar.f6545g + i18;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            if (this.f33454c2 == 1 && (this.f33615u4 == 3 || this.f33563o6 == 3)) {
                canvas.rotate(f35);
            } else {
                canvas.rotate(f35 * f11);
            }
        }
        int[] iArr = this.N7;
        iArr[0] = C;
        iArr[1] = i22;
    }

    public final int m1(int i10) {
        int L;
        int width = this.f33470e0.getWidth();
        if (i10 != 1 && (i10 != 0 || this.f33454c2 != 1)) {
            if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 3) {
                L = org.telegram.messenger.i0.L(28.0f);
            } else {
                return width;
            }
        } else {
            L = org.telegram.messenger.i0.L(32.0f);
        }
        return width - L;
    }

    public final void m2() {
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            u61Var.h0();
            return;
        }
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null) {
            mr0Var.g();
        }
    }

    public final void m3(boolean z10, boolean z11) {
        n3(z10, z11, qr0.e);
    }

    @Override
    public final void n(Canvas canvas) {
        this.T8 = true;
        this.f33487g0.draw(canvas);
        this.T8 = false;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n0():void");
    }

    public final float n1(boolean z10) {
        int q6;
        int o10;
        int i10;
        ImageReceiver imageReceiver = this.C4;
        if (z10) {
            q6 = imageReceiver.o();
        } else {
            q6 = imageReceiver.q();
        }
        if (z10) {
            o10 = this.C4.q();
        } else {
            o10 = this.C4.o();
        }
        if (!this.f33592s) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        float min = Math.min(this.C1.getMeasuredWidth(), (this.C1.getMeasuredHeight() - org.telegram.messenger.i0.L(64.0f)) - i10) - (org.telegram.messenger.i0.L(16.0f) * 2);
        return Math.max(min / q6, min / o10);
    }

    public final void n3(boolean r17, boolean r18, org.telegram.ui.qr0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.n3(boolean, boolean, org.telegram.ui.qr0):void");
    }

    public final void o0(android.graphics.Bitmap r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o0(android.graphics.Bitmap):void");
    }

    public final bi.j4 o1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o1():bi.j4");
    }

    public final void o2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.ff r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.ff, boolean, long):void");
    }

    public final void o3(boolean z10) {
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
        float N = org.telegram.messenger.i0.N(24.0f);
        jg.b1 b1Var = this.P0;
        Property property = View.ALPHA;
        float f17 = 1.0f;
        float f18 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(b1Var, property, f7));
        jg.b1 b1Var2 = this.P0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(b1Var2, property2, f10));
        jg.v2 v2Var = this.p5;
        if (v2Var != null) {
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(v2Var, property, f16));
        }
        if (this.p5 != null) {
            ih.c cVar = this.f33598s5;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(cVar, property, f15));
        }
        bi.f2 f2Var = this.S0;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(f2Var, property, f11));
        bi.f2 f2Var2 = this.S0;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(f2Var2, property2, f12));
        int i10 = this.f33454c2;
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
                f14 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f14));
            CounterView counterView = this.O0;
            if (!z10) {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f17));
            CounterView counterView2 = this.O0;
            if (!z10) {
                f18 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f18));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z10 && K1()) {
            F0(true);
            vh.f fVar = this.U1.f51340f;
            if (fVar.e) {
                fVar.k(true);
            }
            vh.f fVar2 = this.V1.f51340f;
            if (fVar2.e) {
                fVar2.k(true);
            }
            this.U1.f51340f.d();
            this.V1.f51340f.d();
        }
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.N0.getVisibility() != 0) {
            boolean[] zArr = this.f33631w1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f33470e0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.K()) {
                        zArr[0] = true;
                        this.f33470e0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f33470e0.getMeasuredWidth() - min && this.D4.K()) {
                    zArr[1] = true;
                    this.f33470e0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f33438a6 != 1.0f && this.f33454c2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f7), Math.round(f10), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f33470e0.postInvalidate();
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
        org.telegram.messenger.ye yeVar;
        if (this.f33571p6 != null) {
            f13 = org.telegram.messenger.i0.T1(0.0f, this.f33493g6, this.f33536l6);
            f7 = org.telegram.messenger.i0.T1(this.f33438a6, this.f33476e6, this.f33536l6);
            f10 = org.telegram.messenger.i0.T1(this.f33448b6, this.f33485f6, this.f33536l6);
            f11 = org.telegram.messenger.i0.T1(this.Y5, this.f33467d6, this.f33536l6);
            f12 = org.telegram.messenger.i0.T1(this.X5, this.f33458c6, this.f33536l6);
        } else {
            f7 = this.f33438a6;
            f10 = this.f33448b6;
            f11 = this.Y5;
            f12 = this.X5;
            if (this.f33554n6 != 0) {
                f12 = this.f33458c6;
                f11 = this.f33467d6;
                f7 = this.f33476e6;
            }
            f13 = 0.0f;
        }
        int m12 = m1(this.f33615u4);
        int k12 = k1();
        canvas.translate(c1(this.f33615u4), d1(this.f33615u4));
        canvas.translate(f12, f11 + 0.0f);
        canvas.scale(f7, f7);
        canvas.rotate(f10);
        int q6 = this.C4.q();
        int o10 = this.C4.o();
        float f18 = m12;
        float f19 = q6;
        float f20 = f18 / f19;
        float f21 = k12;
        float f22 = o10;
        float f23 = f21 / f22;
        float min = Math.min(f20, f23);
        eg.g gVar = this.D1;
        int i10 = gVar.f6546i;
        if (i10 != 90 && i10 != 270) {
            o10 = q6;
            q6 = o10;
        }
        float f24 = gVar.f6547j;
        float f25 = gVar.f6548k;
        float f26 = o10;
        float f27 = q6;
        float f28 = f7;
        float f29 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
        float f30 = f18 / f29;
        float f31 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        if (f30 * f31 > f21) {
            f30 = f21 / f31;
        }
        int i11 = this.f33454c2;
        float f32 = f30;
        xr0 xr0Var = this.X4;
        if (i11 != 1 && ((this.f33615u4 != 1 || this.f33563o6 == 0) && xr0Var.f43638c != null)) {
            float f33 = f29 * f32;
            float f34 = f31 * f32;
            if (f20 * f22 > f21) {
                f20 = f23;
            }
            float z10 = c3.i0.z((f19 * f20) / f28, f33, 0.0f, f33);
            float z11 = c3.i0.z((f22 * f20) / f28, f34, 0.0f, f34);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.f33454c2 == 1 || gVar.f6541a) {
            TextureView textureView = this.B2;
            if (textureView != null) {
                org.telegram.messenger.ye yeVar2 = xr0Var.f43638c;
                if (yeVar2 != null && yeVar2.f19371l) {
                    f16 = -1.0f;
                } else {
                    f16 = 1.0f;
                }
                textureView.setScaleX(f16);
                zr0 zr0Var = this.E2;
                if (zr0Var != null) {
                    zr0Var.setScaleX(this.B2.getScaleX());
                }
            }
            org.telegram.messenger.ye yeVar3 = xr0Var.f43638c;
            if (yeVar3 != null) {
                f14 = yeVar3.f19366c;
                f15 = 1.0f;
            } else {
                f14 = 1.0f;
                f15 = 1.0f;
            }
            float z12 = ((f32 / min) / c3.i0.z(f14, f15, 0.0f, f15)) * f14;
            canvas.translate(gVar.d * f15, gVar.e * f15);
            canvas.scale(z12, z12);
            canvas.translate(c3.i0.E(gVar.f6542b, f26, min, f15), c3.i0.E(gVar.f6543c, f27, min, f15));
            float f35 = gVar.f6545g + i10;
            if (f35 > 180.0f) {
                f35 -= 360.0f;
            }
            canvas.rotate(f35);
        }
        if (!this.f33494g7.isEmpty() && (yeVar = xr0Var.f43638c) != null && yeVar.f19371l) {
            f17 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f17 = 1.0f;
        }
        if (f13 > 0.0f) {
            canvas.scale(f17 - (2.0f * f13), f17);
            canvas.skew(0.0f, org.telegram.messenger.m5.A(f17, f13, 4.0f * f13, 0.25f));
        }
    }

    public final org.telegram.messenger.x20 p1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.p1():org.telegram.messenger.x20");
    }

    public final void p2() {
        jg.v2 v2Var = this.p5;
        if (v2Var != null && this.f33454c2 == 11) {
            if (this.f33627v7) {
                v2Var.b();
            } else {
                v2Var.m(this.C4.n(), this.C4.U, m1(this.f33615u4), k1(), new wo0(this, 0));
            }
        }
    }

    public final void p3(boolean z10, boolean z11) {
        float f7;
        qo0 qo0Var = this.f33649y;
        org.telegram.messenger.i0.r(qo0Var);
        int i10 = 0;
        if (z11) {
            q3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f33639x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f33639x = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    q3(true);
                    return;
                }
                org.telegram.messenger.i0.h3(qo0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f33639x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                q3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f33639x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f33639x = null;
        }
        id idVar = this.X0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        idVar.setAlpha(f7);
        id idVar2 = this.X0;
        if (!z10) {
            i10 = 4;
        }
        idVar2.setVisibility(i10);
    }

    @Override
    public final boolean q() {
        org.telegram.ui.ActionBar.b1 b1Var = this.f33620v0;
        if (b1Var != null && b1Var.isEnabled() && this.P3) {
            return true;
        }
        return false;
    }

    public final Size q0() {
        float f7;
        int i10;
        int round;
        int i11;
        if (this.Z7 == 1) {
            return new Size(this.f33460c8, this.f33469d8);
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
        if (this.f33460c8 > this.f33469d8) {
            i10 = this.f33460c8;
        } else {
            i10 = this.f33469d8;
        }
        float f10 = f7 / i10;
        if (this.Y7 == this.Z7 - 1 && f10 >= 1.0f) {
            i11 = this.f33460c8;
            round = this.f33469d8;
        } else {
            int round2 = Math.round((this.f33460c8 * f10) / 2.0f) * 2;
            round = Math.round((this.f33469d8 * f10) / 2.0f) * 2;
            i11 = round2;
        }
        int i13 = i11 % 4;
        if (i13 != 0 || round % 4 != 0) {
            i11 = (i11 - i13) - (round % 4);
        }
        return new Size(i11, round);
    }

    public final long q1() {
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null && mr0Var.f31243y) {
            return mr0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.S();
    }

    public final void q2(String str, long j10, boolean z10, float f7, float f10, int i10, long j11) {
        boolean z11;
        int parseInt;
        if (this.f33648x8 != null) {
            Utilities.e.a(this.f33648x8);
            this.f33648x8 = null;
        }
        gq0 gq0Var = this.S7;
        gq0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        gq0Var.D = mediaMetadataRetriever;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        gq0Var.f26005x = z11;
        gq0Var.d = f7;
        gq0Var.e = f10;
        float f11 = gq0Var.f26003s;
        if (f11 < f7) {
            gq0Var.f26003s = f7;
        } else if (f11 > f10) {
            gq0Var.f26003s = f10;
        }
        try {
            if (i11 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                gq0Var.f26006y = open;
                gq0Var.D.setDataSource(open.getFileDescriptor(), j10, file.length() - j10);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = gq0Var.D.extractMetadata(9);
            if (extractMetadata != null) {
                gq0Var.f25992a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = gq0Var.D.extractMetadata(18);
            if (extractMetadata2 != null) {
                gq0Var.f25994b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = gq0Var.D.extractMetadata(19);
            if (extractMetadata3 != null) {
                gq0Var.f25996c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = gq0Var.D.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i12 = gq0Var.f25994b;
                gq0Var.f25994b = gq0Var.f25996c;
                gq0Var.f25996c = i12;
            }
            if (gq0Var.f26005x) {
                gq0Var.f26000f = (float) ((j11 / 1000.0d) / gq0Var.f25992a);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        gq0Var.invalidate();
        this.f33657y8 = null;
        if (!z10 && this.f33454c2 != 1) {
            z12 = false;
        }
        this.f33582r = z12;
        this.Z7 = -1;
        this.f33450b8 = 0;
        this.f33522j8 = 25;
        this.f33619u8 = new File(str).length();
        org.telegram.messenger.r5 r5Var = Utilities.e;
        nr0 nr0Var = new nr0(this, str, j10, i10);
        this.f33648x8 = nr0Var;
        r5Var.c(nr0Var);
    }

    public final void q3(boolean z10) {
        float f7;
        if (z10) {
            this.X0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33639x = animatorSet;
        id idVar = this.X0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(idVar, property, f7));
        this.f33639x.setDuration(200L);
        this.f33639x.addListener(new xq0(this, z10, 1));
        this.f33639x.start();
    }

    @Override
    public final View r() {
        TextureView textureView = new TextureView(this.D);
        this.R8 = textureView;
        textureView.setOpaque(false);
        View view = this.P8;
        if (view != null) {
            view.bringToFront();
        }
        return this.R8;
    }

    public final boolean r0(MotionEvent motionEvent) {
        boolean z10;
        mr0 mr0Var;
        if (this.F2 != null || ((mr0Var = this.f33479f0) != null && mr0Var.f31243y)) {
            if (motionEvent.getX() >= (m1(this.f33615u4) / 3) * 2) {
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

    public final TLObject r1(int i10, long[] jArr) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.e7;
        if (!arrayList.isEmpty()) {
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.pw) arrayList.get(i10)).f17489b.size;
            }
            return (TLObject) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.f33439a7;
        if (!arrayList2.isEmpty()) {
            if (i10 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f33459c7;
                if (arrayList3.get(i10) != null) {
                    jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                }
            }
            ArrayList arrayList4 = this.f33449b7;
            if (arrayList4.get(i10) == null) {
                return null;
            }
            return ((org.telegram.messenger.ic) arrayList4.get(i10)).f16100f;
        }
        ArrayList arrayList5 = this.Y6;
        if (arrayList5.isEmpty() || i10 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList5.get(i10);
        TLRPC.Message message = jjVar.f16337k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(false), false, null, false);
            if (w9 != null) {
                if (jArr != null) {
                    long j10 = w9.size;
                    jArr[0] = j10;
                    if (j10 == 0) {
                        jArr[0] = -1;
                    }
                }
                return w9;
            } else if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = jjVar.Y0;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j11 = w10.size;
                        jArr[0] = j11;
                        if (j11 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w10;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, true);
                    if (w11 != null) {
                        if (jArr != null) {
                            long j12 = w11.size;
                            jArr[0] = j12;
                            if (j12 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return w11;
                    } else if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.jj.o1(jjVar.f16337k).photo != null) || ((org.telegram.messenger.jj.o1(jjVar.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(jjVar.f16337k).webpage != null)) {
                TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(true), false, null, true);
                if (w12 != null) {
                    if (jArr != null) {
                        long j13 = w12.size;
                        jArr[0] = j13;
                        if (j13 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w12;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (org.telegram.messenger.jj.o1(jjVar.f16337k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.jj.o1(jjVar.f16337k)).photo;
            } else {
                if (jjVar.F0() != null && org.telegram.messenger.jj.W2(jjVar.F0())) {
                    TLRPC.PhotoSize w13 = org.telegram.messenger.b8.w(jjVar.F0().thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j14 = w13.size;
                        jArr[0] = j14;
                        if (j14 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w13;
                }
            }
        }
        return null;
    }

    public final void r2(boolean z10) {
        int i10 = 0;
        this.D2 = false;
        jf.f fVar = this.G2;
        if (fVar != null) {
            fVar.c();
            this.G2 = null;
        }
        org.telegram.ui.Components.u61 u61Var = this.F2;
        HashMap hashMap = W8;
        iq0 iq0Var = this.f33642x2;
        if (u61Var != null) {
            v0();
            org.telegram.messenger.i0.r(this.f33632w2);
            org.telegram.messenger.i0.r(iq0Var);
            if (this.f33455c3 != null) {
                float S = ((float) this.F2.S()) / ((float) this.F2.U());
                String str = this.f33455c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new js0(S));
                org.telegram.messenger.jj jjVar = this.T4;
                if (jjVar != null) {
                    jjVar.f16325g3 = Float.valueOf(S);
                }
            }
            this.F2.m0();
            this.F2 = null;
        } else {
            this.X2 = false;
        }
        if (this.f33479f0 != null) {
            org.telegram.messenger.i0.r(iq0Var);
            if (this.f33455c3 != null) {
                float q12 = ((float) q1()) / ((float) C1());
                String str2 = this.f33455c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new js0(q12));
                org.telegram.messenger.jj jjVar2 = this.T4;
                if (jjVar2 != null) {
                    jjVar2.f16325g3 = Float.valueOf(q12);
                }
            }
        }
        org.telegram.ui.Components.fu fuVar = this.W3;
        if (fuVar != null) {
            fuVar.disable();
            this.W3 = null;
        }
        this.f33596s3.a();
        p3(false, false);
        this.f33585r2 = false;
        this.U2 = false;
        if (this.f33620v0.isEnabled()) {
            this.f33620v0.setEnabled(false);
            this.f33620v0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f33499h3) {
            try {
                this.D.getWindow().clearFlags(128);
                this.f33499h3 = false;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        org.telegram.ui.Components.af0 af0Var = this.f33652y2;
        if (af0Var != null) {
            try {
                this.f33470e0.removeView(af0Var);
            } catch (Throwable unused) {
            }
            this.f33652y2 = null;
        }
        t0();
        this.f33660z2 = null;
        TextureView textureView = this.B2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.k61) {
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) textureView;
                org.telegram.ui.Components.gz gzVar = k61Var.f27647b;
                if (gzVar != null) {
                    gzVar.postRunnable(new org.telegram.ui.Components.dz(gzVar, 0));
                }
                k61Var.f27646a = null;
            }
            this.B2 = null;
        }
        this.f33442b0.e();
        if (this.C2 != null) {
            this.C2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            org.telegram.messenger.i0.r(this.f33500h4);
        }
        if (!z10 && !this.B8 && !this.C8) {
            S2(false, true);
        }
        fq0 fq0Var = this.W0[0];
        while (true) {
            float[] fArr = fq0Var.f37328n;
            if (i10 < fArr.length) {
                fq0Var.f37327m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                fq0Var.a();
                return;
            }
        }
    }

    public final void r3(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = org.telegram.messenger.i0.N(24.0f);
        int i10 = this.f33454c2;
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
                f10 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f10));
            CounterView counterView = this.O0;
            if (!z10) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f11));
            CounterView counterView2 = this.O0;
            if (!z10) {
                f12 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f12));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final boolean s0() {
        un unVar = this.l4;
        if (unVar != null) {
            if (unVar.f42243f == null) {
                TLRPC.Chat chat = unVar.e;
                if (chat != null && !org.telegram.messenger.w3.r0(chat)) {
                    if (org.telegram.messenger.w3.p(this.l4.e) || org.telegram.messenger.w3.u(this.l4.e)) {
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

    public final void s2(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f33657y8 != null) {
            MediaController.B().i(this.f33657y8);
        }
        if (this.C8 && !this.f33666z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C8 = false;
        this.A8 = false;
        this.Q7.setVisibility(4);
        if (i10 == 1) {
            if (this.f33486f8 == this.f33469d8 && this.f33477e8 == this.f33460c8) {
                this.f33666z8 = false;
                fq0 fq0Var = this.W0[0];
                if (fq0Var.h != 0 && fq0Var.f37325k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fq0Var.f(z12, 0.0f);
                this.W0[0].d(3, false, true);
                if (!z10) {
                    o2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.F2.p0(this.S7.getLeftProgress() * this.f33513i8);
                } else {
                    this.A8 = true;
                }
            } else {
                r2(false);
                if (this.f33657y8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f19814id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(org.telegram.messenger.d20.f15147s0, tL_message, false, false);
                    this.f33657y8 = jjVar;
                    jjVar.f16337k.attachPath = new File(org.telegram.messenger.b8.z(4), "video_preview.mp4").getAbsolutePath();
                    this.f33657y8.f16356p0 = new org.telegram.messenger.x20();
                    org.telegram.messenger.x20 x20Var = this.f33657y8.f16356p0;
                    x20Var.f19189g = this.f33450b8;
                    x20Var.h = this.f33460c8;
                    this.f33657y8.f16356p0.f19190i = this.f33469d8;
                    org.telegram.messenger.x20 x20Var2 = this.f33657y8.f16356p0;
                    x20Var2.f19195n = this.f33522j8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        x20Var2.f19196o = uri.getPath();
                    } else {
                        x20Var2.f19196o = uri.getPath();
                    }
                }
                org.telegram.messenger.x20 x20Var3 = this.f33657y8.f16356p0;
                long j10 = this.f33546m8;
                x20Var3.f19183a = j10;
                long j11 = this.f33556n8;
                x20Var3.f19185b = j11;
                if (j10 == -1) {
                    j10 = 0;
                }
                if (j11 == -1) {
                    j11 = this.f33513i8 * 1000.0f;
                }
                if (j11 - j10 > 5000000) {
                    x20Var3.f19185b = j10 + 5000000;
                }
                x20Var3.f19194m = this.f33495g8;
                this.f33657y8.f16356p0.f19192k = this.f33477e8;
                this.f33657y8.f16356p0.f19193l = this.f33486f8;
                org.telegram.messenger.x20 x20Var4 = this.f33657y8.f16356p0;
                x20Var4.Y = true;
                x20Var4.v = this.f33513i8 * 1000.0f;
                if (!MediaController.B().h0(this.f33657y8, true, true, true)) {
                    this.f33666z8 = true;
                }
                this.C8 = true;
                fq0 fq0Var2 = this.W0[0];
                if (fq0Var2.h != 0 && fq0Var2.f37325k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                fq0Var2.f(z11, 0.0f);
                this.W0[0].d(0, false, true);
            }
        } else {
            this.f33666z8 = false;
            this.W0[0].d(3, false, true);
            if (i10 == 2) {
                o2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.F2.p0(this.S7.getLeftProgress() * this.f33513i8);
            }
        }
        this.f33470e0.invalidate();
    }

    public final void s3(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (z10 != this.K) {
            if (z10) {
                this.f33558o1.setVisibility(0);
            }
            this.K = z10;
            this.f33558o1.setEnabled(z10);
            float f13 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                ls0 ls0Var = this.f33558o1;
                Property property = View.ALPHA;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ls0Var, property, f11));
                ls0 ls0Var2 = this.f33558o1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = -org.telegram.messenger.i0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ls0Var2, property2, f12));
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
                    this.B1.addListener(new qq0(this, 4));
                }
                this.B1.setDuration(200L);
                this.B1.start();
                return;
            }
            ls0 ls0Var3 = this.f33558o1;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ls0Var3.setAlpha(f7);
            ls0 ls0Var4 = this.f33558o1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -org.telegram.messenger.i0.L(10.0f);
            }
            ls0Var4.setTranslationY(f10);
            CounterView counterView2 = this.O0;
            if (!z10) {
                f13 = 0.0f;
            }
            counterView2.setRotationX(f13);
            if (!z10) {
                this.f33558o1.setVisibility(8);
            }
        }
    }

    public void setAnimationValue(float f7) {
        this.f33536l6 = f7;
        this.f33470e0.invalidate();
        I1();
    }

    public final void t0() {
        AnimatorSet animatorSet;
        View view = this.f33660z2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.f33660z2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.A2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A2 = null;
        }
        org.telegram.ui.Components.be0 be0Var = this.C1;
        if (be0Var != null && (animatorSet = be0Var.f24620s) != null) {
            animatorSet.cancel();
            be0Var.f24620s = null;
            be0Var.f24617f = false;
        }
    }

    public final String t1(int i10) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w9;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        if (i10 >= 0) {
            ArrayList arrayList = this.e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    org.telegram.messenger.pw pwVar = (org.telegram.messenger.pw) arrayList.get(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(pwVar.f17489b.dc_id);
                    sb2.append("_");
                    return a1.g.q(sb2, pwVar.f17489b.f19930id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.f33439a7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Y6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f33494g7;
                    if (!arrayList4.isEmpty()) {
                        if (i10 < arrayList4.size()) {
                            Object obj = arrayList4.get(i10);
                            if (obj instanceof org.telegram.messenger.hf) {
                                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                                TLRPC.PhotoSize photoSize = hfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.b8.r(null, photoSize);
                                }
                                TLRPC.Document document = hfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.b8.r(null, document);
                                }
                                return Utilities.a(hfVar.C) + "." + org.telegram.messenger.hc.B(hfVar.C, "jpg");
                            } else if (obj instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                                TLRPC.Document document2 = botInlineResult.document;
                                if (document2 != null) {
                                    return org.telegram.messenger.b8.r(null, document2);
                                }
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    return org.telegram.messenger.b8.r(null, org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false));
                                }
                                if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(Utilities.a(botInlineResult.content.url));
                                    sb3.append(".");
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    sb3.append(org.telegram.messenger.hc.B(webDocument2.url, org.telegram.messenger.b8.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        bs0 bs0Var = this.f33521j7;
                        if (bs0Var != null) {
                            return bs0Var.c(i10);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList2.get(i10);
                        org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) this.f33449b7.get(i10);
                        if (icVar != null) {
                            if (icVar2 != null && icVar2 != icVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(icVar2.f16100f.volume_id);
                                sb4.append("_");
                                return a1.g.p(sb4, icVar2.f16100f.local_id, ".mp4");
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(icVar.f16100f.volume_id);
                            sb5.append("_");
                            return a1.g.p(sb5, icVar.f16100f.local_id, ".jpg");
                        }
                    }
                } else if (i10 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.jj) arrayList3.get(i10)).f16337k;
                    Pattern pattern = org.telegram.messenger.b8.I;
                    if (message != null) {
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 != null) {
                                ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                                if (arrayList5.size() > 0 && (w11 = org.telegram.messenger.b8.w(arrayList5, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                                    return org.telegram.messenger.b8.r(null, w11);
                                }
                                return "";
                            }
                            return "";
                        } else if (org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.b8.r(null, org.telegram.messenger.jj.o1(message).document);
                        } else {
                            if (org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.jj.o1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w10 = org.telegram.messenger.b8.w(arrayList6, org.telegram.messenger.i0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.b8.r(null, w10);
                                }
                                return "";
                            } else if (org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.jj.o1(message).webpage.document != null) {
                                    return org.telegram.messenger.b8.r(null, org.telegram.messenger.jj.o1(message).webpage.document);
                                }
                                if (org.telegram.messenger.jj.o1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.jj.o1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w9 = org.telegram.messenger.b8.w(arrayList7, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.b8.r(null, w9);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.jj.o1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.hc.B(webDocument.url, org.telegram.messenger.b8.H(webDocument.mime_type));
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
        org.telegram.ui.Components.u61 u61Var;
        org.telegram.ui.Components.u61 u61Var2;
        mr0 mr0Var;
        org.telegram.ui.Components.u61 u61Var3 = this.F2;
        if (u61Var3 == null && ((mr0Var = this.f33479f0) == null || !mr0Var.f31243y)) {
            return;
        }
        if (u61Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f33479f0.G;
        }
        v0();
        org.telegram.messenger.i0.r(this.f33642x2);
        if (z10) {
            k2();
        } else {
            if (this.f33584r1) {
                if (Math.abs(this.S7.getProgress() - this.S7.getRightProgress()) < 0.01f || ((u61Var2 = this.F2) != null && u61Var2.S() == this.F2.U())) {
                    x2(this.S7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f33577q3.c() - this.S7.getRightProgress()) < 0.01f || ((u61Var = this.F2) != null && u61Var.S() == this.F2.U())) {
                    x2(0.0f);
                }
                v2();
            }
            m2();
        }
        this.f33470e0.invalidate();
    }

    public final void u0() {
        if (this.f33454c2 == 11) {
            sr0 sr0Var = this.f33607t5;
            if (sr0Var.m0 == 2) {
                sr0Var.setCutOutState(true);
                a3(true, true);
                this.p5.f();
                this.f33470e0.invalidate();
            }
        }
    }

    public final org.telegram.messenger.ic u1(int i10, long[] jArr) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e7;
            if (!arrayList.isEmpty()) {
                if (i10 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.pw) arrayList.get(i10)).f17489b.size;
                    }
                    org.telegram.messenger.pw pwVar = (org.telegram.messenger.pw) arrayList.get(i10);
                    if (pwVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = pwVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.f33439a7;
                if (!arrayList2.isEmpty()) {
                    if (i10 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f33459c7;
                            if (arrayList3.get(i10) != null) {
                                jArr[0] = ((Long) arrayList3.get(i10)).longValue();
                            }
                        }
                        return (org.telegram.messenger.ic) this.f33449b7.get(i10);
                    }
                } else {
                    ArrayList arrayList4 = this.Y6;
                    if (!arrayList4.isEmpty() && i10 < arrayList4.size()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(i10);
                        TLRPC.Message message = jjVar.f16337k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                                if (w9 != null) {
                                    if (jArr != null) {
                                        long j10 = w9.size;
                                        jArr[0] = j10;
                                        if (j10 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.ic.f(w9, jjVar.f16342l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = jjVar.Y0;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.ic.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, true);
                                    if (w10 != null) {
                                        if (jArr != null) {
                                            long j11 = w10.size;
                                            jArr[0] = j11;
                                            if (j11 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.ic.f(w10, jjVar.Y0.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.jj.o1(jjVar.f16337k).photo != null) || ((org.telegram.messenger.jj.o1(jjVar.f16337k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(jjVar.f16337k).webpage != null)) {
                                if (org.telegram.messenger.jj.t3(jjVar.f16337k)) {
                                    return org.telegram.messenger.ic.b(jjVar.F0());
                                }
                                TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(true), false, null, true);
                                if (w11 != null) {
                                    if (jArr != null) {
                                        long j12 = w11.size;
                                        jArr[0] = j12;
                                        if (j12 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.ic.f(w11, jjVar.f16342l0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.jj.o1(jjVar.f16337k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.jj.o1(jjVar.f16337k)).webPhoto));
                            } else {
                                if (jjVar.F0() != null) {
                                    TLRPC.Document F0 = jjVar.F0();
                                    if (this.C5 == 5) {
                                        return org.telegram.messenger.ic.b(F0);
                                    }
                                    if (org.telegram.messenger.jj.W2(jjVar.F0())) {
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j13 = w12.size;
                                            jArr[0] = j13;
                                            if (j13 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.ic.c(w12, F0);
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
        int i10;
        if (this.f33454c2 == 11) {
            int m12 = m1(this.f33615u4);
            if (m12 == 0) {
                m12 = org.telegram.messenger.i0.f16026q.x;
            }
            float D = org.telegram.messenger.z20.D(20.0f, m12, 1) / m12;
            if (z10) {
                int q6 = this.C4.q();
                int o10 = this.C4.o();
                if ((q6 <= 1 || o10 <= 1) && (i10 = this.P4) >= 0) {
                    ArrayList arrayList = this.f33494g7;
                    if (i10 < arrayList.size()) {
                        Object obj = arrayList.get(this.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            q6 = efVar.F;
                            o10 = efVar.G;
                            if ((efVar.J / 90) % 2 != 0) {
                                o10 = q6;
                                q6 = o10;
                            }
                        }
                    }
                }
                if (q6 > 1 && o10 > 1 && q6 > o10) {
                    return (q6 / o10) * D;
                }
            }
            return D;
        }
        return 1.0f;
    }

    public final void u3() {
        View view = this.T3;
        if (view != null) {
            fq0 fq0Var = this.W0[0];
            int i10 = fq0Var.h;
            if (fq0Var.f37330p && (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 1)) {
                if (i10 == 3) {
                    view.setContentDescription(org.telegram.messenger.cd.L0(2131754929, "AccActionPlay"));
                } else if (i10 == 2) {
                    view.setContentDescription(org.telegram.messenger.cd.L0(2131754938, "AccActionDownload"));
                } else if (i10 == 1) {
                    view.setContentDescription(org.telegram.messenger.cd.L0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.cd.L0(2131754930, "AccActionPause"));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            float f11 = 1.0f - f7;
            this.T0.setTranslationY(org.telegram.messenger.i0.L(36.0f) * f11);
            this.T0.setAlpha(f7);
            org.telegram.ui.Components.qe0 qe0Var = this.T0;
            int i13 = 8;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qe0Var.setVisibility(i11);
            if (this.f33481f2) {
                jg.b1 b1Var = this.P0;
                int i14 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                b1Var.setVisibility(i12);
                this.P0.setAlpha(f11);
                this.P0.setTranslationY(org.telegram.messenger.i0.L(36.0f) * f7);
                bi.f2 f2Var = this.S0;
                if (i14 < 0) {
                    i13 = 0;
                }
                f2Var.setVisibility(i13);
                this.S0.setAlpha(f11);
                this.S0.setTranslationY(org.telegram.messenger.i0.L(36.0f) * f7);
            }
        }
    }

    public final void v0() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.I2 = null;
        }
    }

    public final void v2() {
        if (!J1()) {
            org.telegram.messenger.jj jjVar = this.T4;
            if (jjVar == null || !jjVar.r4()) {
                iq0 iq0Var = this.f33642x2;
                org.telegram.messenger.i0.r(iq0Var);
                org.telegram.messenger.i0.h3(iq0Var, 3000);
            }
        }
    }

    public final void v3() {
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
                f7 = Math.max(f7, org.telegram.messenger.i0.L(48.0f));
            }
            CounterView counterView = this.O0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f7 = Math.max(f7, org.telegram.messenger.i0.L(100.0f));
            }
            ds0 ds0Var = this.M;
            ValueAnimator valueAnimator = ds0Var.f36821n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ds0Var.f36821n = null;
            }
            ds0Var.f36822r = f7;
            ds0Var.f36819c[0].setRightPadding((int) f7);
            ds0Var.d.setRightPadding(f7);
        }
    }

    public final void w0() {
        float f7;
        org.telegram.ui.ActionBar.y yVar = this.A0;
        if (yVar != null) {
            if (this.f33481f2) {
                f7 = -org.telegram.messenger.i0.L(4.0f);
            } else {
                f7 = 0.0f;
            }
            yVar.setTranslationX(f7);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.E0;
        if (t0Var != null) {
            L2(t0Var, this.f33481f2, false);
        }
        boolean z10 = this.f33472e2;
        if (z10 && this.I == null) {
            vg.f c10 = this.Y.c(this.G, null, false);
            c10.o(w7.b9.i(this.f33622v2));
            c10.q(org.telegram.messenger.i0.L(20.0f));
            c10.p(org.telegram.messenger.i0.L(7.0f));
            int L = org.telegram.messenger.i0.L(54.0f);
            int L2 = org.telegram.messenger.i0.L(54.0f);
            Matrix matrix = yg.d.f54436a;
            this.I = new yg.c(L, L2, c10);
        }
        if (z10) {
            w7.e6.a(this.G);
            this.G.setBackground(this.I);
            return;
        }
        this.G.setStateListAnimator(null);
        this.G.setBackground(this.H);
    }

    public final int w1() {
        return this.f33595s2.left;
    }

    public final void w2(long j10) {
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null && mr0Var.f31243y) {
            mr0Var.i(j10);
        } else {
            org.telegram.ui.Components.u61 u61Var = this.F2;
            if (u61Var != null) {
                u61Var.p0(j10);
            }
        }
        F3();
    }

    public final void w3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f33572p7) {
            charSequence = this.f33580q7;
        } else if (obj instanceof org.telegram.messenger.ef) {
            charSequence = ((org.telegram.messenger.ef) obj).f19506a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.hf)) {
            charSequence = ((org.telegram.messenger.hf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            h1().setText("");
        } else {
            h1().setText(org.telegram.ui.Components.o5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.mt editText = h1().f51340f.getEditText();
        un unVar = this.l4;
        if (unVar != null && ((encryptedChat = unVar.h) == null || org.telegram.messenger.i0.X0(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final boolean x0() {
        if (this.f33552n4 != 0) {
            I1();
            if (Math.abs(this.f33561o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f33570p4;
                if (runnable != null) {
                    runnable.run();
                    this.f33570p4 = null;
                }
                this.f33552n4 = 0;
            }
        }
        if (this.f33552n4 == 0) {
            return false;
        }
        return true;
    }

    public final TLRPC.Document x1() {
        int i10;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i10 = this.P4) >= 0) {
            ArrayList arrayList = this.f33494g7;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.ze) {
                    org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) obj;
                    if (!zeVar.v && !zeVar.f19524w && !zeVar.f19523u) {
                        return this.f33618u7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void x2(float f7) {
        org.telegram.ui.Components.u61 u61Var = this.F2;
        if (u61Var != null) {
            u61Var.p0(f7 * ((float) u61Var.U()));
            return;
        }
        mr0 mr0Var = this.f33479f0;
        if (mr0Var != null) {
            mr0Var.i(f7 * mr0Var.getVideoDuration());
        }
    }

    public final void x3() {
        int i10 = org.telegram.ui.ActionBar.t6.f21125ng;
        int B1 = B1(i10);
        bi.f2 f2Var = this.S0;
        if (f2Var != null) {
            f2Var.k();
            this.S0.invalidate();
        }
        CheckBox checkBox = this.N0;
        if (checkBox != null) {
            checkBox.c(B1(i10), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(B1, mode);
        ImageView imageView = this.Y0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Y0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.Z0;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f33453c1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f33453c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f33443b1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f33443b1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f33434a1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f33434a1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.u0 u0Var = this.U0;
        if (u0Var != null) {
            ((TextView) u0Var.f23118b).setTextColor(B1);
        }
        org.telegram.ui.Cells.u0 u0Var2 = this.P7;
        if (u0Var2 != null) {
            ((TextView) u0Var2.f23118b).setTextColor(B1);
        }
        er0 er0Var = this.L1;
        if (er0Var != null) {
            er0Var.updateColors();
        }
        org.telegram.ui.Components.oe0 oe0Var = this.I1;
        if (oe0Var != null) {
            ImageView imageView6 = oe0Var.B0;
            ImageView imageView7 = oe0Var.A0;
            ImageView imageView8 = oe0Var.f29070z0;
            org.telegram.ui.ActionBar.p6 p6Var = oe0Var.I0;
            TextView textView = oe0Var.f29046g0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), mode));
            }
            oe0Var.g();
        }
        jq0 jq0Var = this.U1;
        if (jq0Var != null) {
            jq0Var.H(this.f33622v2);
        }
        kq0 kq0Var = this.V1;
        if (kq0Var != null) {
            kq0Var.H(this.f33622v2);
        }
        gq0 gq0Var = this.S7;
        if (gq0Var != null) {
            gq0Var.invalidate();
        }
        ls0 ls0Var = this.f33558o1;
        if (ls0Var != null) {
            int childCount = ls0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f33558o1.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.b6) {
                    ((org.telegram.ui.Cells.b6) childAt).f21729c.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
                }
            }
        }
        zp0 zp0Var = this.U3;
        if (zp0Var != null) {
            zp0Var.X0(true);
        }
    }

    public final void y0(boolean z10) {
        View view;
        float x10;
        float y3;
        float f7;
        float f10;
        if (z10) {
            TextureView textureView = this.f33633w3;
            if (textureView != null) {
                textureView.getViewTreeObserver().addOnPreDrawListener(new e7(this, 4));
                this.f33633w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f33643x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f33643x3.setImageDrawable(null);
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
            org.telegram.ui.Components.af0 af0Var = this.f33652y2;
            if (af0Var != null) {
                int[] iArr = this.A3;
                af0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f33470e0.getTranslationY());
                ImageView imageView2 = this.f33643x3;
                Rect rect = this.f33595s2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f33652y2.getX());
                }
                zr0 zr0Var = this.E2;
                if (zr0Var != null) {
                    zr0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new po0(this, 4));
                if (this.D2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f33652y2.getX();
                }
                if (this.D2) {
                    y3 = 0.0f;
                } else {
                    y3 = iArr[1] - this.f33652y2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f33643x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f33643x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f33643x3;
                Property property3 = View.TRANSLATION_X;
                if (this.D2) {
                    f7 = 0.0f;
                } else {
                    f7 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f7));
                ImageView imageView6 = this.f33643x3;
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
                arrayList.add(ObjectAnimator.ofInt(this.L0, org.telegram.ui.Components.i6.d, 255));
                zr0 zr0Var2 = this.E2;
                if (zr0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zr0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.E2, property4, y3));
                }
                org.telegram.ui.Components.jf0.j(false, this.f33652y2.getAspectRatio());
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ag.p2(22, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new op0(this, view, 0));
                animatorSet.start();
                qr0 qr0Var = new qr0();
                qr0Var.f41041c = false;
                qr0Var.d = false;
                qr0Var.f41039a = 250;
                qr0Var.f41040b = decelerateInterpolator;
                n3(true, true, qr0Var);
                this.G3 = 0;
            }
        }
    }

    public final RenderNode y1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j10;
        if (this.K8 == null) {
            renderNode = null;
        } else {
            renderNode = this.L8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a2 = tg.f.a(org.telegram.messenger.i0.L(40.0f), 6.0f);
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
        g.y yVar = this.M8;
        yVar.f7257a = 0L;
        yVar.f7258b = false;
        for (float f7 : colorMatrix.getArray()) {
            yVar.c(f7);
        }
        yVar.a(0L);
        if (yVar.f7258b) {
            j10 = -1;
        } else {
            j10 = yVar.f7257a;
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

    public final int y2() {
        int i10;
        if (this.f33619u8 > 1048576000) {
            return this.Z7 - 1;
        }
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        int i11 = this.Z7;
        while (i11 < 5) {
            Locale locale = Locale.US;
            int i12 = d12.getInt("compress_video_" + i11, -1);
            if (i12 >= 0) {
                return Math.min(i12, 2);
            }
            i11++;
        }
        org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(this.T);
        int e = org.telegram.messenger.w0.e();
        if (e == 1) {
            i10 = q6.p().h;
        } else if (e == 2) {
            i10 = q6.o().h;
        } else {
            i10 = q6.n().h;
        }
        return Math.min(2, Math.round(i10 / (100.0f / i11)) - 1);
    }

    public final void y3(boolean z10) {
        as0 as0Var;
        int i10;
        if (this.f33454c2 != 1 && (as0Var = this.f33470e0) != null) {
            if (!z10) {
                if (as0Var.getPaddingLeft() <= 0 && this.f33470e0.getPaddingRight() <= 0) {
                    i10 = 1796;
                } else {
                    i10 = 5894;
                }
            } else {
                i10 = 1792;
            }
            this.f33470e0.setSystemUiVisibility(i10);
        }
    }

    public final void z0() {
        gs0 gs0Var = this.f33466d5;
        if (gs0Var != null) {
            gs0Var.f37627a.O0(true, true);
        }
        es0 es0Var = this.d;
        gs0 gs0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (es0Var != null) {
            org.telegram.messenger.jj jjVar = this.T4;
            org.telegram.messenger.ic icVar = this.Z4;
            if (icVar != null) {
                tL_fileLocationToBeDeprecated = icVar.f16100f;
            }
            gs0Var2 = es0Var.E(jjVar, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f33466d5 = gs0Var2;
        if (gs0Var2 != null && !gs0Var2.f37642s) {
            gs0Var2.f37627a.O0(false, true);
        }
    }

    public final int z1() {
        return this.f33595s2.right;
    }

    public final void z2(final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12, boolean z13) {
        boolean z14;
        org.telegram.messenger.x20 x20Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        org.telegram.messenger.ye yeVar;
        org.telegram.messenger.ye yeVar2;
        TLRPC.Chat chat;
        boolean z15;
        int i12;
        un unVar;
        org.telegram.ui.Components.z30 z30Var;
        String str;
        long j10;
        String L0;
        TextureView textureView;
        if (!K1() && this.d != null && !this.f33613u2) {
            String str2 = null;
            if (this.f33454c2 == 1) {
                if (!z13 && (z30Var = this.f33559o2) != null) {
                    TLObject tLObject = z30Var.f32887a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j11 = user.f19942id;
                        str = str3;
                        j10 = j11;
                    } else {
                        str = "";
                        j10 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f33470e0.getContext());
                    int L = org.telegram.messenger.i0.L(8.0f);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.X0 = L;
                    Context context = this.f33470e0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f36408a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f36409b = imageReceiver2;
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    view.e = new Path();
                    r8Var.r(org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f());
                    imageReceiver.i0(org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f(), r8Var, null);
                    imageReceiver2.i0(org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f(), r8Var, null);
                    Drawable drawable = context.getDrawable(2131232055);
                    view.f36411f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f33559o2.f32887a;
                    as0 as0Var = this.f33470e0;
                    org.telegram.ui.Components.be0 be0Var = this.C1;
                    r8Var.l(tLObject2);
                    imageReceiver.i0(tLObject2, r8Var, null);
                    view.f36410c = as0Var;
                    view.d = be0Var;
                    x1Var.V = view;
                    if (this.f33559o2.f32889c == 1) {
                        if (org.telegram.messenger.d20.i(this.T).f15165n == j10) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131745516, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131745517, str, str));
                        }
                        if (this.I4) {
                            L0 = org.telegram.messenger.cd.L0(2131745514, "SetVideo");
                        } else {
                            L0 = org.telegram.messenger.cd.L0(2131745536, "SetPhoto");
                        }
                    } else {
                        if (this.I4) {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744422, str));
                        } else {
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744433, str));
                        }
                        L0 = org.telegram.messenger.cd.L0(2131744431, "SuggestPhotoShort");
                    }
                    String str4 = L0;
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), new org.telegram.ui.Components.z11(19));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.u1() {
                        @Override
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.U8;
                            PhotoViewer.this.z2(z10, i10, i11, z11, z12, true);
                        }
                    });
                    x1Var.I = org.telegram.ui.ActionBar.t6.f20940dh;
                    x1Var.V0 = true;
                    x1Var.j(i0.b.o(-15461356, 204));
                    x1Var.show();
                    x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20901bh, false));
                    x1Var.setOnDismissListener(new mq0(this));
                    if (this.f33584r1 && (textureView = this.B2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f33652y2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.B2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f33652y2.addView(this.E3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.C3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.C3 = null;
                            }
                            org.telegram.messenger.f8.g(th2, true);
                            return;
                        }
                    }
                    return;
                }
                n0();
            }
            if (!z11 && (unVar = this.l4) != null) {
                TLRPC.Chat chat2 = unVar.e;
                if (unVar.j() != null || ((org.telegram.messenger.w3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.w3.T(chat2))) {
                    org.telegram.messenger.vp.r1(this.T).e7.edit().putBoolean("silent_" + this.l4.a(), !z10).commit();
                }
            }
            org.telegram.messenger.x20 p12 = p1();
            ArrayList arrayList = this.f33494g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).f19521s = p12;
                }
            }
            un unVar2 = this.l4;
            if (unVar2 != null && (chat = unVar2.e) != null) {
                if (!this.f33584r1 && p12 == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15 && !org.telegram.messenger.w3.u(chat)) {
                    org.telegram.messenger.m5.o(null, 2131749547, new org.telegram.ui.Components.cc(this.f33470e0, this.f33622v2), null);
                    return;
                } else if (!z15 && !org.telegram.messenger.w3.p(this.l4.e)) {
                    org.telegram.messenger.m5.o(null, 2131749551, new org.telegram.ui.Components.cc(this.f33470e0, this.f33622v2), null);
                    return;
                }
            }
            this.f33613u2 = true;
            if (p12 != null) {
                long j12 = ((float) p12.f19198q) * 0.9f;
                if ((j12 > 2097152000 && !org.telegram.messenger.d20.i(this.T).q()) || j12 > 4194304000L) {
                    if (this.a2 != null) {
                        org.telegram.ui.Components.bi biVar = this.a2;
                        new kg.q0(6, org.telegram.messenger.d20.f15147s0, biVar.f21589c.getContext(), biVar.W1, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.f33454c2 == 11) {
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
                        int m12 = m1(this.f33615u4);
                        k1();
                        float L2 = m12 - org.telegram.messenger.i0.L(20.0f);
                        jg.v2 v2Var = this.p5;
                        if (v2Var != null && v2Var.f10320i0 && v2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.p5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f33653y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            p0(canvas);
                            ImageReceiver imageReceiver3 = this.C4;
                            canvas.translate((-imageReceiver3.M0) / 2.0f, (-imageReceiver3.N0) / 2.0f);
                            canvas.scale(this.C4.M0 / this.f33653y4.getMeasuredWidth(), this.C4.N0 / this.f33653y4.getMeasuredHeight());
                            this.f33653y4.e = !E1();
                            this.f33653y4.draw(canvas);
                            this.f33653y4.e = true;
                            canvas.restore();
                        }
                        if (E1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f20 = L2 / 2.0f;
                            matrix.preTranslate(f20, f20);
                            if (this.f33571p6 != null) {
                                f14 = org.telegram.messenger.i0.T1(0.0f, this.f33493g6, this.f33536l6);
                                f7 = 2.0f;
                                f10 = org.telegram.messenger.i0.T1(this.f33438a6, this.f33476e6, this.f33536l6);
                                f11 = org.telegram.messenger.i0.T1(this.f33448b6, this.f33485f6, this.f33536l6);
                                f12 = org.telegram.messenger.i0.T1(this.Y5, this.f33467d6, this.f33536l6);
                                f13 = org.telegram.messenger.i0.T1(this.X5, this.f33458c6, this.f33536l6);
                            } else {
                                f7 = 2.0f;
                                f10 = this.f33438a6;
                                f11 = this.f33448b6;
                                f12 = this.Y5;
                                f13 = this.X5;
                                if (this.f33554n6 != 0) {
                                    f13 = this.f33458c6;
                                    f12 = this.f33467d6;
                                    f10 = this.f33476e6;
                                }
                                f14 = 0.0f;
                            }
                            int m13 = m1(this.f33615u4);
                            int k12 = k1();
                            matrix.preTranslate(f13, f12 + 0.0f);
                            matrix.preScale(f10, f10);
                            matrix.preRotate(f11);
                            int q6 = this.C4.q();
                            int o10 = this.C4.o();
                            float f21 = m13;
                            float f22 = k12;
                            float min = Math.min(f21 / q6, f22 / o10);
                            eg.g gVar = this.D1;
                            int i13 = gVar.f6546i;
                            if (i13 != 90 && i13 != 270) {
                                o10 = q6;
                                q6 = o10;
                            }
                            float f23 = gVar.f6547j;
                            float f24 = gVar.f6548k;
                            float f25 = o10;
                            float f26 = q6;
                            float f27 = f21 / ((int) ((((1.0f - f23) * 0.0f) + f23) * f25));
                            float f28 = (int) ((((1.0f - f24) * 0.0f) + f24) * f26);
                            if (f27 * f28 > f22) {
                                f27 = f22 / f28;
                            }
                            int i14 = this.f33454c2;
                            xr0 xr0Var = this.X4;
                            if (i14 != 1 && !gVar.f6541a) {
                                f17 = L2;
                            } else {
                                TextureView textureView2 = this.B2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.ye yeVar3 = xr0Var.f43638c;
                                    if (yeVar3 != null && yeVar3.f19371l) {
                                        f18 = -1.0f;
                                    } else {
                                        f18 = 1.0f;
                                    }
                                    textureView2.setScaleX(f18);
                                    zr0 zr0Var = this.E2;
                                    if (zr0Var != null) {
                                        zr0Var.setScaleX(this.B2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.ye yeVar4 = xr0Var.f43638c;
                                if (yeVar4 != null) {
                                    f15 = yeVar4.f19366c;
                                    f16 = 1.0f;
                                } else {
                                    f15 = 1.0f;
                                    f16 = 1.0f;
                                }
                                f17 = L2;
                                float z16 = ((f27 / min) / c3.i0.z(f15, f16, 0.0f, f16)) * f15;
                                matrix.preTranslate(gVar.d * f16, gVar.e * f16);
                                matrix.preScale(z16, z16);
                                matrix.preTranslate(c3.i0.E(gVar.f6542b, f25, min, f16), c3.i0.E(gVar.f6543c, f26, min, f16));
                                float f29 = gVar.f6545g + i13;
                                if (f29 > 180.0f) {
                                    f29 -= 360.0f;
                                }
                                matrix.preRotate(f29);
                            }
                            if (!arrayList.isEmpty() && (yeVar2 = xr0Var.f43638c) != null && yeVar2.f19371l) {
                                f19 = 1.0f;
                                matrix.preScale(-1.0f, 1.0f);
                            } else {
                                f19 = 1.0f;
                            }
                            if (f14 > 0.0f) {
                                matrix.preScale(f19 - (f14 * f7), f19);
                                matrix.preSkew(0.0f, org.telegram.messenger.m5.A(f19, f14, 4.0f * f14, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.C4;
                            matrix.preTranslate((-imageReceiver4.M0) / f7, (-imageReceiver4.N0) / f7);
                            ImageReceiver imageReceiver5 = this.C4;
                            matrix.preScale(imageReceiver5.M0, imageReceiver5.N0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = efVar.f19518p;
                            int size = arrayList3.size();
                            int i15 = 0;
                            String str5 = null;
                            while (i15 < size) {
                                Object obj3 = arrayList3.get(i15);
                                i15++;
                                org.telegram.messenger.v20 a2 = ((org.telegram.messenger.v20) obj3).a();
                                float f30 = a2.f18457c;
                                float f31 = a2.d;
                                float f32 = a2.f18458f + f30;
                                float f33 = a2.f18459g + f31;
                                float[] fArr = {f30, f31, f32, f31, f32, f33, f30, f33};
                                matrix.mapPoints(fArr);
                                ArrayList arrayList4 = arrayList3;
                                int i16 = size;
                                a2.f18458f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / f17;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f17;
                                a2.f18459g = sqrt;
                                a2.f18457c = (((fArr[0] + fArr[4]) / f7) / f17) - (a2.f18458f / f7);
                                a2.d = (((fArr[1] + fArr[5]) / f7) / f17) - (sqrt / f7);
                                a2.v = 1.0f;
                                a2.A = true;
                                if (efVar.f19524w && (yeVar = efVar.A) != null) {
                                    a2.e = (float) (a2.e - ((yeVar.f19370k / 180.0f) * 3.141592653589793d));
                                }
                                a2.e = (float) (a2.e - ((this.f33448b6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a2);
                                TLRPC.Document document = a2.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.jj.V(document, null, null);
                                }
                                arrayList3 = arrayList4;
                                size = i16;
                            }
                            org.telegram.messenger.x20 x20Var2 = new org.telegram.messenger.x20();
                            x20Var2.I = true;
                            x20Var2.f19192k = 512;
                            x20Var2.h = 512;
                            x20Var2.f19193l = 512;
                            x20Var2.f19190i = 512;
                            x20Var2.G = arrayList2;
                            long k10 = Utilities.k(efVar.f19522t, 2999L, 800L);
                            x20Var2.f19199r = k10;
                            x20Var2.v = k10;
                            x20Var2.f19194m = 200000;
                            x20Var2.f19195n = 30;
                            z14 = true;
                            x20Var2.N = true;
                            x20Var2.f19198q = 262144L;
                            x20Var = x20Var2;
                            str2 = str5;
                        } else {
                            z14 = true;
                            x20Var = null;
                        }
                        float f34 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.hc.a0(createBitmap, Bitmap.CompressFormat.WEBP, f34, f34, 100);
                        org.telegram.messenger.b8.G(org.telegram.messenger.d20.f15147s0);
                        String file = org.telegram.messenger.b8.K(a02, "webp", z14, z14).toString();
                        if (x20Var != null) {
                            x20Var.f19196o = file;
                        }
                        if (this.f33588r5 == null) {
                            this.f33588r5 = new ArrayList();
                        }
                        if (this.f33588r5.isEmpty()) {
                            String str6 = this.p5.f10313c0;
                            if (str6 != null && org.telegram.messenger.k6.g(str6) != null) {
                                this.f33588r5.add(this.p5.f10313c0);
                            } else if (str2 != null) {
                                this.f33588r5.add(str2);
                            } else {
                                this.f33588r5.add("👍");
                            }
                        }
                        this.f33613u2 = false;
                        lt p5 = lt.p();
                        jg.v2 v2Var2 = this.p5;
                        ArrayList arrayList5 = this.f33588r5;
                        nq0 nq0Var = new nq0(this, file, x20Var, efVar, z10, i10, i11, z12);
                        gt gtVar = p5.U;
                        Activity W = org.telegram.messenger.i0.W(v2Var2.getContext());
                        if (W != null) {
                            p5.v(W);
                            p5.u(nq0Var);
                            ?? obj4 = new Object();
                            obj4.f16493a = file;
                            obj4.f16497g = x20Var;
                            p5.f39399o = arrayList5;
                            p5.s(null, obj4, null, null, null, 3, false, null, new th.b(), 0);
                            org.telegram.messenger.i0.r(gtVar);
                            org.telegram.messenger.i0.h3(gtVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                this.d.o(this.P4, p12, z10, i10, i11, z12);
            } else {
                this.d.M(p12);
            }
            if (this.O) {
                if (this.P) {
                    org.telegram.messenger.i0.h3(new jp0(this, 0), 200L);
                } else {
                    H0(false, false);
                }
            }
        }
    }

    public final void z3(float f7) {
        int m12;
        int k12;
        boolean z10;
        View view;
        org.telegram.ui.Components.af0 af0Var = this.f33652y2;
        if (af0Var != null && af0Var.getVisibility() == 0 && this.H3) {
            if (this.D2) {
                view = this.C2;
            } else {
                view = this.B2;
            }
            f7 *= Math.min(m1(this.f33615u4) / view.getMeasuredWidth(), D1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.C4;
        float f10 = imageReceiver.M0;
        float f11 = imageReceiver.N0;
        org.telegram.messenger.ye yeVar = this.X4.f43638c;
        if (yeVar != null) {
            f10 *= yeVar.e;
            f11 *= yeVar.f19367f;
        }
        if (this.f33454c2 == 11) {
            m12 = (int) (f10 * f7);
        } else {
            m12 = ((int) ((f10 * f7) - m1(this.f33615u4))) / 2;
        }
        if (this.f33454c2 == 11) {
            k12 = (int) (f11 * f7);
        } else {
            k12 = ((int) ((f11 * f7) - k1())) / 2;
        }
        float f12 = 0.0f;
        if (m12 > 0) {
            this.E6 = -m12;
            this.F6 = m12;
        } else {
            this.F6 = 0.0f;
            this.E6 = 0.0f;
        }
        if (k12 > 0) {
            this.G6 = -k12;
            this.H6 = k12;
        } else {
            this.H6 = 0.0f;
            this.G6 = 0.0f;
        }
        er0 er0Var = this.L1;
        if (er0Var != null) {
            if (f7 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = er0Var.f10169g1;
            boolean z11 = !z10;
            if (er0Var.H1 != z11) {
                er0Var.H1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f12 = 1.0f;
                }
                org.telegram.messenger.z20.m(animate.alpha(f12), org.telegram.ui.Components.gr.h, 240L);
            }
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
