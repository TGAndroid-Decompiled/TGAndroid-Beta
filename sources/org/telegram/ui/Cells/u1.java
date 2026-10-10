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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j20;
import org.telegram.ui.qv0;
import org.telegram.ui.sm;
import org.telegram.ui.vj0;
public class u1 extends a0 implements gp0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, w9, NotificationCenter.NotificationCenterDelegate, me.d, o4 {
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
    public vh.g Ab;
    public Path Ac;
    public float Ad;
    public float Ae;
    public final Rect B0;
    public int B1;
    public StaticLayout B2;
    public float B3;
    public m11 B4;
    public ja0 B5;
    public boolean B6;
    public boolean B7;
    public n61 B8;
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
    public m11 C4;
    public ArrayList C5;
    public boolean C6;
    public boolean C7;
    public n61 C8;
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
    public m11 D4;
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
    public k4 F7;
    public boolean F8;
    public final ImageReceiver F9;
    public float[] Fa;
    public vh.f Fb;
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
    public bd Gc;
    public c81 Gd;
    public boolean H;
    public boolean H0;
    public int H1;
    public boolean H2;
    public Path H3;
    public boolean H4;
    public final op0 H5;
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
    public bd I2;
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
    public org.telegram.ui.ActionBar.e6 Id;
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
    public final sb0 Kc;
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
    public final zg.o0 N;
    public boolean N0;
    public boolean N1;
    public StaticLayout N2;
    public int N3;
    public int N4;
    public float N5;
    public int N6;
    public boolean N7;
    public org.telegram.ui.Components.o9 N8;
    public int N9;
    public boolean Na;
    public int Nb;
    public int Nc;
    public final Path Nd;
    public final wg.a O;
    public final RadialProgress2 O0;
    public m11 O1;
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
    public m11 P1;
    public float P2;
    public int P3;
    public int P4;
    public StaticLayout P5;
    public float P6;
    public boolean P7;
    public Paint P8;
    public boolean P9;
    public StaticLayout Pa;
    public vh.g Pb;
    public int Pc;
    public BotForumHelper.BotDraftAnimationsPool Pd;
    public boolean Q;
    public boolean Q0;
    public bd Q1;
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
    public bd R1;
    public boolean R2;
    public boolean R3;
    public int R4;
    public int R5;
    public int R6;
    public boolean R7;
    public CheckBoxBase[] R8;
    public boolean R9;
    public bd Ra;
    public final float[] Rb;
    public boolean Rc;
    public final b1 Rd;
    public m11 S;
    public final ai.m4 S0;
    public StaticLayout S1;
    public boolean S2;
    public final cn0 S3;
    public int S4;
    public int S5;
    public d31 S6;
    public boolean S7;
    public q50 S8;
    public boolean S9;
    public RectF Sa;
    public StaticLayout Sb;
    public float Sc;
    public boolean Sd;
    public z90 T;
    public final ImageReceiver T0;
    public StaticLayout T1;
    public boolean T2;
    public StaticLayout T3;
    public int T4;
    public StaticLayout T5;
    public org.telegram.ui.Components.g6 T6;
    public boolean T7;
    public ja0 T8;
    public org.telegram.ui.Components.g6 T9;
    public tg.a Ta;
    public int Tb;
    public int Tc;
    public boolean Td;
    public CornerPathEffect U;
    public ColorMatrixColorFilter U0;
    public ca0 U1;
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
    public final org.telegram.ui.Components.j9 V0;
    public ga0 V1;
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
    public uq W0;
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
    public org.telegram.ui.Components.l9 X3;
    public int X4;
    public final ArrayList X5;
    public boolean X6;
    public boolean X7;
    public org.telegram.ui.Components.j9[] X8;
    public int X9;
    public float Xa;
    public String Xb;
    public final boolean Xc;
    public long Xd;
    public ci.l Y0;
    public int Y1;
    public RectF Y2;
    public m11 Y3;
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
    public ym0 Z9;
    public boolean Za;
    public TLRPC.Chat Zb;
    public final t1 Zc;
    public int Zd;
    public m11 f23113a0;
    public dk0 f23114a1;
    public j20 a2;
    public boolean f23115a3;
    public int f23116a4;
    public boolean f23117a5;
    public sh.a f23118a6;
    public float f23119a7;
    public boolean f23120a8;
    public org.telegram.ui.Components.j6 f23121a9;
    public ym0 f23122aa;
    public boolean f23123ab;
    public TLRPC.FileLocation f23124ac;
    public boolean f23125ad;
    public int f23126ae;
    public z90 f23127b0;
    public Paint f23128b1;
    public int f23129b2;
    public int f23130b3;
    public int f23131b4;
    public final RectF f23132b5;
    public qh.g f23133b6;
    public float f23134b7;
    public long f23135b8;
    public boolean f23136b9;
    public ym0 f23137ba;
    public float f23138bb;
    public String f23139bc;
    public boolean f23140bd;
    public int f23141be;
    public CornerPathEffect f23142c0;
    public Paint f23143c1;
    public int f23144c2;
    public CharSequence f23145c3;
    public MessageObject.TextLayoutBlocks f23146c4;
    public final RectF f23147c5;
    public qh.g f23148c6;
    public int f23149c7;
    public boolean f23150c8;
    public int f23151c9;
    public ym0 f23152ca;
    public float cb;
    public Object f23153cc;
    public boolean cd;
    public float f23154ce;
    public int f23155d0;
    public Paint f23156d1;
    public int f23157d2;
    public int f23158d3;
    public MessageObject.TextLayoutBlocks f23159d4;
    public TLObject f23160d5;
    public int f23161d6;
    public int f23162d7;
    public boolean f23163d8;
    public int f23164d9;
    public ym0 f23165da;
    public StaticLayout f23166db;
    public long f23167dc;
    public final org.telegram.ui.Components.g6 f23168dd;
    public float f23169de;
    public h31 f23170e0;
    public ey0 f23171e1;
    public int f23172e2;
    public float f23173e3;
    public tj0 f23174e4;
    public TLRPC.PhotoSize f23175e5;
    public int f23176e6;
    public boolean e7;
    public boolean f23177e8;
    public boolean f23178e9;
    public ym0 f23179ea;
    public int f23180eb;
    public String ec;
    public FlagSecureReason f23181ed;
    public org.telegram.ui.Components.m8 f23182ee;
    public boolean f23183f;
    public int f23184f0;
    public boolean f23185f1;
    public int f23186f2;
    public int f23187f3;
    public CharSequence f23188f4;
    public TLRPC.PhotoSize f23189f5;
    public int f23190f6;
    public String f7;
    public boolean f23191f8;
    public int f23192f9;
    public int f23193fa;
    public final StaticLayout[] f23194fb;
    public org.telegram.ui.Components.q5 f23195fc;
    public boolean f23196fd;
    public NotificationCenter.ObserversGroup f23197fe;
    public rz0 f23198g0;
    public float f23199g1;
    public int f23200g2;
    public int f23201g3;
    public StaticLayout f23202g4;
    public BitmapDrawable f23203g5;
    public float f23204g6;
    public TLRPC.Message f23205g7;
    public boolean f23206g8;
    public int f23207g9;
    public Drawable ga;
    public int f23208gb;
    public org.telegram.ui.Components.q5 gc;
    public final e1 f23209gd;
    public boolean ge;
    public boolean h;
    public int f23210h0;
    public float f23211h1;
    public boolean f23212h2;
    public int f23213h3;
    public MessageObject.TextLayoutBlocks f23214h4;
    public String f23215h5;
    public float f23216h6;
    public boolean f23217h7;
    public int f23218h8;
    public int f23219h9;
    public boolean ha;
    public boolean f23220hb;
    public TLRPC.User f23221hc;
    public int f23222hd;
    public boolean f23223he;
    public long f23224i0;
    public boolean f23225i1;
    public boolean f23226i2;
    public int f23227i3;
    public CharSequence f23228i4;
    public String f23229i5;
    public int f23230i6;
    public int f23231i7;
    public float f23232i8;
    public int f23233i9;
    public yh.b8 f23234ia;
    public float f23235ib;
    public TLRPC.User f23236ic;
    public int f23237id;
    public vj0 f23238ie;
    public int f23239j0;
    public boolean f23240j1;
    public boolean f23241j2;
    public LinearGradient j3;
    public int f23242j4;
    public Drawable f23243j5;
    public int f23244j6;
    public int f23245j7;
    public long f23246j8;
    public boolean f23247j9;
    public int f23248ja;
    public int f23249jb;
    public TLRPC.Chat f23250jc;
    public float f23251jd;
    public boolean f23252je;
    public bd f23253k0;
    public CheckBoxBase f23254k1;
    public boolean f23255k2;
    public dd0 f23256k3;
    public int f23257k4;
    public int f23258k5;
    public float f23259k6;
    public boolean f23260k7;
    public boolean f23261k8;
    public final Rect f23262k9;
    public z f23263ka;
    public int f23264kb;
    public String f23265kc;
    public boolean f23266kd;
    public final b1 f23267ke;
    public org.telegram.ui.Components.q5 f23268l0;
    public CheckBoxBase l1;
    public boolean f23269l2;
    public int f23270l3;
    public int l4;
    public boolean f23271l5;
    public boolean f23272l6;
    public boolean f23273l7;
    public boolean f23274l8;
    public boolean f23275l9;
    public m11 f23276la;
    public final float[] f23277lb;
    public String f23278lc;
    public ValueAnimator f23279ld;
    public Runnable f23280le;
    public boolean m0;
    public boolean f23281m1;
    public int f23282m2;
    public int f23283m3;
    public Drawable f23284m4;
    public float f23285m5;
    public boolean f23286m6;
    public float f23287m7;
    public boolean f23288m8;
    public final ImageReceiver f23289m9;
    public m11 f23290ma;
    public float f23291mb;
    public boolean f23292mc;
    public int f23293md;
    public Runnable f23294me;
    public int f23295n;
    public int f23296n0;
    public boolean f23297n1;
    public int f23298n2;
    public int f23299n3;
    public int f23300n4;
    public float f23301n5;
    public boolean f23302n6;
    public boolean f23303n7;
    public boolean f23304n8;
    public final org.telegram.ui.Components.j9 f23305n9;
    public int f23306na;
    public float nb;
    public boolean nc;
    public float f23307nd;
    public int f23308ne;
    public int f23309o0;
    public float f23310o1;
    public int f23311o2;
    public int f23312o3;
    public int f23313o4;
    public long f23314o5;
    public boolean f23315o6;
    public final ArrayList f23316o7;
    public boolean f23317o8;
    public boolean o9;
    public int f23318oa;
    public StaticLayout f23319ob;
    public boolean f23320oc;
    public final e1 f23321od;
    public int oe;
    public int f23322p0;
    public long f23323p1;
    public int f23324p2;
    public int f23325p3;
    public float f23326p4;
    public long p5;
    public boolean f23327p6;
    public final HashMap f23328p7;
    public boolean f23329p8;
    public boolean f23330p9;
    public org.telegram.ui.Components.g6 f23331pa;
    public int f23332pb;
    public org.telegram.ui.Components.x5 f23333pc;
    public final SparseArray f23334pd;
    public boolean f23335pe;
    public int f23336q0;
    public int f23337q1;
    public int f23338q2;
    public boolean f23339q3;
    public float f23340q4;
    public boolean f23341q5;
    public boolean q6;
    public final HashMap f23342q7;
    public boolean f23343q8;
    public boolean f23344q9;
    public z90 f23345qa;
    public int f23346qb;
    public org.telegram.ui.Components.x5 f23347qc;
    public boolean f23348qd;
    public float f23349qe;
    public m3 f23350r;
    public int f23351r0;
    public org.telegram.ui.g5 f23352r1;
    public int f23353r2;
    public boolean f23354r3;
    public int f23355r4;
    public boolean f23356r5;
    public boolean f23357r6;
    public String f23358r7;
    public int f23359r8;
    public final ImageReceiver f23360r9;
    public ja0 f23361ra;
    public int f23362rb;
    public org.telegram.ui.Components.x5 f23363rc;
    public boolean rd;
    public Paint f23364re;
    public boolean f23365s;
    public int f23366s0;
    public z10 f23367s1;
    public int f23368s2;
    public boolean f23369s3;
    public int f23370s4;
    public org.telegram.ui.Components.b6 f23371s5;
    public boolean f23372s6;
    public int f23373s7;
    public boolean f23374s8;
    public int f23375s9;
    public ArrayList f23376sa;
    public int f23377sb;
    public org.telegram.ui.Components.x5 f23378sc;
    public float f23379sd;
    public boolean f23380se;
    public int f23381t0;
    public boolean f23382t1;
    public int f23383t2;
    public bd f23384t3;
    public int f23385t4;
    public ga0 f23386t5;
    public boolean f23387t6;
    public boolean f23388t7;
    public org.telegram.ui.ActionBar.f5 f23389t8;
    public Drawable[] f23390t9;
    public boolean ta;
    public CharSequence f23391tb;
    public org.telegram.ui.Components.x5 f23392tc;
    public float f23393td;
    public sz0 f23394te;
    public int f23395u0;
    public boolean f23396u1;
    public int f23397u2;
    public int f23398u3;
    public StaticLayout f23399u4;
    public MessageObject.TextLayoutBlock f23400u5;
    public boolean f23401u6;
    public boolean f23402u7;
    public org.telegram.ui.ActionBar.f5 f23403u8;
    public int[] f23404u9;
    public int f23405ua;
    public boolean f23406ub;
    public bd f23407uc;
    public float f23408ud;
    public Paint f23409ue;
    public o0 v;
    public int f23410v0;
    public boolean f23411v1;
    public int f23412v2;
    public final Drawable[] f23413v3;
    public org.telegram.ui.Components.q6 f23414v4;
    public int f23415v5;
    public long f23416v6;
    public int f23417v7;
    public int f23418v8;
    public Drawable v9;
    public boolean f23419va;
    public boolean f23420vb;
    public bd f23421vc;
    public float f23422vd;
    public Paint f23423ve;
    public final zh0 f23424w;
    public int f23425w0;
    public boolean f23426w1;
    public int f23427w2;
    public final o1[] f23428w3;
    public org.telegram.ui.Components.q6 f23429w4;
    public final ca0 f23430w5;
    public String f23431w6;
    public vh.g f23432w7;
    public int f23433w8;
    public Drawable f23434w9;
    public int f23435wa;
    public Paint f23436wb;
    public bd f23437wc;
    public long f23438wd;
    public float f23439we;
    public boolean f23440x;
    public int f23441x0;
    public boolean f23442x1;
    public int f23443x2;
    public final int[] f23444x3;
    public yf.n f23445x4;
    public int f23446x5;
    public int f23447x6;
    public boolean f23448x7;
    public int f23449x8;
    public int f23450x9;
    public boolean f23451xa;
    public Path f23452xb;
    public float xc;
    public float f23453xd;
    public int f23454xe;
    public final me.b f23455y;
    public boolean f23456y0;
    public long f23457y1;
    public float f23458y2;
    public final RectF y3;
    public StaticLayout f23459y4;
    public boolean f23460y5;
    public boolean f23461y6;
    public MessageObject f23462y7;
    public int f23463y8;
    public boolean f23464y9;
    public boolean f23465ya;
    public final Path f23466yb;
    public float yc;
    public float f23467yd;
    public MessageObject.TextLayoutBlocks f23468ye;
    public boolean f23469z0;
    public boolean f23470z1;
    public float f23471z2;
    public ja0 f23472z3;
    public long f23473z4;
    public final ArrayList f23474z5;
    public boolean f23475z6;
    public MessageObject f23476z7;
    public int f23477z8;
    public boolean f23478z9;
    public boolean f23479za;
    public final float[] f23480zb;
    public z f23481zc;
    public int f23482zd;
    public float f23483ze;

    public u1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static void A3(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new a4.d(29));
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
        u11 u11Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof s61) && (u11Var = ((s61) characterStyle).f30695a) != null && (messageEntity = u11Var.d) != null) {
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
            if (l1Var == null || l1Var.S()) {
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
        if (this.Zb != null && (messageObject = this.f23462y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f23462y7.messageOwner.from_id);
            int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            int i11 = this.I7;
            if (i10 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    return DialogObject.getBotVerificationIcon(user2);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
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
            MessageObject messageObject = this.f23462y7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f23462y7.messageOwner.from_id);
                int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                int i11 = this.I7;
                if (i10 >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                    if (user2 != null) {
                        return UserObject.getUserName(user2);
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        return chat.title;
                    }
                }
            }
            return this.Zb.title;
        }
        MessageObject messageObject2 = this.f23462y7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f23462y7.sponsoredTitle;
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
        } else if (this.Zb != null && (messageObject = this.f23462y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f23462y7.messageOwner.from_id);
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
        if (!this.f23462y7.isOutOwner() && ((!this.f23261k8 || this.f23146c4 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f23462y7.isOutOwner() && this.rd && this.f23317o8 && this.f23462y7.type == 5) {
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
        MessageObject messageObject = this.f23462y7;
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
        if (this.f23123ab) {
            if (this.Pa == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.i6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f7;
        float f10;
        t1 t1Var = this.Zc;
        if (t1Var.P2) {
            boolean z10 = this.f23123ab;
            f7 = AndroidUtilities.lerp(!z10, z10, t1Var.K1);
        } else if (this.f23123ab) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.i6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
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
        TLRPC.MessageReplies messageReplies2 = this.f23462y7.messageOwner.replies;
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
        return this.f23462y7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.Id;
        if (e6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.i6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21081sa;
        }
        return e6Var.x0(i10);
    }

    private float getUseTranscribeButtonProgress() {
        t1 t1Var = this.Zc;
        if (t1Var.f22989n1) {
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
        m1Var.f22446a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.i6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.i6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        m1Var.d = staticLayout;
        m1Var.f22447b = f7;
        if (staticLayout.getLineCount() > 0) {
            m1Var.f22448c = ((float) (m1Var.f22447b - Math.ceil(m1Var.d.getLineWidth(0)))) / 2.0f;
            m1Var.f22448c -= (int) m1Var.d.getLineLeft(0);
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
        if (this.f23384t3 == null) {
            this.f23384t3 = new bd(this);
        }
        bd bdVar = this.f23384t3;
        this.f23369s3 = z10;
        bdVar.c(z10);
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
        return nx0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), TextUtils.TruncateAt.END, i18, i13, true);
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
        if (this.f23462y7.isImportedForward()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                float f10 = this.f23291mb;
                if (f7 >= f10 && f7 <= f10 + this.f23332pb) {
                    float f11 = z22;
                    float f12 = this.nb;
                    if (f11 >= f12 && f11 <= f12 + AndroidUtilities.dp(20.0f)) {
                        this.f23271l5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f23271l5) {
                this.f23271l5 = false;
                playSoundEffect(0);
                this.Jc.q1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void A1(Canvas canvas, float f7) {
        vj0 vj0Var;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f10 = this.f23351r0;
            t1 t1Var = this.Zc;
            if (t1Var.f22981l2) {
                float f11 = t1Var.f22990n2;
                float f12 = t1Var.K1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (t1Var.K1 != 1.0f && t1Var.G0 && ((vj0Var = this.f23238ie) == null || !vj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f23389t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f23296n0, f13, canvas, t1Var.H0, t1Var.O0, false, (1.0f - t1Var.K1) * f7, this.f23462y7.textXOffset, false);
                MessageObject messageObject2 = this.f23462y7;
                z1(this.f23296n0, f13, canvas, messageObject2.textLayoutBlocks, this.f23333pc, true, f7 * t1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f23462y7;
                z1(this.f23296n0, f13, canvas, messageObject3.textLayoutBlocks, this.f23333pc, true, f7, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f7);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f23217h7) {
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f23224i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f7);
        float f11 = this.f23332pb;
        if (this.f23462y7.sendPreview) {
            f10 = 1.0f - this.f23285m5;
        }
        int dp2 = ((int) ((f11 * f10) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f23332pb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f23253k0 == null) {
                    this.f23253k0 = new bd(this);
                }
                this.Ud = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Ud = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Ud && (l1Var = this.Jc) != null) {
                l1Var.G(this);
            }
            this.Ud = false;
        } else if (motionEvent.getAction() == 3) {
            this.Ud = false;
        }
        bd bdVar = this.f23253k0;
        if (bdVar != null) {
            bdVar.c(this.Ud);
        }
        return this.Ud;
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f7;
        tj0 tj0Var;
        float f10;
        if (!this.f23240j1 && this.f23206g8) {
            int i10 = this.f23218h8;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (tj0Var = this.f23174e4) != null) {
            return (1.0f - tj0Var.f31159k.d(1.0f, false)) * f7;
        }
        return f7;
    }

    public final z90 B3() {
        z90 z90Var;
        ArrayList arrayList = this.f23474z5;
        if (!arrayList.isEmpty()) {
            z90Var = (z90) arrayList.get(0);
            arrayList.remove(0);
        } else {
            z90Var = new z90(0);
        }
        z90Var.reset();
        this.A5.add(z90Var);
        return z90Var;
    }

    public final boolean C0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Jd && (messageObject = this.f23462y7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Da, this.Id) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f23462y7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f23462y7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f23146c4 != null) {
            for (int i11 = 0; i11 < this.f23146c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.f23146c4.textLayoutBlocks.get(i11);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
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
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.I7;
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (i10 < 0 && (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3))) != null) {
            return chat.title;
        } else {
            return null;
        }
    }

    public final void D3() {
        this.Z2 = false;
        bd bdVar = this.f23421vc;
        if (bdVar != null) {
            bdVar.c(false);
        }
        Drawable drawable = this.f23413v3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.X2 != null) {
            for (int i10 = 0; i10 < this.X2.size(); i10++) {
                m1 m1Var = (m1) this.X2.get(i10);
                bd bdVar2 = m1Var.f22450f;
                if (bdVar2 != null) {
                    bdVar2.c(false);
                }
                z zVar = m1Var.f22451g;
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
        ca0 ca0Var = this.f23430w5;
        if (this.f23241j2) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.M1 && this.f23426w1 && this.O4 != -1 && x10 >= (i11 = this.K4) && x10 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.L4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.O0.f24270i.f31776q != 4) {
                    this.P4 = 1;
                    invalidate();
                    return true;
                }
                if (this.M1) {
                    if (this.S0.isInsideImage(x10, z22)) {
                        this.f23460y5 = true;
                        return true;
                    }
                }
                if (this.K2 != null && z22 >= this.f23311o2) {
                    try {
                        int dp = x10 - ((this.f23309o0 + AndroidUtilities.dp(10.0f)) + this.f23353r2);
                        int i13 = z22 - this.f23311o2;
                        int lineForVertical = this.K2.getLineForVertical(i13);
                        float f7 = dp;
                        int offsetForHorizontal = this.K2.getOffsetForHorizontal(lineForVertical, f7);
                        float lineLeft = this.K2.getLineLeft(lineForVertical);
                        if (lineLeft <= f7 && lineLeft + this.K2.getLineWidth(lineForVertical) >= f7) {
                            Spannable spannable = (Spannable) this.f23462y7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof r61) || r61.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                ga0 ga0Var = this.f23386t5;
                                if (ga0Var == null || ga0Var.f26673i != clickableSpanArr[0]) {
                                    ca0Var.k(ga0Var, true);
                                    ga0 ga0Var2 = new ga0(clickableSpanArr[0], this.Id, f7, i13, 0);
                                    this.f23386t5 = ga0Var2;
                                    if (this.f23462y7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.i6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.i6.Ld;
                                    }
                                    ga0Var2.d(org.telegram.ui.ActionBar.i6.w0(i10, this.Id));
                                    this.f23410v0 = -10;
                                    this.f23446x5 = 2;
                                    try {
                                        z90 b10 = this.f23386t5.b();
                                        int[] J2 = J2(spannable, this.f23386t5.f26673i);
                                        b10.d(this.K2, J2[0], 0.0f);
                                        this.K2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    ca0Var.a(this.f23386t5, 2);
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f23446x5 != 2 && !this.f23460y5 && this.P4 == 0) {
                    F3(2);
                    return false;
                } else if (this.P4 != 0) {
                    this.P4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    ga0 ga0Var3 = this.f23386t5;
                    if (ga0Var3 != null) {
                        CharacterStyle characterStyle = ga0Var3.f26673i;
                        if (characterStyle instanceof URLSpan) {
                            of.f.s(getContext(), ((URLSpan) this.f23386t5.f26673i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f23460y5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f23316o7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i14);
                        if (zf.c.c(e0Var.f22008i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Jc.s1(this, e0Var.f22008i);
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
        if (!this.f23462y7.isMediaSpoilersRevealed && this.Bb != 1.0f) {
            ai.m4 m4Var = this.S0;
            int[] roundRadius = m4Var.getRoundRadius();
            float f7 = roundRadius[0];
            float[] fArr = this.f23480zb;
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
            Path path = this.f23466yb;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(m4Var.getImageX(), m4Var.getImageY(), m4Var.getImageX2(), m4Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.Bb != 0.0f) {
                path.rewind();
                path.addCircle(this.Cb, this.Db, this.Eb * this.Bb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f23462y7.needDrawBluredPreview()) {
                m4Var.draw(canvas);
            } else {
                float imageX = m4Var.getImageX();
                float imageY = m4Var.getImageY();
                float imageWidth = m4Var.getImageWidth();
                float imageHeight = m4Var.getImageHeight();
                ImageReceiver imageReceiver = this.T0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(m4Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        is isVar;
        float f7 = this.f23483ze;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f23281m1) || this.f23297n1)) {
                if (z11) {
                    isVar = is.f27444g;
                } else {
                    isVar = is.f27445i;
                }
                this.f23337q1 = (int) Math.ceil(isVar.getInterpolation(this.f23310o1) * AndroidUtilities.dp(35.0f));
                if (this.f23462y7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f23337q1 = 0;
                    }
                }
            }
            f7 += this.f23337q1;
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
                ((s1) arrayList.get(i10)).f22766w.setState(StateSet.NOTHING);
            }
        }
        sh.a aVar = this.f23118a6;
        if (aVar != null) {
            aVar.f48220a.setState(StateSet.NOTHING);
        }
    }

    public final void F0() {
        int i10;
        boolean z10 = this.M0;
        boolean z11 = this.ge;
        ai.m4 m4Var = this.S0;
        if (z10 != z11) {
            this.ge = z10;
            ImageReceiver imageReceiver = this.T0;
            ImageReceiver imageReceiver2 = this.f23360r9;
            ImageReceiver imageReceiver3 = this.F9;
            wg.c cVar = this.P;
            wg.a aVar = this.O;
            ArrayList arrayList = this.Y5;
            RadialProgress2 radialProgress2 = this.P0;
            RadialProgress2 radialProgress22 = this.O0;
            if (z10) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.o9 o9Var = this.N8;
                if (o9Var != null) {
                    o9Var.a();
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
                qh.g gVar = this.f23133b6;
                if (gVar != null) {
                    gVar.a();
                }
                qh.g gVar2 = this.f23148c6;
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
                ImageReceiver[] imageReceiverArr2 = aVar.f50384a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = cVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = cVar.f50410a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (m4Var.onAttachedToWindow()) {
                    if (this.M1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.f23347qc = org.telegram.ui.Components.b6.update(0, (View) this, false, this.f23347qc, this.D9);
                this.f23363rc = org.telegram.ui.Components.b6.update(0, (View) this, false, this.f23363rc, this.K2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.o9 o9Var2 = this.N8;
                if (o9Var2 != null) {
                    o9Var2.b();
                }
                qh.g gVar3 = this.f23133b6;
                if (gVar3 != null) {
                    gVar3.f46725b.onDetachedFromWindow();
                    gVar3.f46739x.f();
                }
                qh.g gVar4 = this.f23148c6;
                if (gVar4 != null) {
                    gVar4.f46725b.onDetachedFromWindow();
                    gVar4.f46739x.f();
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
                m4Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = aVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = aVar.f50384a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = cVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = cVar.f50410a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.b6.release(this, this.f23363rc);
                org.telegram.ui.Components.b6.release(this, this.f23347qc);
                org.telegram.ui.Components.b6.release(this, this.f23333pc);
            }
        }
        boolean z12 = this.M0;
        if (z12 != this.f23223he) {
            this.f23223he = z12;
            int i15 = this.I7;
            if (z12) {
                MessageObject messageObject = this.f23462y7;
                if (m4Var != null) {
                    m4Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f23348qd || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f23411v1) {
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
                        j81 j81Var = messageObject.highestQuality;
                        if (j81Var != null && !j81Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        j81 j81Var2 = messageObject.thumbQuality;
                        if (j81Var2 != null && !j81Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f23462y7;
            if (m4Var != null) {
                m4Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f20063id) && !PhotoViewer.t1().R1()) {
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
        ai.m4 m4Var = this.S0;
        canvas.translate(m4Var.getImageX(), m4Var.getImageY());
        this.Fb.c(canvas, this, (int) m4Var.getImageWidth(), (int) m4Var.getImageHeight(), m4Var.getAlpha(), this.f23335pe);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                qh.g gVar = this.f23133b6;
                if (gVar != null) {
                    return gVar.f46725b;
                }
                return null;
            } else if (i10 == -3) {
                qh.g gVar2 = this.f23148c6;
                if (gVar2 != null) {
                    return gVar2.f46725b;
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
                        sh.b bVar = s1Var.f22767x;
                        if (bVar != null && (pollAnswer = s1Var.f22763s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f48211c;
                        }
                    }
                }
            }
        }
        k4 k4Var = this.F7;
        if (k4Var != null) {
            ArrayList arrayList2 = k4Var.f22373c;
            i4 i4Var = k4Var.f22372b;
            if (i4Var != null && i10 >= 0 && i10 < i4Var.f22239a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) k4Var.f22372b.f22239a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((j4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((j4) arrayList2.get(i12)).f22313f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.S0;
    }

    public final void F3(int i10) {
        ca0 ca0Var = this.f23430w5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < ca0Var.d; i11++) {
                if (((Pair) ca0Var.f25255c.get(i11)).second == valueOf) {
                    ca0Var.j(i11);
                }
            }
        } else {
            ca0Var.d(true);
        }
        ca0 ca0Var2 = this.U1;
        if (ca0Var2 != null) {
            ca0Var2.d(true);
        }
        this.f23371s5 = null;
        this.V1 = null;
        if (this.f23386t5 != null) {
            if (this.f23446x5 == i10 || i10 == -1) {
                this.f23386t5 = null;
                this.f23446x5 = -1;
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
        MessageObject messageObject = this.f23462y7;
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
                        if (checkBoxBase != null && checkBoxBase.f24101q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f23286m6;
                if (!z14 && !this.f23387t6 && this.f23357r6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.f23387t6 && !this.f23372s6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f23315o6) {
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
                } else if (!this.R7 && z15 && ((z14 && (!this.q6 || this.f23357r6)) || (this.f23387t6 && pollResults.total_voters != 0))) {
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
                        dVar.f48220a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.f23145c3 = charSequence;
                    this.Z5.d.t(charSequence, z10, true);
                    this.R2 = true;
                    this.f23130b3 = i10;
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
                int i11 = ((s1) arrayList.get(i10)).f22748b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                t1 t1Var = this.Zc;
                if (t1Var.f23014t2) {
                    float f10 = t1Var.K1;
                    f7 += ((1.0f - f10) * t1Var.f23018u2) + (i12 * f10);
                    if (this.f23462y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (t1Var.f23023w0) {
                    f7 += t1Var.f22971j0;
                }
                return f7 + s1Var.f22749c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f23174e4 != null) {
            this.f23174e4 = null;
        }
        ArrayList arrayList = this.A5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f23474z5.addAll(arrayList);
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
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f23462y7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (l1Var = this.Jc) != null && l1Var.i1(3, this) && TextUtils.equals(this.Jc.g(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f23462y7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((s1) arrayList.get(i10)).f22748b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                t1 t1Var = this.Zc;
                if (t1Var.f23014t2) {
                    float f10 = t1Var.K1;
                    f7 += ((1.0f - f10) * t1Var.f23018u2) + (i12 * f10);
                    if (this.f23462y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (t1Var.f23023w0) {
                    f7 += t1Var.f22971j0;
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
        zh0 zh0Var = this.f23424w;
        zh0Var.a(b1Var);
        b1 b1Var2 = this.Rd;
        zh0Var.a(b1Var2);
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f23462y7.caption;
            } else {
                charSequence = this.f23462y7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = y10.f33073e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    y10[] y10VarArr = (y10[]) spanned.getSpans(0, spanned.length(), y10.class);
                    for (y10 y10Var : y10VarArr) {
                        if (y10Var.f33075b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(y10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(y10Var.f33075b.date));
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
                        zh0Var.a(b1Var2);
                        as asVar = new as(29, zh0Var, b1Var2);
                        zh0Var.f33609a.put(b1Var2, asVar);
                        if (j16 > 0) {
                            AndroidUtilities.runOnUIThread(asVar, j16);
                        } else {
                            AndroidUtilities.runOnUIThread(asVar);
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
                TLRPC.PollAnswer pollAnswer = ((s1) arrayList.get(i10)).f22763s;
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
        if (!z11 || (messageObject = this.f23462y7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f23174e4 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Id);
                    this.l1 = checkBoxBase2;
                    if (this.M0) {
                        checkBoxBase2.f24096l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var = this.Id;
                    if (checkBoxBase.F != e6Var) {
                        checkBoxBase.F = e6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((groupedMessages = this.K) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.A7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f23254k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Id);
                    this.f23254k1 = checkBoxBase4;
                    if (!checkBoxBase4.f24108y) {
                        checkBoxBase4.f24108y = true;
                        checkBoxBase4.b();
                    }
                    if (this.M0) {
                        this.f23254k1.f24096l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.e6 e6Var2 = this.Id;
                    if (checkBoxBase3.F != e6Var2) {
                        checkBoxBase3.F = e6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f7 = 0.0f;
            if (this.f23281m1 == z10) {
                if (z11 != this.f23297n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f23310o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f23297n1 = z11;
            this.f23281m1 = z10;
            if (z11) {
                this.f23323p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f23310o1 = f7;
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
                        TLRPC.User user = this.f23236ic;
                        if (user != null && user.bot_inline_placeholder == null) {
                            l1Var.m2(this, user.f20189id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            l1 l1Var2 = this.Jc;
                            if (publicUsername == null) {
                                publicUsername = this.f23462y7.messageOwner.via_bot_name;
                            }
                            l1Var2.r0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Yb;
                        if (user2 != null) {
                            l1Var.A0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Zb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f23462y7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f23250jc;
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
                                l1Var.T(u1Var, chat2, i10, this.f23199g1, this.f23211h1, false);
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
        MessageObject messageObject2 = this.f23462y7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f23462y7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f23462y7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.l1 != null) {
                if (this.f23281m1 || this.f23297n1) {
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
                        f7 = y3 + this.Zc.f22971j0;
                    }
                    canvas.translate(this.I8, f7 + this.f23349qe);
                    this.l1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, this.Id);
    }

    public final void K3(boolean z10, boolean z11) {
        this.f23274l8 = z10;
        this.f23177e8 = z11;
        s4();
        if (this.F5) {
            this.H5.f29558o = f3();
        } else {
            this.G5.f27113p = f3();
        }
        invalidate();
    }

    public final boolean L0(MotionEvent motionEvent) {
        l1 l1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Za && this.Ka != null && this.K3 != null && ((this.Yb != null || this.Zb != null) && this.f23153cc != null && this.f23195fc != null)) {
            boolean contains = this.Q3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.R3 = contains;
                if (contains) {
                    this.Q3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.Q3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.R3 && (l1Var = this.Jc) != null && (user = this.Yb) != null) {
                    Drawable drawable = this.f23195fc.f30011f[0];
                    if (drawable instanceof org.telegram.ui.Components.s5) {
                        document = ((org.telegram.ui.Components.s5) drawable).f30675e;
                    } else {
                        document = null;
                    }
                    l1Var.a2(this, user, document, this.ec);
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
        int w02;
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
        zg.o0 o0Var = this.N;
        if (z10) {
            if (!this.f23462y7.isOutOwner()) {
                kd0 kd0Var = org.telegram.ui.ActionBar.i6.E3;
                if (f4()) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21101tc, this.Id);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.i6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21101tc;
                    }
                    w02 = org.telegram.ui.ActionBar.i6.w0(i10, this.Id);
                }
                kd0Var.a(w02);
                if (f4()) {
                    f15 = (getPhotoBottom() + this.f23381t0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float dp2 = (f7 - AndroidUtilities.dp(f14)) + f11;
                    if (this.f23348qd) {
                        if (this.J) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        f15 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (o0Var.i(t1Var.K1) + AndroidUtilities.dp(f16)));
                    } else {
                        f15 = dp2;
                    }
                }
                if (!this.f23462y7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                a0.q(kd0Var, f12 + i11, f15 - AndroidUtilities.dp(12.0f));
                kd0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, kd0Var.getBounds().centerX(), kd0Var.getBounds().centerY());
                }
                kd0Var.draw(canvas);
                kd0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f23462y7.isOutOwner()) {
            if (!this.f23462y7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f23381t0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                dp = (f7 - AndroidUtilities.dp(f20)) + f11;
                if (this.f23348qd) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * o0Var.i(t1Var.K1);
                }
            }
            RectF rectF = this.f23147c5;
            rectF.set(f19, dp, AndroidUtilities.dp(14.0f) + f19, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.i6.f20760b2.getAlpha();
            int i12 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.i6.f20760b2.setAlpha(i12);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.f20760b2);
            org.telegram.ui.ActionBar.i6.f20760b2.setAlpha(alpha);
            Drawable L2 = L2("drawableMsgError");
            a0.q(L2, f19 + AndroidUtilities.dp(6.0f), dp + AndroidUtilities.dp(2.0f));
            L2.setAlpha(i12);
            L2.draw(canvas);
            L2.setAlpha(255);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final Drawable L2(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.e6 e6Var = this.Id;
        if (e6Var != null) {
            drawable = e6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.i6.P0(str);
    }

    public final void L3(boolean z10, boolean z11, boolean z12) {
        MessageObject messageObject;
        if (z10 || !z12 || (messageObject = this.f23462y7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f23254k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            sb0 sb0Var = this.Kc;
            float f7 = 0.0f;
            if (sb0Var.f30747e == z11) {
                if (sb0Var.f30748f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    sb0Var.d = f7;
                    sb0Var.f30748f = false;
                    return;
                }
                return;
            }
            sb0Var.f30747e = z11;
            sb0Var.f30748f = z12;
            if (z12) {
                sb0Var.f30746c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                sb0Var.d = f7;
            }
            sb0Var.a();
            u1 u1Var = sb0Var.f30754m;
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
        if (this.f23405ua == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.Z8 != null) {
                this.Ha -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f10 = this.Ga;
            float f11 = this.Ha + dp;
            RectF rectF = this.f23147c5;
            rectF.set(f10, this.Ha, AndroidUtilities.dp(32.0f) + f10, f11);
            p0();
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            String str = "paintChatActionBackground";
            if (i10 != 0) {
                int alpha = M2("paintChatActionBackground").getAlpha();
                M2("paintChatActionBackground").setAlpha((int) (alpha * f7));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), M2("paintChatActionBackground"));
                M2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.f23451xa) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.i6.f20869h2.getAlpha();
                    org.telegram.ui.ActionBar.i6.f20869h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.f20869h2);
                    org.telegram.ui.ActionBar.i6.f20869h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.f20869h2);
                }
            }
            Drawable P0 = org.telegram.ui.ActionBar.i6.P0("drawableCommentSticker");
            a0.q(P0, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
            if (i10 != 0) {
                P0.setAlpha((int) (f7 * 255.0f));
                P0.draw(canvas);
                P0.setAlpha(255);
            } else {
                P0.draw(canvas);
            }
            if (this.Z8 != null) {
                org.telegram.ui.ActionBar.i6.E2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xc, this.Id));
                org.telegram.ui.ActionBar.i6.E2.setAlpha((int) (f7 * 255.0f));
                t1 t1Var = this.Zc;
                if (t1Var.U) {
                    if (t1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.i6.E2.setAlpha((int) ((1.0d - t1Var.K1) * 255.0d * f7));
                        canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - t1Var.X) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                        t1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.i6.E2.setAlpha((int) (t1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - this.f23219h9) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                this.Z8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.Id;
        if (e6Var != null) {
            paint = e6Var.F(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.i6.T0(str);
    }

    public final boolean M3(boolean z10) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        u1 u1Var;
        if (this.f23462y7.isDice()) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof bk0) {
                final bk0 bk0Var = (bk0) drawable;
                String diceEmoji = this.f23462y7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.I7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.I7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f23462y7.getDiceValue();
                if ("🎰".equals(this.f23462y7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        bx0 bx0Var = (bx0) bk0Var;
                        if (bx0Var.U0 != null || bx0Var.V0) {
                            u1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int X = bx0.X(i10 & 3);
                            int X2 = bx0.X((i10 >> 2) & 3);
                            int X3 = bx0.X(i10 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            bx0Var.f25072b1 = X;
                            bx0Var.f25073c1 = X2;
                            bx0Var.f25074d1 = X3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            bx0Var.V0 = true;
                            u1Var = this;
                            Utilities.globalQueue.postRunnable(new ii.s2(bx0Var, stickerSetByEmojiOrName, i11, messageObject, u1Var, z10, 4));
                        }
                        if (u1Var.f23462y7.isOut()) {
                            bk0Var.S(Integer.MAX_VALUE, u1Var.f23209gd);
                        }
                        u1Var.f23462y7.wasUnread = false;
                    } else {
                        u1Var = this;
                    }
                    if (bk0Var.m0 == null && !bk0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        bx0 bx0Var2 = (bx0) bk0Var;
                        if (bx0Var2.m0 == null && !bx0Var2.Y0) {
                            bx0Var2.Y0 = true;
                            Utilities.globalQueue.postRunnable(new ei.l3(bx0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), u1Var, 23));
                            return true;
                        }
                    }
                } else {
                    if (bk0Var.m0 == null && !bk0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.I7).getPathToAttach(document, true);
                        if (bk0Var.m0 == null && !bk0Var.Y0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f23462y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                bk0Var.Y0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final bk0 bk0Var2 = bk0Var;
                                                String str = readRes;
                                                if (bk0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    bk0 bk0Var3 = bk0Var2;
                                                                    bk0Var3.Y0 = false;
                                                                    if (!bk0Var3.V0 && bk0Var3.W0) {
                                                                        bk0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    bk0Var3.l();
                                                                    bk0Var3.I();
                                                                    bk0Var3.x();
                                                                    return;
                                                                default:
                                                                    bk0 bk0Var4 = bk0Var2;
                                                                    bk0Var4.V0 = false;
                                                                    if (!bk0Var4.Y0 && bk0Var4.W0) {
                                                                        bk0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                bk0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (bk0Var2.U0 != null) {
                                                    i12 = bk0Var2.U0.f24261a[0];
                                                }
                                                if (bk0Var2.U0 != null) {
                                                    int i13 = bk0Var2.U0.f24261a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new nd(bk0Var2, i12, 7));
                                                return;
                                            default:
                                                final bk0 bk0Var3 = bk0Var;
                                                bk0Var3.m0 = RLottieNative.b(readRes, bk0Var3.f25732e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                bk0 bk0Var32 = bk0Var3;
                                                                bk0Var32.Y0 = false;
                                                                if (!bk0Var32.V0 && bk0Var32.W0) {
                                                                    bk0Var32.C(true);
                                                                    return;
                                                                }
                                                                bk0Var32.l();
                                                                bk0Var32.I();
                                                                bk0Var32.x();
                                                                return;
                                                            default:
                                                                bk0 bk0Var4 = bk0Var3;
                                                                bk0Var4.V0 = false;
                                                                if (!bk0Var4.Y0 && bk0Var4.W0) {
                                                                    bk0Var4.C(true);
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
                        if (!z10 && this.f23462y7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.I7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            bk0Var.S(diceFrameSuccess.frame, this.f23209gd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.I7).getPathToAttach(document2, true);
                        if (bk0Var.U0 == null && !bk0Var.V0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f23462y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f23462y7.wasUnread = false;
                            } else {
                                if (z10 && bk0Var.Q == null && bk0Var.R == null && bk0Var.P == null) {
                                    bk0Var.J = 2;
                                    bk0Var.X0 = true;
                                }
                                bk0Var.V0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final bk0 bk0Var2 = bk0Var;
                                                String str = readRes2;
                                                if (bk0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    bk0 bk0Var32 = bk0Var2;
                                                                    bk0Var32.Y0 = false;
                                                                    if (!bk0Var32.V0 && bk0Var32.W0) {
                                                                        bk0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    bk0Var32.l();
                                                                    bk0Var32.I();
                                                                    bk0Var32.x();
                                                                    return;
                                                                default:
                                                                    bk0 bk0Var4 = bk0Var2;
                                                                    bk0Var4.V0 = false;
                                                                    if (!bk0Var4.Y0 && bk0Var4.W0) {
                                                                        bk0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                bk0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (bk0Var2.U0 != null) {
                                                    i12 = bk0Var2.U0.f24261a[0];
                                                }
                                                if (bk0Var2.U0 != null) {
                                                    int i13 = bk0Var2.U0.f24261a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new nd(bk0Var2, i12, 7));
                                                return;
                                            default:
                                                final bk0 bk0Var3 = bk0Var;
                                                bk0Var3.m0 = RLottieNative.b(readRes2, bk0Var3.f25732e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                bk0 bk0Var32 = bk0Var3;
                                                                bk0Var32.Y0 = false;
                                                                if (!bk0Var32.V0 && bk0Var32.W0) {
                                                                    bk0Var32.C(true);
                                                                    return;
                                                                }
                                                                bk0Var32.l();
                                                                bk0Var32.I();
                                                                bk0Var32.x();
                                                                return;
                                                            default:
                                                                bk0 bk0Var4 = bk0Var3;
                                                                bk0Var4.V0 = false;
                                                                if (!bk0Var4.Y0 && bk0Var4.W0) {
                                                                    bk0Var4.C(true);
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
                        this.f23462y7.wasUnread = false;
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
            int i13 = this.f23462y7.type;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (!z10) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f23241j2 && !this.f23255k2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int x10 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f23413v3;
                if (action == 0) {
                    MessageObject messageObject = this.f23462y7;
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
                                    this.f23444x3[0] = 4;
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
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.G4;
                                        int w10 = c1.w(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int v = c1.v(2, this.T4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(w10 - AndroidUtilities.dp(20.0f), v - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + w10, AndroidUtilities.dp(20.0f) + v);
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
                        if (this.f23462y7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z4 = false;
                        playSoundEffect(0);
                        this.Jc.H0(this, this.S4, this.T4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f23462y7.type == 16 && this.Z4 && (drawable = drawableArr[0]) != null) {
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
            return ((getPhotoBottom() + this.f23381t0) - AndroidUtilities.dp(7.3f)) - this.f23319ob.getHeight();
        }
        int i10 = this.M8;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f10)) - this.f23319ob.getHeight()) + f7;
        boolean z10 = this.f23348qd;
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
        return (t1Var.f22966i0 - t1Var.f22971j0) + dp;
    }

    public final void N3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            vj0 vj0Var = this.f23238ie;
            t1 t1Var = this.Zc;
            if (vj0Var != null && vj0Var.h) {
                this.f23349qe = 0.0f;
            } else {
                float f7 = i11 + i13 + t1Var.f22966i0;
                this.f23349qe = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + t1Var.f22957g0), (int) (i11 + t1Var.f22971j0), (int) (i10 + i12 + t1Var.f22961h0), (int) (i11 + i13 + t1Var.f22966i0));
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
                TLRPC.TodoItem todoItem = ((s1) arrayList.get(i11)).f22764t;
                if (todoItem != null && todoItem.f20187id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f23206g8 = true;
        this.f23218h8 = 1000;
        this.f23246j8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        qv0 e22;
        l1 l1Var = this.Jc;
        if (l1Var == null) {
            e22 = null;
        } else {
            e22 = l1Var.e2();
        }
        qv0 qv0Var = e22;
        int i10 = 0;
        if (this.f23462y7 != null) {
            ai.m4 m4Var = this.S0;
            if (m4Var.hasNotThumb() && qv0Var != null && !this.f23462y7.isSticker() && !this.f23462y7.isAnimatedEmoji() && ((!this.f23462y7.isVideo() || this.f23303n7) && !this.f23348qd && !this.f23462y7.isAnimatedSticker() && ((!this.f23462y7.isDocument() || this.f23462y7.isGif()) && !this.f23462y7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f23462y7;
                vh.f fVar = this.Fb;
                if (fVar != null) {
                    Integer num = (Integer) fVar.f49721k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i10 = num.intValue();
                }
                return qv0Var.a(motionEvent, this, m4Var, messageObject, i10);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.f23146c4 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f23476z7;
        if (messageObject == null) {
            messageObject = this.f23462y7;
        }
        if (messageObject == null) {
            this.f23174e4 = null;
            return;
        }
        tj0 tj0Var = this.f23174e4;
        if (tj0Var == null || !tj0Var.f31155f || !Arrays.equals(tj0Var.f31156g, bArr)) {
            this.f23174e4 = new tj0(this, messageObject.getId(), bArr);
        }
        this.f23456y0 = true;
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
            float backgroundDrawableRight = getBackgroundDrawableRight() + t1Var.f22961h0;
            if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.J) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f23326p4;
            } else if (this.f23462y7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23418v8;
                if (this.f23462y7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f23261k8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f23418v8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f23418v8;
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
            int dp4 = ((int) (i11 + t1Var.f22957g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.f23336q0;
            float f15 = dp4;
            int i14 = (int) (dp3 - f15);
            int i15 = this.f23186f2;
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
            if (this.f23165da == null) {
                this.f23165da = new ym0(this);
            }
            int o9 = this.f23165da.o(this.Id);
            canvas.save();
            canvas.translate(f15, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            bd bdVar = this.R1;
            if (bdVar != null) {
                f12 = bdVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f23165da.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f23165da.e(canvas, rectF, f14);
            m11 m11Var = this.O1;
            if (m11Var != null) {
                m11Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f14, o9, canvas);
                if (this.P1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.O1.f28602c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.P1.f28602c, AndroidUtilities.dp(21.66f));
                    bd bdVar2 = this.Q1;
                    if (bdVar2 != null) {
                        f13 = bdVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.f23165da.f33365g);
                    this.P1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f14, o9, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f23247j9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f23476z7;
        if (messageObject == null) {
            messageObject = this.f23462y7;
        }
        this.f23456y0 = false;
        ArrayList arrayList = this.A5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.f23146c4 != null && !TextUtils.isEmpty(messageObject.caption)) {
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
                        while (i17 < this.f23146c4.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.f23146c4.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f23441x0 = i17;
                                this.f23456y0 = false;
                                G3();
                                try {
                                    z90 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, B3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.f23146c4.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.f23146c4.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            z90 B32 = B3();
                                            B32.d(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                            textLayoutBlock2.textLayout.getSelectionPath(0, i13 - textLayoutBlock2.charactersOffset, B32);
                                        } while (i13 >= (textLayoutBlock.charactersOffset + i15) - 1);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
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
                            this.f23441x0 = i19;
                            this.f23456y0 = false;
                            G3();
                            try {
                                z90 B33 = B3();
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
                                        z90 B34 = B3();
                                        B34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i10 - textLayoutBlock4.charactersOffset, B34);
                                    } while (i10 >= (textLayoutBlock3.charactersOffset + i12) - 1);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            invalidate();
                            return;
                        }
                        i19++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f23441x0 = -1;
                this.f23456y0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f23441x0 = -1;
            this.f23456y0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        qh.g gVar;
        qh.g gVar2;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            qh.g gVar3 = this.f23133b6;
            if (gVar3 != null) {
                if (gVar3.X && gVar3.f46723a.f16342f && gVar3.K.f(x10 - gVar3.L, z22 - gVar3.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f23185f1 = true;
                    invalidate();
                    return true;
                }
                qh.g gVar4 = this.f23133b6;
                if ((gVar4.X || gVar4.W) && gVar4.j(x10, z22, action)) {
                    this.f23185f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f23462y7.expandedExplanation && (gVar2 = this.f23148c6) != null) {
                if (gVar2.X && gVar2.f46723a.f16342f && gVar2.K.f(x10 - gVar2.L, z22 - gVar2.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f23185f1 = true;
                    invalidate();
                    return true;
                }
                qh.g gVar5 = this.f23148c6;
                if ((gVar5.X || gVar5.W) && gVar5.j(x10, z22, action)) {
                    this.f23185f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.N6 = -1;
                qh.g gVar6 = this.f23133b6;
                if (gVar6 != null && gVar6.S && gVar6.getBounds().contains(x10, z22)) {
                    this.N6 = -2;
                    invalidate();
                    return true;
                } else if (this.f23462y7.expandedExplanation && (gVar = this.f23148c6) != null && gVar.S && gVar.getBounds().contains(x10, z22)) {
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
                    qh.g gVar7 = this.f23133b6;
                    ImageReceiver imageReceiver = gVar7.f46725b;
                    TLRPC.MessageMedia messageMedia = gVar7.T;
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        l1Var.n(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    qh.g gVar8 = this.f23148c6;
                    ImageReceiver imageReceiver2 = gVar8.f46725b;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.Id;
        if (e6Var != null) {
            return e6Var.k0();
        }
        return org.telegram.ui.ActionBar.i6.b1();
    }

    public final void R3(int i10) {
        MessageObject messageObject = this.f23476z7;
        if (messageObject == null) {
            messageObject = this.f23462y7;
        }
        if (messageObject == null) {
            this.f23174e4 = null;
            return;
        }
        tj0 tj0Var = this.f23174e4;
        if (tj0Var == null || !tj0Var.f31154e || tj0Var.f31153c != (-i10)) {
            this.f23174e4 = new tj0(this, messageObject.getId(), i10);
        }
        this.f23456y0 = true;
    }

    public final void S0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.Z5 != null && (messageObject = this.f23462y7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f23462y7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            sh.d dVar = this.Z5;
            if (z11 && SendMessagesHelper.getInstance(this.I7).isSendingVote(this.f23462y7) != null) {
                z12 = true;
            }
            me.b bVar = dVar.f48224f;
            if (bVar.f16342f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f23462y7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f23402u7) {
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
        if (this.C9 == null || (l1Var = this.Jc) == null || !l1Var.p0()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f23462y7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.J9, this.L9) + this.G9;
        } else {
            i10 = this.f23433w8 + this.G9;
        }
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.G9 && x10 <= i10) {
                float f7 = this.H9;
                if (z22 >= f7 && z22 <= f7 + this.I9) {
                    this.Q9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.U9 = x10;
                    this.V9 = getY() + z22;
                    z zVar = this.f23481zc;
                    if (zVar != null) {
                        zVar.setHotspot(x10, z22);
                        this.R9 = false;
                        this.S9 = true;
                        postDelayed(new b1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    bd bdVar = this.f23407uc;
                    if (bdVar != null) {
                        bdVar.c(true);
                        this.xc = x10;
                        this.yc = z22;
                    }
                    r();
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.Q9) {
                    k();
                    this.Q9 = false;
                    z zVar2 = this.f23481zc;
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
                    bd bdVar2 = this.f23407uc;
                    if (bdVar2 != null) {
                        bdVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f23292mc) {
                        l1 l1Var2 = this.Jc;
                        if (l1Var2 != null) {
                            TLRPC.Chat chat = this.f23250jc;
                            if (chat != null) {
                                l1Var2.T(this, chat, this.f23462y7.messageOwner.fwd_from.channel_post, this.f23199g1, this.f23211h1, false);
                                u1Var = this;
                            } else {
                                u1Var = this;
                                TLRPC.User user = u1Var.f23221hc;
                                if (user != null) {
                                    l1Var2.A0(this, user, u1Var.f23199g1, u1Var.f23211h1);
                                } else if (u1Var.f23265kc != null) {
                                    l1Var2.o(this);
                                }
                            }
                        }
                    } else {
                        u1Var = this;
                        if (u1Var.Jc != null && (u1Var.f23462y7.hasValidReplyMessageObject() || u1Var.f23462y7.isReplyToStory() || u1Var.f23464y9 || ((message = u1Var.f23462y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            u1Var.Jc.h2(u1Var, u1Var.f23462y7.getReplyMsgId(), x10, z22, false);
                        }
                    }
                }
            } else {
                u1Var = this;
                if (motionEvent.getAction() == 3) {
                    u1Var.Q9 = false;
                    u1Var.R9 = false;
                    z zVar3 = u1Var.f23481zc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    bd bdVar3 = u1Var.f23407uc;
                    if (bdVar3 != null) {
                        bdVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x10 >= u1Var.G9 && x10 <= i10) {
                        float f10 = u1Var.H9;
                        if (z22 >= f10 && z22 <= f10 + u1Var.I9) {
                            if (u1Var.f23481zc != null && u1Var.S9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - u1Var.V9, 2.0d) + Math.pow(x10 - u1Var.U9, 2.0d)) > 0.75d) {
                                    u1Var.S9 = false;
                                }
                            }
                        }
                    }
                    u1Var.Q9 = false;
                    u1Var.R9 = false;
                    u1Var.S9 = false;
                    z zVar4 = u1Var.f23481zc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    bd bdVar4 = u1Var.f23407uc;
                    if (bdVar4 != null) {
                        bdVar4.c(false);
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
        vh.g gVar;
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
        boolean z10 = true;
        if (this.f23462y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
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
        if (this.f23448x7) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        t1 t1Var = this.Zc;
        if (actionMasked == 0) {
            int i20 = this.f23296n0;
            if (x10 >= i20 && z22 >= (i16 = this.f23351r0)) {
                MessageObject messageObject = this.f23462y7;
                if (x10 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(t1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f23462y7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f23462y7.textLayoutBlocks, t1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f23462y7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (vh.g gVar2 : textLayoutBlock.spoilers) {
                            if (gVar2.getBounds().contains((x10 - this.f23296n0) + i17, (int) ((z22 - this.f23351r0) - textLayoutBlock.textYOffset(this.f23462y7.textLayoutBlocks, t1Var)))) {
                                this.f23432w7 = gVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.f23146c4 != null) {
                float f7 = x10;
                float f10 = this.f23326p4;
                if (f7 >= f10) {
                    float f11 = z22;
                    float f12 = this.f23340q4;
                    if (f11 >= f12 && f7 <= f10 + textLayoutBlocks.textWidth && f11 <= f12 + textLayoutBlocks.textHeight(t1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.f23146c4.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.f23146c4.textLayoutBlocks, t1Var) <= f11; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.f23146c4.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (vh.g gVar3 : textLayoutBlock2.spoilers) {
                                boolean z11 = z10;
                                if (gVar3.getBounds().contains((int) ((f7 - this.f23326p4) + i15), (int) ((f11 - this.f23340q4) - textLayoutBlock2.textYOffset(this.f23146c4.textLayoutBlocks, t1Var)))) {
                                    this.f23432w7 = gVar3;
                                    return z11;
                                }
                                z10 = z11;
                            }
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f23214h4 == null) {
                return false;
            }
            float f13 = x10;
            float f14 = this.f23119a7;
            if (f13 < f14) {
                return false;
            }
            float f15 = z22;
            float f16 = this.f23134b7;
            if (f15 <= f16 || f13 > f14 + textLayoutBlocks2.textWidth || f15 > f16 + textLayoutBlocks2.textHeight(t1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f23214h4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f23214h4.textLayoutBlocks, t1Var) <= f15; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f23214h4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (vh.g gVar4 : textLayoutBlock3.spoilers) {
                    if (gVar4.getBounds().contains((int) ((f13 - this.f23119a7) + i14), (int) ((f15 - this.f23134b7) - textLayoutBlock3.textYOffset(this.f23214h4.textLayoutBlocks, t1Var)))) {
                        this.f23432w7 = gVar4;
                        return z12;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f23432w7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Nd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f23214h4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (vh.g gVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = gVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f23214h4.textLayoutBlocks, t1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f23214h4.textLayoutBlocks, t1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.f23146c4;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (vh.g gVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = gVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.f23146c4.textLayoutBlocks, t1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.f23146c4.textLayoutBlocks, t1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f23462y7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (vh.g gVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = gVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f23462y7.textLayoutBlocks, t1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f23462y7.textLayoutBlocks, t1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.f23147c5;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f23448x7 = true;
            this.f23432w7.f49738q = new b1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f23214h4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f23214h4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (vh.g gVar8 : textLayoutBlock11.spoilers) {
                        gVar8.j((x10 - this.f23119a7) + i13, (z22 - textLayoutBlock11.textYOffset(this.f23214h4.textLayoutBlocks, t1Var)) - this.f23134b7, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.f23146c4;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.f23146c4.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (vh.g gVar9 : textLayoutBlock13.spoilers) {
                        gVar9.j((x10 - this.f23326p4) + i12, (z22 - textLayoutBlock13.textYOffset(this.f23146c4.textLayoutBlocks, t1Var)) - this.f23340q4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f23462y7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f23462y7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (vh.g gVar10 : textLayoutBlock15.spoilers) {
                            gVar10.j((x10 - this.f23296n0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f23462y7.textLayoutBlocks, t1Var)) - this.f23351r0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof rm0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof u1) {
                        u1 u1Var2 = (u1) childAt2;
                        ArrayList arrayList10 = u1Var2.Ld;
                        if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((vh.g) arrayList10.get(0)).f49738q = new la(6, this, u1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((vh.g) obj).j(gVar.getBounds().centerX(), gVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f23432w7 = null;
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
        ai.m4 m4Var = this.S0;
        m4Var.setImageCoords(f7, f10, f11, f12);
        int i10 = this.K1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.M4 = (int) (m4Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (m4Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.N4 = imageY;
        int i11 = this.M4;
        int dp = AndroidUtilities.dp(24.0f) + this.N4;
        this.P0.q(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.K4 = (int) com.google.android.gms.internal.vision.e2.z(m4Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f7);
        int z10 = (int) com.google.android.gms.internal.vision.e2.z(m4Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, m4Var.getImageY());
        this.L4 = z10;
        int i12 = this.K4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.L4;
        this.O0.q(i12, z10, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.isStakedDice() && !this.Q) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof bk0) {
                bk0 bk0Var = (bk0) drawable;
                if ((bk0Var.m0 != null || bk0Var.Y0) && !this.Q && (i10 = bk0Var.J) != 1 && i10 == 2) {
                    if (!bk0Var.X0) {
                        float t10 = bk0Var.t();
                        if (bk0Var.U0 != null) {
                            t10 = bk0Var.f25726a0 / bk0Var.f24998a1;
                        }
                        if (t10 <= 0.95f) {
                            return;
                        }
                    }
                    this.Q = true;
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        l1Var.K1(this, false);
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f12 = this.f23351r0;
            t1 t1Var = this.Zc;
            if (t1Var.f22981l2) {
                float f13 = t1Var.f22990n2;
                float f14 = t1Var.K1;
                f7 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f7 = f12;
            }
            if (t1Var.K1 != 1.0f && t1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f23389t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                vj0 vj0Var = this.f23238ie;
                if (vj0Var != null && vj0Var.h) {
                    MessageObject messageObject2 = this.f23462y7;
                    U1(this.f23296n0, f7, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f23296n0, f7, canvas, t1Var.H0, t1Var.N0, false, 1.0f - t1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f23462y7;
                    U1(this.f23296n0, f7, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, t1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f7;
            boolean z10 = t1Var.D1;
            if (z10 && this.f23389t8 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f23382t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, t1Var.K1, this.f23462y7.textHeight(t1Var) * i11, f12);
                    float f16 = t1Var.f22990n2;
                    if (this.f23382t1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.f23462y7.textHeight(t1Var) * i12) * t1Var.K1);
                    f11 = y3;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f23389t8.getBounds());
                if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f17 = rectF.left;
                float f18 = t1Var.f22990n2;
                canvas.clipRect(f17, f18, rectF.right, this.f23462y7.textHeight(t1Var) + f18 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f23462y7;
                U1(this.f23296n0, f10, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - t1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f23389t8.getBounds());
                if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f23351r0, rectF.right, AndroidUtilities.dp(4.0f) + this.f23462y7.textHeight(t1Var) + i10);
                MessageObject messageObject5 = this.f23462y7;
                U1(this.f23296n0, f11, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f23462y7;
            U1(this.f23296n0, f15, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.N.f54667b) {
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
        if (!this.ha || this.f23276la == null || this.f23437wc == null || this.Jc == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Cc;
        if (action == 0) {
            if (rectF.contains(x10, z22)) {
                this.f23437wc.c(true);
                z zVar = this.f23263ka;
                if (zVar != null) {
                    zVar.setHotspot(x10, z22);
                    this.f23263ka.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.f23437wc.f24928i && !rectF.contains(x10, z22)) {
                this.f23437wc.c(false);
                z zVar2 = this.f23263ka;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f23437wc.f24928i) {
                this.Jc.N0(this);
            }
            this.f23437wc.c(false);
            z zVar3 = this.f23263ka;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f23437wc.c(false);
            z zVar4 = this.f23263ka;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.f23437wc.f24928i;
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
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f23146c4;
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
        this.f23476z7 = messageObject;
        this.A7 = groupedMessages;
        this.C7 = z10;
        this.B7 = z11;
        this.D7 = z12;
        this.E7 = z13;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        p9 E2;
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
        if (l1Var != null && (E2 = l1Var.E2()) != null && (E2.b() || E2.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f23462y7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f23462y7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f23240j1 || this.K != null) && (this.K == null || this.Jc.Q()))) {
                if (this.f23462y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof u1) {
                                u1 u1Var = (u1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId && (currentPosition.flags & t0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    E2.f21860c = (int) u1Var.f23326p4;
                                    E2.d = (int) u1Var.f23340q4;
                                    E2.a0(u1Var);
                                    if (u1Var == this) {
                                        return E2.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - u1Var.getLeft(), getTop() - u1Var.getTop());
                                    boolean M = E2.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - u1Var.getLeft()), -(getTop() - u1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f23462y7;
                    if (messageObject != null && !messageObject.preview && this.S1 != null && z2(motionEvent) >= this.f23336q0) {
                        E2.f22667r0 = false;
                        E2.f22669t0 = true;
                        E2.f22671v0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.K;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f23326p4;
                        } else {
                            float f7 = 12.0f;
                            if (this.f23462y7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23418v8;
                                if (this.f23462y7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f23261k8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f23418v8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f23418v8;
                                    if (!this.J) {
                                        f7 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f7) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Zc.f22957g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.f23336q0;
                        E2.f21860c = (AndroidUtilities.dp(10.0f) + dp3) - this.f23129b2;
                        E2.d = AndroidUtilities.dp(22.0f) + i15;
                    } else if (P2()) {
                        E2.f22667r0 = false;
                        E2.f22669t0 = false;
                        E2.f22671v0 = false;
                        E2.f21860c = (int) this.f23326p4;
                        E2.d = (int) this.f23340q4;
                    } else {
                        MessageObject messageObject2 = this.f23462y7;
                        if (messageObject2 != null && !messageObject2.preview && this.K2 != null && (!this.f23382t1 ? z2(motionEvent) > this.f23311o2 : z2(motionEvent) < this.f23351r0)) {
                            E2.f22667r0 = true;
                            E2.f22669t0 = false;
                            E2.f22671v0 = false;
                            if (this.f23241j2) {
                                i11 = this.f23309o0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f23255k2) {
                                    i10 = this.f23309o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i10 = this.f23309o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i11 = i10 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f23353r2;
                            int i16 = this.f23311o2;
                            E2.f21860c = dp4;
                            E2.d = i16;
                        } else if (z11) {
                            E2.f22667r0 = false;
                            E2.f22669t0 = false;
                            E2.f22671v0 = true;
                            int i17 = this.f23296n0;
                            int i18 = this.f23351r0;
                            E2.f21860c = i17;
                            E2.d = i18;
                        } else {
                            E2.f22667r0 = false;
                            E2.f22669t0 = false;
                            E2.f22671v0 = false;
                            int i19 = this.f23296n0;
                            int i20 = this.f23351r0;
                            E2.f21860c = i19;
                            E2.d = i20;
                        }
                    }
                    E2.a0(this);
                    return E2.M(motionEvent);
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
                this.f23441x0 = i13;
                G3();
                try {
                    z90 B3 = B3();
                    B3.f28086c = true;
                    B3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, B3);
                    B3.a();
                    float f7 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            z90 B32 = B3();
                            B32.f28086c = true;
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
                    if (this.f23456y0) {
                        this.f23206g8 = true;
                        this.f23218h8 = 2500;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.Z3 = -1;
        this.f23116a4 = -1;
    }

    public final void Y3(int i10) {
        this.f23295n = i10;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f23462y7.isSponsored() && this.f23462y7.sponsoredCanReport) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                if (f7 >= this.F2 - AndroidUtilities.dp(6.0f) && f7 <= this.F2 + this.D2 + AndroidUtilities.dp(6.0f)) {
                    float f10 = z22;
                    if (f10 >= this.G2 - AndroidUtilities.dp(2.0f) && f10 <= this.G2 + this.E2 + AndroidUtilities.dp(2.0f)) {
                        bd bdVar = this.I2;
                        if (bdVar != null) {
                            bdVar.c(true);
                        }
                        this.H2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.H2) {
                l1 l1Var = this.Jc;
                if (l1Var != null) {
                    l1Var.X1();
                }
                bd bdVar2 = this.I2;
                if (bdVar2 != null) {
                    bdVar2.c(false);
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
        ai.m4 m4Var = this.S0;
        float alpha = m4Var.getAlpha();
        if (this.f23462y7.isRoundOnce()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        m4Var.setAlpha(f7 * alpha);
        m4Var.draw(canvas);
        m4Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f23301n5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i10, int i11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        this.J0 = i10;
        this.K0 = i11;
        this.Tc = i11;
        if ((this.f23462y7 != null && R2() && this.f23462y7.shouldDrawWithoutBackground()) || ((f5Var = this.f23389t8) != null && f5Var.f20603a != null)) {
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
        if (this.L5 && ((!this.rd || getVideoTranscriptionProgress() > 0.0f || this.G3) && (j1Var = this.M5) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (j1Var.v.contains((int) x10, (int) z22)) {
                    if (action == 0) {
                        j1Var.A = true;
                    }
                    if (j1Var.A && (zVar = j1Var.f27897q) != null) {
                        zVar.setHotspot(x10, z22);
                        j1Var.f27897q.setState(k41.N);
                        j1Var.f27898r.invalidate();
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
        org.telegram.ui.Components.f6 animation;
        int i10;
        boolean z10;
        MessageObject messageObject = this.f23462y7;
        ai.m4 m4Var = this.S0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = m4Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = m4Var.draw(canvas);
                } else {
                    z10 = true;
                }
                m4Var.setForceNotMedia(true);
                float alpha = m4Var.getAlpha();
                m4Var.setAlpha(clamp01 * alpha);
                m4Var.draw(canvas);
                m4Var.setAlpha(alpha);
                m4Var.setForceNotMedia(false);
                return z10;
            }
        }
        return m4Var.draw(canvas);
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
        ai.m4 m4Var = this.S0;
        float imageY = f7 - m4Var.getImageY();
        float measuredHeight = f10 - (getMeasuredHeight() - m4Var.getImageY2());
        float imageHeight = m4Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / m4Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23365s = z11;
        m4Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void b(float f7) {
        MessageObject messageObject = this.f23462y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(this.f23462y7, f7);
        q4();
    }

    public final boolean b1() {
        MessageObject messageObject = this.f23462y7;
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
            if (!l1Var.i1(1, this)) {
                this.D5 = null;
                ArrayList arrayList = this.C5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.C5.size(); i13++) {
                        n1 n1Var = (n1) this.C5.get(i13);
                        if (!n1Var.f22502a.d()) {
                            n1Var.f22502a.a();
                        }
                    }
                }
            } else {
                CharacterStyle U1 = this.Jc.U1(this);
                if (U1 != this.D5) {
                    this.D5 = U1;
                    ja0 ja0Var = this.B5;
                    if (ja0Var != null) {
                        ja0Var.a();
                        this.B5 = null;
                    }
                    ja0 ja0Var2 = new ja0();
                    this.B5 = ja0Var2;
                    ja0Var2.D = true;
                    z90 z90Var = new z90(0);
                    ja0 ja0Var3 = this.B5;
                    ja0Var3.f27652y = z90Var;
                    ja0Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f22502a = this.B5;
                    obj.f22503b = -3;
                    if (this.C5 == null) {
                        this.C5 = new ArrayList();
                    }
                    this.C5.add(obj);
                    if (this.D5 != null && !r2(obj, z90Var, this.K2, -2) && (((textLayoutBlocks = this.f23146c4) == null || !s2(obj, z90Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f23462y7) != null)) {
                        s2(obj, z90Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.C5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f23462y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.i6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.Ld;
            }
            int w02 = org.telegram.ui.ActionBar.i6.w0(i11, this.Id);
            while (i12 < this.C5.size()) {
                n1 n1Var2 = (n1) this.C5.get(i12);
                if (n1Var2.f22503b == i10) {
                    ja0 ja0Var4 = n1Var2.f22502a;
                    ja0Var4.g(org.telegram.ui.ActionBar.i6.m1(0.85f, w02), org.telegram.ui.ActionBar.i6.m1(2.0f, w02), org.telegram.ui.ActionBar.i6.m1(3.5f, w02), org.telegram.ui.ActionBar.i6.m1(6.0f, w02));
                    ja0Var4.draw(canvas);
                    invalidate();
                    if (ja0Var4.c()) {
                        this.C5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f23430w5.d <= 0 && this.N.f54682s) {
            MessageObject messageObject = this.f23462y7;
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
        this.f23126ae = i11;
        this.f23141be = i12;
        this.J0 = i13;
        this.K0 = i14;
        this.f23169de = f10;
        this.f23154ce = f7;
        this.Tc = i14;
        this.Uc = i15;
        this.Vc = i16;
        this.Zd = i17;
        if ((!this.f23316o7.isEmpty() || (this.v != null && (messageObject = this.f23462y7) != null && messageObject.type == 27)) && this.Sc != f10) {
            invalidate();
        }
        this.Sc = f10;
        if (i12 != this.K0 || f7 != this.L0) {
            this.L0 = f7;
            this.K0 = i12;
        }
        if (this.f23462y7 != null && R2() && this.f23462y7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f23462y7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f23351r0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f23462y7.textLayoutBlocks.size();
                t1Var = this.Zc;
                if (i21 >= size || this.f23462y7.textLayoutBlocks.get(i21).textYOffset(this.f23462y7.textLayoutBlocks, t1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = 0;
            int i24 = -1;
            int i25 = -1;
            while (i22 < this.f23462y7.textLayoutBlocks.size()) {
                float textYOffset = this.f23462y7.textLayoutBlocks.get(i22).textYOffset(this.f23462y7.textLayoutBlocks, t1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(t1Var) + textLayoutBlock.padBottom;
                float f11 = i20;
                if (Z2(textYOffset, height, f11, i20 + i11)) {
                    if (i24 == -1) {
                        i24 = i22;
                    }
                    i23++;
                    i25 = i22;
                } else if (textYOffset > f11) {
                    break;
                }
                i22++;
            }
            if (this.C0 == i25 && this.D0 == i24 && this.E0 == i23) {
                if (this.f23333pc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f23333pc.f32838a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.f23333pc.f32838a.get(i26);
                        if (w5Var != null && w5Var.f32598n) {
                            float y3 = (0.0f - getY()) - w5Var.f32599r;
                            float y10 = (this.f23295n - getY()) - w5Var.f32599r;
                            Rect rect = w5Var.f32596e;
                            if (rect.bottom >= y3 && rect.top <= y10) {
                                invalidate();
                                break;
                            }
                        }
                        i26++;
                    }
                }
            } else {
                this.C0 = i25;
                this.D0 = i24;
                this.E0 = i23;
                invalidate();
            }
        }
        MessageObject messageObject3 = this.f23462y7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f23351r0;
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
                int i34 = s1Var.f22748b + this.Lc;
                if (Z2(i34, i34 + s1Var.f22749c, this.Yd, i19 + this.f23126ae)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f23244j6 != i31 || this.f23230i6 != i32) {
                this.f23244j6 = i31;
                this.f23230i6 = i32;
                invalidate();
            }
        }
        if (this.f23465ya) {
            if (Math.abs(this.Ja - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Zd), this.Ha - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        zg.o0 o0Var = this.N;
        int i35 = o0Var.d;
        boolean Z2 = Z2(i35, i35 + o0Var.f54678o, this.Yd, i18 + this.f23126ae);
        if (this.f23272l6 != Z2) {
            this.f23272l6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        this.nc = z10;
        if (z10) {
            this.f23320oc = z11;
        } else {
            this.f23320oc = false;
        }
    }

    public final boolean c1(float f7, int i10) {
        zg.o0 o0Var = this.N;
        if (!o0Var.K) {
            return false;
        }
        float y3 = getY() + o0Var.d;
        if (y3 <= f7 || (y3 + o0Var.f54678o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        if (this.f23462y7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.i6.f21000o2;
            int i13 = org.telegram.ui.ActionBar.i6.f20843fc;
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.i6.f21165x2.setColor(org.telegram.ui.ActionBar.i6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.i6.f21018p2.setColor(org.telegram.ui.ActionBar.i6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.i6.f21037q2.setColor(org.telegram.ui.ActionBar.i6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.i6.f21055r2.setColor(org.telegram.ui.ActionBar.i6.w0(i13, this.Id));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.i6.f21165x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.i6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.i6.f20741a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.i6.f21000o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.i6.f21018p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.i6.f21037q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.i6.f21055r2;
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20878hc, this.Id);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.i6.f21000o2;
            int i14 = org.telegram.ui.ActionBar.i6.ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.i6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.i6.f21165x2.setColor(org.telegram.ui.ActionBar.i6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.i6.f21018p2.setColor(org.telegram.ui.ActionBar.i6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.i6.f21037q2.setColor(org.telegram.ui.ActionBar.i6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.i6.f21055r2.setColor(org.telegram.ui.ActionBar.i6.w0(i14, this.Id));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.i6.f21165x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.i6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.i6.f20741a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.i6.f21000o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.i6.f21018p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.i6.f21037q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.i6.f21055r2;
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, this.Id);
            textPaint16.linkColor = w03;
            textPaint15.linkColor = w03;
            textPaint14.linkColor = w03;
            textPaint13.linkColor = w03;
            textPaint12.linkColor = w03;
            textPaint11.linkColor = w03;
            textPaint10.linkColor = w03;
        }
        if (this.L1 != null) {
            int i15 = this.K1;
            f1 f1Var = this.G5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f23462y7.isOutOwner()) {
                        int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21155wb, this.Id);
                        int w05 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21174xb, this.Id);
                        int i16 = org.telegram.ui.ActionBar.i6.f21208zb;
                        f1Var.h(w04, w05, org.telegram.ui.ActionBar.i6.w0(i16, this.Id), org.telegram.ui.ActionBar.i6.w0(i16, this.Id), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21190yb, this.Id));
                    } else if (this.f23212h2 && this.f23122aa != null) {
                        int c10 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21121ud, this.Id), this.f23122aa.h());
                        int c11 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21138vd, this.Id), this.f23122aa.h());
                        int i17 = org.telegram.ui.ActionBar.i6.f21175xd;
                        f1Var.h(c10, c11, org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(i17, this.Id), this.f23122aa.h()), org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(i17, this.Id), this.f23122aa.h()), org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21157wd, this.Id), this.f23122aa.h()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21121ud, this.Id);
                        int w07 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21138vd, this.Id);
                        int i18 = org.telegram.ui.ActionBar.i6.f21175xd;
                        f1Var.h(w06, w07, org.telegram.ui.ActionBar.i6.w0(i18, this.Id), org.telegram.ui.ActionBar.i6.w0(i18, this.Id), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21157wd, this.Id));
                    }
                }
            } else {
                boolean isOutOwner = this.f23462y7.isOutOwner();
                op0 op0Var = this.H5;
                if (isOutOwner) {
                    int w08 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ab, this.Id);
                    int w09 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Cb, this.Id);
                    int w010 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Bb, this.Id);
                    op0Var.f29559p = w08;
                    op0Var.f29560q = w09;
                    op0Var.f29561r = w010;
                    int w011 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21155wb, this.Id);
                    int w012 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21174xb, this.Id);
                    int i19 = org.telegram.ui.ActionBar.i6.f21208zb;
                    f1Var.h(w011, w012, org.telegram.ui.ActionBar.i6.w0(i19, this.Id), org.telegram.ui.ActionBar.i6.w0(i19, this.Id), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21190yb, this.Id));
                } else if (this.f23212h2 && this.f23122aa != null) {
                    int c12 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21191yd, this.Id), this.f23122aa.h());
                    int c13 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ad, this.Id), this.f23122aa.h());
                    int c14 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21210zd, this.Id), this.f23122aa.h());
                    op0Var.f29559p = c12;
                    op0Var.f29560q = c13;
                    op0Var.f29561r = c14;
                    int c15 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21121ud, this.Id), this.f23122aa.h());
                    int c16 = org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21138vd, this.Id), this.f23122aa.h());
                    int i20 = org.telegram.ui.ActionBar.i6.f21175xd;
                    f1Var.h(c15, c16, org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(i20, this.Id), this.f23122aa.h()), org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(i20, this.Id), this.f23122aa.h()), org.telegram.ui.ActionBar.i6.c(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21157wd, this.Id), this.f23122aa.h()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21191yd, this.Id);
                    int w014 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ad, this.Id);
                    int w015 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21210zd, this.Id);
                    op0Var.f29559p = w013;
                    op0Var.f29560q = w014;
                    op0Var.f29561r = w015;
                    int w016 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21121ud, this.Id);
                    int w017 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21138vd, this.Id);
                    int i21 = org.telegram.ui.ActionBar.i6.f21175xd;
                    f1Var.h(w016, w017, org.telegram.ui.ActionBar.i6.w0(i21, this.Id), org.telegram.ui.ActionBar.i6.w0(i21, this.Id), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21157wd, this.Id));
                }
            }
        }
        MessageObject messageObject = this.f23462y7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.i6.T2;
            int w018 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, this.Id);
            if (f3()) {
                if (this.f23462y7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.i6.nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.i6.f21010od;
                }
            } else if (this.f23462y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.i6.f21082sb;
            } else {
                i12 = org.telegram.ui.ActionBar.i6.f20991nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.i6.w0(i12, this.Id)));
        } else if (this.f23261k8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, this.Id));
            } else {
                org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20936kd, this.Id));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.i6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.i6.nb;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f21082sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.Id));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.i6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.i6.f21010od;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f20991nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.i6.w0(i10, this.Id));
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
        MessageObject messageObject = this.f23462y7;
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
        boolean z11 = this.f23348qd;
        float f10 = 1.0f;
        zg.o0 o0Var = this.N;
        if (z11) {
            o0Var.f54666a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f23272l6 && V2()) {
            if (o0Var.f54666a > 0.0f) {
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
            int i10 = (o0Var.f54666a > 0.0f ? 1 : (o0Var.f54666a == 0.0f ? 0 : -1));
            t1 t1Var = this.Zc;
            if (i10 <= 0 && t1Var.f23023w0 && this.L == null && !this.f23348qd) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + t1Var.f22966i0);
                o0Var.D = 0.0f;
                o0Var.E = false;
                if (t1Var.f22956g) {
                    f10 = t1Var.K1;
                }
                o0Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                o0Var.D = 0.0f;
                o0Var.E = false;
                if (t1Var.f22956g) {
                    f10 = t1Var.K1;
                }
                o0Var.d(canvas, f10, num);
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if ((groupedMessagePosition == null || ((groupedMessages = this.K) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Zc.f23023w0) {
                if (!this.f23440x || !this.f23462y7.isVoice()) {
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
            if (user != null && user.f20189id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f23462y7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f23462y7) != null) {
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
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f23462y7.isVideo();
        ai.m4 m4Var = this.S0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
                m4Var.setAllowStartAnimation(false);
                m4Var.stopAnimation();
                return;
            }
            m4Var.setAllowStartAnimation(true);
            m4Var.startAnimation();
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
        m4Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            m4Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            m4Var.startAnimation();
        } else {
            m4Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f23348qd;
        float f7 = 1.0f;
        zg.o0 o0Var = this.N;
        if (z10) {
            o0Var.f54666a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f23272l6 || !V2()) {
            return false;
        }
        if (o0Var.f54666a > 0.0f) {
            p0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i10 = (o0Var.f54666a > 0.0f ? 1 : (o0Var.f54666a == 0.0f ? 0 : -1));
        t1 t1Var = this.Zc;
        if (i10 <= 0 && t1Var.f23023w0 && this.L == null && !this.f23348qd) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + t1Var.f22966i0);
            if (t1Var.f22956g) {
                f7 = t1Var.K1;
            }
            o0Var.e(canvas, f7);
            canvas.restore();
        } else {
            if (t1Var.f22956g) {
                f7 = t1Var.K1;
            }
            o0Var.e(canvas, f7);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f23462y7.messageOwner).period;
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
        if ((this.K == null || (this.L.flags & 4) != 0) && !this.f23212h2) {
            MessageObject messageObject = this.f23462y7;
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
            l1Var.y2(this, reactionCount, z10, f7, f10);
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
            canvas2.translate(this.f23296n0, this.f23351r0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f23274l8) || ((!this.f23274l8 && this.f23177e8) || this.f23191f8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f23462y7;
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
        ai.m4 m4Var = this.S0;
        m4Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f23289m9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.F9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f23360r9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f23454xe = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f23188f4)) {
                        n4();
                        this.f23454xe = (int) (i10 + this.f23340q4);
                        this.f23468ye = this.f23146c4;
                    }
                    i10 = this.f23366s0 + this.f23395u0 + i10;
                }
            }
            return i10;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        m4Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f23366s0 + this.f23395u0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f23240j1 && !this.f23206g8 && !this.f23191f8) {
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
        if ((i10 != -1 && i10 != 1) || this.f23273l7 == z10) {
            return;
        }
        this.f23273l7 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f23287m7 = f10;
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
        return this.f23308ne;
    }

    @Override
    public float getAlpha() {
        if (this.Xc) {
            return this.Yc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.b6[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.getAnimatedEmojiSpans():org.telegram.ui.Components.b6[]");
    }

    public float getAnimationOffsetX() {
        return this.Ae;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f23317o8) {
            return this.f23289m9;
        }
        return null;
    }

    public sb0 getBackgroundDrawable() {
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
                MessageObject messageObject = this.f23462y7;
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
        if (!this.f23261k8) {
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
            if (this.f23348qd) {
                return (this.L8 - this.J8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.L8 - this.J8;
            if (this.f23261k8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f23348qd) {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f23317o8) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f23317o8) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (!this.f23261k8) {
                f7 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f7);
        }
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.L.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f23348qd) {
            if (this.J) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f23261k8 && this.J) {
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
        if (this.f23348qd) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.J && (messageObject2 = this.f23462y7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.J && ((messageObject = this.f23462y7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f23261k8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f23261k8 && this.J) {
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
        if (!this.f23261k8 && this.I) {
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
            return AndroidUtilities.lerp(t1Var.A1, this.f23155d0, t1Var.K1);
        }
        return this.f23155d0;
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f23462y7;
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
        if (z10 && (M0(this.f23462y7) || this.L5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f23316o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f23462y7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f23418v8;
                if (!this.f23261k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f7);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((e0) arrayList.get(i15)).f22004c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f23170e0 != null) {
            backgroundDrawableLeft = Math.min(this.I8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int dp;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f23462y7) || this.L5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f23316o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f23462y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f23418v8;
                if (!this.f23261k8 && !this.J) {
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
                i12 = Math.max(i12, ((int) (e0Var.f22004c * f10)) + dp + ((int) (e0Var.f22005e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f23170e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.f23146c4;
    }

    public float getCaptionX() {
        t1 t1Var = this.Zc;
        if (t1Var.f23023w0) {
            if (t1Var.C0) {
                this.f23326p4 += t1Var.f22957g0;
            } else if (t1Var.f23008s0) {
                float f7 = this.f23326p4;
                float f10 = t1Var.K1;
                this.f23326p4 = com.google.android.gms.internal.vision.e2.y(1.0f, f10, t1Var.f23000q0, f7 * f10);
            } else if (!this.f23462y7.isVoice() || !TextUtils.isEmpty(this.f23462y7.caption)) {
                this.f23326p4 += t1Var.f22957g0;
            }
        }
        return this.f23326p4;
    }

    public float getCaptionY() {
        float f7 = this.f23340q4;
        t1 t1Var = this.Zc;
        if (t1Var.f23023w0) {
            if (t1Var.C0) {
                return f7 - getTranslationY();
            }
            if (t1Var.f23008s0) {
                float f10 = t1Var.K1;
                return com.google.android.gms.internal.vision.e2.y(1.0f, f10, t1Var.f23004r0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f23337q1;
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
        if (this.f23462y7.shouldDrawWithoutBackground()) {
            f7 = this.nb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f7 = this.nb;
            intrinsicHeight = org.telegram.ui.ActionBar.i6.F3.getIntrinsicHeight();
        }
        return (int) (f7 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.f5 f5Var = this.f23389t8;
        if (f5Var == null) {
            return 0;
        }
        int i10 = f5Var.getBounds().left;
        if (!this.f23462y7.isOutOwner() && this.Zc.f23035z0 != 1.0f) {
            boolean z10 = this.f23348qd;
            if ((z10 || !this.f23261k8) && !this.J) {
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
        org.telegram.ui.ActionBar.f5 f5Var = this.f23389t8;
        if (f5Var == null) {
            return getWidth();
        }
        int i10 = f5Var.getBounds().right;
        if (this.f23462y7.isOutOwner() && this.Zc.f23035z0 != 1.0f && (((z10 = this.f23348qd) || !this.f23261k8) && !this.J)) {
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
        return this.Zc.f22966i0;
    }

    public float getDeltaLeft() {
        return this.Zc.f22957g0;
    }

    public float getDeltaRight() {
        return this.Zc.f22961h0;
    }

    public float getDeltaTop() {
        return this.Zc.f22971j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f7;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z10 = this.f23241j2;
        float f10 = 0.0f;
        t1 t1Var = this.Zc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f23309o0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f23255k2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f23309o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f23462y7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f23309o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.f23462y7.isOutOwner()) {
                    f7 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23418v8;
                    if (this.f23462y7.type == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.J9, this.L9) + f7) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f23261k8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f23418v8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f23418v8;
                        if (!this.J) {
                            f11 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f7 = extraTextX + dp;
                }
                dp2 = (f7 + t1Var.f22957g0) - AndroidUtilities.dp(1.33f);
                float f12 = this.f23322p0;
                if (t1Var.f23006r2) {
                    AndroidUtilities.lerp(t1Var.f23002q2, f12, t1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (t1Var != null) {
            f10 = t1Var.f22961h0;
        }
        float f13 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.f23462y7.isOutOwner() && !this.f23261k8 && !this.J) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f13 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f23383t2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f23368s2) - this.f23383t2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f7;
        float f10 = this.f23311o2;
        t1 t1Var = this.Zc;
        if (!t1Var.f23006r2) {
            f7 = (-t1Var.f22971j0) + t1Var.f22966i0;
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
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f23462y7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f23214h4;
    }

    public float getExplanationX() {
        return this.f23119a7;
    }

    public float getExplanationY() {
        return this.f23134b7;
    }

    public int getExtraInsetHeight() {
        float f7;
        int i10;
        int i11 = this.f23385t4;
        boolean z10 = this.N1;
        zg.o0 o0Var = this.N;
        if (z10) {
            if (o0Var.f54682s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f23186f2;
        }
        if (this.f23247j9) {
            if (f4()) {
                f7 = 41.3f;
            } else {
                f7 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f7);
        }
        if (!o0Var.f54682s && this.f23462y7.shouldDrawReactionsInLayout()) {
            return i11 + o0Var.f54679p;
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f23175e5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f23175e5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f23462y7.messageOwner.attachPath;
                }
                if (this.f23462y7.isSendError() && (i10 = this.K1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f23462y7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f7;
        TLRPC.User user = this.Yb;
        if (user != null && user.f20189id == 0) {
            f7 = this.f23289m9.getCenterX();
        } else {
            f7 = this.f23235ib + this.H1;
        }
        return (int) f7;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f23199g1;
    }

    public float getLastTouchY() {
        return this.f23211h1;
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
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = this.K1;
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f23462y7).type) != 5) {
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
                    if (this.K.posArray.get(i14).minY != 0) {
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
                if (this.f23317o8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.J8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f23462y7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f23261k8) {
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
        MessageObject messageObject3 = this.f23462y7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f23462y7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.rd && ((messageObject = this.f23462y7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.J8 - (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.F8 && (this.f23462y7.type == 5 || this.K1 == 6)) {
            return this.J8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.J8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        t1 t1Var = this.Zc;
        if (t1Var.Z1) {
            return AndroidUtilities.lerp(t1Var.Y1, this.f23298n2, t1Var.K1);
        }
        return this.f23298n2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f23476z7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f23462y7;
    }

    public int getNameStatusX() {
        int i10;
        float f7 = this.Wa + this.Va;
        int i11 = this.f23477z8;
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
        return getTopicSeparatorTopPadding() + this.V + this.f23210h0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f23462y7;
        if (messageObject == null) {
            messageObject = this.f23476z7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.J0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        k4 k4Var = this.F7;
        if (k4Var != null) {
            return k4Var.f22374e + k4Var.h;
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
        MessageObject messageObject2 = this.f23462y7;
        if (messageObject2 != null && this.K != null && messageObject2.hasValidGroupId()) {
            messageObject = this.K.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f23462y7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.O0;
    }

    public zg.o0 getReactionsLayout() {
        return this.N;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.Id;
    }

    public op0 getSeekBarWaveform() {
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
        return this.f23483ze;
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
        MessageObject messageObject3 = this.f23462y7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        t1 t1Var = this.Zc;
        if (t1Var.f23032y1) {
            return AndroidUtilities.lerp(t1Var.f23028x1, this.V, t1Var.K1);
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
        return this.f23296n0;
    }

    public int getTextY() {
        return this.f23351r0;
    }

    public float getTimeAlpha() {
        return this.f23285m5;
    }

    public float getTimeX() {
        int i10;
        t1 t1Var = this.Zc;
        if (t1Var.f22962h1) {
            i10 = AndroidUtilities.lerp(t1Var.f22958g1, this.f23362rb, t1Var.K1);
        } else {
            i10 = this.f23362rb;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (f4()) {
            if (this.f23247j9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f23462y7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.K8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f23247j9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f23298n2 + this.Lc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        t1 t1Var = this.Zc;
        if (t1Var.f23017u1) {
            return AndroidUtilities.lerp(t1Var.f23013t1, this.f23184f0, t1Var.K1);
        }
        return this.f23184f0;
    }

    public t1 getTransitionParams() {
        return this.Zc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        t1 t1Var = this.Zc;
        if (t1Var == null || (messageObject = this.f23462y7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (t1Var.l1) {
            if (this.f23343q8) {
                return t1Var.K1;
            }
            return 1.0f - t1Var.K1;
        } else if (this.f23343q8) {
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
            return AndroidUtilities.lerp(t1Var.O1, this.f23373s7, t1Var.K1);
        }
        return this.f23373s7;
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
        u1Var.f23120a8 = this.f23120a8;
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
        u1Var.f23135b8 = this.f23135b8;
        u1Var.f23150c8 = this.f23150c8;
        u1Var.f23163d8 = this.f23163d8;
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
        zg.o0 o0Var = this.N;
        if (!o0Var.f54667b) {
            o0Var.D = f7;
            o0Var.E = z10;
            o0Var.d(canvas, this.Zc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f23476z7 != null) {
            return this.D7;
        }
        return this.G;
    }

    public final void h4() {
        ai.m4 m4Var = this.S0;
        i4((m4Var.getImageWidth() / 2.0f) + m4Var.getImageX(), (m4Var.getImageHeight() / 2.0f) + m4Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f23320oc;
    }

    public final void i1(u1 u1Var) {
        vh.f fVar;
        if (u1Var != null && (fVar = u1Var.Fb) != null) {
            int i10 = (Integer) fVar.f49721k.get(u1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Gb = i10;
            vh.f fVar2 = this.Fb;
            if (fVar2 != null) {
                fVar2.f49721k.put(this, i10);
            }
        }
    }

    public final void i2(sm smVar, Canvas canvas, int i10, Integer num, float f7) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        zg.o0 o0Var = this.N;
        if (!o0Var.f54667b) {
            o0Var.D = f7;
            o0Var.f(smVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f7) {
        if (this.f23389t8 != null) {
            int i10 = this.f23418v8;
            if (f7 >= i10 && f7 <= i10 + this.f23433w8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f7, float f10) {
        u1 u1Var;
        ai.m4 m4Var = this.S0;
        this.Eb = (float) Math.sqrt(Math.pow(m4Var.getImageHeight(), 2.0d) + Math.pow(m4Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f23462y7;
        if (!messageObject.isMediaSpoilersRevealed && this.Bb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                u1Var = this;
                u1Var.V3(messageObject, this.K, this.F, this.E, this.G, this.H);
                MessageObject messageObject2 = u1Var.f23462y7;
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
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.o.a(u1Var.Eb * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(is.f27446j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new k1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        l1 l1Var;
        if (this.f23462y7 == null) {
            return;
        }
        Runnable runnable = this.f21782e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f23280le;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f23294me;
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
        u1Var.b4(this.Yd, this.f23126ae, this.f23141be, this.f23154ce, this.f23169de, this.J0, this.K0, this.Uc, this.Vc, this.Zd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f7) {
        String str;
        p0();
        if (this.f23451xa) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f7, f7, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.i6.f20869h2);
        }
    }

    public final boolean j3() {
        if (this.f23476z7 != null) {
            return this.E7;
        }
        return this.H;
    }

    public final boolean j4() {
        l1 l1Var;
        if (getCurrentMessagesGroup() == null && (l1Var = this.Jc) != null && l1Var.E2() != null && this.Jc.E2().z(this.f23462y7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.W8 == null) {
            this.W8 = new ImageReceiver[3];
            this.X8 = new org.telegram.ui.Components.j9[3];
            this.Y8 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W8;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.W8[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.X8[i10] = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
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
        float dp;
        float f11;
        float f12;
        float f13;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.ta || z10) && this.f23405ua != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition == null || (groupedMessages = this.K) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f23462y7.isOutOwner();
                t1 t1Var = this.Zc;
                if (isOutOwner) {
                    float dp2 = t1Var.f22967i1 - AndroidUtilities.dp(40.0f);
                    this.Ga = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.K;
                    if (groupedMessages2 != null) {
                        this.Ga = (groupedMessages2.transitionParams.offsetLeft - this.Ae) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + t1Var.f22972j1;
                    this.Ga = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.K;
                    if (groupedMessages3 != null) {
                        this.Ga = (groupedMessages3.transitionParams.offsetRight - this.Ae) + dp3;
                    }
                }
                float f14 = 0.0f;
                if (this.f23405ua == 4) {
                    this.Ha = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.M8 + t1Var.f22966i0) - AndroidUtilities.dp(41.0f);
                    this.Ha = dp4;
                    MessageObject messageObject = this.f23462y7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f23346qb) {
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
                    if (this.f23462y7.shouldDrawReactions()) {
                        zg.o0 o0Var = this.N;
                        if (!o0Var.f54667b) {
                            if (this.f23348qd) {
                                this.Ha -= (1.0f - getVideoTranscriptionProgress()) * o0Var.i(t1Var.K1);
                            } else if (o0Var.f54666a > 0.0f) {
                                this.Ha -= o0Var.i(t1Var.K1);
                            }
                        }
                    }
                }
                if (this.f23405ua != 4) {
                    float dp5 = ((this.M8 + t1Var.f22966i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Ha < dp5) {
                        this.Ha = dp5;
                    }
                }
                if (this.f23462y7.type == 19) {
                    if (this.f23405ua == 3 && this.Z8 != null) {
                        this.Ha = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Ha = 0.0f;
                    }
                }
                if (!this.f23462y7.isOutOwner() && this.f23348qd && !this.f23212h2) {
                    if (this.f23317o8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.rd) {
                        f11 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f11 = 0.0f;
                    }
                    if (this.rd) {
                        f14 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (t1Var.f22977k2) {
                        if (this.rd) {
                            f12 = t1Var.K1;
                        } else {
                            f12 = 1.0f - t1Var.K1;
                        }
                        f11 = (1.0f - getVideoTranscriptionProgress()) * f12 * dp;
                        if (this.rd) {
                            f13 = t1Var.K1;
                        } else {
                            f13 = 1.0f - t1Var.K1;
                        }
                        f14 = (1.0f - getVideoTranscriptionProgress()) * f13 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ga -= f11;
                    this.Ha -= f14;
                }
                this.f23419va = true;
                if (this.f23405ua == 3) {
                    if (!this.f23440x || this.f23462y7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!tw0.f31241v0) {
                    float f17 = this.Ga;
                    float f18 = this.Ha;
                    float dp6 = AndroidUtilities.dp(32.0f) + f17;
                    float f19 = this.Ha;
                    if (this.f23435wa == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    float dp7 = f19 + AndroidUtilities.dp(f7);
                    RectF rectF = this.f23147c5;
                    rectF.set(f17, f18, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f23419va = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.f23455y.f16341e) * 255.0f);
                    int i11 = -1;
                    if (i10 != 255) {
                        float f20 = this.Ga;
                        f10 = 2.0f;
                        i11 = canvas.saveLayerAlpha(f20, this.Ha, AndroidUtilities.dp(32.0f) + f20, this.Ha + AndroidUtilities.dp(64.0f), i10);
                    } else {
                        f10 = 2.0f;
                    }
                    p0();
                    String str = "paintChatActionBackground";
                    if (this.f23405ua == 4 && this.f23435wa == 5 && this.f23451xa) {
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
                        if (this.f23451xa) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.f20869h2);
                    }
                    int i12 = this.f23405ua;
                    if (i12 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        a0.q(L2, (this.Ga + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f10), (this.Ha + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f10));
                        L2.draw(canvas);
                    } else if (i12 == 4) {
                        int dp12 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp13 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L22 = L2("drawableCloseIcon");
                        int intrinsicWidth = L22.getIntrinsicWidth() / 2;
                        int intrinsicHeight = L22.getIntrinsicHeight() / 2;
                        L22.setBounds(dp12 - intrinsicWidth, dp13 - intrinsicHeight, intrinsicWidth + dp12, intrinsicHeight + dp13);
                        a0.q(L22, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, L22.getBounds().centerX(), L22.getBounds().centerY());
                        L22.draw(canvas);
                        canvas.restore();
                        if (this.f23435wa == 5) {
                            Drawable L23 = L2("drawableMoreIcon");
                            int intrinsicWidth2 = L23.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = L23.getIntrinsicHeight() / 2;
                            L23.setBounds(dp12 - intrinsicWidth2, dp13 - intrinsicHeight2, dp12 + intrinsicWidth2, dp13 + intrinsicHeight2);
                            a0.q(L23, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(34.0f));
                            L23.draw(canvas);
                        }
                    } else {
                        int dp14 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp15 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L24 = L2("drawableShareIcon");
                        int intrinsicWidth3 = L24.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = L24.getIntrinsicHeight() / 2;
                        L24.setBounds(dp14 - intrinsicWidth3, dp15 - intrinsicHeight3, dp14 + intrinsicWidth3, dp15 + intrinsicHeight3);
                        a0.q(L24, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
                        L24.draw(canvas);
                    }
                    if (i11 != -1) {
                        canvas.restoreToCount(i11);
                    }
                }
            }
        }
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        MessageObject messageObject = this.f23462y7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f23462y7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f23462y7.isSponsored() || this.f23462y7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.O7 && !this.f23163d8) {
            return false;
        }
        TLRPC.Message message2 = this.f23462y7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f23462y7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.f23163d8 && this.f23462y7.type == 0) || ((!this.E && this.Ya && this.N7 && (!this.f23462y7.isOutOwner() || ((this.f23462y7.isSupergroup() && this.f23462y7.isFromGroup()) || this.f23462y7.isRepostPreview))) || (this.f23462y7.isImportedForward() && this.f23462y7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                s1 s1Var = (s1) arrayList.get(i10);
                if (this.Jc.O(this, s1Var.f22764t, !s1Var.f22753i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f23462y7.getDialogId();
                    int i11 = this.I7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f23462y7);
                    int i12 = this.I7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, s1Var.f22764t.f20187id, !s1Var.f22753i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!s1Var.f22753i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        s1Var.f22768y.p(userOrChat);
                        s1Var.f22769z.setForUserOrChat(userOrChat, s1Var.f22768y);
                        s1Var.f22761q = new m11(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.R8[i10].f(-1, !s1Var.f22753i, true);
                    if (this.f23414v4 != null) {
                        if (!this.f23462y7.isOutOwner() && this.f23462y7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f23414v4.t(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f23462y7.getFromChatId())), true, true);
                        } else {
                            this.f23414v4.t(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    s1Var.f22753i = !s1Var.f22753i;
                    invalidate();
                    return;
                }
                this.f23461y6 = false;
            }
        }
    }

    @Override
    public final void l() {
        l1 l1Var;
        if (this.f23462y7 != null) {
            Runnable runnable = this.f23280le;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f23294me;
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
            this.f23366s0 = AndroidUtilities.dp(60.0f) + this.f23366s0;
            if (z10 != this.W2) {
                this.W2 = 0;
                int A = bi.A(75.0f, this.J8, i10);
                float dpf2 = (this.J8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.X2;
                if (arrayList == null) {
                    this.X2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.U2) {
                    this.W2 |= 1;
                    this.X2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), A, dpf2));
                }
                if (this.T2) {
                    this.W2 |= 2;
                    this.X2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), A, dpf2));
                }
                if (this.V2) {
                    this.W2 |= 4;
                    this.X2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), A, dpf2));
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
        int i10;
        Drawable L2;
        Drawable drawable;
        int w02;
        float f16;
        MessageObject messageObject;
        boolean z17 = (f12 == 1.0f || z15) ? false : true;
        float f17 = (f12 * 0.5f) + 0.5f;
        float f18 = z17 ? f7 * f12 : f7;
        if (this.K1 != 7 || ((messageObject = this.f23462y7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f23381t0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.Zc.K1) + AndroidUtilities.dp(this.J ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f23462y7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            kd0 kd0Var = org.telegram.ui.ActionBar.i6.E3;
            if (f4()) {
                if (this.f23462y7.shouldDrawWithoutBackground()) {
                    f13 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, this.Id);
                    int i11 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    kd0Var.getClass();
                    f15 = 4.0f;
                    a0.q(kd0Var, ((i11 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    kd0Var.setAlpha((int) (this.f23285m5 * 255.0f * f18));
                } else {
                    f13 = 1.0f;
                    f15 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21101tc, this.Id);
                    int i12 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    kd0Var.getClass();
                    a0.q(kd0Var, ((i12 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    kd0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 1.0f;
                f15 = 4.0f;
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Na, this.Id);
                kd0Var.getClass();
                f14 = 18.5f;
                a0.q(kd0Var, (this.L8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f11 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f10);
                kd0Var.setAlpha((int) (f18 * 255.0f));
            }
            kd0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, kd0Var.getBounds().centerX(), kd0Var.getBounds().centerY());
            }
            kd0Var.draw(canvas);
            kd0Var.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
            invalidate();
        } else {
            f13 = 1.0f;
            f14 = 18.5f;
            f15 = 4.0f;
        }
        if (z11) {
            if (f4()) {
                if (z15) {
                    canvas.save();
                }
                if (this.f23462y7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f13 - f12), 0.0f);
                        }
                        a0.q(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        a0.q(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f23285m5 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f13 - f12) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.q(org.telegram.ui.ActionBar.i6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.i6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.i6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        a0.q(org.telegram.ui.ActionBar.i6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.i6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.i6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.i6.F3.setAlpha((int) (this.f23285m5 * 255.0f * f18));
                    drawable = org.telegram.ui.ActionBar.i6.F3;
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
                        canvas.translate((f13 - f12) * AndroidUtilities.dp(f15), 0.0f);
                    }
                    L2 = L2(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    a0.q(L2, ((this.L8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
                } else {
                    L2 = L2(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    a0.q(L2, ((this.L8 - AndroidUtilities.dp(f14)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
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
                Drawable L22 = this.f23462y7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.i6.G3;
                a0.q(L22, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f10);
                L22.setAlpha((int) (this.f23285m5 * 255.0f * f18));
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
                a0.q(L23, (this.L8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f10);
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
            RectF rectF = this.f23147c5;
            rectF.set((int) (dp + dp4), f20, AndroidUtilities.dp(14.0f) + i10, AndroidUtilities.dp(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.i6.f20760b2.getAlpha();
            org.telegram.ui.ActionBar.i6.f20760b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.i6.f20760b2);
            org.telegram.ui.ActionBar.i6.f20760b2.setAlpha(alpha);
            a0.q(org.telegram.ui.ActionBar.i6.f20908j4, AndroidUtilities.dp(6.0f) + i10, f20 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.i6.f20908j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.i6.f20908j4.getBounds().centerX(), org.telegram.ui.ActionBar.i6.f20908j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.i6.f20908j4.draw(canvas);
            org.telegram.ui.ActionBar.i6.f20908j4.setAlpha(255);
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
        if (this.ge && (messageObject = this.f23462y7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.s5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f23146c4;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.f23333pc = org.telegram.ui.Components.b6.update(i10, (View) this, false, this.f23333pc, arrayList);
            } else {
                l1 l1Var = this.Jc;
                if (l1Var != null && l1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f23333pc = org.telegram.ui.Components.b6.update(i10, this, z10, this.f23333pc, this.f23462y7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f23462y7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                l1 l1Var2 = this.Jc;
                if (l1Var2 == null || !l1Var2.f()) {
                    z11 = true;
                }
                richMessageLayout.invalidateAnimatedEmojiInParent = z11;
                this.f23462y7.richLayout.updateAnimatedEmojis(i10);
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
                Math.ceil(org.telegram.ui.ActionBar.i6.N2.measureText("00:00"));
                this.D8 = i12 - AndroidUtilities.dp(18.0f);
                x3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.f23332pb;
                if (!this.f23212h2) {
                    this.J8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.i6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.H5.f29556m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.L1)) {
                this.K1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    q4();
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.C2.measureText(str2));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.i6.C2, this.U3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                CharSequence ellipsize = TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.i6.O2, i15 - AndroidUtilities.dp(12.0f), truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.i6.O2;
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
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.i6.P2, i15, truncateAt), org.telegram.ui.ActionBar.i6.P2, i15, alignment, 1.0f, 0.0f, false);
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
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.N2.measureText(AndroidUtilities.formatShortDuration(i16, i16)));
                AndroidUtilities.dp(86.0f);
                this.D8 = this.J8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.L1, messageObject.hasValidGroupId())) {
                this.K1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.i6.C2;
                    int i17 = this.A4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f23399u4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.C2.measureText(str));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.i6.C2, this.U3, alignment2, 1.0f, 0.0f, false);
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
                StaticLayout c10 = nx0.c(documentFileName, org.telegram.ui.ActionBar.i6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
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
                TextPaint textPaint3 = org.telegram.ui.ActionBar.i6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.L1.size))));
                this.A4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.L1.size) + " " + FileLoader.getDocumentExtension(this.L1), org.telegram.ui.ActionBar.i6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.A4 < 0) {
                        this.A4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f23399u4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.i6.C2, this.A4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (this.M1) {
                    this.f23175e5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f23189f5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f23462y7.isHiddenSensitive() || (DownloadController.getInstance(this.I7).getAutodownloadMask() & 1) == 0) {
                        this.f23175e5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f23175e5;
                    ai.m4 m4Var = this.S0;
                    if (photoSize != null && photoSize != this.f23189f5) {
                        BitmapDrawable bitmapDrawable = this.f23462y7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f23189f5 = null;
                            this.f23203g5 = bitmapDrawable;
                        }
                    } else {
                        this.f23175e5 = null;
                        m4Var.setNeedsQualityThumb(true);
                        m4Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f23215h5 = "86_86_b";
                    m4Var.setImage(ImageLocation.getForObject(this.f23175e5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f23189f5, messageObject.photoThumbsObject), this.f23215h5, this.f23203g5, 0L, null, messageObject, 1);
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
        if (this.f23476z7 != null) {
            return this.C7;
        }
        return this.F;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.m4(boolean, boolean, boolean):void");
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
    }

    public final boolean n0() {
        if (this.f23462y7.hasMediaSpoilers() && !this.f23462y7.isMediaSpoilersRevealed && this.Bb == 0.0f && this.T0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final void n2(Canvas canvas, float f7, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        ai.m4 m4Var;
        char c10;
        int i11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        t1 t1Var;
        float f13;
        boolean z14;
        float f14;
        boolean z15;
        u1 u1Var;
        String str;
        boolean z16;
        float f15;
        float dp;
        float f16;
        boolean z17;
        t1 t1Var2;
        boolean z18;
        boolean z19;
        t1 t1Var3;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        Paint M2;
        float f17;
        float f18;
        int dp2;
        boolean z28;
        float photoBottom;
        float f19;
        int i14;
        int i15;
        float f20;
        float f21;
        t1 t1Var4;
        float f22;
        boolean z29;
        int i16;
        boolean z30;
        MessageObject messageObject;
        float j3;
        TextPaint textPaint;
        int i17;
        u1 u1Var2 = this;
        Canvas canvas2 = canvas;
        if (((u1Var2.f23406ub && !u1Var2.M) || !u1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = u1Var2.f23462y7;
            if ((!messageObject2.deleted || u1Var2.L == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.i6.T2;
                    int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, u1Var2.Id);
                    if (u1Var2.f3()) {
                        i17 = u1Var2.f23462y7.isOutOwner() ? org.telegram.ui.ActionBar.i6.nb : org.telegram.ui.ActionBar.i6.f21010od;
                    } else {
                        i17 = u1Var2.f23462y7.isOutOwner() ? org.telegram.ui.ActionBar.i6.f21082sb : org.telegram.ui.ActionBar.i6.f20991nd;
                    }
                    textPaint2.setColor(i0.a.d(u1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.i6.w0(i17, u1Var2.Id)));
                } else if (u1Var2.f4()) {
                    if (u1Var2.f23462y7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, u1Var2.Id));
                    } else {
                        org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20936kd, u1Var2.Id));
                    }
                } else if (u1Var2.f23462y7.isOutOwner()) {
                    org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(z11 ? org.telegram.ui.ActionBar.i6.nb : org.telegram.ui.ActionBar.i6.f21082sb, u1Var2.Id));
                } else {
                    org.telegram.ui.ActionBar.i6.T2.setColor(org.telegram.ui.ActionBar.i6.w0(z11 ? org.telegram.ui.ActionBar.i6.f21010od : org.telegram.ui.ActionBar.i6.f20991nd, u1Var2.Id));
                }
                float f23 = u1Var2.getTransitionParams().J1 ? u1Var2.getTransitionParams().K1 * f7 : f7;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (u1Var2.J && !u1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f24 = u1Var2.M8;
                t1 t1Var5 = u1Var2.Zc;
                if (t1Var5.f23023w0) {
                    f24 += t1Var5.f22966i0;
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
                if (t1Var5.f23023w0) {
                    float f28 = u1Var2.Ae;
                    f12 += f28;
                    f26 += f28;
                }
                float f29 = f12;
                boolean shouldDrawReactions = u1Var2.f23462y7.shouldDrawReactions();
                zg.o0 o0Var = u1Var2.N;
                if (shouldDrawReactions && o0Var.f54667b) {
                    if (t1Var5.f23023w0 && t1Var5.f22961h0 != 0.0f) {
                        j3 = o0Var.j(1.0f);
                    } else {
                        j3 = o0Var.j(t1Var5.K1);
                    }
                    f26 += j3;
                }
                if (t1Var5.T0) {
                    f26 = com.google.android.gms.internal.vision.e2.b(1.0f, t1Var5.K1, t1Var5.Y0, f26);
                }
                float f30 = f26;
                boolean f42 = u1Var2.f4();
                RectF rectF = u1Var2.f23147c5;
                ai.m4 m4Var2 = u1Var2.S0;
                if (f42) {
                    int i18 = -(u1Var2.f23247j9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (u1Var2.f23462y7.shouldDrawWithoutBackground()) {
                        M2 = u1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = u1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f31 = f23;
                    m4Var = m4Var2;
                    org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (u1Var2.f23285m5 * 255.0f * f31));
                    MessageObject messageObject3 = u1Var2.f23462y7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f17 = f29;
                        f18 = f31;
                    } else {
                        float currentAlpha = m4Var.isCrossfadingWithOldImage() ? 1.0f : m4Var.getCurrentAlpha();
                        if (!m4Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f17 = f29;
                        f18 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = u1Var2.f23462y7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.q5 q5Var = u1Var2.f23268l0;
                        f18 *= q5Var == null ? 0.0f : q5Var.e();
                    }
                    M2.setAlpha((int) com.google.android.gms.internal.vision.e2.C(alpha, u1Var2.f23285m5, f18, 0.6f));
                    int i19 = u1Var2.K1;
                    if (i19 != 7 && i19 != 6 && u1Var2.f23462y7.type != 19) {
                        int[] roundRadius = m4Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z28 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = u1Var2.f23462y7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z28 = false;
                    }
                    MessageObject messageObject6 = u1Var2.f23462y7;
                    float dp4 = f17 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (u1Var2.f23224i0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z28 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = u1Var2.f23462y7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f32 = f18;
                    float f33 = dp4;
                    if (u1Var2.K1 != 7 || ((messageObject = u1Var2.f23462y7) != null && messageObject.isRoundOnce())) {
                        photoBottom = u1Var2.getPhotoBottom() + u1Var2.f23381t0;
                    } else {
                        photoBottom = f27 - ((1.0f - u1Var2.getVideoTranscriptionProgress()) * (o0Var.i(t1Var5.K1) + AndroidUtilities.dp(u1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float dp7 = f34 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.i6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f35 = dp5 - dp6;
                    float f36 = dp6 + dp5 + f11;
                    int i20 = z28 ? 12 : 8;
                    if (u1Var2.f23462y7.isOutOwner()) {
                        f19 = f36;
                        i14 = (u1Var2.f23462y7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f19 = f36;
                        i14 = 0;
                    }
                    rectF.set(f35, dp7, f19 + AndroidUtilities.dp(i20 + i14), dp7 + max);
                    k4 k4Var = u1Var2.F7;
                    if (k4Var != null) {
                        float f37 = dp2;
                        canvas2.save();
                        Path path = k4Var.f22388t;
                        path.rewind();
                        path.addRoundRect(rectF, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!u1Var2.f23462y7.isQuickReply()) {
                        if (u1Var2.f23462y7.hasMediaSpoilers() && u1Var2.f23462y7.type != 5) {
                            Path path2 = u1Var2.E5;
                            path2.rewind();
                            float f38 = dp2;
                            path2.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = u1Var2.f23462y7.needDrawBluredPreview() ? m4Var : u1Var2.T0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = u1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * u1Var2.f23301n5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f38, f38, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            u1Var2.p0();
                            float f39 = dp2;
                            canvas2.drawRoundRect(rectF, f39, f39, M2);
                            if (M2 == u1Var2.M2("paintChatActionBackground") && u1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.i6.f20869h2.getAlpha();
                                org.telegram.ui.ActionBar.i6.f20869h2.setAlpha((int) (alpha4 * u1Var2.f23285m5 * f32));
                                canvas2.drawRoundRect(rectF, f39, f39, org.telegram.ui.ActionBar.i6.f20869h2);
                                org.telegram.ui.ActionBar.i6.f20869h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = u1Var2.f23462y7;
                    float dp8 = f40 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (u1Var2.f23462y7.shouldDrawReactions() && o0Var.f54667b) {
                        u1Var2.t4();
                        o0Var.D = 0.0f;
                        o0Var.E = false;
                        o0Var.d(canvas2, t1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(u1Var2.Zb) || u1Var2.Zb.megagroup) && (u1Var2.f23462y7.messageOwner.flags & 1024) == 0 && u1Var2.Vb == null && !u1Var2.Y7) {
                        i12 = i18;
                        i15 = 2;
                        f27 = f27;
                        c10 = 7;
                        f20 = dp8;
                        f23 = f31;
                    } else {
                        float lineWidth = (u1Var2.f23332pb - staticLayout.getLineWidth(0)) + dp8;
                        if (o0Var.f54667b && !o0Var.f54682s) {
                            lineWidth -= o0Var.f54680q;
                        }
                        float f41 = lineWidth;
                        int g10 = t1Var5.g();
                        int i21 = t1Var5.a2;
                        if (i21 >= 0 && i21 != g10 && !u1Var2.f23266kd) {
                            u1Var2.t1(i21, g10, z10);
                        }
                        boolean z31 = u1Var2.f23266kd;
                        if (z31) {
                            g10 = u1Var2.f23222hd;
                        }
                        boolean z32 = (g10 & 4) != 0;
                        boolean z33 = (g10 & 8) != 0;
                        if (z31) {
                            int i22 = u1Var2.f23237id;
                            if ((i22 & 4) != 0) {
                                i16 = i22;
                                z30 = true;
                            } else {
                                i16 = i22;
                                z30 = false;
                            }
                            float f43 = i18;
                            f21 = f41;
                            boolean z34 = z32;
                            i15 = 2;
                            c10 = 7;
                            i12 = i18;
                            t1Var4 = t1Var5;
                            boolean z35 = (i16 & 8) != 0;
                            u1Var2.L1(canvas2, z30, z35, f27, f31, f43, f33, 1.0f - u1Var2.f23251jd, z11);
                            boolean z36 = z30;
                            boolean z37 = z33;
                            u1Var2.L1(canvas, z34, z37, f27, f31, f43, f33, u1Var2.f23251jd, z11);
                            f27 = f27;
                            f22 = f33;
                            z29 = z34;
                            f23 = f31;
                            if (!u1Var2.f23462y7.isOutOwner()) {
                                if (!z36 && !z35) {
                                    u1Var2.p2(canvas, f23, f43, f22, 1.0f - u1Var2.f23251jd, z11);
                                }
                                if (!z29 && !z37) {
                                    u1Var2.p2(canvas, f23, f43, f22, u1Var2.f23251jd, z11);
                                }
                            }
                        } else {
                            f21 = f41;
                            boolean z38 = z32;
                            i15 = 2;
                            boolean z39 = z33;
                            c10 = 7;
                            i12 = i18;
                            t1Var4 = t1Var5;
                            if (!u1Var2.f23462y7.isOutOwner() && !z38 && !z39) {
                                u1Var2.p2(canvas, f31, i12, f33, 1.0f, z11);
                            }
                            u1Var2 = this;
                            u1Var2.L1(canvas, z38, z39, f27, f31, i12, f33, 1.0f, z11);
                            f27 = f27;
                            f22 = f33;
                            z29 = z38;
                            f23 = f31;
                        }
                        if (u1Var2.f23462y7.isOutOwner()) {
                            canvas2 = canvas;
                            u1Var2.p2(canvas2, f23, i12, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        t1Var5 = t1Var4;
                        t1Var5.a2 = t1Var4.g();
                        if (z29 && z10 && u1Var2.getParent() != null) {
                            ((View) u1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f44 = f30 + f20;
                    u1Var2.f23291mb = f44;
                    float dp9 = (f34 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    u1Var2.nb = dp9;
                    canvas2.translate(f44, dp9);
                    vh.g.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.i6.T2.setAlpha(255);
                    i13 = i15;
                    z13 = z28;
                    z12 = false;
                } else {
                    m4Var = m4Var2;
                    c10 = 7;
                    if (u1Var2.f23462y7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (u1Var2.K8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(u1Var2.f23247j9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f45 = -staticLayout.getLineLeft(0);
                    if (u1Var2.f23462y7.shouldDrawReactions() && o0Var.f54667b) {
                        u1Var2.t4();
                        o0Var.D = 0.0f;
                        o0Var.E = false;
                        o0Var.d(canvas2, t1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(u1Var2.Zb) || u1Var2.Zb.megagroup) && (u1Var2.f23462y7.messageOwner.flags & 1024) == 0 && u1Var2.Vb == null && !t1Var5.F && !u1Var2.Y7 && !t1Var5.B) {
                        z12 = false;
                    } else {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        if (o0Var.f54667b && !o0Var.f54682s) {
                            lineWidth2 -= o0Var.f54680q;
                        }
                        float f46 = lineWidth2;
                        int g11 = t1Var5.g();
                        int i23 = t1Var5.a2;
                        if (i23 >= 0 && i23 != g11 && !u1Var2.f23266kd) {
                            u1Var2.t1(i23, g11, z10);
                        }
                        boolean z40 = u1Var2.f23266kd;
                        if (z40) {
                            g11 = u1Var2.f23222hd;
                        }
                        boolean z41 = (g11 & 4) != 0;
                        boolean z42 = (g11 & 8) != 0;
                        if (z40) {
                            int i24 = u1Var2.f23237id;
                            if ((i24 & 4) != 0) {
                                f14 = f23;
                                z15 = true;
                            } else {
                                f14 = f23;
                                z15 = false;
                            }
                            boolean z43 = (i24 & 8) != 0;
                            float f47 = f14;
                            float f48 = i12;
                            z12 = false;
                            t1Var = t1Var5;
                            u1Var2.L1(canvas2, z15, z43, f27, f47, f48, f29, 1.0f - u1Var2.f23251jd, z11);
                            boolean z44 = z15;
                            boolean z45 = z43;
                            boolean z46 = z41;
                            boolean z47 = z42;
                            u1Var2.L1(canvas, z46, z47, f27, f47, f48, f29, u1Var2.f23251jd, z11);
                            f27 = f27;
                            f13 = f29;
                            z14 = z46;
                            f23 = f47;
                            if (!u1Var2.f23462y7.isOutOwner()) {
                                if (!z44 && !z45) {
                                    u1Var2.p2(canvas, f23, f48, f13, 1.0f - u1Var2.f23251jd, z11);
                                }
                                if (!z14 && !z47) {
                                    u1Var2.p2(canvas, f23, f48, f13, u1Var2.f23251jd, z11);
                                }
                            }
                        } else {
                            t1Var = t1Var5;
                            z12 = false;
                            boolean z48 = z41;
                            boolean z49 = z42;
                            if (!u1Var2.f23462y7.isOutOwner() && !z48 && !z49) {
                                u1Var2.p2(canvas, f23, i12, f29, 1.0f, z11);
                            }
                            u1Var2 = this;
                            float f49 = f23;
                            u1Var2.L1(canvas, z48, z49, f27, f49, i12, f29, 1.0f, z11);
                            f27 = f27;
                            f13 = f29;
                            z14 = z48;
                            f23 = f49;
                        }
                        if (u1Var2.f23462y7.isOutOwner()) {
                            canvas2 = canvas;
                            u1Var2.p2(canvas2, f23, i12, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        t1Var5 = t1Var;
                        t1Var5.a2 = t1Var.g();
                        if (z14 && z10 && u1Var2.getParent() != null) {
                            ((View) u1Var2.getParent()).invalidate();
                        }
                        f45 = f46;
                    }
                    canvas2.save();
                    if (t1Var5.T0 && t1Var5.K1 != 1.0f) {
                        if (t1Var5.U0 != null) {
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.i6.T2.getAlpha();
                            org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (alpha5 * t1Var5.K1));
                            t1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.i6.T2.setAlpha(alpha5);
                            vh.g.f(canvas2, t1Var5.V0);
                            i13 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.i6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i12;
                            canvas2.translate(t1Var5.f22958g1 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            i13 = 2;
                            org.telegram.ui.ActionBar.i6.T2.setAlpha((int) ((1.0f - t1Var5.K1) * f51));
                            vh.g.f(canvas2, t1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (f51 * t1Var5.K1));
                            vh.g.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.i6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i13 = 2;
                        float f52 = f30 + f45;
                        u1Var2.f23291mb = f52;
                        float dp10 = ((f27 - AndroidUtilities.dp((u1Var2.F || u1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        u1Var2.nb = dp10;
                        canvas2.translate(f52, dp10);
                        vh.g.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z13 = z12;
                }
                int i25 = i12;
                if (u1Var2.f23462y7.isOutOwner()) {
                    int g12 = t1Var5.g();
                    int i26 = t1Var5.a2;
                    if (i26 >= 0 && i26 != g12 && !u1Var2.f23266kd) {
                        u1Var2.t1(i26, g12, z10);
                    }
                    if (u1Var2.f23266kd) {
                        g12 = u1Var2.f23222hd;
                    }
                    if ((g12 & 1) != 0) {
                        f16 = f23;
                        z17 = true;
                    } else {
                        f16 = f23;
                        z17 = z12;
                    }
                    boolean z50 = (g12 & 2) != 0 ? true : z12;
                    if ((g12 & 4) != 0) {
                        t1Var2 = t1Var5;
                        z18 = true;
                    } else {
                        t1Var2 = t1Var5;
                        z18 = z12;
                    }
                    boolean z51 = (g12 & 8) != 0 ? true : z12;
                    if (u1Var2.f23349qe != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, u1Var2.f23349qe);
                        z19 = true;
                    } else {
                        z19 = z12;
                    }
                    if (u1Var2.f23266kd) {
                        int i27 = u1Var2.f23237id;
                        if ((i27 & 1) != 0) {
                            z21 = z17;
                            z22 = true;
                        } else {
                            z21 = z17;
                            z22 = z12;
                        }
                        boolean z52 = (i27 & 2) != 0 ? true : z12;
                        if ((i27 & 4) != 0) {
                            z23 = z18;
                            z24 = true;
                        } else {
                            z23 = z18;
                            z24 = z12;
                        }
                        if ((i27 & 8) != 0) {
                            z25 = z51;
                            z26 = true;
                        } else {
                            z25 = z51;
                            z26 = z12;
                        }
                        if (!z24 && z52 && z50 && !z22 && z21) {
                            t1Var3 = t1Var2;
                            boolean z53 = z21;
                            z18 = z23;
                            z27 = z12;
                            f15 = 0.0f;
                            str = "paintChatTimeBackground";
                            u1Var2.l2(canvas2, z53, z50, z18, z25, f16, z13, i25, f27, u1Var2.f23251jd, true, z11);
                        } else {
                            t1Var3 = t1Var2;
                            z27 = z12;
                            boolean z54 = z21;
                            f15 = 0.0f;
                            str = "paintChatTimeBackground";
                            float f53 = i25;
                            u1Var2.l2(canvas, z22, z52, z24, z26, f16, z13, f53, f27, 1.0f - u1Var2.f23251jd, false, z11);
                            z18 = z23;
                            u1Var2.l2(canvas, z54, z50, z18, z25, f16, z13, f53, f27, u1Var2.f23251jd, false, z11);
                        }
                        u1Var = this;
                        canvas2 = canvas;
                        z20 = z27;
                    } else {
                        t1Var3 = t1Var2;
                        f15 = 0.0f;
                        z20 = z12;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        l2(canvas2, z17, z50, z18, z51, f16, z13, i25, f27, 1.0f, false, z11);
                        u1Var = this;
                    }
                    if (z19) {
                        canvas2.restore();
                    }
                    t1Var3.a2 = t1Var3.g();
                    z16 = z20;
                    z16 = z20;
                    if (z10 && z18) {
                        z16 = z20;
                        if (u1Var.getParent() != null) {
                            ((View) u1Var.getParent()).invalidate();
                            z16 = z20;
                        }
                    }
                } else {
                    u1Var = u1Var2;
                    str = "paintChatTimeBackground";
                    z16 = z12;
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
                    rectF2.set(m4Var.getImageX(), m4Var.getImageY(), m4Var.getImageX2(), m4Var.getImageY2());
                    int[] roundRadius2 = m4Var.getRoundRadius();
                    float f54 = roundRadius2[z16 ? 1 : 0];
                    float[] fArr = u1Var.Rb;
                    fArr[1] = f54;
                    fArr[z16 ? 1 : 0] = f54;
                    float f55 = roundRadius2[1];
                    fArr[3] = f55;
                    fArr[i13] = f55;
                    float f56 = roundRadius2[i13];
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
                    rectF2.set(u1Var.Kb - AndroidUtilities.dp(12.0f), u1Var.Lb - AndroidUtilities.dp(8.0f), u1Var.Kb + org.telegram.ui.ActionBar.i6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + u1Var.Mb.getWidth() + AndroidUtilities.dp(12.0f), u1Var.Lb + u1Var.Mb.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (u1Var.Fb == null) {
                        if (u1Var.Pb == null) {
                            u1Var.Pb = new vh.g();
                        }
                        u1Var.Pb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        u1Var.Pb.setBounds((int) m4Var.getImageX(), (int) m4Var.getImageY(), (int) m4Var.getImageX2(), (int) m4Var.getImageY2());
                        u1Var.Pb.draw(canvas2);
                    }
                    u1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, u1Var.getWidth(), u1Var.getHeight(), (int) (u1Var.Jb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.i6.f20888i2.getAlpha();
                    org.telegram.ui.ActionBar.i6.f20888i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.i6.f20888i2);
                    org.telegram.ui.ActionBar.i6.f20888i2.setAlpha(alpha7);
                    canvas.translate(u1Var.Kb + AndroidUtilities.dp(4.0f), u1Var.Lb);
                    Drawable drawable = org.telegram.ui.ActionBar.i6.L3;
                    drawable.setBounds(z16 ? 1 : 0, z16 ? 1 : 0, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.i6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.i6.L3.draw(canvas);
                    float f58 = f15;
                    canvas.translate(org.telegram.ui.ActionBar.i6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), f58);
                    vh.g.f(canvas, u1Var.Mb);
                    canvas.restore();
                    if (u1Var.L2 != null && m4Var.getVisible() && u1Var.f23270l3 == 0) {
                        int i28 = SharedConfig.bubbleRadius;
                        int i29 = i13;
                        if (i28 > i29) {
                            dp = AndroidUtilities.dp(i28 - i29);
                            z13 = SharedConfig.bubbleRadius < 10 ? z16 ? 1 : 0 : true;
                        } else {
                            dp = AndroidUtilities.dp(i28);
                        }
                        int imageX = (int) (m4Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (m4Var.getImageY() + AndroidUtilities.dp(6.0f));
                        float dp11 = imageX - AndroidUtilities.dp(4.0f);
                        float dp12 = imageY - AndroidUtilities.dp(1.5f);
                        int dp13 = AndroidUtilities.dp(4.0f) + u1Var.f23324p2 + imageX;
                        if (z13) {
                            f58 = 2.0f;
                        }
                        rectF.set(dp11, dp12, AndroidUtilities.dp(f58) + dp13, AndroidUtilities.dp(1.5f) + u1Var.L2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, u1Var.M2(str));
                        canvas.save();
                        int i30 = z16;
                        if (z13) {
                            i30 = i29;
                        }
                        canvas.translate(imageX + i30, imageY);
                        vh.g.f(canvas, u1Var.L2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f23476z7 != null) {
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
        MessageObject messageObject = this.f23462y7;
        int i15 = messageObject.type;
        t1 t1Var = this.Zc;
        int i16 = 0;
        boolean z10 = true;
        if (i15 != 1 && i15 != 20 && this.K1 != 4 && i15 != 8 && i15 != 23) {
            float f12 = 43.0f;
            float f13 = 11.0f;
            float f14 = 0.0f;
            float f15 = 10.0f;
            if (this.f23226i2) {
                int i17 = this.f23418v8;
                if (!messageObject.isOutOwner()) {
                    f13 = 17.0f;
                }
                this.f23326p4 = AndroidUtilities.dp(f13) + i17 + this.f23313o4;
                int i18 = this.f23366s0 - this.f23355r4;
                if (this.I) {
                    f15 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f15)) - this.f23282m2) - AndroidUtilities.dp(17.0f);
                if (this.f23247j9 && this.f23405ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f12);
                this.f23340q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            } else {
                if (this.f23348qd) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f23462y7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f23326p4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f23418v8;
                    if (!messageObject.isOutOwner() && !this.f23261k8 && !this.J) {
                        f13 = 17.0f;
                    }
                    this.f23326p4 = AndroidUtilities.dp(f13) + i19 + this.f23313o4;
                }
                int i20 = this.f23366s0 - this.f23355r4;
                if (this.I) {
                    f11 = 9.0f;
                } else {
                    f11 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f11);
                if (this.f23247j9 && this.f23405ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f12);
                zg.o0 o0Var = this.N;
                if (!o0Var.f54682s && !o0Var.f54667b) {
                    if (this.f23462y7.type == 9 && this.L == null) {
                        f14 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f14) + o0Var.f54679p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f23340q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            }
        } else {
            if (t1Var.f22952f0) {
                f7 = t1Var.m0;
                f10 = t1Var.f22988n0;
                imageHeight = t1Var.f22996p0;
            } else {
                ai.m4 m4Var = this.S0;
                float imageX = m4Var.getImageX();
                float imageY = m4Var.getImageY();
                imageHeight = m4Var.getImageHeight();
                f7 = imageX;
                f10 = imageY;
            }
            this.f23326p4 = f7 + AndroidUtilities.dp(5.0f) + this.f23313o4;
            dp = f10 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f23146c4;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f23340q4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), y3()) + f10;
            z10 = false;
        }
        this.f23326p4 += getExtraTextX();
        MessageObject messageObject2 = this.f23462y7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f23462y7.isSponsored()) {
            if (z10 && this.N1) {
                this.f23340q4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f23186f2);
            }
            if (z10) {
                i12 = AndroidUtilities.dp(14.0f) + this.f23186f2;
            } else {
                i12 = 0;
            }
            float f16 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f23146c4;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(t1Var);
            }
            this.f23336q0 = (int) ((f16 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), y3())) - t1Var.f22971j0);
        }
        MessageObject messageObject3 = this.f23462y7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f23340q4 += this.f23190f6;
        }
    }

    public final void o0() {
        is isVar;
        boolean z10 = this.f23281m1;
        if (z10 || this.f23297n1) {
            if ((z10 && this.f23310o1 == 1.0f) || (!z10 && this.f23310o1 == 0.0f)) {
                this.f23297n1 = false;
            }
            if (z10) {
                isVar = is.f27444g;
            } else {
                isVar = is.f27445i;
            }
            this.f23337q1 = (int) Math.ceil(isVar.getInterpolation(this.f23310o1) * AndroidUtilities.dp(35.0f));
            if (this.f23462y7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f23337q1 = 0;
                }
            }
            if (!this.f23462y7.isOutOwner() || this.f23462y7.hasWideCode) {
                y4();
            }
            if (this.f23297n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f23323p1;
                this.f23323p1 = elapsedRealtime;
                if (this.f23281m1) {
                    float f7 = (((float) j3) / 200.0f) + this.f23310o1;
                    this.f23310o1 = f7;
                    if (f7 > 1.0f) {
                        this.f23310o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f23310o1 - (((float) j3) / 200.0f);
                    this.f23310o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f23310o1 = 0.0f;
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
            this.f23325p3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.f23145c3;
            if (charSequence == null) {
                int i11 = this.f23130b3;
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
                                    spannableString.setSpan(new er(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
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
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f23462y7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f23462y7.isSponsored() && this.J8 < (measureText = (int) (org.telegram.ui.ActionBar.i6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.J8 = measureText;
            }
            int dp = this.J8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.i6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.i6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            int i13 = this.f23130b3;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.f23325p3 = i12 - AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f23366s0;
            this.f23366s0 = dp2;
            if (this.f23462y7.type == 12) {
                this.f23366s0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f23462y7.isSponsored()) {
                this.f23366s0 = AndroidUtilities.dp(2.0f) + this.f23366s0;
            }
            StaticLayout staticLayout2 = this.O2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f23325p3 - Math.ceil(this.O2.getLineWidth(0)))) / 2;
                if (this.f23130b3 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f23299n3 = ceil + i10;
                int lineLeft = (int) this.O2.getLineLeft(0);
                this.f23312o3 = lineLeft;
                this.f23299n3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f23301n5 > 0.0f) {
            ai.m4 m4Var = this.S0;
            if (m4Var.getVisible()) {
                MessageObject messageObject2 = this.f23462y7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f23462y7.getVideoStartsTimestamp() / ((float) this.f23462y7.getDuration());
                } else {
                    videoSavedProgress = this.f23462y7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = m4Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(m4Var.getImageX(), m4Var.getImageY(), m4Var.getImageX2(), m4Var.getImageY2());
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
                        rectF.set(m4Var.getImageX(), m4Var.getImageY(), m4Var.getImageX2(), m4Var.getImageY2());
                        this.Hb.addRoundRect(rectF, this.Ib, Path.Direction.CW);
                        canvas.clipPath(this.Hb);
                    }
                    org.telegram.ui.ActionBar.i6.f20982n2.setColor(org.telegram.ui.ActionBar.i6.m1(this.f23301n5 * 0.35f, -1));
                    canvas.drawRect(m4Var.getImageX(), m4Var.getImageY2() - AndroidUtilities.dp(3.0f), m4Var.getImageX2(), m4Var.getImageY2(), org.telegram.ui.ActionBar.i6.f20982n2);
                    org.telegram.ui.ActionBar.i6.f20982n2.setColor(org.telegram.ui.ActionBar.i6.m1(this.f23301n5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(m4Var.getImageX() - AndroidUtilities.dp(2.0f), m4Var.getImageY2() - AndroidUtilities.dp(3.0f), (m4Var.getImageWidth() * clamp01) + m4Var.getImageX(), m4Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f20982n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f23348qd && this.rd) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f23462y7 != null) {
            int i10 = this.I7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f23462y7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f23462y7.getDialogId() == clientUserId || this.f23462y7.getDialogId() == 1271266957)) {
                this.Zb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f23462y7.getDialogId() == 489000) {
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
                    if (this.f23462y7.isSavedFromMegagroup()) {
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
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f23462y7.getDialogId() == clientUserId)) {
                this.Yb = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f23462y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Yb = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f23462y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Yb = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f23462y7.getDialogId();
                long fromChatId = this.f23462y7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f23462y7.getDialogId())) {
                    if (this.f23462y7.isOutOwner()) {
                        this.Yb = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f23462y7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Yb = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f23462y7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Yb = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f23462y7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Zb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Zb = chat;
                } else {
                    TLRPC.Message message = this.f23462y7.messageOwner;
                    if (message.post) {
                        this.Zb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && imageReceiver == this.S0 && messageObject.isAnimatedSticker()) {
            this.Jc.S1(this.f23462y7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        u1 u1Var;
        float f7;
        float f10;
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.f23197fe;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f23197fe = null;
        }
        this.f23197fe = NotificationCenter.getInstance(this.I7).createObserversGroup(this).add(NotificationCenter.userInfoDidLoad).addGlobal(NotificationCenter.startSpoilers).addGlobal(NotificationCenter.stopSpoilers).addGlobal(NotificationCenter.emojiLoaded).addGlobal(NotificationCenter.didUpdatePremiumGiftStickers);
        MessageObject messageObject = this.f23462y7;
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
        org.telegram.ui.Components.l9 l9Var = this.X3;
        if (l9Var != null) {
            l9Var.g();
        }
        qh.g gVar = this.f23133b6;
        if (gVar != null) {
            gVar.a();
        }
        qh.g gVar2 = this.f23148c6;
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
        MessageObject messageObject2 = this.f23476z7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            u1Var = this;
            u1Var.V3(messageObject2, this.A7, this.C7, this.B7, this.D7, this.E7);
            u1Var.f23476z7 = null;
            u1Var.A7 = null;
        } else {
            u1Var = this;
        }
        CheckBoxBase checkBoxBase = u1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f24096l = true;
        }
        CheckBoxBase checkBoxBase2 = u1Var.f23254k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f24096l = true;
        }
        h31 h31Var = u1Var.f23170e0;
        if (h31Var != null) {
            h31Var.a();
        }
        CheckBoxBase checkBoxBase3 = u1Var.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f24096l = true;
        }
        if (u1Var.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = u1Var.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f24096l = true;
                i11++;
            }
        }
        u1Var.M0 = true;
        float f11 = 0.0f;
        u1Var.Ae = 0.0f;
        u1Var.f23483ze = 0.0f;
        u1Var.f23337q1 = 0;
        y4();
        ImageReceiver imageReceiver = u1Var.f23289m9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        F0();
        MessageObject messageObject3 = u1Var.f23462y7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = u1Var.K1;
        if (i12 == 4 && u1Var.f23303n7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(u1Var.f23462y7);
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
            if ((i12 == 4 || i12 == 2) && u1Var.f23470z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            u1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().E2() != null) {
            p9 E2 = getDelegate().E2();
            E2.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == E2.f21889w) {
                E2.W = u1Var;
            }
        }
        if (u1Var.K1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(u1Var.f23462y7)) {
                f11 = 1.0f;
            }
            u1Var.f23307nd = f11;
        }
        zg.o0 o0Var = u1Var.N;
        ArrayList arrayList2 = o0Var.v;
        o0Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((zg.l0) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = u1Var.f23181ed;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        k4 k4Var = u1Var.F7;
        if (k4Var != null) {
            ArrayList arrayList3 = k4Var.f22373c;
            if (!k4Var.C) {
                k4Var.C = true;
                vh.f fVar = k4Var.f22380l;
                if (fVar != null) {
                    fVar.b(k4Var.f22371a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    j4 j4Var = (j4) arrayList3.get(i14);
                    if (!j4Var.M) {
                        j4Var.M = true;
                        j4Var.f22313f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = u1Var.f23462y7;
        if (messageObject4 != null && messageObject4.type == 20 && u1Var.Mb != null) {
            invalidate();
        }
        org.telegram.ui.Components.q5 q5Var = u1Var.f23195fc;
        if (q5Var != null) {
            q5Var.a();
        }
        org.telegram.ui.Components.q5 q5Var2 = u1Var.gc;
        if (q5Var2 != null) {
            q5Var2.a();
        }
        vh.f fVar2 = u1Var.Fb;
        if (fVar2 != null) {
            if (fVar2.f49719i) {
                vh.f w32 = w3();
                u1Var.Fb = w32;
                Integer num = u1Var.Gb;
                if (num != null) {
                    w32.f49721k.put(this, num);
                }
            } else {
                fVar2.a(this);
            }
        }
        o0 o0Var2 = u1Var.v;
        if (o0Var2 != null) {
            ArrayList arrayList4 = o0Var2.f22580q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((n0) arrayList4.get(i15)).a();
            }
        }
        ey0 ey0Var = u1Var.f23171e1;
        if (ey0Var != null) {
            for (int i16 = 0; i16 < ey0Var.f26203b; i16++) {
                ey0Var.f26204c[i16].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.ObserversGroup observersGroup = this.f23197fe;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f23197fe = null;
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
            checkBoxBase.f24096l = false;
        }
        qh.g gVar = this.f23133b6;
        if (gVar != null) {
            gVar.f46725b.onDetachedFromWindow();
            gVar.f46739x.f();
        }
        qh.g gVar2 = this.f23148c6;
        if (gVar2 != null) {
            gVar2.f46725b.onDetachedFromWindow();
            gVar2.f46739x.f();
        }
        yf.n nVar = this.f23445x4;
        if (nVar != null) {
            nVar.b();
            this.f23445x4 = null;
        }
        RichMessageLayout richMessageLayout = this.f23462y7.richLayout;
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
        org.telegram.ui.Components.l9 l9Var = this.X3;
        if (l9Var != null) {
            l9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f23254k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f24096l = false;
        }
        if (this.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f24096l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f24096l = false;
        }
        this.M0 = false;
        k4 k4Var = this.F7;
        if (k4Var != null) {
            k4Var.e();
        }
        this.f23289m9.onDetachedFromWindow();
        h31 h31Var = this.f23170e0;
        if (h31Var != null) {
            h31Var.b();
        }
        F0();
        if (this.G4 && this.E4 != null && this.F4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.E4);
            this.G4 = false;
        }
        ey0 ey0Var = this.f23171e1;
        if (ey0Var != null) {
            ey0Var.a(this);
        }
        DownloadController.getInstance(this.I7).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().E2() != null) {
            p9 E2 = getDelegate().E2();
            E2.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == E2.f21889w) {
                E2.W = null;
            }
        }
        t1Var.f23019v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
            org.telegram.ui.ActionBar.i6.y0().f28712i = null;
        }
        ValueAnimator valueAnimator = this.f23279ld;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f23279ld.cancel();
        }
        this.N.q();
        this.f23266kd = false;
        FlagSecureReason flagSecureReason = this.f23181ed;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.q5 q5Var = this.f23195fc;
        if (q5Var != null) {
            q5Var.b();
        }
        org.telegram.ui.Components.q5 q5Var2 = this.gc;
        if (q5Var2 != null) {
            q5Var2.b();
        }
        vh.f fVar = this.Fb;
        if (fVar != null) {
            fVar.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f22580q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                n0 n0Var = (n0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f22491c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].onDetachedFromWindow();
                        i13++;
                    }
                }
            }
        }
        yf.h.d().f(this.f23267ke);
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
                SparseArray sparseArray = this.f23334pd;
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
        MessageObject messageObject = this.f23462y7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.V4 == AndroidUtilities.displaySize.y)) {
            u1Var = this;
        } else {
            this.f23469z0 = true;
            MessageObject messageObject2 = this.f23462y7;
            this.f23462y7 = null;
            u1Var = this;
            u1Var.X3(messageObject2, this.K, this.F, this.E, this.G, false);
            u1Var.f23469z0 = false;
        }
        w4();
        int i13 = u1Var.V + u1Var.f23184f0 + u1Var.f23210h0 + u1Var.f23366s0 + u1Var.f23395u0 + u1Var.f23155d0;
        hh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(u1Var.f23462y7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f11471a.getHeight() - draftMessageMeasureController.f11471a.getPaddingTop()) - draftMessageMeasureController.f11471a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f11474e = z10;
            if (draftMessageMeasureController.f11472b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        u1Var.f23308ne = Math.max(0, i12 - i13);
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
        this.f23462y7.loadedFileSize = j3;
        p1(j3, j10);
        if (this.f23442x1) {
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
        this.f23462y7.loadedFileSize = j3;
        RadialProgress2 radialProgress2 = this.O0;
        radialProgress2.o(min, true);
        if (j3 == j10 && ((this.L != null || this.f23462y7.isPaid()) && SendMessagesHelper.getInstance(this.I7).isSendingMessage(this.f23462y7.getId()) && ((i10 = this.O4) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.Q0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j11 = this.f23457y1;
        if (j11 > 0 && Math.abs(j11 - j10) > 1048576) {
            this.f23457y1 = j10;
        }
        p1(j3, j10);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f23374s8) {
            MessageObject messageObject = this.f23462y7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f23462y7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f23462y7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f23462y7.caption);
            }
        }
    }

    @Override
    public final void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
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
        float f17;
        float f18;
        boolean z16;
        boolean z17;
        String str;
        Drawable L22;
        float o9;
        float f19;
        String str2;
        Drawable L23;
        if (f12 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f20 = (f12 * 0.5f) + 0.5f;
        float f21 = f7 * f12;
        zg.o0 o0Var = this.N;
        if (o0Var.f54667b) {
            f13 = o0Var.j(1.0f);
        } else {
            f13 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.i6.T2.getAlpha();
        float N2 = N2(f10);
        StaticLayout staticLayout = this.Vb;
        t1 t1Var = this.Zc;
        if (staticLayout == null && !t1Var.F) {
            f17 = 2.0f;
            z15 = z11;
            f14 = 10.0f;
            d = 1.0d;
        } else {
            boolean z18 = t1Var.f22962h1;
            f14 = 10.0f;
            if (z18) {
                f15 = this.f23362rb;
            } else {
                f15 = f11;
            }
            float f22 = f15 + f13;
            d = 1.0d;
            boolean z19 = t1Var.F;
            if (z19 && t1Var.H == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && t1Var.H != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z19 && t1Var.H != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f23348qd || !t1Var.l1) && z18 && !z12) {
                if (z13) {
                    f22 = t1Var.I;
                } else {
                    float f23 = t1Var.I;
                    float f24 = t1Var.K1;
                    f22 = (f22 * f24) + ((1.0f - f24) * f23);
                }
            }
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                if (transitionParams.backgroundChangeBounds) {
                    f22 += transitionParams.offsetRight;
                }
            }
            if (t1Var.f23023w0) {
                f22 += this.Ae;
            }
            if (f4()) {
                if (this.f23462y7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.i6.f20762b4;
                }
            } else if (!this.f23462y7.isOutOwner()) {
                if (z10) {
                    L2 = org.telegram.ui.ActionBar.i6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.i6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float o10 = a0.o(L2, f22, N2, org.telegram.ui.ActionBar.i6.T2.getTextSize());
            if (z12) {
                f16 = t1Var.K1 * f21;
            } else if (z13) {
                f16 = (1.0f - t1Var.K1) * f21;
            } else {
                f16 = f21;
            }
            L2.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f20, f20, org.telegram.messenger.q.a(AndroidUtilities.dp(3.0f) + o10, this.Wb, 2.0f, f22), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (t1Var.F) {
                if (z14) {
                    canvas.save();
                    f17 = 2.0f;
                    org.telegram.ui.ActionBar.i6.T2.setAlpha((int) ((1.0d - t1Var.K1) * alpha));
                    canvas.translate(f22 + o10 + AndroidUtilities.dp(3.0f), N2);
                    t1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = 2.0f;
                }
                org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = 2.0f;
            }
            canvas.save();
            canvas.translate(f22 + o10 + AndroidUtilities.dp(3.0f), N2);
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
                f13 += o10 + this.Wb + AndroidUtilities.dp(10.0f);
            }
            if (z15) {
                canvas.restore();
            }
            if (t1Var.F) {
                org.telegram.ui.ActionBar.i6.T2.setAlpha(alpha);
            }
            t1Var.J = f22;
        }
        if (this.Sb != null) {
            boolean z20 = t1Var.f22962h1;
            if (z20) {
                f19 = this.f23362rb;
            } else {
                f19 = f11;
            }
            float f25 = f19 + f13;
            if ((!this.f23348qd || !t1Var.l1) && z20) {
                float f26 = t1Var.K;
                float f27 = t1Var.K1;
                f25 = (f25 * f27) + ((1.0f - f27) * f26);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.K;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f25 += transitionParams2.offsetRight;
                }
            }
            if (t1Var.f23023w0) {
                f25 += this.Ae;
            }
            if (f4()) {
                if (this.f23462y7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.i6.f20742a4;
                }
            } else if (!this.f23462y7.isOutOwner()) {
                if (z10) {
                    L23 = org.telegram.ui.ActionBar.i6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.i6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float o11 = a0.o(L23, f25, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.i6.T2.getTextSize() - AndroidUtilities.dp(f17));
            if (z15) {
                canvas.save();
                canvas.scale(f20, f20, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Tb) / f17) + f25, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f21 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (t1Var.f22944d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.i6.T2.setAlpha((int) ((d - t1Var.K1) * alpha));
                canvas.translate(f25 + o11 + AndroidUtilities.dp(3.0f), N2);
                vh.g.f(canvas, t1Var.f22944d2);
                canvas.restore();
                org.telegram.ui.ActionBar.i6.T2.setAlpha((int) (alpha * t1Var.K1));
            }
            canvas.save();
            canvas.translate(f25 + o11 + AndroidUtilities.dp(3.0f), N2);
            vh.g.f(canvas, this.Sb);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f13 += this.Tb + o11 + AndroidUtilities.dp(f14);
            if (t1Var.f22944d2 != null) {
                org.telegram.ui.ActionBar.i6.T2.setAlpha(alpha);
            }
            t1Var.L = f25;
        }
        boolean z21 = this.Y7;
        if (!z21 && !t1Var.B) {
            return;
        }
        boolean z22 = t1Var.f22962h1;
        if (z22) {
            f18 = this.f23362rb;
        } else {
            f18 = f11;
        }
        float f28 = f18 + f13;
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
        if (!this.f23348qd && z22 && !z16) {
            if (z17) {
                f28 = t1Var.D;
            } else {
                float f29 = t1Var.D;
                float f30 = t1Var.K1;
                f28 = (f28 * f30) + ((1.0f - f30) * f29);
            }
        }
        MessageObject.GroupedMessages groupedMessages3 = this.K;
        if (groupedMessages3 != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
            if (transitionParams3.backgroundChangeBounds) {
                f28 += transitionParams3.offsetRight;
            }
        }
        if (t1Var.f23023w0) {
            f28 += this.Ae;
        }
        if (f4()) {
            if (this.f23462y7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.i6.Z3;
            }
        } else if (!this.f23462y7.isOutOwner()) {
            if (z10) {
                L22 = org.telegram.ui.ActionBar.i6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.i6.U3;
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
                L22.setAlpha((int) (f21 * 255.0f * t1Var.K1));
                o9 = a0.o(L22, f28, N2, org.telegram.ui.ActionBar.i6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - t1Var.K1) * f21 * 255.0f));
                o9 = a0.o(L22, f28, N2, org.telegram.ui.ActionBar.i6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f21 * 255.0f));
            o9 = a0.o(L22, f28, N2, org.telegram.ui.ActionBar.i6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
        }
        if (z15) {
            canvas.save();
            canvas.scale(f20, f20, (o9 / f17) + f28, L22.getBounds().centerY());
        }
        L22.draw(canvas);
        L22.setAlpha(255);
        if (z15) {
            canvas.restore();
        }
        t1Var.C = f28;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f23181ed == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new ja(this, 3));
                this.f23181ed = flagSecureReason;
                if (this.M0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f23181ed;
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
        if (l1Var != null && l1Var.A2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f23462y7.type == 16) {
                this.Jc.H0(this, this.S4, this.T4);
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
                if (this.f23462y7.type == 16) {
                    l1Var2.v0(this, 0.0f, 0.0f);
                } else {
                    l1Var2.H0(this, this.S4, this.T4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                l1 l1Var3 = this.Jc;
                if (l1Var3 != null) {
                    TLRPC.Chat chat = this.f23250jc;
                    if (chat != null) {
                        u1Var = this;
                        l1Var3.T(u1Var, chat, this.f23462y7.messageOwner.fwd_from.channel_post, this.f23199g1, this.f23211h1, false);
                    } else {
                        u1Var = this;
                        TLRPC.User user = u1Var.f23221hc;
                        if (user != null) {
                            l1Var3.A0(this, user, u1Var.f23199g1, u1Var.f23211h1);
                        } else if (u1Var.f23265kc != null) {
                            l1Var3.o(this);
                        }
                    }
                }
            } else {
                u1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    l1 l1Var4 = u1Var.Jc;
                    if (l1Var4 != null) {
                        l1Var4.N0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && u1Var.Jc != null && (arrayList = u1Var.f23462y7.textLayoutBlocks) != null) {
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
            if ((!u1Var.f23462y7.isVoice() || u1Var.f23462y7.isRoundVideo() || (u1Var.f23462y7.isMusic() && MediaController.getInstance().isPlayingMessage(u1Var.f23462y7))) && u1Var.I5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        u1Var = this;
        if (!u1Var.f23462y7.isVoice()) {
        }
        return true;
    }

    public final void q0(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Id;
        if (e6Var != null) {
            e6Var.m(f7, f10 + this.V + this.f23184f0 + this.f23210h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10 + this.V + this.f23184f0 + this.f23210h0, i10, i11);
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
            p1(this.f23462y7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f7, Runnable runnable) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.O0;
            RectF rectF = radialProgress2.f24264a;
            Paint paint = radialProgress2.f24269g;
            va0 va0Var = radialProgress2.f24270i;
            RectF rectF2 = radialProgress2.f24264a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                f5Var = this.f23403u8;
            } else {
                f5Var = this.f23389t8;
            }
            va0Var.B = f5Var;
            radialProgress2.f24271j.B = f5Var;
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
                if (this.f23114a1 == null) {
                    dk0 dk0Var = new dk0(R.raw.fire_once, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.f23114a1 = dk0Var;
                    dk0Var.R(this);
                    this.f23114a1.J(true);
                    this.f23114a1.K(1);
                    this.f23114a1.start();
                }
                this.f23114a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f23128b1 == null) {
                    i10 = 1;
                    this.f23128b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f23143c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f23143c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f23156d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f23156d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f24282u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.i6.w0(i12, this.Id);
                } else {
                    i11 = radialProgress2.f24275n;
                }
                this.f23128b1.setColor(i11);
                this.f23156d1.setColor(i11);
                va0Var.a(false);
                this.f23128b1.setShader(va0Var.d.getShader());
                this.f23156d1.setShader(va0Var.d.getShader());
                rectF3.set(this.f23114a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f13 = f10;
                rectF3.inset(f13, f13);
                canvas2.drawRect(rectF3, this.f23128b1);
                this.f23114a1.q(canvas, this.f23143c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f23156d1.setAlpha((int) (255.0f * f11));
                this.f23156d1.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.f23147c5;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                op0 op0Var = this.H5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - op0Var.K) * (-360.0f), false, this.f23156d1);
                if (this.S6 == null) {
                    this.S6 = new d31();
                }
                this.S6.a((1.0f - op0Var.K) * (-360.0f), f11, canvas, this.f23156d1, rectF4);
                canvas2 = canvas;
            } else {
                dk0 dk0Var2 = this.f23114a1;
                if (dk0Var2 != null) {
                    dk0Var2.C(true);
                    this.f23114a1 = null;
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
                z10 = false;
                lVar.e(-1, 0, 0);
                ci.l lVar2 = this.Y0;
                lVar2.f5359i = 14.0f;
                lVar2.c(10.0f);
                this.Y0.f5353a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z11 = true;
                this.Y0.d(1, false, false);
                this.Y0.f5360j = -AndroidUtilities.dpf2(0.33f);
                this.Y0.f5361k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            ci.l lVar3 = this.Y0;
            lVar3.f5359i = f7 * 14.0f;
            lVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f7, paint);
            ci.l lVar4 = this.Y0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            lVar4.b(z11);
            ci.l lVar5 = this.Y0;
            lVar5.f5364n = cos;
            lVar5.f5365o = sin;
            lVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.G8 && (messageObject = this.f23462y7) != null && !messageObject.isOutOwner() && this.L == null) {
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
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null) {
            h1 h1Var = this.Hd;
            if (h1Var != null && h1Var.rewindCount != 0 && h1Var.rewindByBackSeek) {
                messageObject.audioProgress = h1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f23462y7.isPoll()) {
                qh.g gVar = this.f23133b6;
                if (gVar != null) {
                    gVar.n(true);
                }
                qh.g gVar2 = this.f23148c6;
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
                if (this.f23399u4 == null || (!PhotoViewer.K1(this.f23462y7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f23462y7))) {
                    org.telegram.ui.Components.f6 animation = this.S0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f23462y7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f23462y7.isVideo() && animation.s()) {
                            this.Jc.N(this.f23462y7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f23462y7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
                        d11 -= this.f23462y7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Jc != null && animation.o() >= 3000) {
                            this.Jc.F0();
                        }
                    }
                    if (this.Q5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.C2.measureText(formatShortDuration2));
                        this.f23399u4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.i6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.Q5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f23348qd;
            op0 op0Var = this.H5;
            int i12 = 0;
            if (z12) {
                if (this.F5) {
                    if (!op0Var.f29550f) {
                        op0Var.g(this.f23462y7.audioProgress, true);
                    }
                } else {
                    if (!f1Var.f27103e) {
                        f1Var.i(this.f23462y7.audioProgress);
                        f1Var.f27114q = this.f23462y7.bufferedProgress;
                    }
                    f1Var.a();
                }
                TLRPC.Document document = this.f23462y7.getDocument();
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
                } else if (MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
                    d10 = Math.max(0.0d, d10 - this.f23462y7.audioProgressSec);
                }
                if (this.Q5 != d10) {
                    this.Q5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.T2.measureText(formatLongDuration));
                    this.P5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.i6.T2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.f23462y7.audioProgress;
                if (f7 != 0.0f) {
                    this.Cd = f7;
                    if (f7 > 0.9f) {
                        this.Cd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.F5) {
                    if (!op0Var.f29550f) {
                        op0Var.g(this.f23462y7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!f1Var.f27103e) {
                        f1Var.i(this.f23462y7.audioProgress);
                        f1Var.f27114q = this.f23462y7.bufferedProgress;
                    }
                    f1Var.k(this.f23462y7);
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
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
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
                        d = this.f23462y7.audioProgressSec;
                    }
                    if (this.Q5 != d) {
                        this.Q5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.N2.measureText(formatLongDuration2));
                        this.P5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.i6.N2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f23462y7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
                        i12 = this.f23462y7.audioProgressSec;
                    }
                    double d13 = i12;
                    if (this.Q5 != d13) {
                        this.Q5 = d13;
                        this.P5 = new StaticLayout(AndroidUtilities.formatShortDuration(i12, (int) duration), org.telegram.ui.ActionBar.i6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        if (this.f23462y7.isSponsored()) {
            this.J8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        zg.o0 o0Var = this.N;
        if (!o0Var.f54682s && !o0Var.f54667b) {
            lastLineWidth = o0Var.f54684u;
        } else {
            lastLineWidth = this.f23462y7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!o0Var.f54682s && !o0Var.f54667b) {
            if (i10 - lastLineWidth < i11 || this.f23462y7.hasRtl) {
                z10 = true;
            }
            if (this.f23255k2) {
                this.f23366s0 = AndroidUtilities.dp(14.0f) + this.f23366s0;
            }
        } else if ((!this.f23382t1 && ((this.f23212h2 && !this.f23462y7.isSponsored()) || this.N1 || this.f23226i2 || this.f23241j2 || this.f23255k2)) || i10 - lastLineWidth < i11 || this.f23462y7.hasRtl) {
            z10 = true;
        }
        if (this.f23462y7.isUnsupported()) {
            z10 = true;
        }
        if ((o0Var.f54682s || o0Var.f54667b) && (richMessageLayout = this.f23462y7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f23462y7;
        if ((messageObject.hasCodeAtBottom && (o0Var.f54682s || o0Var.f54667b)) || ((messageObject.hasQuoteAtBottom && (o0Var.f54682s || o0Var.f54667b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z10 = true;
        } else {
            i13 = 14;
        }
        if (z10) {
            this.f23366s0 = AndroidUtilities.dp(i13) + this.f23366s0;
            this.K8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.J8 = dp;
            if (this.f23462y7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.f23332pb;
            } else {
                i14 = this.f23332pb;
            }
            this.J8 = org.telegram.messenger.q.y(31.0f, i14, dp);
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
                    checkBoxBaseArr2[i11].f24096l = false;
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
            this.N8 = new org.telegram.ui.Components.o9(this.I7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(n1 n1Var, z90 z90Var, Layout layout, int i10) {
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
                    n1Var.f22503b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (n1Var.f22503b != i10) {
            return false;
        }
        z90Var.rewind();
        int spanStart = spanned.getSpanStart(this.D5);
        int spanEnd = spanned.getSpanEnd(this.D5);
        z90Var.f28086c = true;
        z90Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, z90Var);
        z90Var.a();
        this.B5.l();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f23469z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        if (this.f23462y7.type == 20 && this.Mb != null) {
            ai.m4 m4Var = this.S0;
            this.Kb = com.google.android.gms.internal.vision.e2.z(m4Var.getImageWidth(), this.Mb.getWidth(), 2.0f, this.f23418v8);
            this.Lb = com.google.android.gms.internal.vision.e2.z(m4Var.getImageHeight(), this.Mb.getHeight(), 2.0f, m4Var.getImageY() + this.f23449x8);
        }
    }

    public final void s1(int i10) {
        int i11;
        int w02;
        ym0 ym0Var;
        ym0 ym0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f23462y7.isUnsupported()) {
            if (this.f23462y7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.i6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.i6.Kc;
            }
            w02 = org.telegram.ui.ActionBar.i6.w0(i14, this.Id);
        } else if (i10 == 0 && this.f23260k7) {
            if (this.f23462y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.i6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.i6.xc;
            }
            w02 = org.telegram.ui.ActionBar.i6.w0(i12, this.Id);
        } else if (i10 == 0 && (ym0Var2 = this.f23122aa) != null) {
            w02 = ym0Var2.h();
        } else if (i10 == 0 && (ym0Var = this.f23152ca) != null) {
            w02 = ym0Var.h();
        } else {
            if (this.f23462y7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.i6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.Kc;
            }
            w02 = org.telegram.ui.ActionBar.i6.w0(i11, this.Id);
        }
        Drawable[] drawableArr = this.f23413v3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            i1 i1Var = new i1(i10, this);
            o1[] o1VarArr = this.f23428w3;
            o1VarArr[i10] = i1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f23462y7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.i6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.i6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.i6.w0(i13, this.Id)}), null, o1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.i6.C1(drawable, w02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(n1 n1Var, z90 z90Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(n1Var, z90Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
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
        if ((!this.f23191f8 && !this.f23177e8 && !isPressed()) || (this.M1 && this.S0.hasBitmapImage())) {
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
        this.f23374s8 = z10;
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
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f23440x && !this.f23462y7.isVoice()) || this.C9 == null || this.D9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.L;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.N.f54667b) {
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
            if (this.f23317o8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f23289m9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Yb;
                int i10 = this.I7;
                org.telegram.ui.Components.j9 j9Var = this.f23305n9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.f23124ac = userProfilePhoto.photo_small;
                    } else {
                        this.f23124ac = null;
                    }
                    j9Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Yb, j9Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Zb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.f23124ac = chatPhoto.photo_small;
                    } else {
                        this.f23124ac = null;
                    }
                    if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId >= 0) {
                            TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            j9Var.m(i10, user2);
                            imageReceiver.setForUserOrChat(user2, j9Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        j9Var.k(i10, chat2);
                        imageReceiver.setForUserOrChat(chat2, j9Var);
                        return;
                    }
                    j9Var.k(i10, this.Zb);
                    imageReceiver.setForUserOrChat(this.Zb, j9Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", j9Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.f23124ac = null;
                    j9Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, j9Var, null, null, 0);
                    return;
                }
            }
            this.f23124ac = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(l1 l1Var) {
        this.Jc = l1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f23240j1 != z10) {
            this.f23240j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f23440x = z10;
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
        if (this.f23191f8 != z10) {
            this.f23191f8 = z10;
            if (z10) {
                this.f23174e4 = null;
            }
            if (!z10) {
                this.f23246j8 = System.currentTimeMillis();
                this.f23206g8 = true;
                this.f23218h8 = 300;
            } else {
                this.f23206g8 = false;
                this.f23218h8 = 0;
            }
            s4();
            if (this.F5) {
                this.H5.f29558o = f3();
            } else {
                this.G5.f27113p = f3();
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
        this.f23294me = runnable;
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
        this.f23280le = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        s4();
        if (this.F5) {
            this.H5.f29558o = f3();
        } else {
            this.G5.f27113p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.Id = e6Var;
        RadialProgress2 radialProgress2 = this.O0;
        if (radialProgress2 != null) {
            radialProgress2.F = e6Var;
        }
        RadialProgress2 radialProgress22 = this.P0;
        if (radialProgress22 != null) {
            radialProgress22.F = e6Var;
        }
        cn0 cn0Var = this.S3;
        if (cn0Var != null) {
            cn0Var.f25338n = e6Var;
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
        if (this.f23380se != z10) {
            this.f23380se = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f7) {
        if (this.f23483ze != f7) {
            this.f23483ze = f7;
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
            ((vh.g) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f23146c4;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.f23146c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f23146c4.textLayoutBlocks.get(i11);
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
        this.f23285m5 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final int t0() {
        if (this.f23396u1) {
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
        this.f23251jd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23279ld = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f23279ld.setInterpolator(is.f27443f);
        this.f23237id = i10;
        this.f23222hd = i11;
        this.f23279ld.addUpdateListener(new ai.cb(2, this, z10));
        this.f23279ld.addListener(new ai.n(21, this, z10));
        this.f23266kd = true;
        this.f23279ld.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f23476z7;
        if (messageObject == null) {
            messageObject = this.f23462y7;
        }
        MessageObject messageObject2 = messageObject;
        this.f23462y7 = null;
        X3(messageObject2, this.K, this.F, this.E, this.G, false);
    }

    public final int t3(int r26) {
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
            this.Ra = new bd(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Ra.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Ra.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ra.f24928i) {
                this.Jc.k2(this);
            }
            this.Ra.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Ra.c(false);
        }
        return this.Ra.f24928i;
    }

    public final void u1() {
        MessageObject messageObject;
        l1 l1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f23462y7.hasMediaSpoilers() && !this.f23462y7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f23462y7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Jc != null && messageObject2.isSensitive()) {
                    this.Jc.B(this);
                    return;
                } else {
                    i4(this.f23199g1, this.f23211h1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f23462y7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f23462y7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Jc.X0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f23462y7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j3 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j3 != 0) {
                    user = MessagesController.getInstance(this.I7).getUser(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Jc.A0(this, user, this.f23199g1, this.f23211h1);
            } else if (i12 == 5) {
                if (this.O4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f23462y7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f23462y7);
                } else {
                    this.Jc.W1(this, this.f23462y7);
                }
            } else if (i12 == 8) {
                int i13 = this.O4;
                if (i13 != -1 && (i13 != 1 || !this.A1 || !this.f23303n7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
            } else if (this.K1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f23462y7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.O4 == -1) {
                            this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        l1 l1Var2 = this.Jc;
                        if (l1Var2 != null) {
                            l1Var2.C0(this, this.f23199g1, this.f23211h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.O4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Jc.V1(this.f23462y7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                of.f.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f23255k2) {
                        if (this.O4 == -1) {
                            this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (l1Var = this.Jc) != null) {
                        if (i14 == 16) {
                            l1Var.v0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            l1Var.H0(this, this.S4, this.T4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
            } else if (this.O4 != -1 && (!this.f23442x1 || (!this.f23303n7 && (((messageObject = this.f23462y7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.A1))))) {
                if (this.f23442x1) {
                    v1(true);
                    return;
                }
                int i16 = this.O4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
            }
        } else {
            int i17 = this.O4;
            if (i17 == -1) {
                this.Jc.C0(this, this.f23199g1, this.f23211h1, false);
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
        boolean isOutOwner = this.f23462y7.isOutOwner();
        int i11 = 0;
        t1 t1Var = this.Zc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f23418v8 + t1Var.f22957g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f23296n0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f23418v8 + t1Var.f22957g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f23462y7.type == 19) {
                dp = 0;
            } else {
                if (!this.f23261k8 && this.J) {
                    f7 = 11.0f;
                } else {
                    f7 = 17.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            this.f23296n0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f11 = 4.0f;
        if (this.f23241j2) {
            this.f23296n0 = AndroidUtilities.dp(11.0f) + this.f23296n0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f23351r0 = dp3;
            StaticLayout staticLayout = this.B2;
            if (staticLayout != null) {
                this.f23351r0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f23255k2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f23351r0 = dp4;
            StaticLayout staticLayout2 = this.B2;
            if (staticLayout2 != null) {
                this.f23351r0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f23462y7.type == 19) {
            this.f23351r0 = AndroidUtilities.dp(6.0f) + this.Lc;
            if (!this.f23462y7.isOut()) {
                this.f23296n0 = getCurrentBackgroundLeft();
            } else {
                this.f23296n0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Lc;
            this.f23351r0 = dp5;
            MessageObject messageObject = this.f23462y7;
            float f12 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f23351r0;
                    if (this.Lc <= 0) {
                        f12 = -3.0f;
                    }
                    this.f23351r0 = AndroidUtilities.dp(f12) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f23351r0 = AndroidUtilities.dp(f12) + dp5;
                }
                if (this.f23462y7.hasCodeAtTop && this.Lc > 0) {
                    this.f23351r0 = AndroidUtilities.dp(5.0f) + this.f23351r0;
                }
            }
        }
        if (this.f23462y7.isSponsored()) {
            this.f23322p0 = AndroidUtilities.dp(14.0f) + this.f23351r0;
        } else if (this.f23382t1) {
            this.f23322p0 = AndroidUtilities.dp(10.0f) + this.f23351r0;
            this.f23351r0 = org.telegram.messenger.q.C(13.0f, this.f23282m2, this.f23351r0);
            if (this.R2 && !this.f23255k2 && !this.f23462y7.isGiveawayOrGiveawayResults()) {
                this.f23351r0 = AndroidUtilities.dp(44.0f) + this.f23351r0;
            }
        } else {
            this.f23322p0 = AndroidUtilities.dp(10.0f) + this.f23462y7.textHeight(t1Var) + this.f23351r0;
        }
        if (this.f23382t1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f23462y7.textHeight(t1Var) + this.f23351r0;
        } else {
            int i13 = this.f23322p0 + this.f23282m2;
            if (this.R2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f10) + i13;
            if (this.f23282m2 <= 0) {
                f11 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f11) + dp6;
        }
        this.f23336q0 = dp2;
        this.f23309o0 = this.f23296n0;
        if (this.f23462y7.textXOffset != 0.0f && this.C9 != null) {
            int dp7 = this.J8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f23462y7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.K8) {
                int i15 = this.f23332pb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = bi.z(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f23296n0 = (i14 - getExtraTimeX()) + this.f23296n0;
            }
        }
    }

    public final void u4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i10;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.C2.measureText((String) secretTimeString));
                this.A4 = ceil;
                this.f23399u4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.i6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.i6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.i6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f23399u4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f23399u4.getLineWidth(0);
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
        if (this.Jc != null && this.f23462y7.isSensitive() && this.f23462y7.hasMediaSpoilers() && !this.f23462y7.needDrawBluredPreview() && !this.f23462y7.isMediaSpoilersRevealed) {
            this.Jc.B(this);
            return;
        }
        MessageObject messageObject4 = this.f23462y7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f23462y7.putInDownloadsStore = true;
        }
        int i12 = this.O4;
        RadialProgress2 radialProgress22 = this.P0;
        int i13 = this.I7;
        ai.m4 m4Var = this.S0;
        RadialProgress2 radialProgress23 = this.O0;
        if (i12 == 0 && (!this.f23442x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f23462y7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f23462y7.mediaExists)) {
                if (z10) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f23175e5 != null && (m4Var.hasNotThumb() || this.f23189f5 == null)) {
                    photoSize = this.f23175e5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f23215h5;
                    } else {
                        str = this.f23229i5;
                    }
                } else {
                    photoSize = this.f23189f5;
                    str = this.f23229i5;
                }
                String str2 = str;
                if (this.f23462y7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f23462y7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    m4Var.setForceLoading(true);
                    m4Var.setImage(ImageLocation.getForObject(this.f23175e5, this.f23160d5), this.f23215h5, ImageLocation.getForObject(this.f23189f5, this.f23160d5), this.f23229i5, this.f23203g5, this.f23175e5.size, null, this.f23462y7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                    if (this.f23462y7.loadedFileSize > 0) {
                        q1(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f23348qd) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f23462y7.getDocument();
                        MessageObject messageObject6 = this.f23462y7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f23462y7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        m4Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        m4Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f23462y7, 0);
                    }
                    this.cd = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                        if (this.f23462y7.loadedFileSize > 0) {
                            q1(this.L1);
                        }
                    } else {
                        int i17 = this.K1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 1, i10);
                            MessageObject messageObject8 = this.f23462y7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                m4Var.setForceLoading(true);
                                m4Var.setImage(ImageLocation.getForDocument(this.L1), null, ImageLocation.getForDocument(this.f23175e5, this.L1), this.f23229i5, this.L1.size, null, this.f23462y7, i10);
                                MessageObject messageObject9 = this.f23462y7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                            } else if (i17 == 8) {
                                m4Var.setImage(ImageLocation.getForDocument(this.L1), this.f23215h5, ImageLocation.getForDocument(this.f23175e5, this.L1), "b1", 0L, "jpg", this.f23462y7, 1);
                            }
                        } else {
                            m4Var.setForceLoading(true);
                            m4Var.setImage(ImageLocation.getForObject(this.f23175e5, this.f23160d5), this.f23215h5, ImageLocation.getForObject(this.f23189f5, this.f23160d5), this.f23229i5, this.f23203g5, 0L, null, this.f23462y7, 0);
                        }
                    }
                }
                this.f23462y7.loadingCancelled = false;
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
                FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                this.f23462y7.loadingCancelled = false;
            }
            if (this.Jc.W1(this, this.f23462y7)) {
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
        } else if (i12 == 1 && (!this.f23442x1 || z10)) {
            m4Var.setForceLoading(false);
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f23462y7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f23462y7.isOut() && !this.f23442x1 && (this.f23462y7.isSending() || this.f23462y7.isEditing())) {
                    if (radialProgress23.f24270i.f31776q != 6) {
                        this.Jc.L(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f23462y7;
                messageObject10.loadingCancelled = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f23462y7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(m4Var);
                        m4Var.cancelLoadImage();
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
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f23462y7)) {
                this.O4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f23462y7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Jc.C0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.X4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                    this.f23462y7.loadingCancelled = false;
                }
                if (this.Jc.W1(this, this.f23462y7)) {
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
                if (this.f23348qd) {
                    this.cd = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f23348qd) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            m4Var.setAllowStartAnimation(true);
                            m4Var.startAnimation();
                        }
                    } else {
                        m4Var.setAllowStartAnimation(true);
                        m4Var.startAnimation();
                    }
                    this.f23462y7.gifState = 0.0f;
                    this.O4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.L1, this.f23462y7, 2, 0);
                this.f23462y7.loadingCancelled = false;
                this.O4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f23462y7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f23462y7.isOut() && (this.f23462y7.isSending() || this.f23462y7.isEditing())) || this.f23462y7.isSendError()) {
                        l1 l1Var = this.Jc;
                        if (l1Var != null && radialProgress23.f24270i.f31776q != 6) {
                            l1Var.L(this);
                            return;
                        }
                        return;
                    }
                    this.f23462y7.loadingCancelled = true;
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
                l1Var2.C0(this, f7, f7, false);
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
        if (this.f23212h2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        t1 t1Var = this.Zc;
        boolean z10 = t1Var.f23023w0;
        f1 f1Var = this.G5;
        op0 op0Var = this.H5;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.J8;
            float f11 = i21;
            int i22 = (int) ((f11 - t1Var.f22975k0) + t1Var.f22980l0);
            int i23 = (int) ((f11 - t1Var.f22957g0) + t1Var.f22961h0);
            if (this.f23348qd && !this.f23343q8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (t1Var.f22975k0 == 0.0f && t1Var.f22980l0 == 0.0f) {
                i22 = i23;
            }
            if (op0Var != null) {
                if (t1Var.f22989n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f23212h2) {
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
                    op0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f23212h2) {
                        f10 = 0.0f;
                    }
                    op0Var.h(dp4 - AndroidUtilities.dp(f10), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (f1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.K1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f23212h2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                f1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (op0Var != null) {
            if (t1Var.f22989n1) {
                int dp5 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f23212h2) {
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
                if (!this.f23212h2) {
                    f10 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f10);
                int i29 = this.J8 + i20;
                if (this.L5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                op0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f23212h2) {
                    f10 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f10);
                op0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (f1Var != null) {
            int useTranscribeButtonProgress2 = this.J8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.K1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f23212h2) {
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
            Drawable[] drawableArr = this.f23413v3;
            if (drawable == drawableArr[0] || drawable == this.f23414v4 || drawable == drawableArr[1] || drawable == this.Hc || drawable == this.K3 || drawable == this.f23481zc || ((this.N != null && (drawable instanceof org.telegram.ui.Components.q6)) || (drawable instanceof ja0))) {
                return true;
            }
            sh.a aVar = this.f23118a6;
            if (aVar == null || (drawable != aVar && drawable != aVar.f48220a)) {
                ArrayList arrayList = this.Y5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s1 s1Var = (s1) obj;
                    if (s1Var.f22766w != drawable && ((bVar = s1Var.f22767x) == null || (drawable != bVar && drawable != bVar.f48209a && drawable != bVar.f48210b))) {
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
        ArrayList arrayList = this.f23316o7;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f23462y7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f23418v8;
                    if (this.f23261k8) {
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
                    float f12 = (e0Var.f22004c * f11) + dp;
                    if (f10 >= f12 && f10 <= (e0Var.f22005e * f11) + f12 && z22 >= dp2 && z22 <= e0Var.f22006f + dp2) {
                        this.f23417v7 = i12;
                        a3();
                        if (e0Var.f22018s == null) {
                            z Z = org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.nc, this.Id), 6, 6);
                            e0Var.f22018s = Z;
                            Z.setCallback(this);
                            z zVar = e0Var.f22018s;
                            int i13 = ((int) (e0Var.f22004c * f11)) + dp;
                            zVar.setBounds(i13, dp2, ((int) (e0Var.f22005e * f11)) + i13, e0Var.f22006f + dp2);
                        }
                        e0Var.f22018s.setHotspot(f10, z22);
                        e0Var.f22018s.setState(this.A3);
                        e0Var.b(!e0Var.f22012m);
                        postDelayed(new ai.p8(this, this.f23417v7, 17), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f23417v7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f23417v7);
                    z zVar2 = e0Var2.f22018s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f23462y7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        l1 l1Var = this.Jc;
                        if (l1Var != null && !e0Var2.f22012m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f22009j;
                            if (buttonCustom != null) {
                                l1Var.E(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f22008i;
                                if (keyboardInlineButton != null) {
                                    l1Var.s1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f23417v7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f23417v7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i10);
                z zVar3 = e0Var3.f22018s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f23417v7 = -1;
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
            MessageObject messageObject = this.f23462y7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f23462y7.putInDownloadsStore = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.L1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.L1;
                    MessageObject messageObject2 = this.f23462y7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f23462y7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.L1;
                MessageObject messageObject3 = this.f23462y7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f23462y7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f23462y7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.X4 = 0;
            this.f23462y7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public vh.f w3() {
        return vh.f.e(this);
    }

    public final void w4() {
        char c10;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().E2() != null && getDelegate().E2().z(this.f23462y7)) {
            p9 E2 = getDelegate().E2();
            if (E2.f22666q0) {
                c10 = 2;
            } else if (E2.f22668s0) {
                c10 = 3;
            } else if (E2.f22670u0) {
                c10 = 4;
            } else if (P2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.f23241j2) {
                    i12 = this.f23309o0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f23255k2) {
                        i11 = this.f23309o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f23309o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().E2().b0(AndroidUtilities.dp(10.0f) + i12 + this.f23353r2, this.f23311o2);
            } else if (c10 == 1) {
                n4();
                getDelegate().E2().b0((int) this.f23326p4, (int) this.f23340q4);
            } else if (c10 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.K;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f23326p4;
                } else {
                    float f7 = 12.0f;
                    if (this.f23462y7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23418v8;
                        if (this.f23462y7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f23261k8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f23418v8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f23418v8;
                            if (!this.J) {
                                f7 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f7) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Zc.f22957g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.f23336q0;
                n4();
                getDelegate().E2().b0((AndroidUtilities.dp(10.0f) + dp3) - this.f23129b2, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().E2().b0(this.f23296n0, this.f23351r0);
            }
        }
    }

    public final boolean x0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.x0(android.view.MotionEvent):boolean");
    }

    public final void x1() {
        MessageObject messageObject = this.f23462y7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            l1 l1Var = this.Jc;
            if (l1Var != null) {
                l1Var.K1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f23146c4;
        int i12 = 0;
        t1 t1Var = this.Zc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (vh.g gVar : textLayoutBlock2.spoilers) {
                    gVar.i((i10 - textLayoutBlock2.textYOffset(this.f23146c4.textLayoutBlocks, t1Var)) - this.f23326p4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.f23146c4.textLayoutBlocks, t1Var)) - this.f23340q4);
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
                ((vh.g) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (vh.g gVar2 : textLayoutBlock4.spoilers) {
                    gVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, t1Var)) - this.f23351r0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, t1Var)) - this.f23351r0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f23247j9) {
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
                            if (u1Var.f23247j9 && u1Var.K == this.K) {
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
            Drawable[] drawableArr = this.f23413v3;
            if (action == 0) {
                if (this.f23262k9.contains(x10, z22)) {
                    if (this.f23462y7.isSent()) {
                        this.f23444x3[1] = 2;
                        this.f23275l9 = true;
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
                if (this.f23275l9) {
                    l1 l1Var = this.Jc;
                    if (l1Var != null) {
                        if (this.f23150c8) {
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
                    this.f23275l9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f23275l9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, z22);
            }
        }
        return false;
    }

    public final void y1(Canvas canvas, float f7) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f10;
        float f11;
        if (this.f23146c4 == null) {
            return;
        }
        float f12 = this.f23340q4;
        float f13 = this.f23326p4;
        t1 t1Var = this.Zc;
        if (t1Var.f23023w0) {
            if (t1Var.C0) {
                f12 -= getTranslationY();
                f11 = t1Var.f22957g0;
            } else if (t1Var.f23008s0) {
                float f14 = t1Var.K1;
                float f15 = 1.0f - f14;
                f13 = (f13 * f14) + (t1Var.f23000q0 * f15);
                f12 = (f12 * f14) + (f15 * t1Var.f23004r0);
            } else if (!this.f23462y7.isVoice() || !TextUtils.isEmpty(this.f23462y7.caption)) {
                f11 = t1Var.f22957g0;
            }
            f13 += f11;
        }
        float f16 = f13;
        float f17 = f12;
        float f18 = 0.0f;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (t1Var.f22930a1) {
            float f19 = t1Var.K1;
            if (f19 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var.f22934b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.x5 x5Var = t1Var.O0;
                float f20 = (1.0f - f19) * f7;
                if (textLayoutBlocks != null) {
                    f10 = textLayoutBlocks.textXOffset;
                } else {
                    f10 = 0.0f;
                }
                z1(f16, f17, canvas, arrayList, x5Var, false, f20, f10, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f23146c4;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.x5 x5Var2 = this.f23333pc;
                float f21 = f7 * t1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f18 = textLayoutBlocks2.textXOffset;
                }
                z1(f16, f17, canvas, arrayList3, x5Var2, true, f21, f18, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f23146c4;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.x5 x5Var3 = this.f23333pc;
        if (textLayoutBlocks3 != null) {
            f18 = textLayoutBlocks3.textXOffset;
        }
        z1(f16, f17, canvas, arrayList4, x5Var3, true, f7, f18, true);
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
            if (this.f23462y7.isOutOwner()) {
                if (!this.f23261k8 && !this.J && !z11) {
                    this.f23389t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOut");
                } else {
                    this.f23389t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f23261k8 && !this.J && !z11) {
                this.f23389t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgIn");
            } else {
                this.f23389t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgInMedia");
            }
        }
        this.f23389t8.f();
        return this.f23389t8;
    }

    public final float y3() {
        float f7;
        t1 t1Var = this.Zc;
        float f10 = 1.0f;
        if (t1Var.F1) {
            boolean z10 = this.f23396u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return AndroidUtilities.lerp(f7, f10, t1Var.K1);
        } else if (this.f23396u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i10;
        MessageObject messageObject = this.f23462y7;
        if (messageObject == null) {
            return;
        }
        float f7 = this.f23483ze + this.Ae;
        if (!messageObject.isOutOwner() || this.f23462y7.hasWideCode) {
            f7 += this.f23337q1;
        }
        if (this.F8 && !this.f23462y7.isOutOwner() && this.L != null) {
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
        if (this.f23462y7.type == 12) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f23413v3;
            if (action == 0) {
                ArrayList arrayList = this.X2;
                int[] iArr = this.A3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.X2.size(); i10++) {
                        m1 m1Var = (m1) this.X2.get(i10);
                        float f7 = x10;
                        float f10 = z22;
                        if (m1Var.f22449e.contains(f7, f10)) {
                            if (m1Var.f22450f == null) {
                                m1Var.f22450f = new bd(this);
                            }
                            m1Var.f22450f.c(true);
                            z zVar = m1Var.f22451g;
                            if (zVar != null) {
                                zVar.setHotspot(f7, f10);
                                m1Var.f22451g.setState(iArr);
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
                    this.f23421vc.c(true);
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
                            this.Jc.V0(((m1) this.X2.get(0)).f22446a, this);
                        } else {
                            this.Jc.V0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.Z2 = false;
                    this.f23421vc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.X2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.X2.size(); i11++) {
                        m1 m1Var2 = (m1) this.X2.get(i11);
                        bd bdVar = m1Var2.f22450f;
                        if (bdVar != null && bdVar.f24928i) {
                            l1 l1Var = this.Jc;
                            if (l1Var != null) {
                                l1Var.V0(m1Var2.f22446a, this);
                            }
                            z zVar2 = m1Var2.f22451g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            m1Var2.f22450f.c(false);
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
                        bd bdVar2 = m1Var3.f22450f;
                        if (bdVar2 != null && bdVar2.f24928i) {
                            z zVar3 = m1Var3.f22451g;
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

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.x5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.x5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f23184f0) - this.f23210h0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.N7 || this.Q7 || ((this.f23329p8 && !this.T7) || (messageObject = this.f23462y7) == null || messageObject.isOutOwner() || !this.f23462y7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f23462y7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f23462y7;
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

    public u1(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.f23424w = new zh0(0);
        is isVar = is.h;
        this.f23455y = new me.b(0, this, isVar, 380L, false);
        this.N = new zg.o0(this);
        this.O = new wg.a(this);
        this.P = new wg.c(this);
        this.B0 = new Rect();
        this.F0 = -1;
        this.G0 = -1;
        this.R0 = new int[4];
        this.W2 = 0;
        this.f23227i3 = 45;
        this.f23413v3 = new Drawable[2];
        this.f23428w3 = new o1[2];
        this.f23444x3 = new int[2];
        this.y3 = new RectF();
        this.A3 = new int[]{16842910, 16842919};
        this.Z3 = -1;
        this.f23116a4 = -1;
        this.f23132b5 = new RectF();
        this.f23147c5 = new RectF();
        this.f23258k5 = -1;
        this.f23285m5 = 1.0f;
        this.f23301n5 = 1.0f;
        this.f23415v5 = -1;
        this.f23430w5 = new ca0(this);
        this.f23474z5 = new ArrayList();
        this.A5 = new ArrayList();
        this.E5 = new Path();
        this.X5 = new ArrayList();
        this.Y5 = new ArrayList();
        this.f23230i6 = -1;
        this.f23244j6 = -1;
        this.f23272l6 = true;
        this.N6 = -1;
        this.f23316o7 = new ArrayList();
        new Path();
        this.f23328p7 = new HashMap();
        this.f23342q7 = new HashMap();
        this.K7 = -1;
        this.f23274l8 = true;
        this.f23343q8 = true;
        this.J8 = 100;
        this.f23262k9 = new Rect();
        this.E9 = new AtomicReference();
        this.Qa = new RectF();
        this.f23194fb = new StaticLayout[2];
        this.f23277lb = new float[2];
        this.f23406ub = true;
        this.f23466yb = new Path();
        this.f23480zb = new float[8];
        this.Jb = 1.0f;
        this.Qb = new Path();
        this.Rb = new float[8];
        this.Bc = new RectF();
        this.Cc = new RectF();
        this.Xc = Build.VERSION.SDK_INT == 28;
        this.Yc = 1.0f;
        this.Zc = new t1(this);
        this.f23168dd = new org.telegram.ui.Components.g6(this, 200L, is.f27444g);
        this.f23209gd = new e1(0, this);
        this.f23321od = new e1(1, this);
        this.f23334pd = new SparseArray();
        this.Dd = -1;
        this.Fd = new m.c3();
        this.Ld = new ArrayList();
        this.Md = new Stack();
        this.Nd = new Path();
        this.Qd = new b1(2, this);
        this.Rd = new b1(3, this);
        this.Ud = false;
        this.Xd = -1L;
        this.f23252je = false;
        this.f23267ke = new b1(10, this);
        this.f23380se = true;
        this.f23439we = 1.0f;
        this.Be = new d1(Float.class, "animationOffsetX", 0);
        this.I7 = i10;
        this.Id = e6Var;
        this.Jd = z10;
        this.Kd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Kd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f30744a = new Paint(1);
        drawable.f30745b = null;
        drawable.h = -1.0f;
        drawable.f30750i = -1.0f;
        drawable.f30751j = -1.0f;
        drawable.f30752k = -1.0f;
        drawable.f30754m = this;
        this.Kc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f23289m9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f23305n9 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.F9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f23360r9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.H7 = DownloadController.getInstance(i10).generateObserverTag();
        this.V0 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        ai.m4 m4Var = new ai.m4(this, this, 2);
        this.S0 = m4Var;
        m4Var.setAllowLoadingOnAttachedOnly(true);
        m4Var.setUseRoundForThumbDrawable(true);
        m4Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.T0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.O0 = new RadialProgress2(this, e6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.P0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        f1 f1Var = new f1(this, this);
        this.G5 = f1Var;
        f1Var.h = this;
        ?? obj = new Object();
        obj.f29546a = 0;
        obj.f29547b = 0;
        obj.f29549e = false;
        obj.f29550f = false;
        obj.f29562s = 1.0f;
        obj.f29563t = 1.0f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(125L, 600L, isVar);
        obj.v = g6Var;
        obj.f29565w = 1.0f;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(150L, is.f27443f);
        obj.B = g6Var2;
        obj.J = false;
        if (op0.N == null) {
            op0.N = new Paint(1);
            op0.O = new Paint(1);
            Paint paint = op0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            op0.O.setStyle(style);
        }
        this.H5 = obj;
        obj.f29554k = this;
        obj.f29557n = this;
        g6Var2.f26614a = this;
        g6Var.f26614a = this;
        this.I5 = new g1(this);
        ?? drawable2 = new Drawable();
        drawable2.f25327a = 0L;
        drawable2.f25328b = false;
        drawable2.f25329c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f25330e = 0.0f;
        drawable2.f25331f = 0.32f;
        drawable2.f25332g = 1;
        drawable2.h = 1;
        drawable2.f25333i = 1;
        drawable2.f25337m = 255;
        drawable2.f25338n = e6Var;
        drawable2.f25334j = this;
        this.S3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f5 f5Var = this.f23389t8;
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
                f5Var.o((int) (i10 + f7), i12, i11, (int) f7, this.Uc, this.Vc, this.E, (this.F && this.Zc.f23035z0 == 1.0f) ? false : true);
                f5Var.f20621u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.L0;
        f5Var.o((int) (i10 + f72), i12, i11, (int) f72, this.Uc, this.Vc, this.E, (this.F && this.Zc.f23035z0 == 1.0f) ? false : true);
        f5Var.f20621u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        l1 l1Var;
        if (this.f23462y7 == null) {
            return;
        }
        Runnable runnable = this.f23280le;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f23294me;
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
    public final void A(float f7, int i10) {
    }
}
