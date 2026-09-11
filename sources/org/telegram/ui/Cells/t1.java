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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l20;
import org.telegram.ui.ov0;
import org.telegram.ui.um;
import org.telegram.ui.wj0;
public class t1 extends a0 implements ao0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, y9, NotificationCenter.NotificationCenterDelegate, le.d, n4 {
    public static final float[] Ee = new float[8];
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
    public wh.h Ab;
    public Path Ac;
    public float Ad;
    public final c1 Ae;
    public final Rect B0;
    public int B1;
    public StaticLayout B2;
    public float B3;
    public f01 B4;
    public h90 B5;
    public boolean B6;
    public boolean B7;
    public e51 B8;
    public CheckBoxBase B9;
    public boolean Ba;
    public float Bb;
    public final RectF Bc;
    public float Bd;
    public ColorFilter[] Be;
    public int C0;
    public float C1;
    public StaticLayout C2;
    public SpannableStringBuilder C3;
    public f01 C4;
    public ArrayList C5;
    public boolean C6;
    public boolean C7;
    public e51 C8;
    public StaticLayout C9;
    public Path Ca;
    public float Cb;
    public final RectF Cc;
    public float Cd;
    public int[] Ce;
    public int D0;
    public boolean D1;
    public float D2;
    public boolean D3;
    public f01 D4;
    public CharacterStyle D5;
    public boolean D6;
    public boolean D7;
    public int D8;
    public StaticLayout D9;
    public Path Da;
    public float Db;
    public int Dc;
    public int Dd;
    public TL_stars.StarGift De;
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
    public boolean F;
    public int F0;
    public float F1;
    public float F2;
    public long F3;
    public WebFile F4;
    public boolean F5;
    public long F6;
    public j4 F7;
    public boolean F8;
    public final ImageReceiver F9;
    public float[] Fa;
    public wh.g Fb;
    public float Fc;
    public final m.c3 Fd;
    public boolean G;
    public int G0;
    public int G1;
    public float G2;
    public boolean G3;
    public boolean G4;
    public final e1 G5;
    public float G6;
    public AnimatorSet G7;
    public boolean G8;
    public int G9;
    public float Ga;
    public Integer Gb;
    public zc Gc;
    public w61 Gd;
    public boolean H;
    public boolean H0;
    public int H1;
    public boolean H2;
    public Path H3;
    public boolean H4;
    public final io0 H5;
    public float H6;
    public final int H7;
    public float H8;
    public int H9;
    public float Ha;
    public Path Hb;
    public z Hc;
    public g1 Hd;
    public boolean I;
    public boolean I0;
    public long I1;
    public zc I2;
    public Paint I3;
    public boolean I4;
    public final f1 I5;
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
    public k1 Jc;
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
    public final qa0 Kc;
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
    public i1 M5;
    public boolean M6;
    public byte[] M7;
    public int M8;
    public int M9;
    public boolean Ma;
    public StaticLayout Mb;
    public int Mc;
    public final Stack Md;
    public final ah.k1 N;
    public boolean N0;
    public boolean N1;
    public StaticLayout N2;
    public int N3;
    public int N4;
    public float N5;
    public int N6;
    public boolean N7;
    public org.telegram.ui.Components.n9 N8;
    public int N9;
    public boolean Na;
    public int Nb;
    public int Nc;
    public final Path Nd;
    public final xg.a O;
    public final RadialProgress2 O0;
    public f01 O1;
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
    public final xg.c P;
    public final RadialProgress2 P0;
    public f01 P1;
    public float P2;
    public int P3;
    public int P4;
    public StaticLayout P5;
    public float P6;
    public boolean P7;
    public Paint P8;
    public boolean P9;
    public StaticLayout Pa;
    public wh.h Pb;
    public int Pc;
    public BotForumHelper.BotDraftAnimationsPool Pd;
    public boolean Q;
    public boolean Q0;
    public zc Q1;
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
    public zc R1;
    public boolean R2;
    public boolean R3;
    public int R4;
    public int R5;
    public int R6;
    public boolean R7;
    public CheckBoxBase[] R8;
    public boolean R9;
    public zc Ra;
    public final float[] Rb;
    public boolean Rc;
    public final b1 Rd;
    public f01 S;
    public final bi.y3 S0;
    public StaticLayout S1;
    public boolean S2;
    public final wl0 S3;
    public int S4;
    public int S5;
    public w11 S6;
    public boolean S7;
    public x40 S8;
    public boolean S9;
    public RectF Sa;
    public StaticLayout Sb;
    public float Sc;
    public boolean Sd;
    public x80 T;
    public final ImageReceiver T0;
    public StaticLayout T1;
    public boolean T2;
    public StaticLayout T3;
    public int T4;
    public StaticLayout T5;
    public org.telegram.ui.Components.e6 T6;
    public boolean T7;
    public h90 T8;
    public org.telegram.ui.Components.e6 T9;
    public ug.a Ta;
    public int Tb;
    public int Tc;
    public boolean Td;
    public CornerPathEffect U;
    public ColorMatrixColorFilter U0;
    public a90 U1;
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
    public final org.telegram.ui.Components.i9 V0;
    public e90 V1;
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
    public dq W0;
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
    public org.telegram.ui.Components.k9 X3;
    public int X4;
    public final ArrayList X5;
    public boolean X6;
    public boolean X7;
    public org.telegram.ui.Components.i9[] X8;
    public int X9;
    public float Xa;
    public String Xb;
    public final boolean Xc;
    public long Xd;
    public di.l Y0;
    public int Y1;
    public RectF Y2;
    public f01 Y3;
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
    public th.d Z5;
    public int Z6;
    public boolean Z7;
    public StaticLayout Z8;
    public sl0 Z9;
    public boolean Za;
    public TLRPC.Chat Zb;
    public final s1 Zc;
    public int Zd;
    public f01 f22856a0;
    public xi0 f22857a1;
    public l20 a2;
    public boolean f22858a3;
    public int f22859a4;
    public boolean f22860a5;
    public th.a f22861a6;
    public float f22862a7;
    public boolean f22863a8;
    public org.telegram.ui.Components.h6 f22864a9;
    public sl0 f22865aa;
    public boolean f22866ab;
    public TLRPC.FileLocation f22867ac;
    public boolean f22868ad;
    public int f22869ae;
    public x80 f22870b0;
    public Paint f22871b1;
    public int f22872b2;
    public int f22873b3;
    public int f22874b4;
    public final RectF f22875b5;
    public rh.g f22876b6;
    public float f22877b7;
    public long f22878b8;
    public boolean f22879b9;
    public sl0 f22880ba;
    public float f22881bb;
    public String f22882bc;
    public boolean bd;
    public int f22883be;
    public CornerPathEffect f22884c0;
    public Paint f22885c1;
    public int f22886c2;
    public CharSequence f22887c3;
    public MessageObject.TextLayoutBlocks f22888c4;
    public final RectF f22889c5;
    public rh.g f22890c6;
    public int f22891c7;
    public boolean f22892c8;
    public int f22893c9;
    public sl0 f22894ca;
    public float cb;
    public Object f22895cc;
    public boolean f22896cd;
    public float f22897ce;
    public int f22898d0;
    public Paint f22899d1;
    public int f22900d2;
    public int f22901d3;
    public MessageObject.TextLayoutBlocks f22902d4;
    public TLObject f22903d5;
    public int f22904d6;
    public int f22905d7;
    public boolean f22906d8;
    public int f22907d9;
    public sl0 f22908da;
    public StaticLayout f22909db;
    public long f22910dc;
    public final org.telegram.ui.Components.e6 f22911dd;
    public float f22912de;
    public a21 f22913e0;
    public ax0 f22914e1;
    public int f22915e2;
    public float f22916e3;
    public ni0 f22917e4;
    public TLRPC.PhotoSize f22918e5;
    public int f22919e6;
    public boolean e7;
    public boolean f22920e8;
    public boolean f22921e9;
    public sl0 f22922ea;
    public int f22923eb;
    public String ec;
    public FlagSecureReason f22924ed;
    public org.telegram.ui.Components.l8 f22925ee;
    public boolean f22926f;
    public int f22927f0;
    public boolean f22928f1;
    public int f22929f2;
    public int f22930f3;
    public CharSequence f22931f4;
    public TLRPC.PhotoSize f22932f5;
    public int f22933f6;
    public String f7;
    public boolean f22934f8;
    public int f22935f9;
    public int f22936fa;
    public final StaticLayout[] f22937fb;
    public org.telegram.ui.Components.o5 f22938fc;
    public boolean f22939fd;
    public boolean fe;
    public oy0 f22940g0;
    public float f22941g1;
    public int f22942g2;
    public int f22943g3;
    public StaticLayout f22944g4;
    public BitmapDrawable f22945g5;
    public float f22946g6;
    public TLRPC.Message f22947g7;
    public boolean f22948g8;
    public int f22949g9;
    public Drawable ga;
    public int f22950gb;
    public org.telegram.ui.Components.o5 gc;
    public final d1 f22951gd;
    public boolean f22952ge;
    public boolean h;
    public int f22953h0;
    public float f22954h1;
    public boolean f22955h2;
    public int f22956h3;
    public MessageObject.TextLayoutBlocks f22957h4;
    public String f22958h5;
    public float f22959h6;
    public boolean f22960h7;
    public int f22961h8;
    public int f22962h9;
    public boolean ha;
    public boolean f22963hb;
    public TLRPC.User f22964hc;
    public int f22965hd;
    public wj0 f22966he;
    public long f22967i0;
    public boolean f22968i1;
    public boolean f22969i2;
    public int f22970i3;
    public CharSequence f22971i4;
    public String f22972i5;
    public int f22973i6;
    public int f22974i7;
    public float f22975i8;
    public int f22976i9;
    public zh.h8 f22977ia;
    public float f22978ib;
    public TLRPC.User f22979ic;
    public int f22980id;
    public boolean f22981ie;
    public int f22982j0;
    public boolean f22983j1;
    public boolean f22984j2;
    public LinearGradient j3;
    public int f22985j4;
    public Drawable f22986j5;
    public int f22987j6;
    public int f22988j7;
    public long f22989j8;
    public boolean f22990j9;
    public int f22991ja;
    public int f22992jb;
    public TLRPC.Chat f22993jc;
    public float f22994jd;
    public final b1 f22995je;
    public zc f22996k0;
    public CheckBoxBase f22997k1;
    public boolean f22998k2;
    public dc0 f22999k3;
    public int f23000k4;
    public int f23001k5;
    public float f23002k6;
    public boolean f23003k7;
    public boolean f23004k8;
    public final Rect f23005k9;
    public z f23006ka;
    public int f23007kb;
    public String f23008kc;
    public boolean f23009kd;
    public Runnable f23010ke;
    public org.telegram.ui.Components.o5 f23011l0;
    public CheckBoxBase l1;
    public boolean f23012l2;
    public int f23013l3;
    public int l4;
    public boolean f23014l5;
    public boolean f23015l6;
    public boolean f23016l7;
    public boolean f23017l8;
    public boolean f23018l9;
    public f01 f23019la;
    public final float[] f23020lb;
    public String f23021lc;
    public ValueAnimator f23022ld;
    public Runnable f23023le;
    public boolean m0;
    public boolean f23024m1;
    public int f23025m2;
    public int f23026m3;
    public Drawable f23027m4;
    public float f23028m5;
    public boolean f23029m6;
    public float f23030m7;
    public boolean f23031m8;
    public final ImageReceiver f23032m9;
    public f01 f23033ma;
    public float f23034mb;
    public boolean f23035mc;
    public int f23036md;
    public int f23037me;
    public int f23038n;
    public int f23039n0;
    public boolean f23040n1;
    public int f23041n2;
    public int f23042n3;
    public int f23043n4;
    public float f23044n5;
    public boolean f23045n6;
    public boolean f23046n7;
    public boolean f23047n8;
    public final org.telegram.ui.Components.i9 f23048n9;
    public int f23049na;
    public float nb;
    public boolean nc;
    public float f23050nd;
    public int ne;
    public int f23051o0;
    public float f23052o1;
    public int f23053o2;
    public int f23054o3;
    public int f23055o4;
    public long f23056o5;
    public boolean f23057o6;
    public final ArrayList f23058o7;
    public boolean f23059o8;
    public boolean o9;
    public int f23060oa;
    public StaticLayout f23061ob;
    public boolean f23062oc;
    public final d1 f23063od;
    public boolean f23064oe;
    public int f23065p0;
    public long f23066p1;
    public int f23067p2;
    public int f23068p3;
    public float f23069p4;
    public long p5;
    public boolean f23070p6;
    public final HashMap f23071p7;
    public boolean f23072p8;
    public boolean f23073p9;
    public org.telegram.ui.Components.e6 f23074pa;
    public int f23075pb;
    public org.telegram.ui.Components.v5 f23076pc;
    public final SparseArray f23077pd;
    public float f23078pe;
    public int f23079q0;
    public int f23080q1;
    public int f23081q2;
    public boolean f23082q3;
    public float f23083q4;
    public boolean f23084q5;
    public boolean q6;
    public final HashMap f23085q7;
    public boolean f23086q8;
    public boolean f23087q9;
    public x80 f23088qa;
    public int f23089qb;
    public org.telegram.ui.Components.v5 f23090qc;
    public boolean f23091qd;
    public Paint f23092qe;
    public l3 f23093r;
    public int f23094r0;
    public org.telegram.ui.g5 f23095r1;
    public int f23096r2;
    public boolean f23097r3;
    public int f23098r4;
    public boolean f23099r5;
    public boolean f23100r6;
    public String f23101r7;
    public int f23102r8;
    public final ImageReceiver f23103r9;
    public h90 f23104ra;
    public int f23105rb;
    public org.telegram.ui.Components.v5 f23106rc;
    public boolean f23107rd;
    public boolean f23108re;
    public boolean f23109s;
    public int f23110s0;
    public i10 f23111s1;
    public int f23112s2;
    public boolean f23113s3;
    public int f23114s4;
    public org.telegram.ui.Components.z5 f23115s5;
    public boolean f23116s6;
    public int f23117s7;
    public boolean f23118s8;
    public int f23119s9;
    public ArrayList f23120sa;
    public int f23121sb;
    public org.telegram.ui.Components.v5 f23122sc;
    public float f23123sd;
    public py0 f23124se;
    public int f23125t0;
    public boolean f23126t1;
    public int f23127t2;
    public zc f23128t3;
    public int f23129t4;
    public e90 f23130t5;
    public boolean f23131t6;
    public boolean f23132t7;
    public org.telegram.ui.ActionBar.f5 f23133t8;
    public Drawable[] f23134t9;
    public boolean ta;
    public CharSequence f23135tb;
    public org.telegram.ui.Components.v5 f23136tc;
    public float f23137td;
    public Paint f23138te;
    public int f23139u0;
    public boolean f23140u1;
    public int f23141u2;
    public int f23142u3;
    public StaticLayout f23143u4;
    public MessageObject.TextLayoutBlock f23144u5;
    public boolean f23145u6;
    public boolean f23146u7;
    public org.telegram.ui.ActionBar.f5 f23147u8;
    public int[] f23148u9;
    public int f23149ua;
    public boolean f23150ub;
    public zc f23151uc;
    public float f23152ud;
    public Paint f23153ue;
    public o0 v;
    public int f23154v0;
    public boolean f23155v1;
    public int f23156v2;
    public final Drawable[] f23157v3;
    public org.telegram.ui.Components.p6 f23158v4;
    public int f23159v5;
    public long f23160v6;
    public int f23161v7;
    public int f23162v8;
    public Drawable v9;
    public boolean f23163va;
    public boolean f23164vb;
    public zc f23165vc;
    public float f23166vd;
    public float f23167ve;
    public final k2.g0 f23168w;
    public int f23169w0;
    public boolean f23170w1;
    public int f23171w2;
    public final n1[] f23172w3;
    public org.telegram.ui.Components.p6 f23173w4;
    public final a90 f23174w5;
    public String f23175w6;
    public wh.h f23176w7;
    public int f23177w8;
    public Drawable f23178w9;
    public int f23179wa;
    public Paint f23180wb;
    public zc wc;
    public long f23181wd;
    public int f23182we;
    public boolean f23183x;
    public int f23184x0;
    public boolean f23185x1;
    public int f23186x2;
    public final int[] f23187x3;
    public yf.n f23188x4;
    public int f23189x5;
    public int f23190x6;
    public boolean f23191x7;
    public int f23192x8;
    public int f23193x9;
    public boolean f23194xa;
    public Path f23195xb;
    public float xc;
    public float f23196xd;
    public MessageObject.TextLayoutBlocks f23197xe;
    public final le.b f23198y;
    public boolean f23199y0;
    public long f23200y1;
    public float f23201y2;
    public final RectF y3;
    public StaticLayout f23202y4;
    public boolean f23203y5;
    public boolean f23204y6;
    public MessageObject f23205y7;
    public int f23206y8;
    public boolean f23207y9;
    public boolean f23208ya;
    public final Path f23209yb;
    public float f23210yc;
    public float f23211yd;
    public float f23212ye;
    public boolean f23213z0;
    public boolean f23214z1;
    public float f23215z2;
    public h90 f23216z3;
    public long f23217z4;
    public final ArrayList f23218z5;
    public boolean f23219z6;
    public MessageObject f23220z7;
    public int f23221z8;
    public boolean f23222z9;
    public boolean f23223za;
    public final float[] f23224zb;
    public z f23225zc;
    public int f23226zd;
    public float f23227ze;

    public t1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static void A3(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new org.telegram.ui.f6(1));
            int size = arrayList.size();
            for (int i11 = 0; i11 < size && i10 > 0; i11++) {
                r1 r1Var = (r1) arrayList.get(i11);
                int i12 = r1Var.d;
                if (i12 > 0) {
                    r1Var.d = i12 + 1;
                    i10--;
                }
            }
        }
    }

    public static android.graphics.PointF C2(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.C2(int, int, int, int):android.graphics.PointF");
    }

    public static int[] J2(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        n01 n01Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof j51) && (n01Var = ((j51) characterStyle).f27356a) != null && (messageEntity = n01Var.d) != null) {
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

    public static boolean T(t1 t1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            k1 k1Var = t1Var.Jc;
            if (k1Var == null || k1Var.R()) {
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
        ug.a[] aVarArr = (ug.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ug.a.class);
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
        if (this.Zb != null && (messageObject = this.f23205y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f23205y7.messageOwner.from_id);
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
            MessageObject messageObject = this.f23205y7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f23205y7.messageOwner.from_id);
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
        MessageObject messageObject2 = this.f23205y7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f23205y7.sponsoredTitle;
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
        } else if (this.Zb != null && (messageObject = this.f23205y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f23205y7.messageOwner.from_id);
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

    private ih.a getDraftMessageMeasureController() {
        k1 k1Var = this.Jc;
        if (k1Var != null) {
            return k1Var.Y();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i10;
        if (!this.f23205y7.isOutOwner() && ((!this.f23004k8 || this.f22888c4 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f23205y7.isOutOwner() && this.f23107rd && this.f23059o8 && this.f23205y7.type == 5) {
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
        MessageObject messageObject = this.f23205y7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.getIconForCurrentState():int");
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
        if (this.f22866ab) {
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
        s1 s1Var = this.Zc;
        if (s1Var.P2) {
            boolean z10 = this.f22866ab;
            f7 = AndroidUtilities.lerp(!z10, z10, s1Var.K1);
        } else if (this.f22866ab) {
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
        TLRPC.MessageReplies messageReplies2 = this.f23205y7.messageOwner.replies;
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
        return this.f23205y7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.j6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20939sa;
        }
        return f6Var.G0(i10);
    }

    private float getUseTranscribeButtonProgress() {
        s1 s1Var = this.Zc;
        if (s1Var.f22768n1) {
            if (this.L5) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.L5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static l1 n1(int i10, String str, int i11, float f7) {
        l1 l1Var = new l1();
        l1Var.f22233a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.j6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        l1Var.d = staticLayout;
        l1Var.f22234b = f7;
        if (staticLayout.getLineCount() > 0) {
            l1Var.f22235c = ((float) (l1Var.f22234b - Math.ceil(l1Var.d.getLineWidth(0)))) / 2.0f;
            l1Var.f22235c -= (int) l1Var.d.getLineLeft(0);
        }
        return l1Var;
    }

    public static boolean r3(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    private void setInstantButtonPressed(boolean z10) {
        if (this.f23128t3 == null) {
            this.f23128t3 = new zc(this);
        }
        zc zcVar = this.f23128t3;
        this.f23113s3 = z10;
        zcVar.c(z10);
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
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
        return iw0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i18, i13, true);
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
        if (this.f23205y7.isImportedForward()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                float f10 = this.f23034mb;
                if (f7 >= f10 && f7 <= f10 + this.f23075pb) {
                    float f11 = z22;
                    float f12 = this.nb;
                    if (f11 >= f12 && f11 <= f12 + AndroidUtilities.dp(20.0f)) {
                        this.f23014l5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f23014l5) {
                this.f23014l5 = false;
                playSoundEffect(0);
                this.Jc.e1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void A1(Canvas canvas, float f7) {
        wj0 wj0Var;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f10 = this.f23094r0;
            s1 s1Var = this.Zc;
            if (s1Var.f22760l2) {
                float f11 = s1Var.f22769n2;
                float f12 = s1Var.K1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (s1Var.K1 != 1.0f && s1Var.G0 && ((wj0Var = this.f22966he) == null || !wj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f23133t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f23039n0, f13, canvas, s1Var.H0, s1Var.O0, false, (1.0f - s1Var.K1) * f7, this.f23205y7.textXOffset, false);
                MessageObject messageObject2 = this.f23205y7;
                z1(this.f23039n0, f13, canvas, messageObject2.textLayoutBlocks, this.f23076pc, true, f7 * s1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f23205y7;
                z1(this.f23039n0, f13, canvas, messageObject3.textLayoutBlocks, this.f23076pc, true, f7, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f7);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f22960h7) {
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
        k1 k1Var;
        MessageObject messageObject = this.f23205y7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f22967i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f7);
        float f11 = this.f23075pb;
        if (this.f23205y7.sendPreview) {
            f10 = 1.0f - this.f23028m5;
        }
        int dp2 = ((int) ((f11 * f10) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f23075pb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f22996k0 == null) {
                    this.f22996k0 = new zc(this);
                }
                this.Ud = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Ud = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Ud && (k1Var = this.Jc) != null) {
                k1Var.F(this);
            }
            this.Ud = false;
        } else if (motionEvent.getAction() == 3) {
            this.Ud = false;
        }
        zc zcVar = this.f22996k0;
        if (zcVar != null) {
            zcVar.c(this.Ud);
        }
        return this.Ud;
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f7;
        ni0 ni0Var;
        float f10;
        if (!this.f22983j1 && this.f22948g8) {
            int i10 = this.f22961h8;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (ni0Var = this.f22917e4) != null) {
            return (1.0f - ni0Var.f28765k.d(1.0f, false)) * f7;
        }
        return f7;
    }

    public final x80 B3() {
        x80 x80Var;
        ArrayList arrayList = this.f23218z5;
        if (!arrayList.isEmpty()) {
            x80Var = (x80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            x80Var = new x80(0);
        }
        x80Var.reset();
        this.A5.add(x80Var);
        return x80Var;
    }

    public final boolean C0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Jd && (messageObject = this.f23205y7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Da, this.Id) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f23205y7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f23205y7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f22888c4 != null) {
            for (int i11 = 0; i11 < this.f22888c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.f22888c4.textLayoutBlocks.get(i11);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final boolean D0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.D0(android.view.MotionEvent):boolean");
    }

    public final boolean D1(android.graphics.Canvas r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.D1(android.graphics.Canvas, boolean, boolean):boolean");
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
        zc zcVar = this.f23165vc;
        if (zcVar != null) {
            zcVar.c(false);
        }
        Drawable drawable = this.f23157v3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.X2 != null) {
            for (int i10 = 0; i10 < this.X2.size(); i10++) {
                l1 l1Var = (l1) this.X2.get(i10);
                zc zcVar2 = l1Var.f22237f;
                if (zcVar2 != null) {
                    zcVar2.c(false);
                }
                z zVar = l1Var.f22238g;
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
    }

    public final boolean E0(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        a90 a90Var = this.f23174w5;
        if (this.f22984j2) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.M1 && this.f23170w1 && this.O4 != -1 && x10 >= (i11 = this.K4) && x10 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.L4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.O0.f24076i.f30573q != 4) {
                    this.P4 = 1;
                    invalidate();
                    return true;
                }
                if (this.M1) {
                    if (this.S0.isInsideImage(x10, z22)) {
                        this.f23203y5 = true;
                        return true;
                    }
                }
                if (this.K2 != null && z22 >= this.f23053o2) {
                    try {
                        int dp = x10 - ((this.f23051o0 + AndroidUtilities.dp(10.0f)) + this.f23096r2);
                        int i13 = z22 - this.f23053o2;
                        int lineForVertical = this.K2.getLineForVertical(i13);
                        float f7 = dp;
                        int offsetForHorizontal = this.K2.getOffsetForHorizontal(lineForVertical, f7);
                        float lineLeft = this.K2.getLineLeft(lineForVertical);
                        if (lineLeft <= f7 && lineLeft + this.K2.getLineWidth(lineForVertical) >= f7) {
                            Spannable spannable = (Spannable) this.f23205y7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof i51) || i51.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                e90 e90Var = this.f23130t5;
                                if (e90Var == null || e90Var.f25623i != clickableSpanArr[0]) {
                                    a90Var.k(e90Var, true);
                                    e90 e90Var2 = new e90(clickableSpanArr[0], this.Id, f7, i13, 0);
                                    this.f23130t5 = e90Var2;
                                    if (this.f23205y7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.j6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.j6.Ld;
                                    }
                                    e90Var2.d(org.telegram.ui.ActionBar.j6.v0(i10, this.Id));
                                    this.f23154v0 = -10;
                                    this.f23189x5 = 2;
                                    try {
                                        x80 b10 = this.f23130t5.b();
                                        int[] J2 = J2(spannable, this.f23130t5.f25623i);
                                        b10.d(this.K2, J2[0], 0.0f);
                                        this.K2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    a90Var.a(this.f23130t5, 2);
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
                if (this.f23189x5 != 2 && !this.f23203y5 && this.P4 == 0) {
                    F3(2);
                    return false;
                } else if (this.P4 != 0) {
                    this.P4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    e90 e90Var3 = this.f23130t5;
                    if (e90Var3 != null) {
                        CharacterStyle characterStyle = e90Var3.f25623i;
                        if (characterStyle instanceof URLSpan) {
                            of.f.s(getContext(), ((URLSpan) this.f23130t5.f25623i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f23203y5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f23058o7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i14);
                        if (zf.c.c(e0Var.f21817i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Jc.g1(this, e0Var.f21817i);
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
        if (!this.f23205y7.isMediaSpoilersRevealed && this.Bb != 1.0f) {
            bi.y3 y3Var = this.S0;
            int[] roundRadius = y3Var.getRoundRadius();
            float f7 = roundRadius[0];
            float[] fArr = this.f23224zb;
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
            Path path = this.f23209yb;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y3Var.getImageX(), y3Var.getImageY(), y3Var.getImageX2(), y3Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.Bb != 0.0f) {
                path.rewind();
                path.addCircle(this.Cb, this.Db, this.Eb * this.Bb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f23205y7.needDrawBluredPreview()) {
                y3Var.draw(canvas);
            } else {
                float imageX = y3Var.getImageX();
                float imageY = y3Var.getImageY();
                float imageWidth = y3Var.getImageWidth();
                float imageHeight = y3Var.getImageHeight();
                ImageReceiver imageReceiver = this.T0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(y3Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        pr prVar;
        float f7 = this.f23212ye;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f23024m1) || this.f23040n1)) {
                if (z11) {
                    prVar = pr.f29467g;
                } else {
                    prVar = pr.f29468i;
                }
                this.f23080q1 = (int) Math.ceil(prVar.getInterpolation(this.f23052o1) * AndroidUtilities.dp(35.0f));
                if (this.f23205y7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f23080q1 = 0;
                    }
                }
            }
            f7 += this.f23080q1;
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
                ((r1) arrayList.get(i10)).f22530w.setState(StateSet.NOTHING);
            }
        }
        th.a aVar = this.f22861a6;
        if (aVar != null) {
            aVar.f46572a.setState(StateSet.NOTHING);
        }
    }

    public final void F0() {
        int i10;
        boolean z10 = this.M0;
        boolean z11 = this.fe;
        bi.y3 y3Var = this.S0;
        if (z10 != z11) {
            this.fe = z10;
            ImageReceiver imageReceiver = this.T0;
            ImageReceiver imageReceiver2 = this.f23103r9;
            ImageReceiver imageReceiver3 = this.F9;
            xg.c cVar = this.P;
            xg.a aVar = this.O;
            ArrayList arrayList = this.Y5;
            RadialProgress2 radialProgress2 = this.P0;
            RadialProgress2 radialProgress22 = this.O0;
            if (z10) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.n9 n9Var = this.N8;
                if (n9Var != null) {
                    n9Var.a();
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((r1) obj).q();
                    }
                }
                rh.g gVar = this.f22876b6;
                if (gVar != null) {
                    gVar.a();
                }
                rh.g gVar2 = this.f22890c6;
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
                ImageReceiver[] imageReceiverArr2 = aVar.f49348a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = cVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = cVar.f49374a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (y3Var.onAttachedToWindow()) {
                    if (this.M1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.f23090qc = org.telegram.ui.Components.z5.update(0, (View) this, false, this.f23090qc, this.D9);
                this.f23106rc = org.telegram.ui.Components.z5.update(0, (View) this, false, this.f23106rc, this.K2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.n9 n9Var2 = this.N8;
                if (n9Var2 != null) {
                    n9Var2.b();
                }
                rh.g gVar3 = this.f22876b6;
                if (gVar3 != null) {
                    gVar3.f45621b.onDetachedFromWindow();
                    gVar3.f45635x.f();
                }
                rh.g gVar4 = this.f22890c6;
                if (gVar4 != null) {
                    gVar4.f45621b.onDetachedFromWindow();
                    gVar4.f45635x.f();
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        ((r1) obj2).r();
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
                y3Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = aVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = aVar.f49348a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = cVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = cVar.f49374a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.z5.release(this, this.f23106rc);
                org.telegram.ui.Components.z5.release(this, this.f23090qc);
                org.telegram.ui.Components.z5.release(this, this.f23076pc);
            }
        }
        boolean z12 = this.M0;
        if (z12 != this.f22952ge) {
            this.f22952ge = z12;
            int i15 = this.I7;
            if (z12) {
                MessageObject messageObject = this.f23205y7;
                if (y3Var != null) {
                    y3Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f23091qd || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f23155v1) {
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
                        e71 e71Var = messageObject.highestQuality;
                        if (e71Var != null && !e71Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        e71 e71Var2 = messageObject.thumbQuality;
                        if (e71Var2 != null && !e71Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f23205y7;
            if (y3Var != null) {
                y3Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f19890id) && !PhotoViewer.t1().Q1()) {
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
        bi.y3 y3Var = this.S0;
        canvas.translate(y3Var.getImageX(), y3Var.getImageY());
        this.Fb.c(canvas, this, (int) y3Var.getImageWidth(), (int) y3Var.getImageHeight(), y3Var.getAlpha(), this.f23064oe);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                rh.g gVar = this.f22876b6;
                if (gVar != null) {
                    return gVar.f45621b;
                }
                return null;
            } else if (i10 == -3) {
                rh.g gVar2 = this.f22890c6;
                if (gVar2 != null) {
                    return gVar2.f45621b;
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
                        r1 r1Var = (r1) obj;
                        th.b bVar = r1Var.f22531x;
                        if (bVar != null && (pollAnswer = r1Var.f22527s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f46563c;
                        }
                    }
                }
            }
        }
        j4 j4Var = this.F7;
        if (j4Var != null) {
            ArrayList arrayList2 = j4Var.f22159c;
            h4 h4Var = j4Var.f22158b;
            if (h4Var != null && i10 >= 0 && i10 < h4Var.f22020a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) j4Var.f22158b.f22020a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((i4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((i4) arrayList2.get(i12)).f22086f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.S0;
    }

    public final void F3(int i10) {
        a90 a90Var = this.f23174w5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < a90Var.d; i11++) {
                if (((Pair) a90Var.f24309c.get(i11)).second == valueOf) {
                    a90Var.j(i11);
                }
            }
        } else {
            a90Var.d(true);
        }
        a90 a90Var2 = this.U1;
        if (a90Var2 != null) {
            a90Var2.d(true);
        }
        this.f23115s5 = null;
        this.V1 = null;
        if (this.f23130t5 != null) {
            if (this.f23189x5 == i10 || i10 == -1) {
                this.f23130t5 = null;
                this.f23189x5 = -1;
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
        MessageObject messageObject = this.f23205y7;
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
                        if (checkBoxBase != null && checkBoxBase.f23907q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f23029m6;
                if (!z14 && !this.f23131t6 && this.f23100r6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.f23131t6 && !this.f23116s6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f23057o6) {
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
                } else if (!this.R7 && z15 && ((z14 && (!this.q6 || this.f23100r6)) || (this.f23131t6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                } else {
                    charSequence = null;
                }
                if (i10 != 0) {
                    if (this.Z5 == null) {
                        th.d dVar = new th.d(this, this.Id);
                        this.Z5 = dVar;
                        dVar.setCallback(this);
                        dVar.f46572a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.f22887c3 = charSequence;
                    this.Z5.d.q(charSequence, z10, true);
                    this.R2 = true;
                    this.f22873b3 = i10;
                    o1();
                }
                S0(z10);
            }
        }
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i10) {
        r1 r1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((r1) arrayList.get(i10)).f22512b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                s1 s1Var = this.Zc;
                if (s1Var.f22793t2) {
                    float f10 = s1Var.K1;
                    f7 += ((1.0f - f10) * s1Var.f22797u2) + (i12 * f10);
                    if (this.f23205y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (s1Var.f22802w0) {
                    f7 += s1Var.f22750j0;
                }
                return f7 + r1Var.f22513c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f22917e4 != null) {
            this.f22917e4 = null;
        }
        ArrayList arrayList = this.A5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f23218z5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean H0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k1 k1Var;
        boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = this.I7;
        if (!c10 && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f23205y7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (k1Var = this.Jc) != null && k1Var.X0(3, this) && TextUtils.equals(this.Jc.g(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f23205y7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((r1) arrayList.get(i10)).f22512b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                s1 s1Var = this.Zc;
                if (s1Var.f22793t2) {
                    float f10 = s1Var.K1;
                    f7 += ((1.0f - f10) * s1Var.f22797u2) + (i12 * f10);
                    if (this.f23205y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (s1Var.f22802w0) {
                    f7 += s1Var.f22750j0;
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
        k2.g0 g0Var = this.f23168w;
        g0Var.j(b1Var);
        b1 b1Var2 = this.Rd;
        g0Var.j(b1Var2);
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f23205y7.caption;
            } else {
                charSequence = this.f23205y7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = h10.f26557e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    h10[] h10VarArr = (h10[]) spanned.getSpans(0, spanned.length(), h10.class);
                    for (h10 h10Var : h10VarArr) {
                        if (h10Var.f26559b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(h10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(h10Var.f26559b.date));
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
                        g0Var.j(b1Var2);
                        zu zuVar = new zu(23, g0Var, b1Var2);
                        ((HashMap) g0Var.f14578b).put(b1Var2, zuVar);
                        if (j16 > 0) {
                            AndroidUtilities.runOnUIThread(zuVar, j16);
                        } else {
                            AndroidUtilities.runOnUIThread(zuVar);
                        }
                    }
                }
            }
        }
    }

    public final boolean I0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.I0(android.view.MotionEvent):boolean");
    }

    public final void I1(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.I1(float, android.graphics.Canvas, boolean):void");
    }

    public final int I2(byte[] bArr) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((r1) arrayList.get(i10)).f22527s;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3(boolean z10, boolean z11) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z11 || (messageObject = this.f23205y7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f22917e4 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Id);
                    this.l1 = checkBoxBase2;
                    if (this.M0) {
                        checkBoxBase2.f23902l = true;
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
                CheckBoxBase checkBoxBase3 = this.f22997k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Id);
                    this.f22997k1 = checkBoxBase4;
                    if (!checkBoxBase4.f23914y) {
                        checkBoxBase4.f23914y = true;
                        checkBoxBase4.b();
                    }
                    if (this.M0) {
                        this.f22997k1.f23902l = true;
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
            if (this.f23024m1 == z10) {
                if (z11 != this.f23040n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f23052o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f23040n1 = z11;
            this.f23024m1 = z10;
            if (z11) {
                this.f23066p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f23052o1 = f7;
            }
            invalidate();
        }
    }

    public final boolean K0(MotionEvent motionEvent) {
        z zVar;
        t1 t1Var;
        k1 k1Var;
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
                if (motionEvent.getAction() == 1 && this.L3 && (k1Var = this.Jc) != null) {
                    if (this.A8) {
                        TLRPC.User user = this.f22979ic;
                        if (user != null && user.bot_inline_placeholder == null) {
                            k1Var.Y1(this, user.f20016id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            k1 k1Var2 = this.Jc;
                            if (publicUsername == null) {
                                publicUsername = this.f23205y7.messageOwner.via_bot_name;
                            }
                            k1Var2.m0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Yb;
                        if (user2 != null) {
                            k1Var.s0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Zb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f23205y7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f22993jc;
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
                                t1Var = this;
                                k1Var.S(t1Var, chat2, i10, this.f22941g1, this.f22954h1, false);
                                t1Var.K3.setState(StateSet.NOTHING);
                                t1Var.L3 = false;
                                return t1Var.L3;
                            }
                        }
                    }
                }
                t1Var = this;
                t1Var.K3.setState(StateSet.NOTHING);
                t1Var.L3 = false;
                return t1Var.L3;
            }
            t1Var = this;
            return t1Var.L3;
        }
        this.L3 = false;
        return false;
    }

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f7;
        MessageObject messageObject2 = this.f23205y7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f23205y7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f23205y7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.l1 != null) {
                if (this.f23024m1 || this.f23040n1) {
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
                        f7 = y3 + this.Zc.f22750j0;
                    }
                    canvas.translate(this.I8, f7 + this.f23078pe);
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
        this.f23017l8 = z10;
        this.f22920e8 = z11;
        s4();
        if (this.F5) {
            this.H5.f27220o = f3();
        } else {
            this.G5.f24767p = f3();
        }
        invalidate();
    }

    public final boolean L0(MotionEvent motionEvent) {
        k1 k1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Za && this.Ka != null && this.K3 != null && ((this.Yb != null || this.Zb != null) && this.f22895cc != null && this.f22938fc != null)) {
            boolean contains = this.Q3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.R3 = contains;
                if (contains) {
                    this.Q3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.Q3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.R3 && (k1Var = this.Jc) != null && (user = this.Yb) != null) {
                    Drawable drawable = this.f22938fc.f28961f[0];
                    if (drawable instanceof org.telegram.ui.Components.q5) {
                        document = ((org.telegram.ui.Components.q5) drawable).f29579e;
                    } else {
                        document = null;
                    }
                    k1Var.N1(this, user, document, this.ec);
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
        s1 s1Var = this.Zc;
        ah.k1 k1Var = this.N;
        if (z10) {
            if (!this.f23205y7.isOutOwner()) {
                kc0 kc0Var = org.telegram.ui.ActionBar.j6.E3;
                if (f4()) {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20959tc, this.Id);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.j6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20959tc;
                    }
                    v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.Id);
                }
                kc0Var.a(v02);
                if (f4()) {
                    f15 = (getPhotoBottom() + this.f23125t0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float dp2 = (f7 - AndroidUtilities.dp(f14)) + f11;
                    if (this.f23091qd) {
                        if (this.J) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        float i12 = k1Var.i(s1Var.K1);
                        f15 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (i12 + AndroidUtilities.dp(f16)));
                    } else {
                        f15 = dp2;
                    }
                }
                if (!this.f23205y7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                a0.p(kc0Var, f12 + i11, f15 - AndroidUtilities.dp(12.0f));
                kc0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, kc0Var.getBounds().centerX(), kc0Var.getBounds().centerY());
                }
                kc0Var.draw(canvas);
                kc0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f23205y7.isOutOwner()) {
            if (!this.f23205y7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f23125t0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                dp = (f7 - AndroidUtilities.dp(f20)) + f11;
                if (this.f23091qd) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * k1Var.i(s1Var.K1);
                }
            }
            RectF rectF = this.f22889c5;
            rectF.set(f19, dp, AndroidUtilities.dp(14.0f) + f19, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.j6.f20622b2.getAlpha();
            int i13 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.j6.f20622b2.setAlpha(i13);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.f20622b2);
            org.telegram.ui.ActionBar.j6.f20622b2.setAlpha(alpha);
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
        if (z10 || !z12 || (messageObject = this.f23205y7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f22997k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            qa0 qa0Var = this.Kc;
            float f7 = 0.0f;
            if (qa0Var.f29648e == z11) {
                if (qa0Var.f29649f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    qa0Var.d = f7;
                    qa0Var.f29649f = false;
                    return;
                }
                return;
            }
            qa0Var.f29648e = z11;
            qa0Var.f29649f = z12;
            if (z12) {
                qa0Var.f29647c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                qa0Var.d = f7;
            }
            qa0Var.a();
            t1 t1Var = qa0Var.f29655m;
            if (t1Var != null) {
                t1Var.invalidate();
                if (t1Var.getParent() != null) {
                    ((ViewGroup) t1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean M0(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.M0(org.telegram.messenger.MessageObject):boolean");
    }

    public final void M1(Canvas canvas, float f7) {
        if (this.f23149ua == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.Z8 != null) {
                this.Ha -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f10 = this.Ga;
            float f11 = this.Ha + dp;
            RectF rectF = this.f22889c5;
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
                if (this.f23194xa) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.j6.f20731h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20731h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f20731h2);
                    org.telegram.ui.ActionBar.j6.f20731h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f20731h2);
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
                s1 s1Var = this.Zc;
                if (s1Var.U) {
                    if (s1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.j6.E2.setAlpha((int) ((1.0d - s1Var.K1) * 255.0d * f7));
                        canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - s1Var.X) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                        s1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (s1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - this.f22962h9) / 2), this.Ha + AndroidUtilities.dp(30.0f));
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
        t1 t1Var;
        if (this.f23205y7.isDice()) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof vi0) {
                final vi0 vi0Var = (vi0) drawable;
                String diceEmoji = this.f23205y7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.I7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.I7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f23205y7.getDiceValue();
                if ("🎰".equals(this.f23205y7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        wv0 wv0Var = (wv0) vi0Var;
                        if (wv0Var.U0 != null || wv0Var.V0) {
                            t1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int U = wv0.U(i10 & 3);
                            int U2 = wv0.U((i10 >> 2) & 3);
                            int U3 = wv0.U(i10 >> 4);
                            if (U == 4 && U2 == 4 && U3 == 4) {
                                U = 5;
                                U3 = 5;
                                U2 = 5;
                            }
                            wv0Var.f32346b1 = U;
                            wv0Var.f32347c1 = U2;
                            wv0Var.f32348d1 = U3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            wv0Var.V0 = true;
                            t1Var = this;
                            Utilities.globalQueue.postRunnable(new ji.q2(wv0Var, stickerSetByEmojiOrName, i11, messageObject, t1Var, z10, 3));
                        }
                        if (t1Var.f23205y7.isOut()) {
                            vi0Var.P(Integer.MAX_VALUE, t1Var.f22951gd);
                        }
                        t1Var.f23205y7.wasUnread = false;
                    } else {
                        t1Var = this;
                    }
                    if (vi0Var.f32568n0 == null && !vi0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        wv0 wv0Var2 = (wv0) vi0Var;
                        if (wv0Var2.f32568n0 == null && !wv0Var2.Y0) {
                            wv0Var2.Y0 = true;
                            Utilities.globalQueue.postRunnable(new fi.l3(wv0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), t1Var, 22));
                            return true;
                        }
                    }
                } else {
                    if (vi0Var.f32568n0 == null && !vi0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.I7).getPathToAttach(document, true);
                        if (vi0Var.f32568n0 == null && !vi0Var.Y0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f23205y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                vi0Var.Y0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final vi0 vi0Var2 = vi0Var;
                                                String str = readRes;
                                                if (vi0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    vi0 vi0Var3 = vi0Var2;
                                                                    vi0Var3.Y0 = false;
                                                                    if (!vi0Var3.V0 && vi0Var3.W0) {
                                                                        vi0Var3.A(true);
                                                                        return;
                                                                    }
                                                                    vi0Var3.j();
                                                                    vi0Var3.G();
                                                                    vi0Var3.v();
                                                                    return;
                                                                default:
                                                                    vi0 vi0Var4 = vi0Var2;
                                                                    vi0Var4.V0 = false;
                                                                    if (!vi0Var4.Y0 && vi0Var4.W0) {
                                                                        vi0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                vi0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (vi0Var2.U0 != null) {
                                                    i12 = vi0Var2.U0.f24067a[0];
                                                }
                                                if (vi0Var2.U0 != null) {
                                                    int i13 = vi0Var2.U0.f24067a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new m8(vi0Var2, i12, 7));
                                                return;
                                            default:
                                                final vi0 vi0Var3 = vi0Var;
                                                vi0Var3.f32568n0 = RLottieNative.b(readRes, vi0Var3.f32557e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                vi0 vi0Var32 = vi0Var3;
                                                                vi0Var32.Y0 = false;
                                                                if (!vi0Var32.V0 && vi0Var32.W0) {
                                                                    vi0Var32.A(true);
                                                                    return;
                                                                }
                                                                vi0Var32.j();
                                                                vi0Var32.G();
                                                                vi0Var32.v();
                                                                return;
                                                            default:
                                                                vi0 vi0Var4 = vi0Var3;
                                                                vi0Var4.V0 = false;
                                                                if (!vi0Var4.Y0 && vi0Var4.W0) {
                                                                    vi0Var4.A(true);
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
                        if (!z10 && this.f23205y7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.I7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            vi0Var.P(diceFrameSuccess.frame, this.f22951gd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.I7).getPathToAttach(document2, true);
                        if (vi0Var.U0 == null && !vi0Var.V0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f23205y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f23205y7.wasUnread = false;
                            } else {
                                if (z10 && vi0Var.S == null && vi0Var.R == null && vi0Var.Q == null) {
                                    vi0Var.K = 2;
                                    vi0Var.X0 = true;
                                }
                                vi0Var.V0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final vi0 vi0Var2 = vi0Var;
                                                String str = readRes2;
                                                if (vi0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    vi0 vi0Var32 = vi0Var2;
                                                                    vi0Var32.Y0 = false;
                                                                    if (!vi0Var32.V0 && vi0Var32.W0) {
                                                                        vi0Var32.A(true);
                                                                        return;
                                                                    }
                                                                    vi0Var32.j();
                                                                    vi0Var32.G();
                                                                    vi0Var32.v();
                                                                    return;
                                                                default:
                                                                    vi0 vi0Var4 = vi0Var2;
                                                                    vi0Var4.V0 = false;
                                                                    if (!vi0Var4.Y0 && vi0Var4.W0) {
                                                                        vi0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                vi0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (vi0Var2.U0 != null) {
                                                    i12 = vi0Var2.U0.f24067a[0];
                                                }
                                                if (vi0Var2.U0 != null) {
                                                    int i13 = vi0Var2.U0.f24067a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new m8(vi0Var2, i12, 7));
                                                return;
                                            default:
                                                final vi0 vi0Var3 = vi0Var;
                                                vi0Var3.f32568n0 = RLottieNative.b(readRes2, vi0Var3.f32557e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                vi0 vi0Var32 = vi0Var3;
                                                                vi0Var32.Y0 = false;
                                                                if (!vi0Var32.V0 && vi0Var32.W0) {
                                                                    vi0Var32.A(true);
                                                                    return;
                                                                }
                                                                vi0Var32.j();
                                                                vi0Var32.G();
                                                                vi0Var32.v();
                                                                return;
                                                            default:
                                                                vi0 vi0Var4 = vi0Var3;
                                                                vi0Var4.V0 = false;
                                                                if (!vi0Var4.Y0 && vi0Var4.W0) {
                                                                    vi0Var4.A(true);
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
                        this.f23205y7.wasUnread = false;
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
            int i13 = this.f23205y7.type;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f22984j2 && !this.f22998k2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f23157v3;
                if (action == 0) {
                    MessageObject messageObject = this.f23205y7;
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
                                    this.f23187x3[0] = 4;
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
                                        int B = vl.B(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int z11 = vl.z(2, this.T4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(B - AndroidUtilities.dp(20.0f), z11 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + B, AndroidUtilities.dp(20.0f) + z11);
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
                        if (this.f23205y7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z4 = false;
                        playSoundEffect(0);
                        this.Jc.y0(this, this.S4, this.T4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f23205y7.type == 16 && this.Z4 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                }
            }
        }
        return false;
    }

    public final void N1(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.N1(android.graphics.Canvas, float):void");
    }

    public final float N2(float f7) {
        float f10;
        float f11;
        if (f4() && this.K1 != 7) {
            return ((getPhotoBottom() + this.f23125t0) - AndroidUtilities.dp(7.3f)) - this.f23061ob.getHeight();
        }
        int i10 = this.M8;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f10)) - this.f23061ob.getHeight()) + f7;
        boolean z10 = this.f23091qd;
        s1 s1Var = this.Zc;
        if (z10) {
            if (this.J) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(s1Var.K1) + AndroidUtilities.dp(f11));
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
        return (s1Var.f22745i0 - s1Var.f22750j0) + dp;
    }

    public final void N3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            wj0 wj0Var = this.f22966he;
            s1 s1Var = this.Zc;
            if (wj0Var != null && wj0Var.h) {
                this.f23078pe = 0.0f;
            } else {
                float f7 = i11 + i13 + s1Var.f22745i0;
                this.f23078pe = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + s1Var.f22736g0), (int) (i11 + s1Var.f22750j0), (int) (i10 + i12 + s1Var.f22740h0), (int) (i11 + i13 + s1Var.f22745i0));
        }
    }

    public final boolean O0(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.O0(android.view.MotionEvent):boolean");
    }

    public final void O1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.O1(android.graphics.Canvas):void");
    }

    public final int O2(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((r1) arrayList.get(i11)).f22528t;
                if (todoItem != null && todoItem.f20014id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f22948g8 = true;
        this.f22961h8 = 1000;
        this.f22989j8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        ov0 Q1;
        int intValue;
        k1 k1Var = this.Jc;
        if (k1Var == null) {
            Q1 = null;
        } else {
            Q1 = k1Var.Q1();
        }
        ov0 ov0Var = Q1;
        if (this.f23205y7 != null) {
            bi.y3 y3Var = this.S0;
            if (y3Var.hasNotThumb() && ov0Var != null && !this.f23205y7.isSticker() && !this.f23205y7.isAnimatedEmoji() && ((!this.f23205y7.isVideo() || this.f23046n7) && !this.f23091qd && !this.f23205y7.isAnimatedSticker() && ((!this.f23205y7.isDocument() || this.f23205y7.isGif()) && !this.f23205y7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f23205y7;
                wh.g gVar = this.Fb;
                if (gVar == null) {
                    intValue = 0;
                } else {
                    Integer num = (Integer) gVar.f48610k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    intValue = num.intValue();
                }
                return ov0Var.a(motionEvent, this, y3Var, messageObject, intValue);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.f22888c4 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f23220z7;
        if (messageObject == null) {
            messageObject = this.f23205y7;
        }
        if (messageObject == null) {
            this.f22917e4 = null;
            return;
        }
        ni0 ni0Var = this.f22917e4;
        if (ni0Var == null || !ni0Var.f28761f || !Arrays.equals(ni0Var.f28762g, bArr)) {
            this.f22917e4 = new ni0(this, messageObject.getId(), bArr);
        }
        this.f23199y0 = true;
    }

    public final boolean Q0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.Q0(android.view.MotionEvent):boolean");
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
            s1 s1Var = this.Zc;
            if (s1Var.R2) {
                f7 = AndroidUtilities.lerp(1.0f - f7, f7, s1Var.K1);
            }
            float f14 = 1.0f * f7;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + s1Var.f22740h0;
            if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.J) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f23069p4;
            } else if (this.f23205y7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23162v8;
                if (this.f23205y7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f23004k8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f23162v8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f23162v8;
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
            int dp4 = ((int) (i11 + s1Var.f22736g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.f23079q0;
            float f15 = dp4;
            int i14 = (int) (dp3 - f15);
            int i15 = this.f22929f2;
            if (s1Var.X2) {
                i15 = AndroidUtilities.lerp(s1Var.T2, i15, s1Var.K1);
            }
            if (this.Z1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (s1Var.Z2) {
                AndroidUtilities.lerp(1.0f - f11, f11, s1Var.K1);
            }
            if (this.f22908da == null) {
                this.f22908da = new sl0(this);
            }
            int o9 = this.f22908da.o(this.Id);
            canvas.save();
            canvas.translate(f15, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            zc zcVar = this.R1;
            if (zcVar != null) {
                f12 = zcVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f22908da.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f22908da.e(canvas, rectF, f14);
            f01 f01Var = this.O1;
            if (f01Var != null) {
                f01Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f14, o9, canvas);
                if (this.P1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.O1.f25847c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.P1.f25847c, AndroidUtilities.dp(21.66f));
                    zc zcVar2 = this.Q1;
                    if (zcVar2 != null) {
                        f13 = zcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.f22908da.f30356g);
                    this.P1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f14, o9, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f22990j9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f23220z7;
        if (messageObject == null) {
            messageObject = this.f23205y7;
        }
        this.f23199y0 = false;
        ArrayList arrayList = this.A5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.f22888c4 != null && !TextUtils.isEmpty(messageObject.caption)) {
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
                        while (i17 < this.f22888c4.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.f22888c4.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f23184x0 = i17;
                                this.f23199y0 = false;
                                G3();
                                try {
                                    x80 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, B3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.f22888c4.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.f22888c4.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            x80 B32 = B3();
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
                            this.f23184x0 = i19;
                            this.f23199y0 = false;
                            G3();
                            try {
                                x80 B33 = B3();
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
                                        x80 B34 = B3();
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
                this.f23184x0 = -1;
                this.f23199y0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f23184x0 = -1;
            this.f23199y0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        rh.g gVar;
        rh.g gVar2;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            rh.g gVar3 = this.f22876b6;
            if (gVar3 != null) {
                if (gVar3.X && gVar3.f45619a.f15369f && gVar3.K.f(x10 - gVar3.L, z22 - gVar3.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f22928f1 = true;
                    invalidate();
                    return true;
                }
                rh.g gVar4 = this.f22876b6;
                if ((gVar4.X || gVar4.W) && gVar4.j(x10, z22, action)) {
                    this.f22928f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f23205y7.expandedExplanation && (gVar2 = this.f22890c6) != null) {
                if (gVar2.X && gVar2.f45619a.f15369f && gVar2.K.f(x10 - gVar2.L, z22 - gVar2.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f22928f1 = true;
                    invalidate();
                    return true;
                }
                rh.g gVar5 = this.f22890c6;
                if ((gVar5.X || gVar5.W) && gVar5.j(x10, z22, action)) {
                    this.f22928f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.N6 = -1;
                rh.g gVar6 = this.f22876b6;
                if (gVar6 != null && gVar6.S && gVar6.getBounds().contains(x10, z22)) {
                    this.N6 = -2;
                    invalidate();
                    return true;
                } else if (this.f23205y7.expandedExplanation && (gVar = this.f22890c6) != null && gVar.S && gVar.getBounds().contains(x10, z22)) {
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
                    rh.g gVar7 = this.f22876b6;
                    ImageReceiver imageReceiver = gVar7.f45621b;
                    TLRPC.MessageMedia messageMedia = gVar7.T;
                    k1 k1Var = this.Jc;
                    if (k1Var != null) {
                        k1Var.m(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    rh.g gVar8 = this.f22890c6;
                    ImageReceiver imageReceiver2 = gVar8.f45621b;
                    TLRPC.MessageMedia messageMedia2 = gVar8.T;
                    k1 k1Var2 = this.Jc;
                    if (k1Var2 != null) {
                        k1Var2.m(this, null, messageMedia2, -3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.R1(android.graphics.Canvas):void");
    }

    public final boolean R2() {
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            return f6Var.o0();
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    public final void R3(int i10) {
        MessageObject messageObject = this.f23220z7;
        if (messageObject == null) {
            messageObject = this.f23205y7;
        }
        if (messageObject == null) {
            this.f22917e4 = null;
            return;
        }
        ni0 ni0Var = this.f22917e4;
        if (ni0Var == null || !ni0Var.f28760e || ni0Var.f28759c != (-i10)) {
            this.f22917e4 = new ni0(this, messageObject.getId(), i10);
        }
        this.f23199y0 = true;
    }

    public final void S0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.Z5 != null && (messageObject = this.f23205y7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f23205y7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            th.d dVar = this.Z5;
            if (z11 && SendMessagesHelper.getInstance(this.I7).isSendingVote(this.f23205y7) != null) {
                z12 = true;
            }
            le.b bVar = dVar.f46576f;
            if (bVar.f15369f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f23205y7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f23146u7) {
            return true;
        }
        return false;
    }

    public final void S3(String str) {
        T3(str, false, false, -1);
    }

    public final boolean T0(MotionEvent motionEvent) {
        k1 k1Var;
        int i10;
        t1 t1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (this.C9 == null || (k1Var = this.Jc) == null || !k1Var.j0()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f23205y7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.J9, this.L9) + this.G9;
        } else {
            i10 = this.f23177w8 + this.G9;
        }
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.G9 && x10 <= i10) {
                float f7 = this.H9;
                if (z22 >= f7 && z22 <= f7 + this.I9) {
                    this.Q9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.U9 = x10;
                    this.V9 = getY() + z22;
                    z zVar = this.f23225zc;
                    if (zVar != null) {
                        zVar.setHotspot(x10, z22);
                        this.R9 = false;
                        this.S9 = true;
                        postDelayed(new b1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    zc zcVar = this.f23151uc;
                    if (zcVar != null) {
                        zcVar.c(true);
                        this.xc = x10;
                        this.f23210yc = z22;
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
                    z zVar2 = this.f23225zc;
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
                    zc zcVar2 = this.f23151uc;
                    if (zcVar2 != null) {
                        zcVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f23035mc) {
                        k1 k1Var2 = this.Jc;
                        if (k1Var2 != null) {
                            TLRPC.Chat chat = this.f22993jc;
                            if (chat != null) {
                                k1Var2.S(this, chat, this.f23205y7.messageOwner.fwd_from.channel_post, this.f22941g1, this.f22954h1, false);
                                t1Var = this;
                            } else {
                                t1Var = this;
                                TLRPC.User user = t1Var.f22964hc;
                                if (user != null) {
                                    k1Var2.s0(this, user, t1Var.f22941g1, t1Var.f22954h1);
                                } else if (t1Var.f23008kc != null) {
                                    k1Var2.n(this);
                                }
                            }
                        }
                    } else {
                        t1Var = this;
                        if (t1Var.Jc != null && (t1Var.f23205y7.hasValidReplyMessageObject() || t1Var.f23205y7.isReplyToStory() || t1Var.f23207y9 || ((message = t1Var.f23205y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            t1Var.Jc.T1(t1Var, t1Var.f23205y7.getReplyMsgId(), x10, z22, false);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (motionEvent.getAction() == 3) {
                    t1Var.Q9 = false;
                    t1Var.R9 = false;
                    z zVar3 = t1Var.f23225zc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    zc zcVar3 = t1Var.f23151uc;
                    if (zcVar3 != null) {
                        zcVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x10 >= t1Var.G9 && x10 <= i10) {
                        float f10 = t1Var.H9;
                        if (z22 >= f10 && z22 <= f10 + t1Var.I9) {
                            if (t1Var.f23225zc != null && t1Var.S9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - t1Var.V9, 2.0d) + Math.pow(x10 - t1Var.U9, 2.0d)) > 0.75d) {
                                    t1Var.S9 = false;
                                }
                            }
                        }
                    }
                    t1Var.Q9 = false;
                    t1Var.R9 = false;
                    t1Var.S9 = false;
                    z zVar4 = t1Var.f23225zc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    zc zcVar4 = t1Var.f23151uc;
                    if (zcVar4 != null) {
                        zcVar4.c(false);
                    }
                }
            }
            return t1Var.Q9;
        }
        t1Var = this;
        return t1Var.Q9;
    }

    public final void T1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.T1(android.graphics.Canvas, float):void");
    }

    public final boolean T2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.T2():boolean");
    }

    public final boolean T3(java.lang.String r19, boolean r20, boolean r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.T3(java.lang.String, boolean, boolean, int):boolean");
    }

    public final boolean U0(int i10, MotionEvent motionEvent) {
        int i11;
        wh.h hVar;
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
        if (this.f23205y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId) {
                        int i19 = currentPosition.flags;
                        if ((i19 & 8) != 0 && (i19 & 1) != 0 && t1Var != this) {
                            motionEvent.offsetLocation(getLeft() - t1Var.getLeft(), getTop() - t1Var.getTop());
                            boolean U0 = t1Var.U0(i10 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - t1Var.getLeft()), -(getTop() - t1Var.getTop()));
                            return U0;
                        }
                    }
                }
            }
        }
        if (this.f23191x7) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        s1 s1Var = this.Zc;
        if (actionMasked == 0) {
            int i20 = this.f23039n0;
            if (x10 >= i20 && z22 >= (i16 = this.f23094r0)) {
                MessageObject messageObject = this.f23205y7;
                if (x10 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(s1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f23205y7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f23205y7.textLayoutBlocks, s1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f23205y7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (wh.h hVar2 : textLayoutBlock.spoilers) {
                            if (hVar2.getBounds().contains((x10 - this.f23039n0) + i17, (int) ((z22 - this.f23094r0) - textLayoutBlock.textYOffset(this.f23205y7.textLayoutBlocks, s1Var)))) {
                                this.f23176w7 = hVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.f22888c4 != null) {
                float f7 = x10;
                float f10 = this.f23069p4;
                if (f7 >= f10) {
                    float f11 = z22;
                    float f12 = this.f23083q4;
                    if (f11 >= f12 && f7 <= f10 + textLayoutBlocks.textWidth && f11 <= f12 + textLayoutBlocks.textHeight(s1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.f22888c4.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.f22888c4.textLayoutBlocks, s1Var) <= f11; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.f22888c4.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (wh.h hVar3 : textLayoutBlock2.spoilers) {
                                if (hVar3.getBounds().contains((int) ((f7 - this.f23069p4) + i15), (int) ((f11 - this.f23083q4) - textLayoutBlock2.textYOffset(this.f22888c4.textLayoutBlocks, s1Var)))) {
                                    this.f23176w7 = hVar3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f22957h4 == null) {
                return false;
            }
            float f13 = x10;
            float f14 = this.f22862a7;
            if (f13 < f14) {
                return false;
            }
            float f15 = z22;
            float f16 = this.f22877b7;
            if (f15 <= f16 || f13 > f14 + textLayoutBlocks2.textWidth || f15 > f16 + textLayoutBlocks2.textHeight(s1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f22957h4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f22957h4.textLayoutBlocks, s1Var) <= f15; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f22957h4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (wh.h hVar4 : textLayoutBlock3.spoilers) {
                    if (hVar4.getBounds().contains((int) ((f13 - this.f22862a7) + i14), (int) ((f15 - this.f22877b7) - textLayoutBlock3.textYOffset(this.f22957h4.textLayoutBlocks, s1Var)))) {
                        this.f23176w7 = hVar4;
                        return true;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f23176w7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Nd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f22957h4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (wh.h hVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = hVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f22957h4.textLayoutBlocks, s1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f22957h4.textLayoutBlocks, s1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.f22888c4;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (wh.h hVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = hVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.f22888c4.textLayoutBlocks, s1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.f22888c4.textLayoutBlocks, s1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f23205y7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (wh.h hVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = hVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f23205y7.textLayoutBlocks, s1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f23205y7.textLayoutBlocks, s1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.f22889c5;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f23191x7 = true;
            this.f23176w7.f48627q = new b1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f22957h4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f22957h4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (wh.h hVar8 : textLayoutBlock11.spoilers) {
                        hVar8.j((x10 - this.f22862a7) + i13, (z22 - textLayoutBlock11.textYOffset(this.f22957h4.textLayoutBlocks, s1Var)) - this.f22877b7, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.f22888c4;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.f22888c4.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (wh.h hVar9 : textLayoutBlock13.spoilers) {
                        hVar9.j((x10 - this.f23069p4) + i12, (z22 - textLayoutBlock13.textYOffset(this.f22888c4.textLayoutBlocks, s1Var)) - this.f23083q4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f23205y7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f23205y7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (wh.h hVar10 : textLayoutBlock15.spoilers) {
                            hVar10.j((x10 - this.f23039n0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f23205y7.textLayoutBlocks, s1Var)) - this.f23094r0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof ll0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof t1) {
                        t1 t1Var2 = (t1) childAt2;
                        ArrayList arrayList10 = t1Var2.Ld;
                        if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((wh.h) arrayList10.get(0)).f48627q = new na(6, this, t1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((wh.h) obj).j(hVar.getBounds().centerX(), hVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f23176w7 = null;
            return true;
        }
    }

    public final void U1(float r37, float r38, android.graphics.Canvas r39, java.util.ArrayList r40, float r41, boolean r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.U1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean U2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.U2():boolean");
    }

    public final void U3(float f7, float f10, float f11, float f12) {
        bi.y3 y3Var = this.S0;
        y3Var.setImageCoords(f7, f10, f11, f12);
        int i10 = this.K1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.M4 = (int) (y3Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (y3Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.N4 = imageY;
        int i11 = this.M4;
        int dp = AndroidUtilities.dp(24.0f) + this.N4;
        this.P0.q(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.K4 = (int) com.google.android.gms.internal.vision.e2.A(y3Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f7);
        int A = (int) com.google.android.gms.internal.vision.e2.A(y3Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, y3Var.getImageY());
        this.L4 = A;
        int i12 = this.K4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.L4;
        this.O0.q(i12, A, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.isStakedDice() && !this.Q) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof vi0) {
                vi0 vi0Var = (vi0) drawable;
                if ((vi0Var.f32568n0 != null || vi0Var.Y0) && !this.Q && (i10 = vi0Var.K) != 1 && i10 == 2) {
                    if (!vi0Var.X0) {
                        float r10 = vi0Var.r();
                        if (vi0Var.U0 != null) {
                            r10 = vi0Var.f32553b0 / vi0Var.f31346a1;
                        }
                        if (r10 <= 0.95f) {
                            return;
                        }
                    }
                    this.Q = true;
                    k1 k1Var = this.Jc;
                    if (k1Var != null) {
                        k1Var.w1(this, false);
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f12 = this.f23094r0;
            s1 s1Var = this.Zc;
            if (s1Var.f22760l2) {
                float f13 = s1Var.f22769n2;
                float f14 = s1Var.K1;
                f7 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f7 = f12;
            }
            if (s1Var.K1 != 1.0f && s1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.f5 f5Var = this.f23133t8;
                if (f5Var != null) {
                    Rect bounds = f5Var.getBounds();
                    if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                wj0 wj0Var = this.f22966he;
                if (wj0Var != null && wj0Var.h) {
                    MessageObject messageObject2 = this.f23205y7;
                    U1(this.f23039n0, f7, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f23039n0, f7, canvas, s1Var.H0, s1Var.N0, false, 1.0f - s1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f23205y7;
                    U1(this.f23039n0, f7, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, s1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f7;
            boolean z10 = s1Var.D1;
            if (z10 && this.f23133t8 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f23126t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, s1Var.K1, this.f23205y7.textHeight(s1Var) * i11, f12);
                    float f16 = s1Var.f22769n2;
                    if (this.f23126t1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.f23205y7.textHeight(s1Var) * i12) * s1Var.K1);
                    f11 = z11;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f23133t8.getBounds());
                if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f17 = rectF.left;
                float f18 = s1Var.f22769n2;
                canvas.clipRect(f17, f18, rectF.right, this.f23205y7.textHeight(s1Var) + f18 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f23205y7;
                U1(this.f23039n0, f10, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - s1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f23133t8.getBounds());
                if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f23094r0, rectF.right, AndroidUtilities.dp(4.0f) + this.f23205y7.textHeight(s1Var) + i10);
                MessageObject messageObject5 = this.f23205y7;
                U1(this.f23039n0, f11, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f23205y7;
            U1(this.f23039n0, f15, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.N.f607b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void V3(org.telegram.messenger.MessageObject r110, org.telegram.messenger.MessageObject.GroupedMessages r111, boolean r112, boolean r113, boolean r114, boolean r115) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.V3(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean, boolean, boolean):void");
    }

    public final boolean W0(MotionEvent motionEvent) {
        if (!this.ha || this.f23019la == null || this.wc == null || this.Jc == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Cc;
        if (action == 0) {
            if (rectF.contains(x10, z22)) {
                this.wc.c(true);
                z zVar = this.f23006ka;
                if (zVar != null) {
                    zVar.setHotspot(x10, z22);
                    this.f23006ka.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.wc.h && !rectF.contains(x10, z22)) {
                this.wc.c(false);
                z zVar2 = this.f23006ka;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.wc.h) {
                this.Jc.F0(this);
            }
            this.wc.c(false);
            z zVar3 = this.f23006ka;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.wc.c(false);
            z zVar4 = this.f23006ka;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.wc.h;
    }

    public final void W1(android.graphics.Canvas r52, float r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.W1(android.graphics.Canvas, float):void");
    }

    public final boolean W2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void W3(org.telegram.messenger.MessageObject r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.W3(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final boolean X0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.X0(android.view.MotionEvent):boolean");
    }

    public final void X1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.X1(android.graphics.Canvas):void");
    }

    public final boolean X2() {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f22888c4;
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
        this.f23220z7 = messageObject;
        this.A7 = groupedMessages;
        this.C7 = z10;
        this.B7 = z11;
        this.D7 = z12;
        this.E7 = z13;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        r9 q22;
        boolean z10;
        boolean z11;
        int i10;
        int dp;
        int i11;
        int dp2;
        int extraTextX;
        int i12;
        MessageObject.GroupedMessages groupedMessages;
        k1 k1Var = this.Jc;
        if (k1Var != null && (q22 = k1Var.q2()) != null && (q22.b() || q22.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f23205y7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f23205y7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f22983j1 || this.K != null) && (this.K == null || this.Jc.P()))) {
                if (this.f23205y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof t1) {
                                t1 t1Var = (t1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId && (currentPosition.flags & t0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    q22.f21766c = (int) t1Var.f23069p4;
                                    q22.d = (int) t1Var.f23083q4;
                                    q22.b0(t1Var);
                                    if (t1Var == this) {
                                        return q22.N(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - t1Var.getLeft(), getTop() - t1Var.getTop());
                                    boolean N = q22.N(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - t1Var.getLeft()), -(getTop() - t1Var.getTop()));
                                    return N;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f23205y7;
                    if (messageObject != null && !messageObject.preview && this.S1 != null && z2(motionEvent) >= this.f23079q0) {
                        q22.f22693w0 = false;
                        q22.f22695y0 = true;
                        q22.A0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.K;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f23069p4;
                        } else {
                            float f7 = 12.0f;
                            if (this.f23205y7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23162v8;
                                if (this.f23205y7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f23004k8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f23162v8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f23162v8;
                                    if (!this.J) {
                                        f7 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f7) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Zc.f22736g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.f23079q0;
                        q22.f21766c = (AndroidUtilities.dp(10.0f) + dp3) - this.f22872b2;
                        q22.d = AndroidUtilities.dp(22.0f) + i15;
                    } else if (P2()) {
                        q22.f22693w0 = false;
                        q22.f22695y0 = false;
                        q22.A0 = false;
                        q22.f21766c = (int) this.f23069p4;
                        q22.d = (int) this.f23083q4;
                    } else {
                        MessageObject messageObject2 = this.f23205y7;
                        if (messageObject2 != null && !messageObject2.preview && this.K2 != null && (!this.f23126t1 ? z2(motionEvent) > this.f23053o2 : z2(motionEvent) < this.f23094r0)) {
                            q22.f22693w0 = true;
                            q22.f22695y0 = false;
                            q22.A0 = false;
                            if (this.f22984j2) {
                                i11 = this.f23051o0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f22998k2) {
                                    i10 = this.f23051o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i10 = this.f23051o0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i11 = i10 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f23096r2;
                            int i16 = this.f23053o2;
                            q22.f21766c = dp4;
                            q22.d = i16;
                        } else if (z11) {
                            q22.f22693w0 = false;
                            q22.f22695y0 = false;
                            q22.A0 = true;
                            int i17 = this.f23039n0;
                            int i18 = this.f23094r0;
                            q22.f21766c = i17;
                            q22.d = i18;
                        } else {
                            q22.f22693w0 = false;
                            q22.f22695y0 = false;
                            q22.A0 = false;
                            int i19 = this.f23039n0;
                            int i20 = this.f23094r0;
                            q22.f21766c = i19;
                            q22.d = i20;
                        }
                    }
                    q22.b0(this);
                    return q22.N(motionEvent);
                }
            }
        }
        return false;
    }

    public void Y1(android.graphics.Canvas r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.Y1(android.graphics.Canvas):void");
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
                this.f23184x0 = i13;
                G3();
                try {
                    x80 B3 = B3();
                    B3.f30678c = true;
                    B3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, B3);
                    B3.a();
                    float f7 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            x80 B32 = B3();
                            B32.f30678c = true;
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
                    if (this.f23199y0) {
                        this.f22948g8 = true;
                        this.f22961h8 = 2500;
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
        this.f22859a4 = -1;
    }

    public final void Y3(int i10) {
        this.f23038n = i10;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f23205y7.isSponsored() && this.f23205y7.sponsoredCanReport) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x10;
                if (f7 >= this.F2 - AndroidUtilities.dp(6.0f) && f7 <= this.F2 + this.D2 + AndroidUtilities.dp(6.0f)) {
                    float f10 = z22;
                    if (f10 >= this.G2 - AndroidUtilities.dp(2.0f) && f10 <= this.G2 + this.E2 + AndroidUtilities.dp(2.0f)) {
                        zc zcVar = this.I2;
                        if (zcVar != null) {
                            zcVar.c(true);
                        }
                        this.H2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.H2) {
                k1 k1Var = this.Jc;
                if (k1Var != null) {
                    k1Var.L1();
                }
                zc zcVar2 = this.I2;
                if (zcVar2 != null) {
                    zcVar2.c(false);
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
        bi.y3 y3Var = this.S0;
        float alpha = y3Var.getAlpha();
        if (this.f23205y7.isRoundOnce()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        y3Var.setAlpha(f7 * alpha);
        y3Var.draw(canvas);
        y3Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f23044n5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i10, int i11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        this.J0 = i10;
        this.K0 = i11;
        this.Tc = i11;
        if ((this.f23205y7 != null && R2() && this.f23205y7.shouldDrawWithoutBackground()) || ((f5Var = this.f23133t8) != null && f5Var.f20424a != null)) {
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
        i1 i1Var;
        z zVar;
        if (this.L5 && ((!this.f23107rd || getVideoTranscriptionProgress() > 0.0f || this.G3) && (i1Var = this.M5) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (i1Var.v.contains((int) x10, (int) z22)) {
                    if (action == 0) {
                        i1Var.A = true;
                    }
                    if (i1Var.A && (zVar = i1Var.f25213q) != null) {
                        zVar.setHotspot(x10, z22);
                        i1Var.f25213q.setState(d31.N);
                        i1Var.f25214r.invalidate();
                    }
                    return true;
                }
            } else if (i1Var.A && action == 1) {
                i1Var.m();
                return true;
            } else {
                i1Var.A = false;
            }
        }
        return false;
    }

    public boolean a2(Canvas canvas) {
        org.telegram.ui.Components.d6 animation;
        int i10;
        boolean z10;
        MessageObject messageObject = this.f23205y7;
        bi.y3 y3Var = this.S0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = y3Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = y3Var.draw(canvas);
                } else {
                    z10 = true;
                }
                y3Var.setForceNotMedia(true);
                float alpha = y3Var.getAlpha();
                y3Var.setAlpha(clamp01 * alpha);
                y3Var.draw(canvas);
                y3Var.setAlpha(alpha);
                y3Var.setForceNotMedia(false);
                return z10;
            }
        }
        return y3Var.draw(canvas);
    }

    public final void a3() {
        k1 k1Var = this.Jc;
        if (k1Var != null && k1Var.f()) {
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
        bi.y3 y3Var = this.S0;
        float imageY = f7 - y3Var.getImageY();
        float measuredHeight = f10 - (getMeasuredHeight() - y3Var.getImageY2());
        float imageHeight = y3Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / y3Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23109s = z11;
        y3Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void b(float f7) {
        MessageObject messageObject = this.f23205y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(this.f23205y7, f7);
        q4();
    }

    public final boolean b1() {
        MessageObject messageObject = this.f23205y7;
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
        k1 k1Var = this.Jc;
        int i12 = 0;
        if (k1Var != null) {
            if (!k1Var.X0(1, this)) {
                this.D5 = null;
                ArrayList arrayList = this.C5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.C5.size(); i13++) {
                        m1 m1Var = (m1) this.C5.get(i13);
                        if (!m1Var.f22268a.c()) {
                            m1Var.f22268a.a();
                        }
                    }
                }
            } else {
                CharacterStyle H1 = this.Jc.H1(this);
                if (H1 != this.D5) {
                    this.D5 = H1;
                    h90 h90Var = this.B5;
                    if (h90Var != null) {
                        h90Var.a();
                        this.B5 = null;
                    }
                    h90 h90Var2 = new h90();
                    this.B5 = h90Var2;
                    h90Var2.C = true;
                    x80 x80Var = new x80(0);
                    h90 h90Var3 = this.B5;
                    h90Var3.f26691x = x80Var;
                    h90Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.f22268a = this.B5;
                    obj.f22269b = -3;
                    if (this.C5 == null) {
                        this.C5 = new ArrayList();
                    }
                    this.C5.add(obj);
                    if (this.D5 != null && !r2(obj, x80Var, this.K2, -2) && (((textLayoutBlocks = this.f22888c4) == null || !s2(obj, x80Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f23205y7) != null)) {
                        s2(obj, x80Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.C5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f23205y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Ld;
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Id);
            while (i12 < this.C5.size()) {
                m1 m1Var2 = (m1) this.C5.get(i12);
                if (m1Var2.f22269b == i10) {
                    h90 h90Var4 = m1Var2.f22268a;
                    h90Var4.f(org.telegram.ui.ActionBar.j6.l1(0.85f, v02), org.telegram.ui.ActionBar.j6.l1(2.0f, v02), org.telegram.ui.ActionBar.j6.l1(3.5f, v02), org.telegram.ui.ActionBar.j6.l1(6.0f, v02));
                    h90Var4.draw(canvas);
                    invalidate();
                    if (h90Var4.b()) {
                        this.C5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f23174w5.d <= 0 && this.N.f622s) {
            MessageObject messageObject = this.f23205y7;
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
        s1 s1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Yd = i10;
        this.f22869ae = i11;
        this.f22883be = i12;
        this.J0 = i13;
        this.K0 = i14;
        this.f22912de = f10;
        this.f22897ce = f7;
        this.Tc = i14;
        this.Uc = i15;
        this.Vc = i16;
        this.Zd = i17;
        if ((!this.f23058o7.isEmpty() || (this.v != null && (messageObject = this.f23205y7) != null && messageObject.type == 27)) && this.Sc != f10) {
            invalidate();
        }
        this.Sc = f10;
        if (i12 != this.K0 || f7 != this.L0) {
            this.L0 = f7;
            this.K0 = i12;
        }
        if (this.f23205y7 != null && R2() && this.f23205y7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f23205y7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f23094r0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f23205y7.textLayoutBlocks.size();
                s1Var = this.Zc;
                if (i21 >= size || this.f23205y7.textLayoutBlocks.get(i21).textYOffset(this.f23205y7.textLayoutBlocks, s1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = -1;
            int i24 = -1;
            int i25 = 0;
            while (i22 < this.f23205y7.textLayoutBlocks.size()) {
                float textYOffset = this.f23205y7.textLayoutBlocks.get(i22).textYOffset(this.f23205y7.textLayoutBlocks, s1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(s1Var) + textLayoutBlock.padBottom;
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
                if (this.f23076pc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f23076pc.f31093a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.f23076pc.f31093a.get(i26);
                        if (u5Var != null && u5Var.f30815n) {
                            float y3 = (0.0f - getY()) - u5Var.f30816r;
                            float y10 = (this.f23038n - getY()) - u5Var.f30816r;
                            Rect rect = u5Var.f30813e;
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
        MessageObject messageObject3 = this.f23205y7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f23094r0;
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
                r1 r1Var = (r1) arrayList.get(i33);
                int i34 = r1Var.f22512b + this.Lc;
                if (Z2(i34, i34 + r1Var.f22513c, this.Yd, i19 + this.f22869ae)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f22987j6 != i31 || this.f22973i6 != i32) {
                this.f22987j6 = i31;
                this.f22973i6 = i32;
                invalidate();
            }
        }
        if (this.f23208ya) {
            if (Math.abs(this.Ja - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Zd), this.Ha - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        ah.k1 k1Var = this.N;
        int i35 = k1Var.d;
        boolean Z2 = Z2(i35, i35 + k1Var.f618o, this.Yd, i18 + this.f22869ae);
        if (this.f23015l6 != Z2) {
            this.f23015l6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(float f7) {
        MessageObject messageObject = this.f23205y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f7);
        q4();
    }

    public final boolean c1(float f7, int i10) {
        ah.k1 k1Var = this.N;
        if (!k1Var.K) {
            return false;
        }
        float y3 = getY() + k1Var.d;
        if (y3 <= f7 || (y3 + k1Var.f618o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.c2(android.graphics.Canvas):void");
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
        if (this.f23205y7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.f20858o2;
            int i13 = org.telegram.ui.ActionBar.j6.f20705fc;
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f21021x2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f20876p2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f20894q2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            org.telegram.ui.ActionBar.j6.f20912r2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Id));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.f21021x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.f20603a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.j6.f20858o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.j6.f20876p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.f20894q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.f20912r2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20740hc, this.Id);
            textPaint8.linkColor = v02;
            textPaint7.linkColor = v02;
            textPaint6.linkColor = v02;
            textPaint5.linkColor = v02;
            textPaint4.linkColor = v02;
            textPaint3.linkColor = v02;
            textPaint2.linkColor = v02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.f20858o2;
            int i14 = org.telegram.ui.ActionBar.j6.ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f21021x2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f20876p2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f20894q2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            org.telegram.ui.ActionBar.j6.f20912r2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Id));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.j6.f21021x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.j6.f20603a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.j6.f20858o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.j6.f20876p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.j6.f20894q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.j6.f20912r2;
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
            e1 e1Var = this.G5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f23205y7.isOutOwner()) {
                        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21013wb, this.Id);
                        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21030xb, this.Id);
                        int i16 = org.telegram.ui.ActionBar.j6.f21066zb;
                        e1Var.h(v04, v05, org.telegram.ui.ActionBar.j6.v0(i16, this.Id), org.telegram.ui.ActionBar.j6.v0(i16, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21047yb, this.Id));
                    } else if (this.f22955h2 && this.f22865aa != null) {
                        int c10 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20979ud, this.Id), this.f22865aa.h());
                        int c11 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20996vd, this.Id), this.f22865aa.h());
                        int i17 = org.telegram.ui.ActionBar.j6.f21031xd;
                        e1Var.h(c10, c11, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Id), this.f22865aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Id), this.f22865aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21014wd, this.Id), this.f22865aa.h()));
                    } else {
                        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20979ud, this.Id);
                        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20996vd, this.Id);
                        int i18 = org.telegram.ui.ActionBar.j6.f21031xd;
                        e1Var.h(v06, v07, org.telegram.ui.ActionBar.j6.v0(i18, this.Id), org.telegram.ui.ActionBar.j6.v0(i18, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21014wd, this.Id));
                    }
                }
            } else {
                boolean isOutOwner = this.f23205y7.isOutOwner();
                io0 io0Var = this.H5;
                if (isOutOwner) {
                    int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ab, this.Id);
                    int v09 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cb, this.Id);
                    int v010 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bb, this.Id);
                    io0Var.f27221p = v08;
                    io0Var.f27222q = v09;
                    io0Var.f27223r = v010;
                    int v011 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21013wb, this.Id);
                    int v012 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21030xb, this.Id);
                    int i19 = org.telegram.ui.ActionBar.j6.f21066zb;
                    e1Var.h(v011, v012, org.telegram.ui.ActionBar.j6.v0(i19, this.Id), org.telegram.ui.ActionBar.j6.v0(i19, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21047yb, this.Id));
                } else if (this.f22955h2 && this.f22865aa != null) {
                    int c12 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21049yd, this.Id), this.f22865aa.h());
                    int c13 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Id), this.f22865aa.h());
                    int c14 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21068zd, this.Id), this.f22865aa.h());
                    io0Var.f27221p = c12;
                    io0Var.f27222q = c13;
                    io0Var.f27223r = c14;
                    int c15 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20979ud, this.Id), this.f22865aa.h());
                    int c16 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20996vd, this.Id), this.f22865aa.h());
                    int i20 = org.telegram.ui.ActionBar.j6.f21031xd;
                    e1Var.h(c15, c16, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Id), this.f22865aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Id), this.f22865aa.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21014wd, this.Id), this.f22865aa.h()));
                } else {
                    int v013 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21049yd, this.Id);
                    int v014 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Id);
                    int v015 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21068zd, this.Id);
                    io0Var.f27221p = v013;
                    io0Var.f27222q = v014;
                    io0Var.f27223r = v015;
                    int v016 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20979ud, this.Id);
                    int v017 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20996vd, this.Id);
                    int i21 = org.telegram.ui.ActionBar.j6.f21031xd;
                    e1Var.h(v016, v017, org.telegram.ui.ActionBar.j6.v0(i21, this.Id), org.telegram.ui.ActionBar.j6.v0(i21, this.Id), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21014wd, this.Id));
                }
            }
        }
        MessageObject messageObject = this.f23205y7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.j6.T2;
            int v018 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, this.Id);
            if (f3()) {
                if (this.f23205y7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.j6.nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f20868od;
                }
            } else if (this.f23205y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.f20940sb;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f20851nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), v018, org.telegram.ui.ActionBar.j6.v0(i12, this.Id)));
        } else if (this.f23004k8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, this.Id));
            } else {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20798kd, this.Id));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.j6.nb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20940sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.Id));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.j6.f20868od;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20851nd;
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

    public final boolean d1() {
        return FileLoader.getInstance(this.I7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f7, Integer num) {
        boolean z10;
        boolean z11 = this.f23091qd;
        float f10 = 1.0f;
        ah.k1 k1Var = this.N;
        if (z11) {
            k1Var.f606a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f23015l6 && V2()) {
            if (k1Var.f606a > 0.0f) {
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
            float f11 = k1Var.f606a;
            s1 s1Var = this.Zc;
            if (f11 <= 0.0f && s1Var.f22802w0 && this.L == null && !this.f23091qd) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f22745i0);
                k1Var.D = 0.0f;
                k1Var.E = false;
                if (s1Var.f22735g) {
                    f10 = s1Var.K1;
                }
                k1Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                k1Var.D = 0.0f;
                k1Var.E = false;
                if (s1Var.f22735g) {
                    f10 = s1Var.K1;
                }
                k1Var.d(canvas, f10, num);
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if ((groupedMessagePosition == null || ((groupedMessages = this.K) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Zc.f22802w0) {
                if (!this.f23183x || !this.f23205y7.isVoice()) {
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
            if (user != null && user.f20016id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f23205y7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f23205y7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                X3(messageObject, this.K, this.F, this.E, this.G, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public final void e(boolean z10, boolean z11) {
        this.nc = z10;
        if (z10) {
            this.f23062oc = z11;
        } else {
            this.f23062oc = false;
        }
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f23205y7.isVideo();
        bi.y3 y3Var = this.S0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
                y3Var.setAllowStartAnimation(false);
                y3Var.stopAnimation();
                return;
            }
            y3Var.setAllowStartAnimation(true);
            y3Var.startAnimation();
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
        y3Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            y3Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            y3Var.startAnimation();
        } else {
            y3Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f23091qd;
        float f7 = 1.0f;
        ah.k1 k1Var = this.N;
        if (z10) {
            k1Var.f606a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f23015l6 || !V2()) {
            return false;
        }
        if (k1Var.f606a > 0.0f) {
            p0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        float f10 = k1Var.f606a;
        s1 s1Var = this.Zc;
        if (f10 <= 0.0f && s1Var.f22802w0 && this.L == null && !this.f23091qd) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f22745i0);
            if (s1Var.f22735g) {
                f7 = s1Var.K1;
            }
            k1Var.e(canvas, f7);
            canvas.restore();
        } else {
            if (s1Var.f22735g) {
                f7 = s1Var.K1;
            }
            k1Var.e(canvas, f7);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f23205y7.messageOwner).period;
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
        if ((this.K == null || (this.L.flags & 4) != 0) && !this.f22955h2) {
            MessageObject messageObject = this.f23205y7;
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
        k1 k1Var = this.Jc;
        if (k1Var != null) {
            k1Var.k2(this, reactionCount, z10, f7, f10);
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
            canvas2.translate(this.f23039n0, this.f23094r0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f23017l8) || ((!this.f23017l8 && this.f22920e8) || this.f22934f8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f23205y7;
            if (messageObject == null || !messageObject.preview) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.f4():boolean");
    }

    public final int g1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        bi.y3 y3Var = this.S0;
        y3Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f23032m9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.F9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f23103r9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f23182we = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f22931f4)) {
                        n4();
                        this.f23182we = (int) (i10 + this.f23083q4);
                        this.f23197xe = this.f22888c4;
                    }
                    i10 = this.f23110s0 + this.f23139u0 + i10;
                }
            }
            return i10;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        y3Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f23110s0 + this.f23139u0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f22983j1 && !this.f22948g8 && !this.f22934f8) {
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
        if ((i10 != -1 && i10 != 1) || this.f23016l7 == z10) {
            return;
        }
        this.f23016l7 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f23030m7 = f10;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new q1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.f23037me;
    }

    @Override
    public float getAlpha() {
        if (this.Xc) {
            return this.Yc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.z5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.getAnimatedEmojiSpans():org.telegram.ui.Components.z5[]");
    }

    public float getAnimationOffsetX() {
        return this.f23227ze;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f23059o8) {
            return this.f23032m9;
        }
        return null;
    }

    public qa0 getBackgroundDrawable() {
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
                MessageObject messageObject = this.f23205y7;
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
        if (!this.f23004k8) {
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
            if (this.f23091qd) {
                return (this.L8 - this.J8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.L8 - this.J8;
            if (this.f23004k8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f23091qd) {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f23059o8) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f23059o8) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (!this.f23004k8) {
                f7 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f7);
        }
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.L.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f23091qd) {
            if (this.J) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f23004k8 && this.J) {
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
        if (this.f23091qd) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.J && (messageObject2 = this.f23205y7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.J && ((messageObject = this.f23205y7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f23004k8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f23004k8 && this.J) {
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
        if (!this.f23004k8 && this.I) {
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
        s1 s1Var = this.Zc;
        if (s1Var.B1) {
            return AndroidUtilities.lerp(s1Var.A1, this.f22898d0, s1Var.K1);
        }
        return this.f22898d0;
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f23205y7;
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
        if (z10 && (M0(this.f23205y7) || this.L5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f23058o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f23205y7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f23162v8;
                if (!this.f23004k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f7);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((e0) arrayList.get(i15)).f21813c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f22913e0 != null) {
            backgroundDrawableLeft = Math.min(this.I8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int dp;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f23205y7) || this.L5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f23058o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f23205y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f23162v8;
                if (!this.f23004k8 && !this.J) {
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
                i12 = Math.max(i12, ((int) (e0Var.f21813c * f10)) + dp + ((int) (e0Var.f21814e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f22913e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.f22888c4;
    }

    public float getCaptionX() {
        s1 s1Var = this.Zc;
        if (s1Var.f22802w0) {
            if (s1Var.C0) {
                this.f23069p4 += s1Var.f22736g0;
            } else if (s1Var.f22787s0) {
                float f7 = this.f23069p4;
                float f10 = s1Var.K1;
                this.f23069p4 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, s1Var.f22779q0, f7 * f10);
            } else if (!this.f23205y7.isVoice() || !TextUtils.isEmpty(this.f23205y7.caption)) {
                this.f23069p4 += s1Var.f22736g0;
            }
        }
        return this.f23069p4;
    }

    public float getCaptionY() {
        float f7 = this.f23083q4;
        s1 s1Var = this.Zc;
        if (s1Var.f22802w0) {
            if (s1Var.C0) {
                return f7 - getTranslationY();
            }
            if (s1Var.f22787s0) {
                float f10 = s1Var.K1;
                return com.google.android.gms.internal.vision.e2.z(1.0f, f10, s1Var.f22783r0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f23080q1;
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
        if (this.f23205y7.shouldDrawWithoutBackground()) {
            f7 = this.nb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f7 = this.nb;
            intrinsicHeight = org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight();
        }
        return (int) (f7 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.f5 f5Var = this.f23133t8;
        if (f5Var == null) {
            return 0;
        }
        int i10 = f5Var.getBounds().left;
        if (!this.f23205y7.isOutOwner() && this.Zc.f22814z0 != 1.0f) {
            boolean z10 = this.f23091qd;
            if ((z10 || !this.f23004k8) && !this.J) {
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
        org.telegram.ui.ActionBar.f5 f5Var = this.f23133t8;
        if (f5Var == null) {
            return getWidth();
        }
        int i10 = f5Var.getBounds().right;
        if (this.f23205y7.isOutOwner() && this.Zc.f22814z0 != 1.0f && (((z10 = this.f23091qd) || !this.f23004k8) && !this.J)) {
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

    public k1 getDelegate() {
        return this.Jc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Zc.f22745i0;
    }

    public float getDeltaLeft() {
        return this.Zc.f22736g0;
    }

    public float getDeltaRight() {
        return this.Zc.f22740h0;
    }

    public float getDeltaTop() {
        return this.Zc.f22750j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f7;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z10 = this.f22984j2;
        float f10 = 0.0f;
        s1 s1Var = this.Zc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f23051o0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f22998k2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f23051o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f23205y7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f23051o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.f23205y7.isOutOwner()) {
                    f7 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23162v8;
                    if (this.f23205y7.type == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.J9, this.L9) + f7) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f23004k8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f23162v8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f23162v8;
                        if (!this.J) {
                            f11 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f7 = extraTextX + dp;
                }
                dp2 = (f7 + s1Var.f22736g0) - AndroidUtilities.dp(1.33f);
                float f12 = this.f23065p0;
                if (s1Var.f22785r2) {
                    AndroidUtilities.lerp(s1Var.f22781q2, f12, s1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (s1Var != null) {
            f10 = s1Var.f22740h0;
        }
        float f13 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.f23205y7.isOutOwner() && !this.f23004k8 && !this.J) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f13 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f23127t2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f23112s2) - this.f23127t2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f7;
        float f10 = this.f23053o2;
        s1 s1Var = this.Zc;
        if (!s1Var.f22785r2) {
            f7 = (-s1Var.f22750j0) + s1Var.f22745i0;
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
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f23205y7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f22957h4;
    }

    public float getExplanationX() {
        return this.f22862a7;
    }

    public float getExplanationY() {
        return this.f22877b7;
    }

    public int getExtraInsetHeight() {
        float f7;
        int i10;
        int i11 = this.f23129t4;
        boolean z10 = this.N1;
        ah.k1 k1Var = this.N;
        if (z10) {
            if (k1Var.f622s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f22929f2;
        }
        if (this.f22990j9) {
            if (f4()) {
                f7 = 41.3f;
            } else {
                f7 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f7);
        }
        if (!k1Var.f622s && this.f23205y7.shouldDrawReactionsInLayout()) {
            return i11 + k1Var.f619p;
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f22918e5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f22918e5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f23205y7.messageOwner.attachPath;
                }
                if (this.f23205y7.isSendError() && (i10 = this.K1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f23205y7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f7;
        TLRPC.User user = this.Yb;
        if (user != null && user.f20016id == 0) {
            f7 = this.f23032m9.getCenterX();
        } else {
            f7 = this.f22978ib + this.H1;
        }
        return (int) f7;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f22941g1;
    }

    public float getLastTouchY() {
        return this.f22954h1;
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
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f23205y7).type) != 5) {
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
                if (this.f23059o8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.J8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f23205y7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f23004k8) {
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
        MessageObject messageObject3 = this.f23205y7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f23205y7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.f23107rd && ((messageObject = this.f23205y7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.J8 - (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.F8 && (this.f23205y7.type == 5 || this.K1 == 6)) {
            return this.J8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.J8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        s1 s1Var = this.Zc;
        if (s1Var.Z1) {
            return AndroidUtilities.lerp(s1Var.Y1, this.f23041n2, s1Var.K1);
        }
        return this.f23041n2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f23220z7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f23205y7;
    }

    public int getNameStatusX() {
        int i10;
        float f7 = this.Wa + this.Va;
        int i11 = this.f23221z8;
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
        return getTopicSeparatorTopPadding() + this.V + this.f22953h0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f23205y7;
        if (messageObject == null) {
            messageObject = this.f23220z7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.J0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        j4 j4Var = this.F7;
        if (j4Var != null) {
            return j4Var.f22160e + j4Var.h;
        }
        return this.S0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.S0;
    }

    public ArrayList<r1> getPollButtons() {
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
        MessageObject messageObject2 = this.f23205y7;
        if (messageObject2 != null && this.K != null && messageObject2.hasValidGroupId()) {
            messageObject = this.K.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f23205y7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.O0;
    }

    public ah.k1 getReactionsLayout() {
        return this.N;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.Id;
    }

    public io0 getSeekBarWaveform() {
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
        return this.f23212ye;
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
        MessageObject messageObject3 = this.f23205y7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        s1 s1Var = this.Zc;
        if (s1Var.f22811y1) {
            return AndroidUtilities.lerp(s1Var.f22807x1, this.V, s1Var.K1);
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
        return this.f23039n0;
    }

    public int getTextY() {
        return this.f23094r0;
    }

    public float getTimeAlpha() {
        return this.f23028m5;
    }

    public float getTimeX() {
        int i10;
        s1 s1Var = this.Zc;
        if (s1Var.f22741h1) {
            i10 = AndroidUtilities.lerp(s1Var.f22737g1, this.f23105rb, s1Var.K1);
        } else {
            i10 = this.f23105rb;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (f4()) {
            if (this.f22990j9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f23205y7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.K8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f22990j9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f23041n2 + this.Lc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        s1 s1Var = this.Zc;
        if (s1Var.f22796u1) {
            return AndroidUtilities.lerp(s1Var.f22792t1, this.f22927f0, s1Var.K1);
        }
        return this.f22927f0;
    }

    public s1 getTransitionParams() {
        return this.Zc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        s1 s1Var = this.Zc;
        if (s1Var == null || (messageObject = this.f23205y7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (s1Var.l1) {
            if (this.f23086q8) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.f23086q8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Sc;
    }

    public int getWidthForButtons() {
        s1 s1Var = this.Zc;
        if (s1Var.N1) {
            return AndroidUtilities.lerp(s1Var.O1, this.f23117s7, s1Var.K1);
        }
        return this.f23117s7;
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

    public final void h1(t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        t1Var.N7 = this.N7;
        t1Var.f22863a8 = this.f22863a8;
        t1Var.P7 = this.P7;
        t1Var.Q7 = this.Q7;
        t1Var.R7 = this.R7;
        t1Var.S7 = this.S7;
        t1Var.T7 = this.T7;
        t1Var.U7 = this.U7;
        t1Var.V7 = this.V7;
        t1Var.W7 = this.W7;
        t1Var.X7 = this.X7;
        t1Var.Y7 = this.Y7;
        t1Var.f22878b8 = this.f22878b8;
        t1Var.f22892c8 = this.f22892c8;
        t1Var.f22906d8 = this.f22906d8;
        t1Var.E8 = this.E8;
        t1Var.F8 = this.F8;
        t1Var.G8 = this.G8;
        t1Var.H8 = this.H8;
        t1Var.I8 = this.I8;
    }

    public final void h2(Canvas canvas, Integer num, float f7, boolean z10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        ah.k1 k1Var = this.N;
        if (!k1Var.f607b) {
            k1Var.D = f7;
            k1Var.E = z10;
            k1Var.d(canvas, this.Zc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f23220z7 != null) {
            return this.D7;
        }
        return this.G;
    }

    public final void h4() {
        bi.y3 y3Var = this.S0;
        i4((y3Var.getImageWidth() / 2.0f) + y3Var.getImageX(), (y3Var.getImageHeight() / 2.0f) + y3Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f23062oc;
    }

    public final void i1(t1 t1Var) {
        wh.g gVar;
        if (t1Var != null && (gVar = t1Var.Fb) != null) {
            int i10 = (Integer) gVar.f48610k.get(t1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Gb = i10;
            wh.g gVar2 = this.Fb;
            if (gVar2 != null) {
                gVar2.f48610k.put(this, i10);
            }
        }
    }

    public final void i2(um umVar, Canvas canvas, int i10, Integer num, float f7) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        ah.k1 k1Var = this.N;
        if (!k1Var.f607b) {
            k1Var.D = f7;
            k1Var.f(umVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f7) {
        if (this.f23133t8 != null) {
            int i10 = this.f23162v8;
            if (f7 >= i10 && f7 <= i10 + this.f23177w8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f7, float f10) {
        t1 t1Var;
        bi.y3 y3Var = this.S0;
        this.Eb = (float) Math.sqrt(Math.pow(y3Var.getImageHeight(), 2.0d) + Math.pow(y3Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f23205y7;
        if (!messageObject.isMediaSpoilersRevealed && this.Bb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                t1Var = this;
                t1Var.V3(messageObject, this.K, this.F, this.E, this.G, this.H);
                MessageObject messageObject2 = t1Var.f23205y7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (t1Var.K != null) {
                    t1Var.O0.o(0.0f, false);
                }
            } else {
                t1Var = this;
            }
            t1Var.Cb = f7;
            t1Var.Db = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.p.a(t1Var.Eb * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(pr.f29469j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new j1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        k1 k1Var;
        if (this.f23205y7 == null) {
            return;
        }
        Runnable runnable = this.f21595e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f23010ke;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f23023le;
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
        if (!this.Od || (k1Var = this.Jc) == null) {
            return;
        }
        k1Var.o();
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

    public final void j1(t1 t1Var) {
        t1Var.b4(this.Yd, this.f22869ae, this.f22883be, this.f22897ce, this.f22912de, this.J0, this.K0, this.Uc, this.Vc, this.Zd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f7) {
        String str;
        p0();
        if (this.f23194xa) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f7, f7, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.j6.f20731h2);
        }
    }

    public final boolean j3() {
        if (this.f23220z7 != null) {
            return this.E7;
        }
        return this.H;
    }

    public final boolean j4() {
        k1 k1Var;
        if (getCurrentMessagesGroup() == null && (k1Var = this.Jc) != null && k1Var.q2() != null && this.Jc.q2().A(this.f23205y7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.W8 == null) {
            this.W8 = new ImageReceiver[3];
            this.X8 = new org.telegram.ui.Components.i9[3];
            this.Y8 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.W8;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.W8[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.X8[i10] = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
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
        if ((!this.ta || z10) && this.f23149ua != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition == null || (groupedMessages = this.K) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f23205y7.isOutOwner();
                s1 s1Var = this.Zc;
                if (isOutOwner) {
                    float dp2 = s1Var.f22746i1 - AndroidUtilities.dp(40.0f);
                    this.Ga = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.K;
                    if (groupedMessages2 != null) {
                        this.Ga = (groupedMessages2.transitionParams.offsetLeft - this.f23227ze) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + s1Var.f22751j1;
                    this.Ga = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.K;
                    if (groupedMessages3 != null) {
                        this.Ga = (groupedMessages3.transitionParams.offsetRight - this.f23227ze) + dp3;
                    }
                }
                float f14 = 0.0f;
                if (this.f23149ua == 4) {
                    this.Ha = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.M8 + s1Var.f22745i0) - AndroidUtilities.dp(41.0f);
                    this.Ha = dp4;
                    MessageObject messageObject = this.f23205y7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f23089qb) {
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
                    if (this.f23205y7.shouldDrawReactions()) {
                        ah.k1 k1Var = this.N;
                        if (!k1Var.f607b) {
                            if (this.f23091qd) {
                                this.Ha -= (1.0f - getVideoTranscriptionProgress()) * k1Var.i(s1Var.K1);
                            } else if (k1Var.f606a > 0.0f) {
                                this.Ha -= k1Var.i(s1Var.K1);
                            }
                        }
                    }
                }
                if (this.f23149ua != 4) {
                    float dp5 = ((this.M8 + s1Var.f22745i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Ha < dp5) {
                        this.Ha = dp5;
                    }
                }
                if (this.f23205y7.type == 19) {
                    if (this.f23149ua == 3 && this.Z8 != null) {
                        this.Ha = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Ha = 0.0f;
                    }
                }
                if (!this.f23205y7.isOutOwner() && this.f23091qd && !this.f22955h2) {
                    if (this.f23059o8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.f23107rd) {
                        f11 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f11 = 0.0f;
                    }
                    if (this.f23107rd) {
                        f14 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (s1Var.f22756k2) {
                        if (this.f23107rd) {
                            f12 = s1Var.K1;
                        } else {
                            f12 = 1.0f - s1Var.K1;
                        }
                        f11 = (1.0f - getVideoTranscriptionProgress()) * f12 * dp;
                        if (this.f23107rd) {
                            f13 = s1Var.K1;
                        } else {
                            f13 = 1.0f - s1Var.K1;
                        }
                        f14 = (1.0f - getVideoTranscriptionProgress()) * f13 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ga -= f11;
                    this.Ha -= f14;
                }
                this.f23163va = true;
                if (this.f23149ua == 3) {
                    if (!this.f23183x || this.f23205y7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!org.telegram.ui.Components.ov0.f29196v0) {
                    float f17 = this.Ga;
                    float f18 = this.Ha;
                    float dp6 = AndroidUtilities.dp(32.0f) + f17;
                    float f19 = this.Ha;
                    if (this.f23179wa == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    float dp7 = f19 + AndroidUtilities.dp(f7);
                    RectF rectF = this.f22889c5;
                    rectF.set(f17, f18, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f23163va = false;
                        return;
                    }
                    int i11 = (int) ((1.0f - this.f23198y.f15368e) * 255.0f);
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
                    if (this.f23149ua == 4 && this.f23179wa == 5 && this.f23194xa) {
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
                        if (this.f23194xa) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f20731h2);
                    }
                    int i12 = this.f23149ua;
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
                        if (this.f23179wa == 5) {
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f23205y7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f23205y7.isSponsored() || this.f23205y7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.O7 && !this.f22906d8) {
            return false;
        }
        TLRPC.Message message2 = this.f23205y7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f23205y7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.f22906d8 && this.f23205y7.type == 0) || ((!this.E && this.Ya && this.N7 && (!this.f23205y7.isOutOwner() || ((this.f23205y7.isSupergroup() && this.f23205y7.isFromGroup()) || this.f23205y7.isRepostPreview))) || (this.f23205y7.isImportedForward() && this.f23205y7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                r1 r1Var = (r1) arrayList.get(i10);
                if (this.Jc.O(this, r1Var.f22528t, !r1Var.f22517i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f23205y7.getDialogId();
                    int i11 = this.I7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f23205y7);
                    int i12 = this.I7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, r1Var.f22528t.f20014id, !r1Var.f22517i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!r1Var.f22517i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        r1Var.f22532y.p(userOrChat);
                        r1Var.f22533z.setForUserOrChat(userOrChat, r1Var.f22532y);
                        r1Var.f22525q = new f01(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.R8[i10].f(-1, !r1Var.f22517i, true);
                    if (this.f23158v4 != null) {
                        if (!this.f23205y7.isOutOwner() && this.f23205y7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f23158v4.q(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f23205y7.getFromChatId())), true, true);
                        } else {
                            this.f23158v4.q(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    r1Var.f22517i = !r1Var.f22517i;
                    invalidate();
                    return;
                }
                this.f23204y6 = false;
            }
        }
    }

    @Override
    public final void l() {
        k1 k1Var;
        if (this.f23205y7 != null) {
            Runnable runnable = this.f23010ke;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f23023le;
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
            if (this.Od && (k1Var = this.Jc) != null) {
                k1Var.o();
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
            this.f23110s0 = AndroidUtilities.dp(60.0f) + this.f23110s0;
            if (z10 != this.W2) {
                this.W2 = 0;
                int y3 = vl.y(75.0f, this.J8, i10);
                float dpf2 = (this.J8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.X2;
                if (arrayList == null) {
                    this.X2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.U2) {
                    this.W2 |= 1;
                    this.X2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), y3, dpf2));
                }
                if (this.T2) {
                    this.W2 |= 2;
                    this.X2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), y3, dpf2));
                }
                if (this.V2) {
                    this.W2 |= 4;
                    this.X2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), y3, dpf2));
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
        if (this.K1 != 7 || ((messageObject = this.f23205y7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f23125t0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.Zc.K1) + AndroidUtilities.dp(this.J ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f23205y7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            kc0 kc0Var = org.telegram.ui.ActionBar.j6.E3;
            if (f4()) {
                if (this.f23205y7.shouldDrawWithoutBackground()) {
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, this.Id);
                    int i10 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    kc0Var.getClass();
                    f13 = 4.0f;
                    a0.p(kc0Var, ((i10 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    kc0Var.setAlpha((int) (this.f23028m5 * 255.0f * f18));
                } else {
                    f13 = 4.0f;
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20959tc, this.Id);
                    int i11 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    kc0Var.getClass();
                    a0.p(kc0Var, ((i11 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    kc0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 4.0f;
                f15 = 1.0f;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Na, this.Id);
                kc0Var.getClass();
                f14 = 18.5f;
                a0.p(kc0Var, (this.L8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f11 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f10);
                kc0Var.setAlpha((int) (f18 * 255.0f));
            }
            kc0Var.a(v02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, kc0Var.getBounds().centerX(), kc0Var.getBounds().centerY());
            }
            kc0Var.draw(canvas);
            kc0Var.setAlpha(255);
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
                if (this.f23205y7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f15 - f12), 0.0f);
                        }
                        a0.p(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f23028m5 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f15 - f12) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.j6.F3.setAlpha((int) (this.f23028m5 * 255.0f * f18));
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
                Drawable L22 = this.f23205y7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.j6.G3;
                a0.p(L22, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f10);
                L22.setAlpha((int) (this.f23028m5 * 255.0f * f18));
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
            RectF rectF = this.f22889c5;
            rectF.set(i12, f20, AndroidUtilities.dp(14.0f) + i12, AndroidUtilities.dp(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.j6.f20622b2.getAlpha();
            org.telegram.ui.ActionBar.j6.f20622b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), org.telegram.ui.ActionBar.j6.f20622b2);
            org.telegram.ui.ActionBar.j6.f20622b2.setAlpha(alpha);
            a0.p(org.telegram.ui.ActionBar.j6.f20769j4, AndroidUtilities.dp(6.0f) + i12, f20 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.j6.f20769j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.j6.f20769j4.getBounds().centerX(), org.telegram.ui.ActionBar.j6.f20769j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.j6.f20769j4.draw(canvas);
            org.telegram.ui.ActionBar.j6.f20769j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean l3(org.telegram.messenger.MessageObject r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.l3(org.telegram.messenger.MessageObject):boolean");
    }

    public final void l4() {
        MessageObject messageObject;
        int i10;
        boolean z10;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.fe && (messageObject = this.f23205y7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.q5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f22888c4;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.f23076pc = org.telegram.ui.Components.z5.update(i10, (View) this, false, this.f23076pc, arrayList);
            } else {
                k1 k1Var = this.Jc;
                if (k1Var != null && k1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f23076pc = org.telegram.ui.Components.z5.update(i10, this, z10, this.f23076pc, this.f23205y7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f23205y7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                k1 k1Var2 = this.Jc;
                richMessageLayout.invalidateAnimatedEmojiInParent = (k1Var2 == null || !k1Var2.f()) ? true : true;
                this.f23205y7.richLayout.updateAnimatedEmojis(i10);
            }
        }
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m():boolean");
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
                int dp = AndroidUtilities.dp(174.0f) + this.f23075pb;
                if (!this.f22955h2) {
                    this.J8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.H5.f27218m = messageObject;
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
                    this.f23143u4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
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
                StaticLayout c10 = iw0.c(documentFileName, org.telegram.ui.ActionBar.j6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
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
                    this.f23143u4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.j6.C2, this.A4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (this.M1) {
                    this.f22918e5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f22932f5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f23205y7.isHiddenSensitive() || (DownloadController.getInstance(this.I7).getAutodownloadMask() & 1) == 0) {
                        this.f22918e5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f22918e5;
                    bi.y3 y3Var = this.S0;
                    if (photoSize != null && photoSize != this.f22932f5) {
                        BitmapDrawable bitmapDrawable = this.f23205y7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f22932f5 = null;
                            this.f22945g5 = bitmapDrawable;
                        }
                    } else {
                        this.f22918e5 = null;
                        y3Var.setNeedsQualityThumb(true);
                        y3Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f22958h5 = "86_86_b";
                    y3Var.setImage(ImageLocation.getForObject(this.f22918e5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f22932f5, messageObject.photoThumbsObject), this.f22958h5, this.f22945g5, 0L, null, messageObject, 1);
                }
                return i11;
            }
        }
        return 0;
    }

    public void m2(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m2(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean m3() {
        if (this.f23220z7 != null) {
            return this.C7;
        }
        return this.F;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m4(boolean, boolean, boolean):void");
    }

    public final boolean n0() {
        if (this.f23205y7.hasMediaSpoilers() && !this.f23205y7.isMediaSpoilersRevealed && this.Bb == 0.0f && this.T0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final void n2(Canvas canvas, float f7, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        bi.y3 y3Var;
        char c10;
        int i11;
        int i12;
        char c11;
        boolean z12;
        s1 s1Var;
        float f13;
        boolean z13;
        float f14;
        boolean z14;
        t1 t1Var;
        String str;
        int i13;
        float f15;
        float dp;
        float f16;
        boolean z15;
        s1 s1Var2;
        boolean z16;
        boolean z17;
        s1 s1Var3;
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
        s1 s1Var4;
        float f21;
        float f22;
        boolean z25;
        int i15;
        boolean z26;
        MessageObject messageObject;
        float j3;
        TextPaint textPaint;
        int i16;
        t1 t1Var2 = this;
        Canvas canvas2 = canvas;
        if (((t1Var2.f23150ub && !t1Var2.M) || !t1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = t1Var2.f23205y7;
            if ((!messageObject2.deleted || t1Var2.L == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.T2;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, t1Var2.Id);
                    if (t1Var2.f3()) {
                        i16 = t1Var2.f23205y7.isOutOwner() ? org.telegram.ui.ActionBar.j6.nb : org.telegram.ui.ActionBar.j6.f20868od;
                    } else {
                        i16 = t1Var2.f23205y7.isOutOwner() ? org.telegram.ui.ActionBar.j6.f20940sb : org.telegram.ui.ActionBar.j6.f20851nd;
                    }
                    textPaint2.setColor(i0.a.d(t1Var2.getVideoTranscriptionProgress(), v02, org.telegram.ui.ActionBar.j6.v0(i16, t1Var2.Id)));
                } else if (t1Var2.f4()) {
                    if (t1Var2.f23205y7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, t1Var2.Id));
                    } else {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20798kd, t1Var2.Id));
                    }
                } else if (t1Var2.f23205y7.isOutOwner()) {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.nb : org.telegram.ui.ActionBar.j6.f20940sb, t1Var2.Id));
                } else {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.f20868od : org.telegram.ui.ActionBar.j6.f20851nd, t1Var2.Id));
                }
                float f23 = t1Var2.getTransitionParams().J1 ? t1Var2.getTransitionParams().K1 * f7 : f7;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (t1Var2.J && !t1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f24 = t1Var2.M8;
                s1 s1Var5 = t1Var2.Zc;
                if (s1Var5.f22802w0) {
                    f24 += s1Var5.f22745i0;
                }
                MessageObject.GroupedMessages groupedMessages = t1Var2.K;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f12 = f10;
                } else {
                    f24 -= t1Var2.getTranslationY();
                    f12 = f10 + t1Var2.K.transitionParams.offsetRight;
                }
                float f25 = f24;
                float f26 = f12;
                if (t1Var2.J && t1Var2.f4()) {
                    f25 += AndroidUtilities.dp(1.0f);
                }
                float f27 = f25;
                if (s1Var5.f22802w0) {
                    float f28 = t1Var2.f23227ze;
                    f12 += f28;
                    f26 += f28;
                }
                float f29 = f12;
                boolean shouldDrawReactions = t1Var2.f23205y7.shouldDrawReactions();
                ah.k1 k1Var = t1Var2.N;
                if (shouldDrawReactions && k1Var.f607b) {
                    if (s1Var5.f22802w0 && s1Var5.f22740h0 != 0.0f) {
                        j3 = k1Var.j(1.0f);
                    } else {
                        j3 = k1Var.j(s1Var5.K1);
                    }
                    f26 += j3;
                }
                if (s1Var5.T0) {
                    f26 = com.google.android.gms.internal.vision.e2.b(1.0f, s1Var5.K1, s1Var5.Y0, f26);
                }
                float f30 = f26;
                boolean f42 = t1Var2.f4();
                RectF rectF = t1Var2.f22889c5;
                bi.y3 y3Var2 = t1Var2.S0;
                if (f42) {
                    int i17 = -(t1Var2.f22990j9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (t1Var2.f23205y7.shouldDrawWithoutBackground()) {
                        M2 = t1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = t1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f31 = f23;
                    y3Var = y3Var2;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (t1Var2.f23028m5 * 255.0f * f31));
                    MessageObject messageObject3 = t1Var2.f23205y7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f17 = f29;
                        f18 = f31;
                    } else {
                        float currentAlpha = y3Var.isCrossfadingWithOldImage() ? 1.0f : y3Var.getCurrentAlpha();
                        if (!y3Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f17 = f29;
                        f18 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = t1Var2.f23205y7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.o5 o5Var = t1Var2.f23011l0;
                        f18 *= o5Var == null ? 0.0f : o5Var.e();
                    }
                    M2.setAlpha((int) com.google.android.gms.internal.vision.e2.C(alpha, t1Var2.f23028m5, f18, 0.6f));
                    int i18 = t1Var2.K1;
                    if (i18 != 7 && i18 != 6 && t1Var2.f23205y7.type != 19) {
                        int[] roundRadius = y3Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z24 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = t1Var2.f23205y7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z24 = false;
                    }
                    MessageObject messageObject6 = t1Var2.f23205y7;
                    float dp4 = f17 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f22967i0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z24 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = t1Var2.f23205y7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f32 = f18;
                    float f33 = dp4;
                    if (t1Var2.K1 != 7 || ((messageObject = t1Var2.f23205y7) != null && messageObject.isRoundOnce())) {
                        photoBottom = t1Var2.getPhotoBottom() + t1Var2.f23125t0;
                    } else {
                        photoBottom = f27 - ((1.0f - t1Var2.getVideoTranscriptionProgress()) * (k1Var.i(s1Var5.K1) + AndroidUtilities.dp(t1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float dp7 = f34 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f35 = dp5 - dp6;
                    float f36 = dp6 + dp5 + f11;
                    int i19 = z24 ? 12 : 8;
                    if (t1Var2.f23205y7.isOutOwner()) {
                        f19 = f36;
                        i14 = (t1Var2.f23205y7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f19 = f36;
                        i14 = 0;
                    }
                    rectF.set(f35, dp7, f19 + AndroidUtilities.dp(i19 + i14), dp7 + max);
                    j4 j4Var = t1Var2.F7;
                    if (j4Var != null) {
                        float f37 = dp2;
                        canvas2.save();
                        Path path = j4Var.f22174t;
                        path.rewind();
                        path.addRoundRect(rectF, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!t1Var2.f23205y7.isQuickReply()) {
                        if (t1Var2.f23205y7.hasMediaSpoilers() && t1Var2.f23205y7.type != 5) {
                            Path path2 = t1Var2.E5;
                            path2.rewind();
                            float f38 = dp2;
                            path2.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = t1Var2.f23205y7.needDrawBluredPreview() ? y3Var : t1Var2.T0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = t1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * t1Var2.f23044n5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f38, f38, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            t1Var2.p0();
                            float f39 = dp2;
                            canvas2.drawRoundRect(rectF, f39, f39, M2);
                            if (M2 == t1Var2.M2("paintChatActionBackground") && t1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.j6.f20731h2.getAlpha();
                                org.telegram.ui.ActionBar.j6.f20731h2.setAlpha((int) (alpha4 * t1Var2.f23028m5 * f32));
                                canvas2.drawRoundRect(rectF, f39, f39, org.telegram.ui.ActionBar.j6.f20731h2);
                                org.telegram.ui.ActionBar.j6.f20731h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = t1Var2.f23205y7;
                    float dp8 = f40 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f23205y7.shouldDrawReactions() && k1Var.f607b) {
                        t1Var2.t4();
                        k1Var.D = 0.0f;
                        k1Var.E = false;
                        k1Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(t1Var2.Zb) || t1Var2.Zb.megagroup) && (t1Var2.f23205y7.messageOwner.flags & 1024) == 0 && t1Var2.Vb == null && !t1Var2.Y7) {
                        i12 = i17;
                        f27 = f27;
                        c10 = 7;
                        f20 = dp8;
                        f23 = f31;
                    } else {
                        float lineWidth = (t1Var2.f23075pb - staticLayout.getLineWidth(0)) + dp8;
                        if (k1Var.f607b && !k1Var.f622s) {
                            lineWidth -= k1Var.f620q;
                        }
                        float f41 = lineWidth;
                        int g10 = s1Var5.g();
                        int i20 = s1Var5.a2;
                        if (i20 >= 0 && i20 != g10 && !t1Var2.f23009kd) {
                            t1Var2.t1(i20, g10, z10);
                        }
                        boolean z27 = t1Var2.f23009kd;
                        if (z27) {
                            g10 = t1Var2.f22965hd;
                        }
                        boolean z28 = (g10 & 4) != 0;
                        boolean z29 = (g10 & 8) != 0;
                        if (z27) {
                            int i21 = t1Var2.f22980id;
                            if ((i21 & 4) != 0) {
                                i15 = i21;
                                z26 = true;
                            } else {
                                i15 = i21;
                                z26 = false;
                            }
                            float f43 = i17;
                            s1Var4 = s1Var5;
                            f21 = f41;
                            boolean z30 = z28;
                            c10 = 7;
                            i12 = i17;
                            boolean z31 = (i15 & 8) != 0;
                            t1Var2.L1(canvas2, z26, z31, f27, f31, f43, f33, 1.0f - t1Var2.f22994jd, z11);
                            boolean z32 = z26;
                            boolean z33 = z29;
                            t1Var2.L1(canvas, z30, z33, f27, f31, f43, f33, t1Var2.f22994jd, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z30;
                            f23 = f31;
                            if (!t1Var2.f23205y7.isOutOwner()) {
                                if (!z32 && !z31) {
                                    t1Var2.p2(canvas, f23, f43, f22, 1.0f - t1Var2.f22994jd, z11);
                                }
                                if (!z25 && !z33) {
                                    t1Var2.p2(canvas, f23, f43, f22, t1Var2.f22994jd, z11);
                                }
                            }
                        } else {
                            s1Var4 = s1Var5;
                            f21 = f41;
                            boolean z34 = z28;
                            boolean z35 = z29;
                            c10 = 7;
                            i12 = i17;
                            if (!t1Var2.f23205y7.isOutOwner() && !z34 && !z35) {
                                t1Var2.p2(canvas, f31, i12, f33, 1.0f, z11);
                            }
                            t1Var2 = this;
                            t1Var2.L1(canvas, z34, z35, f27, f31, i12, f33, 1.0f, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z34;
                            f23 = f31;
                        }
                        if (t1Var2.f23205y7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f23, i12, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var4;
                        s1Var5.a2 = s1Var4.g();
                        if (z25 && z10 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f44 = f30 + f20;
                    t1Var2.f23034mb = f44;
                    float dp9 = (f34 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    t1Var2.nb = dp9;
                    canvas2.translate(f44, dp9);
                    wh.h.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.j6.T2.setAlpha(255);
                    z12 = z24;
                    c11 = 2;
                } else {
                    y3Var = y3Var2;
                    c10 = 7;
                    if (t1Var2.f23205y7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (t1Var2.K8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(t1Var2.f22990j9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f45 = -staticLayout.getLineLeft(0);
                    if (t1Var2.f23205y7.shouldDrawReactions() && k1Var.f607b) {
                        t1Var2.t4();
                        k1Var.D = 0.0f;
                        k1Var.E = false;
                        k1Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((ChatObject.isChannel(t1Var2.Zb) && !t1Var2.Zb.megagroup) || (t1Var2.f23205y7.messageOwner.flags & 1024) != 0 || t1Var2.Vb != null || s1Var5.F || t1Var2.Y7 || s1Var5.B) {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        if (k1Var.f607b && !k1Var.f622s) {
                            lineWidth2 -= k1Var.f620q;
                        }
                        float f46 = lineWidth2;
                        int g11 = s1Var5.g();
                        int i22 = s1Var5.a2;
                        if (i22 >= 0 && i22 != g11 && !t1Var2.f23009kd) {
                            t1Var2.t1(i22, g11, z10);
                        }
                        boolean z36 = t1Var2.f23009kd;
                        if (z36) {
                            g11 = t1Var2.f22965hd;
                        }
                        boolean z37 = (g11 & 4) != 0;
                        boolean z38 = (g11 & 8) != 0;
                        if (z36) {
                            int i23 = t1Var2.f22980id;
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
                            s1Var = s1Var5;
                            t1Var2.L1(canvas2, z14, z39, f27, f47, f48, f29, 1.0f - t1Var2.f22994jd, z11);
                            boolean z40 = z14;
                            boolean z41 = z39;
                            boolean z42 = z37;
                            boolean z43 = z38;
                            t1Var2.L1(canvas, z42, z43, f27, f47, f48, f29, t1Var2.f22994jd, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z42;
                            f23 = f47;
                            if (!t1Var2.f23205y7.isOutOwner()) {
                                if (!z40 && !z41) {
                                    t1Var2.p2(canvas, f23, f48, f13, 1.0f - t1Var2.f22994jd, z11);
                                }
                                if (!z13 && !z43) {
                                    t1Var2.p2(canvas, f23, f48, f13, t1Var2.f22994jd, z11);
                                }
                            }
                        } else {
                            s1Var = s1Var5;
                            boolean z44 = z37;
                            boolean z45 = z38;
                            if (!t1Var2.f23205y7.isOutOwner() && !z44 && !z45) {
                                t1Var2.p2(canvas, f23, i12, f29, 1.0f, z11);
                            }
                            t1Var2 = this;
                            float f49 = f23;
                            t1Var2.L1(canvas, z44, z45, f27, f49, i12, f29, 1.0f, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z44;
                            f23 = f49;
                        }
                        if (t1Var2.f23205y7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f23, i12, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var;
                        s1Var5.a2 = s1Var.g();
                        if (z13 && z10 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f45 = f46;
                    }
                    canvas2.save();
                    if (s1Var5.T0 && s1Var5.K1 != 1.0f) {
                        if (s1Var5.U0 != null) {
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((t1Var2.F || t1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha5 * s1Var5.K1));
                            s1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha5);
                            wh.h.f(canvas2, s1Var5.V0);
                            c11 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i12;
                            canvas2.translate(s1Var5.f22737g1 + f45, ((f27 - AndroidUtilities.dp((t1Var2.F || t1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            c11 = 2;
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0f - s1Var5.K1) * f51));
                            wh.h.f(canvas2, s1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((t1Var2.F || t1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (f51 * s1Var5.K1));
                            wh.h.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha6);
                        }
                    } else {
                        c11 = 2;
                        float f52 = f30 + f45;
                        t1Var2.f23034mb = f52;
                        float dp10 = ((f27 - AndroidUtilities.dp((t1Var2.F || t1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        t1Var2.nb = dp10;
                        canvas2.translate(f52, dp10);
                        wh.h.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = false;
                }
                int i24 = i12;
                if (t1Var2.f23205y7.isOutOwner()) {
                    int g12 = s1Var5.g();
                    int i25 = s1Var5.a2;
                    if (i25 >= 0 && i25 != g12 && !t1Var2.f23009kd) {
                        t1Var2.t1(i25, g12, z10);
                    }
                    if (t1Var2.f23009kd) {
                        g12 = t1Var2.f22965hd;
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
                        s1Var2 = s1Var5;
                        z16 = true;
                    } else {
                        s1Var2 = s1Var5;
                        z16 = false;
                    }
                    boolean z47 = (g12 & 8) != 0;
                    if (t1Var2.f23078pe != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, t1Var2.f23078pe);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (t1Var2.f23009kd) {
                        int i26 = t1Var2.f22980id;
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
                            s1Var3 = s1Var2;
                            str = "paintChatTimeBackground";
                            boolean z49 = z18;
                            z16 = z20;
                            i13 = 0;
                            f15 = 0.0f;
                            t1Var2.l2(canvas2, z49, z46, z16, z22, f16, z12, i24, f27, t1Var2.f22994jd, true, z11);
                        } else {
                            s1Var3 = s1Var2;
                            str = "paintChatTimeBackground";
                            boolean z50 = z18;
                            i13 = 0;
                            f15 = 0.0f;
                            float f53 = i24;
                            t1Var2.l2(canvas, z19, z48, z21, z23, f16, z12, f53, f27, 1.0f - t1Var2.f22994jd, false, z11);
                            z16 = z20;
                            t1Var2.l2(canvas, z50, z46, z16, z22, f16, z12, f53, f27, t1Var2.f22994jd, false, z11);
                        }
                        t1Var = this;
                        canvas2 = canvas;
                    } else {
                        s1Var3 = s1Var2;
                        str = "paintChatTimeBackground";
                        i13 = 0;
                        f15 = 0.0f;
                        canvas2 = canvas;
                        l2(canvas2, z15, z46, z16, z47, f16, z12, i24, f27, 1.0f, false, z11);
                        t1Var = this;
                    }
                    if (z17) {
                        canvas2.restore();
                    }
                    s1Var3.a2 = s1Var3.g();
                    if (z10 && z16 && t1Var.getParent() != null) {
                        ((View) t1Var.getParent()).invalidate();
                    }
                } else {
                    t1Var = t1Var2;
                    str = "paintChatTimeBackground";
                    i13 = 0;
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (t1Var.Mb != null) {
                    if (t1Var.Kb == f15 || t1Var.Lb == f15) {
                        t1Var.s0();
                    }
                    Path path3 = t1Var.Qb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(y3Var.getImageX(), y3Var.getImageY(), y3Var.getImageX2(), y3Var.getImageY2());
                    int[] roundRadius2 = y3Var.getRoundRadius();
                    float f54 = roundRadius2[i13];
                    float[] fArr = t1Var.Rb;
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
                    rectF2.set(t1Var.Kb - AndroidUtilities.dp(12.0f), t1Var.Lb - AndroidUtilities.dp(8.0f), t1Var.Kb + org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + t1Var.Mb.getWidth() + AndroidUtilities.dp(12.0f), t1Var.Lb + t1Var.Mb.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (t1Var.Fb == null) {
                        if (t1Var.Pb == null) {
                            t1Var.Pb = new wh.h();
                        }
                        t1Var.Pb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        t1Var.Pb.setBounds((int) y3Var.getImageX(), (int) y3Var.getImageY(), (int) y3Var.getImageX2(), (int) y3Var.getImageY2());
                        t1Var.Pb.draw(canvas2);
                    }
                    t1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, t1Var.getWidth(), t1Var.getHeight(), (int) (t1Var.Jb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.j6.f20749i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20749i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.j6.f20749i2);
                    org.telegram.ui.ActionBar.j6.f20749i2.setAlpha(alpha7);
                    canvas.translate(t1Var.Kb + AndroidUtilities.dp(4.0f), t1Var.Lb);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.L3;
                    drawable.setBounds(i13, i13, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.j6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.j6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), 0.0f);
                    wh.h.f(canvas, t1Var.Mb);
                    canvas.restore();
                    if (t1Var.L2 != null && y3Var.getVisible() && t1Var.f23013l3 == 0) {
                        int i27 = SharedConfig.bubbleRadius;
                        if (i27 > 2) {
                            dp = AndroidUtilities.dp(i27 - 2);
                            z12 = SharedConfig.bubbleRadius >= 10;
                        } else {
                            dp = AndroidUtilities.dp(i27);
                        }
                        int imageX = (int) (y3Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (y3Var.getImageY() + AndroidUtilities.dp(6.0f));
                        rectF.set(imageX - AndroidUtilities.dp(4.0f), imageY - AndroidUtilities.dp(1.5f), AndroidUtilities.dp(z12 ? 2.0f : 0.0f) + AndroidUtilities.dp(4.0f) + t1Var.f23067p2 + imageX, AndroidUtilities.dp(1.5f) + t1Var.L2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, t1Var.M2(str));
                        canvas.save();
                        if (z12) {
                            i13 = 2;
                        }
                        canvas.translate(imageX + i13, imageY);
                        wh.h.f(canvas, t1Var.L2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f23220z7 != null) {
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
        MessageObject messageObject = this.f23205y7;
        int i15 = messageObject.type;
        s1 s1Var = this.Zc;
        int i16 = 0;
        boolean z10 = true;
        if (i15 != 1 && i15 != 20 && this.K1 != 4 && i15 != 8 && i15 != 23) {
            float f12 = 43.0f;
            float f13 = 11.0f;
            float f14 = 0.0f;
            float f15 = 10.0f;
            if (this.f22969i2) {
                int i17 = this.f23162v8;
                if (!messageObject.isOutOwner()) {
                    f13 = 17.0f;
                }
                this.f23069p4 = AndroidUtilities.dp(f13) + i17 + this.f23055o4;
                int i18 = this.f23110s0 - this.f23098r4;
                if (this.I) {
                    f15 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f15)) - this.f23025m2) - AndroidUtilities.dp(17.0f);
                if (this.f22990j9 && this.f23149ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f12);
                this.f23083q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            } else {
                if (this.f23091qd) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f23205y7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f23069p4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f23162v8;
                    if (!messageObject.isOutOwner() && !this.f23004k8 && !this.J) {
                        f13 = 17.0f;
                    }
                    this.f23069p4 = AndroidUtilities.dp(f13) + i19 + this.f23055o4;
                }
                int i20 = this.f23110s0 - this.f23098r4;
                if (this.I) {
                    f11 = 9.0f;
                } else {
                    f11 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f11);
                if (this.f22990j9 && this.f23149ua != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f12);
                ah.k1 k1Var = this.N;
                if (!k1Var.f622s && !k1Var.f607b) {
                    if (this.f23205y7.type == 9 && this.L == null) {
                        f14 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f14) + k1Var.f619p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f23083q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, y3());
            }
        } else {
            if (s1Var.f22731f0) {
                f7 = s1Var.m0;
                f10 = s1Var.f22767n0;
                imageHeight = s1Var.f22775p0;
            } else {
                bi.y3 y3Var = this.S0;
                float imageX = y3Var.getImageX();
                float imageY = y3Var.getImageY();
                imageHeight = y3Var.getImageHeight();
                f7 = imageX;
                f10 = imageY;
            }
            this.f23069p4 = f7 + AndroidUtilities.dp(5.0f) + this.f23055o4;
            dp = f10 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f22888c4;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f23083q4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), y3()) + f10;
            z10 = false;
        }
        this.f23069p4 += getExtraTextX();
        MessageObject messageObject2 = this.f23205y7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f23205y7.isSponsored()) {
            if (z10 && this.N1) {
                this.f23083q4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f22929f2);
            }
            if (z10) {
                i12 = AndroidUtilities.dp(14.0f) + this.f22929f2;
            } else {
                i12 = 0;
            }
            float f16 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f22888c4;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(s1Var);
            }
            this.f23079q0 = (int) ((f16 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), y3())) - s1Var.f22750j0);
        }
        MessageObject messageObject3 = this.f23205y7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f23083q4 += this.f22933f6;
        }
    }

    public final void o0() {
        pr prVar;
        boolean z10 = this.f23024m1;
        if (z10 || this.f23040n1) {
            if ((z10 && this.f23052o1 == 1.0f) || (!z10 && this.f23052o1 == 0.0f)) {
                this.f23040n1 = false;
            }
            if (z10) {
                prVar = pr.f29467g;
            } else {
                prVar = pr.f29468i;
            }
            this.f23080q1 = (int) Math.ceil(prVar.getInterpolation(this.f23052o1) * AndroidUtilities.dp(35.0f));
            if (this.f23205y7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f23080q1 = 0;
                }
            }
            if (!this.f23205y7.isOutOwner() || this.f23205y7.hasWideCode) {
                y4();
            }
            if (this.f23040n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f23066p1;
                this.f23066p1 = elapsedRealtime;
                if (this.f23024m1) {
                    float f7 = (((float) j3) / 200.0f) + this.f23052o1;
                    this.f23052o1 = f7;
                    if (f7 > 1.0f) {
                        this.f23052o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f23052o1 - (((float) j3) / 200.0f);
                    this.f23052o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f23052o1 = 0.0f;
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
            this.f23068p3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.f22887c3;
            if (charSequence == null) {
                int i11 = this.f22873b3;
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
                            TL_stars.StarGift starGift = this.De;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.I7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z10 = false;
                                } else {
                                    if (this.De.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new nq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
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
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f23205y7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f23205y7.isSponsored() && this.J8 < (measureText = (int) (org.telegram.ui.ActionBar.j6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
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
            int i13 = this.f22873b3;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.f23068p3 = i12 - AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f23110s0;
            this.f23110s0 = dp2;
            if (this.f23205y7.type == 12) {
                this.f23110s0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f23205y7.isSponsored()) {
                this.f23110s0 = AndroidUtilities.dp(2.0f) + this.f23110s0;
            }
            StaticLayout staticLayout2 = this.O2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f23068p3 - Math.ceil(this.O2.getLineWidth(0)))) / 2;
                if (this.f22873b3 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f23042n3 = ceil + i10;
                int lineLeft = (int) this.O2.getLineLeft(0);
                this.f23054o3 = lineLeft;
                this.f23042n3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f23044n5 > 0.0f) {
            bi.y3 y3Var = this.S0;
            if (y3Var.getVisible()) {
                MessageObject messageObject2 = this.f23205y7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f23205y7.getVideoStartsTimestamp() / ((float) this.f23205y7.getDuration());
                } else {
                    videoSavedProgress = this.f23205y7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = y3Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(y3Var.getImageX(), y3Var.getImageY(), y3Var.getImageX2(), y3Var.getImageY2());
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
                        rectF.set(y3Var.getImageX(), y3Var.getImageY(), y3Var.getImageX2(), y3Var.getImageY2());
                        this.Hb.addRoundRect(rectF, this.Ib, Path.Direction.CW);
                        canvas.clipPath(this.Hb);
                    }
                    org.telegram.ui.ActionBar.j6.f20842n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f23044n5 * 0.35f, -1));
                    canvas.drawRect(y3Var.getImageX(), y3Var.getImageY2() - AndroidUtilities.dp(3.0f), y3Var.getImageX2(), y3Var.getImageY2(), org.telegram.ui.ActionBar.j6.f20842n2);
                    org.telegram.ui.ActionBar.j6.f20842n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f23044n5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(y3Var.getImageX() - AndroidUtilities.dp(2.0f), y3Var.getImageY2() - AndroidUtilities.dp(3.0f), (y3Var.getImageWidth() * clamp01) + y3Var.getImageX(), y3Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20842n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f23091qd && this.f23107rd) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f23205y7 != null) {
            int i10 = this.I7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f23205y7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f23205y7.getDialogId() == clientUserId || this.f23205y7.getDialogId() == 1271266957)) {
                this.Zb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f23205y7.getDialogId() == 489000) {
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
                    if (this.f23205y7.isSavedFromMegagroup()) {
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
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f23205y7.getDialogId() == clientUserId)) {
                this.Yb = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f23205y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Yb = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f23205y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Yb = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f23205y7.getDialogId();
                long fromChatId = this.f23205y7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f23205y7.getDialogId())) {
                    if (this.f23205y7.isOutOwner()) {
                        this.Yb = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f23205y7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Yb = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f23205y7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Yb = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f23205y7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Zb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Zb = chat;
                } else {
                    TLRPC.Message message = this.f23205y7.messageOwner;
                    if (message.post) {
                        this.Zb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && imageReceiver == this.S0 && messageObject.isAnimatedSticker()) {
            this.Jc.F1(this.f23205y7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        t1 t1Var;
        float f7;
        float f10;
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.I7).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.f23205y7;
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
        org.telegram.ui.Components.k9 k9Var = this.X3;
        if (k9Var != null) {
            k9Var.g();
        }
        rh.g gVar = this.f22876b6;
        if (gVar != null) {
            gVar.a();
        }
        rh.g gVar2 = this.f22890c6;
        if (gVar2 != null) {
            gVar2.a();
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r1) obj).q();
        }
        MessageObject messageObject2 = this.f23220z7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            t1Var = this;
            t1Var.V3(messageObject2, this.A7, this.C7, this.B7, this.D7, this.E7);
            t1Var.f23220z7 = null;
            t1Var.A7 = null;
        } else {
            t1Var = this;
        }
        CheckBoxBase checkBoxBase = t1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f23902l = true;
        }
        CheckBoxBase checkBoxBase2 = t1Var.f22997k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23902l = true;
        }
        a21 a21Var = t1Var.f22913e0;
        if (a21Var != null) {
            a21Var.a();
        }
        CheckBoxBase checkBoxBase3 = t1Var.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23902l = true;
        }
        if (t1Var.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = t1Var.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f23902l = true;
                i11++;
            }
        }
        t1Var.M0 = true;
        float f11 = 0.0f;
        t1Var.f23227ze = 0.0f;
        t1Var.f23212ye = 0.0f;
        t1Var.f23080q1 = 0;
        y4();
        ImageReceiver imageReceiver = t1Var.f23032m9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        F0();
        MessageObject messageObject3 = t1Var.f23205y7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = t1Var.K1;
        if (i12 == 4 && t1Var.f23046n7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(t1Var.f23205y7);
            t1Var.D1 = isPlayingMessage;
            if (isPlayingMessage) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            t1Var.F1 = f10;
            t1Var.E1 = 0;
        } else {
            t1Var.D1 = false;
            t1Var.F1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && t1Var.f23214z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            t1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().q2() != null) {
            r9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == q22.f21800w) {
                q22.W = t1Var;
            }
        }
        if (t1Var.K1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(t1Var.f23205y7)) {
                f11 = 1.0f;
            }
            t1Var.f23050nd = f11;
        }
        ah.k1 k1Var = t1Var.N;
        ArrayList arrayList2 = k1Var.v;
        k1Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((ah.h1) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = t1Var.f22924ed;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        j4 j4Var = t1Var.F7;
        if (j4Var != null) {
            ArrayList arrayList3 = j4Var.f22159c;
            if (!j4Var.C) {
                j4Var.C = true;
                wh.g gVar3 = j4Var.f22166l;
                if (gVar3 != null) {
                    gVar3.b(j4Var.f22157a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    i4 i4Var = (i4) arrayList3.get(i14);
                    if (!i4Var.M) {
                        i4Var.M = true;
                        i4Var.f22086f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = t1Var.f23205y7;
        if (messageObject4 != null && messageObject4.type == 20 && t1Var.Mb != null) {
            invalidate();
        }
        org.telegram.ui.Components.o5 o5Var = t1Var.f22938fc;
        if (o5Var != null) {
            o5Var.a();
        }
        org.telegram.ui.Components.o5 o5Var2 = t1Var.gc;
        if (o5Var2 != null) {
            o5Var2.a();
        }
        wh.g gVar4 = t1Var.Fb;
        if (gVar4 != null) {
            if (gVar4.f48608i) {
                wh.g w32 = w3();
                t1Var.Fb = w32;
                Integer num = t1Var.Gb;
                if (num != null) {
                    w32.f48610k.put(this, num);
                }
            } else {
                gVar4.a(this);
            }
        }
        o0 o0Var = t1Var.v;
        if (o0Var != null) {
            ArrayList arrayList4 = o0Var.f22394q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((n0) arrayList4.get(i15)).a();
            }
        }
        ax0 ax0Var = t1Var.f22914e1;
        if (ax0Var != null) {
            for (int i16 = 0; i16 < ax0Var.f24466b; i16++) {
                ax0Var.f24467c[i16].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        int i10 = this.I7;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
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
            checkBoxBase.f23902l = false;
        }
        rh.g gVar = this.f22876b6;
        if (gVar != null) {
            gVar.f45621b.onDetachedFromWindow();
            gVar.f45635x.f();
        }
        rh.g gVar2 = this.f22890c6;
        if (gVar2 != null) {
            gVar2.f45621b.onDetachedFromWindow();
            gVar2.f45635x.f();
        }
        yf.n nVar = this.f23188x4;
        if (nVar != null) {
            nVar.b();
            this.f23188x4 = null;
        }
        RichMessageLayout richMessageLayout = this.f23205y7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        s1 s1Var = this.Zc;
        RichMessageLayout richMessageLayout2 = s1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((r1) obj).r();
        }
        org.telegram.ui.Components.k9 k9Var = this.X3;
        if (k9Var != null) {
            k9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f22997k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f23902l = false;
        }
        if (this.R8 != null) {
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.R8;
                if (i12 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i12].f23902l = false;
                i12++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f23902l = false;
        }
        this.M0 = false;
        j4 j4Var = this.F7;
        if (j4Var != null) {
            j4Var.e();
        }
        this.f23032m9.onDetachedFromWindow();
        a21 a21Var = this.f22913e0;
        if (a21Var != null) {
            a21Var.b();
        }
        F0();
        if (this.G4 && this.E4 != null && this.F4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.E4);
            this.G4 = false;
        }
        ax0 ax0Var = this.f22914e1;
        if (ax0Var != null) {
            ax0Var.a(this);
        }
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().q2() != null) {
            r9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == q22.f21800w) {
                q22.W = null;
            }
        }
        s1Var.f22798v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
            org.telegram.ui.ActionBar.j6.x0().f28093i = null;
        }
        ValueAnimator valueAnimator = this.f23022ld;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f23022ld.cancel();
        }
        this.N.q();
        this.f23009kd = false;
        FlagSecureReason flagSecureReason = this.f22924ed;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.o5 o5Var = this.f22938fc;
        if (o5Var != null) {
            o5Var.b();
        }
        org.telegram.ui.Components.o5 o5Var2 = this.gc;
        if (o5Var2 != null) {
            o5Var2.b();
        }
        wh.g gVar3 = this.Fb;
        if (gVar3 != null) {
            gVar3.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f22394q;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                n0 n0Var = (n0) arrayList2.get(i13);
                int i14 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f22317c;
                    if (i14 < imageReceiverArr.length) {
                        imageReceiverArr[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
            }
        }
        yf.h.d().f(this.f22995je);
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
                SparseArray sparseArray = this.f23077pd;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        t1 t1Var;
        int i12;
        MessageObject messageObject = this.f23205y7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.V4 == AndroidUtilities.displaySize.y)) {
            t1Var = this;
        } else {
            this.f23213z0 = true;
            MessageObject messageObject2 = this.f23205y7;
            this.f23205y7 = null;
            t1Var = this;
            t1Var.X3(messageObject2, this.K, this.F, this.E, this.G, false);
            t1Var.f23213z0 = false;
        }
        w4();
        int i13 = t1Var.V + t1Var.f22927f0 + t1Var.f22953h0 + t1Var.f23110s0 + t1Var.f23139u0 + t1Var.f22898d0;
        ih.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(t1Var.f23205y7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f12299a.getHeight() - draftMessageMeasureController.f12299a.getPaddingTop()) - draftMessageMeasureController.f12299a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f12302e = z10;
            if (draftMessageMeasureController.f12300b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        t1Var.f23037me = Math.max(0, i12 - i13);
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
        this.f23205y7.loadedFileSize = j3;
        p1(j3, j10);
        if (this.f23185x1) {
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
        this.f23205y7.loadedFileSize = j3;
        RadialProgress2 radialProgress2 = this.O0;
        radialProgress2.o(min, true);
        if (j3 == j10 && ((this.L != null || this.f23205y7.isPaid()) && SendMessagesHelper.getInstance(this.I7).isSendingMessage(this.f23205y7.getId()) && ((i10 = this.O4) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.Q0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j11 = this.f23200y1;
        if (j11 > 0 && Math.abs(j11 - j10) > 1048576) {
            this.f23200y1 = j10;
        }
        p1(j3, j10);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f23118s8 && Build.VERSION.SDK_INT >= 23) {
            MessageObject messageObject = this.f23205y7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f23205y7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f23205y7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f23205y7.caption);
            }
        }
    }

    @Override
    public final void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0() {
        q0(getX(), this.Sc, getMeasuredWidth(), this.Tc);
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.p1(long, long):void");
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
        s1 s1Var;
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
        ah.k1 k1Var = this.N;
        if (k1Var.f607b) {
            f13 = k1Var.j(1.0f);
        } else {
            f13 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.j6.T2.getAlpha();
        float N2 = N2(f10);
        StaticLayout staticLayout = this.Vb;
        s1 s1Var2 = this.Zc;
        if (staticLayout == null && !s1Var2.F) {
            s1Var = s1Var2;
            z15 = z11;
            f17 = f22;
            f14 = 10.0f;
            f18 = 2.0f;
            d = 1.0d;
        } else {
            boolean z18 = s1Var2.f22741h1;
            f14 = 10.0f;
            if (z18) {
                f15 = this.f23105rb;
            } else {
                f15 = f11;
            }
            float f23 = f15 + f13;
            d = 1.0d;
            boolean z19 = s1Var2.F;
            if (z19 && s1Var2.H == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && s1Var2.H != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z19 && s1Var2.H != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f23091qd || !s1Var2.l1) && z18 && !z12) {
                if (z13) {
                    f23 = s1Var2.I;
                } else {
                    float f24 = s1Var2.I;
                    float f25 = s1Var2.K1;
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
            if (s1Var2.f22802w0) {
                f23 += this.f23227ze;
            }
            if (f4()) {
                if (this.f23205y7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.j6.f20624b4;
                }
            } else if (!this.f23205y7.isOutOwner()) {
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
                f16 = s1Var2.K1 * f22;
            } else if (z13) {
                f16 = (1.0f - s1Var2.K1) * f22;
            } else {
                f16 = f22;
            }
            L2.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f21, f21, org.telegram.messenger.w1.a(AndroidUtilities.dp(3.0f) + n11, this.Wb, 2.0f, f23), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (s1Var2.F) {
                if (z14) {
                    canvas.save();
                    f17 = f22;
                    f18 = 2.0f;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0d - s1Var2.K1) * alpha));
                    canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
                    s1Var = s1Var2;
                    s1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    s1Var = s1Var2;
                    f17 = f22;
                    f18 = 2.0f;
                }
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * f16));
            } else {
                s1Var = s1Var2;
                f17 = f22;
                f18 = 2.0f;
            }
            canvas.save();
            canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Vb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = s1Var.H;
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
            if (s1Var.F) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            s1Var.J = f23;
        }
        if (this.Sb != null) {
            boolean z20 = s1Var.f22741h1;
            if (z20) {
                f20 = this.f23105rb;
            } else {
                f20 = f11;
            }
            float f26 = f20 + f13;
            if ((!this.f23091qd || !s1Var.l1) && z20) {
                float f27 = s1Var.K;
                float f28 = s1Var.K1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.K;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f26 += transitionParams2.offsetRight;
                }
            }
            if (s1Var.f22802w0) {
                f26 += this.f23227ze;
            }
            if (f4()) {
                if (this.f23205y7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.j6.f20604a4;
                }
            } else if (!this.f23205y7.isOutOwner()) {
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
            if (s1Var.f22723d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((d - s1Var.K1) * alpha));
                canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
                wh.h.f(canvas, s1Var.f22723d2);
                canvas.restore();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * s1Var.K1));
            }
            canvas.save();
            canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
            wh.h.f(canvas, this.Sb);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f13 += this.Tb + n12 + AndroidUtilities.dp(f14);
            if (s1Var.f22723d2 != null) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            s1Var.L = f26;
        }
        boolean z21 = this.Y7;
        if (!z21 && !s1Var.B) {
            return;
        }
        boolean z22 = s1Var.f22741h1;
        if (z22) {
            f19 = this.f23105rb;
        } else {
            f19 = f11;
        }
        float f29 = f19 + f13;
        boolean z23 = s1Var.B;
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
        if (!this.f23091qd && z22 && !z16) {
            if (z17) {
                f29 = s1Var.D;
            } else {
                float f30 = s1Var.D;
                float f31 = s1Var.K1;
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
        if (s1Var.f22802w0) {
            f29 += this.f23227ze;
        }
        if (f4()) {
            if (this.f23205y7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.j6.Z3;
            }
        } else if (!this.f23205y7.isOutOwner()) {
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
        if (s1Var.B) {
            if (this.Y7) {
                L22.setAlpha((int) (f17 * 255.0f * s1Var.K1));
                n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - s1Var.K1) * f17 * 255.0f));
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
        s1Var.C = f29;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f22924ed == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new la(this, 3));
                this.f22924ed = flagSecureReason;
                if (this.M0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f22924ed;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        t1 t1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        k1 k1Var = this.Jc;
        int i11 = 0;
        if (k1Var != null && k1Var.m2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f23205y7.type == 16) {
                this.Jc.y0(this, this.S4, this.T4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i10 == R.id.acc_action_small_button) {
            w1();
        } else if (i10 == R.id.acc_action_msg_options) {
            k1 k1Var2 = this.Jc;
            if (k1Var2 != null) {
                if (this.f23205y7.type == 16) {
                    k1Var2.p0(this, 0.0f, 0.0f);
                } else {
                    k1Var2.y0(this, this.S4, this.T4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                k1 k1Var3 = this.Jc;
                if (k1Var3 != null) {
                    TLRPC.Chat chat = this.f22993jc;
                    if (chat != null) {
                        t1Var = this;
                        k1Var3.S(t1Var, chat, this.f23205y7.messageOwner.fwd_from.channel_post, this.f22941g1, this.f22954h1, false);
                    } else {
                        t1Var = this;
                        TLRPC.User user = t1Var.f22964hc;
                        if (user != null) {
                            k1Var3.s0(this, user, t1Var.f22941g1, t1Var.f22954h1);
                        } else if (t1Var.f23008kc != null) {
                            k1Var3.n(this);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    k1 k1Var4 = t1Var.Jc;
                    if (k1Var4 != null) {
                        k1Var4.F0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && t1Var.Jc != null && (arrayList = t1Var.f23205y7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            t1Var.Jc.I(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!t1Var.f23205y7.isVoice() || t1Var.f23205y7.isRoundVideo() || (t1Var.f23205y7.isMusic() && MediaController.getInstance().isPlayingMessage(t1Var.f23205y7))) && t1Var.I5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        t1Var = this;
        if (!t1Var.f23205y7.isVoice()) {
        }
        return true;
    }

    public final void q0(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Id;
        if (f6Var != null) {
            f6Var.l(f7, f10 + this.V + this.f22927f0 + this.f22953h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10 + this.V + this.f22927f0 + this.f22953h0, i10, i11);
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
            p1(this.f23205y7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f7, Runnable runnable) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        boolean z10;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.O0;
            RectF rectF = radialProgress2.f24070a;
            Paint paint = radialProgress2.f24075g;
            t90 t90Var = radialProgress2.f24076i;
            RectF rectF2 = radialProgress2.f24070a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                f5Var = this.f23147u8;
            } else {
                f5Var = this.f23133t8;
            }
            t90Var.B = f5Var;
            radialProgress2.f24077j.B = f5Var;
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
                if (this.f22857a1 == null) {
                    xi0 xi0Var = new xi0(R.raw.fire_once, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.f22857a1 = xi0Var;
                    xi0Var.f32578v0 = this;
                    xi0Var.H(true);
                    this.f22857a1.I(1);
                    this.f22857a1.start();
                }
                this.f22857a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f22871b1 == null) {
                    i10 = 1;
                    this.f22871b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f22885c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f22885c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f22899d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f22899d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f24088u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(i12, this.Id);
                } else {
                    i11 = radialProgress2.f24081n;
                }
                this.f22871b1.setColor(i11);
                this.f22899d1.setColor(i11);
                t90Var.a(false);
                this.f22871b1.setShader(t90Var.d.getShader());
                this.f22899d1.setShader(t90Var.d.getShader());
                rectF3.set(this.f22857a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                rectF3.inset(1.0f, 1.0f);
                canvas2.drawRect(rectF3, this.f22871b1);
                this.f22857a1.o(canvas, this.f22885c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f22899d1.setAlpha((int) (255.0f * f11));
                this.f22899d1.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.f22889c5;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                io0 io0Var = this.H5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - io0Var.K) * (-360.0f), false, this.f22899d1);
                if (this.S6 == null) {
                    this.S6 = new w11();
                }
                this.S6.a((1.0f - io0Var.K) * (-360.0f), f11, canvas, this.f22899d1, rectF4);
                canvas2 = canvas;
            } else {
                xi0 xi0Var2 = this.f22857a1;
                if (xi0Var2 != null) {
                    xi0Var2.A(true);
                    this.f22857a1 = null;
                    if (this.S6 != null) {
                        this.S6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f7 * 1.5f) + 10.0f) * f7, this.Z0);
            canvas2.restore();
            if (this.Y0 == null) {
                di.l lVar = new di.l(3);
                this.Y0 = lVar;
                lVar.e(-1, 0, 0);
                di.l lVar2 = this.Y0;
                lVar2.f7498i = 14.0f;
                lVar2.c(10.0f);
                this.Y0.f7492a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z10 = true;
                this.Y0.d(1, false, false);
                this.Y0.f7499j = -AndroidUtilities.dpf2(0.33f);
                this.Y0.f7500k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = true;
            }
            di.l lVar3 = this.Y0;
            lVar3.f7498i = f7 * 14.0f;
            lVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f7, paint);
            di.l lVar4 = this.Y0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z10 = false;
            }
            lVar4.b(z10);
            di.l lVar5 = this.Y0;
            lVar5.f7503n = cos;
            lVar5.f7504o = sin;
            lVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.G8 && (messageObject = this.f23205y7) != null && !messageObject.isOutOwner() && this.L == null) {
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
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null) {
            g1 g1Var = this.Hd;
            if (g1Var != null && g1Var.rewindCount != 0 && g1Var.rewindByBackSeek) {
                messageObject.audioProgress = g1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f23205y7.isPoll()) {
                rh.g gVar = this.f22876b6;
                if (gVar != null) {
                    gVar.n(true);
                }
                rh.g gVar2 = this.f22890c6;
                if (gVar2 != null) {
                    gVar2.n(true);
                }
            }
            int i10 = this.K1;
            double d12 = 0.0d;
            e1 e1Var = this.G5;
            if (i10 == 4) {
                if (e1Var != null) {
                    e1Var.a();
                }
                if (this.f23143u4 == null || (!PhotoViewer.J1(this.f23205y7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f23205y7))) {
                    org.telegram.ui.Components.d6 animation = this.S0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f23205y7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f23205y7.isVideo() && animation.s()) {
                            this.Jc.N(this.f23205y7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f23205y7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
                        d11 -= this.f23205y7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Jc != null && animation.o() >= 3000) {
                            this.Jc.w0();
                        }
                    }
                    if (this.Q5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(formatShortDuration2));
                        this.f23143u4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.j6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.Q5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f23091qd;
            io0 io0Var = this.H5;
            int i12 = 0;
            if (z12) {
                if (this.F5) {
                    if (!io0Var.f27212f) {
                        io0Var.g(this.f23205y7.audioProgress, true);
                    }
                } else {
                    if (!e1Var.f24757e) {
                        e1Var.i(this.f23205y7.audioProgress);
                        e1Var.f24768q = this.f23205y7.bufferedProgress;
                    }
                    e1Var.a();
                }
                TLRPC.Document document = this.f23205y7.getDocument();
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
                } else if (MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
                    d10 = Math.max(0.0d, d10 - this.f23205y7.audioProgressSec);
                }
                if (this.Q5 != d10) {
                    this.Q5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.T2.measureText(formatLongDuration));
                    this.P5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.j6.T2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.f23205y7.audioProgress;
                if (f7 != 0.0f) {
                    this.Cd = f7;
                    if (f7 > 0.9f) {
                        this.Cd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.F5) {
                    if (!io0Var.f27212f) {
                        io0Var.g(this.f23205y7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!e1Var.f24757e) {
                        e1Var.i(this.f23205y7.audioProgress);
                        e1Var.f24768q = this.f23205y7.bufferedProgress;
                    }
                    e1Var.k(this.f23205y7);
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
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
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
                        d = this.f23205y7.audioProgressSec;
                    }
                    if (this.Q5 != d) {
                        this.Q5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(formatLongDuration2));
                        this.P5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.j6.N2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f23205y7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
                        i12 = this.f23205y7.audioProgressSec;
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
        if (this.f23205y7.isSponsored()) {
            this.J8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        ah.k1 k1Var = this.N;
        if (!k1Var.f622s && !k1Var.f607b) {
            lastLineWidth = k1Var.f624u;
        } else {
            lastLineWidth = this.f23205y7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!k1Var.f622s && !k1Var.f607b) {
            z10 = (i10 - lastLineWidth < i11 || this.f23205y7.hasRtl) ? true : true;
            if (this.f22998k2) {
                this.f23110s0 = AndroidUtilities.dp(14.0f) + this.f23110s0;
            }
        } else if ((!this.f23126t1 && ((this.f22955h2 && !this.f23205y7.isSponsored()) || this.N1 || this.f22969i2 || this.f22984j2 || this.f22998k2)) || i10 - lastLineWidth < i11 || this.f23205y7.hasRtl) {
            z10 = true;
        }
        if (this.f23205y7.isUnsupported()) {
            z10 = true;
        }
        if ((k1Var.f622s || k1Var.f607b) && (richMessageLayout = this.f23205y7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f23205y7;
        if ((messageObject.hasCodeAtBottom && (k1Var.f622s || k1Var.f607b)) || ((messageObject.hasQuoteAtBottom && (k1Var.f622s || k1Var.f607b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z10 = true;
        } else {
            i13 = 14;
        }
        if (z10) {
            this.f23110s0 = AndroidUtilities.dp(i13) + this.f23110s0;
            this.K8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.J8 = dp;
            if (this.f23205y7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.f23075pb;
            } else {
                i14 = this.f23075pb;
            }
            this.J8 = org.telegram.messenger.w1.b(31.0f, i14, dp);
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
                    checkBoxBaseArr2[i11].f23902l = false;
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
            this.N8 = new org.telegram.ui.Components.n9(this.I7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(m1 m1Var, x80 x80Var, Layout layout, int i10) {
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
                    m1Var.f22269b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (m1Var.f22269b != i10) {
            return false;
        }
        x80Var.rewind();
        int spanStart = spanned.getSpanStart(this.D5);
        int spanEnd = spanned.getSpanEnd(this.D5);
        x80Var.f30678c = true;
        x80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, x80Var);
        x80Var.a();
        this.B5.k();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f23213z0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        if (this.f23205y7.type == 20 && this.Mb != null) {
            bi.y3 y3Var = this.S0;
            this.Kb = com.google.android.gms.internal.vision.e2.A(y3Var.getImageWidth(), this.Mb.getWidth(), 2.0f, this.f23162v8);
            this.Lb = com.google.android.gms.internal.vision.e2.A(y3Var.getImageHeight(), this.Mb.getHeight(), 2.0f, y3Var.getImageY() + this.f23192x8);
        }
    }

    public final void s1(int i10) {
        int i11;
        int v02;
        sl0 sl0Var;
        sl0 sl0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f23205y7.isUnsupported()) {
            if (this.f23205y7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i14, this.Id);
        } else if (i10 == 0 && this.f23003k7) {
            if (this.f23205y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.xc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.Id);
        } else if (i10 == 0 && (sl0Var2 = this.f22865aa) != null) {
            v02 = sl0Var2.h();
        } else if (i10 == 0 && (sl0Var = this.f22894ca) != null) {
            v02 = sl0Var.h();
        } else {
            if (this.f23205y7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Id);
        }
        Drawable[] drawableArr = this.f23157v3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            h1 h1Var = new h1(i10, this);
            n1[] n1VarArr = this.f23172w3;
            n1VarArr[i10] = h1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f23205y7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.j6.v0(i13, this.Id)}), null, n1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.j6.B1(drawable, v02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(m1 m1Var, x80 x80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(m1Var, x80Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.s3():boolean");
    }

    public final void s4() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.Q0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f22934f8 && !this.f22920e8 && !isPressed()) || (this.M1 && this.S0.hasBitmapImage())) {
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
        this.f23118s8 = z10;
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
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f23183x && !this.f23205y7.isVoice()) || this.C9 == null || this.D9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.L;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.N.f607b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f7) {
        if (this.f23227ze != f7) {
            this.f23227ze = f7;
            y4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f23059o8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f23032m9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Yb;
                int i10 = this.I7;
                org.telegram.ui.Components.i9 i9Var = this.f23048n9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.f22867ac = userProfilePhoto.photo_small;
                    } else {
                        this.f22867ac = null;
                    }
                    i9Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Yb, i9Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Zb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.f22867ac = chatPhoto.photo_small;
                    } else {
                        this.f22867ac = null;
                    }
                    if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId >= 0) {
                            TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            i9Var.m(i10, user2);
                            imageReceiver.setForUserOrChat(user2, i9Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        i9Var.k(i10, chat2);
                        imageReceiver.setForUserOrChat(chat2, i9Var);
                        return;
                    }
                    i9Var.k(i10, this.Zb);
                    imageReceiver.setForUserOrChat(this.Zb, i9Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", i9Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.f22867ac = null;
                    i9Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, i9Var, null, null, 0);
                    return;
                }
            }
            this.f22867ac = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(k1 k1Var) {
        this.Jc = k1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f22983j1 != z10) {
            this.f22983j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f23183x = z10;
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
        if (this.f22934f8 != z10) {
            this.f22934f8 = z10;
            if (z10) {
                this.f22917e4 = null;
            }
            if (!z10) {
                this.f22989j8 = System.currentTimeMillis();
                this.f22948g8 = true;
                this.f22961h8 = 300;
            } else {
                this.f22948g8 = false;
                this.f22961h8 = 0;
            }
            s4();
            if (this.F5) {
                this.H5.f27220o = f3();
            } else {
                this.G5.f24767p = f3();
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
        this.f23023le = runnable;
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
        this.f23010ke = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        s4();
        if (this.F5) {
            this.H5.f27220o = f3();
        } else {
            this.G5.f24767p = f3();
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
        wl0 wl0Var = this.S3;
        if (wl0Var != null) {
            wl0Var.f32290n = f6Var;
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
        if (this.f23108re != z10) {
            this.f23108re = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f7) {
        if (this.f23212ye != f7) {
            this.f23212ye = f7;
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
            ((wh.h) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f22888c4;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.f22888c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f22888c4.textLayoutBlocks.get(i11);
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
        this.f23028m5 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final int t0() {
        if (this.f23140u1) {
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
        this.f22994jd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23022ld = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f23022ld.setInterpolator(pr.f29466f);
        this.f22980id = i10;
        this.f22965hd = i11;
        this.f23022ld.addUpdateListener(new ah.l0(3, this, z10));
        this.f23022ld.addListener(new ah.q0(22, this, z10));
        this.f23009kd = true;
        this.f23022ld.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f23220z7;
        if (messageObject == null) {
            messageObject = this.f23205y7;
        }
        MessageObject messageObject2 = messageObject;
        this.f23205y7 = null;
        X3(messageObject2, this.K, this.F, this.E, this.G, false);
    }

    public final int t3(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t3(int):int");
    }

    public final void t4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t4():void");
    }

    public final boolean u0(MotionEvent motionEvent) {
        k1 k1Var;
        if (this.Pa == null || (k1Var = this.Jc) == null || !k1Var.c()) {
            return false;
        }
        boolean contains = this.Qa.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Ra == null) {
            this.Ra = new zc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Ra.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Ra.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ra.h) {
                this.Jc.W1(this);
            }
            this.Ra.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Ra.c(false);
        }
        return this.Ra.h;
    }

    public final void u1() {
        MessageObject messageObject;
        k1 k1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f23205y7.hasMediaSpoilers() && !this.f23205y7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f23205y7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Jc != null && messageObject2.isSensitive()) {
                    this.Jc.A(this);
                    return;
                } else {
                    i4(this.f22941g1, this.f22954h1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f23205y7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f23205y7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Jc.N0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f23205y7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j3 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j3 != 0) {
                    user = MessagesController.getInstance(this.I7).getUser(Long.valueOf(j3));
                } else {
                    user = null;
                }
                this.Jc.s0(this, user, this.f22941g1, this.f22954h1);
            } else if (i12 == 5) {
                if (this.O4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f23205y7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f23205y7);
                } else {
                    this.Jc.J1(this, this.f23205y7);
                }
            } else if (i12 == 8) {
                int i13 = this.O4;
                if (i13 != -1 && (i13 != 1 || !this.A1 || !this.f23046n7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
            } else if (this.K1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f23205y7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.O4 == -1) {
                            this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        k1 k1Var2 = this.Jc;
                        if (k1Var2 != null) {
                            k1Var2.t0(this, this.f22941g1, this.f22954h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.O4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Jc.I1(this.f23205y7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                of.f.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f22998k2) {
                        if (this.O4 == -1) {
                            this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (k1Var = this.Jc) != null) {
                        if (i14 == 16) {
                            k1Var.p0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            k1Var.y0(this, this.S4, this.T4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
            } else if (this.O4 != -1 && (!this.f23185x1 || (!this.f23046n7 && (((messageObject = this.f23205y7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.A1))))) {
                if (this.f23185x1) {
                    v1(true);
                    return;
                }
                int i16 = this.O4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
            }
        } else {
            int i17 = this.O4;
            if (i17 == -1) {
                this.Jc.t0(this, this.f22941g1, this.f22954h1, false);
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
        boolean isOutOwner = this.f23205y7.isOutOwner();
        int i11 = 0;
        s1 s1Var = this.Zc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f23162v8 + s1Var.f22736g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f23039n0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f23162v8 + s1Var.f22736g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f23205y7.type == 19) {
                dp = 0;
            } else {
                if (!this.f23004k8 && this.J) {
                    f7 = 11.0f;
                } else {
                    f7 = 17.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            this.f23039n0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f11 = 4.0f;
        if (this.f22984j2) {
            this.f23039n0 = AndroidUtilities.dp(11.0f) + this.f23039n0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f23094r0 = dp3;
            StaticLayout staticLayout = this.B2;
            if (staticLayout != null) {
                this.f23094r0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f22998k2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f23094r0 = dp4;
            StaticLayout staticLayout2 = this.B2;
            if (staticLayout2 != null) {
                this.f23094r0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f23205y7.type == 19) {
            this.f23094r0 = AndroidUtilities.dp(6.0f) + this.Lc;
            if (!this.f23205y7.isOut()) {
                this.f23039n0 = getCurrentBackgroundLeft();
            } else {
                this.f23039n0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Lc;
            this.f23094r0 = dp5;
            MessageObject messageObject = this.f23205y7;
            float f12 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f23094r0;
                    if (this.Lc <= 0) {
                        f12 = -3.0f;
                    }
                    this.f23094r0 = AndroidUtilities.dp(f12) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f23094r0 = AndroidUtilities.dp(f12) + dp5;
                }
                if (this.f23205y7.hasCodeAtTop && this.Lc > 0) {
                    this.f23094r0 = AndroidUtilities.dp(5.0f) + this.f23094r0;
                }
            }
        }
        if (this.f23205y7.isSponsored()) {
            this.f23065p0 = AndroidUtilities.dp(14.0f) + this.f23094r0;
        } else if (this.f23126t1) {
            this.f23065p0 = AndroidUtilities.dp(10.0f) + this.f23094r0;
            this.f23094r0 = org.telegram.messenger.w1.C(13.0f, this.f23025m2, this.f23094r0);
            if (this.R2 && !this.f22998k2 && !this.f23205y7.isGiveawayOrGiveawayResults()) {
                this.f23094r0 = AndroidUtilities.dp(44.0f) + this.f23094r0;
            }
        } else {
            this.f23065p0 = AndroidUtilities.dp(10.0f) + this.f23205y7.textHeight(s1Var) + this.f23094r0;
        }
        if (this.f23126t1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f23205y7.textHeight(s1Var) + this.f23094r0;
        } else {
            int i13 = this.f23065p0 + this.f23025m2;
            if (this.R2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f10) + i13;
            if (this.f23025m2 <= 0) {
                f11 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f11) + dp6;
        }
        this.f23079q0 = dp2;
        this.f23051o0 = this.f23039n0;
        if (this.f23205y7.textXOffset != 0.0f && this.C9 != null) {
            int dp7 = this.J8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f23205y7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.K8) {
                int i15 = this.f23075pb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = vl.v(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f23039n0 = (i14 - getExtraTimeX()) + this.f23039n0;
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
                this.f23143u4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.j6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f23143u4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f23143u4.getLineWidth(0);
                }
                this.A4 = i11;
            }
            invalidate();
        }
    }

    public final boolean v0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.v0(android.view.MotionEvent):boolean");
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
        if (this.Jc != null && this.f23205y7.isSensitive() && this.f23205y7.hasMediaSpoilers() && !this.f23205y7.needDrawBluredPreview() && !this.f23205y7.isMediaSpoilersRevealed) {
            this.Jc.A(this);
            return;
        }
        MessageObject messageObject4 = this.f23205y7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f23205y7.putInDownloadsStore = true;
        }
        int i12 = this.O4;
        RadialProgress2 radialProgress22 = this.P0;
        int i13 = this.I7;
        bi.y3 y3Var = this.S0;
        RadialProgress2 radialProgress23 = this.O0;
        if (i12 == 0 && (!this.f23185x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f23205y7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f23205y7.mediaExists)) {
                if (z10) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f22918e5 != null && (y3Var.hasNotThumb() || this.f22932f5 == null)) {
                    photoSize = this.f22918e5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f22958h5;
                    } else {
                        str = this.f22972i5;
                    }
                } else {
                    photoSize = this.f22932f5;
                    str = this.f22972i5;
                }
                String str2 = str;
                if (this.f23205y7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f23205y7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    y3Var.setForceLoading(true);
                    y3Var.setImage(ImageLocation.getForObject(this.f22918e5, this.f22903d5), this.f22958h5, ImageLocation.getForObject(this.f22932f5, this.f22903d5), this.f22972i5, this.f22945g5, this.f22918e5.size, null, this.f23205y7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                    if (this.f23205y7.loadedFileSize > 0) {
                        q1(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f23091qd) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f23205y7.getDocument();
                        MessageObject messageObject6 = this.f23205y7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f23205y7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        y3Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        y3Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f23205y7, 0);
                    }
                    this.f22896cd = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                        if (this.f23205y7.loadedFileSize > 0) {
                            q1(this.L1);
                        }
                    } else {
                        int i17 = this.K1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 1, i10);
                            MessageObject messageObject8 = this.f23205y7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                y3Var.setForceLoading(true);
                                y3Var.setImage(ImageLocation.getForDocument(this.L1), null, ImageLocation.getForDocument(this.f22918e5, this.L1), this.f22972i5, this.L1.size, null, this.f23205y7, i10);
                                MessageObject messageObject9 = this.f23205y7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                            } else if (i17 == 8) {
                                y3Var.setImage(ImageLocation.getForDocument(this.L1), this.f22958h5, ImageLocation.getForDocument(this.f22918e5, this.L1), "b1", 0L, "jpg", this.f23205y7, 1);
                            }
                        } else {
                            y3Var.setForceLoading(true);
                            y3Var.setImage(ImageLocation.getForObject(this.f22918e5, this.f22903d5), this.f22958h5, ImageLocation.getForObject(this.f22932f5, this.f22903d5), this.f22972i5, this.f22945g5, 0L, null, this.f23205y7, 0);
                        }
                    }
                }
                this.f23205y7.loadingCancelled = false;
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
                FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                this.f23205y7.loadingCancelled = false;
            }
            if (this.Jc.J1(this, this.f23205y7)) {
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
        } else if (i12 == 1 && (!this.f23185x1 || z10)) {
            y3Var.setForceLoading(false);
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f23205y7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f23205y7.isOut() && !this.f23185x1 && (this.f23205y7.isSending() || this.f23205y7.isEditing())) {
                    if (radialProgress23.f24076i.f30573q != 6) {
                        this.Jc.L(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f23205y7;
                messageObject10.loadingCancelled = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f23205y7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(y3Var);
                        y3Var.cancelLoadImage();
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
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f23205y7)) {
                this.O4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f23205y7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Jc.t0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.X4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                    this.f23205y7.loadingCancelled = false;
                }
                if (this.Jc.J1(this, this.f23205y7)) {
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
                if (this.f23091qd) {
                    this.f22896cd = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f23091qd) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            y3Var.setAllowStartAnimation(true);
                            y3Var.startAnimation();
                        }
                    } else {
                        y3Var.setAllowStartAnimation(true);
                        y3Var.startAnimation();
                    }
                    this.f23205y7.gifState = 0.0f;
                    this.O4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.L1, this.f23205y7, 2, 0);
                this.f23205y7.loadingCancelled = false;
                this.O4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f23205y7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f23205y7.isOut() && (this.f23205y7.isSending() || this.f23205y7.isEditing())) || this.f23205y7.isSendError()) {
                        k1 k1Var = this.Jc;
                        if (k1Var != null && radialProgress23.f24076i.f30573q != 6) {
                            k1Var.L(this);
                            return;
                        }
                        return;
                    }
                    this.f23205y7.loadingCancelled = true;
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
            k1 k1Var2 = this.Jc;
            if (k1Var2 != null) {
                k1Var2.t0(this, f7, f7, false);
            }
        }
    }

    public final ColorFilter v2(int i10, int i11) {
        if (this.Be == null) {
            this.Ce = new int[3];
            this.Be = new ColorFilter[3];
        }
        if (i11 != this.Ce[i10] || this.Be[i10] == null) {
            ColorFilter[] colorFilterArr = this.Be;
            this.Ce[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.Be[i10];
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
        if (this.f22955h2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        s1 s1Var = this.Zc;
        boolean z10 = s1Var.f22802w0;
        e1 e1Var = this.G5;
        io0 io0Var = this.H5;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.J8;
            float f11 = i21;
            int i22 = (int) ((f11 - s1Var.f22754k0) + s1Var.f22759l0);
            int i23 = (int) ((f11 - s1Var.f22736g0) + s1Var.f22740h0);
            if (this.f23091qd && !this.f23086q8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (s1Var.f22754k0 == 0.0f && s1Var.f22759l0 == 0.0f) {
                i22 = i23;
            }
            if (io0Var != null) {
                if (s1Var.f22768n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f22955h2) {
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
                    io0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f22955h2) {
                        f10 = 0.0f;
                    }
                    io0Var.h(dp4 - AndroidUtilities.dp(f10), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (e1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.K1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f22955h2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                e1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (io0Var != null) {
            if (s1Var.f22768n1) {
                int dp5 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f22955h2) {
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
                if (!this.f22955h2) {
                    f10 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f10);
                int i29 = this.J8 + i20;
                if (this.L5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                io0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f22955h2) {
                    f10 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f10);
                io0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (e1Var != null) {
            int useTranscribeButtonProgress2 = this.J8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.K1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f22955h2) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            e1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i11 + i12), AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        th.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f23157v3;
            if (drawable == drawableArr[0] || drawable == this.f23158v4 || drawable == drawableArr[1] || drawable == this.Hc || drawable == this.K3 || drawable == this.f23225zc || ((this.N != null && (drawable instanceof org.telegram.ui.Components.p6)) || (drawable instanceof h90))) {
                return true;
            }
            th.a aVar = this.f22861a6;
            if (aVar == null || (drawable != aVar && drawable != aVar.f46572a)) {
                ArrayList arrayList = this.Y5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r1 r1Var = (r1) obj;
                    if (r1Var.f22530w != drawable && ((bVar = r1Var.f22531x) == null || (drawable != bVar && drawable != bVar.f46561a && drawable != bVar.f46562b))) {
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
        ArrayList arrayList = this.f23058o7;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f23205y7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f23162v8;
                    if (this.f23004k8) {
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
                    float f12 = (e0Var.f21813c * f11) + dp;
                    if (f10 >= f12 && f10 <= (e0Var.f21814e * f11) + f12 && z22 >= dp2 && z22 <= e0Var.f21815f + dp2) {
                        this.f23161v7 = i12;
                        a3();
                        if (e0Var.f21827s == null) {
                            z Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nc, this.Id), 6, 6);
                            e0Var.f21827s = Y;
                            Y.setCallback(this);
                            z zVar = e0Var.f21827s;
                            int i13 = ((int) (e0Var.f21813c * f11)) + dp;
                            zVar.setBounds(i13, dp2, ((int) (e0Var.f21814e * f11)) + i13, e0Var.f21815f + dp2);
                        }
                        e0Var.f21827s.setHotspot(f10, z22);
                        e0Var.f21827s.setState(this.A3);
                        e0Var.b(!e0Var.f21821m);
                        postDelayed(new ah.g(this, this.f23161v7, 18), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f23161v7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f23161v7);
                    z zVar2 = e0Var2.f21827s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f23205y7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        k1 k1Var = this.Jc;
                        if (k1Var != null && !e0Var2.f21821m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f21818j;
                            if (buttonCustom != null) {
                                k1Var.E(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f21817i;
                                if (keyboardInlineButton != null) {
                                    k1Var.g1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f23161v7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f23161v7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i10);
                z zVar3 = e0Var3.f21827s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f23161v7 = -1;
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
            MessageObject messageObject = this.f23205y7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f23205y7.putInDownloadsStore = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.L1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.L1;
                    MessageObject messageObject2 = this.f23205y7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f23205y7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.L1;
                MessageObject messageObject3 = this.f23205y7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f23205y7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f23205y7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.X4 = 0;
            this.f23205y7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public wh.g w3() {
        return wh.g.e(this);
    }

    public final void w4() {
        char c10;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().q2() != null && getDelegate().q2().A(this.f23205y7)) {
            r9 q22 = getDelegate().q2();
            if (q22.f22692v0) {
                c10 = 2;
            } else if (q22.f22694x0) {
                c10 = 3;
            } else if (q22.f22696z0) {
                c10 = 4;
            } else if (P2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.f22984j2) {
                    i12 = this.f23051o0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f22998k2) {
                        i11 = this.f23051o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f23051o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().q2().c0(AndroidUtilities.dp(10.0f) + i12 + this.f23096r2, this.f23053o2);
            } else if (c10 == 1) {
                n4();
                getDelegate().q2().c0((int) this.f23069p4, (int) this.f23083q4);
            } else if (c10 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.K;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f23069p4;
                } else {
                    float f7 = 12.0f;
                    if (this.f23205y7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f23162v8;
                        if (this.f23205y7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f23004k8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f23162v8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f23162v8;
                            if (!this.J) {
                                f7 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f7) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Zc.f22736g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.f23079q0;
                n4();
                getDelegate().q2().c0((AndroidUtilities.dp(10.0f) + dp3) - this.f22872b2, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().q2().c0(this.f23039n0, this.f23094r0);
            }
        }
    }

    public final boolean x0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.x0(android.view.MotionEvent):boolean");
    }

    public final void x1() {
        MessageObject messageObject = this.f23205y7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            k1 k1Var = this.Jc;
            if (k1Var != null) {
                k1Var.w1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f22888c4;
        int i12 = 0;
        s1 s1Var = this.Zc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (wh.h hVar : textLayoutBlock2.spoilers) {
                    hVar.i((i10 - textLayoutBlock2.textYOffset(this.f22888c4.textLayoutBlocks, s1Var)) - this.f23069p4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.f22888c4.textLayoutBlocks, s1Var)) - this.f23083q4);
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
                ((wh.h) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (wh.h hVar2 : textLayoutBlock4.spoilers) {
                    hVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f23094r0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f23094r0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f22990j9) {
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
                        if (childAt != this && (childAt instanceof t1)) {
                            t1 t1Var = (t1) childAt;
                            if (t1Var.f22990j9 && t1Var.K == this.K) {
                                int i12 = t1Var.L.flags;
                                if ((i12 & 1) != 0 && (i12 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - t1Var.getLeft(), (z2(motionEvent) + getTop()) - t1Var.getTop(), 0);
                                    boolean y02 = t1Var.y0(obtain);
                                    obtain.recycle();
                                    return y02;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f23157v3;
            if (action == 0) {
                if (this.f23005k9.contains(x10, z22)) {
                    if (this.f23205y7.isSent()) {
                        this.f23187x3[1] = 2;
                        this.f23018l9 = true;
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
                if (this.f23018l9) {
                    k1 k1Var = this.Jc;
                    if (k1Var != null) {
                        if (this.f22892c8) {
                            k1Var.r(this);
                        } else {
                            k1Var.u(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f23018l9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f23018l9 && (drawable = drawableArr[1]) != null) {
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
        if (this.f22888c4 == null) {
            return;
        }
        float f14 = this.f23083q4;
        float f15 = this.f23069p4;
        s1 s1Var = this.Zc;
        if (s1Var.f22802w0) {
            if (s1Var.C0) {
                f14 -= getTranslationY();
                f13 = s1Var.f22736g0;
            } else if (s1Var.f22787s0) {
                float f16 = s1Var.K1;
                float f17 = 1.0f - f16;
                f15 = (f15 * f16) + (s1Var.f22779q0 * f17);
                f14 = (f14 * f16) + (f17 * s1Var.f22783r0);
            } else if (!this.f23205y7.isVoice() || !TextUtils.isEmpty(this.f23205y7.caption)) {
                f13 = s1Var.f22736g0;
            }
            f15 += f13;
        }
        float f18 = f15;
        float f19 = f14;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (s1Var.f22709a1) {
            float f20 = s1Var.K1;
            if (f20 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var.f22713b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.v5 v5Var = s1Var.O0;
                float f21 = (1.0f - f20) * f7;
                if (textLayoutBlocks != null) {
                    f11 = textLayoutBlocks.textXOffset;
                } else {
                    f11 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList, v5Var, false, f21, f11, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f22888c4;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.v5 v5Var2 = this.f23076pc;
                float f22 = f7 * s1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f12 = textLayoutBlocks2.textXOffset;
                } else {
                    f12 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList3, v5Var2, true, f22, f12, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f22888c4;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.v5 v5Var3 = this.f23076pc;
        if (textLayoutBlocks3 != null) {
            f10 = textLayoutBlocks3.textXOffset;
        } else {
            f10 = 0.0f;
        }
        z1(f18, f19, canvas, arrayList4, v5Var3, true, f7, f10, true);
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
            if (this.f23205y7.isOutOwner()) {
                if (!this.f23004k8 && !this.J && !z11) {
                    this.f23133t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOut");
                } else {
                    this.f23133t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f23004k8 && !this.J && !z11) {
                this.f23133t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgIn");
            } else {
                this.f23133t8 = (org.telegram.ui.ActionBar.f5) L2("drawableMsgInMedia");
            }
        }
        this.f23133t8.f();
        return this.f23133t8;
    }

    public final float y3() {
        float f7;
        s1 s1Var = this.Zc;
        float f10 = 1.0f;
        if (s1Var.F1) {
            boolean z10 = this.f23140u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return AndroidUtilities.lerp(f7, f10, s1Var.K1);
        } else if (this.f23140u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i10;
        MessageObject messageObject = this.f23205y7;
        if (messageObject == null) {
            return;
        }
        float f7 = this.f23212ye + this.f23227ze;
        if (!messageObject.isOutOwner() || this.f23205y7.hasWideCode) {
            f7 += this.f23080q1;
        }
        if (this.F8 && !this.f23205y7.isOutOwner() && this.L != null) {
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
        if (this.f23205y7.type == 12) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f23157v3;
            if (action == 0) {
                ArrayList arrayList = this.X2;
                int[] iArr = this.A3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.X2.size(); i10++) {
                        l1 l1Var = (l1) this.X2.get(i10);
                        float f7 = x10;
                        float f10 = z22;
                        if (l1Var.f22236e.contains(f7, f10)) {
                            if (l1Var.f22237f == null) {
                                l1Var.f22237f = new zc(this);
                            }
                            l1Var.f22237f.c(true);
                            z zVar = l1Var.f22238g;
                            if (zVar != null) {
                                zVar.setHotspot(f7, f10);
                                l1Var.f22238g.setState(iArr);
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
                    this.f23165vc.c(true);
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
                            this.Jc.L0(((l1) this.X2.get(0)).f22233a, this);
                        } else {
                            this.Jc.L0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.Z2 = false;
                    this.f23165vc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.X2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.X2.size(); i11++) {
                        l1 l1Var2 = (l1) this.X2.get(i11);
                        zc zcVar = l1Var2.f22237f;
                        if (zcVar != null && zcVar.h) {
                            k1 k1Var = this.Jc;
                            if (k1Var != null) {
                                k1Var.L0(l1Var2.f22233a, this);
                            }
                            z zVar2 = l1Var2.f22238g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            l1Var2.f22237f.c(false);
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
                        l1 l1Var3 = (l1) this.X2.get(i12);
                        zc zcVar2 = l1Var3.f22237f;
                        if (zcVar2 != null && zcVar2.h) {
                            z zVar3 = l1Var3.f22238g;
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

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.v5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.v5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f22927f0) - this.f22953h0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.N7 || this.Q7 || ((this.f23072p8 && !this.T7) || (messageObject = this.f23205y7) == null || messageObject.isOutOwner() || !this.f23205y7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f23205y7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f23205y7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.z4():void");
    }

    public t1(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f23168w = new k2.g0(11);
        pr prVar = pr.h;
        this.f23198y = new le.b(0, this, prVar, 380L, false);
        this.N = new ah.k1(this);
        this.O = new xg.a(this);
        this.P = new xg.c(this);
        this.B0 = new Rect();
        this.F0 = -1;
        this.G0 = -1;
        this.R0 = new int[4];
        this.W2 = 0;
        this.f22970i3 = 45;
        this.f23157v3 = new Drawable[2];
        this.f23172w3 = new n1[2];
        this.f23187x3 = new int[2];
        this.y3 = new RectF();
        this.A3 = new int[]{16842910, 16842919};
        this.Z3 = -1;
        this.f22859a4 = -1;
        this.f22875b5 = new RectF();
        this.f22889c5 = new RectF();
        this.f23001k5 = -1;
        this.f23028m5 = 1.0f;
        this.f23044n5 = 1.0f;
        this.f23159v5 = -1;
        this.f23174w5 = new a90(this);
        this.f23218z5 = new ArrayList();
        this.A5 = new ArrayList();
        this.E5 = new Path();
        this.X5 = new ArrayList();
        this.Y5 = new ArrayList();
        this.f22973i6 = -1;
        this.f22987j6 = -1;
        this.f23015l6 = true;
        this.N6 = -1;
        this.f23058o7 = new ArrayList();
        new Path();
        this.f23071p7 = new HashMap();
        this.f23085q7 = new HashMap();
        this.K7 = -1;
        this.f23017l8 = true;
        this.f23086q8 = true;
        this.J8 = 100;
        this.f23005k9 = new Rect();
        this.E9 = new AtomicReference();
        this.Qa = new RectF();
        this.f22937fb = new StaticLayout[2];
        this.f23020lb = new float[2];
        this.f23150ub = true;
        this.f23209yb = new Path();
        this.f23224zb = new float[8];
        this.Jb = 1.0f;
        this.Qb = new Path();
        this.Rb = new float[8];
        this.Bc = new RectF();
        this.Cc = new RectF();
        this.Xc = Build.VERSION.SDK_INT == 28;
        this.Yc = 1.0f;
        this.Zc = new s1(this);
        this.f22911dd = new org.telegram.ui.Components.e6(this, 200L, pr.f29467g);
        this.f22951gd = new d1(0, this);
        this.f23063od = new d1(1, this);
        this.f23077pd = new SparseArray();
        this.Dd = -1;
        this.Fd = new m.c3();
        this.Ld = new ArrayList();
        this.Md = new Stack();
        this.Nd = new Path();
        this.Qd = new b1(2, this);
        this.Rd = new b1(3, this);
        this.Ud = false;
        this.Xd = -1L;
        this.f22981ie = false;
        this.f22995je = new b1(10, this);
        this.f23108re = true;
        this.f23167ve = 1.0f;
        this.Ae = new c1(Float.class, "animationOffsetX", 0);
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
        drawable.f29645a = new Paint(1);
        drawable.f29646b = null;
        drawable.h = -1.0f;
        drawable.f29651i = -1.0f;
        drawable.f29652j = -1.0f;
        drawable.f29653k = -1.0f;
        drawable.f29655m = this;
        this.Kc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f23032m9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f23048n9 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.F9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f23103r9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.H7 = DownloadController.getInstance(i10).generateObserverTag();
        this.V0 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        bi.y3 y3Var = new bi.y3(this, this, 2);
        this.S0 = y3Var;
        y3Var.setAllowLoadingOnAttachedOnly(true);
        y3Var.setUseRoundForThumbDrawable(true);
        y3Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.T0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.O0 = new RadialProgress2(this, f6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.P0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        e1 e1Var = new e1(this, this);
        this.G5 = e1Var;
        e1Var.h = this;
        ?? obj = new Object();
        obj.f27208a = 0;
        obj.f27209b = 0;
        obj.f27211e = false;
        obj.f27212f = false;
        obj.f27224s = 1.0f;
        obj.f27225t = 1.0f;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(125L, 600L, prVar);
        obj.v = e6Var;
        obj.f27227w = 1.0f;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(150L, pr.f29466f);
        obj.B = e6Var2;
        obj.J = false;
        if (io0.N == null) {
            io0.N = new Paint(1);
            io0.O = new Paint(1);
            Paint paint = io0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            io0.O.setStyle(style);
        }
        this.H5 = obj;
        obj.f27216k = this;
        obj.f27219n = this;
        e6Var2.f25563a = this;
        e6Var.f25563a = this;
        this.I5 = new f1(this);
        ?? drawable2 = new Drawable();
        drawable2.f32279a = 0L;
        drawable2.f32280b = false;
        drawable2.f32281c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f32282e = 0.0f;
        drawable2.f32283f = 0.32f;
        drawable2.f32284g = 1;
        drawable2.h = 1;
        drawable2.f32285i = 1;
        drawable2.f32289m = 255;
        drawable2.f32290n = f6Var;
        drawable2.f32286j = this;
        this.S3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f5 f5Var = this.f23133t8;
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
                f5Var.o((int) (i10 + f7), i12, i11, (int) f7, this.Uc, this.Vc, this.E, (this.F && this.Zc.f22814z0 == 1.0f) ? false : true);
                f5Var.f20442u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.L0;
        f5Var.o((int) (i10 + f72), i12, i11, (int) f72, this.Uc, this.Vc, this.E, (this.F && this.Zc.f22814z0 == 1.0f) ? false : true);
        f5Var.f20442u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        k1 k1Var;
        if (this.f23205y7 == null) {
            return;
        }
        Runnable runnable = this.f23010ke;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f23023le;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.J7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Od || (k1Var = this.Jc) == null) {
            return;
        }
        k1Var.o();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
