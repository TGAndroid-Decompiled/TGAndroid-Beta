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
import gh.bb;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ej0;
import org.telegram.ui.im;
import org.telegram.ui.nu0;
import org.telegram.ui.s10;
public class t1 extends a0 implements kn0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, v9, NotificationCenter.NotificationCenterDelegate, td.b, o4 {
    public static final float[] Ae = new float[8];
    public boolean A;
    public int A0;
    public int A1;
    public float A2;
    public boolean A3;
    public String A4;
    public final Path A5;
    public int A6;
    public boolean A7;
    public boolean A8;
    public final AtomicReference A9;
    public float[] Aa;
    public float Ab;
    public float Ac;
    public boolean Ad;
    public boolean B;
    public int B0;
    public float B1;
    public float B2;
    public long B3;
    public WebFile B4;
    public boolean B5;
    public long B6;
    public k4 B7;
    public boolean B8;
    public final ImageReceiver B9;
    public float[] Ba;
    public dh.k Bb;
    public float Bc;
    public final m.f3 Bd;
    public boolean C;
    public int C0;
    public int C1;
    public float C2;
    public boolean C3;
    public boolean C4;
    public final e1 C5;
    public float C6;
    public AnimatorSet C7;
    public boolean C8;
    public int C9;
    public float Ca;
    public Integer Cb;
    public pc Cc;
    public a61 Cd;
    public boolean D;
    public boolean D0;
    public int D1;
    public boolean D2;
    public Path D3;
    public boolean D4;
    public final rn0 D5;
    public float D6;
    public final int D7;
    public float D8;
    public int D9;
    public float Da;
    public Path Db;
    public z Dc;
    public g1 Dd;
    public boolean E;
    public boolean E0;
    public long E1;
    public pc E2;
    public Paint E3;
    public boolean E4;
    public final f1 E5;
    public boolean E6;
    public final int E7;
    public int E8;
    public float E9;
    public float Ea;
    public float[] Eb;
    public int Ec;
    public org.telegram.ui.ActionBar.b6 Ed;
    public boolean F;
    public int F0;
    public long F1;
    public StaticLayout F2;
    public int F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public int F8;
    public int F9;
    public float Fa;
    public final float Fb;
    public k1 Fc;
    public final boolean Fd;
    public MessageObject.GroupedMessages G;
    public int G0;
    public int G1;
    public StaticLayout G2;
    public z G3;
    public int G4;
    public int G5;
    public float G6;
    public int G7;
    public boolean G8;
    public int G9;
    public StaticLayout Ga;
    public float Gb;
    public final y90 Gc;
    public final ChatMessageSharedResources Gd;
    public MessageObject.GroupedMessagePosition H;
    public float H0;
    public TLRPC.Document H1;
    public StaticLayout H2;
    public boolean H3;
    public int H4;
    public boolean H5;
    public int H6;
    public byte[] H7;
    public int H8;
    public int H9;
    public int Ha;
    public float Hb;
    public int Hc;
    public final ArrayList Hd;
    public boolean I;
    public boolean I0;
    public boolean I1;
    public StaticLayout I2;
    public boolean I3;
    public int I4;
    public i1 I5;
    public boolean I6;
    public byte[] I7;
    public int I8;
    public int I9;
    public boolean Ia;
    public StaticLayout Ib;
    public int Ic;
    public final Stack Id;
    public final hg.s0 J;
    public boolean J0;
    public boolean J1;
    public StaticLayout J2;
    public int J3;
    public int J4;
    public float J5;
    public int J6;
    public boolean J7;
    public org.telegram.ui.Components.e9 J8;
    public int J9;
    public boolean Ja;
    public int Jb;
    public int Jc;
    public final Path Jd;
    public final eg.b K;
    public final RadialProgress2 K0;
    public nz0 K1;
    public StaticLayout K2;
    public z K3;
    public int K4;
    public float K5;
    public TLRPC.Poll K6;
    public boolean K7;
    public Paint K8;
    public boolean K9;
    public boolean Ka;
    public String Kb;
    public int Kc;
    public boolean Kd;
    public final eg.d L;
    public final RadialProgress2 L0;
    public nz0 L1;
    public float L2;
    public int L3;
    public int L4;
    public StaticLayout L5;
    public float L6;
    public boolean L7;
    public Paint L8;
    public boolean L9;
    public StaticLayout La;
    public dh.l Lb;
    public int Lc;
    public BotForumHelper.BotDraftAnimationsPool Ld;
    public boolean M;
    public boolean M0;
    public pc M1;
    public float M2;
    public z M3;
    public int M4;
    public double M5;
    public ArrayList M6;
    public boolean M7;
    public Path M8;
    public boolean M9;
    public final RectF Ma;
    public final Path Mb;
    public float Mc;
    public final b1 Md;
    public long N;
    public final int[] N0;
    public pc N1;
    public boolean N2;
    public boolean N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public CheckBoxBase[] N8;
    public boolean N9;
    public pc Na;
    public final float[] Nb;
    public boolean Nc;
    public final b1 Nd;
    public nz0 O;
    public final ih.z2 O0;
    public StaticLayout O1;
    public boolean O2;
    public final hl0 O3;
    public int O4;
    public int O5;
    public d11 O6;
    public boolean O7;
    public h40 O8;
    public boolean O9;
    public RectF Oa;
    public StaticLayout Ob;
    public float Oc;
    public boolean Od;
    public f80 P;
    public final ImageReceiver P0;
    public StaticLayout P1;
    public boolean P2;
    public StaticLayout P3;
    public int P4;
    public StaticLayout P5;
    public org.telegram.ui.Components.y5 P6;
    public boolean P7;
    public p80 P8;
    public org.telegram.ui.Components.y5 P9;
    public bg.a Pa;
    public int Pb;
    public int Pc;
    public boolean Pd;
    public CornerPathEffect Q;
    public ColorMatrixColorFilter Q0;
    public i80 Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public int Q6;
    public boolean Q7;
    public float Q8;
    public float Q9;
    public int Qa;
    public String Qb;
    public int Qc;
    public boolean Qd;
    public int R;
    public final org.telegram.ui.Components.z8 R0;
    public m80 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public StaticLayout R5;
    public int R6;
    public boolean R7;
    public long R8;
    public float R9;
    public float Ra;
    public StaticLayout Rb;
    public int Rc;
    public boolean Rd;
    public long S;
    public up S0;
    public boolean S1;
    public int S2;
    public boolean S3;
    public int S4;
    public int S5;
    public boolean S6;
    public boolean S7;
    public ImageReceiver[] S8;
    public TLRPC.PhotoSize S9;
    public float Sa;
    public int Sb;
    public boolean Sc;
    public boolean Sd;
    public nz0 T;
    public GradientDrawable T0;
    public Drawable T1;
    public ArrayList T2;
    public org.telegram.ui.Components.b9 T3;
    public int T4;
    public final ArrayList T5;
    public boolean T6;
    public boolean T7;
    public org.telegram.ui.Components.z8[] T8;
    public int T9;
    public float Ta;
    public String Tb;
    public final boolean Tc;
    public long Td;
    public f80 U;
    public kh.l U0;
    public int U1;
    public RectF U2;
    public nz0 U3;
    public boolean U4;
    public final ArrayList U5;
    public float U6;
    public boolean U7;
    public boolean[] U8;
    public Drawable U9;
    public boolean Ua;
    public TLRPC.User Ub;
    public float Uc;
    public int Ud;
    public CornerPathEffect V;
    public Paint V0;
    public boolean V1;
    public boolean V2;
    public int V3;
    public boolean V4;
    public ah.d V5;
    public int V6;
    public boolean V7;
    public StaticLayout V8;
    public dl0 V9;
    public boolean Va;
    public TLRPC.Chat Vb;
    public final s1 Vc;
    public int Vd;
    public int W;
    public mi0 W0;
    public s10 W1;
    public boolean W2;
    public int W3;
    public boolean W4;
    public ah.a W5;
    public float W6;
    public boolean W7;
    public org.telegram.ui.Components.b6 W8;
    public dl0 W9;
    public boolean Wa;
    public TLRPC.FileLocation Wb;
    public boolean Wc;
    public int Wd;
    public Paint X0;
    public int X1;
    public int X2;
    public int X3;
    public final RectF X4;
    public yg.g X5;
    public float X6;
    public long X7;
    public boolean X8;
    public dl0 X9;
    public float Xa;
    public String Xb;
    public boolean Xc;
    public int Xd;
    public Paint Y0;
    public int Y1;
    public CharSequence Y2;
    public MessageObject.TextLayoutBlocks Y3;
    public final RectF Y4;
    public yg.g Y5;
    public int Y6;
    public boolean Y7;
    public int Y8;
    public dl0 Y9;
    public float Ya;
    public Object Yb;
    public boolean Yc;
    public float Yd;
    public Paint Z0;
    public int Z1;
    public int Z2;
    public MessageObject.TextLayoutBlocks Z3;
    public TLObject Z4;
    public int Z5;
    public int Z6;
    public boolean Z7;
    public int Z8;
    public dl0 Z9;
    public StaticLayout Za;
    public long Zb;
    public final org.telegram.ui.Components.y5 Zc;
    public float Zd;
    public h11 f25301a0;
    public jw0 f25302a1;
    public int a2;
    public float a3;
    public ai0 f25303a4;
    public TLRPC.PhotoSize f25304a5;
    public int f25305a6;
    public boolean f25306a7;
    public boolean f25307a8;
    public boolean f25308a9;
    public dl0 f25309aa;
    public int f25310ab;
    public String f25311ac;
    public FlagSecureReason f25312ad;
    public org.telegram.ui.Components.d8 f25313ae;
    public int f25314b0;
    public boolean f25315b1;
    public int f25316b2;
    public int f25317b3;
    public CharSequence f25318b4;
    public TLRPC.PhotoSize f25319b5;
    public int f25320b6;
    public String f25321b7;
    public boolean f25322b8;
    public int f25323b9;
    public int ba;
    public final StaticLayout[] f25324bb;
    public org.telegram.ui.Components.i5 f25325bc;
    public boolean f25326bd;
    public boolean f25327be;
    public wx0 f25328c0;
    public float f25329c1;
    public int f25330c2;
    public int f25331c3;
    public StaticLayout f25332c4;
    public BitmapDrawable f25333c5;
    public float f25334c6;
    public TLRPC.Message f25335c7;
    public boolean f25336c8;
    public int f25337c9;
    public Drawable f25338ca;
    public int f25339cb;
    public org.telegram.ui.Components.i5 f25340cc;
    public final d1 f25341cd;
    public boolean f25342ce;
    public int f25343d0;
    public float f25344d1;
    public boolean f25345d2;
    public int f25346d3;
    public MessageObject.TextLayoutBlocks f25347d4;
    public String f25348d5;
    public float f25349d6;
    public boolean f25350d7;
    public int f25351d8;
    public int d9;
    public boolean f25352da;
    public boolean f25353db;
    public TLRPC.User f25354dc;
    public int f25355dd;
    public ej0 f25356de;
    public long f25357e0;
    public boolean f25358e1;
    public boolean f25359e2;
    public int f25360e3;
    public CharSequence f25361e4;
    public String f25362e5;
    public int f25363e6;
    public int f25364e7;
    public float f25365e8;
    public int f25366e9;
    public bb f25367ea;
    public float f25368eb;
    public TLRPC.User ec;
    public int f25369ed;
    public boolean f25370ee;
    public boolean f25371f;
    public int f25372f0;
    public boolean f25373f1;
    public boolean f25374f2;
    public LinearGradient f25375f3;
    public int f25376f4;
    public Drawable f25377f5;
    public int f25378f6;
    public int f25379f7;
    public long f25380f8;
    public boolean f25381f9;
    public int f25382fa;
    public int f25383fb;
    public TLRPC.Chat fc;
    public float f25384fd;
    public final b1 f25385fe;
    public pc f25386g0;
    public CheckBoxBase f25387g1;
    public boolean f25388g2;
    public jb0 f25389g3;
    public int f25390g4;
    public int f25391g5;
    public float f25392g6;
    public boolean f25393g7;
    public boolean f25394g8;
    public final Rect f25395g9;
    public z f25396ga;
    public int f25397gb;
    public String f25398gc;
    public boolean f25399gd;
    public Runnable f25400ge;
    public boolean h;
    public org.telegram.ui.Components.i5 f25401h0;
    public CheckBoxBase f25402h1;
    public boolean f25403h2;
    public int f25404h3;
    public int f25405h4;
    public boolean f25406h5;
    public boolean f25407h6;
    public boolean f25408h7;
    public boolean f25409h8;
    public boolean f25410h9;
    public nz0 f25411ha;
    public final float[] f25412hb;
    public String f25413hc;
    public ValueAnimator f25414hd;
    public Runnable f25415he;
    public boolean f25416i0;
    public boolean f25417i1;
    public int f25418i2;
    public int f25419i3;
    public Drawable f25420i4;
    public float f25421i5;
    public boolean f25422i6;
    public float f25423i7;
    public boolean f25424i8;
    public final ImageReceiver i9;
    public nz0 f25425ia;
    public float f25426ib;
    public boolean f25427ic;
    public int f25428id;
    public int f25429ie;
    public int f25430j0;
    public boolean f25431j1;
    public int f25432j2;
    public int f25433j3;
    public int f25434j4;
    public float f25435j5;
    public boolean f25436j6;
    public boolean f25437j7;
    public boolean f25438j8;
    public final org.telegram.ui.Components.z8 f25439j9;
    public int f25440ja;
    public float f25441jb;
    public boolean jc;
    public float f25442jd;
    public int f25443je;
    public int f25444k0;
    public float f25445k1;
    public int f25446k2;
    public int f25447k3;
    public int f25448k4;
    public long f25449k5;
    public boolean f25450k6;
    public final ArrayList f25451k7;
    public boolean f25452k8;
    public boolean f25453k9;
    public int ka;
    public StaticLayout f25454kb;
    public boolean f25455kc;
    public final d1 f25456kd;
    public boolean f25457ke;
    public int f25458l0;
    public long l1;
    public int f25459l2;
    public int f25460l3;
    public float f25461l4;
    public long f25462l5;
    public boolean f25463l6;
    public final HashMap f25464l7;
    public boolean f25465l8;
    public boolean f25466l9;
    public org.telegram.ui.Components.y5 f25467la;
    public int f25468lb;
    public org.telegram.ui.Components.p5 f25469lc;
    public final SparseArray f25470ld;
    public float f25471le;
    public int m0;
    public int f25472m1;
    public int f25473m2;
    public boolean f25474m3;
    public float f25475m4;
    public boolean f25476m5;
    public boolean f25477m6;
    public final HashMap f25478m7;
    public boolean f25479m8;
    public boolean f25480m9;
    public f80 f25481ma;
    public int mb;
    public org.telegram.ui.Components.p5 f25482mc;
    public boolean f25483md;
    public Paint f25484me;
    public int f25485n;
    public int f25486n0;
    public org.telegram.ui.f5 f25487n1;
    public int f25488n2;
    public boolean f25489n3;
    public int f25490n4;
    public boolean f25491n5;
    public boolean f25492n6;
    public String f25493n7;
    public int f25494n8;
    public final ImageReceiver f25495n9;
    public p80 f25496na;
    public int f25497nb;
    public org.telegram.ui.Components.p5 f25498nc;
    public boolean nd;
    public boolean f25499ne;
    public int f25500o0;
    public t00 f25501o1;
    public int f25502o2;
    public boolean f25503o3;
    public int f25504o4;
    public org.telegram.ui.Components.t5 f25505o5;
    public boolean o6;
    public int f25506o7;
    public boolean f25507o8;
    public int o9;
    public ArrayList f25508oa;
    public int ob;
    public org.telegram.ui.Components.p5 f25509oc;
    public float f25510od;
    public xx0 oe;
    public int f25511p0;
    public boolean f25512p1;
    public int f25513p2;
    public pc f25514p3;
    public int f25515p4;
    public m80 f25516p5;
    public boolean p6;
    public boolean f25517p7;
    public org.telegram.ui.ActionBar.d5 f25518p8;
    public Drawable[] p9;
    public boolean f25519pa;
    public CharSequence f25520pb;
    public org.telegram.ui.Components.p5 f25521pc;
    public float f25522pd;
    public Paint f25523pe;
    public int f25524q0;
    public boolean f25525q1;
    public int f25526q2;
    public int f25527q3;
    public StaticLayout f25528q4;
    public MessageObject.TextLayoutBlock f25529q5;
    public boolean f25530q6;
    public boolean f25531q7;
    public org.telegram.ui.ActionBar.d5 f25532q8;
    public int[] f25533q9;
    public int f25534qa;
    public boolean f25535qb;
    public pc f25536qc;
    public float f25537qd;
    public Paint f25538qe;
    public m3 f25539r;
    public int f25540r0;
    public boolean f25541r1;
    public int f25542r2;
    public final Drawable[] f25543r3;
    public org.telegram.ui.Components.i6 f25544r4;
    public int f25545r5;
    public long f25546r6;
    public int f25547r7;
    public int f25548r8;
    public Drawable f25549r9;
    public boolean f25550ra;
    public boolean f25551rb;
    public pc f25552rc;
    public float f25553rd;
    public float f25554re;
    public boolean f25555s;
    public int f25556s0;
    public boolean f25557s1;
    public int f25558s2;
    public final n1[] f25559s3;
    public org.telegram.ui.Components.i6 f25560s4;
    public final i80 f25561s5;
    public String f25562s6;
    public dh.l f25563s7;
    public int f25564s8;
    public Drawable f25565s9;
    public int f25566sa;
    public Paint f25567sb;
    public pc f25568sc;
    public long f25569sd;
    public int f25570se;
    public int f25571t0;
    public boolean f25572t1;
    public int f25573t2;
    public final int[] f25574t3;
    public ff.q f25575t4;
    public int f25576t5;
    public int f25577t6;
    public boolean f25578t7;
    public int f25579t8;
    public int f25580t9;
    public boolean f25581ta;
    public Path f25582tb;
    public float f25583tc;
    public float f25584td;
    public MessageObject.TextLayoutBlocks f25585te;
    public boolean f25586u0;
    public long f25587u1;
    public float f25588u2;
    public final RectF f25589u3;
    public StaticLayout f25590u4;
    public boolean f25591u5;
    public boolean f25592u6;
    public MessageObject f25593u7;
    public int f25594u8;
    public boolean f25595u9;
    public boolean f25596ua;
    public final Path f25597ub;
    public float f25598uc;
    public float f25599ud;
    public float f25600ue;
    public o0 v;
    public boolean f25601v0;
    public boolean f25602v1;
    public float f25603v2;
    public p80 f25604v3;
    public long v4;
    public final ArrayList f25605v5;
    public boolean f25606v6;
    public MessageObject f25607v7;
    public int f25608v8;
    public boolean f25609v9;
    public boolean va;
    public final float[] vb;
    public z f25610vc;
    public int vd;
    public float f25611ve;
    public final i8.i0 f25612w;
    public int f25613w0;
    public boolean f25614w1;
    public int f25615w2;
    public final int[] f25616w3;
    public int f25617w4;
    public final ArrayList f25618w5;
    public boolean f25619w6;
    public MessageObject.GroupedMessages f25620w7;
    public boolean w8;
    public boolean f25621w9;
    public int f25622wa;
    public dh.l f25623wb;
    public Path f25624wc;
    public float f25625wd;
    public final c1 f25626we;
    public boolean f25627x;
    public final Rect f25628x0;
    public int f25629x1;
    public StaticLayout f25630x2;
    public float f25631x3;
    public nz0 f25632x4;
    public p80 f25633x5;
    public boolean f25634x6;
    public boolean f25635x7;
    public i41 f25636x8;
    public CheckBoxBase f25637x9;
    public boolean f25638xa;
    public float f25639xb;
    public final RectF f25640xc;
    public float f25641xd;
    public ColorFilter[] f25642xe;
    public final td.a f25643y;
    public int f25644y0;
    public float f25645y1;
    public StaticLayout f25646y2;
    public SpannableStringBuilder f25647y3;
    public nz0 f25648y4;
    public ArrayList f25649y5;
    public boolean f25650y6;
    public boolean f25651y7;
    public i41 f25652y8;
    public StaticLayout f25653y9;
    public Path f25654ya;
    public float f25655yb;
    public final RectF yc;
    public float f25656yd;
    public int[] f25657ye;
    public int f25658z0;
    public boolean f25659z1;
    public float f25660z2;
    public boolean f25661z3;
    public nz0 f25662z4;
    public CharacterStyle f25663z5;
    public boolean f25664z6;
    public boolean f25665z7;
    public int f25666z8;
    public StaticLayout f25667z9;
    public Path f25668za;
    public float f25669zb;
    public int f25670zc;
    public int f25671zd;
    public TL_stars.StarGift f25672ze;

    public t1(Context context, int i9) {
        this(context, i9, false, null, null);
    }

    public static void A3(int i9, ArrayList arrayList, boolean z10) {
        if (z10 && i9 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new j9.a(15));
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && i9 > 0; i10++) {
                r1 r1Var = (r1) arrayList.get(i10);
                int i11 = r1Var.d;
                if (i11 > 0) {
                    r1Var.d = i11 + 1;
                    i9--;
                }
            }
        }
    }

    public static android.graphics.PointF C2(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.C2(int, int, int, int):android.graphics.PointF");
    }

    public static int[] J2(Spannable spannable, CharacterStyle characterStyle) {
        int i9;
        int i10;
        boolean z10;
        vz0 vz0Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof n41) && (vz0Var = ((n41) characterStyle).f31023a) != null && (messageEntity = vz0Var.d) != null) {
            i9 = messageEntity.offset;
            i10 = messageEntity.length + i9;
            z10 = true;
        } else {
            i9 = 0;
            i10 = 0;
            z10 = false;
        }
        if (!z10) {
            i9 = spannable.getSpanStart(characterStyle);
            i10 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i9, i10};
    }

    public static boolean S(t1 t1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            k1 k1Var = t1Var.Fc;
            if (k1Var == null || k1Var.Y()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean Z2(float f10, float f11, float f12, float f13) {
        if (f10 <= f12) {
            if (f11 >= f12) {
                return true;
            }
            return false;
        } else if (f10 <= f13) {
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
        StaticLayout staticLayout = this.La;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.La.getText());
        bg.a[] aVarArr = (bg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bg.a.class);
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
        TLRPC.User user = this.Ub;
        if (user != null) {
            return DialogObject.getBotVerificationIcon(user);
        }
        if (this.Vb != null && (messageObject = this.f25593u7) != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25593u7.messageOwner.from_id);
            int i9 = this.E7;
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    return DialogObject.getBotVerificationIcon(user2);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    return DialogObject.getBotVerificationIcon(chat);
                }
            }
        }
        return 0L;
    }

    private String getAuthorName() {
        TLRPC.User user = this.Ub;
        if (user != null) {
            return UserObject.getUserName(user);
        }
        if (this.Vb != null) {
            MessageObject messageObject = this.f25593u7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f25593u7.messageOwner.from_id);
                int i9 = this.E7;
                if (peerDialogId >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
                    if (user2 != null) {
                        return UserObject.getUserName(user2);
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        return chat.title;
                    }
                }
            }
            return this.Vb.title;
        }
        MessageObject messageObject2 = this.f25593u7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f25593u7.sponsoredTitle;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        MessageObject messageObject;
        TLRPC.User user = this.Ub;
        if (user != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                TLRPC.EmojiStatus emojiStatus = this.Ub.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f25311ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            } else if (this.Ub.premium) {
                return ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
            } else {
                return null;
            }
        } else if (this.Vb != null && (messageObject = this.f25593u7) != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25593u7.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.E7).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f25311ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return UserObject.getEmojiStatusDocumentId(user2);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.E7).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f25311ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private pg.a getDraftMessageMeasureController() {
        k1 k1Var = this.Fc;
        if (k1Var != null) {
            return k1Var.d0();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i9;
        if (!this.f25593u7.isOutOwner() && ((!this.f25394g8 || this.Y3 != null) && (i9 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i9 - 11) / 1.5f);
        }
        if (!this.f25593u7.isOutOwner() && this.nd && this.f25452k8 && this.f25593u7.type == 5) {
            return (int) ((AndroidUtilities.roundPlayingMessageSize(this.B8) - AndroidUtilities.roundMessageSize) * 0.7f);
        }
        return 0;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.Q0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
            this.Q0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.Q0;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.preview) {
            parentWidth = this.F0;
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
        int i9 = this.T4;
        if (i9 < 0) {
            return 4;
        }
        if (i9 == 0) {
            return 2;
        }
        return 3;
    }

    private int getNameHeight() {
        if (this.Wa) {
            if (this.La == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.f6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f10;
        float f11;
        s1 s1Var = this.Vc;
        if (s1Var.P2) {
            boolean z10 = this.Wa;
            f10 = AndroidUtilities.lerp(!z10, z10, s1Var.K1);
        } else if (this.Wa) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.f6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
        if (this.La == null) {
            f11 = 31.0f;
        } else {
            f11 = 35.0f;
        }
        return AndroidUtilities.lerp(textSize, AndroidUtilities.dp(f11), f10);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (messageReplies = this.G.messages.get(0).messageOwner.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.f25593u7.messageOwner.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    public int getRepliesCount() {
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            return this.G.messages.get(0).getRepliesCount();
        }
        return this.f25593u7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
        if (b6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.isOut()) {
            i9 = org.telegram.ui.ActionBar.f6.Yb;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23271sa;
        }
        return b6Var.N0(i9);
    }

    private float getUseTranscribeButtonProgress() {
        s1 s1Var = this.Vc;
        if (s1Var.f25201n1) {
            if (this.H5) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.H5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static l1 n1(int i9, String str, int i10, float f10) {
        l1 l1Var = new l1();
        l1Var.f24639a = i9;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.f6.M2, i10, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.M2, AndroidUtilities.dp(2.0f) + i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        l1Var.d = staticLayout;
        l1Var.f24640b = f10;
        if (staticLayout.getLineCount() > 0) {
            l1Var.f24641c = ((float) (l1Var.f24640b - Math.ceil(l1Var.d.getLineWidth(0)))) / 2.0f;
            l1Var.f24641c -= (int) l1Var.d.getLineLeft(0);
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
        if (this.f25514p3 == null) {
            this.f25514p3 = new pc(this);
        }
        pc pcVar = this.f25514p3;
        this.f25503o3 = z10;
        pcVar.c(z10);
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
    }

    public static StaticLayout u2(CharSequence charSequence, TextPaint textPaint, int i9, int i10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i13 = i9;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            staticLayout.getLineDirections(i15);
            if (staticLayout.getLineLeft(i15) != 0.0f || staticLayout.isRtlCharAt(staticLayout.getLineStart(i15)) || staticLayout.isRtlCharAt(staticLayout.getLineEnd(i15))) {
                i13 = i10;
            }
            int lineEnd = staticLayout.getLineEnd(i15);
            if (lineEnd == charSequence.length()) {
                break;
            }
            int i16 = (lineEnd - 1) + i14;
            if (spannableStringBuilder.charAt(i16) == ' ') {
                spannableStringBuilder.replace(i16, i16 + 1, (CharSequence) "\n");
            } else if (spannableStringBuilder.charAt(i16) != '\n') {
                spannableStringBuilder.insert(i16, (CharSequence) "\n");
                i14++;
            }
            if (i15 == staticLayout.getLineCount() - 1 || i15 == i12 - 1) {
                break;
            }
        }
        int i17 = i13;
        return rv0.c(spannableStringBuilder, textPaint, i17, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i17, i12, true);
    }

    public static boolean v3() {
        return LiteMode.isEnabled(2);
    }

    public static int w2(MessageObject.GroupedMessagePosition groupedMessagePosition) {
        int i9 = 0;
        if (groupedMessagePosition != null) {
            if ((groupedMessagePosition.flags & 2) == 0) {
                i9 = AndroidUtilities.dp(4.0f);
            }
            if ((groupedMessagePosition.flags & 1) == 0) {
                return AndroidUtilities.dp(4.0f) + i9;
            }
        }
        return i9;
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
        float f10;
        k1 k1Var;
        MessageObject messageObject = this.f25593u7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f25357e0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f10);
        float f12 = this.f25468lb;
        if (this.f25593u7.sendPreview) {
            f11 = 1.0f - this.f25421i5;
        }
        int dp2 = ((int) ((f12 * f11) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f25468lb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f25386g0 == null) {
                    this.f25386g0 = new pc(this);
                }
                this.Qd = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Qd = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Qd && (k1Var = this.Fc) != null) {
                k1Var.N(this);
            }
            this.Qd = false;
        } else if (motionEvent.getAction() == 3) {
            this.Qd = false;
        }
        pc pcVar = this.f25386g0;
        if (pcVar != null) {
            pcVar.c(this.Qd);
        }
        return this.Qd;
    }

    public final void A1(Canvas canvas, float f10) {
        ej0 ej0Var;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f11 = this.f25486n0;
            s1 s1Var = this.Vc;
            if (s1Var.f25193l2) {
                float f12 = s1Var.f25202n2;
                float f13 = s1Var.K1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (s1Var.K1 != 1.0f && s1Var.G0 && ((ej0Var = this.f25356de) == null || !ej0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.d5 d5Var = this.f25518p8;
                if (d5Var != null) {
                    Rect bounds = d5Var.getBounds();
                    if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.B) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f25430j0, f14, canvas, s1Var.H0, s1Var.O0, false, (1.0f - s1Var.K1) * f10, this.f25593u7.textXOffset, false);
                MessageObject messageObject2 = this.f25593u7;
                z1(this.f25430j0, f14, canvas, messageObject2.textLayoutBlocks, this.f25469lc, true, f10 * s1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f25593u7;
                z1(this.f25430j0, f14, canvas, messageObject3.textLayoutBlocks, this.f25469lc, true, f10, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f10);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f25350d7) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            if (string == null) {
                return LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault);
            }
            return string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public final boolean B0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.B0(android.view.MotionEvent):boolean");
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f10;
        ai0 ai0Var;
        float f11;
        if (!this.f25373f1 && this.f25336c8) {
            int i9 = this.f25351d8;
            if (i9 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i9 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10 && (ai0Var = this.f25303a4) != null) {
            return (1.0f - ai0Var.f26829k.d(1.0f, false)) * f10;
        }
        return f10;
    }

    public final f80 B3() {
        f80 f80Var;
        ArrayList arrayList = this.f25605v5;
        if (!arrayList.isEmpty()) {
            f80Var = (f80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            f80Var = new f80(0);
        }
        f80Var.reset();
        this.f25618w5.add(f80Var);
        return f80Var;
    }

    public final boolean C0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Fd && (messageObject = this.f25593u7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Da, this.Ed) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i9 = 0; i9 < this.f25593u7.textLayoutBlocks.size(); i9++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f25593u7.textLayoutBlocks.get(i9);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.Y3 != null) {
            for (int i10 = 0; i10 < this.Y3.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.Y3.textLayoutBlocks.get(i10);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final boolean D0(MotionEvent motionEvent) {
        int i9;
        int i10;
        int i11;
        i80 i80Var = this.f25561s5;
        if (this.f25374f2) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.I1 && this.f25557s1 && this.K4 != -1 && x10 >= (i10 = this.G4) && x10 <= AndroidUtilities.dp(48.0f) + i10 && z22 >= (i11 = this.H4) && z22 <= AndroidUtilities.dp(48.0f) + i11 && this.K0.f26474i.f27111q != 4) {
                    this.L4 = 1;
                    invalidate();
                    return true;
                }
                if (this.I1) {
                    if (this.O0.isInsideImage(x10, z22)) {
                        this.f25591u5 = true;
                        return true;
                    }
                }
                if (this.G2 != null && z22 >= this.f25446k2) {
                    try {
                        int dp = x10 - ((this.f25444k0 + AndroidUtilities.dp(10.0f)) + this.f25488n2);
                        int i12 = z22 - this.f25446k2;
                        int lineForVertical = this.G2.getLineForVertical(i12);
                        float f10 = dp;
                        int offsetForHorizontal = this.G2.getOffsetForHorizontal(lineForVertical, f10);
                        float lineLeft = this.G2.getLineLeft(lineForVertical);
                        if (lineLeft <= f10 && lineLeft + this.G2.getLineWidth(lineForVertical) >= f10) {
                            Spannable spannable = (Spannable) this.f25593u7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof m41) || m41.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                m80 m80Var = this.f25516p5;
                                if (m80Var == null || m80Var.f30768i != clickableSpanArr[0]) {
                                    i80Var.k(m80Var, true);
                                    m80 m80Var2 = new m80(clickableSpanArr[0], this.Ed, f10, i12, 0);
                                    this.f25516p5 = m80Var2;
                                    if (this.f25593u7.isOutOwner()) {
                                        i9 = org.telegram.ui.ActionBar.f6.Mb;
                                    } else {
                                        i9 = org.telegram.ui.ActionBar.f6.Ld;
                                    }
                                    m80Var2.d(org.telegram.ui.ActionBar.f6.v0(i9, this.Ed));
                                    this.f25540r0 = -10;
                                    this.f25576t5 = 2;
                                    try {
                                        f80 b10 = this.f25516p5.b();
                                        int[] J2 = J2(spannable, this.f25516p5.f30768i);
                                        b10.d(this.G2, J2[0], 0.0f);
                                        this.G2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    i80Var.a(this.f25516p5, 2);
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25576t5 != 2 && !this.f25591u5 && this.L4 == 0) {
                    F3(2);
                    return false;
                } else if (this.L4 != 0) {
                    this.L4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    m80 m80Var3 = this.f25516p5;
                    if (m80Var3 != null) {
                        CharacterStyle characterStyle = m80Var3.f30768i;
                        if (characterStyle instanceof URLSpan) {
                            ve.e.s(getContext(), ((URLSpan) this.f25516p5.f30768i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f25591u5 = false;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList = this.f25451k7;
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i13);
                        if (gf.c.c(e0Var.f24255i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Fc.e1(this, e0Var.f24255i);
                            invalidate();
                            break;
                        }
                        i13++;
                    }
                    F3(2);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean D1(android.graphics.Canvas r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.D1(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final String D2(long j10) {
        TLRPC.Chat chat;
        int i9 = this.E7;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (i10 < 0 && (chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10))) != null) {
            return chat.title;
        } else {
            return null;
        }
    }

    public final void D3() {
        this.V2 = false;
        pc pcVar = this.f25552rc;
        if (pcVar != null) {
            pcVar.c(false);
        }
        Drawable drawable = this.f25543r3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.T2 != null) {
            for (int i9 = 0; i9 < this.T2.size(); i9++) {
                l1 l1Var = (l1) this.T2.get(i9);
                pc pcVar2 = l1Var.f24643f;
                if (pcVar2 != null) {
                    pcVar2.c(false);
                }
                z zVar = l1Var.f24644g;
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final void E0() {
        int i9;
        boolean z10 = this.I0;
        boolean z11 = this.f25327be;
        ih.z2 z2Var = this.O0;
        if (z10 != z11) {
            this.f25327be = z10;
            ImageReceiver imageReceiver = this.P0;
            ImageReceiver imageReceiver2 = this.f25495n9;
            ImageReceiver imageReceiver3 = this.B9;
            eg.d dVar = this.L;
            eg.b bVar = this.K;
            ArrayList arrayList = this.U5;
            RadialProgress2 radialProgress2 = this.L0;
            RadialProgress2 radialProgress22 = this.K0;
            if (z10) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.e9 e9Var = this.J8;
                if (e9Var != null) {
                    e9Var.a();
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((r1) obj).q();
                    }
                }
                yg.g gVar = this.X5;
                if (gVar != null) {
                    gVar.a();
                }
                yg.g gVar2 = this.Y5;
                if (gVar2 != null) {
                    gVar2.a();
                }
                if (this.S8 != null) {
                    int i11 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.S8;
                        if (i11 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i11].onAttachedToWindow();
                        i11++;
                    }
                }
                ImageReceiver imageReceiver4 = bVar.d;
                if (imageReceiver4 != null) {
                    imageReceiver4.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr2 = bVar.f5122a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = dVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = dVar.f5148a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (z2Var.onAttachedToWindow()) {
                    if (this.I1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.f25482mc = org.telegram.ui.Components.t5.update(0, (View) this, false, this.f25482mc, this.f25667z9);
                this.f25498nc = org.telegram.ui.Components.t5.update(0, (View) this, false, this.f25498nc, this.G2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.e9 e9Var2 = this.J8;
                if (e9Var2 != null) {
                    e9Var2.b();
                }
                yg.g gVar3 = this.X5;
                if (gVar3 != null) {
                    gVar3.f50226b.onDetachedFromWindow();
                    gVar3.f50236x.f();
                }
                yg.g gVar4 = this.Y5;
                if (gVar4 != null) {
                    gVar4.f50226b.onDetachedFromWindow();
                    gVar4.f50236x.f();
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        ((r1) obj2).r();
                    }
                }
                if (this.S8 != null) {
                    int i13 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.S8;
                        if (i13 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i13].onDetachedFromWindow();
                        i13++;
                    }
                }
                imageReceiver3.onDetachedFromWindow();
                imageReceiver2.onDetachedFromWindow();
                z2Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = bVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = bVar.f5122a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = dVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = dVar.f5148a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.t5.release(this, this.f25498nc);
                org.telegram.ui.Components.t5.release(this, this.f25482mc);
                org.telegram.ui.Components.t5.release(this, this.f25469lc);
            }
        }
        boolean z12 = this.I0;
        if (z12 != this.f25342ce) {
            this.f25342ce = z12;
            int i14 = this.E7;
            if (z12) {
                MessageObject messageObject = this.f25593u7;
                if (z2Var != null) {
                    z2Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f25483md || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i14).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f25541r1) {
                        if (document == null) {
                            photoSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                        }
                        int i15 = 2;
                        if (canDownloadMediaType != 2 && (canDownloadMediaType != 1 || !messageObject.isVideo())) {
                            if (canDownloadMediaType != 0) {
                                if (document != null) {
                                    FileLoader fileLoader = FileLoader.getInstance(i14);
                                    if ((!MessageObject.isVideoDocument(document) && !messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) || !messageObject.shouldEncryptPhotoOrVideo()) {
                                        i15 = 0;
                                    }
                                    fileLoader.loadFile(document, messageObject, 1, i15);
                                } else if (photoSize != null) {
                                    FileLoader fileLoader2 = FileLoader.getInstance(i14);
                                    ImageLocation forObject = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
                                    if (messageObject.shouldEncryptPhotoOrVideo()) {
                                        i9 = 2;
                                    } else {
                                        i9 = 0;
                                    }
                                    fileLoader2.loadFile(forObject, messageObject, null, 1, i9);
                                }
                            }
                        } else if (canDownloadMediaType != 2 && document != null && !messageObject.shouldEncryptPhotoOrVideo() && messageObject.canStreamVideo()) {
                            FileLoader.getInstance(i14).loadFile(document, messageObject, 1, 0);
                        }
                        m4(false, false, false);
                    }
                    if (messageObject.hasVideoQualities()) {
                        i61 i61Var = messageObject.highestQuality;
                        if (i61Var != null && !i61Var.c()) {
                            FileLoader.getInstance(i14).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        i61 i61Var2 = messageObject.thumbQuality;
                        if (i61Var2 != null && !i61Var2.c()) {
                            FileLoader.getInstance(i14).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f25593u7;
            if (z2Var != null) {
                z2Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i14).isDownloading(messageObject2.messageOwner.f22401id) && !PhotoViewer.t1().Q1()) {
                TLRPC.Document document2 = messageObject2.getDocument();
                if (!MessageObject.isStickerDocument(document2) && !MessageObject.isAnimatedStickerDocument(document2, true) && !MessageObject.isGifDocument(document2) && !MessageObject.isRoundVideoDocument(document2)) {
                    if (document2 != null) {
                        FileLoader.getInstance(i14).cancelLoadFile(document2);
                        return;
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize != null) {
                        FileLoader.getInstance(i14).cancelLoadFile(closestPhotoSizeWithSize);
                    }
                }
            }
        }
    }

    public void E1(Canvas canvas) {
        if (!this.f25593u7.isMediaSpoilersRevealed && this.f25639xb != 1.0f) {
            ih.z2 z2Var = this.O0;
            int[] roundRadius = z2Var.getRoundRadius();
            float f10 = roundRadius[0];
            float[] fArr = this.vb;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = roundRadius[1];
            fArr[3] = f11;
            fArr[2] = f11;
            float f12 = roundRadius[2];
            fArr[5] = f12;
            fArr[4] = f12;
            float f13 = roundRadius[3];
            fArr[7] = f13;
            fArr[6] = f13;
            Path path = this.f25597ub;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(z2Var.getImageX(), z2Var.getImageY(), z2Var.getImageX2(), z2Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.f25639xb != 0.0f) {
                path.rewind();
                path.addCircle(this.f25655yb, this.f25669zb, this.Ab * this.f25639xb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f25593u7.needDrawBluredPreview()) {
                z2Var.draw(canvas);
            } else {
                float imageX = z2Var.getImageX();
                float imageY = z2Var.getImageY();
                float imageWidth = z2Var.getImageWidth();
                float imageHeight = z2Var.getImageHeight();
                ImageReceiver imageReceiver = this.P0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(z2Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        gr grVar;
        float f10 = this.f25600ue;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i9 = 0;
            if (z10 && ((z11 = this.f25417i1) || this.f25431j1)) {
                if (z11) {
                    grVar = gr.f28845g;
                } else {
                    grVar = gr.f28846i;
                }
                this.f25472m1 = (int) Math.ceil(grVar.getInterpolation(this.f25445k1) * AndroidUtilities.dp(35.0f));
                if (this.f25593u7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f25472m1 = 0;
                    }
                }
            }
            f10 += this.f25472m1;
            if (this.B8 && this.H != null) {
                if (z3()) {
                    i9 = 48;
                }
                return (AndroidUtilities.dp(71 - i9) * this.D8) + f10;
            }
        }
        return f10;
    }

    public final void E3() {
        ArrayList arrayList = this.U5;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((r1) arrayList.get(i9)).f24950w.setState(StateSet.NOTHING);
            }
        }
        ah.a aVar = this.W5;
        if (aVar != null) {
            aVar.f258a.setState(StateSet.NOTHING);
        }
    }

    public final void F0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                int i9 = 0;
                if (this.N8 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), this.N8.length);
                    z11 = false;
                    for (int i10 = 0; i10 < min; i10++) {
                        CheckBoxBase checkBoxBase = this.N8[i10];
                        if (checkBoxBase != null && checkBoxBase.f26313q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f25422i6;
                if (!z14 && !this.p6 && this.f25492n6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.p6 && !this.o6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f25450k6) {
                    charSequence = LocaleController.getString(R.string.PollButtonSave);
                    i9 = 84;
                } else if (z12 && (!poll.multiple_choice || !z13 || !z11)) {
                    if (!z15) {
                        if (messageObject.forceShowPollResults) {
                            charSequence = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PollViewBack), false, -AndroidUtilities.dp(2.6666667f), 0.0f, 1.0f);
                            i9 = 82;
                        } else {
                            charSequence = AndroidUtilities.replaceArrows(LocaleController.formatPluralString("PollViewVotesAsAdmin", pollResults.total_voters, new Object[0]), false);
                            i9 = 81;
                        }
                    } else {
                        charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                        i9 = 80;
                    }
                } else if (poll.multiple_choice && z13) {
                    charSequence = LocaleController.getString(R.string.PollSubmitVotesNoCaps);
                    i9 = 83;
                } else if (!this.N7 && z15 && ((z14 && (!this.f25477m6 || this.f25492n6)) || (this.p6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i9 = 80;
                } else {
                    charSequence = null;
                }
                if (i9 != 0) {
                    if (this.V5 == null) {
                        ah.d dVar = new ah.d(this, this.Ed);
                        this.V5 = dVar;
                        dVar.setCallback(this);
                        dVar.f258a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.Y2 = charSequence;
                    this.V5.d.q(charSequence, z10, true);
                    this.N2 = true;
                    this.X2 = i9;
                    o1();
                }
                S0(z10);
            }
        }
    }

    public void F1(Canvas canvas) {
        if (this.Bb == null) {
            return;
        }
        canvas.save();
        ih.z2 z2Var = this.O0;
        canvas.translate(z2Var.getImageX(), z2Var.getImageY());
        this.Bb.c(canvas, this, (int) z2Var.getImageWidth(), (int) z2Var.getImageHeight(), z2Var.getAlpha(), this.f25457ke);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i9) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.type == 17) {
            if (i9 == -2) {
                yg.g gVar = this.X5;
                if (gVar != null) {
                    return gVar.f50226b;
                }
                return null;
            } else if (i9 == -3) {
                yg.g gVar2 = this.Y5;
                if (gVar2 != null) {
                    return gVar2.f50226b;
                }
                return null;
            } else {
                ArrayList arrayList = this.U5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        r1 r1Var = (r1) obj;
                        ah.b bVar = r1Var.f24951x;
                        if (bVar != null && (pollAnswer = r1Var.f24947s) != null && pollAnswer.unshuffled_index == i9) {
                            return bVar.f249c;
                        }
                    }
                }
            }
        }
        k4 k4Var = this.B7;
        if (k4Var != null) {
            ArrayList arrayList2 = k4Var.f24592c;
            i4 i4Var = k4Var.f24591b;
            if (i4Var != null && i9 >= 0 && i9 < i4Var.f24503a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) k4Var.f24591b.f24503a.get(i9);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((j4) arrayList2.get(i11)).A == messageExtendedMedia) {
                        return ((j4) arrayList2.get(i11)).f24556f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.O0;
    }

    public final void F3(int i9) {
        i80 i80Var = this.f25561s5;
        if (i9 != -1) {
            Integer valueOf = Integer.valueOf(i9);
            for (int i10 = 0; i10 < i80Var.d; i10++) {
                if (((Pair) i80Var.f29377c.get(i10)).second == valueOf) {
                    i80Var.j(i10);
                }
            }
        } else {
            i80Var.d(true);
        }
        i80 i80Var2 = this.Q1;
        if (i80Var2 != null) {
            i80Var2.d(true);
        }
        this.f25505o5 = null;
        this.R1 = null;
        if (this.f25516p5 != null) {
            if (this.f25576t5 == i9 || i9 == -1) {
                this.f25516p5 = null;
                this.f25576t5 = -1;
                this.Od = false;
                this.Pd = false;
                invalidate();
            }
        }
    }

    public final boolean G0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.G0(android.view.MotionEvent):boolean");
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i9) {
        r1 r1Var;
        if (i9 >= 0) {
            ArrayList arrayList = this.U5;
            if (i9 < arrayList.size()) {
                int i10 = ((r1) arrayList.get(i9)).f24932b;
                int i11 = this.Hc;
                float f10 = i10 + i11;
                s1 s1Var = this.Vc;
                if (s1Var.f25226t2) {
                    float f11 = s1Var.K1;
                    f10 += ((1.0f - f11) * s1Var.f25230u2) + (i11 * f11);
                    if (this.f25593u7.needDrawForwarded()) {
                        f10 -= this.Hc;
                    }
                }
                if (s1Var.f25235w0) {
                    f10 += s1Var.f25182j0;
                }
                return f10 + r1Var.f24933c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f25303a4 != null) {
            this.f25303a4 = null;
        }
        ArrayList arrayList = this.f25618w5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25605v5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean H0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k1 k1Var;
        boolean c10 = gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i9 = this.E7;
        if (!c10 && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i9).isSendingCurrentLocation(this.f25593u7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (k1Var = this.Fc) != null && k1Var.Y0(3, this) && TextUtils.equals(this.Fc.i(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i9).isSendingCallback(this.f25593u7, keyboardButtonProto);
    }

    public final float H2(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.U5;
            if (i9 < arrayList.size()) {
                int i10 = ((r1) arrayList.get(i9)).f24932b;
                int i11 = this.Hc;
                float f10 = i10 + i11;
                s1 s1Var = this.Vc;
                if (s1Var.f25226t2) {
                    float f11 = s1Var.K1;
                    f10 += ((1.0f - f11) * s1Var.f25230u2) + (i11 * f11);
                    if (this.f25593u7.needDrawForwarded()) {
                        f10 -= this.Hc;
                    }
                }
                if (s1Var.f25235w0) {
                    f10 += s1Var.f25182j0;
                }
                return f10 - AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void H3() {
        CharSequence charSequence;
        long j10;
        long j11;
        long j12;
        long j13;
        b1 b1Var = this.Md;
        i8.i0 i0Var = this.f25612w;
        i0Var.a(b1Var);
        b1 b1Var2 = this.Nd;
        i0Var.a(b1Var2);
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f25593u7.caption;
            } else {
                charSequence = this.f25593u7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i9 = s00.f32328e;
                int i10 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    s00[] s00VarArr = (s00[]) spanned.getSpans(0, spanned.length(), s00.class);
                    for (s00 s00Var : s00VarArr) {
                        if (s00Var.f32330b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(s00VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(s00Var.f32330b.date));
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    long j14 = Long.MAX_VALUE;
                    long j15 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
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
                        i0Var.a(b1Var2);
                        zq zqVar = new zq(29, i0Var, b1Var2);
                        i0Var.f10991a.put(b1Var2, zqVar);
                        if (j17 > 0) {
                            AndroidUtilities.runOnUIThread(zqVar, j17);
                        } else {
                            AndroidUtilities.runOnUIThread(zqVar);
                        }
                    }
                }
            }
        }
    }

    public final boolean I0() {
        return FileLoader.getInstance(this.E7).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public final void I1(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.I1(float, android.graphics.Canvas, boolean):void");
    }

    public final int I2(byte[] bArr) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.U5;
            if (i9 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((r1) arrayList.get(i9)).f24947s;
                if (pollAnswer != null && Arrays.equals(pollAnswer.option, bArr)) {
                    return i9;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    public final void I3(int i9, int i10, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i9);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            invalidate();
            a3();
        }
    }

    public final void J1(android.graphics.Canvas r23, org.telegram.messenger.MessageObject.TextLayoutBlocks r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3(boolean z10, boolean z11) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z11 || (messageObject = this.f25593u7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f25303a4 = null;
                CheckBoxBase checkBoxBase = this.f25402h1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Ed);
                    this.f25402h1 = checkBoxBase2;
                    if (this.I0) {
                        checkBoxBase2.f26308l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
                    if (checkBoxBase.F != b6Var) {
                        checkBoxBase.F = b6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((groupedMessages = this.G) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.f25620w7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f25387g1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Ed);
                    this.f25387g1 = checkBoxBase4;
                    if (!checkBoxBase4.f26320y) {
                        checkBoxBase4.f26320y = true;
                        checkBoxBase4.b();
                    }
                    if (this.I0) {
                        this.f25387g1.f26308l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.b6 b6Var2 = this.Ed;
                    if (checkBoxBase3.F != b6Var2) {
                        checkBoxBase3.F = b6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.f25417i1 == z10) {
                if (z11 != this.f25431j1 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f25445k1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.f25431j1 = z11;
            this.f25417i1 = z10;
            if (z11) {
                this.l1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f25445k1 = f10;
            }
            invalidate();
        }
    }

    public final boolean K0(MotionEvent motionEvent) {
        z zVar;
        t1 t1Var;
        k1 k1Var;
        TLRPC.Chat chat;
        int i9;
        TLRPC.Chat chat2;
        if (this.Va && this.Ga != null && (zVar = this.G3) != null && (this.Ub != null || this.Vb != null)) {
            boolean contains = zVar.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.H3 = contains;
                if (contains) {
                    this.G3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.G3.setState(this.f25616w3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.H3 && (k1Var = this.Fc) != null) {
                    if (this.w8) {
                        TLRPC.User user = this.ec;
                        if (user != null && user.bot_inline_placeholder == null) {
                            k1Var.e2(this, user.f22527id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            k1 k1Var2 = this.Fc;
                            if (publicUsername == null) {
                                publicUsername = this.f25593u7.messageOwner.via_bot_name;
                            }
                            k1Var2.q0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Ub;
                        if (user2 != null) {
                            k1Var.u0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Vb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f25593u7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i10 = messageFwdHeader.channel_post;
                                    chat = this.fc;
                                    i9 = i10;
                                } else {
                                    chat = chat3;
                                    i9 = 0;
                                }
                                if (chat != null) {
                                    chat2 = chat;
                                } else {
                                    chat2 = chat3;
                                }
                                t1Var = this;
                                k1Var.Z(t1Var, chat2, i9, this.f25329c1, this.f25344d1, false);
                                t1Var.G3.setState(StateSet.NOTHING);
                                t1Var.H3 = false;
                                return t1Var.H3;
                            }
                        }
                    }
                }
                t1Var = this;
                t1Var.G3.setState(StateSet.NOTHING);
                t1Var.H3 = false;
                return t1Var.H3;
            }
            t1Var = this;
            return t1Var.H3;
        }
        this.H3 = false;
        return false;
    }

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f10;
        MessageObject messageObject2 = this.f25593u7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f25593u7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f25593u7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.f25402h1 != null) {
                if (this.f25417i1 || this.f25431j1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
                    if (groupedMessagePosition != null) {
                        int i9 = groupedMessagePosition.flags;
                        if ((i9 & 8) == 0 || (i9 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y10 = getY() + getPaddingTop();
                    MessageObject.GroupedMessages groupedMessages = this.G;
                    if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                        f10 = (getTop() + this.G.transitionParams.offsetTop) - getTranslationY();
                    } else {
                        f10 = y10 + this.Vc.f25182j0;
                    }
                    canvas.translate(this.E8, f10 + this.f25471le);
                    this.f25402h1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.Ed);
    }

    public final void K3(boolean z10, boolean z11) {
        this.f25409h8 = z10;
        this.f25307a8 = z11;
        s4();
        if (this.B5) {
            this.D5.f32221o = f3();
        } else {
            this.C5.f30500p = f3();
        }
        invalidate();
    }

    public final boolean L0(MotionEvent motionEvent) {
        k1 k1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Va && this.Ga != null && this.G3 != null && ((this.Ub != null || this.Vb != null) && this.Yb != null && this.f25325bc != null)) {
            boolean contains = this.M3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.N3 = contains;
                if (contains) {
                    this.M3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.M3.setState(this.f25616w3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.N3 && (k1Var = this.Fc) != null && (user = this.Ub) != null) {
                    Drawable drawable = this.f25325bc.f29319f[0];
                    if (drawable instanceof org.telegram.ui.Components.k5) {
                        document = ((org.telegram.ui.Components.k5) drawable).f29946e;
                    } else {
                        document = null;
                    }
                    k1Var.M1(this, user, document, this.f25311ac);
                    a3();
                }
                this.M3.setState(StateSet.NOTHING);
                this.N3 = false;
            }
            return this.N3;
        }
        this.N3 = false;
        return false;
    }

    public final void L1(Canvas canvas, boolean z10, boolean z11, float f10, float f11, float f12, float f13, float f14, boolean z12) {
        boolean z13;
        float dp;
        int i9;
        int v02;
        float f15;
        float f16;
        float f17;
        int i10 = 0;
        if (f14 != 1.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        float f18 = (f14 * 0.5f) + 0.5f;
        float f19 = f11 * f14;
        s1 s1Var = this.Vc;
        hg.s0 s0Var = this.J;
        if (z10) {
            if (!this.f25593u7.isOutOwner()) {
                qb0 qb0Var = org.telegram.ui.ActionBar.f6.E3;
                if (f4()) {
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23291tc, this.Ed);
                } else {
                    if (z12) {
                        i9 = org.telegram.ui.ActionBar.f6.Oa;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23291tc;
                    }
                    v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.Ed);
                }
                qb0Var.a(v02);
                if (f4()) {
                    f16 = (getPhotoBottom() + this.f25511p0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.B && !this.A) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float dp2 = (f10 - AndroidUtilities.dp(f15)) + f12;
                    if (this.f25483md) {
                        if (this.F) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        float i11 = s0Var.i(s1Var.K1);
                        f16 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (i11 + AndroidUtilities.dp(f17)));
                    } else {
                        f16 = dp2;
                    }
                }
                if (!this.f25593u7.scheduled) {
                    i10 = AndroidUtilities.dp(11.0f);
                }
                a0.p(qb0Var, f13 + i10, f16 - AndroidUtilities.dp(12.0f));
                qb0Var.setAlpha((int) (f19 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f18, f18, qb0Var.getBounds().centerX(), qb0Var.getBounds().centerY());
                }
                qb0Var.draw(canvas);
                qb0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f25593u7.isOutOwner()) {
            if (!this.f25593u7.scheduled) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            float f20 = f13 + i10;
            float f21 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f25511p0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.B && !this.A) {
                    f21 = 20.5f;
                }
                dp = (f10 - AndroidUtilities.dp(f21)) + f12;
                if (this.f25483md) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * s0Var.i(s1Var.K1);
                }
            }
            RectF rectF = this.Y4;
            rectF.set(f20, dp, AndroidUtilities.dp(14.0f) + f20, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.f6.f22961b2.getAlpha();
            int i12 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.f6.f22961b2.setAlpha(i12);
            if (z13) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.f22961b2);
            org.telegram.ui.ActionBar.f6.f22961b2.setAlpha(alpha);
            Drawable L2 = L2("drawableMsgError");
            a0.p(L2, f20 + AndroidUtilities.dp(6.0f), dp + AndroidUtilities.dp(2.0f));
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
        org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
        if (b6Var != null) {
            drawable = b6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.f6.O0(str);
    }

    public final void L3(boolean z10, boolean z11, boolean z12) {
        MessageObject messageObject;
        if (z10 || !z12 || (messageObject = this.f25593u7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.f25402h1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f25387g1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            y90 y90Var = this.Gc;
            float f10 = 0.0f;
            if (y90Var.f34905e == z11) {
                if (y90Var.f34906f != z12 && !z12) {
                    if (z11) {
                        f10 = 1.0f;
                    }
                    y90Var.d = f10;
                    y90Var.f34906f = false;
                    return;
                }
                return;
            }
            y90Var.f34905e = z11;
            y90Var.f34906f = z12;
            if (z12) {
                y90Var.f34904c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                y90Var.d = f10;
            }
            y90Var.a();
            t1 t1Var = y90Var.f34912m;
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

    public final void M1(Canvas canvas, float f10) {
        if (this.f25534qa == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.V8 != null) {
                this.Da -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f11 = this.Ca;
            float f12 = this.Da + dp;
            RectF rectF = this.Y4;
            rectF.set(f11, this.Da, AndroidUtilities.dp(32.0f) + f11, f12);
            o0();
            String str = "paintChatActionBackground";
            int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i9 != 0) {
                int alpha = M2("paintChatActionBackground").getAlpha();
                M2("paintChatActionBackground").setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), M2("paintChatActionBackground"));
                M2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.f25581ta) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i9 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.f6.f23069h2.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23069h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.f23069h2);
                    org.telegram.ui.ActionBar.f6.f23069h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.f23069h2);
                }
            }
            Drawable O0 = org.telegram.ui.ActionBar.f6.O0("drawableCommentSticker");
            a0.p(O0, this.Ca + AndroidUtilities.dp(4.0f), this.Da + AndroidUtilities.dp(4.0f));
            if (i9 != 0) {
                O0.setAlpha((int) (f10 * 255.0f));
                O0.draw(canvas);
                O0.setAlpha(255);
            } else {
                O0.draw(canvas);
            }
            if (this.V8 != null) {
                org.telegram.ui.ActionBar.f6.E2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xc, this.Ed));
                org.telegram.ui.ActionBar.f6.E2.setAlpha((int) (f10 * 255.0f));
                s1 s1Var = this.Vc;
                if (s1Var.U) {
                    if (s1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.f6.E2.setAlpha((int) ((1.0d - s1Var.K1) * 255.0d * f10));
                        canvas.translate(this.Ca + ((AndroidUtilities.dp(32.0f) - s1Var.X) / 2), this.Da + AndroidUtilities.dp(30.0f));
                        s1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.f6.E2.setAlpha((int) (s1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ca + ((AndroidUtilities.dp(32.0f) - this.d9) / 2), this.Da + AndroidUtilities.dp(30.0f));
                this.V8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
        if (b6Var != null) {
            paint = b6Var.O(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final boolean M3(boolean z10) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        t1 t1Var;
        if (this.f25593u7.isDice()) {
            Drawable drawable = this.O0.getDrawable();
            if (drawable instanceof ii0) {
                final ii0 ii0Var = (ii0) drawable;
                String diceEmoji = this.f25593u7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.E7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.E7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f25593u7.getDiceValue();
                if ("🎰".equals(this.f25593u7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        fv0 fv0Var = (fv0) ii0Var;
                        if (fv0Var.Q0 != null || fv0Var.R0) {
                            t1Var = this;
                        } else {
                            int i9 = diceValue - 1;
                            int U = fv0.U(i9 & 3);
                            int U2 = fv0.U((i9 >> 2) & 3);
                            int U3 = fv0.U(i9 >> 4);
                            if (U == 4 && U2 == 4 && U3 == 4) {
                                U = 5;
                                U3 = 5;
                                U2 = 5;
                            }
                            fv0Var.X0 = U;
                            fv0Var.Y0 = U2;
                            fv0Var.Z0 = U3;
                            MessageObject messageObject = getMessageObject();
                            int i10 = getMessageObject().currentAccount;
                            fv0Var.R0 = true;
                            t1Var = this;
                            Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(fv0Var, stickerSetByEmojiOrName, i10, messageObject, t1Var, z10));
                        }
                        if (t1Var.f25593u7.isOut()) {
                            ii0Var.P(Integer.MAX_VALUE, t1Var.f25341cd);
                        }
                        t1Var.f25593u7.wasUnread = false;
                    } else {
                        t1Var = this;
                    }
                    if (ii0Var.f30854j0 == null && !ii0Var.U0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        fv0 fv0Var2 = (fv0) ii0Var;
                        if (fv0Var2.f30854j0 == null && !fv0Var2.U0) {
                            fv0Var2.U0 = true;
                            Utilities.globalQueue.postRunnable(new fh.g1(fv0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), t1Var, 22));
                            return true;
                        }
                    }
                } else {
                    if (ii0Var.f30854j0 == null && !ii0Var.U0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.E7).getPathToAttach(document, true);
                        if (ii0Var.f30854j0 == null && !ii0Var.U0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.E7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f25593u7, this);
                                FileLoader.getInstance(this.E7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                ii0Var.U0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ii0 ii0Var2 = ii0Var;
                                                String str = readRes;
                                                if (ii0Var2.S0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ii0 ii0Var3 = ii0Var2;
                                                                    ii0Var3.U0 = false;
                                                                    if (!ii0Var3.R0 && ii0Var3.S0) {
                                                                        ii0Var3.A(true);
                                                                        return;
                                                                    }
                                                                    ii0Var3.j();
                                                                    ii0Var3.G();
                                                                    ii0Var3.v();
                                                                    return;
                                                                default:
                                                                    ii0 ii0Var4 = ii0Var2;
                                                                    ii0Var4.R0 = false;
                                                                    if (!ii0Var4.U0 && ii0Var4.S0) {
                                                                        ii0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ii0Var2.Q0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i11 = 0;
                                                if (ii0Var2.Q0 != null) {
                                                    i11 = ii0Var2.Q0.f26465a[0];
                                                }
                                                if (ii0Var2.Q0 != null) {
                                                    int i12 = ii0Var2.Q0.f26465a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new qd(ii0Var2, i11, 5));
                                                return;
                                            default:
                                                final ii0 ii0Var3 = ii0Var;
                                                ii0Var3.f30854j0 = RLottieNative.b(readRes, "dice", ii0Var3.f30847e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ii0 ii0Var32 = ii0Var3;
                                                                ii0Var32.U0 = false;
                                                                if (!ii0Var32.R0 && ii0Var32.S0) {
                                                                    ii0Var32.A(true);
                                                                    return;
                                                                }
                                                                ii0Var32.j();
                                                                ii0Var32.G();
                                                                ii0Var32.v();
                                                                return;
                                                            default:
                                                                ii0 ii0Var4 = ii0Var3;
                                                                ii0Var4.R0 = false;
                                                                if (!ii0Var4.U0 && ii0Var4.S0) {
                                                                    ii0Var4.A(true);
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
                        DownloadController.getInstance(this.E7).removeLoadingFileObserver(this);
                    }
                    if (diceValue >= 0 && diceValue < stickerSetByEmojiOrName.documents.size()) {
                        if (!z10 && this.f25593u7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.E7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            ii0Var.P(diceFrameSuccess.frame, this.f25341cd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.E7).getPathToAttach(document2, true);
                        if (ii0Var.Q0 == null && !ii0Var.R0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.E7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f25593u7, this);
                                FileLoader.getInstance(this.E7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f25593u7.wasUnread = false;
                            } else {
                                if (z10 && ii0Var.O == null && ii0Var.N == null && ii0Var.M == null) {
                                    ii0Var.G = 2;
                                    ii0Var.T0 = true;
                                }
                                ii0Var.R0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ii0 ii0Var2 = ii0Var;
                                                String str = readRes2;
                                                if (ii0Var2.S0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ii0 ii0Var32 = ii0Var2;
                                                                    ii0Var32.U0 = false;
                                                                    if (!ii0Var32.R0 && ii0Var32.S0) {
                                                                        ii0Var32.A(true);
                                                                        return;
                                                                    }
                                                                    ii0Var32.j();
                                                                    ii0Var32.G();
                                                                    ii0Var32.v();
                                                                    return;
                                                                default:
                                                                    ii0 ii0Var4 = ii0Var2;
                                                                    ii0Var4.R0 = false;
                                                                    if (!ii0Var4.U0 && ii0Var4.S0) {
                                                                        ii0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ii0Var2.Q0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i11 = 0;
                                                if (ii0Var2.Q0 != null) {
                                                    i11 = ii0Var2.Q0.f26465a[0];
                                                }
                                                if (ii0Var2.Q0 != null) {
                                                    int i12 = ii0Var2.Q0.f26465a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new qd(ii0Var2, i11, 5));
                                                return;
                                            default:
                                                final ii0 ii0Var3 = ii0Var;
                                                ii0Var3.f30854j0 = RLottieNative.b(readRes2, "dice", ii0Var3.f30847e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ii0 ii0Var32 = ii0Var3;
                                                                ii0Var32.U0 = false;
                                                                if (!ii0Var32.R0 && ii0Var32.S0) {
                                                                    ii0Var32.A(true);
                                                                    return;
                                                                }
                                                                ii0Var32.j();
                                                                ii0Var32.G();
                                                                ii0Var32.v();
                                                                return;
                                                            default:
                                                                ii0 ii0Var4 = ii0Var3;
                                                                ii0Var4.R0 = false;
                                                                if (!ii0Var4.U0 && ii0Var4.S0) {
                                                                    ii0Var4.A(true);
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
                        DownloadController.getInstance(this.E7).removeLoadingFileObserver(this);
                        this.f25593u7.wasUnread = false;
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
        int i9;
        int dp2;
        int i10;
        int i11 = this.G1;
        if ((i11 != 5 && i11 != 1) || (groupedMessagePosition = this.H) == null || (groupedMessagePosition.flags & 4) != 0) {
            int i12 = this.f25593u7.type;
            if (i12 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i11 == 1 || i12 == 12 || i11 == 5 || i11 == 4 || i11 == 2 || i12 == 8) && !this.f25374f2 && !this.f25388g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                int x10 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f25543r3;
                if (action == 0) {
                    MessageObject messageObject = this.f25593u7;
                    if (messageObject.type == 16) {
                        boolean isVideoCall = messageObject.isVideoCall();
                        int i13 = this.O4;
                        if (x10 >= i13) {
                            if (LocaleController.isRTL) {
                                dp = 0;
                            } else {
                                dp = this.F8 - AndroidUtilities.dp(70.0f);
                            }
                            int i14 = i13 + dp;
                            if (!isVideoCall) {
                                i9 = 2;
                            } else {
                                i9 = 0;
                            }
                            if (x10 <= AndroidUtilities.dp(i9 + 30) + i14 && z22 >= this.P4 - AndroidUtilities.dp(14.0f)) {
                                if (z22 <= AndroidUtilities.dp(50.0f) + this.P4) {
                                    this.V4 = true;
                                    this.f25574t3[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i15 = this.O4;
                                        if (LocaleController.isRTL) {
                                            dp2 = 0;
                                        } else {
                                            dp2 = this.F8 - AndroidUtilities.dp(70.0f);
                                        }
                                        int i16 = i15 + dp2;
                                        if (!isVideoCall) {
                                            i10 = 2;
                                        } else {
                                            i10 = 0;
                                        }
                                        int dp3 = AndroidUtilities.dp(i10) + i16;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.G4;
                                        int B = ll.B(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int z11 = ll.z(2, this.P4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(B - AndroidUtilities.dp(20.0f), z11 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + B, AndroidUtilities.dp(20.0f) + z11);
                                        drawableArr[0].setHotspot(x10, z22);
                                        drawableArr[0].setState(this.f25616w3);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.O4 - AndroidUtilities.dp(20.0f)) {
                        if (x10 <= AndroidUtilities.dp(20.0f) + this.O4 && z22 >= this.P4 - AndroidUtilities.dp(4.0f)) {
                            if (z22 <= AndroidUtilities.dp(30.0f) + this.P4) {
                                this.V4 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.V4) {
                        if (this.f25593u7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.V4 = false;
                        playSoundEffect(0);
                        this.Fc.E0(this, this.O4, this.P4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f25593u7.type == 16 && this.V4 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                }
            }
        }
        return false;
    }

    public final void N1(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.N1(android.graphics.Canvas, float):void");
    }

    public final float N2(float f10) {
        float f11;
        float f12;
        if (f4() && this.G1 != 7) {
            return ((getPhotoBottom() + this.f25511p0) - AndroidUtilities.dp(7.3f)) - this.f25454kb.getHeight();
        }
        int i9 = this.I8;
        if (!this.B && !this.A) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float dp = ((i9 - AndroidUtilities.dp(f11)) - this.f25454kb.getHeight()) + f10;
        boolean z10 = this.f25483md;
        s1 s1Var = this.Vc;
        if (z10) {
            if (this.F) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.J.i(s1Var.K1) + AndroidUtilities.dp(f12));
        }
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f13 = dp + transitionParams.offsetBottom;
            if (transitionParams.backgroundChangeBounds) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (s1Var.f25177i0 - s1Var.f25182j0) + dp;
    }

    public final void N3(Drawable drawable, int i9, int i10, int i11, int i12) {
        if (drawable != null) {
            ej0 ej0Var = this.f25356de;
            s1 s1Var = this.Vc;
            if (ej0Var != null && ej0Var.h) {
                this.f25471le = 0.0f;
            } else {
                float f10 = i10 + i12 + s1Var.f25177i0;
                this.f25471le = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i9 + s1Var.f25168g0), (int) (i10 + s1Var.f25182j0), (int) (i9 + i11 + s1Var.f25172h0), (int) (i10 + i12 + s1Var.f25177i0));
        }
    }

    public final boolean O0(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.O0(android.view.MotionEvent):boolean");
    }

    public final void O1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.O1(android.graphics.Canvas):void");
    }

    public final int O2(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.U5;
            if (i10 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((r1) arrayList.get(i10)).f24948t;
                if (todoItem != null && todoItem.f22525id == i9) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f25336c8 = true;
        this.f25351d8 = 1000;
        this.f25380f8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        nu0 P1;
        int intValue;
        k1 k1Var = this.Fc;
        if (k1Var == null) {
            P1 = null;
        } else {
            P1 = k1Var.P1();
        }
        nu0 nu0Var = P1;
        if (this.f25593u7 != null) {
            ih.z2 z2Var = this.O0;
            if (z2Var.hasNotThumb() && nu0Var != null && !this.f25593u7.isSticker() && !this.f25593u7.isAnimatedEmoji() && ((!this.f25593u7.isVideo() || this.f25437j7) && !this.f25483md && !this.f25593u7.isAnimatedSticker() && ((!this.f25593u7.isDocument() || this.f25593u7.isGif()) && !this.f25593u7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f25593u7;
                dh.k kVar = this.Bb;
                if (kVar == null) {
                    intValue = 0;
                } else {
                    Integer num = (Integer) kVar.f4610k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    intValue = num.intValue();
                }
                return nu0Var.a(motionEvent, this, z2Var, messageObject, intValue);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.Y3 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f25607v7;
        if (messageObject == null) {
            messageObject = this.f25593u7;
        }
        if (messageObject == null) {
            this.f25303a4 = null;
            return;
        }
        ai0 ai0Var = this.f25303a4;
        if (ai0Var == null || !ai0Var.f26825f || !Arrays.equals(ai0Var.f26826g, bArr)) {
            this.f25303a4 = new ai0(this, messageObject.getId(), bArr);
        }
        this.f25586u0 = true;
    }

    public final boolean Q0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.Q0(android.view.MotionEvent):boolean");
    }

    public final void Q1(Canvas canvas) {
        float f10;
        int i9;
        float f11;
        int dp;
        int extraTextX;
        int i10;
        float f12;
        float f13;
        int dp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f14 = 1.0f;
            if (this.J1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            s1 s1Var = this.Vc;
            if (s1Var.R2) {
                f10 = AndroidUtilities.lerp(1.0f - f10, f10, s1Var.K1);
            }
            float f15 = 1.0f * f10;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + s1Var.f25172h0;
            if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.F) {
                i9 = 6;
            } else {
                i9 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i9)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.G;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i10 = (int) this.f25461l4;
            } else if (this.f25593u7.isOutOwner()) {
                i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25548r8;
                if (this.f25593u7.type == 19) {
                    i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + i10)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f25394g8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f25548r8;
                    extraTextX = getExtraTextX();
                } else {
                    int i11 = this.f25548r8;
                    if (this.F) {
                        f11 = 12.0f;
                    } else {
                        f11 = 18.0f;
                    }
                    dp = AndroidUtilities.dp(f11) + i11;
                    extraTextX = getExtraTextX();
                }
                i10 = extraTextX + dp;
            }
            int dp4 = ((int) (i10 + s1Var.f25168g0)) - AndroidUtilities.dp(1.33f);
            int i12 = this.m0;
            float f16 = dp4;
            int i13 = (int) (dp3 - f16);
            int i14 = this.f25316b2;
            if (s1Var.X2) {
                i14 = AndroidUtilities.lerp(s1Var.T2, i14, s1Var.K1);
            }
            if (this.V1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            if (s1Var.Z2) {
                AndroidUtilities.lerp(1.0f - f12, f12, s1Var.K1);
            }
            if (this.Z9 == null) {
                this.Z9 = new dl0(this);
            }
            int o6 = this.Z9.o(this.Ed);
            canvas.save();
            canvas.translate(f16, i12);
            int i15 = i14;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i13, i15);
            pc pcVar = this.N1;
            if (pcVar != null) {
                f13 = pcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.Z9.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.Z9.e(canvas, rectF, f15);
            nz0 nz0Var = this.K1;
            if (nz0Var != null) {
                nz0Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f15, o6, canvas);
                if (this.L1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.K1.f31223c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.L1.f31223c, AndroidUtilities.dp(21.66f));
                    pc pcVar2 = this.M1;
                    if (pcVar2 != null) {
                        f14 = pcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.Z9.f27759g);
                    this.L1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f15, o6, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f25381f9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        MessageObject messageObject = this.f25607v7;
        if (messageObject == null) {
            messageObject = this.f25593u7;
        }
        this.f25586u0 = false;
        ArrayList arrayList = this.f25618w5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.Y3 != null && !TextUtils.isEmpty(messageObject.caption)) {
                CharSequence charSequence = messageObject.caption;
                if (charSequence instanceof Spannable) {
                    Spanned spanned = (Spanned) charSequence;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length > 0) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i13 = spanned.getSpanStart(characterStyle);
                                i12 = spanned.getSpanEnd(characterStyle);
                                break;
                            }
                        }
                    }
                    i12 = -1;
                    i13 = -1;
                    if (i13 >= 0 && i12 >= 0) {
                        int i15 = i12 - i13;
                        int i16 = 0;
                        while (i16 < this.Y3.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.Y3.textLayoutBlocks.get(i16);
                            if (i13 >= textLayoutBlock.charactersOffset && i13 < textLayoutBlock.charactersEnd) {
                                this.f25571t0 = i16;
                                this.f25586u0 = false;
                                G3();
                                try {
                                    f80 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i13, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i13, i12, B3);
                                    if (i12 >= textLayoutBlock.charactersOffset + i15) {
                                        do {
                                            i16++;
                                            if (i16 >= this.Y3.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.Y3.textLayoutBlocks.get(i16);
                                            i14 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            f80 B32 = B3();
                                            B32.d(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                            textLayoutBlock2.textLayout.getSelectionPath(0, i12 - textLayoutBlock2.charactersOffset, B32);
                                        } while (i12 >= (textLayoutBlock.charactersOffset + i14) - 1);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                invalidate();
                                return;
                            }
                            i16++;
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
                            i10 = spanned2.getSpanStart(characterStyle);
                            i9 = spanned2.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i9 = -1;
                i10 = -1;
                if (i10 >= 0 && i9 >= 0) {
                    int i17 = i9 - i10;
                    int i18 = 0;
                    while (i18 < messageObject.textLayoutBlocks.size()) {
                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                        if (i10 >= textLayoutBlock3.charactersOffset && i10 < textLayoutBlock3.charactersEnd) {
                            this.f25571t0 = i18;
                            this.f25586u0 = false;
                            G3();
                            try {
                                f80 B33 = B3();
                                B33.d(textLayoutBlock3.textLayout, i10, 0.0f);
                                textLayoutBlock3.textLayout.getSelectionPath(i10, i9, B33);
                                if (i9 >= textLayoutBlock3.charactersOffset + i17) {
                                    do {
                                        i18++;
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i18);
                                        i11 = textLayoutBlock4.charactersEnd - textLayoutBlock4.charactersOffset;
                                        f80 B34 = B3();
                                        B34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i9 - textLayoutBlock4.charactersOffset, B34);
                                    } while (i9 >= (textLayoutBlock3.charactersOffset + i11) - 1);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            invalidate();
                            return;
                        }
                        i18++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f25571t0 = -1;
                this.f25586u0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f25571t0 = -1;
            this.f25586u0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        yg.g gVar;
        yg.g gVar2;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            yg.g gVar3 = this.X5;
            if (gVar3 != null) {
                if (gVar3.T && gVar3.f50224a.f47776f && gVar3.G.f(x10 - gVar3.H, z22 - gVar3.I, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25315b1 = true;
                    invalidate();
                    return true;
                }
                yg.g gVar4 = this.X5;
                if ((gVar4.T || gVar4.S) && gVar4.j(x10, z22, action)) {
                    this.f25315b1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f25593u7.expandedExplanation && (gVar2 = this.Y5) != null) {
                if (gVar2.T && gVar2.f50224a.f47776f && gVar2.G.f(x10 - gVar2.H, z22 - gVar2.I, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25315b1 = true;
                    invalidate();
                    return true;
                }
                yg.g gVar5 = this.Y5;
                if ((gVar5.T || gVar5.S) && gVar5.j(x10, z22, action)) {
                    this.f25315b1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.J6 = -1;
                yg.g gVar6 = this.X5;
                if (gVar6 != null && gVar6.O && gVar6.getBounds().contains(x10, z22)) {
                    this.J6 = -2;
                    invalidate();
                    return true;
                } else if (this.f25593u7.expandedExplanation && (gVar = this.Y5) != null && gVar.O && gVar.getBounds().contains(x10, z22)) {
                    this.J6 = -3;
                    invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.J6 != -1) {
                    return true;
                }
            } else if (action == 1 && this.J6 != -1) {
                playSoundEffect(0);
                int i9 = this.J6;
                if (i9 == -2) {
                    yg.g gVar7 = this.X5;
                    ImageReceiver imageReceiver = gVar7.f50226b;
                    TLRPC.MessageMedia messageMedia = gVar7.P;
                    k1 k1Var = this.Fc;
                    if (k1Var != null) {
                        k1Var.q(this, null, messageMedia, -2);
                    }
                } else if (i9 == -3) {
                    yg.g gVar8 = this.Y5;
                    ImageReceiver imageReceiver2 = gVar8.f50226b;
                    TLRPC.MessageMedia messageMedia2 = gVar8.P;
                    k1 k1Var2 = this.Fc;
                    if (k1Var2 != null) {
                        k1Var2.q(this, null, messageMedia2, -3);
                    }
                }
                this.J6 = -1;
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
        org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
        if (b6Var != null) {
            return b6Var.t0();
        }
        return org.telegram.ui.ActionBar.f6.a1();
    }

    public final void R3(int i9) {
        MessageObject messageObject = this.f25607v7;
        if (messageObject == null) {
            messageObject = this.f25593u7;
        }
        if (messageObject == null) {
            this.f25303a4 = null;
            return;
        }
        ai0 ai0Var = this.f25303a4;
        if (ai0Var == null || !ai0Var.f26824e || ai0Var.f26823c != (-i9)) {
            this.f25303a4 = new ai0(this, messageObject.getId(), i9);
        }
        this.f25586u0 = true;
    }

    public final void S0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.V5 != null && (messageObject = this.f25593u7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f25593u7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            ah.d dVar = this.V5;
            if (z11 && SendMessagesHelper.getInstance(this.E7).isSendingVote(this.f25593u7) != null) {
                z12 = true;
            }
            td.a aVar = dVar.f262f;
            if (aVar.f47776f != z12) {
                aVar.a(z12, z10);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f25593u7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f25531q7) {
            return true;
        }
        return false;
    }

    public final void S3(String str) {
        T3(str, false, false, -1);
    }

    public final boolean T0(MotionEvent motionEvent) {
        k1 k1Var;
        int i9;
        t1 t1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (this.f25653y9 == null || (k1Var = this.Fc) == null || !k1Var.o0()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f25593u7.shouldDrawWithoutBackground()) {
            i9 = Math.max(this.F9, this.H9) + this.C9;
        } else {
            i9 = this.f25564s8 + this.C9;
        }
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.C9 && x10 <= i9) {
                float f10 = this.D9;
                if (z22 >= f10 && z22 <= f10 + this.E9) {
                    this.M9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.Q9 = x10;
                    this.R9 = getY() + z22;
                    z zVar = this.f25610vc;
                    if (zVar != null) {
                        zVar.setHotspot(x10, z22);
                        this.N9 = false;
                        this.O9 = true;
                        postDelayed(new b1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    pc pcVar = this.f25536qc;
                    if (pcVar != null) {
                        pcVar.c(true);
                        this.f25583tc = x10;
                        this.f25598uc = z22;
                    }
                    q();
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.M9) {
                    k();
                    this.M9 = false;
                    z zVar2 = this.f25610vc;
                    if (zVar2 != null) {
                        if (!this.N9) {
                            zVar2.setState(new int[]{16842919, 16842910});
                            post(new b1(5, this));
                        } else {
                            zVar2.setState(new int[0]);
                        }
                        this.N9 = false;
                        this.O9 = false;
                        invalidate();
                    }
                    pc pcVar2 = this.f25536qc;
                    if (pcVar2 != null) {
                        pcVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f25427ic) {
                        k1 k1Var2 = this.Fc;
                        if (k1Var2 != null) {
                            TLRPC.Chat chat = this.fc;
                            if (chat != null) {
                                k1Var2.Z(this, chat, this.f25593u7.messageOwner.fwd_from.channel_post, this.f25329c1, this.f25344d1, false);
                                t1Var = this;
                            } else {
                                t1Var = this;
                                TLRPC.User user = t1Var.f25354dc;
                                if (user != null) {
                                    k1Var2.u0(this, user, t1Var.f25329c1, t1Var.f25344d1);
                                } else if (t1Var.f25398gc != null) {
                                    k1Var2.r(this);
                                }
                            }
                        }
                    } else {
                        t1Var = this;
                        if (t1Var.Fc != null && (t1Var.f25593u7.hasValidReplyMessageObject() || t1Var.f25593u7.isReplyToStory() || t1Var.f25595u9 || ((message = t1Var.f25593u7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            t1Var.Fc.S1(t1Var, t1Var.f25593u7.getReplyMsgId(), x10, z22, false);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (motionEvent.getAction() == 3) {
                    t1Var.M9 = false;
                    t1Var.N9 = false;
                    z zVar3 = t1Var.f25610vc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    pc pcVar3 = t1Var.f25536qc;
                    if (pcVar3 != null) {
                        pcVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x10 >= t1Var.C9 && x10 <= i9) {
                        float f11 = t1Var.D9;
                        if (z22 >= f11 && z22 <= f11 + t1Var.E9) {
                            if (t1Var.f25610vc != null && t1Var.O9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - t1Var.R9, 2.0d) + Math.pow(x10 - t1Var.Q9, 2.0d)) > 0.75d) {
                                    t1Var.O9 = false;
                                }
                            }
                        }
                    }
                    t1Var.M9 = false;
                    t1Var.N9 = false;
                    t1Var.O9 = false;
                    z zVar4 = t1Var.f25610vc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    pc pcVar4 = t1Var.f25536qc;
                    if (pcVar4 != null) {
                        pcVar4.c(false);
                    }
                }
            }
            return t1Var.M9;
        }
        t1Var = this;
        return t1Var.M9;
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

    public final boolean U0(int i9, MotionEvent motionEvent) {
        int i10;
        dh.l lVar;
        int i11;
        int i12;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        int i13;
        int i14;
        int i15;
        int i16;
        MessageObject.GroupedMessages groupedMessages;
        if (i9 > 15 || getParent() == null) {
            return false;
        }
        if (this.f25593u7.hasValidGroupId() && (groupedMessages = this.G) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                View childAt = viewGroup.getChildAt(i17);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.G.groupId) {
                        int i18 = currentPosition.flags;
                        if ((i18 & 8) != 0 && (i18 & 1) != 0 && t1Var != this) {
                            motionEvent.offsetLocation(getLeft() - t1Var.getLeft(), getTop() - t1Var.getTop());
                            boolean U0 = t1Var.U0(i9 + 1, motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - t1Var.getLeft()), -(getTop() - t1Var.getTop()));
                            return U0;
                        }
                    }
                }
            }
        }
        if (this.f25578t7) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        s1 s1Var = this.Vc;
        if (actionMasked == 0) {
            int i19 = this.f25430j0;
            if (x10 >= i19 && z22 >= (i15 = this.f25486n0)) {
                MessageObject messageObject = this.f25593u7;
                if (x10 <= i19 + messageObject.textWidth && z22 <= messageObject.textHeight(s1Var) + i15) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25593u7.textLayoutBlocks;
                    for (int i20 = 0; i20 < arrayList.size() && arrayList.get(i20).textYOffset(this.f25593u7.textLayoutBlocks, s1Var) <= z22; i20++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i20);
                        if (textLayoutBlock.isRtl()) {
                            i16 = (int) this.f25593u7.textXOffset;
                        } else {
                            i16 = 0;
                        }
                        for (dh.l lVar2 : textLayoutBlock.spoilers) {
                            if (lVar2.getBounds().contains((x10 - this.f25430j0) + i16, (int) ((z22 - this.f25486n0) - textLayoutBlock.textYOffset(this.f25593u7.textLayoutBlocks, s1Var)))) {
                                this.f25563s7 = lVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.Y3 != null) {
                float f10 = x10;
                float f11 = this.f25461l4;
                if (f10 >= f11) {
                    float f12 = z22;
                    float f13 = this.f25475m4;
                    if (f12 >= f13 && f10 <= f11 + textLayoutBlocks.textWidth && f12 <= f13 + textLayoutBlocks.textHeight(s1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.Y3.textLayoutBlocks;
                        for (int i21 = 0; i21 < arrayList2.size() && arrayList2.get(i21).textYOffset(this.Y3.textLayoutBlocks, s1Var) <= f12; i21++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i21);
                            if (textLayoutBlock2.isRtl()) {
                                i14 = (int) this.Y3.textXOffset;
                            } else {
                                i14 = 0;
                            }
                            for (dh.l lVar3 : textLayoutBlock2.spoilers) {
                                if (lVar3.getBounds().contains((int) ((f10 - this.f25461l4) + i14), (int) ((f12 - this.f25475m4) - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, s1Var)))) {
                                    this.f25563s7 = lVar3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f25347d4 == null) {
                return false;
            }
            float f14 = x10;
            float f15 = this.W6;
            if (f14 < f15) {
                return false;
            }
            float f16 = z22;
            float f17 = this.X6;
            if (f16 <= f17 || f14 > f15 + textLayoutBlocks2.textWidth || f16 > f17 + textLayoutBlocks2.textHeight(s1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f25347d4.textLayoutBlocks;
            for (int i22 = 0; i22 < arrayList3.size() && arrayList3.get(i22).textYOffset(this.f25347d4.textLayoutBlocks, s1Var) <= f16; i22++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i22);
                if (textLayoutBlock3.isRtl()) {
                    i13 = (int) this.f25347d4.textXOffset;
                } else {
                    i13 = 0;
                }
                for (dh.l lVar4 : textLayoutBlock3.spoilers) {
                    if (lVar4.getBounds().contains((int) ((f14 - this.W6) + i13), (int) ((f16 - this.X6) - textLayoutBlock3.textYOffset(this.f25347d4.textLayoutBlocks, s1Var)))) {
                        this.f25563s7 = lVar4;
                        return true;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f25563s7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Jd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f25347d4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i23 = 0;
                while (i23 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i23);
                    i23++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (dh.l lVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = lVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f25347d4.textLayoutBlocks, s1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f25347d4.textLayoutBlocks, s1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.Y3;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i24 = 0;
                while (i24 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (dh.l lVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = lVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.Y3.textLayoutBlocks, s1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.Y3.textLayoutBlocks, s1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f25593u7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i25);
                        i25++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (dh.l lVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = lVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f25593u7.textLayoutBlocks, s1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f25593u7.textLayoutBlocks, s1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.Y4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f25578t7 = true;
            this.f25563s7.f4627q = new b1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f25347d4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i26 = 0;
                while (i26 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i26);
                    i26++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i12 = (int) this.f25347d4.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (dh.l lVar8 : textLayoutBlock11.spoilers) {
                        lVar8.j((x10 - this.W6) + i12, (z22 - textLayoutBlock11.textYOffset(this.f25347d4.textLayoutBlocks, s1Var)) - this.X6, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.Y3;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i27 = 0;
                while (i27 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i11 = (int) this.Y3.textXOffset;
                    } else {
                        i11 = 0;
                    }
                    for (dh.l lVar9 : textLayoutBlock13.spoilers) {
                        lVar9.j((x10 - this.f25461l4) + i11, (z22 - textLayoutBlock13.textYOffset(this.Y3.textLayoutBlocks, s1Var)) - this.f25475m4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f25593u7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i28);
                        i28++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i10 = (int) this.f25593u7.textXOffset;
                        } else {
                            i10 = 0;
                        }
                        for (dh.l lVar10 : textLayoutBlock15.spoilers) {
                            lVar10.j((x10 - this.f25430j0) + i10, (z22 - textLayoutBlock15.textYOffset(this.f25593u7.textLayoutBlocks, s1Var)) - this.f25486n0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof wk0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i29 = 0; i29 < viewGroup2.getChildCount(); i29++) {
                    View childAt2 = viewGroup2.getChildAt(i29);
                    if (childAt2 instanceof t1) {
                        t1 t1Var2 = (t1) childAt2;
                        ArrayList arrayList10 = t1Var2.Hd;
                        if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((dh.l) arrayList10.get(0)).f4627q = new ka(6, this, t1Var2);
                            int size7 = arrayList10.size();
                            int i30 = 0;
                            while (i30 < size7) {
                                Object obj = arrayList10.get(i30);
                                i30++;
                                ((dh.l) obj).j(lVar.getBounds().centerX(), lVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f25563s7 = null;
            return true;
        }
    }

    public final void U1(float r37, float r38, android.graphics.Canvas r39, java.util.ArrayList r40, float r41, boolean r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.U1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean U2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.U2():boolean");
    }

    public final void U3(float f10, float f11, float f12, float f13) {
        ih.z2 z2Var = this.O0;
        z2Var.setImageCoords(f10, f11, f12, f13);
        int i9 = this.G1;
        if (i9 != 4 && i9 != 2) {
            return;
        }
        this.I4 = (int) (z2Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (z2Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.J4 = imageY;
        int i10 = this.I4;
        int dp = AndroidUtilities.dp(24.0f) + this.J4;
        this.L0.q(i10, imageY, AndroidUtilities.dp(24.0f) + i10, dp);
        this.G4 = (int) e2.c.A(z2Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f10);
        int A = (int) e2.c.A(z2Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, z2Var.getImageY());
        this.H4 = A;
        int i11 = this.G4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.H4;
        this.K0.q(i11, A, AndroidUtilities.dp(48.0f) + i11, dp2);
    }

    public final void V0() {
        int i9;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.isStakedDice() && !this.M) {
            Drawable drawable = this.O0.getDrawable();
            if (drawable instanceof ii0) {
                ii0 ii0Var = (ii0) drawable;
                if ((ii0Var.f30854j0 != null || ii0Var.U0) && !this.M && (i9 = ii0Var.G) != 1 && i9 == 2) {
                    if (!ii0Var.T0) {
                        float r10 = ii0Var.r();
                        if (ii0Var.Q0 != null) {
                            r10 = ii0Var.X / ii0Var.W0;
                        }
                        if (r10 <= 0.95f) {
                            return;
                        }
                    }
                    this.M = true;
                    k1 k1Var = this.Fc;
                    if (k1Var != null) {
                        k1Var.t1(this, false);
                    }
                }
            }
        }
    }

    public final void V1(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i9;
        int i10;
        Canvas canvas2;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f13 = this.f25486n0;
            s1 s1Var = this.Vc;
            if (s1Var.f25193l2) {
                float f14 = s1Var.f25202n2;
                float f15 = s1Var.K1;
                f10 = (f15 * f13) + ((1.0f - f15) * f14);
            } else {
                f10 = f13;
            }
            if (s1Var.K1 != 1.0f && s1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.d5 d5Var = this.f25518p8;
                if (d5Var != null) {
                    Rect bounds = d5Var.getBounds();
                    if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.B) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                ej0 ej0Var = this.f25356de;
                if (ej0Var != null && ej0Var.h) {
                    MessageObject messageObject2 = this.f25593u7;
                    U1(this.f25430j0, f10, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f25430j0, f10, canvas, s1Var.H0, s1Var.N0, false, 1.0f - s1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f25593u7;
                    U1(this.f25430j0, f10, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, s1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z10 = s1Var.D1;
            if (z10 && this.f25518p8 != null) {
                if (z10) {
                    int i11 = -1;
                    if (this.f25512p1) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                    float z11 = e2.c.z(1.0f, s1Var.K1, this.f25593u7.textHeight(s1Var) * i10, f13);
                    float f17 = s1Var.f25202n2;
                    if (this.f25512p1) {
                        i11 = 1;
                    }
                    f11 = f17 - ((this.f25593u7.textHeight(s1Var) * i11) * s1Var.K1);
                    f12 = z11;
                } else {
                    f11 = f16;
                    f12 = f11;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f25518p8.getBounds());
                if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.B) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f18 = rectF.left;
                float f19 = s1Var.f25202n2;
                canvas.clipRect(f18, f19, rectF.right, this.f25593u7.textHeight(s1Var) + f19 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f25593u7;
                U1(this.f25430j0, f11, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - s1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f25518p8.getBounds());
                if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.B) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f25486n0, rectF.right, AndroidUtilities.dp(4.0f) + this.f25593u7.textHeight(s1Var) + i9);
                MessageObject messageObject5 = this.f25593u7;
                U1(this.f25430j0, f12, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f25593u7;
            U1(this.f25430j0, f16, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null) {
                int i9 = groupedMessagePosition.flags;
                if ((i9 & 8) == 0 || (i9 & 1) == 0) {
                    return false;
                }
            }
            if (!this.J.f10734b) {
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
        if (!this.f25352da || this.f25411ha == null || this.f25568sc == null || this.Fc == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.yc;
        if (action == 0) {
            if (rectF.contains(x10, z22)) {
                this.f25568sc.c(true);
                z zVar = this.f25396ga;
                if (zVar != null) {
                    zVar.setHotspot(x10, z22);
                    this.f25396ga.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.f25568sc.h && !rectF.contains(x10, z22)) {
                this.f25568sc.c(false);
                z zVar2 = this.f25396ga;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f25568sc.h) {
                this.Fc.I0(this);
            }
            this.f25568sc.c(false);
            z zVar3 = this.f25396ga;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f25568sc.c(false);
            z zVar4 = this.f25396ga;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.f25568sc.h;
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
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i9);
                i9++;
                if (!textLayoutBlock.spoilers.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList2 = getMessageObject().textLayoutBlocks;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                i10++;
                if (!textLayoutBlock2.spoilers.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.I0) {
            V3(messageObject, groupedMessages, z10, z11, z12, z13);
            return;
        }
        this.f25607v7 = messageObject;
        this.f25620w7 = groupedMessages;
        this.f25651y7 = z10;
        this.f25635x7 = z11;
        this.f25665z7 = z12;
        this.A7 = z13;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        o9 q22;
        boolean z10;
        boolean z11;
        int i9;
        int dp;
        int i10;
        int dp2;
        int extraTextX;
        int i11;
        MessageObject.GroupedMessages groupedMessages;
        k1 k1Var = this.Fc;
        if (k1Var != null && (q22 = k1Var.q2()) != null && (q22.b() || q22.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25593u7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f25593u7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f25373f1 || this.G != null) && (this.G == null || this.Fc.W()))) {
                if (this.f25593u7.hasValidGroupId() && (groupedMessages = this.G) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            if (childAt instanceof t1) {
                                t1 t1Var = (t1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.G.groupId && (currentPosition.flags & s0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    q22.f24075c = (int) t1Var.f25461l4;
                                    q22.d = (int) t1Var.f25475m4;
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
                    MessageObject messageObject = this.f25593u7;
                    if (messageObject != null && !messageObject.preview && this.O1 != null && z2(motionEvent) >= this.m0) {
                        q22.f24843w0 = false;
                        q22.f24845y0 = true;
                        q22.A0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.G;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i11 = (int) this.f25461l4;
                        } else {
                            float f10 = 12.0f;
                            if (this.f25593u7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25548r8;
                                if (this.f25593u7.type == 19) {
                                    i11 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i11 = extraTextX2;
                                }
                            } else {
                                if (this.f25394g8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f25548r8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i13 = this.f25548r8;
                                    if (!this.F) {
                                        f10 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f10) + i13;
                                    extraTextX = getExtraTextX();
                                }
                                i11 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i11 + this.Vc.f25168g0)) - AndroidUtilities.dp(1.33f);
                        int i14 = this.m0;
                        q22.f24075c = (AndroidUtilities.dp(10.0f) + dp3) - this.X1;
                        q22.d = AndroidUtilities.dp(22.0f) + i14;
                    } else if (P2()) {
                        q22.f24843w0 = false;
                        q22.f24845y0 = false;
                        q22.A0 = false;
                        q22.f24075c = (int) this.f25461l4;
                        q22.d = (int) this.f25475m4;
                    } else {
                        MessageObject messageObject2 = this.f25593u7;
                        if (messageObject2 != null && !messageObject2.preview && this.G2 != null && (!this.f25512p1 ? z2(motionEvent) > this.f25446k2 : z2(motionEvent) < this.f25486n0)) {
                            q22.f24843w0 = true;
                            q22.f24845y0 = false;
                            q22.A0 = false;
                            if (this.f25374f2) {
                                i10 = this.f25444k0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f25388g2) {
                                    i9 = this.f25444k0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i9 = this.f25444k0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i10 = i9 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i10 + this.f25488n2;
                            int i15 = this.f25446k2;
                            q22.f24075c = dp4;
                            q22.d = i15;
                        } else if (z11) {
                            q22.f24843w0 = false;
                            q22.f24845y0 = false;
                            q22.A0 = true;
                            int i16 = this.f25430j0;
                            int i17 = this.f25486n0;
                            q22.f24075c = i16;
                            q22.d = i17;
                        } else {
                            q22.f24843w0 = false;
                            q22.f24845y0 = false;
                            q22.A0 = false;
                            int i18 = this.f25430j0;
                            int i19 = this.f25486n0;
                            q22.f24075c = i18;
                            q22.d = i19;
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

    public final void Y2(int i9, int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i11 = i10 - i9;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i12);
            if (i9 >= textLayoutBlock.charactersOffset && i9 < textLayoutBlock.charactersEnd) {
                this.f25571t0 = i12;
                G3();
                try {
                    f80 B3 = B3();
                    B3.f30219c = true;
                    B3.d(textLayoutBlock.textLayout, i9, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i9, i10, B3);
                    B3.a();
                    float f10 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i10 >= textLayoutBlock.charactersOffset + i11) {
                        for (int i13 = i12 + 1; i13 < arrayList.size(); i13++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i13);
                            int i14 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            f80 B32 = B3();
                            B32.f30219c = true;
                            float f11 = f10 + textLayoutBlock2.padTop;
                            B32.d(textLayoutBlock2.textLayout, 0, f11);
                            f10 = f11 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i10 - textLayoutBlock2.charactersOffset, B32);
                            B32.a();
                            if (i10 < (textLayoutBlock.charactersOffset + i14) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.f25586u0) {
                        this.f25336c8 = true;
                        this.f25351d8 = 2500;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                invalidate();
            } else {
                i12++;
            }
        }
        this.V3 = -1;
        this.W3 = -1;
    }

    public final void Y3(int i9) {
        this.f25485n = i9;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f25593u7.isSponsored() && this.f25593u7.sponsoredCanReport) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.B2 - AndroidUtilities.dp(6.0f) && f10 <= this.B2 + this.f25660z2 + AndroidUtilities.dp(6.0f)) {
                    float f11 = z22;
                    if (f11 >= this.C2 - AndroidUtilities.dp(2.0f) && f11 <= this.C2 + this.A2 + AndroidUtilities.dp(2.0f)) {
                        pc pcVar = this.E2;
                        if (pcVar != null) {
                            pcVar.c(true);
                        }
                        this.D2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.D2) {
                k1 k1Var = this.Fc;
                if (k1Var != null) {
                    k1Var.I1();
                }
                pc pcVar2 = this.E2;
                if (pcVar2 != null) {
                    pcVar2.c(false);
                }
                playSoundEffect(0);
                this.D2 = false;
            }
        }
        return false;
    }

    public final void Z1(Canvas canvas, RectF rectF) {
        float f10;
        Path path = this.A5;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        ih.z2 z2Var = this.O0;
        float alpha = z2Var.getAlpha();
        if (this.f25593u7.isRoundOnce()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        z2Var.setAlpha(f10 * alpha);
        z2Var.draw(canvas);
        z2Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f25435j5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i9, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        this.F0 = i9;
        this.G0 = i10;
        this.Pc = i10;
        if ((this.f25593u7 != null && R2() && this.f25593u7.shouldDrawWithoutBackground()) || ((d5Var = this.f25518p8) != null && d5Var.f22843a != null)) {
            invalidate();
        }
    }

    @Override
    public final boolean a() {
        MessageObject.GroupedMessages groupedMessages = this.G;
        if ((groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a1(MotionEvent motionEvent) {
        i1 i1Var;
        z zVar;
        if (this.H5 && ((!this.nd || getVideoTranscriptionProgress() > 0.0f || this.C3) && (i1Var = this.I5) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (i1Var.v.contains((int) x10, (int) z22)) {
                    if (action == 0) {
                        i1Var.A = true;
                    }
                    if (i1Var.A && (zVar = i1Var.f29298q) != null) {
                        zVar.setHotspot(x10, z22);
                        i1Var.f29298q.setState(i21.N);
                        i1Var.f29299r.invalidate();
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
        org.telegram.ui.Components.x5 animation;
        int i9;
        boolean z10;
        MessageObject messageObject = this.f25593u7;
        ih.z2 z2Var = this.O0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = z2Var.getAnimation()) != null && (i9 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i9 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = z2Var.draw(canvas);
                } else {
                    z10 = true;
                }
                z2Var.setForceNotMedia(true);
                float alpha = z2Var.getAlpha();
                z2Var.setAlpha(clamp01 * alpha);
                z2Var.draw(canvas);
                z2Var.setAlpha(alpha);
                z2Var.setForceNotMedia(false);
                return z10;
            }
        }
        return z2Var.draw(canvas);
    }

    public final void a3() {
        k1 k1Var = this.Fc;
        if (k1Var != null && k1Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void a4(float f10, float f11, boolean z10) {
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            E0();
            if (z10) {
                invalidate();
            }
        }
        ih.z2 z2Var = this.O0;
        float imageY = f10 - z2Var.getImageY();
        float measuredHeight = f11 - (getMeasuredHeight() - z2Var.getImageY2());
        float imageHeight = z2Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / z2Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25555s = z11;
        z2Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void b(float f10) {
        MessageObject messageObject = this.f25593u7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(this.f25593u7, f10);
        q4();
    }

    public final boolean b1() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.type == 17) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) media).results.has_unread_votes;
            }
        }
        return false;
    }

    public final void b2(Canvas canvas, int i9) {
        int i10;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        MessageObject messageObject;
        k1 k1Var = this.Fc;
        int i11 = 0;
        if (k1Var != null) {
            if (!k1Var.Y0(1, this)) {
                this.f25663z5 = null;
                ArrayList arrayList = this.f25649y5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < this.f25649y5.size(); i12++) {
                        m1 m1Var = (m1) this.f25649y5.get(i12);
                        if (!m1Var.f24686a.c()) {
                            m1Var.f24686a.a();
                        }
                    }
                }
            } else {
                CharacterStyle E1 = this.Fc.E1(this);
                if (E1 != this.f25663z5) {
                    this.f25663z5 = E1;
                    p80 p80Var = this.f25633x5;
                    if (p80Var != null) {
                        p80Var.a();
                        this.f25633x5 = null;
                    }
                    p80 p80Var2 = new p80();
                    this.f25633x5 = p80Var2;
                    p80Var2.C = true;
                    f80 f80Var = new f80(0);
                    p80 p80Var3 = this.f25633x5;
                    p80Var3.f31591x = f80Var;
                    p80Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.f24686a = this.f25633x5;
                    obj.f24687b = -3;
                    if (this.f25649y5 == null) {
                        this.f25649y5 = new ArrayList();
                    }
                    this.f25649y5.add(obj);
                    if (this.f25663z5 != null && !r2(obj, f80Var, this.G2, -2) && (((textLayoutBlocks = this.Y3) == null || !s2(obj, f80Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f25593u7) != null)) {
                        s2(obj, f80Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f25649y5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f25593u7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.f6.Mb;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.Ld;
            }
            int v02 = org.telegram.ui.ActionBar.f6.v0(i10, this.Ed);
            while (i11 < this.f25649y5.size()) {
                m1 m1Var2 = (m1) this.f25649y5.get(i11);
                if (m1Var2.f24687b == i9) {
                    p80 p80Var4 = m1Var2.f24686a;
                    p80Var4.f(org.telegram.ui.ActionBar.f6.l1(0.85f, v02), org.telegram.ui.ActionBar.f6.l1(2.0f, v02), org.telegram.ui.ActionBar.f6.l1(3.5f, v02), org.telegram.ui.ActionBar.f6.l1(6.0f, v02));
                    p80Var4.draw(canvas);
                    invalidate();
                    if (p80Var4.b()) {
                        this.f25649y5.remove(i11);
                        i11--;
                    }
                }
                i11++;
            }
        }
    }

    public final boolean b3() {
        if (this.f25561s5.d <= 0 && this.J.f10749s) {
            MessageObject messageObject = this.f25593u7;
            if (messageObject == null || !messageObject.preview) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b4(int i9, int i10, int i11, float f10, float f11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        RichMessageLayout richMessageLayout;
        s1 s1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Ud = i9;
        this.Wd = i10;
        this.Xd = i11;
        this.F0 = i12;
        this.G0 = i13;
        this.Zd = f11;
        this.Yd = f10;
        this.Pc = i13;
        this.Qc = i14;
        this.Rc = i15;
        this.Vd = i16;
        if ((!this.f25451k7.isEmpty() || (this.v != null && (messageObject = this.f25593u7) != null && messageObject.type == 27)) && this.Oc != f11) {
            invalidate();
        }
        this.Oc = f11;
        if (i11 != this.G0 || f10 != this.H0) {
            this.H0 = f10;
            this.G0 = i11;
        }
        if (this.f25593u7 != null && R2() && this.f25593u7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f25593u7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i19 = i9 - this.f25486n0;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                int size = this.f25593u7.textLayoutBlocks.size();
                s1Var = this.Vc;
                if (i20 >= size || this.f25593u7.textLayoutBlocks.get(i20).textYOffset(this.f25593u7.textLayoutBlocks, s1Var) > i19) {
                    break;
                }
                i21 = i20;
                i20++;
            }
            int i22 = -1;
            int i23 = -1;
            int i24 = 0;
            while (i21 < this.f25593u7.textLayoutBlocks.size()) {
                float textYOffset = this.f25593u7.textLayoutBlocks.get(i21).textYOffset(this.f25593u7.textLayoutBlocks, s1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(s1Var) + textLayoutBlock.padBottom;
                float f12 = i19;
                if (Z2(textYOffset, height, f12, i19 + i10)) {
                    if (i22 == -1) {
                        i22 = i21;
                    }
                    i24++;
                    i23 = i21;
                } else if (textYOffset > f12) {
                    break;
                }
                i21++;
            }
            if (this.f25644y0 == i23 && this.f25658z0 == i22 && this.A0 == i24) {
                if (this.f25469lc != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= this.f25469lc.f31544a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) this.f25469lc.f31544a.get(i25);
                        if (o5Var != null && o5Var.f31292n) {
                            float y10 = (0.0f - getY()) - o5Var.f31293r;
                            float y11 = (this.f25485n - getY()) - o5Var.f31293r;
                            Rect rect = o5Var.f31290e;
                            if (rect.bottom >= y10 && rect.top <= y11) {
                                invalidate();
                                break;
                            }
                        }
                        i25++;
                    }
                }
            } else {
                this.f25644y0 = i23;
                this.f25658z0 = i22;
                this.A0 = i24;
                invalidate();
            }
        }
        MessageObject messageObject3 = this.f25593u7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i26 = i9 - this.f25486n0;
            int i27 = -1;
            int i28 = -1;
            for (int i29 = 0; i29 < richMessageLayout.blocks.size(); i29++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i29);
                if (richBlock.currVisible || richBlock.prevVisible) {
                    float f13 = richBlock.currY;
                    float f14 = i26 + i10;
                    if (Z2(f13, richBlock.getHeight() + f13, i26, f14)) {
                        if (i27 == -1) {
                            i27 = i29;
                        }
                        i28 = i29;
                    } else if (f13 > f14) {
                        break;
                    }
                }
            }
            if (this.B0 != i27 || this.C0 != i28) {
                this.B0 = i27;
                this.C0 = i28;
                invalidate();
            }
        }
        ArrayList arrayList = this.U5;
        if (!arrayList.isEmpty()) {
            int i30 = -1;
            int i31 = -1;
            for (int i32 = 0; i32 < arrayList.size(); i32++) {
                r1 r1Var = (r1) arrayList.get(i32);
                int i33 = r1Var.f24932b + this.Hc;
                if (Z2(i33, i33 + r1Var.f24933c, this.Ud, i18 + this.Wd)) {
                    if (i31 == -1) {
                        i31 = i32;
                    }
                    i30 = i32;
                }
            }
            if (this.f25378f6 != i30 || this.f25363e6 != i31) {
                this.f25378f6 = i30;
                this.f25363e6 = i31;
                invalidate();
            }
        }
        if (this.f25596ua) {
            if (Math.abs(this.Fa - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Vd), this.Da - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        hg.s0 s0Var = this.J;
        int i34 = s0Var.d;
        boolean Z2 = Z2(i34, i34 + s0Var.f10745o, this.Ud, i17 + this.Wd);
        if (this.f25407h6 != Z2) {
            this.f25407h6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        this.jc = z10;
        if (z10) {
            this.f25455kc = z11;
        } else {
            this.f25455kc = false;
        }
    }

    public final boolean c1(float f10, int i9) {
        hg.s0 s0Var = this.J;
        if (!s0Var.K) {
            return false;
        }
        float y10 = getY() + s0Var.d;
        if (y10 <= f10 || (y10 + s0Var.f10745o) - AndroidUtilities.dp(16.0f) >= i9) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.c2(android.graphics.Canvas):void");
    }

    public final void c3() {
        if (this.G != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void c4() {
        int i9;
        int i10;
        int i11;
        if (this.f25593u7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.f6.f23193o2;
            int i12 = org.telegram.ui.ActionBar.f6.fc;
            textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i12, this.Ed));
            org.telegram.ui.ActionBar.f6.f23347x2.setColor(org.telegram.ui.ActionBar.f6.v0(i12, this.Ed));
            org.telegram.ui.ActionBar.f6.f23208p2.setColor(org.telegram.ui.ActionBar.f6.v0(i12, this.Ed));
            org.telegram.ui.ActionBar.f6.f23225q2.setColor(org.telegram.ui.ActionBar.f6.v0(i12, this.Ed));
            org.telegram.ui.ActionBar.f6.f23244r2.setColor(org.telegram.ui.ActionBar.f6.v0(i12, this.Ed));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.f6.f23347x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.f6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.f6.a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.f6.f23193o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.f6.f23208p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.f6.f23225q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.f6.f23244r2;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23079hc, this.Ed);
            textPaint8.linkColor = v02;
            textPaint7.linkColor = v02;
            textPaint6.linkColor = v02;
            textPaint5.linkColor = v02;
            textPaint4.linkColor = v02;
            textPaint3.linkColor = v02;
            textPaint2.linkColor = v02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.f6.f23193o2;
            int i13 = org.telegram.ui.ActionBar.f6.ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.f6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.f6.f23347x2.setColor(org.telegram.ui.ActionBar.f6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.f6.f23208p2.setColor(org.telegram.ui.ActionBar.f6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.f6.f23225q2.setColor(org.telegram.ui.ActionBar.f6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.f6.f23244r2.setColor(org.telegram.ui.ActionBar.f6.v0(i13, this.Ed));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.f6.f23347x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.f6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.f6.a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.f6.f23193o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.f6.f23208p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.f6.f23225q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.f6.f23244r2;
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, this.Ed);
            textPaint16.linkColor = v03;
            textPaint15.linkColor = v03;
            textPaint14.linkColor = v03;
            textPaint13.linkColor = v03;
            textPaint12.linkColor = v03;
            textPaint11.linkColor = v03;
            textPaint10.linkColor = v03;
        }
        if (this.H1 != null) {
            int i14 = this.G1;
            e1 e1Var = this.C5;
            if (i14 != 3 && i14 != 7) {
                if (i14 == 5) {
                    if (this.f25593u7.isOutOwner()) {
                        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23338wb, this.Ed);
                        int v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23356xb, this.Ed);
                        int i15 = org.telegram.ui.ActionBar.f6.f23391zb;
                        e1Var.h(v04, v05, org.telegram.ui.ActionBar.f6.v0(i15, this.Ed), org.telegram.ui.ActionBar.f6.v0(i15, this.Ed), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23374yb, this.Ed));
                    } else if (this.f25345d2 && this.W9 != null) {
                        int c10 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23310ud, this.Ed), this.W9.h());
                        int c11 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vd, this.Ed), this.W9.h());
                        int i16 = org.telegram.ui.ActionBar.f6.f23358xd;
                        e1Var.h(c10, c11, org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(i16, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(i16, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23340wd, this.Ed), this.W9.h()));
                    } else {
                        int v06 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23310ud, this.Ed);
                        int v07 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vd, this.Ed);
                        int i17 = org.telegram.ui.ActionBar.f6.f23358xd;
                        e1Var.h(v06, v07, org.telegram.ui.ActionBar.f6.v0(i17, this.Ed), org.telegram.ui.ActionBar.f6.v0(i17, this.Ed), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23340wd, this.Ed));
                    }
                }
            } else {
                boolean isOutOwner = this.f25593u7.isOutOwner();
                rn0 rn0Var = this.D5;
                if (isOutOwner) {
                    int v08 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ab, this.Ed);
                    int v09 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Cb, this.Ed);
                    int v010 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Bb, this.Ed);
                    rn0Var.f32222p = v08;
                    rn0Var.f32223q = v09;
                    rn0Var.f32224r = v010;
                    int v011 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23338wb, this.Ed);
                    int v012 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23356xb, this.Ed);
                    int i18 = org.telegram.ui.ActionBar.f6.f23391zb;
                    e1Var.h(v011, v012, org.telegram.ui.ActionBar.f6.v0(i18, this.Ed), org.telegram.ui.ActionBar.f6.v0(i18, this.Ed), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23374yb, this.Ed));
                } else if (this.f25345d2 && this.W9 != null) {
                    int c12 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23375yd, this.Ed), this.W9.h());
                    int c13 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ad, this.Ed), this.W9.h());
                    int c14 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23393zd, this.Ed), this.W9.h());
                    rn0Var.f32222p = c12;
                    rn0Var.f32223q = c13;
                    rn0Var.f32224r = c14;
                    int c15 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23310ud, this.Ed), this.W9.h());
                    int c16 = org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vd, this.Ed), this.W9.h());
                    int i19 = org.telegram.ui.ActionBar.f6.f23358xd;
                    e1Var.h(c15, c16, org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(i19, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(i19, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.f6.c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23340wd, this.Ed), this.W9.h()));
                } else {
                    int v013 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23375yd, this.Ed);
                    int v014 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ad, this.Ed);
                    int v015 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23393zd, this.Ed);
                    rn0Var.f32222p = v013;
                    rn0Var.f32223q = v014;
                    rn0Var.f32224r = v015;
                    int v016 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23310ud, this.Ed);
                    int v017 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vd, this.Ed);
                    int i20 = org.telegram.ui.ActionBar.f6.f23358xd;
                    e1Var.h(v016, v017, org.telegram.ui.ActionBar.f6.v0(i20, this.Ed), org.telegram.ui.ActionBar.f6.v0(i20, this.Ed), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23340wd, this.Ed));
                }
            }
        }
        MessageObject messageObject = this.f25593u7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.f6.T2;
            int v018 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, this.Ed);
            if (f3()) {
                if (this.f25593u7.isOutOwner()) {
                    i11 = org.telegram.ui.ActionBar.f6.f23184nb;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.f23201od;
                }
            } else if (this.f25593u7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.f6.f23272sb;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), v018, org.telegram.ui.ActionBar.f6.v0(i11, this.Ed)));
        } else if (this.f25394g8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, this.Ed));
            } else {
                org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23133kd, this.Ed));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.f6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.f6.f23184nb;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23272sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.Ed));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.f6.T2;
            if (f3()) {
                i9 = org.telegram.ui.ActionBar.f6.f23201od;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.f6.v0(i9, this.Ed));
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
        return FileLoader.getInstance(this.E7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f10, Integer num) {
        boolean z10;
        boolean z11 = this.f25483md;
        float f11 = 1.0f;
        hg.s0 s0Var = this.J;
        if (z11) {
            s0Var.f10733a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f25407h6 && V2()) {
            if (s0Var.f10733a > 0.0f) {
                o0();
            }
            if (getAlpha() * f10 != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f10 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = s0Var.f10733a;
            s1 s1Var = this.Vc;
            if (f12 <= 0.0f && s1Var.f25235w0 && this.H == null && !this.f25483md) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f25177i0);
                s0Var.D = 0.0f;
                s0Var.E = false;
                if (s1Var.f25167g) {
                    f11 = s1Var.K1;
                }
                s0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                s0Var.D = 0.0f;
                s0Var.E = false;
                if (s1Var.f25167g) {
                    f11 = s1Var.K1;
                }
                s0Var.d(canvas, f11, num);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final boolean d3() {
        return this.I0;
    }

    public final boolean d4() {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if ((groupedMessagePosition == null || ((groupedMessages = this.G) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Vc.f25235w0) {
                if (!this.f25627x || !this.f25593u7.isVoice()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessageObject messageObject;
        if (i9 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i9 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            TLRPC.User user = this.Ub;
            if (user != null && user.f22527id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f25593u7);
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i9 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f25593u7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                X3(messageObject, this.G, this.B, this.A, this.C, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public final void e(float f10) {
        MessageObject messageObject = this.f25593u7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f10);
        q4();
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f25593u7.isVideo();
        ih.z2 z2Var = this.O0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                z2Var.setAllowStartAnimation(false);
                z2Var.stopAnimation();
                return;
            }
            z2Var.setAllowStartAnimation(true);
            z2Var.startAnimation();
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
        z2Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            z2Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            z2Var.startAnimation();
        } else {
            z2Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f25483md;
        float f10 = 1.0f;
        hg.s0 s0Var = this.J;
        if (z10) {
            s0Var.f10733a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f25407h6 || !V2()) {
            return false;
        }
        if (s0Var.f10733a > 0.0f) {
            o0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        float f11 = s0Var.f10733a;
        s1 s1Var = this.Vc;
        if (f11 <= 0.0f && s1Var.f25235w0 && this.H == null && !this.f25483md) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f25177i0);
            if (s1Var.f25167g) {
                f10 = s1Var.K1;
            }
            s0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (s1Var.f25167g) {
                f10 = s1Var.K1;
            }
            s0Var.e(canvas, f10);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i9 = MessageObject.getMedia(this.f25593u7.messageOwner).period;
        int currentTime = ConnectionsManager.getInstance(this.E7).getCurrentTime();
        if (i9 == Integer.MAX_VALUE) {
            return false;
        }
        if (i9 % 60 == 0) {
            if (Math.abs(currentTime - messageObject.messageOwner.date) <= i9) {
                return false;
            }
            return true;
        } else if (Math.abs(currentTime - messageObject.messageOwner.date) <= i9 - 5) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean e4() {
        if ((this.G == null || (this.H.flags & 4) != 0) && !this.f25345d2) {
            MessageObject messageObject = this.f25593u7;
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
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        k1 k1Var = this.Fc;
        if (k1Var != null) {
            k1Var.l2(this, reactionCount, z10, f10, f11);
        }
    }

    public final void f2(Canvas canvas, RichMessageLayout richMessageLayout, float f10, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (richMessageLayout != null && f10 > 0.0f && richMessageLayout.hasOverlay()) {
            if (f10 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f25430j0, this.f25486n0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f25409h8) || ((!this.f25409h8 && this.f25307a8) || this.f25322b8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f25593u7;
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
        ih.z2 z2Var = this.O0;
        z2Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.i9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.B9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f25495n9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f25570se = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i10);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f25318b4)) {
                        n4();
                        this.f25570se = (int) (i9 + this.f25475m4);
                        this.f25585te = this.Y3;
                    }
                    i9 = this.f25500o0 + this.f25524q0 + i9;
                }
            }
            return i9;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        z2Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f25500o0 + this.f25524q0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f25373f1 && !this.f25336c8 && !this.f25322b8) {
            return false;
        }
        return true;
    }

    public final void g4(int i9, boolean z10, boolean z11) {
        float f10;
        float f11 = 0.0f;
        if (i9 == -1 || i9 == 0) {
            if (this.T6 != z10) {
                this.T6 = z10;
                if (!z11) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.U6 = f10;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i9 != -1 && i9 != 1) || this.f25408h7 == z10) {
            return;
        }
        this.f25408h7 = z10;
        if (!z11) {
            if (z10) {
                f11 = 1.0f;
            }
            this.f25423i7 = f11;
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
        return this.f25429ie;
    }

    @Override
    public float getAlpha() {
        if (this.Tc) {
            return this.Uc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.t5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.getAnimatedEmojiSpans():org.telegram.ui.Components.t5[]");
    }

    public float getAnimationOffsetX() {
        return this.f25611ve;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f25452k8) {
            return this.i9;
        }
        return null;
    }

    public y90 getBackgroundDrawable() {
        return this.Gc;
    }

    public int getBackgroundDrawableBottom() {
        int i9;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        int i10 = 0;
        if (groupedMessagePosition != null) {
            int i11 = 4;
            if ((groupedMessagePosition.flags & 4) == 0) {
                i9 = AndroidUtilities.dp(3.0f);
            } else {
                i9 = 0;
            }
            if ((this.H.flags & 8) == 0) {
                MessageObject messageObject = this.f25593u7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i11 = 3;
                }
                i9 += AndroidUtilities.dp(i11);
            }
        } else {
            i9 = 0;
        }
        boolean z10 = this.F;
        if (!z10 || !this.E) {
            if (z10) {
                i10 = AndroidUtilities.dp(1.0f);
            } else {
                i10 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.I8) - i10) + i9;
        if (!this.f25394g8) {
            if (this.E) {
                backgroundDrawableTop += AndroidUtilities.dp(1.0f);
            }
            if (this.F) {
                return AndroidUtilities.dp(1.0f) + backgroundDrawableTop;
            }
        }
        return backgroundDrawableTop;
    }

    public int getBackgroundDrawableLeft() {
        int dp;
        int i9;
        MessageObject messageObject = getMessageObject();
        int i10 = 0;
        float f10 = 9.0f;
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.f25483md) {
                return (this.H8 - this.F8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i11 = this.H8 - this.F8;
            if (this.f25394g8) {
                i10 = AndroidUtilities.dp(9.0f);
            }
            return i11 - i10;
        }
        float f11 = 71.0f;
        if (this.f25483md) {
            if (!q3()) {
                if ((this.J7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25452k8) {
                    i10 = 48;
                }
                f11 = i10 + 3;
            }
            dp = AndroidUtilities.dp(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.J7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25452k8) {
                    i10 = 48;
                }
                f11 = i10;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (!this.f25394g8) {
                f10 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f10);
        }
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i9 = this.H.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i9 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f25483md) {
            if (this.F) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f25394g8 && this.F) {
            return AndroidUtilities.dp(6.0f) + dp;
        }
        return dp;
    }

    public int getBackgroundDrawableRight() {
        int dp;
        int i9;
        int backgroundDrawableLeft;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i10 = this.F8;
        if (this.f25483md) {
            i9 = i10 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.F && (messageObject2 = this.f25593u7) != null && messageObject2.isOutOwner()) {
                i9 = (int) (i9 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.F && ((messageObject = this.f25593u7) == null || !messageObject.isOutOwner())) {
                i9 = (int) (i9 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f25394g8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i9 = i10 - dp;
            if (!this.f25394g8 && this.F) {
                i9 -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i9;
    }

    public int getBackgroundDrawableTop() {
        int i9;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        int i10 = 0;
        if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) == 0) {
            i9 = 0 - AndroidUtilities.dp(3.0f);
        } else {
            i9 = 0;
        }
        if (!this.E) {
            i10 = AndroidUtilities.dp(1.0f);
        }
        int i11 = i9 + i10;
        if (!this.f25394g8 && this.E) {
            return i11 - AndroidUtilities.dp(1.0f);
        }
        return i11;
    }

    public int getBackgroundHeight() {
        return this.Pc;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.P0;
    }

    public int getBottomActionPadding() {
        s1 s1Var = this.Vc;
        if (s1Var.B1) {
            return AndroidUtilities.lerp(s1Var.A1, this.W, s1Var.K1);
        }
        return this.W;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i9;
        int i10;
        float f10;
        int dp;
        int i11;
        float f11;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3()) {
            if (this.H != null) {
                f11 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f25593u7;
                if (messageObject2 != null && messageObject2.isRepostPreview) {
                    i11 = 42;
                } else {
                    i11 = 63;
                }
                f11 = i11;
            }
            i9 = AndroidUtilities.dp(f11);
        } else {
            i9 = 0;
        }
        if (z10 && (M0(this.f25593u7) || this.H5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i9) - i10;
        ArrayList arrayList = this.f25451k7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f25593u7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i12 = this.f25548r8;
                if (!this.f25394g8 && !this.F) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                dp = i12 + AndroidUtilities.dp(f10);
            }
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                i13 = Math.max(i13, ((int) (((e0) arrayList.get(i14)).f24251c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i13);
        }
        if (this.O != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.O.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25301a0 != null) {
            backgroundDrawableLeft = Math.min(this.E8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i9;
        float f10;
        int dp;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f25593u7) || this.H5)) {
            i9 = AndroidUtilities.dp(48.0f);
        } else {
            i9 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i9;
        ArrayList arrayList = this.f25451k7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f25593u7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i10 = this.f25548r8;
                if (!this.f25394g8 && !this.F) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                dp = i10 + AndroidUtilities.dp(f10);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                float f11 = widthForButtons;
                i11 = Math.max(i11, ((int) (e0Var.f24251c * f11)) + dp + ((int) (e0Var.f24252e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i11);
        }
        if (this.O != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.O.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25301a0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.Y3;
    }

    public float getCaptionX() {
        s1 s1Var = this.Vc;
        if (s1Var.f25235w0) {
            if (s1Var.C0) {
                this.f25461l4 += s1Var.f25168g0;
            } else if (s1Var.f25220s0) {
                float f10 = this.f25461l4;
                float f11 = s1Var.K1;
                this.f25461l4 = e2.c.z(1.0f, f11, s1Var.f25212q0, f10 * f11);
            } else if (!this.f25593u7.isVoice() || !TextUtils.isEmpty(this.f25593u7.caption)) {
                this.f25461l4 += s1Var.f25168g0;
            }
        }
        return this.f25461l4;
    }

    public float getCaptionY() {
        float f10 = this.f25475m4;
        s1 s1Var = this.Vc;
        if (s1Var.f25235w0) {
            if (s1Var.C0) {
                return f10 - getTranslationY();
            }
            if (s1Var.f25220s0) {
                float f11 = s1Var.K1;
                return e2.c.z(1.0f, f11, s1Var.f25216r0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f25472m1;
    }

    public int getChecksX() {
        float f10;
        int i9 = this.H8;
        if (SharedConfig.bubbleRadius >= 10) {
            f10 = 27.3f;
        } else {
            f10 = 25.3f;
        }
        return i9 - AndroidUtilities.dp(f10);
    }

    public int getChecksY() {
        float f10;
        int intrinsicHeight;
        if (this.f25593u7.shouldDrawWithoutBackground()) {
            f10 = this.f25441jb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f25441jb;
            intrinsicHeight = org.telegram.ui.ActionBar.f6.F3.getIntrinsicHeight();
        }
        return (int) (f10 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.d5 d5Var = this.f25518p8;
        if (d5Var == null) {
            return 0;
        }
        int i9 = d5Var.getBounds().left;
        if (!this.f25593u7.isOutOwner() && this.Vc.f25247z0 != 1.0f) {
            boolean z10 = this.f25483md;
            if ((z10 || !this.f25394g8) && !this.F) {
                if (z10) {
                    return (int) (i9 - (getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)));
                }
                return i9 - AndroidUtilities.dp(6.0f);
            }
            return i9;
        }
        return i9;
    }

    public int getCurrentBackgroundRight() {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var = this.f25518p8;
        if (d5Var == null) {
            return getWidth();
        }
        int i9 = d5Var.getBounds().right;
        if (this.f25593u7.isOutOwner() && this.Vc.f25247z0 != 1.0f && (((z10 = this.f25483md) || !this.f25394g8) && !this.F)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)) + i9);
            }
            return AndroidUtilities.dp(6.0f) + i9;
        }
        return i9;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.Vb;
    }

    public MessageObject.GroupedMessages getCurrentMessagesGroup() {
        return this.G;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return this.H;
    }

    public TLRPC.User getCurrentUser() {
        return this.Ub;
    }

    public k1 getDelegate() {
        return this.Fc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Vc.f25177i0;
    }

    public float getDeltaLeft() {
        return this.Vc.f25168g0;
    }

    public float getDeltaRight() {
        return this.Vc.f25172h0;
    }

    public float getDeltaTop() {
        return this.Vc.f25182j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f10;
        float dp2;
        int i9;
        int dp3;
        int i10;
        boolean z10 = this.f25374f2;
        float f11 = 0.0f;
        s1 s1Var = this.Vc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f25444k0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f25388g2) {
                AndroidUtilities.dp(14.0f);
                i9 = this.f25444k0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f25593u7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i9 = this.f25444k0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.f25593u7.isOutOwner()) {
                    f10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25548r8;
                    if (this.f25593u7.type == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.F9, this.H9) + f10) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f25394g8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f25548r8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i11 = this.f25548r8;
                        if (!this.F) {
                            f12 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f12) + i11;
                        extraTextX = getExtraTextX();
                    }
                    f10 = extraTextX + dp;
                }
                dp2 = (f10 + s1Var.f25168g0) - AndroidUtilities.dp(1.33f);
                float f13 = this.f25458l0;
                if (s1Var.f25218r2) {
                    AndroidUtilities.lerp(s1Var.f25214q2, f13, s1Var.K1);
                }
            }
            dp2 = dp3 + i9;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (s1Var != null) {
            f11 = s1Var.f25172h0;
        }
        float f14 = backgroundDrawableRight + f11;
        int i12 = 0;
        if (this.f25593u7.isOutOwner() && !this.f25394g8 && !this.F) {
            i10 = 6;
        } else {
            i10 = 0;
        }
        int dp4 = (int) (((f14 - AndroidUtilities.dp(10 + i10)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f25513p2) > 1) {
            i12 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f25502o2) - this.f25513p2;
        }
        return dp5 + i12;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.f25446k2;
        s1 s1Var = this.Vc;
        if (!s1Var.f25218r2) {
            f10 = (-s1Var.f25182j0) + s1Var.f25177i0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.G2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f25593u7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f25347d4;
    }

    public float getExplanationX() {
        return this.W6;
    }

    public float getExplanationY() {
        return this.X6;
    }

    public int getExtraInsetHeight() {
        float f10;
        int i9;
        int i10 = this.f25515p4;
        boolean z10 = this.J1;
        hg.s0 s0Var = this.J;
        if (z10) {
            if (s0Var.f10749s) {
                i9 = 18;
            } else {
                i9 = 0;
            }
            i10 += AndroidUtilities.dp(i9 + 2) + this.f25316b2;
        }
        if (this.f25381f9) {
            if (f4()) {
                f10 = 41.3f;
            } else {
                f10 = 43.0f;
            }
            i10 += AndroidUtilities.dp(f10);
        }
        if (!s0Var.f10749s && this.f25593u7.shouldDrawReactionsInLayout()) {
            return i10 + s0Var.f10746p;
        }
        return i10;
    }

    public int getExtraTextX() {
        int i9 = SharedConfig.bubbleRadius;
        if (i9 >= 15) {
            return AndroidUtilities.dp(2.0f);
        }
        if (i9 >= 11) {
            return AndroidUtilities.dp(1.0f);
        }
        return 0;
    }

    public StaticLayout getFactCheckLayout() {
        return this.O1;
    }

    public String getFilename() {
        int i9;
        int i10;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            int i11 = messageObject.type;
            if (i11 == 1) {
                TLRPC.PhotoSize photoSize = this.f25304a5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i11 != 8 && (i10 = this.G1) != 7 && i10 != 4 && i10 != 8 && i11 != 9 && i10 != 3 && i10 != 5) {
                if (i10 != 0) {
                    return FileLoader.getAttachFileName(this.H1);
                }
                TLRPC.PhotoSize photoSize2 = this.f25304a5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f25593u7.messageOwner.attachPath;
                }
                if (this.f25593u7.isSendError() && (i9 = this.G1) != 3 && i9 != 5) {
                    return null;
                }
                return this.f25593u7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f10;
        TLRPC.User user = this.Ub;
        if (user != null && user.f22527id == 0) {
            f10 = this.i9.getCenterX();
        } else {
            f10 = this.f25368eb + this.D1;
        }
        return (int) f10;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f25329c1;
    }

    public float getLastTouchY() {
        return this.f25344d1;
    }

    public int getLayoutHeight() {
        return this.I8;
    }

    public int getMaxNameWidth() {
        int min;
        int dp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i9;
        int i10;
        float f10;
        int dp2;
        int parentWidth;
        int i11 = this.G1;
        if (i11 != 6 && i11 != 8 && (i9 = (messageObject2 = this.f25593u7).type) != 5) {
            MessageObject.GroupedMessages groupedMessages = this.G;
            int i12 = 0;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = getParentWidth();
                }
                i10 = 0;
                for (int i13 = 0; i13 < this.G.posArray.size(); i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.G.posArray.get(i13);
                    if (groupedMessagePosition.minY != 0) {
                        break;
                    }
                    i10 = (int) (Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * parentWidth) + i10);
                }
                if (this.B8) {
                    i12 = 71;
                } else if (z3()) {
                    i12 = 48;
                }
                dp2 = AndroidUtilities.dp(i12 + 31);
            } else if (i9 == 19) {
                int i14 = messageObject2.textWidth;
                int dp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f);
                if (this.f25452k8) {
                    i12 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i14, (int) ((dp3 - i12) * 0.5f));
            } else {
                i10 = this.F8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f25593u7)) {
                    i10 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f25394g8) {
                    f10 = 22.0f;
                } else {
                    f10 = 31.0f;
                }
                dp2 = AndroidUtilities.dp(f10);
            }
            return i10 - dp2;
        }
        float f11 = 0.0f;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            if (this.B8) {
                f11 = 71.0f;
            } else if (z3()) {
                f11 = 42.0f;
            }
            dp = AndroidUtilities.dp(f11);
        } else {
            min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
            if (this.B8) {
                f11 = 71.0f;
            } else if (z3()) {
                f11 = 42.0f;
            }
            dp = AndroidUtilities.dp(f11);
        }
        int i15 = min - dp;
        MessageObject messageObject3 = this.f25593u7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f25593u7)) {
            i15 -= AndroidUtilities.dp(25.0f);
        }
        if (this.nd && ((messageObject = this.f25593u7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i15 - (this.F8 - (AndroidUtilities.roundPlayingMessageSize(this.B8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.B8 && (this.f25593u7.type == 5 || this.G1 == 6)) {
            return this.F8 - AndroidUtilities.dp(57.0f);
        }
        return (i15 - this.F8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        s1 s1Var = this.Vc;
        if (s1Var.Z1) {
            return AndroidUtilities.lerp(s1Var.Y1, this.f25432j2, s1Var.K1);
        }
        return this.f25432j2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f25607v7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25593u7;
    }

    public int getNameStatusX() {
        int i9;
        float f10 = this.Sa + this.Ra;
        int i10 = this.f25608v8;
        if (i10 > 0) {
            i9 = i10 - AndroidUtilities.dp(32.0f);
        } else {
            i9 = this.Ha;
        }
        return (int) (f10 + i9 + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f10 = this.Ta;
        StaticLayout staticLayout = this.Ga;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f10 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.C1;
    }

    @Override
    public int getObserverTag() {
        return this.D7;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.R + this.f25343d0;
    }

    public int getParentWidth() {
        int i9;
        MessageObject messageObject = this.f25593u7;
        if (messageObject == null) {
            messageObject = this.f25607v7;
        }
        if (messageObject != null && messageObject.preview && (i9 = this.F0) > 0) {
            return i9;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        k4 k4Var = this.B7;
        if (k4Var != null) {
            return k4Var.f24593e + k4Var.h;
        }
        return this.O0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.O0;
    }

    public ArrayList<r1> getPollButtons() {
        return this.U5;
    }

    public float getPollButtonsLeft() {
        int dp;
        if (getMessageObject() != null && getMessageObject().isOutOwner()) {
            dp = (AndroidUtilities.dp(3.0f) + this.H8) - this.F8;
        } else if (this.C8) {
            dp = AndroidUtilities.dp(82.0f);
        } else if (z3()) {
            dp = AndroidUtilities.dp(59.0f);
        } else {
            dp = AndroidUtilities.dp(11.0f);
        }
        return dp;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.F8) - AndroidUtilities.dp(15.0f);
    }

    public MessageObject getPrimaryMessageObject() {
        MessageObject messageObject;
        MessageObject messageObject2 = this.f25593u7;
        if (messageObject2 != null && this.G != null && messageObject2.hasValidGroupId()) {
            messageObject = this.G.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25593u7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.K0;
    }

    public hg.s0 getReactionsLayout() {
        return this.J;
    }

    public org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return this.Ed;
    }

    public rn0 getSeekBarWaveform() {
        return this.D5;
    }

    public float getSideButtonStartX() {
        return this.Ca;
    }

    public float getSideButtonStartY() {
        return this.Da;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.f25600ue;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null) {
            ArrayList<MessageObject> arrayList = groupedMessages.messages;
            int size = arrayList.size();
            int i9 = 0;
            long j11 = 0;
            while (i9 < size) {
                MessageObject messageObject = arrayList.get(i9);
                i9++;
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
        MessageObject messageObject3 = this.f25593u7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        s1 s1Var = this.Vc;
        if (s1Var.f25244y1) {
            return AndroidUtilities.lerp(s1Var.f25240x1, this.R, s1Var.K1);
        }
        return this.R;
    }

    public TLRPC.Document getStreamingMedia() {
        int i9 = this.G1;
        if (i9 != 4 && i9 != 7 && i9 != 2) {
            return null;
        }
        return this.H1;
    }

    public int getTextX() {
        return this.f25430j0;
    }

    public int getTextY() {
        return this.f25486n0;
    }

    public float getTimeAlpha() {
        return this.f25421i5;
    }

    public float getTimeX() {
        int i9;
        s1 s1Var = this.Vc;
        if (s1Var.f25173h1) {
            i9 = AndroidUtilities.lerp(s1Var.f25169g1, this.f25497nb, s1Var.K1);
        } else {
            i9 = this.f25497nb;
        }
        return i9;
    }

    public float getTimeY() {
        int i9;
        int i10 = 0;
        if (f4()) {
            if (this.f25381f9) {
                i10 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f25593u7.isSponsored()) {
            i9 = -AndroidUtilities.dp(48.0f);
            if (this.G8) {
                i9 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i9);
        } else if (this.f25381f9) {
            i10 = AndroidUtilities.dp(43.0f);
        }
        i9 = -i10;
        return N2(i9);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f25432j2 + this.Hc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        s1 s1Var = this.Vc;
        if (s1Var.f25229u1) {
            return AndroidUtilities.lerp(s1Var.f25225t1, this.f25314b0, s1Var.K1);
        }
        return this.f25314b0;
    }

    public s1 getTransitionParams() {
        return this.Vc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        s1 s1Var = this.Vc;
        if (s1Var == null || (messageObject = this.f25593u7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (s1Var.l1) {
            if (this.f25479m8) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.f25479m8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Oc;
    }

    public int getWidthForButtons() {
        s1 s1Var = this.Vc;
        if (s1Var.N1) {
            return AndroidUtilities.lerp(s1Var.O1, this.f25506o7, s1Var.K1);
        }
        return this.f25506o7;
    }

    @Override
    public final boolean h() {
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) != 0) {
                return this.A;
            }
            return true;
        }
        return this.A;
    }

    public final void h1(t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        t1Var.J7 = this.J7;
        t1Var.W7 = this.W7;
        t1Var.L7 = this.L7;
        t1Var.M7 = this.M7;
        t1Var.N7 = this.N7;
        t1Var.O7 = this.O7;
        t1Var.P7 = this.P7;
        t1Var.Q7 = this.Q7;
        t1Var.R7 = this.R7;
        t1Var.S7 = this.S7;
        t1Var.T7 = this.T7;
        t1Var.U7 = this.U7;
        t1Var.X7 = this.X7;
        t1Var.Y7 = this.Y7;
        t1Var.Z7 = this.Z7;
        t1Var.A8 = this.A8;
        t1Var.B8 = this.B8;
        t1Var.C8 = this.C8;
        t1Var.D8 = this.D8;
        t1Var.E8 = this.E8;
    }

    public final void h2(Canvas canvas, Integer num, float f10, boolean z10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition != null) {
            int i9 = groupedMessagePosition.flags;
            if ((i9 & 8) == 0 || (i9 & 1) == 0) {
                return;
            }
        }
        hg.s0 s0Var = this.J;
        if (!s0Var.f10734b) {
            s0Var.D = f10;
            s0Var.E = z10;
            s0Var.d(canvas, this.Vc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f25607v7 != null) {
            return this.f25665z7;
        }
        return this.C;
    }

    public final void h4() {
        ih.z2 z2Var = this.O0;
        i4((z2Var.getImageWidth() / 2.0f) + z2Var.getImageX(), (z2Var.getImageHeight() / 2.0f) + z2Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f25455kc;
    }

    public final void i1(t1 t1Var) {
        dh.k kVar;
        if (t1Var != null && (kVar = t1Var.Bb) != null) {
            int i9 = (Integer) kVar.f4610k.get(t1Var);
            if (i9 == null) {
                i9 = 0;
            }
            this.Cb = i9;
            dh.k kVar2 = this.Bb;
            if (kVar2 != null) {
                kVar2.f4610k.put(this, i9);
            }
        }
    }

    public final void i2(im imVar, Canvas canvas, int i9, Integer num, float f10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        hg.s0 s0Var = this.J;
        if (!s0Var.f10734b) {
            s0Var.D = f10;
            s0Var.f(imVar, canvas, i9, num);
        }
    }

    public final boolean i3(float f10) {
        if (this.f25518p8 != null) {
            int i9 = this.f25548r8;
            if (f10 >= i9 && f10 <= i9 + this.f25564s8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f10, float f11) {
        t1 t1Var;
        ih.z2 z2Var = this.O0;
        this.Ab = (float) Math.sqrt(Math.pow(z2Var.getImageHeight(), 2.0d) + Math.pow(z2Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f25593u7;
        if (!messageObject.isMediaSpoilersRevealed && this.f25639xb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                t1Var = this;
                t1Var.V3(messageObject, this.G, this.B, this.A, this.C, this.D);
                MessageObject messageObject2 = t1Var.f25593u7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (t1Var.G != null) {
                    t1Var.K0.o(0.0f, false);
                }
            } else {
                t1Var = this;
            }
            t1Var.f25655yb = f10;
            t1Var.f25669zb = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g7.n.a(t1Var.Ab * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(gr.f28847j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new j1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        k1 k1Var;
        if (this.f25593u7 == null) {
            return;
        }
        Runnable runnable = this.f24044e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f25400ge;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f25415he;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.F7 || (this.G != null && b3())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Kd || (k1Var = this.Fc) == null) {
            return;
        }
        k1Var.s();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.G != null) {
            c3();
        }
    }

    @Override
    public final boolean j() {
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) != 0) {
                return this.B;
            }
            return true;
        }
        return this.B;
    }

    public final void j1(t1 t1Var) {
        t1Var.b4(this.Ud, this.Wd, this.Xd, this.Yd, this.Zd, this.F0, this.G0, this.Qc, this.Rc, this.Vd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f10) {
        String str;
        o0();
        if (this.f25581ta) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f10, f10, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.f6.f23069h2);
        }
    }

    public final boolean j3() {
        if (this.f25607v7 != null) {
            return this.A7;
        }
        return this.D;
    }

    public final boolean j4() {
        k1 k1Var;
        if (getCurrentMessagesGroup() == null && (k1Var = this.Fc) != null && k1Var.q2() != null && this.Fc.q2().A(this.f25593u7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.S8 == null) {
            this.S8 = new ImageReceiver[3];
            this.T8 = new org.telegram.ui.Components.z8[3];
            this.U8 = new boolean[3];
            int i9 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.S8;
                if (i9 < imageReceiverArr.length) {
                    imageReceiverArr[i9] = new ImageReceiver(this);
                    this.S8[i9].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.T8[i9] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    this.T8[i9].u(AndroidUtilities.dp(18.0f));
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k2(Canvas canvas, boolean z10) {
        float f10;
        float f11;
        int i9;
        float dp;
        float f12;
        float f13;
        float f14;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.f25519pa || z10) && this.f25534qa != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition == null || (groupedMessages = this.G) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f25593u7.isOutOwner();
                s1 s1Var = this.Vc;
                if (isOutOwner) {
                    float dp2 = s1Var.f25178i1 - AndroidUtilities.dp(40.0f);
                    this.Ca = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.G;
                    if (groupedMessages2 != null) {
                        this.Ca = (groupedMessages2.transitionParams.offsetLeft - this.f25611ve) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + s1Var.f25183j1;
                    this.Ca = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.G;
                    if (groupedMessages3 != null) {
                        this.Ca = (groupedMessages3.transitionParams.offsetRight - this.f25611ve) + dp3;
                    }
                }
                float f15 = 0.0f;
                if (this.f25534qa == 4) {
                    this.Da = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.I8 + s1Var.f25177i0) - AndroidUtilities.dp(41.0f);
                    this.Da = dp4;
                    MessageObject messageObject = this.f25593u7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.mb) {
                        this.Da = dp4 - AndroidUtilities.dp(22.0f);
                    }
                    MessageObject.GroupedMessages groupedMessages4 = this.G;
                    if (groupedMessages4 != null) {
                        float f16 = this.Da;
                        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages4.transitionParams;
                        float f17 = f16 + transitionParams.offsetBottom;
                        this.Da = f17;
                        if (transitionParams.backgroundChangeBounds) {
                            this.Da = f17 - getTranslationY();
                        }
                    }
                    if (this.f25593u7.shouldDrawReactions()) {
                        hg.s0 s0Var = this.J;
                        if (!s0Var.f10734b) {
                            if (this.f25483md) {
                                this.Da -= (1.0f - getVideoTranscriptionProgress()) * s0Var.i(s1Var.K1);
                            } else if (s0Var.f10733a > 0.0f) {
                                this.Da -= s0Var.i(s1Var.K1);
                            }
                        }
                    }
                }
                if (this.f25534qa != 4) {
                    float dp5 = ((this.I8 + s1Var.f25177i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Da < dp5) {
                        this.Da = dp5;
                    }
                }
                if (this.f25593u7.type == 19) {
                    if (this.f25534qa == 3 && this.V8 != null) {
                        this.Da = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Da = 0.0f;
                    }
                }
                if (!this.f25593u7.isOutOwner() && this.f25483md && !this.f25345d2) {
                    if (this.f25452k8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.B8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.nd) {
                        f12 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f12 = 0.0f;
                    }
                    if (this.nd) {
                        f15 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (s1Var.f25189k2) {
                        if (this.nd) {
                            f13 = s1Var.K1;
                        } else {
                            f13 = 1.0f - s1Var.K1;
                        }
                        f12 = (1.0f - getVideoTranscriptionProgress()) * f13 * dp;
                        if (this.nd) {
                            f14 = s1Var.K1;
                        } else {
                            f14 = 1.0f - s1Var.K1;
                        }
                        f15 = (1.0f - getVideoTranscriptionProgress()) * f14 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ca -= f12;
                    this.Da -= f15;
                }
                this.f25550ra = true;
                if (this.f25534qa == 3) {
                    if (!this.f25627x || this.f25593u7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!xu0.f34770r0) {
                    float f18 = this.Ca;
                    float f19 = this.Da;
                    float dp6 = AndroidUtilities.dp(32.0f) + f18;
                    float f20 = this.Da;
                    if (this.f25566sa == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    float dp7 = f20 + AndroidUtilities.dp(f10);
                    RectF rectF = this.Y4;
                    rectF.set(f18, f19, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f25550ra = false;
                        return;
                    }
                    int i10 = (int) ((1.0f - this.f25643y.f47775e) * 255.0f);
                    if (i10 != 255) {
                        float f21 = this.Ca;
                        f11 = 2.0f;
                        i9 = canvas.saveLayerAlpha(f21, this.Da, AndroidUtilities.dp(32.0f) + f21, this.Da + AndroidUtilities.dp(64.0f), i10);
                    } else {
                        f11 = 2.0f;
                        i9 = -1;
                    }
                    o0();
                    String str = "paintChatActionBackground";
                    if (this.f25534qa == 4 && this.f25566sa == 5 && this.f25581ta) {
                        Path path = this.f25654ya;
                        if (path == null) {
                            this.f25654ya = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.f25668za;
                        if (path2 == null) {
                            this.f25668za = new Path();
                        } else {
                            path2.rewind();
                        }
                        if (this.Aa == null) {
                            this.Aa = r2;
                            float dp8 = AndroidUtilities.dp(16.0f);
                            float[] fArr = {dp8, dp8, dp8, dp8};
                        }
                        if (this.Ba == null) {
                            this.Ba = r2;
                            float dp9 = AndroidUtilities.dp(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, dp9, dp9, dp9, dp9};
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f22 = this.Ca;
                        rectF2.set(f22, this.Da, AndroidUtilities.dp(32.0f) + f22, this.Da + AndroidUtilities.dp(32.0f));
                        Path path3 = this.f25654ya;
                        float[] fArr3 = this.Aa;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.Ca, this.Da + AndroidUtilities.dp(32.0f), this.Ca + AndroidUtilities.dp(32.0f), this.Da + AndroidUtilities.dp(64.0f));
                        this.f25668za.addRoundRect(rectF2, this.Ba, direction);
                        if (this.f25622wa == 4) {
                            canvas.drawPath(this.f25654ya, M2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.f25668za, M2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.f25654ya, M2("paintChatActionBackground"));
                            canvas.drawPath(this.f25668za, M2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        float dp10 = AndroidUtilities.dp(16.0f);
                        float dp11 = AndroidUtilities.dp(16.0f);
                        if (this.f25581ta) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.f23069h2);
                    }
                    int i11 = this.f25534qa;
                    if (i11 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        a0.p(L2, (this.Ca + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f11), (this.Da + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f11));
                        L2.draw(canvas);
                    } else if (i11 == 4) {
                        int dp12 = (int) (this.Ca + AndroidUtilities.dp(16.0f));
                        int dp13 = (int) (this.Da + AndroidUtilities.dp(16.0f));
                        Drawable L22 = L2("drawableCloseIcon");
                        int intrinsicWidth = L22.getIntrinsicWidth() / 2;
                        int intrinsicHeight = L22.getIntrinsicHeight() / 2;
                        L22.setBounds(dp12 - intrinsicWidth, dp13 - intrinsicHeight, intrinsicWidth + dp12, intrinsicHeight + dp13);
                        a0.p(L22, this.Ca + AndroidUtilities.dp(4.0f), this.Da + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, L22.getBounds().centerX(), L22.getBounds().centerY());
                        L22.draw(canvas);
                        canvas.restore();
                        if (this.f25566sa == 5) {
                            Drawable L23 = L2("drawableMoreIcon");
                            int intrinsicWidth2 = L23.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = L23.getIntrinsicHeight() / 2;
                            L23.setBounds(dp12 - intrinsicWidth2, dp13 - intrinsicHeight2, dp12 + intrinsicWidth2, dp13 + intrinsicHeight2);
                            a0.p(L23, this.Ca + AndroidUtilities.dp(4.0f), this.Da + AndroidUtilities.dp(34.0f));
                            L23.draw(canvas);
                        }
                    } else {
                        int dp14 = (int) (this.Ca + AndroidUtilities.dp(16.0f));
                        int dp15 = (int) (this.Da + AndroidUtilities.dp(16.0f));
                        Drawable L24 = L2("drawableShareIcon");
                        int intrinsicWidth3 = L24.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = L24.getIntrinsicHeight() / 2;
                        L24.setBounds(dp14 - intrinsicWidth3, dp15 - intrinsicHeight3, dp14 + intrinsicWidth3, dp15 + intrinsicHeight3);
                        a0.p(L24, this.Ca + AndroidUtilities.dp(4.0f), this.Da + AndroidUtilities.dp(4.0f));
                        L24.draw(canvas);
                    }
                    if (i9 != -1) {
                        canvas.restoreToCount(i9);
                    }
                }
            }
        }
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        MessageObject messageObject = this.f25593u7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f25593u7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f25593u7.isSponsored() || this.f25593u7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.K7 && !this.Z7) {
            return false;
        }
        TLRPC.Message message2 = this.f25593u7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f25593u7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.Z7 && this.f25593u7.type == 0) || ((!this.A && this.Ua && this.J7 && (!this.f25593u7.isOutOwner() || ((this.f25593u7.isSupergroup() && this.f25593u7.isFromGroup()) || this.f25593u7.isRepostPreview))) || (this.f25593u7.isImportedForward() && this.f25593u7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i9, boolean z10) {
        if (i9 >= 0) {
            ArrayList arrayList = this.U5;
            if (i9 < arrayList.size()) {
                r1 r1Var = (r1) arrayList.get(i9);
                if (this.Fc.V(this, r1Var.f24948t, !r1Var.f24937i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f25593u7.getDialogId();
                    int i10 = this.E7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i10).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i10).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f25593u7);
                    int i11 = this.E7;
                    MessageObject.toggleTodo(i11, sendAsPeerId, tL_messageMediaToDo, r1Var.f24948t.f22525id, !r1Var.f24937i, ConnectionsManager.getInstance(i11).getCurrentTime());
                    if (!r1Var.f24937i) {
                        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(sendAsPeerId);
                        r1Var.f24952y.p(userOrChat);
                        r1Var.f24953z.setForUserOrChat(userOrChat, r1Var.f24952y);
                        r1Var.f24945q = new nz0(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.N8[i9].f(-1, !r1Var.f24937i, true);
                    if (this.f25544r4 != null) {
                        if (!this.f25593u7.isOutOwner() && this.f25593u7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f25544r4.q(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f25593u7.getFromChatId())), true, true);
                        } else {
                            this.f25544r4.q(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    r1Var.f24937i = !r1Var.f24937i;
                    invalidate();
                    return;
                }
                this.f25592u6 = false;
            }
        }
    }

    @Override
    public final void l() {
        k1 k1Var;
        if (this.f25593u7 != null) {
            Runnable runnable = this.f25400ge;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f25415he;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.F7 || (this.G != null && b3())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Kd && (k1Var = this.Fc) != null) {
                k1Var.s();
            }
        }
    }

    public final void l1() {
        int i9;
        s1(0);
        if (this.O2) {
            boolean z10 = this.Q2;
            if (this.P2) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i9 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i9 = z10 ? 1 : 0;
            }
            if (this.R2) {
                z10 = (z10 ? 1 : 0) | true;
                i9++;
            }
            if (i9 == 0) {
                this.T2 = null;
                this.S2 = 0;
                return;
            }
            this.f25500o0 = AndroidUtilities.dp(60.0f) + this.f25500o0;
            if (z10 != this.S2) {
                this.S2 = 0;
                int y10 = ll.y(75.0f, this.F8, i9);
                float dpf2 = (this.F8 - AndroidUtilities.dpf2(37.0f)) / i9;
                ArrayList arrayList = this.T2;
                if (arrayList == null) {
                    this.T2 = new ArrayList(i9);
                } else {
                    arrayList.clear();
                }
                if (this.Q2) {
                    this.S2 |= 1;
                    this.T2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), y10, dpf2));
                }
                if (this.P2) {
                    this.S2 |= 2;
                    this.T2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), y10, dpf2));
                }
                if (this.R2) {
                    this.S2 |= 4;
                    this.T2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), y10, dpf2));
                }
            }
        }
    }

    public final void l2(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10, boolean z14, float f11, float f12, float f13, boolean z15, boolean z16) {
        float photoBottom;
        float f14;
        float f15;
        float f16;
        int dp;
        int dp2;
        Drawable L2;
        Drawable drawable;
        int v02;
        float f17;
        MessageObject messageObject;
        boolean z17 = (f13 == 1.0f || z15) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z17 ? f10 * f13 : f10;
        if (this.G1 != 7 || ((messageObject = this.f25593u7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f25511p0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.J.i(this.Vc.K1) + AndroidUtilities.dp(this.F ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f25593u7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f20 = 22.0f;
        if (z12) {
            qb0 qb0Var = org.telegram.ui.ActionBar.f6.E3;
            if (f4()) {
                if (this.f25593u7.shouldDrawWithoutBackground()) {
                    f16 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, this.Ed);
                    int i9 = this.H8;
                    f17 = z14 ? 24.0f : 22.0f;
                    qb0Var.getClass();
                    f14 = 4.0f;
                    a0.p(qb0Var, ((i9 - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f11);
                    qb0Var.setAlpha((int) (this.f25421i5 * 255.0f * f19));
                } else {
                    f14 = 4.0f;
                    f16 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23291tc, this.Ed);
                    int i10 = this.H8;
                    f17 = z14 ? 24.0f : 22.0f;
                    qb0Var.getClass();
                    a0.p(qb0Var, ((i10 - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f11);
                    qb0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 4.0f;
                f16 = 1.0f;
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Na, this.Ed);
                qb0Var.getClass();
                f15 = 18.5f;
                a0.p(qb0Var, (this.H8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f12 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f11);
                qb0Var.setAlpha((int) (f19 * 255.0f));
            }
            qb0Var.a(v02);
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, qb0Var.getBounds().centerX(), qb0Var.getBounds().centerY());
            }
            qb0Var.draw(canvas);
            qb0Var.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
            invalidate();
        } else {
            f14 = 4.0f;
            f15 = 18.5f;
            f16 = 1.0f;
        }
        if (z11) {
            if (f4()) {
                if (z15) {
                    canvas.save();
                }
                if (this.f25593u7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f16 - f13), 0.0f);
                        }
                        a0.p(drawable, ((this.H8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        a0.p(drawable, ((this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f25421i5 * 255.0f * f19));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f16 - f13) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.f6.F3, (this.H8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.f6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.f6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        a0.p(org.telegram.ui.ActionBar.f6.F3, (this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.f6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.f6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.f6.F3.setAlpha((int) (this.f25421i5 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.f6.F3;
                }
                if (z17) {
                    canvas.save();
                    canvas.scale(f18, f18, drawable.getBounds().centerX(), drawable.getBounds().centerY());
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
                        canvas.translate((f16 - f13) * AndroidUtilities.dp(f14), 0.0f);
                    }
                    L2 = L2(z16 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    a0.p(L2, ((this.H8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f12 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f11);
                } else {
                    L2 = L2(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    a0.p(L2, ((this.H8 - AndroidUtilities.dp(f15)) - L2.getIntrinsicWidth()) + dp4, ((f12 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f11);
                }
                L2.setAlpha((int) (f19 * 255.0f));
                if (z17) {
                    canvas.save();
                    canvas.scale(f18, f18, L2.getBounds().centerX(), L2.getBounds().centerY());
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
                Drawable L22 = this.f25593u7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.f6.G3;
                a0.p(L22, ((this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f11);
                L22.setAlpha((int) (this.f25421i5 * 255.0f * f19));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, L22.getBounds().centerX(), L22.getBounds().centerY());
                }
                L22.draw(canvas);
                if (z17 || z15) {
                    canvas.restore();
                }
                L22.setAlpha(255);
            } else {
                Drawable L23 = L2(z16 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                a0.p(L23, (this.H8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f12 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f11);
                L23.setAlpha((int) (f19 * 255.0f));
                if (z17 || z15) {
                    canvas.save();
                    canvas.scale(f18, f18, L23.getBounds().centerX(), L23.getBounds().centerY());
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
                dp = this.H8 - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.H8 - AndroidUtilities.dp(32.0f);
                if (!this.B && !this.A) {
                    f20 = 21.0f;
                }
                dp2 = AndroidUtilities.dp(f20);
            }
            float f21 = (f12 - dp2) + f11;
            int i11 = (int) (dp + dp4);
            RectF rectF = this.Y4;
            rectF.set(i11, f21, AndroidUtilities.dp(14.0f) + i11, AndroidUtilities.dp(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.f6.f22961b2.getAlpha();
            org.telegram.ui.ActionBar.f6.f22961b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), org.telegram.ui.ActionBar.f6.f22961b2);
            org.telegram.ui.ActionBar.f6.f22961b2.setAlpha(alpha);
            a0.p(org.telegram.ui.ActionBar.f6.f23107j4, AndroidUtilities.dp(6.0f) + i11, f21 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.f6.f23107j4.setAlpha((int) (f19 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.f6.f23107j4.getBounds().centerX(), org.telegram.ui.ActionBar.f6.f23107j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.f6.f23107j4.draw(canvas);
            org.telegram.ui.ActionBar.f6.f23107j4.setAlpha(255);
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
        int i9;
        boolean z10;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.f25327be && (messageObject = this.f25593u7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i9 = org.telegram.ui.Components.k5.g();
            } else {
                i9 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.f25469lc = org.telegram.ui.Components.t5.update(i9, (View) this, false, this.f25469lc, arrayList);
            } else {
                k1 k1Var = this.Fc;
                if (k1Var != null && k1Var.h()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f25469lc = org.telegram.ui.Components.t5.update(i9, this, z10, this.f25469lc, this.f25593u7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f25593u7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                k1 k1Var2 = this.Fc;
                richMessageLayout.invalidateAnimatedEmojiInParent = (k1Var2 == null || !k1Var2.h()) ? true : true;
                this.f25593u7.richLayout.updateAnimatedEmojis(i9);
            }
        }
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m():boolean");
    }

    public final boolean m0() {
        if (this.f25593u7.hasMediaSpoilers() && !this.f25593u7.isMediaSpoilersRevealed && this.f25639xb == 0.0f && this.P0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final int m1(MessageObject messageObject, int i9) {
        TLRPC.WebPage webPage;
        TLRPC.Document document;
        boolean z10;
        int i10;
        String str;
        String str2;
        int i11 = i9;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        if (messageMedia != null) {
            this.H1 = messageMedia.document;
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
            this.H1 = document;
        } else {
            this.H1 = messageObject.getDocument();
        }
        TLRPC.Document document2 = this.H1;
        int i12 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (MessageObject.isVoiceDocument(document2)) {
                this.G1 = 3;
                int i13 = 0;
                while (true) {
                    if (i13 >= this.H1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.H1.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i13++;
                }
                AndroidUtilities.dp(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.f6.N2.measureText("00:00"));
                this.f25666z8 = i11 - AndroidUtilities.dp(18.0f);
                x3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.f25468lb;
                if (!this.f25345d2) {
                    this.F8 = Math.min(i11, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.f6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.D5.f32219m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.H1)) {
                this.G1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    q4();
                    this.Q3 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.C2.measureText(str2));
                    this.P3 = new StaticLayout(AndroidUtilities.formatFileSize(this.H1.size), org.telegram.ui.ActionBar.f6.C2, this.Q3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (MessageObject.isMusicDocument(this.H1)) {
                this.G1 = 5;
                int dp2 = i11 - AndroidUtilities.dp(92.0f);
                if (dp2 < 0) {
                    dp2 = AndroidUtilities.dp(100.0f);
                }
                int i14 = dp2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.f6.O2, i14 - AndroidUtilities.dp(12.0f), truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.f6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(ellipsize, textPaint, i14, alignment, 1.0f, 0.0f, false);
                this.P5 = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.Q5 = -((int) Math.ceil(this.P5.getLineLeft(0)));
                    int lineWidth = (int) this.P5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth > this.F8) {
                        this.F8 = AndroidUtilities.dp(104.0f) + lineWidth;
                    }
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.f6.P2, i14, truncateAt), org.telegram.ui.ActionBar.f6.P2, i14, alignment, 1.0f, 0.0f, false);
                this.R5 = staticLayout2;
                if (staticLayout2.getLineCount() > 0) {
                    this.S5 = -((int) Math.ceil(this.R5.getLineLeft(0)));
                    int lineWidth2 = (int) this.R5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth2 > this.F8) {
                        this.F8 = AndroidUtilities.dp(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i12 >= this.H1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.H1.attributes.get(i12);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i12++;
                }
                int i15 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.f6.N2.measureText(AndroidUtilities.formatShortDuration(i15, i15)));
                AndroidUtilities.dp(86.0f);
                this.f25666z8 = this.F8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.H1, messageObject.hasValidGroupId())) {
                this.G1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.f25617w4 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.f6.C2;
                    int i16 = this.f25617w4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f25528q4 = new StaticLayout(string, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
                    this.Q3 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.C2.measureText(str));
                    this.P3 = new StaticLayout(AndroidUtilities.formatFileSize(this.H1.size), org.telegram.ui.ActionBar.f6.C2, this.Q3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str3 = this.H1.mime_type;
                if ((str3 != null && (str3.toLowerCase().startsWith("image/") || this.H1.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.isDocumentHasThumb(this.H1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.I1 = z10;
                if (!z10) {
                    i11 += AndroidUtilities.dp(30.0f);
                }
                int i17 = i11;
                this.G1 = 1;
                String documentFileName = FileLoader.getDocumentFileName(this.H1);
                if (documentFileName.length() == 0) {
                    documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
                }
                StaticLayout c10 = rv0.c(documentFileName, org.telegram.ui.ActionBar.f6.G2, i17, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i17, 2, false);
                this.P3 = c10;
                this.R3 = Integer.MIN_VALUE;
                if (c10 != null && c10.getLineCount() > 0) {
                    int i18 = 0;
                    while (i12 < this.P3.getLineCount()) {
                        i18 = Math.max(i18, (int) Math.ceil(this.P3.getLineWidth(i12)));
                        this.R3 = Math.max(this.R3, (int) Math.ceil(-this.P3.getLineLeft(i12)));
                        i12++;
                    }
                    i10 = Math.min(i17, i18);
                } else {
                    this.R3 = 0;
                    i10 = i17;
                }
                int dp3 = i17 - AndroidUtilities.dp(30.0f);
                TextPaint textPaint3 = org.telegram.ui.ActionBar.f6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.H1.size))));
                this.f25617w4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.H1.size) + " " + FileLoader.getDocumentExtension(this.H1), org.telegram.ui.ActionBar.f6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.f25617w4 < 0) {
                        this.f25617w4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f25528q4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.f6.C2, this.f25617w4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (this.I1) {
                    this.f25304a5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f25319b5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f25593u7.isHiddenSensitive() || (DownloadController.getInstance(this.E7).getAutodownloadMask() & 1) == 0) {
                        this.f25304a5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f25304a5;
                    ih.z2 z2Var = this.O0;
                    if (photoSize != null && photoSize != this.f25319b5) {
                        BitmapDrawable bitmapDrawable = this.f25593u7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f25319b5 = null;
                            this.f25333c5 = bitmapDrawable;
                        }
                    } else {
                        this.f25304a5 = null;
                        z2Var.setNeedsQualityThumb(true);
                        z2Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f25348d5 = "86_86_b";
                    z2Var.setImage(ImageLocation.getForObject(this.f25304a5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f25319b5, messageObject.photoThumbsObject), this.f25348d5, this.f25333c5, 0L, null, messageObject, 1);
                }
                return i10;
            }
        }
        return 0;
    }

    public void m2(float r16, android.graphics.Canvas r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m2(float, android.graphics.Canvas, boolean):void");
    }

    public final boolean m3() {
        if (this.f25607v7 != null) {
            return this.f25651y7;
        }
        return this.B;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m4(boolean, boolean, boolean):void");
    }

    public final void n0() {
        gr grVar;
        boolean z10 = this.f25417i1;
        if (z10 || this.f25431j1) {
            if ((z10 && this.f25445k1 == 1.0f) || (!z10 && this.f25445k1 == 0.0f)) {
                this.f25431j1 = false;
            }
            if (z10) {
                grVar = gr.f28845g;
            } else {
                grVar = gr.f28846i;
            }
            this.f25472m1 = (int) Math.ceil(grVar.getInterpolation(this.f25445k1) * AndroidUtilities.dp(35.0f));
            if (this.f25593u7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f25472m1 = 0;
                }
            }
            if (!this.f25593u7.isOutOwner() || this.f25593u7.hasWideCode) {
                y4();
            }
            if (this.f25431j1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.l1;
                this.l1 = elapsedRealtime;
                if (this.f25417i1) {
                    float f10 = (((float) j10) / 200.0f) + this.f25445k1;
                    this.f25445k1 = f10;
                    if (f10 > 1.0f) {
                        this.f25445k1 = 1.0f;
                    }
                } else {
                    float f11 = this.f25445k1 - (((float) j10) / 200.0f);
                    this.f25445k1 = f11;
                    if (f11 <= 0.0f) {
                        this.f25445k1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void n2(Canvas canvas, float f10, boolean z10, float f11, StaticLayout staticLayout, float f12, boolean z11) {
        int i9;
        float f13;
        ih.z2 z2Var;
        char c10;
        int i10;
        int i11;
        char c11;
        boolean z12;
        s1 s1Var;
        float f14;
        boolean z13;
        float f15;
        boolean z14;
        t1 t1Var;
        String str;
        int i12;
        float f16;
        float dp;
        float f17;
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
        float f18;
        float f19;
        int dp2;
        boolean z24;
        float photoBottom;
        float f20;
        int i13;
        float f21;
        s1 s1Var4;
        float f22;
        float f23;
        boolean z25;
        int i14;
        boolean z26;
        MessageObject messageObject;
        float j10;
        TextPaint textPaint;
        int i15;
        t1 t1Var2 = this;
        Canvas canvas2 = canvas;
        if (((t1Var2.f25535qb && !t1Var2.I) || !t1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = t1Var2.f25593u7;
            if ((!messageObject2.deleted || t1Var2.H == null) && (i9 = messageObject2.type) != 16) {
                if (i9 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.f6.T2;
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, t1Var2.Ed);
                    if (t1Var2.f3()) {
                        i15 = t1Var2.f25593u7.isOutOwner() ? org.telegram.ui.ActionBar.f6.f23184nb : org.telegram.ui.ActionBar.f6.f23201od;
                    } else {
                        i15 = t1Var2.f25593u7.isOutOwner() ? org.telegram.ui.ActionBar.f6.f23272sb : org.telegram.ui.ActionBar.f6.nd;
                    }
                    textPaint2.setColor(i0.a.d(t1Var2.getVideoTranscriptionProgress(), v02, org.telegram.ui.ActionBar.f6.v0(i15, t1Var2.Ed)));
                } else if (t1Var2.f4()) {
                    if (t1Var2.f25593u7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, t1Var2.Ed));
                    } else {
                        org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23133kd, t1Var2.Ed));
                    }
                } else if (t1Var2.f25593u7.isOutOwner()) {
                    org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(z11 ? org.telegram.ui.ActionBar.f6.f23184nb : org.telegram.ui.ActionBar.f6.f23272sb, t1Var2.Ed));
                } else {
                    org.telegram.ui.ActionBar.f6.T2.setColor(org.telegram.ui.ActionBar.f6.v0(z11 ? org.telegram.ui.ActionBar.f6.f23201od : org.telegram.ui.ActionBar.f6.nd, t1Var2.Ed));
                }
                float f24 = t1Var2.getTransitionParams().J1 ? t1Var2.getTransitionParams().K1 * f10 : f10;
                if (f24 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (textPaint.getAlpha() * f24));
                }
                canvas2.save();
                if (t1Var2.F && !t1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f25 = t1Var2.I8;
                s1 s1Var5 = t1Var2.Vc;
                if (s1Var5.f25235w0) {
                    f25 += s1Var5.f25177i0;
                }
                MessageObject.GroupedMessages groupedMessages = t1Var2.G;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f13 = f11;
                } else {
                    f25 -= t1Var2.getTranslationY();
                    f13 = f11 + t1Var2.G.transitionParams.offsetRight;
                }
                float f26 = f25;
                float f27 = f13;
                if (t1Var2.F && t1Var2.f4()) {
                    f26 += AndroidUtilities.dp(1.0f);
                }
                float f28 = f26;
                if (s1Var5.f25235w0) {
                    float f29 = t1Var2.f25611ve;
                    f13 += f29;
                    f27 += f29;
                }
                float f30 = f13;
                boolean shouldDrawReactions = t1Var2.f25593u7.shouldDrawReactions();
                hg.s0 s0Var = t1Var2.J;
                if (shouldDrawReactions && s0Var.f10734b) {
                    if (s1Var5.f25235w0 && s1Var5.f25172h0 != 0.0f) {
                        j10 = s0Var.j(1.0f);
                    } else {
                        j10 = s0Var.j(s1Var5.K1);
                    }
                    f27 += j10;
                }
                if (s1Var5.T0) {
                    f27 = j3.r0.C(1.0f, s1Var5.K1, s1Var5.Y0, f27);
                }
                float f31 = f27;
                boolean f42 = t1Var2.f4();
                RectF rectF = t1Var2.Y4;
                ih.z2 z2Var2 = t1Var2.O0;
                if (f42) {
                    int i16 = -(t1Var2.f25381f9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (t1Var2.f25593u7.shouldDrawWithoutBackground()) {
                        M2 = t1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = t1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f32 = f24;
                    z2Var = z2Var2;
                    org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (t1Var2.f25421i5 * 255.0f * f32));
                    MessageObject messageObject3 = t1Var2.f25593u7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f18 = f30;
                        f19 = f32;
                    } else {
                        float currentAlpha = z2Var.isCrossfadingWithOldImage() ? 1.0f : z2Var.getCurrentAlpha();
                        if (!z2Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f18 = f30;
                        f19 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = t1Var2.f25593u7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.i5 i5Var = t1Var2.f25401h0;
                        f19 *= i5Var == null ? 0.0f : i5Var.e();
                    }
                    M2.setAlpha((int) e2.c.C(alpha, t1Var2.f25421i5, f19, 0.6f));
                    int i17 = t1Var2.G1;
                    if (i17 != 7 && i17 != 6 && t1Var2.f25593u7.type != 19) {
                        int[] roundRadius = z2Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z24 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = t1Var2.f25593u7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z24 = false;
                    }
                    MessageObject messageObject6 = t1Var2.f25593u7;
                    float dp4 = f18 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f25357e0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z24 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = t1Var2.f25593u7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f33 = f19;
                    float f34 = dp4;
                    if (t1Var2.G1 != 7 || ((messageObject = t1Var2.f25593u7) != null && messageObject.isRoundOnce())) {
                        photoBottom = t1Var2.getPhotoBottom() + t1Var2.f25511p0;
                    } else {
                        photoBottom = f28 - ((1.0f - t1Var2.getVideoTranscriptionProgress()) * (s0Var.i(s1Var5.K1) + AndroidUtilities.dp(t1Var2.F ? 4.0f : 5.0f)));
                    }
                    float f35 = photoBottom;
                    float dp7 = f35 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.f6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f36 = dp5 - dp6;
                    float f37 = dp6 + dp5 + f12;
                    int i18 = z24 ? 12 : 8;
                    if (t1Var2.f25593u7.isOutOwner()) {
                        f20 = f37;
                        i13 = (t1Var2.f25593u7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f20 = f37;
                        i13 = 0;
                    }
                    rectF.set(f36, dp7, f20 + AndroidUtilities.dp(i18 + i13), dp7 + max);
                    k4 k4Var = t1Var2.B7;
                    if (k4Var != null) {
                        float f38 = dp2;
                        canvas2.save();
                        Path path = k4Var.f24607t;
                        path.rewind();
                        path.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!t1Var2.f25593u7.isQuickReply()) {
                        if (t1Var2.f25593u7.hasMediaSpoilers() && t1Var2.f25593u7.type != 5) {
                            Path path2 = t1Var2.A5;
                            path2.rewind();
                            float f39 = dp2;
                            path2.addRoundRect(rectF, f39, f39, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = t1Var2.f25593u7.needDrawBluredPreview() ? z2Var : t1Var2.P0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = t1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * t1Var2.f25435j5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f39, f39, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            t1Var2.o0();
                            float f40 = dp2;
                            canvas2.drawRoundRect(rectF, f40, f40, M2);
                            if (M2 == t1Var2.M2("paintChatActionBackground") && t1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.f6.f23069h2.getAlpha();
                                org.telegram.ui.ActionBar.f6.f23069h2.setAlpha((int) (alpha4 * t1Var2.f25421i5 * f33));
                                canvas2.drawRoundRect(rectF, f40, f40, org.telegram.ui.ActionBar.f6.f23069h2);
                                org.telegram.ui.ActionBar.f6.f23069h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f41 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = t1Var2.f25593u7;
                    float dp8 = f41 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f25593u7.shouldDrawReactions() && s0Var.f10734b) {
                        t1Var2.t4();
                        s0Var.D = 0.0f;
                        s0Var.E = false;
                        s0Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(t1Var2.Vb) || t1Var2.Vb.megagroup) && (t1Var2.f25593u7.messageOwner.flags & 1024) == 0 && t1Var2.Rb == null && !t1Var2.U7) {
                        i11 = i16;
                        f28 = f28;
                        c10 = 7;
                        f21 = dp8;
                        f24 = f32;
                    } else {
                        float lineWidth = (t1Var2.f25468lb - staticLayout.getLineWidth(0)) + dp8;
                        if (s0Var.f10734b && !s0Var.f10749s) {
                            lineWidth -= s0Var.f10747q;
                        }
                        float f43 = lineWidth;
                        int g10 = s1Var5.g();
                        int i19 = s1Var5.a2;
                        if (i19 >= 0 && i19 != g10 && !t1Var2.f25399gd) {
                            t1Var2.t1(i19, g10, z10);
                        }
                        boolean z27 = t1Var2.f25399gd;
                        if (z27) {
                            g10 = t1Var2.f25355dd;
                        }
                        boolean z28 = (g10 & 4) != 0;
                        boolean z29 = (g10 & 8) != 0;
                        if (z27) {
                            int i20 = t1Var2.f25369ed;
                            if ((i20 & 4) != 0) {
                                i14 = i20;
                                z26 = true;
                            } else {
                                i14 = i20;
                                z26 = false;
                            }
                            float f44 = i16;
                            s1Var4 = s1Var5;
                            f22 = f43;
                            boolean z30 = z28;
                            c10 = 7;
                            i11 = i16;
                            boolean z31 = (i14 & 8) != 0;
                            t1Var2.L1(canvas2, z26, z31, f28, f32, f44, f34, 1.0f - t1Var2.f25384fd, z11);
                            boolean z32 = z26;
                            boolean z33 = z29;
                            t1Var2.L1(canvas, z30, z33, f28, f32, f44, f34, t1Var2.f25384fd, z11);
                            f28 = f28;
                            f23 = f34;
                            z25 = z30;
                            f24 = f32;
                            if (!t1Var2.f25593u7.isOutOwner()) {
                                if (!z32 && !z31) {
                                    t1Var2.p2(canvas, f24, f44, f23, 1.0f - t1Var2.f25384fd, z11);
                                }
                                if (!z25 && !z33) {
                                    t1Var2.p2(canvas, f24, f44, f23, t1Var2.f25384fd, z11);
                                }
                            }
                        } else {
                            s1Var4 = s1Var5;
                            f22 = f43;
                            boolean z34 = z28;
                            boolean z35 = z29;
                            c10 = 7;
                            i11 = i16;
                            if (!t1Var2.f25593u7.isOutOwner() && !z34 && !z35) {
                                t1Var2.p2(canvas, f32, i11, f34, 1.0f, z11);
                            }
                            t1Var2 = this;
                            t1Var2.L1(canvas, z34, z35, f28, f32, i11, f34, 1.0f, z11);
                            f28 = f28;
                            f23 = f34;
                            z25 = z34;
                            f24 = f32;
                        }
                        if (t1Var2.f25593u7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f24, i11, f23, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var4;
                        s1Var5.a2 = s1Var4.g();
                        if (z25 && z10 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f21 = f22;
                    }
                    canvas2.save();
                    float f45 = f31 + f21;
                    t1Var2.f25426ib = f45;
                    float dp9 = (f35 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    t1Var2.f25441jb = dp9;
                    canvas2.translate(f45, dp9);
                    dh.l.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.f6.T2.setAlpha(255);
                    z12 = z24;
                    c11 = 2;
                } else {
                    z2Var = z2Var2;
                    c10 = 7;
                    if (t1Var2.f25593u7.isSponsored()) {
                        i10 = -AndroidUtilities.dp(48.0f);
                        if (t1Var2.G8) {
                            i10 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i10 = -(t1Var2.f25381f9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i11 = i10;
                    float f46 = -staticLayout.getLineLeft(0);
                    if (t1Var2.f25593u7.shouldDrawReactions() && s0Var.f10734b) {
                        t1Var2.t4();
                        s0Var.D = 0.0f;
                        s0Var.E = false;
                        s0Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((ChatObject.isChannel(t1Var2.Vb) && !t1Var2.Vb.megagroup) || (t1Var2.f25593u7.messageOwner.flags & 1024) != 0 || t1Var2.Rb != null || s1Var5.F || t1Var2.U7 || s1Var5.B) {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f46;
                        if (s0Var.f10734b && !s0Var.f10749s) {
                            lineWidth2 -= s0Var.f10747q;
                        }
                        float f47 = lineWidth2;
                        int g11 = s1Var5.g();
                        int i21 = s1Var5.a2;
                        if (i21 >= 0 && i21 != g11 && !t1Var2.f25399gd) {
                            t1Var2.t1(i21, g11, z10);
                        }
                        boolean z36 = t1Var2.f25399gd;
                        if (z36) {
                            g11 = t1Var2.f25355dd;
                        }
                        boolean z37 = (g11 & 4) != 0;
                        boolean z38 = (g11 & 8) != 0;
                        if (z36) {
                            int i22 = t1Var2.f25369ed;
                            if ((i22 & 4) != 0) {
                                f15 = f24;
                                z14 = true;
                            } else {
                                f15 = f24;
                                z14 = false;
                            }
                            boolean z39 = (i22 & 8) != 0;
                            float f48 = f15;
                            float f49 = i11;
                            s1Var = s1Var5;
                            t1Var2.L1(canvas2, z14, z39, f28, f48, f49, f30, 1.0f - t1Var2.f25384fd, z11);
                            boolean z40 = z14;
                            boolean z41 = z39;
                            boolean z42 = z37;
                            boolean z43 = z38;
                            t1Var2.L1(canvas, z42, z43, f28, f48, f49, f30, t1Var2.f25384fd, z11);
                            f28 = f28;
                            f14 = f30;
                            z13 = z42;
                            f24 = f48;
                            if (!t1Var2.f25593u7.isOutOwner()) {
                                if (!z40 && !z41) {
                                    t1Var2.p2(canvas, f24, f49, f14, 1.0f - t1Var2.f25384fd, z11);
                                }
                                if (!z13 && !z43) {
                                    t1Var2.p2(canvas, f24, f49, f14, t1Var2.f25384fd, z11);
                                }
                            }
                        } else {
                            s1Var = s1Var5;
                            boolean z44 = z37;
                            boolean z45 = z38;
                            if (!t1Var2.f25593u7.isOutOwner() && !z44 && !z45) {
                                t1Var2.p2(canvas, f24, i11, f30, 1.0f, z11);
                            }
                            t1Var2 = this;
                            float f50 = f24;
                            t1Var2.L1(canvas, z44, z45, f28, f50, i11, f30, 1.0f, z11);
                            f28 = f28;
                            f14 = f30;
                            z13 = z44;
                            f24 = f50;
                        }
                        if (t1Var2.f25593u7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f24, i11, f14, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var;
                        s1Var5.a2 = s1Var.g();
                        if (z13 && z10 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f46 = f47;
                    }
                    canvas2.save();
                    if (s1Var5.T0 && s1Var5.K1 != 1.0f) {
                        if (s1Var5.U0 != null) {
                            canvas2.translate(f31 + f46, ((f28 - AndroidUtilities.dp((t1Var2.B || t1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i11);
                            int alpha5 = org.telegram.ui.ActionBar.f6.T2.getAlpha();
                            org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (alpha5 * s1Var5.K1));
                            s1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.f6.T2.setAlpha(alpha5);
                            dh.l.f(canvas2, s1Var5.V0);
                            c11 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.f6.T2.getAlpha();
                            canvas2.save();
                            float f51 = i11;
                            canvas2.translate(s1Var5.f25169g1 + f46, ((f28 - AndroidUtilities.dp((t1Var2.B || t1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f51);
                            float f52 = alpha6;
                            c11 = 2;
                            org.telegram.ui.ActionBar.f6.T2.setAlpha((int) ((1.0f - s1Var5.K1) * f52));
                            dh.l.f(canvas2, s1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f31 + f46, ((f28 - AndroidUtilities.dp((t1Var2.B || t1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f51);
                            org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (f52 * s1Var5.K1));
                            dh.l.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.f6.T2.setAlpha(alpha6);
                        }
                    } else {
                        c11 = 2;
                        float f53 = f31 + f46;
                        t1Var2.f25426ib = f53;
                        float dp10 = ((f28 - AndroidUtilities.dp((t1Var2.B || t1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i11;
                        t1Var2.f25441jb = dp10;
                        canvas2.translate(f53, dp10);
                        dh.l.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = false;
                }
                int i23 = i11;
                if (t1Var2.f25593u7.isOutOwner()) {
                    int g12 = s1Var5.g();
                    int i24 = s1Var5.a2;
                    if (i24 >= 0 && i24 != g12 && !t1Var2.f25399gd) {
                        t1Var2.t1(i24, g12, z10);
                    }
                    if (t1Var2.f25399gd) {
                        g12 = t1Var2.f25355dd;
                    }
                    if ((g12 & 1) != 0) {
                        f17 = f24;
                        z15 = true;
                    } else {
                        f17 = f24;
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
                    if (t1Var2.f25471le != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, t1Var2.f25471le);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (t1Var2.f25399gd) {
                        int i25 = t1Var2.f25369ed;
                        if ((i25 & 1) != 0) {
                            z18 = z15;
                            z19 = true;
                        } else {
                            z18 = z15;
                            z19 = false;
                        }
                        boolean z48 = (i25 & 2) != 0;
                        if ((i25 & 4) != 0) {
                            z20 = z16;
                            z21 = true;
                        } else {
                            z20 = z16;
                            z21 = false;
                        }
                        if ((i25 & 8) != 0) {
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
                            i12 = 0;
                            f16 = 0.0f;
                            t1Var2.l2(canvas2, z49, z46, z16, z22, f17, z12, i23, f28, t1Var2.f25384fd, true, z11);
                        } else {
                            s1Var3 = s1Var2;
                            str = "paintChatTimeBackground";
                            boolean z50 = z18;
                            i12 = 0;
                            f16 = 0.0f;
                            float f54 = i23;
                            t1Var2.l2(canvas, z19, z48, z21, z23, f17, z12, f54, f28, 1.0f - t1Var2.f25384fd, false, z11);
                            z16 = z20;
                            t1Var2.l2(canvas, z50, z46, z16, z22, f17, z12, f54, f28, t1Var2.f25384fd, false, z11);
                        }
                        t1Var = this;
                        canvas2 = canvas;
                    } else {
                        s1Var3 = s1Var2;
                        str = "paintChatTimeBackground";
                        i12 = 0;
                        f16 = 0.0f;
                        canvas2 = canvas;
                        l2(canvas2, z15, z46, z16, z47, f17, z12, i23, f28, 1.0f, false, z11);
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
                    i12 = 0;
                    f16 = 0.0f;
                }
                canvas2.restore();
                if (t1Var.Ib != null) {
                    if (t1Var.Gb == f16 || t1Var.Hb == f16) {
                        t1Var.r0();
                    }
                    Path path3 = t1Var.Mb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(z2Var.getImageX(), z2Var.getImageY(), z2Var.getImageX2(), z2Var.getImageY2());
                    int[] roundRadius2 = z2Var.getRoundRadius();
                    float f55 = roundRadius2[i12];
                    float[] fArr = t1Var.Nb;
                    fArr[1] = f55;
                    fArr[i12] = f55;
                    float f56 = roundRadius2[1];
                    fArr[3] = f56;
                    fArr[c11] = f56;
                    float f57 = roundRadius2[c11];
                    fArr[5] = f57;
                    fArr[4] = f57;
                    float f58 = roundRadius2[3];
                    fArr[c10] = f58;
                    fArr[6] = f58;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF2.set(t1Var.Gb - AndroidUtilities.dp(12.0f), t1Var.Hb - AndroidUtilities.dp(8.0f), t1Var.Gb + org.telegram.ui.ActionBar.f6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + t1Var.Ib.getWidth() + AndroidUtilities.dp(12.0f), t1Var.Hb + t1Var.Ib.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (t1Var.Bb == null) {
                        if (t1Var.Lb == null) {
                            t1Var.Lb = new dh.l();
                        }
                        t1Var.Lb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        t1Var.Lb.setBounds((int) z2Var.getImageX(), (int) z2Var.getImageY(), (int) z2Var.getImageX2(), (int) z2Var.getImageY2());
                        t1Var.Lb.draw(canvas2);
                    }
                    t1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, t1Var.getWidth(), t1Var.getHeight(), (int) (t1Var.Fb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.f6.f23088i2.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23088i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.f6.f23088i2);
                    org.telegram.ui.ActionBar.f6.f23088i2.setAlpha(alpha7);
                    canvas.translate(t1Var.Gb + AndroidUtilities.dp(4.0f), t1Var.Hb);
                    Drawable drawable = org.telegram.ui.ActionBar.f6.L3;
                    drawable.setBounds(i12, i12, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.f6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.f6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.f6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), 0.0f);
                    dh.l.f(canvas, t1Var.Ib);
                    canvas.restore();
                    if (t1Var.H2 != null && z2Var.getVisible() && t1Var.f25404h3 == 0) {
                        int i26 = SharedConfig.bubbleRadius;
                        if (i26 > 2) {
                            dp = AndroidUtilities.dp(i26 - 2);
                            z12 = SharedConfig.bubbleRadius >= 10;
                        } else {
                            dp = AndroidUtilities.dp(i26);
                        }
                        int imageX = (int) (z2Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (z2Var.getImageY() + AndroidUtilities.dp(6.0f));
                        rectF.set(imageX - AndroidUtilities.dp(4.0f), imageY - AndroidUtilities.dp(1.5f), AndroidUtilities.dp(z12 ? 2.0f : 0.0f) + AndroidUtilities.dp(4.0f) + t1Var.f25459l2 + imageX, AndroidUtilities.dp(1.5f) + t1Var.H2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, t1Var.M2(str));
                        canvas.save();
                        if (z12) {
                            i12 = 2;
                        }
                        canvas.translate(imageX + i12, imageY);
                        dh.l.f(canvas, t1Var.H2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f25607v7 != null) {
            return this.f25635x7;
        }
        return this.A;
    }

    public final void n4() {
        float imageHeight;
        float f10;
        float f11;
        float dp;
        int i9;
        int i10;
        int i11;
        float f12;
        int i12;
        int i13;
        MessageObject messageObject = this.f25593u7;
        int i14 = messageObject.type;
        s1 s1Var = this.Vc;
        int i15 = 0;
        boolean z10 = true;
        if (i14 != 1 && i14 != 20 && this.G1 != 4 && i14 != 8 && i14 != 23) {
            float f13 = 43.0f;
            float f14 = 11.0f;
            float f15 = 0.0f;
            float f16 = 10.0f;
            if (this.f25359e2) {
                int i16 = this.f25548r8;
                if (!messageObject.isOutOwner()) {
                    f14 = 17.0f;
                }
                this.f25461l4 = AndroidUtilities.dp(f14) + i16 + this.f25448k4;
                int i17 = this.f25500o0 - this.f25490n4;
                if (this.E) {
                    f16 = 9.0f;
                }
                int dp2 = ((i17 - AndroidUtilities.dp(f16)) - this.f25418i2) - AndroidUtilities.dp(17.0f);
                if (this.f25381f9 && this.f25534qa != 3) {
                    if (f4()) {
                        f13 = 41.3f;
                    }
                } else {
                    f13 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f13);
                this.f25475m4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Hc, y3());
            } else {
                if (this.f25483md) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f25593u7.isOutOwner()) {
                        i13 = 0;
                    } else {
                        i13 = 6;
                    }
                    this.f25461l4 = AndroidUtilities.dp(i13 + 11) + backgroundDrawableLeft;
                } else {
                    int i18 = this.f25548r8;
                    if (!messageObject.isOutOwner() && !this.f25394g8 && !this.F) {
                        f14 = 17.0f;
                    }
                    this.f25461l4 = AndroidUtilities.dp(f14) + i18 + this.f25448k4;
                }
                int i19 = this.f25500o0 - this.f25490n4;
                if (this.E) {
                    f12 = 9.0f;
                } else {
                    f12 = 10.0f;
                }
                int dp3 = i19 - AndroidUtilities.dp(f12);
                if (this.f25381f9 && this.f25534qa != 3) {
                    if (f4()) {
                        f13 = 41.3f;
                    }
                } else {
                    f13 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f13);
                hg.s0 s0Var = this.J;
                if (!s0Var.f10749s && !s0Var.f10734b) {
                    if (this.f25593u7.type == 9 && this.H == null) {
                        f15 = 10.0f;
                    }
                    i12 = AndroidUtilities.dp(f15) + s0Var.f10746p;
                } else {
                    i12 = 0;
                }
                dp = dp4 - i12;
                this.f25475m4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Hc, y3());
            }
        } else {
            if (s1Var.f25163f0) {
                f10 = s1Var.m0;
                f11 = s1Var.f25200n0;
                imageHeight = s1Var.f25208p0;
            } else {
                ih.z2 z2Var = this.O0;
                float imageX = z2Var.getImageX();
                float imageY = z2Var.getImageY();
                imageHeight = z2Var.getImageHeight();
                f10 = imageX;
                f11 = imageY;
            }
            this.f25461l4 = f10 + AndroidUtilities.dp(5.0f) + this.f25448k4;
            dp = f11 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
            if (textLayoutBlocks == null) {
                i9 = 0;
            } else {
                i9 = -textLayoutBlocks.textHeight();
            }
            this.f25475m4 = AndroidUtilities.lerp(dp5, i9 - AndroidUtilities.dp(4.0f), y3()) + f11;
            z10 = false;
        }
        this.f25461l4 += getExtraTextX();
        MessageObject messageObject2 = this.f25593u7;
        if (messageObject2 != null && (i10 = messageObject2.type) != 0 && i10 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f25593u7.isSponsored()) {
            if (z10 && this.J1) {
                this.f25475m4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f25316b2);
            }
            if (z10) {
                i11 = AndroidUtilities.dp(14.0f) + this.f25316b2;
            } else {
                i11 = 0;
            }
            float f17 = dp - i11;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Y3;
            if (textLayoutBlocks2 != null) {
                i15 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(s1Var);
            }
            this.m0 = (int) ((f17 + AndroidUtilities.lerp(i15, AndroidUtilities.dp(6.0f), y3())) - s1Var.f25182j0);
        }
        MessageObject messageObject3 = this.f25593u7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f25475m4 += this.f25320b6;
        }
    }

    public final void o0() {
        p0(getX(), this.Oc, getMeasuredWidth(), this.Pc);
    }

    public final void o1() {
        float f10;
        float f11;
        int i9;
        int measureText;
        boolean z10;
        if (this.N2) {
            s1(0);
        }
        if (this.N2 && this.K2 == null) {
            this.f25460l3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.Y2;
            if (charSequence == null) {
                int i10 = this.X2;
                if (i10 == 12) {
                    charSequence = LocaleController.getString(R.string.OpenChannelPost);
                } else if (i10 == 1) {
                    charSequence = LocaleController.getString(R.string.OpenChannel);
                } else if (i10 == 29) {
                    charSequence = LocaleController.getString(R.string.OpenChannelDirect);
                } else if (i10 == 13) {
                    charSequence = LocaleController.getString(R.string.SendMessage).toUpperCase();
                } else if (i10 == 32) {
                    charSequence = LocaleController.getString(R.string.OpenProfile).toUpperCase();
                } else if (i10 == 85) {
                    charSequence = LocaleController.getString(R.string.OpenAIStyle);
                } else if (i10 == 10) {
                    charSequence = LocaleController.getString(R.string.OpenBot);
                } else if (i10 == 2) {
                    charSequence = LocaleController.getString(R.string.OpenGroup);
                } else if (i10 == 3) {
                    charSequence = LocaleController.getString(R.string.OpenMessage);
                } else if (i10 == 5) {
                    charSequence = LocaleController.getString(R.string.ViewContact);
                } else if (i10 == 6) {
                    charSequence = LocaleController.getString(R.string.OpenBackground);
                } else if (i10 == 7) {
                    charSequence = LocaleController.getString(R.string.OpenTheme);
                } else if (i10 != 9 && i10 != 11) {
                    if (i10 == 25) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    } else if (i10 == 14) {
                        charSequence = LocaleController.getString(R.string.ViewChatList).toUpperCase();
                    } else if (i10 == 15) {
                        charSequence = LocaleController.getString(R.string.BotWebAppInstantViewOpen).toUpperCase();
                    } else if (i10 == 16) {
                        charSequence = LocaleController.getString(R.string.OpenLink).toUpperCase();
                    } else if (i10 == 17) {
                        charSequence = LocaleController.getString(R.string.ViewStory).toUpperCase();
                    } else if (i10 != 18 && i10 != 22) {
                        if (i10 == 19) {
                            charSequence = LocaleController.getString(R.string.BoostingHowItWork);
                        } else if (i10 == 20) {
                            charSequence = LocaleController.getString(R.string.OpenGift);
                        } else if (i10 == 21) {
                            charSequence = LocaleController.getString(R.string.AppUpdate);
                        } else if (i10 == 23) {
                            charSequence = LocaleController.getString(R.string.OpenStickerSet);
                        } else if (i10 == 24) {
                            charSequence = LocaleController.getString(R.string.OpenEmojiSet);
                        } else if (i10 == 26) {
                            TL_stars.StarGift starGift = this.f25672ze;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.E7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z10 = false;
                                } else {
                                    if (this.f25672ze.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new eq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
                                    charSequence = TextUtils.concat(spannableString, " ", charSequence);
                                }
                            } else {
                                charSequence = LocaleController.getString(R.string.OpenUniqueGift);
                            }
                        } else if (i10 == 27) {
                            charSequence = LocaleController.getString(R.string.JoinCall).toUpperCase();
                        } else if (i10 == 28) {
                            charSequence = LocaleController.getString(R.string.ViewCollection);
                        } else {
                            charSequence = LocaleController.getString(R.string.InstantView);
                        }
                    } else {
                        charSequence = LocaleController.getString(R.string.BoostLinkButton);
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f25593u7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f25593u7.isSponsored() && this.F8 < (measureText = (int) (org.telegram.ui.ActionBar.f6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.F8 = measureText;
            }
            int dp = this.F8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.f6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.K2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.L2 = f10;
            if (this.K2.getLineCount() > 0) {
                f12 = this.K2.getLineLeft(0);
            }
            this.M2 = f12;
            int i11 = this.F8;
            int i12 = this.X2;
            if (i12 != 82 && i12 != 81 && i12 != 80 && i12 != 84 && i12 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.f25460l3 = i11 - AndroidUtilities.dp(f11);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f25500o0;
            this.f25500o0 = dp2;
            if (this.f25593u7.type == 12) {
                this.f25500o0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f25593u7.isSponsored()) {
                this.f25500o0 = AndroidUtilities.dp(2.0f) + this.f25500o0;
            }
            StaticLayout staticLayout2 = this.K2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f25460l3 - Math.ceil(this.K2.getLineWidth(0)))) / 2;
                if (this.X2 == 0) {
                    i9 = AndroidUtilities.dp(8.0f);
                } else {
                    i9 = 0;
                }
                this.f25433j3 = ceil + i9;
                int lineLeft = (int) this.K2.getLineLeft(0);
                this.f25447k3 = lineLeft;
                this.f25433j3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i9) {
        float videoSavedProgress;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f25435j5 > 0.0f) {
            ih.z2 z2Var = this.O0;
            if (z2Var.getVisible()) {
                MessageObject messageObject2 = this.f25593u7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f25593u7.getVideoStartsTimestamp() / ((float) this.f25593u7.getDuration());
                } else {
                    videoSavedProgress = this.f25593u7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = z2Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(z2Var.getImageX(), z2Var.getImageY(), z2Var.getImageX2(), z2Var.getImageY2());
                    } else {
                        if (this.Db == null) {
                            this.Db = new Path();
                            this.Eb = new float[8];
                        }
                        float[] fArr = this.Eb;
                        float max = Math.max(0, roundRadius[0]);
                        fArr[1] = max;
                        fArr[0] = max;
                        float[] fArr2 = this.Eb;
                        float max2 = Math.max(0, roundRadius[1]);
                        fArr2[3] = max2;
                        fArr2[2] = max2;
                        float[] fArr3 = this.Eb;
                        float max3 = Math.max(0, roundRadius[2]);
                        fArr3[5] = max3;
                        fArr3[4] = max3;
                        float[] fArr4 = this.Eb;
                        float max4 = Math.max(0, roundRadius[3]);
                        fArr4[7] = max4;
                        fArr4[6] = max4;
                        this.Db.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(z2Var.getImageX(), z2Var.getImageY(), z2Var.getImageX2(), z2Var.getImageY2());
                        this.Db.addRoundRect(rectF, this.Eb, Path.Direction.CW);
                        canvas.clipPath(this.Db);
                    }
                    org.telegram.ui.ActionBar.f6.f23175n2.setColor(org.telegram.ui.ActionBar.f6.l1(this.f25435j5 * 0.35f, -1));
                    canvas.drawRect(z2Var.getImageX(), z2Var.getImageY2() - AndroidUtilities.dp(3.0f), z2Var.getImageX2(), z2Var.getImageY2(), org.telegram.ui.ActionBar.f6.f23175n2);
                    org.telegram.ui.ActionBar.f6.f23175n2.setColor(org.telegram.ui.ActionBar.f6.l1(this.f25435j5, i9));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(z2Var.getImageX() - AndroidUtilities.dp(2.0f), z2Var.getImageY2() - AndroidUtilities.dp(3.0f), (z2Var.getImageWidth() * clamp01) + z2Var.getImageX(), z2Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23175n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f25483md && this.nd) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f25593u7 != null) {
            int i9 = this.E7;
            MessagesController messagesController = MessagesController.getInstance(i9);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f25593u7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i9).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f25593u7.getDialogId() == clientUserId || this.f25593u7.getDialogId() == 1271266957)) {
                this.Vb = MessagesController.getInstance(i9).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f25593u7.getDialogId() == 489000) {
                long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                if (peerDialogId >= 0) {
                    this.Ub = messagesController.getUser(Long.valueOf(peerDialogId));
                } else {
                    this.Vb = messagesController.getChat(Long.valueOf(-peerDialogId));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.L7) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.Ub = messagesController.getUser(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.Ub = messagesController.getUser(Long.valueOf(j10));
                } else if (peer.channel_id != 0) {
                    if (this.f25593u7.isSavedFromMegagroup()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.Ub = messagesController.getUser(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.Vb = messagesController.getChat(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.Ub = messagesController.getUser(Long.valueOf(peer4.user_id));
                        } else {
                            this.Vb = messagesController.getChat(Long.valueOf(j11));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f25593u7.getDialogId() == clientUserId)) {
                this.Ub = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f25593u7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Ub = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f25593u7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Ub = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f25593u7.getDialogId();
                long fromChatId = this.f25593u7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f25593u7.getDialogId())) {
                    if (this.f25593u7.isOutOwner()) {
                        this.Ub = UserConfig.getInstance(i9).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f25593u7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Ub = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f25593u7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Ub = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f25593u7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Vb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Vb = chat;
                } else {
                    TLRPC.Message message = this.f25593u7.messageOwner;
                    if (message.post) {
                        this.Vb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && imageReceiver == this.O0 && messageObject.isAnimatedSticker()) {
            this.Fc.C1(this.f25593u7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        t1 t1Var;
        float f10;
        float f11;
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.E7).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            messageObject.animateComments = false;
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
            }
        }
        RichMessageLayout richMessageLayout2 = this.Vc.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.attach(this);
        }
        org.telegram.ui.Components.b9 b9Var = this.T3;
        if (b9Var != null) {
            b9Var.g();
        }
        yg.g gVar = this.X5;
        if (gVar != null) {
            gVar.a();
        }
        yg.g gVar2 = this.Y5;
        if (gVar2 != null) {
            gVar2.a();
        }
        ArrayList arrayList = this.U5;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((r1) obj).q();
        }
        MessageObject messageObject2 = this.f25607v7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            t1Var = this;
            t1Var.V3(messageObject2, this.f25620w7, this.f25651y7, this.f25635x7, this.f25665z7, this.A7);
            t1Var.f25607v7 = null;
            t1Var.f25620w7 = null;
        } else {
            t1Var = this;
        }
        CheckBoxBase checkBoxBase = t1Var.f25402h1;
        if (checkBoxBase != null) {
            checkBoxBase.f26308l = true;
        }
        CheckBoxBase checkBoxBase2 = t1Var.f25387g1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26308l = true;
        }
        h11 h11Var = t1Var.f25301a0;
        if (h11Var != null) {
            h11Var.a();
        }
        CheckBoxBase checkBoxBase3 = t1Var.f25637x9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26308l = true;
        }
        if (t1Var.N8 != null) {
            int i10 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = t1Var.N8;
                if (i10 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i10].f26308l = true;
                i10++;
            }
        }
        t1Var.I0 = true;
        float f12 = 0.0f;
        t1Var.f25611ve = 0.0f;
        t1Var.f25600ue = 0.0f;
        t1Var.f25472m1 = 0;
        y4();
        ImageReceiver imageReceiver = t1Var.i9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        E0();
        MessageObject messageObject3 = t1Var.f25593u7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i11 = t1Var.G1;
        if (i11 == 4 && t1Var.f25437j7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(t1Var.f25593u7);
            t1Var.f25659z1 = isPlayingMessage;
            if (isPlayingMessage) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            t1Var.B1 = f11;
            t1Var.A1 = 0;
        } else {
            t1Var.f25659z1 = false;
            t1Var.B1 = 0.0f;
            if ((i11 == 4 || i11 == 2) && t1Var.f25602v1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            t1Var.f25645y1 = f10;
        }
        if (getDelegate() != null && getDelegate().q2() != null) {
            o9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == q22.f24109w) {
                q22.W = t1Var;
            }
        }
        if (t1Var.G1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(t1Var.f25593u7)) {
                f12 = 1.0f;
            }
            t1Var.f25442jd = f12;
        }
        hg.s0 s0Var = t1Var.J;
        ArrayList arrayList2 = s0Var.v;
        s0Var.G = true;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ((hg.p0) arrayList2.get(i12)).a();
        }
        FlagSecureReason flagSecureReason = t1Var.f25312ad;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        k4 k4Var = t1Var.B7;
        if (k4Var != null) {
            ArrayList arrayList3 = k4Var.f24592c;
            if (!k4Var.C) {
                k4Var.C = true;
                dh.k kVar = k4Var.f24599l;
                if (kVar != null) {
                    kVar.b(k4Var.f24590a);
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    j4 j4Var = (j4) arrayList3.get(i13);
                    if (!j4Var.I) {
                        j4Var.I = true;
                        j4Var.f24556f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = t1Var.f25593u7;
        if (messageObject4 != null && messageObject4.type == 20 && t1Var.Ib != null) {
            invalidate();
        }
        org.telegram.ui.Components.i5 i5Var = t1Var.f25325bc;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = t1Var.f25340cc;
        if (i5Var2 != null) {
            i5Var2.a();
        }
        dh.k kVar2 = t1Var.Bb;
        if (kVar2 != null) {
            if (kVar2.f4608i) {
                dh.k w32 = w3();
                t1Var.Bb = w32;
                Integer num = t1Var.Cb;
                if (num != null) {
                    w32.f4610k.put(this, num);
                }
            } else {
                kVar2.a(this);
            }
        }
        o0 o0Var = t1Var.v;
        if (o0Var != null) {
            ArrayList arrayList4 = o0Var.f24801q;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((n0) arrayList4.get(i14)).a();
            }
        }
        jw0 jw0Var = t1Var.f25302a1;
        if (jw0Var != null) {
            for (int i15 = 0; i15 < jw0Var.f29859b; i15++) {
                jw0Var.f29860c[i15].a(this);
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
        int i9 = this.E7;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.userInfoDidLoad);
        AnimatorSet animatorSet = this.C7;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C7 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.f25402h1;
        if (checkBoxBase != null) {
            checkBoxBase.f26308l = false;
        }
        yg.g gVar = this.X5;
        if (gVar != null) {
            gVar.f50226b.onDetachedFromWindow();
            gVar.f50236x.f();
        }
        yg.g gVar2 = this.Y5;
        if (gVar2 != null) {
            gVar2.f50226b.onDetachedFromWindow();
            gVar2.f50236x.f();
        }
        ff.q qVar = this.f25575t4;
        if (qVar != null) {
            qVar.b();
            this.f25575t4 = null;
        }
        RichMessageLayout richMessageLayout = this.f25593u7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        s1 s1Var = this.Vc;
        RichMessageLayout richMessageLayout2 = s1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.U5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r1) obj).r();
        }
        org.telegram.ui.Components.b9 b9Var = this.T3;
        if (b9Var != null) {
            b9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f25387g1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26308l = false;
        }
        if (this.N8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.N8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f26308l = false;
                i11++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.f25637x9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26308l = false;
        }
        this.I0 = false;
        k4 k4Var = this.B7;
        if (k4Var != null) {
            k4Var.e();
        }
        this.i9.onDetachedFromWindow();
        h11 h11Var = this.f25301a0;
        if (h11Var != null) {
            h11Var.b();
        }
        E0();
        if (this.C4 && this.A4 != null && this.B4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.A4);
            this.C4 = false;
        }
        jw0 jw0Var = this.f25302a1;
        if (jw0Var != null) {
            jw0Var.a(this);
        }
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().q2() != null) {
            o9 q22 = getDelegate().q2();
            q22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == q22.f24109w) {
                q22.W = null;
            }
        }
        s1Var.f25231v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
            org.telegram.ui.ActionBar.f6.x0().f27678i = null;
        }
        ValueAnimator valueAnimator = this.f25414hd;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25414hd.cancel();
        }
        this.J.q();
        this.f25399gd = false;
        FlagSecureReason flagSecureReason = this.f25312ad;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.i5 i5Var = this.f25325bc;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f25340cc;
        if (i5Var2 != null) {
            i5Var2.b();
        }
        dh.k kVar = this.Bb;
        if (kVar != null) {
            kVar.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f24801q;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                n0 n0Var = (n0) arrayList2.get(i12);
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f24732c;
                    if (i13 < imageReceiverArr.length) {
                        imageReceiverArr[i13].onDetachedFromWindow();
                        i13++;
                    }
                }
            }
        }
        ff.k.d().g(this.f25385fe);
    }

    @Override
    public void onDraw(Canvas canvas) {
        S1(canvas);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        boolean z11;
        int i9 = this.G1;
        if (i9 != 3 && i9 != 5) {
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
        int i9 = 0;
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f25470ld;
                if (i9 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i9)).contains(x10, z22)) {
                    int keyAt = sparseArray.keyAt(i9);
                    if (keyAt != this.f25671zd) {
                        this.f25671zd = keyAt;
                        I3(keyAt, 32768, null);
                        return true;
                    }
                    return true;
                } else {
                    i9++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.f25671zd = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        t1 t1Var;
        int i11;
        MessageObject messageObject = this.f25593u7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.R4 == AndroidUtilities.displaySize.y)) {
            t1Var = this;
        } else {
            this.f25601v0 = true;
            MessageObject messageObject2 = this.f25593u7;
            this.f25593u7 = null;
            t1Var = this;
            t1Var.X3(messageObject2, this.G, this.B, this.A, this.C, false);
            t1Var.f25601v0 = false;
        }
        w4();
        int i12 = t1Var.R + t1Var.f25314b0 + t1Var.f25343d0 + t1Var.f25500o0 + t1Var.f25524q0 + t1Var.W;
        pg.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(t1Var.f25593u7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f45839a.getHeight() - draftMessageMeasureController.f45839a.getPaddingTop()) - draftMessageMeasureController.f45839a.getPaddingBottom()) - draftMessageMeasureController.d) - i12);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f45842e = z10;
            if (draftMessageMeasureController.f45840b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i11 = max + i12;
        } else {
            i11 = i12;
        }
        t1Var.f25429ie = Math.max(0, i11 - i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), i11);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f25593u7.loadedFileSize = j10;
        p1(j10, j11);
        if (this.f25572t1) {
            this.L0.o(min, true);
        } else {
            this.K0.o(min, true);
        }
        int i9 = this.G1;
        if (i9 != 3 && i9 != 5) {
            if (this.S4 != 0) {
                if (this.T4 != 1) {
                    m4(false, false, false);
                }
            } else if (this.K4 != 1) {
                m4(false, false, false);
            }
        } else if (this.S4 != 0) {
            if (this.T4 != 1) {
                m4(false, false, false);
            }
        } else if (this.K4 != 4) {
            m4(false, false, false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i9;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f25593u7.loadedFileSize = j10;
        RadialProgress2 radialProgress2 = this.K0;
        radialProgress2.o(min, true);
        if (j10 == j11 && ((this.H != null || this.f25593u7.isPaid()) && SendMessagesHelper.getInstance(this.E7).isSendingMessage(this.f25593u7.getId()) && ((i9 = this.K4) == 1 || (i9 == 4 && this.G1 == 5)))) {
            this.M0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f25587u1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f25587u1 = j11;
        }
        p1(j10, j11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f25507o8 && Build.VERSION.SDK_INT >= 23) {
            MessageObject messageObject = this.f25593u7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f25593u7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f25593u7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f25593u7.caption);
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

    public final void p0(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.Ed;
        if (b6Var != null) {
            b6Var.o(f10, f11 + this.R + this.f25314b0 + this.f25343d0, i9, i10);
        } else {
            org.telegram.ui.ActionBar.f6.q(f10, f11 + this.R + this.f25314b0 + this.f25343d0, i9, i10);
        }
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.p1(long, long):void");
    }

    public final void p2(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10) {
        boolean z11;
        float f14;
        float f15;
        float f16;
        double d;
        boolean z12;
        boolean z13;
        boolean z14;
        Drawable L2;
        float f17;
        boolean z15;
        s1 s1Var;
        float f18;
        float f19;
        float f20;
        boolean z16;
        boolean z17;
        String str;
        Drawable L22;
        float n10;
        float f21;
        String str2;
        Drawable L23;
        if (f13 != 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f22 = (f13 * 0.5f) + 0.5f;
        float f23 = f10 * f13;
        hg.s0 s0Var = this.J;
        if (s0Var.f10734b) {
            f14 = s0Var.j(1.0f);
        } else {
            f14 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.f6.T2.getAlpha();
        float N2 = N2(f11);
        StaticLayout staticLayout = this.Rb;
        s1 s1Var2 = this.Vc;
        if (staticLayout == null && !s1Var2.F) {
            s1Var = s1Var2;
            z15 = z11;
            f18 = f23;
            f15 = 10.0f;
            f19 = 2.0f;
            d = 1.0d;
        } else {
            boolean z18 = s1Var2.f25173h1;
            f15 = 10.0f;
            if (z18) {
                f16 = this.f25497nb;
            } else {
                f16 = f12;
            }
            float f24 = f16 + f14;
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
            if ((!this.f25483md || !s1Var2.l1) && z18 && !z12) {
                if (z13) {
                    f24 = s1Var2.I;
                } else {
                    float f25 = s1Var2.I;
                    float f26 = s1Var2.K1;
                    f24 = (f24 * f26) + ((1.0f - f26) * f25);
                }
            }
            MessageObject.GroupedMessages groupedMessages = this.G;
            if (groupedMessages != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                if (transitionParams.backgroundChangeBounds) {
                    f24 += transitionParams.offsetRight;
                }
            }
            if (s1Var2.f25235w0) {
                f24 += this.f25611ve;
            }
            if (f4()) {
                if (this.f25593u7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.f6.f22963b4;
                }
            } else if (!this.f25593u7.isOutOwner()) {
                if (z10) {
                    L2 = org.telegram.ui.ActionBar.f6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.f6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float n11 = a0.n(L2, f24, N2, org.telegram.ui.ActionBar.f6.T2.getTextSize());
            if (z12) {
                f17 = s1Var2.K1 * f23;
            } else if (z13) {
                f17 = (1.0f - s1Var2.K1) * f23;
            } else {
                f17 = f23;
            }
            L2.setAlpha((int) (f17 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f22, f22, j3.r0.c(AndroidUtilities.dp(3.0f) + n11, this.Sb, 2.0f, f24), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (s1Var2.F) {
                if (z14) {
                    canvas.save();
                    f18 = f23;
                    f19 = 2.0f;
                    org.telegram.ui.ActionBar.f6.T2.setAlpha((int) ((1.0d - s1Var2.K1) * alpha));
                    canvas.translate(f24 + n11 + AndroidUtilities.dp(3.0f), N2);
                    s1Var = s1Var2;
                    s1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    s1Var = s1Var2;
                    f18 = f23;
                    f19 = 2.0f;
                }
                org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (alpha * f17));
            } else {
                s1Var = s1Var2;
                f18 = f23;
                f19 = 2.0f;
            }
            canvas.save();
            canvas.translate(f24 + n11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Rb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = s1Var.H;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.Rb != null) {
                f14 += n11 + this.Sb + AndroidUtilities.dp(10.0f);
            }
            if (z15) {
                canvas.restore();
            }
            if (s1Var.F) {
                org.telegram.ui.ActionBar.f6.T2.setAlpha(alpha);
            }
            s1Var.J = f24;
        }
        if (this.Ob != null) {
            boolean z20 = s1Var.f25173h1;
            if (z20) {
                f21 = this.f25497nb;
            } else {
                f21 = f12;
            }
            float f27 = f21 + f14;
            if ((!this.f25483md || !s1Var.l1) && z20) {
                float f28 = s1Var.K;
                float f29 = s1Var.K1;
                f27 = (f27 * f29) + ((1.0f - f29) * f28);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.G;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f27 += transitionParams2.offsetRight;
                }
            }
            if (s1Var.f25235w0) {
                f27 += this.f25611ve;
            }
            if (f4()) {
                if (this.f25593u7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.f6.f22944a4;
                }
            } else if (!this.f25593u7.isOutOwner()) {
                if (z10) {
                    L23 = org.telegram.ui.ActionBar.f6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.f6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float n12 = a0.n(L23, f27, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.f6.T2.getTextSize() - AndroidUtilities.dp(f19));
            if (z15) {
                canvas.save();
                canvas.scale(f22, f22, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Pb) / f19) + f27, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f18 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (s1Var.f25155d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.f6.T2.setAlpha((int) ((d - s1Var.K1) * alpha));
                canvas.translate(f27 + n12 + AndroidUtilities.dp(3.0f), N2);
                dh.l.f(canvas, s1Var.f25155d2);
                canvas.restore();
                org.telegram.ui.ActionBar.f6.T2.setAlpha((int) (alpha * s1Var.K1));
            }
            canvas.save();
            canvas.translate(f27 + n12 + AndroidUtilities.dp(3.0f), N2);
            dh.l.f(canvas, this.Ob);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f14 += this.Pb + n12 + AndroidUtilities.dp(f15);
            if (s1Var.f25155d2 != null) {
                org.telegram.ui.ActionBar.f6.T2.setAlpha(alpha);
            }
            s1Var.L = f27;
        }
        boolean z21 = this.U7;
        if (!z21 && !s1Var.B) {
            return;
        }
        boolean z22 = s1Var.f25173h1;
        if (z22) {
            f20 = this.f25497nb;
        } else {
            f20 = f12;
        }
        float f30 = f20 + f14;
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
        if (!this.f25483md && z22 && !z16) {
            if (z17) {
                f30 = s1Var.D;
            } else {
                float f31 = s1Var.D;
                float f32 = s1Var.K1;
                f30 = (f30 * f32) + ((1.0f - f32) * f31);
            }
        }
        MessageObject.GroupedMessages groupedMessages3 = this.G;
        if (groupedMessages3 != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
            if (transitionParams3.backgroundChangeBounds) {
                f30 += transitionParams3.offsetRight;
            }
        }
        if (s1Var.f25235w0) {
            f30 += this.f25611ve;
        }
        if (f4()) {
            if (this.f25593u7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.f6.Z3;
            }
        } else if (!this.f25593u7.isOutOwner()) {
            if (z10) {
                L22 = org.telegram.ui.ActionBar.f6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.f6.U3;
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
            if (this.U7) {
                L22.setAlpha((int) (f18 * 255.0f * s1Var.K1));
                n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.f6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - s1Var.K1) * f18 * 255.0f));
                n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.f6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f18 * 255.0f));
            n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.f6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
        }
        if (z15) {
            canvas.save();
            canvas.scale(f22, f22, (n10 / f19) + f30, L22.getBounds().centerY());
        }
        L22.draw(canvas);
        L22.setAlpha(255);
        if (z15) {
            canvas.restore();
        }
        s1Var.C = f30;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f25312ad == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new ia(this, 3));
                this.f25312ad = flagSecureReason;
                if (this.I0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f25312ad;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        t1 t1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        k1 k1Var = this.Fc;
        int i10 = 0;
        if (k1Var != null && k1Var.n2(i9)) {
            return false;
        }
        if (i9 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f25593u7.type == 16) {
                this.Fc.E0(this, this.O4, this.P4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i9 == R.id.acc_action_small_button) {
            w1();
        } else if (i9 == R.id.acc_action_msg_options) {
            k1 k1Var2 = this.Fc;
            if (k1Var2 != null) {
                if (this.f25593u7.type == 16) {
                    k1Var2.s0(this, 0.0f, 0.0f);
                } else {
                    k1Var2.E0(this, this.O4, this.P4);
                }
            }
        } else {
            if (i9 == R.id.acc_action_open_forwarded_origin) {
                k1 k1Var3 = this.Fc;
                if (k1Var3 != null) {
                    TLRPC.Chat chat = this.fc;
                    if (chat != null) {
                        t1Var = this;
                        k1Var3.Z(t1Var, chat, this.f25593u7.messageOwner.fwd_from.channel_post, this.f25329c1, this.f25344d1, false);
                    } else {
                        t1Var = this;
                        TLRPC.User user = t1Var.f25354dc;
                        if (user != null) {
                            k1Var3.u0(this, user, t1Var.f25329c1, t1Var.f25344d1);
                        } else if (t1Var.f25398gc != null) {
                            k1Var3.r(this);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (i9 == R.id.acc_action_summarize) {
                    k1 k1Var4 = t1Var.Fc;
                    if (k1Var4 != null) {
                        k1Var4.I0(this);
                    }
                } else if (i9 == R.id.acc_action_copy_code && t1Var.Fc != null && (arrayList = t1Var.f25593u7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                        i10++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            t1Var.Fc.P(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!t1Var.f25593u7.isVoice() || t1Var.f25593u7.isRoundVideo() || (t1Var.f25593u7.isMusic() && MediaController.getInstance().isPlayingMessage(t1Var.f25593u7))) && t1Var.E5.g(null, i9, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i9, bundle);
        }
        t1Var = this;
        if (!t1Var.f25593u7.isVoice()) {
        }
        return true;
    }

    public final void q0(int i9, int i10, int i11) {
        int lastLineWidth;
        RichMessageLayout richMessageLayout;
        int i12;
        int i13;
        if (this.f25593u7.isSponsored()) {
            this.F8 = AndroidUtilities.dp(31.0f) + i11;
            return;
        }
        hg.s0 s0Var = this.J;
        if (!s0Var.f10749s && !s0Var.f10734b) {
            lastLineWidth = s0Var.f10751u;
        } else {
            lastLineWidth = this.f25593u7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!s0Var.f10749s && !s0Var.f10734b) {
            z10 = (i9 - lastLineWidth < i10 || this.f25593u7.hasRtl) ? true : true;
            if (this.f25388g2) {
                this.f25500o0 = AndroidUtilities.dp(14.0f) + this.f25500o0;
            }
        } else if ((!this.f25512p1 && ((this.f25345d2 && !this.f25593u7.isSponsored()) || this.J1 || this.f25359e2 || this.f25374f2 || this.f25388g2)) || i9 - lastLineWidth < i10 || this.f25593u7.hasRtl) {
            z10 = true;
        }
        if (this.f25593u7.isUnsupported()) {
            z10 = true;
        }
        if ((s0Var.f10749s || s0Var.f10734b) && (richMessageLayout = this.f25593u7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f25593u7;
        if ((messageObject.hasCodeAtBottom && (s0Var.f10749s || s0Var.f10734b)) || ((messageObject.hasQuoteAtBottom && (s0Var.f10749s || s0Var.f10734b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i12 = 18;
            z10 = true;
        } else {
            i12 = 14;
        }
        if (z10) {
            this.f25500o0 = AndroidUtilities.dp(i12) + this.f25500o0;
            this.G8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i11, lastLineWidth);
            this.F8 = dp;
            if (this.f25593u7.isOutOwner()) {
                i13 = AndroidUtilities.dp(17.0f) + this.f25468lb;
            } else {
                i13 = this.f25468lb;
            }
            this.F8 = org.telegram.messenger.l0.z(31.0f, i13, dp);
            return;
        }
        int extraTextX = (i11 - getExtraTextX()) - lastLineWidth;
        if (extraTextX >= 0 && extraTextX <= i10) {
            this.F8 = AndroidUtilities.dp(31.0f) + ((i11 + i10) - extraTextX);
        } else {
            this.F8 = AndroidUtilities.dp(31.0f) + Math.max(i11, lastLineWidth + i10);
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
            p1(this.f25593u7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f11;
        boolean z10;
        int i9;
        int i10;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.K0;
            RectF rectF = radialProgress2.f26468a;
            Paint paint = radialProgress2.f26473g;
            b90 b90Var = radialProgress2.f26474i;
            RectF rectF2 = radialProgress2.f26468a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f10) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f10) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                d5Var = this.f25532q8;
            } else {
                d5Var = this.f25518p8;
            }
            b90Var.B = d5Var;
            radialProgress2.f26475j.B = d5Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.V0 == null) {
                Paint paint2 = new Paint(1);
                this.V0 = paint2;
                f11 = 1.0f;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                f11 = 1.0f;
            }
            if (f10 < f11) {
                canvas2.save();
                float f12 = f11 - f10;
                float f13 = 0.7f * f12;
                canvas2.scale(f13, f13, rectF2.centerX(), AndroidUtilities.lerp(rectF2.top, rectF2.bottom, 0.5f));
                if (this.W0 == null) {
                    mi0 mi0Var = new mi0(R.raw.fire_once, "fire_once", AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.W0 = mi0Var;
                    mi0Var.f30863r0 = this;
                    mi0Var.H(true);
                    this.W0.I(1);
                    this.W0.start();
                }
                this.W0.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.X0 == null) {
                    i9 = 1;
                    this.X0 = new Paint(1);
                } else {
                    i9 = 1;
                }
                if (this.Y0 == null) {
                    Paint paint3 = new Paint(i9);
                    this.Y0 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.Z0 == null) {
                    Paint paint4 = new Paint(i9);
                    this.Z0 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i11 = radialProgress2.f26486u;
                if (i11 >= 0) {
                    i10 = org.telegram.ui.ActionBar.f6.v0(i11, this.Ed);
                } else {
                    i10 = radialProgress2.f26479n;
                }
                this.X0.setColor(i10);
                this.Z0.setColor(i10);
                b90Var.a(false);
                this.X0.setShader(b90Var.d.getShader());
                this.Z0.setShader(b90Var.d.getShader());
                rectF3.set(this.W0.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                rectF3.inset(1.0f, 1.0f);
                canvas2.drawRect(rectF3, this.X0);
                this.W0.o(canvas, this.Y0, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.Z0.setAlpha((int) (255.0f * f12));
                this.Z0.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.Y4;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                rn0 rn0Var = this.D5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - rn0Var.K) * (-360.0f), false, this.Z0);
                if (this.O6 == null) {
                    this.O6 = new d11();
                }
                this.O6.a((1.0f - rn0Var.K) * (-360.0f), f12, canvas, this.Z0, rectF4);
                canvas2 = canvas;
            } else {
                mi0 mi0Var2 = this.W0;
                if (mi0Var2 != null) {
                    mi0Var2.A(true);
                    this.W0 = null;
                    if (this.O6 != null) {
                        this.O6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f10 * 1.5f) + 10.0f) * f10, this.V0);
            canvas2.restore();
            if (this.U0 == null) {
                kh.l lVar = new kh.l(3);
                this.U0 = lVar;
                lVar.e(-1, 0, 0);
                kh.l lVar2 = this.U0;
                lVar2.f15565i = 14.0f;
                lVar2.c(10.0f);
                this.U0.f15559a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z10 = true;
                this.U0.d(1, false, false);
                this.U0.f15566j = -AndroidUtilities.dpf2(0.33f);
                this.U0.f15567k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = true;
            }
            kh.l lVar3 = this.U0;
            lVar3.f15565i = f10 * 14.0f;
            lVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f10, paint);
            kh.l lVar4 = this.U0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z10 = false;
            }
            lVar4.b(z10);
            kh.l lVar5 = this.U0;
            lVar5.f15570n = cos;
            lVar5.f15571o = sin;
            lVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.C8 && (messageObject = this.f25593u7) != null && !messageObject.isOutOwner() && this.H == null) {
            return true;
        }
        return false;
    }

    public final void q4() {
        boolean z10;
        String formatShortDuration;
        double d;
        double d9;
        double d10;
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            g1 g1Var = this.Dd;
            if (g1Var != null && g1Var.rewindCount != 0 && g1Var.rewindByBackSeek) {
                messageObject.audioProgress = g1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f25593u7.isPoll()) {
                yg.g gVar = this.X5;
                if (gVar != null) {
                    gVar.n(true);
                }
                yg.g gVar2 = this.Y5;
                if (gVar2 != null) {
                    gVar2.n(true);
                }
            }
            int i9 = this.G1;
            double d11 = 0.0d;
            e1 e1Var = this.C5;
            if (i9 == 4) {
                if (e1Var != null) {
                    e1Var.a();
                }
                if (this.f25528q4 == null || (!PhotoViewer.J1(this.f25593u7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f25593u7))) {
                    org.telegram.ui.Components.x5 animation = this.O0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f25593u7;
                        int i10 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i10;
                        d10 = i10;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f25593u7.isVideo() && animation.s()) {
                            this.Fc.U(this.f25593u7);
                        }
                    } else {
                        d10 = 0.0d;
                    }
                    if (d10 == 0.0d) {
                        d10 = this.f25593u7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                        d10 -= this.f25593u7.audioProgress * d10;
                    } else if (animation != null) {
                        if (d10 != 0.0d) {
                            d10 -= animation.o() / 1000;
                        }
                        if (this.Fc != null && animation.o() >= 3000) {
                            this.Fc.B0();
                        }
                    }
                    if (this.M5 != d10) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d10);
                        this.f25617w4 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.C2.measureText(formatShortDuration2));
                        this.f25528q4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.f6.C2, this.f25617w4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.M5 = d10;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f25483md;
            rn0 rn0Var = this.D5;
            int i11 = 0;
            if (z12) {
                if (this.B5) {
                    if (!rn0Var.f32213f) {
                        rn0Var.g(this.f25593u7.audioProgress, true);
                    }
                } else {
                    if (!e1Var.f30490e) {
                        e1Var.i(this.f25593u7.audioProgress);
                        e1Var.f30501q = this.f25593u7.bufferedProgress;
                    }
                    e1Var.a();
                }
                TLRPC.Document document = this.f25593u7.getDocument();
                if (document != null) {
                    while (i11 < document.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                            d9 = documentAttribute.duration;
                            break;
                        }
                        i11++;
                    }
                }
                d9 = 0.0d;
                long j10 = this.Td;
                if (j10 >= 0) {
                    d9 = j10;
                } else if (MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                    d9 = Math.max(0.0d, d9 - this.f25593u7.audioProgressSec);
                }
                if (this.M5 != d9) {
                    this.M5 = d9;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d9);
                    this.N5 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.T2.measureText(formatLongDuration));
                    this.L5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.f6.T2, this.N5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.f25593u7.audioProgress;
                if (f10 != 0.0f) {
                    this.f25656yd = f10;
                    if (f10 > 0.9f) {
                        this.f25656yd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.H1 != null) {
                if (this.B5) {
                    if (!rn0Var.f32213f) {
                        rn0Var.g(this.f25593u7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!e1Var.f30490e) {
                        e1Var.i(this.f25593u7.audioProgress);
                        e1Var.f30501q = this.f25593u7.bufferedProgress;
                    }
                    e1Var.k(this.f25593u7);
                    z10 = false;
                }
                int i12 = this.G1;
                if (i12 == 5) {
                    z10 = true;
                }
                if (i12 == 3) {
                    long j11 = this.Td;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                        while (true) {
                            if (i11 >= this.H1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.H1.attributes.get(i11);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d11 = documentAttribute2.duration;
                                break;
                            }
                            i11++;
                        }
                        d = d11;
                    } else {
                        d = this.f25593u7.audioProgressSec;
                    }
                    if (this.M5 != d) {
                        this.M5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.N5 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.N2.measureText(formatLongDuration2));
                        this.L5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.f6.N2, this.N5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f25593u7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                        i11 = this.f25593u7.audioProgressSec;
                    }
                    double d12 = i11;
                    if (this.M5 != d12) {
                        this.M5 = d12;
                        this.L5 = new StaticLayout(AndroidUtilities.formatShortDuration(i11, (int) duration), org.telegram.ui.ActionBar.f6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.f6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z11 = z10;
                }
                if (z11) {
                    invalidate();
                }
            }
        }
    }

    public final void r0() {
        if (this.f25593u7.type == 20 && this.Ib != null) {
            ih.z2 z2Var = this.O0;
            this.Gb = e2.c.A(z2Var.getImageWidth(), this.Ib.getWidth(), 2.0f, this.f25548r8);
            this.Hb = e2.c.A(z2Var.getImageHeight(), this.Ib.getHeight(), 2.0f, z2Var.getImageY() + this.f25579t8);
        }
    }

    public final void r1(int i9) {
        CheckBoxBase[] checkBoxBaseArr = this.N8;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i9) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = this.N8;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].f26308l = false;
                    i10++;
                }
            }
            this.N8 = new CheckBoxBase[i9];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = this.N8;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, this, this.Ed);
                this.N8[i11].k(false);
                this.N8[i11].j(true);
                this.N8[i11].d(9);
                i11++;
            }
        }
        if (this.J8 == null) {
            this.J8 = new org.telegram.ui.Components.e9(this.E7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(m1 m1Var, f80 f80Var, Layout layout, int i9) {
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) layout.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= characterStyleArr.length) {
                    break;
                } else if (characterStyleArr[i10] == this.f25663z5) {
                    m1Var.f24687b = i9;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (m1Var.f24687b != i9) {
            return false;
        }
        f80Var.rewind();
        int spanStart = spanned.getSpanStart(this.f25663z5);
        int spanEnd = spanned.getSpanEnd(this.f25663z5);
        f80Var.f30219c = true;
        f80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, f80Var);
        f80Var.a();
        this.f25633x5.k();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f25601v0) {
            return;
        }
        super.requestLayout();
    }

    public final int s0() {
        if (this.f25525q1) {
            return 4;
        }
        return 8;
    }

    public final void s1(int i9) {
        int i10;
        int v02;
        dl0 dl0Var;
        dl0 dl0Var2;
        int i11;
        int i12;
        int i13;
        if (this.f25593u7.isUnsupported()) {
            if (this.f25593u7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.f6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.f6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.f6.v0(i13, this.Ed);
        } else if (i9 == 0 && this.f25393g7) {
            if (this.f25593u7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.f6.Ra;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.f23357xc;
            }
            v02 = org.telegram.ui.ActionBar.f6.v0(i11, this.Ed);
        } else if (i9 == 0 && (dl0Var2 = this.W9) != null) {
            v02 = dl0Var2.h();
        } else if (i9 == 0 && (dl0Var = this.Y9) != null) {
            v02 = dl0Var.h();
        } else {
            if (this.f25593u7.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.f6.Xa;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.f6.v0(i10, this.Ed);
        }
        Drawable[] drawableArr = this.f25543r3;
        Drawable drawable = drawableArr[i9];
        if (drawable == null) {
            h1 h1Var = new h1(i9, this);
            n1[] n1VarArr = this.f25559s3;
            n1VarArr[i9] = h1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f25593u7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.f6.Xa;
            } else {
                i12 = org.telegram.ui.ActionBar.f6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.f6.v0(i12, this.Ed)}), null, n1VarArr[i9]);
            drawableArr[i9] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.f6.B1(drawable, v02 & 436207615, true);
        }
        drawableArr[i9].setVisible(true, false);
    }

    public final boolean s2(m1 m1Var, f80 f80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (r2(m1Var, f80Var, ((MessageObject.TextLayoutBlock) arrayList.get(i9)).textLayout, i9)) {
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
        if (this.M0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f25322b8 && !this.f25307a8 && !isPressed()) || (this.I1 && this.O0.hasBitmapImage())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.L4 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        RadialProgress2 radialProgress2 = this.K0;
        radialProgress2.n(z11, false);
        if (this.S4 != 0) {
            if (!z10 && this.N4 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            radialProgress2.n(z12, true);
        }
        if (!z10 && this.M4 == 0) {
            z13 = false;
        }
        this.L0.n(z13, false);
    }

    public void setAllowAssistant(boolean z10) {
        this.f25507o8 = z10;
    }

    @Override
    public void setAlpha(float f10) {
        boolean z10;
        boolean z11 = false;
        if (f10 == 1.0f) {
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
        if (this.Tc) {
            this.Uc = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f25627x && !this.f25593u7.isVoice()) || this.f25653y9 == null || this.f25667z9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.H;
            if (groupedMessagePosition2 != null) {
                int i9 = groupedMessagePosition2.flags;
                if ((i9 & 8) == 0 || (i9 & 1) == 0) {
                    return;
                }
            }
            if (this.J.f10734b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.f25611ve != f10) {
            this.f25611ve = f10;
            y4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f25452k8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.i9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Ub;
                int i9 = this.E7;
                org.telegram.ui.Components.z8 z8Var = this.f25439j9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.Wb = userProfilePhoto.photo_small;
                    } else {
                        this.Wb = null;
                    }
                    z8Var.m(i9, user);
                    imageReceiver.setForUserOrChat(this.Ub, z8Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Vb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.Wb = chatPhoto.photo_small;
                    } else {
                        this.Wb = null;
                    }
                    if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId >= 0) {
                            TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            z8Var.m(i9, user2);
                            imageReceiver.setForUserOrChat(user2, z8Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        z8Var.k(i9, chat2);
                        imageReceiver.setForUserOrChat(chat2, z8Var);
                        return;
                    }
                    z8Var.k(i9, this.Vb);
                    imageReceiver.setForUserOrChat(this.Vb, z8Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", z8Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.Wb = null;
                    z8Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, z8Var, null, null, 0);
                    return;
                }
            }
            this.Wb = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(k1 k1Var) {
        this.Fc = k1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f25373f1 != z10) {
            this.f25373f1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f25627x = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.E0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.f25519pa != z10) {
            this.f25519pa = z10;
            boolean z11 = this.F7;
            this.F7 = true;
            invalidate();
            this.F7 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f25322b8 != z10) {
            this.f25322b8 = z10;
            if (z10) {
                this.f25303a4 = null;
            }
            if (!z10) {
                this.f25380f8 = System.currentTimeMillis();
                this.f25336c8 = true;
                this.f25351d8 = 300;
            } else {
                this.f25336c8 = false;
                this.f25351d8 = 0;
            }
            s4();
            if (this.B5) {
                this.D5.f32221o = f3();
            } else {
                this.C5.f30500p = f3();
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
        this.f25415he = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.f25416i0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.F7 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.J0 = true;
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.f25400ge = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        s4();
        if (this.B5) {
            this.D5.f32221o = f3();
        } else {
            this.C5.f30500p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.Ed = b6Var;
        RadialProgress2 radialProgress2 = this.K0;
        if (radialProgress2 != null) {
            radialProgress2.F = b6Var;
        }
        RadialProgress2 radialProgress22 = this.L0;
        if (radialProgress22 != null) {
            radialProgress22.F = b6Var;
        }
        hl0 hl0Var = this.O3;
        if (hl0Var != null) {
            hl0Var.f29122n = b6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.J.C = num;
    }

    public void setSelectedBackgroundProgress(float f10) {
        this.Mc = f10;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.f25499ne != z10) {
            this.f25499ne = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f10) {
        if (this.f25600ue != f10) {
            this.f25600ue = f10;
            y4();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.Hd;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((dh.l) arrayList.get(i9)).invalidateSelf();
            i9++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.Y3.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.Y3.textLayoutBlocks.get(i10);
                for (int i11 = 0; i11 < textLayoutBlock.spoilers.size(); i11++) {
                    textLayoutBlock.spoilers.get(i11).invalidateSelf();
                }
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            for (int i12 = 0; i12 < getMessageObject().textLayoutBlocks.size(); i12++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = getMessageObject().textLayoutBlocks.get(i12);
                for (int i13 = 0; i13 < textLayoutBlock2.spoilers.size(); i13++) {
                    textLayoutBlock2.spoilers.get(i13).invalidateSelf();
                }
            }
        }
    }

    public void setTimeAlpha(float f10) {
        this.f25421i5 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final boolean t0(MotionEvent motionEvent) {
        k1 k1Var;
        if (this.La == null || (k1Var = this.Fc) == null || !k1Var.f()) {
            return false;
        }
        boolean contains = this.Ma.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Na == null) {
            this.Na = new pc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Na.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Na.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Na.h) {
                this.Fc.b2(this);
            }
            this.Na.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Na.c(false);
        }
        return this.Na.h;
    }

    public final void t1(int i9, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if ((i10 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i9 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i9 & 2) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((i9 & 4) == 0 && z14 && z12 && !z13 && z11) {
            z15 = true;
        }
        if (this.Vc.h && !z15) {
            return;
        }
        this.f25384fd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25414hd = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f25414hd.setInterpolator(gr.f28844f);
        this.f25369ed = i9;
        this.f25355dd = i10;
        this.f25414hd.addUpdateListener(new hg.y(3, this, z10));
        this.f25414hd.addListener(new hg.b0(21, this, z10));
        this.f25399gd = true;
        this.f25414hd.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f25607v7;
        if (messageObject == null) {
            messageObject = this.f25593u7;
        }
        MessageObject messageObject2 = messageObject;
        this.f25593u7 = null;
        X3(messageObject2, this.G, this.B, this.A, this.C, false);
    }

    public final int t3(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t3(int):int");
    }

    public final void t4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t4():void");
    }

    public final boolean u0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.u0(android.view.MotionEvent):boolean");
    }

    public final void u1() {
        MessageObject messageObject;
        k1 k1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f25593u7.hasMediaSpoilers() && !this.f25593u7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f25593u7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Fc != null && messageObject2.isSensitive()) {
                    this.Fc.J(this);
                    return;
                } else {
                    i4(this.f25329c1, this.f25344d1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f25593u7;
        int i9 = messageObject3.type;
        int i10 = 0;
        if (i9 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f25593u7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i10);
                        i10++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Fc.Q0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i9 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f25593u7;
            int i11 = messageObject4.type;
            if (i11 == 12) {
                long j10 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j10 != 0) {
                    user = MessagesController.getInstance(this.E7).getUser(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Fc.u0(this, user, this.f25329c1, this.f25344d1);
            } else if (i11 == 5) {
                if (this.K4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f25593u7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f25593u7);
                } else {
                    this.Fc.G1(this, this.f25593u7);
                }
            } else if (i11 == 8) {
                int i12 = this.K4;
                if (i12 != -1 && (i12 != 1 || !this.f25614w1 || !this.f25437j7)) {
                    if (i12 == 2 || i12 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
            } else if (this.G1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f25593u7;
                int i13 = messageObject5.type;
                if (i13 != 4 && i13 != 17 && i13 != 23 && i13 != 24) {
                    int i14 = this.G1;
                    if (i14 == 1) {
                        if (this.K4 == -1) {
                            this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        k1 k1Var2 = this.Fc;
                        if (k1Var2 != null) {
                            k1Var2.w0(this, this.f25329c1, this.f25344d1, false);
                            return;
                        }
                        return;
                    } else if (i14 == 2) {
                        if (this.K4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Fc.F1(this.f25593u7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                ve.e.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f25388g2) {
                        if (this.K4 == -1) {
                            this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (k1Var = this.Fc) != null) {
                        if (i13 == 16) {
                            k1Var.s0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            k1Var.E0(this, this.O4, this.P4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
            } else if (this.K4 != -1 && (!this.f25572t1 || (!this.f25437j7 && (((messageObject = this.f25593u7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.f25614w1))))) {
                if (this.f25572t1) {
                    v1(true);
                    return;
                }
                int i15 = this.K4;
                if (i15 == 0 || i15 == 3) {
                    v1(false);
                }
            } else {
                this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
            }
        } else {
            int i16 = this.K4;
            if (i16 == -1) {
                this.Fc.w0(this, this.f25329c1, this.f25344d1, false);
            } else if (i16 == 0) {
                v1(false);
            }
        }
    }

    public final void u3(boolean z10) {
        int currentBackgroundLeft;
        float f10;
        int dp;
        int i9;
        float f11;
        int dp2;
        int currentBackgroundLeft2;
        boolean isOutOwner = this.f25593u7.isOutOwner();
        int i10 = 0;
        s1 s1Var = this.Vc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f25548r8 + s1Var.f25168g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f25430j0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f25548r8 + s1Var.f25168g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f25593u7.type == 19) {
                dp = 0;
            } else {
                if (!this.f25394g8 && this.F) {
                    f10 = 11.0f;
                } else {
                    f10 = 17.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            this.f25430j0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f12 = 4.0f;
        if (this.f25374f2) {
            this.f25430j0 = AndroidUtilities.dp(11.0f) + this.f25430j0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Hc;
            this.f25486n0 = dp3;
            StaticLayout staticLayout = this.f25630x2;
            if (staticLayout != null) {
                this.f25486n0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f25388g2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Hc;
            this.f25486n0 = dp4;
            StaticLayout staticLayout2 = this.f25630x2;
            if (staticLayout2 != null) {
                this.f25486n0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f25593u7.type == 19) {
            this.f25486n0 = AndroidUtilities.dp(6.0f) + this.Hc;
            if (!this.f25593u7.isOut()) {
                this.f25430j0 = getCurrentBackgroundLeft();
            } else {
                this.f25430j0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Hc;
            this.f25486n0 = dp5;
            MessageObject messageObject = this.f25593u7;
            float f13 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i11 = this.f25486n0;
                    if (this.Hc <= 0) {
                        f13 = -3.0f;
                    }
                    this.f25486n0 = AndroidUtilities.dp(f13) + i11;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i9 = SharedConfig.bubbleRadius) > 10) {
                    if (i9 < 15) {
                        f13 = 1.0f;
                    }
                    this.f25486n0 = AndroidUtilities.dp(f13) + dp5;
                }
                if (this.f25593u7.hasCodeAtTop && this.Hc > 0) {
                    this.f25486n0 = AndroidUtilities.dp(5.0f) + this.f25486n0;
                }
            }
        }
        if (this.f25593u7.isSponsored()) {
            this.f25458l0 = AndroidUtilities.dp(14.0f) + this.f25486n0;
        } else if (this.f25512p1) {
            this.f25458l0 = AndroidUtilities.dp(10.0f) + this.f25486n0;
            this.f25486n0 = org.telegram.messenger.l0.C(13.0f, this.f25418i2, this.f25486n0);
            if (this.N2 && !this.f25388g2 && !this.f25593u7.isGiveawayOrGiveawayResults()) {
                this.f25486n0 = AndroidUtilities.dp(44.0f) + this.f25486n0;
            }
        } else {
            this.f25458l0 = AndroidUtilities.dp(10.0f) + this.f25593u7.textHeight(s1Var) + this.f25486n0;
        }
        if (this.f25512p1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f25593u7.textHeight(s1Var) + this.f25486n0;
        } else {
            int i12 = this.f25458l0 + this.f25418i2;
            if (this.N2) {
                f11 = 46.0f;
            } else {
                f11 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f11) + i12;
            if (this.f25418i2 <= 0) {
                f12 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f12) + dp6;
        }
        this.m0 = dp2;
        this.f25444k0 = this.f25430j0;
        if (this.f25593u7.textXOffset != 0.0f && this.f25653y9 != null) {
            int dp7 = this.F8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f25593u7;
            int i13 = dp7 - messageObject2.textWidth;
            if (!this.G8) {
                int i14 = this.f25468lb;
                if (messageObject2.isOutOwner()) {
                    i10 = 20;
                }
                i13 = ll.w(i10 + 4, i14, i13);
            }
            if (i13 > 0) {
                this.f25430j0 = (i13 - getExtraTimeX()) + this.f25430j0;
            }
        }
    }

    public final void u4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i9;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.f6.C2.measureText((String) secretTimeString));
                this.f25617w4 = ceil;
                this.f25528q4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.f6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.C2, this.f25617w4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.f6.D2;
                if (getMeasuredWidth() > 0) {
                    i9 = getMeasuredWidth();
                } else {
                    i9 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25528q4 = staticLayout;
                int i10 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i10 = (int) this.f25528q4.getLineWidth(0);
                }
                this.f25617w4 = i10;
            }
            invalidate();
        }
    }

    public final boolean v0(MotionEvent motionEvent) {
        int i9;
        float f10;
        int dp;
        ArrayList arrayList = this.f25451k7;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f25593u7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i10 = this.f25548r8;
                    if (this.f25394g8) {
                        f10 = 1.0f;
                    } else {
                        f10 = 7.0f;
                    }
                    dp = i10 + AndroidUtilities.dp(f10);
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    e0 e0Var = (e0) arrayList.get(i11);
                    int dp2 = (e0Var.d + this.I8) - AndroidUtilities.dp(2.0f);
                    float f11 = x10;
                    float f12 = widthForButtons;
                    float f13 = (e0Var.f24251c * f12) + dp;
                    if (f11 >= f13 && f11 <= (e0Var.f24252e * f12) + f13 && z22 >= dp2 && z22 <= e0Var.f24253f + dp2) {
                        this.f25547r7 = i11;
                        a3();
                        if (e0Var.f24265s == null) {
                            z Y = org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23185nc, this.Ed), 6, 6);
                            e0Var.f24265s = Y;
                            Y.setCallback(this);
                            z zVar = e0Var.f24265s;
                            int i12 = ((int) (e0Var.f24251c * f12)) + dp;
                            zVar.setBounds(i12, dp2, ((int) (e0Var.f24252e * f12)) + i12, e0Var.f24253f + dp2);
                        }
                        e0Var.f24265s.setHotspot(f11, z22);
                        e0Var.f24265s.setState(this.f25616w3);
                        e0Var.b(!e0Var.f24259m);
                        postDelayed(new bg.c2(this, this.f25547r7, 16), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25547r7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f25547r7);
                    z zVar2 = e0Var2.f24265s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f25593u7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        k1 k1Var = this.Fc;
                        if (k1Var != null && !e0Var2.f24259m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f24256j;
                            if (buttonCustom != null) {
                                k1Var.M(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f24255i;
                                if (keyboardInlineButton != null) {
                                    k1Var.e1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f25547r7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i9 = this.f25547r7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i9);
                z zVar3 = e0Var3.f24265s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f25547r7 = -1;
                a3();
            }
        }
        return false;
    }

    public final void v1(boolean z10) {
        float f10;
        MessageObject messageObject;
        MessageObject messageObject2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i9;
        RadialProgress2 radialProgress2;
        int i10;
        MessageObject messageObject3;
        if (this.Fc != null && this.f25593u7.isSensitive() && this.f25593u7.hasMediaSpoilers() && !this.f25593u7.needDrawBluredPreview() && !this.f25593u7.isMediaSpoilersRevealed) {
            this.Fc.J(this);
            return;
        }
        MessageObject messageObject4 = this.f25593u7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f25593u7.putInDownloadsStore = true;
        }
        int i11 = this.K4;
        RadialProgress2 radialProgress22 = this.L0;
        int i12 = this.E7;
        ih.z2 z2Var = this.O0;
        RadialProgress2 radialProgress23 = this.K0;
        if (i11 == 0 && (!this.f25572t1 || z10)) {
            int i13 = this.G1;
            if (i13 != 3 && i13 != 5 && (i13 != 7 || (messageObject3 = this.f25593u7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f25593u7.mediaExists)) {
                if (z10) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f25304a5 != null && (z2Var.hasNotThumb() || this.f25319b5 == null)) {
                    photoSize = this.f25304a5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f25348d5;
                    } else {
                        str = this.f25362e5;
                    }
                } else {
                    photoSize = this.f25319b5;
                    str = this.f25362e5;
                }
                String str2 = str;
                if (this.f25593u7.shouldEncryptPhotoOrVideo()) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                MessageObject messageObject5 = this.f25593u7;
                int i14 = messageObject5.type;
                if (i14 == 1 || i14 == 20) {
                    int i15 = i9;
                    radialProgress2 = radialProgress23;
                    z2Var.setForceLoading(true);
                    z2Var.setImage(ImageLocation.getForObject(this.f25304a5, this.Z4), this.f25348d5, ImageLocation.getForObject(this.f25319b5, this.Z4), this.f25362e5, this.f25333c5, this.f25304a5.size, null, this.f25593u7, i15);
                } else if (i14 == 8) {
                    FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                    if (this.f25593u7.loadedFileSize > 0) {
                        q1(this.H1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f25483md) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i12);
                        TLRPC.Document document = this.f25593u7.getDocument();
                        MessageObject messageObject6 = this.f25593u7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i10);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f25593u7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        z2Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        z2Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f25593u7, 0);
                    }
                    this.Yc = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i14 == 9) {
                        FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                        if (this.f25593u7.loadedFileSize > 0) {
                            q1(this.H1);
                        }
                    } else {
                        int i16 = this.G1;
                        if (i16 == 4) {
                            FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 1, i9);
                            MessageObject messageObject8 = this.f25593u7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i14 == 0 && i16 != 0) {
                            if (i16 == 2) {
                                z2Var.setForceLoading(true);
                                z2Var.setImage(ImageLocation.getForDocument(this.H1), null, ImageLocation.getForDocument(this.f25304a5, this.H1), this.f25362e5, this.H1.size, null, this.f25593u7, i9);
                                MessageObject messageObject9 = this.f25593u7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i16 == 1) {
                                FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                            } else if (i16 == 8) {
                                z2Var.setImage(ImageLocation.getForDocument(this.H1), this.f25348d5, ImageLocation.getForDocument(this.f25304a5, this.H1), "b1", 0L, "jpg", this.f25593u7, 1);
                            }
                        } else {
                            z2Var.setForceLoading(true);
                            z2Var.setImage(ImageLocation.getForObject(this.f25304a5, this.Z4), this.f25348d5, ImageLocation.getForObject(this.f25319b5, this.Z4), this.f25362e5, this.f25333c5, 0L, null, this.f25593u7, 0);
                        }
                    }
                }
                this.f25593u7.loadingCancelled = false;
                this.K4 = 1;
                if (z10) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.T4 == 0) {
                FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                this.f25593u7.loadingCancelled = false;
            }
            if (this.Fc.G1(this, this.f25593u7)) {
                if (this.S4 == 2 && this.T4 != 1) {
                    this.T4 = 1;
                    radialProgress23.o(0.0f, false);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                q4();
                this.K4 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 1 && (!this.f25572t1 || z10)) {
            z2Var.setForceLoading(false);
            int i17 = this.G1;
            if (i17 != 3 && i17 != 5 && (i17 != 7 || (messageObject2 = this.f25593u7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f25593u7.isOut() && !this.f25572t1 && (this.f25593u7.isSending() || this.f25593u7.isEditing())) {
                    if (radialProgress23.f26474i.f27111q != 6) {
                        this.Fc.R(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f25593u7;
                messageObject10.loadingCancelled = true;
                int i18 = this.G1;
                if (i18 != 2 && i18 != 4 && i18 != 1 && i18 != 8) {
                    int i19 = messageObject10.type;
                    if (i19 != 0 && i19 != 1 && i19 != 20 && i19 != 8 && i19 != 5) {
                        if (i19 == 9) {
                            FileLoader.getInstance(i12).cancelLoadFile(this.f25593u7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(z2Var);
                        z2Var.cancelLoadImage();
                    }
                } else {
                    FileLoader.getInstance(i12).cancelLoadFile(this.H1);
                }
                this.K4 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f25593u7)) {
                this.K4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i11 == 2) {
            MessageObject messageObject11 = this.f25593u7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Fc.w0(this, 0.0f, 0.0f, false);
            } else if (this.G1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.T4 == 0) {
                    FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                    this.f25593u7.loadingCancelled = false;
                }
                if (this.Fc.G1(this, this.f25593u7)) {
                    if (this.S4 == 2 && this.T4 != 1) {
                        this.T4 = 1;
                        radialProgress23.o(0.0f, false);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    q4();
                    this.K4 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f25483md) {
                    this.Yc = true;
                    invalidate();
                }
            } else {
                int i20 = this.G1;
                if (i20 != 3 && i20 != 5) {
                    if (this.f25483md) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            z2Var.setAllowStartAnimation(true);
                            z2Var.startAnimation();
                        }
                    } else {
                        z2Var.setAllowStartAnimation(true);
                        z2Var.startAnimation();
                    }
                    this.f25593u7.gifState = 0.0f;
                    this.K4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i12).loadFile(this.H1, this.f25593u7, 2, 0);
                this.f25593u7.loadingCancelled = false;
                this.K4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i11 != 3 && i11 != 0) {
            if (i11 == 4) {
                int i21 = this.G1;
                if (i21 == 3 || i21 == 5 || (i21 == 7 && (messageObject = this.f25593u7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f25593u7.isOut() && (this.f25593u7.isSending() || this.f25593u7.isEditing())) || this.f25593u7.isSendError()) {
                        k1 k1Var = this.Fc;
                        if (k1Var != null && radialProgress23.f26474i.f27111q != 6) {
                            k1Var.R(this);
                            return;
                        }
                        return;
                    }
                    this.f25593u7.loadingCancelled = true;
                    FileLoader.getInstance(i12).cancelLoadFile(this.H1);
                    this.K4 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.S4 == 2 && this.T4 != 1) {
                this.T4 = 1;
                f10 = 0.0f;
                radialProgress23.o(0.0f, false);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f10 = 0.0f;
            }
            k1 k1Var2 = this.Fc;
            if (k1Var2 != null) {
                k1Var2.w0(this, f10, f10, false);
            }
        }
    }

    public final ColorFilter v2(int i9, int i10) {
        if (this.f25642xe == null) {
            this.f25657ye = new int[3];
            this.f25642xe = new ColorFilter[3];
        }
        if (i10 != this.f25657ye[i9] || this.f25642xe[i9] == null) {
            ColorFilter[] colorFilterArr = this.f25642xe;
            this.f25657ye[i9] = i10;
            colorFilterArr[i9] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f25642xe[i9];
    }

    public final void v4() {
        int i9;
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.f25345d2) {
            i9 = 10;
        } else {
            i9 = 0;
        }
        int i19 = -AndroidUtilities.dp(i9 + 92);
        s1 s1Var = this.Vc;
        boolean z10 = s1Var.f25235w0;
        e1 e1Var = this.C5;
        rn0 rn0Var = this.D5;
        float f11 = 10.0f;
        if (z10 && ((i14 = this.G1) == 3 || i14 == 7)) {
            int i20 = this.F8;
            float f12 = i20;
            int i21 = (int) ((f12 - s1Var.f25187k0) + s1Var.f25192l0);
            int i22 = (int) ((f12 - s1Var.f25168g0) + s1Var.f25172h0);
            if (this.f25483md && !this.f25479m8) {
                i22 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i22);
                i21 += AndroidUtilities.dp(8.0f);
            }
            if (s1Var.f25187k0 == 0.0f && s1Var.f25192l0 == 0.0f) {
                i21 = i22;
            }
            if (rn0Var != null) {
                if (s1Var.f25201n1) {
                    int dp = (i22 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25345d2) {
                        f11 = 0.0f;
                    }
                    int dp2 = dp - AndroidUtilities.dp(f11);
                    int dp3 = AndroidUtilities.dp(30.0f);
                    int i23 = i20 + i19;
                    if (!this.H5) {
                        i17 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i17 = 0;
                    }
                    int i24 = i23 + i17;
                    int i25 = i21 + i19;
                    if (this.H5) {
                        i18 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i18 = 0;
                    }
                    rn0Var.h(dp2, dp3, i24, i25 + i18);
                } else {
                    int dp4 = (i22 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25345d2) {
                        f11 = 0.0f;
                    }
                    rn0Var.h(dp4 - AndroidUtilities.dp(f11), AndroidUtilities.dp(30.0f), (i20 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i21 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (e1Var != null) {
                int useTranscribeButtonProgress = i22 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.G1 == 5) {
                    i15 = 65;
                } else {
                    i15 = 72;
                }
                if (this.f25345d2) {
                    i16 = 20;
                } else {
                    i16 = 0;
                }
                e1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i15 + i16), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (rn0Var != null) {
            if (s1Var.f25201n1) {
                int dp5 = (this.F8 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f25345d2) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int dp6 = dp5 - AndroidUtilities.dp(f10);
                int dp7 = AndroidUtilities.dp(30.0f);
                int i26 = this.F8 + i19;
                if (!this.H5) {
                    i12 = -AndroidUtilities.dp(34.0f);
                } else {
                    i12 = 0;
                }
                int i27 = i26 + i12;
                if (!this.f25345d2) {
                    f11 = 0.0f;
                }
                int dp8 = i27 - AndroidUtilities.dp(f11);
                int i28 = this.F8 + i19;
                if (this.H5) {
                    i13 = -AndroidUtilities.dp(34.0f);
                } else {
                    i13 = 0;
                }
                rn0Var.h(dp6, dp7, dp8, i28 + i13);
            } else {
                int dp9 = (this.F8 + i19) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f25345d2) {
                    f11 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f11);
                rn0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (e1Var != null) {
            int useTranscribeButtonProgress2 = this.F8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.G1 == 5) {
                i10 = 65;
            } else {
                i10 = 72;
            }
            if (this.f25345d2) {
                i11 = 20;
            } else {
                i11 = 0;
            }
            e1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i10 + i11), AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        ah.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f25543r3;
            if (drawable == drawableArr[0] || drawable == this.f25544r4 || drawable == drawableArr[1] || drawable == this.Dc || drawable == this.G3 || drawable == this.f25610vc || ((this.J != null && (drawable instanceof org.telegram.ui.Components.i6)) || (drawable instanceof p80))) {
                return true;
            }
            ah.a aVar = this.W5;
            if (aVar == null || (drawable != aVar && drawable != aVar.f258a)) {
                ArrayList arrayList = this.U5;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    r1 r1Var = (r1) obj;
                    if (r1Var.f24950w != drawable && ((bVar = r1Var.f24951x) == null || (drawable != bVar && drawable != bVar.f247a && drawable != bVar.f248b))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean w0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.w0(android.view.MotionEvent):boolean");
    }

    public final void w1() {
        int i9;
        int i10;
        int i11 = this.T4;
        int i12 = this.E7;
        RadialProgress2 radialProgress2 = this.K0;
        if (i11 == 0) {
            this.T4 = 1;
            radialProgress2.o(0.0f, false);
            MessageObject messageObject = this.f25593u7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f25593u7.putInDownloadsStore = true;
            }
            int i13 = this.G1;
            if (i13 != 3 && i13 != 5) {
                if (i13 == 4 || i13 == 7) {
                    q1(this.H1);
                    FileLoader fileLoader = FileLoader.getInstance(i12);
                    TLRPC.Document document = this.H1;
                    MessageObject messageObject2 = this.f25593u7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i10);
                    this.f25593u7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i12);
                TLRPC.Document document2 = this.H1;
                MessageObject messageObject3 = this.f25593u7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i9);
                this.f25593u7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 1) {
            int i14 = this.G1;
            if ((i14 == 3 || i14 == 5 || i14 == 7) && MediaController.getInstance().isPlayingMessage(this.f25593u7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.T4 = 0;
            this.f25593u7.loadingCancelled = true;
            FileLoader.getInstance(i12).cancelLoadFile(this.H1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public dh.k w3() {
        return dh.k.e(this);
    }

    public final void w4() {
        char c10;
        int dp;
        int extraTextX;
        int i9;
        int i10;
        int dp2;
        int i11;
        if (getDelegate() != null && getDelegate().q2() != null && getDelegate().q2().A(this.f25593u7)) {
            o9 q22 = getDelegate().q2();
            if (q22.f24842v0) {
                c10 = 2;
            } else if (q22.f24844x0) {
                c10 = 3;
            } else if (q22.f24846z0) {
                c10 = 4;
            } else if (P2()) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (c10 == 2) {
                if (this.f25374f2) {
                    i11 = this.f25444k0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f25388g2) {
                        i10 = this.f25444k0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = this.f25444k0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i11 = i10 + dp2;
                }
                getDelegate().q2().c0(AndroidUtilities.dp(10.0f) + i11 + this.f25488n2, this.f25446k2);
            } else if (c10 == 1) {
                n4();
                getDelegate().q2().c0((int) this.f25461l4, (int) this.f25475m4);
            } else if (c10 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.G;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i9 = (int) this.f25461l4;
                } else {
                    float f10 = 12.0f;
                    if (this.f25593u7.isOutOwner()) {
                        i9 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25548r8;
                        if (this.f25593u7.type == 19) {
                            i9 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + i9)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f25394g8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f25548r8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i12 = this.f25548r8;
                            if (!this.F) {
                                f10 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f10) + i12;
                            extraTextX = getExtraTextX();
                        }
                        i9 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i9 + this.Vc.f25168g0)) - AndroidUtilities.dp(1.33f);
                int i13 = this.m0;
                n4();
                getDelegate().q2().c0((AndroidUtilities.dp(10.0f) + dp3) - this.X1, AndroidUtilities.dp(22.0f) + i13);
            } else {
                getDelegate().q2().c0(this.f25430j0, this.f25486n0);
            }
        }
    }

    public final boolean x0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f25381f9) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null) {
                int i9 = groupedMessagePosition.flags;
                if ((i9 & 1) == 0 || (i9 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != this && (childAt instanceof t1)) {
                            t1 t1Var = (t1) childAt;
                            if (t1Var.f25381f9 && t1Var.G == this.G) {
                                int i11 = t1Var.H.flags;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - t1Var.getLeft(), (z2(motionEvent) + getTop()) - t1Var.getTop(), 0);
                                    boolean x02 = t1Var.x0(obtain);
                                    obtain.recycle();
                                    return x02;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25543r3;
            if (action == 0) {
                if (this.f25395g9.contains(x10, z22)) {
                    if (this.f25593u7.isSent()) {
                        this.f25574t3[1] = 2;
                        this.f25410h9 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, z22);
                            drawableArr[1].setState(this.f25616w3);
                        }
                        c3();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25410h9) {
                    k1 k1Var = this.Fc;
                    if (k1Var != null) {
                        if (this.Y7) {
                            k1Var.v(this);
                        } else {
                            k1Var.z(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f25410h9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f25410h9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, z22);
            }
        }
        return false;
    }

    public final void x1() {
        MessageObject messageObject = this.f25593u7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            k1 k1Var = this.Fc;
            if (k1Var != null) {
                k1Var.t1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i9, int i10) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
        int i11 = 0;
        s1 s1Var = this.Vc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (dh.l lVar : textLayoutBlock2.spoilers) {
                    lVar.i((i9 - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, s1Var)) - this.f25461l4, getWidth(), (i10 - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, s1Var)) - this.f25475m4);
                }
            }
        }
        StaticLayout staticLayout = this.f25667z9;
        if (staticLayout != null) {
            float height = (-this.D9) - staticLayout.getHeight();
            ArrayList arrayList2 = this.Hd;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList2.get(i13);
                i13++;
                ((dh.l) obj).i(i9 + height, getWidth(), i10 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i11 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i11);
                i11++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (dh.l lVar2 : textLayoutBlock4.spoilers) {
                    lVar2.i((i9 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f25486n0, getWidth(), (i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f25486n0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f25593u7.type == 12) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25543r3;
            if (action == 0) {
                ArrayList arrayList = this.T2;
                int[] iArr = this.f25616w3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i9 = 0; i9 < this.T2.size(); i9++) {
                        l1 l1Var = (l1) this.T2.get(i9);
                        float f10 = x10;
                        float f11 = z22;
                        if (l1Var.f24642e.contains(f10, f11)) {
                            if (l1Var.f24643f == null) {
                                l1Var.f24643f = new pc(this);
                            }
                            l1Var.f24643f.c(true);
                            z zVar = l1Var.f24644g;
                            if (zVar != null) {
                                zVar.setHotspot(f10, f11);
                                l1Var.f24644g.setState(iArr);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
                float f12 = x10;
                float f13 = z22;
                if (this.U2.contains(f12, f13)) {
                    this.V2 = true;
                    this.f25552rc.c(true);
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setHotspot(f12, f13);
                        drawableArr[0].setState(iArr);
                    }
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.V2) {
                    if (this.Fc != null) {
                        ArrayList arrayList2 = this.T2;
                        if (arrayList2 != null && arrayList2.size() == 1) {
                            this.Fc.O0(((l1) this.T2.get(0)).f24639a, this);
                        } else {
                            this.Fc.O0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.V2 = false;
                    this.f25552rc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.T2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i10 = 0; i10 < this.T2.size(); i10++) {
                        l1 l1Var2 = (l1) this.T2.get(i10);
                        pc pcVar = l1Var2.f24643f;
                        if (pcVar != null && pcVar.h) {
                            k1 k1Var = this.Fc;
                            if (k1Var != null) {
                                k1Var.O0(l1Var2.f24639a, this);
                            }
                            z zVar2 = l1Var2.f24644g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            l1Var2.f24643f.c(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.V2 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                    return false;
                }
                ArrayList arrayList4 = this.T2;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.T2.size()) {
                            break;
                        }
                        l1 l1Var3 = (l1) this.T2.get(i11);
                        pc pcVar2 = l1Var3.f24643f;
                        if (pcVar2 != null && pcVar2.h) {
                            z zVar3 = l1Var3.f24644g;
                            if (zVar3 != null) {
                                zVar3.setHotspot(x10, z22);
                                return false;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void y1(Canvas canvas, float f10) {
        float f11;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f12;
        float f13;
        float f14;
        if (this.Y3 == null) {
            return;
        }
        float f15 = this.f25475m4;
        float f16 = this.f25461l4;
        s1 s1Var = this.Vc;
        if (s1Var.f25235w0) {
            if (s1Var.C0) {
                f15 -= getTranslationY();
                f14 = s1Var.f25168g0;
            } else if (s1Var.f25220s0) {
                float f17 = s1Var.K1;
                float f18 = 1.0f - f17;
                f16 = (f16 * f17) + (s1Var.f25212q0 * f18);
                f15 = (f15 * f17) + (f18 * s1Var.f25216r0);
            } else if (!this.f25593u7.isVoice() || !TextUtils.isEmpty(this.f25593u7.caption)) {
                f14 = s1Var.f25168g0;
            }
            f16 += f14;
        }
        float f19 = f16;
        float f20 = f15;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (s1Var.f25142a1) {
            float f21 = s1Var.K1;
            if (f21 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var.f25145b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.p5 p5Var = s1Var.O0;
                float f22 = (1.0f - f21) * f10;
                if (textLayoutBlocks != null) {
                    f12 = textLayoutBlocks.textXOffset;
                } else {
                    f12 = 0.0f;
                }
                z1(f19, f20, canvas, arrayList, p5Var, false, f22, f12, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Y3;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.p5 p5Var2 = this.f25469lc;
                float f23 = f10 * s1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f13 = textLayoutBlocks2.textXOffset;
                } else {
                    f13 = 0.0f;
                }
                z1(f19, f20, canvas, arrayList3, p5Var2, true, f23, f13, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.Y3;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.p5 p5Var3 = this.f25469lc;
        if (textLayoutBlocks3 != null) {
            f11 = textLayoutBlocks3.textXOffset;
        } else {
            f11 = 0.0f;
        }
        z1(f19, f20, canvas, arrayList4, p5Var3, true, f10, f11, true);
    }

    public final org.telegram.ui.ActionBar.d5 y2(boolean z10) {
        boolean z11;
        if (z10) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.G.isDocuments && !this.F) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f25593u7.isOutOwner()) {
                if (!this.f25394g8 && !this.F && !z11) {
                    this.f25518p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgOut");
                } else {
                    this.f25518p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f25394g8 && !this.F && !z11) {
                this.f25518p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgIn");
            } else {
                this.f25518p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgInMedia");
            }
        }
        this.f25518p8.f();
        return this.f25518p8;
    }

    public final float y3() {
        float f10;
        s1 s1Var = this.Vc;
        float f11 = 1.0f;
        if (s1Var.F1) {
            boolean z10 = this.f25525q1;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            return AndroidUtilities.lerp(f10, f11, s1Var.K1);
        } else if (this.f25525q1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i9;
        MessageObject messageObject = this.f25593u7;
        if (messageObject == null) {
            return;
        }
        float f10 = this.f25600ue + this.f25611ve;
        if (!messageObject.isOutOwner() || this.f25593u7.hasWideCode) {
            f10 += this.f25472m1;
        }
        if (this.B8 && !this.f25593u7.isOutOwner() && this.H != null) {
            if (z3()) {
                i9 = 48;
            } else {
                i9 = 0;
            }
            f10 += AndroidUtilities.dp(71 - i9) * this.D8;
        }
        setTranslationX(f10);
    }

    public final boolean z0(MotionEvent motionEvent) {
        if (this.f25593u7.isImportedForward()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                float f11 = this.f25426ib;
                if (f10 >= f11 && f10 <= f11 + this.f25468lb) {
                    float f12 = z22;
                    float f13 = this.f25441jb;
                    if (f12 >= f13 && f12 <= f13 + AndroidUtilities.dp(20.0f)) {
                        this.f25406h5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f25406h5) {
                this.f25406h5 = false;
                playSoundEffect(0);
                this.Fc.d1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.p5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.p5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.R) - this.f25314b0) - this.f25343d0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.J7 || this.M7 || ((this.f25465l8 && !this.P7) || (messageObject = this.f25593u7) == null || messageObject.isOutOwner() || !this.f25593u7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f25593u7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f25593u7;
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

    public t1(Context context, int i9, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = true;
        this.f25612w = new i8.i0(1);
        gr grVar = gr.h;
        this.f25643y = new td.a(0, this, grVar, 380L, false);
        this.J = new hg.s0(this);
        this.K = new eg.b(this);
        this.L = new eg.d(this);
        this.f25628x0 = new Rect();
        this.B0 = -1;
        this.C0 = -1;
        this.N0 = new int[4];
        this.S2 = 0;
        this.f25360e3 = 45;
        this.f25543r3 = new Drawable[2];
        this.f25559s3 = new n1[2];
        this.f25574t3 = new int[2];
        this.f25589u3 = new RectF();
        this.f25616w3 = new int[]{16842910, 16842919};
        this.V3 = -1;
        this.W3 = -1;
        this.X4 = new RectF();
        this.Y4 = new RectF();
        this.f25391g5 = -1;
        this.f25421i5 = 1.0f;
        this.f25435j5 = 1.0f;
        this.f25545r5 = -1;
        this.f25561s5 = new i80(this);
        this.f25605v5 = new ArrayList();
        this.f25618w5 = new ArrayList();
        this.A5 = new Path();
        this.T5 = new ArrayList();
        this.U5 = new ArrayList();
        this.f25363e6 = -1;
        this.f25378f6 = -1;
        this.f25407h6 = true;
        this.J6 = -1;
        this.f25451k7 = new ArrayList();
        new Path();
        this.f25464l7 = new HashMap();
        this.f25478m7 = new HashMap();
        this.G7 = -1;
        this.f25409h8 = true;
        this.f25479m8 = true;
        this.F8 = 100;
        this.f25395g9 = new Rect();
        this.A9 = new AtomicReference();
        this.Ma = new RectF();
        this.f25324bb = new StaticLayout[2];
        this.f25412hb = new float[2];
        this.f25535qb = true;
        this.f25597ub = new Path();
        this.vb = new float[8];
        this.Fb = 1.0f;
        this.Mb = new Path();
        this.Nb = new float[8];
        this.f25640xc = new RectF();
        this.yc = new RectF();
        this.Tc = Build.VERSION.SDK_INT == 28;
        this.Uc = 1.0f;
        this.Vc = new s1(this);
        this.Zc = new org.telegram.ui.Components.y5(this, 200L, gr.f28845g);
        this.f25341cd = new d1(0, this);
        this.f25456kd = new d1(1, this);
        this.f25470ld = new SparseArray();
        this.f25671zd = -1;
        this.Bd = new m.f3();
        this.Hd = new ArrayList();
        this.Id = new Stack();
        this.Jd = new Path();
        this.Md = new b1(2, this);
        this.Nd = new b1(3, this);
        this.Qd = false;
        this.Td = -1L;
        this.f25370ee = false;
        this.f25385fe = new b1(10, this);
        this.f25499ne = true;
        this.f25554re = 1.0f;
        this.f25626we = new c1(Float.class, "animationOffsetX", 0);
        this.E7 = i9;
        this.Ed = b6Var;
        this.Fd = z10;
        this.Gd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Gd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f34902a = new Paint(1);
        drawable.f34903b = null;
        drawable.h = -1.0f;
        drawable.f34908i = -1.0f;
        drawable.f34909j = -1.0f;
        drawable.f34910k = -1.0f;
        drawable.f34912m = this;
        this.Gc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.i9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25439j9 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.B9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f25495n9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.D7 = DownloadController.getInstance(i9).generateObserverTag();
        this.R0 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ih.z2 z2Var = new ih.z2(this, this, 1);
        this.O0 = z2Var;
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.setUseRoundForThumbDrawable(true);
        z2Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.P0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.K0 = new RadialProgress2(this, b6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.L0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        e1 e1Var = new e1(this, this);
        this.C5 = e1Var;
        e1Var.h = this;
        ?? obj = new Object();
        obj.f32209a = 0;
        obj.f32210b = 0;
        obj.f32212e = false;
        obj.f32213f = false;
        obj.f32225s = 1.0f;
        obj.f32226t = 1.0f;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(125L, 600L, grVar);
        obj.v = y5Var;
        obj.f32228w = 1.0f;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(150L, gr.f28844f);
        obj.B = y5Var2;
        obj.J = false;
        if (rn0.N == null) {
            rn0.N = new Paint(1);
            rn0.O = new Paint(1);
            Paint paint = rn0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            rn0.O.setStyle(style);
        }
        this.D5 = obj;
        obj.f32217k = this;
        obj.f32220n = this;
        y5Var2.f34852a = this;
        y5Var.f34852a = this;
        this.E5 = new f1(this);
        ?? drawable2 = new Drawable();
        drawable2.f29111a = 0L;
        drawable2.f29112b = false;
        drawable2.f29113c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f29114e = 0.0f;
        drawable2.f29115f = 0.32f;
        drawable2.f29116g = 1;
        drawable2.h = 1;
        drawable2.f29117i = 1;
        drawable2.f29121m = 255;
        drawable2.f29122n = b6Var;
        drawable2.f29118j = this;
        this.O3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i9) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var = this.f25518p8;
        int i12 = this.F0;
        int i13 = this.G0;
        if (i13 == 0) {
            i12 = getParentWidth();
            i13 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i11 = view.getMeasuredWidth();
                i10 = view.getMeasuredHeight();
                float f10 = this.H0;
                d5Var.o((int) (i9 + f10), i11, i10, (int) f10, this.Qc, this.Rc, this.A, (this.B && this.Vc.f25247z0 == 1.0f) ? false : true);
                d5Var.f22861u = S2();
            }
        }
        i10 = i13;
        i11 = i12;
        float f102 = this.H0;
        d5Var.o((int) (i9 + f102), i11, i10, (int) f102, this.Qc, this.Rc, this.A, (this.B && this.Vc.f25247z0 == 1.0f) ? false : true);
        d5Var.f22861u = S2();
    }

    @Override
    public void invalidate(int i9, int i10, int i11, int i12) {
        k1 k1Var;
        if (this.f25593u7 == null) {
            return;
        }
        Runnable runnable = this.f25400ge;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f25415he;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i9, i10, i11, i12);
        if (this.F7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i9, ((int) getY()) + i10, ((int) getX()) + i11, ((int) getY()) + i12);
        }
        if (!this.Kd || (k1Var = this.Fc) == null) {
            return;
        }
        k1Var.s();
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
