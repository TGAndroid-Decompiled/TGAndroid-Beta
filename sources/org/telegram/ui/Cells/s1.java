package org.telegram.ui.Cells;

import a8.ee;
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
import bi.sb;
import bi.td;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.ub1;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.zq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ev0;
import org.telegram.ui.hj0;
import org.telegram.ui.om;
import org.telegram.ui.y10;
public class s1 extends z implements ip0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, aa, NotificationCenter.NotificationCenterDelegate, oe.d, s4 {
    public static final float[] Ge = new float[8];
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
    public xh.g Ab;
    public Path Ac;
    public float Ad;
    public float Ae;
    public final Rect B0;
    public int B1;
    public StaticLayout B2;
    public float B3;
    public r11 B4;
    public ea0 B5;
    public boolean B6;
    public boolean B7;
    public r61 B8;
    public CheckBoxBase B9;
    public boolean Ba;
    public float Bb;
    public final RectF Bc;
    public float Bd;
    public float Be;
    public int C0;
    public float C1;
    public StaticLayout C2;
    public SpannableStringBuilder C3;
    public r11 C4;
    public ArrayList C5;
    public boolean C6;
    public boolean C7;
    public r61 C8;
    public StaticLayout C9;
    public Path Ca;
    public float Cb;
    public final RectF Cc;
    public float Cd;
    public final b1 Ce;
    public int D0;
    public boolean D1;
    public float D2;
    public boolean D3;
    public r11 D4;
    public CharacterStyle D5;
    public boolean D6;
    public boolean D7;
    public int D8;
    public StaticLayout D9;
    public Path Da;
    public float Db;
    public int Dc;
    public int Dd;
    public ColorFilter[] De;
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
    public int[] Ee;
    public boolean F;
    public int F0;
    public float F1;
    public float F2;
    public long F3;
    public WebFile F4;
    public boolean F5;
    public long F6;
    public o4 F7;
    public boolean F8;
    public final ImageReceiver F9;
    public float[] Fa;
    public xh.f Fb;
    public float Fc;
    public final m.d3 Fd;
    public TL_stars.StarGift Fe;
    public boolean G;
    public int G0;
    public int G1;
    public float G2;
    public boolean G3;
    public boolean G4;
    public final d1 G5;
    public float G6;
    public AnimatorSet G7;
    public boolean G8;
    public int G9;
    public float Ga;
    public Integer Gb;
    public xc Gc;
    public k81 Gd;
    public boolean H;
    public boolean H0;
    public int H1;
    public boolean H2;
    public Path H3;
    public boolean H4;
    public final qp0 H5;
    public float H6;
    public final int H7;
    public float H8;
    public int H9;
    public float Ha;
    public Path Hb;
    public y Hc;
    public f1 Hd;
    public boolean I;
    public boolean I0;
    public long I1;
    public xc I2;
    public Paint I3;
    public boolean I4;
    public final e1 I5;
    public boolean I6;
    public final int I7;
    public int I8;
    public float I9;
    public float Ia;
    public float[] Ib;
    public int Ic;
    public org.telegram.ui.ActionBar.u6 Id;
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
    public j1 Jc;
    public final boolean Jd;
    public MessageObject.GroupedMessages K;
    public int K0;
    public int K1;
    public StaticLayout K2;
    public y K3;
    public int K4;
    public int K5;
    public float K6;
    public int K7;
    public boolean K8;
    public int K9;
    public StaticLayout Ka;
    public float Kb;
    public final jb0 Kc;
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
    public h1 M5;
    public boolean M6;
    public byte[] M7;
    public int M8;
    public int M9;
    public boolean Ma;
    public StaticLayout Mb;
    public int Mc;
    public final Stack Md;
    public final bh.y0 N;
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
    public final yg.a O;
    public final RadialProgress2 O0;
    public r11 O1;
    public StaticLayout O2;
    public y O3;
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
    public final yg.c P;
    public final RadialProgress2 P0;
    public r11 P1;
    public float P2;
    public int P3;
    public int P4;
    public StaticLayout P5;
    public float P6;
    public boolean P7;
    public Paint P8;
    public boolean P9;
    public StaticLayout Pa;
    public xh.g Pb;
    public int Pc;
    public BotForumHelper.BotDraftAnimationsPool Pd;
    public boolean Q;
    public boolean Q0;
    public xc Q1;
    public float Q2;
    public y Q3;
    public int Q4;
    public double Q5;
    public ArrayList Q6;
    public boolean Q7;
    public Path Q8;
    public boolean Q9;
    public final RectF Qa;
    public final Path Qb;
    public float Qc;
    public final a1 Qd;
    public long R;
    public final int[] R0;
    public xc R1;
    public boolean R2;
    public boolean R3;
    public int R4;
    public int R5;
    public int R6;
    public boolean R7;
    public CheckBoxBase[] R8;
    public boolean R9;
    public xc Ra;
    public final float[] Rb;
    public boolean Rc;
    public final a1 Rd;
    public r11 S;
    public final di.f3 S0;
    public StaticLayout S1;
    public boolean S2;
    public final dn0 S3;
    public int S4;
    public int S5;
    public h31 S6;
    public boolean S7;
    public j50 S8;
    public boolean S9;
    public RectF Sa;
    public StaticLayout Sb;
    public float Sc;
    public long Sd;
    public t90 T;
    public final ImageReceiver T0;
    public StaticLayout T1;
    public boolean T2;
    public StaticLayout T3;
    public int T4;
    public StaticLayout T5;
    public org.telegram.ui.Components.h6 T6;
    public boolean T7;
    public ea0 T8;
    public org.telegram.ui.Components.h6 T9;
    public vg.a Ta;
    public int Tb;
    public int Tc;
    public boolean Td;
    public CornerPathEffect U;
    public ColorMatrixColorFilter U0;
    public x90 U1;
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
    public ba0 V1;
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
    public qq W0;
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
    public boolean Xd;
    public fi.l Y0;
    public int Y1;
    public RectF Y2;
    public r11 Y3;
    public boolean Y4;
    public final ArrayList Y5;
    public float Y6;
    public boolean Y7;
    public boolean[] Y8;
    public Drawable Y9;
    public boolean Ya;
    public TLRPC.User Yb;
    public float Yc;
    public long Yd;
    public Paint Z0;
    public boolean Z1;
    public boolean Z2;
    public int Z3;
    public boolean Z4;
    public uh.d Z5;
    public int Z6;
    public boolean Z7;
    public StaticLayout Z8;
    public xm0 Z9;
    public boolean Za;
    public TLRPC.Chat Zb;
    public final r1 Zc;
    public int Zd;
    public r11 f25016a0;
    public yj0 f25017a1;
    public y10 a2;
    public boolean f25018a3;
    public int f25019a4;
    public boolean f25020a5;
    public uh.a f25021a6;
    public float f25022a7;
    public boolean f25023a8;
    public org.telegram.ui.Components.k6 f25024a9;
    public xm0 f25025aa;
    public boolean f25026ab;
    public TLRPC.FileLocation f25027ac;
    public boolean ad;
    public int f25028ae;
    public t90 f25029b0;
    public Paint f25030b1;
    public int f25031b2;
    public int f25032b3;
    public int f25033b4;
    public final RectF f25034b5;
    public sh.g f25035b6;
    public float f25036b7;
    public long f25037b8;
    public boolean f25038b9;
    public xm0 f25039ba;
    public float f25040bb;
    public String f25041bc;
    public boolean f25042bd;
    public int f25043be;
    public CornerPathEffect f25044c0;
    public Paint f25045c1;
    public int f25046c2;
    public CharSequence f25047c3;
    public MessageObject.TextLayoutBlocks f25048c4;
    public final RectF f25049c5;
    public sh.g f25050c6;
    public int f25051c7;
    public boolean f25052c8;
    public int f25053c9;
    public xm0 f25054ca;
    public float f25055cb;
    public Object f25056cc;
    public boolean f25057cd;
    public int f25058ce;
    public int f25059d0;
    public Paint f25060d1;
    public int f25061d2;
    public int f25062d3;
    public MessageObject.TextLayoutBlocks f25063d4;
    public TLObject f25064d5;
    public int f25065d6;
    public int f25066d7;
    public boolean f25067d8;
    public int f25068d9;
    public xm0 f25069da;
    public StaticLayout f25070db;
    public long f25071dc;
    public final org.telegram.ui.Components.h6 f25072dd;
    public float f25073de;
    public m31 f25074e0;
    public iy0 f25075e1;
    public int f25076e2;
    public float f25077e3;
    public oj0 f25078e4;
    public TLRPC.PhotoSize f25079e5;
    public int f25080e6;
    public boolean f25081e7;
    public boolean f25082e8;
    public boolean f25083e9;
    public xm0 f25084ea;
    public int eb;
    public String f25085ec;
    public FlagSecureReason ed;
    public float f25086ee;
    public boolean f25087f;
    public int f25088f0;
    public boolean f25089f1;
    public int f25090f2;
    public int f25091f3;
    public CharSequence f25092f4;
    public TLRPC.PhotoSize f25093f5;
    public int f25094f6;
    public String f7;
    public boolean f25095f8;
    public int f25096f9;
    public int f25097fa;
    public final StaticLayout[] f25098fb;
    public org.telegram.ui.Components.r5 f25099fc;
    public boolean f25100fd;
    public org.telegram.ui.Components.n8 f25101fe;
    public wz0 f25102g0;
    public float f25103g1;
    public int f25104g2;
    public int f25105g3;
    public StaticLayout f25106g4;
    public BitmapDrawable f25107g5;
    public float f25108g6;
    public TLRPC.Message g7;
    public boolean f25109g8;
    public int f25110g9;
    public Drawable f25111ga;
    public int f25112gb;
    public org.telegram.ui.Components.r5 gc;
    public final c1 f25113gd;
    public NotificationCenter.ObserversGroup f25114ge;
    public boolean h;
    public int f25115h0;
    public float f25116h1;
    public boolean f25117h2;
    public int f25118h3;
    public MessageObject.TextLayoutBlocks f25119h4;
    public String f25120h5;
    public float f25121h6;
    public boolean f25122h7;
    public int f25123h8;
    public int f25124h9;
    public boolean f25125ha;
    public boolean f25126hb;
    public TLRPC.User f25127hc;
    public int f25128hd;
    public boolean f25129he;
    public long f25130i0;
    public boolean f25131i1;
    public boolean f25132i2;
    public int f25133i3;
    public CharSequence f25134i4;
    public String f25135i5;
    public int f25136i6;
    public int f25137i7;
    public float f25138i8;
    public int f25139i9;
    public td ia;
    public float f25140ib;
    public TLRPC.User f25141ic;
    public int f25142id;
    public boolean ie;
    public int f25143j0;
    public boolean f25144j1;
    public boolean f25145j2;
    public LinearGradient f25146j3;
    public int f25147j4;
    public Drawable f25148j5;
    public int f25149j6;
    public int f25150j7;
    public long f25151j8;
    public boolean f25152j9;
    public int ja;
    public int f25153jb;
    public TLRPC.Chat f25154jc;
    public float f25155jd;
    public hj0 f25156je;
    public xc f25157k0;
    public CheckBoxBase f25158k1;
    public boolean f25159k2;
    public vc0 f25160k3;
    public int f25161k4;
    public int f25162k5;
    public float f25163k6;
    public boolean f25164k7;
    public boolean f25165k8;
    public final Rect f25166k9;
    public y f25167ka;
    public int f25168kb;
    public String f25169kc;
    public boolean f25170kd;
    public boolean f25171ke;
    public org.telegram.ui.Components.r5 f25172l0;
    public CheckBoxBase l1;
    public boolean f25173l2;
    public int f25174l3;
    public int l4;
    public boolean f25175l5;
    public boolean f25176l6;
    public boolean f25177l7;
    public boolean f25178l8;
    public boolean f25179l9;
    public r11 f25180la;
    public final float[] f25181lb;
    public String f25182lc;
    public ValueAnimator f25183ld;
    public final a1 f25184le;
    public boolean m0;
    public boolean f25185m1;
    public int f25186m2;
    public int f25187m3;
    public Drawable f25188m4;
    public float f25189m5;
    public boolean f25190m6;
    public float f25191m7;
    public boolean f25192m8;
    public final ImageReceiver f25193m9;
    public r11 f25194ma;
    public float f25195mb;
    public boolean f25196mc;
    public int f25197md;
    public Runnable f25198me;
    public int f25199n;
    public int f25200n0;
    public boolean f25201n1;
    public int f25202n2;
    public int f25203n3;
    public int f25204n4;
    public float f25205n5;
    public boolean f25206n6;
    public boolean f25207n7;
    public boolean f25208n8;
    public final org.telegram.ui.Components.j9 f25209n9;
    public int f25210na;
    public float f25211nb;
    public boolean f25212nc;
    public float f25213nd;
    public Runnable f25214ne;
    public int f25215o0;
    public float f25216o1;
    public int f25217o2;
    public int f25218o3;
    public int f25219o4;
    public long f25220o5;
    public boolean f25221o6;
    public final ArrayList f25222o7;
    public boolean f25223o8;
    public boolean f25224o9;
    public int f25225oa;
    public StaticLayout f25226ob;
    public boolean f25227oc;
    public final c1 f25228od;
    public int f25229oe;
    public int f25230p0;
    public long f25231p1;
    public int f25232p2;
    public int f25233p3;
    public float f25234p4;
    public long f25235p5;
    public boolean f25236p6;
    public final HashMap f25237p7;
    public boolean f25238p8;
    public boolean f25239p9;
    public org.telegram.ui.Components.h6 f25240pa;
    public int pb;
    public org.telegram.ui.Components.y5 pc;
    public final SparseArray f25241pd;
    public int f25242pe;
    public int f25243q0;
    public int f25244q1;
    public int f25245q2;
    public boolean f25246q3;
    public float f25247q4;
    public boolean q5;
    public boolean f25248q6;
    public final HashMap f25249q7;
    public boolean f25250q8;
    public boolean q9;
    public t90 f25251qa;
    public int f25252qb;
    public org.telegram.ui.Components.y5 f25253qc;
    public boolean f25254qd;
    public boolean qe;
    public j3 f25255r;
    public int f25256r0;
    public org.telegram.ui.j5 f25257r1;
    public int f25258r2;
    public boolean f25259r3;
    public int f25260r4;
    public boolean f25261r5;
    public boolean r6;
    public String f25262r7;
    public int f25263r8;
    public final ImageReceiver f25264r9;
    public ea0 f25265ra;
    public int f25266rb;
    public org.telegram.ui.Components.y5 f25267rc;
    public boolean f25268rd;
    public float f25269re;
    public boolean f25270s;
    public int f25271s0;
    public ai.v1 f25272s1;
    public int f25273s2;
    public boolean f25274s3;
    public int f25275s4;
    public org.telegram.ui.Components.c6 f25276s5;
    public boolean f25277s6;
    public int f25278s7;
    public boolean f25279s8;
    public int f25280s9;
    public ArrayList f25281sa;
    public int f25282sb;
    public org.telegram.ui.Components.y5 f25283sc;
    public float f25284sd;
    public Paint f25285se;
    public int f25286t0;
    public boolean f25287t1;
    public int f25288t2;
    public xc f25289t3;
    public int f25290t4;
    public ba0 f25291t5;
    public boolean f25292t6;
    public boolean f25293t7;
    public org.telegram.ui.ActionBar.l5 f25294t8;
    public Drawable[] f25295t9;
    public boolean f25296ta;
    public CharSequence f25297tb;
    public org.telegram.ui.Components.y5 f25298tc;
    public float td;
    public boolean f25299te;
    public int f25300u0;
    public boolean f25301u1;
    public int f25302u2;
    public int f25303u3;
    public StaticLayout f25304u4;
    public MessageObject.TextLayoutBlock f25305u5;
    public boolean f25306u6;
    public boolean f25307u7;
    public org.telegram.ui.ActionBar.l5 f25308u8;
    public int[] f25309u9;
    public int f25310ua;
    public boolean f25311ub;
    public xc f25312uc;
    public float f25313ud;
    public xz0 f25314ue;
    public n0 v;
    public int f25315v0;
    public boolean f25316v1;
    public int f25317v2;
    public final Drawable[] f25318v3;
    public org.telegram.ui.Components.r6 f25319v4;
    public int f25320v5;
    public long f25321v6;
    public int f25322v7;
    public int f25323v8;
    public Drawable f25324v9;
    public boolean va;
    public boolean f25325vb;
    public xc f25326vc;
    public float f25327vd;
    public Paint f25328ve;
    public final i2.c f25329w;
    public int f25330w0;
    public boolean f25331w1;
    public int f25332w2;
    public final m1[] f25333w3;
    public org.telegram.ui.Components.r6 f25334w4;
    public final x90 f25335w5;
    public String f25336w6;
    public xh.g f25337w7;
    public int f25338w8;
    public Drawable f25339w9;
    public int f25340wa;
    public Paint f25341wb;
    public xc f25342wc;
    public long f25343wd;
    public Paint f25344we;
    public boolean f25345x;
    public int f25346x0;
    public boolean f25347x1;
    public int f25348x2;
    public final int[] f25349x3;
    public ag.t f25350x4;
    public int f25351x5;
    public int f25352x6;
    public boolean f25353x7;
    public int f25354x8;
    public int x9;
    public boolean f25355xa;
    public Path f25356xb;
    public float f25357xc;
    public float f25358xd;
    public float f25359xe;
    public final oe.b f25360y;
    public boolean f25361y0;
    public long f25362y1;
    public float f25363y2;
    public final RectF y3;
    public StaticLayout f25364y4;
    public boolean f25365y5;
    public boolean f25366y6;
    public MessageObject f25367y7;
    public int f25368y8;
    public boolean f25369y9;
    public boolean f25370ya;
    public final Path f25371yb;
    public float f25372yc;
    public float f25373yd;
    public int f25374ye;
    public boolean f25375z0;
    public boolean f25376z1;
    public float f25377z2;
    public ea0 f25378z3;
    public long f25379z4;
    public final ArrayList f25380z5;
    public boolean f25381z6;
    public MessageObject f25382z7;
    public int f25383z8;
    public boolean f25384z9;
    public boolean f25385za;
    public final float[] f25386zb;
    public y zc;
    public int f25387zd;
    public MessageObject.TextLayoutBlocks f25388ze;

    public s1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static android.graphics.PointF C2(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.C2(int, int, int, int):android.graphics.PointF");
    }

    public static void C3(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(6));
            int size = arrayList.size();
            for (int i11 = 0; i11 < size && i10 > 0; i11++) {
                q1 q1Var = (q1) arrayList.get(i11);
                int i12 = q1Var.d;
                if (i12 > 0) {
                    q1Var.d = i12 + 1;
                    i10--;
                }
            }
        }
    }

    public static int[] J2(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        z11 z11Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof w61) && (z11Var = ((w61) characterStyle).f34462a) != null && (messageEntity = z11Var.d) != null) {
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

    public static boolean S(s1 s1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            j1 j1Var = s1Var.Jc;
            if (j1Var == null || j1Var.O()) {
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
        vg.a[] aVarArr = (vg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vg.a.class);
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
        if (this.Zb != null && (messageObject = this.f25367y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25367y7.messageOwner.from_id);
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
            MessageObject messageObject = this.f25367y7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f25367y7.messageOwner.from_id);
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
        MessageObject messageObject2 = this.f25367y7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f25367y7.sponsoredTitle;
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
                    this.f25085ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            } else if (this.Yb.premium) {
                return ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
            } else {
                return null;
            }
        } else if (this.Zb != null && (messageObject = this.f25367y7) != null && messageObject.getDialogId() != 1271266957 && this.Zb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25367y7.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.I7).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f25085ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return UserObject.getEmojiStatusDocumentId(user2);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.I7).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f25085ec = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private jh.a getDraftMessageMeasureController() {
        j1 j1Var = this.Jc;
        if (j1Var != null) {
            return j1Var.V();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i10;
        if (!this.f25367y7.isOutOwner() && ((!this.f25165k8 || this.f25048c4 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f25367y7.isOutOwner() && this.f25268rd && this.f25223o8 && this.f25367y7.type == 5) {
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
        MessageObject messageObject = this.f25367y7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.getIconForCurrentState():int");
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
        if (this.f25026ab) {
            if (this.Pa == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.y6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f7;
        float f10;
        r1 r1Var = this.Zc;
        if (r1Var.P2) {
            boolean z10 = this.f25026ab;
            f7 = AndroidUtilities.lerp(!z10, z10, r1Var.K1);
        } else if (this.f25026ab) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.y6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
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
        TLRPC.MessageReplies messageReplies2 = this.f25367y7.messageOwner.replies;
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
        return this.f25367y7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var = this.Id;
        if (u6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.y6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23639sa;
        }
        return u6Var.g(i10);
    }

    private float getUseTranscribeButtonProgress() {
        r1 r1Var = this.Zc;
        if (r1Var.f24908n1) {
            if (this.L5) {
                return r1Var.K1;
            }
            return 1.0f - r1Var.K1;
        } else if (this.L5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static k1 n1(int i10, String str, int i11, float f7) {
        k1 k1Var = new k1();
        k1Var.f24309a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.y6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.y6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        k1Var.d = staticLayout;
        k1Var.f24310b = f7;
        if (staticLayout.getLineCount() > 0) {
            k1Var.f24311c = ((float) (k1Var.f24310b - Math.ceil(k1Var.d.getLineWidth(0)))) / 2.0f;
            k1Var.f24311c -= (int) k1Var.d.getLineLeft(0);
        }
        return k1Var;
    }

    public static boolean r3(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    private void setInstantButtonPressed(boolean z10) {
        if (this.f25289t3 == null) {
            this.f25289t3 = new xc(this);
        }
        xc xcVar = this.f25289t3;
        this.f25274s3 = z10;
        xcVar.c(z10);
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
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
        return qx0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), TextUtils.TruncateAt.END, i18, i13, true);
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

    public static boolean x3() {
        return LiteMode.isEnabled(2);
    }

    public final boolean A0(MotionEvent motionEvent) {
        float f7;
        j1 j1Var;
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f25130i0 == 0) {
            f7 = 0.0f;
        } else {
            f7 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f7);
        float f11 = this.pb;
        if (this.f25367y7.sendPreview) {
            f10 = 1.0f - this.f25189m5;
        }
        int dp2 = ((int) ((f11 * f10) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.pb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f25157k0 == null) {
                    this.f25157k0 = new xc(this);
                }
                this.Vd = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Vd = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Vd && (j1Var = this.Jc) != null) {
                j1Var.D(this);
            }
            this.Vd = false;
        } else if (motionEvent.getAction() == 3) {
            this.Vd = false;
        }
        xc xcVar = this.f25157k0;
        if (xcVar != null) {
            xcVar.c(this.Vd);
        }
        return this.Vd;
    }

    public final void A1(Canvas canvas, float f7) {
        hj0 hj0Var;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f10 = this.f25256r0;
            r1 r1Var = this.Zc;
            if (r1Var.f24900l2) {
                float f11 = r1Var.f24909n2;
                float f12 = r1Var.K1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (r1Var.K1 != 1.0f && r1Var.G0 && ((hj0Var = this.f25156je) == null || !hj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.l5 l5Var = this.f25294t8;
                if (l5Var != null) {
                    Rect bounds = l5Var.getBounds();
                    if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f25200n0, f13, canvas, r1Var.H0, r1Var.O0, false, (1.0f - r1Var.K1) * f7, this.f25367y7.textXOffset, false);
                MessageObject messageObject2 = this.f25367y7;
                z1(this.f25200n0, f13, canvas, messageObject2.textLayoutBlocks, this.pc, true, f7 * r1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f25367y7;
                z1(this.f25200n0, f13, canvas, messageObject3.textLayoutBlocks, this.pc, true, f7, messageObject3.textXOffset, false);
            }
        }
        if (f4()) {
            y1(canvas, f7);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f25122h7) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            if (string == null) {
                return LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault);
            }
            return string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public final float A3() {
        float f7;
        r1 r1Var = this.Zc;
        float f10 = 1.0f;
        if (r1Var.F1) {
            boolean z10 = this.f25301u1;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return AndroidUtilities.lerp(f7, f10, r1Var.K1);
        } else if (this.f25301u1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void A4() {
        int i10;
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null) {
            return;
        }
        float f7 = this.Ae + this.Be;
        if (!messageObject.isOutOwner() || this.f25367y7.hasWideCode) {
            f7 += this.f25244q1;
        }
        if (this.F8 && !this.f25367y7.isOutOwner() && this.L != null) {
            if (B3()) {
                i10 = 48;
            } else {
                i10 = 0;
            }
            f7 += AndroidUtilities.dp(71 - i10) * this.H8;
        }
        setTranslationX(f7);
    }

    public final boolean B0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.B0(android.view.MotionEvent):boolean");
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f7;
        oj0 oj0Var;
        float f10;
        if (!this.f25144j1 && this.f25109g8) {
            int i10 = this.f25123h8;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f7 = f10 * 1.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10 && (oj0Var = this.f25078e4) != null) {
            return (1.0f - oj0Var.f31322k.d(1.0f, false)) * f7;
        }
        return f7;
    }

    public final boolean B3() {
        MessageObject messageObject;
        if (!this.N7 || this.Q7 || ((this.f25238p8 && !this.T7) || (messageObject = this.f25367y7) == null || messageObject.isOutOwner() || !this.f25367y7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f25367y7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f25367y7;
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

    public final void B4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.B4():void");
    }

    public final boolean C0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Jd && (messageObject = this.f25367y7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Da, this.Id) != 0) {
            return true;
        }
        return false;
    }

    public final bn0 C4() {
        if (this.f25367y7 != null && t3()) {
            return (bn0) this.f25367y7.richLayout.blocks.get(0);
        }
        return null;
    }

    public final boolean D0(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        x90 x90Var = this.f25335w5;
        if (this.f25145j2) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.M1 && this.f25331w1 && this.O4 != -1 && x9 >= (i11 = this.K4) && x9 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.L4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.O0.f26250i.f31839q != 4) {
                    this.P4 = 1;
                    invalidate();
                    return true;
                }
                if (this.M1) {
                    if (this.S0.isInsideImage(x9, z22)) {
                        this.f25365y5 = true;
                        return true;
                    }
                }
                if (this.K2 != null && z22 >= this.f25217o2) {
                    try {
                        int dp = x9 - ((this.f25215o0 + AndroidUtilities.dp(10.0f)) + this.f25258r2);
                        int i13 = z22 - this.f25217o2;
                        int lineForVertical = this.K2.getLineForVertical(i13);
                        float f7 = dp;
                        int offsetForHorizontal = this.K2.getOffsetForHorizontal(lineForVertical, f7);
                        float lineLeft = this.K2.getLineLeft(lineForVertical);
                        if (lineLeft <= f7 && lineLeft + this.K2.getLineWidth(lineForVertical) >= f7) {
                            Spannable spannable = (Spannable) this.f25367y7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof v61) || v61.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                ba0 ba0Var = this.f25291t5;
                                if (ba0Var == null || ba0Var.f26780i != clickableSpanArr[0]) {
                                    x90Var.k(ba0Var, true);
                                    ba0 ba0Var2 = new ba0(clickableSpanArr[0], this.Id, f7, i13, 0);
                                    this.f25291t5 = ba0Var2;
                                    if (this.f25367y7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.y6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.y6.Ld;
                                    }
                                    ba0Var2.d(org.telegram.ui.ActionBar.y6.w0(i10, this.Id));
                                    this.f25315v0 = -10;
                                    this.f25351x5 = 2;
                                    try {
                                        t90 b10 = this.f25291t5.b();
                                        int[] J2 = J2(spannable, this.f25291t5.f26780i);
                                        b10.d(this.K2, J2[0], 0.0f);
                                        this.K2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    x90Var.a(this.f25291t5, 2);
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
                if (this.f25351x5 != 2 && !this.f25365y5 && this.P4 == 0) {
                    H3(2);
                    return false;
                } else if (this.P4 != 0) {
                    this.P4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    ba0 ba0Var3 = this.f25291t5;
                    if (ba0Var3 != null) {
                        CharacterStyle characterStyle = ba0Var3.f26780i;
                        if (characterStyle instanceof URLSpan) {
                            qf.d.r(getContext(), ((URLSpan) this.f25291t5.f26780i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        H3(2);
                        return false;
                    }
                    this.f25365y5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f25222o7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        d0 d0Var = (d0) arrayList.get(i14);
                        if (bg.c.c(d0Var.f23968i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Jc.W0(this, d0Var.f23968i);
                            invalidate();
                            break;
                        }
                        i14++;
                    }
                    H3(2);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean D1(android.graphics.Canvas r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.D1(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final String D2(long j10) {
        TLRPC.Chat chat;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.I7;
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (i10 < 0 && (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10))) != null) {
            return chat.title;
        } else {
            return null;
        }
    }

    public final t90 D3() {
        t90 t90Var;
        ArrayList arrayList = this.f25380z5;
        if (!arrayList.isEmpty()) {
            t90Var = (t90) arrayList.get(0);
            arrayList.remove(0);
        } else {
            t90Var = new t90(0);
        }
        t90Var.reset();
        this.A5.add(t90Var);
        return t90Var;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
    }

    public final void E0() {
        int i10;
        boolean z10 = this.M0;
        boolean z11 = this.f25129he;
        di.f3 f3Var = this.S0;
        if (z10 != z11) {
            this.f25129he = z10;
            ImageReceiver imageReceiver = this.T0;
            ImageReceiver imageReceiver2 = this.f25264r9;
            ImageReceiver imageReceiver3 = this.F9;
            yg.c cVar = this.P;
            yg.a aVar = this.O;
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
                        ((q1) obj).q();
                    }
                }
                sh.g gVar = this.f25035b6;
                if (gVar != null) {
                    gVar.a();
                }
                sh.g gVar2 = this.f25050c6;
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
                ImageReceiver[] imageReceiverArr2 = aVar.f52590a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = cVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = cVar.f52615a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (f3Var.onAttachedToWindow()) {
                    if (this.M1) {
                        o4(false, false, false);
                    }
                } else {
                    o4(false, false, false);
                }
                this.f25253qc = org.telegram.ui.Components.c6.update(0, (View) this, false, this.f25253qc, this.D9);
                this.f25267rc = org.telegram.ui.Components.c6.update(0, (View) this, false, this.f25267rc, this.K2);
                n4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.o9 o9Var2 = this.N8;
                if (o9Var2 != null) {
                    o9Var2.b();
                }
                sh.g gVar3 = this.f25035b6;
                if (gVar3 != null) {
                    gVar3.f48670b.onDetachedFromWindow();
                    gVar3.f48683x.f();
                }
                sh.g gVar4 = this.f25050c6;
                if (gVar4 != null) {
                    gVar4.f48670b.onDetachedFromWindow();
                    gVar4.f48683x.f();
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        ((q1) obj2).r();
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
                f3Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = aVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = aVar.f52590a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = cVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = cVar.f52615a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.c6.release(this, this.f25267rc);
                org.telegram.ui.Components.c6.release(this, this.f25253qc);
                org.telegram.ui.Components.c6.release(this, this.pc);
            }
        }
        boolean z12 = this.M0;
        if (z12 != this.ie) {
            this.ie = z12;
            int i15 = this.I7;
            if (z12) {
                MessageObject messageObject = this.f25367y7;
                if (f3Var != null) {
                    f3Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f25254qd || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f25316v1) {
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
                        o4(false, false, false);
                    }
                    if (messageObject.hasVideoQualities()) {
                        r81 r81Var = messageObject.highestQuality;
                        if (r81Var != null && !r81Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        r81 r81Var2 = messageObject.thumbQuality;
                        if (r81Var2 != null && !r81Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f25367y7;
            if (f3Var != null) {
                f3Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f22049id) && !PhotoViewer.v1().U1()) {
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

    public void E1(Canvas canvas) {
        if (!this.f25367y7.isMediaSpoilersRevealed && this.Bb != 1.0f) {
            di.f3 f3Var = this.S0;
            int[] roundRadius = f3Var.getRoundRadius();
            float f7 = roundRadius[0];
            float[] fArr = this.f25386zb;
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
            Path path = this.f25371yb;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f3Var.getImageX(), f3Var.getImageY(), f3Var.getImageX2(), f3Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.Bb != 0.0f) {
                path.rewind();
                path.addCircle(this.Cb, this.Db, this.Eb * this.Bb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f25367y7.needDrawBluredPreview()) {
                f3Var.draw(canvas);
            } else {
                float imageX = f3Var.getImageX();
                float imageY = f3Var.getImageY();
                float imageWidth = f3Var.getImageWidth();
                float imageHeight = f3Var.getImageHeight();
                ImageReceiver imageReceiver = this.T0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(f3Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        ds dsVar;
        float f7 = this.Ae;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f25185m1) || this.f25201n1)) {
                if (z11) {
                    dsVar = ds.f27531g;
                } else {
                    dsVar = ds.f27532i;
                }
                this.f25244q1 = (int) Math.ceil(dsVar.getInterpolation(this.f25216o1) * AndroidUtilities.dp(35.0f));
                if (this.f25367y7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f25244q1 = 0;
                    }
                }
            }
            f7 += this.f25244q1;
            if (this.F8 && this.L != null) {
                if (B3()) {
                    i10 = 48;
                }
                return (AndroidUtilities.dp(71 - i10) * this.H8) + f7;
            }
        }
        return f7;
    }

    public final void E3() {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f25367y7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f25367y7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.f25048c4 != null) {
            for (int i11 = 0; i11 < this.f25048c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.f25048c4.textLayoutBlocks.get(i11);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final void F0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        MessageObject messageObject = this.f25367y7;
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
                        if (checkBoxBase != null && checkBoxBase.f26091q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f25190m6;
                if (!z14 && !this.f25292t6 && this.r6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.f25292t6 && !this.f25277s6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f25221o6) {
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
                } else if (!this.R7 && z15 && ((z14 && (!this.f25248q6 || this.r6)) || (this.f25292t6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                } else {
                    charSequence = null;
                }
                if (i10 != 0) {
                    if (this.Z5 == null) {
                        uh.d dVar = new uh.d(this, this.Id);
                        this.Z5 = dVar;
                        dVar.setCallback(this);
                        dVar.f49947a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.f25047c3 = charSequence;
                    this.Z5.d.t(charSequence, z10, true);
                    this.R2 = true;
                    this.f25032b3 = i10;
                    o1();
                }
                R0(z10);
            }
        }
    }

    public void F1(Canvas canvas) {
        if (this.Fb == null) {
            return;
        }
        canvas.save();
        di.f3 f3Var = this.S0;
        canvas.translate(f3Var.getImageX(), f3Var.getImageY());
        this.Fb.c(canvas, this, (int) f3Var.getImageWidth(), (int) f3Var.getImageHeight(), f3Var.getAlpha(), this.qe);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                sh.g gVar = this.f25035b6;
                if (gVar != null) {
                    return gVar.f48670b;
                }
                return null;
            } else if (i10 == -3) {
                sh.g gVar2 = this.f25050c6;
                if (gVar2 != null) {
                    return gVar2.f48670b;
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
                        q1 q1Var = (q1) obj;
                        uh.b bVar = q1Var.f24811x;
                        if (bVar != null && (pollAnswer = q1Var.f24807s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f49939c;
                        }
                    }
                }
            }
        }
        o4 o4Var = this.F7;
        if (o4Var != null) {
            ArrayList arrayList2 = o4Var.f24588c;
            m4 m4Var = o4Var.f24587b;
            if (m4Var != null && i10 >= 0 && i10 < m4Var.f24447a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) o4Var.f24587b.f24447a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((n4) arrayList2.get(i12)).E == messageExtendedMedia) {
                        return ((n4) arrayList2.get(i12)).f24528f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.S0;
    }

    public final void F3() {
        this.Z2 = false;
        xc xcVar = this.f25326vc;
        if (xcVar != null) {
            xcVar.c(false);
        }
        Drawable drawable = this.f25318v3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.X2 != null) {
            for (int i10 = 0; i10 < this.X2.size(); i10++) {
                k1 k1Var = (k1) this.X2.get(i10);
                xc xcVar2 = k1Var.f24312f;
                if (xcVar2 != null) {
                    xcVar2.c(false);
                }
                y yVar = k1Var.f24313g;
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final boolean G0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.G0(android.view.MotionEvent):boolean");
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i10) {
        q1 q1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((q1) arrayList.get(i10)).f24793b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                r1 r1Var = this.Zc;
                if (r1Var.f24934t2) {
                    float f10 = r1Var.K1;
                    f7 += ((1.0f - f10) * r1Var.f24938u2) + (i12 * f10);
                    if (this.f25367y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (r1Var.f24943w0) {
                    f7 += r1Var.f24889j0;
                }
                return f7 + q1Var.f24794c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        ArrayList arrayList = this.Y5;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((q1) arrayList.get(i10)).f24810w.setState(StateSet.NOTHING);
            }
        }
        uh.a aVar = this.f25021a6;
        if (aVar != null) {
            aVar.f49947a.setState(StateSet.NOTHING);
        }
    }

    public final boolean H0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        j1 j1Var;
        boolean c10 = bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = this.I7;
        if (!c10 && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f25367y7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (j1Var = this.Jc) != null && j1Var.O0(3, this) && TextUtils.equals(this.Jc.h(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f25367y7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                int i11 = ((q1) arrayList.get(i10)).f24793b;
                int i12 = this.Lc;
                float f7 = i11 + i12;
                r1 r1Var = this.Zc;
                if (r1Var.f24934t2) {
                    float f10 = r1Var.K1;
                    f7 += ((1.0f - f10) * r1Var.f24938u2) + (i12 * f10);
                    if (this.f25367y7.needDrawForwarded()) {
                        f7 -= this.Lc;
                    }
                }
                if (r1Var.f24943w0) {
                    f7 += r1Var.f24889j0;
                }
                return f7 - AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void H3(int i10) {
        x90 x90Var = this.f25335w5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < x90Var.d; i11++) {
                if (((Pair) x90Var.f34709c.get(i11)).second == valueOf) {
                    x90Var.j(i11);
                }
            }
        } else {
            x90Var.d(true);
        }
        x90 x90Var2 = this.U1;
        if (x90Var2 != null) {
            x90Var2.d(true);
        }
        this.f25276s5 = null;
        this.V1 = null;
        if (this.f25291t5 != null) {
            if (this.f25351x5 == i10 || i10 == -1) {
                this.f25291t5 = null;
                this.f25351x5 = -1;
                this.Td = false;
                this.Ud = false;
                invalidate();
            }
        }
    }

    public final boolean I0() {
        return FileLoader.getInstance(this.I7).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public final void I1(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.I1(float, android.graphics.Canvas, boolean):void");
    }

    public final int I2(byte[] bArr) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((q1) arrayList.get(i10)).f24807s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void I3() {
        if (this.f25078e4 != null) {
            this.f25078e4 = null;
        }
        ArrayList arrayList = this.A5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25380z5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean J0(MotionEvent motionEvent) {
        y yVar;
        s1 s1Var;
        j1 j1Var;
        TLRPC.Chat chat;
        int i10;
        TLRPC.Chat chat2;
        if (this.Za && this.Ka != null && (yVar = this.K3) != null && (this.Yb != null || this.Zb != null)) {
            boolean contains = yVar.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.L3 = contains;
                if (contains) {
                    this.K3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.K3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.L3 && (j1Var = this.Jc) != null) {
                    if (this.A8) {
                        TLRPC.User user = this.f25141ic;
                        if (user != null && user.bot_inline_placeholder == null) {
                            j1Var.M1(this, user.f22177id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            j1 j1Var2 = this.Jc;
                            if (publicUsername == null) {
                                publicUsername = this.f25367y7.messageOwner.via_bot_name;
                            }
                            j1Var2.g0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Yb;
                        if (user2 != null) {
                            j1Var.m0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Zb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f25367y7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f25154jc;
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
                                s1Var = this;
                                j1Var.P(s1Var, chat2, i10, this.f25103g1, this.f25116h1, false);
                                s1Var.K3.setState(StateSet.NOTHING);
                                s1Var.L3 = false;
                                return s1Var.L3;
                            }
                        }
                    }
                }
                s1Var = this;
                s1Var.K3.setState(StateSet.NOTHING);
                s1Var.L3 = false;
                return s1Var.L3;
            }
            s1Var = this;
            return s1Var.L3;
        }
        this.L3 = false;
        return false;
    }

    public final void J1(android.graphics.Canvas r23, org.telegram.messenger.MessageObject.TextLayoutBlocks r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3() {
        CharSequence charSequence;
        long j10;
        long j11;
        long j12;
        long j13;
        a1 a1Var = this.Qd;
        i2.c cVar = this.f25329w;
        cVar.a(a1Var);
        a1 a1Var2 = this.Rd;
        cVar.a(a1Var2);
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f25367y7.caption;
            } else {
                charSequence = this.f25367y7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = s10.e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    s10[] s10VarArr = (s10[]) spanned.getSpans(0, spanned.length(), s10.class);
                    for (s10 s10Var : s10VarArr) {
                        if (s10Var.f32457b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(s10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(s10Var.f32457b.date));
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    long j14 = Long.MAX_VALUE;
                    long j15 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        long intValue = ((Integer) obj).intValue() * 1000;
                        long abs = Math.abs(intValue - currentTimeMillis);
                        if (abs < j14) {
                            j15 = intValue;
                            j14 = abs;
                        }
                    }
                    long j16 = currentTimeMillis - j15;
                    if (j14 < 63000) {
                        if (j16 > 0) {
                            j10 = 1000 - (j16 % 1000);
                        } else {
                            j10 = (-j16) % 1000;
                        }
                    } else if (j14 < 3780000) {
                        j11 = 60000;
                        if (j16 > 0) {
                            j13 = j16 % 60000;
                            j10 = j11 - j13;
                        } else {
                            j12 = (-j16) % 60000;
                            j10 = j12;
                        }
                    } else if (j14 < 90720000) {
                        j11 = 3600000;
                        if (j16 > 0) {
                            j13 = j16 % 3600000;
                            j10 = j11 - j13;
                        } else {
                            j12 = (-j16) % 3600000;
                            j10 = j12;
                        }
                    } else {
                        j10 = -1;
                    }
                    if (j10 > 0) {
                        long j17 = j10 + 100;
                        cVar.a(a1Var2);
                        u90 u90Var = new u90(4, cVar, a1Var2);
                        cVar.f13502a.put(a1Var2, u90Var);
                        if (j17 > 0) {
                            AndroidUtilities.runOnUIThread(u90Var, j17);
                        } else {
                            AndroidUtilities.runOnUIThread(u90Var);
                        }
                    }
                }
            }
        }
    }

    public final boolean K0(MotionEvent motionEvent) {
        j1 j1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Za && this.Ka != null && this.K3 != null && ((this.Yb != null || this.Zb != null) && this.f25056cc != null && this.f25099fc != null)) {
            boolean contains = this.Q3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.R3 = contains;
                if (contains) {
                    this.Q3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.Q3.setState(this.A3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.R3 && (j1Var = this.Jc) != null && (user = this.Yb) != null) {
                    Drawable drawable = this.f25099fc.f32123f[0];
                    if (drawable instanceof org.telegram.ui.Components.t5) {
                        document = ((org.telegram.ui.Components.t5) drawable).e;
                    } else {
                        document = null;
                    }
                    j1Var.B1(this, user, document, this.f25085ec);
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

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f7;
        MessageObject messageObject2 = this.f25367y7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f25367y7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f25367y7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.l1 != null) {
                if (this.f25185m1 || this.f25201n1) {
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
                        f7 = y3 + this.Zc.f24889j0;
                    }
                    canvas.translate(this.I8, f7 + this.f25269re);
                    this.l1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.Id);
    }

    public final void K3(int i10, int i11, String str) {
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

    public final boolean L0(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.L0(org.telegram.messenger.MessageObject):boolean");
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
        r1 r1Var = this.Zc;
        bh.y0 y0Var = this.N;
        if (z10) {
            if (!this.f25367y7.isOutOwner()) {
                cd0 cd0Var = org.telegram.ui.ActionBar.y6.E3;
                if (h4()) {
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23661tc, this.Id);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.y6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23661tc;
                    }
                    w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.Id);
                }
                cd0Var.a(w02);
                if (h4()) {
                    f15 = (getPhotoBottom() + this.f25286t0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.F && !this.E) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float dp2 = (f7 - AndroidUtilities.dp(f14)) + f11;
                    if (this.f25254qd) {
                        if (this.J) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        f15 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (y0Var.i(r1Var.K1) + AndroidUtilities.dp(f16)));
                    } else {
                        f15 = dp2;
                    }
                }
                if (!this.f25367y7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                z.o(cd0Var, f12 + i11, f15 - AndroidUtilities.dp(12.0f));
                cd0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, cd0Var.getBounds().centerX(), cd0Var.getBounds().centerY());
                }
                cd0Var.draw(canvas);
                cd0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f25367y7.isOutOwner()) {
            if (!this.f25367y7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (h4()) {
                dp = (getPhotoBottom() + this.f25286t0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.F && !this.E) {
                    f20 = 20.5f;
                }
                dp = (f7 - AndroidUtilities.dp(f20)) + f11;
                if (this.f25254qd) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * y0Var.i(r1Var.K1);
                }
            }
            RectF rectF = this.f25049c5;
            rectF.set(f19, dp, AndroidUtilities.dp(14.0f) + f19, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.y6.f23314b2.getAlpha();
            int i12 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.y6.f23314b2.setAlpha(i12);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.f23314b2);
            org.telegram.ui.ActionBar.y6.f23314b2.setAlpha(alpha);
            Drawable L2 = L2("drawableMsgError");
            z.o(L2, f19 + AndroidUtilities.dp(6.0f), dp + AndroidUtilities.dp(2.0f));
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
        org.telegram.ui.ActionBar.u6 u6Var = this.Id;
        if (u6Var != null) {
            drawable = u6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.y6.Q0(str);
    }

    public final void L3(boolean z10, boolean z11) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z11 || (messageObject = this.f25367y7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f25078e4 = null;
                CheckBoxBase checkBoxBase = this.l1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Id);
                    this.l1 = checkBoxBase2;
                    if (this.M0) {
                        checkBoxBase2.f26086l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.u6 u6Var = this.Id;
                    if (checkBoxBase.F != u6Var) {
                        checkBoxBase.F = u6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((groupedMessages = this.K) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.A7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f25158k1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Id);
                    this.f25158k1 = checkBoxBase4;
                    if (!checkBoxBase4.f26098y) {
                        checkBoxBase4.f26098y = true;
                        checkBoxBase4.b();
                    }
                    if (this.M0) {
                        this.f25158k1.f26086l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.u6 u6Var2 = this.Id;
                    if (checkBoxBase3.F != u6Var2) {
                        checkBoxBase3.F = u6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f7 = 0.0f;
            if (this.f25185m1 == z10) {
                if (z11 != this.f25201n1 && !z11) {
                    if (z10) {
                        f7 = 1.0f;
                    }
                    this.f25216o1 = f7;
                    invalidate();
                    return;
                }
                return;
            }
            this.f25201n1 = z11;
            this.f25185m1 = z10;
            if (z11) {
                this.f25231p1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f7 = 1.0f;
                }
                this.f25216o1 = f7;
            }
            invalidate();
        }
    }

    public final boolean M0(MotionEvent motionEvent) {
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
            int i13 = this.f25367y7.type;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (!z10) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f25145j2 && !this.f25159k2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                int x9 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f25318v3;
                if (action == 0) {
                    MessageObject messageObject = this.f25367y7;
                    if (messageObject.type == 16) {
                        boolean isVideoCall = messageObject.isVideoCall();
                        int i14 = this.S4;
                        if (x9 >= i14) {
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
                            if (x9 <= AndroidUtilities.dp(i10 + 30) + i15 && z22 >= this.T4 - AndroidUtilities.dp(14.0f)) {
                                if (z22 <= AndroidUtilities.dp(50.0f) + this.T4) {
                                    this.Z4 = true;
                                    this.f25349x3[0] = 4;
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
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.y6.G4;
                                        int C = org.telegram.ui.d3.C(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int B = org.telegram.ui.d3.B(2, this.T4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(C - AndroidUtilities.dp(20.0f), B - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + C, AndroidUtilities.dp(20.0f) + B);
                                        drawableArr[0].setHotspot(x9, z22);
                                        drawableArr[0].setState(this.A3);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x9 >= this.S4 - AndroidUtilities.dp(20.0f)) {
                        if (x9 <= AndroidUtilities.dp(20.0f) + this.S4 && z22 >= this.T4 - AndroidUtilities.dp(4.0f)) {
                            if (z22 <= AndroidUtilities.dp(30.0f) + this.T4) {
                                this.Z4 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Z4) {
                        if (this.f25367y7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.Z4 = false;
                        playSoundEffect(0);
                        this.Jc.u0(this, this.S4, this.T4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f25367y7.type == 16 && this.Z4 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x9, z22);
                }
            }
        }
        return false;
    }

    public final void M1(Canvas canvas, float f7) {
        if (this.f25310ua == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.Z8 != null) {
                this.Ha -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f10 = this.Ga;
            float f11 = this.Ha + dp;
            RectF rectF = this.f25049c5;
            rectF.set(f10, this.Ha, AndroidUtilities.dp(32.0f) + f10, f11);
            o0();
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
                if (this.f25355xa) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.y6.f23425h2.getAlpha();
                    org.telegram.ui.ActionBar.y6.f23425h2.setAlpha((int) (alpha2 * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.y6.f23425h2);
                    org.telegram.ui.ActionBar.y6.f23425h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.y6.f23425h2);
                }
            }
            Drawable Q0 = org.telegram.ui.ActionBar.y6.Q0("drawableCommentSticker");
            z.o(Q0, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
            if (i10 != 0) {
                Q0.setAlpha((int) (f7 * 255.0f));
                Q0.draw(canvas);
                Q0.setAlpha(255);
            } else {
                Q0.draw(canvas);
            }
            if (this.Z8 != null) {
                org.telegram.ui.ActionBar.y6.E2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xc, this.Id));
                org.telegram.ui.ActionBar.y6.E2.setAlpha((int) (f7 * 255.0f));
                r1 r1Var = this.Zc;
                if (r1Var.U) {
                    if (r1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.y6.E2.setAlpha((int) ((1.0d - r1Var.K1) * 255.0d * f7));
                        canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - r1Var.X) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                        r1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.y6.E2.setAlpha((int) (r1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ga + ((AndroidUtilities.dp(32.0f) - this.f25124h9) / 2), this.Ha + AndroidUtilities.dp(30.0f));
                this.Z8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.u6 u6Var = this.Id;
        if (u6Var != null) {
            paint = u6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final void M3(boolean z10, boolean z11) {
        this.f25178l8 = z10;
        this.f25082e8 = z11;
        u4();
        if (this.F5) {
            this.H5.f31991o = f3();
        } else {
            this.G5.f29721p = f3();
        }
        invalidate();
    }

    public final boolean N0(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.N0(android.view.MotionEvent):boolean");
    }

    public final void N1(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.N1(android.graphics.Canvas, float):void");
    }

    public final float N2(float f7) {
        float f10;
        float f11;
        if (h4() && this.K1 != 7) {
            return ((getPhotoBottom() + this.f25286t0) - AndroidUtilities.dp(7.3f)) - this.f25226ob.getHeight();
        }
        int i10 = this.M8;
        if (!this.F && !this.E) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f10)) - this.f25226ob.getHeight()) + f7;
        boolean z10 = this.f25254qd;
        r1 r1Var = this.Zc;
        if (z10) {
            if (this.J) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.N.i(r1Var.K1) + AndroidUtilities.dp(f11));
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
        return (r1Var.f24884i0 - r1Var.f24889j0) + dp;
    }

    public final void N3(boolean z10, boolean z11, boolean z12) {
        MessageObject messageObject;
        if (z10 || !z12 || (messageObject = this.f25367y7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.l1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f25158k1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            jb0 jb0Var = this.Kc;
            float f7 = 0.0f;
            if (jb0Var.e == z11) {
                if (jb0Var.f29617f != z12 && !z12) {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    jb0Var.d = f7;
                    jb0Var.f29617f = false;
                    return;
                }
                return;
            }
            jb0Var.e = z11;
            jb0Var.f29617f = z12;
            if (z12) {
                jb0Var.f29616c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                jb0Var.d = f7;
            }
            jb0Var.a();
            s1 s1Var = jb0Var.f29623m;
            if (s1Var != null) {
                s1Var.invalidate();
                if (s1Var.getParent() != null) {
                    ((ViewGroup) s1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean O0(MotionEvent motionEvent) {
        ev0 E1;
        j1 j1Var = this.Jc;
        if (j1Var == null) {
            E1 = null;
        } else {
            E1 = j1Var.E1();
        }
        ev0 ev0Var = E1;
        int i10 = 0;
        if (this.f25367y7 != null) {
            di.f3 f3Var = this.S0;
            if (f3Var.hasNotThumb() && ev0Var != null && !this.f25367y7.isSticker() && !this.f25367y7.isAnimatedEmoji() && ((!this.f25367y7.isVideo() || this.f25207n7) && !this.f25254qd && !this.f25367y7.isAnimatedSticker() && ((!this.f25367y7.isDocument() || this.f25367y7.isGif()) && !this.f25367y7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f25367y7;
                xh.f fVar = this.Fb;
                if (fVar != null) {
                    Integer num = (Integer) fVar.f51915k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    i10 = num.intValue();
                }
                return ev0Var.a(motionEvent, this, f3Var, messageObject, i10);
            }
        }
        return false;
    }

    public final void O1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.O1(android.graphics.Canvas):void");
    }

    public final int O2(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.Y5;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((q1) arrayList.get(i11)).f24808t;
                if (todoItem != null && todoItem.f22175id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O3(boolean z10) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        s1 s1Var;
        if (this.f25367y7.isDice()) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof wj0) {
                final wj0 wj0Var = (wj0) drawable;
                String diceEmoji = this.f25367y7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.I7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.I7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f25367y7.getDiceValue();
                if ("🎰".equals(this.f25367y7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        ex0 ex0Var = (ex0) wj0Var;
                        if (ex0Var.U0 != null || ex0Var.V0) {
                            s1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int X = ex0.X(i10 & 3);
                            int X2 = ex0.X((i10 >> 2) & 3);
                            int X3 = ex0.X(i10 >> 4);
                            if (X == 4 && X2 == 4 && X3 == 4) {
                                X = 5;
                                X3 = 5;
                                X2 = 5;
                            }
                            ex0Var.f27947b1 = X;
                            ex0Var.f27948c1 = X2;
                            ex0Var.f27949d1 = X3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            ex0Var.V0 = true;
                            s1Var = this;
                            Utilities.globalQueue.postRunnable(new li.p2(ex0Var, stickerSetByEmojiOrName, i11, messageObject, s1Var, z10, 3));
                        }
                        if (s1Var.f25367y7.isOut()) {
                            wj0Var.S(Integer.MAX_VALUE, s1Var.f25113gd);
                        }
                        s1Var.f25367y7.wasUnread = false;
                    } else {
                        s1Var = this;
                    }
                    if (wj0Var.m0 == null && !wj0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        ex0 ex0Var2 = (ex0) wj0Var;
                        if (ex0Var2.m0 == null && !ex0Var2.Y0) {
                            ex0Var2.Y0 = true;
                            Utilities.globalQueue.postRunnable(new sb(ex0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), s1Var, 24));
                            return true;
                        }
                    }
                } else {
                    if (wj0Var.m0 == null && !wj0Var.Y0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.I7).getPathToAttach(document, true);
                        if (wj0Var.m0 == null && !wj0Var.Y0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f25367y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                wj0Var.Y0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final wj0 wj0Var2 = wj0Var;
                                                String str = readRes;
                                                if (wj0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    wj0 wj0Var3 = wj0Var2;
                                                                    wj0Var3.Y0 = false;
                                                                    if (!wj0Var3.V0 && wj0Var3.W0) {
                                                                        wj0Var3.C(true);
                                                                        return;
                                                                    }
                                                                    wj0Var3.l();
                                                                    wj0Var3.I();
                                                                    wj0Var3.x();
                                                                    return;
                                                                default:
                                                                    wj0 wj0Var4 = wj0Var2;
                                                                    wj0Var4.V0 = false;
                                                                    if (!wj0Var4.Y0 && wj0Var4.W0) {
                                                                        wj0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                wj0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (wj0Var2.U0 != null) {
                                                    i12 = wj0Var2.U0.f26242a[0];
                                                }
                                                if (wj0Var2.U0 != null) {
                                                    int i13 = wj0Var2.U0.f26242a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new h2(wj0Var2, i12, 10));
                                                return;
                                            default:
                                                final wj0 wj0Var3 = wj0Var;
                                                wj0Var3.m0 = RLottieNative.b(readRes, wj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                wj0 wj0Var32 = wj0Var3;
                                                                wj0Var32.Y0 = false;
                                                                if (!wj0Var32.V0 && wj0Var32.W0) {
                                                                    wj0Var32.C(true);
                                                                    return;
                                                                }
                                                                wj0Var32.l();
                                                                wj0Var32.I();
                                                                wj0Var32.x();
                                                                return;
                                                            default:
                                                                wj0 wj0Var4 = wj0Var3;
                                                                wj0Var4.V0 = false;
                                                                if (!wj0Var4.Y0 && wj0Var4.W0) {
                                                                    wj0Var4.C(true);
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
                        if (!z10 && this.f25367y7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.I7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            wj0Var.S(diceFrameSuccess.frame, this.f25113gd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.I7).getPathToAttach(document2, true);
                        if (wj0Var.U0 == null && !wj0Var.V0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.I7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f25367y7, this);
                                FileLoader.getInstance(this.I7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f25367y7.wasUnread = false;
                            } else {
                                if (z10 && wj0Var.Q == null && wj0Var.R == null && wj0Var.P == null) {
                                    wj0Var.J = 2;
                                    wj0Var.X0 = true;
                                }
                                wj0Var.V0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final wj0 wj0Var2 = wj0Var;
                                                String str = readRes2;
                                                if (wj0Var2.W0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    wj0 wj0Var32 = wj0Var2;
                                                                    wj0Var32.Y0 = false;
                                                                    if (!wj0Var32.V0 && wj0Var32.W0) {
                                                                        wj0Var32.C(true);
                                                                        return;
                                                                    }
                                                                    wj0Var32.l();
                                                                    wj0Var32.I();
                                                                    wj0Var32.x();
                                                                    return;
                                                                default:
                                                                    wj0 wj0Var4 = wj0Var2;
                                                                    wj0Var4.V0 = false;
                                                                    if (!wj0Var4.Y0 && wj0Var4.W0) {
                                                                        wj0Var4.C(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                wj0Var2.U0 = RLottieNative.b(str, null, null, null);
                                                int i12 = 0;
                                                if (wj0Var2.U0 != null) {
                                                    i12 = wj0Var2.U0.f26242a[0];
                                                }
                                                if (wj0Var2.U0 != null) {
                                                    int i13 = wj0Var2.U0.f26242a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new h2(wj0Var2, i12, 10));
                                                return;
                                            default:
                                                final wj0 wj0Var3 = wj0Var;
                                                wj0Var3.m0 = RLottieNative.b(readRes2, wj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                wj0 wj0Var32 = wj0Var3;
                                                                wj0Var32.Y0 = false;
                                                                if (!wj0Var32.V0 && wj0Var32.W0) {
                                                                    wj0Var32.C(true);
                                                                    return;
                                                                }
                                                                wj0Var32.l();
                                                                wj0Var32.I();
                                                                wj0Var32.x();
                                                                return;
                                                            default:
                                                                wj0 wj0Var4 = wj0Var3;
                                                                wj0Var4.V0 = false;
                                                                if (!wj0Var4.Y0 && wj0Var4.W0) {
                                                                    wj0Var4.C(true);
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
                        this.f25367y7.wasUnread = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean P0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.P0(android.view.MotionEvent):boolean");
    }

    public final void P1(android.graphics.Canvas r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.f25048c4 != null) {
            return true;
        }
        return false;
    }

    public final void P3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            hj0 hj0Var = this.f25156je;
            r1 r1Var = this.Zc;
            if (hj0Var != null && hj0Var.h) {
                this.f25269re = 0.0f;
            } else {
                float f7 = i11 + i13 + r1Var.f24884i0;
                this.f25269re = f7 - ((int) f7);
            }
            drawable.setBounds((int) (i10 + r1Var.f24875g0), (int) (i11 + r1Var.f24889j0), (int) (i10 + i12 + r1Var.f24879h0), (int) (i11 + i13 + r1Var.f24884i0));
        }
    }

    public final boolean Q0(MotionEvent motionEvent) {
        sh.g gVar;
        sh.g gVar2;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            sh.g gVar3 = this.f25035b6;
            if (gVar3 != null) {
                if (gVar3.X && gVar3.f48668a.f19326f && gVar3.K.f(x9 - gVar3.L, z22 - gVar3.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25089f1 = true;
                    invalidate();
                    return true;
                }
                sh.g gVar4 = this.f25035b6;
                if ((gVar4.X || gVar4.W) && gVar4.j(x9, z22, action)) {
                    this.f25089f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f25367y7.expandedExplanation && (gVar2 = this.f25050c6) != null) {
                if (gVar2.X && gVar2.f48668a.f19326f && gVar2.K.f(x9 - gVar2.L, z22 - gVar2.M, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25089f1 = true;
                    invalidate();
                    return true;
                }
                sh.g gVar5 = this.f25050c6;
                if ((gVar5.X || gVar5.W) && gVar5.j(x9, z22, action)) {
                    this.f25089f1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.N6 = -1;
                sh.g gVar6 = this.f25035b6;
                if (gVar6 != null && gVar6.S && gVar6.getBounds().contains(x9, z22)) {
                    this.N6 = -2;
                    invalidate();
                    return true;
                } else if (this.f25367y7.expandedExplanation && (gVar = this.f25050c6) != null && gVar.S && gVar.getBounds().contains(x9, z22)) {
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
                    sh.g gVar7 = this.f25035b6;
                    ImageReceiver imageReceiver = gVar7.f48670b;
                    TLRPC.MessageMedia messageMedia = gVar7.T;
                    j1 j1Var = this.Jc;
                    if (j1Var != null) {
                        j1Var.l(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    sh.g gVar8 = this.f25050c6;
                    ImageReceiver imageReceiver2 = gVar8.f48670b;
                    TLRPC.MessageMedia messageMedia2 = gVar8.T;
                    j1 j1Var2 = this.Jc;
                    if (j1Var2 != null) {
                        j1Var2.l(this, null, messageMedia2, -3);
                    }
                }
                this.N6 = -1;
                invalidate();
                return true;
            }
        }
        return false;
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
            r1 r1Var = this.Zc;
            if (r1Var.S2) {
                f7 = AndroidUtilities.lerp(1.0f - f7, f7, r1Var.K1);
            }
            float f14 = 1.0f * f7;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + r1Var.f24879h0;
            if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.J) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.K;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f25234p4;
            } else if (this.f25367y7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25323v8;
                if (this.f25367y7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f25165k8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f25323v8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f25323v8;
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
            int dp4 = ((int) (i11 + r1Var.f24875g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.f25243q0;
            float f15 = dp4;
            int i14 = (int) (dp3 - f15);
            int i15 = this.f25090f2;
            if (r1Var.Y2) {
                i15 = AndroidUtilities.lerp(r1Var.U2, i15, r1Var.K1);
            }
            if (this.Z1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (r1Var.f24850a3) {
                AndroidUtilities.lerp(1.0f - f11, f11, r1Var.K1);
            }
            if (this.f25069da == null) {
                this.f25069da = new xm0(this);
            }
            int p10 = this.f25069da.p(this.Id);
            canvas.save();
            canvas.translate(f15, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            xc xcVar = this.R1;
            if (xcVar != null) {
                f12 = xcVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f25069da.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f25069da.f(canvas, rectF, f14);
            r11 r11Var = this.O1;
            if (r11Var != null) {
                r11Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f14, p10, canvas);
                if (this.P1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.O1.f32090c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.P1.f32090c, AndroidUtilities.dp(21.66f));
                    xc xcVar2 = this.Q1;
                    if (xcVar2 != null) {
                        f13 = xcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.f25069da.f34802g);
                    this.P1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f14, p10, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f25152j9;
    }

    public final void Q3() {
        this.f25109g8 = true;
        this.f25123h8 = 1000;
        this.f25151j8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void R0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.Z5 != null && (messageObject = this.f25367y7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f25367y7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            uh.d dVar = this.Z5;
            if (z11 && SendMessagesHelper.getInstance(this.I7).isSendingVote(this.f25367y7) != null) {
                z12 = true;
            }
            oe.b bVar = dVar.f49950f;
            if (bVar.f19326f != z12) {
                bVar.a(z12, z10);
            }
        }
    }

    public final void R1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.R1(android.graphics.Canvas):void");
    }

    public final boolean R2() {
        org.telegram.ui.ActionBar.u6 u6Var = this.Id;
        if (u6Var != null) {
            return u6Var.f();
        }
        return org.telegram.ui.ActionBar.y6.c1();
    }

    public final void R3(byte[] bArr) {
        MessageObject messageObject = this.f25382z7;
        if (messageObject == null) {
            messageObject = this.f25367y7;
        }
        if (messageObject == null) {
            this.f25078e4 = null;
            return;
        }
        oj0 oj0Var = this.f25078e4;
        if (oj0Var == null || !oj0Var.f31318f || !Arrays.equals(oj0Var.f31319g, bArr)) {
            this.f25078e4 = new oj0(this, messageObject.getId(), bArr);
        }
        this.f25361y0 = true;
    }

    public final boolean S0(MotionEvent motionEvent) {
        j1 j1Var;
        int i10;
        s1 s1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (this.C9 == null || (j1Var = this.Jc) == null || !j1Var.e0()) {
            return false;
        }
        float x9 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f25367y7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.J9, this.L9) + this.G9;
        } else {
            i10 = this.f25338w8 + this.G9;
        }
        if (motionEvent.getAction() == 0) {
            if (x9 >= this.G9 && x9 <= i10) {
                float f7 = this.H9;
                if (z22 >= f7 && z22 <= f7 + this.I9) {
                    this.Q9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.U9 = x9;
                    this.V9 = getY() + z22;
                    y yVar = this.zc;
                    if (yVar != null) {
                        yVar.setHotspot(x9, z22);
                        this.R9 = false;
                        this.S9 = true;
                        postDelayed(new a1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    xc xcVar = this.f25312uc;
                    if (xcVar != null) {
                        xcVar.c(true);
                        this.f25357xc = x9;
                        this.f25372yc = z22;
                    }
                    p();
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.Q9) {
                    j();
                    this.Q9 = false;
                    y yVar2 = this.zc;
                    if (yVar2 != null) {
                        if (!this.R9) {
                            yVar2.setState(new int[]{16842919, 16842910});
                            post(new a1(5, this));
                        } else {
                            yVar2.setState(new int[0]);
                        }
                        this.R9 = false;
                        this.S9 = false;
                        invalidate();
                    }
                    xc xcVar2 = this.f25312uc;
                    if (xcVar2 != null) {
                        xcVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f25196mc) {
                        j1 j1Var2 = this.Jc;
                        if (j1Var2 != null) {
                            TLRPC.Chat chat = this.f25154jc;
                            if (chat != null) {
                                j1Var2.P(this, chat, this.f25367y7.messageOwner.fwd_from.channel_post, this.f25103g1, this.f25116h1, false);
                                s1Var = this;
                            } else {
                                s1Var = this;
                                TLRPC.User user = s1Var.f25127hc;
                                if (user != null) {
                                    j1Var2.m0(this, user, s1Var.f25103g1, s1Var.f25116h1);
                                } else if (s1Var.f25169kc != null) {
                                    j1Var2.m(this);
                                }
                            }
                        }
                    } else {
                        s1Var = this;
                        if (s1Var.Jc != null && (s1Var.f25367y7.hasValidReplyMessageObject() || s1Var.f25367y7.isReplyToStory() || s1Var.f25369y9 || ((message = s1Var.f25367y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            s1Var.Jc.H1(s1Var, s1Var.f25367y7.getReplyMsgId(), x9, z22, false);
                        }
                    }
                }
            } else {
                s1Var = this;
                if (motionEvent.getAction() == 3) {
                    s1Var.Q9 = false;
                    s1Var.R9 = false;
                    y yVar3 = s1Var.zc;
                    if (yVar3 != null) {
                        yVar3.setState(new int[0]);
                    }
                    invalidate();
                    xc xcVar3 = s1Var.f25312uc;
                    if (xcVar3 != null) {
                        xcVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x9 >= s1Var.G9 && x9 <= i10) {
                        float f10 = s1Var.H9;
                        if (z22 >= f10 && z22 <= f10 + s1Var.I9) {
                            if (s1Var.zc != null && s1Var.S9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - s1Var.V9, 2.0d) + Math.pow(x9 - s1Var.U9, 2.0d)) > 0.75d) {
                                    s1Var.S9 = false;
                                }
                            }
                        }
                    }
                    s1Var.Q9 = false;
                    s1Var.R9 = false;
                    s1Var.S9 = false;
                    y yVar4 = s1Var.zc;
                    if (yVar4 != null) {
                        yVar4.setState(new int[0]);
                    }
                    invalidate();
                    xc xcVar4 = s1Var.f25312uc;
                    if (xcVar4 != null) {
                        xcVar4.c(false);
                    }
                }
            }
            return s1Var.Q9;
        }
        s1Var = this;
        return s1Var.Q9;
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f25367y7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f25307u7) {
            return true;
        }
        return false;
    }

    public final void S3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f25382z7;
        if (messageObject == null) {
            messageObject = this.f25367y7;
        }
        this.f25361y0 = false;
        ArrayList arrayList = this.A5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.f25048c4 != null && !TextUtils.isEmpty(messageObject.caption)) {
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
                        while (i17 < this.f25048c4.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.f25048c4.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f25346x0 = i17;
                                this.f25361y0 = false;
                                I3();
                                try {
                                    t90 D3 = D3();
                                    D3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, D3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.f25048c4.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.f25048c4.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            t90 D32 = D3();
                                            D32.d(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                            textLayoutBlock2.textLayout.getSelectionPath(0, i13 - textLayoutBlock2.charactersOffset, D32);
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
                            this.f25346x0 = i19;
                            this.f25361y0 = false;
                            I3();
                            try {
                                t90 D33 = D3();
                                D33.d(textLayoutBlock3.textLayout, i11, 0.0f);
                                textLayoutBlock3.textLayout.getSelectionPath(i11, i10, D33);
                                if (i10 >= textLayoutBlock3.charactersOffset + i18) {
                                    do {
                                        i19++;
                                        if (i19 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i19);
                                        i12 = textLayoutBlock4.charactersEnd - textLayoutBlock4.charactersOffset;
                                        t90 D34 = D3();
                                        D34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i10 - textLayoutBlock4.charactersOffset, D34);
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
                this.f25346x0 = -1;
                this.f25361y0 = false;
                I3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f25346x0 = -1;
            this.f25361y0 = false;
            I3();
            invalidate();
        }
    }

    public final boolean T0(MotionEvent motionEvent) {
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null || messageObject.richLayout == null || messageObject.type != 36) {
            return false;
        }
        float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f25115h0 + this.f25256r0;
        motionEvent.offsetLocation(-this.f25200n0, -topicSeparatorTopPadding);
        this.f25367y7.richLayout.setChatMessageCellDelegate(this, this.Jc);
        boolean onTouchEvent = this.f25367y7.richLayout.onTouchEvent(motionEvent);
        motionEvent.offsetLocation(this.f25200n0, topicSeparatorTopPadding);
        return onTouchEvent;
    }

    public final void T1(android.graphics.Canvas r54, float r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.T1(android.graphics.Canvas, float):void");
    }

    public final boolean T2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.T2():boolean");
    }

    public final void T3(int i10) {
        MessageObject messageObject = this.f25382z7;
        if (messageObject == null) {
            messageObject = this.f25367y7;
        }
        if (messageObject == null) {
            this.f25078e4 = null;
            return;
        }
        oj0 oj0Var = this.f25078e4;
        if (oj0Var == null || !oj0Var.e || oj0Var.f31317c != (-i10)) {
            this.f25078e4 = new oj0(this, messageObject.getId(), i10);
        }
        this.f25361y0 = true;
    }

    public final boolean U0(int i10, MotionEvent motionEvent) {
        int i11;
        xh.g gVar;
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
        if (this.f25367y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId) {
                        int i19 = currentPosition.flags;
                        if ((i19 & 8) != 0 && (i19 & 1) != 0 && s1Var != this) {
                            motionEvent.offsetLocation(getLeft() - s1Var.getLeft(), getTop() - s1Var.getTop());
                            boolean U0 = s1Var.U0(i10 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - s1Var.getLeft()), -(getTop() - s1Var.getTop()));
                            return U0;
                        }
                    }
                }
            }
        }
        if (this.f25353x7) {
            return false;
        }
        int x9 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        r1 r1Var = this.Zc;
        if (actionMasked == 0) {
            int i20 = this.f25200n0;
            if (x9 >= i20 && z22 >= (i16 = this.f25256r0)) {
                MessageObject messageObject = this.f25367y7;
                if (x9 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(r1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25367y7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f25367y7.textLayoutBlocks, r1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f25367y7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (xh.g gVar2 : textLayoutBlock.spoilers) {
                            if (gVar2.getBounds().contains((x9 - this.f25200n0) + i17, (int) ((z22 - this.f25256r0) - textLayoutBlock.textYOffset(this.f25367y7.textLayoutBlocks, r1Var)))) {
                                this.f25337w7 = gVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.f25048c4 != null) {
                float f7 = x9;
                float f10 = this.f25234p4;
                if (f7 >= f10) {
                    float f11 = z22;
                    float f12 = this.f25247q4;
                    if (f11 >= f12 && f7 <= f10 + textLayoutBlocks.textWidth && f11 <= f12 + textLayoutBlocks.textHeight(r1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.f25048c4.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.f25048c4.textLayoutBlocks, r1Var) <= f11; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.f25048c4.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (xh.g gVar3 : textLayoutBlock2.spoilers) {
                                boolean z11 = z10;
                                if (gVar3.getBounds().contains((int) ((f7 - this.f25234p4) + i15), (int) ((f11 - this.f25247q4) - textLayoutBlock2.textYOffset(this.f25048c4.textLayoutBlocks, r1Var)))) {
                                    this.f25337w7 = gVar3;
                                    return z11;
                                }
                                z10 = z11;
                            }
                        }
                    }
                }
            }
            boolean z12 = z10;
            if (this.f25119h4 == null) {
                return false;
            }
            float f13 = x9;
            float f14 = this.f25022a7;
            if (f13 < f14) {
                return false;
            }
            float f15 = z22;
            float f16 = this.f25036b7;
            if (f15 <= f16 || f13 > f14 + textLayoutBlocks2.textWidth || f15 > f16 + textLayoutBlocks2.textHeight(r1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f25119h4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f25119h4.textLayoutBlocks, r1Var) <= f15; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f25119h4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (xh.g gVar4 : textLayoutBlock3.spoilers) {
                    if (gVar4.getBounds().contains((int) ((f13 - this.f25022a7) + i14), (int) ((f15 - this.f25036b7) - textLayoutBlock3.textYOffset(this.f25119h4.textLayoutBlocks, r1Var)))) {
                        this.f25337w7 = gVar4;
                        return z12;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f25337w7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Nd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f25119h4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (xh.g gVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = gVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f25119h4.textLayoutBlocks, r1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f25119h4.textLayoutBlocks, r1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.f25048c4;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (xh.g gVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = gVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.f25048c4.textLayoutBlocks, r1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.f25048c4.textLayoutBlocks, r1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f25367y7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (xh.g gVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = gVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f25367y7.textLayoutBlocks, r1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f25367y7.textLayoutBlocks, r1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.f25049c5;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f25353x7 = true;
            this.f25337w7.f51931q = new a1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f25119h4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f25119h4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (xh.g gVar8 : textLayoutBlock11.spoilers) {
                        gVar8.j((x9 - this.f25022a7) + i13, (z22 - textLayoutBlock11.textYOffset(this.f25119h4.textLayoutBlocks, r1Var)) - this.f25036b7, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.f25048c4;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.f25048c4.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (xh.g gVar9 : textLayoutBlock13.spoilers) {
                        gVar9.j((x9 - this.f25234p4) + i12, (z22 - textLayoutBlock13.textYOffset(this.f25048c4.textLayoutBlocks, r1Var)) - this.f25247q4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f25367y7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f25367y7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (xh.g gVar10 : textLayoutBlock15.spoilers) {
                            gVar10.j((x9 - this.f25200n0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f25367y7.textLayoutBlocks, r1Var)) - this.f25256r0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof nm0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof s1) {
                        s1 s1Var2 = (s1) childAt2;
                        ArrayList arrayList10 = s1Var2.Ld;
                        if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((xh.g) arrayList10.get(0)).f51931q = new pa(6, this, s1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((xh.g) obj).j(gVar.getBounds().centerX(), gVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f25337w7 = null;
            return true;
        }
    }

    public final void U1(float r37, float r38, android.graphics.Canvas r39, java.util.ArrayList r40, float r41, boolean r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.U1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean U2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.U2():boolean");
    }

    public final void U3(String str) {
        V3(str, false, false, -1);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.isStakedDice() && !this.Q) {
            Drawable drawable = this.S0.getDrawable();
            if (drawable instanceof wj0) {
                wj0 wj0Var = (wj0) drawable;
                if ((wj0Var.m0 != null || wj0Var.Y0) && !this.Q && (i10 = wj0Var.J) != 1 && i10 == 2) {
                    if (!wj0Var.X0) {
                        float t10 = wj0Var.t();
                        if (wj0Var.U0 != null) {
                            t10 = wj0Var.f35067a0 / wj0Var.f34534a1;
                        }
                        if (t10 <= 0.95f) {
                            return;
                        }
                    }
                    this.Q = true;
                    j1 j1Var = this.Jc;
                    if (j1Var != null) {
                        j1Var.n1(this, false);
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
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f12 = this.f25256r0;
            r1 r1Var = this.Zc;
            if (r1Var.f24900l2) {
                float f13 = r1Var.f24909n2;
                float f14 = r1Var.K1;
                f7 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f7 = f12;
            }
            if (r1Var.K1 != 1.0f && r1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.l5 l5Var = this.f25294t8;
                if (l5Var != null) {
                    Rect bounds = l5Var.getBounds();
                    if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.F) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                hj0 hj0Var = this.f25156je;
                if (hj0Var != null && hj0Var.h) {
                    MessageObject messageObject2 = this.f25367y7;
                    U1(this.f25200n0, f7, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f25200n0, f7, canvas, r1Var.H0, r1Var.N0, false, 1.0f - r1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f25367y7;
                    U1(this.f25200n0, f7, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, r1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f7;
            boolean z10 = r1Var.D1;
            if (z10 && this.f25294t8 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f25287t1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = c3.h0.z(1.0f, r1Var.K1, this.f25367y7.textHeight(r1Var) * i11, f12);
                    float f16 = r1Var.f24909n2;
                    if (this.f25287t1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.f25367y7.textHeight(r1Var) * i12) * r1Var.K1);
                    f11 = z11;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f25294t8.getBounds());
                if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f17 = rectF.left;
                float f18 = r1Var.f24909n2;
                canvas.clipRect(f17, f18, rectF.right, this.f25367y7.textHeight(r1Var) + f18 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f25367y7;
                U1(this.f25200n0, f10, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - r1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f25294t8.getBounds());
                if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.F) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f25256r0, rectF.right, AndroidUtilities.dp(4.0f) + this.f25367y7.textHeight(r1Var) + i10);
                MessageObject messageObject5 = this.f25367y7;
                U1(this.f25200n0, f11, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f25367y7;
            U1(this.f25200n0, f15, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.N.f4216b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean V3(java.lang.String r20, boolean r21, boolean r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.V3(java.lang.String, boolean, boolean, int):boolean");
    }

    public final boolean W0(MotionEvent motionEvent) {
        if (!this.f25125ha || this.f25180la == null || this.f25342wc == null || this.Jc == null) {
            return false;
        }
        float x9 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.Cc;
        if (action == 0) {
            if (rectF.contains(x9, z22)) {
                this.f25342wc.c(true);
                y yVar = this.f25167ka;
                if (yVar != null) {
                    yVar.setHotspot(x9, z22);
                    this.f25167ka.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.f25342wc.f34725i && !rectF.contains(x9, z22)) {
                this.f25342wc.c(false);
                y yVar2 = this.f25167ka;
                if (yVar2 != null) {
                    yVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f25342wc.f34725i) {
                this.Jc.A0(this);
            }
            this.f25342wc.c(false);
            y yVar3 = this.f25167ka;
            if (yVar3 != null) {
                yVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f25342wc.c(false);
            y yVar4 = this.f25167ka;
            if (yVar4 != null) {
                yVar4.setState(new int[0]);
            }
        }
        return this.f25342wc.f34725i;
    }

    public final void W1(android.graphics.Canvas r52, float r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.W1(android.graphics.Canvas, float):void");
    }

    public final boolean W2() {
        int selectionOverlayColor = getSelectionOverlayColor();
        if (selectionOverlayColor != 0 && selectionOverlayColor != -65536) {
            return true;
        }
        return false;
    }

    public final void W3(float f7, float f10, float f11, float f12) {
        di.f3 f3Var = this.S0;
        f3Var.setImageCoords(f7, f10, f11, f12);
        int i10 = this.K1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.M4 = (int) (f3Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (f3Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.N4 = imageY;
        int i11 = this.M4;
        int dp = AndroidUtilities.dp(24.0f) + this.N4;
        this.P0.r(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.K4 = (int) c3.h0.B(f3Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f7);
        int B = (int) c3.h0.B(f3Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, f3Var.getImageY());
        this.L4 = B;
        int i12 = this.K4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.L4;
        this.O0.r(i12, B, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final boolean X0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.X0(android.view.MotionEvent):boolean");
    }

    public final void X1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.X1(android.graphics.Canvas):void");
    }

    public final boolean X2() {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f25048c4;
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

    public final void X3(org.telegram.messenger.MessageObject r110, org.telegram.messenger.MessageObject.GroupedMessages r111, boolean r112, boolean r113, boolean r114, boolean r115) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.X3(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean, boolean, boolean):void");
    }

    public final boolean Y0(MotionEvent motionEvent) {
        t9 b22;
        boolean z10;
        boolean z11;
        int i10;
        int dp;
        int i11;
        int dp2;
        int extraTextX;
        int i12;
        MessageObject.GroupedMessages groupedMessages;
        j1 j1Var = this.Jc;
        if (j1Var != null && (b22 = j1Var.b2()) != null && (b22.b() || b22.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25367y7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f25367y7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f25144j1 || this.K != null) && (this.K == null || this.Jc.M()))) {
                if (this.f25367y7.hasValidGroupId() && (groupedMessages = this.K) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof s1) {
                                s1 s1Var = (s1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.K.groupId && (currentPosition.flags & s0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    b22.f24093c = (int) s1Var.f25234p4;
                                    b22.d = (int) s1Var.f25247q4;
                                    b22.a0(s1Var);
                                    if (s1Var == this) {
                                        return b22.M(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - s1Var.getLeft(), getTop() - s1Var.getTop());
                                    boolean M = b22.M(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - s1Var.getLeft()), -(getTop() - s1Var.getTop()));
                                    return M;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f25367y7;
                    if (messageObject != null && !messageObject.preview && this.S1 != null && z2(motionEvent) >= this.f25243q0) {
                        b22.f25463r0 = false;
                        b22.f25465t0 = true;
                        b22.f25467v0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.K;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f25234p4;
                        } else {
                            float f7 = 12.0f;
                            if (this.f25367y7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25323v8;
                                if (this.f25367y7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f25165k8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f25323v8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f25323v8;
                                    if (!this.J) {
                                        f7 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f7) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Zc.f24875g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.f25243q0;
                        b22.f24093c = (AndroidUtilities.dp(10.0f) + dp3) - this.f25031b2;
                        b22.d = AndroidUtilities.dp(22.0f) + i15;
                    } else {
                        if (z11 && t3()) {
                            if (z2(motionEvent) < this.f25367y7.richLayout.getHeight() + this.f25256r0) {
                                b22.f25463r0 = false;
                                b22.f25465t0 = false;
                                b22.f25467v0 = true;
                                int i16 = this.f25200n0;
                                int i17 = this.f25256r0;
                                b22.f24093c = i16;
                                b22.d = i17;
                            }
                        }
                        if (P2()) {
                            b22.f25463r0 = false;
                            b22.f25465t0 = false;
                            b22.f25467v0 = false;
                            b22.f24093c = (int) this.f25234p4;
                            b22.d = (int) this.f25247q4;
                        } else {
                            MessageObject messageObject2 = this.f25367y7;
                            if (messageObject2 != null && !messageObject2.preview && this.K2 != null && (!this.f25287t1 ? z2(motionEvent) > this.f25217o2 : z2(motionEvent) < this.f25256r0)) {
                                b22.f25463r0 = true;
                                b22.f25465t0 = false;
                                b22.f25467v0 = false;
                                if (this.f25145j2) {
                                    i11 = this.f25215o0 - AndroidUtilities.dp(10.0f);
                                } else {
                                    if (this.f25159k2) {
                                        i10 = this.f25215o0;
                                        dp = AndroidUtilities.dp(1.0f);
                                    } else {
                                        i10 = this.f25215o0;
                                        dp = AndroidUtilities.dp(1.0f);
                                    }
                                    i11 = i10 + dp;
                                }
                                int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f25258r2;
                                int i18 = this.f25217o2;
                                b22.f24093c = dp4;
                                b22.d = i18;
                            } else if (z11) {
                                b22.f25463r0 = false;
                                b22.f25465t0 = false;
                                b22.f25467v0 = true;
                                int i19 = this.f25200n0;
                                int i20 = this.f25256r0;
                                b22.f24093c = i19;
                                b22.d = i20;
                            } else {
                                b22.f25463r0 = false;
                                b22.f25465t0 = false;
                                b22.f25467v0 = false;
                                int i21 = this.f25200n0;
                                int i22 = this.f25256r0;
                                b22.f24093c = i21;
                                b22.d = i22;
                            }
                        }
                    }
                    b22.a0(this);
                    return b22.M(motionEvent);
                }
            }
        }
        return false;
    }

    public void Y1(android.graphics.Canvas r92) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.Y1(android.graphics.Canvas):void");
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
                this.f25346x0 = i13;
                I3();
                try {
                    t90 D3 = D3();
                    D3.f28280c = true;
                    D3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, D3);
                    D3.a();
                    float f7 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            t90 D32 = D3();
                            D32.f28280c = true;
                            float f10 = f7 + textLayoutBlock2.padTop;
                            D32.d(textLayoutBlock2.textLayout, 0, f10);
                            f7 = f10 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i11 - textLayoutBlock2.charactersOffset, D32);
                            D32.a();
                            if (i11 < (textLayoutBlock.charactersOffset + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.f25361y0) {
                        this.f25109g8 = true;
                        this.f25123h8 = 2500;
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
        this.f25019a4 = -1;
    }

    public final void Y3(org.telegram.messenger.MessageObject r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.Y3(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f25367y7.isSponsored() && this.f25367y7.sponsoredCanReport) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x9;
                if (f7 >= this.F2 - AndroidUtilities.dp(6.0f) && f7 <= this.F2 + this.D2 + AndroidUtilities.dp(6.0f)) {
                    float f10 = z22;
                    if (f10 >= this.G2 - AndroidUtilities.dp(2.0f) && f10 <= this.G2 + this.E2 + AndroidUtilities.dp(2.0f)) {
                        xc xcVar = this.I2;
                        if (xcVar != null) {
                            xcVar.c(true);
                        }
                        this.H2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.H2) {
                j1 j1Var = this.Jc;
                if (j1Var != null) {
                    j1Var.z1();
                }
                xc xcVar2 = this.I2;
                if (xcVar2 != null) {
                    xcVar2.c(false);
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
        di.f3 f3Var = this.S0;
        float alpha = f3Var.getAlpha();
        if (this.f25367y7.isRoundOnce()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        f3Var.setAlpha(f7 * alpha);
        f3Var.draw(canvas);
        f3Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f25205n5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public void Z3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.M0) {
            X3(messageObject, groupedMessages, z10, z11, z12, z13);
            return;
        }
        this.f25382z7 = messageObject;
        this.A7 = groupedMessages;
        this.C7 = z10;
        this.B7 = z11;
        this.D7 = z12;
        this.E7 = z13;
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
        h1 h1Var;
        y yVar;
        if (this.L5 && ((!this.f25268rd || getVideoTranscriptionProgress() > 0.0f || this.G3) && (h1Var = this.M5) != null)) {
            int action = motionEvent.getAction();
            float x9 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (h1Var.v.contains((int) x9, (int) z22)) {
                    if (action == 0) {
                        h1Var.A = true;
                    }
                    if (h1Var.A && (yVar = h1Var.f30398q) != null) {
                        yVar.setHotspot(x9, z22);
                        h1Var.f30398q.setState(m41.N);
                        h1Var.f30399r.invalidate();
                    }
                    return true;
                }
            } else if (h1Var.A && action == 1) {
                h1Var.m();
                return true;
            } else {
                h1Var.A = false;
            }
        }
        return false;
    }

    public boolean a2(Canvas canvas) {
        org.telegram.ui.Components.g6 animation;
        int i10;
        boolean z10;
        MessageObject messageObject = this.f25367y7;
        di.f3 f3Var = this.S0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = f3Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = f3Var.draw(canvas);
                } else {
                    z10 = true;
                }
                f3Var.setForceNotMedia(true);
                float alpha = f3Var.getAlpha();
                f3Var.setAlpha(clamp01 * alpha);
                f3Var.draw(canvas);
                f3Var.setAlpha(alpha);
                f3Var.setForceNotMedia(false);
                return z10;
            }
        }
        return f3Var.draw(canvas);
    }

    public final void a3() {
        j1 j1Var = this.Jc;
        if (j1Var != null && j1Var.d()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void a4(int i10) {
        this.f25199n = i10;
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.f25212nc = z10;
        if (z10) {
            this.f25227oc = z11;
        } else {
            this.f25227oc = false;
        }
    }

    public final boolean b1() {
        MessageObject messageObject = this.f25367y7;
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
        j1 j1Var = this.Jc;
        int i12 = 0;
        if (j1Var != null) {
            if (!j1Var.O0(1, this)) {
                this.D5 = null;
                ArrayList arrayList = this.C5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.C5.size(); i13++) {
                        l1 l1Var = (l1) this.C5.get(i13);
                        if (!l1Var.f24378a.d()) {
                            l1Var.f24378a.a();
                        }
                    }
                }
            } else {
                CharacterStyle w12 = this.Jc.w1(this);
                if (w12 != this.D5) {
                    this.D5 = w12;
                    ea0 ea0Var = this.B5;
                    if (ea0Var != null) {
                        ea0Var.a();
                        this.B5 = null;
                    }
                    ea0 ea0Var2 = new ea0();
                    this.B5 = ea0Var2;
                    ea0Var2.D = true;
                    t90 t90Var = new t90(0);
                    ea0 ea0Var3 = this.B5;
                    ea0Var3.f27806y = t90Var;
                    ea0Var3.k(5.0f);
                    ?? obj = new Object();
                    obj.f24378a = this.B5;
                    obj.f24379b = -3;
                    if (this.C5 == null) {
                        this.C5 = new ArrayList();
                    }
                    this.C5.add(obj);
                    if (this.D5 != null && !r2(obj, t90Var, this.K2, -2) && (((textLayoutBlocks = this.f25048c4) == null || !s2(obj, t90Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f25367y7) != null)) {
                        s2(obj, t90Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.C5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f25367y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.y6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.Ld;
            }
            int w02 = org.telegram.ui.ActionBar.y6.w0(i11, this.Id);
            while (i12 < this.C5.size()) {
                l1 l1Var2 = (l1) this.C5.get(i12);
                if (l1Var2.f24379b == i10) {
                    ea0 ea0Var4 = l1Var2.f24378a;
                    ea0Var4.g(org.telegram.ui.ActionBar.y6.o1(0.85f, w02), org.telegram.ui.ActionBar.y6.o1(2.0f, w02), org.telegram.ui.ActionBar.y6.o1(3.5f, w02), org.telegram.ui.ActionBar.y6.o1(6.0f, w02));
                    ea0Var4.draw(canvas);
                    invalidate();
                    if (ea0Var4.c()) {
                        this.C5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f25335w5.d <= 0 && this.N.f4230s) {
            MessageObject messageObject = this.f25367y7;
            if (messageObject == null || !messageObject.preview) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b4(int i10, int i11) {
        org.telegram.ui.ActionBar.l5 l5Var;
        this.J0 = i10;
        this.K0 = i11;
        this.Tc = i11;
        if ((this.f25367y7 != null && R2() && this.f25367y7.shouldDrawWithoutBackground()) || ((l5Var = this.f25294t8) != null && l5Var.f22833a != null)) {
            invalidate();
        }
    }

    @Override
    public final void c(float f7) {
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(this.f25367y7, f7);
        s4();
    }

    public final boolean c1(float f7, int i10) {
        bh.y0 y0Var = this.N;
        if (!y0Var.K) {
            return false;
        }
        float y3 = getY() + y0Var.d;
        if (y3 <= f7 || (y3 + y0Var.f4226o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.c2(android.graphics.Canvas):void");
    }

    public final void c3() {
        if (this.K != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void c4(float f7, float f10, boolean z10) {
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            E0();
            if (z10) {
                invalidate();
            }
        }
        di.f3 f3Var = this.S0;
        float imageY = f7 - f3Var.getImageY();
        float measuredHeight = f10 - (getMeasuredHeight() - f3Var.getImageY2());
        float imageHeight = f3Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / f3Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25270s = z11;
        f3Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void computeScroll() {
        super.computeScroll();
        n0 n0Var = this.v;
        if (n0Var != null) {
            n0Var.b();
        }
    }

    @Override
    public final void d(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        j1 j1Var = this.Jc;
        if (j1Var != null) {
            j1Var.W1(this, reactionCount, z10, f7, f10);
        }
    }

    public final boolean d1() {
        return FileLoader.getInstance(this.I7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f7, Integer num) {
        boolean z10;
        boolean z11 = this.f25254qd;
        float f10 = 1.0f;
        bh.y0 y0Var = this.N;
        if (z11) {
            y0Var.f4215a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f25176l6 && V2()) {
            if (y0Var.f4215a > 0.0f) {
                o0();
            }
            if (getAlpha() * f7 != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f7 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = (y0Var.f4215a > 0.0f ? 1 : (y0Var.f4215a == 0.0f ? 0 : -1));
            r1 r1Var = this.Zc;
            if (i10 <= 0 && r1Var.f24943w0 && this.L == null && !this.f25254qd) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + r1Var.f24884i0);
                y0Var.D = 0.0f;
                y0Var.E = false;
                if (r1Var.f24874g) {
                    f10 = r1Var.K1;
                }
                y0Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                y0Var.D = 0.0f;
                y0Var.E = false;
                if (r1Var.f24874g) {
                    f10 = r1Var.K1;
                }
                y0Var.d(canvas, f10, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final boolean d3() {
        return this.M0;
    }

    public final void d4(int i10, int i11, int i12, float f7, float f10, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        RichMessageLayout richMessageLayout;
        r1 r1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Zd = i10;
        this.f25043be = i11;
        this.f25058ce = i12;
        this.J0 = i13;
        this.K0 = i14;
        this.f25086ee = f10;
        this.f25073de = f7;
        this.Tc = i14;
        this.Uc = i15;
        this.Vc = i16;
        this.f25028ae = i17;
        if ((!this.f25222o7.isEmpty() || (this.v != null && (messageObject = this.f25367y7) != null && messageObject.type == 27)) && this.Sc != f10) {
            invalidate();
        }
        this.Sc = f10;
        if (i12 != this.K0 || f7 != this.L0) {
            this.L0 = f7;
            this.K0 = i12;
        }
        if (this.f25367y7 != null && R2() && this.f25367y7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f25367y7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f25256r0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f25367y7.textLayoutBlocks.size();
                r1Var = this.Zc;
                if (i21 >= size || this.f25367y7.textLayoutBlocks.get(i21).textYOffset(this.f25367y7.textLayoutBlocks, r1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = 0;
            int i24 = -1;
            int i25 = -1;
            while (i22 < this.f25367y7.textLayoutBlocks.size()) {
                float textYOffset = this.f25367y7.textLayoutBlocks.get(i22).textYOffset(this.f25367y7.textLayoutBlocks, r1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(r1Var) + textLayoutBlock.padBottom;
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
                if (this.pc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.pc.f34961a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) this.pc.f34961a.get(i26);
                        if (x5Var != null && x5Var.f34674n) {
                            float y3 = (0.0f - getY()) - x5Var.f34675r;
                            float y10 = (this.f25199n - getY()) - x5Var.f34675r;
                            Rect rect = x5Var.e;
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
        MessageObject messageObject3 = this.f25367y7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f25256r0;
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
                q1 q1Var = (q1) arrayList.get(i33);
                int i34 = q1Var.f24793b + this.Lc;
                if (Z2(i34, i34 + q1Var.f24794c, this.Zd, i19 + this.f25043be)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f25149j6 != i31 || this.f25136i6 != i32) {
                this.f25149j6 = i31;
                this.f25136i6 = i32;
                invalidate();
            }
        }
        if (this.f25370ya) {
            if (Math.abs(this.Ja - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.f25028ae), this.Ha - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        bh.y0 y0Var = this.N;
        int i35 = y0Var.d;
        boolean Z2 = Z2(i35, i35 + y0Var.f4226o, this.Zd, i18 + this.f25043be);
        if (this.f25176l6 != Z2) {
            this.f25176l6 = Z2;
            invalidate();
        }
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
            if (user != null && user.f22177id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f25367y7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f25367y7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                Z3(messageObject, this.K, this.F, this.E, this.G, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f25367y7.isVideo();
        di.f3 f3Var = this.S0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
                f3Var.setAllowStartAnimation(false);
                f3Var.stopAnimation();
                return;
            }
            f3Var.setAllowStartAnimation(true);
            f3Var.startAnimation();
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
        f3Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            f3Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            f3Var.startAnimation();
        } else {
            f3Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f25254qd;
        float f7 = 1.0f;
        bh.y0 y0Var = this.N;
        if (z10) {
            y0Var.f4215a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f25176l6 || !V2()) {
            return false;
        }
        if (y0Var.f4215a > 0.0f) {
            o0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        int i10 = (y0Var.f4215a > 0.0f ? 1 : (y0Var.f4215a == 0.0f ? 0 : -1));
        r1 r1Var = this.Zc;
        if (i10 <= 0 && r1Var.f24943w0 && this.L == null && !this.f25254qd) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + r1Var.f24884i0);
            if (r1Var.f24874g) {
                f7 = r1Var.K1;
            }
            y0Var.e(canvas, f7);
            canvas.restore();
        } else {
            if (r1Var.f24874g) {
                f7 = r1Var.K1;
            }
            y0Var.e(canvas, f7);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f25367y7.messageOwner).period;
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

    public final void e4() {
        int i10;
        int i11;
        int i12;
        if (this.f25367y7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.y6.f23557o2;
            int i13 = org.telegram.ui.ActionBar.y6.f23399fc;
            textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.y6.f23728x2.setColor(org.telegram.ui.ActionBar.y6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.y6.f23577p2.setColor(org.telegram.ui.ActionBar.y6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.y6.f23595q2.setColor(org.telegram.ui.ActionBar.y6.w0(i13, this.Id));
            org.telegram.ui.ActionBar.y6.f23612r2.setColor(org.telegram.ui.ActionBar.y6.w0(i13, this.Id));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.y6.f23728x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.y6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.y6.f23296a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.y6.f23557o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.y6.f23577p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.y6.f23595q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.y6.f23612r2;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23435hc, this.Id);
            textPaint8.linkColor = w02;
            textPaint7.linkColor = w02;
            textPaint6.linkColor = w02;
            textPaint5.linkColor = w02;
            textPaint4.linkColor = w02;
            textPaint3.linkColor = w02;
            textPaint2.linkColor = w02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.y6.f23557o2;
            int i14 = org.telegram.ui.ActionBar.y6.f23381ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.y6.f23728x2.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.y6.f23577p2.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.y6.f23595q2.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.Id));
            org.telegram.ui.ActionBar.y6.f23612r2.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.Id));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.y6.f23728x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.y6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.y6.f23296a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.y6.f23557o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.y6.f23577p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.y6.f23595q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.y6.f23612r2;
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, this.Id);
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
            d1 d1Var = this.G5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f25367y7.isOutOwner()) {
                        int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23717wb, this.Id);
                        int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23736xb, this.Id);
                        int i16 = org.telegram.ui.ActionBar.y6.f23773zb;
                        d1Var.h(w04, w05, org.telegram.ui.ActionBar.y6.w0(i16, this.Id), org.telegram.ui.ActionBar.y6.w0(i16, this.Id), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23754yb, this.Id));
                    } else if (this.f25117h2 && this.f25025aa != null) {
                        int c10 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23681ud, this.Id), this.f25025aa.i());
                        int c11 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23699vd, this.Id), this.f25025aa.i());
                        int i17 = org.telegram.ui.ActionBar.y6.f23738xd;
                        d1Var.h(c10, c11, org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(i17, this.Id), this.f25025aa.i()), org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(i17, this.Id), this.f25025aa.i()), org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23719wd, this.Id), this.f25025aa.i()));
                    } else {
                        int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23681ud, this.Id);
                        int w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23699vd, this.Id);
                        int i18 = org.telegram.ui.ActionBar.y6.f23738xd;
                        d1Var.h(w06, w07, org.telegram.ui.ActionBar.y6.w0(i18, this.Id), org.telegram.ui.ActionBar.y6.w0(i18, this.Id), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23719wd, this.Id));
                    }
                }
            } else {
                boolean isOutOwner = this.f25367y7.isOutOwner();
                qp0 qp0Var = this.H5;
                if (isOutOwner) {
                    int w08 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ab, this.Id);
                    int w09 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Cb, this.Id);
                    int w010 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Bb, this.Id);
                    qp0Var.f31992p = w08;
                    qp0Var.f31993q = w09;
                    qp0Var.f31994r = w010;
                    int w011 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23717wb, this.Id);
                    int w012 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23736xb, this.Id);
                    int i19 = org.telegram.ui.ActionBar.y6.f23773zb;
                    d1Var.h(w011, w012, org.telegram.ui.ActionBar.y6.w0(i19, this.Id), org.telegram.ui.ActionBar.y6.w0(i19, this.Id), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23754yb, this.Id));
                } else if (this.f25117h2 && this.f25025aa != null) {
                    int c12 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23756yd, this.Id), this.f25025aa.i());
                    int c13 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ad, this.Id), this.f25025aa.i());
                    int c14 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23774zd, this.Id), this.f25025aa.i());
                    qp0Var.f31992p = c12;
                    qp0Var.f31993q = c13;
                    qp0Var.f31994r = c14;
                    int c15 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23681ud, this.Id), this.f25025aa.i());
                    int c16 = org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23699vd, this.Id), this.f25025aa.i());
                    int i20 = org.telegram.ui.ActionBar.y6.f23738xd;
                    d1Var.h(c15, c16, org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(i20, this.Id), this.f25025aa.i()), org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(i20, this.Id), this.f25025aa.i()), org.telegram.ui.ActionBar.y6.c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23719wd, this.Id), this.f25025aa.i()));
                } else {
                    int w013 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23756yd, this.Id);
                    int w014 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ad, this.Id);
                    int w015 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23774zd, this.Id);
                    qp0Var.f31992p = w013;
                    qp0Var.f31993q = w014;
                    qp0Var.f31994r = w015;
                    int w016 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23681ud, this.Id);
                    int w017 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23699vd, this.Id);
                    int i21 = org.telegram.ui.ActionBar.y6.f23738xd;
                    d1Var.h(w016, w017, org.telegram.ui.ActionBar.y6.w0(i21, this.Id), org.telegram.ui.ActionBar.y6.w0(i21, this.Id), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23719wd, this.Id));
                }
            }
        }
        MessageObject messageObject = this.f25367y7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.y6.T2;
            int w018 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, this.Id);
            if (f3()) {
                if (this.f25367y7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.y6.f23546nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.y6.f23568od;
                }
            } else if (this.f25367y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.y6.f23640sb;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.f23548nd;
            }
            textPaint17.setColor(i0.a.f(getVideoTranscriptionProgress(), w018, org.telegram.ui.ActionBar.y6.w0(i12, this.Id)));
        } else if (this.f25165k8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, this.Id));
            } else {
                org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23492kd, this.Id));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.y6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.y6.f23546nb;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23640sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.Id));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.y6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.y6.f23568od;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23548nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.y6.w0(i10, this.Id));
        }
    }

    @Override
    public final void f(float f7) {
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f7);
        s4();
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
            canvas2.translate(this.f25200n0, this.f25256r0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f25178l8) || ((!this.f25178l8 && this.f25082e8) || this.f25095f8)) && !l4() && !W2()) {
            MessageObject messageObject = this.f25367y7;
            if (messageObject == null || !messageObject.preview) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f4() {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if ((groupedMessagePosition == null || ((groupedMessages = this.K) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Zc.f24943w0) {
                if (!this.f25345x || !this.f25367y7.isVoice()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean g() {
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

    public final int g1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        di.f3 f3Var = this.S0;
        f3Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f25193m9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.F9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f25264r9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f25374ye = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    X3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f25092f4)) {
                        p4();
                        this.f25374ye = (int) (i10 + this.f25247q4);
                        this.f25388ze = this.f25048c4;
                    }
                    i10 = this.f25271s0 + this.f25300u0 + i10;
                }
            }
            return i10;
        }
        X3(messageObject, groupedMessages, false, false, false, false);
        f3Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        p4();
        return this.f25271s0 + this.f25300u0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f25144j1 && !this.f25109g8 && !this.f25095f8) {
            return false;
        }
        return true;
    }

    public final boolean g4() {
        if ((this.K == null || (this.L.flags & 4) != 0) && !this.f25117h2) {
            MessageObject messageObject = this.f25367y7;
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
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new p1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.f25229oe;
    }

    @Override
    public float getAlpha() {
        if (this.Xc) {
            return this.Yc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.c6[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.getAnimatedEmojiSpans():org.telegram.ui.Components.c6[]");
    }

    public float getAnimationOffsetX() {
        return this.Be;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f25223o8) {
            return this.f25193m9;
        }
        return null;
    }

    public jb0 getBackgroundDrawable() {
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
                MessageObject messageObject = this.f25367y7;
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
        if (!this.f25165k8) {
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
            if (this.f25254qd) {
                return (this.L8 - this.J8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.L8 - this.J8;
            if (this.f25165k8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f25254qd) {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25223o8) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.N7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25223o8) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (!this.f25165k8) {
                f7 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f7);
        }
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.L.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f25254qd) {
            if (this.J) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f25165k8 && this.J) {
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
        if (this.f25254qd) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.J && (messageObject2 = this.f25367y7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.J && ((messageObject = this.f25367y7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f25165k8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f25165k8 && this.J) {
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
        if (!this.f25165k8 && this.I) {
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
        r1 r1Var = this.Zc;
        if (r1Var.B1) {
            return AndroidUtilities.lerp(r1Var.A1, this.f25059d0, r1Var.K1);
        }
        return this.f25059d0;
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
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (B3()) {
            if (this.L != null) {
                f10 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f25367y7;
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
        if (z10 && (L0(this.f25367y7) || this.L5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f25222o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f25367y7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f25323v8;
                if (!this.f25165k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f7);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((d0) arrayList.get(i15)).f23965c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.S != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.S.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25074e0 != null) {
            backgroundDrawableLeft = Math.min(this.I8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f7;
        int dp;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.isOutOwner() && (L0(this.f25367y7) || this.L5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f25222o7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f25367y7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f25323v8;
                if (!this.f25165k8 && !this.J) {
                    f7 = 7.0f;
                } else {
                    f7 = 1.0f;
                }
                dp = i11 + AndroidUtilities.dp(f7);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                float f10 = widthForButtons;
                i12 = Math.max(i12, ((int) (d0Var.f23965c * f10)) + dp + ((int) (d0Var.e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.S != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.S.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25074e0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.f25048c4;
    }

    public float getCaptionX() {
        r1 r1Var = this.Zc;
        if (r1Var.f24943w0) {
            if (r1Var.C0) {
                this.f25234p4 += r1Var.f24875g0;
            } else if (r1Var.f24928s0) {
                float f7 = this.f25234p4;
                float f10 = r1Var.K1;
                this.f25234p4 = c3.h0.z(1.0f, f10, r1Var.f24920q0, f7 * f10);
            } else if (!this.f25367y7.isVoice() || !TextUtils.isEmpty(this.f25367y7.caption)) {
                this.f25234p4 += r1Var.f24875g0;
            }
        }
        return this.f25234p4;
    }

    public float getCaptionY() {
        float f7 = this.f25247q4;
        r1 r1Var = this.Zc;
        if (r1Var.f24943w0) {
            if (r1Var.C0) {
                return f7 - getTranslationY();
            }
            if (r1Var.f24928s0) {
                float f10 = r1Var.K1;
                return c3.h0.z(1.0f, f10, r1Var.f24924r0, f7 * f10);
            }
            return f7;
        }
        return f7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f25244q1;
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
        if (this.f25367y7.shouldDrawWithoutBackground()) {
            f7 = this.f25211nb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f7 = this.f25211nb;
            intrinsicHeight = org.telegram.ui.ActionBar.y6.F3.getIntrinsicHeight();
        }
        return (int) (f7 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.l5 l5Var = this.f25294t8;
        if (l5Var == null) {
            return 0;
        }
        int i10 = l5Var.getBounds().left;
        if (!this.f25367y7.isOutOwner() && this.Zc.f24955z0 != 1.0f) {
            boolean z10 = this.f25254qd;
            if ((z10 || !this.f25165k8) && !this.J) {
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
        org.telegram.ui.ActionBar.l5 l5Var = this.f25294t8;
        if (l5Var == null) {
            return getWidth();
        }
        int i10 = l5Var.getBounds().right;
        if (this.f25367y7.isOutOwner() && this.Zc.f24955z0 != 1.0f && (((z10 = this.f25254qd) || !this.f25165k8) && !this.J)) {
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

    public j1 getDelegate() {
        return this.Jc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Zc.f24884i0;
    }

    public float getDeltaLeft() {
        return this.Zc.f24875g0;
    }

    public float getDeltaRight() {
        return this.Zc.f24879h0;
    }

    public float getDeltaTop() {
        return this.Zc.f24889j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f7;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z10 = this.f25145j2;
        float f10 = 0.0f;
        r1 r1Var = this.Zc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f25215o0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f25159k2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f25215o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f25367y7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f25215o0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.f25367y7.isOutOwner()) {
                    f7 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25323v8;
                    if (this.f25367y7.type == 19) {
                        f7 -= Math.max(0.0f, ((Math.max(this.J9, this.L9) + f7) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f25165k8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f25323v8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f25323v8;
                        if (!this.J) {
                            f11 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f7 = extraTextX + dp;
                }
                dp2 = (f7 + r1Var.f24875g0) - AndroidUtilities.dp(1.33f);
                float f12 = this.f25230p0;
                if (r1Var.f24926r2) {
                    AndroidUtilities.lerp(r1Var.f24922q2, f12, r1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (r1Var != null) {
            f10 = r1Var.f24879h0;
        }
        float f13 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.f25367y7.isOutOwner() && !this.f25165k8 && !this.J) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f13 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f25288t2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f25273s2) - this.f25288t2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f7;
        float f10 = this.f25217o2;
        r1 r1Var = this.Zc;
        if (!r1Var.f24926r2) {
            f7 = (-r1Var.f24889j0) + r1Var.f24884i0;
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
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f25367y7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f25119h4;
    }

    public float getExplanationX() {
        return this.f25022a7;
    }

    public float getExplanationY() {
        return this.f25036b7;
    }

    public int getExtraInsetHeight() {
        float f7;
        int i10;
        int i11 = this.f25290t4;
        boolean z10 = this.N1;
        bh.y0 y0Var = this.N;
        if (z10) {
            if (y0Var.f4230s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f25090f2;
        }
        if (this.f25152j9) {
            if (h4()) {
                f7 = 41.3f;
            } else {
                f7 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f7);
        }
        if (!y0Var.f4230s && this.f25367y7.shouldDrawReactionsInLayout()) {
            return i11 + y0Var.f4227p;
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
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f25079e5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.K1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.L1);
                }
                TLRPC.PhotoSize photoSize2 = this.f25079e5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f25367y7.messageOwner.attachPath;
                }
                if (this.f25367y7.isSendError() && (i10 = this.K1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f25367y7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f7;
        TLRPC.User user = this.Yb;
        if (user != null && user.f22177id == 0) {
            f7 = this.f25193m9.getCenterX();
        } else {
            f7 = this.f25140ib + this.H1;
        }
        return (int) f7;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f25103g1;
    }

    public float getLastTouchY() {
        return this.f25116h1;
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
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f25367y7).type) != 5) {
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
                } else if (B3()) {
                    i13 = 48;
                }
                dp2 = AndroidUtilities.dp(i13 + 31);
            } else if (i10 == 19) {
                int i15 = messageObject2.textWidth;
                int dp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f);
                if (this.f25223o8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.J8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && L0(this.f25367y7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f25165k8) {
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
            } else if (B3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        } else {
            min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
            if (this.F8) {
                f10 = 71.0f;
            } else if (B3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        int i16 = min - dp;
        MessageObject messageObject3 = this.f25367y7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && L0(this.f25367y7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.f25268rd && ((messageObject = this.f25367y7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.J8 - (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.F8 && (this.f25367y7.type == 5 || this.K1 == 6)) {
            return this.J8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.J8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        r1 r1Var = this.Zc;
        if (r1Var.Z1) {
            return AndroidUtilities.lerp(r1Var.Y1, this.f25202n2, r1Var.K1);
        }
        return this.f25202n2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f25382z7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25367y7;
    }

    public int getNameStatusX() {
        int i10;
        float f7 = this.Wa + this.Va;
        int i11 = this.f25383z8;
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
        return getTopicSeparatorTopPadding() + this.V + this.f25115h0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f25367y7;
        if (messageObject == null) {
            messageObject = this.f25382z7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.J0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        o4 o4Var = this.F7;
        if (o4Var != null) {
            return o4Var.e + o4Var.h;
        }
        return this.S0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.S0;
    }

    public ArrayList<q1> getPollButtons() {
        return this.Y5;
    }

    public float getPollButtonsLeft() {
        int dp;
        if (getMessageObject() != null && getMessageObject().isOutOwner()) {
            dp = (AndroidUtilities.dp(3.0f) + this.L8) - this.J8;
        } else if (this.G8) {
            dp = AndroidUtilities.dp(82.0f);
        } else if (B3()) {
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
        MessageObject messageObject2 = this.f25367y7;
        if (messageObject2 != null && this.K != null && messageObject2.hasValidGroupId()) {
            messageObject = this.K.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25367y7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.O0;
    }

    public bh.y0 getReactionsLayout() {
        return this.N;
    }

    public org.telegram.ui.ActionBar.u6 getResourcesProvider() {
        return this.Id;
    }

    public qp0 getSeekBarWaveform() {
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
        return this.Ae;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.K;
        if (groupedMessages != null) {
            ArrayList<MessageObject> arrayList = groupedMessages.messages;
            int size = arrayList.size();
            int i10 = 0;
            long j11 = 0;
            while (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                    j10 = message2.paid_message_stars;
                } else {
                    j10 = 0;
                }
                j11 += j10;
            }
            return j11;
        }
        MessageObject messageObject3 = this.f25367y7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        r1 r1Var = this.Zc;
        if (r1Var.f24952y1) {
            return AndroidUtilities.lerp(r1Var.f24948x1, this.V, r1Var.K1);
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
        return this.f25200n0;
    }

    public int getTextY() {
        return this.f25256r0;
    }

    public float getTimeAlpha() {
        return this.f25189m5;
    }

    public float getTimeX() {
        int i10;
        r1 r1Var = this.Zc;
        if (r1Var.f24880h1) {
            i10 = AndroidUtilities.lerp(r1Var.f24876g1, this.f25266rb, r1Var.K1);
        } else {
            i10 = this.f25266rb;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (h4()) {
            if (this.f25152j9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f25367y7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.K8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f25152j9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f25202n2 + this.Lc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        r1 r1Var = this.Zc;
        if (r1Var.f24937u1) {
            return AndroidUtilities.lerp(r1Var.f24933t1, this.f25088f0, r1Var.K1);
        }
        return this.f25088f0;
    }

    public r1 getTransitionParams() {
        return this.Zc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        r1 r1Var = this.Zc;
        if (r1Var == null || (messageObject = this.f25367y7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (r1Var.l1) {
            if (this.f25250q8) {
                return r1Var.K1;
            }
            return 1.0f - r1Var.K1;
        } else if (this.f25250q8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Sc;
    }

    public int getWidthForButtons() {
        r1 r1Var = this.Zc;
        if (r1Var.N1) {
            return AndroidUtilities.lerp(r1Var.O1, this.f25278s7, r1Var.K1);
        }
        return this.f25278s7;
    }

    @Override
    public final boolean h() {
        return this.f25227oc;
    }

    public final void h1(s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        s1Var.N7 = this.N7;
        s1Var.f25023a8 = this.f25023a8;
        s1Var.P7 = this.P7;
        s1Var.Q7 = this.Q7;
        s1Var.R7 = this.R7;
        s1Var.S7 = this.S7;
        s1Var.T7 = this.T7;
        s1Var.U7 = this.U7;
        s1Var.V7 = this.V7;
        s1Var.W7 = this.W7;
        s1Var.X7 = this.X7;
        s1Var.Y7 = this.Y7;
        s1Var.f25037b8 = this.f25037b8;
        s1Var.f25052c8 = this.f25052c8;
        s1Var.f25067d8 = this.f25067d8;
        s1Var.E8 = this.E8;
        s1Var.F8 = this.F8;
        s1Var.G8 = this.G8;
        s1Var.H8 = this.H8;
        s1Var.I8 = this.I8;
    }

    public final void h2(Canvas canvas, Integer num, float f7, boolean z10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        bh.y0 y0Var = this.N;
        if (!y0Var.f4216b) {
            y0Var.D = f7;
            y0Var.E = z10;
            y0Var.d(canvas, this.Zc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f25382z7 != null) {
            return this.D7;
        }
        return this.G;
    }

    public final boolean h4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.h4():boolean");
    }

    @Override
    public final boolean i() {
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

    public final void i1(s1 s1Var) {
        xh.f fVar;
        if (s1Var != null && (fVar = s1Var.Fb) != null) {
            int i10 = (Integer) fVar.f51915k.get(s1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Gb = i10;
            xh.f fVar2 = this.Fb;
            if (fVar2 != null) {
                fVar2.f51915k.put(this, i10);
            }
        }
    }

    public final void i2(om omVar, Canvas canvas, int i10, Integer num, float f7) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        bh.y0 y0Var = this.N;
        if (!y0Var.f4216b) {
            y0Var.D = f7;
            y0Var.f(omVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f7) {
        if (this.f25294t8 != null) {
            int i10 = this.f25323v8;
            if (f7 >= i10 && f7 <= i10 + this.f25338w8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(int i10, boolean z10, boolean z11) {
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
        if ((i10 != -1 && i10 != 1) || this.f25177l7 == z10) {
            return;
        }
        this.f25177l7 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f25191m7 = f10;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    @Override
    public void invalidate() {
        j1 j1Var;
        if (this.f25367y7 == null) {
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f25198me;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f25214ne;
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
        if (!this.Od || (j1Var = this.Jc) == null) {
            return;
        }
        j1Var.n();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.K != null) {
            c3();
        }
    }

    public final void j1(s1 s1Var) {
        s1Var.d4(this.Zd, this.f25043be, this.f25058ce, this.f25073de, this.f25086ee, this.J0, this.K0, this.Uc, this.Vc, this.f25028ae);
    }

    public final void j2(Canvas canvas, RectF rectF, float f7) {
        String str;
        o0();
        if (this.f25355xa) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f7, f7, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f7, f7, org.telegram.ui.ActionBar.y6.f23425h2);
        }
    }

    public final boolean j3() {
        if (this.f25382z7 != null) {
            return this.E7;
        }
        return this.H;
    }

    public final void j4() {
        di.f3 f3Var = this.S0;
        k4((f3Var.getImageWidth() / 2.0f) + f3Var.getImageX(), (f3Var.getImageHeight() / 2.0f) + f3Var.getImageY());
    }

    @Override
    public final void k() {
        j1 j1Var;
        if (this.f25367y7 != null) {
            Runnable runnable = this.f25198me;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f25214ne;
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
            if (this.Od && (j1Var = this.Jc) != null) {
                j1Var.n();
            }
        }
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
                    this.X8[i10] = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
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
        if ((!this.f25296ta || z10) && this.f25310ua != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition == null || (groupedMessages = this.K) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f25367y7.isOutOwner();
                r1 r1Var = this.Zc;
                if (isOutOwner) {
                    float dp2 = r1Var.f24885i1 - AndroidUtilities.dp(40.0f);
                    this.Ga = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.K;
                    if (groupedMessages2 != null) {
                        this.Ga = (groupedMessages2.transitionParams.offsetLeft - this.Be) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + r1Var.f24890j1;
                    this.Ga = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.K;
                    if (groupedMessages3 != null) {
                        this.Ga = (groupedMessages3.transitionParams.offsetRight - this.Be) + dp3;
                    }
                }
                float f14 = 0.0f;
                if (this.f25310ua == 4) {
                    this.Ha = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.M8 + r1Var.f24884i0) - AndroidUtilities.dp(41.0f);
                    this.Ha = dp4;
                    MessageObject messageObject = this.f25367y7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f25252qb) {
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
                    if (this.f25367y7.shouldDrawReactions()) {
                        bh.y0 y0Var = this.N;
                        if (!y0Var.f4216b) {
                            if (this.f25254qd) {
                                this.Ha -= (1.0f - getVideoTranscriptionProgress()) * y0Var.i(r1Var.K1);
                            } else if (y0Var.f4215a > 0.0f) {
                                this.Ha -= y0Var.i(r1Var.K1);
                            }
                        }
                    }
                }
                if (this.f25310ua != 4) {
                    float dp5 = ((this.M8 + r1Var.f24884i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Ha < dp5) {
                        this.Ha = dp5;
                    }
                }
                if (this.f25367y7.type == 19) {
                    if (this.f25310ua == 3 && this.Z8 != null) {
                        this.Ha = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Ha = 0.0f;
                    }
                }
                if (!this.f25367y7.isOutOwner() && this.f25254qd && !this.f25117h2) {
                    if (this.f25223o8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.F8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.f25268rd) {
                        f11 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f11 = 0.0f;
                    }
                    if (this.f25268rd) {
                        f14 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (r1Var.f24896k2) {
                        if (this.f25268rd) {
                            f12 = r1Var.K1;
                        } else {
                            f12 = 1.0f - r1Var.K1;
                        }
                        f11 = (1.0f - getVideoTranscriptionProgress()) * f12 * dp;
                        if (this.f25268rd) {
                            f13 = r1Var.K1;
                        } else {
                            f13 = 1.0f - r1Var.K1;
                        }
                        f14 = (1.0f - getVideoTranscriptionProgress()) * f13 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ga -= f11;
                    this.Ha -= f14;
                }
                this.va = true;
                if (this.f25310ua == 3) {
                    if (!this.f25345x || this.f25367y7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!ww0.f34579k0) {
                    float f17 = this.Ga;
                    float f18 = this.Ha;
                    float dp6 = AndroidUtilities.dp(32.0f) + f17;
                    float f19 = this.Ha;
                    if (this.f25340wa == 5) {
                        f7 = 64.0f;
                    } else {
                        f7 = 32.0f;
                    }
                    float dp7 = f19 + AndroidUtilities.dp(f7);
                    RectF rectF = this.f25049c5;
                    rectF.set(f17, f18, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.va = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.f25360y.e) * 255.0f);
                    int i11 = -1;
                    if (i10 != 255) {
                        float f20 = this.Ga;
                        f10 = 2.0f;
                        i11 = canvas.saveLayerAlpha(f20, this.Ha, AndroidUtilities.dp(32.0f) + f20, this.Ha + AndroidUtilities.dp(64.0f), i10);
                    } else {
                        f10 = 2.0f;
                    }
                    o0();
                    String str = "paintChatActionBackground";
                    if (this.f25310ua == 4 && this.f25340wa == 5 && this.f25355xa) {
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
                        if (this.f25355xa) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.y6.f23425h2);
                    }
                    int i12 = this.f25310ua;
                    if (i12 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        z.o(L2, (this.Ga + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f10), (this.Ha + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f10));
                        L2.draw(canvas);
                    } else if (i12 == 4) {
                        int dp12 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp13 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L22 = L2("drawableCloseIcon");
                        int intrinsicWidth = L22.getIntrinsicWidth() / 2;
                        int intrinsicHeight = L22.getIntrinsicHeight() / 2;
                        L22.setBounds(dp12 - intrinsicWidth, dp13 - intrinsicHeight, intrinsicWidth + dp12, intrinsicHeight + dp13);
                        z.o(L22, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, L22.getBounds().centerX(), L22.getBounds().centerY());
                        L22.draw(canvas);
                        canvas.restore();
                        if (this.f25340wa == 5) {
                            Drawable L23 = L2("drawableMoreIcon");
                            int intrinsicWidth2 = L23.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = L23.getIntrinsicHeight() / 2;
                            L23.setBounds(dp12 - intrinsicWidth2, dp13 - intrinsicHeight2, dp12 + intrinsicWidth2, dp13 + intrinsicHeight2);
                            z.o(L23, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(34.0f));
                            L23.draw(canvas);
                        }
                    } else {
                        int dp14 = (int) (this.Ga + AndroidUtilities.dp(16.0f));
                        int dp15 = (int) (this.Ha + AndroidUtilities.dp(16.0f));
                        Drawable L24 = L2("drawableShareIcon");
                        int intrinsicWidth3 = L24.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = L24.getIntrinsicHeight() / 2;
                        L24.setBounds(dp14 - intrinsicWidth3, dp15 - intrinsicHeight3, dp14 + intrinsicWidth3, dp15 + intrinsicHeight3);
                        z.o(L24, this.Ga + AndroidUtilities.dp(4.0f), this.Ha + AndroidUtilities.dp(4.0f));
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
        MessageObject messageObject = this.f25367y7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f25367y7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f25367y7.isSponsored() || this.f25367y7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.O7 && !this.f25067d8) {
            return false;
        }
        TLRPC.Message message2 = this.f25367y7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f25367y7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.f25067d8 && this.f25367y7.type == 0) || ((!this.E && this.Ya && this.N7 && (!this.f25367y7.isOutOwner() || ((this.f25367y7.isSupergroup() && this.f25367y7.isFromGroup()) || this.f25367y7.isRepostPreview))) || (this.f25367y7.isImportedForward() && this.f25367y7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(float f7, float f10) {
        s1 s1Var;
        di.f3 f3Var = this.S0;
        this.Eb = (float) Math.sqrt(Math.pow(f3Var.getImageHeight(), 2.0d) + Math.pow(f3Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f25367y7;
        if (!messageObject.isMediaSpoilersRevealed && this.Bb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                s1Var = this;
                s1Var.X3(messageObject, this.K, this.F, this.E, this.G, this.H);
                MessageObject messageObject2 = s1Var.f25367y7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (s1Var.K != null) {
                    s1Var.O0.p(0.0f, false);
                }
            } else {
                s1Var = this;
            }
            s1Var.Cb = f7;
            s1Var.Db = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ee.a(s1Var.Eb * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(ds.f27533j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new i1(0, this));
            duration.start();
        }
    }

    @Override
    public final boolean l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.l():boolean");
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
            this.f25271s0 = AndroidUtilities.dp(60.0f) + this.f25271s0;
            if (z10 != this.W2) {
                this.W2 = 0;
                int B = wh.B(75.0f, this.J8, i10);
                float dpf2 = (this.J8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.X2;
                if (arrayList == null) {
                    this.X2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.U2) {
                    this.W2 |= 1;
                    this.X2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), B, dpf2));
                }
                if (this.T2) {
                    this.W2 |= 2;
                    this.X2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), B, dpf2));
                }
                if (this.V2) {
                    this.W2 |= 4;
                    this.X2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), B, dpf2));
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
        if (this.K1 != 7 || ((messageObject = this.f25367y7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f25286t0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.N.i(this.Zc.K1) + AndroidUtilities.dp(this.J ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f25367y7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            cd0 cd0Var = org.telegram.ui.ActionBar.y6.E3;
            if (h4()) {
                if (this.f25367y7.shouldDrawWithoutBackground()) {
                    f13 = 1.0f;
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, this.Id);
                    int i11 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    cd0Var.getClass();
                    f15 = 4.0f;
                    z.o(cd0Var, ((i11 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    cd0Var.setAlpha((int) (this.f25189m5 * 255.0f * f18));
                } else {
                    f13 = 1.0f;
                    f15 = 4.0f;
                    w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23661tc, this.Id);
                    int i12 = this.L8;
                    f16 = z14 ? 24.0f : 22.0f;
                    cd0Var.getClass();
                    z.o(cd0Var, ((i12 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    cd0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 1.0f;
                f15 = 4.0f;
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Na, this.Id);
                cd0Var.getClass();
                f14 = 18.5f;
                z.o(cd0Var, (this.L8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f11 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f10);
                cd0Var.setAlpha((int) (f18 * 255.0f));
            }
            cd0Var.a(w02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, cd0Var.getBounds().centerX(), cd0Var.getBounds().centerY());
            }
            cd0Var.draw(canvas);
            cd0Var.setAlpha(255);
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
            if (h4()) {
                if (z15) {
                    canvas.save();
                }
                if (this.f25367y7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f13 - f12), 0.0f);
                        }
                        z.o(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        z.o(drawable, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f25189m5 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f13 - f12) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        z.o(org.telegram.ui.ActionBar.y6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.y6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.y6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        z.o(org.telegram.ui.ActionBar.y6.F3, (this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.y6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.y6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.y6.F3.setAlpha((int) (this.f25189m5 * 255.0f * f18));
                    drawable = org.telegram.ui.ActionBar.y6.F3;
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
                    z.o(L2, ((this.L8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
                } else {
                    L2 = L2(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    z.o(L2, ((this.L8 - AndroidUtilities.dp(f14)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
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
            if (h4()) {
                Drawable L22 = this.f25367y7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.y6.G3;
                z.o(L22, ((this.L8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f10);
                L22.setAlpha((int) (this.f25189m5 * 255.0f * f18));
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
                z.o(L23, (this.L8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f11 - AndroidUtilities.dp((this.F || this.E) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f10);
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
            if (h4()) {
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
            RectF rectF = this.f25049c5;
            rectF.set((int) (dp + dp4), f20, AndroidUtilities.dp(14.0f) + i10, AndroidUtilities.dp(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.y6.f23314b2.getAlpha();
            org.telegram.ui.ActionBar.y6.f23314b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.y6.f23314b2);
            org.telegram.ui.ActionBar.y6.f23314b2.setAlpha(alpha);
            z.o(org.telegram.ui.ActionBar.y6.f23464j4, AndroidUtilities.dp(6.0f) + i10, f20 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.y6.f23464j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.y6.f23464j4.getBounds().centerX(), org.telegram.ui.ActionBar.y6.f23464j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.y6.f23464j4.draw(canvas);
            org.telegram.ui.ActionBar.y6.f23464j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean l3(org.telegram.messenger.MessageObject r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.l3(org.telegram.messenger.MessageObject):boolean");
    }

    public final boolean l4() {
        j1 j1Var;
        if (getCurrentMessagesGroup() == null && (j1Var = this.Jc) != null && j1Var.b2() != null && this.Jc.b2().z(this.f25367y7)) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (this.f25367y7.hasMediaSpoilers() && !this.f25367y7.isMediaSpoilersRevealed && this.Bb == 0.0f && this.T0.getBitmap() != null) {
            return false;
        }
        return true;
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
                Math.ceil(org.telegram.ui.ActionBar.y6.N2.measureText("00:00"));
                this.D8 = i12 - AndroidUtilities.dp(18.0f);
                z3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.pb;
                if (!this.f25117h2) {
                    this.J8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.y6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.H5.f31989m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.L1)) {
                this.K1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    s4();
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.C2.measureText(str2));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.y6.C2, this.U3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                CharSequence ellipsize = TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.y6.O2, i15 - AndroidUtilities.dp(12.0f), truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.y6.O2;
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
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.y6.P2, i15, truncateAt), org.telegram.ui.ActionBar.y6.P2, i15, alignment, 1.0f, 0.0f, false);
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
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.y6.N2.measureText(AndroidUtilities.formatShortDuration(i16, i16)));
                AndroidUtilities.dp(86.0f);
                this.D8 = this.J8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.L1, messageObject.hasValidGroupId())) {
                this.K1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.y6.C2;
                    int i17 = this.A4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f25304u4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    this.U3 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.C2.measureText(str));
                    this.T3 = new StaticLayout(AndroidUtilities.formatFileSize(this.L1.size), org.telegram.ui.ActionBar.y6.C2, this.U3, alignment2, 1.0f, 0.0f, false);
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
                StaticLayout c10 = qx0.c(documentFileName, org.telegram.ui.ActionBar.y6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
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
                TextPaint textPaint3 = org.telegram.ui.ActionBar.y6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.L1.size))));
                this.A4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.L1.size) + " " + FileLoader.getDocumentExtension(this.L1), org.telegram.ui.ActionBar.y6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.A4 < 0) {
                        this.A4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f25304u4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.y6.C2, this.A4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (this.M1) {
                    this.f25079e5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f25093f5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f25367y7.isHiddenSensitive() || (DownloadController.getInstance(this.I7).getAutodownloadMask() & 1) == 0) {
                        this.f25079e5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f25079e5;
                    di.f3 f3Var = this.S0;
                    if (photoSize != null && photoSize != this.f25093f5) {
                        BitmapDrawable bitmapDrawable = this.f25367y7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f25093f5 = null;
                            this.f25107g5 = bitmapDrawable;
                        }
                    } else {
                        this.f25079e5 = null;
                        f3Var.setNeedsQualityThumb(true);
                        f3Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f25120h5 = "86_86_b";
                    f3Var.setImage(ImageLocation.getForObject(this.f25079e5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f25093f5, messageObject.photoThumbsObject), this.f25120h5, this.f25107g5, 0L, null, messageObject, 1);
                }
                return i11;
            }
        }
        return 0;
    }

    public void m2(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.m2(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean m3() {
        if (this.f25382z7 != null) {
            return this.C7;
        }
        return this.F;
    }

    public final void m4(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.Y5;
            if (i10 < arrayList.size()) {
                q1 q1Var = (q1) arrayList.get(i10);
                if (this.Jc.L(this, q1Var.f24808t, !q1Var.f24797i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f25367y7.getDialogId();
                    int i11 = this.I7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f25367y7);
                    int i12 = this.I7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, q1Var.f24808t.f22175id, !q1Var.f24797i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!q1Var.f24797i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        q1Var.f24812y.p(userOrChat);
                        q1Var.f24813z.setForUserOrChat(userOrChat, q1Var.f24812y);
                        q1Var.f24805q = new r11(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.R8[i10].f(-1, !q1Var.f24797i, true);
                    if (this.f25319v4 != null) {
                        if (!this.f25367y7.isOutOwner() && this.f25367y7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f25319v4.t(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f25367y7.getFromChatId())), true, true);
                        } else {
                            this.f25319v4.t(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    q1Var.f24797i = !q1Var.f24797i;
                    invalidate();
                    return;
                }
                this.f25366y6 = false;
            }
        }
    }

    public final void n0() {
        ds dsVar;
        boolean z10 = this.f25185m1;
        if (z10 || this.f25201n1) {
            if ((z10 && this.f25216o1 == 1.0f) || (!z10 && this.f25216o1 == 0.0f)) {
                this.f25201n1 = false;
            }
            if (z10) {
                dsVar = ds.f27531g;
            } else {
                dsVar = ds.f27532i;
            }
            this.f25244q1 = (int) Math.ceil(dsVar.getInterpolation(this.f25216o1) * AndroidUtilities.dp(35.0f));
            if (this.f25367y7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f25244q1 = 0;
                }
            }
            if (!this.f25367y7.isOutOwner() || this.f25367y7.hasWideCode) {
                A4();
            }
            if (this.f25201n1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f25231p1;
                this.f25231p1 = elapsedRealtime;
                if (this.f25185m1) {
                    float f7 = (((float) j10) / 200.0f) + this.f25216o1;
                    this.f25216o1 = f7;
                    if (f7 > 1.0f) {
                        this.f25216o1 = 1.0f;
                    }
                } else {
                    float f10 = this.f25216o1 - (((float) j10) / 200.0f);
                    this.f25216o1 = f10;
                    if (f10 <= 0.0f) {
                        this.f25216o1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void n2(Canvas canvas, float f7, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        di.f3 f3Var;
        char c10;
        int i11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        r1 r1Var;
        float f13;
        boolean z14;
        float f14;
        boolean z15;
        s1 s1Var;
        String str;
        boolean z16;
        float f15;
        float dp;
        float f16;
        boolean z17;
        r1 r1Var2;
        boolean z18;
        boolean z19;
        r1 r1Var3;
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
        r1 r1Var4;
        float f22;
        boolean z29;
        int i16;
        boolean z30;
        MessageObject messageObject;
        float j10;
        TextPaint textPaint;
        int i17;
        s1 s1Var2 = this;
        Canvas canvas2 = canvas;
        if (((s1Var2.f25311ub && !s1Var2.M) || !s1Var2.h4()) && staticLayout != null) {
            MessageObject messageObject2 = s1Var2.f25367y7;
            if ((!messageObject2.deleted || s1Var2.L == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.y6.T2;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, s1Var2.Id);
                    if (s1Var2.f3()) {
                        i17 = s1Var2.f25367y7.isOutOwner() ? org.telegram.ui.ActionBar.y6.f23546nb : org.telegram.ui.ActionBar.y6.f23568od;
                    } else {
                        i17 = s1Var2.f25367y7.isOutOwner() ? org.telegram.ui.ActionBar.y6.f23640sb : org.telegram.ui.ActionBar.y6.f23548nd;
                    }
                    textPaint2.setColor(i0.a.f(s1Var2.getVideoTranscriptionProgress(), w02, org.telegram.ui.ActionBar.y6.w0(i17, s1Var2.Id)));
                } else if (s1Var2.h4()) {
                    if (s1Var2.f25367y7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, s1Var2.Id));
                    } else {
                        org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23492kd, s1Var2.Id));
                    }
                } else if (s1Var2.f25367y7.isOutOwner()) {
                    org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(z11 ? org.telegram.ui.ActionBar.y6.f23546nb : org.telegram.ui.ActionBar.y6.f23640sb, s1Var2.Id));
                } else {
                    org.telegram.ui.ActionBar.y6.T2.setColor(org.telegram.ui.ActionBar.y6.w0(z11 ? org.telegram.ui.ActionBar.y6.f23568od : org.telegram.ui.ActionBar.y6.f23548nd, s1Var2.Id));
                }
                float f23 = s1Var2.getTransitionParams().J1 ? s1Var2.getTransitionParams().K1 * f7 : f7;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (s1Var2.J && !s1Var2.h4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f24 = s1Var2.M8;
                r1 r1Var5 = s1Var2.Zc;
                if (r1Var5.f24943w0) {
                    f24 += r1Var5.f24884i0;
                }
                MessageObject.GroupedMessages groupedMessages = s1Var2.K;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f12 = f10;
                } else {
                    f24 -= s1Var2.getTranslationY();
                    f12 = f10 + s1Var2.K.transitionParams.offsetRight;
                }
                float f25 = f24;
                float f26 = f12;
                if (s1Var2.J && s1Var2.h4()) {
                    f25 += AndroidUtilities.dp(1.0f);
                }
                float f27 = f25;
                if (r1Var5.f24943w0) {
                    float f28 = s1Var2.Be;
                    f12 += f28;
                    f26 += f28;
                }
                float f29 = f12;
                boolean shouldDrawReactions = s1Var2.f25367y7.shouldDrawReactions();
                bh.y0 y0Var = s1Var2.N;
                if (shouldDrawReactions && y0Var.f4216b) {
                    if (r1Var5.f24943w0 && r1Var5.f24879h0 != 0.0f) {
                        j10 = y0Var.j(1.0f);
                    } else {
                        j10 = y0Var.j(r1Var5.K1);
                    }
                    f26 += j10;
                }
                if (r1Var5.T0) {
                    f26 = ic.a.d(1.0f, r1Var5.K1, r1Var5.Y0, f26);
                }
                float f30 = f26;
                boolean h42 = s1Var2.h4();
                RectF rectF = s1Var2.f25049c5;
                di.f3 f3Var2 = s1Var2.S0;
                if (h42) {
                    int i18 = -(s1Var2.f25152j9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (s1Var2.f25367y7.shouldDrawWithoutBackground()) {
                        M2 = s1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = s1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f31 = f23;
                    f3Var = f3Var2;
                    org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (s1Var2.f25189m5 * 255.0f * f31));
                    MessageObject messageObject3 = s1Var2.f25367y7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f17 = f29;
                        f18 = f31;
                    } else {
                        float currentAlpha = f3Var.isCrossfadingWithOldImage() ? 1.0f : f3Var.getCurrentAlpha();
                        if (!f3Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f17 = f29;
                        f18 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = s1Var2.f25367y7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.r5 r5Var = s1Var2.f25172l0;
                        f18 *= r5Var == null ? 0.0f : r5Var.e();
                    }
                    M2.setAlpha((int) c3.h0.E(alpha, s1Var2.f25189m5, f18, 0.6f));
                    int i19 = s1Var2.K1;
                    if (i19 != 7 && i19 != 6 && s1Var2.f25367y7.type != 19) {
                        int[] roundRadius = f3Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z28 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = s1Var2.f25367y7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z28 = false;
                    }
                    MessageObject messageObject6 = s1Var2.f25367y7;
                    float dp4 = f17 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (s1Var2.f25130i0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z28 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = s1Var2.f25367y7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f32 = f18;
                    float f33 = dp4;
                    if (s1Var2.K1 != 7 || ((messageObject = s1Var2.f25367y7) != null && messageObject.isRoundOnce())) {
                        photoBottom = s1Var2.getPhotoBottom() + s1Var2.f25286t0;
                    } else {
                        photoBottom = f27 - ((1.0f - s1Var2.getVideoTranscriptionProgress()) * (y0Var.i(r1Var5.K1) + AndroidUtilities.dp(s1Var2.J ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float dp7 = f34 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.y6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f35 = dp5 - dp6;
                    float f36 = dp6 + dp5 + f11;
                    int i20 = z28 ? 12 : 8;
                    if (s1Var2.f25367y7.isOutOwner()) {
                        f19 = f36;
                        i14 = (s1Var2.f25367y7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f19 = f36;
                        i14 = 0;
                    }
                    rectF.set(f35, dp7, f19 + AndroidUtilities.dp(i20 + i14), dp7 + max);
                    o4 o4Var = s1Var2.F7;
                    if (o4Var != null) {
                        float f37 = dp2;
                        canvas2.save();
                        Path path = o4Var.f24602t;
                        path.rewind();
                        path.addRoundRect(rectF, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!s1Var2.f25367y7.isQuickReply()) {
                        if (s1Var2.f25367y7.hasMediaSpoilers() && s1Var2.f25367y7.type != 5) {
                            Path path2 = s1Var2.E5;
                            path2.rewind();
                            float f38 = dp2;
                            path2.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = s1Var2.f25367y7.needDrawBluredPreview() ? f3Var : s1Var2.T0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = s1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * s1Var2.f25205n5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f38, f38, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            s1Var2.o0();
                            float f39 = dp2;
                            canvas2.drawRoundRect(rectF, f39, f39, M2);
                            if (M2 == s1Var2.M2("paintChatActionBackground") && s1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.y6.f23425h2.getAlpha();
                                org.telegram.ui.ActionBar.y6.f23425h2.setAlpha((int) (alpha4 * s1Var2.f25189m5 * f32));
                                canvas2.drawRoundRect(rectF, f39, f39, org.telegram.ui.ActionBar.y6.f23425h2);
                                org.telegram.ui.ActionBar.y6.f23425h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = s1Var2.f25367y7;
                    float dp8 = f40 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (s1Var2.f25367y7.shouldDrawReactions() && y0Var.f4216b) {
                        s1Var2.v4();
                        y0Var.D = 0.0f;
                        y0Var.E = false;
                        y0Var.d(canvas2, r1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(s1Var2.Zb) || s1Var2.Zb.megagroup) && (s1Var2.f25367y7.messageOwner.flags & 1024) == 0 && s1Var2.Vb == null && !s1Var2.Y7) {
                        i12 = i18;
                        i15 = 2;
                        f27 = f27;
                        c10 = 7;
                        f20 = dp8;
                        f23 = f31;
                    } else {
                        float lineWidth = (s1Var2.pb - staticLayout.getLineWidth(0)) + dp8;
                        if (y0Var.f4216b && !y0Var.f4230s) {
                            lineWidth -= y0Var.f4228q;
                        }
                        float f41 = lineWidth;
                        int g7 = r1Var5.g();
                        int i21 = r1Var5.a2;
                        if (i21 >= 0 && i21 != g7 && !s1Var2.f25170kd) {
                            s1Var2.t1(i21, g7, z10);
                        }
                        boolean z31 = s1Var2.f25170kd;
                        if (z31) {
                            g7 = s1Var2.f25128hd;
                        }
                        boolean z32 = (g7 & 4) != 0;
                        boolean z33 = (g7 & 8) != 0;
                        if (z31) {
                            int i22 = s1Var2.f25142id;
                            if ((i22 & 4) != 0) {
                                i16 = i22;
                                z30 = true;
                            } else {
                                i16 = i22;
                                z30 = false;
                            }
                            float f42 = i18;
                            f21 = f41;
                            boolean z34 = z32;
                            i15 = 2;
                            c10 = 7;
                            i12 = i18;
                            r1Var4 = r1Var5;
                            boolean z35 = (i16 & 8) != 0;
                            s1Var2.L1(canvas2, z30, z35, f27, f31, f42, f33, 1.0f - s1Var2.f25155jd, z11);
                            boolean z36 = z30;
                            boolean z37 = z33;
                            s1Var2.L1(canvas, z34, z37, f27, f31, f42, f33, s1Var2.f25155jd, z11);
                            f27 = f27;
                            f22 = f33;
                            z29 = z34;
                            f23 = f31;
                            if (!s1Var2.f25367y7.isOutOwner()) {
                                if (!z36 && !z35) {
                                    s1Var2.p2(canvas, f23, f42, f22, 1.0f - s1Var2.f25155jd, z11);
                                }
                                if (!z29 && !z37) {
                                    s1Var2.p2(canvas, f23, f42, f22, s1Var2.f25155jd, z11);
                                }
                            }
                        } else {
                            f21 = f41;
                            boolean z38 = z32;
                            i15 = 2;
                            boolean z39 = z33;
                            c10 = 7;
                            i12 = i18;
                            r1Var4 = r1Var5;
                            if (!s1Var2.f25367y7.isOutOwner() && !z38 && !z39) {
                                s1Var2.p2(canvas, f31, i12, f33, 1.0f, z11);
                            }
                            s1Var2 = this;
                            s1Var2.L1(canvas, z38, z39, f27, f31, i12, f33, 1.0f, z11);
                            f27 = f27;
                            f22 = f33;
                            z29 = z38;
                            f23 = f31;
                        }
                        if (s1Var2.f25367y7.isOutOwner()) {
                            canvas2 = canvas;
                            s1Var2.p2(canvas2, f23, i12, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        r1Var5 = r1Var4;
                        r1Var5.a2 = r1Var4.g();
                        if (z29 && z10 && s1Var2.getParent() != null) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f43 = f30 + f20;
                    s1Var2.f25195mb = f43;
                    float dp9 = (f34 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    s1Var2.f25211nb = dp9;
                    canvas2.translate(f43, dp9);
                    xh.g.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.y6.T2.setAlpha(255);
                    i13 = i15;
                    z13 = z28;
                    z12 = false;
                } else {
                    f3Var = f3Var2;
                    c10 = 7;
                    if (s1Var2.f25367y7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (s1Var2.K8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(s1Var2.f25152j9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f44 = -staticLayout.getLineLeft(0);
                    if (s1Var2.f25367y7.shouldDrawReactions() && y0Var.f4216b) {
                        s1Var2.v4();
                        y0Var.D = 0.0f;
                        y0Var.E = false;
                        y0Var.d(canvas2, r1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(s1Var2.Zb) || s1Var2.Zb.megagroup) && (s1Var2.f25367y7.messageOwner.flags & 1024) == 0 && s1Var2.Vb == null && !r1Var5.F && !s1Var2.Y7 && !r1Var5.B) {
                        z12 = false;
                    } else {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f44;
                        if (y0Var.f4216b && !y0Var.f4230s) {
                            lineWidth2 -= y0Var.f4228q;
                        }
                        float f45 = lineWidth2;
                        int g10 = r1Var5.g();
                        int i23 = r1Var5.a2;
                        if (i23 >= 0 && i23 != g10 && !s1Var2.f25170kd) {
                            s1Var2.t1(i23, g10, z10);
                        }
                        boolean z40 = s1Var2.f25170kd;
                        if (z40) {
                            g10 = s1Var2.f25128hd;
                        }
                        boolean z41 = (g10 & 4) != 0;
                        boolean z42 = (g10 & 8) != 0;
                        if (z40) {
                            int i24 = s1Var2.f25142id;
                            if ((i24 & 4) != 0) {
                                f14 = f23;
                                z15 = true;
                            } else {
                                f14 = f23;
                                z15 = false;
                            }
                            boolean z43 = (i24 & 8) != 0;
                            float f46 = f14;
                            float f47 = i12;
                            z12 = false;
                            r1Var = r1Var5;
                            s1Var2.L1(canvas2, z15, z43, f27, f46, f47, f29, 1.0f - s1Var2.f25155jd, z11);
                            boolean z44 = z15;
                            boolean z45 = z43;
                            boolean z46 = z41;
                            boolean z47 = z42;
                            s1Var2.L1(canvas, z46, z47, f27, f46, f47, f29, s1Var2.f25155jd, z11);
                            f27 = f27;
                            f13 = f29;
                            z14 = z46;
                            f23 = f46;
                            if (!s1Var2.f25367y7.isOutOwner()) {
                                if (!z44 && !z45) {
                                    s1Var2.p2(canvas, f23, f47, f13, 1.0f - s1Var2.f25155jd, z11);
                                }
                                if (!z14 && !z47) {
                                    s1Var2.p2(canvas, f23, f47, f13, s1Var2.f25155jd, z11);
                                }
                            }
                        } else {
                            r1Var = r1Var5;
                            z12 = false;
                            boolean z48 = z41;
                            boolean z49 = z42;
                            if (!s1Var2.f25367y7.isOutOwner() && !z48 && !z49) {
                                s1Var2.p2(canvas, f23, i12, f29, 1.0f, z11);
                            }
                            s1Var2 = this;
                            float f48 = f23;
                            s1Var2.L1(canvas, z48, z49, f27, f48, i12, f29, 1.0f, z11);
                            f27 = f27;
                            f13 = f29;
                            z14 = z48;
                            f23 = f48;
                        }
                        if (s1Var2.f25367y7.isOutOwner()) {
                            canvas2 = canvas;
                            s1Var2.p2(canvas2, f23, i12, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        r1Var5 = r1Var;
                        r1Var5.a2 = r1Var.g();
                        if (z14 && z10 && s1Var2.getParent() != null) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        f44 = f45;
                    }
                    canvas2.save();
                    if (r1Var5.T0 && r1Var5.K1 != 1.0f) {
                        if (r1Var5.U0 != null) {
                            canvas2.translate(f30 + f44, ((f27 - AndroidUtilities.dp((s1Var2.F || s1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.y6.T2.getAlpha();
                            org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (alpha5 * r1Var5.K1));
                            r1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.y6.T2.setAlpha(alpha5);
                            xh.g.f(canvas2, r1Var5.V0);
                            i13 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.y6.T2.getAlpha();
                            canvas2.save();
                            float f49 = i12;
                            canvas2.translate(r1Var5.f24876g1 + f44, ((f27 - AndroidUtilities.dp((s1Var2.F || s1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f49);
                            float f50 = alpha6;
                            i13 = 2;
                            org.telegram.ui.ActionBar.y6.T2.setAlpha((int) ((1.0f - r1Var5.K1) * f50));
                            xh.g.f(canvas2, r1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f30 + f44, ((f27 - AndroidUtilities.dp((s1Var2.F || s1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f49);
                            org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (f50 * r1Var5.K1));
                            xh.g.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.y6.T2.setAlpha(alpha6);
                        }
                    } else {
                        i13 = 2;
                        float f51 = f30 + f44;
                        s1Var2.f25195mb = f51;
                        float dp10 = ((f27 - AndroidUtilities.dp((s1Var2.F || s1Var2.E) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        s1Var2.f25211nb = dp10;
                        canvas2.translate(f51, dp10);
                        xh.g.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z13 = z12;
                }
                int i25 = i12;
                if (s1Var2.f25367y7.isOutOwner()) {
                    int g11 = r1Var5.g();
                    int i26 = r1Var5.a2;
                    if (i26 >= 0 && i26 != g11 && !s1Var2.f25170kd) {
                        s1Var2.t1(i26, g11, z10);
                    }
                    if (s1Var2.f25170kd) {
                        g11 = s1Var2.f25128hd;
                    }
                    if ((g11 & 1) != 0) {
                        f16 = f23;
                        z17 = true;
                    } else {
                        f16 = f23;
                        z17 = z12;
                    }
                    boolean z50 = (g11 & 2) != 0 ? true : z12;
                    if ((g11 & 4) != 0) {
                        r1Var2 = r1Var5;
                        z18 = true;
                    } else {
                        r1Var2 = r1Var5;
                        z18 = z12;
                    }
                    boolean z51 = (g11 & 8) != 0 ? true : z12;
                    if (s1Var2.f25269re != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, s1Var2.f25269re);
                        z19 = true;
                    } else {
                        z19 = z12;
                    }
                    if (s1Var2.f25170kd) {
                        int i27 = s1Var2.f25142id;
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
                            r1Var3 = r1Var2;
                            boolean z53 = z21;
                            z18 = z23;
                            z27 = z12;
                            f15 = 0.0f;
                            str = "paintChatTimeBackground";
                            s1Var2.l2(canvas2, z53, z50, z18, z25, f16, z13, i25, f27, s1Var2.f25155jd, true, z11);
                        } else {
                            r1Var3 = r1Var2;
                            z27 = z12;
                            boolean z54 = z21;
                            f15 = 0.0f;
                            str = "paintChatTimeBackground";
                            float f52 = i25;
                            s1Var2.l2(canvas, z22, z52, z24, z26, f16, z13, f52, f27, 1.0f - s1Var2.f25155jd, false, z11);
                            z18 = z23;
                            s1Var2.l2(canvas, z54, z50, z18, z25, f16, z13, f52, f27, s1Var2.f25155jd, false, z11);
                        }
                        s1Var = this;
                        canvas2 = canvas;
                        z20 = z27;
                    } else {
                        r1Var3 = r1Var2;
                        f15 = 0.0f;
                        z20 = z12;
                        str = "paintChatTimeBackground";
                        canvas2 = canvas;
                        l2(canvas2, z17, z50, z18, z51, f16, z13, i25, f27, 1.0f, false, z11);
                        s1Var = this;
                    }
                    if (z19) {
                        canvas2.restore();
                    }
                    r1Var3.a2 = r1Var3.g();
                    z16 = z20;
                    z16 = z20;
                    if (z10 && z18) {
                        z16 = z20;
                        if (s1Var.getParent() != null) {
                            ((View) s1Var.getParent()).invalidate();
                            z16 = z20;
                        }
                    }
                } else {
                    s1Var = s1Var2;
                    str = "paintChatTimeBackground";
                    z16 = z12;
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (s1Var.Mb != null) {
                    if (s1Var.Kb == f15 || s1Var.Lb == f15) {
                        s1Var.r0();
                    }
                    Path path3 = s1Var.Qb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f3Var.getImageX(), f3Var.getImageY(), f3Var.getImageX2(), f3Var.getImageY2());
                    int[] roundRadius2 = f3Var.getRoundRadius();
                    float f53 = roundRadius2[z16 ? 1 : 0];
                    float[] fArr = s1Var.Rb;
                    fArr[1] = f53;
                    fArr[z16 ? 1 : 0] = f53;
                    float f54 = roundRadius2[1];
                    fArr[3] = f54;
                    fArr[i13] = f54;
                    float f55 = roundRadius2[i13];
                    fArr[5] = f55;
                    fArr[4] = f55;
                    float f56 = roundRadius2[3];
                    fArr[c10] = f56;
                    fArr[6] = f56;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF2.set(s1Var.Kb - AndroidUtilities.dp(12.0f), s1Var.Lb - AndroidUtilities.dp(8.0f), s1Var.Kb + org.telegram.ui.ActionBar.y6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + s1Var.Mb.getWidth() + AndroidUtilities.dp(12.0f), s1Var.Lb + s1Var.Mb.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (s1Var.Fb == null) {
                        if (s1Var.Pb == null) {
                            s1Var.Pb = new xh.g();
                        }
                        s1Var.Pb.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                        s1Var.Pb.setBounds((int) f3Var.getImageX(), (int) f3Var.getImageY(), (int) f3Var.getImageX2(), (int) f3Var.getImageY2());
                        s1Var.Pb.draw(canvas2);
                    }
                    s1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, s1Var.getWidth(), s1Var.getHeight(), (int) (s1Var.Jb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.y6.f23445i2.getAlpha();
                    org.telegram.ui.ActionBar.y6.f23445i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.y6.f23445i2);
                    org.telegram.ui.ActionBar.y6.f23445i2.setAlpha(alpha7);
                    canvas.translate(s1Var.Kb + AndroidUtilities.dp(4.0f), s1Var.Lb);
                    Drawable drawable = org.telegram.ui.ActionBar.y6.L3;
                    drawable.setBounds(z16 ? 1 : 0, z16 ? 1 : 0, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.y6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.y6.L3.draw(canvas);
                    float f57 = f15;
                    canvas.translate(org.telegram.ui.ActionBar.y6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), f57);
                    xh.g.f(canvas, s1Var.Mb);
                    canvas.restore();
                    if (s1Var.L2 != null && f3Var.getVisible() && s1Var.f25174l3 == 0) {
                        int i28 = SharedConfig.bubbleRadius;
                        int i29 = i13;
                        if (i28 > i29) {
                            dp = AndroidUtilities.dp(i28 - i29);
                            z13 = SharedConfig.bubbleRadius < 10 ? z16 ? 1 : 0 : true;
                        } else {
                            dp = AndroidUtilities.dp(i28);
                        }
                        int imageX = (int) (f3Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (f3Var.getImageY() + AndroidUtilities.dp(6.0f));
                        float dp11 = imageX - AndroidUtilities.dp(4.0f);
                        float dp12 = imageY - AndroidUtilities.dp(1.5f);
                        int dp13 = AndroidUtilities.dp(4.0f) + s1Var.f25232p2 + imageX;
                        if (z13) {
                            f57 = 2.0f;
                        }
                        rectF.set(dp11, dp12, AndroidUtilities.dp(f57) + dp13, AndroidUtilities.dp(1.5f) + s1Var.L2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, s1Var.M2(str));
                        canvas.save();
                        int i30 = z16;
                        if (z13) {
                            i30 = i29;
                        }
                        canvas.translate(imageX + i30, imageY);
                        xh.g.f(canvas, s1Var.L2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f25382z7 != null) {
            return this.B7;
        }
        return this.E;
    }

    public final void n4() {
        MessageObject messageObject;
        int i10;
        boolean z10;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.f25129he && (messageObject = this.f25367y7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.t5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f25048c4;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.pc = org.telegram.ui.Components.c6.update(i10, (View) this, false, this.pc, arrayList);
            } else {
                j1 j1Var = this.Jc;
                if (j1Var != null && j1Var.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.pc = org.telegram.ui.Components.c6.update(i10, this, z10, this.pc, this.f25367y7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f25367y7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                j1 j1Var2 = this.Jc;
                if (j1Var2 == null || !j1Var2.d()) {
                    z11 = true;
                }
                richMessageLayout.invalidateAnimatedEmojiInParent = z11;
                this.f25367y7.richLayout.updateAnimatedEmojis(i10);
            }
        }
    }

    public final void o0() {
        p0(getX(), this.Sc, getMeasuredWidth(), this.Tc);
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
            this.f25233p3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.f25047c3;
            if (charSequence == null) {
                int i11 = this.f25032b3;
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
                            TL_stars.StarGift starGift = this.Fe;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.I7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z10 = false;
                                } else {
                                    if (this.Fe.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new zq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
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
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f25367y7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f25367y7.isSponsored() && this.J8 < (measureText = (int) (org.telegram.ui.ActionBar.y6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.J8 = measureText;
            }
            int dp = this.J8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.y6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.y6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            int i13 = this.f25032b3;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.f25233p3 = i12 - AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f25271s0;
            this.f25271s0 = dp2;
            if (this.f25367y7.type == 12) {
                this.f25271s0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f25367y7.isSponsored()) {
                this.f25271s0 = AndroidUtilities.dp(2.0f) + this.f25271s0;
            }
            StaticLayout staticLayout2 = this.O2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f25233p3 - Math.ceil(this.O2.getLineWidth(0)))) / 2;
                if (this.f25032b3 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f25203n3 = ceil + i10;
                int lineLeft = (int) this.O2.getLineLeft(0);
                this.f25218o3 = lineLeft;
                this.f25203n3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f25205n5 > 0.0f) {
            di.f3 f3Var = this.S0;
            if (f3Var.getVisible()) {
                MessageObject messageObject2 = this.f25367y7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f25367y7.getVideoStartsTimestamp() / ((float) this.f25367y7.getDuration());
                } else {
                    videoSavedProgress = this.f25367y7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = f3Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(f3Var.getImageX(), f3Var.getImageY(), f3Var.getImageX2(), f3Var.getImageY2());
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
                        rectF.set(f3Var.getImageX(), f3Var.getImageY(), f3Var.getImageX2(), f3Var.getImageY2());
                        this.Hb.addRoundRect(rectF, this.Ib, Path.Direction.CW);
                        canvas.clipPath(this.Hb);
                    }
                    org.telegram.ui.ActionBar.y6.f23537n2.setColor(org.telegram.ui.ActionBar.y6.o1(this.f25205n5 * 0.35f, -1));
                    canvas.drawRect(f3Var.getImageX(), f3Var.getImageY2() - AndroidUtilities.dp(3.0f), f3Var.getImageX2(), f3Var.getImageY2(), org.telegram.ui.ActionBar.y6.f23537n2);
                    org.telegram.ui.ActionBar.y6.f23537n2.setColor(org.telegram.ui.ActionBar.y6.o1(this.f25205n5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f3Var.getImageX() - AndroidUtilities.dp(2.0f), f3Var.getImageY2() - AndroidUtilities.dp(3.0f), (f3Var.getImageWidth() * clamp01) + f3Var.getImageX(), f3Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23537n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f25254qd && this.f25268rd) {
            return true;
        }
        return false;
    }

    public final void o4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.o4(boolean, boolean, boolean):void");
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && imageReceiver == this.S0 && messageObject.isAnimatedSticker()) {
            this.Jc.u1(this.f25367y7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        s1 s1Var;
        float f7;
        float f10;
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.f25114ge;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f25114ge = null;
        }
        this.f25114ge = NotificationCenter.getInstance(this.I7).createObserversGroup(this).add(NotificationCenter.userInfoDidLoad).addGlobal(NotificationCenter.startSpoilers).addGlobal(NotificationCenter.stopSpoilers).addGlobal(NotificationCenter.emojiLoaded).addGlobal(NotificationCenter.didUpdatePremiumGiftStickers);
        MessageObject messageObject = this.f25367y7;
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
        sh.g gVar = this.f25035b6;
        if (gVar != null) {
            gVar.a();
        }
        sh.g gVar2 = this.f25050c6;
        if (gVar2 != null) {
            gVar2.a();
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q1) obj).q();
        }
        MessageObject messageObject2 = this.f25382z7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            s1Var = this;
            s1Var.X3(messageObject2, this.A7, this.C7, this.B7, this.D7, this.E7);
            s1Var.f25382z7 = null;
            s1Var.A7 = null;
        } else {
            s1Var = this;
        }
        CheckBoxBase checkBoxBase = s1Var.l1;
        if (checkBoxBase != null) {
            checkBoxBase.f26086l = true;
        }
        CheckBoxBase checkBoxBase2 = s1Var.f25158k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26086l = true;
        }
        m31 m31Var = s1Var.f25074e0;
        if (m31Var != null) {
            m31Var.a();
        }
        CheckBoxBase checkBoxBase3 = s1Var.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26086l = true;
        }
        if (s1Var.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = s1Var.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f26086l = true;
                i11++;
            }
        }
        s1Var.M0 = true;
        float f11 = 0.0f;
        s1Var.Be = 0.0f;
        s1Var.Ae = 0.0f;
        s1Var.f25244q1 = 0;
        A4();
        ImageReceiver imageReceiver = s1Var.f25193m9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        E0();
        MessageObject messageObject3 = s1Var.f25367y7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = s1Var.K1;
        if (i12 == 4 && s1Var.f25207n7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(s1Var.f25367y7);
            s1Var.D1 = isPlayingMessage;
            if (isPlayingMessage) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            s1Var.F1 = f10;
            s1Var.E1 = 0;
        } else {
            s1Var.D1 = false;
            s1Var.F1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && s1Var.f25376z1) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            s1Var.C1 = f7;
        }
        if (getDelegate() != null && getDelegate().b2() != null) {
            t9 b22 = getDelegate().b2();
            b22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == b22.f24121w) {
                b22.W = s1Var;
            }
        }
        if (s1Var.K1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(s1Var.f25367y7)) {
                f11 = 1.0f;
            }
            s1Var.f25213nd = f11;
        }
        bh.y0 y0Var = s1Var.N;
        ArrayList arrayList2 = y0Var.v;
        y0Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((bh.v0) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = s1Var.ed;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        o4 o4Var = s1Var.F7;
        if (o4Var != null) {
            ArrayList arrayList3 = o4Var.f24588c;
            if (!o4Var.C) {
                o4Var.C = true;
                xh.f fVar = o4Var.f24594l;
                if (fVar != null) {
                    fVar.b(o4Var.f24586a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    n4 n4Var = (n4) arrayList3.get(i14);
                    if (!n4Var.M) {
                        n4Var.M = true;
                        n4Var.f24528f.onAttachedToWindow();
                    }
                }
            }
        }
        r4();
        MessageObject messageObject4 = s1Var.f25367y7;
        if (messageObject4 != null && messageObject4.type == 20 && s1Var.Mb != null) {
            invalidate();
        }
        org.telegram.ui.Components.r5 r5Var = s1Var.f25099fc;
        if (r5Var != null) {
            r5Var.a();
        }
        org.telegram.ui.Components.r5 r5Var2 = s1Var.gc;
        if (r5Var2 != null) {
            r5Var2.a();
        }
        xh.f fVar2 = s1Var.Fb;
        if (fVar2 != null) {
            if (fVar2.f51913i) {
                xh.f y3 = y3();
                s1Var.Fb = y3;
                Integer num = s1Var.Gb;
                if (num != null) {
                    y3.f51915k.put(this, num);
                }
            } else {
                fVar2.a(this);
            }
        }
        n0 n0Var = s1Var.v;
        if (n0Var != null) {
            ArrayList arrayList4 = n0Var.f24513q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((m0) arrayList4.get(i15)).a();
            }
        }
        iy0 iy0Var = s1Var.f25075e1;
        if (iy0Var != null) {
            for (int i16 = 0; i16 < iy0Var.f29445b; i16++) {
                iy0Var.f29446c[i16].a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.ObserversGroup observersGroup = this.f25114ge;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f25114ge = null;
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
            checkBoxBase.f26086l = false;
        }
        sh.g gVar = this.f25035b6;
        if (gVar != null) {
            gVar.f48670b.onDetachedFromWindow();
            gVar.f48683x.f();
        }
        sh.g gVar2 = this.f25050c6;
        if (gVar2 != null) {
            gVar2.f48670b.onDetachedFromWindow();
            gVar2.f48683x.f();
        }
        ag.t tVar = this.f25350x4;
        if (tVar != null) {
            tVar.b();
            this.f25350x4 = null;
        }
        RichMessageLayout richMessageLayout = this.f25367y7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        r1 r1Var = this.Zc;
        RichMessageLayout richMessageLayout2 = r1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.Y5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q1) obj).r();
        }
        org.telegram.ui.Components.l9 l9Var = this.X3;
        if (l9Var != null) {
            l9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f25158k1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26086l = false;
        }
        if (this.R8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.R8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f26086l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.B9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26086l = false;
        }
        this.M0 = false;
        o4 o4Var = this.F7;
        if (o4Var != null) {
            o4Var.e();
        }
        this.f25193m9.onDetachedFromWindow();
        m31 m31Var = this.f25074e0;
        if (m31Var != null) {
            m31Var.b();
        }
        E0();
        if (this.G4 && this.E4 != null && this.F4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.E4);
            this.G4 = false;
        }
        iy0 iy0Var = this.f25075e1;
        if (iy0Var != null) {
            iy0Var.a(this);
        }
        DownloadController.getInstance(this.I7).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().b2() != null) {
            t9 b22 = getDelegate().b2();
            b22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == b22.f24121w) {
                b22.W = null;
            }
        }
        r1Var.f24939v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
            org.telegram.ui.ActionBar.y6.z0().f30772i = null;
        }
        ValueAnimator valueAnimator = this.f25183ld;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25183ld.cancel();
        }
        this.N.q();
        this.f25170kd = false;
        FlagSecureReason flagSecureReason = this.ed;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.r5 r5Var = this.f25099fc;
        if (r5Var != null) {
            r5Var.b();
        }
        org.telegram.ui.Components.r5 r5Var2 = this.gc;
        if (r5Var2 != null) {
            r5Var2.b();
        }
        xh.f fVar = this.Fb;
        if (fVar != null) {
            fVar.b(this);
        }
        n0 n0Var = this.v;
        if (n0Var != null) {
            ArrayList arrayList2 = n0Var.f24513q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                m0 m0Var = (m0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = m0Var.f24410c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].onDetachedFromWindow();
                        i13++;
                    }
                }
            }
        }
        ag.n.d().g(this.f25184le);
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
        o4(true, z11, false);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        bn0 C4 = C4();
        int i10 = 0;
        if (C4 != null && motionEvent.isFromSource(8194)) {
            float topicSeparatorTopPadding = getTopicSeparatorTopPadding() + getStarsPriceTopPadding() + this.f25115h0 + this.f25256r0;
            motionEvent.offsetLocation(-this.f25200n0, -topicSeparatorTopPadding);
            if (C4.f26870n != null && C4.f26871r) {
                Rect rect = C4.padding;
                motionEvent.offsetLocation((-rect.left) + C4.f26875y, -rect.top);
                try {
                    if (motionEvent.getX() >= 0.0f && motionEvent.getX() < C4.u() && motionEvent.getY() >= 0.0f && motionEvent.getY() < C4.f26874x) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C4.f26870n.l(motionEvent, z10);
                    Rect rect2 = C4.padding;
                    motionEvent.offsetLocation(rect2.left - C4.f26875y, rect2.top);
                } catch (Throwable th2) {
                    Rect rect3 = C4.padding;
                    motionEvent.offsetLocation(rect3.left - C4.f26875y, rect3.top);
                    throw th2;
                }
            }
            motionEvent.offsetLocation(this.f25200n0, topicSeparatorTopPadding);
        }
        int x9 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f25241pd;
                if (i10 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i10)).contains(x9, z22)) {
                    int keyAt = sparseArray.keyAt(i10);
                    if (keyAt != this.Dd) {
                        this.Dd = keyAt;
                        K3(keyAt, 32768, null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        s1 s1Var;
        int i12;
        MessageObject messageObject = this.f25367y7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.V4 == AndroidUtilities.displaySize.y)) {
            s1Var = this;
        } else {
            this.f25375z0 = true;
            MessageObject messageObject2 = this.f25367y7;
            this.f25367y7 = null;
            s1Var = this;
            s1Var.Z3(messageObject2, this.K, this.F, this.E, this.G, false);
            s1Var.f25375z0 = false;
        }
        y4();
        int i13 = s1Var.V + s1Var.f25088f0 + s1Var.f25115h0 + s1Var.f25271s0 + s1Var.f25300u0 + s1Var.f25059d0;
        jh.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(s1Var.f25367y7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f15916a.getHeight() - draftMessageMeasureController.f15916a.getPaddingTop()) - draftMessageMeasureController.f15916a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.e = z10;
            if (draftMessageMeasureController.f15917b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        s1Var.f25229oe = Math.max(0, i12 - i13);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), i12);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f25367y7.loadedFileSize = j10;
        p1(j10, j11);
        if (this.f25347x1) {
            this.P0.p(min, true);
        } else {
            this.O0.p(min, true);
        }
        int i10 = this.K1;
        if (i10 != 3 && i10 != 5) {
            if (this.W4 != 0) {
                if (this.X4 != 1) {
                    o4(false, false, false);
                }
            } else if (this.O4 != 1) {
                o4(false, false, false);
            }
        } else if (this.W4 != 0) {
            if (this.X4 != 1) {
                o4(false, false, false);
            }
        } else if (this.O4 != 4) {
            o4(false, false, false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f25367y7.loadedFileSize = j10;
        RadialProgress2 radialProgress2 = this.O0;
        radialProgress2.p(min, true);
        if (j10 == j11 && ((this.L != null || this.f25367y7.isPaid()) && SendMessagesHelper.getInstance(this.I7).isSendingMessage(this.f25367y7.getId()) && ((i10 = this.O4) == 1 || (i10 == 4 && this.K1 == 5)))) {
            this.Q0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f25362y1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f25362y1 = j11;
        }
        p1(j10, j11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f25279s8) {
            MessageObject messageObject = this.f25367y7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f25367y7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f25367y7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f25367y7.caption);
            }
        }
    }

    @Override
    public final void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.u6 u6Var = this.Id;
        if (u6Var != null) {
            u6Var.b(f7, f10 + this.V + this.f25088f0 + this.f25115h0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.y6.q(f7, f10 + this.V + this.f25088f0 + this.f25115h0, i10, i11);
        }
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.p1(long, long):void");
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
        float m10;
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
        bh.y0 y0Var = this.N;
        if (y0Var.f4216b) {
            f13 = y0Var.j(1.0f);
        } else {
            f13 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.y6.T2.getAlpha();
        float N2 = N2(f10);
        StaticLayout staticLayout = this.Vb;
        r1 r1Var = this.Zc;
        if (staticLayout == null && !r1Var.F) {
            f17 = 2.0f;
            z15 = z11;
            f14 = 10.0f;
            d = 1.0d;
        } else {
            boolean z18 = r1Var.f24880h1;
            f14 = 10.0f;
            if (z18) {
                f15 = this.f25266rb;
            } else {
                f15 = f11;
            }
            float f22 = f15 + f13;
            d = 1.0d;
            boolean z19 = r1Var.F;
            if (z19 && r1Var.H == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && r1Var.H != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z19 && r1Var.H != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f25254qd || !r1Var.l1) && z18 && !z12) {
                if (z13) {
                    f22 = r1Var.I;
                } else {
                    float f23 = r1Var.I;
                    float f24 = r1Var.K1;
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
            if (r1Var.f24943w0) {
                f22 += this.Be;
            }
            if (h4()) {
                if (this.f25367y7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.y6.f23316b4;
                }
            } else if (!this.f25367y7.isOutOwner()) {
                if (z10) {
                    L2 = org.telegram.ui.ActionBar.y6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.y6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float m11 = z.m(L2, f22, N2, org.telegram.ui.ActionBar.y6.T2.getTextSize());
            if (z12) {
                f16 = r1Var.K1 * f21;
            } else if (z13) {
                f16 = (1.0f - r1Var.K1) * f21;
            } else {
                f16 = f21;
            }
            L2.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f20, f20, org.telegram.messenger.t.b(AndroidUtilities.dp(3.0f) + m11, this.Wb, 2.0f, f22), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (r1Var.F) {
                if (z14) {
                    canvas.save();
                    f17 = 2.0f;
                    org.telegram.ui.ActionBar.y6.T2.setAlpha((int) ((1.0d - r1Var.K1) * alpha));
                    canvas.translate(f22 + m11 + AndroidUtilities.dp(3.0f), N2);
                    r1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    f17 = 2.0f;
                }
                org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (alpha * f16));
            } else {
                f17 = 2.0f;
            }
            canvas.save();
            canvas.translate(f22 + m11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Vb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = r1Var.H;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.Vb != null) {
                f13 += m11 + this.Wb + AndroidUtilities.dp(10.0f);
            }
            if (z15) {
                canvas.restore();
            }
            if (r1Var.F) {
                org.telegram.ui.ActionBar.y6.T2.setAlpha(alpha);
            }
            r1Var.J = f22;
        }
        if (this.Sb != null) {
            boolean z20 = r1Var.f24880h1;
            if (z20) {
                f19 = this.f25266rb;
            } else {
                f19 = f11;
            }
            float f25 = f19 + f13;
            if ((!this.f25254qd || !r1Var.l1) && z20) {
                float f26 = r1Var.K;
                float f27 = r1Var.K1;
                f25 = (f25 * f27) + ((1.0f - f27) * f26);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.K;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f25 += transitionParams2.offsetRight;
                }
            }
            if (r1Var.f24943w0) {
                f25 += this.Be;
            }
            if (h4()) {
                if (this.f25367y7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.y6.f23297a4;
                }
            } else if (!this.f25367y7.isOutOwner()) {
                if (z10) {
                    L23 = org.telegram.ui.ActionBar.y6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.y6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float m12 = z.m(L23, f25, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.y6.T2.getTextSize() - AndroidUtilities.dp(f17));
            if (z15) {
                canvas.save();
                canvas.scale(f20, f20, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Tb) / f17) + f25, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f21 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (r1Var.f24863d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.y6.T2.setAlpha((int) ((d - r1Var.K1) * alpha));
                canvas.translate(f25 + m12 + AndroidUtilities.dp(3.0f), N2);
                xh.g.f(canvas, r1Var.f24863d2);
                canvas.restore();
                org.telegram.ui.ActionBar.y6.T2.setAlpha((int) (alpha * r1Var.K1));
            }
            canvas.save();
            canvas.translate(f25 + m12 + AndroidUtilities.dp(3.0f), N2);
            xh.g.f(canvas, this.Sb);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f13 += this.Tb + m12 + AndroidUtilities.dp(f14);
            if (r1Var.f24863d2 != null) {
                org.telegram.ui.ActionBar.y6.T2.setAlpha(alpha);
            }
            r1Var.L = f25;
        }
        boolean z21 = this.Y7;
        if (!z21 && !r1Var.B) {
            return;
        }
        boolean z22 = r1Var.f24880h1;
        if (z22) {
            f18 = this.f25266rb;
        } else {
            f18 = f11;
        }
        float f28 = f18 + f13;
        boolean z23 = r1Var.B;
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
        if (!this.f25254qd && z22 && !z16) {
            if (z17) {
                f28 = r1Var.D;
            } else {
                float f29 = r1Var.D;
                float f30 = r1Var.K1;
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
        if (r1Var.f24943w0) {
            f28 += this.Be;
        }
        if (h4()) {
            if (this.f25367y7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.y6.Z3;
            }
        } else if (!this.f25367y7.isOutOwner()) {
            if (z10) {
                L22 = org.telegram.ui.ActionBar.y6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.y6.U3;
            }
        } else {
            if (z10) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            L22 = L2(str);
        }
        if (r1Var.B) {
            if (this.Y7) {
                L22.setAlpha((int) (f21 * 255.0f * r1Var.K1));
                m10 = z.m(L22, f28, N2, org.telegram.ui.ActionBar.y6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - r1Var.K1) * f21 * 255.0f));
                m10 = z.m(L22, f28, N2, org.telegram.ui.ActionBar.y6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f21 * 255.0f));
            m10 = z.m(L22, f28, N2, org.telegram.ui.ActionBar.y6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
        }
        if (z15) {
            canvas.save();
            canvas.scale(f20, f20, (m10 / f17) + f28, L22.getBounds().centerY());
        }
        L22.draw(canvas);
        L22.setAlpha(255);
        if (z15) {
            canvas.restore();
        }
        r1Var.C = f28;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
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
        MessageObject messageObject = this.f25367y7;
        int i15 = messageObject.type;
        r1 r1Var = this.Zc;
        int i16 = 0;
        boolean z10 = true;
        if (i15 != 1 && i15 != 20 && this.K1 != 4 && i15 != 8 && i15 != 23) {
            float f12 = 43.0f;
            float f13 = 11.0f;
            float f14 = 0.0f;
            float f15 = 10.0f;
            if (this.f25132i2) {
                int i17 = this.f25323v8;
                if (!messageObject.isOutOwner()) {
                    f13 = 17.0f;
                }
                this.f25234p4 = AndroidUtilities.dp(f13) + i17 + this.f25219o4;
                int i18 = this.f25271s0 - this.f25260r4;
                if (this.I) {
                    f15 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f15)) - this.f25186m2) - AndroidUtilities.dp(17.0f);
                if (this.f25152j9 && this.f25310ua != 3) {
                    if (h4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f12);
                this.f25247q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, A3());
            } else {
                if (this.f25254qd) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f25367y7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f25234p4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f25323v8;
                    if (!messageObject.isOutOwner() && !this.f25165k8 && !this.J) {
                        f13 = 17.0f;
                    }
                    this.f25234p4 = AndroidUtilities.dp(f13) + i19 + this.f25219o4;
                }
                int i20 = this.f25271s0 - this.f25260r4;
                if (this.I) {
                    f11 = 9.0f;
                } else {
                    f11 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f11);
                if (this.f25152j9 && this.f25310ua != 3) {
                    if (h4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f12);
                bh.y0 y0Var = this.N;
                if (!y0Var.f4230s && !y0Var.f4216b) {
                    if (this.f25367y7.type == 9 && this.L == null) {
                        f14 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f14) + y0Var.f4227p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f25247q4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Lc, A3());
            }
        } else {
            if (r1Var.f24870f0) {
                f7 = r1Var.m0;
                f10 = r1Var.f24907n0;
                imageHeight = r1Var.f24916p0;
            } else {
                di.f3 f3Var = this.S0;
                float imageX = f3Var.getImageX();
                float imageY = f3Var.getImageY();
                imageHeight = f3Var.getImageHeight();
                f7 = imageX;
                f10 = imageY;
            }
            this.f25234p4 = f7 + AndroidUtilities.dp(5.0f) + this.f25219o4;
            dp = f10 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.f25048c4;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f25247q4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), A3()) + f10;
            z10 = false;
        }
        this.f25234p4 += getExtraTextX();
        MessageObject messageObject2 = this.f25367y7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f25367y7.isSponsored()) {
            if (z10 && this.N1) {
                this.f25247q4 -= (1.0f - A3()) * (AndroidUtilities.dp(16.0f) + this.f25090f2);
            }
            if (z10) {
                i12 = AndroidUtilities.dp(14.0f) + this.f25090f2;
            } else {
                i12 = 0;
            }
            float f16 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f25048c4;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(r1Var);
            }
            this.f25243q0 = (int) ((f16 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), A3())) - r1Var.f24889j0);
        }
        MessageObject messageObject3 = this.f25367y7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f25247q4 += this.f25094f6;
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        s1 s1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        j1 j1Var = this.Jc;
        int i11 = 0;
        if (j1Var != null && j1Var.X1(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f25367y7.type == 16) {
                this.Jc.u0(this, this.S4, this.T4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i10 == R.id.acc_action_small_button) {
            w1();
        } else if (i10 == R.id.acc_action_msg_options) {
            j1 j1Var2 = this.Jc;
            if (j1Var2 != null) {
                if (this.f25367y7.type == 16) {
                    j1Var2.j0(this, 0.0f, 0.0f);
                } else {
                    j1Var2.u0(this, this.S4, this.T4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                j1 j1Var3 = this.Jc;
                if (j1Var3 != null) {
                    TLRPC.Chat chat = this.f25154jc;
                    if (chat != null) {
                        s1Var = this;
                        j1Var3.P(s1Var, chat, this.f25367y7.messageOwner.fwd_from.channel_post, this.f25103g1, this.f25116h1, false);
                    } else {
                        s1Var = this;
                        TLRPC.User user = s1Var.f25127hc;
                        if (user != null) {
                            j1Var3.m0(this, user, s1Var.f25103g1, s1Var.f25116h1);
                        } else if (s1Var.f25169kc != null) {
                            j1Var3.m(this);
                        }
                    }
                }
            } else {
                s1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    j1 j1Var4 = s1Var.Jc;
                    if (j1Var4 != null) {
                        j1Var4.A0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && s1Var.Jc != null && (arrayList = s1Var.f25367y7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            s1Var.Jc.F(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!s1Var.f25367y7.isVoice() || s1Var.f25367y7.isRoundVideo() || (s1Var.f25367y7.isMusic() && MediaController.getInstance().isPlayingMessage(s1Var.f25367y7))) && s1Var.I5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        s1Var = this;
        if (!s1Var.f25367y7.isVoice()) {
        }
        return true;
    }

    public final void q0(int i10, int i11, int i12) {
        int lastLineWidth;
        RichMessageLayout richMessageLayout;
        int i13;
        int i14;
        if (this.f25367y7.isSponsored()) {
            this.J8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        bh.y0 y0Var = this.N;
        if (!y0Var.f4230s && !y0Var.f4216b) {
            lastLineWidth = y0Var.f4232u;
        } else {
            lastLineWidth = this.f25367y7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!y0Var.f4230s && !y0Var.f4216b) {
            if (i10 - lastLineWidth < i11 || this.f25367y7.hasRtl) {
                z10 = true;
            }
            if (this.f25159k2) {
                this.f25271s0 = AndroidUtilities.dp(14.0f) + this.f25271s0;
            }
        } else if ((!this.f25287t1 && ((this.f25117h2 && !this.f25367y7.isSponsored()) || this.N1 || this.f25132i2 || this.f25145j2 || this.f25159k2)) || i10 - lastLineWidth < i11 || this.f25367y7.hasRtl) {
            z10 = true;
        }
        if (this.f25367y7.isUnsupported()) {
            z10 = true;
        }
        if ((y0Var.f4230s || y0Var.f4216b) && (richMessageLayout = this.f25367y7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f25367y7;
        if ((messageObject.hasCodeAtBottom && (y0Var.f4230s || y0Var.f4216b)) || ((messageObject.hasQuoteAtBottom && (y0Var.f4230s || y0Var.f4216b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z10 = true;
        } else {
            i13 = 14;
        }
        if (z10) {
            this.f25271s0 = AndroidUtilities.dp(i13) + this.f25271s0;
            this.K8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.J8 = dp;
            if (this.f25367y7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.pb;
            } else {
                i14 = this.pb;
            }
            this.J8 = org.telegram.messenger.t.z(31.0f, i14, dp);
            return;
        }
        int extraTextX = (i12 - getExtraTextX()) - lastLineWidth;
        if (extraTextX >= 0 && extraTextX <= i11) {
            this.J8 = AndroidUtilities.dp(31.0f) + ((i12 + i11) - extraTextX);
        } else {
            this.J8 = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth + i11);
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
            p1(this.f25367y7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f7, Runnable runnable) {
        org.telegram.ui.ActionBar.l5 l5Var;
        float f10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.O0;
            RectF rectF = radialProgress2.f26245a;
            Paint paint = radialProgress2.f26249g;
            qa0 qa0Var = radialProgress2.f26250i;
            RectF rectF2 = radialProgress2.f26245a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f7) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                l5Var = this.f25308u8;
            } else {
                l5Var = this.f25294t8;
            }
            qa0Var.B = l5Var;
            radialProgress2.f26251j.B = l5Var;
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
                if (this.f25017a1 == null) {
                    yj0 yj0Var = new yj0(R.raw.fire_once, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.f25017a1 = yj0Var;
                    yj0Var.R(this);
                    this.f25017a1.J(true);
                    this.f25017a1.K(1);
                    this.f25017a1.start();
                }
                this.f25017a1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.f25030b1 == null) {
                    i10 = 1;
                    this.f25030b1 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.f25045c1 == null) {
                    Paint paint3 = new Paint(i10);
                    this.f25045c1 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f25060d1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f25060d1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f26262u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.y6.w0(i12, this.Id);
                } else {
                    i11 = radialProgress2.f26255n;
                }
                this.f25030b1.setColor(i11);
                this.f25060d1.setColor(i11);
                qa0Var.a(false);
                this.f25030b1.setShader(qa0Var.d.getShader());
                this.f25060d1.setShader(qa0Var.d.getShader());
                rectF3.set(this.f25017a1.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                float f13 = f10;
                rectF3.inset(f13, f13);
                canvas2.drawRect(rectF3, this.f25030b1);
                this.f25017a1.q(canvas, this.f25045c1, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f25060d1.setAlpha((int) (255.0f * f11));
                this.f25060d1.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.f25049c5;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                qp0 qp0Var = this.H5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - qp0Var.K) * (-360.0f), false, this.f25060d1);
                if (this.S6 == null) {
                    this.S6 = new h31();
                }
                this.S6.a((1.0f - qp0Var.K) * (-360.0f), f11, canvas, this.f25060d1, rectF4);
                canvas2 = canvas;
            } else {
                yj0 yj0Var2 = this.f25017a1;
                if (yj0Var2 != null) {
                    yj0Var2.C(true);
                    this.f25017a1 = null;
                    if (this.S6 != null) {
                        this.S6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f7 * 1.5f) + 10.0f) * f7, this.Z0);
            canvas2.restore();
            if (this.Y0 == null) {
                fi.l lVar = new fi.l(3);
                this.Y0 = lVar;
                z10 = false;
                lVar.e(-1, 0, 0);
                fi.l lVar2 = this.Y0;
                lVar2.f11145i = 14.0f;
                lVar2.c(10.0f);
                this.Y0.f11140a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z11 = true;
                this.Y0.d(1, false, false);
                this.Y0.f11146j = -AndroidUtilities.dpf2(0.33f);
                this.Y0.f11147k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = false;
                z11 = true;
            }
            fi.l lVar3 = this.Y0;
            lVar3.f11145i = f7 * 14.0f;
            lVar3.c(f7 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f7, paint);
            fi.l lVar4 = this.Y0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z11 = z10;
            }
            lVar4.b(z11);
            fi.l lVar5 = this.Y0;
            lVar5.f11150n = cos;
            lVar5.f11151o = sin;
            lVar5.a(canvas2, f7);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.G8 && (messageObject = this.f25367y7) != null && !messageObject.isOutOwner() && this.L == null) {
            return true;
        }
        return false;
    }

    public final void q4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f25367y7 != null) {
            int i10 = this.I7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f25367y7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f25367y7.getDialogId() == clientUserId || this.f25367y7.getDialogId() == 1271266957)) {
                this.Zb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f25367y7.getDialogId() == 489000) {
                long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                if (peerDialogId >= 0) {
                    this.Yb = messagesController.getUser(Long.valueOf(peerDialogId));
                } else {
                    this.Zb = messagesController.getChat(Long.valueOf(-peerDialogId));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.P7) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.Yb = messagesController.getUser(Long.valueOf(j10));
                } else if (peer.channel_id != 0) {
                    if (this.f25367y7.isSavedFromMegagroup()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.Zb = messagesController.getChat(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.Yb = messagesController.getUser(Long.valueOf(peer4.user_id));
                        } else {
                            this.Zb = messagesController.getChat(Long.valueOf(j11));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f25367y7.getDialogId() == clientUserId)) {
                this.Yb = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f25367y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Yb = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f25367y7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Yb = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f25367y7.getDialogId();
                long fromChatId = this.f25367y7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f25367y7.getDialogId())) {
                    if (this.f25367y7.isOutOwner()) {
                        this.Yb = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f25367y7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Yb = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f25367y7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Yb = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f25367y7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Zb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Zb = chat;
                } else {
                    TLRPC.Message message = this.f25367y7.messageOwner;
                    if (message.post) {
                        this.Zb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    public final void r0() {
        if (this.f25367y7.type == 20 && this.Mb != null) {
            di.f3 f3Var = this.S0;
            this.Kb = c3.h0.B(f3Var.getImageWidth(), this.Mb.getWidth(), 2.0f, this.f25323v8);
            this.Lb = c3.h0.B(f3Var.getImageHeight(), this.Mb.getHeight(), 2.0f, f3Var.getImageY() + this.f25354x8);
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
                    checkBoxBaseArr2[i11].f26086l = false;
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

    public final boolean r2(l1 l1Var, t90 t90Var, Layout layout, int i10) {
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
                    l1Var.f24379b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (l1Var.f24379b != i10) {
            return false;
        }
        t90Var.rewind();
        int spanStart = spanned.getSpanStart(this.D5);
        int spanEnd = spanned.getSpanEnd(this.D5);
        t90Var.f28280c = true;
        t90Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, t90Var);
        t90Var.a();
        this.B5.l();
        return true;
    }

    public final void r4() {
        Window window;
        if (this.ed == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new na(this, 3));
                this.ed = flagSecureReason;
                if (this.M0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.ed;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f25375z0) {
            return;
        }
        super.requestLayout();
    }

    public final int s0() {
        if (this.f25301u1) {
            return 4;
        }
        return 8;
    }

    public final void s1(int i10) {
        int i11;
        int w02;
        xm0 xm0Var;
        xm0 xm0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f25367y7.isUnsupported()) {
            if (this.f25367y7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.y6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.y6.Kc;
            }
            w02 = org.telegram.ui.ActionBar.y6.w0(i14, this.Id);
        } else if (i10 == 0 && this.f25164k7) {
            if (this.f25367y7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.y6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.f23737xc;
            }
            w02 = org.telegram.ui.ActionBar.y6.w0(i12, this.Id);
        } else if (i10 == 0 && (xm0Var2 = this.f25025aa) != null) {
            w02 = xm0Var2.i();
        } else if (i10 == 0 && (xm0Var = this.f25054ca) != null) {
            w02 = xm0Var.i();
        } else {
            if (this.f25367y7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.y6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.Kc;
            }
            w02 = org.telegram.ui.ActionBar.y6.w0(i11, this.Id);
        }
        Drawable[] drawableArr = this.f25318v3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            g1 g1Var = new g1(i10, this);
            m1[] m1VarArr = this.f25333w3;
            m1VarArr[i10] = g1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f25367y7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.y6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.y6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.y6.w0(i13, this.Id)}), null, m1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.y6.E1(drawable, w02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(l1 l1Var, t90 t90Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(l1Var, t90Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.s3():boolean");
    }

    public final void s4() {
        boolean z10;
        String formatShortDuration;
        double d;
        double d10;
        double d11;
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null) {
            f1 f1Var = this.Hd;
            if (f1Var != null && f1Var.rewindCount != 0 && f1Var.rewindByBackSeek) {
                messageObject.audioProgress = f1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f25367y7.isPoll()) {
                sh.g gVar = this.f25035b6;
                if (gVar != null) {
                    gVar.n(true);
                }
                sh.g gVar2 = this.f25050c6;
                if (gVar2 != null) {
                    gVar2.n(true);
                }
            }
            int i10 = this.K1;
            double d12 = 0.0d;
            d1 d1Var = this.G5;
            if (i10 == 4) {
                if (d1Var != null) {
                    d1Var.a();
                }
                if (this.f25304u4 == null || (!PhotoViewer.N1(this.f25367y7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f25367y7))) {
                    org.telegram.ui.Components.g6 animation = this.S0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f25367y7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f25367y7.isVideo() && animation.s()) {
                            this.Jc.K(this.f25367y7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f25367y7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
                        d11 -= this.f25367y7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Jc != null && animation.o() >= 3000) {
                            this.Jc.s0();
                        }
                    }
                    if (this.Q5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.A4 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.C2.measureText(formatShortDuration2));
                        this.f25304u4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.y6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.Q5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f25254qd;
            qp0 qp0Var = this.H5;
            int i12 = 0;
            if (z12) {
                if (this.F5) {
                    if (!qp0Var.f31983f) {
                        qp0Var.g(this.f25367y7.audioProgress, true);
                    }
                } else {
                    if (!d1Var.e) {
                        d1Var.i(this.f25367y7.audioProgress);
                        d1Var.f29722q = this.f25367y7.bufferedProgress;
                    }
                    d1Var.a();
                }
                TLRPC.Document document = this.f25367y7.getDocument();
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
                long j10 = this.Yd;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
                    d10 = Math.max(0.0d, d10 - this.f25367y7.audioProgressSec);
                }
                if (this.Q5 != d10) {
                    this.Q5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.T2.measureText(formatLongDuration));
                    this.P5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.y6.T2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f7 = this.f25367y7.audioProgress;
                if (f7 != 0.0f) {
                    this.Cd = f7;
                    if (f7 > 0.9f) {
                        this.Cd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.L1 != null) {
                if (this.F5) {
                    if (!qp0Var.f31983f) {
                        qp0Var.g(this.f25367y7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!d1Var.e) {
                        d1Var.i(this.f25367y7.audioProgress);
                        d1Var.f29722q = this.f25367y7.bufferedProgress;
                    }
                    d1Var.k(this.f25367y7);
                    z10 = false;
                }
                int i13 = this.K1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j11 = this.Yd;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
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
                        d = this.f25367y7.audioProgressSec;
                    }
                    if (this.Q5 != d) {
                        this.Q5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.R5 = (int) Math.ceil(org.telegram.ui.ActionBar.y6.N2.measureText(formatLongDuration2));
                        this.P5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.y6.N2, this.R5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f25367y7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
                        i12 = this.f25367y7.audioProgressSec;
                    }
                    double d13 = i12;
                    if (this.Q5 != d13) {
                        this.Q5 = d13;
                        this.P5 = new StaticLayout(AndroidUtilities.formatShortDuration(i12, (int) duration), org.telegram.ui.ActionBar.y6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.y6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public void setAllowAssistant(boolean z10) {
        this.f25279s8 = z10;
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
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f25345x && !this.f25367y7.isVoice()) || this.C9 == null || this.D9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.L;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.N.f4216b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f7) {
        if (this.Be != f7) {
            this.Be = f7;
            A4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f25223o8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f25193m9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Yb;
                int i10 = this.I7;
                org.telegram.ui.Components.j9 j9Var = this.f25209n9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.f25027ac = userProfilePhoto.photo_small;
                    } else {
                        this.f25027ac = null;
                    }
                    j9Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Yb, j9Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Zb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.f25027ac = chatPhoto.photo_small;
                    } else {
                        this.f25027ac = null;
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
                    this.f25027ac = null;
                    j9Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, j9Var, null, null, 0);
                    return;
                }
            }
            this.f25027ac = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(j1 j1Var) {
        this.Jc = j1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f25144j1 != z10) {
            this.f25144j1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f25345x = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.I0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.f25296ta != z10) {
            this.f25296ta = z10;
            boolean z11 = this.J7;
            this.J7 = true;
            invalidate();
            this.J7 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f25095f8 != z10) {
            this.f25095f8 = z10;
            if (z10) {
                this.f25078e4 = null;
            }
            if (!z10) {
                this.f25151j8 = System.currentTimeMillis();
                this.f25109g8 = true;
                this.f25123h8 = 300;
            } else {
                this.f25109g8 = false;
                this.f25123h8 = 0;
            }
            u4();
            if (this.F5) {
                this.H5.f31991o = f3();
            } else {
                this.G5.f29721p = f3();
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setImageCoords(RectF rectF) {
        W3(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f25214ne = runnable;
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
        this.f25198me = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        u4();
        if (this.F5) {
            this.H5.f31991o = f3();
        } else {
            this.G5.f29721p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.Id = u6Var;
        RadialProgress2 radialProgress2 = this.O0;
        if (radialProgress2 != null) {
            radialProgress2.F = u6Var;
        }
        RadialProgress2 radialProgress22 = this.P0;
        if (radialProgress22 != null) {
            radialProgress22.F = u6Var;
        }
        dn0 dn0Var = this.S3;
        if (dn0Var != null) {
            dn0Var.f27499n = u6Var;
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
        if (this.f25299te != z10) {
            this.f25299te = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f7) {
        if (this.Ae != f7) {
            this.Ae = f7;
            A4();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Ld;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((xh.g) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f25048c4;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.f25048c4.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f25048c4.textLayoutBlocks.get(i11);
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
        this.f25189m5 = f7;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
    }

    public final boolean t0(MotionEvent motionEvent) {
        j1 j1Var;
        if (this.Pa == null || (j1Var = this.Jc) == null || !j1Var.c()) {
            return false;
        }
        boolean contains = this.Qa.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Ra == null) {
            this.Ra = new xc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Ra.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Ra.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Ra.f34725i) {
                this.Jc.K1(this);
            }
            this.Ra.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Ra.c(false);
        }
        return this.Ra.f34725i;
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
        this.f25155jd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25183ld = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f25183ld.setInterpolator(ds.f27530f);
        this.f25142id = i10;
        this.f25128hd = i11;
        this.f25183ld.addUpdateListener(new bh.a0(3, this, z10));
        this.f25183ld.addListener(new bh.f0(22, this, z10));
        this.f25170kd = true;
        this.f25183ld.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f25382z7;
        if (messageObject == null) {
            messageObject = this.f25367y7;
        }
        MessageObject messageObject2 = messageObject;
        this.f25367y7 = null;
        Z3(messageObject2, this.K, this.F, this.E, this.G, false);
    }

    public final boolean t3() {
        MessageObject messageObject = this.f25367y7;
        RichMessageLayout richMessageLayout = messageObject.richLayout;
        if (messageObject.type != 36 || richMessageLayout == null || richMessageLayout.blocks.size() != 1 || !(richMessageLayout.blocks.get(0) instanceof bn0)) {
            return false;
        }
        return true;
    }

    public final void t4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.t4(long):void");
    }

    public final boolean u0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.u0(android.view.MotionEvent):boolean");
    }

    public final void u1() {
        MessageObject messageObject;
        j1 j1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f25367y7.hasMediaSpoilers() && !this.f25367y7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f25367y7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Jc != null && messageObject2.isSensitive()) {
                    this.Jc.x(this);
                    return;
                } else {
                    k4(this.f25103g1, this.f25116h1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f25367y7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f25367y7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Jc.F0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f25367y7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j10 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j10 != 0) {
                    user = MessagesController.getInstance(this.I7).getUser(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Jc.m0(this, user, this.f25103g1, this.f25116h1);
            } else if (i12 == 5) {
                if (this.O4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f25367y7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f25367y7);
                } else {
                    this.Jc.y1(this, this.f25367y7);
                }
            } else if (i12 == 8) {
                int i13 = this.O4;
                if (i13 != -1 && (i13 != 1 || !this.A1 || !this.f25207n7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
            } else if (this.K1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f25367y7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.K1;
                    if (i15 == 1) {
                        if (this.O4 == -1) {
                            this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        j1 j1Var2 = this.Jc;
                        if (j1Var2 != null) {
                            j1Var2.o0(this, this.f25103g1, this.f25116h1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.O4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Jc.x1(this.f25367y7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                qf.d.r(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f25159k2) {
                        if (this.O4 == -1) {
                            this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (j1Var = this.Jc) != null) {
                        if (i14 == 16) {
                            j1Var.j0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            j1Var.u0(this, this.S4, this.T4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
            } else if (this.O4 != -1 && (!this.f25347x1 || (!this.f25207n7 && (((messageObject = this.f25367y7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.A1))))) {
                if (this.f25347x1) {
                    v1(true);
                    return;
                }
                int i16 = this.O4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
            }
        } else {
            int i17 = this.O4;
            if (i17 == -1) {
                this.Jc.o0(this, this.f25103g1, this.f25116h1, false);
            } else if (i17 == 0) {
                v1(false);
            }
        }
    }

    public final boolean u3() {
        bn0 C4 = C4();
        if (C4 != null) {
            long j10 = this.Sd;
            long j11 = 0;
            if (j10 != 0) {
                ub1 ub1Var = C4.f26870n;
                if (ub1Var != null) {
                    j11 = ub1Var.f33351t;
                }
                if (j11 == j10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void u4() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.Q0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f25095f8 && !this.f25082e8 && !isPressed()) || (this.M1 && this.S0.hasBitmapImage())) {
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
        radialProgress2.o(z11, false);
        if (this.W4 != 0) {
            if (!z10 && this.R4 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.o(z12, true);
        }
        if (!z10 && this.Q4 == 0) {
            z13 = false;
        }
        this.P0.o(z13, false);
    }

    public final boolean v0(MotionEvent motionEvent) {
        int i10;
        float f7;
        int dp;
        ArrayList arrayList = this.f25222o7;
        if (!arrayList.isEmpty()) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f25367y7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f25323v8;
                    if (this.f25165k8) {
                        f7 = 1.0f;
                    } else {
                        f7 = 7.0f;
                    }
                    dp = i11 + AndroidUtilities.dp(f7);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    d0 d0Var = (d0) arrayList.get(i12);
                    int dp2 = (d0Var.d + this.M8) - AndroidUtilities.dp(2.0f);
                    float f10 = x9;
                    float f11 = widthForButtons;
                    float f12 = (d0Var.f23965c * f11) + dp;
                    if (f10 >= f12 && f10 <= (d0Var.e * f11) + f12 && z22 >= dp2 && z22 <= d0Var.f23966f + dp2) {
                        this.f25322v7 = i12;
                        a3();
                        if (d0Var.f23978s == null) {
                            y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23547nc, this.Id), 6, 6);
                            d0Var.f23978s = Z;
                            Z.setCallback(this);
                            y yVar = d0Var.f23978s;
                            int i13 = ((int) (d0Var.f23965c * f11)) + dp;
                            yVar.setBounds(i13, dp2, ((int) (d0Var.e * f11)) + i13, d0Var.f23966f + dp2);
                        }
                        d0Var.f23978s.setHotspot(f10, z22);
                        d0Var.f23978s.setState(this.A3);
                        d0Var.b(!d0Var.f23972m);
                        postDelayed(new ag.r0(this, this.f25322v7, 20), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25322v7 != -1) {
                    playSoundEffect(0);
                    d0 d0Var2 = (d0) arrayList.get(this.f25322v7);
                    y yVar2 = d0Var2.f23978s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    d0Var2.b(false);
                    if (this.f25367y7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        j1 j1Var = this.Jc;
                        if (j1Var != null && !d0Var2.f23972m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = d0Var2.f23969j;
                            if (buttonCustom != null) {
                                j1Var.C(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = d0Var2.f23968i;
                                if (keyboardInlineButton != null) {
                                    j1Var.W0(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f25322v7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f25322v7) != -1) {
                d0 d0Var3 = (d0) arrayList.get(i10);
                y yVar3 = d0Var3.f23978s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                d0Var3.b(false);
                this.f25322v7 = -1;
                a3();
            }
        }
        return false;
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
        if (this.Jc != null && this.f25367y7.isSensitive() && this.f25367y7.hasMediaSpoilers() && !this.f25367y7.needDrawBluredPreview() && !this.f25367y7.isMediaSpoilersRevealed) {
            this.Jc.x(this);
            return;
        }
        MessageObject messageObject4 = this.f25367y7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f25367y7.putInDownloadsStore = true;
        }
        int i12 = this.O4;
        RadialProgress2 radialProgress22 = this.P0;
        int i13 = this.I7;
        di.f3 f3Var = this.S0;
        RadialProgress2 radialProgress23 = this.O0;
        if (i12 == 0 && (!this.f25347x1 || z10)) {
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f25367y7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f25367y7.mediaExists)) {
                if (z10) {
                    radialProgress22.p(0.0f, false);
                } else {
                    radialProgress23.p(0.0f, false);
                }
                if (this.f25079e5 != null && (f3Var.hasNotThumb() || this.f25093f5 == null)) {
                    photoSize = this.f25079e5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f25120h5;
                    } else {
                        str = this.f25135i5;
                    }
                } else {
                    photoSize = this.f25093f5;
                    str = this.f25135i5;
                }
                String str2 = str;
                if (this.f25367y7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f25367y7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    f3Var.setForceLoading(true);
                    f3Var.setImage(ImageLocation.getForObject(this.f25079e5, this.f25064d5), this.f25120h5, ImageLocation.getForObject(this.f25093f5, this.f25064d5), this.f25135i5, this.f25107g5, this.f25079e5.size, null, this.f25367y7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                    if (this.f25367y7.loadedFileSize > 0) {
                        q1(this.L1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f25254qd) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f25367y7.getDocument();
                        MessageObject messageObject6 = this.f25367y7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f25367y7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        f3Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        f3Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f25367y7, 0);
                    }
                    this.f25057cd = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                        if (this.f25367y7.loadedFileSize > 0) {
                            q1(this.L1);
                        }
                    } else {
                        int i17 = this.K1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 1, i10);
                            MessageObject messageObject8 = this.f25367y7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                f3Var.setForceLoading(true);
                                f3Var.setImage(ImageLocation.getForDocument(this.L1), null, ImageLocation.getForDocument(this.f25079e5, this.L1), this.f25135i5, this.L1.size, null, this.f25367y7, i10);
                                MessageObject messageObject9 = this.f25367y7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                            } else if (i17 == 8) {
                                f3Var.setImage(ImageLocation.getForDocument(this.L1), this.f25120h5, ImageLocation.getForDocument(this.f25079e5, this.L1), "b1", 0L, "jpg", this.f25367y7, 1);
                            }
                        } else {
                            f3Var.setForceLoading(true);
                            f3Var.setImage(ImageLocation.getForObject(this.f25079e5, this.f25064d5), this.f25120h5, ImageLocation.getForObject(this.f25093f5, this.f25064d5), this.f25135i5, this.f25107g5, 0L, null, this.f25367y7, 0);
                        }
                    }
                }
                this.f25367y7.loadingCancelled = false;
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
                FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                this.f25367y7.loadingCancelled = false;
            }
            if (this.Jc.y1(this, this.f25367y7)) {
                if (this.W4 == 2 && this.X4 != 1) {
                    this.X4 = 1;
                    radialProgress23.p(0.0f, false);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                s4();
                this.O4 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 1 && (!this.f25347x1 || z10)) {
            f3Var.setForceLoading(false);
            int i18 = this.K1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f25367y7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f25367y7.isOut() && !this.f25347x1 && (this.f25367y7.isSending() || this.f25367y7.isEditing())) {
                    if (radialProgress23.f26250i.f31839q != 6) {
                        this.Jc.I(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f25367y7;
                messageObject10.loadingCancelled = true;
                int i19 = this.K1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f25367y7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(f3Var);
                        f3Var.cancelLoadImage();
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
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f25367y7)) {
                this.O4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f25367y7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Jc.o0(this, 0.0f, 0.0f, false);
            } else if (this.K1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.X4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                    this.f25367y7.loadingCancelled = false;
                }
                if (this.Jc.y1(this, this.f25367y7)) {
                    if (this.W4 == 2 && this.X4 != 1) {
                        this.X4 = 1;
                        radialProgress23.p(0.0f, false);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    s4();
                    this.O4 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f25254qd) {
                    this.f25057cd = true;
                    invalidate();
                }
            } else {
                int i21 = this.K1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f25254qd) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            f3Var.setAllowStartAnimation(true);
                            f3Var.startAnimation();
                        }
                    } else {
                        f3Var.setAllowStartAnimation(true);
                        f3Var.startAnimation();
                    }
                    this.f25367y7.gifState = 0.0f;
                    this.O4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.p(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.L1, this.f25367y7, 2, 0);
                this.f25367y7.loadingCancelled = false;
                this.O4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.K1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f25367y7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f25367y7.isOut() && (this.f25367y7.isSending() || this.f25367y7.isEditing())) || this.f25367y7.isSendError()) {
                        j1 j1Var = this.Jc;
                        if (j1Var != null && radialProgress23.f26250i.f31839q != 6) {
                            j1Var.I(this);
                            return;
                        }
                        return;
                    }
                    this.f25367y7.loadingCancelled = true;
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
                radialProgress23.p(0.0f, false);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f7 = 0.0f;
            }
            j1 j1Var2 = this.Jc;
            if (j1Var2 != null) {
                j1Var2.o0(this, f7, f7, false);
            }
        }
    }

    public final ColorFilter v2(int i10, int i11) {
        if (this.De == null) {
            this.Ee = new int[3];
            this.De = new ColorFilter[3];
        }
        if (i11 != this.Ee[i10] || this.De[i10] == null) {
            ColorFilter[] colorFilterArr = this.De;
            this.Ee[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.De[i10];
    }

    public final int v3(int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.v3(int):int");
    }

    public final void v4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.v4():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        uh.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f25318v3;
            if (drawable == drawableArr[0] || drawable == this.f25319v4 || drawable == drawableArr[1] || drawable == this.Hc || drawable == this.K3 || drawable == this.zc || ((this.N != null && (drawable instanceof org.telegram.ui.Components.r6)) || (drawable instanceof ea0))) {
                return true;
            }
            uh.a aVar = this.f25021a6;
            if (aVar == null || (drawable != aVar && drawable != aVar.f49947a)) {
                ArrayList arrayList = this.Y5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q1 q1Var = (q1) obj;
                    if (q1Var.f24810w != drawable && ((bVar = q1Var.f24811x) == null || (drawable != bVar && drawable != bVar.f49937a && drawable != bVar.f49938b))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean w0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.w0(android.view.MotionEvent):boolean");
    }

    public final void w1() {
        int i10;
        int i11;
        int i12 = this.X4;
        int i13 = this.I7;
        RadialProgress2 radialProgress2 = this.O0;
        if (i12 == 0) {
            this.X4 = 1;
            radialProgress2.p(0.0f, false);
            MessageObject messageObject = this.f25367y7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f25367y7.putInDownloadsStore = true;
            }
            int i14 = this.K1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.L1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.L1;
                    MessageObject messageObject2 = this.f25367y7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f25367y7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.L1;
                MessageObject messageObject3 = this.f25367y7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f25367y7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.K1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f25367y7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.X4 = 0;
            this.f25367y7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.L1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void w3(boolean z10) {
        int currentBackgroundLeft;
        float f7;
        int dp;
        int i10;
        float f10;
        int dp2;
        int currentBackgroundLeft2;
        boolean isOutOwner = this.f25367y7.isOutOwner();
        int i11 = 0;
        r1 r1Var = this.Zc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f25323v8 + r1Var.f24875g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f25200n0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f25323v8 + r1Var.f24875g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f25367y7.type == 19) {
                dp = 0;
            } else {
                if (!this.f25165k8 && this.J) {
                    f7 = 11.0f;
                } else {
                    f7 = 17.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            this.f25200n0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f11 = 4.0f;
        if (this.f25145j2) {
            this.f25200n0 = AndroidUtilities.dp(11.0f) + this.f25200n0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f25256r0 = dp3;
            StaticLayout staticLayout = this.B2;
            if (staticLayout != null) {
                this.f25256r0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f25159k2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Lc;
            this.f25256r0 = dp4;
            StaticLayout staticLayout2 = this.B2;
            if (staticLayout2 != null) {
                this.f25256r0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f25367y7.type == 19) {
            this.f25256r0 = AndroidUtilities.dp(6.0f) + this.Lc;
            if (!this.f25367y7.isOut()) {
                this.f25200n0 = getCurrentBackgroundLeft();
            } else {
                this.f25200n0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Lc;
            this.f25256r0 = dp5;
            MessageObject messageObject = this.f25367y7;
            float f12 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f25256r0;
                    if (this.Lc <= 0) {
                        f12 = -3.0f;
                    }
                    this.f25256r0 = AndroidUtilities.dp(f12) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f25256r0 = AndroidUtilities.dp(f12) + dp5;
                }
                if (this.f25367y7.hasCodeAtTop && this.Lc > 0) {
                    this.f25256r0 = AndroidUtilities.dp(5.0f) + this.f25256r0;
                }
            }
        }
        if (this.f25367y7.isSponsored()) {
            this.f25230p0 = AndroidUtilities.dp(14.0f) + this.f25256r0;
        } else if (this.f25287t1) {
            this.f25230p0 = AndroidUtilities.dp(10.0f) + this.f25256r0;
            this.f25256r0 = org.telegram.messenger.t.D(13.0f, this.f25186m2, this.f25256r0);
            if (this.R2 && !this.f25159k2 && !this.f25367y7.isGiveawayOrGiveawayResults()) {
                this.f25256r0 = AndroidUtilities.dp(44.0f) + this.f25256r0;
            }
        } else {
            this.f25230p0 = AndroidUtilities.dp(10.0f) + this.f25367y7.textHeight(r1Var) + this.f25256r0;
        }
        if (this.f25287t1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f25367y7.textHeight(r1Var) + this.f25256r0;
        } else {
            int i13 = this.f25230p0 + this.f25186m2;
            if (this.R2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f10) + i13;
            if (this.f25186m2 <= 0) {
                f11 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f11) + dp6;
        }
        this.f25243q0 = dp2;
        this.f25215o0 = this.f25200n0;
        if (this.f25367y7.textXOffset != 0.0f && this.C9 != null) {
            int dp7 = this.J8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f25367y7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.K8) {
                int i15 = this.pb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = wh.z(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f25200n0 = (i14 - getExtraTimeX()) + this.f25200n0;
            }
        }
    }

    public final void w4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i10;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.y6.C2.measureText((String) secretTimeString));
                this.A4 = ceil;
                this.f25304u4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.y6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.y6.C2, this.A4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.y6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25304u4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f25304u4.getLineWidth(0);
                }
                this.A4 = i11;
            }
            invalidate();
        }
    }

    public final boolean x0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f25152j9) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof s1)) {
                            s1 s1Var = (s1) childAt;
                            if (s1Var.f25152j9 && s1Var.K == this.K) {
                                int i12 = s1Var.L.flags;
                                if ((i12 & 1) != 0 && (i12 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - s1Var.getLeft(), (z2(motionEvent) + getTop()) - s1Var.getTop(), 0);
                                    boolean x02 = s1Var.x0(obtain);
                                    obtain.recycle();
                                    return x02;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25318v3;
            if (action == 0) {
                if (this.f25166k9.contains(x9, z22)) {
                    if (this.f25367y7.isSent()) {
                        this.f25349x3[1] = 2;
                        this.f25179l9 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x9, z22);
                            drawableArr[1].setState(this.A3);
                        }
                        c3();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25179l9) {
                    j1 j1Var = this.Jc;
                    if (j1Var != null) {
                        if (this.f25052c8) {
                            j1Var.p(this);
                        } else {
                            j1Var.s(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f25179l9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f25179l9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x9, z22);
            }
        }
        return false;
    }

    public final void x1() {
        MessageObject messageObject = this.f25367y7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            j1 j1Var = this.Jc;
            if (j1Var != null) {
                j1Var.n1(this, true);
            }
        }
    }

    public final void x4() {
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
        if (this.f25117h2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        r1 r1Var = this.Zc;
        boolean z10 = r1Var.f24943w0;
        d1 d1Var = this.G5;
        qp0 qp0Var = this.H5;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.K1) == 3 || i15 == 7)) {
            int i21 = this.J8;
            float f11 = i21;
            int i22 = (int) ((f11 - r1Var.f24894k0) + r1Var.f24899l0);
            int i23 = (int) ((f11 - r1Var.f24875g0) + r1Var.f24879h0);
            if (this.f25254qd && !this.f25250q8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (r1Var.f24894k0 == 0.0f && r1Var.f24899l0 == 0.0f) {
                i22 = i23;
            }
            if (qp0Var != null) {
                if (r1Var.f24908n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25117h2) {
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
                    qp0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25117h2) {
                        f10 = 0.0f;
                    }
                    qp0Var.h(dp4 - AndroidUtilities.dp(f10), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (d1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.K1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f25117h2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                d1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (qp0Var != null) {
            if (r1Var.f24908n1) {
                int dp5 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f25117h2) {
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
                if (!this.f25117h2) {
                    f10 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f10);
                int i29 = this.J8 + i20;
                if (this.L5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                qp0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.J8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f25117h2) {
                    f10 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f10);
                qp0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (d1Var != null) {
            int useTranscribeButtonProgress2 = this.J8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.K1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f25117h2) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            d1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i11 + i12), AndroidUtilities.dp(30.0f));
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f25367y7.type == 12) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25318v3;
            if (action == 0) {
                ArrayList arrayList = this.X2;
                int[] iArr = this.A3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.X2.size(); i10++) {
                        k1 k1Var = (k1) this.X2.get(i10);
                        float f7 = x9;
                        float f10 = z22;
                        if (k1Var.e.contains(f7, f10)) {
                            if (k1Var.f24312f == null) {
                                k1Var.f24312f = new xc(this);
                            }
                            k1Var.f24312f.c(true);
                            y yVar = k1Var.f24313g;
                            if (yVar != null) {
                                yVar.setHotspot(f7, f10);
                                k1Var.f24313g.setState(iArr);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
                float f11 = x9;
                float f12 = z22;
                if (this.Y2.contains(f11, f12)) {
                    this.Z2 = true;
                    this.f25326vc.c(true);
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
                            this.Jc.E0(((k1) this.X2.get(0)).f24309a, this);
                        } else {
                            this.Jc.E0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.Z2 = false;
                    this.f25326vc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.X2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.X2.size(); i11++) {
                        k1 k1Var2 = (k1) this.X2.get(i11);
                        xc xcVar = k1Var2.f24312f;
                        if (xcVar != null && xcVar.f34725i) {
                            j1 j1Var = this.Jc;
                            if (j1Var != null) {
                                j1Var.E0(k1Var2.f24309a, this);
                            }
                            y yVar2 = k1Var2.f24313g;
                            if (yVar2 != null) {
                                yVar2.setState(StateSet.NOTHING);
                            }
                            k1Var2.f24312f.c(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.Z2 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x9, z22);
                    return false;
                }
                ArrayList arrayList4 = this.X2;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.X2.size()) {
                            break;
                        }
                        k1 k1Var3 = (k1) this.X2.get(i12);
                        xc xcVar2 = k1Var3.f24312f;
                        if (xcVar2 != null && xcVar2.f34725i) {
                            y yVar3 = k1Var3.f24313g;
                            if (yVar3 != null) {
                                yVar3.setHotspot(x9, z22);
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

    public final void y1(Canvas canvas, float f7) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f10;
        float f11;
        if (this.f25048c4 == null) {
            return;
        }
        float f12 = this.f25247q4;
        float f13 = this.f25234p4;
        r1 r1Var = this.Zc;
        if (r1Var.f24943w0) {
            if (r1Var.C0) {
                f12 -= getTranslationY();
                f11 = r1Var.f24875g0;
            } else if (r1Var.f24928s0) {
                float f14 = r1Var.K1;
                float f15 = 1.0f - f14;
                f13 = (f13 * f14) + (r1Var.f24920q0 * f15);
                f12 = (f12 * f14) + (f15 * r1Var.f24924r0);
            } else if (!this.f25367y7.isVoice() || !TextUtils.isEmpty(this.f25367y7.caption)) {
                f11 = r1Var.f24875g0;
            }
            f13 += f11;
        }
        float f16 = f13;
        float f17 = f12;
        float f18 = 0.0f;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (r1Var.f24849a1) {
            float f19 = r1Var.K1;
            if (f19 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = r1Var.f24853b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.y5 y5Var = r1Var.O0;
                float f20 = (1.0f - f19) * f7;
                if (textLayoutBlocks != null) {
                    f10 = textLayoutBlocks.textXOffset;
                } else {
                    f10 = 0.0f;
                }
                z1(f16, f17, canvas, arrayList, y5Var, false, f20, f10, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.f25048c4;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.y5 y5Var2 = this.pc;
                float f21 = f7 * r1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f18 = textLayoutBlocks2.textXOffset;
                }
                z1(f16, f17, canvas, arrayList3, y5Var2, true, f21, f18, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f25048c4;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.y5 y5Var3 = this.pc;
        if (textLayoutBlocks3 != null) {
            f18 = textLayoutBlocks3.textXOffset;
        }
        z1(f16, f17, canvas, arrayList4, y5Var3, true, f7, f18, true);
    }

    public final org.telegram.ui.ActionBar.l5 y2(boolean z10) {
        boolean z11;
        if (z10) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.L;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.K.isDocuments && !this.J) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f25367y7.isOutOwner()) {
                if (!this.f25165k8 && !this.J && !z11) {
                    this.f25294t8 = (org.telegram.ui.ActionBar.l5) L2("drawableMsgOut");
                } else {
                    this.f25294t8 = (org.telegram.ui.ActionBar.l5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f25165k8 && !this.J && !z11) {
                this.f25294t8 = (org.telegram.ui.ActionBar.l5) L2("drawableMsgIn");
            } else {
                this.f25294t8 = (org.telegram.ui.ActionBar.l5) L2("drawableMsgInMedia");
            }
        }
        this.f25294t8.f();
        return this.f25294t8;
    }

    public xh.f y3() {
        return xh.f.e(this);
    }

    public final void y4() {
        char c10;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().b2() != null && getDelegate().b2().z(this.f25367y7)) {
            t9 b22 = getDelegate().b2();
            if (b22.f25462q0) {
                c10 = 2;
            } else if (b22.f25464s0) {
                c10 = 3;
            } else if (b22.f25466u0) {
                c10 = 4;
            } else if (P2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.f25145j2) {
                    i12 = this.f25215o0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f25159k2) {
                        i11 = this.f25215o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f25215o0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().b2().b0(AndroidUtilities.dp(10.0f) + i12 + this.f25258r2, this.f25217o2);
            } else if (c10 == 1) {
                p4();
                getDelegate().b2().b0((int) this.f25234p4, (int) this.f25247q4);
            } else if (c10 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.K;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f25234p4;
                } else {
                    float f7 = 12.0f;
                    if (this.f25367y7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25323v8;
                        if (this.f25367y7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.J9, this.L9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f25165k8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f25323v8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f25323v8;
                            if (!this.J) {
                                f7 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f7) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Zc.f24875g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.f25243q0;
                p4();
                getDelegate().b2().b0((AndroidUtilities.dp(10.0f) + dp3) - this.f25031b2, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().b2().b0(this.f25200n0, this.f25256r0);
            }
        }
    }

    public final boolean z0(MotionEvent motionEvent) {
        if (this.f25367y7.isImportedForward()) {
            int x9 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f7 = x9;
                float f10 = this.f25195mb;
                if (f7 >= f10 && f7 <= f10 + this.pb) {
                    float f11 = z22;
                    float f12 = this.f25211nb;
                    if (f11 >= f12 && f11 <= f12 + AndroidUtilities.dp(20.0f)) {
                        this.f25175l5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f25175l5) {
                this.f25175l5 = false;
                playSoundEffect(0);
                this.Jc.U0();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.y5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.y5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.V) - this.f25088f0) - this.f25115h0;
    }

    public final void z3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.z3(org.telegram.messenger.MessageObject):void");
    }

    public final void z4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.f25048c4;
        int i12 = 0;
        r1 r1Var = this.Zc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (xh.g gVar : textLayoutBlock2.spoilers) {
                    gVar.i((i10 - textLayoutBlock2.textYOffset(this.f25048c4.textLayoutBlocks, r1Var)) - this.f25234p4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.f25048c4.textLayoutBlocks, r1Var)) - this.f25247q4);
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
                ((xh.g) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (xh.g gVar2 : textLayoutBlock4.spoilers) {
                    gVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, r1Var)) - this.f25256r0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, r1Var)) - this.f25256r0);
                }
            }
        }
    }

    public s1(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = true;
        this.f25329w = new i2.c(1);
        ds dsVar = ds.h;
        this.f25360y = new oe.b(0, this, dsVar, 380L, false);
        this.N = new bh.y0(this);
        this.O = new yg.a(this);
        this.P = new yg.c(this);
        this.B0 = new Rect();
        this.F0 = -1;
        this.G0 = -1;
        this.R0 = new int[4];
        this.W2 = 0;
        this.f25133i3 = 45;
        this.f25318v3 = new Drawable[2];
        this.f25333w3 = new m1[2];
        this.f25349x3 = new int[2];
        this.y3 = new RectF();
        this.A3 = new int[]{16842910, 16842919};
        this.Z3 = -1;
        this.f25019a4 = -1;
        this.f25034b5 = new RectF();
        this.f25049c5 = new RectF();
        this.f25162k5 = -1;
        this.f25189m5 = 1.0f;
        this.f25205n5 = 1.0f;
        this.f25320v5 = -1;
        this.f25335w5 = new x90(this);
        this.f25380z5 = new ArrayList();
        this.A5 = new ArrayList();
        this.E5 = new Path();
        this.X5 = new ArrayList();
        this.Y5 = new ArrayList();
        this.f25136i6 = -1;
        this.f25149j6 = -1;
        this.f25176l6 = true;
        this.N6 = -1;
        this.f25222o7 = new ArrayList();
        new Path();
        this.f25237p7 = new HashMap();
        this.f25249q7 = new HashMap();
        this.K7 = -1;
        this.f25178l8 = true;
        this.f25250q8 = true;
        this.J8 = 100;
        this.f25166k9 = new Rect();
        this.E9 = new AtomicReference();
        this.Qa = new RectF();
        this.f25098fb = new StaticLayout[2];
        this.f25181lb = new float[2];
        this.f25311ub = true;
        this.f25371yb = new Path();
        this.f25386zb = new float[8];
        this.Jb = 1.0f;
        this.Qb = new Path();
        this.Rb = new float[8];
        this.Bc = new RectF();
        this.Cc = new RectF();
        this.Xc = Build.VERSION.SDK_INT == 28;
        this.Yc = 1.0f;
        this.Zc = new r1(this);
        this.f25072dd = new org.telegram.ui.Components.h6(this, 200L, ds.f27531g);
        this.f25113gd = new c1(0, this);
        this.f25228od = new c1(1, this);
        this.f25241pd = new SparseArray();
        this.Dd = -1;
        this.Fd = new m.d3();
        this.Ld = new ArrayList();
        this.Md = new Stack();
        this.Nd = new Path();
        this.Qd = new a1(2, this);
        this.Rd = new a1(3, this);
        this.Vd = false;
        this.Yd = -1L;
        this.f25171ke = false;
        this.f25184le = new a1(10, this);
        this.f25299te = true;
        this.f25359xe = 1.0f;
        this.Ce = new b1(Float.class, "animationOffsetX", 0);
        this.I7 = i10;
        this.Id = u6Var;
        this.Jd = z10;
        this.Kd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Kd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f29614a = new Paint(1);
        drawable.f29615b = null;
        drawable.h = -1.0f;
        drawable.f29619i = -1.0f;
        drawable.f29620j = -1.0f;
        drawable.f29621k = -1.0f;
        drawable.f29623m = this;
        this.Kc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f25193m9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25209n9 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.F9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f25264r9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.H7 = DownloadController.getInstance(i10).generateObserverTag();
        this.V0 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        di.f3 f3Var = new di.f3(this, this, 2);
        this.S0 = f3Var;
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.setUseRoundForThumbDrawable(true);
        f3Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.T0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.O0 = new RadialProgress2(this, u6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, u6Var);
        this.P0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        d1 d1Var = new d1(this, this);
        this.G5 = d1Var;
        d1Var.h = this;
        ?? obj = new Object();
        obj.f31980a = 0;
        obj.f31981b = 0;
        obj.e = false;
        obj.f31983f = false;
        obj.f31995s = 1.0f;
        obj.f31996t = 1.0f;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(125L, 600L, dsVar);
        obj.v = h6Var;
        obj.f31998w = 1.0f;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(150L, ds.f27530f);
        obj.B = h6Var2;
        obj.J = false;
        if (qp0.N == null) {
            qp0.N = new Paint(1);
            qp0.O = new Paint(1);
            Paint paint = qp0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            qp0.O.setStyle(style);
        }
        this.H5 = obj;
        obj.f31987k = this;
        obj.f31990n = this;
        h6Var2.f28862a = this;
        h6Var.f28862a = this;
        this.I5 = new e1(this);
        ?? drawable2 = new Drawable();
        drawable2.f27489a = 0L;
        drawable2.f27490b = false;
        drawable2.f27491c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f27492f = 0.32f;
        drawable2.f27493g = 1;
        drawable2.h = 1;
        drawable2.f27494i = 1;
        drawable2.f27498m = 255;
        drawable2.f27499n = u6Var;
        drawable2.f27495j = this;
        this.S3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.l5 l5Var = this.f25294t8;
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
                l5Var.n((int) (i10 + f7), i12, i11, (int) f7, this.Uc, this.Vc, this.E, (this.F && this.Zc.f24955z0 == 1.0f) ? false : true);
                l5Var.f22850u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f72 = this.L0;
        l5Var.n((int) (i10 + f72), i12, i11, (int) f72, this.Uc, this.Vc, this.E, (this.F && this.Zc.f24955z0 == 1.0f) ? false : true);
        l5Var.f22850u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        j1 j1Var;
        if (this.f25367y7 == null) {
            return;
        }
        Runnable runnable = this.f25198me;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f25214ne;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.J7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Od || (j1Var = this.Jc) == null) {
            return;
        }
        j1Var.n();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
