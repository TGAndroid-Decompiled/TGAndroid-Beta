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
public class PhotoViewer implements org.telegram.messenger.gs, org.telegram.ui.Components.m10, org.telegram.ui.Components.l10, te.b {
    public static Drawable[] Z8;
    public static final Paint f43162a9 = new Paint(2);
    public static final HashMap f43163b9 = new HashMap();
    public static DecelerateInterpolator f43164c9;
    public static Paint f43165d9;
    public static final Property f43166e9;
    public static volatile PhotoViewer f43167f9;
    public static volatile PhotoViewer f43168g9;
    public org.telegram.ui.ActionBar.d1 A0;
    public org.telegram.ui.Components.a61 A1;
    public View A2;
    public final int[] A3;
    public org.telegram.ui.Components.ec0 A4;
    public boolean A5;
    public float A6;
    public ObjectAnimator A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.y B0;
    public org.telegram.ui.Components.en0 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public int B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.q0 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public xi.e C7;
    public boolean C8;
    public org.telegram.ui.ActionBar.q0 D0;
    public org.telegram.ui.Components.rd0 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public String D8;
    public Activity E;
    public org.telegram.ui.ActionBar.q0 E0;
    public final og.g E1;
    public boolean E2;
    public ImageView E3;
    public h2.c E4;
    public long E5;
    public float E6;
    public float E7;
    public final org.telegram.ui.Components.d6 E8;
    public ContextThemeWrapper F;
    public org.telegram.ui.ActionBar.q0 F0;
    public og.g F1;
    public qq0 F2;
    public boolean F3;
    public h2.c F4;
    public ch.p0 F5;
    public float F6;
    public final hn0 F7;
    public org.telegram.ui.Components.d6[] F8;
    public org.telegram.ui.Components.v7 G;
    public org.telegram.ui.ActionBar.y0 G0;
    public og.g G1;
    public org.telegram.ui.Components.i61 G2;
    public int G3;
    public h2.c G4;
    public String G5;
    public float G6;
    public Path G7;
    public RectF G8;
    public ImageView H;
    public org.telegram.ui.Components.q7 H0;
    public org.telegram.messenger.xe H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public Paint H7;
    public RectF H8;
    public Drawable I;
    public d61 I0;
    public org.telegram.messenger.xe I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public Paint I7;
    public Matrix I8;
    public ih.c J;
    public d61 J0;
    public org.telegram.ui.Components.ee0 J1;
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
    public hi.o3 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public RenderNode L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public wp0 M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Matrix M7;
    public final dh.a M8;
    public uq0 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public final int[] N7;
    public final a0.h N8;
    public tq0 O;
    public CheckBox O0;
    public vp0 O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public yq0 O7;
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
    public org.telegram.ui.ActionBar.t1 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public RadialProgressView Q7;
    public wi.o Q8;
    public wo0 R;
    public FrameLayout R0;
    public nq0 R1;
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
    public org.telegram.ui.Components.i61 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public yo0 S7;
    public boolean S8;
    public Paint T;
    public oi.v1 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public org.telegram.messenger.gj T4;
    public boolean T5;
    public int T6;
    public TextView T7;
    public final RectF T8;
    public int U;
    public org.telegram.ui.Components.ge0 U0;
    public xp0 U1;
    public boolean U2;
    public ro0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public AnimatorSet U7;
    public boolean U8;
    public int V;
    public org.telegram.ui.Cells.x0 V0;
    public bp0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public boolean V8;
    public int W;
    public TextView W0;
    public cp0 W1;
    public boolean W2;
    public org.telegram.ui.Components.cu W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public final hn0 W8;
    public float X;
    public final xo0[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public final oq0 X4;
    public float X5;
    public final SparseArray[] X6;
    public long X7;
    public final to0 X8;
    public io0 Y;
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
    public org.telegram.messenger.gc Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public volatile int Z7;
    public final te.a f43169a = new te.a(0, this, org.telegram.ui.Components.nr.h, 380, false);
    public xe.b f43170a0;
    public ImageView f43171a1;
    public FrameLayout f43172a2;
    public float f43173a3;
    public final org.telegram.ui.Cells.k1 f43174a4;
    public org.telegram.messenger.gc f43175a5;
    public float f43176a6;
    public final ArrayList f43177a7;
    public int f43178a8;
    public final boolean f43179b;
    public xe.b f43180b0;
    public ImageView f43181b1;
    public org.telegram.ui.Components.ui f43182b2;
    public String f43183b3;
    public final VideoFramesRewinder f43184b4;
    public org.telegram.messenger.zv f43185b5;
    public float f43186b6;
    public final ArrayList f43187b7;
    public int f43188b8;
    public int f43189c;
    public org.telegram.ui.Components.ca f43190c0;
    public ImageView f43191c1;
    public bg.v0 f43192c2;
    public String f43193c3;
    public final jp0 f43194c4;
    public final String[] f43195c5;
    public float f43196c6;
    public final ArrayList f43197c7;
    public volatile int f43198c8;
    public vq0 d;
    public org.telegram.ui.Components.ga f43199d0;
    public ImageView f43200d1;
    public int d2;
    public long f43201d3;
    public final org.telegram.ui.Cells.g2 f43202d4;
    public xq0 f43203d5;
    public float f43204d6;
    public final ArrayList f43205d7;
    public volatile int f43206d8;
    public boolean f43207e;
    public WindowManager.LayoutParams f43208e0;
    public org.telegram.ui.Components.j00 f43209e1;
    public boolean f43210e2;
    public float f43211e3;
    public CharSequence f43212e4;
    public String f43213e5;
    public float f43214e6;
    public final ArrayList f43215e7;
    public volatile int f43216e8;
    public boolean f43217f;
    public rq0 f43218f0;
    public org.telegram.ui.ActionBar.f0 f43219f1;
    public boolean f43220f2;
    public boolean f43221f3;
    public boolean f43222f4;
    public long f43223f5;
    public float f43224f6;
    public final ArrayList f43225f7;
    public volatile int f43226f8;
    public eq0 f43227g0;
    public org.telegram.ui.Components.o80 f43228g1;
    public boolean f43229g2;
    public long f43230g3;
    public boolean f43231g4;
    public String f43232g5;
    public float f43233g6;
    public final ArrayList f43234g7;
    public volatile int f43235g8;
    public int h;
    public wq0 f43236h0;
    public zo0 f43237h1;
    public boolean f43238h2;
    public boolean f43239h3;
    public final ap0 f43240h4;
    public boolean f43241h5;
    public float f43242h6;
    public org.telegram.messenger.gc h7;
    public volatile int f43243h8;
    public ClippingImageView f43244i0;
    public ArrayList f43245i1;
    public boolean f43246i2;
    public dr0 f43247i3;
    public final ap0 f43248i4;
    public TL_iv.PageBlock f43249i5;
    public float f43250i6;
    public zq0 i7;
    public float f43251i8;
    public ih0 f43252j0;
    public ArrayList f43253j1;
    public boolean f43254j2;
    public String j3;
    public final t50 f43255j4;
    public org.telegram.messenger.ic f43256j5;
    public float f43257j6;
    public sq0 f43258j7;
    public int f43259j8;
    public View f43260k0;
    public org.telegram.ui.Components.v51 f43261k1;
    public org.telegram.ui.Components.c6 f43262k2;
    public ValueAnimator f43263k3;
    public final float[][] f43264k4;
    public boolean f43265k5;
    public float f43266k6;
    public final Rect f43267k7;
    public volatile boolean f43268k8;
    public int f43269l0;
    public hi.l3 l1;
    public boolean f43270l2;
    public boolean f43271l3;
    public bn f43272l4;
    public boolean f43273l5;
    public float f43274l6;
    public final h2.f f43275l7;
    public volatile boolean f43276l8;
    public TextView m0;
    public org.telegram.ui.Components.z20 f43277m1;
    public boolean f43278m2;
    public final int[] f43279m3;
    public org.telegram.ui.ActionBar.g2 f43280m4;
    public boolean f43281m5;
    public float f43282m6;
    public bg.v0 f43283m7;
    public long f43284m8;
    public boolean f43285n;
    public TextView f43286n0;
    public org.telegram.ui.Components.o01 n1;
    public boolean f43287n2;
    public final int[] f43288n3;
    public int f43289n4;
    public boolean f43290n5;
    public long f43291n6;
    public org.telegram.ui.Components.gc f43292n7;
    public long f43293n8;
    public TextView f43294o0;
    public UndoView f43295o1;
    public boolean f43296o2;
    public org.telegram.ui.ActionBar.m5 f43297o3;
    public long o4;
    public String f43298o5;
    public int f43299o6;
    public int f43300o7;
    public float f43301o8;
    public org.telegram.ui.ActionBar.q0 f43302p0;
    public cr0 f43303p1;
    public org.telegram.ui.Components.v30 f43304p2;
    public ImageView f43305p3;
    public Runnable f43306p4;
    public tg.f2 f43307p5;
    public AnimatorSet f43308p6;
    public boolean f43309p7;
    public float f43310p8;
    public org.telegram.ui.ActionBar.q0 f43311q0;
    public l4 f43312q1;
    public boolean f43313q2;
    public org.telegram.ui.Components.k61 f43314q3;
    public xq0 f43315q4;
    public org.telegram.ui.Components.fe0 f43316q5;
    public AnimatorSet f43317q6;
    public CharSequence f43318q7;
    public long f43319q8;
    public boolean f43320r;
    public org.telegram.ui.ActionBar.y0 f43321r0;
    public ImageReceiver f43322r1;
    public org.telegram.messenger.vo f43323r2;
    public uv f43324r3;
    public xq0 f43325r4;
    public ArrayList f43326r5;
    public org.telegram.ui.Components.n10 f43327r6;
    public boolean f43328r7;
    public long f43329r8;
    public boolean f43330s;
    public org.telegram.ui.ActionBar.u0 f43331s0;
    public boolean f43332s1;
    public boolean f43333s2;
    public lp0 f43334s3;
    public boolean f43335s4;
    public fi.u2 s5;
    public boolean f43336s6;
    public ValueAnimator f43337s7;
    public long f43338s8;
    public org.telegram.ui.ActionBar.y0 f43339t0;
    public final hn0 f43340t1;
    public final Rect f43341t2;
    public AnimatorSet f43342t3;
    public boolean f43343t4;
    public jq0 f43344t5;
    public final DecelerateInterpolator t6;
    public TLRPC.Document f43345t7;
    public long f43346t8;
    public org.telegram.ui.ActionBar.y0 f43347u0;
    public float f43348u1;
    public boolean f43349u2;
    public boolean f43350u3;
    public int f43351u4;
    public LinearLayout f43352u5;
    public float f43353u6;
    public TLRPC.Document f43354u7;
    public long f43355u8;
    public org.telegram.ui.ActionBar.d1 f43356v0;
    public long f43357v1;
    public boolean f43358v2;
    public int f43359v3;
    public final hn0 f43360v4;
    public jq0 f43361v5;
    public float f43362v6;
    public boolean f43363v7;
    public long f43364v8;
    public int f43365w;
    public org.telegram.ui.ActionBar.y0 f43366w0;
    public final GradientDrawable[] f43367w1;
    public org.telegram.ui.ActionBar.h6 f43368w2;
    public wi.o f43369w3;
    public int f43370w4;
    public jq0 f43371w5;
    public float f43372w6;
    public boolean f43373w7;
    public float f43374w8;
    public AnimatorSet f43375x;
    public xq f43376x0;
    public final boolean[] f43377x1;
    public final uo0 f43378x2;
    public ImageView f43379x3;
    public String f43380x4;
    public jq0 f43381x5;
    public float f43382x6;
    public org.telegram.messenger.r10 f43383x7;
    public fq0 f43384x8;
    public final hn0 f43385y;
    public LinearLayout f43386y0;
    public final float[] f43387y1;
    public final ap0 f43388y2;
    public final ImageView[] f43389y3;
    public org.telegram.ui.Components.ec0 f43390y4;
    public jq0 f43391y5;
    public float f43392y6;
    public final float[] f43393y7;
    public org.telegram.messenger.gj f43394y8;
    public final ArrayList f43395z0;
    public int f43396z1;
    public org.telegram.ui.Components.ue0 f43397z2;
    public boolean f43398z3;
    public org.telegram.ui.Components.ec0 f43399z4;
    public long f43400z5;
    public float f43401z6;
    public final float[] f43402z7;
    public boolean f43403z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f43404g = 0;
        public final RectF f43405a;
        public final RectF f43406b;
        public final Paint f43407c;
        public ve0 d;
        public boolean f43408e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f43405a = new RectF();
            this.f43406b = new RectF();
            Paint paint = new Paint(1);
            this.f43407c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            bg.v0 v0Var = photoViewer.f43283m7;
            if (v0Var != null) {
                v0Var.b(!this.f43408e);
            }
            bg.v0 v0Var2 = photoViewer.f43192c2;
            if (v0Var2 != null) {
                v0Var2.b(!this.f43408e);
            }
            org.telegram.ui.Components.ui uiVar = photoViewer.f43182b2;
            if (uiVar != null) {
                boolean z11 = this.f43408e;
                uiVar.f40425w2.m(uiVar.f40379j4);
                if (uiVar.f40411s4 != z11) {
                    uiVar.f40411s4 = z11;
                    org.telegram.ui.Components.mi miVar = uiVar.f40425w2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40363e2;
                    if (miVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f32788j1) {
                        if (z11 && !uiVar.f40415t4) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f32793n && !chatAttachAlertPhotoLayout.P0) {
                            if (z10) {
                                org.telegram.ui.Components.gm gmVar = chatAttachAlertPhotoLayout.Q;
                                if (gmVar != null) {
                                    chatAttachAlertPhotoLayout.f32797p0 = Boolean.valueOf(gmVar.isFrontface());
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
            ve0 ve0Var;
            xq0 xq0Var;
            Drawable[] drawableArr = PhotoViewer.Z8;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f43289n4 != 0 && !org.telegram.messenger.g0.Q1() && (xq0Var = photoViewer.f43203d5) != null && xq0Var.f53908m != null) {
                ClippingImageView clippingImageView = photoViewer.f43244i0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.f43406b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.f32861b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.f32862c;
                rectF.bottom = scaleY - clippingImageView.f32860a;
                if (!rectF.isEmpty()) {
                    rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    Rect bounds = getBounds();
                    float f10 = bounds.right;
                    float f11 = bounds.bottom;
                    for (int i7 = 0; i7 < 4; i7++) {
                        RectF rectF2 = this.f43405a;
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
                        canvas.drawRect(rectF2, this.f43407c);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() != 0 && (ve0Var = this.d) != null) {
                org.telegram.messenger.g0.g3(ve0Var);
                this.d = null;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                if (photoViewer.f43207e && i7 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f43408e = z10;
                if (z10) {
                    a();
                } else {
                    org.telegram.messenger.g0.h3(new iq0(this, 0), 70L);
                }
            }
            super.setAlpha(i7);
            this.f43407c.setAlpha(i7);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f43410a;
        public final TextPaint f43411b;
        public final Paint f43412c;
        public int d;
        public int f43413e;
        public final RectF f43414f;
        public int h;
        public float f43415n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f43411b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f43412c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f43414f = new RectF();
            a(0);
        }

        public final void a(int i7) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.g0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f43411b;
            this.f43410a = new StaticLayout("" + Math.max(1, i7), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f43413e = this.f43410a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f43412c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i7 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.p6 p6Var = org.telegram.ui.Components.r6.f39049b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, p6Var, 0), ObjectAnimator.ofInt(textPaint, p6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.p6 p6Var2 = org.telegram.ui.Components.r6.f39049b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, p6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, p6Var2, 0, 255));
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
            return this.f43415n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f43412c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.g0.L(14.0f) + measuredHeight;
            RectF rectF = this.f43414f;
            rectF.set(org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
            if (this.f43410a != null) {
                this.f43411b.setAlpha((int) ((1.0f - this.f43415n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f43415n * org.telegram.messenger.g0.L(5.0f)) + org.telegram.messenger.g0.N(0.2f) + ((getMeasuredHeight() - this.f43413e) / 2));
                this.f43410a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f43415n * 255.0f));
                int centerX = (int) rectF.centerX();
                int t6 = (int) com.google.android.gms.internal.vision.e2.t(1.0f, this.f43415n, org.telegram.messenger.g0.L(5.0f), (int) rectF.centerY());
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
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.hd.G(i7, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(20.0f) + this.d, org.telegram.messenger.g0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f43415n = f10;
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
            f43166e9 = new ho0();
        } else {
            f43166e9 = new org.telegram.ui.Cells.h1(Float.class, "progress", 4);
        }
        f43167f9 = null;
        f43168g9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43179b = z10;
        this.h = -1;
        this.f43285n = true;
        this.f43385y = new hn0(this, 22);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.f43170a0 = new xe.b();
        this.f43395z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new xo0[3];
        this.f43340t1 = new hn0(this, 23);
        this.f43367w1 = new GradientDrawable[2];
        this.f43377x1 = new boolean[2];
        this.f43387y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.f43341t2 = new Rect();
        this.f43378x2 = new uo0(this);
        this.f43388y2 = new ap0(this, 0);
        this.f43271l3 = true;
        this.f43279m3 = new int[2];
        this.f43288n3 = new int[2];
        this.f43389y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f43174a4 = new org.telegram.ui.Cells.k1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f43184b4 = videoFramesRewinder;
        this.f43194c4 = new jp0(this, videoFramesRewinder);
        this.f43202d4 = new org.telegram.ui.Cells.g2(this);
        this.f43240h4 = new ap0(this, 1);
        this.f43248i4 = new ap0(this, 2);
        this.f43255j4 = new t50(this, 1);
        this.f43264k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f43360v4 = new hn0(this, 24);
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
        this.f43195c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f43176a6 = 1.0f;
        this.f43186b6 = 0.0f;
        this.f43299o6 = -1;
        this.t6 = new DecelerateInterpolator(1.5f);
        this.f43372w6 = 1.0f;
        this.f43382x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43177a7 = new ArrayList();
        this.f43187b7 = new ArrayList();
        this.f43197c7 = new ArrayList();
        this.f43205d7 = new ArrayList();
        this.f43215e7 = new ArrayList();
        this.f43225f7 = new ArrayList();
        this.f43234g7 = new ArrayList();
        this.h7 = null;
        this.i7 = null;
        this.f43267k7 = new Rect();
        this.f43275l7 = new h2.f(new int[]{org.telegram.messenger.ls.f25342s, org.telegram.messenger.ls.f25348t, org.telegram.messenger.ls.W, org.telegram.messenger.ls.V, org.telegram.messenger.ls.f25277g3});
        this.f43393y7 = new float[]{1.0f};
        this.f43402z7 = new float[]{1.0f};
        this.F7 = new hn0(this, 26);
        this.N7 = new int[2];
        this.V7 = -1L;
        this.W7 = -1L;
        this.X7 = -1L;
        this.Z7 = -1;
        this.E8 = new org.telegram.ui.Components.d6(new hn0(this, 25), 180L, org.telegram.ui.Components.nr.f37918g);
        this.M8 = new Object();
        this.N8 = new a0.h();
        this.T8 = new RectF();
        this.W8 = new hn0(this, 27);
        this.X8 = new to0(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.h0(3);
    }

    public static boolean A1() {
        if (f43167f9 != null) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap C0(android.graphics.Bitmap r16, org.telegram.messenger.xe r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C0(android.graphics.Bitmap, org.telegram.messenger.xe, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean I1(org.telegram.messenger.gj gjVar) {
        if (f43167f9 != null && !f43167f9.B3 && f43167f9.f43207e && gjVar != null && f43167f9.T4 != null && f43167f9.T4.e1() == gjVar.e1() && org.telegram.messenger.gj.B0(f43167f9.T4.f24177k) == org.telegram.messenger.gj.B0(gjVar.f24177k)) {
            return true;
        }
        return false;
    }

    public static boolean J1(org.telegram.messenger.gj gjVar) {
        if (f43168g9 != null && gjVar != null && f43168g9.T4 != null && f43168g9.T4.e1() == gjVar.e1() && org.telegram.messenger.gj.B0(f43168g9.T4.f24177k) == org.telegram.messenger.gj.B0(gjVar.f24177k)) {
            return true;
        }
        return false;
    }

    public static boolean K1(String str) {
        if (f43167f9 != null && f43167f9.f43207e && !f43167f9.f43335s4 && str != null && str.equals(f43167f9.f43213e5)) {
            return true;
        }
        return false;
    }

    public static void L(PhotoViewer photoViewer) {
        int i7;
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i7 = photoViewer.Q4) >= 0 && i7 < arrayList.size() && (gjVar = (org.telegram.messenger.gj) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f43290n5 && (message = gjVar.f24177k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b31.N0())) {
                photoViewer.y2(gjVar, i2(gjVar), false, true);
            } else {
                photoViewer.y2(gjVar, gjVar.f24235z, photoViewer.f43290n5, true);
            }
        }
    }

    public static boolean L1(org.telegram.messenger.gj gjVar) {
        boolean z10;
        if (f43167f9 != null && !f43167f9.B3 && f43167f9.f43207e && !f43167f9.f43335s4 && gjVar != null) {
            org.telegram.messenger.gj gjVar2 = f43167f9.T4;
            if (gjVar2 == null && f43167f9.d != null) {
                gjVar2 = f43167f9.d.V();
            }
            if (gjVar2 != null && gjVar2.e1() == gjVar.e1() && org.telegram.messenger.gj.B0(gjVar2.f24177k) == org.telegram.messenger.gj.B0(gjVar.f24177k)) {
                z10 = true;
                if (z10 && f43168g9 != null) {
                    if (f43168g9.f43207e && !f43168g9.f43335s4 && gjVar != null && f43168g9.T4 != null && f43168g9.T4.e1() == gjVar.e1() && org.telegram.messenger.gj.B0(f43168g9.T4.f24177k) == org.telegram.messenger.gj.B0(gjVar.f24177k)) {
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
        if (f43167f9 != null && f43167f9.f43207e && !f43167f9.f43335s4 && botInlineResult != null && f43167f9.Y4 != null && botInlineResult.f28396id == f43167f9.Y4.f28396id) {
            return true;
        }
        return false;
    }

    public static boolean N1(TLRPC.FileLocation fileLocation) {
        if (f43167f9 != null && f43167f9.f43207e && !f43167f9.f43335s4 && fileLocation != null) {
            if (f43167f9.Z4 == null || fileLocation.local_id != f43167f9.Z4.f24080f.local_id || fileLocation.volume_id != f43167f9.Z4.f24080f.volume_id || fileLocation.dc_id != f43167f9.Z4.f24076a) {
                if (f43167f9.f43175a5 != null && fileLocation.local_id == f43167f9.f43175a5.f24080f.local_id && fileLocation.volume_id == f43167f9.f43175a5.f24080f.volume_id && fileLocation.dc_id == f43167f9.f43175a5.f24076a) {
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
            photoViewer.A2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.nr.f37920j).setDuration(85L).setListener(new org.telegram.ui.Components.h10(12, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void P(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P(org.telegram.ui.PhotoViewer):void");
    }

    public static boolean P2(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && org.telegram.messenger.gj.L4(gjVar.f24177k)) {
            if (gjVar.f24236z0 || gjVar.f24232y0 || gjVar.D2(true) || (gjVar.B() && org.telegram.messenger.cz.B0)) {
                int i7 = org.telegram.messenger.cz.f23354a;
                if (org.telegram.messenger.qc.e(1024)) {
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
        org.telegram.ui.Components.k61 k61Var = photoViewer.f43314q3;
        if (k61Var.f36789f) {
            i7 = k61Var.d;
        } else {
            i7 = k61Var.f36786b;
        }
        int L = (org.telegram.messenger.g0.L(2.0f) + ((org.telegram.ui.Components.k61.S / 2) + i7)) - (photoViewer.f43334s3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = (photoViewer.f43247i3.getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - (photoViewer.f43334s3.getMeasuredWidth() / 2);
        if (L < L2) {
            lp0 lp0Var = photoViewer.f43334s3;
            lp0Var.setPivotX(Utilities.i((lp0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f43334s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            lp0 lp0Var2 = photoViewer.f43334s3;
            lp0Var2.setPivotX(Utilities.i((lp0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f43334s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            lp0 lp0Var3 = photoViewer.f43334s3;
            lp0Var3.setPivotX(lp0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f43334s3.setTranslationX(L);
    }

    public static void R(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.oh0 B;
        oq0 oq0Var = photoViewer.X4;
        ArrayList arrayList = oq0Var.f50621e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) oq0Var.f50621e.get(i7);
                if (d20Var.f23442a == 0 && (d20Var.f23443b & 1) != 0) {
                    View view = d20Var.I;
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

    public static int R0(org.telegram.messenger.ye yeVar) {
        if (yeVar.d()) {
            return org.telegram.messenger.g0.Z0(false);
        }
        return 512;
    }

    public static void S(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.oh0 B;
        oq0 oq0Var = photoViewer.X4;
        ArrayList arrayList = oq0Var.f50621e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) oq0Var.f50621e.get(i7);
                if (d20Var.f23442a == 0 && (d20Var.f23443b & 1) != 0) {
                    View view = d20Var.I;
                    if ((view instanceof org.telegram.ui.Components.q9) && (B = ((org.telegram.ui.Components.q9) view).getImageReceiver().B()) != null) {
                        long j10 = photoViewer.f43284m8;
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
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.f23355a0 && org.telegram.messenger.cz.o() >= 2 && !org.telegram.messenger.g0.m0) {
            return true;
        }
        return false;
    }

    public static boolean c(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence i2(org.telegram.messenger.gj gjVar) {
        if (gjVar.f24177k == null) {
            return "";
        }
        Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(gjVar.f24177k.translatedText.text), org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false, null, 0), gjVar.f24177k.translatedText.entities, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.gj.M(B5)) {
            try {
                org.telegram.messenger.g0.c(B5, 5, false, true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.gj.h(gjVar.P3(), B5, true, 0, 0, true);
        org.telegram.messenger.gj.b(B5, gjVar.f24177k.translatedText.entities, gjVar.P3(), true, true, true, 0);
        if (org.telegram.messenger.gj.L4(gjVar.f24177k)) {
            org.telegram.messenger.gj.h(gjVar.P3(), B5, true, 3, (int) gjVar.L0(), false);
        } else if (gjVar.I3() || org.telegram.messenger.gj.R4(gjVar.f24177k)) {
            org.telegram.messenger.gj.h(gjVar.P3(), B5, true, 4, (int) gjVar.L0(), false);
        }
        return B5;
    }

    public static String m1(org.telegram.messenger.gc gcVar) {
        if (gcVar != null && gcVar.f24089p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer p1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f43167f9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f43167f9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f43167f9 = photoViewer;
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
        org.telegram.ui.Components.i61 i61Var;
        org.telegram.messenger.gj gjVar;
        boolean z11;
        rq0 rq0Var = photoViewer.f43218f0;
        photoViewer.f43208e0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f43236h0, photoViewer.f43208e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bn bnVar = photoViewer.f43272l4;
        if (bnVar != null && bnVar.f45903a0 != null && bnVar.getFragmentView() != null) {
            rj rjVar = photoViewer.f43272l4.f45903a0;
            if (rjVar.f32657p3) {
                rjVar.W1();
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.k3(photoViewer.f43272l4.getParentActivity(), photoViewer.f43189c);
            photoViewer.f43272l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (i61Var = photoViewer.G2) != null && i61Var.S() > 1500 && (gjVar = photoViewer.T4) != null && org.telegram.messenger.gj.L4(gjVar.f24177k)) {
            num = Integer.valueOf((int) (photoViewer.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(0);
            String K = org.telegram.messenger.v3.K(org.telegram.messenger.np.u1(photoViewer.U).O0(Long.valueOf(-org.telegram.messenger.gj.B0(gjVar2.f24177k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.u1(photoViewer.U).X2, "/", K, "/");
                sb2.append(gjVar2.e1());
                str = sb2.toString();
            }
        }
        gp0 gp0Var = new gp0(photoViewer, photoViewer.E, photoViewer.f43272l4, arrayList, str, num, rq0Var, z10);
        gp0Var.A0(false);
        gp0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.g0.h3(new ve0(19, photoViewer, gp0Var), 250L);
        gp0Var.show();
    }

    public static void v(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.k0()) {
            return;
        }
        org.telegram.messenger.gj gjVar2 = photoViewer.T4;
        File file2 = null;
        if (gjVar2 != null) {
            if (gjVar2.t() && !photoViewer.T4.U2()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.T4.P3()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean L4 = org.telegram.messenger.gj.L4(photoViewer.T4.f24177k);
            if (!TextUtils.isEmpty(photoViewer.T4.f24177k.attachPath)) {
                File file3 = new File(photoViewer.T4.f24177k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                file2 = org.telegram.messenger.w7.M(photoViewer.T4.f24177k, false, true);
            }
            gjVar = gjVar2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = L4;
        } else {
            file = null;
            gjVar = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.i7 = new zq0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            hq0 hq0Var = new hq0();
            hq0Var.f48481c = false;
            photoViewer.i3(false, true, hq0Var);
            org.telegram.messenger.g0.h3(new tn0(photoViewer, file, z10, gjVar, z11, z12), hq0Var.f48479a);
            return;
        }
        photoViewer.S2();
    }

    public static String v1() {
        File z10 = org.telegram.messenger.w7.z(4);
        return new File(z10, org.telegram.messenger.cz.p() + "_temp.jpg").getAbsolutePath();
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
        org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(this.F, this.f43368w2);
        this.D1 = rd0Var;
        rd0Var.setVisibility(8);
        this.D1.a();
        this.f43218f0.addView(this.D1, this.f43218f0.indexOfChild(this.R7) - 1, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new to0(this));
    }

    public final void B1() {
        boolean[] zArr = this.f43377x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f43218f0.invalidate();
    }

    public final void B2() {
        if (this.f43289n4 == 0) {
            C2(this.C4, this.P4, null);
            D2(this.P4, this.f43390y4);
            C2(this.D4, this.P4 + 1, this.G1);
            D2(this.P4 + 1, this.A4);
            C2(this.B4, this.P4 - 1, this.F1);
            D2(this.P4 - 1, this.f43399z4);
        }
    }

    public final void B3() {
        String U0;
        String U02;
        int[] iArr = this.f43279m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f43288n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            long max = Math.max(0L, i61Var.S());
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
            eq0 eq0Var = this.f43227g0;
            if (eq0Var != null && eq0Var.f37134y) {
                long max3 = Math.max(0, eq0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f43227g0.getVideoDuration());
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
        this.f43297o3.l(U0 + " / " + U02, false);
        if (!Objects.equals(this.j3, U02)) {
            this.j3 = U02;
            this.f43247i3.requestLayout();
        }
    }

    public final void C1() {
        org.telegram.ui.Components.rd0 rd0Var = this.D1;
        if (rd0Var != null) {
            rd0Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.f39118b.f21887a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            og.o oVar = this.D1.f39118b;
            oVar.q();
            CropAreaView cropAreaView2 = oVar.f21887a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f43349u2 = true;
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
                float max = Math.max(800.0f / this.f43198c8, 800.0f / this.f43206d8);
                this.f43216e8 = Math.round((this.f43198c8 * max) / 2.0f) * 2;
                this.f43226f8 = Math.round((this.f43206d8 * max) / 2.0f) * 2;
            } else {
                Size i02 = i0();
                this.f43216e8 = i02.getWidth();
                this.f43226f8 = i02.getHeight();
            }
            if (this.f43235g8 != 0) {
                if (this.d2 == 1) {
                    this.f43235g8 = 1560000;
                    v = this.f43235g8;
                } else if (this.f43216e8 == this.f43198c8 && this.f43226f8 == this.f43206d8) {
                    this.f43235g8 = this.f43243h8;
                    v = MediaController.v(this.f43216e8, this.f43226f8, this.f43235g8, false);
                } else {
                    this.f43235g8 = MediaController.Q(this.f43206d8, this.f43198c8, this.f43243h8, this.f43226f8, this.f43216e8);
                    v = MediaController.v(this.f43216e8, this.f43226f8, this.f43235g8, false);
                }
                this.f43329r8 = ((v / 8) * this.f43251i8) / 1000.0f;
            }
        }
    }

    public final void D0() {
        org.telegram.messenger.xe xeVar;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            xeVar = new org.telegram.messenger.xe();
            xeVar.f27845k = this.E1.f21850i;
        } else {
            xeVar = this.X4.f50620c;
        }
        org.telegram.messenger.xe xeVar2 = xeVar;
        int q10 = this.C4.q();
        int o4 = this.C4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q10, o4, config);
        tg.f2 f2Var = this.f43307p5;
        if (f2Var != null && f2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f43307p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f43307p5.K);
            float width3 = createBitmap.getWidth();
            if ((this.f43307p5.K / 90) % 2 != 0) {
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
        vp0 vp0Var = new vp0(this, this.E, this.U, createBitmap2, createBitmap, this.C4.V, xeVar2);
        this.O1 = vp0Var;
        vp0Var.f58086s.setOnClickListener(new in0(this, 5));
        this.O1.f58087w.setOnClickListener(new in0(this, 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f43218f0.indexOfChild(this.f43352u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f43218f0.getChildCount();
        }
        this.f43218f0.addView(this.O1, indexOfChild, c8.na.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void D1() {
        tg.f2 f2Var = this.f43307p5;
        if (f2Var == null || !f2Var.W) {
            xe.b bVar = this.f43170a0;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11662g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            xe.b bVar2 = this.f43180b0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            bp0 bp0Var = this.V1;
            if (bp0Var != null) {
                bp0Var.m();
            }
            cp0 cp0Var = this.W1;
            if (cp0Var != null) {
                cp0Var.m();
            }
            jq0 jq0Var = this.f43344t5;
            if (jq0Var != null) {
                jq0Var.invalidate();
            }
            jq0 jq0Var2 = this.f43361v5;
            if (jq0Var2 != null) {
                jq0Var2.invalidate();
            }
            jq0 jq0Var3 = this.f43371w5;
            if (jq0Var3 != null) {
                jq0Var3.invalidate();
            }
            jq0 jq0Var4 = this.f43381x5;
            if (jq0Var4 != null) {
                jq0Var4.invalidate();
            }
            jq0 jq0Var5 = this.f43391y5;
            if (jq0Var5 != null) {
                jq0Var5.invalidate();
            }
            yo0 yo0Var = this.S7;
            if (yo0Var != null && yo0Var.f39458f0) {
                yo0Var.invalidate();
            }
            rq0 rq0Var = this.f43218f0;
            if (rq0Var != null) {
                rq0Var.invalidate();
            }
        }
    }

    public final void D2(int i7, org.telegram.ui.Components.ec0 ec0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (ec0Var != null) {
            ec0Var.a();
            ec0Var.setVisibility(8);
            ArrayList arrayList2 = this.f43234g7;
            if (!arrayList2.isEmpty() && i7 >= 0 && i7 < arrayList2.size()) {
                Object obj = arrayList2.get(i7);
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    z10 = ffVar.f28023b;
                    str = ffVar.f28029j;
                    arrayList = ffVar.f28035p;
                } else {
                    if (obj instanceof org.telegram.messenger.jf) {
                        org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                        str = jfVar.f28029j;
                        arrayList = jfVar.f28035p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                ec0Var.setVisibility(0);
                if (this.d2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ec0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    ec0Var.f34720a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(ec0Var.f34720a);
                    ec0Var.d = bitmapDrawable;
                    ec0Var.setBackground(bitmapDrawable);
                    return;
                }
                ec0Var.f34720a = null;
                ec0Var.d = null;
                ec0Var.setBackground(null);
            }
        }
    }

    public final boolean D3() {
        org.telegram.ui.Components.v30 v30Var = this.f43304p2;
        if (v30Var != null && v30Var.d && !v30Var.f40624e) {
            return true;
        }
        return false;
    }

    public final void E0() {
        int q10;
        int o4;
        org.telegram.messenger.xe xeVar;
        Bitmap n10;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                q10 = y51Var.getVideoWidth();
                o4 = y51Var.getVideoHeight();
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
            Bitmap bitmap = this.f43390y4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q10, o4, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i7 = this.d2;
            oq0 oq0Var = this.X4;
            boolean z10 = true;
            if (i7 == 1) {
                xeVar = new org.telegram.messenger.xe();
                xeVar.f27845k = this.E1.f21850i;
            } else {
                xeVar = oq0Var.f50620c;
            }
            org.telegram.messenger.xe xeVar2 = xeVar;
            hi.o3 o3Var = new hi.o3(this.f43236h0, false, new on0(this, 3));
            o3Var.f15109f = true;
            o3Var.f15110g = true;
            this.L1 = o3Var;
            if (this.f43351u4 == 3) {
                z10 = false;
            }
            o3Var.b(z10);
            Activity activity = this.E;
            int i10 = this.U;
            if (this.f43332s1) {
                n10 = null;
            } else {
                n10 = this.C4.n();
            }
            wp0 wp0Var = new wp0(this, activity, activity, i10, bitmap2, n10, this.C4.V, oq0Var.f50621e, xeVar2, new hn0(this, 15), this.f43368w2);
            this.M1 = wp0Var;
            fh.g c10 = this.Z.c(wp0Var.M0, null, false);
            c10.p(c8.j0.j(this.f43368w2));
            wp0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f43218f0.addView(this.M1.getView(), c8.na.c(-1.0f, -1));
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
        dr0 dr0Var = new dr0(this.f43218f0.getContext(), this);
        this.f43247i3 = dr0Var;
        this.f43218f0.addView(dr0Var, c8.na.e(-1, 48, 83));
        to0 to0Var = new to0(this);
        kp0 kp0Var = new kp0(this, to0Var);
        uv uvVar = new uv(6, this.f43218f0.getContext(), this);
        this.f43324r3 = uvVar;
        uvVar.setAccessibilityDelegate(kp0Var);
        this.f43324r3.setImportantForAccessibility(1);
        this.f43247i3.addView(this.f43324r3, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.k61 k61Var = new org.telegram.ui.Components.k61(this.f43324r3);
        this.f43314q3 = k61Var;
        k61Var.f36807z = org.telegram.messenger.g0.L(2.0f);
        org.telegram.ui.Components.k61 k61Var2 = this.f43314q3;
        k61Var2.f36793k = 872415231;
        k61Var2.f36794l = 872415231;
        k61Var2.f36795m = -1;
        k61Var2.f36796n = -1;
        k61Var2.A = 1509949439;
        k61Var2.f36792j = to0Var;
        lp0 lp0Var = new lp0(this, this.f43218f0.getContext(), new qn0(this));
        this.f43334s3 = lp0Var;
        lp0Var.setAlpha(0.0f);
        this.f43218f0.addView(this.f43334s3, c8.na.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(this.f43218f0.getContext());
        this.f43297o3 = m5Var;
        m5Var.setTextColor(-1);
        this.f43297o3.setGravity(53);
        this.f43297o3.setTextSize(14);
        this.f43297o3.setImportantForAccessibility(2);
        this.f43247i3.addView(this.f43297o3, c8.na.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f43218f0.getContext());
        this.f43305p3 = imageView;
        imageView.setImageResource(2131232254);
        this.f43305p3.setContentDescription(org.telegram.messenger.hd.N0(2131754723, "AccExitFullscreen"));
        this.f43305p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f43305p3.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        this.f43305p3.setVisibility(4);
        this.f43247i3.addView(this.f43305p3, c8.na.e(48, 48, 53));
        this.f43305p3.setOnClickListener(new vn0(this, 6));
    }

    public final boolean F1() {
        org.telegram.ui.Components.yc b12 = b1();
        if (b12 != null) {
            if (b12.M.c() || b12.f14971f.f42498e) {
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

    public final void G0(org.telegram.messenger.gf gfVar) {
        org.telegram.ui.Components.ha haVar;
        if (this.C2 == null) {
            org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(2, this.E, this);
            this.f43397z2 = ue0Var;
            ue0Var.setWillNotDraw(false);
            this.f43397z2.setVisibility(4);
            this.f43218f0.addView(this.f43397z2, 0, c8.na.e(-1, -1, 17));
            this.E2 = false;
            if (this.f43234g7.isEmpty()) {
                if (this.f43179b && this.T2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                org.telegram.ui.Components.y51 y51Var = new org.telegram.ui.Components.y51(this.E, this.G2);
                this.f43190c0.e();
                org.telegram.ui.Components.ca caVar = this.f43190c0;
                y51Var.f42306s = caVar;
                org.telegram.ui.Components.ez ezVar = y51Var.f42300b;
                if (ezVar != null && (haVar = ezVar.J) != null) {
                    org.telegram.ui.Components.ca caVar2 = haVar.f35809t;
                    if (caVar2 != null && caVar2.f34099m != null) {
                        caVar2.f34099m = null;
                    }
                    haVar.f35809t = caVar;
                    if (caVar != null && caVar.f34099m != haVar) {
                        caVar.f34099m = haVar;
                        caVar.d();
                    }
                }
                if (gfVar != null) {
                    y51Var.setDelegate(new jn0(gfVar, 0));
                }
                this.C2 = y51Var;
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
                this.f43397z2.addView(this.C2, c8.na.e(-1, -1, 17));
            } else {
                this.f43397z2.addView(this.D2, c8.na.e(-1, -1, 17));
            }
            qq0 qq0Var = new qq0(this.E, this);
            this.F2 = qq0Var;
            qq0Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f43397z2.addView(this.F2, c8.na.e(-1, -1, 17));
            View view = new View(this.E);
            this.Y8 = view;
            this.f43397z2.addView(view, c8.na.c(-1.0f, -1));
            if (this.d2 == 1) {
                View view2 = new View(this.E);
                this.A2 = view2;
                view2.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.f43397z2.addView(this.A2, c8.na.e(-1, -1, 17));
            }
        }
    }

    public final boolean G1() {
        int i7;
        if (this.h7 != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43225f7;
            if (i7 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                org.telegram.messenger.gc gcVar = (org.telegram.messenger.gc) this.f43177a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.h7.f24080f;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (gcVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gcVar.f24080f;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.h7.f24080f;
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
            org.telegram.ui.Components.ge0 ge0Var = this.U0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ge0Var.setVisibility(i10);
            if (this.f43229g2) {
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
                oi.v1 v1Var = this.T0;
                if (i13 < 0) {
                    i12 = 0;
                }
                v1Var.setVisibility(i12);
                this.T0.setAlpha(f12);
                this.T0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
            }
        }
    }

    public final boolean H0() {
        boolean z10 = false;
        if (this.f43308p6 != null || this.D1 == null) {
            return false;
        }
        this.f43233g6 = 1.0f;
        this.f43291n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43308p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f39053g, 0.0f, 1.0f));
        this.f43308p6.setDuration(250L);
        this.f43308p6.setInterpolator(org.telegram.ui.Components.nr.f37917f);
        this.f43308p6.addListener(new ip0(this, 0));
        this.f43308p6.start();
        og.m mVar = this.D1.f39118b.M;
        if (mVar != null) {
            z10 = mVar.f21884j;
        }
        return !z10;
    }

    public final boolean H1(sq0 sq0Var) {
        if (sq0Var != null) {
            Object g10 = sq0Var.g();
            if (g10 instanceof org.telegram.messenger.gj) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) g10;
                if (gjVar.f24177k != null) {
                    if (org.telegram.messenger.np.u1(this.U).G2(org.telegram.messenger.gj.B0(gjVar.f24177k)) || gjVar.f24177k.noforwards || gjVar.y2()) {
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
        if (this.f43331s0.getVisibility() != 0) {
            this.f43376x0.f53891f.t("", z10, true);
        } else if (Math.abs(this.f43348u1 - 1.0f) < 0.001f) {
            this.f43376x0.f53891f.t("", z10, true);
        } else {
            org.telegram.ui.Components.n6 n6Var = this.f43376x0.f53891f;
            n6Var.t(org.telegram.ui.Components.pu0.a(this.f43348u1) + "x", z10, true);
        }
        this.f43331s0.e(z10, this.f43348u1);
        d61 d61Var = this.J0;
        float f10 = this.f43348u1;
        org.telegram.ui.ActionBar.y0[] y0VarArr = (org.telegram.ui.ActionBar.y0[]) d61Var.f46849b;
        for (int i7 = 0; i7 < y0VarArr.length; i7++) {
            if (z11 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                y0VarArr[i7].d(-9718023, -9718023);
            } else {
                y0VarArr[i7].d(-328966, -328966);
            }
        }
    }

    public final boolean I0(float f10, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.rd0 rd0Var;
        float f11;
        if (this.f43308p6 == null && (rd0Var = this.D1) != null) {
            rd0Var.f39118b.i();
            this.f43186b6 = 0.0f;
            this.f43224f6 = 0.0f + f10;
            if (z10) {
                this.f43233g6 = 1.0f;
            }
            this.f43291n6 = System.currentTimeMillis();
            this.f43308p6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.f43214e6 = 1.0f;
                this.f43176a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int q10 = imageReceiver.q();
                    int o4 = this.C4.o();
                    if (Math.abs((((int) this.D1.f39118b.getStateOrientation()) / 90) % 2) == 1) {
                        o4 = q10;
                        q10 = o4;
                    }
                    org.telegram.messenger.xe xeVar = this.X4.f50620c;
                    if (xeVar != null) {
                        q10 = (int) (q10 * xeVar.f27841e);
                        o4 = (int) (o4 * xeVar.f27842f);
                    }
                    float f12 = q10;
                    float f13 = o4;
                    float min = Math.min(g1(1) / f12, d1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(g1(1) / f13, d1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f43214e6 = f11 / min;
                }
            }
            if (this.d2 == 11) {
                this.f43176a6 = p2(false) * this.f43176a6;
                this.f43214e6 = p2(false) * this.f43214e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new hi.j9(this, f10, this.D1.f39119c.getRotation(), 4));
            this.f43308p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f39053g, 0.0f, 1.0f), ofFloat);
            this.f43308p6.setDuration(250L);
            this.f43308p6.setInterpolator(org.telegram.ui.Components.nr.f37917f);
            this.f43308p6.addListener(new di.j6(this, f10, runnable, 5));
            this.f43308p6.start();
            if (Math.abs(this.D1.f39118b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void I2(Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        bg.v0 v0Var;
        Activity parentActivity;
        boolean z10;
        int i7;
        boolean z11;
        float f10;
        float f11;
        bg.v0 v0Var2 = this.f43283m7;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43283m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.f43283m7 = v0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = g2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.m6.K(parentActivity, false);
        this.f43368w2 = h6Var;
        this.f43280m4 = g2Var;
        int i10 = org.telegram.messenger.k10.f24932t0;
        this.U = i10;
        this.C4.d = i10;
        this.B4.d = i10;
        this.D4.d = i10;
        bp0 bp0Var = this.V1;
        if (bp0Var != null) {
            bp0Var.setAccount(i10);
            this.V1.f14971f.k(false);
        }
        cp0 cp0Var = this.W1;
        if (cp0Var != null) {
            cp0Var.setAccount(this.U);
            this.W1.f14971f.k(false);
        }
        tg.f2 f2Var = this.f43307p5;
        if (f2Var != null) {
            f2Var.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.f43330s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.f43396z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (Z8 == null) {
                Z8 = new Drawable[]{f0.d.d(this.E, 2131231006), f0.d.d(this.E, 2131230931), f0.d.d(this.E, 2131231636)};
            }
            this.V6 = new Scroller(parentActivity);
            wq0 wq0Var = new wq0(this, parentActivity);
            this.f43236h0 = wq0Var;
            wq0Var.setBackground(this.M0);
            this.f43236h0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f43244i0 = clippingImageView;
            clippingImageView.O = this.f43264k4;
            clippingImageView.L = false;
            clippingImageView.N = false;
            this.f43236h0.addView(clippingImageView, c8.na.c(40.0f, 40));
            rq0 rq0Var = new rq0(this, parentActivity, parentActivity);
            this.f43218f0 = rq0Var;
            rq0Var.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f43184b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f43218f0);
            }
            this.f43218f0.setClipChildren(true);
            this.f43218f0.setClipToPadding(true);
            this.f43236h0.setClipChildren(false);
            this.f43236h0.setClipToPadding(false);
            org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(this.f43218f0);
            this.f43190c0 = caVar;
            caVar.f34089a = 1;
            this.Y = new io0(this);
            this.f43180b0 = new xe.b();
            this.f43170a0 = new xe.b();
            dh.c cVar = new dh.c(this.Y);
            this.Z = cVar;
            cVar.g(new jh.k(this.f43218f0), this.f43218f0);
            this.Z.f(this.f43180b0);
            this.f43199d0 = new org.telegram.ui.Components.ga(this.f43190c0, this.f43218f0);
            this.f43236h0.addView(this.f43218f0, c8.na.e(-1, -1, 51));
            r0.i0.l(this.f43218f0, new qn0(this));
            this.f43218f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f43208e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.g0.m(layoutParams);
            this.f43208e0.flags = -2147286784;
            org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(this.E);
            this.f43390y4 = ec0Var;
            this.f43218f0.addView(ec0Var, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(this.E);
            this.f43399z4 = ec0Var2;
            this.f43218f0.addView(ec0Var2, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.ec0 ec0Var3 = new org.telegram.ui.Components.ec0(this.E);
            this.A4 = ec0Var3;
            this.f43218f0.addView(ec0Var3, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(4, parentActivity, this);
            this.G = v7Var;
            v7Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.f43330s);
            this.G.F(1090519039, false);
            this.G.G(-1, false);
            this.G.setBackButtonImage(2131231240);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            uq0 uq0Var = new uq0(parentActivity);
            this.N = uq0Var;
            this.G.addView(uq0Var, c8.na.e(-1, -1, 119));
            this.f43218f0.addView(this.G, c8.na.c(-2.0f, -1));
            tq0 tq0Var = new tq0(parentActivity);
            this.O = tq0Var;
            this.f43218f0.addView(tq0Var, c8.na.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new so0(this, h6Var));
            org.telegram.ui.ActionBar.y s5 = this.G.s();
            this.B0 = s5;
            s5.setOnLayoutListener(new hn0(this, 20));
            org.telegram.ui.ActionBar.q0 a10 = this.B0.a(26, 2131231786);
            this.F0 = a10;
            a10.setContentDescription(org.telegram.messenger.hd.M0(2131751586));
            c8.sa.a(this.F0);
            G2(this.F0, false, false);
            org.telegram.ui.ActionBar.q0 a11 = this.B0.a(11, 2131232219);
            this.E0 = a11;
            a11.setContentDescription(org.telegram.messenger.hd.M0(2131748486));
            org.telegram.ui.ActionBar.q0 a12 = this.B0.a(18, 2131232182);
            this.D0 = a12;
            a12.setContentDescription(org.telegram.messenger.hd.M0(2131754809));
            org.telegram.ui.ActionBar.q0 a13 = this.B0.a(4, 2131232183);
            this.C0 = a13;
            a13.setContentDescription(org.telegram.messenger.hd.M0(2131750570));
            org.telegram.ui.ActionBar.y yVar = this.B0;
            xq xqVar = new xq(2131232799, this.F, new fi.b());
            this.f43376x0 = xqVar;
            org.telegram.ui.ActionBar.q0 d = yVar.d(1, xqVar);
            this.f43311q0 = d;
            this.f43376x0.setCallback(d.getIconView());
            this.f43311q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43311q0.getPopupLayout().f28734c = true;
            this.f43311q0.getPopupLayout().setFitItems(true);
            this.f43311q0.setMenuXOffset(org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this.F, h6Var);
            this.f43331s0 = u0Var;
            u0Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f43331s0.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            this.f43331s0.setDrawShadow(false);
            this.f43331s0.setBackgroundColor(-14540254);
            this.f43331s0.setTextColor(-1);
            this.f43331s0.setLabel(org.telegram.messenger.hd.M0(2131743344));
            this.f43331s0.setOnValueChange(new pn0(this, 1));
            this.f43311q0.getPopupLayout().a(this.f43331s0, c8.na.o(-1, 44));
            org.telegram.ui.ActionBar.d1 a14 = this.f43311q0.a(-1);
            this.A0 = a14;
            a14.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f43311q0.getPopupLayout();
            d61 d61Var = new d61(this.F, new qn0(this));
            this.J0 = d61Var;
            popupLayout.addView(d61Var);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.f43386y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f43311q0.getPopupLayout().addView(this.f43386y0);
            org.telegram.ui.ActionBar.y0 e10 = this.f43311q0.e(22, 2131231914, org.telegram.messenger.hd.M0(2131743345));
            this.f43339t0 = e10;
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
                org.telegram.ui.ActionBar.y0 e12 = this.f43311q0.e(24, 2131231913, org.telegram.messenger.hd.M0(2131743346));
                this.G0 = e12;
                e12.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, c8.na.c(-1.0f, -1));
            }
            this.f43311q0.I(-115203550);
            this.f43311q0.setOnMenuDismiss(new on0(this, 9));
            org.telegram.ui.ActionBar.q0 a15 = this.B0.a(0, 2131231750);
            this.f43302p0 = a15;
            a15.setContentDescription(org.telegram.messenger.hd.M0(2131754838));
            this.f43302p0.setOnClickListener(new vn0(this, 3));
            this.f43302p0.setOnMenuDismiss(new on0(this, 10));
            this.f43302p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43302p0.getPopupLayout().f28734c = true;
            this.f43302p0.getPopupLayout().setFitItems(true);
            this.K0 = new vq(this.F, this.f43302p0.getPopupLayout().getSwipeBack(), new qn0(this));
            org.telegram.ui.ActionBar.y0 i11 = this.f43302p0.i(2131232169, null, org.telegram.messenger.hd.M0(2131745733), this.K0.f52846a);
            i11.d(-328966, -328966);
            this.f43347u0 = i11;
            i11.setOnClickListener(new vn0(this, 4));
            org.telegram.ui.ActionBar.d1 a16 = this.f43302p0.a(-1);
            this.f43356v0 = a16;
            a16.setColor(-15198184);
            this.f43302p0.e(10, 2131232267, org.telegram.messenger.hd.M0(2131747602)).d(-328966, -328966);
            org.telegram.ui.ActionBar.y0 e13 = this.f43302p0.e(6, 2131231915, org.telegram.messenger.hd.M0(2131747028));
            e13.d(-328966, -328966);
            this.f43366w0 = e13;
            org.telegram.ui.ActionBar.y0 e14 = this.f43302p0.e(3, 2131232221, org.telegram.messenger.hd.M0(2131745151));
            this.f43321r0 = e14;
            e14.d(-328966, -328966);
            this.f43302p0.e(12, 2131232172, org.telegram.messenger.hd.M0(2131745734)).d(-328966, -328966);
            this.f43302p0.e(5, 2131232226, org.telegram.messenger.hd.M0(2131745146)).d(-328966, -328966);
            this.f43302p0.e(25, 2131232384, org.telegram.messenger.hd.M0(2131751692)).d(-328966, -328966);
            this.f43302p0.e(21, 2131231877, org.telegram.messenger.hd.M0(2131746067)).d(-328966, -328966);
            this.f43302p0.e(23, 2131232335, org.telegram.messenger.hd.M0(2131746016)).d(-328966, -328966);
            this.f43302p0.e(9, 2131232367, org.telegram.messenger.hd.M0(2131745263)).d(-328966, -328966);
            this.f43302p0.e(13, 2131232384, org.telegram.messenger.hd.M0(2131745132)).d(-328966, -328966);
            this.f43302p0.e(14, 2131232268, org.telegram.messenger.hd.M0(2131745346)).d(-328966, -328966);
            this.f43302p0.e(19, 2131232410, org.telegram.messenger.hd.M0(2131743713)).d(-328966, -328966);
            this.f43302p0.e(20, 2131232410, org.telegram.messenger.hd.M0(2131749111)).d(-328966, -328966);
            this.f43302p0.e(7, 2131232110, org.telegram.messenger.hd.M0(2131751586)).d(-328966, -328966);
            this.f43302p0.e(8, 2131232089, org.telegram.messenger.hd.M0(2131744598)).d(-328966, -328966);
            this.f43302p0.I(-115203550);
            this.f43302p0.u(19);
            this.f43302p0.u(20);
            H2(false, true);
            this.f43302p0.setPopupItemsSelectorColor(268435455);
            this.f43302p0.setSubMenuDelegate(new to0(this));
            ih0 ih0Var = new ih0(this.F, 1);
            this.f43252j0 = ih0Var;
            ih0Var.setBackgroundColor(2130706432);
            this.f43218f0.addView(this.f43252j0, c8.na.e(-1, 48, 83));
            View view = new View(this.F);
            this.f43260k0 = view;
            if (this.d2 == 11) {
                i7 = -16777216;
            } else {
                i7 = 2130706432;
            }
            view.setBackgroundColor(i7);
            this.f43236h0.addView(this.f43260k0, c8.na.a(-1.0f, this.f43269l0 / org.telegram.messenger.g0.f24009p, 87));
            this.f43367w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f43367w1[0].setShape(0);
            this.f43367w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f43367w1[1].setShape(0);
            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(this.F, org.telegram.messenger.g0.L(10.0f));
            this.f43277m1 = z20Var;
            this.f43218f0.addView(z20Var, c8.na.e(-1, 68, 83));
            this.f43277m1.setDelegate(new vo0(this));
            for (int i12 = 0; i12 < 3; i12++) {
                this.f43389y3[i12] = new ImageView(this.E);
                this.f43389y3[i12].setImageResource(2131232220);
                this.f43389y3[i12].setContentDescription(org.telegram.messenger.hd.N0(2131754717, "AccSwitchToFullscreen"));
                this.f43389y3[i12].setScaleType(ImageView.ScaleType.CENTER);
                this.f43389y3[i12].setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
                this.f43389y3[i12].setVisibility(4);
                this.f43389y3[i12].setAlpha(1.0f);
                this.f43218f0.addView(this.f43389y3[i12], c8.na.c(48.0f, 48));
                this.f43389y3[i12].setOnClickListener(new vn0(this, 5));
            }
            this.R = new wo0(new fi.b());
            nq0 nq0Var = new nq0(this.f43218f0.getContext());
            this.R1 = nq0Var;
            nq0Var.setFactory(new zd0(this, 2));
            this.R1.setVisibility(4);
            w2(true);
            for (int i13 = 0; i13 < 3; i13++) {
                this.X0[i13] = new xo0(this, this.f43218f0);
                this.X0[i13].d(0, false, true);
            }
            yc ycVar = new yc(this, this.F, h6Var);
            this.Y0 = ycVar;
            ycVar.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(org.telegram.messenger.g0.L(54.0f));
            this.Y0.setBackgroundResource(2131231006);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f43218f0.addView(this.Y0, c8.na.e(64, 64, 17));
            F0();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, h6Var);
            this.Q7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.Q7.setBackgroundResource(2131231006);
            this.Q7.setVisibility(4);
            this.f43218f0.addView(this.Q7, c8.na.e(54, 54, 17));
            org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this.E, 3);
            this.P7 = x0Var;
            x0Var.setBackgroundColor(2130706432);
            this.P7.b();
            this.P7.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            ((TextView) this.P7.f32278b).setText(org.telegram.messenger.hd.N0(2131751342, "Done").toUpperCase());
            int i14 = org.telegram.ui.ActionBar.m6.f29596qg;
            org.telegram.ui.ActionBar.t6.U((TextView) this.P7.f32278b, i14, h6Var);
            this.f43218f0.addView(this.P7, c8.na.e(-1, 48, 83));
            ((TextView) this.P7.d).setOnClickListener(new in0(this, 2));
            ((TextView) this.P7.f32278b).setOnClickListener(new in0(this, 3));
            org.telegram.ui.Components.a61 a61Var = new org.telegram.ui.Components.a61(false);
            this.A1 = a61Var;
            a61Var.c(new to0(this));
            rq0 rq0Var2 = this.f43218f0;
            Objects.requireNonNull(rq0Var2);
            this.B1 = new org.telegram.ui.Components.en0(new hf0(rq0Var2, 17), false);
            yq0 yq0Var = new yq0(this.E, this);
            this.O7 = yq0Var;
            yq0Var.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            this.O7.setVisibility(4);
            this.O7.setBackgroundColor(2130706432);
            this.f43218f0.addView(this.O7, c8.na.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            di.n4 n4Var = new di.n4(this, this.F);
            this.Q0 = n4Var;
            this.f43218f0.addView(n4Var, c8.na.e(-1, -2, 83));
            TextView textView = new TextView(this.f43218f0.getContext());
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
            this.Q0.addView(this.m0, c8.na.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f43218f0.getContext());
            this.f43286n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.f43286n0.setSingleLine(true);
            this.f43286n0.setMaxLines(1);
            this.f43286n0.setEllipsize(truncateAt);
            this.f43286n0.setTextColor(-1);
            this.f43286n0.setGravity(3);
            this.Q0.addView(this.f43286n0, c8.na.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f43218f0.getContext());
            this.f43294o0 = textView4;
            int i15 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.t6.Q(textView4, org.telegram.ui.ActionBar.a6.e(w1(i15), 6.0f), org.telegram.ui.ActionBar.t6.M(i15), org.telegram.ui.ActionBar.t6.e(i15), h6Var);
            TextView textView5 = this.f43294o0;
            int i16 = org.telegram.ui.ActionBar.m6.Ji;
            org.telegram.ui.ActionBar.t6.U(textView5, i16, h6Var);
            this.f43294o0.setEllipsize(truncateAt);
            this.f43294o0.setGravity(17);
            this.f43294o0.setLines(1);
            this.f43294o0.setSingleLine(true);
            this.f43294o0.setText(org.telegram.messenger.hd.N0(2131745345, "SetAsMyPhoto"));
            this.f43294o0.setTextSize(1, 15.0f);
            this.f43294o0.setTypeface(org.telegram.messenger.g0.o());
            this.f43294o0.setOnClickListener(new in0(this, 4));
            this.f43294o0.setVisibility(8);
            this.Q0.addView(this.f43294o0, c8.na.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            yo0 yo0Var = new yo0(this.E, this);
            this.S7 = yo0Var;
            yo0Var.setDelegate(new com.google.android.gms.common.api.internal.t(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.R7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.R7.addView(this.S7, c8.na.e(-1, 54, 83));
            a3(false, false);
            this.f43218f0.addView(this.R7, c8.na.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                fh.g a17 = this.Z.a(q0Var);
                a17.p(c8.j0.j(h6Var));
                a17.r(org.telegram.messenger.g0.L(20.0f));
                a17.q(org.telegram.messenger.g0.L(7.0f));
                q0Var.setBackground(ih.d.d(a17, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f)));
            }
            zo0 zo0Var = new zo0(this.E, org.telegram.messenger.hd.M0(2131751196));
            this.f43237h1 = zo0Var;
            fh.g a18 = this.Z.a(zo0Var);
            a18.p(c8.j0.j(h6Var));
            zo0Var.setBlurredBackgroundDrawable(a18);
            c8.sa.a(this.f43237h1);
            this.f43237h1.setOnClickListener(new in0(this, 7));
            this.f43218f0.addView(this.f43237h1, c8.na.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.fe0 fe0Var = new org.telegram.ui.Components.fe0(this.E, h6Var, this.f43190c0);
            this.f43316q5 = fe0Var;
            org.telegram.ui.Components.et etVar = fe0Var.f35187c;
            fh.g a19 = this.Z.a(etVar);
            a19.p(c8.j0.j(h6Var));
            etVar.setBlurredBackgroundDrawable(a19);
            c8.sa.a(this.f43316q5.f35187c);
            this.f43316q5.setVisibility(8);
            this.f43316q5.setAlpha(0.0f);
            this.f43316q5.setOnClose(new hn0(this, 13));
            this.f43218f0.addView(this.f43316q5, c8.na.e(-1, -1, 119));
            this.f43316q5.f35186b.setOnClickListener(new in0(this, 9));
            this.f43316q5.setOnGalleryImage(new on0(this, 4));
            org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(3, this.E, this);
            this.f43219f1 = f0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            f0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f0 f0Var2 = this.f43219f1;
            org.telegram.ui.Components.j00 j00Var = new org.telegram.ui.Components.j00(this.E);
            this.f43209e1 = j00Var;
            f0Var2.setImageDrawable(j00Var);
            this.f43219f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.f0 f0Var3 = this.f43219f1;
            fh.g a20 = this.Z.a(f0Var3);
            a20.p(c8.j0.j(null));
            a20.q(org.telegram.messenger.g0.L(4.0f));
            a20.r(org.telegram.messenger.g0.L(16.0f));
            f0Var3.setBackground(a20);
            c8.sa.a(this.f43219f1);
            this.f43218f0.addView(this.f43219f1, c8.na.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f43219f1.setOnClickListener(new in0(this, 10));
            org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80(this.f43218f0.getContext());
            this.f43228g1 = o80Var;
            o80Var.setOnClickListener(new in0(this, 11));
            this.f43218f0.addView(this.f43228g1, c8.na.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f43218f0.getContext();
            wq0 wq0Var2 = this.f43236h0;
            rq0 rq0Var3 = this.f43218f0;
            bp0 bp0Var2 = new bp0(this, context, wq0Var2, rq0Var3, rq0Var3, h6Var, this.f43190c0, new hn0(this, 21));
            this.V1 = bp0Var2;
            bp0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new on0(this, 5));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new on0(this, 6));
            this.V1.setOnAddPhotoClick(new in0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.F;
            wq0 wq0Var3 = this.f43236h0;
            rq0 rq0Var4 = this.f43218f0;
            cp0 cp0Var2 = new cp0(this, contextThemeWrapper, wq0Var3, rq0Var4, rq0Var4, h6Var, this.f43190c0, new hn0(this, 21));
            this.W1 = cp0Var2;
            cp0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new on0(this, 7));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new on0(this, 8));
            this.W1.setOnAddPhotoClick(new in0(this, 13));
            fi.u2 u2Var = new fi.u2(this, this.F);
            this.s5 = u2Var;
            u2Var.setVisibility(8);
            this.f43218f0.addView(this.s5, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            tg.f2 f2Var2 = new tg.f2(this.F, h6Var);
            this.f43307p5 = f2Var2;
            f2Var2.setCurrentAccount(this.U);
            rq0 rq0Var5 = this.f43218f0;
            rq0Var5.addView(this.f43307p5, rq0Var5.indexOfChild(this.G) - 1, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            jq0 jq0Var = new jq0(this);
            this.f43344t5 = jq0Var;
            jq0Var.setRad(18);
            this.f43344t5.l();
            this.f43307p5.setStickerCutOutBtn(this.f43344t5);
            this.f43344t5.setOnClickListener(new in0(this, 14));
            this.f43344t5.setCutOutState(false);
            this.f43218f0.addView(this.f43344t5, c8.na.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.f43352u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            jq0 jq0Var2 = new jq0(this);
            this.f43361v5 = jq0Var2;
            jq0Var2.f58163s0 = true;
            jq0Var2.setRad(18);
            this.f43361v5.setEraseState(false);
            this.f43361v5.setOnClickListener(new in0(this, 15));
            this.f43352u5.addView(this.f43361v5, c8.na.o(-2, 36));
            this.f43352u5.addView(new Space(this.E), c8.na.o(12, -1));
            jq0 jq0Var3 = new jq0(this);
            this.f43371w5 = jq0Var3;
            jq0Var3.f58163s0 = true;
            jq0Var3.setRad(18);
            this.f43371w5.setRestoreState(false);
            this.f43371w5.setOnClickListener(new in0(this, 16));
            this.f43352u5.addView(this.f43371w5, c8.na.o(-2, 36));
            this.f43218f0.addView(this.f43352u5, c8.na.e(-2, 36, 17));
            jq0 jq0Var4 = new jq0(this);
            this.f43381x5 = jq0Var4;
            jq0Var4.setUndoState(false);
            this.f43381x5.setRad(18);
            jq0 jq0Var5 = this.f43381x5;
            jq0Var5.f58163s0 = true;
            jq0Var5.setOnClickListener(new in0(this, 17));
            this.f43218f0.addView(this.f43381x5, c8.na.e(-2, 36, 17));
            jq0 jq0Var6 = new jq0(this);
            this.f43391y5 = jq0Var6;
            jq0Var6.setOutlineState(false);
            this.f43391y5.setRad(18);
            jq0 jq0Var7 = this.f43391y5;
            jq0Var7.f58163s0 = true;
            jq0Var7.setOnClickListener(new in0(this, 18));
            this.f43218f0.addView(this.f43391y5, c8.na.e(-2, 36, 17));
            U2(false, false);
            Y2(false, false);
            k0 k0Var = new k0(19, this.E, this);
            this.Y1 = k0Var;
            k0Var.addView(this.V1, c8.na.e(-1, -1, 83));
            this.f43218f0.addView(this.Y1, c8.na.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, c8.na.e(-1, -1, 51));
            this.f43218f0.addView(this.Z1, c8.na.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f43218f0.addView(frameLayout3, c8.na.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f43218f0.addView(frameLayout4, c8.na.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.T7 = textView6;
            textView6.setSingleLine(true);
            this.T7.setVisibility(8);
            this.T7.setText(org.telegram.messenger.hd.N0(2131752121, "ChooseCover"));
            this.T7.setGravity(1);
            this.T7.setTextSize(1, 14.0f);
            this.T7.setTextColor(-7566196);
            this.f43218f0.addView(this.T7, c8.na.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            oi.v1 v1Var = new oi.v1(this, this.E, h6Var);
            this.T0 = v1Var;
            int L = org.telegram.messenger.g0.L(52.0f);
            int L2 = org.telegram.messenger.g0.L(38.0f);
            v1Var.L = L;
            v1Var.M = L2;
            oi.v1 v1Var2 = this.T0;
            v1Var2.f40336s0 = true;
            fh.g a21 = this.Z.a(v1Var2);
            a21.p(c8.j0.j(h6Var));
            v1Var2.setBlurredBackgroundDrawable(a21);
            this.f43218f0.addView(this.T0, c8.na.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(org.telegram.messenger.hd.N0(2131745444, "Send"));
            c8.sa.a(this.T0);
            this.T0.setOnClickListener(new in0(this, 19));
            this.T0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.ge0 ge0Var = new org.telegram.ui.Components.ge0(this.E);
            this.U0 = ge0Var;
            LinearLayout linearLayout3 = ge0Var.f35509b;
            fh.g a22 = this.Z.a(linearLayout3);
            a22.p(c8.j0.j(h6Var));
            a22.r(org.telegram.messenger.g0.L(18.0f));
            a22.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout3.setBackground(a22);
            LinearLayout linearLayout4 = this.U0.f35510c;
            fh.g a23 = this.Z.a(linearLayout4);
            a23.p(c8.j0.j(h6Var));
            a23.r(org.telegram.messenger.g0.L(18.0f));
            a23.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout4.setBackground(a23);
            this.U0.setVisibility(8);
            this.U0.f35509b.setOnClickListener(new in0(this, 20));
            this.U0.f35510c.setOnClickListener(new in0(this, 21));
            this.f43218f0.addView(this.U0, c8.na.e(-1, 56, 80));
            d61 d61Var2 = new d61(20, this.E, this);
            this.I0 = d61Var2;
            d61Var2.setOrientation(0);
            this.I0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            d61 d61Var3 = this.I0;
            fh.g a24 = this.Z.a(d61Var3);
            a24.p(c8.j0.j(h6Var));
            a24.q(org.telegram.messenger.g0.L(2.0f));
            a24.r(org.telegram.messenger.g0.L(22.0f));
            d61Var3.setBackground(a24);
            this.Q0.addView(this.I0, c8.na.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.f43171a1 = imageView;
            imageView.setScaleType(scaleType);
            this.f43171a1.setImageResource(2131231730);
            this.f43171a1.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43171a1, c8.na.o(48, 48));
            this.f43171a1.setOnClickListener(new in0(this, 22));
            this.f43171a1.setContentDescription(org.telegram.messenger.hd.N0(2131751686, "CropImage"));
            ImageView imageView2 = new ImageView(this.E);
            this.f43191c1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f43191c1.setImageResource(2131232284);
            this.f43191c1.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43191c1, c8.na.o(48, 48));
            this.f43191c1.setOnClickListener(new in0(this, 23));
            this.f43191c1.setContentDescription(org.telegram.messenger.hd.N0(2131754782, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.E);
            this.f43181b1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f43181b1.setImageResource(2131231743);
            this.f43181b1.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43181b1, c8.na.o(48, 48));
            this.f43181b1.setOnClickListener(new in0(this, 24));
            this.f43181b1.setContentDescription(org.telegram.messenger.hd.N0(2131754839, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.E);
            this.Z0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Z0.setImageResource(2131231740);
            this.Z0.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.Z0, c8.na.o(48, 48));
            this.Z0.setOnClickListener(new in0(this, 25));
            this.Z0.setContentDescription(org.telegram.messenger.hd.N0(2131754809, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(this.E);
            this.f43261k1 = v51Var;
            v51Var.setTag(1);
            this.f43261k1.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.Y7 = t2();
            org.telegram.ui.Components.v51 v51Var2 = this.f43261k1;
            if (this.f43268k8 && this.Z7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            v51Var2.a(Math.min(this.f43216e8, this.f43226f8), z11, this.f43320r);
            this.f43261k1.setContentDescription(org.telegram.messenger.hd.N0(2131754734, "AccDescrVideoQuality"));
            this.I0.addView(this.f43261k1, c8.na.o(48, 48));
            this.f43261k1.setOnClickListener(new jg0(4, this, parentActivity));
            ImageView imageView5 = new ImageView(this.E);
            this.f43200d1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f43200d1.setImageResource(2131231757);
            this.f43200d1.setBackground(org.telegram.ui.ActionBar.m6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43200d1, c8.na.o(48, 48));
            this.f43200d1.setOnClickListener(new in0(this, 26));
            this.f43200d1.setContentDescription(org.telegram.messenger.hd.N0(2131754810, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(this.F, 3);
            this.V0 = x0Var2;
            x0Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f43218f0.addView(this.V0, c8.na.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new in0(this, 27));
            ((TextView) this.V0.f32278b).setOnClickListener(new in0(this, 28));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.g0(-12763843, 0));
            this.W0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
            this.W0.setText(org.telegram.messenger.hd.M0(2131751684).toUpperCase());
            this.W0.setTypeface(org.telegram.messenger.g0.o());
            this.V0.addView(this.W0, c8.na.e(-2, -1, 49));
            this.W0.setOnClickListener(new in0(this, 29));
            org.telegram.ui.Components.n10 n10Var = new org.telegram.ui.Components.n10(this.f43218f0.getContext(), this);
            this.f43327r6 = n10Var;
            n10Var.b();
            this.f43336s6 = true;
            this.f43327r6.h = this;
            qn0 qn0Var = new qn0(this);
            this.C4.H0(this.f43218f0);
            ImageReceiver imageReceiver = this.C4;
            imageReceiver.l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.d0(qn0Var);
            this.B4.H0(this.f43218f0);
            ImageReceiver imageReceiver2 = this.B4;
            imageReceiver2.l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.d0(qn0Var);
            this.D4.H0(this.f43218f0);
            ImageReceiver imageReceiver3 = this.D4;
            imageReceiver3.l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.d0(qn0Var);
            int rotation = ((WindowManager) org.telegram.messenger.t0.f26895b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f43218f0.getContext(), 2131232694);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(org.telegram.messenger.g0.L(1.0f));
            this.O0.c(w1(i14), -1);
            this.O0.setVisibility(8);
            rq0 rq0Var6 = this.f43218f0;
            CheckBox checkBox2 = this.O0;
            if (rotation != 3 && rotation != 1) {
                f10 = 71.0f;
            } else {
                f10 = 61.0f;
            }
            rq0Var6.addView(checkBox2, c8.na.d(34, 34.0f, 53, 0.0f, f10, 11.0f, 0.0f));
            if (!this.f43330s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24004m;
            }
            this.O0.setOnClickListener(new vn0(this, 0));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            rq0 rq0Var7 = this.f43218f0;
            if (rotation != 3 && rotation != 1) {
                f11 = 68.0f;
            } else {
                f11 = 58.0f;
            }
            rq0Var7.addView(counterView, c8.na.d(40, 40.0f, 53, 0.0f, f11, 64.0f, 0.0f));
            if (!this.f43330s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24004m;
            }
            this.P0.setOnClickListener(new vn0(this, 1));
            cr0 cr0Var = new cr0(this.E);
            this.f43303p1 = cr0Var;
            cr0Var.setVisibility(8);
            this.f43303p1.setAlpha(0.0f);
            this.f43303p1.setLayoutManager(new jg.b0());
            cr0 cr0Var2 = this.f43303p1;
            l4 l4Var = new l4(15, this, this.E);
            this.f43312q1 = l4Var;
            cr0Var2.setAdapter(l4Var);
            this.f43218f0.addView(this.f43303p1, c8.na.e(-1, 103, 51));
            this.f43303p1.setOnItemClickListener(new h(this, 22));
            UndoView undoView = new UndoView(this.F, null, false, h6Var);
            this.f43295o1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(112.0f));
            this.f43295o1.h(-115203550, -1);
            this.f43218f0.addView(this.f43295o1, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.g0.C1()) {
                View view2 = new View(this.F);
                this.T3 = view2;
                view2.setContentDescription(org.telegram.messenger.hd.N0(2131754929, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new vn0(this, 2));
                this.f43218f0.addView(this.T3, c8.na.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.t6.Q(this.f43294o0, org.telegram.ui.ActionBar.a6.e(w1(i15), 6.0f), org.telegram.ui.ActionBar.t6.M(i15), org.telegram.ui.ActionBar.t6.e(i15), h6Var);
            org.telegram.ui.ActionBar.t6.U(this.f43294o0, i16, h6Var);
            wo0 wo0Var = this.R;
            wo0Var.f32251j0 = true;
            wo0Var.f32247h0 = false;
            org.telegram.ui.Cells.v9 n10 = wo0Var.n(this.f43236h0.getContext());
            if (n10 != null) {
                org.telegram.messenger.g0.E2(n10);
                this.f43218f0.addView(n10);
            }
            this.R.S(this.f43218f0);
            this.R.R();
            this.f43169a.a(false, false);
            return;
        }
        s3();
    }

    public final void J0() {
        if (this.E != null && this.f43236h0 != null) {
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
            ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.f43189c);
            m2(false);
            try {
                if (this.f43236h0.getParent() != null) {
                    ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.f43236h0);
                    U1();
                }
                this.f43236h0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.ic icVar = this.f43256j5;
            if (icVar != null) {
                icVar.a();
                this.f43256j5 = null;
            }
            this.f43244i0.setImageBitmap(null);
            if (this == f43168g9) {
                f43168g9 = null;
            } else {
                f43167f9 = null;
            }
            U1();
        }
    }

    public final void J2(org.telegram.ui.Components.ui uiVar) {
        this.f43182b2 = uiVar;
        bg.v0 v0Var = this.f43192c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43192c2 = null;
        }
        if (uiVar != null) {
            if (uiVar.f30165k1 == null) {
                Window window = uiVar.getWindow();
                ?? obj = new Object();
                obj.f3326c = new a1.c(new WeakReference(window), 11);
                uiVar.f30165k1 = obj;
            }
            bg.w0 w0Var = uiVar.f30165k1;
            w0Var.getClass();
            this.f43192c2 = new bg.v0(w0Var);
        }
    }

    public final void K0() {
        if (this.C4.m() == null && !this.f43234g7.isEmpty() && this.d2 != 1) {
            String str = this.C4.R;
            String str2 = this.f43380x4;
            if (str2 == null || !str2.equals(str)) {
                this.f43370w4 = 0;
                org.telegram.messenger.ic p10 = this.C4.p();
                int i7 = this.C4.V;
                if (str != null && p10 != null && p10.f24668c != null) {
                    Utilities.f22774e.c(new org.telegram.ui.Components.lp0(this, p10, i7, str, 15));
                }
            }
        }
    }

    public final void K2() {
        bn bnVar;
        TLRPC.Chat chat;
        vq0 vq0Var = this.d;
        if (vq0Var != null) {
            if (vq0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f43285n && (bnVar = this.f43272l4) != null && (chat = bnVar.f45958e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.c5.K(this.E, org.telegram.messenger.hd.N0(2131745114, "Slowmode"), org.telegram.messenger.hd.N0(2131745107, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, j1());
            boolean x10 = this.d.x(this.P4);
            this.O0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f43312q1.i(k10);
                    this.f43303p1.y0(k10);
                } else {
                    this.f43312q1.s(k10);
                    if (k10 == 0) {
                        this.f43312q1.g(0);
                    }
                }
            }
            z3();
        }
    }

    public final void L0() {
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Z7)), this.Y7);
        edit.commit();
        C3();
        A3();
    }

    public final void L2() {
        float q10 = this.C4.q();
        float o4 = this.C4.o();
        if (q10 != 0.0f && o4 != 0.0f) {
            float g12 = g1(this.f43351u4);
            float e12 = e1();
            float min = Math.min(e12 / o4, g12 / q10);
            float max = Math.max(g12 / ((int) (q10 * min)), e12 / ((int) (o4 * min)));
            this.f43176a6 = max;
            u3(max);
        }
    }

    public final void M0() {
        bg.v0 v0Var = this.f43283m7;
        if (v0Var != null) {
            v0Var.a();
            this.f43283m7 = null;
        }
        bg.v0 v0Var2 = this.f43192c2;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43192c2 = null;
        }
        try {
            if (this.f43236h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.f43236h0);
                U1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void M2(CharSequence charSequence) {
        uq0 uq0Var = this.N;
        this.f43212e4 = charSequence;
        uq0Var.c(charSequence);
        h3(true, false);
    }

    public final void N0(android.graphics.Canvas r51, org.telegram.ui.Components.ga r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N0(android.graphics.Canvas, org.telegram.ui.Components.ga, int, int, boolean, boolean, boolean):void");
    }

    public final void N2(boolean z10, boolean z11) {
        if (this.f43271l3 != z10) {
            if (z10) {
                this.f43252j0.setTag(1);
            } else {
                this.f43252j0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f43263k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f43271l3 = z10;
            float f10 = 0.0f;
            int i7 = 0;
            if (z11) {
                if (z10) {
                    this.f43247i3.setVisibility(0);
                }
                float alpha = this.f43247i3.getAlpha();
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new gn0(this, 0));
                ofFloat.addListener(new pp0(this, z10, 0));
                this.f43263k3 = ofFloat;
                ofFloat.start();
            } else {
                dr0 dr0Var = this.f43247i3;
                if (!z10) {
                    i7 = 8;
                }
                dr0Var.setVisibility(i7);
                dr0 dr0Var2 = this.f43247i3;
                if (z10) {
                    f10 = 1.0f;
                }
                dr0Var2.setAlpha(f10);
            }
            if (this.f43270l2 && this.f43258j7 == null) {
                if (z10) {
                    this.f43302p0.T(9);
                } else {
                    this.f43302p0.u(9);
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
                ArrayList arrayList = this.f43234g7;
                if (i7 < arrayList.size()) {
                    vq0 vq0Var = this.d;
                    if (vq0Var != null && !vq0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.P4);
                    if (obj instanceof org.telegram.messenger.ff) {
                        return ((org.telegram.messenger.ff) obj).j();
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
        sq0 sq0Var = this.f43258j7;
        if (sq0Var != null) {
            if (sq0Var.a(i7) || this.f43258j7.e(i7)) {
                int i10 = org.telegram.messenger.cz.f23354a;
                if (org.telegram.messenger.qc.e(1024)) {
                    File b10 = this.f43258j7.b(i7);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.cz.B0 && (this.f43258j7.d(i7) instanceof TLRPC.Document)) {
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
            if (!org.telegram.messenger.cz.f23361c0) {
                d = 1.0f;
            } else {
                int i10 = this.f43289n4;
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.g0.f24004m * 1.5f));
            int height = this.Q0.getHeight() + org.telegram.messenger.g0.f24005n;
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f43218f0.getWidth(), this.f43218f0.getHeight() + org.telegram.messenger.g0.f24005n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.G7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.G7.addRect(0.0f, 0.0f, this.f43218f0.getWidth(), f10, direction);
            this.G7.addRect(0.0f, (this.f43218f0.getHeight() + org.telegram.messenger.g0.f24005n) - i11, this.f43218f0.getWidth(), this.f43218f0.getHeight() + org.telegram.messenger.g0.f24005n, direction);
            canvas.clipPath(this.G7);
            canvas.drawColor(-16777216);
            N0(canvas, this.f43199d0, 0, 0, true, true, false);
            canvas.save();
            this.L7.reset();
            this.L7.postScale(1.0f, f10 / 16.0f);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f43218f0.getWidth(), f10, this.H7);
            this.M7.reset();
            this.M7.postScale(1.0f, i11 / 16.0f);
            this.M7.postTranslate(0.0f, (this.f43218f0.getHeight() - i11) + org.telegram.messenger.g0.f24005n);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f43218f0.getHeight() + org.telegram.messenger.g0.f24005n) - i11, this.f43218f0.getWidth(), this.f43218f0.getHeight() + org.telegram.messenger.g0.f24005n, this.I7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean P1() {
        if (this.f43207e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void Q0(float r10, float r11, float r12, float r13, android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Q0(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void Q1() {
        WindowManager.LayoutParams layoutParams = this.f43208e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.f43236h0, this.f43208e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f43236h0.setFocusable(true);
        this.f43218f0.setFocusable(true);
    }

    public final void Q2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                org.telegram.ui.ActionBar.t1 t1Var = this.Q1;
                if (t1Var != null) {
                    t1Var.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
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
        Paint paint = f43162a9;
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f43280m4;
        if ((g2Var instanceof bn) && org.telegram.messenger.v3.V(((bn) g2Var).f45958e)) {
            org.telegram.ui.Components.gc f10 = new org.telegram.ui.Components.lc(frameLayout, this.f43368w2).f(org.telegram.messenger.np.u1(this.U).X4, new hn0(this, 29));
            f10.v = new ao0(this, 0);
            this.f43292n7 = f10.j();
            return true;
        }
        return false;
    }

    public final void S0(TLRPC.Document document, TLRPC.Document document2, boolean z10, org.telegram.messenger.r10 r10Var) {
        float f10;
        this.f43354u7 = document;
        this.f43345t7 = document2;
        this.f43363v7 = z10;
        this.f43373w7 = false;
        this.f43383x7 = r10Var;
        this.f43186b6 = 0.0f;
        this.f43224f6 = 0.0f;
        if (this.f43307p5 != null) {
            jq0 jq0Var = this.f43391y5;
            if (jq0Var != null) {
                jq0Var.m(false, false);
            }
            this.f43307p5.b();
            ArrayList arrayList = this.f43326r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f43354u7 != null) {
            ArrayList arrayList2 = this.f43326r5;
            if (arrayList2 == null) {
                this.f43326r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.f43354u7;
            int i7 = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(i7).o0(documentAttribute.stickerset, true);
                        if (o02 != null && o02.packs != null) {
                            for (int i11 = 0; i11 < o02.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = o02.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f28404id)) && org.telegram.messenger.j6.g(tL_stickerPack.emoticon) != null) {
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
                this.f43326r5.addAll(arrayList3);
            }
        }
        jq0 jq0Var2 = this.f43344t5;
        if (jq0Var2 != null) {
            jq0Var2.setCutOutState(false);
        }
        Y2(true, false);
        ImageView imageView = this.f43200d1;
        if (imageView != null) {
            if (this.f43363v7) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.E, this.f43368w2);
        String N0 = org.telegram.messenger.hd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, "OK"), null);
        org.telegram.messenger.gj gjVar = this.T4;
        if (gjVar != null && org.telegram.messenger.gj.L4(gjVar.f24177k) && org.telegram.messenger.w7.G(this.T4.K1).S(this.f43195c5[0])) {
            t1Var.U = org.telegram.messenger.hd.N0(2131747010, null);
        } else {
            t1Var.U = org.telegram.messenger.hd.N0(2131747024, null);
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
        vq0 vq0Var = this.d;
        if (vq0Var != null && vq0Var.l()) {
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
                public final PhotoViewer f46980b;

                {
                    this.f46980b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f46980b;
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
                                photoViewer.f43219f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43228g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43237h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f46980b;
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
                                photoViewer2.f43219f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43228g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43237h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
        } else if (!z10 && ycVar.getTag() != null) {
            ycVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f46980b;

                {
                    this.f46980b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f46980b;
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
                                photoViewer.f43219f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43228g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43237h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f46980b;
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
                                photoViewer2.f43219f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43228g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43237h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new sg(3, ycVar)).start();
        }
        if (z10) {
            num = 1;
        }
        ycVar.setTag(num);
    }

    public final void U1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f43078a1.remove(this.f43340t1);
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f43280m4;
        if (g2Var != null && g2Var.getFragmentView() != null) {
            this.f43282m6 = 1.0f;
            View fragmentView = this.f43280m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.ui uiVar = this.f43182b2;
            if (uiVar != null) {
                org.telegram.ui.ActionBar.m2 m2Var = uiVar.f30145c;
                m2Var.setScaleX(1.0f);
                m2Var.setScaleY(1.0f);
            }
        }
    }

    public final void U2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        vq0 vq0Var = this.d;
        boolean z14 = false;
        if (vq0Var != null && vq0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        bp0 bp0Var = this.V1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        T2(bp0Var, z13, z11, this.f43393y7);
        cp0 cp0Var = this.W1;
        if (z10 && z12) {
            z14 = true;
        }
        T2(cp0Var, z14, z11, this.f43402z7);
    }

    public final void V1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.G2 != null && this.T4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.G2.U() == -9223372036854775807L) {
                        this.f43173a3 = intValue / ((float) this.T4.L0());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.G2.p0(j3);
                    this.f43314q3.h(true, ((float) j3) / ((float) this.G2.U()));
                    this.f43324r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.E instanceof LaunchActivity) {
                    cx cxVar = new cx(null);
                    cxVar.f46731p2 = url;
                    ((LaunchActivity) this.E).u0(cxVar, false, true);
                    z0(false, false);
                    return;
                }
                return;
            } else if (this.f43272l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.u41) || org.telegram.messenger.g0.H3(url))) {
                org.telegram.ui.Components.c5.n0(this.f43272l4, url, true, true);
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

    public final void W1(xq0 xq0Var) {
        if (this.f43358v2) {
            m2(true);
        }
        org.telegram.messenger.gj gjVar = this.T4;
        if (gjVar != null && !gjVar.P) {
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        }
        this.f43207e = false;
        this.f43217f = false;
        this.f43238h2 = false;
        this.f43335s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f43175a5 = null;
        this.f43185b5 = null;
        this.f43249i5 = null;
        this.f43213e5 = null;
        this.f43323r2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f43247i3 != null) {
            N2(false, false);
        }
        xp0 xp0Var = this.U1;
        if (xp0Var != null) {
            xp0Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.f43210e2 = false;
        this.f43220f2 = false;
        this.f43229g2 = false;
        this.f43246i2 = false;
        org.telegram.messenger.ic icVar = this.f43256j5;
        if (icVar != null) {
            icVar.a();
            this.f43256j5 = null;
        }
        this.f43182b2 = null;
        bg.v0 v0Var = this.f43192c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43192c2 = null;
        }
        org.telegram.ui.Components.c6 c6Var = this.f43262k2;
        if (c6Var != null) {
            c6Var.w(this.f43218f0);
            this.f43262k2 = null;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            xo0 xo0Var = this.X0[i7];
            if (xo0Var != null) {
                xo0Var.d(-1, false, true);
            }
        }
        n2(0);
        yo0 yo0Var = this.S7;
        if (yo0Var != null) {
            yo0Var.a();
        }
        this.f43295o1.d(0, false);
        this.C4.w0(null);
        this.F4.o();
        this.B4.w0(null);
        this.E4.o();
        this.D4.w0(null);
        this.G4.o();
        this.f43218f0.post(new kn0(this, xq0Var, 0));
        vq0 vq0Var = this.d;
        if (vq0Var != null) {
            vq0Var.G();
        }
        org.telegram.ui.Components.z20 z20Var = this.f43277m1;
        z20Var.d.clear();
        z20Var.f42604e.clear();
        z20Var.f42601c.clear();
        vq0 vq0Var2 = this.d;
        if (vq0Var2 != null) {
            vq0Var2.D();
        }
        this.d = null;
        this.f43312q1.f();
        this.f43258j7 = null;
        this.f43335s4 = false;
        this.f43301o8 = 0.0f;
        this.f43310p8 = 1.0f;
        if (xq0Var != null) {
            xq0Var.f53898a.O0(true, true);
        }
        bn bnVar = this.f43272l4;
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
            this.f43178a8 = this.Y7;
        }
        AnimatorSet animatorSet = this.U7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.U7 = new AnimatorSet();
        float f20 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f43260k0.setVisibility(0);
                View view = this.f43260k0;
                if (this.d2 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f43260k0;
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
            if (this.f43332s1) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n4Var, property, 0.0f, editTextHeight + i7);
            di.n4 n4Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n4Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, org.telegram.messenger.g0.L(158.0f));
            View view3 = this.f43260k0;
            if (this.S4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.O7.setTag(null);
            AnimatorSet animatorSet3 = this.U7;
            yq0 yq0Var = this.O7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(yq0Var, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.P7, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            View view4 = this.f43260k0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.U7.addListener(new pp0(this, z10, 3));
        this.U7.setDuration(200L);
        this.U7.setInterpolator(org.telegram.messenger.g0.G);
        this.U7.start();
        float f21 = 0.25f;
        if (this.f43219f1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f43219f1.animate();
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
        if (this.f43228g1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f43228g1.animate();
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
        if (this.f43237h1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f43237h1.animate();
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
                    if (!this.f43330s) {
                        i10 = org.telegram.messenger.g0.f24004m;
                    }
                    return this.M1.getAdditionalTop() + L + i10;
                } else if (i7 != 0 && i7 != 4 && i7 != 5) {
                    int L2 = org.telegram.messenger.g0.L(14.0f);
                    if (!this.f43330s) {
                        i10 = org.telegram.messenger.g0.f24004m;
                    }
                    return L2 + i10;
                }
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                if (!this.f43330s) {
                    i10 = org.telegram.messenger.g0.f24004m;
                }
                return L3 + i10;
            }
        }
        return 0;
    }

    public final void X1(org.telegram.messenger.gj r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.gc r24, org.telegram.messenger.gc r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.xq0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X1(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.gc, org.telegram.messenger.gc, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.xq0):void");
    }

    public final void X2() {
        long a10;
        if (this.E != null) {
            bn bnVar = this.f43272l4;
            if (bnVar != null) {
                a10 = bnVar.a();
            } else {
                vq0 vq0Var = this.d;
                if (vq0Var != null) {
                    a10 = vq0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a10;
            org.telegram.ui.Components.c5.H(this.E, j3, -1L, 0, false, new qn0(this), null, new org.telegram.ui.Components.z4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false)), null);
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
            this.f43307p5.animate().setListener(null).cancel();
            tg.f2 f2Var = this.f43307p5;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f2Var.setVisibility(i10);
            this.f43307p5.setAlpha(this.Q0.getAlpha());
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
        } else if (z10 && this.f43307p5.getTag() == null) {
            this.f43307p5.animate().setListener(null).cancel();
            this.s5.animate().setListener(null).cancel();
            if (this.f43307p5.getVisibility() != 0) {
                this.f43307p5.setVisibility(0);
                this.f43307p5.animate().alpha(1.0f).start();
                this.s5.setVisibility(0);
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f43307p5.getTag() != null) {
            this.f43307p5.animate().setListener(null).cancel();
            this.f43307p5.animate().alpha(0.0f).setListener(new on(this.f43307p5)).start();
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new on(this.s5)).start();
        }
        tg.f2 f2Var2 = this.f43307p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        f2Var2.setTag(num);
        if (z10 && this.f43344t5.f58159o0 != 1 && !this.f43363v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f43344t5.animate().setListener(null).cancel();
            jq0 jq0Var = this.f43344t5;
            if (z12) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            jq0Var.setVisibility(i7);
            jq0 jq0Var2 = this.f43344t5;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jq0Var2.setAlpha(f11);
        } else if (z12 && this.f43344t5.getTag() == null) {
            this.f43344t5.animate().setListener(null).cancel();
            if (this.f43344t5.getVisibility() != 0) {
                this.f43344t5.setVisibility(0);
            }
            this.f43344t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f43344t5.getTag() != null) {
            this.f43344t5.animate().setListener(null).cancel();
            this.f43344t5.animate().alpha(0.0f).setListener(new on(this.f43344t5)).start();
        }
        jq0 jq0Var3 = this.f43344t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        jq0Var3.setTag(num2);
        if (z10 && this.f43344t5.f58159o0 == 1 && !this.f43363v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(z13, z11);
        tg.f2 f2Var3 = this.f43307p5;
        if (z10 && this.f43344t5.f58159o0 == 1 && this.f43391y5.f49044u0 && !this.f43361v5.f49044u0 && !this.f43371w5.f49044u0) {
            z14 = true;
        } else {
            z14 = false;
        }
        f2Var3.setOutlineVisible(z14);
        if (!z10 || this.f43344t5.f58159o0 != 1 || this.f43361v5.f49044u0 || this.f43371w5.f49044u0) {
            z15 = false;
        }
        if (!z11) {
            this.f43391y5.animate().setListener(null).cancel();
            jq0 jq0Var4 = this.f43391y5;
            if (z15) {
                i12 = 0;
            }
            jq0Var4.setVisibility(i12);
            jq0 jq0Var5 = this.f43391y5;
            if (z15) {
                f13 = 1.0f;
            }
            jq0Var5.setAlpha(f13);
            jq0 jq0Var6 = this.f43391y5;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            jq0Var6.setScaleX(f10);
            jq0 jq0Var7 = this.f43391y5;
            if (!z15) {
                f14 = 0.8f;
            }
            jq0Var7.setScaleY(f14);
        } else if (z15 && this.f43391y5.getTag() == null) {
            this.f43391y5.animate().setListener(null).cancel();
            if (this.f43391y5.getVisibility() != 0) {
                this.f43391y5.setVisibility(0);
            }
            org.telegram.messenger.o10.o(this.f43391y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.nr.h, 400L);
        } else if (!z15 && this.f43391y5.getTag() != null) {
            this.f43391y5.animate().setListener(null).cancel();
            org.telegram.messenger.o10.o(this.f43391y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new on(this.f43391y5)), org.telegram.ui.Components.nr.h, 400L);
        }
        jq0 jq0Var8 = this.f43391y5;
        if (!z15) {
            num3 = null;
        }
        jq0Var8.setTag(num3);
    }

    public final ClippingImageView[] Z0(xq0 xq0Var) {
        int i7;
        if (!org.telegram.messenger.g0.Q1() && xq0Var != null && xq0Var.f53908m != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i7 + 1];
        clippingImageViewArr[0] = this.f43244i0;
        if (i7 != 0) {
            ClippingImageView clippingImageView = xq0Var.f53908m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(xq0Var.f53909n);
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
                    eq0 eq0Var = this.f43227g0;
                    if (eq0Var == null || !eq0Var.f37134y || !eq0Var.H) {
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
        eq0 eq0Var;
        if (!z10 || this.f43334s3.getTag() == null) {
            if (!z10 && this.f43334s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f43334s3.f38104s && ((eq0Var = this.f43227g0) == null || !eq0Var.f37134y || eq0Var.f37132w.isEmpty())) {
                this.f43350u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f43342t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            lp0 lp0Var = this.f43334s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            lp0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43342t3 = animatorSet2;
            lp0 lp0Var2 = this.f43334s3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lp0Var2, property, f10);
            lp0 lp0Var3 = this.f43334s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lp0Var3, property2, f11);
            lp0 lp0Var4 = this.f43334s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(lp0Var4, property3, f13);
            lp0 lp0Var5 = this.f43334s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(lp0Var5, property4, f12));
            this.f43342t3.setDuration(380L);
            this.f43342t3.setInterpolator(org.telegram.ui.Components.nr.h);
            this.f43342t3.addListener(new ip0(this, 1));
            this.f43342t3.start();
        }
    }

    @Override
    public final void a1() {
        B1();
    }

    public final void a2(ArrayList arrayList, int i7, long j3, long j10, long j11, vq0 vq0Var) {
        d2((org.telegram.messenger.gj) arrayList.get(i7), null, null, null, arrayList, null, null, i7, vq0Var, null, j3, j10, j11, true, null, null);
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
            yo0 yo0Var = this.S7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yo0Var, View.TRANSLATION_Y, yo0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.nr.f37917f);
            this.A7.start();
        } else if (!z10 && this.R7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            yo0 yo0Var2 = this.S7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yo0Var2, View.TRANSLATION_Y, yo0Var2.getTranslationY(), org.telegram.messenger.g0.L(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new on(this.R7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.nr.f37917f);
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
        vq0 vq0Var = this.d;
        if (vq0Var != null && vq0Var.A()) {
            return this.W1;
        }
        return this.V1;
    }

    public final void b2(ArrayList arrayList, int i7, vq0 vq0Var) {
        d2(null, null, null, null, null, arrayList, null, i7, vq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3() {
        org.telegram.ui.Components.i61 i61Var;
        if (this.f43332s1 && (i61Var = this.G2) != null && !i61Var.d0()) {
            if (!this.J4 || !O1() || this.d2 == 1) {
                if (!this.f43320r || this.d2 == 1) {
                    this.G2.B0(0.0f);
                }
                this.H2 = false;
                o3();
            }
        }
    }

    public final void c0(float f10, float f11, float f12, boolean z10) {
        if (this.f43176a6 == f10 && this.X5 == f11 && this.Y5 == f12) {
            return;
        }
        this.R6 = z10;
        this.f43214e6 = f10;
        this.f43196c6 = f11;
        this.f43204d6 = f12;
        this.f43291n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43308p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f39053g, 0.0f, 1.0f));
        this.f43308p6.setInterpolator(this.t6);
        this.f43308p6.setDuration(250);
        this.f43308p6.addListener(new ip0(this, 7));
        this.f43308p6.start();
    }

    public final Bitmap.CompressFormat c1() {
        if (this.d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void c2(TLRPC.FileLocation fileLocation, org.telegram.messenger.gc gcVar, pq0 pq0Var) {
        d2(null, fileLocation, gcVar, null, null, null, null, 0, pq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void c3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c3(int):void");
    }

    public final CharSequence d0() {
        int i7;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (P1() && this.d != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43234g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = b1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f43309p7 && !TextUtils.equals(this.f43318q7, text) && this.d.S(this.P4) != 0 && this.d.H() > 0) {
                    this.f43309p7 = false;
                }
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.U);
                bn bnVar = this.f43272l4;
                if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList Y = d02.Y(charSequenceArr, z10, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f43318q7 = charSequence;
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    ffVar.f28022a = charSequence;
                    ffVar.f28033n = Y;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    jfVar.I = charSequence;
                    jfVar.f28033n = Y;
                }
                if (text.length() != 0 && !this.d.x(this.P4)) {
                    K2();
                }
                vq0 vq0Var = this.d;
                if (vq0Var != null) {
                    vq0Var.e(text);
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
        if (!z10 && !(z11 = this.f43330s)) {
            measuredHeight = (org.telegram.messenger.g0.f24005n - this.f43341t2.bottom) + org.telegram.messenger.g0.f24010q.y;
            if ((i7 == 0 || i7 == 4 || i7 == 5) && this.d2 != 1 && !z11) {
                measuredHeight += org.telegram.messenger.g0.f24004m;
            }
        } else {
            measuredHeight = this.f43218f0.getMeasuredHeight();
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

    public final boolean d2(org.telegram.messenger.gj r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.gc r19, org.telegram.messenger.gc r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.vq0 r25, org.telegram.ui.bn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.sq0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d2(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.gc, org.telegram.messenger.gc, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.vq0, org.telegram.ui.bn, long, long, long, boolean, org.telegram.ui.sq0, java.lang.Integer):boolean");
    }

    public final void d3(int i7, boolean z10) {
        if (this.T4 != null) {
            m2(false);
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        } else if (this.f43249i5 != null) {
            TLObject d = this.f43258j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                m2(false);
                org.telegram.messenger.w7.G(this.U).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.z20 z20Var = this.f43277m1;
        if (z20Var != null) {
            z20Var.setAnimateBackground(true);
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

    public final void e0(Canvas canvas, int i7, int i10, int i11, int i12, float f10, og.g gVar, org.telegram.messenger.xe xeVar) {
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
        int i17 = gVar.f21850i;
        if (i17 != 90 && i17 != 270) {
            i16 = i15;
            i15 = i16;
        }
        int i18 = this.d2;
        if (i18 != 1 && (this.f43351u4 == 3 || this.f43299o6 == 3)) {
            f12 = 1.0f;
            f11 = f18;
        } else if (this.f43308p6 != null && (i13 = this.f43299o6) != -1) {
            int i19 = this.f43351u4;
            f11 = f18;
            if (i19 != 1 && i13 != 1 && ((i19 != 2 && i19 != 3) || i13 != -1)) {
                if (i13 == 0) {
                    f12 = this.f43274l6;
                } else {
                    f12 = 1.0f - this.f43274l6;
                }
            }
            f12 = 1.0f;
        } else {
            f11 = f18;
            int i20 = this.f43351u4;
            if (i20 == 2 || i20 == 3) {
                f12 = 0.0f;
            }
            f12 = 1.0f;
        }
        float f23 = gVar.f21851j;
        float f24 = gVar.f21852k;
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
        if (i18 != 1 && ((this.f43351u4 != 1 || this.f43299o6 == 0) && xeVar != null)) {
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
        if (i22 == 1 || gVar.f21844a) {
            int i23 = this.f43351u4;
            if (i23 != 1 && i22 != 1) {
                if (xeVar != null) {
                    f15 = xeVar.f27840c;
                    f16 = 1.0f;
                } else {
                    f15 = 1.0f;
                    f16 = 1.0f;
                }
                f13 = ((f29 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, f26, f16)) * f15;
            } else {
                float z12 = gVar.f21848f / com.google.android.gms.internal.vision.e2.z(gVar.f21853l, 1.0f, f26, 1.0f);
                float f33 = f17 / f25;
                if (f33 * f27 > f20) {
                    f33 = f20 / f27;
                }
                float f34 = (f33 / min) * z12;
                if (i22 == 1) {
                    if (i23 != 3 && (i14 = this.f43299o6) != 3) {
                        if (i14 == 0) {
                            f14 = gVar.f21854m;
                        }
                    } else {
                        f14 = ((gVar.f21854m - 1.0f) * f26) + 1.0f;
                    }
                    f34 /= f14;
                }
                f13 = f34;
            }
            float f35 = f13;
            canvas.translate(gVar.d * f12, gVar.f21847e * f12);
            canvas.scale(f35, f35);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21845b, f25, min, f12), com.google.android.gms.internal.vision.e2.D(gVar.f21846c, f27, min, f12));
            float f36 = gVar.f21849g + i17;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            if (this.d2 == 1 && (this.f43351u4 == 3 || this.f43299o6 == 3)) {
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
        return d1(this.f43351u4, false);
    }

    public final boolean e2(org.telegram.messenger.gj gjVar, bn bnVar, long j3, long j10, long j11, pq0 pq0Var) {
        return d2(gjVar, null, null, null, null, null, null, 0, pq0Var, bnVar, j3, j10, j11, true, null, null);
    }

    public final void e3() {
        float f10;
        boolean z10;
        int i7;
        wp0 wp0Var;
        int i10;
        wp0 wp0Var2;
        this.f43317q6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.f43294o0.setVisibility(8);
        this.f43219f1.setVisibility(8);
        this.f43228g1.setVisibility(8);
        this.f43237h1.setVisibility(8);
        org.telegram.ui.Components.rd0 rd0Var = this.D1;
        if (rd0Var != null) {
            rd0Var.setVisibility(4);
        }
        this.f43303p1.setVisibility(8);
        this.f43303p1.setAlpha(0.0f);
        this.f43303p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.f43303p1.setEnabled(false);
        this.L = false;
        if (this.f43254j2) {
            this.R1.setVisibility(4);
        }
        int i11 = this.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.f43234g7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            q3();
        }
        U2(false, true);
        Y2(false, true);
        Bitmap n10 = this.C4.n();
        float f11 = this.f43176a6;
        if (this.d2 == 11) {
            this.f43250i6 = this.Y5;
            this.f43242h6 = this.X5;
            this.f43257j6 = f11;
            this.f43266k6 = this.f43186b6;
            this.f43224f6 = 0.0f;
        }
        oq0 oq0Var = this.X4;
        if (n10 != null) {
            int q10 = this.C4.q();
            int o4 = this.C4.o();
            if (this.d2 == 1) {
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f43204d6 = L;
                f10 = 0.0f;
                if (this.M1 != null) {
                    this.f43204d6 = (wp0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i12 = this.E1.f21850i;
                if (i12 == 90 || i12 == 270) {
                    i10 = q10;
                    q10 = o4;
                    float f12 = q10;
                    float f13 = i10;
                    this.f43214e6 = p2(false) * (Math.min(g1(3) / f12, d1(3, false) / f13) / Math.min(g1(this.f43351u4) / f12, e1() / f13));
                    Rect rect = this.f43341t2;
                    this.f43196c6 = (rect.left / 2) - (rect.right / 2);
                    this.f43291n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f122 = q10;
                float f132 = i10;
                this.f43214e6 = p2(false) * (Math.min(g1(3) / f122, d1(3, false) / f132) / Math.min(g1(this.f43351u4) / f122, e1() / f132));
                Rect rect2 = this.f43341t2;
                this.f43196c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f43291n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -org.telegram.messenger.g0.L(44.0f);
                if (!this.f43330s) {
                    i7 = org.telegram.messenger.g0.f24004m / 2;
                } else {
                    i7 = 0;
                }
                float f14 = i13 + i7;
                this.f43204d6 = f14;
                if (this.M1 != null) {
                    float additionalTop = (wp0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f43204d6 = additionalTop;
                    this.f43204d6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.xe xeVar = oq0Var.f50620c;
                if (xeVar != null) {
                    int i14 = xeVar.f27845k;
                    if (i14 == 90 || i14 == 270) {
                        o4 = q10;
                        q10 = o4;
                    }
                    q10 = (int) (q10 * xeVar.f27841e);
                    i10 = (int) (o4 * xeVar.f27842f);
                    float f1222 = q10;
                    float f1322 = i10;
                    this.f43214e6 = p2(false) * (Math.min(g1(3) / f1222, d1(3, false) / f1322) / Math.min(g1(this.f43351u4) / f1222, e1() / f1322));
                    Rect rect22 = this.f43341t2;
                    this.f43196c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f43291n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f12222 = q10;
                float f13222 = i10;
                this.f43214e6 = p2(false) * (Math.min(g1(3) / f12222, d1(3, false) / f13222) / Math.min(g1(this.f43351u4) / f12222, e1() / f13222));
                Rect rect222 = this.f43341t2;
                this.f43196c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f43291n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        wp0 wp0Var3 = this.M1;
        if (wp0Var3 != null) {
            if (this.d2 == 11 && (oq0Var == null || oq0Var.f50620c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            wp0Var3.setDrawShadow(z10);
        }
        this.f43236h0.setClipChildren(true);
        this.f43260k0.setVisibility(4);
        this.f43308p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.g0.L(12.0f), f10);
        ofFloat.addUpdateListener(new gn0(this, 6));
        ofFloat2.addUpdateListener(new gn0(this, 7));
        this.f43308p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.r6.f39053g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.m0(true);
        this.f43308p6.setDuration(200L);
        this.f43308p6.addListener(new ip0(this, 3));
        this.f43308p6.start();
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f0():void");
    }

    public final int f1() {
        return g1(this.f43351u4);
    }

    public final void f2(ArrayList arrayList, int i7, int i10, boolean z10, vq0 vq0Var, bn bnVar) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var;
        this.f43246i2 = z10;
        oi.v1 v1Var = this.T0;
        int i11 = 0;
        if (v1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v1Var.getLayoutParams();
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
        if (i10 != 11 && this.f43307p5 != null) {
            this.f43363v7 = false;
            ImageView imageView = this.f43200d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            jq0 jq0Var = this.f43391y5;
            if (jq0Var != null) {
                jq0Var.m(false, false);
            }
            this.f43307p5.b();
            ArrayList arrayList2 = this.f43326r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f43207e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z12 && this.d2 != i10 && i10 == 1) {
            this.d2 = i10;
            this.f43358v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = vq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43312q1.f();
            this.f43258j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43207e = true;
            this.f43217f = true;
            n3(false, false);
            this.f43278m2 = false;
            B0();
            h3(false, false);
            this.f43211e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f43218f0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
            C1();
            x2();
        } else if (z12 && this.d2 != i10 && i10 == 11) {
            this.d2 = i10;
            this.f43358v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = vq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43312q1.f();
            this.f43258j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43207e = true;
            this.f43217f = true;
            n3(false, false);
            this.f43211e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f43218f0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
        } else {
            this.d2 = i10;
            if (i10 == 12) {
                this.d2 = 0;
                this.f43210e2 = true;
            }
            int i12 = this.d2;
            if (i12 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43229g2 = z11;
            if (i12 == 13 || z11) {
                this.d2 = 0;
                this.f43220f2 = true;
            }
            this.f43169a.a(z11, false);
            if (this.d2 == 11) {
                this.f43260k0.setBackgroundColor(-16777216);
            }
            uq0 uq0Var = this.N;
            if (uq0Var != null && (o6Var = uq0Var.d) != null) {
                if (this.f43220f2) {
                    i11 = 8;
                }
                o6Var.setVisibility(i11);
            }
            d2(null, null, null, null, null, null, arrayList, i7, vq0Var, bnVar, 0L, 0L, 0L, true, null, null);
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
        int width = this.f43218f0.getWidth();
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
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            i61Var.g0();
            return;
        }
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null) {
            eq0Var.f();
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
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            if (!d1.f.u() && !this.f43320r) {
                z10 = false;
            } else {
                z10 = true;
            }
            i61Var.t0(z10);
        }
        if (this.G2 != null && d1.f.u() && ((atomicInteger = d1.f.f7610b) == null || atomicInteger.get() <= 0)) {
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
            } else if (d1.f.f7609a == 0) {
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
                    f10 = (float) e11.f11441r;
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
                        f11 = (float) e12.f11441r;
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
        xq xqVar = this.f43376x0;
        if (xqVar != null) {
            xqVar.a(d1.f.u());
        }
        this.O8 = false;
    }

    public float getAnimationValue() {
        return this.f43274l6;
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
        org.telegram.messenger.xe xeVar;
        if (this.f43308p6 != null) {
            f14 = org.telegram.messenger.g0.T1(0.0f, this.f43233g6, this.f43274l6);
            f10 = org.telegram.messenger.g0.T1(this.f43176a6, this.f43214e6, this.f43274l6);
            f11 = org.telegram.messenger.g0.T1(this.f43186b6, this.f43224f6, this.f43274l6);
            f12 = org.telegram.messenger.g0.T1(this.Y5, this.f43204d6, this.f43274l6);
            f13 = org.telegram.messenger.g0.T1(this.X5, this.f43196c6, this.f43274l6);
        } else {
            f10 = this.f43176a6;
            f11 = this.f43186b6;
            f12 = this.Y5;
            f13 = this.X5;
            if (this.f43291n6 != 0) {
                f13 = this.f43196c6;
                f12 = this.f43204d6;
                f10 = this.f43214e6;
            }
            f14 = 0.0f;
        }
        int g12 = g1(this.f43351u4);
        int e12 = e1();
        canvas.translate(W0(this.f43351u4), X0(this.f43351u4));
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
        int i7 = gVar.f21850i;
        if (i7 != 90 && i7 != 270) {
            o4 = q10;
            q10 = o4;
        }
        float f25 = gVar.f21851j;
        float f26 = gVar.f21852k;
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
        oq0 oq0Var = this.X4;
        if (i10 != 1 && ((this.f43351u4 != 1 || this.f43299o6 == 0) && oq0Var.f50620c != null)) {
            float f34 = f30 * f33;
            float f35 = f32 * f33;
            if (f21 * f23 > f22) {
                f21 = f24;
            }
            float z10 = com.google.android.gms.internal.vision.e2.z((f20 * f21) / f29, f34, 0.0f, f34);
            float z11 = com.google.android.gms.internal.vision.e2.z((f23 * f21) / f29, f35, 0.0f, f35);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.d2 == 1 || gVar.f21844a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.messenger.xe xeVar2 = oq0Var.f50620c;
                if (xeVar2 != null && xeVar2.f27846l) {
                    f17 = -1.0f;
                } else {
                    f17 = 1.0f;
                }
                textureView.setScaleX(f17);
                qq0 qq0Var = this.F2;
                if (qq0Var != null) {
                    qq0Var.setScaleX(this.C2.getScaleX());
                }
            }
            org.telegram.messenger.xe xeVar3 = oq0Var.f50620c;
            if (xeVar3 != null) {
                f15 = xeVar3.f27840c;
                f16 = 1.0f;
            } else {
                f15 = 1.0f;
                f16 = 1.0f;
            }
            float z12 = ((f33 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, 0.0f, f16)) * f15;
            canvas.translate(gVar.d * f16, gVar.f21847e * f16);
            canvas.scale(z12, z12);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21845b, f27, min, f16), com.google.android.gms.internal.vision.e2.D(gVar.f21846c, f28, min, f16));
            float f36 = gVar.f21849g + i7;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            canvas.rotate(f36);
        }
        if (!this.f43234g7.isEmpty() && (xeVar = oq0Var.f50620c) != null && xeVar.f27846l) {
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
        if (!this.f43330s) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - i7) - (org.telegram.messenger.g0.L(16.0f) * 2);
        return Math.max(min / q10, min / o4);
    }

    public final void h2() {
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            i61Var.h0();
            return;
        }
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null) {
            eq0Var.g();
        }
    }

    public final void h3(boolean z10, boolean z11) {
        i3(z10, z11, hq0.f48478e);
    }

    public final Size i0() {
        float f10;
        int i7;
        int round;
        int i10;
        if (this.Z7 == 1) {
            return new Size(this.f43198c8, this.f43206d8);
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
        if (this.f43198c8 > this.f43206d8) {
            i7 = this.f43198c8;
        } else {
            i7 = this.f43206d8;
        }
        float f11 = f10 / i7;
        if (this.Y7 == this.Z7 - 1 && f11 >= 1.0f) {
            i10 = this.f43198c8;
            round = this.f43206d8;
        } else {
            int round2 = Math.round((this.f43198c8 * f11) / 2.0f) * 2;
            round = Math.round((this.f43206d8 * f11) / 2.0f) * 2;
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

    public final void i3(boolean r17, boolean r18, org.telegram.ui.hq0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i3(boolean, boolean, org.telegram.ui.hq0):void");
    }

    public final boolean j0(MotionEvent motionEvent) {
        boolean z10;
        eq0 eq0Var;
        if (this.G2 != null || ((eq0Var = this.f43227g0) != null && eq0Var.f37134y)) {
            if (motionEvent.getX() >= (g1(this.f43351u4) / 3) * 2) {
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

    public final org.telegram.messenger.f20 j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j1():org.telegram.messenger.f20");
    }

    public final void j2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.gf r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.gf, boolean, long):void");
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
        tg.f2 f2Var = this.f43307p5;
        if (f2Var != null) {
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(f2Var, property, f17));
        }
        if (this.f43307p5 != null) {
            fi.u2 u2Var = this.s5;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u2Var, property, f16));
        }
        oi.v1 v1Var = this.T0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(v1Var, property, f12));
        oi.v1 v1Var2 = this.T0;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(v1Var2, property2, f13));
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
            hi.g gVar = this.V1.f14971f;
            if (gVar.f42498e) {
                gVar.k(true);
            }
            hi.g gVar2 = this.W1.f14971f;
            if (gVar2.f42498e) {
                gVar2.k(true);
            }
            this.V1.f14971f.d();
            this.W1.f14971f.d();
        }
    }

    public final boolean k0() {
        bn bnVar = this.f43272l4;
        if (bnVar != null) {
            if (bnVar.f45972f == null) {
                TLRPC.Chat chat = bnVar.f45958e;
                if (chat != null && !org.telegram.messenger.v3.r0(chat)) {
                    if (org.telegram.messenger.v3.p(this.f43272l4.f45958e) || org.telegram.messenger.v3.u(this.f43272l4.f45958e)) {
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
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null && eq0Var.f37134y) {
            return eq0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var == null) {
            return 0L;
        }
        return i61Var.S();
    }

    public final void k2() {
        tg.f2 f2Var = this.f43307p5;
        if (f2Var != null && this.d2 == 11) {
            if (this.f43363v7) {
                f2Var.b();
            } else {
                f2Var.m(this.C4.n(), this.C4.V, g1(this.f43351u4), e1(), new on0(this, 0));
            }
        }
    }

    public final void k3(boolean z10, boolean z11) {
        float f10;
        hn0 hn0Var = this.f43385y;
        org.telegram.messenger.g0.r(hn0Var);
        int i7 = 0;
        if (z11) {
            l3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f43375x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f43375x = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    l3(true);
                    return;
                }
                org.telegram.messenger.g0.h3(hn0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f43375x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                l3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f43375x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f43375x = null;
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
        org.telegram.ui.Components.rd0 rd0Var = this.D1;
        if (rd0Var != null && (animatorSet = rd0Var.f39124s) != null) {
            animatorSet.cancel();
            rd0Var.f39124s = null;
            rd0Var.f39121f = false;
        }
    }

    public final TLObject l1(int i7, long[] jArr) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.f43215e7;
        if (!arrayList.isEmpty()) {
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.zv) arrayList.get(i7)).f28348b.size;
            }
            return (TLObject) arrayList.get(i7);
        }
        ArrayList arrayList2 = this.f43177a7;
        if (!arrayList2.isEmpty()) {
            if (i7 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f43197c7;
                if (arrayList3.get(i7) != null) {
                    jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                }
            }
            ArrayList arrayList4 = this.f43187b7;
            if (arrayList4.get(i7) == null) {
                return null;
            }
            return ((org.telegram.messenger.gc) arrayList4.get(i7)).f24080f;
        }
        ArrayList arrayList5 = this.Y6;
        if (arrayList5.isEmpty() || i7 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList5.get(i7);
        TLRPC.Message message = gjVar.f24177k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f24197p0, org.telegram.messenger.g0.Z0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = gjVar.f24133a1;
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
            } else if (((org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.gj.n1(gjVar.f24177k).photo != null) || ((org.telegram.messenger.gj.n1(gjVar.f24177k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(gjVar.f24177k).webpage != null)) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.f24197p0, org.telegram.messenger.g0.Z0(true), false, null, true);
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
            } else if (org.telegram.messenger.gj.n1(gjVar.f24177k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.gj.n1(gjVar.f24177k)).photo;
            } else {
                if (gjVar.F0() != null && org.telegram.messenger.gj.W2(gjVar.F0())) {
                    TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(gjVar.F0().thumbs, 90, false, null, false);
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
        if (this.f43384x8 != null) {
            Utilities.f22774e.a(this.f43384x8);
            this.f43384x8 = null;
        }
        yo0 yo0Var = this.S7;
        yo0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        yo0Var.E = mediaMetadataRetriever;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yo0Var.f39463x = z11;
        yo0Var.d = f10;
        yo0Var.f39455e = f11;
        float f12 = yo0Var.f39461s;
        if (f12 < f10) {
            yo0Var.f39461s = f10;
        } else if (f12 > f11) {
            yo0Var.f39461s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                yo0Var.f39464y = open;
                yo0Var.E.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = yo0Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                yo0Var.f39448a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = yo0Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                yo0Var.f39450b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = yo0Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                yo0Var.f39452c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = yo0Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = yo0Var.f39450b;
                yo0Var.f39450b = yo0Var.f39452c;
                yo0Var.f39452c = i11;
            }
            if (yo0Var.f39463x) {
                yo0Var.f39457f = (float) ((j10 / 1000.0d) / yo0Var.f39448a);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yo0Var.invalidate();
        this.f43394y8 = null;
        if (!z10 && this.d2 != 1) {
            z12 = false;
        }
        this.f43320r = z12;
        this.Z7 = -1;
        this.f43188b8 = 0;
        this.f43259j8 = 25;
        this.f43355u8 = new File(str).length();
        org.telegram.messenger.q5 q5Var = Utilities.f22774e;
        fq0 fq0Var = new fq0(this, str, j3, i7);
        this.f43384x8 = fq0Var;
        q5Var.c(fq0Var);
    }

    public final void l3(boolean z10) {
        float f10;
        if (z10) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43375x = animatorSet;
        yc ycVar = this.Y0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, property, f10));
        this.f43375x.setDuration(200L);
        this.f43375x.addListener(new pp0(this, z10, 1));
        this.f43375x.start();
    }

    public final void m0() {
        if (this.d2 == 11) {
            jq0 jq0Var = this.f43344t5;
            if (jq0Var.f58159o0 == 2) {
                jq0Var.setCutOutState(true);
                V2(true, true);
                this.f43307p5.f();
                this.f43218f0.invalidate();
            }
        }
    }

    public final void m2(boolean z10) {
        int i7 = 0;
        this.E2 = false;
        wi.n nVar = this.P8;
        if (nVar != null && nVar.f59999c == 0) {
            this.P8 = null;
            nVar.f();
        }
        org.telegram.ui.Components.i61 i61Var = this.G2;
        HashMap hashMap = f43163b9;
        ap0 ap0Var = this.f43388y2;
        if (i61Var != null) {
            n0();
            org.telegram.messenger.g0.r(this.f43378x2);
            org.telegram.messenger.g0.r(ap0Var);
            if (this.f43193c3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.f43193c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new ar0(S));
                org.telegram.messenger.gj gjVar = this.T4;
                if (gjVar != null) {
                    gjVar.f24185l3 = Float.valueOf(S);
                }
            }
            this.G2.m0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.f43227g0 != null) {
            org.telegram.messenger.g0.r(ap0Var);
            if (this.f43193c3 != null) {
                float k12 = ((float) k1()) / ((float) x1());
                String str2 = this.f43193c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new ar0(k12));
                org.telegram.messenger.gj gjVar2 = this.T4;
                if (gjVar2 != null) {
                    gjVar2.f24185l3 = Float.valueOf(k12);
                }
            }
        }
        org.telegram.ui.Components.cu cuVar = this.W3;
        if (cuVar != null) {
            cuVar.disable();
            this.W3 = null;
        }
        this.f43334s3.a();
        k3(false, false);
        this.f43333s2 = false;
        this.U2 = false;
        if (this.f43366w0.isEnabled()) {
            this.f43366w0.setEnabled(false);
            this.f43366w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f43239h3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.f43239h3 = false;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.ue0 ue0Var = this.f43397z2;
        if (ue0Var != null) {
            try {
                this.f43218f0.removeView(ue0Var);
            } catch (Throwable unused) {
            }
            this.f43397z2 = null;
        }
        l0();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.y51) {
                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                org.telegram.ui.Components.ez ezVar = y51Var.f42300b;
                if (ezVar != null) {
                    ezVar.postRunnable(new org.telegram.ui.Components.bz(ezVar, 0));
                }
                y51Var.f42299a = null;
            }
            this.C2 = null;
        }
        this.f43190c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            org.telegram.messenger.g0.r(this.f43240h4);
        }
        if (!z10 && !this.B8 && !this.C8) {
            N2(false, true);
        }
        xo0 xo0Var = this.X0[0];
        while (true) {
            float[] fArr = xo0Var.f53876n;
            if (i7 < fArr.length) {
                xo0Var.f53875m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                xo0Var.a();
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
            ArrayList arrayList = this.f43215e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.zv zvVar = (org.telegram.messenger.zv) arrayList.get(i7);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(zvVar.f28348b.dc_id);
                    sb2.append("_");
                    return a8.p0.r(sb2, zvVar.f28348b.f28535id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.f43177a7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Y6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f43234g7;
                    if (!arrayList4.isEmpty()) {
                        if (i7 < arrayList4.size()) {
                            Object obj = arrayList4.get(i7);
                            if (obj instanceof org.telegram.messenger.jf) {
                                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                                TLRPC.PhotoSize photoSize = jfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.w7.r(null, photoSize);
                                }
                                TLRPC.Document document = jfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.w7.r(null, document);
                                }
                                return Utilities.a(jfVar.C) + "." + org.telegram.messenger.fc.B(jfVar.C, "jpg");
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
                                    sb3.append(org.telegram.messenger.fc.B(webDocument2.url, org.telegram.messenger.w7.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        sq0 sq0Var = this.f43258j7;
                        if (sq0Var != null) {
                            return sq0Var.c(i7);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        org.telegram.messenger.gc gcVar = (org.telegram.messenger.gc) arrayList2.get(i7);
                        org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) this.f43187b7.get(i7);
                        if (gcVar != null) {
                            if (gcVar2 != null && gcVar2 != gcVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(gcVar2.f24080f.volume_id);
                                sb4.append("_");
                                return a8.p0.n(gcVar2.f24080f.local_id, ".mp4", sb4);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(gcVar.f24080f.volume_id);
                            sb5.append("_");
                            return a8.p0.n(gcVar.f24080f.local_id, ".jpg", sb5);
                        }
                    }
                } else if (i7 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.gj) arrayList3.get(i7)).f24177k;
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
                        } else if (org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.w7.r(null, org.telegram.messenger.gj.n1(message).document);
                        } else {
                            if (org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.gj.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w11 = org.telegram.messenger.w7.w(arrayList6, org.telegram.messenger.g0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.w7.r(null, w11);
                                }
                                return "";
                            } else if (org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.gj.n1(message).webpage.document != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.gj.n1(message).webpage.document);
                                }
                                if (org.telegram.messenger.gj.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.gj.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w10 = org.telegram.messenger.w7.w(arrayList7, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.w7.r(null, w10);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.gj.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.fc.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type));
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
        if (this.f43394y8 != null) {
            MediaController.B().i(this.f43394y8);
        }
        if (this.C8 && !this.f43403z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C8 = false;
        this.A8 = false;
        this.Q7.setVisibility(4);
        if (i7 == 1) {
            if (this.f43226f8 == this.f43206d8 && this.f43216e8 == this.f43198c8) {
                this.f43403z8 = false;
                xo0 xo0Var = this.X0[0];
                if (xo0Var.h != 0 && xo0Var.f53873k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                xo0Var.f(z12, 0.0f);
                this.X0[0].d(3, false, true);
                if (!z10) {
                    j2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.G2.p0(this.S7.getLeftProgress() * this.f43251i8);
                } else {
                    this.A8 = true;
                }
            } else {
                m2(false);
                if (this.f43394y8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28419id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(org.telegram.messenger.k10.f24932t0, tL_message, false, false);
                    this.f43394y8 = gjVar;
                    gjVar.f24177k.attachPath = new File(org.telegram.messenger.w7.z(4), "video_preview.mp4").getAbsolutePath();
                    this.f43394y8.f24205r0 = new org.telegram.messenger.f20();
                    org.telegram.messenger.f20 f20Var = this.f43394y8.f24205r0;
                    f20Var.f23797g = this.f43188b8;
                    f20Var.h = this.f43198c8;
                    this.f43394y8.f24205r0.f23798i = this.f43206d8;
                    org.telegram.messenger.f20 f20Var2 = this.f43394y8.f24205r0;
                    f20Var2.f23803n = this.f43259j8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        f20Var2.f23804o = uri.getPath();
                    } else {
                        f20Var2.f23804o = uri.getPath();
                    }
                }
                org.telegram.messenger.f20 f20Var3 = this.f43394y8.f24205r0;
                long j3 = this.f43284m8;
                f20Var3.f23790a = j3;
                long j10 = this.f43293n8;
                f20Var3.f23792b = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f43251i8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    f20Var3.f23792b = j3 + 5000000;
                }
                f20Var3.f23802m = this.f43235g8;
                this.f43394y8.f24205r0.f23800k = this.f43216e8;
                this.f43394y8.f24205r0.f23801l = this.f43226f8;
                org.telegram.messenger.f20 f20Var4 = this.f43394y8.f24205r0;
                f20Var4.Y = true;
                f20Var4.v = this.f43251i8 * 1000.0f;
                if (!MediaController.B().h0(this.f43394y8, true, true, true)) {
                    this.f43403z8 = true;
                }
                this.C8 = true;
                xo0 xo0Var2 = this.X0[0];
                if (xo0Var2.h != 0 && xo0Var2.f53873k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                xo0Var2.f(z11, 0.0f);
                this.X0[0].d(0, false, true);
            }
        } else {
            this.f43403z8 = false;
            this.X0[0].d(3, false, true);
            if (i7 == 2) {
                j2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.G2.p0(this.S7.getLeftProgress() * this.f43251i8);
            }
        }
        this.f43218f0.invalidate();
    }

    public final void n3(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10 != this.L) {
            if (z10) {
                this.f43303p1.setVisibility(0);
            }
            this.L = z10;
            this.f43303p1.setEnabled(z10);
            float f14 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                cr0 cr0Var = this.f43303p1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(cr0Var, property, f12));
                cr0 cr0Var2 = this.f43303p1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = -org.telegram.messenger.g0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(cr0Var2, property2, f13));
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
                    this.C1.addListener(new ip0(this, 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            cr0 cr0Var3 = this.f43303p1;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            cr0Var3.setAlpha(f10);
            cr0 cr0Var4 = this.f43303p1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(10.0f);
            }
            cr0Var4.setTranslationY(f11);
            CounterView counterView2 = this.P0;
            if (!z10) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z10) {
                this.f43303p1.setVisibility(8);
            }
        }
    }

    public final void o0() {
        float f10;
        org.telegram.ui.ActionBar.y yVar = this.B0;
        if (yVar != null) {
            if (this.f43229g2) {
                f10 = -org.telegram.messenger.g0.L(4.0f);
            } else {
                f10 = 0.0f;
            }
            yVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.F0;
        if (q0Var != null) {
            G2(q0Var, this.f43229g2, false);
        }
        boolean z10 = this.f43220f2;
        if (z10 && this.J == null) {
            fh.g c10 = this.Z.c(this.H, null, false);
            c10.p(c8.j0.j(this.f43368w2));
            c10.r(org.telegram.messenger.g0.L(20.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            int L = org.telegram.messenger.g0.L(54.0f);
            int L2 = org.telegram.messenger.g0.L(54.0f);
            Matrix matrix = ih.d.f16248a;
            this.J = new ih.c(L, L2, c10);
        }
        if (z10) {
            c8.sa.a(this.H);
            this.H.setBackground(this.J);
            return;
        }
        this.H.setStateListAnimator(null);
        this.H.setBackground(this.I);
    }

    public final org.telegram.messenger.gc o1(int i7, long[] jArr) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f43215e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.zv) arrayList.get(i7)).f28348b.size;
                    }
                    org.telegram.messenger.zv zvVar = (org.telegram.messenger.zv) arrayList.get(i7);
                    if (zvVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = zvVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.f43177a7;
                if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f43197c7;
                            if (arrayList3.get(i7) != null) {
                                jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                            }
                        }
                        return (org.telegram.messenger.gc) this.f43187b7.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.Y6;
                    if (!arrayList4.isEmpty() && i7 < arrayList4.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList4.get(i7);
                        TLRPC.Message message = gjVar.f24177k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f24197p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    if (jArr != null) {
                                        long j3 = w10.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.gc.f(w10, gjVar.f24190n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = gjVar.f24133a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.gc.b(document);
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
                                        return org.telegram.messenger.gc.f(w11, gjVar.f24133a1.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.gj.n1(gjVar.f24177k).photo != null) || ((org.telegram.messenger.gj.n1(gjVar.f24177k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(gjVar.f24177k).webpage != null)) {
                                if (org.telegram.messenger.gj.t3(gjVar.f24177k)) {
                                    return org.telegram.messenger.gc.b(gjVar.F0());
                                }
                                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(gjVar.f24197p0, org.telegram.messenger.g0.Z0(true), false, null, true);
                                if (w12 != null) {
                                    if (jArr != null) {
                                        long j11 = w12.size;
                                        jArr[0] = j11;
                                        if (j11 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.gc.f(w12, gjVar.f24190n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.gj.n1(gjVar.f24177k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.gj.n1(gjVar.f24177k)).webPhoto));
                            } else {
                                if (gjVar.F0() != null) {
                                    TLRPC.Document F0 = gjVar.F0();
                                    if (this.C5 == 5) {
                                        return org.telegram.messenger.gc.b(F0);
                                    }
                                    if (org.telegram.messenger.gj.W2(gjVar.F0())) {
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j12 = w13.size;
                                            jArr[0] = j12;
                                            if (j12 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.gc.c(w13, F0);
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
        org.telegram.ui.Components.i61 i61Var;
        org.telegram.ui.Components.i61 i61Var2;
        eq0 eq0Var;
        org.telegram.ui.Components.i61 i61Var3 = this.G2;
        if (i61Var3 == null && ((eq0Var = this.f43227g0) == null || !eq0Var.f37134y)) {
            return;
        }
        if (i61Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f43227g0.H;
        }
        n0();
        org.telegram.messenger.g0.r(this.f43388y2);
        if (z10) {
            g2();
        } else {
            if (this.f43332s1) {
                if (Math.abs(this.S7.getProgress() - this.S7.getRightProgress()) < 0.01f || ((i61Var2 = this.G2) != null && i61Var2.S() == this.G2.U())) {
                    s2(this.S7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f43314q3.c() - this.S7.getRightProgress()) < 0.01f || ((i61Var = this.G2) != null && i61Var.S() == this.G2.U())) {
                    s2(0.0f);
                }
                q2();
            }
            h2();
        }
        this.f43218f0.invalidate();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.f43377x1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f43218f0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.K()) {
                        zArr[0] = true;
                        this.f43218f0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f43218f0.getMeasuredWidth() - min && this.D4.K()) {
                    zArr[1] = true;
                    this.f43218f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f43176a6 != 1.0f && this.d2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f10), Math.round(f11), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f43218f0.postInvalidate();
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
        if (this.f43289n4 != 0) {
            D1();
            if (Math.abs(this.o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f43306p4;
                if (runnable != null) {
                    runnable.run();
                    this.f43306p4 = null;
                }
                this.f43289n4 = 0;
            }
        }
        if (this.f43289n4 == 0) {
            return false;
        }
        return true;
    }

    public final float p2(boolean z10) {
        int i7;
        if (this.d2 == 11) {
            int g12 = g1(this.f43351u4);
            if (g12 == 0) {
                g12 = org.telegram.messenger.g0.f24010q.x;
            }
            float i10 = org.telegram.ui.Cells.c0.i(20.0f, g12, 1) / g12;
            if (z10) {
                int q10 = this.C4.q();
                int o4 = this.C4.o();
                if ((q10 <= 1 || o4 <= 1) && (i7 = this.P4) >= 0) {
                    ArrayList arrayList = this.f43234g7;
                    if (i7 < arrayList.size()) {
                        Object obj = arrayList.get(this.P4);
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            q10 = ffVar.F;
                            o4 = ffVar.G;
                            if ((ffVar.J / 90) % 2 != 0) {
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
            xo0 xo0Var = this.X0[0];
            int i7 = xo0Var.h;
            if (xo0Var.f53878p && (i7 == 3 || i7 == 4 || i7 == 2 || i7 == 1)) {
                if (i7 == 3) {
                    view.setContentDescription(org.telegram.messenger.hd.N0(2131754929, "AccActionPlay"));
                } else if (i7 == 2) {
                    view.setContentDescription(org.telegram.messenger.hd.N0(2131754938, "AccActionDownload"));
                } else if (i7 == 1) {
                    view.setContentDescription(org.telegram.messenger.hd.N0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.hd.N0(2131754930, "AccActionPause"));
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
            wi.o oVar = this.f43369w3;
            if (oVar != null) {
                oVar.getViewTreeObserver().addOnPreDrawListener(new d7(this, 4));
                this.f43369w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f43379x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f43379x3.setImageDrawable(null);
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
            org.telegram.ui.Components.ue0 ue0Var = this.f43397z2;
            if (ue0Var != null) {
                int[] iArr = this.A3;
                ue0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f43218f0.getTranslationY());
                ImageView imageView2 = this.f43379x3;
                Rect rect = this.f43341t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f43397z2.getX());
                }
                qq0 qq0Var = this.F2;
                if (qq0Var != null) {
                    qq0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gn0(this, 4));
                if (this.E2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f43397z2.getX();
                }
                if (this.E2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f43397z2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f43379x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f43379x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f43379x3;
                Property property3 = View.TRANSLATION_X;
                if (this.E2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f43379x3;
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
                arrayList.add(ObjectAnimator.ofInt(this.M0, org.telegram.ui.Components.r6.d, 255));
                qq0 qq0Var2 = this.F2;
                if (qq0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(qq0Var2, property, 1.0f));
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
                animatorSet.addListener(new go0(this, view, 0));
                animatorSet.start();
                hq0 hq0Var = new hq0();
                hq0Var.f48481c = false;
                hq0Var.d = false;
                hq0Var.f48479a = 250;
                hq0Var.f48480b = decelerateInterpolator;
                i3(true, true, hq0Var);
                this.G3 = 0;
            }
        }
    }

    public final int q1() {
        return this.f43341t2.left;
    }

    public final void q2() {
        if (!E1()) {
            org.telegram.messenger.gj gjVar = this.T4;
            if (gjVar == null || !gjVar.r4()) {
                ap0 ap0Var = this.f43388y2;
                org.telegram.messenger.g0.r(ap0Var);
                org.telegram.messenger.g0.h3(ap0Var, 3000);
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
            uq0 uq0Var = this.N;
            ValueAnimator valueAnimator = uq0Var.f52622n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                uq0Var.f52622n = null;
            }
            uq0Var.f52623r = f10;
            uq0Var.f52619c[0].setRightPadding((int) f10);
            uq0Var.d.setRightPadding(f10);
        }
    }

    public final void r0() {
        xq0 xq0Var = this.f43203d5;
        if (xq0Var != null) {
            xq0Var.f53898a.O0(true, true);
        }
        vq0 vq0Var = this.d;
        xq0 xq0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (vq0Var != null) {
            org.telegram.messenger.gj gjVar = this.T4;
            org.telegram.messenger.gc gcVar = this.Z4;
            if (gcVar != null) {
                tL_fileLocationToBeDeprecated = gcVar.f24080f;
            }
            xq0Var2 = vq0Var.E(gjVar, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f43203d5 = xq0Var2;
        if (xq0Var2 != null && !xq0Var2.f53914s) {
            xq0Var2.f53898a.O0(false, true);
        }
    }

    public final TLRPC.Document r1() {
        int i7;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43234g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    if (!yeVar.v && !yeVar.f28041w && !yeVar.f28040u) {
                        return this.f43354u7;
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
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null && eq0Var.f37134y) {
            eq0Var.i(j3);
        } else {
            org.telegram.ui.Components.i61 i61Var = this.G2;
            if (i61Var != null) {
                i61Var.p0(j3);
            }
        }
        B3();
    }

    public final void r3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f43309p7) {
            charSequence = this.f43318q7;
        } else if (obj instanceof org.telegram.messenger.ff) {
            charSequence = ((org.telegram.messenger.ff) obj).f28022a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.jf)) {
            charSequence = ((org.telegram.messenger.jf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            b1().setText("");
        } else {
            b1().setText(org.telegram.ui.Components.y5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.ot editText = b1().f14971f.getEditText();
        bn bnVar = this.f43272l4;
        if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void s0() {
        org.telegram.messenger.gj gjVar;
        boolean z10;
        int i7;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        org.telegram.messenger.gj gjVar2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f43389y3;
        if (!isEmpty && ((gjVar = this.T4) == null || !gjVar.r4())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.P4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i12);
                    if (!org.telegram.messenger.gj.L4(gjVar3.f24177k) && !gjVar3.e5()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (gjVar3.e5() && (gjVar2 = this.T4) != null && gjVar2.e1() == gjVar3.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i7 = gjVar3.f24177k.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.C2) != null) {
                            i7 = textureView.getMeasuredWidth();
                        } else {
                            i7 = 0;
                        }
                        if (z10) {
                            i10 = gjVar3.f24177k.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.C2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document F0 = gjVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i7 = documentAttribute.f28405w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = org.telegram.messenger.g0.f24010q;
                        if (point.y > point.x && i7 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f43218f0.getMeasuredHeight() + ((int) (i10 / (i7 / this.f43218f0.getMeasuredWidth())))) / 2) - org.telegram.messenger.g0.L(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f43308p6 != null) {
                            float f11 = this.X5;
                            f10 = ((this.f43196c6 - f11) * this.f43274l6) + f11;
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

    public final org.telegram.ui.Components.aj0 s1(boolean z10) {
        wi.n nVar;
        wi.h hVar;
        RectF rectF = new RectF();
        if (!z10 && (nVar = this.P8) != null && (hVar = nVar.f60000e) != null) {
            hVar.g(rectF);
        } else {
            to0 to0Var = this.X8;
            wi.h.j(rectF, to0Var.J(), to0Var.a0());
        }
        ?? obj = new Object();
        obj.f33496a = rectF.left;
        obj.f33497b = rectF.top;
        obj.f33498c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final void s2(float f10) {
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            i61Var.p0(f10 * ((float) i61Var.U()));
            return;
        }
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null) {
            eq0Var.i(f10 * eq0Var.getVideoDuration());
        }
    }

    public final void s3() {
        int i7 = org.telegram.ui.ActionBar.m6.f29596qg;
        int w12 = w1(i7);
        oi.v1 v1Var = this.T0;
        if (v1Var != null) {
            v1Var.k();
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
        ImageView imageView2 = this.f43171a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.f43171a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f43200d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f43200d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f43191c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f43191c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f43181b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f43181b1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.x0 x0Var = this.V0;
        if (x0Var != null) {
            ((TextView) x0Var.f32278b).setTextColor(w12);
        }
        org.telegram.ui.Cells.x0 x0Var2 = this.P7;
        if (x0Var2 != null) {
            ((TextView) x0Var2.f32278b).setTextColor(w12);
        }
        wp0 wp0Var = this.M1;
        if (wp0Var != null) {
            wp0Var.updateColors();
        }
        org.telegram.ui.Components.ee0 ee0Var = this.J1;
        if (ee0Var != null) {
            ImageView imageView6 = ee0Var.C0;
            ImageView imageView7 = ee0Var.B0;
            ImageView imageView8 = ee0Var.A0;
            org.telegram.ui.ActionBar.h6 h6Var = ee0Var.J0;
            TextView textView = ee0Var.f34745h0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), mode));
            }
            ee0Var.e();
        }
        bp0 bp0Var = this.V1;
        if (bp0Var != null) {
            bp0Var.H(this.f43368w2);
        }
        cp0 cp0Var = this.W1;
        if (cp0Var != null) {
            cp0Var.H(this.f43368w2);
        }
        yo0 yo0Var = this.S7;
        if (yo0Var != null) {
            yo0Var.invalidate();
        }
        cr0 cr0Var = this.f43303p1;
        if (cr0Var != null) {
            int childCount = cr0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f43303p1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.y5) {
                    ((org.telegram.ui.Cells.y5) childAt).f32464c.b(org.telegram.ui.ActionBar.m6.W9, org.telegram.ui.ActionBar.m6.X9, org.telegram.ui.ActionBar.m6.V9);
                }
            }
        }
        ro0 ro0Var = this.U3;
        if (ro0Var != null) {
            ro0Var.Y0(true);
        }
    }

    public void setAnimationValue(float f10) {
        this.f43274l6 = f10;
        this.f43218f0.invalidate();
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
        aVar.f8365b = 0L;
        aVar.f8364a = false;
        for (float f10 : colorMatrix.getArray()) {
            aVar.c(f10);
        }
        aVar.a(0L);
        if (aVar.f8364a) {
            j3 = -1;
        } else {
            j3 = aVar.f8365b;
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
        if (this.f43355u8 > 1048576000) {
            return this.Z7 - 1;
        }
        SharedPreferences g12 = org.telegram.messenger.np.g1();
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
        rq0 rq0Var;
        int i7;
        if (this.d2 != 1 && (rq0Var = this.f43218f0) != null) {
            if (!z10) {
                if (rq0Var.getPaddingLeft() <= 0 && this.f43218f0.getPaddingRight() <= 0) {
                    i7 = 1796;
                } else {
                    i7 = 5894;
                }
            } else {
                i7 = 1792;
            }
            this.f43218f0.setSystemUiVisibility(i7);
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
        org.telegram.ui.Components.c6 c6Var;
        int i11 = this.P4;
        if (i7 == 1) {
            i10 = i11 + 1;
        } else if (i7 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.f43195c5[i7] != null) {
            if (i7 == 0 && i11 == 0 && (c6Var = this.f43262k2) != null) {
                z11 = c6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i10 >= 0 && i10 < this.Y6.size()) {
                    ?? r42 = (org.telegram.messenger.gj) this.Y6.get(i10);
                    z12 = P2(r42);
                    if (this.C5 == 1 && !r42.x()) {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f24177k.attachPath)) {
                        file3 = new File(r42.f24177k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.gj.n1(r42.f24177k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(r42.f24177k).webpage != null && org.telegram.messenger.gj.n1(r42.f24177k).webpage.document == null) {
                        aj0Var3 = new aj0(4, this, l1(i10, null));
                    } else {
                        aj0Var3 = new aj0(5, this, r42.f24177k);
                    }
                    if (org.telegram.messenger.gj.L4(r42.f24177k)) {
                        if ((org.telegram.messenger.cz.B0 && r42.B() && !org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(r42.f24177k))) || r42.D2(true)) {
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
                    if (i10 >= 0 && i10 < this.f43234g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f43234g7.get(i10);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.gj.K4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.w7.z(3), this.f43195c5[i7]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.w7.z(0), this.f43195c5[i7]);
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
                                file2 = new File(org.telegram.messenger.w7.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.fc.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(org.telegram.messenger.w7.z(4), this.f43195c5[i7]);
                    } else {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i10 >= 0 && i10 < this.f43187b7.size()) {
                            org.telegram.messenger.gc gcVar = (org.telegram.messenger.gc) this.f43187b7.get(i10);
                            if (gcVar != null) {
                                org.telegram.messenger.w7.G(this.U);
                                J = org.telegram.messenger.w7.J(gcVar.f24080f, m1(gcVar), false, true);
                                org.telegram.messenger.w7.G(this.U);
                                J2 = org.telegram.messenger.w7.J(gcVar.f24080f, m1(gcVar), true, true);
                            } else {
                                J2 = null;
                                J = null;
                            }
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43185b5 != null) {
                        if (i10 >= 0 && i10 < this.f43215e7.size()) {
                            org.telegram.messenger.zv zvVar = (org.telegram.messenger.zv) this.f43215e7.get(i10);
                            org.telegram.messenger.w7.G(this.U);
                            J = org.telegram.messenger.w7.J(zvVar, null, true, true);
                            org.telegram.messenger.w7.G(this.U);
                            J2 = org.telegram.messenger.w7.J(zvVar, null, false, true);
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43213e5 != null) {
                        file2 = new File(org.telegram.messenger.w7.z(3), this.f43195c5[i7]);
                        file = new File(org.telegram.messenger.w7.z(4), this.f43195c5[i7]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        sq0 sq0Var = this.f43258j7;
                        if (sq0Var != null) {
                            File b10 = sq0Var.b(i10);
                            if (!this.f43258j7.a(i10) && !this.f43258j7.e(i10)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && org.telegram.messenger.cz.B0 && (this.f43258j7.d(i10) instanceof TLRPC.Document)) {
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
            if ((i7 != 0 || !this.f43273l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = aj0Var;
            final boolean z20 = z11;
            Utilities.f22774e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.gj gjVar;
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
                    if (!z22 && i12 != 0 && (gjVar = r72) != null && z23 && org.telegram.messenger.a6.q(photoViewer.U).b(gjVar.f24177k) != 0 && (((bnVar = photoViewer.f43272l4) == null || bnVar.h == null) && !org.telegram.messenger.gj.R5(gjVar.f24177k) && (F0 = gjVar.F0()) != null)) {
                        org.telegram.messenger.w7.G(photoViewer.U).W(F0, gjVar, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f43195c5;
                            xo0[] xo0VarArr = photoViewer2.X0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                        xo0VarArr[i13].d(2, false, true);
                                    } else {
                                        xo0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    xo0VarArr[i13].d(0, z29, true);
                                }
                                Float w10 = org.telegram.messenger.fc.D().w(strArr[i13]);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                xo0VarArr[i13].f(false, w10.floatValue());
                            } else {
                                if (i13 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i13 == 0 && photoViewer2.X2))) {
                                        xo0VarArr[i13].d(3, z29, true);
                                    } else {
                                        xo0VarArr[i13].d(-1, z29, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f43302p0.y()) {
                                    if (!z27) {
                                        if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                            photoViewer2.f43302p0.u(8);
                                        } else {
                                            photoViewer2.f43302p0.T(8);
                                        }
                                    } else {
                                        photoViewer2.f43302p0.u(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f43343t4 || (photoViewer2.f43234g7.isEmpty() && (strArr[0] == null || xo0VarArr[0].h == 0))) {
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
        if (!this.f43234g7.isEmpty() && i10 >= 0 && i10 < this.f43234g7.size()) {
            Object obj = this.f43234g7.get(i10);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (ffVar.f28023b && (!ffVar.d() || (!ffVar.j() && this.d2 != 11))) {
                    this.X0[i7].d(3, z10, true);
                    return;
                }
            }
        }
        this.X0[i7].d(-1, z10, true);
    }

    public final int u1() {
        return this.f43341t2.right;
    }

    public final void u2(final boolean z10, final int i7, final int i10, final boolean z11, final boolean z12, boolean z13) {
        int i11;
        float f10;
        boolean z14;
        org.telegram.messenger.f20 f20Var;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        org.telegram.messenger.xe xeVar;
        org.telegram.messenger.xe xeVar2;
        TLRPC.Chat chat;
        boolean z15;
        int i12;
        bn bnVar;
        org.telegram.ui.Components.v30 v30Var;
        String str;
        long j3;
        String N0;
        TextureView textureView;
        if (!F1() && this.d != null && !this.f43358v2) {
            String str2 = null;
            if (this.d2 == 1) {
                if (!z13 && (v30Var = this.f43304p2) != null) {
                    TLObject tLObject = v30Var.f40621a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j10 = user.f28547id;
                        str = str3;
                        j3 = j10;
                    } else {
                        str = "";
                        j3 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43218f0.getContext());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.W0 = L;
                    Context context = this.f43218f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f49161a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f49162b = imageReceiver2;
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                    view.f49164e = new Path();
                    b9Var.r(org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f());
                    imageReceiver.i0(org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f(), b9Var, null);
                    imageReceiver2.i0(org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f(), b9Var, null);
                    Drawable drawable = context.getDrawable(2131232058);
                    view.f49165f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f43304p2.f40621a;
                    rq0 rq0Var = this.f43218f0;
                    org.telegram.ui.Components.rd0 rd0Var = this.D1;
                    b9Var.l(tLObject2);
                    imageReceiver.i0(tLObject2, b9Var, null);
                    view.f49163c = rq0Var;
                    view.d = rd0Var;
                    t1Var.W = view;
                    if (this.f43304p2.f40623c == 1) {
                        if (org.telegram.messenger.k10.i(this.U).f24951n == j3) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131745303, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131745304, str, str));
                        }
                        if (this.I4) {
                            N0 = org.telegram.messenger.hd.N0(2131745301, "SetVideo");
                        } else {
                            N0 = org.telegram.messenger.hd.N0(2131745323, "SetPhoto");
                        }
                    } else {
                        if (this.I4) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744155, str));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744166, str));
                        }
                        N0 = org.telegram.messenger.hd.N0(2131744164, "SuggestPhotoShort");
                    }
                    String str4 = N0;
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), new l60(6));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.q1() {
                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.Z8;
                            PhotoViewer.this.u2(z10, i7, i10, z11, z12, true);
                        }
                    });
                    t1Var.J = org.telegram.ui.ActionBar.m6.f29413gh;
                    t1Var.U0 = true;
                    t1Var.j(i0.a.o(-15461356, 204));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29376eh, false));
                    t1Var.setOnDismissListener(new ep0(this));
                    if (this.f43332s1 && (textureView = this.C2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f43397z2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.C2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f43397z2.addView(this.E3);
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
            if (!z11 && (bnVar = this.f43272l4) != null) {
                TLRPC.Chat chat2 = bnVar.f45958e;
                if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.v3.T(chat2))) {
                    org.telegram.messenger.np.u1(this.U).f25821g7.edit().putBoolean("silent_" + this.f43272l4.a(), !z10).commit();
                }
            }
            org.telegram.messenger.f20 j12 = j1();
            ArrayList arrayList = this.f43234g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj).f28038s = j12;
                }
            }
            bn bnVar2 = this.f43272l4;
            if (bnVar2 != null && (chat = bnVar2.f45958e) != null && this.d2 != 11) {
                if (!this.f43332s1 && j12 == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15 && !org.telegram.messenger.v3.u(chat)) {
                    org.telegram.messenger.f3.o(null, 2131749362, new org.telegram.ui.Components.lc(this.f43218f0, this.f43368w2), null);
                    return;
                } else if (!z15 && !org.telegram.messenger.v3.p(this.f43272l4.f45958e)) {
                    org.telegram.messenger.f3.o(null, 2131749366, new org.telegram.ui.Components.lc(this.f43218f0, this.f43368w2), null);
                    return;
                }
            }
            this.f43358v2 = true;
            if (j12 != null) {
                long j11 = ((float) j12.f23806q) * 0.9f;
                if ((j11 > 2097152000 && !org.telegram.messenger.k10.i(this.U).q()) || j11 > 4194304000L) {
                    if (this.f43182b2 != null) {
                        org.telegram.ui.Components.ui uiVar = this.f43182b2;
                        new ug.k0(6, org.telegram.messenger.k10.f24932t0, uiVar.f30145c.getContext(), uiVar.f40352a2, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.d2 == 11) {
                    Object obj2 = arrayList.get(this.P4);
                    if (obj2 instanceof org.telegram.messenger.ff) {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int g12 = g1(this.f43351u4);
                        e1();
                        float L2 = g12 - org.telegram.messenger.g0.L(20.0f);
                        tg.f2 f2Var = this.f43307p5;
                        if (f2Var != null && f2Var.f57840j0 && f2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f43307p5.g(canvas, false, null, false);
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
                            this.f43307p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f43390y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            ImageReceiver imageReceiver3 = this.C4;
                            canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                            f10 = 2.0f;
                            canvas.scale(this.C4.N0 / this.f43390y4.getMeasuredWidth(), this.C4.O0 / this.f43390y4.getMeasuredHeight());
                            this.f43390y4.f34723e = !z1();
                            this.f43390y4.draw(canvas);
                            this.f43390y4.f34723e = true;
                            canvas.restore();
                        } else {
                            f10 = 2.0f;
                        }
                        if (z1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = L2 / f10;
                            matrix.preTranslate(f18, f18);
                            if (this.f43308p6 != null) {
                                f15 = org.telegram.messenger.g0.T1(0.0f, this.f43233g6, this.f43274l6);
                                c10 = 3;
                                f11 = org.telegram.messenger.g0.T1(this.f43176a6, this.f43214e6, this.f43274l6);
                                f12 = org.telegram.messenger.g0.T1(this.f43186b6, this.f43224f6, this.f43274l6);
                                f13 = org.telegram.messenger.g0.T1(this.Y5, this.f43204d6, this.f43274l6);
                                f14 = org.telegram.messenger.g0.T1(this.X5, this.f43196c6, this.f43274l6);
                            } else {
                                c10 = 3;
                                f11 = this.f43176a6;
                                f12 = this.f43186b6;
                                f13 = this.Y5;
                                f14 = this.X5;
                                if (this.f43291n6 != 0) {
                                    f14 = this.f43196c6;
                                    f13 = this.f43204d6;
                                    f11 = this.f43214e6;
                                }
                                f15 = 0.0f;
                            }
                            int g13 = g1(this.f43351u4);
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
                            int i13 = gVar.f21850i;
                            if (i13 != 90 && i13 != 270) {
                                o4 = q10;
                                q10 = o4;
                            }
                            float f21 = gVar.f21851j;
                            float f22 = gVar.f21852k;
                            float f23 = o4;
                            float f24 = q10;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i14 = this.d2;
                            oq0 oq0Var = this.X4;
                            if (i14 == 1 || gVar.f21844a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.xe xeVar3 = oq0Var.f50620c;
                                    if (xeVar3 != null && xeVar3.f27846l) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    qq0 qq0Var = this.F2;
                                    if (qq0Var != null) {
                                        qq0Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.xe xeVar4 = oq0Var.f50620c;
                                if (xeVar4 != null) {
                                    f16 = xeVar4.f27840c;
                                } else {
                                    f16 = 1.0f;
                                }
                                float z16 = ((f25 / min) / com.google.android.gms.internal.vision.e2.z(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.f21847e * 1.0f);
                                matrix.preScale(z16, z16);
                                matrix.preTranslate(com.google.android.gms.internal.vision.e2.D(gVar.f21845b, f23, min, 1.0f), com.google.android.gms.internal.vision.e2.D(gVar.f21846c, f24, min, 1.0f));
                                float f27 = gVar.f21849g + i13;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (xeVar2 = oq0Var.f50620c) != null && xeVar2.f27846l) {
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
                            ArrayList arrayList3 = ffVar.f28035p;
                            int size = arrayList3.size();
                            int i15 = 0;
                            String str5 = null;
                            while (i15 < size) {
                                Object obj3 = arrayList3.get(i15);
                                i15++;
                                org.telegram.messenger.d20 a10 = ((org.telegram.messenger.d20) obj3).a();
                                float f28 = a10.f23444c;
                                float f29 = a10.d;
                                float f30 = a10.f23446f + f28;
                                float f31 = a10.f23447g + f29;
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
                                a10.f23446f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[c10], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / f32;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f32;
                                a10.f23447g = sqrt;
                                a10.f23444c = (((fArr[0] + fArr[4]) / f10) / f32) - (a10.f23446f / f10);
                                a10.d = (((fArr[1] + fArr[5]) / f10) / f32) - (sqrt / f10);
                                a10.v = 1.0f;
                                a10.A = true;
                                if (ffVar.f28041w && (xeVar = ffVar.A) != null) {
                                    a10.f23445e = (float) (a10.f23445e - ((xeVar.f27845k / 180.0f) * 3.141592653589793d));
                                }
                                a10.f23445e = (float) (a10.f23445e - ((this.f43186b6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a10);
                                TLRPC.Document document = a10.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.gj.V(document, null, null);
                                }
                                L2 = f32;
                                matrix = matrix2;
                            }
                            org.telegram.messenger.f20 f20Var2 = new org.telegram.messenger.f20();
                            f20Var2.I = true;
                            f20Var2.f23800k = 512;
                            f20Var2.h = 512;
                            f20Var2.f23801l = 512;
                            f20Var2.f23798i = 512;
                            f20Var2.G = arrayList2;
                            long k10 = Utilities.k(ffVar.f28039t, 2999L, 800L);
                            f20Var2.f23807r = k10;
                            f20Var2.v = k10;
                            f20Var2.f23802m = 200000;
                            f20Var2.f23803n = 30;
                            z14 = true;
                            f20Var2.N = true;
                            f20Var2.f23806q = 262144L;
                            f20Var = f20Var2;
                            str2 = str5;
                        } else {
                            z14 = true;
                            f20Var = null;
                        }
                        float f33 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.fc.a0(createBitmap, Bitmap.CompressFormat.WEBP, f33, f33, 100);
                        org.telegram.messenger.w7.G(org.telegram.messenger.k10.f24932t0);
                        String file = org.telegram.messenger.w7.J(a02, "webp", z14, z14).toString();
                        if (f20Var != null) {
                            f20Var.f23804o = file;
                        }
                        if (this.f43326r5 == null) {
                            this.f43326r5 = new ArrayList();
                        }
                        if (this.f43326r5.isEmpty()) {
                            String str6 = this.f43307p5.f57832d0;
                            if (str6 != null && org.telegram.messenger.j6.g(str6) != null) {
                                this.f43326r5.add(this.f43307p5.f57832d0);
                            } else if (str2 != null) {
                                this.f43326r5.add(str2);
                            } else {
                                this.f43326r5.add("👍");
                            }
                        }
                        this.f43358v2 = false;
                        ns p10 = ns.p();
                        tg.f2 f2Var2 = this.f43307p5;
                        ArrayList arrayList4 = this.f43326r5;
                        fp0 fp0Var = new fp0(this, file, f20Var, ffVar, z10, i7, i10, z12);
                        js jsVar = p10.U;
                        Activity W = org.telegram.messenger.g0.W(f2Var2.getContext());
                        if (W != null) {
                            p10.v(W);
                            p10.u(fp0Var);
                            ?? obj4 = new Object();
                            obj4.f27092a = file;
                            obj4.f27097g = f20Var;
                            p10.f50305o = arrayList4;
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
                    org.telegram.messenger.g0.h3(new ao0(this, i11), 200L);
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
        org.telegram.ui.Components.ue0 ue0Var = this.f43397z2;
        if (ue0Var != null && ue0Var.getVisibility() == 0 && this.H3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f10 *= Math.min(g1(this.f43351u4) / view.getMeasuredWidth(), y1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.C4;
        float f11 = imageReceiver.N0;
        float f12 = imageReceiver.O0;
        org.telegram.messenger.xe xeVar = this.X4.f50620c;
        if (xeVar != null) {
            f11 *= xeVar.f27841e;
            f12 *= xeVar.f27842f;
        }
        if (this.d2 == 11) {
            g12 = (int) (f11 * f10);
        } else {
            g12 = ((int) ((f11 * f10) - g1(this.f43351u4))) / 2;
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
        wp0 wp0Var = this.M1;
        if (wp0Var != null) {
            if (f10 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = wp0Var.f57880h1;
            boolean z11 = !z10;
            if (wp0Var.I1 != z11) {
                wp0Var.I1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.o10.o(animate.alpha(f13), org.telegram.ui.Components.nr.h, 240L);
            }
        }
    }

    public final void v0(int i7) {
        org.telegram.ui.Components.f61 f61Var;
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null && i61Var.d != null && i7 != i61Var.f36117e0) {
            i61Var.f36117e0 = i7;
            ArrayList arrayList = i61Var.O;
            if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                f61Var = (org.telegram.ui.Components.f61) i61Var.O.get(i7);
            } else {
                f61Var = null;
            }
            i61Var.w0(false, f61Var);
        }
        if (i7 == -1) {
            org.telegram.ui.Components.i61.o0(null, this.T4);
        } else {
            org.telegram.ui.Components.i61 i61Var2 = this.G2;
            if (i61Var2 != null) {
                org.telegram.ui.Components.i61.o0(i61Var2.Z(i7), this.T4);
            }
        }
        y3();
        this.f43311q0.V(null, null);
        try {
            d1.f.b(0);
            if (wf.b.J().M()) {
                wf.b.J().Q(i1());
            }
            org.telegram.ui.Components.i61 i61Var3 = this.G2;
            if (i61Var3 != null) {
                d1.f.x(i61Var3.d0());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v2(org.telegram.ui.Components.v30 v30Var) {
        String str;
        int i7;
        TLRPC.User user;
        this.f43304p2 = v30Var;
        if (this.d2 == 1) {
            if (D3()) {
                this.f43294o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.f43294o0.setVisibility(8);
            }
            if (v30Var != null && (user = v30Var.f40622b) != null && v30Var.f40623c == 1 && this.f43304p2.d) {
                if (v30Var.f40624e) {
                    this.D1.setSubtitle(org.telegram.messenger.hd.a0(null, null, 2131745316, user.first_name));
                } else {
                    this.D1.setSubtitle(org.telegram.messenger.hd.a0(null, null, 2131745317, user.first_name));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (v30Var != null) {
            if (v30Var.f40623c == 2) {
                if (v30Var.f40624e) {
                    str = "SuggestVideo";
                    i7 = 2131744156;
                } else {
                    str = "SuggestPhoto";
                    i7 = 2131744167;
                }
                M2(org.telegram.messenger.hd.N0(i7, str));
            }
            if (v30Var.f40624e) {
                this.T7.setText(org.telegram.messenger.hd.N0(2131745339, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void v3() {
        boolean z10;
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var != null) {
            if (!d1.f.u() && !this.f43320r) {
                z10 = false;
            } else {
                z10 = true;
            }
            i61Var.t0(z10);
        }
        if (!this.f43268k8) {
            this.f43219f1.setEnabled(false);
            this.f43219f1.setClickable(false);
            this.f43219f1.animate().alpha(0.5f).setDuration(180L).start();
            this.S7.setMode(0);
            return;
        }
        this.f43219f1.setEnabled(true);
        this.f43219f1.setClickable(true);
        this.f43219f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f43320r) {
            if (this.f43212e4 == null) {
                this.N.a(org.telegram.messenger.hd.N0(2131745083, "SoundMuted"), true);
            }
            org.telegram.ui.Components.j00 j00Var = this.f43209e1;
            j00Var.f36300e = true;
            j00Var.invalidateSelf();
            if (this.f43261k1.getTag() != null) {
                this.f43261k1.setAlpha(0.5f);
                this.f43261k1.setEnabled(false);
            }
            if (this.d2 == 1) {
                this.S7.setMaxProgressDiff(9600.0f / this.f43251i8);
                this.S7.setMode(1);
                A3();
                return;
            }
            this.S7.setMaxProgressDiff(1.0f);
            this.S7.setMode(0);
            return;
        }
        this.N.a(this.D8, true);
        org.telegram.ui.Components.j00 j00Var2 = this.f43209e1;
        j00Var2.f36300e = false;
        j00Var2.invalidateSelf();
        if (this.f43261k1.getTag() != null) {
            this.f43261k1.setAlpha(1.0f);
            this.f43261k1.setEnabled(true);
        }
        this.S7.setMaxProgressDiff(1.0f);
        this.S7.setMode(0);
    }

    public final void w0(boolean z10, boolean z11, float f10) {
        if (f10 != this.f43348u1) {
            this.f43348u1 = f10;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26895b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f43348u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.gj.B0(this.T4.f24177k) + "_" + this.T4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.gj.B0(this.T4.f24177k) + "_" + this.T4.e1(), this.f43348u1).commit();
                }
            }
            org.telegram.ui.Components.i61 i61Var = this.G2;
            if (i61Var != null) {
                i61Var.v0(this.f43348u1);
            }
            eq0 eq0Var = this.f43227g0;
            if (eq0Var != null) {
                eq0Var.setPlaybackSpeed(this.f43348u1);
            }
        }
        H2(true, z10);
        if (z11) {
            this.f43311q0.V(null, null);
        }
    }

    public final int w1(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f43368w2;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final void w2(boolean z10) {
        if (this.f43296o2 != z10) {
            this.f43296o2 = z10;
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
        if (i7 >= 0 && i7 < this.f43234g7.size() && F1()) {
            if (z10) {
                d0();
            }
            b1().p();
        }
    }

    public final long x1() {
        eq0 eq0Var = this.f43227g0;
        if (eq0Var != null && eq0Var.f37134y) {
            return eq0Var.getVideoDuration();
        }
        org.telegram.ui.Components.i61 i61Var = this.G2;
        if (i61Var == null) {
            return 0L;
        }
        return i61Var.U();
    }

    public final void x2() {
        org.telegram.ui.Components.y51 y51Var;
        org.telegram.ui.Components.y51 y51Var2;
        if (!this.f43238h2 && this.d2 == 1) {
            if (!this.f43332s1 || ((y51Var2 = (org.telegram.ui.Components.y51) this.C2) != null && y51Var2.getVideoWidth() > 0 && y51Var2.getVideoHeight() > 0)) {
                this.f43238h2 = true;
                Bitmap n10 = this.C4.n();
                int i7 = this.C4.V;
                if (n10 == null) {
                    n10 = this.f43244i0.getBitmap();
                    i7 = this.f43244i0.getOrientation();
                }
                Bitmap bitmap = n10;
                int i10 = i7;
                if (bitmap != null || this.C2 != null) {
                    org.telegram.ui.Components.rd0 rd0Var = this.D1;
                    if (this.f43332s1) {
                        y51Var = (org.telegram.ui.Components.y51) this.C2;
                    } else {
                        y51Var = null;
                    }
                    rd0Var.b(bitmap, i10, false, false, this.E1, y51Var, this.X4.f50620c);
                }
            }
        }
    }

    public final void x3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x3(int, boolean):void");
    }

    public final void y0() {
        wp0 wp0Var = this.M1;
        Activity activity = this.E;
        hn0 hn0Var = new hn0(this, 1);
        if (wp0Var.f57903v1) {
            wp0Var.w0(false);
        } else if (wp0Var.Q1) {
            wp0Var.k0(true);
        } else if (wp0Var.D0 && wp0Var.C0 != null) {
            wp0Var.r0(null, true);
        } else if (wp0Var.f57890p0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, wp0Var.A1);
            String N0 = org.telegram.messenger.hd.N0(2131747084, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.U = N0;
            t1Var.S = org.telegram.messenger.hd.N0(2131751393, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747386, null), new org.telegram.tgnet.v(hn0Var, 28));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            Q2(alertDialog$Builder);
        } else {
            hn0Var.run();
        }
    }

    public final int y1() {
        int measuredHeight;
        int e12 = e1();
        rq0 rq0Var = this.f43218f0;
        if (rq0Var != null && (measuredHeight = rq0Var.getMeasuredHeight()) > 0) {
            return Math.min(e12, measuredHeight);
        }
        return e12;
    }

    public final void y2(org.telegram.messenger.gj gjVar, CharSequence charSequence, boolean z10, boolean z11) {
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
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        U2(this.R4, z11);
        if (!this.R4 && this.d2 != 1) {
            this.V1.setVisibility(8);
            this.W1.setVisibility(8);
            if (this.f43254j2) {
                if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout = this.f43172a2;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.U1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f43218f0.getContext());
                    this.f43172a2 = frameLayout2;
                    this.R1.setContainer(frameLayout2);
                    xp0 xp0Var = new xp0(this, this.f43218f0.getContext(), this.R1, this.f43172a2, 0);
                    this.U1 = xp0Var;
                    this.R1.setScrollView(xp0Var);
                    this.f43172a2.setClipChildren(false);
                    this.U1.addView(this.f43172a2, new ViewGroup.LayoutParams(-1, -2));
                    this.f43218f0.addView(this.U1, c8.na.e(-1, -1, 80));
                }
                if (this.R1.getParent() != this.f43172a2) {
                    this.Q0.removeView(this.R1);
                    this.R1.setMeasureAllChildren(true);
                    this.f43172a2.addView(this.R1, -1, -2);
                    this.f43334s3.bringToFront();
                }
                if (gjVar != null && gjVar.r4()) {
                    if (this.S1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.F);
                        this.S1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.m6.b0(620756991, 369098751, 8, 8));
                        c8.sa.b(this.S1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.F);
                        this.T1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.T1.setTextColor(-1);
                        this.T1.setTypeface(org.telegram.messenger.g0.o());
                        this.S1.addView(this.T1, c8.na.e(-2, -2, 17));
                        this.S1.setOnClickListener(new vn0(this, 7));
                    }
                    org.telegram.messenger.g0.E2(this.S1);
                    this.T1.setText(gjVar.Y0);
                    this.f43172a2.addView(this.S1, c8.na.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
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
            nq0 nq0Var = this.R1;
            if (z11) {
                currentView = nq0Var.getNextView();
            } else {
                currentView = nq0Var.getCurrentView();
            }
            if (this.f43332s1) {
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
                if (this.f43254j2) {
                    Point point = org.telegram.messenger.g0.f24010q;
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
            boolean z19 = this.f43254j2;
            if (!z19 && z11 && isEmpty) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f43287n2 = z12;
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
                if (this.f43254j2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new yp0(this, isEmpty2, isEmpty, 1)).addTransition(new yp0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.U1.m0 = true;
                        duration.addTransition(new org.telegram.ui.Components.cl0(this, 2));
                    }
                    if (isEmpty2 && !isEmpty) {
                        duration.addTarget((View) this.R1);
                    }
                    TransitionManager.beginDelayedTransition(this.U1, duration);
                }
                z13 = true;
            } else {
                this.R1.getCurrentView().setText((CharSequence) null);
                xp0 xp0Var2 = this.U1;
                if (xp0Var2 != null) {
                    xp0Var2.scrollTo(0, 0);
                }
                z13 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.m6.K(null, true);
                if (gjVar == null || !this.f43290n5 || (message = gjVar.f24177k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.b31.N0())) {
                    if (gjVar != null && !gjVar.f24177k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        gjVar.c(spannableString, true, false);
                        if (org.telegram.messenger.gj.L4(gjVar.f24177k)) {
                            org.telegram.messenger.gj.h(gjVar.P3(), spannableString, false, 3, (int) gjVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.j6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (gjVar != null && gjVar.r4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(gjVar.S0)) {
                        spannableStringBuilder.append((CharSequence) gjVar.S0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new fi.g8(1), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.R1.setTag(cloneSpans);
                try {
                    nq0 nq0Var2 = this.R1;
                    if (this.f43313q2 != z10) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    nq0Var2.a(cloneSpans, z11, z18);
                    xp0 xp0Var3 = this.U1;
                    if (xp0Var3 != null) {
                        xp0Var3.H(xp0Var3.getWidth(), xp0Var3.getHeight());
                    }
                    z14 = true;
                } catch (Exception e10) {
                    z14 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.K && (!this.f43332s1 || this.Q0.getVisibility() == 0 || this.f43258j7 != null)) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                nq0 nq0Var3 = this.R1;
                if (z17) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                nq0Var3.setVisibility(i10);
            } else {
                z14 = true;
                if (this.f43254j2) {
                    this.R1.a(org.telegram.messenger.hd.N0(2131754451, "AddCaption"), z11, false);
                    this.R1.getCurrentView().setTextColor(-1291845633);
                    this.R1.setTag("empty");
                    this.R1.setVisibility(0);
                } else {
                    this.R1.a(null, z11, false);
                    this.R1.getCurrentView().setTextColor(-1);
                    nq0 nq0Var4 = this.R1;
                    if (z13 && !isEmpty2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    nq0Var4.b(4, z15);
                    this.R1.setTag(null);
                }
            }
            if (this.R1.getCurrentView() instanceof mq0) {
                ((mq0) this.R1.getCurrentView()).setLoading(z10);
            }
            if (!isEmpty && z10) {
                z16 = z14;
            } else {
                z16 = false;
            }
            this.f43313q2 = z16;
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
        org.telegram.messenger.gj gjVar;
        vq0 vq0Var = this.d;
        if (vq0Var != null) {
            int H2 = vq0Var.H();
            this.P0.a(H2);
            if (H2 == 0) {
                n3(false, true);
            }
            if (this.T0 != null) {
                vq0 vq0Var2 = this.d;
                long j10 = 0;
                if (vq0Var2 != null) {
                    j3 = vq0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (gjVar = this.T4) != null) {
                    j3 = org.telegram.messenger.gj.B0(gjVar.f24177k);
                }
                oi.v1 v1Var = this.T0;
                vq0 vq0Var3 = this.d;
                if (vq0Var3 == null || !vq0Var3.q() || this.d.w()) {
                    j10 = org.telegram.messenger.np.u1(this.U).P1(j3);
                }
                vq0 vq0Var4 = this.d;
                if (vq0Var4 == null) {
                    H = 1;
                } else {
                    H = vq0Var4.H();
                }
                v1Var.i(Math.max(1, H), j10, true);
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
