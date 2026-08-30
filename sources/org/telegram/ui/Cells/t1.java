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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.g20;
import org.telegram.ui.kj0;
import org.telegram.ui.pm;
import org.telegram.ui.vu0;
import org.telegram.ui.yh;
public class t1 extends a0 implements fo0, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, u9, NotificationCenter.NotificationCenterDelegate, xd.b, o4 {
    public static final float[] Be = new float[8];
    public int A0;
    public boolean A1;
    public float A2;
    public boolean A3;
    public k01 A4;
    public CharacterStyle A5;
    public boolean A6;
    public boolean A7;
    public int A8;
    public StaticLayout A9;
    public Path Aa;
    public float Ab;
    public int Ac;
    public int Ad;
    public TL_stars.StarGift Ae;
    public boolean B;
    public int B0;
    public int B1;
    public float B2;
    public boolean B3;
    public String B4;
    public final Path B5;
    public int B6;
    public boolean B7;
    public boolean B8;
    public final AtomicReference B9;
    public float[] Ba;
    public float Bb;
    public float Bc;
    public boolean Bd;
    public boolean C;
    public int C0;
    public float C1;
    public float C2;
    public long C3;
    public WebFile C4;
    public boolean C5;
    public long C6;
    public k4 C7;
    public boolean C8;
    public final ImageReceiver C9;
    public float[] Ca;
    public ih.j Cb;
    public float Cc;
    public final m.f3 Cd;
    public boolean D;
    public int D0;
    public int D1;
    public float D2;
    public boolean D3;
    public boolean D4;
    public final d1 D5;
    public float D6;
    public AnimatorSet D7;
    public boolean D8;
    public int D9;
    public float Da;
    public Integer Db;
    public rc Dc;
    public y61 Dd;
    public boolean E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public Path E3;
    public boolean E4;
    public final mo0 E5;
    public float E6;
    public final int E7;
    public float E8;
    public int E9;
    public float Ea;
    public Path Eb;
    public z Ec;
    public g1 Ed;
    public boolean F;
    public boolean F0;
    public long F1;
    public rc F2;
    public Paint F3;
    public boolean F4;
    public final e1 F5;
    public boolean F6;
    public final int F7;
    public int F8;
    public float F9;
    public float Fa;
    public float[] Fb;
    public int Fc;
    public org.telegram.ui.ActionBar.f6 Fd;
    public boolean G;
    public int G0;
    public long G1;
    public StaticLayout G2;
    public int G3;
    public boolean G4;
    public int G5;
    public boolean G6;
    public boolean G7;
    public int G8;
    public int G9;
    public float Ga;
    public final float Gb;
    public k1 Gc;
    public final boolean Gd;
    public MessageObject.GroupedMessages H;
    public int H0;
    public int H1;
    public StaticLayout H2;
    public z H3;
    public int H4;
    public int H5;
    public float H6;
    public int H7;
    public boolean H8;
    public int H9;
    public StaticLayout Ha;
    public float Hb;
    public final ra0 Hc;
    public final ChatMessageSharedResources Hd;
    public MessageObject.GroupedMessagePosition I;
    public float I0;
    public TLRPC.Document I1;
    public StaticLayout I2;
    public boolean I3;
    public int I4;
    public boolean I5;
    public int I6;
    public byte[] I7;
    public int I8;
    public int I9;
    public int Ia;
    public float Ib;
    public int Ic;
    public final ArrayList Id;
    public boolean J;
    public boolean J0;
    public boolean J1;
    public StaticLayout J2;
    public boolean J3;
    public int J4;
    public i1 J5;
    public boolean J6;
    public byte[] J7;
    public int J8;
    public int J9;
    public boolean Ja;
    public StaticLayout Jb;
    public int Jc;
    public final Stack Jd;
    public final mg.r0 K;
    public boolean K0;
    public boolean K1;
    public StaticLayout K2;
    public int K3;
    public int K4;
    public float K5;
    public int K6;
    public boolean K7;
    public org.telegram.ui.Components.f9 K8;
    public int K9;
    public boolean Ka;
    public int Kb;
    public int Kc;
    public final Path Kd;
    public final jg.a L;
    public final RadialProgress2 L0;
    public k01 L1;
    public StaticLayout L2;
    public z L3;
    public int L4;
    public float L5;
    public TLRPC.Poll L6;
    public boolean L7;
    public Paint L8;
    public boolean L9;
    public boolean La;
    public String Lb;
    public int Lc;
    public boolean Ld;
    public final jg.c M;
    public final RadialProgress2 M0;
    public k01 M1;
    public float M2;
    public int M3;
    public int M4;
    public StaticLayout M5;
    public float M6;
    public boolean M7;
    public Paint M8;
    public boolean M9;
    public StaticLayout Ma;
    public ih.k Mb;
    public int Mc;
    public BotForumHelper.BotDraftAnimationsPool Md;
    public boolean N;
    public boolean N0;
    public rc N1;
    public float N2;
    public z N3;
    public int N4;
    public double N5;
    public ArrayList N6;
    public boolean N7;
    public Path N8;
    public boolean N9;
    public final RectF Na;
    public final Path Nb;
    public float Nc;
    public final a1 Nd;
    public long O;
    public final int[] O0;
    public rc O1;
    public boolean O2;
    public boolean O3;
    public int O4;
    public int O5;
    public int O6;
    public boolean O7;
    public CheckBoxBase[] O8;
    public boolean O9;
    public rc Oa;
    public final float[] Ob;
    public boolean Oc;
    public final a1 Od;
    public k01 P;
    public final nh.y2 P0;
    public StaticLayout P1;
    public boolean P2;
    public final em0 P3;
    public int P4;
    public int P5;
    public z11 P6;
    public boolean P7;
    public z40 P8;
    public boolean P9;
    public RectF Pa;
    public StaticLayout Pb;
    public float Pc;
    public boolean Pd;
    public y80 Q;
    public final ImageReceiver Q0;
    public StaticLayout Q1;
    public boolean Q2;
    public StaticLayout Q3;
    public int Q4;
    public StaticLayout Q5;
    public org.telegram.ui.Components.z5 Q6;
    public boolean Q7;
    public i90 Q8;
    public org.telegram.ui.Components.z5 Q9;
    public gg.a Qa;
    public int Qb;
    public int Qc;
    public boolean Qd;
    public CornerPathEffect R;
    public ColorMatrixColorFilter R0;
    public b90 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public int R5;
    public int R6;
    public boolean R7;
    public float R8;
    public float R9;
    public int Ra;
    public String Rb;
    public int Rc;
    public boolean Rd;
    public int S;
    public final org.telegram.ui.Components.z8 S0;
    public f90 S1;
    public boolean S2;
    public int S3;
    public int S4;
    public StaticLayout S5;
    public int S6;
    public boolean S7;
    public long S8;
    public float S9;
    public float Sa;
    public StaticLayout Sb;
    public int Sc;
    public boolean Sd;
    public long T;
    public cq T0;
    public boolean T1;
    public int T2;
    public boolean T3;
    public int T4;
    public int T5;
    public boolean T6;
    public boolean T7;
    public ImageReceiver[] T8;
    public TLRPC.PhotoSize T9;
    public float Ta;
    public int Tb;
    public boolean Tc;
    public boolean Td;
    public k01 U;
    public GradientDrawable U0;
    public Drawable U1;
    public ArrayList U2;
    public org.telegram.ui.Components.c9 U3;
    public int U4;
    public final ArrayList U5;
    public boolean U6;
    public boolean U7;
    public org.telegram.ui.Components.z8[] U8;
    public int U9;
    public float Ua;
    public String Ub;
    public final boolean Uc;
    public long Ud;
    public y80 V;
    public ph.j V0;
    public int V1;
    public RectF V2;
    public k01 V3;
    public boolean V4;
    public final ArrayList V5;
    public float V6;
    public boolean V7;
    public boolean[] V8;
    public Drawable V9;
    public boolean Va;
    public TLRPC.User Vb;
    public float Vc;
    public int Vd;
    public CornerPathEffect W;
    public Paint W0;
    public boolean W1;
    public boolean W2;
    public int W3;
    public boolean W4;
    public fh.d W5;
    public int W6;
    public boolean W7;
    public StaticLayout W8;
    public am0 W9;
    public boolean Wa;
    public TLRPC.Chat Wb;
    public final s1 Wc;
    public int Wd;
    public gj0 X0;
    public g20 X1;
    public boolean X2;
    public int X3;
    public boolean X4;
    public fh.a X5;
    public float X6;
    public boolean X7;
    public org.telegram.ui.Components.c6 X8;
    public am0 X9;
    public boolean Xa;
    public TLRPC.FileLocation Xb;
    public boolean Xc;
    public int Xd;
    public Paint Y0;
    public int Y1;
    public int Y2;
    public int Y3;
    public final RectF Y4;
    public dh.j Y5;
    public float Y6;
    public long Y7;
    public boolean Y8;
    public am0 Y9;
    public float Ya;
    public String Yb;
    public boolean Yc;
    public int Yd;
    public Paint Z0;
    public int Z1;
    public CharSequence Z2;
    public MessageObject.TextLayoutBlocks Z3;
    public final RectF Z4;
    public dh.j Z5;
    public int Z6;
    public boolean Z7;
    public int Z8;
    public am0 Z9;
    public float Za;
    public Object Zb;
    public boolean Zc;
    public float Zd;
    public int f21967a0;
    public Paint f21968a1;
    public int a2;
    public int f21969a3;
    public MessageObject.TextLayoutBlocks f21970a4;
    public TLObject f21971a5;
    public int f21972a6;
    public int f21973a7;
    public boolean f21974a8;
    public int f21975a9;
    public am0 f21976aa;
    public StaticLayout f21977ab;
    public long f21978ac;
    public final org.telegram.ui.Components.z5 f21979ad;
    public float f21980ae;
    public d21 f21981b0;
    public cx0 f21982b1;
    public int f21983b2;
    public float f21984b3;
    public ui0 f21985b4;
    public TLRPC.PhotoSize f21986b5;
    public int f21987b6;
    public boolean f21988b7;
    public boolean f21989b8;
    public boolean f21990b9;
    public am0 f21991ba;
    public int f21992bb;
    public String f21993bc;
    public FlagSecureReason f21994bd;
    public org.telegram.ui.Components.d8 f21995be;
    public int f21996c0;
    public boolean f21997c1;
    public int f21998c2;
    public int c3;
    public CharSequence f21999c4;
    public TLRPC.PhotoSize f22000c5;
    public int f22001c6;
    public String f22002c7;
    public boolean f22003c8;
    public int f22004c9;
    public int f22005ca;
    public final StaticLayout[] f22006cb;
    public org.telegram.ui.Components.j5 f22007cc;
    public boolean f22008cd;
    public boolean f22009ce;
    public sy0 f22010d0;
    public float f22011d1;
    public int f22012d2;
    public int f22013d3;
    public StaticLayout f22014d4;
    public BitmapDrawable f22015d5;
    public float f22016d6;
    public TLRPC.Message f22017d7;
    public boolean f22018d8;
    public int f22019d9;
    public Drawable f22020da;
    public int f22021db;
    public org.telegram.ui.Components.j5 f22022dc;
    public final c1 f22023dd;
    public boolean f22024de;
    public int f22025e0;
    public float f22026e1;
    public boolean f22027e2;
    public int f22028e3;
    public MessageObject.TextLayoutBlocks f22029e4;
    public String f22030e5;
    public float e6;
    public boolean f22031e7;
    public int f22032e8;
    public int f22033e9;
    public boolean f22034ea;
    public boolean f22035eb;
    public TLRPC.User f22036ec;
    public int f22037ed;
    public kj0 f22038ee;
    public boolean f22039f;
    public long f22040f0;
    public boolean f22041f1;
    public boolean f22042f2;
    public int f22043f3;
    public CharSequence f22044f4;
    public String f22045f5;
    public int f22046f6;
    public int f22047f7;
    public float f22048f8;
    public int f22049f9;
    public lh.wa fa;
    public float f22050fb;
    public TLRPC.User f22051fc;
    public int f22052fd;
    public boolean f22053fe;
    public int f22054g0;
    public boolean f22055g1;
    public boolean f22056g2;
    public LinearGradient f22057g3;
    public int f22058g4;
    public Drawable f22059g5;
    public int f22060g6;
    public int f22061g7;
    public long f22062g8;
    public boolean f22063g9;
    public int f22064ga;
    public int f22065gb;
    public TLRPC.Chat f22066gc;
    public float f22067gd;
    public final a1 f22068ge;
    public boolean h;
    public rc f22069h0;
    public CheckBoxBase f22070h1;
    public boolean f22071h2;
    public dc0 f22072h3;
    public int f22073h4;
    public int f22074h5;
    public float f22075h6;
    public boolean f22076h7;
    public boolean f22077h8;
    public final Rect h9;
    public z f22078ha;
    public int f22079hb;
    public String f22080hc;
    public boolean f22081hd;
    public Runnable f22082he;
    public org.telegram.ui.Components.j5 f22083i0;
    public CheckBoxBase f22084i1;
    public boolean f22085i2;
    public int f22086i3;
    public int f22087i4;
    public boolean f22088i5;
    public boolean f22089i6;
    public boolean f22090i7;
    public boolean f22091i8;
    public boolean f22092i9;
    public k01 f22093ia;
    public final float[] f22094ib;
    public String ic;
    public ValueAnimator f22095id;
    public Runnable f22096ie;
    public boolean f22097j0;
    public boolean f22098j1;
    public int f22099j2;
    public int f22100j3;
    public Drawable f22101j4;
    public float f22102j5;
    public boolean f22103j6;
    public float f22104j7;
    public boolean f22105j8;
    public final ImageReceiver f22106j9;
    public k01 f22107ja;
    public float f22108jb;
    public boolean jc;
    public int f22109jd;
    public int f22110je;
    public int f22111k0;
    public boolean f22112k1;
    public int f22113k2;
    public int f22114k3;
    public int f22115k4;
    public float f22116k5;
    public boolean f22117k6;
    public boolean f22118k7;
    public boolean f22119k8;
    public final org.telegram.ui.Components.z8 f22120k9;
    public int f22121ka;
    public float f22122kb;
    public boolean f22123kc;
    public float f22124kd;
    public int f22125ke;
    public int f22126l0;
    public float l1;
    public int f22127l2;
    public int f22128l3;
    public int f22129l4;
    public long f22130l5;
    public boolean f22131l6;
    public final ArrayList f22132l7;
    public boolean f22133l8;
    public boolean f22134l9;
    public int f22135la;
    public StaticLayout f22136lb;
    public boolean f22137lc;
    public final c1 f22138ld;
    public boolean f22139le;
    public int m0;
    public long f22140m1;
    public int f22141m2;
    public int f22142m3;
    public float f22143m4;
    public long f22144m5;
    public boolean f22145m6;
    public final HashMap f22146m7;
    public boolean f22147m8;
    public boolean m9;
    public org.telegram.ui.Components.z5 f22148ma;
    public int f22149mb;
    public org.telegram.ui.Components.q5 f22150mc;
    public final SparseArray f22151md;
    public float f22152me;
    public int f22153n;
    public int f22154n0;
    public int f22155n1;
    public int f22156n2;
    public boolean f22157n3;
    public float f22158n4;
    public boolean f22159n5;
    public boolean f22160n6;
    public final HashMap f22161n7;
    public boolean f22162n8;
    public boolean f22163n9;
    public y80 f22164na;
    public int f22165nb;
    public org.telegram.ui.Components.q5 nc;
    public boolean f22166nd;
    public Paint f22167ne;
    public int f22168o0;
    public org.telegram.ui.i5 f22169o1;
    public int f22170o2;
    public boolean f22171o3;
    public int f22172o4;
    public boolean f22173o5;
    public boolean f22174o6;
    public String f22175o7;
    public int f22176o8;
    public final ImageReceiver f22177o9;
    public i90 oa;
    public int f22178ob;
    public org.telegram.ui.Components.q5 f22179oc;
    public boolean f22180od;
    public boolean f22181oe;
    public int f22182p0;
    public i10 f22183p1;
    public int f22184p2;
    public boolean f22185p3;
    public int f22186p4;
    public org.telegram.ui.Components.u5 f22187p5;
    public boolean f22188p6;
    public int f22189p7;
    public boolean f22190p8;
    public int f22191p9;
    public ArrayList f22192pa;
    public int f22193pb;
    public org.telegram.ui.Components.q5 f22194pc;
    public float f22195pd;
    public ty0 f22196pe;
    public int f22197q0;
    public boolean f22198q1;
    public int f22199q2;
    public rc f22200q3;
    public int f22201q4;
    public f90 f22202q5;
    public boolean f22203q6;
    public boolean f22204q7;
    public org.telegram.ui.ActionBar.g5 f22205q8;
    public Drawable[] f22206q9;
    public boolean f22207qa;
    public CharSequence qb;
    public org.telegram.ui.Components.q5 f22208qc;
    public float f22209qd;
    public Paint f22210qe;
    public l3 f22211r;
    public int f22212r0;
    public boolean f22213r1;
    public int f22214r2;
    public int f22215r3;
    public StaticLayout f22216r4;
    public MessageObject.TextLayoutBlock f22217r5;
    public boolean f22218r6;
    public boolean f22219r7;
    public org.telegram.ui.ActionBar.g5 f22220r8;
    public int[] f22221r9;
    public int f22222ra;
    public boolean f22223rb;
    public rc f22224rc;
    public float rd;
    public Paint f22225re;
    public boolean f22226s;
    public int f22227s0;
    public boolean f22228s1;
    public int f22229s2;
    public final Drawable[] f22230s3;
    public org.telegram.ui.Components.j6 f22231s4;
    public int f22232s5;
    public long s6;
    public int f22233s7;
    public int f22234s8;
    public Drawable s9;
    public boolean f22235sa;
    public boolean sb;
    public rc f22236sc;
    public float f22237sd;
    public float f22238se;
    public int f22239t0;
    public boolean f22240t1;
    public int f22241t2;
    public final n1[] f22242t3;
    public org.telegram.ui.Components.j6 f22243t4;
    public final b90 f22244t5;
    public String t6;
    public ih.k f22245t7;
    public int f22246t8;
    public Drawable t9;
    public int f22247ta;
    public Paint f22248tb;
    public rc f22249tc;
    public long f22250td;
    public int te;
    public int f22251u0;
    public boolean f22252u1;
    public int f22253u2;
    public final int[] f22254u3;
    public lf.p f22255u4;
    public int f22256u5;
    public int f22257u6;
    public boolean f22258u7;
    public int f22259u8;
    public int f22260u9;
    public boolean f22261ua;
    public Path f22262ub;
    public float f22263uc;
    public float f22264ud;
    public MessageObject.TextLayoutBlocks f22265ue;
    public o0 v;
    public boolean f22266v0;
    public long f22267v1;
    public float f22268v2;
    public final RectF f22269v3;
    public StaticLayout f22270v4;
    public boolean f22271v5;
    public boolean f22272v6;
    public MessageObject f22273v7;
    public int f22274v8;
    public boolean f22275v9;
    public boolean f22276va;
    public final Path f22277vb;
    public float f22278vc;
    public float f22279vd;
    public float f22280ve;
    public final o2.o f22281w;
    public boolean f22282w0;
    public boolean f22283w1;
    public float f22284w2;
    public i90 f22285w3;
    public long f22286w4;
    public final ArrayList f22287w5;
    public boolean f22288w6;
    public MessageObject f22289w7;
    public int f22290w8;
    public boolean f22291w9;
    public boolean f22292wa;
    public final float[] f22293wb;
    public z f22294wc;
    public int f22295wd;
    public float f22296we;
    public boolean f22297x;
    public int f22298x0;
    public boolean f22299x1;
    public int f22300x2;
    public final int[] f22301x3;
    public int f22302x4;
    public final ArrayList f22303x5;
    public boolean f22304x6;
    public MessageObject.GroupedMessages f22305x7;
    public boolean f22306x8;
    public boolean f22307x9;
    public int f22308xa;
    public ih.k f22309xb;
    public Path f22310xc;
    public float f22311xd;
    public final b1 f22312xe;
    public final xd.a f22313y;
    public final Rect f22314y0;
    public int f22315y1;
    public StaticLayout f22316y2;
    public float f22317y3;
    public k01 f22318y4;
    public i90 f22319y5;
    public boolean f22320y6;
    public boolean f22321y7;
    public f51 f22322y8;
    public CheckBoxBase f22323y9;
    public boolean f22324ya;
    public float f22325yb;
    public final RectF f22326yc;
    public float f22327yd;
    public ColorFilter[] f22328ye;
    public int f22329z0;
    public float f22330z1;
    public StaticLayout f22331z2;
    public SpannableStringBuilder f22332z3;
    public k01 z4;
    public ArrayList f22333z5;
    public boolean f22334z6;
    public boolean f22335z7;
    public f51 f22336z8;
    public StaticLayout f22337z9;
    public Path za;
    public float zb;
    public final RectF f22338zc;
    public float zd;
    public int[] f22339ze;

    public t1(Context context, int i10) {
        this(context, i10, false, null, null);
    }

    public static void A3(int i10, ArrayList arrayList, boolean z4) {
        if (z4 && i10 != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new nh.e4(10));
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
        boolean z4;
        s01 s01Var;
        TLRPC.MessageEntity messageEntity;
        if ((characterStyle instanceof k51) && (s01Var = ((k51) characterStyle).f26164a) != null && (messageEntity = s01Var.d) != null) {
            i10 = messageEntity.offset;
            i11 = messageEntity.length + i10;
            z4 = true;
        } else {
            i10 = 0;
            i11 = 0;
            z4 = false;
        }
        if (!z4) {
            i10 = spannable.getSpanStart(characterStyle);
            i11 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i10, i11};
    }

    public static boolean T(t1 t1Var, MessageObject messageObject) {
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.saved_from_peer != null) {
            k1 k1Var = t1Var.Gc;
            if (k1Var == null || k1Var.S()) {
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
        StaticLayout staticLayout = this.Ma;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.Ma.getText());
        gg.a[] aVarArr = (gg.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gg.a.class);
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
        TLRPC.User user = this.Vb;
        if (user != null) {
            return DialogObject.getBotVerificationIcon(user);
        }
        if (this.Wb != null && (messageObject = this.f22273v7) != null && messageObject.getDialogId() != 1271266957 && this.Wb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f22273v7.messageOwner.from_id);
            int i10 = this.F7;
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
        TLRPC.User user = this.Vb;
        if (user != null) {
            return UserObject.getUserName(user);
        }
        if (this.Wb != null) {
            MessageObject messageObject = this.f22273v7;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.Wb.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.f22273v7.messageOwner.from_id);
                int i10 = this.F7;
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
            return this.Wb.title;
        }
        MessageObject messageObject2 = this.f22273v7;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.f22273v7.sponsoredTitle;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        MessageObject messageObject;
        TLRPC.User user = this.Vb;
        if (user != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                TLRPC.EmojiStatus emojiStatus = this.Vb.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f21993bc = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            } else if (this.Vb.premium) {
                return ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
            } else {
                return null;
            }
        } else if (this.Wb != null && (messageObject = this.f22273v7) != null && messageObject.getDialogId() != 1271266957 && this.Wb.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.f22273v7.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.F7).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                    if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                        this.f21993bc = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                    }
                }
                return UserObject.getEmojiStatusDocumentId(user2);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.F7).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.f21993bc = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
                }
                return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
            }
            return null;
        } else {
            return null;
        }
    }

    private ug.a getDraftMessageMeasureController() {
        k1 k1Var = this.Gc;
        if (k1Var != null) {
            return k1Var.Z();
        }
        return null;
    }

    private int getExtraTimeX() {
        int i10;
        if (!this.f22273v7.isOutOwner() && ((!this.f22077h8 || this.Z3 != null) && (i10 = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i10 - 11) / 1.5f);
        }
        if (!this.f22273v7.isOutOwner() && this.f22180od && this.f22133l8 && this.f22273v7.type == 5) {
            return (int) ((AndroidUtilities.roundPlayingMessageSize(this.C8) - AndroidUtilities.roundMessageSize) * 0.7f);
        }
        return 0;
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.R0 == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
            this.R0 = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.R0;
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.preview) {
            parentWidth = this.G0;
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
        int i10 = this.U4;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    private int getNameHeight() {
        if (this.Xa) {
            if (this.Ma == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (org.telegram.ui.ActionBar.j6.W2.getTextSize() + AndroidUtilities.dp(5.0f));
    }

    private float getNameHeightAnimated() {
        float f10;
        float f11;
        s1 s1Var = this.Wc;
        if (s1Var.P2) {
            boolean z4 = this.Xa;
            f10 = AndroidUtilities.lerp(!z4, z4, s1Var.K1);
        } else if (this.Xa) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float textSize = org.telegram.ui.ActionBar.j6.W2.getTextSize() + AndroidUtilities.dp(5.0f);
        if (this.Ma == null) {
            f11 = 31.0f;
        } else {
            f11 = 35.0f;
        }
        return AndroidUtilities.lerp(textSize, AndroidUtilities.dp(f11), f10);
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (messageReplies = this.H.messages.get(0).messageOwner.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.f22273v7.messageOwner.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    public int getRepliesCount() {
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            return this.H.messages.get(0).getRepliesCount();
        }
        return this.f22273v7.getRepliesCount();
    }

    private int getSelectionOverlayColor() {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
        if (f6Var == null) {
            return 0;
        }
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.isOut()) {
            i10 = org.telegram.ui.ActionBar.j6.Yb;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20177sa;
        }
        return f6Var.x0(i10);
    }

    private float getUseTranscribeButtonProgress() {
        s1 s1Var = this.Wc;
        if (s1Var.f21876n1) {
            if (this.I5) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.I5) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public static l1 n1(int i10, String str, int i11, float f10) {
        l1 l1Var = new l1();
        l1Var.f21326a = i10;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.j6.M2, i11, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, AndroidUtilities.dp(2.0f) + i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        l1Var.d = staticLayout;
        l1Var.f21327b = f10;
        if (staticLayout.getLineCount() > 0) {
            l1Var.f21328c = ((float) (l1Var.f21327b - Math.ceil(l1Var.d.getLineWidth(0)))) / 2.0f;
            l1Var.f21328c -= (int) l1Var.d.getLineLeft(0);
        }
        return l1Var;
    }

    public static boolean r3(String str) {
        if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && !"telegram_bot".equals(str) && !"telegram_user".equals(str) && !"telegram_channel".equals(str) && !"telegram_channel_direct".equals(str) && !"telegram_megagroup".equals(str) && !"telegram_voicechat".equals(str) && !"telegram_videochat".equals(str) && !"telegram_livestream".equals(str) && !"telegram_channel_boost".equals(str) && !"telegram_group_boost".equals(str) && !"telegram_aicomposetone".equals(str)) {
            return false;
        }
        return true;
    }

    private void setInstantButtonPressed(boolean z4) {
        if (this.f22200q3 == null) {
            this.f22200q3 = new rc(this);
        }
        rc rcVar = this.f22200q3;
        this.f22185p3 = z4;
        rcVar.c(z4);
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
        return kw0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_NORMAL, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i18, i13, true);
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

    public static String x2(MessageObject messageObject, boolean z4, boolean z10, boolean z11) {
        if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (messageObject.isOutOwner()) {
                return LocaleController.getString(R.string.ConferenceCallOutgoing);
            }
            if (z4) {
                return LocaleController.getString(R.string.ConferenceCallMissed);
            }
            return LocaleController.getString(R.string.ConferenceCallIncoming);
        } else if (messageObject.isOutOwner()) {
            if (z4) {
                if (z11) {
                    return LocaleController.getString(R.string.CallMessageVideoOutgoingMissed);
                }
                return LocaleController.getString(R.string.CallMessageOutgoingMissed);
            } else if (z11) {
                return LocaleController.getString(R.string.CallMessageVideoOutgoing);
            } else {
                return LocaleController.getString(R.string.CallMessageOutgoing);
            }
        } else if (z4) {
            if (z11) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
            }
            return LocaleController.getString(R.string.CallMessageIncomingMissed);
        } else if (z10) {
            if (z11) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingDeclined);
            }
            return LocaleController.getString(R.string.CallMessageIncomingDeclined);
        } else if (z11) {
            return LocaleController.getString(R.string.CallMessageVideoIncoming);
        } else {
            return LocaleController.getString(R.string.CallMessageIncoming);
        }
    }

    public final boolean A0(MotionEvent motionEvent) {
        if (this.f22273v7.isImportedForward()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                float f11 = this.f22108jb;
                if (f10 >= f11 && f10 <= f11 + this.f22149mb) {
                    float f12 = z22;
                    float f13 = this.f22122kb;
                    if (f12 >= f13 && f12 <= f13 + AndroidUtilities.dp(20.0f)) {
                        this.f22088i5 = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.f22088i5) {
                this.f22088i5 = false;
                playSoundEffect(0);
                this.Gc.l1();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void A1(Canvas canvas, float f10) {
        kj0 kj0Var;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f11 = this.f22168o0;
            s1 s1Var = this.Wc;
            if (s1Var.f21868l2) {
                float f12 = s1Var.f21877n2;
                float f13 = s1Var.K1;
                f11 = (f11 * f13) + ((1.0f - f13) * f12);
            }
            float f14 = f11;
            if (s1Var.K1 != 1.0f && s1Var.G0 && ((kj0Var = this.f22038ee) == null || !kj0Var.h)) {
                canvas.save();
                org.telegram.ui.ActionBar.g5 g5Var = this.f22205q8;
                if (g5Var != null) {
                    Rect bounds = g5Var.getBounds();
                    if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.C) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                z1(this.f22111k0, f14, canvas, s1Var.H0, s1Var.O0, false, (1.0f - s1Var.K1) * f10, this.f22273v7.textXOffset, false);
                MessageObject messageObject2 = this.f22273v7;
                z1(this.f22111k0, f14, canvas, messageObject2.textLayoutBlocks, this.f22150mc, true, f10 * s1Var.K1, messageObject2.textXOffset, false);
                canvas.restore();
            } else {
                MessageObject messageObject3 = this.f22273v7;
                z1(this.f22111k0, f14, canvas, messageObject3.textLayoutBlocks, this.f22150mc, true, f10, messageObject3.textXOffset, false);
            }
        }
        if (d4()) {
            y1(canvas, f10);
        }
    }

    public final String A2(MessageObject messageObject) {
        if (this.f22031e7) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            if (string == null) {
                return LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault);
            }
            return string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public final boolean B0(MotionEvent motionEvent) {
        float f10;
        k1 k1Var;
        MessageObject messageObject = this.f22273v7;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        float timeX = getTimeX();
        float f11 = 0.0f;
        if (this.f22040f0 == 0) {
            f10 = 0.0f;
        } else {
            f10 = 18.0f;
        }
        float dp = timeX - AndroidUtilities.dp(f10);
        float f12 = this.f22149mb;
        if (this.f22273v7.sendPreview) {
            f11 = 1.0f - this.f22102j5;
        }
        int dp2 = ((int) ((f12 * f11) + dp)) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, timeY, AndroidUtilities.dp(16.0f) + dp2 + this.f22149mb, AndroidUtilities.dp(16.0f) + timeY);
        boolean contains = rectF.contains(motionEvent.getX(), z2(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.f22069h0 == null) {
                    this.f22069h0 = new rc(this);
                }
                this.Rd = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.Rd = contains;
        } else if (motionEvent.getAction() == 1) {
            if (this.Rd && (k1Var = this.Gc) != null) {
                k1Var.F(this);
            }
            this.Rd = false;
        } else if (motionEvent.getAction() == 3) {
            this.Rd = false;
        }
        rc rcVar = this.f22069h0;
        if (rcVar != null) {
            rcVar.c(this.Rd);
        }
        return this.Rd;
    }

    public final void B1(android.graphics.Canvas r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.B1(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public final float B2(boolean z4) {
        float f10;
        ui0 ui0Var;
        float f11;
        if (!this.f22055g1 && this.f22018d8) {
            int i10 = this.f22032e8;
            if (i10 >= 300) {
                f11 = 1.0f;
            } else {
                f11 = i10 / 300.0f;
            }
            f10 = f11 * 1.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4 && (ui0Var = this.f21985b4) != null) {
            return (1.0f - ui0Var.f29233k.d(1.0f, false)) * f10;
        }
        return f10;
    }

    public final y80 B3() {
        y80 y80Var;
        ArrayList arrayList = this.f22287w5;
        if (!arrayList.isEmpty()) {
            y80Var = (y80) arrayList.get(0);
            arrayList.remove(0);
        } else {
            y80Var = new y80(0);
        }
        y80Var.reset();
        this.f22303x5.add(y80Var);
        return y80Var;
    }

    public final boolean C0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.C0(android.view.MotionEvent):boolean");
    }

    public final boolean C1() {
        MessageObject messageObject;
        if (this.Gd && (messageObject = this.f22273v7) != null && messageObject.isOutOwner() && org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Da, this.Fd) != 0) {
            return true;
        }
        return false;
    }

    public final void C3() {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i10 = 0; i10 < this.f22273v7.textLayoutBlocks.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.f22273v7.textLayoutBlocks.get(i10);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.Z3 != null) {
            for (int i11 = 0; i11 < this.Z3.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.Z3.textLayoutBlocks.get(i11);
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

    public final String D2(long j10) {
        TLRPC.Chat chat;
        int i10 = this.F7;
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
        this.W2 = false;
        rc rcVar = this.f22236sc;
        if (rcVar != null) {
            rcVar.c(false);
        }
        Drawable drawable = this.f22230s3[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.U2 != null) {
            for (int i10 = 0; i10 < this.U2.size(); i10++) {
                l1 l1Var = (l1) this.U2.get(i10);
                rc rcVar2 = l1Var.f21329f;
                if (rcVar2 != null) {
                    rcVar2.c(false);
                }
                z zVar = l1Var.f21330g;
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
        b90 b90Var = this.f22244t5;
        if (this.f22056g2) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                if (this.J1 && this.f22240t1 && this.L4 != -1 && x10 >= (i11 = this.H4) && x10 <= AndroidUtilities.dp(48.0f) + i11 && z22 >= (i12 = this.I4) && z22 <= AndroidUtilities.dp(48.0f) + i12 && this.L0.f23117i.f29162q != 4) {
                    this.M4 = 1;
                    invalidate();
                    return true;
                }
                if (this.J1) {
                    if (this.P0.isInsideImage(x10, z22)) {
                        this.f22271v5 = true;
                        return true;
                    }
                }
                if (this.H2 != null && z22 >= this.f22127l2) {
                    try {
                        int dp = x10 - ((this.f22126l0 + AndroidUtilities.dp(10.0f)) + this.f22170o2);
                        int i13 = z22 - this.f22127l2;
                        int lineForVertical = this.H2.getLineForVertical(i13);
                        float f10 = dp;
                        int offsetForHorizontal = this.H2.getOffsetForHorizontal(lineForVertical, f10);
                        float lineLeft = this.H2.getLineLeft(lineForVertical);
                        if (lineLeft <= f10 && lineLeft + this.H2.getLineWidth(lineForVertical) >= f10) {
                            Spannable spannable = (Spannable) this.f22273v7.linkDescription;
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof j51) || j51.h) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                f90 f90Var = this.f22202q5;
                                if (f90Var == null || f90Var.f24815i != clickableSpanArr[0]) {
                                    b90Var.k(f90Var, true);
                                    f90 f90Var2 = new f90(clickableSpanArr[0], this.Fd, f10, i13, 0);
                                    this.f22202q5 = f90Var2;
                                    if (this.f22273v7.isOutOwner()) {
                                        i10 = org.telegram.ui.ActionBar.j6.Mb;
                                    } else {
                                        i10 = org.telegram.ui.ActionBar.j6.Ld;
                                    }
                                    f90Var2.d(org.telegram.ui.ActionBar.j6.v0(i10, this.Fd));
                                    this.f22227s0 = -10;
                                    this.f22256u5 = 2;
                                    try {
                                        y80 b10 = this.f22202q5.b();
                                        int[] J2 = J2(spannable, this.f22202q5.f24815i);
                                        b10.d(this.H2, J2[0], 0.0f);
                                        this.H2.getSelectionPath(J2[0], J2[1], b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    b90Var.a(this.f22202q5, 2);
                                }
                                invalidate();
                                return true;
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f22256u5 != 2 && !this.f22271v5 && this.M4 == 0) {
                    F3(2);
                    return false;
                } else if (this.M4 != 0) {
                    this.M4 = 0;
                    playSoundEffect(0);
                    v1(false);
                    invalidate();
                    return false;
                } else {
                    f90 f90Var3 = this.f22202q5;
                    if (f90Var3 != null) {
                        CharacterStyle characterStyle = f90Var3.f24815i;
                        if (characterStyle instanceof URLSpan) {
                            af.g.s(getContext(), ((URLSpan) this.f22202q5.f24815i).getURL());
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        F3(2);
                        return false;
                    }
                    this.f22271v5 = false;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f22132l7;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        e0 e0Var = (e0) arrayList.get(i14);
                        if (mf.c.c(e0Var.f20967i, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                            playSoundEffect(0);
                            this.Gc.o1(this, e0Var.f20967i);
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
        if (!this.f22273v7.isMediaSpoilersRevealed && this.f22325yb != 1.0f) {
            nh.y2 y2Var = this.P0;
            int[] roundRadius = y2Var.getRoundRadius();
            float f10 = roundRadius[0];
            float[] fArr = this.f22293wb;
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
            Path path = this.f22277vb;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y2Var.getImageX(), y2Var.getImageY(), y2Var.getImageX2(), y2Var.getImageY2());
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            canvas.save();
            canvas.clipPath(path);
            if (this.f22325yb != 0.0f) {
                path.rewind();
                path.addCircle(this.zb, this.Ab, this.Bb * this.f22325yb, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            if (this.f22273v7.needDrawBluredPreview()) {
                y2Var.draw(canvas);
            } else {
                float imageX = y2Var.getImageX();
                float imageY = y2Var.getImageY();
                float imageWidth = y2Var.getImageWidth();
                float imageHeight = y2Var.getImageHeight();
                ImageReceiver imageReceiver = this.Q0;
                imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                imageReceiver.setRoundRadius(y2Var.getRoundRadius());
                imageReceiver.draw(canvas);
            }
            F1(canvas);
            canvas.restore();
        }
    }

    public final float E2(boolean z4) {
        boolean z10;
        nr nrVar;
        float f10 = this.f22280ve;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.isOutOwner()) {
            int i10 = 0;
            if (z4 && ((z10 = this.f22098j1) || this.f22112k1)) {
                if (z10) {
                    nrVar = nr.f27347g;
                } else {
                    nrVar = nr.f27348i;
                }
                this.f22155n1 = (int) Math.ceil(nrVar.getInterpolation(this.l1) * AndroidUtilities.dp(35.0f));
                if (this.f22273v7.type == 36) {
                    if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                        this.f22155n1 = 0;
                    }
                }
            }
            f10 += this.f22155n1;
            if (this.C8 && this.I != null) {
                if (z3()) {
                    i10 = 48;
                }
                return (AndroidUtilities.dp(71 - i10) * this.E8) + f10;
            }
        }
        return f10;
    }

    public final void E3() {
        ArrayList arrayList = this.V5;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((r1) arrayList.get(i10)).f21616w.setState(StateSet.NOTHING);
            }
        }
        fh.a aVar = this.X5;
        if (aVar != null) {
            aVar.f6205a.setState(StateSet.NOTHING);
        }
    }

    public final void F0() {
        int i10;
        boolean z4 = this.J0;
        boolean z10 = this.f22009ce;
        nh.y2 y2Var = this.P0;
        if (z4 != z10) {
            this.f22009ce = z4;
            ImageReceiver imageReceiver = this.Q0;
            ImageReceiver imageReceiver2 = this.f22177o9;
            ImageReceiver imageReceiver3 = this.C9;
            jg.c cVar = this.M;
            jg.a aVar = this.L;
            ArrayList arrayList = this.V5;
            RadialProgress2 radialProgress2 = this.M0;
            RadialProgress2 radialProgress22 = this.L0;
            if (z4) {
                radialProgress22.e();
                radialProgress2.e();
                org.telegram.ui.Components.f9 f9Var = this.K8;
                if (f9Var != null) {
                    f9Var.a();
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
                dh.j jVar = this.Y5;
                if (jVar != null) {
                    jVar.a();
                }
                dh.j jVar2 = this.Z5;
                if (jVar2 != null) {
                    jVar2.a();
                }
                if (this.T8 != null) {
                    int i12 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.T8;
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
                ImageReceiver[] imageReceiverArr2 = aVar.f9370a;
                if (imageReceiverArr2 != null) {
                    for (ImageReceiver imageReceiver5 : imageReceiverArr2) {
                        imageReceiver5.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver6 = cVar.d;
                if (imageReceiver6 != null) {
                    imageReceiver6.onAttachedToWindow();
                }
                ImageReceiver[] imageReceiverArr3 = cVar.f9395a;
                if (imageReceiverArr3 != null) {
                    for (ImageReceiver imageReceiver7 : imageReceiverArr3) {
                        imageReceiver7.onAttachedToWindow();
                    }
                }
                imageReceiver3.onAttachedToWindow();
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onAttachedToWindow();
                if (y2Var.onAttachedToWindow()) {
                    if (this.J1) {
                        m4(false, false, false);
                    }
                } else {
                    m4(false, false, false);
                }
                this.nc = org.telegram.ui.Components.u5.update(0, (View) this, false, this.nc, this.A9);
                this.f22179oc = org.telegram.ui.Components.u5.update(0, (View) this, false, this.f22179oc, this.H2);
                l4();
            } else {
                radialProgress22.f();
                radialProgress2.f();
                org.telegram.ui.Components.f9 f9Var2 = this.K8;
                if (f9Var2 != null) {
                    f9Var2.b();
                }
                dh.j jVar3 = this.Y5;
                if (jVar3 != null) {
                    jVar3.f4908b.onDetachedFromWindow();
                    jVar3.f4918x.f();
                }
                dh.j jVar4 = this.Z5;
                if (jVar4 != null) {
                    jVar4.f4908b.onDetachedFromWindow();
                    jVar4.f4918x.f();
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
                if (this.T8 != null) {
                    int i14 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.T8;
                        if (i14 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
                imageReceiver3.onDetachedFromWindow();
                imageReceiver2.onDetachedFromWindow();
                y2Var.onDetachedFromWindow();
                imageReceiver.onDetachedFromWindow();
                ImageReceiver imageReceiver8 = aVar.d;
                if (imageReceiver8 != null) {
                    imageReceiver8.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr5 = aVar.f9370a;
                if (imageReceiverArr5 != null) {
                    for (ImageReceiver imageReceiver9 : imageReceiverArr5) {
                        imageReceiver9.onDetachedFromWindow();
                    }
                }
                ImageReceiver imageReceiver10 = cVar.d;
                if (imageReceiver10 != null) {
                    imageReceiver10.onDetachedFromWindow();
                }
                ImageReceiver[] imageReceiverArr6 = cVar.f9395a;
                if (imageReceiverArr6 != null) {
                    for (ImageReceiver imageReceiver11 : imageReceiverArr6) {
                        imageReceiver11.onDetachedFromWindow();
                    }
                }
                org.telegram.ui.Components.u5.release(this, this.f22179oc);
                org.telegram.ui.Components.u5.release(this, this.nc);
                org.telegram.ui.Components.u5.release(this, this.f22150mc);
            }
        }
        boolean z11 = this.J0;
        if (z11 != this.f22024de) {
            this.f22024de = z11;
            int i15 = this.F7;
            if (z11) {
                MessageObject messageObject = this.f22273v7;
                if (y2Var != null) {
                    y2Var.setFileLoadingPriority(1);
                }
                TLRPC.PhotoSize photoSize = null;
                if (messageObject != null && (this.f22166nd || messageObject.isVideo())) {
                    e1(null, true);
                }
                if (messageObject != null && !messageObject.mediaExists) {
                    int canDownloadMediaType = DownloadController.getInstance(i15).canDownloadMediaType(messageObject);
                    TLRPC.Document document = messageObject.getDocument();
                    if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.f22228s1) {
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
                        g71 g71Var = messageObject.highestQuality;
                        if (g71Var != null && !g71Var.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.highestQuality.h, messageObject, 1, 0);
                        }
                        g71 g71Var2 = messageObject.thumbQuality;
                        if (g71Var2 != null && !g71Var2.c()) {
                            FileLoader.getInstance(i15).loadFile(messageObject.thumbQuality.h, messageObject, 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = this.f22273v7;
            if (y2Var != null) {
                y2Var.setFileLoadingPriority(0);
            }
            if (messageObject2 != null && !messageObject2.mediaExists && !messageObject2.putInDownloadsStore && !DownloadController.getInstance(i15).isDownloading(messageObject2.messageOwner.f19205id) && !PhotoViewer.t1().Q1()) {
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
        if (this.Cb == null) {
            return;
        }
        canvas.save();
        nh.y2 y2Var = this.P0;
        canvas.translate(y2Var.getImageX(), y2Var.getImageY());
        this.Cb.c(canvas, this, (int) y2Var.getImageWidth(), (int) y2Var.getImageHeight(), y2Var.getAlpha(), this.f22139le);
        canvas.restore();
        invalidate();
    }

    public final ImageReceiver F2(int i10) {
        TLRPC.PollAnswer pollAnswer;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.type == 17) {
            if (i10 == -2) {
                dh.j jVar = this.Y5;
                if (jVar != null) {
                    return jVar.f4908b;
                }
                return null;
            } else if (i10 == -3) {
                dh.j jVar2 = this.Z5;
                if (jVar2 != null) {
                    return jVar2.f4908b;
                }
                return null;
            } else {
                ArrayList arrayList = this.V5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        r1 r1Var = (r1) obj;
                        fh.b bVar = r1Var.f21617x;
                        if (bVar != null && (pollAnswer = r1Var.f21613s) != null && pollAnswer.unshuffled_index == i10) {
                            return bVar.f6197c;
                        }
                    }
                }
            }
        }
        k4 k4Var = this.C7;
        if (k4Var != null) {
            ArrayList arrayList2 = k4Var.f21283c;
            i4 i4Var = k4Var.f21282b;
            if (i4Var != null && i10 >= 0 && i10 < i4Var.f21206a.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = (TLRPC.MessageExtendedMedia) k4Var.f21282b.f21206a.get(i10);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((j4) arrayList2.get(i12)).B == messageExtendedMedia) {
                        return ((j4) arrayList2.get(i12)).f21248f;
                    }
                }
                return null;
            }
            return null;
        }
        return this.P0;
    }

    public final void F3(int i10) {
        b90 b90Var = this.f22244t5;
        if (i10 != -1) {
            Integer valueOf = Integer.valueOf(i10);
            for (int i11 = 0; i11 < b90Var.d; i11++) {
                if (((Pair) b90Var.f23605c.get(i11)).second == valueOf) {
                    b90Var.j(i11);
                }
            }
        } else {
            b90Var.d(true);
        }
        b90 b90Var2 = this.R1;
        if (b90Var2 != null) {
            b90Var2.d(true);
        }
        this.f22187p5 = null;
        this.S1 = null;
        if (this.f22202q5 != null) {
            if (this.f22256u5 == i10 || i10 == -1) {
                this.f22202q5 = null;
                this.f22256u5 = -1;
                this.Pd = false;
                this.Qd = false;
                invalidate();
            }
        }
    }

    public final void G0(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                int i10 = 0;
                if (this.O8 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), this.O8.length);
                    z10 = false;
                    for (int i11 = 0; i11 < min; i11++) {
                        CheckBoxBase checkBoxBase = this.O8[i11];
                        if (checkBoxBase != null && checkBoxBase.f22965q) {
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z13 = this.f22103j6;
                if (!z13 && !this.f22203q6 && this.f22174o6 && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z13 && !this.f22203q6 && !this.f22188p6) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z14 = poll.public_voters;
                if (this.f22131l6) {
                    charSequence = LocaleController.getString(R.string.PollButtonSave);
                    i10 = 84;
                } else if (z11 && (!poll.multiple_choice || !z12 || !z10)) {
                    if (!z14) {
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
                } else if (poll.multiple_choice && z12) {
                    charSequence = LocaleController.getString(R.string.PollSubmitVotesNoCaps);
                    i10 = 83;
                } else if (!this.O7 && z14 && ((z13 && (!this.f22160n6 || this.f22174o6)) || (this.f22203q6 && pollResults.total_voters != 0))) {
                    charSequence = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                } else {
                    charSequence = null;
                }
                if (i10 != 0) {
                    if (this.W5 == null) {
                        fh.d dVar = new fh.d(this, this.Fd);
                        this.W5 = dVar;
                        dVar.setCallback(this);
                        dVar.f6205a.setCallback(this);
                        dVar.d.setCallback(this);
                    }
                    this.Z2 = charSequence;
                    this.W5.d.q(charSequence, z4, true);
                    this.O2 = true;
                    this.Y2 = i10;
                    o1();
                }
                S0(z4);
            }
        }
    }

    public final void G1(android.graphics.Canvas r26, java.util.ArrayList r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.G1(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final float G2(int i10) {
        r1 r1Var;
        if (i10 >= 0) {
            ArrayList arrayList = this.V5;
            if (i10 < arrayList.size()) {
                int i11 = ((r1) arrayList.get(i10)).f21599b;
                int i12 = this.Ic;
                float f10 = i11 + i12;
                s1 s1Var = this.Wc;
                if (s1Var.f21901t2) {
                    float f11 = s1Var.K1;
                    f10 += ((1.0f - f11) * s1Var.f21905u2) + (i12 * f11);
                    if (this.f22273v7.needDrawForwarded()) {
                        f10 -= this.Ic;
                    }
                }
                if (s1Var.f21910w0) {
                    f10 += s1Var.f21857j0;
                }
                return f10 + r1Var.f21600c + AndroidUtilities.dp(13.0f);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void G3() {
        if (this.f21985b4 != null) {
            this.f21985b4 = null;
        }
        ArrayList arrayList = this.f22303x5;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22287w5.addAll(arrayList);
        arrayList.clear();
    }

    public final boolean H0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.H0(android.view.MotionEvent):boolean");
    }

    public final boolean H1(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k1 k1Var;
        boolean c3 = mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
        int i10 = this.F7;
        if (!c3 && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            if (mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                return SendMessagesHelper.getInstance(i10).isSendingCurrentLocation(this.f22273v7, keyboardButtonProto);
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeUrl != null && (k1Var = this.Gc) != null && k1Var.d1(3, this) && TextUtils.equals(this.Gc.g(this), tL_inlineButtonTypeUrl.url)) {
                return true;
            }
            return false;
        }
        return SendMessagesHelper.getInstance(i10).isSendingCallback(this.f22273v7, keyboardButtonProto);
    }

    public final float H2(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.V5;
            if (i10 < arrayList.size()) {
                int i11 = ((r1) arrayList.get(i10)).f21599b;
                int i12 = this.Ic;
                float f10 = i11 + i12;
                s1 s1Var = this.Wc;
                if (s1Var.f21901t2) {
                    float f11 = s1Var.K1;
                    f10 += ((1.0f - f11) * s1Var.f21905u2) + (i12 * f11);
                    if (this.f22273v7.needDrawForwarded()) {
                        f10 -= this.Ic;
                    }
                }
                if (s1Var.f21910w0) {
                    f10 += s1Var.f21857j0;
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
        a1 a1Var = this.Nd;
        o2.o oVar = this.f22281w;
        oVar.l(a1Var);
        a1 a1Var2 = this.Od;
        oVar.l(a1Var2);
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = this.f22273v7.caption;
            } else {
                charSequence = this.f22273v7.messageText;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = h10.e;
                int i11 = 0;
                ArrayList arrayList = null;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    h10[] h10VarArr = (h10[]) spanned.getSpans(0, spanned.length(), h10.class);
                    for (h10 h10Var : h10VarArr) {
                        if (h10Var.f25310b.relative) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(h10VarArr.length);
                            }
                            arrayList.add(Integer.valueOf(h10Var.f25310b.date));
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
                        oVar.l(a1Var2);
                        i80 i80Var = new i80(5, oVar, a1Var2);
                        ((HashMap) oVar.f16220b).put(a1Var2, i80Var);
                        if (j17 > 0) {
                            AndroidUtilities.runOnUIThread(i80Var, j17);
                        } else {
                            AndroidUtilities.runOnUIThread(i80Var);
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
            ArrayList arrayList = this.V5;
            if (i10 < arrayList.size()) {
                TLRPC.PollAnswer pollAnswer = ((r1) arrayList.get(i10)).f21613s;
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
        return FileLoader.getInstance(this.F7).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public final void J1(android.graphics.Canvas r23, org.telegram.messenger.MessageObject.TextLayoutBlocks r24, boolean r25, boolean r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.J1(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public final void J3(boolean z4, boolean z10) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (!z10 || (messageObject = this.f22273v7) == null || !messageObject.deletedByThanos) {
            if (z4) {
                this.f21985b4 = null;
                CheckBoxBase checkBoxBase = this.f22084i1;
                if (checkBoxBase == null) {
                    CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, this.Fd);
                    this.f22084i1 = checkBoxBase2;
                    if (this.J0) {
                        checkBoxBase2.f22960l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
                    if (checkBoxBase.F != f6Var) {
                        checkBoxBase.F = f6Var;
                        checkBoxBase.b();
                    }
                }
            }
            if (z4 && (((groupedMessages = this.H) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.f22305x7) != null && groupedMessages2.messages.size() > 1))) {
                CheckBoxBase checkBoxBase3 = this.f22070h1;
                if (checkBoxBase3 == null) {
                    CheckBoxBase checkBoxBase4 = new CheckBoxBase(21, this, this.Fd);
                    this.f22070h1 = checkBoxBase4;
                    if (!checkBoxBase4.f22972y) {
                        checkBoxBase4.f22972y = true;
                        checkBoxBase4.b();
                    }
                    if (this.J0) {
                        this.f22070h1.f22960l = true;
                    }
                } else {
                    org.telegram.ui.ActionBar.f6 f6Var2 = this.Fd;
                    if (checkBoxBase3.F != f6Var2) {
                        checkBoxBase3.F = f6Var2;
                        checkBoxBase3.b();
                    }
                }
            }
            float f10 = 0.0f;
            if (this.f22098j1 == z4) {
                if (z10 != this.f22112k1 && !z10) {
                    if (z4) {
                        f10 = 1.0f;
                    }
                    this.l1 = f10;
                    invalidate();
                    return;
                }
                return;
            }
            this.f22112k1 = z10;
            this.f22098j1 = z4;
            if (z10) {
                this.f22140m1 = SystemClock.elapsedRealtime();
            } else {
                if (z4) {
                    f10 = 1.0f;
                }
                this.l1 = f10;
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
        if (this.Wa && this.Ha != null && (zVar = this.H3) != null && (this.Vb != null || this.Wb != null)) {
            boolean contains = zVar.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.I3 = contains;
                if (contains) {
                    this.H3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.H3.setState(this.f22301x3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.I3 && (k1Var = this.Gc) != null) {
                    if (this.f22306x8) {
                        TLRPC.User user = this.f22051fc;
                        if (user != null && user.bot_inline_placeholder == null) {
                            k1Var.k2(this, user.f19331id);
                        } else {
                            String publicUsername = UserObject.getPublicUsername(user);
                            k1 k1Var2 = this.Gc;
                            if (publicUsername == null) {
                                publicUsername = this.f22273v7.messageOwner.via_bot_name;
                            }
                            k1Var2.p0(publicUsername);
                        }
                    } else {
                        TLRPC.User user2 = this.Vb;
                        if (user2 != null) {
                            k1Var.y0(this, user2, motionEvent.getX(), z2(motionEvent));
                        } else {
                            TLRPC.Chat chat3 = this.Wb;
                            if (chat3 != null) {
                                TLRPC.MessageFwdHeader messageFwdHeader = this.f22273v7.messageOwner.fwd_from;
                                if (messageFwdHeader != null) {
                                    int i11 = messageFwdHeader.channel_post;
                                    chat = this.f22066gc;
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
                                k1Var.T(t1Var, chat2, i10, this.f22011d1, this.f22026e1, false);
                                t1Var.H3.setState(StateSet.NOTHING);
                                t1Var.I3 = false;
                                return t1Var.I3;
                            }
                        }
                    }
                }
                t1Var = this;
                t1Var.H3.setState(StateSet.NOTHING);
                t1Var.I3 = false;
                return t1Var.I3;
            }
            t1Var = this;
            return t1Var.I3;
        }
        this.I3 = false;
        return false;
    }

    public final void K1(Canvas canvas) {
        MessageObject messageObject;
        float f10;
        MessageObject messageObject2 = this.f22273v7;
        if ((messageObject2 == null || !messageObject2.isSponsored()) && (messageObject = this.f22273v7) != null && !messageObject.isSending()) {
            MessageObject messageObject3 = this.f22273v7;
            if (messageObject3.type != 27 && !messageObject3.isSendError() && this.f22084i1 != null) {
                if (this.f22098j1 || this.f22112k1) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
                    if (groupedMessagePosition != null) {
                        int i10 = groupedMessagePosition.flags;
                        if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                            return;
                        }
                    }
                    canvas.save();
                    float y10 = getY() + getPaddingTop();
                    MessageObject.GroupedMessages groupedMessages = this.H;
                    if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                        f10 = (getTop() + this.H.transitionParams.offsetTop) - getTranslationY();
                    } else {
                        f10 = y10 + this.Wc.f21857j0;
                    }
                    canvas.translate(this.F8, f10 + this.f22152me);
                    this.f22084i1.a(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int K2(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.Fd);
    }

    public final void K3(boolean z4, boolean z10) {
        this.f22091i8 = z4;
        this.f21989b8 = z10;
        s4();
        if (this.C5) {
            this.E5.f27094o = f3();
        } else {
            this.D5.f25218p = f3();
        }
        invalidate();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            invalidate();
            a3();
        }
    }

    public final boolean L0(MotionEvent motionEvent) {
        k1 k1Var;
        TLRPC.User user;
        TLRPC.Document document;
        if (this.Wa && this.Ha != null && this.H3 != null && ((this.Vb != null || this.Wb != null) && this.Zb != null && this.f22007cc != null)) {
            boolean contains = this.N3.getBounds().contains((int) motionEvent.getX(), (int) z2(motionEvent));
            if (motionEvent.getAction() == 0) {
                this.O3 = contains;
                if (contains) {
                    this.N3.setHotspot((int) motionEvent.getX(), (int) z2(motionEvent));
                    this.N3.setState(this.f22301x3);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.O3 && (k1Var = this.Gc) != null && (user = this.Vb) != null) {
                    Drawable drawable = this.f22007cc.f25875f[0];
                    if (drawable instanceof org.telegram.ui.Components.l5) {
                        document = ((org.telegram.ui.Components.l5) drawable).e;
                    } else {
                        document = null;
                    }
                    k1Var.Y1(this, user, document, this.f21993bc);
                    a3();
                }
                this.N3.setState(StateSet.NOTHING);
                this.O3 = false;
            }
            return this.O3;
        }
        this.O3 = false;
        return false;
    }

    public final void L1(Canvas canvas, boolean z4, boolean z10, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        boolean z12;
        float dp;
        int i10;
        int v02;
        float f15;
        float f16;
        float f17;
        int i11 = 0;
        if (f14 != 1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f18 = (f14 * 0.5f) + 0.5f;
        float f19 = f11 * f14;
        s1 s1Var = this.Wc;
        mg.r0 r0Var = this.K;
        if (z4) {
            if (!this.f22273v7.isOutOwner()) {
                lc0 lc0Var = org.telegram.ui.ActionBar.j6.E3;
                if (f4()) {
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20195tc, this.Fd);
                } else {
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.j6.Oa;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20195tc;
                    }
                    v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.Fd);
                }
                lc0Var.a(v02);
                if (f4()) {
                    f16 = (getPhotoBottom() + this.f22197q0) - AndroidUtilities.dp(9.0f);
                } else {
                    if (!this.C && !this.B) {
                        f15 = 8.5f;
                    } else {
                        f15 = 9.5f;
                    }
                    float dp2 = (f10 - AndroidUtilities.dp(f15)) + f12;
                    if (this.f22166nd) {
                        if (this.G) {
                            f17 = 4.0f;
                        } else {
                            f17 = 5.0f;
                        }
                        float i12 = r0Var.i(s1Var.K1);
                        f16 = dp2 - ((1.0f - getVideoTranscriptionProgress()) * (i12 + AndroidUtilities.dp(f17)));
                    } else {
                        f16 = dp2;
                    }
                }
                if (!this.f22273v7.scheduled) {
                    i11 = AndroidUtilities.dp(11.0f);
                }
                a0.p(lc0Var, f13 + i11, f16 - AndroidUtilities.dp(12.0f));
                lc0Var.setAlpha((int) (f19 * 255.0f));
                if (z12) {
                    canvas.save();
                    canvas.scale(f18, f18, lc0Var.getBounds().centerX(), lc0Var.getBounds().centerY());
                }
                lc0Var.draw(canvas);
                lc0Var.setAlpha(255);
                invalidate();
                if (z12) {
                    canvas.restore();
                }
            }
        } else if (z10 && !this.f22273v7.isOutOwner()) {
            if (!this.f22273v7.scheduled) {
                i11 = AndroidUtilities.dp(11.0f);
            }
            float f20 = f13 + i11;
            float f21 = 21.5f;
            if (f4()) {
                dp = (getPhotoBottom() + this.f22197q0) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.C && !this.B) {
                    f21 = 20.5f;
                }
                dp = (f10 - AndroidUtilities.dp(f21)) + f12;
                if (this.f22166nd) {
                    dp -= (1.0f - getVideoTranscriptionProgress()) * r0Var.i(s1Var.K1);
                }
            }
            RectF rectF = this.Z4;
            rectF.set(f20, dp, AndroidUtilities.dp(14.0f) + f20, AndroidUtilities.dp(14.0f) + dp);
            int alpha = org.telegram.ui.ActionBar.j6.f19866b2.getAlpha();
            int i13 = (int) (f19 * 255.0f);
            org.telegram.ui.ActionBar.j6.f19866b2.setAlpha(i13);
            if (z12) {
                canvas.save();
                canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.f19866b2);
            org.telegram.ui.ActionBar.j6.f19866b2.setAlpha(alpha);
            Drawable L2 = L2("drawableMsgError");
            a0.p(L2, f20 + AndroidUtilities.dp(6.0f), dp + AndroidUtilities.dp(2.0f));
            L2.setAlpha(i13);
            L2.draw(canvas);
            L2.setAlpha(255);
            if (z12) {
                canvas.restore();
            }
        }
    }

    public final Drawable L2(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
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

    public final void L3(boolean z4, boolean z10, boolean z11) {
        MessageObject messageObject;
        if (z4 || !z11 || (messageObject = this.f22273v7) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.f22084i1;
            if (checkBoxBase != null) {
                checkBoxBase.f(-1, z10, z11);
            }
            CheckBoxBase checkBoxBase2 = this.f22070h1;
            if (checkBoxBase2 != null) {
                checkBoxBase2.f(-1, z4, z11);
            }
            ra0 ra0Var = this.Hc;
            float f10 = 0.0f;
            if (ra0Var.e == z10) {
                if (ra0Var.f28428f != z11 && !z11) {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ra0Var.d = f10;
                    ra0Var.f28428f = false;
                    return;
                }
                return;
            }
            ra0Var.e = z10;
            ra0Var.f28428f = z11;
            if (z11) {
                ra0Var.f28427c = SystemClock.elapsedRealtime();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                ra0Var.d = f10;
            }
            ra0Var.a();
            t1 t1Var = ra0Var.f28434m;
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
        if (this.f22222ra == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.W8 != null) {
                this.Ea -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            float f11 = this.Da;
            float f12 = this.Ea + dp;
            RectF rectF = this.Z4;
            rectF.set(f11, this.Ea, AndroidUtilities.dp(32.0f) + f11, f12);
            p0();
            String str = "paintChatActionBackground";
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i10 != 0) {
                int alpha = M2("paintChatActionBackground").getAlpha();
                M2("paintChatActionBackground").setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), M2("paintChatActionBackground"));
                M2("paintChatActionBackground").setAlpha(alpha);
            } else {
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.f22261ua) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF, dp2, dp3, M2(str));
            }
            if (R2()) {
                if (i10 != 0) {
                    int alpha2 = org.telegram.ui.ActionBar.j6.f19974h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19974h2.setAlpha((int) (alpha2 * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19974h2);
                    org.telegram.ui.ActionBar.j6.f19974h2.setAlpha(alpha2);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19974h2);
                }
            }
            Drawable O0 = org.telegram.ui.ActionBar.j6.O0("drawableCommentSticker");
            a0.p(O0, this.Da + AndroidUtilities.dp(4.0f), this.Ea + AndroidUtilities.dp(4.0f));
            if (i10 != 0) {
                O0.setAlpha((int) (f10 * 255.0f));
                O0.draw(canvas);
                O0.setAlpha(255);
            } else {
                O0.draw(canvas);
            }
            if (this.W8 != null) {
                org.telegram.ui.ActionBar.j6.E2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xc, this.Fd));
                org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (f10 * 255.0f));
                s1 s1Var = this.Wc;
                if (s1Var.U) {
                    if (s1Var.V != null) {
                        canvas.save();
                        org.telegram.ui.ActionBar.j6.E2.setAlpha((int) ((1.0d - s1Var.K1) * 255.0d * f10));
                        canvas.translate(this.Da + ((AndroidUtilities.dp(32.0f) - s1Var.X) / 2), this.Ea + AndroidUtilities.dp(30.0f));
                        s1Var.V.draw(canvas);
                        canvas.restore();
                    }
                    org.telegram.ui.ActionBar.j6.E2.setAlpha((int) (s1Var.K1 * 255.0f));
                }
                canvas.save();
                canvas.translate(this.Da + ((AndroidUtilities.dp(32.0f) - this.f22033e9) / 2), this.Ea + AndroidUtilities.dp(30.0f));
                this.W8.draw(canvas);
                canvas.restore();
            }
        }
    }

    public Paint M2(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
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

    public final boolean M3(boolean z4) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        t1 t1Var;
        if (this.f22273v7.isDice()) {
            Drawable drawable = this.P0.getDrawable();
            if (drawable instanceof cj0) {
                final cj0 cj0Var = (cj0) drawable;
                String diceEmoji = this.f22273v7.getDiceEmoji();
                TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.F7).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName == null) {
                    MediaDataController.getInstance(this.F7).loadStickersByEmojiOrName(diceEmoji, true, true);
                    return false;
                }
                int diceValue = this.f22273v7.getDiceValue();
                if ("🎰".equals(this.f22273v7.getDiceEmoji())) {
                    if (diceValue >= 0 && diceValue <= 64) {
                        yv0 yv0Var = (yv0) cj0Var;
                        if (yv0Var.R0 != null || yv0Var.S0) {
                            t1Var = this;
                        } else {
                            int i10 = diceValue - 1;
                            int U = yv0.U(i10 & 3);
                            int U2 = yv0.U((i10 >> 2) & 3);
                            int U3 = yv0.U(i10 >> 4);
                            if (U == 4 && U2 == 4 && U3 == 4) {
                                U = 5;
                                U3 = 5;
                                U2 = 5;
                            }
                            yv0Var.Y0 = U;
                            yv0Var.Z0 = U2;
                            yv0Var.f31164a1 = U3;
                            MessageObject messageObject = getMessageObject();
                            int i11 = getMessageObject().currentAccount;
                            yv0Var.S0 = true;
                            t1Var = this;
                            Utilities.globalQueue.postRunnable(new org.telegram.messenger.s1(yv0Var, stickerSetByEmojiOrName, i11, messageObject, t1Var, z4));
                        }
                        if (t1Var.f22273v7.isOut()) {
                            cj0Var.P(Integer.MAX_VALUE, t1Var.f22023dd);
                        }
                        t1Var.f22273v7.wasUnread = false;
                    } else {
                        t1Var = this;
                    }
                    if (cj0Var.f25160k0 == null && !cj0Var.V0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        yv0 yv0Var2 = (yv0) cj0Var;
                        if (yv0Var2.f25160k0 == null && !yv0Var2.V0) {
                            yv0Var2.V0 = true;
                            Utilities.globalQueue.postRunnable(new dg.f3(yv0Var2, stickerSetByEmojiOrName, getMessageObject().currentAccount, getMessageObject(), t1Var, 19));
                            return true;
                        }
                    }
                } else {
                    if (cj0Var.f25160k0 == null && !cj0Var.V0 && stickerSetByEmojiOrName.documents.size() > 0) {
                        TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                        File pathToAttach = FileLoader.getInstance(this.F7).getPathToAttach(document, true);
                        if (cj0Var.f25160k0 == null && !cj0Var.V0) {
                            final String readRes = AndroidUtilities.readRes(pathToAttach);
                            if (TextUtils.isEmpty(readRes)) {
                                DownloadController.getInstance(this.F7).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.f22273v7, this);
                                FileLoader.getInstance(this.F7).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                            } else {
                                cj0Var.V0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final cj0 cj0Var2 = cj0Var;
                                                String str = readRes;
                                                if (cj0Var2.T0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    cj0 cj0Var3 = cj0Var2;
                                                                    cj0Var3.V0 = false;
                                                                    if (!cj0Var3.S0 && cj0Var3.T0) {
                                                                        cj0Var3.A(true);
                                                                        return;
                                                                    }
                                                                    cj0Var3.j();
                                                                    cj0Var3.G();
                                                                    cj0Var3.v();
                                                                    return;
                                                                default:
                                                                    cj0 cj0Var4 = cj0Var2;
                                                                    cj0Var4.S0 = false;
                                                                    if (!cj0Var4.V0 && cj0Var4.T0) {
                                                                        cj0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                cj0Var2.R0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i12 = 0;
                                                if (cj0Var2.R0 != null) {
                                                    i12 = cj0Var2.R0.f23109a[0];
                                                }
                                                if (cj0Var2.R0 != null) {
                                                    int i13 = cj0Var2.R0.f23109a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new hm(cj0Var2, i12, 4));
                                                return;
                                            default:
                                                final cj0 cj0Var3 = cj0Var;
                                                cj0Var3.f25160k0 = RLottieNative.b(readRes, "dice", cj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                cj0 cj0Var32 = cj0Var3;
                                                                cj0Var32.V0 = false;
                                                                if (!cj0Var32.S0 && cj0Var32.T0) {
                                                                    cj0Var32.A(true);
                                                                    return;
                                                                }
                                                                cj0Var32.j();
                                                                cj0Var32.G();
                                                                cj0Var32.v();
                                                                return;
                                                            default:
                                                                cj0 cj0Var4 = cj0Var3;
                                                                cj0Var4.S0 = false;
                                                                if (!cj0Var4.V0 && cj0Var4.T0) {
                                                                    cj0Var4.A(true);
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
                        DownloadController.getInstance(this.F7).removeLoadingFileObserver(this);
                    }
                    if (diceValue >= 0 && diceValue < stickerSetByEmojiOrName.documents.size()) {
                        if (!z4 && this.f22273v7.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.F7).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                            cj0Var.P(diceFrameSuccess.frame, this.f22023dd);
                        }
                        TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                        File pathToAttach2 = FileLoader.getInstance(this.F7).getPathToAttach(document2, true);
                        if (cj0Var.R0 == null && !cj0Var.S0) {
                            final String readRes2 = AndroidUtilities.readRes(pathToAttach2);
                            if (TextUtils.isEmpty(readRes2)) {
                                DownloadController.getInstance(this.F7).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.f22273v7, this);
                                FileLoader.getInstance(this.F7).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                                this.f22273v7.wasUnread = false;
                            } else {
                                if (z4 && cj0Var.P == null && cj0Var.O == null && cj0Var.N == null) {
                                    cj0Var.H = 2;
                                    cj0Var.U0 = true;
                                }
                                cj0Var.S0 = true;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                final cj0 cj0Var2 = cj0Var;
                                                String str = readRes2;
                                                if (cj0Var2.T0) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (r2) {
                                                                case 0:
                                                                    cj0 cj0Var32 = cj0Var2;
                                                                    cj0Var32.V0 = false;
                                                                    if (!cj0Var32.S0 && cj0Var32.T0) {
                                                                        cj0Var32.A(true);
                                                                        return;
                                                                    }
                                                                    cj0Var32.j();
                                                                    cj0Var32.G();
                                                                    cj0Var32.v();
                                                                    return;
                                                                default:
                                                                    cj0 cj0Var4 = cj0Var2;
                                                                    cj0Var4.S0 = false;
                                                                    if (!cj0Var4.V0 && cj0Var4.T0) {
                                                                        cj0Var4.A(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                cj0Var2.R0 = RLottieNative.b(str, "dice", null, null, null);
                                                int i12 = 0;
                                                if (cj0Var2.R0 != null) {
                                                    i12 = cj0Var2.R0.f23109a[0];
                                                }
                                                if (cj0Var2.R0 != null) {
                                                    int i13 = cj0Var2.R0.f23109a[1];
                                                }
                                                AndroidUtilities.runOnUIThread(new hm(cj0Var2, i12, 4));
                                                return;
                                            default:
                                                final cj0 cj0Var3 = cj0Var;
                                                cj0Var3.f25160k0 = RLottieNative.b(readRes2, "dice", cj0Var3.e, null, null);
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        switch (r2) {
                                                            case 0:
                                                                cj0 cj0Var32 = cj0Var3;
                                                                cj0Var32.V0 = false;
                                                                if (!cj0Var32.S0 && cj0Var32.T0) {
                                                                    cj0Var32.A(true);
                                                                    return;
                                                                }
                                                                cj0Var32.j();
                                                                cj0Var32.G();
                                                                cj0Var32.v();
                                                                return;
                                                            default:
                                                                cj0 cj0Var4 = cj0Var3;
                                                                cj0Var4.S0 = false;
                                                                if (!cj0Var4.V0 && cj0Var4.T0) {
                                                                    cj0Var4.A(true);
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
                        DownloadController.getInstance(this.F7).removeLoadingFileObserver(this);
                        this.f22273v7.wasUnread = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean N0(MotionEvent motionEvent) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        boolean z4;
        Drawable drawable;
        Drawable drawable2;
        int dp;
        int i10;
        int dp2;
        int i11;
        int i12 = this.H1;
        if ((i12 != 5 && i12 != 1) || (groupedMessagePosition = this.I) == null || (groupedMessagePosition.flags & 4) != 0) {
            int i13 = this.f22273v7.type;
            if (i13 == 16) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                if ((i12 == 1 || i13 == 12 || i12 == 5 || i12 == 4 || i12 == 2 || i13 == 8) && !this.f22056g2 && !this.f22071h2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                int x10 = (int) motionEvent.getX();
                int z22 = (int) z2(motionEvent);
                int action = motionEvent.getAction();
                Drawable[] drawableArr = this.f22230s3;
                if (action == 0) {
                    MessageObject messageObject = this.f22273v7;
                    if (messageObject.type == 16) {
                        boolean isVideoCall = messageObject.isVideoCall();
                        int i14 = this.P4;
                        if (x10 >= i14) {
                            if (LocaleController.isRTL) {
                                dp = 0;
                            } else {
                                dp = this.G8 - AndroidUtilities.dp(70.0f);
                            }
                            int i15 = i14 + dp;
                            if (!isVideoCall) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            if (x10 <= AndroidUtilities.dp(i10 + 30) + i15 && z22 >= this.Q4 - AndroidUtilities.dp(14.0f)) {
                                if (z22 <= AndroidUtilities.dp(50.0f) + this.Q4) {
                                    this.W4 = true;
                                    this.f22254u3[0] = 4;
                                    if (drawableArr[0] != null) {
                                        int i16 = this.P4;
                                        if (LocaleController.isRTL) {
                                            dp2 = 0;
                                        } else {
                                            dp2 = this.G8 - AndroidUtilities.dp(70.0f);
                                        }
                                        int i17 = i16 + dp2;
                                        if (!isVideoCall) {
                                            i11 = 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        int dp3 = AndroidUtilities.dp(i11) + i17;
                                        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.G4;
                                        int A = org.telegram.ui.b.A(2, dp3, drawableArr2[isVideoCall ? 1 : 0]);
                                        int y10 = org.telegram.ui.b.y(2, this.Q4, drawableArr2[isVideoCall ? 1 : 0]);
                                        drawableArr[0].setBounds(A - AndroidUtilities.dp(20.0f), y10 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) + A, AndroidUtilities.dp(20.0f) + y10);
                                        drawableArr[0].setHotspot(x10, z22);
                                        drawableArr[0].setState(this.f22301x3);
                                    }
                                    invalidate();
                                    return true;
                                }
                            }
                        }
                    } else if (x10 >= this.P4 - AndroidUtilities.dp(20.0f)) {
                        if (x10 <= AndroidUtilities.dp(20.0f) + this.P4 && z22 >= this.Q4 - AndroidUtilities.dp(4.0f)) {
                            if (z22 <= AndroidUtilities.dp(30.0f) + this.Q4) {
                                this.W4 = true;
                                invalidate();
                                return true;
                            }
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.W4) {
                        if (this.f22273v7.type == 16 && (drawable2 = drawableArr[0]) != null) {
                            drawable2.setState(StateSet.NOTHING);
                        }
                        this.W4 = false;
                        playSoundEffect(0);
                        this.Gc.F0(this, this.P4, this.Q4);
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 2 && this.f22273v7.type == 16 && this.W4 && (drawable = drawableArr[0]) != null) {
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
        if (f4() && this.H1 != 7) {
            return ((getPhotoBottom() + this.f22197q0) - AndroidUtilities.dp(7.3f)) - this.f22136lb.getHeight();
        }
        int i10 = this.J8;
        if (!this.C && !this.B) {
            f11 = 6.5f;
        } else {
            f11 = 7.5f;
        }
        float dp = ((i10 - AndroidUtilities.dp(f11)) - this.f22136lb.getHeight()) + f10;
        boolean z4 = this.f22166nd;
        s1 s1Var = this.Wc;
        if (z4) {
            if (this.G) {
                f12 = 4.0f;
            } else {
                f12 = 5.0f;
            }
            dp -= (1.0f - getVideoTranscriptionProgress()) * (this.K.i(s1Var.K1) + AndroidUtilities.dp(f12));
        }
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f13 = dp + transitionParams.offsetBottom;
            if (transitionParams.backgroundChangeBounds) {
                return f13 - getTranslationY();
            }
            return f13;
        }
        return (s1Var.f21852i0 - s1Var.f21857j0) + dp;
    }

    public final void N3(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (drawable != null) {
            kj0 kj0Var = this.f22038ee;
            s1 s1Var = this.Wc;
            if (kj0Var != null && kj0Var.h) {
                this.f22152me = 0.0f;
            } else {
                float f10 = i11 + i13 + s1Var.f21852i0;
                this.f22152me = f10 - ((int) f10);
            }
            drawable.setBounds((int) (i10 + s1Var.f21843g0), (int) (i11 + s1Var.f21857j0), (int) (i10 + i12 + s1Var.f21847h0), (int) (i11 + i13 + s1Var.f21852i0));
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
            ArrayList arrayList = this.V5;
            if (i11 < arrayList.size()) {
                TLRPC.TodoItem todoItem = ((r1) arrayList.get(i11)).f21614t;
                if (todoItem != null && todoItem.f19329id == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void O3() {
        this.f22018d8 = true;
        this.f22032e8 = 1000;
        this.f22062g8 = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean P0(MotionEvent motionEvent) {
        vu0 a2;
        int intValue;
        k1 k1Var = this.Gc;
        if (k1Var == null) {
            a2 = null;
        } else {
            a2 = k1Var.a2();
        }
        vu0 vu0Var = a2;
        if (this.f22273v7 != null) {
            nh.y2 y2Var = this.P0;
            if (y2Var.hasNotThumb() && vu0Var != null && !this.f22273v7.isSticker() && !this.f22273v7.isAnimatedEmoji() && ((!this.f22273v7.isVideo() || this.f22118k7) && !this.f22166nd && !this.f22273v7.isAnimatedSticker() && ((!this.f22273v7.isDocument() || this.f22273v7.isGif()) && !this.f22273v7.needDrawBluredPreview()))) {
                MessageObject messageObject = this.f22273v7;
                ih.j jVar = this.Cb;
                if (jVar == null) {
                    intValue = 0;
                } else {
                    Integer num = (Integer) jVar.f7600k.get(this);
                    if (num == null) {
                        num = 0;
                    }
                    intValue = num.intValue();
                }
                return vu0Var.a(motionEvent, this, y2Var, messageObject, intValue);
            }
        }
        return false;
    }

    public final void P1(android.graphics.Canvas r52, boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.P1(android.graphics.Canvas, boolean):void");
    }

    public final boolean P2() {
        if (this.Z3 != null) {
            return true;
        }
        return false;
    }

    public final void P3(byte[] bArr) {
        MessageObject messageObject = this.f22289w7;
        if (messageObject == null) {
            messageObject = this.f22273v7;
        }
        if (messageObject == null) {
            this.f21985b4 = null;
            return;
        }
        ui0 ui0Var = this.f21985b4;
        if (ui0Var == null || !ui0Var.f29229f || !Arrays.equals(ui0Var.f29230g, bArr)) {
            this.f21985b4 = new ui0(this, messageObject.getId(), bArr);
        }
        this.f22266v0 = true;
    }

    public final boolean Q0(android.view.MotionEvent r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.Q0(android.view.MotionEvent):boolean");
    }

    public final void Q1(Canvas canvas) {
        float f10;
        int i10;
        float f11;
        int dp;
        int extraTextX;
        int i11;
        float f12;
        float f13;
        int dp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f14 = 1.0f;
            if (this.K1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            s1 s1Var = this.Wc;
            if (s1Var.R2) {
                f10 = AndroidUtilities.lerp(1.0f - f10, f10, s1Var.K1);
            }
            float f15 = 1.0f * f10;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight() + s1Var.f21847h0;
            if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.G) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float dp3 = (backgroundDrawableRight - AndroidUtilities.dp(10 + i10)) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.H;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i11 = (int) this.f22143m4;
            } else if (this.f22273v7.isOutOwner()) {
                i11 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f22234s8;
                if (this.f22273v7.type == 19) {
                    i11 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.G9, this.I9) + i11)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.f22077h8) {
                    dp = AndroidUtilities.dp(12.0f) + this.f22234s8;
                    extraTextX = getExtraTextX();
                } else {
                    int i12 = this.f22234s8;
                    if (this.G) {
                        f11 = 12.0f;
                    } else {
                        f11 = 18.0f;
                    }
                    dp = AndroidUtilities.dp(f11) + i12;
                    extraTextX = getExtraTextX();
                }
                i11 = extraTextX + dp;
            }
            int dp4 = ((int) (i11 + s1Var.f21843g0)) - AndroidUtilities.dp(1.33f);
            int i13 = this.f22154n0;
            float f16 = dp4;
            int i14 = (int) (dp3 - f16);
            int i15 = this.f21998c2;
            if (s1Var.X2) {
                i15 = AndroidUtilities.lerp(s1Var.T2, i15, s1Var.K1);
            }
            if (this.W1 && (getPrimaryMessageObject() == null || !getPrimaryMessageObject().factCheckExpanded)) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            if (s1Var.Z2) {
                AndroidUtilities.lerp(1.0f - f12, f12, s1Var.K1);
            }
            if (this.f21976aa == null) {
                this.f21976aa = new am0(this);
            }
            int o10 = this.f21976aa.o(this.Fd);
            canvas.save();
            canvas.translate(f16, i13);
            int i16 = i15;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i14, i16);
            rc rcVar = this.O1;
            if (rcVar != null) {
                f13 = rcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f21976aa.c(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f21976aa.e(canvas, rectF, f15);
            k01 k01Var = this.L1;
            if (k01Var != null) {
                k01Var.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), f15, o10, canvas);
                if (this.M1 != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.L1.f26084c + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.M1.f26084c, AndroidUtilities.dp(21.66f));
                    rc rcVar2 = this.N1;
                    if (rcVar2 != null) {
                        f14 = rcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.f21976aa.f23459g);
                    this.M1.c(AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(12.0f), f15, o10, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final boolean Q2() {
        return this.f22063g9;
    }

    public final void Q3(CharacterStyle characterStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = this.f22289w7;
        if (messageObject == null) {
            messageObject = this.f22273v7;
        }
        this.f22266v0 = false;
        ArrayList arrayList = this.f22303x5;
        if (messageObject != null && messageObject.messageOwner.message != null && characterStyle != null) {
            if (this.Z3 != null && !TextUtils.isEmpty(messageObject.caption)) {
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
                        while (i17 < this.Z3.textLayoutBlocks.size()) {
                            MessageObject.TextLayoutBlock textLayoutBlock = this.Z3.textLayoutBlocks.get(i17);
                            if (i14 >= textLayoutBlock.charactersOffset && i14 < textLayoutBlock.charactersEnd) {
                                this.f22251u0 = i17;
                                this.f22266v0 = false;
                                G3();
                                try {
                                    y80 B3 = B3();
                                    B3.d(textLayoutBlock.textLayout, i14, 0.0f);
                                    textLayoutBlock.textLayout.getSelectionPath(i14, i13, B3);
                                    if (i13 >= textLayoutBlock.charactersOffset + i16) {
                                        do {
                                            i17++;
                                            if (i17 >= this.Z3.textLayoutBlocks.size()) {
                                                break;
                                            }
                                            MessageObject.TextLayoutBlock textLayoutBlock2 = this.Z3.textLayoutBlocks.get(i17);
                                            i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                            y80 B32 = B3();
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
                            this.f22251u0 = i19;
                            this.f22266v0 = false;
                            G3();
                            try {
                                y80 B33 = B3();
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
                                        y80 B34 = B3();
                                        B34.d(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                        textLayoutBlock4.textLayout.getSelectionPath(0, i10 - textLayoutBlock4.charactersOffset, B34);
                                    } while (i10 >= (textLayoutBlock3.charactersOffset + i12) - 1);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            invalidate();
                            return;
                        }
                        i19++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f22251u0 = -1;
                this.f22266v0 = false;
                G3();
                invalidate();
            }
        } else if (!arrayList.isEmpty()) {
            this.f22251u0 = -1;
            this.f22266v0 = false;
            G3();
            invalidate();
        }
    }

    public final boolean R0(MotionEvent motionEvent) {
        dh.j jVar;
        dh.j jVar2;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.type == 17 && !messageObject.isSending()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            dh.j jVar3 = this.Y5;
            if (jVar3 != null) {
                if (jVar3.U && jVar3.f4906a.f46893f && jVar3.H.f(x10 - jVar3.I, z22 - jVar3.J, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f21997c1 = true;
                    invalidate();
                    return true;
                }
                dh.j jVar4 = this.Y5;
                if ((jVar4.U || jVar4.T) && jVar4.j(x10, z22, action)) {
                    this.f21997c1 = true;
                    invalidate();
                    return true;
                }
            }
            if (this.f22273v7.expandedExplanation && (jVar2 = this.Z5) != null) {
                if (jVar2.U && jVar2.f4906a.f46893f && jVar2.H.f(x10 - jVar2.I, z22 - jVar2.J, action)) {
                    if (action == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f21997c1 = true;
                    invalidate();
                    return true;
                }
                dh.j jVar5 = this.Z5;
                if ((jVar5.U || jVar5.T) && jVar5.j(x10, z22, action)) {
                    this.f21997c1 = true;
                    invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.K6 = -1;
                dh.j jVar6 = this.Y5;
                if (jVar6 != null && jVar6.P && jVar6.getBounds().contains(x10, z22)) {
                    this.K6 = -2;
                    invalidate();
                    return true;
                } else if (this.f22273v7.expandedExplanation && (jVar = this.Z5) != null && jVar.P && jVar.getBounds().contains(x10, z22)) {
                    this.K6 = -3;
                    invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.K6 != -1) {
                    return true;
                }
            } else if (action == 1 && this.K6 != -1) {
                playSoundEffect(0);
                int i10 = this.K6;
                if (i10 == -2) {
                    dh.j jVar7 = this.Y5;
                    ImageReceiver imageReceiver = jVar7.f4908b;
                    TLRPC.MessageMedia messageMedia = jVar7.Q;
                    k1 k1Var = this.Gc;
                    if (k1Var != null) {
                        k1Var.m(this, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    dh.j jVar8 = this.Z5;
                    ImageReceiver imageReceiver2 = jVar8.f4908b;
                    TLRPC.MessageMedia messageMedia2 = jVar8.Q;
                    k1 k1Var2 = this.Gc;
                    if (k1Var2 != null) {
                        k1Var2.m(this, null, messageMedia2, -3);
                    }
                }
                this.K6 = -1;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
        if (f6Var != null) {
            return f6Var.m0();
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    public final void R3(int i10) {
        MessageObject messageObject = this.f22289w7;
        if (messageObject == null) {
            messageObject = this.f22273v7;
        }
        if (messageObject == null) {
            this.f21985b4 = null;
            return;
        }
        ui0 ui0Var = this.f21985b4;
        if (ui0Var == null || !ui0Var.e || ui0Var.f29228c != (-i10)) {
            this.f21985b4 = new ui0(this, messageObject.getId(), i10);
        }
        this.f22266v0 = true;
    }

    public final void S0(boolean z4) {
        MessageObject messageObject;
        boolean z10;
        if (this.W5 != null && (messageObject = this.f22273v7) != null && messageObject.isPoll()) {
            TLRPC.MessageMedia media = MessageObject.getMedia(this.f22273v7);
            boolean z11 = false;
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                z10 = ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice;
            } else {
                z10 = false;
            }
            fh.d dVar = this.W5;
            if (z10 && SendMessagesHelper.getInstance(this.F7).isSendingVote(this.f22273v7) != null) {
                z11 = true;
            }
            xd.a aVar = dVar.f6208f;
            if (aVar.f46893f != z11) {
                aVar.a(z11, z4);
            }
        }
    }

    public final void S1(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.S1(android.graphics.Canvas):void");
    }

    public final boolean S2() {
        MessageObject messageObject = this.f22273v7;
        if ((messageObject != null && messageObject.hasInlineBotButtons()) || this.f22219r7) {
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
        if (this.f22337z9 == null || (k1Var = this.Gc) == null || !k1Var.n0()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        if (this.f22273v7.shouldDrawWithoutBackground()) {
            i10 = Math.max(this.G9, this.I9) + this.D9;
        } else {
            i10 = this.f22246t8 + this.D9;
        }
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.D9 && x10 <= i10) {
                float f10 = this.E9;
                if (z22 >= f10 && z22 <= f10 + this.F9) {
                    this.N9 = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.R9 = x10;
                    this.S9 = getY() + z22;
                    z zVar = this.f22294wc;
                    if (zVar != null) {
                        zVar.setHotspot(x10, z22);
                        this.O9 = false;
                        this.P9 = true;
                        postDelayed(new a1(4, this), ViewConfiguration.getTapTimeout() / 6);
                        invalidate();
                    }
                    rc rcVar = this.f22224rc;
                    if (rcVar != null) {
                        rcVar.c(true);
                        this.f22263uc = x10;
                        this.f22278vc = z22;
                    }
                    q();
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.N9) {
                    k();
                    this.N9 = false;
                    z zVar2 = this.f22294wc;
                    if (zVar2 != null) {
                        if (!this.O9) {
                            zVar2.setState(new int[]{16842919, 16842910});
                            post(new a1(5, this));
                        } else {
                            zVar2.setState(new int[0]);
                        }
                        this.O9 = false;
                        this.P9 = false;
                        invalidate();
                    }
                    rc rcVar2 = this.f22224rc;
                    if (rcVar2 != null) {
                        rcVar2.c(false);
                    }
                    playSoundEffect(0);
                    if (this.jc) {
                        k1 k1Var2 = this.Gc;
                        if (k1Var2 != null) {
                            TLRPC.Chat chat = this.f22066gc;
                            if (chat != null) {
                                k1Var2.T(this, chat, this.f22273v7.messageOwner.fwd_from.channel_post, this.f22011d1, this.f22026e1, false);
                                t1Var = this;
                            } else {
                                t1Var = this;
                                TLRPC.User user = t1Var.f22036ec;
                                if (user != null) {
                                    k1Var2.y0(this, user, t1Var.f22011d1, t1Var.f22026e1);
                                } else if (t1Var.f22080hc != null) {
                                    k1Var2.n(this);
                                }
                            }
                        }
                    } else {
                        t1Var = this;
                        if (t1Var.Gc != null && (t1Var.f22273v7.hasValidReplyMessageObject() || t1Var.f22273v7.isReplyToStory() || t1Var.f22275v9 || ((message = t1Var.f22273v7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null))) {
                            t1Var.Gc.e2(t1Var, t1Var.f22273v7.getReplyMsgId(), x10, z22, false);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (motionEvent.getAction() == 3) {
                    t1Var.N9 = false;
                    t1Var.O9 = false;
                    z zVar3 = t1Var.f22294wc;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                    invalidate();
                    rc rcVar3 = t1Var.f22224rc;
                    if (rcVar3 != null) {
                        rcVar3.c(false);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (x10 >= t1Var.D9 && x10 <= i10) {
                        float f11 = t1Var.E9;
                        if (z22 >= f11 && z22 <= f11 + t1Var.F9) {
                            if (t1Var.f22294wc != null && t1Var.P9) {
                                if (Math.sqrt(Math.pow((getY() + z22) - t1Var.S9, 2.0d) + Math.pow(x10 - t1Var.R9, 2.0d)) > 0.75d) {
                                    t1Var.P9 = false;
                                }
                            }
                        }
                    }
                    t1Var.N9 = false;
                    t1Var.O9 = false;
                    t1Var.P9 = false;
                    z zVar4 = t1Var.f22294wc;
                    if (zVar4 != null) {
                        zVar4.setState(new int[0]);
                    }
                    invalidate();
                    rc rcVar4 = t1Var.f22224rc;
                    if (rcVar4 != null) {
                        rcVar4.c(false);
                    }
                }
            }
            return t1Var.N9;
        }
        t1Var = this;
        return t1Var.N9;
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
        ih.k kVar;
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
        if (this.f22273v7.hasValidGroupId() && (groupedMessages = this.H) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                View childAt = viewGroup.getChildAt(i18);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.H.groupId) {
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
        if (this.f22258u7) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        s1 s1Var = this.Wc;
        if (actionMasked == 0) {
            int i20 = this.f22111k0;
            if (x10 >= i20 && z22 >= (i16 = this.f22168o0)) {
                MessageObject messageObject = this.f22273v7;
                if (x10 <= i20 + messageObject.textWidth && z22 <= messageObject.textHeight(s1Var) + i16) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f22273v7.textLayoutBlocks;
                    for (int i21 = 0; i21 < arrayList.size() && arrayList.get(i21).textYOffset(this.f22273v7.textLayoutBlocks, s1Var) <= z22; i21++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i21);
                        if (textLayoutBlock.isRtl()) {
                            i17 = (int) this.f22273v7.textXOffset;
                        } else {
                            i17 = 0;
                        }
                        for (ih.k kVar2 : textLayoutBlock.spoilers) {
                            if (kVar2.getBounds().contains((x10 - this.f22111k0) + i17, (int) ((z22 - this.f22168o0) - textLayoutBlock.textYOffset(this.f22273v7.textLayoutBlocks, s1Var)))) {
                                this.f22245t7 = kVar2;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.Z3 != null) {
                float f10 = x10;
                float f11 = this.f22143m4;
                if (f10 >= f11) {
                    float f12 = z22;
                    float f13 = this.f22158n4;
                    if (f12 >= f13 && f10 <= f11 + textLayoutBlocks.textWidth && f12 <= f13 + textLayoutBlocks.textHeight(s1Var)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.Z3.textLayoutBlocks;
                        for (int i22 = 0; i22 < arrayList2.size() && arrayList2.get(i22).textYOffset(this.Z3.textLayoutBlocks, s1Var) <= f12; i22++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i22);
                            if (textLayoutBlock2.isRtl()) {
                                i15 = (int) this.Z3.textXOffset;
                            } else {
                                i15 = 0;
                            }
                            for (ih.k kVar3 : textLayoutBlock2.spoilers) {
                                if (kVar3.getBounds().contains((int) ((f10 - this.f22143m4) + i15), (int) ((f12 - this.f22158n4) - textLayoutBlock2.textYOffset(this.Z3.textLayoutBlocks, s1Var)))) {
                                    this.f22245t7 = kVar3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.f22029e4 == null) {
                return false;
            }
            float f14 = x10;
            float f15 = this.X6;
            if (f14 < f15) {
                return false;
            }
            float f16 = z22;
            float f17 = this.Y6;
            if (f16 <= f17 || f14 > f15 + textLayoutBlocks2.textWidth || f16 > f17 + textLayoutBlocks2.textHeight(s1Var)) {
                return false;
            }
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.f22029e4.textLayoutBlocks;
            for (int i23 = 0; i23 < arrayList3.size() && arrayList3.get(i23).textYOffset(this.f22029e4.textLayoutBlocks, s1Var) <= f16; i23++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i23);
                if (textLayoutBlock3.isRtl()) {
                    i14 = (int) this.f22029e4.textXOffset;
                } else {
                    i14 = 0;
                }
                for (ih.k kVar4 : textLayoutBlock3.spoilers) {
                    if (kVar4.getBounds().contains((int) ((f14 - this.X6) + i14), (int) ((f16 - this.Y6) - textLayoutBlock3.textYOffset(this.f22029e4.textLayoutBlocks, s1Var)))) {
                        this.f22245t7 = kVar4;
                        return true;
                    }
                }
            }
            return false;
        } else if (actionMasked != 1 || this.f22245t7 == null) {
            return false;
        } else {
            playSoundEffect(0);
            Path path = this.Kd;
            path.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.f22029e4;
            if (textLayoutBlocks3 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = textLayoutBlocks3.textLayoutBlocks;
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    MessageObject.TextLayoutBlock textLayoutBlock4 = arrayList4.get(i24);
                    i24++;
                    MessageObject.TextLayoutBlock textLayoutBlock5 = textLayoutBlock4;
                    for (ih.k kVar5 : textLayoutBlock5.spoilers) {
                        Rect bounds = kVar5.getBounds();
                        path.addRect(bounds.left, textLayoutBlock5.textYOffset(this.f22029e4.textLayoutBlocks, s1Var) + bounds.top, bounds.right, textLayoutBlock5.textYOffset(this.f22029e4.textLayoutBlocks, s1Var) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.Z3;
            if (textLayoutBlocks4 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = textLayoutBlocks4.textLayoutBlocks;
                int size2 = arrayList5.size();
                int i25 = 0;
                while (i25 < size2) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = arrayList5.get(i25);
                    i25++;
                    MessageObject.TextLayoutBlock textLayoutBlock7 = textLayoutBlock6;
                    for (ih.k kVar6 : textLayoutBlock7.spoilers) {
                        Rect bounds2 = kVar6.getBounds();
                        path.addRect(bounds2.left, textLayoutBlock7.textYOffset(this.Z3.textLayoutBlocks, s1Var) + bounds2.top, bounds2.right, textLayoutBlock7.textYOffset(this.Z3.textLayoutBlocks, s1Var) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList6 = this.f22273v7.textLayoutBlocks;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        MessageObject.TextLayoutBlock textLayoutBlock8 = arrayList6.get(i26);
                        i26++;
                        MessageObject.TextLayoutBlock textLayoutBlock9 = textLayoutBlock8;
                        for (ih.k kVar7 : textLayoutBlock9.spoilers) {
                            Rect bounds3 = kVar7.getBounds();
                            path.addRect(bounds3.left, textLayoutBlock9.textYOffset(this.f22273v7.textLayoutBlocks, s1Var) + bounds3.top, bounds3.right, textLayoutBlock9.textYOffset(this.f22273v7.textLayoutBlocks, s1Var) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            RectF rectF = this.Z4;
            path.computeBounds(rectF, false);
            float sqrt = (float) Math.sqrt(Math.pow(rectF.height(), 2.0d) + Math.pow(rectF.width(), 2.0d));
            this.f22258u7 = true;
            this.f22245t7.f7616q = new a1(9, this);
            MessageObject.TextLayoutBlocks textLayoutBlocks5 = this.f22029e4;
            if (textLayoutBlocks5 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList7 = textLayoutBlocks5.textLayoutBlocks;
                int size4 = arrayList7.size();
                int i27 = 0;
                while (i27 < size4) {
                    MessageObject.TextLayoutBlock textLayoutBlock10 = arrayList7.get(i27);
                    i27++;
                    MessageObject.TextLayoutBlock textLayoutBlock11 = textLayoutBlock10;
                    if (textLayoutBlock11.isRtl()) {
                        i13 = (int) this.f22029e4.textXOffset;
                    } else {
                        i13 = 0;
                    }
                    for (ih.k kVar8 : textLayoutBlock11.spoilers) {
                        kVar8.j((x10 - this.X6) + i13, (z22 - textLayoutBlock11.textYOffset(this.f22029e4.textLayoutBlocks, s1Var)) - this.Y6, sqrt, false);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks6 = this.Z3;
            if (textLayoutBlocks6 != null) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList8 = textLayoutBlocks6.textLayoutBlocks;
                int size5 = arrayList8.size();
                int i28 = 0;
                while (i28 < size5) {
                    MessageObject.TextLayoutBlock textLayoutBlock12 = arrayList8.get(i28);
                    i28++;
                    MessageObject.TextLayoutBlock textLayoutBlock13 = textLayoutBlock12;
                    if (textLayoutBlock13.isRtl()) {
                        i12 = (int) this.Z3.textXOffset;
                    } else {
                        i12 = 0;
                    }
                    for (ih.k kVar9 : textLayoutBlock13.spoilers) {
                        kVar9.j((x10 - this.f22143m4) + i12, (z22 - textLayoutBlock13.textYOffset(this.Z3.textLayoutBlocks, s1Var)) - this.f22158n4, sqrt, false);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList9 = this.f22273v7.textLayoutBlocks;
                if (arrayList9 != null) {
                    int size6 = arrayList9.size();
                    int i29 = 0;
                    while (i29 < size6) {
                        MessageObject.TextLayoutBlock textLayoutBlock14 = arrayList9.get(i29);
                        i29++;
                        MessageObject.TextLayoutBlock textLayoutBlock15 = textLayoutBlock14;
                        if (textLayoutBlock15.isRtl()) {
                            i11 = (int) this.f22273v7.textXOffset;
                        } else {
                            i11 = 0;
                        }
                        for (ih.k kVar10 : textLayoutBlock15.spoilers) {
                            kVar10.j((x10 - this.f22111k0) + i11, (z22 - textLayoutBlock15.textYOffset(this.f22273v7.textLayoutBlocks, s1Var)) - this.f22168o0, sqrt, false);
                        }
                    }
                }
            }
            if (getParent() instanceof sl0) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i30 = 0; i30 < viewGroup2.getChildCount(); i30++) {
                    View childAt2 = viewGroup2.getChildAt(i30);
                    if (childAt2 instanceof t1) {
                        t1 t1Var2 = (t1) childAt2;
                        ArrayList arrayList10 = t1Var2.Id;
                        if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !arrayList10.isEmpty()) {
                            ((ih.k) arrayList10.get(0)).f7616q = new ja(6, this, t1Var2);
                            int size7 = arrayList10.size();
                            int i31 = 0;
                            while (i31 < size7) {
                                Object obj = arrayList10.get(i31);
                                i31++;
                                ((ih.k) obj).j(kVar.getBounds().centerX(), kVar.getBounds().centerY(), sqrt, false);
                            }
                        }
                    }
                }
            }
            this.f22245t7 = null;
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
        nh.y2 y2Var = this.P0;
        y2Var.setImageCoords(f10, f11, f12, f13);
        int i10 = this.H1;
        if (i10 != 4 && i10 != 2) {
            return;
        }
        this.J4 = (int) (y2Var.getImageX() + AndroidUtilities.dp(8.0f));
        int imageY = (int) (y2Var.getImageY() + AndroidUtilities.dp(8.0f));
        this.K4 = imageY;
        int i11 = this.J4;
        int dp = AndroidUtilities.dp(24.0f) + this.K4;
        this.M0.q(i11, imageY, AndroidUtilities.dp(24.0f) + i11, dp);
        this.H4 = (int) e2.c.x(y2Var.getImageWidth(), AndroidUtilities.dp(48.0f), 2.0f, f10);
        int x10 = (int) e2.c.x(y2Var.getImageHeight(), AndroidUtilities.dp(48.0f), 2.0f, y2Var.getImageY());
        this.I4 = x10;
        int i12 = this.H4;
        int dp2 = AndroidUtilities.dp(48.0f) + this.I4;
        this.L0.q(i12, x10, AndroidUtilities.dp(48.0f) + i12, dp2);
    }

    public final void V0() {
        int i10;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.isStakedDice() && !this.N) {
            Drawable drawable = this.P0.getDrawable();
            if (drawable instanceof cj0) {
                cj0 cj0Var = (cj0) drawable;
                if ((cj0Var.f25160k0 != null || cj0Var.V0) && !this.N && (i10 = cj0Var.H) != 1 && i10 == 2) {
                    if (!cj0Var.U0) {
                        float r10 = cj0Var.r();
                        if (cj0Var.R0 != null) {
                            r10 = cj0Var.Y / cj0Var.X0;
                        }
                        if (r10 <= 0.95f) {
                            return;
                        }
                    }
                    this.N = true;
                    k1 k1Var = this.Gc;
                    if (k1Var != null) {
                        k1Var.G1(this, false);
                    }
                }
            }
        }
    }

    public final void V1(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        Canvas canvas2;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.isSponsored()) {
            float f13 = this.f22168o0;
            s1 s1Var = this.Wc;
            if (s1Var.f21868l2) {
                float f14 = s1Var.f21877n2;
                float f15 = s1Var.K1;
                f10 = (f15 * f13) + ((1.0f - f15) * f14);
            } else {
                f10 = f13;
            }
            if (s1Var.K1 != 1.0f && s1Var.G0) {
                canvas.save();
                org.telegram.ui.ActionBar.g5 g5Var = this.f22205q8;
                if (g5Var != null) {
                    Rect bounds = g5Var.getBounds();
                    if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.C) {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    } else {
                        canvas.clipRect(AndroidUtilities.dp(4.0f) + bounds.left, AndroidUtilities.dp(4.0f) + bounds.top, bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    }
                }
                kj0 kj0Var = this.f22038ee;
                if (kj0Var != null && kj0Var.h) {
                    MessageObject messageObject2 = this.f22273v7;
                    U1(this.f22111k0, f10, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false, false);
                    canvas2 = canvas;
                } else {
                    U1(this.f22111k0, f10, canvas, s1Var.H0, s1Var.N0, false, 1.0f - s1Var.K1, true, false, false, false);
                    MessageObject messageObject3 = this.f22273v7;
                    U1(this.f22111k0, f10, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, s1Var.K1, true, false, false, false);
                    canvas2 = canvas;
                }
                canvas2.restore();
                return;
            }
            float f16 = f10;
            boolean z4 = s1Var.D1;
            if (z4 && this.f22205q8 != null) {
                if (z4) {
                    int i12 = -1;
                    if (this.f22198q1) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    float w10 = e2.c.w(1.0f, s1Var.K1, this.f22273v7.textHeight(s1Var) * i11, f13);
                    float f17 = s1Var.f21877n2;
                    if (this.f22198q1) {
                        i12 = 1;
                    }
                    f11 = f17 - ((this.f22273v7.textHeight(s1Var) * i12) * s1Var.K1);
                    f12 = w10;
                } else {
                    f11 = f16;
                    f12 = f11;
                }
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.f22205q8.getBounds());
                if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.C) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                float f18 = rectF.left;
                float f19 = s1Var.f21877n2;
                canvas.clipRect(f18, f19, rectF.right, this.f22273v7.textHeight(s1Var) + f19 + AndroidUtilities.dp(4.0f));
                MessageObject messageObject4 = this.f22273v7;
                U1(this.f22111k0, f11, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - s1Var.K1, true, false, false, false);
                canvas.restore();
                canvas.save();
                rectF.set(this.f22205q8.getBounds());
                if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.C) {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(10.0f);
                } else {
                    rectF.left += AndroidUtilities.dp(4.0f);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                canvas.clipRect(rectF.left, this.f22168o0, rectF.right, AndroidUtilities.dp(4.0f) + this.f22273v7.textHeight(s1Var) + i10);
                MessageObject messageObject5 = this.f22273v7;
                U1(this.f22111k0, f12, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false, false);
                canvas.restore();
                return;
            }
            MessageObject messageObject6 = this.f22273v7;
            U1(this.f22111k0, f16, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false, false);
        }
    }

    public final boolean V2() {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.shouldDrawReactions()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return false;
                }
            }
            if (!this.K.f14114b) {
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
        if (!this.f22034ea || this.f22093ia == null || this.f22249tc == null || this.Gc == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float z22 = z2(motionEvent);
        int action = motionEvent.getAction();
        RectF rectF = this.f22338zc;
        if (action == 0) {
            if (rectF.contains(x10, z22)) {
                this.f22249tc.c(true);
                z zVar = this.f22078ha;
                if (zVar != null) {
                    zVar.setHotspot(x10, z22);
                    this.f22078ha.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.f22249tc.h && !rectF.contains(x10, z22)) {
                this.f22249tc.c(false);
                z zVar2 = this.f22078ha;
                if (zVar2 != null) {
                    zVar2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f22249tc.h) {
                this.Gc.L0(this);
            }
            this.f22249tc.c(false);
            z zVar3 = this.f22078ha;
            if (zVar3 != null) {
                zVar3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f22249tc.c(false);
            z zVar4 = this.f22078ha;
            if (zVar4 != null) {
                zVar4.setState(new int[0]);
            }
        }
        return this.f22249tc.h;
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
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Z3;
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

    public void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4, boolean z10, boolean z11, boolean z12) {
        if (this.J0) {
            V3(messageObject, groupedMessages, z4, z10, z11, z12);
            return;
        }
        this.f22289w7 = messageObject;
        this.f22305x7 = groupedMessages;
        this.f22335z7 = z4;
        this.f22321y7 = z10;
        this.A7 = z11;
        this.B7 = z12;
    }

    public final boolean Y0(MotionEvent motionEvent) {
        n9 C2;
        boolean z4;
        boolean z10;
        int i10;
        int dp;
        int i11;
        int dp2;
        int extraTextX;
        int i12;
        MessageObject.GroupedMessages groupedMessages;
        k1 k1Var = this.Gc;
        if (k1Var != null && (C2 = k1Var.C2()) != null && (C2.b() || C2.e())) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.f22273v7.textLayoutBlocks;
            if (arrayList != null && !arrayList.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            RichMessageLayout richMessageLayout = this.f22273v7.richLayout;
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((z4 || P2() || z10) && ((this.f22055g1 || this.H != null) && (this.H == null || this.Gc.Q()))) {
                if (this.f22273v7.hasValidGroupId() && (groupedMessages = this.H) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            if (childAt instanceof t1) {
                                t1 t1Var = (t1) childAt;
                                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                                MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.H.groupId && (currentPosition.flags & t0()) != 0 && (currentPosition.flags & 1) != 0) {
                                    C2.f22669c = (int) t1Var.f22143m4;
                                    C2.d = (int) t1Var.f22158n4;
                                    C2.b0(t1Var);
                                    if (t1Var == this) {
                                        return C2.N(motionEvent);
                                    }
                                    motionEvent.offsetLocation(getLeft() - t1Var.getLeft(), getTop() - t1Var.getTop());
                                    boolean N = C2.N(motionEvent);
                                    motionEvent.offsetLocation(-(getLeft() - t1Var.getLeft()), -(getTop() - t1Var.getTop()));
                                    return N;
                                }
                            }
                        }
                    }
                } else {
                    MessageObject messageObject = this.f22273v7;
                    if (messageObject != null && !messageObject.preview && this.P1 != null && z2(motionEvent) >= this.f22154n0) {
                        C2.f21457w0 = false;
                        C2.f21459y0 = true;
                        C2.A0 = false;
                        MessageObject.GroupedMessages groupedMessages2 = this.H;
                        if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                            i12 = (int) this.f22143m4;
                        } else {
                            float f10 = 12.0f;
                            if (this.f22273v7.isOutOwner()) {
                                int extraTextX2 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f22234s8;
                                if (this.f22273v7.type == 19) {
                                    i12 = extraTextX2 - Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.G9, this.I9) + extraTextX2)) - AndroidUtilities.displaySize.x);
                                } else {
                                    i12 = extraTextX2;
                                }
                            } else {
                                if (this.f22077h8) {
                                    dp2 = AndroidUtilities.dp(12.0f) + this.f22234s8;
                                    extraTextX = getExtraTextX();
                                } else {
                                    int i14 = this.f22234s8;
                                    if (!this.G) {
                                        f10 = 18.0f;
                                    }
                                    dp2 = AndroidUtilities.dp(f10) + i14;
                                    extraTextX = getExtraTextX();
                                }
                                i12 = extraTextX + dp2;
                            }
                        }
                        int dp3 = ((int) (i12 + this.Wc.f21843g0)) - AndroidUtilities.dp(1.33f);
                        int i15 = this.f22154n0;
                        C2.f22669c = (AndroidUtilities.dp(10.0f) + dp3) - this.Y1;
                        C2.d = AndroidUtilities.dp(22.0f) + i15;
                    } else if (P2()) {
                        C2.f21457w0 = false;
                        C2.f21459y0 = false;
                        C2.A0 = false;
                        C2.f22669c = (int) this.f22143m4;
                        C2.d = (int) this.f22158n4;
                    } else {
                        MessageObject messageObject2 = this.f22273v7;
                        if (messageObject2 != null && !messageObject2.preview && this.H2 != null && (!this.f22198q1 ? z2(motionEvent) > this.f22127l2 : z2(motionEvent) < this.f22168o0)) {
                            C2.f21457w0 = true;
                            C2.f21459y0 = false;
                            C2.A0 = false;
                            if (this.f22056g2) {
                                i11 = this.f22126l0 - AndroidUtilities.dp(10.0f);
                            } else {
                                if (this.f22071h2) {
                                    i10 = this.f22126l0;
                                    dp = AndroidUtilities.dp(1.0f);
                                } else {
                                    i10 = this.f22126l0;
                                    dp = AndroidUtilities.dp(1.0f);
                                }
                                i11 = i10 + dp;
                            }
                            int dp4 = AndroidUtilities.dp(10.0f) + i11 + this.f22170o2;
                            int i16 = this.f22127l2;
                            C2.f22669c = dp4;
                            C2.d = i16;
                        } else if (z10) {
                            C2.f21457w0 = false;
                            C2.f21459y0 = false;
                            C2.A0 = true;
                            int i17 = this.f22111k0;
                            int i18 = this.f22168o0;
                            C2.f22669c = i17;
                            C2.d = i18;
                        } else {
                            C2.f21457w0 = false;
                            C2.f21459y0 = false;
                            C2.A0 = false;
                            int i19 = this.f22111k0;
                            int i20 = this.f22168o0;
                            C2.f22669c = i19;
                            C2.d = i20;
                        }
                    }
                    C2.b0(this);
                    return C2.N(motionEvent);
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
                this.f22251u0 = i13;
                G3();
                try {
                    y80 B3 = B3();
                    B3.f28799c = true;
                    B3.d(textLayoutBlock.textLayout, i10, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i10, i11, B3);
                    B3.a();
                    float f10 = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i11 >= textLayoutBlock.charactersOffset + i12) {
                        for (int i14 = i13 + 1; i14 < arrayList.size(); i14++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i14);
                            int i15 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            y80 B32 = B3();
                            B32.f28799c = true;
                            float f11 = f10 + textLayoutBlock2.padTop;
                            B32.d(textLayoutBlock2.textLayout, 0, f11);
                            f10 = f11 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i11 - textLayoutBlock2.charactersOffset, B32);
                            B32.a();
                            if (i11 < (textLayoutBlock.charactersOffset + i15) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.f22266v0) {
                        this.f22018d8 = true;
                        this.f22032e8 = 2500;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                invalidate();
            } else {
                i13++;
            }
        }
        this.W3 = -1;
        this.X3 = -1;
    }

    public final void Y3(int i10) {
        this.f22153n = i10;
    }

    public final boolean Z0(MotionEvent motionEvent) {
        if (this.f22273v7.isSponsored() && this.f22273v7.sponsoredCanReport) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f10 = x10;
                if (f10 >= this.C2 - AndroidUtilities.dp(6.0f) && f10 <= this.C2 + this.A2 + AndroidUtilities.dp(6.0f)) {
                    float f11 = z22;
                    if (f11 >= this.D2 - AndroidUtilities.dp(2.0f) && f11 <= this.D2 + this.B2 + AndroidUtilities.dp(2.0f)) {
                        rc rcVar = this.F2;
                        if (rcVar != null) {
                            rcVar.c(true);
                        }
                        this.E2 = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.E2) {
                k1 k1Var = this.Gc;
                if (k1Var != null) {
                    k1Var.V1();
                }
                rc rcVar2 = this.F2;
                if (rcVar2 != null) {
                    rcVar2.c(false);
                }
                playSoundEffect(0);
                this.E2 = false;
            }
        }
        return false;
    }

    public final void Z1(Canvas canvas, RectF rectF) {
        float f10;
        Path path = this.B5;
        path.rewind();
        path.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        nh.y2 y2Var = this.P0;
        float alpha = y2Var.getAlpha();
        if (this.f22273v7.isRoundOnce()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        y2Var.setAlpha(f10 * alpha);
        y2Var.draw(canvas);
        y2Var.setAlpha(alpha);
        canvas.restore();
        Paint M2 = M2("paintChatTimeBackground");
        int alpha2 = M2.getAlpha();
        M2.setAlpha((int) (alpha2 * this.f22116k5 * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, M2);
        M2.setAlpha(alpha2);
    }

    public final void Z3(int i10, int i11) {
        org.telegram.ui.ActionBar.g5 g5Var;
        this.G0 = i10;
        this.H0 = i11;
        this.Qc = i11;
        if ((this.f22273v7 != null && R2() && this.f22273v7.shouldDrawWithoutBackground()) || ((g5Var = this.f22205q8) != null && g5Var.f19714a != null)) {
            invalidate();
        }
    }

    @Override
    public final boolean a() {
        MessageObject.GroupedMessages groupedMessages = this.H;
        if ((groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) && getAlpha() != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean a1(MotionEvent motionEvent) {
        i1 i1Var;
        z zVar;
        if (this.I5 && ((!this.f22180od || getVideoTranscriptionProgress() > 0.0f || this.D3) && (i1Var = this.J5) != null)) {
            int action = motionEvent.getAction();
            float x10 = motionEvent.getX();
            float z22 = z2(motionEvent);
            if (action != 1 && action != 3) {
                if (i1Var.v.contains((int) x10, (int) z22)) {
                    if (action == 0) {
                        i1Var.A = true;
                    }
                    if (i1Var.A && (zVar = i1Var.f24136q) != null) {
                        zVar.setHotspot(x10, z22);
                        i1Var.f24136q.setState(d31.N);
                        i1Var.f24137r.invalidate();
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
        org.telegram.ui.Components.y5 animation;
        int i10;
        boolean z4;
        MessageObject messageObject = this.f22273v7;
        nh.y2 y2Var = this.P0;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = y2Var.getAnimation()) != null && (i10 = animation.d[4]) > 0) {
            float clamp01 = 1.0f - Utilities.clamp01(((i10 - 90) - animation.o()) / 500.0f);
            if (clamp01 > 0.0f) {
                if (clamp01 < 1.0f) {
                    z4 = y2Var.draw(canvas);
                } else {
                    z4 = true;
                }
                y2Var.setForceNotMedia(true);
                float alpha = y2Var.getAlpha();
                y2Var.setAlpha(clamp01 * alpha);
                y2Var.draw(canvas);
                y2Var.setAlpha(alpha);
                y2Var.setForceNotMedia(false);
                return z4;
            }
        }
        return y2Var.draw(canvas);
    }

    public final void a3() {
        k1 k1Var = this.Gc;
        if (k1Var != null && k1Var.e()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void a4(float f10, float f11, boolean z4) {
        boolean z10;
        if (this.h != z4) {
            this.h = z4;
            F0();
            if (z4) {
                invalidate();
            }
        }
        nh.y2 y2Var = this.P0;
        float imageY = f10 - y2Var.getImageY();
        float measuredHeight = f11 - (getMeasuredHeight() - y2Var.getImageY2());
        float imageHeight = y2Var.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        if (imageHeight / y2Var.getImageHeight() < 0.25f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22226s = z10;
        y2Var.setSkipUpdateFrame(z10);
    }

    @Override
    public final void b(float f10) {
        MessageObject messageObject = this.f22273v7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(this.f22273v7, f10);
        q4();
    }

    public final boolean b1() {
        MessageObject messageObject = this.f22273v7;
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
        k1 k1Var = this.Gc;
        int i12 = 0;
        if (k1Var != null) {
            if (!k1Var.d1(1, this)) {
                this.A5 = null;
                ArrayList arrayList = this.f22333z5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < this.f22333z5.size(); i13++) {
                        m1 m1Var = (m1) this.f22333z5.get(i13);
                        if (!m1Var.f21377a.c()) {
                            m1Var.f21377a.a();
                        }
                    }
                }
            } else {
                CharacterStyle R1 = this.Gc.R1(this);
                if (R1 != this.A5) {
                    this.A5 = R1;
                    i90 i90Var = this.f22319y5;
                    if (i90Var != null) {
                        i90Var.a();
                        this.f22319y5 = null;
                    }
                    i90 i90Var2 = new i90();
                    this.f22319y5 = i90Var2;
                    i90Var2.C = true;
                    y80 y80Var = new y80(0);
                    i90 i90Var3 = this.f22319y5;
                    i90Var3.f25651x = y80Var;
                    i90Var3.j(5.0f);
                    ?? obj = new Object();
                    obj.f21377a = this.f22319y5;
                    obj.f21378b = -3;
                    if (this.f22333z5 == null) {
                        this.f22333z5 = new ArrayList();
                    }
                    this.f22333z5.add(obj);
                    if (this.A5 != null && !r2(obj, y80Var, this.H2, -2) && (((textLayoutBlocks = this.Z3) == null || !s2(obj, y80Var, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.f22273v7) != null)) {
                        s2(obj, y80Var, messageObject.textLayoutBlocks);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f22333z5;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MessageObject messageObject2 = this.f22273v7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Mb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Ld;
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Fd);
            while (i12 < this.f22333z5.size()) {
                m1 m1Var2 = (m1) this.f22333z5.get(i12);
                if (m1Var2.f21378b == i10) {
                    i90 i90Var4 = m1Var2.f21377a;
                    i90Var4.f(org.telegram.ui.ActionBar.j6.l1(0.85f, v02), org.telegram.ui.ActionBar.j6.l1(2.0f, v02), org.telegram.ui.ActionBar.j6.l1(3.5f, v02), org.telegram.ui.ActionBar.j6.l1(6.0f, v02));
                    i90Var4.draw(canvas);
                    invalidate();
                    if (i90Var4.b()) {
                        this.f22333z5.remove(i12);
                        i12--;
                    }
                }
                i12++;
            }
        }
    }

    public final boolean b3() {
        if (this.f22244t5.d <= 0 && this.K.f14128s) {
            MessageObject messageObject = this.f22273v7;
            if (messageObject == null || !messageObject.preview) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b4(int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        RichMessageLayout richMessageLayout;
        s1 s1Var;
        MessageObject.TextLayoutBlock textLayoutBlock;
        MessageObject messageObject;
        this.Vd = i10;
        this.Xd = i11;
        this.Yd = i12;
        this.G0 = i13;
        this.H0 = i14;
        this.f21980ae = f11;
        this.Zd = f10;
        this.Qc = i14;
        this.Rc = i15;
        this.Sc = i16;
        this.Wd = i17;
        if ((!this.f22132l7.isEmpty() || (this.v != null && (messageObject = this.f22273v7) != null && messageObject.type == 27)) && this.Pc != f11) {
            invalidate();
        }
        this.Pc = f11;
        if (i12 != this.H0 || f10 != this.I0) {
            this.I0 = f10;
            this.H0 = i12;
        }
        if (this.f22273v7 != null && R2() && this.f22273v7.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.f22273v7;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i20 = i10 - this.f22168o0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                int size = this.f22273v7.textLayoutBlocks.size();
                s1Var = this.Wc;
                if (i21 >= size || this.f22273v7.textLayoutBlocks.get(i21).textYOffset(this.f22273v7.textLayoutBlocks, s1Var) > i20) {
                    break;
                }
                i22 = i21;
                i21++;
            }
            int i23 = -1;
            int i24 = -1;
            int i25 = 0;
            while (i22 < this.f22273v7.textLayoutBlocks.size()) {
                float textYOffset = this.f22273v7.textLayoutBlocks.get(i22).textYOffset(this.f22273v7.textLayoutBlocks, s1Var);
                float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(s1Var) + textLayoutBlock.padBottom;
                float f12 = i20;
                if (Z2(textYOffset, height, f12, i20 + i11)) {
                    if (i23 == -1) {
                        i23 = i22;
                    }
                    i25++;
                    i24 = i22;
                } else if (textYOffset > f12) {
                    break;
                }
                i22++;
            }
            if (this.f22329z0 == i24 && this.A0 == i23 && this.B0 == i25) {
                if (this.f22150mc != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 >= this.f22150mc.f28058a.size()) {
                            break;
                        }
                        org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.f22150mc.f28058a.get(i26);
                        if (p5Var != null && p5Var.f27743n) {
                            float y10 = (0.0f - getY()) - p5Var.f27744r;
                            float y11 = (this.f22153n - getY()) - p5Var.f27744r;
                            Rect rect = p5Var.e;
                            if (rect.bottom >= y10 && rect.top <= y11) {
                                invalidate();
                                break;
                            }
                        }
                        i26++;
                    }
                }
            } else {
                this.f22329z0 = i24;
                this.A0 = i23;
                this.B0 = i25;
                invalidate();
            }
        }
        MessageObject messageObject3 = this.f22273v7;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i27 = i10 - this.f22168o0;
            int i28 = -1;
            int i29 = -1;
            for (int i30 = 0; i30 < richMessageLayout.blocks.size(); i30++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i30);
                if (richBlock.currVisible || richBlock.prevVisible) {
                    float f13 = richBlock.currY;
                    float f14 = i27 + i11;
                    if (Z2(f13, richBlock.getHeight() + f13, i27, f14)) {
                        if (i28 == -1) {
                            i28 = i30;
                        }
                        i29 = i30;
                    } else if (f13 > f14) {
                        break;
                    }
                }
            }
            if (this.C0 != i28 || this.D0 != i29) {
                this.C0 = i28;
                this.D0 = i29;
                invalidate();
            }
        }
        ArrayList arrayList = this.V5;
        if (!arrayList.isEmpty()) {
            int i31 = -1;
            int i32 = -1;
            for (int i33 = 0; i33 < arrayList.size(); i33++) {
                r1 r1Var = (r1) arrayList.get(i33);
                int i34 = r1Var.f21599b + this.Ic;
                if (Z2(i34, i34 + r1Var.f21600c, this.Vd, i19 + this.Xd)) {
                    if (i32 == -1) {
                        i32 = i33;
                    }
                    i31 = i33;
                }
            }
            if (this.f22060g6 != i31 || this.f22046f6 != i32) {
                this.f22060g6 = i31;
                this.f22046f6 = i32;
                invalidate();
            }
        }
        if (this.f22276va) {
            if (Math.abs(this.Ga - Math.max(Math.min(AndroidUtilities.dp(4.0f) + (-this.Wd), this.Ea - AndroidUtilities.dp(42.0f)), AndroidUtilities.dp(8.0f) + getPaddingTop())) >= 1.0f) {
                invalidate();
            }
        }
        mg.r0 r0Var = this.K;
        int i35 = r0Var.d;
        boolean Z2 = Z2(i35, i35 + r0Var.f14124o, this.Vd, i18 + this.Xd);
        if (this.f22089i6 != Z2) {
            this.f22089i6 = Z2;
            invalidate();
        }
    }

    @Override
    public final void c(boolean z4, boolean z10) {
        this.f22123kc = z4;
        if (z4) {
            this.f22137lc = z10;
        } else {
            this.f22137lc = false;
        }
    }

    public final boolean c1(float f10, int i10) {
        mg.r0 r0Var = this.K;
        if (!r0Var.K) {
            return false;
        }
        float y10 = getY() + r0Var.d;
        if (y10 <= f10 || (y10 + r0Var.f14124o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public void c2(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.c2(android.graphics.Canvas):void");
    }

    public final void c3() {
        if (this.H != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    public final void c4() {
        int i10;
        int i11;
        int i12;
        if (this.f22273v7.isOutOwner()) {
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.f20099o2;
            int i13 = org.telegram.ui.ActionBar.j6.f19947fc;
            textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Fd));
            org.telegram.ui.ActionBar.j6.f20259x2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Fd));
            org.telegram.ui.ActionBar.j6.f20117p2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Fd));
            org.telegram.ui.ActionBar.j6.f20136q2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Fd));
            org.telegram.ui.ActionBar.j6.f20154r2.setColor(org.telegram.ui.ActionBar.j6.v0(i13, this.Fd));
            TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.f20259x2;
            TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.f19848a3;
            TextPaint textPaint5 = org.telegram.ui.ActionBar.j6.f20099o2;
            TextPaint textPaint6 = org.telegram.ui.ActionBar.j6.f20117p2;
            TextPaint textPaint7 = org.telegram.ui.ActionBar.j6.f20136q2;
            TextPaint textPaint8 = org.telegram.ui.ActionBar.j6.f20154r2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19983hc, this.Fd);
            textPaint8.linkColor = v02;
            textPaint7.linkColor = v02;
            textPaint6.linkColor = v02;
            textPaint5.linkColor = v02;
            textPaint4.linkColor = v02;
            textPaint3.linkColor = v02;
            textPaint2.linkColor = v02;
        } else {
            TextPaint textPaint9 = org.telegram.ui.ActionBar.j6.f20099o2;
            int i14 = org.telegram.ui.ActionBar.j6.f19929ec;
            textPaint9.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Fd));
            org.telegram.ui.ActionBar.j6.f20259x2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Fd));
            org.telegram.ui.ActionBar.j6.f20117p2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Fd));
            org.telegram.ui.ActionBar.j6.f20136q2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Fd));
            org.telegram.ui.ActionBar.j6.f20154r2.setColor(org.telegram.ui.ActionBar.j6.v0(i14, this.Fd));
            TextPaint textPaint10 = org.telegram.ui.ActionBar.j6.f20259x2;
            TextPaint textPaint11 = org.telegram.ui.ActionBar.j6.Z2;
            TextPaint textPaint12 = org.telegram.ui.ActionBar.j6.f19848a3;
            TextPaint textPaint13 = org.telegram.ui.ActionBar.j6.f20099o2;
            TextPaint textPaint14 = org.telegram.ui.ActionBar.j6.f20117p2;
            TextPaint textPaint15 = org.telegram.ui.ActionBar.j6.f20136q2;
            TextPaint textPaint16 = org.telegram.ui.ActionBar.j6.f20154r2;
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, this.Fd);
            textPaint16.linkColor = v03;
            textPaint15.linkColor = v03;
            textPaint14.linkColor = v03;
            textPaint13.linkColor = v03;
            textPaint12.linkColor = v03;
            textPaint11.linkColor = v03;
            textPaint10.linkColor = v03;
        }
        if (this.I1 != null) {
            int i15 = this.H1;
            d1 d1Var = this.D5;
            if (i15 != 3 && i15 != 7) {
                if (i15 == 5) {
                    if (this.f22273v7.isOutOwner()) {
                        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20249wb, this.Fd);
                        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20268xb, this.Fd);
                        int i16 = org.telegram.ui.ActionBar.j6.zb;
                        d1Var.h(v04, v05, org.telegram.ui.ActionBar.j6.v0(i16, this.Fd), org.telegram.ui.ActionBar.j6.v0(i16, this.Fd), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20286yb, this.Fd));
                    } else if (this.f22027e2 && this.X9 != null) {
                        int c3 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20214ud, this.Fd), this.X9.h());
                        int c10 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20232vd, this.Fd), this.X9.h());
                        int i17 = org.telegram.ui.ActionBar.j6.f20270xd;
                        d1Var.h(c3, c10, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Fd), this.X9.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i17, this.Fd), this.X9.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20251wd, this.Fd), this.X9.h()));
                    } else {
                        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20214ud, this.Fd);
                        int v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20232vd, this.Fd);
                        int i18 = org.telegram.ui.ActionBar.j6.f20270xd;
                        d1Var.h(v06, v07, org.telegram.ui.ActionBar.j6.v0(i18, this.Fd), org.telegram.ui.ActionBar.j6.v0(i18, this.Fd), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20251wd, this.Fd));
                    }
                }
            } else {
                boolean isOutOwner = this.f22273v7.isOutOwner();
                mo0 mo0Var = this.E5;
                if (isOutOwner) {
                    int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ab, this.Fd);
                    int v09 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cb, this.Fd);
                    int v010 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bb, this.Fd);
                    mo0Var.f27095p = v08;
                    mo0Var.f27096q = v09;
                    mo0Var.f27097r = v010;
                    int v011 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20249wb, this.Fd);
                    int v012 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20268xb, this.Fd);
                    int i19 = org.telegram.ui.ActionBar.j6.zb;
                    d1Var.h(v011, v012, org.telegram.ui.ActionBar.j6.v0(i19, this.Fd), org.telegram.ui.ActionBar.j6.v0(i19, this.Fd), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20286yb, this.Fd));
                } else if (this.f22027e2 && this.X9 != null) {
                    int c11 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20288yd, this.Fd), this.X9.h());
                    int c12 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Fd), this.X9.h());
                    int c13 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zd, this.Fd), this.X9.h());
                    mo0Var.f27095p = c11;
                    mo0Var.f27096q = c12;
                    mo0Var.f27097r = c13;
                    int c14 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20214ud, this.Fd), this.X9.h());
                    int c15 = org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20232vd, this.Fd), this.X9.h());
                    int i20 = org.telegram.ui.ActionBar.j6.f20270xd;
                    d1Var.h(c14, c15, org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Fd), this.X9.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(i20, this.Fd), this.X9.h()), org.telegram.ui.ActionBar.j6.c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20251wd, this.Fd), this.X9.h()));
                } else {
                    int v013 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20288yd, this.Fd);
                    int v014 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ad, this.Fd);
                    int v015 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zd, this.Fd);
                    mo0Var.f27095p = v013;
                    mo0Var.f27096q = v014;
                    mo0Var.f27097r = v015;
                    int v016 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20214ud, this.Fd);
                    int v017 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20232vd, this.Fd);
                    int i21 = org.telegram.ui.ActionBar.j6.f20270xd;
                    d1Var.h(v016, v017, org.telegram.ui.ActionBar.j6.v0(i21, this.Fd), org.telegram.ui.ActionBar.j6.v0(i21, this.Fd), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20251wd, this.Fd));
                }
            }
        }
        MessageObject messageObject = this.f22273v7;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = org.telegram.ui.ActionBar.j6.T2;
            int v018 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, this.Fd);
            if (f3()) {
                if (this.f22273v7.isOutOwner()) {
                    i12 = org.telegram.ui.ActionBar.j6.f20090nb;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f20109od;
                }
            } else if (this.f22273v7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.sb;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f20091nd;
            }
            textPaint17.setColor(i0.a.d(getVideoTranscriptionProgress(), v018, org.telegram.ui.ActionBar.j6.v0(i12, this.Fd)));
        } else if (this.f22077h8) {
            if (messageObject.shouldDrawWithoutBackground()) {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, this.Fd));
            } else {
                org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20038kd, this.Fd));
            }
        } else if (messageObject.isOutOwner()) {
            TextPaint textPaint18 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i11 = org.telegram.ui.ActionBar.j6.f20090nb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.sb;
            }
            textPaint18.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.Fd));
        } else {
            TextPaint textPaint19 = org.telegram.ui.ActionBar.j6.T2;
            if (f3()) {
                i10 = org.telegram.ui.ActionBar.j6.f20109od;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20091nd;
            }
            textPaint19.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.Fd));
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
    public final void d(float f10) {
        MessageObject messageObject = this.f22273v7;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f10);
        q4();
    }

    public final boolean d1() {
        return FileLoader.getInstance(this.F7).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public void d2(Canvas canvas, float f10, Integer num) {
        boolean z4;
        boolean z10 = this.f22166nd;
        float f11 = 1.0f;
        mg.r0 r0Var = this.K;
        if (z10) {
            r0Var.f14113a = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.f22089i6 && V2()) {
            if (r0Var.f14113a > 0.0f) {
                p0();
            }
            if (getAlpha() * f10 != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (getAlpha() * f10 * 255.0f), 31);
                z4 = true;
            } else {
                z4 = false;
            }
            float f12 = r0Var.f14113a;
            s1 s1Var = this.Wc;
            if (f12 <= 0.0f && s1Var.f21910w0 && this.I == null && !this.f22166nd) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f21852i0);
                r0Var.D = 0.0f;
                r0Var.E = false;
                if (s1Var.f21842g) {
                    f11 = s1Var.K1;
                }
                r0Var.d(canvas, f11, num);
                canvas.restore();
            } else {
                r0Var.D = 0.0f;
                r0Var.E = false;
                if (s1Var.f21842g) {
                    f11 = s1Var.K1;
                }
                r0Var.d(canvas, f11, num);
            }
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final boolean d3() {
        return this.J0;
    }

    public final boolean d4() {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.preview && !messageObject.isSponsored()) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if ((groupedMessagePosition == null || ((groupedMessages = this.H) != null && groupedMessages.isDocuments && (groupedMessagePosition.flags & 8) == 0)) && !this.Wc.f21910w0) {
                if (!this.f22297x || !this.f22273v7.isVoice()) {
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
            TLRPC.User user = this.Vb;
            if (user != null && user.f19331id == ((Long) objArr[0]).longValue()) {
                setAvatar(this.f22273v7);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.didUpdatePremiumGiftStickers && (messageObject = this.f22273v7) != null) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
                X3(messageObject, this.H, this.C, this.B, this.D, false);
            }
        }
    }

    @Override
    public final void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    public final void e1(Bitmap bitmap, boolean z4) {
        boolean isVideo = this.f22273v7.isVideo();
        nh.y2 y2Var = this.P0;
        if (isVideo) {
            if (MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                y2Var.setAllowStartAnimation(false);
                y2Var.stopAnimation();
                return;
            }
            y2Var.setAllowStartAnimation(true);
            y2Var.startAnimation();
            return;
        }
        if (z4) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        y2Var.setAllowStartAnimation(z4);
        if (bitmap != null) {
            y2Var.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z4) {
            y2Var.startAnimation();
        } else {
            y2Var.stopAnimation();
        }
    }

    public final boolean e2(Canvas canvas) {
        boolean z4 = this.f22166nd;
        float f10 = 1.0f;
        mg.r0 r0Var = this.K;
        if (z4) {
            r0Var.f14113a = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z10 = false;
        if (!this.f22089i6 || !V2()) {
            return false;
        }
        if (r0Var.f14113a > 0.0f) {
            p0();
        }
        if (getAlpha() * 1.0f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
            z10 = true;
        }
        float f11 = r0Var.f14113a;
        s1 s1Var = this.Wc;
        if (f11 <= 0.0f && s1Var.f21910w0 && this.I == null && !this.f22166nd) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + s1Var.f21852i0);
            if (s1Var.f21842g) {
                f10 = s1Var.K1;
            }
            r0Var.e(canvas, f10);
            canvas.restore();
        } else {
            if (s1Var.f21842g) {
                f10 = s1Var.K1;
            }
            r0Var.e(canvas, f10);
        }
        if (z10) {
            canvas.restore();
        }
        return true;
    }

    public final boolean e3(MessageObject messageObject) {
        int i10 = MessageObject.getMedia(this.f22273v7.messageOwner).period;
        int currentTime = ConnectionsManager.getInstance(this.F7).getCurrentTime();
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
        if ((this.H == null || (this.I.flags & 4) != 0) && !this.f22027e2) {
            MessageObject messageObject = this.f22273v7;
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
    public final void f(TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        k1 k1Var = this.Gc;
        if (k1Var != null) {
            k1Var.v2(this, reactionCount, z4, f10, f11);
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
            canvas2.translate(this.f22111k0, this.f22168o0);
            richMessageLayout.drawOverlay(canvas2, colorFilter);
            canvas2.restoreToCount(save);
        }
    }

    public boolean f3() {
        if (((isPressed() && this.f22091i8) || ((!this.f22091i8 && this.f21989b8) || this.f22003c8)) && !j4() && !W2()) {
            MessageObject messageObject = this.f22273v7;
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

    public final int g1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4) {
        nh.y2 y2Var = this.P0;
        y2Var.setIgnoreImageSet(true);
        ImageReceiver imageReceiver = this.f22106j9;
        imageReceiver.setIgnoreImageSet(true);
        ImageReceiver imageReceiver2 = this.C9;
        imageReceiver2.setIgnoreImageSet(true);
        ImageReceiver imageReceiver3 = this.f22177o9;
        imageReceiver3.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.te = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i11);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    V3(messageObject2, groupedMessages, false, false, false, false);
                    if (z4 && !TextUtils.isEmpty(this.f21999c4)) {
                        n4();
                        this.te = (int) (i10 + this.f22158n4);
                        this.f22265ue = this.Z3;
                    }
                    i10 = this.f22182p0 + this.f22212r0 + i10;
                }
            }
            return i10;
        }
        V3(messageObject, groupedMessages, false, false, false, false);
        y2Var.setIgnoreImageSet(false);
        imageReceiver.setIgnoreImageSet(false);
        imageReceiver2.setIgnoreImageSet(false);
        imageReceiver3.setIgnoreImageSet(false);
        n4();
        return this.f22182p0 + this.f22212r0;
    }

    public final void g2(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.g2(android.graphics.Canvas):void");
    }

    public final boolean g3() {
        if (!this.f22055g1 && !this.f22018d8 && !this.f22003c8) {
            return false;
        }
        return true;
    }

    public final void g4(int i10, boolean z4, boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (i10 == -1 || i10 == 0) {
            if (this.U6 != z4) {
                this.U6 = z4;
                if (!z10) {
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    this.V6 = f10;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i10 != -1 && i10 != 1) || this.f22090i7 == z4) {
            return;
        }
        this.f22090i7 = z4;
        if (!z10) {
            if (z4) {
                f11 = 1.0f;
            }
            this.f22104j7 = f11;
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
        return this.f22110je;
    }

    @Override
    public float getAlpha() {
        if (this.Uc) {
            return this.Vc;
        }
        return super.getAlpha();
    }

    public org.telegram.ui.Components.u5[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.getAnimatedEmojiSpans():org.telegram.ui.Components.u5[]");
    }

    public float getAnimationOffsetX() {
        return this.f22296we;
    }

    public ImageReceiver getAvatarImage() {
        if (this.f22133l8) {
            return this.f22106j9;
        }
        return null;
    }

    public ra0 getBackgroundDrawable() {
        return this.Hc;
    }

    public int getBackgroundDrawableBottom() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        int i11 = 0;
        if (groupedMessagePosition != null) {
            int i12 = 4;
            if ((groupedMessagePosition.flags & 4) == 0) {
                i10 = AndroidUtilities.dp(3.0f);
            } else {
                i10 = 0;
            }
            if ((this.I.flags & 8) == 0) {
                MessageObject messageObject = this.f22273v7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i12 = 3;
                }
                i10 += AndroidUtilities.dp(i12);
            }
        } else {
            i10 = 0;
        }
        boolean z4 = this.G;
        if (!z4 || !this.F) {
            if (z4) {
                i11 = AndroidUtilities.dp(1.0f);
            } else {
                i11 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.J8) - i11) + i10;
        if (!this.f22077h8) {
            if (this.F) {
                backgroundDrawableTop += AndroidUtilities.dp(1.0f);
            }
            if (this.G) {
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
        float f10 = 9.0f;
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.f22166nd) {
                return (this.I8 - this.G8) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            int i12 = this.I8 - this.G8;
            if (this.f22077h8) {
                i11 = AndroidUtilities.dp(9.0f);
            }
            return i12 - i11;
        }
        float f11 = 71.0f;
        if (this.f22166nd) {
            if (!q3()) {
                if ((this.K7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f22133l8) {
                    i11 = 48;
                }
                f11 = i11 + 3;
            }
            dp = AndroidUtilities.dp(f11) + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
        } else {
            if (!q3()) {
                if ((this.K7 || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.f22133l8) {
                    i11 = 48;
                }
                f11 = i11;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (!this.f22077h8) {
                f10 = 3.0f;
            }
            dp = dp2 + AndroidUtilities.dp(f10);
        }
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i10 = this.I.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i10 / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.f22166nd) {
            if (this.G) {
                return dp + ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
        } else if (!this.f22077h8 && this.G) {
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
        int i11 = this.G8;
        if (this.f22166nd) {
            i10 = i11 - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.G && (messageObject2 = this.f22273v7) != null && messageObject2.isOutOwner()) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            if (this.G && ((messageObject = this.f22273v7) == null || !messageObject.isOutOwner())) {
                i10 = (int) (i10 - ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(6.0f)));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            if (this.f22077h8) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(3.0f);
            }
            i10 = i11 - dp;
            if (!this.f22077h8 && this.G) {
                i10 -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + i10;
    }

    public int getBackgroundDrawableTop() {
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        int i11 = 0;
        if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) == 0) {
            i10 = 0 - AndroidUtilities.dp(3.0f);
        } else {
            i10 = 0;
        }
        if (!this.F) {
            i11 = AndroidUtilities.dp(1.0f);
        }
        int i12 = i10 + i11;
        if (!this.f22077h8 && this.F) {
            return i12 - AndroidUtilities.dp(1.0f);
        }
        return i12;
    }

    public int getBackgroundHeight() {
        return this.Qc;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.Q0;
    }

    public int getBottomActionPadding() {
        s1 s1Var = this.Wc;
        if (s1Var.B1) {
            return AndroidUtilities.lerp(s1Var.A1, this.f21967a0, s1Var.K1);
        }
        return this.f21967a0;
    }

    @Override
    public int getBoundsLeft() {
        boolean z4;
        int i10;
        int i11;
        float f10;
        int dp;
        int i12;
        float f11;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.isOutOwner()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3()) {
            if (this.I != null) {
                f11 = 73.0f;
            } else {
                MessageObject messageObject2 = this.f22273v7;
                if (messageObject2 != null && messageObject2.isRepostPreview) {
                    i12 = 42;
                } else {
                    i12 = 63;
                }
                f11 = i12;
            }
            i10 = AndroidUtilities.dp(f11);
        } else {
            i10 = 0;
        }
        if (z4 && (M0(this.f22273v7) || this.I5)) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - i10) - i11;
        ArrayList arrayList = this.f22132l7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.f22273v7;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                int i13 = this.f22234s8;
                if (!this.f22077h8 && !this.G) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                dp = i13 + AndroidUtilities.dp(f10);
            }
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                i14 = Math.max(i14, ((int) (((e0) arrayList.get(i15)).f20964c * widthForButtons)) + dp);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, i14);
        }
        if (this.P != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.P.l()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f21981b0 != null) {
            backgroundDrawableLeft = Math.min(this.F8, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int i10;
        float f10;
        int dp;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.isOutOwner() && (M0(this.f22273v7) || this.I5)) {
            i10 = AndroidUtilities.dp(48.0f);
        } else {
            i10 = 0;
        }
        int backgroundDrawableRight = getBackgroundDrawableRight() + i10;
        ArrayList arrayList = this.f22132l7;
        if (arrayList != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.f22273v7;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                int i11 = this.f22234s8;
                if (!this.f22077h8 && !this.G) {
                    f10 = 7.0f;
                } else {
                    f10 = 1.0f;
                }
                dp = i11 + AndroidUtilities.dp(f10);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                float f11 = widthForButtons;
                i12 = Math.max(i12, ((int) (e0Var.f20964c * f11)) + dp + ((int) (e0Var.e * f11)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, i12);
        }
        if (this.P != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((this.P.l() + getParentWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.f21981b0 != null) {
            return Math.max(backgroundDrawableRight, getWidth());
        }
        return backgroundDrawableRight;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.Z3;
    }

    public float getCaptionX() {
        s1 s1Var = this.Wc;
        if (s1Var.f21910w0) {
            if (s1Var.C0) {
                this.f22143m4 += s1Var.f21843g0;
            } else if (s1Var.f21895s0) {
                float f10 = this.f22143m4;
                float f11 = s1Var.K1;
                this.f22143m4 = e2.c.w(1.0f, f11, s1Var.f21887q0, f10 * f11);
            } else if (!this.f22273v7.isVoice() || !TextUtils.isEmpty(this.f22273v7.caption)) {
                this.f22143m4 += s1Var.f21843g0;
            }
        }
        return this.f22143m4;
    }

    public float getCaptionY() {
        float f10 = this.f22158n4;
        s1 s1Var = this.Wc;
        if (s1Var.f21910w0) {
            if (s1Var.C0) {
                return f10 - getTranslationY();
            }
            if (s1Var.f21895s0) {
                float f11 = s1Var.K1;
                return e2.c.w(1.0f, f11, s1Var.f21891r0, f10 * f11);
            }
            return f10;
        }
        return f10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.f22155n1;
    }

    public int getChecksX() {
        float f10;
        int i10 = this.I8;
        if (SharedConfig.bubbleRadius >= 10) {
            f10 = 27.3f;
        } else {
            f10 = 25.3f;
        }
        return i10 - AndroidUtilities.dp(f10);
    }

    public int getChecksY() {
        float f10;
        int intrinsicHeight;
        if (this.f22273v7.shouldDrawWithoutBackground()) {
            f10 = this.f22122kb;
            intrinsicHeight = L2("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f10 = this.f22122kb;
            intrinsicHeight = org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight();
        }
        return (int) (f10 - intrinsicHeight);
    }

    public int getCurrentBackgroundLeft() {
        org.telegram.ui.ActionBar.g5 g5Var = this.f22205q8;
        if (g5Var == null) {
            return 0;
        }
        int i10 = g5Var.getBounds().left;
        if (!this.f22273v7.isOutOwner() && this.Wc.f21922z0 != 1.0f) {
            boolean z4 = this.f22166nd;
            if ((z4 || !this.f22077h8) && !this.G) {
                if (z4) {
                    return (int) (i10 - (getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)));
                }
                return i10 - AndroidUtilities.dp(6.0f);
            }
            return i10;
        }
        return i10;
    }

    public int getCurrentBackgroundRight() {
        boolean z4;
        org.telegram.ui.ActionBar.g5 g5Var = this.f22205q8;
        if (g5Var == null) {
            return getWidth();
        }
        int i10 = g5Var.getBounds().right;
        if (this.f22273v7.isOutOwner() && this.Wc.f21922z0 != 1.0f && (((z4 = this.f22166nd) || !this.f22077h8) && !this.G)) {
            if (z4) {
                return (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(6.0f)) + i10);
            }
            return AndroidUtilities.dp(6.0f) + i10;
        }
        return i10;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.Wb;
    }

    public MessageObject.GroupedMessages getCurrentMessagesGroup() {
        return this.H;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return this.I;
    }

    public TLRPC.User getCurrentUser() {
        return this.Vb;
    }

    public k1 getDelegate() {
        return this.Gc;
    }

    @Override
    public float getDeltaBottom() {
        return this.Wc.f21852i0;
    }

    public float getDeltaLeft() {
        return this.Wc.f21843g0;
    }

    public float getDeltaRight() {
        return this.Wc.f21847h0;
    }

    public float getDeltaTop() {
        return this.Wc.f21857j0;
    }

    public float getDescriptionLayoutX() {
        int dp;
        int extraTextX;
        float f10;
        float dp2;
        int i10;
        int dp3;
        int i11;
        boolean z4 = this.f22056g2;
        float f11 = 0.0f;
        s1 s1Var = this.Wc;
        if (z4) {
            AndroidUtilities.dp(14.0f);
            dp2 = this.f22126l0 - AndroidUtilities.dp(10.0f);
        } else {
            if (this.f22071h2) {
                AndroidUtilities.dp(14.0f);
                i10 = this.f22126l0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else if (this.f22273v7.isSponsored()) {
                AndroidUtilities.dp(2.0f);
                i10 = this.f22126l0;
                dp3 = AndroidUtilities.dp(1.0f);
            } else {
                float f12 = 12.0f;
                if (this.f22273v7.isOutOwner()) {
                    f10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f22234s8;
                    if (this.f22273v7.type == 19) {
                        f10 -= Math.max(0.0f, ((Math.max(this.G9, this.I9) + f10) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.f22077h8) {
                        dp = AndroidUtilities.dp(12.0f) + this.f22234s8;
                        extraTextX = getExtraTextX();
                    } else {
                        int i12 = this.f22234s8;
                        if (!this.G) {
                            f12 = 18.0f;
                        }
                        dp = AndroidUtilities.dp(f12) + i12;
                        extraTextX = getExtraTextX();
                    }
                    f10 = extraTextX + dp;
                }
                dp2 = (f10 + s1Var.f21843g0) - AndroidUtilities.dp(1.33f);
                float f13 = this.m0;
                if (s1Var.f21893r2) {
                    AndroidUtilities.lerp(s1Var.f21889q2, f13, s1Var.K1);
                }
            }
            dp2 = dp3 + i10;
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        if (s1Var != null) {
            f11 = s1Var.f21847h0;
        }
        float f14 = backgroundDrawableRight + f11;
        int i13 = 0;
        if (this.f22273v7.isOutOwner() && !this.f22077h8 && !this.G) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        int dp4 = (int) (((f14 - AndroidUtilities.dp(10 + i11)) - getExtraTextX()) - dp2);
        float dp5 = dp2 + AndroidUtilities.dp(10.0f);
        if (Math.abs(this.f22199q2) > 1) {
            i13 = ((dp4 - AndroidUtilities.dp(20.0f)) - this.f22184p2) - this.f22199q2;
        }
        return dp5 + i13;
    }

    public float getDescriptionLayoutY() {
        float f10;
        float f11 = this.f22127l2;
        s1 s1Var = this.Wc;
        if (!s1Var.f21893r2) {
            f10 = (-s1Var.f21857j0) + s1Var.f21852i0;
        } else {
            f10 = 0.0f;
        }
        return f11 + f10;
    }

    public StaticLayout getDescriptionlayout() {
        return this.H2;
    }

    public TLRPC.TL_availableEffect getEffect() {
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        if ((groupedMessagePosition != null && !groupedMessagePosition.last) || (messageObject = this.f22273v7) == null) {
            return null;
        }
        return messageObject.getEffect();
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.f22029e4;
    }

    public float getExplanationX() {
        return this.X6;
    }

    public float getExplanationY() {
        return this.Y6;
    }

    public int getExtraInsetHeight() {
        float f10;
        int i10;
        int i11 = this.f22201q4;
        boolean z4 = this.K1;
        mg.r0 r0Var = this.K;
        if (z4) {
            if (r0Var.f14128s) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            i11 += AndroidUtilities.dp(i10 + 2) + this.f21998c2;
        }
        if (this.f22063g9) {
            if (f4()) {
                f10 = 41.3f;
            } else {
                f10 = 43.0f;
            }
            i11 += AndroidUtilities.dp(f10);
        }
        if (!r0Var.f14128s && this.f22273v7.shouldDrawReactionsInLayout()) {
            return i11 + r0Var.f14125p;
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
        return this.P1;
    }

    public String getFilename() {
        int i10;
        int i11;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            int i12 = messageObject.type;
            if (i12 == 1) {
                TLRPC.PhotoSize photoSize = this.f21986b5;
                if (photoSize != null) {
                    return FileLoader.getAttachFileName(photoSize);
                }
                return null;
            } else if (i12 != 8 && (i11 = this.H1) != 7 && i11 != 4 && i11 != 8 && i12 != 9 && i11 != 3 && i11 != 5) {
                if (i11 != 0) {
                    return FileLoader.getAttachFileName(this.I1);
                }
                TLRPC.PhotoSize photoSize2 = this.f21986b5;
                if (photoSize2 != null) {
                    return FileLoader.getAttachFileName(photoSize2);
                }
                return null;
            } else if (!messageObject.useCustomPhoto) {
                if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    return this.f22273v7.messageOwner.attachPath;
                }
                if (this.f22273v7.isSendError() && (i10 = this.H1) != 3 && i10 != 5) {
                    return null;
                }
                return this.f22273v7.getFileName();
            } else {
                return null;
            }
        }
        return null;
    }

    public int getForwardNameCenterX() {
        float f10;
        TLRPC.User user = this.Vb;
        if (user != null && user.f19331id == 0) {
            f10 = this.f22106j9.getCenterX();
        } else {
            f10 = this.f22050fb + this.E1;
        }
        return (int) f10;
    }

    public float getHighlightAlpha() {
        return B2(false);
    }

    public float getLastTouchX() {
        return this.f22011d1;
    }

    public float getLastTouchY() {
        return this.f22026e1;
    }

    public int getLayoutHeight() {
        return this.J8;
    }

    public int getMaxNameWidth() {
        int min;
        int dp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i10;
        int i11;
        float f10;
        int dp2;
        int parentWidth;
        int i12 = this.H1;
        if (i12 != 6 && i12 != 8 && (i10 = (messageObject2 = this.f22273v7).type) != 5) {
            MessageObject.GroupedMessages groupedMessages = this.H;
            int i13 = 0;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = getParentWidth();
                }
                i11 = 0;
                for (int i14 = 0; i14 < this.H.posArray.size(); i14++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.H.posArray.get(i14);
                    if (groupedMessagePosition.minY != 0) {
                        break;
                    }
                    i11 = (int) (Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * parentWidth) + i11);
                }
                if (this.C8) {
                    i13 = 71;
                } else if (z3()) {
                    i13 = 48;
                }
                dp2 = AndroidUtilities.dp(i13 + 31);
            } else if (i10 == 19) {
                int i15 = messageObject2.textWidth;
                int dp3 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f);
                if (this.f22133l8) {
                    i13 = AndroidUtilities.dp(48.0f);
                }
                return Math.max(i15, (int) ((dp3 - i13) * 0.5f));
            } else {
                i11 = this.G8;
                if (messageObject2.isSaved && messageObject2.isOutOwner() && M0(this.f22273v7)) {
                    i11 -= AndroidUtilities.dp(25.0f);
                }
                if (this.f22077h8) {
                    f10 = 22.0f;
                } else {
                    f10 = 31.0f;
                }
                dp2 = AndroidUtilities.dp(f10);
            }
            return i11 - dp2;
        }
        float f11 = 0.0f;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            if (this.C8) {
                f11 = 71.0f;
            } else if (z3()) {
                f11 = 42.0f;
            }
            dp = AndroidUtilities.dp(f11);
        } else {
            min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
            if (this.C8) {
                f11 = 71.0f;
            } else if (z3()) {
                f11 = 42.0f;
            }
            dp = AndroidUtilities.dp(f11);
        }
        int i16 = min - dp;
        MessageObject messageObject3 = this.f22273v7;
        if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && M0(this.f22273v7)) {
            i16 -= AndroidUtilities.dp(25.0f);
        }
        if (this.f22180od && ((messageObject = this.f22273v7) == null || !messageObject.isVoiceTranscriptionOpen())) {
            return (i16 - (this.G8 - (AndroidUtilities.roundPlayingMessageSize(this.C8) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
        }
        if (this.C8 && (this.f22273v7.type == 5 || this.H1 == 6)) {
            return this.G8 - AndroidUtilities.dp(57.0f);
        }
        return (i16 - this.G8) - AndroidUtilities.dp(57.0f);
    }

    public int getMediaOffsetY() {
        s1 s1Var = this.Wc;
        if (s1Var.Z1) {
            return AndroidUtilities.lerp(s1Var.Y1, this.f22113k2, s1Var.K1);
        }
        return this.f22113k2;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.f22289w7;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f22273v7;
    }

    public int getNameStatusX() {
        int i10;
        float f10 = this.Ta + this.Sa;
        int i11 = this.f22290w8;
        if (i11 > 0) {
            i10 = i11 - AndroidUtilities.dp(32.0f);
        } else {
            i10 = this.Ia;
        }
        return (int) (f10 + i10 + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        int height;
        float f10 = this.Ua;
        StaticLayout staticLayout = this.Ha;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        return (int) (f10 + (height / 2));
    }

    public int getNoSoundIconCenterX() {
        return this.D1;
    }

    @Override
    public int getObserverTag() {
        return this.E7;
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.S + this.f22025e0;
    }

    public int getParentWidth() {
        int i10;
        MessageObject messageObject = this.f22273v7;
        if (messageObject == null) {
            messageObject = this.f22289w7;
        }
        if (messageObject != null && messageObject.preview && (i10 = this.G0) > 0) {
            return i10;
        }
        return AndroidUtilities.displaySize.x;
    }

    public float getPhotoBottom() {
        k4 k4Var = this.C7;
        if (k4Var != null) {
            return k4Var.e + k4Var.h;
        }
        return this.P0.getImageY2();
    }

    public ImageReceiver getPhotoImage() {
        return this.P0;
    }

    public ArrayList<r1> getPollButtons() {
        return this.V5;
    }

    public float getPollButtonsLeft() {
        int dp;
        if (getMessageObject() != null && getMessageObject().isOutOwner()) {
            dp = (AndroidUtilities.dp(3.0f) + this.I8) - this.G8;
        } else if (this.D8) {
            dp = AndroidUtilities.dp(82.0f);
        } else if (z3()) {
            dp = AndroidUtilities.dp(59.0f);
        } else {
            dp = AndroidUtilities.dp(11.0f);
        }
        return dp;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.G8) - AndroidUtilities.dp(15.0f);
    }

    public MessageObject getPrimaryMessageObject() {
        MessageObject messageObject;
        MessageObject messageObject2 = this.f22273v7;
        if (messageObject2 != null && this.H != null && messageObject2.hasValidGroupId()) {
            messageObject = this.H.findPrimaryMessageObject();
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            return messageObject;
        }
        return this.f22273v7;
    }

    public RadialProgress2 getRadialProgress() {
        return this.L0;
    }

    public mg.r0 getReactionsLayout() {
        return this.K;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.Fd;
    }

    public mo0 getSeekBarWaveform() {
        return this.E5;
    }

    public float getSideButtonStartX() {
        return this.Da;
    }

    public float getSideButtonStartY() {
        return this.Ea;
    }

    @Override
    public float getSlidingOffsetX() {
        return this.f22280ve;
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        long j10;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.H;
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
        MessageObject messageObject3 = this.f22273v7;
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    public int getStarsPriceTopPadding() {
        s1 s1Var = this.Wc;
        if (s1Var.f21919y1) {
            return AndroidUtilities.lerp(s1Var.f21915x1, this.S, s1Var.K1);
        }
        return this.S;
    }

    public TLRPC.Document getStreamingMedia() {
        int i10 = this.H1;
        if (i10 != 4 && i10 != 7 && i10 != 2) {
            return null;
        }
        return this.I1;
    }

    public int getTextX() {
        return this.f22111k0;
    }

    public int getTextY() {
        return this.f22168o0;
    }

    public float getTimeAlpha() {
        return this.f22102j5;
    }

    public float getTimeX() {
        int i10;
        s1 s1Var = this.Wc;
        if (s1Var.f21848h1) {
            i10 = AndroidUtilities.lerp(s1Var.f21844g1, this.f22178ob, s1Var.K1);
        } else {
            i10 = this.f22178ob;
        }
        return i10;
    }

    public float getTimeY() {
        int i10;
        int i11 = 0;
        if (f4()) {
            if (this.f22063g9) {
                i11 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.f22273v7.isSponsored()) {
            i10 = -AndroidUtilities.dp(48.0f);
            if (this.H8) {
                i10 -= AndroidUtilities.dp(4.0f);
            }
            return N2(i10);
        } else if (this.f22063g9) {
            i11 = AndroidUtilities.dp(43.0f);
        }
        i10 = -i11;
        return N2(i10);
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.type == 14) {
            return this.f22113k2 + this.Ic;
        }
        return 0;
    }

    public int getTopicSeparatorTopPadding() {
        s1 s1Var = this.Wc;
        if (s1Var.f21904u1) {
            return AndroidUtilities.lerp(s1Var.f21900t1, this.f21996c0, s1Var.K1);
        }
        return this.f21996c0;
    }

    public s1 getTransitionParams() {
        return this.Wc;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        s1 s1Var = this.Wc;
        if (s1Var == null || (messageObject = this.f22273v7) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        if (s1Var.l1) {
            if (this.f22162n8) {
                return s1Var.K1;
            }
            return 1.0f - s1Var.K1;
        } else if (this.f22162n8) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public float getViewTop() {
        return this.Pc;
    }

    public int getWidthForButtons() {
        s1 s1Var = this.Wc;
        if (s1Var.N1) {
            return AndroidUtilities.lerp(s1Var.O1, this.f22189p7, s1Var.K1);
        }
        return this.f22189p7;
    }

    @Override
    public final boolean h() {
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 4) != 0) {
                return this.B;
            }
            return true;
        }
        return this.B;
    }

    public final void h1(t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        t1Var.K7 = this.K7;
        t1Var.X7 = this.X7;
        t1Var.M7 = this.M7;
        t1Var.N7 = this.N7;
        t1Var.O7 = this.O7;
        t1Var.P7 = this.P7;
        t1Var.Q7 = this.Q7;
        t1Var.R7 = this.R7;
        t1Var.S7 = this.S7;
        t1Var.T7 = this.T7;
        t1Var.U7 = this.U7;
        t1Var.V7 = this.V7;
        t1Var.Y7 = this.Y7;
        t1Var.Z7 = this.Z7;
        t1Var.f21974a8 = this.f21974a8;
        t1Var.B8 = this.B8;
        t1Var.C8 = this.C8;
        t1Var.D8 = this.D8;
        t1Var.E8 = this.E8;
        t1Var.F8 = this.F8;
    }

    public final void h2(Canvas canvas, Integer num, float f10, boolean z4) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        if (groupedMessagePosition != null) {
            int i10 = groupedMessagePosition.flags;
            if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                return;
            }
        }
        mg.r0 r0Var = this.K;
        if (!r0Var.f14114b) {
            r0Var.D = f10;
            r0Var.E = z4;
            r0Var.d(canvas, this.Wc.K1, num);
        }
    }

    public final boolean h3() {
        if (this.f22289w7 != null) {
            return this.A7;
        }
        return this.D;
    }

    public final void h4() {
        nh.y2 y2Var = this.P0;
        i4((y2Var.getImageWidth() / 2.0f) + y2Var.getImageX(), (y2Var.getImageHeight() / 2.0f) + y2Var.getImageY());
    }

    @Override
    public final boolean i() {
        return this.f22137lc;
    }

    public final void i1(t1 t1Var) {
        ih.j jVar;
        if (t1Var != null && (jVar = t1Var.Cb) != null) {
            int i10 = (Integer) jVar.f7600k.get(t1Var);
            if (i10 == null) {
                i10 = 0;
            }
            this.Db = i10;
            ih.j jVar2 = this.Cb;
            if (jVar2 != null) {
                jVar2.f7600k.put(this, i10);
            }
        }
    }

    public final void i2(pm pmVar, Canvas canvas, int i10, Integer num, float f10) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        if (groupedMessagePosition != null) {
            int i11 = groupedMessagePosition.flags;
            if ((i11 & 8) == 0 || (i11 & 1) == 0) {
                return;
            }
        }
        mg.r0 r0Var = this.K;
        if (!r0Var.f14114b) {
            r0Var.D = f10;
            r0Var.f(pmVar, canvas, i10, num);
        }
    }

    public final boolean i3(float f10) {
        if (this.f22205q8 != null) {
            int i10 = this.f22234s8;
            if (f10 >= i10 && f10 <= i10 + this.f22246t8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i4(float f10, float f11) {
        t1 t1Var;
        nh.y2 y2Var = this.P0;
        this.Bb = (float) Math.sqrt(Math.pow(y2Var.getImageHeight(), 2.0d) + Math.pow(y2Var.getImageWidth(), 2.0d));
        MessageObject messageObject = this.f22273v7;
        if (!messageObject.isMediaSpoilersRevealed && this.f22325yb == 0.0f) {
            if (messageObject.type == 3) {
                messageObject.forceUpdate = true;
                messageObject.revealingMediaSpoilers = true;
                t1Var = this;
                t1Var.V3(messageObject, this.H, this.C, this.B, this.D, this.E);
                MessageObject messageObject2 = t1Var.f22273v7;
                messageObject2.revealingMediaSpoilers = false;
                messageObject2.forceUpdate = false;
                if (t1Var.H != null) {
                    t1Var.L0.o(0.0f, false);
                }
            } else {
                t1Var = this;
            }
            t1Var.zb = f10;
            t1Var.Ab = f11;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(k7.n.a(t1Var.Bb * 0.3f, 250.0f, 550.0f));
            duration.setInterpolator(nr.f27349j);
            duration.addUpdateListener(new r(this, 2));
            duration.addListener(new j1(0, this));
            duration.start();
        }
    }

    @Override
    public void invalidate() {
        k1 k1Var;
        if (this.f22273v7 == null) {
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f22082he;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.f22096ie;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.G7 || (this.H != null && b3())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.Ld || (k1Var = this.Gc) == null) {
            return;
        }
        k1Var.o();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.H != null) {
            c3();
        }
    }

    @Override
    public final boolean j() {
        MessageObject.GroupedMessages groupedMessages = this.H;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) != 0) {
                return this.C;
            }
            return true;
        }
        return this.C;
    }

    public final void j1(t1 t1Var) {
        t1Var.b4(this.Vd, this.Xd, this.Yd, this.Zd, this.f21980ae, this.G0, this.H0, this.Rc, this.Sc, this.Wd);
    }

    public final void j2(Canvas canvas, RectF rectF, float f10) {
        String str;
        p0();
        if (this.f22261ua) {
            str = "paintChatActionBackgroundSelected";
        } else {
            str = "paintChatActionBackground";
        }
        canvas.drawRoundRect(rectF, f10, f10, M2(str));
        if (R2()) {
            canvas.drawRoundRect(rectF, f10, f10, org.telegram.ui.ActionBar.j6.f19974h2);
        }
    }

    public final boolean j3() {
        if (this.f22289w7 != null) {
            return this.B7;
        }
        return this.E;
    }

    public final boolean j4() {
        k1 k1Var;
        if (getCurrentMessagesGroup() == null && (k1Var = this.Gc) != null && k1Var.C2() != null && this.Gc.C2().A(this.f22273v7)) {
            return true;
        }
        return false;
    }

    public final void k1() {
        if (this.T8 == null) {
            this.T8 = new ImageReceiver[3];
            this.U8 = new org.telegram.ui.Components.z8[3];
            this.V8 = new boolean[3];
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.T8;
                if (i10 < imageReceiverArr.length) {
                    imageReceiverArr[i10] = new ImageReceiver(this);
                    this.T8[i10].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.U8[i10] = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                    this.U8[i10].u(AndroidUtilities.dp(18.0f));
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k2(Canvas canvas, boolean z4) {
        float f10;
        float f11;
        int i10;
        float dp;
        float f12;
        float f13;
        float f14;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.f22207qa || z4) && this.f22222ra != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition == null || (groupedMessages = this.H) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                boolean isOutOwner = this.f22273v7.isOutOwner();
                s1 s1Var = this.Wc;
                if (isOutOwner) {
                    float dp2 = s1Var.f21853i1 - AndroidUtilities.dp(40.0f);
                    this.Da = dp2;
                    MessageObject.GroupedMessages groupedMessages2 = this.H;
                    if (groupedMessages2 != null) {
                        this.Da = (groupedMessages2.transitionParams.offsetLeft - this.f22296we) + dp2;
                    }
                } else {
                    float dp3 = AndroidUtilities.dp(8.0f) + s1Var.f21858j1;
                    this.Da = dp3;
                    MessageObject.GroupedMessages groupedMessages3 = this.H;
                    if (groupedMessages3 != null) {
                        this.Da = (groupedMessages3.transitionParams.offsetRight - this.f22296we) + dp3;
                    }
                }
                float f15 = 0.0f;
                if (this.f22222ra == 4) {
                    this.Ea = AndroidUtilities.dp(6.0f);
                } else {
                    float dp4 = (this.J8 + s1Var.f21852i0) - AndroidUtilities.dp(41.0f);
                    this.Ea = dp4;
                    MessageObject messageObject = this.f22273v7;
                    if (messageObject.type == 19 && messageObject.textWidth < this.f22165nb) {
                        this.Ea = dp4 - AndroidUtilities.dp(22.0f);
                    }
                    MessageObject.GroupedMessages groupedMessages4 = this.H;
                    if (groupedMessages4 != null) {
                        float f16 = this.Ea;
                        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages4.transitionParams;
                        float f17 = f16 + transitionParams.offsetBottom;
                        this.Ea = f17;
                        if (transitionParams.backgroundChangeBounds) {
                            this.Ea = f17 - getTranslationY();
                        }
                    }
                    if (this.f22273v7.shouldDrawReactions()) {
                        mg.r0 r0Var = this.K;
                        if (!r0Var.f14114b) {
                            if (this.f22166nd) {
                                this.Ea -= (1.0f - getVideoTranscriptionProgress()) * r0Var.i(s1Var.K1);
                            } else if (r0Var.f14113a > 0.0f) {
                                this.Ea -= r0Var.i(s1Var.K1);
                            }
                        }
                    }
                }
                if (this.f22222ra != 4) {
                    float dp5 = ((this.J8 + s1Var.f21852i0) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.Ea < dp5) {
                        this.Ea = dp5;
                    }
                }
                if (this.f22273v7.type == 19) {
                    if (this.f22222ra == 3 && this.W8 != null) {
                        this.Ea = AndroidUtilities.dp(18.0f);
                    } else {
                        this.Ea = 0.0f;
                    }
                }
                if (!this.f22273v7.isOutOwner() && this.f22166nd && !this.f22027e2) {
                    if (this.f22133l8) {
                        dp = (AndroidUtilities.roundPlayingMessageSize(this.C8) - AndroidUtilities.roundMessageSize) * 0.7f;
                    } else {
                        dp = AndroidUtilities.dp(50.0f);
                    }
                    if (this.f22180od) {
                        f12 = (1.0f - getVideoTranscriptionProgress()) * dp;
                    } else {
                        f12 = 0.0f;
                    }
                    if (this.f22180od) {
                        f15 = AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress());
                    }
                    if (s1Var.f21864k2) {
                        if (this.f22180od) {
                            f13 = s1Var.K1;
                        } else {
                            f13 = 1.0f - s1Var.K1;
                        }
                        f12 = (1.0f - getVideoTranscriptionProgress()) * f13 * dp;
                        if (this.f22180od) {
                            f14 = s1Var.K1;
                        } else {
                            f14 = 1.0f - s1Var.K1;
                        }
                        f15 = (1.0f - getVideoTranscriptionProgress()) * f14 * AndroidUtilities.dp(28.0f);
                    }
                    this.Da -= f12;
                    this.Ea -= f15;
                }
                this.f22235sa = true;
                if (this.f22222ra == 3) {
                    if (!this.f22297x || this.f22273v7.isVoice()) {
                        M1(canvas, 1.0f);
                    }
                } else if (!qv0.f28268s0) {
                    float f18 = this.Da;
                    float f19 = this.Ea;
                    float dp6 = AndroidUtilities.dp(32.0f) + f18;
                    float f20 = this.Ea;
                    if (this.f22247ta == 5) {
                        f10 = 64.0f;
                    } else {
                        f10 = 32.0f;
                    }
                    float dp7 = f20 + AndroidUtilities.dp(f10);
                    RectF rectF = this.Z4;
                    rectF.set(f18, f19, dp6, dp7);
                    if (rectF.right >= getMeasuredWidth()) {
                        this.f22235sa = false;
                        return;
                    }
                    int i11 = (int) ((1.0f - this.f22313y.e) * 255.0f);
                    if (i11 != 255) {
                        float f21 = this.Da;
                        f11 = 2.0f;
                        i10 = canvas.saveLayerAlpha(f21, this.Ea, AndroidUtilities.dp(32.0f) + f21, this.Ea + AndroidUtilities.dp(64.0f), i11);
                    } else {
                        f11 = 2.0f;
                        i10 = -1;
                    }
                    p0();
                    String str = "paintChatActionBackground";
                    if (this.f22222ra == 4 && this.f22247ta == 5 && this.f22261ua) {
                        Path path = this.za;
                        if (path == null) {
                            this.za = new Path();
                        } else {
                            path.rewind();
                        }
                        Path path2 = this.Aa;
                        if (path2 == null) {
                            this.Aa = new Path();
                        } else {
                            path2.rewind();
                        }
                        if (this.Ba == null) {
                            this.Ba = r2;
                            float dp8 = AndroidUtilities.dp(16.0f);
                            float[] fArr = {dp8, dp8, dp8, dp8};
                        }
                        if (this.Ca == null) {
                            this.Ca = r2;
                            float dp9 = AndroidUtilities.dp(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, dp9, dp9, dp9, dp9};
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f22 = this.Da;
                        rectF2.set(f22, this.Ea, AndroidUtilities.dp(32.0f) + f22, this.Ea + AndroidUtilities.dp(32.0f));
                        Path path3 = this.za;
                        float[] fArr3 = this.Ba;
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF2, fArr3, direction);
                        rectF2.set(this.Da, this.Ea + AndroidUtilities.dp(32.0f), this.Da + AndroidUtilities.dp(32.0f), this.Ea + AndroidUtilities.dp(64.0f));
                        this.Aa.addRoundRect(rectF2, this.Ca, direction);
                        if (this.f22308xa == 4) {
                            canvas.drawPath(this.za, M2("paintChatActionBackgroundSelected"));
                            canvas.drawPath(this.Aa, M2("paintChatActionBackground"));
                        } else {
                            canvas.drawPath(this.za, M2("paintChatActionBackground"));
                            canvas.drawPath(this.Aa, M2("paintChatActionBackgroundSelected"));
                        }
                    } else {
                        float dp10 = AndroidUtilities.dp(16.0f);
                        float dp11 = AndroidUtilities.dp(16.0f);
                        if (this.f22261ua) {
                            str = "paintChatActionBackgroundSelected";
                        }
                        canvas.drawRoundRect(rectF, dp10, dp11, M2(str));
                    }
                    if (R2()) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.f19974h2);
                    }
                    int i12 = this.f22222ra;
                    if (i12 == 2) {
                        Drawable L2 = L2("drawableGoIcon");
                        a0.p(L2, (this.Da + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicWidth() / f11), (this.Ea + AndroidUtilities.dp(16.0f)) - (L2.getIntrinsicHeight() / f11));
                        L2.draw(canvas);
                    } else if (i12 == 4) {
                        int dp12 = (int) (this.Da + AndroidUtilities.dp(16.0f));
                        int dp13 = (int) (this.Ea + AndroidUtilities.dp(16.0f));
                        Drawable L22 = L2("drawableCloseIcon");
                        int intrinsicWidth = L22.getIntrinsicWidth() / 2;
                        int intrinsicHeight = L22.getIntrinsicHeight() / 2;
                        L22.setBounds(dp12 - intrinsicWidth, dp13 - intrinsicHeight, intrinsicWidth + dp12, intrinsicHeight + dp13);
                        a0.p(L22, this.Da + AndroidUtilities.dp(4.0f), this.Ea + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, L22.getBounds().centerX(), L22.getBounds().centerY());
                        L22.draw(canvas);
                        canvas.restore();
                        if (this.f22247ta == 5) {
                            Drawable L23 = L2("drawableMoreIcon");
                            int intrinsicWidth2 = L23.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = L23.getIntrinsicHeight() / 2;
                            L23.setBounds(dp12 - intrinsicWidth2, dp13 - intrinsicHeight2, dp12 + intrinsicWidth2, dp13 + intrinsicHeight2);
                            a0.p(L23, this.Da + AndroidUtilities.dp(4.0f), this.Ea + AndroidUtilities.dp(34.0f));
                            L23.draw(canvas);
                        }
                    } else {
                        int dp14 = (int) (this.Da + AndroidUtilities.dp(16.0f));
                        int dp15 = (int) (this.Ea + AndroidUtilities.dp(16.0f));
                        Drawable L24 = L2("drawableShareIcon");
                        int intrinsicWidth3 = L24.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = L24.getIntrinsicHeight() / 2;
                        L24.setBounds(dp14 - intrinsicWidth3, dp15 - intrinsicHeight3, dp14 + intrinsicWidth3, dp15 + intrinsicHeight3);
                        a0.p(L24, this.Da + AndroidUtilities.dp(4.0f), this.Ea + AndroidUtilities.dp(4.0f));
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
        MessageObject messageObject = this.f22273v7;
        if (messageObject.forceAvatar || (messageObject.getDialogId() == 489000 && (message = this.f22273v7.messageOwner) != null && message.fwd_from != null)) {
            return true;
        }
        if (this.f22273v7.isSponsored() || this.f22273v7.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.L7 && !this.f21974a8) {
            return false;
        }
        TLRPC.Message message2 = this.f22273v7.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.f22273v7.messageOwner.peer_id)) {
            return false;
        }
        if ((this.f21974a8 && this.f22273v7.type == 0) || ((!this.B && this.Va && this.K7 && (!this.f22273v7.isOutOwner() || ((this.f22273v7.isSupergroup() && this.f22273v7.isFromGroup()) || this.f22273v7.isRepostPreview))) || (this.f22273v7.isImportedForward() && this.f22273v7.messageOwner.fwd_from.from_id == null))) {
            return true;
        }
        return false;
    }

    public final void k4(int i10, boolean z4) {
        if (i10 >= 0) {
            ArrayList arrayList = this.V5;
            if (i10 < arrayList.size()) {
                r1 r1Var = (r1) arrayList.get(i10);
                if (this.Gc.P(this, r1Var.f21614t, !r1Var.f21603i)) {
                    if (z4) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    long dialogId = this.f22273v7.getDialogId();
                    int i11 = this.F7;
                    long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(i11).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(i11).getChatFull(dialogId), true);
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.f22273v7);
                    int i12 = this.F7;
                    MessageObject.toggleTodo(i12, sendAsPeerId, tL_messageMediaToDo, r1Var.f21614t.f19329id, !r1Var.f21603i, ConnectionsManager.getInstance(i12).getCurrentTime());
                    if (!r1Var.f21603i) {
                        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(sendAsPeerId);
                        r1Var.f21618y.p(userOrChat);
                        r1Var.f21619z.setForUserOrChat(userOrChat, r1Var.f21618y);
                        r1Var.f21611q = new k01(DialogObject.getName(userOrChat), 12.0f, null);
                    }
                    this.O8[i10].f(-1, !r1Var.f21603i, true);
                    if (this.f22231s4 != null) {
                        if (!this.f22273v7.isOutOwner() && this.f22273v7.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                            this.f22231s4.q(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.f22273v7.getFromChatId())), true, true);
                        } else {
                            this.f22231s4.q(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))), true, true);
                        }
                    }
                    r1Var.f21603i = !r1Var.f21603i;
                    invalidate();
                    return;
                }
                this.f22272v6 = false;
            }
        }
    }

    @Override
    public final void l() {
        k1 k1Var;
        if (this.f22273v7 != null) {
            Runnable runnable = this.f22082he;
            if (runnable != null) {
                runnable.run();
                return;
            }
            Runnable runnable2 = this.f22096ie;
            if (runnable2 != null) {
                runnable2.run();
            }
            super.invalidate();
            if ((this.G7 || (this.H != null && b3())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.Ld && (k1Var = this.Gc) != null) {
                k1Var.o();
            }
        }
    }

    public final void l1() {
        int i10;
        s1(0);
        if (this.P2) {
            boolean z4 = this.R2;
            if (this.Q2) {
                boolean z10 = (z4 ? 1 : 0) | true;
                i10 = (z4 ? 1 : 0) + 1;
                z4 = z10;
            } else {
                i10 = z4 ? 1 : 0;
            }
            if (this.S2) {
                z4 = (z4 ? 1 : 0) | true;
                i10++;
            }
            if (i10 == 0) {
                this.U2 = null;
                this.T2 = 0;
                return;
            }
            this.f22182p0 = AndroidUtilities.dp(60.0f) + this.f22182p0;
            if (z4 != this.T2) {
                this.T2 = 0;
                int x10 = org.telegram.ui.b.x(75.0f, this.G8, i10);
                float dpf2 = (this.G8 - AndroidUtilities.dpf2(37.0f)) / i10;
                ArrayList arrayList = this.U2;
                if (arrayList == null) {
                    this.U2 = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.R2) {
                    this.T2 |= 1;
                    this.U2.add(n1(5, LocaleController.getString("ViewContact", R.string.ViewContact), x10, dpf2));
                }
                if (this.Q2) {
                    this.T2 |= 2;
                    this.U2.add(n1(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), x10, dpf2));
                }
                if (this.S2) {
                    this.T2 |= 4;
                    this.U2.add(n1(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), x10, dpf2));
                }
            }
        }
    }

    public final void l2(Canvas canvas, boolean z4, boolean z10, boolean z11, boolean z12, float f10, boolean z13, float f11, float f12, float f13, boolean z14, boolean z15) {
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
        boolean z16 = (f13 == 1.0f || z14) ? false : true;
        float f18 = (f13 * 0.5f) + 0.5f;
        float f19 = z16 ? f10 * f13 : f10;
        if (this.H1 != 7 || ((messageObject = this.f22273v7) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.f22197q0;
        } else {
            photoBottom = f12 - ((1.0f - getVideoTranscriptionProgress()) * (this.K.i(this.Wc.K1) + AndroidUtilities.dp(this.G ? 4.0f : 5.0f)));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.f22273v7;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        float f20 = 22.0f;
        if (z11) {
            lc0 lc0Var = org.telegram.ui.ActionBar.j6.E3;
            if (f4()) {
                if (this.f22273v7.shouldDrawWithoutBackground()) {
                    f16 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, this.Fd);
                    int i10 = this.I8;
                    f17 = z13 ? 24.0f : 22.0f;
                    lc0Var.getClass();
                    f14 = 4.0f;
                    a0.p(lc0Var, ((i10 - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f11);
                    lc0Var.setAlpha((int) (this.f22102j5 * 255.0f * f19));
                } else {
                    f14 = 4.0f;
                    f16 = 1.0f;
                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20195tc, this.Fd);
                    int i11 = this.I8;
                    f17 = z13 ? 24.0f : 22.0f;
                    lc0Var.getClass();
                    a0.p(lc0Var, ((i11 - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(12.0f)) + dp4, (dp3 - AndroidUtilities.dp(12.0f)) + f11);
                    lc0Var.setAlpha((int) (f19 * 255.0f));
                }
                f15 = 18.5f;
            } else {
                f14 = 4.0f;
                f16 = 1.0f;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Na, this.Fd);
                lc0Var.getClass();
                f15 = 18.5f;
                a0.p(lc0Var, (this.I8 - AndroidUtilities.dp(18.5f)) - AndroidUtilities.dp(12.0f), ((f12 - AndroidUtilities.dp(8.5f)) - AndroidUtilities.dp(12.0f)) + f11);
                lc0Var.setAlpha((int) (f19 * 255.0f));
            }
            lc0Var.a(v02);
            if (z16) {
                canvas.save();
                canvas.scale(f18, f18, lc0Var.getBounds().centerX(), lc0Var.getBounds().centerY());
            }
            lc0Var.draw(canvas);
            lc0Var.setAlpha(255);
            if (z16) {
                canvas.restore();
            }
            invalidate();
        } else {
            f14 = 4.0f;
            f15 = 18.5f;
            f16 = 1.0f;
        }
        if (z10) {
            if (f4()) {
                if (z14) {
                    canvas.save();
                }
                if (this.f22273v7.shouldDrawWithoutBackground()) {
                    drawable = L2("drawableMsgStickerCheck");
                    if (z4) {
                        if (z14) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (f16 - f13), 0.0f);
                        }
                        a0.p(drawable, ((this.I8 - AndroidUtilities.dp(z13 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f11);
                    } else {
                        a0.p(drawable, ((this.I8 - AndroidUtilities.dp(z13 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f11);
                    }
                    drawable.setAlpha((int) (this.f22102j5 * 255.0f * f19));
                } else {
                    if (z4) {
                        if (z14) {
                            canvas.translate((f16 - f13) * AndroidUtilities.dp(4.8f), 0.0f);
                        }
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.I8 - AndroidUtilities.dp(z13 ? 28.3f : 26.3f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f11);
                    } else {
                        a0.p(org.telegram.ui.ActionBar.j6.F3, (this.I8 - AndroidUtilities.dp(z13 ? 23.5f : 21.5f)) - org.telegram.ui.ActionBar.j6.F3.getIntrinsicWidth(), (dp3 - org.telegram.ui.ActionBar.j6.F3.getIntrinsicHeight()) + f11);
                    }
                    org.telegram.ui.ActionBar.j6.F3.setAlpha((int) (this.f22102j5 * 255.0f * f19));
                    drawable = org.telegram.ui.ActionBar.j6.F3;
                }
                if (z16) {
                    canvas.save();
                    canvas.scale(f18, f18, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                if (z16) {
                    canvas.restore();
                }
                if (z14) {
                    canvas.restore();
                }
                drawable.setAlpha(255);
            } else {
                if (z14) {
                    canvas.save();
                }
                if (z4) {
                    if (z14) {
                        canvas.translate((f16 - f13) * AndroidUtilities.dp(f14), 0.0f);
                    }
                    L2 = L2(z15 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    a0.p(L2, ((this.I8 - AndroidUtilities.dp(22.5f)) - L2.getIntrinsicWidth()) + dp4, ((f12 - AndroidUtilities.dp((this.C || this.B) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f11);
                } else {
                    L2 = L2(z15 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    a0.p(L2, ((this.I8 - AndroidUtilities.dp(f15)) - L2.getIntrinsicWidth()) + dp4, ((f12 - AndroidUtilities.dp((this.C || this.B) ? 9.0f : 8.0f)) - L2.getIntrinsicHeight()) + f11);
                }
                L2.setAlpha((int) (f19 * 255.0f));
                if (z16) {
                    canvas.save();
                    canvas.scale(f18, f18, L2.getBounds().centerX(), L2.getBounds().centerY());
                }
                L2.draw(canvas);
                if (z16) {
                    canvas.restore();
                }
                if (z14) {
                    canvas.restore();
                }
                L2.setAlpha(255);
            }
        }
        if (z4) {
            if (f4()) {
                Drawable L22 = this.f22273v7.shouldDrawWithoutBackground() ? L2("drawableMsgStickerHalfCheck") : org.telegram.ui.ActionBar.j6.G3;
                a0.p(L22, ((this.I8 - AndroidUtilities.dp(z13 ? 23.5f : 21.5f)) - L22.getIntrinsicWidth()) + dp4, (dp3 - L22.getIntrinsicHeight()) + f11);
                L22.setAlpha((int) (this.f22102j5 * 255.0f * f19));
                if (z16 || z14) {
                    canvas.save();
                    canvas.scale(f18, f18, L22.getBounds().centerX(), L22.getBounds().centerY());
                }
                L22.draw(canvas);
                if (z16 || z14) {
                    canvas.restore();
                }
                L22.setAlpha(255);
            } else {
                Drawable L23 = L2(z15 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                a0.p(L23, (this.I8 - AndroidUtilities.dp(18.0f)) - L23.getIntrinsicWidth(), ((f12 - AndroidUtilities.dp((this.C || this.B) ? 9.0f : 8.0f)) - L23.getIntrinsicHeight()) + f11);
                L23.setAlpha((int) (f19 * 255.0f));
                if (z16 || z14) {
                    canvas.save();
                    canvas.scale(f18, f18, L23.getBounds().centerX(), L23.getBounds().centerY());
                }
                L23.draw(canvas);
                if (z16 || z14) {
                    canvas.restore();
                }
                L23.setAlpha(255);
            }
        }
        if (z12) {
            if (f4()) {
                dp = this.I8 - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.I8 - AndroidUtilities.dp(32.0f);
                if (!this.C && !this.B) {
                    f20 = 21.0f;
                }
                dp2 = AndroidUtilities.dp(f20);
            }
            float f21 = (f12 - dp2) + f11;
            int i12 = (int) (dp + dp4);
            RectF rectF = this.Z4;
            rectF.set(i12, f21, AndroidUtilities.dp(14.0f) + i12, AndroidUtilities.dp(14.0f) + f21);
            int alpha = org.telegram.ui.ActionBar.j6.f19866b2.getAlpha();
            org.telegram.ui.ActionBar.j6.f19866b2.setAlpha((int) (alpha * f19));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), org.telegram.ui.ActionBar.j6.f19866b2);
            org.telegram.ui.ActionBar.j6.f19866b2.setAlpha(alpha);
            a0.p(org.telegram.ui.ActionBar.j6.f20011j4, AndroidUtilities.dp(6.0f) + i12, f21 + AndroidUtilities.dp(2.0f));
            org.telegram.ui.ActionBar.j6.f20011j4.setAlpha((int) (f19 * 255.0f));
            if (z16) {
                canvas.save();
                canvas.scale(f18, f18, org.telegram.ui.ActionBar.j6.f20011j4.getBounds().centerX(), org.telegram.ui.ActionBar.j6.f20011j4.getBounds().centerY());
            }
            org.telegram.ui.ActionBar.j6.f20011j4.draw(canvas);
            org.telegram.ui.ActionBar.j6.f20011j4.setAlpha(255);
            if (z16) {
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
        boolean z4;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (this.f22009ce && (messageObject = this.f22273v7) != null) {
            boolean z10 = false;
            if (messageObject.wasJustSent) {
                i10 = org.telegram.ui.Components.l5.g();
            } else {
                i10 = 0;
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Z3;
            if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
                this.f22150mc = org.telegram.ui.Components.u5.update(i10, (View) this, false, this.f22150mc, arrayList);
            } else {
                k1 k1Var = this.Gc;
                if (k1Var != null && k1Var.e()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.f22150mc = org.telegram.ui.Components.u5.update(i10, this, z4, this.f22150mc, this.f22273v7.textLayoutBlocks);
            }
            MessageObject messageObject2 = this.f22273v7;
            if (messageObject2.type == 36 && (richMessageLayout = messageObject2.richLayout) != null) {
                k1 k1Var2 = this.Gc;
                richMessageLayout.invalidateAnimatedEmojiInParent = (k1Var2 == null || !k1Var2.e()) ? true : true;
                this.f22273v7.richLayout.updateAnimatedEmojis(i10);
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
        boolean z4;
        int i11;
        String str;
        String str2;
        int i12 = i10;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        if (messageMedia != null) {
            this.I1 = messageMedia.document;
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
            this.I1 = document;
        } else {
            this.I1 = messageObject.getDocument();
        }
        TLRPC.Document document2 = this.I1;
        int i13 = 0;
        if (document2 != null) {
            double d = 0.0d;
            if (MessageObject.isVoiceDocument(document2)) {
                this.H1 = 3;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.I1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.I1.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i14++;
                }
                AndroidUtilities.dp(94.0f);
                Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText("00:00"));
                this.A8 = i12 - AndroidUtilities.dp(18.0f);
                x3(messageObject);
                int dp = AndroidUtilities.dp(174.0f) + this.f22149mb;
                if (!this.f22027e2) {
                    this.G8 = Math.min(i12, dp + ((int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(AndroidUtilities.formatLongDuration((int) d)))));
                }
                this.E5.f27092m = messageObject;
                return 0;
            } else if (MessageObject.isVideoDocument(this.I1)) {
                this.H1 = 4;
                if (!messageObject.needDrawBluredPreview()) {
                    q4();
                    this.R3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(str2));
                    this.Q3 = new StaticLayout(AndroidUtilities.formatFileSize(this.I1.size), org.telegram.ui.ActionBar.j6.C2, this.R3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return 0;
                }
            } else if (MessageObject.isMusicDocument(this.I1)) {
                this.H1 = 5;
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
                this.Q5 = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    this.R5 = -((int) Math.ceil(this.Q5.getLineLeft(0)));
                    int lineWidth = (int) this.Q5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth > this.G8) {
                        this.G8 = AndroidUtilities.dp(104.0f) + lineWidth;
                    }
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), org.telegram.ui.ActionBar.j6.P2, i15, truncateAt), org.telegram.ui.ActionBar.j6.P2, i15, alignment, 1.0f, 0.0f, false);
                this.S5 = staticLayout2;
                if (staticLayout2.getLineCount() > 0) {
                    this.T5 = -((int) Math.ceil(this.S5.getLineLeft(0)));
                    int lineWidth2 = (int) this.S5.getLineWidth(0);
                    if (AndroidUtilities.dp(104.0f) + lineWidth2 > this.G8) {
                        this.G8 = AndroidUtilities.dp(104.0f) + lineWidth2;
                    }
                }
                while (true) {
                    if (i13 >= this.I1.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.I1.attributes.get(i13);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute2.duration;
                        break;
                    }
                    i13++;
                }
                int i16 = (int) d;
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(AndroidUtilities.formatShortDuration(i16, i16)));
                AndroidUtilities.dp(86.0f);
                this.A8 = this.G8 - AndroidUtilities.dp(28.0f);
                return ceil;
            } else if (MessageObject.isGifDocument(this.I1, messageObject.hasValidGroupId())) {
                this.H1 = 2;
                if (!messageObject.needDrawBluredPreview()) {
                    String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                    this.f22302x4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(string));
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.C2;
                    int i17 = this.f22302x4;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    this.f22216r4 = new StaticLayout(string, textPaint2, i17, alignment2, 1.0f, 0.0f, false);
                    this.R3 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(str));
                    this.Q3 = new StaticLayout(AndroidUtilities.formatFileSize(this.I1.size), org.telegram.ui.ActionBar.j6.C2, this.R3, alignment2, 1.0f, 0.0f, false);
                }
            } else {
                String str3 = this.I1.mime_type;
                if ((str3 != null && (str3.toLowerCase().startsWith("image/") || this.I1.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.isDocumentHasThumb(this.I1)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.J1 = z4;
                if (!z4) {
                    i12 += AndroidUtilities.dp(30.0f);
                }
                int i18 = i12;
                this.H1 = 1;
                String documentFileName = FileLoader.getDocumentFileName(this.I1);
                if (documentFileName.length() == 0) {
                    documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
                }
                StaticLayout c3 = kw0.c(documentFileName, org.telegram.ui.ActionBar.j6.G2, i18, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i18, 2, false);
                this.Q3 = c3;
                this.S3 = Integer.MIN_VALUE;
                if (c3 != null && c3.getLineCount() > 0) {
                    int i19 = 0;
                    while (i13 < this.Q3.getLineCount()) {
                        i19 = Math.max(i19, (int) Math.ceil(this.Q3.getLineWidth(i13)));
                        this.S3 = Math.max(this.S3, (int) Math.ceil(-this.Q3.getLineLeft(i13)));
                        i13++;
                    }
                    i11 = Math.min(i18, i19);
                } else {
                    this.S3 = 0;
                    i11 = i18;
                }
                int dp3 = i18 - AndroidUtilities.dp(30.0f);
                TextPaint textPaint3 = org.telegram.ui.ActionBar.j6.C2;
                int min = Math.min(dp3, (int) Math.ceil(textPaint3.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.I1.size))));
                this.f22302x4 = min;
                CharSequence ellipsize2 = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.I1.size) + " " + FileLoader.getDocumentExtension(this.I1), org.telegram.ui.ActionBar.j6.C2, (float) min, TextUtils.TruncateAt.END);
                try {
                    if (this.f22302x4 < 0) {
                        this.f22302x4 = AndroidUtilities.dp(10.0f);
                    }
                    this.f22216r4 = new StaticLayout(ellipsize2, org.telegram.ui.ActionBar.j6.C2, this.f22302x4 + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (this.J1) {
                    this.f21986b5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                    this.f22000c5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                    if (this.f22273v7.isHiddenSensitive() || (DownloadController.getInstance(this.F7).getAutodownloadMask() & 1) == 0) {
                        this.f21986b5 = null;
                    }
                    TLRPC.PhotoSize photoSize = this.f21986b5;
                    nh.y2 y2Var = this.P0;
                    if (photoSize != null && photoSize != this.f22000c5) {
                        BitmapDrawable bitmapDrawable = this.f22273v7.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.f22000c5 = null;
                            this.f22015d5 = bitmapDrawable;
                        }
                    } else {
                        this.f21986b5 = null;
                        y2Var.setNeedsQualityThumb(true);
                        y2Var.setShouldGenerateQualityThumb(true);
                    }
                    this.f22030e5 = "86_86_b";
                    y2Var.setImage(ImageLocation.getForObject(this.f21986b5, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.f22000c5, messageObject.photoThumbsObject), this.f22030e5, this.f22015d5, 0L, null, messageObject, 1);
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
        if (this.f22289w7 != null) {
            return this.f22335z7;
        }
        return this.C;
    }

    public final void m4(boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.m4(boolean, boolean, boolean):void");
    }

    public final boolean n0() {
        if (this.f22273v7.hasMediaSpoilers() && !this.f22273v7.isMediaSpoilersRevealed && this.f22325yb == 0.0f && this.Q0.getBitmap() != null) {
            return false;
        }
        return true;
    }

    public final void n2(Canvas canvas, float f10, boolean z4, float f11, StaticLayout staticLayout, float f12, boolean z10) {
        int i10;
        float f13;
        nh.y2 y2Var;
        char c3;
        int i11;
        int i12;
        char c10;
        boolean z11;
        s1 s1Var;
        float f14;
        boolean z12;
        float f15;
        boolean z13;
        t1 t1Var;
        String str;
        int i13;
        float f16;
        float dp;
        float f17;
        boolean z14;
        s1 s1Var2;
        boolean z15;
        boolean z16;
        s1 s1Var3;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Paint M2;
        float f18;
        float f19;
        int dp2;
        boolean z23;
        float photoBottom;
        float f20;
        int i14;
        float f21;
        s1 s1Var4;
        float f22;
        float f23;
        boolean z24;
        int i15;
        boolean z25;
        MessageObject messageObject;
        float j10;
        TextPaint textPaint;
        int i16;
        t1 t1Var2 = this;
        Canvas canvas2 = canvas;
        if (((t1Var2.f22223rb && !t1Var2.J) || !t1Var2.f4()) && staticLayout != null) {
            MessageObject messageObject2 = t1Var2.f22273v7;
            if ((!messageObject2.deleted || t1Var2.I == null) && (i10 = messageObject2.type) != 16) {
                if (i10 == 5) {
                    TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.T2;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, t1Var2.Fd);
                    if (t1Var2.f3()) {
                        i16 = t1Var2.f22273v7.isOutOwner() ? org.telegram.ui.ActionBar.j6.f20090nb : org.telegram.ui.ActionBar.j6.f20109od;
                    } else {
                        i16 = t1Var2.f22273v7.isOutOwner() ? org.telegram.ui.ActionBar.j6.sb : org.telegram.ui.ActionBar.j6.f20091nd;
                    }
                    textPaint2.setColor(i0.a.d(t1Var2.getVideoTranscriptionProgress(), v02, org.telegram.ui.ActionBar.j6.v0(i16, t1Var2.Fd)));
                } else if (t1Var2.f4()) {
                    if (t1Var2.f22273v7.shouldDrawWithoutBackground()) {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, t1Var2.Fd));
                    } else {
                        org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20038kd, t1Var2.Fd));
                    }
                } else if (t1Var2.f22273v7.isOutOwner()) {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.f20090nb : org.telegram.ui.ActionBar.j6.sb, t1Var2.Fd));
                } else {
                    org.telegram.ui.ActionBar.j6.T2.setColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.f20109od : org.telegram.ui.ActionBar.j6.f20091nd, t1Var2.Fd));
                }
                float f24 = t1Var2.getTransitionParams().J1 ? t1Var2.getTransitionParams().K1 * f10 : f10;
                if (f24 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (textPaint.getAlpha() * f24));
                }
                canvas2.save();
                if (t1Var2.G && !t1Var2.f4()) {
                    canvas2.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                float f25 = t1Var2.J8;
                s1 s1Var5 = t1Var2.Wc;
                if (s1Var5.f21910w0) {
                    f25 += s1Var5.f21852i0;
                }
                MessageObject.GroupedMessages groupedMessages = t1Var2.H;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f13 = f11;
                } else {
                    f25 -= t1Var2.getTranslationY();
                    f13 = f11 + t1Var2.H.transitionParams.offsetRight;
                }
                float f26 = f25;
                float f27 = f13;
                if (t1Var2.G && t1Var2.f4()) {
                    f26 += AndroidUtilities.dp(1.0f);
                }
                float f28 = f26;
                if (s1Var5.f21910w0) {
                    float f29 = t1Var2.f22296we;
                    f13 += f29;
                    f27 += f29;
                }
                float f30 = f13;
                boolean shouldDrawReactions = t1Var2.f22273v7.shouldDrawReactions();
                mg.r0 r0Var = t1Var2.K;
                if (shouldDrawReactions && r0Var.f14114b) {
                    if (s1Var5.f21910w0 && s1Var5.f21847h0 != 0.0f) {
                        j10 = r0Var.j(1.0f);
                    } else {
                        j10 = r0Var.j(s1Var5.K1);
                    }
                    f27 += j10;
                }
                if (s1Var5.T0) {
                    f27 = yh.c(1.0f, s1Var5.K1, s1Var5.Y0, f27);
                }
                float f31 = f27;
                boolean f42 = t1Var2.f4();
                RectF rectF = t1Var2.Z4;
                nh.y2 y2Var2 = t1Var2.P0;
                if (f42) {
                    int i17 = -(t1Var2.f22063g9 ? AndroidUtilities.dp(41.3f) : 0);
                    if (t1Var2.f22273v7.shouldDrawWithoutBackground()) {
                        M2 = t1Var2.M2("paintChatActionBackground");
                    } else {
                        M2 = t1Var2.M2("paintChatTimeBackground");
                    }
                    int alpha = M2.getAlpha();
                    float f32 = f24;
                    y2Var = y2Var2;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (t1Var2.f22102j5 * 255.0f * f32));
                    MessageObject messageObject3 = t1Var2.f22273v7;
                    if (messageObject3 == null || messageObject3.type != 4) {
                        f18 = f30;
                        f19 = f32;
                    } else {
                        float currentAlpha = y2Var.isCrossfadingWithOldImage() ? 1.0f : y2Var.getCurrentAlpha();
                        if (!y2Var.hasNotThumb()) {
                            currentAlpha = 0.0f;
                        }
                        f18 = f30;
                        f19 = AndroidUtilities.lerp(0.35f, 1.0f, currentAlpha);
                    }
                    MessageObject messageObject4 = t1Var2.f22273v7;
                    if (messageObject4 != null && messageObject4.sendPreview) {
                        org.telegram.ui.Components.j5 j5Var = t1Var2.f22083i0;
                        f19 *= j5Var == null ? 0.0f : j5Var.e();
                    }
                    M2.setAlpha((int) e2.c.z(alpha, t1Var2.f22102j5, f19, 0.6f));
                    int i18 = t1Var2.H1;
                    if (i18 != 7 && i18 != 6 && t1Var2.f22273v7.type != 19) {
                        int[] roundRadius = y2Var.getRoundRadius();
                        dp2 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z23 = SharedConfig.bubbleRadius >= 10;
                    } else {
                        int dp3 = AndroidUtilities.dp(4.0f);
                        MessageObject messageObject5 = t1Var2.f22273v7;
                        dp2 = dp3 + ((messageObject5 == null || !messageObject5.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(8.0f));
                        z23 = false;
                    }
                    MessageObject messageObject6 = t1Var2.f22273v7;
                    float dp4 = f18 + ((messageObject6 == null || !messageObject6.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f22040f0 != 0) {
                        dp4 -= AndroidUtilities.dp(18.0f);
                    }
                    float dp5 = dp4 - AndroidUtilities.dp(z23 ? 6.0f : 4.0f);
                    MessageObject messageObject7 = t1Var2.f22273v7;
                    float dp6 = (messageObject7 == null || !messageObject7.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(2.0f);
                    float f33 = f19;
                    float f34 = dp4;
                    if (t1Var2.H1 != 7 || ((messageObject = t1Var2.f22273v7) != null && messageObject.isRoundOnce())) {
                        photoBottom = t1Var2.getPhotoBottom() + t1Var2.f22197q0;
                    } else {
                        photoBottom = f28 - ((1.0f - t1Var2.getVideoTranscriptionProgress()) * (r0Var.i(s1Var5.K1) + AndroidUtilities.dp(t1Var2.G ? 4.0f : 5.0f)));
                    }
                    float f35 = photoBottom;
                    float dp7 = f35 - AndroidUtilities.dp(23.0f);
                    float max = Math.max(AndroidUtilities.dp(17.0f), org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(5.0f));
                    float f36 = dp5 - dp6;
                    float f37 = dp6 + dp5 + f12;
                    int i19 = z23 ? 12 : 8;
                    if (t1Var2.f22273v7.isOutOwner()) {
                        f20 = f37;
                        i14 = (t1Var2.f22273v7.type == 19 ? 4 : 0) + 20;
                    } else {
                        f20 = f37;
                        i14 = 0;
                    }
                    rectF.set(f36, dp7, f20 + AndroidUtilities.dp(i19 + i14), dp7 + max);
                    k4 k4Var = t1Var2.C7;
                    if (k4Var != null) {
                        float f38 = dp2;
                        canvas2.save();
                        Path path = k4Var.f21297t;
                        path.rewind();
                        path.addRoundRect(rectF, f38, f38, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.drawColor(1073741824);
                        canvas2.restore();
                    } else if (!t1Var2.f22273v7.isQuickReply()) {
                        if (t1Var2.f22273v7.hasMediaSpoilers() && t1Var2.f22273v7.type != 5) {
                            Path path2 = t1Var2.B5;
                            path2.rewind();
                            float f39 = dp2;
                            path2.addRoundRect(rectF, f39, f39, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path2);
                            ImageReceiver imageReceiver = t1Var2.f22273v7.needDrawBluredPreview() ? y2Var : t1Var2.Q0;
                            float alpha2 = imageReceiver.getAlpha();
                            imageReceiver.setAlpha(0.5f * alpha2);
                            imageReceiver.draw(canvas2);
                            imageReceiver.setAlpha(alpha2);
                            canvas2.restore();
                            Paint M22 = t1Var2.M2("paintChatTimeBackground");
                            int alpha3 = M22.getAlpha();
                            M22.setAlpha((int) (alpha3 * t1Var2.f22116k5 * 0.4f));
                            canvas2.drawRoundRect(rectF, f39, f39, M22);
                            M22.setAlpha(alpha3);
                        } else {
                            t1Var2.p0();
                            float f40 = dp2;
                            canvas2.drawRoundRect(rectF, f40, f40, M2);
                            if (M2 == t1Var2.M2("paintChatActionBackground") && t1Var2.R2()) {
                                int alpha4 = org.telegram.ui.ActionBar.j6.f19974h2.getAlpha();
                                org.telegram.ui.ActionBar.j6.f19974h2.setAlpha((int) (alpha4 * t1Var2.f22102j5 * f33));
                                canvas2.drawRoundRect(rectF, f40, f40, org.telegram.ui.ActionBar.j6.f19974h2);
                                org.telegram.ui.ActionBar.j6.f19974h2.setAlpha(alpha4);
                            }
                        }
                    }
                    M2.setAlpha(alpha);
                    float f41 = -staticLayout.getLineLeft(0);
                    MessageObject messageObject8 = t1Var2.f22273v7;
                    float dp8 = f41 + ((messageObject8 == null || !messageObject8.isAnyKindOfSticker()) ? 0 : AndroidUtilities.dp(-6.0f));
                    if (t1Var2.f22273v7.shouldDrawReactions() && r0Var.f14114b) {
                        t1Var2.t4();
                        r0Var.D = 0.0f;
                        r0Var.E = false;
                        r0Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((!ChatObject.isChannel(t1Var2.Wb) || t1Var2.Wb.megagroup) && (t1Var2.f22273v7.messageOwner.flags & 1024) == 0 && t1Var2.Sb == null && !t1Var2.V7) {
                        i12 = i17;
                        f28 = f28;
                        c3 = 7;
                        f21 = dp8;
                        f24 = f32;
                    } else {
                        float lineWidth = (t1Var2.f22149mb - staticLayout.getLineWidth(0)) + dp8;
                        if (r0Var.f14114b && !r0Var.f14128s) {
                            lineWidth -= r0Var.f14126q;
                        }
                        float f43 = lineWidth;
                        int g10 = s1Var5.g();
                        int i20 = s1Var5.a2;
                        if (i20 >= 0 && i20 != g10 && !t1Var2.f22081hd) {
                            t1Var2.t1(i20, g10, z4);
                        }
                        boolean z26 = t1Var2.f22081hd;
                        if (z26) {
                            g10 = t1Var2.f22037ed;
                        }
                        boolean z27 = (g10 & 4) != 0;
                        boolean z28 = (g10 & 8) != 0;
                        if (z26) {
                            int i21 = t1Var2.f22052fd;
                            if ((i21 & 4) != 0) {
                                i15 = i21;
                                z25 = true;
                            } else {
                                i15 = i21;
                                z25 = false;
                            }
                            float f44 = i17;
                            s1Var4 = s1Var5;
                            f22 = f43;
                            boolean z29 = z27;
                            c3 = 7;
                            i12 = i17;
                            boolean z30 = (i15 & 8) != 0;
                            t1Var2.L1(canvas2, z25, z30, f28, f32, f44, f34, 1.0f - t1Var2.f22067gd, z10);
                            boolean z31 = z25;
                            boolean z32 = z28;
                            t1Var2.L1(canvas, z29, z32, f28, f32, f44, f34, t1Var2.f22067gd, z10);
                            f28 = f28;
                            f23 = f34;
                            z24 = z29;
                            f24 = f32;
                            if (!t1Var2.f22273v7.isOutOwner()) {
                                if (!z31 && !z30) {
                                    t1Var2.p2(canvas, f24, f44, f23, 1.0f - t1Var2.f22067gd, z10);
                                }
                                if (!z24 && !z32) {
                                    t1Var2.p2(canvas, f24, f44, f23, t1Var2.f22067gd, z10);
                                }
                            }
                        } else {
                            s1Var4 = s1Var5;
                            f22 = f43;
                            boolean z33 = z27;
                            boolean z34 = z28;
                            c3 = 7;
                            i12 = i17;
                            if (!t1Var2.f22273v7.isOutOwner() && !z33 && !z34) {
                                t1Var2.p2(canvas, f32, i12, f34, 1.0f, z10);
                            }
                            t1Var2 = this;
                            t1Var2.L1(canvas, z33, z34, f28, f32, i12, f34, 1.0f, z10);
                            f28 = f28;
                            f23 = f34;
                            z24 = z33;
                            f24 = f32;
                        }
                        if (t1Var2.f22273v7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f24, i12, f23, 1.0f, z10);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var4;
                        s1Var5.a2 = s1Var4.g();
                        if (z24 && z4 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f21 = f22;
                    }
                    canvas2.save();
                    float f45 = f31 + f21;
                    t1Var2.f22108jb = f45;
                    float dp9 = (f35 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    t1Var2.f22122kb = dp9;
                    canvas2.translate(f45, dp9);
                    ih.k.f(canvas2, staticLayout);
                    canvas2.restore();
                    org.telegram.ui.ActionBar.j6.T2.setAlpha(255);
                    z11 = z23;
                    c10 = 2;
                } else {
                    y2Var = y2Var2;
                    c3 = 7;
                    if (t1Var2.f22273v7.isSponsored()) {
                        i11 = -AndroidUtilities.dp(48.0f);
                        if (t1Var2.H8) {
                            i11 -= AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        i11 = -(t1Var2.f22063g9 ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    i12 = i11;
                    float f46 = -staticLayout.getLineLeft(0);
                    if (t1Var2.f22273v7.shouldDrawReactions() && r0Var.f14114b) {
                        t1Var2.t4();
                        r0Var.D = 0.0f;
                        r0Var.E = false;
                        r0Var.d(canvas2, s1Var5.K1, null);
                    }
                    if ((ChatObject.isChannel(t1Var2.Wb) && !t1Var2.Wb.megagroup) || (t1Var2.f22273v7.messageOwner.flags & 1024) != 0 || t1Var2.Sb != null || s1Var5.F || t1Var2.V7 || s1Var5.B) {
                        float lineWidth2 = (f12 - staticLayout.getLineWidth(0)) + f46;
                        if (r0Var.f14114b && !r0Var.f14128s) {
                            lineWidth2 -= r0Var.f14126q;
                        }
                        float f47 = lineWidth2;
                        int g11 = s1Var5.g();
                        int i22 = s1Var5.a2;
                        if (i22 >= 0 && i22 != g11 && !t1Var2.f22081hd) {
                            t1Var2.t1(i22, g11, z4);
                        }
                        boolean z35 = t1Var2.f22081hd;
                        if (z35) {
                            g11 = t1Var2.f22037ed;
                        }
                        boolean z36 = (g11 & 4) != 0;
                        boolean z37 = (g11 & 8) != 0;
                        if (z35) {
                            int i23 = t1Var2.f22052fd;
                            if ((i23 & 4) != 0) {
                                f15 = f24;
                                z13 = true;
                            } else {
                                f15 = f24;
                                z13 = false;
                            }
                            boolean z38 = (i23 & 8) != 0;
                            float f48 = f15;
                            float f49 = i12;
                            s1Var = s1Var5;
                            t1Var2.L1(canvas2, z13, z38, f28, f48, f49, f30, 1.0f - t1Var2.f22067gd, z10);
                            boolean z39 = z13;
                            boolean z40 = z38;
                            boolean z41 = z36;
                            boolean z42 = z37;
                            t1Var2.L1(canvas, z41, z42, f28, f48, f49, f30, t1Var2.f22067gd, z10);
                            f28 = f28;
                            f14 = f30;
                            z12 = z41;
                            f24 = f48;
                            if (!t1Var2.f22273v7.isOutOwner()) {
                                if (!z39 && !z40) {
                                    t1Var2.p2(canvas, f24, f49, f14, 1.0f - t1Var2.f22067gd, z10);
                                }
                                if (!z12 && !z42) {
                                    t1Var2.p2(canvas, f24, f49, f14, t1Var2.f22067gd, z10);
                                }
                            }
                        } else {
                            s1Var = s1Var5;
                            boolean z43 = z36;
                            boolean z44 = z37;
                            if (!t1Var2.f22273v7.isOutOwner() && !z43 && !z44) {
                                t1Var2.p2(canvas, f24, i12, f30, 1.0f, z10);
                            }
                            t1Var2 = this;
                            float f50 = f24;
                            t1Var2.L1(canvas, z43, z44, f28, f50, i12, f30, 1.0f, z10);
                            f28 = f28;
                            f14 = f30;
                            z12 = z43;
                            f24 = f50;
                        }
                        if (t1Var2.f22273v7.isOutOwner()) {
                            canvas2 = canvas;
                            t1Var2.p2(canvas2, f24, i12, f14, 1.0f, z10);
                        } else {
                            canvas2 = canvas;
                        }
                        s1Var5 = s1Var;
                        s1Var5.a2 = s1Var.g();
                        if (z12 && z4 && t1Var2.getParent() != null) {
                            ((View) t1Var2.getParent()).invalidate();
                        }
                        f46 = f47;
                    }
                    canvas2.save();
                    if (s1Var5.T0 && s1Var5.K1 != 1.0f) {
                        if (s1Var5.U0 != null) {
                            canvas2.translate(f31 + f46, ((f28 - AndroidUtilities.dp((t1Var2.C || t1Var2.B) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12);
                            int alpha5 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha5 * s1Var5.K1));
                            s1Var5.U0.draw(canvas2);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha5);
                            ih.k.f(canvas2, s1Var5.V0);
                            c10 = 2;
                        } else {
                            int alpha6 = org.telegram.ui.ActionBar.j6.T2.getAlpha();
                            canvas2.save();
                            float f51 = i12;
                            canvas2.translate(s1Var5.f21844g1 + f46, ((f28 - AndroidUtilities.dp((t1Var2.C || t1Var2.B) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f51);
                            float f52 = alpha6;
                            c10 = 2;
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0f - s1Var5.K1) * f52));
                            ih.k.f(canvas2, s1Var5.V0);
                            canvas2.restore();
                            canvas2.translate(f31 + f46, ((f28 - AndroidUtilities.dp((t1Var2.C || t1Var2.B) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f51);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (f52 * s1Var5.K1));
                            ih.k.f(canvas2, staticLayout);
                            org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha6);
                        }
                    } else {
                        c10 = 2;
                        float f53 = f31 + f46;
                        t1Var2.f22108jb = f53;
                        float dp10 = ((f28 - AndroidUtilities.dp((t1Var2.C || t1Var2.B) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + i12;
                        t1Var2.f22122kb = dp10;
                        canvas2.translate(f53, dp10);
                        ih.k.f(canvas2, staticLayout);
                    }
                    canvas2.restore();
                    z11 = false;
                }
                int i24 = i12;
                if (t1Var2.f22273v7.isOutOwner()) {
                    int g12 = s1Var5.g();
                    int i25 = s1Var5.a2;
                    if (i25 >= 0 && i25 != g12 && !t1Var2.f22081hd) {
                        t1Var2.t1(i25, g12, z4);
                    }
                    if (t1Var2.f22081hd) {
                        g12 = t1Var2.f22037ed;
                    }
                    if ((g12 & 1) != 0) {
                        f17 = f24;
                        z14 = true;
                    } else {
                        f17 = f24;
                        z14 = false;
                    }
                    boolean z45 = (g12 & 2) != 0;
                    if ((g12 & 4) != 0) {
                        s1Var2 = s1Var5;
                        z15 = true;
                    } else {
                        s1Var2 = s1Var5;
                        z15 = false;
                    }
                    boolean z46 = (g12 & 8) != 0;
                    if (t1Var2.f22152me != 0.0f) {
                        canvas2.save();
                        canvas2.translate(0.0f, t1Var2.f22152me);
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (t1Var2.f22081hd) {
                        int i26 = t1Var2.f22052fd;
                        if ((i26 & 1) != 0) {
                            z17 = z14;
                            z18 = true;
                        } else {
                            z17 = z14;
                            z18 = false;
                        }
                        boolean z47 = (i26 & 2) != 0;
                        if ((i26 & 4) != 0) {
                            z19 = z15;
                            z20 = true;
                        } else {
                            z19 = z15;
                            z20 = false;
                        }
                        if ((i26 & 8) != 0) {
                            z21 = z46;
                            z22 = true;
                        } else {
                            z21 = z46;
                            z22 = false;
                        }
                        if (!z20 && z47 && z45 && !z18 && z17) {
                            s1Var3 = s1Var2;
                            str = "paintChatTimeBackground";
                            boolean z48 = z17;
                            z15 = z19;
                            i13 = 0;
                            f16 = 0.0f;
                            t1Var2.l2(canvas2, z48, z45, z15, z21, f17, z11, i24, f28, t1Var2.f22067gd, true, z10);
                        } else {
                            s1Var3 = s1Var2;
                            str = "paintChatTimeBackground";
                            boolean z49 = z17;
                            i13 = 0;
                            f16 = 0.0f;
                            float f54 = i24;
                            t1Var2.l2(canvas, z18, z47, z20, z22, f17, z11, f54, f28, 1.0f - t1Var2.f22067gd, false, z10);
                            z15 = z19;
                            t1Var2.l2(canvas, z49, z45, z15, z21, f17, z11, f54, f28, t1Var2.f22067gd, false, z10);
                        }
                        t1Var = this;
                        canvas2 = canvas;
                    } else {
                        s1Var3 = s1Var2;
                        str = "paintChatTimeBackground";
                        i13 = 0;
                        f16 = 0.0f;
                        canvas2 = canvas;
                        l2(canvas2, z14, z45, z15, z46, f17, z11, i24, f28, 1.0f, false, z10);
                        t1Var = this;
                    }
                    if (z16) {
                        canvas2.restore();
                    }
                    s1Var3.a2 = s1Var3.g();
                    if (z4 && z15 && t1Var.getParent() != null) {
                        ((View) t1Var.getParent()).invalidate();
                    }
                } else {
                    t1Var = t1Var2;
                    str = "paintChatTimeBackground";
                    i13 = 0;
                    f16 = 0.0f;
                }
                canvas2.restore();
                if (t1Var.Jb != null) {
                    if (t1Var.Hb == f16 || t1Var.Ib == f16) {
                        t1Var.s0();
                    }
                    Path path3 = t1Var.Nb;
                    path3.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(y2Var.getImageX(), y2Var.getImageY(), y2Var.getImageX2(), y2Var.getImageY2());
                    int[] roundRadius2 = y2Var.getRoundRadius();
                    float f55 = roundRadius2[i13];
                    float[] fArr = t1Var.Ob;
                    fArr[1] = f55;
                    fArr[i13] = f55;
                    float f56 = roundRadius2[1];
                    fArr[3] = f56;
                    fArr[c10] = f56;
                    float f57 = roundRadius2[c10];
                    fArr[5] = f57;
                    fArr[4] = f57;
                    float f58 = roundRadius2[3];
                    fArr[c3] = f58;
                    fArr[6] = f58;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    canvas2.save();
                    canvas2.clipPath(path3);
                    path3.rewind();
                    rectF2.set(t1Var.Hb - AndroidUtilities.dp(12.0f), t1Var.Ib - AndroidUtilities.dp(8.0f), t1Var.Hb + org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(14.0f) + t1Var.Jb.getWidth() + AndroidUtilities.dp(12.0f), t1Var.Ib + t1Var.Jb.getHeight() + AndroidUtilities.dp(8.0f));
                    path3.addRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), direction);
                    canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    if (t1Var.Cb == null) {
                        if (t1Var.Mb == null) {
                            t1Var.Mb = new ih.k();
                        }
                        t1Var.Mb.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                        t1Var.Mb.setBounds((int) y2Var.getImageX(), (int) y2Var.getImageY(), (int) y2Var.getImageX2(), (int) y2Var.getImageY2());
                        t1Var.Mb.draw(canvas2);
                    }
                    t1Var.invalidate();
                    canvas2.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, t1Var.getWidth(), t1Var.getHeight(), (int) (t1Var.Gb * 255.0f), 31);
                    int alpha7 = org.telegram.ui.ActionBar.j6.f19992i2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19992i2.setAlpha((int) (alpha7 * 0.7f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.j6.f19992i2);
                    org.telegram.ui.ActionBar.j6.f19992i2.setAlpha(alpha7);
                    canvas.translate(t1Var.Hb + AndroidUtilities.dp(4.0f), t1Var.Ib);
                    Drawable drawable = org.telegram.ui.ActionBar.j6.L3;
                    drawable.setBounds(i13, i13, drawable.getIntrinsicWidth(), org.telegram.ui.ActionBar.j6.L3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.j6.L3.draw(canvas);
                    canvas.translate(org.telegram.ui.ActionBar.j6.L3.getIntrinsicWidth() + AndroidUtilities.dp(6.0f), 0.0f);
                    ih.k.f(canvas, t1Var.Jb);
                    canvas.restore();
                    if (t1Var.I2 != null && y2Var.getVisible() && t1Var.f22086i3 == 0) {
                        int i27 = SharedConfig.bubbleRadius;
                        if (i27 > 2) {
                            dp = AndroidUtilities.dp(i27 - 2);
                            z11 = SharedConfig.bubbleRadius >= 10;
                        } else {
                            dp = AndroidUtilities.dp(i27);
                        }
                        int imageX = (int) (y2Var.getImageX() + AndroidUtilities.dp(9.0f));
                        int imageY = (int) (y2Var.getImageY() + AndroidUtilities.dp(6.0f));
                        rectF.set(imageX - AndroidUtilities.dp(4.0f), imageY - AndroidUtilities.dp(1.5f), AndroidUtilities.dp(z11 ? 2.0f : 0.0f) + AndroidUtilities.dp(4.0f) + t1Var.f22141m2 + imageX, AndroidUtilities.dp(1.5f) + t1Var.I2.getHeight() + imageY);
                        canvas.drawRoundRect(rectF, dp, dp, t1Var.M2(str));
                        canvas.save();
                        if (z11) {
                            i13 = 2;
                        }
                        canvas.translate(imageX + i13, imageY);
                        ih.k.f(canvas, t1Var.I2);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final boolean n3() {
        if (this.f22289w7 != null) {
            return this.f22321y7;
        }
        return this.B;
    }

    public final void n4() {
        float imageHeight;
        float f10;
        float f11;
        float dp;
        int i10;
        int i11;
        int i12;
        float f12;
        int i13;
        int i14;
        MessageObject messageObject = this.f22273v7;
        int i15 = messageObject.type;
        s1 s1Var = this.Wc;
        int i16 = 0;
        boolean z4 = true;
        if (i15 != 1 && i15 != 20 && this.H1 != 4 && i15 != 8 && i15 != 23) {
            float f13 = 43.0f;
            float f14 = 11.0f;
            float f15 = 0.0f;
            float f16 = 10.0f;
            if (this.f22042f2) {
                int i17 = this.f22234s8;
                if (!messageObject.isOutOwner()) {
                    f14 = 17.0f;
                }
                this.f22143m4 = AndroidUtilities.dp(f14) + i17 + this.f22129l4;
                int i18 = this.f22182p0 - this.f22172o4;
                if (this.F) {
                    f16 = 9.0f;
                }
                int dp2 = ((i18 - AndroidUtilities.dp(f16)) - this.f22099j2) - AndroidUtilities.dp(17.0f);
                if (this.f22063g9 && this.f22222ra != 3) {
                    if (f4()) {
                        f13 = 41.3f;
                    }
                } else {
                    f13 = 0.0f;
                }
                dp = dp2 - AndroidUtilities.dp(f13);
                this.f22158n4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Ic, y3());
            } else {
                if (this.f22166nd) {
                    int backgroundDrawableLeft = getBackgroundDrawableLeft();
                    if (this.f22273v7.isOutOwner()) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    this.f22143m4 = AndroidUtilities.dp(i14 + 11) + backgroundDrawableLeft;
                } else {
                    int i19 = this.f22234s8;
                    if (!messageObject.isOutOwner() && !this.f22077h8 && !this.G) {
                        f14 = 17.0f;
                    }
                    this.f22143m4 = AndroidUtilities.dp(f14) + i19 + this.f22129l4;
                }
                int i20 = this.f22182p0 - this.f22172o4;
                if (this.F) {
                    f12 = 9.0f;
                } else {
                    f12 = 10.0f;
                }
                int dp3 = i20 - AndroidUtilities.dp(f12);
                if (this.f22063g9 && this.f22222ra != 3) {
                    if (f4()) {
                        f13 = 41.3f;
                    }
                } else {
                    f13 = 0.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f13);
                mg.r0 r0Var = this.K;
                if (!r0Var.f14128s && !r0Var.f14114b) {
                    if (this.f22273v7.type == 9 && this.I == null) {
                        f15 = 10.0f;
                    }
                    i13 = AndroidUtilities.dp(f15) + r0Var.f14125p;
                } else {
                    i13 = 0;
                }
                dp = dp4 - i13;
                this.f22158n4 = AndroidUtilities.lerp(dp, AndroidUtilities.dp(9.0f) + this.Ic, y3());
            }
        } else {
            if (s1Var.f21838f0) {
                f10 = s1Var.m0;
                f11 = s1Var.f21875n0;
                imageHeight = s1Var.f21883p0;
            } else {
                nh.y2 y2Var = this.P0;
                float imageX = y2Var.getImageX();
                float imageY = y2Var.getImageY();
                imageHeight = y2Var.getImageHeight();
                f10 = imageX;
                f11 = imageY;
            }
            this.f22143m4 = f10 + AndroidUtilities.dp(5.0f) + this.f22129l4;
            dp = f11 + imageHeight + AndroidUtilities.dp(6.0f);
            float dp5 = imageHeight + AndroidUtilities.dp(6.0f);
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.Z3;
            if (textLayoutBlocks == null) {
                i10 = 0;
            } else {
                i10 = -textLayoutBlocks.textHeight();
            }
            this.f22158n4 = AndroidUtilities.lerp(dp5, i10 - AndroidUtilities.dp(4.0f), y3()) + f11;
            z4 = false;
        }
        this.f22143m4 += getExtraTextX();
        MessageObject messageObject2 = this.f22273v7;
        if (messageObject2 != null && (i11 = messageObject2.type) != 0 && i11 != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.f22273v7.isSponsored()) {
            if (z4 && this.K1) {
                this.f22158n4 -= (1.0f - y3()) * (AndroidUtilities.dp(16.0f) + this.f21998c2);
            }
            if (z4) {
                i12 = AndroidUtilities.dp(14.0f) + this.f21998c2;
            } else {
                i12 = 0;
            }
            float f17 = dp - i12;
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Z3;
            if (textLayoutBlocks2 != null) {
                i16 = AndroidUtilities.dp(4.0f) + textLayoutBlocks2.textHeight(s1Var);
            }
            this.f22154n0 = (int) ((f17 + AndroidUtilities.lerp(i16, AndroidUtilities.dp(6.0f), y3())) - s1Var.f21857j0);
        }
        MessageObject messageObject3 = this.f22273v7;
        if (messageObject3 != null && messageObject3.type == 17) {
            this.f22158n4 += this.f22001c6;
        }
    }

    public final void o0() {
        nr nrVar;
        boolean z4 = this.f22098j1;
        if (z4 || this.f22112k1) {
            if ((z4 && this.l1 == 1.0f) || (!z4 && this.l1 == 0.0f)) {
                this.f22112k1 = false;
            }
            if (z4) {
                nrVar = nr.f27347g;
            } else {
                nrVar = nr.f27348i;
            }
            this.f22155n1 = (int) Math.ceil(nrVar.getInterpolation(this.l1) * AndroidUtilities.dp(35.0f));
            if (this.f22273v7.type == 36) {
                if (AndroidUtilities.dp(35.0f) + getCurrentBackgroundRight() > getWidth()) {
                    this.f22155n1 = 0;
                }
            }
            if (!this.f22273v7.isOutOwner() || this.f22273v7.hasWideCode) {
                y4();
            }
            if (this.f22112k1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f22140m1;
                this.f22140m1 = elapsedRealtime;
                if (this.f22098j1) {
                    float f10 = (((float) j10) / 200.0f) + this.l1;
                    this.l1 = f10;
                    if (f10 > 1.0f) {
                        this.l1 = 1.0f;
                    }
                } else {
                    float f11 = this.l1 - (((float) j10) / 200.0f);
                    this.l1 = f11;
                    if (f11 <= 0.0f) {
                        this.l1 = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public final void o1() {
        float f10;
        float f11;
        int i10;
        int measureText;
        boolean z4;
        if (this.O2) {
            s1(0);
        }
        if (this.O2 && this.L2 == null) {
            this.f22142m3 = AndroidUtilities.dp(33.0f);
            CharSequence charSequence = this.Z2;
            if (charSequence == null) {
                int i11 = this.Y2;
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
                            TL_stars.StarGift starGift = this.Ae;
                            if (starGift != null) {
                                if (starGift.auction_start_date > ConnectionsManager.getInstance(this.F7).getCurrentTime()) {
                                    charSequence = LocaleController.getString(R.string.OpenGiftAuctionView);
                                    z4 = false;
                                } else {
                                    if (this.Ae.sold_out) {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionResults);
                                    } else {
                                        charSequence = LocaleController.getString(R.string.OpenGiftAuctionActive);
                                    }
                                    z4 = true;
                                }
                                if (z4) {
                                    SpannableString spannableString = new SpannableString("*");
                                    spannableString.setSpan(new mq(R.drawable.filled_gift_sell_24, 0), 0, spannableString.length(), 33);
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
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.f22273v7.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        charSequence = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                }
            }
            if (this.f22273v7.isSponsored() && this.G8 < (measureText = (int) (org.telegram.ui.ActionBar.j6.M2.measureText(charSequence, 0, charSequence.length()) + AndroidUtilities.dp(75.0f)))) {
                this.G8 = measureText;
            }
            int dp = this.G8 - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, org.telegram.ui.ActionBar.j6.M2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.M2, AndroidUtilities.dp(2.0f) + dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.L2 = staticLayout;
            int lineCount = staticLayout.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f10 = this.L2.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.M2 = f10;
            if (this.L2.getLineCount() > 0) {
                f12 = this.L2.getLineLeft(0);
            }
            this.N2 = f12;
            int i12 = this.G8;
            int i13 = this.Y2;
            if (i13 != 82 && i13 != 81 && i13 != 80 && i13 != 84 && i13 != 83) {
                f11 = 34.0f;
            } else {
                f11 = 13.0f;
            }
            this.f22142m3 = i12 - AndroidUtilities.dp(f11);
            int dp2 = AndroidUtilities.dp(46.0f) + this.f22182p0;
            this.f22182p0 = dp2;
            if (this.f22273v7.type == 12) {
                this.f22182p0 = AndroidUtilities.dp(14.0f) + dp2;
            }
            if (this.f22273v7.isSponsored()) {
                this.f22182p0 = AndroidUtilities.dp(2.0f) + this.f22182p0;
            }
            StaticLayout staticLayout2 = this.L2;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                int ceil = ((int) (this.f22142m3 - Math.ceil(this.L2.getLineWidth(0)))) / 2;
                if (this.Y2 == 0) {
                    i10 = AndroidUtilities.dp(8.0f);
                } else {
                    i10 = 0;
                }
                this.f22114k3 = ceil + i10;
                int lineLeft = (int) this.L2.getLineLeft(0);
                this.f22128l3 = lineLeft;
                this.f22114k3 += -lineLeft;
            }
        }
    }

    public final void o2(Canvas canvas, int i10) {
        float videoSavedProgress;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && !messageObject.isLivePhoto() && this.f22116k5 > 0.0f) {
            nh.y2 y2Var = this.P0;
            if (y2Var.getVisible()) {
                MessageObject messageObject2 = this.f22273v7;
                if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
                    videoSavedProgress = this.f22273v7.getVideoStartsTimestamp() / ((float) this.f22273v7.getDuration());
                } else {
                    videoSavedProgress = this.f22273v7.getVideoSavedProgress();
                }
                float clamp01 = Utilities.clamp01(videoSavedProgress);
                if (clamp01 > 0.0f) {
                    int[] roundRadius = y2Var.getRoundRadius();
                    canvas.save();
                    if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                        canvas.clipRect(y2Var.getImageX(), y2Var.getImageY(), y2Var.getImageX2(), y2Var.getImageY2());
                    } else {
                        if (this.Eb == null) {
                            this.Eb = new Path();
                            this.Fb = new float[8];
                        }
                        float[] fArr = this.Fb;
                        float max = Math.max(0, roundRadius[0]);
                        fArr[1] = max;
                        fArr[0] = max;
                        float[] fArr2 = this.Fb;
                        float max2 = Math.max(0, roundRadius[1]);
                        fArr2[3] = max2;
                        fArr2[2] = max2;
                        float[] fArr3 = this.Fb;
                        float max3 = Math.max(0, roundRadius[2]);
                        fArr3[5] = max3;
                        fArr3[4] = max3;
                        float[] fArr4 = this.Fb;
                        float max4 = Math.max(0, roundRadius[3]);
                        fArr4[7] = max4;
                        fArr4[6] = max4;
                        this.Eb.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(y2Var.getImageX(), y2Var.getImageY(), y2Var.getImageX2(), y2Var.getImageY2());
                        this.Eb.addRoundRect(rectF, this.Fb, Path.Direction.CW);
                        canvas.clipPath(this.Eb);
                    }
                    org.telegram.ui.ActionBar.j6.f20081n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f22116k5 * 0.35f, -1));
                    canvas.drawRect(y2Var.getImageX(), y2Var.getImageY2() - AndroidUtilities.dp(3.0f), y2Var.getImageX2(), y2Var.getImageY2(), org.telegram.ui.ActionBar.j6.f20081n2);
                    org.telegram.ui.ActionBar.j6.f20081n2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f22116k5, i10));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(y2Var.getImageX() - AndroidUtilities.dp(2.0f), y2Var.getImageY2() - AndroidUtilities.dp(3.0f), (y2Var.getImageWidth() * clamp01) + y2Var.getImageX(), y2Var.getImageY2());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20081n2);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean o3() {
        if (this.f22166nd && this.f22180od) {
            return true;
        }
        return false;
    }

    public final void o4() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        if (this.f22273v7 != null) {
            int i10 = this.F7;
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLRPC.MessageFwdHeader messageFwdHeader = this.f22273v7.messageOwner.fwd_from;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.f22273v7.getDialogId() == clientUserId || this.f22273v7.getDialogId() == 1271266957)) {
                this.Wb = MessagesController.getInstance(i10).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            } else if (messageFwdHeader != null && this.f22273v7.getDialogId() == 489000) {
                long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
                if (peerDialogId >= 0) {
                    this.Vb = messagesController.getUser(Long.valueOf(peerDialogId));
                } else {
                    this.Wb = messagesController.getChat(Long.valueOf(-peerDialogId));
                }
            } else if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
                long j10 = peer.user_id;
                if (j10 != 0) {
                    if (!this.M7) {
                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                        if (peer2 instanceof TLRPC.TL_peerUser) {
                            this.Vb = messagesController.getUser(Long.valueOf(peer2.user_id));
                            return;
                        }
                    }
                    this.Vb = messagesController.getUser(Long.valueOf(j10));
                } else if (peer.channel_id != 0) {
                    if (this.f22273v7.isSavedFromMegagroup()) {
                        TLRPC.Peer peer3 = messageFwdHeader.from_id;
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            this.Vb = messagesController.getUser(Long.valueOf(peer3.user_id));
                            return;
                        }
                    }
                    this.Wb = messagesController.getChat(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                } else {
                    long j11 = peer.chat_id;
                    if (j11 != 0) {
                        TLRPC.Peer peer4 = messageFwdHeader.from_id;
                        if (peer4 instanceof TLRPC.TL_peerUser) {
                            this.Vb = messagesController.getUser(Long.valueOf(peer4.user_id));
                        } else {
                            this.Wb = messagesController.getChat(Long.valueOf(j11));
                        }
                    }
                }
            } else if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.f22273v7.getDialogId() == clientUserId)) {
                this.Vb = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.f22273v7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                this.Vb = tL_user;
                tL_user.first_name = messageFwdHeader.saved_from_name;
            } else if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.f22273v7.getDialogId() == clientUserId)) {
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                this.Vb = tL_user2;
                tL_user2.first_name = messageFwdHeader.from_name;
            } else {
                long dialogId = this.f22273v7.getDialogId();
                long fromChatId = this.f22273v7.getFromChatId();
                TLRPC.Chat chat2 = null;
                if (DialogObject.isChatDialog(fromChatId)) {
                    chat = messagesController.getChat(Long.valueOf(-fromChatId));
                } else {
                    chat = null;
                }
                if (DialogObject.isChatDialog(dialogId)) {
                    chat2 = messagesController.getChat(Long.valueOf(-dialogId));
                }
                if (DialogObject.isEncryptedDialog(this.f22273v7.getDialogId())) {
                    if (this.f22273v7.isOutOwner()) {
                        this.Vb = UserConfig.getInstance(i10).getCurrentUser();
                        return;
                    }
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.f22273v7.getDialogId())));
                    if (encryptedChat != null) {
                        this.Vb = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(fromChatId) && (!this.f22273v7.messageOwner.post || (chat != null && chat.signature_profiles))) {
                    this.Vb = messagesController.getUser(Long.valueOf(fromChatId));
                } else if (this.f22273v7.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
                    this.Wb = chat2;
                } else if (DialogObject.isChatDialog(fromChatId)) {
                    this.Wb = chat;
                } else {
                    TLRPC.Message message = this.f22273v7.messageOwner;
                    if (message.post) {
                        this.Wb = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
                    }
                }
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && imageReceiver == this.P0 && messageObject.isAnimatedSticker()) {
            this.Gc.O1(this.f22273v7);
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
        NotificationCenter.getInstance(this.F7).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            messageObject.animateComments = false;
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
            }
        }
        RichMessageLayout richMessageLayout2 = this.Wc.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.attach(this);
        }
        org.telegram.ui.Components.c9 c9Var = this.U3;
        if (c9Var != null) {
            c9Var.g();
        }
        dh.j jVar = this.Y5;
        if (jVar != null) {
            jVar.a();
        }
        dh.j jVar2 = this.Z5;
        if (jVar2 != null) {
            jVar2.a();
        }
        ArrayList arrayList = this.V5;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r1) obj).q();
        }
        MessageObject messageObject2 = this.f22289w7;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            t1Var = this;
            t1Var.V3(messageObject2, this.f22305x7, this.f22335z7, this.f22321y7, this.A7, this.B7);
            t1Var.f22289w7 = null;
            t1Var.f22305x7 = null;
        } else {
            t1Var = this;
        }
        CheckBoxBase checkBoxBase = t1Var.f22084i1;
        if (checkBoxBase != null) {
            checkBoxBase.f22960l = true;
        }
        CheckBoxBase checkBoxBase2 = t1Var.f22070h1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f22960l = true;
        }
        d21 d21Var = t1Var.f21981b0;
        if (d21Var != null) {
            d21Var.a();
        }
        CheckBoxBase checkBoxBase3 = t1Var.f22323y9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f22960l = true;
        }
        if (t1Var.O8 != null) {
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = t1Var.O8;
                if (i11 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i11].f22960l = true;
                i11++;
            }
        }
        t1Var.J0 = true;
        float f12 = 0.0f;
        t1Var.f22296we = 0.0f;
        t1Var.f22280ve = 0.0f;
        t1Var.f22155n1 = 0;
        y4();
        ImageReceiver imageReceiver = t1Var.f22106j9;
        imageReceiver.setParentView((View) getParent());
        imageReceiver.onAttachedToWindow();
        F0();
        MessageObject messageObject3 = t1Var.f22273v7;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i12 = t1Var.H1;
        if (i12 == 4 && t1Var.f22118k7) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(t1Var.f22273v7);
            t1Var.A1 = isPlayingMessage;
            if (isPlayingMessage) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            t1Var.C1 = f11;
            t1Var.B1 = 0;
        } else {
            t1Var.A1 = false;
            t1Var.C1 = 0.0f;
            if ((i12 == 4 || i12 == 2) && t1Var.f22283w1) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            t1Var.f22330z1 = f10;
        }
        if (getDelegate() != null && getDelegate().C2() != null) {
            n9 C2 = getDelegate().C2();
            C2.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == C2.f22702w) {
                C2.W = t1Var;
            }
        }
        if (t1Var.H1 == 5) {
            if (MediaController.getInstance().isPlayingMessage(t1Var.f22273v7)) {
                f12 = 1.0f;
            }
            t1Var.f22124kd = f12;
        }
        mg.r0 r0Var = t1Var.K;
        ArrayList arrayList2 = r0Var.v;
        r0Var.G = true;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((mg.o0) arrayList2.get(i13)).a();
        }
        FlagSecureReason flagSecureReason = t1Var.f21994bd;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        k4 k4Var = t1Var.C7;
        if (k4Var != null) {
            ArrayList arrayList3 = k4Var.f21283c;
            if (!k4Var.C) {
                k4Var.C = true;
                ih.j jVar3 = k4Var.f21289l;
                if (jVar3 != null) {
                    jVar3.b(k4Var.f21281a);
                }
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    j4 j4Var = (j4) arrayList3.get(i14);
                    if (!j4Var.J) {
                        j4Var.J = true;
                        j4Var.f21248f.onAttachedToWindow();
                    }
                }
            }
        }
        p4();
        MessageObject messageObject4 = t1Var.f22273v7;
        if (messageObject4 != null && messageObject4.type == 20 && t1Var.Jb != null) {
            invalidate();
        }
        org.telegram.ui.Components.j5 j5Var = t1Var.f22007cc;
        if (j5Var != null) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = t1Var.f22022dc;
        if (j5Var2 != null) {
            j5Var2.a();
        }
        ih.j jVar4 = t1Var.Cb;
        if (jVar4 != null) {
            if (jVar4.f7598i) {
                ih.j w32 = w3();
                t1Var.Cb = w32;
                Integer num = t1Var.Db;
                if (num != null) {
                    w32.f7600k.put(this, num);
                }
            } else {
                jVar4.a(this);
            }
        }
        o0 o0Var = t1Var.v;
        if (o0Var != null) {
            ArrayList arrayList4 = o0Var.f21482q;
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                ((n0) arrayList4.get(i15)).a();
            }
        }
        cx0 cx0Var = t1Var.f21982b1;
        if (cx0Var != null) {
            for (int i16 = 0; i16 < cx0Var.f24072b; i16++) {
                cx0Var.f24073c[i16].a(this);
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
        int i10 = this.F7;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        AnimatorSet animatorSet = this.D7;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.D7 = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
        CheckBoxBase checkBoxBase = this.f22084i1;
        if (checkBoxBase != null) {
            checkBoxBase.f22960l = false;
        }
        dh.j jVar = this.Y5;
        if (jVar != null) {
            jVar.f4908b.onDetachedFromWindow();
            jVar.f4918x.f();
        }
        dh.j jVar2 = this.Z5;
        if (jVar2 != null) {
            jVar2.f4908b.onDetachedFromWindow();
            jVar2.f4918x.f();
        }
        lf.p pVar = this.f22255u4;
        if (pVar != null) {
            pVar.b();
            this.f22255u4 = null;
        }
        RichMessageLayout richMessageLayout = this.f22273v7.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        s1 s1Var = this.Wc;
        RichMessageLayout richMessageLayout2 = s1Var.L0;
        if (richMessageLayout2 != null) {
            richMessageLayout2.detach(this);
        }
        ArrayList arrayList = this.V5;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((r1) obj).r();
        }
        org.telegram.ui.Components.c9 c9Var = this.U3;
        if (c9Var != null) {
            c9Var.h();
        }
        CheckBoxBase checkBoxBase2 = this.f22070h1;
        if (checkBoxBase2 != null) {
            checkBoxBase2.f22960l = false;
        }
        if (this.O8 != null) {
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.O8;
                if (i12 >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i12].f22960l = false;
                i12++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.f22323y9;
        if (checkBoxBase3 != null) {
            checkBoxBase3.f22960l = false;
        }
        this.J0 = false;
        k4 k4Var = this.C7;
        if (k4Var != null) {
            k4Var.e();
        }
        this.f22106j9.onDetachedFromWindow();
        d21 d21Var = this.f21981b0;
        if (d21Var != null) {
            d21Var.b();
        }
        F0();
        if (this.D4 && this.B4 != null && this.C4 != null) {
            ImageLoader.getInstance().removeTestWebFile(this.B4);
            this.D4 = false;
        }
        cx0 cx0Var = this.f21982b1;
        if (cx0Var != null) {
            cx0Var.a(this);
        }
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().C2() != null) {
            n9 C2 = getDelegate().C2();
            C2.getClass();
            if (getMessageObject() != null && getMessageObject().getId() == C2.f22702w) {
                C2.W = null;
            }
        }
        s1Var.f21906v0 = false;
        if (MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
            org.telegram.ui.ActionBar.j6.x0().f24192i = null;
        }
        ValueAnimator valueAnimator = this.f22095id;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f22095id.cancel();
        }
        this.K.q();
        this.f22081hd = false;
        FlagSecureReason flagSecureReason = this.f21994bd;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        org.telegram.ui.Components.j5 j5Var = this.f22007cc;
        if (j5Var != null) {
            j5Var.b();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22022dc;
        if (j5Var2 != null) {
            j5Var2.b();
        }
        ih.j jVar3 = this.Cb;
        if (jVar3 != null) {
            jVar3.b(this);
        }
        o0 o0Var = this.v;
        if (o0Var != null) {
            ArrayList arrayList2 = o0Var.f21482q;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                n0 n0Var = (n0) arrayList2.get(i13);
                int i14 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = n0Var.f21416c;
                    if (i14 < imageReceiverArr.length) {
                        imageReceiverArr[i14].onDetachedFromWindow();
                        i14++;
                    }
                }
            }
        }
        lf.j.d().f(this.f22068ge);
    }

    @Override
    public void onDraw(Canvas canvas) {
        S1(canvas);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        boolean z10;
        int i10 = this.H1;
        if (i10 != 3 && i10 != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        m4(true, z10, false);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int z22 = (int) z2(motionEvent);
        int i10 = 0;
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            while (true) {
                SparseArray sparseArray = this.f22151md;
                if (i10 >= sparseArray.size()) {
                    break;
                } else if (((Rect) sparseArray.valueAt(i10)).contains(x10, z22)) {
                    int keyAt = sparseArray.keyAt(i10);
                    if (keyAt != this.Ad) {
                        this.Ad = keyAt;
                        I3(keyAt, 32768, null);
                        return true;
                    }
                    return true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.Ad = 0;
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
        MessageObject messageObject = this.f22273v7;
        boolean z4 = true;
        if (messageObject == null || (!messageObject.checkLayout() && this.S4 == AndroidUtilities.displaySize.y)) {
            t1Var = this;
        } else {
            this.f22282w0 = true;
            MessageObject messageObject2 = this.f22273v7;
            this.f22273v7 = null;
            t1Var = this;
            t1Var.X3(messageObject2, this.H, this.C, this.B, this.D, false);
            t1Var.f22282w0 = false;
        }
        w4();
        int i13 = t1Var.S + t1Var.f21996c0 + t1Var.f22025e0 + t1Var.f22182p0 + t1Var.f22212r0 + t1Var.f21967a0;
        ug.a draftMessageMeasureController = getDraftMessageMeasureController();
        if (draftMessageMeasureController != null && draftMessageMeasureController.a(t1Var.f22273v7)) {
            int max = Math.max(0, (((draftMessageMeasureController.f45492a.getHeight() - draftMessageMeasureController.f45492a.getPaddingTop()) - draftMessageMeasureController.f45492a.getPaddingBottom()) - draftMessageMeasureController.d) - i13);
            if (max <= 0) {
                z4 = false;
            }
            draftMessageMeasureController.e = z4;
            if (draftMessageMeasureController.f45493b > 0 && !z4) {
                draftMessageMeasureController.c(0, 0L);
            }
            i12 = max + i13;
        } else {
            i12 = i13;
        }
        t1Var.f22110je = Math.max(0, i12 - i13);
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
        this.f22273v7.loadedFileSize = j10;
        p1(j10, j11);
        if (this.f22252u1) {
            this.M0.o(min, true);
        } else {
            this.L0.o(min, true);
        }
        int i10 = this.H1;
        if (i10 != 3 && i10 != 5) {
            if (this.T4 != 0) {
                if (this.U4 != 1) {
                    m4(false, false, false);
                }
            } else if (this.L4 != 1) {
                m4(false, false, false);
            }
        } else if (this.T4 != 0) {
            if (this.U4 != 1) {
                m4(false, false, false);
            }
        } else if (this.L4 != 4) {
            m4(false, false, false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f22273v7.loadedFileSize = j10;
        RadialProgress2 radialProgress2 = this.L0;
        radialProgress2.o(min, true);
        if (j10 == j11 && ((this.I != null || this.f22273v7.isPaid()) && SendMessagesHelper.getInstance(this.F7).isSendingMessage(this.f22273v7.getId()) && ((i10 = this.L4) == 1 || (i10 == 4 && this.H1 == 5)))) {
            this.N0 = true;
            getIconForCurrentState();
            radialProgress2.setIcon(6, false, true);
        }
        long j12 = this.f22267v1;
        if (j12 > 0 && Math.abs(j12 - j11) > 1048576) {
            this.f22267v1 = j11;
        }
        p1(j10, j11);
    }

    @Override
    public final void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (this.f22190p8 && Build.VERSION.SDK_INT >= 23) {
            MessageObject messageObject = this.f22273v7;
            if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
                viewStructure.setText(this.f22273v7.messageText);
                return;
            }
            MessageObject messageObject2 = this.f22273v7;
            if (messageObject2 != null && (charSequence = messageObject2.caption) != null && charSequence.length() > 0) {
                viewStructure.setText(this.f22273v7.caption);
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
        q0(getX(), this.Pc, getMeasuredWidth(), this.Qc);
    }

    public final void p1(long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.p1(long, long):void");
    }

    public final void p2(Canvas canvas, float f10, float f11, float f12, float f13, boolean z4) {
        boolean z10;
        float f14;
        float f15;
        float f16;
        double d;
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable L2;
        float f17;
        boolean z14;
        s1 s1Var;
        float f18;
        float f19;
        float f20;
        boolean z15;
        boolean z16;
        String str;
        Drawable L22;
        float n10;
        float f21;
        String str2;
        Drawable L23;
        if (f13 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f22 = (f13 * 0.5f) + 0.5f;
        float f23 = f10 * f13;
        mg.r0 r0Var = this.K;
        if (r0Var.f14114b) {
            f14 = r0Var.j(1.0f);
        } else {
            f14 = 0.0f;
        }
        int alpha = org.telegram.ui.ActionBar.j6.T2.getAlpha();
        float N2 = N2(f11);
        StaticLayout staticLayout = this.Sb;
        s1 s1Var2 = this.Wc;
        if (staticLayout == null && !s1Var2.F) {
            s1Var = s1Var2;
            z14 = z10;
            f18 = f23;
            f15 = 10.0f;
            f19 = 2.0f;
            d = 1.0d;
        } else {
            boolean z17 = s1Var2.f21848h1;
            f15 = 10.0f;
            if (z17) {
                f16 = this.f22178ob;
            } else {
                f16 = f12;
            }
            float f24 = f16 + f14;
            d = 1.0d;
            boolean z18 = s1Var2.F;
            if (z18 && s1Var2.H == null && staticLayout != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z18 && s1Var2.H != null && staticLayout == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z18 && s1Var2.H != null && staticLayout != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((!this.f22166nd || !s1Var2.l1) && z17 && !z11) {
                if (z12) {
                    f24 = s1Var2.I;
                } else {
                    float f25 = s1Var2.I;
                    float f26 = s1Var2.K1;
                    f24 = (f24 * f26) + ((1.0f - f26) * f25);
                }
            }
            MessageObject.GroupedMessages groupedMessages = this.H;
            if (groupedMessages != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                if (transitionParams.backgroundChangeBounds) {
                    f24 += transitionParams.offsetRight;
                }
            }
            if (s1Var2.f21910w0) {
                f24 += this.f22296we;
            }
            if (f4()) {
                if (this.f22273v7.shouldDrawWithoutBackground()) {
                    L2 = L2("drawableMsgStickerReplies");
                } else {
                    L2 = org.telegram.ui.ActionBar.j6.f19868b4;
                }
            } else if (!this.f22273v7.isOutOwner()) {
                if (z4) {
                    L2 = org.telegram.ui.ActionBar.j6.R3;
                } else {
                    L2 = org.telegram.ui.ActionBar.j6.Q3;
                }
            } else {
                L2 = L2("drawableMsgOutReplies");
            }
            float n11 = a0.n(L2, f24, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize());
            if (z11) {
                f17 = s1Var2.K1 * f23;
            } else if (z12) {
                f17 = (1.0f - s1Var2.K1) * f23;
            } else {
                f17 = f23;
            }
            L2.setAlpha((int) (f17 * 255.0f));
            if (z10) {
                canvas.save();
                z14 = z10;
                canvas.scale(f22, f22, kh.a2.b(AndroidUtilities.dp(3.0f) + n11, this.Tb, 2.0f, f24), L2.getBounds().centerY());
            } else {
                z14 = z10;
            }
            L2.draw(canvas);
            L2.setAlpha(255);
            if (s1Var2.F) {
                if (z13) {
                    canvas.save();
                    f18 = f23;
                    f19 = 2.0f;
                    org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((1.0d - s1Var2.K1) * alpha));
                    canvas.translate(f24 + n11 + AndroidUtilities.dp(3.0f), N2);
                    s1Var = s1Var2;
                    s1Var.H.draw(canvas);
                    canvas.restore();
                } else {
                    s1Var = s1Var2;
                    f18 = f23;
                    f19 = 2.0f;
                }
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * f17));
            } else {
                s1Var = s1Var2;
                f18 = f23;
                f19 = 2.0f;
            }
            canvas.save();
            canvas.translate(f24 + n11 + AndroidUtilities.dp(3.0f), N2);
            StaticLayout staticLayout2 = this.Sb;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            } else {
                StaticLayout staticLayout3 = s1Var.H;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            }
            canvas.restore();
            if (this.Sb != null) {
                f14 += n11 + this.Tb + AndroidUtilities.dp(10.0f);
            }
            if (z14) {
                canvas.restore();
            }
            if (s1Var.F) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            s1Var.J = f24;
        }
        if (this.Pb != null) {
            boolean z19 = s1Var.f21848h1;
            if (z19) {
                f21 = this.f22178ob;
            } else {
                f21 = f12;
            }
            float f27 = f21 + f14;
            if ((!this.f22166nd || !s1Var.l1) && z19) {
                float f28 = s1Var.K;
                float f29 = s1Var.K1;
                f27 = (f27 * f29) + ((1.0f - f29) * f28);
            }
            MessageObject.GroupedMessages groupedMessages2 = this.H;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f27 += transitionParams2.offsetRight;
                }
            }
            if (s1Var.f21910w0) {
                f27 += this.f22296we;
            }
            if (f4()) {
                if (this.f22273v7.shouldDrawWithoutBackground()) {
                    L23 = L2("drawableMsgStickerViews");
                } else {
                    L23 = org.telegram.ui.ActionBar.j6.f19849a4;
                }
            } else if (!this.f22273v7.isOutOwner()) {
                if (z4) {
                    L23 = org.telegram.ui.ActionBar.j6.N3;
                } else {
                    L23 = org.telegram.ui.ActionBar.j6.M3;
                }
            } else {
                if (z4) {
                    str2 = "drawableMsgOutViewsSelected";
                } else {
                    str2 = "drawableMsgOutViews";
                }
                L23 = L2(str2);
            }
            float n12 = a0.n(L23, f27, AndroidUtilities.dp(1.5f) + N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() - AndroidUtilities.dp(f19));
            if (z14) {
                canvas.save();
                canvas.scale(f22, f22, (((AndroidUtilities.dp(3.0f) + L23.getIntrinsicWidth()) + this.Qb) / f19) + f27, L23.getBounds().centerY());
            }
            L23.setAlpha((int) (f18 * 255.0f));
            L23.draw(canvas);
            L23.setAlpha(255);
            if (s1Var.f21831d2 != null) {
                canvas.save();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) ((d - s1Var.K1) * alpha));
                canvas.translate(f27 + n12 + AndroidUtilities.dp(3.0f), N2);
                ih.k.f(canvas, s1Var.f21831d2);
                canvas.restore();
                org.telegram.ui.ActionBar.j6.T2.setAlpha((int) (alpha * s1Var.K1));
            }
            canvas.save();
            canvas.translate(f27 + n12 + AndroidUtilities.dp(3.0f), N2);
            ih.k.f(canvas, this.Pb);
            canvas.restore();
            if (z14) {
                canvas.restore();
            }
            f14 += this.Qb + n12 + AndroidUtilities.dp(f15);
            if (s1Var.f21831d2 != null) {
                org.telegram.ui.ActionBar.j6.T2.setAlpha(alpha);
            }
            s1Var.L = f27;
        }
        boolean z20 = this.V7;
        if (!z20 && !s1Var.B) {
            return;
        }
        boolean z21 = s1Var.f21848h1;
        if (z21) {
            f20 = this.f22178ob;
        } else {
            f20 = f12;
        }
        float f30 = f20 + f14;
        boolean z22 = s1Var.B;
        if (z22 && z20) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z22 && !z20) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!this.f22166nd && z21 && !z15) {
            if (z16) {
                f30 = s1Var.D;
            } else {
                float f31 = s1Var.D;
                float f32 = s1Var.K1;
                f30 = (f30 * f32) + ((1.0f - f32) * f31);
            }
        }
        MessageObject.GroupedMessages groupedMessages3 = this.H;
        if (groupedMessages3 != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages3.transitionParams;
            if (transitionParams3.backgroundChangeBounds) {
                f30 += transitionParams3.offsetRight;
            }
        }
        if (s1Var.f21910w0) {
            f30 += this.f22296we;
        }
        if (f4()) {
            if (this.f22273v7.shouldDrawWithoutBackground()) {
                L22 = L2("drawableMsgStickerPinned");
            } else {
                L22 = org.telegram.ui.ActionBar.j6.Z3;
            }
        } else if (!this.f22273v7.isOutOwner()) {
            if (z4) {
                L22 = org.telegram.ui.ActionBar.j6.V3;
            } else {
                L22 = org.telegram.ui.ActionBar.j6.U3;
            }
        } else {
            if (z4) {
                str = "drawableMsgOutPinnedSelected";
            } else {
                str = "drawableMsgOutPinned";
            }
            L22 = L2(str);
        }
        if (s1Var.B) {
            if (this.V7) {
                L22.setAlpha((int) (f18 * 255.0f * s1Var.K1));
                n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            } else {
                L22.setAlpha((int) ((1.0f - s1Var.K1) * f18 * 255.0f));
                n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
            }
        } else {
            L22.setAlpha((int) (f18 * 255.0f));
            n10 = a0.n(L22, f30, N2, org.telegram.ui.ActionBar.j6.T2.getTextSize() + AndroidUtilities.dp(1.0f));
        }
        if (z14) {
            canvas.save();
            canvas.scale(f22, f22, (n10 / f19) + f30, L22.getBounds().centerY());
        }
        L22.draw(canvas);
        L22.setAlpha(255);
        if (z14) {
            canvas.restore();
        }
        s1Var.C = f30;
    }

    public final boolean p3() {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            return false;
        }
        return true;
    }

    public final void p4() {
        Window window;
        if (this.f21994bd == null) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                window = null;
            } else {
                window = findActivity.getWindow();
            }
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new ha(this, 3));
                this.f21994bd = flagSecureReason;
                if (this.J0) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.f21994bd;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        t1 t1Var;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        k1 k1Var = this.Gc;
        int i11 = 0;
        if (k1Var != null && k1Var.y2(i10)) {
            return false;
        }
        if (i10 == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                v1(false);
                return true;
            } else if (this.f22273v7.type == 16) {
                this.Gc.F0(this, this.P4, this.Q4);
                return true;
            } else {
                u1();
                return true;
            }
        }
        if (i10 == R.id.acc_action_small_button) {
            w1();
        } else if (i10 == R.id.acc_action_msg_options) {
            k1 k1Var2 = this.Gc;
            if (k1Var2 != null) {
                if (this.f22273v7.type == 16) {
                    k1Var2.s0(this, 0.0f, 0.0f);
                } else {
                    k1Var2.F0(this, this.P4, this.Q4);
                }
            }
        } else {
            if (i10 == R.id.acc_action_open_forwarded_origin) {
                k1 k1Var3 = this.Gc;
                if (k1Var3 != null) {
                    TLRPC.Chat chat = this.f22066gc;
                    if (chat != null) {
                        t1Var = this;
                        k1Var3.T(t1Var, chat, this.f22273v7.messageOwner.fwd_from.channel_post, this.f22011d1, this.f22026e1, false);
                    } else {
                        t1Var = this;
                        TLRPC.User user = t1Var.f22036ec;
                        if (user != null) {
                            k1Var3.y0(this, user, t1Var.f22011d1, t1Var.f22026e1);
                        } else if (t1Var.f22080hc != null) {
                            k1Var3.n(this);
                        }
                    }
                }
            } else {
                t1Var = this;
                if (i10 == R.id.acc_action_summarize) {
                    k1 k1Var4 = t1Var.Gc;
                    if (k1Var4 != null) {
                        k1Var4.L0(this);
                    }
                } else if (i10 == R.id.acc_action_copy_code && t1Var.Gc != null && (arrayList = t1Var.f22273v7.textLayoutBlocks) != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                        if (textLayoutBlock2.hasCodeCopyButton) {
                            t1Var.Gc.I(textLayoutBlock2);
                            break;
                        }
                    }
                }
            }
            if ((!t1Var.f22273v7.isVoice() || t1Var.f22273v7.isRoundVideo() || (t1Var.f22273v7.isMusic() && MediaController.getInstance().isPlayingMessage(t1Var.f22273v7))) && t1Var.F5.g(null, i10, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        t1Var = this;
        if (!t1Var.f22273v7.isVoice()) {
        }
        return true;
    }

    public final void q0(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Fd;
        if (f6Var != null) {
            f6Var.l(f10, f11 + this.S + this.f21996c0 + this.f22025e0, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, f11 + this.S + this.f21996c0 + this.f22025e0, i10, i11);
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
            p1(this.f22273v7.loadedFileSize, document.size);
        }
    }

    public final void q2(Canvas canvas, float f10, Runnable runnable) {
        org.telegram.ui.ActionBar.g5 g5Var;
        float f11;
        boolean z4;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            RadialProgress2 radialProgress2 = this.L0;
            RectF rectF = radialProgress2.f23112a;
            Paint paint = radialProgress2.f23116g;
            u90 u90Var = radialProgress2.f23117i;
            RectF rectF2 = radialProgress2.f23112a;
            float cos = (((float) Math.cos((AndroidUtilities.lerp(190, 45, f10) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF.centerX();
            float sin = (((float) Math.sin((AndroidUtilities.lerp(190, 45, f10) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f)) + rectF2.centerY();
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(rectF2);
            rectF3.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas2.saveLayerAlpha(rectF3, 255, 31);
            if (f3()) {
                g5Var = this.f22220r8;
            } else {
                g5Var = this.f22205q8;
            }
            u90Var.B = g5Var;
            radialProgress2.f23118j.B = g5Var;
            radialProgress2.I = f10;
            runnable.run();
            if (this.W0 == null) {
                Paint paint2 = new Paint(1);
                this.W0 = paint2;
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
                if (this.X0 == null) {
                    gj0 gj0Var = new gj0(R.raw.fire_once, "fire_once", AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.X0 = gj0Var;
                    gj0Var.f25170s0 = this;
                    gj0Var.H(true);
                    this.X0.I(1);
                    this.X0.start();
                }
                this.X0.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (this.Y0 == null) {
                    i10 = 1;
                    this.Y0 = new Paint(1);
                } else {
                    i10 = 1;
                }
                if (this.Z0 == null) {
                    Paint paint3 = new Paint(i10);
                    this.Z0 = paint3;
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.f21968a1 == null) {
                    Paint paint4 = new Paint(i10);
                    this.f21968a1 = paint4;
                    paint4.setStyle(Paint.Style.STROKE);
                }
                int i12 = radialProgress2.f23129u;
                if (i12 >= 0) {
                    i11 = org.telegram.ui.ActionBar.j6.v0(i12, this.Fd);
                } else {
                    i11 = radialProgress2.f23122n;
                }
                this.Y0.setColor(i11);
                this.f21968a1.setColor(i11);
                u90Var.a(false);
                this.Y0.setShader(u90Var.d.getShader());
                this.f21968a1.setShader(u90Var.d.getShader());
                rectF3.set(this.X0.getBounds());
                canvas2.saveLayerAlpha(rectF3, 255, 31);
                rectF3.inset(1.0f, 1.0f);
                canvas2.drawRect(rectF3, this.Y0);
                this.X0.o(canvas, this.Z0, false, 0L, 0);
                canvas.restore();
                canvas.restore();
                this.f21968a1.setAlpha((int) (255.0f * f12));
                this.f21968a1.setStrokeWidth(AndroidUtilities.dp(1.66f));
                RectF rectF4 = this.Z4;
                rectF4.set(rectF2);
                rectF4.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                mo0 mo0Var = this.E5;
                canvas.drawArc(rectF4, -90.0f, (1.0f - mo0Var.K) * (-360.0f), false, this.f21968a1);
                if (this.P6 == null) {
                    this.P6 = new z11();
                }
                this.P6.a((1.0f - mo0Var.K) * (-360.0f), f12, canvas, this.f21968a1, rectF4);
                canvas2 = canvas;
            } else {
                gj0 gj0Var2 = this.X0;
                if (gj0Var2 != null) {
                    gj0Var2.A(true);
                    this.X0 = null;
                    if (this.P6 != null) {
                        this.P6 = null;
                    }
                }
            }
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp((f10 * 1.5f) + 10.0f) * f10, this.W0);
            canvas2.restore();
            if (this.V0 == null) {
                ph.j jVar = new ph.j(3);
                this.V0 = jVar;
                jVar.e(-1, 0, 0);
                ph.j jVar2 = this.V0;
                jVar2.f41765i = 14.0f;
                jVar2.c(10.0f);
                this.V0.f41760a.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                z4 = true;
                this.V0.d(1, false, false);
                this.V0.f41766j = -AndroidUtilities.dpf2(0.33f);
                this.V0.f41767k = AndroidUtilities.dpf2(0.33f);
            } else {
                z4 = true;
            }
            ph.j jVar3 = this.V0;
            jVar3.f41765i = f10 * 14.0f;
            jVar3.c(f10 * 10.0f);
            canvas2.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + cos, AndroidUtilities.dp(10.0f) + sin, 255, 31);
            canvas2.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f10, paint);
            ph.j jVar4 = this.V0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.8f) {
                z4 = false;
            }
            jVar4.b(z4);
            ph.j jVar5 = this.V0;
            jVar5.f41770n = cos;
            jVar5.f41771o = sin;
            jVar5.a(canvas2, f10);
            canvas2.restore();
            return;
        }
        runnable.run();
    }

    public final boolean q3() {
        MessageObject messageObject;
        if (this.D8 && (messageObject = this.f22273v7) != null && !messageObject.isOutOwner() && this.I == null) {
            return true;
        }
        return false;
    }

    public final void q4() {
        boolean z4;
        String formatShortDuration;
        double d;
        double d10;
        double d11;
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            g1 g1Var = this.Ed;
            if (g1Var != null && g1Var.rewindCount != 0 && g1Var.rewindByBackSeek) {
                messageObject.audioProgress = g1Var.getVideoProgress();
            }
            boolean z10 = true;
            if (this.f22273v7.isPoll()) {
                dh.j jVar = this.Y5;
                if (jVar != null) {
                    jVar.n(true);
                }
                dh.j jVar2 = this.Z5;
                if (jVar2 != null) {
                    jVar2.n(true);
                }
            }
            int i10 = this.H1;
            double d12 = 0.0d;
            d1 d1Var = this.D5;
            if (i10 == 4) {
                if (d1Var != null) {
                    d1Var.a();
                }
                if (this.f22216r4 == null || (!PhotoViewer.J1(this.f22273v7) && !MediaController.getInstance().isGoingToShowMessageObject(this.f22273v7))) {
                    org.telegram.ui.Components.y5 animation = this.P0.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.f22273v7;
                        int i11 = animation.d[4] / 1000;
                        messageObject2.audioPlayerDuration = i11;
                        d11 = i11;
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.ttl > 0 && message.destroyTime == 0 && !messageObject2.needDrawBluredPreview() && this.f22273v7.isVideo() && animation.s()) {
                            this.Gc.O(this.f22273v7);
                        }
                    } else {
                        d11 = 0.0d;
                    }
                    if (d11 == 0.0d) {
                        d11 = this.f22273v7.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                        d11 -= this.f22273v7.audioProgress * d11;
                    } else if (animation != null) {
                        if (d11 != 0.0d) {
                            d11 -= animation.o() / 1000;
                        }
                        if (this.Gc != null && animation.o() >= 3000) {
                            this.Gc.C0();
                        }
                    }
                    if (this.N5 != d11) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d11);
                        this.f22302x4 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText(formatShortDuration2));
                        this.f22216r4 = new StaticLayout(formatShortDuration2, org.telegram.ui.ActionBar.j6.C2, this.f22302x4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.N5 = d11;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z11 = this.f22166nd;
            mo0 mo0Var = this.E5;
            int i12 = 0;
            if (z11) {
                if (this.C5) {
                    if (!mo0Var.f27086f) {
                        mo0Var.g(this.f22273v7.audioProgress, true);
                    }
                } else {
                    if (!d1Var.e) {
                        d1Var.i(this.f22273v7.audioProgress);
                        d1Var.f25219q = this.f22273v7.bufferedProgress;
                    }
                    d1Var.a();
                }
                TLRPC.Document document = this.f22273v7.getDocument();
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
                long j10 = this.Ud;
                if (j10 >= 0) {
                    d10 = j10;
                } else if (MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                    d10 = Math.max(0.0d, d10 - this.f22273v7.audioProgressSec);
                }
                if (this.N5 != d10) {
                    this.N5 = d10;
                    String formatLongDuration = AndroidUtilities.formatLongDuration((int) d10);
                    this.O5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.T2.measureText(formatLongDuration));
                    this.M5 = new StaticLayout(formatLongDuration, org.telegram.ui.ActionBar.j6.T2, this.O5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f10 = this.f22273v7.audioProgress;
                if (f10 != 0.0f) {
                    this.zd = f10;
                    if (f10 > 0.9f) {
                        this.zd = 1.0f;
                    }
                }
                invalidate();
            } else if (this.I1 != null) {
                if (this.C5) {
                    if (!mo0Var.f27086f) {
                        mo0Var.g(this.f22273v7.audioProgress, true);
                    }
                    z4 = true;
                } else {
                    if (!d1Var.e) {
                        d1Var.i(this.f22273v7.audioProgress);
                        d1Var.f25219q = this.f22273v7.bufferedProgress;
                    }
                    d1Var.k(this.f22273v7);
                    z4 = false;
                }
                int i13 = this.H1;
                if (i13 == 5) {
                    z4 = true;
                }
                if (i13 == 3) {
                    long j11 = this.Ud;
                    if (j11 >= 0) {
                        d = j11;
                    } else if (!MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                        while (true) {
                            if (i12 >= this.I1.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute2 = this.I1.attributes.get(i12);
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                d12 = documentAttribute2.duration;
                                break;
                            }
                            i12++;
                        }
                        d = d12;
                    } else {
                        d = this.f22273v7.audioProgressSec;
                    }
                    if (this.N5 != d) {
                        this.N5 = d;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                        this.O5 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(formatLongDuration2));
                        this.M5 = new StaticLayout(formatLongDuration2, org.telegram.ui.ActionBar.j6.N2, this.O5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    double duration = this.f22273v7.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                        i12 = this.f22273v7.audioProgressSec;
                    }
                    double d13 = i12;
                    if (this.N5 != d13) {
                        this.N5 = d13;
                        this.M5 = new StaticLayout(AndroidUtilities.formatShortDuration(i12, (int) duration), org.telegram.ui.ActionBar.j6.N2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.N2.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                    z10 = z4;
                }
                if (z10) {
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
        if (this.f22273v7.isSponsored()) {
            this.G8 = AndroidUtilities.dp(31.0f) + i12;
            return;
        }
        mg.r0 r0Var = this.K;
        if (!r0Var.f14128s && !r0Var.f14114b) {
            lastLineWidth = r0Var.f14130u;
        } else {
            lastLineWidth = this.f22273v7.getLastLineWidth();
        }
        boolean z4 = false;
        if (!r0Var.f14128s && !r0Var.f14114b) {
            z4 = (i10 - lastLineWidth < i11 || this.f22273v7.hasRtl) ? true : true;
            if (this.f22071h2) {
                this.f22182p0 = AndroidUtilities.dp(14.0f) + this.f22182p0;
            }
        } else if ((!this.f22198q1 && ((this.f22027e2 && !this.f22273v7.isSponsored()) || this.K1 || this.f22042f2 || this.f22056g2 || this.f22071h2)) || i10 - lastLineWidth < i11 || this.f22273v7.hasRtl) {
            z4 = true;
        }
        if (this.f22273v7.isUnsupported()) {
            z4 = true;
        }
        if ((r0Var.f14128s || r0Var.f14114b) && (richMessageLayout = this.f22273v7.richLayout) != null && richMessageLayout.forceNewLineForTime()) {
            z4 = true;
        }
        MessageObject messageObject = this.f22273v7;
        if ((messageObject.hasCodeAtBottom && (r0Var.f14128s || r0Var.f14114b)) || ((messageObject.hasQuoteAtBottom && (r0Var.f14128s || r0Var.f14114b)) || messageObject.isGiveawayOrGiveawayResults())) {
            i13 = 18;
            z4 = true;
        } else {
            i13 = 14;
        }
        if (z4) {
            this.f22182p0 = AndroidUtilities.dp(i13) + this.f22182p0;
            this.H8 = true;
            int dp = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth);
            this.G8 = dp;
            if (this.f22273v7.isOutOwner()) {
                i14 = AndroidUtilities.dp(17.0f) + this.f22149mb;
            } else {
                i14 = this.f22149mb;
            }
            this.G8 = org.telegram.messenger.y3.b(31.0f, i14, dp);
            return;
        }
        int extraTextX = (i12 - getExtraTextX()) - lastLineWidth;
        if (extraTextX >= 0 && extraTextX <= i11) {
            this.G8 = AndroidUtilities.dp(31.0f) + ((i12 + i11) - extraTextX);
        } else {
            this.G8 = AndroidUtilities.dp(31.0f) + Math.max(i12, lastLineWidth + i11);
        }
    }

    public final void r1(int i10) {
        CheckBoxBase[] checkBoxBaseArr = this.O8;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i10) {
            if (checkBoxBaseArr != null) {
                int i11 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = this.O8;
                    if (i11 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i11].f22960l = false;
                    i11++;
                }
            }
            this.O8 = new CheckBoxBase[i10];
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = this.O8;
                if (i12 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i12] = new CheckBoxBase(20, this, this.Fd);
                this.O8[i12].k(false);
                this.O8[i12].j(true);
                this.O8[i12].d(9);
                i12++;
            }
        }
        if (this.K8 == null) {
            this.K8 = new org.telegram.ui.Components.f9(this.F7, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    public final boolean r2(m1 m1Var, y80 y80Var, Layout layout, int i10) {
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
                } else if (characterStyleArr[i11] == this.A5) {
                    m1Var.f21378b = i10;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (m1Var.f21378b != i10) {
            return false;
        }
        y80Var.rewind();
        int spanStart = spanned.getSpanStart(this.A5);
        int spanEnd = spanned.getSpanEnd(this.A5);
        y80Var.f28799c = true;
        y80Var.d(layout, spanStart, 0.0f);
        layout.getSelectionPath(spanStart, spanEnd, y80Var);
        y80Var.a();
        this.f22319y5.k();
        return true;
    }

    public final void r4(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.r4(long):void");
    }

    @Override
    public final void requestLayout() {
        if (this.f22282w0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        if (this.f22273v7.type == 20 && this.Jb != null) {
            nh.y2 y2Var = this.P0;
            this.Hb = e2.c.x(y2Var.getImageWidth(), this.Jb.getWidth(), 2.0f, this.f22234s8);
            this.Ib = e2.c.x(y2Var.getImageHeight(), this.Jb.getHeight(), 2.0f, y2Var.getImageY() + this.f22259u8);
        }
    }

    public final void s1(int i10) {
        int i11;
        int v02;
        am0 am0Var;
        am0 am0Var2;
        int i12;
        int i13;
        int i14;
        if (this.f22273v7.isUnsupported()) {
            if (this.f22273v7.isOutOwner()) {
                i14 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i14 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i14, this.Fd);
        } else if (i10 == 0 && this.f22076h7) {
            if (this.f22273v7.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.j6.Ra;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.f20269xc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.Fd);
        } else if (i10 == 0 && (am0Var2 = this.X9) != null) {
            v02 = am0Var2.h();
        } else if (i10 == 0 && (am0Var = this.Z9) != null) {
            v02 = am0Var.h();
        } else {
            if (this.f22273v7.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Kc;
            }
            v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.Fd);
        }
        Drawable[] drawableArr = this.f22230s3;
        Drawable drawable = drawableArr[i10];
        if (drawable == null) {
            h1 h1Var = new h1(i10, this);
            n1[] n1VarArr = this.f22242t3;
            n1VarArr[i10] = h1Var;
            int[][] iArr = {StateSet.WILD_CARD};
            if (this.f22273v7.isOutOwner()) {
                i13 = org.telegram.ui.ActionBar.j6.Xa;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.Kc;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{436207615 & org.telegram.ui.ActionBar.j6.v0(i13, this.Fd)}), null, n1VarArr[i10]);
            drawableArr[i10] = rippleDrawable;
            rippleDrawable.setCallback(this);
        } else {
            org.telegram.ui.ActionBar.j6.B1(drawable, v02 & 436207615, true);
        }
        drawableArr[i10].setVisible(true, false);
    }

    public final boolean s2(m1 m1Var, y80 y80Var, ArrayList arrayList) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (r2(m1Var, y80Var, ((MessageObject.TextLayoutBlock) arrayList.get(i10)).textLayout, i10)) {
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
        boolean z4;
        boolean z10;
        boolean z11;
        if (this.N0) {
            return;
        }
        boolean z12 = true;
        if ((!this.f22003c8 && !this.f21989b8 && !isPressed()) || (this.J1 && this.P0.hasBitmapImage())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4 && this.M4 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        RadialProgress2 radialProgress2 = this.L0;
        radialProgress2.n(z10, false);
        if (this.T4 != 0) {
            if (!z4 && this.O4 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            radialProgress2.n(z11, true);
        }
        if (!z4 && this.N4 == 0) {
            z12 = false;
        }
        this.M0.n(z12, false);
    }

    public void setAllowAssistant(boolean z4) {
        this.f22190p8 = z4;
    }

    @Override
    public void setAlpha(float f10) {
        boolean z4;
        boolean z10 = false;
        if (f10 == 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getAlpha() == 1.0f) {
            z10 = true;
        }
        if (z4 != z10) {
            invalidate();
        }
        if (this.Uc) {
            this.Vc = f10;
            invalidate();
        } else {
            super.setAlpha(f10);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.f22297x && !this.f22273v7.isVoice()) || this.f22337z9 == null || this.A9 == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.I;
            if (groupedMessagePosition2 != null) {
                int i10 = groupedMessagePosition2.flags;
                if ((i10 & 8) == 0 || (i10 & 1) == 0) {
                    return;
                }
            }
            if (this.K.f14114b) {
                return;
            }
        }
        invalidate();
    }

    public void setAnimationOffsetX(float f10) {
        if (this.f22296we != f10) {
            this.f22296we = f10;
            y4();
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject != null) {
            if (this.f22133l8) {
                Drawable drawable = messageObject.customAvatarDrawable;
                ImageReceiver imageReceiver = this.f22106j9;
                if (drawable != null) {
                    imageReceiver.setImageBitmap(drawable);
                    return;
                }
                TLRPC.User user = this.Vb;
                int i10 = this.F7;
                org.telegram.ui.Components.z8 z8Var = this.f22120k9;
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        this.Xb = userProfilePhoto.photo_small;
                    } else {
                        this.Xb = null;
                    }
                    z8Var.m(i10, user);
                    imageReceiver.setForUserOrChat(this.Vb, z8Var, null, LiteMode.isEnabled(360928), 1, false);
                    return;
                }
                TLRPC.Chat chat = this.Wb;
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        this.Xb = chatPhoto.photo_small;
                    } else {
                        this.Xb = null;
                    }
                    if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId >= 0) {
                            TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            z8Var.m(i10, user2);
                            imageReceiver.setForUserOrChat(user2, z8Var);
                            return;
                        }
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        z8Var.k(i10, chat2);
                        imageReceiver.setForUserOrChat(chat2, z8Var);
                        return;
                    }
                    z8Var.k(i10, this.Wb);
                    imageReceiver.setForUserOrChat(this.Wb, z8Var);
                    return;
                } else if (messageObject.isSponsored()) {
                    TLRPC.Photo photo = messageObject.sponsoredPhoto;
                    if (photo != null) {
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", z8Var, null, null, 0);
                        return;
                    }
                    return;
                } else {
                    this.Xb = null;
                    z8Var.n(messageObject.getFromChatId(), null, null);
                    imageReceiver.setImage(null, null, z8Var, null, null, 0);
                    return;
                }
            }
            this.Xb = null;
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.setBackgroundTopY(boolean):void");
    }

    public void setDelegate(k1 k1Var) {
        this.Gc = k1Var;
    }

    public void setDrawSelectionBackground(boolean z4) {
        if (this.f22055g1 != z4) {
            this.f22055g1 = z4;
            invalidate();
        }
    }

    public void setEnterTransitionInProgress(boolean z4) {
        this.f22297x = z4;
        invalidate();
    }

    public void setFullyDraw(boolean z4) {
        this.F0 = z4;
    }

    public void setHideSideButtonByQuickShare(boolean z4) {
        if (this.f22207qa != z4) {
            this.f22207qa = z4;
            boolean z10 = this.G7;
            this.G7 = true;
            invalidate();
            this.G7 = z10;
        }
    }

    public void setHighlighted(boolean z4) {
        if (this.f22003c8 != z4) {
            this.f22003c8 = z4;
            if (z4) {
                this.f21985b4 = null;
            }
            if (!z4) {
                this.f22062g8 = System.currentTimeMillis();
                this.f22018d8 = true;
                this.f22032e8 = 300;
            } else {
                this.f22018d8 = false;
                this.f22032e8 = 0;
            }
            s4();
            if (this.C5) {
                this.E5.f27094o = f3();
            } else {
                this.D5.f25218p = f3();
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
        this.f22096ie = runnable;
    }

    public void setInvalidateSpoilersParent(boolean z4) {
        this.f22097j0 = z4;
    }

    public void setInvalidatesParent(boolean z4) {
        this.G7 = z4;
    }

    public void setIsUpdating(boolean z4) {
        this.K0 = true;
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.f22082he = runnable;
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        s4();
        if (this.C5) {
            this.E5.f27094o = f3();
        } else {
            this.D5.f25218p = f3();
        }
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.Fd = f6Var;
        RadialProgress2 radialProgress2 = this.L0;
        if (radialProgress2 != null) {
            radialProgress2.F = f6Var;
        }
        RadialProgress2 radialProgress22 = this.M0;
        if (radialProgress22 != null) {
            radialProgress22.F = f6Var;
        }
        em0 em0Var = this.P3;
        if (em0Var != null) {
            em0Var.f24615n = f6Var;
        }
    }

    public void setScrimReaction(Integer num) {
        this.K.C = num;
    }

    public void setSelectedBackgroundProgress(float f10) {
        this.Nc = f10;
        invalidate();
    }

    public void setShowTopic(boolean z4) {
        if (this.f22181oe != z4) {
            this.f22181oe = z4;
            a3();
            invalidate();
        }
    }

    public void setSlidingOffset(float f10) {
        if (this.f22280ve != f10) {
            this.f22280ve = f10;
            y4();
        }
    }

    public void setSpoilersSuppressed(boolean z4) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Id;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ih.k) arrayList.get(i10)).invalidateSelf();
            i10++;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Z3;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i11 = 0; i11 < this.Z3.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.Z3.textLayoutBlocks.get(i11);
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

    public void setTimeAlpha(float f10) {
        this.f22102j5 = f10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }

    public final int t0() {
        if (this.f22213r1) {
            return 4;
        }
        return 8;
    }

    public final void t1(int i10, int i11, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i10 & 2) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i10 & 4) == 0 && z13 && z11 && !z12 && z10) {
            z14 = true;
        }
        if (this.Wc.h && !z14) {
            return;
        }
        this.f22067gd = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22095id = ofFloat;
        if (z14) {
            ofFloat.setDuration(220L);
        } else {
            ofFloat.setDuration(150L);
        }
        this.f22095id.setInterpolator(nr.f27346f);
        this.f22052fd = i10;
        this.f22037ed = i11;
        this.f22095id.addUpdateListener(new dg.b1(3, this, z4));
        this.f22095id.addListener(new dg.w2(13, this, z4));
        this.f22081hd = true;
        this.f22095id.start();
    }

    public final void t2() {
        MessageObject messageObject = this.f22289w7;
        if (messageObject == null) {
            messageObject = this.f22273v7;
        }
        MessageObject messageObject2 = messageObject;
        this.f22273v7 = null;
        X3(messageObject2, this.H, this.C, this.B, this.D, false);
    }

    public final int t3(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t3(int):int");
    }

    public final void t4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.t4():void");
    }

    public final boolean u0(MotionEvent motionEvent) {
        k1 k1Var;
        if (this.Ma == null || (k1Var = this.Gc) == null || !k1Var.d()) {
            return false;
        }
        boolean contains = this.Na.contains(motionEvent.getX(), motionEvent.getY());
        if (this.Oa == null) {
            this.Oa = new rc(this);
        }
        if (motionEvent.getAction() == 0) {
            this.Oa.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                this.Oa.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Oa.h) {
                this.Gc.i2(this);
            }
            this.Oa.c(false);
        } else if (motionEvent.getAction() == 3) {
            this.Oa.c(false);
        }
        return this.Oa.h;
    }

    public final void u1() {
        MessageObject messageObject;
        k1 k1Var;
        TLRPC.WebPage webPage;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        if (this.f22273v7.hasMediaSpoilers() && !this.f22273v7.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.f22273v7;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.Gc != null && messageObject2.isSensitive()) {
                    this.Gc.A(this);
                    return;
                } else {
                    i4(this.f22011d1, this.f22026e1);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.f22273v7;
        int i10 = messageObject3.type;
        int i11 = 0;
        if (i10 == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message != null && (messageMedia = message.media) != null && !messageMedia.extended_media.isEmpty()) {
                TLRPC.ReplyMarkup replyMarkup = this.f22273v7.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i11);
                        i11++;
                        Iterator<TL_keyboard.KeyboardInlineButton> it = keyboardInlineButtonRow.buttons.iterator();
                        if (it.hasNext()) {
                            this.Gc.T0(this, it.next());
                            return;
                        }
                    }
                }
            }
        } else if (i10 != 1 && !messageObject3.isAnyKindOfSticker()) {
            MessageObject messageObject4 = this.f22273v7;
            int i12 = messageObject4.type;
            if (i12 == 12) {
                long j10 = MessageObject.getMedia(messageObject4.messageOwner).user_id;
                if (j10 != 0) {
                    user = MessagesController.getInstance(this.F7).getUser(Long.valueOf(j10));
                } else {
                    user = null;
                }
                this.Gc.y0(this, user, this.f22011d1, this.f22026e1);
            } else if (i12 == 5) {
                if (this.L4 != -1) {
                    v1(false);
                } else if (MediaController.getInstance().isPlayingMessage(this.f22273v7) && !MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.f22273v7);
                } else {
                    this.Gc.T1(this, this.f22273v7);
                }
            } else if (i12 == 8) {
                int i13 = this.L4;
                if (i13 != -1 && (i13 != 1 || !this.f22299x1 || !this.f22118k7)) {
                    if (i13 == 2 || i13 == 0) {
                        v1(false);
                        return;
                    }
                    return;
                }
                this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
            } else if (this.H1 != 4 && !messageObject4.hasVideoQualities()) {
                MessageObject messageObject5 = this.f22273v7;
                int i14 = messageObject5.type;
                if (i14 != 4 && i14 != 17 && i14 != 23 && i14 != 24) {
                    int i15 = this.H1;
                    if (i15 == 1) {
                        if (this.L4 == -1) {
                            this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
                            return;
                        }
                        return;
                    } else if (messageObject5.sponsoredMedia != null) {
                        k1 k1Var2 = this.Gc;
                        if (k1Var2 != null) {
                            k1Var2.z0(this, this.f22011d1, this.f22026e1, false);
                            return;
                        }
                        return;
                    } else if (i15 == 2) {
                        if (this.L4 == -1 && (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) != null) {
                            String str = webPage.embed_url;
                            if (str != null && str.length() != 0) {
                                this.Gc.S1(this.f22273v7, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                                return;
                            } else {
                                af.g.s(getContext(), webPage.url);
                                return;
                            }
                        }
                        return;
                    } else if (this.f22071h2) {
                        if (this.L4 == -1) {
                            this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26 && (k1Var = this.Gc) != null) {
                        if (i14 == 16) {
                            k1Var.s0(this, 0.0f, 0.0f);
                            return;
                        } else {
                            k1Var.F0(this, this.P4, this.Q4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
            } else if (this.L4 != -1 && (!this.f22252u1 || (!this.f22118k7 && (((messageObject = this.f22273v7) == null || !messageObject.hasVideoQualities()) && (!SharedConfig.streamMedia || !this.f22299x1))))) {
                if (this.f22252u1) {
                    v1(true);
                    return;
                }
                int i16 = this.L4;
                if (i16 == 0 || i16 == 3) {
                    v1(false);
                }
            } else {
                this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
            }
        } else {
            int i17 = this.L4;
            if (i17 == -1) {
                this.Gc.z0(this, this.f22011d1, this.f22026e1, false);
            } else if (i17 == 0) {
                v1(false);
            }
        }
    }

    public final void u3(boolean z4) {
        int currentBackgroundLeft;
        float f10;
        int dp;
        int i10;
        float f11;
        int dp2;
        int currentBackgroundLeft2;
        boolean isOutOwner = this.f22273v7.isOutOwner();
        int i11 = 0;
        s1 s1Var = this.Wc;
        if (isOutOwner) {
            if (z4) {
                currentBackgroundLeft2 = (int) (this.f22234s8 + s1Var.f21843g0);
            } else {
                currentBackgroundLeft2 = getCurrentBackgroundLeft();
            }
            this.f22111k0 = getExtraTextX() + AndroidUtilities.dp(11.0f) + currentBackgroundLeft2;
        } else {
            if (z4) {
                currentBackgroundLeft = (int) (this.f22234s8 + s1Var.f21843g0);
            } else {
                currentBackgroundLeft = getCurrentBackgroundLeft();
            }
            if (this.f22273v7.type == 19) {
                dp = 0;
            } else {
                if (!this.f22077h8 && this.G) {
                    f10 = 11.0f;
                } else {
                    f10 = 17.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            this.f22111k0 = getExtraTextX() + currentBackgroundLeft + dp;
        }
        float f12 = 4.0f;
        if (this.f22056g2) {
            this.f22111k0 = AndroidUtilities.dp(11.0f) + this.f22111k0;
            int dp3 = AndroidUtilities.dp(14.0f) + this.Ic;
            this.f22168o0 = dp3;
            StaticLayout staticLayout = this.f22316y2;
            if (staticLayout != null) {
                this.f22168o0 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + dp3;
            }
        } else if (this.f22071h2) {
            int dp4 = AndroidUtilities.dp(14.0f) + this.Ic;
            this.f22168o0 = dp4;
            StaticLayout staticLayout2 = this.f22316y2;
            if (staticLayout2 != null) {
                this.f22168o0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp4;
            }
        } else if (this.f22273v7.type == 19) {
            this.f22168o0 = AndroidUtilities.dp(6.0f) + this.Ic;
            if (!this.f22273v7.isOut()) {
                this.f22111k0 = getCurrentBackgroundLeft();
            } else {
                this.f22111k0 -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp5 = AndroidUtilities.dp(8.0f) + this.Ic;
            this.f22168o0 = dp5;
            MessageObject messageObject = this.f22273v7;
            float f13 = 2.0f;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    int i12 = this.f22168o0;
                    if (this.Ic <= 0) {
                        f13 = -3.0f;
                    }
                    this.f22168o0 = AndroidUtilities.dp(f13) + i12;
                }
            } else {
                if (messageObject.hasCodeAtTop && (i10 = SharedConfig.bubbleRadius) > 10) {
                    if (i10 < 15) {
                        f13 = 1.0f;
                    }
                    this.f22168o0 = AndroidUtilities.dp(f13) + dp5;
                }
                if (this.f22273v7.hasCodeAtTop && this.Ic > 0) {
                    this.f22168o0 = AndroidUtilities.dp(5.0f) + this.f22168o0;
                }
            }
        }
        if (this.f22273v7.isSponsored()) {
            this.m0 = AndroidUtilities.dp(14.0f) + this.f22168o0;
        } else if (this.f22198q1) {
            this.m0 = AndroidUtilities.dp(10.0f) + this.f22168o0;
            this.f22168o0 = org.telegram.messenger.y3.C(13.0f, this.f22099j2, this.f22168o0);
            if (this.O2 && !this.f22071h2 && !this.f22273v7.isGiveawayOrGiveawayResults()) {
                this.f22168o0 = AndroidUtilities.dp(44.0f) + this.f22168o0;
            }
        } else {
            this.m0 = AndroidUtilities.dp(10.0f) + this.f22273v7.textHeight(s1Var) + this.f22168o0;
        }
        if (this.f22198q1) {
            dp2 = AndroidUtilities.dp(10.0f) + this.f22273v7.textHeight(s1Var) + this.f22168o0;
        } else {
            int i13 = this.m0 + this.f22099j2;
            if (this.O2) {
                f11 = 46.0f;
            } else {
                f11 = 0.0f;
            }
            int dp6 = AndroidUtilities.dp(f11) + i13;
            if (this.f22099j2 <= 0) {
                f12 = -8.0f;
            }
            dp2 = AndroidUtilities.dp(f12) + dp6;
        }
        this.f22154n0 = dp2;
        this.f22126l0 = this.f22111k0;
        if (this.f22273v7.textXOffset != 0.0f && this.f22337z9 != null) {
            int dp7 = this.G8 - AndroidUtilities.dp(31.0f);
            MessageObject messageObject2 = this.f22273v7;
            int i14 = dp7 - messageObject2.textWidth;
            if (!this.H8) {
                int i15 = this.f22149mb;
                if (messageObject2.isOutOwner()) {
                    i11 = 20;
                }
                i14 = org.telegram.ui.b.t(i11 + 4, i15, i14);
            }
            if (i14 > 0) {
                this.f22111k0 = (i14 - getExtraTimeX()) + this.f22111k0;
            }
        }
    }

    public final void u4(MessageObject messageObject) {
        CharSequence secretTimeString;
        int i10;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            if (secretTimeString instanceof String) {
                int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.C2.measureText((String) secretTimeString));
                this.f22302x4 = ceil;
                this.f22216r4 = new StaticLayout(TextUtils.ellipsize(secretTimeString, org.telegram.ui.ActionBar.j6.C2, ceil, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.C2, this.f22302x4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.D2;
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = 9999;
                }
                StaticLayout staticLayout = new StaticLayout(secretTimeString, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f22216r4 = staticLayout;
                int i11 = 0;
                if (staticLayout.getLineCount() > 0) {
                    i11 = (int) this.f22216r4.getLineWidth(0);
                }
                this.f22302x4 = i11;
            }
            invalidate();
        }
    }

    public final boolean v0(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.v0(android.view.MotionEvent):boolean");
    }

    public final void v1(boolean z4) {
        float f10;
        MessageObject messageObject;
        MessageObject messageObject2;
        TLRPC.PhotoSize photoSize;
        String str;
        int i10;
        RadialProgress2 radialProgress2;
        int i11;
        MessageObject messageObject3;
        if (this.Gc != null && this.f22273v7.isSensitive() && this.f22273v7.hasMediaSpoilers() && !this.f22273v7.needDrawBluredPreview() && !this.f22273v7.isMediaSpoilersRevealed) {
            this.Gc.A(this);
            return;
        }
        MessageObject messageObject4 = this.f22273v7;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.f22273v7.putInDownloadsStore = true;
        }
        int i12 = this.L4;
        RadialProgress2 radialProgress22 = this.M0;
        int i13 = this.F7;
        nh.y2 y2Var = this.P0;
        RadialProgress2 radialProgress23 = this.L0;
        if (i12 == 0 && (!this.f22252u1 || z4)) {
            int i14 = this.H1;
            if (i14 != 3 && i14 != 5 && (i14 != 7 || (messageObject3 = this.f22273v7) == null || !messageObject3.isVoiceTranscriptionOpen() || !this.f22273v7.mediaExists)) {
                if (z4) {
                    radialProgress22.o(0.0f, false);
                } else {
                    radialProgress23.o(0.0f, false);
                }
                if (this.f21986b5 != null && (y2Var.hasNotThumb() || this.f22000c5 == null)) {
                    photoSize = this.f21986b5;
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !"s".equals(photoSize.type)) {
                        str = this.f22030e5;
                    } else {
                        str = this.f22045f5;
                    }
                } else {
                    photoSize = this.f22000c5;
                    str = this.f22045f5;
                }
                String str2 = str;
                if (this.f22273v7.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                MessageObject messageObject5 = this.f22273v7;
                int i15 = messageObject5.type;
                if (i15 == 1 || i15 == 20) {
                    int i16 = i10;
                    radialProgress2 = radialProgress23;
                    y2Var.setForceLoading(true);
                    y2Var.setImage(ImageLocation.getForObject(this.f21986b5, this.f21971a5), this.f22030e5, ImageLocation.getForObject(this.f22000c5, this.f21971a5), this.f22045f5, this.f22015d5, this.f21986b5.size, null, this.f22273v7, i16);
                } else if (i15 == 8) {
                    FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                    if (this.f22273v7.loadedFileSize > 0) {
                        q1(this.I1);
                    }
                    radialProgress2 = radialProgress23;
                } else if (this.f22166nd) {
                    if (messageObject5.isSecretMedia()) {
                        FileLoader fileLoader = FileLoader.getInstance(i13);
                        TLRPC.Document document = this.f22273v7.getDocument();
                        MessageObject messageObject6 = this.f22273v7;
                        if (messageObject6.shouldEncryptPhotoOrVideo()) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fileLoader.loadFile(document, messageObject6, 2, i11);
                        radialProgress2 = radialProgress23;
                    } else {
                        MessageObject messageObject7 = this.f22273v7;
                        messageObject7.gifState = 2.0f;
                        TLRPC.Document document2 = messageObject7.getDocument();
                        y2Var.setForceLoading(true);
                        radialProgress2 = radialProgress23;
                        y2Var.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.f22273v7, 0);
                    }
                    this.Zc = true;
                    invalidate();
                } else {
                    radialProgress2 = radialProgress23;
                    if (i15 == 9) {
                        FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                        if (this.f22273v7.loadedFileSize > 0) {
                            q1(this.I1);
                        }
                    } else {
                        int i17 = this.H1;
                        if (i17 == 4) {
                            FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 1, i10);
                            MessageObject messageObject8 = this.f22273v7;
                            if (messageObject8.loadedFileSize > 0) {
                                q1(messageObject8.getDocument());
                            }
                        } else if (i15 == 0 && i17 != 0) {
                            if (i17 == 2) {
                                y2Var.setForceLoading(true);
                                y2Var.setImage(ImageLocation.getForDocument(this.I1), null, ImageLocation.getForDocument(this.f21986b5, this.I1), this.f22045f5, this.I1.size, null, this.f22273v7, i10);
                                MessageObject messageObject9 = this.f22273v7;
                                messageObject9.gifState = 2.0f;
                                if (messageObject9.loadedFileSize > 0) {
                                    q1(messageObject9.getDocument());
                                }
                            } else if (i17 == 1) {
                                FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                            } else if (i17 == 8) {
                                y2Var.setImage(ImageLocation.getForDocument(this.I1), this.f22030e5, ImageLocation.getForDocument(this.f21986b5, this.I1), "b1", 0L, "jpg", this.f22273v7, 1);
                            }
                        } else {
                            y2Var.setForceLoading(true);
                            y2Var.setImage(ImageLocation.getForObject(this.f21986b5, this.f21971a5), this.f22030e5, ImageLocation.getForObject(this.f22000c5, this.f21971a5), this.f22045f5, this.f22015d5, 0L, null, this.f22273v7, 0);
                        }
                    }
                }
                this.f22273v7.loadingCancelled = false;
                this.L4 = 1;
                if (z4) {
                    radialProgress22.setIcon(14, false, true);
                } else {
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
                return;
            }
            if (this.U4 == 0) {
                FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                this.f22273v7.loadingCancelled = false;
            }
            if (this.Gc.T1(this, this.f22273v7)) {
                if (this.T4 == 2 && this.U4 != 1) {
                    this.U4 = 1;
                    radialProgress23.o(0.0f, false);
                    radialProgress23.k(getMiniIconForCurrentState(), false, true);
                }
                q4();
                this.L4 = 1;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 1 && (!this.f22252u1 || z4)) {
            y2Var.setForceLoading(false);
            int i18 = this.H1;
            if (i18 != 3 && i18 != 5 && (i18 != 7 || (messageObject2 = this.f22273v7) == null || !messageObject2.isVoiceTranscriptionOpen())) {
                if (this.f22273v7.isOut() && !this.f22252u1 && (this.f22273v7.isSending() || this.f22273v7.isEditing())) {
                    if (radialProgress23.f23117i.f29162q != 6) {
                        this.Gc.L(this);
                        return;
                    }
                    return;
                }
                MessageObject messageObject10 = this.f22273v7;
                messageObject10.loadingCancelled = true;
                int i19 = this.H1;
                if (i19 != 2 && i19 != 4 && i19 != 1 && i19 != 8) {
                    int i20 = messageObject10.type;
                    if (i20 != 0 && i20 != 1 && i20 != 20 && i20 != 8 && i20 != 5) {
                        if (i20 == 9) {
                            FileLoader.getInstance(i13).cancelLoadFile(this.f22273v7.getDocument());
                        }
                    } else {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(y2Var);
                        y2Var.cancelLoadImage();
                    }
                } else {
                    FileLoader.getInstance(i13).cancelLoadFile(this.I1);
                }
                this.L4 = 0;
                if (z4) {
                    radialProgress22.setIcon(2, false, true);
                } else {
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                }
                invalidate();
            } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.f22273v7)) {
                this.L4 = 0;
                radialProgress23.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i12 == 2) {
            MessageObject messageObject11 = this.f22273v7;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.Gc.z0(this, 0.0f, 0.0f, false);
            } else if (this.H1 == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
                if (this.U4 == 0) {
                    FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                    this.f22273v7.loadingCancelled = false;
                }
                if (this.Gc.T1(this, this.f22273v7)) {
                    if (this.T4 == 2 && this.U4 != 1) {
                        this.U4 = 1;
                        radialProgress23.o(0.0f, false);
                        radialProgress23.k(getMiniIconForCurrentState(), false, true);
                    }
                    q4();
                    this.L4 = 1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                if (this.f22166nd) {
                    this.Zc = true;
                    invalidate();
                }
            } else {
                int i21 = this.H1;
                if (i21 != 3 && i21 != 5) {
                    if (this.f22166nd) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                            y2Var.setAllowStartAnimation(true);
                            y2Var.startAnimation();
                        }
                    } else {
                        y2Var.setAllowStartAnimation(true);
                        y2Var.startAnimation();
                    }
                    this.f22273v7.gifState = 0.0f;
                    this.L4 = -1;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    return;
                }
                radialProgress23.o(0.0f, false);
                FileLoader.getInstance(i13).loadFile(this.I1, this.f22273v7, 2, 0);
                this.f22273v7.loadingCancelled = false;
                this.L4 = 4;
                radialProgress23.setIcon(getIconForCurrentState(), true, true);
                invalidate();
            }
        } else if (i12 != 3 && i12 != 0) {
            if (i12 == 4) {
                int i22 = this.H1;
                if (i22 == 3 || i22 == 5 || (i22 == 7 && (messageObject = this.f22273v7) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.f22273v7.isOut() && (this.f22273v7.isSending() || this.f22273v7.isEditing())) || this.f22273v7.isSendError()) {
                        k1 k1Var = this.Gc;
                        if (k1Var != null && radialProgress23.f23117i.f29162q != 6) {
                            k1Var.L(this);
                            return;
                        }
                        return;
                    }
                    this.f22273v7.loadingCancelled = true;
                    FileLoader.getInstance(i13).cancelLoadFile(this.I1);
                    this.L4 = 2;
                    radialProgress23.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        } else {
            if (this.T4 == 2 && this.U4 != 1) {
                this.U4 = 1;
                f10 = 0.0f;
                radialProgress23.o(0.0f, false);
                radialProgress23.k(getMiniIconForCurrentState(), false, true);
            } else {
                f10 = 0.0f;
            }
            k1 k1Var2 = this.Gc;
            if (k1Var2 != null) {
                k1Var2.z0(this, f10, f10, false);
            }
        }
    }

    public final ColorFilter v2(int i10, int i11) {
        if (this.f22328ye == null) {
            this.f22339ze = new int[3];
            this.f22328ye = new ColorFilter[3];
        }
        if (i11 != this.f22339ze[i10] || this.f22328ye[i10] == null) {
            ColorFilter[] colorFilterArr = this.f22328ye;
            this.f22339ze[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.f22328ye[i10];
    }

    public final void v4() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f22027e2) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int i20 = -AndroidUtilities.dp(i10 + 92);
        s1 s1Var = this.Wc;
        boolean z4 = s1Var.f21910w0;
        d1 d1Var = this.D5;
        mo0 mo0Var = this.E5;
        float f11 = 10.0f;
        if (z4 && ((i15 = this.H1) == 3 || i15 == 7)) {
            int i21 = this.G8;
            float f12 = i21;
            int i22 = (int) ((f12 - s1Var.f21862k0) + s1Var.f21867l0);
            int i23 = (int) ((f12 - s1Var.f21843g0) + s1Var.f21847h0);
            if (this.f22166nd && !this.f22162n8) {
                i23 = (int) ((getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)) + i23);
                i22 += AndroidUtilities.dp(8.0f);
            }
            if (s1Var.f21862k0 == 0.0f && s1Var.f21867l0 == 0.0f) {
                i22 = i23;
            }
            if (mo0Var != null) {
                if (s1Var.f21876n1) {
                    int dp = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f22027e2) {
                        f11 = 0.0f;
                    }
                    int dp2 = dp - AndroidUtilities.dp(f11);
                    int dp3 = AndroidUtilities.dp(30.0f);
                    int i24 = i21 + i20;
                    if (!this.I5) {
                        i18 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i18 = 0;
                    }
                    int i25 = i24 + i18;
                    int i26 = i22 + i20;
                    if (this.I5) {
                        i19 = -AndroidUtilities.dp(34.0f);
                    } else {
                        i19 = 0;
                    }
                    mo0Var.h(dp2, dp3, i25, i26 + i19);
                } else {
                    int dp4 = (i23 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                    if (!this.f22027e2) {
                        f11 = 0.0f;
                    }
                    mo0Var.h(dp4 - AndroidUtilities.dp(f11), AndroidUtilities.dp(30.0f), (i21 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i22 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            if (d1Var != null) {
                int useTranscribeButtonProgress = i23 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
                if (this.H1 == 5) {
                    i16 = 65;
                } else {
                    i16 = 72;
                }
                if (this.f22027e2) {
                    i17 = 20;
                } else {
                    i17 = 0;
                }
                d1Var.j(useTranscribeButtonProgress - AndroidUtilities.dp(i16 + i17), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        if (mo0Var != null) {
            if (s1Var.f21876n1) {
                int dp5 = (this.G8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (this.f22027e2) {
                    f10 = 10.0f;
                } else {
                    f10 = 0.0f;
                }
                int dp6 = dp5 - AndroidUtilities.dp(f10);
                int dp7 = AndroidUtilities.dp(30.0f);
                int i27 = this.G8 + i20;
                if (!this.I5) {
                    i13 = -AndroidUtilities.dp(34.0f);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (!this.f22027e2) {
                    f11 = 0.0f;
                }
                int dp8 = i28 - AndroidUtilities.dp(f11);
                int i29 = this.G8 + i20;
                if (this.I5) {
                    i14 = -AndroidUtilities.dp(34.0f);
                } else {
                    i14 = 0;
                }
                mo0Var.h(dp6, dp7, dp8, i29 + i14);
            } else {
                int dp9 = (this.G8 + i20) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()));
                if (!this.f22027e2) {
                    f11 = 0.0f;
                }
                int dp10 = dp9 - AndroidUtilities.dp(f11);
                mo0Var.h(dp10, AndroidUtilities.dp(30.0f), dp10, dp10);
            }
        }
        if (d1Var != null) {
            int useTranscribeButtonProgress2 = this.G8 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)));
            if (this.H1 == 5) {
                i11 = 65;
            } else {
                i11 = 72;
            }
            if (this.f22027e2) {
                i12 = 20;
            } else {
                i12 = 0;
            }
            d1Var.j(useTranscribeButtonProgress2 - AndroidUtilities.dp(i11 + i12), AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        fh.b bVar;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.f22230s3;
            if (drawable == drawableArr[0] || drawable == this.f22231s4 || drawable == drawableArr[1] || drawable == this.Ec || drawable == this.H3 || drawable == this.f22294wc || ((this.K != null && (drawable instanceof org.telegram.ui.Components.j6)) || (drawable instanceof i90))) {
                return true;
            }
            fh.a aVar = this.X5;
            if (aVar == null || (drawable != aVar && drawable != aVar.f6205a)) {
                ArrayList arrayList = this.V5;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r1 r1Var = (r1) obj;
                    if (r1Var.f21616w != drawable && ((bVar = r1Var.f21617x) == null || (drawable != bVar && drawable != bVar.f6195a && drawable != bVar.f6196b))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean w0(MotionEvent motionEvent) {
        int i10;
        float f10;
        int dp;
        ArrayList arrayList = this.f22132l7;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = getWidthForButtons();
                if (this.f22273v7.isOutOwner()) {
                    dp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
                } else {
                    int i11 = this.f22234s8;
                    if (this.f22077h8) {
                        f10 = 1.0f;
                    } else {
                        f10 = 7.0f;
                    }
                    dp = i11 + AndroidUtilities.dp(f10);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    e0 e0Var = (e0) arrayList.get(i12);
                    int dp2 = (e0Var.d + this.J8) - AndroidUtilities.dp(2.0f);
                    float f11 = x10;
                    float f12 = widthForButtons;
                    float f13 = (e0Var.f20964c * f12) + dp;
                    if (f11 >= f13 && f11 <= (e0Var.e * f12) + f13 && z22 >= dp2 && z22 <= e0Var.f20965f + dp2) {
                        this.f22233s7 = i12;
                        a3();
                        if (e0Var.f20977s == null) {
                            z Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nc, this.Fd), 6, 6);
                            e0Var.f20977s = Y;
                            Y.setCallback(this);
                            z zVar = e0Var.f20977s;
                            int i13 = ((int) (e0Var.f20964c * f12)) + dp;
                            zVar.setBounds(i13, dp2, ((int) (e0Var.e * f12)) + i13, e0Var.f20965f + dp2);
                        }
                        e0Var.f20977s.setHotspot(f11, z22);
                        e0Var.f20977s.setState(this.f22301x3);
                        e0Var.b(!e0Var.f20971m);
                        postDelayed(new af.b(this, this.f22233s7, 15), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f22233s7 != -1) {
                    playSoundEffect(0);
                    e0 e0Var2 = (e0) arrayList.get(this.f22233s7);
                    z zVar2 = e0Var2.f20977s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var2.b(false);
                    if (this.f22273v7.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
                    } else {
                        k1 k1Var = this.Gc;
                        if (k1Var != null && !e0Var2.f20971m) {
                            BotInlineKeyboard.ButtonCustom buttonCustom = e0Var2.f20968j;
                            if (buttonCustom != null) {
                                k1Var.E(this, buttonCustom);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var2.f20967i;
                                if (keyboardInlineButton != null) {
                                    k1Var.o1(this, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    this.f22233s7 = -1;
                    a3();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = this.f22233s7) != -1) {
                e0 e0Var3 = (e0) arrayList.get(i10);
                z zVar3 = e0Var3.f20977s;
                if (zVar3 != null) {
                    zVar3.setState(StateSet.NOTHING);
                }
                e0Var3.b(false);
                this.f22233s7 = -1;
                a3();
            }
        }
        return false;
    }

    public final void w1() {
        int i10;
        int i11;
        int i12 = this.U4;
        int i13 = this.F7;
        RadialProgress2 radialProgress2 = this.L0;
        if (i12 == 0) {
            this.U4 = 1;
            radialProgress2.o(0.0f, false);
            MessageObject messageObject = this.f22273v7;
            if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
                this.f22273v7.putInDownloadsStore = true;
            }
            int i14 = this.H1;
            if (i14 != 3 && i14 != 5) {
                if (i14 == 4 || i14 == 7) {
                    q1(this.I1);
                    FileLoader fileLoader = FileLoader.getInstance(i13);
                    TLRPC.Document document = this.I1;
                    MessageObject messageObject2 = this.f22273v7;
                    if (messageObject2.shouldEncryptPhotoOrVideo()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    fileLoader.loadFile(document, messageObject2, 2, i11);
                    this.f22273v7.loadingCancelled = false;
                }
            } else {
                FileLoader fileLoader2 = FileLoader.getInstance(i13);
                TLRPC.Document document2 = this.I1;
                MessageObject messageObject3 = this.f22273v7;
                if (messageObject3.shouldEncryptPhotoOrVideo()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                fileLoader2.loadFile(document2, messageObject3, 2, i10);
                this.f22273v7.loadingCancelled = false;
            }
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i12 == 1) {
            int i15 = this.H1;
            if ((i15 == 3 || i15 == 5 || i15 == 7) && MediaController.getInstance().isPlayingMessage(this.f22273v7)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.U4 = 0;
            this.f22273v7.loadingCancelled = true;
            FileLoader.getInstance(i13).cancelLoadFile(this.I1);
            radialProgress2.k(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public ih.j w3() {
        return ih.j.e(this);
    }

    public final void w4() {
        char c3;
        int dp;
        int extraTextX;
        int i10;
        int i11;
        int dp2;
        int i12;
        if (getDelegate() != null && getDelegate().C2() != null && getDelegate().C2().A(this.f22273v7)) {
            n9 C2 = getDelegate().C2();
            if (C2.f21456v0) {
                c3 = 2;
            } else if (C2.f21458x0) {
                c3 = 3;
            } else if (C2.f21460z0) {
                c3 = 4;
            } else if (P2()) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            if (c3 == 2) {
                if (this.f22056g2) {
                    i12 = this.f22126l0 - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.f22071h2) {
                        i11 = this.f22126l0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = this.f22126l0;
                        dp2 = AndroidUtilities.dp(1.0f);
                    }
                    i12 = i11 + dp2;
                }
                getDelegate().C2().c0(AndroidUtilities.dp(10.0f) + i12 + this.f22170o2, this.f22127l2);
            } else if (c3 == 1) {
                n4();
                getDelegate().C2().c0((int) this.f22143m4, (int) this.f22158n4);
            } else if (c3 == 3) {
                MessageObject.GroupedMessages groupedMessages = this.H;
                if (groupedMessages != null && !groupedMessages.isDocuments) {
                    i10 = (int) this.f22143m4;
                } else {
                    float f10 = 12.0f;
                    if (this.f22273v7.isOutOwner()) {
                        i10 = getExtraTextX() + AndroidUtilities.dp(12.0f) + this.f22234s8;
                        if (this.f22273v7.type == 19) {
                            i10 -= Math.max(0, (AndroidUtilities.dp(14.0f) + (Math.max(this.G9, this.I9) + i10)) - AndroidUtilities.displaySize.x);
                        }
                    } else {
                        if (this.f22077h8) {
                            dp = AndroidUtilities.dp(12.0f) + this.f22234s8;
                            extraTextX = getExtraTextX();
                        } else {
                            int i13 = this.f22234s8;
                            if (!this.G) {
                                f10 = 18.0f;
                            }
                            dp = AndroidUtilities.dp(f10) + i13;
                            extraTextX = getExtraTextX();
                        }
                        i10 = extraTextX + dp;
                    }
                }
                int dp3 = ((int) (i10 + this.Wc.f21843g0)) - AndroidUtilities.dp(1.33f);
                int i14 = this.f22154n0;
                n4();
                getDelegate().C2().c0((AndroidUtilities.dp(10.0f) + dp3) - this.Y1, AndroidUtilities.dp(22.0f) + i14);
            } else {
                getDelegate().C2().c0(this.f22111k0, this.f22168o0);
            }
        }
    }

    public final boolean x0(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.x0(android.view.MotionEvent):boolean");
    }

    public final void x1() {
        MessageObject messageObject = this.f22273v7;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            k1 k1Var = this.Gc;
            if (k1Var != null) {
                k1Var.G1(this, true);
            }
        }
    }

    public final void x3(org.telegram.messenger.MessageObject r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.x3(org.telegram.messenger.MessageObject):void");
    }

    public final void x4(int i10, int i11) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.Z3;
        int i12 = 0;
        s1 s1Var = this.Wc;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i13);
                i13++;
                MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                for (ih.k kVar : textLayoutBlock2.spoilers) {
                    kVar.i((i10 - textLayoutBlock2.textYOffset(this.Z3.textLayoutBlocks, s1Var)) - this.f22143m4, getWidth(), (i11 - textLayoutBlock2.textYOffset(this.Z3.textLayoutBlocks, s1Var)) - this.f22158n4);
                }
            }
        }
        StaticLayout staticLayout = this.A9;
        if (staticLayout != null) {
            float height = (-this.E9) - staticLayout.getHeight();
            ArrayList arrayList2 = this.Id;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList2.get(i14);
                i14++;
                ((ih.k) obj).i(i10 + height, getWidth(), i11 + height);
            }
        }
        if (getMessageObject() != null && getMessageObject().textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = getMessageObject().textLayoutBlocks;
            int size3 = arrayList3.size();
            while (i12 < size3) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i12);
                i12++;
                MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                for (ih.k kVar2 : textLayoutBlock4.spoilers) {
                    kVar2.i((i10 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f22168o0, getWidth(), (i11 - textLayoutBlock4.textYOffset(getMessageObject().textLayoutBlocks, s1Var)) - this.f22168o0);
                }
            }
        }
    }

    public final boolean y0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f22063g9) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition != null) {
                int i10 = groupedMessagePosition.flags;
                if ((i10 & 1) == 0 || (i10 & 8) == 0) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt != this && (childAt instanceof t1)) {
                            t1 t1Var = (t1) childAt;
                            if (t1Var.f22063g9 && t1Var.H == this.H) {
                                int i12 = t1Var.I.flags;
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
            Drawable[] drawableArr = this.f22230s3;
            if (action == 0) {
                if (this.h9.contains(x10, z22)) {
                    if (this.f22273v7.isSent()) {
                        this.f22254u3[1] = 2;
                        this.f22092i9 = true;
                        Drawable drawable2 = drawableArr[1];
                        if (drawable2 != null) {
                            drawable2.setHotspot(x10, z22);
                            drawableArr[1].setState(this.f22301x3);
                        }
                        c3();
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f22092i9) {
                    k1 k1Var = this.Gc;
                    if (k1Var != null) {
                        if (this.Z7) {
                            k1Var.q(this);
                        } else {
                            k1Var.u(this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[1];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.f22092i9 = false;
                    c3();
                    return false;
                }
            } else if (motionEvent.getAction() == 2 && this.f22092i9 && (drawable = drawableArr[1]) != null) {
                drawable.setHotspot(x10, z22);
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
        if (this.Z3 == null) {
            return;
        }
        float f15 = this.f22158n4;
        float f16 = this.f22143m4;
        s1 s1Var = this.Wc;
        if (s1Var.f21910w0) {
            if (s1Var.C0) {
                f15 -= getTranslationY();
                f14 = s1Var.f21843g0;
            } else if (s1Var.f21895s0) {
                float f17 = s1Var.K1;
                float f18 = 1.0f - f17;
                f16 = (f16 * f17) + (s1Var.f21887q0 * f18);
                f15 = (f15 * f17) + (f18 * s1Var.f21891r0);
            } else if (!this.f22273v7.isVoice() || !TextUtils.isEmpty(this.f22273v7.caption)) {
                f14 = s1Var.f21843g0;
            }
            f16 += f14;
        }
        float f19 = f16;
        float f20 = f15;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = null;
        if (s1Var.f21818a1) {
            float f21 = s1Var.K1;
            if (f21 != 1.0f) {
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var.f21822b1;
                if (textLayoutBlocks != null) {
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                } else {
                    arrayList = null;
                }
                org.telegram.ui.Components.q5 q5Var = s1Var.O0;
                float f22 = (1.0f - f21) * f10;
                if (textLayoutBlocks != null) {
                    f12 = textLayoutBlocks.textXOffset;
                } else {
                    f12 = 0.0f;
                }
                z1(f19, f20, canvas, arrayList, q5Var, false, f22, f12, true);
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.Z3;
                if (textLayoutBlocks2 != null) {
                    arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                }
                ArrayList<MessageObject.TextLayoutBlock> arrayList3 = arrayList2;
                org.telegram.ui.Components.q5 q5Var2 = this.f22150mc;
                float f23 = f10 * s1Var.K1;
                if (textLayoutBlocks2 != null) {
                    f13 = textLayoutBlocks2.textXOffset;
                } else {
                    f13 = 0.0f;
                }
                z1(f19, f20, canvas, arrayList3, q5Var2, true, f23, f13, true);
                return;
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.Z3;
        if (textLayoutBlocks3 != null) {
            arrayList2 = textLayoutBlocks3.textLayoutBlocks;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = arrayList2;
        org.telegram.ui.Components.q5 q5Var3 = this.f22150mc;
        if (textLayoutBlocks3 != null) {
            f11 = textLayoutBlocks3.textXOffset;
        } else {
            f11 = 0.0f;
        }
        z1(f19, f20, canvas, arrayList4, q5Var3, true, f10, f11, true);
    }

    public final org.telegram.ui.ActionBar.g5 y2(boolean z4) {
        boolean z10;
        if (z4) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.I;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.H.isDocuments && !this.G) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f22273v7.isOutOwner()) {
                if (!this.f22077h8 && !this.G && !z10) {
                    this.f22205q8 = (org.telegram.ui.ActionBar.g5) L2("drawableMsgOut");
                } else {
                    this.f22205q8 = (org.telegram.ui.ActionBar.g5) L2("drawableMsgOutMedia");
                }
            } else if (!this.f22077h8 && !this.G && !z10) {
                this.f22205q8 = (org.telegram.ui.ActionBar.g5) L2("drawableMsgIn");
            } else {
                this.f22205q8 = (org.telegram.ui.ActionBar.g5) L2("drawableMsgInMedia");
            }
        }
        this.f22205q8.f();
        return this.f22205q8;
    }

    public final float y3() {
        float f10;
        s1 s1Var = this.Wc;
        float f11 = 1.0f;
        if (s1Var.F1) {
            boolean z4 = this.f22213r1;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z4) {
                f11 = 0.0f;
            }
            return AndroidUtilities.lerp(f10, f11, s1Var.K1);
        } else if (this.f22213r1) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    public void y4() {
        int i10;
        MessageObject messageObject = this.f22273v7;
        if (messageObject == null) {
            return;
        }
        float f10 = this.f22280ve + this.f22296we;
        if (!messageObject.isOutOwner() || this.f22273v7.hasWideCode) {
            f10 += this.f22155n1;
        }
        if (this.C8 && !this.f22273v7.isOutOwner() && this.I != null) {
            if (z3()) {
                i10 = 48;
            } else {
                i10 = 0;
            }
            f10 += AndroidUtilities.dp(71 - i10) * this.E8;
        }
        setTranslationX(f10);
    }

    public final boolean z0(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.f22273v7.type == 12) {
            int x10 = (int) motionEvent.getX();
            int z22 = (int) z2(motionEvent);
            int action = motionEvent.getAction();
            Drawable[] drawableArr = this.f22230s3;
            if (action == 0) {
                ArrayList arrayList = this.U2;
                int[] iArr = this.f22301x3;
                if (arrayList != null && arrayList.size() > 1) {
                    for (int i10 = 0; i10 < this.U2.size(); i10++) {
                        l1 l1Var = (l1) this.U2.get(i10);
                        float f10 = x10;
                        float f11 = z22;
                        if (l1Var.e.contains(f10, f11)) {
                            if (l1Var.f21329f == null) {
                                l1Var.f21329f = new rc(this);
                            }
                            l1Var.f21329f.c(true);
                            z zVar = l1Var.f21330g;
                            if (zVar != null) {
                                zVar.setHotspot(f10, f11);
                                l1Var.f21330g.setState(iArr);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
                float f12 = x10;
                float f13 = z22;
                if (this.V2.contains(f12, f13)) {
                    this.W2 = true;
                    this.f22236sc.c(true);
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setHotspot(f12, f13);
                        drawableArr[0].setState(iArr);
                    }
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W2) {
                    if (this.Gc != null) {
                        ArrayList arrayList2 = this.U2;
                        if (arrayList2 != null && arrayList2.size() == 1) {
                            this.Gc.R0(((l1) this.U2.get(0)).f21326a, this);
                        } else {
                            this.Gc.R0(5, this);
                        }
                    }
                    playSoundEffect(0);
                    Drawable drawable3 = drawableArr[0];
                    if (drawable3 != null) {
                        drawable3.setState(StateSet.NOTHING);
                    }
                    this.W2 = false;
                    this.f22236sc.c(false);
                    invalidate();
                    return false;
                }
                ArrayList arrayList3 = this.U2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i11 = 0; i11 < this.U2.size(); i11++) {
                        l1 l1Var2 = (l1) this.U2.get(i11);
                        rc rcVar = l1Var2.f21329f;
                        if (rcVar != null && rcVar.h) {
                            k1 k1Var = this.Gc;
                            if (k1Var != null) {
                                k1Var.R0(l1Var2.f21326a, this);
                            }
                            z zVar2 = l1Var2.f21330g;
                            if (zVar2 != null) {
                                zVar2.setState(StateSet.NOTHING);
                            }
                            l1Var2.f21329f.c(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.W2 && (drawable = drawableArr[0]) != null) {
                    drawable.setHotspot(x10, z22);
                    return false;
                }
                ArrayList arrayList4 = this.U2;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= this.U2.size()) {
                            break;
                        }
                        l1 l1Var3 = (l1) this.U2.get(i12);
                        rc rcVar2 = l1Var3.f21329f;
                        if (rcVar2 != null && rcVar2.h) {
                            z zVar3 = l1Var3.f21330g;
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

    public final void z1(float r24, float r25, android.graphics.Canvas r26, java.util.ArrayList r27, org.telegram.ui.Components.q5 r28, boolean r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.z1(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.q5, boolean, float, float, boolean):void");
    }

    public final float z2(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.S) - this.f21996c0) - this.f22025e0;
    }

    public final boolean z3() {
        MessageObject messageObject;
        if (!this.K7 || this.N7 || ((this.f22147m8 && !this.Q7) || (messageObject = this.f22273v7) == null || messageObject.isOutOwner() || !this.f22273v7.needDrawAvatar())) {
            MessageObject messageObject2 = this.f22273v7;
            if (messageObject2 == null || messageObject2.getDialogId() != 489000) {
                MessageObject messageObject3 = this.f22273v7;
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

    public t1(Context context, int i10, boolean z4, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f22281w = new o2.o(6);
        nr nrVar = nr.h;
        this.f22313y = new xd.a(0, this, nrVar, 380L, false);
        this.K = new mg.r0(this);
        this.L = new jg.a(this);
        this.M = new jg.c(this);
        this.f22314y0 = new Rect();
        this.C0 = -1;
        this.D0 = -1;
        this.O0 = new int[4];
        this.T2 = 0;
        this.f22043f3 = 45;
        this.f22230s3 = new Drawable[2];
        this.f22242t3 = new n1[2];
        this.f22254u3 = new int[2];
        this.f22269v3 = new RectF();
        this.f22301x3 = new int[]{16842910, 16842919};
        this.W3 = -1;
        this.X3 = -1;
        this.Y4 = new RectF();
        this.Z4 = new RectF();
        this.f22074h5 = -1;
        this.f22102j5 = 1.0f;
        this.f22116k5 = 1.0f;
        this.f22232s5 = -1;
        this.f22244t5 = new b90(this);
        this.f22287w5 = new ArrayList();
        this.f22303x5 = new ArrayList();
        this.B5 = new Path();
        this.U5 = new ArrayList();
        this.V5 = new ArrayList();
        this.f22046f6 = -1;
        this.f22060g6 = -1;
        this.f22089i6 = true;
        this.K6 = -1;
        this.f22132l7 = new ArrayList();
        new Path();
        this.f22146m7 = new HashMap();
        this.f22161n7 = new HashMap();
        this.H7 = -1;
        this.f22091i8 = true;
        this.f22162n8 = true;
        this.G8 = 100;
        this.h9 = new Rect();
        this.B9 = new AtomicReference();
        this.Na = new RectF();
        this.f22006cb = new StaticLayout[2];
        this.f22094ib = new float[2];
        this.f22223rb = true;
        this.f22277vb = new Path();
        this.f22293wb = new float[8];
        this.Gb = 1.0f;
        this.Nb = new Path();
        this.Ob = new float[8];
        this.f22326yc = new RectF();
        this.f22338zc = new RectF();
        this.Uc = Build.VERSION.SDK_INT == 28;
        this.Vc = 1.0f;
        this.Wc = new s1(this);
        this.f21979ad = new org.telegram.ui.Components.z5(this, 200L, nr.f27347g);
        this.f22023dd = new c1(0, this);
        this.f22138ld = new c1(1, this);
        this.f22151md = new SparseArray();
        this.Ad = -1;
        this.Cd = new m.f3();
        this.Id = new ArrayList();
        this.Jd = new Stack();
        this.Kd = new Path();
        this.Nd = new a1(2, this);
        this.Od = new a1(3, this);
        this.Rd = false;
        this.Ud = -1L;
        this.f22053fe = false;
        this.f22068ge = new a1(10, this);
        this.f22181oe = true;
        this.f22238se = 1.0f;
        this.f22312xe = new b1(Float.class, "animationOffsetX", 0);
        this.F7 = i10;
        this.Fd = f6Var;
        this.Gd = z4;
        this.Hd = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.Hd = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        ?? drawable = new Drawable();
        drawable.f28425a = new Paint(1);
        drawable.f28426b = null;
        drawable.h = -1.0f;
        drawable.f28430i = -1.0f;
        drawable.f28431j = -1.0f;
        drawable.f28432k = -1.0f;
        drawable.f28434m = this;
        this.Hc = drawable;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f22106j9 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f22120k9 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.C9 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.f22177o9 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.E7 = DownloadController.getInstance(i10).generateObserverTag();
        this.S0 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        nh.y2 y2Var = new nh.y2(this, this, 1);
        this.P0 = y2Var;
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.setUseRoundForThumbDrawable(true);
        y2Var.setDelegate(this);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.Q0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.L0 = new RadialProgress2(this, f6Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.M0 = radialProgress2;
        radialProgress2.B = false;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(15.0f));
        d1 d1Var = new d1(this, this);
        this.D5 = d1Var;
        d1Var.h = this;
        ?? obj = new Object();
        obj.f27083a = 0;
        obj.f27084b = 0;
        obj.e = false;
        obj.f27086f = false;
        obj.f27098s = 1.0f;
        obj.f27099t = 1.0f;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(125L, 600L, nrVar);
        obj.v = z5Var;
        obj.f27101w = 1.0f;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(150L, nr.f27346f);
        obj.B = z5Var2;
        obj.J = false;
        if (mo0.N == null) {
            mo0.N = new Paint(1);
            mo0.O = new Paint(1);
            Paint paint = mo0.N;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            mo0.O.setStyle(style);
        }
        this.E5 = obj;
        obj.f27090k = this;
        obj.f27093n = this;
        z5Var2.f31239a = this;
        z5Var.f31239a = this;
        this.F5 = new e1(this);
        ?? drawable2 = new Drawable();
        drawable2.f24605a = 0L;
        drawable2.f24606b = false;
        drawable2.f24607c = new Paint(1);
        drawable2.d = 0.47f;
        drawable2.e = 0.0f;
        drawable2.f24608f = 0.32f;
        drawable2.f24609g = 1;
        drawable2.h = 1;
        drawable2.f24610i = 1;
        drawable2.f24614m = 255;
        drawable2.f24615n = f6Var;
        drawable2.f24611j = this;
        this.P3 = drawable2;
        setImportantForAccessibility(1);
    }

    public void setBackgroundTopY(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g5 g5Var = this.f22205q8;
        int i13 = this.G0;
        int i14 = this.H0;
        if (i14 == 0) {
            i13 = getParentWidth();
            i14 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i12 = view.getMeasuredWidth();
                i11 = view.getMeasuredHeight();
                float f10 = this.I0;
                g5Var.o((int) (i10 + f10), i12, i11, (int) f10, this.Rc, this.Sc, this.B, (this.C && this.Wc.f21922z0 == 1.0f) ? false : true);
                g5Var.f19731u = S2();
            }
        }
        i11 = i14;
        i12 = i13;
        float f102 = this.I0;
        g5Var.o((int) (i10 + f102), i12, i11, (int) f102, this.Rc, this.Sc, this.B, (this.C && this.Wc.f21922z0 == 1.0f) ? false : true);
        g5Var.f19731u = S2();
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        k1 k1Var;
        if (this.f22273v7 == null) {
            return;
        }
        Runnable runnable = this.f22082he;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.f22096ie;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i10, i11, i12, i13);
        if (this.G7 && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i10, ((int) getY()) + i11, ((int) getX()) + i12, ((int) getY()) + i13);
        }
        if (!this.Ld || (k1Var = this.Gc) == null) {
            return;
        }
        k1Var.o();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
