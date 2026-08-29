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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cj0;
import org.telegram.ui.km;
import org.telegram.ui.lu0;
import org.telegram.ui.th;
import org.telegram.ui.u10;
public class s1 extends a0 implements vn0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, s9, NotificationCenter.NotificationCenterDelegate, vd.b, m4 {
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
    public i4 B7;
    public boolean B8;
    public final ImageReceiver B9;
    public float[] Ba;
    public gh.j Bb;
    public float Bc;
    public final m.f3 Bd;
    public boolean C;
    public int C0;
    public int C1;
    public float C2;
    public boolean C3;
    public boolean C4;
    public final d1 C5;
    public float C6;
    public AnimatorSet C7;
    public boolean C8;
    public int C9;
    public float Ca;
    public Integer Cb;
    public uc Cc;
    public n61 Cd;
    public boolean D;
    public boolean D0;
    public int D1;
    public boolean D2;
    public Path D3;
    public boolean D4;
    public final co0 D5;
    public float D6;
    public final int D7;
    public float D8;
    public int D9;
    public float Da;
    public Path Db;
    public z Dc;
    public f1 Dd;
    public boolean E;
    public boolean E0;
    public long E1;
    public uc E2;
    public Paint E3;
    public boolean E4;
    public final e1 E5;
    public boolean E6;
    public final int E7;
    public int E8;
    public float E9;
    public float Ea;
    public float[] Eb;
    public int Ec;
    public org.telegram.ui.ActionBar.c6 Ed;
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
    public j1 Fc;
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
    public final ma0 Gc;
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
    public h1 I5;
    public boolean I6;
    public byte[] I7;
    public int I8;
    public int I9;
    public boolean Ia;
    public StaticLayout Ib;
    public int Ic;
    public final Stack Id;
    public final kg.r0 J;
    public boolean J0;
    public boolean J1;
    public StaticLayout J2;
    public int J3;
    public int J4;
    public float J5;
    public int J6;
    public boolean J7;
    public org.telegram.ui.Components.j9 J8;
    public int J9;
    public boolean Ja;
    public int Jb;
    public int Jc;
    public final Path Jd;
    public final hg.b K;
    public final RadialProgress2 K0;
    public zz0 K1;
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
    public final hg.d L;
    public final RadialProgress2 L0;
    public zz0 L1;
    public float L2;
    public int L3;
    public int L4;
    public StaticLayout L5;
    public float L6;
    public boolean L7;
    public Paint L8;
    public boolean L9;
    public StaticLayout La;
    public gh.k Lb;
    public int Lc;
    public BotForumHelper.BotDraftAnimationsPool Ld;
    public boolean M;
    public boolean M0;
    public uc M1;
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
    public final a1 Md;
    public long N;
    public final int[] N0;
    public uc N1;
    public boolean N2;
    public boolean N3;
    public int N4;
    public int N5;
    public int N6;
    public boolean N7;
    public CheckBoxBase[] N8;
    public boolean N9;
    public uc Na;
    public final float[] Nb;
    public boolean Nc;
    public final a1 Nd;
    public zz0 O;
    public final lh.x2 O0;
    public StaticLayout O1;
    public boolean O2;
    public final ul0 O3;
    public int O4;
    public int O5;
    public o11 O6;
    public boolean O7;
    public v40 O8;
    public boolean O9;
    public RectF Oa;
    public StaticLayout Ob;
    public float Oc;
    public boolean Od;
    public s80 P;
    public final ImageReceiver P0;
    public StaticLayout P1;
    public boolean P2;
    public StaticLayout P3;
    public int P4;
    public StaticLayout P5;
    public org.telegram.ui.Components.d6 P6;
    public boolean P7;
    public c90 P8;
    public org.telegram.ui.Components.d6 P9;
    public eg.a Pa;
    public int Pb;
    public int Pc;
    public boolean Pd;
    public CornerPathEffect Q;
    public ColorMatrixColorFilter Q0;
    public v80 Q1;
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
    public final org.telegram.ui.Components.e9 R0;
    public z80 R1;
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
    public yp S0;
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
    public zz0 T;
    public GradientDrawable T0;
    public Drawable T1;
    public ArrayList T2;
    public org.telegram.ui.Components.g9 T3;
    public int T4;
    public final ArrayList T5;
    public boolean T6;
    public boolean T7;
    public org.telegram.ui.Components.e9[] T8;
    public int T9;
    public float Ta;
    public String Tb;
    public final boolean Tc;
    public long Td;
    public s80 U;
    public nh.l U0;
    public int U1;
    public RectF U2;
    public zz0 U3;
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
    public dh.d V5;
    public int V6;
    public boolean V7;
    public StaticLayout V8;
    public ql0 V9;
    public boolean Va;
    public TLRPC.Chat Vb;
    public final r1 Vc;
    public int Vd;
    public int W;
    public xi0 W0;
    public u10 W1;
    public boolean W2;
    public int W3;
    public boolean W4;
    public dh.a W5;
    public float W6;
    public boolean W7;
    public org.telegram.ui.Components.g6 W8;
    public ql0 W9;
    public boolean Wa;
    public TLRPC.FileLocation Wb;
    public boolean Wc;
    public int Wd;
    public Paint X0;
    public int X1;
    public int X2;
    public int X3;
    public final RectF X4;
    public bh.j X5;
    public float X6;
    public long X7;
    public boolean X8;
    public ql0 X9;
    public float Xa;
    public String Xb;
    public boolean Xc;
    public int Xd;
    public Paint Y0;
    public int Y1;
    public CharSequence Y2;
    public MessageObject.TextLayoutBlocks Y3;
    public final RectF Y4;
    public bh.j Y5;
    public int Y6;
    public boolean Y7;
    public int Y8;
    public ql0 Y9;
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
    public ql0 Z9;
    public StaticLayout Za;
    public long Zb;
    public final org.telegram.ui.Components.d6 Zc;
    public float Zd;
    public t11 f25265a0;
    public tw0 f25266a1;
    public int a2;
    public float f25267a3;
    public li0 f25268a4;
    public TLRPC.PhotoSize f25269a5;
    public int f25270a6;
    public boolean f25271a7;
    public boolean f25272a8;
    public boolean f25273a9;
    public ql0 f25274aa;
    public int f25275ab;
    public String f25276ac;
    public FlagSecureReason f25277ad;
    public org.telegram.ui.Components.h8 f25278ae;
    public int f25279b0;
    public boolean f25280b1;
    public int f25281b2;
    public int f25282b3;
    public CharSequence f25283b4;
    public TLRPC.PhotoSize f25284b5;
    public int f25285b6;
    public String f25286b7;
    public boolean f25287b8;
    public int f25288b9;
    public int f25289ba;
    public final StaticLayout[] f25290bb;
    public org.telegram.ui.Components.n5 f25291bc;
    public boolean f25292bd;
    public boolean f25293be;
    public hy0 f25294c0;
    public float f25295c1;
    public int f25296c2;
    public int c3;
    public StaticLayout f25297c4;
    public BitmapDrawable f25298c5;
    public float c6;
    public TLRPC.Message f25299c7;
    public boolean f25300c8;
    public int f25301c9;
    public Drawable f25302ca;
    public int f25303cb;
    public org.telegram.ui.Components.n5 f25304cc;
    public final c1 f25305cd;
    public boolean f25306ce;
    public int f25307d0;
    public float f25308d1;
    public boolean f25309d2;
    public int f25310d3;
    public MessageObject.TextLayoutBlocks f25311d4;
    public String f25312d5;
    public float f25313d6;
    public boolean f25314d7;
    public int f25315d8;
    public int f25316d9;
    public boolean da;
    public boolean f25317db;
    public TLRPC.User f25318dc;
    public int f25319dd;
    public cj0 f25320de;
    public long f25321e0;
    public boolean f25322e1;
    public boolean f25323e2;
    public int f25324e3;
    public CharSequence f25325e4;
    public String f25326e5;
    public int f25327e6;
    public int f25328e7;
    public float f25329e8;
    public int f25330e9;
    public jh.va f25331ea;
    public float f25332eb;
    public TLRPC.User f25333ec;
    public int f25334ed;
    public boolean f25335ee;
    public boolean f25336f;
    public int f25337f0;
    public boolean f25338f1;
    public boolean f25339f2;
    public LinearGradient f25340f3;
    public int f25341f4;
    public Drawable f25342f5;
    public int f25343f6;
    public int f25344f7;
    public long f25345f8;
    public boolean f9;
    public int f25346fa;
    public int f25347fb;
    public TLRPC.Chat f25348fc;
    public float f25349fd;
    public final a1 f25350fe;
    public uc f25351g0;
    public CheckBoxBase f25352g1;
    public boolean f25353g2;
    public yb0 f25354g3;
    public int f25355g4;
    public int f25356g5;
    public float f25357g6;
    public boolean f25358g7;
    public boolean f25359g8;
    public final Rect f25360g9;
    public z f25361ga;
    public int f25362gb;
    public String gc;
    public boolean f25363gd;
    public Runnable f25364ge;
    public boolean h;
    public org.telegram.ui.Components.n5 f25365h0;
    public CheckBoxBase f25366h1;
    public boolean f25367h2;
    public int f25368h3;
    public int f25369h4;
    public boolean f25370h5;
    public boolean f25371h6;
    public boolean f25372h7;
    public boolean f25373h8;
    public boolean f25374h9;
    public zz0 f25375ha;
    public final float[] f25376hb;
    public String hc;
    public ValueAnimator f25377hd;
    public Runnable f25378he;
    public boolean f25379i0;
    public boolean f25380i1;
    public int f25381i2;
    public int f25382i3;
    public Drawable f25383i4;
    public float f25384i5;
    public boolean f25385i6;
    public float f25386i7;
    public boolean f25387i8;
    public final ImageReceiver f25388i9;
    public zz0 f25389ia;
    public float f25390ib;
    public boolean f25391ic;
    public int f25392id;
    public int f25393ie;
    public int f25394j0;
    public boolean f25395j1;
    public int f25396j2;
    public int f25397j3;
    public int f25398j4;
    public float f25399j5;
    public boolean f25400j6;
    public boolean f25401j7;
    public boolean f25402j8;
    public final org.telegram.ui.Components.e9 f25403j9;
    public int f25404ja;
    public float f25405jb;
    public boolean f25406jc;
    public float f25407jd;
    public int f25408je;
    public int f25409k0;
    public float f25410k1;
    public int f25411k2;
    public int f25412k3;
    public int f25413k4;
    public long f25414k5;
    public boolean f25415k6;
    public final ArrayList f25416k7;
    public boolean f25417k8;
    public boolean k9;
    public int f25418ka;
    public StaticLayout f25419kb;
    public boolean f25420kc;
    public final c1 f25421kd;
    public boolean f25422ke;
    public int f25423l0;
    public long l1;
    public int f25424l2;
    public int f25425l3;
    public float f25426l4;
    public long f25427l5;
    public boolean f25428l6;
    public final HashMap f25429l7;
    public boolean f25430l8;
    public boolean f25431l9;
    public org.telegram.ui.Components.d6 f25432la;
    public int f25433lb;
    public org.telegram.ui.Components.u5 lc;
    public final SparseArray f25434ld;
    public float f25435le;
    public int m0;
    public int f25436m1;
    public int f25437m2;
    public boolean f25438m3;
    public float f25439m4;
    public boolean f25440m5;
    public boolean f25441m6;
    public final HashMap f25442m7;
    public boolean f25443m8;
    public boolean f25444m9;
    public s80 ma;
    public int f25445mb;
    public org.telegram.ui.Components.u5 f25446mc;
    public boolean f25447md;
    public Paint f25448me;
    public int f25449n;
    public int f25450n0;
    public org.telegram.ui.g5 f25451n1;
    public int f25452n2;
    public boolean f25453n3;
    public int f25454n4;
    public boolean f25455n5;
    public boolean f25456n6;
    public String f25457n7;
    public int f25458n8;
    public final ImageReceiver f25459n9;
    public c90 f25460na;
    public int f25461nb;
    public org.telegram.ui.Components.u5 f25462nc;
    public boolean f25463nd;
    public boolean f25464ne;
    public int f25465o0;
    public e10 f25466o1;
    public int f25467o2;
    public boolean f25468o3;
    public int f25469o4;
    public org.telegram.ui.Components.y5 f25470o5;
    public boolean f25471o6;
    public int f25472o7;
    public boolean f25473o8;
    public int f25474o9;
    public ArrayList f25475oa;
    public int ob;
    public org.telegram.ui.Components.u5 f25476oc;
    public float f25477od;
    public iy0 f25478oe;
    public int f25479p0;
    public boolean f25480p1;
    public int f25481p2;
    public uc f25482p3;
    public int f25483p4;
    public z80 f25484p5;
    public boolean f25485p6;
    public boolean f25486p7;
    public org.telegram.ui.ActionBar.d5 f25487p8;
    public Drawable[] f25488p9;
    public boolean f25489pa;
    public CharSequence f25490pb;
    public org.telegram.ui.Components.u5 f25491pc;
    public float pd;
    public Paint f25492pe;
    public int f25493q0;
    public boolean f25494q1;
    public int f25495q2;
    public int f25496q3;
    public StaticLayout f25497q4;
    public MessageObject.TextLayoutBlock f25498q5;
    public boolean q6;
    public boolean f25499q7;
    public org.telegram.ui.ActionBar.d5 f25500q8;
    public int[] q9;
    public int f25501qa;
    public boolean qb;
    public uc f25502qc;
    public float f25503qd;
    public Paint f25504qe;
    public j3 f25505r;
    public int f25506r0;
    public boolean f25507r1;
    public int f25508r2;
    public final Drawable[] f25509r3;
    public org.telegram.ui.Components.n6 f25510r4;
    public int f25511r5;
    public long r6;
    public int f25512r7;
    public int f25513r8;
    public Drawable r9;
    public boolean f25514ra;
    public boolean f25515rb;
    public uc f25516rc;
    public float f25517rd;
    public float re;
    public boolean f25518s;
    public int f25519s0;
    public boolean f25520s1;
    public int f25521s2;
    public final m1[] f25522s3;
    public org.telegram.ui.Components.n6 f25523s4;
    public final v80 f25524s5;
    public String f25525s6;
    public gh.k f25526s7;
    public int f25527s8;
    public Drawable f25528s9;
    public int f25529sa;
    public Paint f25530sb;
    public uc f25531sc;
    public long f25532sd;
    public int f25533se;
    public int f25534t0;
    public boolean f25535t1;
    public int f25536t2;
    public final int[] f25537t3;
    public jf.p f25538t4;
    public int f25539t5;
    public int f25540t6;
    public boolean f25541t7;
    public int f25542t8;
    public int f25543t9;
    public boolean f25544ta;
    public Path f25545tb;
    public float f25546tc;
    public float f25547td;
    public MessageObject.TextLayoutBlocks f25548te;
    public boolean f25549u0;
    public long f25550u1;
    public float f25551u2;
    public final RectF f25552u3;
    public StaticLayout f25553u4;
    public boolean f25554u5;
    public boolean f25555u6;
    public MessageObject f25556u7;
    public int f25557u8;
    public boolean f25558u9;
    public boolean f25559ua;
    public final Path f25560ub;
    public float f25561uc;
    public float f25562ud;
    public float f25563ue;
    public o0 v;
    public boolean f25564v0;
    public boolean f25565v1;
    public float f25566v2;
    public c90 f25567v3;
    public long f25568v4;
    public final ArrayList f25569v5;
    public boolean f25570v6;
    public MessageObject f25571v7;
    public int f25572v8;
    public boolean f25573v9;
    public boolean f25574va;
    public final float[] f25575vb;
    public z f25576vc;
    public int f25577vd;
    public float f25578ve;
    public final k8.i0 f25579w;
    public int f25580w0;
    public boolean f25581w1;
    public int f25582w2;
    public final int[] f25583w3;
    public int f25584w4;
    public final ArrayList f25585w5;
    public boolean f25586w6;
    public MessageObject.GroupedMessages f25587w7;
    public boolean f25588w8;
    public boolean f25589w9;
    public int f25590wa;
    public gh.k f25591wb;
    public Path f25592wc;
    public float f25593wd;
    public final b1 f25594we;
    public boolean f25595x;
    public final Rect f25596x0;
    public int f25597x1;
    public StaticLayout f25598x2;
    public float f25599x3;
    public zz0 x4;
    public c90 f25600x5;
    public boolean f25601x6;
    public boolean f25602x7;
    public t41 f25603x8;
    public CheckBoxBase f25604x9;
    public boolean xa;
    public float xb;
    public final RectF f25605xc;
    public float xd;
    public ColorFilter[] f25606xe;
    public final vd.a f25607y;
    public int f25608y0;
    public float f25609y1;
    public StaticLayout f25610y2;
    public SpannableStringBuilder f25611y3;
    public zz0 f25612y4;
    public ArrayList f25613y5;
    public boolean f25614y6;
    public boolean f25615y7;
    public t41 y8;
    public StaticLayout f25616y9;
    public Path f25617ya;
    public float f25618yb;
    public final RectF f25619yc;
    public float f25620yd;
    public int[] f25621ye;
    public int f25622z0;
    public boolean f25623z1;
    public float f25624z2;
    public boolean f25625z3;
    public zz0 f25626z4;
    public CharacterStyle f25627z5;
    public boolean f25628z6;
    public boolean f25629z7;
    public int f25630z8;
    public StaticLayout f25631z9;
    public Path f25632za;
    public float f25633zb;
    public int f25634zc;
    public int f25635zd;
    public TL_stars.StarGift f25636ze;

    public s1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static void A3(int i10, ArrayList arrayList, boolean z10) {
        if (z10 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new lh.e4(13));
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

    public static android.graphics.PointF C2(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.C2(int, int, int, int):android.graphics.PointF");
    }

    public static int[] J2(Spannable spannable, CharacterStyle characterStyle) {
        int i10;
        int i11;
        boolean z10;
        h01 h01Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof y41) && (h01Var = ((y41) characterStyle).f34922a) != null && (messageEntity = h01Var.d) != null) {
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

    public static boolean T(s1 s1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            j1 j1Var = s1Var.Fc;
            if (j1Var == null || j1Var.R()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean Z2(float f9, float f10, float f11, float f12) {
        if (f9 <= f11) {
            if (f10 >= f11) {
                return true;
            }
            return false;
        } else if (f9 <= f12) {
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
        eg.a[] aVarArr = (eg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), eg.a.class);
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
        if (this.Vb != null && (messageObject = this.f25556u7) != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25556u7.messageOwner.from_id);
            int i10 = this.E7;
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
        TLRPC.User user = this.Ub;
        if (user != null) {
            return UserObject.getUserName(user);
        }
        if (this.Vb != null) {
            MessageObject messageObject = this.f25556u7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f25556u7.messageOwner.from_id);
                int i10 = this.E7;
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
            return this.Vb.title;
        }
        MessageObject messageObject2 = this.f25556u7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f25556u7.sponsoredTitle;
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
                    this.f25276ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            } else if (this.Ub.premium) {
                return ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
            } else {
                return null;
            }
        } else if (this.Vb != null && (messageObject = this.f25556u7) != null && messageObject.getDialogId() != 1271266957 && this.Vb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f25556u7.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.E7).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f25276ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return UserObject.getEmojiStatusDocumentId(user2);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.E7).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f25276ac = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private sg.a getDraftMessageMeasureController() {
        j1 j1Var = this.Fc;
        if (j1Var != null) {
            return j1Var.X();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i10;
        if (!this.f25556u7.isOutOwner() && ((!this.f25359g8 || this.Y3 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f25556u7.isOutOwner() && this.f25463nd && this.f25417k8 && this.f25556u7.type == 5) {
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
        MessageObject messageObject = this.f25556u7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.getIconForCurrentState():int");
    }

    public int getMiniIconForCurrentState() {
        int i10 = this.T4;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
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
        return (int) (org.telegram.ui.ActionBar.g6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f9;
        float f10;
        r1 r1Var = this.Vc;
        if (r1Var.P2) {
            boolean z10 = this.Wa;
            f9 = AndroidUtilities.lerp(!z10, z10, r1Var.K1);
        } else if (this.Wa) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.g6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
        if (this.La == null) {
            f10 = 31.0f;
        } else {
            f10 = 35.0f;
        }
        return AndroidUtilities.lerp(textSize, AndroidUtilities.dp(f10), f9);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (messageReplies = this.G.messages.get(0).messageOwner.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.f25556u7.messageOwner.replies;
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
        return this.f25556u7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
        if (c6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.g6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23331sa;
        }
        return c6Var.C0(i10);
    }

    private float getUseTranscribeButtonProgress() {
        r1 r1Var = this.Vc;
        if (r1Var.f25157n1) {
            if (this.H5) {
                return r1Var.K1;
            }
            return 1.0f - r1Var.K1;
        } else if (this.H5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static k1 n1(int i10, String str, int i11, float f9) {
        k1 k1Var = new k1();
        k1Var.f24576a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.g6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        k1Var.d = staticLayout;
        k1Var.f24577b = f9;
        if (staticLayout.getLineCount() > 0) {
            k1Var.f24578c = ((float) (k1Var.f24577b - Math.ceil(k1Var.d.getLineWidth(0)))) / 2.0f;
            k1Var.f24578c -= (int) k1Var.d.getLineLeft(0);
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
        if (this.f25482p3 == null) {
            this.f25482p3 = new uc(this);
        }
        uc ucVar = this.f25482p3;
        this.f25468o3 = z10;
        ucVar.c(z10);
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
        return bw0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i18, i13, true);
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
        if (this.f25556u7.isImportedForward()) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f9 = x4;
                float f10 = this.f25390ib;
                if (f9 >= f10 && f9 <= f10 + this.f25433lb) {
                    float f11 = z22;
                    float f12 = this.f25405jb;
                    if (f11 >= f12 && f11 <= f12 + AndroidUtilities.dp(20.0f)) {
                        this.f25370h5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f25370h5) {
                this.f25370h5 = false;
                playSoundEffect(0);
                this.Fc.k1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void A1(Canvas canvas, float f9) {
        cj0 cj0Var;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f10 = this.f25450n0;
            r1 r1Var = this.Vc;
            if (r1Var.f25149l2) {
                float f11 = r1Var.f25158n2;
                float f12 = r1Var.K1;
                f10 = (f10 * f12) + ((1.0f - f12) * f11);
            }
            float f13 = f10;
            if (r1Var.K1 != 1.0f && r1Var.G0 && ((cj0Var = this.f25320de) == null || !cj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.d5 d5Var = this.f25487p8;
                if (d5Var != null) {
                    Rect bounds = d5Var.getBounds();
                    if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.B) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f25394j0, f13, canvas, r1Var.H0, r1Var.O0, false, (1.0f - r1Var.K1) * f9, this.f25556u7.textXOffset, false);
                MessageObject messageObject2 = this.f25556u7;
                z1(this.f25394j0, f13, canvas, messageObject2.textLayoutBlocks, this.lc, true, f9 * r1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f25556u7;
                z1(this.f25394j0, f13, canvas, messageObject3.textLayoutBlocks, this.lc, true, f9, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f9);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f25314d7) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            if (string == null) {
                return LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault);
            }
            return string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public final boolean B0(MotionEvent motionEvent) {
        float f9;
        j1 j1Var;
        MessageObject messageObject = this.f25556u7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f10 = 0.0f;
        if (this.f25321e0 == 0) {
            f9 = 0.0f;
        } else {
            f9 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f9);
        float f11 = this.f25433lb;
        if (this.f25556u7.sendPreview) {
            f10 = 1.0f - this.f25384i5;
        }
        int dp2 = ((int) ((f11 * f10) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f25433lb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f25351g0 == null) {
                    this.f25351g0 = new uc(this);
                }
                this.Qd = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Qd = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Qd && (j1Var = this.Fc) != null) {
                j1Var.F(this);
            }
            this.Qd = false;
        } else if (motionEvent.getAction() == 3) {
            this.Qd = false;
        }
        uc ucVar = this.f25351g0;
        if (ucVar != null) {
            ucVar.c(this.Qd);
        }
        return this.Qd;
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z10) {
        float f9;
        li0 li0Var;
        float f10;
        if (!this.f25338f1 && this.f25300c8) {
            int i10 = this.f25315d8;
            if (i10 >= 300) {
                f10 = 1.0f;
            } else {
                f10 = i10 / 300.0f;
            }
            f9 = f10 * 1.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10 && (li0Var = this.f25268a4) != null) {
            return (1.0f - li0Var.f30343k.d(1.0f, false)) * f9;
        }
        return f9;
    }

    public final s80 B3() {
        s80 s80Var;
        ArrayList arrayList = this.f25569v5;
        if (!arrayList.isEmpty()) {
            s80Var = (s80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            s80Var = new s80(0);
        }
        s80Var.reset();
        this.f25585w5.add(s80Var);
        return s80Var;
    }

    public final boolean C0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Fd && (messageObject = this.f25556u7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Da, this.Ed) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f25556u7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f25556u7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.Y3 != null) {
            for (int i11 = 0; i11 < this.Y3.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.Y3.textLayoutBlocks.get(i11);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    public final boolean D0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.D0(android.view.MotionEvent):boolean");
    }

    public final boolean D1(android.graphics.Canvas r42, boolean r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.D1(android.graphics.Canvas, boolean, boolean):boolean");
    }

    public final String D2(long j10) {
        TLRPC.Chat chat;
        int i10 = this.E7;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (i11 < 0 && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null) {
            return chat.title;
        } else {
            return null;
        }
    }

    public final void D3() {
        this.V2 = false;
        uc ucVar = this.f25516rc;
        if (ucVar != null) {
            ucVar.c(false);
        }
        Drawable drawable = this.f25509r3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.T2 != null) {
            for (int i10 = 0; i10 < this.T2.size(); i10++) {
                k1 k1Var = (k1) this.T2.get(i10);
                uc ucVar2 = k1Var.f24580f;
                if (ucVar2 != null) {
                    ucVar2.c(false);
                }
                z zVar = k1Var.f24581g;
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
        v80 v80Var = this.f25524s5;
        if (this.f25339f2) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.I1 && this.f25520s1 && this.K4 != -1 && x4 >= (i11 = this.G4) && x4 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.H4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.K0.f26485i.f31311q != 4) {
                    this.L4 = 1;
                    invalidate();
                    return true;
                }
                if (this.I1) {
                    if (this.O0.isInsideImage(x4, z22)) {
                        this.f25554u5 = true;
                        return true;
                    }
                }
                if (this.G2 != null && z22 >= this.f25411k2) {
                    try {
                        int dp = x4 - ((this.f25409k0 + AndroidUtilities.dp(10.0f)) + this.f25452n2);
                        int i13 = z22 - this.f25411k2;
                        int lineForVertical = this.G2.getLineForVertical(i13);
                        float f9 = dp;
                        int offsetForHorizontal = this.G2.getOffsetForHorizontal(lineForVertical, f9);
                        float lineLeft = this.G2.getLineLeft(lineForVertical);
                        if (lineLeft <= f9 && lineLeft + this.G2.getLineWidth(lineForVertical) >= f9) {
                            Spannable spannable = (Spannable) this.f25556u7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof x41) || x41.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                z80 z80Var = this.f25484p5;
                                if (z80Var == null || z80Var.f35285i != clickableSpanArr[0]) {
                                    v80Var.k(z80Var, true);
                                    z80 z80Var2 = new z80(clickableSpanArr[0], this.Ed, f9, i13, 0);
                                    this.f25484p5 = z80Var2;
                                    if (this.f25556u7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.g6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.g6.Ld;
                                    }
                                    z80Var2.d(org.telegram.ui.ActionBar.g6.v0(i10, this.Ed));
                                    this.f25506r0 = -10;
                                    this.f25539t5 = 2;
                                    try {
                                        s80 b10 = this.f25484p5.b();
                                        int[] J2 = J2(spannable, this.f25484p5.f35285i);
                                        b10.d(this.G2, J2[0], 0.0f);
                                        this.G2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    v80Var.a(this.f25484p5, 2);
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
                if (this.f25539t5 != 2 && !this.f25554u5 && this.L4 == 0) {
                    F3(2);
                    return false;
                } else if (this.L4 != 0) {
                    this.L4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    z80 z80Var3 = this.f25484p5;
                    if (z80Var3 != null) {
                        CharacterStyle characterStyle = z80Var3.f35285i;
                        if (characterStyle instanceof URLSpan) {
                            ye.d.s(getContext(), ((URLSpan) this.f25484p5.f35285i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f25554u5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f25416k7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i14);
                        if (kf.c.c(e0Var.f24254i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Fc.m1(this, e0Var.f24254i);
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
        if (!this.f25556u7.isMediaSpoilersRevealed && this.xb != 1.0f) {
            lh.x2 x2Var = this.O0;
            int[] roundRadius = x2Var.getRoundRadius();
            float f9 = roundRadius[0];
            float[] fArr = this.f25575vb;
            fArr[1] = f9;
            fArr[0] = f9;
            float f10 = roundRadius[1];
            fArr[3] = f10;
            fArr[2] = f10;
            float f11 = roundRadius[2];
            fArr[5] = f11;
            fArr[4] = f11;
            float f12 = roundRadius[3];
            fArr[7] = f12;
            fArr[6] = f12;
            Path path = this.f25560ub;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x2Var.getImageX(), x2Var.getImageY(), x2Var.getImageX2(), x2Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.xb != 0.0f) {
                path.rewind();
                path.addCircle(this.f25618yb, this.f25633zb, this.Ab * this.xb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f25556u7.needDrawBluredPreview()) {
                x2Var.draw(canvas);
            } else {
                float imageX = x2Var.getImageX();
                float imageY = x2Var.getImageY();
                float imageWidth = x2Var.getImageWidth();
                float imageHeight = x2Var.getImageHeight();
                ImageReceiver imageReceiver = this.P0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(x2Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z10) {
        boolean z11;
        jr jrVar;
        float f9 = this.f25563ue;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z10 && ((z11 = this.f25380i1) || this.f25395j1)) {
                if (z11) {
                    jrVar = jr.f29801g;
                } else {
                    jrVar = jr.f29802i;
                }
                this.f25436m1 = (int) Math.ceil(jrVar.getInterpolation(this.f25410k1) * AndroidUtilities.dp(35.0f));
                if (this.f25556u7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f25436m1 = 0;
                    }
                }
            }
            f9 += this.f25436m1;
            if (this.B8 && this.H != null) {
                if (z3()) {
                    i10 = 48;
                }
                return (AndroidUtilities.dp(71 - i10) * this.D8) + f9;
            }
        }
        return f9;
    }

    public final void E3() {
        ArrayList arrayList = this.U5;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((q1) arrayList.get(i10)).f25047w.setState(StateSet.NOTHING);
            }
        }
        dh.a aVar = this.W5;
        if (aVar != null) {
            aVar.f5643a.setState(StateSet.NOTHING);
        }
    }

    public final void F0() {
        int i10;
        boolean z10 = this.I0;
        boolean z11 = this.f25293be;
        lh.x2 x2Var = this.O0;
        if (z10 != z11) {
            this.f25293be = z10;
            ImageReceiver imageReceiver = this.P0;
            ImageReceiver imageReceiver2 = this.f25459n9;
            ImageReceiver imageReceiver3 = this.B9;
            hg.d dVar = this.L;
            hg.b bVar = this.K;
            ArrayList arrayList = this.U5;
            RadialProgress2 radialProgress2 = this.L0;
            RadialProgress2 radialProgress22 = this.K0;
            if (z10) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.j9 j9Var = this.J8;
                if (j9Var != null) {
                    j9Var.a();
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
                bh.j jVar = this.X5;
                if (jVar != null) {
                    jVar.a();
                }
                bh.j jVar2 = this.Y5;
                if (jVar2 != null) {
                    jVar2.a();
                }
                if (this.S8 != null) {
                    int i12 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.S8;
                        if (i12 >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i12].onAttachedToWindow();
                        i12++;
                    }
                }
                ImageReceiver imageReceiver4 = bVar.d;
                if (imageReceiver4 != null) {
                    imageReceiver4.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr2 = bVar.f8000a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = dVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = dVar.f8026a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (x2Var.onAttachedToWindow()) {
                    if (this.I1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.f25446mc = org.telegram.ui.Components.y5.update(0, (View) this, false, this.f25446mc, this.f25631z9);
                this.f25462nc = org.telegram.ui.Components.y5.update(0, (View) this, false, this.f25462nc, this.G2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.j9 j9Var2 = this.J8;
                if (j9Var2 != null) {
                    j9Var2.b();
                }
                bh.j jVar3 = this.X5;
                if (jVar3 != null) {
                    jVar3.f2672b.onDetachedFromWindow();
                    jVar3.f2682x.f();
                }
                bh.j jVar4 = this.Y5;
                if (jVar4 != null) {
                    jVar4.f2672b.onDetachedFromWindow();
                    jVar4.f2682x.f();
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
                if (this.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.S8;
                        if (i14 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
                imageReceiver3.onDetachedFromWindow();
                imageReceiver2.onDetachedFromWindow();
                x2Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = bVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = bVar.f8000a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = dVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = dVar.f8026a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.y5.release(this, this.f25462nc);
                org.telegram.ui.Components.y5.release(this, this.f25446mc);
                org.telegram.ui.Components.y5.release(this, this.lc);
            }
        }
        boolean z12 = this.I0;
        if (z12 != this.f25306ce) {
            this.f25306ce = z12;
            int i15 = this.E7;
            if (z12) {
                MessageObject messageObject = this.f25556u7;
                if (x2Var != null) {
                    x2Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f25447md || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f25507r1) {
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
                        v61 v61Var = messageObject.highestQuality;
                        if (v61Var != null && !v61Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        v61 v61Var2 = messageObject.thumbQuality;
                        if (v61Var2 != null && !v61Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f25556u7;
            if (x2Var != null) {
                x2Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f22413id) && !PhotoViewer.t1().Q1()) {
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
        if (this.Bb == null) {
            return;
        }
        canvas.save();
        lh.x2 x2Var = this.O0;
        canvas.translate(x2Var.getImageX(), x2Var.getImageY());
        this.Bb.c(canvas, this, (int) x2Var.getImageWidth(), (int) x2Var.getImageHeight(), x2Var.getAlpha(), this.f25422ke);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                bh.j jVar = this.X5;
                if (jVar != null) {
                    return jVar.f2672b;
                }
                return null;
            } else if (i10 == -3) {
                bh.j jVar2 = this.Y5;
                if (jVar2 != null) {
                    return jVar2.f2672b;
                }
                return null;
            } else {
                ArrayList arrayList = this.U5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        q1 q1Var = (q1) obj;
                        dh.b bVar = q1Var.f25048x;
                        if (bVar != null && (pollAnswer = q1Var.f25044s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f5634c;
                        }
                    }
                }
            }
        }
        i4 i4Var = this.B7;
        if (i4Var != null) {
            ArrayList arrayList2 = i4Var.f24478c;
            g4 g4Var = i4Var.f24477b;
            if (g4Var != null && i10 >= 0 && i10 < g4Var.f24395a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) i4Var.f24477b.f24395a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((h4) arrayList2.get(i12)).A == messageExtendedMedia) {
                        return ((h4) arrayList2.get(i12)).f24443f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.O0;
    }

    public final void F3(int i10) {
        v80 v80Var = this.f25524s5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < v80Var.d; i11++) {
                if (((Pair) v80Var.f33493c.get(i11)).second == valueOf) {
                    v80Var.j(i11);
                }
            }
        } else {
            v80Var.d(true);
        }
        v80 v80Var2 = this.Q1;
        if (v80Var2 != null) {
            v80Var2.d(true);
        }
        this.f25470o5 = null;
        this.R1 = null;
        if (this.f25484p5 != null) {
            if (this.f25539t5 == i10 || i10 == -1) {
                this.f25484p5 = null;
                this.f25539t5 = -1;
                this.Od = false;
                this.Pd = false;
                invalidate();
            }
        }
    }

    public final void G0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                int i10 = 0;
                if (this.N8 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), this.N8.length);
                    z11 = false;
                    for (int i11 = 0; i11 < min; i11++) {
                        CheckBoxBase checkBoxBase = this.N8[i11];
                        if (checkBoxBase != null && checkBoxBase.f26324q) {
                            z11 = true;
                        }
                    }
                } else {
                    z11 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z14 = this.f25385i6;
                if (!z14 && !this.f25485p6 && this.f25456n6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z14 && !this.f25485p6 && !this.f25471o6) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z15 = poll.public_voters;
                if (this.f25415k6) {
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
                } else if (!this.N7 && z15 && ((z14 && (!this.f25441m6 || this.f25456n6)) || (this.f25485p6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                } else {
                    charSequence = null;
                }
                if (i10 != 0) {
                    if (this.V5 == null) {
                        dh.d dVar = new dh.d(this, this.Ed);
                        this.V5 = dVar;
                        dVar.setCallback(this);
                        dVar.f5643a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.Y2 = charSequence;
                    this.V5.d.q(charSequence, z10, true);
                    this.N2 = true;
                    this.X2 = i10;
                    o1();
                }
                S0(z10);
            }
        }
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i10) {
        q1 q1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.U5;
            if (i10 < arrayList.size()) {
                int i11 = ((q1) arrayList.get(i10)).f25029b;
                int i12 = this.Hc;
                float f9 = i11 + i12;
                r1 r1Var = this.Vc;
                if (r1Var.f25182t2) {
                    float f10 = r1Var.K1;
                    f9 += ((1.0f - f10) * r1Var.f25186u2) + (i12 * f10);
                    if (this.f25556u7.needDrawForwarded()) {
                        f9 -= this.Hc;
                    }
                }
                if (r1Var.f25191w0) {
                    f9 += r1Var.f25138j0;
                }
                return f9 + q1Var.f25030c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f25268a4 != null) {
            this.f25268a4 = null;
        }
        ArrayList arrayList = this.f25585w5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25569v5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean H0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        j1 j1Var;
        boolean c3 = kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = this.E7;
        if (!c3 && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f25556u7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (j1Var = this.Fc) != null && j1Var.c1(3, this) && TextUtils.equals(this.Fc.g(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f25556u7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.U5;
            if (i10 < arrayList.size()) {
                int i11 = ((q1) arrayList.get(i10)).f25029b;
                int i12 = this.Hc;
                float f9 = i11 + i12;
                r1 r1Var = this.Vc;
                if (r1Var.f25182t2) {
                    float f10 = r1Var.K1;
                    f9 += ((1.0f - f10) * r1Var.f25186u2) + (i12 * f10);
                    if (this.f25556u7.needDrawForwarded()) {
                        f9 -= this.Hc;
                    }
                }
                if (r1Var.f25191w0) {
                    f9 += r1Var.f25138j0;
                }
                return f9 - AndroidUtilities.dp(13.0f);
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
        a1 a1Var = this.Md;
        k8.i0 i0Var = this.f25579w;
        i0Var.a(a1Var);
        a1 a1Var2 = this.Nd;
        i0Var.a(a1Var2);
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f25556u7.caption;
            } else {
                charSequence = this.f25556u7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = d10.f27630e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    d10[] d10VarArr = (d10[]) spanned.getSpans(0, spanned.length(), d10.class);
                    for (d10 d10Var : d10VarArr) {
                        if (d10Var.f27632b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(d10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(d10Var.f27632b.date));
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
                        i0Var.a(a1Var2);
                        gt gtVar = new gt(26, i0Var, a1Var2);
                        i0Var.f13514a.put(a1Var2, gtVar);
                        if (j17 > 0) {
                            AndroidUtilities.runOnUIThread(gtVar, j17);
                        } else {
                            AndroidUtilities.runOnUIThread(gtVar);
                        }
                    }
                }
            }
        }
    }

    public final boolean I0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.I0(android.view.MotionEvent):boolean");
    }

    public final void I1(float r8, android.graphics.Canvas r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.I1(float, android.graphics.Canvas, boolean):void");
    }

    public final int I2(byte[] bArr) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.U5;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((q1) arrayList.get(i10)).f25044s;
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
        return FileLoader.getInstance(this.E7).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public final void J1(android.graphics.Canvas r23, org.telegram.messenger.MessageObject.TextLayoutBlocks r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3(boolean z10, boolean z11) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z11 || (messageObject = this.f25556u7) == null || !messageObject.deletedByThanos) {
            if (z10) {
                this.f25268a4 = null;
                CheckBoxBase checkBoxBase = this.f25366h1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Ed);
                    this.f25366h1 = checkBoxBase2;
                    if (this.I0) {
                        checkBoxBase2.f26319l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
                    if (checkBoxBase.F != c6Var) {
                        checkBoxBase.F = c6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z10 && (((groupedMessages = this.G) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.f25587w7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f25352g1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Ed);
                    this.f25352g1 = checkBoxBase4;
                    if (!checkBoxBase4.f26331y) {
                        checkBoxBase4.f26331y = true;
                        checkBoxBase4.b();
                    }
                    if (this.I0) {
                        this.f25352g1.f26319l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.c6 c6Var2 = this.Ed;
                    if (checkBoxBase3.F != c6Var2) {
                        checkBoxBase3.F = c6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f9 = 0.0f;
            if (this.f25380i1 == z10) {
                if (z11 != this.f25395j1 && !z11) {
                    if (z10) {
                        f9 = 1.0f;
                    }
                    this.f25410k1 = f9;
                    invalidate();
                    return;
                }
                return;
            }
            this.f25395j1 = z11;
            this.f25380i1 = z10;
            if (z11) {
                this.l1 = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f9 = 1.0f;
                }
                this.f25410k1 = f9;
            }
            invalidate();
        }
    }

    public final boolean K0(MotionEvent motionEvent) {
        z zVar;
        s1 s1Var;
        j1 j1Var;
        TLRPC.Chat chat;
        int i10;
        TLRPC.Chat chat2;
        if (this.Va && this.Ga != null && (zVar = this.G3) != null && (this.Ub != null || this.Vb != null)) {
            boolean contains = zVar.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.H3 = contains;
                if (contains) {
                    this.G3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.G3.setState(this.f25583w3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.H3 && (j1Var = this.Fc) != null) {
                    if (this.f25588w8) {
                        TLRPC.User user = this.f25333ec;
                        if (user != null && user.bot_inline_placeholder == null) {
                            j1Var.g2(this, user.f22539id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            j1 j1Var2 = this.Fc;
                            if (publicUsername == null) {
                                publicUsername = this.f25556u7.messageOwner.via_bot_name;
                            }
                            j1Var2.m0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Ub;
                        if (user2 != null) {
                            j1Var.t0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Vb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f25556u7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f25348fc;
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
                                j1Var.S(s1Var, chat2, i10, this.f25295c1, this.f25308d1, false);
                                s1Var.G3.setState(StateSet.NOTHING);
                                s1Var.H3 = false;
                                return s1Var.H3;
                            }
                        }
                    }
                }
                s1Var = this;
                s1Var.G3.setState(StateSet.NOTHING);
                s1Var.H3 = false;
                return s1Var.H3;
            }
            s1Var = this;
            return s1Var.H3;
        }
        this.H3 = false;
        return false;
    }

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f9;
        MessageObject messageObject2 = this.f25556u7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f25556u7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f25556u7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.f25366h1 != null) {
                if (this.f25380i1 || this.f25395j1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
                    if (groupedMessagePosition != null) {
                        int i10 = groupedMessagePosition.flags;
                        if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y8 = getY() + getPaddingTop();
                    MessageObject.GroupedMessages groupedMessages = this.G;
                    if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                        f9 = (getTop() + this.G.transitionParams.offsetTop) - getTranslationY();
                    } else {
                        f9 = y8 + this.Vc.f25138j0;
                    }
                    canvas.translate(this.E8, f9 + this.f25435le);
                    this.f25366h1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.Ed);
    }

    public final void K3(boolean z10, boolean z11) {
        this.f25373h8 = z10;
        this.f25272a8 = z11;
        s4();
        if (this.B5) {
            this.D5.f27535o = f3();
        } else {
            this.C5.f34459p = f3();
        }
        invalidate();
    }

    public final boolean L0(MotionEvent motionEvent) {
        j1 j1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Va && this.Ga != null && this.G3 != null && ((this.Ub != null || this.Vb != null) && this.Yb != null && this.f25291bc != null)) {
            boolean contains = this.M3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.N3 = contains;
                if (contains) {
                    this.M3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.M3.setState(this.f25583w3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.N3 && (j1Var = this.Fc) != null && (user = this.Ub) != null) {
                    Drawable drawable = this.f25291bc.f30849f[0];
                    if (drawable instanceof org.telegram.ui.Components.p5) {
                        document = ((org.telegram.ui.Components.p5) drawable).f31588e;
                    } else {
                        document = null;
                    }
                    j1Var.V1(this, user, document, this.f25276ac);
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

    public final void L1(Canvas canvas, boolean z10, boolean z11, float f9, float f10, float f11, float f12, float f13, boolean z12) {
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
        r1 r1Var = this.Vc;
        kg.r0 r0Var = this.J;
        if (z10) {
            if (!this.f25556u7.isOutOwner()) {
                fc0 fc0Var = org.telegram.ui.ActionBar.g6.E3;
                if (f4()) {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23352tc, this.Ed);
                } else {
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.g6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23352tc;
                    }
                    v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.Ed);
                }
                fc0Var.a(v02);
                if (f4()) {
                    f15 = (getPhotoBottom() + this.f25479p0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.B && !this.A) {
                        f14 = 8.5f;
                    } else {
                        f14 = 9.5f;
                    }
                    float dp2 = (f9 - AndroidUtilities.dp(f14)) + f11;
                    if (this.f25447md) {
                        if (this.F) {
                            f16 = 4.0f;
                        } else {
                            f16 = 5.0f;
                        }
                        float i12 = r0Var.i(r1Var.K1);
                        f15 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (i12 + AndroidUtilities.dp(f16)));
                    } else {
                        f15 = dp2;
                    }
                }
                if (!this.f25556u7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                a0.p(fc0Var, f12 + i11, f15 - AndroidUtilities.dp(12.0f));
                fc0Var.setAlpha((int) (f18 * 255.0f));
                if (z13) {
                    canvas.save();
                    canvas.scale(f17, f17, fc0Var.getBounds().centerX(), fc0Var.getBounds().centerY());
                }
                fc0Var.draw(canvas);
                fc0Var.setAlpha(255);
                invalidate();
                if (z13) {
                    canvas.restore();
                }
            }
        } else if (z11 && !this.f25556u7.isOutOwner()) {
            if (!this.f25556u7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f19 = f12 + i11;
            float f20 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f25479p0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.B && !this.A) {
                    f20 = 20.5f;
                }
                dp = (f9 - AndroidUtilities.dp(f20)) + f11;
                if (this.f25447md) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * r0Var.i(r1Var.K1);
                }
            }
            RectF rectF = this.Y4;
            rectF.set(f19, dp, AndroidUtilities.dp(14.0f) + f19, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.g6.f23023b2.getAlpha();
            int i13 = (int) (f18 * 255.0f);
            org.telegram.ui.ActionBar.g6.f23023b2.setAlpha(i13);
            if (z13) {
                canvas.save();
                canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.f23023b2);
            org.telegram.ui.ActionBar.g6.f23023b2.setAlpha(alpha);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
        if (c6Var != null) {
            drawable = c6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.g6.O0(str);
    }

    public final void L3(boolean z10, boolean z11, boolean z12) {
        MessageObject messageObject;
        if (z10 || !z12 || (messageObject = this.f25556u7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.f25366h1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z11, z12);
            }
            CheckBoxBase checkBoxBase2 = this.f25352g1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z10, z12);
            }
            ma0 ma0Var = this.Gc;
            float f9 = 0.0f;
            if (ma0Var.f30631e == z11) {
                if (ma0Var.f30632f != z12 && !z12) {
                    if (z11) {
                        f9 = 1.0f;
                    }
                    ma0Var.d = f9;
                    ma0Var.f30632f = false;
                    return;
                }
                return;
            }
            ma0Var.f30631e = z11;
            ma0Var.f30632f = z12;
            if (z12) {
                ma0Var.f30630c = SystemClock.elapsedRealtime();
            } else {
                if (z11) {
                    f9 = 1.0f;
                }
                ma0Var.d = f9;
            }
            ma0Var.a();
            s1 s1Var = ma0Var.f30638m;
            if (s1Var != null) {
                s1Var.invalidate();
                if (s1Var.getParent() != null) {
                    ((ViewGroup) s1Var.getParent()).invalidate();
                }
            }
        }
    }

    public final boolean M0(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.M0(org.telegram.messenger.MessageObject):boolean");
    }

    public final void M1(Canvas canvas, float f9) {
        if (this.f25501qa == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.V8 != null) {
                this.Da -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f10 = this.Ca;
            float f11 = this.Da + dp;
            RectF rectF = this.Y4;
            rectF.set(f10, this.Da, AndroidUtilities.dp(32.0f) + f10, f11);
            p0();
            String str = "paintChatActionBackground";
            int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
            if (i10 != 0) {
                int alpha = M2("paintChatActionBackground").getAlpha();
                M2("paintChatActionBackground").setAlpha((int) (alpha * f9));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), M2("paintChatActionBackground"));
                M2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.f25544ta) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.g6.f23130h2.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23130h2.setAlpha((int) (alpha2 * f9));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.f23130h2);
                    org.telegram.ui.ActionBar.g6.f23130h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.f23130h2);
                }
            }
            Drawable O0 = org.telegram.ui.ActionBar.g6.O0("drawableCommentSticker");
            a0.p(O0, this.Ca + AndroidUtilities.dp(4.0f), this.Da + AndroidUtilities.dp(4.0f));
            if (i10 != 0) {
                O0.setAlpha((int) (f9 * 255.0f));
                O0.draw(canvas);
                O0.setAlpha(255);
            } else {
                O0.draw(canvas);
            }
            if (this.V8 != null) {
                org.telegram.ui.ActionBar.g6.E2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xc, this.Ed));
                org.telegram.ui.ActionBar.g6.E2.setAlpha((int) (f9 * 255.0f));
                r1 r1Var = this.Vc;
                if (r1Var.U) {
                    if (r1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.g6.E2.setAlpha((int) ((1.0d - r1Var.K1) * 255.0d * f9));
                        canvas.translate(this.Ca + ((AndroidUtilities.dp(32.0f) - r1Var.X) / 2), this.Da + AndroidUtilities.dp(30.0f));
                        r1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.g6.E2.setAlpha((int) (r1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Ca + ((AndroidUtilities.dp(32.0f) - this.f25316d9) / 2), this.Da + AndroidUtilities.dp(30.0f));
                this.V8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
        if (c6Var != null) {
            paint = c6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final boolean M3(boolean z10) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        s1 s1Var;
        if (this.f25556u7.isDice()) {
            Drawable drawable = this.O0.getDrawable();
            if (drawable instanceof ti0) {
                final ti0 ti0Var = (ti0) drawable;
                String diceEmoji = this.f25556u7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.E7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.E7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f25556u7.getDiceValue();
                if ("🎰".equals(this.f25556u7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        pv0 pv0Var = (pv0) ti0Var;
                        if (pv0Var.Q0 != null || pv0Var.R0) {
                            s1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int U = pv0.U(i10 & 3);
                            int U2 = pv0.U((i10 >> 2) & 3);
                            int U3 = pv0.U(i10 >> 4);
                            if (U == 4 && U2 == 4 && U3 == 4) {
                                U = 5;
                                U3 = 5;
                                U2 = 5;
                            }
                            pv0Var.X0 = U;
                            pv0Var.Y0 = U2;
                            pv0Var.Z0 = U3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            pv0Var.R0 = true;
                            s1Var = this;
                            Utilities.globalQueue.postRunnable(new org.telegram.messenger.r1(pv0Var, stickerSetByEmojiOrName, i11, messageObject, s1Var, z10));
                        }
                        if (s1Var.f25556u7.isOut()) {
                            ti0Var.P(Integer.MAX_VALUE, s1Var.f25305cd);
                        }
                        s1Var.f25556u7.wasUnread = false;
                    } else {
                        s1Var = this;
                    }
                    if (ti0Var.f34744j0 == null && !ti0Var.U0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        pv0 pv0Var2 = (pv0) ti0Var;
                        if (pv0Var2.f34744j0 == null && !pv0Var2.U0) {
                            pv0Var2.U0 = true;
                            Utilities.globalQueue.postRunnable(new bg.j3(pv0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), s1Var, 19));
                            return true;
                        }
                    }
                } else {
                    if (ti0Var.f34744j0 == null && !ti0Var.U0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.E7).getPathToAttach(document, true);
                        if (ti0Var.f34744j0 == null && !ti0Var.U0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.E7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f25556u7, this);
                                FileLoader.getInstance(this.E7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                ti0Var.U0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ti0 ti0Var2 = ti0Var;
                                                String str = readRes;
                                                if (ti0Var2.S0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ti0 ti0Var3 = ti0Var2;
                                                                    ti0Var3.U0 = false;
                                                                    if (!ti0Var3.R0 && ti0Var3.S0) {
                                                                        ti0Var3.A(true);
                                                                        return;
                                                                    }
                                                                    ti0Var3.j();
                                                                    ti0Var3.G();
                                                                    ti0Var3.v();
                                                                    return;
                                                                default:
                                                                    ti0 ti0Var4 = ti0Var2;
                                                                    ti0Var4.R0 = false;
                                                                    if (!ti0Var4.U0 && ti0Var4.S0) {
                                                                        ti0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ti0Var2.Q0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i12 = 0;
                                                if (ti0Var2.Q0 != null) {
                                                    i12 = ti0Var2.Q0.f26476a[0];
                                                }
                                                if (ti0Var2.Q0 != null) {
                                                    int i13 = ti0Var2.Q0.f26476a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new i8(ti0Var2, i12, 7));
                                                return;
                                            default:
                                                final ti0 ti0Var3 = ti0Var;
                                                ti0Var3.f34744j0 = RLottieNative.b(readRes, "dice", ti0Var3.f34737e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ti0 ti0Var32 = ti0Var3;
                                                                ti0Var32.U0 = false;
                                                                if (!ti0Var32.R0 && ti0Var32.S0) {
                                                                    ti0Var32.A(true);
                                                                    return;
                                                                }
                                                                ti0Var32.j();
                                                                ti0Var32.G();
                                                                ti0Var32.v();
                                                                return;
                                                            default:
                                                                ti0 ti0Var4 = ti0Var3;
                                                                ti0Var4.R0 = false;
                                                                if (!ti0Var4.U0 && ti0Var4.S0) {
                                                                    ti0Var4.A(true);
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
                        if (!z10 && this.f25556u7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.E7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            ti0Var.P(diceFrameSuccess.frame, this.f25305cd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.E7).getPathToAttach(document2, true);
                        if (ti0Var.Q0 == null && !ti0Var.R0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.E7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f25556u7, this);
                                FileLoader.getInstance(this.E7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f25556u7.wasUnread = false;
                            } else {
                                if (z10 && ti0Var.O == null && ti0Var.N == null && ti0Var.M == null) {
                                    ti0Var.G = 2;
                                    ti0Var.T0 = true;
                                }
                                ti0Var.R0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final ti0 ti0Var2 = ti0Var;
                                                String str = readRes2;
                                                if (ti0Var2.S0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    ti0 ti0Var32 = ti0Var2;
                                                                    ti0Var32.U0 = false;
                                                                    if (!ti0Var32.R0 && ti0Var32.S0) {
                                                                        ti0Var32.A(true);
                                                                        return;
                                                                    }
                                                                    ti0Var32.j();
                                                                    ti0Var32.G();
                                                                    ti0Var32.v();
                                                                    return;
                                                                default:
                                                                    ti0 ti0Var4 = ti0Var2;
                                                                    ti0Var4.R0 = false;
                                                                    if (!ti0Var4.U0 && ti0Var4.S0) {
                                                                        ti0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                ti0Var2.Q0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i12 = 0;
                                                if (ti0Var2.Q0 != null) {
                                                    i12 = ti0Var2.Q0.f26476a[0];
                                                }
                                                if (ti0Var2.Q0 != null) {
                                                    int i13 = ti0Var2.Q0.f26476a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new i8(ti0Var2, i12, 7));
                                                return;
                                            default:
                                                final ti0 ti0Var3 = ti0Var;
                                                ti0Var3.f34744j0 = RLottieNative.b(readRes2, "dice", ti0Var3.f34737e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                ti0 ti0Var32 = ti0Var3;
                                                                ti0Var32.U0 = false;
                                                                if (!ti0Var32.R0 && ti0Var32.S0) {
                                                                    ti0Var32.A(true);
                                                                    return;
                                                                }
                                                                ti0Var32.j();
                                                                ti0Var32.G();
                                                                ti0Var32.v();
                                                                return;
                                                            default:
                                                                ti0 ti0Var4 = ti0Var3;
                                                                ti0Var4.R0 = false;
                                                                if (!ti0Var4.U0 && ti0Var4.S0) {
                                                                    ti0Var4.A(true);
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
                        this.f25556u7.wasUnread = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
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
        int i12 = this.G1;
        if ((i12 != 5 && i12 != 1) || (groupedMessagePosition = this.H) == null || (groupedMessagePosition.flags & 4) != 0) {
            int i13 = this.f25556u7.type;
            if (i13 == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f25339f2 && !this.f25353g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                int x4 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f25509r3;
                if (action == 0) {
                    MessageObject messageObject = this.f25556u7;
                    if (messageObject.type == 16) {
                        boolean isVideoCall = messageObject.isVideoCall();
                        int i14 = this.O4;
                        if (x4 >= i14) {
                            if (LocaleController.isRTL) {
                                dp = 0;
                            } else {
                                dp = this.F8 - AndroidUtilities.dp(70.0f);
                            }
                            int i15 = i14 + dp;
                            if (!isVideoCall) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            if (x4 <= AndroidUtilities.dp(i10 + 30) + i15 && z22 >= this.P4 - AndroidUtilities.dp(14.0f)) {
                                if (z22 <= AndroidUtilities.dp(50.0f) + this.P4) {
                                    this.V4 = true;
                                    this.f25537t3[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i16 = this.O4;
                                        if (LocaleController.isRTL) {
                                            dp2 = 0;
                                        } else {
                                            dp2 = this.F8 - AndroidUtilities.dp(70.0f);
                                        }
                                        int i17 = i16 + dp2;
                                        if (!isVideoCall) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int dp3 = AndroidUtilities.dp(i11) + i17;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.G4;
                                        int A = org.telegram.ui.b.A(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int y8 = org.telegram.ui.b.y(2, this.P4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(A - AndroidUtilities.dp(20.0f), y8 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + A, AndroidUtilities.dp(20.0f) + y8);
                                        drawableArr[0].setHotspot(x4, z22);
                                        drawableArr[0].setState(this.f25583w3);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x4 >= this.O4 - AndroidUtilities.dp(20.0f)) {
                        if (x4 <= AndroidUtilities.dp(20.0f) + this.O4 && z22 >= this.P4 - AndroidUtilities.dp(4.0f)) {
                            if (z22 <= AndroidUtilities.dp(30.0f) + this.P4) {
                                this.V4 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.V4) {
                        if (this.f25556u7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.V4 = false;
                        playSoundEffect(0);
                        this.Fc.B0(this, this.O4, this.P4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f25556u7.type == 16 && this.V4 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x4, z22);
                }
            }
        }
        return false;
    }

    public final void N1(android.graphics.Canvas r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.N1(android.graphics.Canvas, float):void");
    }

    public final float N2(float f9) {
        float f10;
        float f11;
        if (f4() && this.G1 != 7) {
            return ((getPhotoBottom() + this.f25479p0) - AndroidUtilities.dp(7.3f)) - this.f25419kb.getHeight();
        }
        int i10 = this.I8;
        if (!this.B && !this.A) {
            f10 = 6.5f;
        } else {
            f10 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f10)) - this.f25419kb.getHeight()) + f9;
        boolean z10 = this.f25447md;
        r1 r1Var = this.Vc;
        if (z10) {
            if (this.F) {
                f11 = 4.0f;
            } else {
                f11 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.J.i(r1Var.K1) + AndroidUtilities.dp(f11));
        }
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f12 = dp + transitionParams.offsetBottom;
            if (transitionParams.backgroundChangeBounds) {
                return f12 - getTranslationY();
            }
            return f12;
        }
        return (r1Var.f25133i0 - r1Var.f25138j0) + dp;
    }

    public final void N3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            cj0 cj0Var = this.f25320de;
            r1 r1Var = this.Vc;
            if (cj0Var != null && cj0Var.h) {
                this.f25435le = 0.0f;
            } else {
                float f9 = i11 + i13 + r1Var.f25133i0;
                this.f25435le = f9 - ((int) f9);
            }
            drawable.setBounds((int) (i10 + r1Var.f25124g0), (int) (i11 + r1Var.f25138j0), (int) (i10 + i12 + r1Var.f25128h0), (int) (i11 + i13 + r1Var.f25133i0));
        }
    }

    public final boolean O0(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.O0(android.view.MotionEvent):boolean");
    }

    public final void O1(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.O1(android.graphics.Canvas):void");
    }

    public final int O2(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.U5;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((q1) arrayList.get(i11)).f25045t;
                if (todoItem != null && todoItem.f22537id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f25300c8 = true;
        this.f25315d8 = 1000;
        this.f25345f8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        lu0 Y1;
        int intValue;
        j1 j1Var = this.Fc;
        if (j1Var == null) {
            Y1 = null;
        } else {
            Y1 = j1Var.Y1();
        }
        lu0 lu0Var = Y1;
        if (this.f25556u7 != null) {
            lh.x2 x2Var = this.O0;
            if (x2Var.hasNotThumb() && lu0Var != null && !this.f25556u7.isSticker() && !this.f25556u7.isAnimatedEmoji() && ((!this.f25556u7.isVideo() || this.f25401j7) && !this.f25447md && !this.f25556u7.isAnimatedSticker() && ((!this.f25556u7.isDocument() || this.f25556u7.isGif()) && !this.f25556u7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f25556u7;
                gh.j jVar = this.Bb;
                if (jVar == null) {
                    intValue = 0;
                } else {
                    Integer num = (Integer) jVar.f7400k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    intValue = num.intValue();
                }
                return lu0Var.a(motionEvent, this, x2Var, messageObject, intValue);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.Y3 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f25571v7;
        if (messageObject == null) {
            messageObject = this.f25556u7;
        }
        if (messageObject == null) {
            this.f25268a4 = null;
            return;
        }
        li0 li0Var = this.f25268a4;
        if (li0Var == null || !li0Var.f30339f || !Arrays.equals(li0Var.f30340g, bArr)) {
            this.f25268a4 = new li0(this, messageObject.getId(), bArr);
        }
        this.f25549u0 = true;
    }

    public final boolean Q0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.Q0(android.view.MotionEvent):boolean");
    }

    public final void Q1(Canvas canvas) {
        float f9;
        int i10;
        float f10;
        int dp;
        int extraTextX;
        int i11;
        float f11;
        float f12;
        int dp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f13 = 1.0f;
            if (this.J1) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            r1 r1Var = this.Vc;
            if (r1Var.R2) {
                f9 = AndroidUtilities.lerp(1.0f - f9, f9, r1Var.K1);
            }
            float f14 = 1.0f * f9;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + r1Var.f25128h0;
            if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.F) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.G;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f25426l4;
            } else if (this.f25556u7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25513r8;
                if (this.f25556u7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f25359g8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f25513r8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f25513r8;
                    if (this.F) {
                        f10 = 12.0f;
                    } else {
                        f10 = 18.0f;
                    }
                    dp = AndroidUtilities.dp(f10) + i12;
                    extraTextX = getExtraTextX();
                }
                i11 = extraTextX + dp;
            }
            int dp4 = ((int) (i11 + r1Var.f25124g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.m0;
            float f15 = dp4;
            int i14 = (int) (dp3 - f15);
            int i15 = this.f25281b2;
            if (r1Var.X2) {
                i15 = AndroidUtilities.lerp(r1Var.T2, i15, r1Var.K1);
            }
            if (this.V1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (r1Var.Z2) {
                AndroidUtilities.lerp(1.0f - f11, f11, r1Var.K1);
            }
            if (this.Z9 == null) {
                this.Z9 = new ql0(this);
            }
            int o10 = this.Z9.o(this.Ed);
            canvas.save();
            canvas.translate(f15, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            uc ucVar = this.N1;
            if (ucVar != null) {
                f12 = ucVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.Z9.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.Z9.e(canvas, rectF, f14);
            zz0 zz0Var = this.K1;
            if (zz0Var != null) {
                zz0Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f14, o10, canvas);
                if (this.L1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.K1.f35462c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.L1.f35462c, AndroidUtilities.dp(21.66f));
                    uc ucVar2 = this.M1;
                    if (ucVar2 != null) {
                        f13 = ucVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.Z9.f31989g);
                    this.L1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f14, o10, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f25571v7;
        if (messageObject == null) {
            messageObject = this.f25556u7;
        }
        this.f25549u0 = false;
        ArrayList arrayList = this.f25585w5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.Y3 != null && !TextUtils.isEmpty(messageObject.caption)) {
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
                        while (i17 < this.Y3.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.Y3.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f25534t0 = i17;
                                this.f25549u0 = false;
                                G3();
                                try {
                                    s80 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, B3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.Y3.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.Y3.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            s80 B32 = B3();
                                            B32.d(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                            textLayoutBlock2.textLayout.getSelectionPath(0, i13 - textLayoutBlock2.charactersOffset, B32);
                                        } while (i13 >= (textLayoutBlock.charactersOffset + i15) - 1);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
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
                            this.f25534t0 = i19;
                            this.f25549u0 = false;
                            G3();
                            try {
                                s80 B33 = B3();
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
                                        s80 B34 = B3();
                                        B34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i10 - textLayoutBlock4.charactersOffset, B34);
                                    } while (i10 >= (textLayoutBlock3.charactersOffset + i12) - 1);
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            invalidate();
                            return;
                        }
                        i19++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f25534t0 = -1;
                this.f25549u0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f25534t0 = -1;
            this.f25549u0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        bh.j jVar;
        bh.j jVar2;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            bh.j jVar3 = this.X5;
            if (jVar3 != null) {
                if (jVar3.T && jVar3.f2670a.f49506f && jVar3.G.f(x4 - jVar3.H, z22 - jVar3.I, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25280b1 = true;
                    invalidate();
                    return true;
                }
                bh.j jVar4 = this.X5;
                if ((jVar4.T || jVar4.S) && jVar4.j(x4, z22, action)) {
                    this.f25280b1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f25556u7.expandedExplanation && (jVar2 = this.Y5) != null) {
                if (jVar2.T && jVar2.f2670a.f49506f && jVar2.G.f(x4 - jVar2.H, z22 - jVar2.I, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f25280b1 = true;
                    invalidate();
                    return true;
                }
                bh.j jVar5 = this.Y5;
                if ((jVar5.T || jVar5.S) && jVar5.j(x4, z22, action)) {
                    this.f25280b1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.J6 = -1;
                bh.j jVar6 = this.X5;
                if (jVar6 != null && jVar6.O && jVar6.getBounds().contains(x4, z22)) {
                    this.J6 = -2;
                    invalidate();
                    return true;
                } else if (this.f25556u7.expandedExplanation && (jVar = this.Y5) != null && jVar.O && jVar.getBounds().contains(x4, z22)) {
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
                int i10 = this.J6;
                if (i10 == -2) {
                    bh.j jVar7 = this.X5;
                    ImageReceiver imageReceiver = jVar7.f2672b;
                    TLRPC.MessageMedia messageMedia = jVar7.P;
                    j1 j1Var = this.Fc;
                    if (j1Var != null) {
                        j1Var.n(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    bh.j jVar8 = this.Y5;
                    ImageReceiver imageReceiver2 = jVar8.f2672b;
                    TLRPC.MessageMedia messageMedia2 = jVar8.P;
                    j1 j1Var2 = this.Fc;
                    if (j1Var2 != null) {
                        j1Var2.n(this, null, messageMedia2, -3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.R1(android.graphics.Canvas):void");
    }

    public final boolean R2() {
        org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
        if (c6Var != null) {
            return c6Var.l0();
        }
        return org.telegram.ui.ActionBar.g6.a1();
    }

    public final void R3(int i10) {
        MessageObject messageObject = this.f25571v7;
        if (messageObject == null) {
            messageObject = this.f25556u7;
        }
        if (messageObject == null) {
            this.f25268a4 = null;
            return;
        }
        li0 li0Var = this.f25268a4;
        if (li0Var == null || !li0Var.f30338e || li0Var.f30337c != (-i10)) {
            this.f25268a4 = new li0(this, messageObject.getId(), i10);
        }
        this.f25549u0 = true;
    }

    public final void S0(boolean z10) {
        MessageObject messageObject;
        boolean z11;
        if (this.V5 != null && (messageObject = this.f25556u7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f25556u7);
            boolean z12 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z11 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z11 = false;
            }
            dh.d dVar = this.V5;
            if (z11 && SendMessagesHelper.getInstance(this.E7).isSendingVote(this.f25556u7) != null) {
                z12 = true;
            }
            vd.a aVar = dVar.f5647f;
            if (aVar.f49506f != z12) {
                aVar.a(z12, z10);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f25556u7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f25499q7) {
            return true;
        }
        return false;
    }

    public final void S3(String str) {
        T3(str, false, false, -1);
    }

    public final boolean T0(MotionEvent motionEvent) {
        j1 j1Var;
        int i10;
        s1 s1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (this.f25616y9 == null || (j1Var = this.Fc) == null || !j1Var.j0()) {
            return false;
        }
        float x4 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f25556u7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.F9, this.H9) + this.C9;
        } else {
            i10 = this.f25527s8 + this.C9;
        }
        if (motionEvent.getAction() == 0) {
            if (x4 >= this.C9 && x4 <= i10) {
                float f9 = this.D9;
                if (z22 >= f9 && z22 <= f9 + this.E9) {
                    this.M9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.Q9 = x4;
                    this.R9 = getY() + z22;
                    z zVar = this.f25576vc;
                    if (zVar != null) {
                        zVar.setHotspot(x4, z22);
                        this.N9 = false;
                        this.O9 = true;
                        postDelayed(new a1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    uc ucVar = this.f25502qc;
                    if (ucVar != null) {
                        ucVar.c(true);
                        this.f25546tc = x4;
                        this.f25561uc = z22;
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
                    z zVar2 = this.f25576vc;
                    if (zVar2 != null) {
                        if (!this.N9) {
                            zVar2.setState(new int[]{16842919, 16842910});
                            post(new a1(5, this));
                        } else {
                            zVar2.setState(new int[0]);
                        }
                        this.N9 = false;
                        this.O9 = false;
                        invalidate();
                    }
                    uc ucVar2 = this.f25502qc;
                    if (ucVar2 != null) {
                        ucVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.f25391ic) {
                        j1 j1Var2 = this.Fc;
                        if (j1Var2 != null) {
                            TLRPC.Chat chat = this.f25348fc;
                            if (chat != null) {
                                j1Var2.S(this, chat, this.f25556u7.messageOwner.fwd_from.channel_post, this.f25295c1, this.f25308d1, false);
                                s1Var = this;
                            } else {
                                s1Var = this;
                                TLRPC.User user = s1Var.f25318dc;
                                if (user != null) {
                                    j1Var2.t0(this, user, s1Var.f25295c1, s1Var.f25308d1);
                                } else if (s1Var.gc != null) {
                                    j1Var2.o(this);
                                }
                            }
                        }
                    } else {
                        s1Var = this;
                        if (s1Var.Fc != null && (s1Var.f25556u7.hasValidReplyMessageObject() || s1Var.f25556u7.isReplyToStory() || s1Var.f25558u9 || ((message = s1Var.f25556u7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            s1Var.Fc.b2(s1Var, s1Var.f25556u7.getReplyMsgId(), x4, z22, false);
                        }
                    }
                }
            } else {
                s1Var = this;
                if (motionEvent.getAction() == 3) {
                    s1Var.M9 = false;
                    s1Var.N9 = false;
                    z zVar3 = s1Var.f25576vc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    uc ucVar3 = s1Var.f25502qc;
                    if (ucVar3 != null) {
                        ucVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x4 >= s1Var.C9 && x4 <= i10) {
                        float f10 = s1Var.D9;
                        if (z22 >= f10 && z22 <= f10 + s1Var.E9) {
                            if (s1Var.f25576vc != null && s1Var.O9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - s1Var.R9, 2.0d) + Math.pow(x4 - s1Var.Q9, 2.0d)) > 0.75d) {
                                    s1Var.O9 = false;
                                }
                            }
                        }
                    }
                    s1Var.M9 = false;
                    s1Var.N9 = false;
                    s1Var.O9 = false;
                    z zVar4 = s1Var.f25576vc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    uc ucVar4 = s1Var.f25502qc;
                    if (ucVar4 != null) {
                        ucVar4.c(false);
                    }
                }
            }
            return s1Var.M9;
        }
        s1Var = this;
        return s1Var.M9;
    }

    public final void T1(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.T1(android.graphics.Canvas, float):void");
    }

    public final boolean T2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.T2():boolean");
    }

    public final boolean T3(java.lang.String r19, boolean r20, boolean r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.T3(java.lang.String, boolean, boolean, int):boolean");
    }

    public final boolean U0(int i10, MotionEvent motionEvent) {
        int i11;
        gh.k kVar;
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
        if (this.f25556u7.hasValidGroupId() && (groupedMessages = this.G) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.G.groupId) {
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
        if (this.f25541t7) {
            return false;
        }
        int x4 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        r1 r1Var = this.Vc;
        if (actionMasked == 0) {
            int i20 = this.f25394j0;
            if (x4 >= i20 && z22 >= (i16 = this.f25450n0)) {
                MessageObject messageObject = this.f25556u7;
                if (x4 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(r1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25556u7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f25556u7.textLayoutBlocks, r1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f25556u7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (gh.k kVar2 : textLayoutBlock.spoilers) {
                            if (kVar2.getBounds().contains((x4 - this.f25394j0) + i17, (int) ((z22 - this.f25450n0) - textLayoutBlock.textYOffset(this.f25556u7.textLayoutBlocks, r1Var)))) {
                                this.f25526s7 = kVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.Y3 != null) {
                float f9 = x4;
                float f10 = this.f25426l4;
                if (f9 >= f10) {
                    float f11 = z22;
                    float f12 = this.f25439m4;
                    if (f11 >= f12 && f9 <= f10 + textLayoutBlocks.textWidth && f11 <= f12 + textLayoutBlocks.textHeight(r1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.Y3.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.Y3.textLayoutBlocks, r1Var) <= f11; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.Y3.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (gh.k kVar3 : textLayoutBlock2.spoilers) {
                                if (kVar3.getBounds().contains((int) ((f9 - this.f25426l4) + i15), (int) ((f11 - this.f25439m4) - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, r1Var)))) {
                                    this.f25526s7 = kVar3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f25311d4 == null) {
                return false;
            }
            float f13 = x4;
            float f14 = this.W6;
            if (f13 < f14) {
                return false;
            }
            float f15 = z22;
            float f16 = this.X6;
            if (f15 <= f16 || f13 > f14 + textLayoutBlocks2.textWidth || f15 > f16 + textLayoutBlocks2.textHeight(r1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f25311d4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f25311d4.textLayoutBlocks, r1Var) <= f15; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f25311d4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (gh.k kVar4 : textLayoutBlock3.spoilers) {
                    if (kVar4.getBounds().contains((int) ((f13 - this.W6) + i14), (int) ((f15 - this.X6) - textLayoutBlock3.textYOffset(this.f25311d4.textLayoutBlocks, r1Var)))) {
                        this.f25526s7 = kVar4;
                        return true;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f25526s7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Jd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f25311d4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (gh.k kVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = kVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f25311d4.textLayoutBlocks, r1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f25311d4.textLayoutBlocks, r1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.Y3;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (gh.k kVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = kVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.Y3.textLayoutBlocks, r1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.Y3.textLayoutBlocks, r1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f25556u7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (gh.k kVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = kVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f25556u7.textLayoutBlocks, r1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f25556u7.textLayoutBlocks, r1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.Y4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f25541t7 = true;
            this.f25526s7.f7417q = new a1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f25311d4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f25311d4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (gh.k kVar8 : textLayoutBlock11.spoilers) {
                        kVar8.j((x4 - this.W6) + i13, (z22 - textLayoutBlock11.textYOffset(this.f25311d4.textLayoutBlocks, r1Var)) - this.X6, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.Y3;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.Y3.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (gh.k kVar9 : textLayoutBlock13.spoilers) {
                        kVar9.j((x4 - this.f25426l4) + i12, (z22 - textLayoutBlock13.textYOffset(this.Y3.textLayoutBlocks, r1Var)) - this.f25439m4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f25556u7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f25556u7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (gh.k kVar10 : textLayoutBlock15.spoilers) {
                            kVar10.j((x4 - this.f25394j0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f25556u7.textLayoutBlocks, r1Var)) - this.f25450n0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof jl0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof s1) {
                        s1 s1Var2 = (s1) childAt2;
                        ArrayList arrayList10 = s1Var2.Hd;
                        if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((gh.k) arrayList10.get(0)).f7417q = new ha(6, this, s1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((gh.k) obj).j(kVar.getBounds().centerX(), kVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f25526s7 = null;
            return true;
        }
    }

    public final void U1(float r37, float r38, android.graphics.Canvas r39, java.util.ArrayList r40, float r41, boolean r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.U1(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public final boolean U2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.U2():boolean");
    }

    public final void U3(float f9, float f10, float f11, float f12) {
        lh.x2 x2Var = this.O0;
        x2Var.setImageCoords(f9, f10, f11, f12);
        int i10 = this.G1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.I4 = (int) (x2Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (x2Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.J4 = imageY;
        int i11 = this.I4;
        int dp = AndroidUtilities.dp(24.0f) + this.J4;
        this.L0.q(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.G4 = (int) com.google.android.recaptcha.internal.a.A(x2Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f9);
        int A = (int) com.google.android.recaptcha.internal.a.A(x2Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, x2Var.getImageY());
        this.H4 = A;
        int i12 = this.G4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.H4;
        this.K0.q(i12, A, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.isStakedDice() && !this.M) {
            Drawable drawable = this.O0.getDrawable();
            if (drawable instanceof ti0) {
                ti0 ti0Var = (ti0) drawable;
                if ((ti0Var.f34744j0 != null || ti0Var.U0) && !this.M && (i10 = ti0Var.G) != 1 && i10 == 2) {
                    if (!ti0Var.T0) {
                        float r6 = ti0Var.r();
                        if (ti0Var.Q0 != null) {
                            r6 = ti0Var.X / ti0Var.W0;
                        }
                        if (r6 <= 0.95f) {
                            return;
                        }
                    }
                    this.M = true;
                    j1 j1Var = this.Fc;
                    if (j1Var != null) {
                        j1Var.F1(this, false);
                    }
                }
            }
        }
    }

    public final void V1(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        Canvas canvas2;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f12 = this.f25450n0;
            r1 r1Var = this.Vc;
            if (r1Var.f25149l2) {
                float f13 = r1Var.f25158n2;
                float f14 = r1Var.K1;
                f9 = (f14 * f12) + ((1.0f - f14) * f13);
            } else {
                f9 = f12;
            }
            if (r1Var.K1 != 1.0f && r1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.d5 d5Var = this.f25487p8;
                if (d5Var != null) {
                    Rect bounds = d5Var.getBounds();
                    if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.B) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                cj0 cj0Var = this.f25320de;
                if (cj0Var != null && cj0Var.h) {
                    MessageObject messageObject2 = this.f25556u7;
                    U1(this.f25394j0, f9, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f25394j0, f9, canvas, r1Var.H0, r1Var.N0, false, 1.0f - r1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f25556u7;
                    U1(this.f25394j0, f9, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, r1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f15 = f9;
            boolean z10 = r1Var.D1;
            if (z10 && this.f25487p8 != null) {
                if (z10) {
                    int i12 = -1;
                    if (this.f25480p1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float z11 = com.google.android.recaptcha.internal.a.z(1.0f, r1Var.K1, this.f25556u7.textHeight(r1Var) * i11, f12);
                    float f16 = r1Var.f25158n2;
                    if (this.f25480p1) {
                        i12 = 1;
                    }
                    f10 = f16 - ((this.f25556u7.textHeight(r1Var) * i12) * r1Var.K1);
                    f11 = z11;
                } else {
                    f10 = f15;
                    f11 = f10;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f25487p8.getBounds());
                if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.B) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f17 = rectF.left;
                float f18 = r1Var.f25158n2;
                canvas.clipRect(f17, f18, rectF.right, this.f25556u7.textHeight(r1Var) + f18 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f25556u7;
                U1(this.f25394j0, f10, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - r1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f25487p8.getBounds());
                if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.B) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f25450n0, rectF.right, AndroidUtilities.dp(4.0f) + this.f25556u7.textHeight(r1Var) + i10);
                MessageObject messageObject5 = this.f25556u7;
                U1(this.f25394j0, f11, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f25556u7;
            U1(this.f25394j0, f15, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.J.f13832b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void V3(org.telegram.messenger.MessageObject r110, org.telegram.messenger.MessageObject.GroupedMessages r111, boolean r112, boolean r113, boolean r114, boolean r115) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.V3(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean, boolean, boolean):void");
    }

    public final boolean W0(MotionEvent motionEvent) {
        if (!this.da || this.f25375ha == null || this.f25531sc == null || this.Fc == null) {
            return false;
        }
        float x4 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.f25619yc;
        if (action == 0) {
            if (rectF.contains(x4, z22)) {
                this.f25531sc.c(true);
                z zVar = this.f25361ga;
                if (zVar != null) {
                    zVar.setHotspot(x4, z22);
                    this.f25361ga.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.f25531sc.h && !rectF.contains(x4, z22)) {
                this.f25531sc.c(false);
                z zVar2 = this.f25361ga;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f25531sc.h) {
                this.Fc.J0(this);
            }
            this.f25531sc.c(false);
            z zVar3 = this.f25361ga;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f25531sc.c(false);
            z zVar4 = this.f25361ga;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.f25531sc.h;
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

    public final void W3(org.telegram.messenger.MessageObject r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.W3(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final boolean X0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.X0(android.view.MotionEvent):boolean");
    }

    public final void X1(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.X1(android.graphics.Canvas):void");
    }

    public final boolean X2() {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
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
        if (this.I0) {
            V3(messageObject, groupedMessages, z10, z11, z12, z13);
            return;
        }
        this.f25571v7 = messageObject;
        this.f25587w7 = groupedMessages;
        this.f25615y7 = z10;
        this.f25602x7 = z11;
        this.f25629z7 = z12;
        this.A7 = z13;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        l9 y22;
        boolean z10;
        boolean z11;
        int i10;
        int dp;
        int i11;
        int dp2;
        int extraTextX;
        int i12;
        MessageObject.GroupedMessages groupedMessages;
        j1 j1Var = this.Fc;
        if (j1Var != null && (y22 = j1Var.y2()) != null && (y22.b() || y22.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f25556u7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            RichMessageLayout richMessageLayout = this.f25556u7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || P2() || z11) && ((this.f25338f1 || this.G != null) && (this.G == null || this.Fc.P()))) {
                if (this.f25556u7.hasValidGroupId() && (groupedMessages = this.G) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof s1) {
                                s1 s1Var = (s1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.G.groupId && (currentPosition.flags & t0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    y22.f25936c = (int) s1Var.f25426l4;
                                    y22.d = (int) s1Var.f25439m4;
                                    y22.b0(s1Var);
                                    if (s1Var == this) {
                                        return y22.N(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - s1Var.getLeft(), getTop() - s1Var.getTop());
                                    boolean N = y22.N(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - s1Var.getLeft()), -(getTop() - s1Var.getTop()));
                                    return N;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f25556u7;
                    if (messageObject != null && !messageObject.preview && this.O1 != null && z2(motionEvent) >= this.m0) {
                        y22.f24653w0 = false;
                        y22.f24655y0 = true;
                        y22.A0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.G;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f25426l4;
                        } else {
                            float f9 = 12.0f;
                            if (this.f25556u7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25513r8;
                                if (this.f25556u7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f25359g8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f25513r8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f25513r8;
                                    if (!this.F) {
                                        f9 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f9) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Vc.f25124g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.m0;
                        y22.f25936c = (AndroidUtilities.dp(10.0f) + dp3) - this.X1;
                        y22.d = AndroidUtilities.dp(22.0f) + i15;
                    } else if (P2()) {
                        y22.f24653w0 = false;
                        y22.f24655y0 = false;
                        y22.A0 = false;
                        y22.f25936c = (int) this.f25426l4;
                        y22.d = (int) this.f25439m4;
                    } else {
                        MessageObject messageObject2 = this.f25556u7;
                        if (messageObject2 != null && !messageObject2.preview && this.G2 != null && (!this.f25480p1 ? z2(motionEvent) > this.f25411k2 : z2(motionEvent) < this.f25450n0)) {
                            y22.f24653w0 = true;
                            y22.f24655y0 = false;
                            y22.A0 = false;
                            if (this.f25339f2) {
                                i11 = this.f25409k0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f25353g2) {
                                    i10 = this.f25409k0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i10 = this.f25409k0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i11 = i10 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f25452n2;
                            int i16 = this.f25411k2;
                            y22.f25936c = dp4;
                            y22.d = i16;
                        } else if (z11) {
                            y22.f24653w0 = false;
                            y22.f24655y0 = false;
                            y22.A0 = true;
                            int i17 = this.f25394j0;
                            int i18 = this.f25450n0;
                            y22.f25936c = i17;
                            y22.d = i18;
                        } else {
                            y22.f24653w0 = false;
                            y22.f24655y0 = false;
                            y22.A0 = false;
                            int i19 = this.f25394j0;
                            int i20 = this.f25450n0;
                            y22.f25936c = i19;
                            y22.d = i20;
                        }
                    }
                    y22.b0(this);
                    return y22.N(motionEvent);
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
                this.f25534t0 = i13;
                G3();
                try {
                    s80 B3 = B3();
                    B3.f31451c = true;
                    B3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, B3);
                    B3.a();
                    float f9 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            s80 B32 = B3();
                            B32.f31451c = true;
                            float f10 = f9 + textLayoutBlock2.padTop;
                            B32.d(textLayoutBlock2.textLayout, 0, f10);
                            f9 = f10 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i11 - textLayoutBlock2.charactersOffset, B32);
                            B32.a();
                            if (i11 < (textLayoutBlock.charactersOffset + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.f25549u0) {
                        this.f25300c8 = true;
                        this.f25315d8 = 2500;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.V3 = -1;
        this.W3 = -1;
    }

    public final void Y3(int i10) {
        this.f25449n = i10;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f25556u7.isSponsored() && this.f25556u7.sponsoredCanReport) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f9 = x4;
                if (f9 >= this.B2 - AndroidUtilities.dp(6.0f) && f9 <= this.B2 + this.f25624z2 + AndroidUtilities.dp(6.0f)) {
                    float f10 = z22;
                    if (f10 >= this.C2 - AndroidUtilities.dp(2.0f) && f10 <= this.C2 + this.A2 + AndroidUtilities.dp(2.0f)) {
                        uc ucVar = this.E2;
                        if (ucVar != null) {
                            ucVar.c(true);
                        }
                        this.D2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.D2) {
                j1 j1Var = this.Fc;
                if (j1Var != null) {
                    j1Var.S1();
                }
                uc ucVar2 = this.E2;
                if (ucVar2 != null) {
                    ucVar2.c(false);
                }
                playSoundEffect(0);
                this.D2 = false;
            }
        }
        return false;
    }

    public final void Z1(Canvas canvas, RectF rectF) {
        float f9;
        Path path = this.A5;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        lh.x2 x2Var = this.O0;
        float alpha = x2Var.getAlpha();
        if (this.f25556u7.isRoundOnce()) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        x2Var.setAlpha(f9 * alpha);
        x2Var.draw(canvas);
        x2Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f25399j5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i10, int i11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        this.F0 = i10;
        this.G0 = i11;
        this.Pc = i11;
        if ((this.f25556u7 != null && R2() && this.f25556u7.shouldDrawWithoutBackground()) || ((d5Var = this.f25487p8) != null && d5Var.f22860a != null)) {
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
        h1 h1Var;
        z zVar;
        if (this.H5 && ((!this.f25463nd || getVideoTranscriptionProgress() > 0.0f || this.C3) && (h1Var = this.I5) != null)) {
            int action = motionEvent.getAction();
            float x4 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (h1Var.v.contains((int) x4, (int) z22)) {
                    if (action == 0) {
                        h1Var.A = true;
                    }
                    if (h1Var.A && (zVar = h1Var.f32843q) != null) {
                        zVar.setHotspot(x4, z22);
                        h1Var.f32843q.setState(t21.N);
                        h1Var.f32844r.invalidate();
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
        org.telegram.ui.Components.c6 animation;
        int i10;
        boolean z10;
        MessageObject messageObject = this.f25556u7;
        lh.x2 x2Var = this.O0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = x2Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z10 = x2Var.draw(canvas);
                } else {
                    z10 = true;
                }
                x2Var.setForceNotMedia(true);
                float alpha = x2Var.getAlpha();
                x2Var.setAlpha(clamp01 * alpha);
                x2Var.draw(canvas);
                x2Var.setAlpha(alpha);
                x2Var.setForceNotMedia(false);
                return z10;
            }
        }
        return x2Var.draw(canvas);
    }

    public final void a3() {
        j1 j1Var = this.Fc;
        if (j1Var != null && j1Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void a4(float f9, float f10, boolean z10) {
        boolean z11;
        if (this.h != z10) {
            this.h = z10;
            F0();
            if (z10) {
                invalidate();
            }
        }
        lh.x2 x2Var = this.O0;
        float imageY = f9 - x2Var.getImageY();
        float measuredHeight = f10 - (getMeasuredHeight() - x2Var.getImageY2());
        float imageHeight = x2Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / x2Var.getImageHeight() < 0.25f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25518s = z11;
        x2Var.setSkipUpdateFrame(z11);
    }

    @Override
    public final void b(boolean z10, boolean z11) {
        this.f25406jc = z10;
        if (z10) {
            this.f25420kc = z11;
        } else {
            this.f25420kc = false;
        }
    }

    public final boolean b1() {
        MessageObject messageObject = this.f25556u7;
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
        j1 j1Var = this.Fc;
        int i12 = 0;
        if (j1Var != null) {
            if (!j1Var.c1(1, this)) {
                this.f25627z5 = null;
                ArrayList arrayList = this.f25613y5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.f25613y5.size(); i13++) {
                        l1 l1Var = (l1) this.f25613y5.get(i13);
                        if (!l1Var.f24621a.c()) {
                            l1Var.f24621a.a();
                        }
                    }
                }
            } else {
                CharacterStyle P1 = this.Fc.P1(this);
                if (P1 != this.f25627z5) {
                    this.f25627z5 = P1;
                    c90 c90Var = this.f25600x5;
                    if (c90Var != null) {
                        c90Var.a();
                        this.f25600x5 = null;
                    }
                    c90 c90Var2 = new c90();
                    this.f25600x5 = c90Var2;
                    c90Var2.C = true;
                    s80 s80Var = new s80(0);
                    c90 c90Var3 = this.f25600x5;
                    c90Var3.f27400x = s80Var;
                    c90Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.f24621a = this.f25600x5;
                    obj.f24622b = -3;
                    if (this.f25613y5 == null) {
                        this.f25613y5 = new ArrayList();
                    }
                    this.f25613y5.add(obj);
                    if (this.f25627z5 != null && !r2(obj, s80Var, this.G2, -2) && (((textLayoutBlocks = this.Y3) == null || !s2(obj, s80Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f25556u7) != null)) {
                        s2(obj, s80Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f25613y5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f25556u7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.g6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.Ld;
            }
            int v02 = org.telegram.ui.ActionBar.g6.v0(i11, this.Ed);
            while (i12 < this.f25613y5.size()) {
                l1 l1Var2 = (l1) this.f25613y5.get(i12);
                if (l1Var2.f24622b == i10) {
                    c90 c90Var4 = l1Var2.f24621a;
                    c90Var4.f(org.telegram.ui.ActionBar.g6.l1(0.85f, v02), org.telegram.ui.ActionBar.g6.l1(2.0f, v02), org.telegram.ui.ActionBar.g6.l1(3.5f, v02), org.telegram.ui.ActionBar.g6.l1(6.0f, v02));
                    c90Var4.draw(canvas);
                    invalidate();
                    if (c90Var4.b()) {
                        this.f25613y5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f25524s5.d <= 0 && this.J.f13847s) {
            MessageObject messageObject = this.f25556u7;
            if (messageObject == null || !messageObject.preview) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b4(int i10, int i11, int i12, float f9, float f10, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        RichMessageLayout richMessageLayout;
        r1 r1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Ud = i10;
        this.Wd = i11;
        this.Xd = i12;
        this.F0 = i13;
        this.G0 = i14;
        this.Zd = f10;
        this.Yd = f9;
        this.Pc = i14;
        this.Qc = i15;
        this.Rc = i16;
        this.Vd = i17;
        if ((!this.f25416k7.isEmpty() || (this.v != null && (messageObject = this.f25556u7) != null && messageObject.type == 27)) && this.Oc != f10) {
            invalidate();
        }
        this.Oc = f10;
        if (i12 != this.G0 || f9 != this.H0) {
            this.H0 = f9;
            this.G0 = i12;
        }
        if (this.f25556u7 != null && R2() && this.f25556u7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f25556u7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f25450n0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f25556u7.textLayoutBlocks.size();
                r1Var = this.Vc;
                if (i21 >= size || this.f25556u7.textLayoutBlocks.get(i21).textYOffset(this.f25556u7.textLayoutBlocks, r1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = -1;
            int i24 = -1;
            int i25 = 0;
            while (i22 < this.f25556u7.textLayoutBlocks.size()) {
                float textYOffset = this.f25556u7.textLayoutBlocks.get(i22).textYOffset(this.f25556u7.textLayoutBlocks, r1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(r1Var) + textLayoutBlock.padBottom;
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
            if (this.f25608y0 == i24 && this.f25622z0 == i23 && this.A0 == i25) {
                if (this.lc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.lc.f33139a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.lc.f33139a.get(i26);
                        if (t5Var != null && t5Var.f32874n) {
                            float y8 = (0.0f - getY()) - t5Var.f32875r;
                            float y10 = (this.f25449n - getY()) - t5Var.f32875r;
                            Rect rect = t5Var.f32872e;
                            if (rect.bottom >= y8 && rect.top <= y10) {
                                invalidate();
                                break;
                            }
                        }
                        i26++;
                    }
                }
            } else {
                this.f25608y0 = i24;
                this.f25622z0 = i23;
                this.A0 = i25;
                invalidate();
            }
        }
        MessageObject messageObject3 = this.f25556u7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f25450n0;
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
            if (this.B0 != i28 || this.C0 != i29) {
                this.B0 = i28;
                this.C0 = i29;
                invalidate();
            }
        }
        ArrayList arrayList = this.U5;
        if (!arrayList.isEmpty()) {
            int i31 = -1;
            int i32 = -1;
            for (int i33 = 0; i33 < arrayList.size(); i33++) {
                q1 q1Var = (q1) arrayList.get(i33);
                int i34 = q1Var.f25029b + this.Hc;
                if (Z2(i34, i34 + q1Var.f25030c, this.Ud, i19 + this.Wd)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f25343f6 != i31 || this.f25327e6 != i32) {
                this.f25343f6 = i31;
                this.f25327e6 = i32;
                invalidate();
            }
        }
        if (this.f25559ua) {
            if (Math.abs(this.Fa - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Vd), this.Da - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        kg.r0 r0Var = this.J;
        int i35 = r0Var.d;
        boolean Z2 = Z2(i35, i35 + r0Var.f13843o, this.Ud, i18 + this.Wd);
        if (this.f25371h6 != Z2) {
            this.f25371h6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(float f9) {
        MessageObject messageObject = this.f25556u7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(this.f25556u7, f9);
        q4();
    }

    public final boolean c1(float f9, int i10) {
        kg.r0 r0Var = this.J;
        if (!r0Var.K) {
            return false;
        }
        float y8 = getY() + r0Var.d;
        if (y8 <= f9 || (y8 + r0Var.f13843o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.c2(android.graphics.Canvas):void");
    }

    public final void c3() {
        if (this.G != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void c4() {
        int i10;
        int i11;
        int i12;
        if (this.f25556u7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.g6.f23256o2;
            int i13 = org.telegram.ui.ActionBar.g6.f23104fc;
            textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.g6.f23415x2.setColor(org.telegram.ui.ActionBar.g6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.g6.f23274p2.setColor(org.telegram.ui.ActionBar.g6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.g6.f23291q2.setColor(org.telegram.ui.ActionBar.g6.v0(i13, this.Ed));
            org.telegram.ui.ActionBar.g6.f23307r2.setColor(org.telegram.ui.ActionBar.g6.v0(i13, this.Ed));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.f23415x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.g6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.g6.f23005a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.g6.f23256o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.g6.f23274p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.g6.f23291q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.g6.f23307r2;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hc, this.Ed);
            textPaint8.linkColor = v02;
            textPaint7.linkColor = v02;
            textPaint6.linkColor = v02;
            textPaint5.linkColor = v02;
            textPaint4.linkColor = v02;
            textPaint3.linkColor = v02;
            textPaint2.linkColor = v02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.g6.f23256o2;
            int i14 = org.telegram.ui.ActionBar.g6.f23086ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.Ed));
            org.telegram.ui.ActionBar.g6.f23415x2.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.Ed));
            org.telegram.ui.ActionBar.g6.f23274p2.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.Ed));
            org.telegram.ui.ActionBar.g6.f23291q2.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.Ed));
            org.telegram.ui.ActionBar.g6.f23307r2.setColor(org.telegram.ui.ActionBar.g6.v0(i14, this.Ed));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.g6.f23415x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.g6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.g6.f23005a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.g6.f23256o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.g6.f23274p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.g6.f23291q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.g6.f23307r2;
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.Ed);
            textPaint16.linkColor = v03;
            textPaint15.linkColor = v03;
            textPaint14.linkColor = v03;
            textPaint13.linkColor = v03;
            textPaint12.linkColor = v03;
            textPaint11.linkColor = v03;
            textPaint10.linkColor = v03;
        }
        if (this.H1 != null) {
            int i15 = this.G1;
            d1 d1Var = this.C5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f25556u7.isOutOwner()) {
                        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23406wb, this.Ed);
                        int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.xb, this.Ed);
                        int i16 = org.telegram.ui.ActionBar.g6.f23455zb;
                        d1Var.h(v04, v05, org.telegram.ui.ActionBar.g6.v0(i16, this.Ed), org.telegram.ui.ActionBar.g6.v0(i16, this.Ed), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23437yb, this.Ed));
                    } else if (this.f25309d2 && this.W9 != null) {
                        int c3 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23372ud, this.Ed), this.W9.h());
                        int c6 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23390vd, this.Ed), this.W9.h());
                        int i17 = org.telegram.ui.ActionBar.g6.xd;
                        d1Var.h(c3, c6, org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(i17, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(i17, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23408wd, this.Ed), this.W9.h()));
                    } else {
                        int v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23372ud, this.Ed);
                        int v07 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23390vd, this.Ed);
                        int i18 = org.telegram.ui.ActionBar.g6.xd;
                        d1Var.h(v06, v07, org.telegram.ui.ActionBar.g6.v0(i18, this.Ed), org.telegram.ui.ActionBar.g6.v0(i18, this.Ed), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23408wd, this.Ed));
                    }
                }
            } else {
                boolean isOutOwner = this.f25556u7.isOutOwner();
                co0 co0Var = this.D5;
                if (isOutOwner) {
                    int v08 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ab, this.Ed);
                    int v09 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Cb, this.Ed);
                    int v010 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Bb, this.Ed);
                    co0Var.f27536p = v08;
                    co0Var.f27537q = v09;
                    co0Var.f27538r = v010;
                    int v011 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23406wb, this.Ed);
                    int v012 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.xb, this.Ed);
                    int i19 = org.telegram.ui.ActionBar.g6.f23455zb;
                    d1Var.h(v011, v012, org.telegram.ui.ActionBar.g6.v0(i19, this.Ed), org.telegram.ui.ActionBar.g6.v0(i19, this.Ed), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23437yb, this.Ed));
                } else if (this.f25309d2 && this.W9 != null) {
                    int c10 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23439yd, this.Ed), this.W9.h());
                    int c11 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ad, this.Ed), this.W9.h());
                    int c12 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23457zd, this.Ed), this.W9.h());
                    co0Var.f27536p = c10;
                    co0Var.f27537q = c11;
                    co0Var.f27538r = c12;
                    int c13 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23372ud, this.Ed), this.W9.h());
                    int c14 = org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23390vd, this.Ed), this.W9.h());
                    int i20 = org.telegram.ui.ActionBar.g6.xd;
                    d1Var.h(c13, c14, org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(i20, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(i20, this.Ed), this.W9.h()), org.telegram.ui.ActionBar.g6.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23408wd, this.Ed), this.W9.h()));
                } else {
                    int v013 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23439yd, this.Ed);
                    int v014 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ad, this.Ed);
                    int v015 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23457zd, this.Ed);
                    co0Var.f27536p = v013;
                    co0Var.f27537q = v014;
                    co0Var.f27538r = v015;
                    int v016 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23372ud, this.Ed);
                    int v017 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23390vd, this.Ed);
                    int i21 = org.telegram.ui.ActionBar.g6.xd;
                    d1Var.h(v016, v017, org.telegram.ui.ActionBar.g6.v0(i21, this.Ed), org.telegram.ui.ActionBar.g6.v0(i21, this.Ed), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23408wd, this.Ed));
                }
            }
        }
        MessageObject messageObject = this.f25556u7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.g6.T2;
            int v018 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, this.Ed);
            if (f3()) {
                if (this.f25556u7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.g6.f23246nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.g6.f23266od;
                }
            } else if (this.f25556u7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.g6.f23332sb;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.f23248nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), v018, org.telegram.ui.ActionBar.g6.v0(i12, this.Ed)));
        } else if (this.f25359g8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, this.Ed));
            } else {
                org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23195kd, this.Ed));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.g6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.g6.f23246nb;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23332sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.Ed));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.g6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.g6.f23266od;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23248nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.Ed));
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
    public final void d(float f9) {
        MessageObject messageObject = this.f25556u7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f9);
        q4();
    }

    public final boolean d1() {
        return FileLoader.getInstance(this.E7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f9, Integer num) {
        boolean z10;
        boolean z11 = this.f25447md;
        float f10 = 1.0f;
        kg.r0 r0Var = this.J;
        if (z11) {
            r0Var.f13831a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f25371h6 && V2()) {
            if (r0Var.f13831a > 0.0f) {
                p0();
            }
            if (getAlpha() * f9 != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f9 * 255.0f), 31);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = r0Var.f13831a;
            r1 r1Var = this.Vc;
            if (f11 <= 0.0f && r1Var.f25191w0 && this.H == null && !this.f25447md) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + r1Var.f25133i0);
                r0Var.D = 0.0f;
                r0Var.E = false;
                if (r1Var.f25123g) {
                    f10 = r1Var.K1;
                }
                r0Var.d(canvas, f10, num);
                canvas.restore();
            } else {
                r0Var.D = 0.0f;
                r0Var.E = false;
                if (r1Var.f25123g) {
                    f10 = r1Var.K1;
                }
                r0Var.d(canvas, f10, num);
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
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if ((groupedMessagePosition == null || ((groupedMessages = this.G) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Vc.f25191w0) {
                if (!this.f25595x || !this.f25556u7.isVoice()) {
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
            TLRPC.User user = this.Ub;
            if (user != null && user.f22539id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f25556u7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f25556u7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                X3(messageObject, this.G, this.B, this.A, this.C, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    public final void e1(Bitmap bitmap, boolean z10) {
        boolean isVideo = this.f25556u7.isVideo();
        lh.x2 x2Var = this.O0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                x2Var.setAllowStartAnimation(false);
                x2Var.stopAnimation();
                return;
            }
            x2Var.setAllowStartAnimation(true);
            x2Var.startAnimation();
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
        x2Var.setAllowStartAnimation(z10);
        if (bitmap != null) {
            x2Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z10) {
            x2Var.startAnimation();
        } else {
            x2Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z10 = this.f25447md;
        float f9 = 1.0f;
        kg.r0 r0Var = this.J;
        if (z10) {
            r0Var.f13831a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z11 = false;
        if (!this.f25371h6 || !V2()) {
            return false;
        }
        if (r0Var.f13831a > 0.0f) {
            p0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z11 = true;
        }
        float f10 = r0Var.f13831a;
        r1 r1Var = this.Vc;
        if (f10 <= 0.0f && r1Var.f25191w0 && this.H == null && !this.f25447md) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + r1Var.f25133i0);
            if (r1Var.f25123g) {
                f9 = r1Var.K1;
            }
            r0Var.e(canvas, f9);
            canvas.restore();
        } else {
            if (r1Var.f25123g) {
                f9 = r1Var.K1;
            }
            r0Var.e(canvas, f9);
        }
        if (z11) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f25556u7.messageOwner).period;
        int currentTime = ConnectionsManager.getInstance(this.E7).getCurrentTime();
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
        if ((this.G == null || (this.H.flags & 4) != 0) && !this.f25309d2) {
            MessageObject messageObject = this.f25556u7;
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
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        j1 j1Var = this.Fc;
        if (j1Var != null) {
            j1Var.s2(this, reactionCount, z10, f9, f10);
        }
    }

    public final void f2(Canvas canvas, RichMessageLayout richMessageLayout, float f9, ColorFilter colorFilter) {
        Canvas canvas2;
        int save;
        if (richMessageLayout != null && f9 > 0.0f && richMessageLayout.hasOverlay()) {
            if (f9 < 1.0f) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f9 * 255.0f), 31);
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(this.f25394j0, this.f25450n0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f25373h8) || ((!this.f25373h8 && this.f25272a8) || this.f25287b8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f25556u7;
            if (messageObject == null || !messageObject.preview) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.f4():boolean");
    }

    public final int g1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        lh.x2 x2Var = this.O0;
        x2Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f25388i9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.B9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f25459n9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.f25533se = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z10 && !TextUtils.isEmpty(this.f25283b4)) {
                        n4();
                        this.f25533se = (int) (i10 + this.f25439m4);
                        this.f25548te = this.Y3;
                    }
                    i10 = this.f25465o0 + this.f25493q0 + i10;
                }
            }
            return i10;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        x2Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f25465o0 + this.f25493q0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f25338f1 && !this.f25300c8 && !this.f25287b8) {
            return false;
        }
        return true;
    }

    public final void g4(int i10, boolean z10, boolean z11) {
        float f9;
        float f10 = 0.0f;
        if (i10 == -1 || i10 == 0) {
            if (this.T6 != z10) {
                this.T6 = z10;
                if (!z11) {
                    if (z10) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    this.U6 = f9;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i10 != -1 && i10 != 1) || this.f25372h7 == z10) {
            return;
        }
        this.f25372h7 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f25386i7 = f10;
            return;
        }
        setInvalidatesParent(true);
        invalidate();
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new p1(this);
    }

    public int getAdditionalPaddingHeight() {
        return this.f25393ie;
    }

    @Override
    public float getAlpha() {
        if (this.Tc) {
            return this.Uc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.y5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.getAnimatedEmojiSpans():org.telegram.ui.Components.y5[]");
    }

    public float getAnimationOffsetX() {
        return this.f25578ve;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f25417k8) {
            return this.f25388i9;
        }
        return null;
    }

    public ma0 getBackgroundDrawable() {
        return this.Gc;
    }

    public int getBackgroundDrawableBottom() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        int i11 = 0;
        if (groupedMessagePosition != null) {
            int i12 = 4;
            if ((groupedMessagePosition.flags & 4) == 0) {
                i10 = AndroidUtilities.dp(3.0f);
            } else {
                i10 = 0;
            }
            if ((this.H.flags & 8) == 0) {
                MessageObject messageObject = this.f25556u7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i12 = 3;
                }
                i10 += AndroidUtilities.dp(i12);
            }
        } else {
            i10 = 0;
        }
        boolean z10 = this.F;
        if (!z10 || !this.E) {
            if (z10) {
                i11 = AndroidUtilities.dp(1.0f);
            } else {
                i11 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.I8) - i11) + i10;
        if (!this.f25359g8) {
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
        int i10;
        MessageObject messageObject = getMessageObject();
        int i11 = 0;
        float f9 = 9.0f;
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.f25447md) {
                return (this.H8 - this.F8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.H8 - this.F8;
            if (this.f25359g8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f10 = 71.0f;
        if (this.f25447md) {
            if (!q3()) {
                if ((this.J7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25417k8) {
                    i11 = 48;
                }
                f10 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f10) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.J7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f25417k8) {
                    i11 = 48;
                }
                f10 = i11;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (!this.f25359g8) {
                f9 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f9);
        }
        MessageObject.GroupedMessages groupedMessages = this.G;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.H.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f25447md) {
            if (this.F) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f25359g8 && this.F) {
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
        int i11 = this.F8;
        if (this.f25447md) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.F && (messageObject2 = this.f25556u7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.F && ((messageObject = this.f25556u7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f25359g8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f25359g8 && this.F) {
                i10 -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i10;
    }

    public int getBackgroundDrawableTop() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        int i11 = 0;
        if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) == 0) {
            i10 = 0 - AndroidUtilities.dp(3.0f);
        } else {
            i10 = 0;
        }
        if (!this.E) {
            i11 = AndroidUtilities.dp(1.0f);
        }
        int i12 = i10 + i11;
        if (!this.f25359g8 && this.E) {
            return i12 - AndroidUtilities.dp(1.0f);
        }
        return i12;
    }

    public int getBackgroundHeight() {
        return this.Pc;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.P0;
    }

    public int getBottomActionPadding() {
        r1 r1Var = this.Vc;
        if (r1Var.B1) {
            return AndroidUtilities.lerp(r1Var.A1, this.W, r1Var.K1);
        }
        return this.W;
    }

    @Override
    public int getBoundsLeft() {
        boolean z10;
        int i10;
        int i11;
        float f9;
        int dp;
        int i12;
        float f10;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z3()) {
            if (this.H != null) {
                f10 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f25556u7;
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
        if (z10 && (M0(this.f25556u7) || this.H5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f25416k7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f25556u7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f25513r8;
                if (!this.f25359g8 && !this.F) {
                    f9 = 7.0f;
                } else {
                    f9 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f9);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((e0) arrayList.get(i15)).f24250c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.O != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.O.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25265a0 != null) {
            backgroundDrawableLeft = Math.min(this.E8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f9;
        int dp;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f25556u7) || this.H5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f25416k7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f25556u7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f25513r8;
                if (!this.f25359g8 && !this.F) {
                    f9 = 7.0f;
                } else {
                    f9 = 1.0f;
                }
                dp = i11 + AndroidUtilities.dp(f9);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                float f10 = widthForButtons;
                i12 = Math.max(i12, ((int) (e0Var.f24250c * f10)) + dp + ((int) (e0Var.f24251e * f10)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.O != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.O.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f25265a0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.Y3;
    }

    public float getCaptionX() {
        r1 r1Var = this.Vc;
        if (r1Var.f25191w0) {
            if (r1Var.C0) {
                this.f25426l4 += r1Var.f25124g0;
            } else if (r1Var.f25176s0) {
                float f9 = this.f25426l4;
                float f10 = r1Var.K1;
                this.f25426l4 = com.google.android.recaptcha.internal.a.z(1.0f, f10, r1Var.f25168q0, f9 * f10);
            } else if (!this.f25556u7.isVoice() || !TextUtils.isEmpty(this.f25556u7.caption)) {
                this.f25426l4 += r1Var.f25124g0;
            }
        }
        return this.f25426l4;
    }

    public float getCaptionY() {
        float f9 = this.f25439m4;
        r1 r1Var = this.Vc;
        if (r1Var.f25191w0) {
            if (r1Var.C0) {
                return f9 - getTranslationY();
            }
            if (r1Var.f25176s0) {
                float f10 = r1Var.K1;
                return com.google.android.recaptcha.internal.a.z(1.0f, f10, r1Var.f25172r0, f9 * f10);
            }
            return f9;
        }
        return f9;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f25436m1;
    }

    public int getChecksX() {
        float f9;
        int i10 = this.H8;
        if (SharedConfig.bubbleRadius >= 10) {
            f9 = 27.3f;
        } else {
            f9 = 25.3f;
        }
        return i10 - AndroidUtilities.dp(f9);
    }

    public int getChecksY() {
        float f9;
        int intrinsicHeight;
        if (this.f25556u7.shouldDrawWithoutBackground()) {
            f9 = this.f25405jb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f9 = this.f25405jb;
            intrinsicHeight = org.telegram.ui.ActionBar.g6.F3.getIntrinsicHeight();
        }
        return (int) (f9 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.d5 d5Var = this.f25487p8;
        if (d5Var == null) {
            return 0;
        }
        int i10 = d5Var.getBounds().left;
        if (!this.f25556u7.isOutOwner() && this.Vc.f25203z0 != 1.0f) {
            boolean z10 = this.f25447md;
            if ((z10 || !this.f25359g8) && !this.F) {
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
        org.telegram.ui.ActionBar.d5 d5Var = this.f25487p8;
        if (d5Var == null) {
            return getWidth();
        }
        int i10 = d5Var.getBounds().right;
        if (this.f25556u7.isOutOwner() && this.Vc.f25203z0 != 1.0f && (((z10 = this.f25447md) || !this.f25359g8) && !this.F)) {
            if (z10) {
                return (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)) + i10);
            }
            return AndroidUtilities.dp(6.0f) + i10;
        }
        return i10;
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

    public j1 getDelegate() {
        return this.Fc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Vc.f25133i0;
    }

    public float getDeltaLeft() {
        return this.Vc.f25124g0;
    }

    public float getDeltaRight() {
        return this.Vc.f25128h0;
    }

    public float getDeltaTop() {
        return this.Vc.f25138j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f9;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z10 = this.f25339f2;
        float f10 = 0.0f;
        r1 r1Var = this.Vc;
        if (z10) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f25409k0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f25353g2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f25409k0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f25556u7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f25409k0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f11 = 12.0f;
                if (this.f25556u7.isOutOwner()) {
                    f9 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25513r8;
                    if (this.f25556u7.type == 19) {
                        f9 -= Math.max(0.0f, ((Math.max(this.F9, this.H9) + f9) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f25359g8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f25513r8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f25513r8;
                        if (!this.F) {
                            f11 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f11) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f9 = extraTextX + dp;
                }
                dp2 = (f9 + r1Var.f25124g0) - AndroidUtilities.dp(1.33f);
                float f12 = this.f25423l0;
                if (r1Var.f25174r2) {
                    AndroidUtilities.lerp(r1Var.f25170q2, f12, r1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (r1Var != null) {
            f10 = r1Var.f25128h0;
        }
        float f13 = backgroundDrawableRight + f10;
        int i13 = 0;
        if (this.f25556u7.isOutOwner() && !this.f25359g8 && !this.F) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f13 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f25481p2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f25467o2) - this.f25481p2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f9;
        float f10 = this.f25411k2;
        r1 r1Var = this.Vc;
        if (!r1Var.f25174r2) {
            f9 = (-r1Var.f25138j0) + r1Var.f25133i0;
        } else {
            f9 = 0.0f;
        }
        return f10 + f9;
    }

    public StaticLayout getDescriptionlayout() {
        return this.G2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f25556u7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f25311d4;
    }

    public float getExplanationX() {
        return this.W6;
    }

    public float getExplanationY() {
        return this.X6;
    }

    public int getExtraInsetHeight() {
        float f9;
        int i10;
        int i11 = this.f25483p4;
        boolean z10 = this.J1;
        kg.r0 r0Var = this.J;
        if (z10) {
            if (r0Var.f13847s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f25281b2;
        }
        if (this.f9) {
            if (f4()) {
                f9 = 41.3f;
            } else {
                f9 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f9);
        }
        if (!r0Var.f13847s && this.f25556u7.shouldDrawReactionsInLayout()) {
            return i11 + r0Var.f13844p;
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
        return this.O1;
    }

    public String getFilename() {
        int i10;
        int i11;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f25269a5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.G1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.H1);
                }
                TLRPC.PhotoSize photoSize2 = this.f25269a5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f25556u7.messageOwner.attachPath;
                }
                if (this.f25556u7.isSendError() && (i10 = this.G1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f25556u7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f9;
        TLRPC.User user = this.Ub;
        if (user != null && user.f22539id == 0) {
            f9 = this.f25388i9.getCenterX();
        } else {
            f9 = this.f25332eb + this.D1;
        }
        return (int) f9;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f25295c1;
    }

    public float getLastTouchY() {
        return this.f25308d1;
    }

    public int getLayoutHeight() {
        return this.I8;
    }

    public int getMaxNameWidth() {
        int min;
        int dp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i10;
        int i11;
        float f9;
        int dp2;
        int parentWidth;
        int i12 = this.G1;
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f25556u7).type) != 5) {
            MessageObject.GroupedMessages groupedMessages = this.G;
            int i13 = 0;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = getParentWidth();
                }
                i11 = 0;
                for (int i14 = 0; i14 < this.G.posArray.size(); i14++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.G.posArray.get(i14);
                    if (groupedMessagePosition.minY != 0) {
                        break;
                    }
                    i11 = (int) (Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * parentWidth) + i11);
                }
                if (this.B8) {
                    i13 = 71;
                } else if (z3()) {
                    i13 = 48;
                }
                dp2 = AndroidUtilities.dp(i13 + 31);
            } else if (i10 == 19) {
                int i15 = messageObject2.textWidth;
                int dp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f);
                if (this.f25417k8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.F8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f25556u7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f25359g8) {
                    f9 = 22.0f;
                } else {
                    f9 = 31.0f;
                }
                dp2 = AndroidUtilities.dp(f9);
            }
            return i11 - dp2;
        }
        float f10 = 0.0f;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            if (this.B8) {
                f10 = 71.0f;
            } else if (z3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        } else {
            min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
            if (this.B8) {
                f10 = 71.0f;
            } else if (z3()) {
                f10 = 42.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        int i16 = min - dp;
        MessageObject messageObject3 = this.f25556u7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f25556u7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.f25463nd && ((messageObject = this.f25556u7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.F8 - (AndroidUtilities.roundPlayingMessageSize(this.B8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.B8 && (this.f25556u7.type == 5 || this.G1 == 6)) {
            return this.F8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.F8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        r1 r1Var = this.Vc;
        if (r1Var.Z1) {
            return AndroidUtilities.lerp(r1Var.Y1, this.f25396j2, r1Var.K1);
        }
        return this.f25396j2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f25571v7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25556u7;
    }

    public int getNameStatusX() {
        int i10;
        float f9 = this.Sa + this.Ra;
        int i11 = this.f25572v8;
        if (i11 > 0) {
            i10 = i11 - AndroidUtilities.dp(32.0f);
        } else {
            i10 = this.Ha;
        }
        return (int) (f9 + i10 + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f9 = this.Ta;
        StaticLayout staticLayout = this.Ga;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f9 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.C1;
    }

    @Override
    public int getObserverTag() {
        return this.D7;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.R + this.f25307d0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f25556u7;
        if (messageObject == null) {
            messageObject = this.f25571v7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.F0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        i4 i4Var = this.B7;
        if (i4Var != null) {
            return i4Var.f24479e + i4Var.h;
        }
        return this.O0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.O0;
    }

    public ArrayList<q1> getPollButtons() {
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
        MessageObject messageObject2 = this.f25556u7;
        if (messageObject2 != null && this.G != null && messageObject2.hasValidGroupId()) {
            messageObject = this.G.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f25556u7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.K0;
    }

    public kg.r0 getReactionsLayout() {
        return this.J;
    }

    public org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.Ed;
    }

    public co0 getSeekBarWaveform() {
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
        return this.f25563ue;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.G;
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
        MessageObject messageObject3 = this.f25556u7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        r1 r1Var = this.Vc;
        if (r1Var.f25200y1) {
            return AndroidUtilities.lerp(r1Var.f25196x1, this.R, r1Var.K1);
        }
        return this.R;
    }

    public TLRPC.Document getStreamingMedia() {
        int i10 = this.G1;
        if (i10 != 4 && i10 != 7 && i10 != 2) {
            return null;
        }
        return this.H1;
    }

    public int getTextX() {
        return this.f25394j0;
    }

    public int getTextY() {
        return this.f25450n0;
    }

    public float getTimeAlpha() {
        return this.f25384i5;
    }

    public float getTimeX() {
        int i10;
        r1 r1Var = this.Vc;
        if (r1Var.f25129h1) {
            i10 = AndroidUtilities.lerp(r1Var.f25125g1, this.f25461nb, r1Var.K1);
        } else {
            i10 = this.f25461nb;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (f4()) {
            if (this.f9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f25556u7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.G8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f25396j2 + this.Hc;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        r1 r1Var = this.Vc;
        if (r1Var.f25185u1) {
            return AndroidUtilities.lerp(r1Var.f25181t1, this.f25279b0, r1Var.K1);
        }
        return this.f25279b0;
    }

    public r1 getTransitionParams() {
        return this.Vc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        r1 r1Var = this.Vc;
        if (r1Var == null || (messageObject = this.f25556u7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (r1Var.l1) {
            if (this.f25443m8) {
                return r1Var.K1;
            }
            return 1.0f - r1Var.K1;
        } else if (this.f25443m8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Oc;
    }

    public int getWidthForButtons() {
        r1 r1Var = this.Vc;
        if (r1Var.N1) {
            return AndroidUtilities.lerp(r1Var.O1, this.f25472o7, r1Var.K1);
        }
        return this.f25472o7;
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

    public final void h1(s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        s1Var.J7 = this.J7;
        s1Var.W7 = this.W7;
        s1Var.L7 = this.L7;
        s1Var.M7 = this.M7;
        s1Var.N7 = this.N7;
        s1Var.O7 = this.O7;
        s1Var.P7 = this.P7;
        s1Var.Q7 = this.Q7;
        s1Var.R7 = this.R7;
        s1Var.S7 = this.S7;
        s1Var.T7 = this.T7;
        s1Var.U7 = this.U7;
        s1Var.X7 = this.X7;
        s1Var.Y7 = this.Y7;
        s1Var.Z7 = this.Z7;
        s1Var.A8 = this.A8;
        s1Var.B8 = this.B8;
        s1Var.C8 = this.C8;
        s1Var.D8 = this.D8;
        s1Var.E8 = this.E8;
    }

    public final void h2(Canvas canvas, Integer num, float f9, boolean z10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        kg.r0 r0Var = this.J;
        if (!r0Var.f13832b) {
            r0Var.D = f9;
            r0Var.E = z10;
            r0Var.d(canvas, this.Vc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f25571v7 != null) {
            return this.f25629z7;
        }
        return this.C;
    }

    public final void h4() {
        lh.x2 x2Var = this.O0;
        i4((x2Var.getImageWidth() / 2.0f) + x2Var.getImageX(), (x2Var.getImageHeight() / 2.0f) + x2Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f25420kc;
    }

    public final void i1(s1 s1Var) {
        gh.j jVar;
        if (s1Var != null && (jVar = s1Var.Bb) != null) {
            int i10 = (Integer) jVar.f7400k.get(s1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Cb = i10;
            gh.j jVar2 = this.Bb;
            if (jVar2 != null) {
                jVar2.f7400k.put(this, i10);
            }
        }
    }

    public final void i2(km kmVar, Canvas canvas, int i10, Integer num, float f9) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        kg.r0 r0Var = this.J;
        if (!r0Var.f13832b) {
            r0Var.D = f9;
            r0Var.f(kmVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f9) {
        if (this.f25487p8 != null) {
            int i10 = this.f25513r8;
            if (f9 >= i10 && f9 <= i10 + this.f25527s8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f9, float f10) {
        s1 s1Var;
        lh.x2 x2Var = this.O0;
        this.Ab = (float) Math.sqrt(Math.pow(x2Var.getImageHeight(), 2.0d) + Math.pow(x2Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f25556u7;
        if (!messageObject.isMediaSpoilersRevealed && this.xb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                s1Var = this;
                s1Var.V3(messageObject, this.G, this.B, this.A, this.C, this.D);
                MessageObject messageObject2 = s1Var.f25556u7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (s1Var.G != null) {
                    s1Var.K0.o(0.0f, false);
                }
            } else {
                s1Var = this;
            }
            s1Var.f25618yb = f9;
            s1Var.f25633zb = f10;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i7.w.a(s1Var.Ab * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(jr.f29803j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new i1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        j1 j1Var;
        if (this.f25556u7 == null) {
            return;
        }
        Runnable runnable = this.f24064e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f25364ge;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f25378he;
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
        if (!this.Kd || (j1Var = this.Fc) == null) {
            return;
        }
        j1Var.p();
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

    public final void j1(s1 s1Var) {
        s1Var.b4(this.Ud, this.Wd, this.Xd, this.Yd, this.Zd, this.F0, this.G0, this.Qc, this.Rc, this.Vd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f9) {
        String str;
        p0();
        if (this.f25544ta) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f9, f9, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f9, f9, org.telegram.ui.ActionBar.g6.f23130h2);
        }
    }

    public final boolean j3() {
        if (this.f25571v7 != null) {
            return this.A7;
        }
        return this.D;
    }

    public final boolean j4() {
        j1 j1Var;
        if (getCurrentMessagesGroup() == null && (j1Var = this.Fc) != null && j1Var.y2() != null && this.Fc.y2().A(this.f25556u7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.S8 == null) {
            this.S8 = new ImageReceiver[3];
            this.T8 = new org.telegram.ui.Components.e9[3];
            this.U8 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.S8;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.S8[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.T8[i10] = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    this.T8[i10].u(AndroidUtilities.dp(18.0f));
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k2(Canvas canvas, boolean z10) {
        float f9;
        float f10;
        int i10;
        float dp;
        float f11;
        float f12;
        float f13;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.f25489pa || z10) && this.f25501qa != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition == null || (groupedMessages = this.G) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f25556u7.isOutOwner();
                r1 r1Var = this.Vc;
                if (isOutOwner) {
                    float dp2 = r1Var.f25134i1 - AndroidUtilities.dp(40.0f);
                    this.Ca = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.G;
                    if (groupedMessages2 != null) {
                        this.Ca = (groupedMessages2.transitionParams.offsetLeft - this.f25578ve) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + r1Var.f25139j1;
                    this.Ca = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.G;
                    if (groupedMessages3 != null) {
                        this.Ca = (groupedMessages3.transitionParams.offsetRight - this.f25578ve) + dp3;
                    }
                }
                float f14 = 0.0f;
                if (this.f25501qa == 4) {
                    this.Da = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.I8 + r1Var.f25133i0) - AndroidUtilities.dp(41.0f);
                    this.Da = dp4;
                    MessageObject messageObject = this.f25556u7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f25445mb) {
                        this.Da = dp4 - AndroidUtilities.dp(22.0f);
                    }
                    MessageObject.GroupedMessages groupedMessages4 = this.G;
                    if (groupedMessages4 != null) {
                        float f15 = this.Da;
                        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages4.transitionParams;
                        float f16 = f15 + transitionParams.offsetBottom;
                        this.Da = f16;
                        if (transitionParams.backgroundChangeBounds) {
                            this.Da = f16 - getTranslationY();
                        }
                    }
                    if (this.f25556u7.shouldDrawReactions()) {
                        kg.r0 r0Var = this.J;
                        if (!r0Var.f13832b) {
                            if (this.f25447md) {
                                this.Da -= (1.0f - getVideoTranscriptionProgress()) * r0Var.i(r1Var.K1);
                            } else if (r0Var.f13831a > 0.0f) {
                                this.Da -= r0Var.i(r1Var.K1);
                            }
                        }
                    }
                }
                if (this.f25501qa != 4) {
                    float dp5 = ((this.I8 + r1Var.f25133i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Da < dp5) {
                        this.Da = dp5;
                    }
                }
                if (this.f25556u7.type == 19) {
                    if (this.f25501qa == 3 && this.V8 != null) {
                        this.Da = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Da = 0.0f;
                    }
                }
                if (!this.f25556u7.isOutOwner() && this.f25447md && !this.f25309d2) {
                    if (this.f25417k8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.B8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.f25463nd) {
                        f11 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f11 = 0.0f;
                    }
                    if (this.f25463nd) {
                        f14 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (r1Var.f25145k2) {
                        if (this.f25463nd) {
                            f12 = r1Var.K1;
                        } else {
                            f12 = 1.0f - r1Var.K1;
                        }
                        f11 = (1.0f - getVideoTranscriptionProgress()) * f12 * dp;
                        if (this.f25463nd) {
                            f13 = r1Var.K1;
                        } else {
                            f13 = 1.0f - r1Var.K1;
                        }
                        f14 = (1.0f - getVideoTranscriptionProgress()) * f13 * AndroidUtilities.dp(28.0f);
                    }
                    this.Ca -= f11;
                    this.Da -= f14;
                }
                this.f25514ra = true;
                if (this.f25501qa == 3) {
                    if (!this.f25595x || this.f25556u7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!hv0.f29235r0) {
                    float f17 = this.Ca;
                    float f18 = this.Da;
                    float dp6 = AndroidUtilities.dp(32.0f) + f17;
                    float f19 = this.Da;
                    if (this.f25529sa == 5) {
                        f9 = 64.0f;
                    } else {
                        f9 = 32.0f;
                    }
                    float dp7 = f19 + AndroidUtilities.dp(f9);
                    RectF rectF = this.Y4;
                    rectF.set(f17, f18, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f25514ra = false;
                        return;
                    }
                    int i11 = (int) ((1.0f - this.f25607y.f49505e) * 255.0f);
                    if (i11 != 255) {
                        float f20 = this.Ca;
                        f10 = 2.0f;
                        i10 = canvas.saveLayerAlpha(f20, this.Da, AndroidUtilities.dp(32.0f) + f20, this.Da + AndroidUtilities.dp(64.0f), i11);
                    } else {
                        f10 = 2.0f;
                        i10 = -1;
                    }
                    p0();
                    String str = "paintChatActionBackground";
                    if (this.f25501qa == 4 && this.f25529sa == 5 && this.f25544ta) {
                        Path path = this.f25617ya;
                        if (path == null) {
                            this.f25617ya = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.f25632za;
                        if (path2 == null) {
                            this.f25632za = new Path();
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
                        float f21 = this.Ca;
                        rectF2.set(f21, this.Da, AndroidUtilities.dp(32.0f) + f21, this.Da + AndroidUtilities.dp(32.0f));
                        Path path3 = this.f25617ya;
                        float[] fArr3 = this.Aa;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.Ca, this.Da + AndroidUtilities.dp(32.0f), this.Ca + AndroidUtilities.dp(32.0f), this.Da + AndroidUtilities.dp(64.0f));
                        this.f25632za.addRoundRect(rectF2, this.Ba, direction);
                        if (this.f25590wa == 4) {
                            canvas.drawPath(this.f25617ya, M2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.f25632za, M2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.f25617ya, M2("paintChatActionBackground"));
                            canvas.drawPath(this.f25632za, M2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        float dp10 = AndroidUtilities.dp(16.0f);
                        float dp11 = AndroidUtilities.dp(16.0f);
                        if (this.f25544ta) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.f23130h2);
                    }
                    int i12 = this.f25501qa;
                    if (i12 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        a0.p(L2, (this.Ca + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f10), (this.Da + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f10));
                        L2.draw(canvas);
                    } else if (i12 == 4) {
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
                        if (this.f25529sa == 5) {
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
        MessageObject messageObject = this.f25556u7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f25556u7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f25556u7.isSponsored() || this.f25556u7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.K7 && !this.Z7) {
            return false;
        }
        TLRPC.Message message2 = this.f25556u7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f25556u7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.Z7 && this.f25556u7.type == 0) || ((!this.A && this.Ua && this.J7 && (!this.f25556u7.isOutOwner() || ((this.f25556u7.isSupergroup() && this.f25556u7.isFromGroup()) || this.f25556u7.isRepostPreview))) || (this.f25556u7.isImportedForward() && this.f25556u7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.U5;
            if (i10 < arrayList.size()) {
                q1 q1Var = (q1) arrayList.get(i10);
                if (this.Fc.O(this, q1Var.f25045t, !q1Var.f25034i)) {
                    if (z10) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f25556u7.getDialogId();
                    int i11 = this.E7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f25556u7);
                    int i12 = this.E7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, q1Var.f25045t.f22537id, !q1Var.f25034i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!q1Var.f25034i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        q1Var.f25049y.p(userOrChat);
                        q1Var.f25050z.setForUserOrChat(userOrChat, q1Var.f25049y);
                        q1Var.f25042q = new zz0(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.N8[i10].f(-1, !q1Var.f25034i, true);
                    if (this.f25510r4 != null) {
                        if (!this.f25556u7.isOutOwner() && this.f25556u7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f25510r4.q(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f25556u7.getFromChatId())), true, true);
                        } else {
                            this.f25510r4.q(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    q1Var.f25034i = !q1Var.f25034i;
                    invalidate();
                    return;
                }
                this.f25555u6 = false;
            }
        }
    }

    @Override
    public final void l() {
        j1 j1Var;
        if (this.f25556u7 != null) {
            Runnable runnable = this.f25364ge;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f25378he;
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
            if (this.Kd && (j1Var = this.Fc) != null) {
                j1Var.p();
            }
        }
    }

    public final void l1() {
        int i10;
        s1(0);
        if (this.O2) {
            boolean z10 = this.Q2;
            if (this.P2) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i10 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i10 = z10 ? 1 : 0;
            }
            if (this.R2) {
                z10 = (z10 ? 1 : 0) | true;
                i10++;
            }
            if (i10 == 0) {
                this.T2 = null;
                this.S2 = 0;
                return;
            }
            this.f25465o0 = AndroidUtilities.dp(60.0f) + this.f25465o0;
            if (z10 != this.S2) {
                this.S2 = 0;
                int x4 = org.telegram.ui.b.x(75.0f, this.F8, i10);
                float dpf2 = (this.F8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.T2;
                if (arrayList == null) {
                    this.T2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.Q2) {
                    this.S2 |= 1;
                    this.T2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), x4, dpf2));
                }
                if (this.P2) {
                    this.S2 |= 2;
                    this.T2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), x4, dpf2));
                }
                if (this.R2) {
                    this.S2 |= 4;
                    this.T2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), x4, dpf2));
                }
            }
        }
    }

    public final void l2(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f9, boolean z14, float f10, float f11, float f12, boolean z15, boolean z16) {
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
        float f18 = z17 ? f9 * f12 : f9;
        if (this.G1 != 7 || ((messageObject = this.f25556u7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f25479p0;
        } else {
            photoBottom = f11 - ((1.0f - getVideoTranscriptionProgress()) * (this.J.i(this.Vc.K1) + AndroidUtilities.dp(this.F ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f25556u7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f19 = 22.0f;
        if (z12) {
            fc0 fc0Var = org.telegram.ui.ActionBar.g6.E3;
            if (f4()) {
                if (this.f25556u7.shouldDrawWithoutBackground()) {
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, this.Ed);
                    int i10 = this.H8;
                    f16 = z14 ? 24.0f : 22.0f;
                    fc0Var.getClass();
                    f13 = 4.0f;
                    a0.p(fc0Var, ((i10 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    fc0Var.setAlpha((int) (this.f25384i5 * 255.0f * f18));
                } else {
                    f13 = 4.0f;
                    f15 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23352tc, this.Ed);
                    int i11 = this.H8;
                    f16 = z14 ? 24.0f : 22.0f;
                    fc0Var.getClass();
                    a0.p(fc0Var, ((i11 - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f10);
                    fc0Var.setAlpha((int) (f18 * 255.0f));
                }
                f14 = 18.5f;
            } else {
                f13 = 4.0f;
                f15 = 1.0f;
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Na, this.Ed);
                fc0Var.getClass();
                f14 = 18.5f;
                a0.p(fc0Var, (this.H8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f11 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f10);
                fc0Var.setAlpha((int) (f18 * 255.0f));
            }
            fc0Var.a(v02);
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, fc0Var.getBounds().centerX(), fc0Var.getBounds().centerY());
            }
            fc0Var.draw(canvas);
            fc0Var.setAlpha(255);
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
                if (this.f25556u7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z10) {
                        if (z15) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f15 - f12), 0.0f);
                        }
                        a0.p(drawable, ((this.H8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(drawable, ((this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f10);
                    }
                    drawable.setAlpha((int) (this.f25384i5 * 255.0f * f18));
                } else {
                    if (z10) {
                        if (z15) {
                            canvas.translate((f15 - f12) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.g6.F3, (this.H8 - AndroidUtilities.dp(z14 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.g6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.g6.F3.getIntrinsicHeight()) + f10);
                    } else {
                        a0.p(org.telegram.ui.ActionBar.g6.F3, (this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.g6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.g6.F3.getIntrinsicHeight()) + f10);
                    }
                    org.telegram.ui.ActionBar.g6.F3.setAlpha((int) (this.f25384i5 * 255.0f * f18));
                    drawable = org.telegram.ui.ActionBar.g6.F3;
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
                    a0.p(L2, ((this.H8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
                } else {
                    L2 = L2(z16 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    a0.p(L2, ((this.H8 - AndroidUtilities.dp(f14)) - L2.getIntrinsicWidth()) + dp4, ((f11 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f10);
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
                Drawable L22 = this.f25556u7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.g6.G3;
                a0.p(L22, ((this.H8 - AndroidUtilities.dp(z14 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f10);
                L22.setAlpha((int) (this.f25384i5 * 255.0f * f18));
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
                a0.p(L23, (this.H8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f11 - AndroidUtilities.dp((this.B || this.A) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f10);
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
                dp = this.H8 - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.H8 - AndroidUtilities.dp(32.0f);
                if (!this.B && !this.A) {
                    f19 = 21.0f;
                }
                dp2 = AndroidUtilities.dp(f19);
            }
            float f20 = (f11 - dp2) + f10;
            int i12 = (int) (dp + dp4);
            RectF rectF = this.Y4;
            rectF.set(i12, f20, AndroidUtilities.dp(14.0f) + i12, AndroidUtilities.dp(14.0f) + f20);
            int alpha = org.telegram.ui.ActionBar.g6.f23023b2.getAlpha();
            org.telegram.ui.ActionBar.g6.f23023b2.setAlpha((int) (alpha * f18));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), org.telegram.ui.ActionBar.g6.f23023b2);
            org.telegram.ui.ActionBar.g6.f23023b2.setAlpha(alpha);
            a0.p(org.telegram.ui.ActionBar.g6.f23168j4, AndroidUtilities.dp(6.0f) + i12, f20 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.g6.f23168j4.setAlpha((int) (f18 * 255.0f));
            if (z17) {
                canvas.save();
                canvas.scale(f17, f17, org.telegram.ui.ActionBar.g6.f23168j4.getBounds().centerX(), org.telegram.ui.ActionBar.g6.f23168j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.g6.f23168j4.draw(canvas);
            org.telegram.ui.ActionBar.g6.f23168j4.setAlpha(255);
            if (z17) {
                canvas.restore();
            }
        }
    }

    public final boolean l3(org.telegram.messenger.MessageObject r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.l3(org.telegram.messenger.MessageObject):boolean");
    }

    public final void l4() {
        MessageObject messageObject;
        int i10;
        boolean z10;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.f25293be && (messageObject = this.f25556u7) != null) {
            boolean z11 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.p5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.lc = org.telegram.ui.Components.y5.update(i10, (View) this, false, this.lc, arrayList);
            } else {
                j1 j1Var = this.Fc;
                if (j1Var != null && j1Var.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.lc = org.telegram.ui.Components.y5.update(i10, this, z10, this.lc, this.f25556u7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f25556u7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                j1 j1Var2 = this.Fc;
                richMessageLayout.invalidateAnimatedEmojiInParent = (j1Var2 == null || !j1Var2.f()) ? true : true;
                this.f25556u7.richLayout.updateAnimatedEmojis(i10);
            }
        }
    }

    @Override
    public final boolean m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.m():boolean");
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
        int i13 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (MessageObject.isVoiceDocument(document2)) {
                this.G1 = 3;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.H1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.H1.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i14++;
                }
                AndroidUtilities.dp(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.g6.N2.measureText("00:00"));
                this.f25630z8 = i12 - AndroidUtilities.dp(18.0f);
                x3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.f25433lb;
                if (!this.f25309d2) {
                    this.F8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.g6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.D5.f27533m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.H1)) {
                this.G1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    q4();
                    this.Q3 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.C2.measureText(str2));
                    this.P3 = new StaticLayout(AndroidUtilities.formatFileSize(this.H1.size), org.telegram.ui.ActionBar.g6.C2, this.Q3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (MessageObject.isMusicDocument(this.H1)) {
                this.G1 = 5;
                int dp2 = i12 - AndroidUtilities.dp(92.0f);
                if (dp2 < 0) {
                    dp2 = AndroidUtilities.dp(100.0f);
                }
                int i15 = dp2;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), org.telegram.ui.ActionBar.g6.O2, i15 - AndroidUtilities.dp(12.0f), truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.g6.O2;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(ellipsize, textPaint, i15, alignment, 1.0f, 0.0f, false);
                this.P5 = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.Q5 = -((int) Math.ceil(this.P5.getLineLeft(0)));
                    int lineWidth = (int) this.P5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth > this.F8) {
                        this.F8 = AndroidUtilities.dp(104.0f) + lineWidth;
                    }
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.g6.P2, i15, truncateAt), org.telegram.ui.ActionBar.g6.P2, i15, alignment, 1.0f, 0.0f, false);
                this.R5 = staticLayout2;
                if (staticLayout2.getLineCount() > 0) {
                    this.S5 = -((int) Math.ceil(this.R5.getLineLeft(0)));
                    int lineWidth2 = (int) this.R5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth2 > this.F8) {
                        this.F8 = AndroidUtilities.dp(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i13 >= this.H1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.H1.attributes.get(i13);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i13++;
                }
                int i16 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.N2.measureText(AndroidUtilities.formatShortDuration(i16, i16)));
                AndroidUtilities.dp(86.0f);
                this.f25630z8 = this.F8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.H1, messageObject.hasValidGroupId())) {
                this.G1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.f25584w4 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.C2;
                    int i17 = this.f25584w4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f25497q4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    this.Q3 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.C2.measureText(str));
                    this.P3 = new StaticLayout(AndroidUtilities.formatFileSize(this.H1.size), org.telegram.ui.ActionBar.g6.C2, this.Q3, alignment2, 1.0f, 0.0f, false);
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
                    i12 += AndroidUtilities.dp(30.0f);
                }
                int i18 = i12;
                this.G1 = 1;
                String documentFileName = FileLoader.getDocumentFileName(this.H1);
                if (documentFileName.length() == 0) {
                    documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
                }
                StaticLayout c3 = bw0.c(documentFileName, org.telegram.ui.ActionBar.g6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
                this.P3 = c3;
                this.R3 = Integer.MIN_VALUE;
                if (c3 != null && c3.getLineCount() > 0) {
                    int i19 = 0;
                    while (i13 < this.P3.getLineCount()) {
                        i19 = Math.max(i19, (int) Math.ceil(this.P3.getLineWidth(i13)));
                        this.R3 = Math.max(this.R3, (int) Math.ceil(-this.P3.getLineLeft(i13)));
                        i13++;
                    }
                    i11 = Math.min(i18, i19);
                } else {
                    this.R3 = 0;
                    i11 = i18;
                }
                int dp3 = i18 - AndroidUtilities.dp(30.0f);
                TextPaint textPaint3 = org.telegram.ui.ActionBar.g6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.H1.size))));
                this.f25584w4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.H1.size) + " " + FileLoader.getDocumentExtension(this.H1), org.telegram.ui.ActionBar.g6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.f25584w4 < 0) {
                        this.f25584w4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f25497q4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.g6.C2, this.f25584w4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (this.I1) {
                    this.f25269a5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f25284b5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f25556u7.isHiddenSensitive() || (DownloadController.getInstance(this.E7).getAutodownloadMask() & 1) == 0) {
                        this.f25269a5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f25269a5;
                    lh.x2 x2Var = this.O0;
                    if (photoSize != null && photoSize != this.f25284b5) {
                        BitmapDrawable bitmapDrawable = this.f25556u7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f25284b5 = null;
                            this.f25298c5 = bitmapDrawable;
                        }
                    } else {
                        this.f25269a5 = null;
                        x2Var.setNeedsQualityThumb(true);
                        x2Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f25312d5 = "86_86_b";
                    x2Var.setImage(ImageLocation.getForObject(this.f25269a5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f25284b5, messageObject.photoThumbsObject), this.f25312d5, this.f25298c5, 0L, null, messageObject, 1);
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
        if (this.f25571v7 != null) {
            return this.f25615y7;
        }
        return this.B;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.m4(boolean, boolean, boolean):void");
    }

    public final boolean n0() {
        if (this.f25556u7.hasMediaSpoilers() && !this.f25556u7.isMediaSpoilersRevealed && this.xb == 0.0f && this.P0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final void n2(Canvas canvas, float f9, boolean z10, float f10, StaticLayout staticLayout, float f11, boolean z11) {
        int i10;
        float f12;
        lh.x2 x2Var;
        char c3;
        int i11;
        int i12;
        char c6;
        boolean z12;
        r1 r1Var;
        float f13;
        boolean z13;
        float f14;
        boolean z14;
        s1 s1Var;
        String str;
        int i13;
        float f15;
        float dp;
        float f16;
        boolean z15;
        r1 r1Var2;
        boolean z16;
        boolean z17;
        r1 r1Var3;
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
        r1 r1Var4;
        float f21;
        float f22;
        boolean z25;
        int i15;
        boolean z26;
        MessageObject messageObject;
        float j10;
        TextPaint textPaint;
        int i16;
        s1 s1Var2 = this;
        Canvas canvas2 = canvas;
        if (((s1Var2.qb && !s1Var2.I) || !s1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = s1Var2.f25556u7;
            if ((!messageObject2.deleted || s1Var2.H == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.T2;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, s1Var2.Ed);
                    if (s1Var2.f3()) {
                        i16 = s1Var2.f25556u7.isOutOwner() ? org.telegram.ui.ActionBar.g6.f23246nb : org.telegram.ui.ActionBar.g6.f23266od;
                    } else {
                        i16 = s1Var2.f25556u7.isOutOwner() ? org.telegram.ui.ActionBar.g6.f23332sb : org.telegram.ui.ActionBar.g6.f23248nd;
                    }
                    textPaint2.setColor(i0.a.d(s1Var2.getVideoTranscriptionProgress(), v02, org.telegram.ui.ActionBar.g6.v0(i16, s1Var2.Ed)));
                } else if (s1Var2.f4()) {
                    if (s1Var2.f25556u7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, s1Var2.Ed));
                    } else {
                        org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23195kd, s1Var2.Ed));
                    }
                } else if (s1Var2.f25556u7.isOutOwner()) {
                    org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.f23246nb : org.telegram.ui.ActionBar.g6.f23332sb, s1Var2.Ed));
                } else {
                    org.telegram.ui.ActionBar.g6.T2.setColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.f23266od : org.telegram.ui.ActionBar.g6.f23248nd, s1Var2.Ed));
                }
                float f23 = s1Var2.getTransitionParams().J1 ? s1Var2.getTransitionParams().K1 * f9 : f9;
                if (f23 != 1.0f) {
                    org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (textPaint.getAlpha() * f23));
                }
                canvas2.save();
                if (s1Var2.F && !s1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f24 = s1Var2.I8;
                r1 r1Var5 = s1Var2.Vc;
                if (r1Var5.f25191w0) {
                    f24 += r1Var5.f25133i0;
                }
                MessageObject.GroupedMessages groupedMessages = s1Var2.G;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f12 = f10;
                } else {
                    f24 -= s1Var2.getTranslationY();
                    f12 = f10 + s1Var2.G.transitionParams.offsetRight;
                }
                float f25 = f24;
                float f26 = f12;
                if (s1Var2.F && s1Var2.f4()) {
                    f25 += AndroidUtilities.dp(1.0f);
                }
                float f27 = f25;
                if (r1Var5.f25191w0) {
                    float f28 = s1Var2.f25578ve;
                    f12 += f28;
                    f26 += f28;
                }
                float f29 = f12;
                boolean shouldDrawReactions = s1Var2.f25556u7.shouldDrawReactions();
                kg.r0 r0Var = s1Var2.J;
                if (shouldDrawReactions && r0Var.f13832b) {
                    if (r1Var5.f25191w0 && r1Var5.f25128h0 != 0.0f) {
                        j10 = r0Var.j(1.0f);
                    } else {
                        j10 = r0Var.j(r1Var5.K1);
                    }
                    f26 += j10;
                }
                if (r1Var5.T0) {
                    f26 = th.b(1.0f, r1Var5.K1, r1Var5.Y0, f26);
                }
                float f30 = f26;
                boolean f42 = s1Var2.f4();
                RectF rectF = s1Var2.Y4;
                lh.x2 x2Var2 = s1Var2.O0;
                if (f42) {
                    int i17 = -(s1Var2.f9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (s1Var2.f25556u7.shouldDrawWithoutBackground()) {
                        M2 = s1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = s1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f31 = f23;
                    x2Var = x2Var2;
                    org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (s1Var2.f25384i5 * 255.0f * f31));
                    MessageObject messageObject3 = s1Var2.f25556u7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f17 = f29;
                        f18 = f31;
                    } else {
                        float currentAlpha = x2Var.isCrossfadingWithOldImage() ? 1.0f : x2Var.getCurrentAlpha();
                        if (!x2Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f17 = f29;
                        f18 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = s1Var2.f25556u7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.n5 n5Var = s1Var2.f25365h0;
                        f18 *= n5Var == null ? 0.0f : n5Var.e();
                    }
                    M2.setAlpha((int) com.google.android.recaptcha.internal.a.C(alpha, s1Var2.f25384i5, f18, 0.6f));
                    int i18 = s1Var2.G1;
                    if (i18 != 7 && i18 != 6 && s1Var2.f25556u7.type != 19) {
                        int[] roundRadius = x2Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z24 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = s1Var2.f25556u7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z24 = false;
                    }
                    MessageObject messageObject6 = s1Var2.f25556u7;
                    float dp4 = f17 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (s1Var2.f25321e0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z24 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = s1Var2.f25556u7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f32 = f18;
                    float f33 = dp4;
                    if (s1Var2.G1 != 7 || ((messageObject = s1Var2.f25556u7) != null && messageObject.isRoundOnce())) {
                        photoBottom = s1Var2.getPhotoBottom() + s1Var2.f25479p0;
                    } else {
                        photoBottom = f27 - ((1.0f - s1Var2.getVideoTranscriptionProgress()) * (r0Var.i(r1Var5.K1) + AndroidUtilities.dp(s1Var2.F ? 4.0f : 5.0f)));
                    }
                    float f34 = photoBottom;
                    float dp7 = f34 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.g6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f35 = dp5 - dp6;
                    float f36 = dp6 + dp5 + f11;
                    int i19 = z24 ? 12 : 8;
                    if (s1Var2.f25556u7.isOutOwner()) {
                        f19 = f36;
                        i14 = (s1Var2.f25556u7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f19 = f36;
                        i14 = 0;
                    }
                    rectF.set(f35, dp7, f19 + AndroidUtilities.dp(i19 + i14), dp7 + max);
                    i4 i4Var = s1Var2.B7;
                    if (i4Var != null) {
                        float f37 = dp2;
                        canvas2.save();
                        Path path = i4Var.f24493t;
                        path.rewind();
                        path.addRoundRect(rectF, f37, f37, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!s1Var2.f25556u7.isQuickReply()) {
                        if (s1Var2.f25556u7.hasMediaSpoilers() && s1Var2.f25556u7.type != 5) {
                            Path path2 = s1Var2.A5;
                            path2.rewind();
                            float f38 = dp2;
                            path2.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = s1Var2.f25556u7.needDrawBluredPreview() ? x2Var : s1Var2.P0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = s1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * s1Var2.f25399j5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f38, f38, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            s1Var2.p0();
                            float f39 = dp2;
                            canvas2.drawRoundRect(rectF, f39, f39, M2);
                            if (M2 == s1Var2.M2("paintChatActionBackground") && s1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.g6.f23130h2.getAlpha();
                                org.telegram.ui.ActionBar.g6.f23130h2.setAlpha((int) (alpha4 * s1Var2.f25384i5 * f32));
                                canvas2.drawRoundRect(rectF, f39, f39, org.telegram.ui.ActionBar.g6.f23130h2);
                                org.telegram.ui.ActionBar.g6.f23130h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f40 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = s1Var2.f25556u7;
                    float dp8 = f40 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (s1Var2.f25556u7.shouldDrawReactions() && r0Var.f13832b) {
                        s1Var2.t4();
                        r0Var.D = 0.0f;
                        r0Var.E = false;
                        r0Var.d(canvas2, r1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(s1Var2.Vb) || s1Var2.Vb.megagroup) && (s1Var2.f25556u7.messageOwner.flags & 1024) == 0 && s1Var2.Rb == null && !s1Var2.U7) {
                        i12 = i17;
                        f27 = f27;
                        c3 = 7;
                        f20 = dp8;
                        f23 = f31;
                    } else {
                        float lineWidth = (s1Var2.f25433lb - staticLayout.getLineWidth(0)) + dp8;
                        if (r0Var.f13832b && !r0Var.f13847s) {
                            lineWidth -= r0Var.f13845q;
                        }
                        float f41 = lineWidth;
                        int g10 = r1Var5.g();
                        int i20 = r1Var5.a2;
                        if (i20 >= 0 && i20 != g10 && !s1Var2.f25363gd) {
                            s1Var2.t1(i20, g10, z10);
                        }
                        boolean z27 = s1Var2.f25363gd;
                        if (z27) {
                            g10 = s1Var2.f25319dd;
                        }
                        boolean z28 = (g10 & 4) != 0;
                        boolean z29 = (g10 & 8) != 0;
                        if (z27) {
                            int i21 = s1Var2.f25334ed;
                            if ((i21 & 4) != 0) {
                                i15 = i21;
                                z26 = true;
                            } else {
                                i15 = i21;
                                z26 = false;
                            }
                            float f43 = i17;
                            r1Var4 = r1Var5;
                            f21 = f41;
                            boolean z30 = z28;
                            c3 = 7;
                            i12 = i17;
                            boolean z31 = (i15 & 8) != 0;
                            s1Var2.L1(canvas2, z26, z31, f27, f31, f43, f33, 1.0f - s1Var2.f25349fd, z11);
                            boolean z32 = z26;
                            boolean z33 = z29;
                            s1Var2.L1(canvas, z30, z33, f27, f31, f43, f33, s1Var2.f25349fd, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z30;
                            f23 = f31;
                            if (!s1Var2.f25556u7.isOutOwner()) {
                                if (!z32 && !z31) {
                                    s1Var2.p2(canvas, f23, f43, f22, 1.0f - s1Var2.f25349fd, z11);
                                }
                                if (!z25 && !z33) {
                                    s1Var2.p2(canvas, f23, f43, f22, s1Var2.f25349fd, z11);
                                }
                            }
                        } else {
                            r1Var4 = r1Var5;
                            f21 = f41;
                            boolean z34 = z28;
                            boolean z35 = z29;
                            c3 = 7;
                            i12 = i17;
                            if (!s1Var2.f25556u7.isOutOwner() && !z34 && !z35) {
                                s1Var2.p2(canvas, f31, i12, f33, 1.0f, z11);
                            }
                            s1Var2 = this;
                            s1Var2.L1(canvas, z34, z35, f27, f31, i12, f33, 1.0f, z11);
                            f27 = f27;
                            f22 = f33;
                            z25 = z34;
                            f23 = f31;
                        }
                        if (s1Var2.f25556u7.isOutOwner()) {
                            canvas2 = canvas;
                            s1Var2.p2(canvas2, f23, i12, f22, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        r1Var5 = r1Var4;
                        r1Var5.a2 = r1Var4.g();
                        if (z25 && z10 && s1Var2.getParent() != null) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        f20 = f21;
                    }
                    canvas2.save();
                    float f44 = f30 + f20;
                    s1Var2.f25390ib = f44;
                    float dp9 = (f34 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    s1Var2.f25405jb = dp9;
                    canvas2.translate(f44, dp9);
                    gh.k.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.g6.T2.setAlpha(255);
                    z12 = z24;
                    c6 = 2;
                } else {
                    x2Var = x2Var2;
                    c3 = 7;
                    if (s1Var2.f25556u7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (s1Var2.G8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(s1Var2.f9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f45 = -staticLayout.getLineLeft(0);
                    if (s1Var2.f25556u7.shouldDrawReactions() && r0Var.f13832b) {
                        s1Var2.t4();
                        r0Var.D = 0.0f;
                        r0Var.E = false;
                        r0Var.d(canvas2, r1Var5.K1, null);
                    }
                    if ((ChatObject.isChannel(s1Var2.Vb) && !s1Var2.Vb.megagroup) || (s1Var2.f25556u7.messageOwner.flags & 1024) != 0 || s1Var2.Rb != null || r1Var5.F || s1Var2.U7 || r1Var5.B) {
                        float lineWidth2 = (f11 - staticLayout.getLineWidth(0)) + f45;
                        if (r0Var.f13832b && !r0Var.f13847s) {
                            lineWidth2 -= r0Var.f13845q;
                        }
                        float f46 = lineWidth2;
                        int g11 = r1Var5.g();
                        int i22 = r1Var5.a2;
                        if (i22 >= 0 && i22 != g11 && !s1Var2.f25363gd) {
                            s1Var2.t1(i22, g11, z10);
                        }
                        boolean z36 = s1Var2.f25363gd;
                        if (z36) {
                            g11 = s1Var2.f25319dd;
                        }
                        boolean z37 = (g11 & 4) != 0;
                        boolean z38 = (g11 & 8) != 0;
                        if (z36) {
                            int i23 = s1Var2.f25334ed;
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
                            r1Var = r1Var5;
                            s1Var2.L1(canvas2, z14, z39, f27, f47, f48, f29, 1.0f - s1Var2.f25349fd, z11);
                            boolean z40 = z14;
                            boolean z41 = z39;
                            boolean z42 = z37;
                            boolean z43 = z38;
                            s1Var2.L1(canvas, z42, z43, f27, f47, f48, f29, s1Var2.f25349fd, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z42;
                            f23 = f47;
                            if (!s1Var2.f25556u7.isOutOwner()) {
                                if (!z40 && !z41) {
                                    s1Var2.p2(canvas, f23, f48, f13, 1.0f - s1Var2.f25349fd, z11);
                                }
                                if (!z13 && !z43) {
                                    s1Var2.p2(canvas, f23, f48, f13, s1Var2.f25349fd, z11);
                                }
                            }
                        } else {
                            r1Var = r1Var5;
                            boolean z44 = z37;
                            boolean z45 = z38;
                            if (!s1Var2.f25556u7.isOutOwner() && !z44 && !z45) {
                                s1Var2.p2(canvas, f23, i12, f29, 1.0f, z11);
                            }
                            s1Var2 = this;
                            float f49 = f23;
                            s1Var2.L1(canvas, z44, z45, f27, f49, i12, f29, 1.0f, z11);
                            f27 = f27;
                            f13 = f29;
                            z13 = z44;
                            f23 = f49;
                        }
                        if (s1Var2.f25556u7.isOutOwner()) {
                            canvas2 = canvas;
                            s1Var2.p2(canvas2, f23, i12, f13, 1.0f, z11);
                        } else {
                            canvas2 = canvas;
                        }
                        r1Var5 = r1Var;
                        r1Var5.a2 = r1Var.g();
                        if (z13 && z10 && s1Var2.getParent() != null) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        f45 = f46;
                    }
                    canvas2.save();
                    if (r1Var5.T0 && r1Var5.K1 != 1.0f) {
                        if (r1Var5.U0 != null) {
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((s1Var2.B || s1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.g6.T2.getAlpha();
                            org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (alpha5 * r1Var5.K1));
                            r1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.g6.T2.setAlpha(alpha5);
                            gh.k.f(canvas2, r1Var5.V0);
                            c6 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.g6.T2.getAlpha();
                            canvas2.save();
                            float f50 = i12;
                            canvas2.translate(r1Var5.f25125g1 + f45, ((f27 - AndroidUtilities.dp((s1Var2.B || s1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            float f51 = alpha6;
                            c6 = 2;
                            org.telegram.ui.ActionBar.g6.T2.setAlpha((int) ((1.0f - r1Var5.K1) * f51));
                            gh.k.f(canvas2, r1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f30 + f45, ((f27 - AndroidUtilities.dp((s1Var2.B || s1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f50);
                            org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (f51 * r1Var5.K1));
                            gh.k.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.g6.T2.setAlpha(alpha6);
                        }
                    } else {
                        c6 = 2;
                        float f52 = f30 + f45;
                        s1Var2.f25390ib = f52;
                        float dp10 = ((f27 - AndroidUtilities.dp((s1Var2.B || s1Var2.A) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        s1Var2.f25405jb = dp10;
                        canvas2.translate(f52, dp10);
                        gh.k.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z12 = false;
                }
                int i24 = i12;
                if (s1Var2.f25556u7.isOutOwner()) {
                    int g12 = r1Var5.g();
                    int i25 = r1Var5.a2;
                    if (i25 >= 0 && i25 != g12 && !s1Var2.f25363gd) {
                        s1Var2.t1(i25, g12, z10);
                    }
                    if (s1Var2.f25363gd) {
                        g12 = s1Var2.f25319dd;
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
                        r1Var2 = r1Var5;
                        z16 = true;
                    } else {
                        r1Var2 = r1Var5;
                        z16 = false;
                    }
                    boolean z47 = (g12 & 8) != 0;
                    if (s1Var2.f25435le != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, s1Var2.f25435le);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (s1Var2.f25363gd) {
                        int i26 = s1Var2.f25334ed;
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
                            r1Var3 = r1Var2;
                            str = "paintChatTimeBackground";
                            boolean z49 = z18;
                            z16 = z20;
                            i13 = 0;
                            f15 = 0.0f;
                            s1Var2.l2(canvas2, z49, z46, z16, z22, f16, z12, i24, f27, s1Var2.f25349fd, true, z11);
                        } else {
                            r1Var3 = r1Var2;
                            str = "paintChatTimeBackground";
                            boolean z50 = z18;
                            i13 = 0;
                            f15 = 0.0f;
                            float f53 = i24;
                            s1Var2.l2(canvas, z19, z48, z21, z23, f16, z12, f53, f27, 1.0f - s1Var2.f25349fd, false, z11);
                            z16 = z20;
                            s1Var2.l2(canvas, z50, z46, z16, z22, f16, z12, f53, f27, s1Var2.f25349fd, false, z11);
                        }
                        s1Var = this;
                        canvas2 = canvas;
                    } else {
                        r1Var3 = r1Var2;
                        str = "paintChatTimeBackground";
                        i13 = 0;
                        f15 = 0.0f;
                        canvas2 = canvas;
                        l2(canvas2, z15, z46, z16, z47, f16, z12, i24, f27, 1.0f, false, z11);
                        s1Var = this;
                    }
                    if (z17) {
                        canvas2.restore();
                    }
                    r1Var3.a2 = r1Var3.g();
                    if (z10 && z16 && s1Var.getParent() != null) {
                        ((View) s1Var.getParent()).invalidate();
                    }
                } else {
                    s1Var = s1Var2;
                    str = "paintChatTimeBackground";
                    i13 = 0;
                    f15 = 0.0f;
                }
                canvas2.restore();
                if (s1Var.Ib != null) {
                    if (s1Var.Gb == f15 || s1Var.Hb == f15) {
                        s1Var.s0();
                    }
                    Path path3 = s1Var.Mb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(x2Var.getImageX(), x2Var.getImageY(), x2Var.getImageX2(), x2Var.getImageY2());
                    int[] roundRadius2 = x2Var.getRoundRadius();
                    float f54 = roundRadius2[i13];
                    float[] fArr = s1Var.Nb;
                    fArr[1] = f54;
                    fArr[i13] = f54;
                    float f55 = roundRadius2[1];
                    fArr[3] = f55;
                    fArr[c6] = f55;
                    float f56 = roundRadius2[c6];
                    fArr[5] = f56;
                    fArr[4] = f56;
                    float f57 = roundRadius2[3];
                    fArr[c3] = f57;
                    fArr[6] = f57;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF2.set(s1Var.Gb - AndroidUtilities.dp(12.0f), s1Var.Hb - AndroidUtilities.dp(8.0f), s1Var.Gb + org.telegram.ui.ActionBar.g6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + s1Var.Ib.getWidth() + AndroidUtilities.dp(12.0f), s1Var.Hb + s1Var.Ib.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (s1Var.Bb == null) {
                        if (s1Var.Lb == null) {
                            s1Var.Lb = new gh.k();
                        }
                        s1Var.Lb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        s1Var.Lb.setBounds((int) x2Var.getImageX(), (int) x2Var.getImageY(), (int) x2Var.getImageX2(), (int) x2Var.getImageY2());
                        s1Var.Lb.draw(canvas2);
                    }
                    s1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, s1Var.getWidth(), s1Var.getHeight(), (int) (s1Var.Fb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.g6.f23148i2.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23148i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.g6.f23148i2);
                    org.telegram.ui.ActionBar.g6.f23148i2.setAlpha(alpha7);
                    canvas.translate(s1Var.Gb + AndroidUtilities.dp(4.0f), s1Var.Hb);
                    Drawable drawable = org.telegram.ui.ActionBar.g6.L3;
                    drawable.setBounds(i13, i13, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.g6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.g6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.g6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), 0.0f);
                    gh.k.f(canvas, s1Var.Ib);
                    canvas.restore();
                    if (s1Var.H2 != null && x2Var.getVisible() && s1Var.f25368h3 == 0) {
                        int i27 = SharedConfig.bubbleRadius;
                        if (i27 > 2) {
                            dp = AndroidUtilities.dp(i27 - 2);
                            z12 = SharedConfig.bubbleRadius >= 10;
                        } else {
                            dp = AndroidUtilities.dp(i27);
                        }
                        int imageX = (int) (x2Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (x2Var.getImageY() + AndroidUtilities.dp(6.0f));
                        rectF.set(imageX - AndroidUtilities.dp(4.0f), imageY - AndroidUtilities.dp(1.5f), AndroidUtilities.dp(z12 ? 2.0f : 0.0f) + AndroidUtilities.dp(4.0f) + s1Var.f25424l2 + imageX, AndroidUtilities.dp(1.5f) + s1Var.H2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, s1Var.M2(str));
                        canvas.save();
                        if (z12) {
                            i13 = 2;
                        }
                        canvas.translate(imageX + i13, imageY);
                        gh.k.f(canvas, s1Var.H2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f25571v7 != null) {
            return this.f25602x7;
        }
        return this.A;
    }

    public final void n4() {
        float imageHeight;
        float f9;
        float f10;
        float dp;
        int i10;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        MessageObject messageObject = this.f25556u7;
        int i15 = messageObject.type;
        r1 r1Var = this.Vc;
        int i16 = 0;
        boolean z10 = true;
        if (i15 != 1 && i15 != 20 && this.G1 != 4 && i15 != 8 && i15 != 23) {
            float f12 = 43.0f;
            float f13 = 11.0f;
            float f14 = 0.0f;
            float f15 = 10.0f;
            if (this.f25323e2) {
                int i17 = this.f25513r8;
                if (!messageObject.isOutOwner()) {
                    f13 = 17.0f;
                }
                this.f25426l4 = AndroidUtilities.dp(f13) + i17 + this.f25413k4;
                int i18 = this.f25465o0 - this.f25454n4;
                if (this.E) {
                    f15 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f15)) - this.f25381i2) - AndroidUtilities.dp(17.0f);
                if (this.f9 && this.f25501qa != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f12);
                this.f25439m4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Hc, y3());
            } else {
                if (this.f25447md) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f25556u7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f25426l4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f25513r8;
                    if (!messageObject.isOutOwner() && !this.f25359g8 && !this.F) {
                        f13 = 17.0f;
                    }
                    this.f25426l4 = AndroidUtilities.dp(f13) + i19 + this.f25413k4;
                }
                int i20 = this.f25465o0 - this.f25454n4;
                if (this.E) {
                    f11 = 9.0f;
                } else {
                    f11 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f11);
                if (this.f9 && this.f25501qa != 3) {
                    if (f4()) {
                        f12 = 41.3f;
                    }
                } else {
                    f12 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f12);
                kg.r0 r0Var = this.J;
                if (!r0Var.f13847s && !r0Var.f13832b) {
                    if (this.f25556u7.type == 9 && this.H == null) {
                        f14 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f14) + r0Var.f13844p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f25439m4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Hc, y3());
            }
        } else {
            if (r1Var.f25119f0) {
                f9 = r1Var.m0;
                f10 = r1Var.f25156n0;
                imageHeight = r1Var.f25164p0;
            } else {
                lh.x2 x2Var = this.O0;
                float imageX = x2Var.getImageX();
                float imageY = x2Var.getImageY();
                imageHeight = x2Var.getImageHeight();
                f9 = imageX;
                f10 = imageY;
            }
            this.f25426l4 = f9 + AndroidUtilities.dp(5.0f) + this.f25413k4;
            dp = f10 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f25439m4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), y3()) + f10;
            z10 = false;
        }
        this.f25426l4 += getExtraTextX();
        MessageObject messageObject2 = this.f25556u7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f25556u7.isSponsored()) {
            if (z10 && this.J1) {
                this.f25439m4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f25281b2);
            }
            if (z10) {
                i12 = AndroidUtilities.dp(14.0f) + this.f25281b2;
            } else {
                i12 = 0;
            }
            float f16 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Y3;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(r1Var);
            }
            this.m0 = (int) ((f16 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), y3())) - r1Var.f25138j0);
        }
        MessageObject messageObject3 = this.f25556u7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f25439m4 += this.f25285b6;
        }
    }

    public final void o0() {
        jr jrVar;
        boolean z10 = this.f25380i1;
        if (z10 || this.f25395j1) {
            if ((z10 && this.f25410k1 == 1.0f) || (!z10 && this.f25410k1 == 0.0f)) {
                this.f25395j1 = false;
            }
            if (z10) {
                jrVar = jr.f29801g;
            } else {
                jrVar = jr.f29802i;
            }
            this.f25436m1 = (int) Math.ceil(jrVar.getInterpolation(this.f25410k1) * AndroidUtilities.dp(35.0f));
            if (this.f25556u7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f25436m1 = 0;
                }
            }
            if (!this.f25556u7.isOutOwner() || this.f25556u7.hasWideCode) {
                y4();
            }
            if (this.f25395j1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.l1;
                this.l1 = elapsedRealtime;
                if (this.f25380i1) {
                    float f9 = (((float) j10) / 200.0f) + this.f25410k1;
                    this.f25410k1 = f9;
                    if (f9 > 1.0f) {
                        this.f25410k1 = 1.0f;
                    }
                } else {
                    float f10 = this.f25410k1 - (((float) j10) / 200.0f);
                    this.f25410k1 = f10;
                    if (f10 <= 0.0f) {
                        this.f25410k1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void o1() {
        float f9;
        float f10;
        int i10;
        int measureText;
        boolean z10;
        if (this.N2) {
            s1(0);
        }
        if (this.N2 && this.K2 == null) {
            this.f25425l3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.Y2;
            if (charSequence == null) {
                int i11 = this.X2;
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
                            TL_stars.StarGift starGift = this.f25636ze;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.E7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z10 = false;
                                } else {
                                    if (this.f25636ze.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z10 = true;
                                }
                                if (z10) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new iq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
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
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f25556u7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f25556u7.isSponsored() && this.F8 < (measureText = (int) (org.telegram.ui.ActionBar.g6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.F8 = measureText;
            }
            int dp = this.F8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.g6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f11 = 0.0f;
            if (lineCount > 0) {
                f9 = this.K2.getLineWidth(0);
            } else {
                f9 = 0.0f;
            }
            this.L2 = f9;
            if (this.K2.getLineCount() > 0) {
                f11 = this.K2.getLineLeft(0);
            }
            this.M2 = f11;
            int i12 = this.F8;
            int i13 = this.X2;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f10 = 34.0f;
            } else {
                f10 = 13.0f;
            }
            this.f25425l3 = i12 - AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f25465o0;
            this.f25465o0 = dp2;
            if (this.f25556u7.type == 12) {
                this.f25465o0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f25556u7.isSponsored()) {
                this.f25465o0 = AndroidUtilities.dp(2.0f) + this.f25465o0;
            }
            StaticLayout staticLayout2 = this.K2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f25425l3 - Math.ceil(this.K2.getLineWidth(0)))) / 2;
                if (this.X2 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f25397j3 = ceil + i10;
                int lineLeft = (int) this.K2.getLineLeft(0);
                this.f25412k3 = lineLeft;
                this.f25397j3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f25399j5 > 0.0f) {
            lh.x2 x2Var = this.O0;
            if (x2Var.getVisible()) {
                MessageObject messageObject2 = this.f25556u7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f25556u7.getVideoStartsTimestamp() / ((float) this.f25556u7.getDuration());
                } else {
                    videoSavedProgress = this.f25556u7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = x2Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(x2Var.getImageX(), x2Var.getImageY(), x2Var.getImageX2(), x2Var.getImageY2());
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
                        rectF.set(x2Var.getImageX(), x2Var.getImageY(), x2Var.getImageX2(), x2Var.getImageY2());
                        this.Db.addRoundRect(rectF, this.Eb, Path.Direction.CW);
                        canvas.clipPath(this.Db);
                    }
                    org.telegram.ui.ActionBar.g6.f23237n2.setColor(org.telegram.ui.ActionBar.g6.l1(this.f25399j5 * 0.35f, -1));
                    canvas.drawRect(x2Var.getImageX(), x2Var.getImageY2() - AndroidUtilities.dp(3.0f), x2Var.getImageX2(), x2Var.getImageY2(), org.telegram.ui.ActionBar.g6.f23237n2);
                    org.telegram.ui.ActionBar.g6.f23237n2.setColor(org.telegram.ui.ActionBar.g6.l1(this.f25399j5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(x2Var.getImageX() - AndroidUtilities.dp(2.0f), x2Var.getImageY2() - AndroidUtilities.dp(3.0f), (x2Var.getImageWidth() * clamp01) + x2Var.getImageX(), x2Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23237n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f25447md && this.f25463nd) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f25556u7 != null) {
            int i10 = this.E7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f25556u7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f25556u7.getDialogId() == clientUserId || this.f25556u7.getDialogId() == 1271266957)) {
                this.Vb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f25556u7.getDialogId() == 489000) {
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
                    if (this.f25556u7.isSavedFromMegagroup()) {
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
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f25556u7.getDialogId() == clientUserId)) {
                this.Ub = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f25556u7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Ub = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f25556u7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Ub = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f25556u7.getDialogId();
                long fromChatId = this.f25556u7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f25556u7.getDialogId())) {
                    if (this.f25556u7.isOutOwner()) {
                        this.Ub = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f25556u7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Ub = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f25556u7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Ub = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f25556u7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Vb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Vb = chat;
                } else {
                    TLRPC.Message message = this.f25556u7.messageOwner;
                    if (message.post) {
                        this.Vb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && imageReceiver == this.O0 && messageObject.isAnimatedSticker()) {
            this.Fc.N1(this.f25556u7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        s1 s1Var;
        float f9;
        float f10;
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.E7).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.f25556u7;
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
        org.telegram.ui.Components.g9 g9Var = this.T3;
        if (g9Var != null) {
            g9Var.g();
        }
        bh.j jVar = this.X5;
        if (jVar != null) {
            jVar.a();
        }
        bh.j jVar2 = this.Y5;
        if (jVar2 != null) {
            jVar2.a();
        }
        ArrayList arrayList = this.U5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((q1) obj).q();
        }
        MessageObject messageObject2 = this.f25571v7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            s1Var = this;
            s1Var.V3(messageObject2, this.f25587w7, this.f25615y7, this.f25602x7, this.f25629z7, this.A7);
            s1Var.f25571v7 = null;
            s1Var.f25587w7 = null;
        } else {
            s1Var = this;
        }
        CheckBoxBase checkBoxBase = s1Var.f25366h1;
        if (checkBoxBase != null) {
            checkBoxBase.f26319l = true;
        }
        CheckBoxBase checkBoxBase2 = s1Var.f25352g1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26319l = true;
        }
        t11 t11Var = s1Var.f25265a0;
        if (t11Var != null) {
            t11Var.a();
        }
        CheckBoxBase checkBoxBase3 = s1Var.f25604x9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26319l = true;
        }
        if (s1Var.N8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = s1Var.N8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f26319l = true;
                i11++;
            }
        }
        s1Var.I0 = true;
        float f11 = 0.0f;
        s1Var.f25578ve = 0.0f;
        s1Var.f25563ue = 0.0f;
        s1Var.f25436m1 = 0;
        y4();
        ImageReceiver imageReceiver = s1Var.f25388i9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        F0();
        MessageObject messageObject3 = s1Var.f25556u7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = s1Var.G1;
        if (i12 == 4 && s1Var.f25401j7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(s1Var.f25556u7);
            s1Var.f25623z1 = isPlayingMessage;
            if (isPlayingMessage) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            s1Var.B1 = f10;
            s1Var.A1 = 0;
        } else {
            s1Var.f25623z1 = false;
            s1Var.B1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && s1Var.f25565v1) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            s1Var.f25609y1 = f9;
        }
        if (getDelegate() != null && getDelegate().y2() != null) {
            l9 y22 = getDelegate().y2();
            y22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == y22.f25970w) {
                y22.W = s1Var;
            }
        }
        if (s1Var.G1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(s1Var.f25556u7)) {
                f11 = 1.0f;
            }
            s1Var.f25407jd = f11;
        }
        kg.r0 r0Var = s1Var.J;
        ArrayList arrayList2 = r0Var.v;
        r0Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((kg.o0) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = s1Var.f25277ad;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        i4 i4Var = s1Var.B7;
        if (i4Var != null) {
            ArrayList arrayList3 = i4Var.f24478c;
            if (!i4Var.C) {
                i4Var.C = true;
                gh.j jVar3 = i4Var.f24485l;
                if (jVar3 != null) {
                    jVar3.b(i4Var.f24476a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    h4 h4Var = (h4) arrayList3.get(i14);
                    if (!h4Var.I) {
                        h4Var.I = true;
                        h4Var.f24443f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = s1Var.f25556u7;
        if (messageObject4 != null && messageObject4.type == 20 && s1Var.Ib != null) {
            invalidate();
        }
        org.telegram.ui.Components.n5 n5Var = s1Var.f25291bc;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = s1Var.f25304cc;
        if (n5Var2 != null) {
            n5Var2.a();
        }
        gh.j jVar4 = s1Var.Bb;
        if (jVar4 != null) {
            if (jVar4.f7398i) {
                gh.j w32 = w3();
                s1Var.Bb = w32;
                Integer num = s1Var.Cb;
                if (num != null) {
                    w32.f7400k.put(this, num);
                }
            } else {
                jVar4.a(this);
            }
        }
        o0 o0Var = s1Var.v;
        if (o0Var != null) {
            ArrayList arrayList4 = o0Var.f24781q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((n0) arrayList4.get(i15)).a();
            }
        }
        tw0 tw0Var = s1Var.f25266a1;
        if (tw0Var != null) {
            for (int i16 = 0; i16 < tw0Var.f33052b; i16++) {
                tw0Var.f33053c[i16].a(this);
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
        int i10 = this.E7;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        AnimatorSet animatorSet = this.C7;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C7 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.f25366h1;
        if (checkBoxBase != null) {
            checkBoxBase.f26319l = false;
        }
        bh.j jVar = this.X5;
        if (jVar != null) {
            jVar.f2672b.onDetachedFromWindow();
            jVar.f2682x.f();
        }
        bh.j jVar2 = this.Y5;
        if (jVar2 != null) {
            jVar2.f2672b.onDetachedFromWindow();
            jVar2.f2682x.f();
        }
        jf.p pVar = this.f25538t4;
        if (pVar != null) {
            pVar.b();
            this.f25538t4 = null;
        }
        RichMessageLayout richMessageLayout = this.f25556u7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        r1 r1Var = this.Vc;
        RichMessageLayout richMessageLayout2 = r1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.U5;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((q1) obj).r();
        }
        org.telegram.ui.Components.g9 g9Var = this.T3;
        if (g9Var != null) {
            g9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f25352g1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f26319l = false;
        }
        if (this.N8 != null) {
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.N8;
                if (i12 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i12].f26319l = false;
                i12++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.f25604x9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f26319l = false;
        }
        this.I0 = false;
        i4 i4Var = this.B7;
        if (i4Var != null) {
            i4Var.e();
        }
        this.f25388i9.onDetachedFromWindow();
        t11 t11Var = this.f25265a0;
        if (t11Var != null) {
            t11Var.b();
        }
        F0();
        if (this.C4 && this.A4 != null && this.B4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.A4);
            this.C4 = false;
        }
        tw0 tw0Var = this.f25266a1;
        if (tw0Var != null) {
            tw0Var.a(this);
        }
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().y2() != null) {
            l9 y22 = getDelegate().y2();
            y22.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == y22.f25970w) {
                y22.W = null;
            }
        }
        r1Var.f25187v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
            org.telegram.ui.ActionBar.g6.x0().f29115i = null;
        }
        ValueAnimator valueAnimator = this.f25377hd;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25377hd.cancel();
        }
        this.J.q();
        this.f25363gd = false;
        FlagSecureReason flagSecureReason = this.f25277ad;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.n5 n5Var = this.f25291bc;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f25304cc;
        if (n5Var2 != null) {
            n5Var2.b();
        }
        gh.j jVar3 = this.Bb;
        if (jVar3 != null) {
            jVar3.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f24781q;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                n0 n0Var = (n0) arrayList2.get(i13);
                int i14 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f24731c;
                    if (i14 < imageReceiverArr.length) {
                        imageReceiverArr[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
            }
        }
        jf.j.d().f(this.f25350fe);
    }

    @Override
    public void onDraw(Canvas canvas) {
        S1(canvas);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        boolean z11;
        int i10 = this.G1;
        if (i10 != 3 && i10 != 5) {
            z11 = false;
        } else {
            z11 = true;
        }
        m4(true, z11, false);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int x4 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int i10 = 0;
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f25434ld;
                if (i10 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i10)).contains(x4, z22)) {
                    int keyAt = sparseArray.keyAt(i10);
                    if (keyAt != this.f25635zd) {
                        this.f25635zd = keyAt;
                        I3(keyAt, 32768, null);
                        return true;
                    }
                    return true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.f25635zd = 0;
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
        MessageObject messageObject = this.f25556u7;
        boolean z10 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.R4 == AndroidUtilities.displaySize.y)) {
            s1Var = this;
        } else {
            this.f25564v0 = true;
            MessageObject messageObject2 = this.f25556u7;
            this.f25556u7 = null;
            s1Var = this;
            s1Var.X3(messageObject2, this.G, this.B, this.A, this.C, false);
            s1Var.f25564v0 = false;
        }
        w4();
        int i13 = s1Var.R + s1Var.f25279b0 + s1Var.f25307d0 + s1Var.f25465o0 + s1Var.f25493q0 + s1Var.W;
        sg.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(s1Var.f25556u7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f48019a.getHeight() - draftMessageMeasureController.f48019a.getPaddingTop()) - draftMessageMeasureController.f48019a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z10 = false;
            }
            draftMessageMeasureController.f48022e = z10;
            if (draftMessageMeasureController.f48020b > 0 && !z10) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        s1Var.f25393ie = Math.max(0, i12 - i13);
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
        this.f25556u7.loadedFileSize = j10;
        p1(j10, j11);
        if (this.f25535t1) {
            this.L0.o(min, true);
        } else {
            this.K0.o(min, true);
        }
        int i10 = this.G1;
        if (i10 != 3 && i10 != 5) {
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
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f25556u7.loadedFileSize = j10;
        RadialProgress2 radialProgress2 = this.K0;
        radialProgress2.o(min, true);
        if (j10 == j11 && ((this.H != null || this.f25556u7.isPaid()) && SendMessagesHelper.getInstance(this.E7).isSendingMessage(this.f25556u7.getId()) && ((i10 = this.K4) == 1 || (i10 == 4 && this.G1 == 5)))) {
            this.M0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f25550u1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f25550u1 = j11;
        }
        p1(j10, j11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f25473o8 && Build.VERSION.SDK_INT >= 23) {
            MessageObject messageObject = this.f25556u7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f25556u7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f25556u7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f25556u7.caption);
            }
        }
    }

    @Override
    public final void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0() {
        q0(getX(), this.Oc, getMeasuredWidth(), this.Pc);
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.p1(long, long):void");
    }

    public final void p2(Canvas canvas, float f9, float f10, float f11, float f12, boolean z10) {
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
        r1 r1Var;
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
        float f22 = f9 * f12;
        kg.r0 r0Var = this.J;
        if (r0Var.f13832b) {
            f13 = r0Var.j(1.0f);
        } else {
            f13 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.g6.T2.getAlpha();
        float N2 = N2(f10);
        StaticLayout staticLayout = this.Rb;
        r1 r1Var2 = this.Vc;
        if (staticLayout == null && !r1Var2.F) {
            r1Var = r1Var2;
            z15 = z11;
            f17 = f22;
            f14 = 10.0f;
            f18 = 2.0f;
            d = 1.0d;
        } else {
            boolean z18 = r1Var2.f25129h1;
            f14 = 10.0f;
            if (z18) {
                f15 = this.f25461nb;
            } else {
                f15 = f11;
            }
            float f23 = f15 + f13;
            d = 1.0d;
            boolean z19 = r1Var2.F;
            if (z19 && r1Var2.H == null && staticLayout != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z19 && r1Var2.H != null && staticLayout == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z19 && r1Var2.H != null && staticLayout != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((!this.f25447md || !r1Var2.l1) && z18 && !z12) {
                if (z13) {
                    f23 = r1Var2.I;
                } else {
                    float f24 = r1Var2.I;
                    float f25 = r1Var2.K1;
                    f23 = (f23 * f25) + ((1.0f - f25) * f24);
                }
            }
            MessageObject.GroupedMessages groupedMessages = this.G;
            if (groupedMessages != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                if (transitionParams.backgroundChangeBounds) {
                    f23 += transitionParams.offsetRight;
                }
            }
            if (r1Var2.f25191w0) {
                f23 += this.f25578ve;
            }
            if (f4()) {
                if (this.f25556u7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.g6.f23025b4;
                }
            } else if (!this.f25556u7.isOutOwner()) {
                if (z10) {
                    L2 = org.telegram.ui.ActionBar.g6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.g6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float n11 = a0.n(L2, f23, N2, org.telegram.ui.ActionBar.g6.T2.getTextSize());
            if (z12) {
                f16 = r1Var2.K1 * f22;
            } else if (z13) {
                f16 = (1.0f - r1Var2.K1) * f22;
            } else {
                f16 = f22;
            }
            L2.setAlpha((int) (f16 * 255.0f));
            if (z11) {
                canvas.save();
                z15 = z11;
                canvas.scale(f21, f21, j7.l1.c(AndroidUtilities.dp(3.0f) + n11, this.Sb, 2.0f, f23), L2.getBounds().centerY());
            } else {
                z15 = z11;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (r1Var2.F) {
                if (z14) {
                    canvas.save();
                    f17 = f22;
                    f18 = 2.0f;
                    org.telegram.ui.ActionBar.g6.T2.setAlpha((int) ((1.0d - r1Var2.K1) * alpha));
                    canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
                    r1Var = r1Var2;
                    r1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    r1Var = r1Var2;
                    f17 = f22;
                    f18 = 2.0f;
                }
                org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (alpha * f16));
            } else {
                r1Var = r1Var2;
                f17 = f22;
                f18 = 2.0f;
            }
            canvas.save();
            canvas.translate(f23 + n11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Rb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = r1Var.H;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.Rb != null) {
                f13 += n11 + this.Sb + AndroidUtilities.dp(10.0f);
            }
            if (z15) {
                canvas.restore();
            }
            if (r1Var.F) {
                org.telegram.ui.ActionBar.g6.T2.setAlpha(alpha);
            }
            r1Var.J = f23;
        }
        if (this.Ob != null) {
            boolean z20 = r1Var.f25129h1;
            if (z20) {
                f20 = this.f25461nb;
            } else {
                f20 = f11;
            }
            float f26 = f20 + f13;
            if ((!this.f25447md || !r1Var.l1) && z20) {
                float f27 = r1Var.K;
                float f28 = r1Var.K1;
                f26 = (f26 * f28) + ((1.0f - f28) * f27);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.G;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f26 += transitionParams2.offsetRight;
                }
            }
            if (r1Var.f25191w0) {
                f26 += this.f25578ve;
            }
            if (f4()) {
                if (this.f25556u7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.g6.f23006a4;
                }
            } else if (!this.f25556u7.isOutOwner()) {
                if (z10) {
                    L23 = org.telegram.ui.ActionBar.g6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.g6.M3;
                }
            } else {
                if (z10) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float n12 = a0.n(L23, f26, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.g6.T2.getTextSize() - AndroidUtilities.dp(f18));
            if (z15) {
                canvas.save();
                canvas.scale(f21, f21, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Pb) / f18) + f26, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f17 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (r1Var.f25111d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.g6.T2.setAlpha((int) ((d - r1Var.K1) * alpha));
                canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
                gh.k.f(canvas, r1Var.f25111d2);
                canvas.restore();
                org.telegram.ui.ActionBar.g6.T2.setAlpha((int) (alpha * r1Var.K1));
            }
            canvas.save();
            canvas.translate(f26 + n12 + AndroidUtilities.dp(3.0f), N2);
            gh.k.f(canvas, this.Ob);
            canvas.restore();
            if (z15) {
                canvas.restore();
            }
            f13 += this.Pb + n12 + AndroidUtilities.dp(f14);
            if (r1Var.f25111d2 != null) {
                org.telegram.ui.ActionBar.g6.T2.setAlpha(alpha);
            }
            r1Var.L = f26;
        }
        boolean z21 = this.U7;
        if (!z21 && !r1Var.B) {
            return;
        }
        boolean z22 = r1Var.f25129h1;
        if (z22) {
            f19 = this.f25461nb;
        } else {
            f19 = f11;
        }
        float f29 = f19 + f13;
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
        if (!this.f25447md && z22 && !z16) {
            if (z17) {
                f29 = r1Var.D;
            } else {
                float f30 = r1Var.D;
                float f31 = r1Var.K1;
                f29 = (f29 * f31) + ((1.0f - f31) * f30);
            }
        }
        MessageObject.GroupedMessages groupedMessages3 = this.G;
        if (groupedMessages3 != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
            if (transitionParams3.backgroundChangeBounds) {
                f29 += transitionParams3.offsetRight;
            }
        }
        if (r1Var.f25191w0) {
            f29 += this.f25578ve;
        }
        if (f4()) {
            if (this.f25556u7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.g6.Z3;
            }
        } else if (!this.f25556u7.isOutOwner()) {
            if (z10) {
                L22 = org.telegram.ui.ActionBar.g6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.g6.U3;
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
            if (this.U7) {
                L22.setAlpha((int) (f17 * 255.0f * r1Var.K1));
                n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.g6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - r1Var.K1) * f17 * 255.0f));
                n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.g6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f17 * 255.0f));
            n10 = a0.n(L22, f29, N2, org.telegram.ui.ActionBar.g6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
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
        r1Var.C = f29;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f25277ad == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new fa(this, 3));
                this.f25277ad = flagSecureReason;
                if (this.I0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f25277ad;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        s1 s1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        j1 j1Var = this.Fc;
        int i11 = 0;
        if (j1Var != null && j1Var.u2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f25556u7.type == 16) {
                this.Fc.B0(this, this.O4, this.P4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i10 == R.id.acc_action_small_button) {
            w1();
        } else if (i10 == R.id.acc_action_msg_options) {
            j1 j1Var2 = this.Fc;
            if (j1Var2 != null) {
                if (this.f25556u7.type == 16) {
                    j1Var2.p0(this, 0.0f, 0.0f);
                } else {
                    j1Var2.B0(this, this.O4, this.P4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                j1 j1Var3 = this.Fc;
                if (j1Var3 != null) {
                    TLRPC.Chat chat = this.f25348fc;
                    if (chat != null) {
                        s1Var = this;
                        j1Var3.S(s1Var, chat, this.f25556u7.messageOwner.fwd_from.channel_post, this.f25295c1, this.f25308d1, false);
                    } else {
                        s1Var = this;
                        TLRPC.User user = s1Var.f25318dc;
                        if (user != null) {
                            j1Var3.t0(this, user, s1Var.f25295c1, s1Var.f25308d1);
                        } else if (s1Var.gc != null) {
                            j1Var3.o(this);
                        }
                    }
                }
            } else {
                s1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    j1 j1Var4 = s1Var.Fc;
                    if (j1Var4 != null) {
                        j1Var4.J0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && s1Var.Fc != null && (arrayList = s1Var.f25556u7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            s1Var.Fc.H(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!s1Var.f25556u7.isVoice() || s1Var.f25556u7.isRoundVideo() || (s1Var.f25556u7.isMusic() && MediaController.getInstance().isPlayingMessage(s1Var.f25556u7))) && s1Var.E5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        s1Var = this;
        if (!s1Var.f25556u7.isVoice()) {
        }
        return true;
    }

    public final void q0(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Ed;
        if (c6Var != null) {
            c6Var.l(f9, f10 + this.R + this.f25279b0 + this.f25307d0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f9, f10 + this.R + this.f25279b0 + this.f25307d0, i10, i11);
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
            p1(this.f25556u7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f9, Runnable runnable) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f10;
        boolean z10;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.K0;
            RectF rectF = radialProgress2.f26479a;
            Paint paint = radialProgress2.f26484g;
            o90 o90Var = radialProgress2.f26485i;
            RectF rectF2 = radialProgress2.f26479a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f9) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f9) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                d5Var = this.f25500q8;
            } else {
                d5Var = this.f25487p8;
            }
            o90Var.B = d5Var;
            radialProgress2.f26486j.B = d5Var;
            radialProgress2.I = f9;
            runnable.run();
            if (this.V0 == null) {
                Paint paint2 = new Paint(1);
                this.V0 = paint2;
                f10 = 1.0f;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                f10 = 1.0f;
            }
            if (f9 < f10) {
                canvas2.save();
                float f11 = f10 - f9;
                float f12 = 0.7f * f11;
                canvas2.scale(f12, f12, rectF2.centerX(), AndroidUtilities.lerp(rectF2.top, rectF2.bottom, 0.5f));
                if (this.W0 == null) {
                    xi0 xi0Var = new xi0(R.raw.fire_once, "fire_once", AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.W0 = xi0Var;
                    xi0Var.f34753r0 = this;
                    xi0Var.H(true);
                    this.W0.I(1);
                    this.W0.start();
                }
                this.W0.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.X0 == null) {
                    i10 = 1;
                    this.X0 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.Y0 == null) {
                    Paint paint3 = new Paint(i10);
                    this.Y0 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.Z0 == null) {
                    Paint paint4 = new Paint(i10);
                    this.Z0 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f26497u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.g6.v0(i12, this.Ed);
                } else {
                    i11 = radialProgress2.f26490n;
                }
                this.X0.setColor(i11);
                this.Z0.setColor(i11);
                o90Var.a(false);
                this.X0.setShader(o90Var.d.getShader());
                this.Z0.setShader(o90Var.d.getShader());
                rectF3.set(this.W0.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                rectF3.inset(1.0f, 1.0f);
                canvas2.drawRect(rectF3, this.X0);
                this.W0.o(canvas, this.Y0, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.Z0.setAlpha((int) (255.0f * f11));
                this.Z0.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.Y4;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                co0 co0Var = this.D5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - co0Var.K) * (-360.0f), false, this.Z0);
                if (this.O6 == null) {
                    this.O6 = new o11();
                }
                this.O6.a((1.0f - co0Var.K) * (-360.0f), f11, canvas, this.Z0, rectF4);
                canvas2 = canvas;
            } else {
                xi0 xi0Var2 = this.W0;
                if (xi0Var2 != null) {
                    xi0Var2.A(true);
                    this.W0 = null;
                    if (this.O6 != null) {
                        this.O6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f9 * 1.5f) + 10.0f) * f9, this.V0);
            canvas2.restore();
            if (this.U0 == null) {
                nh.l lVar = new nh.l(3);
                this.U0 = lVar;
                lVar.e(-1, 0, 0);
                nh.l lVar2 = this.U0;
                lVar2.f18026i = 14.0f;
                lVar2.c(10.0f);
                this.U0.f18020a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z10 = true;
                this.U0.d(1, false, false);
                this.U0.f18027j = -AndroidUtilities.dpf2(0.33f);
                this.U0.f18028k = AndroidUtilities.dpf2(0.33f);
            } else {
                z10 = true;
            }
            nh.l lVar3 = this.U0;
            lVar3.f18026i = f9 * 14.0f;
            lVar3.c(f9 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f9, paint);
            nh.l lVar4 = this.U0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z10 = false;
            }
            lVar4.b(z10);
            nh.l lVar5 = this.U0;
            lVar5.f18031n = cos;
            lVar5.f18032o = sin;
            lVar5.a(canvas2, f9);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.C8 && (messageObject = this.f25556u7) != null && !messageObject.isOutOwner() && this.H == null) {
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
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null) {
            f1 f1Var = this.Dd;
            if (f1Var != null && f1Var.rewindCount != 0 && f1Var.rewindByBackSeek) {
                messageObject.audioProgress = f1Var.getVideoProgress();
            }
            boolean z11 = true;
            if (this.f25556u7.isPoll()) {
                bh.j jVar = this.X5;
                if (jVar != null) {
                    jVar.n(true);
                }
                bh.j jVar2 = this.Y5;
                if (jVar2 != null) {
                    jVar2.n(true);
                }
            }
            int i10 = this.G1;
            double d12 = 0.0d;
            d1 d1Var = this.C5;
            if (i10 == 4) {
                if (d1Var != null) {
                    d1Var.a();
                }
                if (this.f25497q4 == null || (!PhotoViewer.J1(this.f25556u7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f25556u7))) {
                    org.telegram.ui.Components.c6 animation = this.O0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f25556u7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f25556u7.isVideo() && animation.s()) {
                            this.Fc.N(this.f25556u7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f25556u7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                        d11 -= this.f25556u7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Fc != null && animation.o() >= 3000) {
                            this.Fc.z0();
                        }
                    }
                    if (this.M5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.f25584w4 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.C2.measureText(formatShortDuration2));
                        this.f25497q4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.g6.C2, this.f25584w4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.M5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = this.f25447md;
            co0 co0Var = this.D5;
            int i12 = 0;
            if (z12) {
                if (this.B5) {
                    if (!co0Var.f27527f) {
                        co0Var.g(this.f25556u7.audioProgress, true);
                    }
                } else {
                    if (!d1Var.f34449e) {
                        d1Var.i(this.f25556u7.audioProgress);
                        d1Var.f34460q = this.f25556u7.bufferedProgress;
                    }
                    d1Var.a();
                }
                TLRPC.Document document = this.f25556u7.getDocument();
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
                long j10 = this.Td;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                    d10 = Math.max(0.0d, d10 - this.f25556u7.audioProgressSec);
                }
                if (this.M5 != d10) {
                    this.M5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.N5 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.T2.measureText(formatLongDuration));
                    this.L5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.g6.T2, this.N5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f9 = this.f25556u7.audioProgress;
                if (f9 != 0.0f) {
                    this.f25620yd = f9;
                    if (f9 > 0.9f) {
                        this.f25620yd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.H1 != null) {
                if (this.B5) {
                    if (!co0Var.f27527f) {
                        co0Var.g(this.f25556u7.audioProgress, true);
                    }
                    z10 = true;
                } else {
                    if (!d1Var.f34449e) {
                        d1Var.i(this.f25556u7.audioProgress);
                        d1Var.f34460q = this.f25556u7.bufferedProgress;
                    }
                    d1Var.k(this.f25556u7);
                    z10 = false;
                }
                int i13 = this.G1;
                if (i13 == 5) {
                    z10 = true;
                }
                if (i13 == 3) {
                    long j11 = this.Td;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                        while (true) {
                            if (i12 >= this.H1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.H1.attributes.get(i12);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d12 = documentAttribute2.duration;
                                break;
                            }
                            i12++;
                        }
                        d = d12;
                    } else {
                        d = this.f25556u7.audioProgressSec;
                    }
                    if (this.M5 != d) {
                        this.M5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.N5 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.N2.measureText(formatLongDuration2));
                        this.L5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.g6.N2, this.N5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f25556u7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                        i12 = this.f25556u7.audioProgressSec;
                    }
                    double d13 = i12;
                    if (this.M5 != d13) {
                        this.M5 = d13;
                        this.L5 = new StaticLayout(AndroidUtilities.formatShortDuration(i12, (int) duration), org.telegram.ui.ActionBar.g6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        if (this.f25556u7.isSponsored()) {
            this.F8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        kg.r0 r0Var = this.J;
        if (!r0Var.f13847s && !r0Var.f13832b) {
            lastLineWidth = r0Var.f13849u;
        } else {
            lastLineWidth = this.f25556u7.getLastLineWidth();
        }
        boolean z10 = false;
        if (!r0Var.f13847s && !r0Var.f13832b) {
            z10 = (i10 - lastLineWidth < i11 || this.f25556u7.hasRtl) ? true : true;
            if (this.f25353g2) {
                this.f25465o0 = AndroidUtilities.dp(14.0f) + this.f25465o0;
            }
        } else if ((!this.f25480p1 && ((this.f25309d2 && !this.f25556u7.isSponsored()) || this.J1 || this.f25323e2 || this.f25339f2 || this.f25353g2)) || i10 - lastLineWidth < i11 || this.f25556u7.hasRtl) {
            z10 = true;
        }
        if (this.f25556u7.isUnsupported()) {
            z10 = true;
        }
        if ((r0Var.f13847s || r0Var.f13832b) && (richMessageLayout = this.f25556u7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z10 = true;
        }
        MessageObject messageObject = this.f25556u7;
        if ((messageObject.hasCodeAtBottom && (r0Var.f13847s || r0Var.f13832b)) || ((messageObject.hasQuoteAtBottom && (r0Var.f13847s || r0Var.f13832b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z10 = true;
        } else {
            i13 = 14;
        }
        if (z10) {
            this.f25465o0 = AndroidUtilities.dp(i13) + this.f25465o0;
            this.G8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.F8 = dp;
            if (this.f25556u7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.f25433lb;
            } else {
                i14 = this.f25433lb;
            }
            this.F8 = org.telegram.messenger.x3.b(31.0f, i14, dp);
            return;
        }
        int extraTextX = (i12 - getExtraTextX()) - lastLineWidth;
        if (extraTextX >= 0 && extraTextX <= i11) {
            this.F8 = AndroidUtilities.dp(31.0f) + ((i12 + i11) - extraTextX);
        } else {
            this.F8 = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth + i11);
        }
    }

    public final void r1(int i10) {
        CheckBoxBase[] checkBoxBaseArr = this.N8;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i10) {
            if (checkBoxBaseArr != null) {
                int i11 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = this.N8;
                    if (i11 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i11].f26319l = false;
                    i11++;
                }
            }
            this.N8 = new CheckBoxBase[i10];
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = this.N8;
                if (i12 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i12] = new CheckBoxBase(20, this, this.Ed);
                this.N8[i12].k(false);
                this.N8[i12].j(true);
                this.N8[i12].d(9);
                i12++;
            }
        }
        if (this.J8 == null) {
            this.J8 = new org.telegram.ui.Components.j9(this.E7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(l1 l1Var, s80 s80Var, Layout layout, int i10) {
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
                } else if (characterStyleArr[i11] == this.f25627z5) {
                    l1Var.f24622b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (l1Var.f24622b != i10) {
            return false;
        }
        s80Var.rewind();
        int spanStart = spanned.getSpanStart(this.f25627z5);
        int spanEnd = spanned.getSpanEnd(this.f25627z5);
        s80Var.f31451c = true;
        s80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, s80Var);
        s80Var.a();
        this.f25600x5.k();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f25564v0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        if (this.f25556u7.type == 20 && this.Ib != null) {
            lh.x2 x2Var = this.O0;
            this.Gb = com.google.android.recaptcha.internal.a.A(x2Var.getImageWidth(), this.Ib.getWidth(), 2.0f, this.f25513r8);
            this.Hb = com.google.android.recaptcha.internal.a.A(x2Var.getImageHeight(), this.Ib.getHeight(), 2.0f, x2Var.getImageY() + this.f25542t8);
        }
    }

    public final void s1(int i10) {
        int i11;
        int v02;
        ql0 ql0Var;
        ql0 ql0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f25556u7.isUnsupported()) {
            if (this.f25556u7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.g6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.g6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.g6.v0(i14, this.Ed);
        } else if (i10 == 0 && this.f25358g7) {
            if (this.f25556u7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.g6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.f23422xc;
            }
            v02 = org.telegram.ui.ActionBar.g6.v0(i12, this.Ed);
        } else if (i10 == 0 && (ql0Var2 = this.W9) != null) {
            v02 = ql0Var2.h();
        } else if (i10 == 0 && (ql0Var = this.Y9) != null) {
            v02 = ql0Var.h();
        } else {
            if (this.f25556u7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.g6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.g6.v0(i11, this.Ed);
        }
        Drawable[] drawableArr = this.f25509r3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            g1 g1Var = new g1(i10, this);
            m1[] m1VarArr = this.f25522s3;
            m1VarArr[i10] = g1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f25556u7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.g6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.g6.v0(i13, this.Ed)}), null, m1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.g6.B1(drawable, v02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(l1 l1Var, s80 s80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(l1Var, s80Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
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
        boolean z11;
        boolean z12;
        if (this.M0) {
            return;
        }
        boolean z13 = true;
        if ((!this.f25287b8 && !this.f25272a8 && !isPressed()) || (this.I1 && this.O0.hasBitmapImage())) {
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
        this.f25473o8 = z10;
    }

    @Override
    public void setAlpha(float f9) {
        boolean z10;
        boolean z11 = false;
        if (f9 == 1.0f) {
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
            this.Uc = f9;
            invalidate();
        } else {
            super.setAlpha(f9);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f25595x && !this.f25556u7.isVoice()) || this.f25616y9 == null || this.f25631z9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.H;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.J.f13832b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f9) {
        if (this.f25578ve != f9) {
            this.f25578ve = f9;
            y4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f25417k8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f25388i9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Ub;
                int i10 = this.E7;
                org.telegram.ui.Components.e9 e9Var = this.f25403j9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.Wb = userProfilePhoto.photo_small;
                    } else {
                        this.Wb = null;
                    }
                    e9Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Ub, e9Var, null, LiteMode.isEnabled(360928), 1, false);
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
                            e9Var.m(i10, user2);
                            imageReceiver.setForUserOrChat(user2, e9Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        e9Var.k(i10, chat2);
                        imageReceiver.setForUserOrChat(chat2, e9Var);
                        return;
                    }
                    e9Var.k(i10, this.Vb);
                    imageReceiver.setForUserOrChat(this.Vb, e9Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", e9Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.Wb = null;
                    e9Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, e9Var, null, null, 0);
                    return;
                }
            }
            this.Wb = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(j1 j1Var) {
        this.Fc = j1Var;
    }

    public void setDrawSelectionBackground(boolean z10) {
        if (this.f25338f1 != z10) {
            this.f25338f1 = z10;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z10) {
        this.f25595x = z10;
        invalidate();
    }

    public void setFullyDraw(boolean z10) {
        this.E0 = z10;
    }

    public void setHideSideButtonByQuickShare(boolean z10) {
        if (this.f25489pa != z10) {
            this.f25489pa = z10;
            boolean z11 = this.F7;
            this.F7 = true;
            invalidate();
            this.F7 = z11;
        }
    }

    public void setHighlighted(boolean z10) {
        if (this.f25287b8 != z10) {
            this.f25287b8 = z10;
            if (z10) {
                this.f25268a4 = null;
            }
            if (!z10) {
                this.f25345f8 = System.currentTimeMillis();
                this.f25300c8 = true;
                this.f25315d8 = 300;
            } else {
                this.f25300c8 = false;
                this.f25315d8 = 0;
            }
            s4();
            if (this.B5) {
                this.D5.f27535o = f3();
            } else {
                this.C5.f34459p = f3();
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
        this.f25378he = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z10) {
        this.f25379i0 = z10;
    }

    public void setInvalidatesParent(boolean z10) {
        this.F7 = z10;
    }

    public void setIsUpdating(boolean z10) {
        this.J0 = true;
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.f25364ge = runnable;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        s4();
        if (this.B5) {
            this.D5.f27535o = f3();
        } else {
            this.C5.f34459p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.Ed = c6Var;
        RadialProgress2 radialProgress2 = this.K0;
        if (radialProgress2 != null) {
            radialProgress2.F = c6Var;
        }
        RadialProgress2 radialProgress22 = this.L0;
        if (radialProgress22 != null) {
            radialProgress22.F = c6Var;
        }
        ul0 ul0Var = this.O3;
        if (ul0Var != null) {
            ul0Var.f33266n = c6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.J.C = num;
    }

    public void setSelectedBackgroundProgress(float f9) {
        this.Mc = f9;
        invalidate();
    }

    public void setShowTopic(boolean z10) {
        if (this.f25464ne != z10) {
            this.f25464ne = z10;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f9) {
        if (this.f25563ue != f9) {
            this.f25563ue = f9;
            y4();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Hd;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((gh.k) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.Y3.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.Y3.textLayoutBlocks.get(i11);
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

    public void setTimeAlpha(float f9) {
        this.f25384i5 = f9;
    }

    @Override
    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
    }

    public final int t0() {
        if (this.f25494q1) {
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
        if (this.Vc.h && !z15) {
            return;
        }
        this.f25349fd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25377hd = ofFloat;
        if (z15) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f25377hd.setInterpolator(jr.f29800f);
        this.f25334ed = i10;
        this.f25319dd = i11;
        this.f25377hd.addUpdateListener(new bg.c1(4, this, z10));
        this.f25377hd.addListener(new bg.z2(21, this, z10));
        this.f25363gd = true;
        this.f25377hd.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f25571v7;
        if (messageObject == null) {
            messageObject = this.f25556u7;
        }
        MessageObject messageObject2 = messageObject;
        this.f25556u7 = null;
        X3(messageObject2, this.G, this.B, this.A, this.C, false);
    }

    public final int t3(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.t3(int):int");
    }

    public final void t4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.t4():void");
    }

    public final boolean u0(MotionEvent motionEvent) {
        j1 j1Var;
        if (this.La == null || (j1Var = this.Fc) == null || !j1Var.c()) {
            return false;
        }
        boolean contains = this.Ma.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Na == null) {
            this.Na = new uc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Na.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Na.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Na.h) {
                this.Fc.e2(this);
            }
            this.Na.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Na.c(false);
        }
        return this.Na.h;
    }

    public final void u1() {
        MessageObject messageObject;
        j1 j1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f25556u7.hasMediaSpoilers() && !this.f25556u7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f25556u7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Fc != null && messageObject2.isSensitive()) {
                    this.Fc.C(this);
                    return;
                } else {
                    i4(this.f25295c1, this.f25308d1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f25556u7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f25556u7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Fc.R0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f25556u7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j10 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j10 != 0) {
                    user = MessagesController.getInstance(this.E7).getUser(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Fc.t0(this, user, this.f25295c1, this.f25308d1);
            } else if (i12 == 5) {
                if (this.K4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f25556u7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f25556u7);
                } else {
                    this.Fc.R1(this, this.f25556u7);
                }
            } else if (i12 == 8) {
                int i13 = this.K4;
                if (i13 != -1 && (i13 != 1 || !this.f25581w1 || !this.f25401j7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
            } else if (this.G1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f25556u7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.G1;
                    if (i15 == 1) {
                        if (this.K4 == -1) {
                            this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        j1 j1Var2 = this.Fc;
                        if (j1Var2 != null) {
                            j1Var2.v0(this, this.f25295c1, this.f25308d1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.K4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Fc.Q1(this.f25556u7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                ye.d.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f25353g2) {
                        if (this.K4 == -1) {
                            this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (j1Var = this.Fc) != null) {
                        if (i14 == 16) {
                            j1Var.p0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            j1Var.B0(this, this.O4, this.P4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
            } else if (this.K4 != -1 && (!this.f25535t1 || (!this.f25401j7 && (((messageObject = this.f25556u7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.f25581w1))))) {
                if (this.f25535t1) {
                    v1(true);
                    return;
                }
                int i16 = this.K4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
            }
        } else {
            int i17 = this.K4;
            if (i17 == -1) {
                this.Fc.v0(this, this.f25295c1, this.f25308d1, false);
            } else if (i17 == 0) {
                v1(false);
            }
        }
    }

    public final void u3(boolean z10) {
        int currentBackgroundLeft;
        float f9;
        int dp;
        int i10;
        float f10;
        int dp2;
        int currentBackgroundLeft2;
        boolean isOutOwner = this.f25556u7.isOutOwner();
        int i11 = 0;
        r1 r1Var = this.Vc;
        if (isOutOwner) {
            if (z10) {
                currentBackgroundLeft2 = (int) (this.f25513r8 + r1Var.f25124g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f25394j0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z10) {
                currentBackgroundLeft = (int) (this.f25513r8 + r1Var.f25124g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f25556u7.type == 19) {
                dp = 0;
            } else {
                if (!this.f25359g8 && this.F) {
                    f9 = 11.0f;
                } else {
                    f9 = 17.0f;
                }
                dp = AndroidUtilities.dp(f9);
            }
            this.f25394j0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f11 = 4.0f;
        if (this.f25339f2) {
            this.f25394j0 = AndroidUtilities.dp(11.0f) + this.f25394j0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Hc;
            this.f25450n0 = dp3;
            StaticLayout staticLayout = this.f25598x2;
            if (staticLayout != null) {
                this.f25450n0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f25353g2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Hc;
            this.f25450n0 = dp4;
            StaticLayout staticLayout2 = this.f25598x2;
            if (staticLayout2 != null) {
                this.f25450n0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f25556u7.type == 19) {
            this.f25450n0 = AndroidUtilities.dp(6.0f) + this.Hc;
            if (!this.f25556u7.isOut()) {
                this.f25394j0 = getCurrentBackgroundLeft();
            } else {
                this.f25394j0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Hc;
            this.f25450n0 = dp5;
            MessageObject messageObject = this.f25556u7;
            float f12 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f25450n0;
                    if (this.Hc <= 0) {
                        f12 = -3.0f;
                    }
                    this.f25450n0 = AndroidUtilities.dp(f12) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f12 = 1.0f;
                    }
                    this.f25450n0 = AndroidUtilities.dp(f12) + dp5;
                }
                if (this.f25556u7.hasCodeAtTop && this.Hc > 0) {
                    this.f25450n0 = AndroidUtilities.dp(5.0f) + this.f25450n0;
                }
            }
        }
        if (this.f25556u7.isSponsored()) {
            this.f25423l0 = AndroidUtilities.dp(14.0f) + this.f25450n0;
        } else if (this.f25480p1) {
            this.f25423l0 = AndroidUtilities.dp(10.0f) + this.f25450n0;
            this.f25450n0 = org.telegram.messenger.x3.C(13.0f, this.f25381i2, this.f25450n0);
            if (this.N2 && !this.f25353g2 && !this.f25556u7.isGiveawayOrGiveawayResults()) {
                this.f25450n0 = AndroidUtilities.dp(44.0f) + this.f25450n0;
            }
        } else {
            this.f25423l0 = AndroidUtilities.dp(10.0f) + this.f25556u7.textHeight(r1Var) + this.f25450n0;
        }
        if (this.f25480p1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f25556u7.textHeight(r1Var) + this.f25450n0;
        } else {
            int i13 = this.f25423l0 + this.f25381i2;
            if (this.N2) {
                f10 = 46.0f;
            } else {
                f10 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f10) + i13;
            if (this.f25381i2 <= 0) {
                f11 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f11) + dp6;
        }
        this.m0 = dp2;
        this.f25409k0 = this.f25394j0;
        if (this.f25556u7.textXOffset != 0.0f && this.f25616y9 != null) {
            int dp7 = this.F8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f25556u7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.G8) {
                int i15 = this.f25433lb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = org.telegram.ui.b.u(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f25394j0 = (i14 - getExtraTimeX()) + this.f25394j0;
            }
        }
    }

    public final void u4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i10;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.C2.measureText((String) secretTimeString));
                this.f25584w4 = ceil;
                this.f25497q4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.g6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.C2, this.f25584w4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.g6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25497q4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f25497q4.getLineWidth(0);
                }
                this.f25584w4 = i11;
            }
            invalidate();
        }
    }

    public final boolean v0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.v0(android.view.MotionEvent):boolean");
    }

    public final void v1(boolean z10) {
        float f9;
        MessageObject messageObject;
        MessageObject messageObject2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i10;
        RadialProgress2 radialProgress2;
        int i11;
        MessageObject messageObject3;
        if (this.Fc != null && this.f25556u7.isSensitive() && this.f25556u7.hasMediaSpoilers() && !this.f25556u7.needDrawBluredPreview() && !this.f25556u7.isMediaSpoilersRevealed) {
            this.Fc.C(this);
            return;
        }
        MessageObject messageObject4 = this.f25556u7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f25556u7.putInDownloadsStore = true;
        }
        int i12 = this.K4;
        RadialProgress2 radialProgress22 = this.L0;
        int i13 = this.E7;
        lh.x2 x2Var = this.O0;
        RadialProgress2 radialProgress23 = this.K0;
        if (i12 == 0 && (!this.f25535t1 || z10)) {
            int i14 = this.G1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f25556u7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f25556u7.mediaExists)) {
                if (z10) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f25269a5 != null && (x2Var.hasNotThumb() || this.f25284b5 == null)) {
                    photoSize = this.f25269a5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f25312d5;
                    } else {
                        str = this.f25326e5;
                    }
                } else {
                    photoSize = this.f25284b5;
                    str = this.f25326e5;
                }
                String str2 = str;
                if (this.f25556u7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f25556u7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    x2Var.setForceLoading(true);
                    x2Var.setImage(ImageLocation.getForObject(this.f25269a5, this.Z4), this.f25312d5, ImageLocation.getForObject(this.f25284b5, this.Z4), this.f25326e5, this.f25298c5, this.f25269a5.size, null, this.f25556u7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                    if (this.f25556u7.loadedFileSize > 0) {
                        q1(this.H1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f25447md) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f25556u7.getDocument();
                        MessageObject messageObject6 = this.f25556u7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f25556u7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        x2Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        x2Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f25556u7, 0);
                    }
                    this.Yc = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                        if (this.f25556u7.loadedFileSize > 0) {
                            q1(this.H1);
                        }
                    } else {
                        int i17 = this.G1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 1, i10);
                            MessageObject messageObject8 = this.f25556u7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                x2Var.setForceLoading(true);
                                x2Var.setImage(ImageLocation.getForDocument(this.H1), null, ImageLocation.getForDocument(this.f25269a5, this.H1), this.f25326e5, this.H1.size, null, this.f25556u7, i10);
                                MessageObject messageObject9 = this.f25556u7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                            } else if (i17 == 8) {
                                x2Var.setImage(ImageLocation.getForDocument(this.H1), this.f25312d5, ImageLocation.getForDocument(this.f25269a5, this.H1), "b1", 0L, "jpg", this.f25556u7, 1);
                            }
                        } else {
                            x2Var.setForceLoading(true);
                            x2Var.setImage(ImageLocation.getForObject(this.f25269a5, this.Z4), this.f25312d5, ImageLocation.getForObject(this.f25284b5, this.Z4), this.f25326e5, this.f25298c5, 0L, null, this.f25556u7, 0);
                        }
                    }
                }
                this.f25556u7.loadingCancelled = false;
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
                FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                this.f25556u7.loadingCancelled = false;
            }
            if (this.Fc.R1(this, this.f25556u7)) {
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
        } else if (i12 == 1 && (!this.f25535t1 || z10)) {
            x2Var.setForceLoading(false);
            int i18 = this.G1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f25556u7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f25556u7.isOut() && !this.f25535t1 && (this.f25556u7.isSending() || this.f25556u7.isEditing())) {
                    if (radialProgress23.f26485i.f31311q != 6) {
                        this.Fc.K(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f25556u7;
                messageObject10.loadingCancelled = true;
                int i19 = this.G1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f25556u7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(x2Var);
                        x2Var.cancelLoadImage();
                    }
                } else {
                    FileLoader.getInstance(i13).cancelLoadFile(this.H1);
                }
                this.K4 = 0;
                if (z10) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f25556u7)) {
                this.K4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f25556u7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Fc.v0(this, 0.0f, 0.0f, false);
            } else if (this.G1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.T4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                    this.f25556u7.loadingCancelled = false;
                }
                if (this.Fc.R1(this, this.f25556u7)) {
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
                if (this.f25447md) {
                    this.Yc = true;
                    invalidate();
                }
            } else {
                int i21 = this.G1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f25447md) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            x2Var.setAllowStartAnimation(true);
                            x2Var.startAnimation();
                        }
                    } else {
                        x2Var.setAllowStartAnimation(true);
                        x2Var.startAnimation();
                    }
                    this.f25556u7.gifState = 0.0f;
                    this.K4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.H1, this.f25556u7, 2, 0);
                this.f25556u7.loadingCancelled = false;
                this.K4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.G1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f25556u7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f25556u7.isOut() && (this.f25556u7.isSending() || this.f25556u7.isEditing())) || this.f25556u7.isSendError()) {
                        j1 j1Var = this.Fc;
                        if (j1Var != null && radialProgress23.f26485i.f31311q != 6) {
                            j1Var.K(this);
                            return;
                        }
                        return;
                    }
                    this.f25556u7.loadingCancelled = true;
                    FileLoader.getInstance(i13).cancelLoadFile(this.H1);
                    this.K4 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.S4 == 2 && this.T4 != 1) {
                this.T4 = 1;
                f9 = 0.0f;
                radialProgress23.o(0.0f, false);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f9 = 0.0f;
            }
            j1 j1Var2 = this.Fc;
            if (j1Var2 != null) {
                j1Var2.v0(this, f9, f9, false);
            }
        }
    }

    public final ColorFilter v2(int i10, int i11) {
        if (this.f25606xe == null) {
            this.f25621ye = new int[3];
            this.f25606xe = new ColorFilter[3];
        }
        if (i11 != this.f25621ye[i10] || this.f25606xe[i10] == null) {
            ColorFilter[] colorFilterArr = this.f25606xe;
            this.f25621ye[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.f25606xe[i10];
    }

    public final void v4() {
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f25309d2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        r1 r1Var = this.Vc;
        boolean z10 = r1Var.f25191w0;
        d1 d1Var = this.C5;
        co0 co0Var = this.D5;
        float f10 = 10.0f;
        if (z10 && ((i15 = this.G1) == 3 || i15 == 7)) {
            int i21 = this.F8;
            float f11 = i21;
            int i22 = (int) ((f11 - r1Var.f25143k0) + r1Var.f25148l0);
            int i23 = (int) ((f11 - r1Var.f25124g0) + r1Var.f25128h0);
            if (this.f25447md && !this.f25443m8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (r1Var.f25143k0 == 0.0f && r1Var.f25148l0 == 0.0f) {
                i22 = i23;
            }
            if (co0Var != null) {
                if (r1Var.f25157n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25309d2) {
                        f10 = 0.0f;
                    }
                    int dp2 = dp - AndroidUtilities.dp(f10);
                    int dp3 = AndroidUtilities.dp(30.0f);
                    int i24 = i21 + i20;
                    if (!this.H5) {
                        i18 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i18 = 0;
                    }
                    int i25 = i24 + i18;
                    int i26 = i22 + i20;
                    if (this.H5) {
                        i19 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i19 = 0;
                    }
                    co0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f25309d2) {
                        f10 = 0.0f;
                    }
                    co0Var.h(dp4 - AndroidUtilities.dp(f10), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (d1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.G1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f25309d2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                d1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (co0Var != null) {
            if (r1Var.f25157n1) {
                int dp5 = (this.F8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f25309d2) {
                    f9 = 10.0f;
                } else {
                    f9 = 0.0f;
                }
                int dp6 = dp5 - AndroidUtilities.dp(f9);
                int dp7 = AndroidUtilities.dp(30.0f);
                int i27 = this.F8 + i20;
                if (!this.H5) {
                    i13 = -AndroidUtilities.dp(34.0f);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (!this.f25309d2) {
                    f10 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f10);
                int i29 = this.F8 + i20;
                if (this.H5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                co0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.F8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f25309d2) {
                    f10 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f10);
                co0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (d1Var != null) {
            int useTranscribeButtonProgress2 = this.F8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.G1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f25309d2) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            d1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i11 + i12), AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        dh.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f25509r3;
            if (drawable == drawableArr[0] || drawable == this.f25510r4 || drawable == drawableArr[1] || drawable == this.Dc || drawable == this.G3 || drawable == this.f25576vc || ((this.J != null && (drawable instanceof org.telegram.ui.Components.n6)) || (drawable instanceof c90))) {
                return true;
            }
            dh.a aVar = this.W5;
            if (aVar == null || (drawable != aVar && drawable != aVar.f5643a)) {
                ArrayList arrayList = this.U5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q1 q1Var = (q1) obj;
                    if (q1Var.f25047w != drawable && ((bVar = q1Var.f25048x) == null || (drawable != bVar && drawable != bVar.f5632a && drawable != bVar.f5633b))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean w0(MotionEvent motionEvent) {
        int i10;
        float f9;
        int dp;
        ArrayList arrayList = this.f25416k7;
        if (!arrayList.isEmpty()) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f25556u7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f25513r8;
                    if (this.f25359g8) {
                        f9 = 1.0f;
                    } else {
                        f9 = 7.0f;
                    }
                    dp = i11 + AndroidUtilities.dp(f9);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    e0 e0Var = (e0) arrayList.get(i12);
                    int dp2 = (e0Var.d + this.I8) - AndroidUtilities.dp(2.0f);
                    float f10 = x4;
                    float f11 = widthForButtons;
                    float f12 = (e0Var.f24250c * f11) + dp;
                    if (f10 >= f12 && f10 <= (e0Var.f24251e * f11) + f12 && z22 >= dp2 && z22 <= e0Var.f24252f + dp2) {
                        this.f25512r7 = i12;
                        a3();
                        if (e0Var.f24264s == null) {
                            z Y = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23247nc, this.Ed), 6, 6);
                            e0Var.f24264s = Y;
                            Y.setCallback(this);
                            z zVar = e0Var.f24264s;
                            int i13 = ((int) (e0Var.f24250c * f11)) + dp;
                            zVar.setBounds(i13, dp2, ((int) (e0Var.f24251e * f11)) + i13, e0Var.f24252f + dp2);
                        }
                        e0Var.f24264s.setHotspot(f10, z22);
                        e0Var.f24264s.setState(this.f25583w3);
                        e0Var.b(!e0Var.f24258m);
                        postDelayed(new bg.f(this, this.f25512r7, 18), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25512r7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f25512r7);
                    z zVar2 = e0Var2.f24264s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f25556u7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        j1 j1Var = this.Fc;
                        if (j1Var != null && !e0Var2.f24258m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f24255j;
                            if (buttonCustom != null) {
                                j1Var.E(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f24254i;
                                if (keyboardInlineButton != null) {
                                    j1Var.m1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f25512r7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f25512r7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i10);
                z zVar3 = e0Var3.f24264s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f25512r7 = -1;
                a3();
            }
        }
        return false;
    }

    public final void w1() {
        int i10;
        int i11;
        int i12 = this.T4;
        int i13 = this.E7;
        RadialProgress2 radialProgress2 = this.K0;
        if (i12 == 0) {
            this.T4 = 1;
            radialProgress2.o(0.0f, false);
            MessageObject messageObject = this.f25556u7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f25556u7.putInDownloadsStore = true;
            }
            int i14 = this.G1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.H1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.H1;
                    MessageObject messageObject2 = this.f25556u7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f25556u7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.H1;
                MessageObject messageObject3 = this.f25556u7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f25556u7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.G1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f25556u7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.T4 = 0;
            this.f25556u7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.H1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public gh.j w3() {
        return gh.j.e(this);
    }

    public final void w4() {
        char c3;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().y2() != null && getDelegate().y2().A(this.f25556u7)) {
            l9 y22 = getDelegate().y2();
            if (y22.f24652v0) {
                c3 = 2;
            } else if (y22.f24654x0) {
                c3 = 3;
            } else if (y22.f24656z0) {
                c3 = 4;
            } else if (P2()) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            if (c3 == 2) {
                if (this.f25339f2) {
                    i12 = this.f25409k0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f25353g2) {
                        i11 = this.f25409k0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f25409k0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().y2().c0(AndroidUtilities.dp(10.0f) + i12 + this.f25452n2, this.f25411k2);
            } else if (c3 == 1) {
                n4();
                getDelegate().y2().c0((int) this.f25426l4, (int) this.f25439m4);
            } else if (c3 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.G;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f25426l4;
                } else {
                    float f9 = 12.0f;
                    if (this.f25556u7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f25513r8;
                        if (this.f25556u7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.F9, this.H9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f25359g8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f25513r8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f25513r8;
                            if (!this.F) {
                                f9 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f9) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Vc.f25124g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.m0;
                n4();
                getDelegate().y2().c0((AndroidUtilities.dp(10.0f) + dp3) - this.X1, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().y2().c0(this.f25394j0, this.f25450n0);
            }
        }
    }

    public final boolean x0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.x0(android.view.MotionEvent):boolean");
    }

    public final void x1() {
        MessageObject messageObject = this.f25556u7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            j1 j1Var = this.Fc;
            if (j1Var != null) {
                j1Var.F1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Y3;
        int i12 = 0;
        r1 r1Var = this.Vc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (gh.k kVar : textLayoutBlock2.spoilers) {
                    kVar.i((i10 - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, r1Var)) - this.f25426l4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.Y3.textLayoutBlocks, r1Var)) - this.f25439m4);
                }
            }
        }
        StaticLayout staticLayout = this.f25631z9;
        if (staticLayout != null) {
            float height = (-this.D9) - staticLayout.getHeight();
            ArrayList arrayList2 = this.Hd;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList2.get(i14);
                i14++;
                ((gh.k) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (gh.k kVar2 : textLayoutBlock4.spoilers) {
                    kVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, r1Var)) - this.f25450n0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, r1Var)) - this.f25450n0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f9) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.H;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof s1)) {
                            s1 s1Var = (s1) childAt;
                            if (s1Var.f9 && s1Var.G == this.G) {
                                int i12 = s1Var.H.flags;
                                if ((i12 & 1) != 0 && (i12 & 8) != 0) {
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - s1Var.getLeft(), (z2(motionEvent) + getTop()) - s1Var.getTop(), 0);
                                    boolean y02 = s1Var.y0(obtain);
                                    obtain.recycle();
                                    return y02;
                                }
                            }
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25509r3;
            if (action == 0) {
                if (this.f25360g9.contains(x4, z22)) {
                    if (this.f25556u7.isSent()) {
                        this.f25537t3[1] = 2;
                        this.f25374h9 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x4, z22);
                            drawableArr[1].setState(this.f25583w3);
                        }
                        c3();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f25374h9) {
                    j1 j1Var = this.Fc;
                    if (j1Var != null) {
                        if (this.Y7) {
                            j1Var.s(this);
                        } else {
                            j1Var.w(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f25374h9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f25374h9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x4, z22);
            }
        }
        return false;
    }

    public final void y1(Canvas canvas, float f9) {
        float f10;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f11;
        float f12;
        float f13;
        if (this.Y3 == null) {
            return;
        }
        float f14 = this.f25439m4;
        float f15 = this.f25426l4;
        r1 r1Var = this.Vc;
        if (r1Var.f25191w0) {
            if (r1Var.C0) {
                f14 -= getTranslationY();
                f13 = r1Var.f25124g0;
            } else if (r1Var.f25176s0) {
                float f16 = r1Var.K1;
                float f17 = 1.0f - f16;
                f15 = (f15 * f16) + (r1Var.f25168q0 * f17);
                f14 = (f14 * f16) + (f17 * r1Var.f25172r0);
            } else if (!this.f25556u7.isVoice() || !TextUtils.isEmpty(this.f25556u7.caption)) {
                f13 = r1Var.f25124g0;
            }
            f15 += f13;
        }
        float f18 = f15;
        float f19 = f14;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (r1Var.f25098a1) {
            float f20 = r1Var.K1;
            if (f20 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = r1Var.f25102b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.u5 u5Var = r1Var.O0;
                float f21 = (1.0f - f20) * f9;
                if (textLayoutBlocks != null) {
                    f11 = textLayoutBlocks.textXOffset;
                } else {
                    f11 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList, u5Var, false, f21, f11, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Y3;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.u5 u5Var2 = this.lc;
                float f22 = f9 * r1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f12 = textLayoutBlocks2.textXOffset;
                } else {
                    f12 = 0.0f;
                }
                z1(f18, f19, canvas, arrayList3, u5Var2, true, f22, f12, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.Y3;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.u5 u5Var3 = this.lc;
        if (textLayoutBlocks3 != null) {
            f10 = textLayoutBlocks3.textXOffset;
        } else {
            f10 = 0.0f;
        }
        z1(f18, f19, canvas, arrayList4, u5Var3, true, f9, f10, true);
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
            if (this.f25556u7.isOutOwner()) {
                if (!this.f25359g8 && !this.F && !z11) {
                    this.f25487p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgOut");
                } else {
                    this.f25487p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f25359g8 && !this.F && !z11) {
                this.f25487p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgIn");
            } else {
                this.f25487p8 = (org.telegram.ui.ActionBar.d5) L2("drawableMsgInMedia");
            }
        }
        this.f25487p8.f();
        return this.f25487p8;
    }

    public final float y3() {
        float f9;
        r1 r1Var = this.Vc;
        float f10 = 1.0f;
        if (r1Var.F1) {
            boolean z10 = this.f25494q1;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            return AndroidUtilities.lerp(f9, f10, r1Var.K1);
        } else if (this.f25494q1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i10;
        MessageObject messageObject = this.f25556u7;
        if (messageObject == null) {
            return;
        }
        float f9 = this.f25563ue + this.f25578ve;
        if (!messageObject.isOutOwner() || this.f25556u7.hasWideCode) {
            f9 += this.f25436m1;
        }
        if (this.B8 && !this.f25556u7.isOutOwner() && this.H != null) {
            if (z3()) {
                i10 = 48;
            } else {
                i10 = 0;
            }
            f9 += AndroidUtilities.dp(71 - i10) * this.D8;
        }
        setTranslationX(f9);
    }

    public final boolean z0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f25556u7.type == 12) {
            int x4 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f25509r3;
            if (action == 0) {
                ArrayList arrayList = this.T2;
                int[] iArr = this.f25583w3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.T2.size(); i10++) {
                        k1 k1Var = (k1) this.T2.get(i10);
                        float f9 = x4;
                        float f10 = z22;
                        if (k1Var.f24579e.contains(f9, f10)) {
                            if (k1Var.f24580f == null) {
                                k1Var.f24580f = new uc(this);
                            }
                            k1Var.f24580f.c(true);
                            z zVar = k1Var.f24581g;
                            if (zVar != null) {
                                zVar.setHotspot(f9, f10);
                                k1Var.f24581g.setState(iArr);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
                float f11 = x4;
                float f12 = z22;
                if (this.U2.contains(f11, f12)) {
                    this.V2 = true;
                    this.f25516rc.c(true);
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setHotspot(f11, f12);
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
                            this.Fc.P0(((k1) this.T2.get(0)).f24576a, this);
                        } else {
                            this.Fc.P0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.V2 = false;
                    this.f25516rc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.T2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.T2.size(); i11++) {
                        k1 k1Var2 = (k1) this.T2.get(i11);
                        uc ucVar = k1Var2.f24580f;
                        if (ucVar != null && ucVar.h) {
                            j1 j1Var = this.Fc;
                            if (j1Var != null) {
                                j1Var.P0(k1Var2.f24576a, this);
                            }
                            z zVar2 = k1Var2.f24581g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            k1Var2.f24580f.c(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.V2 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x4, z22);
                    return false;
                }
                ArrayList arrayList4 = this.T2;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.T2.size()) {
                            break;
                        }
                        k1 k1Var3 = (k1) this.T2.get(i12);
                        uc ucVar2 = k1Var3.f24580f;
                        if (ucVar2 != null && ucVar2.h) {
                            z zVar3 = k1Var3.f24581g;
                            if (zVar3 != null) {
                                zVar3.setHotspot(x4, z22);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.u5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.R) - this.f25279b0) - this.f25307d0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.J7 || this.M7 || ((this.f25430l8 && !this.P7) || (messageObject = this.f25556u7) == null || messageObject.isOutOwner() || !this.f25556u7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f25556u7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f25556u7;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.z4():void");
    }

    public s1(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = true;
        this.f25579w = new k8.i0(1);
        jr jrVar = jr.h;
        this.f25607y = new vd.a(0, this, jrVar, 380L, false);
        this.J = new kg.r0(this);
        this.K = new hg.b(this);
        this.L = new hg.d(this);
        this.f25596x0 = new Rect();
        this.B0 = -1;
        this.C0 = -1;
        this.N0 = new int[4];
        this.S2 = 0;
        this.f25324e3 = 45;
        this.f25509r3 = new Drawable[2];
        this.f25522s3 = new m1[2];
        this.f25537t3 = new int[2];
        this.f25552u3 = new RectF();
        this.f25583w3 = new int[]{16842910, 16842919};
        this.V3 = -1;
        this.W3 = -1;
        this.X4 = new RectF();
        this.Y4 = new RectF();
        this.f25356g5 = -1;
        this.f25384i5 = 1.0f;
        this.f25399j5 = 1.0f;
        this.f25511r5 = -1;
        this.f25524s5 = new v80(this);
        this.f25569v5 = new ArrayList();
        this.f25585w5 = new ArrayList();
        this.A5 = new Path();
        this.T5 = new ArrayList();
        this.U5 = new ArrayList();
        this.f25327e6 = -1;
        this.f25343f6 = -1;
        this.f25371h6 = true;
        this.J6 = -1;
        this.f25416k7 = new ArrayList();
        new Path();
        this.f25429l7 = new HashMap();
        this.f25442m7 = new HashMap();
        this.G7 = -1;
        this.f25373h8 = true;
        this.f25443m8 = true;
        this.F8 = 100;
        this.f25360g9 = new Rect();
        this.A9 = new AtomicReference();
        this.Ma = new RectF();
        this.f25290bb = new StaticLayout[2];
        this.f25376hb = new float[2];
        this.qb = true;
        this.f25560ub = new Path();
        this.f25575vb = new float[8];
        this.Fb = 1.0f;
        this.Mb = new Path();
        this.Nb = new float[8];
        this.f25605xc = new RectF();
        this.f25619yc = new RectF();
        this.Tc = Build.VERSION.SDK_INT == 28;
        this.Uc = 1.0f;
        this.Vc = new r1(this);
        this.Zc = new org.telegram.ui.Components.d6(this, 200L, jr.f29801g);
        this.f25305cd = new c1(0, this);
        this.f25421kd = new c1(1, this);
        this.f25434ld = new SparseArray();
        this.f25635zd = -1;
        this.Bd = new m.f3();
        this.Hd = new ArrayList();
        this.Id = new Stack();
        this.Jd = new Path();
        this.Md = new a1(2, this);
        this.Nd = new a1(3, this);
        this.Qd = false;
        this.Td = -1L;
        this.f25335ee = false;
        this.f25350fe = new a1(10, this);
        this.f25464ne = true;
        this.re = 1.0f;
        this.f25594we = new b1(Float.class, "animationOffsetX", 0);
        this.E7 = i10;
        this.Ed = c6Var;
        this.Fd = z10;
        this.Gd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Gd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f30628a = new Paint(1);
        drawable.f30629b = null;
        drawable.h = -1.0f;
        drawable.f30634i = -1.0f;
        drawable.f30635j = -1.0f;
        drawable.f30636k = -1.0f;
        drawable.f30638m = this;
        this.Gc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f25388i9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f25403j9 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.B9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f25459n9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.D7 = DownloadController.getInstance(i10).generateObserverTag();
        this.R0 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        lh.x2 x2Var = new lh.x2(this, this, 1);
        this.O0 = x2Var;
        x2Var.setAllowLoadingOnAttachedOnly(true);
        x2Var.setUseRoundForThumbDrawable(true);
        x2Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.P0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.K0 = new RadialProgress2(this, c6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.L0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        d1 d1Var = new d1(this, this);
        this.C5 = d1Var;
        d1Var.h = this;
        ?? obj = new Object();
        obj.f27523a = 0;
        obj.f27524b = 0;
        obj.f27526e = false;
        obj.f27527f = false;
        obj.f27539s = 1.0f;
        obj.f27540t = 1.0f;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(125L, 600L, jrVar);
        obj.v = d6Var;
        obj.f27542w = 1.0f;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(150L, jr.f29800f);
        obj.B = d6Var2;
        obj.J = false;
        if (co0.N == null) {
            co0.N = new Paint(1);
            co0.O = new Paint(1);
            Paint paint = co0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            co0.O.setStyle(style);
        }
        this.D5 = obj;
        obj.f27531k = this;
        obj.f27534n = this;
        d6Var2.f27664a = this;
        d6Var.f27664a = this;
        this.E5 = new e1(this);
        ?? drawable2 = new Drawable();
        drawable2.f33255a = 0L;
        drawable2.f33256b = false;
        drawable2.f33257c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.f33258e = 0.0f;
        drawable2.f33259f = 0.32f;
        drawable2.f33260g = 1;
        drawable2.h = 1;
        drawable2.f33261i = 1;
        drawable2.f33265m = 255;
        drawable2.f33266n = c6Var;
        drawable2.f33262j = this;
        this.O3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d5 d5Var = this.f25487p8;
        int i13 = this.F0;
        int i14 = this.G0;
        if (i14 == 0) {
            i13 = getParentWidth();
            i14 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i12 = view.getMeasuredWidth();
                i11 = view.getMeasuredHeight();
                float f9 = this.H0;
                d5Var.o((int) (i10 + f9), i12, i11, (int) f9, this.Qc, this.Rc, this.A, (this.B && this.Vc.f25203z0 == 1.0f) ? false : true);
                d5Var.f22878u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f92 = this.H0;
        d5Var.o((int) (i10 + f92), i12, i11, (int) f92, this.Qc, this.Rc, this.A, (this.B && this.Vc.f25203z0 == 1.0f) ? false : true);
        d5Var.f22878u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        j1 j1Var;
        if (this.f25556u7 == null) {
            return;
        }
        Runnable runnable = this.f25364ge;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f25378he;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.F7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Kd || (j1Var = this.Fc) == null) {
            return;
        }
        j1Var.p();
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
