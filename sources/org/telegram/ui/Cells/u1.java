package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l20;
import org.telegram.ui.pv0;
import org.telegram.ui.rm;
import org.telegram.ui.xj0;
public class u1 extends a0 implements no0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, z9, NotificationCenter.NotificationCenterDelegate, le.d, p4 {
    public static final float[] Fe = new float[8];
    public int A0;
    public boolean A1;
    public int A2;
    public final int[] A3;
    public int A4;
    public final ArrayList A5;
    public boolean A6;
    public MessageObject.GroupedMessages A7;
    public boolean A8;
    public boolean A9;
    public int Aa;
    public vh.h Ab;
    public Path Ac;
    public float Ad;
    public float Ae;
    public final Rect B0;
    public int B1;
    public StaticLayout B2;
    public float B3;
    public u01 B4;
    public o90 B5;
    public boolean B6;
    public boolean B7;
    public t51 B8;
    public CheckBoxBase B9;
    public boolean Ba;
    public float Bb;
    public final RectF Bc;
    public float Bd;
    public final d1 Be;
    public int C0;
    public float C1;
    public StaticLayout C2;
    public SpannableStringBuilder C3;
    public u01 C4;
    public ArrayList C5;
    public boolean C6;
    public boolean C7;
    public t51 C8;
    public StaticLayout C9;
    public Path Ca;
    public float Cb;
    public final RectF Cc;
    public float Cd;
    public ColorFilter[] Ce;
    public int D0;
    public boolean D1;
    public float D2;
    public boolean D3;
    public u01 D4;
    public CharacterStyle D5;
    public boolean D6;
    public boolean D7;
    public int D8;
    public StaticLayout D9;
    public Path Da;
    public float Db;
    public int Dc;
    public int Dd;
    public int[] De;
    public boolean E;
    public int E0;
    public int E1;
    public float E2;
    public boolean E3;
    public String E4;
    public final Path E5;
    public int E6;
    public boolean E7;
    public boolean E8;
    public final AtomicReference E9;
    public float[] Ea;
    public float Eb;
    public float Ec;
    public boolean Ed;
    public TL_stars.StarGift Ee;
    public boolean F;
    public int F0;
    public float F1;
    public float F2;
    public long F3;
    public WebFile F4;
    public boolean F5;
    public long F6;
    public l4 F7;
    public boolean F8;
    public final ImageReceiver F9;
    public float[] Fa;
    public vh.g Fb;
    public float Fc;
    public final m.c3 Fd;
    public boolean G;
    public int G0;
    public int G1;
    public float G2;
    public boolean G3;
    public boolean G4;
    public final f1 G5;
    public float G6;
    public AnimatorSet G7;
    public boolean G8;
    public int G9;
    public float Ga;
    public Integer Gb;
    public yc Gc;
    public k71 Gd;
    public boolean H;
    public boolean H0;
    public int H1;
    public boolean H2;
    public Path H3;
    public boolean H4;
    public final vo0 H5;
    public float H6;
    public final int H7;
    public float H8;
    public int H9;
    public float Ha;
    public Path Hb;
    public z Hc;
    public h1 Hd;
    public boolean I;
    public boolean I0;
    public long I1;
    public yc I2;
    public Paint I3;
    public boolean I4;
    public final g1 I5;
    public boolean I6;
    public final int I7;
    public int I8;
    public float I9;
    public float Ia;
    public float[] Ib;
    public int Ic;
    public org.telegram.ui.ActionBar.f6 Id;
    public boolean J;
    public int J0;
    public long J1;
    public StaticLayout J2;
    public int J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public boolean J7;
    public int J8;
    public int J9;
    public float Ja;
    public final float Jb;
    public l1 Jc;
    public final boolean Jd;
    public MessageObject.GroupedMessages K;
    public int K0;
    public int K1;
    public StaticLayout K2;
    public z K3;
    public int K4;
    public int K5;
    public float K6;
    public int K7;
    public boolean K8;
    public int K9;
    public StaticLayout Ka;
    public float Kb;
    public final xa0 Kc;
    public final ChatMessageSharedResources Kd;
    public MessageObject.GroupedMessagePosition L;
    public float L0;
    public TLRPC.Document L1;
    public StaticLayout L2;
    public boolean L3;
    public int L4;
    public boolean L5;
    public int L6;
    public byte[] L7;
    public int L8;
    public int L9;
    public int La;
    public float Lb;
    public int Lc;
    public final ArrayList Ld;
    public boolean M;
    public boolean M0;
    public boolean M1;
    public StaticLayout M2;
    public boolean M3;
    public int M4;
    public j1 M5;
    public boolean M6;
    public byte[] M7;
    public int M8;
    public int M9;
    public boolean Ma;
    public StaticLayout Mb;
    public int Mc;
    public final Stack Md;
    public final zg.p0 N;
    public boolean N0;
    public boolean N1;
    public StaticLayout N2;
    public int N3;
    public int N4;
    public float N5;
    public int N6;
    public boolean N7;
    public org.telegram.ui.Components.l9 N8;
    public int N9;
    public boolean Na;
    public int Nb;
    public int Nc;
    public final Path Nd;
    public final wg.a O;
    public final RadialProgress2 O0;
    public u01 O1;
    public StaticLayout O2;
    public z O3;
    public int O4;
    public float O5;
    public TLRPC.Poll O6;
    public boolean O7;
    public Paint O8;
    public boolean O9;
    public boolean Oa;
    public String Ob;
    public int Oc;
    public boolean Od;
    public final wg.c P;
    public final RadialProgress2 P0;
    public u01 P1;
    public float P2;
    public int P3;
    public int P4;
    public StaticLayout P5;
    public float P6;
    public boolean P7;
    public Paint P8;
    public boolean P9;
    public StaticLayout Pa;
    public vh.h Pb;
    public int Pc;
    public BotForumHelper.BotDraftAnimationsPool Pd;
    public boolean Q;
    public boolean Q0;
    public yc Q1;
    public float Q2;
    public z Q3;
    public int Q4;
    public double Q5;
    public ArrayList Q6;
    public boolean Q7;
    public Path Q8;
    public boolean Q9;
    public final RectF Qa;
    public final Path Qb;
    public float Qc;
    public final b1 Qd;
    public long R;
    public final int[] R0;
    public yc R1;
    public boolean R2;
    public boolean R3;
    public int R4;
    public int R5;
    public int R6;
    public boolean R7;
    public CheckBoxBase[] R8;
    public boolean R9;
    public yc Ra;
    public final float[] Rb;
    public boolean Rc;
    public final b1 Rd;
    public u01 S;
    public final ai.l4 S0;
    public StaticLayout S1;
    public boolean S2;
    public final gm0 S3;
    public int S4;
    public int S5;
    public l21 S6;
    public boolean S7;
    public x40 S8;
    public boolean S9;
    public RectF Sa;
    public StaticLayout Sb;
    public float Sc;
    public boolean Sd;
    public e90 T;
    public final ImageReceiver T0;
    public StaticLayout T1;
    public boolean T2;
    public StaticLayout T3;
    public int T4;
    public StaticLayout T5;
    public org.telegram.ui.Components.d6 T6;
    public boolean T7;
    public o90 T8;
    public org.telegram.ui.Components.d6 T9;
    public tg.a Ta;
    public int Tb;
    public int Tc;
    public boolean Td;
    public CornerPathEffect U;
    public ColorMatrixColorFilter U0;
    public h90 U1;
    public boolean U2;
    public int U3;
    public int U4;
    public int U5;
    public int U6;
    public boolean U7;
    public float U8;
    public float U9;
    public int Ua;
    public String Ub;
    public int Uc;
    public boolean Ud;
    public int V;
    public final org.telegram.ui.Components.g9 V0;
    public l90 V1;
    public boolean V2;
    public int V3;
    public int V4;
    public StaticLayout V5;
    public int V6;
    public boolean V7;
    public long V8;
    public float V9;
    public float Va;
    public StaticLayout Vb;
    public int Vc;
    public boolean Vd;
    public long W;
    public eq W0;
    public boolean W1;
    public int W2;
    public boolean W3;
    public int W4;
    public int W5;
    public boolean W6;
    public boolean W7;
    public ImageReceiver[] W8;
    public TLRPC.PhotoSize W9;
    public float Wa;
    public int Wb;
    public boolean Wc;
    public boolean Wd;
    public GradientDrawable X0;
    public Drawable X1;
    public ArrayList X2;
    public org.telegram.ui.Components.i9 X3;
    public int X4;
    public final ArrayList X5;
    public boolean X6;
    public boolean X7;
    public org.telegram.ui.Components.g9[] X8;
    public int X9;
    public float Xa;
    public String Xb;
    public final boolean Xc;
    public long Xd;
    public ci.l Y0;
    public int Y1;
    public RectF Y2;
    public u01 Y3;
    public boolean Y4;
    public final ArrayList Y5;
    public float Y6;
    public boolean Y7;
    public boolean[] Y8;
    public Drawable Y9;
    public boolean Ya;
    public TLRPC.User Yb;
    public float Yc;
    public int Yd;
    public Paint Z0;
    public boolean Z1;
    public boolean Z2;
    public int Z3;
    public boolean Z4;
    public sh.d Z5;
    public int Z6;
    public boolean Z7;
    public StaticLayout Z8;
    public cm0 Z9;
    public boolean Za;
    public TLRPC.Chat Zb;
    public final t1 Zc;
    public int Zd;
    public u01 f21225a0;
    public hj0 f21226a1;
    public l20 a2;
    public boolean f21227a3;
    public int f21228a4;
    public boolean f21229a5;
    public sh.a f21230a6;
    public float f21231a7;
    public boolean f21232a8;
    public org.telegram.ui.Components.g6 f21233a9;
    public cm0 f21234aa;
    public boolean f21235ab;
    public TLRPC.FileLocation f21236ac;
    public boolean f21237ad;
    public int f21238ae;
    public e90 f21239b0;
    public Paint f21240b1;
    public int f21241b2;
    public int f21242b3;
    public int f21243b4;
    public final RectF f21244b5;
    public qh.g f21245b6;
    public float f21246b7;
    public long f21247b8;
    public boolean f21248b9;
    public cm0 f21249ba;
    public float f21250bb;
    public String f21251bc;
    public boolean bd;
    public int f21252be;
    public CornerPathEffect f21253c0;
    public Paint f21254c1;
    public int f21255c2;
    public CharSequence f21256c3;
    public MessageObject.TextLayoutBlocks f21257c4;
    public final RectF f21258c5;
    public qh.g f21259c6;
    public int f21260c7;
    public boolean f21261c8;
    public int f21262c9;
    public cm0 f21263ca;
    public float cb;
    public Object f21264cc;
    public boolean f21265cd;
    public float f21266ce;
    public int f21267d0;
    public Paint f21268d1;
    public int f21269d2;
    public int f21270d3;
    public MessageObject.TextLayoutBlocks f21271d4;
    public TLObject f21272d5;
    public int f21273d6;
    public int f21274d7;
    public boolean f21275d8;
    public int f21276d9;
    public cm0 f21277da;
    public StaticLayout f21278db;
    public long f21279dc;
    public final org.telegram.ui.Components.d6 f21280dd;
    public float f21281de;
    public p21 f21282e0;
    public mx0 f21283e1;
    public int f21284e2;
    public float f21285e3;
    public xi0 f21286e4;
    public TLRPC.PhotoSize f21287e5;
    public int f21288e6;
    public boolean e7;
    public boolean f21289e8;
    public boolean f21290e9;
    public cm0 f21291ea;
    public int f21292eb;
    public String ec;
    public FlagSecureReason f21293ed;
    public org.telegram.ui.Components.j8 f21294ee;
    public boolean f21295f;
    public int f21296f0;
    public boolean f21297f1;
    public int f21298f2;
    public int f21299f3;
    public CharSequence f21300f4;
    public TLRPC.PhotoSize f21301f5;
    public int f21302f6;
    public String f7;
    public boolean f21303f8;
    public int f21304f9;
    public int f21305fa;
    public final StaticLayout[] f21306fb;
    public org.telegram.ui.Components.n5 f21307fc;
    public boolean f21308fd;
    public NotificationCenter.ObserversGroup fe;
    public az0 f21309g0;
    public float f21310g1;
    public int f21311g2;
    public int f21312g3;
    public StaticLayout f21313g4;
    public BitmapDrawable f21314g5;
    public float f21315g6;
    public TLRPC.Message f21316g7;
    public boolean f21317g8;
    public int f21318g9;
    public Drawable f21319ga;
    public int f21320gb;
    public org.telegram.ui.Components.n5 gc;
    public final e1 f21321gd;
    public boolean f21322ge;
    public boolean h;
    public int f21323h0;
    public float f21324h1;
    public boolean f21325h2;
    public int f21326h3;
    public MessageObject.TextLayoutBlocks f21327h4;
    public String f21328h5;
    public float f21329h6;
    public boolean f21330h7;
    public int f21331h8;
    public int f21332h9;
    public boolean ha;
    public boolean f21333hb;
    public TLRPC.User f21334hc;
    public int f21335hd;
    public boolean f21336he;
    public long f21337i0;
    public boolean f21338i1;
    public boolean f21339i2;
    public int f21340i3;
    public CharSequence f21341i4;
    public String f21342i5;
    public int f21343i6;
    public int f21344i7;
    public float f21345i8;
    public int f21346i9;
    public yh.i8 f21347ia;
    public float f21348ib;
    public TLRPC.User f21349ic;
    public int f21350id;
    public xj0 f21351ie;
    public int f21352j0;
    public boolean f21353j1;
    public boolean f21354j2;
    public LinearGradient j3;
    public int f21355j4;
    public Drawable f21356j5;
    public int f21357j6;
    public int f21358j7;
    public long f21359j8;
    public boolean f21360j9;
    public int f21361ja;
    public int f21362jb;
    public TLRPC.Chat f21363jc;
    public float f21364jd;
    public boolean f21365je;
    public yc f21366k0;
    public CheckBoxBase f21367k1;
    public boolean f21368k2;
    public kc0 f21369k3;
    public int f21370k4;
    public int f21371k5;
    public float f21372k6;
    public boolean f21373k7;
    public boolean f21374k8;
    public final Rect f21375k9;
    public z f21376ka;
    public int f21377kb;
    public String f21378kc;
    public boolean f21379kd;
    public final b1 f21380ke;
    public org.telegram.ui.Components.n5 f21381l0;
    public CheckBoxBase l1;
    public boolean f21382l2;
    public int f21383l3;
    public int l4;
    public boolean f21384l5;
    public boolean f21385l6;
    public boolean f21386l7;
    public boolean f21387l8;
    public boolean f21388l9;
    public u01 f21389la;
    public final float[] f21390lb;
    public String f21391lc;
    public ValueAnimator f21392ld;
    public Runnable f21393le;
    public boolean m0;
    public boolean f21394m1;
    public int f21395m2;
    public int f21396m3;
    public Drawable f21397m4;
    public float f21398m5;
    public boolean f21399m6;
    public float f21400m7;
    public boolean f21401m8;
    public final ImageReceiver f21402m9;
    public u01 f21403ma;
    public float f21404mb;
    public boolean f21405mc;
    public int f21406md;
    public Runnable f21407me;
    public int f21408n;
    public int f21409n0;
    public boolean f21410n1;
    public int f21411n2;
    public int f21412n3;
    public int f21413n4;
    public float f21414n5;
    public boolean f21415n6;
    public boolean f21416n7;
    public boolean f21417n8;
    public final org.telegram.ui.Components.g9 f21418n9;
    public int f21419na;
    public float nb;
    public boolean nc;
    public float f21420nd;
    public int ne;
    public int f21421o0;
    public float f21422o1;
    public int f21423o2;
    public int f21424o3;
    public int f21425o4;
    public long f21426o5;
    public boolean f21427o6;
    public final ArrayList f21428o7;
    public boolean f21429o8;
    public boolean o9;
    public int f21430oa;
    public StaticLayout f21431ob;
    public boolean f21432oc;
    public final e1 f21433od;
    public int f21434oe;
    public int f21435p0;
    public long f21436p1;
    public int f21437p2;
    public int f21438p3;
    public float f21439p4;
    public long p5;
    public boolean f21440p6;
    public final HashMap f21441p7;
    public boolean f21442p8;
    public boolean f21443p9;
    public org.telegram.ui.Components.d6 f21444pa;
    public int f21445pb;
    public org.telegram.ui.Components.u5 f21446pc;
    public final SparseArray f21447pd;
    public boolean f21448pe;
    public int f21449q0;
    public int f21450q1;
    public int f21451q2;
    public boolean f21452q3;
    public float f21453q4;
    public boolean f21454q5;
    public boolean q6;
    public final HashMap f21455q7;
    public boolean f21456q8;
    public boolean f21457q9;
    public e90 f21458qa;
    public int f21459qb;
    public org.telegram.ui.Components.u5 f21460qc;
    public boolean f21461qd;
    public float f21462qe;
    public n3 f21463r;
    public int f21464r0;
    public org.telegram.ui.g5 f21465r1;
    public int f21466r2;
    public boolean f21467r3;
    public int f21468r4;
    public boolean f21469r5;
    public boolean f21470r6;
    public String f21471r7;
    public int f21472r8;
    public final ImageReceiver f21473r9;
    public o90 f21474ra;
    public int f21475rb;
    public org.telegram.ui.Components.u5 f21476rc;
    public boolean f21477rd;
    public Paint f21478re;
    public boolean f21479s;
    public int f21480s0;
    public i10 f21481s1;
    public int f21482s2;
    public boolean f21483s3;
    public int f21484s4;
    public org.telegram.ui.Components.y5 f21485s5;
    public boolean f21486s6;
    public int f21487s7;
    public boolean f21488s8;
    public int f21489s9;
    public ArrayList f21490sa;
    public int f21491sb;
    public org.telegram.ui.Components.u5 f21492sc;
    public float f21493sd;
    public boolean f21494se;
    public int f21495t0;
    public boolean f21496t1;
    public int f21497t2;
    public yc f21498t3;
    public int f21499t4;
    public l90 f21500t5;
    public boolean f21501t6;
    public boolean f21502t7;
    public org.telegram.ui.ActionBar.f5 f21503t8;
    public Drawable[] f21504t9;
    public boolean ta;
    public CharSequence f21505tb;
    public org.telegram.ui.Components.u5 f21506tc;
    public float f21507td;
    public bz0 f21508te;
    public int f21509u0;
    public boolean f21510u1;
    public int f21511u2;
    public int f21512u3;
    public StaticLayout f21513u4;
    public MessageObject.TextLayoutBlock f21514u5;
    public boolean f21515u6;
    public boolean f21516u7;
    public org.telegram.ui.ActionBar.f5 f21517u8;
    public int[] f21518u9;
    public int f21519ua;
    public boolean f21520ub;
    public yc f21521uc;
    public float f21522ud;
    public Paint f21523ue;
    public o0 v;
    public int f21524v0;
    public boolean f21525v1;
    public int f21526v2;
    public final Drawable[] f21527v3;
    public org.telegram.ui.Components.n6 f21528v4;
    public int f21529v5;
    public long f21530v6;
    public int f21531v7;
    public int f21532v8;
    public Drawable v9;
    public boolean f21533va;
    public boolean f21534vb;
    public yc f21535vc;
    public float f21536vd;
    public Paint f21537ve;
    public final l.d f21538w;
    public int f21539w0;
    public boolean f21540w1;
    public int f21541w2;
    public final o1[] f21542w3;
    public org.telegram.ui.Components.n6 f21543w4;
    public final h90 f21544w5;
    public String f21545w6;
    public vh.h f21546w7;
    public int f21547w8;
    public Drawable f21548w9;
    public int f21549wa;
    public Paint f21550wb;
    public yc wc;
    public long f21551wd;
    public float f21552we;
    public boolean f21553x;
    public int f21554x0;
    public boolean f21555x1;
    public int f21556x2;
    public final int[] f21557x3;
    public yf.n f21558x4;
    public int f21559x5;
    public int f21560x6;
    public boolean f21561x7;
    public int f21562x8;
    public int f21563x9;
    public boolean f21564xa;
    public Path f21565xb;
    public float xc;
    public float f21566xd;
    public int f21567xe;
    public final le.b f21568y;
    public boolean f21569y0;
    public long f21570y1;
    public float f21571y2;
    public final RectF y3;
    public StaticLayout f21572y4;
    public boolean f21573y5;
    public boolean f21574y6;
    public MessageObject f21575y7;
    public int f21576y8;
    public boolean f21577y9;
    public boolean f21578ya;
    public final Path f21579yb;
    public float f21580yc;
    public float f21581yd;
    public MessageObject.TextLayoutBlocks f21582ye;
    public boolean f21583z0;
    public boolean f21584z1;
    public float f21585z2;
    public o90 f21586z3;
    public long f21587z4;
    public final ArrayList f21588z5;
    public boolean f21589z6;
    public MessageObject f21590z7;
    public int f21591z8;
    public boolean f21592z9;
    public boolean f21593za;
    public final float[] f21594zb;
    public z f21595zc;
    public int f21596zd;
    public float f21597ze;

    public u1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static void A3(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new a4.e(29));
            int size = arrayList.size();
            for (int i11 = 0; i11 < size && i10 > 0; i11++) {
                s1 s1Var = (s1) arrayList.get(i11);
                int i12 = s1Var.d;
                if (i12 > 0) {
                    s1Var.d = i12 + 1;
                    i10--;
                }
            }
        }
    }

    public static android.graphics.PointF C2(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.C2(int, int, int, int):android.graphics.PointF");
    }

    public static int[] J2(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        c11 c11Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof y51) && (c11Var = ((y51) characterStyle).f30460a) != null && (messageEntity = c11Var.d) != null) {
            i10 = messageEntity.offset;
            i11 = messageEntity.length + i10;
            z10 = true;
        } else {
            i10 = 0;
            i11 = 0;
            z10 = false;
        }
        if (!z10) {
            i10 = spannable.getSpanStart(characterStyle);
            i11 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i10, i11};
    }

    public static boolean T(u1 u1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            l1 l1Var = u1Var.Jc;
            if (l1Var == null || l1Var.R()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean Z2(float f7, float f10, float f11, float f12) {
        if (f7 <= f11) {
            if (f10 >= f11) {
                return true;
            }
            return false;
        } else if (f7 <= f12) {
            return true;
        } else {
            return false;
        }
    }

    public static void f1(ImageReceiver imageReceiver) {
        Bitmap bitmap;
        if (imageReceiver != null && (bitmap = imageReceiver.getBitmap()) != null) {
            bitmap.recycle();
            imageReceiver.setImageBitmap((Bitmap) null);
        }
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.Pa;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.Pa.getText());
        tg.a[] aVarArr = (tg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tg.a.class);
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            int spanStart = spannableStringBuilder.getSpanStart(aVarArr[length]);
            int spanEnd = spannableStringBuilder.getSpanEnd(aVarArr[length]);
            if (spanStart >= 0 && spanEnd >= spanStart) {
                spannableStringBuilder.delete(spanStart, spanEnd);
            }
        }
        String trim = spannableStringBuilder.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    private long getAuthorBotVerificationId() {
        MessageObject messageObject;
        TLRPC.User user = this.Yb;
        if (user != null) {
            return DialogObject.getBotVerificationIcon(user);
        }
        if (this.Zb != null && (messageObject = this.f21575y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f21575y7.messageOwner.from_id);
            int i10 = this.I7;
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    return DialogObject.getBotVerificationIcon(user2);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    return DialogObject.getBotVerificationIcon(chat);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.Yb;
        if (user != null) {
            return UserObject.getUserName(user);
        }
        if (this.Zb != null) {
            MessageObject messageObject = this.f21575y7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f21575y7.messageOwner.from_id);
                int i10 = this.I7;
                if (peerDialogId >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                    if (user2 != null) {
                        return UserObject.getUserName(user2);
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        return chat.title;
                    }
                }
            }
            return this.Zb.title;
        }
        MessageObject messageObject2 = this.f21575y7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f21575y7.sponsoredTitle;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        MessageObject messageObject;
        TLRPC.User user = this.Yb;
        if (user != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                TLRPC.EmojiStatus emojiStatus = this.Yb.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            } else if (this.Yb.premium) {
                return ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
            } else {
                return null;
            }
        } else if (this.Zb != null && (messageObject = this.f21575y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f21575y7.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.I7).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return UserObject.getEmojiStatusDocumentId(user2);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.I7).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private hh.a getDraftMessageMeasureController() {
        l1 l1Var = this.Jc;
        if (l1Var != null) {
            return l1Var.Y();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i10;
        if (!this.f21575y7.isOutOwner() && ((!this.f21374k8 || this.f21257c4 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f21575y7.isOutOwner() && this.f21477rd && this.f21429o8 && this.f21575y7.type == 5) {
            return (int) ((AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize) * 0.7f);
        }
        return 0;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.U0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
            this.U0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.U0;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.preview) {
            parentWidth = this.J0;
        }
        if (!AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
            if (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2) {
                return parentWidth - AndroidUtilities.getTabletLeftFragmentSize(parentWidth, 0, 0);
            }
            return parentWidth;
        }
        return parentWidth;
    }

    public int getIconForCurrentState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.getIconForCurrentState():int");
    }

    public int getMiniIconForCurrentState() {
        int i10 = this.X4;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    private int getNameHeight() {
        if (this.f21235ab) {
            if (this.Pa == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.j6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f7;
        float f10;
        t1 t1Var = this.Zc;
        if (t1Var.P2) {
            boolean z10 = this.f21235ab;
            f7 = AndroidUtilities.lerp(!z10, z10, t1Var.K1);
        } else if (this.f21235ab) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.j6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
        if (this.Pa == null) {
            f10 = 31.0f;
        } else {
            f10 = 35.0f;
        }
        return AndroidUtilities.lerp(textSize, AndroidUtilities.dp(f10), f7);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (messageReplies = this.K.messages.get(0).messageOwner.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.f21575y7.messageOwner.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    public int getRepliesCount() {
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            return this.K.messages.get(0).getRepliesCount();
        }
        return this.f21575y7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.j6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19374sa;
        }
        return f6Var.F0(i10);
    }

    private float getUseTranscribeButtonProgress() {
        t1 t1Var = this.Zc;
        if (t1Var.f21139n1) {
            if (this.L5) {
                return t1Var.K1;
            }
            return 1.0f - t1Var.K1;
        } else if (this.L5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static m1 n1(int i10, String str, int i11, float f7) {
        m1 m1Var = new m1();
        m1Var.f20639a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.j6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        m1Var.d = staticLayout;
        m1Var.f20640b = f7;
        if (staticLayout.getLineCount() > 0) {
            m1Var.f20641c = ((float) (m1Var.f20640b - Math.ceil(m1Var.d.getLineWidth(0)))) / 2.0f;
            m1Var.f20641c -= (int) m1Var.d.getLineLeft(0);
        }
        return m1Var;
    }

    public static boolean r3(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    private void setInstantButtonPressed(boolean z10) {
        if (this.f21498t3 == null) {
            this.f21498t3 = new yc(this);
        }
        yc ycVar = this.f21498t3;
        this.f21483s3 = z10;
        ycVar.c(z10);
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
    }

    public static StaticLayout u2(CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, int i13) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i14 = i10;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            staticLayout.getLineDirections(i16);
            if (staticLayout.getLineLeft(i16) != 0.0f || staticLayout.isRtlCharAt(staticLayout.getLineStart(i16)) || staticLayout.isRtlCharAt(staticLayout.getLineEnd(i16))) {
                i14 = i11;
            }
            int lineEnd = staticLayout.getLineEnd(i16);
            if (lineEnd == charSequence.length()) {
                break;
            }
            int i17 = (lineEnd - 1) + i15;
            if (spannableStringBuilder.charAt(i17) == ' ') {
                spannableStringBuilder.replace(i17, i17 + 1, (CharSequence) "\n");
            } else if (spannableStringBuilder.charAt(i17) != '\n') {
                spannableStringBuilder.insert(i17, (CharSequence) "\n");
                i15++;
            }
            if (i16 == staticLayout.getLineCount() - 1 || i16 == i13 - 1) {
                break;
            }
        }
        int i18 = i14;
        return uw0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i18, i13, true);
    }

    public static boolean v3() {
        return LiteMode.isEnabled(2);
    }

    public static int w2(MessageObject.GroupedMessagePosition groupedMessagePosition) {
        int i10 = 0;
        if (groupedMessagePosition != null) {
            if ((groupedMessagePosition.flags & 2) == 0) {
                i10 = AndroidUtilities.dp(4.0f);
            }
            if ((groupedMessagePosition.flags & 1) == 0) {
                return AndroidUtilities.dp(4.0f) + i10;
            }
        }
        return i10;
    }

    public static String x2(MessageObject messageObject, boolean z10, boolean z11, boolean z12) {
        if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (messageObject.isOutOwner()) {
                return LocaleController.getString(R.string.ConferenceCallOutgoing);
            }
            if (z10) {
                return LocaleController.getString(R.string.ConferenceCallMissed);
            }
            return LocaleController.getString(R.string.ConferenceCallIncoming);
        } else if (messageObject.isOutOwner()) {
            if (z10) {
                if (z12) {
                    return LocaleController.getString(R.string.CallMessageVideoOutgoingMissed);
                }
                return LocaleController.getString(R.string.CallMessageOutgoingMissed);
            } else if (z12) {
                return LocaleController.getString(R.string.CallMessageVideoOutgoing);
            } else {
                return LocaleController.getString(R.string.CallMessageOutgoing);
            }
        } else if (z10) {
            if (z12) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
            }
            return LocaleController.getString(R.string.CallMessageIncomingMissed);
        } else if (z11) {
            if (z12) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingDeclined);
            }
            return LocaleController.getString(R.string.CallMessageIncomingDeclined);
        } else if (z12) {
            return LocaleController.getString(R.string.CallMessageVideoIncoming);
        } else {
            return LocaleController.getString(R.string.CallMessageIncoming);
        }
    }

    public final boolean A0(MotionEvent motionEvent) {
        if (this.f21575y7.isImportedForward()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                float f10 = this.f21404mb;
                if (f7 >= f10 && f7 <= f10 + this.f21445pb) {
                    float f11 = z22;
                    float f12 = this.nb;
                    if (f11 >= f12 && f11 <= f12 + AndroidUtilities.dp(20.0f)) {
                        this.f21384l5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f21384l5) {
                this.f21384l5 = false;
                playSoundEffect(0);
                this.Jc.l1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void A1(Canvas canvas, float f7) {
        xj0 xj0Var;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f10 = this.f21464r0;
            t1 t1Var = this.Zc;
            if (t1Var.f21131l2) {
                float f11 = t1Var.f21140n2;
                float f12 = t1Var.K1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (t1Var.K1 != 1.0f && t1Var.G0 && ((xj0Var = this.f21351ie) == null || !xj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f21503t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f21409n0, f13, canvas, t1Var.H0, t1Var.O0, false, (1.0f - t1Var.K1) * f7, this.f21575y7.textXOffset, false);
                MessageObject messageObject2 = this.f21575y7;
                z1(this.f21409n0, f13, canvas, messageObject2.textLayoutBlocks, this.f21446pc, true, f7 * t1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f21575y7;
                z1(this.f21409n0, f13, canvas, messageObject3.textLayoutBlocks, this.f21446pc, true, f7, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f7);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f21330h7) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            if (string == null) {
                return LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault);
            }
            return string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public final boolean B0(MotionEvent motionEvent) {
        float f7;
        l1 l1Var;
        MessageObject messageObject = this.f21575y7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f21337i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f7);
        float f11 = this.f21445pb;
        if (this.f21575y7.sendPreview) {
            f10 = 1.0f - this.f21398m5;
        }
        int dp2 = ((int) ((f11 * f10) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f21445pb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f21366k0 == null) {
                    this.f21366k0 = new yc(this);
                }
                this.Ud = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Ud = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Ud && (l1Var = this.Jc) != null) {
                l1Var.F(this);
            }
            this.Ud = false;
        } else if (motionEvent.getAction() == 3) {
            this.Ud = false;
        }
        yc ycVar = this.f21366k0;
        if (ycVar != null) {
            ycVar.c(this.Ud);
        }
        return this.Ud;
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f7;
        xi0 xi0Var;
        float f10;
        if (!this.f21353j1 && this.f21317g8) {
            int i10 = this.f21331h8;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (xi0Var = this.f21286e4) != null) {
            return (1.0f - xi0Var.f30278k.d(1.0f, false)) * f7;
        }
        return f7;
    }

    public final e90 B3() {
        e90 e90Var;
        ArrayList arrayList = this.f21588z5;
        if (!arrayList.isEmpty()) {
            e90Var = (e90) arrayList.get(0);
            arrayList.remove(0);
        } else {
            e90Var = new e90(0);
        }
        e90Var.reset();
        this.A5.add(e90Var);
        return e90Var;
    }

    public final boolean C0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Jd && (messageObject = this.f21575y7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Da, this.Id) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f21575y7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f21575y7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f21257c4 != null) {
            for (int i11 = 0; i11 < this.f21257c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.f21257c4.textLayoutBlocks.get(i11);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
    }

    public final boolean D0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.D0(android.view.MotionEvent):boolean");
    }

    public final boolean D1(android.graphics.Canvas r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.D1(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final String D2(long j3) {
        TLRPC.Chat chat;
        int i10 = this.I7;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (i11 < 0 && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) != null) {
            return chat.title;
        } else {
            return null;
        }
    }

    public final void D3() {
        this.Z2 = false;
        yc ycVar = this.f21535vc;
        if (ycVar != null) {
            ycVar.c(false);
        }
        Drawable drawable = this.f21527v3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.X2 != null) {
            for (int i10 = 0; i10 < this.X2.size(); i10++) {
                m1 m1Var = (m1) this.X2.get(i10);
                yc ycVar2 = m1Var.f20642f;
                if (ycVar2 != null) {
                    ycVar2.c(false);
                }
                z zVar = m1Var.f20643g;
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final boolean E0(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        h90 h90Var = this.f21544w5;
        if (this.f21354j2) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.M1 && this.f21540w1 && this.O4 != -1 && x10 >= (i11 = this.K4) && x10 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.L4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.O0.f22351i.f22626q != 4) {
                    this.P4 = 1;
                    invalidate();
                    return true;
                }
                if (this.M1) {
                    if (this.S0.isInsideImage(x10, z22)) {
                        this.f21573y5 = true;
                        return true;
                    }
                }
                if (this.K2 != null && z22 >= this.f21423o2) {
                    try {
                        int dp = x10 - ((this.f21421o0 + AndroidUtilities.dp(10.0f)) + this.f21466r2);
                        int i13 = z22 - this.f21423o2;
                        int lineForVertical = this.K2.getLineForVertical(i13);
                        float f7 = dp;
                        int offsetForHorizontal = this.K2.getOffsetForHorizontal(lineForVertical, f7);
                        float lineLeft = this.K2.getLineLeft(lineForVertical);
                        if (lineLeft <= f7 && lineLeft + this.K2.getLineWidth(lineForVertical) >= f7) {
                            Spannable spannable = (Spannable) this.f21575y7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof x51) || x51.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                l90 l90Var = this.f21500t5;
                                if (l90Var == null || l90Var.f26069i != clickableSpanArr[0]) {
                                    h90Var.k(l90Var, true);
                                    l90 l90Var2 = new l90(clickableSpanArr[0], this.Id, f7, i13, 0);
                                    this.f21500t5 = l90Var2;
                                    if (this.f21575y7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.j6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.j6.Ld;
                                    }
                                    l90Var2.d(org.telegram.ui.ActionBar.j6.v0(i10, this.Id));
                                    this.f21524v0 = -10;
                                    this.f21559x5 = 2;
                                    try {
                                        e90 b10 = this.f21500t5.b();
                                        int[] J2 = J2(spannable, this.f21500t5.f26069i);
                                        b10.d(this.K2, J2[0], 0.0f);
                                        this.K2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    h90Var.a(this.f21500t5, 2);
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f21559x5 != 2 && !this.f21573y5 && this.P4 == 0) {
                    F3(2);
                    return false;
                } else if (this.P4 != 0) {
                    this.P4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    l90 l90Var3 = this.f21500t5;
                    if (l90Var3 != null) {
                        CharacterStyle characterStyle = l90Var3.f26069i;
                        if (characterStyle instanceof URLSpan) {
                            nf.f.s(getContext(), ((URLSpan) this.f21500t5.f26069i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f21573y5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f21428o7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i14);
                        if (zf.c.c(e0Var.f20160i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Jc.n1(this, e0Var.f20160i);
                            invalidate();
                            break;
                        }
                        i14++;
                    }
                    F3(2);
                    return true;
                }
            }
        }
        return false;
    }

    public void E1(Canvas canvas) {
        if (!this.f21575y7.isMediaSpoilersRevealed && this.Bb != 1.0f) {
            ai.l4 l4Var = this.S0;
            int[] roundRadius = l4Var.getRoundRadius();
            float f7 = roundRadius[0];
            float[] fArr = this.f21594zb;
            fArr[1] = f7;
            fArr[0] = f7;
            float f10 = roundRadius[1];
            fArr[3] = f10;
            fArr[2] = f10;
            float f11 = roundRadius[2];
            fArr[5] = f11;
            fArr[4] = f11;
            float f12 = roundRadius[3];
            fArr[7] = f12;
            fArr[6] = f12;
            Path path = this.f21579yb;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(l4Var.getImageX(), l4Var.getImageY(), l4Var.getImageX2(), l4Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.Bb != 0.0f) {
                path.rewind();
                path.addCircle(this.Cb, this.Db, this.Eb * this.Bb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f21575y7.needDrawBluredPreview()) {
                l4Var.draw(canvas);
            } else {
                float imageX = l4Var.getImageX();
                float imageY = l4Var.getImageY();
                float imageWidth = l4Var.getImageWidth();
                float imageHeight = l4Var.getImageHeight();
                ImageReceiver imageReceiver = this.T0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(l4Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        qr qrVar;
        float f7 = this.f21597ze;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f21394m1) || this.f21410n1)) {
                if (z11) {
                    qrVar = qr.f27643g;
                } else {
                    qrVar = qr.f27644i;
                }
                this.f21450q1 = (int) Math.ceil(qrVar.getInterpolation(this.f21422o1) * AndroidUtilities.dp(35.0f));
                if (this.f21575y7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f21450q1 = 0;
                    }
                }
            }
            f7 += this.f21450q1;
            if (this.F8 && this.L != null) {
                if (z3()) {
                    i10 = 48;
                }
                return (AndroidUtilities.dp(71 - i10) * this.H8) + f7;
            }
        }
        return f7;
    }

    public final void E3() {
        ArrayList arrayList = this.Y5;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s1) arrayList.get(i10)).f20920w.setState(StateSet.NOTHING);
            }
        }
        sh.a aVar = this.f21230a6;
        if (aVar != null) {
            aVar.f43288a.setState(StateSet.NOTHING);
        }
    }

    public final void F0() {
        int i10;
        boolean z10 = this.M0;
        boolean z11 = this.f21322ge;
        ai.l4 l4Var = this.S0;
        if (z10 != z11) {
            this.f21322ge = z10;
            ImageReceiver imageReceiver = this.T0;
            ImageReceiver imageReceiver2 = this.f21473r9;
            ImageReceiver imageReceiver3 = this.F9;
            wg.c cVar = this.P;
            wg.a aVar = this.O;
            ArrayList arrayList = this.Y5;
            RadialProgress2 radialProgress2 = this.P0;
            RadialProgress2 radialProgress22 = this.O0;
            if (z10) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.l9 l9Var = this.N8;
                if (l9Var != null) {
                    l9Var.a();
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((s1) obj).q();
                    }
                }
                qh.g gVar = this.f21245b6;
                if (gVar != null) {
                    gVar.a();
                }
                qh.g gVar2 = this.f21259c6;
                if (gVar2 != null) {
                    gVar2.a();
                }
                if (this.W8 != null) {
                    int i12 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.W8;
                        if (i12 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i12].onAttachedToWindow();
                        i12++;
                    }
                }
                ImageReceiver imageReceiver4 = aVar.d;
                if (imageReceiver4 != null) {
                    imageReceiver4.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr2 = aVar.f45319a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = cVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = cVar.f45344a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (l4Var.onAttachedToWindow()) {
                    if (this.M1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.f21460qc = org.telegram.ui.Components.y5.update(0, (View) this, false, this.f21460qc, this.D9);
                this.f21476rc = org.telegram.ui.Components.y5.update(0, (View) this, false, this.f21476rc, this.K2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.l9 l9Var2 = this.N8;
                if (l9Var2 != null) {
                    l9Var2.b();
                }
                qh.g gVar3 = this.f21245b6;
                if (gVar3 != null) {
                    gVar3.f42068b.onDetachedFromWindow();
                    gVar3.f42081x.f();
                }
                qh.g gVar4 = this.f21259c6;
                if (gVar4 != null) {
                    gVar4.f42068b.onDetachedFromWindow();
                    gVar4.f42081x.f();
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        ((s1) obj2).r();
                    }
                }
                if (this.W8 != null) {
                    int i14 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.W8;
                        if (i14 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
                imageReceiver3.onDetachedFromWindow();
                imageReceiver2.onDetachedFromWindow();
                l4Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = aVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = aVar.f45319a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = cVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = cVar.f45344a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.y5.release(this, this.f21476rc);
                org.telegram.ui.Components.y5.release(this, this.f21460qc);
                org.telegram.ui.Components.y5.release(this, this.f21446pc);
            }
        }
        boolean z12 = this.M0;
        if (z12 != this.f21336he) {
            this.f21336he = z12;
            int i15 = this.I7;
            if (z12) {
                MessageObject messageObject = this.f21575y7;
                if (l4Var != null) {
                    l4Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f21461qd || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f21525v1) {
                        if (document == null) {
                            photoSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                        }
                        int i16 = 2;
                        if (canDownloadMediaType != 2 && (canDownloadMediaType != 1 || !messageObject.isVideo())) {
                            if (canDownloadMediaType != 0) {
                                if (document != null) {
                                    FileLoader fileLoader = FileLoader.getInstance(i15);
                                    if ((!MessageObject.isVideoDocument(document) && !messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) || !messageObject.shouldEncryptPhotoOrVideo()) {
                                        i16 = 0;
                                    }
                                    fileLoader.loadFile(document, messageObject, 1, i16);
                                } else if (photoSize != null) {
                                    FileLoader fileLoader2 = FileLoader.getInstance(i15);
                                    ImageLocation forObject = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
                                    if (messageObject.shouldEncryptPhotoOrVideo()) {
                                        i10 = 2;
                                    } else {
                                        i10 = 0;
                                    }
                                    fileLoader2.loadFile(forObject, messageObject, null, 1, i10);
                                }
                            }
                        } else if (canDownloadMediaType != 2 && document != null && !messageObject.shouldEncryptPhotoOrVideo() && messageObject.canStreamVideo()) {
                            FileLoader.getInstance(i15).loadFile(document, messageObject, 1, 0);
                        }
                        m4(false, false, false);
                    }
                    if (messageObject.hasVideoQualities()) {
                        r71 r71Var = messageObject.highestQuality;
                        if (r71Var != null && !r71Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        r71 r71Var2 = messageObject.thumbQuality;
                        if (r71Var2 != null && !r71Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f21575y7;
            if (l4Var != null) {
                l4Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f18349id) && !PhotoViewer.t1().Q1()) {
                TLRPC.Document document2 = messageObject2.getDocument();
                if (!MessageObject.isStickerDocument(document2) && !MessageObject.isAnimatedStickerDocument(document2, true) && !MessageObject.isGifDocument(document2) && !MessageObject.isRoundVideoDocument(document2)) {
                    if (document2 != null) {
                        FileLoader.getInstance(i15).cancelLoadFile(document2);
                        return;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize != null) {
                        FileLoader.getInstance(i15).cancelLoadFile(closestPhotoSizeWithSize);
                    }
                }
            }
        }
    }

    public void F1(Canvas canvas) {
        if (this.Fb == null) {
            return;
        }
        canvas.save();
        ai.l4 l4Var = this.S0;
        canvas.translate(l4Var.getImageX(), l4Var.getImageY());
        this.Fb.c(canvas, this, (int) l4Var.getImageWidth(), (int) l4Var.getImageHeight(), l4Var.getAlpha(), this.f21448pe);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                qh.g gVar = this.f21245b6;
                if (gVar != null) {
                    return gVar.f42068b;
                }
                return null;
            } else if (i10 == -3) {
                qh.g gVar2 = this.f21259c6;
                if (gVar2 != null) {
                    return gVar2.f42068b;
                }
                return null;
            } else {
                ArrayList arrayList = this.Y5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        s1 s1Var = (s1) obj;
                        sh.b bVar = s1Var.f20921x;
                        if (bVar != null && (pollAnswer = s1Var.f20917s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f43280c;
                        }
                    }
                }
            }
        }
        l4 l4Var = this.F7;
        if (l4Var != null) {
            ArrayList arrayList2 = l4Var.f20595c;
            j4 j4Var = l4Var.f20594b;
            if (j4Var != null && i10 >= 0 && i10 < j4Var.f20465a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) l4Var.f20594b.f20465a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((k4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((k4) arrayList2.get(i12)).f20537f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.S0;
    }

    public final void F3(int i10) {
        h90 h90Var = this.f21544w5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < h90Var.d; i11++) {
                if (((Pair) h90Var.f24581c.get(i11)).second == valueOf) {
                    h90Var.j(i11);
                }
            }
        } else {
            h90Var.d(true);
        }
        h90 h90Var2 = this.U1;
        if (h90Var2 != null) {
            h90Var2.d(true);
        }
        this.f21485s5 = null;
        this.V1 = null;
        if (this.f21500t5 != null) {
            if (this.f21559x5 == i10 || i10 == -1) {
                this.f21500t5 = null;
                this.f21559x5 = -1;
                this.Sd = false;
                this.Td = false;
                invalidate();
            }
        }
    }

    public final void G0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                int i10 = 0;
                if (this.R8 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), this.R8.length);
                    z11 = false;
                    for (int i11 = 0; i11 < min; i11++) {
                        CheckBoxBase checkBoxBase = this.R8[i11];
                        if (checkBoxBase != null && checkBoxBase.f22193q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f21399m6;
                if (!z14 && !this.f21501t6 && this.f21470r6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.f21501t6 && !this.f21486s6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f21427o6) {
                    charSequence = LocaleController.getString(R.string.PollButtonSave);
                    i10 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (messageObject.forceShowPollResults) {
                            charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PollViewBack), false, -AndroidUtilities.dp(2.6666667f), 0.0f, 1.0f);
                            i10 = 82;
                        } else {
                            charSequence = AndroidUtilities.replaceArrows(LocaleController.formatPluralString("PollViewVotesAsAdmin", pollResults.total_voters, new Object[0]), false);
                            i10 = 81;
                        }
                    } else {
                        charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                        i10 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = LocaleController.getString(R.string.PollSubmitVotesNoCaps);
                    i10 = 83;
                } else if (!this.R7 && z15 && ((z14 && (!this.q6 || this.f21470r6)) || (this.f21501t6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                } else {
                    charSequence = null;
                }
                if (i10 != 0) {
                    if (this.Z5 == null) {
                        sh.d dVar = new sh.d(this, this.Id);
                        this.Z5 = dVar;
                        dVar.setCallback(this);
                        dVar.f43288a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.f21256c3 = charSequence;
                    this.Z5.d.q(charSequence, z10, true);
                    this.R2 = true;
                    this.f21242b3 = i10;
                    o1();
                }
                S0(z10);
            }
        }
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i10) {
        s1 s1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((s1) arrayList.get(i10)).f20903b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                t1 t1Var = this.Zc;
                if (t1Var.f21164t2) {
                    float f10 = t1Var.K1;
                    f7 += ((1.0f - f10) * t1Var.f21168u2) + (i12 * f10);
                    if (this.f21575y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (t1Var.f21173w0) {
                    f7 += t1Var.f21121j0;
                }
                return f7 + s1Var.f20904c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f21286e4 != null) {
            this.f21286e4 = null;
        }
        ArrayList arrayList = this.A5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f21588z5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean H0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        l1 l1Var;
        boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = this.I7;
        if (!c10 && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f21575y7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (l1Var = this.Jc) != null && l1Var.d1(3, this) && TextUtils.equals(this.Jc.h(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f21575y7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((s1) arrayList.get(i10)).f20903b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                t1 t1Var = this.Zc;
                if (t1Var.f21164t2) {
                    float f10 = t1Var.K1;
                    f7 += ((1.0f - f10) * t1Var.f21168u2) + (i12 * f10);
                    if (this.f21575y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (t1Var.f21173w0) {
                    f7 += t1Var.f21121j0;
                }
                return f7 - AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void H3() {
        CharSequence charSequence;
        long j3;
        long j10;
        long j11;
        long j12;
        b1 b1Var = this.Qd;
        l.d dVar = this.f21538w;
        dVar.I(b1Var);
        b1 b1Var2 = this.Rd;
        dVar.I(b1Var2);
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f21575y7.caption;
            } else {
                charSequence = this.f21575y7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = h10.e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    h10[] h10VarArr = (h10[]) spanned.getSpans(0, spanned.length(), h10.class);
                    for (h10 h10Var : h10VarArr) {
                        if (h10Var.f24520b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(h10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(h10Var.f24520b.date));
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    long j13 = Long.MAX_VALUE;
                    long j14 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        long intValue = ((Integer) obj).intValue() * 1000;
                        long abs = Math.abs(intValue - currentTimeMillis);
                        if (abs < j13) {
                            j14 = intValue;
                            j13 = abs;
                        }
                    }
                    long j15 = currentTimeMillis - j14;
                    if (j13 < 63000) {
                        if (j15 > 0) {
                            j3 = 1000 - (j15 % 1000);
                        } else {
                            j3 = (-j15) % 1000;
                        }
                    } else if (j13 < 3780000) {
                        j10 = 60000;
                        if (j15 > 0) {
                            j12 = j15 % 60000;
                            j3 = j10 - j12;
                        } else {
                            j11 = (-j15) % 60000;
                            j3 = j11;
                        }
                    } else if (j13 < 90720000) {
                        j10 = 3600000;
                        if (j15 > 0) {
                            j12 = j15 % 3600000;
                            j3 = j10 - j12;
                        } else {
                            j11 = (-j15) % 3600000;
                            j3 = j11;
                        }
                    } else {
                        j3 = -1;
                    }
                    if (j3 > 0) {
                        long j16 = j3 + 100;
                        dVar.I(b1Var2);
                        bv bvVar = new bv(23, dVar, b1Var2);
                        ((HashMap) dVar.f13898a).put(b1Var2, bvVar);
                        if (j16 > 0) {
                            AndroidUtilities.runOnUIThread(bvVar, j16);
                        } else {
                            AndroidUtilities.runOnUIThread(bvVar);
                        }
                    }
                }
            }
        }
    }

    public final boolean I0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.I0(android.view.MotionEvent):boolean");
    }

    public final void I1(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.I1(float, android.graphics.Canvas, boolean):void");
    }

    public final int I2(byte[] bArr) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((s1) arrayList.get(i10)).f20917s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void I3(int i10, int i11, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i10);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    public final boolean J0() {
        return FileLoader.getInstance(this.I7).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public final void J1(android.graphics.Canvas r23, org.telegram.messenger.MessageObject.TextLayoutBlocks r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3(boolean z10, boolean z11) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z11 || (messageObject = this.f21575y7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f21286e4 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Id);
                    this.l1 = checkBoxBase2;
                    if (this.M0) {
                        checkBoxBase2.f22188l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var = this.Id;
                    if (checkBoxBase.F != f6Var) {
                        checkBoxBase.F = f6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((groupedMessages = this.K) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.A7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f21367k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Id);
                    this.f21367k1 = checkBoxBase4;
                    if (!checkBoxBase4.f22200y) {
                        checkBoxBase4.f22200y = true;
                        checkBoxBase4.b();
                    }
                    if (this.M0) {
                        this.f21367k1.f22188l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var2 = this.Id;
                    if (checkBoxBase3.F != f6Var2) {
                        checkBoxBase3.F = f6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f7 = 0.0f;
            if (this.f21394m1 == z10) {
                if (z11 != this.f21410n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f21422o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f21410n1 = z11;
            this.f21394m1 = z10;
            if (z11) {
                this.f21436p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f21422o1 = f7;
            }
            invalidate();
        }
    }

    public final boolean K0(MotionEvent motionEvent) {
        z zVar;
        u1 u1Var;
        l1 l1Var;
        TLRPC.Chat chat;
        int i10;
        TLRPC.Chat chat2;
        if (this.Za && this.Ka != null && (zVar = this.K3) != null && (this.Yb != null || this.Zb != null)) {
            boolean contains = zVar.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.L3 = contains;
                if (contains) {
                    this.K3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.K3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.L3 && (l1Var = this.Jc) != null) {
                    if (this.A8) {
                        TLRPC.User user = this.f21349ic;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.g2(this, user.f18475id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            l1 l1Var2 = this.Jc;
                            if (publicUsername == null) {
                                publicUsername = this.f21575y7.messageOwner.via_bot_name;
                            }
                            l1Var2.o0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Yb;
                        if (user2 != null) {
                            l1Var.u0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Zb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f21575y7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f21363jc;
                                    i10 = i11;
                                } else {
                                    chat = chat3;
                                    i10 = 0;
                                }
                                if (chat != null) {
                                    chat2 = chat;
                                } else {
                                    chat2 = chat3;
                                }
                                u1Var = this;
                                l1Var.S(u1Var, chat2, i10, this.f21310g1, this.f21324h1, false);
                                u1Var.K3.setState(StateSet.NOTHING);
                                u1Var.L3 = false;
                                return u1Var.L3;
                            }
                        }
                    }
                }
                u1Var = this;
                u1Var.K3.setState(StateSet.NOTHING);
                u1Var.L3 = false;
                return u1Var.L3;
            }
            u1Var = this;
            return u1Var.L3;
        }
        this.L3 = false;
        return false;
    }

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f7;
        MessageObject messageObject2 = this.f21575y7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f21575y7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f21575y7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.l1 != null) {
                if (this.f21394m1 || this.f21410n1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
                    if (groupedMessagePosition != null) {
                        int i10 = groupedMessagePosition.flags;
                        if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y3 = getY() + getPaddingTop();
                    MessageObject.GroupedMessages groupedMessages = this.K;
                    if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                        f7 = (getTop() + this.K.transitionParams.offsetTop) - getTranslationY();
                    } else {
                        f7 = y3 + this.Zc.f21121j0;
                    }
                    canvas.translate(this.I8, f7 + this.f21462qe);
                    this.l1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.Id);
    }

    public final void K3(boolean z10, boolean z11) {
        this.f21387l8 = z10;
        this.f21289e8 = z11;
        s4();
        if (this.F5) {
            this.H5.f29253o = f3();
        } else {
            this.G5.f27017p = f3();
        }
        invalidate();
    }

    public final boolean L0(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Za && this.Ka != null && this.K3 != null && ((this.Yb != null || this.Zb != null) && this.f21264cc != null && this.f21307fc != null)) {
            boolean contains = this.Q3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.R3 = contains;
                if (contains) {
                    this.Q3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.Q3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.R3 && (l1Var = this.Jc) != null && (user = this.Yb) != null) {
                    Drawable drawable = this.f21307fc.f26565f[0];
                    if (drawable instanceof org.telegram.ui.Components.p5) {
                        document = ((org.telegram.ui.Components.p5) drawable).e;
                    } else {
                        document = null;
                    }
                    l1Var.U1(this, user, document, this.ec);
                    a3();
                }
                this.Q3.setState(StateSet.NOTHING);
                this.R3 = false;
            }
            return this.R3;
        }
        this.R3 = false;
        return false;
    }

    public final void L1(Canvas canvas, boolean z10, boolean z11, float f7, float f10, float f11, float f12, float f13, boolean z12) {
        boolean z13;
        float dp;
        int i10;
        int v02;
        float f14;
        float f15;
        float f16;
        int i11 = 0;
        if (f13 != 1.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        float f17 = (f13 * 0.5f) + 0.5f;
        float f18 = f10 * f13;
        t1 t1Var = this.Zc;
        zg.p0 p0Var = this.N;
        if (z10) {
            if (!this.f21575y7.isOutOwner()) {
                rc0 rc0Var = org.telegram.ui.ActionBar.j6.E3;
                if (f4()) {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19394tc, this.Id);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.j6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19394tc;
                    }
                    v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.Id);
                }
                rc0Var.a(v02);
                if (f4()) {
                    f15 = (getPhotoBottom() + this.f21495t0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float dp2 = (f7 - AndroidUtilities.dp(f14)) + f11;
                    if (this.f21461qd) {
                        if (this.J) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        float i12 = p0Var.i(t1Var.K1);
                        f15 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (i12 + AndroidUtilities.dp(f16)));
                    } else {
                        f15 = dp2;
                    }
                }
                if (!this.f21575y7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                a0.p(rc0Var, f12 + i11, f15 - AndroidUtilities.dp(12.0f));
                rc0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, rc0Var.getBounds().centerX(), rc0Var.getBounds().centerY());
                }
                rc0Var.draw(canvas);
                rc0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f21575y7.isOutOwner()) {
            if (!this.f21575y7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f21495t0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                dp = (f7 - AndroidUtilities.dp(f20)) + f11;
                if (this.f21461qd) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(t1Var.K1);
                }
            }
            RectF rectF = this.f21258c5;
            rectF.set(f19, dp, AndroidUtilities.dp(14.0f) + f19, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.j6.f19053b2.getAlpha();
            int i13 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.j6.f19053b2.setAlpha(i13);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.f19053b2);
            org.telegram.ui.ActionBar.j6.f19053b2.setAlpha(alpha);
            Drawable L2 = L2("drawableMsgError");
            a0.p(L2, f19 + AndroidUtilities.dp(6.0f), dp + AndroidUtilities.dp(2.0f));
            L2.setAlpha(i13);
            L2.draw(canvas);
            L2.setAlpha(255);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final Drawable L2(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            drawable = f6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    public final void L3(boolean z10, boolean z11, boolean z12) {
        MessageObject messageObject;
        if (z10 || !z12 || (messageObject = this.f21575y7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f21367k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            xa0 xa0Var = this.Kc;
            float f7 = 0.0f;
            if (xa0Var.e == z11) {
                if (xa0Var.f30214f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    xa0Var.d = f7;
                    xa0Var.f30214f = false;
                    return;
                }
                return;
            }
            xa0Var.e = z11;
            xa0Var.f30214f = z12;
            if (z12) {
                xa0Var.f30213c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                xa0Var.d = f7;
            }
            xa0Var.a();
            u1 u1Var = xa0Var.f30220m;
            if (u1Var != null) {
                u1Var.invalidate();
                if (u1Var.getParent() != null) {
                    ((ViewGroup) u1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean M0(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.M0(org.telegram.messenger.MessageObject):boolean");
    }

    public final void M1(Canvas canvas, float f7) {
        if (this.f21519ua == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.Z8 != null) {
                this.Ha -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f10 = this.Ga;
            float f11 = this.Ha + dp;
            RectF rectF = this.f21258c5;
            rectF.set(f10, this.Ha, AndroidUtilities.dp(32.0f) + f10, f11);
            p0();
            String str = "paintChatActionBackground";
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i10 != 0) {
                int alpha = M2("paintChatActionBackground").getAlpha();
                M2("paintChatActionBackground").setAlpha((int) (alpha * f7));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), M2("paintChatActionBackground"));
                M2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.f21564xa) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.j6.f19162h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19162h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19162h2);
                    org.telegram.ui.ActionBar.j6.f19162h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19162h2);
                }
            }
            Drawable O0 = org.telegram.ui.ActionBar.j6.O0("drawableCommentSticker");
            a0.p(O0, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
            if (i10 != 0) {
                O0.setAlpha((int) (f7 * 255.0f));
                O0.draw(canvas);
                O0.setAlpha(255);
            } else {
                O0.draw(canvas);
            }
            if (this.Z8 != null) {
                org.telegram.ui.ActionBar.j6.E2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xc, this.Id));
                org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (f7 * 255.0f));
                t1 t1Var = this.Zc;
                if (t1Var.U) {
                    if (t1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.j6.E2.setAlpha((int) ((1.0d - t1Var.K1) * 255.0d * f7));
                        canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - t1Var.X) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                        t1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (t1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - this.f21332h9) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                this.Z8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            paint = f6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final boolean M3(boolean z10) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        u1 u1Var;
        if (this.f21575y7.isDice()) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof fj0) {
                final fj0 fj0Var = (fj0) drawable;
                String diceEmoji = this.f21575y7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.I7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.I7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f21575y7.getDiceValue();
                if ("🎰".equals(this.f21575y7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        iw0 iw0Var = (iw0) fj0Var;
                        if (iw0Var.U0 != null || iw0Var.V0) {
                            u1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int X = iw0.X(i10 & 3);
                            int X2 = iw0.X((i10 >> 2) & 3);
                            int X3 = iw0.X(i10 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            iw0Var.f25141b1 = X;
                            iw0Var.f25142c1 = X2;
                            iw0Var.f25143d1 = X3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            iw0Var.V0 = true;
                            u1Var = this;
                            Utilities.globalQueue.postRunnable(new ii.r2(iw0Var, stickerSetByEmojiOrName, i11, messageObject, u1Var, z10, 3));
                        }
                        if (u1Var.f21575y7.isOut()) {
                            fj0Var.S(Integer.MAX_VALUE, u1Var.f21321gd);
                        }
                        u1Var.f21575y7.wasUnread = false;
                    } else {
                        u1Var = this;
                    }
                    if (fj0Var.m0 == null && !fj0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        iw0 iw0Var2 = (iw0) fj0Var;
                        if (iw0Var2.m0 == null && !iw0Var2.Y0) {
                            iw0Var2.Y0 = true;
                            Utilities.globalQueue.postRunnable(new ei.l3(iw0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), u1Var, 23));
                            return true;
                        }
                    }
                } else {
                    if (fj0Var.m0 == null && !fj0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.I7).getPathToAttach(document, true);
                        if (fj0Var.m0 == null && !fj0Var.Y0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f21575y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                fj0Var.Y0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final fj0 fj0Var2 = fj0Var;
                                                String str = readRes;
                                                if (fj0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    fj0 fj0Var3 = fj0Var2;
                                                                    fj0Var3.Y0 = false;
                                                                    if (!fj0Var3.V0 && fj0Var3.W0) {
                                                                        fj0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    fj0Var3.l();
                                                                    fj0Var3.I();
                                                                    fj0Var3.x();
                                                                    return;
                                                                default:
                                                                    fj0 fj0Var4 = fj0Var2;
                                                                    fj0Var4.V0 = false;
                                                                    if (!fj0Var4.Y0 && fj0Var4.W0) {
                                                                        fj0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                fj0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (fj0Var2.U0 != null) {
                                                    i12 = fj0Var2.U0.f22343a[0];
                                                }
                                                if (fj0Var2.U0 != null) {
                                                    int i13 = fj0Var2.U0.f22343a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new kd(fj0Var2, i12, 6));
                                                return;
                                            default:
                                                final fj0 fj0Var3 = fj0Var;
                                                fj0Var3.m0 = RLottieNative.b(readRes, fj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                fj0 fj0Var32 = fj0Var3;
                                                                fj0Var32.Y0 = false;
                                                                if (!fj0Var32.V0 && fj0Var32.W0) {
                                                                    fj0Var32.C(true);
                                                                    return;
                                                                }
                                                                fj0Var32.l();
                                                                fj0Var32.I();
                                                                fj0Var32.x();
                                                                return;
                                                            default:
                                                                fj0 fj0Var4 = fj0Var3;
                                                                fj0Var4.V0 = false;
                                                                if (!fj0Var4.Y0 && fj0Var4.W0) {
                                                                    fj0Var4.C(true);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                        }
                                    }
                                });
                            }
                        }
                        DownloadController.getInstance(this.I7).removeLoadingFileObserver(this);
                    }
                    if (diceValue >= 0 && diceValue < stickerSetByEmojiOrName.documents.size()) {
                        if (!z10 && this.f21575y7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.I7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            fj0Var.S(diceFrameSuccess.frame, this.f21321gd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.I7).getPathToAttach(document2, true);
                        if (fj0Var.U0 == null && !fj0Var.V0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f21575y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f21575y7.wasUnread = false;
                            } else {
                                if (z10 && fj0Var.Q == null && fj0Var.R == null && fj0Var.P == null) {
                                    fj0Var.J = 2;
                                    fj0Var.X0 = true;
                                }
                                fj0Var.V0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final fj0 fj0Var2 = fj0Var;
                                                String str = readRes2;
                                                if (fj0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    fj0 fj0Var32 = fj0Var2;
                                                                    fj0Var32.Y0 = false;
                                                                    if (!fj0Var32.V0 && fj0Var32.W0) {
                                                                        fj0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    fj0Var32.l();
                                                                    fj0Var32.I();
                                                                    fj0Var32.x();
                                                                    return;
                                                                default:
                                                                    fj0 fj0Var4 = fj0Var2;
                                                                    fj0Var4.V0 = false;
                                                                    if (!fj0Var4.Y0 && fj0Var4.W0) {
                                                                        fj0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                fj0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (fj0Var2.U0 != null) {
                                                    i12 = fj0Var2.U0.f22343a[0];
                                                }
                                                if (fj0Var2.U0 != null) {
                                                    int i13 = fj0Var2.U0.f22343a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new kd(fj0Var2, i12, 6));
                                                return;
                                            default:
                                                final fj0 fj0Var3 = fj0Var;
                                                fj0Var3.m0 = RLottieNative.b(readRes2, fj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                fj0 fj0Var32 = fj0Var3;
                                                                fj0Var32.Y0 = false;
                                                                if (!fj0Var32.V0 && fj0Var32.W0) {
                                                                    fj0Var32.C(true);
                                                                    return;
                                                                }
                                                                fj0Var32.l();
                                                                fj0Var32.I();
                                                                fj0Var32.x();
                                                                return;
                                                            default:
                                                                fj0 fj0Var4 = fj0Var3;
                                                                fj0Var4.V0 = false;
                                                                if (!fj0Var4.Y0 && fj0Var4.W0) {
                                                                    fj0Var4.C(true);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                        }
                                    }
                                });
                            }
                        }
                        DownloadController.getInstance(this.I7).removeLoadingFileObserver(this);
                        this.f21575y7.wasUnread = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean N0(MotionEvent motionEvent) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        boolean z10;
        Drawable drawable;
        Drawable drawable2;
        int dp;
        int i10;
        int dp2;
        int i11;
        int i12 = this.K1;
        if ((i12 != 5 && i12 != 1) || (groupedMessagePosition = this.L) == null || (groupedMessagePosition.flags & 4) != 0) {
            int i13 = this.f21575y7.type;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f21354j2 && !this.f21368k2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f21527v3;
                if (action == 0) {
                    MessageObject messageObject = this.f21575y7;
                    if (messageObject.type == 16) {
                        boolean isVideoCall = messageObject.isVideoCall();
                        int i14 = this.S4;
                        if (x10 >= i14) {
                            if (LocaleController.isRTL) {
                                dp = 0;
                            } else {
                                dp = this.J8 - AndroidUtilities.dp(70.0f);
                            }
                            int i15 = i14 + dp;
                            if (!isVideoCall) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            if (x10 <= AndroidUtilities.dp(i10 + 30) + i15 && z22 >= this.T4 - AndroidUtilities.dp(14.0f)) {
                                if (z22 <= AndroidUtilities.dp(50.0f) + this.T4) {
                                    this.Z4 = true;
                                    this.f21557x3[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i16 = this.S4;
                                        if (LocaleController.isRTL) {
                                            dp2 = 0;
                                        } else {
                                            dp2 = this.J8 - AndroidUtilities.dp(70.0f);
                                        }
                                        int i17 = i16 + dp2;
                                        if (!isVideoCall) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int dp3 = AndroidUtilities.dp(i11) + i17;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.G4;
                                        int d = c1.d(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int A = rk.A(2, this.T4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(d - AndroidUtilities.dp(20.0f), A - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + d, AndroidUtilities.dp(20.0f) + A);
                                        drawableArr[0].setHotspot(x10, z22);
                                        drawableArr[0].setState(this.A3);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.S4 - AndroidUtilities.dp(20.0f)) {
                        if (x10 <= AndroidUtilities.dp(20.0f) + this.S4 && z22 >= this.T4 - AndroidUtilities.dp(4.0f)) {
                            if (z22 <= AndroidUtilities.dp(30.0f) + this.T4) {
                                this.Z4 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Z4) {
                        if (this.f21575y7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z4 = false;
                        playSoundEffect(0);
                        this.Jc.C0(this, this.S4, this.T4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f21575y7.type == 16 && this.Z4 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                }
            }
        }
        return false;
    }

    public final void N1(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.N1(android.graphics.Canvas, float):void");
    }

    public final float N2(float f7) {
        float f10;
        float f11;
        if (f4() && this.K1 != 7) {
            return ((getPhotoBottom() + this.f21495t0) - AndroidUtilities.dp(7.3f)) - this.f21431ob.getHeight();
        }
        int i10 = this.M8;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f10)) - this.f21431ob.getHeight()) + f7;
        boolean z10 = this.f21461qd;
        t1 t1Var = this.Zc;
        if (z10) {
            if (this.J) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(t1Var.K1) + AndroidUtilities.dp(f11));
        }
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f12 = dp + transitionParams.offsetBottom;
            if (transitionParams.backgroundChangeBounds) {
                return f12 - getTranslationY();
            }
            return f12;
        }
        return (t1Var.f21116i0 - t1Var.f21121j0) + dp;
    }

    public final void N3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            xj0 xj0Var = this.f21351ie;
            t1 t1Var = this.Zc;
            if (xj0Var != null && xj0Var.h) {
                this.f21462qe = 0.0f;
            } else {
                float f7 = i11 + i13 + t1Var.f21116i0;
                this.f21462qe = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + t1Var.f21107g0), (int) (i11 + t1Var.f21121j0), (int) (i10 + i12 + t1Var.f21111h0), (int) (i11 + i13 + t1Var.f21116i0));
        }
    }

    public final boolean O0(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.O0(android.view.MotionEvent):boolean");
    }

    public final void O1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.O1(android.graphics.Canvas):void");
    }

    public final int O2(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((s1) arrayList.get(i11)).f20918t;
                if (todoItem != null && todoItem.f18473id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f21317g8 = true;
        this.f21331h8 = 1000;
        this.f21359j8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        pv0 Y1;
        int intValue;
        l1 l1Var = this.Jc;
        if (l1Var == null) {
            Y1 = null;
        } else {
            Y1 = l1Var.Y1();
        }
        pv0 pv0Var = Y1;
        if (this.f21575y7 != null) {
            ai.l4 l4Var = this.S0;
            if (l4Var.hasNotThumb() && pv0Var != null && !this.f21575y7.isSticker() && !this.f21575y7.isAnimatedEmoji() && ((!this.f21575y7.isVideo() || this.f21416n7) && !this.f21461qd && !this.f21575y7.isAnimatedSticker() && ((!this.f21575y7.isDocument() || this.f21575y7.isGif()) && !this.f21575y7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f21575y7;
                vh.g gVar = this.Fb;
                if (gVar == null) {
                    intValue = 0;
                } else {
                    Integer num = (Integer) gVar.f44698k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    intValue = num.intValue();
                }
                return pv0Var.a(motionEvent, this, l4Var, messageObject, intValue);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.f21257c4 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f21590z7;
        if (messageObject == null) {
            messageObject = this.f21575y7;
        }
        if (messageObject == null) {
            this.f21286e4 = null;
            return;
        }
        xi0 xi0Var = this.f21286e4;
        if (xi0Var == null || !xi0Var.f30274f || !Arrays.equals(xi0Var.f30275g, bArr)) {
            this.f21286e4 = new xi0(this, messageObject.getId(), bArr);
        }
        this.f21569y0 = true;
    }

    public final boolean Q0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.Q0(android.view.MotionEvent):boolean");
    }

    public final void Q1(Canvas canvas) {
        float f7;
        int i10;
        float f10;
        int dp;
        int extraTextX;
        int i11;
        float f11;
        float f12;
        int dp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f13 = 1.0f;
            if (this.N1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            t1 t1Var = this.Zc;
            if (t1Var.R2) {
                f7 = AndroidUtilities.lerp(1.0f - f7, f7, t1Var.K1);
            }
            float f14 = 1.0f * f7;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + t1Var.f21111h0;
            if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.J) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f21439p4;
            } else if (this.f21575y7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f21532v8;
                if (this.f21575y7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f21374k8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f21532v8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f21532v8;
                    if (this.J) {
                        f10 = 12.0f;
                    } else {
                        f10 = 18.0f;
                    }
                    dp = AndroidUtilities.dp(f10) + i12;
                    extraTextX = getExtraTextX();
                }
                i11 = extraTextX + dp;
            }
            int dp4 = ((int) (i11 + t1Var.f21107g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.f21449q0;
            float f15 = dp4;
            int i14 = (int) (dp3 - f15);
            int i15 = this.f21298f2;
            if (t1Var.X2) {
                i15 = AndroidUtilities.lerp(t1Var.T2, i15, t1Var.K1);
            }
            if (this.Z1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (t1Var.Z2) {
                AndroidUtilities.lerp(1.0f - f11, f11, t1Var.K1);
            }
            if (this.f21277da == null) {
                this.f21277da = new cm0(this);
            }
            int o9 = this.f21277da.o(this.Id);
            canvas.save();
            canvas.translate(f15, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            yc ycVar = this.R1;
            if (ycVar != null) {
                f12 = ycVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f21277da.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f21277da.e(canvas, rectF, f14);
            u01 u01Var = this.O1;
            if (u01Var != null) {
                u01Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f14, o9, canvas);
                if (this.P1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.O1.f28493c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.P1.f28493c, AndroidUtilities.dp(21.66f));
                    yc ycVar2 = this.Q1;
                    if (ycVar2 != null) {
                        f13 = ycVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.f21277da.f23351g);
                    this.P1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f14, o9, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f21360j9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f21590z7;
        if (messageObject == null) {
            messageObject = this.f21575y7;
        }
        this.f21569y0 = false;
        ArrayList arrayList = this.A5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.f21257c4 != null && !TextUtils.isEmpty(messageObject.caption)) {
                CharSequence charSequence = messageObject.caption;
                if (charSequence instanceof Spannable) {
                    Spanned spanned = (Spanned) charSequence;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i14 = spanned.getSpanStart(characterStyle);
                                i13 = spanned.getSpanEnd(characterStyle);
                                break;
                            }
                        }
                    }
                    i13 = -1;
                    i14 = -1;
                    if (i14 >= 0 && i13 >= 0) {
                        int i16 = i13 - i14;
                        int i17 = 0;
                        while (i17 < this.f21257c4.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.f21257c4.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f21554x0 = i17;
                                this.f21569y0 = false;
                                G3();
                                try {
                                    e90 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, B3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.f21257c4.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.f21257c4.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            e90 B32 = B3();
                                            B32.d(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                            textLayoutBlock2.textLayout.getSelectionPath(0, i13 - textLayoutBlock2.charactersOffset, B32);
                                        } while (i13 >= (textLayoutBlock.charactersOffset + i15) - 1);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                invalidate();
                                return;
                            }
                            i17++;
                        }
                    }
                }
            }
            CharSequence charSequence2 = messageObject.messageText;
            if ((charSequence2 instanceof Spanned) && messageObject.textLayoutBlocks != null) {
                Spanned spanned2 = (Spanned) charSequence2;
                CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                    for (CharacterStyle characterStyle3 : characterStyleArr2) {
                        if (characterStyle3 == characterStyle) {
                            i11 = spanned2.getSpanStart(characterStyle);
                            i10 = spanned2.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i10 = -1;
                i11 = -1;
                if (i11 >= 0 && i10 >= 0) {
                    int i18 = i10 - i11;
                    int i19 = 0;
                    while (i19 < messageObject.textLayoutBlocks.size()) {
                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i19);
                        if (i11 >= textLayoutBlock3.charactersOffset && i11 < textLayoutBlock3.charactersEnd) {
                            this.f21554x0 = i19;
                            this.f21569y0 = false;
                            G3();
                            try {
                                e90 B33 = B3();
                                B33.d(textLayoutBlock3.textLayout, i11, 0.0f);
                                textLayoutBlock3.textLayout.getSelectionPath(i11, i10, B33);
                                if (i10 >= textLayoutBlock3.charactersOffset + i18) {
                                    do {
                                        i19++;
                                        if (i19 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i19);
                                        i12 = textLayoutBlock4.charactersEnd - textLayoutBlock4.charactersOffset;
                                        e90 B34 = B3();
                                        B34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i10 - textLayoutBlock4.charactersOffset, B34);
                                    } while (i10 >= (textLayoutBlock3.charactersOffset + i12) - 1);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            invalidate();
                            return;
                        }
                        i19++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f21554x0 = -1;
                this.f21569y0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f21554x0 = -1;
            this.f21569y0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        qh.g gVar;
        qh.g gVar2;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            qh.g gVar3 = this.f21245b6;
            if (gVar3 != null) {
                if (gVar3.X && gVar3.f42066a.f14170f && gVar3.K.f(x10 - gVar3.L, z22 - gVar3.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f21297f1 = true;
                    invalidate();
                    return true;
                }
                qh.g gVar4 = this.f21245b6;
                if ((gVar4.X || gVar4.W) && gVar4.j(x10, z22, action)) {
                    this.f21297f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f21575y7.expandedExplanation && (gVar2 = this.f21259c6) != null) {
                if (gVar2.X && gVar2.f42066a.f14170f && gVar2.K.f(x10 - gVar2.L, z22 - gVar2.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f21297f1 = true;
                    invalidate();
                    return true;
                }
                qh.g gVar5 = this.f21259c6;
                if ((gVar5.X || gVar5.W) && gVar5.j(x10, z22, action)) {
                    this.f21297f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.N6 = -1;
                qh.g gVar6 = this.f21245b6;
                if (gVar6 != null && gVar6.S && gVar6.getBounds().contains(x10, z22)) {
                    this.N6 = -2;
                    invalidate();
                    return true;
                } else if (this.f21575y7.expandedExplanation && (gVar = this.f21259c6) != null && gVar.S && gVar.getBounds().contains(x10, z22)) {
                    this.N6 = -3;
                    invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.N6 != -1) {
                    return true;
                }
            } else if (action == 1 && this.N6 != -1) {
                playSoundEffect(0);
                int i10 = this.N6;
                if (i10 == -2) {
                    qh.g gVar7 = this.f21245b6;
                    ImageReceiver imageReceiver = gVar7.f42068b;
                    TLRPC.MessageMedia messageMedia = gVar7.T;
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        l1Var.n(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    qh.g gVar8 = this.f21259c6;
                    ImageReceiver imageReceiver2 = gVar8.f42068b;
                    TLRPC.MessageMedia messageMedia2 = gVar8.T;
                    l1 l1Var2 = this.Jc;
                    if (l1Var2 != null) {
                        l1Var2.n(this, null, messageMedia2, -3);
                    }
                }
                this.N6 = -1;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void R1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.R1(android.graphics.Canvas):void");
    }

    public final boolean R2() {
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            return f6Var.n0();
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    public final void R3(int i10) {
        MessageObject messageObject = this.f21590z7;
        if (messageObject == null) {
            messageObject = this.f21575y7;
        }
        if (messageObject == null) {
            this.f21286e4 = null;
            return;
        }
        xi0 xi0Var = this.f21286e4;
        if (xi0Var == null || !xi0Var.e || xi0Var.f30273c != (-i10)) {
            this.f21286e4 = new xi0(this, messageObject.getId(), i10);
        }
        this.f21569y0 = true;
    }

    public final void S0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.Z5 != null && (messageObject = this.f21575y7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f21575y7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            sh.d dVar = this.Z5;
            if (z11 && SendMessagesHelper.getInstance(this.I7).isSendingVote(this.f21575y7) != null) {
                z12 = true;
            }
            le.b bVar = dVar.f43291f;
            if (bVar.f14170f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f21575y7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f21516u7) {
            return true;
        }
        return false;
    }

    public final void S3(String str) {
        T3(str, false, false, -1);
    }

    public final boolean T0(MotionEvent motionEvent) {
        l1 l1Var;
        int i10;
        u1 u1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (this.C9 == null || (l1Var = this.Jc) == null || !l1Var.m0()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f21575y7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.J9, this.L9) + this.G9;
        } else {
            i10 = this.f21547w8 + this.G9;
        }
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.G9 && x10 <= i10) {
                float f7 = this.H9;
                if (z22 >= f7 && z22 <= f7 + this.I9) {
                    this.Q9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.U9 = x10;
                    this.V9 = getY() + z22;
                    z zVar = this.f21595zc;
                    if (zVar != null) {
                        zVar.setHotspot(x10, z22);
                        this.R9 = false;
                        this.S9 = true;
                        postDelayed(new b1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    yc ycVar = this.f21521uc;
                    if (ycVar != null) {
                        ycVar.c(true);
                        this.xc = x10;
                        this.f21580yc = z22;
                    }
                    q();
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.Q9) {
                    k();
                    this.Q9 = false;
                    z zVar2 = this.f21595zc;
                    if (zVar2 != null) {
                        if (!this.R9) {
                            zVar2.setState(new int[]{16842919, 16842910});
                            post(new b1(5, this));
                        } else {
                            zVar2.setState(new int[0]);
                        }
                        this.R9 = false;
                        this.S9 = false;
                        invalidate();
                    }
                    yc ycVar2 = this.f21521uc;
                    if (ycVar2 != null) {
                        ycVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f21405mc) {
                        l1 l1Var2 = this.Jc;
                        if (l1Var2 != null) {
                            TLRPC.Chat chat = this.f21363jc;
                            if (chat != null) {
                                l1Var2.S(this, chat, this.f21575y7.messageOwner.fwd_from.channel_post, this.f21310g1, this.f21324h1, false);
                                u1Var = this;
                            } else {
                                u1Var = this;
                                TLRPC.User user = u1Var.f21334hc;
                                if (user != null) {
                                    l1Var2.u0(this, user, u1Var.f21310g1, u1Var.f21324h1);
                                } else if (u1Var.f21378kc != null) {
                                    l1Var2.o(this);
                                }
                            }
                        }
                    } else {
                        u1Var = this;
                        if (u1Var.Jc != null && (u1Var.f21575y7.hasValidReplyMessageObject() || u1Var.f21575y7.isReplyToStory() || u1Var.f21577y9 || ((message = u1Var.f21575y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            u1Var.Jc.b2(u1Var, u1Var.f21575y7.getReplyMsgId(), x10, z22, false);
                        }
                    }
                }
            } else {
                u1Var = this;
                if (motionEvent.getAction() == 3) {
                    u1Var.Q9 = false;
                    u1Var.R9 = false;
                    z zVar3 = u1Var.f21595zc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    yc ycVar3 = u1Var.f21521uc;
                    if (ycVar3 != null) {
                        ycVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x10 >= u1Var.G9 && x10 <= i10) {
                        float f10 = u1Var.H9;
                        if (z22 >= f10 && z22 <= f10 + u1Var.I9) {
                            if (u1Var.f21595zc != null && u1Var.S9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - u1Var.V9, 2.0d) + Math.pow(x10 - u1Var.U9, 2.0d)) > 0.75d) {
                                    u1Var.S9 = false;
                                }
                            }
                        }
                    }
                    u1Var.Q9 = false;
                    u1Var.R9 = false;
                    u1Var.S9 = false;
                    z zVar4 = u1Var.f21595zc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    yc ycVar4 = u1Var.f21521uc;
                    if (ycVar4 != null) {
                        ycVar4.c(false);
                    }
                }
            }
            return u1Var.Q9;
        }
        u1Var = this;
        return u1Var.Q9;
    }

    public final void T1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.T1(android.graphics.Canvas, float):void");
    }

    public final boolean T2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.T2():boolean");
    }

    public final boolean T3(java.lang.String r19, boolean r20, boolean r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.T3(java.lang.String, boolean, boolean, int):boolean");
    }

    public final boolean U0(int i10, MotionEvent motionEvent) {
        int i11;
        vh.h hVar;
        int i12;
        int i13;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        int i14;
        int i15;
        int i16;
        int i17;
        MessageObject.GroupedMessages groupedMessages;
        if (i10 > 15 || getParent() == null) {
            return false;
        }
        if (this.f21575y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof u1) {
                    u1 u1Var = (u1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId) {
                        int i19 = currentPosition.flags;
                        if ((i19 & 8) != 0 && (i19 & 1) != 0 && u1Var != this) {
                            motionEvent.offsetLocation(getLeft() - u1Var.getLeft(), getTop() - u1Var.getTop());
                            boolean U0 = u1Var.U0(i10 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - u1Var.getLeft()), -(getTop() - u1Var.getTop()));
                            return U0;
                        }
                    }
                }
            }
        }
        if (this.f21561x7) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        t1 t1Var = this.Zc;
        if (actionMasked == 0) {
            int i20 = this.f21409n0;
            if (x10 >= i20 && z22 >= (i16 = this.f21464r0)) {
                MessageObject messageObject = this.f21575y7;
                if (x10 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(t1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f21575y7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f21575y7.textLayoutBlocks, t1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f21575y7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (vh.h hVar2 : textLayoutBlock.spoilers) {
                            if (hVar2.getBounds().contains((x10 - this.f21409n0) + i17, (int) ((z22 - this.f21464r0) - textLayoutBlock.textYOffset(this.f21575y7.textLayoutBlocks, t1Var)))) {
                                this.f21546w7 = hVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.f21257c4 != null) {
                float f7 = x10;
                float f10 = this.f21439p4;
                if (f7 >= f10) {
                    float f11 = z22;
                    float f12 = this.f21453q4;
                    if (f11 >= f12 && f7 <= f10 + textLayoutBlocks.textWidth && f11 <= f12 + textLayoutBlocks.textHeight(t1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.f21257c4.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.f21257c4.textLayoutBlocks, t1Var) <= f11; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.f21257c4.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (vh.h hVar3 : textLayoutBlock2.spoilers) {
                                if (hVar3.getBounds().contains((int) ((f7 - this.f21439p4) + i15), (int) ((f11 - this.f21453q4) - textLayoutBlock2.textYOffset(this.f21257c4.textLayoutBlocks, t1Var)))) {
                                    this.f21546w7 = hVar3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f21327h4 == null) {
                return false;
            }
            float f13 = x10;
            float f14 = this.f21231a7;
            if (f13 < f14) {
                return false;
            }
            float f15 = z22;
            float f16 = this.f21246b7;
            if (f15 <= f16 || f13 > f14 + textLayoutBlocks2.textWidth || f15 > f16 + textLayoutBlocks2.textHeight(t1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f21327h4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f21327h4.textLayoutBlocks, t1Var) <= f15; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f21327h4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (vh.h hVar4 : textLayoutBlock3.spoilers) {
                    if (hVar4.getBounds().contains((int) ((f13 - this.f21231a7) + i14), (int) ((f15 - this.f21246b7) - textLayoutBlock3.textYOffset(this.f21327h4.textLayoutBlocks, t1Var)))) {
                        this.f21546w7 = hVar4;
                        return true;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f21546w7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Nd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f21327h4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (vh.h hVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = hVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f21327h4.textLayoutBlocks, t1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f21327h4.textLayoutBlocks, t1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.f21257c4;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (vh.h hVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = hVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.f21257c4.textLayoutBlocks, t1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.f21257c4.textLayoutBlocks, t1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f21575y7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (vh.h hVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = hVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f21575y7.textLayoutBlocks, t1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f21575y7.textLayoutBlocks, t1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.f21258c5;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f21561x7 = true;
            this.f21546w7.f44714q = new b1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f21327h4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f21327h4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (vh.h hVar8 : textLayoutBlock11.spoilers) {
                        hVar8.j((x10 - this.f21231a7) + i13, (z22 - textLayoutBlock11.textYOffset(this.f21327h4.textLayoutBlocks, t1Var)) - this.f21246b7, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.f21257c4;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.f21257c4.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (vh.h hVar9 : textLayoutBlock13.spoilers) {
                        hVar9.j((x10 - this.f21439p4) + i12, (z22 - textLayoutBlock13.textYOffset(this.f21257c4.textLayoutBlocks, t1Var)) - this.f21453q4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f21575y7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f21575y7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (vh.h hVar10 : textLayoutBlock15.spoilers) {
                            hVar10.j((x10 - this.f21409n0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f21575y7.textLayoutBlocks, t1Var)) - this.f21464r0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof vl0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof u1) {
                        u1 u1Var2 = (u1) childAt2;
                        ArrayList arrayList10 = u1Var2.Ld;
                        if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((vh.h) arrayList10.get(0)).f44714q = new oa(6, this, u1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((vh.h) obj).j(hVar.getBounds().centerX(), hVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f21546w7 = null;
            return true;
        }
    }

    public final void U1(float r37, float r38, android.graphics.Canvas r39, java.util.ArrayList r40, float r41, boolean r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.U1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean U2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.U2():boolean");
    }

    public final void U3(float f7, float f10, float f11, float f12) {
        ai.l4 l4Var = this.S0;
        l4Var.setImageCoords(f7, f10, f11, f12);
        int i10 = this.K1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.M4 = (int) (l4Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (l4Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.N4 = imageY;
        int i11 = this.M4;
        int dp = AndroidUtilities.dp(24.0f) + this.N4;
        this.P0.q(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.K4 = (int) com.google.android.gms.internal.vision.e2.A(l4Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f7);
        int A = (int) com.google.android.gms.internal.vision.e2.A(l4Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, l4Var.getImageY());
        this.L4 = A;
        int i12 = this.K4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.L4;
        this.O0.q(i12, A, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.isStakedDice() && !this.Q) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof fj0) {
                fj0 fj0Var = (fj0) drawable;
                if ((fj0Var.m0 != null || fj0Var.Y0) && !this.Q && (i10 = fj0Var.J) != 1 && i10 == 2) {
                    if (!fj0Var.X0) {
                        float t10 = fj0Var.t();
                        if (fj0Var.U0 != null) {
                            t10 = fj0Var.f24678a0 / fj0Var.f24131a1;
                        }
                        if (t10 <= 0.95f) {
                            return;
                        }
                    }
                    this.Q = true;
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        l1Var.E1(this, false);
                    }
                }
            }
        }
    }

    public final void V1(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        int i11;
        Canvas canvas2;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f12 = this.f21464r0;
            t1 t1Var = this.Zc;
            if (t1Var.f21131l2) {
                float f13 = t1Var.f21140n2;
                float f14 = t1Var.K1;
                f7 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f7 = f12;
            }
            if (t1Var.K1 != 1.0f && t1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f21503t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                xj0 xj0Var = this.f21351ie;
                if (xj0Var != null && xj0Var.h) {
                    MessageObject messageObject2 = this.f21575y7;
                    U1(this.f21409n0, f7, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f21409n0, f7, canvas, t1Var.H0, t1Var.N0, false, 1.0f - t1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f21575y7;
                    U1(this.f21409n0, f7, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, t1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f7;
            boolean z10 = t1Var.D1;
            if (z10 && this.f21503t8 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f21496t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, t1Var.K1, this.f21575y7.textHeight(t1Var) * i11, f12);
                    float f16 = t1Var.f21140n2;
                    if (this.f21496t1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.f21575y7.textHeight(t1Var) * i12) * t1Var.K1);
                    f11 = z11;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f21503t8.getBounds());
                if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f17 = rectF.left;
                float f18 = t1Var.f21140n2;
                canvas.clipRect(f17, f18, rectF.right, this.f21575y7.textHeight(t1Var) + f18 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f21575y7;
                U1(this.f21409n0, f10, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - t1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f21503t8.getBounds());
                if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f21464r0, rectF.right, AndroidUtilities.dp(4.0f) + this.f21575y7.textHeight(t1Var) + i10);
                MessageObject messageObject5 = this.f21575y7;
                U1(this.f21409n0, f11, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f21575y7;
            U1(this.f21409n0, f15, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.N.f49431b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void V3(org.telegram.messenger.MessageObject r110, org.telegram.messenger.MessageObject.GroupedMessages r111, boolean r112, boolean r113, boolean r114, boolean r115) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.V3(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean, boolean, boolean):void");
    }

    public final boolean W0(MotionEvent motionEvent) {
        if (!this.ha || this.f21389la == null || this.wc == null || this.Jc == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Cc;
        if (action == 0) {
            if (rectF.contains(x10, z22)) {
                this.wc.c(true);
                z zVar = this.f21376ka;
                if (zVar != null) {
                    zVar.setHotspot(x10, z22);
                    this.f21376ka.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.wc.h && !rectF.contains(x10, z22)) {
                this.wc.c(false);
                z zVar2 = this.f21376ka;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.wc.h) {
                this.Jc.J0(this);
            }
            this.wc.c(false);
            z zVar3 = this.f21376ka;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.wc.c(false);
            z zVar4 = this.f21376ka;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.wc.h;
    }

    public final void W1(android.graphics.Canvas r52, float r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.W1(android.graphics.Canvas, float):void");
    }

    public final boolean W2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void W3(org.telegram.messenger.MessageObject r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.W3(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final boolean X0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.X0(android.view.MotionEvent):boolean");
    }

    public final void X1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.X1(android.graphics.Canvas):void");
    }

    public final boolean X2() {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f21257c4;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                i10++;
                if (!textLayoutBlock.spoilers.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList2 = getMessageObject().textLayoutBlocks;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i11);
                i11++;
                if (!textLayoutBlock2.spoilers.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.M0) {
            V3(messageObject, groupedMessages, z10, z11, z12, z13);
            return;
        }
        this.f21590z7 = messageObject;
        this.A7 = groupedMessages;
        this.C7 = z10;
        this.B7 = z11;
        this.D7 = z12;
        this.E7 = z13;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        s9 z22;
        boolean z10;
        boolean z11;
        int i10;
        int dp;
        int i11;
        int dp2;
        int extraTextX;
        int i12;
        MessageObject.GroupedMessages groupedMessages;
        l1 l1Var = this.Jc;
        if (l1Var != null && (z22 = l1Var.z2()) != null && (z22.b() || z22.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f21575y7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f21575y7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f21353j1 || this.K != null) && (this.K == null || this.Jc.P()))) {
                if (this.f21575y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof u1) {
                                u1 u1Var = (u1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId && (currentPosition.flags & t0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    z22.f20207c = (int) u1Var.f21439p4;
                                    z22.d = (int) u1Var.f21453q4;
                                    z22.b0(u1Var);
                                    if (u1Var == this) {
                                        return z22.N(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - u1Var.getLeft(), getTop() - u1Var.getTop());
                                    boolean N = z22.N(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - u1Var.getLeft()), -(getTop() - u1Var.getTop()));
                                    return N;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f21575y7;
                    if (messageObject != null && !messageObject.preview && this.S1 != null && z2(motionEvent) >= this.f21449q0) {
                        z22.f21072w0 = false;
                        z22.f21074y0 = true;
                        z22.A0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.K;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f21439p4;
                        } else {
                            float f7 = 12.0f;
                            if (this.f21575y7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f21532v8;
                                if (this.f21575y7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f21374k8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f21532v8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f21532v8;
                                    if (!this.J) {
                                        f7 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f7) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Zc.f21107g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.f21449q0;
                        z22.f20207c = (AndroidUtilities.dp(10.0f) + dp3) - this.f21241b2;
                        z22.d = AndroidUtilities.dp(22.0f) + i15;
                    } else if (P2()) {
                        z22.f21072w0 = false;
                        z22.f21074y0 = false;
                        z22.A0 = false;
                        z22.f20207c = (int) this.f21439p4;
                        z22.d = (int) this.f21453q4;
                    } else {
                        MessageObject messageObject2 = this.f21575y7;
                        if (messageObject2 != null && !messageObject2.preview && this.K2 != null && (!this.f21496t1 ? z2(motionEvent) > this.f21423o2 : z2(motionEvent) < this.f21464r0)) {
                            z22.f21072w0 = true;
                            z22.f21074y0 = false;
                            z22.A0 = false;
                            if (this.f21354j2) {
                                i11 = this.f21421o0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f21368k2) {
                                    i10 = this.f21421o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i10 = this.f21421o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i11 = i10 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f21466r2;
                            int i16 = this.f21423o2;
                            z22.f20207c = dp4;
                            z22.d = i16;
                        } else if (z11) {
                            z22.f21072w0 = false;
                            z22.f21074y0 = false;
                            z22.A0 = true;
                            int i17 = this.f21409n0;
                            int i18 = this.f21464r0;
                            z22.f20207c = i17;
                            z22.d = i18;
                        } else {
                            z22.f21072w0 = false;
                            z22.f21074y0 = false;
                            z22.A0 = false;
                            int i19 = this.f21409n0;
                            int i20 = this.f21464r0;
                            z22.f20207c = i19;
                            z22.d = i20;
                        }
                    }
                    z22.b0(this);
                    return z22.N(motionEvent);
                }
            }
        }
        return false;
    }

    public void Y1(android.graphics.Canvas r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.Y1(android.graphics.Canvas):void");
    }

    public final void Y2(int i10, int i11, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i12 = i11 - i10;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i13);
            if (i10 >= textLayoutBlock.charactersOffset && i10 < textLayoutBlock.charactersEnd) {
                this.f21554x0 = i13;
                G3();
                try {
                    e90 B3 = B3();
                    B3.f28801c = true;
                    B3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, B3);
                    B3.a();
                    float f7 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            e90 B32 = B3();
                            B32.f28801c = true;
                            float f10 = f7 + textLayoutBlock2.padTop;
                            B32.d(textLayoutBlock2.textLayout, 0, f10);
                            f7 = f10 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i11 - textLayoutBlock2.charactersOffset, B32);
                            B32.a();
                            if (i11 < (textLayoutBlock.charactersOffset + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.f21569y0) {
                        this.f21317g8 = true;
                        this.f21331h8 = 2500;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.Z3 = -1;
        this.f21228a4 = -1;
    }

    public final void Y3(int i10) {
        this.f21408n = i10;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f21575y7.isSponsored() && this.f21575y7.sponsoredCanReport) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                if (f7 >= this.F2 - AndroidUtilities.dp(6.0f) && f7 <= this.F2 + this.D2 + AndroidUtilities.dp(6.0f)) {
                    float f10 = z22;
                    if (f10 >= this.G2 - AndroidUtilities.dp(2.0f) && f10 <= this.G2 + this.E2 + AndroidUtilities.dp(2.0f)) {
                        yc ycVar = this.I2;
                        if (ycVar != null) {
                            ycVar.c(true);
                        }
                        this.H2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.H2) {
                l1 l1Var = this.Jc;
                if (l1Var != null) {
                    l1Var.R1();
                }
                yc ycVar2 = this.I2;
                if (ycVar2 != null) {
                    ycVar2.c(false);
                }
                playSoundEffect(0);
                this.H2 = false;
            }
        }
        return false;
    }

    public final void Z1(Canvas canvas, RectF rectF) {
        float f7;
        Path path = this.E5;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        ai.l4 l4Var = this.S0;
        float alpha = l4Var.getAlpha();
        if (this.f21575y7.isRoundOnce()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        l4Var.setAlpha(f7 * alpha);
        l4Var.draw(canvas);
        l4Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f21414n5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i10, int i11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        this.J0 = i10;
        this.K0 = i11;
        this.Tc = i11;
        if ((this.f21575y7 != null && R2() && this.f21575y7.shouldDrawWithoutBackground()) || ((f5Var = this.f21503t8) != null && f5Var.f18865a != null)) {
            invalidate();
        }
    }

    @Override
    public final boolean a() {
        MessageObject.GroupedMessages groupedMessages = this.K;
        if ((groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a1(MotionEvent motionEvent) {
        j1 j1Var;
        z zVar;
        if (this.L5 && ((!this.f21477rd || getVideoTranscriptionProgress() > 0.0f || this.G3) && (j1Var = this.M5) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (j1Var.v.contains((int) x10, (int) z22)) {
                    if (action == 0) {
                        j1Var.A = true;
                    }
                    if (j1Var.A && (zVar = j1Var.f28035q) != null) {
                        zVar.setHotspot(x10, z22);
                        j1Var.f28035q.setState(s31.N);
                        j1Var.f28036r.invalidate();
                    }
                    return true;
                }
            } else if (j1Var.A && action == 1) {
                j1Var.m();
                return true;
            } else {
                j1Var.A = false;
            }
        }
        return false;
    }

    public boolean a2(Canvas canvas) {
        org.telegram.ui.Components.c6 animation;
        int i10;
        boolean z10;
        MessageObject messageObject = this.f21575y7;
        ai.l4 l4Var = this.S0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = l4Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = l4Var.draw(canvas);
                } else {
                    z10 = true;
                }
                l4Var.setForceNotMedia(true);
                float alpha = l4Var.getAlpha();
                l4Var.setAlpha(clamp01 * alpha);
                l4Var.draw(canvas);
                l4Var.setAlpha(alpha);
                l4Var.setForceNotMedia(false);
                return z10;
            }
        }
        return l4Var.draw(canvas);
    }

    public final void a3() {
        l1 l1Var = this.Jc;
        if (l1Var != null && l1Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void a4(float f7, float f10, boolean z10) {
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            F0();
            if (z10) {
                invalidate();
            }
        }
        ai.l4 l4Var = this.S0;
        float imageY = f7 - l4Var.getImageY();
        float measuredHeight = f10 - (getMeasuredHeight() - l4Var.getImageY2());
        float imageHeight = l4Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / l4Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21479s = z11;
        l4Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void b(float f7) {
        MessageObject messageObject = this.f21575y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(this.f21575y7, f7);
        q4();
    }

    public final boolean b1() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.type == 17) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) media).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void b2(Canvas canvas, int i10) {
        int i11;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        MessageObject messageObject;
        l1 l1Var = this.Jc;
        int i12 = 0;
        if (l1Var != null) {
            if (!l1Var.d1(1, this)) {
                this.D5 = null;
                ArrayList arrayList = this.C5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.C5.size(); i13++) {
                        n1 n1Var = (n1) this.C5.get(i13);
                        if (!n1Var.f20677a.c()) {
                            n1Var.f20677a.a();
                        }
                    }
                }
            } else {
                CharacterStyle O1 = this.Jc.O1(this);
                if (O1 != this.D5) {
                    this.D5 = O1;
                    o90 o90Var = this.B5;
                    if (o90Var != null) {
                        o90Var.a();
                        this.B5 = null;
                    }
                    o90 o90Var2 = new o90();
                    this.B5 = o90Var2;
                    o90Var2.C = true;
                    e90 e90Var = new e90(0);
                    o90 o90Var3 = this.B5;
                    o90Var3.f26861x = e90Var;
                    o90Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.f20677a = this.B5;
                    obj.f20678b = -3;
                    if (this.C5 == null) {
                        this.C5 = new ArrayList();
                    }
                    this.C5.add(obj);
                    if (this.D5 != null && !r2(obj, e90Var, this.K2, -2) && (((textLayoutBlocks = this.f21257c4) == null || !s2(obj, e90Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f21575y7) != null)) {
                        s2(obj, e90Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.C5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f21575y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Ld;
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Id);
            while (i12 < this.C5.size()) {
                n1 n1Var2 = (n1) this.C5.get(i12);
                if (n1Var2.f20678b == i10) {
                    o90 o90Var4 = n1Var2.f20677a;
                    o90Var4.f(org.telegram.ui.ActionBar.j6.l1(0.85f, v02), org.telegram.ui.ActionBar.j6.l1(2.0f, v02), org.telegram.ui.ActionBar.j6.l1(3.5f, v02), org.telegram.ui.ActionBar.j6.l1(6.0f, v02));
                    o90Var4.draw(canvas);
                    invalidate();
                    if (o90Var4.b()) {
                        this.C5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f21544w5.d <= 0 && this.N.f49445s) {
            MessageObject messageObject = this.f21575y7;
            if (messageObject == null || !messageObject.preview) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b4(int i10, int i11, int i12, float f7, float f10, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        RichMessageLayout richMessageLayout;
        t1 t1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Yd = i10;
        this.f21238ae = i11;
        this.f21252be = i12;
        this.J0 = i13;
        this.K0 = i14;
        this.f21281de = f10;
        this.f21266ce = f7;
        this.Tc = i14;
        this.Uc = i15;
        this.Vc = i16;
        this.Zd = i17;
        if ((!this.f21428o7.isEmpty() || (this.v != null && (messageObject = this.f21575y7) != null && messageObject.type == 27)) && this.Sc != f10) {
            invalidate();
        }
        this.Sc = f10;
        if (i12 != this.K0 || f7 != this.L0) {
            this.L0 = f7;
            this.K0 = i12;
        }
        if (this.f21575y7 != null && R2() && this.f21575y7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f21575y7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f21464r0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f21575y7.textLayoutBlocks.size();
                t1Var = this.Zc;
                if (i21 >= size || this.f21575y7.textLayoutBlocks.get(i21).textYOffset(this.f21575y7.textLayoutBlocks, t1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = -1;
            int i24 = -1;
            int i25 = 0;
            while (i22 < this.f21575y7.textLayoutBlocks.size()) {
                float textYOffset = this.f21575y7.textLayoutBlocks.get(i22).textYOffset(this.f21575y7.textLayoutBlocks, t1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(t1Var) + textLayoutBlock.padBottom;
                float f11 = i20;
                if (Z2(textYOffset, height, f11, i20 + i11)) {
                    if (i23 == -1) {
                        i23 = i22;
                    }
                    i25++;
                    i24 = i22;
                } else if (textYOffset > f11) {
                    break;
                }
                i22++;
            }
            if (this.C0 == i24 && this.D0 == i23 && this.E0 == i25) {
                if (this.f21446pc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f21446pc.f28553a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.f21446pc.f28553a.get(i26);
                        if (t5Var != null && t5Var.f28294n) {
                            float y3 = (0.0f - getY()) - t5Var.f28295r;
                            float y10 = (this.f21408n - getY()) - t5Var.f28295r;
                            Rect rect = t5Var.e;
                            if (rect.bottom >= y3 && rect.top <= y10) {
                                invalidate();
                                break;
                            }
                        }
                        i26++;
                    }
                }
            } else {
                this.C0 = i24;
                this.D0 = i23;
                this.E0 = i25;
                invalidate();
            }
        }
        MessageObject messageObject3 = this.f21575y7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f21464r0;
            int i28 = -1;
            int i29 = -1;
            for (int i30 = 0; i30 < richMessageLayout.blocks.size(); i30++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i30);
                if (richBlock.currVisible || richBlock.prevVisible) {
                    float f12 = richBlock.currY;
                    float f13 = i27 + i11;
                    if (Z2(f12, richBlock.getHeight() + f12, i27, f13)) {
                        if (i28 == -1) {
                            i28 = i30;
                        }
                        i29 = i30;
                    } else if (f12 > f13) {
                        break;
                    }
                }
            }
            if (this.F0 != i28 || this.G0 != i29) {
                this.F0 = i28;
                this.G0 = i29;
                invalidate();
            }
        }
        ArrayList arrayList = this.Y5;
        if (!arrayList.isEmpty()) {
            int i31 = -1;
            int i32 = -1;
            for (int i33 = 0; i33 < arrayList.size(); i33++) {
                s1 s1Var = (s1) arrayList.get(i33);
                int i34 = s1Var.f20903b + this.Lc;
                if (Z2(i34, i34 + s1Var.f20904c, this.Yd, i19 + this.f21238ae)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f21357j6 != i31 || this.f21343i6 != i32) {
                this.f21357j6 = i31;
                this.f21343i6 = i32;
                invalidate();
            }
        }
        if (this.f21578ya) {
            if (Math.abs(this.Ja - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Zd), this.Ha - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        zg.p0 p0Var = this.N;
        int i35 = p0Var.d;
        boolean Z2 = Z2(i35, i35 + p0Var.f49441o, this.Yd, i18 + this.f21238ae);
        if (this.f21385l6 != Z2) {
            this.f21385l6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        this.nc = z10;
        if (z10) {
            this.f21432oc = z11;
        } else {
            this.f21432oc = false;
        }
    }

    public final boolean c1(float f7, int i10) {
        zg.p0 p0Var = this.N;
        if (!p0Var.K) {
            return false;
        }
        float y3 = getY() + p0Var.d;
        if (y3 <= f7 || (y3 + p0Var.f49441o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.c2(android.graphics.Canvas):void");
    }

    public final void c3() {
        if (this.K != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void c4() {
        int i10;
        int i11;
        int i12;
        if (this.f21575y7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.f19292o2;
            int i13 = org.telegram.ui.ActionBar.j6.f19135fc;
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f19456x2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f19311p2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f19329q2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f19347r2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.f19456x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.f19034a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.j6.f19292o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.j6.f19311p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.f19329q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.f19347r2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19171hc, this.Id);
            textPaint8.linkColor = v02;
            textPaint7.linkColor = v02;
            textPaint6.linkColor = v02;
            textPaint5.linkColor = v02;
            textPaint4.linkColor = v02;
            textPaint3.linkColor = v02;
            textPaint2.linkColor = v02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.f19292o2;
            int i14 = org.telegram.ui.ActionBar.j6.ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f19456x2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f19311p2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f19329q2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f19347r2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.j6.f19456x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.j6.f19034a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.j6.f19292o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.j6.f19311p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.j6.f19329q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.j6.f19347r2;
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.Id);
            textPaint16.linkColor = v03;
            textPaint15.linkColor = v03;
            textPaint14.linkColor = v03;
            textPaint13.linkColor = v03;
            textPaint12.linkColor = v03;
            textPaint11.linkColor = v03;
            textPaint10.linkColor = v03;
        }
        if (this.L1 != null) {
            int i15 = this.K1;
            f1 f1Var = this.G5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f21575y7.isOutOwner()) {
                        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19448wb, this.Id);
                        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19465xb, this.Id);
                        int i16 = org.telegram.ui.ActionBar.j6.f19501zb;
                        f1Var.h(v04, v05, org.telegram.ui.ActionBar.j6.v0(i16, this.Id), org.telegram.ui.ActionBar.j6.v0(i16, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19482yb, this.Id));
                    } else if (this.f21325h2 && this.f21234aa != null) {
                        int c10 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19414ud, this.Id), this.f21234aa.h());
                        int c11 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19431vd, this.Id), this.f21234aa.h());
                        int i17 = org.telegram.ui.ActionBar.j6.f19466xd;
                        f1Var.h(c10, c11, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Id), this.f21234aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Id), this.f21234aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19449wd, this.Id), this.f21234aa.h()));
                    } else {
                        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19414ud, this.Id);
                        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19431vd, this.Id);
                        int i18 = org.telegram.ui.ActionBar.j6.f19466xd;
                        f1Var.h(v06, v07, org.telegram.ui.ActionBar.j6.v0(i18, this.Id), org.telegram.ui.ActionBar.j6.v0(i18, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19449wd, this.Id));
                    }
                }
            } else {
                boolean isOutOwner = this.f21575y7.isOutOwner();
                vo0 vo0Var = this.H5;
                if (isOutOwner) {
                    int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ab, this.Id);
                    int v09 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cb, this.Id);
                    int v010 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bb, this.Id);
                    vo0Var.f29254p = v08;
                    vo0Var.f29255q = v09;
                    vo0Var.f29256r = v010;
                    int v011 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19448wb, this.Id);
                    int v012 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19465xb, this.Id);
                    int i19 = org.telegram.ui.ActionBar.j6.f19501zb;
                    f1Var.h(v011, v012, org.telegram.ui.ActionBar.j6.v0(i19, this.Id), org.telegram.ui.ActionBar.j6.v0(i19, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19482yb, this.Id));
                } else if (this.f21325h2 && this.f21234aa != null) {
                    int c12 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19484yd, this.Id), this.f21234aa.h());
                    int c13 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Id), this.f21234aa.h());
                    int c14 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19503zd, this.Id), this.f21234aa.h());
                    vo0Var.f29254p = c12;
                    vo0Var.f29255q = c13;
                    vo0Var.f29256r = c14;
                    int c15 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19414ud, this.Id), this.f21234aa.h());
                    int c16 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19431vd, this.Id), this.f21234aa.h());
                    int i20 = org.telegram.ui.ActionBar.j6.f19466xd;
                    f1Var.h(c15, c16, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Id), this.f21234aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Id), this.f21234aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19449wd, this.Id), this.f21234aa.h()));
                } else {
                    int v013 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19484yd, this.Id);
                    int v014 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Id);
                    int v015 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19503zd, this.Id);
                    vo0Var.f29254p = v013;
                    vo0Var.f29255q = v014;
                    vo0Var.f29256r = v015;
                    int v016 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19414ud, this.Id);
                    int v017 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19431vd, this.Id);
                    int i21 = org.telegram.ui.ActionBar.j6.f19466xd;
                    f1Var.h(v016, v017, org.telegram.ui.ActionBar.j6.v0(i21, this.Id), org.telegram.ui.ActionBar.j6.v0(i21, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19449wd, this.Id));
                }
            }
        }
        MessageObject messageObject = this.f21575y7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.j6.T2;
            int v018 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, this.Id);
            if (f3()) {
                if (this.f21575y7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.j6.nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f19302od;
                }
            } else if (this.f21575y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.f19375sb;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f19284nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), v018, org.telegram.ui.ActionBar.j6.v0(i12, this.Id)));
        } else if (this.f21374k8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, this.Id));
            } else {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19229kd, this.Id));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.j6.nb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f19375sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.Id));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.j6.f19302od;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19284nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.Id));
        }
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        o0 o0Var = this.v;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    @Override
    public final void d(float f7) {
        MessageObject messageObject = this.f21575y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f7);
        q4();
    }

    public final boolean d1() {
        return FileLoader.getInstance(this.I7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f7, Integer num) {
        boolean z10;
        boolean z11 = this.f21461qd;
        float f10 = 1.0f;
        zg.p0 p0Var = this.N;
        if (z11) {
            p0Var.f49430a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f21385l6 && V2()) {
            if (p0Var.f49430a > 0.0f) {
                p0();
            }
            if (getAlpha() * f7 != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f7 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = p0Var.f49430a;
            t1 t1Var = this.Zc;
            if (f11 <= 0.0f && t1Var.f21173w0 && this.L == null && !this.f21461qd) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + t1Var.f21116i0);
                p0Var.D = 0.0f;
                p0Var.E = false;
                if (t1Var.f21106g) {
                    f10 = t1Var.K1;
                }
                p0Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                p0Var.D = 0.0f;
                p0Var.E = false;
                if (t1Var.f21106g) {
                    f10 = t1Var.K1;
                }
                p0Var.d(canvas, f10, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final boolean d3() {
        return this.M0;
    }

    public final boolean d4() {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if ((groupedMessagePosition == null || ((groupedMessages = this.K) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Zc.f21173w0) {
                if (!this.f21553x || !this.f21575y7.isVoice()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject messageObject;
        if (i10 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i10 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            TLRPC.User user = this.Yb;
            if (user != null && user.f18475id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f21575y7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f21575y7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                X3(messageObject, this.K, this.F, this.E, this.G, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f21575y7.isVideo();
        ai.l4 l4Var = this.S0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                l4Var.setAllowStartAnimation(false);
                l4Var.stopAnimation();
                return;
            }
            l4Var.setAllowStartAnimation(true);
            l4Var.startAnimation();
            return;
        }
        if (z10) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        l4Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            l4Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            l4Var.startAnimation();
        } else {
            l4Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f21461qd;
        float f7 = 1.0f;
        zg.p0 p0Var = this.N;
        if (z10) {
            p0Var.f49430a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f21385l6 || !V2()) {
            return false;
        }
        if (p0Var.f49430a > 0.0f) {
            p0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        float f10 = p0Var.f49430a;
        t1 t1Var = this.Zc;
        if (f10 <= 0.0f && t1Var.f21173w0 && this.L == null && !this.f21461qd) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + t1Var.f21116i0);
            if (t1Var.f21106g) {
                f7 = t1Var.K1;
            }
            p0Var.e(canvas, f7);
            canvas.restore();
        } else {
            if (t1Var.f21106g) {
                f7 = t1Var.K1;
            }
            p0Var.e(canvas, f7);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f21575y7.messageOwner).period;
        int currentTime = ConnectionsManager.getInstance(this.I7).getCurrentTime();
        if (i10 == Integer.MAX_VALUE) {
            return false;
        }
        if (i10 % 60 == 0) {
            if (Math.abs(currentTime - messageObject.messageOwner.date) <= i10) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - messageObject.messageOwner.date) <= i10 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean e4() {
        if ((this.K == null || (this.L.flags & 4) != 0) && !this.f21325h2) {
            MessageObject messageObject = this.f21575y7;
            if (messageObject != null) {
                if (!messageObject.isRepostPreview && !messageObject.isSponsored()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        l1 l1Var = this.Jc;
        if (l1Var != null) {
            l1Var.t2(this, reactionCount, z10, f7, f10);
        }
    }

    public final void f2(Canvas canvas, RichMessageLayout richMessageLayout, float f7, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (richMessageLayout != null && f7 > 0.0f && richMessageLayout.hasOverlay()) {
            if (f7 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f21409n0, this.f21464r0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f21387l8) || ((!this.f21387l8 && this.f21289e8) || this.f21303f8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f21575y7;
            if (messageObject == null || !messageObject.preview) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.f4():boolean");
    }

    public final int g1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        ai.l4 l4Var = this.S0;
        l4Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f21402m9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.F9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f21473r9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f21567xe = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f21300f4)) {
                        n4();
                        this.f21567xe = (int) (i10 + this.f21453q4);
                        this.f21582ye = this.f21257c4;
                    }
                    i10 = this.f21480s0 + this.f21509u0 + i10;
                }
            }
            return i10;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        l4Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f21480s0 + this.f21509u0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f21353j1 && !this.f21317g8 && !this.f21303f8) {
            return false;
        }
        return true;
    }

    public final void g4(int i10, boolean z10, boolean z11) {
        float f7;
        float f10 = 0.0f;
        if (i10 == -1 || i10 == 0) {
            if (this.X6 != z10) {
                this.X6 = z10;
                if (!z11) {
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    this.Y6 = f7;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i10 != -1 && i10 != 1) || this.f21386l7 == z10) {
            return;
        }
        this.f21386l7 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f21400m7 = f10;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new r1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.ne;
    }

    @Override
    public float getAlpha() {
        if (this.Xc) {
            return this.Yc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.y5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.getAnimatedEmojiSpans():org.telegram.ui.Components.y5[]");
    }

    public float getAnimationOffsetX() {
        return this.Ae;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f21429o8) {
            return this.f21402m9;
        }
        return null;
    }

    public xa0 getBackgroundDrawable() {
        return this.Kc;
    }

    public int getBackgroundDrawableBottom() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        int i11 = 0;
        if (groupedMessagePosition != null) {
            int i12 = 4;
            if ((groupedMessagePosition.flags & 4) == 0) {
                i10 = AndroidUtilities.dp(3.0f);
            } else {
                i10 = 0;
            }
            if ((this.L.flags & 8) == 0) {
                MessageObject messageObject = this.f21575y7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i12 = 3;
                }
                i10 += AndroidUtilities.dp(i12);
            }
        } else {
            i10 = 0;
        }
        boolean z10 = this.J;
        if (!z10 || !this.I) {
            if (z10) {
                i11 = AndroidUtilities.dp(1.0f);
            } else {
                i11 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.M8) - i11) + i10;
        if (!this.f21374k8) {
            if (this.I) {
                backgroundDrawableTop += AndroidUtilities.dp(1.0f);
            }
            if (this.J) {
                return AndroidUtilities.dp(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int dp;
        int i10;
        MessageObject messageObject = getMessageObject();
        int i11 = 0;
        float f7 = 9.0f;
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.f21461qd) {
                return (this.L8 - this.J8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.L8 - this.J8;
            if (this.f21374k8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f21461qd) {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f21429o8) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f21429o8) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (!this.f21374k8) {
                f7 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f7);
        }
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.L.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f21461qd) {
            if (this.J) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f21374k8 && this.J) {
            return AndroidUtilities.dp(6.0f) + dp;
        }
        return dp;
    }

    public int getBackgroundDrawableRight() {
        int dp;
        int i10;
        int backgroundDrawableLeft;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11 = this.J8;
        if (this.f21461qd) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.J && (messageObject2 = this.f21575y7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.J && ((messageObject = this.f21575y7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f21374k8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f21374k8 && this.J) {
                i10 -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i10;
    }

    public int getBackgroundDrawableTop() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        int i11 = 0;
        if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) == 0) {
            i10 = 0 - AndroidUtilities.dp(3.0f);
        } else {
            i10 = 0;
        }
        if (!this.I) {
            i11 = AndroidUtilities.dp(1.0f);
        }
        int i12 = i10 + i11;
        if (!this.f21374k8 && this.I) {
            return i12 - AndroidUtilities.dp(1.0f);
        }
        return i12;
    }

    public int getBackgroundHeight() {
        return this.Tc;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.T0;
    }

    public int getBottomActionPadding() {
        t1 t1Var = this.Zc;
        if (t1Var.B1) {
            return AndroidUtilities.lerp(t1Var.A1, this.f21267d0, t1Var.K1);
        }
        return this.f21267d0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i10;
        int i11;
        float f7;
        int dp;
        int i12;
        float f10;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f21575y7;
                if (messageObject2 != null && messageObject2.isRepostPreview) {
                    i12 = 42;
                } else {
                    i12 = 63;
                }
                f10 = i12;
            }
            i10 = AndroidUtilities.dp(f10);
        } else {
            i10 = 0;
        }
        if (z10 && (M0(this.f21575y7) || this.L5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f21428o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f21575y7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f21532v8;
                if (!this.f21374k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f7);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((e0) arrayList.get(i15)).f20157c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f21282e0 != null) {
            backgroundDrawableLeft = Math.min(this.I8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int dp;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f21575y7) || this.L5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f21428o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f21575y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f21532v8;
                if (!this.f21374k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i11 + AndroidUtilities.dp(f7);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                float f10 = widthForButtons;
                i12 = Math.max(i12, ((int) (e0Var.f20157c * f10)) + dp + ((int) (e0Var.e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f21282e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.f21257c4;
    }

    public float getCaptionX() {
        t1 t1Var = this.Zc;
        if (t1Var.f21173w0) {
            if (t1Var.C0) {
                this.f21439p4 += t1Var.f21107g0;
            } else if (t1Var.f21158s0) {
                float f7 = this.f21439p4;
                float f10 = t1Var.K1;
                this.f21439p4 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, t1Var.f21150q0, f7 * f10);
            } else if (!this.f21575y7.isVoice() || !TextUtils.isEmpty(this.f21575y7.caption)) {
                this.f21439p4 += t1Var.f21107g0;
            }
        }
        return this.f21439p4;
    }

    public float getCaptionY() {
        float f7 = this.f21453q4;
        t1 t1Var = this.Zc;
        if (t1Var.f21173w0) {
            if (t1Var.C0) {
                return f7 - getTranslationY();
            }
            if (t1Var.f21158s0) {
                float f10 = t1Var.K1;
                return com.google.android.gms.internal.vision.e2.z(1.0f, f10, t1Var.f21154r0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f21450q1;
    }

    public int getChecksX() {
        float f7;
        int i10 = this.L8;
        if (SharedConfig.bubbleRadius >= 10) {
            f7 = 27.3f;
        } else {
            f7 = 25.3f;
        }
        return i10 - AndroidUtilities.dp(f7);
    }

    public int getChecksY() {
        float f7;
        int intrinsicHeight;
        if (this.f21575y7.shouldDrawWithoutBackground()) {
            f7 = this.nb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f7 = this.nb;
            intrinsicHeight = org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight();
        }
        return (int) (f7 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.f5 f5Var = this.f21503t8;
        if (f5Var == null) {
            return 0;
        }
        int i10 = f5Var.getBounds().left;
        if (!this.f21575y7.isOutOwner() && this.Zc.f21185z0 != 1.0f) {
            boolean z10 = this.f21461qd;
            if ((z10 || !this.f21374k8) && !this.J) {
                if (z10) {
                    return (int) (i10 - (getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)));
                }
                return i10 - AndroidUtilities.dp(6.0f);
            }
            return i10;
        }
        return i10;
    }

    public int getCurrentBackgroundRight() {
        boolean z10;
        org.telegram.ui.ActionBar.f5 f5Var = this.f21503t8;
        if (f5Var == null) {
            return getWidth();
        }
        int i10 = f5Var.getBounds().right;
        if (this.f21575y7.isOutOwner() && this.Zc.f21185z0 != 1.0f && (((z10 = this.f21461qd) || !this.f21374k8) && !this.J)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)) + i10);
            }
            return AndroidUtilities.dp(6.0f) + i10;
        }
        return i10;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.Zb;
    }

    public MessageObject.GroupedMessages getCurrentMessagesGroup() {
        return this.K;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return this.L;
    }

    public TLRPC.User getCurrentUser() {
        return this.Yb;
    }

    public l1 getDelegate() {
        return this.Jc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Zc.f21116i0;
    }

    public float getDeltaLeft() {
        return this.Zc.f21107g0;
    }

    public float getDeltaRight() {
        return this.Zc.f21111h0;
    }

    public float getDeltaTop() {
        return this.Zc.f21121j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f7;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z10 = this.f21354j2;
        float f10 = 0.0f;
        t1 t1Var = this.Zc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f21421o0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f21368k2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f21421o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f21575y7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f21421o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.f21575y7.isOutOwner()) {
                    f7 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f21532v8;
                    if (this.f21575y7.type == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.J9, this.L9) + f7) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f21374k8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f21532v8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f21532v8;
                        if (!this.J) {
                            f11 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f7 = extraTextX + dp;
                }
                dp2 = (f7 + t1Var.f21107g0) - AndroidUtilities.dp(1.33f);
                float f12 = this.f21435p0;
                if (t1Var.f21156r2) {
                    AndroidUtilities.lerp(t1Var.f21152q2, f12, t1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (t1Var != null) {
            f10 = t1Var.f21111h0;
        }
        float f13 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.f21575y7.isOutOwner() && !this.f21374k8 && !this.J) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f13 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f21497t2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f21482s2) - this.f21497t2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f7;
        float f10 = this.f21423o2;
        t1 t1Var = this.Zc;
        if (!t1Var.f21156r2) {
            f7 = (-t1Var.f21121j0) + t1Var.f21116i0;
        } else {
            f7 = 0.0f;
        }
        return f10 + f7;
    }

    public StaticLayout getDescriptionlayout() {
        return this.K2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f21575y7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f21327h4;
    }

    public float getExplanationX() {
        return this.f21231a7;
    }

    public float getExplanationY() {
        return this.f21246b7;
    }

    public int getExtraInsetHeight() {
        float f7;
        int i10;
        int i11 = this.f21499t4;
        boolean z10 = this.N1;
        zg.p0 p0Var = this.N;
        if (z10) {
            if (p0Var.f49445s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f21298f2;
        }
        if (this.f21360j9) {
            if (f4()) {
                f7 = 41.3f;
            } else {
                f7 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f7);
        }
        if (!p0Var.f49445s && this.f21575y7.shouldDrawReactionsInLayout()) {
            return i11 + p0Var.f49442p;
        }
        return i11;
    }

    public int getExtraTextX() {
        int i10 = SharedConfig.bubbleRadius;
        if (i10 >= 15) {
            return AndroidUtilities.dp(2.0f);
        }
        if (i10 >= 11) {
            return AndroidUtilities.dp(1.0f);
        }
        return 0;
    }

    public StaticLayout getFactCheckLayout() {
        return this.S1;
    }

    public String getFilename() {
        int i10;
        int i11;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f21287e5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f21287e5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f21575y7.messageOwner.attachPath;
                }
                if (this.f21575y7.isSendError() && (i10 = this.K1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f21575y7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f7;
        TLRPC.User user = this.Yb;
        if (user != null && user.f18475id == 0) {
            f7 = this.f21402m9.getCenterX();
        } else {
            f7 = this.f21348ib + this.H1;
        }
        return (int) f7;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f21310g1;
    }

    public float getLastTouchY() {
        return this.f21324h1;
    }

    public int getLayoutHeight() {
        return this.M8;
    }

    public int getMaxNameWidth() {
        int min;
        int dp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i10;
        int i11;
        float f7;
        int dp2;
        int parentWidth;
        int i12 = this.K1;
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f21575y7).type) != 5) {
            MessageObject.GroupedMessages groupedMessages = this.K;
            int i13 = 0;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = getParentWidth();
                }
                i11 = 0;
                for (int i14 = 0; i14 < this.K.posArray.size(); i14++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.K.posArray.get(i14);
                    if (groupedMessagePosition.minY != 0) {
                        break;
                    }
                    i11 = (int) (Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * parentWidth) + i11);
                }
                if (this.F8) {
                    i13 = 71;
                } else if (z3()) {
                    i13 = 48;
                }
                dp2 = AndroidUtilities.dp(i13 + 31);
            } else if (i10 == 19) {
                int i15 = messageObject2.textWidth;
                int dp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f);
                if (this.f21429o8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.J8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f21575y7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f21374k8) {
                    f7 = 22.0f;
                } else {
                    f7 = 31.0f;
                }
                dp2 = AndroidUtilities.dp(f7);
            }
            return i11 - dp2;
        }
        float f10 = 0.0f;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            if (this.F8) {
                f10 = 71.0f;
            } else if (z3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        } else {
            min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
            if (this.F8) {
                f10 = 71.0f;
            } else if (z3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        int i16 = min - dp;
        MessageObject messageObject3 = this.f21575y7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f21575y7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.f21477rd && ((messageObject = this.f21575y7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.J8 - (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.F8 && (this.f21575y7.type == 5 || this.K1 == 6)) {
            return this.J8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.J8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        t1 t1Var = this.Zc;
        if (t1Var.Z1) {
            return AndroidUtilities.lerp(t1Var.Y1, this.f21411n2, t1Var.K1);
        }
        return this.f21411n2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f21590z7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f21575y7;
    }

    public int getNameStatusX() {
        int i10;
        float f7 = this.Wa + this.Va;
        int i11 = this.f21591z8;
        if (i11 > 0) {
            i10 = i11 - AndroidUtilities.dp(32.0f);
        } else {
            i10 = this.La;
        }
        return (int) (f7 + i10 + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f7 = this.Xa;
        StaticLayout staticLayout = this.Ka;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f7 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.G1;
    }

    @Override
    public int getObserverTag() {
        return this.H7;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.V + this.f21323h0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f21575y7;
        if (messageObject == null) {
            messageObject = this.f21590z7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.J0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        l4 l4Var = this.F7;
        if (l4Var != null) {
            return l4Var.e + l4Var.h;
        }
        return this.S0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.S0;
    }

    public ArrayList<s1> getPollButtons() {
        return this.Y5;
    }

    public float getPollButtonsLeft() {
        int dp;
        if (getMessageObject() != null && getMessageObject().isOutOwner()) {
            dp = (AndroidUtilities.dp(3.0f) + this.L8) - this.J8;
        } else if (this.G8) {
            dp = AndroidUtilities.dp(82.0f);
        } else if (z3()) {
            dp = AndroidUtilities.dp(59.0f);
        } else {
            dp = AndroidUtilities.dp(11.0f);
        }
        return dp;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.J8) - AndroidUtilities.dp(15.0f);
    }

    public MessageObject getPrimaryMessageObject() {
        MessageObject messageObject;
        MessageObject messageObject2 = this.f21575y7;
        if (messageObject2 != null && this.K != null && messageObject2.hasValidGroupId()) {
            messageObject = this.K.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f21575y7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.O0;
    }

    public zg.p0 getReactionsLayout() {
        return this.N;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.Id;
    }

    public vo0 getSeekBarWaveform() {
        return this.H5;
    }

    public float getSideButtonStartX() {
        return this.Ga;
    }

    public float getSideButtonStartY() {
        return this.Ha;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.f21597ze;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j3;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null) {
            ArrayList<MessageObject> arrayList = groupedMessages.messages;
            int size = arrayList.size();
            int i10 = 0;
            long j10 = 0;
            while (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                    j3 = message2.paid_message_stars;
                } else {
                    j3 = 0;
                }
                j10 += j3;
            }
            return j10;
        }
        MessageObject messageObject3 = this.f21575y7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        t1 t1Var = this.Zc;
        if (t1Var.f21182y1) {
            return AndroidUtilities.lerp(t1Var.f21178x1, this.V, t1Var.K1);
        }
        return this.V;
    }

    public TLRPC.Document getStreamingMedia() {
        int i10 = this.K1;
        if (i10 != 4 && i10 != 7 && i10 != 2) {
            return null;
        }
        return this.L1;
    }

    public int getTextX() {
        return this.f21409n0;
    }

    public int getTextY() {
        return this.f21464r0;
    }

    public float getTimeAlpha() {
        return this.f21398m5;
    }

    public float getTimeX() {
        int i10;
        t1 t1Var = this.Zc;
        if (t1Var.f21112h1) {
            i10 = AndroidUtilities.lerp(t1Var.f21108g1, this.f21475rb, t1Var.K1);
        } else {
            i10 = this.f21475rb;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (f4()) {
            if (this.f21360j9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f21575y7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.K8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f21360j9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f21411n2 + this.Lc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        t1 t1Var = this.Zc;
        if (t1Var.f21167u1) {
            return AndroidUtilities.lerp(t1Var.f21163t1, this.f21296f0, t1Var.K1);
        }
        return this.f21296f0;
    }

    public t1 getTransitionParams() {
        return this.Zc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        t1 t1Var = this.Zc;
        if (t1Var == null || (messageObject = this.f21575y7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (t1Var.l1) {
            if (this.f21456q8) {
                return t1Var.K1;
            }
            return 1.0f - t1Var.K1;
        } else if (this.f21456q8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Sc;
    }

    public int getWidthForButtons() {
        t1 t1Var = this.Zc;
        if (t1Var.N1) {
            return AndroidUtilities.lerp(t1Var.O1, this.f21487s7, t1Var.K1);
        }
        return this.f21487s7;
    }

    @Override
    public final boolean h() {
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) != 0) {
                return this.E;
            }
            return true;
        }
        return this.E;
    }

    public final void h1(u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        u1Var.N7 = this.N7;
        u1Var.f21232a8 = this.f21232a8;
        u1Var.P7 = this.P7;
        u1Var.Q7 = this.Q7;
        u1Var.R7 = this.R7;
        u1Var.S7 = this.S7;
        u1Var.T7 = this.T7;
        u1Var.U7 = this.U7;
        u1Var.V7 = this.V7;
        u1Var.W7 = this.W7;
        u1Var.X7 = this.X7;
        u1Var.Y7 = this.Y7;
        u1Var.f21247b8 = this.f21247b8;
        u1Var.f21261c8 = this.f21261c8;
        u1Var.f21275d8 = this.f21275d8;
        u1Var.E8 = this.E8;
        u1Var.F8 = this.F8;
        u1Var.G8 = this.G8;
        u1Var.H8 = this.H8;
        u1Var.I8 = this.I8;
    }

    public final void h2(Canvas canvas, Integer num, float f7, boolean z10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        zg.p0 p0Var = this.N;
        if (!p0Var.f49431b) {
            p0Var.D = f7;
            p0Var.E = z10;
            p0Var.d(canvas, this.Zc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f21590z7 != null) {
            return this.D7;
        }
        return this.G;
    }

    public final void h4() {
        ai.l4 l4Var = this.S0;
        i4((l4Var.getImageWidth() / 2.0f) + l4Var.getImageX(), (l4Var.getImageHeight() / 2.0f) + l4Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f21432oc;
    }

    public final void i1(u1 u1Var) {
        vh.g gVar;
        if (u1Var != null && (gVar = u1Var.Fb) != null) {
            int i10 = (Integer) gVar.f44698k.get(u1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Gb = i10;
            vh.g gVar2 = this.Fb;
            if (gVar2 != null) {
                gVar2.f44698k.put(this, i10);
            }
        }
    }

    public final void i2(rm rmVar, Canvas canvas, int i10, Integer num, float f7) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        zg.p0 p0Var = this.N;
        if (!p0Var.f49431b) {
            p0Var.D = f7;
            p0Var.f(rmVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f7) {
        if (this.f21503t8 != null) {
            int i10 = this.f21532v8;
            if (f7 >= i10 && f7 <= i10 + this.f21547w8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f7, float f10) {
        u1 u1Var;
        ai.l4 l4Var = this.S0;
        this.Eb = (float) Math.sqrt(Math.pow(l4Var.getImageHeight(), 2.0d) + Math.pow(l4Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f21575y7;
        if (!messageObject.isMediaSpoilersRevealed && this.Bb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                u1Var = this;
                u1Var.V3(messageObject, this.K, this.F, this.E, this.G, this.H);
                MessageObject messageObject2 = u1Var.f21575y7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (u1Var.K != null) {
                    u1Var.O0.o(0.0f, false);
                }
            } else {
                u1Var = this;
            }
            u1Var.Cb = f7;
            u1Var.Db = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.q.a(u1Var.Eb * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(qr.f27645j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.f21575y7 == null) {
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f21393le;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f21407me;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.J7 || (this.K != null && b3())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Od || (l1Var = this.Jc) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.K != null) {
            c3();
        }
    }

    @Override
    public final boolean j() {
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) != 0) {
                return this.F;
            }
            return true;
        }
        return this.F;
    }

    public final void j1(u1 u1Var) {
        u1Var.b4(this.Yd, this.f21238ae, this.f21252be, this.f21266ce, this.f21281de, this.J0, this.K0, this.Uc, this.Vc, this.Zd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f7) {
        String str;
        p0();
        if (this.f21564xa) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f7, f7, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.j6.f19162h2);
        }
    }

    public final boolean j3() {
        if (this.f21590z7 != null) {
            return this.E7;
        }
        return this.H;
    }

    public final boolean j4() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Jc) != null && l1Var.z2() != null && this.Jc.z2().A(this.f21575y7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.W8 == null) {
            this.W8 = new ImageReceiver[3];
            this.X8 = new org.telegram.ui.Components.g9[3];
            this.Y8 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W8;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.W8[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.X8[i10] = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                    this.X8[i10].u(AndroidUtilities.dp(18.0f));
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k2(Canvas canvas, boolean z10) {
        float f7;
        float f10;
        int i10;
        float dp;
        float f11;
        float f12;
        float f13;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.ta || z10) && this.f21519ua != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition == null || (groupedMessages = this.K) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f21575y7.isOutOwner();
                t1 t1Var = this.Zc;
                if (isOutOwner) {
                    float dp2 = t1Var.f21117i1 - AndroidUtilities.dp(40.0f);
                    this.Ga = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.K;
                    if (groupedMessages2 != null) {
                        this.Ga = (groupedMessages2.transitionParams.offsetLeft - this.Ae) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + t1Var.f21122j1;
                    this.Ga = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.K;
                    if (groupedMessages3 != null) {
                        this.Ga = (groupedMessages3.transitionParams.offsetRight - this.Ae) + dp3;
                    }
                }
                float f14 = 0.0f;
                if (this.f21519ua == 4) {
                    this.Ha = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.M8 + t1Var.f21116i0) - AndroidUtilities.dp(41.0f);
                    this.Ha = dp4;
                    MessageObject messageObject = this.f21575y7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f21459qb) {
                        this.Ha = dp4 - AndroidUtilities.dp(22.0f);
                    }
                    MessageObject.GroupedMessages groupedMessages4 = this.K;
                    if (groupedMessages4 != null) {
                        float f15 = this.Ha;
                        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages4.transitionParams;
                        float f16 = f15 + transitionParams.offsetBottom;
                        this.Ha = f16;
                        if (transitionParams.backgroundChangeBounds) {
                            this.Ha = f16 - getTranslationY();
                        }
                    }
                    if (this.f21575y7.shouldDrawReactions()) {
                        zg.p0 p0Var = this.N;
                        if (!p0Var.f49431b) {
                            if (this.f21461qd) {
                                this.Ha -= (1.0f - getVideoTranscriptionProgress()) * p0Var.i(t1Var.K1);
                            } else if (p0Var.f49430a > 0.0f) {
                                this.Ha -= p0Var.i(t1Var.K1);
                            }
                        }
                    }
                }
                if (this.f21519ua != 4) {
                    float dp5 = ((this.M8 + t1Var.f21116i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Ha < dp5) {
                        this.Ha = dp5;
                    }
                }
                if (this.f21575y7.type == 19) {
                    if (this.f21519ua == 3 && this.Z8 != null) {
                        this.Ha = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Ha = 0.0f;
                    }
                }
                if (!this.f21575y7.isOutOwner() && this.f21461qd && !this.f21325h2) {
                    if (this.f21429o8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.f21477rd) {
                        f11 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f11 = 0.0f;
                    }
                    if (this.f21477rd) {
                        f14 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (t1Var.f21127k2) {
                        if (this.f21477rd) {
                            f12 = t1Var.K1;
                        } else {
                            f12 = 1.0f - t1Var.K1;
                        }
                        f11 = (1.0f - getVideoTranscriptionProgress()) * f12 * dp;
                        if (this.f21477rd) {
                            f13 = t1Var.K1;
                        } else {
                            f13 = 1.0f - t1Var.K1;
                        }
                        f14 = (1.0f - getVideoTranscriptionProgress()) * f13 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ga -= f11;
                    this.Ha -= f14;
                }
                this.f21533va = true;
                if (this.f21519ua == 3) {
                    if (!this.f21553x || this.f21575y7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!aw0.f22780v0) {
                    float f17 = this.Ga;
                    float f18 = this.Ha;
                    float dp6 = AndroidUtilities.dp(32.0f) + f17;
                    float f19 = this.Ha;
                    if (this.f21549wa == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    float dp7 = f19 + AndroidUtilities.dp(f7);
                    RectF rectF = this.f21258c5;
                    rectF.set(f17, f18, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f21533va = false;
                        return;
                    }
                    int i11 = (int) ((1.0f - this.f21568y.e) * 255.0f);
                    if (i11 != 255) {
                        float f20 = this.Ga;
                        f10 = 2.0f;
                        i10 = canvas.saveLayerAlpha(f20, this.Ha, AndroidUtilities.dp(32.0f) + f20, this.Ha + AndroidUtilities.dp(64.0f), i11);
                    } else {
                        f10 = 2.0f;
                        i10 = -1;
                    }
                    p0();
                    String str = "paintChatActionBackground";
                    if (this.f21519ua == 4 && this.f21549wa == 5 && this.f21564xa) {
                        Path path = this.Ca;
                        if (path == null) {
                            this.Ca = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.Da;
                        if (path2 == null) {
                            this.Da = new Path();
                        } else {
                            path2.rewind();
                        }
                        if (this.Ea == null) {
                            this.Ea = r2;
                            float dp8 = AndroidUtilities.dp(16.0f);
                            float[] fArr = {dp8, dp8, dp8, dp8};
                        }
                        if (this.Fa == null) {
                            this.Fa = r2;
                            float dp9 = AndroidUtilities.dp(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, dp9, dp9, dp9, dp9};
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f21 = this.Ga;
                        rectF2.set(f21, this.Ha, AndroidUtilities.dp(32.0f) + f21, this.Ha + AndroidUtilities.dp(32.0f));
                        Path path3 = this.Ca;
                        float[] fArr3 = this.Ea;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.Ga, this.Ha + AndroidUtilities.dp(32.0f), this.Ga + AndroidUtilities.dp(32.0f), this.Ha + AndroidUtilities.dp(64.0f));
                        this.Da.addRoundRect(rectF2, this.Fa, direction);
                        if (this.Aa == 4) {
                            canvas.drawPath(this.Ca, M2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.Da, M2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.Ca, M2("paintChatActionBackground"));
                            canvas.drawPath(this.Da, M2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        float dp10 = AndroidUtilities.dp(16.0f);
                        float dp11 = AndroidUtilities.dp(16.0f);
                        if (this.f21564xa) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19162h2);
                    }
                    int i12 = this.f21519ua;
                    if (i12 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        a0.p(L2, (this.Ga + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f10), (this.Ha + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f10));
                        L2.draw(canvas);
                    } else if (i12 == 4) {
                        int dp12 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp13 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L22 = L2("drawableCloseIcon");
                        int intrinsicWidth = L22.getIntrinsicWidth() / 2;
                        int intrinsicHeight = L22.getIntrinsicHeight() / 2;
                        L22.setBounds(dp12 - intrinsicWidth, dp13 - intrinsicHeight, intrinsicWidth + dp12, intrinsicHeight + dp13);
                        a0.p(L22, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, L22.getBounds().centerX(), L22.getBounds().centerY());
                        L22.draw(canvas);
                        canvas.restore();
                        if (this.f21549wa == 5) {
                            Drawable L23 = L2("drawableMoreIcon");
                            int intrinsicWidth2 = L23.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = L23.getIntrinsicHeight() / 2;
                            L23.setBounds(dp12 - intrinsicWidth2, dp13 - intrinsicHeight2, dp12 + intrinsicWidth2, dp13 + intrinsicHeight2);
                            a0.p(L23, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(34.0f));
                            L23.draw(canvas);
                        }
                    } else {
                        int dp14 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp15 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L24 = L2("drawableShareIcon");
                        int intrinsicWidth3 = L24.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = L24.getIntrinsicHeight() / 2;
                        L24.setBounds(dp14 - intrinsicWidth3, dp15 - intrinsicHeight3, dp14 + intrinsicWidth3, dp15 + intrinsicHeight3);
                        a0.p(L24, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
                        L24.draw(canvas);
                    }
                    if (i10 != -1) {
                        canvas.restoreToCount(i10);
                    }
                }
            }
        }
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        MessageObject messageObject = this.f21575y7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f21575y7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f21575y7.isSponsored() || this.f21575y7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.O7 && !this.f21275d8) {
            return false;
        }
        TLRPC.Message message2 = this.f21575y7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f21575y7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.f21275d8 && this.f21575y7.type == 0) || ((!this.E && this.Ya && this.N7 && (!this.f21575y7.isOutOwner() || ((this.f21575y7.isSupergroup() && this.f21575y7.isFromGroup()) || this.f21575y7.isRepostPreview))) || (this.f21575y7.isImportedForward() && this.f21575y7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                s1 s1Var = (s1) arrayList.get(i10);
                if (this.Jc.O(this, s1Var.f20918t, !s1Var.f20907i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f21575y7.getDialogId();
                    int i11 = this.I7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f21575y7);
                    int i12 = this.I7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, s1Var.f20918t.f18473id, !s1Var.f20907i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!s1Var.f20907i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        s1Var.f20922y.p(userOrChat);
                        s1Var.f20923z.setForUserOrChat(userOrChat, s1Var.f20922y);
                        s1Var.f20915q = new u01(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.R8[i10].f(-1, !s1Var.f20907i, true);
                    if (this.f21528v4 != null) {
                        if (!this.f21575y7.isOutOwner() && this.f21575y7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f21528v4.q(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f21575y7.getFromChatId())), true, true);
                        } else {
                            this.f21528v4.q(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    s1Var.f20907i = !s1Var.f20907i;
                    invalidate();
                    return;
                }
                this.f21574y6 = false;
            }
        }
    }

    @Override
    public final void l() {
        l1 l1Var;
        if (this.f21575y7 != null) {
            Runnable runnable = this.f21393le;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f21407me;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.J7 || (this.K != null && b3())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Od && (l1Var = this.Jc) != null) {
                l1Var.p();
            }
        }
    }

    public final void l1() {
        int i10;
        s1(0);
        if (this.S2) {
            boolean z10 = this.U2;
            if (this.T2) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i10 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i10 = z10 ? 1 : 0;
            }
            if (this.V2) {
                z10 = (z10 ? 1 : 0) | true;
                i10++;
            }
            if (i10 == 0) {
                this.X2 = null;
                this.W2 = 0;
                return;
            }
            this.f21480s0 = AndroidUtilities.dp(60.0f) + this.f21480s0;
            if (z10 != this.W2) {
                this.W2 = 0;
                int z12 = rk.z(75.0f, this.J8, i10);
                float dpf2 = (this.J8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.X2;
                if (arrayList == null) {
                    this.X2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.U2) {
                    this.W2 |= 1;
                    this.X2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), z12, dpf2));
                }
                if (this.T2) {
                    this.W2 |= 2;
                    this.X2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), z12, dpf2));
                }
                if (this.V2) {
                    this.W2 |= 4;
                    this.X2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), z12, dpf2));
                }
            }
        }
    }

    public final void l2(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7, boolean z14, float f10, float f11, float f12, boolean z15, boolean z16) {
        float photoBottom;
        float f13;
        float f14;
        float f15;
        int dp;
        int dp2;
        Drawable L2;
        Drawable drawable;
        int v02;
        float f16;
        MessageObject messageObject;
        boolean z17 = (f12 == 1.0f || z15) ? false : true;
        float f17 = (f12 * 0.5f) + 0.5f;
        float f18 = z17 ? f7 * f12 : f7;
        if (this.K1 != 7 || ((messageObject = this.f21575y7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f21495t0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.Zc.K1) + AndroidUtilities.dp(this.J ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f21575y7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            rc0 rc0Var = org.telegram.ui.ActionBar.j6.E3;
            if (f4()) {
                if (this.f21575y7.shouldDrawWithoutBackground()) {
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, this.Id);
                    int i10 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    rc0Var.getClass();
                    f13 = 4.0f;
                    a0.p(rc0Var, ((i10 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    rc0Var.setAlpha((int) (this.f21398m5 * 255.0f * f18));
                } else {
                    f13 = 4.0f;
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19394tc, this.Id);
                    int i11 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    rc0Var.getClass();
                    a0.p(rc0Var, ((i11 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    rc0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 4.0f;
                f15 = 1.0f;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Na, this.Id);
                rc0Var.getClass();
                f14 = 18.5f;
                a0.p(rc0Var, (this.L8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f11 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f10);
                rc0Var.setAlpha((int) (f18 * 255.0f));
            }
            rc0Var.a(v02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, rc0Var.getBounds().centerX(), rc0Var.getBounds().centerY());
            }
            rc0Var.draw(canvas);
            rc0Var.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
            invalidate();
        } else {
            f13 = 4.0f;
            f14 = 18.5f;
            f15 = 1.0f;
        }
        if (z11) {
            if (f4()) {
                if (z15) {
                    canvas.save();
                }
                if (this.f21575y7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f15 - f12), 0.0f);
                        }
                        a0.p(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f21398m5 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f15 - f12) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.j6.F3.setAlpha((int) (this.f21398m5 * 255.0f * f18));
                    drawable = org.telegram.ui.ActionBar.j6.F3;
                }
                if (z17) {
                    canvas.save();
                    canvas.scale(f17, f17, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                if (z17) {
                    canvas.restore();
                }
                if (z15) {
                    canvas.restore();
                }
                drawable.setAlpha(255);
            } else {
                if (z15) {
                    canvas.save();
                }
                if (z10) {
                    if (z15) {
                        canvas.translate((f15 - f12) * AndroidUtilities.dp(f13), 0.0f);
                    }
                    L2 = L2(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    a0.p(L2, ((this.L8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
                } else {
                    L2 = L2(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    a0.p(L2, ((this.L8 - AndroidUtilities.dp(f14)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
                }
                L2.setAlpha((int) (f18 * 255.0f));
                if (z17) {
                    canvas.save();
                    canvas.scale(f17, f17, L2.getBounds().centerX(), L2.getBounds().centerY());
                }
                L2.draw(canvas);
                if (z17) {
                    canvas.restore();
                }
                if (z15) {
                    canvas.restore();
                }
                L2.setAlpha(255);
            }
        }
        if (z10) {
            if (f4()) {
                Drawable L22 = this.f21575y7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.j6.G3;
                a0.p(L22, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f10);
                L22.setAlpha((int) (this.f21398m5 * 255.0f * f18));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f17, f17, L22.getBounds().centerX(), L22.getBounds().centerY());
                }
                L22.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                L22.setAlpha(255);
            } else {
                Drawable L23 = L2(z16 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                a0.p(L23, (this.L8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f10);
                L23.setAlpha((int) (f18 * 255.0f));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f17, f17, L23.getBounds().centerX(), L23.getBounds().centerY());
                }
                L23.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                L23.setAlpha(255);
            }
        }
        if (z13) {
            if (f4()) {
                dp = this.L8 - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.L8 - AndroidUtilities.dp(32.0f);
                if (!this.F && !this.E) {
                    f19 = 21.0f;
                }
                dp2 = AndroidUtilities.dp(f19);
            }
            float f20 = (f11 - dp2) + f10;
            int i12 = (int) (dp + dp4);
            RectF rectF = this.f21258c5;
            rectF.set(i12, f20, AndroidUtilities.dp(14.0f) + i12, AndroidUtilities.dp(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.j6.f19053b2.getAlpha();
            org.telegram.ui.ActionBar.j6.f19053b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), org.telegram.ui.ActionBar.j6.f19053b2);
            org.telegram.ui.ActionBar.j6.f19053b2.setAlpha(alpha);
            a0.p(org.telegram.ui.ActionBar.j6.f19200j4, AndroidUtilities.dp(6.0f) + i12, f20 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.j6.f19200j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.j6.f19200j4.getBounds().centerX(), org.telegram.ui.ActionBar.j6.f19200j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.j6.f19200j4.draw(canvas);
            org.telegram.ui.ActionBar.j6.f19200j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean l3(org.telegram.messenger.MessageObject r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.l3(org.telegram.messenger.MessageObject):boolean");
    }

    public final void l4() {
        MessageObject messageObject;
        int i10;
        boolean z10;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.f21322ge && (messageObject = this.f21575y7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.p5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f21257c4;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.f21446pc = org.telegram.ui.Components.y5.update(i10, (View) this, false, this.f21446pc, arrayList);
            } else {
                l1 l1Var = this.Jc;
                if (l1Var != null && l1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f21446pc = org.telegram.ui.Components.y5.update(i10, this, z10, this.f21446pc, this.f21575y7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f21575y7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                l1 l1Var2 = this.Jc;
                richMessageLayout.invalidateAnimatedEmojiInParent = (l1Var2 == null || !l1Var2.f()) ? true : true;
                this.f21575y7.richLayout.updateAnimatedEmojis(i10);
            }
        }
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.m():boolean");
    }

    public final int m1(MessageObject messageObject, int i10) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i11;
        String str;
        String str2;
        int i12 = i10;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        if (messageMedia != null) {
            this.L1 = messageMedia.document;
        } else if (messageObject.type == 0) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
            if (media == null) {
                webPage = null;
            } else {
                webPage = media.webpage;
            }
            if (webPage == null) {
                document = null;
            } else {
                document = webPage.document;
            }
            this.L1 = document;
        } else {
            this.L1 = messageObject.getDocument();
        }
        TLRPC.Document document2 = this.L1;
        int i13 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (MessageObject.isVoiceDocument(document2)) {
                this.K1 = 3;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.L1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.L1.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i14++;
                }
                AndroidUtilities.dp(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText("00:00"));
                this.D8 = i12 - AndroidUtilities.dp(18.0f);
                x3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.f21445pb;
                if (!this.f21325h2) {
                    this.J8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.H5.f29251m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.L1)) {
                this.K1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    q4();
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(str2));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.j6.C2, this.U3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (MessageObject.isMusicDocument(this.L1)) {
                this.K1 = 5;
                int dp2 = i12 - AndroidUtilities.dp(92.0f);
                if (dp2 < 0) {
                    dp2 = AndroidUtilities.dp(100.0f);
                }
                int i15 = dp2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.j6.O2, i15 - AndroidUtilities.dp(12.0f), truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(ellipsize, textPaint, i15, alignment, 1.0f, 0.0f, false);
                this.T5 = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.U5 = -((int) Math.ceil(this.T5.getLineLeft(0)));
                    int lineWidth = (int) this.T5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth > this.J8) {
                        this.J8 = AndroidUtilities.dp(104.0f) + lineWidth;
                    }
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.j6.P2, i15, truncateAt), org.telegram.ui.ActionBar.j6.P2, i15, alignment, 1.0f, 0.0f, false);
                this.V5 = staticLayout2;
                if (staticLayout2.getLineCount() > 0) {
                    this.W5 = -((int) Math.ceil(this.V5.getLineLeft(0)));
                    int lineWidth2 = (int) this.V5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth2 > this.J8) {
                        this.J8 = AndroidUtilities.dp(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i13 >= this.L1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.L1.attributes.get(i13);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i13++;
                }
                int i16 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(AndroidUtilities.formatShortDuration(i16, i16)));
                AndroidUtilities.dp(86.0f);
                this.D8 = this.J8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.L1, messageObject.hasValidGroupId())) {
                this.K1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.C2;
                    int i17 = this.A4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f21513u4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(str));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.j6.C2, this.U3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str3 = this.L1.mime_type;
                if ((str3 != null && (str3.toLowerCase().startsWith("image/") || this.L1.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.isDocumentHasThumb(this.L1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.M1 = z10;
                if (!z10) {
                    i12 += AndroidUtilities.dp(30.0f);
                }
                int i18 = i12;
                this.K1 = 1;
                String documentFileName = FileLoader.getDocumentFileName(this.L1);
                if (documentFileName.length() == 0) {
                    documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
                }
                StaticLayout c10 = uw0.c(documentFileName, org.telegram.ui.ActionBar.j6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
                this.T3 = c10;
                this.V3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i19 = 0;
                    while (i13 < this.T3.getLineCount()) {
                        i19 = Math.max(i19, (int) Math.ceil(this.T3.getLineWidth(i13)));
                        this.V3 = Math.max(this.V3, (int) Math.ceil(-this.T3.getLineLeft(i13)));
                        i13++;
                    }
                    i11 = Math.min(i18, i19);
                } else {
                    this.V3 = 0;
                    i11 = i18;
                }
                int dp3 = i18 - AndroidUtilities.dp(30.0f);
                TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.L1.size))));
                this.A4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.L1.size) + " " + FileLoader.getDocumentExtension(this.L1), org.telegram.ui.ActionBar.j6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.A4 < 0) {
                        this.A4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f21513u4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.j6.C2, this.A4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (this.M1) {
                    this.f21287e5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f21301f5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f21575y7.isHiddenSensitive() || (DownloadController.getInstance(this.I7).getAutodownloadMask() & 1) == 0) {
                        this.f21287e5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f21287e5;
                    ai.l4 l4Var = this.S0;
                    if (photoSize != null && photoSize != this.f21301f5) {
                        BitmapDrawable bitmapDrawable = this.f21575y7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f21301f5 = null;
                            this.f21314g5 = bitmapDrawable;
                        }
                    } else {
                        this.f21287e5 = null;
                        l4Var.setNeedsQualityThumb(true);
                        l4Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f21328h5 = "86_86_b";
                    l4Var.setImage(ImageLocation.getForObject(this.f21287e5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f21301f5, messageObject.photoThumbsObject), this.f21328h5, this.f21314g5, 0L, null, messageObject, 1);
                }
                return i11;
            }
        }
        return 0;
    }

    public void m2(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.m2(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean m3() {
        if (this.f21590z7 != null) {
            return this.C7;
        }
        return this.F;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.m4(boolean, boolean, boolean):void");
    }

    public final boolean n0() {
        if (this.f21575y7.hasMediaSpoilers() && !this.f21575y7.isMediaSpoilersRevealed && this.Bb == 0.0f && this.T0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final void n2(Canvas canvas, float f7, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        ai.l4 l4Var;
        char c10;
        int i11;
        int i12;
        char c11;
        boolean z12;
        t1 t1Var;
        float f13;
        boolean z13;
        float f14;
        boolean z14;
        u1 u1Var;
        String str;
        int i13;
        float f15;
        float dp;
        float f16;
        boolean z15;
        t1 t1Var2;
        boolean z16;
        boolean z17;
        t1 t1Var3;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        Paint M2;
        float f17;
        float f18;
        int dp2;
        boolean z24;
        float photoBottom;
        float f19;
        int i14;
        float f20;
        t1 t1Var4;
        float f21;
        float f22;
        boolean z25;
        int i15;
        boolean z26;
        MessageObject messageObject;
        float j3;
        TextPaint textPaint;
        int i16;
        u1 u1Var2 = this;
        Canvas canvas2 = canvas;
        if (((u1Var2.f21520ub && !u1Var2.M) || !u1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = u1Var2.f21575y7;
            if ((!messageObject2.deleted || u1Var2.L == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.T2;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, u1Var2.Id);
                    if (u1Var2.f3()) {
                        i16 = u1Var2.f21575y7.isOutOwner() ? org.telegram.ui.ActionBar.j6.nb : org.telegram.ui.ActionBar.j6.f19302od;
                    } else {
                        i16 = u1Var2.f21575y7.isOutOwner() ? org.telegram.ui.ActionBar.j6.f19375sb : org.telegram.ui.ActionBar.j6.f19284nd;
                    }
                    textPaint2.setColor(i0.a.d(u1Var2.getVideoTranscriptionProgress(), v02, org.telegram.ui.ActionBar.j6.v0(i16, u1Var2.Id)));
                } else if (u1Var2.f4()) {
                    if (u1Var2.f21575y7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, u1Var2.Id));
                    } else {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19229kd, u1Var2.Id));
                    }
                } else if (u1Var2.f21575y7.isOutOwner()) {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.nb : org.telegram.ui.ActionBar.j6.f19375sb, u1Var2.Id));
                } else {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.f19302od : org.telegram.ui.ActionBar.j6.f19284nd, u1Var2.Id));
                }
                float f23 = u1Var2.getTransitionParams().J1 ? u1Var2.getTransitionParams().K1 * f7 : f7;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (u1Var2.J && !u1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f24 = u1Var2.M8;
                t1 t1Var5 = u1Var2.Zc;
                if (t1Var5.f21173w0) {
                    f24 += t1Var5.f21116i0;
                }
                MessageObject.GroupedMessages groupedMessages = u1Var2.K;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f12 = f10;
                } else {
                    f24 -= u1Var2.getTranslationY();
                    f12 = f10 + u1Var2.K.transitionParams.offsetRight;
                }
                float f25 = f24;
                float f26 = f12;
                if (u1Var2.J && u1Var2.f4()) {
                    f25 += AndroidUtilities.dp(1.0f);
                }
                float f27 = f25;
                if (t1Var5.f21173w0) {
                    float f28 = u1Var2.Ae;
                    f12 += f28;
                    f26 += f28;
                }
                float f29 = f12;
                boolean shouldDrawReactions = u1Var2.f21575y7.shouldDrawReactions();
                zg.p0 p0Var = u1Var2.N;
                if (shouldDrawReactions && p0Var.f49431b) {
                    if (t1Var5.f21173w0 && t1Var5.f21111h0 != 0.0f) {
                        j3 = p0Var.j(1.0f);
                    } else {
                        j3 = p0Var.j(t1Var5.K1);
                    }
                    f26 += j3;
                }
                if (t1Var5.T0) {
                    f26 = com.google.android.gms.internal.vision.e2.b(1.0f, t1Var5.K1, t1Var5.Y0, f26);
                }
                float f30 = f26;
                boolean f42 = u1Var2.f4();
                RectF rectF = u1Var2.f21258c5;
                ai.l4 l4Var2 = u1Var2.S0;
                if (f42) {
                    int i17 = -(u1Var2.f21360j9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (u1Var2.f21575y7.shouldDrawWithoutBackground()) {
                        M2 = u1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = u1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f31 = f23;
                    l4Var = l4Var2;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (u1Var2.f21398m5 * 255.0f * f31));
                    MessageObject messageObject3 = u1Var2.f21575y7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f17 = f29;
                        f18 = f31;
                    } else {
                        float currentAlpha = l4Var.isCrossfadingWithOldImage() ? 1.0f : l4Var.getCurrentAlpha();
                        if (!l4Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f17 = f29;
                        f18 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = u1Var2.f21575y7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.n5 n5Var = u1Var2.f21381l0;
                        f18 *= n5Var == null ? 0.0f : n5Var.e();
                    }
                    M2.setAlpha((int) com.google.android.gms.internal.vision.e2.C(alpha, u1Var2.f21398m5, f18, 0.6f));
                    int i18 = u1Var2.K1;
                    if (i18 != 7 && i18 != 6 && u1Var2.f21575y7.type != 19) {
                        int[] roundRadius = l4Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z24 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = u1Var2.f21575y7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z24 = false;
                    }
                    MessageObject messageObject6 = u1Var2.f21575y7;
                    float dp4 = f17 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (u1Var2.f21337i0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z24 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = u1Var2.f21575y7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f32 = f18;
                    float f33 = dp4;
                    if (u1Var2.K1 != 7 || ((messageObject = u1Var2.f21575y7) != null && messageObject.isRoundOnce())) {
                        photoBottom = u1Var2.getPhotoBottom() + u1Var2.f21495t0;
                    } else {
                        photoBottom = f27 - ((1.0f - u1Var2.getVideoTranscriptionProgress()) * (p0Var.i(t1Var5.K1) + AndroidUtilities.dp(u1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float dp7 = f34 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f35 = dp5 - dp6;
                    float f36 = dp6 + dp5 + f11;
                    int i19 = z24 ? 12 : 8;
                    if (u1Var2.f21575y7.isOutOwner()) {
                        f19 = f36;
                        i14 = (u1Var2.f21575y7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f19 = f36;
                        i14 = 0;
                    }
                    rectF.set(f35, dp7, f19 + AndroidUtilities.dp(i19 + i14), dp7 + max);
                    l4 l4Var3 = u1Var2.F7;
                    if (l4Var3 != null) {
                        float f37 = dp2;
                        canvas2.save();
                        Path path = l4Var3.f20609t;
                        path.rewind();
                        path.addRoundRect(rectF, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!u1Var2.f21575y7.isQuickReply()) {
                        if (u1Var2.f21575y7.hasMediaSpoilers() && u1Var2.f21575y7.type != 5) {
                            Path path2 = u1Var2.E5;
                            path2.rewind();
                            float f38 = dp2;
                            path2.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = u1Var2.f21575y7.needDrawBluredPreview() ? l4Var : u1Var2.T0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = u1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * u1Var2.f21414n5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f38, f38, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            u1Var2.p0();
                            float f39 = dp2;
                            canvas2.drawRoundRect(rectF, f39, f39, M2);
                            if (M2 == u1Var2.M2("paintChatActionBackground") && u1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.j6.f19162h2.getAlpha();
                                org.telegram.ui.ActionBar.j6.f19162h2.setAlpha((int) (alpha4 * u1Var2.f21398m5 * f32));
                                canvas2.drawRoundRect(rectF, f39, f39, org.telegram.ui.ActionBar.j6.f19162h2);
                                org.telegram.ui.ActionBar.j6.f19162h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = u1Var2.f21575y7;
                    float dp8 = f40 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (u1Var2.f21575y7.shouldDrawReactions() && p0Var.f49431b) {
                        u1Var2.t4();
                        p0Var.D = 0.0f;
                        p0Var.E = false;
                        p0Var.d(canvas2, t1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(u1Var2.Zb) || u1Var2.Zb.megagroup) && (u1Var2.f21575y7.messageOwner.flags & 1024) == 0 && u1Var2.Vb == null && !u1Var2.Y7) {
                        i12 = i17;
                        f27 = f27;
                        c10 = 7;
                        f20 = dp8;
                        f23 = f31;
                    } else {
                        float lineWidth = (u1Var2.f21445pb - staticLayout.getLineWidth(0)) + dp8;
                        if (p0Var.f49431b && !p0Var.f49445s) {
                            lineWidth -= p0Var.f49443q;
                        }
                        float f41 = lineWidth;
                        int g10 = t1Var5.g();
                        int i20 = t1Var5.a2;
                        if (i20 >= 0 && i20 != g10 && !u1Var2.f21379kd) {
                            u1Var2.t1(i20, g10, z10);
                        }
                        boolean z27 = u1Var2.f21379kd;
                        if (z27) {
                            g10 = u1Var2.f21335hd;
                        }
                        boolean z28 = (g10 & 4) != 0;
                        boolean z29 = (g10 & 8) != 0;
                        if (z27) {
                            int i21 = u1Var2.f21350id;
                            if ((i21 & 4) != 0) {
                                i15 = i21;
                                z26 = true;
                            } else {
                                i15 = i21;
                                z26 = false;
                            }
                            float f43 = i17;
                            t1Var4 = t1Var5;
                            f21 = f41;
                            boolean z30 = z28;
                            c10 = 7;
                            i12 = i17;
                            boolean z31 = (i15 & 8) != 0;
                            u1Var2.L1(canvas2, z26, z31, f27, f31, f43, f33, 1.0f - u1Var2.f21364jd, z11);
                            boolean z32 = z26;
                            boolean z33 = z29;
                            u1Var2.L1(canvas, z30, z33, f27, f31, f43, f33, u1Var2.f21364jd, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z30;
                            f23 = f31;
                            if (!u1Var2.f21575y7.isOutOwner()) {
                                if (!z32 && !z31) {
                                    u1Var2.p2(canvas, f23, f43, f22, 1.0f - u1Var2.f21364jd, z11);
                                }
                                if (!z25 && !z33) {
                                    u1Var2.p2(canvas, f23, f43, f22, u1Var2.f21364jd, z11);
                                }
                            }
                        } else {
                            t1Var4 = t1Var5;
                            f21 = f41;
                            boolean z34 = z28;
                            boolean z35 = z29;
                            c10 = 7;
                            i12 = i17;
                            if (!u1Var2.f21575y7.isOutOwner() && !z34 && !z35) {
                                u1Var2.p2(canvas, f31, i12, f33, 1.0f, z11);
                            }
                            u1Var2 = this;
                            u1Var2.L1(canvas, z34, z35, f27, f31, i12, f33, 1.0f, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z34;
                            f23 = f31;
                        }
                        if (u1Var2.f21575y7.isOutOwner()) {
                            canvas2 = canvas;
                            u1Var2.p2(canvas2, f23, i12, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        t1Var5 = t1Var4;
                        t1Var5.a2 = t1Var4.g();
                        if (z25 && z10 && u1Var2.getParent() != null) {
                            ((View) u1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f44 = f30 + f20;
                    u1Var2.f21404mb = f44;
                    float dp9 = (f34 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    u1Var2.nb = dp9;
                    canvas2.translate(f44, dp9);
                    vh.h.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.j6.T2.setAlpha(255);
                    z12 = z24;
                    c11 = 2;
                } else {
                    l4Var = l4Var2;
                    c10 = 7;
                    if (u1Var2.f21575y7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (u1Var2.K8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(u1Var2.f21360j9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f45 = -staticLayout.getLineLeft(0);
                    if (u1Var2.f21575y7.shouldDrawReactions() && p0Var.f49431b) {
                        u1Var2.t4();
                        p0Var.D = 0.0f;
                        p0Var.E = false;
                        p0Var.d(canvas2, t1Var5.K1, null);
                    }
                    if ((ChatObject.isChannel(u1Var2.Zb) && !u1Var2.Zb.megagroup) || (u1Var2.f21575y7.messageOwner.flags & 1024) != 0 || u1Var2.Vb != null || t1Var5.F || u1Var2.Y7 || t1Var5.B) {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        if (p0Var.f49431b && !p0Var.f49445s) {
                            lineWidth2 -= p0Var.f49443q;
                        }
                        float f46 = lineWidth2;
                        int g11 = t1Var5.g();
                        int i22 = t1Var5.a2;
                        if (i22 >= 0 && i22 != g11 && !u1Var2.f21379kd) {
                            u1Var2.t1(i22, g11, z10);
                        }
                        boolean z36 = u1Var2.f21379kd;
                        if (z36) {
                            g11 = u1Var2.f21335hd;
                        }
                        boolean z37 = (g11 & 4) != 0;
                        boolean z38 = (g11 & 8) != 0;
                        if (z36) {
                            int i23 = u1Var2.f21350id;
                            if ((i23 & 4) != 0) {
                                f14 = f23;
                                z14 = true;
                            } else {
                                f14 = f23;
                                z14 = false;
                            }
                            boolean z39 = (i23 & 8) != 0;
                            float f47 = f14;
                            float f48 = i12;
                            t1Var = t1Var5;
                            u1Var2.L1(canvas2, z14, z39, f27, f47, f48, f29, 1.0f - u1Var2.f21364jd, z11);
                            boolean z40 = z14;
                            boolean z41 = z39;
                            boolean z42 = z37;
                            boolean z43 = z38;
                            u1Var2.L1(canvas, z42, z43, f27, f47, f48, f29, u1Var2.f21364jd, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z42;
                            f23 = f47;
                            if (!u1Var2.f21575y7.isOutOwner()) {
                                if (!z40 && !z41) {
                                    u1Var2.p2(canvas, f23, f48, f13, 1.0f - u1Var2.f21364jd, z11);
                                }
                                if (!z13 && !z43) {
                                    u1Var2.p2(canvas, f23, f48, f13, u1Var2.f21364jd, z11);
                                }
                            }
                        } else {
                            t1Var = t1Var5;
                            boolean z44 = z37;
                            boolean z45 = z38;
                            if (!u1Var2.f21575y7.isOutOwner() && !z44 && !z45) {
                                u1Var2.p2(canvas, f23, i12, f29, 1.0f, z11);
                            }
                            u1Var2 = this;
                            float f49 = f23;
                            u1Var2.L1(canvas, z44, z45, f27, f49, i12, f29, 1.0f, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z44;
                            f23 = f49;
                        }
                        if (u1Var2.f21575y7.isOutOwner()) {
                            canvas2 = canvas;
                            u1Var2.p2(canvas2, f23, i12, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        t1Var5 = t1Var;
                        t1Var5.a2 = t1Var.g();
                        if (z13 && z10 && u1Var2.getParent() != null) {
                            ((View) u1Var2.getParent()).invalidate();
                        }
                        f45 = f46;
                    }
                    canvas2.save();
                    if (t1Var5.T0 && t1Var5.K1 != 1.0f) {
                        if (t1Var5.U0 != null) {
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha5 * t1Var5.K1));
                            t1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha5);
                            vh.h.f(canvas2, t1Var5.V0);
                            c11 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i12;
                            canvas2.translate(t1Var5.f21108g1 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            c11 = 2;
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0f - t1Var5.K1) * f51));
                            vh.h.f(canvas2, t1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (f51 * t1Var5.K1));
                            vh.h.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha6);
                        }
                    } else {
                        c11 = 2;
                        float f52 = f30 + f45;
                        u1Var2.f21404mb = f52;
                        float dp10 = ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        u1Var2.nb = dp10;
                        canvas2.translate(f52, dp10);
                        vh.h.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = false;
                }
                int i24 = i12;
                if (u1Var2.f21575y7.isOutOwner()) {
                    int g12 = t1Var5.g();
                    int i25 = t1Var5.a2;
                    if (i25 >= 0 && i25 != g12 && !u1Var2.f21379kd) {
                        u1Var2.t1(i25, g12, z10);
                    }
                    if (u1Var2.f21379kd) {
                        g12 = u1Var2.f21335hd;
                    }
                    if ((g12 & 1) != 0) {
                        f16 = f23;
                        z15 = true;
                    } else {
                        f16 = f23;
                        z15 = false;
                    }
                    boolean z46 = (g12 & 2) != 0;
                    if ((g12 & 4) != 0) {
                        t1Var2 = t1Var5;
                        z16 = true;
                    } else {
                        t1Var2 = t1Var5;
                        z16 = false;
                    }
                    boolean z47 = (g12 & 8) != 0;
                    if (u1Var2.f21462qe != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, u1Var2.f21462qe);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (u1Var2.f21379kd) {
                        int i26 = u1Var2.f21350id;
                        if ((i26 & 1) != 0) {
                            z18 = z15;
                            z19 = true;
                        } else {
                            z18 = z15;
                            z19 = false;
                        }
                        boolean z48 = (i26 & 2) != 0;
                        if ((i26 & 4) != 0) {
                            z20 = z16;
                            z21 = true;
                        } else {
                            z20 = z16;
                            z21 = false;
                        }
                        if ((i26 & 8) != 0) {
                            z22 = z47;
                            z23 = true;
                        } else {
                            z22 = z47;
                            z23 = false;
                        }
                        if (!z21 && z48 && z46 && !z19 && z18) {
                            t1Var3 = t1Var2;
                            str = "paintChatTimeBackground";
                            boolean z49 = z18;
                            z16 = z20;
                            i13 = 0;
                            f15 = 0.0f;
                            u1Var2.l2(canvas2, z49, z46, z16, z22, f16, z12, i24, f27, u1Var2.f21364jd, true, z11);
                        } else {
                            t1Var3 = t1Var2;
                            str = "paintChatTimeBackground";
                            boolean z50 = z18;
                            i13 = 0;
                            f15 = 0.0f;
                            float f53 = i24;
                            u1Var2.l2(canvas, z19, z48, z21, z23, f16, z12, f53, f27, 1.0f - u1Var2.f21364jd, false, z11);
                            z16 = z20;
                            u1Var2.l2(canvas, z50, z46, z16, z22, f16, z12, f53, f27, u1Var2.f21364jd, false, z11);
                        }
                        u1Var = this;
                        canvas2 = canvas;
                    } else {
                        t1Var3 = t1Var2;
                        str = "paintChatTimeBackground";
                        i13 = 0;
                        f15 = 0.0f;
                        canvas2 = canvas;
                        l2(canvas2, z15, z46, z16, z47, f16, z12, i24, f27, 1.0f, false, z11);
                        u1Var = this;
                    }
                    if (z17) {
                        canvas2.restore();
                    }
                    t1Var3.a2 = t1Var3.g();
                    if (z10 && z16 && u1Var.getParent() != null) {
                        ((View) u1Var.getParent()).invalidate();
                    }
                } else {
                    u1Var = u1Var2;
                    str = "paintChatTimeBackground";
                    i13 = 0;
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (u1Var.Mb != null) {
                    if (u1Var.Kb == f15 || u1Var.Lb == f15) {
                        u1Var.s0();
                    }
                    Path path3 = u1Var.Qb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(l4Var.getImageX(), l4Var.getImageY(), l4Var.getImageX2(), l4Var.getImageY2());
                    int[] roundRadius2 = l4Var.getRoundRadius();
                    float f54 = roundRadius2[i13];
                    float[] fArr = u1Var.Rb;
                    fArr[1] = f54;
                    fArr[i13] = f54;
                    float f55 = roundRadius2[1];
                    fArr[3] = f55;
                    fArr[c11] = f55;
                    float f56 = roundRadius2[c11];
                    fArr[5] = f56;
                    fArr[4] = f56;
                    float f57 = roundRadius2[3];
                    fArr[c10] = f57;
                    fArr[6] = f57;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF2.set(u1Var.Kb - AndroidUtilities.dp(12.0f), u1Var.Lb - AndroidUtilities.dp(8.0f), u1Var.Kb + org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + u1Var.Mb.getWidth() + AndroidUtilities.dp(12.0f), u1Var.Lb + u1Var.Mb.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (u1Var.Fb == null) {
                        if (u1Var.Pb == null) {
                            u1Var.Pb = new vh.h();
                        }
                        u1Var.Pb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        u1Var.Pb.setBounds((int) l4Var.getImageX(), (int) l4Var.getImageY(), (int) l4Var.getImageX2(), (int) l4Var.getImageY2());
                        u1Var.Pb.draw(canvas2);
                    }
                    u1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, u1Var.getWidth(), u1Var.getHeight(), (int) (u1Var.Jb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.j6.f19180i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19180i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.j6.f19180i2);
                    org.telegram.ui.ActionBar.j6.f19180i2.setAlpha(alpha7);
                    canvas.translate(u1Var.Kb + AndroidUtilities.dp(4.0f), u1Var.Lb);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.L3;
                    drawable.setBounds(i13, i13, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.j6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.j6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), 0.0f);
                    vh.h.f(canvas, u1Var.Mb);
                    canvas.restore();
                    if (u1Var.L2 != null && l4Var.getVisible() && u1Var.f21383l3 == 0) {
                        int i27 = SharedConfig.bubbleRadius;
                        if (i27 > 2) {
                            dp = AndroidUtilities.dp(i27 - 2);
                            z12 = SharedConfig.bubbleRadius >= 10;
                        } else {
                            dp = AndroidUtilities.dp(i27);
                        }
                        int imageX = (int) (l4Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (l4Var.getImageY() + AndroidUtilities.dp(6.0f));
                        rectF.set(imageX - AndroidUtilities.dp(4.0f), imageY - AndroidUtilities.dp(1.5f), AndroidUtilities.dp(z12 ? 2.0f : 0.0f) + AndroidUtilities.dp(4.0f) + u1Var.f21437p2 + imageX, AndroidUtilities.dp(1.5f) + u1Var.L2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, u1Var.M2(str));
                        canvas.save();
                        if (z12) {
                            i13 = 2;
                        }
                        canvas.translate(imageX + i13, imageY);
                        vh.h.f(canvas, u1Var.L2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f21590z7 != null) {
            return this.B7;
        }
        return this.E;
    }

    public final void n4() {
        float imageHeight;
        float f7;
        float f10;
        float dp;
        int i10;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        MessageObject messageObject = this.f21575y7;
        int i15 = messageObject.type;
        t1 t1Var = this.Zc;
        int i16 = 0;
        boolean z10 = true;
        if (i15 != 1 && i15 != 20 && this.K1 != 4 && i15 != 8 && i15 != 23) {
            float f12 = 43.0f;
            float f13 = 11.0f;
            float f14 = 0.0f;
            float f15 = 10.0f;
            if (this.f21339i2) {
                int i17 = this.f21532v8;
                if (!messageObject.isOutOwner()) {
                    f13 = 17.0f;
                }
                this.f21439p4 = AndroidUtilities.dp(f13) + i17 + this.f21425o4;
                int i18 = this.f21480s0 - this.f21468r4;
                if (this.I) {
                    f15 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f15)) - this.f21395m2) - AndroidUtilities.dp(17.0f);
                if (this.f21360j9 && this.f21519ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f12);
                this.f21453q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            } else {
                if (this.f21461qd) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f21575y7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f21439p4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f21532v8;
                    if (!messageObject.isOutOwner() && !this.f21374k8 && !this.J) {
                        f13 = 17.0f;
                    }
                    this.f21439p4 = AndroidUtilities.dp(f13) + i19 + this.f21425o4;
                }
                int i20 = this.f21480s0 - this.f21468r4;
                if (this.I) {
                    f11 = 9.0f;
                } else {
                    f11 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f11);
                if (this.f21360j9 && this.f21519ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f12);
                zg.p0 p0Var = this.N;
                if (!p0Var.f49445s && !p0Var.f49431b) {
                    if (this.f21575y7.type == 9 && this.L == null) {
                        f14 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f14) + p0Var.f49442p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f21453q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            }
        } else {
            if (t1Var.f21102f0) {
                f7 = t1Var.m0;
                f10 = t1Var.f21138n0;
                imageHeight = t1Var.f21146p0;
            } else {
                ai.l4 l4Var = this.S0;
                float imageX = l4Var.getImageX();
                float imageY = l4Var.getImageY();
                imageHeight = l4Var.getImageHeight();
                f7 = imageX;
                f10 = imageY;
            }
            this.f21439p4 = f7 + AndroidUtilities.dp(5.0f) + this.f21425o4;
            dp = f10 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f21257c4;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f21453q4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), y3()) + f10;
            z10 = false;
        }
        this.f21439p4 += getExtraTextX();
        MessageObject messageObject2 = this.f21575y7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f21575y7.isSponsored()) {
            if (z10 && this.N1) {
                this.f21453q4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f21298f2);
            }
            if (z10) {
                i12 = AndroidUtilities.dp(14.0f) + this.f21298f2;
            } else {
                i12 = 0;
            }
            float f16 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f21257c4;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(t1Var);
            }
            this.f21449q0 = (int) ((f16 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), y3())) - t1Var.f21121j0);
        }
        MessageObject messageObject3 = this.f21575y7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f21453q4 += this.f21302f6;
        }
    }

    public final void o0() {
        qr qrVar;
        boolean z10 = this.f21394m1;
        if (z10 || this.f21410n1) {
            if ((z10 && this.f21422o1 == 1.0f) || (!z10 && this.f21422o1 == 0.0f)) {
                this.f21410n1 = false;
            }
            if (z10) {
                qrVar = qr.f27643g;
            } else {
                qrVar = qr.f27644i;
            }
            this.f21450q1 = (int) Math.ceil(qrVar.getInterpolation(this.f21422o1) * AndroidUtilities.dp(35.0f));
            if (this.f21575y7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f21450q1 = 0;
                }
            }
            if (!this.f21575y7.isOutOwner() || this.f21575y7.hasWideCode) {
                y4();
            }
            if (this.f21410n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f21436p1;
                this.f21436p1 = elapsedRealtime;
                if (this.f21394m1) {
                    float f7 = (((float) j3) / 200.0f) + this.f21422o1;
                    this.f21422o1 = f7;
                    if (f7 > 1.0f) {
                        this.f21422o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f21422o1 - (((float) j3) / 200.0f);
                    this.f21422o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f21422o1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void o1() {
        float f7;
        float f10;
        int i10;
        int measureText;
        boolean z10;
        if (this.R2) {
            s1(0);
        }
        if (this.R2 && this.O2 == null) {
            this.f21438p3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.f21256c3;
            if (charSequence == null) {
                int i11 = this.f21242b3;
                if (i11 == 12) {
                    charSequence = LocaleController.getString(R.string.OpenChannelPost);
                } else if (i11 == 1) {
                    charSequence = LocaleController.getString(R.string.OpenChannel);
                } else if (i11 == 29) {
                    charSequence = LocaleController.getString(R.string.OpenChannelDirect);
                } else if (i11 == 13) {
                    charSequence = LocaleController.getString(R.string.SendMessage).toUpperCase();
                } else if (i11 == 32) {
                    charSequence = LocaleController.getString(R.string.OpenProfile).toUpperCase();
                } else if (i11 == 85) {
                    charSequence = LocaleController.getString(R.string.OpenAIStyle);
                } else if (i11 == 10) {
                    charSequence = LocaleController.getString(R.string.OpenBot);
                } else if (i11 == 2) {
                    charSequence = LocaleController.getString(R.string.OpenGroup);
                } else if (i11 == 3) {
                    charSequence = LocaleController.getString(R.string.OpenMessage);
                } else if (i11 == 5) {
                    charSequence = LocaleController.getString(R.string.ViewContact);
                } else if (i11 == 6) {
                    charSequence = LocaleController.getString(R.string.OpenBackground);
                } else if (i11 == 7) {
                    charSequence = LocaleController.getString(R.string.OpenTheme);
                } else if (i11 != 9 && i11 != 11) {
                    if (i11 == 25) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    } else if (i11 == 14) {
                        charSequence = LocaleController.getString(R.string.ViewChatList).toUpperCase();
                    } else if (i11 == 15) {
                        charSequence = LocaleController.getString(R.string.BotWebAppInstantViewOpen).toUpperCase();
                    } else if (i11 == 16) {
                        charSequence = LocaleController.getString(R.string.OpenLink).toUpperCase();
                    } else if (i11 == 17) {
                        charSequence = LocaleController.getString(R.string.ViewStory).toUpperCase();
                    } else if (i11 != 18 && i11 != 22) {
                        if (i11 == 19) {
                            charSequence = LocaleController.getString(R.string.BoostingHowItWork);
                        } else if (i11 == 20) {
                            charSequence = LocaleController.getString(R.string.OpenGift);
                        } else if (i11 == 21) {
                            charSequence = LocaleController.getString(R.string.AppUpdate);
                        } else if (i11 == 23) {
                            charSequence = LocaleController.getString(R.string.OpenStickerSet);
                        } else if (i11 == 24) {
                            charSequence = LocaleController.getString(R.string.OpenEmojiSet);
                        } else if (i11 == 26) {
                            TL_stars.StarGift starGift = this.Ee;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.I7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z10 = false;
                                } else {
                                    if (this.Ee.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new oq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = LocaleController.getString(R.string.OpenUniqueGift);
                            }
                        } else if (i11 == 27) {
                            charSequence = LocaleController.getString(R.string.JoinCall).toUpperCase();
                        } else if (i11 == 28) {
                            charSequence = LocaleController.getString(R.string.ViewCollection);
                        } else {
                            charSequence = LocaleController.getString(R.string.InstantView);
                        }
                    } else {
                        charSequence = LocaleController.getString(R.string.BoostLinkButton);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f21575y7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f21575y7.isSponsored() && this.J8 < (measureText = (int) (org.telegram.ui.ActionBar.j6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.J8 = measureText;
            }
            int dp = this.J8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.j6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.O2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f11 = 0.0f;
            if (lineCount > 0) {
                f7 = this.O2.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.P2 = f7;
            if (this.O2.getLineCount() > 0) {
                f11 = this.O2.getLineLeft(0);
            }
            this.Q2 = f11;
            int i12 = this.J8;
            int i13 = this.f21242b3;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.f21438p3 = i12 - AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f21480s0;
            this.f21480s0 = dp2;
            if (this.f21575y7.type == 12) {
                this.f21480s0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f21575y7.isSponsored()) {
                this.f21480s0 = AndroidUtilities.dp(2.0f) + this.f21480s0;
            }
            StaticLayout staticLayout2 = this.O2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f21438p3 - Math.ceil(this.O2.getLineWidth(0)))) / 2;
                if (this.f21242b3 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f21412n3 = ceil + i10;
                int lineLeft = (int) this.O2.getLineLeft(0);
                this.f21424o3 = lineLeft;
                this.f21412n3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f21414n5 > 0.0f) {
            ai.l4 l4Var = this.S0;
            if (l4Var.getVisible()) {
                MessageObject messageObject2 = this.f21575y7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f21575y7.getVideoStartsTimestamp() / ((float) this.f21575y7.getDuration());
                } else {
                    videoSavedProgress = this.f21575y7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = l4Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(l4Var.getImageX(), l4Var.getImageY(), l4Var.getImageX2(), l4Var.getImageY2());
                    } else {
                        if (this.Hb == null) {
                            this.Hb = new Path();
                            this.Ib = new float[8];
                        }
                        float[] fArr = this.Ib;
                        float max = Math.max(0, roundRadius[0]);
                        fArr[1] = max;
                        fArr[0] = max;
                        float[] fArr2 = this.Ib;
                        float max2 = Math.max(0, roundRadius[1]);
                        fArr2[3] = max2;
                        fArr2[2] = max2;
                        float[] fArr3 = this.Ib;
                        float max3 = Math.max(0, roundRadius[2]);
                        fArr3[5] = max3;
                        fArr3[4] = max3;
                        float[] fArr4 = this.Ib;
                        float max4 = Math.max(0, roundRadius[3]);
                        fArr4[7] = max4;
                        fArr4[6] = max4;
                        this.Hb.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(l4Var.getImageX(), l4Var.getImageY(), l4Var.getImageX2(), l4Var.getImageY2());
                        this.Hb.addRoundRect(rectF, this.Ib, Path.Direction.CW);
                        canvas.clipPath(this.Hb);
                    }
                    org.telegram.ui.ActionBar.j6.f19275n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f21414n5 * 0.35f, -1));
                    canvas.drawRect(l4Var.getImageX(), l4Var.getImageY2() - AndroidUtilities.dp(3.0f), l4Var.getImageX2(), l4Var.getImageY2(), org.telegram.ui.ActionBar.j6.f19275n2);
                    org.telegram.ui.ActionBar.j6.f19275n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f21414n5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(l4Var.getImageX() - AndroidUtilities.dp(2.0f), l4Var.getImageY2() - AndroidUtilities.dp(3.0f), (l4Var.getImageWidth() * clamp01) + l4Var.getImageX(), l4Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19275n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f21461qd && this.f21477rd) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f21575y7 != null) {
            int i10 = this.I7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f21575y7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f21575y7.getDialogId() == clientUserId || this.f21575y7.getDialogId() == 1271266957)) {
                this.Zb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f21575y7.getDialogId() == 489000) {
                long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                if (peerDialogId >= 0) {
                    this.Yb = messagesController.getUser(Long.valueOf(peerDialogId));
                } else {
                    this.Zb = messagesController.getChat(Long.valueOf(-peerDialogId));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j3 = peer.user_id;
                if (j3 != 0) {
                    if (!this.P7) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.Yb = messagesController.getUser(Long.valueOf(j3));
                } else if (peer.channel_id != 0) {
                    if (this.f21575y7.isSavedFromMegagroup()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.Zb = messagesController.getChat(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j10 = peer.chat_id;
                    if (j10 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer4.user_id));
                        } else {
                            this.Zb = messagesController.getChat(Long.valueOf(j10));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f21575y7.getDialogId() == clientUserId)) {
                this.Yb = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f21575y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Yb = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f21575y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Yb = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f21575y7.getDialogId();
                long fromChatId = this.f21575y7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f21575y7.getDialogId())) {
                    if (this.f21575y7.isOutOwner()) {
                        this.Yb = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f21575y7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Yb = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f21575y7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Yb = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f21575y7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Zb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Zb = chat;
                } else {
                    TLRPC.Message message = this.f21575y7.messageOwner;
                    if (message.post) {
                        this.Zb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && imageReceiver == this.S0 && messageObject.isAnimatedSticker()) {
            this.Jc.M1(this.f21575y7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        u1 u1Var;
        float f7;
        float f10;
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.fe;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.fe = null;
        }
        this.fe = NotificationCenter.getInstance(this.I7).createObserversGroup(this).add(NotificationCenter.userInfoDidLoad).addGlobal(NotificationCenter.startSpoilers).addGlobal(NotificationCenter.stopSpoilers).addGlobal(NotificationCenter.emojiLoaded).addGlobal(NotificationCenter.didUpdatePremiumGiftStickers);
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            messageObject.animateComments = false;
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
            }
        }
        RichMessageLayout richMessageLayout2 = this.Zc.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.attach(this);
        }
        org.telegram.ui.Components.i9 i9Var = this.X3;
        if (i9Var != null) {
            i9Var.g();
        }
        qh.g gVar = this.f21245b6;
        if (gVar != null) {
            gVar.a();
        }
        qh.g gVar2 = this.f21259c6;
        if (gVar2 != null) {
            gVar2.a();
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s1) obj).q();
        }
        MessageObject messageObject2 = this.f21590z7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            u1Var = this;
            u1Var.V3(messageObject2, this.A7, this.C7, this.B7, this.D7, this.E7);
            u1Var.f21590z7 = null;
            u1Var.A7 = null;
        } else {
            u1Var = this;
        }
        CheckBoxBase checkBoxBase = u1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f22188l = true;
        }
        CheckBoxBase checkBoxBase2 = u1Var.f21367k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f22188l = true;
        }
        p21 p21Var = u1Var.f21282e0;
        if (p21Var != null) {
            p21Var.a();
        }
        CheckBoxBase checkBoxBase3 = u1Var.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f22188l = true;
        }
        if (u1Var.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = u1Var.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f22188l = true;
                i11++;
            }
        }
        u1Var.M0 = true;
        float f11 = 0.0f;
        u1Var.Ae = 0.0f;
        u1Var.f21597ze = 0.0f;
        u1Var.f21450q1 = 0;
        y4();
        ImageReceiver imageReceiver = u1Var.f21402m9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        F0();
        MessageObject messageObject3 = u1Var.f21575y7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = u1Var.K1;
        if (i12 == 4 && u1Var.f21416n7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(u1Var.f21575y7);
            u1Var.D1 = isPlayingMessage;
            if (isPlayingMessage) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            u1Var.F1 = f10;
            u1Var.E1 = 0;
        } else {
            u1Var.D1 = false;
            u1Var.F1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && u1Var.f21584z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            u1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().z2() != null) {
            s9 z22 = getDelegate().z2();
            z22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == z22.f20240w) {
                z22.W = u1Var;
            }
        }
        if (u1Var.K1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(u1Var.f21575y7)) {
                f11 = 1.0f;
            }
            u1Var.f21420nd = f11;
        }
        zg.p0 p0Var = u1Var.N;
        ArrayList arrayList2 = p0Var.v;
        p0Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((zg.m0) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = u1Var.f21293ed;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        l4 l4Var = u1Var.F7;
        if (l4Var != null) {
            ArrayList arrayList3 = l4Var.f20595c;
            if (!l4Var.C) {
                l4Var.C = true;
                vh.g gVar3 = l4Var.f20601l;
                if (gVar3 != null) {
                    gVar3.b(l4Var.f20593a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    k4 k4Var = (k4) arrayList3.get(i14);
                    if (!k4Var.M) {
                        k4Var.M = true;
                        k4Var.f20537f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = u1Var.f21575y7;
        if (messageObject4 != null && messageObject4.type == 20 && u1Var.Mb != null) {
            invalidate();
        }
        org.telegram.ui.Components.n5 n5Var = u1Var.f21307fc;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = u1Var.gc;
        if (n5Var2 != null) {
            n5Var2.a();
        }
        vh.g gVar4 = u1Var.Fb;
        if (gVar4 != null) {
            if (gVar4.f44696i) {
                vh.g w32 = w3();
                u1Var.Fb = w32;
                Integer num = u1Var.Gb;
                if (num != null) {
                    w32.f44698k.put(this, num);
                }
            } else {
                gVar4.a(this);
            }
        }
        o0 o0Var = u1Var.v;
        if (o0Var != null) {
            ArrayList arrayList4 = o0Var.f20730q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((n0) arrayList4.get(i15)).a();
            }
        }
        mx0 mx0Var = u1Var.f21283e1;
        if (mx0Var != null) {
            for (int i16 = 0; i16 < mx0Var.f26503b; i16++) {
                mx0Var.f26504c[i16].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.ObserversGroup observersGroup = this.fe;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.fe = null;
        }
        AnimatorSet animatorSet = this.G7;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G7 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f22188l = false;
        }
        qh.g gVar = this.f21245b6;
        if (gVar != null) {
            gVar.f42068b.onDetachedFromWindow();
            gVar.f42081x.f();
        }
        qh.g gVar2 = this.f21259c6;
        if (gVar2 != null) {
            gVar2.f42068b.onDetachedFromWindow();
            gVar2.f42081x.f();
        }
        yf.n nVar = this.f21558x4;
        if (nVar != null) {
            nVar.b();
            this.f21558x4 = null;
        }
        RichMessageLayout richMessageLayout = this.f21575y7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        t1 t1Var = this.Zc;
        RichMessageLayout richMessageLayout2 = t1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s1) obj).r();
        }
        org.telegram.ui.Components.i9 i9Var = this.X3;
        if (i9Var != null) {
            i9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f21367k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f22188l = false;
        }
        if (this.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f22188l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f22188l = false;
        }
        this.M0 = false;
        l4 l4Var = this.F7;
        if (l4Var != null) {
            l4Var.e();
        }
        this.f21402m9.onDetachedFromWindow();
        p21 p21Var = this.f21282e0;
        if (p21Var != null) {
            p21Var.b();
        }
        F0();
        if (this.G4 && this.E4 != null && this.F4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.E4);
            this.G4 = false;
        }
        mx0 mx0Var = this.f21283e1;
        if (mx0Var != null) {
            mx0Var.a(this);
        }
        DownloadController.getInstance(this.I7).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().z2() != null) {
            s9 z22 = getDelegate().z2();
            z22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == z22.f20240w) {
                z22.W = null;
            }
        }
        t1Var.f21169v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
            org.telegram.ui.ActionBar.j6.x0().f25279i = null;
        }
        ValueAnimator valueAnimator = this.f21392ld;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f21392ld.cancel();
        }
        this.N.q();
        this.f21379kd = false;
        FlagSecureReason flagSecureReason = this.f21293ed;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.n5 n5Var = this.f21307fc;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.gc;
        if (n5Var2 != null) {
            n5Var2.b();
        }
        vh.g gVar3 = this.Fb;
        if (gVar3 != null) {
            gVar3.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f20730q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                n0 n0Var = (n0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f20667c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].onDetachedFromWindow();
                        i13++;
                    }
                }
            }
        }
        yf.h.d().f(this.f21380ke);
    }

    @Override
    public void onDraw(Canvas canvas) {
        S1(canvas);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        boolean z11;
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        m4(true, z11, false);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int i10 = 0;
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f21447pd;
                if (i10 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i10)).contains(x10, z22)) {
                    int keyAt = sparseArray.keyAt(i10);
                    if (keyAt != this.Dd) {
                        this.Dd = keyAt;
                        I3(keyAt, 32768, null);
                        return true;
                    }
                    return true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Dd = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        u1 u1Var;
        int i12;
        MessageObject messageObject = this.f21575y7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.V4 == AndroidUtilities.displaySize.y)) {
            u1Var = this;
        } else {
            this.f21583z0 = true;
            MessageObject messageObject2 = this.f21575y7;
            this.f21575y7 = null;
            u1Var = this;
            u1Var.X3(messageObject2, this.K, this.F, this.E, this.G, false);
            u1Var.f21583z0 = false;
        }
        w4();
        int i13 = u1Var.V + u1Var.f21296f0 + u1Var.f21323h0 + u1Var.f21480s0 + u1Var.f21509u0 + u1Var.f21267d0;
        hh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(u1Var.f21575y7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f10498a.getHeight() - draftMessageMeasureController.f10498a.getPaddingTop()) - draftMessageMeasureController.f10498a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.e = z10;
            if (draftMessageMeasureController.f10499b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        u1Var.ne = Math.max(0, i12 - i13);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), i12);
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f21575y7.loadedFileSize = j3;
        p1(j3, j10);
        if (this.f21555x1) {
            this.P0.o(min, true);
        } else {
            this.O0.o(min, true);
        }
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            if (this.W4 != 0) {
                if (this.X4 != 1) {
                    m4(false, false, false);
                }
            } else if (this.O4 != 1) {
                m4(false, false, false);
            }
        } else if (this.W4 != 0) {
            if (this.X4 != 1) {
                m4(false, false, false);
            }
        } else if (this.O4 != 4) {
            m4(false, false, false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min;
        int i10;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f21575y7.loadedFileSize = j3;
        RadialProgress2 radialProgress2 = this.O0;
        radialProgress2.o(min, true);
        if (j3 == j10 && ((this.L != null || this.f21575y7.isPaid()) && SendMessagesHelper.getInstance(this.I7).isSendingMessage(this.f21575y7.getId()) && ((i10 = this.O4) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.Q0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j11 = this.f21570y1;
        if (j11 > 0 && Math.abs(j11 - j10) > 1048576) {
            this.f21570y1 = j10;
        }
        p1(j3, j10);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f21488s8 && Build.VERSION.SDK_INT >= 23) {
            MessageObject messageObject = this.f21575y7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f21575y7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f21575y7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f21575y7.caption);
            }
        }
    }

    @Override
    public final void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0() {
        q0(getX(), this.Sc, getMeasuredWidth(), this.Tc);
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.p1(long, long):void");
    }

    public final void p2(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        float f13;
        float f14;
        float f15;
        double d;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable L2;
        float f16;
        boolean z15;
        t1 t1Var;
        float f17;
        float f18;
        float f19;
        boolean z16;
        boolean z17;
        String str;
        Drawable L22;
        float n10;
        float f20;
        String str2;
        Drawable L23;
        if (f12 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f21 = (f12 * 0.5f) + 0.5f;
        float f22 = f7 * f12;
        zg.p0 p0Var = this.N;
        if (p0Var.f49431b) {
            f13 = p0Var.j(1.0f);
        } else {
            f13 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.j6.T2.getAlpha();
        float N2 = N2(f10);
        StaticLayout staticLayout = this.Vb;
        t1 t1Var2 = this.Zc;
        if (staticLayout == null && !t1Var2.F) {
            t1Var = t1Var2;
            z15 = z11;
            f17 = f22;
            f14 = 10.0f;
            f18 = 2.0f;
            d = 1.0d;
        } else {
            boolean z18 = t1Var2.f21112h1;
            f14 = 10.0f;
            if (z18) {
                f15 = this.f21475rb;
            } else {
                f15 = f11;
            }
            float f23 = f15 + f13;
            d = 1.0d;
            boolean z19 = t1Var2.F;
            if (z19 && t1Var2.H == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && t1Var2.H != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z19 && t1Var2.H != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f21461qd || !t1Var2.l1) && z18 && !z12) {
                if (z13) {
                    f23 = t1Var2.I;
                } else {
                    float f24 = t1Var2.I;
                    float f25 = t1Var2.K1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                if (transitionParams.backgroundChangeBounds) {
                    f23 += transitionParams.offsetRight;
                }
            }
            if (t1Var2.f21173w0) {
                f23 += this.Ae;
            }
            if (f4()) {
                if (this.f21575y7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.j6.f19055b4;
                }
            } else if (!this.f21575y7.isOutOwner()) {
                if (z10) {
                    L2 = org.telegram.ui.ActionBar.j6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.j6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float n11 = a0.n(L2, f23, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize());
            if (z12) {
                f16 = t1Var2.K1 * f22;
            } else if (z13) {
                f16 = (1.0f - t1Var2.K1) * f22;
            } else {
                f16 = f22;
            }
            L2.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f21, f21, org.telegram.messenger.l0.a(AndroidUtilities.dp(3.0f) + n11, this.Wb, 2.0f, f23), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (t1Var2.F) {
                if (z14) {
                    canvas.save();
                    f17 = f22;
                    f18 = 2.0f;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0d - t1Var2.K1) * alpha));
                    canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
                    t1Var = t1Var2;
                    t1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    t1Var = t1Var2;
                    f17 = f22;
                    f18 = 2.0f;
                }
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * f16));
            } else {
                t1Var = t1Var2;
                f17 = f22;
                f18 = 2.0f;
            }
            canvas.save();
            canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Vb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = t1Var.H;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.Vb != null) {
                f13 += n11 + this.Wb + AndroidUtilities.dp(10.0f);
            }
            if (z15) {
                canvas.restore();
            }
            if (t1Var.F) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            t1Var.J = f23;
        }
        if (this.Sb != null) {
            boolean z20 = t1Var.f21112h1;
            if (z20) {
                f20 = this.f21475rb;
            } else {
                f20 = f11;
            }
            float f26 = f20 + f13;
            if ((!this.f21461qd || !t1Var.l1) && z20) {
                float f27 = t1Var.K;
                float f28 = t1Var.K1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.K;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f26 += transitionParams2.offsetRight;
                }
            }
            if (t1Var.f21173w0) {
                f26 += this.Ae;
            }
            if (f4()) {
                if (this.f21575y7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.j6.f19035a4;
                }
            } else if (!this.f21575y7.isOutOwner()) {
                if (z10) {
                    L23 = org.telegram.ui.ActionBar.j6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.j6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float n12 = a0.n(L23, f26, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() - AndroidUtilities.dp(f18));
            if (z15) {
                canvas.save();
                canvas.scale(f21, f21, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Tb) / f18) + f26, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f17 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (t1Var.f21095d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((d - t1Var.K1) * alpha));
                canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
                vh.h.f(canvas, t1Var.f21095d2);
                canvas.restore();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * t1Var.K1));
            }
            canvas.save();
            canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
            vh.h.f(canvas, this.Sb);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f13 += this.Tb + n12 + AndroidUtilities.dp(f14);
            if (t1Var.f21095d2 != null) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            t1Var.L = f26;
        }
        boolean z21 = this.Y7;
        if (!z21 && !t1Var.B) {
            return;
        }
        boolean z22 = t1Var.f21112h1;
        if (z22) {
            f19 = this.f21475rb;
        } else {
            f19 = f11;
        }
        float f29 = f19 + f13;
        boolean z23 = t1Var.B;
        if (z23 && z21) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z23 && !z21) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (!this.f21461qd && z22 && !z16) {
            if (z17) {
                f29 = t1Var.D;
            } else {
                float f30 = t1Var.D;
                float f31 = t1Var.K1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        MessageObject.GroupedMessages groupedMessages3 = this.K;
        if (groupedMessages3 != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
            if (transitionParams3.backgroundChangeBounds) {
                f29 += transitionParams3.offsetRight;
            }
        }
        if (t1Var.f21173w0) {
            f29 += this.Ae;
        }
        if (f4()) {
            if (this.f21575y7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.j6.Z3;
            }
        } else if (!this.f21575y7.isOutOwner()) {
            if (z10) {
                L22 = org.telegram.ui.ActionBar.j6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.j6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            L22 = L2(str);
        }
        if (t1Var.B) {
            if (this.Y7) {
                L22.setAlpha((int) (f17 * 255.0f * t1Var.K1));
                n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - t1Var.K1) * f17 * 255.0f));
                n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f17 * 255.0f));
            n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
        }
        if (z15) {
            canvas.save();
            canvas.scale(f21, f21, (n10 / f18) + f29, L22.getBounds().centerY());
        }
        L22.draw(canvas);
        L22.setAlpha(255);
        if (z15) {
            canvas.restore();
        }
        t1Var.C = f29;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f21293ed == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new ma(this, 3));
                this.f21293ed = flagSecureReason;
                if (this.M0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f21293ed;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        u1 u1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        l1 l1Var = this.Jc;
        int i11 = 0;
        if (l1Var != null && l1Var.v2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f21575y7.type == 16) {
                this.Jc.C0(this, this.S4, this.T4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i10 == R.id.acc_action_small_button) {
            w1();
        } else if (i10 == R.id.acc_action_msg_options) {
            l1 l1Var2 = this.Jc;
            if (l1Var2 != null) {
                if (this.f21575y7.type == 16) {
                    l1Var2.r0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.C0(this, this.S4, this.T4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                l1 l1Var3 = this.Jc;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f21363jc;
                    if (chat != null) {
                        u1Var = this;
                        l1Var3.S(u1Var, chat, this.f21575y7.messageOwner.fwd_from.channel_post, this.f21310g1, this.f21324h1, false);
                    } else {
                        u1Var = this;
                        TLRPC.User user = u1Var.f21334hc;
                        if (user != null) {
                            l1Var3.u0(this, user, u1Var.f21310g1, u1Var.f21324h1);
                        } else if (u1Var.f21378kc != null) {
                            l1Var3.o(this);
                        }
                    }
                }
            } else {
                u1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    l1 l1Var4 = u1Var.Jc;
                    if (l1Var4 != null) {
                        l1Var4.J0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && u1Var.Jc != null && (arrayList = u1Var.f21575y7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            u1Var.Jc.I(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!u1Var.f21575y7.isVoice() || u1Var.f21575y7.isRoundVideo() || (u1Var.f21575y7.isMusic() && MediaController.getInstance().isPlayingMessage(u1Var.f21575y7))) && u1Var.I5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        u1Var = this;
        if (!u1Var.f21575y7.isVoice()) {
        }
        return true;
    }

    public final void q0(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            f6Var.m(f7, f10 + this.V + this.f21296f0 + this.f21323h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10 + this.V + this.f21296f0 + this.f21323h0, i10, i11);
        }
    }

    public final void q1(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(FileLoader.getDocumentFileName(document));
        if (fileProgressSizes != null) {
            p1(fileProgressSizes[0], fileProgressSizes[1]);
        } else {
            p1(this.f21575y7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f7, Runnable runnable) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        boolean z10;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.O0;
            RectF rectF = radialProgress2.f22346a;
            Paint paint = radialProgress2.f22350g;
            aa0 aa0Var = radialProgress2.f22351i;
            RectF rectF2 = radialProgress2.f22346a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                f5Var = this.f21517u8;
            } else {
                f5Var = this.f21503t8;
            }
            aa0Var.B = f5Var;
            radialProgress2.f22352j.B = f5Var;
            radialProgress2.I = f7;
            runnable.run();
            if (this.Z0 == null) {
                Paint paint2 = new Paint(1);
                this.Z0 = paint2;
                f10 = 1.0f;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                f10 = 1.0f;
            }
            if (f7 < f10) {
                canvas2.save();
                float f11 = f10 - f7;
                float f12 = 0.7f * f11;
                canvas2.scale(f12, f12, rectF2.centerX(), AndroidUtilities.lerp(rectF2.top, rectF2.bottom, 0.5f));
                if (this.f21226a1 == null) {
                    hj0 hj0Var = new hj0(R.raw.fire_once, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.f21226a1 = hj0Var;
                    hj0Var.R(this);
                    this.f21226a1.J(true);
                    this.f21226a1.K(1);
                    this.f21226a1.start();
                }
                this.f21226a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f21240b1 == null) {
                    i10 = 1;
                    this.f21240b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f21254c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f21254c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f21268d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f21268d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f22363u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(i12, this.Id);
                } else {
                    i11 = radialProgress2.f22356n;
                }
                this.f21240b1.setColor(i11);
                this.f21268d1.setColor(i11);
                aa0Var.a(false);
                this.f21240b1.setShader(aa0Var.d.getShader());
                this.f21268d1.setShader(aa0Var.d.getShader());
                rectF3.set(this.f21226a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                rectF3.inset(1.0f, 1.0f);
                canvas2.drawRect(rectF3, this.f21240b1);
                this.f21226a1.q(canvas, this.f21254c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f21268d1.setAlpha((int) (255.0f * f11));
                this.f21268d1.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.f21258c5;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                vo0 vo0Var = this.H5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - vo0Var.K) * (-360.0f), false, this.f21268d1);
                if (this.S6 == null) {
                    this.S6 = new l21();
                }
                this.S6.a((1.0f - vo0Var.K) * (-360.0f), f11, canvas, this.f21268d1, rectF4);
                canvas2 = canvas;
            } else {
                hj0 hj0Var2 = this.f21226a1;
                if (hj0Var2 != null) {
                    hj0Var2.C(true);
                    this.f21226a1 = null;
                    if (this.S6 != null) {
                        this.S6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f7 * 1.5f) + 10.0f) * f7, this.Z0);
            canvas2.restore();
            if (this.Y0 == null) {
                ci.l lVar = new ci.l(3);
                this.Y0 = lVar;
                lVar.e(-1, 0, 0);
                ci.l lVar2 = this.Y0;
                lVar2.f4907i = 14.0f;
                lVar2.c(10.0f);
                this.Y0.f4902a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z10 = true;
                this.Y0.d(1, false, false);
                this.Y0.f4908j = -AndroidUtilities.dpf2(0.33f);
                this.Y0.f4909k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = true;
            }
            ci.l lVar3 = this.Y0;
            lVar3.f4907i = f7 * 14.0f;
            lVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f7, paint);
            ci.l lVar4 = this.Y0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z10 = false;
            }
            lVar4.b(z10);
            ci.l lVar5 = this.Y0;
            lVar5.f4912n = cos;
            lVar5.f4913o = sin;
            lVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.G8 && (messageObject = this.f21575y7) != null && !messageObject.isOutOwner() && this.L == null) {
            return true;
        }
        return false;
    }

    public final void q4() {
        boolean z10;
        String formatShortDuration;
        double d;
        double d10;
        double d11;
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            h1 h1Var = this.Hd;
            if (h1Var != null && h1Var.rewindCount != 0 && h1Var.rewindByBackSeek) {
                messageObject.audioProgress = h1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f21575y7.isPoll()) {
                qh.g gVar = this.f21245b6;
                if (gVar != null) {
                    gVar.n(true);
                }
                qh.g gVar2 = this.f21259c6;
                if (gVar2 != null) {
                    gVar2.n(true);
                }
            }
            int i10 = this.K1;
            double d12 = 0.0d;
            f1 f1Var = this.G5;
            if (i10 == 4) {
                if (f1Var != null) {
                    f1Var.a();
                }
                if (this.f21513u4 == null || (!PhotoViewer.J1(this.f21575y7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f21575y7))) {
                    org.telegram.ui.Components.c6 animation = this.S0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f21575y7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f21575y7.isVideo() && animation.s()) {
                            this.Jc.N(this.f21575y7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f21575y7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                        d11 -= this.f21575y7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Jc != null && animation.o() >= 3000) {
                            this.Jc.A0();
                        }
                    }
                    if (this.Q5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(formatShortDuration2));
                        this.f21513u4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.j6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.Q5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f21461qd;
            vo0 vo0Var = this.H5;
            int i12 = 0;
            if (z12) {
                if (this.F5) {
                    if (!vo0Var.f29245f) {
                        vo0Var.g(this.f21575y7.audioProgress, true);
                    }
                } else {
                    if (!f1Var.e) {
                        f1Var.i(this.f21575y7.audioProgress);
                        f1Var.f27018q = this.f21575y7.bufferedProgress;
                    }
                    f1Var.a();
                }
                TLRPC.Document document = this.f21575y7.getDocument();
                if (document != null) {
                    while (i12 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d10 = documentAttribute.duration;
                            break;
                        }
                        i12++;
                    }
                }
                d10 = 0.0d;
                long j3 = this.Xd;
                if (j3 >= 0) {
                    d10 = j3;
                } else if (MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                    d10 = Math.max(0.0d, d10 - this.f21575y7.audioProgressSec);
                }
                if (this.Q5 != d10) {
                    this.Q5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.T2.measureText(formatLongDuration));
                    this.P5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.j6.T2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.f21575y7.audioProgress;
                if (f7 != 0.0f) {
                    this.Cd = f7;
                    if (f7 > 0.9f) {
                        this.Cd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.F5) {
                    if (!vo0Var.f29245f) {
                        vo0Var.g(this.f21575y7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!f1Var.e) {
                        f1Var.i(this.f21575y7.audioProgress);
                        f1Var.f27018q = this.f21575y7.bufferedProgress;
                    }
                    f1Var.k(this.f21575y7);
                    z10 = false;
                }
                int i13 = this.K1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j10 = this.Xd;
                    if (j10 >= 0) {
                        d = j10;
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                        while (true) {
                            if (i12 >= this.L1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.L1.attributes.get(i12);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d12 = documentAttribute2.duration;
                                break;
                            }
                            i12++;
                        }
                        d = d12;
                    } else {
                        d = this.f21575y7.audioProgressSec;
                    }
                    if (this.Q5 != d) {
                        this.Q5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(formatLongDuration2));
                        this.P5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.j6.N2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f21575y7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                        i12 = this.f21575y7.audioProgressSec;
                    }
                    double d13 = i12;
                    if (this.Q5 != d13) {
                        this.Q5 = d13;
                        this.P5 = new StaticLayout(AndroidUtilities.formatShortDuration(i12, (int) duration), org.telegram.ui.ActionBar.j6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final void r0(int i10, int i11, int i12) {
        int lastLineWidth;
        RichMessageLayout richMessageLayout;
        int i13;
        int i14;
        if (this.f21575y7.isSponsored()) {
            this.J8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        zg.p0 p0Var = this.N;
        if (!p0Var.f49445s && !p0Var.f49431b) {
            lastLineWidth = p0Var.f49447u;
        } else {
            lastLineWidth = this.f21575y7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!p0Var.f49445s && !p0Var.f49431b) {
            z10 = (i10 - lastLineWidth < i11 || this.f21575y7.hasRtl) ? true : true;
            if (this.f21368k2) {
                this.f21480s0 = AndroidUtilities.dp(14.0f) + this.f21480s0;
            }
        } else if ((!this.f21496t1 && ((this.f21325h2 && !this.f21575y7.isSponsored()) || this.N1 || this.f21339i2 || this.f21354j2 || this.f21368k2)) || i10 - lastLineWidth < i11 || this.f21575y7.hasRtl) {
            z10 = true;
        }
        if (this.f21575y7.isUnsupported()) {
            z10 = true;
        }
        if ((p0Var.f49445s || p0Var.f49431b) && (richMessageLayout = this.f21575y7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f21575y7;
        if ((messageObject.hasCodeAtBottom && (p0Var.f49445s || p0Var.f49431b)) || ((messageObject.hasQuoteAtBottom && (p0Var.f49445s || p0Var.f49431b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z10 = true;
        } else {
            i13 = 14;
        }
        if (z10) {
            this.f21480s0 = AndroidUtilities.dp(i13) + this.f21480s0;
            this.K8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.J8 = dp;
            if (this.f21575y7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.f21445pb;
            } else {
                i14 = this.f21445pb;
            }
            this.J8 = org.telegram.messenger.l0.y(31.0f, i14, dp);
            return;
        }
        int extraTextX = (i12 - getExtraTextX()) - lastLineWidth;
        if (extraTextX >= 0 && extraTextX <= i11) {
            this.J8 = AndroidUtilities.dp(31.0f) + ((i12 + i11) - extraTextX);
        } else {
            this.J8 = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth + i11);
        }
    }

    public final void r1(int i10) {
        CheckBoxBase[] checkBoxBaseArr = this.R8;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i10) {
            if (checkBoxBaseArr != null) {
                int i11 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = this.R8;
                    if (i11 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i11].f22188l = false;
                    i11++;
                }
            }
            this.R8 = new CheckBoxBase[i10];
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = this.R8;
                if (i12 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i12] = new CheckBoxBase(20, this, this.Id);
                this.R8[i12].k(false);
                this.R8[i12].j(true);
                this.R8[i12].d(9);
                i12++;
            }
        }
        if (this.N8 == null) {
            this.N8 = new org.telegram.ui.Components.l9(this.I7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(n1 n1Var, e90 e90Var, Layout layout, int i10) {
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) layout.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= characterStyleArr.length) {
                    break;
                } else if (characterStyleArr[i11] == this.D5) {
                    n1Var.f20678b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (n1Var.f20678b != i10) {
            return false;
        }
        e90Var.rewind();
        int spanStart = spanned.getSpanStart(this.D5);
        int spanEnd = spanned.getSpanEnd(this.D5);
        e90Var.f28801c = true;
        e90Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, e90Var);
        e90Var.a();
        this.B5.k();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f21583z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        if (this.f21575y7.type == 20 && this.Mb != null) {
            ai.l4 l4Var = this.S0;
            this.Kb = com.google.android.gms.internal.vision.e2.A(l4Var.getImageWidth(), this.Mb.getWidth(), 2.0f, this.f21532v8);
            this.Lb = com.google.android.gms.internal.vision.e2.A(l4Var.getImageHeight(), this.Mb.getHeight(), 2.0f, l4Var.getImageY() + this.f21562x8);
        }
    }

    public final void s1(int i10) {
        int i11;
        int v02;
        cm0 cm0Var;
        cm0 cm0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f21575y7.isUnsupported()) {
            if (this.f21575y7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i14, this.Id);
        } else if (i10 == 0 && this.f21373k7) {
            if (this.f21575y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.xc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.Id);
        } else if (i10 == 0 && (cm0Var2 = this.f21234aa) != null) {
            v02 = cm0Var2.h();
        } else if (i10 == 0 && (cm0Var = this.f21263ca) != null) {
            v02 = cm0Var.h();
        } else {
            if (this.f21575y7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Id);
        }
        Drawable[] drawableArr = this.f21527v3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            i1 i1Var = new i1(i10, this);
            o1[] o1VarArr = this.f21542w3;
            o1VarArr[i10] = i1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f21575y7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.j6.v0(i13, this.Id)}), null, o1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.j6.B1(drawable, v02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(n1 n1Var, e90 e90Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(n1Var, e90Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.s3():boolean");
    }

    public final void s4() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.Q0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f21303f8 && !this.f21289e8 && !isPressed()) || (this.M1 && this.S0.hasBitmapImage())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.P4 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        RadialProgress2 radialProgress2 = this.O0;
        radialProgress2.n(z11, false);
        if (this.W4 != 0) {
            if (!z10 && this.R4 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.n(z12, true);
        }
        if (!z10 && this.Q4 == 0) {
            z13 = false;
        }
        this.P0.n(z13, false);
    }

    public void setAllowAssistant(boolean z10) {
        this.f21488s8 = z10;
    }

    @Override
    public void setAlpha(float f7) {
        boolean z10;
        boolean z11 = false;
        if (f7 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getAlpha() == 1.0f) {
            z11 = true;
        }
        if (z10 != z11) {
            invalidate();
        }
        if (this.Xc) {
            this.Yc = f7;
            invalidate();
        } else {
            super.setAlpha(f7);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f21553x && !this.f21575y7.isVoice()) || this.C9 == null || this.D9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.L;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.N.f49431b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f7) {
        if (this.Ae != f7) {
            this.Ae = f7;
            y4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f21429o8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f21402m9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Yb;
                int i10 = this.I7;
                org.telegram.ui.Components.g9 g9Var = this.f21418n9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.f21236ac = userProfilePhoto.photo_small;
                    } else {
                        this.f21236ac = null;
                    }
                    g9Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Yb, g9Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Zb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.f21236ac = chatPhoto.photo_small;
                    } else {
                        this.f21236ac = null;
                    }
                    if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId >= 0) {
                            TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            g9Var.m(i10, user2);
                            imageReceiver.setForUserOrChat(user2, g9Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        g9Var.k(i10, chat2);
                        imageReceiver.setForUserOrChat(chat2, g9Var);
                        return;
                    }
                    g9Var.k(i10, this.Zb);
                    imageReceiver.setForUserOrChat(this.Zb, g9Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", g9Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.f21236ac = null;
                    g9Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, g9Var, null, null, 0);
                    return;
                }
            }
            this.f21236ac = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Jc = l1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f21353j1 != z10) {
            this.f21353j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f21553x = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.I0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.ta != z10) {
            this.ta = z10;
            boolean z11 = this.J7;
            this.J7 = true;
            invalidate();
            this.J7 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f21303f8 != z10) {
            this.f21303f8 = z10;
            if (z10) {
                this.f21286e4 = null;
            }
            if (!z10) {
                this.f21359j8 = System.currentTimeMillis();
                this.f21317g8 = true;
                this.f21331h8 = 300;
            } else {
                this.f21317g8 = false;
                this.f21331h8 = 0;
            }
            s4();
            if (this.F5) {
                this.H5.f29253o = f3();
            } else {
                this.G5.f27017p = f3();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        U3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f21407me = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.m0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.J7 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.N0 = true;
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.f21393le = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        s4();
        if (this.F5) {
            this.H5.f29253o = f3();
        } else {
            this.G5.f27017p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.Id = f6Var;
        RadialProgress2 radialProgress2 = this.O0;
        if (radialProgress2 != null) {
            radialProgress2.F = f6Var;
        }
        RadialProgress2 radialProgress22 = this.P0;
        if (radialProgress22 != null) {
            radialProgress22.F = f6Var;
        }
        gm0 gm0Var = this.S3;
        if (gm0Var != null) {
            gm0Var.f24425n = f6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.N.C = num;
    }

    public void setSelectedBackgroundProgress(float f7) {
        this.Qc = f7;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.f21494se != z10) {
            this.f21494se = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f7) {
        if (this.f21597ze != f7) {
            this.f21597ze = f7;
            y4();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Ld;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((vh.h) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f21257c4;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.f21257c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f21257c4.textLayoutBlocks.get(i11);
                for (int i12 = 0; i12 < textLayoutBlock.spoilers.size(); i12++) {
                    textLayoutBlock.spoilers.get(i12).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            for (int i13 = 0; i13 < getMessageObject().textLayoutBlocks.size(); i13++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = getMessageObject().textLayoutBlocks.get(i13);
                for (int i14 = 0; i14 < textLayoutBlock2.spoilers.size(); i14++) {
                    textLayoutBlock2.spoilers.get(i14).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f7) {
        this.f21398m5 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final int t0() {
        if (this.f21510u1) {
            return 4;
        }
        return 8;
    }

    public final void t1(int i10, int i11, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if ((i11 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i10 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i10 & 2) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((i10 & 4) == 0 && z14 && z12 && !z13 && z11) {
            z15 = true;
        }
        if (this.Zc.h && !z15) {
            return;
        }
        this.f21364jd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f21392ld = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f21392ld.setInterpolator(qr.f27642f);
        this.f21350id = i10;
        this.f21335hd = i11;
        this.f21392ld.addUpdateListener(new ai.bb(2, this, z10));
        this.f21392ld.addListener(new ai.n(21, this, z10));
        this.f21379kd = true;
        this.f21392ld.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f21590z7;
        if (messageObject == null) {
            messageObject = this.f21575y7;
        }
        MessageObject messageObject2 = messageObject;
        this.f21575y7 = null;
        X3(messageObject2, this.K, this.F, this.E, this.G, false);
    }

    public final int t3(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.t3(int):int");
    }

    public final void t4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.t4():void");
    }

    public final boolean u0(MotionEvent motionEvent) {
        l1 l1Var;
        if (this.Pa == null || (l1Var = this.Jc) == null || !l1Var.e()) {
            return false;
        }
        boolean contains = this.Qa.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Ra == null) {
            this.Ra = new yc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Ra.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Ra.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ra.h) {
                this.Jc.e2(this);
            }
            this.Ra.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Ra.c(false);
        }
        return this.Ra.h;
    }

    public final void u1() {
        MessageObject messageObject;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f21575y7.hasMediaSpoilers() && !this.f21575y7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f21575y7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Jc != null && messageObject2.isSensitive()) {
                    this.Jc.A(this);
                    return;
                } else {
                    i4(this.f21310g1, this.f21324h1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f21575y7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f21575y7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Jc.S0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f21575y7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j3 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j3 != 0) {
                    user = MessagesController.getInstance(this.I7).getUser(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Jc.u0(this, user, this.f21310g1, this.f21324h1);
            } else if (i12 == 5) {
                if (this.O4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f21575y7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f21575y7);
                } else {
                    this.Jc.Q1(this, this.f21575y7);
                }
            } else if (i12 == 8) {
                int i13 = this.O4;
                if (i13 != -1 && (i13 != 1 || !this.A1 || !this.f21416n7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
            } else if (this.K1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f21575y7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.O4 == -1) {
                            this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        l1 l1Var2 = this.Jc;
                        if (l1Var2 != null) {
                            l1Var2.w0(this, this.f21310g1, this.f21324h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.O4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Jc.P1(this.f21575y7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                nf.f.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f21368k2) {
                        if (this.O4 == -1) {
                            this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (l1Var = this.Jc) != null) {
                        if (i14 == 16) {
                            l1Var.r0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            l1Var.C0(this, this.S4, this.T4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
            } else if (this.O4 != -1 && (!this.f21555x1 || (!this.f21416n7 && (((messageObject = this.f21575y7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.A1))))) {
                if (this.f21555x1) {
                    v1(true);
                    return;
                }
                int i16 = this.O4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
            }
        } else {
            int i17 = this.O4;
            if (i17 == -1) {
                this.Jc.w0(this, this.f21310g1, this.f21324h1, false);
            } else if (i17 == 0) {
                v1(false);
            }
        }
    }

    public final void u3(boolean z10) {
        int currentBackgroundLeft;
        float f7;
        int dp;
        int i10;
        float f10;
        int dp2;
        int currentBackgroundLeft2;
        boolean isOutOwner = this.f21575y7.isOutOwner();
        int i11 = 0;
        t1 t1Var = this.Zc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f21532v8 + t1Var.f21107g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f21409n0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f21532v8 + t1Var.f21107g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f21575y7.type == 19) {
                dp = 0;
            } else {
                if (!this.f21374k8 && this.J) {
                    f7 = 11.0f;
                } else {
                    f7 = 17.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            this.f21409n0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f11 = 4.0f;
        if (this.f21354j2) {
            this.f21409n0 = AndroidUtilities.dp(11.0f) + this.f21409n0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f21464r0 = dp3;
            StaticLayout staticLayout = this.B2;
            if (staticLayout != null) {
                this.f21464r0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f21368k2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f21464r0 = dp4;
            StaticLayout staticLayout2 = this.B2;
            if (staticLayout2 != null) {
                this.f21464r0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f21575y7.type == 19) {
            this.f21464r0 = AndroidUtilities.dp(6.0f) + this.Lc;
            if (!this.f21575y7.isOut()) {
                this.f21409n0 = getCurrentBackgroundLeft();
            } else {
                this.f21409n0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Lc;
            this.f21464r0 = dp5;
            MessageObject messageObject = this.f21575y7;
            float f12 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f21464r0;
                    if (this.Lc <= 0) {
                        f12 = -3.0f;
                    }
                    this.f21464r0 = AndroidUtilities.dp(f12) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f21464r0 = AndroidUtilities.dp(f12) + dp5;
                }
                if (this.f21575y7.hasCodeAtTop && this.Lc > 0) {
                    this.f21464r0 = AndroidUtilities.dp(5.0f) + this.f21464r0;
                }
            }
        }
        if (this.f21575y7.isSponsored()) {
            this.f21435p0 = AndroidUtilities.dp(14.0f) + this.f21464r0;
        } else if (this.f21496t1) {
            this.f21435p0 = AndroidUtilities.dp(10.0f) + this.f21464r0;
            this.f21464r0 = org.telegram.messenger.l0.C(13.0f, this.f21395m2, this.f21464r0);
            if (this.R2 && !this.f21368k2 && !this.f21575y7.isGiveawayOrGiveawayResults()) {
                this.f21464r0 = AndroidUtilities.dp(44.0f) + this.f21464r0;
            }
        } else {
            this.f21435p0 = AndroidUtilities.dp(10.0f) + this.f21575y7.textHeight(t1Var) + this.f21464r0;
        }
        if (this.f21496t1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f21575y7.textHeight(t1Var) + this.f21464r0;
        } else {
            int i13 = this.f21435p0 + this.f21395m2;
            if (this.R2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f10) + i13;
            if (this.f21395m2 <= 0) {
                f11 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f11) + dp6;
        }
        this.f21449q0 = dp2;
        this.f21421o0 = this.f21409n0;
        if (this.f21575y7.textXOffset != 0.0f && this.C9 != null) {
            int dp7 = this.J8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f21575y7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.K8) {
                int i15 = this.f21445pb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = rk.x(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f21409n0 = (i14 - getExtraTimeX()) + this.f21409n0;
            }
        }
    }

    public final void u4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i10;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText((String) secretTimeString));
                this.A4 = ceil;
                this.f21513u4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.j6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f21513u4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f21513u4.getLineWidth(0);
                }
                this.A4 = i11;
            }
            invalidate();
        }
    }

    public final boolean v0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.v0(android.view.MotionEvent):boolean");
    }

    public final void v1(boolean z10) {
        float f7;
        MessageObject messageObject;
        MessageObject messageObject2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i10;
        RadialProgress2 radialProgress2;
        int i11;
        MessageObject messageObject3;
        if (this.Jc != null && this.f21575y7.isSensitive() && this.f21575y7.hasMediaSpoilers() && !this.f21575y7.needDrawBluredPreview() && !this.f21575y7.isMediaSpoilersRevealed) {
            this.Jc.A(this);
            return;
        }
        MessageObject messageObject4 = this.f21575y7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f21575y7.putInDownloadsStore = true;
        }
        int i12 = this.O4;
        RadialProgress2 radialProgress22 = this.P0;
        int i13 = this.I7;
        ai.l4 l4Var = this.S0;
        RadialProgress2 radialProgress23 = this.O0;
        if (i12 == 0 && (!this.f21555x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f21575y7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f21575y7.mediaExists)) {
                if (z10) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f21287e5 != null && (l4Var.hasNotThumb() || this.f21301f5 == null)) {
                    photoSize = this.f21287e5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f21328h5;
                    } else {
                        str = this.f21342i5;
                    }
                } else {
                    photoSize = this.f21301f5;
                    str = this.f21342i5;
                }
                String str2 = str;
                if (this.f21575y7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f21575y7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    l4Var.setForceLoading(true);
                    l4Var.setImage(ImageLocation.getForObject(this.f21287e5, this.f21272d5), this.f21328h5, ImageLocation.getForObject(this.f21301f5, this.f21272d5), this.f21342i5, this.f21314g5, this.f21287e5.size, null, this.f21575y7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                    if (this.f21575y7.loadedFileSize > 0) {
                        q1(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f21461qd) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f21575y7.getDocument();
                        MessageObject messageObject6 = this.f21575y7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f21575y7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        l4Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        l4Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f21575y7, 0);
                    }
                    this.f21265cd = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                        if (this.f21575y7.loadedFileSize > 0) {
                            q1(this.L1);
                        }
                    } else {
                        int i17 = this.K1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 1, i10);
                            MessageObject messageObject8 = this.f21575y7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                l4Var.setForceLoading(true);
                                l4Var.setImage(ImageLocation.getForDocument(this.L1), null, ImageLocation.getForDocument(this.f21287e5, this.L1), this.f21342i5, this.L1.size, null, this.f21575y7, i10);
                                MessageObject messageObject9 = this.f21575y7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                            } else if (i17 == 8) {
                                l4Var.setImage(ImageLocation.getForDocument(this.L1), this.f21328h5, ImageLocation.getForDocument(this.f21287e5, this.L1), "b1", 0L, "jpg", this.f21575y7, 1);
                            }
                        } else {
                            l4Var.setForceLoading(true);
                            l4Var.setImage(ImageLocation.getForObject(this.f21287e5, this.f21272d5), this.f21328h5, ImageLocation.getForObject(this.f21301f5, this.f21272d5), this.f21342i5, this.f21314g5, 0L, null, this.f21575y7, 0);
                        }
                    }
                }
                this.f21575y7.loadingCancelled = false;
                this.O4 = 1;
                if (z10) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.X4 == 0) {
                FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                this.f21575y7.loadingCancelled = false;
            }
            if (this.Jc.Q1(this, this.f21575y7)) {
                if (this.W4 == 2 && this.X4 != 1) {
                    this.X4 = 1;
                    radialProgress23.o(0.0f, false);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                q4();
                this.O4 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 1 && (!this.f21555x1 || z10)) {
            l4Var.setForceLoading(false);
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f21575y7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f21575y7.isOut() && !this.f21555x1 && (this.f21575y7.isSending() || this.f21575y7.isEditing())) {
                    if (radialProgress23.f22351i.f22626q != 6) {
                        this.Jc.L(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f21575y7;
                messageObject10.loadingCancelled = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f21575y7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(l4Var);
                        l4Var.cancelLoadImage();
                    }
                } else {
                    FileLoader.getInstance(i13).cancelLoadFile(this.L1);
                }
                this.O4 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f21575y7)) {
                this.O4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f21575y7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Jc.w0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.X4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                    this.f21575y7.loadingCancelled = false;
                }
                if (this.Jc.Q1(this, this.f21575y7)) {
                    if (this.W4 == 2 && this.X4 != 1) {
                        this.X4 = 1;
                        radialProgress23.o(0.0f, false);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    q4();
                    this.O4 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f21461qd) {
                    this.f21265cd = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f21461qd) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            l4Var.setAllowStartAnimation(true);
                            l4Var.startAnimation();
                        }
                    } else {
                        l4Var.setAllowStartAnimation(true);
                        l4Var.startAnimation();
                    }
                    this.f21575y7.gifState = 0.0f;
                    this.O4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.L1, this.f21575y7, 2, 0);
                this.f21575y7.loadingCancelled = false;
                this.O4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f21575y7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f21575y7.isOut() && (this.f21575y7.isSending() || this.f21575y7.isEditing())) || this.f21575y7.isSendError()) {
                        l1 l1Var = this.Jc;
                        if (l1Var != null && radialProgress23.f22351i.f22626q != 6) {
                            l1Var.L(this);
                            return;
                        }
                        return;
                    }
                    this.f21575y7.loadingCancelled = true;
                    FileLoader.getInstance(i13).cancelLoadFile(this.L1);
                    this.O4 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.W4 == 2 && this.X4 != 1) {
                this.X4 = 1;
                f7 = 0.0f;
                radialProgress23.o(0.0f, false);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f7 = 0.0f;
            }
            l1 l1Var2 = this.Jc;
            if (l1Var2 != null) {
                l1Var2.w0(this, f7, f7, false);
            }
        }
    }

    public final ColorFilter v2(int i10, int i11) {
        if (this.Ce == null) {
            this.De = new int[3];
            this.Ce = new ColorFilter[3];
        }
        if (i11 != this.De[i10] || this.Ce[i10] == null) {
            ColorFilter[] colorFilterArr = this.Ce;
            this.De[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.Ce[i10];
    }

    public final void v4() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f21325h2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        t1 t1Var = this.Zc;
        boolean z10 = t1Var.f21173w0;
        f1 f1Var = this.G5;
        vo0 vo0Var = this.H5;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.J8;
            float f11 = i21;
            int i22 = (int) ((f11 - t1Var.f21125k0) + t1Var.f21130l0);
            int i23 = (int) ((f11 - t1Var.f21107g0) + t1Var.f21111h0);
            if (this.f21461qd && !this.f21456q8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (t1Var.f21125k0 == 0.0f && t1Var.f21130l0 == 0.0f) {
                i22 = i23;
            }
            if (vo0Var != null) {
                if (t1Var.f21139n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f21325h2) {
                        f10 = 0.0f;
                    }
                    int dp2 = dp - AndroidUtilities.dp(f10);
                    int dp3 = AndroidUtilities.dp(30.0f);
                    int i24 = i21 + i20;
                    if (!this.L5) {
                        i18 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i18 = 0;
                    }
                    int i25 = i24 + i18;
                    int i26 = i22 + i20;
                    if (this.L5) {
                        i19 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i19 = 0;
                    }
                    vo0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f21325h2) {
                        f10 = 0.0f;
                    }
                    vo0Var.h(dp4 - AndroidUtilities.dp(f10), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (f1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.K1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f21325h2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                f1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (vo0Var != null) {
            if (t1Var.f21139n1) {
                int dp5 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f21325h2) {
                    f7 = 10.0f;
                } else {
                    f7 = 0.0f;
                }
                int dp6 = dp5 - AndroidUtilities.dp(f7);
                int dp7 = AndroidUtilities.dp(30.0f);
                int i27 = this.J8 + i20;
                if (!this.L5) {
                    i13 = -AndroidUtilities.dp(34.0f);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (!this.f21325h2) {
                    f10 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f10);
                int i29 = this.J8 + i20;
                if (this.L5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                vo0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f21325h2) {
                    f10 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f10);
                vo0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (f1Var != null) {
            int useTranscribeButtonProgress2 = this.J8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.K1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f21325h2) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            f1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i11 + i12), AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        sh.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f21527v3;
            if (drawable == drawableArr[0] || drawable == this.f21528v4 || drawable == drawableArr[1] || drawable == this.Hc || drawable == this.K3 || drawable == this.f21595zc || ((this.N != null && (drawable instanceof org.telegram.ui.Components.n6)) || (drawable instanceof o90))) {
                return true;
            }
            sh.a aVar = this.f21230a6;
            if (aVar == null || (drawable != aVar && drawable != aVar.f43288a)) {
                ArrayList arrayList = this.Y5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s1 s1Var = (s1) obj;
                    if (s1Var.f20920w != drawable && ((bVar = s1Var.f20921x) == null || (drawable != bVar && drawable != bVar.f43278a && drawable != bVar.f43279b))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean w0(MotionEvent motionEvent) {
        int i10;
        float f7;
        int dp;
        ArrayList arrayList = this.f21428o7;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f21575y7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f21532v8;
                    if (this.f21374k8) {
                        f7 = 1.0f;
                    } else {
                        f7 = 7.0f;
                    }
                    dp = i11 + AndroidUtilities.dp(f7);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    e0 e0Var = (e0) arrayList.get(i12);
                    int dp2 = (e0Var.d + this.M8) - AndroidUtilities.dp(2.0f);
                    float f10 = x10;
                    float f11 = widthForButtons;
                    float f12 = (e0Var.f20157c * f11) + dp;
                    if (f10 >= f12 && f10 <= (e0Var.e * f11) + f12 && z22 >= dp2 && z22 <= e0Var.f20158f + dp2) {
                        this.f21531v7 = i12;
                        a3();
                        if (e0Var.f20170s == null) {
                            z Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nc, this.Id), 6, 6);
                            e0Var.f20170s = Y;
                            Y.setCallback(this);
                            z zVar = e0Var.f20170s;
                            int i13 = ((int) (e0Var.f20157c * f11)) + dp;
                            zVar.setBounds(i13, dp2, ((int) (e0Var.e * f11)) + i13, e0Var.f20158f + dp2);
                        }
                        e0Var.f20170s.setHotspot(f10, z22);
                        e0Var.f20170s.setState(this.A3);
                        e0Var.b(!e0Var.f20164m);
                        postDelayed(new ai.n8(this, this.f21531v7, 17), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f21531v7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f21531v7);
                    z zVar2 = e0Var2.f20170s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f21575y7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        l1 l1Var = this.Jc;
                        if (l1Var != null && !e0Var2.f20164m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f20161j;
                            if (buttonCustom != null) {
                                l1Var.E(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f20160i;
                                if (keyboardInlineButton != null) {
                                    l1Var.n1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f21531v7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f21531v7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i10);
                z zVar3 = e0Var3.f20170s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f21531v7 = -1;
                a3();
            }
        }
        return false;
    }

    public final void w1() {
        int i10;
        int i11;
        int i12 = this.X4;
        int i13 = this.I7;
        RadialProgress2 radialProgress2 = this.O0;
        if (i12 == 0) {
            this.X4 = 1;
            radialProgress2.o(0.0f, false);
            MessageObject messageObject = this.f21575y7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f21575y7.putInDownloadsStore = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.L1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.L1;
                    MessageObject messageObject2 = this.f21575y7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f21575y7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.L1;
                MessageObject messageObject3 = this.f21575y7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f21575y7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f21575y7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.X4 = 0;
            this.f21575y7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public vh.g w3() {
        return vh.g.e(this);
    }

    public final void w4() {
        char c10;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().z2() != null && getDelegate().z2().A(this.f21575y7)) {
            s9 z22 = getDelegate().z2();
            if (z22.f21071v0) {
                c10 = 2;
            } else if (z22.f21073x0) {
                c10 = 3;
            } else if (z22.f21075z0) {
                c10 = 4;
            } else if (P2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.f21354j2) {
                    i12 = this.f21421o0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f21368k2) {
                        i11 = this.f21421o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f21421o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().z2().c0(AndroidUtilities.dp(10.0f) + i12 + this.f21466r2, this.f21423o2);
            } else if (c10 == 1) {
                n4();
                getDelegate().z2().c0((int) this.f21439p4, (int) this.f21453q4);
            } else if (c10 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.K;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f21439p4;
                } else {
                    float f7 = 12.0f;
                    if (this.f21575y7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f21532v8;
                        if (this.f21575y7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f21374k8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f21532v8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f21532v8;
                            if (!this.J) {
                                f7 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f7) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Zc.f21107g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.f21449q0;
                n4();
                getDelegate().z2().c0((AndroidUtilities.dp(10.0f) + dp3) - this.f21241b2, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().z2().c0(this.f21409n0, this.f21464r0);
            }
        }
    }

    public final boolean x0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.x0(android.view.MotionEvent):boolean");
    }

    public final void x1() {
        MessageObject messageObject = this.f21575y7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            l1 l1Var = this.Jc;
            if (l1Var != null) {
                l1Var.E1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f21257c4;
        int i12 = 0;
        t1 t1Var = this.Zc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (vh.h hVar : textLayoutBlock2.spoilers) {
                    hVar.i((i10 - textLayoutBlock2.textYOffset(this.f21257c4.textLayoutBlocks, t1Var)) - this.f21439p4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.f21257c4.textLayoutBlocks, t1Var)) - this.f21453q4);
                }
            }
        }
        StaticLayout staticLayout = this.D9;
        if (staticLayout != null) {
            float height = (-this.H9) - staticLayout.getHeight();
            ArrayList arrayList2 = this.Ld;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList2.get(i14);
                i14++;
                ((vh.h) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (vh.h hVar2 : textLayoutBlock4.spoilers) {
                    hVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, t1Var)) - this.f21464r0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, t1Var)) - this.f21464r0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f21360j9) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof u1)) {
                            u1 u1Var = (u1) childAt;
                            if (u1Var.f21360j9 && u1Var.K == this.K) {
                                int i12 = u1Var.L.flags;
                                if ((i12 & 1) != 0 && (i12 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - u1Var.getLeft(), (z2(motionEvent) + getTop()) - u1Var.getTop(), 0);
                                    boolean y02 = u1Var.y0(obtain);
                                    obtain.recycle();
                                    return y02;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f21527v3;
            if (action == 0) {
                if (this.f21375k9.contains(x10, z22)) {
                    if (this.f21575y7.isSent()) {
                        this.f21557x3[1] = 2;
                        this.f21388l9 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, z22);
                            drawableArr[1].setState(this.A3);
                        }
                        c3();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f21388l9) {
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        if (this.f21261c8) {
                            l1Var.r(this);
                        } else {
                            l1Var.u(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f21388l9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f21388l9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, z22);
            }
        }
        return false;
    }

    public final void y1(Canvas canvas, float f7) {
        float f10;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f11;
        float f12;
        float f13;
        if (this.f21257c4 == null) {
            return;
        }
        float f14 = this.f21453q4;
        float f15 = this.f21439p4;
        t1 t1Var = this.Zc;
        if (t1Var.f21173w0) {
            if (t1Var.C0) {
                f14 -= getTranslationY();
                f13 = t1Var.f21107g0;
            } else if (t1Var.f21158s0) {
                float f16 = t1Var.K1;
                float f17 = 1.0f - f16;
                f15 = (f15 * f16) + (t1Var.f21150q0 * f17);
                f14 = (f14 * f16) + (f17 * t1Var.f21154r0);
            } else if (!this.f21575y7.isVoice() || !TextUtils.isEmpty(this.f21575y7.caption)) {
                f13 = t1Var.f21107g0;
            }
            f15 += f13;
        }
        float f18 = f15;
        float f19 = f14;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (t1Var.f21081a1) {
            float f20 = t1Var.K1;
            if (f20 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var.f21085b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.u5 u5Var = t1Var.O0;
                float f21 = (1.0f - f20) * f7;
                if (textLayoutBlocks != null) {
                    f11 = textLayoutBlocks.textXOffset;
                } else {
                    f11 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList, u5Var, false, f21, f11, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f21257c4;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.u5 u5Var2 = this.f21446pc;
                float f22 = f7 * t1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f12 = textLayoutBlocks2.textXOffset;
                } else {
                    f12 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList3, u5Var2, true, f22, f12, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f21257c4;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.u5 u5Var3 = this.f21446pc;
        if (textLayoutBlocks3 != null) {
            f10 = textLayoutBlocks3.textXOffset;
        } else {
            f10 = 0.0f;
        }
        z1(f18, f19, canvas, arrayList4, u5Var3, true, f7, f10, true);
    }

    public final org.telegram.ui.ActionBar.f5 y2(boolean z10) {
        boolean z11;
        if (z10) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.K.isDocuments && !this.J) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f21575y7.isOutOwner()) {
                if (!this.f21374k8 && !this.J && !z11) {
                    this.f21503t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOut");
                } else {
                    this.f21503t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f21374k8 && !this.J && !z11) {
                this.f21503t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgIn");
            } else {
                this.f21503t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgInMedia");
            }
        }
        this.f21503t8.f();
        return this.f21503t8;
    }

    public final float y3() {
        float f7;
        t1 t1Var = this.Zc;
        float f10 = 1.0f;
        if (t1Var.F1) {
            boolean z10 = this.f21510u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return AndroidUtilities.lerp(f7, f10, t1Var.K1);
        } else if (this.f21510u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i10;
        MessageObject messageObject = this.f21575y7;
        if (messageObject == null) {
            return;
        }
        float f7 = this.f21597ze + this.Ae;
        if (!messageObject.isOutOwner() || this.f21575y7.hasWideCode) {
            f7 += this.f21450q1;
        }
        if (this.F8 && !this.f21575y7.isOutOwner() && this.L != null) {
            if (z3()) {
                i10 = 48;
            } else {
                i10 = 0;
            }
            f7 += AndroidUtilities.dp(71 - i10) * this.H8;
        }
        setTranslationX(f7);
    }

    public final boolean z0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f21575y7.type == 12) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f21527v3;
            if (action == 0) {
                ArrayList arrayList = this.X2;
                int[] iArr = this.A3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.X2.size(); i10++) {
                        m1 m1Var = (m1) this.X2.get(i10);
                        float f7 = x10;
                        float f10 = z22;
                        if (m1Var.e.contains(f7, f10)) {
                            if (m1Var.f20642f == null) {
                                m1Var.f20642f = new yc(this);
                            }
                            m1Var.f20642f.c(true);
                            z zVar = m1Var.f20643g;
                            if (zVar != null) {
                                zVar.setHotspot(f7, f10);
                                m1Var.f20643g.setState(iArr);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
                float f11 = x10;
                float f12 = z22;
                if (this.Y2.contains(f11, f12)) {
                    this.Z2 = true;
                    this.f21535vc.c(true);
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setHotspot(f11, f12);
                        drawableArr[0].setState(iArr);
                    }
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.Z2) {
                    if (this.Jc != null) {
                        ArrayList arrayList2 = this.X2;
                        if (arrayList2 != null && arrayList2.size() == 1) {
                            this.Jc.Q0(((m1) this.X2.get(0)).f20639a, this);
                        } else {
                            this.Jc.Q0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.Z2 = false;
                    this.f21535vc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.X2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.X2.size(); i11++) {
                        m1 m1Var2 = (m1) this.X2.get(i11);
                        yc ycVar = m1Var2.f20642f;
                        if (ycVar != null && ycVar.h) {
                            l1 l1Var = this.Jc;
                            if (l1Var != null) {
                                l1Var.Q0(m1Var2.f20639a, this);
                            }
                            z zVar2 = m1Var2.f20643g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            m1Var2.f20642f.c(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.Z2 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                    return false;
                }
                ArrayList arrayList4 = this.X2;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.X2.size()) {
                            break;
                        }
                        m1 m1Var3 = (m1) this.X2.get(i12);
                        yc ycVar2 = m1Var3.f20642f;
                        if (ycVar2 != null && ycVar2.h) {
                            z zVar3 = m1Var3.f20643g;
                            if (zVar3 != null) {
                                zVar3.setHotspot(x10, z22);
                                return false;
                            }
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.u5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.u5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f21296f0) - this.f21323h0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.N7 || this.Q7 || ((this.f21442p8 && !this.T7) || (messageObject = this.f21575y7) == null || messageObject.isOutOwner() || !this.f21575y7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f21575y7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f21575y7;
                if (messageObject3 == null || !messageObject3.forceAvatar) {
                    if (messageObject3 != null && messageObject3.messageOwner.guestchat_via_from != null) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void z4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.z4():void");
    }

    public u1(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f21538w = new l.d(12);
        qr qrVar = qr.h;
        this.f21568y = new le.b(0, this, qrVar, 380L, false);
        this.N = new zg.p0(this);
        this.O = new wg.a(this);
        this.P = new wg.c(this);
        this.B0 = new Rect();
        this.F0 = -1;
        this.G0 = -1;
        this.R0 = new int[4];
        this.W2 = 0;
        this.f21340i3 = 45;
        this.f21527v3 = new Drawable[2];
        this.f21542w3 = new o1[2];
        this.f21557x3 = new int[2];
        this.y3 = new RectF();
        this.A3 = new int[]{16842910, 16842919};
        this.Z3 = -1;
        this.f21228a4 = -1;
        this.f21244b5 = new RectF();
        this.f21258c5 = new RectF();
        this.f21371k5 = -1;
        this.f21398m5 = 1.0f;
        this.f21414n5 = 1.0f;
        this.f21529v5 = -1;
        this.f21544w5 = new h90(this);
        this.f21588z5 = new ArrayList();
        this.A5 = new ArrayList();
        this.E5 = new Path();
        this.X5 = new ArrayList();
        this.Y5 = new ArrayList();
        this.f21343i6 = -1;
        this.f21357j6 = -1;
        this.f21385l6 = true;
        this.N6 = -1;
        this.f21428o7 = new ArrayList();
        new Path();
        this.f21441p7 = new HashMap();
        this.f21455q7 = new HashMap();
        this.K7 = -1;
        this.f21387l8 = true;
        this.f21456q8 = true;
        this.J8 = 100;
        this.f21375k9 = new Rect();
        this.E9 = new AtomicReference();
        this.Qa = new RectF();
        this.f21306fb = new StaticLayout[2];
        this.f21390lb = new float[2];
        this.f21520ub = true;
        this.f21579yb = new Path();
        this.f21594zb = new float[8];
        this.Jb = 1.0f;
        this.Qb = new Path();
        this.Rb = new float[8];
        this.Bc = new RectF();
        this.Cc = new RectF();
        this.Xc = Build.VERSION.SDK_INT == 28;
        this.Yc = 1.0f;
        this.Zc = new t1(this);
        this.f21280dd = new org.telegram.ui.Components.d6(this, 200L, qr.f27643g);
        this.f21321gd = new e1(0, this);
        this.f21433od = new e1(1, this);
        this.f21447pd = new SparseArray();
        this.Dd = -1;
        this.Fd = new m.c3();
        this.Ld = new ArrayList();
        this.Md = new Stack();
        this.Nd = new Path();
        this.Qd = new b1(2, this);
        this.Rd = new b1(3, this);
        this.Ud = false;
        this.Xd = -1L;
        this.f21365je = false;
        this.f21380ke = new b1(10, this);
        this.f21494se = true;
        this.f21552we = 1.0f;
        this.Be = new d1(Float.class, "animationOffsetX", 0);
        this.I7 = i10;
        this.Id = f6Var;
        this.Jd = z10;
        this.Kd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Kd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f30211a = new Paint(1);
        drawable.f30212b = null;
        drawable.h = -1.0f;
        drawable.f30216i = -1.0f;
        drawable.f30217j = -1.0f;
        drawable.f30218k = -1.0f;
        drawable.f30220m = this;
        this.Kc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f21402m9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f21418n9 = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.F9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f21473r9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.H7 = DownloadController.getInstance(i10).generateObserverTag();
        this.V0 = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        ai.l4 l4Var = new ai.l4(this, this, 2);
        this.S0 = l4Var;
        l4Var.setAllowLoadingOnAttachedOnly(true);
        l4Var.setUseRoundForThumbDrawable(true);
        l4Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.T0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.O0 = new RadialProgress2(this, f6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.P0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        f1 f1Var = new f1(this, this);
        this.G5 = f1Var;
        f1Var.h = this;
        ?? obj = new Object();
        obj.f29242a = 0;
        obj.f29243b = 0;
        obj.e = false;
        obj.f29245f = false;
        obj.f29257s = 1.0f;
        obj.f29258t = 1.0f;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(125L, 600L, qrVar);
        obj.v = d6Var;
        obj.f29260w = 1.0f;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(150L, qr.f27642f);
        obj.B = d6Var2;
        obj.J = false;
        if (vo0.N == null) {
            vo0.N = new Paint(1);
            vo0.O = new Paint(1);
            Paint paint = vo0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            vo0.O.setStyle(style);
        }
        this.H5 = obj;
        obj.f29249k = this;
        obj.f29252n = this;
        d6Var2.f23499a = this;
        d6Var.f23499a = this;
        this.I5 = new g1(this);
        ?? drawable2 = new Drawable();
        drawable2.f24415a = 0L;
        drawable2.f24416b = false;
        drawable2.f24417c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f24418f = 0.32f;
        drawable2.f24419g = 1;
        drawable2.h = 1;
        drawable2.f24420i = 1;
        drawable2.f24424m = 255;
        drawable2.f24425n = f6Var;
        drawable2.f24421j = this;
        this.S3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f5 f5Var = this.f21503t8;
        int i13 = this.J0;
        int i14 = this.K0;
        if (i14 == 0) {
            i13 = getParentWidth();
            i14 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i12 = view.getMeasuredWidth();
                i11 = view.getMeasuredHeight();
                float f7 = this.L0;
                f5Var.o((int) (i10 + f7), i12, i11, (int) f7, this.Uc, this.Vc, this.E, (this.F && this.Zc.f21185z0 == 1.0f) ? false : true);
                f5Var.f18882u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.L0;
        f5Var.o((int) (i10 + f72), i12, i11, (int) f72, this.Uc, this.Vc, this.E, (this.F && this.Zc.f21185z0 == 1.0f) ? false : true);
        f5Var.f18882u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        l1 l1Var;
        if (this.f21575y7 == null) {
            return;
        }
        Runnable runnable = this.f21393le;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f21407me;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.J7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Od || (l1Var = this.Jc) == null) {
            return;
        }
        l1Var.p();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
