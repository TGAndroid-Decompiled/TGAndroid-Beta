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
public class PhotoViewer implements org.telegram.messenger.fs, org.telegram.ui.Components.k10, org.telegram.ui.Components.j10, te.b {
    public static Drawable[] f43272f9;
    public static final Paint f43273g9 = new Paint(2);
    public static final HashMap f43274h9 = new HashMap();
    public static DecelerateInterpolator f43275i9;
    public static Paint f43276j9;
    public static final Property f43277k9;
    public static volatile PhotoViewer f43278l9;
    public static volatile PhotoViewer f43279m9;
    public org.telegram.ui.ActionBar.d1 A0;
    public org.telegram.ui.Components.z51 A1;
    public View A2;
    public final int[] A3;
    public org.telegram.ui.Components.cc0 A4;
    public boolean A5;
    public float A6;
    public TLRPC.Document A7;
    public long A8;
    public org.telegram.ui.ActionBar.y B0;
    public org.telegram.ui.Components.en0 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public boolean B7;
    public long B8;
    public org.telegram.ui.ActionBar.q0 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public boolean C7;
    public float C8;
    public org.telegram.ui.ActionBar.q0 D0;
    public org.telegram.ui.Components.qd0 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public org.telegram.messenger.p10 D7;
    public eq0 D8;
    public Activity E;
    public org.telegram.ui.ActionBar.q0 E0;
    public final og.g E1;
    public boolean E2;
    public ImageView E3;
    public h2.c E4;
    public long E5;
    public float E6;
    public final float[] E7;
    public org.telegram.messenger.fj E8;
    public ContextThemeWrapper F;
    public org.telegram.ui.ActionBar.q0 F0;
    public og.g F1;
    public pq0 F2;
    public boolean F3;
    public h2.c F4;
    public ch.p0 F5;
    public float F6;
    public final float[] F7;
    public boolean F8;
    public org.telegram.ui.Components.u7 G;
    public org.telegram.ui.ActionBar.y0 G0;
    public og.g G1;
    public org.telegram.ui.Components.h61 G2;
    public int G3;
    public h2.c G4;
    public String G5;
    public float G6;
    public ObjectAnimator G7;
    public boolean G8;
    public ImageView H;
    public org.telegram.ui.Components.p7 H0;
    public org.telegram.messenger.we H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public int H7;
    public boolean H8;
    public Drawable I;
    public b61 I0;
    public org.telegram.messenger.we I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public xi.e I7;
    public boolean I8;
    public ih.c J;
    public b61 J0;
    public org.telegram.ui.Components.de0 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public String J8;
    public boolean K;
    public vq K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public float K7;
    public final org.telegram.ui.Components.c6 K8;
    public boolean L;
    public final HashMap L0;
    public hi.x3 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public final kn0 L7;
    public org.telegram.ui.Components.c6[] L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public vp0 M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Path M7;
    public RectF M8;
    public tq0 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public Paint N7;
    public RectF N8;
    public sq0 O;
    public CheckBox O0;
    public up0 O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public Paint O7;
    public Matrix O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public LinearGradient P7;
    public float[] P8;
    public boolean Q;
    public di.n4 Q0;
    public org.telegram.ui.ActionBar.t1 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public LinearGradient Q7;
    public RenderNode Q8;
    public uo0 R;
    public FrameLayout R0;
    public mq0 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public RenderNode R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public org.telegram.ui.Components.h61 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public Matrix S7;
    public final dh.a S8;
    public Paint T;
    public oi.w1 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public org.telegram.messenger.fj T4;
    public boolean T5;
    public int T6;
    public final int[] T7;
    public final a0.h T8;
    public int U;
    public org.telegram.ui.Components.fe0 U0;
    public wp0 U1;
    public boolean U2;
    public qo0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public xq0 U7;
    public boolean U8;
    public int V;
    public org.telegram.ui.Cells.x0 V0;
    public zo0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public org.telegram.ui.Cells.x0 V7;
    public wi.n V8;
    public int W;
    public TextView W0;
    public ap0 W1;
    public boolean W2;
    public org.telegram.ui.Components.au W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public RadialProgressView W7;
    public wi.o W8;
    public float X;
    public final vo0[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public final nq0 X4;
    public float X5;
    public final SparseArray[] X6;
    public FrameLayout X7;
    public float X8;
    public ho0 Y;
    public yc Y0;
    public k0 Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public wo0 Y7;
    public boolean Y8;
    public dh.c Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public org.telegram.messenger.fc Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public TextView Z7;
    public final RectF Z8;
    public final te.a f43280a = new te.a(0, this, org.telegram.ui.Components.kr.h, 380, false);
    public xe.b f43281a0;
    public ImageView f43282a1;
    public FrameLayout f43283a2;
    public float f43284a3;
    public final org.telegram.ui.Cells.k1 f43285a4;
    public org.telegram.messenger.fc f43286a5;
    public float f43287a6;
    public final ArrayList f43288a7;
    public AnimatorSet f43289a8;
    public boolean f43290a9;
    public final boolean f43291b;
    public xe.b f43292b0;
    public ImageView f43293b1;
    public org.telegram.ui.Components.ti f43294b2;
    public String f43295b3;
    public final VideoFramesRewinder f43296b4;
    public org.telegram.messenger.yv f43297b5;
    public float f43298b6;
    public final ArrayList f43299b7;
    public long f43300b8;
    public boolean f43301b9;
    public int f43302c;
    public org.telegram.ui.Components.ba f43303c0;
    public ImageView f43304c1;
    public bg.v0 f43305c2;
    public String f43306c3;
    public final hp0 f43307c4;
    public final String[] f43308c5;
    public float f43309c6;
    public final ArrayList f43310c7;
    public long f43311c8;
    public final kn0 f43312c9;
    public uq0 d;
    public org.telegram.ui.Components.fa f43313d0;
    public ImageView f43314d1;
    public int d2;
    public long f43315d3;
    public final org.telegram.ui.Cells.g2 f43316d4;
    public wq0 f43317d5;
    public float f43318d6;
    public final ArrayList f43319d7;
    public long f43320d8;
    public final fo0 f43321d9;
    public boolean f43322e;
    public WindowManager.LayoutParams f43323e0;
    public org.telegram.ui.Components.h00 f43324e1;
    public boolean f43325e2;
    public float f43326e3;
    public CharSequence f43327e4;
    public String f43328e5;
    public float f43329e6;
    public final ArrayList f43330e7;
    public volatile int f43331e8;
    public View f43332e9;
    public boolean f43333f;
    public qq0 f43334f0;
    public org.telegram.ui.ActionBar.f0 f43335f1;
    public boolean f43336f2;
    public boolean f43337f3;
    public boolean f43338f4;
    public long f43339f5;
    public float f43340f6;
    public final ArrayList f43341f7;
    public volatile int f43342f8;
    public dq0 f43343g0;
    public org.telegram.ui.Components.l80 f43344g1;
    public boolean f43345g2;
    public long f43346g3;
    public boolean f43347g4;
    public String f43348g5;
    public float f43349g6;
    public final ArrayList f43350g7;
    public int f43351g8;
    public int h;
    public vq0 f43352h0;
    public xo0 f43353h1;
    public boolean f43354h2;
    public boolean f43355h3;
    public final yo0 f43356h4;
    public boolean f43357h5;
    public float f43358h6;
    public org.telegram.messenger.fc h7;
    public int f43359h8;
    public ClippingImageView f43360i0;
    public ArrayList f43361i1;
    public boolean f43362i2;
    public cr0 f43363i3;
    public final yo0 f43364i4;
    public TL_iv.PageBlock f43365i5;
    public float f43366i6;
    public yq0 i7;
    public volatile int f43367i8;
    public gh0 f43368j0;
    public ArrayList f43369j1;
    public boolean f43370j2;
    public String j3;
    public final t50 f43371j4;
    public org.telegram.messenger.hc f43372j5;
    public float f43373j6;
    public rq0 f43374j7;
    public volatile int f43375j8;
    public View f43376k0;
    public org.telegram.ui.Components.u51 f43377k1;
    public org.telegram.ui.Components.b6 f43378k2;
    public ValueAnimator f43379k3;
    public final float[][] f43380k4;
    public boolean f43381k5;
    public float f43382k6;
    public final Rect f43383k7;
    public volatile int f43384k8;
    public int f43385l0;
    public hi.u3 l1;
    public boolean f43386l2;
    public boolean f43387l3;
    public bn f43388l4;
    public boolean f43389l5;
    public float f43390l6;
    public org.telegram.ui.Components.j61 f43391l7;
    public volatile int f43392l8;
    public TextView m0;
    public org.telegram.ui.Components.w20 f43393m1;
    public boolean f43394m2;
    public final int[] f43395m3;
    public org.telegram.ui.ActionBar.g2 f43396m4;
    public boolean f43397m5;
    public float f43398m6;
    public Uri f43399m7;
    public volatile int f43400m8;
    public boolean f43401n;
    public TextView f43402n0;
    public org.telegram.ui.Components.n01 n1;
    public boolean f43403n2;
    public final int[] f43404n3;
    public int f43405n4;
    public boolean f43406n5;
    public long f43407n6;
    public long f43408n7;
    public volatile int f43409n8;
    public TextView f43410o0;
    public UndoView f43411o1;
    public boolean f43412o2;
    public org.telegram.ui.ActionBar.n5 f43413o3;
    public long o4;
    public String f43414o5;
    public int f43415o6;
    public final kn0 f43416o7;
    public float f43417o8;
    public org.telegram.ui.ActionBar.q0 f43418p0;
    public br0 f43419p1;
    public org.telegram.ui.Components.s30 f43420p2;
    public ImageView f43421p3;
    public Runnable f43422p4;
    public tg.i2 f43423p5;
    public AnimatorSet f43424p6;
    public org.telegram.ui.ActionBar.y0 f43425p7;
    public int f43426p8;
    public org.telegram.ui.ActionBar.q0 f43427q0;
    public l4 f43428q1;
    public boolean f43429q2;
    public org.telegram.ui.Components.l61 f43430q3;
    public wq0 f43431q4;
    public org.telegram.ui.Components.ee0 f43432q5;
    public AnimatorSet f43433q6;
    public org.telegram.ui.Components.voip.r0 f43434q7;
    public volatile boolean f43435q8;
    public boolean f43436r;
    public org.telegram.ui.ActionBar.y0 f43437r0;
    public ImageReceiver f43438r1;
    public org.telegram.messenger.uo f43439r2;
    public tv f43440r3;
    public wq0 f43441r4;
    public ArrayList f43442r5;
    public org.telegram.ui.Components.l10 f43443r6;
    public final h2.f f43444r7;
    public volatile boolean f43445r8;
    public boolean f43446s;
    public org.telegram.ui.ActionBar.u0 f43447s0;
    public boolean f43448s1;
    public boolean f43449s2;
    public jp0 f43450s3;
    public boolean f43451s4;
    public fi.u2 s5;
    public boolean f43452s6;
    public bg.v0 f43453s7;
    public long f43454s8;
    public org.telegram.ui.ActionBar.y0 f43455t0;
    public final kn0 f43456t1;
    public final Rect f43457t2;
    public AnimatorSet f43458t3;
    public boolean f43459t4;
    public iq0 f43460t5;
    public final DecelerateInterpolator t6;
    public org.telegram.ui.Components.fc f43461t7;
    public long f43462t8;
    public org.telegram.ui.ActionBar.y0 f43463u0;
    public float f43464u1;
    public boolean f43465u2;
    public boolean f43466u3;
    public int f43467u4;
    public LinearLayout f43468u5;
    public float f43469u6;
    public int f43470u7;
    public float f43471u8;
    public org.telegram.ui.ActionBar.d1 f43472v0;
    public long f43473v1;
    public boolean f43474v2;
    public int f43475v3;
    public final kn0 f43476v4;
    public iq0 f43477v5;
    public float f43478v6;
    public boolean f43479v7;
    public float f43480v8;
    public int f43481w;
    public org.telegram.ui.ActionBar.y0 f43482w0;
    public final GradientDrawable[] f43483w1;
    public org.telegram.ui.ActionBar.i6 f43484w2;
    public wi.o f43485w3;
    public int f43486w4;
    public iq0 f43487w5;
    public float f43488w6;
    public CharSequence f43489w7;
    public long f43490w8;
    public AnimatorSet f43491x;
    public xq f43492x0;
    public final boolean[] f43493x1;
    public final so0 f43494x2;
    public ImageView f43495x3;
    public String f43496x4;
    public iq0 f43497x5;
    public float f43498x6;
    public boolean f43499x7;
    public long f43500x8;
    public final kn0 f43501y;
    public LinearLayout f43502y0;
    public final float[] f43503y1;
    public final yo0 f43504y2;
    public final ImageView[] f43505y3;
    public org.telegram.ui.Components.cc0 f43506y4;
    public iq0 f43507y5;
    public float f43508y6;
    public ValueAnimator f43509y7;
    public long f43510y8;
    public final ArrayList f43511z0;
    public int f43512z1;
    public org.telegram.ui.Components.te0 f43513z2;
    public boolean f43514z3;
    public org.telegram.ui.Components.cc0 f43515z4;
    public long f43516z5;
    public float f43517z6;
    public TLRPC.Document f43518z7;
    public long f43519z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f43520g = 0;
        public final RectF f43521a;
        public final RectF f43522b;
        public final Paint f43523c;
        public mp0 d;
        public boolean f43524e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f43521a = new RectF();
            this.f43522b = new RectF();
            Paint paint = new Paint(1);
            this.f43523c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            bg.v0 v0Var = photoViewer.f43453s7;
            if (v0Var != null) {
                v0Var.b(!this.f43524e);
            }
            bg.v0 v0Var2 = photoViewer.f43305c2;
            if (v0Var2 != null) {
                v0Var2.b(!this.f43524e);
            }
            org.telegram.ui.Components.ti tiVar = photoViewer.f43294b2;
            if (tiVar != null) {
                boolean z11 = this.f43524e;
                tiVar.f40029w2.m(tiVar.f39983j4);
                if (tiVar.f40015s4 != z11) {
                    tiVar.f40015s4 = z11;
                    org.telegram.ui.Components.li liVar = tiVar.f40029w2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
                    if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f32886j1) {
                        if (z11 && !tiVar.f40019t4) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f32891n && !chatAttachAlertPhotoLayout.P0) {
                            if (z10) {
                                org.telegram.ui.Components.em emVar = chatAttachAlertPhotoLayout.Q;
                                if (emVar != null) {
                                    chatAttachAlertPhotoLayout.f32895p0 = Boolean.valueOf(emVar.isFrontface());
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
            mp0 mp0Var;
            wq0 wq0Var;
            Drawable[] drawableArr = PhotoViewer.f43272f9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f43405n4 != 0 && !org.telegram.messenger.g0.Q1() && (wq0Var = photoViewer.f43317d5) != null && wq0Var.f53736m != null) {
                ClippingImageView clippingImageView = photoViewer.f43360i0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.f43522b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.f32959b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.f32960c;
                rectF.bottom = scaleY - clippingImageView.f32958a;
                if (!rectF.isEmpty()) {
                    rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    Rect bounds = getBounds();
                    float f10 = bounds.right;
                    float f11 = bounds.bottom;
                    for (int i7 = 0; i7 < 4; i7++) {
                        RectF rectF2 = this.f43521a;
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
                        canvas.drawRect(rectF2, this.f43523c);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() != 0 && (mp0Var = this.d) != null) {
                org.telegram.messenger.g0.g3(mp0Var);
                this.d = null;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                if (photoViewer.f43322e && i7 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f43524e = z10;
                if (z10) {
                    a();
                } else {
                    org.telegram.messenger.g0.h3(new hq0(this, 0), 70L);
                }
            }
            super.setAlpha(i7);
            this.f43523c.setAlpha(i7);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f43526a;
        public final TextPaint f43527b;
        public final Paint f43528c;
        public int d;
        public int f43529e;
        public final RectF f43530f;
        public int h;
        public float f43531n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f43527b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f43528c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f43530f = new RectF();
            a(0);
        }

        public final void a(int i7) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.g0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f43527b;
            this.f43526a = new StaticLayout("" + Math.max(1, i7), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f43529e = this.f43526a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f43528c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i7 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.f38711b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, o6Var, 0), ObjectAnimator.ofInt(textPaint, o6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.o6 o6Var2 = org.telegram.ui.Components.q6.f38711b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, o6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, o6Var2, 0, 255));
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
            return this.f43531n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f43528c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.g0.L(14.0f) + measuredHeight;
            RectF rectF = this.f43530f;
            rectF.set(org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
            if (this.f43526a != null) {
                this.f43527b.setAlpha((int) ((1.0f - this.f43531n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f43531n * org.telegram.messenger.g0.L(5.0f)) + org.telegram.messenger.g0.N(0.2f) + ((getMeasuredHeight() - this.f43529e) / 2));
                this.f43526a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f43531n * 255.0f));
                int centerX = (int) rectF.centerX();
                int t6 = (int) com.google.android.gms.internal.vision.e2.t(1.0f, this.f43531n, org.telegram.messenger.g0.L(5.0f), (int) rectF.centerY());
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
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.gd.G(i7, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(20.0f) + this.d, org.telegram.messenger.g0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f43531n = f10;
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
            f43277k9 = new go0();
        } else {
            f43277k9 = new org.telegram.ui.Cells.h1(Float.class, "progress", 4);
        }
        f43278l9 = null;
        f43279m9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43291b = z10;
        this.h = -1;
        this.f43401n = true;
        this.f43501y = new kn0(this, 18);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.f43281a0 = new xe.b();
        this.f43511z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new vo0[3];
        this.f43456t1 = new kn0(this, 19);
        this.f43483w1 = new GradientDrawable[2];
        this.f43493x1 = new boolean[2];
        this.f43503y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.f43457t2 = new Rect();
        this.f43494x2 = new so0(this);
        this.f43504y2 = new yo0(this, 0);
        this.f43387l3 = true;
        this.f43395m3 = new int[2];
        this.f43404n3 = new int[2];
        this.f43505y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f43285a4 = new org.telegram.ui.Cells.k1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f43296b4 = videoFramesRewinder;
        this.f43307c4 = new hp0(this, videoFramesRewinder);
        this.f43316d4 = new org.telegram.ui.Cells.g2(this);
        this.f43356h4 = new yo0(this, 1);
        this.f43364i4 = new yo0(this, 2);
        this.f43371j4 = new t50(this, 1);
        this.f43380k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f43476v4 = new kn0(this, 20);
        this.B4 = new ImageReceiver(null);
        this.C4 = new fi.s2(this, 5);
        this.D4 = new ImageReceiver(null);
        this.E4 = new h2.c(1, new kn0(this, 21));
        this.F4 = new h2.c(1, new kn0(this, 21));
        this.G4 = new h2.c(1, new kn0(this, 21));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f43308c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f43287a6 = 1.0f;
        this.f43298b6 = 0.0f;
        this.f43415o6 = -1;
        this.t6 = new DecelerateInterpolator(1.5f);
        this.f43488w6 = 1.0f;
        this.f43498x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43288a7 = new ArrayList();
        this.f43299b7 = new ArrayList();
        this.f43310c7 = new ArrayList();
        this.f43319d7 = new ArrayList();
        this.f43330e7 = new ArrayList();
        this.f43341f7 = new ArrayList();
        this.f43350g7 = new ArrayList();
        this.h7 = null;
        this.i7 = null;
        this.f43383k7 = new Rect();
        this.f43416o7 = new kn0(this, 22);
        this.f43444r7 = new h2.f(new int[]{org.telegram.messenger.ks.f25283s, org.telegram.messenger.ks.f25289t, org.telegram.messenger.ks.W, org.telegram.messenger.ks.V, org.telegram.messenger.ks.f25218g3});
        this.E7 = new float[]{1.0f};
        this.F7 = new float[]{1.0f};
        this.L7 = new kn0(this, 23);
        this.T7 = new int[2];
        this.f43300b8 = -1L;
        this.f43311c8 = -1L;
        this.f43320d8 = -1L;
        this.f43342f8 = -1;
        this.K8 = new org.telegram.ui.Components.c6(new kn0(this, 21), 180L, org.telegram.ui.Components.kr.f36859g);
        this.S8 = new Object();
        this.T8 = new a0.h();
        this.Z8 = new RectF();
        this.f43312c9 = new kn0(this, 24);
        this.f43321d9 = new fo0(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.i0(3);
    }

    public static boolean A1() {
        if (f43278l9 != null) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap C0(android.graphics.Bitmap r16, org.telegram.messenger.we r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C0(android.graphics.Bitmap, org.telegram.messenger.we, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean I1(org.telegram.messenger.fj fjVar) {
        if (f43278l9 != null && !f43278l9.B3 && f43278l9.f43322e && fjVar != null && f43278l9.T4 != null && f43278l9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43278l9.T4.f24073k) == org.telegram.messenger.fj.B0(fjVar.f24073k)) {
            return true;
        }
        return false;
    }

    public static boolean J1(org.telegram.messenger.fj fjVar) {
        if (f43279m9 != null && fjVar != null && f43279m9.T4 != null && f43279m9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43279m9.T4.f24073k) == org.telegram.messenger.fj.B0(fjVar.f24073k)) {
            return true;
        }
        return false;
    }

    public static boolean K1(String str) {
        if (f43278l9 != null && f43278l9.f43322e && !f43278l9.f43451s4 && str != null && str.equals(f43278l9.f43328e5)) {
            return true;
        }
        return false;
    }

    public static void L(PhotoViewer photoViewer) {
        int i7;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i7 = photoViewer.Q4) >= 0 && i7 < arrayList.size() && (fjVar = (org.telegram.messenger.fj) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f43406n5 && (message = fjVar.f24073k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.a31.N0())) {
                photoViewer.z2(fjVar, j2(fjVar), false, true);
            } else {
                photoViewer.z2(fjVar, fjVar.f24131z, photoViewer.f43406n5, true);
            }
        }
    }

    public static boolean L1(org.telegram.messenger.fj fjVar) {
        boolean z10;
        if (f43278l9 != null && !f43278l9.B3 && f43278l9.f43322e && !f43278l9.f43451s4 && fjVar != null) {
            org.telegram.messenger.fj fjVar2 = f43278l9.T4;
            if (fjVar2 == null && f43278l9.d != null) {
                fjVar2 = f43278l9.d.V();
            }
            if (fjVar2 != null && fjVar2.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(fjVar2.f24073k) == org.telegram.messenger.fj.B0(fjVar.f24073k)) {
                z10 = true;
                if (z10 && f43279m9 != null) {
                    if (f43279m9.f43322e && !f43279m9.f43451s4 && fjVar != null && f43279m9.T4 != null && f43279m9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43279m9.T4.f24073k) == org.telegram.messenger.fj.B0(fjVar.f24073k)) {
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
        if (f43278l9 != null && f43278l9.f43322e && !f43278l9.f43451s4 && botInlineResult != null && f43278l9.Y4 != null && botInlineResult.f28490id == f43278l9.Y4.f28490id) {
            return true;
        }
        return false;
    }

    public static boolean N1(TLRPC.FileLocation fileLocation) {
        if (f43278l9 != null && f43278l9.f43322e && !f43278l9.f43451s4 && fileLocation != null) {
            if (f43278l9.Z4 == null || fileLocation.local_id != f43278l9.Z4.f23976f.local_id || fileLocation.volume_id != f43278l9.Z4.f23976f.volume_id || fileLocation.dc_id != f43278l9.Z4.f23972a) {
                if (f43278l9.f43286a5 != null && fileLocation.local_id == f43278l9.f43286a5.f23976f.local_id && fileLocation.volume_id == f43278l9.f43286a5.f23976f.volume_id && fileLocation.dc_id == f43278l9.f43286a5.f23972a) {
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
        if (photoViewer.f43300b8 != -1 && (textureView = photoViewer.C2) != null) {
            photoViewer.f43300b8 = -1L;
            photoViewer.A2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.kr.f36861j).setDuration(85L).setListener(new org.telegram.ui.Components.f10(12, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void P(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P(org.telegram.ui.PhotoViewer):void");
    }

    public static void Q(PhotoViewer photoViewer) {
        int i7;
        org.telegram.ui.Components.l61 l61Var = photoViewer.f43430q3;
        if (l61Var.f37053f) {
            i7 = l61Var.d;
        } else {
            i7 = l61Var.f37050b;
        }
        int L = (org.telegram.messenger.g0.L(2.0f) + ((org.telegram.ui.Components.l61.S / 2) + i7)) - (photoViewer.f43450s3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = (photoViewer.f43363i3.getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - (photoViewer.f43450s3.getMeasuredWidth() / 2);
        if (L < L2) {
            jp0 jp0Var = photoViewer.f43450s3;
            jp0Var.setPivotX(Utilities.i((jp0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f43450s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            jp0 jp0Var2 = photoViewer.f43450s3;
            jp0Var2.setPivotX(Utilities.i((jp0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f43450s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            jp0 jp0Var3 = photoViewer.f43450s3;
            jp0Var3.setPivotX(jp0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f43450s3.setTranslationX(L);
    }

    public static boolean Q2(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            if (fjVar.f24132z0 || fjVar.f24128y0 || fjVar.D2(true) || (fjVar.B() && org.telegram.messenger.bz.B0)) {
                int i7 = org.telegram.messenger.bz.f23270a;
                if (org.telegram.messenger.pc.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void R(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.nh0 C;
        nq0 nq0Var = photoViewer.X4;
        ArrayList arrayList = nq0Var.f50394e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) nq0Var.f50394e.get(i7);
                if (b20Var.f23124a == 0 && (b20Var.f23126b & 1) != 0) {
                    View view = b20Var.I;
                    if ((view instanceof org.telegram.ui.Components.p9) && (C = ((org.telegram.ui.Components.p9) view).getImageReceiver().C()) != null) {
                        if (z10) {
                            C.start();
                        } else {
                            C.stop();
                        }
                    }
                }
            }
        }
    }

    public static void S(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.nh0 C;
        nq0 nq0Var = photoViewer.X4;
        ArrayList arrayList = nq0Var.f50394e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) nq0Var.f50394e.get(i7);
                if (b20Var.f23124a == 0 && (b20Var.f23126b & 1) != 0) {
                    View view = b20Var.I;
                    if ((view instanceof org.telegram.ui.Components.p9) && (C = ((org.telegram.ui.Components.p9) view).getImageReceiver().C()) != null) {
                        long j10 = photoViewer.f43454s8;
                        long j11 = 0;
                        if (j10 > 0) {
                            j11 = j10 / 1000;
                        }
                        C.U(j3 - j11);
                    }
                }
            }
        }
    }

    public static int S0(org.telegram.messenger.xe xeVar) {
        if (xeVar.d()) {
            return org.telegram.messenger.g0.Z0(false);
        }
        return 512;
    }

    public static void T(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String V0(int i7, int i10) {
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

    public static String W0(int i7, int i10, int i11) {
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
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f23271a0 && org.telegram.messenger.bz.o() >= 2 && !org.telegram.messenger.g0.m0) {
            return true;
        }
        return false;
    }

    public static boolean c(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence j2(org.telegram.messenger.fj fjVar) {
        if (fjVar.f24073k == null) {
            return "";
        }
        Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(fjVar.f24073k.translatedText.text), org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false, null, 0), fjVar.f24073k.translatedText.entities, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.fj.M(B5)) {
            try {
                org.telegram.messenger.g0.c(B5, 5, false, true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 0, 0, true);
        org.telegram.messenger.fj.b(B5, fjVar.f24073k.translatedText.entities, fjVar.P3(), true, true, true, 0);
        if (org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 3, (int) fjVar.L0(), false);
        } else if (fjVar.I3() || org.telegram.messenger.fj.R4(fjVar.f24073k)) {
            org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 4, (int) fjVar.L0(), false);
        }
        return B5;
    }

    public static String m1(org.telegram.messenger.fc fcVar) {
        if (fcVar != null && fcVar.f23985p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer p1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f43278l9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f43278l9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f43278l9 = photoViewer;
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
        org.telegram.ui.Components.h61 h61Var;
        org.telegram.messenger.fj fjVar;
        boolean z11;
        qq0 qq0Var = photoViewer.f43334f0;
        photoViewer.f43323e0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f43352h0, photoViewer.f43323e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bn bnVar = photoViewer.f43388l4;
        if (bnVar != null && bnVar.f46118a0 != null && bnVar.getFragmentView() != null) {
            rj rjVar = photoViewer.f43388l4.f46118a0;
            if (rjVar.f32755p3) {
                rjVar.Y1();
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.k3(photoViewer.f43388l4.getParentActivity(), photoViewer.f43302c);
            photoViewer.f43388l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (h61Var = photoViewer.G2) != null && h61Var.S() > 1500 && (fjVar = photoViewer.T4) != null && org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            num = Integer.valueOf((int) (photoViewer.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(0);
            String K = org.telegram.messenger.v3.K(org.telegram.messenger.mp.u1(photoViewer.U).O0(Long.valueOf(-org.telegram.messenger.fj.B0(fjVar2.f24073k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.mp.u1(photoViewer.U).X2, "/", K, "/");
                sb2.append(fjVar2.e1());
                str = sb2.toString();
            }
        }
        ep0 ep0Var = new ep0(photoViewer, photoViewer.E, photoViewer.f43388l4, arrayList, str, num, qq0Var, z10);
        ep0Var.A0(false);
        ep0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.g0.h3(new bd0(26, photoViewer, ep0Var), 250L);
        ep0Var.show();
    }

    public static void v(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.fj fjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.k0()) {
            return;
        }
        org.telegram.messenger.fj fjVar2 = photoViewer.T4;
        File file2 = null;
        if (fjVar2 != null) {
            if (fjVar2.t() && !photoViewer.T4.U2()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.T4.P3()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean L4 = org.telegram.messenger.fj.L4(photoViewer.T4.f24073k);
            if (!TextUtils.isEmpty(photoViewer.T4.f24073k.attachPath)) {
                File file3 = new File(photoViewer.T4.f24073k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                file2 = org.telegram.messenger.w7.M(photoViewer.T4.f24073k, false, true);
            }
            fjVar = fjVar2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = L4;
        } else {
            file = null;
            fjVar = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.i7 = new yq0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            gq0 gq0Var = new gq0();
            gq0Var.f48344c = false;
            photoViewer.j3(false, true, gq0Var);
            org.telegram.messenger.g0.h3(new un0(photoViewer, file, z10, fjVar, z11, z12), gq0Var.f48342a);
            return;
        }
        photoViewer.T2();
    }

    public static String v1() {
        File z10 = org.telegram.messenger.w7.z(4);
        return new File(z10, org.telegram.messenger.bz.p() + "_temp.jpg").getAbsolutePath();
    }

    public static void x(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x(org.telegram.ui.PhotoViewer):void");
    }

    public final void A0() {
        if (this.E2) {
            this.V8.a(new fi.e(21));
            org.telegram.messenger.g0.g3(new kn0(this, 7));
            return;
        }
        this.V8.a(new pn0(this, 1));
    }

    public final void A2(int i7) {
        B2(i7, true, false, false);
    }

    public final void A3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A3():void");
    }

    public final void B0() {
        if (this.D1 != null) {
            return;
        }
        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(this.F, this.f43484w2);
        this.D1 = qd0Var;
        qd0Var.setVisibility(8);
        this.D1.a();
        this.f43334f0.addView(this.D1, this.f43334f0.indexOfChild(this.X7) - 1, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new fo0(this));
    }

    public final void B1() {
        boolean[] zArr = this.f43493x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f43334f0.invalidate();
    }

    public final void B2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.B2(int, boolean, boolean, boolean):void");
    }

    public final void B3() {
        long j3;
        int H;
        org.telegram.messenger.fj fjVar;
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            int H2 = uq0Var.H();
            this.P0.a(H2);
            if (H2 == 0) {
                o3(false, true);
            }
            if (this.T0 != null) {
                uq0 uq0Var2 = this.d;
                long j10 = 0;
                if (uq0Var2 != null) {
                    j3 = uq0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (fjVar = this.T4) != null) {
                    j3 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                }
                oi.w1 w1Var = this.T0;
                uq0 uq0Var3 = this.d;
                if (uq0Var3 == null || !uq0Var3.q() || this.d.w()) {
                    j10 = org.telegram.messenger.mp.u1(this.U).P1(j3);
                }
                uq0 uq0Var4 = this.d;
                if (uq0Var4 == null) {
                    H = 1;
                } else {
                    H = uq0Var4.H();
                }
                w1Var.i(Math.max(1, H), j10, true);
            }
        }
    }

    public final void C1() {
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null) {
            qd0Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.f38811b.f21987a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            og.o oVar = this.D1.f38811b;
            oVar.q();
            CropAreaView cropAreaView2 = oVar.f21987a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f43465u2 = true;
        }
    }

    public final void C2() {
        if (this.f43405n4 == 0) {
            D2(this.C4, this.P4, null);
            E2(this.P4, this.f43506y4);
            D2(this.D4, this.P4 + 1, this.G1);
            E2(this.P4 + 1, this.A4);
            D2(this.B4, this.P4 - 1, this.F1);
            E2(this.P4 - 1, this.f43515z4);
        }
    }

    public final void C3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C3():void");
    }

    public final void D0() {
        org.telegram.messenger.we weVar;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            weVar = new org.telegram.messenger.we();
            weVar.f27775k = this.E1.f21950i;
        } else {
            weVar = this.X4.f50393c;
        }
        org.telegram.messenger.we weVar2 = weVar;
        int q10 = this.C4.q();
        int o4 = this.C4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q10, o4, config);
        tg.i2 i2Var = this.f43423p5;
        if (i2Var != null && i2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f43423p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f43423p5.K);
            float width3 = createBitmap.getWidth();
            if ((this.f43423p5.K / 90) % 2 != 0) {
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
        up0 up0Var = new up0(this, this.E, this.U, createBitmap2, createBitmap, this.C4.V, weVar2);
        this.O1 = up0Var;
        up0Var.f58240s.setOnClickListener(new in0(this, 5));
        this.O1.f58241w.setOnClickListener(new in0(this, 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f43334f0.indexOfChild(this.f43468u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f43334f0.getChildCount();
        }
        this.f43334f0.addView(this.O1, indexOfChild, c8.na.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void D1() {
        tg.i2 i2Var = this.f43423p5;
        if (i2Var == null || !i2Var.W) {
            xe.b bVar = this.f43281a0;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11661g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            xe.b bVar2 = this.f43292b0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            zo0 zo0Var = this.V1;
            if (zo0Var != null) {
                zo0Var.m();
            }
            ap0 ap0Var = this.W1;
            if (ap0Var != null) {
                ap0Var.m();
            }
            iq0 iq0Var = this.f43460t5;
            if (iq0Var != null) {
                iq0Var.invalidate();
            }
            iq0 iq0Var2 = this.f43477v5;
            if (iq0Var2 != null) {
                iq0Var2.invalidate();
            }
            iq0 iq0Var3 = this.f43487w5;
            if (iq0Var3 != null) {
                iq0Var3.invalidate();
            }
            iq0 iq0Var4 = this.f43497x5;
            if (iq0Var4 != null) {
                iq0Var4.invalidate();
            }
            iq0 iq0Var5 = this.f43507y5;
            if (iq0Var5 != null) {
                iq0Var5.invalidate();
            }
            wo0 wo0Var = this.Y7;
            if (wo0Var != null && wo0Var.f39829f0) {
                wo0Var.invalidate();
            }
            qq0 qq0Var = this.f43334f0;
            if (qq0Var != null) {
                qq0Var.invalidate();
            }
        }
    }

    public final void D2(org.telegram.messenger.ImageReceiver r23, int r24, og.g r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.D2(org.telegram.messenger.ImageReceiver, int, og.g):void");
    }

    public final void D3() {
        String V0;
        String V02;
        int[] iArr = this.f43395m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f43404n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            long max = Math.max(0L, h61Var.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.H8 && this.X7.getVisibility() == 0) {
                max2 = (this.Y7.getRightProgress() - this.Y7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.Y7.getLeftProgress() * ((float) max2));
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
            dq0 dq0Var = this.f43343g0;
            if (dq0Var != null && dq0Var.f36730y) {
                long max3 = Math.max(0, dq0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f43343g0.getVideoDuration());
                if (!this.H8 && this.X7.getVisibility() == 0) {
                    max4 = (this.Y7.getRightProgress() - this.Y7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.Y7.getLeftProgress() * ((float) max4));
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
            V0 = W0(i7 / 60, i7 % 60, iArr[1]);
        } else {
            V0 = V0(i7, iArr[1]);
        }
        int i10 = iArr2[0];
        if (i10 >= 60) {
            V02 = W0(i10 / 60, i10 % 60, iArr2[1]);
        } else {
            V02 = V0(i10, iArr2[1]);
        }
        this.f43413o3.l(V0 + " / " + V02, false);
        if (!Objects.equals(this.j3, V02)) {
            this.j3 = V02;
            this.f43363i3.requestLayout();
        }
    }

    public final void E0() {
        int q10;
        int o4;
        org.telegram.messenger.we weVar;
        Bitmap n10;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) textureView;
                q10 = x51Var.getVideoWidth();
                o4 = x51Var.getVideoHeight();
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
            Bitmap bitmap = this.f43506y4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q10, o4, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i7 = this.d2;
            nq0 nq0Var = this.X4;
            boolean z10 = true;
            if (i7 == 1) {
                weVar = new org.telegram.messenger.we();
                weVar.f27775k = this.E1.f21950i;
            } else {
                weVar = nq0Var.f50393c;
            }
            org.telegram.messenger.we weVar2 = weVar;
            hi.x3 x3Var = new hi.x3(this.f43352h0, false, new pn0(this, 3));
            x3Var.f15712f = true;
            x3Var.f15713g = true;
            this.L1 = x3Var;
            if (this.f43467u4 == 3) {
                z10 = false;
            }
            x3Var.b(z10);
            Activity activity = this.E;
            int i10 = this.U;
            if (this.f43448s1) {
                n10 = null;
            } else {
                n10 = this.C4.n();
            }
            vp0 vp0Var = new vp0(this, activity, activity, i10, bitmap2, n10, this.C4.V, nq0Var.f50394e, weVar2, new kn0(this, 10), this.f43484w2);
            this.M1 = vp0Var;
            fh.g c10 = this.Z.c(vp0Var.M0, null, false);
            c10.p(c8.j0.j(this.f43484w2));
            vp0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f43334f0.addView(this.M1.getView(), c8.na.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new kn0(this, 11));
            this.M1.getCancelView().setOnClickListener(new in0(this, 9));
            this.M1.w0(org.telegram.messenger.g0.L(126.0f));
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

    public final void E2(int i7, org.telegram.ui.Components.cc0 cc0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (cc0Var != null) {
            cc0Var.a();
            cc0Var.setVisibility(8);
            ArrayList arrayList2 = this.f43350g7;
            if (!arrayList2.isEmpty() && i7 >= 0 && i7 < arrayList2.size()) {
                Object obj = arrayList2.get(i7);
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    z10 = efVar.f27963b;
                    str = efVar.f27969j;
                    arrayList = efVar.f27975p;
                } else {
                    if (obj instanceof org.telegram.messenger.hf) {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        str = hfVar.f27969j;
                        arrayList = hfVar.f27975p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                cc0Var.setVisibility(0);
                if (this.d2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cc0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    cc0Var.f34016a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(cc0Var.f34016a);
                    cc0Var.d = bitmapDrawable;
                    cc0Var.setBackground(bitmapDrawable);
                    return;
                }
                cc0Var.f34016a = null;
                cc0Var.d = null;
                cc0Var.setBackground(null);
            }
        }
    }

    public final void E3() {
        int v;
        if (this.f43342f8 > 0) {
            if (this.f43331e8 >= this.f43342f8) {
                this.f43331e8 = this.f43342f8 - 1;
            }
            if (this.d2 == 1) {
                float max = Math.max(800.0f / this.f43367i8, 800.0f / this.f43375j8);
                this.f43384k8 = Math.round((this.f43367i8 * max) / 2.0f) * 2;
                this.f43392l8 = Math.round((this.f43375j8 * max) / 2.0f) * 2;
            } else {
                Size i02 = i0();
                this.f43384k8 = i02.getWidth();
                this.f43392l8 = i02.getHeight();
            }
            if (this.f43400m8 != 0) {
                if (this.d2 == 1) {
                    this.f43400m8 = 1560000;
                    v = this.f43400m8;
                } else if (this.f43384k8 == this.f43367i8 && this.f43392l8 == this.f43375j8) {
                    this.f43400m8 = this.f43409n8;
                    v = MediaController.v(this.f43384k8, this.f43392l8, this.f43400m8, false);
                } else {
                    this.f43400m8 = MediaController.Q(this.f43375j8, this.f43367i8, this.f43409n8, this.f43392l8, this.f43384k8);
                    v = MediaController.v(this.f43384k8, this.f43392l8, this.f43400m8, false);
                }
                this.f43500x8 = ((v / 8) * this.f43417o8) / 1000.0f;
            }
        }
    }

    public final void F0() {
        cr0 cr0Var = new cr0(this.f43334f0.getContext(), this);
        this.f43363i3 = cr0Var;
        this.f43334f0.addView(cr0Var, c8.na.e(-1, 48, 83));
        fo0 fo0Var = new fo0(this);
        ip0 ip0Var = new ip0(this, fo0Var);
        tv tvVar = new tv(6, this.f43334f0.getContext(), this);
        this.f43440r3 = tvVar;
        tvVar.setAccessibilityDelegate(ip0Var);
        this.f43440r3.setImportantForAccessibility(1);
        this.f43363i3.addView(this.f43440r3, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(this.f43440r3);
        this.f43430q3 = l61Var;
        l61Var.f37071z = org.telegram.messenger.g0.L(2.0f);
        org.telegram.ui.Components.l61 l61Var2 = this.f43430q3;
        l61Var2.f37057k = 872415231;
        l61Var2.f37058l = 872415231;
        l61Var2.f37059m = -1;
        l61Var2.f37060n = -1;
        l61Var2.A = 1509949439;
        l61Var2.f37056j = fo0Var;
        jp0 jp0Var = new jp0(this, this.f43334f0.getContext(), new qn0(this));
        this.f43450s3 = jp0Var;
        jp0Var.setAlpha(0.0f);
        this.f43334f0.addView(this.f43450s3, c8.na.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this.f43334f0.getContext());
        this.f43413o3 = n5Var;
        n5Var.setTextColor(-1);
        this.f43413o3.setGravity(53);
        this.f43413o3.setTextSize(14);
        this.f43413o3.setImportantForAccessibility(2);
        this.f43363i3.addView(this.f43413o3, c8.na.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f43334f0.getContext());
        this.f43421p3 = imageView;
        imageView.setImageResource(2131232257);
        this.f43421p3.setContentDescription(org.telegram.messenger.gd.N0(2131754723, "AccExitFullscreen"));
        this.f43421p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f43421p3.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        this.f43421p3.setVisibility(4);
        this.f43363i3.addView(this.f43421p3, c8.na.e(48, 48, 53));
        this.f43421p3.setOnClickListener(new vn0(this, 6));
    }

    public final boolean F1() {
        org.telegram.ui.Components.yc b12 = b1();
        if (b12 != null) {
            if (b12.M.c() || b12.f14936f.f41722e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void F2(int r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.F2(int, boolean, boolean, boolean):void");
    }

    public final boolean F3() {
        org.telegram.ui.Components.s30 s30Var = this.f43420p2;
        if (s30Var != null && s30Var.d && !s30Var.f39484e) {
            return true;
        }
        return false;
    }

    public final void G0(org.telegram.messenger.ff ffVar) {
        org.telegram.ui.Components.ga gaVar;
        if (this.C2 == null) {
            org.telegram.ui.Components.te0 te0Var = new org.telegram.ui.Components.te0(2, this.E, this);
            this.f43513z2 = te0Var;
            te0Var.setWillNotDraw(false);
            this.f43513z2.setVisibility(4);
            this.f43334f0.addView(this.f43513z2, 0, c8.na.e(-1, -1, 17));
            this.E2 = false;
            if (this.f43350g7.isEmpty()) {
                if (this.f43291b && this.T2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(this.E, this.G2);
                this.f43303c0.e();
                org.telegram.ui.Components.ba baVar = this.f43303c0;
                x51Var.f41856s = baVar;
                org.telegram.ui.Components.bz bzVar = x51Var.f41850b;
                if (bzVar != null && (gaVar = bzVar.J) != null) {
                    org.telegram.ui.Components.ba baVar2 = gaVar.f35392t;
                    if (baVar2 != null && baVar2.f33717m != null) {
                        baVar2.f33717m = null;
                    }
                    gaVar.f35392t = baVar;
                    if (baVar != null && baVar.f33717m != gaVar) {
                        baVar.f33717m = gaVar;
                        baVar.d();
                    }
                }
                if (ffVar != null) {
                    x51Var.setDelegate(new ln0(ffVar, 0));
                }
                this.C2 = x51Var;
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
                this.f43513z2.addView(this.C2, c8.na.e(-1, -1, 17));
            } else {
                this.f43513z2.addView(this.D2, c8.na.e(-1, -1, 17));
            }
            pq0 pq0Var = new pq0(this.E, this);
            this.F2 = pq0Var;
            pq0Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f43513z2.addView(this.F2, c8.na.e(-1, -1, 17));
            View view = new View(this.E);
            this.f43332e9 = view;
            this.f43513z2.addView(view, c8.na.c(-1.0f, -1));
            if (this.d2 == 1) {
                View view2 = new View(this.E);
                this.A2 = view2;
                view2.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.f43513z2.addView(this.A2, c8.na.e(-1, -1, 17));
            }
        }
    }

    public final boolean G1() {
        int i7;
        if (this.h7 != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43341f7;
            if (i7 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) this.f43288a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.h7.f23976f;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (fcVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = fcVar.f23976f;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.h7.f23976f;
                    if (i12 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void G2(float f10, View view, boolean z10, boolean z11) {
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
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new en0(this, 6)).setInterpolator(new LinearInterpolator()).withEndAction(new a80(this, z10, view, 5)).start();
            return;
        }
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
        view.setAlpha(f12);
        r3();
    }

    public final boolean H0() {
        boolean z10 = false;
        if (this.f43424p6 != null || this.D1 == null) {
            return false;
        }
        this.f43349g6 = 1.0f;
        this.f43407n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43424p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f));
        this.f43424p6.setDuration(250L);
        this.f43424p6.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        this.f43424p6.addListener(new gp0(this, 0));
        this.f43424p6.start();
        og.m mVar = this.D1.f38811b.M;
        if (mVar != null) {
            z10 = mVar.f21984j;
        }
        return !z10;
    }

    public final boolean H1(rq0 rq0Var) {
        if (rq0Var != null) {
            Object g10 = rq0Var.g();
            if (g10 instanceof org.telegram.messenger.fj) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) g10;
                if (fjVar.f24073k != null) {
                    if (org.telegram.messenger.mp.u1(this.U).G2(org.telegram.messenger.fj.B0(fjVar.f24073k)) || fjVar.f24073k.noforwards || fjVar.y2()) {
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

    public final void H2(View view, boolean z10, boolean z11) {
        G2(1.0f, view, z10, z11);
    }

    public final boolean I0(float f10, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.qd0 qd0Var;
        float f11;
        if (this.f43424p6 == null && (qd0Var = this.D1) != null) {
            qd0Var.f38811b.i();
            this.f43298b6 = 0.0f;
            this.f43340f6 = 0.0f + f10;
            if (z10) {
                this.f43349g6 = 1.0f;
            }
            this.f43407n6 = System.currentTimeMillis();
            this.f43424p6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.f43329e6 = 1.0f;
                this.f43287a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int q10 = imageReceiver.q();
                    int o4 = this.C4.o();
                    if (Math.abs((((int) this.D1.f38811b.getStateOrientation()) / 90) % 2) == 1) {
                        o4 = q10;
                        q10 = o4;
                    }
                    org.telegram.messenger.we weVar = this.X4.f50393c;
                    if (weVar != null) {
                        q10 = (int) (q10 * weVar.f27771e);
                        o4 = (int) (o4 * weVar.f27772f);
                    }
                    float f12 = q10;
                    float f13 = o4;
                    float min = Math.min(g1(1) / f12, d1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(g1(1) / f13, d1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f43329e6 = f11 / min;
                }
            }
            if (this.d2 == 11) {
                this.f43287a6 = q2(false) * this.f43287a6;
                this.f43329e6 = q2(false) * this.f43329e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new hi.da(this, f10, this.D1.f38812c.getRotation(), 4));
            this.f43424p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f), ofFloat);
            this.f43424p6.setDuration(250L);
            this.f43424p6.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            this.f43424p6.addListener(new di.j6(this, f10, runnable, 5));
            this.f43424p6.start();
            if (Math.abs(this.D1.f38811b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void I2(boolean z10, boolean z11) {
        if (this.f43447s0.getVisibility() != 0) {
            this.f43492x0.f54045f.t("", z10, true);
        } else if (Math.abs(this.f43464u1 - 1.0f) < 0.001f) {
            this.f43492x0.f54045f.t("", z10, true);
        } else {
            org.telegram.ui.Components.m6 m6Var = this.f43492x0.f54045f;
            m6Var.t(org.telegram.ui.Components.ou0.a(this.f43464u1) + "x", z10, true);
        }
        this.f43447s0.e(z10, this.f43464u1);
        b61 b61Var = this.J0;
        float f10 = this.f43464u1;
        org.telegram.ui.ActionBar.y0[] y0VarArr = (org.telegram.ui.ActionBar.y0[]) b61Var.f45965b;
        for (int i7 = 0; i7 < y0VarArr.length; i7++) {
            if (z11 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                y0VarArr[i7].d(-9718023, -9718023);
            } else {
                y0VarArr[i7].d(-328966, -328966);
            }
        }
    }

    public final void J0() {
        if (this.E != null && this.f43352h0 != null) {
            wi.n nVar = this.V8;
            if (nVar != null) {
                this.V8 = null;
                nVar.b();
            }
            xi.e eVar = this.I7;
            if (eVar != null) {
                eVar.b();
                this.I7 = null;
            }
            ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.f43302c);
            n2(false);
            try {
                if (this.f43352h0.getParent() != null) {
                    ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.f43352h0);
                    V1();
                }
                this.f43352h0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.hc hcVar = this.f43372j5;
            if (hcVar != null) {
                hcVar.a();
                this.f43372j5 = null;
            }
            this.f43360i0.setImageBitmap(null);
            if (this == f43279m9) {
                f43279m9 = null;
            } else {
                f43278l9 = null;
            }
            V1();
        }
    }

    public final void J2(Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        bg.v0 v0Var;
        Activity parentActivity;
        boolean z10;
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        qq0 qq0Var;
        boolean z11;
        float f14;
        float f15;
        int i11;
        int L;
        bg.v0 v0Var2 = this.f43453s7;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43453s7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.f43453s7 = v0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = g2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.n6.K(parentActivity, false);
        this.f43484w2 = i6Var;
        this.f43396m4 = g2Var;
        int i12 = org.telegram.messenger.i10.f24637t0;
        this.U = i12;
        this.C4.d = i12;
        this.B4.d = i12;
        this.D4.d = i12;
        zo0 zo0Var = this.V1;
        if (zo0Var != null) {
            zo0Var.setAccount(i12);
            this.V1.f14936f.k(false);
        }
        ap0 ap0Var = this.W1;
        if (ap0Var != null) {
            ap0Var.setAccount(this.U);
            this.W1.f14936f.k(false);
        }
        tg.i2 i2Var = this.f43423p5;
        if (i2Var != null) {
            i2Var.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.f43446s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.f43512z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (f43272f9 == null) {
                f43272f9 = new Drawable[]{f0.d.d(this.E, 2131231008), f0.d.d(this.E, 2131230931), f0.d.d(this.E, 2131231639)};
            }
            this.V6 = new Scroller(parentActivity);
            vq0 vq0Var = new vq0(this, parentActivity);
            this.f43352h0 = vq0Var;
            vq0Var.setBackground(this.M0);
            this.f43352h0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f43360i0 = clippingImageView;
            clippingImageView.O = this.f43380k4;
            clippingImageView.L = false;
            clippingImageView.N = false;
            this.f43352h0.addView(clippingImageView, c8.na.c(40.0f, 40));
            qq0 qq0Var2 = new qq0(this, parentActivity, parentActivity);
            this.f43334f0 = qq0Var2;
            qq0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f43296b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f43334f0);
            }
            this.f43334f0.setClipChildren(true);
            this.f43334f0.setClipToPadding(true);
            this.f43352h0.setClipChildren(false);
            this.f43352h0.setClipToPadding(false);
            org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(this.f43334f0);
            this.f43303c0 = baVar;
            baVar.f33707a = 1;
            this.Y = new ho0(this);
            this.f43292b0 = new xe.b();
            this.f43281a0 = new xe.b();
            dh.c cVar = new dh.c(this.Y);
            this.Z = cVar;
            cVar.g(new jh.k(this.f43334f0), this.f43334f0);
            this.Z.f(this.f43292b0);
            this.f43313d0 = new org.telegram.ui.Components.fa(this.f43303c0, this.f43334f0);
            this.f43352h0.addView(this.f43334f0, c8.na.e(-1, -1, 51));
            r0.i0.l(this.f43334f0, new qn0(this));
            this.f43334f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f43323e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.g0.m(layoutParams);
            this.f43323e0.flags = -2147286784;
            org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(this.E);
            this.f43506y4 = cc0Var;
            cc0Var.setVideoPosition(new qn0(this));
            this.f43334f0.addView(this.f43506y4, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.cc0 cc0Var2 = new org.telegram.ui.Components.cc0(this.E);
            this.f43515z4 = cc0Var2;
            this.f43334f0.addView(cc0Var2, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.cc0 cc0Var3 = new org.telegram.ui.Components.cc0(this.E);
            this.A4 = cc0Var3;
            this.f43334f0.addView(cc0Var3, c8.na.c(-2.0f, -2));
            org.telegram.ui.Components.u7 u7Var = new org.telegram.ui.Components.u7(4, parentActivity, this);
            this.G = u7Var;
            u7Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.f43446s);
            this.G.E(1090519039, false);
            this.G.F(-1, false);
            this.G.setBackButtonImage(2131231243);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            tq0 tq0Var = new tq0(parentActivity);
            this.N = tq0Var;
            this.G.addView(tq0Var, c8.na.e(-1, -1, 119));
            this.f43334f0.addView(this.G, c8.na.c(-2.0f, -1));
            sq0 sq0Var = new sq0(parentActivity);
            this.O = sq0Var;
            this.f43334f0.addView(sq0Var, c8.na.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new ro0(this, i6Var));
            org.telegram.ui.ActionBar.y s5 = this.G.s();
            this.B0 = s5;
            s5.setOnLayoutListener(new kn0(this, 17));
            org.telegram.ui.ActionBar.q0 a10 = this.B0.a(26, 2131231789);
            this.F0 = a10;
            a10.setContentDescription(org.telegram.messenger.gd.M0(2131751586));
            c8.sa.a(this.F0);
            H2(this.F0, false, false);
            org.telegram.ui.ActionBar.q0 a11 = this.B0.a(11, 2131232222);
            this.E0 = a11;
            a11.setContentDescription(org.telegram.messenger.gd.M0(2131748486));
            org.telegram.ui.ActionBar.q0 a12 = this.B0.a(18, 2131232185);
            this.D0 = a12;
            a12.setContentDescription(org.telegram.messenger.gd.M0(2131754809));
            org.telegram.ui.ActionBar.q0 a13 = this.B0.a(4, 2131232186);
            this.C0 = a13;
            a13.setContentDescription(org.telegram.messenger.gd.M0(2131750570));
            org.telegram.ui.ActionBar.y yVar = this.B0;
            xq xqVar = new xq(2131232802, this.F, new fi.b());
            this.f43492x0 = xqVar;
            org.telegram.ui.ActionBar.q0 d = yVar.d(1, xqVar);
            this.f43427q0 = d;
            this.f43492x0.setCallback(d.getIconView());
            this.f43427q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43427q0.getPopupLayout().f28826c = true;
            this.f43427q0.getPopupLayout().setFitItems(true);
            this.f43427q0.setMenuXOffset(org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this.F, i6Var);
            this.f43447s0 = u0Var;
            u0Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f43447s0.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            this.f43447s0.setDrawShadow(false);
            this.f43447s0.setBackgroundColor(-14540254);
            this.f43447s0.setTextColor(-1);
            this.f43447s0.setLabel(org.telegram.messenger.gd.M0(2131743337));
            this.f43447s0.setOnValueChange(new rn0(this, 1));
            this.f43427q0.getPopupLayout().a(this.f43447s0, c8.na.o(-1, 44));
            org.telegram.ui.ActionBar.d1 a14 = this.f43427q0.a(-1);
            this.A0 = a14;
            a14.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f43427q0.getPopupLayout();
            b61 b61Var = new b61(this.F, new qn0(this));
            this.J0 = b61Var;
            popupLayout.addView(b61Var);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.f43502y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f43427q0.getPopupLayout().addView(this.f43502y0);
            org.telegram.ui.ActionBar.y0 e10 = this.f43427q0.e(22, 2131231917, org.telegram.messenger.gd.M0(2131743338));
            this.f43455t0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(this, this.F, 1);
            this.H0 = p7Var;
            try {
                p7Var.setRouteSelector(g6.a.c(this.F).a());
                z10 = true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.f(e11);
                z10 = false;
            }
            this.H0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.y0 e12 = this.f43427q0.e(24, 2131231916, org.telegram.messenger.gd.M0(2131743342));
                this.G0 = e12;
                e12.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, c8.na.c(-1.0f, -1));
            }
            this.f43427q0.I(-115203550);
            this.f43427q0.setOnMenuDismiss(new pn0(this, 9));
            org.telegram.ui.ActionBar.q0 a15 = this.B0.a(0, 2131231753);
            this.f43418p0 = a15;
            a15.setContentDescription(org.telegram.messenger.gd.M0(2131754838));
            this.f43418p0.setOnClickListener(new vn0(this, 4));
            this.f43418p0.setOnMenuDismiss(new pn0(this, 10));
            this.f43418p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43418p0.getPopupLayout().f28826c = true;
            this.f43418p0.getPopupLayout().setFitItems(true);
            this.K0 = new vq(this.F, this.f43418p0.getPopupLayout().getSwipeBack(), new qn0(this));
            org.telegram.ui.ActionBar.y0 i13 = this.f43418p0.i(2131232172, null, org.telegram.messenger.gd.M0(2131745733), this.K0.f53017a);
            i13.d(-328966, -328966);
            this.f43463u0 = i13;
            i13.setOnClickListener(new vn0(this, 5));
            org.telegram.ui.ActionBar.d1 a16 = this.f43418p0.a(-1);
            this.f43472v0 = a16;
            a16.setColor(-15198184);
            this.f43418p0.e(10, 2131232270, org.telegram.messenger.gd.M0(2131747602)).d(-328966, -328966);
            org.telegram.ui.ActionBar.y0 e13 = this.f43418p0.e(6, 2131231918, org.telegram.messenger.gd.M0(2131747028));
            e13.d(-328966, -328966);
            this.f43482w0 = e13;
            org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(false);
            this.f43434q7 = r0Var;
            org.telegram.ui.ActionBar.y0 f16 = this.f43418p0.f(r0Var, org.telegram.messenger.gd.M0(2131743341), 126, true, 0);
            this.f43425p7 = f16;
            f16.d(-328966, -328966);
            this.f43425p7.setItemHeight(56);
            this.f43425p7.setSelectorColor(268435455);
            this.f43425p7.setRightIcon(2131232365);
            this.f43425p7.setSubtext(org.telegram.messenger.gd.M0(2131743340));
            this.f43425p7.getRightIcon().setBackground(org.telegram.ui.ActionBar.n6.g0(536870911, 1));
            if (org.telegram.messenger.gd.f24314a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            int i14 = i7 | 16;
            ImageView rightIcon = this.f43425p7.getRightIcon();
            boolean z12 = org.telegram.messenger.gd.f24314a0;
            if (z12) {
                f10 = 4.0f;
            } else {
                f10 = 0.0f;
            }
            if (z12) {
                f11 = 0.0f;
            } else {
                f11 = 4.0f;
            }
            rightIcon.setLayoutParams(c8.na.d(40, 40.0f, i14, f10, 0.0f, f11, 0.0f));
            View view = new View(this.F);
            view.setBackgroundColor(536870911);
            boolean z13 = org.telegram.messenger.gd.f24314a0;
            if (z13) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            if (z13) {
                f13 = 0.0f;
            } else {
                f13 = 52.0f;
            }
            FrameLayout.LayoutParams d2 = c8.na.d(-1, 28.0f, i14, f12, 0.0f, f13, 0.0f);
            d2.width = 1;
            view.setLayoutParams(d2);
            this.f43425p7.addView(view);
            View[] viewArr = {this.f43425p7.getTextView(), this.f43425p7.getSubtextView()};
            int i15 = 0;
            for (int i16 = 2; i15 < i16; i16 = 2) {
                View view2 = viewArr[i15];
                if (view2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (org.telegram.messenger.gd.f24314a0) {
                        i11 = org.telegram.messenger.g0.L(60.0f);
                    } else {
                        i11 = 0;
                    }
                    layoutParams2.leftMargin = i11;
                    if (org.telegram.messenger.gd.f24314a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(60.0f);
                    }
                    layoutParams2.rightMargin = L;
                    view2.setLayoutParams(layoutParams2);
                }
                i15++;
            }
            this.f43425p7.getRightIcon().setContentDescription(org.telegram.messenger.gd.M0(2131745037));
            this.f43425p7.getRightIcon().setOnClickListener(new vn0(this, 8));
            this.f43418p0.u(126);
            org.telegram.ui.ActionBar.y0 e14 = this.f43418p0.e(3, 2131232224, org.telegram.messenger.gd.M0(2131745151));
            this.f43437r0 = e14;
            e14.d(-328966, -328966);
            this.f43418p0.e(12, 2131232175, org.telegram.messenger.gd.M0(2131745734)).d(-328966, -328966);
            this.f43418p0.e(5, 2131232229, org.telegram.messenger.gd.M0(2131745146)).d(-328966, -328966);
            this.f43418p0.e(25, 2131232387, org.telegram.messenger.gd.M0(2131751692)).d(-328966, -328966);
            this.f43418p0.e(21, 2131231880, org.telegram.messenger.gd.M0(2131746067)).d(-328966, -328966);
            this.f43418p0.e(23, 2131232338, org.telegram.messenger.gd.M0(2131746016)).d(-328966, -328966);
            this.f43418p0.e(9, 2131232370, org.telegram.messenger.gd.M0(2131745263)).d(-328966, -328966);
            this.f43418p0.e(13, 2131232387, org.telegram.messenger.gd.M0(2131745132)).d(-328966, -328966);
            this.f43418p0.e(14, 2131232271, org.telegram.messenger.gd.M0(2131745346)).d(-328966, -328966);
            this.f43418p0.e(19, 2131232413, org.telegram.messenger.gd.M0(2131743709)).d(-328966, -328966);
            this.f43418p0.e(20, 2131232413, org.telegram.messenger.gd.M0(2131749111)).d(-328966, -328966);
            this.f43418p0.e(7, 2131232113, org.telegram.messenger.gd.M0(2131751586)).d(-328966, -328966);
            this.f43418p0.e(8, 2131232092, org.telegram.messenger.gd.M0(2131744598)).d(-328966, -328966);
            this.f43418p0.I(-115203550);
            this.f43418p0.u(19);
            this.f43418p0.u(20);
            I2(false, true);
            this.f43418p0.setPopupItemsSelectorColor(268435455);
            this.f43418p0.setSubMenuDelegate(new fo0(this));
            gh0 gh0Var = new gh0(this.F, 1);
            this.f43368j0 = gh0Var;
            gh0Var.setBackgroundColor(2130706432);
            this.f43334f0.addView(this.f43368j0, c8.na.e(-1, 48, 83));
            View view3 = new View(this.F);
            this.f43376k0 = view3;
            if (this.d2 == 11) {
                i10 = -16777216;
            } else {
                i10 = 2130706432;
            }
            view3.setBackgroundColor(i10);
            this.f43352h0.addView(this.f43376k0, c8.na.a(-1.0f, this.f43385l0 / org.telegram.messenger.g0.f24225p, 87));
            this.f43483w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f43483w1[0].setShape(0);
            this.f43483w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f43483w1[1].setShape(0);
            org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(this.F, org.telegram.messenger.g0.L(10.0f));
            this.f43393m1 = w20Var;
            this.f43334f0.addView(w20Var, c8.na.e(-1, 68, 83));
            this.f43393m1.setDelegate(new to0(this));
            for (int i17 = 0; i17 < 3; i17++) {
                this.f43505y3[i17] = new ImageView(this.E);
                this.f43505y3[i17].setImageResource(2131232223);
                this.f43505y3[i17].setContentDescription(org.telegram.messenger.gd.N0(2131754717, "AccSwitchToFullscreen"));
                this.f43505y3[i17].setScaleType(ImageView.ScaleType.CENTER);
                this.f43505y3[i17].setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
                this.f43505y3[i17].setVisibility(4);
                this.f43505y3[i17].setAlpha(1.0f);
                this.f43334f0.addView(this.f43505y3[i17], c8.na.c(48.0f, 48));
                this.f43505y3[i17].setOnClickListener(new in0(this, 0));
            }
            this.R = new uo0(new fi.b());
            mq0 mq0Var = new mq0(this.f43334f0.getContext());
            this.R1 = mq0Var;
            mq0Var.setFactory(new zd0(this, 2));
            this.R1.setVisibility(4);
            x2(true);
            for (int i18 = 0; i18 < 3; i18++) {
                this.X0[i18] = new vo0(this, this.f43334f0);
                this.X0[i18].d(0, false, true);
            }
            yc ycVar = new yc(this, this.F, i6Var);
            this.Y0 = ycVar;
            ycVar.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(org.telegram.messenger.g0.L(54.0f));
            this.Y0.setBackgroundResource(2131231008);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f43334f0.addView(this.Y0, c8.na.e(64, 64, 17));
            F0();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, i6Var);
            this.W7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.W7.setBackgroundResource(2131231008);
            this.W7.setVisibility(4);
            this.f43334f0.addView(this.W7, c8.na.e(54, 54, 17));
            org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this.E, 3);
            this.V7 = x0Var;
            x0Var.setBackgroundColor(2130706432);
            this.V7.b();
            this.V7.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            ((TextView) this.V7.f32380b).setText(org.telegram.messenger.gd.N0(2131751342, "Done").toUpperCase());
            int i19 = org.telegram.ui.ActionBar.n6.f29700qg;
            org.telegram.ui.ActionBar.u6.U((TextView) this.V7.f32380b, i19, i6Var);
            this.f43334f0.addView(this.V7, c8.na.e(-1, 48, 83));
            ((TextView) this.V7.d).setOnClickListener(new in0(this, 3));
            ((TextView) this.V7.f32380b).setOnClickListener(new in0(this, 4));
            org.telegram.ui.Components.z51 z51Var = new org.telegram.ui.Components.z51(false);
            this.A1 = z51Var;
            z51Var.c(new fo0(this));
            qq0 qq0Var3 = this.f43334f0;
            Objects.requireNonNull(qq0Var3);
            this.B1 = new org.telegram.ui.Components.en0(new gf0(qq0Var3, 17), false);
            xq0 xq0Var = new xq0(this.E, this);
            this.U7 = xq0Var;
            xq0Var.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            this.U7.setVisibility(4);
            this.U7.setBackgroundColor(2130706432);
            this.f43334f0.addView(this.U7, c8.na.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            di.n4 n4Var = new di.n4(this, this.F);
            this.Q0 = n4Var;
            this.f43334f0.addView(n4Var, c8.na.e(-1, -2, 83));
            TextView textView = new TextView(this.f43334f0.getContext());
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
            TextView textView3 = new TextView(this.f43334f0.getContext());
            this.f43402n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.f43402n0.setSingleLine(true);
            this.f43402n0.setMaxLines(1);
            this.f43402n0.setEllipsize(truncateAt);
            this.f43402n0.setTextColor(-1);
            this.f43402n0.setGravity(3);
            this.Q0.addView(this.f43402n0, c8.na.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f43334f0.getContext());
            this.f43410o0 = textView4;
            int i20 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.b6.e(w1(i20), 6.0f), org.telegram.ui.ActionBar.u6.M(i20), org.telegram.ui.ActionBar.u6.e(i20), i6Var);
            TextView textView5 = this.f43410o0;
            int i21 = org.telegram.ui.ActionBar.n6.Ji;
            org.telegram.ui.ActionBar.u6.U(textView5, i21, i6Var);
            this.f43410o0.setEllipsize(truncateAt);
            this.f43410o0.setGravity(17);
            this.f43410o0.setLines(1);
            this.f43410o0.setSingleLine(true);
            this.f43410o0.setText(org.telegram.messenger.gd.N0(2131745345, "SetAsMyPhoto"));
            this.f43410o0.setTextSize(1, 15.0f);
            this.f43410o0.setTypeface(org.telegram.messenger.g0.o());
            this.f43410o0.setOnClickListener(new in0(this, 7));
            this.f43410o0.setVisibility(8);
            this.Q0.addView(this.f43410o0, c8.na.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            wo0 wo0Var = new wo0(this.E, this);
            this.Y7 = wo0Var;
            wo0Var.setDelegate(new com.google.android.gms.common.api.internal.t(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.X7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.X7.addView(this.Y7, c8.na.e(-1, 54, 83));
            b3(false, false);
            this.f43334f0.addView(this.X7, c8.na.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                fh.g a17 = this.Z.a(q0Var);
                a17.p(c8.j0.j(i6Var));
                a17.r(org.telegram.messenger.g0.L(20.0f));
                a17.q(org.telegram.messenger.g0.L(7.0f));
                q0Var.setBackground(ih.d.d(a17, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f)));
            }
            xo0 xo0Var = new xo0(this.E, org.telegram.messenger.gd.M0(2131751196));
            this.f43353h1 = xo0Var;
            fh.g a18 = this.Z.a(xo0Var);
            a18.p(c8.j0.j(i6Var));
            xo0Var.setBlurredBackgroundDrawable(a18);
            c8.sa.a(this.f43353h1);
            this.f43353h1.setOnClickListener(new in0(this, 8));
            this.f43334f0.addView(this.f43353h1, c8.na.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.ee0 ee0Var = new org.telegram.ui.Components.ee0(this.E, i6Var, this.f43303c0);
            this.f43432q5 = ee0Var;
            org.telegram.ui.Components.ct ctVar = ee0Var.f34697c;
            fh.g a19 = this.Z.a(ctVar);
            a19.p(c8.j0.j(i6Var));
            ctVar.setBlurredBackgroundDrawable(a19);
            c8.sa.a(this.f43432q5.f34697c);
            this.f43432q5.setVisibility(8);
            this.f43432q5.setAlpha(0.0f);
            this.f43432q5.setOnClose(new kn0(this, 13));
            this.f43334f0.addView(this.f43432q5, c8.na.e(-1, -1, 119));
            this.f43432q5.f34696b.setOnClickListener(new in0(this, 10));
            this.f43432q5.setOnGalleryImage(new pn0(this, 4));
            org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(3, this.E, this);
            this.f43335f1 = f0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            f0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f0 f0Var2 = this.f43335f1;
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(this.E);
            this.f43324e1 = h00Var;
            f0Var2.setImageDrawable(h00Var);
            this.f43335f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.f0 f0Var3 = this.f43335f1;
            fh.g a20 = this.Z.a(f0Var3);
            a20.p(c8.j0.j(null));
            a20.q(org.telegram.messenger.g0.L(4.0f));
            a20.r(org.telegram.messenger.g0.L(16.0f));
            f0Var3.setBackground(a20);
            c8.sa.a(this.f43335f1);
            this.f43334f0.addView(this.f43335f1, c8.na.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f43335f1.setOnClickListener(new in0(this, 11));
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(this.f43334f0.getContext());
            this.f43344g1 = l80Var;
            l80Var.setOnClickListener(new in0(this, 12));
            this.f43334f0.addView(this.f43344g1, c8.na.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f43334f0.getContext();
            vq0 vq0Var2 = this.f43352h0;
            qq0 qq0Var4 = this.f43334f0;
            zo0 zo0Var2 = new zo0(this, context, vq0Var2, qq0Var4, qq0Var4, i6Var, this.f43303c0, new kn0(this, 16));
            this.V1 = zo0Var2;
            zo0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new pn0(this, 5));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new pn0(this, 6));
            this.V1.setOnAddPhotoClick(new in0(this, 13));
            ContextThemeWrapper contextThemeWrapper = this.F;
            vq0 vq0Var3 = this.f43352h0;
            qq0 qq0Var5 = this.f43334f0;
            ap0 ap0Var2 = new ap0(this, contextThemeWrapper, vq0Var3, qq0Var5, qq0Var5, i6Var, this.f43303c0, new kn0(this, 16));
            this.W1 = ap0Var2;
            ap0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new pn0(this, 7));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new pn0(this, 8));
            this.W1.setOnAddPhotoClick(new in0(this, 14));
            fi.u2 u2Var = new fi.u2(this, this.F);
            this.s5 = u2Var;
            u2Var.setVisibility(8);
            this.f43334f0.addView(this.s5, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            tg.i2 i2Var2 = new tg.i2(this.F, i6Var);
            this.f43423p5 = i2Var2;
            i2Var2.setCurrentAccount(this.U);
            this.f43334f0.addView(this.f43423p5, qq0Var.indexOfChild(this.G) - 1, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            iq0 iq0Var = new iq0(this);
            this.f43460t5 = iq0Var;
            iq0Var.setRad(18);
            this.f43460t5.l();
            this.f43423p5.setStickerCutOutBtn(this.f43460t5);
            this.f43460t5.setOnClickListener(new in0(this, 15));
            this.f43460t5.setCutOutState(false);
            this.f43334f0.addView(this.f43460t5, c8.na.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.f43468u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            iq0 iq0Var2 = new iq0(this);
            this.f43477v5 = iq0Var2;
            iq0Var2.f58297s0 = true;
            iq0Var2.setRad(18);
            this.f43477v5.setEraseState(false);
            this.f43477v5.setOnClickListener(new in0(this, 16));
            this.f43468u5.addView(this.f43477v5, c8.na.o(-2, 36));
            this.f43468u5.addView(new Space(this.E), c8.na.o(12, -1));
            iq0 iq0Var3 = new iq0(this);
            this.f43487w5 = iq0Var3;
            iq0Var3.f58297s0 = true;
            iq0Var3.setRad(18);
            this.f43487w5.setRestoreState(false);
            this.f43487w5.setOnClickListener(new in0(this, 17));
            this.f43468u5.addView(this.f43487w5, c8.na.o(-2, 36));
            this.f43334f0.addView(this.f43468u5, c8.na.e(-2, 36, 17));
            iq0 iq0Var4 = new iq0(this);
            this.f43497x5 = iq0Var4;
            iq0Var4.setUndoState(false);
            this.f43497x5.setRad(18);
            iq0 iq0Var5 = this.f43497x5;
            iq0Var5.f58297s0 = true;
            iq0Var5.setOnClickListener(new in0(this, 18));
            this.f43334f0.addView(this.f43497x5, c8.na.e(-2, 36, 17));
            iq0 iq0Var6 = new iq0(this);
            this.f43507y5 = iq0Var6;
            iq0Var6.setOutlineState(false);
            this.f43507y5.setRad(18);
            iq0 iq0Var7 = this.f43507y5;
            iq0Var7.f58297s0 = true;
            iq0Var7.setOnClickListener(new in0(this, 19));
            this.f43334f0.addView(this.f43507y5, c8.na.e(-2, 36, 17));
            V2(false, false);
            Z2(false, false);
            k0 k0Var = new k0(19, this.E, this);
            this.Y1 = k0Var;
            k0Var.addView(this.V1, c8.na.e(-1, -1, 83));
            this.f43334f0.addView(this.Y1, c8.na.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, c8.na.e(-1, -1, 51));
            this.f43334f0.addView(this.Z1, c8.na.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f43334f0.addView(frameLayout3, c8.na.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f43334f0.addView(frameLayout4, c8.na.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.Z7 = textView6;
            textView6.setSingleLine(true);
            this.Z7.setVisibility(8);
            this.Z7.setText(org.telegram.messenger.gd.N0(2131752121, "ChooseCover"));
            this.Z7.setGravity(1);
            this.Z7.setTextSize(1, 14.0f);
            this.Z7.setTextColor(-7566196);
            this.f43334f0.addView(this.Z7, c8.na.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            oi.w1 w1Var = new oi.w1(this, this.E, i6Var);
            this.T0 = w1Var;
            int L2 = org.telegram.messenger.g0.L(52.0f);
            int L3 = org.telegram.messenger.g0.L(38.0f);
            w1Var.L = L2;
            w1Var.M = L3;
            oi.w1 w1Var2 = this.T0;
            w1Var2.f39940s0 = true;
            fh.g a21 = this.Z.a(w1Var2);
            a21.p(c8.j0.j(i6Var));
            w1Var2.setBlurredBackgroundDrawable(a21);
            this.f43334f0.addView(this.T0, c8.na.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(org.telegram.messenger.gd.N0(2131745444, "Send"));
            c8.sa.a(this.T0);
            this.T0.setOnClickListener(new in0(this, 20));
            this.T0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.fe0 fe0Var = new org.telegram.ui.Components.fe0(this.E);
            this.U0 = fe0Var;
            LinearLayout linearLayout3 = fe0Var.f35113b;
            fh.g a22 = this.Z.a(linearLayout3);
            a22.p(c8.j0.j(i6Var));
            a22.r(org.telegram.messenger.g0.L(18.0f));
            a22.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout3.setBackground(a22);
            LinearLayout linearLayout4 = this.U0.f35114c;
            fh.g a23 = this.Z.a(linearLayout4);
            a23.p(c8.j0.j(i6Var));
            a23.r(org.telegram.messenger.g0.L(18.0f));
            a23.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout4.setBackground(a23);
            this.U0.setVisibility(8);
            this.U0.f35113b.setOnClickListener(new in0(this, 21));
            this.U0.f35114c.setOnClickListener(new in0(this, 22));
            this.f43334f0.addView(this.U0, c8.na.e(-1, 56, 80));
            b61 b61Var2 = new b61(20, this.E, this);
            this.I0 = b61Var2;
            b61Var2.setOrientation(0);
            this.I0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            b61 b61Var3 = this.I0;
            fh.g a24 = this.Z.a(b61Var3);
            a24.p(c8.j0.j(i6Var));
            a24.q(org.telegram.messenger.g0.L(2.0f));
            a24.r(org.telegram.messenger.g0.L(22.0f));
            b61Var3.setBackground(a24);
            this.Q0.addView(this.I0, c8.na.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.f43282a1 = imageView;
            imageView.setScaleType(scaleType);
            this.f43282a1.setImageResource(2131231733);
            this.f43282a1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43282a1, c8.na.o(48, 48));
            this.f43282a1.setOnClickListener(new in0(this, 23));
            this.f43282a1.setContentDescription(org.telegram.messenger.gd.N0(2131751686, "CropImage"));
            ImageView imageView2 = new ImageView(this.E);
            this.f43304c1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f43304c1.setImageResource(2131232287);
            this.f43304c1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43304c1, c8.na.o(48, 48));
            this.f43304c1.setOnClickListener(new in0(this, 24));
            this.f43304c1.setContentDescription(org.telegram.messenger.gd.N0(2131754782, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.E);
            this.f43293b1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f43293b1.setImageResource(2131231746);
            this.f43293b1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43293b1, c8.na.o(48, 48));
            this.f43293b1.setOnClickListener(new in0(this, 25));
            this.f43293b1.setContentDescription(org.telegram.messenger.gd.N0(2131754839, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.E);
            this.Z0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Z0.setImageResource(2131231743);
            this.Z0.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.Z0, c8.na.o(48, 48));
            this.Z0.setOnClickListener(new in0(this, 26));
            this.Z0.setContentDescription(org.telegram.messenger.gd.N0(2131754809, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this.E);
            this.f43377k1 = u51Var;
            u51Var.setTag(1);
            this.f43377k1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.f43331e8 = u2();
            org.telegram.ui.Components.u51 u51Var2 = this.f43377k1;
            if (this.f43435q8 && this.f43342f8 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            u51Var2.a(Math.min(this.f43384k8, this.f43392l8), z11, this.f43436r);
            this.f43377k1.setContentDescription(org.telegram.messenger.gd.N0(2131754734, "AccDescrVideoQuality"));
            this.I0.addView(this.f43377k1, c8.na.o(48, 48));
            this.f43377k1.setOnClickListener(new ig0(4, this, parentActivity));
            ImageView imageView5 = new ImageView(this.E);
            this.f43314d1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f43314d1.setImageResource(2131231760);
            this.f43314d1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43314d1, c8.na.o(48, 48));
            this.f43314d1.setOnClickListener(new in0(this, 27));
            this.f43314d1.setContentDescription(org.telegram.messenger.gd.N0(2131754810, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(this.F, 3);
            this.V0 = x0Var2;
            x0Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f43334f0.addView(this.V0, c8.na.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new in0(this, 28));
            ((TextView) this.V0.f32380b).setOnClickListener(new in0(this, 29));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.g0(-12763843, 0));
            this.W0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
            this.W0.setText(org.telegram.messenger.gd.M0(2131751684).toUpperCase());
            this.W0.setTypeface(org.telegram.messenger.g0.o());
            this.V0.addView(this.W0, c8.na.e(-2, -1, 49));
            this.W0.setOnClickListener(new vn0(this, 0));
            org.telegram.ui.Components.l10 l10Var = new org.telegram.ui.Components.l10(this.f43334f0.getContext(), this);
            this.f43443r6 = l10Var;
            l10Var.b();
            this.f43452s6 = true;
            this.f43443r6.h = this;
            qn0 qn0Var = new qn0(this);
            this.C4.I0(this.f43334f0);
            ImageReceiver imageReceiver = this.C4;
            imageReceiver.l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.e0(qn0Var);
            this.B4.I0(this.f43334f0);
            ImageReceiver imageReceiver2 = this.B4;
            imageReceiver2.l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.e0(qn0Var);
            this.D4.I0(this.f43334f0);
            ImageReceiver imageReceiver3 = this.D4;
            imageReceiver3.l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.e0(qn0Var);
            int rotation = ((WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f43334f0.getContext(), 2131232697);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(org.telegram.messenger.g0.L(1.0f));
            this.O0.c(w1(i19), -1);
            this.O0.setVisibility(8);
            qq0 qq0Var6 = this.f43334f0;
            CheckBox checkBox2 = this.O0;
            if (rotation != 3 && rotation != 1) {
                f14 = 71.0f;
            } else {
                f14 = 61.0f;
            }
            qq0Var6.addView(checkBox2, c8.na.d(34, 34.0f, 53, 0.0f, f14, 11.0f, 0.0f));
            if (!this.f43446s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24220m;
            }
            this.O0.setOnClickListener(new vn0(this, 1));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            qq0 qq0Var7 = this.f43334f0;
            if (rotation != 3 && rotation != 1) {
                f15 = 68.0f;
            } else {
                f15 = 58.0f;
            }
            qq0Var7.addView(counterView, c8.na.d(40, 40.0f, 53, 0.0f, f15, 64.0f, 0.0f));
            if (!this.f43446s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24220m;
            }
            this.P0.setOnClickListener(new vn0(this, 2));
            br0 br0Var = new br0(this.E);
            this.f43419p1 = br0Var;
            br0Var.setVisibility(8);
            this.f43419p1.setAlpha(0.0f);
            this.f43419p1.setLayoutManager(new jg.b0());
            br0 br0Var2 = this.f43419p1;
            l4 l4Var = new l4(15, this, this.E);
            this.f43428q1 = l4Var;
            br0Var2.setAdapter(l4Var);
            this.f43334f0.addView(this.f43419p1, c8.na.e(-1, 103, 51));
            this.f43419p1.setOnItemClickListener(new h(this, 22));
            UndoView undoView = new UndoView(this.F, null, false, i6Var);
            this.f43411o1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(112.0f));
            this.f43411o1.h(-115203550, -1);
            this.f43334f0.addView(this.f43411o1, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.g0.C1()) {
                View view4 = new View(this.F);
                this.T3 = view4;
                view4.setContentDescription(org.telegram.messenger.gd.N0(2131754929, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new vn0(this, 3));
                this.f43334f0.addView(this.T3, c8.na.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.u6.Q(this.f43410o0, org.telegram.ui.ActionBar.b6.e(w1(i20), 6.0f), org.telegram.ui.ActionBar.u6.M(i20), org.telegram.ui.ActionBar.u6.e(i20), i6Var);
            org.telegram.ui.ActionBar.u6.U(this.f43410o0, i21, i6Var);
            uo0 uo0Var = this.R;
            uo0Var.f32274j0 = true;
            uo0Var.f32270h0 = false;
            org.telegram.ui.Cells.u9 n10 = uo0Var.n(this.f43352h0.getContext());
            if (n10 != null) {
                org.telegram.messenger.g0.E2(n10);
                this.f43334f0.addView(n10);
            }
            this.R.S(this.f43334f0);
            this.R.R();
            this.f43280a.a(false, false);
            return;
        }
        t3();
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        if (i7 == 0) {
            float f12 = 1.0f - f10;
            this.U0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f12);
            this.U0.setAlpha(f10);
            org.telegram.ui.Components.fe0 fe0Var = this.U0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fe0Var.setVisibility(i10);
            if (this.f43345g2) {
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
                oi.w1 w1Var = this.T0;
                if (i13 < 0) {
                    i12 = 0;
                }
                w1Var.setVisibility(i12);
                this.T0.setAlpha(f12);
                this.T0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
            }
        }
    }

    public final void K0() {
        if (this.C4.m() == null && !this.f43350g7.isEmpty() && this.d2 != 1) {
            String str = this.C4.R;
            String str2 = this.f43496x4;
            if (str2 == null || !str2.equals(str)) {
                this.f43486w4 = 0;
                org.telegram.messenger.hc p10 = this.C4.p();
                int i7 = this.C4.V;
                if (str != null && p10 != null && p10.f24522c != null) {
                    Utilities.f22877e.c(new org.telegram.ui.Components.kp0(this, p10, i7, str, 15));
                }
            }
        }
    }

    public final void K2(org.telegram.ui.Components.ti tiVar) {
        this.f43294b2 = tiVar;
        bg.v0 v0Var = this.f43305c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43305c2 = null;
        }
        if (tiVar != null) {
            if (tiVar.f30249k1 == null) {
                Window window = tiVar.getWindow();
                ?? obj = new Object();
                obj.f3326c = new a1.c(new WeakReference(window), 11);
                tiVar.f30249k1 = obj;
            }
            bg.w0 w0Var = tiVar.f30249k1;
            w0Var.getClass();
            this.f43305c2 = new bg.v0(w0Var);
        }
    }

    public final void L0() {
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.f43342f8)), this.f43331e8);
        edit.commit();
        E3();
        C3();
    }

    public final void L2() {
        bn bnVar;
        TLRPC.Chat chat;
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            if (uq0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f43401n && (bnVar = this.f43388l4) != null && (chat = bnVar.f46173e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.b5.K(this.E, org.telegram.messenger.gd.N0(2131745114, "Slowmode"), org.telegram.messenger.gd.N0(2131745107, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, j1());
            boolean x10 = this.d.x(this.P4);
            this.O0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f43428q1.i(k10);
                    this.f43419p1.y0(k10);
                } else {
                    this.f43428q1.s(k10);
                    if (k10 == 0) {
                        this.f43428q1.g(0);
                    }
                }
            }
            B3();
        }
    }

    public final void M0() {
        bg.v0 v0Var = this.f43453s7;
        if (v0Var != null) {
            v0Var.a();
            this.f43453s7 = null;
        }
        bg.v0 v0Var2 = this.f43305c2;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43305c2 = null;
        }
        try {
            if (this.f43352h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.f43352h0);
                V1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void M2() {
        float q10 = this.C4.q();
        float o4 = this.C4.o();
        if (q10 != 0.0f && o4 != 0.0f) {
            float g12 = g1(this.f43467u4);
            float e12 = e1();
            float min = Math.min(e12 / o4, g12 / q10);
            float max = Math.max(g12 / ((int) (q10 * min)), e12 / ((int) (o4 * min)));
            this.f43287a6 = max;
            v3(max);
        }
    }

    public final void N0(android.graphics.Canvas r51, org.telegram.ui.Components.fa r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N0(android.graphics.Canvas, org.telegram.ui.Components.fa, int, int, boolean, boolean, boolean):void");
    }

    public final void N2(CharSequence charSequence) {
        tq0 tq0Var = this.N;
        this.f43327e4 = charSequence;
        tq0Var.c(charSequence);
        i3(true, false);
    }

    public final void O0(android.graphics.Canvas r24, float r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.O0(android.graphics.Canvas, float, float):void");
    }

    public final boolean O1() {
        if (this.J4 && P1() && this.d2 != 1) {
            return true;
        }
        return false;
    }

    public final void O2(boolean z10, boolean z11) {
        if (this.f43387l3 != z10) {
            if (z10) {
                this.f43368j0.setTag(1);
            } else {
                this.f43368j0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f43379k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f43387l3 = z10;
            float f10 = 0.0f;
            int i7 = 0;
            if (z11) {
                if (z10) {
                    this.f43363i3.setVisibility(0);
                }
                float alpha = this.f43363i3.getAlpha();
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new en0(this, 0));
                ofFloat.addListener(new op0(this, z10, 0));
                this.f43379k3 = ofFloat;
                ofFloat.start();
            } else {
                cr0 cr0Var = this.f43363i3;
                if (!z10) {
                    i7 = 8;
                }
                cr0Var.setVisibility(i7);
                cr0 cr0Var2 = this.f43363i3;
                if (z10) {
                    f10 = 1.0f;
                }
                cr0Var2.setAlpha(f10);
            }
            if (this.f43386l2 && this.f43374j7 == null) {
                if (z10) {
                    this.f43418p0.T(9);
                } else {
                    this.f43418p0.u(9);
                }
            }
        }
    }

    public final void P0(Canvas canvas) {
        boolean z10;
        float d;
        int i7;
        if (this.S4) {
            if (!org.telegram.messenger.bz.f23277c0) {
                d = 1.0f;
            } else {
                int i10 = this.f43405n4;
                if (i10 != 0 && i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d = this.K8.d(z10);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.g0.f24220m * 1.5f));
            int height = this.Q0.getHeight() + org.telegram.messenger.g0.f24221n;
            if (this.V1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            if (this.M7 == null) {
                this.M7 = new Path();
                Paint paint = new Paint(1);
                this.N7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.O7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.P7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.Q7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.R7 = new Matrix();
                this.S7 = new Matrix();
                this.N7.setShader(this.P7);
                this.O7.setShader(this.Q7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f43334f0.getWidth(), this.f43334f0.getHeight() + org.telegram.messenger.g0.f24221n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.M7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.M7.addRect(0.0f, 0.0f, this.f43334f0.getWidth(), f10, direction);
            this.M7.addRect(0.0f, (this.f43334f0.getHeight() + org.telegram.messenger.g0.f24221n) - i11, this.f43334f0.getWidth(), this.f43334f0.getHeight() + org.telegram.messenger.g0.f24221n, direction);
            canvas.clipPath(this.M7);
            canvas.drawColor(-16777216);
            N0(canvas, this.f43313d0, 0, 0, true, true, false);
            canvas.save();
            this.R7.reset();
            this.R7.postScale(1.0f, f10 / 16.0f);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f43334f0.getWidth(), f10, this.N7);
            this.S7.reset();
            this.S7.postScale(1.0f, i11 / 16.0f);
            this.S7.postTranslate(0.0f, (this.f43334f0.getHeight() - i11) + org.telegram.messenger.g0.f24221n);
            this.Q7.setLocalMatrix(this.S7);
            this.O7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f43334f0.getHeight() + org.telegram.messenger.g0.f24221n) - i11, this.f43334f0.getWidth(), this.f43334f0.getHeight() + org.telegram.messenger.g0.f24221n, this.O7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean P1() {
        if (this.d2 != 11) {
            int i7 = this.P4;
            if (i7 >= 0) {
                ArrayList arrayList = this.f43350g7;
                if (i7 < arrayList.size()) {
                    uq0 uq0Var = this.d;
                    if (uq0Var != null && !uq0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.P4);
                    if (obj instanceof org.telegram.messenger.ef) {
                        return ((org.telegram.messenger.ef) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean P2(int i7) {
        rq0 rq0Var = this.f43374j7;
        if (rq0Var != null) {
            if (rq0Var.a(i7) || this.f43374j7.e(i7)) {
                int i10 = org.telegram.messenger.bz.f23270a;
                if (org.telegram.messenger.pc.e(1024)) {
                    File b10 = this.f43374j7.b(i7);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.bz.B0 && (this.f43374j7.d(i7) instanceof TLRPC.Document)) {
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

    @Override
    public final void Q0() {
        B1();
    }

    public final boolean Q1() {
        if (this.f43322e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void R0(float r10, float r11, float r12, float r13, android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.R0(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void R1() {
        WindowManager.LayoutParams layoutParams = this.f43323e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.f43352h0, this.f43323e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f43352h0.setFocusable(true);
        this.f43334f0.setFocusable(true);
    }

    public final void R2(AlertDialog$Builder alertDialog$Builder) {
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

    public final void S1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z10) {
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
        Paint paint = f43273g9;
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

    public final boolean S2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f43396m4;
        if ((g2Var instanceof bn) && org.telegram.messenger.v3.V(((bn) g2Var).f46173e)) {
            org.telegram.ui.Components.fc f10 = new org.telegram.ui.Components.kc(frameLayout, this.f43484w2).f(org.telegram.messenger.mp.u1(this.U).X4, new zn0(this, 3));
            f10.v = new zn0(this, 4);
            this.f43461t7 = f10.j();
            return true;
        }
        return false;
    }

    public final void T0(TLRPC.Document document, TLRPC.Document document2, boolean z10, org.telegram.messenger.p10 p10Var) {
        float f10;
        this.A7 = document;
        this.f43518z7 = document2;
        this.B7 = z10;
        this.C7 = false;
        this.D7 = p10Var;
        this.f43298b6 = 0.0f;
        this.f43340f6 = 0.0f;
        if (this.f43423p5 != null) {
            iq0 iq0Var = this.f43507y5;
            if (iq0Var != null) {
                iq0Var.m(false, false);
            }
            this.f43423p5.b();
            ArrayList arrayList = this.f43442r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.A7 != null) {
            ArrayList arrayList2 = this.f43442r5;
            if (arrayList2 == null) {
                this.f43442r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.A7;
            int i7 = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i7).o0(documentAttribute.stickerset, true);
                        if (o02 != null && o02.packs != null) {
                            for (int i11 = 0; i11 < o02.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = o02.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f28498id)) && org.telegram.messenger.j6.g(tL_stickerPack.emoticon) != null) {
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
                this.f43442r5.addAll(arrayList3);
            }
        }
        iq0 iq0Var2 = this.f43460t5;
        if (iq0Var2 != null) {
            iq0Var2.setCutOutState(false);
        }
        Z2(true, false);
        ImageView imageView = this.f43314d1;
        if (imageView != null) {
            if (this.B7) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void T1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(boolean):void");
    }

    public final void T2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.E, this.f43484w2);
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), null);
        org.telegram.messenger.fj fjVar = this.T4;
        if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f24073k) && org.telegram.messenger.w7.G(this.T4.K1).S(this.f43308c5[0])) {
            t1Var.U = org.telegram.messenger.gd.N0(2131747010, null);
        } else {
            t1Var.U = org.telegram.messenger.gd.N0(2131747024, null);
        }
        R2(alertDialog$Builder);
    }

    public final void U0() {
        wi.n nVar = this.V8;
        if (nVar != null && nVar.d()) {
            return;
        }
        this.V8 = l2.j.d().j(this.f43321d9);
    }

    public final void U1(android.graphics.Canvas r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.U1(android.graphics.Canvas):void");
    }

    public final void U2(final org.telegram.ui.Components.yc ycVar, boolean z10, boolean z11, final float[] fArr) {
        float f10;
        float f11;
        int i7;
        uq0 uq0Var = this.d;
        if (uq0Var != null && uq0Var.l()) {
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
                public final PhotoViewer f47936b;

                {
                    this.f47936b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f47936b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ycVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.X7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f43335f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43344g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43353h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f47936b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ycVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.X7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f43335f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43344g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43353h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.kr.h).start();
        } else if (!z10 && ycVar.getTag() != null) {
            ycVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f47936b;

                {
                    this.f47936b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f47936b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ycVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.X7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f43335f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43344g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43353h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f47936b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ycVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.X7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f43335f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43344g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43353h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.kr.h).withEndAction(new sg(2, ycVar)).start();
        }
        if (z10) {
            num = 1;
        }
        ycVar.setTag(num);
    }

    public final void V1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f43188a1.remove(this.f43456t1);
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f43396m4;
        if (g2Var != null && g2Var.getFragmentView() != null) {
            this.f43398m6 = 1.0f;
            View fragmentView = this.f43396m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.ti tiVar = this.f43294b2;
            if (tiVar != null) {
                org.telegram.ui.ActionBar.m2 m2Var = tiVar.f30229c;
                m2Var.setScaleX(1.0f);
                m2Var.setScaleY(1.0f);
            }
        }
    }

    public final void V2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        uq0 uq0Var = this.d;
        boolean z14 = false;
        if (uq0Var != null && uq0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        zo0 zo0Var = this.V1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        U2(zo0Var, z13, z11, this.E7);
        ap0 ap0Var = this.W1;
        if (z10 && z12) {
            z14 = true;
        }
        U2(ap0Var, z14, z11, this.F7);
    }

    public final void W1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.G2 != null && this.T4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.G2.U() == -9223372036854775807L) {
                        this.f43284a3 = intValue / ((float) this.T4.L0());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.G2.p0(j3);
                    this.f43430q3.h(true, ((float) j3) / ((float) this.G2.U()));
                    this.f43440r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.E instanceof LaunchActivity) {
                    bx bxVar = new bx(null);
                    bxVar.f46597p2 = url;
                    ((LaunchActivity) this.E).u0(bxVar, false, true);
                    z0(false, false);
                    return;
                }
                return;
            } else if (this.f43388l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.t41) || org.telegram.messenger.g0.H3(url))) {
                org.telegram.ui.Components.b5.n0(this.f43388l4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void W2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.W2(boolean, boolean):void");
    }

    public final int X0(int i7) {
        if (i7 != 1 && (i7 != 0 || this.d2 != 1)) {
            if (i7 != 0 && i7 != 5 && i7 != 4 && i7 != 3) {
                return org.telegram.messenger.g0.L(14.0f);
            }
            return 0;
        }
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void X1(wq0 wq0Var) {
        if (this.f43474v2) {
            n2(true);
        }
        org.telegram.messenger.fj fjVar = this.T4;
        if (fjVar != null && !fjVar.P) {
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        }
        this.f43322e = false;
        this.f43333f = false;
        this.f43354h2 = false;
        this.f43451s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f43286a5 = null;
        this.f43297b5 = null;
        this.f43365i5 = null;
        this.f43328e5 = null;
        this.f43439r2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f43363i3 != null) {
            O2(false, false);
        }
        wp0 wp0Var = this.U1;
        if (wp0Var != null) {
            wp0Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.f43325e2 = false;
        this.f43336f2 = false;
        this.f43345g2 = false;
        this.f43362i2 = false;
        org.telegram.messenger.hc hcVar = this.f43372j5;
        if (hcVar != null) {
            hcVar.a();
            this.f43372j5 = null;
        }
        this.f43294b2 = null;
        bg.v0 v0Var = this.f43305c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43305c2 = null;
        }
        org.telegram.ui.Components.b6 b6Var = this.f43378k2;
        if (b6Var != null) {
            b6Var.w(this.f43334f0);
            this.f43378k2 = null;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            vo0 vo0Var = this.X0[i7];
            if (vo0Var != null) {
                vo0Var.d(-1, false, true);
            }
        }
        o2(0);
        wo0 wo0Var = this.Y7;
        if (wo0Var != null) {
            wo0Var.a();
        }
        this.f43411o1.d(0, false);
        this.C4.x0(null);
        this.F4.o();
        this.B4.x0(null);
        this.E4.o();
        this.D4.x0(null);
        this.G4.o();
        this.f43334f0.post(new mn0(this, wq0Var, 0));
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            uq0Var.G();
        }
        org.telegram.ui.Components.w20 w20Var = this.f43393m1;
        w20Var.d.clear();
        w20Var.f41487e.clear();
        w20Var.f41484c.clear();
        uq0 uq0Var2 = this.d;
        if (uq0Var2 != null) {
            uq0Var2.D();
        }
        this.d = null;
        this.f43428q1.f();
        this.f43374j7 = null;
        this.f43451s4 = false;
        this.f43471u8 = 0.0f;
        this.f43480v8 = 1.0f;
        if (wq0Var != null) {
            wq0Var.f53726a.P0(true, true);
        }
        bn bnVar = this.f43388l4;
        if (bnVar != null) {
            bnVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
    }

    public final void X2(boolean z10) {
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
            this.f43351g8 = this.f43331e8;
        }
        AnimatorSet animatorSet = this.f43289a8;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f43289a8 = new AnimatorSet();
        float f20 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f43376k0.setVisibility(0);
                View view = this.f43376k0;
                if (this.d2 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f43376k0;
                if (this.d2 == 11) {
                    i10 = 1711276032;
                } else {
                    i10 = 2130706432;
                }
                view2.setBackgroundColor(i10);
            }
            this.U7.setTag(1);
            AnimatorSet animatorSet2 = this.f43289a8;
            di.n4 n4Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.V1.getEditTextHeight() + n4Var.getHeight();
            if (this.f43448s1) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n4Var, property, 0.0f, editTextHeight + i7);
            di.n4 n4Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n4Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, org.telegram.messenger.g0.L(158.0f));
            View view3 = this.f43376k0;
            if (this.S4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.U7.setTag(null);
            AnimatorSet animatorSet3 = this.f43289a8;
            xq0 xq0Var = this.U7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(xq0Var, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.V7, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            View view4 = this.f43376k0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.f43289a8.addListener(new op0(this, z10, 3));
        this.f43289a8.setDuration(200L);
        this.f43289a8.setInterpolator(org.telegram.messenger.g0.G);
        this.f43289a8.start();
        float f21 = 0.25f;
        if (this.f43335f1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f43335f1.animate();
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
        if (this.f43344g1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f43344g1.animate();
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
        if (this.f43353h1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f43353h1.animate();
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

    public final int Y0(int i7) {
        int i10 = 0;
        if (i7 >= 0) {
            if (i7 != 1 && (i7 != 0 || this.d2 != 1)) {
                if (i7 == 3 && this.M1 != null) {
                    int L = org.telegram.messenger.g0.L(8.0f);
                    if (!this.f43446s) {
                        i10 = org.telegram.messenger.g0.f24220m;
                    }
                    return this.M1.getAdditionalTop() + L + i10;
                } else if (i7 != 0 && i7 != 4 && i7 != 5) {
                    int L2 = org.telegram.messenger.g0.L(14.0f);
                    if (!this.f43446s) {
                        i10 = org.telegram.messenger.g0.f24220m;
                    }
                    return L2 + i10;
                }
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                if (!this.f43446s) {
                    i10 = org.telegram.messenger.g0.f24220m;
                }
                return L3 + i10;
            }
        }
        return 0;
    }

    public final void Y1(org.telegram.messenger.fj r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.fc r24, org.telegram.messenger.fc r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.wq0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.fc, org.telegram.messenger.fc, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.wq0):void");
    }

    public final void Y2() {
        long a10;
        if (this.E != null) {
            bn bnVar = this.f43388l4;
            if (bnVar != null) {
                a10 = bnVar.a();
            } else {
                uq0 uq0Var = this.d;
                if (uq0Var != null) {
                    a10 = uq0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a10;
            org.telegram.ui.Components.b5.H(this.E, j3, -1L, 0, false, new qn0(this), null, new org.telegram.ui.Components.y4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false)), null);
        }
    }

    public final int Z0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z0(boolean):int");
    }

    public final boolean Z1(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z1(android.view.MotionEvent):boolean");
    }

    public final void Z2(boolean z10, boolean z11) {
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
            this.f43423p5.animate().setListener(null).cancel();
            tg.i2 i2Var = this.f43423p5;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i2Var.setVisibility(i10);
            this.f43423p5.setAlpha(this.Q0.getAlpha());
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
        } else if (z10 && this.f43423p5.getTag() == null) {
            this.f43423p5.animate().setListener(null).cancel();
            this.s5.animate().setListener(null).cancel();
            if (this.f43423p5.getVisibility() != 0) {
                this.f43423p5.setVisibility(0);
                this.f43423p5.animate().alpha(1.0f).start();
                this.s5.setVisibility(0);
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f43423p5.getTag() != null) {
            this.f43423p5.animate().setListener(null).cancel();
            this.f43423p5.animate().alpha(0.0f).setListener(new on(this.f43423p5)).start();
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new on(this.s5)).start();
        }
        tg.i2 i2Var2 = this.f43423p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        i2Var2.setTag(num);
        if (z10 && this.f43460t5.f58293o0 != 1 && !this.B7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f43460t5.animate().setListener(null).cancel();
            iq0 iq0Var = this.f43460t5;
            if (z12) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            iq0Var.setVisibility(i7);
            iq0 iq0Var2 = this.f43460t5;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            iq0Var2.setAlpha(f11);
        } else if (z12 && this.f43460t5.getTag() == null) {
            this.f43460t5.animate().setListener(null).cancel();
            if (this.f43460t5.getVisibility() != 0) {
                this.f43460t5.setVisibility(0);
            }
            this.f43460t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f43460t5.getTag() != null) {
            this.f43460t5.animate().setListener(null).cancel();
            this.f43460t5.animate().alpha(0.0f).setListener(new on(this.f43460t5)).start();
        }
        iq0 iq0Var3 = this.f43460t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        iq0Var3.setTag(num2);
        if (z10 && this.f43460t5.f58293o0 == 1 && !this.B7) {
            z13 = true;
        } else {
            z13 = false;
        }
        W2(z13, z11);
        tg.i2 i2Var3 = this.f43423p5;
        if (z10 && this.f43460t5.f58293o0 == 1 && this.f43507y5.f48903u0 && !this.f43477v5.f48903u0 && !this.f43487w5.f48903u0) {
            z14 = true;
        } else {
            z14 = false;
        }
        i2Var3.setOutlineVisible(z14);
        if (!z10 || this.f43460t5.f58293o0 != 1 || this.f43477v5.f48903u0 || this.f43487w5.f48903u0) {
            z15 = false;
        }
        if (!z11) {
            this.f43507y5.animate().setListener(null).cancel();
            iq0 iq0Var4 = this.f43507y5;
            if (z15) {
                i12 = 0;
            }
            iq0Var4.setVisibility(i12);
            iq0 iq0Var5 = this.f43507y5;
            if (z15) {
                f13 = 1.0f;
            }
            iq0Var5.setAlpha(f13);
            iq0 iq0Var6 = this.f43507y5;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            iq0Var6.setScaleX(f10);
            iq0 iq0Var7 = this.f43507y5;
            if (!z15) {
                f14 = 0.8f;
            }
            iq0Var7.setScaleY(f14);
        } else if (z15 && this.f43507y5.getTag() == null) {
            this.f43507y5.animate().setListener(null).cancel();
            if (this.f43507y5.getVisibility() != 0) {
                this.f43507y5.setVisibility(0);
            }
            org.telegram.messenger.m10.o(this.f43507y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.kr.h, 400L);
        } else if (!z15 && this.f43507y5.getTag() != null) {
            this.f43507y5.animate().setListener(null).cancel();
            org.telegram.messenger.m10.o(this.f43507y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new on(this.f43507y5)), org.telegram.ui.Components.kr.h, 400L);
        }
        iq0 iq0Var8 = this.f43507y5;
        if (!z15) {
            num3 = null;
        }
        iq0Var8.setTag(num3);
    }

    public final ClippingImageView[] a1(wq0 wq0Var) {
        int i7;
        if (!org.telegram.messenger.g0.Q1() && wq0Var != null && wq0Var.f53736m != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i7 + 1];
        clippingImageViewArr[0] = this.f43360i0;
        if (i7 != 0) {
            ClippingImageView clippingImageView = wq0Var.f53736m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(wq0Var.f53737n);
        }
        return clippingImageViewArr;
    }

    public final void a2() {
        Activity activity;
        if (!org.telegram.messenger.g0.H1(this.E)) {
            if (!org.telegram.messenger.g0.E && (Build.VERSION.SDK_INT < 24 || (activity = this.E) == null || !activity.isInMultiWindowMode())) {
                if (this.G2 != null) {
                    if (!this.P3) {
                        return;
                    }
                } else {
                    dq0 dq0Var = this.f43343g0;
                    if (dq0Var == null || !dq0Var.f36730y || !dq0Var.H) {
                        return;
                    }
                }
                h2();
                return;
            }
            org.telegram.messenger.a8.b("PhotoViewer: onStop in multi-window mode, keep playing");
        }
    }

    public final void a3(boolean z10) {
        Integer num;
        float f10;
        float f11;
        dq0 dq0Var;
        if (!z10 || this.f43450s3.getTag() == null) {
            if (!z10 && this.f43450s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f43450s3.f38407s && ((dq0Var = this.f43343g0) == null || !dq0Var.f36730y || dq0Var.f36728w.isEmpty())) {
                this.f43466u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f43458t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jp0 jp0Var = this.f43450s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            jp0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43458t3 = animatorSet2;
            jp0 jp0Var2 = this.f43450s3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jp0Var2, property, f10);
            jp0 jp0Var3 = this.f43450s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jp0Var3, property2, f11);
            jp0 jp0Var4 = this.f43450s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jp0Var4, property3, f13);
            jp0 jp0Var5 = this.f43450s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(jp0Var5, property4, f12));
            this.f43458t3.setDuration(380L);
            this.f43458t3.setInterpolator(org.telegram.ui.Components.kr.h);
            this.f43458t3.addListener(new gp0(this, 1));
            this.f43458t3.start();
        }
    }

    public final org.telegram.ui.Components.yc b1() {
        uq0 uq0Var = this.d;
        if (uq0Var != null && uq0Var.A()) {
            return this.W1;
        }
        return this.V1;
    }

    public final void b2(ArrayList arrayList, int i7, long j3, long j10, long j11, uq0 uq0Var) {
        e2((org.telegram.messenger.fj) arrayList.get(i7), null, null, null, arrayList, null, null, i7, uq0Var, null, j3, j10, j11, true, null, null);
    }

    public final void b3(boolean z10, boolean z11) {
        int i7;
        Integer num = null;
        if (!z11) {
            this.X7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.X7;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            this.Y7.setTranslationY(0.0f);
            this.X7.setAlpha(this.Q0.getAlpha());
        } else if (z10 && this.X7.getTag() == null) {
            if (this.X7.getVisibility() != 0) {
                this.X7.setVisibility(0);
                this.X7.setAlpha(this.Q0.getAlpha());
                this.Y7.setTranslationY(org.telegram.messenger.g0.L(58.0f));
            }
            ObjectAnimator objectAnimator = this.G7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.G7.cancel();
            }
            wo0 wo0Var = this.Y7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wo0Var, View.TRANSLATION_Y, wo0Var.getTranslationY(), 0.0f);
            this.G7 = ofFloat;
            ofFloat.setDuration(220L);
            this.G7.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            this.G7.start();
        } else if (!z10 && this.X7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.G7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.G7.cancel();
            }
            wo0 wo0Var2 = this.Y7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wo0Var2, View.TRANSLATION_Y, wo0Var2.getTranslationY(), org.telegram.messenger.g0.L(58.0f));
            this.G7 = ofFloat2;
            ofFloat2.addListener(new on(this.X7));
            this.G7.setDuration(220L);
            this.G7.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            this.G7.start();
        }
        FrameLayout frameLayout2 = this.X7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.X7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * i5.c.d(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.X7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    public final void c0(float f10, float f11, float f12, boolean z10) {
        if (this.f43287a6 == f10 && this.X5 == f11 && this.Y5 == f12) {
            return;
        }
        this.R6 = z10;
        this.f43329e6 = f10;
        this.f43309c6 = f11;
        this.f43318d6 = f12;
        this.f43407n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43424p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f));
        this.f43424p6.setInterpolator(this.t6);
        this.f43424p6.setDuration(250);
        this.f43424p6.addListener(new gp0(this, 7));
        this.f43424p6.start();
    }

    public final Bitmap.CompressFormat c1() {
        if (this.d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void c2(ArrayList arrayList, int i7, uq0 uq0Var) {
        e2(null, null, null, null, null, arrayList, null, i7, uq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void c3() {
        org.telegram.ui.Components.h61 h61Var;
        if (this.f43448s1 && (h61Var = this.G2) != null && !h61Var.d0() && !O1()) {
            if (!this.f43436r || this.d2 == 1) {
                this.G2.B0(0.0f);
            }
            this.H2 = false;
            p3();
        }
    }

    public final CharSequence d0() {
        int i7;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (Q1() && this.d != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43350g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = b1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f43479v7 && !TextUtils.equals(this.f43489w7, text) && this.d.S(this.P4) != 0 && this.d.H() > 0) {
                    this.f43479v7 = false;
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.U);
                bn bnVar = this.f43388l4;
                if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList Y = d02.Y(charSequenceArr, z10, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f43489w7 = charSequence;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    efVar.f27962a = charSequence;
                    efVar.f27973n = Y;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    hfVar.I = charSequence;
                    hfVar.f27973n = Y;
                }
                if (text.length() != 0 && !this.d.x(this.P4)) {
                    L2();
                }
                uq0 uq0Var = this.d;
                if (uq0Var != null) {
                    uq0Var.e(text);
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
        if (!z10 && !(z11 = this.f43446s)) {
            measuredHeight = (org.telegram.messenger.g0.f24221n - this.f43457t2.bottom) + org.telegram.messenger.g0.f24226q.y;
            if ((i7 == 0 || i7 == 4 || i7 == 5) && this.d2 != 1 && !z11) {
                measuredHeight += org.telegram.messenger.g0.f24220m;
            }
        } else {
            measuredHeight = this.f43334f0.getMeasuredHeight();
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

    public final void d2(TLRPC.FileLocation fileLocation, org.telegram.messenger.fc fcVar, oq0 oq0Var) {
        e2(null, fileLocation, fcVar, null, null, null, null, 0, oq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void d3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d3(int):void");
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(Canvas canvas, int i7, int i10, int i11, int i12, float f10, og.g gVar, org.telegram.messenger.we weVar) {
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
        int i17 = gVar.f21950i;
        if (i17 != 90 && i17 != 270) {
            i16 = i15;
            i15 = i16;
        }
        int i18 = this.d2;
        if (i18 != 1 && (this.f43467u4 == 3 || this.f43415o6 == 3)) {
            f12 = 1.0f;
            f11 = f18;
        } else if (this.f43424p6 != null && (i13 = this.f43415o6) != -1) {
            int i19 = this.f43467u4;
            f11 = f18;
            if (i19 != 1 && i13 != 1 && ((i19 != 2 && i19 != 3) || i13 != -1)) {
                if (i13 == 0) {
                    f12 = this.f43390l6;
                } else {
                    f12 = 1.0f - this.f43390l6;
                }
            }
            f12 = 1.0f;
        } else {
            f11 = f18;
            int i20 = this.f43467u4;
            if (i20 == 2 || i20 == 3) {
                f12 = 0.0f;
            }
            f12 = 1.0f;
        }
        float f23 = gVar.f21951j;
        float f24 = gVar.f21952k;
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
        if (i18 != 1 && ((this.f43467u4 != 1 || this.f43415o6 == 0) && weVar != null)) {
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
        if (i22 == 1 || gVar.f21944a) {
            int i23 = this.f43467u4;
            if (i23 != 1 && i22 != 1) {
                if (weVar != null) {
                    f15 = weVar.f27770c;
                    f16 = 1.0f;
                } else {
                    f15 = 1.0f;
                    f16 = 1.0f;
                }
                f13 = ((f29 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, f26, f16)) * f15;
            } else {
                float z12 = gVar.f21948f / com.google.android.gms.internal.vision.e2.z(gVar.f21953l, 1.0f, f26, 1.0f);
                float f33 = f17 / f25;
                if (f33 * f27 > f20) {
                    f33 = f20 / f27;
                }
                float f34 = (f33 / min) * z12;
                if (i22 == 1) {
                    if (i23 != 3 && (i14 = this.f43415o6) != 3) {
                        if (i14 == 0) {
                            f14 = gVar.f21954m;
                        }
                    } else {
                        f14 = ((gVar.f21954m - 1.0f) * f26) + 1.0f;
                    }
                    f34 /= f14;
                }
                f13 = f34;
            }
            float f35 = f13;
            canvas.translate(gVar.d * f12, gVar.f21947e * f12);
            canvas.scale(f35, f35);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21945b, f25, min, f12), com.google.android.gms.internal.vision.e2.D(gVar.f21946c, f27, min, f12));
            float f36 = gVar.f21949g + i17;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            if (this.d2 == 1 && (this.f43467u4 == 3 || this.f43415o6 == 3)) {
                canvas.rotate(f36);
            } else {
                canvas.rotate(f36 * f12);
            }
        }
        int[] iArr = this.T7;
        iArr[0] = B;
        iArr[1] = i21;
    }

    public final int e1() {
        return d1(this.f43467u4, false);
    }

    public final boolean e2(org.telegram.messenger.fj r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.fc r19, org.telegram.messenger.fc r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.uq0 r25, org.telegram.ui.bn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.rq0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e2(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.fc, org.telegram.messenger.fc, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.uq0, org.telegram.ui.bn, long, long, long, boolean, org.telegram.ui.rq0, java.lang.Integer):boolean");
    }

    public final void e3(int i7, boolean z10) {
        if (this.T4 != null) {
            n2(false);
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        } else if (this.f43365i5 != null) {
            TLObject d = this.f43374j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                n2(false);
                org.telegram.messenger.w7.G(this.U).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.w20 w20Var = this.f43393m1;
        if (w20Var != null) {
            w20Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        B2(this.P4 + i7, z10, true, false);
        if (Q2(this.T4) || P2(this.P4)) {
            this.Y2 = true;
            T1(true);
            u0(0, true);
        }
        s0();
        try {
            d1.f.b(0);
            if (wf.b.I().M()) {
                wf.b.I().Q(i1());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f0():void");
    }

    public final int f1() {
        return g1(this.f43467u4);
    }

    public final boolean f2(org.telegram.messenger.fj fjVar, bn bnVar, long j3, long j10, long j11, oq0 oq0Var) {
        return e2(fjVar, null, null, null, null, null, null, 0, oq0Var, bnVar, j3, j10, j11, true, null, null);
    }

    public final void f3() {
        float f10;
        boolean z10;
        int i7;
        vp0 vp0Var;
        int i10;
        vp0 vp0Var2;
        this.f43433q6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.f43410o0.setVisibility(8);
        this.f43335f1.setVisibility(8);
        this.f43344g1.setVisibility(8);
        this.f43353h1.setVisibility(8);
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null) {
            qd0Var.setVisibility(4);
        }
        this.f43419p1.setVisibility(8);
        this.f43419p1.setAlpha(0.0f);
        this.f43419p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.f43419p1.setEnabled(false);
        this.L = false;
        if (this.f43370j2) {
            this.R1.setVisibility(4);
        }
        int i11 = this.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.f43350g7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            r3();
        }
        V2(false, true);
        Z2(false, true);
        Bitmap n10 = this.C4.n();
        float f11 = this.f43287a6;
        if (this.d2 == 11) {
            this.f43366i6 = this.Y5;
            this.f43358h6 = this.X5;
            this.f43373j6 = f11;
            this.f43382k6 = this.f43298b6;
            this.f43340f6 = 0.0f;
        }
        nq0 nq0Var = this.X4;
        if (n10 != null) {
            int q10 = this.C4.q();
            int o4 = this.C4.o();
            if (this.d2 == 1) {
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f43318d6 = L;
                f10 = 0.0f;
                if (this.M1 != null) {
                    this.f43318d6 = (vp0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i12 = this.E1.f21950i;
                if (i12 == 90 || i12 == 270) {
                    i10 = q10;
                    q10 = o4;
                    float f12 = q10;
                    float f13 = i10;
                    this.f43329e6 = q2(false) * (Math.min(g1(3) / f12, d1(3, false) / f13) / Math.min(g1(this.f43467u4) / f12, e1() / f13));
                    Rect rect = this.f43457t2;
                    this.f43309c6 = (rect.left / 2) - (rect.right / 2);
                    this.f43407n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f122 = q10;
                float f132 = i10;
                this.f43329e6 = q2(false) * (Math.min(g1(3) / f122, d1(3, false) / f132) / Math.min(g1(this.f43467u4) / f122, e1() / f132));
                Rect rect2 = this.f43457t2;
                this.f43309c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f43407n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -org.telegram.messenger.g0.L(44.0f);
                if (!this.f43446s) {
                    i7 = org.telegram.messenger.g0.f24220m / 2;
                } else {
                    i7 = 0;
                }
                float f14 = i13 + i7;
                this.f43318d6 = f14;
                if (this.M1 != null) {
                    float additionalTop = (vp0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f43318d6 = additionalTop;
                    this.f43318d6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.we weVar = nq0Var.f50393c;
                if (weVar != null) {
                    int i14 = weVar.f27775k;
                    if (i14 == 90 || i14 == 270) {
                        o4 = q10;
                        q10 = o4;
                    }
                    q10 = (int) (q10 * weVar.f27771e);
                    i10 = (int) (o4 * weVar.f27772f);
                    float f1222 = q10;
                    float f1322 = i10;
                    this.f43329e6 = q2(false) * (Math.min(g1(3) / f1222, d1(3, false) / f1322) / Math.min(g1(this.f43467u4) / f1222, e1() / f1322));
                    Rect rect22 = this.f43457t2;
                    this.f43309c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f43407n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f12222 = q10;
                float f13222 = i10;
                this.f43329e6 = q2(false) * (Math.min(g1(3) / f12222, d1(3, false) / f13222) / Math.min(g1(this.f43467u4) / f12222, e1() / f13222));
                Rect rect222 = this.f43457t2;
                this.f43309c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f43407n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        vp0 vp0Var3 = this.M1;
        if (vp0Var3 != null) {
            if (this.d2 == 11 && (nq0Var == null || nq0Var.f50393c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            vp0Var3.setDrawShadow(z10);
        }
        this.f43352h0.setClipChildren(true);
        this.f43376k0.setVisibility(4);
        this.f43424p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.g0.L(12.0f), f10);
        ofFloat.addUpdateListener(new en0(this, 7));
        ofFloat2.addUpdateListener(new en0(this, 8));
        this.f43424p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.p0(true);
        this.f43424p6.setDuration(200L);
        this.f43424p6.addListener(new gp0(this, 3));
        this.f43424p6.start();
    }

    public final void g0(android.graphics.Bitmap r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g0(android.graphics.Bitmap):void");
    }

    public final int g1(int i7) {
        int L;
        int width = this.f43334f0.getWidth();
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

    public final void g2(ArrayList arrayList, int i7, int i10, boolean z10, uq0 uq0Var, bn bnVar) {
        boolean z11;
        org.telegram.ui.Components.n6 n6Var;
        this.f43362i2 = z10;
        oi.w1 w1Var = this.T0;
        int i11 = 0;
        if (w1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
            if (i10 != 4 && i10 != 5) {
                if (i10 != 13 && i10 != 14 && i10 != 1 && i10 != 3 && i10 != 10 && i10 != 11) {
                    this.T0.setResourceId(2131232699);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                } else {
                    this.T0.setResourceId(2131231198);
                    this.T0.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                }
            } else {
                this.T0.setResourceId(2131232699);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i10 != 11 && this.f43423p5 != null) {
            this.B7 = false;
            ImageView imageView = this.f43314d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            iq0 iq0Var = this.f43507y5;
            if (iq0Var != null) {
                iq0Var.m(false, false);
            }
            this.f43423p5.b();
            ArrayList arrayList2 = this.f43442r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f43322e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z12 && this.d2 != i10 && i10 == 1) {
            this.d2 = i10;
            this.f43474v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = uq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43428q1.f();
            this.f43374j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43322e = true;
            this.f43333f = true;
            o3(false, false);
            this.f43394m2 = false;
            B0();
            i3(false, false);
            this.f43326e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f43334f0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i7, null);
            C1();
            y2();
        } else if (z12 && this.d2 != i10 && i10 == 11) {
            this.d2 = i10;
            this.f43474v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = uq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43428q1.f();
            this.f43374j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43322e = true;
            this.f43333f = true;
            o3(false, false);
            this.f43326e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            R1();
            backgroundDrawable.setAlpha(255);
            this.f43334f0.setAlpha(1.0f);
            Y1(null, null, null, null, null, null, arrayList, i7, null);
        } else {
            this.d2 = i10;
            if (i10 == 12) {
                this.d2 = 0;
                this.f43325e2 = true;
            }
            int i12 = this.d2;
            if (i12 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43345g2 = z11;
            if (i12 == 13 || z11) {
                this.d2 = 0;
                this.f43336f2 = true;
            }
            this.f43280a.a(z11, false);
            if (this.d2 == 11) {
                this.f43376k0.setBackgroundColor(-16777216);
            }
            tq0 tq0Var = this.N;
            if (tq0Var != null && (n6Var = tq0Var.d) != null) {
                if (this.f43336f2) {
                    i11 = 8;
                }
                n6Var.setVisibility(i11);
            }
            e2(null, null, null, null, null, null, arrayList, i7, uq0Var, bnVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void g3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g3():void");
    }

    public float getAnimationValue() {
        return this.f43390l6;
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
        org.telegram.messenger.we weVar;
        if (this.f43424p6 != null) {
            f14 = org.telegram.messenger.g0.T1(0.0f, this.f43349g6, this.f43390l6);
            f10 = org.telegram.messenger.g0.T1(this.f43287a6, this.f43329e6, this.f43390l6);
            f11 = org.telegram.messenger.g0.T1(this.f43298b6, this.f43340f6, this.f43390l6);
            f12 = org.telegram.messenger.g0.T1(this.Y5, this.f43318d6, this.f43390l6);
            f13 = org.telegram.messenger.g0.T1(this.X5, this.f43309c6, this.f43390l6);
        } else {
            f10 = this.f43287a6;
            f11 = this.f43298b6;
            f12 = this.Y5;
            f13 = this.X5;
            if (this.f43407n6 != 0) {
                f13 = this.f43309c6;
                f12 = this.f43318d6;
                f10 = this.f43329e6;
            }
            f14 = 0.0f;
        }
        int g12 = g1(this.f43467u4);
        int e12 = e1();
        canvas.translate(X0(this.f43467u4), Y0(this.f43467u4));
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
        int i7 = gVar.f21950i;
        if (i7 != 90 && i7 != 270) {
            o4 = q10;
            q10 = o4;
        }
        float f25 = gVar.f21951j;
        float f26 = gVar.f21952k;
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
        nq0 nq0Var = this.X4;
        if (i10 != 1 && ((this.f43467u4 != 1 || this.f43415o6 == 0) && nq0Var.f50393c != null)) {
            float f34 = f30 * f33;
            float f35 = f32 * f33;
            if (f21 * f23 > f22) {
                f21 = f24;
            }
            float z10 = com.google.android.gms.internal.vision.e2.z((f20 * f21) / f29, f34, 0.0f, f34);
            float z11 = com.google.android.gms.internal.vision.e2.z((f23 * f21) / f29, f35, 0.0f, f35);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.d2 == 1 || gVar.f21944a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.messenger.we weVar2 = nq0Var.f50393c;
                if (weVar2 != null && weVar2.f27776l) {
                    f17 = -1.0f;
                } else {
                    f17 = 1.0f;
                }
                textureView.setScaleX(f17);
                pq0 pq0Var = this.F2;
                if (pq0Var != null) {
                    pq0Var.setScaleX(this.C2.getScaleX());
                }
            }
            org.telegram.messenger.we weVar3 = nq0Var.f50393c;
            if (weVar3 != null) {
                f15 = weVar3.f27770c;
                f16 = 1.0f;
            } else {
                f15 = 1.0f;
                f16 = 1.0f;
            }
            float z12 = ((f33 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, 0.0f, f16)) * f15;
            canvas.translate(gVar.d * f16, gVar.f21947e * f16);
            canvas.scale(z12, z12);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21945b, f27, min, f16), com.google.android.gms.internal.vision.e2.D(gVar.f21946c, f28, min, f16));
            float f36 = gVar.f21949g + i7;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            canvas.rotate(f36);
        }
        if (!this.f43350g7.isEmpty() && (weVar = nq0Var.f50393c) != null && weVar.f27776l) {
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
        if (!this.f43446s) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - i7) - (org.telegram.messenger.g0.L(16.0f) * 2);
        return Math.max(min / q10, min / o4);
    }

    public final void h2() {
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            h61Var.g0();
            return;
        }
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null) {
            dq0Var.f();
        }
    }

    public final void h3() {
        AtomicInteger atomicInteger;
        long a10;
        boolean m10;
        f6.q e10;
        f6.q e11;
        float f10;
        int i7;
        f6.q e12;
        boolean z10;
        if (!Q1()) {
            return;
        }
        this.U8 = true;
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            if (!d1.f.u() && !this.f43436r) {
                z10 = false;
            } else {
                z10 = true;
            }
            h61Var.t0(z10);
        }
        if (this.G2 != null && d1.f.u() && ((atomicInteger = d1.f.f7609b) == null || atomicInteger.get() <= 0)) {
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
            } else if (d1.f.f7608a == 0) {
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
                    f10 = (float) e11.f11440r;
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
                        f11 = (float) e12.f11440r;
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
        xq xqVar = this.f43492x0;
        if (xqVar != null) {
            xqVar.a(d1.f.u());
        }
        this.U8 = false;
    }

    public final Size i0() {
        float f10;
        int i7;
        int round;
        int i10;
        if (this.f43342f8 == 1) {
            return new Size(this.f43367i8, this.f43375j8);
        }
        int i11 = this.f43331e8;
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
        if (this.f43367i8 > this.f43375j8) {
            i7 = this.f43367i8;
        } else {
            i7 = this.f43375j8;
        }
        float f11 = f10 / i7;
        if (this.f43331e8 == this.f43342f8 - 1 && f11 >= 1.0f) {
            i10 = this.f43367i8;
            round = this.f43375j8;
        } else {
            int round2 = Math.round((this.f43367i8 * f11) / 2.0f) * 2;
            round = Math.round((this.f43375j8 * f11) / 2.0f) * 2;
            i10 = round2;
        }
        int i12 = i10 % 4;
        if (i12 != 0 || round % 4 != 0) {
            i10 = (i10 - i12) - (round % 4);
        }
        return new Size(i10, round);
    }

    public final wf.f i1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i1():wf.f");
    }

    public final void i2() {
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            h61Var.h0();
            return;
        }
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null) {
            dq0Var.g();
        }
    }

    public final void i3(boolean z10, boolean z11) {
        j3(z10, z11, gq0.f48341e);
    }

    public final boolean j0(MotionEvent motionEvent) {
        boolean z10;
        dq0 dq0Var;
        if (this.G2 != null || ((dq0Var = this.f43343g0) != null && dq0Var.f36730y)) {
            if (motionEvent.getX() >= (g1(this.f43467u4) / 3) * 2) {
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

    public final org.telegram.messenger.d20 j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j1():org.telegram.messenger.d20");
    }

    public final void j3(boolean r17, boolean r18, org.telegram.ui.gq0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j3(boolean, boolean, org.telegram.ui.gq0):void");
    }

    public final boolean k0() {
        bn bnVar = this.f43388l4;
        if (bnVar != null) {
            if (bnVar.f46187f == null) {
                TLRPC.Chat chat = bnVar.f46173e;
                if (chat != null && !org.telegram.messenger.v3.r0(chat)) {
                    if (org.telegram.messenger.v3.p(this.f43388l4.f46173e) || org.telegram.messenger.v3.u(this.f43388l4.f46173e)) {
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
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null && dq0Var.f36730y) {
            return dq0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var == null) {
            return 0L;
        }
        return h61Var.S();
    }

    public final void k2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.ff r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.ff, boolean, long):void");
    }

    public final void k3(boolean z10) {
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
        tg.i2 i2Var = this.f43423p5;
        if (i2Var != null) {
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(i2Var, property, f17));
        }
        if (this.f43423p5 != null) {
            fi.u2 u2Var = this.s5;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u2Var, property, f16));
        }
        oi.w1 w1Var = this.T0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var, property, f12));
        oi.w1 w1Var2 = this.T0;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(w1Var2, property2, f13));
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
            hi.h hVar = this.V1.f14936f;
            if (hVar.f41722e) {
                hVar.k(true);
            }
            hi.h hVar2 = this.W1.f14936f;
            if (hVar2.f41722e) {
                hVar2.k(true);
            }
            this.V1.f14936f.d();
            this.W1.f14936f.d();
        }
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
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null && (animatorSet = qd0Var.f38817s) != null) {
            animatorSet.cancel();
            qd0Var.f38817s = null;
            qd0Var.f38814f = false;
        }
    }

    public final TLObject l1(int i7, long[] jArr) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.f43330e7;
        if (!arrayList.isEmpty()) {
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.yv) arrayList.get(i7)).f28288b.size;
            }
            return (TLObject) arrayList.get(i7);
        }
        ArrayList arrayList2 = this.f43288a7;
        if (!arrayList2.isEmpty()) {
            if (i7 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f43310c7;
                if (arrayList3.get(i7) != null) {
                    jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                }
            }
            ArrayList arrayList4 = this.f43299b7;
            if (arrayList4.get(i7) == null) {
                return null;
            }
            return ((org.telegram.messenger.fc) arrayList4.get(i7)).f23976f;
        }
        ArrayList arrayList5 = this.Y6;
        if (arrayList5.isEmpty() || i7 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList5.get(i7);
        TLRPC.Message message = fjVar.f24073k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = fjVar.f24029a1;
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
            } else if (((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.fj.n1(fjVar.f24073k).photo != null) || ((org.telegram.messenger.fj.n1(fjVar.f24073k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar.f24073k).webpage != null)) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(true), false, null, true);
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
            } else if (org.telegram.messenger.fj.n1(fjVar.f24073k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(fjVar.f24073k)).photo;
            } else {
                if (fjVar.F0() != null && org.telegram.messenger.fj.W2(fjVar.F0())) {
                    TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(fjVar.F0().thumbs, 90, false, null, false);
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

    public final void l2() {
        tg.i2 i2Var = this.f43423p5;
        if (i2Var != null && this.d2 == 11) {
            if (this.B7) {
                i2Var.b();
            } else {
                i2Var.m(this.C4.n(), this.C4.V, g1(this.f43467u4), e1(), new pn0(this, 0));
            }
        }
    }

    public final void l3(boolean z10, boolean z11) {
        float f10;
        kn0 kn0Var = this.f43501y;
        org.telegram.messenger.g0.r(kn0Var);
        int i7 = 0;
        if (z11) {
            m3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f43491x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f43491x = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    m3(true);
                    return;
                }
                org.telegram.messenger.g0.h3(kn0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f43491x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                m3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f43491x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f43491x = null;
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

    public final void m0() {
        if (this.d2 == 11) {
            iq0 iq0Var = this.f43460t5;
            if (iq0Var.f58293o0 == 2) {
                iq0Var.setCutOutState(true);
                W2(true, true);
                this.f43423p5.f();
                this.f43334f0.invalidate();
            }
        }
    }

    public final void m2(String str, long j3, boolean z10, float f10, float f11, int i7, long j10) {
        boolean z11;
        int parseInt;
        if (this.D8 != null) {
            Utilities.f22877e.a(this.D8);
            this.D8 = null;
        }
        wo0 wo0Var = this.Y7;
        wo0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        wo0Var.E = mediaMetadataRetriever;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        wo0Var.f39834x = z11;
        wo0Var.d = f10;
        wo0Var.f39826e = f11;
        float f12 = wo0Var.f39832s;
        if (f12 < f10) {
            wo0Var.f39832s = f10;
        } else if (f12 > f11) {
            wo0Var.f39832s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                wo0Var.f39835y = open;
                wo0Var.E.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = wo0Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                wo0Var.f39819a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = wo0Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                wo0Var.f39821b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = wo0Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                wo0Var.f39823c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = wo0Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = wo0Var.f39821b;
                wo0Var.f39821b = wo0Var.f39823c;
                wo0Var.f39823c = i11;
            }
            if (wo0Var.f39834x) {
                wo0Var.f39828f = (float) ((j10 / 1000.0d) / wo0Var.f39819a);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        wo0Var.invalidate();
        this.E8 = null;
        if (!z10 && this.d2 != 1) {
            z12 = false;
        }
        this.f43436r = z12;
        this.f43342f8 = -1;
        this.f43359h8 = 0;
        this.f43426p8 = 25;
        this.A8 = new File(str).length();
        org.telegram.messenger.q5 q5Var = Utilities.f22877e;
        eq0 eq0Var = new eq0(this, str, j3, i7);
        this.D8 = eq0Var;
        q5Var.c(eq0Var);
    }

    public final void m3(boolean z10) {
        float f10;
        if (z10) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43491x = animatorSet;
        yc ycVar = this.Y0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, property, f10));
        this.f43491x.setDuration(200L);
        this.f43491x.addListener(new op0(this, z10, 1));
        this.f43491x.start();
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
            ArrayList arrayList = this.f43330e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) arrayList.get(i7);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(yvVar.f28288b.dc_id);
                    sb2.append("_");
                    return a8.p0.r(sb2, yvVar.f28288b.f28629id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.f43288a7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Y6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f43350g7;
                    if (!arrayList4.isEmpty()) {
                        if (i7 < arrayList4.size()) {
                            Object obj = arrayList4.get(i7);
                            if (obj instanceof org.telegram.messenger.hf) {
                                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                                TLRPC.PhotoSize photoSize = hfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.w7.r(null, photoSize);
                                }
                                TLRPC.Document document = hfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.w7.r(null, document);
                                }
                                return Utilities.a(hfVar.C) + "." + org.telegram.messenger.ec.B(hfVar.C, "jpg");
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
                                    sb3.append(org.telegram.messenger.ec.B(webDocument2.url, org.telegram.messenger.w7.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        rq0 rq0Var = this.f43374j7;
                        if (rq0Var != null) {
                            return rq0Var.c(i7);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) arrayList2.get(i7);
                        org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) this.f43299b7.get(i7);
                        if (fcVar != null) {
                            if (fcVar2 != null && fcVar2 != fcVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(fcVar2.f23976f.volume_id);
                                sb4.append("_");
                                return a8.p0.n(fcVar2.f23976f.local_id, ".mp4", sb4);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(fcVar.f23976f.volume_id);
                            sb5.append("_");
                            return a8.p0.n(fcVar.f23976f.local_id, ".jpg", sb5);
                        }
                    }
                } else if (i7 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.fj) arrayList3.get(i7)).f24073k;
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
                        } else if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.w7.r(null, org.telegram.messenger.fj.n1(message).document);
                        } else {
                            if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.fj.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w11 = org.telegram.messenger.w7.w(arrayList6, org.telegram.messenger.g0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.w7.r(null, w11);
                                }
                                return "";
                            } else if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.fj.n1(message).webpage.document != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.fj.n1(message).webpage.document);
                                }
                                if (org.telegram.messenger.fj.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.fj.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w10 = org.telegram.messenger.w7.w(arrayList7, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.w7.r(null, w10);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.ec.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type));
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

    public final void n2(boolean z10) {
        this.f43399m7 = null;
        org.telegram.messenger.g0.r(this.f43416o7);
        org.telegram.ui.Components.j61 j61Var = this.f43391l7;
        if (j61Var != null) {
            j61Var.a(this.U, null);
        }
        int i7 = 0;
        this.E2 = false;
        wi.n nVar = this.V8;
        if (nVar != null && nVar.f60117c == 0) {
            this.V8 = null;
            nVar.f();
        }
        org.telegram.ui.Components.h61 h61Var = this.G2;
        HashMap hashMap = f43274h9;
        yo0 yo0Var = this.f43504y2;
        if (h61Var != null) {
            n0();
            org.telegram.messenger.g0.r(this.f43494x2);
            org.telegram.messenger.g0.r(yo0Var);
            if (this.f43306c3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.f43306c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new zq0(S));
                org.telegram.messenger.fj fjVar = this.T4;
                if (fjVar != null) {
                    fjVar.f24081l3 = Float.valueOf(S);
                }
            }
            this.G2.m0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.f43343g0 != null) {
            org.telegram.messenger.g0.r(yo0Var);
            if (this.f43306c3 != null) {
                float k12 = ((float) k1()) / ((float) x1());
                String str2 = this.f43306c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new zq0(k12));
                org.telegram.messenger.fj fjVar2 = this.T4;
                if (fjVar2 != null) {
                    fjVar2.f24081l3 = Float.valueOf(k12);
                }
            }
        }
        org.telegram.ui.Components.au auVar = this.W3;
        if (auVar != null) {
            auVar.disable();
            this.W3 = null;
        }
        this.f43450s3.a();
        l3(false, false);
        this.f43449s2 = false;
        this.U2 = false;
        if (this.f43482w0.isEnabled()) {
            this.f43482w0.setEnabled(false);
            this.f43482w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f43355h3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.f43355h3 = false;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.te0 te0Var = this.f43513z2;
        if (te0Var != null) {
            try {
                this.f43334f0.removeView(te0Var);
            } catch (Throwable unused) {
            }
            this.f43513z2 = null;
        }
        l0();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.x51) {
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) textureView;
                org.telegram.ui.Components.bz bzVar = x51Var.f41850b;
                if (bzVar != null) {
                    bzVar.postRunnable(new org.telegram.ui.Components.yy(bzVar, 0));
                }
                x51Var.f41849a = null;
            }
            this.C2 = null;
        }
        this.f43303c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            org.telegram.messenger.g0.r(this.f43356h4);
        }
        if (!z10 && !this.H8 && !this.I8) {
            O2(false, true);
        }
        vo0 vo0Var = this.X0[0];
        while (true) {
            float[] fArr = vo0Var.f53006n;
            if (i7 < fArr.length) {
                vo0Var.f53005m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                vo0Var.a();
                return;
            }
        }
    }

    public final void n3(boolean z10) {
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

    public final void o0() {
        float f10;
        org.telegram.ui.ActionBar.y yVar = this.B0;
        if (yVar != null) {
            if (this.f43345g2) {
                f10 = -org.telegram.messenger.g0.L(4.0f);
            } else {
                f10 = 0.0f;
            }
            yVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.F0;
        if (q0Var != null) {
            H2(q0Var, this.f43345g2, false);
        }
        boolean z10 = this.f43336f2;
        if (z10 && this.J == null) {
            fh.g c10 = this.Z.c(this.H, null, false);
            c10.p(c8.j0.j(this.f43484w2));
            c10.r(org.telegram.messenger.g0.L(20.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            int L = org.telegram.messenger.g0.L(54.0f);
            int L2 = org.telegram.messenger.g0.L(54.0f);
            Matrix matrix = ih.d.f16345a;
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

    public final org.telegram.messenger.fc o1(int i7, long[] jArr) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f43330e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.yv) arrayList.get(i7)).f28288b.size;
                    }
                    org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) arrayList.get(i7);
                    if (yvVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = yvVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.f43288a7;
                if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f43310c7;
                            if (arrayList3.get(i7) != null) {
                                jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                            }
                        }
                        return (org.telegram.messenger.fc) this.f43299b7.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.Y6;
                    if (!arrayList4.isEmpty() && i7 < arrayList4.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i7);
                        TLRPC.Message message = fjVar.f24073k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    if (jArr != null) {
                                        long j3 = w10.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.fc.f(w10, fjVar.f24086n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = fjVar.f24029a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.fc.b(document);
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
                                        return org.telegram.messenger.fc.f(w11, fjVar.f24029a1.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.fj.n1(fjVar.f24073k).photo != null) || ((org.telegram.messenger.fj.n1(fjVar.f24073k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar.f24073k).webpage != null)) {
                                if (org.telegram.messenger.fj.t3(fjVar.f24073k)) {
                                    return org.telegram.messenger.fc.b(fjVar.F0());
                                }
                                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(true), false, null, true);
                                if (w12 != null) {
                                    if (jArr != null) {
                                        long j11 = w12.size;
                                        jArr[0] = j11;
                                        if (j11 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.fc.f(w12, fjVar.f24086n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.fj.n1(fjVar.f24073k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(fjVar.f24073k)).webPhoto));
                            } else {
                                if (fjVar.F0() != null) {
                                    TLRPC.Document F0 = fjVar.F0();
                                    if (this.C5 == 5) {
                                        return org.telegram.messenger.fc.b(F0);
                                    }
                                    if (org.telegram.messenger.fj.W2(fjVar.F0())) {
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j12 = w13.size;
                                            jArr[0] = j12;
                                            if (j12 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.fc.c(w13, F0);
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

    public final void o2(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.E8 != null) {
            MediaController.B().i(this.E8);
        }
        if (this.I8 && !this.F8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I8 = false;
        this.G8 = false;
        this.W7.setVisibility(4);
        if (i7 == 1) {
            if (this.f43392l8 == this.f43375j8 && this.f43384k8 == this.f43367i8) {
                this.F8 = false;
                vo0 vo0Var = this.X0[0];
                if (vo0Var.h != 0 && vo0Var.f53003k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                vo0Var.f(z12, 0.0f);
                this.X0[0].d(3, false, true);
                if (!z10) {
                    k2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.G2.p0(this.Y7.getLeftProgress() * this.f43417o8);
                } else {
                    this.G8 = true;
                }
            } else {
                n2(false);
                if (this.E8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28513id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, false);
                    this.E8 = fjVar;
                    fjVar.f24073k.attachPath = new File(org.telegram.messenger.w7.z(4), "video_preview.mp4").getAbsolutePath();
                    this.E8.f24101r0 = new org.telegram.messenger.d20();
                    org.telegram.messenger.d20 d20Var = this.E8.f24101r0;
                    d20Var.f23594g = this.f43359h8;
                    d20Var.h = this.f43367i8;
                    this.E8.f24101r0.f23595i = this.f43375j8;
                    org.telegram.messenger.d20 d20Var2 = this.E8.f24101r0;
                    d20Var2.f23600n = this.f43426p8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        d20Var2.f23601o = uri.getPath();
                    } else {
                        d20Var2.f23601o = uri.getPath();
                    }
                }
                org.telegram.messenger.d20 d20Var3 = this.E8.f24101r0;
                long j3 = this.f43454s8;
                d20Var3.f23587a = j3;
                long j10 = this.f43462t8;
                d20Var3.f23589b = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f43417o8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    d20Var3.f23589b = j3 + 5000000;
                }
                d20Var3.f23599m = this.f43400m8;
                this.E8.f24101r0.f23597k = this.f43384k8;
                this.E8.f24101r0.f23598l = this.f43392l8;
                org.telegram.messenger.d20 d20Var4 = this.E8.f24101r0;
                d20Var4.Y = true;
                d20Var4.v = this.f43417o8 * 1000.0f;
                if (!MediaController.B().h0(this.E8, true, true, true)) {
                    this.F8 = true;
                }
                this.I8 = true;
                vo0 vo0Var2 = this.X0[0];
                if (vo0Var2.h != 0 && vo0Var2.f53003k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                vo0Var2.f(z11, 0.0f);
                this.X0[0].d(0, false, true);
            }
        } else {
            this.F8 = false;
            this.X0[0].d(3, false, true);
            if (i7 == 2) {
                k2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.G2.p0(this.Y7.getLeftProgress() * this.f43417o8);
            }
        }
        this.f43334f0.invalidate();
    }

    public final void o3(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10 != this.L) {
            if (z10) {
                this.f43419p1.setVisibility(0);
            }
            this.L = z10;
            this.f43419p1.setEnabled(z10);
            float f14 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                br0 br0Var = this.f43419p1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(br0Var, property, f12));
                br0 br0Var2 = this.f43419p1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = -org.telegram.messenger.g0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(br0Var2, property2, f13));
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
                    this.C1.addListener(new gp0(this, 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            br0 br0Var3 = this.f43419p1;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            br0Var3.setAlpha(f10);
            br0 br0Var4 = this.f43419p1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(10.0f);
            }
            br0Var4.setTranslationY(f11);
            CounterView counterView2 = this.P0;
            if (!z10) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z10) {
                this.f43419p1.setVisibility(8);
            }
        }
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.f43493x1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f43334f0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.L()) {
                        zArr[0] = true;
                        this.f43334f0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f43334f0.getMeasuredWidth() - min && this.D4.L()) {
                    zArr[1] = true;
                    this.f43334f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f43287a6 != 1.0f && this.d2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f10), Math.round(f11), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f43334f0.postInvalidate();
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
        if (this.f43405n4 != 0) {
            D1();
            if (Math.abs(this.o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f43422p4;
                if (runnable != null) {
                    runnable.run();
                    this.f43422p4 = null;
                }
                this.f43405n4 = 0;
            }
        }
        if (this.f43405n4 == 0) {
            return false;
        }
        return true;
    }

    public final float p2() {
        return q2(true);
    }

    public final void p3() {
        boolean z10;
        org.telegram.ui.Components.h61 h61Var;
        org.telegram.ui.Components.h61 h61Var2;
        dq0 dq0Var;
        org.telegram.ui.Components.h61 h61Var3 = this.G2;
        if (h61Var3 == null && ((dq0Var = this.f43343g0) == null || !dq0Var.f36730y)) {
            return;
        }
        if (h61Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f43343g0.H;
        }
        n0();
        org.telegram.messenger.g0.r(this.f43504y2);
        if (z10) {
            h2();
        } else {
            if (this.f43448s1) {
                if (Math.abs(this.Y7.getProgress() - this.Y7.getRightProgress()) < 0.01f || ((h61Var2 = this.G2) != null && h61Var2.S() == this.G2.U())) {
                    t2(this.Y7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f43430q3.c() - this.Y7.getRightProgress()) < 0.01f || ((h61Var = this.G2) != null && h61Var.S() == this.G2.U())) {
                    t2(0.0f);
                }
                r2();
            }
            i2();
        }
        this.f43334f0.invalidate();
    }

    public final void q0(boolean z10) {
        View view;
        float x10;
        float y10;
        float f10;
        float f11;
        if (z10) {
            wi.o oVar = this.f43485w3;
            if (oVar != null) {
                oVar.getViewTreeObserver().addOnPreDrawListener(new e7(this, 4));
                this.f43485w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f43495x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f43495x3.setImageDrawable(null);
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
            org.telegram.ui.Components.te0 te0Var = this.f43513z2;
            if (te0Var != null) {
                int[] iArr = this.A3;
                te0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f43334f0.getTranslationY());
                ImageView imageView2 = this.f43495x3;
                Rect rect = this.f43457t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f43513z2.getX());
                }
                pq0 pq0Var = this.F2;
                if (pq0Var != null) {
                    pq0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new en0(this, 5));
                if (this.E2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f43513z2.getX();
                }
                if (this.E2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f43513z2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f43495x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f43495x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f43495x3;
                Property property3 = View.TRANSLATION_X;
                if (this.E2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f43495x3;
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
                arrayList.add(ObjectAnimator.ofInt(this.M0, org.telegram.ui.Components.q6.d, 255));
                pq0 pq0Var2 = this.F2;
                if (pq0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(pq0Var2, property, 1.0f));
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
                animatorSet.addListener(new eo0(this, view, 0));
                animatorSet.start();
                gq0 gq0Var = new gq0();
                gq0Var.f48344c = false;
                gq0Var.d = false;
                gq0Var.f48342a = 250;
                gq0Var.f48343b = decelerateInterpolator;
                j3(true, true, gq0Var);
                this.G3 = 0;
            }
        }
    }

    public final int q1() {
        return this.f43457t2.left;
    }

    public final float q2(boolean z10) {
        int i7;
        if (this.d2 == 11) {
            int g12 = g1(this.f43467u4);
            if (g12 == 0) {
                g12 = org.telegram.messenger.g0.f24226q.x;
            }
            float i10 = org.telegram.ui.Cells.c0.i(20.0f, g12, 1) / g12;
            if (z10) {
                int q10 = this.C4.q();
                int o4 = this.C4.o();
                if ((q10 <= 1 || o4 <= 1) && (i7 = this.P4) >= 0) {
                    ArrayList arrayList = this.f43350g7;
                    if (i7 < arrayList.size()) {
                        Object obj = arrayList.get(this.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            q10 = efVar.F;
                            o4 = efVar.G;
                            if ((efVar.J / 90) % 2 != 0) {
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

    public final void q3() {
        View view = this.T3;
        if (view != null) {
            vo0 vo0Var = this.X0[0];
            int i7 = vo0Var.h;
            if (vo0Var.f53008p && (i7 == 3 || i7 == 4 || i7 == 2 || i7 == 1)) {
                if (i7 == 3) {
                    view.setContentDescription(org.telegram.messenger.gd.N0(2131754929, "AccActionPlay"));
                } else if (i7 == 2) {
                    view.setContentDescription(org.telegram.messenger.gd.N0(2131754938, "AccActionDownload"));
                } else if (i7 == 1) {
                    view.setContentDescription(org.telegram.messenger.gd.N0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.gd.N0(2131754930, "AccActionPause"));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void r0() {
        wq0 wq0Var = this.f43317d5;
        if (wq0Var != null) {
            wq0Var.f53726a.P0(true, true);
        }
        uq0 uq0Var = this.d;
        wq0 wq0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (uq0Var != null) {
            org.telegram.messenger.fj fjVar = this.T4;
            org.telegram.messenger.fc fcVar = this.Z4;
            if (fcVar != null) {
                tL_fileLocationToBeDeprecated = fcVar.f23976f;
            }
            wq0Var2 = uq0Var.E(fjVar, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f43317d5 = wq0Var2;
        if (wq0Var2 != null && !wq0Var2.f53742s) {
            wq0Var2.f53726a.P0(false, true);
        }
    }

    public final TLRPC.Document r1() {
        int i7;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43350g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) obj;
                    if (!xeVar.v && !xeVar.f27981w && !xeVar.f27980u) {
                        return this.A7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void r2() {
        if (!E1()) {
            org.telegram.messenger.fj fjVar = this.T4;
            if (fjVar == null || !fjVar.r4()) {
                yo0 yo0Var = this.f43504y2;
                org.telegram.messenger.g0.r(yo0Var);
                org.telegram.messenger.g0.h3(yo0Var, 3000);
            }
        }
    }

    public final void r3() {
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
            tq0 tq0Var = this.N;
            ValueAnimator valueAnimator = tq0Var.f52456n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tq0Var.f52456n = null;
            }
            tq0Var.f52457r = f10;
            tq0Var.f52453c[0].setRightPadding((int) f10);
            tq0Var.d.setRightPadding(f10);
        }
    }

    public final void s0() {
        org.telegram.messenger.fj fjVar;
        boolean z10;
        int i7;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        org.telegram.messenger.fj fjVar2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f43505y3;
        if (!isEmpty && ((fjVar = this.T4) == null || !fjVar.r4())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.P4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i12);
                    if (!org.telegram.messenger.fj.L4(fjVar3.f24073k) && !fjVar3.e5()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (fjVar3.e5() && (fjVar2 = this.T4) != null && fjVar2.e1() == fjVar3.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i7 = fjVar3.f24073k.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.C2) != null) {
                            i7 = textureView.getMeasuredWidth();
                        } else {
                            i7 = 0;
                        }
                        if (z10) {
                            i10 = fjVar3.f24073k.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.C2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document F0 = fjVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i7 = documentAttribute.f28499w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = org.telegram.messenger.g0.f24226q;
                        if (point.y > point.x && i7 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f43334f0.getMeasuredHeight() + ((int) (i10 / (i7 / this.f43334f0.getMeasuredWidth())))) / 2) - org.telegram.messenger.g0.L(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f43424p6 != null) {
                            float f11 = this.X5;
                            f10 = ((this.f43309c6 - f11) * this.f43390l6) + f11;
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
        if (!z10 && (nVar = this.V8) != null && (hVar = nVar.f60118e) != null) {
            hVar.g(rectF);
        } else {
            fo0 fo0Var = this.f43321d9;
            wi.h.j(rectF, fo0Var.b1(), fo0Var.V1());
        }
        ?? obj = new Object();
        obj.f33482a = rectF.left;
        obj.f33483b = rectF.top;
        obj.f33484c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final void s2(long j3) {
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null && dq0Var.f36730y) {
            dq0Var.i(j3);
        } else {
            org.telegram.ui.Components.h61 h61Var = this.G2;
            if (h61Var != null) {
                h61Var.p0(j3);
            }
        }
        D3();
    }

    public final void s3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f43479v7) {
            charSequence = this.f43489w7;
        } else if (obj instanceof org.telegram.messenger.ef) {
            charSequence = ((org.telegram.messenger.ef) obj).f27962a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.hf)) {
            charSequence = ((org.telegram.messenger.hf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            b1().setText("");
        } else {
            b1().setText(org.telegram.ui.Components.x5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.mt editText = b1().f14936f.getEditText();
        bn bnVar = this.f43388l4;
        if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public void setAnimationValue(float f10) {
        this.f43390l6 = f10;
        this.f43334f0.invalidate();
        D1();
    }

    public final void t0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t0(boolean):void");
    }

    public final RenderNode t1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j3;
        if (this.Q8 == null) {
            renderNode = null;
        } else {
            renderNode = this.R8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a10 = dh.g.a(org.telegram.messenger.g0.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a10, a10, Shader.TileMode.CLAMP));
                this.R8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.Q8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.Q8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.Q8.getWidth(), ceil2 / this.Q8.getHeight());
                beginRecording.drawRenderNode(this.Q8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        dh.a aVar = this.S8;
        aVar.f8364b = 0L;
        aVar.f8363a = false;
        for (float f10 : colorMatrix.getArray()) {
            aVar.c(f10);
        }
        aVar.a(0L);
        if (aVar.f8363a) {
            j3 = -1;
        } else {
            j3 = aVar.f8364b;
        }
        RenderNode renderNode2 = (RenderNode) this.T8.f(j3);
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

    public final void t2(float f10) {
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            h61Var.p0(f10 * ((float) h61Var.U()));
            return;
        }
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null) {
            dq0Var.i(f10 * dq0Var.getVideoDuration());
        }
    }

    public final void t3() {
        int i7 = org.telegram.ui.ActionBar.n6.f29700qg;
        int w12 = w1(i7);
        oi.w1 w1Var = this.T0;
        if (w1Var != null) {
            w1Var.k();
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
        ImageView imageView2 = this.f43282a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.f43282a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f43314d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f43314d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f43304c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f43304c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f43293b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f43293b1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.x0 x0Var = this.V0;
        if (x0Var != null) {
            ((TextView) x0Var.f32380b).setTextColor(w12);
        }
        org.telegram.ui.Cells.x0 x0Var2 = this.V7;
        if (x0Var2 != null) {
            ((TextView) x0Var2.f32380b).setTextColor(w12);
        }
        vp0 vp0Var = this.M1;
        if (vp0Var != null) {
            vp0Var.updateColors();
        }
        org.telegram.ui.Components.de0 de0Var = this.J1;
        if (de0Var != null) {
            ImageView imageView6 = de0Var.C0;
            ImageView imageView7 = de0Var.B0;
            ImageView imageView8 = de0Var.A0;
            org.telegram.ui.ActionBar.i6 i6Var = de0Var.J0;
            TextView textView = de0Var.f34292h0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            de0Var.e();
        }
        zo0 zo0Var = this.V1;
        if (zo0Var != null) {
            zo0Var.H(this.f43484w2);
        }
        ap0 ap0Var = this.W1;
        if (ap0Var != null) {
            ap0Var.H(this.f43484w2);
        }
        wo0 wo0Var = this.Y7;
        if (wo0Var != null) {
            wo0Var.invalidate();
        }
        br0 br0Var = this.f43419p1;
        if (br0Var != null) {
            int childCount = br0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f43419p1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    ((org.telegram.ui.Cells.x5) childAt).f32413c.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
                }
            }
        }
        qo0 qo0Var = this.U3;
        if (qo0Var != null) {
            qo0Var.Y0(true);
        }
    }

    public final void u0(final int i7, final boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        yi0 yi0Var;
        final File file;
        final yi0 yi0Var2;
        boolean z15;
        boolean z16;
        File file2;
        File J;
        File J2;
        boolean z17;
        final boolean z18;
        File file3;
        yi0 yi0Var3;
        boolean z19;
        org.telegram.ui.Components.b6 b6Var;
        int i11 = this.P4;
        if (i7 == 1) {
            i10 = i11 + 1;
        } else if (i7 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.f43308c5[i7] != null) {
            if (i7 == 0 && i11 == 0 && (b6Var = this.f43378k2) != null) {
                z11 = b6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i10 >= 0 && i10 < this.Y6.size()) {
                    ?? r42 = (org.telegram.messenger.fj) this.Y6.get(i10);
                    z12 = Q2(r42);
                    if (this.C5 == 1 && !r42.x()) {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f24073k.attachPath)) {
                        file3 = new File(r42.f24073k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.fj.n1(r42.f24073k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(r42.f24073k).webpage != null && org.telegram.messenger.fj.n1(r42.f24073k).webpage.document == null) {
                        yi0Var3 = new yi0(4, this, l1(i10, null));
                    } else {
                        yi0Var3 = new yi0(5, this, r42.f24073k);
                    }
                    if (org.telegram.messenger.fj.L4(r42.f24073k)) {
                        if ((org.telegram.messenger.bz.B0 && r42.B() && !org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(r42.f24073k))) || r42.D2(true)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        yi0 yi0Var4 = yi0Var3;
                        z13 = z19;
                        yi0Var = r42;
                        file = null;
                        file4 = file3;
                        yi0Var2 = yi0Var4;
                        z14 = true;
                    } else {
                        z14 = false;
                        yi0Var = r42;
                        file = null;
                        file4 = file3;
                        yi0Var2 = yi0Var3;
                        z13 = false;
                    }
                } else {
                    this.X0[i7].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i10 >= 0 && i10 < this.f43350g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f43350g7.get(i10);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.fj.K4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.w7.z(3), this.f43308c5[i7]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.w7.z(0), this.f43308c5[i7]);
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
                                file2 = new File(org.telegram.messenger.w7.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.ec.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(org.telegram.messenger.w7.z(4), this.f43308c5[i7]);
                    } else {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i10 >= 0 && i10 < this.f43299b7.size()) {
                            org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) this.f43299b7.get(i10);
                            if (fcVar != null) {
                                org.telegram.messenger.w7.G(this.U);
                                J = org.telegram.messenger.w7.J(fcVar.f23976f, m1(fcVar), false, true);
                                org.telegram.messenger.w7.G(this.U);
                                J2 = org.telegram.messenger.w7.J(fcVar.f23976f, m1(fcVar), true, true);
                            } else {
                                J2 = null;
                                J = null;
                            }
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43297b5 != null) {
                        if (i10 >= 0 && i10 < this.f43330e7.size()) {
                            org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) this.f43330e7.get(i10);
                            org.telegram.messenger.w7.G(this.U);
                            J = org.telegram.messenger.w7.J(yvVar, null, true, true);
                            org.telegram.messenger.w7.G(this.U);
                            J2 = org.telegram.messenger.w7.J(yvVar, null, false, true);
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43328e5 != null) {
                        file2 = new File(org.telegram.messenger.w7.z(3), this.f43308c5[i7]);
                        file = new File(org.telegram.messenger.w7.z(4), this.f43308c5[i7]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        rq0 rq0Var = this.f43374j7;
                        if (rq0Var != null) {
                            File b10 = rq0Var.b(i10);
                            if (!this.f43374j7.a(i10) && !this.f43374j7.e(i10)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && org.telegram.messenger.bz.B0 && (this.f43374j7.d(i10) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            yi0Var2 = null;
                            z12 = P2(i10);
                            file4 = b10;
                            yi0Var = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            yi0Var = null;
                            file = null;
                            yi0Var2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    yi0Var2 = null;
                    file4 = J;
                    file = J2;
                    yi0Var = yi0Var2;
                }
                yi0Var2 = null;
                file4 = file2;
                yi0Var = yi0Var2;
            }
            if ((i7 != 0 || !this.f43389l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = yi0Var;
            final boolean z20 = z11;
            Utilities.f22877e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.fj fjVar;
                    bn bnVar;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.f43272f9;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    yi0 yi0Var5 = yi0Var2;
                    File file8 = null;
                    if (file7 == null && yi0Var5 != null) {
                        file7 = yi0Var5.e();
                    } else if (yi0Var5 != null) {
                        file8 = yi0Var5.e();
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
                    if (!z22 && i12 != 0 && (fjVar = r72) != null && z23 && org.telegram.messenger.a6.q(photoViewer.U).b(fjVar.f24073k) != 0 && (((bnVar = photoViewer.f43388l4) == null || bnVar.h == null) && !org.telegram.messenger.fj.R5(fjVar.f24073k) && (F0 = fjVar.F0()) != null)) {
                        org.telegram.messenger.w7.G(photoViewer.U).W(F0, fjVar, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f43308c5;
                            vo0[] vo0VarArr = photoViewer2.X0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                        vo0VarArr[i13].d(2, false, true);
                                    } else {
                                        vo0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    vo0VarArr[i13].d(0, z29, true);
                                }
                                Float w10 = org.telegram.messenger.ec.D().w(strArr[i13]);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                vo0VarArr[i13].f(false, w10.floatValue());
                            } else {
                                if (i13 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i13 == 0 && photoViewer2.X2))) {
                                        vo0VarArr[i13].d(3, z29, true);
                                    } else {
                                        vo0VarArr[i13].d(-1, z29, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f43418p0.y()) {
                                    if (!z27) {
                                        if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                            photoViewer2.f43418p0.u(8);
                                        } else {
                                            photoViewer2.f43418p0.T(8);
                                        }
                                    } else {
                                        photoViewer2.f43418p0.u(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f43459t4 || (photoViewer2.f43350g7.isEmpty() && (strArr[0] == null || vo0VarArr[0].h == 0))) {
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
        if (!this.f43350g7.isEmpty() && i10 >= 0 && i10 < this.f43350g7.size()) {
            Object obj = this.f43350g7.get(i10);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.f27963b && (!efVar.d() || (!efVar.j() && this.d2 != 11))) {
                    this.X0[i7].d(3, z10, true);
                    return;
                }
            }
        }
        this.X0[i7].d(-1, z10, true);
    }

    public final int u1() {
        return this.f43457t2.right;
    }

    public final int u2() {
        int i7;
        if (this.A8 > 1048576000) {
            return this.f43342f8 - 1;
        }
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        int i10 = this.f43342f8;
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

    public final void u3(boolean z10) {
        qq0 qq0Var;
        int i7;
        if (this.d2 != 1 && (qq0Var = this.f43334f0) != null) {
            if (!z10) {
                if (qq0Var.getPaddingLeft() <= 0 && this.f43334f0.getPaddingRight() <= 0) {
                    i7 = 1796;
                } else {
                    i7 = 5894;
                }
            } else {
                i7 = 1792;
            }
            this.f43334f0.setSystemUiVisibility(i7);
        }
    }

    public final void v0(int i7) {
        org.telegram.ui.Components.e61 e61Var;
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null && h61Var.d != null && i7 != h61Var.f35659e0) {
            h61Var.f35659e0 = i7;
            ArrayList arrayList = h61Var.O;
            if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                e61Var = (org.telegram.ui.Components.e61) h61Var.O.get(i7);
            } else {
                e61Var = null;
            }
            h61Var.w0(false, e61Var);
        }
        if (i7 == -1) {
            org.telegram.ui.Components.h61.o0(null, this.T4);
        } else {
            org.telegram.ui.Components.h61 h61Var2 = this.G2;
            if (h61Var2 != null) {
                org.telegram.ui.Components.h61.o0(h61Var2.Z(i7), this.T4);
            }
        }
        A3();
        this.f43427q0.V(null, null);
        try {
            d1.f.b(0);
            if (wf.b.I().M()) {
                wf.b.I().Q(i1());
            }
            org.telegram.ui.Components.h61 h61Var3 = this.G2;
            if (h61Var3 != null) {
                d1.f.x(h61Var3.d0());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v2(final boolean z10, final int i7, final int i10, final boolean z11, final boolean z12, boolean z13) {
        int i11;
        float f10;
        boolean z14;
        org.telegram.messenger.d20 d20Var;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        org.telegram.messenger.we weVar;
        org.telegram.messenger.we weVar2;
        TLRPC.Chat chat;
        boolean z15;
        int i12;
        bn bnVar;
        org.telegram.ui.Components.s30 s30Var;
        String str;
        long j3;
        String N0;
        TextureView textureView;
        if (!F1() && this.d != null && !this.f43474v2) {
            String str2 = null;
            if (this.d2 == 1) {
                if (!z13 && (s30Var = this.f43420p2) != null) {
                    TLObject tLObject = s30Var.f39481a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j10 = user.f28641id;
                        str = str3;
                        j3 = j10;
                    } else {
                        str = "";
                        j3 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43334f0.getContext());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.W0 = L;
                    Context context = this.f43334f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f48992a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f48993b = imageReceiver2;
                    org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                    view.f48995e = new Path();
                    a9Var.r(org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f());
                    imageReceiver.j0(org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f(), a9Var, null);
                    imageReceiver2.j0(org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f(), a9Var, null);
                    Drawable drawable = context.getDrawable(2131232061);
                    view.f48996f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f43420p2.f39481a;
                    qq0 qq0Var = this.f43334f0;
                    org.telegram.ui.Components.qd0 qd0Var = this.D1;
                    a9Var.l(tLObject2);
                    imageReceiver.j0(tLObject2, a9Var, null);
                    view.f48994c = qq0Var;
                    view.d = qd0Var;
                    t1Var.W = view;
                    if (this.f43420p2.f39483c == 1) {
                        if (org.telegram.messenger.i10.i(this.U).f24656n == j3) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131745303, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131745304, str, str));
                        }
                        if (this.I4) {
                            N0 = org.telegram.messenger.gd.N0(2131745301, "SetVideo");
                        } else {
                            N0 = org.telegram.messenger.gd.N0(2131745323, "SetPhoto");
                        }
                    } else {
                        if (this.I4) {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744151, str));
                        } else {
                            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744162, str));
                        }
                        N0 = org.telegram.messenger.gd.N0(2131744160, "SuggestPhotoShort");
                    }
                    String str4 = N0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), new l60(6));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.q1() {
                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.f43272f9;
                            PhotoViewer.this.v2(z10, i7, i10, z11, z12, true);
                        }
                    });
                    t1Var.J = org.telegram.ui.ActionBar.n6.f29517gh;
                    t1Var.U0 = true;
                    t1Var.j(i0.a.o(-15461356, 204));
                    t1Var.show();
                    t1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false));
                    t1Var.setOnDismissListener(new cp0(this));
                    if (this.f43448s1 && (textureView = this.C2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f43513z2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.C2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f43513z2.addView(this.E3);
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
            if (!z11 && (bnVar = this.f43388l4) != null) {
                TLRPC.Chat chat2 = bnVar.f46173e;
                if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.v3.T(chat2))) {
                    org.telegram.messenger.mp.u1(this.U).f25753g7.edit().putBoolean("silent_" + this.f43388l4.a(), !z10).commit();
                }
            }
            org.telegram.messenger.d20 j12 = j1();
            ArrayList arrayList = this.f43350g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    ((org.telegram.messenger.xe) obj).f27978s = j12;
                }
            }
            bn bnVar2 = this.f43388l4;
            if (bnVar2 != null && (chat = bnVar2.f46173e) != null && this.d2 != 11) {
                if (!this.f43448s1 && j12 == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15 && !org.telegram.messenger.v3.u(chat)) {
                    org.telegram.messenger.f3.o(null, 2131749362, new org.telegram.ui.Components.kc(this.f43334f0, this.f43484w2), null);
                    return;
                } else if (!z15 && !org.telegram.messenger.v3.p(this.f43388l4.f46173e)) {
                    org.telegram.messenger.f3.o(null, 2131749366, new org.telegram.ui.Components.kc(this.f43334f0, this.f43484w2), null);
                    return;
                }
            }
            this.f43474v2 = true;
            if (j12 != null) {
                long j11 = ((float) j12.f23603q) * 0.9f;
                if ((j11 > 2097152000 && !org.telegram.messenger.i10.i(this.U).q()) || j11 > 4194304000L) {
                    if (this.f43294b2 != null) {
                        org.telegram.ui.Components.ti tiVar = this.f43294b2;
                        new ug.k0(6, org.telegram.messenger.i10.f24637t0, tiVar.f30229c.getContext(), tiVar.f39956a2, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.d2 == 11) {
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
                        int g12 = g1(this.f43467u4);
                        e1();
                        float L2 = g12 - org.telegram.messenger.g0.L(20.0f);
                        tg.i2 i2Var = this.f43423p5;
                        if (i2Var != null && i2Var.f57972j0 && i2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f43423p5.g(canvas, false, null, false);
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
                            this.f43423p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f43506y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            ImageReceiver imageReceiver3 = this.C4;
                            canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                            f10 = 2.0f;
                            canvas.scale(this.C4.N0 / this.f43506y4.getMeasuredWidth(), this.C4.O0 / this.f43506y4.getMeasuredHeight());
                            this.f43506y4.f34019e = !z1();
                            this.f43506y4.draw(canvas);
                            this.f43506y4.f34019e = true;
                            canvas.restore();
                        } else {
                            f10 = 2.0f;
                        }
                        if (z1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = L2 / f10;
                            matrix.preTranslate(f18, f18);
                            if (this.f43424p6 != null) {
                                f15 = org.telegram.messenger.g0.T1(0.0f, this.f43349g6, this.f43390l6);
                                c10 = 5;
                                f11 = org.telegram.messenger.g0.T1(this.f43287a6, this.f43329e6, this.f43390l6);
                                f12 = org.telegram.messenger.g0.T1(this.f43298b6, this.f43340f6, this.f43390l6);
                                f13 = org.telegram.messenger.g0.T1(this.Y5, this.f43318d6, this.f43390l6);
                                f14 = org.telegram.messenger.g0.T1(this.X5, this.f43309c6, this.f43390l6);
                            } else {
                                c10 = 5;
                                f11 = this.f43287a6;
                                f12 = this.f43298b6;
                                f13 = this.Y5;
                                f14 = this.X5;
                                if (this.f43407n6 != 0) {
                                    f14 = this.f43309c6;
                                    f13 = this.f43318d6;
                                    f11 = this.f43329e6;
                                }
                                f15 = 0.0f;
                            }
                            int g13 = g1(this.f43467u4);
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
                            int i13 = gVar.f21950i;
                            if (i13 != 90 && i13 != 270) {
                                o4 = q10;
                                q10 = o4;
                            }
                            float f21 = gVar.f21951j;
                            float f22 = gVar.f21952k;
                            float f23 = o4;
                            float f24 = q10;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i14 = this.d2;
                            nq0 nq0Var = this.X4;
                            if (i14 == 1 || gVar.f21944a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.we weVar3 = nq0Var.f50393c;
                                    if (weVar3 != null && weVar3.f27776l) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    pq0 pq0Var = this.F2;
                                    if (pq0Var != null) {
                                        pq0Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.we weVar4 = nq0Var.f50393c;
                                if (weVar4 != null) {
                                    f16 = weVar4.f27770c;
                                } else {
                                    f16 = 1.0f;
                                }
                                float z16 = ((f25 / min) / com.google.android.gms.internal.vision.e2.z(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.f21947e * 1.0f);
                                matrix.preScale(z16, z16);
                                matrix.preTranslate(com.google.android.gms.internal.vision.e2.D(gVar.f21945b, f23, min, 1.0f), com.google.android.gms.internal.vision.e2.D(gVar.f21946c, f24, min, 1.0f));
                                float f27 = gVar.f21949g + i13;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (weVar2 = nq0Var.f50393c) != null && weVar2.f27776l) {
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
                            ArrayList arrayList3 = efVar.f27975p;
                            int size = arrayList3.size();
                            int i15 = 0;
                            String str5 = null;
                            while (i15 < size) {
                                Object obj3 = arrayList3.get(i15);
                                i15++;
                                org.telegram.messenger.b20 a10 = ((org.telegram.messenger.b20) obj3).a();
                                float f28 = a10.f23127c;
                                float f29 = a10.d;
                                float f30 = a10.f23129f + f28;
                                float f31 = a10.f23130g + f29;
                                float f32 = L2;
                                float[] fArr = new float[8];
                                fArr[0] = f28;
                                fArr[1] = f29;
                                fArr[2] = f30;
                                fArr[3] = f29;
                                fArr[4] = f30;
                                fArr[c10] = f31;
                                fArr[6] = f28;
                                fArr[7] = f31;
                                matrix.mapPoints(fArr);
                                a10.f23129f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / f32;
                                ArrayList arrayList4 = arrayList3;
                                int i16 = size;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f32;
                                a10.f23130g = sqrt;
                                a10.f23127c = (((fArr[0] + fArr[4]) / f10) / f32) - (a10.f23129f / f10);
                                a10.d = (((fArr[1] + fArr[c10]) / f10) / f32) - (sqrt / f10);
                                a10.v = 1.0f;
                                a10.A = true;
                                if (efVar.f27981w && (weVar = efVar.A) != null) {
                                    a10.f23128e = (float) (a10.f23128e - ((weVar.f27775k / 180.0f) * 3.141592653589793d));
                                }
                                a10.f23128e = (float) (a10.f23128e - ((this.f43298b6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a10);
                                TLRPC.Document document = a10.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.fj.V(document, null, null);
                                }
                                arrayList3 = arrayList4;
                                L2 = f32;
                                size = i16;
                            }
                            org.telegram.messenger.d20 d20Var2 = new org.telegram.messenger.d20();
                            d20Var2.I = true;
                            d20Var2.f23597k = 512;
                            d20Var2.h = 512;
                            d20Var2.f23598l = 512;
                            d20Var2.f23595i = 512;
                            d20Var2.G = arrayList2;
                            long k10 = Utilities.k(efVar.f27979t, 2999L, 800L);
                            d20Var2.f23604r = k10;
                            d20Var2.v = k10;
                            d20Var2.f23599m = 200000;
                            d20Var2.f23600n = 30;
                            z14 = true;
                            d20Var2.N = true;
                            d20Var2.f23603q = 262144L;
                            d20Var = d20Var2;
                            str2 = str5;
                        } else {
                            z14 = true;
                            d20Var = null;
                        }
                        float f33 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.ec.a0(createBitmap, Bitmap.CompressFormat.WEBP, f33, f33, 100);
                        org.telegram.messenger.w7.G(org.telegram.messenger.i10.f24637t0);
                        String file = org.telegram.messenger.w7.J(a02, "webp", z14, z14).toString();
                        if (d20Var != null) {
                            d20Var.f23601o = file;
                        }
                        if (this.f43442r5 == null) {
                            this.f43442r5 = new ArrayList();
                        }
                        if (this.f43442r5.isEmpty()) {
                            String str6 = this.f43423p5.f57964d0;
                            if (str6 != null && org.telegram.messenger.j6.g(str6) != null) {
                                this.f43442r5.add(this.f43423p5.f57964d0);
                            } else if (str2 != null) {
                                this.f43442r5.add(str2);
                            } else {
                                this.f43442r5.add("👍");
                            }
                        }
                        this.f43474v2 = false;
                        ns p10 = ns.p();
                        tg.i2 i2Var2 = this.f43423p5;
                        ArrayList arrayList5 = this.f43442r5;
                        dp0 dp0Var = new dp0(this, file, d20Var, efVar, z10, i7, i10, z12);
                        js jsVar = p10.U;
                        Activity W = org.telegram.messenger.g0.W(i2Var2.getContext());
                        if (W != null) {
                            p10.v(W);
                            p10.u(dp0Var);
                            ?? obj4 = new Object();
                            obj4.f27001a = file;
                            obj4.f27006g = d20Var;
                            p10.f50417o = arrayList5;
                            p10.s(null, obj4, null, null, null, 3, false, null, new fi.b(), 0);
                            org.telegram.messenger.g0.r(jsVar);
                            org.telegram.messenger.g0.h3(jsVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                i11 = 5;
                this.d.o(this.P4, j12, z10, i7, i10, z12);
            } else {
                i11 = 5;
                this.d.M(j12);
            }
            if (this.P) {
                if (this.Q) {
                    org.telegram.messenger.g0.h3(new zn0(this, i11), 200L);
                } else {
                    z0(false, false);
                }
            }
        }
    }

    public final void v3(float f10) {
        int g12;
        int e12;
        boolean z10;
        View view;
        org.telegram.ui.Components.te0 te0Var = this.f43513z2;
        if (te0Var != null && te0Var.getVisibility() == 0 && this.H3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f10 *= Math.min(g1(this.f43467u4) / view.getMeasuredWidth(), y1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.C4;
        float f11 = imageReceiver.N0;
        float f12 = imageReceiver.O0;
        org.telegram.messenger.we weVar = this.X4.f50393c;
        if (weVar != null) {
            f11 *= weVar.f27771e;
            f12 *= weVar.f27772f;
        }
        if (this.d2 == 11) {
            g12 = (int) (f11 * f10);
        } else {
            g12 = ((int) ((f11 * f10) - g1(this.f43467u4))) / 2;
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
        vp0 vp0Var = this.M1;
        if (vp0Var != null) {
            if (f10 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = vp0Var.f58031h1;
            boolean z11 = !z10;
            if (vp0Var.M1 != z11) {
                vp0Var.M1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.m10.o(animate.alpha(f13), org.telegram.ui.Components.kr.h, 240L);
            }
        }
    }

    public final void w0(boolean z10, boolean z11, float f10) {
        if (f10 != this.f43464u1) {
            this.f43464u1 = f10;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f43464u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.fj.B0(this.T4.f24073k) + "_" + this.T4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.fj.B0(this.T4.f24073k) + "_" + this.T4.e1(), this.f43464u1).commit();
                }
            }
            org.telegram.ui.Components.h61 h61Var = this.G2;
            if (h61Var != null) {
                h61Var.v0(this.f43464u1);
            }
            dq0 dq0Var = this.f43343g0;
            if (dq0Var != null) {
                dq0Var.setPlaybackSpeed(this.f43464u1);
            }
        }
        I2(true, z10);
        if (z11) {
            this.f43427q0.V(null, null);
        }
    }

    public final int w1(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f43484w2;
        if (i6Var != null) {
            return i6Var.i(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void w2(org.telegram.ui.Components.s30 s30Var) {
        String str;
        int i7;
        TLRPC.User user;
        this.f43420p2 = s30Var;
        if (this.d2 == 1) {
            if (F3()) {
                this.f43410o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.f43410o0.setVisibility(8);
            }
            if (s30Var != null && (user = s30Var.f39482b) != null && s30Var.f39483c == 1 && this.f43420p2.d) {
                if (s30Var.f39484e) {
                    this.D1.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131745316, user.first_name));
                } else {
                    this.D1.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131745317, user.first_name));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (s30Var != null) {
            if (s30Var.f39483c == 2) {
                if (s30Var.f39484e) {
                    str = "SuggestVideo";
                    i7 = 2131744152;
                } else {
                    str = "SuggestPhoto";
                    i7 = 2131744163;
                }
                N2(org.telegram.messenger.gd.N0(i7, str));
            }
            if (s30Var.f39484e) {
                this.Z7.setText(org.telegram.messenger.gd.N0(2131745339, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void w3() {
        boolean z10;
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var != null) {
            if (!d1.f.u() && !this.f43436r) {
                z10 = false;
            } else {
                z10 = true;
            }
            h61Var.t0(z10);
        }
        if (!this.f43435q8) {
            this.f43335f1.setEnabled(false);
            this.f43335f1.setClickable(false);
            this.f43335f1.animate().alpha(0.5f).setDuration(180L).start();
            this.Y7.setMode(0);
            return;
        }
        this.f43335f1.setEnabled(true);
        this.f43335f1.setClickable(true);
        this.f43335f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f43436r) {
            if (this.f43327e4 == null) {
                this.N.a(org.telegram.messenger.gd.N0(2131745083, "SoundMuted"), true);
            }
            org.telegram.ui.Components.h00 h00Var = this.f43324e1;
            h00Var.f35595e = true;
            h00Var.invalidateSelf();
            if (this.f43377k1.getTag() != null) {
                this.f43377k1.setAlpha(0.5f);
                this.f43377k1.setEnabled(false);
            }
            if (this.d2 == 1) {
                this.Y7.setMaxProgressDiff(9600.0f / this.f43417o8);
                this.Y7.setMode(1);
                C3();
                return;
            }
            this.Y7.setMaxProgressDiff(1.0f);
            this.Y7.setMode(0);
            return;
        }
        this.N.a(this.J8, true);
        org.telegram.ui.Components.h00 h00Var2 = this.f43324e1;
        h00Var2.f35595e = false;
        h00Var2.invalidateSelf();
        if (this.f43377k1.getTag() != null) {
            this.f43377k1.setAlpha(1.0f);
            this.f43377k1.setEnabled(true);
        }
        this.Y7.setMaxProgressDiff(1.0f);
        this.Y7.setMode(0);
    }

    public final void x0(boolean z10) {
        int i7 = this.P4;
        if (i7 >= 0 && i7 < this.f43350g7.size() && F1()) {
            if (z10) {
                d0();
            }
            b1().p();
        }
    }

    public final long x1() {
        dq0 dq0Var = this.f43343g0;
        if (dq0Var != null && dq0Var.f36730y) {
            return dq0Var.getVideoDuration();
        }
        org.telegram.ui.Components.h61 h61Var = this.G2;
        if (h61Var == null) {
            return 0L;
        }
        return h61Var.U();
    }

    public final void x2(boolean z10) {
        if (this.f43412o2 != z10) {
            this.f43412o2 = z10;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void x3(float f10, float f11, float f12, float f13) {
        float f14 = f10 - (f12 / 2.0f);
        float f15 = f11 - (f13 / 2.0f);
        boolean z10 = this.f43290a9;
        RectF rectF = this.Z8;
        if (!z10 || Math.abs(rectF.left - f14) >= 1.0f || Math.abs(rectF.top - f15) >= 1.0f || Math.abs(rectF.width() - f12) >= 1.0f || Math.abs(rectF.height() - f13) >= 1.0f) {
            rectF.set(f14, f15, f12 + f14, f13 + f15);
            this.f43290a9 = true;
            if (this.V8 != null && !this.f43301b9) {
                this.f43301b9 = true;
                org.telegram.messenger.g0.h3(this.f43312c9, 150L);
            }
        }
    }

    public final void y0() {
        vp0 vp0Var = this.M1;
        Activity activity = this.E;
        kn0 kn0Var = new kn0(this, 2);
        if (vp0Var.f58054v1) {
            vp0Var.z0(false);
        } else if (vp0Var.U1) {
            vp0Var.n0(true);
        } else if (vp0Var.D0 && vp0Var.C0 != null) {
            vp0Var.u0(null, true);
        } else if (vp0Var.f58041p0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, vp0Var.A1);
            String N0 = org.telegram.messenger.gd.N0(2131747084, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.U = N0;
            t1Var.S = org.telegram.messenger.gd.N0(2131751393, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747386, null), new tg.s(kn0Var, 0));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            R2(alertDialog$Builder);
        } else {
            kn0Var.run();
        }
    }

    public final int y1() {
        int measuredHeight;
        int e12 = e1();
        qq0 qq0Var = this.f43334f0;
        if (qq0Var != null && (measuredHeight = qq0Var.getMeasuredHeight()) > 0) {
            return Math.min(e12, measuredHeight);
        }
        return e12;
    }

    public final void y2() {
        org.telegram.ui.Components.x51 x51Var;
        org.telegram.ui.Components.x51 x51Var2;
        if (!this.f43354h2 && this.d2 == 1) {
            if (!this.f43448s1 || ((x51Var2 = (org.telegram.ui.Components.x51) this.C2) != null && x51Var2.getVideoWidth() > 0 && x51Var2.getVideoHeight() > 0)) {
                this.f43354h2 = true;
                Bitmap n10 = this.C4.n();
                int i7 = this.C4.V;
                if (n10 == null) {
                    n10 = this.f43360i0.getBitmap();
                    i7 = this.f43360i0.getOrientation();
                }
                Bitmap bitmap = n10;
                int i10 = i7;
                if (bitmap != null || this.C2 != null) {
                    org.telegram.ui.Components.qd0 qd0Var = this.D1;
                    if (this.f43448s1) {
                        x51Var = (org.telegram.ui.Components.x51) this.C2;
                    } else {
                        x51Var = null;
                    }
                    qd0Var.b(bitmap, i10, false, false, this.E1, x51Var, this.X4.f50393c);
                }
            }
        }
    }

    public final void y3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.y3():void");
    }

    public final void z0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z0(boolean, boolean):void");
    }

    public final boolean z1() {
        if (Z0(true) != 0) {
            return true;
        }
        return false;
    }

    public final void z2(org.telegram.messenger.fj fjVar, CharSequence charSequence, boolean z10, boolean z11) {
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
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.x5.cloneSpans(charSequence, 3);
        V2(this.R4, z11);
        if (!this.R4 && this.d2 != 1) {
            this.V1.setVisibility(8);
            this.W1.setVisibility(8);
            if (this.f43370j2) {
                if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout = this.f43283a2;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, c8.na.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.U1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f43334f0.getContext());
                    this.f43283a2 = frameLayout2;
                    this.R1.setContainer(frameLayout2);
                    wp0 wp0Var = new wp0(this, this.f43334f0.getContext(), this.R1, this.f43283a2, 0);
                    this.U1 = wp0Var;
                    this.R1.setScrollView(wp0Var);
                    this.f43283a2.setClipChildren(false);
                    this.U1.addView(this.f43283a2, new ViewGroup.LayoutParams(-1, -2));
                    this.f43334f0.addView(this.U1, c8.na.e(-1, -1, 80));
                }
                if (this.R1.getParent() != this.f43283a2) {
                    this.Q0.removeView(this.R1);
                    this.R1.setMeasureAllChildren(true);
                    this.f43283a2.addView(this.R1, -1, -2);
                    this.f43450s3.bringToFront();
                }
                if (fjVar != null && fjVar.r4()) {
                    if (this.S1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.F);
                        this.S1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.n6.b0(620756991, 369098751, 8, 8));
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
                    this.T1.setText(fjVar.Y0);
                    this.f43283a2.addView(this.S1, c8.na.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
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
            mq0 mq0Var = this.R1;
            if (z11) {
                currentView = mq0Var.getNextView();
            } else {
                currentView = mq0Var.getCurrentView();
            }
            if (this.f43448s1) {
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
                if (this.f43370j2) {
                    Point point = org.telegram.messenger.g0.f24226q;
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
            boolean z19 = this.f43370j2;
            if (!z19 && z11 && isEmpty) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f43403n2 = z12;
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
                if (this.f43370j2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new xp0(this, isEmpty2, isEmpty, 1)).addTransition(new xp0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
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
                wp0 wp0Var2 = this.U1;
                if (wp0Var2 != null) {
                    wp0Var2.scrollTo(0, 0);
                }
                z13 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.n6.K(null, true);
                if (fjVar == null || !this.f43406n5 || (message = fjVar.f24073k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.a31.N0())) {
                    if (fjVar != null && !fjVar.f24073k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        fjVar.c(spannableString, true, false);
                        if (org.telegram.messenger.fj.L4(fjVar.f24073k)) {
                            org.telegram.messenger.fj.h(fjVar.P3(), spannableString, false, 3, (int) fjVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.j6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (fjVar != null && fjVar.r4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(fjVar.S0)) {
                        spannableStringBuilder.append((CharSequence) fjVar.S0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new fi.g8(1), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.R1.setTag(cloneSpans);
                try {
                    mq0 mq0Var2 = this.R1;
                    if (this.f43429q2 != z10) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    mq0Var2.a(cloneSpans, z11, z18);
                    wp0 wp0Var3 = this.U1;
                    if (wp0Var3 != null) {
                        wp0Var3.H(wp0Var3.getWidth(), wp0Var3.getHeight());
                    }
                    z14 = true;
                } catch (Exception e10) {
                    z14 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.K && (!this.f43448s1 || this.Q0.getVisibility() == 0 || this.f43374j7 != null)) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                mq0 mq0Var3 = this.R1;
                if (z17) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                mq0Var3.setVisibility(i10);
            } else {
                z14 = true;
                if (this.f43370j2) {
                    this.R1.a(org.telegram.messenger.gd.N0(2131754451, "AddCaption"), z11, false);
                    this.R1.getCurrentView().setTextColor(-1291845633);
                    this.R1.setTag("empty");
                    this.R1.setVisibility(0);
                } else {
                    this.R1.a(null, z11, false);
                    this.R1.getCurrentView().setTextColor(-1);
                    mq0 mq0Var4 = this.R1;
                    if (z13 && !isEmpty2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    mq0Var4.b(4, z15);
                    this.R1.setTag(null);
                }
            }
            if (this.R1.getCurrentView() instanceof lq0) {
                ((lq0) this.R1.getCurrentView()).setLoading(z10);
            }
            if (!isEmpty && z10) {
                z16 = z14;
            } else {
                z16 = false;
            }
            this.f43429q2 = z16;
            return;
        }
        b1().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void z3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z3(int, boolean):void");
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
